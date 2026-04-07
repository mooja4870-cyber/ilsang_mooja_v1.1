package androidx.collection;

/* JADX INFO: compiled from: LongSet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u001a\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0080\b\u001a\u0006\u0010\f\u001a\u00020\u0007\u001a\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b\u001a\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b\u001a\u001e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b\u001a\u0012\u0010\f\u001a\u00020\u00072\n\u0010\u0010\u001a\u00020\u0001\"\u00020\u000b\u001a\u0006\u0010\u0011\u001a\u00020\u0005\u001a\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000b\u001a\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b\u001a\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b\u001a\u0012\u0010\u0011\u001a\u00020\u00052\n\u0010\u0010\u001a\u00020\u0001\"\u00020\u000b\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"EmptyLongArray", "", "getEmptyLongArray", "()[J", "EmptyLongSet", "Landroidx/collection/MutableLongSet;", "emptyLongSet", "Landroidx/collection/LongSet;", "hash", "", "k", "", "longSetOf", "element1", "element2", "element3", "elements", "mutableLongSetOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LongSetKt {
    private static final long[] EmptyLongArray = null;
    private static final androidx.collection.MutableLongSet EmptyLongSet = null;

    static {
            androidx.collection.MutableLongSet r0 = new androidx.collection.MutableLongSet
            r1 = 0
            r0.<init>(r1)
            androidx.collection.LongSetKt.EmptyLongSet = r0
            long[] r0 = new long[r1]
            androidx.collection.LongSetKt.EmptyLongArray = r0
            return
    }

    public static final androidx.collection.LongSet emptyLongSet() {
            androidx.collection.MutableLongSet r0 = androidx.collection.LongSetKt.EmptyLongSet
            androidx.collection.LongSet r0 = (androidx.collection.LongSet) r0
            return r0
    }

    public static final long[] getEmptyLongArray() {
            long[] r0 = androidx.collection.LongSetKt.EmptyLongArray
            return r0
    }

    public static final int hash(long r3) {
            r0 = 0
            int r1 = java.lang.Long.hashCode(r3)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r2 = r2 ^ r1
            return r2
    }

    public static final androidx.collection.LongSet longSetOf() {
            androidx.collection.MutableLongSet r0 = androidx.collection.LongSetKt.EmptyLongSet
            androidx.collection.LongSet r0 = (androidx.collection.LongSet) r0
            return r0
    }

    public static final androidx.collection.LongSet longSetOf(long r1) {
            androidx.collection.MutableLongSet r0 = mutableLongSetOf(r1)
            androidx.collection.LongSet r0 = (androidx.collection.LongSet) r0
            return r0
    }

    public static final androidx.collection.LongSet longSetOf(long r1, long r3) {
            androidx.collection.MutableLongSet r0 = mutableLongSetOf(r1, r3)
            androidx.collection.LongSet r0 = (androidx.collection.LongSet) r0
            return r0
    }

    public static final androidx.collection.LongSet longSetOf(long r1, long r3, long r5) {
            androidx.collection.MutableLongSet r0 = mutableLongSetOf(r1, r3, r5)
            androidx.collection.LongSet r0 = (androidx.collection.LongSet) r0
            return r0
    }

    public static final androidx.collection.LongSet longSetOf(long... r3) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.collection.MutableLongSet r0 = new androidx.collection.MutableLongSet
            int r1 = r3.length
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            androidx.collection.LongSet r0 = (androidx.collection.LongSet) r0
            return r0
    }

    public static final androidx.collection.MutableLongSet mutableLongSetOf() {
            androidx.collection.MutableLongSet r0 = new androidx.collection.MutableLongSet
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static final androidx.collection.MutableLongSet mutableLongSetOf(long r3) {
            androidx.collection.MutableLongSet r0 = new androidx.collection.MutableLongSet
            r1 = 1
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            return r0
    }

    public static final androidx.collection.MutableLongSet mutableLongSetOf(long r3, long r5) {
            androidx.collection.MutableLongSet r0 = new androidx.collection.MutableLongSet
            r1 = 2
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            r1.plusAssign(r5)
            return r0
    }

    public static final androidx.collection.MutableLongSet mutableLongSetOf(long r3, long r5, long r7) {
            androidx.collection.MutableLongSet r0 = new androidx.collection.MutableLongSet
            r1 = 3
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            r1.plusAssign(r5)
            r1.plusAssign(r7)
            return r0
    }

    public static final androidx.collection.MutableLongSet mutableLongSetOf(long... r3) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.collection.MutableLongSet r0 = new androidx.collection.MutableLongSet
            int r1 = r3.length
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            return r0
    }
}
