package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public class ArrayMap<K, V> extends androidx.collection.SimpleArrayMap<K, V> implements java.util.Map<K, V> {
    androidx.collection.ArrayMap<K, V>.EntrySet mEntrySet;
    androidx.collection.ArrayMap<K, V>.KeySet mKeySet;
    androidx.collection.ArrayMap<K, V>.ValueCollection mValues;

    final class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        final /* synthetic */ androidx.collection.ArrayMap this$0;

        EntrySet(androidx.collection.ArrayMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r2 = this;
                androidx.collection.ArrayMap$MapIterator r0 = new androidx.collection.ArrayMap$MapIterator
                androidx.collection.ArrayMap r1 = r2.this$0
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    final class KeyIterator extends androidx.collection.IndexBasedArrayIterator<K> {
        final /* synthetic */ androidx.collection.ArrayMap this$0;

        KeyIterator(androidx.collection.ArrayMap r2) {
                r1 = this;
                r1.this$0 = r2
                int r0 = r2.size()
                r1.<init>(r0)
                return
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected K elementAt(int r2) {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                java.lang.Object r0 = r0.keyAt(r2)
                return r0
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int r2) {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                r0.removeAt(r2)
                return
        }
    }

    final class KeySet implements java.util.Set<K> {
        final /* synthetic */ androidx.collection.ArrayMap this$0;

        KeySet(androidx.collection.ArrayMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends K> r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                boolean r0 = r0.containsKey(r2)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                boolean r0 = r0.containsAll(r2)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = androidx.collection.ArrayMap.equalsSetHelper(r1, r2)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
                r4 = this;
                r0 = 0
                androidx.collection.ArrayMap r1 = r4.this$0
                int r1 = r1.size()
                int r1 = r1 + (-1)
            L9:
                if (r1 < 0) goto L1d
                androidx.collection.ArrayMap r2 = r4.this$0
                java.lang.Object r2 = r2.keyAt(r1)
                if (r2 != 0) goto L15
                r3 = 0
                goto L19
            L15:
                int r3 = r2.hashCode()
            L19:
                int r0 = r0 + r3
                int r1 = r1 + (-1)
                goto L9
            L1d:
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<K> iterator() {
                r2 = this;
                androidx.collection.ArrayMap$KeyIterator r0 = new androidx.collection.ArrayMap$KeyIterator
                androidx.collection.ArrayMap r1 = r2.this$0
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object r3) {
                r2 = this;
                androidx.collection.ArrayMap r0 = r2.this$0
                int r0 = r0.indexOfKey(r3)
                if (r0 < 0) goto Lf
                androidx.collection.ArrayMap r1 = r2.this$0
                r1.removeAt(r0)
                r1 = 1
                return r1
            Lf:
                r1 = 0
                return r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r2) {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                boolean r0 = r0.removeAll(r2)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r2) {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                boolean r0 = r0.retainAll(r2)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
                r4 = this;
                androidx.collection.ArrayMap r0 = r4.this$0
                int r0 = r0.size()
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r2 = 0
            L9:
                if (r2 >= r0) goto L16
                androidx.collection.ArrayMap r3 = r4.this$0
                java.lang.Object r3 = r3.keyAt(r2)
                r1[r2] = r3
                int r2 = r2 + 1
                goto L9
            L16:
                return r1
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] r4) {
                r3 = this;
                int r0 = r3.size()
                int r1 = r4.length
                if (r1 >= r0) goto L16
                java.lang.Class r1 = r4.getClass()
                java.lang.Class r1 = r1.getComponentType()
                java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r0)
                r4 = r1
                java.lang.Object[] r4 = (java.lang.Object[]) r4
            L16:
                r1 = 0
            L17:
                if (r1 >= r0) goto L24
                androidx.collection.ArrayMap r2 = r3.this$0
                java.lang.Object r2 = r2.keyAt(r1)
                r4[r1] = r2
                int r1 = r1 + 1
                goto L17
            L24:
                int r1 = r4.length
                if (r1 <= r0) goto L2a
                r1 = 0
                r4[r0] = r1
            L2a:
                return r4
        }
    }

    final class MapIterator implements java.util.Iterator<java.util.Map.Entry<K, V>>, java.util.Map.Entry<K, V> {
        int mEnd;
        boolean mEntryValid;
        int mIndex;
        final /* synthetic */ androidx.collection.ArrayMap this$0;

        MapIterator(androidx.collection.ArrayMap r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                int r0 = r2.size()
                int r0 = r0 + (-1)
                r1.mEnd = r0
                r0 = -1
                r1.mIndex = r0
                return
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r6) {
                r5 = this;
                boolean r0 = r5.mEntryValid
                if (r0 == 0) goto L35
                boolean r0 = r6 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                r0 = r6
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r2 = r0.getKey()
                androidx.collection.ArrayMap r3 = r5.this$0
                int r4 = r5.mIndex
                java.lang.Object r3 = r3.keyAt(r4)
                boolean r2 = androidx.collection.internal.ContainerHelpersKt.equal(r2, r3)
                if (r2 == 0) goto L33
                java.lang.Object r2 = r0.getValue()
                androidx.collection.ArrayMap r3 = r5.this$0
                int r4 = r5.mIndex
                java.lang.Object r3 = r3.valueAt(r4)
                boolean r2 = androidx.collection.internal.ContainerHelpersKt.equal(r2, r3)
                if (r2 == 0) goto L33
                r1 = 1
                goto L34
            L33:
            L34:
                return r1
            L35:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r2 = this;
                boolean r0 = r2.mEntryValid
                if (r0 == 0) goto Ld
                androidx.collection.ArrayMap r0 = r2.this$0
                int r1 = r2.mIndex
                java.lang.Object r0 = r0.keyAt(r1)
                return r0
            Ld:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r2 = this;
                boolean r0 = r2.mEntryValid
                if (r0 == 0) goto Ld
                androidx.collection.ArrayMap r0 = r2.this$0
                int r1 = r2.mIndex
                java.lang.Object r0 = r0.valueAt(r1)
                return r0
            Ld:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.mIndex
                int r1 = r2.mEnd
                if (r0 >= r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r4 = this;
                boolean r0 = r4.mEntryValid
                if (r0 == 0) goto L26
                androidx.collection.ArrayMap r0 = r4.this$0
                int r1 = r4.mIndex
                java.lang.Object r0 = r0.keyAt(r1)
                androidx.collection.ArrayMap r1 = r4.this$0
                int r2 = r4.mIndex
                java.lang.Object r1 = r1.valueAt(r2)
                r2 = 0
                if (r0 != 0) goto L19
                r3 = r2
                goto L1d
            L19:
                int r3 = r0.hashCode()
            L1d:
                if (r1 != 0) goto L20
                goto L24
            L20:
                int r2 = r1.hashCode()
            L24:
                r2 = r2 ^ r3
                return r2
            L26:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto Lf
                int r0 = r2.mIndex
                r1 = 1
                int r0 = r0 + r1
                r2.mIndex = r0
                r2.mEntryValid = r1
                return r2
            Lf:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                boolean r0 = r2.mEntryValid
                if (r0 == 0) goto L1b
                androidx.collection.ArrayMap r0 = r2.this$0
                int r1 = r2.mIndex
                r0.removeAt(r1)
                int r0 = r2.mIndex
                int r0 = r0 + (-1)
                r2.mIndex = r0
                int r0 = r2.mEnd
                int r0 = r0 + (-1)
                r2.mEnd = r0
                r0 = 0
                r2.mEntryValid = r0
                return
            L1b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r3) {
                r2 = this;
                boolean r0 = r2.mEntryValid
                if (r0 == 0) goto Ld
                androidx.collection.ArrayMap r0 = r2.this$0
                int r1 = r2.mIndex
                java.lang.Object r0 = r0.setValueAt(r1, r3)
                return r0
            Ld:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Object r1 = r2.getKey()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Object r1 = r2.getValue()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    final class ValueCollection implements java.util.Collection<V> {
        final /* synthetic */ androidx.collection.ArrayMap this$0;

        ValueCollection(androidx.collection.ArrayMap r1) {
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
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Collection
        public void clear() {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                int r0 = r0.__restricted$indexOfValue(r2)
                if (r0 < 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.Collection
        public boolean containsAll(java.util.Collection<?> r4) {
                r3 = this;
                java.util.Iterator r0 = r4.iterator()
            L4:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L17
                java.lang.Object r1 = r0.next()
                boolean r2 = r3.contains(r1)
                if (r2 != 0) goto L16
                r0 = 0
                return r0
            L16:
                goto L4
            L17:
                r0 = 1
                return r0
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r2 = this;
                androidx.collection.ArrayMap$ValueIterator r0 = new androidx.collection.ArrayMap$ValueIterator
                androidx.collection.ArrayMap r1 = r2.this$0
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.Collection
        public boolean remove(java.lang.Object r3) {
                r2 = this;
                androidx.collection.ArrayMap r0 = r2.this$0
                int r0 = r0.__restricted$indexOfValue(r3)
                if (r0 < 0) goto Lf
                androidx.collection.ArrayMap r1 = r2.this$0
                r1.removeAt(r0)
                r1 = 1
                return r1
            Lf:
                r1 = 0
                return r1
        }

        @Override // java.util.Collection
        public boolean removeAll(java.util.Collection<?> r6) {
                r5 = this;
                androidx.collection.ArrayMap r0 = r5.this$0
                int r0 = r0.size()
                r1 = 0
                r2 = 0
            L8:
                if (r2 >= r0) goto L23
                androidx.collection.ArrayMap r3 = r5.this$0
                java.lang.Object r3 = r3.valueAt(r2)
                boolean r4 = r6.contains(r3)
                if (r4 == 0) goto L20
                androidx.collection.ArrayMap r4 = r5.this$0
                r4.removeAt(r2)
                int r2 = r2 + (-1)
                int r0 = r0 + (-1)
                r1 = 1
            L20:
                int r2 = r2 + 1
                goto L8
            L23:
                return r1
        }

        @Override // java.util.Collection
        public boolean retainAll(java.util.Collection<?> r6) {
                r5 = this;
                androidx.collection.ArrayMap r0 = r5.this$0
                int r0 = r0.size()
                r1 = 0
                r2 = 0
            L8:
                if (r2 >= r0) goto L23
                androidx.collection.ArrayMap r3 = r5.this$0
                java.lang.Object r3 = r3.valueAt(r2)
                boolean r4 = r6.contains(r3)
                if (r4 != 0) goto L20
                androidx.collection.ArrayMap r4 = r5.this$0
                r4.removeAt(r2)
                int r2 = r2 + (-1)
                int r0 = r0 + (-1)
                r1 = 1
            L20:
                int r2 = r2 + 1
                goto L8
            L23:
                return r1
        }

        @Override // java.util.Collection
        public int size() {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.Collection
        public java.lang.Object[] toArray() {
                r4 = this;
                androidx.collection.ArrayMap r0 = r4.this$0
                int r0 = r0.size()
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r2 = 0
            L9:
                if (r2 >= r0) goto L16
                androidx.collection.ArrayMap r3 = r4.this$0
                java.lang.Object r3 = r3.valueAt(r2)
                r1[r2] = r3
                int r2 = r2 + 1
                goto L9
            L16:
                return r1
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] r4) {
                r3 = this;
                int r0 = r3.size()
                int r1 = r4.length
                if (r1 >= r0) goto L16
                java.lang.Class r1 = r4.getClass()
                java.lang.Class r1 = r1.getComponentType()
                java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r0)
                r4 = r1
                java.lang.Object[] r4 = (java.lang.Object[]) r4
            L16:
                r1 = 0
            L17:
                if (r1 >= r0) goto L24
                androidx.collection.ArrayMap r2 = r3.this$0
                java.lang.Object r2 = r2.valueAt(r1)
                r4[r1] = r2
                int r1 = r1 + 1
                goto L17
            L24:
                int r1 = r4.length
                if (r1 <= r0) goto L2a
                r1 = 0
                r4[r0] = r1
            L2a:
                return r4
        }
    }

    final class ValueIterator extends androidx.collection.IndexBasedArrayIterator<V> {
        final /* synthetic */ androidx.collection.ArrayMap this$0;

        ValueIterator(androidx.collection.ArrayMap r2) {
                r1 = this;
                r1.this$0 = r2
                int r0 = r2.size()
                r1.<init>(r0)
                return
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected V elementAt(int r2) {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                java.lang.Object r0 = r0.valueAt(r2)
                return r0
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int r2) {
                r1 = this;
                androidx.collection.ArrayMap r0 = r1.this$0
                r0.removeAt(r2)
                return
        }
    }

    public ArrayMap() {
            r0 = this;
            r0.<init>()
            return
    }

    public ArrayMap(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public ArrayMap(androidx.collection.SimpleArrayMap r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static <T> boolean equalsSetHelper(java.util.Set<T> r5, java.lang.Object r6) {
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L22
            r1 = r6
            java.util.Set r1 = (java.util.Set) r1
            int r3 = r5.size()     // Catch: java.lang.ClassCastException -> L1f java.lang.NullPointerException -> L21
            int r4 = r1.size()     // Catch: java.lang.ClassCastException -> L1f java.lang.NullPointerException -> L21
            if (r3 != r4) goto L1d
            boolean r3 = r5.containsAll(r1)     // Catch: java.lang.ClassCastException -> L1f java.lang.NullPointerException -> L21
            if (r3 == 0) goto L1d
            goto L1e
        L1d:
            r0 = r2
        L1e:
            return r0
        L1f:
            r0 = move-exception
            goto L22
        L21:
            r0 = move-exception
        L22:
            return r2
    }

    public boolean containsAll(java.util.Collection<?> r4) {
            r3 = this;
            java.util.Iterator r0 = r4.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r0.next()
            boolean r2 = r3.containsKey(r1)
            if (r2 != 0) goto L16
            r0 = 0
            return r0
        L16:
            goto L4
        L17:
            r0 = 1
            return r0
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            boolean r0 = super.containsKey(r2)
            return r0
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public boolean containsValue(java.lang.Object r2) {
            r1 = this;
            boolean r0 = super.containsValue(r2)
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r2 = this;
            androidx.collection.ArrayMap<K, V>$EntrySet r0 = r2.mEntrySet
            if (r0 != 0) goto Lc
            androidx.collection.ArrayMap$EntrySet r1 = new androidx.collection.ArrayMap$EntrySet
            r1.<init>(r2)
            r2.mEntrySet = r1
            r0 = r1
        Lc:
            return r0
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V get(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = super.get(r2)
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<K> keySet() {
            r2 = this;
            androidx.collection.ArrayMap<K, V>$KeySet r0 = r2.mKeySet
            if (r0 != 0) goto Lc
            androidx.collection.ArrayMap$KeySet r1 = new androidx.collection.ArrayMap$KeySet
            r1.<init>(r2)
            r2.mKeySet = r1
            r0 = r1
        Lc:
            return r0
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r5) {
            r4 = this;
            int r0 = r4.size()
            int r1 = r5.size()
            int r0 = r0 + r1
            r4.ensureCapacity(r0)
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r3 = r1.getValue()
            r4.put(r2, r3)
            goto L14
        L2c:
            return
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V remove(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = super.remove(r2)
            return r0
    }

    public boolean removeAll(java.util.Collection<?> r4) {
            r3 = this;
            int r0 = r3.size()
            java.util.Iterator r1 = r4.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L16
            java.lang.Object r2 = r1.next()
            r3.remove(r2)
            goto L8
        L16:
            int r1 = r3.size()
            if (r0 == r1) goto L1e
            r1 = 1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            return r1
    }

    public boolean retainAll(java.util.Collection<?> r5) {
            r4 = this;
            int r0 = r4.size()
            int r1 = r4.size()
            r2 = 1
            int r1 = r1 - r2
        La:
            if (r1 < 0) goto L1c
            java.lang.Object r3 = r4.keyAt(r1)
            boolean r3 = r5.contains(r3)
            if (r3 != 0) goto L19
            r4.removeAt(r1)
        L19:
            int r1 = r1 + (-1)
            goto La
        L1c:
            int r1 = r4.size()
            if (r0 == r1) goto L23
            goto L24
        L23:
            r2 = 0
        L24:
            return r2
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
            r2 = this;
            androidx.collection.ArrayMap<K, V>$ValueCollection r0 = r2.mValues
            if (r0 != 0) goto Lc
            androidx.collection.ArrayMap$ValueCollection r1 = new androidx.collection.ArrayMap$ValueCollection
            r1.<init>(r2)
            r2.mValues = r1
            r0 = r1
        Lc:
            return r0
    }
}
