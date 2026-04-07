package com.google.crypto.tink.config;

/* JADX INFO: loaded from: classes.dex */
public final class TinkConfig {

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig LATEST = null;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_0_0 = null;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_1_0 = null;

    static {
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance()
            com.google.crypto.tink.config.TinkConfig.TINK_1_0_0 = r0
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance()
            com.google.crypto.tink.config.TinkConfig.TINK_1_1_0 = r0
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance()
            com.google.crypto.tink.config.TinkConfig.LATEST = r0
            init()     // Catch: java.security.GeneralSecurityException -> L17
            return
        L17:
            r0 = move-exception
            java.lang.ExceptionInInitializerError r1 = new java.lang.ExceptionInInitializerError
            r1.<init>(r0)
            throw r1
    }

    private TinkConfig() {
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
            com.google.crypto.tink.daead.DeterministicAeadConfig.register()
            com.google.crypto.tink.hybrid.HybridConfig.register()
            com.google.crypto.tink.prf.PrfConfig.register()
            com.google.crypto.tink.signature.SignatureConfig.register()
            com.google.crypto.tink.streamingaead.StreamingAeadConfig.register()
            return
    }
}
