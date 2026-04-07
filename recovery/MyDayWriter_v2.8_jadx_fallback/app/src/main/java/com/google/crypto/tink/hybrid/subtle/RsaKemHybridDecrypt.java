package com.google.crypto.tink.hybrid.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class RsaKemHybridDecrypt implements com.google.crypto.tink.HybridDecrypt {
    private final com.google.crypto.tink.aead.subtle.AeadFactory aeadFactory;
    private final java.lang.String hkdfHmacAlgo;
    private final byte[] hkdfSalt;
    private final java.security.interfaces.RSAPrivateKey recipientPrivateKey;

    public RsaKemHybridDecrypt(java.security.interfaces.RSAPrivateKey r2, java.lang.String r3, byte[] r4, com.google.crypto.tink.aead.subtle.AeadFactory r5) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            java.math.BigInteger r0 = r2.getModulus()
            com.google.crypto.tink.hybrid.subtle.RsaKem.validateRsaModulus(r0)
            r1.recipientPrivateKey = r2
            r1.hkdfSalt = r4
            r1.hkdfHmacAlgo = r3
            r1.aeadFactory = r5
            return
    }

    @Override // com.google.crypto.tink.HybridDecrypt
    public byte[] decrypt(byte[] r10, byte[] r11) throws java.security.GeneralSecurityException {
            r9 = this;
            java.security.interfaces.RSAPrivateKey r0 = r9.recipientPrivateKey
            java.math.BigInteger r0 = r0.getModulus()
            int r0 = com.google.crypto.tink.hybrid.subtle.RsaKem.bigIntSizeInBytes(r0)
            int r1 = r10.length
            if (r1 < r0) goto L4a
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r10)
            byte[] r2 = new byte[r0]
            r1.get(r2)
            java.lang.String r3 = "RSA/ECB/NoPadding"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r3)
            r4 = 2
            java.security.interfaces.RSAPrivateKey r5 = r9.recipientPrivateKey
            r3.init(r4, r5)
            byte[] r4 = r3.doFinal(r2)
            java.lang.String r5 = r9.hkdfHmacAlgo
            byte[] r6 = r9.hkdfSalt
            com.google.crypto.tink.aead.subtle.AeadFactory r7 = r9.aeadFactory
            int r7 = r7.getKeySizeInBytes()
            byte[] r5 = com.google.crypto.tink.subtle.Hkdf.computeHkdf(r5, r4, r6, r11, r7)
            com.google.crypto.tink.aead.subtle.AeadFactory r6 = r9.aeadFactory
            com.google.crypto.tink.Aead r6 = r6.createAead(r5)
            int r7 = r1.remaining()
            byte[] r7 = new byte[r7]
            r1.get(r7)
            byte[] r8 = com.google.crypto.tink.hybrid.subtle.RsaKem.EMPTY_AAD
            byte[] r8 = r6.decrypt(r7, r8)
            return r8
        L4a:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r3 = r10.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "Ciphertext must be of at least size %d bytes, but got %d"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.<init>(r2)
            throw r1
    }
}
