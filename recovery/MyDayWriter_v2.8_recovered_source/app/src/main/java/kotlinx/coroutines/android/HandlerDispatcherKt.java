package kotlinx.coroutines.android;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u000e\u0010\b\u001a\u00020\u0001H\u0086@¢\u0006\u0002\u0010\t\u001a\u000e\u0010\n\u001a\u00020\u0001H\u0082@¢\u0006\u0002\u0010\t\u001a\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0002\u001a\u0016\u0010\u000f\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0002\u001a\u001d\u0010\u0010\u001a\u00020\u0003*\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\b\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0011*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005\"\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"MAX_DELAY", "", "Main", "Lkotlinx/coroutines/android/HandlerDispatcher;", "getMain$annotations", "()V", "choreographer", "Landroid/view/Choreographer;", "awaitFrame", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFrameSlowPath", "postFrameCallback", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "updateChoreographerAndPostFrameCallback", "asCoroutineDispatcher", "Landroid/os/Handler;", "name", "", "from", "asHandler", "Landroid/os/Looper;", "async", "", "kotlinx-coroutines-android"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class HandlerDispatcherKt {
    private static final long MAX_DELAY = 4611686018427387903L;
    public static final kotlinx.coroutines.android.HandlerDispatcher Main = null;
    private static volatile android.view.Choreographer choreographer;

    /* JADX INFO: renamed from: $r8$lambda$_-s4SOKmmdhN7PexQng1D-Olurw, reason: not valid java name */
    public static /* synthetic */ void m1655$r8$lambda$_s4SOKmmdhN7PexQng1DOlurw(kotlinx.coroutines.CancellableContinuation r0, long r1) {
            postFrameCallback$lambda$6(r0, r1)
            return
    }

    static {
            r0 = 0
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L18
            r1 = 0
            kotlinx.coroutines.android.HandlerContext r2 = new kotlinx.coroutines.android.HandlerContext     // Catch: java.lang.Throwable -> L18
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L18
            r4 = 1
            android.os.Handler r3 = asHandler(r3, r4)     // Catch: java.lang.Throwable -> L18
            r4 = 2
            r2.<init>(r3, r0, r4, r0)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r2)     // Catch: java.lang.Throwable -> L18
            goto L23
        L18:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)
        L23:
            boolean r2 = kotlin.Result.m159isFailureimpl(r1)
            if (r2 == 0) goto L2a
            goto L2b
        L2a:
            r0 = r1
        L2b:
            kotlinx.coroutines.android.HandlerDispatcher r0 = (kotlinx.coroutines.android.HandlerDispatcher) r0
            kotlinx.coroutines.android.HandlerDispatcherKt.Main = r0
            return
    }

    public static final /* synthetic */ java.lang.Object access$awaitFrameSlowPath(kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = awaitFrameSlowPath(r1)
            return r0
    }

    public static final /* synthetic */ void access$postFrameCallback(android.view.Choreographer r0, kotlinx.coroutines.CancellableContinuation r1) {
            postFrameCallback(r0, r1)
            return
    }

    public static final /* synthetic */ void access$updateChoreographerAndPostFrameCallback(kotlinx.coroutines.CancellableContinuation r0) {
            updateChoreographerAndPostFrameCallback(r0)
            return
    }

    public static final android.os.Handler asHandler(android.os.Looper r7, boolean r8) {
            if (r8 == 0) goto L57
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 < r1) goto L29
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            java.lang.Class[] r1 = new java.lang.Class[r4]
            java.lang.Class<android.os.Looper> r4 = android.os.Looper.class
            r1[r3] = r4
            java.lang.String r3 = "createAsync"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.Object r1 = r0.invoke(r2, r1)
            java.lang.String r2 = "null cannot be cast to non-null type android.os.Handler"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            android.os.Handler r1 = (android.os.Handler) r1
            return r1
        L29:
            r0 = 0
            java.lang.Class<android.os.Handler> r1 = android.os.Handler.class
            r5 = 3
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L50
            java.lang.Class<android.os.Looper> r6 = android.os.Looper.class
            r5[r3] = r6     // Catch: java.lang.NoSuchMethodException -> L50
            java.lang.Class<android.os.Handler$Callback> r3 = android.os.Handler.Callback.class
            r5[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L50
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L50
            r6 = 2
            r5[r6] = r3     // Catch: java.lang.NoSuchMethodException -> L50
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r5)     // Catch: java.lang.NoSuchMethodException -> L50
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r2, r0}
            java.lang.Object r0 = r1.newInstance(r0)
            android.os.Handler r0 = (android.os.Handler) r0
            return r0
        L50:
            r1 = move-exception
            android.os.Handler r2 = new android.os.Handler
            r2.<init>(r7)
            return r2
        L57:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r7)
            return r0
    }

    public static final java.lang.Object awaitFrame(kotlin.coroutines.Continuation<? super java.lang.Long> r7) {
            android.view.Choreographer r0 = kotlinx.coroutines.android.HandlerDispatcherKt.choreographer
            if (r0 == 0) goto L2c
            r1 = 0
            r2 = r7
            r3 = 0
            kotlinx.coroutines.CancellableContinuationImpl r4 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r2)
            r6 = 1
            r4.<init>(r5, r6)
            r4.initCancellability()
            r5 = r4
            kotlinx.coroutines.CancellableContinuation r5 = (kotlinx.coroutines.CancellableContinuation) r5
            r6 = 0
            access$postFrameCallback(r0, r5)
            java.lang.Object r2 = r4.getResult()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L2a
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r7)
        L2a:
            return r2
        L2c:
            java.lang.Object r1 = awaitFrameSlowPath(r7)
            return r1
    }

    private static final java.lang.Object awaitFrameSlowPath(kotlin.coroutines.Continuation<? super java.lang.Long> r10) {
            r0 = 0
            r1 = r10
            r2 = 0
            kotlinx.coroutines.CancellableContinuationImpl r3 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            r5 = 1
            r3.<init>(r4, r5)
            r3.initCancellability()
            r4 = r3
            kotlinx.coroutines.CancellableContinuation r4 = (kotlinx.coroutines.CancellableContinuation) r4
            r5 = 0
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            if (r6 != r7) goto L22
            access$updateChoreographerAndPostFrameCallback(r4)
            goto L35
        L22:
            kotlinx.coroutines.MainCoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getMain()
            kotlin.coroutines.CoroutineContext r7 = r4.getContext()
            r8 = 0
            kotlinx.coroutines.android.HandlerDispatcherKt$awaitFrameSlowPath$lambda$3$$inlined$Runnable$1 r9 = new kotlinx.coroutines.android.HandlerDispatcherKt$awaitFrameSlowPath$lambda$3$$inlined$Runnable$1
            r9.<init>(r4)
            java.lang.Runnable r9 = (java.lang.Runnable) r9
            r6.mo1712dispatch(r7, r9)
        L35:
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L44
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r10)
        L44:
            return r1
    }

    public static final kotlinx.coroutines.android.HandlerDispatcher from(android.os.Handler r2) {
            r0 = 0
            r1 = 1
            kotlinx.coroutines.android.HandlerDispatcher r0 = from$default(r2, r0, r1, r0)
            return r0
    }

    public static final kotlinx.coroutines.android.HandlerDispatcher from(android.os.Handler r1, java.lang.String r2) {
            kotlinx.coroutines.android.HandlerContext r0 = new kotlinx.coroutines.android.HandlerContext
            r0.<init>(r1, r2)
            kotlinx.coroutines.android.HandlerDispatcher r0 = (kotlinx.coroutines.android.HandlerDispatcher) r0
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.android.HandlerDispatcher from$default(android.os.Handler r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.android.HandlerDispatcher r0 = from(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void getMain$annotations() {
            return
    }

    private static final void postFrameCallback(android.view.Choreographer r1, kotlinx.coroutines.CancellableContinuation<? super java.lang.Long> r2) {
            kotlinx.coroutines.android.HandlerDispatcherKt$$ExternalSyntheticLambda0 r0 = new kotlinx.coroutines.android.HandlerDispatcherKt$$ExternalSyntheticLambda0
            r0.<init>(r2)
            r1.postFrameCallback(r0)
            return
    }

    private static final void postFrameCallback$lambda$6(kotlinx.coroutines.CancellableContinuation r4, long r5) {
            r0 = r4
            r1 = 0
            kotlinx.coroutines.MainCoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getMain()
            kotlinx.coroutines.CoroutineDispatcher r2 = (kotlinx.coroutines.CoroutineDispatcher) r2
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r0.resumeUndispatched(r2, r3)
            return
    }

    private static final void updateChoreographerAndPostFrameCallback(kotlinx.coroutines.CancellableContinuation<? super java.lang.Long> r3) {
            android.view.Choreographer r0 = kotlinx.coroutines.android.HandlerDispatcherKt.choreographer
            if (r0 != 0) goto Lf
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = r0
            r2 = 0
            kotlinx.coroutines.android.HandlerDispatcherKt.choreographer = r1
        Lf:
            postFrameCallback(r0, r3)
            return
    }
}
