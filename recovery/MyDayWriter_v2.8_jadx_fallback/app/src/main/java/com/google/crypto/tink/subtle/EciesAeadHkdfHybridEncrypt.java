package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class EciesAeadHkdfHybridEncrypt implements com.google.crypto.tink.HybridEncrypt {
    private static final byte[] EMPTY_AAD = null;
    private final com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper demHelper;
    private final com.google.crypto.tink.subtle.EllipticCurves.PointFormatType ecPointFormat;
    private final java.lang.String hkdfHmacAlgo;
    private final byte[] hkdfSalt;
    private final com.google.crypto.tink.subtle.EciesHkdfSenderKem senderKem;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.crypto.tink.subtle.EciesAeadHkdfHybridEncrypt.EMPTY_AAD = r0
            return
    }

    public EciesAeadHkdfHybridEncrypt(java.security.interfaces.ECPublicKey r2, byte[] r3, java.lang.String r4, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r5, com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper r6) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.subtle.EllipticCurves.checkPublicKey(r2)
            com.google.crypto.tink.subtle.EciesHkdfSenderKem r0 = new com.google.crypto.tink.subtle.EciesHkdfSenderKem
            r0.<init>(r2)
            r1.senderKem = r0
            r1.hkdfSalt = r3
            r1.hkdfHmacAlgo = r4
            r1.ecPointFormat = r5
            r1.demHelper = r6
            return
    }

    @Override // com.google.crypto.tink.HybridEncrypt
    public byte[] encrypt(byte[] r7, byte[] r8) throws java.security.GeneralSecurityException {
            r6 = this;
            com.google.crypto.tink.subtle.EciesHkdfSenderKem r0 = r6.senderKem
            java.lang.String r1 = r6.hkdfHmacAlgo
            byte[] r2 = r6.hkdfSalt
            com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper r3 = r6.demHelper
            int r4 = r3.getSymmetricKeySizeInBytes()
            com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r5 = r6.ecPointFormat
            r3 = r8
            com.google.crypto.tink.subtle.EciesHkdfSenderKem$KemKey r8 = r0.generateKey(r1, r2, r3, r4, r5)
            com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper r0 = r6.demHelper
            byte[] r1 = r8.getSymmetricKey()
            com.google.crypto.tink.hybrid.subtle.AeadOrDaead r0 = r0.getAeadOrDaead(r1)
            byte[] r1 = com.google.crypto.tink.subtle.EciesAeadHkdfHybridEncrypt.EMPTY_AAD
            byte[] r1 = r0.encrypt(r7, r1)
            byte[] r2 = r8.getKemBytes()
            int r4 = r2.length
            int r5 = r1.length
            int r4 = r4 + r5
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            java.nio.ByteBuffer r4 = r4.put(r2)
            java.nio.ByteBuffer r4 = r4.put(r1)
            byte[] r4 = r4.array()
            return r4
    }
}
