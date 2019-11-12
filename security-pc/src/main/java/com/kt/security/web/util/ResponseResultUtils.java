package com.kt.security.web.util;

import com.kt.security.web.entity.ResponseResult;
import org.springframework.http.HttpStatus;

/**
 * Created with IntelliJ IDEA.
 * Desc:
 *
 * @author: keen
 * Date: 2019-11-09
 * Time: 10:26
 */
public class ResponseResultUtils {

    public static <T> ResponseResult success(T detail) {
        return success("", detail);
    }

    public static <T> ResponseResult success(String msg, T detail) {
        return new ResponseResult(HttpStatus.OK.value(), msg, detail);
    }

    public static <T> ResponseResult fail(String msg, T detail) {
        return fail(HttpStatus.INTERNAL_SERVER_ERROR.value(), msg, detail);
    }

    public static <T> ResponseResult fail(String msg) {
        return fail(msg, null);
    }

    public static <T> ResponseResult fail(int code, String msg, T detail) {
        return new ResponseResult(code, msg, detail);
    }

    public static ResponseResult fail(int code, String message) {
        return fail(code, message, null);
    }
}
