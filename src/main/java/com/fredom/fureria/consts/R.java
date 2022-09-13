package com.fredom.fureria.consts;

import lombok.Data;

import java.io.Serializable;

/**
 * 统一返回类
 * @param <T>
 */
@Data
public class R<T> implements Serializable {
    private int code;
    private String msg;
    private T data;
    private R(){
    }

    public static <T> R<T> ok(T data) {
        return fill(data,ApiCommonCodeEnum.OK);
    }

    public static <T> R<T> failed(String msg) {
        return fill( null, ApiCommonCodeEnum.FAIL);
    }

    public static <T> R<T> failed(ApiCommonCodeEnum apiEnum) {
        return fill( null, apiEnum);
    }

    private static <T> R<T> fill(T data, ApiCommonCodeEnum apiEnum) {
        return fill(apiEnum.getCode(),data,apiEnum.getMsg());
    }

    private static <T> R<T> fill(int code,T data,String msg) {
        R R = new R();
        R.setCode(code);
        R.setData(data);
        R.setMsg(msg);
        return R;
    }

}
