package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class ScrollFeedbackProviderCompat {
    private final androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl mImpl;

    /* JADX INFO: renamed from: androidx.core.view.ScrollFeedbackProviderCompat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class ScrollFeedbackProviderApi35Impl implements androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl {
        private final android.view.ScrollFeedbackProvider mProvider;

        ScrollFeedbackProviderApi35Impl(android.view.View r2) {
                r1 = this;
                r1.<init>()
                android.view.ScrollFeedbackProvider r0 = android.view.ScrollFeedbackProvider.createProvider(r2)
                r1.mProvider = r0
                return
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollLimit(int r2, int r3, int r4, boolean r5) {
                r1 = this;
                android.view.ScrollFeedbackProvider r0 = r1.mProvider
                r0.onScrollLimit(r2, r3, r4, r5)
                return
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollProgress(int r2, int r3, int r4, int r5) {
                r1 = this;
                android.view.ScrollFeedbackProvider r0 = r1.mProvider
                r0.onScrollProgress(r2, r3, r4, r5)
                return
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onSnapToItem(int r2, int r3, int r4) {
                r1 = this;
                android.view.ScrollFeedbackProvider r0 = r1.mProvider
                r0.onSnapToItem(r2, r3, r4)
                return
        }
    }

    private static class ScrollFeedbackProviderBaseImpl implements androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl {
        private ScrollFeedbackProviderBaseImpl() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ ScrollFeedbackProviderBaseImpl(androidx.core.view.ScrollFeedbackProviderCompat.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollLimit(int r1, int r2, int r3, boolean r4) {
                r0 = this;
                return
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollProgress(int r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onSnapToItem(int r1, int r2, int r3) {
                r0 = this;
                return
        }
    }

    private interface ScrollFeedbackProviderImpl {
        void onScrollLimit(int r1, int r2, int r3, boolean r4);

        void onScrollProgress(int r1, int r2, int r3, int r4);

        void onSnapToItem(int r1, int r2, int r3);
    }

    private ScrollFeedbackProviderCompat(android.view.View r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 < r1) goto L11
            androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderApi35Impl r0 = new androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderApi35Impl
            r0.<init>(r3)
            r2.mImpl = r0
            goto L19
        L11:
            androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderBaseImpl r0 = new androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderBaseImpl
            r1 = 0
            r0.<init>(r1)
            r2.mImpl = r0
        L19:
            return
    }

    public static androidx.core.view.ScrollFeedbackProviderCompat createProvider(android.view.View r1) {
            androidx.core.view.ScrollFeedbackProviderCompat r0 = new androidx.core.view.ScrollFeedbackProviderCompat
            r0.<init>(r1)
            return r0
    }

    public void onScrollLimit(int r2, int r3, int r4, boolean r5) {
            r1 = this;
            androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl r0 = r1.mImpl
            r0.onScrollLimit(r2, r3, r4, r5)
            return
    }

    public void onScrollProgress(int r2, int r3, int r4, int r5) {
            r1 = this;
            androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl r0 = r1.mImpl
            r0.onScrollProgress(r2, r3, r4, r5)
            return
    }

    public void onSnapToItem(int r2, int r3, int r4) {
            r1 = this;
            androidx.core.view.ScrollFeedbackProviderCompat$ScrollFeedbackProviderImpl r0 = r1.mImpl
            r0.onSnapToItem(r2, r3, r4)
            return
    }
}
