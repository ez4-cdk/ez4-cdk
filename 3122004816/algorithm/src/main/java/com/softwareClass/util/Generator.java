package com.softwareClass.util;

import com.softwareClass.entity.Expression;
import com.softwareClass.entity.Fraction;

import java.util.*;

public class Generator {

    public List<Integer> generateOperators(){
        int randomArea = 3;
        List<Integer> list = new ArrayList<>();
        int operatorsCount = random.nextInt(3)+1;
        for(int i=0; i<operatorsCount; i++){
            list.add(random.nextInt(randomArea));
            if (list.contains(3)){
                randomArea = 2;
            }
        }
        return list;
    }
    /**
     * 参数 0 加
     * 参数 1 减
     * 参数 2 乘
     * 参数 3 除
     * 参数 A'B/C 真分数格式
     */

    //随机种子
    private static final Random random = new Random();

    //生成操作数
    public List<Fraction> generateNumber(int count, int area, List<Integer> operators) {
        List<Fraction> numbers = new ArrayList<>();
        try {

            //循环生成数量为count的分数集合
            while (numbers.size() < count) {
                int denominator = random.nextInt(area-3) + 3;
                int numerator = random.nextInt((area - 1) * denominator) + 1;
                Fraction fraction = new Fraction(numerator, denominator);
                numbers.add(fraction);
            }

            //排序
            sort(numbers);

            //对于除法，选择生成一个比前一个更大的分数
            for (int i = 0; i < operators.size(); i++) {
                if (operators.get(i) == 3) {
                    numbers.set(i+1,numbers.get(i).generateABiggerFraction());
                }
            }

        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("随机种子初始化失败，请重试.");
        }
        return numbers;
    }

    //排序(降序)
    private void sort(List<Fraction> numbers) {
        numbers.sort((f1, f2) -> {
            int value1 = f1.getNum();
            int value2 = f2.getNum();
            return Integer.compare(value2, value1);
        });
    }

    //主生成函数——生成表达式集合
    public List<Expression> generateExpressions(int num,int area) {
        List<Expression> expressions = new ArrayList<>();
        while (expressions.size() < num){
            List<Integer> operators = generateOperators();
            List<Fraction> numbers = generateNumber(operators.size()+1, area,operators);
            Expression e = new Expression(generateExpression(operators,numbers));
            if (Fraction.fromString(e.evaluate()).getNum()>=0){
                expressions.add(e);
            }
        }
        return expressions;
    }
    //生成括号——在特定索引下生成括号，如果索引合法，则返回索引集合，非法则不生成括号
    public List<Integer> generateBracket(int num){
        List<Integer> brackets = new ArrayList<>();
        int leftBracket = random.nextInt(num);
        int rightBracket = random.nextInt(num);
        if (leftBracket<rightBracket&&rightBracket<num){
            brackets.add(leftBracket);
            brackets.add(rightBracket);
            return brackets;
        }else{
            return null;
        }
    }
    //用操作数set和操作符list进行构造表达式
    public String generateExpression(List<Integer> operators, List<Fraction> numbers) {
        List<Fraction> numberList = new ArrayList<>(numbers);
        List<Integer> brackets = generateBracket(numberList.size());
        StringBuilder expressionBuilder = new StringBuilder();
        //类似于e=()这种情况就不用加括号，比如e=(1+2/3)
        if (brackets!=null&&brackets.get(0)==0&&brackets.get(1)==numberList.size()-1){
            brackets = null;
        }
        //每次加入一个分数和一个符号
        for (int i = 0; i < operators.size(); i++) {
            //左括号索引
            if (brackets!=null&&brackets.get(0)==i){
                expressionBuilder.append("(");
            }
            //右括号索引
            expressionBuilder.append(numberList.get(i));
            if (brackets!=null&&brackets.get(1)==i){
                expressionBuilder.append(")");
            }
            expressionBuilder.append(getOperatorSymbol(operators.get(i)));
        }
        //添加最后一个分数
        expressionBuilder.append(numberList.getLast());

        //如果右括号没合上，则合上
        if (brackets!=null&&(brackets.get(1)+1)==numberList.size()){
            expressionBuilder.append(")");
        }
        return expressionBuilder.toString();
    }

    // 辅助方法，用于根据操作符的整数值返回相应的符号
    public String getOperatorSymbol(int operator) {
        return switch (operator) {
            case 0 -> " + ";
            case 1 -> " - ";
            case 2 -> " * ";
            case 3 -> " / ";
            default -> throw new IllegalArgumentException("Invalid operator");
        };
    }



}
