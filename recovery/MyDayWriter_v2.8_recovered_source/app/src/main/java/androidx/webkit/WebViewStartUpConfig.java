package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public final class WebViewStartUpConfig {
    private final java.util.concurrent.Executor mExecutor;
    private final boolean mShouldRunUiThreadStartUpTasks;

    /* JADX INFO: renamed from: androidx.webkit.WebViewStartUpConfig$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private final java.util.concurrent.Executor mExecutor;
        private boolean mShouldRunUiThreadStartUpTasks;

        public Builder(java.util.concurrent.Executor r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.mShouldRunUiThreadStartUpTasks = r0
                r1.mExecutor = r2
                return
        }

        public androidx.webkit.WebViewStartUpConfig build() {
                r4 = this;
                androidx.webkit.WebViewStartUpConfig r0 = new androidx.webkit.WebViewStartUpConfig
                java.util.concurrent.Executor r1 = r4.mExecutor
                boolean r2 = r4.mShouldRunUiThreadStartUpTasks
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        public androidx.webkit.WebViewStartUpConfig.Builder setShouldRunUiThreadStartUpTasks(boolean r1) {
                r0 = this;
                r0.mShouldRunUiThreadStartUpTasks = r1
                return r0
        }
    }

    private WebViewStartUpConfig(java.util.concurrent.Executor r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.mExecutor = r1
            r0.mShouldRunUiThreadStartUpTasks = r2
            return
    }

    /* synthetic */ WebViewStartUpConfig(java.util.concurrent.Executor r1, boolean r2, androidx.webkit.WebViewStartUpConfig.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public java.util.concurrent.Executor getBackgroundExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mExecutor
            return r0
    }

    public boolean shouldRunUiThreadStartUpTasks() {
            r1 = this;
            boolean r0 = r1.mShouldRunUiThreadStartUpTasks
            return r0
    }
}
