package androidx.collection;

/* JADX INFO: compiled from: LongSparseArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\u001a.\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\u0011\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0005H\u0080\b\u001a!\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0080\b\u001a&\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0005H\u0080\b\u001a(\u0010\u0017\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0080\b¢\u0006\u0002\u0010\u0018\u001a.\u0010\u0017\u001a\u0002H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u001a\u001a:\u0010\u001b\u001a\u0002H\u0004\"\n\b\u0000\u0010\u0004*\u0004\u0018\u0001H\f\"\u0004\b\u0001\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\u001a\u001a!\u0010\u001c\u001a\u00020\u0003\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0080\b\u001a&\u0010\u001d\u001a\u00020\u0003\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u001e\u001a\u0019\u0010\u001f\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0005H\u0080\b\u001a!\u0010 \u001a\u00020\u000e\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010!\u001a\u00020\u0003H\u0080\b\u001a.\u0010\"\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u0010\u001a)\u0010#\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\f0\u0005H\u0080\b\u001a0\u0010%\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u001a\u001a!\u0010&\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0080\b\u001a.\u0010&\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010'\u001a!\u0010(\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010!\u001a\u00020\u0003H\u0080\b\u001a0\u0010)\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u001a\u001a6\u0010)\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010*\u001a\u0002H\f2\u0006\u0010+\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010,\u001a.\u0010-\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010.\u001a\u0019\u0010/\u001a\u00020\u0003\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0005H\u0080\b\u001a\u0019\u00100\u001a\u000201\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0005H\u0080\b\u001a&\u00102\u001a\u0002H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010!\u001a\u00020\u0003H\u0080\b¢\u0006\u0002\u00103\u001a!\u00104\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0086\n\u001aT\u00105\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u000526\u00106\u001a2\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(\r\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u000b07H\u0086\bø\u0001\u0000\u001a.\u0010:\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u0002H\u0004H\u0086\b¢\u0006\u0002\u0010\u001a\u001a7\u0010;\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00040<H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010=\u001a\u0019\u0010>\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0086\b\u001a\u0016\u0010?\u001a\u00020@\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005\u001a-\u0010A\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0005\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0086\u0002\u001a-\u0010B\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\u0004H\u0007¢\u0006\u0002\u0010'\u001a.\u0010C\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\u0004H\u0086\n¢\u0006\u0002\u0010\u0010\u001a\u001c\u0010D\u001a\b\u0012\u0004\u0012\u0002H\u00040E\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"(\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00058Æ\u0002¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006F"}, d2 = {"DELETED", "", "size", "", "T", "Landroidx/collection/LongSparseArray;", "getSize$annotations", "(Landroidx/collection/LongSparseArray;)V", "getSize", "(Landroidx/collection/LongSparseArray;)I", "commonAppend", "", "E", "key", "", "value", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)V", "commonClear", "commonContainsKey", "", "commonContainsValue", "(Landroidx/collection/LongSparseArray;Ljava/lang/Object;)Z", "commonGc", "commonGet", "(Landroidx/collection/LongSparseArray;J)Ljava/lang/Object;", "defaultValue", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "commonGetInternal", "commonIndexOfKey", "commonIndexOfValue", "(Landroidx/collection/LongSparseArray;Ljava/lang/Object;)I", "commonIsEmpty", "commonKeyAt", "index", "commonPut", "commonPutAll", "other", "commonPutIfAbsent", "commonRemove", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)Z", "commonRemoveAt", "commonReplace", "oldValue", "newValue", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;Ljava/lang/Object;)Z", "commonSetValueAt", "(Landroidx/collection/LongSparseArray;ILjava/lang/Object;)V", "commonSize", "commonToString", "", "commonValueAt", "(Landroidx/collection/LongSparseArray;I)Ljava/lang/Object;", "contains", "forEach", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getOrDefault", "getOrElse", "Lkotlin/Function0;", "(Landroidx/collection/LongSparseArray;JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "keyIterator", "Lkotlin/collections/LongIterator;", "plus", "remove", "set", "valueIterator", "", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LongSparseArrayKt {
    private static final java.lang.Object DELETED = null;


    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.collection.LongSparseArrayKt$valueIterator$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LongSparseArray.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u000e\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"androidx/collection/LongSparseArrayKt$valueIterator$1", "", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C00081<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
        final /* synthetic */ androidx.collection.LongSparseArray<T> $this_valueIterator;
        private int index;

        C00081(androidx.collection.LongSparseArray<T> r1) {
                r0 = this;
                r0.$this_valueIterator = r1
                r0.<init>()
                return
        }

        public final int getIndex() {
                r1 = this;
                int r0 = r1.index
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.index
                androidx.collection.LongSparseArray<T> r1 = r2.$this_valueIterator
                int r1 = r1.size()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                androidx.collection.LongSparseArray<T> r0 = r3.$this_valueIterator
                int r1 = r3.index
                int r2 = r1 + 1
                r3.index = r2
                java.lang.Object r0 = r0.valueAt(r1)
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        public final void setIndex(int r1) {
                r0 = this;
                r0.index = r1
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.collection.LongSparseArrayKt.DELETED = r0
            return
    }

    public static final /* synthetic */ java.lang.Object access$getDELETED$p() {
            java.lang.Object r0 = androidx.collection.LongSparseArrayKt.DELETED
            return r0
    }

    public static final <E> void commonAppend(androidx.collection.LongSparseArray<E> r11, long r12, E r14) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            int r1 = r11.size
            if (r1 == 0) goto L1a
            long[] r1 = r11.keys
            int r2 = r11.size
            int r2 = r2 + (-1)
            r2 = r1[r2]
            int r1 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r1 > 0) goto L1a
            r11.put(r12, r14)
            return
        L1a:
            boolean r1 = r11.garbage
            if (r1 == 0) goto L4f
            int r1 = r11.size
            long[] r2 = r11.keys
            int r2 = r2.length
            if (r1 < r2) goto L4f
            r1 = r11
            r2 = 0
            int r3 = r1.size
            r4 = 0
            long[] r5 = r1.keys
            java.lang.Object[] r6 = r1.values
            r7 = 0
        L2f:
            if (r7 >= r3) goto L49
            r8 = r6[r7]
            java.lang.Object r9 = access$getDELETED$p()
            if (r8 == r9) goto L46
            if (r7 == r4) goto L44
            r9 = r5[r7]
            r5[r4] = r9
            r6[r4] = r8
            r9 = 0
            r6[r7] = r9
        L44:
            int r4 = r4 + 1
        L46:
            int r7 = r7 + 1
            goto L2f
        L49:
            r7 = 0
            r1.garbage = r7
            r1.size = r4
        L4f:
            int r1 = r11.size
            long[] r2 = r11.keys
            int r2 = r2.length
            if (r1 < r2) goto L74
            int r2 = r1 + 1
            int r2 = androidx.collection.internal.ContainerHelpersKt.idealLongArraySize(r2)
            long[] r3 = r11.keys
            long[] r3 = java.util.Arrays.copyOf(r3, r2)
            java.lang.String r4 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r11.keys = r3
            java.lang.Object[] r3 = r11.values
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r11.values = r3
        L74:
            long[] r2 = r11.keys
            r2[r1] = r12
            java.lang.Object[] r2 = r11.values
            r2[r1] = r14
            int r2 = r1 + 1
            r11.size = r2
            return
    }

    public static final <E> void commonClear(androidx.collection.LongSparseArray<E> r5) {
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

    public static final <E> boolean commonContainsKey(androidx.collection.LongSparseArray<E> r2, long r3) {
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

    public static final <E> boolean commonContainsValue(androidx.collection.LongSparseArray<E> r2, E r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            int r1 = r2.indexOfValue(r3)
            if (r1 < 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public static final <E> void commonGc(androidx.collection.LongSparseArray<E> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r1 = r9.size
            r2 = 0
            long[] r3 = r9.keys
            java.lang.Object[] r4 = r9.values
            r5 = 0
        Le:
            if (r5 >= r1) goto L28
            r6 = r4[r5]
            java.lang.Object r7 = access$getDELETED$p()
            if (r6 == r7) goto L25
            if (r5 == r2) goto L23
            r7 = r3[r5]
            r3[r2] = r7
            r4[r2] = r6
            r7 = 0
            r4[r5] = r7
        L23:
            int r2 = r2 + 1
        L25:
            int r5 = r5 + 1
            goto Le
        L28:
            r5 = 0
            r9.garbage = r5
            r9.size = r2
            return
    }

    public static final <E> E commonGet(androidx.collection.LongSparseArray<E> r7, long r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            r1 = 0
            r2 = r7
            r3 = 0
            long[] r4 = r2.keys
            int r5 = r2.size
            int r4 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r4, r5, r8)
            if (r4 < 0) goto L23
            java.lang.Object[] r5 = r2.values
            r5 = r5[r4]
            java.lang.Object r6 = access$getDELETED$p()
            if (r5 != r6) goto L1e
            goto L23
        L1e:
            java.lang.Object[] r5 = r2.values
            r5 = r5[r4]
            goto L24
        L23:
            r5 = r1
        L24:
            return r5
    }

    public static final <E> E commonGet(androidx.collection.LongSparseArray<E> r6, long r7, E r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = r6
            r2 = 0
            long[] r3 = r1.keys
            int r4 = r1.size
            int r3 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r3, r4, r7)
            if (r3 < 0) goto L22
            java.lang.Object[] r4 = r1.values
            r4 = r4[r3]
            java.lang.Object r5 = access$getDELETED$p()
            if (r4 != r5) goto L1d
            goto L22
        L1d:
            java.lang.Object[] r4 = r1.values
            r4 = r4[r3]
            goto L23
        L22:
            r4 = r9
        L23:
            return r4
    }

    public static final <T extends E, E> T commonGetInternal(androidx.collection.LongSparseArray<E> r4, long r5, T r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            long[] r1 = r4.keys
            int r2 = r4.size
            int r1 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r1, r2, r5)
            if (r1 < 0) goto L20
            java.lang.Object[] r2 = r4.values
            r2 = r2[r1]
            java.lang.Object r3 = access$getDELETED$p()
            if (r2 != r3) goto L1b
            goto L20
        L1b:
            java.lang.Object[] r2 = r4.values
            r2 = r2[r1]
            goto L21
        L20:
            r2 = r7
        L21:
            return r2
    }

    public static final <E> int commonIndexOfKey(androidx.collection.LongSparseArray<E> r11, long r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            boolean r1 = r11.garbage
            if (r1 == 0) goto L34
            r1 = r11
            r2 = 0
            int r3 = r1.size
            r4 = 0
            long[] r5 = r1.keys
            java.lang.Object[] r6 = r1.values
            r7 = 0
        L14:
            if (r7 >= r3) goto L2e
            r8 = r6[r7]
            java.lang.Object r9 = access$getDELETED$p()
            if (r8 == r9) goto L2b
            if (r7 == r4) goto L29
            r9 = r5[r7]
            r5[r4] = r9
            r6[r4] = r8
            r9 = 0
            r6[r7] = r9
        L29:
            int r4 = r4 + 1
        L2b:
            int r7 = r7 + 1
            goto L14
        L2e:
            r7 = 0
            r1.garbage = r7
            r1.size = r4
        L34:
            long[] r1 = r11.keys
            int r2 = r11.size
            int r1 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r1, r2, r12)
            return r1
    }

    public static final <E> int commonIndexOfValue(androidx.collection.LongSparseArray<E> r12, E r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            boolean r1 = r12.garbage
            r2 = 0
            if (r1 == 0) goto L34
            r1 = r12
            r3 = 0
            int r4 = r1.size
            r5 = 0
            long[] r6 = r1.keys
            java.lang.Object[] r7 = r1.values
            r8 = 0
        L15:
            if (r8 >= r4) goto L2f
            r9 = r7[r8]
            java.lang.Object r10 = access$getDELETED$p()
            if (r9 == r10) goto L2c
            if (r8 == r5) goto L2a
            r10 = r6[r8]
            r6[r5] = r10
            r7[r5] = r9
            r10 = 0
            r7[r8] = r10
        L2a:
            int r5 = r5 + 1
        L2c:
            int r8 = r8 + 1
            goto L15
        L2f:
            r1.garbage = r2
            r1.size = r5
        L34:
            int r1 = r12.size
        L36:
            if (r2 >= r1) goto L45
            r3 = r2
            r4 = 0
            java.lang.Object[] r5 = r12.values
            r5 = r5[r3]
            if (r5 != r13) goto L41
            return r3
        L41:
            int r2 = r2 + 1
            goto L36
        L45:
            r1 = -1
            return r1
    }

    public static final <E> boolean commonIsEmpty(androidx.collection.LongSparseArray<E> r2) {
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

    public static final <E> long commonKeyAt(androidx.collection.LongSparseArray<E> r12, int r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            r1 = 0
            if (r13 < 0) goto Lf
            int r2 = r12.size
            if (r13 >= r2) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L44
            boolean r2 = r12.garbage
            if (r2 == 0) goto L3f
            r2 = r12
            r3 = 0
            int r4 = r2.size
            r5 = 0
            long[] r6 = r2.keys
            java.lang.Object[] r7 = r2.values
            r8 = 0
        L20:
            if (r8 >= r4) goto L3a
            r9 = r7[r8]
            java.lang.Object r10 = access$getDELETED$p()
            if (r9 == r10) goto L37
            if (r8 == r5) goto L35
            r10 = r6[r8]
            r6[r5] = r10
            r7[r5] = r9
            r10 = 0
            r7[r8] = r10
        L35:
            int r5 = r5 + 1
        L37:
            int r8 = r8 + 1
            goto L20
        L3a:
            r2.garbage = r1
            r2.size = r5
        L3f:
            long[] r1 = r12.keys
            r2 = r1[r13]
            return r2
        L44:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected index to be within 0..size()-1, but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r13)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final <E> void commonPut(androidx.collection.LongSparseArray<E> r12, long r13, E r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            long[] r1 = r12.keys
            int r2 = r12.size
            int r1 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r1, r2, r13)
            if (r1 < 0) goto L16
            java.lang.Object[] r2 = r12.values
            r2[r1] = r15
            goto Lbe
        L16:
            int r1 = ~r1
            int r2 = r12.size
            if (r1 >= r2) goto L2e
            java.lang.Object[] r2 = r12.values
            r2 = r2[r1]
            java.lang.Object r3 = access$getDELETED$p()
            if (r2 != r3) goto L2e
            long[] r2 = r12.keys
            r2[r1] = r13
            java.lang.Object[] r2 = r12.values
            r2[r1] = r15
            return
        L2e:
            boolean r2 = r12.garbage
            if (r2 == 0) goto L6c
            int r2 = r12.size
            long[] r3 = r12.keys
            int r3 = r3.length
            if (r2 < r3) goto L6c
            r2 = r12
            r3 = 0
            int r4 = r2.size
            r5 = 0
            long[] r6 = r2.keys
            java.lang.Object[] r7 = r2.values
            r8 = 0
        L43:
            if (r8 >= r4) goto L5d
            r9 = r7[r8]
            java.lang.Object r10 = access$getDELETED$p()
            if (r9 == r10) goto L5a
            if (r8 == r5) goto L58
            r10 = r6[r8]
            r6[r5] = r10
            r7[r5] = r9
            r10 = 0
            r7[r8] = r10
        L58:
            int r5 = r5 + 1
        L5a:
            int r8 = r8 + 1
            goto L43
        L5d:
            r8 = 0
            r2.garbage = r8
            r2.size = r5
            long[] r2 = r12.keys
            int r3 = r12.size
            int r2 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r2, r3, r13)
            int r1 = ~r2
        L6c:
            int r2 = r12.size
            long[] r3 = r12.keys
            int r3 = r3.length
            if (r2 < r3) goto L93
            int r2 = r12.size
            int r2 = r2 + 1
            int r2 = androidx.collection.internal.ContainerHelpersKt.idealLongArraySize(r2)
            long[] r3 = r12.keys
            long[] r3 = java.util.Arrays.copyOf(r3, r2)
            java.lang.String r4 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r12.keys = r3
            java.lang.Object[] r3 = r12.values
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r12.values = r3
        L93:
            int r2 = r12.size
            int r2 = r2 - r1
            if (r2 == 0) goto Lb0
            long[] r2 = r12.keys
            long[] r3 = r12.keys
            int r4 = r1 + 1
            int r5 = r12.size
            kotlin.collections.ArraysKt.copyInto(r2, r3, r4, r1, r5)
            java.lang.Object[] r2 = r12.values
            java.lang.Object[] r3 = r12.values
            int r4 = r1 + 1
            int r5 = r12.size
            kotlin.collections.ArraysKt.copyInto(r2, r3, r4, r1, r5)
        Lb0:
            long[] r2 = r12.keys
            r2[r1] = r13
            java.lang.Object[] r2 = r12.values
            r2[r1] = r15
            int r2 = r12.size
            int r2 = r2 + 1
            r12.size = r2
        Lbe:
            return
    }

    public static final <E> void commonPutAll(androidx.collection.LongSparseArray<E> r8, androidx.collection.LongSparseArray<? extends E> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r1 = r9.size()
            r2 = 0
        L10:
            if (r2 >= r1) goto L23
            r3 = r2
            r4 = 0
            long r5 = r9.keyAt(r3)
            java.lang.Object r7 = r9.valueAt(r3)
            r8.put(r5, r7)
            int r2 = r2 + 1
            goto L10
        L23:
            return
    }

    public static final <E> E commonPutIfAbsent(androidx.collection.LongSparseArray<E> r2, long r3, E r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            java.lang.Object r1 = r2.get(r3)
            if (r1 != 0) goto Lf
            r2.put(r3, r5)
        Lf:
            return r1
    }

    public static final <E> void commonRemove(androidx.collection.LongSparseArray<E> r4, long r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            long[] r1 = r4.keys
            int r2 = r4.size
            int r1 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r1, r2, r5)
            if (r1 < 0) goto L25
            java.lang.Object[] r2 = r4.values
            r2 = r2[r1]
            java.lang.Object r3 = access$getDELETED$p()
            if (r2 == r3) goto L25
            java.lang.Object[] r2 = r4.values
            java.lang.Object r3 = access$getDELETED$p()
            r2[r1] = r3
            r2 = 1
            r4.garbage = r2
        L25:
            return
    }

    public static final <E> boolean commonRemove(androidx.collection.LongSparseArray<E> r4, long r5, E r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            int r1 = r4.indexOfKey(r5)
            if (r1 < 0) goto L1b
            java.lang.Object r2 = r4.valueAt(r1)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r2)
            if (r3 == 0) goto L1b
            r4.removeAt(r1)
            r3 = 1
            return r3
        L1b:
            r2 = 0
            return r2
    }

    public static final <E> void commonRemoveAt(androidx.collection.LongSparseArray<E> r3, int r4) {
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

    public static final <E> E commonReplace(androidx.collection.LongSparseArray<E> r4, long r5, E r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            int r1 = r4.indexOfKey(r5)
            if (r1 < 0) goto L15
            java.lang.Object[] r2 = r4.values
            r2 = r2[r1]
            java.lang.Object[] r3 = r4.values
            r3[r1] = r7
            return r2
        L15:
            r2 = 0
            return r2
    }

    public static final <E> boolean commonReplace(androidx.collection.LongSparseArray<E> r4, long r5, E r7, E r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            int r1 = r4.indexOfKey(r5)
            if (r1 < 0) goto L1c
            java.lang.Object[] r2 = r4.values
            r2 = r2[r1]
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r7)
            if (r3 == 0) goto L1c
            java.lang.Object[] r3 = r4.values
            r3[r1] = r8
            r3 = 1
            return r3
        L1c:
            r2 = 0
            return r2
    }

    public static final <E> void commonSetValueAt(androidx.collection.LongSparseArray<E> r12, int r13, E r14) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            r1 = 0
            if (r13 < 0) goto Lf
            int r2 = r12.size
            if (r13 >= r2) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L44
            boolean r2 = r12.garbage
            if (r2 == 0) goto L3f
            r2 = r12
            r3 = 0
            int r4 = r2.size
            r5 = 0
            long[] r6 = r2.keys
            java.lang.Object[] r7 = r2.values
            r8 = 0
        L20:
            if (r8 >= r4) goto L3a
            r9 = r7[r8]
            java.lang.Object r10 = access$getDELETED$p()
            if (r9 == r10) goto L37
            if (r8 == r5) goto L35
            r10 = r6[r8]
            r6[r5] = r10
            r7[r5] = r9
            r10 = 0
            r7[r8] = r10
        L35:
            int r5 = r5 + 1
        L37:
            int r8 = r8 + 1
            goto L20
        L3a:
            r2.garbage = r1
            r2.size = r5
        L3f:
            java.lang.Object[] r1 = r12.values
            r1[r13] = r14
            return
        L44:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected index to be within 0..size()-1, but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r13)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final <E> int commonSize(androidx.collection.LongSparseArray<E> r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            boolean r1 = r11.garbage
            if (r1 == 0) goto L34
            r1 = r11
            r2 = 0
            int r3 = r1.size
            r4 = 0
            long[] r5 = r1.keys
            java.lang.Object[] r6 = r1.values
            r7 = 0
        L14:
            if (r7 >= r3) goto L2e
            r8 = r6[r7]
            java.lang.Object r9 = access$getDELETED$p()
            if (r8 == r9) goto L2b
            if (r7 == r4) goto L29
            r9 = r5[r7]
            r5[r4] = r9
            r6[r4] = r8
            r9 = 0
            r6[r7] = r9
        L29:
            int r4 = r4 + 1
        L2b:
            int r7 = r7 + 1
            goto L14
        L2e:
            r7 = 0
            r1.garbage = r7
            r1.size = r4
        L34:
            int r1 = r11.size
            return r1
    }

    public static final <E> java.lang.String commonToString(androidx.collection.LongSparseArray<E> r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            int r1 = r10.size()
            if (r1 > 0) goto Lf
            java.lang.String r1 = "{}"
            return r1
        Lf:
            int r1 = r10.size
            int r1 = r1 * 28
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r1 = r2
            r3 = 0
            r4 = 123(0x7b, float:1.72E-43)
            r1.append(r4)
            r4 = 0
            int r5 = r10.size
        L22:
            if (r4 >= r5) goto L49
            if (r4 <= 0) goto L2b
            java.lang.String r6 = ", "
            r1.append(r6)
        L2b:
            long r6 = r10.keyAt(r4)
            r1.append(r6)
            r8 = 61
            r1.append(r8)
            java.lang.Object r8 = r10.valueAt(r4)
            if (r8 == r1) goto L41
            r1.append(r8)
            goto L46
        L41:
            java.lang.String r9 = "(this Map)"
            r1.append(r9)
        L46:
            int r4 = r4 + 1
            goto L22
        L49:
            r4 = 125(0x7d, float:1.75E-43)
            r1.append(r4)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public static final <E> E commonValueAt(androidx.collection.LongSparseArray<E> r12, int r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            r1 = 0
            if (r13 < 0) goto Lf
            int r2 = r12.size
            if (r13 >= r2) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L44
            boolean r2 = r12.garbage
            if (r2 == 0) goto L3f
            r2 = r12
            r3 = 0
            int r4 = r2.size
            r5 = 0
            long[] r6 = r2.keys
            java.lang.Object[] r7 = r2.values
            r8 = 0
        L20:
            if (r8 >= r4) goto L3a
            r9 = r7[r8]
            java.lang.Object r10 = access$getDELETED$p()
            if (r9 == r10) goto L37
            if (r8 == r5) goto L35
            r10 = r6[r8]
            r6[r5] = r10
            r7[r5] = r9
            r10 = 0
            r7[r8] = r10
        L35:
            int r5 = r5 + 1
        L37:
            int r8 = r8 + 1
            goto L20
        L3a:
            r2.garbage = r1
            r2.size = r5
        L3f:
            java.lang.Object[] r1 = r12.values
            r1 = r1[r13]
            return r1
        L44:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected index to be within 0..size()-1, but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r13)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final <T> boolean contains(androidx.collection.LongSparseArray<T> r2, long r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            boolean r1 = r2.containsKey(r3)
            return r1
    }

    public static final <T> void forEach(androidx.collection.LongSparseArray<T> r5, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super T, kotlin.Unit> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 0
            int r2 = r5.size()
        L10:
            if (r1 >= r2) goto L24
            long r3 = r5.keyAt(r1)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r4 = r5.valueAt(r1)
            r6.invoke(r3, r4)
            int r1 = r1 + 1
            goto L10
        L24:
            return
    }

    public static final <T> T getOrDefault(androidx.collection.LongSparseArray<T> r2, long r3, T r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            java.lang.Object r1 = r2.get(r3, r5)
            return r1
    }

    public static final <T> T getOrElse(androidx.collection.LongSparseArray<T> r2, long r3, kotlin.jvm.functions.Function0<? extends T> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.lang.Object r1 = r2.get(r3)
            if (r1 != 0) goto L15
            java.lang.Object r1 = r5.invoke()
        L15:
            return r1
    }

    public static final <T> int getSize(androidx.collection.LongSparseArray<T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            int r1 = r2.size()
            return r1
    }

    public static /* synthetic */ void getSize$annotations(androidx.collection.LongSparseArray r0) {
            return
    }

    public static final <T> boolean isNotEmpty(androidx.collection.LongSparseArray<T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            boolean r1 = r2.isEmpty()
            r1 = r1 ^ 1
            return r1
    }

    public static final <T> kotlin.collections.LongIterator keyIterator(androidx.collection.LongSparseArray<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.collection.LongSparseArrayKt$keyIterator$1 r0 = new androidx.collection.LongSparseArrayKt$keyIterator$1
            r0.<init>(r1)
            kotlin.collections.LongIterator r0 = (kotlin.collections.LongIterator) r0
            return r0
    }

    public static final <T> androidx.collection.LongSparseArray<T> plus(androidx.collection.LongSparseArray<T> r3, androidx.collection.LongSparseArray<T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.collection.LongSparseArray r0 = new androidx.collection.LongSparseArray
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            r0.putAll(r3)
            r0.putAll(r4)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean remove(androidx.collection.LongSparseArray r1, long r2, java.lang.Object r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.remove(r2, r4)
            return r0
    }

    public static final <T> void set(androidx.collection.LongSparseArray<T> r1, long r2, T r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 0
            r1.put(r2, r4)
            return
    }

    public static final <T> java.util.Iterator<T> valueIterator(androidx.collection.LongSparseArray<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.collection.LongSparseArrayKt$valueIterator$1 r0 = new androidx.collection.LongSparseArrayKt$valueIterator$1
            r0.<init>(r1)
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }
}
