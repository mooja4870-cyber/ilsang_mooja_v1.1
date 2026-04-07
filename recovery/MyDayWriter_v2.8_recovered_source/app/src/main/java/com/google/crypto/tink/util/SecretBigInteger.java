package com.google.crypto.tink.util;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class SecretBigInteger {
    private final java.math.BigInteger value;

    private SecretBigInteger(java.math.BigInteger r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public static com.google.crypto.tink.util.SecretBigInteger fromBigInteger(java.math.BigInteger r2, com.google.crypto.tink.SecretKeyAccess r3) {
            if (r3 == 0) goto L8
            com.google.crypto.tink.util.SecretBigInteger r0 = new com.google.crypto.tink.util.SecretBigInteger
            r0.<init>(r2)
            return r0
        L8:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "SecretKeyAccess required"
            r0.<init>(r1)
            throw r0
    }

    public boolean equalsSecretBigInteger(com.google.crypto.tink.util.SecretBigInteger r4) {
            r3 = this;
            java.math.BigInteger r0 = r3.value
            byte[] r0 = r0.toByteArray()
            java.math.BigInteger r1 = r4.value
            byte[] r1 = r1.toByteArray()
            boolean r2 = java.security.MessageDigest.isEqual(r0, r1)
            return r2
    }

    public java.math.BigInteger getBigInteger(com.google.crypto.tink.SecretKeyAccess r3) {
            r2 = this;
            if (r3 == 0) goto L5
            java.math.BigInteger r0 = r2.value
            return r0
        L5:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "SecretKeyAccess required"
            r0.<init>(r1)
            throw r0
    }
}
