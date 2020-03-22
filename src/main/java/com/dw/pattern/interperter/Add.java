package com.dw.pattern.interperter;

public class Add extends OpInterpreter {
    public Add(IArithmeticInterpreter lef, IArithmeticInterpreter right) {
        super(lef, right);
    }

    @Override
    public int interpret() {
        return lef.interpret()+right.interpret();
    }
}
