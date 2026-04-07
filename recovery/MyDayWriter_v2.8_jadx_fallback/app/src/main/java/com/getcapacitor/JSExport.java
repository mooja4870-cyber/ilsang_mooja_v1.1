package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class JSExport {
    private static java.lang.String CALLBACK_PARAM;
    private static java.lang.String CATCHALL_OPTIONS_PARAM;

    static {
            java.lang.String r0 = "_options"
            com.getcapacitor.JSExport.CATCHALL_OPTIONS_PARAM = r0
            java.lang.String r0 = "_callback"
            com.getcapacitor.JSExport.CALLBACK_PARAM = r0
            return
    }

    public JSExport() {
            r0 = this;
            r0.<init>()
            return
    }

    private static org.json.JSONObject createPluginHeader(com.getcapacitor.PluginHandle r7) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Collection r1 = r7.getMethods()
            java.lang.String r2 = r7.getId()     // Catch: org.json.JSONException -> L37
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: org.json.JSONException -> L37
            r3.<init>()     // Catch: org.json.JSONException -> L37
            java.lang.String r4 = "name"
            r0.put(r4, r2)     // Catch: org.json.JSONException -> L37
            java.util.Iterator r4 = r1.iterator()     // Catch: org.json.JSONException -> L37
        L1b:
            boolean r5 = r4.hasNext()     // Catch: org.json.JSONException -> L37
            if (r5 == 0) goto L30
            java.lang.Object r5 = r4.next()     // Catch: org.json.JSONException -> L37
            com.getcapacitor.PluginMethodHandle r5 = (com.getcapacitor.PluginMethodHandle) r5     // Catch: org.json.JSONException -> L37
            org.json.JSONObject r6 = createPluginMethodHeader(r5)     // Catch: org.json.JSONException -> L37
            r3.put(r6)     // Catch: org.json.JSONException -> L37
            goto L1b
        L30:
            java.lang.String r4 = "methods"
            r0.put(r4, r3)     // Catch: org.json.JSONException -> L37
            goto L38
        L37:
            r2 = move-exception
        L38:
            return r0
    }

    private static org.json.JSONObject createPluginMethodHeader(com.getcapacitor.PluginMethodHandle r3) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.String r2 = r3.getName()     // Catch: org.json.JSONException -> L24
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L24
            java.lang.String r1 = r3.getReturnType()     // Catch: org.json.JSONException -> L24
            java.lang.String r2 = "none"
            boolean r1 = r1.equals(r2)     // Catch: org.json.JSONException -> L24
            if (r1 != 0) goto L23
            java.lang.String r1 = "rtype"
            java.lang.String r2 = r3.getReturnType()     // Catch: org.json.JSONException -> L24
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L24
        L23:
            goto L25
        L24:
            r1 = move-exception
        L25:
            return r0
    }

    private static java.lang.String generateMethodJS(com.getcapacitor.PluginHandle r9, com.getcapacitor.PluginMethodHandle r10) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = com.getcapacitor.JSExport.CATCHALL_OPTIONS_PARAM
            r1.add(r2)
            java.lang.String r2 = r10.getReturnType()
            java.lang.String r3 = "callback"
            boolean r4 = r2.equals(r3)
            if (r4 == 0) goto L20
            java.lang.String r4 = com.getcapacitor.JSExport.CALLBACK_PARAM
            r1.add(r4)
        L20:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "t['"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r10.getName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "'] = function("
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ", "
            java.lang.String r6 = android.text.TextUtils.join(r5, r1)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r6 = ") {"
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            r0.add(r4)
            int r4 = r2.hashCode()
            switch(r4) {
                case -309216997: goto L6a;
                case -172220347: goto L62;
                case 3387192: goto L58;
                default: goto L57;
            }
        L57:
            goto L74
        L58:
            java.lang.String r3 = "none"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L57
            r3 = 0
            goto L75
        L62:
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L57
            r3 = 2
            goto L75
        L6a:
            java.lang.String r3 = "promise"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L57
            r3 = 1
            goto L75
        L74:
            r3 = -1
        L75:
            java.lang.String r4 = "return w.Capacitor.nativeCallback('"
            java.lang.String r6 = ")"
            java.lang.String r7 = "', "
            java.lang.String r8 = "', '"
            switch(r3) {
                case 0: goto Lf4;
                case 1: goto Lbf;
                case 2: goto L82;
                default: goto L80;
            }
        L80:
            goto L127
        L82:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r9.getId()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r4 = r10.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r4 = com.getcapacitor.JSExport.CATCHALL_OPTIONS_PARAM
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r4 = com.getcapacitor.JSExport.CALLBACK_PARAM
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r3 = r3.toString()
            r0.add(r3)
            goto L127
        Lbf:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "return w.Capacitor.nativePromise('"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r9.getId()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r4 = r10.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r4 = com.getcapacitor.JSExport.CATCHALL_OPTIONS_PARAM
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r3 = r3.toString()
            r0.add(r3)
            goto L127
        Lf4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r9.getId()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r4 = r10.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r4 = com.getcapacitor.JSExport.CATCHALL_OPTIONS_PARAM
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r3 = r3.toString()
            r0.add(r3)
        L127:
            java.lang.String r3 = "}"
            r0.add(r3)
            java.lang.String r3 = "\n"
            java.lang.String r3 = android.text.TextUtils.join(r3, r0)
            return r3
    }

    public static java.lang.String getBridgeJS(android.content.Context r1) throws com.getcapacitor.JSExportException {
            java.lang.String r0 = "native-bridge.js"
            java.lang.String r0 = getFilesContent(r1, r0)
            return r0
    }

    public static java.lang.String getCordovaJS(android.content.Context r3) {
            java.lang.String r0 = ""
            android.content.res.AssetManager r1 = r3.getAssets()     // Catch: java.io.IOException -> Le
            java.lang.String r2 = "public/cordova.js"
            java.lang.String r1 = com.getcapacitor.FileUtils.readFileFromAssets(r1, r2)     // Catch: java.io.IOException -> Le
            r0 = r1
            goto L14
        Le:
            r1 = move-exception
            java.lang.String r2 = "Unable to read public/cordova.js file, Cordova plugins will not work"
            com.getcapacitor.Logger.error(r2)
        L14:
            return r0
    }

    public static java.lang.String getCordovaPluginJS(android.content.Context r1) {
            java.lang.String r0 = "public/plugins"
            java.lang.String r0 = getFilesContent(r1, r0)
            return r0
    }

    public static java.lang.String getCordovaPluginsFileJS(android.content.Context r3) {
            java.lang.String r0 = ""
            android.content.res.AssetManager r1 = r3.getAssets()     // Catch: java.io.IOException -> Le
            java.lang.String r2 = "public/cordova_plugins.js"
            java.lang.String r1 = com.getcapacitor.FileUtils.readFileFromAssets(r1, r2)     // Catch: java.io.IOException -> Le
            r0 = r1
            goto L14
        Le:
            r1 = move-exception
            java.lang.String r2 = "Unable to read public/cordova_plugins.js file, Cordova plugins will not work"
            com.getcapacitor.Logger.error(r2)
        L14:
            return r0
    }

    public static java.lang.String getFilesContent(android.content.Context r7, java.lang.String r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.res.AssetManager r1 = r7.getAssets()     // Catch: java.io.IOException -> L49
            java.lang.String[] r1 = r1.list(r8)     // Catch: java.io.IOException -> L49
            int r2 = r1.length     // Catch: java.io.IOException -> L49
            if (r2 <= 0) goto L40
            int r2 = r1.length     // Catch: java.io.IOException -> L49
            r3 = 0
        L12:
            if (r3 >= r2) goto L3f
            r4 = r1[r3]     // Catch: java.io.IOException -> L49
            java.lang.String r5 = ".map"
            boolean r5 = r4.endsWith(r5)     // Catch: java.io.IOException -> L49
            if (r5 != 0) goto L3c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L49
            r5.<init>()     // Catch: java.io.IOException -> L49
            java.lang.StringBuilder r5 = r5.append(r8)     // Catch: java.io.IOException -> L49
            java.lang.String r6 = "/"
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.io.IOException -> L49
            java.lang.StringBuilder r5 = r5.append(r4)     // Catch: java.io.IOException -> L49
            java.lang.String r5 = r5.toString()     // Catch: java.io.IOException -> L49
            java.lang.String r5 = getFilesContent(r7, r5)     // Catch: java.io.IOException -> L49
            r0.append(r5)     // Catch: java.io.IOException -> L49
        L3c:
            int r3 = r3 + 1
            goto L12
        L3f:
            goto L60
        L40:
            android.content.res.AssetManager r2 = r7.getAssets()     // Catch: java.io.IOException -> L49
            java.lang.String r2 = com.getcapacitor.FileUtils.readFileFromAssets(r2, r8)     // Catch: java.io.IOException -> L49
            return r2
        L49:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to read file at path "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.getcapacitor.Logger.warn(r2)
        L60:
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String getGlobalJS(android.content.Context r2, boolean r3, boolean r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "window.Capacitor = { DEBUG: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = ", isLoggingEnabled: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = ", Plugins: {} };"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String getMiscFileJS(java.util.ArrayList<java.lang.String> r6, android.content.Context r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r6.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            android.content.res.AssetManager r3 = r7.getAssets()     // Catch: java.io.IOException -> L35
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L35
            r4.<init>()     // Catch: java.io.IOException -> L35
            java.lang.String r5 = "public/"
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.io.IOException -> L35
            java.lang.StringBuilder r4 = r4.append(r2)     // Catch: java.io.IOException -> L35
            java.lang.String r4 = r4.toString()     // Catch: java.io.IOException -> L35
            java.lang.String r3 = com.getcapacitor.FileUtils.readFileFromAssets(r3, r4)     // Catch: java.io.IOException -> L35
            r0.add(r3)     // Catch: java.io.IOException -> L35
            goto L4c
        L35:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Unable to read public/"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.getcapacitor.Logger.error(r4)
        L4c:
            goto L9
        L4d:
            java.lang.String r1 = "\n"
            java.lang.String r1 = android.text.TextUtils.join(r1, r0)
            return r1
    }

    public static java.lang.String getPluginJS(java.util.Collection<com.getcapacitor.PluginHandle> r9) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.lang.String r2 = "// Begin: Capacitor Plugin JS"
            r0.add(r2)
            java.util.Iterator r2 = r9.iterator()
        L13:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8f
            java.lang.Object r3 = r2.next()
            com.getcapacitor.PluginHandle r3 = (com.getcapacitor.PluginHandle) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "(function(w) {\nvar a = (w.Capacitor = w.Capacitor || {});\nvar p = (a.Plugins = a.Plugins || {});\nvar t = (p['"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r3.getId()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "'] = {});\nt.addListener = function(eventName, callback) {\n  return w.Capacitor.addListener('"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r3.getId()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "', eventName, callback);\n}"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.add(r4)
            java.util.Collection r4 = r3.getMethods()
            java.util.Iterator r5 = r4.iterator()
        L55:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L82
            java.lang.Object r6 = r5.next()
            com.getcapacitor.PluginMethodHandle r6 = (com.getcapacitor.PluginMethodHandle) r6
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = "addListener"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L55
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = "removeListener"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L7a
            goto L55
        L7a:
            java.lang.String r7 = generateMethodJS(r3, r6)
            r0.add(r7)
            goto L55
        L82:
            java.lang.String r5 = "})(window);\n"
            r0.add(r5)
            org.json.JSONObject r5 = createPluginHeader(r3)
            r1.put(r5)
            goto L13
        L8f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "\n"
            java.lang.String r3 = android.text.TextUtils.join(r3, r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "\nwindow.Capacitor.PluginHeaders = "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ";"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
    }
}
