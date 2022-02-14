package com.company;

public class Project3 {
    public static void main(String[] args) {
        int num1, num2;
        num1 = 10;
        num2 = 20;
        System.out.println("Input a = " + num1 + " and b = " + num2 );
        num2 = num1 + num2;
        num1 = num2 - num1;
        num2 = num2 - num1;
        System.out.println("Output a = " + num1 + " and b = " + num2 );
    }
}
