package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class LOG {
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static int LOGLEVEL = 0;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    static {
            r0 = 6
            org.apache.cordova.LOG.LOGLEVEL = r0
            return
    }

    public LOG() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void d(java.lang.String r2, java.lang.String r3) {
            r0 = 3
            int r1 = org.apache.cordova.LOG.LOGLEVEL
            if (r0 < r1) goto L8
            android.util.Log.d(r2, r3)
        L8:
            return
    }

    public static void d(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r0 = 3
            int r1 = org.apache.cordova.LOG.LOGLEVEL
            if (r0 < r1) goto L8
            android.util.Log.d(r2, r3, r4)
        L8:
            return
    }

    public static void d(java.lang.String r2, java.lang.String r3, java.lang.Object... r4) {
            r0 = 3
            int r1 = org.apache.cordova.LOG.LOGLEVEL
            if (r0 < r1) goto Lc
            java.lang.String r0 = java.lang.String.format(r3, r4)
            android.util.Log.d(r2, r0)
        Lc:
            return
    }

    public static void e(java.lang.String r2, java.lang.String r3) {
            r0 = 6
            int r1 = org.apache.cordova.LOG.LOGLEVEL
            if (r0 < r1) goto L8
            android.util.Log.e(r2, r3)
        L8:
            return
    }

    public static void e(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r0 = 6
            int r1 = org.apache.cordova.LOG.LOGLEVEL
            if (r0 < r1) goto L8
            android.util.Log.e(r2, r3, r4)
        L8:
            return
    }

    public static void e(java.lang.String r2, java.lang.String r3, java.lang.Object... r4) {
            r0 = 6
            int r1 = org.apache.cordova.LOG.LOGLEVEL
            if (r0 < r1) goto Lc
            java.lang.String r0 = java.lang.String.format(r3, r4)
            android.util.Log.e(r2, r0)
        Lc:
            return
    }

    public static void i(java.lang.String r2, java.lang.String r3) {
            r0 = 4
            int r1 = org.apache.cordova.LOG.LOGLEVEL
            if (r0 < r1) goto L8
            android.util.Log.i(r2, r3)
        L8:
            return
    }

    public static void i(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r0 = 4
            int r1 = org.apache.cordova.LOG.LOGLEVEL
            if (r0 < r1) goto L8
            android.util.Log.i(r2, r3, r4)
        L8:
            return
    }

    public static void i(java.lang.String r2, java.lang.String r3, java.lang.Object... r4) {
            r0 = 4
            int r1 = org.apache.cordova.LOG.LOGLEVEL
            if (r0 < r1) goto Lc
            java.lang.String r0 = java.lang.String.format(r3, r4)
            android.util.Log.i(r2, r0)
        Lc:
            return
    }

    public static boolean isLoggable(int r1) {
            int r0 = org.apache.cordova.LOG.LOGLEVEL
            if (r1 < r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public static void setLogLevel(int r2) {
            org.apache.cordova.LOG.LOGLEVEL = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Changing log level to "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CordovaLog"
            android.util.Log.i(r1, r0)
            return
    }

    public static void setLogLevel(java.lang.String r2) {
            java.lang.String r0 = "VERBOSE"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lc
            r0 = 2
            org.apache.cordova.LOG.LOGLEVEL = r0
            goto L3b
        Lc:
            java.lang.String r0 = "DEBUG"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L18
            r0 = 3
            org.apache.cordova.LOG.LOGLEVEL = r0
            goto L3b
        L18:
            java.lang.String r0 = "INFO"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L24
            r0 = 4
            org.apache.cordova.LOG.LOGLEVEL = r0
            goto L3b
        L24:
            java.lang.String r0 = "WARN"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L30
            r0 = 5
            org.apache.cordova.LOG.LOGLEVEL = r0
            goto L3b
        L30:
            java.lang.String r0 = "ERROR"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L3b
            r0 = 6
            org.apache.cordova.LOG.LOGLEVEL = r0
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Changing log level to "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = org.apache.cordova.LOG.LOGLEVEL
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CordovaLog"
            android.util.Log.i(r1, r0)
            return
    }

    public static void v(java.lang.String r2, java.lang.String r3) {
            r0 = 2
            int r1 = org.apache.cordova.LOG.LOGLEVEL
            if (r0 < r1) goto L8
            android.util.Log.v(r2, r3)
        L8:
            return
    }

    public static void v(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r0 = 2
            int r1 = org.apache.cordova.LOG.LOGLEVEL
            if (r0 < r1) goto L8
            android.util.Log.v(r2, r3, r4)
        L8:
            return
    }

    public static void v(java.lang.String r2, java.lang.String r3, java.lang.Object... r4) {
            r0 = 2
            int r1 = org.apache.cordova.LOG.LOGLEVEL
            if (r0 < r1) goto Lc
            java.lang.String r0 = java.lang.String.format(r3, r4)
            android.util.Log.v(r2, r0)
        Lc:
            return
    }

    public static void w(java.lang.String r2, java.lang.String r3) {
            r0 = 5
            int r1 = org.apache.cordova.LOG.LOGLEVEL
            if (r0 < r1) goto L8
            android.util.Log.w(r2, r3)
        L8:
            return
    }

    public static void w(java.lang.String r2, java.lang.String r3, java.lang.Throwable r4) {
            r0 = 5
            int r1 = org.apache.cordova.LOG.LOGLEVEL
            if (r0 < r1) goto L8
            android.util.Log.w(r2, r3, r4)
        L8:
            return
    }

    public static void w(java.lang.String r2, java.lang.String r3, java.lang.Object... r4) {
            r0 = 5
            int r1 = org.apache.cordova.LOG.LOGLEVEL
            if (r0 < r1) goto Lc
            java.lang.String r0 = java.lang.String.format(r3, r4)
            android.util.Log.w(r2, r0)
        Lc:
            return
    }

    public static void w(java.lang.String r2, java.lang.Throwable r3) {
            r0 = 5
            int r1 = org.apache.cordova.LOG.LOGLEVEL
            if (r0 < r1) goto L8
            android.util.Log.w(r2, r3)
        L8:
            return
    }
}
