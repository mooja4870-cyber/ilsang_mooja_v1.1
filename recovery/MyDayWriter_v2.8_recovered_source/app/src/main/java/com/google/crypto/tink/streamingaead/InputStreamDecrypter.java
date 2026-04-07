package com.google.crypto.tink.streamingaead;

/* JADX INFO: loaded from: classes.dex */
final class InputStreamDecrypter extends java.io.InputStream {
    byte[] associatedData;
    boolean attemptedMatching;
    java.io.InputStream ciphertextStream;
    java.io.InputStream matchingStream;
    com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.StreamingAead> primitives;

    public InputStreamDecrypter(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.StreamingAead> r3, java.io.InputStream r4, byte[] r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.attemptedMatching = r0
            r0 = 0
            r2.matchingStream = r0
            r2.primitives = r3
            boolean r0 = r4.markSupported()
            if (r0 == 0) goto L14
            r2.ciphertextStream = r4
            goto L1b
        L14:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r4)
            r2.ciphertextStream = r0
        L1b:
            java.io.InputStream r0 = r2.ciphertextStream
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.mark(r1)
            java.lang.Object r0 = r5.clone()
            byte[] r0 = (byte[]) r0
            r2.associatedData = r0
            return
    }

    private void disableRewinding() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.ciphertextStream
            r1 = 0
            r0.mark(r1)
            return
    }

    private void rewind() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.ciphertextStream
            r0.reset()
            return
    }

    @Override // java.io.InputStream
    public synchronized int available() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.io.InputStream r0 = r1.matchingStream     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L8
            monitor-exit(r1)
            r0 = 0
            return r0
        L8:
            java.io.InputStream r0 = r1.matchingStream     // Catch: java.lang.Throwable -> L10
            int r0 = r0.available()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r0
        L10:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.io.InputStream r0 = r1.ciphertextStream     // Catch: java.lang.Throwable -> L8
            r0.close()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.io.InputStream
    public synchronized int read() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            r0 = 1
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> L12
            int r2 = r3.read(r1)     // Catch: java.lang.Throwable -> L12
            if (r2 != r0) goto Lf
            r0 = 0
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)
            return r0
        Lf:
            monitor-exit(r3)
            r0 = -1
            return r0
        L12:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            throw r0
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            int r0 = r3.length     // Catch: java.lang.Throwable -> L9
            r1 = 0
            int r0 = r2.read(r3, r1, r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r3
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] r8, int r9, int r10) throws java.io.IOException {
            r7 = this;
            monitor-enter(r7)
            if (r10 != 0) goto L6
            monitor-exit(r7)
            r0 = 0
            return r0
        L6:
            java.io.InputStream r0 = r7.matchingStream     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L12
            java.io.InputStream r0 = r7.matchingStream     // Catch: java.lang.Throwable -> L6d
            int r0 = r0.read(r8, r9, r10)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r7)
            return r0
        L12:
            boolean r0 = r7.attemptedMatching     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L65
            r0 = 1
            r7.attemptedMatching = r0     // Catch: java.lang.Throwable -> L6d
            com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.StreamingAead> r0 = r7.primitives     // Catch: java.lang.Throwable -> L6d
            java.util.List r0 = r0.getRawPrimitives()     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L6d
        L23:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L6d
            com.google.crypto.tink.PrimitiveSet$Entry r2 = (com.google.crypto.tink.PrimitiveSet.Entry) r2     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r3 = r2.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L53 java.io.IOException -> L58 java.lang.Throwable -> L6d
            com.google.crypto.tink.StreamingAead r3 = (com.google.crypto.tink.StreamingAead) r3     // Catch: java.security.GeneralSecurityException -> L53 java.io.IOException -> L58 java.lang.Throwable -> L6d
            java.io.InputStream r4 = r7.ciphertextStream     // Catch: java.security.GeneralSecurityException -> L53 java.io.IOException -> L58 java.lang.Throwable -> L6d
            byte[] r5 = r7.associatedData     // Catch: java.security.GeneralSecurityException -> L53 java.io.IOException -> L58 java.lang.Throwable -> L6d
            java.io.InputStream r3 = r3.newDecryptingStream(r4, r5)     // Catch: java.security.GeneralSecurityException -> L53 java.io.IOException -> L58 java.lang.Throwable -> L6d
            int r4 = r3.read(r8, r9, r10)     // Catch: java.security.GeneralSecurityException -> L53 java.io.IOException -> L58 java.lang.Throwable -> L6d
            if (r4 == 0) goto L4b
            r7.matchingStream = r3     // Catch: java.security.GeneralSecurityException -> L53 java.io.IOException -> L58 java.lang.Throwable -> L6d
            r7.disableRewinding()     // Catch: java.security.GeneralSecurityException -> L53 java.io.IOException -> L58 java.lang.Throwable -> L6d
            monitor-exit(r7)
            return r4
        L4b:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.security.GeneralSecurityException -> L53 java.io.IOException -> L58 java.lang.Throwable -> L6d
            java.lang.String r6 = "Could not read bytes from the ciphertext stream"
            r5.<init>(r6)     // Catch: java.security.GeneralSecurityException -> L53 java.io.IOException -> L58 java.lang.Throwable -> L6d
            throw r5     // Catch: java.security.GeneralSecurityException -> L53 java.io.IOException -> L58 java.lang.Throwable -> L6d
        L53:
            r3 = move-exception
            r7.rewind()     // Catch: java.lang.Throwable -> L6d
            goto L23
        L58:
            r3 = move-exception
            r7.rewind()     // Catch: java.lang.Throwable -> L6d
            goto L23
        L5d:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L6d
            java.lang.String r2 = "No matching key found for the ciphertext in the stream."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L6d
            throw r1     // Catch: java.lang.Throwable -> L6d
        L65:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L6d
            java.lang.String r1 = "No matching key found for the ciphertext in the stream."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6d
            throw r0     // Catch: java.lang.Throwable -> L6d
        L6d:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6d
            throw r8
    }
}
