package com.softwareClass.entity;

public class Fraction {
    private int num; // 整数部分
    private int numerator;   // 分子

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    private int denominator; // 分母

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) throw new IllegalArgumentException("分母不能为零");
        this.numerator = numerator;
        this.denominator = denominator;
        simplify(); // 在构造时简化分数
    }

    public Fraction generateABiggerFraction(){
        if (this.num==0&&this.numerator==0)return new Fraction(1,1);
        int thisNumerator = this.num*this.denominator+this.numerator;
        int thisDenominator = this.denominator;
        if (thisDenominator/2 == 0){
            thisDenominator=3;
        }else {
            thisDenominator=thisDenominator/2;
        }
        return new Fraction(thisNumerator,thisDenominator);
    }

    public static Fraction fromString(String str) {
        int denominator,numerator,num=0;
        String[] temp1,temp2;
        if (str.contains("/")){
            if (str.contains("'")){
                temp1 = str.split("'");
                num = Integer.parseInt(temp1[0]);
                temp2 = temp1[1].split("/");
                denominator = Integer.parseInt(temp2[1]);
                numerator = Integer.parseInt(temp2[0]);
                return new Fraction(num*denominator+numerator,denominator);
            }else{
                temp1 = str.split("/");
                denominator = Integer.parseInt(temp1[1]);
                numerator = Integer.parseInt(temp1[0]);
                return new Fraction(+numerator,denominator);
            }
        }else{
            return new Fraction(Integer.parseInt(str),1);
        }
    }

    public Fraction add(Fraction other) {
        int commonDenominator = this.denominator * other.denominator;
        int newNumerator = (this.numerator + this.num * this.denominator) * other.denominator +
                (other.numerator + other.num * other.denominator) * this.denominator;
        return new Fraction(newNumerator, commonDenominator);
    }

    public Fraction subtract(Fraction other) {
        int commonDenominator = this.denominator * other.denominator;
        int newNumerator = (this.numerator + this.num * this.denominator) * other.denominator -
                (other.numerator + other.num * other.denominator) * this.denominator;
        return new Fraction(newNumerator, commonDenominator);
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = (this.numerator + this.num * this.denominator) * (other.numerator + other.num * other.denominator);
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction other) {
        if (other.numerator == 0 && other.num == 0) throw new IllegalArgumentException("不能除以零");
        int newNumerator = (this.numerator + this.num * this.denominator) * other.denominator;
        int newDenominator = this.denominator * (other.numerator + other.num * other.denominator);
        return new Fraction(newNumerator, newDenominator);
    }

    private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator)); // 计算最大公约数

        // 更新整数部分与分子、分母
        this.num = this.numerator/this.denominator;
        this.numerator = this.numerator % this.denominator;
        this.numerator /= gcd;
        this.denominator /= gcd;

        // 确保分母为正
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // 返回绝对值以确保结果为正
    }

    @Override
    public String toString() {
        if (num == 0) {
            if (numerator == 0) {
                return "0"; // 处理0的情况
            } else {
                return numerator + "/" + denominator; // 只返回分数
            }
        } else {
            if (numerator == 0) {
                return String.valueOf(num); // 只返回整数部分
            }
            return num + "'" + numerator + "/" + denominator; // 返回带分数
        }
    }
}
