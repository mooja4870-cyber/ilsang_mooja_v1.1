package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class WebMessageListenerAdapter implements org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface {
    private final androidx.webkit.WebViewCompat.WebMessageListener mWebMessageListener;

    public WebMessageListenerAdapter(androidx.webkit.WebViewCompat.WebMessageListener r1) {
            r0 = this;
            r0.<init>()
            r0.mWebMessageListener = r1
            return
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public java.lang.String[] getSupportedFeatures() {
            r3 = this;
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "WEB_MESSAGE_LISTENER"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "WEB_MESSAGE_ARRAY_BUFFER"
            r0[r1] = r2
            return r0
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
            r7 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r9)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r0
            androidx.webkit.WebMessageCompat r3 = androidx.webkit.internal.WebMessageAdapter.webMessageCompatFromBoundaryInterface(r0)
            if (r3 == 0) goto L1c
        Lf:
            androidx.webkit.internal.JavaScriptReplyProxyImpl r6 = androidx.webkit.internal.JavaScriptReplyProxyImpl.forInvocationHandler(r12)
            androidx.webkit.WebViewCompat$WebMessageListener r1 = r7.mWebMessageListener
            r2 = r8
            r4 = r10
            r5 = r11
            r1.onPostMessage(r2, r3, r4, r5, r6)
            goto L1f
        L1c:
            r2 = r8
            r4 = r10
            r5 = r11
        L1f:
            return
    }
}
