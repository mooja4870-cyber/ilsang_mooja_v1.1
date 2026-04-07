package androidx.collection;

/* JADX INFO: compiled from: LongObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0015\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u0005¢\u0006\u0002\u0010\n\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u0005¢\u0006\u0002\u0010\r\u001aG\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0010\u001aW\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u0002H\u00052\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0013\u001ag\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u0002H\u00052\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0016\u001a\u0012\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0018\u001a7\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0019\u001aG\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u0002H\u0005¢\u0006\u0002\u0010\u001a\u001aW\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u0002H\u00052\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u0002H\u0005¢\u0006\u0002\u0010\u001b\u001ag\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u0002H\u00052\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u0002H\u0005¢\u0006\u0002\u0010\u001c\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"EmptyLongObjectMap", "Landroidx/collection/MutableLongObjectMap;", "", "emptyLongObjectMap", "Landroidx/collection/LongObjectMap;", "V", "longObjectMapOf", "key1", "", "value1", "(JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key2", "value2", "(JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key3", "value3", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key4", "value4", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key5", "value5", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "mutableLongObjectMapOf", "(JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LongObjectMapKt {
    private static final androidx.collection.MutableLongObjectMap EmptyLongObjectMap = null;

    static {
            androidx.collection.MutableLongObjectMap r0 = new androidx.collection.MutableLongObjectMap
            r1 = 0
            r0.<init>(r1)
            androidx.collection.LongObjectMapKt.EmptyLongObjectMap = r0
            return
    }

    public static final <V> androidx.collection.LongObjectMap<V> emptyLongObjectMap() {
            androidx.collection.MutableLongObjectMap r0 = androidx.collection.LongObjectMapKt.EmptyLongObjectMap
            java.lang.String r1 = "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            androidx.collection.LongObjectMap r0 = (androidx.collection.LongObjectMap) r0
            return r0
    }

    public static final <V> androidx.collection.LongObjectMap<V> longObjectMapOf() {
            androidx.collection.MutableLongObjectMap r0 = androidx.collection.LongObjectMapKt.EmptyLongObjectMap
            java.lang.String r1 = "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.longObjectMapOf>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            androidx.collection.LongObjectMap r0 = (androidx.collection.LongObjectMap) r0
            return r0
    }

    public static final <V> androidx.collection.LongObjectMap<V> longObjectMapOf(long r4, V r6) {
            androidx.collection.MutableLongObjectMap r0 = new androidx.collection.MutableLongObjectMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r6)
            androidx.collection.LongObjectMap r0 = (androidx.collection.LongObjectMap) r0
            return r0
    }

    public static final <V> androidx.collection.LongObjectMap<V> longObjectMapOf(long r4, V r6, long r7, V r9) {
            androidx.collection.MutableLongObjectMap r0 = new androidx.collection.MutableLongObjectMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r6)
            r1.set(r7, r9)
            androidx.collection.LongObjectMap r0 = (androidx.collection.LongObjectMap) r0
            return r0
    }

    public static final <V> androidx.collection.LongObjectMap<V> longObjectMapOf(long r4, V r6, long r7, V r9, long r10, V r12) {
            androidx.collection.MutableLongObjectMap r0 = new androidx.collection.MutableLongObjectMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r6)
            r1.set(r7, r9)
            r1.set(r10, r12)
            androidx.collection.LongObjectMap r0 = (androidx.collection.LongObjectMap) r0
            return r0
    }

    public static final <V> androidx.collection.LongObjectMap<V> longObjectMapOf(long r4, V r6, long r7, V r9, long r10, V r12, long r13, V r15) {
            androidx.collection.MutableLongObjectMap r0 = new androidx.collection.MutableLongObjectMap
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
            androidx.collection.LongObjectMap r0 = (androidx.collection.LongObjectMap) r0
            return r0
    }

    public static final <V> androidx.collection.LongObjectMap<V> longObjectMapOf(long r16, V r18, long r19, V r21, long r22, V r24, long r25, V r27, long r28, V r30) {
            androidx.collection.MutableLongObjectMap r0 = new androidx.collection.MutableLongObjectMap
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
            androidx.collection.LongObjectMap r0 = (androidx.collection.LongObjectMap) r0
            return r0
    }

    public static final <V> androidx.collection.MutableLongObjectMap<V> mutableLongObjectMapOf() {
            androidx.collection.MutableLongObjectMap r0 = new androidx.collection.MutableLongObjectMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static final <V> androidx.collection.MutableLongObjectMap<V> mutableLongObjectMapOf(long r4, V r6) {
            androidx.collection.MutableLongObjectMap r0 = new androidx.collection.MutableLongObjectMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r6)
            return r0
    }

    public static final <V> androidx.collection.MutableLongObjectMap<V> mutableLongObjectMapOf(long r4, V r6, long r7, V r9) {
            androidx.collection.MutableLongObjectMap r0 = new androidx.collection.MutableLongObjectMap
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

    public static final <V> androidx.collection.MutableLongObjectMap<V> mutableLongObjectMapOf(long r4, V r6, long r7, V r9, long r10, V r12) {
            androidx.collection.MutableLongObjectMap r0 = new androidx.collection.MutableLongObjectMap
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

    public static final <V> androidx.collection.MutableLongObjectMap<V> mutableLongObjectMapOf(long r4, V r6, long r7, V r9, long r10, V r12, long r13, V r15) {
            androidx.collection.MutableLongObjectMap r0 = new androidx.collection.MutableLongObjectMap
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

    public static final <V> androidx.collection.MutableLongObjectMap<V> mutableLongObjectMapOf(long r16, V r18, long r19, V r21, long r22, V r24, long r25, V r27, long r28, V r30) {
            androidx.collection.MutableLongObjectMap r0 = new androidx.collection.MutableLongObjectMap
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
