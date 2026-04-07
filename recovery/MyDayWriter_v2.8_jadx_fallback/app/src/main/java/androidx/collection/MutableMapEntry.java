package androidx.collection;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B-\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0015\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00028\u00008VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00028\u00018VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001b\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0018\u0010\u0013¨\u0006\u001c"}, d2 = {"Landroidx/collection/MutableMapEntry;", "K", "V", "", "keys", "", "", "values", "index", "", "([Ljava/lang/Object;[Ljava/lang/Object;I)V", "getIndex", "()I", "key", "getKey$annotations", "()V", "getKey", "()Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "value", "getValue$annotations", "getValue", "getValues", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class MutableMapEntry<K, V> implements java.util.Map.Entry<K, V>, kotlin.jvm.internal.markers.KMutableMap.Entry {
    private final int index;
    private final java.lang.Object[] keys;
    private final java.lang.Object[] values;

    public MutableMapEntry(java.lang.Object[] r2, java.lang.Object[] r3, int r4) {
            r1 = this;
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "values"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.keys = r2
            r1.values = r3
            r1.index = r4
            return
    }

    public static /* synthetic */ void getKey$annotations() {
            return
    }

    public static /* synthetic */ void getValue$annotations() {
            return
    }

    public final int getIndex() {
            r1 = this;
            int r0 = r1.index
            return r0
    }

    @Override // java.util.Map.Entry
    public K getKey() {
            r2 = this;
            java.lang.Object[] r0 = r2.keys
            int r1 = r2.index
            r0 = r0[r1]
            return r0
    }

    public final java.lang.Object[] getKeys() {
            r1 = this;
            java.lang.Object[] r0 = r1.keys
            return r0
    }

    @Override // java.util.Map.Entry
    public V getValue() {
            r2 = this;
            java.lang.Object[] r0 = r2.values
            int r1 = r2.index
            r0 = r0[r1]
            return r0
    }

    public final java.lang.Object[] getValues() {
            r1 = this;
            java.lang.Object[] r0 = r1.values
            return r0
    }

    @Override // java.util.Map.Entry
    public V setValue(V r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.values
            int r1 = r3.index
            r0 = r0[r1]
            java.lang.Object[] r1 = r3.values
            int r2 = r3.index
            r1[r2] = r4
            return r0
    }
}
