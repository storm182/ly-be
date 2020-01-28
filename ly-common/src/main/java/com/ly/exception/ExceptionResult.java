package com.ly.exception;

import lombok.Data;

@Data
public class ExceptionResult {

    private int code;
    private String msg;
    private Long time;

    public ExceptionResult(ExceptionEnum exceptionEnum) {
        this.code = exceptionEnum.getCode();
        this.msg = exceptionEnum.getMsg();
        this.time = System.currentTimeMillis();

    }
}
