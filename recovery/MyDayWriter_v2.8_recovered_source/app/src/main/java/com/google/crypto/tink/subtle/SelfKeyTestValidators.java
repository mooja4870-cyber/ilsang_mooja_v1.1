package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class SelfKeyTestValidators {
    private static final com.google.crypto.tink.shaded.protobuf.ByteString TEST_MESSAGE = null;

    static {
            java.lang.String r0 = "Tink and Wycheproof."
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
            com.google.crypto.tink.subtle.SelfKeyTestValidators.TEST_MESSAGE = r0
            return
    }

    private SelfKeyTestValidators() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final void validateEcdsa(java.security.interfaces.ECPrivateKey r5, java.security.interfaces.ECPublicKey r6, com.google.crypto.tink.subtle.Enums.HashType r7, com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding r8) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EcdsaSignJce r0 = new com.google.crypto.tink.subtle.EcdsaSignJce
            r0.<init>(r5, r7, r8)
            com.google.crypto.tink.subtle.EcdsaVerifyJce r1 = new com.google.crypto.tink.subtle.EcdsaVerifyJce
            r1.<init>(r6, r7, r8)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.subtle.SelfKeyTestValidators.TEST_MESSAGE     // Catch: java.security.GeneralSecurityException -> L1f
            byte[] r2 = r2.toByteArray()     // Catch: java.security.GeneralSecurityException -> L1f
            byte[] r2 = r0.sign(r2)     // Catch: java.security.GeneralSecurityException -> L1f
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = com.google.crypto.tink.subtle.SelfKeyTestValidators.TEST_MESSAGE     // Catch: java.security.GeneralSecurityException -> L1f
            byte[] r3 = r3.toByteArray()     // Catch: java.security.GeneralSecurityException -> L1f
            r1.verify(r2, r3)     // Catch: java.security.GeneralSecurityException -> L1f
            return
        L1f:
            r2 = move-exception
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "ECDSA signing with private key followed by verifying with public key failed. The key may be corrupted."
            r3.<init>(r4, r2)
            throw r3
    }

    public static final void validateRsaSsaPkcs1(java.security.interfaces.RSAPrivateCrtKey r5, java.security.interfaces.RSAPublicKey r6, com.google.crypto.tink.subtle.Enums.HashType r7) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce r0 = new com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce
            r0.<init>(r5, r7)
            com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce r1 = new com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce
            r1.<init>(r6, r7)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.subtle.SelfKeyTestValidators.TEST_MESSAGE     // Catch: java.security.GeneralSecurityException -> L1f
            byte[] r2 = r2.toByteArray()     // Catch: java.security.GeneralSecurityException -> L1f
            byte[] r2 = r0.sign(r2)     // Catch: java.security.GeneralSecurityException -> L1f
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = com.google.crypto.tink.subtle.SelfKeyTestValidators.TEST_MESSAGE     // Catch: java.security.GeneralSecurityException -> L1f
            byte[] r3 = r3.toByteArray()     // Catch: java.security.GeneralSecurityException -> L1f
            r1.verify(r2, r3)     // Catch: java.security.GeneralSecurityException -> L1f
            return
        L1f:
            r2 = move-exception
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "RSA PKCS1 signing with private key followed by verifying with public key failed. The key may be corrupted."
            r3.<init>(r4, r2)
            throw r3
    }

    public static final void validateRsaSsaPss(java.security.interfaces.RSAPrivateCrtKey r5, java.security.interfaces.RSAPublicKey r6, com.google.crypto.tink.subtle.Enums.HashType r7, com.google.crypto.tink.subtle.Enums.HashType r8, int r9) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.RsaSsaPssSignJce r0 = new com.google.crypto.tink.subtle.RsaSsaPssSignJce
            r0.<init>(r5, r7, r8, r9)
            com.google.crypto.tink.subtle.RsaSsaPssVerifyJce r1 = new com.google.crypto.tink.subtle.RsaSsaPssVerifyJce
            r1.<init>(r6, r7, r8, r9)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.subtle.SelfKeyTestValidators.TEST_MESSAGE     // Catch: java.security.GeneralSecurityException -> L1f
            byte[] r2 = r2.toByteArray()     // Catch: java.security.GeneralSecurityException -> L1f
            byte[] r2 = r0.sign(r2)     // Catch: java.security.GeneralSecurityException -> L1f
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = com.google.crypto.tink.subtle.SelfKeyTestValidators.TEST_MESSAGE     // Catch: java.security.GeneralSecurityException -> L1f
            byte[] r3 = r3.toByteArray()     // Catch: java.security.GeneralSecurityException -> L1f
            r1.verify(r2, r3)     // Catch: java.security.GeneralSecurityException -> L1f
            return
        L1f:
            r2 = move-exception
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "RSA PSS signing with private key followed by verifying with public key failed. The key may be corrupted."
            r3.<init>(r4, r2)
            throw r3
    }
}
