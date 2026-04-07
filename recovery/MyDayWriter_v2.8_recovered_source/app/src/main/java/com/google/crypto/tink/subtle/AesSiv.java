package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class AesSiv implements com.google.crypto.tink.DeterministicAead {
    private static final byte[] BLOCK_ONE = null;
    private static final byte[] BLOCK_ZERO = null;
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private static final java.util.Collection<java.lang.Integer> KEY_SIZES = null;
    private final byte[] aesCtrKey;
    private final com.google.crypto.tink.subtle.PrfAesCmac cmacForS2V;

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS
            com.google.crypto.tink.subtle.AesSiv.FIPS = r0
            r0 = 1
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            r1 = 64
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.google.crypto.tink.subtle.AesSiv.KEY_SIZES = r0
            r0 = 16
            byte[] r1 = new byte[r0]
            com.google.crypto.tink.subtle.AesSiv.BLOCK_ZERO = r1
            byte[] r0 = new byte[r0]
            r0 = {x0024: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1} // fill-array
            com.google.crypto.tink.subtle.AesSiv.BLOCK_ONE = r0
            return
    }

    public AesSiv(byte[] r4) throws java.security.GeneralSecurityException {
            r3 = this;
            r3.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.AesSiv.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L52
            java.util.Collection<java.lang.Integer> r0 = com.google.crypto.tink.subtle.AesSiv.KEY_SIZES
            int r1 = r4.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L32
            int r0 = r4.length
            int r0 = r0 / 2
            r1 = 0
            byte[] r0 = java.util.Arrays.copyOfRange(r4, r1, r0)
            int r1 = r4.length
            int r1 = r1 / 2
            int r2 = r4.length
            byte[] r1 = java.util.Arrays.copyOfRange(r4, r1, r2)
            r3.aesCtrKey = r1
            com.google.crypto.tink.subtle.PrfAesCmac r1 = new com.google.crypto.tink.subtle.PrfAesCmac
            r1.<init>(r0)
            r3.cmacForS2V = r1
            return
        L32:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid key size: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r4.length
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " bytes; key must have 64 bytes"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L52:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Can not use AES-SIV in FIPS-mode."
            r0.<init>(r1)
            throw r0
    }

    private byte[] s2v(byte[]... r7) throws java.security.GeneralSecurityException {
            r6 = this;
            int r0 = r7.length
            r1 = 16
            if (r0 != 0) goto Le
            com.google.crypto.tink.subtle.PrfAesCmac r0 = r6.cmacForS2V
            byte[] r2 = com.google.crypto.tink.subtle.AesSiv.BLOCK_ONE
            byte[] r0 = r0.compute(r2, r1)
            return r0
        Le:
            com.google.crypto.tink.subtle.PrfAesCmac r0 = r6.cmacForS2V
            byte[] r2 = com.google.crypto.tink.subtle.AesSiv.BLOCK_ZERO
            byte[] r0 = r0.compute(r2, r1)
            r2 = 0
        L17:
            int r3 = r7.length
            int r3 = r3 + (-1)
            if (r2 >= r3) goto L37
            r3 = r7[r2]
            if (r3 != 0) goto L24
            r3 = 0
            byte[] r3 = new byte[r3]
            goto L26
        L24:
            r3 = r7[r2]
        L26:
            byte[] r4 = com.google.crypto.tink.mac.internal.AesUtil.dbl(r0)
            com.google.crypto.tink.subtle.PrfAesCmac r5 = r6.cmacForS2V
            byte[] r5 = r5.compute(r3, r1)
            byte[] r0 = com.google.crypto.tink.subtle.Bytes.xor(r4, r5)
            int r2 = r2 + 1
            goto L17
        L37:
            int r2 = r7.length
            int r2 = r2 + (-1)
            r2 = r7[r2]
            int r3 = r2.length
            if (r3 < r1) goto L44
            byte[] r0 = com.google.crypto.tink.subtle.Bytes.xorEnd(r2, r0)
            goto L50
        L44:
            byte[] r3 = com.google.crypto.tink.mac.internal.AesUtil.cmacPad(r2)
            byte[] r4 = com.google.crypto.tink.mac.internal.AesUtil.dbl(r0)
            byte[] r0 = com.google.crypto.tink.subtle.Bytes.xor(r3, r4)
        L50:
            com.google.crypto.tink.subtle.PrfAesCmac r3 = r6.cmacForS2V
            byte[] r1 = r3.compute(r0, r1)
            return r1
    }

    @Override // com.google.crypto.tink.DeterministicAead
    public byte[] decryptDeterministically(byte[] r9, byte[] r10) throws java.security.GeneralSecurityException {
            r8 = this;
            int r0 = r9.length
            r1 = 16
            if (r0 < r1) goto L6b
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TCipher, javax.crypto.Cipher> r0 = com.google.crypto.tink.subtle.EngineFactory.CIPHER
            java.lang.String r2 = "AES/CTR/NoPadding"
            java.lang.Object r0 = r0.getInstance(r2)
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            r2 = 0
            byte[] r3 = java.util.Arrays.copyOfRange(r9, r2, r1)
            java.lang.Object r4 = r3.clone()
            byte[] r4 = (byte[]) r4
            r5 = 8
            r6 = r4[r5]
            r6 = r6 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            r5 = 12
            r6 = r4[r5]
            r6 = r6 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec
            byte[] r6 = r8.aesCtrKey
            java.lang.String r7 = "AES"
            r5.<init>(r6, r7)
            javax.crypto.spec.IvParameterSpec r6 = new javax.crypto.spec.IvParameterSpec
            r6.<init>(r4)
            r7 = 2
            r0.init(r7, r5, r6)
            int r5 = r9.length
            byte[] r1 = java.util.Arrays.copyOfRange(r9, r1, r5)
            byte[] r5 = r0.doFinal(r1)
            int r6 = r1.length
            if (r6 != 0) goto L54
            if (r5 != 0) goto L54
            boolean r6 = com.google.crypto.tink.subtle.SubtleUtil.isAndroid()
            if (r6 == 0) goto L54
            byte[] r5 = new byte[r2]
        L54:
            byte[][] r2 = new byte[][]{r10, r5}
            byte[] r2 = r8.s2v(r2)
            boolean r6 = com.google.crypto.tink.subtle.Bytes.equal(r3, r2)
            if (r6 == 0) goto L63
            return r5
        L63:
            javax.crypto.AEADBadTagException r6 = new javax.crypto.AEADBadTagException
            java.lang.String r7 = "Integrity check failed."
            r6.<init>(r7)
            throw r6
        L6b:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Ciphertext too short."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.DeterministicAead
    public byte[] encryptDeterministically(byte[] r7, byte[] r8) throws java.security.GeneralSecurityException {
            r6 = this;
            int r0 = r7.length
            r1 = 2147483631(0x7fffffef, float:NaN)
            if (r0 > r1) goto L4f
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TCipher, javax.crypto.Cipher> r0 = com.google.crypto.tink.subtle.EngineFactory.CIPHER
            java.lang.String r1 = "AES/CTR/NoPadding"
            java.lang.Object r0 = r0.getInstance(r1)
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            byte[][] r1 = new byte[][]{r8, r7}
            byte[] r1 = r6.s2v(r1)
            java.lang.Object r2 = r1.clone()
            byte[] r2 = (byte[]) r2
            r3 = 8
            r4 = r2[r3]
            r4 = r4 & 127(0x7f, float:1.78E-43)
            byte r4 = (byte) r4
            r2[r3] = r4
            r3 = 12
            r4 = r2[r3]
            r4 = r4 & 127(0x7f, float:1.78E-43)
            byte r4 = (byte) r4
            r2[r3] = r4
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec
            byte[] r4 = r6.aesCtrKey
            java.lang.String r5 = "AES"
            r3.<init>(r4, r5)
            javax.crypto.spec.IvParameterSpec r4 = new javax.crypto.spec.IvParameterSpec
            r4.<init>(r2)
            r5 = 1
            r0.init(r5, r3, r4)
            byte[] r3 = r0.doFinal(r7)
            byte[][] r4 = new byte[][]{r1, r3}
            byte[] r4 = com.google.crypto.tink.subtle.Bytes.concat(r4)
            return r4
        L4f:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "plaintext too long"
            r0.<init>(r1)
            throw r0
    }
}
