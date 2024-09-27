package com.softwareClass.util;

import com.softwareClass.entity.Fraction;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionEvaluator {

    public Fraction evaluate(String expression) {
        String result = calculate(expression);
        return Fraction.fromString(result);
    }

    private String calculate(String expression) {
        if (expression.isEmpty()) {
            return "";
        }
        Pattern pattern = Pattern.compile("\\((.*?)\\)");
        Matcher matcher = pattern.matcher(expression);

        if (matcher.find()) {
            String insideBrackets = matcher.group(1); // 获取括号内的内容
            String calculateInsideBracket = calculate(insideBrackets);
            return calculate(expression.replaceAll("\\(.*?\\)", calculateInsideBracket));
        } else {
            return evaluateExpression(expression).toString();
        }
    }

    private Fraction evaluateExpression(String expression) {
        String[] args = expression.split(" ");
        List<Fraction> fractions = new ArrayList<>();
        List<String> operators = new ArrayList<>();

        // 第一遍扫描，处理乘法和除法
        for (int i = 0; i < args.length; i++) {
            if (i % 2 == 0) { // 偶数索引为分数
                fractions.add(Fraction.fromString(args[i]));
            } else { // 奇数索引为操作符
                String operator = args[i];
                if ("*".equals(operator) || "/".equals(operator)) {
                    Fraction secondFraction = Fraction.fromString(args[++i]);
                    Fraction firstFraction = fractions.remove(fractions.size() - 1);
                    if ("*".equals(operator)) {
                        fractions.add(firstFraction.multiply(secondFraction));
                    } else {
                        fractions.add(firstFraction.divide(secondFraction));
                    }
                } else {
                    operators.add(operator);
                }
            }
        }

        // 第二遍扫描，处理加法和减法
        Fraction result = fractions.get(0);
        for (int j = 0; j < operators.size(); j++) {
            switch (operators.get(j)) {
                case "+" -> result = result.add(fractions.get(j + 1));
                case "-" -> result = result.subtract(fractions.get(j + 1));
                default -> throw new IllegalArgumentException("Invalid operator: " + operators.get(j));
            }
        }
        return result;
    }
}
