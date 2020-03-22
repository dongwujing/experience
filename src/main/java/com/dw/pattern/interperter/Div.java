package com.dw.pattern.interperter;

public class Div extends OpInterpreter {
    public Div(IArithmeticInterpreter lef, IArithmeticInterpreter right) {
        super(lef, right);
    }

    @Override
    public int interpret() {
        return lef.interpret()/right.interpret();
    }
}
