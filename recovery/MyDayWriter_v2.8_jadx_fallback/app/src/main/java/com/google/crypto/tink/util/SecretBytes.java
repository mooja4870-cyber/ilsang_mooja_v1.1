package com.google.crypto.tink.util;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class SecretBytes {
    private final com.google.crypto.tink.util.Bytes bytes;

    private SecretBytes(com.google.crypto.tink.util.Bytes r1) {
            r0 = this;
            r0.<init>()
            r0.bytes = r1
            return
    }

    public static com.google.crypto.tink.util.SecretBytes copyFrom(byte[] r2, com.google.crypto.tink.SecretKeyAccess r3) {
            if (r3 == 0) goto Lc
            com.google.crypto.tink.util.SecretBytes r0 = new com.google.crypto.tink.util.SecretBytes
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.util.Bytes.copyFrom(r2)
            r0.<init>(r1)
            return r0
        Lc:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "SecretKeyAccess required"
            r0.<init>(r1)
            throw r0
    }

    public static com.google.crypto.tink.util.SecretBytes randomBytes(int r2) {
            com.google.crypto.tink.util.SecretBytes r0 = new com.google.crypto.tink.util.SecretBytes
            byte[] r1 = com.google.crypto.tink.subtle.Random.randBytes(r2)
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.util.Bytes.copyFrom(r1)
            r0.<init>(r1)
            return r0
    }

    public boolean equalsSecretBytes(com.google.crypto.tink.util.SecretBytes r4) {
            r3 = this;
            com.google.crypto.tink.util.Bytes r0 = r3.bytes
            byte[] r0 = r0.toByteArray()
            com.google.crypto.tink.util.Bytes r1 = r4.bytes
            byte[] r1 = r1.toByteArray()
            boolean r2 = java.security.MessageDigest.isEqual(r0, r1)
            return r2
    }

    public int size() {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r1.bytes
            int r0 = r0.size()
            return r0
    }

    public byte[] toByteArray(com.google.crypto.tink.SecretKeyAccess r3) {
            r2 = this;
            if (r3 == 0) goto L9
            com.google.crypto.tink.util.Bytes r0 = r2.bytes
            byte[] r0 = r0.toByteArray()
            return r0
        L9:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "SecretKeyAccess required"
            r0.<init>(r1)
            throw r0
    }
}
