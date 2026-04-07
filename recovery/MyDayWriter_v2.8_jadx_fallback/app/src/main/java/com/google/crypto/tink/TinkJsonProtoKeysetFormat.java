package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public final class TinkJsonProtoKeysetFormat {
    private TinkJsonProtoKeysetFormat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.KeysetHandle parseEncryptedKeyset(java.lang.String r3, com.google.crypto.tink.Aead r4, byte[] r5) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.JsonKeysetReader r0 = com.google.crypto.tink.JsonKeysetReader.withString(r3)     // Catch: java.io.IOException -> La
            com.google.crypto.tink.KeysetHandle r0 = com.google.crypto.tink.KeysetHandle.readWithAssociatedData(r0, r4, r5)     // Catch: java.io.IOException -> La
            return r0
        La:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Parse keyset failed"
            r1.<init>(r2)
            throw r1
    }

    public static com.google.crypto.tink.KeysetHandle parseKeyset(java.lang.String r3, com.google.crypto.tink.SecretKeyAccess r4) throws java.security.GeneralSecurityException {
            if (r4 == 0) goto L14
            com.google.crypto.tink.JsonKeysetReader r0 = com.google.crypto.tink.JsonKeysetReader.withString(r3)     // Catch: java.io.IOException -> Lb
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

    public static com.google.crypto.tink.KeysetHandle parseKeysetWithoutSecret(java.lang.String r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.JsonKeysetReader r0 = com.google.crypto.tink.JsonKeysetReader.withString(r3)     // Catch: java.io.IOException -> L9
            com.google.crypto.tink.KeysetHandle r0 = com.google.crypto.tink.KeysetHandle.readNoSecret(r0)     // Catch: java.io.IOException -> L9
            return r0
        L9:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Parse keyset failed"
            r1.<init>(r2)
            throw r1
    }

    public static java.lang.String serializeEncryptedKeyset(com.google.crypto.tink.KeysetHandle r4, com.google.crypto.tink.Aead r5, byte[] r6) throws java.security.GeneralSecurityException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L19
            r0.<init>()     // Catch: java.io.IOException -> L19
            com.google.crypto.tink.KeysetWriter r1 = com.google.crypto.tink.JsonKeysetWriter.withOutputStream(r0)     // Catch: java.io.IOException -> L19
            r4.writeWithAssociatedData(r1, r5, r6)     // Catch: java.io.IOException -> L19
            java.lang.String r1 = new java.lang.String     // Catch: java.io.IOException -> L19
            byte[] r2 = r0.toByteArray()     // Catch: java.io.IOException -> L19
            java.nio.charset.Charset r3 = com.google.crypto.tink.internal.Util.UTF_8     // Catch: java.io.IOException -> L19
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> L19
            return r1
        L19:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Serialize keyset failed"
            r1.<init>(r2)
            throw r1
    }

    public static java.lang.String serializeKeyset(com.google.crypto.tink.KeysetHandle r4, com.google.crypto.tink.SecretKeyAccess r5) throws java.security.GeneralSecurityException {
            if (r5 == 0) goto L23
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L1a
            r0.<init>()     // Catch: java.io.IOException -> L1a
            com.google.crypto.tink.KeysetWriter r1 = com.google.crypto.tink.JsonKeysetWriter.withOutputStream(r0)     // Catch: java.io.IOException -> L1a
            com.google.crypto.tink.CleartextKeysetHandle.write(r4, r1)     // Catch: java.io.IOException -> L1a
            java.lang.String r1 = new java.lang.String     // Catch: java.io.IOException -> L1a
            byte[] r2 = r0.toByteArray()     // Catch: java.io.IOException -> L1a
            java.nio.charset.Charset r3 = com.google.crypto.tink.internal.Util.UTF_8     // Catch: java.io.IOException -> L1a
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> L1a
            return r1
        L1a:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Serialize keyset failed"
            r1.<init>(r2)
            throw r1
        L23:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "SecretKeyAccess cannot be null"
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String serializeKeysetWithoutSecret(com.google.crypto.tink.KeysetHandle r4) throws java.security.GeneralSecurityException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L18
            r0.<init>()     // Catch: java.io.IOException -> L18
            com.google.crypto.tink.KeysetWriter r1 = com.google.crypto.tink.JsonKeysetWriter.withOutputStream(r0)     // Catch: java.io.IOException -> L18
            r4.writeNoSecret(r1)     // Catch: java.io.IOException -> L18
            java.lang.String r1 = new java.lang.String     // Catch: java.io.IOException -> L18
            byte[] r2 = r0.toByteArray()     // Catch: java.io.IOException -> L18
            java.nio.charset.Charset r3 = com.google.crypto.tink.internal.Util.UTF_8     // Catch: java.io.IOException -> L18
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> L18
            return r1
        L18:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Serialize keyset failed"
            r1.<init>(r2)
            throw r1
    }
}
