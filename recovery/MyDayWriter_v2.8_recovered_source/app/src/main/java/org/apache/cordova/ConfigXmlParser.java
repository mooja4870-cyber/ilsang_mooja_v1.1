package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class ConfigXmlParser {
    private static final java.lang.String DEFAULT_CONTENT_SRC = "index.html";
    private static java.lang.String DEFAULT_HOSTNAME;
    private static java.lang.String SCHEME_HTTP;
    private static java.lang.String SCHEME_HTTPS;
    private static java.lang.String TAG;
    private java.lang.String contentSrc;
    boolean insideFeature;
    private java.lang.String launchUrl;
    boolean onload;
    java.lang.String paramType;
    java.lang.String pluginClass;
    private java.util.ArrayList<org.apache.cordova.PluginEntry> pluginEntries;
    private org.apache.cordova.CordovaPreferences prefs;
    java.lang.String service;

    static {
            java.lang.String r0 = "ConfigXmlParser"
            org.apache.cordova.ConfigXmlParser.TAG = r0
            java.lang.String r0 = "http"
            org.apache.cordova.ConfigXmlParser.SCHEME_HTTP = r0
            java.lang.String r0 = "https"
            org.apache.cordova.ConfigXmlParser.SCHEME_HTTPS = r0
            java.lang.String r0 = "localhost"
            org.apache.cordova.ConfigXmlParser.DEFAULT_HOSTNAME = r0
            return
    }

    public ConfigXmlParser() {
            r2 = this;
            r2.<init>()
            org.apache.cordova.CordovaPreferences r0 = new org.apache.cordova.CordovaPreferences
            r0.<init>()
            r2.prefs = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 20
            r0.<init>(r1)
            r2.pluginEntries = r0
            r0 = 0
            r2.insideFeature = r0
            java.lang.String r1 = ""
            r2.service = r1
            r2.pluginClass = r1
            r2.paramType = r1
            r2.onload = r0
            return
    }

    private java.lang.String getLaunchUrlPrefix() {
            r5 = this;
            org.apache.cordova.CordovaPreferences r0 = r5.prefs
            java.lang.String r1 = "AndroidInsecureFileModeEnabled"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto Le
            java.lang.String r0 = "file:///android_asset/www/"
            return r0
        Le:
            org.apache.cordova.CordovaPreferences r0 = r5.prefs
            java.lang.String r1 = "scheme"
            java.lang.String r2 = org.apache.cordova.ConfigXmlParser.SCHEME_HTTPS
            java.lang.String r0 = r0.getString(r1, r2)
            java.lang.String r0 = r0.toLowerCase()
            org.apache.cordova.CordovaPreferences r1 = r5.prefs
            java.lang.String r2 = "hostname"
            java.lang.String r3 = org.apache.cordova.ConfigXmlParser.DEFAULT_HOSTNAME
            java.lang.String r1 = r1.getString(r2, r3)
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r2 = org.apache.cordova.ConfigXmlParser.SCHEME_HTTP
            boolean r2 = r0.contentEquals(r2)
            if (r2 != 0) goto L7e
            java.lang.String r2 = org.apache.cordova.ConfigXmlParser.SCHEME_HTTPS
            boolean r2 = r0.contentEquals(r2)
            if (r2 != 0) goto L7e
            java.lang.String r2 = org.apache.cordova.ConfigXmlParser.TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The provided scheme \""
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = "\" is not valid. Defaulting to \""
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = org.apache.cordova.ConfigXmlParser.SCHEME_HTTPS
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "\". (Valid Options="
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = org.apache.cordova.ConfigXmlParser.SCHEME_HTTP
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ","
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = org.apache.cordova.ConfigXmlParser.SCHEME_HTTPS
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ")"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            org.apache.cordova.LOG.d(r2, r3)
            java.lang.String r0 = org.apache.cordova.ConfigXmlParser.SCHEME_HTTPS
        L7e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = "://"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            r3 = 47
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
    }

    private void onPostParse() {
            r1 = this;
            java.lang.String r0 = r1.contentSrc
            if (r0 != 0) goto L8
            java.lang.String r0 = "index.html"
            r1.contentSrc = r0
        L8:
            return
    }

    private void setStartUrl(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "^[a-z-]+://"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r1 = r0.matcher(r6)
            boolean r2 = r1.find()
            if (r2 == 0) goto L13
            r5.launchUrl = r6
            goto L38
        L13:
            java.lang.String r2 = r5.getLaunchUrlPrefix()
            r3 = 0
            char r3 = r6.charAt(r3)
            r4 = 47
            if (r3 != r4) goto L25
            r3 = 1
            java.lang.String r6 = r6.substring(r3)
        L25:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r3 = r3.toString()
            r5.launchUrl = r3
        L38:
            return
    }

    public java.lang.String getLaunchUrl() {
            r1 = this;
            java.lang.String r0 = r1.launchUrl
            if (r0 != 0) goto L9
            java.lang.String r0 = r1.contentSrc
            r1.setStartUrl(r0)
        L9:
            java.lang.String r0 = r1.launchUrl
            return r0
    }

    public java.util.ArrayList<org.apache.cordova.PluginEntry> getPluginEntries() {
            r1 = this;
            java.util.ArrayList<org.apache.cordova.PluginEntry> r0 = r1.pluginEntries
            return r0
    }

    public org.apache.cordova.CordovaPreferences getPreferences() {
            r1 = this;
            org.apache.cordova.CordovaPreferences r0 = r1.prefs
            return r0
    }

    public void handleEndTag(org.xmlpull.v1.XmlPullParser r7) {
            r6 = this;
            java.lang.String r0 = r7.getName()
            java.lang.String r1 = "feature"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L27
            java.util.ArrayList<org.apache.cordova.PluginEntry> r1 = r6.pluginEntries
            org.apache.cordova.PluginEntry r2 = new org.apache.cordova.PluginEntry
            java.lang.String r3 = r6.service
            java.lang.String r4 = r6.pluginClass
            boolean r5 = r6.onload
            r2.<init>(r3, r4, r5)
            r1.add(r2)
            java.lang.String r1 = ""
            r6.service = r1
            r6.pluginClass = r1
            r1 = 0
            r6.insideFeature = r1
            r6.onload = r1
        L27:
            return
    }

    public void handleStartTag(org.xmlpull.v1.XmlPullParser r6) {
            r5 = this;
            java.lang.String r0 = r6.getName()
            java.lang.String r1 = "feature"
            boolean r1 = r0.equals(r1)
            java.lang.String r2 = "name"
            r3 = 0
            if (r1 == 0) goto L1a
            r1 = 1
            r5.insideFeature = r1
            java.lang.String r1 = r6.getAttributeValue(r3, r2)
            r5.service = r1
            goto La5
        L1a:
            boolean r1 = r5.insideFeature
            java.lang.String r4 = "value"
            if (r1 == 0) goto L72
            java.lang.String r1 = "param"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L72
            java.lang.String r1 = r6.getAttributeValue(r3, r2)
            r5.paramType = r1
            java.lang.String r1 = r5.paramType
            java.lang.String r2 = "service"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3f
            java.lang.String r1 = r6.getAttributeValue(r3, r4)
            r5.service = r1
            goto La5
        L3f:
            java.lang.String r1 = r5.paramType
            java.lang.String r2 = "package"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L6b
            java.lang.String r1 = r5.paramType
            java.lang.String r2 = "android-package"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L54
            goto L6b
        L54:
            java.lang.String r1 = r5.paramType
            java.lang.String r2 = "onload"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto La5
            java.lang.String r1 = "true"
            java.lang.String r2 = r6.getAttributeValue(r3, r4)
            boolean r1 = r1.equals(r2)
            r5.onload = r1
            goto La5
        L6b:
            java.lang.String r1 = r6.getAttributeValue(r3, r4)
            r5.pluginClass = r1
            goto La5
        L72:
            java.lang.String r1 = "preference"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L8e
            java.lang.String r1 = r6.getAttributeValue(r3, r2)
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = r6.getAttributeValue(r3, r4)
            org.apache.cordova.CordovaPreferences r3 = r5.prefs
            r3.set(r1, r2)
            goto La5
        L8e:
            java.lang.String r1 = "content"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto La5
            java.lang.String r1 = "src"
            java.lang.String r1 = r6.getAttributeValue(r3, r1)
            if (r1 == 0) goto La1
            r5.contentSrc = r1
            goto La5
        La1:
            java.lang.String r2 = "index.html"
            r5.contentSrc = r2
        La5:
            return
    }

    public void parse(android.content.Context r7) {
            r6 = this;
            android.content.res.Resources r0 = r7.getResources()
            java.lang.Class r1 = r7.getClass()
            java.lang.Package r1 = r1.getPackage()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "config"
            java.lang.String r3 = "xml"
            int r0 = r0.getIdentifier(r2, r3, r1)
            if (r0 != 0) goto L30
            android.content.res.Resources r1 = r7.getResources()
            java.lang.String r4 = r7.getPackageName()
            int r0 = r1.getIdentifier(r2, r3, r4)
            if (r0 != 0) goto L30
            java.lang.String r1 = org.apache.cordova.ConfigXmlParser.TAG
            java.lang.String r2 = "res/xml/config.xml is missing!"
            org.apache.cordova.LOG.e(r1, r2)
            return
        L30:
            java.util.ArrayList<org.apache.cordova.PluginEntry> r1 = r6.pluginEntries
            org.apache.cordova.PluginEntry r2 = new org.apache.cordova.PluginEntry
            java.lang.String r3 = "CordovaAllowListPlugin"
            java.lang.String r4 = "org.apache.cordova.AllowListPlugin"
            r5 = 1
            r2.<init>(r3, r4, r5)
            r1.add(r2)
            java.util.ArrayList<org.apache.cordova.PluginEntry> r1 = r6.pluginEntries
            org.apache.cordova.PluginEntry r2 = new org.apache.cordova.PluginEntry
            java.lang.String r3 = "CordovaSplashScreenPlugin"
            java.lang.String r4 = "org.apache.cordova.SplashScreenPlugin"
            r2.<init>(r3, r4, r5)
            r1.add(r2)
            android.content.res.Resources r1 = r7.getResources()
            android.content.res.XmlResourceParser r1 = r1.getXml(r0)
            r6.parse(r1)
            return
    }

    public void parse(org.xmlpull.v1.XmlPullParser r3) {
            r2 = this;
            r0 = -1
        L1:
            r1 = 1
            if (r0 == r1) goto L21
            r1 = 2
            if (r0 != r1) goto Lb
            r2.handleStartTag(r3)
            goto L11
        Lb:
            r1 = 3
            if (r0 != r1) goto L11
            r2.handleEndTag(r3)
        L11:
            int r1 = r3.next()     // Catch: java.io.IOException -> L17 org.xmlpull.v1.XmlPullParserException -> L1c
            r0 = r1
        L16:
            goto L1
        L17:
            r1 = move-exception
            r1.printStackTrace()
            goto L16
        L1c:
            r1 = move-exception
            r1.printStackTrace()
            goto L16
        L21:
            r2.onPostParse()
            return
    }
}
