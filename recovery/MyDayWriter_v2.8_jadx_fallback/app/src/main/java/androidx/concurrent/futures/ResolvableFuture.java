package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class ResolvableFuture<V> extends androidx.concurrent.futures.AbstractResolvableFuture<V> {
    private ResolvableFuture() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <V> androidx.concurrent.futures.ResolvableFuture<V> create() {
            androidx.concurrent.futures.ResolvableFuture r0 = new androidx.concurrent.futures.ResolvableFuture
            r0.<init>()
            return r0
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean set(V r2) {
            r1 = this;
            boolean r0 = super.set(r2)
            return r0
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean setException(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = super.setException(r2)
            return r0
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> r2) {
            r1 = this;
            boolean r0 = super.setFuture(r2)
            return r0
    }
}
