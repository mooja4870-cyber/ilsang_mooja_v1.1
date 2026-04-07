package com.google.crypto.tink.tinkkey;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
@java.lang.Deprecated
public final class SecretKeyAccess {
    private SecretKeyAccess() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.tinkkey.KeyAccess insecureSecretAccess() {
            com.google.crypto.tink.tinkkey.KeyAccess r0 = com.google.crypto.tink.tinkkey.KeyAccess.secretAccess()
            return r0
    }
}
