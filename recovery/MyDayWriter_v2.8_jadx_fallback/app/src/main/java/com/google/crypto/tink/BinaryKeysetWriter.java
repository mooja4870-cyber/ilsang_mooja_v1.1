package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public final class BinaryKeysetWriter implements com.google.crypto.tink.KeysetWriter {
    private final java.io.OutputStream outputStream;

    private BinaryKeysetWriter(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>()
            r0.outputStream = r1
            return
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.KeysetWriter withFile(java.io.File r1) throws java.io.IOException {
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            com.google.crypto.tink.KeysetWriter r0 = withOutputStream(r0)
            return r0
    }

    public static com.google.crypto.tink.KeysetWriter withOutputStream(java.io.OutputStream r1) {
            com.google.crypto.tink.BinaryKeysetWriter r0 = new com.google.crypto.tink.BinaryKeysetWriter
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(com.google.crypto.tink.proto.EncryptedKeyset r3) throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.outputStream     // Catch: java.lang.Throwable -> Lc
            r3.writeTo(r0)     // Catch: java.lang.Throwable -> Lc
            java.io.OutputStream r0 = r2.outputStream
            r0.close()
            return
        Lc:
            r0 = move-exception
            java.io.OutputStream r1 = r2.outputStream
            r1.close()
            throw r0
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(com.google.crypto.tink.proto.Keyset r3) throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.outputStream     // Catch: java.lang.Throwable -> Lc
            r3.writeTo(r0)     // Catch: java.lang.Throwable -> Lc
            java.io.OutputStream r0 = r2.outputStream
            r0.close()
            return
        Lc:
            r0 = move-exception
            java.io.OutputStream r1 = r2.outputStream
            r1.close()
            throw r0
    }
}
