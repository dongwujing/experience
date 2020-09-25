package com.dw.leetcode.queue;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MyQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void  push(int x){
        stack1.push(x);
    }

    public  int pop(){
        if (isEmpty()){
            return -1;
        }
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek(){
        if (isEmpty()){
            return -1;
        }
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
