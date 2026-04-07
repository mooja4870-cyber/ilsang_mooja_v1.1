package com.google.crypto.tink.hybrid;

/* JADX INFO: loaded from: classes.dex */
public final class HybridConfig {
    public static final java.lang.String ECIES_AEAD_HKDF_PRIVATE_KEY_TYPE_URL = null;
    public static final java.lang.String ECIES_AEAD_HKDF_PUBLIC_KEY_TYPE_URL = null;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig LATEST = null;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_0_0 = null;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_1_0 = null;

    static {
            com.google.crypto.tink.hybrid.EciesAeadHkdfPublicKeyManager r0 = new com.google.crypto.tink.hybrid.EciesAeadHkdfPublicKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.hybrid.HybridConfig.ECIES_AEAD_HKDF_PUBLIC_KEY_TYPE_URL = r0
            com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager r0 = new com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.hybrid.HybridConfig.ECIES_AEAD_HKDF_PRIVATE_KEY_TYPE_URL = r0
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance()
            com.google.crypto.tink.hybrid.HybridConfig.TINK_1_0_0 = r0
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance()
            com.google.crypto.tink.hybrid.HybridConfig.TINK_1_1_0 = r0
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance()
            com.google.crypto.tink.hybrid.HybridConfig.LATEST = r0
            init()     // Catch: java.security.GeneralSecurityException -> L2d
            return
        L2d:
            r0 = move-exception
            java.lang.ExceptionInInitializerError r1 = new java.lang.ExceptionInInitializerError
            r1.<init>(r0)
            throw r1
    }

    private HybridConfig() {
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
            com.google.crypto.tink.hybrid.HybridDecryptWrapper.register()
            com.google.crypto.tink.hybrid.HybridEncryptWrapper.register()
            com.google.crypto.tink.aead.AeadConfig.register()
            boolean r0 = com.google.crypto.tink.config.TinkFips.useOnlyFips()
            if (r0 == 0) goto L10
            return
        L10:
            r0 = 1
            com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager.registerPair(r0)
            com.google.crypto.tink.hybrid.internal.HpkePrivateKeyManager.registerPair(r0)
            return
    }
}
