package androidx.collection;

/* JADX INFO: compiled from: FloatSet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0006\u0010\b\u001a\u00020\u0007\u001a\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n\u001a\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u001a\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a\u0012\u0010\b\u001a\u00020\u00072\n\u0010\r\u001a\u00020\u0001\"\u00020\n\u001a\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0080\b\u001a\u0006\u0010\u0011\u001a\u00020\u0005\u001a\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n\u001a\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u001a\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a\u0012\u0010\u0011\u001a\u00020\u00052\n\u0010\r\u001a\u00020\u0001\"\u00020\n\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"EmptyFloatArray", "", "getEmptyFloatArray", "()[F", "EmptyFloatSet", "Landroidx/collection/MutableFloatSet;", "emptyFloatSet", "Landroidx/collection/FloatSet;", "floatSetOf", "element1", "", "element2", "element3", "elements", "hash", "", "k", "mutableFloatSetOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FloatSetKt {
    private static final float[] EmptyFloatArray = null;
    private static final androidx.collection.MutableFloatSet EmptyFloatSet = null;

    static {
            androidx.collection.MutableFloatSet r0 = new androidx.collection.MutableFloatSet
            r1 = 0
            r0.<init>(r1)
            androidx.collection.FloatSetKt.EmptyFloatSet = r0
            float[] r0 = new float[r1]
            androidx.collection.FloatSetKt.EmptyFloatArray = r0
            return
    }

    public static final androidx.collection.FloatSet emptyFloatSet() {
            androidx.collection.MutableFloatSet r0 = androidx.collection.FloatSetKt.EmptyFloatSet
            androidx.collection.FloatSet r0 = (androidx.collection.FloatSet) r0
            return r0
    }

    public static final androidx.collection.FloatSet floatSetOf() {
            androidx.collection.MutableFloatSet r0 = androidx.collection.FloatSetKt.EmptyFloatSet
            androidx.collection.FloatSet r0 = (androidx.collection.FloatSet) r0
            return r0
    }

    public static final androidx.collection.FloatSet floatSetOf(float r1) {
            androidx.collection.MutableFloatSet r0 = mutableFloatSetOf(r1)
            androidx.collection.FloatSet r0 = (androidx.collection.FloatSet) r0
            return r0
    }

    public static final androidx.collection.FloatSet floatSetOf(float r1, float r2) {
            androidx.collection.MutableFloatSet r0 = mutableFloatSetOf(r1, r2)
            androidx.collection.FloatSet r0 = (androidx.collection.FloatSet) r0
            return r0
    }

    public static final androidx.collection.FloatSet floatSetOf(float r1, float r2, float r3) {
            androidx.collection.MutableFloatSet r0 = mutableFloatSetOf(r1, r2, r3)
            androidx.collection.FloatSet r0 = (androidx.collection.FloatSet) r0
            return r0
    }

    public static final androidx.collection.FloatSet floatSetOf(float... r3) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.collection.MutableFloatSet r0 = new androidx.collection.MutableFloatSet
            int r1 = r3.length
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            androidx.collection.FloatSet r0 = (androidx.collection.FloatSet) r0
            return r0
    }

    public static final float[] getEmptyFloatArray() {
            float[] r0 = androidx.collection.FloatSetKt.EmptyFloatArray
            return r0
    }

    public static final int hash(float r3) {
            r0 = 0
            int r1 = java.lang.Float.hashCode(r3)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r2 = r2 ^ r1
            return r2
    }

    public static final androidx.collection.MutableFloatSet mutableFloatSetOf() {
            androidx.collection.MutableFloatSet r0 = new androidx.collection.MutableFloatSet
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static final androidx.collection.MutableFloatSet mutableFloatSetOf(float r3) {
            androidx.collection.MutableFloatSet r0 = new androidx.collection.MutableFloatSet
            r1 = 1
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            return r0
    }

    public static final androidx.collection.MutableFloatSet mutableFloatSetOf(float r3, float r4) {
            androidx.collection.MutableFloatSet r0 = new androidx.collection.MutableFloatSet
            r1 = 2
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            r1.plusAssign(r4)
            return r0
    }

    public static final androidx.collection.MutableFloatSet mutableFloatSetOf(float r3, float r4, float r5) {
            androidx.collection.MutableFloatSet r0 = new androidx.collection.MutableFloatSet
            r1 = 3
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            r1.plusAssign(r4)
            r1.plusAssign(r5)
            return r0
    }

    public static final androidx.collection.MutableFloatSet mutableFloatSetOf(float... r3) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.collection.MutableFloatSet r0 = new androidx.collection.MutableFloatSet
            int r1 = r3.length
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            return r0
    }
}
