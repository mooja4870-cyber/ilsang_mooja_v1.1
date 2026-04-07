package androidx.core.util;

/* JADX INFO: compiled from: SparseLongArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\n\u001a\u001d\u0010\b\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0086\n\u001a\u0015\u0010\f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0086\u0002\u001a\u0015\u0010\u000e\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u000f\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0086\b\u001a\u001d\u0010\u0010\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000bH\u0086\b\u001a#\u0010\u0012\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013H\u0086\b\u001a\r\u0010\u0014\u001a\u00020\u0006*\u00020\u0002H\u0086\b\u001a\r\u0010\u0015\u001a\u00020\u0006*\u00020\u0002H\u0086\b\u001a\u001a\u0010\u0016\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\u0017\u001a\u00020\t*\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002\u001aE\u0010\u0018\u001a\u00020\t*\u00020\u000226\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\t0\u001aH\u0086\b\u001a\n\u0010\u001d\u001a\u00020\u001e*\u00020\u0002\u001a\n\u0010\u001f\u001a\u00020 *\u00020\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006!"}, d2 = {"size", "", "Landroid/util/SparseLongArray;", "getSize", "(Landroid/util/SparseLongArray;)I", "contains", "", "key", "set", "", "value", "", "plus", "other", "containsKey", "containsValue", "getOrDefault", "defaultValue", "getOrElse", "Lkotlin/Function0;", "isEmpty", "isNotEmpty", "remove", "putAll", "forEach", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "keyIterator", "Lkotlin/collections/IntIterator;", "valueIterator", "Lkotlin/collections/LongIterator;", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SparseLongArrayKt {



    public static final boolean contains(android.util.SparseLongArray r2, int r3) {
            r0 = 0
            int r1 = r2.indexOfKey(r3)
            if (r1 < 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public static final boolean containsKey(android.util.SparseLongArray r2, int r3) {
            r0 = 0
            int r1 = r2.indexOfKey(r3)
            if (r1 < 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public static final boolean containsValue(android.util.SparseLongArray r2, long r3) {
            r0 = 0
            int r1 = r2.indexOfValue(r3)
            if (r1 < 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public static final void forEach(android.util.SparseLongArray r6, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> r7) {
            r0 = 0
            r1 = 0
            int r2 = r6.size()
        L6:
            if (r1 >= r2) goto L1e
            int r3 = r6.keyAt(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            long r4 = r6.valueAt(r1)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r7.invoke(r3, r4)
            int r1 = r1 + 1
            goto L6
        L1e:
            return
    }

    public static final long getOrDefault(android.util.SparseLongArray r3, int r4, long r5) {
            r0 = 0
            long r1 = r3.get(r4, r5)
            return r1
    }

    public static final long getOrElse(android.util.SparseLongArray r5, int r6, kotlin.jvm.functions.Function0<java.lang.Long> r7) {
            r0 = 0
            int r1 = r5.indexOfKey(r6)
            r2 = 0
            if (r1 < 0) goto Ld
            long r3 = r5.valueAt(r1)
            goto L17
        Ld:
            java.lang.Object r3 = r7.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
        L17:
            return r3
    }

    public static final int getSize(android.util.SparseLongArray r2) {
            r0 = 0
            int r1 = r2.size()
            return r1
    }

    public static final boolean isEmpty(android.util.SparseLongArray r2) {
            r0 = 0
            int r1 = r2.size()
            if (r1 != 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public static final boolean isNotEmpty(android.util.SparseLongArray r2) {
            r0 = 0
            int r1 = r2.size()
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public static final kotlin.collections.IntIterator keyIterator(android.util.SparseLongArray r1) {
            androidx.core.util.SparseLongArrayKt$keyIterator$1 r0 = new androidx.core.util.SparseLongArrayKt$keyIterator$1
            r0.<init>(r1)
            kotlin.collections.IntIterator r0 = (kotlin.collections.IntIterator) r0
            return r0
    }

    public static final android.util.SparseLongArray plus(android.util.SparseLongArray r3, android.util.SparseLongArray r4) {
            android.util.SparseLongArray r0 = new android.util.SparseLongArray
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            putAll(r0, r3)
            putAll(r0, r4)
            return r0
    }

    public static final void putAll(android.util.SparseLongArray r8, android.util.SparseLongArray r9) {
            r0 = r9
            r1 = 0
            r2 = 0
            int r3 = r0.size()
        L7:
            if (r2 >= r3) goto L19
            int r4 = r0.keyAt(r2)
            long r5 = r0.valueAt(r2)
            r7 = 0
            r8.put(r4, r5)
            int r2 = r2 + 1
            goto L7
        L19:
            return
    }

    public static final boolean remove(android.util.SparseLongArray r3, int r4, long r5) {
            int r0 = r3.indexOfKey(r4)
            if (r0 < 0) goto L13
            long r1 = r3.valueAt(r0)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L13
            r3.removeAt(r0)
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    public static final void set(android.util.SparseLongArray r1, int r2, long r3) {
            r0 = 0
            r1.put(r2, r3)
            return
    }

    public static final kotlin.collections.LongIterator valueIterator(android.util.SparseLongArray r1) {
            androidx.core.util.SparseLongArrayKt$valueIterator$1 r0 = new androidx.core.util.SparseLongArrayKt$valueIterator$1
            r0.<init>(r1)
            kotlin.collections.LongIterator r0 = (kotlin.collections.LongIterator) r0
            return r0
    }
}
