package com.fredom.fureria.consts;

/**
 * R枚举类
 */
public enum ApiCommonCodeEnum{
    FAIL(1,"调用出错"),
    OK(0,"调用成功"),
    SYS_ERR(-1,"系统异常");
    int code;
    String msg;
    ApiCommonCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}