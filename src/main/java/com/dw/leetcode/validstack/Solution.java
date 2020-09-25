package com.dw.leetcode.validstack;

import java.util.Stack;

public class Solution {
    public  boolean isValid(String s){
        if (s==null || s.length()==0){
            return true;
        }
        Stack<Character> stack=new Stack<>();
        for (char c : s.toCharArray()) {
            if (c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }
            if (c==')'){
                if (stack.isEmpty() || !stack.pop().equals('(')){
                    return false;
                }
            }
            if (c==']'){
                if (stack.isEmpty() || !stack.pop().equals('[')){
                    return false;
                }
            }
            if (c=='}'){
                if (stack.isEmpty()|| !stack.pop().equals('{')){
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}
