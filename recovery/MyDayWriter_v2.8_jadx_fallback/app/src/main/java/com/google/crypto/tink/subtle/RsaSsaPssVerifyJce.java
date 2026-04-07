package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class RsaSsaPssVerifyJce implements com.google.crypto.tink.PublicKeyVerify {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private final com.google.crypto.tink.subtle.Enums.HashType mgf1Hash;
    private final java.security.interfaces.RSAPublicKey publicKey;
    private final int saltLength;
    private final com.google.crypto.tink.subtle.Enums.HashType sigHash;

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            com.google.crypto.tink.subtle.RsaSsaPssVerifyJce.FIPS = r0
            return
    }

    public RsaSsaPssVerifyJce(java.security.interfaces.RSAPublicKey r3, com.google.crypto.tink.subtle.Enums.HashType r4, com.google.crypto.tink.subtle.Enums.HashType r5, int r6) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.RsaSsaPssVerifyJce.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L29
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(r4)
            java.math.BigInteger r0 = r3.getModulus()
            int r0 = r0.bitLength()
            com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(r0)
            java.math.BigInteger r0 = r3.getPublicExponent()
            com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(r0)
            r2.publicKey = r3
            r2.sigHash = r4
            r2.mgf1Hash = r5
            r2.saltLength = r6
            return
        L29:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available."
            r0.<init>(r1)
            throw r0
    }

    private void emsaPssVerify(byte[] r24, byte[] r25, int r26) throws java.security.GeneralSecurityException {
            r23 = this;
            r0 = r23
            r1 = r25
            r2 = r26
            com.google.crypto.tink.subtle.Enums$HashType r3 = r0.sigHash
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(r3)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMessageDigest, java.security.MessageDigest> r3 = com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST
            com.google.crypto.tink.subtle.Enums$HashType r4 = r0.sigHash
            java.lang.String r4 = com.google.crypto.tink.subtle.SubtleUtil.toDigestAlgo(r4)
            java.lang.Object r3 = r3.getInstance(r4)
            java.security.MessageDigest r3 = (java.security.MessageDigest) r3
            r4 = r24
            byte[] r5 = r3.digest(r4)
            int r6 = r3.getDigestLength()
            int r7 = r1.length
            int r8 = r0.saltLength
            int r8 = r8 + r6
            int r8 = r8 + 2
            java.lang.String r9 = "inconsistent"
            if (r7 < r8) goto L116
            int r8 = r1.length
            r10 = 1
            int r8 = r8 - r10
            r8 = r1[r8]
            r11 = -68
            if (r8 != r11) goto L110
            int r8 = r7 - r6
            int r8 = r8 - r10
            byte[] r8 = java.util.Arrays.copyOf(r1, r8)
            int r11 = r8.length
            int r12 = r8.length
            int r12 = r12 + r6
            byte[] r11 = java.util.Arrays.copyOfRange(r1, r11, r12)
            r12 = 0
        L45:
            long r13 = (long) r12
            r15 = r10
            r16 = r11
            long r10 = (long) r7
            r17 = 8
            long r10 = r10 * r17
            r19 = r10
            long r10 = (long) r2
            long r10 = r19 - r10
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 >= 0) goto L6f
            int r10 = r12 / 8
            int r11 = r12 % 8
            int r11 = 7 - r11
            r13 = r8[r10]
            int r13 = r13 >> r11
            r13 = r13 & r15
            if (r13 != 0) goto L69
            int r12 = r12 + 1
            r10 = r15
            r11 = r16
            goto L45
        L69:
            java.security.GeneralSecurityException r13 = new java.security.GeneralSecurityException
            r13.<init>(r9)
            throw r13
        L6f:
            int r10 = r7 - r6
            int r10 = r10 - r15
            com.google.crypto.tink.subtle.Enums$HashType r11 = r0.mgf1Hash
            r12 = r16
            byte[] r10 = com.google.crypto.tink.subtle.SubtleUtil.mgf1(r12, r10, r11)
            int r11 = r10.length
            byte[] r11 = new byte[r11]
            r13 = 0
        L7e:
            int r14 = r11.length
            if (r13 >= r14) goto L8d
            r14 = r10[r13]
            r16 = r8[r13]
            r14 = r14 ^ r16
            byte r14 = (byte) r14
            r11[r13] = r14
            int r13 = r13 + 1
            goto L7e
        L8d:
            r13 = 0
        L8e:
            r16 = r15
            long r14 = (long) r13
            r19 = r13
            r20 = r14
            long r13 = (long) r7
            long r13 = r13 * r17
            r15 = r6
            r22 = r7
            long r6 = (long) r2
            long r13 = r13 - r6
            int r6 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
            if (r6 > 0) goto Lb8
            int r13 = r19 / 8
            int r6 = r19 % 8
            int r6 = 7 - r6
            r7 = r11[r13]
            int r14 = r16 << r6
            int r14 = ~r14
            r7 = r7 & r14
            byte r7 = (byte) r7
            r11[r13] = r7
            int r13 = r19 + 1
            r6 = r15
            r15 = r16
            r7 = r22
            goto L8e
        Lb8:
            r6 = 0
        Lb9:
            int r7 = r22 - r15
            int r13 = r0.saltLength
            int r7 = r7 - r13
            int r7 = r7 + (-2)
            if (r6 >= r7) goto Lcf
            r7 = r11[r6]
            if (r7 != 0) goto Lc9
            int r6 = r6 + 1
            goto Lb9
        Lc9:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            r7.<init>(r9)
            throw r7
        Lcf:
            int r7 = r22 - r15
            int r6 = r0.saltLength
            int r7 = r7 - r6
            int r7 = r7 + (-2)
            r6 = r11[r7]
            r7 = r16
            if (r6 != r7) goto L10a
            int r6 = r11.length
            int r7 = r0.saltLength
            int r6 = r6 - r7
            int r7 = r11.length
            byte[] r6 = java.util.Arrays.copyOfRange(r11, r6, r7)
            int r7 = r15 + 8
            int r13 = r0.saltLength
            int r7 = r7 + r13
            byte[] r7 = new byte[r7]
            int r13 = r5.length
            r14 = 0
            r0 = 8
            java.lang.System.arraycopy(r5, r14, r7, r0, r13)
            int r0 = r15 + 8
            int r13 = r6.length
            java.lang.System.arraycopy(r6, r14, r7, r0, r13)
            byte[] r0 = r3.digest(r7)
            boolean r13 = com.google.crypto.tink.subtle.Bytes.equal(r0, r12)
            if (r13 == 0) goto L104
            return
        L104:
            java.security.GeneralSecurityException r13 = new java.security.GeneralSecurityException
            r13.<init>(r9)
            throw r13
        L10a:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r9)
            throw r0
        L110:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r9)
            throw r0
        L116:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r9)
            throw r0
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] r9, byte[] r10) throws java.security.GeneralSecurityException {
            r8 = this;
            java.security.interfaces.RSAPublicKey r0 = r8.publicKey
            java.math.BigInteger r0 = r0.getPublicExponent()
            java.security.interfaces.RSAPublicKey r1 = r8.publicKey
            java.math.BigInteger r1 = r1.getModulus()
            int r2 = r1.bitLength()
            int r2 = r2 + 7
            int r2 = r2 / 8
            int r3 = r1.bitLength()
            int r3 = r3 + (-1)
            int r3 = r3 + 7
            int r3 = r3 / 8
            int r4 = r9.length
            if (r2 != r4) goto L45
            java.math.BigInteger r4 = com.google.crypto.tink.subtle.SubtleUtil.bytes2Integer(r9)
            int r5 = r4.compareTo(r1)
            if (r5 >= 0) goto L3d
            java.math.BigInteger r5 = r4.modPow(r0, r1)
            byte[] r6 = com.google.crypto.tink.subtle.SubtleUtil.integer2Bytes(r5, r3)
            int r7 = r1.bitLength()
            int r7 = r7 + (-1)
            r8.emsaPssVerify(r10, r6, r7)
            return
        L3d:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r6 = "signature out of range"
            r5.<init>(r6)
            throw r5
        L45:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "invalid signature's length"
            r4.<init>(r5)
            throw r4
    }
}
