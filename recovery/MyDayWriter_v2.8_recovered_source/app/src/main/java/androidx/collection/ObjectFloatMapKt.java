package androidx.collection;

/* JADX INFO: compiled from: ObjectFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0015\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\n\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\r\u001aG\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0002\u0010\u0010\u001aW\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0002\u0010\u0013\u001ag\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0002\u0010\u0016\u001a\u0012\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0019\u001a7\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\u001a\u001aG\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0002\u0010\u001b\u001aW\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0002\u0010\u001c\u001ag\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0002\u0010\u001d\"\u0016\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"EmptyObjectFloatMap", "Landroidx/collection/MutableObjectFloatMap;", "", "emptyObjectFloatMap", "Landroidx/collection/ObjectFloatMap;", "K", "mutableObjectFloatMapOf", "key1", "value1", "", "(Ljava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key2", "value2", "(Ljava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key3", "value3", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key4", "value4", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key5", "value5", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "objectFloatMap", "objectFloatMapOf", "(Ljava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ObjectFloatMapKt {
    private static final androidx.collection.MutableObjectFloatMap<java.lang.Object> EmptyObjectFloatMap = null;

    static {
            androidx.collection.MutableObjectFloatMap r0 = new androidx.collection.MutableObjectFloatMap
            r1 = 0
            r0.<init>(r1)
            androidx.collection.ObjectFloatMapKt.EmptyObjectFloatMap = r0
            return
    }

    public static final <K> androidx.collection.ObjectFloatMap<K> emptyObjectFloatMap() {
            androidx.collection.MutableObjectFloatMap<java.lang.Object> r0 = androidx.collection.ObjectFloatMapKt.EmptyObjectFloatMap
            java.lang.String r1 = "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.emptyObjectFloatMap>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            androidx.collection.ObjectFloatMap r0 = (androidx.collection.ObjectFloatMap) r0
            return r0
    }

    public static final <K> androidx.collection.MutableObjectFloatMap<K> mutableObjectFloatMapOf() {
            androidx.collection.MutableObjectFloatMap r0 = new androidx.collection.MutableObjectFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static final <K> androidx.collection.MutableObjectFloatMap<K> mutableObjectFloatMapOf(K r4, float r5) {
            androidx.collection.MutableObjectFloatMap r0 = new androidx.collection.MutableObjectFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            return r0
    }

    public static final <K> androidx.collection.MutableObjectFloatMap<K> mutableObjectFloatMapOf(K r4, float r5, K r6, float r7) {
            androidx.collection.MutableObjectFloatMap r0 = new androidx.collection.MutableObjectFloatMap
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

    public static final <K> androidx.collection.MutableObjectFloatMap<K> mutableObjectFloatMapOf(K r4, float r5, K r6, float r7, K r8, float r9) {
            androidx.collection.MutableObjectFloatMap r0 = new androidx.collection.MutableObjectFloatMap
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

    public static final <K> androidx.collection.MutableObjectFloatMap<K> mutableObjectFloatMapOf(K r4, float r5, K r6, float r7, K r8, float r9, K r10, float r11) {
            androidx.collection.MutableObjectFloatMap r0 = new androidx.collection.MutableObjectFloatMap
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

    public static final <K> androidx.collection.MutableObjectFloatMap<K> mutableObjectFloatMapOf(K r4, float r5, K r6, float r7, K r8, float r9, K r10, float r11, K r12, float r13) {
            androidx.collection.MutableObjectFloatMap r0 = new androidx.collection.MutableObjectFloatMap
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

    public static final <K> androidx.collection.ObjectFloatMap<K> objectFloatMap() {
            androidx.collection.MutableObjectFloatMap<java.lang.Object> r0 = androidx.collection.ObjectFloatMapKt.EmptyObjectFloatMap
            java.lang.String r1 = "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.objectFloatMap>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            androidx.collection.ObjectFloatMap r0 = (androidx.collection.ObjectFloatMap) r0
            return r0
    }

    public static final <K> androidx.collection.ObjectFloatMap<K> objectFloatMapOf(K r4, float r5) {
            androidx.collection.MutableObjectFloatMap r0 = new androidx.collection.MutableObjectFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            androidx.collection.ObjectFloatMap r0 = (androidx.collection.ObjectFloatMap) r0
            return r0
    }

    public static final <K> androidx.collection.ObjectFloatMap<K> objectFloatMapOf(K r4, float r5, K r6, float r7) {
            androidx.collection.MutableObjectFloatMap r0 = new androidx.collection.MutableObjectFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            r1.set(r6, r7)
            androidx.collection.ObjectFloatMap r0 = (androidx.collection.ObjectFloatMap) r0
            return r0
    }

    public static final <K> androidx.collection.ObjectFloatMap<K> objectFloatMapOf(K r4, float r5, K r6, float r7, K r8, float r9) {
            androidx.collection.MutableObjectFloatMap r0 = new androidx.collection.MutableObjectFloatMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r1 = r0
            r2 = 0
            r1.set(r4, r5)
            r1.set(r6, r7)
            r1.set(r8, r9)
            androidx.collection.ObjectFloatMap r0 = (androidx.collection.ObjectFloatMap) r0
            return r0
    }

    public static final <K> androidx.collection.ObjectFloatMap<K> objectFloatMapOf(K r4, float r5, K r6, float r7, K r8, float r9, K r10, float r11) {
            androidx.collection.MutableObjectFloatMap r0 = new androidx.collection.MutableObjectFloatMap
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
            androidx.collection.ObjectFloatMap r0 = (androidx.collection.ObjectFloatMap) r0
            return r0
    }

    public static final <K> androidx.collection.ObjectFloatMap<K> objectFloatMapOf(K r4, float r5, K r6, float r7, K r8, float r9, K r10, float r11, K r12, float r13) {
            androidx.collection.MutableObjectFloatMap r0 = new androidx.collection.MutableObjectFloatMap
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
            androidx.collection.ObjectFloatMap r0 = (androidx.collection.ObjectFloatMap) r0
            return r0
    }
}
