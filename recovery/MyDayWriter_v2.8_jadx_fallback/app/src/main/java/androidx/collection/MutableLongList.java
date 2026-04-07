package androidx.collection;

/* JADX INFO: compiled from: LongList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\b\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001J\u0018\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001J\u0018\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0003J\u0011\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\u0002J\u0011\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086\nJ\u0011\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\u0002J\u0011\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\u0002J\u0011\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086\nJ\u0011\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\u0002J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0017\u001a\u00020\f2\b\b\u0001\u0010\n\u001a\u00020\u0003J\u001a\u0010\u0018\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001J\u000e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u001b\u0010\u001c\u001a\u00020\f2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002J\u0006\u0010\u001d\u001a\u00020\tJ\u0006\u0010\u001e\u001a\u00020\tJ\u0010\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u0003R\u0012\u0010\u0005\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006!"}, d2 = {"Landroidx/collection/MutableLongList;", "Landroidx/collection/LongList;", "initialCapacity", "", "(I)V", "capacity", "getCapacity", "()I", "add", "", "index", "element", "", "", "addAll", "elements", "", "clear", "ensureCapacity", "minusAssign", "plusAssign", "remove", "removeAll", "removeAt", "removeRange", "start", "end", "retainAll", "set", "sort", "sortDescending", "trim", "minCapacity", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableLongList extends androidx.collection.LongList {
    public MutableLongList() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public MutableLongList(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public /* synthetic */ MutableLongList(int r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 16
        L6:
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ void trim$default(androidx.collection.MutableLongList r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            int r1 = r0._size
        L6:
            r0.trim(r1)
            return
    }

    public final void add(int r5, long r6) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 < 0) goto L9
            int r2 = r4._size
            if (r5 > r2) goto L9
            r0 = r1
        L9:
            if (r0 == 0) goto L29
            int r0 = r4._size
            int r0 = r0 + r1
            r4.ensureCapacity(r0)
            long[] r0 = r4.content
            int r2 = r4._size
            if (r5 == r2) goto L21
        L19:
            int r2 = r5 + 1
            int r3 = r4._size
            kotlin.collections.ArraysKt.copyInto(r0, r0, r2, r5, r3)
        L21:
            r0[r5] = r6
            int r2 = r4._size
            int r2 = r2 + r1
            r4._size = r2
            return
        L29:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = " must be in 0.."
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r4._size
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final boolean add(long r4) {
            r3 = this;
            int r0 = r3._size
            r1 = 1
            int r0 = r0 + r1
            r3.ensureCapacity(r0)
            long[] r0 = r3.content
            int r2 = r3._size
            r0[r2] = r4
            int r0 = r3._size
            int r0 = r0 + r1
            r3._size = r0
            return r1
    }

    public final boolean addAll(int r6, androidx.collection.LongList r7) {
            r5 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 1
            r1 = 0
            if (r6 < 0) goto Lf
            int r2 = r5._size
            if (r6 > r2) goto Lf
            r2 = r0
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L44
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L19
            return r1
        L19:
            int r2 = r5._size
            int r3 = r7._size
            int r2 = r2 + r3
            r5.ensureCapacity(r2)
            long[] r2 = r5.content
            int r3 = r5._size
            if (r6 == r3) goto L32
        L29:
            int r3 = r7._size
            int r3 = r3 + r6
            int r4 = r5._size
            kotlin.collections.ArraysKt.copyInto(r2, r2, r3, r6, r4)
        L32:
            long[] r3 = r7.content
            int r4 = r7._size
            kotlin.collections.ArraysKt.copyInto(r3, r2, r6, r1, r4)
            int r1 = r5._size
            int r3 = r7._size
            int r1 = r1 + r3
            r5._size = r1
            return r0
        L44:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = " must be in 0.."
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r5._size
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final boolean addAll(int r10, long[] r11) {
            r9 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 1
            r1 = 0
            if (r10 < 0) goto Lf
            int r2 = r9._size
            if (r10 > r2) goto Lf
            r2 = r0
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L43
            int r2 = r11.length
            if (r2 != 0) goto L17
            r2 = r0
            goto L18
        L17:
            r2 = r1
        L18:
            if (r2 == 0) goto L1b
            return r1
        L1b:
            int r1 = r9._size
            int r2 = r11.length
            int r1 = r1 + r2
            r9.ensureCapacity(r1)
            long[] r3 = r9.content
            int r1 = r9._size
            if (r10 == r1) goto L32
        L2a:
            int r1 = r11.length
            int r1 = r1 + r10
            int r2 = r9._size
            kotlin.collections.ArraysKt.copyInto(r3, r3, r1, r10, r2)
        L32:
            r7 = 12
            r8 = 0
            r5 = 0
            r6 = 0
            r4 = r10
            r2 = r11
            kotlin.collections.ArraysKt.copyInto$default(r2, r3, r4, r5, r6, r7, r8)
            int r10 = r9._size
            int r11 = r2.length
            int r10 = r10 + r11
            r9._size = r10
            return r0
        L43:
            r4 = r10
            r2 = r11
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Index "
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.StringBuilder r11 = r11.append(r4)
            java.lang.String r0 = " must be in 0.."
            java.lang.StringBuilder r11 = r11.append(r0)
            int r0 = r9._size
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
    }

    public final boolean addAll(androidx.collection.LongList r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r1._size
            boolean r0 = r1.addAll(r0, r2)
            return r0
    }

    public final boolean addAll(long[] r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r1._size
            boolean r0 = r1.addAll(r0, r2)
            return r0
    }

    public final void clear() {
            r1 = this;
            r0 = 0
            r1._size = r0
            return
    }

    public final void ensureCapacity(int r5) {
            r4 = this;
            long[] r0 = r4.content
            int r1 = r0.length
            if (r1 >= r5) goto L19
            int r1 = r0.length
            int r1 = r1 * 3
            int r1 = r1 / 2
            int r1 = java.lang.Math.max(r5, r1)
            long[] r2 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r3 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r4.content = r2
        L19:
            return
    }

    public final int getCapacity() {
            r2 = this;
            r0 = 0
            long[] r1 = r2.content
            int r1 = r1.length
            return r1
    }

    public final void minusAssign(long r2) {
            r1 = this;
            r0 = 0
            r1.remove(r2)
            return
    }

    public final void minusAssign(androidx.collection.LongList r9) {
            r8 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r9
            r1 = 0
            long[] r2 = r0.content
            r3 = 0
            int r4 = r0._size
        Ld:
            if (r3 >= r4) goto L1a
            r5 = r2[r3]
            r7 = 0
            r8.remove(r5)
            int r3 = r3 + 1
            goto Ld
        L1a:
            return
    }

    public final void minusAssign(long[] r10) {
            r9 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = r10
            r1 = 0
            int r2 = r0.length
            r3 = 0
        L9:
            if (r3 >= r2) goto L17
            r4 = r0[r3]
            r6 = r4
            r8 = 0
            r9.remove(r6)
            int r3 = r3 + 1
            goto L9
        L17:
            return
    }

    public final void plusAssign(long r2) {
            r1 = this;
            r0 = 0
            r1.add(r2)
            return
    }

    public final void plusAssign(androidx.collection.LongList r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r1._size
            r1.addAll(r0, r2)
            return
    }

    public final void plusAssign(long[] r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r1._size
            r1.addAll(r0, r2)
            return
    }

    public final boolean remove(long r3) {
            r2 = this;
            int r0 = r2.indexOf(r3)
            if (r0 < 0) goto Lb
            r2.removeAt(r0)
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public final boolean removeAll(androidx.collection.LongList r7) {
            r6 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r6._size
            r1 = 0
            r2 = r7
            r3 = 0
            int r4 = r2._size
            r5 = 1
            int r4 = r4 - r5
            if (r1 > r4) goto L1c
        L10:
            long r2 = r7.get(r1)
            r6.remove(r2)
            if (r1 == r4) goto L1c
            int r1 = r1 + 1
            goto L10
        L1c:
            int r1 = r6._size
            if (r0 == r1) goto L21
            goto L22
        L21:
            r5 = 0
        L22:
            return r5
    }

    public final boolean removeAll(long[] r6) {
            r5 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r5._size
            r1 = 0
            int r2 = r6.length
        L9:
            if (r1 >= r2) goto L13
            r3 = r6[r1]
            r5.remove(r3)
            int r1 = r1 + 1
            goto L9
        L13:
            int r1 = r5._size
            if (r0 == r1) goto L19
            r1 = 1
            goto L1a
        L19:
            r1 = 0
        L1a:
            return r1
    }

    public final long removeAt(int r8) {
            r7 = this;
            r0 = 0
            r1 = 1
            if (r8 < 0) goto L9
            int r2 = r7._size
            if (r8 >= r2) goto L9
            r0 = r1
        L9:
            if (r0 == 0) goto L29
            long[] r0 = r7.content
            r2 = r0[r8]
            r4 = r7
            androidx.collection.LongList r4 = (androidx.collection.LongList) r4
            r5 = 0
            int r6 = r4._size
            int r6 = r6 - r1
            if (r8 == r6) goto L22
        L1b:
            int r1 = r8 + 1
            int r4 = r7._size
            kotlin.collections.ArraysKt.copyInto(r0, r0, r8, r1, r4)
        L22:
            int r1 = r7._size
            int r1 = r1 + (-1)
            r7._size = r1
            return r2
        L29:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Index "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r3 = " must be in 0.."
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            androidx.collection.LongList r3 = (androidx.collection.LongList) r3
            r4 = 0
            int r5 = r3._size
            int r5 = r5 - r1
            java.lang.StringBuilder r1 = r2.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void removeRange(int r5, int r6) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 < 0) goto La
            int r2 = r4._size
            if (r5 > r2) goto La
            r2 = r0
            goto Lb
        La:
            r2 = r1
        Lb:
            java.lang.String r3 = "Start ("
            if (r2 == 0) goto L5b
            if (r6 < 0) goto L16
            int r2 = r4._size
            if (r6 > r2) goto L16
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 == 0) goto L5b
            if (r6 < r5) goto L34
            if (r6 == r5) goto L33
            int r0 = r4._size
            if (r6 >= r0) goto L2c
            long[] r0 = r4.content
            long[] r1 = r4.content
            int r2 = r4._size
            kotlin.collections.ArraysKt.copyInto(r0, r1, r5, r6, r2)
        L2c:
            int r0 = r4._size
            int r1 = r6 - r5
            int r0 = r0 - r1
            r4._size = r0
        L33:
            return
        L34:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = ") is more than end ("
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            r2 = 41
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5b:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = ") and end ("
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = ") must be in 0.."
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r4._size
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final boolean retainAll(androidx.collection.LongList r8) {
            r7 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r7._size
            long[] r1 = r7.content
            r2 = r7
            androidx.collection.LongList r2 = (androidx.collection.LongList) r2
            r3 = 0
            int r4 = r2._size
            r5 = 1
            int r4 = r4 - r5
        L12:
            r2 = -1
            if (r2 >= r4) goto L23
            r2 = r1[r4]
            boolean r6 = r8.contains(r2)
            if (r6 != 0) goto L20
            r7.removeAt(r4)
        L20:
            int r4 = r4 + (-1)
            goto L12
        L23:
            int r2 = r7._size
            if (r0 == r2) goto L28
            goto L29
        L28:
            r5 = 0
        L29:
            return r5
    }

    public final boolean retainAll(long[] r19) {
            r18 = this;
            r0 = r18
            java.lang.String r1 = "elements"
            r2 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            int r1 = r0._size
            long[] r3 = r0.content
            r4 = r0
            androidx.collection.LongList r4 = (androidx.collection.LongList) r4
            r5 = 0
            int r6 = r4._size
            r7 = 1
            int r6 = r6 - r7
        L16:
            r4 = 0
            r5 = -1
            if (r5 >= r6) goto L3e
            r8 = r3[r6]
            r10 = r19
            r11 = 0
            r12 = 0
            int r13 = r10.length
        L21:
            if (r12 >= r13) goto L35
            r14 = r10[r12]
            r16 = 0
            int r17 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r17 != 0) goto L2d
            r14 = r7
            goto L2e
        L2d:
            r14 = r4
        L2e:
            if (r14 == 0) goto L32
            r5 = r12
            goto L36
        L32:
            int r12 = r12 + 1
            goto L21
        L35:
        L36:
            if (r5 >= 0) goto L3b
            r0.removeAt(r6)
        L3b:
            int r6 = r6 + (-1)
            goto L16
        L3e:
            int r5 = r0._size
            if (r1 == r5) goto L43
            goto L44
        L43:
            r7 = r4
        L44:
            return r7
    }

    public final long set(int r7, long r8) {
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 < 0) goto L9
            int r2 = r6._size
            if (r7 >= r2) goto L9
            r1 = r0
        L9:
            if (r1 == 0) goto L12
            long[] r0 = r6.content
            r1 = r0[r7]
            r0[r7] = r8
            return r1
        L12:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "set index "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r3 = " must be between 0 .. "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            androidx.collection.LongList r3 = (androidx.collection.LongList) r3
            r4 = 0
            int r5 = r3._size
            int r5 = r5 - r0
            java.lang.StringBuilder r0 = r2.append(r5)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public final void sort() {
            r3 = this;
            long[] r0 = r3.content
            r1 = 0
            int r2 = r3._size
            kotlin.collections.ArraysKt.sort(r0, r1, r2)
            return
    }

    public final void sortDescending() {
            r3 = this;
            long[] r0 = r3.content
            r1 = 0
            int r2 = r3._size
            kotlin.collections.ArraysKt.sortDescending(r0, r1, r2)
            return
    }

    public final void trim(int r5) {
            r4 = this;
            int r0 = r4._size
            int r0 = java.lang.Math.max(r5, r0)
            r1 = r4
            r2 = 0
            long[] r3 = r1.content
            int r1 = r3.length
            if (r1 <= r0) goto L1a
            long[] r1 = r4.content
            long[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r2 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r4.content = r1
        L1a:
            return
    }
}
