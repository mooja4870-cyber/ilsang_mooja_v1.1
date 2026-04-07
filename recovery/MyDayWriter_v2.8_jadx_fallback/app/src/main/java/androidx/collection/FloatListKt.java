package androidx.collection;

/* JADX INFO: compiled from: FloatList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u000e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\u0012\u0010\u0003\u001a\u00020\u00012\n\u0010\b\u001a\u00020\t\"\u00020\u0005\u001a\t\u0010\n\u001a\u00020\u000bH\u0086\b\u001a\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\u0015\u0010\n\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\t\"\u00020\u0005H\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"EmptyFloatList", "Landroidx/collection/FloatList;", "emptyFloatList", "floatListOf", "element1", "", "element2", "element3", "elements", "", "mutableFloatListOf", "Landroidx/collection/MutableFloatList;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FloatListKt {
    private static final androidx.collection.FloatList EmptyFloatList = null;

    static {
            androidx.collection.MutableFloatList r0 = new androidx.collection.MutableFloatList
            r1 = 0
            r0.<init>(r1)
            androidx.collection.FloatList r0 = (androidx.collection.FloatList) r0
            androidx.collection.FloatListKt.EmptyFloatList = r0
            return
    }

    public static final androidx.collection.FloatList emptyFloatList() {
            androidx.collection.FloatList r0 = androidx.collection.FloatListKt.EmptyFloatList
            return r0
    }

    public static final androidx.collection.FloatList floatListOf() {
            androidx.collection.FloatList r0 = androidx.collection.FloatListKt.EmptyFloatList
            return r0
    }

    public static final androidx.collection.FloatList floatListOf(float r1) {
            androidx.collection.MutableFloatList r0 = mutableFloatListOf(r1)
            androidx.collection.FloatList r0 = (androidx.collection.FloatList) r0
            return r0
    }

    public static final androidx.collection.FloatList floatListOf(float r1, float r2) {
            androidx.collection.MutableFloatList r0 = mutableFloatListOf(r1, r2)
            androidx.collection.FloatList r0 = (androidx.collection.FloatList) r0
            return r0
    }

    public static final androidx.collection.FloatList floatListOf(float r1, float r2, float r3) {
            androidx.collection.MutableFloatList r0 = mutableFloatListOf(r1, r2, r3)
            androidx.collection.FloatList r0 = (androidx.collection.FloatList) r0
            return r0
    }

    public static final androidx.collection.FloatList floatListOf(float... r3) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.collection.MutableFloatList r0 = new androidx.collection.MutableFloatList
            int r1 = r3.length
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            androidx.collection.FloatList r0 = (androidx.collection.FloatList) r0
            return r0
    }

    public static final androidx.collection.MutableFloatList mutableFloatListOf() {
            r0 = 0
            androidx.collection.MutableFloatList r1 = new androidx.collection.MutableFloatList
            r2 = 1
            r3 = 0
            r4 = 0
            r1.<init>(r4, r2, r3)
            return r1
    }

    public static final androidx.collection.MutableFloatList mutableFloatListOf(float r3) {
            androidx.collection.MutableFloatList r0 = new androidx.collection.MutableFloatList
            r1 = 1
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.add(r3)
            return r0
    }

    public static final androidx.collection.MutableFloatList mutableFloatListOf(float r3, float r4) {
            androidx.collection.MutableFloatList r0 = new androidx.collection.MutableFloatList
            r1 = 2
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.add(r3)
            r2 = 0
            r1.add(r4)
            return r0
    }

    public static final androidx.collection.MutableFloatList mutableFloatListOf(float r3, float r4, float r5) {
            androidx.collection.MutableFloatList r0 = new androidx.collection.MutableFloatList
            r1 = 3
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.add(r3)
            r2 = 0
            r1.add(r4)
            r2 = 0
            r1.add(r5)
            return r0
    }

    public static final androidx.collection.MutableFloatList mutableFloatListOf(float... r4) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            androidx.collection.MutableFloatList r1 = new androidx.collection.MutableFloatList
            int r2 = r4.length
            r1.<init>(r2)
            r2 = r1
            r3 = 0
            r2.plusAssign(r4)
            return r1
    }
}
