package kotlin.sequences;

/* JADX INFO: compiled from: _SequencesJvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001aA\u0010\u0005\u001a\u0002H\u0006\"\u0010\b\u0000\u0010\u0006*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0007\"\u0004\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\b\u001a\u0002H\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¢\u0006\u0002\u0010\t\u001a)\u0010\n\u001a\u0004\u0018\u0001H\u000b\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f*\b\u0012\u0004\u0012\u0002H\u000b0\u0001H\u0007¢\u0006\u0002\u0010\r\u001a\u0019\u0010\n\u001a\u0004\u0018\u00010\u000e*\b\u0012\u0004\u0012\u00020\u000e0\u0001H\u0007¢\u0006\u0002\u0010\u000f\u001a\u0019\u0010\n\u001a\u0004\u0018\u00010\u0010*\b\u0012\u0004\u0012\u00020\u00100\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001aG\u0010\u0012\u001a\u0004\u0018\u0001H\u000b\"\u0004\b\u0000\u0010\u000b\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f*\b\u0012\u0004\u0012\u0002H\u000b0\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a;\u0010\u0016\u001a\u0004\u0018\u0001H\u000b\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00012\u001a\u0010\u0017\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000b0\u0018j\n\u0012\u0006\b\u0000\u0012\u0002H\u000b`\u0019H\u0007¢\u0006\u0002\u0010\u001a\u001a)\u0010\u001b\u001a\u0004\u0018\u0001H\u000b\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f*\b\u0012\u0004\u0012\u0002H\u000b0\u0001H\u0007¢\u0006\u0002\u0010\r\u001a\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000e*\b\u0012\u0004\u0012\u00020\u000e0\u0001H\u0007¢\u0006\u0002\u0010\u000f\u001a\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u0010*\b\u0012\u0004\u0012\u00020\u00100\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001aG\u0010\u001c\u001a\u0004\u0018\u0001H\u000b\"\u0004\b\u0000\u0010\u000b\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f*\b\u0012\u0004\u0012\u0002H\u000b0\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a;\u0010\u001d\u001a\u0004\u0018\u0001H\u000b\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00012\u001a\u0010\u0017\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000b0\u0018j\n\u0012\u0006\b\u0000\u0012\u0002H\u000b`\u0019H\u0007¢\u0006\u0002\u0010\u001a\u001a5\u0010\u001e\u001a\u00020\u001f\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u001f0\u0014H\u0087\bø\u0001\u0000¢\u0006\u0002\b \u001a5\u0010\u001e\u001a\u00020!\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020!0\u0014H\u0087\bø\u0001\u0000¢\u0006\u0002\b\"\u001a&\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u000b0$\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f*\b\u0012\u0004\u0012\u0002H\u000b0\u0001\u001a8\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u000b0$\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00012\u001a\u0010\u0017\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000b0\u0018j\n\u0012\u0006\b\u0000\u0012\u0002H\u000b`\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006%"}, d2 = {"filterIsInstance", "Lkotlin/sequences/Sequence;", "R", "klass", "Ljava/lang/Class;", "filterIsInstanceTo", "C", "", "destination", "(Lkotlin/sequences/Sequence;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "max", "T", "", "(Lkotlin/sequences/Sequence;)Ljava/lang/Comparable;", "", "(Lkotlin/sequences/Sequence;)Ljava/lang/Double;", "", "(Lkotlin/sequences/Sequence;)Ljava/lang/Float;", "maxBy", "selector", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Lkotlin/sequences/Sequence;Ljava/util/Comparator;)Ljava/lang/Object;", "min", "minBy", "minWith", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "Ljava/math/BigInteger;", "sumOfBigInteger", "toSortedSet", "Ljava/util/SortedSet;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
class SequencesKt___SequencesJvmKt extends kotlin.sequences.SequencesKt__SequencesKt {


    public SequencesKt___SequencesJvmKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final <R> kotlin.sequences.Sequence<R> filterIsInstance(kotlin.sequences.Sequence<?> r2, java.lang.Class<R> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.sequences.SequencesKt___SequencesJvmKt$filterIsInstance$1 r0 = new kotlin.sequences.SequencesKt___SequencesJvmKt$filterIsInstance$1
            r0.<init>(r3)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.filter(r2, r0)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            return r0
    }

    public static final <C extends java.util.Collection<? super R>, R> C filterIsInstanceTo(kotlin.sequences.Sequence<?> r3, C r4, java.lang.Class<R> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Iterator r0 = r3.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            boolean r2 = r5.isInstance(r1)
            if (r2 == 0) goto L13
            r4.add(r1)
            goto L13
        L27:
            return r4
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Comparable max(kotlin.sequences.Sequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Comparable r0 = kotlin.sequences.SequencesKt.maxOrNull(r1)
            return r0
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ java.lang.Double m1424max(kotlin.sequences.Sequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Double r0 = kotlin.sequences.SequencesKt.maxOrNull(r1)
            return r0
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ java.lang.Float m1425max(kotlin.sequences.Sequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Float r0 = kotlin.sequences.SequencesKt.maxOrNull(r1)
            return r0
    }

    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends java.lang.Comparable<? super R>> T maxBy(kotlin.sequences.Sequence<? extends T> r9, kotlin.jvm.functions.Function1<? super T, ? extends R> r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r1 = r9
            r2 = 0
            java.util.Iterator r3 = r1.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L19
            r4 = 0
            goto L43
        L19:
            java.lang.Object r4 = r3.next()
            boolean r5 = r3.hasNext()
            if (r5 != 0) goto L24
            goto L43
        L24:
            java.lang.Object r5 = r10.invoke(r4)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
        L2a:
            java.lang.Object r6 = r3.next()
            java.lang.Object r7 = r10.invoke(r6)
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            int r8 = r5.compareTo(r7)
            if (r8 >= 0) goto L3c
            r4 = r6
            r5 = r7
        L3c:
            boolean r6 = r3.hasNext()
            if (r6 != 0) goto L2a
        L43:
            return r4
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Object maxWith(kotlin.sequences.Sequence r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Object r0 = kotlin.sequences.SequencesKt.maxWithOrNull(r1, r2)
            return r0
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Comparable min(kotlin.sequences.Sequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Comparable r0 = kotlin.sequences.SequencesKt.minOrNull(r1)
            return r0
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ java.lang.Double m1426min(kotlin.sequences.Sequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Double r0 = kotlin.sequences.SequencesKt.minOrNull(r1)
            return r0
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ java.lang.Float m1427min(kotlin.sequences.Sequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Float r0 = kotlin.sequences.SequencesKt.minOrNull(r1)
            return r0
    }

    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends java.lang.Comparable<? super R>> T minBy(kotlin.sequences.Sequence<? extends T> r9, kotlin.jvm.functions.Function1<? super T, ? extends R> r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r1 = r9
            r2 = 0
            java.util.Iterator r3 = r1.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L19
            r4 = 0
            goto L43
        L19:
            java.lang.Object r4 = r3.next()
            boolean r5 = r3.hasNext()
            if (r5 != 0) goto L24
            goto L43
        L24:
            java.lang.Object r5 = r10.invoke(r4)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
        L2a:
            java.lang.Object r6 = r3.next()
            java.lang.Object r7 = r10.invoke(r6)
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            int r8 = r5.compareTo(r7)
            if (r8 <= 0) goto L3c
            r4 = r6
            r5 = r7
        L3c:
            boolean r6 = r3.hasNext()
            if (r6 != 0) goto L2a
        L43:
            return r4
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Object minWith(kotlin.sequences.Sequence r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Object r0 = kotlin.sequences.SequencesKt.minWithOrNull(r1, r2)
            return r0
    }

    private static final <T> java.math.BigDecimal sumOfBigDecimal(kotlin.sequences.Sequence<? extends T> r5, kotlin.jvm.functions.Function1<? super T, ? extends java.math.BigDecimal> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.Iterator r1 = r5.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigDecimal r3 = r0.add(r3)
            java.lang.String r4 = "add(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r0 = r3
            goto L19
        L34:
            return r0
    }

    private static final <T> java.math.BigInteger sumOfBigInteger(kotlin.sequences.Sequence<? extends T> r5, kotlin.jvm.functions.Function1<? super T, ? extends java.math.BigInteger> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.Iterator r1 = r5.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r3 = r0.add(r3)
            java.lang.String r4 = "add(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r0 = r3
            goto L19
        L34:
            return r0
    }

    public static final <T extends java.lang.Comparable<? super T>> java.util.SortedSet<T> toSortedSet(kotlin.sequences.Sequence<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Collection r0 = kotlin.sequences.SequencesKt.toCollection(r1, r0)
            java.util.SortedSet r0 = (java.util.SortedSet) r0
            return r0
    }

    public static final <T> java.util.SortedSet<T> toSortedSet(kotlin.sequences.Sequence<? extends T> r1, java.util.Comparator<? super T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>(r2)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Collection r0 = kotlin.sequences.SequencesKt.toCollection(r1, r0)
            java.util.SortedSet r0 = (java.util.SortedSet) r0
            return r0
    }
}
