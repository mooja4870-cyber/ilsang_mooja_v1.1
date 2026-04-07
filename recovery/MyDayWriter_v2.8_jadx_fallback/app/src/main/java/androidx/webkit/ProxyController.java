package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public abstract class ProxyController {

    private static class LAZY_HOLDER {
        static final androidx.webkit.ProxyController INSTANCE = null;

        static {
                androidx.webkit.internal.ProxyControllerImpl r0 = new androidx.webkit.internal.ProxyControllerImpl
                r0.<init>()
                androidx.webkit.ProxyController.LAZY_HOLDER.INSTANCE = r0
                return
        }

        private LAZY_HOLDER() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ProxyController() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.webkit.ProxyController getInstance() {
            java.lang.String r0 = "PROXY_OVERRIDE"
            boolean r0 = androidx.webkit.WebViewFeature.isFeatureSupported(r0)
            if (r0 == 0) goto Lb
            androidx.webkit.ProxyController r0 = androidx.webkit.ProxyController.LAZY_HOLDER.INSTANCE
            return r0
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Proxy override not supported"
            r0.<init>(r1)
            throw r0
    }

    public abstract void clearProxyOverride(java.util.concurrent.Executor r1, java.lang.Runnable r2);

    public abstract void setProxyOverride(androidx.webkit.ProxyConfig r1, java.util.concurrent.Executor r2, java.lang.Runnable r3);
}
