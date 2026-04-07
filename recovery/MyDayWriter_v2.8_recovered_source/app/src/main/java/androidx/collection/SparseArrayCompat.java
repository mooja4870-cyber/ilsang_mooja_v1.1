package androidx.collection;

/* JADX INFO: compiled from: SparseArrayCompat.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0017J\u0018\u0010\u001d\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0014\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010\u001eJ\u001d\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010#J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0016J\u001d\u0010&\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u0018\u0010'\u001a\u00020\u00132\u000e\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0016J\u001f\u0010)\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u001a\u0010*\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0004H\u0016J\u0018\u0010,\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u001f\u0010-\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J%\u0010-\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010.\u001a\u00028\u00002\u0006\u0010/\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00100J\u001d\u00101\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u00102\u001a\u000203H\u0016J\u0015\u00104\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u001eR\u0012\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0004\n\u0002\u0010\u0011¨\u00065"}, d2 = {"Landroidx/collection/SparseArrayCompat;", "E", "", "initialCapacity", "", "(I)V", "garbage", "", "isEmpty", "getIsEmpty", "()Z", "keys", "", "size", "values", "", "", "[Ljava/lang/Object;", "append", "", "key", "value", "(ILjava/lang/Object;)V", "clear", "clone", "containsKey", "containsValue", "(Ljava/lang/Object;)Z", "delete", "get", "(I)Ljava/lang/Object;", "defaultValue", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOfKey", "indexOfValue", "(Ljava/lang/Object;)I", "keyAt", "index", "put", "putAll", "other", "putIfAbsent", "remove", "removeAt", "removeAtRange", "replace", "oldValue", "newValue", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "toString", "", "valueAt", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class SparseArrayCompat<E> implements java.lang.Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ int[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ java.lang.Object[] values;

    public SparseArrayCompat() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public SparseArrayCompat(int r3) {
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto Lf
            int[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_INTS
            r2.keys = r0
            java.lang.Object[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS
            r2.values = r0
            goto L1b
        Lf:
            int r0 = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(r3)
            int[] r1 = new int[r0]
            r2.keys = r1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2.values = r1
        L1b:
            return
    }

    public /* synthetic */ SparseArrayCompat(int r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 10
        L6:
            r0.<init>(r1)
            return
    }

    public void append(int r7, E r8) {
            r6 = this;
            r0 = r6
            r1 = 0
            int r2 = r0.size
            if (r2 == 0) goto L14
            int[] r2 = r0.keys
            int r3 = r0.size
            int r3 = r3 + (-1)
            r2 = r2[r3]
            if (r7 > r2) goto L14
            r0.put(r7, r8)
            goto L54
        L14:
            boolean r2 = r0.garbage
            if (r2 == 0) goto L22
            int r2 = r0.size
            int[] r3 = r0.keys
            int r3 = r3.length
            if (r2 < r3) goto L22
            androidx.collection.SparseArrayCompatKt.access$gc(r0)
        L22:
            int r2 = r0.size
            int[] r3 = r0.keys
            int r3 = r3.length
            if (r2 < r3) goto L47
            int r3 = r2 + 1
            int r3 = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(r3)
            int[] r4 = r0.keys
            int[] r4 = java.util.Arrays.copyOf(r4, r3)
            java.lang.String r5 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.keys = r4
            java.lang.Object[] r4 = r0.values
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.values = r4
        L47:
            int[] r3 = r0.keys
            r3[r2] = r7
            java.lang.Object[] r3 = r0.values
            r3[r2] = r8
            int r3 = r2 + 1
            r0.size = r3
        L54:
            return
    }

    public void clear() {
            r6 = this;
            r0 = r6
            r1 = 0
            int r2 = r0.size
            java.lang.Object[] r3 = r0.values
            r4 = 0
        L7:
            if (r4 >= r2) goto Lf
            r5 = 0
            r3[r4] = r5
            int r4 = r4 + 1
            goto L7
        Lf:
            r4 = 0
            r0.size = r4
            r0.garbage = r4
            return
    }

    public androidx.collection.SparseArrayCompat<E> clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            androidx.collection.SparseArrayCompat r0 = (androidx.collection.SparseArrayCompat) r0
            int[] r1 = r2.keys
            java.lang.Object r1 = r1.clone()
            int[] r1 = (int[]) r1
            r0.keys = r1
            java.lang.Object[] r1 = r2.values
            java.lang.Object r1 = r1.clone()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0.values = r1
            return r0
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m43clone() {
            r1 = this;
            androidx.collection.SparseArrayCompat r0 = r1.clone()
            return r0
    }

    public boolean containsKey(int r4) {
            r3 = this;
            r0 = r3
            r1 = 0
            int r2 = r0.indexOfKey(r4)
            if (r2 < 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    public boolean containsValue(E r8) {
            r7 = this;
            r0 = r7
            r1 = 0
            r2 = r0
            r3 = 0
            boolean r4 = r2.garbage
            if (r4 == 0) goto Lb
            androidx.collection.SparseArrayCompatKt.access$gc(r2)
        Lb:
            r4 = 0
            int r5 = r2.size
        Le:
            if (r4 >= r5) goto L1a
            java.lang.Object[] r6 = r2.values
            r6 = r6[r4]
            if (r6 != r8) goto L17
            goto L1b
        L17:
            int r4 = r4 + 1
            goto Le
        L1a:
            r4 = -1
        L1b:
            if (r4 < 0) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            return r2
    }

    @kotlin.Deprecated(message = "Alias for remove(int).", replaceWith = @kotlin.ReplaceWith(expression = "remove(key)", imports = {}))
    public void delete(int r1) {
            r0 = this;
            r0.remove(r1)
            return
    }

    public E get(int r2) {
            r1 = this;
            java.lang.Object r0 = androidx.collection.SparseArrayCompatKt.commonGet(r1, r2)
            return r0
    }

    public E get(int r2, E r3) {
            r1 = this;
            java.lang.Object r0 = androidx.collection.SparseArrayCompatKt.commonGet(r1, r2, r3)
            return r0
    }

    public final boolean getIsEmpty() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            return r0
    }

    public int indexOfKey(int r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            boolean r2 = r0.garbage
            if (r2 == 0) goto L9
            androidx.collection.SparseArrayCompatKt.access$gc(r0)
        L9:
            int[] r2 = r0.keys
            int r3 = r0.size
            int r0 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r2, r3, r5)
            return r0
    }

    public int indexOfValue(E r6) {
            r5 = this;
            r0 = r5
            r1 = 0
            boolean r2 = r0.garbage
            if (r2 == 0) goto L9
            androidx.collection.SparseArrayCompatKt.access$gc(r0)
        L9:
            r2 = 0
            int r3 = r0.size
        Lc:
            if (r2 >= r3) goto L18
            java.lang.Object[] r4 = r0.values
            r4 = r4[r2]
            if (r4 != r6) goto L15
            goto L19
        L15:
            int r2 = r2 + 1
            goto Lc
        L18:
            r2 = -1
        L19:
            return r2
    }

    public boolean isEmpty() {
            r3 = this;
            r0 = r3
            r1 = 0
            int r2 = r0.size()
            if (r2 != 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    public int keyAt(int r4) {
            r3 = this;
            r0 = r3
            r1 = 0
            boolean r2 = r0.garbage
            if (r2 == 0) goto L9
            androidx.collection.SparseArrayCompatKt.access$gc(r0)
        L9:
            int[] r2 = r0.keys
            r0 = r2[r4]
            return r0
    }

    public void put(int r8, E r9) {
            r7 = this;
            r0 = r7
            r1 = 0
            int[] r2 = r0.keys
            int r3 = r0.size
            int r2 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r2, r3, r8)
            if (r2 < 0) goto L12
            java.lang.Object[] r3 = r0.values
            r3[r2] = r9
            goto L93
        L12:
            int r2 = ~r2
            int r3 = r0.size
            if (r2 >= r3) goto L2a
            java.lang.Object[] r3 = r0.values
            r3 = r3[r2]
            java.lang.Object r4 = androidx.collection.SparseArrayCompatKt.access$getDELETED$p()
            if (r3 != r4) goto L2a
            int[] r3 = r0.keys
            r3[r2] = r8
            java.lang.Object[] r3 = r0.values
            r3[r2] = r9
            goto L94
        L2a:
            boolean r3 = r0.garbage
            if (r3 == 0) goto L41
            int r3 = r0.size
            int[] r4 = r0.keys
            int r4 = r4.length
            if (r3 < r4) goto L41
            androidx.collection.SparseArrayCompatKt.access$gc(r0)
            int[] r3 = r0.keys
            int r4 = r0.size
            int r3 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r3, r4, r8)
            int r2 = ~r3
        L41:
            int r3 = r0.size
            int[] r4 = r0.keys
            int r4 = r4.length
            if (r3 < r4) goto L68
            int r3 = r0.size
            int r3 = r3 + 1
            int r3 = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(r3)
            int[] r4 = r0.keys
            int[] r4 = java.util.Arrays.copyOf(r4, r3)
            java.lang.String r5 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.keys = r4
            java.lang.Object[] r4 = r0.values
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.values = r4
        L68:
            int r3 = r0.size
            int r3 = r3 - r2
            if (r3 == 0) goto L85
            int[] r3 = r0.keys
            int[] r4 = r0.keys
            int r5 = r2 + 1
            int r6 = r0.size
            kotlin.collections.ArraysKt.copyInto(r3, r4, r5, r2, r6)
            java.lang.Object[] r3 = r0.values
            java.lang.Object[] r4 = r0.values
            int r5 = r2 + 1
            int r6 = r0.size
            kotlin.collections.ArraysKt.copyInto(r3, r4, r5, r2, r6)
        L85:
            int[] r3 = r0.keys
            r3[r2] = r8
            java.lang.Object[] r3 = r0.values
            r3[r2] = r9
            int r3 = r0.size
            int r3 = r3 + 1
            r0.size = r3
        L93:
        L94:
            return
    }

    public void putAll(androidx.collection.SparseArrayCompat<? extends E> r14) {
            r13 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = r13
            r1 = 0
            r2 = 0
            int r3 = r14.size()
        Lc:
            if (r2 >= r3) goto Lae
            int r4 = r14.keyAt(r2)
            java.lang.Object r5 = r14.valueAt(r2)
            r6 = r0
            r7 = 0
            int[] r8 = r6.keys
            int r9 = r6.size
            int r8 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r8, r9, r4)
            if (r8 < 0) goto L28
            java.lang.Object[] r9 = r6.values
            r9[r8] = r5
            goto La9
        L28:
            int r8 = ~r8
            int r9 = r6.size
            if (r8 >= r9) goto L40
            java.lang.Object[] r9 = r6.values
            r9 = r9[r8]
            java.lang.Object r10 = androidx.collection.SparseArrayCompatKt.access$getDELETED$p()
            if (r9 != r10) goto L40
            int[] r9 = r6.keys
            r9[r8] = r4
            java.lang.Object[] r9 = r6.values
            r9[r8] = r5
            goto Laa
        L40:
            boolean r9 = r6.garbage
            if (r9 == 0) goto L57
            int r9 = r6.size
            int[] r10 = r6.keys
            int r10 = r10.length
            if (r9 < r10) goto L57
            androidx.collection.SparseArrayCompatKt.access$gc(r6)
            int[] r9 = r6.keys
            int r10 = r6.size
            int r9 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r9, r10, r4)
            int r8 = ~r9
        L57:
            int r9 = r6.size
            int[] r10 = r6.keys
            int r10 = r10.length
            if (r9 < r10) goto L7e
            int r9 = r6.size
            int r9 = r9 + 1
            int r9 = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(r9)
            int[] r10 = r6.keys
            int[] r10 = java.util.Arrays.copyOf(r10, r9)
            java.lang.String r11 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            r6.keys = r10
            java.lang.Object[] r10 = r6.values
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            r6.values = r10
        L7e:
            int r9 = r6.size
            int r9 = r9 - r8
            if (r9 == 0) goto L9b
            int[] r9 = r6.keys
            int[] r10 = r6.keys
            int r11 = r8 + 1
            int r12 = r6.size
            kotlin.collections.ArraysKt.copyInto(r9, r10, r11, r8, r12)
            java.lang.Object[] r9 = r6.values
            java.lang.Object[] r10 = r6.values
            int r11 = r8 + 1
            int r12 = r6.size
            kotlin.collections.ArraysKt.copyInto(r9, r10, r11, r8, r12)
        L9b:
            int[] r9 = r6.keys
            r9[r8] = r4
            java.lang.Object[] r9 = r6.values
            r9[r8] = r5
            int r9 = r6.size
            int r9 = r9 + 1
            r6.size = r9
        La9:
        Laa:
            int r2 = r2 + 1
            goto Lc
        Lae:
            return
    }

    public E putIfAbsent(int r11, E r12) {
            r10 = this;
            r0 = r10
            r1 = 0
            java.lang.Object r2 = androidx.collection.SparseArrayCompatKt.commonGet(r0, r11)
            if (r2 != 0) goto L9c
            r3 = r0
            r4 = 0
            int[] r5 = r3.keys
            int r6 = r3.size
            int r5 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r5, r6, r11)
            if (r5 < 0) goto L1a
            java.lang.Object[] r6 = r3.values
            r6[r5] = r12
            goto L9b
        L1a:
            int r5 = ~r5
            int r6 = r3.size
            if (r5 >= r6) goto L32
            java.lang.Object[] r6 = r3.values
            r6 = r6[r5]
            java.lang.Object r7 = androidx.collection.SparseArrayCompatKt.access$getDELETED$p()
            if (r6 != r7) goto L32
            int[] r6 = r3.keys
            r6[r5] = r11
            java.lang.Object[] r6 = r3.values
            r6[r5] = r12
            goto L9c
        L32:
            boolean r6 = r3.garbage
            if (r6 == 0) goto L49
            int r6 = r3.size
            int[] r7 = r3.keys
            int r7 = r7.length
            if (r6 < r7) goto L49
            androidx.collection.SparseArrayCompatKt.access$gc(r3)
            int[] r6 = r3.keys
            int r7 = r3.size
            int r6 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r6, r7, r11)
            int r5 = ~r6
        L49:
            int r6 = r3.size
            int[] r7 = r3.keys
            int r7 = r7.length
            if (r6 < r7) goto L70
            int r6 = r3.size
            int r6 = r6 + 1
            int r6 = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(r6)
            int[] r7 = r3.keys
            int[] r7 = java.util.Arrays.copyOf(r7, r6)
            java.lang.String r8 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r3.keys = r7
            java.lang.Object[] r7 = r3.values
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r3.values = r7
        L70:
            int r6 = r3.size
            int r6 = r6 - r5
            if (r6 == 0) goto L8d
            int[] r6 = r3.keys
            int[] r7 = r3.keys
            int r8 = r5 + 1
            int r9 = r3.size
            kotlin.collections.ArraysKt.copyInto(r6, r7, r8, r5, r9)
            java.lang.Object[] r6 = r3.values
            java.lang.Object[] r7 = r3.values
            int r8 = r5 + 1
            int r9 = r3.size
            kotlin.collections.ArraysKt.copyInto(r6, r7, r8, r5, r9)
        L8d:
            int[] r6 = r3.keys
            r6[r5] = r11
            java.lang.Object[] r6 = r3.values
            r6[r5] = r12
            int r6 = r3.size
            int r6 = r6 + 1
            r3.size = r6
        L9b:
        L9c:
            return r2
    }

    public void remove(int r1) {
            r0 = this;
            androidx.collection.SparseArrayCompatKt.commonRemove(r0, r1)
            return
    }

    public boolean remove(int r6, java.lang.Object r7) {
            r5 = this;
            r0 = r5
            r1 = 0
            int r2 = r0.indexOfKey(r6)
            if (r2 < 0) goto L17
            java.lang.Object r3 = r0.valueAt(r2)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r3)
            if (r4 == 0) goto L17
            r0.removeAt(r2)
            r4 = 1
            goto L18
        L17:
            r4 = 0
        L18:
            return r4
    }

    public void removeAt(int r5) {
            r4 = this;
            r0 = r4
            r1 = 0
            java.lang.Object[] r2 = r0.values
            r2 = r2[r5]
            java.lang.Object r3 = androidx.collection.SparseArrayCompatKt.access$getDELETED$p()
            if (r2 == r3) goto L17
            java.lang.Object[] r2 = r0.values
            java.lang.Object r3 = androidx.collection.SparseArrayCompatKt.access$getDELETED$p()
            r2[r5] = r3
            r2 = 1
            r0.garbage = r2
        L17:
            return
    }

    public void removeAtRange(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = 0
            int r2 = r5 + r6
            int r2 = java.lang.Math.min(r6, r2)
            r3 = r5
        L9:
            if (r3 >= r2) goto L11
            r0.removeAt(r3)
            int r3 = r3 + 1
            goto L9
        L11:
            return
    }

    public E replace(int r6, E r7) {
            r5 = this;
            r0 = r5
            r1 = 0
            int r2 = r0.indexOfKey(r6)
            if (r2 < 0) goto L11
            java.lang.Object[] r3 = r0.values
            r3 = r3[r2]
            java.lang.Object[] r4 = r0.values
            r4[r2] = r7
            goto L12
        L11:
            r3 = 0
        L12:
            return r3
    }

    public boolean replace(int r6, E r7, E r8) {
            r5 = this;
            r0 = r5
            r1 = 0
            int r2 = r0.indexOfKey(r6)
            if (r2 < 0) goto L18
            java.lang.Object[] r3 = r0.values
            r3 = r3[r2]
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r7)
            if (r4 == 0) goto L18
            java.lang.Object[] r4 = r0.values
            r4[r2] = r8
            r4 = 1
            goto L19
        L18:
            r4 = 0
        L19:
            return r4
    }

    public void setValueAt(int r4, E r5) {
            r3 = this;
            r0 = r3
            r1 = 0
            boolean r2 = r0.garbage
            if (r2 == 0) goto L9
            androidx.collection.SparseArrayCompatKt.access$gc(r0)
        L9:
            java.lang.Object[] r2 = r0.values
            r2[r4] = r5
            return
    }

    public int size() {
            r3 = this;
            r0 = r3
            r1 = 0
            boolean r2 = r0.garbage
            if (r2 == 0) goto L9
            androidx.collection.SparseArrayCompatKt.access$gc(r0)
        L9:
            int r0 = r0.size
            return r0
    }

    public java.lang.String toString() {
            r8 = this;
            r0 = r8
            r1 = 0
            int r2 = r0.size()
            if (r2 > 0) goto Lb
            java.lang.String r2 = "{}"
            goto L52
        Lb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r0.size
            int r3 = r3 * 28
            r2.<init>(r3)
            r3 = 123(0x7b, float:1.72E-43)
            r2.append(r3)
            r3 = 0
            int r4 = r0.size
        L1c:
            if (r3 >= r4) goto L43
            if (r3 <= 0) goto L25
            java.lang.String r5 = ", "
            r2.append(r5)
        L25:
            int r5 = r0.keyAt(r3)
            r2.append(r5)
            r6 = 61
            r2.append(r6)
            java.lang.Object r6 = r0.valueAt(r3)
            if (r6 == r0) goto L3b
            r2.append(r6)
            goto L40
        L3b:
            java.lang.String r7 = "(this Map)"
            r2.append(r7)
        L40:
            int r3 = r3 + 1
            goto L1c
        L43:
            r3 = 125(0x7d, float:1.75E-43)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            java.lang.String r4 = "buffer.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r2 = r3
        L52:
            return r2
    }

    public E valueAt(int r4) {
            r3 = this;
            r0 = r3
            r1 = 0
            boolean r2 = r0.garbage
            if (r2 == 0) goto L9
            androidx.collection.SparseArrayCompatKt.access$gc(r0)
        L9:
            java.lang.Object[] r2 = r0.values
            r0 = r2[r4]
            return r0
    }
}
