package kotlin.concurrent;

/* JADX INFO: compiled from: Locks.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0005\u001a6\u0010\u0006\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\b\u001a6\u0010\t\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"read", "T", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "action", "Lkotlin/Function0;", "(Ljava/util/concurrent/locks/ReentrantReadWriteLock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withLock", "Ljava/util/concurrent/locks/Lock;", "(Ljava/util/concurrent/locks/Lock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "write", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LocksKt {
    private static final <T> T read(java.util.concurrent.locks.ReentrantReadWriteLock r2, kotlin.jvm.functions.Function0<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r2.readLock()
            r0.lock()
            java.lang.Object r1 = r3.invoke()     // Catch: java.lang.Throwable -> L1b
            r0.unlock()
            return r1
        L1b:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    private static final <T> T withLock(java.util.concurrent.locks.Lock r1, kotlin.jvm.functions.Function0<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.lock()
            java.lang.Object r0 = r2.invoke()     // Catch: java.lang.Throwable -> L17
            r1.unlock()
            return r0
        L17:
            r0 = move-exception
            r1.unlock()
            throw r0
    }

    private static final <T> T write(java.util.concurrent.locks.ReentrantReadWriteLock r7, kotlin.jvm.functions.Function0<? extends T> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r7.readLock()
            int r1 = r7.getWriteHoldCount()
            r2 = 0
            if (r1 != 0) goto L1b
            int r1 = r7.getReadHoldCount()
            goto L1c
        L1b:
            r1 = r2
        L1c:
            r3 = r2
        L1d:
            if (r3 >= r1) goto L27
            r4 = r3
            r5 = 0
            r0.unlock()
            int r3 = r3 + 1
            goto L1d
        L27:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r7.writeLock()
            r3.lock()
            java.lang.Object r4 = r8.invoke()     // Catch: java.lang.Throwable -> L42
        L34:
            if (r2 >= r1) goto L3e
            r5 = r2
            r6 = 0
            r0.lock()
            int r2 = r2 + 1
            goto L34
        L3e:
            r3.unlock()
            return r4
        L42:
            r4 = move-exception
        L43:
            if (r2 >= r1) goto L4d
            r5 = r2
            r6 = 0
            r0.lock()
            int r2 = r2 + 1
            goto L43
        L4d:
            r3.unlock()
            throw r4
    }
}
