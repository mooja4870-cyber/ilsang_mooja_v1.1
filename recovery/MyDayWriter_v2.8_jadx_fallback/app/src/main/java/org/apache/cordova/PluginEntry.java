package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public final class PluginEntry {
    public final boolean onload;
    public final org.apache.cordova.CordovaPlugin plugin;
    public final java.lang.String pluginClass;
    public final java.lang.String service;

    public PluginEntry(java.lang.String r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    private PluginEntry(java.lang.String r1, java.lang.String r2, boolean r3, org.apache.cordova.CordovaPlugin r4) {
            r0 = this;
            r0.<init>()
            r0.service = r1
            r0.pluginClass = r2
            r0.onload = r3
            r0.plugin = r4
            return
    }

    public PluginEntry(java.lang.String r3, org.apache.cordova.CordovaPlugin r4) {
            r2 = this;
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 1
            r2.<init>(r3, r0, r1, r4)
            return
    }

    public PluginEntry(java.lang.String r2, org.apache.cordova.CordovaPlugin r3, boolean r4) {
            r1 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            r1.<init>(r2, r0, r4, r3)
            return
    }
}
