package androidx.activity;

/* JADX INFO: compiled from: FullyDrawnReporter.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0006J\u0014\u0010\u0017\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0014\u0010\u0019\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\b\u0010\u001a\u001a\u00020\u0006H\u0007J\b\u0010\u001b\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00128\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/activity/FullyDrawnReporter;", "", "executor", "Ljava/util/concurrent/Executor;", "reportFullyDrawn", "Lkotlin/Function0;", "", "<init>", "(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)V", "lock", "reporterCount", "", "reportPosted", "", "reportedFullyDrawn", "isFullyDrawnReported", "()Z", "onReportCallbacks", "", "reportRunnable", "Ljava/lang/Runnable;", "addReporter", "removeReporter", "addOnReportDrawnListener", "callback", "removeOnReportDrawnListener", "fullyDrawnReported", "postWhenReportersAreDone", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FullyDrawnReporter {
    private final java.util.concurrent.Executor executor;
    private final java.lang.Object lock;
    private final java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> onReportCallbacks;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> reportFullyDrawn;
    private boolean reportPosted;
    private final java.lang.Runnable reportRunnable;
    private boolean reportedFullyDrawn;
    private int reporterCount;

    /* JADX INFO: renamed from: $r8$lambda$A0RwxxT-QIMFOsDA3Nv48auR1K4, reason: not valid java name */
    public static /* synthetic */ void m9$r8$lambda$A0RwxxTQIMFOsDA3Nv48auR1K4(androidx.activity.FullyDrawnReporter r0) {
            reportRunnable$lambda$2(r0)
            return
    }

    public FullyDrawnReporter(java.util.concurrent.Executor r2, kotlin.jvm.functions.Function0<kotlin.Unit> r3) {
            r1 = this;
            java.lang.String r0 = "executor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "reportFullyDrawn"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.executor = r2
            r1.reportFullyDrawn = r3
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.lock = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1.onReportCallbacks = r0
            androidx.activity.FullyDrawnReporter$$ExternalSyntheticLambda0 r0 = new androidx.activity.FullyDrawnReporter$$ExternalSyntheticLambda0
            r0.<init>(r1)
            r1.reportRunnable = r0
            return
    }

    private final void postWhenReportersAreDone() {
            r2 = this;
            boolean r0 = r2.reportPosted
            if (r0 != 0) goto L12
            int r0 = r2.reporterCount
            if (r0 != 0) goto L12
            r0 = 1
            r2.reportPosted = r0
            java.util.concurrent.Executor r0 = r2.executor
            java.lang.Runnable r1 = r2.reportRunnable
            r0.execute(r1)
        L12:
            return
    }

    private static final void reportRunnable$lambda$2(androidx.activity.FullyDrawnReporter r3) {
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            r1 = 0
            r2 = 0
            r3.reportPosted = r2     // Catch: java.lang.Throwable -> L1c
            int r2 = r3.reporterCount     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L17
            boolean r2 = r3.reportedFullyDrawn     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L17
            kotlin.jvm.functions.Function0<kotlin.Unit> r2 = r3.reportFullyDrawn     // Catch: java.lang.Throwable -> L1c
            r2.invoke()     // Catch: java.lang.Throwable -> L1c
            r3.fullyDrawnReported()     // Catch: java.lang.Throwable -> L1c
        L17:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L1c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void addOnReportDrawnListener(kotlin.jvm.functions.Function0<kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            r1 = 0
            boolean r2 = r3.reportedFullyDrawn     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto Lf
            r2 = 1
            goto L17
        Lf:
            java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> r2 = r3.onReportCallbacks     // Catch: java.lang.Throwable -> L20
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L20
            r2.add(r4)     // Catch: java.lang.Throwable -> L20
            r2 = 0
        L17:
            monitor-exit(r0)
            if (r2 == 0) goto L1f
            r4.invoke()
        L1f:
            return
        L20:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void addReporter() {
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            r1 = 0
            boolean r2 = r3.reportedFullyDrawn     // Catch: java.lang.Throwable -> L13
            if (r2 != 0) goto Le
            int r2 = r3.reporterCount     // Catch: java.lang.Throwable -> L13
            int r2 = r2 + 1
            r3.reporterCount = r2     // Catch: java.lang.Throwable -> L13
        Le:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return
        L13:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void fullyDrawnReported() {
            r8 = this;
            java.lang.Object r0 = r8.lock
            monitor-enter(r0)
            r1 = 0
            r2 = 1
            r8.reportedFullyDrawn = r2     // Catch: java.lang.Throwable -> L2e
            java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> r2 = r8.onReportCallbacks     // Catch: java.lang.Throwable -> L2e
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            java.util.Iterator r4 = r2.iterator()     // Catch: java.lang.Throwable -> L2e
        L10:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto L23
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L2e
            r6 = r5
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6     // Catch: java.lang.Throwable -> L2e
            r7 = 0
            r6.invoke()     // Catch: java.lang.Throwable -> L2e
            goto L10
        L23:
            java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> r2 = r8.onReportCallbacks     // Catch: java.lang.Throwable -> L2e
            r2.clear()     // Catch: java.lang.Throwable -> L2e
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)
            return
        L2e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final boolean isFullyDrawnReported() {
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            r1 = 0
            boolean r2 = r3.reportedFullyDrawn     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return r2
        L8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void removeOnReportDrawnListener(kotlin.jvm.functions.Function0<kotlin.Unit> r4) {
            r3 = this;
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            r1 = 0
            java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> r2 = r3.onReportCallbacks     // Catch: java.lang.Throwable -> L14
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L14
            r2.remove(r4)     // Catch: java.lang.Throwable -> L14
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            return
        L14:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void removeReporter() {
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            r1 = 0
            boolean r2 = r3.reportedFullyDrawn     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L15
            int r2 = r3.reporterCount     // Catch: java.lang.Throwable -> L1a
            if (r2 <= 0) goto L15
            int r2 = r3.reporterCount     // Catch: java.lang.Throwable -> L1a
            int r2 = r2 + (-1)
            r3.reporterCount = r2     // Catch: java.lang.Throwable -> L1a
            r3.postWhenReportersAreDone()     // Catch: java.lang.Throwable -> L1a
        L15:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            return
        L1a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
