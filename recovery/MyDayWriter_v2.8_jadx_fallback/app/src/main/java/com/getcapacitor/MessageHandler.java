package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class MessageHandler {
    private com.getcapacitor.Bridge bridge;
    private org.apache.cordova.PluginManager cordovaPluginManager;
    private androidx.webkit.JavaScriptReplyProxy javaScriptReplyProxy;
    private android.webkit.WebView webView;

    public static /* synthetic */ void $r8$lambda$NqeaDFIoN0gw3x9NS3830RcfMfI(com.getcapacitor.MessageHandler r0, android.webkit.WebView r1, androidx.webkit.WebMessageCompat r2, android.net.Uri r3, boolean r4, androidx.webkit.JavaScriptReplyProxy r5) {
            r0.lambda$new$0(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void $r8$lambda$Vub3GfX6oCEFJPq_YoWKfFaxYW4(com.getcapacitor.MessageHandler r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0.lambda$callCordovaPluginMethod$2(r1, r2, r3, r4)
            return
    }

    public MessageHandler(com.getcapacitor.Bridge r4, android.webkit.WebView r5, org.apache.cordova.PluginManager r6) {
            r3 = this;
            r3.<init>()
            r3.bridge = r4
            r3.webView = r5
            r3.cordovaPluginManager = r6
            java.lang.String r0 = "WEB_MESSAGE_LISTENER"
            boolean r0 = androidx.webkit.WebViewFeature.isFeatureSupported(r0)
            java.lang.String r1 = "androidBridge"
            if (r0 == 0) goto L2f
            com.getcapacitor.CapConfig r0 = r4.getConfig()
            boolean r0 = r0.isUsingLegacyBridge()
            if (r0 != 0) goto L2f
            com.getcapacitor.MessageHandler$$ExternalSyntheticLambda2 r0 = new com.getcapacitor.MessageHandler$$ExternalSyntheticLambda2
            r0.<init>(r3)
            java.util.Set r2 = r4.getAllowedOriginRules()     // Catch: java.lang.Exception -> L2a
            androidx.webkit.WebViewCompat.addWebMessageListener(r5, r1, r2, r0)     // Catch: java.lang.Exception -> L2a
            goto L2e
        L2a:
            r2 = move-exception
            r5.addJavascriptInterface(r3, r1)
        L2e:
            goto L32
        L2f:
            r5.addJavascriptInterface(r3, r1)
        L32:
            return
    }

    private void callCordovaPluginMethod(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r7 = this;
            com.getcapacitor.Bridge r0 = r7.bridge
            com.getcapacitor.MessageHandler$$ExternalSyntheticLambda1 r1 = new com.getcapacitor.MessageHandler$$ExternalSyntheticLambda1
            r2 = r7
            r5 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.execute(r1)
            return
    }

    private void callPluginMethod(java.lang.String r7, java.lang.String r8, java.lang.String r9, com.getcapacitor.JSObject r10) {
            r6 = this;
            com.getcapacitor.PluginCall r0 = new com.getcapacitor.PluginCall
            r1 = r6
            r3 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            com.getcapacitor.Bridge r7 = r1.bridge
            r7.callPluginMethod(r2, r4, r0)
            return
    }

    private /* synthetic */ void lambda$callCordovaPluginMethod$2(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            org.apache.cordova.PluginManager r0 = r1.cordovaPluginManager
            r0.exec(r2, r3, r4, r5)
            return
    }

    static /* synthetic */ void lambda$legacySendResponseMessage$1(android.webkit.WebView r1, java.lang.String r2) {
            r0 = 0
            r1.evaluateJavascript(r2, r0)
            return
    }

    private /* synthetic */ void lambda$new$0(android.webkit.WebView r2, androidx.webkit.WebMessageCompat r3, android.net.Uri r4, boolean r5, androidx.webkit.JavaScriptReplyProxy r6) {
            r1 = this;
            if (r5 == 0) goto Lc
            java.lang.String r0 = r3.getData()
            r1.postMessage(r0)
            r1.javaScriptReplyProxy = r6
            goto L11
        Lc:
            java.lang.String r0 = "Plugin execution is allowed in Main Frame only"
            com.getcapacitor.Logger.warn(r0)
        L11:
            return
    }

    private void legacySendResponseMessage(com.getcapacitor.PluginResult r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "window.Capacitor.fromNative("
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.webkit.WebView r1 = r3.webView
            com.getcapacitor.MessageHandler$$ExternalSyntheticLambda0 r2 = new com.getcapacitor.MessageHandler$$ExternalSyntheticLambda0
            r2.<init>(r1, r0)
            r1.post(r2)
            return
    }

    @android.webkit.JavascriptInterface
    public void postMessage(java.lang.String r14) {
            r13 = this;
            com.getcapacitor.JSObject r0 = new com.getcapacitor.JSObject     // Catch: java.lang.Exception -> Lee
            r0.<init>(r14)     // Catch: java.lang.Exception -> Lee
            java.lang.String r1 = "type"
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Exception -> Lee
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L11
            r4 = r2
            goto L12
        L11:
            r4 = r3
        L12:
            if (r4 == 0) goto L1e
            java.lang.String r5 = "cordova"
            boolean r5 = r1.equals(r5)     // Catch: java.lang.Exception -> Lee
            if (r5 == 0) goto L1e
            r5 = r2
            goto L1f
        L1e:
            r5 = r3
        L1f:
            if (r4 == 0) goto L2b
            java.lang.String r6 = "js.error"
            boolean r6 = r1.equals(r6)     // Catch: java.lang.Exception -> Lee
            if (r6 == 0) goto L2b
            r6 = r2
            goto L2c
        L2b:
            r6 = r3
        L2c:
            java.lang.String r7 = "callbackId"
            java.lang.String r7 = r0.getString(r7)     // Catch: java.lang.Exception -> Lee
            java.lang.String r8 = "Plugin"
            if (r5 == 0) goto L88
            java.lang.String r9 = "service"
            java.lang.String r9 = r0.getString(r9)     // Catch: java.lang.Exception -> Lee
            java.lang.String r10 = "action"
            java.lang.String r10 = r0.getString(r10)     // Catch: java.lang.Exception -> Lee
            java.lang.String r11 = "actionArgs"
            java.lang.String r11 = r0.getString(r11)     // Catch: java.lang.Exception -> Lee
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Exception -> Lee
            r2[r3] = r8     // Catch: java.lang.Exception -> Lee
            java.lang.String r2 = com.getcapacitor.Logger.tags(r2)     // Catch: java.lang.Exception -> Lee
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lee
            r3.<init>()     // Catch: java.lang.Exception -> Lee
            java.lang.String r8 = "To native (Cordova plugin): callbackId: "
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Exception -> Lee
            java.lang.StringBuilder r3 = r3.append(r7)     // Catch: java.lang.Exception -> Lee
            java.lang.String r8 = ", service: "
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Exception -> Lee
            java.lang.StringBuilder r3 = r3.append(r9)     // Catch: java.lang.Exception -> Lee
            java.lang.String r8 = ", action: "
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Exception -> Lee
            java.lang.StringBuilder r3 = r3.append(r10)     // Catch: java.lang.Exception -> Lee
            java.lang.String r8 = ", actionArgs: "
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Exception -> Lee
            java.lang.StringBuilder r3 = r3.append(r11)     // Catch: java.lang.Exception -> Lee
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> Lee
            com.getcapacitor.Logger.verbose(r2, r3)     // Catch: java.lang.Exception -> Lee
            r13.callCordovaPluginMethod(r7, r9, r10, r11)     // Catch: java.lang.Exception -> Lee
            goto Led
        L88:
            if (r6 == 0) goto La1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lee
            r2.<init>()     // Catch: java.lang.Exception -> Lee
            java.lang.String r3 = "JavaScript Error: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Exception -> Lee
            java.lang.StringBuilder r2 = r2.append(r14)     // Catch: java.lang.Exception -> Lee
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lee
            com.getcapacitor.Logger.error(r2)     // Catch: java.lang.Exception -> Lee
            goto Led
        La1:
            java.lang.String r9 = "pluginId"
            java.lang.String r9 = r0.getString(r9)     // Catch: java.lang.Exception -> Lee
            java.lang.String r10 = "methodName"
            java.lang.String r10 = r0.getString(r10)     // Catch: java.lang.Exception -> Lee
            java.lang.String r11 = "options"
            com.getcapacitor.JSObject r12 = new com.getcapacitor.JSObject     // Catch: java.lang.Exception -> Lee
            r12.<init>()     // Catch: java.lang.Exception -> Lee
            com.getcapacitor.JSObject r11 = r0.getJSObject(r11, r12)     // Catch: java.lang.Exception -> Lee
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Exception -> Lee
            r2[r3] = r8     // Catch: java.lang.Exception -> Lee
            java.lang.String r2 = com.getcapacitor.Logger.tags(r2)     // Catch: java.lang.Exception -> Lee
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lee
            r3.<init>()     // Catch: java.lang.Exception -> Lee
            java.lang.String r8 = "To native (Capacitor plugin): callbackId: "
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Exception -> Lee
            java.lang.StringBuilder r3 = r3.append(r7)     // Catch: java.lang.Exception -> Lee
            java.lang.String r8 = ", pluginId: "
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Exception -> Lee
            java.lang.StringBuilder r3 = r3.append(r9)     // Catch: java.lang.Exception -> Lee
            java.lang.String r8 = ", methodName: "
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Exception -> Lee
            java.lang.StringBuilder r3 = r3.append(r10)     // Catch: java.lang.Exception -> Lee
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> Lee
            com.getcapacitor.Logger.verbose(r2, r3)     // Catch: java.lang.Exception -> Lee
            r13.callPluginMethod(r7, r9, r10, r11)     // Catch: java.lang.Exception -> Lee
        Led:
            goto Lf4
        Lee:
            r0 = move-exception
            java.lang.String r1 = "Post message error:"
            com.getcapacitor.Logger.error(r1, r0)
        Lf4:
            return
    }

    public void sendResponseMessage(com.getcapacitor.PluginCall r6, com.getcapacitor.PluginResult r7, com.getcapacitor.PluginResult r8) {
            r5 = this;
            com.getcapacitor.PluginResult r0 = new com.getcapacitor.PluginResult     // Catch: java.lang.Exception -> La2
            r0.<init>()     // Catch: java.lang.Exception -> La2
            java.lang.String r1 = "save"
            boolean r2 = r6.isKeptAlive()     // Catch: java.lang.Exception -> La2
            r0.put(r1, r2)     // Catch: java.lang.Exception -> La2
            java.lang.String r1 = "callbackId"
            java.lang.String r2 = r6.getCallbackId()     // Catch: java.lang.Exception -> La2
            r0.put(r1, r2)     // Catch: java.lang.Exception -> La2
            java.lang.String r1 = "pluginId"
            java.lang.String r2 = r6.getPluginId()     // Catch: java.lang.Exception -> La2
            r0.put(r1, r2)     // Catch: java.lang.Exception -> La2
            java.lang.String r1 = "methodName"
            java.lang.String r2 = r6.getMethodName()     // Catch: java.lang.Exception -> La2
            r0.put(r1, r2)     // Catch: java.lang.Exception -> La2
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L2f
            r3 = r2
            goto L30
        L2f:
            r3 = r1
        L30:
            java.lang.String r4 = "success"
            if (r3 == 0) goto L57
            r0.put(r4, r1)     // Catch: java.lang.Exception -> La2
            java.lang.String r1 = "error"
            r0.put(r1, r8)     // Catch: java.lang.Exception -> La2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La2
            r1.<init>()     // Catch: java.lang.Exception -> La2
            java.lang.String r4 = "Sending plugin error: "
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Exception -> La2
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Exception -> La2
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Exception -> La2
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> La2
            com.getcapacitor.Logger.debug(r1)     // Catch: java.lang.Exception -> La2
            goto L61
        L57:
            r0.put(r4, r2)     // Catch: java.lang.Exception -> La2
            if (r7 == 0) goto L61
            java.lang.String r1 = "data"
            r0.put(r1, r7)     // Catch: java.lang.Exception -> La2
        L61:
            java.lang.String r1 = r6.getCallbackId()     // Catch: java.lang.Exception -> La2
            java.lang.String r4 = "-1"
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Exception -> La2
            r1 = r1 ^ r2
            if (r1 == 0) goto L98
            com.getcapacitor.Bridge r2 = r5.bridge     // Catch: java.lang.Exception -> La2
            com.getcapacitor.CapConfig r2 = r2.getConfig()     // Catch: java.lang.Exception -> La2
            boolean r2 = r2.isUsingLegacyBridge()     // Catch: java.lang.Exception -> La2
            if (r2 == 0) goto L7e
            r5.legacySendResponseMessage(r0)     // Catch: java.lang.Exception -> La2
            goto La1
        L7e:
            java.lang.String r2 = "WEB_MESSAGE_LISTENER"
            boolean r2 = androidx.webkit.WebViewFeature.isFeatureSupported(r2)     // Catch: java.lang.Exception -> La2
            if (r2 == 0) goto L94
            androidx.webkit.JavaScriptReplyProxy r2 = r5.javaScriptReplyProxy     // Catch: java.lang.Exception -> La2
            if (r2 == 0) goto L94
            androidx.webkit.JavaScriptReplyProxy r2 = r5.javaScriptReplyProxy     // Catch: java.lang.Exception -> La2
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Exception -> La2
            r2.postMessage(r4)     // Catch: java.lang.Exception -> La2
            goto La1
        L94:
            r5.legacySendResponseMessage(r0)     // Catch: java.lang.Exception -> La2
            goto La1
        L98:
            com.getcapacitor.Bridge r2 = r5.bridge     // Catch: java.lang.Exception -> La2
            com.getcapacitor.App r2 = r2.getApp()     // Catch: java.lang.Exception -> La2
            r2.fireRestoredResult(r0)     // Catch: java.lang.Exception -> La2
        La1:
            goto Lb9
        La2:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "sendResponseMessage: error: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.getcapacitor.Logger.error(r1)
        Lb9:
            boolean r0 = r6.isKeptAlive()
            if (r0 != 0) goto Lc4
            com.getcapacitor.Bridge r0 = r5.bridge
            r6.release(r0)
        Lc4:
            return
    }
}
