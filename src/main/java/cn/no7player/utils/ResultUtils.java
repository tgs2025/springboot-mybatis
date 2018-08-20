package cn.no7player.utils;

import cn.no7player.exceptions.enums.ErrorCode;
import cn.no7player.exceptions.BaseException;
import cn.no7player.service.model.result.ApiResult;
import cn.no7player.service.model.result.BaseResult;

/**
 * Created by tangenqing on 18/8/9.
 */
public class ResultUtils {

    public static <T extends BaseResult> T createSuccResult(Class<T> clazz) {
        T result = createSuccResult(clazz);
        result.setSuccess(Boolean.TRUE);
        return result;
    }


    public static <T extends BaseResult> T createFailResult(Class<T> clazz) {
        T result = createSuccResult(clazz);
        result.setSuccess(Boolean.FALSE);
        return result;
    }

    public static <T extends BaseResult> T createFailResultByException(Exception e, Class<T> clazz) {
        T result = createSuccResult(clazz);
        result.setSuccess(Boolean.FALSE);
        if (e instanceof BaseException) {
            BaseException baseException = (BaseException) e;
            result.setErrCode(baseException.getErrorCode().getCode());
            result.setErrMsg(baseException.getMsg());
        } else {
            result.setErrCode(ErrorCode.UNKNOWN_ERROR.getCode());
            result.setErrMsg(e.getMessage());
        }
        return result;
    }

    private static <T extends BaseResult> T createResultObj(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            //todo log
            throw new RuntimeException("结果创建报错");
        }
    }
}
