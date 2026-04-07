package kotlin.collections;

/* JADX INFO: compiled from: AbstractMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b'\u0018\u0000 )*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003:\u0001)B\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0013\u001a\u00020\u00142\u0010\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0016H\u0000¢\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\u0018\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\rH\u0016J#\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0014H\u0016J\b\u0010&\u001a\u00020'H\u0016J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u001fH\u0002J\u001c\u0010&\u001a\u00020'2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016H\bR\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\bX\u0088\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006*"}, d2 = {"Lkotlin/collections/AbstractMap;", "K", "V", "", "()V", "_keys", "", "_values", "", "keys", "getKeys", "()Ljava/util/Set;", "size", "", "getSize", "()I", "values", "getValues", "()Ljava/util/Collection;", "containsEntry", "", "entry", "", "containsEntry$kotlin_stdlib", "containsKey", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "equals", "other", "", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "implFindEntry", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", "isEmpty", "toString", "", "o", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractMap<K, V> implements java.util.Map<K, V>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final kotlin.collections.AbstractMap.Companion Companion = null;
    private volatile java.util.Set<? extends K> _keys;
    private volatile java.util.Collection<? extends V> _values;

    /* JADX INFO: compiled from: AbstractMap.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0002\b\bJ\u001d\u0010\t\u001a\u00020\n2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0002\b\u000bJ\u001d\u0010\f\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/collections/AbstractMap$Companion;", "", "()V", "entryEquals", "", "e", "", "other", "entryEquals$kotlin_stdlib", "entryHashCode", "", "entryHashCode$kotlin_stdlib", "entryToString", "", "entryToString$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final boolean entryEquals$kotlin_stdlib(java.util.Map.Entry<?, ?> r4, java.lang.Object r5) {
                r3 = this;
                java.lang.String r0 = "e"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                boolean r0 = r5 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto Lb
                return r1
            Lb:
                java.lang.Object r0 = r4.getKey()
                r2 = r5
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r2 = r2.getKey()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r0 == 0) goto L2e
                java.lang.Object r0 = r4.getValue()
                r2 = r5
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r2 = r2.getValue()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r0 == 0) goto L2e
                r1 = 1
            L2e:
                return r1
        }

        public final int entryHashCode$kotlin_stdlib(java.util.Map.Entry<?, ?> r6) {
                r5 = this;
                java.lang.String r0 = "e"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                r0 = r6
                r1 = 0
                java.lang.Object r2 = r0.getKey()
                r3 = 0
                if (r2 == 0) goto L13
                int r2 = r2.hashCode()
                goto L14
            L13:
                r2 = r3
            L14:
                java.lang.Object r4 = r0.getValue()
                if (r4 == 0) goto L1e
                int r3 = r4.hashCode()
            L1e:
                r0 = r2 ^ r3
                return r0
        }

        public final java.lang.String entryToString$kotlin_stdlib(java.util.Map.Entry<?, ?> r5) {
                r4 = this;
                java.lang.String r0 = "e"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = r5
                r1 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.Object r3 = r0.getKey()
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = 61
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.Object r3 = r0.getValue()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r0 = r2.toString()
                return r0
        }
    }



    static {
            kotlin.collections.AbstractMap$Companion r0 = new kotlin.collections.AbstractMap$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.AbstractMap.Companion = r0
            return
    }

    protected AbstractMap() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ java.lang.String access$toString(kotlin.collections.AbstractMap r1, java.util.Map.Entry r2) {
            java.lang.String r0 = r1.toString(r2)
            return r0
    }

    private final java.util.Map.Entry<K, V> implFindEntry(K r8) {
            r7 = this;
            java.util.Set r0 = r7.entrySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L24
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = 0
            java.lang.Object r6 = r4.getKey()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r8)
            if (r4 == 0) goto Lb
            goto L25
        L24:
            r3 = 0
        L25:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            return r3
    }

    private final java.lang.String toString(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L5
            java.lang.String r0 = "(this Map)"
            goto L9
        L5:
            java.lang.String r0 = java.lang.String.valueOf(r2)
        L9:
            return r0
    }

    private final java.lang.String toString(java.util.Map.Entry<? extends K, ? extends V> r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r3.getKey()
            java.lang.String r1 = r2.toString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 61
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r3.getValue()
            java.lang.String r1 = r2.toString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.util.Map
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    public final boolean containsEntry$kotlin_stdlib(java.util.Map.Entry<?, ?> r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.Object r1 = r7.getKey()
            java.lang.Object r2 = r7.getValue()
            r3 = r6
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            java.lang.Object r3 = r3.get(r1)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r4 != 0) goto L1f
            return r0
        L1f:
            if (r3 != 0) goto L30
            r4 = r6
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r5)
            boolean r4 = r4.containsKey(r1)
            if (r4 != 0) goto L30
            return r0
        L30:
            r0 = 1
            return r0
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.util.Map$Entry r0 = r1.implFindEntry(r2)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r9) {
            r8 = this;
            java.util.Set r0 = r8.entrySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L16
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L16
            goto L35
        L16:
            java.util.Iterator r2 = r0.iterator()
        L1a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L34
            java.lang.Object r4 = r2.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            r6 = 0
            java.lang.Object r7 = r5.getValue()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r9)
            if (r5 == 0) goto L1a
            r3 = 1
            goto L35
        L34:
        L35:
            return r3
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set r0 = r1.getEntries()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r9 != r8) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof java.util.Map
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r8.size()
            r3 = r9
            java.util.Map r3 = (java.util.Map) r3
            int r3 = r3.size()
            if (r1 == r3) goto L18
            return r2
        L18:
            r1 = r9
            java.util.Map r1 = (java.util.Map) r1
            java.util.Set r1 = r1.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r3 = 0
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L30
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L30
            goto L4b
        L30:
            java.util.Iterator r4 = r1.iterator()
        L34:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4a
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            r7 = 0
            boolean r6 = r8.containsEntry$kotlin_stdlib(r6)
            if (r6 != 0) goto L34
            r0 = r2
            goto L4b
        L4a:
        L4b:
            return r0
    }

    @Override // java.util.Map
    public V get(java.lang.Object r2) {
            r1 = this;
            java.util.Map$Entry r0 = r1.implFindEntry(r2)
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.getValue()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public abstract java.util.Set getEntries();

    public java.util.Set<K> getKeys() {
            r1 = this;
            java.util.Set<? extends K> r0 = r1._keys
            if (r0 != 0) goto Ld
            kotlin.collections.AbstractMap$keys$1 r0 = new kotlin.collections.AbstractMap$keys$1
            r0.<init>(r1)
            java.util.Set r0 = (java.util.Set) r0
            r1._keys = r0
        Ld:
            java.util.Set<? extends K> r0 = r1._keys
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
    }

    public int getSize() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            int r0 = r0.size()
            return r0
    }

    public java.util.Collection<V> getValues() {
            r1 = this;
            java.util.Collection<? extends V> r0 = r1._values
            if (r0 != 0) goto Ld
            kotlin.collections.AbstractMap$values$1 r0 = new kotlin.collections.AbstractMap$values$1
            r0.<init>(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r1._values = r0
        Ld:
            java.util.Collection<? extends V> r0 = r1._values
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
    }

    @Override // java.util.Map
    public int hashCode() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set r0 = r1.getKeys()
            return r0
    }

    @Override // java.util.Map
    public V put(K r3, V r4) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public V remove(java.lang.Object r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    public java.lang.String toString() {
            r10 = this;
            java.util.Set r0 = r10.entrySet()
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.String r0 = ", "
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r0 = "{"
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r0 = "}"
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            kotlin.collections.AbstractMap$toString$1 r0 = new kotlin.collections.AbstractMap$toString$1
            r0.<init>(r10)
            r7 = r0
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r8 = 24
            r9 = 0
            r5 = 0
            r6 = 0
            java.lang.String r0 = kotlin.collections.CollectionsKt.joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection r0 = r1.getValues()
            return r0
    }
}
