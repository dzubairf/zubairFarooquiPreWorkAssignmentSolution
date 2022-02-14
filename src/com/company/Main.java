package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter a number");
        Scanner inputNum = new Scanner(System.in);
        int x = inputNum.nextInt();
        System.out.println(x);
        if (x%2==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
