package com.dw.pattern.interperter;

public class Subtract extends OpInterpreter {
    public Subtract(IArithmeticInterpreter lef, IArithmeticInterpreter right) {
        super(lef, right);
    }

    @Override
    public int interpret() {
        return lef.interpret()-right.interpret();
    }
}
