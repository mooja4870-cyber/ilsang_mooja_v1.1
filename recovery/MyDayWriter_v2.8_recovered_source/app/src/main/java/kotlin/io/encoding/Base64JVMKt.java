package kotlin.io.encoding;

/* JADX INFO: compiled from: Base64JVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0081\b\u001a5\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0081\b\u001a%\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0081\b\u001a%\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0081\b¨\u0006\u000e"}, d2 = {"platformCharsToBytes", "", "Lkotlin/io/encoding/Base64;", "source", "", "startIndex", "", "endIndex", "platformEncodeIntoByteArray", "destination", "destinationOffset", "platformEncodeToByteArray", "platformEncodeToString", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Base64JVMKt {
    private static final byte[] platformCharsToBytes(kotlin.io.encoding.Base64 r3, java.lang.CharSequence r4, int r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L32
            int r0 = r4.length()
            r3.checkSourceBounds$kotlin_stdlib(r0, r5, r6)
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.substring(r5, r6)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.nio.charset.Charset r1 = kotlin.text.Charsets.ISO_8859_1
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r2)
            byte[] r0 = r0.getBytes(r1)
            java.lang.String r1 = "getBytes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            goto L36
        L32:
            byte[] r0 = r3.charsToBytesImpl$kotlin_stdlib(r4, r5, r6)
        L36:
            return r0
    }

    private static final int platformEncodeIntoByteArray(kotlin.io.encoding.Base64 r1, byte[] r2, byte[] r3, int r4, int r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r1.encodeIntoByteArrayImpl$kotlin_stdlib(r2, r3, r4, r5, r6)
            return r0
    }

    private static final byte[] platformEncodeToByteArray(kotlin.io.encoding.Base64 r1, byte[] r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r0 = r1.encodeToByteArrayImpl$kotlin_stdlib(r2, r3, r4)
            return r0
    }

    private static final java.lang.String platformEncodeToString(kotlin.io.encoding.Base64 r3, byte[] r4, int r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            byte[] r0 = r3.encodeToByteArrayImpl$kotlin_stdlib(r4, r5, r6)
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = kotlin.text.Charsets.ISO_8859_1
            r1.<init>(r0, r2)
            return r1
    }
}
