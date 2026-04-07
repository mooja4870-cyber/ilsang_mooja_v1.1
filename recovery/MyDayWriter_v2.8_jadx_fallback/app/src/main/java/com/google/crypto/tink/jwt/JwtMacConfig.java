package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
public final class JwtMacConfig {
    public static final java.lang.String JWT_HMAC_TYPE_URL = null;

    static {
            com.google.crypto.tink.jwt.JwtHmacKeyManager r0 = new com.google.crypto.tink.jwt.JwtHmacKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            com.google.crypto.tink.jwt.JwtMacConfig.JWT_HMAC_TYPE_URL = r0
            return
    }

    private JwtMacConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void register() throws java.security.GeneralSecurityException {
            r0 = 1
            com.google.crypto.tink.jwt.JwtHmacKeyManager.register(r0)
            com.google.crypto.tink.jwt.JwtMacWrapper.register()
            return
    }
}
