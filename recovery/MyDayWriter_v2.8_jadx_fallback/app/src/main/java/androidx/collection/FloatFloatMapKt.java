package androidx.collection;

/* JADX INFO: compiled from: FloatFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006\u001a6\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006\u001aF\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006\u001aV\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006\u001a\u0006\u0010\u0010\u001a\u00020\u0001\u001a\u0016\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a&\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006\u001a6\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006\u001aF\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006\u001aV\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"EmptyFloatFloatMap", "Landroidx/collection/MutableFloatFloatMap;", "emptyFloatFloatMap", "Landroidx/collection/FloatFloatMap;", "floatFloatMapOf", "key1", "", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableFloatFloatMapOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FloatFloatMapKt {
    private static final androidx.collection.MutableFloatFloatMap EmptyFloatFloatMap = null;

    static {
            androidx.collection.MutableFloatFloatMap r0 = new androidx.collection.MutableFloatFloatMap
            r1 = 0
            r0.<init>(r1)
            androidx.collection.FloatFloatMapKt.EmptyFloatFloatMap = r0
            return
    }

    public static final androidx.collection.FloatFloatMap emptyFloatFloatMap() {
            androidx.collection.MutableFloatFloatMap r0 = androidx.collection.FloatFloatMapKt.EmptyFloatFloatMap
            androidx.collection.FloatFloatMap r0 = (androidx.collection.FloatFloatMap) r0
            return r0
    }

    public static final androidx.collection.FloatFloatMap floatFloatMapOf() {
            androidx.collection.MutableFloatFloatMap r0 = androidx.collection.FloatFloatMapKt.EmptyFloatFloatMap
            androidx.collection.FloatFloatMap r0 = (androidx.collection.FloatFloatMap) r0
            return r0
    }

    public static final androidx.collection.FloatFloatMap floatFloatMapOf(float r4, float r5) {
            androidx.collection.MutableFloatFloatMap r0 = new androidx.collection.MutableFloatFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            androidx.collection.FloatFloatMap r0 = (androidx.collection.FloatFloatMap) r0
            return r0
    }

    public static final androidx.collection.FloatFloatMap floatFloatMapOf(float r4, float r5, float r6, float r7) {
            androidx.collection.MutableFloatFloatMap r0 = new androidx.collection.MutableFloatFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            r1.set(r6, r7)
            androidx.collection.FloatFloatMap r0 = (androidx.collection.FloatFloatMap) r0
            return r0
    }

    public static final androidx.collection.FloatFloatMap floatFloatMapOf(float r4, float r5, float r6, float r7, float r8, float r9) {
            androidx.collection.MutableFloatFloatMap r0 = new androidx.collection.MutableFloatFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            r1.set(r6, r7)
            r1.set(r8, r9)
            androidx.collection.FloatFloatMap r0 = (androidx.collection.FloatFloatMap) r0
            return r0
    }

    public static final androidx.collection.FloatFloatMap floatFloatMapOf(float r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11) {
            androidx.collection.MutableFloatFloatMap r0 = new androidx.collection.MutableFloatFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            r1.set(r6, r7)
            r1.set(r8, r9)
            r1.set(r10, r11)
            androidx.collection.FloatFloatMap r0 = (androidx.collection.FloatFloatMap) r0
            return r0
    }

    public static final androidx.collection.FloatFloatMap floatFloatMapOf(float r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11, float r12, float r13) {
            androidx.collection.MutableFloatFloatMap r0 = new androidx.collection.MutableFloatFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            r1.set(r6, r7)
            r1.set(r8, r9)
            r1.set(r10, r11)
            r1.set(r12, r13)
            androidx.collection.FloatFloatMap r0 = (androidx.collection.FloatFloatMap) r0
            return r0
    }

    public static final androidx.collection.MutableFloatFloatMap mutableFloatFloatMapOf() {
            androidx.collection.MutableFloatFloatMap r0 = new androidx.collection.MutableFloatFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static final androidx.collection.MutableFloatFloatMap mutableFloatFloatMapOf(float r4, float r5) {
            androidx.collection.MutableFloatFloatMap r0 = new androidx.collection.MutableFloatFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            return r0
    }

    public static final androidx.collection.MutableFloatFloatMap mutableFloatFloatMapOf(float r4, float r5, float r6, float r7) {
            androidx.collection.MutableFloatFloatMap r0 = new androidx.collection.MutableFloatFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            r1.set(r6, r7)
            return r0
    }

    public static final androidx.collection.MutableFloatFloatMap mutableFloatFloatMapOf(float r4, float r5, float r6, float r7, float r8, float r9) {
            androidx.collection.MutableFloatFloatMap r0 = new androidx.collection.MutableFloatFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            r1.set(r6, r7)
            r1.set(r8, r9)
            return r0
    }

    public static final androidx.collection.MutableFloatFloatMap mutableFloatFloatMapOf(float r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11) {
            androidx.collection.MutableFloatFloatMap r0 = new androidx.collection.MutableFloatFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            r1.set(r6, r7)
            r1.set(r8, r9)
            r1.set(r10, r11)
            return r0
    }

    public static final androidx.collection.MutableFloatFloatMap mutableFloatFloatMapOf(float r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11, float r12, float r13) {
            androidx.collection.MutableFloatFloatMap r0 = new androidx.collection.MutableFloatFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            r1.set(r6, r7)
            r1.set(r8, r9)
            r1.set(r10, r11)
            r1.set(r12, r13)
            return r0
    }
}
