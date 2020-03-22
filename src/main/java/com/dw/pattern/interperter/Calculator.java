package com.dw.pattern.interperter;

import java.util.Stack;

/**
 * 计算器
 */
public class Calculator {
    private Stack<IArithmeticInterpreter> stack=new Stack<>();

    public Calculator(String expression) {
        parse(expression);
     }

    void parse(String exp){
        IArithmeticInterpreter left,right;
        String [] elements= exp.split(" ");
        for (int i = 0; i < elements.length; i++) {
            String operator= elements[i];
            if (OpUtil.ifOp(operator)){
                //push stack
                //10
                //+
                //30
                 left= stack.pop();
                 right=new NumInterpreter(Integer.valueOf(elements[++i]));
                 OpInterpreter op= OpUtil.getInterpreter(left,right, operator);
                 stack.push(op);
            }else {
                NumInterpreter numInterpreter=new NumInterpreter(Integer.valueOf(elements[i]));
                stack.push(numInterpreter);
            }
        }

    }

    public  int calculate(){
        return stack.pop().interpret();
    }
}

