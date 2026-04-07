package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class EllipticCurves {

    /* JADX INFO: renamed from: com.google.crypto.tink.subtle.EllipticCurves$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType = null;

        static {
                com.google.crypto.tink.subtle.EllipticCurves$CurveType[] r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType = r0
                r0 = 1
                int[] r1 = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r2 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256     // Catch: java.lang.NoSuchFieldError -> L15
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r1 = move-exception
            L16:
                r1 = 2
                int[] r2 = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r3 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384     // Catch: java.lang.NoSuchFieldError -> L22
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r2 = move-exception
            L23:
                r2 = 3
                int[] r3 = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r4 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521     // Catch: java.lang.NoSuchFieldError -> L2f
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r3 = move-exception
            L30:
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType[] r3 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType = r3
                int[] r3 = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType     // Catch: java.lang.NoSuchFieldError -> L44
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r4 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED     // Catch: java.lang.NoSuchFieldError -> L44
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r3[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L44
                goto L45
            L44:
                r0 = move-exception
            L45:
                int[] r0 = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType     // Catch: java.lang.NoSuchFieldError -> L50
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r3 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED     // Catch: java.lang.NoSuchFieldError -> L50
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L50
                r0[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L50
                goto L51
            L50:
                r0 = move-exception
            L51:
                int[] r0 = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType     // Catch: java.lang.NoSuchFieldError -> L5c
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r1 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.COMPRESSED     // Catch: java.lang.NoSuchFieldError -> L5c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5c
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5c
                goto L5d
            L5c:
                r0 = move-exception
            L5d:
                return
        }
    }

    public enum CurveType extends java.lang.Enum<com.google.crypto.tink.subtle.EllipticCurves.CurveType> {
        private static final /* synthetic */ com.google.crypto.tink.subtle.EllipticCurves.CurveType[] $VALUES = null;
        public static final com.google.crypto.tink.subtle.EllipticCurves.CurveType NIST_P256 = null;
        public static final com.google.crypto.tink.subtle.EllipticCurves.CurveType NIST_P384 = null;
        public static final com.google.crypto.tink.subtle.EllipticCurves.CurveType NIST_P521 = null;

        static {
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = new com.google.crypto.tink.subtle.EllipticCurves$CurveType
                java.lang.String r1 = "NIST_P256"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256 = r0
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = new com.google.crypto.tink.subtle.EllipticCurves$CurveType
                java.lang.String r1 = "NIST_P384"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384 = r0
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = new com.google.crypto.tink.subtle.EllipticCurves$CurveType
                java.lang.String r1 = "NIST_P521"
                r2 = 2
                r0.<init>(r1, r2)
                com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521 = r0
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r1 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r2 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521
                com.google.crypto.tink.subtle.EllipticCurves$CurveType[] r0 = new com.google.crypto.tink.subtle.EllipticCurves.CurveType[]{r0, r1, r2}
                com.google.crypto.tink.subtle.EllipticCurves.CurveType.$VALUES = r0
                return
        }

        CurveType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.crypto.tink.subtle.EllipticCurves.CurveType valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.subtle.EllipticCurves$CurveType> r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = (com.google.crypto.tink.subtle.EllipticCurves.CurveType) r0
                return r0
        }

        public static com.google.crypto.tink.subtle.EllipticCurves.CurveType[] values() {
                com.google.crypto.tink.subtle.EllipticCurves$CurveType[] r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.subtle.EllipticCurves$CurveType[] r0 = (com.google.crypto.tink.subtle.EllipticCurves.CurveType[]) r0
                return r0
        }
    }

    public enum EcdsaEncoding extends java.lang.Enum<com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding> {
        private static final /* synthetic */ com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding[] $VALUES = null;
        public static final com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding DER = null;
        public static final com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding IEEE_P1363 = null;

        static {
                com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r0 = new com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding
                java.lang.String r1 = "IEEE_P1363"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.IEEE_P1363 = r0
                com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r0 = new com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding
                java.lang.String r1 = "DER"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.DER = r0
                com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r0 = com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.IEEE_P1363
                com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r1 = com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.DER
                com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding[] r0 = new com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding[]{r0, r1}
                com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.$VALUES = r0
                return
        }

        EcdsaEncoding(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding> r0 = com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding r0 = (com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding) r0
                return r0
        }

        public static com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding[] values() {
                com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding[] r0 = com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.subtle.EllipticCurves$EcdsaEncoding[] r0 = (com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding[]) r0
                return r0
        }
    }

    public enum PointFormatType extends java.lang.Enum<com.google.crypto.tink.subtle.EllipticCurves.PointFormatType> {
        private static final /* synthetic */ com.google.crypto.tink.subtle.EllipticCurves.PointFormatType[] $VALUES = null;
        public static final com.google.crypto.tink.subtle.EllipticCurves.PointFormatType COMPRESSED = null;
        public static final com.google.crypto.tink.subtle.EllipticCurves.PointFormatType DO_NOT_USE_CRUNCHY_UNCOMPRESSED = null;
        public static final com.google.crypto.tink.subtle.EllipticCurves.PointFormatType UNCOMPRESSED = null;

        static {
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r0 = new com.google.crypto.tink.subtle.EllipticCurves$PointFormatType
                java.lang.String r1 = "UNCOMPRESSED"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED = r0
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r0 = new com.google.crypto.tink.subtle.EllipticCurves$PointFormatType
                java.lang.String r1 = "COMPRESSED"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.COMPRESSED = r0
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r0 = new com.google.crypto.tink.subtle.EllipticCurves$PointFormatType
                java.lang.String r1 = "DO_NOT_USE_CRUNCHY_UNCOMPRESSED"
                r2 = 2
                r0.<init>(r1, r2)
                com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED = r0
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r0 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r1 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.COMPRESSED
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r2 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType[] r0 = new com.google.crypto.tink.subtle.EllipticCurves.PointFormatType[]{r0, r1, r2}
                com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.$VALUES = r0
                return
        }

        PointFormatType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.crypto.tink.subtle.EllipticCurves.PointFormatType valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.subtle.EllipticCurves$PointFormatType> r0 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r0 = (com.google.crypto.tink.subtle.EllipticCurves.PointFormatType) r0
                return r0
        }

        public static com.google.crypto.tink.subtle.EllipticCurves.PointFormatType[] values() {
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType[] r0 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.subtle.EllipticCurves$PointFormatType[] r0 = (com.google.crypto.tink.subtle.EllipticCurves.PointFormatType[]) r0
                return r0
        }
    }

    private EllipticCurves() {
            r0 = this;
            r0.<init>()
            return
    }

    static void checkPublicKey(java.security.interfaces.ECPublicKey r2) throws java.security.GeneralSecurityException {
            java.security.spec.ECPoint r0 = r2.getW()
            java.security.spec.ECParameterSpec r1 = r2.getParams()
            java.security.spec.EllipticCurve r1 = r1.getCurve()
            com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(r0, r1)
            return
    }

    public static byte[] computeSharedSecret(java.security.interfaces.ECPrivateKey r1, java.security.interfaces.ECPublicKey r2) throws java.security.GeneralSecurityException {
            validatePublicKeySpec(r2, r1)
            java.security.spec.ECPoint r0 = r2.getW()
            byte[] r0 = computeSharedSecret(r1, r0)
            return r0
    }

    public static byte[] computeSharedSecret(java.security.interfaces.ECPrivateKey r7, java.security.spec.ECPoint r8) throws java.security.GeneralSecurityException {
            java.security.spec.ECParameterSpec r0 = r7.getParams()
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(r8, r0)
            java.security.spec.ECParameterSpec r0 = r7.getParams()
            java.security.spec.ECPublicKeySpec r1 = new java.security.spec.ECPublicKeySpec
            r1.<init>(r8, r0)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r2 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r3 = "EC"
            java.lang.Object r2 = r2.getInstance(r3)
            java.security.KeyFactory r2 = (java.security.KeyFactory) r2
            java.security.PublicKey r3 = r2.generatePublic(r1)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyAgreement, javax.crypto.KeyAgreement> r4 = com.google.crypto.tink.subtle.EngineFactory.KEY_AGREEMENT
            java.lang.String r5 = "ECDH"
            java.lang.Object r4 = r4.getInstance(r5)
            javax.crypto.KeyAgreement r4 = (javax.crypto.KeyAgreement) r4
            r4.init(r7)
            r5 = 1
            r4.doPhase(r3, r5)     // Catch: java.lang.IllegalStateException -> L3b
            byte[] r5 = r4.generateSecret()     // Catch: java.lang.IllegalStateException -> L3b
            validateSharedSecret(r5, r7)     // Catch: java.lang.IllegalStateException -> L3b
            return r5
        L3b:
            r5 = move-exception
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            r6.<init>(r5)
            throw r6
    }

    public static java.security.spec.ECPoint ecPointDecode(java.security.spec.EllipticCurve r1, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r2, byte[] r3) throws java.security.GeneralSecurityException {
            java.security.spec.ECPoint r0 = pointDecode(r1, r2, r3)
            return r0
    }

    public static byte[] ecdsaDer2Ieee(byte[] r9, int r10) throws java.security.GeneralSecurityException {
            boolean r0 = isValidDerEncoding(r9)
            if (r0 == 0) goto L42
            byte[] r0 = new byte[r10]
            r1 = 1
            r2 = r9[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 2
            r4 = 128(0x80, float:1.8E-43)
            if (r2 < r4) goto L14
            int r3 = r3 + 1
        L14:
            int r3 = r3 + r1
            int r1 = r3 + 1
            r3 = r9[r3]
            r4 = 0
            r5 = r9[r1]
            if (r5 != 0) goto L1f
            r4 = 1
        L1f:
            int r5 = r1 + r4
            int r6 = r10 / 2
            int r6 = r6 - r3
            int r6 = r6 + r4
            int r7 = r3 - r4
            java.lang.System.arraycopy(r9, r5, r0, r6, r7)
            int r5 = r3 + 1
            int r1 = r1 + r5
            int r5 = r1 + 1
            r1 = r9[r1]
            r4 = 0
            r6 = r9[r5]
            if (r6 != 0) goto L37
            r4 = 1
        L37:
            int r6 = r5 + r4
            int r7 = r10 - r1
            int r7 = r7 + r4
            int r8 = r1 - r4
            java.lang.System.arraycopy(r9, r6, r0, r7, r8)
            return r0
        L42:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Invalid DER encoding"
            r0.<init>(r1)
            throw r0
    }

    public static byte[] ecdsaIeee2Der(byte[] r8) throws java.security.GeneralSecurityException {
            int r0 = r8.length
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L72
            int r0 = r8.length
            if (r0 == 0) goto L72
            int r0 = r8.length
            r2 = 132(0x84, float:1.85E-43)
            if (r0 > r2) goto L72
            int r0 = r8.length
            int r0 = r0 / r1
            byte[] r0 = java.util.Arrays.copyOf(r8, r0)
            byte[] r0 = toMinimalSignedNumber(r0)
            int r2 = r8.length
            int r2 = r2 / r1
            int r3 = r8.length
            byte[] r2 = java.util.Arrays.copyOfRange(r8, r2, r3)
            byte[] r2 = toMinimalSignedNumber(r2)
            r3 = 0
            int r4 = r0.length
            int r4 = r4 + r1
            int r4 = r4 + 1
            int r4 = r4 + 1
            int r5 = r2.length
            int r4 = r4 + r5
            r5 = 128(0x80, float:1.8E-43)
            r6 = 48
            if (r4 < r5) goto L45
            int r5 = r4 + 3
            byte[] r5 = new byte[r5]
            int r7 = r3 + 1
            r5[r3] = r6
            int r3 = r7 + 1
            r6 = -127(0xffffffffffffff81, float:NaN)
            r5[r7] = r6
            int r6 = r3 + 1
            byte r7 = (byte) r4
            r5[r3] = r7
            goto L52
        L45:
            int r5 = r4 + 2
            byte[] r5 = new byte[r5]
            int r7 = r3 + 1
            r5[r3] = r6
            int r6 = r7 + 1
            byte r3 = (byte) r4
            r5[r7] = r3
        L52:
            int r3 = r6 + 1
            r5[r6] = r1
            int r6 = r3 + 1
            int r7 = r0.length
            byte r7 = (byte) r7
            r5[r3] = r7
            int r3 = r0.length
            r7 = 0
            java.lang.System.arraycopy(r0, r7, r5, r6, r3)
            int r3 = r0.length
            int r6 = r6 + r3
            int r3 = r6 + 1
            r5[r6] = r1
            int r1 = r3 + 1
            int r6 = r2.length
            byte r6 = (byte) r6
            r5[r3] = r6
            int r3 = r2.length
            java.lang.System.arraycopy(r2, r7, r5, r1, r3)
            return r5
        L72:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Invalid IEEE_P1363 encoding"
            r0.<init>(r1)
            throw r0
    }

    public static int encodingSizeInBytes(java.security.spec.EllipticCurve r3, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r4) throws java.security.GeneralSecurityException {
            int r0 = fieldSizeInBytes(r3)
            int[] r1 = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType
            int r2 = r4.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 1: goto L1d;
                case 2: goto L1a;
                case 3: goto L17;
                default: goto Lf;
            }
        Lf:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "unknown EC point format"
            r1.<init>(r2)
            throw r1
        L17:
            int r1 = r0 + 1
            return r1
        L1a:
            int r1 = r0 * 2
            return r1
        L1d:
            int r1 = r0 * 2
            int r1 = r1 + 1
            return r1
    }

    public static int fieldSizeInBits(java.security.spec.EllipticCurve r2) throws java.security.GeneralSecurityException {
            java.math.BigInteger r0 = getModulus(r2)
            java.math.BigInteger r1 = java.math.BigInteger.ONE
            java.math.BigInteger r0 = r0.subtract(r1)
            int r0 = r0.bitLength()
            return r0
    }

    public static int fieldSizeInBytes(java.security.spec.EllipticCurve r1) throws java.security.GeneralSecurityException {
            int r0 = fieldSizeInBits(r1)
            int r0 = r0 + 7
            int r0 = r0 / 8
            return r0
    }

    public static java.security.KeyPair generateKeyPair(com.google.crypto.tink.subtle.EllipticCurves.CurveType r1) throws java.security.GeneralSecurityException {
            java.security.spec.ECParameterSpec r0 = getCurveSpec(r1)
            java.security.KeyPair r0 = generateKeyPair(r0)
            return r0
    }

    public static java.security.KeyPair generateKeyPair(java.security.spec.ECParameterSpec r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyPairGenerator, java.security.KeyPairGenerator> r0 = com.google.crypto.tink.subtle.EngineFactory.KEY_PAIR_GENERATOR
            java.lang.String r1 = "EC"
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.KeyPairGenerator r0 = (java.security.KeyPairGenerator) r0
            r0.initialize(r2)
            java.security.KeyPair r1 = r0.generateKeyPair()
            return r1
    }

    public static java.security.spec.ECParameterSpec getCurveSpec(com.google.crypto.tink.subtle.EllipticCurves.CurveType r3) throws java.security.NoSuchAlgorithmException {
            int[] r0 = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2e;
                case 2: goto L29;
                case 3: goto L24;
                default: goto Lb;
            }
        Lb:
            java.security.NoSuchAlgorithmException r0 = new java.security.NoSuchAlgorithmException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "curve not implemented:"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L24:
            java.security.spec.ECParameterSpec r0 = getNistP521Params()
            return r0
        L29:
            java.security.spec.ECParameterSpec r0 = getNistP384Params()
            return r0
        L2e:
            java.security.spec.ECParameterSpec r0 = getNistP256Params()
            return r0
    }

    public static java.security.interfaces.ECPrivateKey getEcPrivateKey(com.google.crypto.tink.subtle.EllipticCurves.CurveType r5, byte[] r6) throws java.security.GeneralSecurityException {
            java.security.spec.ECParameterSpec r0 = getCurveSpec(r5)
            java.math.BigInteger r1 = com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(r6)
            java.security.spec.ECPrivateKeySpec r2 = new java.security.spec.ECPrivateKeySpec
            r2.<init>(r1, r0)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r3 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r4 = "EC"
            java.lang.Object r3 = r3.getInstance(r4)
            java.security.KeyFactory r3 = (java.security.KeyFactory) r3
            java.security.PrivateKey r4 = r3.generatePrivate(r2)
            java.security.interfaces.ECPrivateKey r4 = (java.security.interfaces.ECPrivateKey) r4
            return r4
    }

    public static java.security.interfaces.ECPrivateKey getEcPrivateKey(byte[] r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r0 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r1 = "EC"
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.KeyFactory r0 = (java.security.KeyFactory) r0
            java.security.spec.PKCS8EncodedKeySpec r1 = new java.security.spec.PKCS8EncodedKeySpec
            r1.<init>(r2)
            java.security.PrivateKey r1 = r0.generatePrivate(r1)
            java.security.interfaces.ECPrivateKey r1 = (java.security.interfaces.ECPrivateKey) r1
            return r1
    }

    public static java.security.interfaces.ECPublicKey getEcPublicKey(com.google.crypto.tink.subtle.EllipticCurves.CurveType r1, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r2, byte[] r3) throws java.security.GeneralSecurityException {
            java.security.spec.ECParameterSpec r0 = getCurveSpec(r1)
            java.security.interfaces.ECPublicKey r0 = getEcPublicKey(r0, r2, r3)
            return r0
    }

    public static java.security.interfaces.ECPublicKey getEcPublicKey(com.google.crypto.tink.subtle.EllipticCurves.CurveType r7, byte[] r8, byte[] r9) throws java.security.GeneralSecurityException {
            java.security.spec.ECParameterSpec r0 = getCurveSpec(r7)
            java.math.BigInteger r1 = new java.math.BigInteger
            r2 = 1
            r1.<init>(r2, r8)
            java.math.BigInteger r3 = new java.math.BigInteger
            r3.<init>(r2, r9)
            java.security.spec.ECPoint r2 = new java.security.spec.ECPoint
            r2.<init>(r1, r3)
            java.security.spec.EllipticCurve r4 = r0.getCurve()
            com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(r2, r4)
            java.security.spec.ECPublicKeySpec r4 = new java.security.spec.ECPublicKeySpec
            r4.<init>(r2, r0)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r5 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r6 = "EC"
            java.lang.Object r5 = r5.getInstance(r6)
            java.security.KeyFactory r5 = (java.security.KeyFactory) r5
            java.security.PublicKey r6 = r5.generatePublic(r4)
            java.security.interfaces.ECPublicKey r6 = (java.security.interfaces.ECPublicKey) r6
            return r6
    }

    public static java.security.interfaces.ECPublicKey getEcPublicKey(java.security.spec.ECParameterSpec r4, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r5, byte[] r6) throws java.security.GeneralSecurityException {
            java.security.spec.EllipticCurve r0 = r4.getCurve()
            java.security.spec.ECPoint r0 = pointDecode(r0, r5, r6)
            java.security.spec.ECPublicKeySpec r1 = new java.security.spec.ECPublicKeySpec
            r1.<init>(r0, r4)
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r2 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r3 = "EC"
            java.lang.Object r2 = r2.getInstance(r3)
            java.security.KeyFactory r2 = (java.security.KeyFactory) r2
            java.security.PublicKey r3 = r2.generatePublic(r1)
            java.security.interfaces.ECPublicKey r3 = (java.security.interfaces.ECPublicKey) r3
            return r3
    }

    public static java.security.interfaces.ECPublicKey getEcPublicKey(byte[] r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TKeyFactory, java.security.KeyFactory> r0 = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY
            java.lang.String r1 = "EC"
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.KeyFactory r0 = (java.security.KeyFactory) r0
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec
            r1.<init>(r2)
            java.security.PublicKey r1 = r0.generatePublic(r1)
            java.security.interfaces.ECPublicKey r1 = (java.security.interfaces.ECPublicKey) r1
            return r1
    }

    public static java.math.BigInteger getModulus(java.security.spec.EllipticCurve r1) throws java.security.GeneralSecurityException {
            java.math.BigInteger r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.getModulus(r1)
            return r0
    }

    public static java.security.spec.ECParameterSpec getNistP256Params() {
            java.security.spec.ECParameterSpec r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P256_PARAMS
            return r0
    }

    public static java.security.spec.ECParameterSpec getNistP384Params() {
            java.security.spec.ECParameterSpec r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P384_PARAMS
            return r0
    }

    public static java.security.spec.ECParameterSpec getNistP521Params() {
            java.security.spec.ECParameterSpec r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P521_PARAMS
            return r0
    }

    public static java.math.BigInteger getY(java.math.BigInteger r6, boolean r7, java.security.spec.EllipticCurve r8) throws java.security.GeneralSecurityException {
            java.math.BigInteger r0 = getModulus(r8)
            java.math.BigInteger r1 = r8.getA()
            java.math.BigInteger r2 = r8.getB()
            java.math.BigInteger r3 = r6.multiply(r6)
            java.math.BigInteger r3 = r3.add(r1)
            java.math.BigInteger r3 = r3.multiply(r6)
            java.math.BigInteger r3 = r3.add(r2)
            java.math.BigInteger r3 = r3.mod(r0)
            java.math.BigInteger r4 = modSqrt(r3, r0)
            r5 = 0
            boolean r5 = r4.testBit(r5)
            if (r7 == r5) goto L33
            java.math.BigInteger r5 = r0.subtract(r4)
            java.math.BigInteger r4 = r5.mod(r0)
        L33:
            return r4
    }

    public static boolean isNistEcParameterSpec(java.security.spec.ECParameterSpec r1) {
            boolean r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.isNistEcParameterSpec(r1)
            return r0
    }

    public static boolean isSameEcParameterSpec(java.security.spec.ECParameterSpec r1, java.security.spec.ECParameterSpec r2) {
            boolean r0 = com.google.crypto.tink.internal.EllipticCurvesUtil.isSameEcParameterSpec(r1, r2)
            return r0
    }

    public static boolean isValidDerEncoding(byte[] r9) {
            int r0 = r9.length
            r1 = 8
            r2 = 0
            if (r0 >= r1) goto L7
            return r2
        L7:
            r0 = r9[r2]
            r1 = 48
            if (r0 == r1) goto Le
            return r2
        Le:
            r0 = 1
            r1 = r9[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 1
            r4 = 129(0x81, float:1.81E-43)
            r5 = 2
            r6 = 128(0x80, float:1.8E-43)
            if (r1 != r4) goto L23
            r3 = 2
            r4 = r9[r5]
            r1 = r4 & 255(0xff, float:3.57E-43)
            if (r1 >= r6) goto L29
            return r2
        L23:
            if (r1 == r6) goto La3
            if (r1 <= r4) goto L29
            goto La3
        L29:
            int r4 = r9.length
            int r4 = r4 - r0
            int r4 = r4 - r3
            if (r1 == r4) goto L2f
            return r2
        L2f:
            int r4 = r3 + 1
            r4 = r9[r4]
            if (r4 == r5) goto L36
            return r2
        L36:
            int r4 = r3 + 1
            int r4 = r4 + r0
            r4 = r9[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r7 = r3 + 1
            int r7 = r7 + r0
            int r7 = r7 + r0
            int r7 = r7 + r4
            int r7 = r7 + r0
            int r8 = r9.length
            if (r7 < r8) goto L47
            return r2
        L47:
            if (r4 != 0) goto L4a
            return r2
        L4a:
            int r7 = r3 + 3
            r7 = r9[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r7 < r6) goto L53
            return r2
        L53:
            if (r4 <= r0) goto L64
            int r7 = r3 + 3
            r7 = r9[r7]
            if (r7 != 0) goto L64
            int r7 = r3 + 4
            r7 = r9[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r7 >= r6) goto L64
            return r2
        L64:
            int r7 = r3 + 3
            int r7 = r7 + r4
            r7 = r9[r7]
            if (r7 == r5) goto L6c
            return r2
        L6c:
            int r5 = r3 + 1
            int r5 = r5 + r0
            int r5 = r5 + r0
            int r5 = r5 + r4
            int r5 = r5 + r0
            r5 = r9[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r7 = r3 + 1
            int r7 = r7 + r0
            int r7 = r7 + r0
            int r7 = r7 + r4
            int r7 = r7 + r0
            int r7 = r7 + r0
            int r7 = r7 + r5
            int r8 = r9.length
            if (r7 == r8) goto L82
            return r2
        L82:
            if (r5 != 0) goto L85
            return r2
        L85:
            int r7 = r3 + 5
            int r7 = r7 + r4
            r7 = r9[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r7 < r6) goto L8f
            return r2
        L8f:
            if (r5 <= r0) goto La2
            int r7 = r3 + 5
            int r7 = r7 + r4
            r7 = r9[r7]
            if (r7 != 0) goto La2
            int r7 = r3 + 6
            int r7 = r7 + r4
            r7 = r9[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r7 >= r6) goto La2
            return r2
        La2:
            return r0
        La3:
            return r2
    }

    protected static java.math.BigInteger modSqrt(java.math.BigInteger r12, java.math.BigInteger r13) throws java.security.GeneralSecurityException {
            int r0 = r13.signum()
            r1 = 1
            if (r0 != r1) goto L11c
            java.math.BigInteger r12 = r12.mod(r13)
            r0 = 0
            java.math.BigInteger r2 = java.math.BigInteger.ZERO
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L17
            java.math.BigInteger r1 = java.math.BigInteger.ZERO
            return r1
        L17:
            r2 = 0
            boolean r3 = r13.testBit(r2)
            r4 = 2
            if (r3 == 0) goto L35
            boolean r3 = r13.testBit(r1)
            if (r3 == 0) goto L35
            java.math.BigInteger r1 = java.math.BigInteger.ONE
            java.math.BigInteger r1 = r13.add(r1)
            java.math.BigInteger r1 = r1.shiftRight(r4)
            java.math.BigInteger r0 = r12.modPow(r1, r13)
        L33:
            goto L102
        L35:
            boolean r2 = r13.testBit(r2)
            if (r2 == 0) goto L33
            boolean r2 = r13.testBit(r1)
            if (r2 != 0) goto L33
            java.math.BigInteger r2 = java.math.BigInteger.ONE
            r3 = 0
            java.math.BigInteger r5 = java.math.BigInteger.ONE
            java.math.BigInteger r5 = r13.subtract(r5)
            java.math.BigInteger r5 = r5.shiftRight(r1)
            r6 = 0
        L4f:
            java.math.BigInteger r7 = r2.multiply(r2)
            java.math.BigInteger r7 = r7.subtract(r12)
            java.math.BigInteger r3 = r7.mod(r13)
            java.math.BigInteger r7 = java.math.BigInteger.ZERO
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L64
            return r2
        L64:
            java.math.BigInteger r7 = r3.modPow(r5, r13)
            java.math.BigInteger r8 = java.math.BigInteger.ONE
            java.math.BigInteger r8 = r7.add(r8)
            boolean r8 = r8.equals(r13)
            if (r8 == 0) goto Ld5
        L75:
            java.math.BigInteger r7 = java.math.BigInteger.ONE
            java.math.BigInteger r7 = r13.add(r7)
            java.math.BigInteger r1 = r7.shiftRight(r1)
            r7 = r2
            java.math.BigInteger r8 = java.math.BigInteger.ONE
            int r9 = r1.bitLength()
            int r9 = r9 - r4
        L87:
            if (r9 < 0) goto Ld3
            java.math.BigInteger r4 = r7.multiply(r8)
            java.math.BigInteger r10 = r7.multiply(r7)
            java.math.BigInteger r11 = r8.multiply(r8)
            java.math.BigInteger r11 = r11.mod(r13)
            java.math.BigInteger r11 = r11.multiply(r3)
            java.math.BigInteger r10 = r10.add(r11)
            java.math.BigInteger r7 = r10.mod(r13)
            java.math.BigInteger r10 = r4.add(r4)
            java.math.BigInteger r8 = r10.mod(r13)
            boolean r10 = r1.testBit(r9)
            if (r10 == 0) goto Ld0
            java.math.BigInteger r10 = r7.multiply(r2)
            java.math.BigInteger r11 = r8.multiply(r3)
            java.math.BigInteger r10 = r10.add(r11)
            java.math.BigInteger r4 = r10.mod(r13)
            java.math.BigInteger r10 = r2.multiply(r8)
            java.math.BigInteger r10 = r10.add(r7)
            java.math.BigInteger r8 = r10.mod(r13)
            r7 = r4
        Ld0:
            int r9 = r9 + (-1)
            goto L87
        Ld3:
            r0 = r7
            goto L102
        Ld5:
            java.math.BigInteger r8 = java.math.BigInteger.ONE
            boolean r8 = r7.equals(r8)
            java.lang.String r9 = "p is not prime"
            if (r8 == 0) goto Lfc
            java.math.BigInteger r8 = java.math.BigInteger.ONE
            java.math.BigInteger r2 = r2.add(r8)
            int r6 = r6 + 1
            r8 = 128(0x80, float:1.8E-43)
            if (r6 != r8) goto Lfa
            r8 = 80
            boolean r8 = r13.isProbablePrime(r8)
            if (r8 == 0) goto Lf4
            goto Lfa
        Lf4:
            java.security.InvalidAlgorithmParameterException r1 = new java.security.InvalidAlgorithmParameterException
            r1.<init>(r9)
            throw r1
        Lfa:
            goto L4f
        Lfc:
            java.security.InvalidAlgorithmParameterException r1 = new java.security.InvalidAlgorithmParameterException
            r1.<init>(r9)
            throw r1
        L102:
            if (r0 == 0) goto L11b
            java.math.BigInteger r1 = r0.multiply(r0)
            java.math.BigInteger r1 = r1.mod(r13)
            int r1 = r1.compareTo(r12)
            if (r1 != 0) goto L113
            goto L11b
        L113:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Could not find a modular square root"
            r1.<init>(r2)
            throw r1
        L11b:
            return r0
        L11c:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r1 = "p must be positive"
            r0.<init>(r1)
            throw r0
    }

    public static java.security.spec.ECPoint pointDecode(com.google.crypto.tink.subtle.EllipticCurves.CurveType r1, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r2, byte[] r3) throws java.security.GeneralSecurityException {
            java.security.spec.ECParameterSpec r0 = getCurveSpec(r1)
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            java.security.spec.ECPoint r0 = pointDecode(r0, r2, r3)
            return r0
    }

    public static java.security.spec.ECPoint pointDecode(java.security.spec.EllipticCurve r6, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r7, byte[] r8) throws java.security.GeneralSecurityException {
            int r0 = fieldSizeInBytes(r6)
            int[] r1 = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType
            int r2 = r7.ordinal()
            r1 = r1[r2]
            java.lang.String r2 = "invalid point size"
            r3 = 0
            r4 = 1
            switch(r1) {
                case 1: goto La2;
                case 2: goto L7b;
                case 3: goto L2c;
                default: goto L13;
            }
        L13:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "invalid format:"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L2c:
            java.math.BigInteger r1 = getModulus(r6)
            int r2 = r8.length
            int r5 = r0 + 1
            if (r2 != r5) goto L73
            r2 = r8[r3]
            r5 = 2
            if (r2 != r5) goto L3c
            r2 = 0
            goto L42
        L3c:
            r2 = r8[r3]
            r3 = 3
            if (r2 != r3) goto L6b
            r2 = 1
        L42:
            java.math.BigInteger r3 = new java.math.BigInteger
            int r5 = r8.length
            byte[] r5 = java.util.Arrays.copyOfRange(r8, r4, r5)
            r3.<init>(r4, r5)
            int r4 = r3.signum()
            r5 = -1
            if (r4 == r5) goto L63
            int r4 = r3.compareTo(r1)
            if (r4 >= 0) goto L63
            java.math.BigInteger r4 = getY(r3, r2, r6)
            java.security.spec.ECPoint r5 = new java.security.spec.ECPoint
            r5.<init>(r3, r4)
            return r5
        L63:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "x is out of range"
            r4.<init>(r5)
            throw r4
        L6b:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "invalid format"
            r2.<init>(r3)
            throw r2
        L73:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "compressed point has wrong length"
            r2.<init>(r3)
            throw r2
        L7b:
            int r1 = r8.length
            int r5 = r0 * 2
            if (r1 != r5) goto L9c
            java.math.BigInteger r1 = new java.math.BigInteger
            byte[] r2 = java.util.Arrays.copyOfRange(r8, r3, r0)
            r1.<init>(r4, r2)
            java.math.BigInteger r2 = new java.math.BigInteger
            int r3 = r8.length
            byte[] r3 = java.util.Arrays.copyOfRange(r8, r0, r3)
            r2.<init>(r4, r3)
            java.security.spec.ECPoint r3 = new java.security.spec.ECPoint
            r3.<init>(r1, r2)
            com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(r3, r6)
            return r3
        L9c:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            r1.<init>(r2)
            throw r1
        La2:
            int r1 = r8.length
            int r5 = r0 * 2
            int r5 = r5 + r4
            if (r1 != r5) goto Ld5
            r1 = r8[r3]
            r2 = 4
            if (r1 != r2) goto Lcd
            java.math.BigInteger r1 = new java.math.BigInteger
            int r2 = r0 + 1
            byte[] r2 = java.util.Arrays.copyOfRange(r8, r4, r2)
            r1.<init>(r4, r2)
            java.math.BigInteger r2 = new java.math.BigInteger
            int r3 = r0 + 1
            int r5 = r8.length
            byte[] r3 = java.util.Arrays.copyOfRange(r8, r3, r5)
            r2.<init>(r4, r3)
            java.security.spec.ECPoint r3 = new java.security.spec.ECPoint
            r3.<init>(r1, r2)
            com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(r3, r6)
            return r3
        Lcd:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "invalid point format"
            r1.<init>(r2)
            throw r1
        Ld5:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            r1.<init>(r2)
            throw r1
    }

    public static byte[] pointEncode(com.google.crypto.tink.subtle.EllipticCurves.CurveType r1, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r2, java.security.spec.ECPoint r3) throws java.security.GeneralSecurityException {
            java.security.spec.ECParameterSpec r0 = getCurveSpec(r1)
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            byte[] r0 = pointEncode(r0, r2, r3)
            return r0
    }

    public static byte[] pointEncode(java.security.spec.EllipticCurve r7, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType r8, java.security.spec.ECPoint r9) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(r9, r7)
            int r0 = fieldSizeInBytes(r7)
            int[] r1 = com.google.crypto.tink.subtle.EllipticCurves.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType
            int r2 = r8.ordinal()
            r1 = r1[r2]
            r2 = 0
            switch(r1) {
                case 1: goto L89;
                case 2: goto L51;
                case 3: goto L2c;
                default: goto L13;
            }
        L13:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "invalid format:"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L2c:
            int r1 = r0 + 1
            byte[] r1 = new byte[r1]
            java.math.BigInteger r3 = r9.getAffineX()
            byte[] r3 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytes(r3)
            int r4 = r0 + 1
            int r5 = r3.length
            int r4 = r4 - r5
            int r5 = r3.length
            java.lang.System.arraycopy(r3, r2, r1, r4, r5)
            java.math.BigInteger r4 = r9.getAffineY()
            boolean r4 = r4.testBit(r2)
            if (r4 == 0) goto L4c
            r4 = 3
            goto L4d
        L4c:
            r4 = 2
        L4d:
            byte r4 = (byte) r4
            r1[r2] = r4
            return r1
        L51:
            int r1 = r0 * 2
            byte[] r1 = new byte[r1]
            java.math.BigInteger r3 = r9.getAffineX()
            byte[] r3 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytes(r3)
            int r4 = r3.length
            if (r4 <= r0) goto L67
            int r4 = r3.length
            int r4 = r4 - r0
            int r5 = r3.length
            byte[] r3 = java.util.Arrays.copyOfRange(r3, r4, r5)
        L67:
            java.math.BigInteger r4 = r9.getAffineY()
            byte[] r4 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytes(r4)
            int r5 = r4.length
            if (r5 <= r0) goto L79
            int r5 = r4.length
            int r5 = r5 - r0
            int r6 = r4.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r5, r6)
        L79:
            int r5 = r0 * 2
            int r6 = r4.length
            int r5 = r5 - r6
            int r6 = r4.length
            java.lang.System.arraycopy(r4, r2, r1, r5, r6)
            int r5 = r3.length
            int r5 = r0 - r5
            int r6 = r3.length
            java.lang.System.arraycopy(r3, r2, r1, r5, r6)
            return r1
        L89:
            int r1 = r0 * 2
            int r1 = r1 + 1
            byte[] r1 = new byte[r1]
            java.math.BigInteger r3 = r9.getAffineX()
            byte[] r3 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytes(r3)
            java.math.BigInteger r4 = r9.getAffineY()
            byte[] r4 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytes(r4)
            int r5 = r0 * 2
            int r5 = r5 + 1
            int r6 = r4.length
            int r5 = r5 - r6
            int r6 = r4.length
            java.lang.System.arraycopy(r4, r2, r1, r5, r6)
            int r5 = r0 + 1
            int r6 = r3.length
            int r5 = r5 - r6
            int r6 = r3.length
            java.lang.System.arraycopy(r3, r2, r1, r5, r6)
            r5 = 4
            r1[r2] = r5
            return r1
    }

    private static byte[] toMinimalSignedNumber(byte[] r4) {
            r0 = 0
        L1:
            int r1 = r4.length
            if (r0 >= r1) goto Lb
            r1 = r4[r0]
            if (r1 != 0) goto Lb
            int r0 = r0 + 1
            goto L1
        Lb:
            int r1 = r4.length
            if (r0 != r1) goto L11
            int r1 = r4.length
            int r0 = r1 + (-1)
        L11:
            r1 = 0
            r2 = r4[r0]
            r3 = 128(0x80, float:1.8E-43)
            r2 = r2 & r3
            if (r2 != r3) goto L1a
            r1 = 1
        L1a:
            int r2 = r4.length
            int r2 = r2 - r0
            int r2 = r2 + r1
            byte[] r2 = new byte[r2]
            int r3 = r4.length
            int r3 = r3 - r0
            java.lang.System.arraycopy(r4, r0, r2, r1, r3)
            return r2
    }

    public static void validatePublicKey(java.security.interfaces.ECPublicKey r2, java.security.interfaces.ECPrivateKey r3) throws java.security.GeneralSecurityException {
            validatePublicKeySpec(r2, r3)
            java.security.spec.ECPoint r0 = r2.getW()
            java.security.spec.ECParameterSpec r1 = r3.getParams()
            java.security.spec.EllipticCurve r1 = r1.getCurve()
            com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(r0, r1)
            return
    }

    static void validatePublicKeySpec(java.security.interfaces.ECPublicKey r4, java.security.interfaces.ECPrivateKey r5) throws java.security.GeneralSecurityException {
            java.security.spec.ECParameterSpec r0 = r4.getParams()     // Catch: java.lang.NullPointerException -> L18 java.lang.IllegalArgumentException -> L1a
            java.security.spec.ECParameterSpec r1 = r5.getParams()     // Catch: java.lang.NullPointerException -> L18 java.lang.IllegalArgumentException -> L1a
            boolean r2 = isSameEcParameterSpec(r0, r1)     // Catch: java.lang.NullPointerException -> L18 java.lang.IllegalArgumentException -> L1a
            if (r2 == 0) goto L10
        Lf:
            return
        L10:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.NullPointerException -> L18 java.lang.IllegalArgumentException -> L1a
            java.lang.String r3 = "invalid public key spec"
            r2.<init>(r3)     // Catch: java.lang.NullPointerException -> L18 java.lang.IllegalArgumentException -> L1a
            throw r2     // Catch: java.lang.NullPointerException -> L18 java.lang.IllegalArgumentException -> L1a
        L18:
            r0 = move-exception
            goto L1b
        L1a:
            r0 = move-exception
        L1b:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            r1.<init>(r0)
            throw r1
    }

    private static void validateSharedSecret(byte[] r5, java.security.interfaces.ECPrivateKey r6) throws java.security.GeneralSecurityException {
            java.security.spec.ECParameterSpec r0 = r6.getParams()
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            java.math.BigInteger r1 = new java.math.BigInteger
            r2 = 1
            r1.<init>(r2, r5)
            int r3 = r1.signum()
            r4 = -1
            if (r3 == r4) goto L24
            java.math.BigInteger r3 = getModulus(r0)
            int r3 = r1.compareTo(r3)
            if (r3 >= 0) goto L24
            java.math.BigInteger r2 = getY(r1, r2, r0)
            return
        L24:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r3 = "shared secret is out of range"
            r2.<init>(r3)
            throw r2
    }
}
