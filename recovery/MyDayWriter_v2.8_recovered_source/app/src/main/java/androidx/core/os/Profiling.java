package androidx.core.os;

/* JADX INFO: compiled from: Profiling.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a&\u0010\n\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0013H\u0007\u001a\u001e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0013H\u0007\u001a2\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"KEY_DURATION_MS", "", "KEY_SAMPLING_INTERVAL_BYTES", "KEY_TRACK_JAVA_ALLOCATIONS", "KEY_FREQUENCY_HZ", "KEY_SIZE_KB", "KEY_BUFFER_FILL_POLICY", "VALUE_BUFFER_FILL_POLICY_DISCARD", "", "VALUE_BUFFER_FILL_POLICY_RING_BUFFER", "registerForAllProfilingResults", "Lkotlinx/coroutines/flow/Flow;", "Landroid/os/ProfilingResult;", "context", "Landroid/content/Context;", "", "executor", "Ljava/util/concurrent/Executor;", "listener", "Ljava/util/function/Consumer;", "unregisterForAllProfilingResults", "requestProfiling", "profilingRequest", "Landroidx/core/os/ProfilingRequest;", "core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class Profiling {
    private static final java.lang.String KEY_BUFFER_FILL_POLICY = "KEY_BUFFER_FILL_POLICY";
    private static final java.lang.String KEY_DURATION_MS = "KEY_DURATION_MS";
    private static final java.lang.String KEY_FREQUENCY_HZ = "KEY_FREQUENCY_HZ";
    private static final java.lang.String KEY_SAMPLING_INTERVAL_BYTES = "KEY_SAMPLING_INTERVAL_BYTES";
    private static final java.lang.String KEY_SIZE_KB = "KEY_SIZE_KB";
    private static final java.lang.String KEY_TRACK_JAVA_ALLOCATIONS = "KEY_TRACK_JAVA_ALLOCATIONS";
    private static final int VALUE_BUFFER_FILL_POLICY_DISCARD = 1;
    private static final int VALUE_BUFFER_FILL_POLICY_RING_BUFFER = 2;

    /* JADX INFO: renamed from: androidx.core.os.Profiling$registerForAllProfilingResults$1, reason: invalid class name */
    /* JADX INFO: compiled from: Profiling.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroid/os/ProfilingResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.core.os.Profiling$registerForAllProfilingResults$1", f = "Profiling.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super android.os.ProfilingResult>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ android.content.Context $context;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        public static /* synthetic */ void $r8$lambda$e76Sbdxr3z8lJSc3djHa1d8OTSI(java.lang.Runnable r0) {
                invokeSuspend$lambda$1(r0)
                return
        }

        public static /* synthetic */ void $r8$lambda$eIsigWnrvBGy8g_YH95XWnSC5zo(kotlinx.coroutines.channels.ProducerScope r0, android.os.ProfilingResult r1) {
                invokeSuspend$lambda$0(r0, r1)
                return
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$ep3tSYQRU2jLU3tmY2t5HOMpjww(android.os.ProfilingManager r0, java.util.function.Consumer r1) {
                kotlin.Unit r0 = invokeSuspend$lambda$2(r0, r1)
                return r0
        }

        AnonymousClass1(android.content.Context r2, kotlin.coroutines.Continuation<? super androidx.core.os.Profiling.AnonymousClass1> r3) {
                r1 = this;
                r1.$context = r2
                r0 = 2
                r1.<init>(r0, r3)
                return
        }

        private static final void invokeSuspend$lambda$0(kotlinx.coroutines.channels.ProducerScope r0, android.os.ProfilingResult r1) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                r0.mo1656trySendJP2dKIU(r1)
                return
        }

        private static final void invokeSuspend$lambda$1(java.lang.Runnable r0) {
                r0.run()
                return
        }

        private static final kotlin.Unit invokeSuspend$lambda$2(android.os.ProfilingManager r1, java.util.function.Consumer r2) {
                r1.unregisterForAllProfilingResults(r2)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                androidx.core.os.Profiling$registerForAllProfilingResults$1 r0 = new androidx.core.os.Profiling$registerForAllProfilingResults$1
                android.content.Context r1 = r2.$context
                r0.<init>(r1, r4)
                r0.L$0 = r3
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super android.os.ProfilingResult> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.channels.ProducerScope<? super android.os.ProfilingResult> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                androidx.core.os.Profiling$registerForAllProfilingResults$1 r0 = (androidx.core.os.Profiling.AnonymousClass1) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                switch(r1) {
                    case 0: goto L15;
                    case 1: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L11:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L45
            L15:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r1 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                androidx.core.os.Profiling$registerForAllProfilingResults$1$$ExternalSyntheticLambda0 r2 = new androidx.core.os.Profiling$registerForAllProfilingResults$1$$ExternalSyntheticLambda0
                r2.<init>(r1)
                android.content.Context r3 = r7.$context
                java.lang.Class<android.os.ProfilingManager> r4 = android.os.ProfilingManager.class
                java.lang.Object r3 = r3.getSystemService(r4)
                android.os.ProfilingManager r3 = (android.os.ProfilingManager) r3
                androidx.core.os.Profiling$registerForAllProfilingResults$1$$ExternalSyntheticLambda1 r4 = new androidx.core.os.Profiling$registerForAllProfilingResults$1$$ExternalSyntheticLambda1
                r4.<init>()
                r3.registerForAllProfilingResults(r4, r2)
                androidx.core.os.Profiling$registerForAllProfilingResults$1$$ExternalSyntheticLambda2 r4 = new androidx.core.os.Profiling$registerForAllProfilingResults$1$$ExternalSyntheticLambda2
                r4.<init>(r3, r2)
                r5 = r7
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r6 = 1
                r7.label = r6
                java.lang.Object r1 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r1, r4, r5)
                if (r1 != r0) goto L45
                return r0
            L45:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    public static final kotlinx.coroutines.flow.Flow<android.os.ProfilingResult> registerForAllProfilingResults(android.content.Context r2) {
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.core.os.Profiling$registerForAllProfilingResults$1 r0 = new androidx.core.os.Profiling$registerForAllProfilingResults$1
            r1 = 0
            r0.<init>(r2, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.callbackFlow(r0)
            return r0
    }

    public static final void registerForAllProfilingResults(android.content.Context r1, java.util.concurrent.Executor r2, java.util.function.Consumer<android.os.ProfilingResult> r3) {
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "executor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Class<android.os.ProfilingManager> r0 = android.os.ProfilingManager.class
            java.lang.Object r0 = r1.getSystemService(r0)
            android.os.ProfilingManager r0 = (android.os.ProfilingManager) r0
            r0.registerForAllProfilingResults(r2, r3)
            return
    }

    public static final void requestProfiling(android.content.Context r8, androidx.core.os.ProfilingRequest r9, java.util.concurrent.Executor r10, java.util.function.Consumer<android.os.ProfilingResult> r11) {
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "profilingRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.Class<android.os.ProfilingManager> r0 = android.os.ProfilingManager.class
            java.lang.Object r0 = r8.getSystemService(r0)
            r1 = r0
            android.os.ProfilingManager r1 = (android.os.ProfilingManager) r1
            int r2 = r9.getProfilingType()
            android.os.Bundle r3 = r9.getParams()
            java.lang.String r4 = r9.getTag()
            android.os.CancellationSignal r5 = r9.getCancellationSignal()
            r6 = r10
            r7 = r11
            r1.requestProfiling(r2, r3, r4, r5, r6, r7)
            return
    }

    public static final void unregisterForAllProfilingResults(android.content.Context r1, java.util.function.Consumer<android.os.ProfilingResult> r2) {
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Class<android.os.ProfilingManager> r0 = android.os.ProfilingManager.class
            java.lang.Object r0 = r1.getSystemService(r0)
            android.os.ProfilingManager r0 = (android.os.ProfilingManager) r0
            r0.unregisterForAllProfilingResults(r2)
            return
    }
}
