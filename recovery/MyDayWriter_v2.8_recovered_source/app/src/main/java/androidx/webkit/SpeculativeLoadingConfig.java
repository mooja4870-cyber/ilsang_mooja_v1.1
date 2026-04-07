package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public class SpeculativeLoadingConfig {
    private final int mMaxPrefetches;
    private final int mMaxPrerenders;
    private final int mPrefetchTTLSeconds;

    /* JADX INFO: renamed from: androidx.webkit.SpeculativeLoadingConfig$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private int mMaxPrefetches;
        private int mMaxPrerenders;
        private int mPrefetchTTLSeconds;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public androidx.webkit.SpeculativeLoadingConfig build() {
                r5 = this;
                androidx.webkit.SpeculativeLoadingConfig r0 = new androidx.webkit.SpeculativeLoadingConfig
                int r1 = r5.mPrefetchTTLSeconds
                int r2 = r5.mMaxPrefetches
                int r3 = r5.mMaxPrerenders
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public androidx.webkit.SpeculativeLoadingConfig.Builder setMaxPrefetches(int r3) {
                r2 = this;
                r0 = 1
                if (r3 < r0) goto L6
                r2.mMaxPrefetches = r3
                return r2
            L6:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Max prefetches must be greater than 0"
                r0.<init>(r1)
                throw r0
        }

        public androidx.webkit.SpeculativeLoadingConfig.Builder setMaxPrerenders(int r3) {
                r2 = this;
                r0 = 1
                if (r3 < r0) goto L6
                r2.mMaxPrerenders = r3
                return r2
            L6:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Max prerenders must be greater than 0"
                r0.<init>(r1)
                throw r0
        }

        public androidx.webkit.SpeculativeLoadingConfig.Builder setPrefetchTtlSeconds(int r3) {
                r2 = this;
                if (r3 <= 0) goto L5
                r2.mPrefetchTTLSeconds = r3
                return r2
            L5:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Prefetch TTL must be greater than 0"
                r0.<init>(r1)
                throw r0
        }
    }

    private SpeculativeLoadingConfig(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.mPrefetchTTLSeconds = r1
            r0.mMaxPrefetches = r2
            r0.mMaxPrerenders = r3
            return
    }

    /* synthetic */ SpeculativeLoadingConfig(int r1, int r2, int r3, androidx.webkit.SpeculativeLoadingConfig.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public int getMaxPrefetches() {
            r1 = this;
            int r0 = r1.mMaxPrefetches
            return r0
    }

    public int getMaxPrerenders() {
            r1 = this;
            int r0 = r1.mMaxPrerenders
            return r0
    }

    public int getPrefetchTtlSeconds() {
            r1 = this;
            int r0 = r1.mPrefetchTTLSeconds
            return r0
    }
}
