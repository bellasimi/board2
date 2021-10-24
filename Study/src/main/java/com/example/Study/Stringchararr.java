package com.example.Study;

import org.springframework.util.StopWatch;

import java.util.Arrays;

public class Stringchararr {
    public static void main(String[]args){
        String str = "a,b,c 공부";
        char [] chararr = str.toCharArray();
        String []strarr =str.split(","); //해당 변수를 기준으로 문자열을 쪼개 배열에담아줌
        //여기서 자료형은 String []
        String plus ="화이팅";
        StringBuilder sb = new StringBuilder("a,b,c 공부"); //생성자함수의 변수로 String 값을 넣어줌
        StopWatch stopWatch = new StopWatch();

        /*문자열 추가시 String +와 StringBuilder append() 속도 비교 */
        stopWatch.start();
        for(int i=0;i<1000;i++){
            str += plus;
        }
        stopWatch.stop();

        System.out.println("+ 수행시간: "+stopWatch.prettyPrint());


        stopWatch.start();

        for(int i=0;i<1000;i++){
            sb.append(plus);
        }

        stopWatch.stop();

        System.out.println("append 수행시간: "+stopWatch.prettyPrint());
        /* 원래 +연산이 append보다 시간이 더걸려애 되는데... 나는 왜
        * 덜 걸린다고 나오는 걸까?
        *
        * 그런데, 자바 8버전에선 어짜피 String + 도 StringBuilder를 사용한다고 하네..
        * 그래서 속도가 비슷한거였나.*/
        System.out.println("-------------------함수 리턴----------------------");
        System.out.println(Arrays.toString(strarr));
        System.out.println(str);
        System.out.println(Arrays.toString(chararr));
    }

    /*참고
    *
    *
    * https://velog.io/@gillog/String-Class%EC%99%80-%EC%84%B1%EB%8A%A5-%EC%9D%B4%EC%8A%88-String-%EC%A0%9C%EB%8C%80%EB%A1%9C-%EC%82%AC%EC%9A%A9%ED%95%98%EA%B8%B0*/

}
