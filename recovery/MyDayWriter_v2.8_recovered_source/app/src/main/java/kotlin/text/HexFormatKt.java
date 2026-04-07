package kotlin.text;

/* JADX INFO: compiled from: HexFormat.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"HexFormat", "Lkotlin/text/HexFormat;", "builderAction", "Lkotlin/Function1;", "Lkotlin/text/HexFormat$Builder;", "", "Lkotlin/ExtensionFunctionType;", "isCaseSensitive", "", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class HexFormatKt {
    private static final kotlin.text.HexFormat HexFormat(kotlin.jvm.functions.Function1<? super kotlin.text.HexFormat.Builder, kotlin.Unit> r1) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.text.HexFormat$Builder r0 = new kotlin.text.HexFormat$Builder
            r0.<init>()
            r1.invoke(r0)
            kotlin.text.HexFormat r0 = r0.build()
            return r0
    }

    public static final /* synthetic */ boolean access$isCaseSensitive(java.lang.String r1) {
            boolean r0 = isCaseSensitive(r1)
            return r0
    }

    private static final boolean isCaseSensitive(java.lang.String r9) {
            r0 = r9
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            r2 = 0
            r3 = r2
        L6:
            int r4 = r0.length()
            if (r3 >= r4) goto L2c
            char r4 = r0.charAt(r3)
            r5 = r4
            r6 = 0
            r7 = 128(0x80, float:1.8E-43)
            int r7 = kotlin.jvm.internal.Intrinsics.compare(r5, r7)
            r8 = 1
            if (r7 >= 0) goto L24
            boolean r7 = java.lang.Character.isLetter(r5)
            if (r7 == 0) goto L22
            goto L24
        L22:
            r5 = r2
            goto L25
        L24:
            r5 = r8
        L25:
            if (r5 == 0) goto L29
            r2 = r8
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L6
        L2c:
        L2d:
            return r2
    }
}
