package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class CapacitorWebView extends android.webkit.WebView {
    private com.getcapacitor.Bridge bridge;
    private android.view.inputmethod.BaseInputConnection capInputConnection;

    public CapacitorWebView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            int r0 = r3.getAction()
            r1 = 2
            if (r0 != r1) goto L2a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "document.activeElement.value = document.activeElement.value + '"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getCharacters()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "';"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2.evaluateJavascript(r0, r1)
            r0 = 0
            return r0
        L2a:
            boolean r0 = super.dispatchKeyEvent(r3)
            return r0
    }

    @Override // android.webkit.WebView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r5) {
            r4 = this;
            com.getcapacitor.Bridge r0 = r4.bridge
            if (r0 == 0) goto Lb
            com.getcapacitor.Bridge r0 = r4.bridge
            com.getcapacitor.CapConfig r0 = r0.getConfig()
            goto L13
        Lb:
            android.content.Context r0 = r4.getContext()
            com.getcapacitor.CapConfig r0 = com.getcapacitor.CapConfig.loadDefault(r0)
        L13:
            boolean r1 = r0.isInputCaptured()
            if (r1 == 0) goto L28
            android.view.inputmethod.BaseInputConnection r2 = r4.capInputConnection
            if (r2 != 0) goto L25
            android.view.inputmethod.BaseInputConnection r2 = new android.view.inputmethod.BaseInputConnection
            r3 = 0
            r2.<init>(r4, r3)
            r4.capInputConnection = r2
        L25:
            android.view.inputmethod.BaseInputConnection r2 = r4.capInputConnection
            return r2
        L28:
            android.view.inputmethod.InputConnection r2 = super.onCreateInputConnection(r5)
            return r2
    }

    public void setBridge(com.getcapacitor.Bridge r1) {
            r0 = this;
            r0.bridge = r1
            return
    }
}
