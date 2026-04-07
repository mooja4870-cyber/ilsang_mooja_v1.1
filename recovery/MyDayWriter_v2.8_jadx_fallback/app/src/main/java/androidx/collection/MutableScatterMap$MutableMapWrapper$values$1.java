package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [V] */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\tJ\u0016\u0010\u0010\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\tJ\u0016\u0010\u0015\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\u0016\u0010\u0016\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0017"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$values$1", "", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "", "clear", "", "contains", "containsAll", "isEmpty", "iterator", "", "remove", "removeAll", "retainAll", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableScatterMap$MutableMapWrapper$values$1<V> implements java.util.Collection<V>, kotlin.jvm.internal.markers.KMutableCollection {
    final /* synthetic */ androidx.collection.MutableScatterMap<K, V> this$0;

    MutableScatterMap$MutableMapWrapper$values$1(androidx.collection.MutableScatterMap<K, V> r1) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>()
            return
    }

    @Override // java.util.Collection
    public boolean add(V r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends V> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Collection
    public void clear() {
            r1 = this;
            androidx.collection.MutableScatterMap<K, V> r0 = r1.this$0
            r0.clear()
            return
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            androidx.collection.MutableScatterMap<K, V> r0 = r1.this$0
            boolean r0 = r0.containsValue(r2)
            return r0
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection<? extends java.lang.Object> r9) {
            r8 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            androidx.collection.MutableScatterMap<K, V> r1 = r8.this$0
            r2 = 0
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            r4 = 1
            if (r3 == 0) goto L16
            goto L2f
        L16:
            java.util.Iterator r3 = r0.iterator()
        L1a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L2e
            java.lang.Object r5 = r3.next()
            r6 = r5
            r7 = 0
            boolean r6 = r1.containsValue(r6)
            if (r6 != 0) goto L1a
            r4 = 0
            goto L2f
        L2e:
        L2f:
            return r4
    }

    public int getSize() {
            r1 = this;
            androidx.collection.MutableScatterMap<K, V> r0 = r1.this$0
            int r0 = r0._size
            return r0
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            androidx.collection.MutableScatterMap<K, V> r0 = r1.this$0
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<V> iterator() {
            r2 = this;
            androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1 r0 = new androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1
            androidx.collection.MutableScatterMap<K, V> r1 = r2.this$0
            r0.<init>(r1)
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object r20) {
            r19 = this;
            r0 = r19
            androidx.collection.MutableScatterMap<K, V> r1 = r0.this$0
            androidx.collection.ScatterMap r1 = (androidx.collection.ScatterMap) r1
            androidx.collection.MutableScatterMap<K, V> r2 = r0.this$0
            r3 = 0
            long[] r4 = r1.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r6 > r5) goto L7e
        L11:
            r8 = r4[r6]
            r10 = r8
            r12 = 0
            long r13 = ~r10
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r10
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r13 & r15
            int r10 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r10 == 0) goto L75
            int r10 = r6 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L2e:
            if (r12 >= r10) goto L6a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 0
            r16 = 128(0x80, double:6.3E-322)
            int r16 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            r17 = 1
            if (r16 >= 0) goto L3f
            r13 = r17
            goto L40
        L3f:
            r13 = 0
        L40:
            if (r13 == 0) goto L5d
            int r13 = r6 << 3
            int r13 = r13 + r12
            r14 = r13
            r15 = 0
            r16 = 0
            java.lang.Object[] r7 = r2.values
            r7 = r7[r14]
            r18 = r11
            r11 = r20
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r11)
            if (r7 == 0) goto L5b
            r2.removeValueAt(r14)
            return r17
        L5b:
            goto L63
        L5d:
            r18 = r11
            r16 = 0
            r11 = r20
        L63:
            long r8 = r8 >> r18
            int r12 = r12 + 1
            r11 = r18
            goto L2e
        L6a:
            r18 = r11
            r16 = 0
            r11 = r20
            r7 = r18
            if (r10 != r7) goto L83
            goto L79
        L75:
            r11 = r20
            r16 = 0
        L79:
            if (r6 == r5) goto L82
            int r6 = r6 + 1
            goto L11
        L7e:
            r11 = r20
            r16 = 0
        L82:
        L83:
            return r16
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            androidx.collection.MutableScatterMap<K, V> r3 = r0.this$0
            androidx.collection.ScatterMap r3 = (androidx.collection.ScatterMap) r3
            androidx.collection.MutableScatterMap<K, V> r4 = r0.this$0
            r5 = 0
            long[] r6 = r3.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            r8 = 0
            if (r8 > r7) goto L7f
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
            if (r11 == 0) goto L78
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L38:
            if (r13 >= r11) goto L72
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
            r12 = r1
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object[] r0 = r4.values
            r0 = r0[r15]
            boolean r0 = kotlin.collections.CollectionsKt.contains(r12, r0)
            if (r0 == 0) goto L65
            r4.removeValueAt(r15)
            r2 = 1
        L65:
            goto L69
        L67:
            r17 = r12
        L69:
            long r9 = r9 >> r17
            int r13 = r13 + 1
            r0 = r19
            r12 = r17
            goto L38
        L72:
            r17 = r12
            r0 = r17
            if (r11 != r0) goto L80
        L78:
            if (r8 == r7) goto L7f
            int r8 = r8 + 1
            r0 = r19
            goto L19
        L7f:
        L80:
            return r2
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            androidx.collection.MutableScatterMap<K, V> r3 = r0.this$0
            androidx.collection.ScatterMap r3 = (androidx.collection.ScatterMap) r3
            androidx.collection.MutableScatterMap<K, V> r4 = r0.this$0
            r5 = 0
            long[] r6 = r3.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            r8 = 0
            if (r8 > r7) goto L7f
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
            if (r11 == 0) goto L78
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L38:
            if (r13 >= r11) goto L72
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
            r12 = r1
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object[] r0 = r4.values
            r0 = r0[r15]
            boolean r0 = kotlin.collections.CollectionsKt.contains(r12, r0)
            if (r0 != 0) goto L65
            r4.removeValueAt(r15)
            r2 = 1
        L65:
            goto L69
        L67:
            r17 = r12
        L69:
            long r9 = r9 >> r17
            int r13 = r13 + 1
            r0 = r19
            r12 = r17
            goto L38
        L72:
            r17 = r12
            r0 = r17
            if (r11 != r0) goto L80
        L78:
            if (r8 == r7) goto L7f
            int r8 = r8 + 1
            r0 = r19
            goto L19
        L7f:
        L80:
            return r2
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object[] r0 = kotlin.jvm.internal.CollectionToArray.toArray(r0)
            return r0
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object[] r0 = kotlin.jvm.internal.CollectionToArray.toArray(r0, r2)
            return r0
    }
}
