package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
class Encoding {
    static final int SIZEOF_BYTE = 8;
    static final int UINT_16_SIZE = 2;
    static final int UINT_32_SIZE = 4;
    static final int UINT_8_SIZE = 1;

    private Encoding() {
            r0 = this;
            r0.<init>()
            return
    }

    static int bitsToBytes(int r1) {
            int r0 = r1 + 8
            int r0 = r0 + (-1)
            r0 = r0 & (-8)
            int r0 = r0 / 8
            return r0
    }

    static byte[] compress(byte[] r5) throws java.io.IOException {
            java.util.zip.Deflater r0 = new java.util.zip.Deflater
            r1 = 1
            r0.<init>(r1)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.util.zip.DeflaterOutputStream r2 = new java.util.zip.DeflaterOutputStream     // Catch: java.lang.Throwable -> L29
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L29
            r2.write(r5)     // Catch: java.lang.Throwable -> L1f
            r2.close()     // Catch: java.lang.Throwable -> L29
            r0.end()
            byte[] r2 = r1.toByteArray()
            return r2
        L1f:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L24
            goto L28
        L24:
            r4 = move-exception
            r3.addSuppressed(r4)     // Catch: java.lang.Throwable -> L29
        L28:
            throw r3     // Catch: java.lang.Throwable -> L29
        L29:
            r2 = move-exception
            r0.end()
            throw r2
    }

