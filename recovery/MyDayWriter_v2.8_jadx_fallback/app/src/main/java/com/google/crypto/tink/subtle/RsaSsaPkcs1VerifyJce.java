package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class RsaSsaPkcs1VerifyJce implements com.google.crypto.tink.PublicKeyVerify {
    private static final java.lang.String ASN_PREFIX_SHA256 = "3031300d060960864801650304020105000420";
    private static final java.lang.String ASN_PREFIX_SHA384 = "3041300d060960864801650304020205000430";
    private static final java.lang.String ASN_PREFIX_SHA512 = "3051300d060960864801650304020305000440";
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private final com.google.crypto.tink.subtle.Enums.HashType hash;
    private final java.security.interfaces.RSAPublicKey publicKey;

    /* JADX INFO: renamed from: com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = null;

        static {
                com.google.crypto.tink.subtle.Enums$HashType[] r0 = com.google.crypto.tink.subtle.Enums.HashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = r0
                int[] r0 = com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                return
        }
    }

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce.FIPS = r0
            return
    }

    public RsaSsaPkcs1VerifyJce(java.security.interfaces.RSAPublicKey r3, com.google.crypto.tink.subtle.Enums.HashType r4) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L25
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(r4)
            java.math.BigInteger r0 = r3.getModulus()
            int r0 = r0.bitLength()
            com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(r0)
            java.math.BigInteger r0 = r3.getPublicExponent()
            com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(r0)
            r2.publicKey = r3
            r2.hash = r4
            return
        L25:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available."
            r0.<init>(r1)
            throw r0
    }

    private byte[] emsaPkcs1(byte[] r11, int r12, com.google.crypto.tink.subtle.Enums.HashType r13) throws java.security.GeneralSecurityException {
            r10 = this;
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(r13)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMessageDigest, java.security.MessageDigest> r0 = com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST
            com.google.crypto.tink.subtle.Enums$HashType r1 = r10.hash
            java.lang.String r1 = com.google.crypto.tink.subtle.SubtleUtil.toDigestAlgo(r1)
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.MessageDigest r0 = (java.security.MessageDigest) r0
            r0.update(r11)
            byte[] r1 = r0.digest()
            byte[] r2 = r10.toAsnPrefix(r13)
            int r3 = r2.length
            int r4 = r1.length
            int r3 = r3 + r4
            int r4 = r3 + 11
            if (r12 < r4) goto L4f
            byte[] r4 = new byte[r12]
            r5 = 0
            int r6 = r5 + 1
            r7 = 0
            r4[r5] = r7
            int r5 = r6 + 1
            r8 = 1
            r4[r6] = r8
            r6 = 0
        L31:
            int r8 = r12 - r3
            int r8 = r8 + (-3)
            if (r6 >= r8) goto L40
            int r8 = r5 + 1
            r9 = -1
            r4[r5] = r9
            int r6 = r6 + 1
            r5 = r8
            goto L31
        L40:
            int r6 = r5 + 1
            r4[r5] = r7
            int r5 = r2.length
            java.lang.System.arraycopy(r2, r7, r4, r6, r5)
            int r5 = r2.length
            int r5 = r5 + r6
            int r8 = r1.length
            java.lang.System.arraycopy(r1, r7, r4, r5, r8)
            return r4
        L4f:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "intended encoded message length too short"
            r4.<init>(r5)
            throw r4
    }

    private byte[] toAsnPrefix(com.google.crypto.tink.subtle.Enums.HashType r4) throws java.security.GeneralSecurityException {
            r3 = this;
            int[] r0 = com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType
            int r1 = r4.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L32;
                case 2: goto L2b;
                case 3: goto L24;
                default: goto Lb;
            }
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported hash "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L24:
            java.lang.String r0 = "3051300d060960864801650304020305000440"
            byte[] r0 = com.google.crypto.tink.subtle.Hex.decode(r0)
            return r0
        L2b:
            java.lang.String r0 = "3041300d060960864801650304020205000430"
            byte[] r0 = com.google.crypto.tink.subtle.Hex.decode(r0)
            return r0
        L32:
            java.lang.String r0 = "3031300d060960864801650304020105000420"
            byte[] r0 = com.google.crypto.tink.subtle.Hex.decode(r0)
            return r0
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] r10, byte[] r11) throws java.security.GeneralSecurityException {
            r9 = this;
            java.security.interfaces.RSAPublicKey r0 = r9.publicKey
            java.math.BigInteger r0 = r0.getPublicExponent()
            java.security.interfaces.RSAPublicKey r1 = r9.publicKey
            java.math.BigInteger r1 = r1.getModulus()
            int r2 = r1.bitLength()
            int r2 = r2 + 7
            int r2 = r2 / 8
            int r3 = r10.length
            if (r2 != r3) goto L46
            java.math.BigInteger r3 = com.google.crypto.tink.subtle.SubtleUtil.bytes2Integer(r10)
            int r4 = r3.compareTo(r1)
            if (r4 >= 0) goto L3e
            java.math.BigInteger r4 = r3.modPow(r0, r1)
            byte[] r5 = com.google.crypto.tink.subtle.SubtleUtil.integer2Bytes(r4, r2)
            com.google.crypto.tink.subtle.Enums$HashType r6 = r9.hash
            byte[] r6 = r9.emsaPkcs1(r11, r2, r6)
            boolean r7 = com.google.crypto.tink.subtle.Bytes.equal(r5, r6)
            if (r7 == 0) goto L36
            return
        L36:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r8 = "invalid signature"
            r7.<init>(r8)
            throw r7
        L3e:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "signature out of range"
            r4.<init>(r5)
            throw r4
        L46:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "invalid signature's length"
            r3.<init>(r4)
            throw r3
    }
}
