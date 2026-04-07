package androidx.collection;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001KB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J&\u0010\u0016\u001a\u00020\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000J\u0006\u0010\u001a\u001a\u00020\u0017J&\u0010\u001a\u001a\u00020\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000J\r\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001dJ\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fJ\u0016\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00172\u0006\u0010!\u001a\u00028\u0000¢\u0006\u0002\u0010\"J\u0013\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00028\u0001¢\u0006\u0002\u0010\"J\u0006\u0010&\u001a\u00020\u0006J&\u0010&\u001a\u00020\u00062\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000J\u0013\u0010'\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010!\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b*\u0010+JD\u0010,\u001a\u00020-26\u0010.\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(!\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020-0\u0019H\u0086\bø\u0001\u0000J/\u00101\u001a\u00020-2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020-02H\u0081\bø\u0001\u0000J/\u00104\u001a\u00020-2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020-02H\u0086\bø\u0001\u0000J/\u00105\u001a\u00020-2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020-02H\u0086\bø\u0001\u0000J\u0018\u00106\u001a\u0004\u0018\u00018\u00012\u0006\u0010!\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u00107J\u001b\u00108\u001a\u00028\u00012\u0006\u0010!\u001a\u00028\u00002\u0006\u00109\u001a\u00028\u0001¢\u0006\u0002\u0010:J'\u0010;\u001a\u00028\u00012\u0006\u0010!\u001a\u00028\u00002\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00010<H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020\u0006H\u0016J\u0006\u0010?\u001a\u00020\u0017J\u0006\u0010@\u001a\u00020\u0017Jv\u0010A\u001a\u00020\u001c2\b\b\u0002\u0010B\u001a\u00020C2\b\b\u0002\u0010D\u001a\u00020C2\b\b\u0002\u0010E\u001a\u00020C2\b\b\u0002\u0010F\u001a\u00020\u00062\b\b\u0002\u0010G\u001a\u00020C2:\b\u0002\u0010H\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(!\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020C\u0018\u00010\u0019H\u0007J\u0006\u0010I\u001a\u00020\u0017J\b\u0010J\u001a\u00020\u001cH\u0016R\u0012\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\f8\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\u000e\u0012\u0004\b\r\u0010\u0004R\u0018\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0004R\u0011\u0010\u0012\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\nR\"\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\f8\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\u000e\u0012\u0004\b\u0015\u0010\u0004\u0082\u0001\u0001L\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006M"}, d2 = {"Landroidx/collection/ScatterMap;", "K", "V", "", "()V", "_capacity", "", "_size", "capacity", "getCapacity", "()I", "keys", "", "getKeys$annotations", "[Ljava/lang/Object;", "metadata", "", "getMetadata$annotations", "size", "getSize", "values", "getValues$annotations", "all", "", "predicate", "Lkotlin/Function2;", "any", "asDebugString", "", "asDebugString$collection", "asMap", "", "contains", "key", "(Ljava/lang/Object;)Z", "containsKey", "containsValue", "value", "count", "equals", "other", "findKeyIndex", "findKeyIndex$collection", "(Ljava/lang/Object;)I", "forEach", "", "block", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function1;", "index", "forEachKey", "forEachValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrDefault", "defaultValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "MapWrapper", "Landroidx/collection/MutableScatterMap;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ScatterMap<K, V> {
    public int _capacity;
    public int _size;
    public java.lang.Object[] keys;
    public long[] metadata;
    public java.lang.Object[] values;

    /* JADX INFO: compiled from: ScatterMap.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0090\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0013H\u0016R&\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Landroidx/collection/ScatterMap$MapWrapper;", "", "(Landroidx/collection/ScatterMap;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public class MapWrapper implements java.util.Map<K, V>, kotlin.jvm.internal.markers.KMappedMarker {
        final /* synthetic */ androidx.collection.ScatterMap<K, V> this$0;

        public MapWrapper(androidx.collection.ScatterMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Map
        public void clear() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Map
        public V compute(K r3, java.util.function.BiFunction<? super K, ? super V, ? extends V> r4) {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Map
        public V computeIfAbsent(K r3, java.util.function.Function<? super K, ? extends V> r4) {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Map
        public V computeIfPresent(K r3, java.util.function.BiFunction<? super K, ? super V, ? extends V> r4) {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Map
        public boolean containsKey(java.lang.Object r2) {
                r1 = this;
                androidx.collection.ScatterMap<K, V> r0 = r1.this$0
                boolean r0 = r0.containsKey(r2)
                return r0
        }

        @Override // java.util.Map
        public boolean containsValue(java.lang.Object r2) {
                r1 = this;
                androidx.collection.ScatterMap<K, V> r0 = r1.this$0
                boolean r0 = r0.containsValue(r2)
                return r0
        }

        @Override // java.util.Map
        public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
                r1 = this;
                java.util.Set r0 = r1.getEntries()
                return r0
        }

        @Override // java.util.Map
        public V get(java.lang.Object r2) {
                r1 = this;
                androidx.collection.ScatterMap<K, V> r0 = r1.this$0
                java.lang.Object r0 = r0.get(r2)
                return r0
        }

        public java.util.Set<java.util.Map.Entry<K, V>> getEntries() {
                r2 = this;
                androidx.collection.ScatterMap$MapWrapper$entries$1 r0 = new androidx.collection.ScatterMap$MapWrapper$entries$1
                androidx.collection.ScatterMap<K, V> r1 = r2.this$0
                r0.<init>(r1)
                java.util.Set r0 = (java.util.Set) r0
                return r0
        }

        public java.util.Set<K> getKeys() {
                r2 = this;
                androidx.collection.ScatterMap$MapWrapper$keys$1 r0 = new androidx.collection.ScatterMap$MapWrapper$keys$1
                androidx.collection.ScatterMap<K, V> r1 = r2.this$0
                r0.<init>(r1)
                java.util.Set r0 = (java.util.Set) r0
                return r0
        }

        public int getSize() {
                r1 = this;
                androidx.collection.ScatterMap<K, V> r0 = r1.this$0
                int r0 = r0._size
                return r0
        }

        public java.util.Collection<V> getValues() {
                r2 = this;
                androidx.collection.ScatterMap$MapWrapper$values$1 r0 = new androidx.collection.ScatterMap$MapWrapper$values$1
                androidx.collection.ScatterMap<K, V> r1 = r2.this$0
                r0.<init>(r1)
                java.util.Collection r0 = (java.util.Collection) r0
                return r0
        }

        @Override // java.util.Map
        public boolean isEmpty() {
                r1 = this;
                androidx.collection.ScatterMap<K, V> r0 = r1.this$0
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.Map
        public final /* bridge */ java.util.Set<K> keySet() {
                r1 = this;
                java.util.Set r0 = r1.getKeys()
                return r0
        }

        @Override // java.util.Map
        public V merge(K r3, V r4, java.util.function.BiFunction<? super V, ? super V, ? extends V> r5) {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
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
        public V putIfAbsent(K r3, V r4) {
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
        public boolean remove(java.lang.Object r3, java.lang.Object r4) {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Map
        public V replace(K r3, V r4) {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Map
        public boolean replace(K r3, V r4, V r5) {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Map
        public void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V> r3) {
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

        @Override // java.util.Map
        public final /* bridge */ java.util.Collection<V> values() {
                r1 = this;
                java.util.Collection r0 = r1.getValues()
                return r0
        }
    }

    private ScatterMap() {
            r1 = this;
            r1.<init>()
            long[] r0 = androidx.collection.ScatterMapKt.EmptyGroup
            r1.metadata = r0
            java.lang.Object[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS
            r1.keys = r0
            java.lang.Object[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS
            r1.values = r0
            return
    }

    public /* synthetic */ ScatterMap(kotlin.jvm.internal.DefaultConstructorMarker r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void getKeys$annotations() {
            return
    }

    public static /* synthetic */ void getMetadata$annotations() {
            return
    }

    public static /* synthetic */ void getValues$annotations() {
            return
    }

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.ScatterMap r1, java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, int r5, java.lang.CharSequence r6, kotlin.jvm.functions.Function2 r7, int r8, java.lang.Object r9) {
            if (r9 != 0) goto L3a
            r9 = r8 & 1
            if (r9 == 0) goto La
            java.lang.String r2 = ", "
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
        La:
            r9 = r8 & 2
            java.lang.String r0 = ""
            if (r9 == 0) goto L13
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
        L13:
            r9 = r8 & 4
            if (r9 == 0) goto L1a
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
        L1a:
            r9 = r8 & 8
            if (r9 == 0) goto L1f
            r5 = -1
        L1f:
            r9 = r8 & 16
            if (r9 == 0) goto L27
            java.lang.String r6 = "..."
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
        L27:
            r8 = r8 & 32
            if (r8 == 0) goto L2e
            r7 = 0
            r9 = r7
            goto L2f
        L2e:
            r9 = r7
        L2f:
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            java.lang.String r1 = r3.joinToString(r4, r5, r6, r7, r8, r9)
            return r1
        L3a:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: joinToString"
            r1.<init>(r2)
            throw r1
    }

    public final boolean all(kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Boolean> r26) {
            r25 = this;
            r0 = r26
            java.lang.String r1 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = r25
            r3 = 0
            java.lang.Object[] r4 = r2.keys
            java.lang.Object[] r5 = r2.values
            r6 = r2
            r7 = 0
            long[] r8 = r6.metadata
            int r9 = r8.length
            int r9 = r9 + (-2)
            r10 = 0
            if (r10 > r9) goto L92
        L19:
            r12 = r8[r10]
            r14 = r12
            r16 = 0
            r18 = r12
            r17 = 1
            long r11 = ~r14
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r14
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r20
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 == 0) goto L89
            int r11 = r10 - r9
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L3b:
            if (r13 >= r11) goto L80
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r18 & r14
            r16 = 0
            r20 = 128(0x80, double:6.3E-322)
            int r20 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            r21 = 0
            if (r20 >= 0) goto L4e
            r14 = r17
            goto L50
        L4e:
            r14 = r21
        L50:
            if (r14 == 0) goto L73
            int r14 = r10 << 3
            int r14 = r14 + r13
            r15 = r14
            r16 = 0
            r20 = r12
            r12 = r4[r15]
            r22 = r1
            r1 = r5[r15]
            r23 = 0
            java.lang.Object r24 = r0.invoke(r12, r1)
            java.lang.Boolean r24 = (java.lang.Boolean) r24
            boolean r24 = r24.booleanValue()
            if (r24 != 0) goto L6f
            return r21
        L6f:
            goto L77
        L73:
            r22 = r1
            r20 = r12
        L77:
            long r18 = r18 >> r20
            int r13 = r13 + 1
            r12 = r20
            r1 = r22
            goto L3b
        L80:
            r22 = r1
            r20 = r12
            r1 = r20
            if (r11 != r1) goto L97
            goto L8b
        L89:
            r22 = r1
        L8b:
            if (r10 == r9) goto L96
            int r10 = r10 + 1
            r1 = r22
            goto L19
        L92:
            r22 = r1
            r17 = 1
        L96:
        L97:
            return r17
    }

    public final boolean any() {
            r1 = this;
            int r0 = r1._size
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final boolean any(kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Boolean> r26) {
            r25 = this;
            r0 = r26
            java.lang.String r1 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = r25
            r3 = 0
            java.lang.Object[] r4 = r2.keys
            java.lang.Object[] r5 = r2.values
            r6 = r2
            r7 = 0
            long[] r8 = r6.metadata
            int r9 = r8.length
            int r9 = r9 + (-2)
            r10 = 0
            if (r10 > r9) goto L92
        L19:
            r12 = r8[r10]
            r14 = r12
            r16 = 0
            r18 = r12
            r17 = 0
            long r11 = ~r14
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r14
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r20
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 == 0) goto L89
            int r11 = r10 - r9
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L3b:
            if (r13 >= r11) goto L80
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r18 & r14
            r16 = 0
            r20 = 128(0x80, double:6.3E-322)
            int r20 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            r21 = 1
            if (r20 >= 0) goto L4e
            r14 = r21
            goto L50
        L4e:
            r14 = r17
        L50:
            if (r14 == 0) goto L73
            int r14 = r10 << 3
            int r14 = r14 + r13
            r15 = r14
            r16 = 0
            r20 = r12
            r12 = r4[r15]
            r22 = r1
            r1 = r5[r15]
            r23 = 0
            java.lang.Object r24 = r0.invoke(r12, r1)
            java.lang.Boolean r24 = (java.lang.Boolean) r24
            boolean r24 = r24.booleanValue()
            if (r24 == 0) goto L6f
            return r21
        L6f:
            goto L77
        L73:
            r22 = r1
            r20 = r12
        L77:
            long r18 = r18 >> r20
            int r13 = r13 + 1
            r12 = r20
            r1 = r22
            goto L3b
        L80:
            r22 = r1
            r20 = r12
            r1 = r20
            if (r11 != r1) goto L97
            goto L8b
        L89:
            r22 = r1
        L8b:
            if (r10 == r9) goto L96
            int r10 = r10 + 1
            r1 = r22
            goto L19
        L92:
            r22 = r1
            r17 = 0
        L96:
        L97:
            return r17
    }

    public final java.lang.String asDebugString$collection() {
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            r3 = 123(0x7b, float:1.72E-43)
            r1.append(r3)
            java.lang.String r3 = "metadata=["
            r1.append(r3)
            r3 = 0
            int r4 = r12.getCapacity()
        L16:
            java.lang.String r5 = ", "
            if (r3 >= r4) goto L4c
            long[] r6 = r12.metadata
            r7 = 0
            int r8 = r3 >> 3
            r8 = r6[r8]
            r10 = r3 & 7
            int r10 = r10 << 3
            long r8 = r8 >> r10
            r10 = 255(0xff, double:1.26E-321)
            long r6 = r8 & r10
            r8 = 128(0x80, double:6.3E-322)
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 != 0) goto L37
            java.lang.String r8 = "Empty"
            r1.append(r8)
            goto L46
        L37:
            r8 = 254(0xfe, double:1.255E-321)
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 != 0) goto L43
            java.lang.String r8 = "Deleted"
            r1.append(r8)
            goto L46
        L43:
            r1.append(r6)
        L46:
            r1.append(r5)
            int r3 = r3 + 1
            goto L16
        L4c:
            java.lang.String r3 = "], "
            r1.append(r3)
            java.lang.String r4 = "keys=["
            r1.append(r4)
            r4 = 0
            java.lang.Object[] r6 = r12.keys
            int r6 = r6.length
        L5a:
            if (r4 >= r6) goto L69
            java.lang.Object[] r7 = r12.keys
            r7 = r7[r4]
            r1.append(r7)
            r1.append(r5)
            int r4 = r4 + 1
            goto L5a
        L69:
            r1.append(r3)
            java.lang.String r3 = "values=["
            r1.append(r3)
            r3 = 0
            java.lang.Object[] r4 = r12.values
            int r4 = r4.length
        L75:
            if (r3 >= r4) goto L84
            java.lang.Object[] r6 = r12.values
            r6 = r6[r3]
            r1.append(r6)
            r1.append(r5)
            int r3 = r3 + 1
            goto L75
        L84:
            java.lang.String r3 = "]"
            r1.append(r3)
            r3 = 125(0x7d, float:1.75E-43)
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final java.util.Map<K, V> asMap() {
            r1 = this;
            androidx.collection.ScatterMap$MapWrapper r0 = new androidx.collection.ScatterMap$MapWrapper
            r0.<init>(r1)
            java.util.Map r0 = (java.util.Map) r0
            return r0
    }

    public final boolean contains(K r25) {
            r24 = this;
            r0 = r25
            r1 = r24
            r2 = 0
            r3 = 0
            if (r0 == 0) goto Ld
            int r5 = r0.hashCode()
            goto Le
        Ld:
            r5 = 0
        Le:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r3 = r5 ^ r6
            r5 = 0
            r5 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r1._capacity
            r7 = 0
            int r7 = r3 >>> 7
            r7 = r7 & r6
            r8 = 0
        L22:
            long[] r9 = r1.metadata
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
            r18 = r5
            long r4 = (long) r12
            long r4 = -r4
            r19 = 63
            long r4 = r4 >> r19
            long r4 = r4 & r15
            long r4 = r4 | r13
            r9 = r4
            r11 = 0
            r12 = r18
            long r13 = (long) r12
            r15 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r13 = r13 * r15
            long r13 = r13 ^ r9
            long r15 = r13 - r15
            r18 = r2
            r19 = r3
            long r2 = ~r13
            long r2 = r2 & r15
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r15
        L5d:
            r9 = r2
            r11 = 0
            r13 = 0
            int r20 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            r21 = 1
            if (r20 == 0) goto L6a
            r9 = r21
            goto L6b
        L6a:
            r9 = 0
        L6b:
            if (r9 == 0) goto L91
            r9 = r2
            r11 = 0
            r13 = r9
            r20 = 0
            int r22 = java.lang.Long.numberOfTrailingZeros(r13)
            int r13 = r22 >> 3
            int r13 = r13 + r7
            r9 = r13 & r6
            java.lang.Object[] r10 = r1.keys
            r10 = r10[r9]
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r0)
            if (r10 == 0) goto L87
            goto La3
        L87:
            r10 = r2
            r13 = 0
            r20 = 1
            long r20 = r10 - r20
            long r10 = r10 & r20
            r2 = r10
            goto L5d
        L91:
            r9 = r4
            r11 = 0
            r22 = r13
            long r13 = ~r9
            r20 = 6
            long r13 = r13 << r20
            long r13 = r13 & r9
            long r9 = r13 & r15
            int r9 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r9 == 0) goto Laa
        La2:
            r9 = -1
        La3:
            if (r9 < 0) goto La8
            r4 = r21
            goto La9
        La8:
            r4 = 0
        La9:
            return r4
        Laa:
            int r8 = r8 + 8
            int r9 = r7 + r8
            r7 = r9 & r6
            r5 = r12
            r2 = r18
            r3 = r19
            goto L22
    }

    public final boolean containsKey(K r25) {
            r24 = this;
            r0 = r25
            r1 = r24
            r2 = 0
            r3 = 0
            if (r0 == 0) goto Ld
            int r5 = r0.hashCode()
            goto Le
        Ld:
            r5 = 0
        Le:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r3 = r5 ^ r6
            r5 = 0
            r5 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r1._capacity
            r7 = 0
            int r7 = r3 >>> 7
            r7 = r7 & r6
            r8 = 0
        L22:
            long[] r9 = r1.metadata
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
            r18 = r5
            long r4 = (long) r12
            long r4 = -r4
            r19 = 63
            long r4 = r4 >> r19
            long r4 = r4 & r15
            long r4 = r4 | r13
            r9 = r4
            r11 = 0
            r12 = r18
            long r13 = (long) r12
            r15 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r13 = r13 * r15
            long r13 = r13 ^ r9
            long r15 = r13 - r15
            r18 = r2
            r19 = r3
            long r2 = ~r13
            long r2 = r2 & r15
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r15
        L5d:
            r9 = r2
            r11 = 0
            r13 = 0
            int r20 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            r21 = 1
            if (r20 == 0) goto L6a
            r9 = r21
            goto L6b
        L6a:
            r9 = 0
        L6b:
            if (r9 == 0) goto L91
            r9 = r2
            r11 = 0
            r13 = r9
            r20 = 0
            int r22 = java.lang.Long.numberOfTrailingZeros(r13)
            int r13 = r22 >> 3
            int r13 = r13 + r7
            r9 = r13 & r6
            java.lang.Object[] r10 = r1.keys
            r10 = r10[r9]
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r0)
            if (r10 == 0) goto L87
            goto La3
        L87:
            r10 = r2
            r13 = 0
            r20 = 1
            long r20 = r10 - r20
            long r10 = r10 & r20
            r2 = r10
            goto L5d
        L91:
            r9 = r4
            r11 = 0
            r22 = r13
            long r13 = ~r9
            r20 = 6
            long r13 = r13 << r20
            long r13 = r13 & r9
            long r9 = r13 & r15
            int r9 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r9 == 0) goto Laa
        La2:
            r9 = -1
        La3:
            if (r9 < 0) goto La8
            r4 = r21
            goto La9
        La8:
            r4 = 0
        La9:
            return r4
        Laa:
            int r8 = r8 + 8
            int r9 = r7 + r8
            r7 = r9 & r6
            r5 = r12
            r2 = r18
            r3 = r19
            goto L22
    }

    public final boolean containsValue(V r23) {
            r22 = this;
            r0 = r22
            r1 = 0
            java.lang.Object[] r2 = r0.values
            r3 = r0
            r4 = 0
            long[] r5 = r3.metadata
            int r6 = r5.length
            int r6 = r6 + (-2)
            r7 = 0
            if (r7 > r6) goto L7f
        Lf:
            r9 = r5[r7]
            r11 = r9
            r13 = 0
            long r14 = ~r11
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r11
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r14 & r16
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 == 0) goto L76
            int r11 = r7 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L2e:
            if (r13 >= r11) goto L6b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 0
            r17 = 128(0x80, double:6.3E-322)
            int r17 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            r18 = 1
            if (r17 >= 0) goto L40
            r14 = r18
            goto L41
        L40:
            r14 = 0
        L41:
            if (r14 == 0) goto L5e
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r14
            r16 = 0
            r17 = 0
            r8 = r2[r15]
            r19 = 0
            r20 = r12
            r12 = r23
            boolean r21 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r8)
            if (r21 == 0) goto L5a
            return r18
        L5a:
            goto L64
        L5e:
            r20 = r12
            r17 = 0
            r12 = r23
        L64:
            long r9 = r9 >> r20
            int r13 = r13 + 1
            r12 = r20
            goto L2e
        L6b:
            r20 = r12
            r17 = 0
            r12 = r23
            r8 = r20
            if (r11 != r8) goto L84
            goto L7a
        L76:
            r12 = r23
            r17 = 0
        L7a:
            if (r7 == r6) goto L83
            int r7 = r7 + 1
            goto Lf
        L7f:
            r12 = r23
            r17 = 0
        L83:
        L84:
            return r17
    }

    public final int count() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    public final int count(kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Boolean> r25) {
            r24 = this;
            r0 = r25
            java.lang.String r1 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = 0
            r3 = r24
            r4 = 0
            java.lang.Object[] r5 = r3.keys
            java.lang.Object[] r6 = r3.values
            r7 = r3
            r8 = 0
            long[] r9 = r7.metadata
            int r10 = r9.length
            int r10 = r10 + (-2)
            r11 = 0
            if (r11 > r10) goto L9d
        L1a:
            r12 = r9[r11]
            r14 = r12
            r16 = 0
            r17 = r1
            r18 = r2
            long r1 = ~r14
            r19 = 7
            long r1 = r1 << r19
            long r1 = r1 & r14
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r19
            int r1 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r1 == 0) goto L8f
            int r1 = r11 - r10
            int r1 = ~r1
            int r1 = r1 >>> 31
            r2 = 8
            int r1 = 8 - r1
            r14 = 0
        L3e:
            if (r14 >= r1) goto L86
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r12
            r19 = 0
            r20 = 128(0x80, double:6.3E-322)
            int r20 = (r15 > r20 ? 1 : (r15 == r20 ? 0 : -1))
            if (r20 >= 0) goto L4e
            r20 = 1
            goto L50
        L4e:
            r20 = 0
        L50:
            if (r20 == 0) goto L79
            int r15 = r11 << 3
            int r15 = r15 + r14
            r16 = r15
            r19 = 0
            r20 = r5[r16]
            r21 = r2
            r2 = r6[r16]
            r22 = r20
            r20 = 0
            r23 = r3
            r3 = r22
            java.lang.Object r22 = r0.invoke(r3, r2)
            java.lang.Boolean r22 = (java.lang.Boolean) r22
            boolean r22 = r22.booleanValue()
            if (r22 == 0) goto L75
            int r18 = r18 + 1
        L75:
            goto L7d
        L79:
            r21 = r2
            r23 = r3
        L7d:
            long r12 = r12 >> r21
            int r14 = r14 + 1
            r2 = r21
            r3 = r23
            goto L3e
        L86:
            r21 = r2
            r23 = r3
            if (r1 != r2) goto La3
            r2 = r18
            goto L93
        L8f:
            r23 = r3
            r2 = r18
        L93:
            if (r11 == r10) goto La1
            int r11 = r11 + 1
            r1 = r17
            r3 = r23
            goto L1a
        L9d:
            r17 = r1
            r23 = r3
        La1:
            r18 = r2
        La3:
            return r18
    }

    public boolean equals(java.lang.Object r25) {
            r24 = this;
            r0 = r25
            r1 = 1
            r2 = r24
            if (r0 != r2) goto L8
            return r1
        L8:
            boolean r3 = r0 instanceof androidx.collection.ScatterMap
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            r3 = r0
            androidx.collection.ScatterMap r3 = (androidx.collection.ScatterMap) r3
            int r3 = r3.getSize()
            int r5 = r2.getSize()
            if (r3 == r5) goto L1c
            return r4
        L1c:
            r3 = r0
            androidx.collection.ScatterMap r3 = (androidx.collection.ScatterMap) r3
            r5 = r24
            r6 = 0
            java.lang.Object[] r7 = r5.keys
            java.lang.Object[] r8 = r5.values
            r9 = r5
            r10 = 0
            long[] r11 = r9.metadata
            int r12 = r11.length
            int r12 = r12 + (-2)
            r13 = 0
            if (r13 > r12) goto Lc5
        L30:
            r14 = r11[r13]
            r16 = r14
            r18 = 0
            r19 = r1
            r1 = r16
            r16 = r4
            r17 = r5
            long r4 = ~r1
            r20 = 7
            long r4 = r4 << r20
            long r4 = r4 & r1
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r4 & r20
            int r1 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r1 == 0) goto Lb5
            int r1 = r13 - r12
            int r1 = ~r1
            int r1 = r1 >>> 31
            r2 = 8
            int r1 = 8 - r1
            r4 = 0
        L59:
            if (r4 >= r1) goto Lad
            r20 = 255(0xff, double:1.26E-321)
            long r20 = r14 & r20
            r5 = 0
            r22 = 128(0x80, double:6.3E-322)
            int r18 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r18 >= 0) goto L69
            r5 = r19
            goto L6b
        L69:
            r5 = r16
        L6b:
            if (r5 == 0) goto La0
            int r5 = r13 << 3
            int r5 = r5 + r4
            r18 = r5
            r20 = 0
            r21 = r2
            r2 = r7[r18]
            r0 = r8[r18]
            r22 = 0
            if (r0 != 0) goto L8f
            java.lang.Object r23 = r3.get(r2)
            if (r23 != 0) goto L8e
            boolean r23 = r3.containsKey(r2)
            if (r23 != 0) goto L8b
            goto L8e
        L8b:
            r23 = r4
            goto L9c
        L8e:
            return r16
        L8f:
            r23 = r4
            java.lang.Object r4 = r3.get(r2)
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r4)
            if (r4 != 0) goto L9c
            return r16
        L9c:
            goto La4
        La0:
            r21 = r2
            r23 = r4
        La4:
            long r14 = r14 >> r21
            int r4 = r23 + 1
            r0 = r25
            r2 = r21
            goto L59
        Lad:
            r21 = r2
            r23 = r4
            r0 = r21
            if (r1 != r0) goto Lca
        Lb5:
            if (r13 == r12) goto Lc9
            int r13 = r13 + 1
            r2 = r24
            r0 = r25
            r4 = r16
            r5 = r17
            r1 = r19
            goto L30
        Lc5:
            r19 = r1
            r17 = r5
        Lc9:
        Lca:
            return r19
    }

    public final int findKeyIndex$collection(K r24) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = 0
            r3 = 0
            if (r1 == 0) goto Ld
            int r5 = r1.hashCode()
            goto Le
        Ld:
            r5 = 0
        Le:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r3 = r5 ^ r6
            r5 = 0
            r5 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r0._capacity
            r7 = 0
            int r7 = r3 >>> 7
            r7 = r7 & r6
            r8 = 0
        L22:
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
            r18 = r5
            long r4 = (long) r12
            long r4 = -r4
            r19 = 63
            long r4 = r4 >> r19
            long r4 = r4 & r15
            long r4 = r4 | r13
            r9 = r4
            r11 = 0
            r12 = r18
            long r13 = (long) r12
            r15 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r13 = r13 * r15
            long r13 = r13 ^ r9
            long r15 = r13 - r15
            r18 = r2
            r19 = r3
            long r2 = ~r13
            long r2 = r2 & r15
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r15
        L5d:
            r9 = r2
            r11 = 0
            r13 = 0
            int r20 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r20 == 0) goto L68
            r20 = 1
            goto L6a
        L68:
            r20 = 0
        L6a:
            if (r20 == 0) goto L90
            r9 = r2
            r11 = 0
            r13 = r9
            r20 = 0
            int r21 = java.lang.Long.numberOfTrailingZeros(r13)
            int r13 = r21 >> 3
            int r13 = r13 + r7
            r9 = r13 & r6
            java.lang.Object[] r10 = r0.keys
            r10 = r10[r9]
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r1)
            if (r10 == 0) goto L86
            return r9
        L86:
            r10 = r2
            r13 = 0
            r20 = 1
            long r20 = r10 - r20
            long r10 = r10 & r20
            r2 = r10
            goto L5d
        L90:
            r9 = r4
            r11 = 0
            r20 = r13
            long r13 = ~r9
            r22 = 6
            long r13 = r13 << r22
            long r13 = r13 & r9
            long r9 = r13 & r15
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 == 0) goto La3
        La1:
            r2 = -1
            return r2
        La3:
            int r8 = r8 + 8
            int r9 = r7 + r8
            r7 = r9 & r6
            r5 = r12
            r2 = r18
            r3 = r19
            goto L22
    }

    public final void forEach(kotlin.jvm.functions.Function2<? super K, ? super V, kotlin.Unit> r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            java.lang.Object[] r3 = r0.keys
            java.lang.Object[] r4 = r0.values
            r5 = r20
            r6 = 0
            long[] r7 = r5.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            r9 = 0
            if (r9 > r8) goto L7b
        L19:
            r10 = r7[r9]
            r12 = r10
            r14 = 0
            r15 = r2
            r16 = r3
            long r2 = ~r12
            r17 = 7
            long r2 = r2 << r17
            long r2 = r2 & r12
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r17
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 == 0) goto L71
            int r2 = r9 - r8
            int r2 = ~r2
            int r2 = r2 >>> 31
            r3 = 8
            int r2 = 8 - r2
            r12 = 0
        L3b:
            if (r12 >= r2) goto L6b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r10
            r17 = 0
            r18 = 128(0x80, double:6.3E-322)
            int r18 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r18 >= 0) goto L4b
            r18 = 1
            goto L4d
        L4b:
            r18 = 0
        L4d:
            if (r18 == 0) goto L60
            int r13 = r9 << 3
            int r13 = r13 + r12
            r14 = r13
            r17 = 0
            r18 = r3
            r3 = r16[r14]
            r0 = r4[r14]
            r1.invoke(r3, r0)
            goto L62
        L60:
            r18 = r3
        L62:
            long r10 = r10 >> r18
            int r12 = r12 + 1
            r0 = r20
            r3 = r18
            goto L3b
        L6b:
            r18 = r3
            r0 = r18
            if (r2 != r0) goto L7f
        L71:
            if (r9 == r8) goto L7e
            int r9 = r9 + 1
            r0 = r20
            r2 = r15
            r3 = r16
            goto L19
        L7b:
            r15 = r2
            r16 = r3
        L7e:
        L7f:
            return
    }

    public final void forEachIndexed(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r15) {
            r14 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 0
            long[] r1 = r14.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r3 > r2) goto L52
        Le:
            r4 = r1[r3]
            r6 = r4
            r8 = 0
            long r9 = ~r6
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r6
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r9 & r11
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 == 0) goto L4d
            int r6 = r3 - r2
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = 0
        L2b:
            if (r8 >= r6) goto L4a
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 0
            r12 = 128(0x80, double:6.3E-322)
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 >= 0) goto L39
            r12 = 1
            goto L3a
        L39:
            r12 = 0
        L3a:
            if (r12 == 0) goto L46
            int r9 = r3 << 3
            int r9 = r9 + r8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r15.invoke(r10)
        L46:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L2b
        L4a:
            if (r6 == r7) goto L4d
            return
        L4d:
            if (r3 == r2) goto L52
            int r3 = r3 + 1
            goto Le
        L52:
            return
    }

    public final void forEachKey(kotlin.jvm.functions.Function1<? super K, kotlin.Unit> r20) {
            r19 = this;
            r0 = r20
            java.lang.String r1 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = r19
            java.lang.Object[] r3 = r2.keys
            r4 = r19
            r5 = 0
            long[] r6 = r4.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            r8 = 0
            if (r8 > r7) goto L6b
        L17:
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
            if (r11 == 0) goto L66
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L36:
            if (r13 >= r11) goto L62
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 0
            r17 = 128(0x80, double:6.3E-322)
            int r17 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r17 >= 0) goto L46
            r17 = 1
            goto L48
        L46:
            r17 = 0
        L48:
            if (r17 == 0) goto L59
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r14
            r16 = 0
            r17 = r12
            r12 = r3[r15]
            r0.invoke(r12)
            goto L5b
        L59:
            r17 = r12
        L5b:
            long r9 = r9 >> r17
            int r13 = r13 + 1
            r12 = r17
            goto L36
        L62:
            r17 = r12
            if (r11 != r12) goto L6c
        L66:
            if (r8 == r7) goto L6b
            int r8 = r8 + 1
            goto L17
        L6b:
        L6c:
            return
    }

    public final void forEachValue(kotlin.jvm.functions.Function1<? super V, kotlin.Unit> r20) {
            r19 = this;
            r0 = r20
            java.lang.String r1 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = r19
            java.lang.Object[] r3 = r2.values
            r4 = r19
            r5 = 0
            long[] r6 = r4.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            r8 = 0
            if (r8 > r7) goto L6b
        L17:
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
            if (r11 == 0) goto L66
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L36:
            if (r13 >= r11) goto L62
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 0
            r17 = 128(0x80, double:6.3E-322)
            int r17 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r17 >= 0) goto L46
            r17 = 1
            goto L48
        L46:
            r17 = 0
        L48:
            if (r17 == 0) goto L59
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r14
            r16 = 0
            r17 = r12
            r12 = r3[r15]
            r0.invoke(r12)
            goto L5b
        L59:
            r17 = r12
        L5b:
            long r9 = r9 >> r17
            int r13 = r13 + 1
            r12 = r17
            goto L36
        L62:
            r17 = r12
            if (r11 != r12) goto L6c
        L66:
            if (r8 == r7) goto L6b
            int r8 = r8 + 1
            goto L17
        L6b:
        L6c:
            return
    }

    public final V get(K r24) {
            r23 = this;
            r0 = r24
            r1 = r23
            r2 = 0
            r3 = 0
            if (r0 == 0) goto Ld
            int r5 = r0.hashCode()
            goto Le
        Ld:
            r5 = 0
        Le:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r3 = r5 ^ r6
            r5 = 0
            r5 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r1._capacity
            r7 = 0
            int r7 = r3 >>> 7
            r7 = r7 & r6
            r8 = 0
        L22:
            long[] r9 = r1.metadata
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
            r18 = r5
            long r4 = (long) r12
            long r4 = -r4
            r19 = 63
            long r4 = r4 >> r19
            long r4 = r4 & r15
            long r4 = r4 | r13
            r9 = r4
            r11 = 0
            r12 = r18
            long r13 = (long) r12
            r15 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r13 = r13 * r15
            long r13 = r13 ^ r9
            long r15 = r13 - r15
            r18 = r2
            r19 = r3
            long r2 = ~r13
            long r2 = r2 & r15
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r15
        L5d:
            r9 = r2
            r11 = 0
            r13 = 0
            int r20 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r20 == 0) goto L68
            r20 = 1
            goto L6a
        L68:
            r20 = 0
        L6a:
            if (r20 == 0) goto L90
            r9 = r2
            r11 = 0
            r13 = r9
            r20 = 0
            int r21 = java.lang.Long.numberOfTrailingZeros(r13)
            int r13 = r21 >> 3
            int r13 = r13 + r7
            r9 = r13 & r6
            java.lang.Object[] r10 = r1.keys
            r10 = r10[r9]
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r0)
            if (r10 == 0) goto L86
            goto La2
        L86:
            r10 = r2
            r13 = 0
            r20 = 1
            long r20 = r10 - r20
            long r10 = r10 & r20
            r2 = r10
            goto L5d
        L90:
            r9 = r4
            r11 = 0
            r20 = r13
            long r13 = ~r9
            r22 = 6
            long r13 = r13 << r22
            long r13 = r13 & r9
            long r9 = r13 & r15
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 == 0) goto Lb0
        La1:
            r9 = -1
        La2:
            if (r9 < 0) goto Lac
            r10 = r23
            java.lang.Object[] r1 = r10.values
            r1 = r1[r9]
            goto Laf
        Lac:
            r10 = r23
            r1 = 0
        Laf:
            return r1
        Lb0:
            r10 = r23
            int r8 = r8 + 8
            int r9 = r7 + r8
            r7 = r9 & r6
            r5 = r12
            r2 = r18
            r3 = r19
            goto L22
    }

    public final int getCapacity() {
            r1 = this;
            int r0 = r1._capacity
            return r0
    }

    public final V getOrDefault(K r24, V r25) {
            r23 = this;
            r0 = r24
            r1 = r23
            r2 = 0
            r3 = 0
            if (r0 == 0) goto Ld
            int r5 = r0.hashCode()
            goto Le
        Ld:
            r5 = 0
        Le:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r3 = r5 ^ r6
            r5 = 0
            r5 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r1._capacity
            r7 = 0
            int r7 = r3 >>> 7
            r7 = r7 & r6
            r8 = 0
        L22:
            long[] r9 = r1.metadata
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
            r18 = r5
            long r4 = (long) r12
            long r4 = -r4
            r19 = 63
            long r4 = r4 >> r19
            long r4 = r4 & r15
            long r4 = r4 | r13
            r9 = r4
            r11 = 0
            r12 = r18
            long r13 = (long) r12
            r15 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r13 = r13 * r15
            long r13 = r13 ^ r9
            long r15 = r13 - r15
            r18 = r2
            r19 = r3
            long r2 = ~r13
            long r2 = r2 & r15
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r15
        L5d:
            r9 = r2
            r11 = 0
            r13 = 0
            int r20 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r20 == 0) goto L68
            r20 = 1
            goto L6a
        L68:
            r20 = 0
        L6a:
            if (r20 == 0) goto L90
            r9 = r2
            r11 = 0
            r13 = r9
            r20 = 0
            int r21 = java.lang.Long.numberOfTrailingZeros(r13)
            int r13 = r21 >> 3
            int r13 = r13 + r7
            r9 = r13 & r6
            java.lang.Object[] r10 = r1.keys
            r10 = r10[r9]
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r0)
            if (r10 == 0) goto L86
            goto La2
        L86:
            r10 = r2
            r13 = 0
            r20 = 1
            long r20 = r10 - r20
            long r10 = r10 & r20
            r2 = r10
            goto L5d
        L90:
            r9 = r4
            r11 = 0
            r20 = r13
            long r13 = ~r9
            r22 = 6
            long r13 = r13 << r22
            long r13 = r13 & r9
            long r9 = r13 & r15
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 == 0) goto Laf
        La1:
            r9 = -1
        La2:
            if (r9 < 0) goto Lac
            r10 = r23
            java.lang.Object[] r1 = r10.values
            r1 = r1[r9]
            return r1
        Lac:
            r10 = r23
            return r25
        Laf:
            r10 = r23
            int r8 = r8 + 8
            int r9 = r7 + r8
            r7 = r9 & r6
            r5 = r12
            r2 = r18
            r3 = r19
            goto L22
    }

    public final V getOrElse(K r3, kotlin.jvm.functions.Function0<? extends V> r4) {
            r2 = this;
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            java.lang.Object r1 = r2.get(r3)
            if (r1 != 0) goto L10
            java.lang.Object r1 = r4.invoke()
        L10:
            return r1
    }

    public final int getSize() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    public int hashCode() {
            r23 = this;
            r0 = 0
            r1 = r23
            r2 = 0
            java.lang.Object[] r3 = r1.keys
            java.lang.Object[] r4 = r1.values
            r5 = r1
            r6 = 0
            long[] r7 = r5.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            r9 = 0
            if (r9 > r8) goto L7e
        L12:
            r10 = r7[r9]
            r12 = r10
            r14 = 0
            r16 = r0
            r15 = r1
            long r0 = ~r12
            r17 = 7
            long r0 = r0 << r17
            long r0 = r0 & r12
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r17
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 == 0) goto L76
            int r0 = r9 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r1 = 8
            int r0 = 8 - r0
            r12 = 0
        L34:
            if (r12 >= r0) goto L71
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r10
            r17 = 0
            r18 = 128(0x80, double:6.3E-322)
            int r18 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            r19 = 0
            if (r18 >= 0) goto L46
            r18 = 1
            goto L48
        L46:
            r18 = r19
        L48:
            if (r18 == 0) goto L6d
            int r13 = r9 << 3
            int r13 = r13 + r12
            r14 = r13
            r17 = 0
            r18 = r3[r14]
            r20 = r4[r14]
            r21 = 0
            if (r18 == 0) goto L5d
            int r22 = r18.hashCode()
            goto L5f
        L5d:
            r22 = r19
        L5f:
            if (r20 == 0) goto L65
            int r19 = r20.hashCode()
        L65:
            r19 = r22 ^ r19
            int r16 = r16 + r19
        L6d:
            long r10 = r10 >> r1
            int r12 = r12 + 1
            goto L34
        L71:
            if (r0 != r1) goto L81
            r0 = r16
            goto L78
        L76:
            r0 = r16
        L78:
            if (r9 == r8) goto L7f
            int r9 = r9 + 1
            r1 = r15
            goto L12
        L7e:
            r15 = r1
        L7f:
            r16 = r0
        L81:
            return r16
    }

    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1._size
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final boolean isNotEmpty() {
            r1 = this;
            int r0 = r1._size
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final java.lang.String joinToString() {
            r9 = this;
            r7 = 63
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            java.lang.String r1 = joinToString$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    public final java.lang.String joinToString(java.lang.CharSequence r11) {
            r10 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r8 = 62
            r9 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            java.lang.String r11 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    public final java.lang.String joinToString(java.lang.CharSequence r11, java.lang.CharSequence r12) {
            r10 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r8 = 60
            r9 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            java.lang.String r11 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    public final java.lang.String joinToString(java.lang.CharSequence r11, java.lang.CharSequence r12, java.lang.CharSequence r13) {
            r10 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r8 = 56
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            java.lang.String r11 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    public final java.lang.String joinToString(java.lang.CharSequence r11, java.lang.CharSequence r12, java.lang.CharSequence r13, int r14) {
            r10 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r8 = 48
            r9 = 0
            r6 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            java.lang.String r11 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    public final java.lang.String joinToString(java.lang.CharSequence r11, java.lang.CharSequence r12, java.lang.CharSequence r13, int r14, java.lang.CharSequence r15) {
            r10 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "truncated"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r8 = 32
            r9 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            java.lang.String r11 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    public final java.lang.String joinToString(java.lang.CharSequence r30, java.lang.CharSequence r31, java.lang.CharSequence r32, int r33, java.lang.CharSequence r34, kotlin.jvm.functions.Function2<? super K, ? super V, ? extends java.lang.CharSequence> r35) {
            r29 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r34
            r4 = r35
            java.lang.String r5 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            java.lang.String r5 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            java.lang.String r5 = "postfix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            java.lang.String r5 = "truncated"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = r5
            r7 = 0
            r6.append(r1)
            r8 = 0
            r9 = r29
            r10 = 0
            java.lang.Object[] r11 = r9.keys
            java.lang.Object[] r12 = r9.values
            r13 = r9
            r14 = 0
            long[] r15 = r13.metadata
            int r1 = r15.length
            int r1 = r1 + (-2)
            r16 = r5
            r5 = 0
            if (r5 > r1) goto Lf5
        L3c:
            r17 = r15[r5]
            r19 = r17
            r21 = 0
            r22 = r7
            r23 = r8
            r7 = r19
            r19 = r9
            r20 = r10
            long r9 = ~r7
            r24 = 7
            long r9 = r9 << r24
            long r9 = r9 & r7
            r24 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r9 & r24
            int r7 = (r7 > r24 ? 1 : (r7 == r24 ? 0 : -1))
            if (r7 == 0) goto Ldf
            int r7 = r5 - r1
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = 0
            r10 = r9
            r9 = r23
        L6a:
            if (r10 >= r7) goto Ld1
            r23 = 255(0xff, double:1.26E-321)
            long r23 = r17 & r23
            r21 = 0
            r25 = 128(0x80, double:6.3E-322)
            int r25 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r25 >= 0) goto L7b
            r25 = 1
            goto L7d
        L7b:
            r25 = 0
        L7d:
            if (r25 == 0) goto Lbe
            int r21 = r5 << 3
            int r21 = r21 + r10
            r23 = r21
            r24 = 0
            r25 = r8
            r8 = r11[r23]
            r26 = r10
            r10 = r12[r23]
            r27 = 0
            r28 = r11
            r11 = r33
            if (r9 != r11) goto L9c
            r6.append(r3)
            goto L105
        L9c:
            if (r9 == 0) goto La1
            r6.append(r0)
        La1:
            if (r4 != 0) goto Laf
            r6.append(r8)
            r0 = 61
            r6.append(r0)
            r6.append(r10)
            goto Lb8
        Laf:
            java.lang.Object r0 = r4.invoke(r8, r10)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6.append(r0)
        Lb8:
            int r9 = r9 + 1
            goto Lc6
        Lbe:
            r25 = r8
            r26 = r10
            r28 = r11
            r11 = r33
        Lc6:
            long r17 = r17 >> r25
            int r10 = r26 + 1
            r0 = r30
            r8 = r25
            r11 = r28
            goto L6a
        Ld1:
            r25 = r8
            r26 = r10
            r28 = r11
            r11 = r33
            r0 = r25
            if (r7 != r0) goto L100
            r8 = r9
            goto Le5
        Ldf:
            r28 = r11
            r11 = r33
            r8 = r23
        Le5:
            if (r5 == r1) goto Lff
            int r5 = r5 + 1
            r0 = r30
            r9 = r19
            r10 = r20
            r7 = r22
            r11 = r28
            goto L3c
        Lf5:
            r22 = r7
            r19 = r9
            r20 = r10
            r28 = r11
            r11 = r33
        Lff:
            r9 = r8
        L100:
            r6.append(r2)
        L105:
            java.lang.String r0 = r16.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final boolean none() {
            r1 = this;
            int r0 = r1._size
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public java.lang.String toString() {
            r25 = this;
            r0 = r25
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            java.lang.String r1 = "{}"
            return r1
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 123(0x7b, float:1.72E-43)
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 0
            r3 = r25
            r4 = 0
            java.lang.Object[] r5 = r3.keys
            java.lang.Object[] r6 = r3.values
            r7 = r3
            r8 = 0
            long[] r9 = r7.metadata
            int r10 = r9.length
            int r10 = r10 + (-2)
            r11 = 0
            if (r11 > r10) goto Lcd
        L28:
            r12 = r9[r11]
            r14 = r12
            r16 = 0
            r18 = r2
            r17 = r3
            long r2 = ~r14
            r19 = 7
            long r2 = r2 << r19
            long r2 = r2 & r14
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r19
            int r2 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r2 == 0) goto Lbd
            int r2 = r11 - r10
            int r2 = ~r2
            int r2 = r2 >>> 31
            r3 = 8
            int r2 = 8 - r2
            r14 = 0
        L4c:
            if (r14 >= r2) goto Lb2
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r12
            r19 = 0
            r20 = 128(0x80, double:6.3E-322)
            int r20 = (r15 > r20 ? 1 : (r15 == r20 ? 0 : -1))
            if (r20 >= 0) goto L5c
            r20 = 1
            goto L5e
        L5c:
            r20 = 0
        L5e:
            if (r20 == 0) goto La3
            int r15 = r11 << 3
            int r15 = r15 + r14
            r16 = r15
            r19 = 0
            r20 = r3
            r3 = r5[r16]
            r21 = r4
            r4 = r6[r16]
            r22 = 0
            java.lang.String r23 = "(this)"
            r24 = r3
            if (r3 != r0) goto L79
            r3 = r23
        L79:
            r1.append(r3)
            java.lang.String r3 = "="
            r1.append(r3)
            if (r4 != r0) goto L86
            r3 = r23
            goto L87
        L86:
            r3 = r4
        L87:
            r1.append(r3)
            int r3 = r18 + 1
            r23 = r4
            int r4 = r0._size
            if (r3 >= r4) goto L9d
            r4 = 44
            java.lang.StringBuilder r4 = r1.append(r4)
            r0 = 32
            r4.append(r0)
        L9d:
            r18 = r3
            goto La7
        La3:
            r20 = r3
            r21 = r4
        La7:
            long r12 = r12 >> r20
            int r14 = r14 + 1
            r0 = r25
            r3 = r20
            r4 = r21
            goto L4c
        Lb2:
            r20 = r3
            r21 = r4
            r0 = r20
            if (r2 != r0) goto Ld3
            r2 = r18
            goto Lc1
        Lbd:
            r21 = r4
            r2 = r18
        Lc1:
            if (r11 == r10) goto Ld1
            int r11 = r11 + 1
            r0 = r25
            r3 = r17
            r4 = r21
            goto L28
        Lcd:
            r17 = r3
            r21 = r4
        Ld1:
            r18 = r2
        Ld3:
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "s.append('}').toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            return r0
    }
}
