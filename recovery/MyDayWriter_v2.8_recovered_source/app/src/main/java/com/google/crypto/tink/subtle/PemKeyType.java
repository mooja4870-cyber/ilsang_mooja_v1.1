package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public enum PemKeyType extends java.lang.Enum<com.google.crypto.tink.subtle.PemKeyType> {
    private static final /* synthetic */ com.google.crypto.tink.subtle.PemKeyType[] $VALUES = null;
    private static final java.lang.String BEGIN = "-----BEGIN ";
    public static final com.google.crypto.tink.subtle.PemKeyType ECDSA_P256_SHA256 = null;
    public static final com.google.crypto.tink.subtle.PemKeyType ECDSA_P384_SHA384 = null;
    public static final com.google.crypto.tink.subtle.PemKeyType ECDSA_P521_SHA512 = null;
    private static final java.lang.String END = "-----END ";
    private static final java.lang.String MARKER = "-----";
    private static final java.lang.String PRIVATE_KEY = "PRIVATE KEY";
    private static final java.lang.String PUBLIC_KEY = "PUBLIC KEY";
    public static final com.google.crypto.tink.subtle.PemKeyType RSA_PSS_2048_SHA256 = null;
    public static final com.google.crypto.tink.subtle.PemKeyType RSA_PSS_3072_SHA256 = null;
    public static final com.google.crypto.tink.subtle.PemKeyType RSA_PSS_4096_SHA256 = null;
    public static final com.google.crypto.tink.subtle.PemKeyType RSA_PSS_4096_SHA512 = null;
    public static final com.google.crypto.tink.subtle.PemKeyType RSA_SIGN_PKCS1_2048_SHA256 = null;
    public static final com.google.crypto.tink.subtle.PemKeyType RSA_SIGN_PKCS1_3072_SHA256 = null;
    public static final com.google.crypto.tink.subtle.PemKeyType RSA_SIGN_PKCS1_4096_SHA256 = null;
    public static final com.google.crypto.tink.subtle.PemKeyType RSA_SIGN_PKCS1_4096_SHA512 = null;
    public final java.lang.String algorithm;
    public final com.google.crypto.tink.subtle.Enums.HashType hash;
    public final int keySizeInBits;
    public final java.lang.String keyType;

    static {
            com.google.crypto.tink.subtle.PemKeyType r0 = new com.google.crypto.tink.subtle.PemKeyType
            r5 = 2048(0x800, float:2.87E-42)
            com.google.crypto.tink.subtle.Enums$HashType r6 = com.google.crypto.tink.subtle.Enums.HashType.SHA256
            java.lang.String r1 = "RSA_PSS_2048_SHA256"
            r2 = 0
            java.lang.String r3 = "RSA"
            java.lang.String r4 = "RSASSA-PSS"
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.crypto.tink.subtle.PemKeyType.RSA_PSS_2048_SHA256 = r0
            com.google.crypto.tink.subtle.PemKeyType r1 = new com.google.crypto.tink.subtle.PemKeyType
            r6 = 3072(0xc00, float:4.305E-42)
            com.google.crypto.tink.subtle.Enums$HashType r7 = com.google.crypto.tink.subtle.Enums.HashType.SHA256
            java.lang.String r2 = "RSA_PSS_3072_SHA256"
            r3 = 1
            java.lang.String r4 = "RSA"
            java.lang.String r5 = "RSASSA-PSS"
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.google.crypto.tink.subtle.PemKeyType.RSA_PSS_3072_SHA256 = r1
            com.google.crypto.tink.subtle.PemKeyType r2 = new com.google.crypto.tink.subtle.PemKeyType
            r7 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.subtle.Enums$HashType r8 = com.google.crypto.tink.subtle.Enums.HashType.SHA256
            java.lang.String r3 = "RSA_PSS_4096_SHA256"
            r4 = 2
            java.lang.String r5 = "RSA"
            java.lang.String r6 = "RSASSA-PSS"
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.google.crypto.tink.subtle.PemKeyType.RSA_PSS_4096_SHA256 = r2
            com.google.crypto.tink.subtle.PemKeyType r3 = new com.google.crypto.tink.subtle.PemKeyType
            r8 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.subtle.Enums$HashType r9 = com.google.crypto.tink.subtle.Enums.HashType.SHA512
            java.lang.String r4 = "RSA_PSS_4096_SHA512"
            r5 = 3
            java.lang.String r6 = "RSA"
            java.lang.String r7 = "RSASSA-PSS"
            r3.<init>(r4, r5, r6, r7, r8, r9)
            com.google.crypto.tink.subtle.PemKeyType.RSA_PSS_4096_SHA512 = r3
            com.google.crypto.tink.subtle.PemKeyType r4 = new com.google.crypto.tink.subtle.PemKeyType
            r9 = 2048(0x800, float:2.87E-42)
            com.google.crypto.tink.subtle.Enums$HashType r10 = com.google.crypto.tink.subtle.Enums.HashType.SHA256
            java.lang.String r5 = "RSA_SIGN_PKCS1_2048_SHA256"
            r6 = 4
            java.lang.String r7 = "RSA"
            java.lang.String r8 = "RSASSA-PKCS1-v1_5"
            r4.<init>(r5, r6, r7, r8, r9, r10)
            com.google.crypto.tink.subtle.PemKeyType.RSA_SIGN_PKCS1_2048_SHA256 = r4
            com.google.crypto.tink.subtle.PemKeyType r5 = new com.google.crypto.tink.subtle.PemKeyType
            r10 = 3072(0xc00, float:4.305E-42)
            com.google.crypto.tink.subtle.Enums$HashType r11 = com.google.crypto.tink.subtle.Enums.HashType.SHA256
            java.lang.String r6 = "RSA_SIGN_PKCS1_3072_SHA256"
            r7 = 5
            java.lang.String r8 = "RSA"
            java.lang.String r9 = "RSASSA-PKCS1-v1_5"
            r5.<init>(r6, r7, r8, r9, r10, r11)
            com.google.crypto.tink.subtle.PemKeyType.RSA_SIGN_PKCS1_3072_SHA256 = r5
            com.google.crypto.tink.subtle.PemKeyType r6 = new com.google.crypto.tink.subtle.PemKeyType
            r11 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.subtle.Enums$HashType r12 = com.google.crypto.tink.subtle.Enums.HashType.SHA256
            java.lang.String r7 = "RSA_SIGN_PKCS1_4096_SHA256"
            r8 = 6
            java.lang.String r9 = "RSA"
            java.lang.String r10 = "RSASSA-PKCS1-v1_5"
            r6.<init>(r7, r8, r9, r10, r11, r12)
            com.google.crypto.tink.subtle.PemKeyType.RSA_SIGN_PKCS1_4096_SHA256 = r6
            com.google.crypto.tink.subtle.PemKeyType r7 = new com.google.crypto.tink.subtle.PemKeyType
            r12 = 4096(0x1000, float:5.74E-42)
            com.google.crypto.tink.subtle.Enums$HashType r13 = com.google.crypto.tink.subtle.Enums.HashType.SHA512
            java.lang.String r8 = "RSA_SIGN_PKCS1_4096_SHA512"
            r9 = 7
            java.lang.String r10 = "RSA"
            java.lang.String r11 = "RSASSA-PKCS1-v1_5"
            r7.<init>(r8, r9, r10, r11, r12, r13)
            com.google.crypto.tink.subtle.PemKeyType.RSA_SIGN_PKCS1_4096_SHA512 = r7
            com.google.crypto.tink.subtle.PemKeyType r0 = new com.google.crypto.tink.subtle.PemKeyType
            r5 = 256(0x100, float:3.59E-43)
            com.google.crypto.tink.subtle.Enums$HashType r6 = com.google.crypto.tink.subtle.Enums.HashType.SHA256
            java.lang.String r1 = "ECDSA_P256_SHA256"
            r2 = 8
            java.lang.String r3 = "EC"
            java.lang.String r4 = "ECDSA"
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.crypto.tink.subtle.PemKeyType.ECDSA_P256_SHA256 = r0
            com.google.crypto.tink.subtle.PemKeyType r1 = new com.google.crypto.tink.subtle.PemKeyType
            r6 = 384(0x180, float:5.38E-43)
            com.google.crypto.tink.subtle.Enums$HashType r7 = com.google.crypto.tink.subtle.Enums.HashType.SHA384
            java.lang.String r2 = "ECDSA_P384_SHA384"
            r3 = 9
            java.lang.String r4 = "EC"
            java.lang.String r5 = "ECDSA"
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.google.crypto.tink.subtle.PemKeyType.ECDSA_P384_SHA384 = r1
            com.google.crypto.tink.subtle.PemKeyType r2 = new com.google.crypto.tink.subtle.PemKeyType
            r7 = 521(0x209, float:7.3E-43)
            com.google.crypto.tink.subtle.Enums$HashType r8 = com.google.crypto.tink.subtle.Enums.HashType.SHA512
            java.lang.String r3 = "ECDSA_P521_SHA512"
            r4 = 10
            java.lang.String r5 = "EC"
            java.lang.String r6 = "ECDSA"
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.google.crypto.tink.subtle.PemKeyType.ECDSA_P521_SHA512 = r2
            com.google.crypto.tink.subtle.PemKeyType r3 = com.google.crypto.tink.subtle.PemKeyType.RSA_PSS_2048_SHA256
            com.google.crypto.tink.subtle.PemKeyType r4 = com.google.crypto.tink.subtle.PemKeyType.RSA_PSS_3072_SHA256
            com.google.crypto.tink.subtle.PemKeyType r5 = com.google.crypto.tink.subtle.PemKeyType.RSA_PSS_4096_SHA256
            com.google.crypto.tink.subtle.PemKeyType r6 = com.google.crypto.tink.subtle.PemKeyType.RSA_PSS_4096_SHA512
            com.google.crypto.tink.subtle.PemKeyType r7 = com.google.crypto.tink.subtle.PemKeyType.RSA_SIGN_PKCS1_2048_SHA256
            com.google.crypto.tink.subtle.PemKeyType r8 = com.google.crypto.tink.subtle.PemKeyType.RSA_SIGN_PKCS1_3072_SHA256
            com.google.crypto.tink.subtle.PemKeyType r9 = com.google.crypto.tink.subtle.PemKeyType.RSA_SIGN_PKCS1_4096_SHA256
            com.google.crypto.tink.subtle.PemKeyType r10 = com.google.crypto.tink.subtle.PemKeyType.RSA_SIGN_PKCS1_4096_SHA512
            com.google.crypto.tink.subtle.PemKeyType r11 = com.google.crypto.tink.subtle.PemKeyType.ECDSA_P256_SHA256
            com.google.crypto.tink.subtle.PemKeyType r12 = com.google.crypto.tink.subtle.PemKeyType.ECDSA_P384_SHA384
            com.google.crypto.tink.subtle.PemKeyType r13 = com.google.crypto.tink.subtle.PemKeyType.ECDSA_P521_SHA512
            com.google.crypto.tink.subtle.PemKeyType[] r0 = new com.google.crypto.tink.subtle.PemKeyType[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            com.google.crypto.tink.subtle.PemKeyType.$VALUES = r0
            return
    }

    PemKeyType(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4, int r5, com.google.crypto.tink.subtle.Enums.HashType r6) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.keyType = r3
            r0.algorithm = r4
            r0.keySizeInBits = r5
            r0.hash = r6
            return
    }

    private java.security.Key getPrivateKey(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r0 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r1 = r2.keyType
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.KeyFactory r0 = (java.security.KeyFactory) r0
            java.security.spec.PKCS8EncodedKeySpec r1 = new java.security.spec.PKCS8EncodedKeySpec
            r1.<init>(r3)
            java.security.PrivateKey r1 = r0.generatePrivate(r1)
            java.security.Key r1 = r2.validate(r1)
            return r1
    }

    private java.security.Key getPublicKey(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r0 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r1 = r2.keyType
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.KeyFactory r0 = (java.security.KeyFactory) r0
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec
            r1.<init>(r3)
            java.security.PublicKey r1 = r0.generatePublic(r1)
            java.security.Key r1 = r2.validate(r1)
            return r1
    }

    private java.security.Key validate(java.security.Key r7) throws java.security.GeneralSecurityException {
            r6 = this;
            java.lang.String r0 = r6.keyType
            java.lang.String r1 = "RSA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L34
            r0 = r7
            java.security.interfaces.RSAKey r0 = (java.security.interfaces.RSAKey) r0
            java.math.BigInteger r1 = r0.getModulus()
            int r1 = r1.bitLength()
            int r2 = r6.keySizeInBits
            if (r1 != r2) goto L1a
            goto L4d
        L1a:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            int r3 = r6.keySizeInBits
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            java.lang.String r4 = "invalid RSA key size, want %d got %d"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.<init>(r3)
            throw r2
        L34:
            r0 = r7
            java.security.interfaces.ECKey r0 = (java.security.interfaces.ECKey) r0
            java.security.spec.ECParameterSpec r1 = r0.getParams()
            boolean r2 = com.google.crypto.tink.subtle.EllipticCurves.isNistEcParameterSpec(r1)
            if (r2 == 0) goto L68
            java.security.spec.EllipticCurve r2 = r1.getCurve()
            int r2 = com.google.crypto.tink.subtle.EllipticCurves.fieldSizeInBits(r2)
            int r3 = r6.keySizeInBits
            if (r2 != r3) goto L4e
        L4d:
            return r7
        L4e:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            int r4 = r6.keySizeInBits
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}
            java.lang.String r5 = "invalid EC key size, want %d got %d"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r3.<init>(r4)
            throw r3
        L68:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "unsupport EC spec: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static com.google.crypto.tink.subtle.PemKeyType valueOf(java.lang.String r1) {
            java.lang.Class<com.google.crypto.tink.subtle.PemKeyType> r0 = com.google.crypto.tink.subtle.PemKeyType.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.google.crypto.tink.subtle.PemKeyType r0 = (com.google.crypto.tink.subtle.PemKeyType) r0
            return r0
    }

    public static com.google.crypto.tink.subtle.PemKeyType[] values() {
            com.google.crypto.tink.subtle.PemKeyType[] r0 = com.google.crypto.tink.subtle.PemKeyType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.crypto.tink.subtle.PemKeyType[] r0 = (com.google.crypto.tink.subtle.PemKeyType[]) r0
            return r0
    }

    @javax.annotation.Nullable
    public java.security.Key readKey(java.io.BufferedReader r9) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = r9.readLine()
        L4:
            java.lang.String r1 = "-----BEGIN "
            if (r0 == 0) goto L13
            boolean r2 = r0.startsWith(r1)
            if (r2 != 0) goto L13
            java.lang.String r0 = r9.readLine()
            goto L4
        L13:
            r2 = 0
            if (r0 != 0) goto L17
            return r2
        L17:
            java.lang.String r3 = r0.trim()
            int r1 = r1.length()
            java.lang.String r0 = r3.substring(r1)
            java.lang.String r1 = "-----"
            int r3 = r0.indexOf(r1)
            if (r3 >= 0) goto L2c
            return r2
        L2c:
            r4 = 0
            java.lang.String r5 = r0.substring(r4, r3)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "-----END "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r5)
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
        L4d:
            java.lang.String r7 = r9.readLine()
            r0 = r7
            if (r7 == 0) goto L68
            java.lang.String r7 = ":"
            int r7 = r0.indexOf(r7)
            if (r7 <= 0) goto L5d
            goto L4d
        L5d:
            boolean r7 = r0.contains(r1)
            if (r7 == 0) goto L64
            goto L68
        L64:
            r6.append(r0)
            goto L4d
        L68:
            java.lang.String r7 = r6.toString()     // Catch: java.lang.IllegalArgumentException -> L8c java.security.GeneralSecurityException -> L8e
            byte[] r4 = com.google.crypto.tink.subtle.Base64.decode(r7, r4)     // Catch: java.lang.IllegalArgumentException -> L8c java.security.GeneralSecurityException -> L8e
            java.lang.String r7 = "PUBLIC KEY"
            boolean r7 = r5.contains(r7)     // Catch: java.lang.IllegalArgumentException -> L8c java.security.GeneralSecurityException -> L8e
            if (r7 == 0) goto L7d
            java.security.Key r2 = r8.getPublicKey(r4)     // Catch: java.lang.IllegalArgumentException -> L8c java.security.GeneralSecurityException -> L8e
            return r2
        L7d:
            java.lang.String r7 = "PRIVATE KEY"
            boolean r7 = r5.contains(r7)     // Catch: java.lang.IllegalArgumentException -> L8c java.security.GeneralSecurityException -> L8e
            if (r7 == 0) goto L8a
            java.security.Key r2 = r8.getPrivateKey(r4)     // Catch: java.lang.IllegalArgumentException -> L8c java.security.GeneralSecurityException -> L8e
            return r2
        L8a:
            return r2
        L8c:
            r4 = move-exception
            goto L8f
        L8e:
            r4 = move-exception
        L8f:
            return r2
    }
}
