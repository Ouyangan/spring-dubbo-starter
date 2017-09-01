package com.model;

/**
 * Created by ouyangan on 2017/9/1.
 */
public enum Code {
    success(10000, "success"),
    fail(20000, "fail");

    private int code;
    private String msg;

    Code(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

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
}
