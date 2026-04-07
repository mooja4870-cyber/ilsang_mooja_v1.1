package com.google.crypto.tink.aead.internal;

/* JADX INFO: loaded from: classes.dex */
public final class InsecureNonceChaCha20Poly1305 extends com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base {
    public InsecureNonceChaCha20Poly1305(byte[] r1) throws java.security.GeneralSecurityException {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base
    public /* bridge */ /* synthetic */ byte[] decrypt(java.nio.ByteBuffer r1, byte[] r2, byte[] r3) throws java.security.GeneralSecurityException {
            r0 = this;
            byte[] r1 = super.decrypt(r1, r2, r3)
            return r1
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base
    public /* bridge */ /* synthetic */ byte[] decrypt(byte[] r1, byte[] r2, byte[] r3) throws java.security.GeneralSecurityException {
            r0 = this;
            byte[] r1 = super.decrypt(r1, r2, r3)
            return r1
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base
    public /* bridge */ /* synthetic */ void encrypt(java.nio.ByteBuffer r1, byte[] r2, byte[] r3, byte[] r4) throws java.security.GeneralSecurityException {
            r0 = this;
            super.encrypt(r1, r2, r3, r4)
            return
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base
    public /* bridge */ /* synthetic */ byte[] encrypt(byte[] r1, byte[] r2, byte[] r3) throws java.security.GeneralSecurityException {
            r0 = this;
            byte[] r1 = super.encrypt(r1, r2, r3)
            return r1
    }

    @Override // com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305Base
    com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Base newChaCha20Instance(byte[] r2, int r3) throws java.security.InvalidKeyException {
            r1 = this;
            com.google.crypto.tink.aead.internal.InsecureNonceChaCha20 r0 = new com.google.crypto.tink.aead.internal.InsecureNonceChaCha20
            r0.<init>(r2, r3)
            return r0
    }
}
