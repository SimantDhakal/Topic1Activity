package com.simant.topic1activity;

public class CalculationModal {
    public int num1;
    public int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int sum() {
        return num1 + num2;
    }

    public int sub() {
        return num1 - num2;
    }

    public int mul() {
        return num1 * num2;
    }

    public int div() {
        return num1 / num2;
    }

}
