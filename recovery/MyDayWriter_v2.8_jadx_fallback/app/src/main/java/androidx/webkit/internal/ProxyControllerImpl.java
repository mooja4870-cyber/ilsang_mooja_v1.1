package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class ProxyControllerImpl extends androidx.webkit.ProxyController {
    private org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface mBoundaryInterface;

    public ProxyControllerImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    private org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface getBoundaryInterface() {
            r1 = this;
            org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface r0 = r1.mBoundaryInterface
            if (r0 != 0) goto Le
            androidx.webkit.internal.WebViewProviderFactory r0 = androidx.webkit.internal.WebViewGlueCommunicator.getFactory()
            org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface r0 = r0.getProxyController()
            r1.mBoundaryInterface = r0
        Le:
            org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface r0 = r1.mBoundaryInterface
            return r0
    }

    public static java.lang.String[][] proxyRulesToStringArray(java.util.List<androidx.webkit.ProxyConfig.ProxyRule> r6) {
            int r0 = r6.size()
            r1 = 2
            int[] r2 = new int[r1]
            r3 = 1
            r2[r3] = r1
            r1 = 0
            r2[r1] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r2)
            java.lang.String[][] r0 = (java.lang.String[][]) r0
            r2 = 0
        L16:
            int r4 = r6.size()
            if (r2 >= r4) goto L3b
            r4 = r0[r2]
            java.lang.Object r5 = r6.get(r2)
            androidx.webkit.ProxyConfig$ProxyRule r5 = (androidx.webkit.ProxyConfig.ProxyRule) r5
            java.lang.String r5 = r5.getSchemeFilter()
            r4[r1] = r5
            r4 = r0[r2]
            java.lang.Object r5 = r6.get(r2)
            androidx.webkit.ProxyConfig$ProxyRule r5 = (androidx.webkit.ProxyConfig.ProxyRule) r5
            java.lang.String r5 = r5.getUrl()
            r4[r3] = r5
            int r2 = r2 + 1
            goto L16
        L3b:
            return r0
    }

    @Override // androidx.webkit.ProxyController
    public void clearProxyOverride(java.util.concurrent.Executor r3, java.lang.Runnable r4) {
            r2 = this;
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.PROXY_OVERRIDE
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface r1 = r2.getBoundaryInterface()
            r1.clearProxyOverride(r4, r3)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.ProxyController
    public void setProxyOverride(androidx.webkit.ProxyConfig r10, java.util.concurrent.Executor r11, java.lang.Runnable r12) {
            r9 = this;
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.PROXY_OVERRIDE
            androidx.webkit.internal.ApiFeature$NoFramework r1 = androidx.webkit.internal.WebViewFeatureInternal.PROXY_OVERRIDE_REVERSE_BYPASS
            java.util.List r2 = r10.getProxyRules()
            java.lang.String[][] r4 = proxyRulesToStringArray(r2)
            java.util.List r2 = r10.getBypassRules()
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            r5 = r2
            java.lang.String[] r5 = (java.lang.String[]) r5
            boolean r2 = r0.isSupportedByWebView()
            if (r2 == 0) goto L30
            boolean r2 = r10.isReverseBypassEnabled()
            if (r2 != 0) goto L30
            org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface r2 = r9.getBoundaryInterface()
            r2.setProxyOverride(r4, r5, r12, r11)
            r7 = r11
            r6 = r12
            goto L49
        L30:
            boolean r2 = r0.isSupportedByWebView()
            if (r2 == 0) goto L4a
            boolean r2 = r1.isSupportedByWebView()
            if (r2 == 0) goto L4a
            org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface r3 = r9.getBoundaryInterface()
            boolean r8 = r10.isReverseBypassEnabled()
            r7 = r11
            r6 = r12
            r3.setProxyOverride(r4, r5, r6, r7, r8)
        L49:
            return
        L4a:
            r7 = r11
            r6 = r12
            java.lang.UnsupportedOperationException r11 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r11
    }
}
