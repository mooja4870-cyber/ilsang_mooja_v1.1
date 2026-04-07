package com.google.crypto.tink.aead.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class AesGcmSiv implements com.google.crypto.tink.Aead {
    private static final int IV_SIZE_IN_BYTES = 12;
    private static final int TAG_SIZE_IN_BYTES = 16;
    private static final java.lang.ThreadLocal<javax.crypto.Cipher> localCipher = null;
    private final javax.crypto.SecretKey keySpec;


    static {
            com.google.crypto.tink.aead.subtle.AesGcmSiv$1 r0 = new com.google.crypto.tink.aead.subtle.AesGcmSiv$1
            r0.<init>()
            com.google.crypto.tink.aead.subtle.AesGcmSiv.localCipher = r0
            return
    }

    public AesGcmSiv(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            com.google.crypto.tink.subtle.Validators.validateAesKeySize(r0)
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)
            r2.keySpec = r0
            return
    }

    private static java.security.spec.AlgorithmParameterSpec getParams(byte[] r2) throws java.security.GeneralSecurityException {
            r0 = 0
            int r1 = r2.length
            java.security.spec.AlgorithmParameterSpec r0 = getParams(r2, r0, r1)
            return r0
    }

    private static java.security.spec.AlgorithmParameterSpec getParams(byte[] r2, int r3, int r4) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "javax.crypto.spec.GCMParameterSpec"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> Ld
            javax.crypto.spec.GCMParameterSpec r0 = new javax.crypto.spec.GCMParameterSpec     // Catch: java.lang.ClassNotFoundException -> Ld
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1, r2, r3, r4)     // Catch: java.lang.ClassNotFoundException -> Ld
            return r0
        Ld:
            r0 = move-exception
            boolean r1 = com.google.crypto.tink.subtle.SubtleUtil.isAndroid()
            if (r1 == 0) goto L1a
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec
            r1.<init>(r2, r3, r4)
            return r1
        L1a:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] r6, byte[] r7) throws java.security.GeneralSecurityException {
            r5 = this;
            int r0 = r6.length
            r1 = 28
            if (r0 < r1) goto L39
            r0 = 0
            r1 = 12
            java.security.spec.AlgorithmParameterSpec r0 = getParams(r6, r0, r1)
            java.lang.ThreadLocal<javax.crypto.Cipher> r2 = com.google.crypto.tink.aead.subtle.AesGcmSiv.localCipher
            java.lang.Object r2 = r2.get()
            javax.crypto.Cipher r2 = (javax.crypto.Cipher) r2
            r3 = 2
            javax.crypto.SecretKey r4 = r5.keySpec
            r2.init(r3, r4, r0)
            if (r7 == 0) goto L2a
            int r2 = r7.length
            if (r2 == 0) goto L2a
            java.lang.ThreadLocal<javax.crypto.Cipher> r2 = com.google.crypto.tink.aead.subtle.AesGcmSiv.localCipher
            java.lang.Object r2 = r2.get()
            javax.crypto.Cipher r2 = (javax.crypto.Cipher) r2
            r2.updateAAD(r7)
        L2a:
            java.lang.ThreadLocal<javax.crypto.Cipher> r2 = com.google.crypto.tink.aead.subtle.AesGcmSiv.localCipher
            java.lang.Object r2 = r2.get()
            javax.crypto.Cipher r2 = (javax.crypto.Cipher) r2
            int r3 = r6.length
            int r3 = r3 - r1
            byte[] r1 = r2.doFinal(r6, r1, r3)
            return r1
        L39:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "ciphertext too short"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] r10, byte[] r11) throws java.security.GeneralSecurityException {
            r9 = this;
            int r0 = r10.length
            r1 = 2147483619(0x7fffffe3, float:NaN)
            if (r0 > r1) goto L6a
            int r0 = r10.length
            r1 = 12
            int r0 = r0 + r1
            r2 = 16
            int r0 = r0 + r2
            byte[] r7 = new byte[r0]
            byte[] r0 = com.google.crypto.tink.subtle.Random.randBytes(r1)
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r7, r3, r1)
            java.security.spec.AlgorithmParameterSpec r1 = getParams(r0)
            java.lang.ThreadLocal<javax.crypto.Cipher> r3 = com.google.crypto.tink.aead.subtle.AesGcmSiv.localCipher
            java.lang.Object r3 = r3.get()
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            r4 = 1
            javax.crypto.SecretKey r5 = r9.keySpec
            r3.init(r4, r5, r1)
            if (r11 == 0) goto L39
            int r3 = r11.length
            if (r3 == 0) goto L39
            java.lang.ThreadLocal<javax.crypto.Cipher> r3 = com.google.crypto.tink.aead.subtle.AesGcmSiv.localCipher
            java.lang.Object r3 = r3.get()
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            r3.updateAAD(r11)
        L39:
            java.lang.ThreadLocal<javax.crypto.Cipher> r3 = com.google.crypto.tink.aead.subtle.AesGcmSiv.localCipher
            java.lang.Object r3 = r3.get()
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            int r6 = r10.length
            r8 = 12
            r5 = 0
            r4 = r10
            int r10 = r3.doFinal(r4, r5, r6, r7, r8)
            int r3 = r4.length
            int r3 = r3 + r2
            if (r10 != r3) goto L4f
            return r7
        L4f:
            int r3 = r4.length
            int r3 = r10 - r3
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r6}
            java.lang.String r6 = "encryption failed; GCM tag must be %s bytes, but got only %s bytes"
            java.lang.String r2 = java.lang.String.format(r6, r2)
            r5.<init>(r2)
            throw r5
        L6a:
            r4 = r10
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r0 = "plaintext too long"
            r10.<init>(r0)
            throw r10
    }
}
