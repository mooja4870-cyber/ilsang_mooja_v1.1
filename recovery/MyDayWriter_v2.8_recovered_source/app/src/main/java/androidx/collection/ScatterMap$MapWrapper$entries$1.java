package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0010\"\n\u0002\u0010&\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002J\"\u0010\n\u001a\u00020\b2\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\fH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\u001b\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u000fH\u0096\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"androidx/collection/ScatterMap$MapWrapper$entries$1", "", "", "size", "", "getSize", "()I", "contains", "", "element", "containsAll", "elements", "", "isEmpty", "iterator", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScatterMap$MapWrapper$entries$1<K, V> implements java.util.Set<java.util.Map.Entry<? extends K, ? extends V>>, kotlin.jvm.internal.markers.KMappedMarker {
    final /* synthetic */ androidx.collection.ScatterMap<K, V> this$0;

    ScatterMap$MapWrapper$entries$1(androidx.collection.ScatterMap<K, V> r1) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>()
            return
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    public boolean add(java.util.Map.Entry<? extends K, ? extends V> r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection<? extends java.util.Map.Entry<? extends K, ? extends V>> r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.Map.Entry
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r2
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            boolean r0 = r1.contains(r0)
            return r0
    }

    public boolean contains(java.util.Map.Entry<? extends K, ? extends V> r3) {
            r2 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.collection.ScatterMap<K, V> r0 = r2.this$0
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
            androidx.collection.ScatterMap<K, V> r1 = r10.this$0
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
            androidx.collection.ScatterMap<K, V> r0 = r1.this$0
            int r0 = r0._size
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            androidx.collection.ScatterMap<K, V> r0 = r1.this$0
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            r3 = this;
            androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1 r0 = new androidx.collection.ScatterMap$MapWrapper$entries$1$iterator$1
            androidx.collection.ScatterMap<K, V> r1 = r3.this$0
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            java.util.Iterator r0 = kotlin.sequences.SequencesKt.iterator(r0)
            return r0
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
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
