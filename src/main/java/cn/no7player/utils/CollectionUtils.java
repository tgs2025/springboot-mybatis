package cn.no7player.utils;

import java.util.Collection;

/**
 * Created by tangenqing on 18/8/20.
 */
public class CollectionUtils {

    public static boolean isEmpty(Collection c) {
        return  c == null || c.size() == 0;
    }
}
