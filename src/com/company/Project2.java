package com.company;
import java.util.*;

public class Project2 {
    public static void main(String[] args) {
        System.out.println("Shut the 2");
        Scanner inputYear = new Scanner(System.in);
        int newYear = inputYear.nextInt();
        System.out.println(newYear);

        if (newYear % 400 == 0) {
            System.out.println(" Leap Year");
        }
        else if (newYear % 100 == 0) {
            System.out.println(" not a leap year");
        }
        else if (newYear % 4 == 0) {
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
        }
    }
}
