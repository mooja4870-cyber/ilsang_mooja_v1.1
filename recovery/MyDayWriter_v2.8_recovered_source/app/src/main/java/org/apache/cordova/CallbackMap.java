package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class CallbackMap {
    private android.util.SparseArray<android.util.Pair<org.apache.cordova.CordovaPlugin, java.lang.Integer>> callbacks;
    private int currentCallbackId;

    public CallbackMap() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.currentCallbackId = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.callbacks = r0
            return
    }

    public synchronized android.util.Pair<org.apache.cordova.CordovaPlugin, java.lang.Integer> getAndRemoveCallback(int r3) {
            r2 = this;
            monitor-enter(r2)
            android.util.SparseArray<android.util.Pair<org.apache.cordova.CordovaPlugin, java.lang.Integer>> r0 = r2.callbacks     // Catch: java.lang.Throwable -> L10
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L10
            android.util.Pair r0 = (android.util.Pair) r0     // Catch: java.lang.Throwable -> L10
            android.util.SparseArray<android.util.Pair<org.apache.cordova.CordovaPlugin, java.lang.Integer>> r1 = r2.callbacks     // Catch: java.lang.Throwable -> L10
            r1.remove(r3)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r2)
            return r0
        L10:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    public synchronized int registerCallback(org.apache.cordova.CordovaPlugin r5, int r6) {
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.currentCallbackId     // Catch: java.lang.Throwable -> L17
            int r1 = r0 + 1
            r4.currentCallbackId = r1     // Catch: java.lang.Throwable -> L17
            android.util.SparseArray<android.util.Pair<org.apache.cordova.CordovaPlugin, java.lang.Integer>> r1 = r4.callbacks     // Catch: java.lang.Throwable -> L17
            android.util.Pair r2 = new android.util.Pair     // Catch: java.lang.Throwable -> L17
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L17
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L17
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r4)
            return r0
        L17:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L17
            throw r5
    }
}
