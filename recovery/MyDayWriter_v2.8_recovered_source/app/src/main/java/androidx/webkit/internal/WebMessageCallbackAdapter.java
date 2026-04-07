package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class WebMessageCallbackAdapter implements org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface {
    private final androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat mImpl;

    public WebMessageCallbackAdapter(androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public java.lang.String[] getSupportedFeatures() {
            r3 = this;
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "WEB_MESSAGE_CALLBACK_ON_MESSAGE"
            r0[r1] = r2
            return r0
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public void onMessage(java.lang.reflect.InvocationHandler r4, java.lang.reflect.InvocationHandler r5) {
            r3 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r5)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r0
            androidx.webkit.WebMessageCompat r0 = androidx.webkit.internal.WebMessageAdapter.webMessageCompatFromBoundaryInterface(r0)
            if (r0 == 0) goto L18
            androidx.webkit.WebMessagePortCompat$WebMessageCallbackCompat r1 = r3.mImpl
            androidx.webkit.internal.WebMessagePortImpl r2 = new androidx.webkit.internal.WebMessagePortImpl
            r2.<init>(r4)
            r1.onMessage(r2, r0)
        L18:
            return
    }
}
