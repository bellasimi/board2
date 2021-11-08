package com.example.Study;

import java.util.*;
import java.util.stream.Collectors;

public class SetList {
    public static void main(String[]args){
         int[] arr={2,1,3,4,1};
        TreeSet<Integer> ts = new TreeSet<>();
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        long start =0;
        long end =0;

        /*TreeSet : 중복 제거, 정렬  */
         for(int i=0;i<arr.length;i++){
             start = System.nanoTime();
             for(int j=0;j<arr.length;j++){
                 if(i!=j){
                     ts.add(arr[i]+arr[j]);

                 }
             }
             end = System.nanoTime();
         }
        System.out.println("걸린시간 : "+(end-start));//1300
        System.out.println(ts);//[2, 3, 4, 5, 6, 7]

        /* Set : 중복 제거*/

        for(int i=0;i<arr.length;i++){
            start = System.nanoTime();
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    set.add(arr[i]+arr[j]);
                }
            }
            end = System.nanoTime();
        }
        System.out.println("걸린시간 : "+(end-start));//800
        System.out.println(set);//[2, 3, 4, 5, 6, 7]*/

        /* List */

        for(int i=0;i<arr.length;i++){
            start = System.nanoTime();
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    list.add(arr[i]+arr[j]);
                }
            }
            end = System.nanoTime();
        }


        System.out.println("걸린시간 : "+(end-start));//600
        System.out.println(list);//[3, 5, 6, 3, 3, 4, 5, 2, 5, 4, 7, 4, 6, 5, 7, 5, 3, 2, 4, 5]

        /* List를 stream().distinct(), sorted() 사용해 중복제거,정렬*/
        list = list.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(list);//[2, 3, 4, 5, 6, 7]
        //System.out.println("걸린시간 : "+(end-start));//38597200


        /* List를 int[]로 바꾸기 */
        int[] change = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(change));
    }
}
