package androidx.concurrent.futures;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ boolean m(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
        L0:
            boolean r0 = r1.compareAndSet(r2, r3, r4)
            if (r0 == 0) goto L8
            r1 = 1
            return r1
        L8:
            java.lang.Object r0 = r1.get(r2)
            if (r0 == r3) goto L0
            r1 = 0
            return r1
    }
}
