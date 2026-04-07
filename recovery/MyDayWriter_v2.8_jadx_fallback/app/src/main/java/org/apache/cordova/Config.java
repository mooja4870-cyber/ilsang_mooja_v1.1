package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
@java.lang.Deprecated
public class Config {
    private static final java.lang.String TAG = "Config";
    static org.apache.cordova.ConfigXmlParser parser;

    private Config() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getErrorUrl() {
            org.apache.cordova.ConfigXmlParser r0 = org.apache.cordova.Config.parser
            org.apache.cordova.CordovaPreferences r0 = r0.getPreferences()
            java.lang.String r1 = "errorurl"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    public static java.util.List<org.apache.cordova.PluginEntry> getPluginEntries() {
            org.apache.cordova.ConfigXmlParser r0 = org.apache.cordova.Config.parser
            java.util.ArrayList r0 = r0.getPluginEntries()
            return r0
    }

    public static org.apache.cordova.CordovaPreferences getPreferences() {
            org.apache.cordova.ConfigXmlParser r0 = org.apache.cordova.Config.parser
            org.apache.cordova.CordovaPreferences r0 = r0.getPreferences()
            return r0
    }

    public static java.lang.String getStartUrl() {
            org.apache.cordova.ConfigXmlParser r0 = org.apache.cordova.Config.parser
            if (r0 != 0) goto L7
            java.lang.String r0 = "file:///android_asset/www/index.html"
            return r0
        L7:
            org.apache.cordova.ConfigXmlParser r0 = org.apache.cordova.Config.parser
            java.lang.String r0 = r0.getLaunchUrl()
            return r0
    }

    public static void init() {
            org.apache.cordova.ConfigXmlParser r0 = org.apache.cordova.Config.parser
            if (r0 != 0) goto Lb
            org.apache.cordova.ConfigXmlParser r0 = new org.apache.cordova.ConfigXmlParser
            r0.<init>()
            org.apache.cordova.Config.parser = r0
        Lb:
            return
    }

    public static void init(android.app.Activity r2) {
            org.apache.cordova.ConfigXmlParser r0 = new org.apache.cordova.ConfigXmlParser
            r0.<init>()
            org.apache.cordova.Config.parser = r0
            org.apache.cordova.ConfigXmlParser r0 = org.apache.cordova.Config.parser
            r0.parse(r2)
            org.apache.cordova.ConfigXmlParser r0 = org.apache.cordova.Config.parser
            org.apache.cordova.CordovaPreferences r0 = r0.getPreferences()
            android.content.Intent r1 = r2.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            r0.setPreferencesBundle(r1)
            return
    }

    public static boolean isInitialized() {
            org.apache.cordova.ConfigXmlParser r0 = org.apache.cordova.Config.parser
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
