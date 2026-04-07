package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public final class BinaryKeysetReader implements com.google.crypto.tink.KeysetReader {
    private final java.io.InputStream inputStream;

    private BinaryKeysetReader(java.io.InputStream r1) {
            r0 = this;
            r0.<init>()
            r0.inputStream = r1
            return
    }

    public static com.google.crypto.tink.KeysetReader withBytes(byte[] r2) {
            com.google.crypto.tink.BinaryKeysetReader r0 = new com.google.crypto.tink.BinaryKeysetReader
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.KeysetReader withFile(java.io.File r1) throws java.io.IOException {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            com.google.crypto.tink.KeysetReader r0 = withInputStream(r0)
            return r0
    }

    public static com.google.crypto.tink.KeysetReader withInputStream(java.io.InputStream r1) {
            com.google.crypto.tink.BinaryKeysetReader r0 = new com.google.crypto.tink.BinaryKeysetReader
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.KeysetReader
    public com.google.crypto.tink.proto.Keyset read() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.inputStream     // Catch: java.lang.Throwable -> L10
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: java.lang.Throwable -> L10
            com.google.crypto.tink.proto.Keyset r0 = com.google.crypto.tink.proto.Keyset.parseFrom(r0, r1)     // Catch: java.lang.Throwable -> L10
            java.io.InputStream r1 = r2.inputStream
            r1.close()
            return r0
        L10:
            r0 = move-exception
            java.io.InputStream r1 = r2.inputStream
            r1.close()
            throw r0
    }

    @Override // com.google.crypto.tink.KeysetReader
    public com.google.crypto.tink.proto.EncryptedKeyset readEncrypted() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.inputStream     // Catch: java.lang.Throwable -> L10
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: java.lang.Throwable -> L10
            com.google.crypto.tink.proto.EncryptedKeyset r0 = com.google.crypto.tink.proto.EncryptedKeyset.parseFrom(r0, r1)     // Catch: java.lang.Throwable -> L10
            java.io.InputStream r1 = r2.inputStream
            r1.close()
            return r0
        L10:
            r0 = move-exception
            java.io.InputStream r1 = r2.inputStream
            r1.close()
            throw r0
    }
}
