package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class PluginManager {
    private final android.content.res.AssetManager assetManager;

    public PluginManager(android.content.res.AssetManager r1) {
            r0 = this;
            r0.<init>()
            r0.assetManager = r1
            return
    }

    private org.json.JSONArray parsePluginsJSON() throws com.getcapacitor.PluginLoadException {
            r5 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: org.json.JSONException -> L39 java.io.IOException -> L42
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: org.json.JSONException -> L39 java.io.IOException -> L42
            android.content.res.AssetManager r2 = r5.assetManager     // Catch: org.json.JSONException -> L39 java.io.IOException -> L42
            java.lang.String r3 = "capacitor.plugins.json"
            java.io.InputStream r2 = r2.open(r3)     // Catch: org.json.JSONException -> L39 java.io.IOException -> L42
            r1.<init>(r2)     // Catch: org.json.JSONException -> L39 java.io.IOException -> L42
            r0.<init>(r1)     // Catch: org.json.JSONException -> L39 java.io.IOException -> L42
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r1.<init>()     // Catch: java.lang.Throwable -> L2f
        L17:
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L2f
            r3 = r2
            if (r2 == 0) goto L22
            r1.append(r3)     // Catch: java.lang.Throwable -> L2f
            goto L17
        L22:
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Throwable -> L2f
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2f
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            r0.close()     // Catch: org.json.JSONException -> L39 java.io.IOException -> L42
            return r4
        L2f:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L34
            goto L38
        L34:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: org.json.JSONException -> L39 java.io.IOException -> L42
        L38:
            throw r1     // Catch: org.json.JSONException -> L39 java.io.IOException -> L42
        L39:
            r0 = move-exception
            com.getcapacitor.PluginLoadException r1 = new com.getcapacitor.PluginLoadException
            java.lang.String r2 = "Could not parse capacitor.plugins.json as JSON"
            r1.<init>(r2)
            throw r1
        L42:
            r0 = move-exception
            com.getcapacitor.PluginLoadException r1 = new com.getcapacitor.PluginLoadException
            java.lang.String r2 = "Could not load capacitor.plugins.json"
            r1.<init>(r2)
            throw r1
    }

    public java.util.List<java.lang.Class<? extends com.getcapacitor.Plugin>> loadPluginClasses() throws com.getcapacitor.PluginLoadException {
            r8 = this;
            org.json.JSONArray r0 = r8.parsePluginsJSON()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            int r3 = r0.length()     // Catch: java.lang.ClassNotFoundException -> L2d org.json.JSONException -> L4b
        Le:
            if (r2 >= r3) goto L2b
            org.json.JSONObject r4 = r0.getJSONObject(r2)     // Catch: java.lang.ClassNotFoundException -> L2d org.json.JSONException -> L4b
            java.lang.String r5 = "classpath"
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.ClassNotFoundException -> L2d org.json.JSONException -> L4b
            java.lang.Class r6 = java.lang.Class.forName(r5)     // Catch: java.lang.ClassNotFoundException -> L2d org.json.JSONException -> L4b
            java.lang.Class<com.getcapacitor.Plugin> r7 = com.getcapacitor.Plugin.class
            java.lang.Class r7 = r6.asSubclass(r7)     // Catch: java.lang.ClassNotFoundException -> L2d org.json.JSONException -> L4b
            r1.add(r7)     // Catch: java.lang.ClassNotFoundException -> L2d org.json.JSONException -> L4b
            int r2 = r2 + 1
            goto Le
        L2b:
            return r1
        L2d:
            r2 = move-exception
            com.getcapacitor.PluginLoadException r3 = new com.getcapacitor.PluginLoadException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Could not find class by class path: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r2.getMessage()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L4b:
            r2 = move-exception
            com.getcapacitor.PluginLoadException r3 = new com.getcapacitor.PluginLoadException
            java.lang.String r4 = "Could not parse capacitor.plugins.json as JSON"
            r3.<init>(r4)
            throw r3
    }
}
