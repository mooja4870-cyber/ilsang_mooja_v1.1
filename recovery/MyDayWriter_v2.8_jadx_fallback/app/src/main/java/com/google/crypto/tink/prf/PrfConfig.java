package com.google.crypto.tink.prf;

/* JADX INFO: loaded from: classes.dex */
public final class PrfConfig {
    public static final java.lang.String PRF_TYPE_URL = null;

    static {
            com.google.crypto.tink.prf.HkdfPrfKeyManager r0 = new com.google.crypto.tink.prf.HkdfPrfKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.prf.PrfConfig.PRF_TYPE_URL = r0
            return
    }

    private PrfConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.prf.PrfSetWrapper.register()
            r0 = 1
            com.google.crypto.tink.prf.HmacPrfKeyManager.register(r0)
            boolean r1 = com.google.crypto.tink.config.TinkFips.useOnlyFips()
            if (r1 == 0) goto Le
            return
        Le:
            com.google.crypto.tink.prf.AesCmacPrfKeyManager.register(r0)
            com.google.crypto.tink.prf.HkdfPrfKeyManager.register(r0)
            return
    }
}
