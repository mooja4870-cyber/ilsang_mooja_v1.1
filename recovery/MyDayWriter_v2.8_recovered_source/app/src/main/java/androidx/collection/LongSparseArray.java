package androidx.collection;

/* JADX INFO: compiled from: LongSparseArray.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0017J\u0018\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u0012H\u0096\u0002¢\u0006\u0002\u0010\u001cJ\u001d\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0007H\u0016J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0004H\u0016J\u001d\u0010%\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\u0018\u0010&\u001a\u00020\u00102\u000e\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0016J\u001f\u0010(\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ\u0010\u0010)\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001d\u0010)\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010*J\u0010\u0010+\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0004H\u0016J\u001f\u0010,\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ%\u0010,\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010-\u001a\u00028\u00002\u0006\u0010.\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010/J\u001d\u00100\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u00102\u001a\u000203H\u0016J\u0015\u00104\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0002\u00105R\u0012\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u00066"}, d2 = {"Landroidx/collection/LongSparseArray;", "E", "", "initialCapacity", "", "(I)V", "garbage", "", "keys", "", "size", "values", "", "", "[Ljava/lang/Object;", "append", "", "key", "", "value", "(JLjava/lang/Object;)V", "clear", "clone", "containsKey", "containsValue", "(Ljava/lang/Object;)Z", "delete", "get", "(J)Ljava/lang/Object;", "defaultValue", "(JLjava/lang/Object;)Ljava/lang/Object;", "indexOfKey", "indexOfValue", "(Ljava/lang/Object;)I", "isEmpty", "keyAt", "index", "put", "putAll", "other", "putIfAbsent", "remove", "(JLjava/lang/Object;)Z", "removeAt", "replace", "oldValue", "newValue", "(JLjava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "(ILjava/lang/Object;)V", "toString", "", "valueAt", "(I)Ljava/lang/Object;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class LongSparseArray<E> implements java.lang.Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ long[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ java.lang.Object[] values;

    public LongSparseArray() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public LongSparseArray(int r3) {
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto Lf
            long[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_LONGS
            r2.keys = r0
            java.lang.Object[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS
            r2.values = r0
            goto L1b
        Lf:
            int r0 = androidx.collection.internal.ContainerHelpersKt.idealLongArraySize(r3)
            long[] r1 = new long[r0]
            r2.keys = r1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2.values = r1
        L1b:
            return
    }

    public /* synthetic */ LongSparseArray(int r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 10
        L6:
            r0.<init>(r1)
            return
    }

    public void append(long r13, E r15) {
            r12 = this;
            r0 = r12
            r1 = 0
            int r2 = r0.size
            if (r2 == 0) goto L16
            long[] r2 = r0.keys
            int r3 = r0.size
            int r3 = r3 + (-1)
            r3 = r2[r3]
            int r2 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r2 > 0) goto L16
            r0.put(r13, r15)
            goto L7d
        L16:
            boolean r2 = r0.garbage
            if (r2 == 0) goto L4b
            int r2 = r0.size
            long[] r3 = r0.keys
            int r3 = r3.length
            if (r2 < r3) goto L4b
            r2 = r0
            r3 = 0
            int r4 = r2.size
            r5 = 0
            long[] r6 = r2.keys
            java.lang.Object[] r7 = r2.values
            r8 = 0
        L2b:
            if (r8 >= r4) goto L45
            r9 = r7[r8]
            java.lang.Object r10 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r9 == r10) goto L42
            if (r8 == r5) goto L40
            r10 = r6[r8]
            r6[r5] = r10
            r7[r5] = r9
            r10 = 0
            r7[r8] = r10
        L40:
            int r5 = r5 + 1
        L42:
            int r8 = r8 + 1
            goto L2b
        L45:
            r8 = 0
            r2.garbage = r8
            r2.size = r5
        L4b:
            int r2 = r0.size
            long[] r3 = r0.keys
            int r3 = r3.length
            if (r2 < r3) goto L70
            int r3 = r2 + 1
            int r3 = androidx.collection.internal.ContainerHelpersKt.idealLongArraySize(r3)
            long[] r4 = r0.keys
            long[] r4 = java.util.Arrays.copyOf(r4, r3)
            java.lang.String r5 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.keys = r4
            java.lang.Object[] r4 = r0.values
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.values = r4
        L70:
            long[] r3 = r0.keys
            r3[r2] = r13
            java.lang.Object[] r3 = r0.values
            r3[r2] = r15
            int r3 = r2 + 1
            r0.size = r3
        L7d:
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

    public androidx.collection.LongSparseArray<E> clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            androidx.collection.LongSparseArray r0 = (androidx.collection.LongSparseArray) r0
            long[] r1 = r2.keys
            java.lang.Object r1 = r1.clone()
            long[] r1 = (long[]) r1
            r0.keys = r1
            java.lang.Object[] r1 = r2.values
            java.lang.Object r1 = r1.clone()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0.values = r1
            return r0
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m42clone() {
            r1 = this;
            androidx.collection.LongSparseArray r0 = r1.clone()
            return r0
    }

    public boolean containsKey(long r4) {
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

    public boolean containsValue(E r4) {
            r3 = this;
            r0 = r3
            r1 = 0
            int r2 = r0.indexOfValue(r4)
            if (r2 < 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    @kotlin.Deprecated(message = "Alias for `remove(key)`.", replaceWith = @kotlin.ReplaceWith(expression = "remove(key)", imports = {}))
    public void delete(long r6) {
            r5 = this;
            r0 = r5
            r1 = 0
            long[] r2 = r0.keys
            int r3 = r0.size
            int r2 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r2, r3, r6)
            if (r2 < 0) goto L21
            java.lang.Object[] r3 = r0.values
            r3 = r3[r2]
            java.lang.Object r4 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r3 == r4) goto L21
            java.lang.Object[] r3 = r0.values
            java.lang.Object r4 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            r3[r2] = r4
            r3 = 1
            r0.garbage = r3
        L21:
            return
    }

    public E get(long r9) {
            r8 = this;
            r0 = r8
            r1 = 0
            r2 = 0
            r3 = r0
            r4 = 0
            long[] r5 = r3.keys
            int r6 = r3.size
            int r5 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r5, r6, r9)
            if (r5 < 0) goto L1f
            java.lang.Object[] r6 = r3.values
            r6 = r6[r5]
            java.lang.Object r7 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r6 != r7) goto L1a
            goto L1f
        L1a:
            java.lang.Object[] r6 = r3.values
            r6 = r6[r5]
            goto L20
        L1f:
            r6 = r2
        L20:
            return r6
    }

    public E get(long r8, E r10) {
            r7 = this;
            r0 = r7
            r1 = 0
            r2 = r0
            r3 = 0
            long[] r4 = r2.keys
            int r5 = r2.size
            int r4 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r4, r5, r8)
            if (r4 < 0) goto L1e
            java.lang.Object[] r5 = r2.values
            r5 = r5[r4]
            java.lang.Object r6 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r5 != r6) goto L19
            goto L1e
        L19:
            java.lang.Object[] r5 = r2.values
            r5 = r5[r4]
            goto L1f
        L1e:
            r5 = r10
        L1f:
            return r5
    }

    public int indexOfKey(long r13) {
            r12 = this;
            r0 = r12
            r1 = 0
            boolean r2 = r0.garbage
            if (r2 == 0) goto L30
            r2 = r0
            r3 = 0
            int r4 = r2.size
            r5 = 0
            long[] r6 = r2.keys
            java.lang.Object[] r7 = r2.values
            r8 = 0
        L10:
            if (r8 >= r4) goto L2a
            r9 = r7[r8]
            java.lang.Object r10 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r9 == r10) goto L27
            if (r8 == r5) goto L25
            r10 = r6[r8]
            r6[r5] = r10
            r7[r5] = r9
            r10 = 0
            r7[r8] = r10
        L25:
            int r5 = r5 + 1
        L27:
            int r8 = r8 + 1
            goto L10
        L2a:
            r8 = 0
            r2.garbage = r8
            r2.size = r5
        L30:
            long[] r2 = r0.keys
            int r3 = r0.size
            int r0 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r2, r3, r13)
            return r0
    }

    public int indexOfValue(E r14) {
            r13 = this;
            r0 = r13
            r1 = 0
            boolean r2 = r0.garbage
            r3 = 0
            if (r2 == 0) goto L30
            r2 = r0
            r4 = 0
            int r5 = r2.size
            r6 = 0
            long[] r7 = r2.keys
            java.lang.Object[] r8 = r2.values
            r9 = 0
        L11:
            if (r9 >= r5) goto L2b
            r10 = r8[r9]
            java.lang.Object r11 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r10 == r11) goto L28
            if (r9 == r6) goto L26
            r11 = r7[r9]
            r7[r6] = r11
            r8[r6] = r10
            r11 = 0
            r8[r9] = r11
        L26:
            int r6 = r6 + 1
        L28:
            int r9 = r9 + 1
            goto L11
        L2b:
            r2.garbage = r3
            r2.size = r6
        L30:
            int r2 = r0.size
        L32:
            if (r3 >= r2) goto L41
            r4 = r3
            r5 = 0
            java.lang.Object[] r6 = r0.values
            r6 = r6[r4]
            if (r6 != r14) goto L3d
            goto L42
        L3d:
            int r3 = r3 + 1
            goto L32
        L41:
            r4 = -1
        L42:
            return r4
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

    public long keyAt(int r14) {
            r13 = this;
            r0 = r13
            r1 = 0
            r2 = 0
            if (r14 < 0) goto Lb
            int r3 = r0.size
            if (r14 >= r3) goto Lb
            r3 = 1
            goto Lc
        Lb:
            r3 = r2
        Lc:
            if (r3 == 0) goto L40
            boolean r3 = r0.garbage
            if (r3 == 0) goto L3b
            r3 = r0
            r4 = 0
            int r5 = r3.size
            r6 = 0
            long[] r7 = r3.keys
            java.lang.Object[] r8 = r3.values
            r9 = 0
        L1c:
            if (r9 >= r5) goto L36
            r10 = r8[r9]
            java.lang.Object r11 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r10 == r11) goto L33
            if (r9 == r6) goto L31
            r11 = r7[r9]
            r7[r6] = r11
            r8[r6] = r10
            r11 = 0
            r8[r9] = r11
        L31:
            int r6 = r6 + 1
        L33:
            int r9 = r9 + 1
            goto L1c
        L36:
            r3.garbage = r2
            r3.size = r6
        L3b:
            long[] r2 = r0.keys
            r0 = r2[r14]
            return r0
        L40:
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Expected index to be within 0..size()-1, but was "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r14)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public void put(long r16, E r18) {
            r15 = this;
            r0 = r16
            r2 = r15
            r3 = 0
            long[] r4 = r2.keys
            int r5 = r2.size
            int r4 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r4, r5, r0)
            if (r4 < 0) goto L14
            java.lang.Object[] r5 = r2.values
            r5[r4] = r18
            goto Lbd
        L14:
            int r4 = ~r4
            int r5 = r2.size
            if (r4 >= r5) goto L2d
            java.lang.Object[] r5 = r2.values
            r5 = r5[r4]
            java.lang.Object r6 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r5 != r6) goto L2d
            long[] r5 = r2.keys
            r5[r4] = r0
            java.lang.Object[] r5 = r2.values
            r5[r4] = r18
            goto Lbe
        L2d:
            boolean r5 = r2.garbage
            if (r5 == 0) goto L6b
            int r5 = r2.size
            long[] r6 = r2.keys
            int r6 = r6.length
            if (r5 < r6) goto L6b
            r5 = r2
            r6 = 0
            int r7 = r5.size
            r8 = 0
            long[] r9 = r5.keys
            java.lang.Object[] r10 = r5.values
            r11 = 0
        L42:
            if (r11 >= r7) goto L5c
            r12 = r10[r11]
            java.lang.Object r13 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r12 == r13) goto L59
            if (r11 == r8) goto L57
            r13 = r9[r11]
            r9[r8] = r13
            r10[r8] = r12
            r13 = 0
            r10[r11] = r13
        L57:
            int r8 = r8 + 1
        L59:
            int r11 = r11 + 1
            goto L42
        L5c:
            r11 = 0
            r5.garbage = r11
            r5.size = r8
            long[] r5 = r2.keys
            int r6 = r2.size
            int r5 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r5, r6, r0)
            int r4 = ~r5
        L6b:
            int r5 = r2.size
            long[] r6 = r2.keys
            int r6 = r6.length
            if (r5 < r6) goto L92
            int r5 = r2.size
            int r5 = r5 + 1
            int r5 = androidx.collection.internal.ContainerHelpersKt.idealLongArraySize(r5)
            long[] r6 = r2.keys
            long[] r6 = java.util.Arrays.copyOf(r6, r5)
            java.lang.String r7 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r2.keys = r6
            java.lang.Object[] r6 = r2.values
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r2.values = r6
        L92:
            int r5 = r2.size
            int r5 = r5 - r4
            if (r5 == 0) goto Laf
            long[] r5 = r2.keys
            long[] r6 = r2.keys
            int r7 = r4 + 1
            int r8 = r2.size
            kotlin.collections.ArraysKt.copyInto(r5, r6, r7, r4, r8)
            java.lang.Object[] r5 = r2.values
            java.lang.Object[] r6 = r2.values
            int r7 = r4 + 1
            int r8 = r2.size
            kotlin.collections.ArraysKt.copyInto(r5, r6, r7, r4, r8)
        Laf:
            long[] r5 = r2.keys
            r5[r4] = r0
            java.lang.Object[] r5 = r2.values
            r5[r4] = r18
            int r5 = r2.size
            int r5 = r5 + 1
            r2.size = r5
        Lbd:
        Lbe:
            return
    }

    public void putAll(androidx.collection.LongSparseArray<? extends E> r10) {
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = r9
            r1 = 0
            int r2 = r10.size()
            r3 = 0
        Lc:
            if (r3 >= r2) goto L1f
            r4 = r3
            r5 = 0
            long r6 = r10.keyAt(r4)
            java.lang.Object r8 = r10.valueAt(r4)
            r0.put(r6, r8)
            int r3 = r3 + 1
            goto Lc
        L1f:
            return
    }

    public E putIfAbsent(long r4, E r6) {
            r3 = this;
            r0 = r3
            r1 = 0
            java.lang.Object r2 = r0.get(r4)
            if (r2 != 0) goto Lb
            r0.put(r4, r6)
        Lb:
            return r2
    }

    public void remove(long r6) {
            r5 = this;
            r0 = r5
            r1 = 0
            long[] r2 = r0.keys
            int r3 = r0.size
            int r2 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r2, r3, r6)
            if (r2 < 0) goto L21
            java.lang.Object[] r3 = r0.values
            r3 = r3[r2]
            java.lang.Object r4 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r3 == r4) goto L21
            java.lang.Object[] r3 = r0.values
            java.lang.Object r4 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            r3[r2] = r4
            r3 = 1
            r0.garbage = r3
        L21:
            return
    }

    public boolean remove(long r6, E r8) {
            r5 = this;
            r0 = r5
            r1 = 0
            int r2 = r0.indexOfKey(r6)
            if (r2 < 0) goto L17
            java.lang.Object r3 = r0.valueAt(r2)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r3)
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
            java.lang.Object r3 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r2 == r3) goto L17
            java.lang.Object[] r2 = r0.values
            java.lang.Object r3 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            r2[r5] = r3
            r2 = 1
            r0.garbage = r2
        L17:
            return
    }

    public E replace(long r6, E r8) {
            r5 = this;
            r0 = r5
            r1 = 0
            int r2 = r0.indexOfKey(r6)
            if (r2 < 0) goto L11
            java.lang.Object[] r3 = r0.values
            r3 = r3[r2]
            java.lang.Object[] r4 = r0.values
            r4[r2] = r8
            goto L12
        L11:
            r3 = 0
        L12:
            return r3
    }

    public boolean replace(long r6, E r8, E r9) {
            r5 = this;
            r0 = r5
            r1 = 0
            int r2 = r0.indexOfKey(r6)
            if (r2 < 0) goto L18
            java.lang.Object[] r3 = r0.values
            r3 = r3[r2]
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r8)
            if (r4 == 0) goto L18
            java.lang.Object[] r4 = r0.values
            r4[r2] = r9
            r4 = 1
            goto L19
        L18:
            r4 = 0
        L19:
            return r4
    }

    public void setValueAt(int r14, E r15) {
            r13 = this;
            r0 = r13
            r1 = 0
            r2 = 0
            if (r14 < 0) goto Lb
            int r3 = r0.size
            if (r14 >= r3) goto Lb
            r3 = 1
            goto Lc
        Lb:
            r3 = r2
        Lc:
            if (r3 == 0) goto L41
            boolean r3 = r0.garbage
            if (r3 == 0) goto L3b
            r3 = r0
            r4 = 0
            int r5 = r3.size
            r6 = 0
            long[] r7 = r3.keys
            java.lang.Object[] r8 = r3.values
            r9 = 0
        L1c:
            if (r9 >= r5) goto L36
            r10 = r8[r9]
            java.lang.Object r11 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r10 == r11) goto L33
            if (r9 == r6) goto L31
            r11 = r7[r9]
            r7[r6] = r11
            r8[r6] = r10
            r11 = 0
            r8[r9] = r11
        L31:
            int r6 = r6 + 1
        L33:
            int r9 = r9 + 1
            goto L1c
        L36:
            r3.garbage = r2
            r3.size = r6
        L3b:
            java.lang.Object[] r2 = r0.values
            r2[r14] = r15
            return
        L41:
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Expected index to be within 0..size()-1, but was "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r14)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public int size() {
            r12 = this;
            r0 = r12
            r1 = 0
            boolean r2 = r0.garbage
            if (r2 == 0) goto L30
            r2 = r0
            r3 = 0
            int r4 = r2.size
            r5 = 0
            long[] r6 = r2.keys
            java.lang.Object[] r7 = r2.values
            r8 = 0
        L10:
            if (r8 >= r4) goto L2a
            r9 = r7[r8]
            java.lang.Object r10 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r9 == r10) goto L27
            if (r8 == r5) goto L25
            r10 = r6[r8]
            r6[r5] = r10
            r7[r5] = r9
            r10 = 0
            r7[r8] = r10
        L25:
            int r5 = r5 + 1
        L27:
            int r8 = r8 + 1
            goto L10
        L2a:
            r8 = 0
            r2.garbage = r8
            r2.size = r5
        L30:
            int r0 = r0.size
            return r0
    }

    public java.lang.String toString() {
            r11 = this;
            r0 = r11
            r1 = 0
            int r2 = r0.size()
            if (r2 > 0) goto Lb
            java.lang.String r2 = "{}"
            goto L54
        Lb:
            int r2 = r0.size
            int r2 = r2 * 28
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r2 = r3
            r4 = 0
            r5 = 123(0x7b, float:1.72E-43)
            r2.append(r5)
            r5 = 0
            int r6 = r0.size
        L1e:
            if (r5 >= r6) goto L45
            if (r5 <= 0) goto L27
            java.lang.String r7 = ", "
            r2.append(r7)
        L27:
            long r7 = r0.keyAt(r5)
            r2.append(r7)
            r9 = 61
            r2.append(r9)
            java.lang.Object r9 = r0.valueAt(r5)
            if (r9 == r2) goto L3d
            r2.append(r9)
            goto L42
        L3d:
            java.lang.String r10 = "(this Map)"
            r2.append(r10)
        L42:
            int r5 = r5 + 1
            goto L1e
        L45:
            r5 = 125(0x7d, float:1.75E-43)
            r2.append(r5)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
        L54:
            return r2
    }

    public E valueAt(int r14) {
            r13 = this;
            r0 = r13
            r1 = 0
            r2 = 0
            if (r14 < 0) goto Lb
            int r3 = r0.size
            if (r14 >= r3) goto Lb
            r3 = 1
            goto Lc
        Lb:
            r3 = r2
        Lc:
            if (r3 == 0) goto L40
            boolean r3 = r0.garbage
            if (r3 == 0) goto L3b
            r3 = r0
            r4 = 0
            int r5 = r3.size
            r6 = 0
            long[] r7 = r3.keys
            java.lang.Object[] r8 = r3.values
            r9 = 0
        L1c:
            if (r9 >= r5) goto L36
            r10 = r8[r9]
            java.lang.Object r11 = androidx.collection.LongSparseArrayKt.access$getDELETED$p()
            if (r10 == r11) goto L33
            if (r9 == r6) goto L31
            r11 = r7[r9]
            r7[r6] = r11
            r8[r6] = r10
            r11 = 0
            r8[r9] = r11
        L31:
            int r6 = r6 + 1
        L33:
            int r9 = r9 + 1
            goto L1c
        L36:
            r3.garbage = r2
            r3.size = r6
        L3b:
            java.lang.Object[] r2 = r0.values
            r0 = r2[r14]
            return r0
        L40:
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Expected index to be within 0..size()-1, but was "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r14)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }
}
