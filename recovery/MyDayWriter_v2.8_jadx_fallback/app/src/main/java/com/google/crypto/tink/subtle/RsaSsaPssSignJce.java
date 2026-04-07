package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class RsaSsaPssSignJce implements com.google.crypto.tink.PublicKeySign {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private static final java.lang.String RAW_RSA_ALGORITHM = "RSA/ECB/NOPADDING";
    private final com.google.crypto.tink.subtle.Enums.HashType mgf1Hash;
    private final java.security.interfaces.RSAPrivateCrtKey privateKey;
    private final java.security.interfaces.RSAPublicKey publicKey;
    private final int saltLength;
    private final com.google.crypto.tink.subtle.Enums.HashType sigHash;

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            com.google.crypto.tink.subtle.RsaSsaPssSignJce.FIPS = r0
            return
    }

    public RsaSsaPssSignJce(java.security.interfaces.RSAPrivateCrtKey r5, com.google.crypto.tink.subtle.Enums.HashType r6, com.google.crypto.tink.subtle.Enums.HashType r7, int r8) throws java.security.GeneralSecurityException {
            r4 = this;
            r4.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.RsaSsaPssSignJce.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L48
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(r6)
            java.math.BigInteger r0 = r5.getModulus()
            int r0 = r0.bitLength()
            com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(r0)
            java.math.BigInteger r0 = r5.getPublicExponent()
            com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(r0)
            r4.privateKey = r5
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
            r4.sigHash = r6
            r4.mgf1Hash = r7
            r4.saltLength = r8
            return
        L48:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available."
            r0.<init>(r1)
            throw r0
    }

    private byte[] emsaPssEncode(byte[] r22, int r23) throws java.security.GeneralSecurityException {
            r21 = this;
            r0 = r21
            r1 = r23
            com.google.crypto.tink.subtle.Enums$HashType r2 = r0.sigHash
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(r2)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMessageDigest, java.security.MessageDigest> r2 = com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST
            com.google.crypto.tink.subtle.Enums$HashType r3 = r0.sigHash
            java.lang.String r3 = com.google.crypto.tink.subtle.SubtleUtil.toDigestAlgo(r3)
            java.lang.Object r2 = r2.getInstance(r3)
            java.security.MessageDigest r2 = (java.security.MessageDigest) r2
            r3 = r22
            byte[] r4 = r2.digest(r3)
            int r5 = r2.getDigestLength()
            int r6 = r1 + (-1)
            r7 = 8
            int r6 = r6 / r7
            r8 = 1
            int r6 = r6 + r8
            int r9 = r0.saltLength
            int r9 = r9 + r5
            int r9 = r9 + 2
            if (r6 < r9) goto Lc8
            int r9 = r0.saltLength
            byte[] r9 = com.google.crypto.tink.subtle.Random.randBytes(r9)
            int r10 = r5 + 8
            int r11 = r0.saltLength
            int r10 = r10 + r11
            byte[] r10 = new byte[r10]
            r11 = 0
            java.lang.System.arraycopy(r4, r11, r10, r7, r5)
            int r7 = r5 + 8
            int r12 = r9.length
            java.lang.System.arraycopy(r9, r11, r10, r7, r12)
            byte[] r7 = r2.digest(r10)
            int r12 = r6 - r5
            int r12 = r12 - r8
            byte[] r12 = new byte[r12]
            int r13 = r0.saltLength
            int r13 = r6 - r13
            int r13 = r13 - r5
            int r13 = r13 + (-2)
            r12[r13] = r8
            int r13 = r0.saltLength
            int r13 = r6 - r13
            int r13 = r13 - r5
            int r13 = r13 - r8
            int r14 = r9.length
            java.lang.System.arraycopy(r9, r11, r12, r13, r14)
            int r13 = r6 - r5
            int r13 = r13 - r8
            com.google.crypto.tink.subtle.Enums$HashType r14 = r0.mgf1Hash
            byte[] r13 = com.google.crypto.tink.subtle.SubtleUtil.mgf1(r7, r13, r14)
            int r14 = r6 - r5
            int r14 = r14 - r8
            byte[] r14 = new byte[r14]
            r15 = 0
        L71:
            r16 = r8
            int r8 = r14.length
            if (r15 >= r8) goto L84
            r8 = r12[r15]
            r17 = r13[r15]
            r8 = r8 ^ r17
            byte r8 = (byte) r8
            r14[r15] = r8
            int r15 = r15 + 1
            r8 = r16
            goto L71
        L84:
            r8 = 0
        L85:
            r17 = r12
            long r11 = (long) r8
            r18 = r2
            long r2 = (long) r6
            r19 = 8
            long r2 = r2 * r19
            r19 = r2
            long r2 = (long) r1
            long r2 = r19 - r2
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 >= 0) goto Lb1
            int r2 = r8 / 8
            int r3 = r8 % 8
            int r3 = 7 - r3
            r11 = r14[r2]
            int r12 = r16 << r3
            int r12 = ~r12
            r11 = r11 & r12
            byte r11 = (byte) r11
            r14[r2] = r11
            int r8 = r8 + 1
            r3 = r22
            r12 = r17
            r2 = r18
            r11 = 0
            goto L85
        Lb1:
            int r2 = r14.length
            int r2 = r2 + r5
            int r2 = r2 + 1
            byte[] r2 = new byte[r2]
            int r3 = r14.length
            r15 = 0
            java.lang.System.arraycopy(r14, r15, r2, r15, r3)
            int r3 = r14.length
            int r8 = r7.length
            java.lang.System.arraycopy(r7, r15, r2, r3, r8)
            int r3 = r14.length
            int r3 = r3 + r5
            r8 = -68
            r2[r3] = r8
            return r2
        Lc8:
            r18 = r2
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "encoding error"
            r2.<init>(r3)
            throw r2
    }

    private byte[] rsasp1(byte[] r8) throws java.security.GeneralSecurityException {
            r7 = this;
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TCipher, javax.crypto.Cipher> r0 = com.google.crypto.tink.subtle.EngineFactory.CIPHER
            java.lang.String r1 = "RSA/ECB/NOPADDING"
            java.lang.Object r0 = r0.getInstance(r1)
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            r2 = 2
            java.security.interfaces.RSAPrivateCrtKey r3 = r7.privateKey
            r0.init(r2, r3)
            byte[] r2 = r0.doFinal(r8)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TCipher, javax.crypto.Cipher> r3 = com.google.crypto.tink.subtle.EngineFactory.CIPHER
            java.lang.Object r1 = r3.getInstance(r1)
            javax.crypto.Cipher r1 = (javax.crypto.Cipher) r1
            java.security.interfaces.RSAPublicKey r3 = r7.publicKey
            r4 = 1
            r1.init(r4, r3)
            byte[] r3 = r1.doFinal(r2)
            java.math.BigInteger r5 = new java.math.BigInteger
            r5.<init>(r4, r8)
            java.math.BigInteger r6 = new java.math.BigInteger
            r6.<init>(r4, r3)
            boolean r4 = r5.equals(r6)
            if (r4 == 0) goto L37
            return r2
        L37:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "Security bug: RSA signature computation error"
            r4.<init>(r5)
            throw r4
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public byte[] sign(byte[] r4) throws java.security.GeneralSecurityException {
            r3 = this;
            java.security.interfaces.RSAPublicKey r0 = r3.publicKey
            java.math.BigInteger r0 = r0.getModulus()
            int r0 = r0.bitLength()
            int r1 = r0 + (-1)
            byte[] r1 = r3.emsaPssEncode(r4, r1)
            byte[] r2 = r3.rsasp1(r1)
            return r2
    }
}
