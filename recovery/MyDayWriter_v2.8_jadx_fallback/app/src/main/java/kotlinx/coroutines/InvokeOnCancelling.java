package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\t\u0010\u0005\u001a\u00020\u0006X\u0082\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/InvokeOnCancelling;", "Lkotlinx/coroutines/JobCancellingNode;", "handler", "Lkotlinx/coroutines/InternalCompletionHandler;", "(Lkotlinx/coroutines/InternalCompletionHandler;)V", "_invoked", "Lkotlinx/atomicfu/AtomicInt;", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class InvokeOnCancelling extends kotlinx.coroutines.JobCancellingNode {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _invoked$volatile$FU = null;
    private volatile /* synthetic */ int _invoked$volatile;
    private final kotlinx.coroutines.InternalCompletionHandler handler;

    static {
            java.lang.Class<kotlinx.coroutines.InvokeOnCancelling> r0 = kotlinx.coroutines.InvokeOnCancelling.class
            java.lang.String r1 = "_invoked$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.InvokeOnCancelling._invoked$volatile$FU = r0
            return
    }

    public InvokeOnCancelling(kotlinx.coroutines.InternalCompletionHandler r1) {
            r0 = this;
            r0.<init>()
            r0.handler = r1
            return
    }

    private final /* synthetic */ int get_invoked$volatile() {
            r1 = this;
            int r0 = r1._invoked$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater get_invoked$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.InvokeOnCancelling._invoked$volatile$FU
            return r0
    }

    private final /* synthetic */ void set_invoked$volatile(int r1) {
            r0 = this;
            r0._invoked$volatile = r1
            return
    }

    @Override // kotlinx.coroutines.InternalCompletionHandler
    public void invoke(java.lang.Throwable r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_invoked$volatile$FU()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L11
            kotlinx.coroutines.InternalCompletionHandler r0 = r3.handler
            r0.invoke(r4)
        L11:
            return
    }
}
