package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class EcdsaSignJce implements com.google.crypto.tink.PublicKeySign {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private final com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding encoding;
    private final java.security.interfaces.ECPrivateKey privateKey;
    private final java.lang.String signatureAlgorithm;

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            com.google.crypto.tink.subtle.EcdsaSignJce.FIPS = r0
            return
    }

    public EcdsaSignJce(java.security.interfaces.ECPrivateKey r3, com.google.crypto.tink.subtle.Enums.HashType r4, com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding r5) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.EcdsaSignJce.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L16
            r2.privateKey = r3
            java.lang.String r0 = com.google.crypto.tink.subtle.SubtleUtil.toEcdsaAlgo(r4)
            r2.signatureAlgorithm = r0
            r2.encoding = r5
            return
        L16:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Can not use ECDSA in FIPS-mode, as BoringCrypto is not available."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public byte[] sign(byte[] r7) throws java.security.GeneralSecurityException {
            r6 = this;
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "GmsCore_OpenSSL"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "AndroidOpenSSL"
            r0[r1] = r2
            java.lang.String r1 = "Conscrypt"
            r2 = 2
            r0[r2] = r1
            java.util.List r0 = com.google.crypto.tink.subtle.EngineFactory.toProviderList(r0)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TSignature, java.security.Signature> r1 = com.google.crypto.tink.subtle.EngineFactory.SIGNATURE
            java.lang.String r3 = r6.signatureAlgorithm
            java.lang.Object r1 = r1.getInstance(r3, r0)
            java.security.Signature r1 = (java.security.Signature) r1
            java.security.interfaces.ECPrivateKey r3 = r6.privateKey
            r1.initSign(r3)
            r1.update(r7)
            byte[] r3 = r1.sign()
            com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r4 = r6.encoding
            com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r5 = com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.IEEE_P1363
            if (r4 != r5) goto L46
            java.security.interfaces.ECPrivateKey r4 = r6.privateKey
            java.security.spec.ECParameterSpec r4 = r4.getParams()
            java.security.spec.EllipticCurve r4 = r4.getCurve()
            int r5 = com.google.crypto.tink.subtle.EllipticCurves.fieldSizeInBytes(r4)
            int r5 = r5 * r2
            byte[] r3 = com.google.crypto.tink.subtle.EllipticCurves.ecdsaDer2Ieee(r3, r5)
        L46:
            return r3
    }
}
