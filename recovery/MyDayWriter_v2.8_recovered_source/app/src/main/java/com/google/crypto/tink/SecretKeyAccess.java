package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
@com.google.errorprone.annotations.CheckReturnValue
public final class SecretKeyAccess {
    private static final com.google.crypto.tink.SecretKeyAccess INSTANCE = null;

    static {
            com.google.crypto.tink.SecretKeyAccess r0 = new com.google.crypto.tink.SecretKeyAccess
            r0.<init>()
            com.google.crypto.tink.SecretKeyAccess.INSTANCE = r0
            return
    }

    private SecretKeyAccess() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.crypto.tink.SecretKeyAccess instance() {
            com.google.crypto.tink.SecretKeyAccess r0 = com.google.crypto.tink.SecretKeyAccess.INSTANCE
            return r0
    }

    public static com.google.crypto.tink.SecretKeyAccess requireAccess(@javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess r2) throws java.security.GeneralSecurityException {
            if (r2 == 0) goto L3
            return r2
        L3:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "SecretKeyAccess is required"
            r0.<init>(r1)
            throw r0
    }
}
