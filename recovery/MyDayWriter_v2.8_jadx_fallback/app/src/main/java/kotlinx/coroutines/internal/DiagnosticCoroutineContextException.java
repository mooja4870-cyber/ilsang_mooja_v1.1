package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/internal/DiagnosticCoroutineContextException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "fillInStackTrace", "", "getLocalizedMessage", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DiagnosticCoroutineContextException extends java.lang.RuntimeException {
    private final transient kotlin.coroutines.CoroutineContext context;

    public DiagnosticCoroutineContextException(kotlin.coroutines.CoroutineContext r1) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            return
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
            r2 = this;
            r0 = 0
            r1 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r1]
            r2.setStackTrace(r0)
            r0 = r2
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String getLocalizedMessage() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.context
            java.lang.String r0 = r0.toString()
            return r0
    }
}
