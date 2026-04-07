package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class RsaSsaPkcs1SignJce implements com.google.crypto.tink.PublicKeySign {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private final java.security.interfaces.RSAPrivateCrtKey privateKey;
    private final java.security.interfaces.RSAPublicKey publicKey;
    private final java.lang.String signatureAlgorithm;

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce.FIPS = r0
            return
    }

    public RsaSsaPkcs1SignJce(java.security.interfaces.RSAPrivateCrtKey r5, com.google.crypto.tink.subtle.Enums.HashType r6) throws java.security.GeneralSecurityException {
            r4 = this;
            r4.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L48
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(r6)
            java.math.BigInteger r0 = r5.getModulus()
            int r0 = r0.bitLength()
            com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(r0)
            java.math.BigInteger r0 = r5.getPublicExponent()
            com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(r0)
            r4.privateKey = r5
            java.lang.String r0 = com.google.crypto.tink.subtle.SubtleUtil.toRsaSsaPkcs1Algo(r6)
            r4.signatureAlgorithm = r0
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r0 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r1 = "RSA"
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.KeyFactory r0 = (java.security.KeyFactory) r0
            java.security.spec.RSAPublicKeySpec r1 = new java.security.spec.RSAPublicKeySpec
            java.math.BigInteger r2 = r5.getModulus()
            java.math.BigInteger r3 = r5.getPublicExponent()
            r1.<init>(r2, r3)
            java.security.PublicKey r1 = r0.generatePublic(r1)
            java.security.interfaces.RSAPublicKey r1 = (java.security.interfaces.RSAPublicKey) r1
            r4.publicKey = r1
            return
        L48:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public byte[] sign(byte[] r6) throws java.security.GeneralSecurityException {
            r5 = this;
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TSignature, java.security.Signature> r0 = com.google.crypto.tink.subtle.EngineFactory.SIGNATURE
            java.lang.String r1 = r5.signatureAlgorithm
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.Signature r0 = (java.security.Signature) r0
            java.security.interfaces.RSAPrivateCrtKey r1 = r5.privateKey
            r0.initSign(r1)
            r0.update(r6)
            byte[] r1 = r0.sign()
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TSignature, java.security.Signature> r2 = com.google.crypto.tink.subtle.EngineFactory.SIGNATURE
            java.lang.String r3 = r5.signatureAlgorithm
            java.lang.Object r2 = r2.getInstance(r3)
            java.security.Signature r2 = (java.security.Signature) r2
            java.security.interfaces.RSAPublicKey r3 = r5.publicKey
            r2.initVerify(r3)
            r2.update(r6)
            boolean r3 = r2.verify(r1)
            if (r3 == 0) goto L2f
            return r1
        L2f:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Security bug: RSA signature computation error"
            r3.<init>(r4)
            throw r3
    }
}
