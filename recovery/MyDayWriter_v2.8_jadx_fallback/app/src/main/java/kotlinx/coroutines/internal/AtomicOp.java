package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: Atomic.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0013R\u0011\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/internal/AtomicOp;", "T", "Lkotlinx/coroutines/internal/OpDescriptor;", "()V", "_consensus", "Lkotlinx/atomicfu/AtomicRef;", "", "atomicOp", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "complete", "", "affected", "failure", "(Ljava/lang/Object;Ljava/lang/Object;)V", "decide", "decision", "perform", "prepare", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AtomicOp<T> extends kotlinx.coroutines.internal.OpDescriptor {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _consensus$volatile$FU = null;
    private volatile /* synthetic */ java.lang.Object _consensus$volatile;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_consensus$volatile"
            java.lang.Class<kotlinx.coroutines.internal.AtomicOp> r2 = kotlinx.coroutines.internal.AtomicOp.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.AtomicOp._consensus$volatile$FU = r0
            return
    }

    public AtomicOp() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = kotlinx.coroutines.internal.AtomicKt.NO_DECISION
            r1._consensus$volatile = r0
            return
    }

    private final java.lang.Object decide(java.lang.Object r4) {
            r3 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L17
            r0 = 0
            java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.NO_DECISION
            if (r4 == r1) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 == 0) goto L11
            goto L17
        L11:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L17:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_consensus$volatile$FU()
            java.lang.Object r0 = r0.get(r3)
            java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.NO_DECISION
            if (r0 == r1) goto L24
            return r0
        L24:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = get_consensus$volatile$FU()
            java.lang.Object r2 = kotlinx.coroutines.internal.AtomicKt.NO_DECISION
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r3, r2, r4)
            if (r1 == 0) goto L31
            return r4
        L31:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = get_consensus$volatile$FU()
            java.lang.Object r1 = r1.get(r3)
            return r1
    }

    private final /* synthetic */ java.lang.Object get_consensus$volatile() {
            r1 = this;
            java.lang.Object r0 = r1._consensus$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater get_consensus$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.AtomicOp._consensus$volatile$FU
            return r0
    }

    private final /* synthetic */ void set_consensus$volatile(java.lang.Object r1) {
            r0 = this;
            r0._consensus$volatile = r1
            return
    }

    public abstract void complete(T r1, java.lang.Object r2);

    @Override // kotlinx.coroutines.internal.OpDescriptor
    public kotlinx.coroutines.internal.AtomicOp<?> getAtomicOp() {
            r0 = this;
            return r0
    }

    @Override // kotlinx.coroutines.internal.OpDescriptor
    public final java.lang.Object perform(java.lang.Object r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_consensus$volatile$FU()
            java.lang.Object r0 = r0.get(r2)
            java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.NO_DECISION
            if (r0 != r1) goto L14
            java.lang.Object r1 = r2.prepare(r3)
            java.lang.Object r0 = r2.decide(r1)
        L14:
            r2.complete(r3, r0)
            return r0
    }

    public abstract java.lang.Object prepare(T r1);
}
