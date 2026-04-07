package kotlin.text;

/* JADX INFO: compiled from: _StringsJvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\f\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0006\u001a;\u0010\u0007\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\b0\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\f\u001a/\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u001a\u0010\u000e\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0006\u001a;\u0010\u0013\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\b0\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\f\u001a/\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u001a\u0010\u000e\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a)\u0010\u0015\u001a\u00020\u0016*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0017\u001a)\u0010\u0015\u001a\u00020\u0018*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00180\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0019\u001a\u0010\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b*\u00020\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"elementAt", "", "", "index", "", "max", "(Ljava/lang/CharSequence;)Ljava/lang/Character;", "maxBy", "R", "", "selector", "Lkotlin/Function1;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Character;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/lang/CharSequence;Ljava/util/Comparator;)Ljava/lang/Character;", "min", "minBy", "minWith", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "Ljava/math/BigInteger;", "sumOfBigInteger", "toSortedSet", "Ljava/util/SortedSet;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
class StringsKt___StringsJvmKt extends kotlin.text.StringsKt__StringsKt {
    public StringsKt___StringsJvmKt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final char elementAt(java.lang.CharSequence r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            char r0 = r1.charAt(r2)
            return r0
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Character max(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Character r0 = kotlin.text.StringsKt.maxOrNull(r1)
            return r0
    }

    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Character maxBy(java.lang.CharSequence r10, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends R> r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            r1 = r10
            r2 = 0
            int r3 = r1.length()
            r4 = 0
            if (r3 != 0) goto L16
            r3 = 1
            goto L17
        L16:
            r3 = r4
        L17:
            if (r3 == 0) goto L1b
            r3 = 0
            goto L58
        L1b:
            char r3 = r1.charAt(r4)
            int r4 = kotlin.text.StringsKt.getLastIndex(r1)
            if (r4 != 0) goto L2b
            java.lang.Character r5 = java.lang.Character.valueOf(r3)
            r3 = r5
            goto L58
        L2b:
            java.lang.Character r5 = java.lang.Character.valueOf(r3)
            java.lang.Object r5 = r11.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            r6 = 1
            if (r6 > r4) goto L53
        L38:
            char r7 = r1.charAt(r6)
            java.lang.Character r8 = java.lang.Character.valueOf(r7)
            java.lang.Object r8 = r11.invoke(r8)
            java.lang.Comparable r8 = (java.lang.Comparable) r8
            int r9 = r5.compareTo(r8)
            if (r9 >= 0) goto L4e
            r3 = r7
            r5 = r8
        L4e:
            if (r6 == r4) goto L53
            int r6 = r6 + 1
            goto L38
        L53:
            java.lang.Character r6 = java.lang.Character.valueOf(r3)
            r3 = r6
        L58:
            return r3
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Character maxWith(java.lang.CharSequence r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Character r0 = kotlin.text.StringsKt.maxWithOrNull(r1, r2)
            return r0
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Character min(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Character r0 = kotlin.text.StringsKt.minOrNull(r1)
            return r0
    }

    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends java.lang.Comparable<? super R>> java.lang.Character minBy(java.lang.CharSequence r10, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends R> r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            r1 = r10
            r2 = 0
            int r3 = r1.length()
            r4 = 0
            if (r3 != 0) goto L16
            r3 = 1
            goto L17
        L16:
            r3 = r4
        L17:
            if (r3 == 0) goto L1b
            r3 = 0
            goto L58
        L1b:
            char r3 = r1.charAt(r4)
            int r4 = kotlin.text.StringsKt.getLastIndex(r1)
            if (r4 != 0) goto L2b
            java.lang.Character r5 = java.lang.Character.valueOf(r3)
            r3 = r5
            goto L58
        L2b:
            java.lang.Character r5 = java.lang.Character.valueOf(r3)
            java.lang.Object r5 = r11.invoke(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            r6 = 1
            if (r6 > r4) goto L53
        L38:
            char r7 = r1.charAt(r6)
            java.lang.Character r8 = java.lang.Character.valueOf(r7)
            java.lang.Object r8 = r11.invoke(r8)
            java.lang.Comparable r8 = (java.lang.Comparable) r8
            int r9 = r5.compareTo(r8)
            if (r9 <= 0) goto L4e
            r3 = r7
            r5 = r8
        L4e:
            if (r6 == r4) goto L53
            int r6 = r6 + 1
            goto L38
        L53:
            java.lang.Character r6 = java.lang.Character.valueOf(r3)
            r3 = r6
        L58:
            return r3
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.lang.Character minWith(java.lang.CharSequence r1, java.util.Comparator r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Character r0 = kotlin.text.StringsKt.minWithOrNull(r1, r2)
            return r0
    }

    private static final java.math.BigDecimal sumOfBigDecimal(java.lang.CharSequence r5, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends java.math.BigDecimal> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 0
        L16:
            int r2 = r5.length()
            if (r1 >= r2) goto L37
            char r2 = r5.charAt(r1)
            java.lang.Character r3 = java.lang.Character.valueOf(r2)
            java.lang.Object r3 = r6.invoke(r3)
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigDecimal r3 = r0.add(r3)
            java.lang.String r4 = "add(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r0 = r3
            int r1 = r1 + 1
            goto L16
        L37:
            return r0
    }

    private static final java.math.BigInteger sumOfBigInteger(java.lang.CharSequence r5, kotlin.jvm.functions.Function1<? super java.lang.Character, ? extends java.math.BigInteger> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            java.lang.String r1 = "valueOf(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 0
        L16:
            int r2 = r5.length()
            if (r1 >= r2) goto L37
            char r2 = r5.charAt(r1)
            java.lang.Character r3 = java.lang.Character.valueOf(r2)
            java.lang.Object r3 = r6.invoke(r3)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r3 = r0.add(r3)
            java.lang.String r4 = "add(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r0 = r3
            int r1 = r1 + 1
            goto L16
        L37:
            return r0
    }

    public static final java.util.SortedSet<java.lang.Character> toSortedSet(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Collection r0 = kotlin.text.StringsKt.toCollection(r1, r0)
            java.util.SortedSet r0 = (java.util.SortedSet) r0
            return r0
    }
}
