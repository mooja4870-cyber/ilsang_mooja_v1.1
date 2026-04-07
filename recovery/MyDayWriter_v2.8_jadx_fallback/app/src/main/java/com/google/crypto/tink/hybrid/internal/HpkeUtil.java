package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes.dex */
public final class HpkeUtil {
    public static final byte[] AES_128_GCM_AEAD_ID = null;
    public static final byte[] AES_256_GCM_AEAD_ID = null;
    public static final byte[] BASE_MODE = null;
    public static final byte[] CHACHA20_POLY1305_AEAD_ID = null;
    public static final byte[] EMPTY_SALT = null;
    public static final byte[] HKDF_SHA256_KDF_ID = null;
    public static final byte[] HKDF_SHA384_KDF_ID = null;
    public static final byte[] HKDF_SHA512_KDF_ID = null;
    private static final byte[] HPKE = null;
    private static final byte[] HPKE_V1 = null;
    private static final byte[] KEM = null;
    public static final byte[] P256_HKDF_SHA256_KEM_ID = null;
    public static final byte[] P384_HKDF_SHA384_KEM_ID = null;
    public static final byte[] P521_HKDF_SHA512_KEM_ID = null;
    public static final byte[] X25519_HKDF_SHA256_KEM_ID = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.hybrid.internal.HpkeUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HpkeKem = null;

