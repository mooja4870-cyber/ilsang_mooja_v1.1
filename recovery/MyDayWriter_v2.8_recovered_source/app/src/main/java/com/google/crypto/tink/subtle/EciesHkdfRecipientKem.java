package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class EciesHkdfRecipientKem {
    private java.security.interfaces.ECPrivateKey recipientPrivateKey;

    public EciesHkdfRecipientKem(java.security.interfaces.ECPrivateKey r1) {
            r0 = this;
            r0.<init>()
            r0.recipientPrivateKey = r1
            return
    }

    public byte[] generateKey(byte[] r9, java.lang.String r10, byte[] r11, byte[] r12, int r13, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r14) throws java.security.GeneralSecurityException {
            r8 = this;
            java.security.interfaces.ECPrivateKey r0 = r8.recipientPrivateKey
            java.security.spec.ECParameterSpec r0 = r0.getParams()
            java.security.interfaces.ECPublicKey r0 = com.google.crypto.tink.subtle.EllipticCurves.getEcPublicKey(r0, r14, r9)
            java.security.interfaces.ECPrivateKey r1 = r8.recipientPrivateKey
            byte[] r3 = com.google.crypto.tink.subtle.EllipticCurves.computeSharedSecret(r1, r0)
            r2 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            byte[] r9 = com.google.crypto.tink.subtle.Hkdf.computeEciesHkdfSymmetricKey(r2, r3, r4, r5, r6, r7)
            return r9
    }
}
