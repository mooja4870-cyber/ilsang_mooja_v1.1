package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a%\u0010\u0000\u001a\u00020\u00012\u001a\b\u0004\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\u0086\b\u001a\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0000¨\u0006\r"}, d2 = {"CoroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handler", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext;", "", "", "handleCoroutineException", "context", "exception", "handlerException", "originalException", "thrownException", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CoroutineExceptionHandlerKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1, reason: invalid class name */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @kotlin.Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass1 extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.CoroutineExceptionHandler {
        final /* synthetic */ kotlin.jvm.functions.Function2<kotlin.coroutines.CoroutineContext, java.lang.Throwable, kotlin.Unit> $handler;

        public AnonymousClass1(kotlin.jvm.functions.Function2<? super kotlin.coroutines.CoroutineContext, ? super java.lang.Throwable, kotlin.Unit> r2, kotlinx.coroutines.CoroutineExceptionHandler.Key r3) {
                r1 = this;
                r1.$handler = r2
                r0 = r3
                kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
                r1.<init>(r0)
                return
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(kotlin.coroutines.CoroutineContext r2, java.lang.Throwable r3) {
                r1 = this;
                kotlin.jvm.functions.Function2<kotlin.coroutines.CoroutineContext, java.lang.Throwable, kotlin.Unit> r0 = r1.$handler
                r0.invoke(r2, r3)
                return
        }
    }

    public static final kotlinx.coroutines.CoroutineExceptionHandler CoroutineExceptionHandler(kotlin.jvm.functions.Function2<? super kotlin.coroutines.CoroutineContext, ? super java.lang.Throwable, kotlin.Unit> r3) {
            r0 = 0
            kotlinx.coroutines.CoroutineExceptionHandler$Key r1 = kotlinx.coroutines.CoroutineExceptionHandler.Key
            kotlinx.coroutines.CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1 r2 = new kotlinx.coroutines.CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1
            r2.<init>(r3, r1)
            kotlinx.coroutines.CoroutineExceptionHandler r2 = (kotlinx.coroutines.CoroutineExceptionHandler) r2
            return r2
    }

    public static final void handleCoroutineException(kotlin.coroutines.CoroutineContext r2, java.lang.Throwable r3) {
            kotlinx.coroutines.CoroutineExceptionHandler$Key r0 = kotlinx.coroutines.CoroutineExceptionHandler.Key     // Catch: java.lang.Throwable -> L17
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0     // Catch: java.lang.Throwable -> L17
            kotlin.coroutines.CoroutineContext$Element r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L17
            kotlinx.coroutines.CoroutineExceptionHandler r0 = (kotlinx.coroutines.CoroutineExceptionHandler) r0     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L12
            r1 = 0
            r0.handleException(r2, r3)     // Catch: java.lang.Throwable -> L17
            return
        L12:
            kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(r2, r3)
            return
        L17:
            r0 = move-exception
            java.lang.Throwable r1 = handlerException(r3, r0)
            kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(r2, r1)
            return
    }

    public static final java.lang.Throwable handlerException(java.lang.Throwable r4, java.lang.Throwable r5) {
            if (r4 != r5) goto L3
            return r4
        L3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Exception while trying to handle coroutine exception"
            r0.<init>(r1, r5)
            r1 = r0
            r2 = 0
            r3 = r1
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            kotlin.ExceptionsKt.addSuppressed(r3, r4)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
    }
}
