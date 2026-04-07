package kotlin.io.encoding;

/* JADX INFO: compiled from: Base64IOStream.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J \u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0002J \u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0016J \u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlin/io/encoding/EncodeOutputStream;", "Ljava/io/OutputStream;", "output", "base64", "Lkotlin/io/encoding/Base64;", "(Ljava/io/OutputStream;Lkotlin/io/encoding/Base64;)V", "byteBuffer", "", "byteBufferLength", "", "isClosed", "", "lineLength", "symbolBuffer", "checkOpen", "", "close", "copyIntoByteBuffer", "source", "startIndex", "endIndex", "encodeByteBufferIntoOutput", "encodeIntoOutput", "flush", "write", "offset", "length", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class EncodeOutputStream extends java.io.OutputStream {
    private final kotlin.io.encoding.Base64 base64;
    private final byte[] byteBuffer;
    private int byteBufferLength;
    private boolean isClosed;
    private int lineLength;
    private final java.io.OutputStream output;
    private final byte[] symbolBuffer;

    public EncodeOutputStream(java.io.OutputStream r2, kotlin.io.encoding.Base64 r3) {
            r1 = this;
            java.lang.String r0 = "output"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "base64"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.output = r2
            r1.base64 = r3
            kotlin.io.encoding.Base64 r0 = r1.base64
            boolean r0 = r0.isMimeScheme$kotlin_stdlib()
            if (r0 == 0) goto L1c
            r0 = 76
            goto L1d
        L1c:
            r0 = -1
        L1d:
            r1.lineLength = r0
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
            r1.symbolBuffer = r0
            r0 = 3
            byte[] r0 = new byte[r0]
            r1.byteBuffer = r0
            return
    }

    private final void checkOpen() {
            r2 = this;
            boolean r0 = r2.isClosed
            if (r0 != 0) goto L5
            return
        L5:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "The output stream is closed."
            r0.<init>(r1)
            throw r0
    }

    private final int copyIntoByteBuffer(byte[] r6, int r7, int r8) {
            r5 = this;
            int r0 = r5.byteBufferLength
            r1 = 3
            int r0 = 3 - r0
            int r2 = r8 - r7
            int r0 = java.lang.Math.min(r0, r2)
            byte[] r2 = r5.byteBuffer
            int r3 = r5.byteBufferLength
            int r4 = r7 + r0
            kotlin.collections.ArraysKt.copyInto(r6, r2, r3, r7, r4)
            int r2 = r5.byteBufferLength
            int r2 = r2 + r0
            r5.byteBufferLength = r2
            int r2 = r5.byteBufferLength
            if (r2 != r1) goto L20
            r5.encodeByteBufferIntoOutput()
        L20:
            return r0
    }

    private final void encodeByteBufferIntoOutput() {
            r3 = this;
            byte[] r0 = r3.byteBuffer
            int r1 = r3.byteBufferLength
            r2 = 0
            int r0 = r3.encodeIntoOutput(r0, r2, r1)
            r1 = 4
            if (r0 != r1) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = r2
        Lf:
            if (r1 == 0) goto L14
            r3.byteBufferLength = r2
            return
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Check failed."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private final int encodeIntoOutput(byte[] r7, int r8, int r9) {
            r6 = this;
            kotlin.io.encoding.Base64 r0 = r6.base64
            byte[] r2 = r6.symbolBuffer
            r3 = 0
            r1 = r7
            r4 = r8
            r5 = r9
            int r7 = r0.encodeIntoByteArray(r1, r2, r3, r4, r5)
            int r8 = r6.lineLength
            r9 = 0
            if (r8 != 0) goto L38
            java.io.OutputStream r8 = r6.output
            kotlin.io.encoding.Base64$Default r0 = kotlin.io.encoding.Base64.Default
            byte[] r0 = r0.getMimeLineSeparatorSymbols$kotlin_stdlib()
            r8.write(r0)
            r8 = 76
            r6.lineLength = r8
            if (r7 > r8) goto L28
            r8 = 1
            goto L29
        L28:
            r8 = r9
        L29:
            if (r8 == 0) goto L2c
            goto L38
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Check failed."
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L38:
            java.io.OutputStream r8 = r6.output
            byte[] r0 = r6.symbolBuffer
            r8.write(r0, r9, r7)
            int r8 = r6.lineLength
            int r8 = r8 - r7
            r6.lineLength = r8
            return r7
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            boolean r0 = r1.isClosed
            if (r0 != 0) goto L13
            r0 = 1
            r1.isClosed = r0
            int r0 = r1.byteBufferLength
            if (r0 == 0) goto Le
            r1.encodeByteBufferIntoOutput()
        Le:
            java.io.OutputStream r0 = r1.output
            r0.close()
        L13:
            return
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
            r1 = this;
            r1.checkOpen()
            java.io.OutputStream r0 = r1.output
            r0.flush()
            return
    }

    @Override // java.io.OutputStream
    public void write(int r4) {
            r3 = this;
            r3.checkOpen()
            byte[] r0 = r3.byteBuffer
            int r1 = r3.byteBufferLength
            int r2 = r1 + 1
            r3.byteBufferLength = r2
            byte r2 = (byte) r4
            r0[r1] = r2
            int r0 = r3.byteBufferLength
            r1 = 3
            if (r0 != r1) goto L16
            r3.encodeByteBufferIntoOutput()
        L16:
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r12, int r13, int r14) {
            r11 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r11.checkOpen()
            if (r13 < 0) goto L7f
            if (r14 < 0) goto L7f
            int r0 = r13 + r14
            int r1 = r12.length
            if (r0 > r1) goto L7f
            if (r14 != 0) goto L14
            return
        L14:
            int r0 = r11.byteBufferLength
            r1 = 1
            r2 = 0
            r3 = 3
            if (r0 >= r3) goto L1d
            r0 = r1
            goto L1e
        L1d:
            r0 = r2
        L1e:
            java.lang.String r4 = "Check failed."
            if (r0 == 0) goto L75
            r0 = r13
            int r5 = r0 + r14
            int r6 = r11.byteBufferLength
            if (r6 == 0) goto L33
            int r6 = r11.copyIntoByteBuffer(r12, r0, r5)
            int r0 = r0 + r6
            int r6 = r11.byteBufferLength
            if (r6 == 0) goto L33
            return
        L33:
            int r6 = r0 + 3
            if (r6 > r5) goto L6b
            kotlin.io.encoding.Base64 r6 = r11.base64
            boolean r6 = r6.isMimeScheme$kotlin_stdlib()
            if (r6 == 0) goto L42
            int r6 = r11.lineLength
            goto L45
        L42:
            byte[] r6 = r11.symbolBuffer
            int r6 = r6.length
        L45:
            int r6 = r6 / 4
            int r7 = r5 - r0
            int r7 = r7 / r3
            int r7 = java.lang.Math.min(r6, r7)
            int r8 = r7 * 3
            int r9 = r0 + r8
            int r9 = r11.encodeIntoOutput(r12, r0, r9)
            int r10 = r7 * 4
            if (r9 != r10) goto L5c
            r10 = r1
            goto L5d
        L5c:
            r10 = r2
        L5d:
            if (r10 == 0) goto L61
            int r0 = r0 + r8
            goto L33
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
        L6b:
            byte[] r1 = r11.byteBuffer
            kotlin.collections.ArraysKt.copyInto(r12, r1, r2, r0, r5)
            int r1 = r5 - r0
            r11.byteBufferLength = r1
            return
        L75:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L7f:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "offset: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r13)
            java.lang.String r2 = ", length: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.String r2 = ", source size: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r12.length
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
