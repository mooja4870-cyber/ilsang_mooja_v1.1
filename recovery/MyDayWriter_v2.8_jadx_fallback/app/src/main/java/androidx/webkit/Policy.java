package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public final class Policy {
    private final java.util.List<androidx.webkit.Policy.ConfigRunnable> mBehaviors;

    /* JADX INFO: renamed from: androidx.webkit.Policy$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        final java.util.List<androidx.webkit.Policy.ConfigRunnable> mBehaviors;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mBehaviors = r0
                return
        }

        public androidx.webkit.Policy build() {
                r3 = this;
                androidx.webkit.Policy r0 = new androidx.webkit.Policy
                java.util.List<androidx.webkit.Policy$ConfigRunnable> r1 = r3.mBehaviors
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }
    }

    private interface ConfigRunnable {
        void configure(org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface.Config r1) throws androidx.webkit.WebViewBuilderException;
    }

    private Policy(java.util.List<androidx.webkit.Policy.ConfigRunnable> r1) {
            r0 = this;
            r0.<init>()
            r0.mBehaviors = r1
            return
    }

    /* synthetic */ Policy(java.util.List r1, androidx.webkit.Policy.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    void configure(org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface.Config r3) throws androidx.webkit.WebViewBuilderException {
            r2 = this;
            java.util.List<androidx.webkit.Policy$ConfigRunnable> r0 = r2.mBehaviors
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.webkit.Policy$ConfigRunnable r1 = (androidx.webkit.Policy.ConfigRunnable) r1
            r1.configure(r3)
            goto L6
        L16:
            return
    }
}
