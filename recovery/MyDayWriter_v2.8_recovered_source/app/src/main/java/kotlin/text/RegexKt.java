package kotlin.text;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0082\b\u001a\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u0016\u0010\r\u001a\u0004\u0018\u00010\b*\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0002\u001a\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0002\u001a\u0012\u0010\u0012\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0002¨\u0006\u0014"}, d2 = {"fromInt", "", "T", "Lkotlin/text/FlagEnum;", "", "value", "", "findNext", "Lkotlin/text/MatchResult;", "Ljava/util/regex/Matcher;", "from", "input", "", "matchEntire", "range", "Lkotlin/ranges/IntRange;", "Ljava/util/regex/MatchResult;", "groupIndex", "toInt", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RegexKt {
    public static final /* synthetic */ kotlin.text.MatchResult access$findNext(java.util.regex.Matcher r1, int r2, java.lang.CharSequence r3) {
            kotlin.text.MatchResult r0 = findNext(r1, r2, r3)
            return r0
    }

    public static final /* synthetic */ kotlin.text.MatchResult access$matchEntire(java.util.regex.Matcher r1, java.lang.CharSequence r2) {
            kotlin.text.MatchResult r0 = matchEntire(r1, r2)
            return r0
    }

    public static final /* synthetic */ kotlin.ranges.IntRange access$range(java.util.regex.MatchResult r1) {
            kotlin.ranges.IntRange r0 = range(r1)
            return r0
    }

    public static final /* synthetic */ kotlin.ranges.IntRange access$range(java.util.regex.MatchResult r1, int r2) {
            kotlin.ranges.IntRange r0 = range(r1, r2)
            return r0
    }

    public static final /* synthetic */ int access$toInt(java.lang.Iterable r1) {
            int r0 = toInt(r1)
            return r0
    }

    private static final kotlin.text.MatchResult findNext(java.util.regex.Matcher r1, int r2, java.lang.CharSequence r3) {
            boolean r0 = r1.find(r2)
            if (r0 != 0) goto L8
            r0 = 0
            goto Lf
        L8:
            kotlin.text.MatcherMatchResult r0 = new kotlin.text.MatcherMatchResult
            r0.<init>(r1, r3)
            kotlin.text.MatchResult r0 = (kotlin.text.MatchResult) r0
        Lf:
            return r0
    }

    private static final /* synthetic */ <T extends java.lang.Enum<T> & kotlin.text.FlagEnum> java.util.Set<T> fromInt(int r6) {
            r0 = 0
            r1 = 4
            java.lang.String r2 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r1, r2)
            java.lang.Class<java.lang.Enum> r1 = java.lang.Enum.class
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            java.util.EnumSet r1 = java.util.EnumSet.allOf(r1)
            r2 = r1
            java.util.EnumSet r2 = (java.util.EnumSet) r2
            r3 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r4 = r2
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlin.text.RegexKt$fromInt$1$1 r5 = new kotlin.text.RegexKt$fromInt$1$1
            r5.<init>(r6)
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            kotlin.collections.CollectionsKt.retainAll(r4, r5)
            java.util.Set r1 = (java.util.Set) r1
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            java.lang.String r2 = "unmodifiableSet(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r2 = r1
            java.util.Set r2 = (java.util.Set) r2
            return r1
    }

    private static final kotlin.text.MatchResult matchEntire(java.util.regex.Matcher r1, java.lang.CharSequence r2) {
            boolean r0 = r1.matches()
            if (r0 != 0) goto L8
            r0 = 0
            goto Lf
        L8:
            kotlin.text.MatcherMatchResult r0 = new kotlin.text.MatcherMatchResult
            r0.<init>(r1, r2)
            kotlin.text.MatchResult r0 = (kotlin.text.MatchResult) r0
        Lf:
            return r0
    }

    private static final kotlin.ranges.IntRange range(java.util.regex.MatchResult r2) {
            int r0 = r2.start()
            int r1 = r2.end()
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r0, r1)
            return r0
    }

    private static final kotlin.ranges.IntRange range(java.util.regex.MatchResult r2, int r3) {
            int r0 = r2.start(r3)
            int r1 = r2.end(r3)
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r0, r1)
            return r0
    }

    private static final int toInt(java.lang.Iterable<? extends kotlin.text.FlagEnum> r10) {
            r0 = 0
            r1 = r10
            r2 = 0
            r3 = r0
            java.util.Iterator r4 = r1.iterator()
        L8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1f
            java.lang.Object r5 = r4.next()
            r6 = r5
            kotlin.text.FlagEnum r6 = (kotlin.text.FlagEnum) r6
            r7 = r3
            r8 = 0
            int r9 = r6.getValue()
            r6 = r7 | r9
            r3 = r6
            goto L8
        L1f:
            return r3
    }
}
