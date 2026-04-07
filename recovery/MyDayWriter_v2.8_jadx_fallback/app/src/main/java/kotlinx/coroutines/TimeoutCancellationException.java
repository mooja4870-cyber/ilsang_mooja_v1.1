package kotlinx.coroutines;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u000f\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0000H\u0016R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/CopyableThrowable;", "message", "", "(Ljava/lang/String;)V", "coroutine", "Lkotlinx/coroutines/Job;", "(Ljava/lang/String;Lkotlinx/coroutines/Job;)V", "createCopy", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TimeoutCancellationException extends java.util.concurrent.CancellationException implements kotlinx.coroutines.CopyableThrowable<kotlinx.coroutines.TimeoutCancellationException> {
    public final transient kotlinx.coroutines.Job coroutine;

    public TimeoutCancellationException(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TimeoutCancellationException(java.lang.String r1, kotlinx.coroutines.Job r2) {
            r0 = this;
            r0.<init>(r1)
            r0.coroutine = r2
            return
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    public /* bridge */ /* synthetic */ java.lang.Throwable createCopy() {
            r1 = this;
            kotlinx.coroutines.TimeoutCancellationException r0 = r1.createCopy()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    public kotlinx.coroutines.TimeoutCancellationException createCopy() {
            r4 = this;
            kotlinx.coroutines.TimeoutCancellationException r0 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r1 = r4.getMessage()
            if (r1 != 0) goto La
            java.lang.String r1 = ""
        La:
            kotlinx.coroutines.Job r2 = r4.coroutine
            r0.<init>(r1, r2)
            r1 = r0
            r2 = 0
            r3 = r4
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r1.initCause(r3)
            return r0
    }
}
