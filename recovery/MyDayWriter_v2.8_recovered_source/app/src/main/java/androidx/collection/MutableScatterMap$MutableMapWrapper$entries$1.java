package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0010#\n\u0002\u0010'\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0016J\"\u0010\n\u001a\u00020\b2\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001d\u0010\u000f\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002J\"\u0010\u0010\u001a\u00020\b2\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\u001b\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0013H\u0096\u0002J\u001c\u0010\u0014\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0016J\"\u0010\u0015\u001a\u00020\b2\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016J\"\u0010\u0016\u001a\u00020\b2\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$entries$1", "", "", "size", "", "getSize", "()I", "add", "", "element", "addAll", "elements", "", "clear", "", "contains", "containsAll", "isEmpty", "iterator", "", "remove", "removeAll", "retainAll", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableScatterMap$MutableMapWrapper$entries$1<K, V> implements java.util.Set<java.util.Map.Entry<K, V>>, kotlin.jvm.internal.markers.KMutableSet {
    final /* synthetic */ androidx.collection.MutableScatterMap<K, V> this$0;

    MutableScatterMap$MutableMapWrapper$entries$1(androidx.collection.MutableScatterMap<K, V> r1) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>()
            return
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r2) {
            r1 = this;
            r0 = r2
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            boolean r0 = r1.add(r0)
            return r0
    }

    public boolean add(java.util.Map.Entry<K, V> r2) {
            r1 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection<? extends java.util.Map.Entry<K, V>> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
            r1 = this;
            androidx.collection.MutableScatterMap<K, V> r0 = r1.this$0
            r0.clear()
            return
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = kotlin.jvm.internal.TypeIntrinsics.isMutableMapEntry(r2)
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = r2
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            boolean r0 = r1.contains(r0)
            return r0
    }

    public boolean contains(java.util.Map.Entry<K, V> r3) {
            r2 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.collection.MutableScatterMap<K, V> r0 = r2.this$0
            java.lang.Object r1 = r3.getKey()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Object r1 = r3.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection<? extends java.lang.Object> r11) {
            r10 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = r11
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            androidx.collection.MutableScatterMap<K, V> r1 = r10.this$0
            r2 = 0
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            r4 = 1
            if (r3 == 0) goto L16
            goto L3d
        L16:
            java.util.Iterator r3 = r0.iterator()
        L1a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L3c
            java.lang.Object r5 = r3.next()
            r6 = r5
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            r7 = 0
            java.lang.Object r8 = r6.getKey()
            java.lang.Object r8 = r1.get(r8)
            java.lang.Object r9 = r6.getValue()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r9)
            if (r6 != 0) goto L1a
            r4 = 0
            goto L3d
        L3c:
        L3d:
            return r4
    }

    public int getSize() {
            r1 = this;
            androidx.collection.MutableScatterMap<K, V> r0 = r1.this$0
            int r0 = r0._size
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            androidx.collection.MutableScatterMap<K, V> r0 = r1.this$0
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            r2 = this;
            androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 r0 = new androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1
            androidx.collection.MutableScatterMap<K, V> r1 = r2.this$0
            r0.<init>(r1)
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = kotlin.jvm.internal.TypeIntrinsics.isMutableMapEntry(r2)
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = r2
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            boolean r0 = r1.remove(r0)
            return r0
    }

    public boolean remove(java.util.Map.Entry<K, V> r27) {
            r26 = this;
            r0 = r26
            java.lang.String r1 = "element"
            r2 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            androidx.collection.MutableScatterMap<K, V> r1 = r0.this$0
            androidx.collection.ScatterMap r1 = (androidx.collection.ScatterMap) r1
            java.lang.Object r3 = r2.getKey()
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L1a
            int r7 = r3.hashCode()
            goto L1b
        L1a:
            r7 = 0
        L1b:
            r8 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r7 = r7 * r8
            int r8 = r7 << 16
            r5 = r7 ^ r8
            r7 = 0
            r7 = r5 & 127(0x7f, float:1.78E-43)
            int r8 = r1._capacity
            r9 = 0
            int r9 = r5 >>> 7
            r9 = r9 & r8
            r10 = 0
        L2f:
            long[] r11 = r1.metadata
            r12 = 0
            int r13 = r9 >> 3
            r14 = r9 & 7
            int r14 = r14 << 3
            r15 = r11[r13]
            long r15 = r15 >>> r14
            int r17 = r13 + 1
            r17 = r11[r17]
            int r19 = 64 - r14
            long r17 = r17 << r19
            r20 = r7
            r19 = 0
            long r6 = (long) r14
            long r6 = -r6
            r21 = 63
            long r6 = r6 >> r21
            long r6 = r17 & r6
            long r6 = r6 | r15
            r11 = r6
            r13 = 0
            r15 = r4
            r16 = r5
            r14 = r20
            long r4 = (long) r14
            r17 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r4 = r4 * r17
            long r4 = r4 ^ r11
            long r17 = r4 - r17
            r20 = r6
            long r6 = ~r4
            long r6 = r17 & r6
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r6 & r17
        L71:
            r6 = r4
            r11 = 0
            r12 = 0
            int r22 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            r23 = 1
            if (r22 == 0) goto L7e
            r6 = r23
            goto L80
        L7e:
            r6 = r19
        L80:
            if (r6 == 0) goto La6
            r6 = r4
            r11 = 0
            r12 = r6
            r22 = 0
            int r24 = java.lang.Long.numberOfTrailingZeros(r12)
            int r12 = r24 >> 3
            int r12 = r12 + r9
            r6 = r12 & r8
            java.lang.Object[] r7 = r1.keys
            r7 = r7[r6]
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r3)
            if (r7 == 0) goto L9c
            goto Lb9
        L9c:
            r11 = r4
            r7 = 0
            r22 = 1
            long r22 = r11 - r22
            long r11 = r11 & r22
            r4 = r11
            goto L71
        La6:
            r6 = r20
            r11 = 0
            r24 = r12
            long r12 = ~r6
            r22 = 6
            long r12 = r12 << r22
            long r12 = r12 & r6
            long r6 = r12 & r17
            int r6 = (r6 > r24 ? 1 : (r6 == r24 ? 0 : -1))
            if (r6 == 0) goto Ld3
        Lb8:
            r6 = -1
        Lb9:
            if (r6 < 0) goto Ld2
            androidx.collection.MutableScatterMap<K, V> r1 = r0.this$0
            java.lang.Object[] r1 = r1.values
            r1 = r1[r6]
            java.lang.Object r3 = r2.getValue()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto Ld2
            androidx.collection.MutableScatterMap<K, V> r1 = r0.this$0
            r1.removeValueAt(r6)
            return r23
        Ld2:
            return r19
        Ld3:
            int r10 = r10 + 8
            int r6 = r9 + r10
            r9 = r6 & r8
            r7 = r14
            r4 = r15
            r5 = r16
            goto L2f
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r21) {
            r20 = this;
            r0 = r20
            java.lang.String r1 = "elements"
            r2 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            r1 = 0
            androidx.collection.MutableScatterMap<K, V> r3 = r0.this$0
            androidx.collection.ScatterMap r3 = (androidx.collection.ScatterMap) r3
            androidx.collection.MutableScatterMap<K, V> r4 = r0.this$0
            r5 = 0
            long[] r6 = r3.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            r8 = 0
            if (r8 > r7) goto Lac
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
            if (r11 == 0) goto La4
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L38:
            if (r13 >= r11) goto L9e
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
            if (r17 == 0) goto L93
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r14
            r16 = 0
            java.util.Iterator r17 = r2.iterator()
        L56:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L8f
            java.lang.Object r18 = r17.next()
            java.util.Map$Entry r18 = (java.util.Map.Entry) r18
            r19 = r12
            java.lang.Object r12 = r18.getKey()
            java.lang.Object[] r0 = r4.keys
            r0 = r0[r15]
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r0)
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r18.getValue()
            java.lang.Object[] r12 = r4.values
            r12 = r12[r15]
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r12)
            if (r0 == 0) goto L85
            r4.removeValueAt(r15)
            r1 = 1
            goto L91
        L85:
            r0 = r20
            r12 = r19
            goto L56
        L8a:
            r0 = r20
            r12 = r19
            goto L56
        L8f:
            r19 = r12
        L91:
            goto L95
        L93:
            r19 = r12
        L95:
            long r9 = r9 >> r19
            int r13 = r13 + 1
            r0 = r20
            r12 = r19
            goto L38
        L9e:
            r19 = r12
            r0 = r19
            if (r11 != r0) goto Lad
        La4:
            if (r8 == r7) goto Lac
            int r8 = r8 + 1
            r0 = r20
            goto L19
        Lac:
        Lad:
            return r1
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r22) {
            r21 = this;
            r0 = r21
            java.lang.String r1 = "elements"
            r2 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            r1 = 0
            androidx.collection.MutableScatterMap<K, V> r3 = r0.this$0
            androidx.collection.ScatterMap r3 = (androidx.collection.ScatterMap) r3
            androidx.collection.MutableScatterMap<K, V> r4 = r0.this$0
            r5 = 0
            long[] r6 = r3.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            r8 = 0
            if (r8 > r7) goto Lb2
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
            if (r11 == 0) goto Laa
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L38:
            if (r13 >= r11) goto La4
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
            if (r17 == 0) goto L99
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r14
            r16 = 0
            r17 = 0
            java.util.Iterator r18 = r2.iterator()
        L58:
            boolean r19 = r18.hasNext()
            if (r19 == 0) goto L8f
            java.lang.Object r19 = r18.next()
            java.util.Map$Entry r19 = (java.util.Map.Entry) r19
            r20 = r12
            java.lang.Object r12 = r19.getKey()
            java.lang.Object[] r0 = r4.keys
            r0 = r0[r15]
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r0)
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r19.getValue()
            java.lang.Object[] r12 = r4.values
            r12 = r12[r15]
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r12)
            if (r0 == 0) goto L85
            r17 = 1
            goto L91
        L85:
            r0 = r21
            r12 = r20
            goto L58
        L8a:
            r0 = r21
            r12 = r20
            goto L58
        L8f:
            r20 = r12
        L91:
            if (r17 != 0) goto L97
            r4.removeValueAt(r15)
            r1 = 1
        L97:
            goto L9b
        L99:
            r20 = r12
        L9b:
            long r9 = r9 >> r20
            int r13 = r13 + 1
            r0 = r21
            r12 = r20
            goto L38
        La4:
            r20 = r12
            r0 = r20
            if (r11 != r0) goto Lb3
        Laa:
            if (r8 == r7) goto Lb2
            int r8 = r8 + 1
            r0 = r21
            goto L19
        Lb2:
        Lb3:
            return r1
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object[] r0 = kotlin.jvm.internal.CollectionToArray.toArray(r0)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
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
