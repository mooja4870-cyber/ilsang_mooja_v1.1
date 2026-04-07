package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class EcdsaVerifyJce implements com.google.crypto.tink.PublicKeyVerify {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private final com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding encoding;
    private final java.security.interfaces.ECPublicKey publicKey;
    private final java.lang.String signatureAlgorithm;

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            com.google.crypto.tink.subtle.EcdsaVerifyJce.FIPS = r0
            return
    }

    public EcdsaVerifyJce(java.security.interfaces.ECPublicKey r3, com.google.crypto.tink.subtle.Enums.HashType r4, com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding r5) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.EcdsaVerifyJce.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L19
            com.google.crypto.tink.subtle.EllipticCurves.checkPublicKey(r3)
            java.lang.String r0 = com.google.crypto.tink.subtle.SubtleUtil.toEcdsaAlgo(r4)
            r2.signatureAlgorithm = r0
            r2.publicKey = r3
            r2.encoding = r5
            return
        L19:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Can not use ECDSA in FIPS-mode, as BoringCrypto is not available."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] r7, byte[] r8) throws java.security.GeneralSecurityException {
            r6 = this;
            r0 = r7
            com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r1 = r6.encoding
            com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r2 = com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.IEEE_P1363
            r3 = 2
            java.lang.String r4 = "Invalid signature"
            if (r1 != r2) goto L27
            java.security.interfaces.ECPublicKey r1 = r6.publicKey
            java.security.spec.ECParameterSpec r1 = r1.getParams()
            java.security.spec.EllipticCurve r1 = r1.getCurve()
            int r2 = r7.length
            int r5 = com.google.crypto.tink.subtle.EllipticCurves.fieldSizeInBytes(r1)
            int r5 = r5 * r3
            if (r2 != r5) goto L21
            byte[] r0 = com.google.crypto.tink.subtle.EllipticCurves.ecdsaIeee2Der(r7)
            goto L27
        L21:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            r2.<init>(r4)
            throw r2
        L27:
            boolean r1 = com.google.crypto.tink.subtle.EllipticCurves.isValidDerEncoding(r0)
            if (r1 == 0) goto L66
            r1 = 3
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r5 = "GmsCore_OpenSSL"
            r1[r2] = r5
            r2 = 1
            java.lang.String r5 = "AndroidOpenSSL"
            r1[r2] = r5
            java.lang.String r2 = "Conscrypt"
            r1[r3] = r2
            java.util.List r1 = com.google.crypto.tink.subtle.EngineFactory.toProviderList(r1)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TSignature, java.security.Signature> r2 = com.google.crypto.tink.subtle.EngineFactory.SIGNATURE
            java.lang.String r3 = r6.signatureAlgorithm
            java.lang.Object r2 = r2.getInstance(r3, r1)
            java.security.Signature r2 = (java.security.Signature) r2
            java.security.interfaces.ECPublicKey r3 = r6.publicKey
            r2.initVerify(r3)
            r2.update(r8)
            r3 = 0
            boolean r5 = r2.verify(r0)     // Catch: java.lang.RuntimeException -> L5a
            goto L5d
        L5a:
            r5 = move-exception
            r3 = 0
            r5 = r3
        L5d:
            if (r5 == 0) goto L60
            return
        L60:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r4)
            throw r3
        L66:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            r1.<init>(r4)
            throw r1
    }
}
