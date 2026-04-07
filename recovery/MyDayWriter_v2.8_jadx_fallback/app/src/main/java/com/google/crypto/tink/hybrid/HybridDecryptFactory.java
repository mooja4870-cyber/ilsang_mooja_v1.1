package com.google.crypto.tink.hybrid;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class HybridDecryptFactory {
    private HybridDecryptFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.HybridDecrypt getPrimitive(com.google.crypto.tink.KeysetHandle r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.hybrid.HybridDecryptWrapper.register()
            java.lang.Class<com.google.crypto.tink.HybridDecrypt> r0 = com.google.crypto.tink.HybridDecrypt.class
            java.lang.Object r0 = r1.getPrimitive(r0)
            com.google.crypto.tink.HybridDecrypt r0 = (com.google.crypto.tink.HybridDecrypt) r0
            return r0
    }
}
