package com.softwareClass.entity;

import com.softwareClass.util.ExpressionEvaluator;

public class Expression {
    private final String expression;

    public Expression(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public String evaluate() {
        Fraction result = new ExpressionEvaluator().evaluate(expression);
        return result.toString();
    }
}