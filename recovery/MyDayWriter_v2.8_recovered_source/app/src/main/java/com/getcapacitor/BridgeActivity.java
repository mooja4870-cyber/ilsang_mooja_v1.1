package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class BridgeActivity extends androidx.appcompat.app.AppCompatActivity {
    protected int activityDepth;
    protected com.getcapacitor.Bridge bridge;
    protected final com.getcapacitor.Bridge.Builder bridgeBuilder;
    protected com.getcapacitor.CapConfig config;
    protected java.util.List<java.lang.Class<? extends com.getcapacitor.Plugin>> initialPlugins;
    protected boolean keepRunning;

    public BridgeActivity() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.keepRunning = r0
            r0 = 0
            r1.activityDepth = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.initialPlugins = r0
            com.getcapacitor.Bridge$Builder r0 = new com.getcapacitor.Bridge$Builder
            r0.<init>(r1)
            r1.bridgeBuilder = r0
            return
    }

    public com.getcapacitor.Bridge getBridge() {
            r1 = this;
            com.getcapacitor.Bridge r0 = r1.bridge
            return r0
    }

    protected void load() {
            r2 = this;
            java.lang.String r0 = "Starting BridgeActivity"
            com.getcapacitor.Logger.debug(r0)
            com.getcapacitor.Bridge$Builder r0 = r2.bridgeBuilder
            java.util.List<java.lang.Class<? extends com.getcapacitor.Plugin>> r1 = r2.initialPlugins
            com.getcapacitor.Bridge$Builder r0 = r0.addPlugins(r1)
            com.getcapacitor.CapConfig r1 = r2.config
            com.getcapacitor.Bridge$Builder r0 = r0.setConfig(r1)
            com.getcapacitor.Bridge r0 = r0.create()
            r2.bridge = r0
            com.getcapacitor.Bridge r0 = r2.bridge
            boolean r0 = r0.shouldKeepRunning()
            r2.keepRunning = r0
            android.content.Intent r0 = r2.getIntent()
            r2.onNewIntent(r0)
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            com.getcapacitor.Bridge r0 = r1.bridge
            if (r0 != 0) goto L5
            return
        L5:
            com.getcapacitor.Bridge r0 = r1.bridge
            boolean r0 = r0.onActivityResult(r2, r3, r4)
            if (r0 != 0) goto L10
            super.onActivityResult(r2, r3, r4)
        L10:
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            com.getcapacitor.Bridge r0 = r1.bridge
            if (r0 != 0) goto L8
            return
        L8:
            com.getcapacitor.Bridge r0 = r1.bridge
            r0.onConfigurationChanged(r2)
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            com.getcapacitor.Bridge$Builder r0 = r3.bridgeBuilder
            r0.setInstanceState(r4)
            android.app.Application r0 = r3.getApplication()
            int r1 = com.getcapacitor.android.R.style.AppTheme_NoActionBar
            r0.setTheme(r1)
            int r0 = com.getcapacitor.android.R.style.AppTheme_NoActionBar
            r3.setTheme(r0)
            int r0 = com.getcapacitor.android.R.layout.capacitor_bridge_layout_main     // Catch: java.lang.Exception -> L39
            r3.setContentView(r0)     // Catch: java.lang.Exception -> L39
            com.getcapacitor.PluginManager r0 = new com.getcapacitor.PluginManager
            android.content.res.AssetManager r1 = r3.getAssets()
            r0.<init>(r1)
            com.getcapacitor.Bridge$Builder r1 = r3.bridgeBuilder     // Catch: com.getcapacitor.PluginLoadException -> L2f
            java.util.List r2 = r0.loadPluginClasses()     // Catch: com.getcapacitor.PluginLoadException -> L2f
            r1.addPlugins(r2)     // Catch: com.getcapacitor.PluginLoadException -> L2f
            goto L35
        L2f:
            r1 = move-exception
            java.lang.String r2 = "Error loading plugins."
            com.getcapacitor.Logger.error(r2, r1)
        L35:
            r3.load()
            return
        L39:
            r0 = move-exception
            int r1 = com.getcapacitor.android.R.layout.no_webview
            r3.setContentView(r1)
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            com.getcapacitor.Bridge r0 = r1.bridge
            if (r0 == 0) goto L11
            com.getcapacitor.Bridge r0 = r1.bridge
            r0.onDestroy()
            java.lang.String r0 = "App destroyed"
            com.getcapacitor.Logger.debug(r0)
        L11:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            com.getcapacitor.Bridge r0 = r1.bridge
            if (r0 == 0) goto Lc
            com.getcapacitor.Bridge r0 = r1.bridge
            r0.onDetachedFromWindow()
        Lc:
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(android.content.Intent r2) {
            r1 = this;
            super.onNewIntent(r2)
            com.getcapacitor.Bridge r0 = r1.bridge
            if (r0 == 0) goto L10
            if (r2 != 0) goto La
            goto L10
        La:
            com.getcapacitor.Bridge r0 = r1.bridge
            r0.onNewIntent(r2)
            return
        L10:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
            r1 = this;
            super.onPause()
            com.getcapacitor.Bridge r0 = r1.bridge
            if (r0 == 0) goto L11
            com.getcapacitor.Bridge r0 = r1.bridge
            r0.onPause()
            java.lang.String r0 = "App paused"
            com.getcapacitor.Logger.debug(r0)
        L11:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int r2, java.lang.String[] r3, int[] r4) {
            r1 = this;
            com.getcapacitor.Bridge r0 = r1.bridge
            if (r0 != 0) goto L5
            return
        L5:
            com.getcapacitor.Bridge r0 = r1.bridge
            boolean r0 = r0.onRequestPermissionsResult(r2, r3, r4)
            if (r0 != 0) goto L10
            super.onRequestPermissionsResult(r2, r3, r4)
        L10:
            return
    }

    @Override // android.app.Activity
    public void onRestart() {
            r1 = this;
            super.onRestart()
            com.getcapacitor.Bridge r0 = r1.bridge
            if (r0 == 0) goto L11
            com.getcapacitor.Bridge r0 = r1.bridge
            r0.onRestart()
            java.lang.String r0 = "App restarted"
            com.getcapacitor.Logger.debug(r0)
        L11:
            return
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
            r2 = this;
            super.onResume()
            com.getcapacitor.Bridge r0 = r2.bridge
            if (r0 == 0) goto L1b
            com.getcapacitor.Bridge r0 = r2.bridge
            com.getcapacitor.App r0 = r0.getApp()
            r1 = 1
            r0.fireStatusChange(r1)
            com.getcapacitor.Bridge r0 = r2.bridge
            r0.onResume()
            java.lang.String r0 = "App resumed"
            com.getcapacitor.Logger.debug(r0)
        L1b:
            return
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle r2) {
            r1 = this;
            super.onSaveInstanceState(r2)
            com.getcapacitor.Bridge r0 = r1.bridge
            if (r0 == 0) goto Lc
            com.getcapacitor.Bridge r0 = r1.bridge
            r0.saveInstanceState(r2)
        Lc:
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
            r1 = this;
            super.onStart()
            int r0 = r1.activityDepth
            int r0 = r0 + 1
            r1.activityDepth = r0
            com.getcapacitor.Bridge r0 = r1.bridge
            if (r0 == 0) goto L17
            com.getcapacitor.Bridge r0 = r1.bridge
            r0.onStart()
            java.lang.String r0 = "App started"
            com.getcapacitor.Logger.debug(r0)
        L17:
            return
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
            r2 = this;
            super.onStop()
            com.getcapacitor.Bridge r0 = r2.bridge
            if (r0 == 0) goto L29
            int r0 = r2.activityDepth
            int r0 = r0 + (-1)
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            r2.activityDepth = r0
            int r0 = r2.activityDepth
            if (r0 != 0) goto L1f
            com.getcapacitor.Bridge r0 = r2.bridge
            com.getcapacitor.App r0 = r0.getApp()
            r0.fireStatusChange(r1)
        L1f:
            com.getcapacitor.Bridge r0 = r2.bridge
            r0.onStop()
            java.lang.String r0 = "App stopped"
            com.getcapacitor.Logger.debug(r0)
        L29:
            return
    }

    public void registerPlugin(java.lang.Class<? extends com.getcapacitor.Plugin> r2) {
            r1 = this;
            com.getcapacitor.Bridge$Builder r0 = r1.bridgeBuilder
            r0.addPlugin(r2)
            return
    }

    public void registerPlugins(java.util.List<java.lang.Class<? extends com.getcapacitor.Plugin>> r2) {
            r1 = this;
            com.getcapacitor.Bridge$Builder r0 = r1.bridgeBuilder
            r0.addPlugins(r2)
            return
    }
}
