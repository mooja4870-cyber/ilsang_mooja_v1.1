package kotlin.text;

/* JADX INFO: compiled from: Charsets.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0010\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlin/text/Charsets;", "", "()V", "ISO_8859_1", "Ljava/nio/charset/Charset;", "US_ASCII", "UTF_16", "UTF_16BE", "UTF_16LE", "UTF_32", "UTF32", "()Ljava/nio/charset/Charset;", "UTF_32BE", "UTF32_BE", "UTF_32LE", "UTF32_LE", "UTF_8", "utf_32", "utf_32be", "utf_32le", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Charsets {
    public static final kotlin.text.Charsets INSTANCE = null;
    public static final java.nio.charset.Charset ISO_8859_1 = null;
    public static final java.nio.charset.Charset US_ASCII = null;
    public static final java.nio.charset.Charset UTF_16 = null;
    public static final java.nio.charset.Charset UTF_16BE = null;
    public static final java.nio.charset.Charset UTF_16LE = null;
    public static final java.nio.charset.Charset UTF_8 = null;
    private static volatile java.nio.charset.Charset utf_32;
    private static volatile java.nio.charset.Charset utf_32be;
    private static volatile java.nio.charset.Charset utf_32le;

    static {
            kotlin.text.Charsets r0 = new kotlin.text.Charsets
            r0.<init>()
            kotlin.text.Charsets.INSTANCE = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r1 = "forName(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.text.Charsets.UTF_8 = r0
            java.lang.String r0 = "UTF-16"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.text.Charsets.UTF_16 = r0
            java.lang.String r0 = "UTF-16BE"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.text.Charsets.UTF_16BE = r0
            java.lang.String r0 = "UTF-16LE"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.text.Charsets.UTF_16LE = r0
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.text.Charsets.US_ASCII = r0
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.text.Charsets.ISO_8859_1 = r0
            return
    }

    private Charsets() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.nio.charset.Charset UTF32() {
            r4 = this;
            java.nio.charset.Charset r0 = kotlin.text.Charsets.utf_32
            if (r0 != 0) goto L17
            r0 = r4
            kotlin.text.Charsets r0 = (kotlin.text.Charsets) r0
            r1 = 0
            java.lang.String r2 = "UTF-32"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            java.lang.String r3 = "forName(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            kotlin.text.Charsets.utf_32 = r2
            r0 = r2
        L17:
            return r0
    }

    public final java.nio.charset.Charset UTF32_BE() {
            r4 = this;
            java.nio.charset.Charset r0 = kotlin.text.Charsets.utf_32be
            if (r0 != 0) goto L17
            r0 = r4
            kotlin.text.Charsets r0 = (kotlin.text.Charsets) r0
            r1 = 0
            java.lang.String r2 = "UTF-32BE"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            java.lang.String r3 = "forName(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            kotlin.text.Charsets.utf_32be = r2
            r0 = r2
        L17:
            return r0
    }

    public final java.nio.charset.Charset UTF32_LE() {
            r4 = this;
            java.nio.charset.Charset r0 = kotlin.text.Charsets.utf_32le
            if (r0 != 0) goto L17
            r0 = r4
            kotlin.text.Charsets r0 = (kotlin.text.Charsets) r0
            r1 = 0
            java.lang.String r2 = "UTF-32LE"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            java.lang.String r3 = "forName(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            kotlin.text.Charsets.utf_32le = r2
            r0 = r2
        L17:
            return r0
    }
}
