package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public class PrefetchNetworkException extends androidx.webkit.PrefetchException {
    public static final int NO_HTTP_RESPONSE_STATUS_CODE = 0;
    public final int httpResponseStatusCode;

    public PrefetchNetworkException() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public PrefetchNetworkException(int r1) {
            r0 = this;
            r0.<init>()
            r0.httpResponseStatusCode = r1
            return
    }

    public PrefetchNetworkException(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public PrefetchNetworkException(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.httpResponseStatusCode = r2
            return
    }
}
