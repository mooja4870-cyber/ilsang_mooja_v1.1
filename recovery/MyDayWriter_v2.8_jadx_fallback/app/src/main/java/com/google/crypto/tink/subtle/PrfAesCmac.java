package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class PrfAesCmac implements com.google.crypto.tink.prf.Prf {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private final javax.crypto.SecretKey keySpec;
    private byte[] subKey1;
    private byte[] subKey2;

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS
            com.google.crypto.tink.subtle.PrfAesCmac.FIPS = r0
            return
    }

    public PrfAesCmac(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            com.google.crypto.tink.subtle.Validators.validateAesKeySize(r0)
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)
            r2.keySpec = r0
            r2.generateSubKeys()
            return
    }

    private void generateSubKeys() throws java.security.GeneralSecurityException {
            r4 = this;
            javax.crypto.Cipher r0 = instance()
            r1 = 1
            javax.crypto.SecretKey r2 = r4.keySpec
            r0.init(r1, r2)
            r1 = 16
            byte[] r1 = new byte[r1]
            byte[] r2 = r0.doFinal(r1)
            byte[] r3 = com.google.crypto.tink.mac.internal.AesUtil.dbl(r2)
            r4.subKey1 = r3
            byte[] r3 = r4.subKey1
            byte[] r3 = com.google.crypto.tink.mac.internal.AesUtil.dbl(r3)
            r4.subKey2 = r3
            return
    }

    private static javax.crypto.Cipher instance() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.PrfAesCmac.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L13
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TCipher, javax.crypto.Cipher> r0 = com.google.crypto.tink.subtle.EngineFactory.CIPHER
            java.lang.String r1 = "AES/ECB/NoPadding"
            java.lang.Object r0 = r0.getInstance(r1)
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            return r0
        L13:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Can not use AES-CMAC in FIPS-mode."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] r10, int r11) throws java.security.GeneralSecurityException {
            r9 = this;
            r0 = 16
            if (r11 > r0) goto L63
            javax.crypto.Cipher r1 = instance()
            javax.crypto.SecretKey r2 = r9.keySpec
            r3 = 1
            r1.init(r3, r2)
            int r2 = r10.length
            double r4 = (double) r2
            r6 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r4 = r4 / r6
            double r4 = java.lang.Math.ceil(r4)
            int r2 = (int) r4
            int r2 = java.lang.Math.max(r3, r2)
            int r4 = r2 * 16
            int r5 = r10.length
            r6 = 0
            if (r4 != r5) goto L23
            goto L24
        L23:
            r3 = r6
        L24:
            if (r3 == 0) goto L30
            int r4 = r2 + (-1)
            int r4 = r4 * r0
            byte[] r5 = r9.subKey1
            byte[] r4 = com.google.crypto.tink.subtle.Bytes.xor(r10, r4, r5, r6, r0)
            goto L42
        L30:
            int r4 = r2 + (-1)
            int r4 = r4 * r0
            int r5 = r10.length
            byte[] r4 = java.util.Arrays.copyOfRange(r10, r4, r5)
            byte[] r4 = com.google.crypto.tink.mac.internal.AesUtil.cmacPad(r4)
            byte[] r5 = r9.subKey2
            byte[] r4 = com.google.crypto.tink.subtle.Bytes.xor(r4, r5)
        L42:
            byte[] r5 = new byte[r0]
            r7 = 0
        L45:
            int r8 = r2 + (-1)
            if (r7 >= r8) goto L56
            int r8 = r7 * 16
            byte[] r8 = com.google.crypto.tink.subtle.Bytes.xor(r5, r6, r10, r8, r0)
            byte[] r5 = r1.doFinal(r8)
            int r7 = r7 + 1
            goto L45
        L56:
            byte[] r0 = com.google.crypto.tink.subtle.Bytes.xor(r4, r5)
            byte[] r6 = r1.doFinal(r0)
            byte[] r6 = java.util.Arrays.copyOf(r6, r11)
            return r6
        L63:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r1 = "outputLength too large, max is 16 bytes"
            r0.<init>(r1)
            throw r0
    }
}
