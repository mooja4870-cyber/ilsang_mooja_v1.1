package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public final class TinkProtoKeysetFormat {
    private TinkProtoKeysetFormat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.KeysetHandle parseEncryptedKeyset(byte[] r3, com.google.crypto.tink.Aead r4, byte[] r5) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.KeysetReader r0 = com.google.crypto.tink.BinaryKeysetReader.withBytes(r3)     // Catch: java.io.IOException -> La
            com.google.crypto.tink.KeysetHandle r0 = com.google.crypto.tink.KeysetHandle.readWithAssociatedData(r0, r4, r5)     // Catch: java.io.IOException -> La
            return r0
        La:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Parse keyset failed"
            r1.<init>(r2)
            throw r1
    }

    public static com.google.crypto.tink.KeysetHandle parseKeyset(byte[] r3, com.google.crypto.tink.SecretKeyAccess r4) throws java.security.GeneralSecurityException {
            if (r4 == 0) goto L14
            com.google.crypto.tink.KeysetReader r0 = com.google.crypto.tink.BinaryKeysetReader.withBytes(r3)     // Catch: java.io.IOException -> Lb
            com.google.crypto.tink.KeysetHandle r0 = com.google.crypto.tink.CleartextKeysetHandle.read(r0)     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Parse keyset failed"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "SecretKeyAccess cannot be null"
            r0.<init>(r1)
            throw r0
    }

    public static com.google.crypto.tink.KeysetHandle parseKeysetWithoutSecret(byte[] r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.KeysetReader r0 = com.google.crypto.tink.BinaryKeysetReader.withBytes(r3)     // Catch: java.io.IOException -> L9
            com.google.crypto.tink.KeysetHandle r0 = com.google.crypto.tink.KeysetHandle.readNoSecret(r0)     // Catch: java.io.IOException -> L9
            return r0
        L9:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Parse keyset failed"
            r1.<init>(r2)
            throw r1
    }

    public static byte[] serializeEncryptedKeyset(com.google.crypto.tink.KeysetHandle r3, com.google.crypto.tink.Aead r4, byte[] r5) throws java.security.GeneralSecurityException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L12
            r0.<init>()     // Catch: java.io.IOException -> L12
            com.google.crypto.tink.KeysetWriter r1 = com.google.crypto.tink.BinaryKeysetWriter.withOutputStream(r0)     // Catch: java.io.IOException -> L12
            r3.writeWithAssociatedData(r1, r4, r5)     // Catch: java.io.IOException -> L12
            byte[] r1 = r0.toByteArray()     // Catch: java.io.IOException -> L12
            return r1
        L12:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Serialize keyset failed"
            r1.<init>(r2)
            throw r1
    }

    public static byte[] serializeKeyset(com.google.crypto.tink.KeysetHandle r3, com.google.crypto.tink.SecretKeyAccess r4) throws java.security.GeneralSecurityException {
            if (r4 == 0) goto L1c
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L13
            r0.<init>()     // Catch: java.io.IOException -> L13
            com.google.crypto.tink.KeysetWriter r1 = com.google.crypto.tink.BinaryKeysetWriter.withOutputStream(r0)     // Catch: java.io.IOException -> L13
            com.google.crypto.tink.CleartextKeysetHandle.write(r3, r1)     // Catch: java.io.IOException -> L13
            byte[] r1 = r0.toByteArray()     // Catch: java.io.IOException -> L13
            return r1
        L13:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Serialize keyset failed"
            r1.<init>(r2)
            throw r1
        L1c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "SecretKeyAccess cannot be null"
            r0.<init>(r1)
            throw r0
    }

    public static byte[] serializeKeysetWithoutSecret(com.google.crypto.tink.KeysetHandle r3) throws java.security.GeneralSecurityException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L11
            r0.<init>()     // Catch: java.io.IOException -> L11
            com.google.crypto.tink.KeysetWriter r1 = com.google.crypto.tink.BinaryKeysetWriter.withOutputStream(r0)     // Catch: java.io.IOException -> L11
            r3.writeNoSecret(r1)     // Catch: java.io.IOException -> L11
            byte[] r1 = r0.toByteArray()     // Catch: java.io.IOException -> L11
            return r1
        L11:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Serialize keyset failed"
            r1.<init>(r2)
            throw r1
    }
}
