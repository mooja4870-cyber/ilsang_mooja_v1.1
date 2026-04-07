package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class WebMessagePortImpl extends androidx.webkit.WebMessagePortCompat {
    private org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface mBoundaryInterface;
    private android.webkit.WebMessagePort mFrameworksImpl;

    public WebMessagePortImpl(android.webkit.WebMessagePort r1) {
            r0 = this;
            r0.<init>()
            r0.mFrameworksImpl = r1
            return
    }

    public WebMessagePortImpl(java.lang.reflect.InvocationHandler r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r2)
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) r0
            r1.mBoundaryInterface = r0
            return
    }

    public static android.webkit.WebMessage compatToFrameworkMessage(androidx.webkit.WebMessageCompat r1) {
            android.webkit.WebMessage r0 = androidx.webkit.internal.ApiHelperForM.createWebMessage(r1)
            return r0
    }

    public static android.webkit.WebMessagePort[] compatToPorts(androidx.webkit.WebMessagePortCompat[] r3) {
            if (r3 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r3.length
            android.webkit.WebMessagePort[] r0 = new android.webkit.WebMessagePort[r0]
            r1 = 0
        L8:
            int r2 = r0.length
            if (r1 >= r2) goto L16
            r2 = r3[r1]
            android.webkit.WebMessagePort r2 = r2.getFrameworkPort()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L16:
            return r0
    }

    public static androidx.webkit.WebMessageCompat frameworkMessageToCompat(android.webkit.WebMessage r1) {
            androidx.webkit.WebMessageCompat r0 = androidx.webkit.internal.ApiHelperForM.createWebMessageCompat(r1)
            return r0
    }

    private org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface getBoundaryInterface() {
            r3 = this;
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r0 = r3.mBoundaryInterface
            if (r0 != 0) goto L18
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class
            androidx.webkit.internal.WebkitToCompatConverter r1 = androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter()
            android.webkit.WebMessagePort r2 = r3.mFrameworksImpl
            java.lang.reflect.InvocationHandler r1 = r1.convertWebMessagePort(r2)
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r1)
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) r0
            r3.mBoundaryInterface = r0
        L18:
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r0 = r3.mBoundaryInterface
            return r0
    }

    private android.webkit.WebMessagePort getFrameworksImpl() {
            r2 = this;
            android.webkit.WebMessagePort r0 = r2.mFrameworksImpl
            if (r0 != 0) goto L14
            androidx.webkit.internal.WebkitToCompatConverter r0 = androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter()
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r1 = r2.mBoundaryInterface
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r1)
            android.webkit.WebMessagePort r0 = r0.convertWebMessagePort(r1)
            r2.mFrameworksImpl = r0
        L14:
            android.webkit.WebMessagePort r0 = r2.mFrameworksImpl
            return r0
    }

    public static androidx.webkit.WebMessagePortCompat[] portsToCompat(android.webkit.WebMessagePort[] r4) {
            if (r4 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r4.length
            androidx.webkit.WebMessagePortCompat[] r0 = new androidx.webkit.WebMessagePortCompat[r0]
            r1 = 0
        L8:
            int r2 = r4.length
            if (r1 >= r2) goto L17
            androidx.webkit.internal.WebMessagePortImpl r2 = new androidx.webkit.internal.WebMessagePortImpl
            r3 = r4[r1]
            r2.<init>(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L17:
            return r0
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void close() {
            r2 = this;
            androidx.webkit.internal.ApiFeature$M r0 = androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_PORT_CLOSE
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L10
            android.webkit.WebMessagePort r1 = r2.getFrameworksImpl()
            androidx.webkit.internal.ApiHelperForM.close(r1)
            goto L1d
        L10:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1e
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r1 = r2.getBoundaryInterface()
            r1.close()
        L1d:
            return
        L1e:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public android.webkit.WebMessagePort getFrameworkPort() {
            r1 = this;
            android.webkit.WebMessagePort r0 = r1.getFrameworksImpl()
            return r0
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public java.lang.reflect.InvocationHandler getInvocationHandler() {
            r1 = this;
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r0 = r1.getBoundaryInterface()
            java.lang.reflect.InvocationHandler r0 = java.lang.reflect.Proxy.getInvocationHandler(r0)
            return r0
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void postMessage(androidx.webkit.WebMessageCompat r4) {
            r3 = this;
            androidx.webkit.internal.ApiFeature$M r0 = androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_PORT_POST_MESSAGE
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L1a
            int r1 = r4.getType()
            if (r1 != 0) goto L1a
            android.webkit.WebMessagePort r1 = r3.getFrameworksImpl()
            android.webkit.WebMessage r2 = compatToFrameworkMessage(r4)
            androidx.webkit.internal.ApiHelperForM.postMessage(r1, r2)
            goto L3a
        L1a:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L3b
            int r1 = r4.getType()
            boolean r1 = androidx.webkit.internal.WebMessageAdapter.isMessagePayloadTypeSupportedByWebView(r1)
            if (r1 == 0) goto L3b
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r1 = r3.getBoundaryInterface()
            androidx.webkit.internal.WebMessageAdapter r2 = new androidx.webkit.internal.WebMessageAdapter
            r2.<init>(r4)
            java.lang.reflect.InvocationHandler r2 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(r2)
            r1.postMessage(r2)
        L3a:
            return
        L3b:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void setWebMessageCallback(android.os.Handler r4, androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat r5) {
            r3 = this;
            androidx.webkit.internal.ApiFeature$M r0 = androidx.webkit.internal.WebViewFeatureInternal.CREATE_WEB_MESSAGE_CHANNEL
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L19
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r1 = r3.getBoundaryInterface()
            androidx.webkit.internal.WebMessageCallbackAdapter r2 = new androidx.webkit.internal.WebMessageCallbackAdapter
            r2.<init>(r5)
            java.lang.reflect.InvocationHandler r2 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(r2)
            r1.setWebMessageCallback(r2, r4)
            goto L26
        L19:
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L27
            android.webkit.WebMessagePort r1 = r3.getFrameworksImpl()
            androidx.webkit.internal.ApiHelperForM.setWebMessageCallback(r1, r5, r4)
        L26:
            return
        L27:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void setWebMessageCallback(androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat r4) {
            r3 = this;
            androidx.webkit.internal.ApiFeature$M r0 = androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L19
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r1 = r3.getBoundaryInterface()
            androidx.webkit.internal.WebMessageCallbackAdapter r2 = new androidx.webkit.internal.WebMessageCallbackAdapter
            r2.<init>(r4)
            java.lang.reflect.InvocationHandler r2 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(r2)
            r1.setWebMessageCallback(r2)
            goto L26
        L19:
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L27
            android.webkit.WebMessagePort r1 = r3.getFrameworksImpl()
            androidx.webkit.internal.ApiHelperForM.setWebMessageCallback(r1, r4)
        L26:
            return
        L27:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }
}
