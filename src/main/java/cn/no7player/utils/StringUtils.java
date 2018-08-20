package cn.no7player.utils;

/**
 * Created by tgs on 2018/8/7.
 */
public class StringUtils {

    public static String fetchObjectStr(Object object) {
        //
        return null;
    }

    public static boolean equals(String a, String b) {
        if (a == null) {
            return b == null;
        } else {
            return a.equals(b);
        }

    }

    public static boolean isEmpty(String s) {
        if (s == null) {
            return true;
        }
        if (s.trim().equals("")) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String a = null;
        System.out.println(StringUtils.equals(a, null));
    }
}
