package com.imooc.exception;

/**
 * Created by Jackie on 2018/3/8.
 */
public class GirlException extends RuntimeException {
    private Integer code;

    public GirlException(Integer code,String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
