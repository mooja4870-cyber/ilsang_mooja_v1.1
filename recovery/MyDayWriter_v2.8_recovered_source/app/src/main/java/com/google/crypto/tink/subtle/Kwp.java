package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public class Kwp implements com.google.crypto.tink.KeyWrap {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int MAX_WRAP_KEY_SIZE = 4096;
    static final int MIN_WRAP_KEY_SIZE = 16;
    static final byte[] PREFIX = null;
    static final int ROUNDS = 6;
    private final javax.crypto.SecretKey aesKey;

    static {
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [-90, 89, 89, -90} // fill-array
            com.google.crypto.tink.subtle.Kwp.PREFIX = r0
            return
    }

    public Kwp(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            r1 = 16
            if (r0 == r1) goto L16
            int r0 = r3.length
            r1 = 32
            if (r0 != r1) goto Le
            goto L16
        Le:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Unsupported key length"
            r0.<init>(r1)
            throw r0
        L16:
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)
            r2.aesKey = r0
            return
    }

    private byte[] computeW(byte[] r18, byte[] r19) throws java.security.GeneralSecurityException {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r2.length
            r4 = 8
            if (r3 <= r4) goto L89
            int r3 = r2.length
            r5 = 2147483631(0x7fffffef, float:NaN)
            if (r3 > r5) goto L89
            int r3 = r1.length
            if (r3 != r4) goto L89
            int r3 = r2.length
            int r3 = r0.wrappingSize(r3)
            byte[] r3 = new byte[r3]
            int r5 = r1.length
            r6 = 0
            java.lang.System.arraycopy(r1, r6, r3, r6, r5)
            int r5 = r2.length
            java.lang.System.arraycopy(r2, r6, r3, r4, r5)
            int r5 = r3.length
            int r5 = r5 / r4
            r7 = 1
            int r5 = r5 - r7
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TCipher, javax.crypto.Cipher> r8 = com.google.crypto.tink.subtle.EngineFactory.CIPHER
            java.lang.String r9 = "AES/ECB/NoPadding"
            java.lang.Object r8 = r8.getInstance(r9)
            javax.crypto.Cipher r8 = (javax.crypto.Cipher) r8
            javax.crypto.SecretKey r9 = r0.aesKey
            r8.init(r7, r9)
            r9 = 16
            byte[] r10 = new byte[r9]
            java.lang.System.arraycopy(r3, r6, r10, r6, r4)
            r11 = 0
        L3f:
            r12 = 6
            if (r11 >= r12) goto L85
            r12 = 0
        L43:
            if (r12 >= r5) goto L7f
            int r13 = r12 + 1
            int r13 = r13 * r4
            java.lang.System.arraycopy(r3, r13, r10, r4, r4)
            int r13 = r8.doFinal(r10, r6, r9, r10)
            if (r13 != r9) goto L79
            int r14 = r11 * r5
            int r14 = r14 + r12
            int r14 = r14 + r7
            r15 = 0
        L56:
            r7 = 4
            if (r15 >= r7) goto L6d
            int r7 = 7 - r15
            r16 = r10[r7]
            r9 = r14 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r9 = r16 ^ r9
            byte r9 = (byte) r9
            r10[r7] = r9
            int r14 = r14 >>> 8
            int r15 = r15 + 1
            r7 = 1
            r9 = 16
            goto L56
        L6d:
            int r7 = r12 + 1
            int r7 = r7 * r4
            java.lang.System.arraycopy(r10, r4, r3, r7, r4)
            int r12 = r12 + 1
            r7 = 1
            r9 = 16
            goto L43
        L79:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L7f:
            int r11 = r11 + 1
            r7 = 1
            r9 = 16
            goto L3f
        L85:
            java.lang.System.arraycopy(r10, r6, r3, r6, r4)
            return r3
        L89:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "computeW called with invalid parameters"
            r3.<init>(r4)
            throw r3
    }

    private byte[] invertW(byte[] r15) throws java.security.GeneralSecurityException {
            r14 = this;
            int r0 = r15.length
            r1 = 24
            if (r0 < r1) goto L6e
            int r0 = r15.length
            r1 = 8
            int r0 = r0 % r1
            if (r0 != 0) goto L6e
            int r0 = r15.length
            byte[] r0 = java.util.Arrays.copyOf(r15, r0)
            int r2 = r0.length
            int r2 = r2 / r1
            int r2 = r2 + (-1)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TCipher, javax.crypto.Cipher> r3 = com.google.crypto.tink.subtle.EngineFactory.CIPHER
            java.lang.String r4 = "AES/ECB/NoPadding"
            java.lang.Object r3 = r3.getInstance(r4)
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            r4 = 2
            javax.crypto.SecretKey r5 = r14.aesKey
            r3.init(r4, r5)
            r4 = 16
            byte[] r5 = new byte[r4]
            r6 = 0
            java.lang.System.arraycopy(r0, r6, r5, r6, r1)
            r7 = 5
        L2d:
            if (r7 < 0) goto L6a
            int r8 = r2 + (-1)
        L31:
            if (r8 < 0) goto L67
            int r9 = r8 + 1
            int r9 = r9 * r1
            java.lang.System.arraycopy(r0, r9, r5, r1, r1)
            int r9 = r7 * r2
            int r9 = r9 + r8
            int r9 = r9 + 1
            r10 = 0
        L3f:
            r11 = 4
            if (r10 >= r11) goto L52
            int r11 = 7 - r10
            r12 = r5[r11]
            r13 = r9 & 255(0xff, float:3.57E-43)
            byte r13 = (byte) r13
            r12 = r12 ^ r13
            byte r12 = (byte) r12
            r5[r11] = r12
            int r9 = r9 >>> 8
            int r10 = r10 + 1
            goto L3f
        L52:
            int r10 = r3.doFinal(r5, r6, r4, r5)
            if (r10 != r4) goto L61
            int r11 = r8 + 1
            int r11 = r11 * r1
            java.lang.System.arraycopy(r5, r1, r0, r11, r1)
            int r8 = r8 + (-1)
            goto L31
        L61:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L67:
            int r7 = r7 + (-1)
            goto L2d
        L6a:
            java.lang.System.arraycopy(r5, r6, r0, r6, r1)
            return r0
        L6e:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Incorrect data size"
            r0.<init>(r1)
            throw r0
    }

    private int wrappingSize(int r3) {
            r2 = this;
            int r0 = r3 + 7
            int r0 = r0 % 8
            int r0 = 7 - r0
            int r1 = r3 + r0
            int r1 = r1 + 8
            return r1
    }

    @Override // com.google.crypto.tink.KeyWrap
    public byte[] unwrap(byte[] r8) throws java.security.GeneralSecurityException {
            r7 = this;
            int r0 = r8.length
            r1 = 16
            int r1 = r7.wrappingSize(r1)
            if (r0 < r1) goto L73
            int r0 = r8.length
            r1 = 4096(0x1000, float:5.74E-42)
            int r1 = r7.wrappingSize(r1)
            if (r0 > r1) goto L6b
            int r0 = r8.length
            r1 = 8
            int r0 = r0 % r1
            if (r0 != 0) goto L63
            byte[] r0 = r7.invertW(r8)
            r2 = 1
            r3 = 0
        L1e:
            r4 = 4
            if (r3 >= r4) goto L2d
            byte[] r4 = com.google.crypto.tink.subtle.Kwp.PREFIX
            r4 = r4[r3]
            r5 = r0[r3]
            if (r4 == r5) goto L2a
            r2 = 0
        L2a:
            int r3 = r3 + 1
            goto L1e
        L2d:
            r3 = 0
            r4 = 4
        L2f:
            if (r4 >= r1) goto L3c
            int r5 = r3 << 8
            r6 = r0[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r3 = r5 + r6
            int r4 = r4 + 1
            goto L2f
        L3c:
            int r4 = r7.wrappingSize(r3)
            int r5 = r0.length
            if (r4 == r5) goto L45
            r2 = 0
            goto L52
        L45:
            int r4 = r3 + 8
        L47:
            int r5 = r0.length
            if (r4 >= r5) goto L52
            r5 = r0[r4]
            if (r5 == 0) goto L4f
            r2 = 0
        L4f:
            int r4 = r4 + 1
            goto L47
        L52:
            if (r2 == 0) goto L5b
            int r4 = r3 + 8
            byte[] r1 = java.util.Arrays.copyOfRange(r0, r1, r4)
            return r1
        L5b:
            javax.crypto.BadPaddingException r1 = new javax.crypto.BadPaddingException
            java.lang.String r4 = "Invalid padding"
            r1.<init>(r4)
            throw r1
        L63:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Wrapped key size must be a multiple of 8 bytes"
            r0.<init>(r1)
            throw r0
        L6b:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Wrapped key size is too large"
            r0.<init>(r1)
            throw r0
        L73:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Wrapped key size is too small"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.KeyWrap
    public byte[] wrap(byte[] r7) throws java.security.GeneralSecurityException {
            r6 = this;
            int r0 = r7.length
            r1 = 16
            if (r0 < r1) goto L37
            int r0 = r7.length
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 > r1) goto L2f
            r0 = 8
            byte[] r1 = new byte[r0]
            byte[] r2 = com.google.crypto.tink.subtle.Kwp.PREFIX
            byte[] r3 = com.google.crypto.tink.subtle.Kwp.PREFIX
            int r3 = r3.length
            r4 = 0
            java.lang.System.arraycopy(r2, r4, r1, r4, r3)
            r2 = 0
        L18:
            r3 = 4
            if (r2 >= r3) goto L2a
            int r3 = r2 + 4
            int r4 = r7.length
            int r5 = 3 - r2
            int r5 = r5 * r0
            int r4 = r4 >> r5
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r1[r3] = r4
            int r2 = r2 + 1
            goto L18
        L2a:
            byte[] r0 = r6.computeW(r1, r7)
            return r0
        L2f:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Key size of key to wrap too large"
            r0.<init>(r1)
            throw r0
        L37:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Key size of key to wrap too small"
            r0.<init>(r1)
            throw r0
    }
}
