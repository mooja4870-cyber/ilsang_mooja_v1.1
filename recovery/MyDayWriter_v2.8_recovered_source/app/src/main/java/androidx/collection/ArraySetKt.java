package androidx.collection;

/* JADX INFO: compiled from: ArraySet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004H\u0086\b\u001a+\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00040\u0006\"\u0002H\u0004¢\u0006\u0002\u0010\u0007\u001a)\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0003H\u0080\b\u001a'\u0010\b\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\u0080\b\u001a&\u0010\u000f\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u0010\u001a\u0002H\nH\u0080\b¢\u0006\u0002\u0010\u0011\u001a \u0010\u0012\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u0013\u001a\u00020\u0001H\u0000\u001a \u0010\u0014\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u0015\u001a\u00020\u0001H\u0000\u001a\u0019\u0010\u0016\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0003H\u0080\b\u001a'\u0010\u0017\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\u0080\b\u001a&\u0010\u0018\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u0010\u001a\u0002H\nH\u0080\b¢\u0006\u0002\u0010\u0011\u001a!\u0010\u0019\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u001a\u001a\u00020\u0001H\u0080\b\u001a#\u0010\u001b\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0080\b\u001a\u0019\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0003H\u0080\b\u001a*\u0010\u001f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0015\u001a\u00020\u0001H\u0000\u001a#\u0010!\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001dH\u0080\b\u001a\u0018\u0010\"\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0003H\u0000\u001a\u0019\u0010#\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0003H\u0080\b\u001a)\u0010$\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0003H\u0080\b\u001a'\u0010$\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\u0080\b\u001a&\u0010%\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010&\u001a\u00020\u0001H\u0080\b¢\u0006\u0002\u0010'\u001a&\u0010(\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u0010\u001a\u0002H\nH\u0080\b¢\u0006\u0002\u0010\u0011\u001a'\u0010)\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\u0080\b\u001a\u0019\u0010*\u001a\u00020+\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0003H\u0080\b\u001a&\u0010,\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010&\u001a\u00020\u0001H\u0080\b¢\u0006\u0002\u0010'\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"ARRAY_SET_BASE_SIZE", "", "arraySetOf", "Landroidx/collection/ArraySet;", "T", "values", "", "([Ljava/lang/Object;)Landroidx/collection/ArraySet;", "addAllInternal", "", "E", "array", "", "elements", "", "addInternal", "element", "(Landroidx/collection/ArraySet;Ljava/lang/Object;)Z", "allocArrays", "size", "binarySearchInternal", "hash", "clearInternal", "containsAllInternal", "containsInternal", "ensureCapacityInternal", "minimumCapacity", "equalsInternal", "other", "", "hashCodeInternal", "indexOf", "key", "indexOfInternal", "indexOfNull", "isEmptyInternal", "removeAllInternal", "removeAtInternal", "index", "(Landroidx/collection/ArraySet;I)Ljava/lang/Object;", "removeInternal", "retainAllInternal", "toStringInternal", "", "valueAtInternal", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ArraySetKt {
    public static final int ARRAY_SET_BASE_SIZE = 4;

    public static final <E> void addAllInternal(androidx.collection.ArraySet<E> r8, androidx.collection.ArraySet<? extends E> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r5 = r9.get_size$collection()
            int r1 = r8.get_size$collection()
            int r1 = r1 + r5
            r8.ensureCapacity(r1)
            int r1 = r8.get_size$collection()
            if (r1 != 0) goto L49
            if (r5 <= 0) goto L56
            int[] r1 = r9.getHashes$collection()
            int[] r2 = r8.getHashes$collection()
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            kotlin.collections.ArraysKt.copyInto$default(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object[] r1 = r9.getArray$collection()
            java.lang.Object[] r2 = r8.getArray$collection()
            kotlin.collections.ArraysKt.copyInto$default(r1, r2, r3, r4, r5, r6, r7)
            int r1 = r8.get_size$collection()
            if (r1 != 0) goto L43
            r8.set_size$collection(r5)
            goto L56
        L43:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
        L49:
            r1 = 0
        L4a:
            if (r1 >= r5) goto L56
            java.lang.Object r2 = r9.valueAt(r1)
            r8.add(r2)
            int r1 = r1 + 1
            goto L4a
        L56:
            return
    }

    public static final <E> boolean addAllInternal(androidx.collection.ArraySet<E> r5, java.util.Collection<? extends E> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            int r1 = r5.get_size$collection()
            int r2 = r6.size()
            int r1 = r1 + r2
            r5.ensureCapacity(r1)
            r1 = 0
            java.util.Iterator r2 = r6.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r2.next()
            boolean r4 = r5.add(r3)
            r1 = r1 | r4
            goto L1c
        L2c:
            return r1
    }

    public static final <E> boolean addInternal(androidx.collection.ArraySet<E> r17, E r18) {
            r0 = r17
            r1 = r18
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r2 = 0
            int r3 = r0.get_size$collection()
            r4 = 0
            r5 = 0
            if (r1 != 0) goto L18
            r4 = 0
            int r5 = indexOfNull(r0)
            goto L20
        L18:
            int r4 = r1.hashCode()
            int r5 = indexOf(r0, r1, r4)
        L20:
            r6 = 0
            if (r5 < 0) goto L24
            return r6
        L24:
            int r5 = ~r5
            int[] r7 = r0.getHashes$collection()
            int r7 = r7.length
            r8 = 1
            if (r3 < r7) goto L7b
        L2e:
            r7 = 8
            if (r3 < r7) goto L36
            int r7 = r3 >> 1
            int r7 = r7 + r3
            goto L3b
        L36:
            r9 = 4
            if (r3 < r9) goto L3a
            goto L3b
        L3a:
            r7 = r9
        L3b:
            int[] r9 = r0.getHashes$collection()
            java.lang.Object[] r10 = r0.getArray$collection()
            allocArrays(r0, r7)
            int r11 = r0.get_size$collection()
            if (r3 != r11) goto L75
            int[] r11 = r0.getHashes$collection()
            int r11 = r11.length
            if (r11 != 0) goto L56
            r6 = r8
        L56:
            if (r6 != 0) goto L73
            r6 = r10
            int[] r10 = r0.getHashes$collection()
            int r13 = r9.length
            r14 = 6
            r15 = 0
            r11 = 0
            r12 = 0
            kotlin.collections.ArraysKt.copyInto$default(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object[] r11 = r0.getArray$collection()
            int r14 = r6.length
            r15 = 6
            r16 = 0
            r13 = 0
            r10 = r6
            kotlin.collections.ArraysKt.copyInto$default(r10, r11, r12, r13, r14, r15, r16)
            goto L7b
        L73:
            r6 = r10
            goto L7b
        L75:
            java.util.ConcurrentModificationException r8 = new java.util.ConcurrentModificationException
            r8.<init>()
            throw r8
        L7b:
            if (r5 >= r3) goto L9b
            int[] r6 = r0.getHashes$collection()
            int[] r7 = r0.getHashes$collection()
            int r9 = r5 + 1
            kotlin.collections.ArraysKt.copyInto(r6, r7, r9, r5, r3)
            java.lang.Object[] r6 = r0.getArray$collection()
            java.lang.Object[] r7 = r0.getArray$collection()
            int r9 = r5 + 1
            kotlin.collections.ArraysKt.copyInto(r6, r7, r9, r5, r3)
        L9b:
            int r6 = r0.get_size$collection()
            if (r3 != r6) goto Lbd
            int[] r6 = r0.getHashes$collection()
            int r6 = r6.length
            if (r5 >= r6) goto Lbd
            int[] r6 = r0.getHashes$collection()
            r6[r5] = r4
            java.lang.Object[] r6 = r0.getArray$collection()
            r6[r5] = r1
            int r6 = r0.get_size$collection()
            int r6 = r6 + r8
            r0.set_size$collection(r6)
            return r8
        Lbd:
            java.util.ConcurrentModificationException r6 = new java.util.ConcurrentModificationException
            r6.<init>()
            throw r6
    }

    public static final <E> void allocArrays(androidx.collection.ArraySet<E> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int[] r0 = new int[r2]
            r1.setHashes$collection(r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1.setArray$collection(r0)
            return
    }

    public static final <T> androidx.collection.ArraySet<T> arraySetOf() {
            r0 = 0
            androidx.collection.ArraySet r1 = new androidx.collection.ArraySet
            r2 = 1
            r3 = 0
            r4 = 0
            r1.<init>(r4, r2, r3)
            return r1
    }

    public static final <T> androidx.collection.ArraySet<T> arraySetOf(T... r4) {
            java.lang.String r0 = "values"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
            int r1 = r4.length
            r0.<init>(r1)
            int r1 = r4.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L17
            r3 = r4[r2]
            r0.add(r3)
            int r2 = r2 + 1
            goto Ld
        L17:
            return r0
    }

    public static final <E> int binarySearchInternal(androidx.collection.ArraySet<E> r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int[] r0 = r2.getHashes$collection()     // Catch: java.lang.IndexOutOfBoundsException -> L13
            int r1 = r2.get_size$collection()     // Catch: java.lang.IndexOutOfBoundsException -> L13
            int r0 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L13
            return r0
        L13:
            r0 = move-exception
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    public static final <E> void clearInternal(androidx.collection.ArraySet<E> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            int r1 = r2.get_size$collection()
            if (r1 == 0) goto L1a
            int[] r1 = androidx.collection.internal.ContainerHelpersKt.EMPTY_INTS
            r2.setHashes$collection(r1)
            java.lang.Object[] r1 = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS
            r2.setArray$collection(r1)
            r1 = 0
            r2.set_size$collection(r1)
        L1a:
            int r1 = r2.get_size$collection()
            if (r1 != 0) goto L21
            return
        L21:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    public static final <E> boolean containsAllInternal(androidx.collection.ArraySet<E> r4, java.util.Collection<? extends E> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.util.Iterator r1 = r5.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            boolean r3 = r4.contains(r2)
            if (r3 != 0) goto Lf
            r1 = 0
            return r1
        L21:
            r1 = 1
            return r1
    }

    public static final <E> boolean containsInternal(androidx.collection.ArraySet<E> r2, E r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            int r1 = r2.indexOf(r3)
            if (r1 < 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public static final <E> void ensureCapacityInternal(androidx.collection.ArraySet<E> r11, int r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            int r1 = r11.get_size$collection()
            int[] r2 = r11.getHashes$collection()
            int r2 = r2.length
            if (r2 >= r12) goto L42
            int[] r3 = r11.getHashes$collection()
            java.lang.Object[] r2 = r11.getArray$collection()
            allocArrays(r11, r12)
            int r4 = r11.get_size$collection()
            if (r4 <= 0) goto L41
            int[] r4 = r11.getHashes$collection()
            int r7 = r11.get_size$collection()
            r8 = 6
            r9 = 0
            r5 = 0
            r6 = 0
            kotlin.collections.ArraysKt.copyInto$default(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object[] r5 = r11.getArray$collection()
            int r8 = r11.get_size$collection()
            r9 = 6
            r10 = 0
            r7 = 0
            r4 = r2
            kotlin.collections.ArraysKt.copyInto$default(r4, r5, r6, r7, r8, r9, r10)
            goto L42
        L41:
            r4 = r2
        L42:
            int r2 = r11.get_size$collection()
            if (r2 != r1) goto L49
            return
        L49:
            java.util.ConcurrentModificationException r2 = new java.util.ConcurrentModificationException
            r2.<init>()
            throw r2
    }

    public static final <E> boolean equalsInternal(androidx.collection.ArraySet<E> r7, java.lang.Object r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            r1 = 1
            if (r7 != r8) goto La
            return r1
        La:
            boolean r2 = r8 instanceof java.util.Set
            r3 = 0
            if (r2 == 0) goto L3b
            int r2 = r7.size()
            r4 = r8
            java.util.Set r4 = (java.util.Set) r4
            int r4 = r4.size()
            if (r2 == r4) goto L1d
            return r3
        L1d:
            r2 = 0
            int r4 = r7.get_size$collection()     // Catch: java.lang.ClassCastException -> L37 java.lang.NullPointerException -> L39
        L23:
            if (r2 >= r4) goto L36
            java.lang.Object r5 = r7.valueAt(r2)     // Catch: java.lang.ClassCastException -> L37 java.lang.NullPointerException -> L39
            r6 = r8
            java.util.Set r6 = (java.util.Set) r6     // Catch: java.lang.ClassCastException -> L37 java.lang.NullPointerException -> L39
            boolean r6 = r6.contains(r5)     // Catch: java.lang.ClassCastException -> L37 java.lang.NullPointerException -> L39
            if (r6 != 0) goto L33
            return r3
        L33:
            int r2 = r2 + 1
            goto L23
        L36:
            return r1
        L37:
            r1 = move-exception
            return r3
        L39:
            r1 = move-exception
            return r3
        L3b:
            return r3
    }

    public static final <E> int hashCodeInternal(androidx.collection.ArraySet<E> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            int[] r1 = r6.getHashes$collection()
            int r2 = r6.get_size$collection()
            r3 = 0
            r4 = 0
        L10:
            if (r4 >= r2) goto L18
            r5 = r1[r4]
            int r3 = r3 + r5
            int r4 = r4 + 1
            goto L10
        L18:
            return r3
    }

    public static final <E> int indexOf(androidx.collection.ArraySet<E> r5, java.lang.Object r6, int r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.get_size$collection()
            if (r0 != 0) goto Ld
            r1 = -1
            return r1
        Ld:
            int r1 = binarySearchInternal(r5, r7)
            if (r1 >= 0) goto L14
            return r1
        L14:
            java.lang.Object[] r2 = r5.getArray$collection()
            r2 = r2[r1]
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r2)
            if (r2 == 0) goto L21
            return r1
        L21:
            int r2 = r1 + 1
        L23:
            if (r2 >= r0) goto L3d
            int[] r3 = r5.getHashes$collection()
            r3 = r3[r2]
            if (r3 != r7) goto L3d
            java.lang.Object[] r3 = r5.getArray$collection()
            r3 = r3[r2]
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r3)
            if (r3 == 0) goto L3a
            return r2
        L3a:
            int r2 = r2 + 1
            goto L23
        L3d:
            int r3 = r1 + (-1)
        L3f:
            if (r3 < 0) goto L59
            int[] r4 = r5.getHashes$collection()
            r4 = r4[r3]
            if (r4 != r7) goto L59
            java.lang.Object[] r4 = r5.getArray$collection()
            r4 = r4[r3]
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r4)
            if (r4 == 0) goto L56
            return r3
        L56:
            int r3 = r3 + (-1)
            goto L3f
        L59:
            int r4 = ~r2
            return r4
    }

    public static final <E> int indexOfInternal(androidx.collection.ArraySet<E> r2, java.lang.Object r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            if (r3 != 0) goto Ld
            int r1 = indexOfNull(r2)
            goto L15
        Ld:
            int r1 = r3.hashCode()
            int r1 = indexOf(r2, r3, r1)
        L15:
            return r1
    }

    public static final <E> int indexOfNull(androidx.collection.ArraySet<E> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            r1 = 0
            int r0 = indexOf(r2, r0, r1)
            return r0
    }

    public static final <E> boolean isEmptyInternal(androidx.collection.ArraySet<E> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            int r1 = r2.get_size$collection()
            if (r1 > 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public static final <E> boolean removeAllInternal(androidx.collection.ArraySet<E> r5, androidx.collection.ArraySet<? extends E> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            int r1 = r6.get_size$collection()
            int r2 = r5.get_size$collection()
            r3 = 0
        L14:
            if (r3 >= r1) goto L20
            java.lang.Object r4 = r6.valueAt(r3)
            r5.remove(r4)
            int r3 = r3 + 1
            goto L14
        L20:
            int r3 = r5.get_size$collection()
            if (r2 == r3) goto L28
            r3 = 1
            goto L29
        L28:
            r3 = 0
        L29:
            return r3
    }

    public static final <E> boolean removeAllInternal(androidx.collection.ArraySet<E> r5, java.util.Collection<? extends E> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 0
            java.util.Iterator r2 = r6.iterator()
        L10:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L20
            java.lang.Object r3 = r2.next()
            boolean r4 = r5.remove(r3)
            r1 = r1 | r4
            goto L10
        L20:
            return r1
    }

    public static final <E> E removeAtInternal(androidx.collection.ArraySet<E> r14, int r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r7 = 0
            int r8 = r14.get_size$collection()
            java.lang.Object[] r0 = r14.getArray$collection()
            r9 = r0[r15]
            r0 = 1
            if (r8 > r0) goto L19
            r14.clear()
            r4 = r15
            goto Lbd
        L19:
            int r10 = r8 + (-1)
            int[] r1 = r14.getHashes$collection()
            int r1 = r1.length
            r2 = 8
            if (r1 <= r2) goto L8a
            int r1 = r14.get_size$collection()
            int[] r3 = r14.getHashes$collection()
            int r3 = r3.length
            int r3 = r3 / 3
            if (r1 >= r3) goto L8a
        L32:
            int r1 = r14.get_size$collection()
            if (r1 <= r2) goto L45
            int r1 = r14.get_size$collection()
            int r2 = r14.get_size$collection()
            int r0 = r2 >> 1
            int r2 = r1 + r0
            goto L46
        L45:
        L46:
            r11 = r2
            int[] r0 = r14.getHashes$collection()
            java.lang.Object[] r12 = r14.getArray$collection()
            allocArrays(r14, r11)
            if (r15 <= 0) goto L6a
            int[] r1 = r14.getHashes$collection()
            r5 = 6
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = r15
            kotlin.collections.ArraysKt.copyInto$default(r0, r1, r2, r3, r4, r5, r6)
            r13 = r0
            java.lang.Object[] r1 = r14.getArray$collection()
            r0 = r12
            kotlin.collections.ArraysKt.copyInto$default(r0, r1, r2, r3, r4, r5, r6)
            goto L6d
        L6a:
            r4 = r15
            r13 = r0
            r0 = r12
        L6d:
            if (r4 >= r10) goto Lb4
        L70:
            int[] r1 = r14.getHashes$collection()
            int r2 = r4 + 1
            int r3 = r10 + 1
            kotlin.collections.ArraysKt.copyInto(r13, r1, r15, r2, r3)
            java.lang.Object[] r1 = r14.getArray$collection()
            int r2 = r4 + 1
            int r3 = r10 + 1
            kotlin.collections.ArraysKt.copyInto(r0, r1, r15, r2, r3)
            goto Lb4
        L8a:
            r4 = r15
            if (r4 >= r10) goto Lad
            int[] r0 = r14.getHashes$collection()
            int[] r1 = r14.getHashes$collection()
            int r2 = r4 + 1
            int r3 = r10 + 1
            kotlin.collections.ArraysKt.copyInto(r0, r1, r15, r2, r3)
            java.lang.Object[] r0 = r14.getArray$collection()
            java.lang.Object[] r1 = r14.getArray$collection()
            int r2 = r4 + 1
            int r3 = r10 + 1
            kotlin.collections.ArraysKt.copyInto(r0, r1, r15, r2, r3)
        Lad:
            java.lang.Object[] r0 = r14.getArray$collection()
            r1 = 0
            r0[r10] = r1
        Lb4:
            int r0 = r14.get_size$collection()
            if (r8 != r0) goto Lbe
            r14.set_size$collection(r10)
        Lbd:
            return r9
        Lbe:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    public static final <E> boolean removeInternal(androidx.collection.ArraySet<E> r3, E r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r3.indexOf(r4)
            if (r1 < 0) goto L11
            r3.removeAt(r1)
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }

    public static final <E> boolean retainAllInternal(androidx.collection.ArraySet<E> r5, java.util.Collection<? extends E> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 0
            int r2 = r5.get_size$collection()
            int r2 = r2 + (-1)
        L12:
            r3 = -1
            if (r3 >= r2) goto L2b
            r3 = r6
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Object[] r4 = r5.getArray$collection()
            r4 = r4[r2]
            boolean r3 = kotlin.collections.CollectionsKt.contains(r3, r4)
            if (r3 != 0) goto L28
            r5.removeAt(r2)
            r1 = 1
        L28:
            int r2 = r2 + (-1)
            goto L12
        L2b:
            return r1
    }

    public static final <E> java.lang.String toStringInternal(androidx.collection.ArraySet<E> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto Lf
            java.lang.String r1 = "{}"
            return r1
        Lf:
            int r1 = r8.get_size$collection()
            int r1 = r1 * 14
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r1 = r2
            r3 = 0
            r4 = 123(0x7b, float:1.72E-43)
            r1.append(r4)
            r4 = 0
            int r5 = r8.get_size$collection()
        L26:
            if (r4 >= r5) goto L41
            if (r4 <= 0) goto L2f
            java.lang.String r6 = ", "
            r1.append(r6)
        L2f:
            java.lang.Object r6 = r8.valueAt(r4)
            if (r6 == r8) goto L39
            r1.append(r6)
            goto L3e
        L39:
            java.lang.String r7 = "(this Set)"
            r1.append(r7)
        L3e:
            int r4 = r4 + 1
            goto L26
        L41:
            r4 = 125(0x7d, float:1.75E-43)
            r1.append(r4)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public static final <E> E valueAtInternal(androidx.collection.ArraySet<E> r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            java.lang.Object[] r1 = r2.getArray$collection()
            r1 = r1[r3]
            return r1
    }
}