    static java.lang.RuntimeException error(java.lang.String r1) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            return r0
    }

    static byte[] read(java.io.InputStream r5, int r6) throws java.io.IOException {
            byte[] r0 = new byte[r6]
            r1 = 0
        L3:
            if (r1 >= r6) goto L27
            int r2 = r6 - r1
            int r2 = r5.read(r0, r1, r2)
            if (r2 < 0) goto Lf
            int r1 = r1 + r2
            goto L3
        Lf:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Not enough bytes to read: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.RuntimeException r3 = error(r3)
            throw r3
        L27:
            return r0
    }

    static byte[] readCompressed(java.io.InputStream r8, int r9, int r10) throws java.io.IOException {
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L8e
            r2 = 0
            r3 = 0
            r4 = 2048(0x800, float:2.87E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L8e
        Ld:
            boolean r5 = r0.finished()     // Catch: java.lang.Throwable -> L8e
            if (r5 != 0) goto L58
            boolean r5 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L8e
            if (r5 != 0) goto L58
            if (r2 >= r9) goto L58
            int r5 = r8.read(r4)     // Catch: java.lang.Throwable -> L8e
            if (r5 < 0) goto L3a
            r6 = 0
            r0.setInput(r4, r6, r5)     // Catch: java.lang.Throwable -> L8e
            int r6 = r10 - r3
            int r6 = r0.inflate(r1, r3, r6)     // Catch: java.util.zip.DataFormatException -> L30 java.lang.Throwable -> L8e
            int r3 = r3 + r6
            int r2 = r2 + r5
            goto Ld
        L30:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()     // Catch: java.lang.Throwable -> L8e
            java.lang.RuntimeException r7 = error(r7)     // Catch: java.lang.Throwable -> L8e
            throw r7     // Catch: java.lang.Throwable -> L8e
        L3a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r6.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r7 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r6 = r6.append(r9)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r7 = " bytes"
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L8e
            java.lang.RuntimeException r6 = error(r6)     // Catch: java.lang.Throwable -> L8e
            throw r6     // Catch: java.lang.Throwable -> L8e
        L58:
            if (r2 != r9) goto L6c
            boolean r5 = r0.finished()     // Catch: java.lang.Throwable -> L8e
            if (r5 == 0) goto L65
        L61:
            r0.end()
            return r1
        L65:
            java.lang.String r5 = "Inflater did not finish"
            java.lang.RuntimeException r5 = error(r5)     // Catch: java.lang.Throwable -> L8e
            throw r5     // Catch: java.lang.Throwable -> L8e
        L6c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r5.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = "Didn't read enough bytes during decompression. expected="
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r5 = r5.append(r9)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = " actual="
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r5 = r5.append(r2)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L8e
            java.lang.RuntimeException r5 = error(r5)     // Catch: java.lang.Throwable -> L8e
            throw r5     // Catch: java.lang.Throwable -> L8e
        L8e:
            r1 = move-exception
            r0.end()
            throw r1
    }

    static java.lang.String readString(java.io.InputStream r3, int r4) throws java.io.IOException {
            java.lang.String r0 = new java.lang.String
            byte[] r1 = read(r3, r4)
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r1, r2)
            return r0
    }

    static long readUInt(java.io.InputStream r8, int r9) throws java.io.IOException {
            byte[] r0 = read(r8, r9)
            r1 = 0
            r3 = 0
        L7:
            if (r3 >= r9) goto L16
            r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r4 = (long) r4
            int r6 = r3 * 8
            long r6 = r4 << r6
            long r1 = r1 + r6
            int r3 = r3 + 1
            goto L7
        L16:
            return r1
    }

    static int readUInt16(java.io.InputStream r2) throws java.io.IOException {
            r0 = 2
            long r0 = readUInt(r2, r0)
            int r0 = (int) r0
            return r0
    }

    static long readUInt32(java.io.InputStream r2) throws java.io.IOException {
            r0 = 4
            long r0 = readUInt(r2, r0)
            return r0
    }

    static int readUInt8(java.io.InputStream r2) throws java.io.IOException {
            r0 = 1
            long r0 = readUInt(r2, r0)
            int r0 = (int) r0
            return r0
    }

    static int utf8Length(java.lang.String r1) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r1.getBytes(r0)
            int r0 = r0.length
            return r0
    }

    static void writeAll(java.io.InputStream r5, java.io.OutputStream r6, java.nio.channels.FileLock r7) throws java.io.IOException {
            r0 = 0
            if (r7 == 0) goto Lb
            boolean r1 = r7.isValid()
            if (r1 == 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = r0
        Lc:
            if (r1 == 0) goto L1e
            r2 = 512(0x200, float:7.17E-43)
            byte[] r2 = new byte[r2]
        L12:
            int r3 = r5.read(r2)
            r4 = r3
            if (r3 <= 0) goto L1d
            r6.write(r2, r0, r4)
            goto L12
        L1d:
            return
        L1e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Unable to acquire a lock on the underlying file channel."
            r0.<init>(r2)
            throw r0
    }

    static void writeCompressed(java.io.OutputStream r3, byte[] r4) throws java.io.IOException {
            int r0 = r4.length
            long r0 = (long) r0
            writeUInt32(r3, r0)
            byte[] r0 = compress(r4)
            int r1 = r0.length
            long r1 = (long) r1
            writeUInt32(r3, r1)
            r3.write(r0)
            return
    }

    static void writeString(java.io.OutputStream r1, java.lang.String r2) throws java.io.IOException {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r2.getBytes(r0)
            r1.write(r0)
            return
    }

    static void writeUInt(java.io.OutputStream r6, long r7, int r9) throws java.io.IOException {
            byte[] r0 = new byte[r9]
            r1 = 0
        L3:
            if (r1 >= r9) goto L13
            int r2 = r1 * 8
            long r2 = r7 >> r2
            r4 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r4
            int r2 = (int) r2
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L3
        L13:
            r6.write(r0)
            return
    }

    static void writeUInt16(java.io.OutputStream r3, int r4) throws java.io.IOException {
            long r0 = (long) r4
            r2 = 2
            writeUInt(r3, r0, r2)
            return
    }

    static void writeUInt32(java.io.OutputStream r1, long r2) throws java.io.IOException {
            r0 = 4
            writeUInt(r1, r2, r0)
            return
    }

    static void writeUInt8(java.io.OutputStream r3, int r4) throws java.io.IOException {
            long r0 = (long) r4
            r2 = 1
            writeUInt(r3, r0, r2)
            return
    }
}
