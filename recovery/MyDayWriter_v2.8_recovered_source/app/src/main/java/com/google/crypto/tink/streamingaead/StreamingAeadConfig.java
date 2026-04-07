package com.google.crypto.tink.streamingaead;

/* JADX INFO: loaded from: classes.dex */
public final class StreamingAeadConfig {
    public static final java.lang.String AES_CTR_HMAC_STREAMINGAEAD_TYPE_URL = null;
    public static final java.lang.String AES_GCM_HKDF_STREAMINGAEAD_TYPE_URL = null;
    public static final com.google.crypto.tink.proto.RegistryConfig LATEST = null;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_1_0 = null;

    static {
            com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager r0 = new com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.streamingaead.StreamingAeadConfig.AES_CTR_HMAC_STREAMINGAEAD_TYPE_URL = r0
            com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager r0 = new com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.streamingaead.StreamingAeadConfig.AES_GCM_HKDF_STREAMINGAEAD_TYPE_URL = r0
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance()
            com.google.crypto.tink.streamingaead.StreamingAeadConfig.TINK_1_1_0 = r0
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance()
            com.google.crypto.tink.streamingaead.StreamingAeadConfig.LATEST = r0
            init()     // Catch: java.security.GeneralSecurityException -> L27
            return
        L27:
            r0 = move-exception
            java.lang.ExceptionInInitializerError r1 = new java.lang.ExceptionInInitializerError
            r1.<init>(r0)
            throw r1
    }

    private StreamingAeadConfig() {
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
            com.google.crypto.tink.streamingaead.StreamingAeadWrapper.register()
            boolean r0 = com.google.crypto.tink.config.TinkFips.useOnlyFips()
            if (r0 == 0) goto La
            return
        La:
            r0 = 1
            com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager.register(r0)
            com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKeyManager.register(r0)
            return
    }
}