        static {
                com.google.crypto.tink.proto.HpkeKem[] r0 = com.google.crypto.tink.proto.HpkeKem.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.hybrid.internal.HpkeUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem = r0
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P256_HKDF_SHA256     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P384_HKDF_SHA384     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P521_HKDF_SHA512     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                return
        }
    }

    static {
            r0 = 1
            r1 = 0
            byte[] r2 = intToByteArray(r0, r1)
            com.google.crypto.tink.hybrid.internal.HpkeUtil.BASE_MODE = r2
            r2 = 32
            r3 = 2
            byte[] r2 = intToByteArray(r3, r2)
            com.google.crypto.tink.hybrid.internal.HpkeUtil.X25519_HKDF_SHA256_KEM_ID = r2
            r2 = 16
            byte[] r2 = intToByteArray(r3, r2)
            com.google.crypto.tink.hybrid.internal.HpkeUtil.P256_HKDF_SHA256_KEM_ID = r2
            r2 = 17
            byte[] r2 = intToByteArray(r3, r2)
            com.google.crypto.tink.hybrid.internal.HpkeUtil.P384_HKDF_SHA384_KEM_ID = r2
            r2 = 18
            byte[] r2 = intToByteArray(r3, r2)
            com.google.crypto.tink.hybrid.internal.HpkeUtil.P521_HKDF_SHA512_KEM_ID = r2
            byte[] r2 = intToByteArray(r3, r0)
            com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA256_KDF_ID = r2
            byte[] r2 = intToByteArray(r3, r3)
            com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA384_KDF_ID = r2
            r2 = 3
            byte[] r4 = intToByteArray(r3, r2)
            com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA512_KDF_ID = r4
            byte[] r0 = intToByteArray(r3, r0)
            com.google.crypto.tink.hybrid.internal.HpkeUtil.AES_128_GCM_AEAD_ID = r0
            byte[] r0 = intToByteArray(r3, r3)
            com.google.crypto.tink.hybrid.internal.HpkeUtil.AES_256_GCM_AEAD_ID = r0
            byte[] r0 = intToByteArray(r3, r2)
            com.google.crypto.tink.hybrid.internal.HpkeUtil.CHACHA20_POLY1305_AEAD_ID = r0
            byte[] r0 = new byte[r1]
            com.google.crypto.tink.hybrid.internal.HpkeUtil.EMPTY_SALT = r0
            java.lang.String r0 = "KEM"
            java.nio.charset.Charset r1 = com.google.crypto.tink.internal.Util.UTF_8
            byte[] r0 = r0.getBytes(r1)
            com.google.crypto.tink.hybrid.internal.HpkeUtil.KEM = r0
            java.lang.String r0 = "HPKE"
            java.nio.charset.Charset r1 = com.google.crypto.tink.internal.Util.UTF_8
            byte[] r0 = r0.getBytes(r1)
            com.google.crypto.tink.hybrid.internal.HpkeUtil.HPKE = r0
            java.lang.String r0 = "HPKE-v1"
            java.nio.charset.Charset r1 = com.google.crypto.tink.internal.Util.UTF_8
            byte[] r0 = r0.getBytes(r1)
            com.google.crypto.tink.hybrid.internal.HpkeUtil.HPKE_V1 = r0
            return
    }

    private HpkeUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static byte[] hpkeSuiteId(byte[] r1, byte[] r2, byte[] r3) throws java.security.GeneralSecurityException {
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.HPKE
            byte[][] r0 = new byte[][]{r0, r1, r2, r3}
            byte[] r0 = com.google.crypto.tink.subtle.Bytes.concat(r0)
            return r0
    }

    public static byte[] intToByteArray(int r3, int r4) {
            byte[] r0 = new byte[r3]
            r1 = 0
        L3:
            if (r1 >= r3) goto L15
            int r2 = r3 - r1
            int r2 = r2 + (-1)
            int r2 = r2 * 8
            int r2 = r4 >> r2
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L3
        L15:
            return r0
    }

    static byte[] kemSuiteId(byte[] r1) throws java.security.GeneralSecurityException {
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.KEM
            byte[][] r0 = new byte[][]{r0, r1}
            byte[] r0 = com.google.crypto.tink.subtle.Bytes.concat(r0)
            return r0
    }

    static byte[] labelIkm(java.lang.String r2, byte[] r3, byte[] r4) throws java.security.GeneralSecurityException {
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.HPKE_V1
            java.nio.charset.Charset r1 = com.google.crypto.tink.internal.Util.UTF_8
            byte[] r1 = r2.getBytes(r1)
            byte[][] r0 = new byte[][]{r0, r4, r1, r3}
            byte[] r0 = com.google.crypto.tink.subtle.Bytes.concat(r0)
            return r0
    }

    static byte[] labelInfo(java.lang.String r3, byte[] r4, byte[] r5, int r6) throws java.security.GeneralSecurityException {
            r0 = 2
            byte[] r0 = intToByteArray(r0, r6)
            byte[] r1 = com.google.crypto.tink.hybrid.internal.HpkeUtil.HPKE_V1
            java.nio.charset.Charset r2 = com.google.crypto.tink.internal.Util.UTF_8
            byte[] r2 = r3.getBytes(r2)
            byte[][] r0 = new byte[][]{r0, r1, r5, r2, r4}
            byte[] r0 = com.google.crypto.tink.subtle.Bytes.concat(r0)
            return r0
    }

    static com.google.crypto.tink.subtle.EllipticCurves.CurveType nistHpkeKemToCurve(com.google.crypto.tink.proto.HpkeKem r2) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L19;
                case 2: goto L16;
                case 3: goto L13;
                default: goto Lb;
            }
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Unrecognized NIST HPKE KEM identifier"
            r0.<init>(r1)
            throw r0
        L13:
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521
            return r0
        L16:
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384
            return r0
        L19:
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256
            return r0
    }

    static void validateParams(com.google.crypto.tink.proto.HpkeParams r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.HpkeKem r0 = r3.getKem()
            com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.KEM_UNKNOWN
            if (r0 == r1) goto L73
            com.google.crypto.tink.proto.HpkeKem r0 = r3.getKem()
            com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.UNRECOGNIZED
            if (r0 == r1) goto L73
            com.google.crypto.tink.proto.HpkeKdf r0 = r3.getKdf()
            com.google.crypto.tink.proto.HpkeKdf r1 = com.google.crypto.tink.proto.HpkeKdf.KDF_UNKNOWN
            if (r0 == r1) goto L52
            com.google.crypto.tink.proto.HpkeKdf r0 = r3.getKdf()
            com.google.crypto.tink.proto.HpkeKdf r1 = com.google.crypto.tink.proto.HpkeKdf.UNRECOGNIZED
            if (r0 == r1) goto L52
            com.google.crypto.tink.proto.HpkeAead r0 = r3.getAead()
            com.google.crypto.tink.proto.HpkeAead r1 = com.google.crypto.tink.proto.HpkeAead.AEAD_UNKNOWN
            if (r0 == r1) goto L31
            com.google.crypto.tink.proto.HpkeAead r0 = r3.getAead()
            com.google.crypto.tink.proto.HpkeAead r1 = com.google.crypto.tink.proto.HpkeAead.UNRECOGNIZED
            if (r0 == r1) goto L31
            return
        L31:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid AEAD param: "
            java.lang.StringBuilder r1 = r1.append(r2)
            com.google.crypto.tink.proto.HpkeAead r2 = r3.getAead()
            java.lang.String r2 = r2.name()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L52:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid KDF param: "
            java.lang.StringBuilder r1 = r1.append(r2)
            com.google.crypto.tink.proto.HpkeKdf r2 = r3.getKdf()
            java.lang.String r2 = r2.name()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L73:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid KEM param: "
            java.lang.StringBuilder r1 = r1.append(r2)
            com.google.crypto.tink.proto.HpkeKem r2 = r3.getKem()
            java.lang.String r2 = r2.name()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
