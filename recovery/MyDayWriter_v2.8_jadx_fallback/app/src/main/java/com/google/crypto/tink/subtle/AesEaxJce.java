package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class AesEaxJce implements com.google.crypto.tink.Aead {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int BLOCK_SIZE_IN_BYTES = 16;
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    static final int TAG_SIZE_IN_BYTES = 16;
    private static final java.lang.ThreadLocal<javax.crypto.Cipher> localCtrCipher = null;
    private static final java.lang.ThreadLocal<javax.crypto.Cipher> localEcbCipher = null;
    private final byte[] b;
    private final int ivSizeInBytes;
    private final javax.crypto.spec.SecretKeySpec keySpec;
    private final byte[] p;



    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS
            com.google.crypto.tink.subtle.AesEaxJce.FIPS = r0
            com.google.crypto.tink.subtle.AesEaxJce$1 r0 = new com.google.crypto.tink.subtle.AesEaxJce$1
            r0.<init>()
            com.google.crypto.tink.subtle.AesEaxJce.localEcbCipher = r0
            com.google.crypto.tink.subtle.AesEaxJce$2 r0 = new com.google.crypto.tink.subtle.AesEaxJce$2
            r0.<init>()
            com.google.crypto.tink.subtle.AesEaxJce.localCtrCipher = r0
            return
    }

    public AesEaxJce(byte[] r5, int r6) throws java.security.GeneralSecurityException {
            r4 = this;
            r4.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.AesEaxJce.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L4e
            r0 = 12
            r1 = 16
            if (r6 == r0) goto L1c
            if (r6 != r1) goto L14
            goto L1c
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "IV size should be either 12 or 16 bytes"
            r0.<init>(r1)
            throw r0
        L1c:
            r4.ivSizeInBytes = r6
            int r0 = r5.length
            com.google.crypto.tink.subtle.Validators.validateAesKeySize(r0)
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r2 = "AES"
            r0.<init>(r5, r2)
            r4.keySpec = r0
            java.lang.ThreadLocal<javax.crypto.Cipher> r0 = com.google.crypto.tink.subtle.AesEaxJce.localEcbCipher
            java.lang.Object r0 = r0.get()
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            r2 = 1
            javax.crypto.spec.SecretKeySpec r3 = r4.keySpec
            r0.init(r2, r3)
            byte[] r1 = new byte[r1]
            byte[] r1 = r0.doFinal(r1)
            byte[] r2 = multiplyByX(r1)
            r4.b = r2
            byte[] r2 = r4.b
            byte[] r2 = multiplyByX(r2)
            r4.p = r2
            return
        L4e:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Can not use AES-EAX in FIPS-mode."
            r0.<init>(r1)
            throw r0
    }

    private static byte[] multiplyByX(byte[] r4) {
            r0 = 16
            byte[] r0 = new byte[r0]
            r1 = 0
        L5:
            r2 = 15
            if (r1 >= r2) goto L1e
            r2 = r4[r1]
            int r2 = r2 << 1
            int r3 = r1 + 1
            r3 = r4[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 >>> 7
            r2 = r2 ^ r3
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L5
        L1e:
            r1 = r4[r2]
            int r1 = r1 << 1
            r3 = 0
            r3 = r4[r3]
            int r3 = r3 >> 7
            r3 = r3 & 135(0x87, float:1.89E-43)
            r1 = r1 ^ r3
            byte r1 = (byte) r1
            r0[r2] = r1
            return r0
    }

    private byte[] omac(javax.crypto.Cipher r7, int r8, byte[] r9, int r10, int r11) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
            r6 = this;
            if (r11 < 0) goto L59
            if (r8 < 0) goto L53
            r0 = 3
            if (r8 > r0) goto L53
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 15
            byte r3 = (byte) r8
            r1[r2] = r3
            if (r11 != 0) goto L1d
            byte[] r0 = r6.b
            byte[] r0 = xor(r1, r0)
            byte[] r0 = r7.doFinal(r0)
            return r0
        L1d:
            byte[] r1 = r7.doFinal(r1)
            r2 = 0
        L22:
            int r3 = r11 - r2
            if (r3 <= r0) goto L3e
            r3 = 0
        L27:
            if (r3 >= r0) goto L37
            r4 = r1[r3]
            int r5 = r10 + r2
            int r5 = r5 + r3
            r5 = r9[r5]
            r4 = r4 ^ r5
            byte r4 = (byte) r4
            r1[r3] = r4
            int r3 = r3 + 1
            goto L27
        L37:
            byte[] r1 = r7.doFinal(r1)
            int r2 = r2 + 16
            goto L22
        L3e:
            int r0 = r10 + r2
            int r3 = r10 + r11
            byte[] r0 = java.util.Arrays.copyOfRange(r9, r0, r3)
            byte[] r0 = r6.pad(r0)
            byte[] r1 = xor(r1, r0)
            byte[] r3 = r7.doFinal(r1)
            return r3
        L53:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L59:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }

    private byte[] pad(byte[] r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 16
            if (r0 != r1) goto Lc
            byte[] r0 = r4.b
            byte[] r0 = xor(r5, r0)
            return r0
        Lc:
            byte[] r0 = r4.p
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 0
        L13:
            int r2 = r5.length
            if (r1 >= r2) goto L21
            r2 = r0[r1]
            r3 = r5[r1]
            r2 = r2 ^ r3
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L13
        L21:
            int r1 = r5.length
            int r2 = r5.length
            r2 = r0[r2]
            r2 = r2 ^ 128(0x80, float:1.8E-43)
            byte r2 = (byte) r2
            r0[r1] = r2
            return r0
    }

    private static byte[] xor(byte[] r5, byte[] r6) {
            int r0 = r5.length
            int r1 = r6.length
            if (r0 != r1) goto L16
            int r0 = r5.length
            byte[] r1 = new byte[r0]
            r2 = 0
        L8:
            if (r2 >= r0) goto L15
            r3 = r5[r2]
            r4 = r6[r2]
            r3 = r3 ^ r4
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L8
        L15:
            return r1
        L16:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] r16, byte[] r17) throws java.security.GeneralSecurityException {
            r15 = this;
            r3 = r16
            int r1 = r3.length
            int r2 = r15.ivSizeInBytes
            int r1 = r1 - r2
            r6 = 16
            int r7 = r1 + (-16)
            if (r7 < 0) goto L7b
            java.lang.ThreadLocal<javax.crypto.Cipher> r1 = com.google.crypto.tink.subtle.AesEaxJce.localEcbCipher
            java.lang.Object r1 = r1.get()
            javax.crypto.Cipher r1 = (javax.crypto.Cipher) r1
            javax.crypto.spec.SecretKeySpec r2 = r15.keySpec
            r8 = 1
            r1.init(r8, r2)
            r4 = 0
            int r5 = r15.ivSizeInBytes
            r2 = 0
            r0 = r15
            byte[] r9 = r0.omac(r1, r2, r3, r4, r5)
            r0 = r17
            if (r0 != 0) goto L2c
            r2 = 0
            byte[] r0 = new byte[r2]
            r3 = r0
            goto L2d
        L2c:
            r3 = r0
        L2d:
            r4 = 0
            int r5 = r3.length
            r2 = 1
            r0 = r15
            byte[] r10 = r0.omac(r1, r2, r3, r4, r5)
            r11 = r3
            r2 = 2
            int r4 = r15.ivSizeInBytes
            r3 = r16
            r5 = r7
            byte[] r2 = r0.omac(r1, r2, r3, r4, r5)
            r4 = 0
            int r7 = r3.length
            int r7 = r7 - r6
            r12 = 0
        L44:
            if (r12 >= r6) goto L58
            int r13 = r7 + r12
            r13 = r3[r13]
            r14 = r10[r12]
            r13 = r13 ^ r14
            r14 = r9[r12]
            r13 = r13 ^ r14
            r14 = r2[r12]
            r13 = r13 ^ r14
            r13 = r13 | r4
            byte r4 = (byte) r13
            int r12 = r12 + 1
            goto L44
        L58:
            if (r4 != 0) goto L73
            java.lang.ThreadLocal<javax.crypto.Cipher> r6 = com.google.crypto.tink.subtle.AesEaxJce.localCtrCipher
            java.lang.Object r6 = r6.get()
            javax.crypto.Cipher r6 = (javax.crypto.Cipher) r6
            javax.crypto.spec.SecretKeySpec r12 = r15.keySpec
            javax.crypto.spec.IvParameterSpec r13 = new javax.crypto.spec.IvParameterSpec
            r13.<init>(r9)
            r6.init(r8, r12, r13)
            int r8 = r15.ivSizeInBytes
            byte[] r8 = r6.doFinal(r3, r8, r5)
            return r8
        L73:
            javax.crypto.AEADBadTagException r6 = new javax.crypto.AEADBadTagException
            java.lang.String r8 = "tag mismatch"
            r6.<init>(r8)
            throw r6
        L7b:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "ciphertext too short"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] r17, byte[] r18) throws java.security.GeneralSecurityException {
            r16 = this;
            r0 = r16
            r6 = r17
            int r1 = r6.length
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r0.ivSizeInBytes
            int r2 = r2 - r3
            r7 = 16
            int r2 = r2 - r7
            if (r1 > r2) goto L8d
            int r1 = r0.ivSizeInBytes
            int r2 = r6.length
            int r1 = r1 + r2
            int r1 = r1 + r7
            byte[] r8 = new byte[r1]
            int r1 = r0.ivSizeInBytes
            byte[] r3 = com.google.crypto.tink.subtle.Random.randBytes(r1)
            int r1 = r0.ivSizeInBytes
            r9 = 0
            java.lang.System.arraycopy(r3, r9, r8, r9, r1)
            java.lang.ThreadLocal<javax.crypto.Cipher> r1 = com.google.crypto.tink.subtle.AesEaxJce.localEcbCipher
            java.lang.Object r1 = r1.get()
            javax.crypto.Cipher r1 = (javax.crypto.Cipher) r1
            javax.crypto.spec.SecretKeySpec r2 = r0.keySpec
            r10 = 1
            r1.init(r10, r2)
            r4 = 0
            int r5 = r3.length
            r2 = 0
            byte[] r11 = r0.omac(r1, r2, r3, r4, r5)
            r12 = r3
            r0 = r18
            if (r0 != 0) goto L41
            byte[] r0 = new byte[r9]
            r3 = r0
            goto L42
        L41:
            r3 = r0
        L42:
            r4 = 0
            int r5 = r3.length
            r2 = 1
            r0 = r16
            byte[] r9 = r0.omac(r1, r2, r3, r4, r5)
            r13 = r0
            r14 = r1
            r15 = r3
            java.lang.ThreadLocal<javax.crypto.Cipher> r0 = com.google.crypto.tink.subtle.AesEaxJce.localCtrCipher
            java.lang.Object r0 = r0.get()
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            javax.crypto.spec.SecretKeySpec r1 = r13.keySpec
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec
            r2.<init>(r11)
            r0.init(r10, r1, r2)
            int r3 = r6.length
            int r5 = r13.ivSizeInBytes
            r2 = 0
            r1 = r6
            r4 = r8
            r0.doFinal(r1, r2, r3, r4, r5)
            r8 = r0
            r3 = r4
            int r4 = r13.ivSizeInBytes
            int r5 = r6.length
            r2 = 2
            r0 = r13
            r1 = r14
            byte[] r2 = r0.omac(r1, r2, r3, r4, r5)
            int r4 = r6.length
            int r5 = r0.ivSizeInBytes
            int r4 = r4 + r5
            r5 = 0
        L7a:
            if (r5 >= r7) goto L8c
            int r10 = r4 + r5
            r13 = r9[r5]
            r14 = r11[r5]
            r13 = r13 ^ r14
            r14 = r2[r5]
            r13 = r13 ^ r14
            byte r13 = (byte) r13
            r3[r10] = r13
            int r5 = r5 + 1
            goto L7a
        L8c:
            return r3
        L8d:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "plaintext too long"
            r1.<init>(r2)
            throw r1
    }
}
