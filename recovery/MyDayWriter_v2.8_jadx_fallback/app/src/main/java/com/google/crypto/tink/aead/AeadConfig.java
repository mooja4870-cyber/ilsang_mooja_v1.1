package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes.dex */
public final class AeadConfig {
    public static final java.lang.String AES_CTR_HMAC_AEAD_TYPE_URL = null;
    public static final java.lang.String AES_EAX_TYPE_URL = null;
    public static final java.lang.String AES_GCM_SIV_TYPE_URL = null;
    public static final java.lang.String AES_GCM_TYPE_URL = null;
    public static final java.lang.String CHACHA20_POLY1305_TYPE_URL = null;
    public static final java.lang.String KMS_AEAD_TYPE_URL = null;
    public static final java.lang.String KMS_ENVELOPE_AEAD_TYPE_URL = null;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig LATEST = null;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_0_0 = null;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_1_0 = null;
    public static final java.lang.String XCHACHA20_POLY1305_TYPE_URL = null;

    static {
            com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager r0 = new com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.aead.AeadConfig.AES_CTR_HMAC_AEAD_TYPE_URL = r0
            com.google.crypto.tink.aead.AesGcmKeyManager r0 = new com.google.crypto.tink.aead.AesGcmKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.aead.AeadConfig.AES_GCM_TYPE_URL = r0
            com.google.crypto.tink.aead.AesGcmSivKeyManager r0 = new com.google.crypto.tink.aead.AesGcmSivKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.aead.AeadConfig.AES_GCM_SIV_TYPE_URL = r0
            com.google.crypto.tink.aead.AesEaxKeyManager r0 = new com.google.crypto.tink.aead.AesEaxKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.aead.AeadConfig.AES_EAX_TYPE_URL = r0
            com.google.crypto.tink.aead.KmsAeadKeyManager r0 = new com.google.crypto.tink.aead.KmsAeadKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.aead.AeadConfig.KMS_AEAD_TYPE_URL = r0
            com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager r0 = new com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.aead.AeadConfig.KMS_ENVELOPE_AEAD_TYPE_URL = r0
            com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager r0 = new com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.aead.AeadConfig.CHACHA20_POLY1305_TYPE_URL = r0
            com.google.crypto.tink.aead.XChaCha20Poly1305KeyManager r0 = new com.google.crypto.tink.aead.XChaCha20Poly1305KeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.aead.AeadConfig.XCHACHA20_POLY1305_TYPE_URL = r0
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance()
            com.google.crypto.tink.aead.AeadConfig.TINK_1_0_0 = r0
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.aead.AeadConfig.TINK_1_0_0
            com.google.crypto.tink.aead.AeadConfig.TINK_1_1_0 = r0
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.aead.AeadConfig.TINK_1_0_0
            com.google.crypto.tink.aead.AeadConfig.LATEST = r0
            init()     // Catch: java.security.GeneralSecurityException -> L6b
            return
        L6b:
            r0 = move-exception
            java.lang.ExceptionInInitializerError r1 = new java.lang.ExceptionInInitializerError
            r1.<init>(r0)
            throw r1
    }

    private AeadConfig() {
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
            com.google.crypto.tink.aead.AeadWrapper.register()
            com.google.crypto.tink.mac.MacConfig.register()
            r0 = 1
            com.google.crypto.tink.aead.AesCtrHmacAeadKeyManager.register(r0)
            com.google.crypto.tink.aead.AesGcmKeyManager.register(r0)
            boolean r1 = com.google.crypto.tink.config.TinkFips.useOnlyFips()
            if (r1 == 0) goto L14
            return
        L14:
            com.google.crypto.tink.aead.AesEaxKeyManager.register(r0)
            com.google.crypto.tink.aead.AesGcmSivKeyManager.register(r0)
            com.google.crypto.tink.aead.ChaCha20Poly1305KeyManager.register(r0)
            com.google.crypto.tink.aead.KmsAeadKeyManager.register(r0)
            com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager.register(r0)
            com.google.crypto.tink.aead.XChaCha20Poly1305KeyManager.register(r0)
            return
    }

    @java.lang.Deprecated
    public static void registerStandardKeyTypes() throws java.security.GeneralSecurityException {
            register()
            return
    }
}
