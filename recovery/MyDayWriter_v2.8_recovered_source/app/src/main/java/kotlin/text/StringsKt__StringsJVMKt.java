package kotlin.text;

/* JADX INFO: compiled from: StringsJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u0011\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0087\b\u001a\u0019\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a)\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a\f\u0010\u0017\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0014\u0010\u0017\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u001a\u0015\u0010\u001a\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0011H\u0087\b\u001a\u0015\u0010\u001c\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0011H\u0087\b\u001a\u001d\u0010\u001d\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a\u001c\u0010 \u001a\u00020\u0011*\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a\f\u0010$\u001a\u00020\u0002*\u00020\u0014H\u0007\u001a \u0010$\u001a\u00020\u0002*\u00020\u00142\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0007\u001a\u0019\u0010&\u001a\u00020#*\u0004\u0018\u00010'2\b\u0010!\u001a\u0004\u0018\u00010'H\u0087\u0004\u001a \u0010&\u001a\u00020#*\u0004\u0018\u00010'2\b\u0010!\u001a\u0004\u0018\u00010'2\u0006\u0010\"\u001a\u00020#H\u0007\u001a\u0015\u0010&\u001a\u00020#*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0087\b\u001a\u0015\u0010&\u001a\u00020#*\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0087\b\u001a\f\u0010)\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0014\u0010)\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u001a\f\u0010*\u001a\u00020\u0002*\u00020\rH\u0007\u001a*\u0010*\u001a\u00020\u0002*\u00020\r2\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020#H\u0007\u001a\f\u0010,\u001a\u00020\r*\u00020\u0002H\u0007\u001a*\u0010,\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020#H\u0007\u001a\u001c\u0010-\u001a\u00020#*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a \u0010/\u001a\u00020#*\u0004\u0018\u00010\u00022\b\u0010!\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a4\u00100\u001a\u00020\u0002*\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00104\u001a*\u00100\u001a\u00020\u0002*\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00105\u001a<\u00100\u001a\u00020\u0002*\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u00100\u001a\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00106\u001a2\u00100\u001a\u00020\u0002*\u00020\u00042\u0006\u00100\u001a\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00107\u001a\r\u00108\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u00109\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u00109\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\u001a\u001d\u0010:\u001a\u00020\u0011*\u00020\u00022\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010:\u001a\u00020\u0011*\u00020\u00022\u0006\u0010>\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010?\u001a\u00020\u0011*\u00020\u00022\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010?\u001a\u00020\u0011*\u00020\u00022\u0006\u0010>\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010@\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010A\u001a\u00020\u0011H\u0087\b\u001a4\u0010B\u001a\u00020#*\u00020'2\u0006\u0010C\u001a\u00020\u00112\u0006\u0010!\u001a\u00020'2\u0006\u0010D\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a4\u0010B\u001a\u00020#*\u00020\u00022\u0006\u0010C\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00022\u0006\u0010D\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a\u0012\u0010E\u001a\u00020\u0002*\u00020'2\u0006\u0010F\u001a\u00020\u0011\u001a$\u0010G\u001a\u00020\u0002*\u00020\u00022\u0006\u0010H\u001a\u00020<2\u0006\u0010I\u001a\u00020<2\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010G\u001a\u00020\u0002*\u00020\u00022\u0006\u0010J\u001a\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010L\u001a\u00020\u0002*\u00020\u00022\u0006\u0010H\u001a\u00020<2\u0006\u0010I\u001a\u00020<2\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010L\u001a\u00020\u0002*\u00020\u00022\u0006\u0010J\u001a\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a\"\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00020N*\u00020'2\u0006\u0010O\u001a\u00020P2\b\b\u0002\u0010Q\u001a\u00020\u0011\u001a\u001c\u0010R\u001a\u00020#*\u00020\u00022\u0006\u0010S\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010R\u001a\u00020#*\u00020\u00022\u0006\u0010S\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a\u0015\u0010T\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0011H\u0087\b\u001a\u001d\u0010T\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a\u0017\u0010U\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a\r\u0010V\u001a\u00020\u0014*\u00020\u0002H\u0087\b\u001a3\u0010V\u001a\u00020\u0014*\u00020\u00022\u0006\u0010W\u001a\u00020\u00142\b\b\u0002\u0010X\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a \u0010V\u001a\u00020\u0014*\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0007\u001a\r\u0010Y\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010Y\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\u001a\u0017\u0010Z\u001a\u00020P*\u00020\u00022\b\b\u0002\u0010[\u001a\u00020\u0011H\u0087\b\u001a\r\u0010\\\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010\\\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\u001a\r\u0010]\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010]\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\"%\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006^"}, d2 = {"CASE_INSENSITIVE_ORDER", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "Lkotlin/String$Companion;", "getCASE_INSENSITIVE_ORDER", "(Lkotlin/jvm/internal/StringCompanionObject;)Ljava/util/Comparator;", "String", "stringBuffer", "Ljava/lang/StringBuffer;", "stringBuilder", "Ljava/lang/StringBuilder;", "bytes", "", "charset", "Ljava/nio/charset/Charset;", "offset", "", "length", "chars", "", "codePoints", "", "capitalize", "locale", "Ljava/util/Locale;", "codePointAt", "index", "codePointBefore", "codePointCount", "beginIndex", "endIndex", "compareTo", "other", "ignoreCase", "", "concatToString", "startIndex", "contentEquals", "", "charSequence", "decapitalize", "decodeToString", "throwOnInvalidSequence", "encodeToByteArray", "endsWith", "suffix", "equals", "format", "args", "", "", "(Ljava/lang/String;Ljava/util/Locale;[Ljava/lang/Object;)Ljava/lang/String;", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "intern", "lowercase", "nativeIndexOf", "ch", "", "fromIndex", "str", "nativeLastIndexOf", "offsetByCodePoints", "codePointOffset", "regionMatches", "thisOffset", "otherOffset", "repeat", "n", "replace", "oldChar", "newChar", "oldValue", "newValue", "replaceFirst", "split", "", "regex", "Ljava/util/regex/Pattern;", "limit", "startsWith", "prefix", "substring", "toByteArray", "toCharArray", "destination", "destinationOffset", "toLowerCase", "toPattern", "flags", "toUpperCase", "uppercase", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
class StringsKt__StringsJVMKt extends kotlin.text.StringsKt__StringNumberConversionsKt {
    public StringsKt__StringsJVMKt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final java.lang.String String(java.lang.StringBuffer r1) {
            java.lang.String r0 = "stringBuffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }

    private static final java.lang.String String(java.lang.StringBuilder r1) {
            java.lang.String r0 = "stringBuilder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }

    private static final java.lang.String String(byte[] r2) {
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            r0.<init>(r2, r1)
            return r0
    }

    private static final java.lang.String String(byte[] r2, int r3, int r4) {
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    private static final java.lang.String String(byte[] r1, int r2, int r3, java.nio.charset.Charset r4) {
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    private static final java.lang.String String(byte[] r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2)
            return r0
    }

    private static final java.lang.String String(char[] r1) {
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }

    private static final java.lang.String String(char[] r1, int r2, int r3) {
            java.lang.String r0 = "chars"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r3)
            return r0
    }

    private static final java.lang.String String(int[] r1, int r2, int r3) {
            java.lang.String r0 = "codePoints"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final java.lang.String capitalize(java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = "getDefault(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r0 = kotlin.text.StringsKt.capitalize(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final java.lang.String capitalize(java.lang.String r9, java.util.Locale r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = r9
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L17
            r0 = r1
            goto L18
        L17:
            r0 = r2
        L18:
            if (r0 == 0) goto L68
            char r0 = r9.charAt(r2)
            boolean r3 = java.lang.Character.isLowerCase(r0)
            if (r3 == 0) goto L68
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = r3
            r5 = 0
            char r6 = java.lang.Character.toTitleCase(r0)
            char r7 = java.lang.Character.toUpperCase(r0)
            java.lang.String r8 = "substring(...)"
            if (r6 == r7) goto L3b
            r4.append(r6)
            goto L53
        L3b:
            java.lang.String r2 = r9.substring(r2, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r8)
            java.lang.String r7 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r7)
            java.lang.String r2 = r2.toUpperCase(r10)
            java.lang.String r7 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            r4.append(r2)
        L53:
            java.lang.String r1 = r9.substring(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r8)
            r4.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        L68:
            return r9
    }

    private static final int codePointAt(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.codePointAt(r2)
            return r0
    }

    private static final int codePointBefore(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.codePointBefore(r2)
            return r0
    }

    private static final int codePointCount(java.lang.String r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.codePointCount(r2, r3)
            return r0
    }

    public static final int compareTo(java.lang.String r1, java.lang.String r2, boolean r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r3 == 0) goto L11
            int r0 = r1.compareToIgnoreCase(r2)
            return r0
        L11:
            int r0 = r1.compareTo(r2)
            return r0
    }

    public static /* synthetic */ int compareTo$default(java.lang.String r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            int r0 = kotlin.text.StringsKt.compareTo(r0, r1, r2)
            return r0
    }

    public static final java.lang.String concatToString(char[] r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }

    public static final java.lang.String concatToString(char[] r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r2.length
            r0.checkBoundsIndexes$kotlin_stdlib(r3, r4, r1)
            java.lang.String r0 = new java.lang.String
            int r1 = r4 - r3
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String concatToString$default(char[] r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = r0.length
        La:
            java.lang.String r0 = kotlin.text.StringsKt.concatToString(r0, r1, r2)
            return r0
    }

    public static final boolean contentEquals(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto Le
            if (r2 == 0) goto Le
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.contentEquals(r2)
            goto L12
        Le:
            boolean r0 = kotlin.text.StringsKt.contentEqualsImpl(r1, r2)
        L12:
            return r0
    }

    public static final boolean contentEquals(java.lang.CharSequence r1, java.lang.CharSequence r2, boolean r3) {
            if (r3 == 0) goto L7
            boolean r0 = kotlin.text.StringsKt.contentEqualsIgnoreCaseImpl(r1, r2)
            goto Lb
        L7:
            boolean r0 = kotlin.text.StringsKt.contentEquals(r1, r2)
        Lb:
            return r0
    }

    private static final boolean contentEquals(java.lang.String r1, java.lang.CharSequence r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "charSequence"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.contentEquals(r2)
            return r0
    }

    private static final boolean contentEquals(java.lang.String r1, java.lang.StringBuffer r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "stringBuilder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.contentEquals(r2)
            return r0
    }

    @kotlin.Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final java.lang.String decapitalize(java.lang.String r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = r2
        L13:
            if (r0 == 0) goto L4f
            char r0 = r5.charAt(r2)
            boolean r0 = java.lang.Character.isLowerCase(r0)
            if (r0 != 0) goto L4f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r5.substring(r2, r1)
            java.lang.String r3 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r4)
            java.lang.String r2 = r2.toLowerCase()
            java.lang.String r4 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = r5.substring(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L50
        L4f:
            r0 = r5
        L50:
            return r0
    }

    @kotlin.Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final java.lang.String decapitalize(java.lang.String r5, java.util.Locale r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L17
            r0 = r1
            goto L18
        L17:
            r0 = r2
        L18:
            if (r0 == 0) goto L54
            char r0 = r5.charAt(r2)
            boolean r0 = java.lang.Character.isLowerCase(r0)
            if (r0 != 0) goto L54
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r5.substring(r2, r1)
            java.lang.String r3 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r4)
            java.lang.String r2 = r2.toLowerCase(r6)
            java.lang.String r4 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = r5.substring(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L55
        L54:
            r0 = r5
        L55:
            return r0
    }

    public static final java.lang.String decodeToString(byte[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            r0.<init>(r2, r1)
            return r0
    }

    public static final java.lang.String decodeToString(byte[] r3, int r4, int r5, boolean r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r3.length
            r0.checkBoundsIndexes$kotlin_stdlib(r4, r5, r1)
            if (r6 != 0) goto L17
            java.lang.String r0 = new java.lang.String
            int r1 = r5 - r4
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
            r0.<init>(r3, r4, r1, r2)
            return r0
        L17:
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            java.nio.charset.CharsetDecoder r0 = r0.newDecoder()
            java.nio.charset.CodingErrorAction r1 = java.nio.charset.CodingErrorAction.REPORT
            java.nio.charset.CharsetDecoder r0 = r0.onMalformedInput(r1)
            java.nio.charset.CodingErrorAction r1 = java.nio.charset.CodingErrorAction.REPORT
            java.nio.charset.CharsetDecoder r0 = r0.onUnmappableCharacter(r1)
            int r1 = r5 - r4
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r3, r4, r1)
            java.nio.CharBuffer r1 = r0.decode(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public static /* synthetic */ java.lang.String decodeToString$default(byte[] r1, int r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            r0 = 0
            if (r6 == 0) goto L6
            r2 = r0
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lb
            int r3 = r1.length
        Lb:
            r5 = r5 & 4
            if (r5 == 0) goto L10
            r4 = r0
        L10:
            java.lang.String r1 = kotlin.text.StringsKt.decodeToString(r1, r2, r3, r4)
            return r1
    }

    public static final byte[] encodeToByteArray(java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            byte[] r0 = r2.getBytes(r0)
            java.lang.String r1 = "getBytes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final byte[] encodeToByteArray(java.lang.String r5, int r6, int r7, boolean r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r5.length()
            r0.checkBoundsIndexes$kotlin_stdlib(r6, r7, r1)
            if (r8 != 0) goto L2a
            java.lang.String r0 = r5.substring(r6, r7)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r2)
            byte[] r0 = r0.getBytes(r1)
            java.lang.String r1 = "getBytes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        L2a:
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            java.nio.charset.CharsetEncoder r0 = r0.newEncoder()
            java.nio.charset.CodingErrorAction r1 = java.nio.charset.CodingErrorAction.REPORT
            java.nio.charset.CharsetEncoder r0 = r0.onMalformedInput(r1)
            java.nio.charset.CodingErrorAction r1 = java.nio.charset.CodingErrorAction.REPORT
            java.nio.charset.CharsetEncoder r0 = r0.onUnmappableCharacter(r1)
            r1 = r5
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.nio.CharBuffer r1 = java.nio.CharBuffer.wrap(r1, r6, r7)
            java.nio.ByteBuffer r1 = r0.encode(r1)
            boolean r2 = r1.hasArray()
            if (r2 == 0) goto L6a
            int r2 = r1.arrayOffset()
            if (r2 != 0) goto L6a
            int r2 = r1.remaining()
            byte[] r3 = r1.array()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r3 = r3.length
            if (r2 != r3) goto L6a
            byte[] r2 = r1.array()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            goto L75
        L6a:
            int r2 = r1.remaining()
            byte[] r2 = new byte[r2]
            r3 = r2
            r4 = 0
            r1.get(r3)
        L75:
            return r2
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(java.lang.String r1, int r2, int r3, boolean r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            r0 = 0
            if (r6 == 0) goto L6
            r2 = r0
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Le
            int r3 = r1.length()
        Le:
            r5 = r5 & 4
            if (r5 == 0) goto L13
            r4 = r0
        L13:
            byte[] r1 = kotlin.text.StringsKt.encodeToByteArray(r1, r2, r3, r4)
            return r1
    }

    public static final boolean endsWith(java.lang.String r8, java.lang.String r9, boolean r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            if (r10 != 0) goto L11
            boolean r0 = r8.endsWith(r9)
            return r0
        L11:
            int r0 = r8.length()
            int r1 = r9.length()
            int r3 = r0 - r1
            int r6 = r9.length()
            r7 = 1
            r5 = 0
            r2 = r8
            r4 = r9
            boolean r8 = kotlin.text.StringsKt.regionMatches(r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static /* synthetic */ boolean endsWith$default(java.lang.String r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = kotlin.text.StringsKt.endsWith(r0, r1, r2)
            return r0
    }

    public static final boolean equals(java.lang.String r1, java.lang.String r2, boolean r3) {
            if (r1 != 0) goto L8
            if (r2 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
        L8:
            if (r3 != 0) goto Lf
            boolean r0 = r1.equals(r2)
            goto L13
        Lf:
            boolean r0 = r1.equalsIgnoreCase(r2)
        L13:
            return r0
    }

    public static /* synthetic */ boolean equals$default(java.lang.String r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = kotlin.text.StringsKt.equals(r0, r1, r2)
            return r0
    }

    private static final java.lang.String format(java.lang.String r2, java.util.Locale r3, java.lang.Object... r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "args"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r0)
            java.lang.String r0 = java.lang.String.format(r3, r2, r0)
            java.lang.String r1 = "format(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.String format(java.lang.String r2, java.lang.Object... r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "args"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            java.lang.String r0 = java.lang.String.format(r2, r0)
            java.lang.String r1 = "format(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.String format(kotlin.jvm.internal.StringCompanionObject r2, java.lang.String r3, java.lang.Object... r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "args"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r0)
            java.lang.String r0 = java.lang.String.format(r3, r0)
            java.lang.String r1 = "format(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.String format(kotlin.jvm.internal.StringCompanionObject r2, java.util.Locale r3, java.lang.String r4, java.lang.Object... r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "args"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r0)
            java.lang.String r0 = java.lang.String.format(r3, r4, r0)
            java.lang.String r1 = "format(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final java.util.Comparator<java.lang.String> getCASE_INSENSITIVE_ORDER(kotlin.jvm.internal.StringCompanionObject r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Comparator r0 = java.lang.String.CASE_INSENSITIVE_ORDER
            java.lang.String r1 = "CASE_INSENSITIVE_ORDER"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.String intern(java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = r2.intern()
            java.lang.String r1 = "intern(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.String lowercase(java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r2.toLowerCase(r0)
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.String lowercase(java.lang.String r2, java.util.Locale r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = r2.toLowerCase(r3)
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final int nativeIndexOf(java.lang.String r1, char r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.indexOf(r2, r3)
            return r0
    }

    private static final int nativeIndexOf(java.lang.String r1, java.lang.String r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "str"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r1.indexOf(r2, r3)
            return r0
    }

    private static final int nativeLastIndexOf(java.lang.String r1, char r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.lastIndexOf(r2, r3)
            return r0
    }

    private static final int nativeLastIndexOf(java.lang.String r1, java.lang.String r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "str"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r1.lastIndexOf(r2, r3)
            return r0
    }

    private static final int offsetByCodePoints(java.lang.String r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.offsetByCodePoints(r2, r3)
            return r0
    }

    public static final boolean regionMatches(java.lang.CharSequence r7, int r8, java.lang.CharSequence r9, int r10, int r11, boolean r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L25
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L25
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
            r3 = r9
            java.lang.String r3 = (java.lang.String) r3
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            boolean r8 = kotlin.text.StringsKt.regionMatches(r1, r2, r3, r4, r5, r6)
            r1 = r2
            r3 = r4
            r4 = r5
            r5 = r6
            return r8
        L25:
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r0 = r7
            r2 = r9
            boolean r7 = kotlin.text.StringsKt.regionMatchesImpl(r0, r1, r2, r3, r4, r5)
            return r7
    }

    public static final boolean regionMatches(java.lang.String r2, int r3, java.lang.String r4, int r5, int r6, boolean r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            if (r7 != 0) goto L17
            boolean r0 = r2.regionMatches(r3, r4, r5, r6)
            r1 = r4
            r4 = r3
            r3 = r7
            r7 = r6
            r6 = r5
            r5 = r1
            goto L21
        L17:
            r1 = r4
            r4 = r3
            r3 = r7
            r7 = r6
            r6 = r5
            r5 = r1
            boolean r0 = r2.regionMatches(r3, r4, r5, r6, r7)
        L21:
            return r0
    }

    public static /* synthetic */ boolean regionMatches$default(java.lang.CharSequence r6, int r7, java.lang.CharSequence r8, int r9, int r10, boolean r11, int r12, java.lang.Object r13) {
            r12 = r12 & 16
            if (r12 == 0) goto L5
            r11 = 0
        L5:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r6 = kotlin.text.StringsKt.regionMatches(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static /* synthetic */ boolean regionMatches$default(java.lang.String r6, int r7, java.lang.String r8, int r9, int r10, boolean r11, int r12, java.lang.Object r13) {
            r12 = r12 & 16
            if (r12 == 0) goto L5
            r11 = 0
        L5:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r6 = kotlin.text.StringsKt.regionMatches(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static final java.lang.String repeat(java.lang.CharSequence r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            if (r5 < 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = r0
        Lb:
            if (r1 == 0) goto L54
            java.lang.String r1 = ""
            switch(r5) {
                case 0: goto L2c;
                case 1: goto L27;
                default: goto L12;
            }
        L12:
            int r2 = r4.length()
            switch(r2) {
                case 0: goto L42;
                case 1: goto L2d;
                default: goto L19;
            }
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length()
            int r1 = r1 * r5
            r0.<init>(r1)
            r1 = 1
            if (r1 > r5) goto L4b
            goto L43
        L27:
            java.lang.String r1 = r4.toString()
            goto L53
        L2c:
            goto L53
        L2d:
            char r1 = r4.charAt(r0)
            r2 = 0
            char[] r3 = new char[r5]
        L34:
            if (r0 >= r5) goto L3b
            r3[r0] = r1
            int r0 = r0 + 1
            goto L34
        L3b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            r1 = r0
            goto L53
        L42:
            goto L53
        L43:
            r0.append(r4)
            if (r1 == r5) goto L4b
            int r1 = r1 + 1
            goto L43
        L4b:
            java.lang.String r1 = r0.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
        L53:
            return r1
        L54:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Count 'n' must be non-negative, but was "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            r2 = 46
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static final java.lang.String replace(java.lang.String r10, char r11, char r12, boolean r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            if (r13 != 0) goto L11
            java.lang.String r0 = r10.replace(r11, r12)
            java.lang.String r1 = "replace(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        L11:
            int r0 = r10.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = r1
            r2 = 0
            r3 = r10
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = 0
            r5 = 0
        L21:
            int r6 = r3.length()
            if (r5 >= r6) goto L3e
            char r6 = r3.charAt(r5)
            r7 = r6
            r8 = 0
            boolean r9 = kotlin.text.CharsKt.equals(r7, r11, r13)
            if (r9 == 0) goto L35
            r9 = r12
            goto L36
        L35:
            r9 = r7
        L36:
            r0.append(r9)
            int r5 = r5 + 1
            goto L21
        L3e:
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final java.lang.String replace(java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "oldValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "newValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = r10
            r1 = 0
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = 0
            int r2 = kotlin.text.StringsKt.indexOf(r2, r11, r3, r13)
            if (r2 >= 0) goto L1c
            return r0
        L1c:
            int r3 = r11.length()
            r4 = 1
            int r4 = kotlin.ranges.RangesKt.coerceAtLeast(r3, r4)
            int r5 = r0.length()
            int r5 = r5 - r3
            int r6 = r12.length()
            int r5 = r5 + r6
            if (r5 < 0) goto L69
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r7 = 0
        L37:
            r8 = r0
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.StringBuilder r8 = r6.append(r8, r7, r2)
            r8.append(r12)
            int r7 = r2 + r3
            int r8 = r0.length()
            if (r2 >= r8) goto L54
            r8 = r0
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            int r9 = r2 + r4
            int r2 = kotlin.text.StringsKt.indexOf(r8, r11, r9, r13)
            if (r2 > 0) goto L37
        L54:
            r8 = r0
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            int r9 = r0.length()
            java.lang.StringBuilder r8 = r6.append(r8, r7, r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            return r8
        L69:
            java.lang.OutOfMemoryError r6 = new java.lang.OutOfMemoryError
            r6.<init>()
            throw r6
    }

    public static /* synthetic */ java.lang.String replace$default(java.lang.String r0, char r1, char r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = kotlin.text.StringsKt.replace(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String replace$default(java.lang.String r0, java.lang.String r1, java.lang.String r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = kotlin.text.StringsKt.replace(r0, r1, r2, r3)
            return r0
    }

    public static final java.lang.String replaceFirst(java.lang.String r7, char r8, char r9, boolean r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r1 = r7
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r5 = 2
            r6 = 0
            r3 = 0
            r2 = r8
            r4 = r10
            int r8 = kotlin.text.StringsKt.indexOf$default(r1, r2, r3, r4, r5, r6)
            if (r8 >= 0) goto L15
            r10 = r7
            goto L28
        L15:
            int r10 = r8 + 1
            java.lang.String r0 = java.lang.String.valueOf(r9)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = r7
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r10 = kotlin.text.StringsKt.replaceRange(r1, r8, r10, r0)
            java.lang.String r10 = r10.toString()
        L28:
            return r10
    }

    public static final java.lang.String replaceFirst(java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "oldValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "newValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r1 = r7
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r5 = 2
            r6 = 0
            r3 = 0
            r2 = r8
            r4 = r10
            int r8 = kotlin.text.StringsKt.indexOf$default(r1, r2, r3, r4, r5, r6)
            if (r8 >= 0) goto L1f
            r10 = r7
            goto L32
        L1f:
            int r10 = r2.length()
            int r10 = r10 + r8
            r0 = r7
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = r9
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r10 = kotlin.text.StringsKt.replaceRange(r0, r8, r10, r1)
            java.lang.String r10 = r10.toString()
        L32:
            return r10
    }

    public static /* synthetic */ java.lang.String replaceFirst$default(java.lang.String r0, char r1, char r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = kotlin.text.StringsKt.replaceFirst(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String replaceFirst$default(java.lang.String r0, java.lang.String r1, java.lang.String r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = kotlin.text.StringsKt.replaceFirst(r0, r1, r2, r3)
            return r0
    }

    public static final java.util.List<java.lang.String> split(java.lang.CharSequence r2, java.util.regex.Pattern r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "regex"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.text.StringsKt.requireNonNegativeLimit(r4)
            if (r4 != 0) goto L11
            r0 = -1
            goto L12
        L11:
            r0 = r4
        L12:
            java.lang.String[] r0 = r3.split(r2, r0)
            java.lang.String r1 = "split(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.List r0 = kotlin.collections.ArraysKt.asList(r0)
            return r0
    }

    public static /* synthetic */ java.util.List split$default(java.lang.CharSequence r0, java.util.regex.Pattern r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.util.List r0 = kotlin.text.StringsKt.split(r0, r1, r2)
            return r0
    }

    public static final boolean startsWith(java.lang.String r7, java.lang.String r8, int r9, boolean r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            if (r10 != 0) goto L11
            boolean r0 = r7.startsWith(r8, r9)
            return r0
        L11:
            r4 = 0
            int r5 = r8.length()
            r1 = r7
            r3 = r8
            r2 = r9
            r6 = r10
            boolean r7 = kotlin.text.StringsKt.regionMatches(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static final boolean startsWith(java.lang.String r7, java.lang.String r8, boolean r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            if (r9 != 0) goto L11
            boolean r0 = r7.startsWith(r8)
            return r0
        L11:
            r4 = 0
            int r5 = r8.length()
            r2 = 0
            r1 = r7
            r3 = r8
            r6 = r9
            boolean r7 = kotlin.text.StringsKt.regionMatches(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static /* synthetic */ boolean startsWith$default(java.lang.String r0, java.lang.String r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            boolean r0 = kotlin.text.StringsKt.startsWith(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ boolean startsWith$default(java.lang.String r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = kotlin.text.StringsKt.startsWith(r0, r1, r2)
            return r0
    }

    private static final java.lang.String substring(java.lang.String r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = r2.substring(r3)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.String substring(java.lang.String r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = r2.substring(r3, r4)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final byte[] toByteArray(java.lang.String r2, java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            byte[] r0 = r2.getBytes(r3)
            java.lang.String r1 = "getBytes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    static /* synthetic */ byte[] toByteArray$default(java.lang.String r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            byte[] r2 = r0.getBytes(r1)
            java.lang.String r3 = "getBytes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    private static final char[] toCharArray(java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            char[] r0 = r2.toCharArray()
            java.lang.String r1 = "toCharArray(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final char[] toCharArray(java.lang.String r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r2.length()
            r0.checkBoundsIndexes$kotlin_stdlib(r3, r4, r1)
            int r0 = r4 - r3
            char[] r0 = new char[r0]
            r1 = 0
            r2.getChars(r3, r4, r0, r1)
            return r0
    }

    private static final char[] toCharArray(java.lang.String r1, char[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.getChars(r4, r5, r2, r3)
            return r2
    }

    public static /* synthetic */ char[] toCharArray$default(java.lang.String r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            char[] r0 = kotlin.text.StringsKt.toCharArray(r0, r1, r2)
            return r0
    }

    static /* synthetic */ char[] toCharArray$default(java.lang.String r0, char[] r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L5
            r2 = 0
        L5:
            r6 = r5 & 4
            if (r6 == 0) goto La
            r3 = 0
        La:
            r5 = r5 & 8
            if (r5 == 0) goto L12
            int r4 = r0.length()
        L12:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            java.lang.String r5 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            r0.getChars(r3, r4, r1, r2)
            return r1
    }

    @kotlin.Deprecated(message = "Use lowercase() instead.", replaceWith = @kotlin.ReplaceWith(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    private static final java.lang.String toLowerCase(java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = r2.toLowerCase()
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.Deprecated(message = "Use lowercase() instead.", replaceWith = @kotlin.ReplaceWith(expression = "lowercase(locale)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    private static final java.lang.String toLowerCase(java.lang.String r2, java.util.Locale r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = r2.toLowerCase(r3)
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.util.regex.Pattern toPattern(java.lang.String r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r1 = "compile(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    static /* synthetic */ java.util.regex.Pattern toPattern$default(java.lang.String r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r0, r1)
            java.lang.String r3 = "compile(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    @kotlin.Deprecated(message = "Use uppercase() instead.", replaceWith = @kotlin.ReplaceWith(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    private static final java.lang.String toUpperCase(java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = r2.toUpperCase()
            java.lang.String r1 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.Deprecated(message = "Use uppercase() instead.", replaceWith = @kotlin.ReplaceWith(expression = "uppercase(locale)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    private static final java.lang.String toUpperCase(java.lang.String r2, java.util.Locale r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = r2.toUpperCase(r3)
            java.lang.String r1 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.String uppercase(java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r2.toUpperCase(r0)
            java.lang.String r1 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.String uppercase(java.lang.String r2, java.util.Locale r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = r2.toUpperCase(r3)
            java.lang.String r1 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
