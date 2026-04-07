package kotlin.text;

/* JADX INFO: compiled from: _OneToManyTitlecaseMappings.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\f\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"titlecaseImpl", "", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class _OneToManyTitlecaseMappingsKt {
    public static final java.lang.String titlecaseImpl(char r5) {
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r2)
            java.lang.String r2 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r2 = r0.length()
            r3 = 1
            if (r2 <= r3) goto L52
            r2 = 329(0x149, float:4.61E-43)
            if (r5 != r2) goto L21
            r1 = r0
            goto L51
        L21:
            r2 = 0
            char r2 = r0.charAt(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.String r3 = r0.substring(r3)
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r3.toLowerCase(r1)
            java.lang.String r3 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
        L51:
            return r1
        L52:
            char r1 = java.lang.Character.toTitleCase(r5)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }
}
