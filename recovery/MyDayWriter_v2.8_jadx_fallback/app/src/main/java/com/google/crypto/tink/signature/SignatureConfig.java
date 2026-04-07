package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes.dex */
public final class SignatureConfig {
    public static final java.lang.String ECDSA_PRIVATE_KEY_TYPE_URL = null;
    public static final java.lang.String ECDSA_PUBLIC_KEY_TYPE_URL = null;
    public static final java.lang.String ED25519_PRIVATE_KEY_TYPE_URL = null;
    public static final java.lang.String ED25519_PUBLIC_KEY_TYPE_URL = null;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig LATEST = null;
    public static final java.lang.String RSA_PKCS1_PRIVATE_KEY_TYPE_URL = null;
    public static final java.lang.String RSA_PKCS1_PUBLIC_KEY_TYPE_URL = null;
    public static final java.lang.String RSA_PSS_PRIVATE_KEY_TYPE_URL = null;
    public static final java.lang.String RSA_PSS_PUBLIC_KEY_TYPE_URL = null;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_0_0 = null;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_1_0 = null;

    static {
            com.google.crypto.tink.signature.EcdsaVerifyKeyManager r0 = new com.google.crypto.tink.signature.EcdsaVerifyKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.signature.SignatureConfig.ECDSA_PUBLIC_KEY_TYPE_URL = r0
            com.google.crypto.tink.signature.EcdsaSignKeyManager r0 = new com.google.crypto.tink.signature.EcdsaSignKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.signature.SignatureConfig.ECDSA_PRIVATE_KEY_TYPE_URL = r0
            com.google.crypto.tink.signature.Ed25519PublicKeyManager r0 = new com.google.crypto.tink.signature.Ed25519PublicKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.signature.SignatureConfig.ED25519_PUBLIC_KEY_TYPE_URL = r0
            com.google.crypto.tink.signature.Ed25519PrivateKeyManager r0 = new com.google.crypto.tink.signature.Ed25519PrivateKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.signature.SignatureConfig.ED25519_PRIVATE_KEY_TYPE_URL = r0
            com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager r0 = new com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.signature.SignatureConfig.RSA_PKCS1_PRIVATE_KEY_TYPE_URL = r0
            com.google.crypto.tink.signature.RsaSsaPkcs1VerifyKeyManager r0 = new com.google.crypto.tink.signature.RsaSsaPkcs1VerifyKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.signature.SignatureConfig.RSA_PKCS1_PUBLIC_KEY_TYPE_URL = r0
            com.google.crypto.tink.signature.RsaSsaPssSignKeyManager r0 = new com.google.crypto.tink.signature.RsaSsaPssSignKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.signature.SignatureConfig.RSA_PSS_PRIVATE_KEY_TYPE_URL = r0
            com.google.crypto.tink.signature.RsaSsaPssVerifyKeyManager r0 = new com.google.crypto.tink.signature.RsaSsaPssVerifyKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.signature.SignatureConfig.RSA_PSS_PUBLIC_KEY_TYPE_URL = r0
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance()
            com.google.crypto.tink.signature.SignatureConfig.TINK_1_0_0 = r0
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance()
            com.google.crypto.tink.signature.SignatureConfig.TINK_1_1_0 = r0
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance()
            com.google.crypto.tink.signature.SignatureConfig.LATEST = r0
            init()     // Catch: java.security.GeneralSecurityException -> L6f
            return
        L6f:
            r0 = move-exception
            java.lang.ExceptionInInitializerError r1 = new java.lang.ExceptionInInitializerError
            r1.<init>(r0)
            throw r1
    }

    private SignatureConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static void init() throws java.security.GeneralSecurityException {
            register()
            return
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.PublicKeySignWrapper.register()
            com.google.crypto.tink.signature.PublicKeyVerifyWrapper.register()
            r0 = 1
            com.google.crypto.tink.signature.EcdsaSignKeyManager.registerPair(r0)
            com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager.registerPair(r0)
            boolean r1 = com.google.crypto.tink.config.TinkFips.useOnlyFips()
            if (r1 == 0) goto L14
            return
        L14:
            com.google.crypto.tink.signature.RsaSsaPssSignKeyManager.registerPair(r0)
            com.google.crypto.tink.signature.Ed25519PrivateKeyManager.registerPair(r0)
            return
    }
}
