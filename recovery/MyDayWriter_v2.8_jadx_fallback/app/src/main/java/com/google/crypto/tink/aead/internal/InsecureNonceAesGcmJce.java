package com.google.crypto.tink.aead.internal;

/* JADX INFO: loaded from: classes.dex */
public final class InsecureNonceAesGcmJce {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    public static final int IV_SIZE_IN_BYTES = 12;
    public static final int TAG_SIZE_IN_BYTES = 16;
    private static final java.lang.ThreadLocal<javax.crypto.Cipher> localCipher = null;
    private final javax.crypto.SecretKey keySpec;
    private final boolean prependIv;


    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce.FIPS = r0
            com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce$1 r0 = new com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce$1
            r0.<init>()
            com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce.localCipher = r0
            return
    }

    public InsecureNonceAesGcmJce(byte[] r3, boolean r4) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L1b
            int r0 = r3.length
            com.google.crypto.tink.subtle.Validators.validateAesKeySize(r0)
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)
            r2.keySpec = r0
            r2.prependIv = r4
            return
        L1b:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."
            r0.<init>(r1)
            throw r0
    }

    private static java.security.spec.AlgorithmParameterSpec getParams(byte[] r2) throws java.security.GeneralSecurityException {
            r0 = 0
            int r1 = r2.length
            java.security.spec.AlgorithmParameterSpec r0 = getParams(r2, r0, r1)
            return r0
    }

    private static java.security.spec.AlgorithmParameterSpec getParams(byte[] r2, int r3, int r4) throws java.security.GeneralSecurityException {
            boolean r0 = com.google.crypto.tink.subtle.SubtleUtil.isAndroid()
            if (r0 == 0) goto L14
            int r0 = com.google.crypto.tink.subtle.SubtleUtil.androidApiLevel()
            r1 = 19
            if (r0 > r1) goto L14
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec
            r0.<init>(r2, r3, r4)
            return r0
        L14:
            javax.crypto.spec.GCMParameterSpec r0 = new javax.crypto.spec.GCMParameterSpec
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public byte[] decrypt(byte[] r8, byte[] r9, byte[] r10) throws java.security.GeneralSecurityException {
            r7 = this;
            int r0 = r8.length
            r1 = 12
            if (r0 != r1) goto L71
            boolean r0 = r7.prependIv
            if (r0 == 0) goto Lc
            r0 = 28
            goto Le
        Lc:
            r0 = 16
        Le:
            int r2 = r9.length
            if (r2 < r0) goto L69
            boolean r2 = r7.prependIv
            r3 = 0
            if (r2 == 0) goto L2d
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r8)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r9, r3, r1)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L25
            goto L2d
        L25:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "iv does not match prepended iv"
            r1.<init>(r2)
            throw r1
        L2d:
            java.security.spec.AlgorithmParameterSpec r2 = getParams(r8)
            java.lang.ThreadLocal<javax.crypto.Cipher> r4 = com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce.localCipher
            java.lang.Object r4 = r4.get()
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
            r5 = 2
            javax.crypto.SecretKey r6 = r7.keySpec
            r4.init(r5, r6, r2)
            if (r10 == 0) goto L4f
            int r4 = r10.length
            if (r4 == 0) goto L4f
            java.lang.ThreadLocal<javax.crypto.Cipher> r4 = com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce.localCipher
            java.lang.Object r4 = r4.get()
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
            r4.updateAAD(r10)
        L4f:
            boolean r4 = r7.prependIv
            if (r4 == 0) goto L54
            r3 = r1
        L54:
            boolean r4 = r7.prependIv
            if (r4 == 0) goto L5b
            int r4 = r9.length
            int r4 = r4 - r1
            goto L5c
        L5b:
            int r4 = r9.length
        L5c:
            java.lang.ThreadLocal<javax.crypto.Cipher> r1 = com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce.localCipher
            java.lang.Object r1 = r1.get()
            javax.crypto.Cipher r1 = (javax.crypto.Cipher) r1
            byte[] r1 = r1.doFinal(r9, r3, r4)
            return r1
        L69:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "ciphertext too short"
            r1.<init>(r2)
            throw r1
        L71:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "iv is wrong size"
            r0.<init>(r1)
            throw r0
    }

    public byte[] encrypt(byte[] r11, byte[] r12, byte[] r13) throws java.security.GeneralSecurityException {
            r10 = this;
            int r0 = r11.length
            r1 = 12
            if (r0 != r1) goto L84
            int r0 = r12.length
            r2 = 2147483619(0x7fffffe3, float:NaN)
            if (r0 > r2) goto L7b
            boolean r0 = r10.prependIv
            r2 = 16
            if (r0 == 0) goto L15
            int r0 = r12.length
            int r0 = r0 + r1
            int r0 = r0 + r2
            goto L17
        L15:
            int r0 = r12.length
            int r0 = r0 + r2
        L17:
            byte[] r7 = new byte[r0]
            boolean r3 = r10.prependIv
            r4 = 0
            if (r3 == 0) goto L22
            java.lang.System.arraycopy(r11, r4, r7, r4, r1)
        L22:
            java.security.spec.AlgorithmParameterSpec r9 = getParams(r11)
            java.lang.ThreadLocal<javax.crypto.Cipher> r3 = com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce.localCipher
            java.lang.Object r3 = r3.get()
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            r5 = 1
            javax.crypto.SecretKey r6 = r10.keySpec
            r3.init(r5, r6, r9)
            if (r13 == 0) goto L44
            int r3 = r13.length
            if (r3 == 0) goto L44
            java.lang.ThreadLocal<javax.crypto.Cipher> r3 = com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce.localCipher
            java.lang.Object r3 = r3.get()
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            r3.updateAAD(r13)
        L44:
            boolean r3 = r10.prependIv
            if (r3 == 0) goto L4a
            r8 = r1
            goto L4b
        L4a:
            r8 = r4
        L4b:
            java.lang.ThreadLocal<javax.crypto.Cipher> r1 = com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce.localCipher
            java.lang.Object r1 = r1.get()
            r3 = r1
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            int r6 = r12.length
            r5 = 0
            r4 = r12
            int r12 = r3.doFinal(r4, r5, r6, r7, r8)
            int r1 = r4.length
            int r1 = r1 + r2
            if (r12 != r1) goto L60
            return r7
        L60:
            int r1 = r4.length
            int r1 = r12 - r1
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r5}
            java.lang.String r5 = "encryption failed; GCM tag must be %s bytes, but got only %s bytes"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            r3.<init>(r2)
            throw r3
        L7b:
            r4 = r12
            java.security.GeneralSecurityException r12 = new java.security.GeneralSecurityException
            java.lang.String r0 = "plaintext too long"
            r12.<init>(r0)
            throw r12
        L84:
            r4 = r12
            java.security.GeneralSecurityException r12 = new java.security.GeneralSecurityException
            java.lang.String r0 = "iv is wrong size"
            r12.<init>(r0)
            throw r12
    }
}
