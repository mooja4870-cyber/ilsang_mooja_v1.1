package kotlinx.coroutines;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\r\u000eB\u001b\u0012\u0014\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086@¢\u0006\u0002\u0010\fR\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\t\u0010\b\u001a\u00020\tX\u0082\u0004¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/AwaitAll;", "T", "", "deferreds", "", "Lkotlinx/coroutines/Deferred;", "([Lkotlinx/coroutines/Deferred;)V", "[Lkotlinx/coroutines/Deferred;", "notCompletedCount", "Lkotlinx/atomicfu/AtomicInt;", "await", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AwaitAllNode", "DisposeHandlersOnCancel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AwaitAll<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater notCompletedCount$volatile$FU = null;
    private final kotlinx.coroutines.Deferred<T>[] deferreds;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: compiled from: Await.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u001b\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\bR\b\u0012\u0004\u0012\u00028\u00000\t0\u0007X\u0082\u0004R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R<\u0010\u000b\u001a\u000e\u0018\u00010\bR\b\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\n\u001a\u000e\u0018\u00010\bR\b\u0012\u0004\u0012\u00028\u00000\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "Lkotlinx/coroutines/JobNode;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/AwaitAll;Lkotlinx/coroutines/CancellableContinuation;)V", "_disposer", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/AwaitAll;", "value", "disposer", "getDisposer", "()Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "setDisposer", "(Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;)V", "handle", "Lkotlinx/coroutines/DisposableHandle;", "getHandle", "()Lkotlinx/coroutines/DisposableHandle;", "setHandle", "(Lkotlinx/coroutines/DisposableHandle;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class AwaitAllNode extends kotlinx.coroutines.JobNode {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _disposer$volatile$FU = null;
        private volatile /* synthetic */ java.lang.Object _disposer$volatile;
        private final kotlinx.coroutines.CancellableContinuation<java.util.List<? extends T>> continuation;
        public kotlinx.coroutines.DisposableHandle handle;
        final /* synthetic */ kotlinx.coroutines.AwaitAll<T> this$0;

        static {
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                java.lang.String r1 = "_disposer$volatile"
                java.lang.Class<kotlinx.coroutines.AwaitAll$AwaitAllNode> r2 = kotlinx.coroutines.AwaitAll.AwaitAllNode.class
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
                kotlinx.coroutines.AwaitAll.AwaitAllNode._disposer$volatile$FU = r0
                return
        }

        public AwaitAllNode(kotlinx.coroutines.AwaitAll r1, kotlinx.coroutines.CancellableContinuation<? super java.util.List<? extends T>> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.continuation = r2
                return
        }

        private final /* synthetic */ java.lang.Object get_disposer$volatile() {
                r1 = this;
                java.lang.Object r0 = r1._disposer$volatile
                return r0
        }

        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater get_disposer$volatile$FU() {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.AwaitAll.AwaitAllNode._disposer$volatile$FU
                return r0
        }

        private final /* synthetic */ void set_disposer$volatile(java.lang.Object r1) {
                r0 = this;
                r0._disposer$volatile = r1
                return
        }

        public final kotlinx.coroutines.AwaitAll<T>.DisposeHandlersOnCancel getDisposer() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_disposer$volatile$FU()
                java.lang.Object r0 = r0.get(r1)
                kotlinx.coroutines.AwaitAll$DisposeHandlersOnCancel r0 = (kotlinx.coroutines.AwaitAll.DisposeHandlersOnCancel) r0
                return r0
        }

        public final kotlinx.coroutines.DisposableHandle getHandle() {
                r1 = this;
                kotlinx.coroutines.DisposableHandle r0 = r1.handle
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.String r0 = "handle"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                r0 = 0
                return r0
        }

        @Override // kotlinx.coroutines.InternalCompletionHandler
        public void invoke(java.lang.Throwable r12) {
                r11 = this;
                if (r12 == 0) goto L19
                kotlinx.coroutines.CancellableContinuation<java.util.List<? extends T>> r0 = r11.continuation
                java.lang.Object r0 = r0.tryResumeWithException(r12)
                if (r0 == 0) goto L59
                kotlinx.coroutines.CancellableContinuation<java.util.List<? extends T>> r1 = r11.continuation
                r1.completeResume(r0)
                kotlinx.coroutines.AwaitAll$DisposeHandlersOnCancel r1 = r11.getDisposer()
                if (r1 == 0) goto L59
                r1.disposeAll()
                goto L59
            L19:
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.AwaitAll.access$getNotCompletedCount$volatile$FU()
                kotlinx.coroutines.AwaitAll<T> r1 = r11.this$0
                int r0 = r0.decrementAndGet(r1)
                if (r0 != 0) goto L59
                kotlinx.coroutines.CancellableContinuation<java.util.List<? extends T>> r0 = r11.continuation
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                kotlinx.coroutines.AwaitAll<T> r1 = r11.this$0
                kotlinx.coroutines.Deferred[] r1 = kotlinx.coroutines.AwaitAll.access$getDeferreds$p(r1)
                r2 = 0
                java.util.ArrayList r3 = new java.util.ArrayList
                int r4 = r1.length
                r3.<init>(r4)
                java.util.Collection r3 = (java.util.Collection) r3
                r4 = r1
                r5 = 0
                int r6 = r4.length
                r7 = 0
            L3c:
                if (r7 >= r6) goto L4c
                r8 = r4[r7]
                r9 = r8
                r10 = 0
                java.lang.Object r9 = r9.getCompleted()
                r3.add(r9)
                int r7 = r7 + 1
                goto L3c
            L4c:
                java.util.List r3 = (java.util.List) r3
                kotlin.Result$Companion r1 = kotlin.Result.Companion
                java.lang.Object r1 = kotlin.Result.m153constructorimpl(r3)
                r0.resumeWith(r1)
            L59:
                return
        }

        public final void setDisposer(kotlinx.coroutines.AwaitAll<T>.DisposeHandlersOnCancel r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_disposer$volatile$FU()
                r0.set(r1, r2)
                return
        }

        public final void setHandle(kotlinx.coroutines.DisposableHandle r1) {
                r0 = this;
                r0.handle = r1
                return
        }
    }

    /* JADX INFO: compiled from: Await.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f0\u0004R\b\u0012\u0004\u0012\u00028\u00000\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R \u0010\u0002\u001a\u0012\u0012\u000e\u0012\f0\u0004R\b\u0012\u0004\u0012\u00028\u00000\u00050\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "nodes", "", "Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "Lkotlinx/coroutines/AwaitAll;", "(Lkotlinx/coroutines/AwaitAll;[Lkotlinx/coroutines/AwaitAll$AwaitAllNode;)V", "[Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "disposeAll", "", "invoke", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class DisposeHandlersOnCancel implements kotlinx.coroutines.CancelHandler {
        private final kotlinx.coroutines.AwaitAll<T>.AwaitAllNode[] nodes;
        final /* synthetic */ kotlinx.coroutines.AwaitAll<T> this$0;

        public DisposeHandlersOnCancel(kotlinx.coroutines.AwaitAll r1, kotlinx.coroutines.AwaitAll<T>.AwaitAllNode[] r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.nodes = r2
                return
        }

        public final void disposeAll() {
                r8 = this;
                kotlinx.coroutines.AwaitAll<T>$AwaitAllNode[] r0 = r8.nodes
                r1 = 0
                int r2 = r0.length
                r3 = 0
            L5:
                if (r3 >= r2) goto L16
                r4 = r0[r3]
                r5 = r4
                r6 = 0
                kotlinx.coroutines.DisposableHandle r7 = r5.getHandle()
                r7.dispose()
                int r3 = r3 + 1
                goto L5
            L16:
                return
        }

        @Override // kotlinx.coroutines.CancelHandler
        public void invoke(java.lang.Throwable r1) {
                r0 = this;
                r0.disposeAll()
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "DisposeHandlersOnCancel["
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.AwaitAll<T>$AwaitAllNode[] r1 = r2.nodes
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 93
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Class<kotlinx.coroutines.AwaitAll> r0 = kotlinx.coroutines.AwaitAll.class
            java.lang.String r1 = "notCompletedCount$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.AwaitAll.notCompletedCount$volatile$FU = r0
            return
    }

    public AwaitAll(kotlinx.coroutines.Deferred<? extends T>[] r2) {
            r1 = this;
            r1.<init>()
            r1.deferreds = r2
            kotlinx.coroutines.Deferred<T>[] r0 = r1.deferreds
            int r0 = r0.length
            r1.notCompletedCount$volatile = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.Deferred[] access$getDeferreds$p(kotlinx.coroutines.AwaitAll r1) {
            kotlinx.coroutines.Deferred<T>[] r0 = r1.deferreds
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater access$getNotCompletedCount$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = getNotCompletedCount$volatile$FU()
            return r0
    }

    private final /* synthetic */ int getNotCompletedCount$volatile() {
            r1 = this;
            int r0 = r1.notCompletedCount$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getNotCompletedCount$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.AwaitAll.notCompletedCount$volatile$FU
            return r0
    }

    private final /* synthetic */ void setNotCompletedCount$volatile(int r1) {
            r0 = this;
            r0.notCompletedCount$volatile = r1
            return
    }

    public final java.lang.Object await(kotlin.coroutines.Continuation<? super java.util.List<? extends T>> r22) {
            r21 = this;
            r0 = r21
            r1 = 0
            r2 = r22
            r3 = 0
            kotlinx.coroutines.CancellableContinuationImpl r4 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r2)
            r6 = 1
            r4.<init>(r5, r6)
            r4.initCancellability()
            r5 = r4
            kotlinx.coroutines.CancellableContinuation r5 = (kotlinx.coroutines.CancellableContinuation) r5
            r6 = 0
            kotlinx.coroutines.Deferred[] r7 = access$getDeferreds$p(r0)
            int r7 = r7.length
            kotlinx.coroutines.AwaitAll$AwaitAllNode[] r8 = new kotlinx.coroutines.AwaitAll.AwaitAllNode[r7]
            r9 = 0
            r10 = r9
        L20:
            if (r10 >= r7) goto L51
            kotlinx.coroutines.Deferred[] r11 = access$getDeferreds$p(r0)
            r11 = r11[r10]
            r11.start()
            kotlinx.coroutines.AwaitAll$AwaitAllNode r12 = new kotlinx.coroutines.AwaitAll$AwaitAllNode
            r12.<init>(r0, r5)
            r13 = r12
            r14 = 0
            r15 = r11
            kotlinx.coroutines.Job r15 = (kotlinx.coroutines.Job) r15
            r18 = r13
            kotlinx.coroutines.InternalCompletionHandler r18 = (kotlinx.coroutines.InternalCompletionHandler) r18
            r19 = 3
            r20 = 0
            r16 = 0
            r17 = 0
            kotlinx.coroutines.DisposableHandle r15 = kotlinx.coroutines.JobKt.invokeOnCompletion$default(r15, r16, r17, r18, r19, r20)
            r13.setHandle(r15)
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            r8[r10] = r12
            int r10 = r10 + 1
            goto L20
        L51:
            kotlinx.coroutines.AwaitAll$DisposeHandlersOnCancel r7 = new kotlinx.coroutines.AwaitAll$DisposeHandlersOnCancel
            r7.<init>(r0, r8)
            r10 = r8
            r11 = 0
            int r12 = r10.length
        L59:
            if (r9 >= r12) goto L66
            r13 = r10[r9]
            r14 = r13
            r15 = 0
            r14.setDisposer(r7)
            int r9 = r9 + 1
            goto L59
        L66:
            boolean r9 = r5.isCompleted()
            if (r9 == 0) goto L71
            r7.disposeAll()
            goto L77
        L71:
            r9 = r7
            kotlinx.coroutines.CancelHandler r9 = (kotlinx.coroutines.CancelHandler) r9
            kotlinx.coroutines.CancellableContinuationKt.invokeOnCancellation(r5, r9)
        L77:
            java.lang.Object r2 = r4.getResult()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L86
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r22)
        L86:
            return r2
    }
}
