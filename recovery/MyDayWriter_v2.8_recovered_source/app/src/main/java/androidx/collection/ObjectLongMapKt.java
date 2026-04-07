package androidx.collection;

/* JADX INFO: compiled from: ObjectLongMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0015\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\n\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\r\u001aG\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0002\u0010\u0010\u001aW\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0002\u0010\u0013\u001ag\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0002\u0010\u0016\u001a\u0012\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0019\u001a7\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\u001a\u001aG\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0002\u0010\u001b\u001aW\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0002\u0010\u001c\u001ag\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0002\u0010\u001d\"\u0016\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"EmptyObjectLongMap", "Landroidx/collection/MutableObjectLongMap;", "", "emptyObjectLongMap", "Landroidx/collection/ObjectLongMap;", "K", "mutableObjectLongMapOf", "key1", "value1", "", "(Ljava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;", "key2", "value2", "(Ljava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;", "key3", "value3", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;", "key4", "value4", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;", "key5", "value5", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;", "objectLongMap", "objectLongMapOf", "(Ljava/lang/Object;J)Landroidx/collection/ObjectLongMap;", "(Ljava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/ObjectLongMap;", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/ObjectLongMap;", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/ObjectLongMap;", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/ObjectLongMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ObjectLongMapKt {
    private static final androidx.collection.MutableObjectLongMap<java.lang.Object> EmptyObjectLongMap = null;

    static {
            androidx.collection.MutableObjectLongMap r0 = new androidx.collection.MutableObjectLongMap
            r1 = 0
            r0.<init>(r1)
            androidx.collection.ObjectLongMapKt.EmptyObjectLongMap = r0
            return
    }

    public static final <K> androidx.collection.ObjectLongMap<K> emptyObjectLongMap() {
            androidx.collection.MutableObjectLongMap<java.lang.Object> r0 = androidx.collection.ObjectLongMapKt.EmptyObjectLongMap
            java.lang.String r1 = "null cannot be cast to non-null type androidx.collection.ObjectLongMap<K of androidx.collection.ObjectLongMapKt.emptyObjectLongMap>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            androidx.collection.ObjectLongMap r0 = (androidx.collection.ObjectLongMap) r0
            return r0
    }

    public static final <K> androidx.collection.MutableObjectLongMap<K> mutableObjectLongMapOf() {
            androidx.collection.MutableObjectLongMap r0 = new androidx.collection.MutableObjectLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static final <K> androidx.collection.MutableObjectLongMap<K> mutableObjectLongMapOf(K r4, long r5) {
            androidx.collection.MutableObjectLongMap r0 = new androidx.collection.MutableObjectLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            return r0
    }

    public static final <K> androidx.collection.MutableObjectLongMap<K> mutableObjectLongMapOf(K r4, long r5, K r7, long r8) {
            androidx.collection.MutableObjectLongMap r0 = new androidx.collection.MutableObjectLongMap
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

    public static final <K> androidx.collection.MutableObjectLongMap<K> mutableObjectLongMapOf(K r4, long r5, K r7, long r8, K r10, long r11) {
            androidx.collection.MutableObjectLongMap r0 = new androidx.collection.MutableObjectLongMap
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

    public static final <K> androidx.collection.MutableObjectLongMap<K> mutableObjectLongMapOf(K r4, long r5, K r7, long r8, K r10, long r11, K r13, long r14) {
            androidx.collection.MutableObjectLongMap r0 = new androidx.collection.MutableObjectLongMap
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

    public static final <K> androidx.collection.MutableObjectLongMap<K> mutableObjectLongMapOf(K r17, long r18, K r20, long r21, K r23, long r24, K r26, long r27, K r29, long r30) {
            androidx.collection.MutableObjectLongMap r0 = new androidx.collection.MutableObjectLongMap
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

    public static final <K> androidx.collection.ObjectLongMap<K> objectLongMap() {
            androidx.collection.MutableObjectLongMap<java.lang.Object> r0 = androidx.collection.ObjectLongMapKt.EmptyObjectLongMap
            java.lang.String r1 = "null cannot be cast to non-null type androidx.collection.ObjectLongMap<K of androidx.collection.ObjectLongMapKt.objectLongMap>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            androidx.collection.ObjectLongMap r0 = (androidx.collection.ObjectLongMap) r0
            return r0
    }

    public static final <K> androidx.collection.ObjectLongMap<K> objectLongMapOf(K r4, long r5) {
            androidx.collection.MutableObjectLongMap r0 = new androidx.collection.MutableObjectLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            androidx.collection.ObjectLongMap r0 = (androidx.collection.ObjectLongMap) r0
            return r0
    }

    public static final <K> androidx.collection.ObjectLongMap<K> objectLongMapOf(K r4, long r5, K r7, long r8) {
            androidx.collection.MutableObjectLongMap r0 = new androidx.collection.MutableObjectLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            r1.set(r7, r8)
            androidx.collection.ObjectLongMap r0 = (androidx.collection.ObjectLongMap) r0
            return r0
    }

    public static final <K> androidx.collection.ObjectLongMap<K> objectLongMapOf(K r4, long r5, K r7, long r8, K r10, long r11) {
            androidx.collection.MutableObjectLongMap r0 = new androidx.collection.MutableObjectLongMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            r1.set(r7, r8)
            r1.set(r10, r11)
            androidx.collection.ObjectLongMap r0 = (androidx.collection.ObjectLongMap) r0
            return r0
    }

    public static final <K> androidx.collection.ObjectLongMap<K> objectLongMapOf(K r4, long r5, K r7, long r8, K r10, long r11, K r13, long r14) {
            androidx.collection.MutableObjectLongMap r0 = new androidx.collection.MutableObjectLongMap
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
            androidx.collection.ObjectLongMap r0 = (androidx.collection.ObjectLongMap) r0
            return r0
    }

    public static final <K> androidx.collection.ObjectLongMap<K> objectLongMapOf(K r17, long r18, K r20, long r21, K r23, long r24, K r26, long r27, K r29, long r30) {
            androidx.collection.MutableObjectLongMap r0 = new androidx.collection.MutableObjectLongMap
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
            androidx.collection.ObjectLongMap r0 = (androidx.collection.ObjectLongMap) r0
            return r0
    }
}
