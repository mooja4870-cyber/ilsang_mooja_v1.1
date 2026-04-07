package androidx.collection;

/* JADX INFO: compiled from: IntSet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u001a\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0080\b\u001a\u0006\u0010\u000b\u001a\u00020\u0007\u001a\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t\u001a\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t\u001a\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t\u001a\u0012\u0010\u000b\u001a\u00020\u00072\n\u0010\u000f\u001a\u00020\u0001\"\u00020\t\u001a\u0006\u0010\u0010\u001a\u00020\u0005\u001a\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\t\u001a\u0016\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t\u001a\u001e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t\u001a\u0012\u0010\u0010\u001a\u00020\u00052\n\u0010\u000f\u001a\u00020\u0001\"\u00020\t\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"EmptyIntArray", "", "getEmptyIntArray", "()[I", "EmptyIntSet", "Landroidx/collection/MutableIntSet;", "emptyIntSet", "Landroidx/collection/IntSet;", "hash", "", "k", "intSetOf", "element1", "element2", "element3", "elements", "mutableIntSetOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IntSetKt {
    private static final int[] EmptyIntArray = null;
    private static final androidx.collection.MutableIntSet EmptyIntSet = null;

    static {
            androidx.collection.MutableIntSet r0 = new androidx.collection.MutableIntSet
            r1 = 0
            r0.<init>(r1)
            androidx.collection.IntSetKt.EmptyIntSet = r0
            int[] r0 = new int[r1]
            androidx.collection.IntSetKt.EmptyIntArray = r0
            return
    }

    public static final androidx.collection.IntSet emptyIntSet() {
            androidx.collection.MutableIntSet r0 = androidx.collection.IntSetKt.EmptyIntSet
            androidx.collection.IntSet r0 = (androidx.collection.IntSet) r0
            return r0
    }

    public static final int[] getEmptyIntArray() {
            int[] r0 = androidx.collection.IntSetKt.EmptyIntArray
            return r0
    }

    public static final int hash(int r3) {
            r0 = 0
            int r1 = java.lang.Integer.hashCode(r3)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r2 = r2 ^ r1
            return r2
    }

    public static final androidx.collection.IntSet intSetOf() {
            androidx.collection.MutableIntSet r0 = androidx.collection.IntSetKt.EmptyIntSet
            androidx.collection.IntSet r0 = (androidx.collection.IntSet) r0
            return r0
    }

    public static final androidx.collection.IntSet intSetOf(int r1) {
            androidx.collection.MutableIntSet r0 = mutableIntSetOf(r1)
            androidx.collection.IntSet r0 = (androidx.collection.IntSet) r0
            return r0
    }

    public static final androidx.collection.IntSet intSetOf(int r1, int r2) {
            androidx.collection.MutableIntSet r0 = mutableIntSetOf(r1, r2)
            androidx.collection.IntSet r0 = (androidx.collection.IntSet) r0
            return r0
    }

    public static final androidx.collection.IntSet intSetOf(int r1, int r2, int r3) {
            androidx.collection.MutableIntSet r0 = mutableIntSetOf(r1, r2, r3)
            androidx.collection.IntSet r0 = (androidx.collection.IntSet) r0
            return r0
    }

    public static final androidx.collection.IntSet intSetOf(int... r3) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.collection.MutableIntSet r0 = new androidx.collection.MutableIntSet
            int r1 = r3.length
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            androidx.collection.IntSet r0 = (androidx.collection.IntSet) r0
            return r0
    }

    public static final androidx.collection.MutableIntSet mutableIntSetOf() {
            androidx.collection.MutableIntSet r0 = new androidx.collection.MutableIntSet
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static final androidx.collection.MutableIntSet mutableIntSetOf(int r3) {
            androidx.collection.MutableIntSet r0 = new androidx.collection.MutableIntSet
            r1 = 1
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            return r0
    }

    public static final androidx.collection.MutableIntSet mutableIntSetOf(int r3, int r4) {
            androidx.collection.MutableIntSet r0 = new androidx.collection.MutableIntSet
            r1 = 2
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            r1.plusAssign(r4)
            return r0
    }

    public static final androidx.collection.MutableIntSet mutableIntSetOf(int r3, int r4, int r5) {
            androidx.collection.MutableIntSet r0 = new androidx.collection.MutableIntSet
            r1 = 3
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            r1.plusAssign(r4)
            r1.plusAssign(r5)
            return r0
    }

    public static final androidx.collection.MutableIntSet mutableIntSetOf(int... r3) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.collection.MutableIntSet r0 = new androidx.collection.MutableIntSet
            int r1 = r3.length
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            return r0
    }
}
