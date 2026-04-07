package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class SplashScreenPlugin extends org.apache.cordova.CordovaPlugin {
    private static final boolean DEFAULT_AUTO_HIDE = true;
    private static final int DEFAULT_DELAY_TIME = -1;
    private static final boolean DEFAULT_FADE = true;
    private static final int DEFAULT_FADE_TIME = 500;
    static final java.lang.String PLUGIN_NAME = "CordovaSplashScreenPlugin";
    private boolean autoHide;
    private int delayTime;
    private int fadeDuration;
    private boolean isFadeEnabled;
    private boolean keepOnScreen;


    /* JADX INFO: renamed from: -$$Nest$fgetfadeDuration, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m1744$$Nest$fgetfadeDuration(org.apache.cordova.SplashScreenPlugin r0) {
            int r0 = r0.fadeDuration
            return r0
    }

    public SplashScreenPlugin() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.keepOnScreen = r0
            return
    }

    private void attemptCloseOnPageFinished() {
            r2 = this;
            boolean r0 = r2.autoHide
            if (r0 == 0) goto Lc
            int r0 = r2.delayTime
            r1 = -1
            if (r0 != r1) goto Lc
            r0 = 0
            r2.keepOnScreen = r0
        Lc:
            return
    }

    private void setupSplashScreen(androidx.core.splashscreen.SplashScreen r5) {
            r4 = this;
            org.apache.cordova.SplashScreenPlugin$$ExternalSyntheticLambda0 r0 = new org.apache.cordova.SplashScreenPlugin$$ExternalSyntheticLambda0
            r0.<init>(r4)
            r5.setKeepOnScreenCondition(r0)
            boolean r0 = r4.autoHide
            if (r0 == 0) goto L2b
            int r0 = r4.delayTime
            r1 = -1
            if (r0 == r1) goto L2b
            android.os.Handler r0 = new android.os.Handler
            org.apache.cordova.CordovaInterface r1 = r4.cordova
            android.content.Context r1 = r1.getContext()
            android.os.Looper r1 = r1.getMainLooper()
            r0.<init>(r1)
            org.apache.cordova.SplashScreenPlugin$$ExternalSyntheticLambda1 r1 = new org.apache.cordova.SplashScreenPlugin$$ExternalSyntheticLambda1
            r1.<init>(r4)
            int r2 = r4.delayTime
            long r2 = (long) r2
            r0.postDelayed(r1, r2)
        L2b:
            boolean r0 = r4.isFadeEnabled
            if (r0 == 0) goto L37
            org.apache.cordova.SplashScreenPlugin$1 r0 = new org.apache.cordova.SplashScreenPlugin$1
            r0.<init>(r4)
            r5.setOnExitAnimationListener(r0)
        L37:
            return
    }

    @Override // org.apache.cordova.CordovaPlugin
    public boolean execute(java.lang.String r3, org.json.JSONArray r4, org.apache.cordova.CallbackContext r5) throws org.json.JSONException {
            r2 = this;
            java.lang.String r0 = "hide"
            boolean r0 = r3.equals(r0)
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r2.autoHide
            if (r0 != 0) goto L14
            r2.keepOnScreen = r1
            r5.success()
            r0 = 1
            return r0
        L14:
            return r1
    }

    /* JADX INFO: renamed from: lambda$setupSplashScreen$0$org-apache-cordova-SplashScreenPlugin, reason: not valid java name */
    /* synthetic */ boolean m1745lambda$setupSplashScreen$0$orgapachecordovaSplashScreenPlugin() {
            r1 = this;
            boolean r0 = r1.keepOnScreen
            return r0
    }

    /* JADX INFO: renamed from: lambda$setupSplashScreen$1$org-apache-cordova-SplashScreenPlugin, reason: not valid java name */
    /* synthetic */ void m1746lambda$setupSplashScreen$1$orgapachecordovaSplashScreenPlugin() {
            r1 = this;
            r0 = 0
            r1.keepOnScreen = r0
            return
    }

    @Override // org.apache.cordova.CordovaPlugin
    public java.lang.Object onMessage(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -505277536: goto L12;
                case 545384656: goto L8;
                default: goto L7;
            }
        L7:
            goto L1c
        L8:
            java.lang.String r0 = "setupSplashScreen"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            r0 = 0
            goto L1d
        L12:
            java.lang.String r0 = "onPageFinished"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L7
            r0 = 1
            goto L1d
        L1c:
            r0 = -1
        L1d:
            switch(r0) {
                case 0: goto L25;
                case 1: goto L21;
                default: goto L20;
            }
        L20:
            goto L2c
        L21:
            r1.attemptCloseOnPageFinished()
            goto L2c
        L25:
            r0 = r3
            androidx.core.splashscreen.SplashScreen r0 = (androidx.core.splashscreen.SplashScreen) r0
            r1.setupSplashScreen(r0)
        L2c:
            r0 = 0
            return r0
    }

    @Override // org.apache.cordova.CordovaPlugin
    protected void pluginInitialize() {
            r5 = this;
            org.apache.cordova.CordovaPreferences r0 = r5.preferences
            java.lang.String r1 = "AutoHideSplashScreen"
            r2 = 1
            boolean r0 = r0.getBoolean(r1, r2)
            r5.autoHide = r0
            org.apache.cordova.CordovaPreferences r0 = r5.preferences
            java.lang.String r1 = "SplashScreenDelay"
            r3 = -1
            int r0 = r0.getInteger(r1, r3)
            r5.delayTime = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Auto Hide: "
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r5.autoHide
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CordovaSplashScreenPlugin"
            org.apache.cordova.LOG.d(r1, r0)
            int r0 = r5.delayTime
            java.lang.String r4 = "ms"
            if (r0 == r3) goto L52
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Delay: "
            java.lang.StringBuilder r0 = r0.append(r3)
            int r3 = r5.delayTime
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            org.apache.cordova.LOG.d(r1, r0)
        L52:
            org.apache.cordova.CordovaPreferences r0 = r5.preferences
            java.lang.String r3 = "FadeSplashScreen"
            boolean r0 = r0.getBoolean(r3, r2)
            r5.isFadeEnabled = r0
            org.apache.cordova.CordovaPreferences r0 = r5.preferences
            java.lang.String r2 = "FadeSplashScreenDuration"
            r3 = 500(0x1f4, float:7.0E-43)
            int r0 = r0.getInteger(r2, r3)
            r5.fadeDuration = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Fade: "
            java.lang.StringBuilder r0 = r0.append(r2)
            boolean r2 = r5.isFadeEnabled
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            org.apache.cordova.LOG.d(r1, r0)
            boolean r0 = r5.isFadeEnabled
            if (r0 == 0) goto La0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Fade Duration: "
            java.lang.StringBuilder r0 = r0.append(r2)
            int r2 = r5.fadeDuration
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            org.apache.cordova.LOG.d(r1, r0)
        La0:
            return
    }
}
