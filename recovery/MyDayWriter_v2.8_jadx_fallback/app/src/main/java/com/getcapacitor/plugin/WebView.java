package com.getcapacitor.plugin;

/* JADX INFO: loaded from: classes4.dex */
@com.getcapacitor.annotation.CapacitorPlugin
public class WebView extends com.getcapacitor.Plugin {
    public static final java.lang.String CAP_SERVER_PATH = "serverBasePath";
    public static final java.lang.String WEBVIEW_PREFS_NAME = "CapWebViewSettings";

    public WebView() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.getcapacitor.PluginMethod
    public void getServerBasePath(com.getcapacitor.PluginCall r4) {
            r3 = this;
            com.getcapacitor.Bridge r0 = r3.bridge
            java.lang.String r0 = r0.getServerBasePath()
            com.getcapacitor.JSObject r1 = new com.getcapacitor.JSObject
            r1.<init>()
            java.lang.String r2 = "path"
            r1.put(r2, r0)
            r4.resolve(r1)
            return
    }

    @com.getcapacitor.PluginMethod
    public void persistServerBasePath(com.getcapacitor.PluginCall r5) {
            r4 = this;
            com.getcapacitor.Bridge r0 = r4.bridge
            java.lang.String r0 = r0.getServerBasePath()
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "CapWebViewSettings"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            android.content.SharedPreferences$Editor r2 = r1.edit()
            java.lang.String r3 = "serverBasePath"
            r2.putString(r3, r0)
            r2.apply()
            r5.resolve()
            return
    }

    @com.getcapacitor.PluginMethod
    public void setServerAssetPath(com.getcapacitor.PluginCall r3) {
            r2 = this;
            java.lang.String r0 = "path"
            java.lang.String r0 = r3.getString(r0)
            com.getcapacitor.Bridge r1 = r2.bridge
            r1.setServerAssetPath(r0)
            r3.resolve()
            return
    }

    @com.getcapacitor.PluginMethod
    public void setServerBasePath(com.getcapacitor.PluginCall r3) {
            r2 = this;
            java.lang.String r0 = "path"
            java.lang.String r0 = r3.getString(r0)
            com.getcapacitor.Bridge r1 = r2.bridge
            r1.setServerBasePath(r0)
            r3.resolve()
            return
    }
}
