package com.google.crypto.tink.signature.internal;

/* JADX INFO: loaded from: classes.dex */
public final class SigUtil {
    static final java.lang.String INVALID_PARAMS = "Invalid ECDSA parameters";

    /* JADX INFO: renamed from: com.google.crypto.tink.signature.internal.SigUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType = null;

        static {
                com.google.crypto.tink.proto.HashType[] r0 = com.google.crypto.tink.proto.HashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType = r0
                r0 = 1
                int[] r1 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L15
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r1 = move-exception
            L16:
                r1 = 2
                int[] r2 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> L22
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r2 = move-exception
            L23:
                r2 = 3
                int[] r3 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.HashType r4 = com.google.crypto.tink.proto.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> L2f
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r3 = move-exception
            L30:
                com.google.crypto.tink.proto.EllipticCurveType[] r3 = com.google.crypto.tink.proto.EllipticCurveType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType = r3
                int[] r3 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType     // Catch: java.lang.NoSuchFieldError -> L44
                com.google.crypto.tink.proto.EllipticCurveType r4 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256     // Catch: java.lang.NoSuchFieldError -> L44
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r3[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L44
                goto L45
            L44:
                r3 = move-exception
            L45:
                int[] r3 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType     // Catch: java.lang.NoSuchFieldError -> L50
                com.google.crypto.tink.proto.EllipticCurveType r4 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P384     // Catch: java.lang.NoSuchFieldError -> L50
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L50
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L50
                goto L51
            L50:
                r3 = move-exception
            L51:
                int[] r3 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType     // Catch: java.lang.NoSuchFieldError -> L5c
                com.google.crypto.tink.proto.EllipticCurveType r4 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P521     // Catch: java.lang.NoSuchFieldError -> L5c
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5c
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L5c
                goto L5d
            L5c:
                r2 = move-exception
            L5d:
                com.google.crypto.tink.proto.EcdsaSignatureEncoding[] r2 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding = r2
                int[] r2 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding     // Catch: java.lang.NoSuchFieldError -> L71
                com.google.crypto.tink.proto.EcdsaSignatureEncoding r3 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER     // Catch: java.lang.NoSuchFieldError -> L71
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L71
                goto L72
            L71:
                r0 = move-exception
            L72:
                int[] r0 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding     // Catch: java.lang.NoSuchFieldError -> L7d
                com.google.crypto.tink.proto.EcdsaSignatureEncoding r2 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363     // Catch: java.lang.NoSuchFieldError -> L7d
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7d
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L7d
                goto L7e
            L7d:
                r0 = move-exception
            L7e:
                return
        }
    }

    private SigUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.subtle.EllipticCurves.CurveType toCurveType(com.google.crypto.tink.proto.EllipticCurveType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2e;
                case 2: goto L2b;
                case 3: goto L28;
                default: goto Lb;
            }
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown curve type: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.name()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L28:
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521
            return r0
        L2b:
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384
            return r0
        L2e:
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256
            return r0
    }

    public static com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding toEcdsaEncoding(com.google.crypto.tink.proto.EcdsaSignatureEncoding r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2b;
                case 2: goto L28;
                default: goto Lb;
            }
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown ECDSA encoding: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.name()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L28:
            com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r0 = com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.IEEE_P1363
            return r0
        L2b:
            com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r0 = com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.DER
            return r0
    }

    public static com.google.crypto.tink.subtle.Enums.HashType toHashType(com.google.crypto.tink.proto.HashType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2e;
                case 2: goto L2b;
                case 3: goto L28;
                default: goto Lb;
            }
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported hash type: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.name()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L28:
            com.google.crypto.tink.subtle.Enums$HashType r0 = com.google.crypto.tink.subtle.Enums.HashType.SHA512
            return r0
        L2b:
            com.google.crypto.tink.subtle.Enums$HashType r0 = com.google.crypto.tink.subtle.Enums.HashType.SHA384
            return r0
        L2e:
            com.google.crypto.tink.subtle.Enums$HashType r0 = com.google.crypto.tink.subtle.Enums.HashType.SHA256
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString toUnsignedIntByteString(java.math.BigInteger r3) {
            byte[] r0 = r3.toByteArray()
            r1 = 0
            r1 = r0[r1]
            if (r1 != 0) goto L11
            int r1 = r0.length
            r2 = 1
            int r1 = r1 - r2
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r0, r2, r1)
            return r1
        L11:
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r0)
            return r1
    }

    public static void validateEcdsaParams(com.google.crypto.tink.proto.EcdsaParams r5) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r0 = r5.getEncoding()
            com.google.crypto.tink.proto.HashType r1 = r5.getHashType()
            com.google.crypto.tink.proto.EllipticCurveType r2 = r5.getCurve()
            int[] r3 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding
            int r4 = r0.ordinal()
            r3 = r3[r4]
            switch(r3) {
                case 1: goto L1f;
                case 2: goto L1f;
                default: goto L17;
            }
        L17:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "unsupported signature encoding"
            r3.<init>(r4)
            throw r3
        L1f:
            int[] r3 = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType
            int r4 = r2.ordinal()
            r3 = r3[r4]
            java.lang.String r4 = "Invalid ECDSA parameters"
            switch(r3) {
                case 1: goto L4d;
                case 2: goto L3e;
                case 3: goto L33;
                default: goto L2d;
            }
        L2d:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r4)
            throw r3
        L33:
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA512
            if (r1 != r3) goto L38
            goto L51
        L38:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r4)
            throw r3
        L3e:
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA384
            if (r1 == r3) goto L51
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA512
            if (r1 != r3) goto L47
            goto L51
        L47:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r4)
            throw r3
        L4d:
            com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA256
            if (r1 != r3) goto L52
        L51:
            return
        L52:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r4)
            throw r3
    }

    public static void validateRsaSsaPkcs1Params(com.google.crypto.tink.proto.RsaSsaPkcs1Params r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.HashType r0 = r1.getHashType()
            com.google.crypto.tink.subtle.Enums$HashType r0 = toHashType(r0)
            return
    }

    public static void validateRsaSsaPssParams(com.google.crypto.tink.proto.RsaSsaPssParams r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.HashType r0 = r3.getSigHash()
            com.google.crypto.tink.subtle.Enums$HashType r0 = toHashType(r0)
            com.google.crypto.tink.proto.HashType r1 = r3.getSigHash()
            com.google.crypto.tink.proto.HashType r2 = r3.getMgf1Hash()
            if (r1 != r2) goto L21
            int r1 = r3.getSaltLength()
            if (r1 < 0) goto L19
            return
        L19:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "salt length is negative"
            r1.<init>(r2)
            throw r1
        L21:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "MGF1 hash is different from signature hash"
            r1.<init>(r2)
            throw r1
    }
}
