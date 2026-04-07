package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class PluginManager {
    private static java.lang.String DEFAULT_HOSTNAME;
    private static java.lang.String SCHEME_HTTPS;
    private static final int SLOW_EXEC_WARNING_THRESHOLD = 0;
    private static java.lang.String TAG;
    private final org.apache.cordova.CordovaWebView app;
    private final org.apache.cordova.CordovaInterface ctx;
    private final java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> entryMap;
    private boolean isInitialized;
    private org.apache.cordova.CordovaPlugin permissionRequester;
    private final java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> pluginMap;

    static {
            java.lang.String r0 = "PluginManager"
            org.apache.cordova.PluginManager.TAG = r0
            java.lang.String r0 = "https"
            org.apache.cordova.PluginManager.SCHEME_HTTPS = r0
            java.lang.String r0 = "localhost"
            org.apache.cordova.PluginManager.DEFAULT_HOSTNAME = r0
            boolean r0 = android.os.Debug.isDebuggerConnected()
            if (r0 == 0) goto L15
            r0 = 60
            goto L17
        L15:
            r0 = 16
        L17:
            org.apache.cordova.PluginManager.SLOW_EXEC_WARNING_THRESHOLD = r0
            return
    }

    public PluginManager(org.apache.cordova.CordovaWebView r2, org.apache.cordova.CordovaInterface r3, java.util.Collection<org.apache.cordova.PluginEntry> r4) {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r1.pluginMap = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r1.entryMap = r0
            r1.ctx = r3
            r1.app = r2
            r1.setPluginEntries(r4)
            return
    }

    private java.lang.String getLaunchUrlPrefix() {
            r4 = this;
            org.apache.cordova.CordovaWebView r0 = r4.app
            org.apache.cordova.CordovaPreferences r0 = r0.getPreferences()
            java.lang.String r1 = "AndroidInsecureFileModeEnabled"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L51
            org.apache.cordova.CordovaWebView r0 = r4.app
            org.apache.cordova.CordovaPreferences r0 = r0.getPreferences()
            java.lang.String r1 = "scheme"
            java.lang.String r2 = org.apache.cordova.PluginManager.SCHEME_HTTPS
            java.lang.String r0 = r0.getString(r1, r2)
            java.lang.String r0 = r0.toLowerCase()
            org.apache.cordova.CordovaWebView r1 = r4.app
            org.apache.cordova.CordovaPreferences r1 = r1.getPreferences()
            java.lang.String r2 = "hostname"
            java.lang.String r3 = org.apache.cordova.PluginManager.DEFAULT_HOSTNAME
            java.lang.String r1 = r1.getString(r2, r3)
            java.lang.String r1 = r1.toLowerCase()
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
        L51:
            java.lang.String r0 = "file://"
            return r0
    }

    private org.apache.cordova.CordovaPlugin instantiatePlugin(java.lang.String r6) {
            r5 = this;
            r0 = 0
            r1 = 0
            if (r6 == 0) goto L14
            java.lang.String r2 = ""
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Exception -> L12
            if (r2 != 0) goto L14
            java.lang.Class r2 = java.lang.Class.forName(r6)     // Catch: java.lang.Exception -> L12
            r1 = r2
            goto L14
        L12:
            r1 = move-exception
            goto L2a
        L14:
            if (r1 == 0) goto L18
            r2 = 1
            goto L19
        L18:
            r2 = 0
        L19:
            java.lang.Class<org.apache.cordova.CordovaPlugin> r3 = org.apache.cordova.CordovaPlugin.class
            boolean r3 = r3.isAssignableFrom(r1)     // Catch: java.lang.Exception -> L12
            r2 = r2 & r3
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.newInstance()     // Catch: java.lang.Exception -> L12
            org.apache.cordova.CordovaPlugin r2 = (org.apache.cordova.CordovaPlugin) r2     // Catch: java.lang.Exception -> L12
            r0 = r2
        L29:
            goto L4b
        L2a:
            r1.printStackTrace()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Error adding plugin "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r4 = "."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.println(r3)
        L4b:
            return r0
    }

    static /* synthetic */ void lambda$postMessage$0(java.lang.String r0, java.lang.Object r1, java.lang.String r2, org.apache.cordova.CordovaPlugin r3) {
            if (r3 == 0) goto L5
            r3.onMessage(r0, r1)
        L5:
            return
    }

    private void startupPlugins() {
            r6 = this;
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r0 = r6.entryMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r1 = r6.entryMap     // Catch: java.lang.Throwable -> L48
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L48
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L46
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L48
            org.apache.cordova.PluginEntry r2 = (org.apache.cordova.PluginEntry) r2     // Catch: java.lang.Throwable -> L48
            boolean r3 = r2.onload     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L23
            java.lang.String r3 = r2.service     // Catch: java.lang.Throwable -> L48
            r6.getPlugin(r3)     // Catch: java.lang.Throwable -> L48
            goto L45
        L23:
            java.lang.String r3 = org.apache.cordova.PluginManager.TAG     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r4.<init>()     // Catch: java.lang.Throwable -> L48
            java.lang.String r5 = "startupPlugins: put - "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L48
            java.lang.String r5 = r2.service     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L48
            org.apache.cordova.LOG.d(r3, r4)     // Catch: java.lang.Throwable -> L48
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r3 = r6.pluginMap     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = r2.service     // Catch: java.lang.Throwable -> L48
            r5 = 0
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L48
        L45:
            goto Ld
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        L48:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r1
    }

    public void addService(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.addService(r2, r3, r0)
            return
    }

    public void addService(java.lang.String r2, java.lang.String r3, boolean r4) {
            r1 = this;
            org.apache.cordova.PluginEntry r0 = new org.apache.cordova.PluginEntry
            r0.<init>(r2, r3, r4)
            r1.addService(r0)
            return
    }

    public void addService(org.apache.cordova.PluginEntry r6) {
            r5 = this;
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r0 = r5.entryMap
            java.lang.String r1 = r6.service
            r0.put(r1, r6)
            org.apache.cordova.CordovaPlugin r0 = r6.plugin
            if (r0 == 0) goto L3f
            org.apache.cordova.CordovaPlugin r0 = r6.plugin
            java.lang.String r1 = r6.service
            org.apache.cordova.CordovaInterface r2 = r5.ctx
            org.apache.cordova.CordovaWebView r3 = r5.app
            org.apache.cordova.CordovaWebView r4 = r5.app
            org.apache.cordova.CordovaPreferences r4 = r4.getPreferences()
            r0.privateInitialize(r1, r2, r3, r4)
            java.lang.String r0 = org.apache.cordova.PluginManager.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "addService: put - "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r6.service
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.apache.cordova.LOG.d(r0, r1)
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r0 = r5.pluginMap
            java.lang.String r1 = r6.service
            org.apache.cordova.CordovaPlugin r2 = r6.plugin
            r0.put(r1, r2)
        L3f:
            return
    }

    public void exec(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
            r10 = this;
            org.apache.cordova.CordovaPlugin r0 = r10.getPlugin(r11)
            if (r0 != 0) goto L2b
            java.lang.String r1 = org.apache.cordova.PluginManager.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "exec() call to unknown plugin: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.String r2 = r2.toString()
            org.apache.cordova.LOG.d(r1, r2)
            org.apache.cordova.PluginResult r1 = new org.apache.cordova.PluginResult
            org.apache.cordova.PluginResult$Status r2 = org.apache.cordova.PluginResult.Status.CLASS_NOT_FOUND_EXCEPTION
            r1.<init>(r2)
            org.apache.cordova.CordovaWebView r2 = r10.app
            r2.sendPluginResult(r1, r13)
            return
        L2b:
            org.apache.cordova.CallbackContext r1 = new org.apache.cordova.CallbackContext
            org.apache.cordova.CordovaWebView r2 = r10.app
            r1.<init>(r13, r2)
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
            boolean r4 = r0.execute(r12, r14, r1)     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
            long r5 = r5 - r2
            int r7 = org.apache.cordova.PluginManager.SLOW_EXEC_WARNING_THRESHOLD     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
            long r7 = (long) r7     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 <= 0) goto L78
            java.lang.String r7 = org.apache.cordova.PluginManager.TAG     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
            r8.<init>()     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
            java.lang.String r9 = "THREAD WARNING: exec() call to "
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
            java.lang.StringBuilder r8 = r8.append(r11)     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
            java.lang.String r9 = "."
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
            java.lang.StringBuilder r8 = r8.append(r12)     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
            java.lang.String r9 = " blocked the main thread for "
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
            java.lang.StringBuilder r8 = r8.append(r5)     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
            java.lang.String r9 = "ms. Plugin should use CordovaInterface.getThreadPool()."
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
            org.apache.cordova.LOG.w(r7, r8)     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
        L78:
            if (r4 != 0) goto La0
            org.apache.cordova.PluginResult r7 = new org.apache.cordova.PluginResult     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
            org.apache.cordova.PluginResult$Status r8 = org.apache.cordova.PluginResult.Status.INVALID_ACTION     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
            r7.<init>(r8)     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
            r1.sendPluginResult(r7)     // Catch: java.lang.Exception -> L85 org.json.JSONException -> L95
            goto La0
        L85:
            r2 = move-exception
            java.lang.String r3 = org.apache.cordova.PluginManager.TAG
            java.lang.String r4 = "Uncaught exception from plugin"
            org.apache.cordova.LOG.e(r3, r4, r2)
            java.lang.String r3 = r2.getMessage()
            r1.error(r3)
            goto La1
        L95:
            r2 = move-exception
            org.apache.cordova.PluginResult r3 = new org.apache.cordova.PluginResult
            org.apache.cordova.PluginResult$Status r4 = org.apache.cordova.PluginResult.Status.JSON_EXCEPTION
            r3.<init>(r4)
            r1.sendPluginResult(r3)
        La0:
        La1:
            return
    }

    public org.apache.cordova.CordovaPlugin getPlugin(java.lang.String r6) {
            r5 = this;
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r0 = r5.pluginMap
            java.lang.Object r0 = r0.get(r6)
            org.apache.cordova.CordovaPlugin r0 = (org.apache.cordova.CordovaPlugin) r0
            if (r0 != 0) goto L4d
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r1 = r5.entryMap
            java.lang.Object r1 = r1.get(r6)
            org.apache.cordova.PluginEntry r1 = (org.apache.cordova.PluginEntry) r1
            if (r1 != 0) goto L16
            r2 = 0
            return r2
        L16:
            org.apache.cordova.CordovaPlugin r2 = r1.plugin
            if (r2 == 0) goto L1d
            org.apache.cordova.CordovaPlugin r0 = r1.plugin
            goto L23
        L1d:
            java.lang.String r2 = r1.pluginClass
            org.apache.cordova.CordovaPlugin r0 = r5.instantiatePlugin(r2)
        L23:
            org.apache.cordova.CordovaInterface r2 = r5.ctx
            org.apache.cordova.CordovaWebView r3 = r5.app
            org.apache.cordova.CordovaWebView r4 = r5.app
            org.apache.cordova.CordovaPreferences r4 = r4.getPreferences()
            r0.privateInitialize(r6, r2, r3, r4)
            java.lang.String r2 = org.apache.cordova.PluginManager.TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getPlugin - put: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r3 = r3.toString()
            org.apache.cordova.LOG.d(r2, r3)
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r2 = r5.pluginMap
            r2.put(r6, r0)
        L4d:
            return r0
    }

    public java.util.Collection<org.apache.cordova.PluginEntry> getPluginEntries() {
            r1 = this;
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r0 = r1.entryMap
            java.util.Collection r0 = r0.values()
            return r0
    }

    public java.util.ArrayList<org.apache.cordova.CordovaPluginPathHandler> getPluginPathHandlers() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r1 = r4.pluginMap
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()
            org.apache.cordova.CordovaPlugin r2 = (org.apache.cordova.CordovaPlugin) r2
            if (r2 == 0) goto L2a
            org.apache.cordova.CordovaPluginPathHandler r3 = r2.getPathHandler()
            if (r3 == 0) goto L2a
            org.apache.cordova.CordovaPluginPathHandler r3 = r2.getPathHandler()
            r0.add(r3)
        L2a:
            goto Lf
        L2b:
            return r0
    }

    public void init() {
            r2 = this;
            java.lang.String r0 = org.apache.cordova.PluginManager.TAG
            java.lang.String r1 = "init()"
            org.apache.cordova.LOG.d(r0, r1)
            r0 = 1
            r2.isInitialized = r0
            r0 = 0
            r2.onPause(r0)
            r2.onDestroy()
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r0 = r2.pluginMap
            r0.clear()
            r2.startupPlugins()
            return
    }

    public void onConfigurationChanged(android.content.res.Configuration r4) {
            r3 = this;
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r0 = r3.pluginMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r1 = r3.pluginMap     // Catch: java.lang.Throwable -> L21
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L21
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            org.apache.cordova.CordovaPlugin r2 = (org.apache.cordova.CordovaPlugin) r2     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1e
            r2.onConfigurationChanged(r4)     // Catch: java.lang.Throwable -> L21
        L1e:
            goto Ld
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r1
    }

    public void onDestroy() {
            r3 = this;
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r0 = r3.pluginMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r1 = r3.pluginMap     // Catch: java.lang.Throwable -> L21
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L21
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            org.apache.cordova.CordovaPlugin r2 = (org.apache.cordova.CordovaPlugin) r2     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1e
            r2.onDestroy()     // Catch: java.lang.Throwable -> L21
        L1e:
            goto Ld
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r1
    }

    public void onNewIntent(android.content.Intent r4) {
            r3 = this;
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r0 = r3.pluginMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r1 = r3.pluginMap     // Catch: java.lang.Throwable -> L21
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L21
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            org.apache.cordova.CordovaPlugin r2 = (org.apache.cordova.CordovaPlugin) r2     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1e
            r2.onNewIntent(r4)     // Catch: java.lang.Throwable -> L21
        L1e:
            goto Ld
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r1
    }

    public boolean onOverrideUrlLoading(java.lang.String r6) {
            r5 = this;
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r0 = r5.entryMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r1 = r5.entryMap     // Catch: java.lang.Throwable -> L32
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L32
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L32
            org.apache.cordova.PluginEntry r2 = (org.apache.cordova.PluginEntry) r2     // Catch: java.lang.Throwable -> L32
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r3 = r5.pluginMap     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = r2.service     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L32
            org.apache.cordova.CordovaPlugin r3 = (org.apache.cordova.CordovaPlugin) r3     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L2e
            boolean r4 = r3.onOverrideUrlLoading(r6)     // Catch: java.lang.Throwable -> L32
            if (r4 == 0) goto L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r0 = 1
            return r0
        L2e:
            goto Ld
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r0 = 0
            return r0
        L32:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r1
    }

    public void onPause(boolean r4) {
            r3 = this;
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r0 = r3.pluginMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r1 = r3.pluginMap     // Catch: java.lang.Throwable -> L21
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L21
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            org.apache.cordova.CordovaPlugin r2 = (org.apache.cordova.CordovaPlugin) r2     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1e
            r2.onPause(r4)     // Catch: java.lang.Throwable -> L21
        L1e:
            goto Ld
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r1
    }

    public boolean onReceivedClientCertRequest(org.apache.cordova.CordovaWebView r5, org.apache.cordova.ICordovaClientCertRequest r6) {
            r4 = this;
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r0 = r4.pluginMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r1 = r4.pluginMap     // Catch: java.lang.Throwable -> L2a
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2a
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2a
            org.apache.cordova.CordovaPlugin r2 = (org.apache.cordova.CordovaPlugin) r2     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L26
            org.apache.cordova.CordovaWebView r3 = r4.app     // Catch: java.lang.Throwable -> L2a
            boolean r3 = r2.onReceivedClientCertRequest(r3, r6)     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            r0 = 1
            return r0
        L26:
            goto Ld
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            r0 = 0
            return r0
        L2a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r1
    }

    public boolean onReceivedHttpAuthRequest(org.apache.cordova.CordovaWebView r5, org.apache.cordova.ICordovaHttpAuthHandler r6, java.lang.String r7, java.lang.String r8) {
            r4 = this;
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r0 = r4.pluginMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r1 = r4.pluginMap     // Catch: java.lang.Throwable -> L2a
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2a
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2a
            org.apache.cordova.CordovaPlugin r2 = (org.apache.cordova.CordovaPlugin) r2     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L26
            org.apache.cordova.CordovaWebView r3 = r4.app     // Catch: java.lang.Throwable -> L2a
            boolean r3 = r2.onReceivedHttpAuthRequest(r3, r6, r7, r8)     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            r0 = 1
            return r0
        L26:
            goto Ld
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            r0 = 0
            return r0
        L2a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r1
    }

    public boolean onRenderProcessGone(android.webkit.WebView r7, android.webkit.RenderProcessGoneDetail r8) {
            r6 = this;
            r0 = 0
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r1 = r6.entryMap
            monitor-enter(r1)
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r2 = r6.entryMap     // Catch: java.lang.Throwable -> L30
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L30
        Le:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L30
            org.apache.cordova.PluginEntry r3 = (org.apache.cordova.PluginEntry) r3     // Catch: java.lang.Throwable -> L30
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r4 = r6.pluginMap     // Catch: java.lang.Throwable -> L30
            java.lang.String r5 = r3.service     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L30
            org.apache.cordova.CordovaPlugin r4 = (org.apache.cordova.CordovaPlugin) r4     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L2d
            boolean r5 = r4.onRenderProcessGone(r7, r8)     // Catch: java.lang.Throwable -> L30
            if (r5 == 0) goto L2d
            r0 = 1
        L2d:
            goto Le
        L2e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            return r0
        L30:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            throw r2
    }

    public void onReset() {
            r3 = this;
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r0 = r3.pluginMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r1 = r3.pluginMap     // Catch: java.lang.Throwable -> L21
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L21
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            org.apache.cordova.CordovaPlugin r2 = (org.apache.cordova.CordovaPlugin) r2     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1e
            r2.onReset()     // Catch: java.lang.Throwable -> L21
        L1e:
            goto Ld
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r1
    }

    public void onResume(boolean r4) {
            r3 = this;
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r0 = r3.pluginMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r1 = r3.pluginMap     // Catch: java.lang.Throwable -> L21
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L21
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            org.apache.cordova.CordovaPlugin r2 = (org.apache.cordova.CordovaPlugin) r2     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1e
            r2.onResume(r4)     // Catch: java.lang.Throwable -> L21
        L1e:
            goto Ld
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r1
    }

    public android.os.Bundle onSaveInstanceState() {
            r6 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r1 = r6.pluginMap
            monitor-enter(r1)
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r2 = r6.pluginMap     // Catch: java.lang.Throwable -> L30
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L30
        L12:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L30
            org.apache.cordova.CordovaPlugin r3 = (org.apache.cordova.CordovaPlugin) r3     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L2d
            android.os.Bundle r4 = r3.onSaveInstanceState()     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L2d
            java.lang.String r5 = r3.getServiceName()     // Catch: java.lang.Throwable -> L30
            r0.putBundle(r5, r4)     // Catch: java.lang.Throwable -> L30
        L2d:
            goto L12
        L2e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            return r0
        L30:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            throw r2
    }

    public void onStart() {
            r3 = this;
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r0 = r3.pluginMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r1 = r3.pluginMap     // Catch: java.lang.Throwable -> L21
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L21
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            org.apache.cordova.CordovaPlugin r2 = (org.apache.cordova.CordovaPlugin) r2     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1e
            r2.onStart()     // Catch: java.lang.Throwable -> L21
        L1e:
            goto Ld
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r1
    }

    public void onStop() {
            r3 = this;
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r0 = r3.pluginMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r1 = r3.pluginMap     // Catch: java.lang.Throwable -> L21
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L21
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            org.apache.cordova.CordovaPlugin r2 = (org.apache.cordova.CordovaPlugin) r2     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1e
            r2.onStop()     // Catch: java.lang.Throwable -> L21
        L1e:
            goto Ld
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r1
    }

    public java.lang.Object postMessage(java.lang.String r4, java.lang.Object r5) {
            r3 = this;
            java.lang.String r0 = org.apache.cordova.PluginManager.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "postMessage: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            org.apache.cordova.LOG.d(r0, r1)
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r0 = r3.pluginMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r1 = r3.pluginMap     // Catch: java.lang.Throwable -> L2d
            org.apache.cordova.PluginManager$$ExternalSyntheticLambda0 r2 = new org.apache.cordova.PluginManager$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L2d
            r1.forEach(r2)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            org.apache.cordova.CordovaInterface r0 = r3.ctx
            java.lang.Object r0 = r0.onMessage(r4, r5)
            return r0
        L2d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r1
    }

    android.net.Uri remapUri(android.net.Uri r5) {
            r4 = this;
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r0 = r4.pluginMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r1 = r4.pluginMap     // Catch: java.lang.Throwable -> L27
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L27
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L27
            org.apache.cordova.CordovaPlugin r2 = (org.apache.cordova.CordovaPlugin) r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L23
            android.net.Uri r3 = r2.remapUri(r5)     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return r3
        L23:
            goto Ld
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            r0 = 0
            return r0
        L27:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r1
    }

    public void setPluginEntries(java.util.Collection<org.apache.cordova.PluginEntry> r3) {
            r2 = this;
            boolean r0 = r2.isInitialized
            if (r0 == 0) goto L15
            r0 = 0
            r2.onPause(r0)
            r2.onDestroy()
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r0 = r2.pluginMap
            r0.clear()
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r0 = r2.entryMap
            r0.clear()
        L15:
            java.util.Iterator r0 = r3.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            org.apache.cordova.PluginEntry r1 = (org.apache.cordova.PluginEntry) r1
            r2.addService(r1)
            goto L19
        L29:
            boolean r0 = r2.isInitialized
            if (r0 == 0) goto L30
            r2.startupPlugins()
        L30:
            return
    }

    public boolean shouldAllowBridgeAccess(java.lang.String r6) {
            r5 = this;
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r0 = r5.entryMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r1 = r5.entryMap     // Catch: java.lang.Throwable -> L3c
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3c
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L3c
            org.apache.cordova.PluginEntry r2 = (org.apache.cordova.PluginEntry) r2     // Catch: java.lang.Throwable -> L3c
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r3 = r5.pluginMap     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = r2.service     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L3c
            org.apache.cordova.CordovaPlugin r3 = (org.apache.cordova.CordovaPlugin) r3     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L31
            java.lang.Boolean r4 = r3.shouldAllowBridgeAccess(r6)     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L31
            boolean r1 = r4.booleanValue()     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            return r1
        L31:
            goto Ld
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r5.getLaunchUrlPrefix()
            boolean r0 = r6.startsWith(r0)
            return r0
        L3c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r1
    }

    public boolean shouldAllowNavigation(java.lang.String r6) {
            r5 = this;
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r0 = r5.entryMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r1 = r5.entryMap     // Catch: java.lang.Throwable -> L4a
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L4a
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L4a
            org.apache.cordova.PluginEntry r2 = (org.apache.cordova.PluginEntry) r2     // Catch: java.lang.Throwable -> L4a
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r3 = r5.pluginMap     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = r2.service     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L4a
            org.apache.cordova.CordovaPlugin r3 = (org.apache.cordova.CordovaPlugin) r3     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L31
            java.lang.Boolean r4 = r3.shouldAllowNavigation(r6)     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L31
            boolean r1 = r4.booleanValue()     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L31:
            goto Ld
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = r5.getLaunchUrlPrefix()
            boolean r0 = r6.startsWith(r0)
            if (r0 != 0) goto L48
            java.lang.String r0 = "about:blank"
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L46
            goto L48
        L46:
            r0 = 0
            goto L49
        L48:
            r0 = 1
        L49:
            return r0
        L4a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r1
    }

    public boolean shouldAllowRequest(java.lang.String r6) {
            r5 = this;
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r0 = r5.entryMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r1 = r5.entryMap     // Catch: java.lang.Throwable -> L69
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L69
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L69
            org.apache.cordova.PluginEntry r2 = (org.apache.cordova.PluginEntry) r2     // Catch: java.lang.Throwable -> L69
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r3 = r5.pluginMap     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = r2.service     // Catch: java.lang.Throwable -> L69
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L69
            org.apache.cordova.CordovaPlugin r3 = (org.apache.cordova.CordovaPlugin) r3     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L31
            java.lang.Boolean r4 = r3.shouldAllowRequest(r6)     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L31
            boolean r1 = r4.booleanValue()     // Catch: java.lang.Throwable -> L69
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            return r1
        L31:
            goto Ld
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = "blob:"
            boolean r0 = r6.startsWith(r0)
            r1 = 1
            if (r0 != 0) goto L68
            java.lang.String r0 = "data:"
            boolean r0 = r6.startsWith(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "about:blank"
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L4d
            goto L68
        L4d:
            java.lang.String r0 = "https://ssl.gstatic.com/accessibility/javascript/android/"
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L56
            return r1
        L56:
            java.lang.String r0 = "file://"
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L66
            java.lang.String r0 = "/app_webview/"
            boolean r0 = r6.contains(r0)
            r0 = r0 ^ r1
            return r0
        L66:
            r0 = 0
            return r0
        L68:
            return r1
        L69:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            throw r1
    }

    public java.lang.Boolean shouldOpenExternalUrl(java.lang.String r6) {
            r5 = this;
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r0 = r5.entryMap
            monitor-enter(r0)
            java.util.Map<java.lang.String, org.apache.cordova.PluginEntry> r1 = r5.entryMap     // Catch: java.lang.Throwable -> L35
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L35
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L35
            org.apache.cordova.PluginEntry r2 = (org.apache.cordova.PluginEntry) r2     // Catch: java.lang.Throwable -> L35
            java.util.Map<java.lang.String, org.apache.cordova.CordovaPlugin> r3 = r5.pluginMap     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = r2.service     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L35
            org.apache.cordova.CordovaPlugin r3 = (org.apache.cordova.CordovaPlugin) r3     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L2d
            java.lang.Boolean r4 = r3.shouldOpenExternalUrl(r6)     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L2d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            return r4
        L2d:
            goto Ld
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L35:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r1
    }
}
