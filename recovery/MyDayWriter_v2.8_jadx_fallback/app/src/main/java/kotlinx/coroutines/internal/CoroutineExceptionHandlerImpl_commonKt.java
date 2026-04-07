package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"handleUncaughtCoroutineException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CoroutineExceptionHandlerImpl_commonKt {
    public static final void handleUncaughtCoroutineException(kotlin.coroutines.CoroutineContext r4, java.lang.Throwable r5) {
            java.util.Collection r0 = kotlinx.coroutines.internal.CoroutineExceptionHandlerImplKt.getPlatformExceptionHandlers()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            kotlinx.coroutines.CoroutineExceptionHandler r1 = (kotlinx.coroutines.CoroutineExceptionHandler) r1
            r1.handleException(r4, r5)     // Catch: java.lang.Throwable -> L19 kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed -> L22
            goto L8
        L19:
            r2 = move-exception
            java.lang.Throwable r3 = kotlinx.coroutines.CoroutineExceptionHandlerKt.handlerException(r5, r2)
            kotlinx.coroutines.internal.CoroutineExceptionHandlerImplKt.propagateExceptionFinalResort(r3)
            goto L8
        L22:
            r0 = move-exception
            return
        L24:
            kotlinx.coroutines.internal.DiagnosticCoroutineContextException r0 = new kotlinx.coroutines.internal.DiagnosticCoroutineContextException     // Catch: java.lang.Throwable -> L30
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L30
            kotlin.ExceptionsKt.addSuppressed(r5, r0)     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
            r0 = move-exception
        L31:
            kotlinx.coroutines.internal.CoroutineExceptionHandlerImplKt.propagateExceptionFinalResort(r5)
            return
    }
}
