package com.example.mybankserver;

public class CommonUtil {

    public static String ifNull(String v) {
        return v == null ? "" : v;
    }

    public static int ifNull(Integer v) {
        return v == null ? 0 : v;
    }

    public static long ifNull(Long v) {
        return v == null ? 0L : v;
    }
}
