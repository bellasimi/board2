package com.example.Study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntArray {
    public static void main(String[]args){
        int[] nums = {1,2,3,4,5,6,7};
        String[] ss = {"aa","bb","cc"};

        /*int[] -> List */
        long time1 = System.nanoTime();

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        //boxed()메소드로 박싱을 해줘야 int -> Integer 형태로 변환된다.
        // 그다음 collect()사용해 List형태로 변환
        //List<String> list = Arrays.asList(ss);
        System.out.println(list);

        long time2 = System.nanoTime();
        System.out.println(time2-time1);
        //List <Integer> list2 = new ArrayList<Integer>();
        List<String> list2 = new ArrayList<String>();
        /*for(int i: nums){
            list2.add(i);//이때는 자동 박싱
        }*/
        for(String s:ss){
            list2.add(s);
        }
        long time3 = System.nanoTime();
        System.out.println(time3-time2);

        /*List<Integer> -> int[] */

        long time4 = System.nanoTime();
        int[] arr1 = list.stream().mapToInt(Integer::intValue).toArray();
        //Integer[] arr1 = list.toArray(new Integer[list.size()]);

        System.out.println(Arrays.toString(arr1));
        long time5 = System.nanoTime();
        System.out.println(time5-time4);


        int[] arr2 = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr2[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr2));
        long time6 = System.nanoTime();
        System.out.println(time6-time5);


    }
}
