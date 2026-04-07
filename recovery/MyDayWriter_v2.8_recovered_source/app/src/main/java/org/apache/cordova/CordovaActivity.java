package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class CordovaActivity extends androidx.appcompat.app.AppCompatActivity {
    private static int ACTIVITY_EXITING;
    private static int ACTIVITY_RUNNING;
    private static int ACTIVITY_STARTING;
    public static java.lang.String TAG;
    protected org.apache.cordova.CordovaWebView appView;
    protected org.apache.cordova.CordovaInterfaceImpl cordovaInterface;
    protected boolean immersiveMode;
    protected boolean keepRunning;
    protected java.lang.String launchUrl;
    protected java.util.ArrayList<org.apache.cordova.PluginEntry> pluginEntries;
    protected org.apache.cordova.CordovaPreferences preferences;
    private androidx.core.splashscreen.SplashScreen splashScreen;





    static {
            java.lang.String r0 = "CordovaActivity"
            org.apache.cordova.CordovaActivity.TAG = r0
            r0 = 0
            org.apache.cordova.CordovaActivity.ACTIVITY_STARTING = r0
            r0 = 1
            org.apache.cordova.CordovaActivity.ACTIVITY_RUNNING = r0
            r0 = 2
            org.apache.cordova.CordovaActivity.ACTIVITY_EXITING = r0
            return
    }

    public CordovaActivity() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.keepRunning = r0
            return
    }

    protected void createViews() {
            r3 = this;
            org.apache.cordova.CordovaWebView r0 = r3.appView
            android.view.View r0 = r0.getView()
            r1 = 100
            r0.setId(r1)
            org.apache.cordova.CordovaWebView r0 = r3.appView
            android.view.View r0 = r0.getView()
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            org.apache.cordova.CordovaWebView r0 = r3.appView
            android.view.View r0 = r0.getView()
            r3.setContentView(r0)
            org.apache.cordova.CordovaPreferences r0 = r3.preferences
            java.lang.String r1 = "BackgroundColor"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L43
            org.apache.cordova.CordovaPreferences r0 = r3.preferences     // Catch: java.lang.NumberFormatException -> L3f
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = r0.getInteger(r1, r2)     // Catch: java.lang.NumberFormatException -> L3f
            org.apache.cordova.CordovaWebView r1 = r3.appView     // Catch: java.lang.NumberFormatException -> L3f
            android.view.View r1 = r1.getView()     // Catch: java.lang.NumberFormatException -> L3f
            r1.setBackgroundColor(r0)     // Catch: java.lang.NumberFormatException -> L3f
            goto L43
        L3f:
            r0 = move-exception
            r0.printStackTrace()
        L43:
            org.apache.cordova.CordovaWebView r0 = r3.appView
            android.view.View r0 = r0.getView()
            r0.requestFocusFromTouch()
            return
    }

    public void displayError(java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            r7 = this;
            r2 = r7
            org.apache.cordova.CordovaActivity$4 r0 = new org.apache.cordova.CordovaActivity$4
            r1 = r7
            r4 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r2.runOnUiThread(r0)
            return
    }

    protected void init() {
            r4 = this;
            org.apache.cordova.CordovaWebView r0 = r4.makeWebView()
            r4.appView = r0
            r4.createViews()
            org.apache.cordova.CordovaWebView r0 = r4.appView
            boolean r0 = r0.isInitialized()
            if (r0 != 0) goto L1c
            org.apache.cordova.CordovaWebView r0 = r4.appView
            org.apache.cordova.CordovaInterfaceImpl r1 = r4.cordovaInterface
            java.util.ArrayList<org.apache.cordova.PluginEntry> r2 = r4.pluginEntries
            org.apache.cordova.CordovaPreferences r3 = r4.preferences
            r0.init(r1, r2, r3)
        L1c:
            org.apache.cordova.CordovaInterfaceImpl r0 = r4.cordovaInterface
            org.apache.cordova.CordovaWebView r1 = r4.appView
            org.apache.cordova.PluginManager r1 = r1.getPluginManager()
            r0.onCordovaInit(r1)
            org.apache.cordova.CordovaInterfaceImpl r0 = r4.cordovaInterface
            org.apache.cordova.PluginManager r0 = r0.pluginManager
            java.lang.String r1 = "setupSplashScreen"
            androidx.core.splashscreen.SplashScreen r2 = r4.splashScreen
            r0.postMessage(r1, r2)
            org.apache.cordova.CordovaPreferences r0 = r4.preferences
            java.lang.String r1 = "DefaultVolumeStream"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r0.toLowerCase(r1)
            java.lang.String r2 = "media"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L4e
            r1 = 3
            r4.setVolumeControlStream(r1)
        L4e:
            return
    }

    protected void loadConfig() {
            r3 = this;
            org.apache.cordova.ConfigXmlParser r0 = new org.apache.cordova.ConfigXmlParser
            r0.<init>()
            r0.parse(r3)
            org.apache.cordova.CordovaPreferences r1 = r0.getPreferences()
            r3.preferences = r1
            org.apache.cordova.CordovaPreferences r1 = r3.preferences
            android.content.Intent r2 = r3.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            r1.setPreferencesBundle(r2)
            java.lang.String r1 = r0.getLaunchUrl()
            r3.launchUrl = r1
            java.util.ArrayList r1 = r0.getPluginEntries()
            r3.pluginEntries = r1
            org.apache.cordova.Config.parser = r0
            return
    }

    public void loadUrl(java.lang.String r4) {
            r3 = this;
            org.apache.cordova.CordovaWebView r0 = r3.appView
            if (r0 != 0) goto L7
            r3.init()
        L7:
            org.apache.cordova.CordovaPreferences r0 = r3.preferences
            java.lang.String r1 = "KeepRunning"
            r2 = 1
            boolean r0 = r0.getBoolean(r1, r2)
            r3.keepRunning = r0
            org.apache.cordova.CordovaWebView r0 = r3.appView
            r0.loadUrlIntoView(r4, r2)
            return
    }

    protected org.apache.cordova.CordovaInterfaceImpl makeCordovaInterface() {
            r1 = this;
            org.apache.cordova.CordovaActivity$1 r0 = new org.apache.cordova.CordovaActivity$1
            r0.<init>(r1, r1)
            return r0
    }

    protected org.apache.cordova.CordovaWebView makeWebView() {
            r2 = this;
            org.apache.cordova.CordovaWebViewImpl r0 = new org.apache.cordova.CordovaWebViewImpl
            org.apache.cordova.CordovaWebViewEngine r1 = r2.makeWebViewEngine()
            r0.<init>(r1)
            return r0
    }

    protected org.apache.cordova.CordovaWebViewEngine makeWebViewEngine() {
            r1 = this;
            org.apache.cordova.CordovaPreferences r0 = r1.preferences
            org.apache.cordova.CordovaWebViewEngine r0 = org.apache.cordova.CordovaWebViewImpl.createEngine(r1, r0)
            return r0
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int r4, int r5, android.content.Intent r6) {
            r3 = this;
            java.lang.String r0 = org.apache.cordova.CordovaActivity.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Incoming Result. Request code = "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            org.apache.cordova.LOG.d(r0, r1)
            super.onActivityResult(r4, r5, r6)
            org.apache.cordova.CordovaInterfaceImpl r0 = r3.cordovaInterface
            r0.onActivityResult(r4, r5, r6)
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            org.apache.cordova.CordovaWebView r0 = r1.appView
            if (r0 != 0) goto L8
            return
        L8:
            org.apache.cordova.CordovaWebView r0 = r1.appView
            org.apache.cordova.PluginManager r0 = r0.getPluginManager()
            if (r0 == 0) goto L13
            r0.onConfigurationChanged(r2)
        L13:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle r7) {
            r6 = this;
            androidx.core.splashscreen.SplashScreen r0 = androidx.core.splashscreen.SplashScreen.installSplashScreen(r6)
            r6.splashScreen = r0
            r6.loadConfig()
            org.apache.cordova.CordovaPreferences r0 = r6.preferences
            java.lang.String r1 = "loglevel"
            java.lang.String r2 = "ERROR"
            java.lang.String r0 = r0.getString(r1, r2)
            org.apache.cordova.LOG.setLogLevel(r0)
            java.lang.String r1 = org.apache.cordova.CordovaActivity.TAG
            java.lang.String r2 = "Apache Cordova native platform version 14.0.1 is starting"
            org.apache.cordova.LOG.i(r1, r2)
            java.lang.String r1 = org.apache.cordova.CordovaActivity.TAG
            java.lang.String r2 = "CordovaActivity.onCreate()"
            org.apache.cordova.LOG.d(r1, r2)
            org.apache.cordova.CordovaPreferences r1 = r6.preferences
            java.lang.String r2 = "ShowTitle"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            r2 = 1
            if (r1 != 0) goto L37
            android.view.Window r1 = r6.getWindow()
            r1.requestFeature(r2)
        L37:
            org.apache.cordova.CordovaPreferences r1 = r6.preferences
            java.lang.String r4 = "SetFullscreen"
            boolean r1 = r1.getBoolean(r4, r3)
            java.lang.String r4 = "Fullscreen"
            if (r1 == 0) goto L4f
            java.lang.String r1 = org.apache.cordova.CordovaActivity.TAG
            java.lang.String r5 = "The SetFullscreen configuration is deprecated in favor of Fullscreen, and will be removed in a future version."
            org.apache.cordova.LOG.d(r1, r5)
            org.apache.cordova.CordovaPreferences r1 = r6.preferences
            r1.set(r4, r2)
        L4f:
            org.apache.cordova.CordovaPreferences r1 = r6.preferences
            boolean r1 = r1.getBoolean(r4, r3)
            if (r1 == 0) goto L71
            org.apache.cordova.CordovaPreferences r1 = r6.preferences
            java.lang.String r4 = "FullscreenNotImmersive"
            boolean r1 = r1.getBoolean(r4, r3)
            if (r1 != 0) goto L67
            r6.immersiveMode = r2
            r6.setImmersiveUiVisibility()
            goto L7a
        L67:
            android.view.Window r1 = r6.getWindow()
            r2 = 1024(0x400, float:1.435E-42)
            r1.setFlags(r2, r2)
            goto L7a
        L71:
            android.view.Window r1 = r6.getWindow()
            r2 = 2048(0x800, float:2.87E-42)
            r1.setFlags(r2, r2)
        L7a:
            super.onCreate(r7)
            org.apache.cordova.CordovaInterfaceImpl r1 = r6.makeCordovaInterface()
            r6.cordovaInterface = r1
            if (r7 == 0) goto L8a
            org.apache.cordova.CordovaInterfaceImpl r1 = r6.cordovaInterface
            r1.restoreInstanceState(r7)
        L8a:
            return
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu r3) {
            r2 = this;
            org.apache.cordova.CordovaWebView r0 = r2.appView
            if (r0 == 0) goto Lf
            org.apache.cordova.CordovaWebView r0 = r2.appView
            org.apache.cordova.PluginManager r0 = r0.getPluginManager()
            java.lang.String r1 = "onCreateOptionsMenu"
            r0.postMessage(r1, r3)
        Lf:
            boolean r0 = super.onCreateOptionsMenu(r3)
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
            r2 = this;
            java.lang.String r0 = org.apache.cordova.CordovaActivity.TAG
            java.lang.String r1 = "CordovaActivity.onDestroy()"
            org.apache.cordova.LOG.d(r0, r1)
            super.onDestroy()
            org.apache.cordova.CordovaWebView r0 = r2.appView
            if (r0 == 0) goto L13
            org.apache.cordova.CordovaWebView r0 = r2.appView
            r0.handleDestroy()
        L13:
            return
    }

    public java.lang.Object onMessage(java.lang.String r5, java.lang.Object r6) {
            r4 = this;
            java.lang.String r0 = "onReceivedError"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L26
            r0 = r6
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r1 = "errorCode"
            int r1 = r0.getInt(r1)     // Catch: org.json.JSONException -> L21
            java.lang.String r2 = "description"
            java.lang.String r2 = r0.getString(r2)     // Catch: org.json.JSONException -> L21
            java.lang.String r3 = "url"
            java.lang.String r3 = r0.getString(r3)     // Catch: org.json.JSONException -> L21
            r4.onReceivedError(r1, r2, r3)     // Catch: org.json.JSONException -> L21
            goto L32
        L21:
            r1 = move-exception
            r1.printStackTrace()
            goto L32
        L26:
            java.lang.String r0 = "exit"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L32
            r4.finish()
            goto L33
        L32:
        L33:
            r0 = 0
            return r0
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(android.content.Intent r2) {
            r1 = this;
            super.onNewIntent(r2)
            org.apache.cordova.CordovaWebView r0 = r1.appView
            if (r0 == 0) goto Lc
            org.apache.cordova.CordovaWebView r0 = r1.appView
            r0.onNewIntent(r2)
        Lc:
            return
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem r3) {
            r2 = this;
            org.apache.cordova.CordovaWebView r0 = r2.appView
            if (r0 == 0) goto Lf
            org.apache.cordova.CordovaWebView r0 = r2.appView
            org.apache.cordova.PluginManager r0 = r0.getPluginManager()
            java.lang.String r1 = "onOptionsItemSelected"
            r0.postMessage(r1, r3)
        Lf:
            r0 = 1
            return r0
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
            r2 = this;
            super.onPause()
            java.lang.String r0 = org.apache.cordova.CordovaActivity.TAG
            java.lang.String r1 = "Paused the activity."
            org.apache.cordova.LOG.d(r0, r1)
            org.apache.cordova.CordovaWebView r0 = r2.appView
            if (r0 == 0) goto L21
            boolean r0 = r2.keepRunning
            if (r0 != 0) goto L1b
            org.apache.cordova.CordovaInterfaceImpl r0 = r2.cordovaInterface
            org.apache.cordova.CordovaPlugin r0 = r0.activityResultCallback
            if (r0 == 0) goto L19
            goto L1b
        L19:
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            org.apache.cordova.CordovaWebView r1 = r2.appView
            r1.handlePause(r0)
        L21:
            return
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu r3) {
            r2 = this;
            org.apache.cordova.CordovaWebView r0 = r2.appView
            if (r0 == 0) goto Lf
            org.apache.cordova.CordovaWebView r0 = r2.appView
            org.apache.cordova.PluginManager r0 = r0.getPluginManager()
            java.lang.String r1 = "onPrepareOptionsMenu"
            r0.postMessage(r1, r3)
        Lf:
            r0 = 1
            return r0
    }

    public void onReceivedError(int r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            r3 = r7
            org.apache.cordova.CordovaPreferences r0 = r7.preferences
            java.lang.String r1 = "errorUrl"
            r2 = 0
            java.lang.String r6 = r0.getString(r1, r2)
            if (r6 == 0) goto L21
            boolean r0 = r10.equals(r6)
            if (r0 != 0) goto L21
            org.apache.cordova.CordovaWebView r0 = r7.appView
            if (r0 == 0) goto L21
            org.apache.cordova.CordovaActivity$2 r0 = new org.apache.cordova.CordovaActivity$2
            r0.<init>(r7, r3, r6)
            r3.runOnUiThread(r0)
            r4 = r9
            r5 = r10
            goto L33
        L21:
            r0 = -2
            if (r8 == r0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            r2 = r0
            org.apache.cordova.CordovaActivity$3 r0 = new org.apache.cordova.CordovaActivity$3
            r1 = r7
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r3.runOnUiThread(r0)
        L33:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int r4, java.lang.String[] r5, int[] r6) {
            r3 = this;
            super.onRequestPermissionsResult(r4, r5, r6)
            org.apache.cordova.CordovaInterfaceImpl r0 = r3.cordovaInterface     // Catch: org.json.JSONException -> L9
            r0.onRequestPermissionResult(r4, r5, r6)     // Catch: org.json.JSONException -> L9
            goto L14
        L9:
            r0 = move-exception
            java.lang.String r1 = org.apache.cordova.CordovaActivity.TAG
            java.lang.String r2 = "JSONException: Parameters fed into the method are not valid"
            org.apache.cordova.LOG.d(r1, r2)
            r0.printStackTrace()
        L14:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
            r2 = this;
            super.onResume()
            java.lang.String r0 = org.apache.cordova.CordovaActivity.TAG
            java.lang.String r1 = "Resumed the activity."
            org.apache.cordova.LOG.d(r0, r1)
            org.apache.cordova.CordovaWebView r0 = r2.appView
            if (r0 != 0) goto Lf
            return
        Lf:
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L28
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.requestFocus()
        L28:
            org.apache.cordova.CordovaWebView r0 = r2.appView
            boolean r1 = r2.keepRunning
            r0.handleResume(r1)
            return
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle r2) {
            r1 = this;
            org.apache.cordova.CordovaInterfaceImpl r0 = r1.cordovaInterface
            r0.onSaveInstanceState(r2)
            super.onSaveInstanceState(r2)
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
            r2 = this;
            super.onStart()
            java.lang.String r0 = org.apache.cordova.CordovaActivity.TAG
            java.lang.String r1 = "Started the activity."
            org.apache.cordova.LOG.d(r0, r1)
            org.apache.cordova.CordovaWebView r0 = r2.appView
            if (r0 != 0) goto Lf
            return
        Lf:
            org.apache.cordova.CordovaWebView r0 = r2.appView
            r0.handleStart()
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
            r2 = this;
            super.onStop()
            java.lang.String r0 = org.apache.cordova.CordovaActivity.TAG
            java.lang.String r1 = "Stopped the activity."
            org.apache.cordova.LOG.d(r0, r1)
            org.apache.cordova.CordovaWebView r0 = r2.appView
            if (r0 != 0) goto Lf
            return
        Lf:
            org.apache.cordova.CordovaWebView r0 = r2.appView
            r0.handleStop()
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            super.onWindowFocusChanged(r2)
            if (r2 == 0) goto Lc
            boolean r0 = r1.immersiveMode
            if (r0 == 0) goto Lc
            r1.setImmersiveUiVisibility()
        Lc:
            return
    }

    protected void setImmersiveUiVisibility() {
            r3 = this;
            r0 = 5894(0x1706, float:8.259E-42)
            android.view.Window r1 = r3.getWindow()
            android.view.View r1 = r1.getDecorView()
            r2 = 5894(0x1706, float:8.259E-42)
            r1.setSystemUiVisibility(r2)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(android.content.Intent r2, int r3, android.os.Bundle r4) {
            r1 = this;
            org.apache.cordova.CordovaInterfaceImpl r0 = r1.cordovaInterface
            r0.setActivityResultRequestCode(r3)
            super.startActivityForResult(r2, r3, r4)
            return
    }
}
