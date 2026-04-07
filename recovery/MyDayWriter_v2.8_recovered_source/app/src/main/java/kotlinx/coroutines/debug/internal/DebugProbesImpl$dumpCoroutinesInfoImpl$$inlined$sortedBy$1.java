package kotlinx.coroutines.debug.internal;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1<T> implements java.util.Comparator {
    public DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(T r6, T r7) {
            r5 = this;
            r0 = r6
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r0 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r0
            r1 = 0
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r2 = r0.info
            long r2 = r2.sequenceNumber
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            r1 = r7
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r1 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r1
            r2 = 0
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r3 = r1.info
            long r3 = r3.sequenceNumber
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r0 = kotlin.comparisons.ComparisonsKt.compareValues(r0, r1)
            return r0
    }
}
