package androidx.collection;

/* JADX INFO: compiled from: IntLongMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\u001a\u0006\u0010\u0011\u001a\u00020\u0001\u001a\u0016\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"EmptyIntLongMap", "Landroidx/collection/MutableIntLongMap;", "emptyIntLongMap", "Landroidx/collection/IntLongMap;", "intLongMapOf", "key1", "", "value1", "", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableIntLongMapOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IntLongMapKt {
    private static final androidx.collection.MutableIntLongMap EmptyIntLongMap = null;

    static {
            androidx.collection.MutableIntLongMap r0 = new androidx.collection.MutableIntLongMap
            r1 = 0
            r0.<init>(r1)
            androidx.collection.IntLongMapKt.EmptyIntLongMap = r0
            return
    }

    public static final androidx.collection.IntLongMap emptyIntLongMap() {
            androidx.collection.MutableIntLongMap r0 = androidx.collection.IntLongMapKt.EmptyIntLongMap
            androidx.collection.IntLongMap r0 = (androidx.collection.IntLongMap) r0
            return r0
    }

    public static final androidx.collection.IntLongMap intLongMapOf() {
            androidx.collection.MutableIntLongMap r0 = androidx.collection.IntLongMapKt.EmptyIntLongMap
            androidx.collection.IntLongMap r0 = (androidx.collection.IntLongMap) r0
            return r0
    }

    public static final androidx.collection.IntLongMap intLongMapOf(int r4, long r5) {
            androidx.collection.MutableIntLongMap r0 = new androidx.collection.MutableIntLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            androidx.collection.IntLongMap r0 = (androidx.collection.IntLongMap) r0
            return r0
    }

    public static final androidx.collection.IntLongMap intLongMapOf(int r4, long r5, int r7, long r8) {
            androidx.collection.MutableIntLongMap r0 = new androidx.collection.MutableIntLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            r1.set(r7, r8)
            androidx.collection.IntLongMap r0 = (androidx.collection.IntLongMap) r0
            return r0
    }

    public static final androidx.collection.IntLongMap intLongMapOf(int r4, long r5, int r7, long r8, int r10, long r11) {
            androidx.collection.MutableIntLongMap r0 = new androidx.collection.MutableIntLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            r1.set(r7, r8)
            r1.set(r10, r11)
            androidx.collection.IntLongMap r0 = (androidx.collection.IntLongMap) r0
            return r0
    }

    public static final androidx.collection.IntLongMap intLongMapOf(int r4, long r5, int r7, long r8, int r10, long r11, int r13, long r14) {
            androidx.collection.MutableIntLongMap r0 = new androidx.collection.MutableIntLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            r1.set(r7, r8)
            r1.set(r10, r11)
            r1.set(r13, r14)
            androidx.collection.IntLongMap r0 = (androidx.collection.IntLongMap) r0
            return r0
    }

    public static final androidx.collection.IntLongMap intLongMapOf(int r17, long r18, int r20, long r21, int r23, long r24, int r26, long r27, int r29, long r30) {
            androidx.collection.MutableIntLongMap r0 = new androidx.collection.MutableIntLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r3 = r17
            r4 = r18
            r1.set(r3, r4)
            r6 = r20
            r7 = r21
            r1.set(r6, r7)
            r9 = r23
            r10 = r24
            r1.set(r9, r10)
            r12 = r26
            r13 = r27
            r1.set(r12, r13)
            r15 = r29
            r16 = r2
            r2 = r30
            r1.set(r15, r2)
            androidx.collection.IntLongMap r0 = (androidx.collection.IntLongMap) r0
            return r0
    }

    public static final androidx.collection.MutableIntLongMap mutableIntLongMapOf() {
            androidx.collection.MutableIntLongMap r0 = new androidx.collection.MutableIntLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static final androidx.collection.MutableIntLongMap mutableIntLongMapOf(int r4, long r5) {
            androidx.collection.MutableIntLongMap r0 = new androidx.collection.MutableIntLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            return r0
    }

    public static final androidx.collection.MutableIntLongMap mutableIntLongMapOf(int r4, long r5, int r7, long r8) {
            androidx.collection.MutableIntLongMap r0 = new androidx.collection.MutableIntLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            r1.set(r7, r8)
            return r0
    }

    public static final androidx.collection.MutableIntLongMap mutableIntLongMapOf(int r4, long r5, int r7, long r8, int r10, long r11) {
            androidx.collection.MutableIntLongMap r0 = new androidx.collection.MutableIntLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            r1.set(r7, r8)
            r1.set(r10, r11)
            return r0
    }

    public static final androidx.collection.MutableIntLongMap mutableIntLongMapOf(int r4, long r5, int r7, long r8, int r10, long r11, int r13, long r14) {
            androidx.collection.MutableIntLongMap r0 = new androidx.collection.MutableIntLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            r1.set(r7, r8)
            r1.set(r10, r11)
            r1.set(r13, r14)
            return r0
    }

    public static final androidx.collection.MutableIntLongMap mutableIntLongMapOf(int r17, long r18, int r20, long r21, int r23, long r24, int r26, long r27, int r29, long r30) {
            androidx.collection.MutableIntLongMap r0 = new androidx.collection.MutableIntLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r3 = r17
            r4 = r18
            r1.set(r3, r4)
            r6 = r20
            r7 = r21
            r1.set(r6, r7)
            r9 = r23
            r10 = r24
            r1.set(r9, r10)
            r12 = r26
            r13 = r27
            r1.set(r12, r13)
            r15 = r29
            r16 = r2
            r2 = r30
            r1.set(r15, r2)
            return r0
    }
}
