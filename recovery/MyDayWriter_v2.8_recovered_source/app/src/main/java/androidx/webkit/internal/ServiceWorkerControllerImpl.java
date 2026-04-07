package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class ServiceWorkerControllerImpl extends androidx.webkit.ServiceWorkerControllerCompat {
    private org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface mBoundaryInterface;
    private android.webkit.ServiceWorkerController mFrameworksImpl;
    private final androidx.webkit.ServiceWorkerWebSettingsCompat mWebSettings;

    public ServiceWorkerControllerImpl() {
            r3 = this;
            r3.<init>()
            androidx.webkit.internal.ApiFeature$N r0 = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_BASIC_USAGE
            boolean r1 = r0.isSupportedByFramework()
            r2 = 0
            if (r1 == 0) goto L1f
            android.webkit.ServiceWorkerController r1 = androidx.webkit.internal.ApiHelperForN.getServiceWorkerControllerInstance()
            r3.mFrameworksImpl = r1
            r3.mBoundaryInterface = r2
            android.webkit.ServiceWorkerController r1 = r3.getFrameworksImpl()
            androidx.webkit.internal.ServiceWorkerWebSettingsImpl r1 = androidx.webkit.internal.ApiHelperForN.getServiceWorkerWebSettingsImpl(r1)
            r3.mWebSettings = r1
            goto L3e
        L1f:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L3f
            r3.mFrameworksImpl = r2
            androidx.webkit.internal.WebViewProviderFactory r1 = androidx.webkit.internal.WebViewGlueCommunicator.getFactory()
            org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface r1 = r1.getServiceWorkerController()
            r3.mBoundaryInterface = r1
            androidx.webkit.internal.ServiceWorkerWebSettingsImpl r1 = new androidx.webkit.internal.ServiceWorkerWebSettingsImpl
            org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface r2 = r3.mBoundaryInterface
            java.lang.reflect.InvocationHandler r2 = r2.getServiceWorkerWebSettings()
            r1.<init>(r2)
            r3.mWebSettings = r1
        L3e:
            return
        L3f:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    private org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface getBoundaryInterface() {
            r1 = this;
            org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface r0 = r1.mBoundaryInterface
            if (r0 != 0) goto Le
            androidx.webkit.internal.WebViewProviderFactory r0 = androidx.webkit.internal.WebViewGlueCommunicator.getFactory()
            org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface r0 = r0.getServiceWorkerController()
            r1.mBoundaryInterface = r0
        Le:
            org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface r0 = r1.mBoundaryInterface
            return r0
    }

    private android.webkit.ServiceWorkerController getFrameworksImpl() {
            r1 = this;
            android.webkit.ServiceWorkerController r0 = r1.mFrameworksImpl
            if (r0 != 0) goto La
            android.webkit.ServiceWorkerController r0 = androidx.webkit.internal.ApiHelperForN.getServiceWorkerControllerInstance()
            r1.mFrameworksImpl = r0
        La:
            android.webkit.ServiceWorkerController r0 = r1.mFrameworksImpl
            return r0
    }

    @Override // androidx.webkit.ServiceWorkerControllerCompat
    public androidx.webkit.ServiceWorkerWebSettingsCompat getServiceWorkerWebSettings() {
            r1 = this;
            androidx.webkit.ServiceWorkerWebSettingsCompat r0 = r1.mWebSettings
            return r0
    }

    @Override // androidx.webkit.ServiceWorkerControllerCompat
    public void setServiceWorkerClient(androidx.webkit.ServiceWorkerClientCompat r4) {
            r3 = this;
            androidx.webkit.internal.ApiFeature$N r0 = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_BASIC_USAGE
            boolean r1 = r0.isSupportedByFramework()
            r2 = 0
            if (r1 == 0) goto L1b
            if (r4 != 0) goto L13
            android.webkit.ServiceWorkerController r1 = r3.getFrameworksImpl()
            androidx.webkit.internal.ApiHelperForN.setServiceWorkerClient(r1, r2)
            goto L3b
        L13:
            android.webkit.ServiceWorkerController r1 = r3.getFrameworksImpl()
            androidx.webkit.internal.ApiHelperForN.setServiceWorkerClientCompat(r1, r4)
            goto L3b
        L1b:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L3c
            if (r4 != 0) goto L2b
            org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface r1 = r3.getBoundaryInterface()
            r1.setServiceWorkerClient(r2)
            goto L3b
        L2b:
            org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface r1 = r3.getBoundaryInterface()
            androidx.webkit.internal.ServiceWorkerClientAdapter r2 = new androidx.webkit.internal.ServiceWorkerClientAdapter
            r2.<init>(r4)
            java.lang.reflect.InvocationHandler r2 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(r2)
            r1.setServiceWorkerClient(r2)
        L3b:
            return
        L3c:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }
}
