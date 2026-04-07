package kotlin.collections;

/* JADX INFO: compiled from: AbstractMutableMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/collections/AbstractMutableMap;", "K", "V", "", "Ljava/util/AbstractMap;", "()V", "put", "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractMutableMap<K, V> extends java.util.AbstractMap<K, V> implements java.util.Map<K, V>, kotlin.jvm.internal.markers.KMutableMap {
    protected AbstractMutableMap() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set r0 = r1.getEntries()
            return r0
    }

    public abstract java.util.Set getEntries();

    public /* bridge */ java.util.Set<java.lang.Object> getKeys() {
            r1 = this;
            java.util.Set r0 = super.keySet()
            return r0
    }

    public /* bridge */ int getSize() {
            r1 = this;
            int r0 = super.size()
            return r0
    }

    public /* bridge */ java.util.Collection<java.lang.Object> getValues() {
            r1 = this;
            java.util.Collection r0 = super.values()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set r0 = r1.getKeys()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public abstract V put(K r1, V r2);

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection r0 = r1.getValues()
            return r0
    }
}
