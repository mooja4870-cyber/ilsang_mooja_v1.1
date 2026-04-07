package kotlinx.coroutines.debug.internal;

/* JADX INFO: compiled from: ConcurrentWeakMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\b\u0010\b\u001a\u00020\tH\u0002\u001a\u000e\u0010\n\u001a\u00020\u0003*\u0004\u0018\u00010\u000bH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"MAGIC", "", "MARKED_NULL", "Lkotlinx/coroutines/debug/internal/Marked;", "MARKED_TRUE", "MIN_CAPACITY", "REHASH", "Lkotlinx/coroutines/internal/Symbol;", "noImpl", "", "mark", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ConcurrentWeakMapKt {
    private static final int MAGIC = -1640531527;
    private static final kotlinx.coroutines.debug.internal.Marked MARKED_NULL = null;
    private static final kotlinx.coroutines.debug.internal.Marked MARKED_TRUE = null;
    private static final int MIN_CAPACITY = 16;
    private static final kotlinx.coroutines.internal.Symbol REHASH = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "REHASH"
            r0.<init>(r1)
            kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.REHASH = r0
            kotlinx.coroutines.debug.internal.Marked r0 = new kotlinx.coroutines.debug.internal.Marked
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.MARKED_NULL = r0
            kotlinx.coroutines.debug.internal.Marked r0 = new kotlinx.coroutines.debug.internal.Marked
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.<init>(r1)
            kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.MARKED_TRUE = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getREHASH$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.REHASH
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.debug.internal.Marked access$mark(java.lang.Object r1) {
            kotlinx.coroutines.debug.internal.Marked r0 = mark(r1)
            return r0
    }

    public static final /* synthetic */ java.lang.Void access$noImpl() {
            java.lang.Void r0 = noImpl()
            return r0
    }

    private static final kotlinx.coroutines.debug.internal.Marked mark(java.lang.Object r1) {
            if (r1 != 0) goto L6
            kotlinx.coroutines.debug.internal.Marked r0 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.MARKED_NULL
            goto L19
        L6:
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L14
            kotlinx.coroutines.debug.internal.Marked r0 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.MARKED_TRUE
            goto L19
        L14:
            kotlinx.coroutines.debug.internal.Marked r0 = new kotlinx.coroutines.debug.internal.Marked
            r0.<init>(r1)
        L19:
            return r0
    }

    private static final java.lang.Void noImpl() {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "not implemented"
            r0.<init>(r1)
            throw r0
    }
}
