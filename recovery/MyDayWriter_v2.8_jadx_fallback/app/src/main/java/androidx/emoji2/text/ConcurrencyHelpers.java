package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
class ConcurrencyHelpers {
    private static final int FONT_LOAD_TIMEOUT_SECONDS = 15;

    static class Handler28Impl {
        private Handler28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.os.Handler createAsync(android.os.Looper r1) {
                android.os.Handler r0 = android.os.Handler.createAsync(r1)
                return r0
        }
    }

    public static /* synthetic */ boolean $r8$lambda$mCEi04OcFi8gu0FD463twzV2nG8(android.os.Handler r0, java.lang.Runnable r1) {
            boolean r0 = r0.post(r1)
            return r0
    }

    private ConcurrencyHelpers() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    static java.util.concurrent.Executor convertHandlerToExecutor(android.os.Handler r1) {
            java.util.Objects.requireNonNull(r1)
            androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda0 r0 = new androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }

    static java.util.concurrent.ThreadPoolExecutor createBackgroundPriorityExecutor(java.lang.String r9) {
            androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda1 r0 = new androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda1
            r0.<init>(r9)
            r8 = r0
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingDeque r7 = new java.util.concurrent.LinkedBlockingDeque
            r7.<init>()
            r2 = 0
            r3 = 1
            r4 = 15
            r1.<init>(r2, r3, r4, r6, r7, r8)
            r0 = 1
            r1.allowCoreThreadTimeOut(r0)
            return r1
    }

    static /* synthetic */ java.lang.Thread lambda$createBackgroundPriorityExecutor$0(java.lang.String r2, java.lang.Runnable r3) {
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r3, r2)
            r1 = 10
            r0.setPriority(r1)
            return r0
    }

    static android.os.Handler mainHandlerAsync() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lf
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = androidx.emoji2.text.ConcurrencyHelpers.Handler28Impl.createAsync(r0)
            return r0
        Lf:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            return r0
    }
}
