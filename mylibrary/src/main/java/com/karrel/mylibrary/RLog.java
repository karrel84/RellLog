package com.karrel.mylibrary;

import android.util.Log;

/**
 * Created by Rell on 2017. 8. 9..
 */

public class RLog {
    private static boolean PRINT_ENABLED_LOG = true;
    private static boolean SYSTEM_OUT_MODE = false;

    static final String TAG = "Rell";

    public static void setEnable(boolean enable) {
        PRINT_ENABLED_LOG = enable;
    }

    public static void setSystemMode(boolean isSystemMode) {
        SYSTEM_OUT_MODE = isSystemMode;
    }

    public static final void e() {
        e("e");
    }

    /**
     * Log Level Error
     **/
    public static final void e(String message) {
        if (!PRINT_ENABLED_LOG) return;
        if (SYSTEM_OUT_MODE) {
            System.out.println(buildSystemMsg(message));
        } else {
            Log.e(TAG, buildLogMsg(message));
        }

    }

    public static final void w() {
        w("w");
    }

    /**
     * Log Level Warning
     **/
    public static final void w(String message) {
        if (!PRINT_ENABLED_LOG) return;
        if (SYSTEM_OUT_MODE) {
            System.out.println(buildSystemMsg(message));
        } else {
            Log.w(TAG, buildLogMsg(message));
        }
    }

    public static final void i() {
        i("i");
    }

    /**
     * Log Level Information
     **/
    public static final void i(String message) {
        if (!PRINT_ENABLED_LOG) return;
        if (SYSTEM_OUT_MODE) {
            System.out.println(buildSystemMsg(message));
        } else {
            Log.i(TAG, buildLogMsg(message));
        }
    }

    public static final void d() {
        d("d");
    }

    /**
     * Log Level Debug
     **/
    public static final void d(String message) {
        if (!PRINT_ENABLED_LOG) return;
        if (SYSTEM_OUT_MODE) {
            System.out.println(buildSystemMsg(message));
        } else {
            Log.d(TAG, buildLogMsg(message));
        }
    }

    public static final void v() {
        v("v");
    }

    /**
     * Log Level Verbose
     **/
    public static final void v(String message) {
        if (!PRINT_ENABLED_LOG) return;
        if (SYSTEM_OUT_MODE) {
            System.out.println(buildSystemMsg(message));
        } else {
            Log.v(TAG, buildLogMsg(message));
        }
    }

    private static String buildLogMsg(String message) {
        StackTraceElement ste = Thread.currentThread().getStackTrace()[4];
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(ste.getFileName().replace(".java", ""));
        sb.append("::");
        sb.append(ste.getMethodName());
        sb.append("]");
        sb.append("\n");
        sb.append(message);
        return sb.toString();
    }

    private static String buildSystemMsg(String message) {
        StackTraceElement ste = Thread.currentThread().getStackTrace()[3];
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(ste.getFileName().replace(".java", ""));
        sb.append("::");
        sb.append(ste.getMethodName());
        sb.append("]");
        sb.append("\n");
        sb.append(message);
        return sb.toString();
    }

}
