package com.dw.pattern.strategy;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 表单工厂
 */
public class FormFactory {
    private static Map<ChannelEnum,IFormService> container =new ConcurrentHashMap<>();
    static {
        container.put(ChannelEnum.CHANNELA,new FormForChannelAService());
        container.put(ChannelEnum.CHANNELB,new FormForChannelBService());
        container.put(ChannelEnum.CHANNELC,new FormForChannelCService());
    }
    public static List<InputCompantent> getInputs(ChannelEnum channelEnum,String id){
         if (container.containsKey(channelEnum)){
             return container.get(channelEnum).generate(id);
         }
         return null;
    }
}
