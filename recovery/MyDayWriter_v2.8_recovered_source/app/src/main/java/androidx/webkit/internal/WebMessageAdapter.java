package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class WebMessageAdapter implements org.chromium.support_lib_boundary.WebMessageBoundaryInterface {
    private static final java.lang.String[] sFeatures = null;
    private final androidx.webkit.WebMessageCompat mWebMessageCompat;

    static {
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "WEB_MESSAGE_ARRAY_BUFFER"
            r0[r1] = r2
            androidx.webkit.internal.WebMessageAdapter.sFeatures = r0
            return
    }

    public WebMessageAdapter(androidx.webkit.WebMessageCompat r1) {
            r0 = this;
            r0.<init>()
            r0.mWebMessageCompat = r1
            return
    }

    public static boolean isMessagePayloadTypeSupportedByWebView(int r2) {
            r0 = 1
            if (r2 == 0) goto L10
            if (r2 != r0) goto Le
            androidx.webkit.internal.ApiFeature$NoFramework r1 = androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER
            boolean r1 = r1.isSupportedByWebView()
            if (r1 == 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
        L11:
            return r0
    }

    private static androidx.webkit.WebMessagePortCompat[] toWebMessagePortCompats(java.lang.reflect.InvocationHandler[] r4) {
            int r0 = r4.length
            androidx.webkit.WebMessagePortCompat[] r0 = new androidx.webkit.WebMessagePortCompat[r0]
            r1 = 0
        L4:
            int r2 = r4.length
            if (r1 >= r2) goto L13
            androidx.webkit.internal.WebMessagePortImpl r2 = new androidx.webkit.internal.WebMessagePortImpl
            r3 = r4[r1]
            r2.<init>(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L13:
            return r0
    }

    public static androidx.webkit.WebMessageCompat webMessageCompatFromBoundaryInterface(org.chromium.support_lib_boundary.WebMessageBoundaryInterface r5) {
            java.lang.reflect.InvocationHandler[] r0 = r5.getPorts()
            androidx.webkit.WebMessagePortCompat[] r0 = toWebMessagePortCompats(r0)
            androidx.webkit.internal.ApiFeature$NoFramework r1 = androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER
            boolean r1 = r1.isSupportedByWebView()
            if (r1 == 0) goto L3a
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface> r1 = org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class
            java.lang.reflect.InvocationHandler r2 = r5.getMessagePayload()
            java.lang.Object r1 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r1, r2)
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface r1 = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) r1
            int r2 = r1.getType()
            switch(r2) {
                case 0: goto L30;
                case 1: goto L26;
                default: goto L24;
            }
        L24:
            r3 = 0
            return r3
        L26:
            androidx.webkit.WebMessageCompat r3 = new androidx.webkit.WebMessageCompat
            byte[] r4 = r1.getAsArrayBuffer()
            r3.<init>(r4, r0)
            return r3
        L30:
            androidx.webkit.WebMessageCompat r3 = new androidx.webkit.WebMessageCompat
            java.lang.String r4 = r1.getAsString()
            r3.<init>(r4, r0)
            return r3
        L3a:
            androidx.webkit.WebMessageCompat r1 = new androidx.webkit.WebMessageCompat
            java.lang.String r2 = r5.getData()
            r1.<init>(r2, r0)
            return r1
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @java.lang.Deprecated
    public java.lang.String getData() {
            r1 = this;
            androidx.webkit.WebMessageCompat r0 = r1.mWebMessageCompat
            java.lang.String r0 = r0.getData()
            return r0
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public java.lang.reflect.InvocationHandler getMessagePayload() {
            r3 = this;
            androidx.webkit.WebMessageCompat r0 = r3.mWebMessageCompat
            int r0 = r0.getType()
            switch(r0) {
                case 0: goto L3a;
                case 1: goto L28;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown web message payload type: "
            java.lang.StringBuilder r1 = r1.append(r2)
            androidx.webkit.WebMessageCompat r2 = r3.mWebMessageCompat
            int r2 = r2.getType()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L28:
            androidx.webkit.internal.WebMessagePayloadAdapter r0 = new androidx.webkit.internal.WebMessagePayloadAdapter
            androidx.webkit.WebMessageCompat r1 = r3.mWebMessageCompat
            byte[] r1 = r1.getArrayBuffer()
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            byte[] r1 = (byte[]) r1
            r0.<init>(r1)
            goto L46
        L3a:
            androidx.webkit.internal.WebMessagePayloadAdapter r0 = new androidx.webkit.internal.WebMessagePayloadAdapter
            androidx.webkit.WebMessageCompat r1 = r3.mWebMessageCompat
            java.lang.String r1 = r1.getData()
            r0.<init>(r1)
        L46:
            java.lang.reflect.InvocationHandler r1 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(r0)
            return r1
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public java.lang.reflect.InvocationHandler[] getPorts() {
            r4 = this;
            androidx.webkit.WebMessageCompat r0 = r4.mWebMessageCompat
            androidx.webkit.WebMessagePortCompat[] r0 = r0.getPorts()
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            int r1 = r0.length
            java.lang.reflect.InvocationHandler[] r1 = new java.lang.reflect.InvocationHandler[r1]
            r2 = 0
        Le:
            int r3 = r0.length
            if (r2 >= r3) goto L1c
            r3 = r0[r2]
            java.lang.reflect.InvocationHandler r3 = r3.getInvocationHandler()
            r1[r2] = r3
            int r2 = r2 + 1
            goto Le
        L1c:
            return r1
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public java.lang.String[] getSupportedFeatures() {
            r1 = this;
            java.lang.String[] r0 = androidx.webkit.internal.WebMessageAdapter.sFeatures
            return r0
    }
}
