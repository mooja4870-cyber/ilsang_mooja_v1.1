package androidx.collection;

/* JADX INFO: compiled from: LongLongMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006\u001a6\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006\u001aF\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006\u001aV\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006\u001a\u0006\u0010\u0010\u001a\u00020\u0001\u001a\u0016\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a&\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006\u001a6\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006\u001aF\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006\u001aV\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"EmptyLongLongMap", "Landroidx/collection/MutableLongLongMap;", "emptyLongLongMap", "Landroidx/collection/LongLongMap;", "longLongMapOf", "key1", "", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableLongLongMapOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LongLongMapKt {
    private static final androidx.collection.MutableLongLongMap EmptyLongLongMap = null;

    static {
            androidx.collection.MutableLongLongMap r0 = new androidx.collection.MutableLongLongMap
            r1 = 0
            r0.<init>(r1)
            androidx.collection.LongLongMapKt.EmptyLongLongMap = r0
            return
    }

    public static final androidx.collection.LongLongMap emptyLongLongMap() {
            androidx.collection.MutableLongLongMap r0 = androidx.collection.LongLongMapKt.EmptyLongLongMap
            androidx.collection.LongLongMap r0 = (androidx.collection.LongLongMap) r0
            return r0
    }

    public static final androidx.collection.LongLongMap longLongMapOf() {
            androidx.collection.MutableLongLongMap r0 = androidx.collection.LongLongMapKt.EmptyLongLongMap
            androidx.collection.LongLongMap r0 = (androidx.collection.LongLongMap) r0
            return r0
    }

    public static final androidx.collection.LongLongMap longLongMapOf(long r4, long r6) {
            androidx.collection.MutableLongLongMap r0 = new androidx.collection.MutableLongLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r6)
            androidx.collection.LongLongMap r0 = (androidx.collection.LongLongMap) r0
            return r0
    }

    public static final androidx.collection.LongLongMap longLongMapOf(long r4, long r6, long r8, long r10) {
            androidx.collection.MutableLongLongMap r0 = new androidx.collection.MutableLongLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r6)
            r1.set(r8, r10)
            androidx.collection.LongLongMap r0 = (androidx.collection.LongLongMap) r0
            return r0
    }

    public static final androidx.collection.LongLongMap longLongMapOf(long r4, long r6, long r8, long r10, long r12, long r14) {
            androidx.collection.MutableLongLongMap r0 = new androidx.collection.MutableLongLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r6)
            r1.set(r8, r10)
            r1.set(r12, r14)
            androidx.collection.LongLongMap r0 = (androidx.collection.LongLongMap) r0
            return r0
    }

    public static final androidx.collection.LongLongMap longLongMapOf(long r16, long r18, long r20, long r22, long r24, long r26, long r28, long r30) {
            androidx.collection.MutableLongLongMap r0 = new androidx.collection.MutableLongLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r3 = r16
            r5 = r18
            r1.set(r3, r5)
            r7 = r20
            r9 = r22
            r1.set(r7, r9)
            r11 = r24
            r13 = r26
            r1.set(r11, r13)
            r4 = r30
            r15 = r2
            r2 = r28
            r1.set(r2, r4)
            androidx.collection.LongLongMap r0 = (androidx.collection.LongLongMap) r0
            return r0
    }

    public static final androidx.collection.LongLongMap longLongMapOf(long r16, long r18, long r20, long r22, long r24, long r26, long r28, long r30, long r32, long r34) {
            androidx.collection.MutableLongLongMap r0 = new androidx.collection.MutableLongLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r3 = r16
            r5 = r18
            r1.set(r3, r5)
            r7 = r20
            r9 = r22
            r1.set(r7, r9)
            r11 = r24
            r13 = r26
            r1.set(r11, r13)
            r4 = r30
            r15 = r2
            r2 = r28
            r1.set(r2, r4)
            r2 = r32
            r4 = r34
            r1.set(r2, r4)
            androidx.collection.LongLongMap r0 = (androidx.collection.LongLongMap) r0
            return r0
    }

    public static final androidx.collection.MutableLongLongMap mutableLongLongMapOf() {
            androidx.collection.MutableLongLongMap r0 = new androidx.collection.MutableLongLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static final androidx.collection.MutableLongLongMap mutableLongLongMapOf(long r4, long r6) {
            androidx.collection.MutableLongLongMap r0 = new androidx.collection.MutableLongLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r6)
            return r0
    }

    public static final androidx.collection.MutableLongLongMap mutableLongLongMapOf(long r4, long r6, long r8, long r10) {
            androidx.collection.MutableLongLongMap r0 = new androidx.collection.MutableLongLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r6)
            r1.set(r8, r10)
            return r0
    }

    public static final androidx.collection.MutableLongLongMap mutableLongLongMapOf(long r4, long r6, long r8, long r10, long r12, long r14) {
            androidx.collection.MutableLongLongMap r0 = new androidx.collection.MutableLongLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r6)
            r1.set(r8, r10)
            r1.set(r12, r14)
            return r0
    }

    public static final androidx.collection.MutableLongLongMap mutableLongLongMapOf(long r16, long r18, long r20, long r22, long r24, long r26, long r28, long r30) {
            androidx.collection.MutableLongLongMap r0 = new androidx.collection.MutableLongLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r3 = r16
            r5 = r18
            r1.set(r3, r5)
            r7 = r20
            r9 = r22
            r1.set(r7, r9)
            r11 = r24
            r13 = r26
            r1.set(r11, r13)
            r4 = r30
            r15 = r2
            r2 = r28
            r1.set(r2, r4)
            return r0
    }

    public static final androidx.collection.MutableLongLongMap mutableLongLongMapOf(long r16, long r18, long r20, long r22, long r24, long r26, long r28, long r30, long r32, long r34) {
            androidx.collection.MutableLongLongMap r0 = new androidx.collection.MutableLongLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r3 = r16
            r5 = r18
            r1.set(r3, r5)
            r7 = r20
            r9 = r22
            r1.set(r7, r9)
            r11 = r24
            r13 = r26
            r1.set(r11, r13)
            r4 = r30
            r15 = r2
            r2 = r28
            r1.set(r2, r4)
            r2 = r32
            r4 = r34
            r1.set(r2, r4)
            return r0
    }
}
