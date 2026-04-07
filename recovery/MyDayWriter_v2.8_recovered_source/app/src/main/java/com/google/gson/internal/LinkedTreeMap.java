package com.google.gson.internal;

/* JADX INFO: loaded from: classes.dex */
public final class LinkedTreeMap<K, V> extends java.util.AbstractMap<K, V> implements java.io.Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.util.Comparator<java.lang.Comparable> NATURAL_ORDER = null;
    java.util.Comparator<? super K> comparator;
    private com.google.gson.internal.LinkedTreeMap<K, V>.EntrySet entrySet;
    final com.google.gson.internal.LinkedTreeMap.Node<K, V> header;
    private com.google.gson.internal.LinkedTreeMap<K, V>.KeySet keySet;
    int modCount;
    com.google.gson.internal.LinkedTreeMap.Node<K, V> root;
    int size;


    class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        final /* synthetic */ com.google.gson.internal.LinkedTreeMap this$0;


        EntrySet(com.google.gson.internal.LinkedTreeMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.gson.internal.LinkedTreeMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.util.Map.Entry
                if (r0 == 0) goto L11
                com.google.gson.internal.LinkedTreeMap r0 = r2.this$0
                r1 = r3
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                com.google.gson.internal.LinkedTreeMap$Node r0 = r0.findByEntry(r1)
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
                com.google.gson.internal.LinkedTreeMap$EntrySet$1 r0 = new com.google.gson.internal.LinkedTreeMap$EntrySet$1
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
                com.google.gson.internal.LinkedTreeMap r0 = r3.this$0
                r2 = r4
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                com.google.gson.internal.LinkedTreeMap$Node r0 = r0.findByEntry(r2)
                if (r0 != 0) goto L12
                return r1
            L12:
                com.google.gson.internal.LinkedTreeMap r1 = r3.this$0
                r2 = 1
                r1.removeInternal(r0, r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.gson.internal.LinkedTreeMap r0 = r1.this$0
                int r0 = r0.size
                return r0
        }
    }

    final class KeySet extends java.util.AbstractSet<K> {
        final /* synthetic */ com.google.gson.internal.LinkedTreeMap this$0;


        KeySet(com.google.gson.internal.LinkedTreeMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.gson.internal.LinkedTreeMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                com.google.gson.internal.LinkedTreeMap r0 = r1.this$0
                boolean r0 = r0.containsKey(r2)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
                r1 = this;
                com.google.gson.internal.LinkedTreeMap$KeySet$1 r0 = new com.google.gson.internal.LinkedTreeMap$KeySet$1
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                com.google.gson.internal.LinkedTreeMap r0 = r1.this$0
                com.google.gson.internal.LinkedTreeMap$Node r0 = r0.removeInternalByKey(r2)
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
                com.google.gson.internal.LinkedTreeMap r0 = r1.this$0
                int r0 = r0.size
                return r0
        }
    }

    private abstract class LinkedTreeMapIterator<T> implements java.util.Iterator<T> {
        int expectedModCount;
        com.google.gson.internal.LinkedTreeMap.Node<K, V> lastReturned;
        com.google.gson.internal.LinkedTreeMap.Node<K, V> next;
        final /* synthetic */ com.google.gson.internal.LinkedTreeMap this$0;

        LinkedTreeMapIterator(com.google.gson.internal.LinkedTreeMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                com.google.gson.internal.LinkedTreeMap r1 = r0.this$0
                com.google.gson.internal.LinkedTreeMap$Node<K, V> r1 = r1.header
                com.google.gson.internal.LinkedTreeMap$Node<K, V> r1 = r1.next
                r0.next = r1
                r1 = 0
                r0.lastReturned = r1
                com.google.gson.internal.LinkedTreeMap r1 = r0.this$0
                int r1 = r1.modCount
                r0.expectedModCount = r1
                return
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r2 = this;
                com.google.gson.internal.LinkedTreeMap$Node<K, V> r0 = r2.next
                com.google.gson.internal.LinkedTreeMap r1 = r2.this$0
                com.google.gson.internal.LinkedTreeMap$Node<K, V> r1 = r1.header
                if (r0 == r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        final com.google.gson.internal.LinkedTreeMap.Node<K, V> nextNode() {
                r3 = this;
                com.google.gson.internal.LinkedTreeMap$Node<K, V> r0 = r3.next
                com.google.gson.internal.LinkedTreeMap r1 = r3.this$0
                com.google.gson.internal.LinkedTreeMap$Node<K, V> r1 = r1.header
                if (r0 == r1) goto L1d
                com.google.gson.internal.LinkedTreeMap r1 = r3.this$0
                int r1 = r1.modCount
                int r2 = r3.expectedModCount
                if (r1 != r2) goto L17
                com.google.gson.internal.LinkedTreeMap$Node<K, V> r1 = r0.next
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
                com.google.gson.internal.LinkedTreeMap$Node<K, V> r0 = r3.lastReturned
                if (r0 == 0) goto L16
                com.google.gson.internal.LinkedTreeMap r0 = r3.this$0
                com.google.gson.internal.LinkedTreeMap$Node<K, V> r1 = r3.lastReturned
                r2 = 1
                r0.removeInternal(r1, r2)
                r0 = 0
                r3.lastReturned = r0
                com.google.gson.internal.LinkedTreeMap r0 = r3.this$0
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
        int height;
        final K key;
        com.google.gson.internal.LinkedTreeMap.Node<K, V> left;
        com.google.gson.internal.LinkedTreeMap.Node<K, V> next;
        com.google.gson.internal.LinkedTreeMap.Node<K, V> parent;
        com.google.gson.internal.LinkedTreeMap.Node<K, V> prev;
        com.google.gson.internal.LinkedTreeMap.Node<K, V> right;
        V value;

        Node() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.key = r0
                r1.prev = r1
                r1.next = r1
                return
        }

        Node(com.google.gson.internal.LinkedTreeMap.Node<K, V> r2, K r3, com.google.gson.internal.LinkedTreeMap.Node<K, V> r4, com.google.gson.internal.LinkedTreeMap.Node<K, V> r5) {
                r1 = this;
                r1.<init>()
                r1.parent = r2
                r1.key = r3
                r0 = 1
                r1.height = r0
                r1.next = r4
                r1.prev = r5
                r5.next = r1
                r4.prev = r1
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

        public com.google.gson.internal.LinkedTreeMap.Node<K, V> first() {
                r2 = this;
                r0 = r2
                com.google.gson.internal.LinkedTreeMap$Node<K, V> r1 = r0.left
            L3:
                if (r1 == 0) goto L9
                r0 = r1
                com.google.gson.internal.LinkedTreeMap$Node<K, V> r1 = r0.left
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

        public com.google.gson.internal.LinkedTreeMap.Node<K, V> last() {
                r2 = this;
                r0 = r2
                com.google.gson.internal.LinkedTreeMap$Node<K, V> r1 = r0.right
            L3:
                if (r1 == 0) goto L9
                r0 = r1
                com.google.gson.internal.LinkedTreeMap$Node<K, V> r1 = r0.right
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
            com.google.gson.internal.LinkedTreeMap$1 r0 = new com.google.gson.internal.LinkedTreeMap$1
            r0.<init>()
            com.google.gson.internal.LinkedTreeMap.NATURAL_ORDER = r0
            return
    }

    public LinkedTreeMap() {
            r1 = this;
            java.util.Comparator<java.lang.Comparable> r0 = com.google.gson.internal.LinkedTreeMap.NATURAL_ORDER
            r1.<init>(r0)
            return
    }

    public LinkedTreeMap(java.util.Comparator<? super K> r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.size = r0
            r1.modCount = r0
            com.google.gson.internal.LinkedTreeMap$Node r0 = new com.google.gson.internal.LinkedTreeMap$Node
            r0.<init>()
            r1.header = r0
            if (r2 == 0) goto L13
            r0 = r2
            goto L15
        L13:
            java.util.Comparator<java.lang.Comparable> r0 = com.google.gson.internal.LinkedTreeMap.NATURAL_ORDER
        L15:
            r1.comparator = r0
            return
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

    private void rebalance(com.google.gson.internal.LinkedTreeMap.Node<K, V> r14, boolean r15) {
            r13 = this;
            r0 = r14
        L1:
            if (r0 == 0) goto L9a
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r1 = r0.left
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r2 = r0.right
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
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r7 = r2.left
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r10 = r2.right
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
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r7 = r1.left
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r10 = r1.right
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
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r0 = r0.parent
            goto L1
        L9a:
            return
    }

    private void replaceInParent(com.google.gson.internal.LinkedTreeMap.Node<K, V> r3, com.google.gson.internal.LinkedTreeMap.Node<K, V> r4) {
            r2 = this;
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r0 = r3.parent
            r1 = 0
            r3.parent = r1
            if (r4 == 0) goto L9
            r4.parent = r0
        L9:
            if (r0 == 0) goto L1f
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r1 = r0.left
            if (r1 != r3) goto L12
            r0.left = r4
            goto L21
        L12:
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r1 = r0.right
            if (r1 != r3) goto L19
            r0.right = r4
            goto L21
        L19:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L1f:
            r2.root = r4
        L21:
            return
    }

    private void rotateLeft(com.google.gson.internal.LinkedTreeMap.Node<K, V> r8) {
            r7 = this;
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r0 = r8.left
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r1 = r8.right
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r2 = r1.left
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r3 = r1.right
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

    private void rotateRight(com.google.gson.internal.LinkedTreeMap.Node<K, V> r8) {
            r7 = this;
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r0 = r8.left
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r1 = r8.right
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r2 = r0.left
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r3 = r0.right
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

    private java.lang.Object writeReplace() throws java.io.ObjectStreamException {
            r1 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r1 = this;
            r0 = 0
            r1.root = r0
            r0 = 0
            r1.size = r0
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r0 = r1.header
            r0.prev = r0
            r0.next = r0
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            com.google.gson.internal.LinkedTreeMap$Node r0 = r1.findByObject(r2)
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
            com.google.gson.internal.LinkedTreeMap<K, V>$EntrySet r0 = r2.entrySet
            if (r0 == 0) goto L6
            r1 = r0
            goto Ld
        L6:
            com.google.gson.internal.LinkedTreeMap$EntrySet r1 = new com.google.gson.internal.LinkedTreeMap$EntrySet
            r1.<init>(r2)
            r2.entrySet = r1
        Ld:
            return r1
    }

    com.google.gson.internal.LinkedTreeMap.Node<K, V> find(K r8, boolean r9) {
            r7 = this;
            java.util.Comparator<? super K> r0 = r7.comparator
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r1 = r7.root
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L31
            java.util.Comparator<java.lang.Comparable> r4 = com.google.gson.internal.LinkedTreeMap.NATURAL_ORDER
            if (r0 != r4) goto L10
            r4 = r8
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            goto L11
        L10:
            r4 = r3
        L11:
        L12:
            if (r4 == 0) goto L1b
            K r5 = r1.key
            int r5 = r4.compareTo(r5)
            goto L21
        L1b:
            K r5 = r1.key
            int r5 = r0.compare(r8, r5)
        L21:
            r2 = r5
            if (r2 != 0) goto L25
            return r1
        L25:
            if (r2 >= 0) goto L2a
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r5 = r1.left
            goto L2c
        L2a:
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r5 = r1.right
        L2c:
            if (r5 != 0) goto L2f
            goto L31
        L2f:
            r1 = r5
            goto L12
        L31:
            if (r9 != 0) goto L34
            return r3
        L34:
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r3 = r7.header
            r4 = 1
            if (r1 != 0) goto L6d
            java.util.Comparator<java.lang.Comparable> r5 = com.google.gson.internal.LinkedTreeMap.NATURAL_ORDER
            if (r0 != r5) goto L63
            boolean r5 = r8 instanceof java.lang.Comparable
            if (r5 == 0) goto L42
            goto L63
        L42:
            java.lang.ClassCastException r4 = new java.lang.ClassCastException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.Class r6 = r8.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " is not Comparable"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L63:
            com.google.gson.internal.LinkedTreeMap$Node r5 = new com.google.gson.internal.LinkedTreeMap$Node
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r6 = r3.prev
            r5.<init>(r1, r8, r3, r6)
            r7.root = r5
            goto L7e
        L6d:
            com.google.gson.internal.LinkedTreeMap$Node r5 = new com.google.gson.internal.LinkedTreeMap$Node
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r6 = r3.prev
            r5.<init>(r1, r8, r3, r6)
            if (r2 >= 0) goto L79
            r1.left = r5
            goto L7b
        L79:
            r1.right = r5
        L7b:
            r7.rebalance(r1, r4)
        L7e:
            int r6 = r7.size
            int r6 = r6 + r4
            r7.size = r6
            int r6 = r7.modCount
            int r6 = r6 + r4
            r7.modCount = r6
            return r5
    }

    com.google.gson.internal.LinkedTreeMap.Node<K, V> findByEntry(java.util.Map.Entry<?, ?> r4) {
            r3 = this;
            java.lang.Object r0 = r4.getKey()
            com.google.gson.internal.LinkedTreeMap$Node r0 = r3.findByObject(r0)
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

    com.google.gson.internal.LinkedTreeMap.Node<K, V> findByObject(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto Lb
            r1 = 0
            com.google.gson.internal.LinkedTreeMap$Node r0 = r2.find(r3, r1)     // Catch: java.lang.ClassCastException -> L9
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
            com.google.gson.internal.LinkedTreeMap$Node r0 = r2.findByObject(r3)
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
            com.google.gson.internal.LinkedTreeMap<K, V>$KeySet r0 = r2.keySet
            if (r0 == 0) goto L6
            r1 = r0
            goto Ld
        L6:
            com.google.gson.internal.LinkedTreeMap$KeySet r1 = new com.google.gson.internal.LinkedTreeMap$KeySet
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
            com.google.gson.internal.LinkedTreeMap$Node r0 = r2.find(r3, r0)
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
            com.google.gson.internal.LinkedTreeMap$Node r0 = r2.removeInternalByKey(r3)
            if (r0 == 0) goto L9
            V r1 = r0.value
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    void removeInternal(com.google.gson.internal.LinkedTreeMap.Node<K, V> r8, boolean r9) {
            r7 = this;
            if (r9 == 0) goto Le
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r0 = r8.prev
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r1 = r8.next
            r0.next = r1
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r0 = r8.next
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r1 = r8.prev
            r0.prev = r1
        Le:
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r0 = r8.left
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r1 = r8.right
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r2 = r8.parent
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L52
            if (r1 == 0) goto L52
            int r5 = r0.height
            int r6 = r1.height
            if (r5 <= r6) goto L25
            com.google.gson.internal.LinkedTreeMap$Node r5 = r0.last()
            goto L29
        L25:
            com.google.gson.internal.LinkedTreeMap$Node r5 = r1.first()
        L29:
            r7.removeInternal(r5, r3)
            r3 = 0
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r0 = r8.left
            if (r0 == 0) goto L39
            int r3 = r0.height
            r5.left = r0
            r0.parent = r5
            r8.left = r4
        L39:
            r6 = 0
            com.google.gson.internal.LinkedTreeMap$Node<K, V> r1 = r8.right
            if (r1 == 0) goto L46
            int r6 = r1.height
            r5.right = r1
            r1.parent = r5
            r8.right = r4
        L46:
            int r4 = java.lang.Math.max(r3, r6)
            int r4 = r4 + 1
            r5.height = r4
            r7.replaceInParent(r8, r5)
            return
        L52:
            if (r0 == 0) goto L5a
            r7.replaceInParent(r8, r0)
            r8.left = r4
            goto L65
        L5a:
            if (r1 == 0) goto L62
            r7.replaceInParent(r8, r1)
            r8.right = r4
            goto L65
        L62:
            r7.replaceInParent(r8, r4)
        L65:
            r7.rebalance(r2, r3)
            int r3 = r7.size
            int r3 = r3 + (-1)
            r7.size = r3
            int r3 = r7.modCount
            int r3 = r3 + 1
            r7.modCount = r3
            return
    }

    com.google.gson.internal.LinkedTreeMap.Node<K, V> removeInternalByKey(java.lang.Object r3) {
            r2 = this;
            com.google.gson.internal.LinkedTreeMap$Node r0 = r2.findByObject(r3)
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
