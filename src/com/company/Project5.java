package com.company;

import java.util.Scanner;

public class Project5 {
    public static void main(String[] args) {
        System.out.println("enter int");
        Scanner num1 = new Scanner(System.in);
        System.out.println("enter float");
        Scanner num2 = new Scanner(System.in);
        System.out.println("enter Char");
        Scanner character = new Scanner(System.in);
        System.out.println("enter bool");
        Scanner bool = new Scanner(System.in);
        System.out.println("enter Str");
        Scanner str = new Scanner(System.in);
        System.out.println("enter double");
        Scanner num3 = new Scanner(System.in);

        System.out.println(num1.nextInt());
        System.out.println(num2.nextFloat());
        System.out.println(character.next());
        System.out.println(bool.nextBoolean());
        System.out.println(str.nextLine());
        System.out.println(num3.nextDouble());

    }
}
