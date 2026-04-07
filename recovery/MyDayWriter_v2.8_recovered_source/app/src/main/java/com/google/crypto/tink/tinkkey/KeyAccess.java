package com.google.crypto.tink.tinkkey;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
@java.lang.Deprecated
public final class KeyAccess {
    private final boolean canAccessSecret;

    private KeyAccess(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.canAccessSecret = r1
            return
    }

    public static com.google.crypto.tink.tinkkey.KeyAccess publicAccess() {
            com.google.crypto.tink.tinkkey.KeyAccess r0 = new com.google.crypto.tink.tinkkey.KeyAccess
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    static com.google.crypto.tink.tinkkey.KeyAccess secretAccess() {
            com.google.crypto.tink.tinkkey.KeyAccess r0 = new com.google.crypto.tink.tinkkey.KeyAccess
            r1 = 1
            r0.<init>(r1)
            return r0
    }

    public boolean canAccessSecret() {
            r1 = this;
            boolean r0 = r1.canAccessSecret
            return r0
    }
}
