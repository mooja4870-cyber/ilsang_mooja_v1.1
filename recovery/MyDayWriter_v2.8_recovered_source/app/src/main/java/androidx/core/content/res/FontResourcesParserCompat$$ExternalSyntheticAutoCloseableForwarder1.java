package androidx.core.content.res;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FontResourcesParserCompat$$ExternalSyntheticAutoCloseableForwarder1 {
    public static /* synthetic */ void m(java.util.concurrent.ExecutorService r5) {
            java.util.concurrent.ForkJoinPool r0 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r5 != r0) goto L7
            return
        L7:
            boolean r0 = r5.isTerminated()
            if (r0 != 0) goto L2d
            r5.shutdown()
            r1 = 0
        L11:
            if (r0 != 0) goto L24
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L1c
            r3 = 1
            boolean r0 = r5.awaitTermination(r3, r2)     // Catch: java.lang.InterruptedException -> L1c
            goto L11
        L1c:
            r2 = move-exception
            if (r1 != 0) goto L11
            r5.shutdownNow()
            r1 = 1
            goto L11
        L24:
            if (r1 == 0) goto L2d
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L2d:
            return
    }
}
