package kotlinx.coroutines;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\u0000H\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016R\u0010\u0010\b\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/CopyableThrowable;", "message", "", "cause", "", "job", "Lkotlinx/coroutines/Job;", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/Job;)V", "createCopy", "equals", "", "other", "", "fillInStackTrace", "hashCode", "", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JobCancellationException extends java.util.concurrent.CancellationException implements kotlinx.coroutines.CopyableThrowable<kotlinx.coroutines.JobCancellationException> {
    public final transient kotlinx.coroutines.Job job;

    public JobCancellationException(java.lang.String r1, java.lang.Throwable r2, kotlinx.coroutines.Job r3) {
            r0 = this;
            r0.<init>(r1)
            r0.job = r3
            if (r2 == 0) goto Lb
            r0.initCause(r2)
        Lb:
            return
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    public /* bridge */ /* synthetic */ java.lang.Throwable createCopy() {
            r1 = this;
            kotlinx.coroutines.JobCancellationException r0 = r1.createCopy()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    public kotlinx.coroutines.JobCancellationException createCopy() {
            r4 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getDEBUG()
            if (r0 == 0) goto L18
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r1 = r4.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r2 = r4
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            kotlinx.coroutines.Job r3 = r4.job
            r0.<init>(r1, r2, r3)
            return r0
        L18:
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == r2) goto L38
            boolean r0 = r3 instanceof kotlinx.coroutines.JobCancellationException
            if (r0 == 0) goto L36
            r0 = r3
            kotlinx.coroutines.JobCancellationException r0 = (kotlinx.coroutines.JobCancellationException) r0
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = r2.getMessage()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L36
            r0 = r3
            kotlinx.coroutines.JobCancellationException r0 = (kotlinx.coroutines.JobCancellationException) r0
            kotlinx.coroutines.Job r0 = r0.job
            kotlinx.coroutines.Job r1 = r2.job
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L36
            r0 = r3
            kotlinx.coroutines.JobCancellationException r0 = (kotlinx.coroutines.JobCancellationException) r0
            java.lang.Throwable r0 = r0.getCause()
            java.lang.Throwable r1 = r2.getCause()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L36
            goto L38
        L36:
            r0 = 0
            goto L39
        L38:
            r0 = 1
        L39:
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
            r2 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getDEBUG()
            if (r0 == 0) goto Lb
            java.lang.Throwable r0 = super.fillInStackTrace()
            return r0
        Lb:
            r0 = 0
            r1 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r1]
            r2.setStackTrace(r0)
            r0 = r2
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            kotlinx.coroutines.Job r1 = r2.job
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Throwable r1 = r2.getCause()
            if (r1 == 0) goto L21
            int r1 = r1.hashCode()
            goto L22
        L21:
            r1 = 0
        L22:
            int r0 = r0 + r1
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "; job="
            java.lang.StringBuilder r0 = r0.append(r1)
            kotlinx.coroutines.Job r1 = r2.job
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
