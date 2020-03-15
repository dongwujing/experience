package com.dw.pattern.strategy;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        String id="1";
        ChannelEnum channelEnum=ChannelEnum.CHANNELB;
        List<InputCompantent> inputs= FormFactory.getInputs(channelEnum,id);

    }
}
