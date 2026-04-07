package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class EciesHkdfSenderKem {
    private final java.security.interfaces.ECPublicKey recipientPublicKey;

    public static final class KemKey {
        private final com.google.crypto.tink.util.Bytes kemBytes;
        private final com.google.crypto.tink.util.Bytes symmetricKey;

        public KemKey(byte[] r3, byte[] r4) {
                r2 = this;
                r2.<init>()
                if (r3 == 0) goto L1c
                if (r4 == 0) goto L14
                com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r3)
                r2.kemBytes = r0
                com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r4)
                r2.symmetricKey = r0
                return
            L14:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "symmetricKey must be non-null"
                r0.<init>(r1)
                throw r0
            L1c:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "KemBytes must be non-null"
                r0.<init>(r1)
                throw r0
        }

        public byte[] getKemBytes() {
                r1 = this;
                com.google.crypto.tink.util.Bytes r0 = r1.kemBytes
                byte[] r0 = r0.toByteArray()
                return r0
        }

        public byte[] getSymmetricKey() {
                r1 = this;
                com.google.crypto.tink.util.Bytes r0 = r1.symmetricKey
                byte[] r0 = r0.toByteArray()
                return r0
        }
    }

    public EciesHkdfSenderKem(java.security.interfaces.ECPublicKey r1) {
            r0 = this;
            r0.<init>()
            r0.recipientPublicKey = r1
            return
    }

    public com.google.crypto.tink.subtle.EciesHkdfSenderKem.KemKey generateKey(java.lang.String r11, byte[] r12, byte[] r13, int r14, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r15) throws java.security.GeneralSecurityException {
            r10 = this;
            java.security.interfaces.ECPublicKey r0 = r10.recipientPublicKey
            java.security.spec.ECParameterSpec r0 = r0.getParams()
            java.security.KeyPair r0 = com.google.crypto.tink.subtle.EllipticCurves.generateKeyPair(r0)
            java.security.PublicKey r1 = r0.getPublic()
            java.security.interfaces.ECPublicKey r1 = (java.security.interfaces.ECPublicKey) r1
            java.security.PrivateKey r2 = r0.getPrivate()
            java.security.interfaces.ECPrivateKey r2 = (java.security.interfaces.ECPrivateKey) r2
            java.security.interfaces.ECPublicKey r3 = r10.recipientPublicKey
            byte[] r5 = com.google.crypto.tink.subtle.EllipticCurves.computeSharedSecret(r2, r3)
            java.security.spec.ECParameterSpec r3 = r1.getParams()
            java.security.spec.EllipticCurve r3 = r3.getCurve()
            java.security.spec.ECPoint r4 = r1.getW()
            byte[] r4 = com.google.crypto.tink.subtle.EllipticCurves.pointEncode(r3, r15, r4)
            r6 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            byte[] r11 = com.google.crypto.tink.subtle.Hkdf.computeEciesHkdfSymmetricKey(r4, r5, r6, r7, r8, r9)
            com.google.crypto.tink.subtle.EciesHkdfSenderKem$KemKey r12 = new com.google.crypto.tink.subtle.EciesHkdfSenderKem$KemKey
            r12.<init>(r4, r11)
            return r12
    }
}
