package androidx.collection;

/* JADX INFO: compiled from: SparseArrayCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a.\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\t\u001a\u0019\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0080\b\u001a!\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0080\b\u001a&\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\u000e\u001a'\u0010\u000f\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\u0010\u001a-\u0010\u000f\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u0002H\u0004H\u0000¢\u0006\u0002\u0010\u0012\u001a!\u0010\u0013\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0080\b\u001a&\u0010\u0014\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0080\b\u001a!\u0010\u0017\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u0007H\u0080\b\u001a.\u0010\u0019\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\t\u001a)\u0010\u001a\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00040\u0005H\u0080\b\u001a0\u0010\u001c\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\u0012\u001a \u0010\u001d\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a+\u0010\u001d\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0080\b\u001a!\u0010\u001e\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u0007H\u0080\b\u001a)\u0010\u001f\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0080\b\u001a0\u0010!\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\u0012\u001a6\u0010!\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\"\u001a\u0002H\u00042\u0006\u0010#\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010$\u001a.\u0010%\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\t\u001a\u0019\u0010&\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0080\b\u001a\u0019\u0010'\u001a\u00020(\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0080\b\u001a&\u0010)\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u0007H\u0080\b¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010*\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0002\u001a:\u0010+\u001a\u0002H,\"\u0004\b\u0000\u0010\u0004\"\n\b\u0001\u0010,*\u0004\u0018\u0001H\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u0002H,H\u0082\b¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"DELETED", "", "commonAppend", "", "E", "Landroidx/collection/SparseArrayCompat;", "key", "", "value", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)V", "commonClear", "commonContainsKey", "", "commonContainsValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)Z", "commonGet", "(Landroidx/collection/SparseArrayCompat;I)Ljava/lang/Object;", "defaultValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Ljava/lang/Object;", "commonIndexOfKey", "commonIndexOfValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)I", "commonIsEmpty", "commonKeyAt", "index", "commonPut", "commonPutAll", "other", "commonPutIfAbsent", "commonRemove", "commonRemoveAt", "commonRemoveAtRange", "size", "commonReplace", "oldValue", "newValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;Ljava/lang/Object;)Z", "commonSetValueAt", "commonSize", "commonToString", "", "commonValueAt", "gc", "internalGet", "T", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SparseArrayCompatKt {
    private static final java.lang.Object DELETED = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.collection.SparseArrayCompatKt.DELETED = r0
            return
    }

    public static final /* synthetic */ void access$gc(androidx.collection.SparseArrayCompat r0) {
            gc(r0)
            return
    }

    public static final /* synthetic */ java.lang.Object access$getDELETED$p() {
            java.lang.Object r0 = androidx.collection.SparseArrayCompatKt.DELETED
            return r0
    }

    public static final <E> void commonAppend(androidx.collection.SparseArrayCompat<E> r5, int r6, E r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            int r1 = r5.size
            if (r1 == 0) goto L18
            int[] r1 = r5.keys
            int r2 = r5.size
            int r2 = r2 + (-1)
            r1 = r1[r2]
            if (r6 > r1) goto L18
            r5.put(r6, r7)
            return
        L18:
            boolean r1 = r5.garbage
            if (r1 == 0) goto L26
            int r1 = r5.size
            int[] r2 = r5.keys
            int r2 = r2.length
            if (r1 < r2) goto L26
            access$gc(r5)
        L26:
            int r1 = r5.size
            int[] r2 = r5.keys
            int r2 = r2.length
            if (r1 < r2) goto L4b
            int r2 = r1 + 1
            int r2 = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(r2)
            int[] r3 = r5.keys
            int[] r3 = java.util.Arrays.copyOf(r3, r2)
            java.lang.String r4 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r5.keys = r3
            java.lang.Object[] r3 = r5.values
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r5.values = r3
        L4b:
            int[] r2 = r5.keys
            r2[r1] = r6
            java.lang.Object[] r2 = r5.values
            r2[r1] = r7
            int r2 = r1 + 1
            r5.size = r2
            return
    }

    public static final <E> void commonClear(androidx.collection.SparseArrayCompat<E> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            int r1 = r5.size
            java.lang.Object[] r2 = r5.values
            r3 = 0
        Lb:
            if (r3 >= r1) goto L13
            r4 = 0
            r2[r3] = r4
            int r3 = r3 + 1
            goto Lb
        L13:
            r3 = 0
            r5.size = r3
            r5.garbage = r3
            return
    }

    public static final <E> boolean commonContainsKey(androidx.collection.SparseArrayCompat<E> r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            int r1 = r2.indexOfKey(r3)
            if (r1 < 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public static final <E> boolean commonContainsValue(androidx.collection.SparseArrayCompat<E> r6, E r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = r6
            r2 = 0
            boolean r3 = r1.garbage
            if (r3 == 0) goto Lf
            access$gc(r1)
        Lf:
            r3 = 0
            int r4 = r1.size
        L12:
            if (r3 >= r4) goto L1e
            java.lang.Object[] r5 = r1.values
            r5 = r5[r3]
            if (r5 != r7) goto L1b
            goto L1f
        L1b:
            int r3 = r3 + 1
            goto L12
        L1e:
            r3 = -1
        L1f:
            if (r3 < 0) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            return r1
    }

    public static final <E> E commonGet(androidx.collection.SparseArrayCompat<E> r6, int r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = r6
            r2 = 0
            int[] r3 = r1.keys
            int r4 = r1.size
            int r3 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r3, r4, r7)
            if (r3 < 0) goto L20
            java.lang.Object[] r4 = r1.values
            r4 = r4[r3]
            java.lang.Object r5 = androidx.collection.SparseArrayCompatKt.DELETED
            if (r4 != r5) goto L1b
            goto L20
        L1b:
            java.lang.Object[] r4 = r1.values
            r4 = r4[r3]
            goto L21
        L20:
            r4 = r0
        L21:
            return r4
    }

    public static final <E> E commonGet(androidx.collection.SparseArrayCompat<E> r5, int r6, E r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r5
            r1 = 0
            int[] r2 = r0.keys
            int r3 = r0.size
            int r2 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r2, r3, r6)
            if (r2 < 0) goto L1f
            java.lang.Object[] r3 = r0.values
            r3 = r3[r2]
            java.lang.Object r4 = androidx.collection.SparseArrayCompatKt.DELETED
            if (r3 != r4) goto L1a
            goto L1f
        L1a:
            java.lang.Object[] r3 = r0.values
            r3 = r3[r2]
            goto L20
        L1f:
            r3 = r7
        L20:
            return r3
    }

    public static final <E> int commonIndexOfKey(androidx.collection.SparseArrayCompat<E> r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            boolean r1 = r3.garbage
            if (r1 == 0) goto Ld
            access$gc(r3)
        Ld:
            int[] r1 = r3.keys
            int r2 = r3.size
            int r1 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r1, r2, r4)
            return r1
    }

    public static final <E> int commonIndexOfValue(androidx.collection.SparseArrayCompat<E> r4, E r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            boolean r1 = r4.garbage
            if (r1 == 0) goto Ld
            access$gc(r4)
        Ld:
            r1 = 0
            int r2 = r4.size
        L10:
            if (r1 >= r2) goto L1c
            java.lang.Object[] r3 = r4.values
            r3 = r3[r1]
            if (r3 != r5) goto L19
            return r1
        L19:
            int r1 = r1 + 1
            goto L10
        L1c:
            r1 = -1
            return r1
    }

    public static final <E> boolean commonIsEmpty(androidx.collection.SparseArrayCompat<E> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            int r1 = r2.size()
            if (r1 != 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public static final <E> int commonKeyAt(androidx.collection.SparseArrayCompat<E> r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            boolean r1 = r2.garbage
            if (r1 == 0) goto Ld
            access$gc(r2)
        Ld:
            int[] r1 = r2.keys
            r1 = r1[r3]
            return r1
    }

    public static final <E> void commonPut(androidx.collection.SparseArrayCompat<E> r6, int r7, E r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            int[] r1 = r6.keys
            int r2 = r6.size
            int r1 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r1, r2, r7)
            if (r1 < 0) goto L16
            java.lang.Object[] r2 = r6.values
            r2[r1] = r8
            goto L97
        L16:
            int r1 = ~r1
            int r2 = r6.size
            if (r1 >= r2) goto L2e
            java.lang.Object[] r2 = r6.values
            r2 = r2[r1]
            java.lang.Object r3 = access$getDELETED$p()
            if (r2 != r3) goto L2e
            int[] r2 = r6.keys
            r2[r1] = r7
            java.lang.Object[] r2 = r6.values
            r2[r1] = r8
            return
        L2e:
            boolean r2 = r6.garbage
            if (r2 == 0) goto L45
            int r2 = r6.size
            int[] r3 = r6.keys
            int r3 = r3.length
            if (r2 < r3) goto L45
            access$gc(r6)
            int[] r2 = r6.keys
            int r3 = r6.size
            int r2 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r2, r3, r7)
            int r1 = ~r2
        L45:
            int r2 = r6.size
            int[] r3 = r6.keys
            int r3 = r3.length
            if (r2 < r3) goto L6c
            int r2 = r6.size
            int r2 = r2 + 1
            int r2 = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(r2)
            int[] r3 = r6.keys
            int[] r3 = java.util.Arrays.copyOf(r3, r2)
            java.lang.String r4 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r6.keys = r3
            java.lang.Object[] r3 = r6.values
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r6.values = r3
        L6c:
            int r2 = r6.size
            int r2 = r2 - r1
            if (r2 == 0) goto L89
            int[] r2 = r6.keys
            int[] r3 = r6.keys
            int r4 = r1 + 1
            int r5 = r6.size
            kotlin.collections.ArraysKt.copyInto(r2, r3, r4, r1, r5)
            java.lang.Object[] r2 = r6.values
            java.lang.Object[] r3 = r6.values
            int r4 = r1 + 1
            int r5 = r6.size
            kotlin.collections.ArraysKt.copyInto(r2, r3, r4, r1, r5)
        L89:
            int[] r2 = r6.keys
            r2[r1] = r7
            java.lang.Object[] r2 = r6.values
            r2[r1] = r8
            int r2 = r6.size
            int r2 = r2 + 1
            r6.size = r2
        L97:
            return
    }

    public static final <E> void commonPutAll(androidx.collection.SparseArrayCompat<E> r12, androidx.collection.SparseArrayCompat<? extends E> r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 0
            r1 = 0
            int r2 = r13.size()
        L10:
            if (r1 >= r2) goto Lb2
            int r3 = r13.keyAt(r1)
            java.lang.Object r4 = r13.valueAt(r1)
            r5 = r12
            r6 = 0
            int[] r7 = r5.keys
            int r8 = r5.size
            int r7 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r7, r8, r3)
            if (r7 < 0) goto L2c
            java.lang.Object[] r8 = r5.values
            r8[r7] = r4
            goto Lad
        L2c:
            int r7 = ~r7
            int r8 = r5.size
            if (r7 >= r8) goto L44
            java.lang.Object[] r8 = r5.values
            r8 = r8[r7]
            java.lang.Object r9 = access$getDELETED$p()
            if (r8 != r9) goto L44
            int[] r8 = r5.keys
            r8[r7] = r3
            java.lang.Object[] r8 = r5.values
            r8[r7] = r4
            goto Lae
        L44:
            boolean r8 = r5.garbage
            if (r8 == 0) goto L5b
            int r8 = r5.size
            int[] r9 = r5.keys
            int r9 = r9.length
            if (r8 < r9) goto L5b
            access$gc(r5)
            int[] r8 = r5.keys
            int r9 = r5.size
            int r8 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r8, r9, r3)
            int r7 = ~r8
        L5b:
            int r8 = r5.size
            int[] r9 = r5.keys
            int r9 = r9.length
            if (r8 < r9) goto L82
            int r8 = r5.size
            int r8 = r8 + 1
            int r8 = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(r8)
            int[] r9 = r5.keys
            int[] r9 = java.util.Arrays.copyOf(r9, r8)
            java.lang.String r10 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            r5.keys = r9
            java.lang.Object[] r9 = r5.values
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            r5.values = r9
        L82:
            int r8 = r5.size
            int r8 = r8 - r7
            if (r8 == 0) goto L9f
            int[] r8 = r5.keys
            int[] r9 = r5.keys
            int r10 = r7 + 1
            int r11 = r5.size
            kotlin.collections.ArraysKt.copyInto(r8, r9, r10, r7, r11)
            java.lang.Object[] r8 = r5.values
            java.lang.Object[] r9 = r5.values
            int r10 = r7 + 1
            int r11 = r5.size
            kotlin.collections.ArraysKt.copyInto(r8, r9, r10, r7, r11)
        L9f:
            int[] r8 = r5.keys
            r8[r7] = r3
            java.lang.Object[] r8 = r5.values
            r8[r7] = r4
            int r8 = r5.size
            int r8 = r8 + 1
            r5.size = r8
        Lad:
        Lae:
            int r1 = r1 + 1
            goto L10
        Lb2:
            return
    }

    public static final <E> E commonPutIfAbsent(androidx.collection.SparseArrayCompat<E> r9, int r10, E r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            java.lang.Object r1 = commonGet(r9, r10)
            if (r1 != 0) goto La0
            r2 = r9
            r3 = 0
            int[] r4 = r2.keys
            int r5 = r2.size
            int r4 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r4, r5, r10)
            if (r4 < 0) goto L1e
            java.lang.Object[] r5 = r2.values
            r5[r4] = r11
            goto L9f
        L1e:
            int r4 = ~r4
            int r5 = r2.size
            if (r4 >= r5) goto L36
            java.lang.Object[] r5 = r2.values
            r5 = r5[r4]
            java.lang.Object r6 = access$getDELETED$p()
            if (r5 != r6) goto L36
            int[] r5 = r2.keys
            r5[r4] = r10
            java.lang.Object[] r5 = r2.values
            r5[r4] = r11
            goto La0
        L36:
            boolean r5 = r2.garbage
            if (r5 == 0) goto L4d
            int r5 = r2.size
            int[] r6 = r2.keys
            int r6 = r6.length
            if (r5 < r6) goto L4d
            access$gc(r2)
            int[] r5 = r2.keys
            int r6 = r2.size
            int r5 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r5, r6, r10)
            int r4 = ~r5
        L4d:
            int r5 = r2.size
            int[] r6 = r2.keys
            int r6 = r6.length
            if (r5 < r6) goto L74
            int r5 = r2.size
            int r5 = r5 + 1
            int r5 = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(r5)
            int[] r6 = r2.keys
            int[] r6 = java.util.Arrays.copyOf(r6, r5)
            java.lang.String r7 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r2.keys = r6
            java.lang.Object[] r6 = r2.values
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r2.values = r6
        L74:
            int r5 = r2.size
            int r5 = r5 - r4
            if (r5 == 0) goto L91
            int[] r5 = r2.keys
            int[] r6 = r2.keys
            int r7 = r4 + 1
            int r8 = r2.size
            kotlin.collections.ArraysKt.copyInto(r5, r6, r7, r4, r8)
            java.lang.Object[] r5 = r2.values
            java.lang.Object[] r6 = r2.values
            int r7 = r4 + 1
            int r8 = r2.size
            kotlin.collections.ArraysKt.copyInto(r5, r6, r7, r4, r8)
        L91:
            int[] r5 = r2.keys
            r5[r4] = r10
            java.lang.Object[] r5 = r2.values
            r5[r4] = r11
            int r5 = r2.size
            int r5 = r5 + 1
            r2.size = r5
        L9f:
        La0:
            return r1
    }

    public static final <E> void commonRemove(androidx.collection.SparseArrayCompat<E> r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int[] r0 = r3.keys
            int r1 = r3.size
            int r0 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r4)
            if (r0 < 0) goto L20
            java.lang.Object[] r1 = r3.values
            r1 = r1[r0]
            java.lang.Object r2 = androidx.collection.SparseArrayCompatKt.DELETED
            if (r1 == r2) goto L20
            java.lang.Object[] r1 = r3.values
            java.lang.Object r2 = androidx.collection.SparseArrayCompatKt.DELETED
            r1[r0] = r2
            r1 = 1
            r3.garbage = r1
        L20:
            return
    }

    public static final <E> boolean commonRemove(androidx.collection.SparseArrayCompat<E> r4, int r5, java.lang.Object r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            int r1 = r4.indexOfKey(r5)
            if (r1 < 0) goto L1b
            java.lang.Object r2 = r4.valueAt(r1)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r2)
            if (r3 == 0) goto L1b
            r4.removeAt(r1)
            r3 = 1
            return r3
        L1b:
            r2 = 0
            return r2
    }

    public static final <E> void commonRemoveAt(androidx.collection.SparseArrayCompat<E> r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            java.lang.Object[] r1 = r3.values
            r1 = r1[r4]
            java.lang.Object r2 = access$getDELETED$p()
            if (r1 == r2) goto L1b
            java.lang.Object[] r1 = r3.values
            java.lang.Object r2 = access$getDELETED$p()
            r1[r4] = r2
            r1 = 1
            r3.garbage = r1
        L1b:
            return
    }

    public static final <E> void commonRemoveAtRange(androidx.collection.SparseArrayCompat<E> r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r4 + r5
            int r1 = java.lang.Math.min(r5, r1)
            r2 = r4
        Ld:
            if (r2 >= r1) goto L15
            r3.removeAt(r2)
            int r2 = r2 + 1
            goto Ld
        L15:
            return
    }

    public static final <E> E commonReplace(androidx.collection.SparseArrayCompat<E> r4, int r5, E r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            int r1 = r4.indexOfKey(r5)
            if (r1 < 0) goto L15
            java.lang.Object[] r2 = r4.values
            r2 = r2[r1]
            java.lang.Object[] r3 = r4.values
            r3[r1] = r6
            return r2
        L15:
            r2 = 0
            return r2
    }

    public static final <E> boolean commonReplace(androidx.collection.SparseArrayCompat<E> r4, int r5, E r6, E r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            int r1 = r4.indexOfKey(r5)
            if (r1 < 0) goto L1c
            java.lang.Object[] r2 = r4.values
            r2 = r2[r1]
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r6)
            if (r3 == 0) goto L1c
            java.lang.Object[] r3 = r4.values
            r3[r1] = r7
            r3 = 1
            return r3
        L1c:
            r2 = 0
            return r2
    }

    public static final <E> void commonSetValueAt(androidx.collection.SparseArrayCompat<E> r2, int r3, E r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            boolean r1 = r2.garbage
            if (r1 == 0) goto Ld
            access$gc(r2)
        Ld:
            java.lang.Object[] r1 = r2.values
            r1[r3] = r4
            return
    }

    public static final <E> int commonSize(androidx.collection.SparseArrayCompat<E> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            boolean r1 = r2.garbage
            if (r1 == 0) goto Ld
            access$gc(r2)
        Ld:
            int r1 = r2.size
            return r1
    }

    public static final <E> java.lang.String commonToString(androidx.collection.SparseArrayCompat<E> r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            int r1 = r7.size()
            if (r1 > 0) goto Lf
            java.lang.String r1 = "{}"
            return r1
        Lf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r7.size
            int r2 = r2 * 28
            r1.<init>(r2)
            r2 = 123(0x7b, float:1.72E-43)
            r1.append(r2)
            r2 = 0
            int r3 = r7.size
        L20:
            if (r2 >= r3) goto L47
            if (r2 <= 0) goto L29
            java.lang.String r4 = ", "
            r1.append(r4)
        L29:
            int r4 = r7.keyAt(r2)
            r1.append(r4)
            r5 = 61
            r1.append(r5)
            java.lang.Object r5 = r7.valueAt(r2)
            if (r5 == r7) goto L3f
            r1.append(r5)
            goto L44
        L3f:
            java.lang.String r6 = "(this Map)"
            r1.append(r6)
        L44:
            int r2 = r2 + 1
            goto L20
        L47:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            java.lang.String r3 = "buffer.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    public static final <E> E commonValueAt(androidx.collection.SparseArrayCompat<E> r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            boolean r1 = r2.garbage
            if (r1 == 0) goto Ld
            access$gc(r2)
        Ld:
            java.lang.Object[] r1 = r2.values
            r1 = r1[r3]
            return r1
    }

    private static final <E> void gc(androidx.collection.SparseArrayCompat<E> r7) {
            int r0 = r7.size
            r1 = 0
            int[] r2 = r7.keys
            java.lang.Object[] r3 = r7.values
            r4 = 0
        L8:
            if (r4 >= r0) goto L20
            r5 = r3[r4]
            java.lang.Object r6 = androidx.collection.SparseArrayCompatKt.DELETED
            if (r5 == r6) goto L1d
            if (r4 == r1) goto L1b
            r6 = r2[r4]
            r2[r1] = r6
            r3[r1] = r5
            r6 = 0
            r3[r4] = r6
        L1b:
            int r1 = r1 + 1
        L1d:
            int r4 = r4 + 1
            goto L8
        L20:
            r4 = 0
            r7.garbage = r4
            r7.size = r1
            return
    }

    private static final <E, T extends E> T internalGet(androidx.collection.SparseArrayCompat<E> r4, int r5, T r6) {
            r0 = 0
            int[] r1 = r4.keys
            int r2 = r4.size
            int r1 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r1, r2, r5)
            if (r1 < 0) goto L19
            java.lang.Object[] r2 = r4.values
            r2 = r2[r1]
            java.lang.Object r3 = androidx.collection.SparseArrayCompatKt.DELETED
            if (r2 != r3) goto L14
            goto L19
        L14:
            java.lang.Object[] r2 = r4.values
            r2 = r2[r1]
            goto L1a
        L19:
            r2 = r6
        L1a:
            return r2
    }
}
