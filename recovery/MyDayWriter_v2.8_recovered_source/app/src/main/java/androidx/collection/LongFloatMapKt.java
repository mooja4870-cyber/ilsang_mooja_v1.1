package androidx.collection;

/* JADX INFO: compiled from: LongFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\u001a\u0006\u0010\u0011\u001a\u00020\u0001\u001a\u0016\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"EmptyLongFloatMap", "Landroidx/collection/MutableLongFloatMap;", "emptyLongFloatMap", "Landroidx/collection/LongFloatMap;", "longFloatMapOf", "key1", "", "value1", "", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableLongFloatMapOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LongFloatMapKt {
    private static final androidx.collection.MutableLongFloatMap EmptyLongFloatMap = null;

    static {
            androidx.collection.MutableLongFloatMap r0 = new androidx.collection.MutableLongFloatMap
            r1 = 0
            r0.<init>(r1)
            androidx.collection.LongFloatMapKt.EmptyLongFloatMap = r0
            return
    }

    public static final androidx.collection.LongFloatMap emptyLongFloatMap() {
            androidx.collection.MutableLongFloatMap r0 = androidx.collection.LongFloatMapKt.EmptyLongFloatMap
            androidx.collection.LongFloatMap r0 = (androidx.collection.LongFloatMap) r0
            return r0
    }

    public static final androidx.collection.LongFloatMap longFloatMapOf() {
            androidx.collection.MutableLongFloatMap r0 = androidx.collection.LongFloatMapKt.EmptyLongFloatMap
            androidx.collection.LongFloatMap r0 = (androidx.collection.LongFloatMap) r0
            return r0
    }

    public static final androidx.collection.LongFloatMap longFloatMapOf(long r4, float r6) {
            androidx.collection.MutableLongFloatMap r0 = new androidx.collection.MutableLongFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r6)
            androidx.collection.LongFloatMap r0 = (androidx.collection.LongFloatMap) r0
            return r0
    }

    public static final androidx.collection.LongFloatMap longFloatMapOf(long r4, float r6, long r7, float r9) {
            androidx.collection.MutableLongFloatMap r0 = new androidx.collection.MutableLongFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r6)
            r1.set(r7, r9)
            androidx.collection.LongFloatMap r0 = (androidx.collection.LongFloatMap) r0
            return r0
    }

    public static final androidx.collection.LongFloatMap longFloatMapOf(long r4, float r6, long r7, float r9, long r10, float r12) {
            androidx.collection.MutableLongFloatMap r0 = new androidx.collection.MutableLongFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r6)
            r1.set(r7, r9)
            r1.set(r10, r12)
            androidx.collection.LongFloatMap r0 = (androidx.collection.LongFloatMap) r0
            return r0
    }

    public static final androidx.collection.LongFloatMap longFloatMapOf(long r4, float r6, long r7, float r9, long r10, float r12, long r13, float r15) {
            androidx.collection.MutableLongFloatMap r0 = new androidx.collection.MutableLongFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r6)
            r1.set(r7, r9)
            r1.set(r10, r12)
            r1.set(r13, r15)
            androidx.collection.LongFloatMap r0 = (androidx.collection.LongFloatMap) r0
            return r0
    }

    public static final androidx.collection.LongFloatMap longFloatMapOf(long r16, float r18, long r19, float r21, long r22, float r24, long r25, float r27, long r28, float r30) {
            androidx.collection.MutableLongFloatMap r0 = new androidx.collection.MutableLongFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r3 = r16
            r5 = r18
            r1.set(r3, r5)
            r6 = r19
            r8 = r21
            r1.set(r6, r8)
            r9 = r22
            r11 = r24
            r1.set(r9, r11)
            r12 = r25
            r14 = r27
            r1.set(r12, r14)
            r4 = r30
            r15 = r2
            r2 = r28
            r1.set(r2, r4)
            androidx.collection.LongFloatMap r0 = (androidx.collection.LongFloatMap) r0
            return r0
    }

    public static final androidx.collection.MutableLongFloatMap mutableLongFloatMapOf() {
            androidx.collection.MutableLongFloatMap r0 = new androidx.collection.MutableLongFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static final androidx.collection.MutableLongFloatMap mutableLongFloatMapOf(long r4, float r6) {
            androidx.collection.MutableLongFloatMap r0 = new androidx.collection.MutableLongFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r6)
            return r0
    }

    public static final androidx.collection.MutableLongFloatMap mutableLongFloatMapOf(long r4, float r6, long r7, float r9) {
            androidx.collection.MutableLongFloatMap r0 = new androidx.collection.MutableLongFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r6)
            r1.set(r7, r9)
            return r0
    }

    public static final androidx.collection.MutableLongFloatMap mutableLongFloatMapOf(long r4, float r6, long r7, float r9, long r10, float r12) {
            androidx.collection.MutableLongFloatMap r0 = new androidx.collection.MutableLongFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r6)
            r1.set(r7, r9)
            r1.set(r10, r12)
            return r0
    }

    public static final androidx.collection.MutableLongFloatMap mutableLongFloatMapOf(long r4, float r6, long r7, float r9, long r10, float r12, long r13, float r15) {
            androidx.collection.MutableLongFloatMap r0 = new androidx.collection.MutableLongFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r6)
            r1.set(r7, r9)
            r1.set(r10, r12)
            r1.set(r13, r15)
            return r0
    }

    public static final androidx.collection.MutableLongFloatMap mutableLongFloatMapOf(long r16, float r18, long r19, float r21, long r22, float r24, long r25, float r27, long r28, float r30) {
            androidx.collection.MutableLongFloatMap r0 = new androidx.collection.MutableLongFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r3 = r16
            r5 = r18
            r1.set(r3, r5)
            r6 = r19
            r8 = r21
            r1.set(r6, r8)
            r9 = r22
            r11 = r24
            r1.set(r9, r11)
            r12 = r25
            r14 = r27
            r1.set(r12, r14)
            r4 = r30
            r15 = r2
            r2 = r28
            r1.set(r2, r4)
            return r0
    }
}
