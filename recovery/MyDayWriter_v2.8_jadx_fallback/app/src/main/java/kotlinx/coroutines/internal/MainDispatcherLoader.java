package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/internal/MainDispatcherLoader;", "", "()V", "FAST_SERVICE_LOADER_ENABLED", "", "dispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "loadMainDispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MainDispatcherLoader {
    private static final boolean FAST_SERVICE_LOADER_ENABLED = false;
    public static final kotlinx.coroutines.internal.MainDispatcherLoader INSTANCE = null;
    public static final kotlinx.coroutines.MainCoroutineDispatcher dispatcher = null;

    static {
            kotlinx.coroutines.internal.MainDispatcherLoader r0 = new kotlinx.coroutines.internal.MainDispatcherLoader
            r0.<init>()
            kotlinx.coroutines.internal.MainDispatcherLoader.INSTANCE = r0
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            r1 = 1
            boolean r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r0, r1)
            kotlinx.coroutines.internal.MainDispatcherLoader.FAST_SERVICE_LOADER_ENABLED = r0
            kotlinx.coroutines.internal.MainDispatcherLoader r0 = kotlinx.coroutines.internal.MainDispatcherLoader.INSTANCE
            kotlinx.coroutines.MainCoroutineDispatcher r0 = r0.loadMainDispatcher()
            kotlinx.coroutines.internal.MainDispatcherLoader.dispatcher = r0
            return
    }

    private MainDispatcherLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    private final kotlinx.coroutines.MainCoroutineDispatcher loadMainDispatcher() {
            r11 = this;
            r0 = 0
            boolean r1 = kotlinx.coroutines.internal.MainDispatcherLoader.FAST_SERVICE_LOADER_ENABLED     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto Ld
            kotlinx.coroutines.internal.FastServiceLoader r1 = kotlinx.coroutines.internal.FastServiceLoader.INSTANCE     // Catch: java.lang.Throwable -> L75
            java.util.List r1 = r1.loadMainDispatcherFactory$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L75
            goto L25
        Ld:
            java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r1 = kotlinx.coroutines.internal.MainDispatcherFactory.class
            java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r2 = kotlinx.coroutines.internal.MainDispatcherFactory.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L75
            java.util.ServiceLoader r1 = java.util.ServiceLoader.load(r1, r2)     // Catch: java.lang.Throwable -> L75
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L75
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.asSequence(r1)     // Catch: java.lang.Throwable -> L75
            java.util.List r1 = kotlin.sequences.SequencesKt.toList(r1)     // Catch: java.lang.Throwable -> L75
        L25:
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L75
            r3 = 0
            java.util.Iterator r4 = r2.iterator()     // Catch: java.lang.Throwable -> L75
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L75
            if (r5 != 0) goto L36
            r5 = r0
            goto L63
        L36:
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L75
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L75
            if (r6 != 0) goto L41
            goto L63
        L41:
            r6 = r5
            kotlinx.coroutines.internal.MainDispatcherFactory r6 = (kotlinx.coroutines.internal.MainDispatcherFactory) r6     // Catch: java.lang.Throwable -> L75
            r7 = 0
            int r8 = r6.getLoadPriority()     // Catch: java.lang.Throwable -> L75
        L4a:
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L75
            r7 = r6
            kotlinx.coroutines.internal.MainDispatcherFactory r7 = (kotlinx.coroutines.internal.MainDispatcherFactory) r7     // Catch: java.lang.Throwable -> L75
            r9 = 0
            int r10 = r7.getLoadPriority()     // Catch: java.lang.Throwable -> L75
            if (r8 >= r10) goto L5c
            r5 = r6
            r7 = r10
            r8 = r7
        L5c:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L75
            if (r6 != 0) goto L4a
        L63:
            kotlinx.coroutines.internal.MainDispatcherFactory r5 = (kotlinx.coroutines.internal.MainDispatcherFactory) r5     // Catch: java.lang.Throwable -> L75
            if (r5 == 0) goto L6d
            kotlinx.coroutines.MainCoroutineDispatcher r2 = kotlinx.coroutines.internal.MainDispatchersKt.tryCreateDispatcher(r5, r1)     // Catch: java.lang.Throwable -> L75
            if (r2 != 0) goto L74
        L6d:
            r2 = 3
            kotlinx.coroutines.internal.MissingMainCoroutineDispatcher r2 = kotlinx.coroutines.internal.MainDispatchersKt.createMissingDispatcher$default(r0, r0, r2, r0)     // Catch: java.lang.Throwable -> L75
            kotlinx.coroutines.MainCoroutineDispatcher r2 = (kotlinx.coroutines.MainCoroutineDispatcher) r2     // Catch: java.lang.Throwable -> L75
        L74:
            goto L7e
        L75:
            r1 = move-exception
            r2 = 2
            kotlinx.coroutines.internal.MissingMainCoroutineDispatcher r0 = kotlinx.coroutines.internal.MainDispatchersKt.createMissingDispatcher$default(r1, r0, r2, r0)
            r2 = r0
            kotlinx.coroutines.MainCoroutineDispatcher r2 = (kotlinx.coroutines.MainCoroutineDispatcher) r2
        L7e:
            return r2
    }
}
