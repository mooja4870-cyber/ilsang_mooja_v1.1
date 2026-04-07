package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class KeyStatus {
    public static final com.google.crypto.tink.KeyStatus DESTROYED = null;
    public static final com.google.crypto.tink.KeyStatus DISABLED = null;
    public static final com.google.crypto.tink.KeyStatus ENABLED = null;
    private final java.lang.String name;

    static {
            com.google.crypto.tink.KeyStatus r0 = new com.google.crypto.tink.KeyStatus
            java.lang.String r1 = "ENABLED"
            r0.<init>(r1)
            com.google.crypto.tink.KeyStatus.ENABLED = r0
            com.google.crypto.tink.KeyStatus r0 = new com.google.crypto.tink.KeyStatus
            java.lang.String r1 = "DISABLED"
            r0.<init>(r1)
            com.google.crypto.tink.KeyStatus.DISABLED = r0
            com.google.crypto.tink.KeyStatus r0 = new com.google.crypto.tink.KeyStatus
            java.lang.String r1 = "DESTROYED"
            r0.<init>(r1)
            com.google.crypto.tink.KeyStatus.DESTROYED = r0
            return
    }

    private KeyStatus(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }
}
