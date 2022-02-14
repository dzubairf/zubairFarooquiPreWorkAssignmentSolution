package com.company;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Please enter 1st number");
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();
        System.out.println("please enter second number");
        Scanner num2 = new Scanner(System.in);
        int number2 = num2.nextInt();

        System.out.println("Type 1 for addition");
        System.out.println("Type 2 for Substraction");
        System.out.println("Type 3 for Multiplication");
        System.out.println("Type 4 for Division");

        Scanner opt = new Scanner(System.in);
        int option = opt.nextInt();
        switch (option){
            case 1:
                System.out.println(number1 + number2);
                break;
            case 2:
                System.out.println(number1 - number2);
                break;
            case 3:
                System.out.println(number1 * number2);
                break;
            case 4:
                if (number2 != 0){
                    System.out.println(number1 / number2);
                }
                else
                    System.out.println("0 cannot be dvided");
                break;
            default:
                System.out.println("invalid entry");

        }
    }
}
