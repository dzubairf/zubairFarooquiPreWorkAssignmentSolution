package com.company;

public class Project4 {
    public static void main(String[] args) {
        int giveNumber = 6;
        switch (giveNumber){
            case 1:
                System.out.println("neither prime nor composite");
                break;
            case 2:
                System.out.println("no is prime");
                break;
            case 4:
                System.out.println("no is composite");
                break;
            default:
                System.out.println("Some other number");
        }
    }
}
