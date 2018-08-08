package cn.no7player.utils;

import cn.no7player.service.model.result.BaseResult;

/**
 * Created by tangenqing on 18/8/9.
 */
public class ResultUtils {
    public static <T extends BaseResult> T createSuccResult(Class<T> clazz) {
//        T result = clazz.newInstance();
        return null;

    }
//    private static <T extends BaseResult> T createResultObj(Class<T> clazz) {
//        try {
//            return clazz.newInstance();
//        } catch (Exception e) {
//            //todo log
////            throw new ;
//        }
//    }
}
