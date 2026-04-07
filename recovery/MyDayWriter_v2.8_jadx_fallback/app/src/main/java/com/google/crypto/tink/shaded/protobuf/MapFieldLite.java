package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class MapFieldLite<K, V> extends java.util.LinkedHashMap<K, V> {
    private static final com.google.crypto.tink.shaded.protobuf.MapFieldLite<?, ?> EMPTY_MAP_FIELD = null;
    private boolean isMutable;

    static {
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = new com.google.crypto.tink.shaded.protobuf.MapFieldLite
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.MapFieldLite.EMPTY_MAP_FIELD = r0
            com.google.crypto.tink.shaded.protobuf.MapFieldLite<?, ?> r0 = com.google.crypto.tink.shaded.protobuf.MapFieldLite.EMPTY_MAP_FIELD
            r0.makeImmutable()
            return
    }

    private MapFieldLite() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.isMutable = r0
            return
    }

    private MapFieldLite(java.util.Map<K, V> r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 1
            r1.isMutable = r0
            return
    }

    static <K, V> int calculateHashCodeForMap(java.util.Map<K, V> r5) {
            r0 = 0
            java.util.Set r1 = r5.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            int r3 = calculateHashCodeForObject(r3)
            java.lang.Object r4 = r2.getValue()
            int r4 = calculateHashCodeForObject(r4)
            r3 = r3 ^ r4
            int r0 = r0 + r3
            goto L9
        L29:
            return r0
    }

    private static int calculateHashCodeForObject(java.lang.Object r1) {
            boolean r0 = r1 instanceof byte[]
            if (r0 == 0) goto Lc
            r0 = r1
            byte[] r0 = (byte[]) r0
            int r0 = com.google.crypto.tink.shaded.protobuf.Internal.hashCode(r0)
            return r0
        Lc:
            boolean r0 = r1 instanceof com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
            if (r0 != 0) goto L15
            int r0 = r1.hashCode()
            return r0
        L15:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    private static void checkForNullKeysAndValues(java.util.Map<?, ?> r3) {
            java.util.Set r0 = r3.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r1)
            java.lang.Object r2 = r3.get(r1)
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r2)
            goto L8
        L1d:
            return
    }

    private static java.lang.Object copy(java.lang.Object r2) {
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto Ld
            r0 = r2
            byte[] r0 = (byte[]) r0
            int r1 = r0.length
            byte[] r1 = java.util.Arrays.copyOf(r0, r1)
            return r1
        Ld:
            return r2
    }

    static <K, V> java.util.Map<K, V> copy(java.util.Map<K, V> r5) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r1 = r5.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r4 = r2.getValue()
            java.lang.Object r4 = copy(r4)
            r0.put(r3, r4)
            goto Ld
        L29:
            return r0
    }

    public static <K, V> com.google.crypto.tink.shaded.protobuf.MapFieldLite<K, V> emptyMapField() {
            com.google.crypto.tink.shaded.protobuf.MapFieldLite<?, ?> r0 = com.google.crypto.tink.shaded.protobuf.MapFieldLite.EMPTY_MAP_FIELD
            return r0
    }

    private void ensureMutable() {
            r1 = this;
            boolean r0 = r1.isMutable()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    private static boolean equals(java.lang.Object r2, java.lang.Object r3) {
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L13
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L13
            r0 = r2
            byte[] r0 = (byte[]) r0
            r1 = r3
            byte[] r1 = (byte[]) r1
            boolean r0 = java.util.Arrays.equals(r0, r1)
            return r0
        L13:
            boolean r0 = r2.equals(r3)
            return r0
    }

    static <K, V> boolean equals(java.util.Map<K, V> r6, java.util.Map<K, V> r7) {
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            int r1 = r6.size()
            int r2 = r7.size()
            r3 = 0
            if (r1 == r2) goto L10
            return r3
        L10:
            java.util.Set r1 = r6.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L2f
            return r3
        L2f:
            java.lang.Object r4 = r2.getValue()
            java.lang.Object r5 = r2.getKey()
            java.lang.Object r5 = r7.get(r5)
            boolean r4 = equals(r4, r5)
            if (r4 != 0) goto L42
            return r3
        L42:
            goto L18
        L43:
            return r0
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
            r0 = this;
            r0.ensureMutable()
            super.clear()
            return
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            java.util.Set r0 = java.util.Collections.emptySet()
            goto Lf
        Lb:
            java.util.Set r0 = super.entrySet()
        Lf:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto Lf
            r0 = r2
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = equals(r1, r0)
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
            r1 = this;
            int r0 = calculateHashCodeForMap(r1)
            return r0
    }

    public boolean isMutable() {
            r1 = this;
            boolean r0 = r1.isMutable
            return r0
    }

    public void makeImmutable() {
            r1 = this;
            r0 = 0
            r1.isMutable = r0
            return
    }

    public void mergeFrom(com.google.crypto.tink.shaded.protobuf.MapFieldLite<K, V> r2) {
            r1 = this;
            r1.ensureMutable()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lc
            r1.putAll(r2)
        Lc:
            return
    }

    public com.google.crypto.tink.shaded.protobuf.MapFieldLite<K, V> mutableCopy() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lc
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = new com.google.crypto.tink.shaded.protobuf.MapFieldLite
            r0.<init>()
            goto L11
        Lc:
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = new com.google.crypto.tink.shaded.protobuf.MapFieldLite
            r0.<init>(r1)
        L11:
            return r0
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K r2, V r3) {
            r1 = this;
            r1.ensureMutable()
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r2)
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r3)
            java.lang.Object r0 = super.put(r2, r3)
            return r0
    }

    public V put(java.util.Map.Entry<K, V> r3) {
            r2 = this;
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r1 = r3.getValue()
            java.lang.Object r0 = r2.put(r0, r1)
            return r0
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r1) {
            r0 = this;
            r0.ensureMutable()
            checkForNullKeysAndValues(r1)
            super.putAll(r1)
            return
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object r2) {
            r1 = this;
            r1.ensureMutable()
            java.lang.Object r0 = super.remove(r2)
            return r0
    }
}
