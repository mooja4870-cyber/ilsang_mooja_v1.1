package com.google.crypto.tink.shaded.protobuf;

import java.lang.Comparable;

/* JADX INFO: loaded from: classes.dex */
class SmallSortedMap<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {
    private java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>.Entry> entryList;
    private boolean isImmutable;
    private volatile com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>.DescendingEntrySet lazyDescendingEntrySet;
    private volatile com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>.EntrySet lazyEntrySet;
    private final int maxArraySize;
    private java.util.Map<K, V> overflowEntries;
    private java.util.Map<K, V> overflowEntriesDescending;


    private class DescendingEntryIterator implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        private java.util.Iterator<java.util.Map.Entry<K, V>> lazyOverflowIterator;
        private int pos;
        final /* synthetic */ com.google.crypto.tink.shaded.protobuf.SmallSortedMap this$0;

        private DescendingEntryIterator(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = r0.this$0
                java.util.List r1 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$600(r1)
                int r1 = r1.size()
                r0.pos = r1
                return
        }

        /* synthetic */ DescendingEntryIterator(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1, com.google.crypto.tink.shaded.protobuf.SmallSortedMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private java.util.Iterator<java.util.Map.Entry<K, V>> getOverflowIterator() {
                r1 = this;
                java.util.Iterator<java.util.Map$Entry<K extends java.lang.Comparable<K>, V>> r0 = r1.lazyOverflowIterator
                if (r0 != 0) goto L14
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r1.this$0
                java.util.Map r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$900(r0)
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r1.lazyOverflowIterator = r0
            L14:
                java.util.Iterator<java.util.Map$Entry<K extends java.lang.Comparable<K>, V>> r0 = r1.lazyOverflowIterator
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.pos
                if (r0 <= 0) goto L12
                int r0 = r2.pos
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = r2.this$0
                java.util.List r1 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$600(r1)
                int r1 = r1.size()
                if (r0 <= r1) goto L1c
            L12:
                java.util.Iterator r0 = r2.getOverflowIterator()
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L1e
            L1c:
                r0 = 1
                goto L1f
            L1e:
                r0 = 0
            L1f:
                return r0
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
                java.util.Iterator r0 = r2.getOverflowIterator()
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L15
                java.util.Iterator r0 = r2.getOverflowIterator()
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                return r0
            L15:
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r2.this$0
                java.util.List r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$600(r0)
                int r1 = r2.pos
                int r1 = r1 + (-1)
                r2.pos = r1
                java.lang.Object r0 = r0.get(r1)
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }
    }

    private class DescendingEntrySet extends com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>.EntrySet {
        final /* synthetic */ com.google.crypto.tink.shaded.protobuf.SmallSortedMap this$0;

        private DescendingEntrySet(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r2) {
                r1 = this;
                r1.this$0 = r2
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        /* synthetic */ DescendingEntrySet(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1, com.google.crypto.tink.shaded.protobuf.SmallSortedMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.SmallSortedMap.EntrySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap$DescendingEntryIterator r0 = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap$DescendingEntryIterator
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = r3.this$0
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }
    }

    private static class EmptySet {
        private static final java.lang.Iterable<java.lang.Object> ITERABLE = null;
        private static final java.util.Iterator<java.lang.Object> ITERATOR = null;



        static {
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap$EmptySet$1 r0 = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap$EmptySet$1
                r0.<init>()
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap.EmptySet.ITERATOR = r0
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap$EmptySet$2 r0 = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap$EmptySet$2
                r0.<init>()
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap.EmptySet.ITERABLE = r0
                return
        }

        private EmptySet() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.util.Iterator access$1000() {
                java.util.Iterator<java.lang.Object> r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.EmptySet.ITERATOR
                return r0
        }

        static <T> java.lang.Iterable<T> iterable() {
                java.lang.Iterable<java.lang.Object> r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.EmptySet.ITERABLE
                return r0
        }
    }

