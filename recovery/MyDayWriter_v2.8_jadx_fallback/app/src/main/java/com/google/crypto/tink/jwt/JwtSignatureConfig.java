package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
public final class JwtSignatureConfig {
    public static final java.lang.String JWT_ECDSA_PRIVATE_KEY_TYPE_URL = null;
    public static final java.lang.String JWT_ECDSA_PUBLIC_KEY_TYPE_URL = null;
    public static final java.lang.String JWT_RSA_PKCS1_PRIVATE_KEY_TYPE_URL = null;
    public static final java.lang.String JWT_RSA_PKCS1_PUBLIC_KEY_TYPE_URL = null;
    public static final java.lang.String JWT_RSA_PSS_PRIVATE_KEY_TYPE_URL = null;
    public static final java.lang.String JWT_RSA_PSS_PUBLIC_KEY_TYPE_URL = null;
    public static final com.google.crypto.tink.proto.RegistryConfig LATEST = null;

    static {
            com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager r0 = new com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.jwt.JwtSignatureConfig.JWT_ECDSA_PUBLIC_KEY_TYPE_URL = r0
            com.google.crypto.tink.jwt.JwtEcdsaSignKeyManager r0 = new com.google.crypto.tink.jwt.JwtEcdsaSignKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.jwt.JwtSignatureConfig.JWT_ECDSA_PRIVATE_KEY_TYPE_URL = r0
            com.google.crypto.tink.jwt.JwtRsaSsaPkcs1SignKeyManager r0 = new com.google.crypto.tink.jwt.JwtRsaSsaPkcs1SignKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.jwt.JwtSignatureConfig.JWT_RSA_PKCS1_PRIVATE_KEY_TYPE_URL = r0
            com.google.crypto.tink.jwt.JwtRsaSsaPkcs1VerifyKeyManager r0 = new com.google.crypto.tink.jwt.JwtRsaSsaPkcs1VerifyKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.jwt.JwtSignatureConfig.JWT_RSA_PKCS1_PUBLIC_KEY_TYPE_URL = r0
            com.google.crypto.tink.jwt.JwtRsaSsaPssSignKeyManager r0 = new com.google.crypto.tink.jwt.JwtRsaSsaPssSignKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.jwt.JwtSignatureConfig.JWT_RSA_PSS_PRIVATE_KEY_TYPE_URL = r0
            com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager r0 = new com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.jwt.JwtSignatureConfig.JWT_RSA_PSS_PUBLIC_KEY_TYPE_URL = r0
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance()
            com.google.crypto.tink.jwt.JwtSignatureConfig.LATEST = r0
            return
    }

    private JwtSignatureConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void register() throws java.security.GeneralSecurityException {
            r0 = 1
            com.google.crypto.tink.jwt.JwtEcdsaSignKeyManager.registerPair(r0)
            com.google.crypto.tink.jwt.JwtRsaSsaPkcs1SignKeyManager.registerPair(r0)
            com.google.crypto.tink.jwt.JwtRsaSsaPssSignKeyManager.registerPair(r0)
            com.google.crypto.tink.jwt.JwtPublicKeySignWrapper.register()
            com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper.register()
            return
    }
}
