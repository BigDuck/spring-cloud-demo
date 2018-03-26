package com.wpj.model;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * web层返回Json数据
 *
 * @author wupj
 */
public class ResponseJson implements Serializable {
    private static final long serialVersionUID = 1148899209623388688L;
    private HttpStatus code;
    private String msg;
    private Object data;

    public ResponseJson() {
    }

    public ResponseJson(String msg) {
        this(HttpStatus.OK, msg);
    }

    public ResponseJson(HttpStatus code, String msg) {
        this(code, msg, null);
    }
    public ResponseJson(String msg, Object data) {
        this(HttpStatus.OK, msg, data);
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