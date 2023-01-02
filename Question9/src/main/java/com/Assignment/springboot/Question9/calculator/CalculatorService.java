package com.Assignment.springboot.Question9.calculator;

import org.springframework.stereotype.Component;


@Component
public class CalculatorService {
    
    public int add(int num1,int num2) {
        return num1+num2;
    }
    public int sub(int num1,int num2) {
        return num1-num2;
    }
    public int mul(int num1,int num2) {
        return num1*num2;
    }
    public int div(int num1,int num2) {
        return num1/num2;
    }
    public int sqrt(int num1,int num2) {
        return (int) Math.pow(num1,num2);
    }
}