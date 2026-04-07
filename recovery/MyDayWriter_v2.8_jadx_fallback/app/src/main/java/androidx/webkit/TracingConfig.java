package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public class TracingConfig {
    public static final int CATEGORIES_ALL = 1;
    public static final int CATEGORIES_ANDROID_WEBVIEW = 2;
    public static final int CATEGORIES_FRAME_VIEWER = 64;
    public static final int CATEGORIES_INPUT_LATENCY = 8;
    public static final int CATEGORIES_JAVASCRIPT_AND_RENDERING = 32;
    public static final int CATEGORIES_NONE = 0;
    public static final int CATEGORIES_RENDERING = 16;
    public static final int CATEGORIES_WEB_DEVELOPER = 4;
    public static final int RECORD_CONTINUOUSLY = 1;
    public static final int RECORD_UNTIL_FULL = 0;
    private final java.util.List<java.lang.String> mCustomIncludedCategories;
    private final int mPredefinedCategories;
    private final int mTracingMode;

    public static class Builder {
        private final java.util.List<java.lang.String> mCustomIncludedCategories;
        private int mPredefinedCategories;
        private int mTracingMode;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mPredefinedCategories = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mCustomIncludedCategories = r0
                r0 = 1
                r1.mTracingMode = r0
                return
        }

        public androidx.webkit.TracingConfig.Builder addCategories(java.util.Collection<java.lang.String> r2) {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.mCustomIncludedCategories
                r0.addAll(r2)
                return r1
        }

        public androidx.webkit.TracingConfig.Builder addCategories(int... r5) {
                r4 = this;
                int r0 = r5.length
                r1 = 0
            L2:
                if (r1 >= r0) goto Le
                r2 = r5[r1]
                int r3 = r4.mPredefinedCategories
                r3 = r3 | r2
                r4.mPredefinedCategories = r3
                int r1 = r1 + 1
                goto L2
            Le:
                return r4
        }

        public androidx.webkit.TracingConfig.Builder addCategories(java.lang.String... r3) {
                r2 = this;
                java.util.List<java.lang.String> r0 = r2.mCustomIncludedCategories
                java.util.List r1 = java.util.Arrays.asList(r3)
                r0.addAll(r1)
                return r2
        }

        public androidx.webkit.TracingConfig build() {
                r4 = this;
                androidx.webkit.TracingConfig r0 = new androidx.webkit.TracingConfig
                int r1 = r4.mPredefinedCategories
                java.util.List<java.lang.String> r2 = r4.mCustomIncludedCategories
                int r3 = r4.mTracingMode
                r0.<init>(r1, r2, r3)
                return r0
        }

        public androidx.webkit.TracingConfig.Builder setTracingMode(int r1) {
                r0 = this;
                r0.mTracingMode = r1
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PredefinedCategories {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TracingMode {
    }

    public TracingConfig(int r2, java.util.List<java.lang.String> r3, int r4) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mCustomIncludedCategories = r0
            r1.mPredefinedCategories = r2
            java.util.List<java.lang.String> r0 = r1.mCustomIncludedCategories
            r0.addAll(r3)
            r1.mTracingMode = r4
            return
    }

    public java.util.List<java.lang.String> getCustomIncludedCategories() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.mCustomIncludedCategories
            return r0
    }

    public int getPredefinedCategories() {
            r1 = this;
            int r0 = r1.mPredefinedCategories
            return r0
    }

    public int getTracingMode() {
            r1 = this;
            int r0 = r1.mTracingMode
            return r0
    }
}
