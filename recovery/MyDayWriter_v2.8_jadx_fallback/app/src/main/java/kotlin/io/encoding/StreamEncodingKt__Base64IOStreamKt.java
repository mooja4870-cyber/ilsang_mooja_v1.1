package kotlin.io.encoding;

/* JADX INFO: compiled from: Base64IOStream.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0006"}, d2 = {"decodingWith", "Ljava/io/InputStream;", "base64", "Lkotlin/io/encoding/Base64;", "encodingWith", "Ljava/io/OutputStream;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/encoding/StreamEncodingKt")
class StreamEncodingKt__Base64IOStreamKt {
    public StreamEncodingKt__Base64IOStreamKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final java.io.InputStream decodingWith(java.io.InputStream r1, kotlin.io.encoding.Base64 r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "base64"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.io.encoding.DecodeInputStream r0 = new kotlin.io.encoding.DecodeInputStream
            r0.<init>(r1, r2)
            java.io.InputStream r0 = (java.io.InputStream) r0
            return r0
    }

    public static final java.io.OutputStream encodingWith(java.io.OutputStream r1, kotlin.io.encoding.Base64 r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "base64"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.io.encoding.EncodeOutputStream r0 = new kotlin.io.encoding.EncodeOutputStream
            r0.<init>(r1, r2)
            java.io.OutputStream r0 = (java.io.OutputStream) r0
            return r0
    }
}
