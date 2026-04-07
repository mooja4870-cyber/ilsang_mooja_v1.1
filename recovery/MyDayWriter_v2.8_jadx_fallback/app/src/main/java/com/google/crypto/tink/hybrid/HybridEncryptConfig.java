package com.google.crypto.tink.hybrid;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class HybridEncryptConfig {
    private HybridEncryptConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static void registerStandardKeyTypes() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.RegistryConfig r0 = com.google.crypto.tink.hybrid.HybridConfig.TINK_1_0_0
            com.google.crypto.tink.Config.register(r0)
            return
    }
}
