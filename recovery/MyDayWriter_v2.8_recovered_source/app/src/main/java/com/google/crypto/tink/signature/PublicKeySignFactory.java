package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class PublicKeySignFactory {
    private PublicKeySignFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.PublicKeySign getPrimitive(com.google.crypto.tink.KeysetHandle r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.PublicKeySignWrapper.register()
            java.lang.Class<com.google.crypto.tink.PublicKeySign> r0 = com.google.crypto.tink.PublicKeySign.class
            java.lang.Object r0 = r1.getPrimitive(r0)
            com.google.crypto.tink.PublicKeySign r0 = (com.google.crypto.tink.PublicKeySign) r0
            return r0
    }
}
