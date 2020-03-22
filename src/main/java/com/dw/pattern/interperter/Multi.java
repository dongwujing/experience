package com.dw.pattern.interperter;

public class Multi extends OpInterpreter {
    public Multi(IArithmeticInterpreter lef, IArithmeticInterpreter right) {
        super(lef, right);
    }

    @Override
    public int interpret() {
        return lef.interpret()*right.interpret();
    }
}
