package com.kt.security.web.entity;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Desc:
 *
 * @author: keen
 * Date: 2019-11-09
 * Time: 10:21
 */
@Data
public class ResponseResult<T> {
    private int code;
    private String message;
    private T detail;

    public ResponseResult(int code) {
        this(code, "");
    }

    public ResponseResult(int code, String message) {
        this(code, message, null);
    }

    public ResponseResult(int code, String message, T detail) {
        this.code = code;
        this.message = message;
        this.detail = detail;
    }

}
