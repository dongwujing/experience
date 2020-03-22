package com.dw.pattern.interperter;

public class OpUtil {
    public  static boolean ifOp(String symbol){
        return
                symbol.equalsIgnoreCase("+")
                || symbol.equalsIgnoreCase("-")
                || symbol.equalsIgnoreCase("*")
                || symbol.equalsIgnoreCase("/");
    }

    public static OpInterpreter getInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right, String element) {
        if (element.equalsIgnoreCase("+")){
            return  new Add(left,right);
        }
        else if (element.equalsIgnoreCase("-")){
            return  new Subtract(left,right);
        }
        else if (element.equalsIgnoreCase("*")){
            return  new Multi(left,right);
        }
        else if (element.equalsIgnoreCase("/")){
            return  new Add(left,right);
        }
        return null;
    }
}
