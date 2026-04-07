package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class EncryptThenAuthenticate implements com.google.crypto.tink.Aead {
    private final com.google.crypto.tink.subtle.IndCpaCipher cipher;
    private final com.google.crypto.tink.Mac mac;
    private final int macLength;

    public EncryptThenAuthenticate(com.google.crypto.tink.subtle.IndCpaCipher r1, com.google.crypto.tink.Mac r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.cipher = r1
            r0.mac = r2
            r0.macLength = r3
            return
    }

    public static com.google.crypto.tink.Aead newAesCtrHmac(byte[] r4, int r5, java.lang.String r6, byte[] r7, int r8) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.AesCtrJceCipher r0 = new com.google.crypto.tink.subtle.AesCtrJceCipher
            r0.<init>(r4, r5)
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r2 = "HMAC"
            r1.<init>(r7, r2)
            com.google.crypto.tink.subtle.PrfMac r2 = new com.google.crypto.tink.subtle.PrfMac
            com.google.crypto.tink.subtle.PrfHmacJce r3 = new com.google.crypto.tink.subtle.PrfHmacJce
            r3.<init>(r6, r1)
            r2.<init>(r3, r8)
            com.google.crypto.tink.subtle.EncryptThenAuthenticate r3 = new com.google.crypto.tink.subtle.EncryptThenAuthenticate
            r3.<init>(r0, r2, r8)
            return r3
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] r10, byte[] r11) throws java.security.GeneralSecurityException {
            r9 = this;
            int r0 = r10.length
            int r1 = r9.macLength
            if (r0 < r1) goto L48
            int r0 = r10.length
            int r1 = r9.macLength
            int r0 = r0 - r1
            r1 = 0
            byte[] r0 = java.util.Arrays.copyOfRange(r10, r1, r0)
            int r2 = r10.length
            int r3 = r9.macLength
            int r2 = r2 - r3
            int r3 = r10.length
            byte[] r2 = java.util.Arrays.copyOfRange(r10, r2, r3)
            r3 = r11
            if (r3 != 0) goto L1c
            byte[] r3 = new byte[r1]
        L1c:
            r1 = 8
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r1)
            int r5 = r3.length
            long r5 = (long) r5
            r7 = 8
            long r5 = r5 * r7
            java.nio.ByteBuffer r4 = r4.putLong(r5)
            byte[] r4 = r4.array()
            byte[] r1 = java.util.Arrays.copyOf(r4, r1)
            com.google.crypto.tink.Mac r4 = r9.mac
            byte[][] r5 = new byte[][]{r3, r0, r1}
            byte[] r5 = com.google.crypto.tink.subtle.Bytes.concat(r5)
            r4.verifyMac(r2, r5)
            com.google.crypto.tink.subtle.IndCpaCipher r4 = r9.cipher
            byte[] r4 = r4.decrypt(r0)
            return r4
        L48:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "ciphertext too short"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] r9, byte[] r10) throws java.security.GeneralSecurityException {
            r8 = this;
            com.google.crypto.tink.subtle.IndCpaCipher r0 = r8.cipher
            byte[] r0 = r0.encrypt(r9)
            r1 = r10
            if (r1 != 0) goto Lc
            r2 = 0
            byte[] r1 = new byte[r2]
        Lc:
            r2 = 8
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r2)
            int r4 = r1.length
            long r4 = (long) r4
            r6 = 8
            long r4 = r4 * r6
            java.nio.ByteBuffer r3 = r3.putLong(r4)
            byte[] r3 = r3.array()
            byte[] r2 = java.util.Arrays.copyOf(r3, r2)
            com.google.crypto.tink.Mac r3 = r8.mac
            byte[][] r4 = new byte[][]{r1, r0, r2}
            byte[] r4 = com.google.crypto.tink.subtle.Bytes.concat(r4)
            byte[] r3 = r3.computeMac(r4)
            byte[][] r4 = new byte[][]{r0, r3}
            byte[] r4 = com.google.crypto.tink.subtle.Bytes.concat(r4)
            return r4
    }
}
