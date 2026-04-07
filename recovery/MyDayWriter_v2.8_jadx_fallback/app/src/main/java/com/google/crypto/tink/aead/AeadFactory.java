package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class AeadFactory {
    private AeadFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.Aead getPrimitive(com.google.crypto.tink.KeysetHandle r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.aead.AeadWrapper.register()
            java.lang.Class<com.google.crypto.tink.Aead> r0 = com.google.crypto.tink.Aead.class
            java.lang.Object r0 = r1.getPrimitive(r0)
            com.google.crypto.tink.Aead r0 = (com.google.crypto.tink.Aead) r0
            return r0
    }
}
