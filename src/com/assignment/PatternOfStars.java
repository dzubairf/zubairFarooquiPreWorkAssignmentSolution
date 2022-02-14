package com.assignment;

import java.util.Scanner;
public class PatternOfStars {
    public static void main(String[] args) {
//        Scanner given = new Scanner(System.in);
        int g = 5;
        String starPrint = "*";
        for(int i = 0; i <= g; i++){
            for(int j = 0; j <= g; j++){
                starPrint = "*".concat(starPrint);
                g--;
            }
            System.out.println(starPrint);
        }
    }
}
