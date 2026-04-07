package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"platformExceptionHandlers", "", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getPlatformExceptionHandlers", "()Ljava/util/Collection;", "ensurePlatformExceptionHandlerLoaded", "", "callback", "propagateExceptionFinalResort", "exception", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CoroutineExceptionHandlerImplKt {
    private static final java.util.Collection<kotlinx.coroutines.CoroutineExceptionHandler> platformExceptionHandlers = null;

    static {
            java.lang.Class<kotlinx.coroutines.CoroutineExceptionHandler> r0 = kotlinx.coroutines.CoroutineExceptionHandler.class
            java.lang.Class<kotlinx.coroutines.CoroutineExceptionHandler> r1 = kotlinx.coroutines.CoroutineExceptionHandler.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.asSequence(r0)
            java.util.List r0 = kotlin.sequences.SequencesKt.toList(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            kotlinx.coroutines.internal.CoroutineExceptionHandlerImplKt.platformExceptionHandlers = r0
            return
    }

    public static final void ensurePlatformExceptionHandlerLoaded(kotlinx.coroutines.CoroutineExceptionHandler r2) {
            java.util.Collection<kotlinx.coroutines.CoroutineExceptionHandler> r0 = kotlinx.coroutines.internal.CoroutineExceptionHandlerImplKt.platformExceptionHandlers
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L9
            return
        L9:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Exception handler was not found via a ServiceLoader"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final java.util.Collection<kotlinx.coroutines.CoroutineExceptionHandler> getPlatformExceptionHandlers() {
            java.util.Collection<kotlinx.coroutines.CoroutineExceptionHandler> r0 = kotlinx.coroutines.internal.CoroutineExceptionHandlerImplKt.platformExceptionHandlers
            return r0
    }

    public static final void propagateExceptionFinalResort(java.lang.Throwable r2) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r1 = r0.getUncaughtExceptionHandler()
            r1.uncaughtException(r0, r2)
            return
    }
}
