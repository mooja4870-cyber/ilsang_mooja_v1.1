package com.google.crypto.tink.hybrid;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class HybridEncryptFactory {
    private HybridEncryptFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.HybridEncrypt getPrimitive(com.google.crypto.tink.KeysetHandle r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.hybrid.HybridEncryptWrapper.register()
            java.lang.Class<com.google.crypto.tink.HybridEncrypt> r0 = com.google.crypto.tink.HybridEncrypt.class
            java.lang.Object r0 = r1.getPrimitive(r0)
            com.google.crypto.tink.HybridEncrypt r0 = (com.google.crypto.tink.HybridEncrypt) r0
            return r0
    }
}
