package androidx.core.text;

/* JADX INFO: compiled from: SpannedString.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b\u001a:\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u0004\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0006*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0086\b¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"toSpanned", "Landroid/text/Spanned;", "", "getSpans", "", "T", "", "start", "", "end", "(Landroid/text/Spanned;II)[Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SpannedStringKt {
    public static final /* synthetic */ <T> T[] getSpans(android.text.Spanned r3, int r4, int r5) {
            r0 = 0
            r1 = 4
            java.lang.String r2 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r1, r2)
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Object[] r1 = r3.getSpans(r4, r5, r1)
            return r1
    }

    public static /* synthetic */ java.lang.Object[] getSpans$default(android.text.Spanned r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 2
            if (r4 == 0) goto Ld
            int r3 = r1.length()
        Ld:
            r4 = 0
            r5 = 4
            java.lang.String r0 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r5, r0)
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r0 = r5
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Object[] r5 = r1.getSpans(r2, r3, r5)
            return r5
    }

    public static final android.text.Spanned toSpanned(java.lang.CharSequence r2) {
            r0 = 0
            android.text.SpannedString r1 = android.text.SpannedString.valueOf(r2)
            android.text.Spanned r1 = (android.text.Spanned) r1
            return r1
    }
}
