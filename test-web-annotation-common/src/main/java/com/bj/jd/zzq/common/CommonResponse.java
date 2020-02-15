package com.bj.jd.zzq.common;

import java.io.Serializable;

/**
 * 请填写类的描述
 *
 * @author zhaozhiqiang35
 * @date 2020-02-15 21:10
 */
public class CommonResponse<T> implements Serializable {
    private int code;
    private String msg;
    private T body;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }


    public CommonResponse buildSuccess(T body) {
        this.body = body;
        this.code = 0;
        this.msg = "成功";
        return this;
    }
}
