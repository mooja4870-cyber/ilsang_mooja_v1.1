package kotlin.collections;

/* JADX INFO: compiled from: _MapsJvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ah\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00062\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0004\u0012\u0002H\u00040\bH\u0087\bø\u0001\u0000\u001ai\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000622\u0010\n\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00010\u000bj\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001`\fH\u0087\b\u001ah\u0010\r\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00062\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0004\u0012\u0002H\u00040\bH\u0087\bø\u0001\u0000\u001ah\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u000622\u0010\n\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00010\u000bj\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001`\fH\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"maxBy", "", "K", "V", "R", "", "", "selector", "Lkotlin/Function1;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "minBy", "minWith", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
class MapsKt___MapsJvmKt extends kotlin.collections.MapsKt__MapsKt {
    public MapsKt___MapsJvmKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final /* synthetic */ <K, V, R extends java.lang.Comparable<? super R>> java.util.Map.Entry<K, V> maxBy(java.util.Map<? extends K, ? extends V> r6, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.util.Set r0 = r6.entrySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L1c
            r0 = 0
            goto L47
        L1c:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L28
        L26:
            r0 = r1
            goto L47
        L28:
            java.lang.Object r2 = r7.invoke(r1)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
        L2e:
            java.lang.Object r3 = r0.next()
            java.lang.Object r4 = r7.invoke(r3)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r5 = r2.compareTo(r4)
            if (r5 >= 0) goto L40
            r1 = r3
            r2 = r4
        L40:
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L2e
            goto L26
        L47:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    private static final /* synthetic */ <K, V> java.util.Map.Entry<K, V> maxWith(java.util.Map<? extends K, ? extends V> r1, java.util.Comparator<? super java.util.Map.Entry<? extends K, ? extends V>> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Set r0 = r1.entrySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = kotlin.collections.CollectionsKt.maxWithOrNull(r0, r2)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <K, V, R extends java.lang.Comparable<? super R>> java.util.Map.Entry<K, V> minBy(java.util.Map<? extends K, ? extends V> r7, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            java.util.Set r1 = r7.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L1d
            r1 = 0
            goto L48
        L1d:
            java.lang.Object r2 = r1.next()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L29
        L27:
            r1 = r2
            goto L48
        L29:
            java.lang.Object r3 = r8.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
        L2f:
            java.lang.Object r4 = r1.next()
            java.lang.Object r5 = r8.invoke(r4)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r3.compareTo(r5)
            if (r6 <= 0) goto L41
            r2 = r4
            r3 = r5
        L41:
            boolean r4 = r1.hasNext()
            if (r4 != 0) goto L2f
            goto L27
        L48:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            return r1
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.util.Map.Entry minWith(java.util.Map r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Set r0 = r1.entrySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = kotlin.collections.CollectionsKt.minWithOrNull(r0, r2)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }
}
