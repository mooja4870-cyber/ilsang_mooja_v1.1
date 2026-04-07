package com.google.crypto.tink.mac;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class MacFactory {
    private MacFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.Mac getPrimitive(com.google.crypto.tink.KeysetHandle r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.mac.MacWrapper.register()
            java.lang.Class<com.google.crypto.tink.Mac> r0 = com.google.crypto.tink.Mac.class
            java.lang.Object r0 = r1.getPrimitive(r0)
            com.google.crypto.tink.Mac r0 = (com.google.crypto.tink.Mac) r0
            return r0
    }
}
