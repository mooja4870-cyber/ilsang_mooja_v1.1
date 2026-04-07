package androidx.core.util;

/* JADX INFO: compiled from: LruCache.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001aø\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000628\b\u0006\u0010\u0007\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00060\b2%\b\u0006\u0010\r\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u000e2d\b\u0006\u0010\u000f\u001a^\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010H\u0086\b¨\u0006\u0016"}, d2 = {"lruCache", "Landroid/util/LruCache;", "K", "V", "", "maxSize", "", "sizeOf", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "key", "value", "create", "Lkotlin/Function1;", "onEntryRemoved", "Lkotlin/Function4;", "", "evicted", "oldValue", "newValue", "", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LruCacheKt {




    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$4, reason: invalid class name */
    /* JADX INFO: compiled from: LruCache.kt */
    @kotlin.Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0014¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\bJ/\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00012\b\u0010\u000e\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/core/util/LruCacheKt$lruCache$4", "Landroid/util/LruCache;", "sizeOf", "", "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)I", "create", "(Ljava/lang/Object;)Ljava/lang/Object;", "entryRemoved", "", "evicted", "", "oldValue", "newValue", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "core-ktx_release"}, k = 1, mv = {2, 0, 0}, xi = 176)
    public static final class AnonymousClass4<K, V> extends android.util.LruCache<K, V> {
        final /* synthetic */ kotlin.jvm.functions.Function1<K, V> $create;
        final /* synthetic */ kotlin.jvm.functions.Function4<java.lang.Boolean, K, V, V, kotlin.Unit> $onEntryRemoved;
        final /* synthetic */ kotlin.jvm.functions.Function2<K, V, java.lang.Integer> $sizeOf;

        public AnonymousClass4(int r1, kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Integer> r2, kotlin.jvm.functions.Function1<? super K, ? extends V> r3, kotlin.jvm.functions.Function4<? super java.lang.Boolean, ? super K, ? super V, ? super V, kotlin.Unit> r4) {
                r0 = this;
                r0.$sizeOf = r2
                r0.$create = r3
                r0.$onEntryRemoved = r4
                r0.<init>(r1)
                return
        }

        @Override // android.util.LruCache
        protected V create(K r2) {
                r1 = this;
                kotlin.jvm.functions.Function1<K, V> r0 = r1.$create
                java.lang.Object r0 = r0.invoke(r2)
                return r0
        }

        @Override // android.util.LruCache
        protected void entryRemoved(boolean r3, K r4, V r5, V r6) {
                r2 = this;
                kotlin.jvm.functions.Function4<java.lang.Boolean, K, V, V, kotlin.Unit> r0 = r2.$onEntryRemoved
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
                r0.invoke(r1, r4, r5, r6)
                return
        }

        @Override // android.util.LruCache
        protected int sizeOf(K r2, V r3) {
                r1 = this;
                kotlin.jvm.functions.Function2<K, V, java.lang.Integer> r0 = r1.$sizeOf
                java.lang.Object r0 = r0.invoke(r2, r3)
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                return r0
        }
    }

    public static final <K, V> android.util.LruCache<K, V> lruCache(int r2, kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Integer> r3, kotlin.jvm.functions.Function1<? super K, ? extends V> r4, kotlin.jvm.functions.Function4<? super java.lang.Boolean, ? super K, ? super V, ? super V, kotlin.Unit> r5) {
            r0 = 0
            androidx.core.util.LruCacheKt$lruCache$4 r1 = new androidx.core.util.LruCacheKt$lruCache$4
            r1.<init>(r2, r3, r4, r5)
            android.util.LruCache r1 = (android.util.LruCache) r1
            return r1
    }

    public static /* synthetic */ android.util.LruCache lruCache$default(int r0, kotlin.jvm.functions.Function2 r1, kotlin.jvm.functions.Function1 r2, kotlin.jvm.functions.Function4 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L9
            androidx.core.util.LruCacheKt$lruCache$1 r5 = androidx.core.util.LruCacheKt.AnonymousClass1.INSTANCE
            r1 = r5
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
        L9:
            r5 = r4 & 4
            if (r5 == 0) goto L12
            androidx.core.util.LruCacheKt$lruCache$2 r5 = androidx.core.util.LruCacheKt.AnonymousClass2.INSTANCE
            r2 = r5
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
        L12:
            r4 = r4 & 8
            if (r4 == 0) goto L1b
            androidx.core.util.LruCacheKt$lruCache$3 r4 = androidx.core.util.LruCacheKt.AnonymousClass3.INSTANCE
            r3 = r4
            kotlin.jvm.functions.Function4 r3 = (kotlin.jvm.functions.Function4) r3
        L1b:
            r4 = 0
            androidx.core.util.LruCacheKt$lruCache$4 r5 = new androidx.core.util.LruCacheKt$lruCache$4
            r5.<init>(r0, r1, r2, r3)
            android.util.LruCache r5 = (android.util.LruCache) r5
            return r5
    }
}
