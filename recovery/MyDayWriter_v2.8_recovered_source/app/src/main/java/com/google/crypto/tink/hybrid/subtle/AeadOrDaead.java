package com.google.crypto.tink.hybrid.subtle;

/* JADX INFO: loaded from: classes.dex */
public class AeadOrDaead {
    private final com.google.crypto.tink.Aead aead;
    private final com.google.crypto.tink.DeterministicAead deterministicAead;

    public AeadOrDaead(com.google.crypto.tink.Aead r2) {
            r1 = this;
            r1.<init>()
            r1.aead = r2
            r0 = 0
            r1.deterministicAead = r0
            return
    }

    public AeadOrDaead(com.google.crypto.tink.DeterministicAead r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.aead = r0
            r1.deterministicAead = r2
            return
    }

    public byte[] decrypt(byte[] r2, byte[] r3) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.Aead r0 = r1.aead
            if (r0 == 0) goto Lb
            com.google.crypto.tink.Aead r0 = r1.aead
            byte[] r0 = r0.decrypt(r2, r3)
            return r0
        Lb:
            com.google.crypto.tink.DeterministicAead r0 = r1.deterministicAead
            byte[] r0 = r0.decryptDeterministically(r2, r3)
            return r0
    }

    public byte[] encrypt(byte[] r2, byte[] r3) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.Aead r0 = r1.aead
            if (r0 == 0) goto Lb
            com.google.crypto.tink.Aead r0 = r1.aead
            byte[] r0 = r0.encrypt(r2, r3)
            return r0
        Lb:
            com.google.crypto.tink.DeterministicAead r0 = r1.deterministicAead
            byte[] r0 = r0.encryptDeterministically(r2, r3)
            return r0
    }
}
