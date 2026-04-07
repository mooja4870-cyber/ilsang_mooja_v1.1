package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class FrameworkServiceWorkerClient extends android.webkit.ServiceWorkerClient {
    private final androidx.webkit.ServiceWorkerClientCompat mImpl;

    public FrameworkServiceWorkerClient(androidx.webkit.ServiceWorkerClientCompat r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    @Override // android.webkit.ServiceWorkerClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebResourceRequest r2) {
            r1 = this;
            androidx.webkit.ServiceWorkerClientCompat r0 = r1.mImpl
            android.webkit.WebResourceResponse r0 = r0.shouldInterceptRequest(r2)
            return r0
    }
}
