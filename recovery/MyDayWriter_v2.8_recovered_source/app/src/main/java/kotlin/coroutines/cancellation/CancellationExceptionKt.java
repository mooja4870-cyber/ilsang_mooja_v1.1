package kotlin.coroutines.cancellation;

/* JADX INFO: compiled from: CancellationException.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0087\b\u001a\u0017\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0087\b*\u001a\b\u0007\u0010\u0000\"\u00020\u00012\u00020\u0001B\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t¨\u0006\n"}, d2 = {"CancellationException", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "message", "", "cause", "", "Lkotlin/SinceKotlin;", "version", "1.4", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CancellationExceptionKt {
    private static final java.util.concurrent.CancellationException CancellationException(java.lang.String r3, java.lang.Throwable r4) {
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r3)
            r1 = r0
            r2 = 0
            r1.initCause(r4)
            return r0
    }

    private static final java.util.concurrent.CancellationException CancellationException(java.lang.Throwable r3) {
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            if (r3 == 0) goto L9
            java.lang.String r1 = r3.toString()
            goto La
        L9:
            r1 = 0
        La:
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.initCause(r3)
            return r0
    }

    public static /* synthetic */ void CancellationException$annotations() {
            return
    }
}
