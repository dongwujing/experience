package com.dw.pattern.interperter;

public class OpInterpreter implements IArithmeticInterpreter {
    protected IArithmeticInterpreter lef;
    protected IArithmeticInterpreter right;

    public OpInterpreter(IArithmeticInterpreter lef, IArithmeticInterpreter right) {
        this.lef = lef;
        this.right = right;
    }

    @Override
    public int interpret() {
        return 0;
    }
}
