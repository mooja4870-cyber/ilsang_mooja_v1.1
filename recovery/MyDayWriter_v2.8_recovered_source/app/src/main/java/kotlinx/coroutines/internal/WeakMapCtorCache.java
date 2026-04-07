package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ExceptionsConstructor.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\tj\u0002`\n2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0005\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\tj\u0002`\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/internal/WeakMapCtorCache;", "Lkotlinx/coroutines/internal/CtorCache;", "()V", "cacheLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "exceptionCtors", "Ljava/util/WeakHashMap;", "Ljava/lang/Class;", "", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "get", "key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class WeakMapCtorCache extends kotlinx.coroutines.internal.CtorCache {
    public static final kotlinx.coroutines.internal.WeakMapCtorCache INSTANCE = null;
    private static final java.util.concurrent.locks.ReentrantReadWriteLock cacheLock = null;
    private static final java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> exceptionCtors = null;

    static {
            kotlinx.coroutines.internal.WeakMapCtorCache r0 = new kotlinx.coroutines.internal.WeakMapCtorCache
            r0.<init>()
            kotlinx.coroutines.internal.WeakMapCtorCache.INSTANCE = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            kotlinx.coroutines.internal.WeakMapCtorCache.cacheLock = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            kotlinx.coroutines.internal.WeakMapCtorCache.exceptionCtors = r0
            return
    }

    private WeakMapCtorCache() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.internal.CtorCache
    public kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> get(java.lang.Class<? extends java.lang.Throwable> r10) {
            r9 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = kotlinx.coroutines.internal.WeakMapCtorCache.cacheLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            r1 = 0
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> r2 = kotlinx.coroutines.internal.WeakMapCtorCache.exceptionCtors     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r2 = r2.get(r10)     // Catch: java.lang.Throwable -> L7f
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L1a
            r3 = 0
            r0.unlock()
            return r2
        L1a:
            r0.unlock()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = kotlinx.coroutines.internal.WeakMapCtorCache.cacheLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L2f
            int r2 = r0.getReadHoldCount()
            goto L30
        L2f:
            r2 = r3
        L30:
            r4 = r3
        L31:
            if (r4 >= r2) goto L39
            r1.unlock()
            int r4 = r4 + 1
            goto L31
        L39:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            r4 = 0
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> r5 = kotlinx.coroutines.internal.WeakMapCtorCache.exceptionCtors     // Catch: java.lang.Throwable -> L72
            java.lang.Object r5 = r5.get(r10)     // Catch: java.lang.Throwable -> L72
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L59
            r6 = 0
        L4d:
            if (r3 >= r2) goto L55
            r1.lock()
            int r3 = r3 + 1
            goto L4d
        L55:
            r0.unlock()
            return r5
        L59:
            kotlin.jvm.functions.Function1 r5 = kotlinx.coroutines.internal.ExceptionsConstructorKt.access$createConstructor(r10)     // Catch: java.lang.Throwable -> L72
            r6 = r5
            r7 = 0
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> r8 = kotlinx.coroutines.internal.WeakMapCtorCache.exceptionCtors     // Catch: java.lang.Throwable -> L72
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> L72
            r8.put(r10, r6)     // Catch: java.lang.Throwable -> L72
        L66:
            if (r3 >= r2) goto L6e
            r1.lock()
            int r3 = r3 + 1
            goto L66
        L6e:
            r0.unlock()
            return r5
        L72:
            r4 = move-exception
        L73:
            if (r3 >= r2) goto L7b
            r1.lock()
            int r3 = r3 + 1
            goto L73
        L7b:
            r0.unlock()
            throw r4
        L7f:
            r1 = move-exception
            r0.unlock()
            throw r1
    }
}
