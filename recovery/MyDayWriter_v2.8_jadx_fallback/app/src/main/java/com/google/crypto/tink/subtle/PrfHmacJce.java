package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class PrfHmacJce implements com.google.crypto.tink.prf.Prf {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    static final int MIN_KEY_SIZE_IN_BYTES = 16;
    private final java.lang.String algorithm;
    private final java.security.Key key;
    private final java.lang.ThreadLocal<javax.crypto.Mac> localMac;
    private final int maxOutputLength;


    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO
            com.google.crypto.tink.subtle.PrfHmacJce.FIPS = r0
            return
    }

    public PrfHmacJce(java.lang.String r4, java.security.Key r5) throws java.security.GeneralSecurityException {
            r3 = this;
            r3.<init>()
            com.google.crypto.tink.subtle.PrfHmacJce$1 r0 = new com.google.crypto.tink.subtle.PrfHmacJce$1
            r0.<init>(r3)
            r3.localMac = r0
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.PrfHmacJce.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L9d
            r3.algorithm = r4
            r3.key = r5
            byte[] r0 = r5.getEncoded()
            int r0 = r0.length
            r1 = 16
            if (r0 < r1) goto L95
            int r0 = r4.hashCode()
            switch(r0) {
                case -1823053428: goto L4f;
                case 392315023: goto L45;
                case 392315118: goto L3b;
                case 392316170: goto L31;
                case 392317873: goto L27;
                default: goto L26;
            }
        L26:
            goto L59
        L27:
            java.lang.String r0 = "HMACSHA512"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L26
            r0 = 4
            goto L5a
        L31:
            java.lang.String r0 = "HMACSHA384"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L26
            r0 = 3
            goto L5a
        L3b:
            java.lang.String r0 = "HMACSHA256"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L26
            r0 = 2
            goto L5a
        L45:
            java.lang.String r0 = "HMACSHA224"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L26
            r0 = 1
            goto L5a
        L4f:
            java.lang.String r0 = "HMACSHA1"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L26
            r0 = 0
            goto L5a
        L59:
            r0 = -1
        L5a:
            switch(r0) {
                case 0: goto L8a;
                case 1: goto L85;
                case 2: goto L80;
                case 3: goto L7b;
                case 4: goto L76;
                default: goto L5d;
            }
        L5d:
            java.security.NoSuchAlgorithmException r0 = new java.security.NoSuchAlgorithmException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown Hmac algorithm: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L76:
            r0 = 64
            r3.maxOutputLength = r0
            goto L8f
        L7b:
            r0 = 48
            r3.maxOutputLength = r0
            goto L8f
        L80:
            r0 = 32
            r3.maxOutputLength = r0
            goto L8f
        L85:
            r0 = 28
            r3.maxOutputLength = r0
            goto L8f
        L8a:
            r0 = 20
            r3.maxOutputLength = r0
        L8f:
            java.lang.ThreadLocal<javax.crypto.Mac> r0 = r3.localMac
            r0.get()
            return
        L95:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r1 = "key size too small, need at least 16 bytes"
            r0.<init>(r1)
            throw r0
        L9d:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r0.<init>(r1)
            throw r0
    }

    static /* synthetic */ java.lang.String access$000(com.google.crypto.tink.subtle.PrfHmacJce r1) {
            java.lang.String r0 = r1.algorithm
            return r0
    }

    static /* synthetic */ java.security.Key access$100(com.google.crypto.tink.subtle.PrfHmacJce r1) {
            java.security.Key r0 = r1.key
            return r0
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] r3, int r4) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r2.maxOutputLength
            if (r4 > r0) goto L20
            java.lang.ThreadLocal<javax.crypto.Mac> r0 = r2.localMac
            java.lang.Object r0 = r0.get()
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0
            r0.update(r3)
            java.lang.ThreadLocal<javax.crypto.Mac> r0 = r2.localMac
            java.lang.Object r0 = r0.get()
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0
            byte[] r0 = r0.doFinal()
            byte[] r0 = java.util.Arrays.copyOf(r0, r4)
            return r0
        L20:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r1 = "tag size too big"
            r0.<init>(r1)
            throw r0
    }

    public int getMaxOutputLength() {
            r1 = this;
            int r0 = r1.maxOutputLength
            return r0
    }
}
