package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public final class SpeculativeLoadingParameters {
    private final java.util.Map<java.lang.String, java.lang.String> mAdditionalHeaders;
    private final androidx.webkit.NoVarySearchHeader mExpectedNoVarySearchHeader;
    private final boolean mIsJavaScriptEnabled;

    /* JADX INFO: renamed from: androidx.webkit.SpeculativeLoadingParameters$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private final java.util.Map<java.lang.String, java.lang.String> mAdditionalHeaders;
        private androidx.webkit.NoVarySearchHeader mExpectedNoVarySearchHeader;
        private boolean mIsJavaScriptEnabled;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mAdditionalHeaders = r0
                r0 = 0
                r1.mExpectedNoVarySearchHeader = r0
                r0 = 0
                r1.mIsJavaScriptEnabled = r0
                return
        }

        public androidx.webkit.SpeculativeLoadingParameters.Builder addAdditionalHeader(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.mAdditionalHeaders
                r0.put(r2, r3)
                return r1
        }

        public androidx.webkit.SpeculativeLoadingParameters.Builder addAdditionalHeaders(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.mAdditionalHeaders
                r0.putAll(r2)
                return r1
        }

        public androidx.webkit.SpeculativeLoadingParameters build() {
                r5 = this;
                androidx.webkit.SpeculativeLoadingParameters r0 = new androidx.webkit.SpeculativeLoadingParameters
                java.util.Map<java.lang.String, java.lang.String> r1 = r5.mAdditionalHeaders
                androidx.webkit.NoVarySearchHeader r2 = r5.mExpectedNoVarySearchHeader
                boolean r3 = r5.mIsJavaScriptEnabled
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public androidx.webkit.SpeculativeLoadingParameters.Builder setExpectedNoVarySearchData(androidx.webkit.NoVarySearchHeader r1) {
                r0 = this;
                r0.mExpectedNoVarySearchHeader = r1
                return r0
        }

        public androidx.webkit.SpeculativeLoadingParameters.Builder setJavaScriptEnabled(boolean r1) {
                r0 = this;
                r0.mIsJavaScriptEnabled = r1
                return r0
        }
    }

    private SpeculativeLoadingParameters(java.util.Map<java.lang.String, java.lang.String> r1, androidx.webkit.NoVarySearchHeader r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.mAdditionalHeaders = r1
            r0.mExpectedNoVarySearchHeader = r2
            r0.mIsJavaScriptEnabled = r3
            return
    }

    /* synthetic */ SpeculativeLoadingParameters(java.util.Map r1, androidx.webkit.NoVarySearchHeader r2, boolean r3, androidx.webkit.SpeculativeLoadingParameters.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public java.util.Map<java.lang.String, java.lang.String> getAdditionalHeaders() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.mAdditionalHeaders
            return r0
    }

    public androidx.webkit.NoVarySearchHeader getExpectedNoVarySearchData() {
            r1 = this;
            androidx.webkit.NoVarySearchHeader r0 = r1.mExpectedNoVarySearchHeader
            return r0
    }

    public boolean isJavaScriptEnabled() {
            r1 = this;
            boolean r0 = r1.mIsJavaScriptEnabled
            return r0
    }
}
