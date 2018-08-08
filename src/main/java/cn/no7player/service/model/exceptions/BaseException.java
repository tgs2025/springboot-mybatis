package cn.no7player.service.model.exceptions;

import cn.no7player.service.model.enums.ErrorCode;

/**
 * Created by tangenqing on 18/8/9.
 */
public class BaseException  extends RuntimeException{
    private ErrorCode errorCode;
    private String msg;

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
