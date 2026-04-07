package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
@com.google.errorprone.annotations.CheckReturnValue
public final class InsecureSecretKeyAccess {
    private InsecureSecretKeyAccess() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.SecretKeyAccess get() {
            com.google.crypto.tink.SecretKeyAccess r0 = com.google.crypto.tink.SecretKeyAccess.instance()
            return r0
    }
}
