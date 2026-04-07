package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class AesCtrJceCipher implements com.google.crypto.tink.subtle.IndCpaCipher {
    private static final java.lang.String CIPHER_ALGORITHM = "AES/CTR/NoPadding";
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private static final java.lang.String KEY_ALGORITHM = "AES";
    private static final int MIN_IV_SIZE_IN_BYTES = 12;
    private static final java.lang.ThreadLocal<javax.crypto.Cipher> localCipher = null;
    private final int blockSize;
    private final int ivSize;
    private final javax.crypto.spec.SecretKeySpec keySpec;


    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            com.google.crypto.tink.subtle.AesCtrJceCipher.FIPS = r0
            com.google.crypto.tink.subtle.AesCtrJceCipher$1 r0 = new com.google.crypto.tink.subtle.AesCtrJceCipher$1
            r0.<init>()
            com.google.crypto.tink.subtle.AesCtrJceCipher.localCipher = r0
            return
    }

    public AesCtrJceCipher(byte[] r3, int r4) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.AesCtrJceCipher.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L39
            int r0 = r3.length
            com.google.crypto.tink.subtle.Validators.validateAesKeySize(r0)
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)
            r2.keySpec = r0
            java.lang.ThreadLocal<javax.crypto.Cipher> r0 = com.google.crypto.tink.subtle.AesCtrJceCipher.localCipher
            java.lang.Object r0 = r0.get()
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            int r0 = r0.getBlockSize()
            r2.blockSize = r0
            r0 = 12
            if (r4 < r0) goto L31
            int r0 = r2.blockSize
            if (r4 > r0) goto L31
            r2.ivSize = r4
            return
        L31:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "invalid IV size"
            r0.<init>(r1)
            throw r0
        L39:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available."
            r0.<init>(r1)
            throw r0
    }

    private void doCtr(byte[] r9, int r10, int r11, byte[] r12, int r13, byte[] r14, boolean r15) throws java.security.GeneralSecurityException {
            r8 = this;
            java.lang.ThreadLocal<javax.crypto.Cipher> r0 = com.google.crypto.tink.subtle.AesCtrJceCipher.localCipher
            java.lang.Object r0 = r0.get()
            r1 = r0
            javax.crypto.Cipher r1 = (javax.crypto.Cipher) r1
            int r0 = r8.blockSize
            byte[] r0 = new byte[r0]
            r2 = 0
            int r3 = r8.ivSize
            java.lang.System.arraycopy(r14, r2, r0, r2, r3)
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec
            r2.<init>(r0)
            r7 = r2
            if (r15 == 0) goto L22
            r2 = 1
            javax.crypto.spec.SecretKeySpec r3 = r8.keySpec
            r1.init(r2, r3, r7)
            goto L28
        L22:
            r2 = 2
            javax.crypto.spec.SecretKeySpec r3 = r8.keySpec
            r1.init(r2, r3, r7)
        L28:
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            int r9 = r1.doFinal(r2, r3, r4, r5, r6)
            if (r9 != r4) goto L34
            return
        L34:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "stored output's length does not match input's length"
            r10.<init>(r11)
            throw r10
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] decrypt(byte[] r10) throws java.security.GeneralSecurityException {
            r9 = this;
            int r0 = r10.length
            int r1 = r9.ivSize
            if (r0 < r1) goto L24
            int r0 = r9.ivSize
            byte[] r7 = new byte[r0]
            int r0 = r9.ivSize
            r1 = 0
            java.lang.System.arraycopy(r10, r1, r7, r1, r0)
            int r0 = r10.length
            int r1 = r9.ivSize
            int r0 = r0 - r1
            byte[] r5 = new byte[r0]
            int r3 = r9.ivSize
            int r0 = r10.length
            int r1 = r9.ivSize
            int r4 = r0 - r1
            r6 = 0
            r8 = 0
            r1 = r9
            r2 = r10
            r1.doCtr(r2, r3, r4, r5, r6, r7, r8)
            return r5
        L24:
            r2 = r10
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r0 = "ciphertext too short"
            r10.<init>(r0)
            throw r10
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] encrypt(byte[] r10) throws java.security.GeneralSecurityException {
            r9 = this;
            int r0 = r10.length
            int r1 = r9.ivSize
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r2 - r1
            if (r0 > r1) goto L27
            int r0 = r9.ivSize
            int r1 = r10.length
            int r0 = r0 + r1
            byte[] r5 = new byte[r0]
            int r0 = r9.ivSize
            byte[] r7 = com.google.crypto.tink.subtle.Random.randBytes(r0)
            int r0 = r9.ivSize
            r1 = 0
            java.lang.System.arraycopy(r7, r1, r5, r1, r0)
            int r4 = r10.length
            int r6 = r9.ivSize
            r8 = 1
            r3 = 0
            r1 = r9
            r2 = r10
            r1.doCtr(r2, r3, r4, r5, r6, r7, r8)
            return r5
        L27:
            r1 = r9
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "plaintext length can not exceed "
            java.lang.StringBuilder r3 = r3.append(r4)
            int r4 = r1.ivSize
            int r2 = r2 - r4
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }
}
