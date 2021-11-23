package com.example.Study;

import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [] arr ={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            int answer = i>0? arr[i]/i:0;
            System.out.println(arr[i]+"/"+i+"="+answer);
        }
    }

}
