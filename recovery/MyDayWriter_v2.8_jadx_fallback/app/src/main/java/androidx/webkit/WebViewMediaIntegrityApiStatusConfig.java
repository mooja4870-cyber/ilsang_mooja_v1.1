package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public class WebViewMediaIntegrityApiStatusConfig {
    public static final int WEBVIEW_MEDIA_INTEGRITY_API_DISABLED = 0;
    public static final int WEBVIEW_MEDIA_INTEGRITY_API_ENABLED = 2;
    public static final int WEBVIEW_MEDIA_INTEGRITY_API_ENABLED_WITHOUT_APP_IDENTITY = 1;
    private final int mDefaultStatus;
    private final java.util.Map<java.lang.String, java.lang.Integer> mOverrideRules;

    public static final class Builder {
        private final int mDefaultStatus;
        private java.util.Map<java.lang.String, java.lang.Integer> mOverrideRules;

        public Builder(int r2) {
                r1 = this;
                r1.<init>()
                r1.mDefaultStatus = r2
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mOverrideRules = r0
                return
        }

        static /* synthetic */ int access$000(androidx.webkit.WebViewMediaIntegrityApiStatusConfig.Builder r1) {
                int r0 = r1.mDefaultStatus
                return r0
        }

        static /* synthetic */ java.util.Map access$100(androidx.webkit.WebViewMediaIntegrityApiStatusConfig.Builder r1) {
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.mOverrideRules
                return r0
        }

        public androidx.webkit.WebViewMediaIntegrityApiStatusConfig.Builder addOverrideRule(java.lang.String r3, int r4) {
                r2 = this;
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.mOverrideRules
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                r0.put(r3, r1)
                return r2
        }

        public androidx.webkit.WebViewMediaIntegrityApiStatusConfig build() {
                r1 = this;
                androidx.webkit.WebViewMediaIntegrityApiStatusConfig r0 = new androidx.webkit.WebViewMediaIntegrityApiStatusConfig
                r0.<init>(r1)
                return r0
        }

        public androidx.webkit.WebViewMediaIntegrityApiStatusConfig.Builder setOverrideRules(java.util.Map<java.lang.String, java.lang.Integer> r1) {
                r0 = this;
                r0.mOverrideRules = r1
                return r0
        }
    }

    public WebViewMediaIntegrityApiStatusConfig(androidx.webkit.WebViewMediaIntegrityApiStatusConfig.Builder r2) {
            r1 = this;
            r1.<init>()
            int r0 = androidx.webkit.WebViewMediaIntegrityApiStatusConfig.Builder.access$000(r2)
            r1.mDefaultStatus = r0
            java.util.Map r0 = androidx.webkit.WebViewMediaIntegrityApiStatusConfig.Builder.access$100(r2)
            r1.mOverrideRules = r0
            return
    }

    public int getDefaultStatus() {
            r1 = this;
            int r0 = r1.mDefaultStatus
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Integer> getOverrideRules() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.mOverrideRules
            return r0
    }
}
