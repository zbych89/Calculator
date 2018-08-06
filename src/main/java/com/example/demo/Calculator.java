package com.example.demo;

public class Calculator {
    public double add(double a,double b){
        return a+b;
    }
    public double substract(double a,double b){
        return a-b;
    }
    public static void main(String args[]){
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(12,4.7));
    }
}
