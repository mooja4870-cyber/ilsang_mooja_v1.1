package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class App {
    private com.getcapacitor.App.AppRestoredListener appRestoredListener;
    private boolean isActive;
    private com.getcapacitor.App.AppStatusChangeListener statusChangeListener;

    public interface AppRestoredListener {
        void onAppRestored(com.getcapacitor.PluginResult r1);
    }

    public interface AppStatusChangeListener {
        void onAppStatusChanged(java.lang.Boolean r1);
    }

    public App() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.isActive = r0
            return
    }

    protected void fireRestoredResult(com.getcapacitor.PluginResult r2) {
            r1 = this;
            com.getcapacitor.App$AppRestoredListener r0 = r1.appRestoredListener
            if (r0 == 0) goto L9
            com.getcapacitor.App$AppRestoredListener r0 = r1.appRestoredListener
            r0.onAppRestored(r2)
        L9:
            return
    }

    public void fireStatusChange(boolean r3) {
            r2 = this;
            r2.isActive = r3
            com.getcapacitor.App$AppStatusChangeListener r0 = r2.statusChangeListener
            if (r0 == 0) goto Lf
            com.getcapacitor.App$AppStatusChangeListener r0 = r2.statusChangeListener
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.onAppStatusChanged(r1)
        Lf:
            return
    }

    public boolean isActive() {
            r1 = this;
            boolean r0 = r1.isActive
            return r0
    }

    public void setAppRestoredListener(com.getcapacitor.App.AppRestoredListener r1) {
            r0 = this;
            r0.appRestoredListener = r1
            return
    }

    public void setStatusChangeListener(com.getcapacitor.App.AppStatusChangeListener r1) {
            r0 = this;
            r0.statusChangeListener = r1
            return
    }
}
