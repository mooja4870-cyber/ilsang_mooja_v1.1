package androidx.collection;

/* JADX INFO: compiled from: SimpleArrayMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B!\b\u0016\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0002\u0010\u0005B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\u0013\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0018\u0010\u001b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001cJ\u001f\u0010\u001d\u001a\u00028\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001fJ,\u0010 \u001a\u0002H!\"\n\b\u0002\u0010!*\u0004\u0018\u00018\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001e\u001a\u0002H!H\u0082\b¢\u0006\u0002\u0010\u001fJ\b\u0010\"\u001a\u00020\u0007H\u0016J\u001d\u0010#\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010%J\u0015\u0010&\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0007H\u0002J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00028\u0001H\u0001¢\u0006\u0004\b*\u0010'J\b\u0010+\u001a\u00020\u0012H\u0016J\u0015\u0010,\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010.J\u001f\u0010/\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001fJ \u00100\u001a\u00020\u00102\u0016\u0010\u0004\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000H\u0016J\u001f\u00101\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001fJ\u0017\u00102\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u001d\u00102\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00103J\u0015\u00104\u001a\u00028\u00012\u0006\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010.J\u001f\u00105\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001fJ%\u00105\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u00106\u001a\u00028\u00012\u0006\u00107\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00108J\u001d\u00109\u001a\u00028\u00012\u0006\u0010-\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010:J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010;\u001a\u00020<H\u0016J\u0015\u0010=\u001a\u00028\u00012\u0006\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010.R\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Landroidx/collection/SimpleArrayMap;", "K", "V", "", "map", "(Landroidx/collection/SimpleArrayMap;)V", "capacity", "", "(I)V", "array", "", "[Ljava/lang/Object;", "hashes", "", "size", "clear", "", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "ensureCapacity", "minimumCapacity", "equals", "other", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrDefault", "defaultValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getOrDefaultInternal", "T", "hashCode", "indexOf", "hash", "(Ljava/lang/Object;I)I", "indexOfKey", "(Ljava/lang/Object;)I", "indexOfNull", "indexOfValue", "__restricted$indexOfValue", "isEmpty", "keyAt", "index", "(I)Ljava/lang/Object;", "put", "putAll", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeAt", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "(ILjava/lang/Object;)Ljava/lang/Object;", "toString", "", "valueAt", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class SimpleArrayMap<K, V> {
    private java.lang.Object[] array;
    private int[] hashes;
    private int size;

    public SimpleArrayMap() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public SimpleArrayMap(int r2) {
            r1 = this;
            r1.<init>()
            if (r2 != 0) goto L9
            int[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_INTS
            goto Lb
        L9:
            int[] r0 = new int[r2]
        Lb:
            r1.hashes = r0
            if (r2 != 0) goto L13
            java.lang.Object[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS
            goto L17
        L13:
            int r0 = r2 << 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
        L17:
            r1.array = r0
            return
    }

    public /* synthetic */ SimpleArrayMap(int r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.<init>(r1)
            return
    }

    public SimpleArrayMap(androidx.collection.SimpleArrayMap<? extends K, ? extends V> r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            if (r4 == 0) goto Lb
            r3.putAll(r4)
        Lb:
            return
    }

    private final <T extends V> T getOrDefaultInternal(java.lang.Object r5, T r6) {
            r4 = this;
            r0 = 0
            int r1 = r4.indexOfKey(r5)
            if (r1 < 0) goto L11
            java.lang.Object[] r2 = r4.array
            int r3 = r1 << 1
            int r3 = r3 + 1
            r2 = r2[r3]
            goto L12
        L11:
            r2 = r6
        L12:
            return r2
    }

    private final int indexOf(K r7, int r8) {
            r6 = this;
            int r0 = r6.size
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            int[] r1 = r6.hashes
            int r1 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r1, r0, r8)
            if (r1 >= 0) goto Lf
            return r1
        Lf:
            java.lang.Object[] r2 = r6.array
            int r3 = r1 << 1
            r2 = r2[r3]
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r2)
            if (r2 == 0) goto L1c
            return r1
        L1c:
            int r2 = r1 + 1
        L1e:
            if (r2 >= r0) goto L36
            int[] r3 = r6.hashes
            r3 = r3[r2]
            if (r3 != r8) goto L36
            java.lang.Object[] r3 = r6.array
            int r4 = r2 << 1
            r3 = r3[r4]
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r3)
            if (r3 == 0) goto L33
            return r2
        L33:
            int r2 = r2 + 1
            goto L1e
        L36:
            int r3 = r1 + (-1)
        L38:
            if (r3 < 0) goto L50
            int[] r4 = r6.hashes
            r4 = r4[r3]
            if (r4 != r8) goto L50
            java.lang.Object[] r4 = r6.array
            int r5 = r3 << 1
            r4 = r4[r5]
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r4)
            if (r4 == 0) goto L4d
            return r3
        L4d:
            int r3 = r3 + (-1)
            goto L38
        L50:
            int r4 = ~r2
            return r4
    }

    private final int indexOfNull() {
            r6 = this;
            int r0 = r6.size
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            int[] r1 = r6.hashes
            r2 = 0
            int r1 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r1, r0, r2)
            if (r1 >= 0) goto L10
            return r1
        L10:
            java.lang.Object[] r2 = r6.array
            int r3 = r1 << 1
            r2 = r2[r3]
            if (r2 != 0) goto L19
            return r1
        L19:
            int r2 = r1 + 1
        L1b:
            if (r2 >= r0) goto L2f
            int[] r3 = r6.hashes
            r3 = r3[r2]
            if (r3 != 0) goto L2f
            java.lang.Object[] r3 = r6.array
            int r4 = r2 << 1
            r3 = r3[r4]
            if (r3 != 0) goto L2c
            return r2
        L2c:
            int r2 = r2 + 1
            goto L1b
        L2f:
            int r3 = r1 + (-1)
        L31:
            if (r3 < 0) goto L45
            int[] r4 = r6.hashes
            r4 = r4[r3]
            if (r4 != 0) goto L45
            java.lang.Object[] r4 = r6.array
            int r5 = r3 << 1
            r4 = r4[r5]
            if (r4 != 0) goto L42
            return r3
        L42:
            int r3 = r3 + (-1)
            goto L31
        L45:
            int r4 = ~r2
            return r4
    }

    public final int __restricted$indexOfValue(V r5) {
            r4 = this;
            int r0 = r4.size
            int r0 = r0 * 2
            java.lang.Object[] r1 = r4.array
            if (r5 != 0) goto L15
            r2 = 1
        L9:
            if (r2 >= r0) goto L26
            r3 = r1[r2]
            if (r3 != 0) goto L12
            int r3 = r2 >> 1
            return r3
        L12:
            int r2 = r2 + 2
            goto L9
        L15:
            r2 = 1
        L16:
            if (r2 >= r0) goto L26
            r3 = r1[r2]
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r3)
            if (r3 == 0) goto L23
            int r3 = r2 >> 1
            return r3
        L23:
            int r2 = r2 + 2
            goto L16
        L26:
            r2 = -1
            return r2
    }

    public void clear() {
            r1 = this;
            int r0 = r1.size
            if (r0 <= 0) goto Lf
            int[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_INTS
            r1.hashes = r0
            java.lang.Object[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS
            r1.array = r0
            r0 = 0
            r1.size = r0
        Lf:
            int r0 = r1.size
            if (r0 > 0) goto L14
            return
        L14:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    public boolean containsKey(K r2) {
            r1 = this;
            int r0 = r1.indexOfKey(r2)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean containsValue(V r2) {
            r1 = this;
            int r0 = r1.__restricted$indexOfValue(r2)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public void ensureCapacity(int r5) {
            r4 = this;
            int r0 = r4.size
            int[] r1 = r4.hashes
            int r1 = r1.length
            if (r1 >= r5) goto L21
            int[] r1 = r4.hashes
            int[] r1 = java.util.Arrays.copyOf(r1, r5)
            java.lang.String r2 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r4.hashes = r1
            java.lang.Object[] r1 = r4.array
            int r3 = r5 * 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r4.array = r1
        L21:
            int r1 = r4.size
            if (r1 != r0) goto L26
            return
        L26:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    public boolean equals(java.lang.Object r10) {
            r9 = this;
            r0 = 1
            if (r9 != r10) goto L4
            return r0
        L4:
            r1 = 0
            boolean r2 = r10 instanceof androidx.collection.SimpleArrayMap     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            if (r2 == 0) goto L42
            int r2 = r9.size()     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            r3 = r10
            androidx.collection.SimpleArrayMap r3 = (androidx.collection.SimpleArrayMap) r3     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            int r3 = r3.size()     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            if (r2 == r3) goto L18
            return r1
        L18:
            r2 = r10
            androidx.collection.SimpleArrayMap r2 = (androidx.collection.SimpleArrayMap) r2     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            r3 = 0
            int r4 = r9.size     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
        L1e:
            if (r3 >= r4) goto L41
            java.lang.Object r5 = r9.keyAt(r3)     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            java.lang.Object r6 = r9.valueAt(r3)     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            java.lang.Object r7 = r2.get(r5)     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            if (r6 != 0) goto L37
            if (r7 != 0) goto L36
            boolean r8 = r2.containsKey(r5)     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            if (r8 != 0) goto L3e
        L36:
            return r1
        L37:
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            if (r8 != 0) goto L3e
            return r1
        L3e:
            int r3 = r3 + 1
            goto L1e
        L41:
            return r0
        L42:
            boolean r2 = r10 instanceof java.util.Map     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            if (r2 == 0) goto L84
            int r2 = r9.size()     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            r3 = r10
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            int r3 = r3.size()     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            if (r2 == r3) goto L54
            return r1
        L54:
            r2 = 0
            int r3 = r9.size     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
        L57:
            if (r2 >= r3) goto L80
            java.lang.Object r4 = r9.keyAt(r2)     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            java.lang.Object r5 = r9.valueAt(r2)     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            r6 = r10
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            java.lang.Object r6 = r6.get(r4)     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            if (r5 != 0) goto L76
            if (r6 != 0) goto L75
            r7 = r10
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            boolean r7 = r7.containsKey(r4)     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            if (r7 != 0) goto L7d
        L75:
            return r1
        L76:
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)     // Catch: java.lang.ClassCastException -> L81 java.lang.NullPointerException -> L83
            if (r7 != 0) goto L7d
            return r1
        L7d:
            int r2 = r2 + 1
            goto L57
        L80:
            return r0
        L81:
            r0 = move-exception
            goto L84
        L83:
            r0 = move-exception
        L84:
            return r1
    }

    public V get(K r7) {
            r6 = this;
            r0 = 0
            r1 = r6
            r2 = 0
            int r3 = r1.indexOfKey(r7)
            if (r3 < 0) goto L13
            java.lang.Object[] r4 = r1.array
            int r5 = r3 << 1
            int r5 = r5 + 1
            r4 = r4[r5]
            goto L14
        L13:
            r4 = r0
        L14:
            return r4
    }

    public V getOrDefault(java.lang.Object r6, V r7) {
            r5 = this;
            r0 = r5
            r1 = 0
            int r2 = r0.indexOfKey(r6)
            if (r2 < 0) goto L12
            java.lang.Object[] r3 = r0.array
            int r4 = r2 << 1
            int r4 = r4 + 1
            r3 = r3[r4]
            goto L13
        L12:
            r3 = r7
        L13:
            return r3
    }

    public int hashCode() {
            r9 = this;
            int[] r0 = r9.hashes
            java.lang.Object[] r1 = r9.array
            r2 = 0
            r3 = 0
            r4 = 1
            int r5 = r9.size
        L9:
            if (r3 >= r5) goto L1f
            r6 = r1[r4]
            r7 = r0[r3]
            if (r6 == 0) goto L16
            int r8 = r6.hashCode()
            goto L17
        L16:
            r8 = 0
        L17:
            r7 = r7 ^ r8
            int r2 = r2 + r7
            int r3 = r3 + 1
            int r4 = r4 + 2
            goto L9
        L1f:
            return r2
    }

    public int indexOfKey(K r2) {
            r1 = this;
            if (r2 != 0) goto L8
            int r0 = r1.indexOfNull()
            goto L10
        L8:
            int r0 = r2.hashCode()
            int r0 = r1.indexOf(r2, r0)
        L10:
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size
            if (r0 > 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public K keyAt(int r4) {
            r3 = this;
            r0 = 0
            if (r4 < 0) goto L8
            int r1 = r3.size
            if (r4 >= r1) goto L8
            r0 = 1
        L8:
            if (r0 == 0) goto L11
            java.lang.Object[] r0 = r3.array
            int r1 = r4 << 1
            r0 = r0[r1]
            return r0
        L11:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected index to be within 0..size()-1, but was "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public V put(K r9, V r10) {
            r8 = this;
            int r0 = r8.size
            if (r9 == 0) goto L9
            int r1 = r9.hashCode()
            goto La
        L9:
            r1 = 0
        La:
            if (r9 == 0) goto L13
            r2 = r9
            r3 = 0
            int r2 = r8.indexOf(r2, r1)
            goto L17
        L13:
            int r2 = r8.indexOfNull()
        L17:
            if (r2 < 0) goto L26
            int r3 = r2 << 1
            int r3 = r3 + 1
            java.lang.Object[] r2 = r8.array
            r2 = r2[r3]
            java.lang.Object[] r4 = r8.array
            r4[r3] = r10
            return r2
        L26:
            int r2 = ~r2
            int[] r3 = r8.hashes
            int r3 = r3.length
            if (r0 < r3) goto L61
        L2d:
            r3 = 8
            if (r0 < r3) goto L35
            int r3 = r0 >> 1
            int r3 = r3 + r0
            goto L3a
        L35:
            r4 = 4
            if (r0 < r4) goto L39
            goto L3a
        L39:
            r3 = r4
        L3a:
            int[] r4 = r8.hashes
            int[] r4 = java.util.Arrays.copyOf(r4, r3)
            java.lang.String r5 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r8.hashes = r4
            java.lang.Object[] r4 = r8.array
            int r6 = r3 << 1
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r8.array = r4
            int r4 = r8.size
            if (r0 != r4) goto L5b
            goto L61
        L5b:
            java.util.ConcurrentModificationException r4 = new java.util.ConcurrentModificationException
            r4.<init>()
            throw r4
        L61:
            if (r2 >= r0) goto L7e
        L64:
            int[] r3 = r8.hashes
            int[] r4 = r8.hashes
            int r5 = r2 + 1
            kotlin.collections.ArraysKt.copyInto(r3, r4, r5, r2, r0)
            java.lang.Object[] r3 = r8.array
            java.lang.Object[] r4 = r8.array
            int r5 = r2 + 1
            int r5 = r5 << 1
            int r6 = r2 << 1
            int r7 = r8.size
            int r7 = r7 << 1
            kotlin.collections.ArraysKt.copyInto(r3, r4, r5, r6, r7)
        L7e:
            int r3 = r8.size
            if (r0 != r3) goto La1
            int[] r3 = r8.hashes
            int r3 = r3.length
            if (r2 >= r3) goto La1
            int[] r3 = r8.hashes
            r3[r2] = r1
            java.lang.Object[] r3 = r8.array
            int r4 = r2 << 1
            r3[r4] = r9
            java.lang.Object[] r3 = r8.array
            int r4 = r2 << 1
            int r4 = r4 + 1
            r3[r4] = r10
            int r3 = r8.size
            int r3 = r3 + 1
            r8.size = r3
            r3 = 0
            return r3
        La1:
            java.util.ConcurrentModificationException r3 = new java.util.ConcurrentModificationException
            r3.<init>()
            throw r3
    }

    public void putAll(androidx.collection.SimpleArrayMap<? extends K, ? extends V> r6) {
            r5 = this;
            java.lang.String r0 = "map"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r6.size
            int r1 = r5.size
            int r1 = r1 + r0
            r5.ensureCapacity(r1)
            int r1 = r5.size
            if (r1 != 0) goto L2c
            if (r0 <= 0) goto L3d
            int[] r1 = r6.hashes
            int[] r2 = r5.hashes
            r3 = 0
            kotlin.collections.ArraysKt.copyInto(r1, r2, r3, r3, r0)
            java.lang.Object[] r1 = r6.array
            java.lang.Object[] r2 = r5.array
            int r4 = r0 << 1
            kotlin.collections.ArraysKt.copyInto(r1, r2, r3, r3, r4)
            r5.size = r0
            goto L3d
        L2c:
            r1 = 0
        L2d:
            if (r1 >= r0) goto L3d
            java.lang.Object r2 = r6.keyAt(r1)
            java.lang.Object r3 = r6.valueAt(r1)
            r5.put(r2, r3)
            int r1 = r1 + 1
            goto L2d
        L3d:
            return
    }

    public V putIfAbsent(K r2, V r3) {
            r1 = this;
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto La
            java.lang.Object r0 = r1.put(r2, r3)
        La:
            return r0
    }

    public V remove(K r3) {
            r2 = this;
            int r0 = r2.indexOfKey(r3)
            if (r0 < 0) goto Lb
            java.lang.Object r1 = r2.removeAt(r0)
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
    }

    public boolean remove(K r4, V r5) {
            r3 = this;
            int r0 = r3.indexOfKey(r4)
            if (r0 < 0) goto L15
            java.lang.Object r1 = r3.valueAt(r0)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r1)
            if (r2 == 0) goto L15
            r3.removeAt(r0)
            r2 = 1
            return r2
        L15:
            r1 = 0
            return r1
    }

    public V removeAt(int r12) {
            r11 = this;
            r0 = 0
            r1 = 1
            if (r12 < 0) goto La
            int r2 = r11.size
            if (r12 >= r2) goto La
            r2 = r1
            goto Lb
        La:
            r2 = r0
        Lb:
            if (r2 == 0) goto Lce
            java.lang.Object[] r2 = r11.array
            int r3 = r12 << 1
            int r3 = r3 + r1
            r2 = r2[r3]
            int r3 = r11.size
            if (r3 > r1) goto L1e
        L19:
            r11.clear()
            goto Lc7
        L1e:
            int r4 = r3 + (-1)
            int[] r5 = r11.hashes
            int r5 = r5.length
            r6 = 8
            if (r5 <= r6) goto L95
            int[] r5 = r11.hashes
            int r5 = r5.length
            int r5 = r5 / 3
            if (r3 >= r5) goto L95
        L2f:
            if (r3 <= r6) goto L36
            int r5 = r3 >> 1
            int r6 = r3 + r5
            goto L37
        L36:
        L37:
            int[] r5 = r11.hashes
            java.lang.Object[] r7 = r11.array
            int[] r8 = r11.hashes
            int[] r8 = java.util.Arrays.copyOf(r8, r6)
            java.lang.String r9 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            r11.hashes = r8
            java.lang.Object[] r8 = r11.array
            int r10 = r6 << 1
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r10)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            r11.array = r8
            int r8 = r11.size
            if (r3 != r8) goto L8f
            if (r12 <= 0) goto L71
        L5f:
            int[] r8 = r11.hashes
            kotlin.collections.ArraysKt.copyInto(r5, r8, r0, r0, r12)
            java.lang.Object[] r8 = r11.array
            int r9 = r12 << 1
            kotlin.collections.ArraysKt.copyInto(r7, r8, r0, r0, r9)
        L71:
            if (r12 >= r4) goto Lc1
        L75:
            int[] r0 = r11.hashes
            int r8 = r12 + 1
            int r9 = r4 + 1
            kotlin.collections.ArraysKt.copyInto(r5, r0, r12, r8, r9)
            java.lang.Object[] r0 = r11.array
            int r8 = r12 << 1
            int r9 = r12 + 1
            int r9 = r9 << r1
            int r10 = r4 + 1
            int r1 = r10 << 1
            kotlin.collections.ArraysKt.copyInto(r7, r0, r8, r9, r1)
            goto Lc1
        L8f:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
        L95:
            if (r12 >= r4) goto Lb3
        L98:
            int[] r0 = r11.hashes
            int[] r5 = r11.hashes
            int r6 = r12 + 1
            int r7 = r4 + 1
            kotlin.collections.ArraysKt.copyInto(r0, r5, r12, r6, r7)
            java.lang.Object[] r0 = r11.array
            java.lang.Object[] r5 = r11.array
            int r6 = r12 << 1
            int r7 = r12 + 1
            int r7 = r7 << r1
            int r8 = r4 + 1
            int r8 = r8 << r1
            kotlin.collections.ArraysKt.copyInto(r0, r5, r6, r7, r8)
        Lb3:
            java.lang.Object[] r0 = r11.array
            int r5 = r4 << 1
            r6 = 0
            r0[r5] = r6
            java.lang.Object[] r0 = r11.array
            int r5 = r4 << 1
            int r5 = r5 + r1
            r0[r5] = r6
        Lc1:
            int r0 = r11.size
            if (r3 != r0) goto Lc8
            r11.size = r4
        Lc7:
            return r2
        Lc8:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
        Lce:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected index to be within 0..size()-1, but was "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public V replace(K r3, V r4) {
            r2 = this;
            int r0 = r2.indexOfKey(r3)
            if (r0 < 0) goto Lc
            java.lang.Object r1 = r2.setValueAt(r0, r4)
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    public boolean replace(K r4, V r5, V r6) {
            r3 = this;
            int r0 = r3.indexOfKey(r4)
            if (r0 < 0) goto L15
            java.lang.Object r1 = r3.valueAt(r0)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r1)
            if (r2 == 0) goto L15
            r3.setValueAt(r0, r6)
            r2 = 1
            return r2
        L15:
            r1 = 0
            return r1
    }

    public V setValueAt(int r4, V r5) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 < 0) goto L9
            int r2 = r3.size
            if (r4 >= r2) goto L9
            r0 = r1
        L9:
            if (r0 == 0) goto L17
            int r0 = r4 << 1
            int r0 = r0 + r1
            java.lang.Object[] r1 = r3.array
            r1 = r1[r0]
            java.lang.Object[] r2 = r3.array
            r2[r0] = r5
            return r1
        L17:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected index to be within 0..size()-1, but was "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    public java.lang.String toString() {
            r8 = this;
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            int r0 = r8.size
            int r0 = r0 * 28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = r1
            r2 = 0
            r3 = 123(0x7b, float:1.72E-43)
            r0.append(r3)
            r3 = 0
            int r4 = r8.size
        L1c:
            if (r3 >= r4) goto L49
            if (r3 <= 0) goto L25
            java.lang.String r5 = ", "
            r0.append(r5)
        L25:
            java.lang.Object r5 = r8.keyAt(r3)
            java.lang.String r6 = "(this Map)"
            if (r5 == r0) goto L31
            r0.append(r5)
            goto L34
        L31:
            r0.append(r6)
        L34:
            r7 = 61
            r0.append(r7)
            java.lang.Object r7 = r8.valueAt(r3)
            if (r7 == r0) goto L43
            r0.append(r7)
            goto L46
        L43:
            r0.append(r6)
        L46:
            int r3 = r3 + 1
            goto L1c
        L49:
            r3 = 125(0x7d, float:1.75E-43)
            r0.append(r3)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public V valueAt(int r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 < 0) goto L9
            int r2 = r3.size
            if (r4 >= r2) goto L9
            r0 = r1
        L9:
            if (r0 == 0) goto L13
            java.lang.Object[] r0 = r3.array
            int r2 = r4 << 1
            int r2 = r2 + r1
            r0 = r0[r2]
            return r0
        L13:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected index to be within 0..size()-1, but was "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }
}
