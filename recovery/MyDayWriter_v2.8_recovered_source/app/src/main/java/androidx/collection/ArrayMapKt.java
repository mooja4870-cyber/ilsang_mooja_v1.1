package androidx.collection;

/* JADX INFO: compiled from: ArrayMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0086\b\u001aO\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00060\u0005\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"arrayMapOf", "Landroidx/collection/ArrayMap;", "K", "V", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Landroidx/collection/ArrayMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ArrayMapKt {
    public static final <K, V> androidx.collection.ArrayMap<K, V> arrayMapOf() {
            r0 = 0
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            return r1
    }

    public static final <K, V> androidx.collection.ArrayMap<K, V> arrayMapOf(kotlin.Pair<? extends K, ? extends V>... r7) {
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L22
            r3 = r7[r2]
            r4 = r0
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r3.getFirst()
            java.lang.Object r6 = r3.getSecond()
            r4.put(r5, r6)
            int r2 = r2 + 1
            goto Ld
        L22:
            return r0
    }
}
