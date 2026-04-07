package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public final class ProxyConfig {
    private static final java.lang.String BYPASS_RULE_REMOVE_IMPLICIT = "<-loopback>";
    private static final java.lang.String BYPASS_RULE_SIMPLE_NAMES = "<local>";
    private static final java.lang.String DIRECT = "direct://";
    public static final java.lang.String MATCH_ALL_SCHEMES = "*";
    public static final java.lang.String MATCH_HTTP = "http";
    public static final java.lang.String MATCH_HTTPS = "https";
    private final java.util.List<java.lang.String> mBypassRules;
    private final java.util.List<androidx.webkit.ProxyConfig.ProxyRule> mProxyRules;
    private final boolean mReverseBypass;

    public static final class Builder {
        private final java.util.List<java.lang.String> mBypassRules;
        private final java.util.List<androidx.webkit.ProxyConfig.ProxyRule> mProxyRules;
        private boolean mReverseBypass;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mReverseBypass = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mProxyRules = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mBypassRules = r0
                return
        }

        public Builder(androidx.webkit.ProxyConfig r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mReverseBypass = r0
                java.util.List r0 = r2.getProxyRules()
                r1.mProxyRules = r0
                java.util.List r0 = r2.getBypassRules()
                r1.mBypassRules = r0
                boolean r0 = r2.isReverseBypassEnabled()
                r1.mReverseBypass = r0
                return
        }

        private java.util.List<java.lang.String> bypassRules() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.mBypassRules
                return r0
        }

        private java.util.List<androidx.webkit.ProxyConfig.ProxyRule> proxyRules() {
                r1 = this;
                java.util.List<androidx.webkit.ProxyConfig$ProxyRule> r0 = r1.mProxyRules
                return r0
        }

        private boolean reverseBypass() {
                r1 = this;
                boolean r0 = r1.mReverseBypass
                return r0
        }

        public androidx.webkit.ProxyConfig.Builder addBypassRule(java.lang.String r2) {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.mBypassRules
                r0.add(r2)
                return r1
        }

        public androidx.webkit.ProxyConfig.Builder addDirect() {
                r1 = this;
                java.lang.String r0 = "*"
                androidx.webkit.ProxyConfig$Builder r0 = r1.addDirect(r0)
                return r0
        }

        public androidx.webkit.ProxyConfig.Builder addDirect(java.lang.String r4) {
                r3 = this;
                java.util.List<androidx.webkit.ProxyConfig$ProxyRule> r0 = r3.mProxyRules
                androidx.webkit.ProxyConfig$ProxyRule r1 = new androidx.webkit.ProxyConfig$ProxyRule
                java.lang.String r2 = "direct://"
                r1.<init>(r4, r2)
                r0.add(r1)
                return r3
        }

        public androidx.webkit.ProxyConfig.Builder addProxyRule(java.lang.String r3) {
                r2 = this;
                java.util.List<androidx.webkit.ProxyConfig$ProxyRule> r0 = r2.mProxyRules
                androidx.webkit.ProxyConfig$ProxyRule r1 = new androidx.webkit.ProxyConfig$ProxyRule
                r1.<init>(r3)
                r0.add(r1)
                return r2
        }

        public androidx.webkit.ProxyConfig.Builder addProxyRule(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                java.util.List<androidx.webkit.ProxyConfig$ProxyRule> r0 = r2.mProxyRules
                androidx.webkit.ProxyConfig$ProxyRule r1 = new androidx.webkit.ProxyConfig$ProxyRule
                r1.<init>(r4, r3)
                r0.add(r1)
                return r2
        }

        public androidx.webkit.ProxyConfig build() {
                r4 = this;
                androidx.webkit.ProxyConfig r0 = new androidx.webkit.ProxyConfig
                java.util.List r1 = r4.proxyRules()
                java.util.List r2 = r4.bypassRules()
                boolean r3 = r4.reverseBypass()
                r0.<init>(r1, r2, r3)
                return r0
        }

        public androidx.webkit.ProxyConfig.Builder bypassSimpleHostnames() {
                r1 = this;
                java.lang.String r0 = "<local>"
                androidx.webkit.ProxyConfig$Builder r0 = r1.addBypassRule(r0)
                return r0
        }

        public androidx.webkit.ProxyConfig.Builder removeImplicitRules() {
                r1 = this;
                java.lang.String r0 = "<-loopback>"
                androidx.webkit.ProxyConfig$Builder r0 = r1.addBypassRule(r0)
                return r0
        }

        public androidx.webkit.ProxyConfig.Builder setReverseBypassEnabled(boolean r1) {
                r0 = this;
                r0.mReverseBypass = r1
                return r0
        }
    }

    public static final class ProxyRule {
        private final java.lang.String mSchemeFilter;
        private final java.lang.String mUrl;

        public ProxyRule(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "*"
                r1.<init>(r0, r2)
                return
        }

        public ProxyRule(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.mSchemeFilter = r1
                r0.mUrl = r2
                return
        }

        public java.lang.String getSchemeFilter() {
                r1 = this;
                java.lang.String r0 = r1.mSchemeFilter
                return r0
        }

        public java.lang.String getUrl() {
                r1 = this;
                java.lang.String r0 = r1.mUrl
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ProxyScheme {
    }

    public ProxyConfig(java.util.List<androidx.webkit.ProxyConfig.ProxyRule> r1, java.util.List<java.lang.String> r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.mProxyRules = r1
            r0.mBypassRules = r2
            r0.mReverseBypass = r3
            return
    }

    public java.util.List<java.lang.String> getBypassRules() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.mBypassRules
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public java.util.List<androidx.webkit.ProxyConfig.ProxyRule> getProxyRules() {
            r1 = this;
            java.util.List<androidx.webkit.ProxyConfig$ProxyRule> r0 = r1.mProxyRules
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public boolean isReverseBypassEnabled() {
            r1 = this;
            boolean r0 = r1.mReverseBypass
            return r0
    }
}
