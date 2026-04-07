package androidx.core.os;

import java.lang.Throwable;

/* JADX INFO: compiled from: OutcomeReceiver.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00042\u00020\u0005B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/core/os/ContinuationOutcomeReceiver;", "R", "E", "", "Landroid/os/OutcomeReceiver;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "continuation", "Lkotlin/coroutines/Continuation;", "<init>", "(Lkotlin/coroutines/Continuation;)V", "onResult", "", "result", "(Ljava/lang/Object;)V", "onError", "error", "(Ljava/lang/Throwable;)V", "toString", "", "core-ktx_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ContinuationOutcomeReceiver<R, E extends java.lang.Throwable> extends java.util.concurrent.atomic.AtomicBoolean implements android.os.OutcomeReceiver<R, E> {
    private final kotlin.coroutines.Continuation<R> continuation;

    public ContinuationOutcomeReceiver(kotlin.coroutines.Continuation<? super R> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.continuation = r2
            return
    }

    @Override // android.os.OutcomeReceiver
    public void onError(E r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L17
            kotlin.coroutines.Continuation<R> r0 = r2.continuation
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)
            r0.resumeWith(r1)
        L17:
            return
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(R r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L13
            kotlin.coroutines.Continuation<R> r0 = r2.continuation
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r3)
            r0.resumeWith(r1)
        L13:
            return
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ContinuationOutcomeReceiver(outcomeReceived = "
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r2.get()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
