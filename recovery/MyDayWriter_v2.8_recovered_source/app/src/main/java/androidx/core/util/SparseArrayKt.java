package androidx.core.util;

/* JADX INFO: compiled from: SparseArray.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\u001a!\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\n\u001a.\u0010\t\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u0002H\u0002H\u0086\n¢\u0006\u0002\u0010\f\u001a-\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\u0002\u001a!\u0010\u000f\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a&\u0010\u0010\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000b\u001a\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\u0011\u001a.\u0010\u0012\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\u0014\u001a4\u0010\u0015\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0016H\u0086\b¢\u0006\u0002\u0010\u0017\u001a\u0019\u0010\u0018\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\b\u001a+\u0010\u001a\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u0002H\u0002¢\u0006\u0002\u0010\u001b\u001a$\u0010\u001c\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001aQ\u0010\u001d\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000326\u0010\u001e\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\b\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\n0\u001fH\u0086\b\u001a\u0016\u0010\"\u001a\u00020#\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u001c\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00020%\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\"\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006&"}, d2 = {"size", "", "T", "Landroid/util/SparseArray;", "getSize", "(Landroid/util/SparseArray;)I", "contains", "", "key", "set", "", "value", "(Landroid/util/SparseArray;ILjava/lang/Object;)V", "plus", "other", "containsKey", "containsValue", "(Landroid/util/SparseArray;Ljava/lang/Object;)Z", "getOrDefault", "defaultValue", "(Landroid/util/SparseArray;ILjava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(Landroid/util/SparseArray;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isEmpty", "isNotEmpty", "remove", "(Landroid/util/SparseArray;ILjava/lang/Object;)Z", "putAll", "forEach", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "keyIterator", "Lkotlin/collections/IntIterator;", "valueIterator", "", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SparseArrayKt {


    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.core.util.SparseArrayKt$valueIterator$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SparseArray.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u0016\u0010\n\u001a\n \u000b*\u0004\u0018\u00018\u00008\u0000H\u0096\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"androidx/core/util/SparseArrayKt$valueIterator$1", "", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "kotlin.jvm.PlatformType", "()Ljava/lang/Object;", "core-ktx_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C00121<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
        final /* synthetic */ android.util.SparseArray<T> $this_valueIterator;
        private int index;

        C00121(android.util.SparseArray<T> r1) {
                r0 = this;
                r0.$this_valueIterator = r1
                r0.<init>()
                return
        }

        public final int getIndex() {
                r1 = this;
                int r0 = r1.index
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.index
                android.util.SparseArray<T> r1 = r2.$this_valueIterator
                int r1 = r1.size()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                android.util.SparseArray<T> r0 = r3.$this_valueIterator
                int r1 = r3.index
                int r2 = r1 + 1
                r3.index = r2
                java.lang.Object r0 = r0.valueAt(r1)
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        public final void setIndex(int r1) {
                r0 = this;
                r0.index = r1
                return
        }
    }

    public static final <T> boolean contains(android.util.SparseArray<T> r2, int r3) {
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

    public static final <T> boolean containsKey(android.util.SparseArray<T> r2, int r3) {
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

    public static final <T> boolean containsValue(android.util.SparseArray<T> r2, T r3) {
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

    public static final <T> void forEach(android.util.SparseArray<T> r5, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, kotlin.Unit> r6) {
            r0 = 0
            r1 = 0
            int r2 = r5.size()
        L6:
            if (r1 >= r2) goto L1a
            int r3 = r5.keyAt(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r4 = r5.valueAt(r1)
            r6.invoke(r3, r4)
            int r1 = r1 + 1
            goto L6
        L1a:
            return
    }

    public static final <T> T getOrDefault(android.util.SparseArray<T> r2, int r3, T r4) {
            r0 = 0
            java.lang.Object r1 = r2.get(r3)
            if (r1 != 0) goto L8
            r1 = r4
        L8:
            return r1
    }

    public static final <T> T getOrElse(android.util.SparseArray<T> r2, int r3, kotlin.jvm.functions.Function0<? extends T> r4) {
            r0 = 0
            java.lang.Object r1 = r2.get(r3)
            if (r1 != 0) goto Lb
            java.lang.Object r1 = r4.invoke()
        Lb:
            return r1
    }

    public static final <T> int getSize(android.util.SparseArray<T> r2) {
            r0 = 0
            int r1 = r2.size()
            return r1
    }

    public static final <T> boolean isEmpty(android.util.SparseArray<T> r2) {
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

    public static final <T> boolean isNotEmpty(android.util.SparseArray<T> r2) {
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

    public static final <T> kotlin.collections.IntIterator keyIterator(android.util.SparseArray<T> r1) {
            androidx.core.util.SparseArrayKt$keyIterator$1 r0 = new androidx.core.util.SparseArrayKt$keyIterator$1
            r0.<init>(r1)
            kotlin.collections.IntIterator r0 = (kotlin.collections.IntIterator) r0
            return r0
    }

    public static final <T> android.util.SparseArray<T> plus(android.util.SparseArray<T> r3, android.util.SparseArray<T> r4) {
            android.util.SparseArray r0 = new android.util.SparseArray
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            putAll(r0, r3)
            putAll(r0, r4)
            return r0
    }

    public static final <T> void putAll(android.util.SparseArray<T> r7, android.util.SparseArray<T> r8) {
            r0 = r8
            r1 = 0
            r2 = 0
            int r3 = r0.size()
        L7:
            if (r2 >= r3) goto L19
            int r4 = r0.keyAt(r2)
            java.lang.Object r5 = r0.valueAt(r2)
            r6 = 0
            r7.put(r4, r5)
            int r2 = r2 + 1
            goto L7
        L19:
            return
    }

    public static final <T> boolean remove(android.util.SparseArray<T> r2, int r3, T r4) {
            int r0 = r2.indexOfKey(r3)
            if (r0 < 0) goto L15
            java.lang.Object r1 = r2.valueAt(r0)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r1)
            if (r1 == 0) goto L15
            r2.removeAt(r0)
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static final <T> void set(android.util.SparseArray<T> r1, int r2, T r3) {
            r0 = 0
            r1.put(r2, r3)
            return
    }

    public static final <T> java.util.Iterator<T> valueIterator(android.util.SparseArray<T> r1) {
            androidx.core.util.SparseArrayKt$valueIterator$1 r0 = new androidx.core.util.SparseArrayKt$valueIterator$1
            r0.<init>(r1)
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }
}
