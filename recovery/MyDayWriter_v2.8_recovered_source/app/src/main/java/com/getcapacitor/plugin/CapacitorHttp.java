package com.getcapacitor.plugin;

/* JADX INFO: loaded from: classes4.dex */
@com.getcapacitor.annotation.CapacitorPlugin(permissions = {@com.getcapacitor.annotation.Permission(alias = "HttpWrite", strings = {"android.permission.WRITE_EXTERNAL_STORAGE"}), @com.getcapacitor.annotation.Permission(alias = "HttpRead", strings = {"android.permission.READ_EXTERNAL_STORAGE"})})
public class CapacitorHttp extends com.getcapacitor.Plugin {
    private final java.util.Map<java.lang.Runnable, com.getcapacitor.PluginCall> activeRequests;
    private final java.util.concurrent.ExecutorService executor;


    /* JADX INFO: renamed from: -$$Nest$fgetactiveRequests, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.Map m133$$Nest$fgetactiveRequests(com.getcapacitor.plugin.CapacitorHttp r0) {
            java.util.Map<java.lang.Runnable, com.getcapacitor.PluginCall> r0 = r0.activeRequests
            return r0
    }

    public CapacitorHttp() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.activeRequests = r0
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            r1.executor = r0
            return
    }

    private void http(com.getcapacitor.PluginCall r3, java.lang.String r4) {
            r2 = this;
            com.getcapacitor.plugin.CapacitorHttp$1 r0 = new com.getcapacitor.plugin.CapacitorHttp$1
            r0.<init>(r2, r3, r4)
            java.util.concurrent.ExecutorService r1 = r2.executor
            boolean r1 = r1.isShutdown()
            if (r1 != 0) goto L18
            java.util.Map<java.lang.Runnable, com.getcapacitor.PluginCall> r1 = r2.activeRequests
            r1.put(r0, r3)
            java.util.concurrent.ExecutorService r1 = r2.executor
            r1.submit(r0)
            goto L1d
        L18:
            java.lang.String r1 = "Failed to execute request - Http Plugin was shutdown"
            r3.reject(r1)
        L1d:
            return
    }

    @com.getcapacitor.PluginMethod
    public void delete(com.getcapacitor.PluginCall r2) {
            r1 = this;
            java.lang.String r0 = "DELETE"
            r1.http(r2, r0)
            return
    }

    @com.getcapacitor.PluginMethod
    public void get(com.getcapacitor.PluginCall r2) {
            r1 = this;
            java.lang.String r0 = "GET"
            r1.http(r2, r0)
            return
    }

    @Override // com.getcapacitor.Plugin
    protected void handleOnDestroy() {
            r7 = this;
            super.handleOnDestroy()
            java.util.Map<java.lang.Runnable, com.getcapacitor.PluginCall> r0 = r7.activeRequests
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            java.lang.Object r3 = r1.getValue()
            com.getcapacitor.PluginCall r3 = (com.getcapacitor.PluginCall) r3
            com.getcapacitor.JSObject r4 = r3.getData()
            java.lang.String r5 = "activeCapacitorHttpUrlConnection"
            boolean r4 = r4.has(r5)
            if (r4 == 0) goto L49
        L32:
            com.getcapacitor.JSObject r4 = r3.getData()     // Catch: java.lang.Exception -> L48
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Exception -> L48
            com.getcapacitor.plugin.util.CapacitorHttpUrlConnection r4 = (com.getcapacitor.plugin.util.CapacitorHttpUrlConnection) r4     // Catch: java.lang.Exception -> L48
            r4.disconnect()     // Catch: java.lang.Exception -> L48
            com.getcapacitor.JSObject r6 = r3.getData()     // Catch: java.lang.Exception -> L48
            r6.remove(r5)     // Catch: java.lang.Exception -> L48
            goto L49
        L48:
            r4 = move-exception
        L49:
            com.getcapacitor.Bridge r4 = r7.getBridge()
            r4.releaseCall(r3)
            goto Ld
        L51:
            java.util.Map<java.lang.Runnable, com.getcapacitor.PluginCall> r0 = r7.activeRequests
            r0.clear()
            java.util.concurrent.ExecutorService r0 = r7.executor
            r0.shutdownNow()
            return
    }

    @android.webkit.JavascriptInterface
    public boolean isEnabled() {
            r3 = this;
            com.getcapacitor.Bridge r0 = r3.getBridge()
            com.getcapacitor.CapConfig r0 = r0.getConfig()
            java.lang.String r1 = "CapacitorHttp"
            com.getcapacitor.PluginConfig r0 = r0.getPluginConfiguration(r1)
            java.lang.String r1 = "enabled"
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            return r1
    }

    @Override // com.getcapacitor.Plugin
    public void load() {
            r2 = this;
            com.getcapacitor.Bridge r0 = r2.bridge
            android.webkit.WebView r0 = r0.getWebView()
            java.lang.String r1 = "CapacitorHttpAndroidInterface"
            r0.addJavascriptInterface(r2, r1)
            super.load()
            return
    }

    @com.getcapacitor.PluginMethod
    public void patch(com.getcapacitor.PluginCall r2) {
            r1 = this;
            java.lang.String r0 = "PATCH"
            r1.http(r2, r0)
            return
    }

    @com.getcapacitor.PluginMethod
    public void post(com.getcapacitor.PluginCall r2) {
            r1 = this;
            java.lang.String r0 = "POST"
            r1.http(r2, r0)
            return
    }

    @com.getcapacitor.PluginMethod
    public void put(com.getcapacitor.PluginCall r2) {
            r1 = this;
            java.lang.String r0 = "PUT"
            r1.http(r2, r0)
            return
    }

    @com.getcapacitor.PluginMethod
    public void request(com.getcapacitor.PluginCall r2) {
            r1 = this;
            r0 = 0
            r1.http(r2, r0)
            return
    }
}
