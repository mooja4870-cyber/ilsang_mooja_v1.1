package kotlin.io.encoding;

/* JADX INFO: compiled from: Base64IOStream.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002J(\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\b\u0010\u001d\u001a\u00020\tH\u0016J \u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010 \u001a\u00020\tH\u0002J\b\u0010!\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlin/io/encoding/DecodeInputStream;", "Ljava/io/InputStream;", "input", "base64", "Lkotlin/io/encoding/Base64;", "(Ljava/io/InputStream;Lkotlin/io/encoding/Base64;)V", "byteBuffer", "", "byteBufferEndIndex", "", "byteBufferLength", "getByteBufferLength", "()I", "byteBufferStartIndex", "isClosed", "", "isEOF", "singleByteBuffer", "symbolBuffer", "close", "", "copyByteBufferInto", "dst", "dstOffset", "length", "decodeSymbolBufferInto", "dstEndIndex", "symbolBufferLength", "handlePaddingSymbol", "read", "destination", "offset", "readNextSymbol", "resetByteBufferIfEmpty", "shiftByteBufferToStartIfNeeded", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DecodeInputStream extends java.io.InputStream {
    private final kotlin.io.encoding.Base64 base64;
    private final byte[] byteBuffer;
    private int byteBufferEndIndex;
    private int byteBufferStartIndex;
    private final java.io.InputStream input;
    private boolean isClosed;
    private boolean isEOF;
    private final byte[] singleByteBuffer;
    private final byte[] symbolBuffer;

    public DecodeInputStream(java.io.InputStream r3, kotlin.io.encoding.Base64 r4) {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "base64"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r2.<init>()
            r2.input = r3
            r2.base64 = r4
            r0 = 1
            byte[] r0 = new byte[r0]
            r2.singleByteBuffer = r0
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r0]
            r2.symbolBuffer = r1
            byte[] r0 = new byte[r0]
            r2.byteBuffer = r0
            return
    }

    private final void copyByteBufferInto(byte[] r4, int r5, int r6) {
            r3 = this;
            byte[] r0 = r3.byteBuffer
            int r1 = r3.byteBufferStartIndex
            int r2 = r3.byteBufferStartIndex
            int r2 = r2 + r6
            kotlin.collections.ArraysKt.copyInto(r0, r4, r5, r1, r2)
            int r0 = r3.byteBufferStartIndex
            int r0 = r0 + r6
            r3.byteBufferStartIndex = r0
            r3.resetByteBufferIfEmpty()
            return
    }

    private final int decodeSymbolBufferInto(byte[] r8, int r9, int r10, int r11) {
            r7 = this;
            int r0 = r7.byteBufferEndIndex
            kotlin.io.encoding.Base64 r1 = r7.base64
            byte[] r2 = r7.symbolBuffer
            byte[] r3 = r7.byteBuffer
            int r4 = r7.byteBufferEndIndex
            r5 = 0
            r6 = r11
            int r11 = r1.decodeIntoByteArray(r2, r3, r4, r5, r6)
            int r0 = r0 + r11
            r7.byteBufferEndIndex = r0
            int r11 = r7.getByteBufferLength()
            int r0 = r10 - r9
            int r11 = java.lang.Math.min(r11, r0)
            r7.copyByteBufferInto(r8, r9, r11)
            r7.shiftByteBufferToStartIfNeeded()
            return r11
    }

    private final int getByteBufferLength() {
            r2 = this;
            int r0 = r2.byteBufferEndIndex
            int r1 = r2.byteBufferStartIndex
            int r0 = r0 - r1
            return r0
    }

    private final int handlePaddingSymbol(int r5) {
            r4 = this;
            byte[] r0 = r4.symbolBuffer
            r1 = 61
            r0[r5] = r1
            r0 = r5 & 3
            r1 = 2
            if (r0 != r1) goto L1b
            int r0 = r4.readNextSymbol()
            if (r0 < 0) goto L18
            byte[] r1 = r4.symbolBuffer
            int r2 = r5 + 1
            byte r3 = (byte) r0
            r1[r2] = r3
        L18:
            int r0 = r5 + 2
            goto L1d
        L1b:
            int r0 = r5 + 1
        L1d:
            return r0
    }

    private final int readNextSymbol() {
            r2 = this;
            kotlin.io.encoding.Base64 r0 = r2.base64
            boolean r0 = r0.isMimeScheme$kotlin_stdlib()
            if (r0 != 0) goto Lf
            java.io.InputStream r0 = r2.input
            int r0 = r0.read()
            return r0
        Lf:
            r0 = 0
        L10:
            java.io.InputStream r1 = r2.input
            int r0 = r1.read()
            r1 = -1
            if (r0 == r1) goto L1f
            boolean r1 = kotlin.io.encoding.Base64Kt.isInMimeAlphabet(r0)
            if (r1 == 0) goto L10
        L1f:
            return r0
    }

    private final void resetByteBufferIfEmpty() {
            r2 = this;
            int r0 = r2.byteBufferStartIndex
            int r1 = r2.byteBufferEndIndex
            if (r0 != r1) goto Lb
            r0 = 0
            r2.byteBufferStartIndex = r0
            r2.byteBufferEndIndex = r0
        Lb:
            return
    }

    private final void shiftByteBufferToStartIfNeeded() {
            r7 = this;
            byte[] r0 = r7.byteBuffer
            int r0 = r0.length
            int r1 = r7.byteBufferEndIndex
            int r0 = r0 - r1
            byte[] r1 = r7.symbolBuffer
            int r1 = r1.length
            int r1 = r1 / 4
            int r1 = r1 * 3
            if (r1 <= r0) goto L24
            byte[] r2 = r7.byteBuffer
            byte[] r3 = r7.byteBuffer
            int r4 = r7.byteBufferStartIndex
            int r5 = r7.byteBufferEndIndex
            r6 = 0
            kotlin.collections.ArraysKt.copyInto(r2, r3, r6, r4, r5)
            int r2 = r7.byteBufferEndIndex
            int r3 = r7.byteBufferStartIndex
            int r2 = r2 - r3
            r7.byteBufferEndIndex = r2
            r7.byteBufferStartIndex = r6
        L24:
            return
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            boolean r0 = r1.isClosed
            if (r0 != 0) goto Lc
            r0 = 1
            r1.isClosed = r0
            java.io.InputStream r0 = r1.input
            r0.close()
        Lc:
            return
    }

    @Override // java.io.InputStream
    public int read() {
            r3 = this;
            int r0 = r3.byteBufferStartIndex
            int r1 = r3.byteBufferEndIndex
            r2 = 1
            if (r0 >= r1) goto L18
            byte[] r0 = r3.byteBuffer
            int r1 = r3.byteBufferStartIndex
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3.byteBufferStartIndex
            int r1 = r1 + r2
            r3.byteBufferStartIndex = r1
            r3.resetByteBufferIfEmpty()
            return r0
        L18:
            byte[] r0 = r3.singleByteBuffer
            r1 = 0
            int r0 = r3.read(r0, r1, r2)
            switch(r0) {
                case -1: goto L35;
                case 0: goto L22;
                case 1: goto L2e;
                default: goto L22;
            }
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unreachable"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2e:
            byte[] r0 = r3.singleByteBuffer
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            goto L36
        L35:
            r0 = -1
        L36:
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r13, int r14, int r15) {
            r12 = this;
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            if (r14 < 0) goto L96
            if (r15 < 0) goto L96
            int r0 = r14 + r15
            int r1 = r13.length
            if (r0 > r1) goto L96
            boolean r0 = r12.isClosed
            if (r0 != 0) goto L8e
            boolean r0 = r12.isEOF
            r1 = -1
            if (r0 == 0) goto L18
            return r1
        L18:
            r0 = 0
            if (r15 != 0) goto L1c
            return r0
        L1c:
            int r2 = r12.getByteBufferLength()
            if (r2 < r15) goto L26
            r12.copyByteBufferInto(r13, r14, r15)
            return r15
        L26:
            int r2 = r12.getByteBufferLength()
            int r2 = r15 - r2
            int r3 = r2 + 3
            r4 = 1
            int r3 = r3 - r4
            int r3 = r3 / 3
            int r5 = r3 * 4
            r6 = r14
        L35:
            boolean r7 = r12.isEOF
            if (r7 != 0) goto L84
            if (r5 <= 0) goto L84
            r7 = 0
            byte[] r8 = r12.symbolBuffer
            int r8 = r8.length
            int r8 = java.lang.Math.min(r8, r5)
        L43:
            boolean r9 = r12.isEOF
            if (r9 != 0) goto L63
            if (r7 >= r8) goto L63
            int r9 = r12.readNextSymbol()
            switch(r9) {
                case -1: goto L60;
                case 61: goto L59;
                default: goto L50;
            }
        L50:
            byte[] r10 = r12.symbolBuffer
            byte r11 = (byte) r9
            r10[r7] = r11
            int r7 = r7 + 1
            goto L43
        L59:
            int r7 = r12.handlePaddingSymbol(r7)
            r12.isEOF = r4
            goto L43
        L60:
            r12.isEOF = r4
            goto L43
        L63:
            boolean r9 = r12.isEOF
            if (r9 != 0) goto L6c
            if (r7 != r8) goto L6a
            goto L6c
        L6a:
            r9 = r0
            goto L6d
        L6c:
            r9 = r4
        L6d:
            if (r9 == 0) goto L78
            int r5 = r5 - r7
            int r9 = r15 + r14
            int r9 = r12.decodeSymbolBufferInto(r13, r6, r9, r7)
            int r6 = r6 + r9
            goto L35
        L78:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L84:
            if (r6 != r14) goto L8b
            boolean r0 = r12.isEOF
            if (r0 == 0) goto L8b
            goto L8d
        L8b:
            int r1 = r6 - r14
        L8d:
            return r1
        L8e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "The input stream is closed."
            r0.<init>(r1)
            throw r0
        L96:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "offset: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.String r2 = ", length: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r15)
            java.lang.String r2 = ", buffer size: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r13.length
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
