package com.example.Study;

import java.util.*;

public class OptionalTest {
    public static void main(String[]args) {
        List<String> list = new ArrayList<>();
                list.add("영희");
                list.add("철수");
                list.add("미미");

        System.out.println(list.get(0));
        List<String> NPE = null;
        try{
            System.out.println(NPE.get(0));
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("값이 없다");
        }
            //!= null만 하면 [] 또는 ""일 때 거르지 못하고 NullPointerException오류가 날 수 있다.
            System.out.println(NPE.get(0));

/*
        if(NPE != null && !NPE.isEmpty()) {
            //!= null만 하면 [] 또는 ""일 때 거르지 못하고 NullPointerException오류가 날 수 있다.
            System.out.println(NPE.get(0));
        }else{
            System.out.println("값이 없다");
        }

        String other = Optional.ofNullable(NPE.get(0)).orElse("값이 없다");

        System.out.println(other);



        //첫 학생 이름을 출력하는 null검사코드가 있다면


        try{
            System.out.println(NPE.get(0));
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("값이 없다");
        }
*/


    }


}
