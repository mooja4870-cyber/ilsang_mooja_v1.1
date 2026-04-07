package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class Logger {
    public static final java.lang.String LOG_TAG_CORE = "Capacitor";
    public static com.getcapacitor.CapConfig config;
    private static com.getcapacitor.Logger instance;

    public Logger() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void debug(java.lang.String r1) {
            java.lang.String r0 = "Capacitor"
            debug(r0, r1)
            return
    }

    public static void debug(java.lang.String r1, java.lang.String r2) {
            boolean r0 = shouldLog()
            if (r0 != 0) goto L7
            return
        L7:
            android.util.Log.d(r1, r2)
            return
    }

    public static void error(java.lang.String r2) {
            java.lang.String r0 = "Capacitor"
            r1 = 0
            error(r0, r2, r1)
            return
    }

    public static void error(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            boolean r0 = shouldLog()
            if (r0 != 0) goto L7
            return
        L7:
            android.util.Log.e(r1, r2, r3)
            return
    }

    public static void error(java.lang.String r1, java.lang.Throwable r2) {
            java.lang.String r0 = "Capacitor"
            error(r0, r1, r2)
            return
    }

    private static com.getcapacitor.Logger getInstance() {
            com.getcapacitor.Logger r0 = com.getcapacitor.Logger.instance
            if (r0 != 0) goto Lb
            com.getcapacitor.Logger r0 = new com.getcapacitor.Logger
            r0.<init>()
            com.getcapacitor.Logger.instance = r0
        Lb:
            com.getcapacitor.Logger r0 = com.getcapacitor.Logger.instance
            return r0
    }

    public static void info(java.lang.String r1) {
            java.lang.String r0 = "Capacitor"
            info(r0, r1)
            return
    }

    public static void info(java.lang.String r1, java.lang.String r2) {
            boolean r0 = shouldLog()
            if (r0 != 0) goto L7
            return
        L7:
            android.util.Log.i(r1, r2)
            return
    }

    public static void init(com.getcapacitor.CapConfig r1) {
            com.getcapacitor.Logger r0 = getInstance()
            r0.loadConfig(r1)
            return
    }

    private void loadConfig(com.getcapacitor.CapConfig r1) {
            r0 = this;
            com.getcapacitor.Logger.config = r1
            return
    }

    public static boolean shouldLog() {
            com.getcapacitor.CapConfig r0 = com.getcapacitor.Logger.config
            if (r0 == 0) goto Lf
            com.getcapacitor.CapConfig r0 = com.getcapacitor.Logger.config
            boolean r0 = r0.isLoggingEnabled()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    public static java.lang.String tags(java.lang.String... r2) {
            if (r2 == 0) goto L1f
            int r0 = r2.length
            if (r0 <= 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Capacitor/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.String r1 = android.text.TextUtils.join(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L1f:
            java.lang.String r0 = "Capacitor"
            return r0
    }

    public static void verbose(java.lang.String r1) {
            java.lang.String r0 = "Capacitor"
            verbose(r0, r1)
            return
    }

    public static void verbose(java.lang.String r1, java.lang.String r2) {
            boolean r0 = shouldLog()
            if (r0 != 0) goto L7
            return
        L7:
            android.util.Log.v(r1, r2)
            return
    }

    public static void warn(java.lang.String r1) {
            java.lang.String r0 = "Capacitor"
            warn(r0, r1)
            return
    }

    public static void warn(java.lang.String r1, java.lang.String r2) {
            boolean r0 = shouldLog()
            if (r0 != 0) goto L7
            return
        L7:
            android.util.Log.w(r1, r2)
            return
    }
}
