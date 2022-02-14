package com.company;

import java.util.Scanner;

public class conbeak {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        for (int i = 1;; i++){
            if(i % 2 != 0){
                continue;
            }
            else if(i>500){
                break;
            }
            else {
                System.out.println(i);
            }
        }
    }
}
