package com.dw.pattern.decorator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 菜单
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private Integer menuId;
    private String menuName;
    private String path;
    private String icon;
}
