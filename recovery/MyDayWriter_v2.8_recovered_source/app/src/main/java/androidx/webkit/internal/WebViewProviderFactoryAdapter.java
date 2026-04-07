package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class WebViewProviderFactoryAdapter implements androidx.webkit.internal.WebViewProviderFactory {
    final org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface mImpl;

    public WebViewProviderFactoryAdapter(org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface createWebView(android.webkit.WebView r3) {
            r2 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface.class
            org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface r1 = r2.mImpl
            java.lang.reflect.InvocationHandler r1 = r1.createWebView(r3)
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r1)
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface) r0
            return r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface getDropDataProvider() {
            r2 = this;
            java.lang.Class<org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface> r0 = org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface.class
            org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface r1 = r2.mImpl
            java.lang.reflect.InvocationHandler r1 = r1.getDropDataProvider()
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r1)
            org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface r0 = (org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface) r0
            return r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface getProfileStore() {
            r2 = this;
            java.lang.Class<org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface> r0 = org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface.class
            org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface r1 = r2.mImpl
            java.lang.reflect.InvocationHandler r1 = r1.getProfileStore()
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r1)
            org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface r0 = (org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface) r0
            return r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface getProxyController() {
            r2 = this;
            java.lang.Class<org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface> r0 = org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface.class
            org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface r1 = r2.mImpl
            java.lang.reflect.InvocationHandler r1 = r1.getProxyController()
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r1)
            org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface r0 = (org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface) r0
            return r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
            r2 = this;
            java.lang.Class<org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface> r0 = org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface.class
            org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface r1 = r2.mImpl
            java.lang.reflect.InvocationHandler r1 = r1.getServiceWorkerController()
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r1)
            org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface r0 = (org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface) r0
            return r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.StaticsBoundaryInterface getStatics() {
            r2 = this;
            java.lang.Class<org.chromium.support_lib_boundary.StaticsBoundaryInterface> r0 = org.chromium.support_lib_boundary.StaticsBoundaryInterface.class
            org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface r1 = r2.mImpl
            java.lang.reflect.InvocationHandler r1 = r1.getStatics()
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r1)
            org.chromium.support_lib_boundary.StaticsBoundaryInterface r0 = (org.chromium.support_lib_boundary.StaticsBoundaryInterface) r0
            return r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.TracingControllerBoundaryInterface getTracingController() {
            r2 = this;
            java.lang.Class<org.chromium.support_lib_boundary.TracingControllerBoundaryInterface> r0 = org.chromium.support_lib_boundary.TracingControllerBoundaryInterface.class
            org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface r1 = r2.mImpl
            java.lang.reflect.InvocationHandler r1 = r1.getTracingController()
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r1)
            org.chromium.support_lib_boundary.TracingControllerBoundaryInterface r0 = (org.chromium.support_lib_boundary.TracingControllerBoundaryInterface) r0
            return r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface getWebViewBuilder() {
            r2 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface.class
            org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface r1 = r2.mImpl
            java.lang.reflect.InvocationHandler r1 = r1.getWebViewBuilder()
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r1)
            org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface) r0
            return r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public java.lang.String[] getWebViewFeatures() {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface r0 = r1.mImpl
            java.lang.String[] r0 = r0.getSupportedFeatures()
            return r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
            r2 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface.class
            org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface r1 = r2.mImpl
            java.lang.reflect.InvocationHandler r1 = r1.getWebkitToCompatConverter()
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r1)
            org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface) r0
            return r0
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public void startUpWebView(androidx.webkit.WebViewStartUpConfig r4, androidx.webkit.WebViewCompat.WebViewStartUpCallback r5) {
            r3 = this;
            org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface r0 = r3.mImpl
            androidx.webkit.internal.WebViewStartUpConfigAdapter r1 = new androidx.webkit.internal.WebViewStartUpConfigAdapter
            r1.<init>(r4)
            java.lang.reflect.InvocationHandler r1 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(r1)
            androidx.webkit.internal.WebViewStartUpCallbackAdapter r2 = new androidx.webkit.internal.WebViewStartUpCallbackAdapter
            r2.<init>(r5)
            java.lang.reflect.InvocationHandler r2 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(r2)
            r0.startUpWebView(r1, r2)
            return
    }
}
