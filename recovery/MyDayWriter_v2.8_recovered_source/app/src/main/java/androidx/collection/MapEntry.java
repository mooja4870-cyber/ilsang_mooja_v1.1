package androidx.collection;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/collection/MapEntry;", "K", "V", "", "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getValue", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class MapEntry<K, V> implements java.util.Map.Entry<K, V>, kotlin.jvm.internal.markers.KMappedMarker {
    private final K key;
    private final V value;

    public MapEntry(K r1, V r2) {
            r0 = this;
            r0.<init>()
            r0.key = r1
            r0.value = r2
            return
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
    public V setValue(V r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
