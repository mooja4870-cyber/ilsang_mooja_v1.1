package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class WebkitToCompatConverter {
    private final org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface mImpl;

    public WebkitToCompatConverter(org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    public androidx.webkit.internal.CookieManagerAdapter convertCookieManager(android.webkit.CookieManager r4) {
            r3 = this;
            androidx.webkit.internal.CookieManagerAdapter r0 = new androidx.webkit.internal.CookieManagerAdapter
            java.lang.Class<org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface> r1 = org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface.class
            org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface r2 = r3.mImpl
            java.lang.reflect.InvocationHandler r2 = r2.convertCookieManager(r4)
            java.lang.Object r1 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r1, r2)
            org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface r1 = (org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface) r1
            r0.<init>(r1)
            return r0
    }

    public android.webkit.SafeBrowsingResponse convertSafeBrowsingResponse(java.lang.reflect.InvocationHandler r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface r0 = r1.mImpl
            java.lang.Object r0 = r0.convertSafeBrowsingResponse(r2)
            android.webkit.SafeBrowsingResponse r0 = (android.webkit.SafeBrowsingResponse) r0
            return r0
    }

    public java.lang.reflect.InvocationHandler convertSafeBrowsingResponse(android.webkit.SafeBrowsingResponse r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface r0 = r1.mImpl
            java.lang.reflect.InvocationHandler r0 = r0.convertSafeBrowsingResponse(r2)
            return r0
    }

    public android.webkit.ServiceWorkerWebSettings convertServiceWorkerSettings(java.lang.reflect.InvocationHandler r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface r0 = r1.mImpl
            java.lang.Object r0 = r0.convertServiceWorkerSettings(r2)
            android.webkit.ServiceWorkerWebSettings r0 = (android.webkit.ServiceWorkerWebSettings) r0
            return r0
    }

    public java.lang.reflect.InvocationHandler convertServiceWorkerSettings(android.webkit.ServiceWorkerWebSettings r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface r0 = r1.mImpl
            java.lang.reflect.InvocationHandler r0 = r0.convertServiceWorkerSettings(r2)
            return r0
    }

    public androidx.webkit.internal.WebSettingsAdapter convertSettings(android.webkit.WebSettings r4) {
            r3 = this;
            androidx.webkit.internal.WebSettingsAdapter r0 = new androidx.webkit.internal.WebSettingsAdapter
            java.lang.Class<org.chromium.support_lib_boundary.WebSettingsBoundaryInterface> r1 = org.chromium.support_lib_boundary.WebSettingsBoundaryInterface.class
            org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface r2 = r3.mImpl
            java.lang.reflect.InvocationHandler r2 = r2.convertSettings(r4)
            java.lang.Object r1 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r1, r2)
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r1 = (org.chromium.support_lib_boundary.WebSettingsBoundaryInterface) r1
            r0.<init>(r1)
            return r0
    }

    public android.webkit.WebMessagePort convertWebMessagePort(java.lang.reflect.InvocationHandler r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface r0 = r1.mImpl
            java.lang.Object r0 = r0.convertWebMessagePort(r2)
            android.webkit.WebMessagePort r0 = (android.webkit.WebMessagePort) r0
            return r0
    }

    public java.lang.reflect.InvocationHandler convertWebMessagePort(android.webkit.WebMessagePort r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface r0 = r1.mImpl
            java.lang.reflect.InvocationHandler r0 = r0.convertWebMessagePort(r2)
            return r0
    }

    public android.webkit.WebResourceError convertWebResourceError(java.lang.reflect.InvocationHandler r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface r0 = r1.mImpl
            java.lang.Object r0 = r0.convertWebResourceError(r2)
            android.webkit.WebResourceError r0 = (android.webkit.WebResourceError) r0
            return r0
    }

    public java.lang.reflect.InvocationHandler convertWebResourceError(android.webkit.WebResourceError r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface r0 = r1.mImpl
            java.lang.reflect.InvocationHandler r0 = r0.convertWebResourceError(r2)
            return r0
    }

    public androidx.webkit.internal.WebResourceRequestAdapter convertWebResourceRequest(android.webkit.WebResourceRequest r4) {
            r3 = this;
            androidx.webkit.internal.WebResourceRequestAdapter r0 = new androidx.webkit.internal.WebResourceRequestAdapter
            java.lang.Class<org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface> r1 = org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface.class
            org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface r2 = r3.mImpl
            java.lang.reflect.InvocationHandler r2 = r2.convertWebResourceRequest(r4)
            java.lang.Object r1 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r1, r2)
            org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface r1 = (org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface) r1
            r0.<init>(r1)
            return r0
    }

    public androidx.webkit.internal.WebStorageAdapter convertWebStorage(android.webkit.WebStorage r4) {
            r3 = this;
            androidx.webkit.internal.WebStorageAdapter r0 = new androidx.webkit.internal.WebStorageAdapter
            java.lang.Class<org.chromium.support_lib_boundary.WebStorageBoundaryInterface> r1 = org.chromium.support_lib_boundary.WebStorageBoundaryInterface.class
            org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface r2 = r3.mImpl
            java.lang.reflect.InvocationHandler r2 = r2.convertWebStorage(r4)
            java.lang.Object r1 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r1, r2)
            org.chromium.support_lib_boundary.WebStorageBoundaryInterface r1 = (org.chromium.support_lib_boundary.WebStorageBoundaryInterface) r1
            r0.<init>(r1)
            return r0
    }
}
