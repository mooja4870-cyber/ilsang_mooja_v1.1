package com.google.crypto.tink.daead;

/* JADX INFO: loaded from: classes.dex */
public final class DeterministicAeadConfig {
    public static final java.lang.String AES_SIV_TYPE_URL = null;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig LATEST = null;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_1_0 = null;

    static {
            com.google.crypto.tink.daead.AesSivKeyManager r0 = new com.google.crypto.tink.daead.AesSivKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.daead.DeterministicAeadConfig.AES_SIV_TYPE_URL = r0
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance()
            com.google.crypto.tink.daead.DeterministicAeadConfig.TINK_1_1_0 = r0
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance()
            com.google.crypto.tink.daead.DeterministicAeadConfig.LATEST = r0
            register()     // Catch: java.security.GeneralSecurityException -> L1c
            return
        L1c:
            r0 = move-exception
            java.lang.ExceptionInInitializerError r1 = new java.lang.ExceptionInInitializerError
            r1.<init>(r0)
            throw r1
    }

    private DeterministicAeadConfig() {
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
            com.google.crypto.tink.daead.DeterministicAeadWrapper.register()
            boolean r0 = com.google.crypto.tink.config.TinkFips.useOnlyFips()
            if (r0 == 0) goto La
            return
        La:
            r0 = 1
            com.google.crypto.tink.daead.AesSivKeyManager.register(r0)
            return
    }
}
