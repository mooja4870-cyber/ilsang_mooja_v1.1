package androidx.collection.internal;

/* JADX INFO: compiled from: LruHashMap.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u001d\b\u0016\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0002\u0010\u0005B\u0019\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0017\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u0018J\u001d\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0002\u0010\u001bJ\u0015\u0010\u001c\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0002\u0010\u0018R#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r0\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R*\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/collection/internal/LruHashMap;", "K", "", "V", "original", "(Landroidx/collection/internal/LruHashMap;)V", "initialCapacity", "", "loadFactor", "", "(IF)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "isEmpty", "", "()Z", "map", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "get", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LruHashMap<K, V> {
    private final java.util.LinkedHashMap<K, V> map;

    public LruHashMap() {
            r4 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3 = 0
            r4.<init>(r2, r3, r0, r1)
            return
    }

    public LruHashMap(int r3, float r4) {
            r2 = this;
            r2.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 1
            r0.<init>(r3, r4, r1)
            r2.map = r0
            return
    }

    public /* synthetic */ LruHashMap(int r1, float r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto L6
            r1 = 16
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 1061158912(0x3f400000, float:0.75)
        Lc:
            r0.<init>(r1, r2)
            return
    }

    public LruHashMap(androidx.collection.internal.LruHashMap<? extends K, V> r5) {
            r4 = this;
            java.lang.String r0 = "original"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 3
            r1 = 0
            r2 = 0
            r3 = 0
            r4.<init>(r2, r3, r0, r1)
            java.util.Set r0 = r5.getEntries()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r4.put(r2, r1)
            goto L14
        L2c:
            return
    }

    public final V get(K r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.LinkedHashMap<K, V> r0 = r1.map
            java.lang.Object r0 = r0.get(r2)
            return r0
    }

    public final java.util.Set<java.util.Map.Entry<K, V>> getEntries() {
            r2 = this;
            java.util.LinkedHashMap<K, V> r0 = r2.map
            java.util.Set r0 = r0.entrySet()
            java.lang.String r1 = "map.entries"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final boolean isEmpty() {
            r1 = this;
            java.util.LinkedHashMap<K, V> r0 = r1.map
            boolean r0 = r0.isEmpty()
            return r0
    }

    public final V put(K r2, V r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.LinkedHashMap<K, V> r0 = r1.map
            java.lang.Object r0 = r0.put(r2, r3)
            return r0
    }

    public final V remove(K r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.LinkedHashMap<K, V> r0 = r1.map
            java.lang.Object r0 = r0.remove(r2)
            return r0
    }
}
