package com.ly.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {
    //多个枚举间用逗号隔开，最后一个枚举用分号
    PRICE_CANT_BE_NULL(400, "价格不能为空")
    ;
    private int code;
    private String msg;
}
