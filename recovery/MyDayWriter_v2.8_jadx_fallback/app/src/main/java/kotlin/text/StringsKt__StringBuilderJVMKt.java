package kotlin.text;

/* JADX INFO: compiled from: StringBuilderJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u001f\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007H\u0087\b\u001a\u001d\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001d\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u001d\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\tH\u0087\b\u001a\u001d\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\nH\u0087\b\u001a\u001d\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u000bH\u0087\b\u001a\u001d\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a%\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u000e\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0087\b\u001a-\u0010\f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0087\b\u001a-\u0010\f\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0087\b\u001a\u0014\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013*\u00060\u0012j\u0002`\u0013H\u0007\u001a\u001d\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0003\u001a\u00020\u0014H\u0087\b\u001a\u001f\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013*\u00060\u0012j\u0002`\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010H\u0087\b\u001a\u0014\u0010\u0011\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u0002H\u0007\u001a\u001f\u0010\u0011\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007H\u0087\b\u001a\u001f\u0010\u0011\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015H\u0087\b\u001a\u001d\u0010\u0011\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0016H\u0087\b\u001a\u001d\u0010\u0011\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001d\u0010\u0011\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0014H\u0087\b\u001a\u001d\u0010\u0011\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\rH\u0087\b\u001a\u001f\u0010\u0011\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010H\u0087\b\u001a\u001d\u0010\u0011\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u001d\u0010\u0011\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\tH\u0087\b\u001a\u001d\u0010\u0011\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\nH\u0087\b\u001a\u001d\u0010\u0011\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u000bH\u0087\b\u001a\u001d\u0010\u0011\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u001f\u0010\u0011\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0017H\u0087\b\u001a%\u0010\u0011\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u000e\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0087\b\u001a\u0014\u0010\u0018\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u0002H\u0007\u001a\u001d\u0010\u0019\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u001a\u001a\u00020\nH\u0087\b\u001a%\u0010\u001b\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0087\b\u001a%\u0010\u001c\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a%\u0010\u001c\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a5\u0010\u001d\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0087\b\u001a5\u0010\u001d\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0087\b\u001a!\u0010\u001e\u001a\u00020\u001f*\u00060\u0001j\u0002`\u00022\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0014H\u0087\n\u001a-\u0010 \u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0017H\u0087\b\u001a7\u0010!\u001a\u00020\u001f*\u00060\u0001j\u0002`\u00022\u0006\u0010\"\u001a\u00020\r2\b\b\u0002\u0010#\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\nH\u0087\b¨\u0006$"}, d2 = {"append", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "value", "", "", "appendLine", "Ljava/lang/StringBuffer;", "", "", "", "", "appendRange", "", "startIndex", "endIndex", "", "appendln", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "", "", "", "clear", "deleteAt", "index", "deleteRange", "insert", "insertRange", "set", "", "setRange", "toCharArray", "destination", "destinationOffset", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
class StringsKt__StringBuilderJVMKt extends kotlin.text.StringsKt__RegexExtensionsKt {
    public StringsKt__StringBuilderJVMKt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final java.lang.StringBuilder append(java.lang.StringBuilder r2, byte r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = r2.append(r3)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.StringBuilder append(java.lang.StringBuilder r2, short r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = r2.append(r3)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder r3, byte r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.StringBuilder r0 = r3.append(r4)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2 = 10
            java.lang.StringBuilder r0 = r0.append(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder r3, double r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.StringBuilder r0 = r3.append(r4)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2 = 10
            java.lang.StringBuilder r0 = r0.append(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder r3, float r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.StringBuilder r0 = r3.append(r4)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2 = 10
            java.lang.StringBuilder r0 = r0.append(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.StringBuilder r0 = r3.append(r4)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2 = 10
            java.lang.StringBuilder r0 = r0.append(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder r3, long r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.StringBuilder r0 = r3.append(r4)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2 = 10
            java.lang.StringBuilder r0 = r0.append(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder r3, java.lang.StringBuffer r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.StringBuilder r0 = r3.append(r4)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2 = 10
            java.lang.StringBuilder r0 = r0.append(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder r3, java.lang.StringBuilder r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2 = 10
            java.lang.StringBuilder r0 = r0.append(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder r3, short r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.StringBuilder r0 = r3.append(r4)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2 = 10
            java.lang.StringBuilder r0 = r0.append(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.StringBuilder appendRange(java.lang.StringBuilder r2, java.lang.CharSequence r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.StringBuilder r0 = r2.append(r3, r4, r5)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.StringBuilder appendRange(java.lang.StringBuilder r2, char[] r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r5 - r4
            java.lang.StringBuilder r0 = r2.append(r3, r4, r0)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine()", imports = {}))
    public static final java.lang.Appendable appendln(java.lang.Appendable r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = kotlin.text.SystemProperties.LINE_SEPARATOR
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.Appendable r0 = r2.append(r0)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.Appendable appendln(java.lang.Appendable r2, char r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Appendable r0 = r2.append(r3)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Appendable r0 = kotlin.text.StringsKt.appendln(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.Appendable appendln(java.lang.Appendable r2, java.lang.CharSequence r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Appendable r0 = r2.append(r3)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Appendable r0 = kotlin.text.StringsKt.appendln(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine()", imports = {}))
    public static final java.lang.StringBuilder appendln(java.lang.StringBuilder r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = kotlin.text.SystemProperties.LINE_SEPARATOR
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder r2, byte r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = r2.append(r3)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r0 = kotlin.text.StringsKt.appendln(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder r2, char r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = r2.append(r3)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r0 = kotlin.text.StringsKt.appendln(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder r2, double r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = r2.append(r3)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r0 = kotlin.text.StringsKt.appendln(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder r2, float r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = r2.append(r3)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r0 = kotlin.text.StringsKt.appendln(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = r2.append(r3)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r0 = kotlin.text.StringsKt.appendln(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder r2, long r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = r2.append(r3)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r0 = kotlin.text.StringsKt.appendln(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder r2, java.lang.CharSequence r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = r2.append(r3)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r0 = kotlin.text.StringsKt.appendln(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder r2, java.lang.Object r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = r2.append(r3)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r0 = kotlin.text.StringsKt.appendln(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder r2, java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = r2.append(r3)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r0 = kotlin.text.StringsKt.appendln(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder r2, java.lang.StringBuffer r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = r2.append(r3)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r0 = kotlin.text.StringsKt.appendln(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder r2, java.lang.StringBuilder r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r0 = kotlin.text.StringsKt.appendln(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder r2, short r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = r2.append(r3)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r0 = kotlin.text.StringsKt.appendln(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder r2, boolean r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = r2.append(r3)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r0 = kotlin.text.StringsKt.appendln(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder r2, char[] r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.StringBuilder r0 = r2.append(r3)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r0 = kotlin.text.StringsKt.appendln(r0)
            return r0
    }

    public static final java.lang.StringBuilder clear(java.lang.StringBuilder r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r3
            r1 = 0
            r2 = 0
            r0.setLength(r2)
            return r3
    }

    private static final java.lang.StringBuilder deleteAt(java.lang.StringBuilder r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = r2.deleteCharAt(r3)
            java.lang.String r1 = "deleteCharAt(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.StringBuilder deleteRange(java.lang.StringBuilder r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = r2.delete(r3, r4)
            java.lang.String r1 = "delete(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.StringBuilder insert(java.lang.StringBuilder r2, int r3, byte r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = r2.insert(r3, r4)
            java.lang.String r1 = "insert(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.StringBuilder insert(java.lang.StringBuilder r2, int r3, short r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = r2.insert(r3, r4)
            java.lang.String r1 = "insert(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.StringBuilder insertRange(java.lang.StringBuilder r2, int r3, java.lang.CharSequence r4, int r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.StringBuilder r0 = r2.insert(r3, r4, r5, r6)
            java.lang.String r1 = "insert(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.lang.StringBuilder insertRange(java.lang.StringBuilder r2, int r3, char[] r4, int r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r6 - r5
            java.lang.StringBuilder r0 = r2.insert(r3, r4, r5, r0)
            java.lang.String r1 = "insert(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final void set(java.lang.StringBuilder r1, int r2, char r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.setCharAt(r2, r3)
            return
    }

    private static final java.lang.StringBuilder setRange(java.lang.StringBuilder r2, int r3, int r4, java.lang.String r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.StringBuilder r0 = r2.replace(r3, r4, r5)
            java.lang.String r1 = "replace(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final void toCharArray(java.lang.StringBuilder r1, char[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.getChars(r4, r5, r2, r3)
            return
    }

    static /* synthetic */ void toCharArray$default(java.lang.StringBuilder r0, char[] r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
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
            return
    }
}
