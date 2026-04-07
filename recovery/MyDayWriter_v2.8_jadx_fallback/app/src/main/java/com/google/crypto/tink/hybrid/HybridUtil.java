package com.google.crypto.tink.hybrid;

/* JADX INFO: loaded from: classes.dex */
final class HybridUtil {

    /* JADX INFO: renamed from: com.google.crypto.tink.hybrid.HybridUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EcPointFormat = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType = null;

        static {
                com.google.crypto.tink.proto.EcPointFormat[] r0 = com.google.crypto.tink.proto.EcPointFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcPointFormat = r0
                r0 = 1
                int[] r1 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcPointFormat     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.EcPointFormat r2 = com.google.crypto.tink.proto.EcPointFormat.UNCOMPRESSED     // Catch: java.lang.NoSuchFieldError -> L15
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r1 = move-exception
            L16:
                r1 = 2
                int[] r2 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcPointFormat     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.EcPointFormat r3 = com.google.crypto.tink.proto.EcPointFormat.DO_NOT_USE_CRUNCHY_UNCOMPRESSED     // Catch: java.lang.NoSuchFieldError -> L22
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r2 = move-exception
            L23:
                r2 = 3
                int[] r3 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcPointFormat     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.EcPointFormat r4 = com.google.crypto.tink.proto.EcPointFormat.COMPRESSED     // Catch: java.lang.NoSuchFieldError -> L2f
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r3 = move-exception
            L30:
                com.google.crypto.tink.proto.EllipticCurveType[] r3 = com.google.crypto.tink.proto.EllipticCurveType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType = r3
                int[] r3 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType     // Catch: java.lang.NoSuchFieldError -> L44
                com.google.crypto.tink.proto.EllipticCurveType r4 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256     // Catch: java.lang.NoSuchFieldError -> L44
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r3[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L44
                goto L45
            L44:
                r3 = move-exception
            L45:
                int[] r3 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType     // Catch: java.lang.NoSuchFieldError -> L50
                com.google.crypto.tink.proto.EllipticCurveType r4 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P384     // Catch: java.lang.NoSuchFieldError -> L50
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L50
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L50
                goto L51
            L50:
                r3 = move-exception
            L51:
                int[] r3 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType     // Catch: java.lang.NoSuchFieldError -> L5c
                com.google.crypto.tink.proto.EllipticCurveType r4 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P521     // Catch: java.lang.NoSuchFieldError -> L5c
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5c
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L5c
                goto L5d
            L5c:
                r3 = move-exception
            L5d:
                com.google.crypto.tink.proto.HashType[] r3 = com.google.crypto.tink.proto.HashType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType = r3
                int[] r3 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L71
                com.google.crypto.tink.proto.HashType r4 = com.google.crypto.tink.proto.HashType.SHA1     // Catch: java.lang.NoSuchFieldError -> L71
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r3[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L71
                goto L72
            L71:
                r0 = move-exception
            L72:
                int[] r0 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L7d
                com.google.crypto.tink.proto.HashType r3 = com.google.crypto.tink.proto.HashType.SHA224     // Catch: java.lang.NoSuchFieldError -> L7d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7d
                r0[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L7d
                goto L7e
            L7d:
                r0 = move-exception
            L7e:
                int[] r0 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L89
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L89
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L89
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L89
                goto L8a
            L89:
                r0 = move-exception
            L8a:
                int[] r0 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L96
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> L96
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L96
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L96
                goto L97
            L96:
                r0 = move-exception
            L97:
                int[] r0 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> La3
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> La3
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La3
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La3
                goto La4
            La3:
                r0 = move-exception
            La4:
                return
        }
    }

    private HybridUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.subtle.EllipticCurves.CurveType toCurveType(com.google.crypto.tink.proto.EllipticCurveType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2a;
                case 2: goto L27;
                case 3: goto L24;
                default: goto Lb;
            }
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown curve type: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L24:
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521
            return r0
        L27:
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384
            return r0
        L2a:
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256
            return r0
    }

    public static java.lang.String toHmacAlgo(com.google.crypto.tink.proto.HashType r3) throws java.security.NoSuchAlgorithmException {
            int[] r0 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L30;
                case 2: goto L2d;
                case 3: goto L2a;
                case 4: goto L27;
                case 5: goto L24;
                default: goto Lb;
            }
        Lb:
            java.security.NoSuchAlgorithmException r0 = new java.security.NoSuchAlgorithmException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "hash unsupported for HMAC: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L24:
            java.lang.String r0 = "HmacSha512"
            return r0
        L27:
            java.lang.String r0 = "HmacSha384"
            return r0
        L2a:
            java.lang.String r0 = "HmacSha256"
            return r0
        L2d:
            java.lang.String r0 = "HmacSha224"
            return r0
        L30:
            java.lang.String r0 = "HmacSha1"
            return r0
    }

    public static com.google.crypto.tink.subtle.EllipticCurves.PointFormatType toPointFormatType(com.google.crypto.tink.proto.EcPointFormat r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcPointFormat
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2a;
                case 2: goto L27;
                case 3: goto L24;
                default: goto Lb;
            }
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown point format: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L24:
            com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r0 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.COMPRESSED
            return r0
        L27:
            com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r0 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED
            return r0
        L2a:
            com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r0 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED
            return r0
    }

    public static void validate(com.google.crypto.tink.proto.EciesAeadHkdfParams r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.EciesHkdfKemParams r0 = r3.getKemParams()
            com.google.crypto.tink.proto.EllipticCurveType r0 = r0.getCurveType()
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = toCurveType(r0)
            java.security.spec.ECParameterSpec r0 = com.google.crypto.tink.subtle.EllipticCurves.getCurveSpec(r0)
            com.google.crypto.tink.proto.EciesHkdfKemParams r1 = r3.getKemParams()
            com.google.crypto.tink.proto.HashType r1 = r1.getHkdfHashType()
            java.lang.String r0 = toHmacAlgo(r1)
            com.google.crypto.tink.proto.EcPointFormat r1 = r3.getEcPointFormat()
            com.google.crypto.tink.proto.EcPointFormat r2 = com.google.crypto.tink.proto.EcPointFormat.UNKNOWN_FORMAT
            if (r1 == r2) goto L32
            com.google.crypto.tink.proto.EciesAeadDemParams r1 = r3.getDemParams()
            com.google.crypto.tink.proto.KeyTemplate r1 = r1.getAeadDem()
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.Registry.newKeyData(r1)
            return
        L32:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "unknown EC point format"
            r1.<init>(r2)
            throw r1
    }
}
