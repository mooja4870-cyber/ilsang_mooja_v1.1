package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class ServiceWorkerClientAdapter implements org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface {
    private final androidx.webkit.ServiceWorkerClientCompat mClient;

    public ServiceWorkerClientAdapter(androidx.webkit.ServiceWorkerClientCompat r1) {
            r0 = this;
            r0.<init>()
            r0.mClient = r1
            return
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public java.lang.String[] getSupportedFeatures() {
            r3 = this;
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"
            r0[r1] = r2
            return r0
    }

    @Override // org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebResourceRequest r2) {
            r1 = this;
            androidx.webkit.ServiceWorkerClientCompat r0 = r1.mClient
            android.webkit.WebResourceResponse r0 = r0.shouldInterceptRequest(r2)
            return r0
    }
}
