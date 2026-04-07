package androidx.arch.core.internal;

/* JADX INFO: loaded from: classes.dex */
public class FastSafeIterableMap<K, V> extends androidx.arch.core.internal.SafeIterableMap<K, V> {
    private final java.util.HashMap<K, androidx.arch.core.internal.SafeIterableMap.Entry<K, V>> mHashMap;

    public FastSafeIterableMap() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mHashMap = r0
            return
    }

    public java.util.Map.Entry<K, V> ceil(K r2) {
            r1 = this;
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L11
            java.util.HashMap<K, androidx.arch.core.internal.SafeIterableMap$Entry<K, V>> r0 = r1.mHashMap
            java.lang.Object r0 = r0.get(r2)
            androidx.arch.core.internal.SafeIterableMap$Entry r0 = (androidx.arch.core.internal.SafeIterableMap.Entry) r0
            androidx.arch.core.internal.SafeIterableMap$Entry<K, V> r0 = r0.mPrevious
            return r0
        L11:
            r0 = 0
            return r0
    }

    public boolean contains(K r2) {
            r1 = this;
            java.util.HashMap<K, androidx.arch.core.internal.SafeIterableMap$Entry<K, V>> r0 = r1.mHashMap
            boolean r0 = r0.containsKey(r2)
            return r0
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    protected androidx.arch.core.internal.SafeIterableMap.Entry<K, V> get(K r2) {
            r1 = this;
            java.util.HashMap<K, androidx.arch.core.internal.SafeIterableMap$Entry<K, V>> r0 = r1.mHashMap
            java.lang.Object r0 = r0.get(r2)
            androidx.arch.core.internal.SafeIterableMap$Entry r0 = (androidx.arch.core.internal.SafeIterableMap.Entry) r0
            return r0
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V putIfAbsent(K r4, V r5) {
            r3 = this;
            androidx.arch.core.internal.SafeIterableMap$Entry r0 = r3.get(r4)
            if (r0 == 0) goto L9
            V r1 = r0.mValue
            return r1
        L9:
            java.util.HashMap<K, androidx.arch.core.internal.SafeIterableMap$Entry<K, V>> r1 = r3.mHashMap
            androidx.arch.core.internal.SafeIterableMap$Entry r2 = r3.put(r4, r5)
            r1.put(r4, r2)
            r1 = 0
            return r1
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V remove(K r3) {
            r2 = this;
            java.lang.Object r0 = super.remove(r3)
            java.util.HashMap<K, androidx.arch.core.internal.SafeIterableMap$Entry<K, V>> r1 = r2.mHashMap
            r1.remove(r3)
            return r0
    }
}
