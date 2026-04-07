package kotlin.text;

/* JADX INFO: compiled from: CharJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0001\u001a\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001a\r\u0010\u000e\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0011\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0016\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0018\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u001a\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u001b\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\n\u0010\u001c\u001a\u00020\u000f*\u00020\u0002\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0014\u0010\u001d\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010!\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0014\u0010\"\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010#\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010$\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010%\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010&\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010'\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0014\u0010'\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010(\u001a\u00020\u0002*\u00020\u0002H\u0087\b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006)"}, d2 = {"category", "Lkotlin/text/CharCategory;", "", "getCategory", "(C)Lkotlin/text/CharCategory;", "directionality", "Lkotlin/text/CharDirectionality;", "getDirectionality", "(C)Lkotlin/text/CharDirectionality;", "checkRadix", "", "radix", "digitOf", "char", "isDefined", "", "isDigit", "isHighSurrogate", "isISOControl", "isIdentifierIgnorable", "isJavaIdentifierPart", "isJavaIdentifierStart", "isLetter", "isLetterOrDigit", "isLowSurrogate", "isLowerCase", "isTitleCase", "isUpperCase", "isWhitespace", "lowercase", "", "locale", "Ljava/util/Locale;", "lowercaseChar", "titlecase", "titlecaseChar", "toLowerCase", "toTitleCase", "toUpperCase", "uppercase", "uppercaseChar", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/CharsKt")
class CharsKt__CharJVMKt {
    public CharsKt__CharJVMKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final int checkRadix(int r5) {
            r0 = 0
            r1 = 2
            if (r1 > r5) goto L9
            r2 = 37
            if (r5 >= r2) goto L9
            r0 = 1
        L9:
            if (r0 == 0) goto Lc
            return r5
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "radix "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = " was not in valid range "
            java.lang.StringBuilder r2 = r2.append(r3)
            kotlin.ranges.IntRange r3 = new kotlin.ranges.IntRange
            r4 = 36
            r3.<init>(r1, r4)
            java.lang.StringBuilder r1 = r2.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final int digitOf(char r1, int r2) {
            int r0 = java.lang.Character.digit(r1, r2)
            return r0
    }

    public static final kotlin.text.CharCategory getCategory(char r2) {
            kotlin.text.CharCategory$Companion r0 = kotlin.text.CharCategory.Companion
            int r1 = java.lang.Character.getType(r2)
            kotlin.text.CharCategory r0 = r0.valueOf(r1)
            return r0
    }

    public static final kotlin.text.CharDirectionality getDirectionality(char r2) {
            kotlin.text.CharDirectionality$Companion r0 = kotlin.text.CharDirectionality.Companion
            byte r1 = java.lang.Character.getDirectionality(r2)
            kotlin.text.CharDirectionality r0 = r0.valueOf(r1)
            return r0
    }

    private static final boolean isDefined(char r1) {
            boolean r0 = java.lang.Character.isDefined(r1)
            return r0
    }

    private static final boolean isDigit(char r1) {
            boolean r0 = java.lang.Character.isDigit(r1)
            return r0
    }

    private static final boolean isHighSurrogate(char r1) {
            boolean r0 = java.lang.Character.isHighSurrogate(r1)
            return r0
    }

    private static final boolean isISOControl(char r1) {
            boolean r0 = java.lang.Character.isISOControl(r1)
            return r0
    }

    private static final boolean isIdentifierIgnorable(char r1) {
            boolean r0 = java.lang.Character.isIdentifierIgnorable(r1)
            return r0
    }

    private static final boolean isJavaIdentifierPart(char r1) {
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r1)
            return r0
    }

    private static final boolean isJavaIdentifierStart(char r1) {
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r1)
            return r0
    }

    private static final boolean isLetter(char r1) {
            boolean r0 = java.lang.Character.isLetter(r1)
            return r0
    }

    private static final boolean isLetterOrDigit(char r1) {
            boolean r0 = java.lang.Character.isLetterOrDigit(r1)
            return r0
    }

    private static final boolean isLowSurrogate(char r1) {
            boolean r0 = java.lang.Character.isLowSurrogate(r1)
            return r0
    }

    private static final boolean isLowerCase(char r1) {
            boolean r0 = java.lang.Character.isLowerCase(r1)
            return r0
    }

    private static final boolean isTitleCase(char r1) {
            boolean r0 = java.lang.Character.isTitleCase(r1)
            return r0
    }

    private static final boolean isUpperCase(char r1) {
            boolean r0 = java.lang.Character.isUpperCase(r1)
            return r0
    }

    public static final boolean isWhitespace(char r1) {
            boolean r0 = java.lang.Character.isWhitespace(r1)
            if (r0 != 0) goto Lf
            boolean r0 = java.lang.Character.isSpaceChar(r1)
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    private static final java.lang.String lowercase(char r2) {
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final java.lang.String lowercase(char r2, java.util.Locale r3) {
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.String r0 = r0.toLowerCase(r3)
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final char lowercaseChar(char r1) {
            char r0 = java.lang.Character.toLowerCase(r1)
            return r0
    }

    public static final java.lang.String titlecase(char r5, java.util.Locale r6) {
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = kotlin.text.CharsKt.uppercase(r5, r6)
            int r1 = r0.length()
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r3 = 1
            if (r1 <= r3) goto L49
            r1 = 329(0x149, float:4.61E-43)
            if (r5 != r1) goto L18
            r1 = r0
            goto L48
        L18:
            r1 = 0
            char r1 = r0.charAt(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r2)
            java.lang.String r3 = r0.substring(r3)
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r2)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r2 = r3.toLowerCase(r2)
            java.lang.String r3 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
        L48:
            return r1
        L49:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r2)
            java.lang.String r2 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r1 != 0) goto L62
            return r0
        L62:
            char r1 = java.lang.Character.toTitleCase(r5)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    private static final char titlecaseChar(char r1) {
            char r0 = java.lang.Character.toTitleCase(r1)
            return r0
    }

    @kotlin.Deprecated(message = "Use lowercaseChar() instead.", replaceWith = @kotlin.ReplaceWith(expression = "lowercaseChar()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    private static final char toLowerCase(char r1) {
            char r0 = java.lang.Character.toLowerCase(r1)
            return r0
    }

    @kotlin.Deprecated(message = "Use titlecaseChar() instead.", replaceWith = @kotlin.ReplaceWith(expression = "titlecaseChar()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    private static final char toTitleCase(char r1) {
            char r0 = java.lang.Character.toTitleCase(r1)
            return r0
    }

    @kotlin.Deprecated(message = "Use uppercaseChar() instead.", replaceWith = @kotlin.ReplaceWith(expression = "uppercaseChar()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    private static final char toUpperCase(char r1) {
            char r0 = java.lang.Character.toUpperCase(r1)
            return r0
    }

    private static final java.lang.String uppercase(char r2) {
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r1 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final java.lang.String uppercase(char r2, java.util.Locale r3) {
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.String r0 = r0.toUpperCase(r3)
            java.lang.String r1 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final char uppercaseChar(char r1) {
            char r0 = java.lang.Character.toUpperCase(r1)
            return r0
    }
}
