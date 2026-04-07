package androidx.collection;

/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u00011B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u001b\u0010\u000b\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010J\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015J\u0006\u0010\u0016\u001a\u00020\u0013J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0016\u0010\u001f\u001a\u00020\u00132\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010 J\u0017\u0010\u001f\u001a\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086\u0002J\u0017\u0010\u001f\u001a\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u001e\u0010\u001f\u001a\u00020\u00132\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000eH\u0086\u0002¢\u0006\u0002\u0010!J\u0017\u0010\u001f\u001a\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\u0002J\u0017\u0010\u001f\u001a\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\u0002J\u0016\u0010\"\u001a\u00020\u00132\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010 J\u0017\u0010\"\u001a\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086\u0002J\u0017\u0010\"\u001a\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u001e\u0010\"\u001a\u00020\u00132\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000eH\u0086\u0002¢\u0006\u0002\u0010!J\u0017\u0010\"\u001a\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\u0002J\u0017\u0010\"\u001a\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\u0002J\u0013\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ\u0014\u0010$\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u0014\u0010$\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u001b\u0010$\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e¢\u0006\u0002\u0010\u000fJ\u0014\u0010$\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010J\u0014\u0010$\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\b\u0010%\u001a\u00020\u0013H\u0002J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0004H\u0001J \u0010(\u001a\u00020\u00132\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0*H\u0086\bø\u0001\u0000J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u0004H\u0002J\b\u0010-\u001a\u00020\u0004H\u0007J\u0019\u0010.\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00042\u0006\u0010/\u001a\u000200H\u0082\bR\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00062"}, d2 = {"Landroidx/collection/MutableScatterSet;", "E", "Landroidx/collection/ScatterSet;", "initialCapacity", "", "(I)V", "growthLimit", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "Landroidx/collection/ObjectList;", "", "([Ljava/lang/Object;)Z", "", "Lkotlin/sequences/Sequence;", "adjustStorage", "", "asMutableSet", "", "clear", "findAbsoluteInsertIndex", "(Ljava/lang/Object;)I", "findFirstAvailableSlot", "hash1", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "(Ljava/lang/Object;)V", "([Ljava/lang/Object;)V", "plusAssign", "remove", "removeAll", "removeDeletedMarkers", "removeElementAt", "index", "removeIf", "predicate", "Lkotlin/Function1;", "resizeStorage", "newCapacity", "trim", "writeMetadata", "value", "", "MutableSetWrapper", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableScatterSet<E> extends androidx.collection.ScatterSet<E> {
    private int growthLimit;

    /* JADX INFO: compiled from: ScatterSet.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0002J\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\bJ\u0016\u0010\u0011\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J\u0016\u0010\u0012\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¨\u0006\u0013"}, d2 = {"Landroidx/collection/MutableScatterSet$MutableSetWrapper;", "Landroidx/collection/ScatterSet$SetWrapper;", "Landroidx/collection/ScatterSet;", "", "(Landroidx/collection/MutableScatterSet;)V", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "", "clear", "", "iterator", "", "remove", "removeAll", "retainAll", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class MutableSetWrapper extends androidx.collection.ScatterSet<E>.SetWrapper implements java.util.Set<E>, kotlin.jvm.internal.markers.KMutableSet {
        final /* synthetic */ androidx.collection.MutableScatterSet<E> this$0;

        public MutableSetWrapper(androidx.collection.MutableScatterSet r2) {
                r1 = this;
                r1.this$0 = r2
                r0 = r2
                androidx.collection.ScatterSet r0 = (androidx.collection.ScatterSet) r0
                r1.<init>(r0)
                return
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean add(E r2) {
                r1 = this;
                androidx.collection.MutableScatterSet<E> r0 = r1.this$0
                boolean r0 = r0.add(r2)
                return r0
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends E> r3) {
                r2 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                androidx.collection.MutableScatterSet<E> r0 = r2.this$0
                r1 = r3
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                boolean r0 = r0.addAll(r1)
                return r0
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public void clear() {
                r1 = this;
                androidx.collection.MutableScatterSet<E> r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<E> iterator() {
                r2 = this;
                androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1 r0 = new androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1
                androidx.collection.MutableScatterSet<E> r1 = r2.this$0
                r0.<init>(r1)
                java.util.Iterator r0 = (java.util.Iterator) r0
                return r0
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                androidx.collection.MutableScatterSet<E> r0 = r1.this$0
                boolean r0 = r0.remove(r2)
                return r0
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<? extends java.lang.Object> r5) {
                r4 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                androidx.collection.MutableScatterSet<E> r0 = r4.this$0
                int r0 = r0.getSize()
                java.util.Iterator r1 = r5.iterator()
            Lf:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L1f
                java.lang.Object r2 = r1.next()
                androidx.collection.MutableScatterSet<E> r3 = r4.this$0
                r3.minusAssign(r2)
                goto Lf
            L1f:
                androidx.collection.MutableScatterSet<E> r1 = r4.this$0
                int r1 = r1.getSize()
                if (r0 == r1) goto L29
                r1 = 1
                goto L2a
            L29:
                r1 = 0
            L2a:
                return r1
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<? extends java.lang.Object> r20) {
                r19 = this;
                r0 = r19
                r1 = r20
                java.lang.String r2 = "elements"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                r2 = 0
                androidx.collection.MutableScatterSet<E> r3 = r0.this$0
                androidx.collection.ScatterSet r3 = (androidx.collection.ScatterSet) r3
                androidx.collection.MutableScatterSet<E> r4 = r0.this$0
                r5 = 0
                long[] r6 = r3.metadata
                int r7 = r6.length
                int r7 = r7 + (-2)
                r8 = 0
                if (r8 > r7) goto L77
            L1a:
                r9 = r6[r8]
                r11 = r9
                r13 = 0
                long r14 = ~r11
                r16 = 7
                long r14 = r14 << r16
                long r14 = r14 & r11
                r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r11 = r14 & r16
                int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
                if (r11 == 0) goto L72
                int r11 = r8 - r7
                int r11 = ~r11
                int r11 = r11 >>> 31
                r12 = 8
                int r11 = 8 - r11
                r13 = 0
            L39:
                if (r13 >= r11) goto L6e
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r9
                r16 = 0
                r17 = 128(0x80, double:6.3E-322)
                int r17 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
                if (r17 >= 0) goto L49
                r17 = 1
                goto L4b
            L49:
                r17 = 0
            L4b:
                if (r17 == 0) goto L65
                int r14 = r8 << 3
                int r14 = r14 + r13
                r15 = r14
                r16 = 0
                r17 = r12
                java.lang.Object[] r12 = r4.elements
                r12 = r12[r15]
                boolean r18 = r1.contains(r12)
                if (r18 != 0) goto L63
                r4.removeElementAt(r15)
                r2 = 1
            L63:
                goto L67
            L65:
                r17 = r12
            L67:
                long r9 = r9 >> r17
                int r13 = r13 + 1
                r12 = r17
                goto L39
            L6e:
                r17 = r12
                if (r11 != r12) goto L78
            L72:
                if (r8 == r7) goto L77
                int r8 = r8 + 1
                goto L1a
            L77:
            L78:
                return r2
        }
    }

    public MutableScatterSet() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public MutableScatterSet(int r3) {
            r2 = this;
            r0 = 0
            r2.<init>(r0)
            if (r3 < 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L15
            int r0 = androidx.collection.ScatterMapKt.unloadedCapacity(r3)
            r2.initializeStorage(r0)
            return
        L15:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Capacity must be a positive value."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public /* synthetic */ MutableScatterSet(int r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 6
        L5:
            r0.<init>(r1)
            return
    }

    private final void adjustStorage() {
            r6 = this;
            int r0 = r6._capacity
            r1 = 8
            if (r0 <= r1) goto L2c
            int r0 = r6._size
            long r0 = (long) r0
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            r2 = 32
            long r0 = r0 * r2
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            int r2 = r6._capacity
            long r2 = (long) r2
            long r2 = kotlin.ULong.m327constructorimpl(r2)
            r4 = 25
            long r2 = r2 * r4
            long r2 = kotlin.ULong.m327constructorimpl(r2)
            int r0 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r0, r2)
            if (r0 > 0) goto L2c
            r6.removeDeletedMarkers()
            goto L35
        L2c:
            int r0 = r6._capacity
            int r0 = androidx.collection.ScatterMapKt.nextCapacity(r0)
            r6.resizeStorage(r0)
        L35:
            return
    }

    private final int findAbsoluteInsertIndex(E r25) {
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = 0
            if (r1 == 0) goto Lc
            int r4 = r1.hashCode()
            goto Ld
        Lc:
            r4 = 0
        Ld:
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r4 = r4 * r5
            int r5 = r4 << 16
            r2 = r4 ^ r5
            r4 = 0
            int r4 = r2 >>> 7
            r5 = 0
            r5 = r2 & 127(0x7f, float:1.78E-43)
            int r6 = r0._capacity
            r7 = r4 & r6
            r8 = 0
        L23:
            long[] r9 = r0.metadata
            r10 = 0
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r9[r11]
            long r13 = r13 >>> r12
            int r15 = r11 + 1
            r15 = r9[r15]
            int r17 = 64 - r12
            long r15 = r15 << r17
            r18 = r4
            long r3 = (long) r12
            long r3 = -r3
            r19 = 63
            long r3 = r3 >> r19
            long r3 = r3 & r15
            long r3 = r3 | r13
            r9 = r3
            r11 = 0
            long r12 = (long) r5
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r12 = r12 * r14
            long r12 = r12 ^ r9
            long r14 = r12 - r14
            r16 = r2
            r19 = r3
            long r2 = ~r12
            long r2 = r2 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r14
        L5c:
            r9 = r2
            r4 = 0
            r11 = 0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r21 = 1
            if (r13 == 0) goto L69
            r4 = r21
            goto L6a
        L69:
            r4 = 0
        L6a:
            if (r4 == 0) goto L8e
            r9 = r2
            r4 = 0
            r11 = r9
            r13 = 0
            int r21 = java.lang.Long.numberOfTrailingZeros(r11)
            int r11 = r21 >> 3
            int r11 = r11 + r7
            r4 = r11 & r6
            java.lang.Object[] r9 = r0.elements
            r9 = r9[r4]
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r1)
            if (r9 == 0) goto L85
            return r4
        L85:
            r9 = r2
            r11 = 0
            r12 = 1
            long r12 = r9 - r12
            long r9 = r9 & r12
            r2 = r9
            goto L5c
        L8e:
            r9 = r19
            r4 = 0
            r22 = r11
            long r11 = ~r9
            r13 = 6
            long r11 = r11 << r13
            long r11 = r11 & r9
            long r9 = r11 & r14
            int r4 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r4 == 0) goto L12f
        L9e:
            r4 = r18
            int r2 = r0.findFirstAvailableSlot(r4)
            int r3 = r0.growthLimit
            r9 = 255(0xff, double:1.26E-321)
            if (r3 != 0) goto Lcc
            long[] r3 = r0.metadata
            r11 = 0
            r12 = 0
            int r13 = r2 >> 3
            r13 = r3[r13]
            r15 = r2 & 7
            int r15 = r15 << 3
            long r13 = r13 >> r15
            long r12 = r13 & r9
            r14 = 254(0xfe, double:1.255E-321)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto Lc2
            r3 = r21
            goto Lc3
        Lc2:
            r3 = 0
        Lc3:
            if (r3 != 0) goto Lcc
            r0.adjustStorage()
            int r2 = r0.findFirstAvailableSlot(r4)
        Lcc:
            int r3 = r0._size
            int r3 = r3 + 1
            r0._size = r3
            int r3 = r0.growthLimit
            long[] r11 = r0.metadata
            r12 = 0
            r13 = 0
            int r14 = r2 >> 3
            r14 = r11[r14]
            r18 = r2 & 7
            int r18 = r18 << 3
            long r14 = r14 >> r18
            long r13 = r14 & r9
            r18 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r13 != 0) goto Led
            r17 = r21
            goto Lef
        Led:
            r17 = 0
        Lef:
            int r3 = r3 - r17
            r0.growthLimit = r3
            long r11 = (long) r5
            r3 = r24
            r13 = 0
            long[] r14 = r3.metadata
            r15 = 0
            int r17 = r2 >> 3
            r18 = r2 & 7
            int r18 = r18 << 3
            r19 = r14[r17]
            r21 = r9
            long r9 = r21 << r18
            long r9 = ~r9
            long r9 = r19 & r9
            long r19 = r11 << r18
            long r9 = r9 | r19
            r14[r17] = r9
            int r9 = r3._capacity
            int r10 = r2 + (-7)
            r10 = r10 & r9
            r15 = r9 & 7
            int r10 = r10 + r15
            r15 = 0
            int r17 = r10 >> 3
            r18 = r10 & 7
            int r18 = r18 << 3
            r19 = r14[r17]
            long r0 = r21 << r18
            long r0 = ~r0
            long r0 = r19 & r0
            long r19 = r11 << r18
            long r0 = r0 | r19
            r14[r17] = r0
            return r2
        L12f:
            r4 = r18
            int r8 = r8 + 8
            int r0 = r7 + r8
            r7 = r0 & r6
            r0 = r24
            r1 = r25
            r2 = r16
            goto L23
    }

    private final int findFirstAvailableSlot(int r15) {
            r14 = this;
            int r0 = r14._capacity
            r1 = r15 & r0
            r2 = 0
        L5:
            long[] r3 = r14.metadata
            r4 = 0
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r3[r5]
            long r7 = r7 >>> r6
            int r9 = r5 + 1
            r9 = r3[r9]
            int r11 = 64 - r6
            long r9 = r9 << r11
            long r11 = (long) r6
            long r11 = -r11
            r13 = 63
            long r11 = r11 >> r13
            long r9 = r9 & r11
            long r3 = r7 | r9
            r5 = r3
            r7 = 0
            long r8 = ~r5
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r5
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r8 & r10
            r7 = 0
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L41
            r7 = r5
            r9 = 0
            int r10 = java.lang.Long.numberOfTrailingZeros(r7)
            int r7 = r10 >> 3
            int r7 = r7 + r1
            r7 = r7 & r0
            return r7
        L41:
            int r2 = r2 + 8
            int r7 = r1 + r2
            r1 = r7 & r0
            goto L5
    }

    private final void initializeGrowth() {
            r2 = this;
            int r0 = r2.getCapacity()
            int r0 = androidx.collection.ScatterMapKt.loadedCapacity(r0)
            int r1 = r2._size
            int r0 = r0 - r1
            r2.growthLimit = r0
            return
    }

    private final void initializeMetadata(int r11) {
            r10 = this;
            if (r11 != 0) goto L5
            long[] r0 = androidx.collection.ScatterMapKt.EmptyGroup
            goto L21
        L5:
            int r0 = r11 + 1
            int r0 = r0 + 7
            int r0 = r0 + 7
            r0 = r0 & (-8)
            int r0 = r0 >> 3
            long[] r1 = new long[r0]
            r2 = r1
            r9 = 0
            r7 = 6
            r8 = 0
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r5 = 0
            r6 = 0
            kotlin.collections.ArraysKt.fill$default(r2, r3, r5, r6, r7, r8)
            r0 = r1
        L21:
            r10.metadata = r0
            long[] r0 = r10.metadata
            r1 = 255(0xff, double:1.26E-321)
            r3 = 0
            int r4 = r11 >> 3
            r5 = r11 & 7
            int r5 = r5 << 3
            r6 = r0[r4]
            r8 = 255(0xff, double:1.26E-321)
            long r8 = r8 << r5
            long r8 = ~r8
            long r6 = r6 & r8
            long r8 = r1 << r5
            long r6 = r6 | r8
            r0[r4] = r6
            r10.initializeGrowth()
            return
    }

    private final void initializeStorage(int r3) {
            r2 = this;
            if (r3 <= 0) goto Lc
            r0 = 7
            int r1 = androidx.collection.ScatterMapKt.normalizeCapacity(r3)
            int r0 = java.lang.Math.max(r0, r1)
            goto Ld
        Lc:
            r0 = 0
        Ld:
            r2._capacity = r0
            r2.initializeMetadata(r0)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2.elements = r1
            return
    }

    private final void removeDeletedMarkers() {
            r23 = this;
            r0 = r23
            long[] r1 = r0.metadata
            int r2 = r0._capacity
            r3 = 0
            r4 = 0
        L8:
            if (r4 >= r2) goto L6d
            r5 = 0
            int r6 = r4 >> 3
            r6 = r1[r6]
            r8 = r4 & 7
            int r8 = r8 << 3
            long r6 = r6 >> r8
            r8 = 255(0xff, double:1.26E-321)
            long r5 = r6 & r8
            r10 = 254(0xfe, double:1.255E-321)
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 != 0) goto L62
            r10 = 128(0x80, double:6.3E-322)
            r7 = r23
            r12 = 0
            long[] r13 = r7.metadata
            r14 = 0
            int r15 = r4 >> 3
            r16 = r4 & 7
            int r16 = r16 << 3
            r17 = r13[r15]
            r19 = r8
            long r8 = r19 << r16
            long r8 = ~r8
            long r8 = r17 & r8
            long r17 = r10 << r16
            long r8 = r8 | r17
            r13[r15] = r8
            int r8 = r7._capacity
            int r9 = r4 + (-7)
            r9 = r9 & r8
            r14 = r8 & 7
            int r9 = r9 + r14
            r14 = 0
            int r15 = r9 >> 3
            r16 = r9 & 7
            int r16 = r16 << 3
            r17 = r13[r15]
            r21 = r1
            r22 = r2
            long r1 = r19 << r16
            long r1 = ~r1
            long r1 = r17 & r1
            long r17 = r10 << r16
            long r1 = r1 | r17
            r13[r15] = r1
            int r3 = r3 + 1
            goto L66
        L62:
            r21 = r1
            r22 = r2
        L66:
            int r4 = r4 + 1
            r1 = r21
            r2 = r22
            goto L8
        L6d:
            r21 = r1
            int r1 = r0.growthLimit
            int r1 = r1 + r3
            r0.growthLimit = r1
            return
    }

    private final void resizeStorage(int r25) {
            r24 = this;
            r0 = r24
            long[] r1 = r0.metadata
            java.lang.Object[] r2 = r0.elements
            int r3 = r0._capacity
            r24.initializeStorage(r25)
            java.lang.Object[] r4 = r0.elements
            r5 = 0
        Le:
            if (r5 >= r3) goto L94
            r6 = 0
            r7 = 0
            int r8 = r5 >> 3
            r8 = r1[r8]
            r10 = r5 & 7
            int r10 = r10 << 3
            long r8 = r8 >> r10
            r10 = 255(0xff, double:1.26E-321)
            long r7 = r8 & r10
            r12 = 128(0x80, double:6.3E-322)
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            r8 = 0
            if (r7 >= 0) goto L28
            r7 = 1
            goto L29
        L28:
            r7 = r8
        L29:
            if (r7 == 0) goto L8a
            r6 = r2[r5]
            r7 = 0
            if (r6 == 0) goto L34
            int r8 = r6.hashCode()
        L34:
            r9 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r8 = r8 * r9
            int r9 = r8 << 16
            r7 = r8 ^ r9
            r8 = 0
            int r8 = r7 >>> 7
            int r8 = r0.findFirstAvailableSlot(r8)
            r9 = 0
            r9 = r7 & 127(0x7f, float:1.78E-43)
            long r12 = (long) r9
            r9 = r24
            r14 = 0
            long[] r15 = r9.metadata
            r16 = 0
            int r17 = r8 >> 3
            r18 = r8 & 7
            int r18 = r18 << 3
            r19 = r15[r17]
            r21 = r10
            long r10 = r21 << r18
            long r10 = ~r10
            long r10 = r19 & r10
            long r19 = r12 << r18
            long r10 = r10 | r19
            r15[r17] = r10
            int r10 = r9._capacity
            int r11 = r8 + (-7)
            r11 = r11 & r10
            r16 = r10 & 7
            int r11 = r11 + r16
            r16 = 0
            int r17 = r11 >> 3
            r18 = r11 & 7
            int r18 = r18 << 3
            r19 = r15[r17]
            r23 = r1
            long r0 = r21 << r18
            long r0 = ~r0
            long r0 = r19 & r0
            long r19 = r12 << r18
            long r0 = r0 | r19
            r15[r17] = r0
            r4[r8] = r6
            goto L8c
        L8a:
            r23 = r1
        L8c:
            int r5 = r5 + 1
            r0 = r24
            r1 = r23
            goto Le
        L94:
            return
    }

    private final void writeMetadata(int r12, long r13) {
            r11 = this;
            r0 = 0
            long[] r1 = r11.metadata
            r2 = 0
            int r3 = r12 >> 3
            r4 = r12 & 7
            int r4 = r4 << 3
            r5 = r1[r3]
            r7 = 255(0xff, double:1.26E-321)
            long r9 = r7 << r4
            long r9 = ~r9
            long r5 = r5 & r9
            long r9 = r13 << r4
            long r5 = r5 | r9
            r1[r3] = r5
            int r2 = r11._capacity
            int r3 = r12 + (-7)
            r3 = r3 & r2
            r4 = r2 & 7
            int r3 = r3 + r4
            r4 = 0
            int r5 = r3 >> 3
            r6 = r3 & 7
            int r6 = r6 << 3
            r9 = r1[r5]
            long r7 = r7 << r6
            long r7 = ~r7
            long r7 = r7 & r9
            long r9 = r13 << r6
            long r7 = r7 | r9
            r1[r5] = r7
            return
    }

    public final boolean add(E r4) {
            r3 = this;
            int r0 = r3.getSize()
            int r1 = r3.findAbsoluteInsertIndex(r4)
            java.lang.Object[] r2 = r3.elements
            r2[r1] = r4
            int r2 = r3.getSize()
            if (r2 == r0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    public final boolean addAll(androidx.collection.ObjectList<E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2.getSize()
            r2.plusAssign(r3)
            int r1 = r2.getSize()
            if (r0 == r1) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    public final boolean addAll(androidx.collection.ScatterSet<E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2.getSize()
            r2.plusAssign(r3)
            int r1 = r2.getSize()
            if (r0 == r1) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    public final boolean addAll(java.lang.Iterable<? extends E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2.getSize()
            r2.plusAssign(r3)
            int r1 = r2.getSize()
            if (r0 == r1) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    public final boolean addAll(kotlin.sequences.Sequence<? extends E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2.getSize()
            r2.plusAssign(r3)
            int r1 = r2.getSize()
            if (r0 == r1) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    public final boolean addAll(E[] r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2.getSize()
            r2.plusAssign(r3)
            int r1 = r2.getSize()
            if (r0 == r1) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    public final java.util.Set<E> asMutableSet() {
            r1 = this;
            androidx.collection.MutableScatterSet$MutableSetWrapper r0 = new androidx.collection.MutableScatterSet$MutableSetWrapper
            r0.<init>(r1)
            java.util.Set r0 = (java.util.Set) r0
            return r0
    }

    public final void clear() {
            r12 = this;
            r0 = 0
            r12._size = r0
            long[] r1 = r12.metadata
            long[] r2 = androidx.collection.ScatterMapKt.EmptyGroup
            if (r1 == r2) goto L31
            long[] r3 = r12.metadata
            r8 = 6
            r9 = 0
            r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r6 = 0
            r7 = 0
            kotlin.collections.ArraysKt.fill$default(r3, r4, r6, r7, r8, r9)
            long[] r1 = r12.metadata
            int r2 = r12._capacity
            r3 = 255(0xff, double:1.26E-321)
            r5 = 0
            int r6 = r2 >> 3
            r7 = r2 & 7
            int r7 = r7 << 3
            r8 = r1[r6]
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 << r7
            long r10 = ~r10
            long r8 = r8 & r10
            long r10 = r3 << r7
            long r8 = r8 | r10
            r1[r6] = r8
        L31:
            java.lang.Object[] r1 = r12.elements
            r2 = 0
            int r3 = r12._capacity
            kotlin.collections.ArraysKt.fill(r1, r2, r0, r3)
            r12.initializeGrowth()
            return
    }

    public final void minusAssign(androidx.collection.ObjectList<E> r8) {
            r7 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r8
            r1 = 0
            java.lang.Object[] r2 = r0.content
            r3 = 0
            int r4 = r0._size
        Ld:
            if (r3 >= r4) goto L1a
            r5 = r2[r3]
            r6 = 0
            r7.minusAssign(r5)
            int r3 = r3 + 1
            goto Ld
        L1a:
            return
    }

    public final void minusAssign(androidx.collection.ScatterSet<E> r21) {
            r20 = this;
            java.lang.String r0 = "elements"
            r1 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = r21
            r2 = 0
            java.lang.Object[] r3 = r0.elements
            r4 = r0
            r5 = 0
            long[] r6 = r4.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            r8 = 0
            if (r8 > r7) goto L85
        L18:
            r9 = r6[r8]
            r11 = r9
            r13 = 0
            long r14 = ~r11
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r11
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r14 & r16
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 == 0) goto L7a
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L37:
            if (r13 >= r11) goto L71
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 0
            r17 = 128(0x80, double:6.3E-322)
            int r17 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r17 >= 0) goto L47
            r17 = 1
            goto L49
        L47:
            r17 = 0
        L49:
            if (r17 == 0) goto L62
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r14
            r16 = 0
            r17 = r12
            r12 = r3[r15]
            r18 = 0
            r19 = r0
            r0 = r20
            r0.minusAssign(r12)
            goto L68
        L62:
            r19 = r0
            r17 = r12
            r0 = r20
        L68:
            long r9 = r9 >> r17
            int r13 = r13 + 1
            r12 = r17
            r0 = r19
            goto L37
        L71:
            r19 = r0
            r17 = r12
            r0 = r20
            if (r11 != r12) goto L8a
            goto L7e
        L7a:
            r19 = r0
            r0 = r20
        L7e:
            if (r8 == r7) goto L89
            int r8 = r8 + 1
            r0 = r19
            goto L18
        L85:
            r19 = r0
            r0 = r20
        L89:
        L8a:
            return
    }

    public final void minusAssign(java.lang.Iterable<? extends E> r7) {
            r6 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r7
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1d
            java.lang.Object r3 = r2.next()
            r4 = r3
            r5 = 0
            r6.minusAssign(r4)
            goto Lb
        L1d:
            return
    }

    public final void minusAssign(E r25) {
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r0
            androidx.collection.ScatterSet r2 = (androidx.collection.ScatterSet) r2
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L10
            int r6 = r1.hashCode()
            goto L11
        L10:
            r6 = 0
        L11:
            r7 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r6 = r6 * r7
            int r7 = r6 << 16
            r4 = r6 ^ r7
            r6 = 0
            r6 = r4 & 127(0x7f, float:1.78E-43)
            int r7 = r2._capacity
            r8 = 0
            int r8 = r4 >>> 7
            r8 = r8 & r7
            r9 = 0
        L25:
            long[] r10 = r2.metadata
            r11 = 0
            int r12 = r8 >> 3
            r13 = r8 & 7
            int r13 = r13 << 3
            r14 = r10[r12]
            long r14 = r14 >>> r13
            int r16 = r12 + 1
            r16 = r10[r16]
            int r18 = 64 - r13
            long r16 = r16 << r18
            r19 = r6
            long r5 = (long) r13
            long r5 = -r5
            r20 = 63
            long r5 = r5 >> r20
            long r5 = r16 & r5
            long r5 = r5 | r14
            r10 = r5
            r12 = 0
            r13 = r19
            long r14 = (long) r13
            r16 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r14 = r14 * r16
            long r14 = r14 ^ r10
            long r16 = r14 - r16
            r19 = r3
            r20 = r4
            long r3 = ~r14
            long r3 = r16 & r3
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r16
        L64:
            r10 = r3
            r12 = 0
            r14 = 0
            int r21 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r21 == 0) goto L6f
            r21 = 1
            goto L71
        L6f:
            r21 = 0
        L71:
            if (r21 == 0) goto L97
            r10 = r3
            r12 = 0
            r14 = r10
            r21 = 0
            int r22 = java.lang.Long.numberOfTrailingZeros(r14)
            int r14 = r22 >> 3
            int r14 = r14 + r8
            r10 = r14 & r7
            java.lang.Object[] r11 = r2.elements
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r1)
            if (r11 == 0) goto L8d
            goto La9
        L8d:
            r11 = r3
            r14 = 0
            r21 = 1
            long r21 = r11 - r21
            long r11 = r11 & r21
            r3 = r11
            goto L64
        L97:
            r10 = r5
            r12 = 0
            r21 = r14
            long r14 = ~r10
            r23 = 6
            long r14 = r14 << r23
            long r14 = r14 & r10
            long r10 = r14 & r16
            int r10 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r10 == 0) goto Lb0
        La8:
            r10 = -1
        La9:
            if (r10 < 0) goto Laf
            r0.removeElementAt(r10)
        Laf:
            return
        Lb0:
            int r9 = r9 + 8
            int r10 = r8 + r9
            r8 = r10 & r7
            r6 = r13
            r3 = r19
            r4 = r20
            goto L25
    }

    public final void minusAssign(kotlin.sequences.Sequence<? extends E> r7) {
            r6 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r7
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1d
            java.lang.Object r3 = r2.next()
            r4 = r3
            r5 = 0
            r6.minusAssign(r4)
            goto Lb
        L1d:
            return
    }

    public final void minusAssign(E[] r8) {
            r7 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r8
            r1 = 0
            int r2 = r0.length
            r3 = 0
        L9:
            if (r3 >= r2) goto L17
            r4 = r0[r3]
            r5 = r4
            r6 = 0
            r7.minusAssign(r5)
            int r3 = r3 + 1
            goto L9
        L17:
            return
    }

    public final void plusAssign(androidx.collection.ObjectList<E> r8) {
            r7 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r8
            r1 = 0
            java.lang.Object[] r2 = r0.content
            r3 = 0
            int r4 = r0._size
        Ld:
            if (r3 >= r4) goto L1a
            r5 = r2[r3]
            r6 = 0
            r7.plusAssign(r5)
            int r3 = r3 + 1
            goto Ld
        L1a:
            return
    }

    public final void plusAssign(androidx.collection.ScatterSet<E> r21) {
            r20 = this;
            java.lang.String r0 = "elements"
            r1 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = r21
            r2 = 0
            java.lang.Object[] r3 = r0.elements
            r4 = r0
            r5 = 0
            long[] r6 = r4.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            r8 = 0
            if (r8 > r7) goto L85
        L18:
            r9 = r6[r8]
            r11 = r9
            r13 = 0
            long r14 = ~r11
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r11
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r14 & r16
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 == 0) goto L7a
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L37:
            if (r13 >= r11) goto L71
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 0
            r17 = 128(0x80, double:6.3E-322)
            int r17 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r17 >= 0) goto L47
            r17 = 1
            goto L49
        L47:
            r17 = 0
        L49:
            if (r17 == 0) goto L62
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r14
            r16 = 0
            r17 = r12
            r12 = r3[r15]
            r18 = 0
            r19 = r0
            r0 = r20
            r0.plusAssign(r12)
            goto L68
        L62:
            r19 = r0
            r17 = r12
            r0 = r20
        L68:
            long r9 = r9 >> r17
            int r13 = r13 + 1
            r12 = r17
            r0 = r19
            goto L37
        L71:
            r19 = r0
            r17 = r12
            r0 = r20
            if (r11 != r12) goto L8a
            goto L7e
        L7a:
            r19 = r0
            r0 = r20
        L7e:
            if (r8 == r7) goto L89
            int r8 = r8 + 1
            r0 = r19
            goto L18
        L85:
            r19 = r0
            r0 = r20
        L89:
        L8a:
            return
    }

    public final void plusAssign(java.lang.Iterable<? extends E> r7) {
            r6 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r7
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1d
            java.lang.Object r3 = r2.next()
            r4 = r3
            r5 = 0
            r6.plusAssign(r4)
            goto Lb
        L1d:
            return
    }

    public final void plusAssign(E r3) {
            r2 = this;
            int r0 = r2.findAbsoluteInsertIndex(r3)
            java.lang.Object[] r1 = r2.elements
            r1[r0] = r3
            return
    }

    public final void plusAssign(kotlin.sequences.Sequence<? extends E> r7) {
            r6 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r7
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1d
            java.lang.Object r3 = r2.next()
            r4 = r3
            r5 = 0
            r6.plusAssign(r4)
            goto Lb
        L1d:
            return
    }

    public final void plusAssign(E[] r8) {
            r7 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r8
            r1 = 0
            int r2 = r0.length
            r3 = 0
        L9:
            if (r3 >= r2) goto L17
            r4 = r0[r3]
            r5 = r4
            r6 = 0
            r7.plusAssign(r5)
            int r3 = r3 + 1
            goto L9
        L17:
            return
    }

    public final boolean remove(E r26) {
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r0
            androidx.collection.ScatterSet r2 = (androidx.collection.ScatterSet) r2
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L10
            int r6 = r1.hashCode()
            goto L11
        L10:
            r6 = 0
        L11:
            r7 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r6 = r6 * r7
            int r7 = r6 << 16
            r4 = r6 ^ r7
            r6 = 0
            r6 = r4 & 127(0x7f, float:1.78E-43)
            int r7 = r2._capacity
            r8 = 0
            int r8 = r4 >>> 7
            r8 = r8 & r7
            r9 = 0
        L25:
            long[] r10 = r2.metadata
            r11 = 0
            int r12 = r8 >> 3
            r13 = r8 & 7
            int r13 = r13 << 3
            r14 = r10[r12]
            long r14 = r14 >>> r13
            int r16 = r12 + 1
            r16 = r10[r16]
            int r18 = 64 - r13
            long r16 = r16 << r18
            r19 = r6
            long r5 = (long) r13
            long r5 = -r5
            r20 = 63
            long r5 = r5 >> r20
            long r5 = r16 & r5
            long r5 = r5 | r14
            r10 = r5
            r12 = 0
            r13 = r19
            long r14 = (long) r13
            r16 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r14 = r14 * r16
            long r14 = r14 ^ r10
            long r16 = r14 - r16
            r19 = r3
            r20 = r4
            long r3 = ~r14
            long r3 = r16 & r3
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r16
        L64:
            r10 = r3
            r12 = 0
            r14 = 0
            int r21 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            r22 = 1
            if (r21 == 0) goto L71
            r10 = r22
            goto L72
        L71:
            r10 = 0
        L72:
            if (r10 == 0) goto L98
            r10 = r3
            r12 = 0
            r14 = r10
            r21 = 0
            int r23 = java.lang.Long.numberOfTrailingZeros(r14)
            int r14 = r23 >> 3
            int r14 = r14 + r8
            r10 = r14 & r7
            java.lang.Object[] r11 = r2.elements
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r1)
            if (r11 == 0) goto L8e
            goto Laa
        L8e:
            r11 = r3
            r14 = 0
            r21 = 1
            long r21 = r11 - r21
            long r11 = r11 & r21
            r3 = r11
            goto L64
        L98:
            r10 = r5
            r12 = 0
            r23 = r14
            long r14 = ~r10
            r21 = 6
            long r14 = r14 << r21
            long r14 = r14 & r10
            long r10 = r14 & r16
            int r10 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r10 == 0) goto Lb7
        La9:
            r10 = -1
        Laa:
            if (r10 < 0) goto Lb0
            r5 = r22
            goto Lb1
        Lb0:
            r5 = 0
        Lb1:
            if (r5 == 0) goto Lb6
            r0.removeElementAt(r10)
        Lb6:
            return r5
        Lb7:
            int r9 = r9 + 8
            int r10 = r8 + r9
            r8 = r10 & r7
            r6 = r13
            r3 = r19
            r4 = r20
            goto L25
    }

    public final boolean removeAll(androidx.collection.ObjectList<E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2.getSize()
            r2.minusAssign(r3)
            int r1 = r2.getSize()
            if (r0 == r1) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    public final boolean removeAll(androidx.collection.ScatterSet<E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2.getSize()
            r2.minusAssign(r3)
            int r1 = r2.getSize()
            if (r0 == r1) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    public final boolean removeAll(java.lang.Iterable<? extends E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2.getSize()
            r2.minusAssign(r3)
            int r1 = r2.getSize()
            if (r0 == r1) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    public final boolean removeAll(kotlin.sequences.Sequence<? extends E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2.getSize()
            r2.minusAssign(r3)
            int r1 = r2.getSize()
            if (r0 == r1) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    public final boolean removeAll(E[] r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2.getSize()
            r2.minusAssign(r3)
            int r1 = r2.getSize()
            if (r0 == r1) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    public final void removeElementAt(int r15) {
            r14 = this;
            int r0 = r14._size
            int r0 = r0 + (-1)
            r14._size = r0
            r0 = 254(0xfe, double:1.255E-321)
            r2 = r14
            r3 = 0
            long[] r4 = r2.metadata
            r5 = 0
            int r6 = r15 >> 3
            r7 = r15 & 7
            int r7 = r7 << 3
            r8 = r4[r6]
            r10 = 255(0xff, double:1.26E-321)
            long r12 = r10 << r7
            long r12 = ~r12
            long r8 = r8 & r12
            long r12 = r0 << r7
            long r8 = r8 | r12
            r4[r6] = r8
            int r5 = r2._capacity
            int r6 = r15 + (-7)
            r6 = r6 & r5
            r7 = r5 & 7
            int r6 = r6 + r7
            r7 = 0
            int r8 = r6 >> 3
            r9 = r6 & 7
            int r9 = r9 << 3
            r12 = r4[r8]
            long r10 = r10 << r9
            long r10 = ~r10
            long r10 = r10 & r12
            long r12 = r0 << r9
            long r10 = r10 | r12
            r4[r8] = r10
            java.lang.Object[] r0 = r14.elements
            r1 = 0
            r0[r15] = r1
            return
    }

    public final void removeIf(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            java.lang.Object[] r3 = r0.elements
            r4 = r0
            androidx.collection.ScatterSet r4 = (androidx.collection.ScatterSet) r4
            r5 = 0
            long[] r6 = r4.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            r8 = 0
            if (r8 > r7) goto L79
        L19:
            r9 = r6[r8]
            r11 = r9
            r13 = 0
            long r14 = ~r11
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r11
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r14 & r16
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 == 0) goto L74
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L38:
            if (r13 >= r11) goto L70
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 0
            r17 = 128(0x80, double:6.3E-322)
            int r17 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r17 >= 0) goto L48
            r17 = 1
            goto L4a
        L48:
            r17 = 0
        L4a:
            if (r17 == 0) goto L67
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r14
            r16 = 0
            r17 = r12
            r12 = r3[r15]
            java.lang.Object r12 = r1.invoke(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L65
            r0.removeElementAt(r15)
        L65:
            goto L69
        L67:
            r17 = r12
        L69:
            long r9 = r9 >> r17
            int r13 = r13 + 1
            r12 = r17
            goto L38
        L70:
            r17 = r12
            if (r11 != r12) goto L7a
        L74:
            if (r8 == r7) goto L79
            int r8 = r8 + 1
            goto L19
        L79:
        L7a:
            return
    }

    public final int trim() {
            r3 = this;
            int r0 = r3._capacity
            int r1 = r3._size
            int r1 = androidx.collection.ScatterMapKt.unloadedCapacity(r1)
            int r1 = androidx.collection.ScatterMapKt.normalizeCapacity(r1)
            if (r1 >= r0) goto L16
            r3.resizeStorage(r1)
            int r2 = r3._capacity
            int r2 = r0 - r2
            return r2
        L16:
            r2 = 0
            return r2
    }
}
