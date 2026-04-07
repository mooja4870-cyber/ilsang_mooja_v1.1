package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0002+,B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0002J\u0018\u0010 \u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0002\u0010!J\u0018\u0010\"\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0002\u0010!J\u001e\u0010#\u001a\u0004\u0018\u00010\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\n2\b\u0010$\u001a\u0004\u0018\u00010\nH\u0014J\u001e\u0010%\u001a\u00020\u00192\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010)\u001a\u00020\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010*\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R(\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eRk\u0010\u000f\u001a_\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00170\u0010j\u0002`\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001cX\u0082\u0004¨\u0006-"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "Lkotlinx/coroutines/sync/SemaphoreImpl;", "Lkotlinx/coroutines/sync/Mutex;", "locked", "", "(Z)V", "isLocked", "()Z", "onLock", "Lkotlinx/coroutines/selects/SelectClause2;", "", "getOnLock$annotations", "()V", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSelectCancellationUnlockConstructor", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/ParameterName;", "name", "select", "param", "internalResult", "Lkotlin/Function1;", "", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "owner", "Lkotlinx/atomicfu/AtomicRef;", "holdsLock", "holdsLockImpl", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lockSuspend", "onLockProcessResult", "result", "onLockRegFunction", "toString", "", "tryLock", "tryLockImpl", "unlock", "CancellableContinuationWithOwner", "SelectInstanceWithOwner", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class MutexImpl extends kotlinx.coroutines.sync.SemaphoreImpl implements kotlinx.coroutines.sync.Mutex {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater owner$volatile$FU = null;
    private final kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>> onSelectCancellationUnlockConstructor;
    private volatile /* synthetic */ java.lang.Object owner$volatile;

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u0012\u001a\u00020\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0001J\u0011\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0007H\u0097\u0001J\t\u0010\u0017\u001a\u00020\u0002H\u0097\u0001J2\u0010\u0018\u001a\u00020\u00022'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00020\u001aj\u0002`\u001dH\u0096\u0001J\u001d\u0010\u0018\u001a\u00020\u00022\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010 \u001a\u00020!H\u0096\u0001J:\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022#\u0010$\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001aH\u0016¢\u0006\u0002\u0010%J\u001c\u0010&\u001a\u00020\u00022\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0096\u0001¢\u0006\u0002\u0010)J$\u0010*\u001a\u0004\u0018\u00010\u00072\u0006\u0010#\u001a\u00020\u00022\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0007H\u0097\u0001¢\u0006\u0002\u0010,JF\u0010*\u001a\u0004\u0018\u00010\u00072\u0006\u0010#\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u00072#\u0010$\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001aH\u0016¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u0004\u0018\u00010\u00072\u0006\u0010/\u001a\u00020\u0014H\u0097\u0001J\u001a\u00100\u001a\u00020\u0002*\u0002012\u0006\u0010#\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0002\u00102J\u0015\u00103\u001a\u00020\u0002*\u0002012\u0006\u0010/\u001a\u00020\u0014H\u0097\u0001R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\nX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0012\u0010\u0011\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner;", "Lkotlinx/coroutines/CancellableContinuation;", "", "Lkotlinx/coroutines/Waiter;", "cont", "Lkotlinx/coroutines/CancellableContinuationImpl;", "owner", "", "(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/CancellableContinuationImpl;Ljava/lang/Object;)V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "isActive", "", "()Z", "isCancelled", "isCompleted", "cancel", "cause", "", "completeResume", "token", "initCancellability", "invokeOnCancellation", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "segment", "Lkotlinx/coroutines/internal/Segment;", "index", "", "resume", "value", "onCancellation", "(Lkotlin/Unit;Lkotlin/jvm/functions/Function1;)V", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "tryResume", "idempotent", "(Lkotlin/Unit;Ljava/lang/Object;)Ljava/lang/Object;", "(Lkotlin/Unit;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "tryResumeWithException", "exception", "resumeUndispatched", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/Unit;)V", "resumeUndispatchedWithException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class CancellableContinuationWithOwner implements kotlinx.coroutines.CancellableContinuation<kotlin.Unit>, kotlinx.coroutines.Waiter {
        public final kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> cont;
        public final java.lang.Object owner;
        final /* synthetic */ kotlinx.coroutines.sync.MutexImpl this$0;

        public CancellableContinuationWithOwner(kotlinx.coroutines.sync.MutexImpl r1, kotlinx.coroutines.CancellableContinuationImpl<? super kotlin.Unit> r2, java.lang.Object r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.cont = r2
                r0.owner = r3
                return
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean cancel(java.lang.Throwable r2) {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r1.cont
                boolean r0 = r0.cancel(r2)
                return r0
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void completeResume(java.lang.Object r2) {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r1.cont
                r0.completeResume(r2)
                return
        }

        @Override // kotlin.coroutines.Continuation
        public kotlin.coroutines.CoroutineContext getContext() {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r1.cont
                kotlin.coroutines.CoroutineContext r0 = r0.getContext()
                return r0
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void initCancellability() {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r1.cont
                r0.initCancellability()
                return
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void invokeOnCancellation(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r2) {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r1.cont
                r0.invokeOnCancellation(r2)
                return
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> r2, int r3) {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r1.cont
                r0.invokeOnCancellation(r2, r3)
                return
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isActive() {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r1.cont
                boolean r0 = r0.isActive()
                return r0
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCancelled() {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r1.cont
                boolean r0 = r0.isCancelled()
                return r0
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCompleted() {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r1.cont
                boolean r0 = r0.isCompleted()
                return r0
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ void resume(kotlin.Unit r2, kotlin.jvm.functions.Function1 r3) {
                r1 = this;
                r0 = r2
                kotlin.Unit r0 = (kotlin.Unit) r0
                r1.resume2(r0, r3)
                return
        }

        /* JADX INFO: renamed from: resume, reason: avoid collision after fix types in other method */
        public void resume2(kotlin.Unit r4, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r5) {
                r3 = this;
                kotlinx.coroutines.sync.MutexImpl r0 = r3.this$0
                boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r1 == 0) goto L23
                r1 = 0
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.sync.MutexImpl.access$getOwner$volatile$FU()
                java.lang.Object r0 = r2.get(r0)
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.sync.MutexKt.access$getNO_OWNER$p()
                if (r0 != r2) goto L19
                r0 = 1
                goto L1a
            L19:
                r0 = 0
            L1a:
                if (r0 == 0) goto L1d
                goto L23
            L1d:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L23:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.MutexImpl.access$getOwner$volatile$FU()
                kotlinx.coroutines.sync.MutexImpl r1 = r3.this$0
                java.lang.Object r2 = r3.owner
                r0.set(r1, r2)
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r3.cont
                kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$resume$2 r1 = new kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$resume$2
                kotlinx.coroutines.sync.MutexImpl r2 = r3.this$0
                r1.<init>(r2, r3)
                kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                r0.resume(r4, r1)
                return
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ void resumeUndispatched(kotlinx.coroutines.CoroutineDispatcher r2, kotlin.Unit r3) {
                r1 = this;
                r0 = r3
                kotlin.Unit r0 = (kotlin.Unit) r0
                r1.resumeUndispatched2(r2, r0)
                return
        }

        /* JADX INFO: renamed from: resumeUndispatched, reason: avoid collision after fix types in other method */
        public void resumeUndispatched2(kotlinx.coroutines.CoroutineDispatcher r2, kotlin.Unit r3) {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r1.cont
                r0.resumeUndispatched(r2, r3)
                return
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void resumeUndispatchedWithException(kotlinx.coroutines.CoroutineDispatcher r2, java.lang.Throwable r3) {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r1.cont
                r0.resumeUndispatchedWithException(r2, r3)
                return
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(java.lang.Object r2) {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r1.cont
                r0.resumeWith(r2)
                return
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ java.lang.Object tryResume(kotlin.Unit r2, java.lang.Object r3) {
                r1 = this;
                r0 = r2
                kotlin.Unit r0 = (kotlin.Unit) r0
                java.lang.Object r0 = r1.tryResume2(r0, r3)
                return r0
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ java.lang.Object tryResume(kotlin.Unit r2, java.lang.Object r3, kotlin.jvm.functions.Function1 r4) {
                r1 = this;
                r0 = r2
                kotlin.Unit r0 = (kotlin.Unit) r0
                java.lang.Object r0 = r1.tryResume2(r0, r3, r4)
                return r0
        }

        /* JADX INFO: renamed from: tryResume, reason: avoid collision after fix types in other method */
        public java.lang.Object tryResume2(kotlin.Unit r2, java.lang.Object r3) {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r1.cont
                java.lang.Object r0 = r0.tryResume(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: tryResume, reason: avoid collision after fix types in other method */
        public java.lang.Object tryResume2(kotlin.Unit r7, java.lang.Object r8, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r9) {
                r6 = this;
                kotlinx.coroutines.sync.MutexImpl r0 = r6.this$0
                boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L25
                r1 = 0
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.MutexImpl.access$getOwner$volatile$FU()
                java.lang.Object r0 = r4.get(r0)
                kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.sync.MutexKt.access$getNO_OWNER$p()
                if (r0 != r4) goto L1b
                r0 = r2
                goto L1c
            L1b:
                r0 = r3
            L1c:
                if (r0 == 0) goto L1f
                goto L25
            L1f:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L25:
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r6.cont
                kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$tryResume$token$1 r1 = new kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$tryResume$token$1
                kotlinx.coroutines.sync.MutexImpl r4 = r6.this$0
                r1.<init>(r4, r6)
                kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                java.lang.Object r0 = r0.tryResume(r7, r8, r1)
                if (r0 == 0) goto L63
                kotlinx.coroutines.sync.MutexImpl r1 = r6.this$0
                boolean r4 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r4 == 0) goto L58
                r4 = 0
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.sync.MutexImpl.access$getOwner$volatile$FU()
                java.lang.Object r1 = r5.get(r1)
                kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.sync.MutexKt.access$getNO_OWNER$p()
                if (r1 != r5) goto L4e
                goto L4f
            L4e:
                r2 = r3
            L4f:
                if (r2 == 0) goto L52
                goto L58
            L52:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
            L58:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.sync.MutexImpl.access$getOwner$volatile$FU()
                kotlinx.coroutines.sync.MutexImpl r2 = r6.this$0
                java.lang.Object r3 = r6.owner
                r1.set(r2, r3)
            L63:
                return r0
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public java.lang.Object tryResumeWithException(java.lang.Throwable r2) {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> r0 = r1.cont
                java.lang.Object r0 = r0.tryResumeWithException(r2)
                return r0
        }
    }

    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0001J\u001d\u0010\u000f\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096\u0001J\u0012\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0016R\u0012\u0010\u0007\u001a\u00020\bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$SelectInstanceWithOwner;", "Q", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "select", "owner", "", "(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/selects/SelectInstanceInternal;Ljava/lang/Object;)V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "disposeOnCompletion", "", "disposableHandle", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCancellation", "segment", "Lkotlinx/coroutines/internal/Segment;", "index", "", "selectInRegistrationPhase", "internalResult", "trySelect", "", "clauseObject", "result", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class SelectInstanceWithOwner<Q> implements kotlinx.coroutines.selects.SelectInstanceInternal<Q> {
        public final java.lang.Object owner;
        public final kotlinx.coroutines.selects.SelectInstanceInternal<Q> select;
        final /* synthetic */ kotlinx.coroutines.sync.MutexImpl this$0;

        public SelectInstanceWithOwner(kotlinx.coroutines.sync.MutexImpl r1, kotlinx.coroutines.selects.SelectInstanceInternal<Q> r2, java.lang.Object r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.select = r2
                r0.owner = r3
                return
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public void disposeOnCompletion(kotlinx.coroutines.DisposableHandle r2) {
                r1 = this;
                kotlinx.coroutines.selects.SelectInstanceInternal<Q> r0 = r1.select
                r0.disposeOnCompletion(r2)
                return
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public kotlin.coroutines.CoroutineContext getContext() {
                r1 = this;
                kotlinx.coroutines.selects.SelectInstanceInternal<Q> r0 = r1.select
                kotlin.coroutines.CoroutineContext r0 = r0.getContext()
                return r0
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> r2, int r3) {
                r1 = this;
                kotlinx.coroutines.selects.SelectInstanceInternal<Q> r0 = r1.select
                r0.invokeOnCancellation(r2, r3)
                return
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public void selectInRegistrationPhase(java.lang.Object r4) {
                r3 = this;
                kotlinx.coroutines.sync.MutexImpl r0 = r3.this$0
                boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r1 == 0) goto L23
                r1 = 0
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.sync.MutexImpl.access$getOwner$volatile$FU()
                java.lang.Object r0 = r2.get(r0)
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.sync.MutexKt.access$getNO_OWNER$p()
                if (r0 != r2) goto L19
                r0 = 1
                goto L1a
            L19:
                r0 = 0
            L1a:
                if (r0 == 0) goto L1d
                goto L23
            L1d:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L23:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.MutexImpl.access$getOwner$volatile$FU()
                kotlinx.coroutines.sync.MutexImpl r1 = r3.this$0
                java.lang.Object r2 = r3.owner
                r0.set(r1, r2)
                kotlinx.coroutines.selects.SelectInstanceInternal<Q> r0 = r3.select
                r0.selectInRegistrationPhase(r4)
                return
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public boolean trySelect(java.lang.Object r7, java.lang.Object r8) {
                r6 = this;
                kotlinx.coroutines.sync.MutexImpl r0 = r6.this$0
                boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r1 == 0) goto L23
                r1 = 0
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.sync.MutexImpl.access$getOwner$volatile$FU()
                java.lang.Object r0 = r2.get(r0)
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.sync.MutexKt.access$getNO_OWNER$p()
                if (r0 != r2) goto L19
                r0 = 1
                goto L1a
            L19:
                r0 = 0
            L1a:
                if (r0 == 0) goto L1d
                goto L23
            L1d:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L23:
                kotlinx.coroutines.selects.SelectInstanceInternal<Q> r0 = r6.select
                boolean r0 = r0.trySelect(r7, r8)
                kotlinx.coroutines.sync.MutexImpl r1 = r6.this$0
                r2 = r0
                r3 = 0
                if (r2 == 0) goto L38
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.MutexImpl.access$getOwner$volatile$FU()
                java.lang.Object r5 = r6.owner
                r4.set(r1, r5)
            L38:
                return r0
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "owner$volatile"
            java.lang.Class<kotlinx.coroutines.sync.MutexImpl> r2 = kotlinx.coroutines.sync.MutexImpl.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.sync.MutexImpl.owner$volatile$FU = r0
            return
    }

    public MutexImpl(boolean r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2)
            if (r2 == 0) goto L8
            r0 = 0
            goto Lc
        L8:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.MutexKt.access$getNO_OWNER$p()
        Lc:
            r1.owner$volatile = r0
            kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1 r0 = new kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1
            r0.<init>(r1)
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            r1.onSelectCancellationUnlockConstructor = r0
            return
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater access$getOwner$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getOwner$volatile$FU()
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$lockSuspend(kotlinx.coroutines.sync.MutexImpl r1, java.lang.Object r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = r1.lockSuspend(r2, r3)
            return r0
    }

    public static /* synthetic */ void getOnLock$annotations() {
            return
    }

    private final /* synthetic */ java.lang.Object getOwner$volatile() {
            r1 = this;
            java.lang.Object r0 = r1.owner$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getOwner$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.MutexImpl.owner$volatile$FU
            return r0
    }

    private final int holdsLockImpl(java.lang.Object r3) {
            r2 = this;
        L1:
            boolean r0 = r2.isLocked()
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getOwner$volatile$FU()
            java.lang.Object r0 = r0.get(r2)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.sync.MutexKt.access$getNO_OWNER$p()
            if (r0 == r1) goto L1
            if (r0 != r3) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 2
        L1d:
            return r1
    }

    static /* synthetic */ java.lang.Object lock$suspendImpl(kotlinx.coroutines.sync.MutexImpl r2, java.lang.Object r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            boolean r0 = r2.tryLock(r3)
            if (r0 == 0) goto L9
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L9:
            java.lang.Object r0 = r2.lockSuspend(r3, r4)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L14
            return r0
        L14:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private final java.lang.Object lockSuspend(java.lang.Object r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            r8 = this;
            r0 = 0
            r1 = r10
            r2 = 0
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            kotlinx.coroutines.CancellableContinuationImpl r3 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r3)
            r4 = r3
            r5 = 0
            kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner r6 = new kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner     // Catch: java.lang.Throwable -> L33
            r6.<init>(r8, r4, r9)     // Catch: java.lang.Throwable -> L33
            r7 = r6
            kotlinx.coroutines.CancellableContinuation r7 = (kotlinx.coroutines.CancellableContinuation) r7     // Catch: java.lang.Throwable -> L33
            r8.acquire(r7)     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L28
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r10)
        L28:
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L2f
            return r1
        L2f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L33:
            r4 = move-exception
            r3.releaseClaimedReusableContinuation$kotlinx_coroutines_core()
            throw r4
    }

    private final /* synthetic */ void setOwner$volatile(java.lang.Object r1) {
            r0 = this;
            r0.owner$volatile = r1
            return
    }

    private final int tryLockImpl(java.lang.Object r6) {
            r5 = this;
        L1:
            boolean r0 = r5.tryAcquire()
            r1 = 1
            if (r0 == 0) goto L32
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r2 = 0
            if (r0 == 0) goto L2a
            r0 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = getOwner$volatile$FU()
            java.lang.Object r3 = r3.get(r5)
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.sync.MutexKt.access$getNO_OWNER$p()
            if (r3 != r4) goto L20
            goto L21
        L20:
            r1 = r2
        L21:
            if (r1 == 0) goto L24
            goto L2a
        L24:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L2a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getOwner$volatile$FU()
            r0.set(r5, r6)
            return r2
        L32:
            if (r6 != 0) goto L35
            return r1
        L35:
            int r0 = r5.holdsLockImpl(r6)
            switch(r0) {
                case 0: goto L40;
                case 1: goto L3e;
                case 2: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L40
        L3d:
            return r1
        L3e:
            r0 = 2
            return r0
        L40:
            goto L1
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public kotlinx.coroutines.selects.SelectClause2<java.lang.Object, kotlinx.coroutines.sync.Mutex> getOnLock() {
            r5 = this;
            kotlinx.coroutines.selects.SelectClause2Impl r0 = new kotlinx.coroutines.selects.SelectClause2Impl
            kotlinx.coroutines.sync.MutexImpl$onLock$1 r1 = kotlinx.coroutines.sync.MutexImpl$onLock$1.INSTANCE
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            r2 = 3
            java.lang.Object r1 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, r2)
            kotlin.jvm.functions.Function3 r1 = (kotlin.jvm.functions.Function3) r1
            kotlinx.coroutines.sync.MutexImpl$onLock$2 r3 = kotlinx.coroutines.sync.MutexImpl$onLock$2.INSTANCE
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            java.lang.Object r2 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, r2)
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
            kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>> r3 = r5.onSelectCancellationUnlockConstructor
            r0.<init>(r5, r1, r2, r3)
            kotlinx.coroutines.selects.SelectClause2 r0 = (kotlinx.coroutines.selects.SelectClause2) r0
            return r0
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.holdsLockImpl(r3)
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
            r1 = this;
            int r0 = r1.getAvailablePermits()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public java.lang.Object lock(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            java.lang.Object r0 = lock$suspendImpl(r1, r2, r3)
            return r0
    }

    protected java.lang.Object onLockProcessResult(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.MutexKt.access$getON_LOCK_ALREADY_LOCKED_BY_OWNER$p()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r0)
            if (r0 != 0) goto Lb
            return r3
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "This mutex is already locked by the specified owner: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    protected void onLockRegFunction(kotlinx.coroutines.selects.SelectInstance<?> r3, java.lang.Object r4) {
            r2 = this;
            if (r4 == 0) goto L10
            boolean r0 = r2.holdsLock(r4)
            if (r0 == 0) goto L10
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.MutexKt.access$getON_LOCK_ALREADY_LOCKED_BY_OWNER$p()
            r3.selectInRegistrationPhase(r0)
            goto L22
        L10:
            kotlinx.coroutines.sync.MutexImpl$SelectInstanceWithOwner r0 = new kotlinx.coroutines.sync.MutexImpl$SelectInstanceWithOwner
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r1)
            r1 = r3
            kotlinx.coroutines.selects.SelectInstanceInternal r1 = (kotlinx.coroutines.selects.SelectInstanceInternal) r1
            r0.<init>(r2, r1, r4)
            kotlinx.coroutines.selects.SelectInstance r0 = (kotlinx.coroutines.selects.SelectInstance) r0
            r2.onAcquireRegFunction(r0, r4)
        L22:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Mutex@"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "[isLocked="
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r2.isLocked()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ",owner="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = getOwner$volatile$FU()
            java.lang.Object r1 = r1.get(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.tryLockImpl(r4)
            switch(r0) {
                case 0: goto L33;
                case 1: goto L31;
                case 2: goto L14;
                default: goto L8;
            }
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "This mutex is already locked by the specified owner: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L31:
            r0 = 0
            goto L34
        L33:
            r0 = 1
        L34:
            return r0
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(java.lang.Object r5) {
            r4 = this;
        L1:
            boolean r0 = r4.isLocked()
            if (r0 == 0) goto L60
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getOwner$volatile$FU()
            java.lang.Object r0 = r0.get(r4)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.sync.MutexKt.access$getNO_OWNER$p()
            if (r0 == r1) goto L1
            if (r0 == r5) goto L1d
            if (r5 != 0) goto L1b
            goto L1d
        L1b:
            r1 = 0
            goto L1e
        L1d:
            r1 = 1
        L1e:
            if (r1 == 0) goto L32
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = getOwner$volatile$FU()
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.sync.MutexKt.access$getNO_OWNER$p()
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r4, r0, r2)
            if (r1 == 0) goto L1
            r4.release()
            return
        L32:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "This mutex is locked by "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = ", but "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = " is expected"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L60:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This mutex is not locked"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
