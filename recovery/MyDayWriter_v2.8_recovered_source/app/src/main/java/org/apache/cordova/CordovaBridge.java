package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class CordovaBridge {
    private static final java.lang.String LOG_TAG = "CordovaBridge";
    private volatile int expectedBridgeSecret;
    private org.apache.cordova.NativeToJsMessageQueue jsMessageQueue;
    private org.apache.cordova.PluginManager pluginManager;

    public CordovaBridge(org.apache.cordova.PluginManager r2, org.apache.cordova.NativeToJsMessageQueue r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.expectedBridgeSecret = r0
            r1.pluginManager = r2
            r1.jsMessageQueue = r3
            return
    }

    private boolean verifySecret(java.lang.String r4, int r5) throws java.lang.IllegalAccessException {
            r3 = this;
            org.apache.cordova.NativeToJsMessageQueue r0 = r3.jsMessageQueue
            boolean r0 = r0.isBridgeEnabled()
            java.lang.String r1 = "CordovaBridge"
            if (r0 != 0) goto L42
            r0 = -1
            if (r5 != r0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r2 = " call made before bridge was enabled."
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            org.apache.cordova.LOG.d(r1, r0)
            goto L40
        L24:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Ignoring "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r2 = " from previous page load."
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            org.apache.cordova.LOG.d(r1, r0)
        L40:
            r0 = 0
            return r0
        L42:
            int r0 = r3.expectedBridgeSecret
            if (r0 < 0) goto L4c
            int r0 = r3.expectedBridgeSecret
            if (r5 != r0) goto L4c
            r0 = 1
            return r0
        L4c:
            java.lang.String r0 = "Bridge access attempt with wrong secret token, possibly from malicious code. Disabling exec() bridge!"
            org.apache.cordova.LOG.e(r1, r0)
            r3.clearBridgeSecret()
            java.lang.IllegalAccessException r0 = new java.lang.IllegalAccessException
            r0.<init>()
            throw r0
    }

    void clearBridgeSecret() {
            r1 = this;
            r0 = -1
            r1.expectedBridgeSecret = r0
            return
    }

    int generateBridgeSecret() {
            r2 = this;
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r0.nextInt(r1)
            r2.expectedBridgeSecret = r1
            int r1 = r2.expectedBridgeSecret
            return r1
    }

    public boolean isSecretEstablished() {
            r2 = this;
            int r0 = r2.expectedBridgeSecret
            r1 = -1
            if (r0 == r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public java.lang.String jsExec(int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) throws org.json.JSONException, java.lang.IllegalAccessException {
            r4 = this;
            java.lang.String r0 = "exec()"
            boolean r0 = r4.verifySecret(r0, r5)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            if (r9 != 0) goto Lf
            java.lang.String r0 = "@Null arguments."
            return r0
        Lf:
            org.apache.cordova.NativeToJsMessageQueue r0 = r4.jsMessageQueue
            r1 = 1
            r0.setPaused(r1)
            r0 = 0
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            org.apache.cordova.CordovaResourceApi.jsThread = r1     // Catch: java.lang.Throwable -> L2f
            org.apache.cordova.PluginManager r1 = r4.pluginManager     // Catch: java.lang.Throwable -> L2f
            r1.exec(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            org.apache.cordova.NativeToJsMessageQueue r2 = r4.jsMessageQueue     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = r2.popAndEncode(r0)     // Catch: java.lang.Throwable -> L2f
            org.apache.cordova.NativeToJsMessageQueue r1 = r4.jsMessageQueue
            r1.setPaused(r0)
            return r2
        L2f:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = ""
            org.apache.cordova.NativeToJsMessageQueue r3 = r4.jsMessageQueue
            r3.setPaused(r0)
            return r2
        L3b:
            r1 = move-exception
            org.apache.cordova.NativeToJsMessageQueue r2 = r4.jsMessageQueue
            r2.setPaused(r0)
            throw r1
    }

    public java.lang.String jsRetrieveJsMessages(int r2, boolean r3) throws java.lang.IllegalAccessException {
            r1 = this;
            java.lang.String r0 = "retrieveJsMessages()"
            boolean r0 = r1.verifySecret(r0, r2)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            org.apache.cordova.NativeToJsMessageQueue r0 = r1.jsMessageQueue
            java.lang.String r0 = r0.popAndEncode(r3)
            return r0
    }

    public void jsSetNativeToJsBridgeMode(int r2, int r3) throws java.lang.IllegalAccessException {
            r1 = this;
            java.lang.String r0 = "setNativeToJsBridgeMode()"
            boolean r0 = r1.verifySecret(r0, r2)
            if (r0 != 0) goto L9
            return
        L9:
            org.apache.cordova.NativeToJsMessageQueue r0 = r1.jsMessageQueue
            r0.setBridgeMode(r3)
            return
    }

    public java.lang.String promptOnJsPrompt(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r9 = this;
            java.lang.String r1 = ""
            if (r12 == 0) goto L4d
            java.lang.String r0 = "gap:"
            boolean r0 = r12.startsWith(r0)
            if (r0 == 0) goto L4d
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.IllegalAccessException -> L3c org.json.JSONException -> L44
            r2 = 4
            java.lang.String r2 = r12.substring(r2)     // Catch: java.lang.IllegalAccessException -> L3c org.json.JSONException -> L44
            r0.<init>(r2)     // Catch: java.lang.IllegalAccessException -> L3c org.json.JSONException -> L44
            r2 = 0
            int r2 = r0.getInt(r2)     // Catch: java.lang.IllegalAccessException -> L3c org.json.JSONException -> L44
            r4 = r2
            r2 = 1
            java.lang.String r5 = r0.getString(r2)     // Catch: java.lang.IllegalAccessException -> L3c org.json.JSONException -> L44
            r2 = 2
            java.lang.String r6 = r0.getString(r2)     // Catch: java.lang.IllegalAccessException -> L3c org.json.JSONException -> L44
            r2 = 3
            java.lang.String r7 = r0.getString(r2)     // Catch: java.lang.IllegalAccessException -> L3c org.json.JSONException -> L44
            r3 = r9
            r8 = r11
            java.lang.String r11 = r3.jsExec(r4, r5, r6, r7, r8)     // Catch: java.lang.IllegalAccessException -> L36 org.json.JSONException -> L39
            if (r11 != 0) goto L34
            goto L35
        L34:
            r1 = r11
        L35:
            return r1
        L36:
            r0 = move-exception
            r11 = r0
            goto L40
        L39:
            r0 = move-exception
            r11 = r0
            goto L48
        L3c:
            r0 = move-exception
            r3 = r9
            r8 = r11
            r11 = r0
        L40:
            r11.printStackTrace()
            goto L4c
        L44:
            r0 = move-exception
            r3 = r9
            r8 = r11
            r11 = r0
        L48:
            r11.printStackTrace()
        L4c:
            return r1
        L4d:
            r3 = r9
            r8 = r11
            if (r12 == 0) goto L78
            java.lang.String r11 = "gap_bridge_mode:"
            boolean r11 = r12.startsWith(r11)
            if (r11 == 0) goto L78
            r11 = 16
            java.lang.String r11 = r12.substring(r11)     // Catch: java.lang.IllegalAccessException -> L6b java.lang.NumberFormatException -> L71
            int r11 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.IllegalAccessException -> L6b java.lang.NumberFormatException -> L71
            int r0 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.IllegalAccessException -> L6b java.lang.NumberFormatException -> L71
            r9.jsSetNativeToJsBridgeMode(r11, r0)     // Catch: java.lang.IllegalAccessException -> L6b java.lang.NumberFormatException -> L71
            goto L76
        L6b:
            r0 = move-exception
            r11 = r0
            r11.printStackTrace()
            goto L77
        L71:
            r0 = move-exception
            r11 = r0
            r11.printStackTrace()
        L76:
        L77:
            return r1
        L78:
            r11 = 9
            if (r12 == 0) goto La0
            java.lang.String r0 = "gap_poll:"
            boolean r0 = r12.startsWith(r0)
            if (r0 == 0) goto La0
            java.lang.String r11 = r12.substring(r11)
            int r11 = java.lang.Integer.parseInt(r11)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r8)     // Catch: java.lang.IllegalAccessException -> L9b
            java.lang.String r0 = r9.jsRetrieveJsMessages(r11, r0)     // Catch: java.lang.IllegalAccessException -> L9b
            if (r0 != 0) goto L99
            goto L9a
        L99:
            r1 = r0
        L9a:
            return r1
        L9b:
            r0 = move-exception
            r0.printStackTrace()
            return r1
        La0:
            if (r12 == 0) goto Lee
            java.lang.String r0 = "gap_init:"
            boolean r0 = r12.startsWith(r0)
            if (r0 == 0) goto Lee
            org.apache.cordova.PluginManager r0 = r3.pluginManager
            boolean r0 = r0.shouldAllowBridgeAccess(r10)
            if (r0 == 0) goto Ld5
            java.lang.String r11 = r12.substring(r11)
            int r11 = java.lang.Integer.parseInt(r11)
            org.apache.cordova.NativeToJsMessageQueue r0 = r3.jsMessageQueue
            r0.setBridgeMode(r11)
            int r0 = r9.generateBridgeSecret()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            return r1
        Ld5:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "gap_init called from restricted origin: "
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.StringBuilder r11 = r11.append(r10)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "CordovaBridge"
            org.apache.cordova.LOG.e(r0, r11)
            return r1
        Lee:
            r11 = 0
            return r11
    }

    public void reset() {
            r1 = this;
            org.apache.cordova.NativeToJsMessageQueue r0 = r1.jsMessageQueue
            r0.reset()
            r1.clearBridgeSecret()
            return
    }
}
