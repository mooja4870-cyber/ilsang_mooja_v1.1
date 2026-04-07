package com.google.crypto.tink.mac;

/* JADX INFO: loaded from: classes.dex */
public final class MacConfig {
    public static final java.lang.String HMAC_TYPE_URL = null;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig LATEST = null;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_0_0 = null;

    @java.lang.Deprecated
    public static final com.google.crypto.tink.proto.RegistryConfig TINK_1_1_0 = null;

    static {
            com.google.crypto.tink.mac.HmacKeyManager r0 = new com.google.crypto.tink.mac.HmacKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.mac.MacConfig.HMAC_TYPE_URL = r0
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.proto.RegistryConfig.getDefaultInstance()
            com.google.crypto.tink.mac.MacConfig.TINK_1_0_0 = r0
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.mac.MacConfig.TINK_1_0_0
            com.google.crypto.tink.mac.MacConfig.TINK_1_1_0 = r0
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.mac.MacConfig.TINK_1_0_0
            com.google.crypto.tink.mac.MacConfig.LATEST = r0
            init()     // Catch: java.security.GeneralSecurityException -> L1e
            return
        L1e:
            r0 = move-exception
            java.lang.ExceptionInInitializerError r1 = new java.lang.ExceptionInInitializerError
            r1.<init>(r0)
            throw r1
    }

    private MacConfig() {
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
            com.google.crypto.tink.mac.MacWrapper.register()
            com.google.crypto.tink.mac.ChunkedMacWrapper.register()
            r0 = 1
            com.google.crypto.tink.mac.HmacKeyManager.register(r0)
            boolean r1 = com.google.crypto.tink.config.TinkFips.useOnlyFips()
            if (r1 == 0) goto L11
            return
        L11:
            com.google.crypto.tink.mac.AesCmacKeyManager.register(r0)
            return
    }

    @java.lang.Deprecated
    public static void registerStandardKeyTypes() throws java.security.GeneralSecurityException {
            register()
            return
    }
}
