package com.dw.pattern.strategy;

import lombok.Data;

import java.util.List;
@Data
public class InputCompantent {
    private int idx;
    private String name;
    private String title;
    private String tag;
    private String dataType;
    private String requestUrl;
    private List<OptionComponent> options;
}
