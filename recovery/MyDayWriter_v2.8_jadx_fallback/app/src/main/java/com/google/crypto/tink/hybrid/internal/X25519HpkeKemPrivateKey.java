package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
final class X25519HpkeKemPrivateKey implements com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey {
    private final com.google.crypto.tink.util.Bytes privateKey;
    private final com.google.crypto.tink.util.Bytes publicKey;

    private X25519HpkeKemPrivateKey(byte[] r2, byte[] r3) {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r2)
            r1.privateKey = r0
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r3)
            r1.publicKey = r0
            return
    }

    static com.google.crypto.tink.hybrid.internal.X25519HpkeKemPrivateKey fromBytes(byte[] r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.hybrid.internal.X25519HpkeKemPrivateKey r0 = new com.google.crypto.tink.hybrid.internal.X25519HpkeKemPrivateKey
            byte[] r1 = com.google.crypto.tink.subtle.X25519.publicFromPrivate(r2)
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey
    public com.google.crypto.tink.util.Bytes getSerializedPrivate() {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r1.privateKey
            return r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey
    public com.google.crypto.tink.util.Bytes getSerializedPublic() {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r1.publicKey
            return r0
    }
}