    private class Entry implements java.util.Map.Entry<K, V>, java.lang.Comparable<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>.Entry> {
        private final K key;
        final /* synthetic */ com.google.crypto.tink.shaded.protobuf.SmallSortedMap this$0;
        private V value;

        Entry(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1, K r2, V r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.key = r2
                r0.value = r3
                return
        }

        Entry(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r3, java.util.Map.Entry<K, V> r4) {
                r2 = this;
                java.lang.Object r0 = r4.getKey()
                java.lang.Comparable r0 = (java.lang.Comparable) r0
                java.lang.Object r1 = r4.getValue()
                r2.<init>(r3, r0, r1)
                return
        }

        private boolean equals(java.lang.Object r2, java.lang.Object r3) {
                r1 = this;
                if (r2 != 0) goto L8
                if (r3 != 0) goto L6
                r0 = 1
                goto Lc
            L6:
                r0 = 0
                goto Lc
            L8:
                boolean r0 = r2.equals(r3)
            Lc:
                return r0
        }

        public int compareTo(com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>.Entry r3) {
                r2 = this;
                java.lang.Comparable r0 = r2.getKey()
                java.lang.Comparable r1 = r3.getKey()
                int r0 = r0.compareTo(r1)
                return r0
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry r1 = (com.google.crypto.tink.shaded.protobuf.SmallSortedMap.Entry) r1
                int r1 = r0.compareTo(r1)
                return r1
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r6 != r5) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof java.util.Map.Entry
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                r1 = r6
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                K extends java.lang.Comparable<K> r3 = r5.key
                java.lang.Object r4 = r1.getKey()
                boolean r3 = r5.equals(r3, r4)
                if (r3 == 0) goto L26
                V r3 = r5.value
                java.lang.Object r4 = r1.getValue()
                boolean r3 = r5.equals(r3, r4)
                if (r3 == 0) goto L26
                goto L27
            L26:
                r0 = r2
            L27:
                return r0
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r1 = this;
                K extends java.lang.Comparable<K> r0 = r1.key
                return r0
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.lang.Object getKey() {
                r1 = this;
                java.lang.Comparable r0 = r1.getKey()
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r1 = this;
                V r0 = r1.value
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r3 = this;
                K extends java.lang.Comparable<K> r0 = r3.key
                r1 = 0
                if (r0 != 0) goto L7
                r0 = r1
                goto Ld
            L7:
                K extends java.lang.Comparable<K> r0 = r3.key
                int r0 = r0.hashCode()
            Ld:
                V r2 = r3.value
                if (r2 != 0) goto L12
                goto L18
            L12:
                V r1 = r3.value
                int r1 = r1.hashCode()
            L18:
                r0 = r0 ^ r1
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r1.this$0
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$300(r0)
                V r0 = r1.value
                r1.value = r2
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                K extends java.lang.Comparable<K> r1 = r2.key
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "="
                java.lang.StringBuilder r0 = r0.append(r1)
                V r1 = r2.value
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private class EntryIterator implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        private java.util.Iterator<java.util.Map.Entry<K, V>> lazyOverflowIterator;
        private boolean nextCalledBeforeRemove;
        private int pos;
        final /* synthetic */ com.google.crypto.tink.shaded.protobuf.SmallSortedMap this$0;

        private EntryIterator(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = -1
                r0.pos = r1
                return
        }

        /* synthetic */ EntryIterator(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1, com.google.crypto.tink.shaded.protobuf.SmallSortedMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private java.util.Iterator<java.util.Map.Entry<K, V>> getOverflowIterator() {
                r1 = this;
                java.util.Iterator<java.util.Map$Entry<K extends java.lang.Comparable<K>, V>> r0 = r1.lazyOverflowIterator
                if (r0 != 0) goto L14
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r1.this$0
                java.util.Map r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$700(r0)
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r1.lazyOverflowIterator = r0
            L14:
                java.util.Iterator<java.util.Map$Entry<K extends java.lang.Comparable<K>, V>> r0 = r1.lazyOverflowIterator
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r3 = this;
                int r0 = r3.pos
                r1 = 1
                int r0 = r0 + r1
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r2 = r3.this$0
                java.util.List r2 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$600(r2)
                int r2 = r2.size()
                if (r0 < r2) goto L29
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r3.this$0
                java.util.Map r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$700(r0)
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L27
                java.util.Iterator r0 = r3.getOverflowIterator()
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L27
                goto L29
            L27:
                r1 = 0
                goto L2a
            L29:
            L2a:
                return r1
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
                r0 = 1
                r2.nextCalledBeforeRemove = r0
                int r1 = r2.pos
                int r1 = r1 + r0
                r2.pos = r1
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r2.this$0
                java.util.List r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$600(r0)
                int r0 = r0.size()
                if (r1 >= r0) goto L23
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r2.this$0
                java.util.List r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$600(r0)
                int r1 = r2.pos
                java.lang.Object r0 = r0.get(r1)
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                return r0
            L23:
                java.util.Iterator r0 = r2.getOverflowIterator()
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r3 = this;
                boolean r0 = r3.nextCalledBeforeRemove
                if (r0 == 0) goto L2e
                r0 = 0
                r3.nextCalledBeforeRemove = r0
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r3.this$0
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$300(r0)
                int r0 = r3.pos
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = r3.this$0
                java.util.List r1 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$600(r1)
                int r1 = r1.size()
                if (r0 >= r1) goto L26
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r3.this$0
                int r1 = r3.pos
                int r2 = r1 + (-1)
                r3.pos = r2
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap.access$800(r0, r1)
                goto L2d
            L26:
                java.util.Iterator r0 = r3.getOverflowIterator()
                r0.remove()
            L2d:
                return
            L2e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "remove() was called before next()"
                r0.<init>(r1)
                throw r0
        }
    }

    private class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        final /* synthetic */ com.google.crypto.tink.shaded.protobuf.SmallSortedMap this$0;

        private EntrySet(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ EntrySet(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1, com.google.crypto.tink.shaded.protobuf.SmallSortedMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
                r0 = this;
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                boolean r1 = r0.add(r1)
                return r1
        }

        public boolean add(java.util.Map.Entry<K, V> r4) {
                r3 = this;
                boolean r0 = r3.contains(r4)
                if (r0 != 0) goto L17
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r3.this$0
                java.lang.Object r1 = r4.getKey()
                java.lang.Comparable r1 = (java.lang.Comparable) r1
                java.lang.Object r2 = r4.getValue()
                r0.put(r1, r2)
                r0 = 1
                return r0
            L17:
                r0 = 0
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r5) {
                r4 = this;
                r0 = r5
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = r4.this$0
                java.lang.Object r2 = r0.getKey()
                java.lang.Object r1 = r1.get(r2)
                java.lang.Object r2 = r0.getValue()
                if (r1 == r2) goto L1e
                if (r1 == 0) goto L1c
                boolean r3 = r1.equals(r2)
                if (r3 == 0) goto L1c
                goto L1e
            L1c:
                r3 = 0
                goto L1f
            L1e:
                r3 = 1
            L1f:
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap$EntryIterator r0 = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap$EntryIterator
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = r3.this$0
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r4) {
                r3 = this;
                r0 = r4
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                boolean r1 = r3.contains(r0)
                if (r1 == 0) goto L14
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = r3.this$0
                java.lang.Object r2 = r0.getKey()
                r1.remove(r2)
                r1 = 1
                return r1
            L14:
                r1 = 0
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    private SmallSortedMap(int r2) {
            r1 = this;
            r1.<init>()
            r1.maxArraySize = r2
            java.util.List r0 = java.util.Collections.emptyList()
            r1.entryList = r0
            java.util.Map r0 = java.util.Collections.emptyMap()
            r1.overflowEntries = r0
            java.util.Map r0 = java.util.Collections.emptyMap()
            r1.overflowEntriesDescending = r0
            return
    }

    /* synthetic */ SmallSortedMap(int r1, com.google.crypto.tink.shaded.protobuf.SmallSortedMap.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ void access$300(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0) {
            r0.checkMutable()
            return
    }

    static /* synthetic */ java.util.List access$600(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1) {
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r0 = r1.entryList
            return r0
    }

    static /* synthetic */ java.util.Map access$700(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1) {
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            return r0
    }

    static /* synthetic */ java.lang.Object access$800(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1, int r2) {
            java.lang.Object r0 = r1.removeArrayEntryAt(r2)
            return r0
    }

    static /* synthetic */ java.util.Map access$900(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1) {
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntriesDescending
            return r0
    }

    private int binarySearchInArray(K r5) {
            r4 = this;
            r0 = 0
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r1 = r4.entryList
            int r1 = r1.size()
            int r1 = r1 + (-1)
            if (r1 < 0) goto L24
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r2 = r4.entryList
            java.lang.Object r2 = r2.get(r1)
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry r2 = (com.google.crypto.tink.shaded.protobuf.SmallSortedMap.Entry) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L21
            int r3 = r1 + 2
            int r3 = -r3
            return r3
        L21:
            if (r2 != 0) goto L24
            return r1
        L24:
            if (r0 > r1) goto L45
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r3 = r4.entryList
            java.lang.Object r3 = r3.get(r2)
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry r3 = (com.google.crypto.tink.shaded.protobuf.SmallSortedMap.Entry) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3f
            int r1 = r2 + (-1)
            goto L43
        L3f:
            if (r3 <= 0) goto L44
            int r0 = r2 + 1
        L43:
            goto L24
        L44:
            return r2
        L45:
            int r2 = r0 + 1
            int r2 = -r2
            return r2
    }

    private void checkMutable() {
            r1 = this;
            boolean r0 = r1.isImmutable
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    private void ensureEntryArrayMutable() {
            r2 = this;
            r2.checkMutable()
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r0 = r2.entryList
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r0 = r2.entryList
            boolean r0 = r0 instanceof java.util.ArrayList
            if (r0 != 0) goto L1a
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.maxArraySize
            r0.<init>(r1)
            r2.entryList = r0
        L1a:
            return
    }

    private java.util.SortedMap<K, V> getOverflowEntriesMutable() {
            r1 = this;
            r1.checkMutable()
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            boolean r0 = r0 instanceof java.util.TreeMap
            if (r0 != 0) goto L22
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r1.overflowEntries = r0
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            java.util.NavigableMap r0 = r0.descendingMap()
            r1.overflowEntriesDescending = r0
        L22:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }

    static <FieldDescriptorType extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<FieldDescriptorType>> com.google.crypto.tink.shaded.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object> newFieldMap(int r1) {
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$1 r0 = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap$1
            r0.<init>(r1)
            return r0
    }

    static <K extends java.lang.Comparable<K>, V> com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V> newInstanceForTest(int r1) {
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap
            r0.<init>(r1)
            return r0
    }

    private V removeArrayEntryAt(int r6) {
            r5 = this;
            r5.checkMutable()
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r0 = r5.entryList
            java.lang.Object r0 = r0.remove(r6)
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry r0 = (com.google.crypto.tink.shaded.protobuf.SmallSortedMap.Entry) r0
            java.lang.Object r0 = r0.getValue()
            java.util.Map<K extends java.lang.Comparable<K>, V> r1 = r5.overflowEntries
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L36
            java.util.SortedMap r1 = r5.getOverflowEntriesMutable()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r2 = r5.entryList
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry r3 = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r3.<init>(r5, r4)
            r2.add(r3)
            r1.remove()
        L36:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r1 = this;
            r1.checkMutable()
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r0 = r1.entryList
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L10
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r0 = r1.entryList
            r0.clear()
        L10:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            r0.clear()
        L1d:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object r3) {
            r2 = this;
            r0 = r3
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            int r1 = r2.binarySearchInArray(r0)
            if (r1 >= 0) goto L14
            java.util.Map<K extends java.lang.Comparable<K>, V> r1 = r2.overflowEntries
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L12
            goto L14
        L12:
            r1 = 0
            goto L15
        L14:
            r1 = 1
        L15:
            return r1
    }

    java.util.Set<java.util.Map.Entry<K, V>> descendingEntrySet() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$DescendingEntrySet r0 = r2.lazyDescendingEntrySet
            if (r0 != 0) goto Lc
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$DescendingEntrySet r0 = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap$DescendingEntrySet
            r1 = 0
            r0.<init>(r2, r1)
            r2.lazyDescendingEntrySet = r0
        Lc:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$DescendingEntrySet r0 = r2.lazyDescendingEntrySet
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$EntrySet r0 = r2.lazyEntrySet
            if (r0 != 0) goto Lc
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$EntrySet r0 = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap$EntrySet
            r1 = 0
            r0.<init>(r2, r1)
            r2.lazyEntrySet = r0
        Lc:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$EntrySet r0 = r2.lazyEntrySet
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.crypto.tink.shaded.protobuf.SmallSortedMap
            if (r1 != 0) goto Ld
            boolean r0 = super.equals(r9)
            return r0
        Ld:
            r1 = r9
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = (com.google.crypto.tink.shaded.protobuf.SmallSortedMap) r1
            int r2 = r8.size()
            int r3 = r1.size()
            r4 = 0
            if (r2 == r3) goto L1c
            return r4
        L1c:
            int r3 = r8.getNumArrayEntries()
            int r5 = r1.getNumArrayEntries()
            if (r3 == r5) goto L33
            java.util.Set r0 = r8.entrySet()
            java.util.Set r4 = r1.entrySet()
            boolean r0 = r0.equals(r4)
            return r0
        L33:
            r5 = 0
        L34:
            if (r5 >= r3) goto L48
            java.util.Map$Entry r6 = r8.getArrayEntryAt(r5)
            java.util.Map$Entry r7 = r1.getArrayEntryAt(r5)
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L45
            return r4
        L45:
            int r5 = r5 + 1
            goto L34
        L48:
            if (r3 == r2) goto L53
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r8.overflowEntries
            java.util.Map<K extends java.lang.Comparable<K>, V> r4 = r1.overflowEntries
            boolean r0 = r0.equals(r4)
            return r0
        L53:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            int r1 = r3.binarySearchInArray(r0)
            if (r1 < 0) goto L16
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r2 = r3.entryList
            java.lang.Object r2 = r2.get(r1)
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry r2 = (com.google.crypto.tink.shaded.protobuf.SmallSortedMap.Entry) r2
            java.lang.Object r2 = r2.getValue()
            return r2
        L16:
            java.util.Map<K extends java.lang.Comparable<K>, V> r2 = r3.overflowEntries
            java.lang.Object r2 = r2.get(r0)
            return r2
    }

    public java.util.Map.Entry<K, V> getArrayEntryAt(int r2) {
            r1 = this;
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r0 = r1.entryList
            java.lang.Object r0 = r0.get(r2)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    public int getNumArrayEntries() {
            r1 = this;
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r0 = r1.entryList
            int r0 = r0.size()
            return r0
    }

    public int getNumOverflowEntries() {
            r1 = this;
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            int r0 = r0.size()
            return r0
    }

    public java.lang.Iterable<java.util.Map.Entry<K, V>> getOverflowEntries() {
            r1 = this;
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.lang.Iterable r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.EmptySet.iterable()
            goto L13
        Ld:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            java.util.Set r0 = r0.entrySet()
        L13:
            return r0
    }

    java.lang.Iterable<java.util.Map.Entry<K, V>> getOverflowEntriesDescending() {
            r1 = this;
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntriesDescending
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.lang.Iterable r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.EmptySet.iterable()
            goto L13
        Ld:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntriesDescending
            java.util.Set r0 = r0.entrySet()
        L13:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
            r4 = this;
            r0 = 0
            int r1 = r4.getNumArrayEntries()
            r2 = 0
        L6:
            if (r2 >= r1) goto L18
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r3 = r4.entryList
            java.lang.Object r3 = r3.get(r2)
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry r3 = (com.google.crypto.tink.shaded.protobuf.SmallSortedMap.Entry) r3
            int r3 = r3.hashCode()
            int r0 = r0 + r3
            int r2 = r2 + 1
            goto L6
        L18:
            int r2 = r4.getNumOverflowEntries()
            if (r2 <= 0) goto L25
            java.util.Map<K extends java.lang.Comparable<K>, V> r2 = r4.overflowEntries
            int r2 = r2.hashCode()
            int r0 = r0 + r2
        L25:
            return r0
    }

    public boolean isImmutable() {
            r1 = this;
            boolean r0 = r1.isImmutable
            return r0
    }

    public void makeImmutable() {
            r1 = this;
            boolean r0 = r1.isImmutable
            if (r0 != 0) goto L33
        L5:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L12
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L18
        L12:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntries
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
        L18:
            r1.overflowEntries = r0
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntriesDescending
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L28
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L2e
        L28:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.overflowEntriesDescending
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
        L2e:
            r1.overflowEntriesDescending = r0
            r0 = 1
            r1.isImmutable = r0
        L33:
            return
    }

    public V put(K r7, V r8) {
            r6 = this;
            r6.checkMutable()
            int r0 = r6.binarySearchInArray(r7)
            if (r0 < 0) goto L16
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r1 = r6.entryList
            java.lang.Object r1 = r1.get(r0)
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry r1 = (com.google.crypto.tink.shaded.protobuf.SmallSortedMap.Entry) r1
            java.lang.Object r1 = r1.setValue(r8)
            return r1
        L16:
            r6.ensureEntryArrayMutable()
            int r1 = r0 + 1
            int r1 = -r1
            int r2 = r6.maxArraySize
            if (r1 < r2) goto L29
            java.util.SortedMap r2 = r6.getOverflowEntriesMutable()
            java.lang.Object r2 = r2.put(r7, r8)
            return r2
        L29:
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r2 = r6.entryList
            int r2 = r2.size()
            int r3 = r6.maxArraySize
            if (r2 != r3) goto L4e
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r2 = r6.entryList
            int r3 = r6.maxArraySize
            int r3 = r3 + (-1)
            java.lang.Object r2 = r2.remove(r3)
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry r2 = (com.google.crypto.tink.shaded.protobuf.SmallSortedMap.Entry) r2
            java.util.SortedMap r3 = r6.getOverflowEntriesMutable()
            java.lang.Comparable r4 = r2.getKey()
            java.lang.Object r5 = r2.getValue()
            r3.put(r4, r5)
        L4e:
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r2 = r6.entryList
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry r3 = new com.google.crypto.tink.shaded.protobuf.SmallSortedMap$Entry
            r3.<init>(r6, r7, r8)
            r2.add(r1, r3)
            r2 = 0
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Object r1 = r0.put(r1, r2)
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object r4) {
            r3 = this;
            r3.checkMutable()
            r0 = r4
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            int r1 = r3.binarySearchInArray(r0)
            if (r1 < 0) goto L11
            java.lang.Object r2 = r3.removeArrayEntryAt(r1)
            return r2
        L11:
            java.util.Map<K extends java.lang.Comparable<K>, V> r2 = r3.overflowEntries
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1b
            r2 = 0
            return r2
        L1b:
            java.util.Map<K extends java.lang.Comparable<K>, V> r2 = r3.overflowEntries
            java.lang.Object r2 = r2.remove(r0)
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
            r2 = this;
            java.util.List<com.google.crypto.tink.shaded.protobuf.SmallSortedMap<K, V>$Entry> r0 = r2.entryList
            int r0 = r0.size()
            java.util.Map<K extends java.lang.Comparable<K>, V> r1 = r2.overflowEntries
            int r1 = r1.size()
            int r0 = r0 + r1
            return r0
    }
}
