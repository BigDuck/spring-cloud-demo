package com.wpj.model;

import org.springframework.http.HttpStatus;

/**
 * web层返回Json数据
 * @author wupj
 */
public class ResponseJson {
    private HttpStatus code;
    private String msg;
    private Object data;

    public ResponseJson() {}
    public ResponseJson(Object data){
        this(HttpStatus.OK, data);
    }
    public ResponseJson(HttpStatus code, Object data) {
        this(code, null, data);
    }
    public ResponseJson(HttpStatus code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public HttpStatus getCode() {
        return code;
    }
    public void setCode(HttpStatus code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}