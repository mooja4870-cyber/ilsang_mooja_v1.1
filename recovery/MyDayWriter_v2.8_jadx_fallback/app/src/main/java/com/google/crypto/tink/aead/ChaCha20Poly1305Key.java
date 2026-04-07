package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class ChaCha20Poly1305Key extends com.google.crypto.tink.aead.AeadKey {

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final com.google.crypto.tink.util.SecretBytes keyBytes;
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.aead.ChaCha20Poly1305Parameters parameters;

    private ChaCha20Poly1305Key(com.google.crypto.tink.aead.ChaCha20Poly1305Parameters r1, com.google.crypto.tink.util.SecretBytes r2, com.google.crypto.tink.util.Bytes r3, @javax.annotation.Nullable java.lang.Integer r4) {
            r0 = this;
            r0.<init>()
            r0.parameters = r1
            r0.keyBytes = r2
            r0.outputPrefix = r3
            r0.idRequirement = r4
            return
    }

    public static com.google.crypto.tink.aead.ChaCha20Poly1305Key create(com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant r3, com.google.crypto.tink.util.SecretBytes r4, @javax.annotation.Nullable java.lang.Integer r5) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r0 = com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.NO_PREFIX
            if (r3 == r0) goto L26
            if (r5 == 0) goto L7
            goto L26
        L7:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "For given Variant "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " the value of idRequirement must be non-null"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L26:
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r0 = com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.NO_PREFIX
            if (r3 != r0) goto L35
            if (r5 != 0) goto L2d
            goto L35
        L2d:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "For given Variant NO_PREFIX the value of idRequirement must be null"
            r0.<init>(r1)
            throw r0
        L35:
            int r0 = r4.size()
            r1 = 32
            if (r0 != r1) goto L4b
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters r0 = com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.create(r3)
            com.google.crypto.tink.aead.ChaCha20Poly1305Key r1 = new com.google.crypto.tink.aead.ChaCha20Poly1305Key
            com.google.crypto.tink.util.Bytes r2 = getOutputPrefix(r0, r5)
            r1.<init>(r0, r4, r2, r5)
            return r1
        L4b:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r4.size()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static com.google.crypto.tink.aead.ChaCha20Poly1305Key create(com.google.crypto.tink.util.SecretBytes r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r0 = com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.NO_PREFIX
            r1 = 0
            com.google.crypto.tink.aead.ChaCha20Poly1305Key r0 = create(r0, r2, r1)
            return r0
    }

    private static com.google.crypto.tink.util.Bytes getOutputPrefix(com.google.crypto.tink.aead.ChaCha20Poly1305Parameters r4, @javax.annotation.Nullable java.lang.Integer r5) {
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r0 = r4.getVariant()
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r1 = com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.NO_PREFIX
            r2 = 0
            if (r0 != r1) goto L10
            byte[] r0 = new byte[r2]
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r0)
            return r0
        L10:
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r0 = r4.getVariant()
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r1 = com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.CRUNCHY
            r3 = 5
            if (r0 != r1) goto L32
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r3)
            java.nio.ByteBuffer r0 = r0.put(r2)
            int r1 = r5.intValue()
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            byte[] r0 = r0.array()
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r0)
            return r0
        L32:
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r0 = r4.getVariant()
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r1 = com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.TINK
            if (r0 != r1) goto L54
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r3)
            r1 = 1
            java.nio.ByteBuffer r0 = r0.put(r1)
            int r1 = r5.intValue()
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            byte[] r0 = r0.array()
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r0)
            return r0
        L54:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown Variant: "
            java.lang.StringBuilder r1 = r1.append(r2)
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters$Variant r2 = r4.getVariant()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(com.google.crypto.tink.Key r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.crypto.tink.aead.ChaCha20Poly1305Key
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r5
            com.google.crypto.tink.aead.ChaCha20Poly1305Key r0 = (com.google.crypto.tink.aead.ChaCha20Poly1305Key) r0
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters r2 = r0.parameters
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters r3 = r4.parameters
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L29
            com.google.crypto.tink.util.SecretBytes r2 = r0.keyBytes
            com.google.crypto.tink.util.SecretBytes r3 = r4.keyBytes
            boolean r2 = r2.equalsSecretBytes(r3)
            if (r2 == 0) goto L29
            java.lang.Integer r2 = r0.idRequirement
            java.lang.Integer r3 = r4.idRequirement
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L29
            r1 = 1
            goto L2a
        L29:
        L2a:
            return r1
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public java.lang.Integer getIdRequirementOrNull() {
            r1 = this;
            java.lang.Integer r0 = r1.idRequirement
            return r0
    }

    public com.google.crypto.tink.util.SecretBytes getKeyBytes() {
            r1 = this;
            com.google.crypto.tink.util.SecretBytes r0 = r1.keyBytes
            return r0
    }

    @Override // com.google.crypto.tink.aead.AeadKey
    public com.google.crypto.tink.util.Bytes getOutputPrefix() {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r1.outputPrefix
            return r0
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ com.google.crypto.tink.Parameters getParameters() {
            r1 = this;
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters r0 = r1.getParameters()
            return r0
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ com.google.crypto.tink.aead.AeadParameters getParameters() {
            r1 = this;
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters r0 = r1.getParameters()
            return r0
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public com.google.crypto.tink.aead.ChaCha20Poly1305Parameters getParameters() {
            r1 = this;
            com.google.crypto.tink.aead.ChaCha20Poly1305Parameters r0 = r1.parameters
            return r0
    }
}
