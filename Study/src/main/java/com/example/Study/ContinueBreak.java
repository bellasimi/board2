package com.example.Study;

public class ContinueBreak {
    public static void main(String[]args){
        int[] arr ={1,2,3,4,5,6,7};
        int i=0;

        /* while break
         */


        while(i<arr.length){
            if(arr[i]==4){
                System.out.println("4입니다.");
                break;
            }
            i++;
        }

        /* while continue


        int i = -1
        while(i<arr.length)
        for(i=0;i<arr.length;i++){
            if(arr[i]==4){
                continue;
            }
        }
        */

        /*for continue


        for(i=0;i<arr.length;i++){
            if(arr[i]==4){
                System.out.println("4입니다.");
                continue;
            }
            if(arr[i]==5){
                System.out.println("5입니다.");
                break; //여기까지만 돌아아
            }
        }
         */
        System.out.println(i);

        /* continue 홀수구하기


        for(int i=1;i<7;i++){
        if(i%2==0){
            continue;
        }
        System.out.println(i);
        } */


    }
}
