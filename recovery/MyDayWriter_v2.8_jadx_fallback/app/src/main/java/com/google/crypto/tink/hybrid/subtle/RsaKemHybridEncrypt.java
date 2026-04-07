package com.google.crypto.tink.hybrid.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class RsaKemHybridEncrypt implements com.google.crypto.tink.HybridEncrypt {
    private final com.google.crypto.tink.aead.subtle.AeadFactory aeadFactory;
    private final java.lang.String hkdfHmacAlgo;
    private final byte[] hkdfSalt;
    private final java.security.interfaces.RSAPublicKey recipientPublicKey;

    public RsaKemHybridEncrypt(java.security.interfaces.RSAPublicKey r2, java.lang.String r3, byte[] r4, com.google.crypto.tink.aead.subtle.AeadFactory r5) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            java.math.BigInteger r0 = r2.getModulus()
            com.google.crypto.tink.hybrid.subtle.RsaKem.validateRsaModulus(r0)
            r1.recipientPublicKey = r2
            r1.hkdfHmacAlgo = r3
            r1.hkdfSalt = r4
            r1.aeadFactory = r5
            return
    }

    @Override // com.google.crypto.tink.HybridEncrypt
    public byte[] encrypt(byte[] r10, byte[] r11) throws java.security.GeneralSecurityException {
            r9 = this;
            java.security.interfaces.RSAPublicKey r0 = r9.recipientPublicKey
            java.math.BigInteger r0 = r0.getModulus()
            byte[] r1 = com.google.crypto.tink.hybrid.subtle.RsaKem.generateSecret(r0)
            java.lang.String r2 = "RSA/ECB/NoPadding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)
            r3 = 1
            java.security.interfaces.RSAPublicKey r4 = r9.recipientPublicKey
            r2.init(r3, r4)
            byte[] r3 = r2.doFinal(r1)
            java.lang.String r4 = r9.hkdfHmacAlgo
            byte[] r5 = r9.hkdfSalt
            com.google.crypto.tink.aead.subtle.AeadFactory r6 = r9.aeadFactory
            int r6 = r6.getKeySizeInBytes()
            byte[] r4 = com.google.crypto.tink.subtle.Hkdf.computeHkdf(r4, r1, r5, r11, r6)
            com.google.crypto.tink.aead.subtle.AeadFactory r5 = r9.aeadFactory
            com.google.crypto.tink.Aead r5 = r5.createAead(r4)
            byte[] r6 = com.google.crypto.tink.hybrid.subtle.RsaKem.EMPTY_AAD
            byte[] r6 = r5.encrypt(r10, r6)
            int r7 = r3.length
            int r8 = r6.length
            int r7 = r7 + r8
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r7)
            java.nio.ByteBuffer r7 = r7.put(r3)
            java.nio.ByteBuffer r7 = r7.put(r6)
            byte[] r7 = r7.array()
            return r7
    }
}
