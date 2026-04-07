package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class EciesAeadHkdfHybridDecrypt implements com.google.crypto.tink.HybridDecrypt {
    private static final byte[] EMPTY_AAD = null;
    private final com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper demHelper;
    private final com.google.crypto.tink.subtle.EllipticCurves.PointFormatType ecPointFormat;
    private final java.lang.String hkdfHmacAlgo;
    private final byte[] hkdfSalt;
    private final com.google.crypto.tink.subtle.EciesHkdfRecipientKem recipientKem;
    private final java.security.interfaces.ECPrivateKey recipientPrivateKey;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.crypto.tink.subtle.EciesAeadHkdfHybridDecrypt.EMPTY_AAD = r0
            return
    }

    public EciesAeadHkdfHybridDecrypt(java.security.interfaces.ECPrivateKey r2, byte[] r3, java.lang.String r4, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r5, com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper r6) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            r1.recipientPrivateKey = r2
            com.google.crypto.tink.subtle.EciesHkdfRecipientKem r0 = new com.google.crypto.tink.subtle.EciesHkdfRecipientKem
            r0.<init>(r2)
            r1.recipientKem = r0
            r1.hkdfSalt = r3
            r1.hkdfHmacAlgo = r4
            r1.ecPointFormat = r5
            r1.demHelper = r6
            return
    }

    @Override // com.google.crypto.tink.HybridDecrypt
    public byte[] decrypt(byte[] r11, byte[] r12) throws java.security.GeneralSecurityException {
            r10 = this;
            java.security.interfaces.ECPrivateKey r0 = r10.recipientPrivateKey
            java.security.spec.ECParameterSpec r0 = r0.getParams()
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r1 = r10.ecPointFormat
            int r1 = com.google.crypto.tink.subtle.EllipticCurves.encodingSizeInBytes(r0, r1)
            int r2 = r11.length
            if (r2 < r1) goto L3d
            r2 = 0
            byte[] r4 = java.util.Arrays.copyOfRange(r11, r2, r1)
            com.google.crypto.tink.subtle.EciesHkdfRecipientKem r3 = r10.recipientKem
            java.lang.String r5 = r10.hkdfHmacAlgo
            byte[] r6 = r10.hkdfSalt
            com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper r2 = r10.demHelper
            int r8 = r2.getSymmetricKeySizeInBytes()
            com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r9 = r10.ecPointFormat
            r7 = r12
            byte[] r12 = r3.generateKey(r4, r5, r6, r7, r8, r9)
            com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper r2 = r10.demHelper
            com.google.crypto.tink.hybrid.subtle.AeadOrDaead r2 = r2.getAeadOrDaead(r12)
            int r3 = r11.length
            byte[] r3 = java.util.Arrays.copyOfRange(r11, r1, r3)
            byte[] r5 = com.google.crypto.tink.subtle.EciesAeadHkdfHybridDecrypt.EMPTY_AAD
            byte[] r3 = r2.decrypt(r3, r5)
            return r3
        L3d:
            r7 = r12
            java.security.GeneralSecurityException r12 = new java.security.GeneralSecurityException
            java.lang.String r2 = "ciphertext too short"
            r12.<init>(r2)
            throw r12
    }
}
