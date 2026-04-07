package com.google.gson.internal;

/* JADX INFO: loaded from: classes.dex */
public final class LinkedHashTreeMap<K, V> extends java.util.AbstractMap<K, V> implements java.io.Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.util.Comparator<java.lang.Comparable> NATURAL_ORDER = null;
    java.util.Comparator<? super K> comparator;
    private com.google.gson.internal.LinkedHashTreeMap<K, V>.EntrySet entrySet;
    final com.google.gson.internal.LinkedHashTreeMap.Node<K, V> header;
    private com.google.gson.internal.LinkedHashTreeMap<K, V>.KeySet keySet;
    int modCount;
    int size;
    com.google.gson.internal.LinkedHashTreeMap.Node<K, V>[] table;
    int threshold;


    static final class AvlBuilder<K, V> {
        private int leavesSkipped;
        private int leavesToSkip;
        private int size;
        private com.google.gson.internal.LinkedHashTreeMap.Node<K, V> stack;

        AvlBuilder() {
                r0 = this;
                r0.<init>()
                return
        }

        void add(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r7) {
                r6 = this;
                r0 = 0
                r7.right = r0
                r7.parent = r0
                r7.left = r0
                r0 = 1
                r7.height = r0
                int r1 = r6.leavesToSkip
                if (r1 <= 0) goto L22
                int r1 = r6.size
                r1 = r1 & r0
                if (r1 != 0) goto L22
                int r1 = r6.size
                int r1 = r1 + r0
                r6.size = r1
                int r1 = r6.leavesToSkip
                int r1 = r1 - r0
                r6.leavesToSkip = r1
                int r1 = r6.leavesSkipped
                int r1 = r1 + r0
                r6.leavesSkipped = r1
            L22:
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r6.stack
                r7.parent = r1
                r6.stack = r7
                int r1 = r6.size
                int r1 = r1 + r0
                r6.size = r1
                int r1 = r6.leavesToSkip
                if (r1 <= 0) goto L45
                int r1 = r6.size
                r1 = r1 & r0
                if (r1 != 0) goto L45
                int r1 = r6.size
                int r1 = r1 + r0
                r6.size = r1
                int r1 = r6.leavesToSkip
                int r1 = r1 - r0
                r6.leavesToSkip = r1
                int r1 = r6.leavesSkipped
                int r1 = r1 + r0
                r6.leavesSkipped = r1
            L45:
                r1 = 4
            L46:
                int r2 = r6.size
                int r3 = r1 + (-1)
                r2 = r2 & r3
                int r3 = r1 + (-1)
                if (r2 != r3) goto L90
                int r2 = r6.leavesSkipped
                if (r2 != 0) goto L6d
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r6.stack
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r3 = r2.parent
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r4 = r3.parent
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r5 = r4.parent
                r3.parent = r5
                r6.stack = r3
                r3.left = r4
                r3.right = r2
                int r5 = r2.height
                int r5 = r5 + r0
                r3.height = r5
                r4.parent = r3
                r2.parent = r3
                goto L8d
            L6d:
                int r2 = r6.leavesSkipped
                r3 = 0
                if (r2 != r0) goto L84
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r6.stack
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r4 = r2.parent
                r6.stack = r4
                r4.right = r2
                int r5 = r2.height
                int r5 = r5 + r0
                r4.height = r5
                r2.parent = r4
                r6.leavesSkipped = r3
                goto L8c
            L84:
                int r2 = r6.leavesSkipped
                r4 = 2
                if (r2 != r4) goto L8c
                r6.leavesSkipped = r3
                goto L8d
            L8c:
            L8d:
                int r1 = r1 * 2
                goto L46
            L90:
                return
        }

        void reset(int r3) {
                r2 = this;
                int r0 = java.lang.Integer.highestOneBit(r3)
                int r0 = r0 * 2
                int r0 = r0 + (-1)
                int r1 = r0 - r3
                r2.leavesToSkip = r1
                r1 = 0
                r2.size = r1
                r2.leavesSkipped = r1
                r1 = 0
                r2.stack = r1
                return
        }

        com.google.gson.internal.LinkedHashTreeMap.Node<K, V> root() {
                r2 = this;
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r2.stack
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.parent
                if (r1 != 0) goto L7
                return r0
            L7:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>()
                throw r1
        }
    }

    static class AvlIterator<K, V> {
        private com.google.gson.internal.LinkedHashTreeMap.Node<K, V> stackTop;

        AvlIterator() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.gson.internal.LinkedHashTreeMap.Node<K, V> next() {
                r3 = this;
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r3.stackTop
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                r2 = r0
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r2.parent
                r2.parent = r1
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r2.right
            Ld:
                if (r1 == 0) goto L15
                r1.parent = r0
                r0 = r1
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r1.left
                goto Ld
            L15:
                r3.stackTop = r0
                return r2
        }

        void reset(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r3) {
                r2 = this;
                r0 = 0
                r1 = r3
            L2:
                if (r1 == 0) goto La
                r1.parent = r0
                r0 = r1
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r1.left
                goto L2
            La:
                r2.stackTop = r0
                return
        }
    }

    final class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        final /* synthetic */ com.google.gson.internal.LinkedHashTreeMap this$0;


        EntrySet(com.google.gson.internal.LinkedHashTreeMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.util.Map.Entry
                if (r0 == 0) goto L11
                com.google.gson.internal.LinkedHashTreeMap r0 = r2.this$0
                r1 = r3
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                com.google.gson.internal.LinkedHashTreeMap$Node r0 = r0.findByEntry(r1)
                if (r0 == 0) goto L11
                r0 = 1
                goto L12
            L11:
                r0 = 0
            L12:
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap$EntrySet$1 r0 = new com.google.gson.internal.LinkedHashTreeMap$EntrySet$1
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.google.gson.internal.LinkedHashTreeMap r0 = r3.this$0
                r2 = r4
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                com.google.gson.internal.LinkedHashTreeMap$Node r0 = r0.findByEntry(r2)
                if (r0 != 0) goto L12
                return r1
            L12:
                com.google.gson.internal.LinkedHashTreeMap r1 = r3.this$0
                r2 = 1
                r1.removeInternal(r0, r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap r0 = r1.this$0
                int r0 = r0.size
                return r0
        }
    }

    final class KeySet extends java.util.AbstractSet<K> {
        final /* synthetic */ com.google.gson.internal.LinkedHashTreeMap this$0;


        KeySet(com.google.gson.internal.LinkedHashTreeMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap r0 = r1.this$0
                boolean r0 = r0.containsKey(r2)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap$KeySet$1 r0 = new com.google.gson.internal.LinkedHashTreeMap$KeySet$1
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap r0 = r1.this$0
                com.google.gson.internal.LinkedHashTreeMap$Node r0 = r0.removeInternalByKey(r2)
                if (r0 == 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap r0 = r1.this$0
                int r0 = r0.size
                return r0
        }
    }

    private abstract class LinkedTreeMapIterator<T> implements java.util.Iterator<T> {
        int expectedModCount;
        com.google.gson.internal.LinkedHashTreeMap.Node<K, V> lastReturned;
        com.google.gson.internal.LinkedHashTreeMap.Node<K, V> next;
        final /* synthetic */ com.google.gson.internal.LinkedHashTreeMap this$0;

        LinkedTreeMapIterator(com.google.gson.internal.LinkedHashTreeMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                com.google.gson.internal.LinkedHashTreeMap r1 = r0.this$0
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r1.header
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r1.next
                r0.next = r1
                r1 = 0
                r0.lastReturned = r1
                com.google.gson.internal.LinkedHashTreeMap r1 = r0.this$0
                int r1 = r1.modCount
                r0.expectedModCount = r1
                return
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r2 = this;
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r2.next
                com.google.gson.internal.LinkedHashTreeMap r1 = r2.this$0
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r1.header
                if (r0 == r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        final com.google.gson.internal.LinkedHashTreeMap.Node<K, V> nextNode() {
                r3 = this;
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r3.next
                com.google.gson.internal.LinkedHashTreeMap r1 = r3.this$0
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r1.header
                if (r0 == r1) goto L1d
                com.google.gson.internal.LinkedHashTreeMap r1 = r3.this$0
                int r1 = r1.modCount
                int r2 = r3.expectedModCount
                if (r1 != r2) goto L17
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.next
                r3.next = r1
                r3.lastReturned = r0
                return r0
            L17:
                java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
                r1.<init>()
                throw r1
            L1d:
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Iterator
        public final void remove() {
                r3 = this;
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r3.lastReturned
                if (r0 == 0) goto L16
                com.google.gson.internal.LinkedHashTreeMap r0 = r3.this$0
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r3.lastReturned
                r2 = 1
                r0.removeInternal(r1, r2)
                r0 = 0
                r3.lastReturned = r0
                com.google.gson.internal.LinkedHashTreeMap r0 = r3.this$0
                int r0 = r0.modCount
                r3.expectedModCount = r0
                return
            L16:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }
    }

    static final class Node<K, V> implements java.util.Map.Entry<K, V> {
        final int hash;
        int height;
        final K key;
        com.google.gson.internal.LinkedHashTreeMap.Node<K, V> left;
        com.google.gson.internal.LinkedHashTreeMap.Node<K, V> next;
        com.google.gson.internal.LinkedHashTreeMap.Node<K, V> parent;
        com.google.gson.internal.LinkedHashTreeMap.Node<K, V> prev;
        com.google.gson.internal.LinkedHashTreeMap.Node<K, V> right;
        V value;

        Node() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.key = r0
                r0 = -1
                r1.hash = r0
                r1.prev = r1
                r1.next = r1
                return
        }

        Node(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r2, K r3, int r4, com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r5, com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r6) {
                r1 = this;
                r1.<init>()
                r1.parent = r2
                r1.key = r3
                r1.hash = r4
                r0 = 1
                r1.height = r0
                r1.next = r5
                r1.prev = r6
                r6.next = r1
                r5.prev = r1
                return
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L3a
                r0 = r5
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                K r2 = r4.key
                if (r2 != 0) goto L13
                java.lang.Object r2 = r0.getKey()
                if (r2 != 0) goto L38
                goto L1f
            L13:
                K r2 = r4.key
                java.lang.Object r3 = r0.getKey()
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L38
            L1f:
                V r2 = r4.value
                if (r2 != 0) goto L2a
                java.lang.Object r2 = r0.getValue()
                if (r2 != 0) goto L38
                goto L36
            L2a:
                V r2 = r4.value
                java.lang.Object r3 = r0.getValue()
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L38
            L36:
                r1 = 1
                goto L39
            L38:
            L39:
                return r1
            L3a:
                return r1
        }

        public com.google.gson.internal.LinkedHashTreeMap.Node<K, V> first() {
                r2 = this;
                r0 = r2
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.left
            L3:
                if (r1 == 0) goto L9
                r0 = r1
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.left
                goto L3
            L9:
                return r0
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r1 = this;
                K r0 = r1.key
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
                K r0 = r3.key
                r1 = 0
                if (r0 != 0) goto L7
                r0 = r1
                goto Ld
            L7:
                K r0 = r3.key
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

        public com.google.gson.internal.LinkedHashTreeMap.Node<K, V> last() {
                r2 = this;
                r0 = r2
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.right
            L3:
                if (r1 == 0) goto L9
                r0 = r1
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.right
                goto L3
            L9:
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r2) {
                r1 = this;
                V r0 = r1.value
                r1.value = r2
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                K r1 = r2.key
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "="
                java.lang.StringBuilder r0 = r0.append(r1)
                V r1 = r2.value
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            com.google.gson.internal.LinkedHashTreeMap$1 r0 = new com.google.gson.internal.LinkedHashTreeMap$1
            r0.<init>()
            com.google.gson.internal.LinkedHashTreeMap.NATURAL_ORDER = r0
            return
    }

    public LinkedHashTreeMap() {
            r1 = this;
            java.util.Comparator<java.lang.Comparable> r0 = com.google.gson.internal.LinkedHashTreeMap.NATURAL_ORDER
            r1.<init>(r0)
            return
    }

    public LinkedHashTreeMap(java.util.Comparator<? super K> r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.size = r0
            r2.modCount = r0
            if (r3 == 0) goto Lc
            r0 = r3
            goto Le
        Lc:
            java.util.Comparator<java.lang.Comparable> r0 = com.google.gson.internal.LinkedHashTreeMap.NATURAL_ORDER
        Le:
            r2.comparator = r0
            com.google.gson.internal.LinkedHashTreeMap$Node r0 = new com.google.gson.internal.LinkedHashTreeMap$Node
            r0.<init>()
            r2.header = r0
            r0 = 16
            com.google.gson.internal.LinkedHashTreeMap$Node[] r0 = new com.google.gson.internal.LinkedHashTreeMap.Node[r0]
            r2.table = r0
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V>[] r0 = r2.table
            int r0 = r0.length
            int r0 = r0 / 2
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V>[] r1 = r2.table
            int r1 = r1.length
            int r1 = r1 / 4
            int r0 = r0 + r1
            r2.threshold = r0
            return
    }

    private void doubleCapacity() {
            r2 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V>[] r0 = r2.table
            com.google.gson.internal.LinkedHashTreeMap$Node[] r0 = doubleCapacity(r0)
            r2.table = r0
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V>[] r0 = r2.table
            int r0 = r0.length
            int r0 = r0 / 2
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V>[] r1 = r2.table
            int r1 = r1.length
            int r1 = r1 / 4
            int r0 = r0 + r1
            r2.threshold = r0
            return
    }

    static <K, V> com.google.gson.internal.LinkedHashTreeMap.Node<K, V>[] doubleCapacity(com.google.gson.internal.LinkedHashTreeMap.Node<K, V>[] r11) {
            int r0 = r11.length
            int r1 = r0 * 2
            com.google.gson.internal.LinkedHashTreeMap$Node[] r1 = new com.google.gson.internal.LinkedHashTreeMap.Node[r1]
            com.google.gson.internal.LinkedHashTreeMap$AvlIterator r2 = new com.google.gson.internal.LinkedHashTreeMap$AvlIterator
            r2.<init>()
            com.google.gson.internal.LinkedHashTreeMap$AvlBuilder r3 = new com.google.gson.internal.LinkedHashTreeMap$AvlBuilder
            r3.<init>()
            com.google.gson.internal.LinkedHashTreeMap$AvlBuilder r4 = new com.google.gson.internal.LinkedHashTreeMap$AvlBuilder
            r4.<init>()
            r5 = 0
        L15:
            if (r5 >= r0) goto L68
            r6 = r11[r5]
            if (r6 != 0) goto L1c
            goto L65
        L1c:
            r2.reset(r6)
            r7 = 0
            r8 = 0
        L21:
            com.google.gson.internal.LinkedHashTreeMap$Node r9 = r2.next()
            r10 = r9
            if (r9 == 0) goto L33
            int r9 = r10.hash
            r9 = r9 & r0
            if (r9 != 0) goto L30
            int r7 = r7 + 1
            goto L21
        L30:
            int r8 = r8 + 1
            goto L21
        L33:
            r3.reset(r7)
            r4.reset(r8)
            r2.reset(r6)
        L3c:
            com.google.gson.internal.LinkedHashTreeMap$Node r9 = r2.next()
            r10 = r9
            if (r9 == 0) goto L50
            int r9 = r10.hash
            r9 = r9 & r0
            if (r9 != 0) goto L4c
            r3.add(r10)
            goto L3c
        L4c:
            r4.add(r10)
            goto L3c
        L50:
            r9 = 0
            if (r7 <= 0) goto L58
            com.google.gson.internal.LinkedHashTreeMap$Node r10 = r3.root()
            goto L59
        L58:
            r10 = r9
        L59:
            r1[r5] = r10
            int r10 = r5 + r0
            if (r8 <= 0) goto L63
            com.google.gson.internal.LinkedHashTreeMap$Node r9 = r4.root()
        L63:
            r1[r10] = r9
        L65:
            int r5 = r5 + 1
            goto L15
        L68:
            return r1
    }

    private boolean equal(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            if (r2 == r3) goto Ld
            if (r2 == 0) goto Lb
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    private void readObject(java.io.ObjectInputStream r3) throws java.io.IOException {
            r2 = this;
            java.io.InvalidObjectException r0 = new java.io.InvalidObjectException
            java.lang.String r1 = "Deserialization is unsupported"
            r0.<init>(r1)
            throw r0
    }

    private void rebalance(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r14, boolean r15) {
            r13 = this;
            r0 = r14
        L1:
            if (r0 == 0) goto L9a
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r0.right
            r3 = 0
            if (r1 == 0) goto Ld
            int r4 = r1.height
            goto Le
        Ld:
            r4 = r3
        Le:
            if (r2 == 0) goto L13
            int r5 = r2.height
            goto L14
        L13:
            r5 = r3
        L14:
            int r6 = r4 - r5
            r7 = -2
            r8 = -1
            r9 = 1
            if (r6 != r7) goto L48
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r7 = r2.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r10 = r2.right
            if (r10 == 0) goto L24
            int r11 = r10.height
            goto L25
        L24:
            r11 = r3
        L25:
            if (r7 == 0) goto L29
            int r3 = r7.height
        L29:
            int r12 = r3 - r11
            if (r12 == r8) goto L41
            if (r12 != 0) goto L32
            if (r15 != 0) goto L32
            goto L41
        L32:
            if (r12 != r9) goto L3b
            r13.rotateRight(r2)
            r13.rotateLeft(r0)
            goto L44
        L3b:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L41:
            r13.rotateLeft(r0)
        L44:
            if (r15 == 0) goto L47
            goto L9a
        L47:
            goto L96
        L48:
            r7 = 2
            if (r6 != r7) goto L78
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r7 = r1.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r10 = r1.right
            if (r10 == 0) goto L54
            int r11 = r10.height
            goto L55
        L54:
            r11 = r3
        L55:
            if (r7 == 0) goto L59
            int r3 = r7.height
        L59:
            int r12 = r3 - r11
            if (r12 == r9) goto L71
            if (r12 != 0) goto L62
            if (r15 != 0) goto L62
            goto L71
        L62:
            if (r12 != r8) goto L6b
            r13.rotateLeft(r1)
            r13.rotateRight(r0)
            goto L74
        L6b:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L71:
            r13.rotateRight(r0)
        L74:
            if (r15 == 0) goto L77
            goto L9a
        L77:
            goto L96
        L78:
            if (r6 != 0) goto L81
            int r3 = r4 + 1
            r0.height = r3
            if (r15 == 0) goto L96
            goto L9a
        L81:
            if (r6 == r8) goto L8c
            if (r6 != r9) goto L86
            goto L8c
        L86:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L8c:
            int r3 = java.lang.Math.max(r4, r5)
            int r3 = r3 + r9
            r0.height = r3
            if (r15 != 0) goto L96
            goto L9a
        L96:
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r0.parent
            goto L1
        L9a:
            return
    }

    private void replaceInParent(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r4, com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r5) {
            r3 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r4.parent
            r1 = 0
            r4.parent = r1
            if (r5 == 0) goto L9
            r5.parent = r0
        L9:
            if (r0 == 0) goto L1f
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.left
            if (r1 != r4) goto L12
            r0.left = r5
            goto L2b
        L12:
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.right
            if (r1 != r4) goto L19
            r0.right = r5
            goto L2b
        L19:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L1f:
            int r1 = r4.hash
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V>[] r2 = r3.table
            int r2 = r2.length
            int r2 = r2 + (-1)
            r1 = r1 & r2
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V>[] r2 = r3.table
            r2[r1] = r5
        L2b:
            return
    }

    private void rotateLeft(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r8) {
            r7 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r8.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r8.right
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r1.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r3 = r1.right
            r8.right = r2
            if (r2 == 0) goto Le
            r2.parent = r8
        Le:
            r7.replaceInParent(r8, r1)
            r1.left = r8
            r8.parent = r1
            r4 = 0
            if (r0 == 0) goto L1b
            int r5 = r0.height
            goto L1c
        L1b:
            r5 = r4
        L1c:
            if (r2 == 0) goto L21
            int r6 = r2.height
            goto L22
        L21:
            r6 = r4
        L22:
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = r5 + 1
            r8.height = r5
            int r5 = r8.height
            if (r3 == 0) goto L30
            int r4 = r3.height
        L30:
            int r4 = java.lang.Math.max(r5, r4)
            int r4 = r4 + 1
            r1.height = r4
            return
    }

    private void rotateRight(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r8) {
            r7 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r8.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r8.right
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r0.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r3 = r0.right
            r8.left = r3
            if (r3 == 0) goto Le
            r3.parent = r8
        Le:
            r7.replaceInParent(r8, r0)
            r0.right = r8
            r8.parent = r0
            r4 = 0
            if (r1 == 0) goto L1b
            int r5 = r1.height
            goto L1c
        L1b:
            r5 = r4
        L1c:
            if (r3 == 0) goto L21
            int r6 = r3.height
            goto L22
        L21:
            r6 = r4
        L22:
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = r5 + 1
            r8.height = r5
            int r5 = r8.height
            if (r2 == 0) goto L30
            int r4 = r2.height
        L30:
            int r4 = java.lang.Math.max(r5, r4)
            int r4 = r4 + 1
            r0.height = r4
            return
    }

    private static int secondaryHash(int r2) {
            int r0 = r2 >>> 20
            int r1 = r2 >>> 12
            r0 = r0 ^ r1
            r2 = r2 ^ r0
            int r0 = r2 >>> 7
            r0 = r0 ^ r2
            int r1 = r2 >>> 4
            r0 = r0 ^ r1
            return r0
    }

    private java.lang.Object writeReplace() throws java.io.ObjectStreamException {
            r1 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r4 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V>[] r0 = r4.table
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            r0 = 0
            r4.size = r0
            int r0 = r4.modCount
            int r0 = r0 + 1
            r4.modCount = r0
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r4.header
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r0.next
        L13:
            if (r2 == r0) goto L1d
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r3 = r2.next
            r2.prev = r1
            r2.next = r1
            r2 = r3
            goto L13
        L1d:
            r0.prev = r0
            r0.next = r0
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node r0 = r1.findByObject(r2)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r2 = this;
            com.google.gson.internal.LinkedHashTreeMap<K, V>$EntrySet r0 = r2.entrySet
            if (r0 == 0) goto L6
            r1 = r0
            goto Ld
        L6:
            com.google.gson.internal.LinkedHashTreeMap$EntrySet r1 = new com.google.gson.internal.LinkedHashTreeMap$EntrySet
            r1.<init>(r2)
            r2.entrySet = r1
        Ld:
            return r1
    }

    com.google.gson.internal.LinkedHashTreeMap.Node<K, V> find(K r12, boolean r13) {
            r11 = this;
            java.util.Comparator<? super K> r0 = r11.comparator
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V>[] r1 = r11.table
            int r2 = r12.hashCode()
            int r6 = secondaryHash(r2)
            int r2 = r1.length
            r9 = 1
            int r2 = r2 - r9
            r2 = r2 & r6
            r3 = r1[r2]
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L41
            java.util.Comparator<java.lang.Comparable> r7 = com.google.gson.internal.LinkedHashTreeMap.NATURAL_ORDER
            if (r0 != r7) goto L1e
            r7 = r12
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            goto L1f
        L1e:
            r7 = r5
        L1f:
        L20:
            if (r7 == 0) goto L29
            K r8 = r3.key
            int r8 = r7.compareTo(r8)
            goto L2f
        L29:
            K r8 = r3.key
            int r8 = r0.compare(r12, r8)
        L2f:
            r4 = r8
            if (r4 != 0) goto L33
            return r3
        L33:
            if (r4 >= 0) goto L38
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r8 = r3.left
            goto L3a
        L38:
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r8 = r3.right
        L3a:
            if (r8 != 0) goto L3f
            r10 = r4
            r4 = r3
            goto L43
        L3f:
            r3 = r8
            goto L20
        L41:
            r10 = r4
            r4 = r3
        L43:
            if (r13 != 0) goto L46
            return r5
        L46:
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r7 = r11.header
            if (r4 != 0) goto L7f
            java.util.Comparator<java.lang.Comparable> r3 = com.google.gson.internal.LinkedHashTreeMap.NATURAL_ORDER
            if (r0 != r3) goto L74
            boolean r3 = r12 instanceof java.lang.Comparable
            if (r3 == 0) goto L53
            goto L74
        L53:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.Class r8 = r12.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r8 = " is not Comparable"
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r5 = r5.toString()
            r3.<init>(r5)
            throw r3
        L74:
            com.google.gson.internal.LinkedHashTreeMap$Node r3 = new com.google.gson.internal.LinkedHashTreeMap$Node
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r8 = r7.prev
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r1[r2] = r3
            goto L91
        L7f:
            r5 = r12
            com.google.gson.internal.LinkedHashTreeMap$Node r3 = new com.google.gson.internal.LinkedHashTreeMap$Node
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r8 = r7.prev
            r3.<init>(r4, r5, r6, r7, r8)
            if (r10 >= 0) goto L8c
            r4.left = r3
            goto L8e
        L8c:
            r4.right = r3
        L8e:
            r11.rebalance(r4, r9)
        L91:
            int r12 = r11.size
            int r8 = r12 + 1
            r11.size = r8
            int r8 = r11.threshold
            if (r12 <= r8) goto L9e
            r11.doubleCapacity()
        L9e:
            int r12 = r11.modCount
            int r12 = r12 + r9
            r11.modCount = r12
            return r3
    }

    com.google.gson.internal.LinkedHashTreeMap.Node<K, V> findByEntry(java.util.Map.Entry<?, ?> r4) {
            r3 = this;
            java.lang.Object r0 = r4.getKey()
            com.google.gson.internal.LinkedHashTreeMap$Node r0 = r3.findByObject(r0)
            if (r0 == 0) goto L18
            V r1 = r0.value
            java.lang.Object r2 = r4.getValue()
            boolean r1 = r3.equal(r1, r2)
            if (r1 == 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            if (r1 == 0) goto L1d
            r2 = r0
            goto L1e
        L1d:
            r2 = 0
        L1e:
            return r2
    }

    com.google.gson.internal.LinkedHashTreeMap.Node<K, V> findByObject(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto Lb
            r1 = 0
            com.google.gson.internal.LinkedHashTreeMap$Node r0 = r2.find(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto Lb
        L9:
            r1 = move-exception
            return r0
        Lb:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object r3) {
            r2 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node r0 = r2.findByObject(r3)
            if (r0 == 0) goto L9
            V r1 = r0.value
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<K> keySet() {
            r2 = this;
            com.google.gson.internal.LinkedHashTreeMap<K, V>$KeySet r0 = r2.keySet
            if (r0 == 0) goto L6
            r1 = r0
            goto Ld
        L6:
            com.google.gson.internal.LinkedHashTreeMap$KeySet r1 = new com.google.gson.internal.LinkedHashTreeMap$KeySet
            r1.<init>(r2)
            r2.keySet = r1
        Ld:
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K r3, V r4) {
            r2 = this;
            if (r3 == 0) goto Lc
            r0 = 1
            com.google.gson.internal.LinkedHashTreeMap$Node r0 = r2.find(r3, r0)
            V r1 = r0.value
            r0.value = r4
            return r1
        Lc:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "key == null"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object r3) {
            r2 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node r0 = r2.removeInternalByKey(r3)
            if (r0 == 0) goto L9
            V r1 = r0.value
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    void removeInternal(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r8, boolean r9) {
            r7 = this;
            r0 = 0
            if (r9 == 0) goto L13
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r8.prev
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r8.next
            r1.next = r2
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r8.next
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r8.prev
            r1.prev = r2
            r8.prev = r0
            r8.next = r0
        L13:
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r8.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r8.right
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r3 = r8.parent
            r4 = 0
            if (r1 == 0) goto L56
            if (r2 == 0) goto L56
            int r5 = r1.height
            int r6 = r2.height
            if (r5 <= r6) goto L29
            com.google.gson.internal.LinkedHashTreeMap$Node r5 = r1.last()
            goto L2d
        L29:
            com.google.gson.internal.LinkedHashTreeMap$Node r5 = r2.first()
        L2d:
            r7.removeInternal(r5, r4)
            r4 = 0
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r8.left
            if (r1 == 0) goto L3d
            int r4 = r1.height
            r5.left = r1
            r1.parent = r5
            r8.left = r0
        L3d:
            r6 = 0
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r8.right
            if (r2 == 0) goto L4a
            int r6 = r2.height
            r5.right = r2
            r2.parent = r5
            r8.right = r0
        L4a:
            int r0 = java.lang.Math.max(r4, r6)
            int r0 = r0 + 1
            r5.height = r0
            r7.replaceInParent(r8, r5)
            return
        L56:
            if (r1 == 0) goto L5e
            r7.replaceInParent(r8, r1)
            r8.left = r0
            goto L69
        L5e:
            if (r2 == 0) goto L66
            r7.replaceInParent(r8, r2)
            r8.right = r0
            goto L69
        L66:
            r7.replaceInParent(r8, r0)
        L69:
            r7.rebalance(r3, r4)
            int r0 = r7.size
            int r0 = r0 + (-1)
            r7.size = r0
            int r0 = r7.modCount
            int r0 = r0 + 1
            r7.modCount = r0
            return
    }

    com.google.gson.internal.LinkedHashTreeMap.Node<K, V> removeInternalByKey(java.lang.Object r3) {
            r2 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node r0 = r2.findByObject(r3)
            if (r0 == 0) goto La
            r1 = 1
            r2.removeInternal(r0, r1)
        La:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}
