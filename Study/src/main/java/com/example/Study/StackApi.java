package com.example.Study;

import java.util.Stack;

public class StackApi {
    public static void main(String[]args){
        String s = "abcd";
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            stack.push(c);
            System.out.println(stack.peek());
        }
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.search('a'));
        System.out.println(stack.search('b'));
        System.out.println(stack.search('c'));
        System.out.println(stack.search('d'));
        System.out.println(stack.empty());
        System.out.println(stack);
    }
}
