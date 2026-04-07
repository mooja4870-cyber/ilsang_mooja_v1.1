package kotlin.io;

/* JADX INFO: compiled from: Console.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\u0010\u0010#\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lkotlin/io/LineReader;", "", "()V", "BUFFER_SIZE", "", "byteBuf", "Ljava/nio/ByteBuffer;", "bytes", "", "charBuf", "Ljava/nio/CharBuffer;", "chars", "", "decoder", "Ljava/nio/charset/CharsetDecoder;", "directEOL", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "compactBytes", "decode", "endOfInput", "decodeEndOfInput", "nBytes", "nChars", "readLine", "", "inputStream", "Ljava/io/InputStream;", "charset", "Ljava/nio/charset/Charset;", "resetAll", "", "trimStringBuilder", "updateCharset", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LineReader {
    private static final int BUFFER_SIZE = 32;
    public static final kotlin.io.LineReader INSTANCE = null;
    private static final java.nio.ByteBuffer byteBuf = null;
    private static final byte[] bytes = null;
    private static final java.nio.CharBuffer charBuf = null;
    private static final char[] chars = null;
    private static java.nio.charset.CharsetDecoder decoder;
    private static boolean directEOL;
    private static final java.lang.StringBuilder sb = null;

    static {
            kotlin.io.LineReader r0 = new kotlin.io.LineReader
            r0.<init>()
            kotlin.io.LineReader.INSTANCE = r0
            r0 = 32
            byte[] r1 = new byte[r0]
            kotlin.io.LineReader.bytes = r1
            char[] r0 = new char[r0]
            kotlin.io.LineReader.chars = r0
            byte[] r0 = kotlin.io.LineReader.bytes
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.lang.String r1 = "wrap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.io.LineReader.byteBuf = r0
            char[] r0 = kotlin.io.LineReader.chars
            java.nio.CharBuffer r0 = java.nio.CharBuffer.wrap(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.io.LineReader.charBuf = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.io.LineReader.sb = r0
            return
    }

    private LineReader() {
            r0 = this;
            r0.<init>()
            return
    }

    private final int compactBytes() {
            r6 = this;
            java.nio.ByteBuffer r0 = kotlin.io.LineReader.byteBuf
            r1 = 0
            r0.compact()
            int r2 = r0.position()
            r3 = r2
            r4 = 0
            r5 = 0
            r0.position(r5)
            return r2
    }

    private final int decode(boolean r7) {
            r6 = this;
        L1:
            java.nio.charset.CharsetDecoder r0 = kotlin.io.LineReader.decoder
            if (r0 != 0) goto Lc
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
        Lc:
            java.nio.ByteBuffer r1 = kotlin.io.LineReader.byteBuf
            java.nio.CharBuffer r2 = kotlin.io.LineReader.charBuf
            java.nio.charset.CoderResult r0 = r0.decode(r1, r2, r7)
            java.lang.String r1 = "decode(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r1 = r0.isError()
            if (r1 == 0) goto L25
            r6.resetAll()
            r0.throwException()
        L25:
            java.nio.CharBuffer r1 = kotlin.io.LineReader.charBuf
            int r1 = r1.position()
            boolean r2 = r0.isOverflow()
            if (r2 != 0) goto L32
            return r1
        L32:
            java.lang.StringBuilder r2 = kotlin.io.LineReader.sb
            char[] r3 = kotlin.io.LineReader.chars
            int r4 = r1 + (-1)
            r5 = 0
            r2.append(r3, r5, r4)
            java.nio.CharBuffer r2 = kotlin.io.LineReader.charBuf
            r2.position(r5)
            java.nio.CharBuffer r2 = kotlin.io.LineReader.charBuf
            r3 = 32
            r2.limit(r3)
            java.nio.CharBuffer r2 = kotlin.io.LineReader.charBuf
            char[] r3 = kotlin.io.LineReader.chars
            int r4 = r1 + (-1)
            char r3 = r3[r4]
            r2.put(r3)
            goto L1
    }

    private final int decodeEndOfInput(int r6, int r7) {
            r5 = this;
            java.nio.ByteBuffer r0 = kotlin.io.LineReader.byteBuf
            r0.limit(r6)
            java.nio.CharBuffer r0 = kotlin.io.LineReader.charBuf
            r0.position(r7)
            r0 = 1
            int r0 = r5.decode(r0)
            r1 = r0
            r2 = 0
            java.nio.charset.CharsetDecoder r3 = kotlin.io.LineReader.decoder
            if (r3 != 0) goto L1b
            java.lang.String r3 = "decoder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r3 = 0
        L1b:
            r3.reset()
            java.nio.ByteBuffer r3 = kotlin.io.LineReader.byteBuf
            r4 = 0
            r3.position(r4)
            return r0
    }

    private final void resetAll() {
            r2 = this;
            java.nio.charset.CharsetDecoder r0 = kotlin.io.LineReader.decoder
            if (r0 != 0) goto La
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
        La:
            r0.reset()
            java.nio.ByteBuffer r0 = kotlin.io.LineReader.byteBuf
            r1 = 0
            r0.position(r1)
            java.lang.StringBuilder r0 = kotlin.io.LineReader.sb
            r0.setLength(r1)
            return
    }

    private final void trimStringBuilder() {
            r2 = this;
            java.lang.StringBuilder r0 = kotlin.io.LineReader.sb
            r1 = 32
            r0.setLength(r1)
            java.lang.StringBuilder r0 = kotlin.io.LineReader.sb
            r0.trimToSize()
            return
    }

    private final void updateCharset(java.nio.charset.Charset r6) {
            r5 = this;
            java.nio.charset.CharsetDecoder r0 = r6.newDecoder()
            java.lang.String r1 = "newDecoder(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.io.LineReader.decoder = r0
            java.nio.ByteBuffer r0 = kotlin.io.LineReader.byteBuf
            r0.clear()
            java.nio.CharBuffer r0 = kotlin.io.LineReader.charBuf
            r0.clear()
            java.nio.ByteBuffer r0 = kotlin.io.LineReader.byteBuf
            r1 = 10
            r0.put(r1)
            java.nio.ByteBuffer r0 = kotlin.io.LineReader.byteBuf
            r0.flip()
            java.nio.charset.CharsetDecoder r0 = kotlin.io.LineReader.decoder
            if (r0 != 0) goto L2b
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
        L2b:
            java.nio.ByteBuffer r2 = kotlin.io.LineReader.byteBuf
            java.nio.CharBuffer r3 = kotlin.io.LineReader.charBuf
            r4 = 0
            r0.decode(r2, r3, r4)
            java.nio.CharBuffer r0 = kotlin.io.LineReader.charBuf
            int r0 = r0.position()
            r2 = 1
            if (r0 != r2) goto L45
            java.nio.CharBuffer r0 = kotlin.io.LineReader.charBuf
            char r0 = r0.get(r4)
            if (r0 != r1) goto L45
            r4 = r2
        L45:
            kotlin.io.LineReader.directEOL = r4
            r5.resetAll()
            return
    }

    public final synchronized java.lang.String readLine(java.io.InputStream r12, java.nio.charset.Charset r13) {
            r11 = this;
            monitor-enter(r11)
            java.lang.String r0 = "inputStream"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)     // Catch: java.lang.Throwable -> Lde
            java.nio.charset.CharsetDecoder r0 = kotlin.io.LineReader.decoder     // Catch: java.lang.Throwable -> Lde
            r1 = 0
            if (r0 == 0) goto L24
            java.nio.charset.CharsetDecoder r0 = kotlin.io.LineReader.decoder     // Catch: java.lang.Throwable -> Lde
            if (r0 != 0) goto L1a
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)     // Catch: java.lang.Throwable -> Lde
            r0 = r1
        L1a:
            java.nio.charset.Charset r0 = r0.charset()     // Catch: java.lang.Throwable -> Lde
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r13)     // Catch: java.lang.Throwable -> Lde
            if (r0 != 0) goto L27
        L24:
            r11.updateCharset(r13)     // Catch: java.lang.Throwable -> Lde
        L27:
            r0 = 0
            r2 = 0
        L29:
            int r3 = r12.read()     // Catch: java.lang.Throwable -> Lde
            r4 = 32
            r5 = 10
            r6 = -1
            r7 = 1
            r8 = 0
            if (r3 != r6) goto L51
            java.lang.StringBuilder r6 = kotlin.io.LineReader.sb     // Catch: java.lang.Throwable -> Lde
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch: java.lang.Throwable -> Lde
            int r6 = r6.length()     // Catch: java.lang.Throwable -> Lde
            if (r6 != 0) goto L43
            r6 = r7
            goto L44
        L43:
            r6 = r8
        L44:
            if (r6 == 0) goto L4c
            if (r0 != 0) goto L4c
            if (r2 != 0) goto L4c
            monitor-exit(r11)
            return r1
        L4c:
            int r1 = r11.decodeEndOfInput(r0, r2)     // Catch: java.lang.Throwable -> Lde
            goto L83
        L51:
            byte[] r6 = kotlin.io.LineReader.bytes     // Catch: java.lang.Throwable -> Lde
            int r9 = r0 + 1
            byte r10 = (byte) r3     // Catch: java.lang.Throwable -> Lde
            r6[r0] = r10     // Catch: java.lang.Throwable -> Lde
            if (r3 == r5) goto L63
            if (r9 == r4) goto L63
            boolean r0 = kotlin.io.LineReader.directEOL     // Catch: java.lang.Throwable -> Lde
            if (r0 != 0) goto L61
            goto L63
        L61:
            r0 = r9
            goto L29
        L63:
            java.nio.ByteBuffer r0 = kotlin.io.LineReader.byteBuf     // Catch: java.lang.Throwable -> Lde
            r0.limit(r9)     // Catch: java.lang.Throwable -> Lde
            java.nio.CharBuffer r0 = kotlin.io.LineReader.charBuf     // Catch: java.lang.Throwable -> Lde
            r0.position(r2)     // Catch: java.lang.Throwable -> Lde
            int r0 = r11.decode(r8)     // Catch: java.lang.Throwable -> Lde
            r2 = r0
            if (r2 <= 0) goto Ld8
            char[] r0 = kotlin.io.LineReader.chars     // Catch: java.lang.Throwable -> Lde
            int r6 = r2 + (-1)
            char r0 = r0[r6]     // Catch: java.lang.Throwable -> Lde
            if (r0 != r5) goto Ld8
            java.nio.ByteBuffer r0 = kotlin.io.LineReader.byteBuf     // Catch: java.lang.Throwable -> Lde
            r0.position(r8)     // Catch: java.lang.Throwable -> Lde
            r1 = r2
            r0 = r9
        L83:
            if (r1 <= 0) goto L9d
            char[] r2 = kotlin.io.LineReader.chars     // Catch: java.lang.Throwable -> Lde
            int r3 = r1 + (-1)
            char r2 = r2[r3]     // Catch: java.lang.Throwable -> Lde
            if (r2 != r5) goto L9d
            int r1 = r1 + (-1)
            if (r1 <= 0) goto L9d
            char[] r2 = kotlin.io.LineReader.chars     // Catch: java.lang.Throwable -> Lde
            int r3 = r1 + (-1)
            char r2 = r2[r3]     // Catch: java.lang.Throwable -> Lde
            r3 = 13
            if (r2 != r3) goto L9d
            int r1 = r1 + (-1)
        L9d:
            java.lang.StringBuilder r2 = kotlin.io.LineReader.sb     // Catch: java.lang.Throwable -> Lde
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch: java.lang.Throwable -> Lde
            int r2 = r2.length()     // Catch: java.lang.Throwable -> Lde
            if (r2 != 0) goto La8
            goto La9
        La8:
            r7 = r8
        La9:
            if (r7 == 0) goto Lb4
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> Lde
            char[] r3 = kotlin.io.LineReader.chars     // Catch: java.lang.Throwable -> Lde
            r2.<init>(r3, r8, r1)     // Catch: java.lang.Throwable -> Lde
            monitor-exit(r11)
            return r2
        Lb4:
            java.lang.StringBuilder r2 = kotlin.io.LineReader.sb     // Catch: java.lang.Throwable -> Lde
            char[] r3 = kotlin.io.LineReader.chars     // Catch: java.lang.Throwable -> Lde
            r2.append(r3, r8, r1)     // Catch: java.lang.Throwable -> Lde
            java.lang.StringBuilder r2 = kotlin.io.LineReader.sb     // Catch: java.lang.Throwable -> Lde
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lde
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Throwable -> Lde
            java.lang.StringBuilder r3 = kotlin.io.LineReader.sb     // Catch: java.lang.Throwable -> Lde
            int r3 = r3.length()     // Catch: java.lang.Throwable -> Lde
            if (r3 <= r4) goto Ld1
            r11.trimStringBuilder()     // Catch: java.lang.Throwable -> Lde
        Ld1:
            java.lang.StringBuilder r3 = kotlin.io.LineReader.sb     // Catch: java.lang.Throwable -> Lde
            r3.setLength(r8)     // Catch: java.lang.Throwable -> Lde
            monitor-exit(r11)
            return r2
        Ld8:
            int r0 = r11.compactBytes()     // Catch: java.lang.Throwable -> Lde
            goto L29
        Lde:
            r12 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lde
            throw r12
    }
}
