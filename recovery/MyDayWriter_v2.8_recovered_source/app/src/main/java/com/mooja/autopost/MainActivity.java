package com.mooja.autopost;

/* JADX INFO: loaded from: classes6.dex */
public class MainActivity extends com.getcapacitor.BridgeActivity {
    public MainActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.getcapacitor.BridgeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle r2) {
            r1 = this;
            java.lang.Class<com.mooja.autopost.SecurePrefsPlugin> r0 = com.mooja.autopost.SecurePrefsPlugin.class
            r1.registerPlugin(r0)
            super.onCreate(r2)
            return
    }
}
