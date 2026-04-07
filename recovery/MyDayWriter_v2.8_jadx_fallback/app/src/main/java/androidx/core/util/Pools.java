package androidx.core.util;

/* JADX INFO: compiled from: Pools.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/core/util/Pools;", "", "<init>", "()V", "Pool", "SimplePool", "SynchronizedPool", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Pools {

    /* JADX INFO: compiled from: Pools.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002J\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/core/util/Pools$Pool;", "T", "", "acquire", "()Ljava/lang/Object;", "release", "", "instance", "(Ljava/lang/Object;)Z", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Pool<T> {
        T acquire();

        boolean release(T r1);
    }

    /* JADX INFO: compiled from: Pools.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0011\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0011R\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/core/util/Pools$SimplePool;", "T", "", "Landroidx/core/util/Pools$Pool;", "maxPoolSize", "", "<init>", "(I)V", "pool", "", "[Ljava/lang/Object;", "poolSize", "acquire", "()Ljava/lang/Object;", "release", "", "instance", "(Ljava/lang/Object;)Z", "isInPool", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class SimplePool<T> implements androidx.core.util.Pools.Pool<T> {
        private final java.lang.Object[] pool;
        private int poolSize;

        public SimplePool(int r3) {
                r2 = this;
                r2.<init>()
                if (r3 <= 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                if (r0 == 0) goto L11
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r2.pool = r0
                return
            L11:
                r0 = 0
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "The max pool size must be > 0"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        private final boolean isInPool(T r4) {
                r3 = this;
                r0 = 0
                int r1 = r3.poolSize
            L3:
                if (r0 >= r1) goto L10
                java.lang.Object[] r2 = r3.pool
                r2 = r2[r0]
                if (r2 != r4) goto Ld
                r1 = 1
                return r1
            Ld:
                int r0 = r0 + 1
                goto L3
            L10:
                r0 = 0
                return r0
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
                r4 = this;
                int r0 = r4.poolSize
                r1 = 0
                if (r0 <= 0) goto L1d
                int r0 = r4.poolSize
                int r0 = r0 + (-1)
                java.lang.Object[] r2 = r4.pool
                r2 = r2[r0]
                java.lang.String r3 = "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
                java.lang.Object[] r3 = r4.pool
                r3[r0] = r1
                int r1 = r4.poolSize
                int r1 = r1 + (-1)
                r4.poolSize = r1
                return r2
            L1d:
                return r1
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(T r3) {
                r2 = this;
                java.lang.String r0 = "instance"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                boolean r0 = r2.isInPool(r3)
                if (r0 != 0) goto L21
                int r0 = r2.poolSize
                java.lang.Object[] r1 = r2.pool
                int r1 = r1.length
                if (r0 >= r1) goto L1f
                java.lang.Object[] r0 = r2.pool
                int r1 = r2.poolSize
                r0[r1] = r3
                int r0 = r2.poolSize
                r1 = 1
                int r0 = r0 + r1
                r2.poolSize = r0
                return r1
            L1f:
                r0 = 0
                return r0
            L21:
                r0 = 0
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Already in the pool!"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    /* JADX INFO: compiled from: Pools.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eR\u000e\u0010\b\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/core/util/Pools$SynchronizedPool;", "T", "", "Landroidx/core/util/Pools$SimplePool;", "maxPoolSize", "", "<init>", "(I)V", "lock", "acquire", "()Ljava/lang/Object;", "release", "", "instance", "(Ljava/lang/Object;)Z", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class SynchronizedPool<T> extends androidx.core.util.Pools.SimplePool<T> {
        private final java.lang.Object lock;

        public SynchronizedPool(int r2) {
                r1 = this;
                r1.<init>(r2)
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.lock = r0
                return
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public T acquire() {
                r3 = this;
                java.lang.Object r0 = r3.lock
                monitor-enter(r0)
                r1 = 0
                java.lang.Object r2 = super.acquire()     // Catch: java.lang.Throwable -> La
                monitor-exit(r0)
                return r2
            La:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(T r4) {
                r3 = this;
                java.lang.String r0 = "instance"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.Object r0 = r3.lock
                monitor-enter(r0)
                r1 = 0
                boolean r2 = super.release(r4)     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r0)
                return r2
            Lf:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }
    }

    private Pools() {
            r0 = this;
            r0.<init>()
            return
    }
}
