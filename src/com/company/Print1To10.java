package com.company;

public class Print1To10 {
    public static void main(String[] args) {
//        int[] arr = {2,4,6,8,10,12,14,16};
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//        for(int els : arr){
//            System.out.println(els);
//        for(int i = 1; i<=10; i += 2 ){
//            System.out.println(i);
        String i = "*";
        int no = 1;
        while(no<=5){
            System.out.println(i);
            i = i + '*';
            no++;
        }
    }
}
