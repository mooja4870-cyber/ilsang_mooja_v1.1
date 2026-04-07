package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
final class X25519HpkeKem implements com.google.crypto.tink.hybrid.internal.HpkeKem {
    private final com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf hkdf;

    X25519HpkeKem(com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r1) {
            r0 = this;
            r0.<init>()
            r0.hkdf = r1
            return
    }

    private byte[] deriveKemSharedSecret(byte[] r10, byte[] r11, byte[] r12) throws java.security.GeneralSecurityException {
            r9 = this;
            byte[][] r0 = new byte[][]{r11, r12}
            byte[] r5 = com.google.crypto.tink.subtle.Bytes.concat(r0)
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.X25519_HKDF_SHA256_KEM_ID
            byte[] r7 = com.google.crypto.tink.hybrid.internal.HpkeUtil.kemSuiteId(r0)
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r1 = r9.hkdf
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r0 = r9.hkdf
            int r8 = r0.getMacLength()
            r2 = 0
            java.lang.String r4 = "eae_prk"
            java.lang.String r6 = "shared_secret"
            r3 = r10
            byte[] r10 = r1.extractAndExpand(r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public byte[] decapsulate(byte[] r3, com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey r4) throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.util.Bytes r0 = r4.getSerializedPrivate()
            byte[] r0 = r0.toByteArray()
            byte[] r0 = com.google.crypto.tink.subtle.X25519.computeSharedSecret(r0, r3)
            com.google.crypto.tink.util.Bytes r1 = r4.getSerializedPublic()
            byte[] r1 = r1.toByteArray()
            byte[] r1 = r2.deriveKemSharedSecret(r0, r3, r1)
            return r1
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput encapsulate(byte[] r2) throws java.security.GeneralSecurityException {
            r1 = this;
            byte[] r0 = com.google.crypto.tink.subtle.X25519.generatePrivateKey()
            com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput r0 = r1.encapsulate(r2, r0)
            return r0
    }

    com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput encapsulate(byte[] r5, byte[] r6) throws java.security.GeneralSecurityException {
            r4 = this;
            byte[] r0 = com.google.crypto.tink.subtle.X25519.computeSharedSecret(r6, r5)
            byte[] r1 = com.google.crypto.tink.subtle.X25519.publicFromPrivate(r6)
            byte[] r2 = r4.deriveKemSharedSecret(r0, r1, r5)
            com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput r3 = new com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput
            r3.<init>(r2, r1)
            return r3
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public byte[] getKemId() throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r0 = r2.hkdf
            byte[] r0 = r0.getKdfId()
            byte[] r1 = com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA256_KDF_ID
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L11
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.X25519_HKDF_SHA256_KEM_ID
            return r0
        L11:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Could not determine HPKE KEM ID"
            r0.<init>(r1)
            throw r0
    }
}
