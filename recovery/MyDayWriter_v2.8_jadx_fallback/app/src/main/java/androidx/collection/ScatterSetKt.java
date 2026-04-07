package androidx.collection;

/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005\u001a\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u0005¢\u0006\u0002\u0010\b\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\t\u001a\u0002H\u0005¢\u0006\u0002\u0010\n\u001a/\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u0002H\u0005¢\u0006\u0002\u0010\f\u001a+\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u000e\"\u0002H\u0005¢\u0006\u0002\u0010\u000f\u001a\u0012\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0011\u001a'\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\t\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0012\u001a/\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0013\u001a+\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u000e\"\u0002H\u0005¢\u0006\u0002\u0010\u0014\"\u0016\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"EmptyScatterSet", "Landroidx/collection/MutableScatterSet;", "", "emptyScatterSet", "Landroidx/collection/ScatterSet;", "E", "mutableScatterSetOf", "element1", "(Ljava/lang/Object;)Landroidx/collection/MutableScatterSet;", "element2", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableScatterSet;", "element3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableScatterSet;", "elements", "", "([Ljava/lang/Object;)Landroidx/collection/MutableScatterSet;", "scatterSetOf", "(Ljava/lang/Object;)Landroidx/collection/ScatterSet;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ScatterSet;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ScatterSet;", "([Ljava/lang/Object;)Landroidx/collection/ScatterSet;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScatterSetKt {
    private static final androidx.collection.MutableScatterSet<java.lang.Object> EmptyScatterSet = null;

    static {
            androidx.collection.MutableScatterSet r0 = new androidx.collection.MutableScatterSet
            r1 = 0
            r0.<init>(r1)
            androidx.collection.ScatterSetKt.EmptyScatterSet = r0
            return
    }

    public static final <E> androidx.collection.ScatterSet<E> emptyScatterSet() {
            androidx.collection.MutableScatterSet<java.lang.Object> r0 = androidx.collection.ScatterSetKt.EmptyScatterSet
            java.lang.String r1 = "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            androidx.collection.ScatterSet r0 = (androidx.collection.ScatterSet) r0
            return r0
    }

    public static final <E> androidx.collection.MutableScatterSet<E> mutableScatterSetOf() {
            androidx.collection.MutableScatterSet r0 = new androidx.collection.MutableScatterSet
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static final <E> androidx.collection.MutableScatterSet<E> mutableScatterSetOf(E r3) {
            androidx.collection.MutableScatterSet r0 = new androidx.collection.MutableScatterSet
            r1 = 1
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            return r0
    }

    public static final <E> androidx.collection.MutableScatterSet<E> mutableScatterSetOf(E r3, E r4) {
            androidx.collection.MutableScatterSet r0 = new androidx.collection.MutableScatterSet
            r1 = 2
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            r1.plusAssign(r4)
            return r0
    }

    public static final <E> androidx.collection.MutableScatterSet<E> mutableScatterSetOf(E r3, E r4, E r5) {
            androidx.collection.MutableScatterSet r0 = new androidx.collection.MutableScatterSet
            r1 = 3
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            r1.plusAssign(r4)
            r1.plusAssign(r5)
            return r0
    }

    public static final <E> androidx.collection.MutableScatterSet<E> mutableScatterSetOf(E... r3) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.collection.MutableScatterSet r0 = new androidx.collection.MutableScatterSet
            int r1 = r3.length
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            return r0
    }

    public static final <E> androidx.collection.ScatterSet<E> scatterSetOf() {
            androidx.collection.MutableScatterSet<java.lang.Object> r0 = androidx.collection.ScatterSetKt.EmptyScatterSet
            java.lang.String r1 = "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.scatterSetOf>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            androidx.collection.ScatterSet r0 = (androidx.collection.ScatterSet) r0
            return r0
    }

    public static final <E> androidx.collection.ScatterSet<E> scatterSetOf(E r1) {
            androidx.collection.MutableScatterSet r0 = mutableScatterSetOf(r1)
            androidx.collection.ScatterSet r0 = (androidx.collection.ScatterSet) r0
            return r0
    }

    public static final <E> androidx.collection.ScatterSet<E> scatterSetOf(E r1, E r2) {
            androidx.collection.MutableScatterSet r0 = mutableScatterSetOf(r1, r2)
            androidx.collection.ScatterSet r0 = (androidx.collection.ScatterSet) r0
            return r0
    }

    public static final <E> androidx.collection.ScatterSet<E> scatterSetOf(E r1, E r2, E r3) {
            androidx.collection.MutableScatterSet r0 = mutableScatterSetOf(r1, r2, r3)
            androidx.collection.ScatterSet r0 = (androidx.collection.ScatterSet) r0
            return r0
    }

    public static final <E> androidx.collection.ScatterSet<E> scatterSetOf(E... r3) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.collection.MutableScatterSet r0 = new androidx.collection.MutableScatterSet
            int r1 = r3.length
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            androidx.collection.ScatterSet r0 = (androidx.collection.ScatterSet) r0
            return r0
    }
}
