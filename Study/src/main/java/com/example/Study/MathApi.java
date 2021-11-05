package com.example.Study;

public class MathApi {

    public static void main(String[]args){

        /*round() 반올림 -> int형*/
        Math.round(1.2);
        Math.round(1.5);//2
        Math.round(1.7);
        Math.round(1);
        Math.round(-1.2);//-1
        Math.round(-1.5);//-1
        Math.round(-1.7);//-2
        System.out.println();
        /*ceil() 올림 -> double형*/
        Math.ceil(1.2);//2.0
        Math.ceil(1.5);//2.0
        Math.ceil(1.7);//2.0
        Math.ceil(1);//1.0
        Math.ceil(-1.2);//-1.0
        Math.ceil(-1.5);
        Math.ceil(-1.7);

        /*floor() 내림 -> double형*/
        Math.floor(1.2);//1.0
        Math.floor(1.5);
        Math.floor(1.7);
        Math.floor(1);
        Math.floor(-1.2);//-2.0
        Math.floor(-1.5);
        Math.floor(-1.7);

        /*abs() 절대값 -> 기존의 자료형*/

        Math.abs(-1.2);//1.2
        Math.abs(-2);//2

        /*pow 제곱*/
        Math.pow(2.0,3.0);
        Math.pow(2.0,3);
        Math.pow(2,3);
        System.out.println(Math.pow(2.0,3.0));
        System.out.println(Math.pow(2.0,3));
        System.out.println(Math.pow(2,3));
        System.out.println((int)Math.pow(2,3));

        /*sqrt*/
        Math.sqrt(4.0);
        Math.sqrt(4);
        System.out.println(Math.sqrt(4.0));
        System.out.println(Math.sqrt(4));
        /*min max*/
        Math.min(2,4);
        Math.max(2,4);
        Math.min(2,4.0);
        Math.max(2.0,4);
        System.out.println(Math.min(2,4));
        System.out.println(Math.min(2,4.0));
        System.out.println(Math.max(2.0,4));
        System.out.println(Math.max(2,4));
        /*random*/
        double a = Math.random() * 10;//0~9.0
        int ai = (int)Math.random() * 10;//0~9
        double b = Math.random()*11;//0~10.0
        int bi = (int)Math.random()*11;//0~10
        char c = (char)((int)Math.random()*26+'a');//0~25+a->char반환 아스키코드상 a와 z가 25차이가 남
        System.out.println(a);
        System.out.println(ai);
        System.out.println(b);
        System.out.println(bi);
        System.out.println(c);

    }
}
