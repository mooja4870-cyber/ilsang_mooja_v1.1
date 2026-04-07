package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class ServiceWorkerWebSettingsImpl extends androidx.webkit.ServiceWorkerWebSettingsCompat {
    private org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface mBoundaryInterface;
    private android.webkit.ServiceWorkerWebSettings mFrameworksImpl;

    public ServiceWorkerWebSettingsImpl(android.webkit.ServiceWorkerWebSettings r1) {
            r0 = this;
            r0.<init>()
            r0.mFrameworksImpl = r1
            return
    }

    public ServiceWorkerWebSettingsImpl(java.lang.reflect.InvocationHandler r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class<org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface> r0 = org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface.class
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r2)
            org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface r0 = (org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface) r0
            r1.mBoundaryInterface = r0
            return
    }

    private org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface getBoundaryInterface() {
            r3 = this;
            org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface r0 = r3.mBoundaryInterface
            if (r0 != 0) goto L18
            java.lang.Class<org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface> r0 = org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface.class
            androidx.webkit.internal.WebkitToCompatConverter r1 = androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter()
            android.webkit.ServiceWorkerWebSettings r2 = r3.mFrameworksImpl
            java.lang.reflect.InvocationHandler r1 = r1.convertServiceWorkerSettings(r2)
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r1)
            org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface r0 = (org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface) r0
            r3.mBoundaryInterface = r0
        L18:
            org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface r0 = r3.mBoundaryInterface
            return r0
    }

    private android.webkit.ServiceWorkerWebSettings getFrameworksImpl() {
            r2 = this;
            android.webkit.ServiceWorkerWebSettings r0 = r2.mFrameworksImpl
            if (r0 != 0) goto L15
        L5:
            androidx.webkit.internal.WebkitToCompatConverter r0 = androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter()
            org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface r1 = r2.mBoundaryInterface
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r1)
            android.webkit.ServiceWorkerWebSettings r0 = r0.convertServiceWorkerSettings(r1)
            r2.mFrameworksImpl = r0
        L15:
            android.webkit.ServiceWorkerWebSettings r0 = r2.mFrameworksImpl
            return r0
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getAllowContentAccess() {
            r2 = this;
            androidx.webkit.internal.ApiFeature$N r0 = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_CONTENT_ACCESS
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L11
            android.webkit.ServiceWorkerWebSettings r1 = r2.getFrameworksImpl()
            boolean r1 = androidx.webkit.internal.ApiHelperForN.getAllowContentAccess(r1)
            return r1
        L11:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L20
            org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface r1 = r2.getBoundaryInterface()
            boolean r1 = r1.getAllowContentAccess()
            return r1
        L20:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getAllowFileAccess() {
            r2 = this;
            androidx.webkit.internal.ApiFeature$N r0 = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_FILE_ACCESS
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L11
            android.webkit.ServiceWorkerWebSettings r1 = r2.getFrameworksImpl()
            boolean r1 = androidx.webkit.internal.ApiHelperForN.getAllowFileAccess(r1)
            return r1
        L11:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L20
            org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface r1 = r2.getBoundaryInterface()
            boolean r1 = r1.getAllowFileAccess()
            return r1
        L20:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getBlockNetworkLoads() {
            r2 = this;
            androidx.webkit.internal.ApiFeature$N r0 = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_BLOCK_NETWORK_LOADS
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L11
            android.webkit.ServiceWorkerWebSettings r1 = r2.getFrameworksImpl()
            boolean r1 = androidx.webkit.internal.ApiHelperForN.getBlockNetworkLoads(r1)
            return r1
        L11:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L20
            org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface r1 = r2.getBoundaryInterface()
            boolean r1 = r1.getBlockNetworkLoads()
            return r1
        L20:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public int getCacheMode() {
            r2 = this;
            androidx.webkit.internal.ApiFeature$N r0 = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_CACHE_MODE
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L11
            android.webkit.ServiceWorkerWebSettings r1 = r2.getFrameworksImpl()
            int r1 = androidx.webkit.internal.ApiHelperForN.getCacheMode(r1)
            return r1
        L11:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L20
            org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface r1 = r2.getBoundaryInterface()
            int r1 = r1.getCacheMode()
            return r1
        L20:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public java.util.Set<java.lang.String> getRequestedWithHeaderOriginAllowList() {
            r2 = this;
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L11
            org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface r1 = r2.getBoundaryInterface()
            java.util.Set r1 = r1.getRequestedWithHeaderOriginAllowList()
            return r1
        L11:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setAllowContentAccess(boolean r3) {
            r2 = this;
            androidx.webkit.internal.ApiFeature$N r0 = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_CONTENT_ACCESS
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L10
            android.webkit.ServiceWorkerWebSettings r1 = r2.getFrameworksImpl()
            androidx.webkit.internal.ApiHelperForN.setAllowContentAccess(r1, r3)
            goto L1d
        L10:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1e
            org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface r1 = r2.getBoundaryInterface()
            r1.setAllowContentAccess(r3)
        L1d:
            return
        L1e:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setAllowFileAccess(boolean r3) {
            r2 = this;
            androidx.webkit.internal.ApiFeature$N r0 = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_FILE_ACCESS
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L10
            android.webkit.ServiceWorkerWebSettings r1 = r2.getFrameworksImpl()
            androidx.webkit.internal.ApiHelperForN.setAllowFileAccess(r1, r3)
            goto L1d
        L10:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1e
            org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface r1 = r2.getBoundaryInterface()
            r1.setAllowFileAccess(r3)
        L1d:
            return
        L1e:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setBlockNetworkLoads(boolean r3) {
            r2 = this;
            androidx.webkit.internal.ApiFeature$N r0 = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_BLOCK_NETWORK_LOADS
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L10
            android.webkit.ServiceWorkerWebSettings r1 = r2.getFrameworksImpl()
            androidx.webkit.internal.ApiHelperForN.setBlockNetworkLoads(r1, r3)
            goto L1d
        L10:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1e
            org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface r1 = r2.getBoundaryInterface()
            r1.setBlockNetworkLoads(r3)
        L1d:
            return
        L1e:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setCacheMode(int r3) {
            r2 = this;
            androidx.webkit.internal.ApiFeature$N r0 = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_CACHE_MODE
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto L10
            android.webkit.ServiceWorkerWebSettings r1 = r2.getFrameworksImpl()
            androidx.webkit.internal.ApiHelperForN.setCacheMode(r1, r3)
            goto L1d
        L10:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1e
            org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface r1 = r2.getBoundaryInterface()
            r1.setCacheMode(r3)
        L1d:
            return
        L1e:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setRequestedWithHeaderOriginAllowList(java.util.Set<java.lang.String> r3) {
            r2 = this;
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface r1 = r2.getBoundaryInterface()
            r1.setRequestedWithHeaderOriginAllowList(r3)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }
}
