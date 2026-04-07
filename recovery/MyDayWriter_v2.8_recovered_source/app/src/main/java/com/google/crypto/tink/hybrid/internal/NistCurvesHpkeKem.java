package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
final class NistCurvesHpkeKem implements com.google.crypto.tink.hybrid.internal.HpkeKem {
    private final com.google.crypto.tink.subtle.EllipticCurves.CurveType curve;
    private final com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf hkdf;

    /* JADX INFO: renamed from: com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType = null;

        static {
                com.google.crypto.tink.subtle.EllipticCurves$CurveType[] r0 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType = r0
                int[] r0 = com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r1 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r1 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.subtle.EllipticCurves$CurveType r1 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521     // Catch: java.lang.NoSuchFieldError -> L2f
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

    private NistCurvesHpkeKem(com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r1, com.google.crypto.tink.subtle.EllipticCurves.CurveType r2) {
            r0 = this;
            r0.<init>()
            r0.hkdf = r1
            r0.curve = r2
            return
    }

    private byte[] deriveKemSharedSecret(byte[] r10, byte[] r11, byte[] r12) throws java.security.GeneralSecurityException {
            r9 = this;
            byte[][] r0 = new byte[][]{r11, r12}
            byte[] r5 = com.google.crypto.tink.subtle.Bytes.concat(r0)
            byte[] r0 = r9.getKemId()
            byte[] r7 = com.google.crypto.tink.hybrid.internal.HpkeUtil.kemSuiteId(r0)
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r1 = r9.hkdf
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r0 = r9.hkdf
            int r8 = r0.getMacLength()
            r2 = 0
            java.lang.String r4 = "eae_prk"
            java.lang.String r6 = "shared_secret"
            r3 = r10
            byte[] r10 = r1.extractAndExpand(r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    static com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem fromCurve(com.google.crypto.tink.subtle.EllipticCurves.CurveType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L42;
                case 2: goto L33;
                case 3: goto L24;
                default: goto Lb;
            }
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid curve type: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L24:
            com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem r0 = new com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r1 = new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf
            java.lang.String r2 = "HmacSha512"
            r1.<init>(r2)
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r2 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521
            r0.<init>(r1, r2)
            return r0
        L33:
            com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem r0 = new com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r1 = new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf
            java.lang.String r2 = "HmacSha384"
            r1.<init>(r2)
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r2 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384
            r0.<init>(r1, r2)
            return r0
        L42:
            com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem r0 = new com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem
            com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf r1 = new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf
            java.lang.String r2 = "HmacSha256"
            r1.<init>(r2)
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r2 = com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public byte[] decapsulate(byte[] r5, com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey r6) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = r4.curve
            com.google.crypto.tink.util.Bytes r1 = r6.getSerializedPrivate()
            byte[] r1 = r1.toByteArray()
            java.security.interfaces.ECPrivateKey r0 = com.google.crypto.tink.subtle.EllipticCurves.getEcPrivateKey(r0, r1)
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r1 = r4.curve
            com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r2 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED
            java.security.interfaces.ECPublicKey r1 = com.google.crypto.tink.subtle.EllipticCurves.getEcPublicKey(r1, r2, r5)
            byte[] r2 = com.google.crypto.tink.subtle.EllipticCurves.computeSharedSecret(r0, r1)
            com.google.crypto.tink.util.Bytes r3 = r6.getSerializedPublic()
            byte[] r3 = r3.toByteArray()
            byte[] r3 = r4.deriveKemSharedSecret(r2, r5, r3)
            return r3
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput encapsulate(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = r2.curve
            java.security.KeyPair r0 = com.google.crypto.tink.subtle.EllipticCurves.generateKeyPair(r0)
            com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput r1 = r2.encapsulate(r3, r0)
            return r1
    }

    com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput encapsulate(byte[] r6, java.security.KeyPair r7) throws java.security.GeneralSecurityException {
            r5 = this;
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r0 = r5.curve
            com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r1 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED
            java.security.interfaces.ECPublicKey r0 = com.google.crypto.tink.subtle.EllipticCurves.getEcPublicKey(r0, r1, r6)
            java.security.PrivateKey r1 = r7.getPrivate()
            java.security.interfaces.ECPrivateKey r1 = (java.security.interfaces.ECPrivateKey) r1
            byte[] r1 = com.google.crypto.tink.subtle.EllipticCurves.computeSharedSecret(r1, r0)
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r2 = r5.curve
            com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r3 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED
            java.security.PublicKey r4 = r7.getPublic()
            java.security.interfaces.ECPublicKey r4 = (java.security.interfaces.ECPublicKey) r4
            java.security.spec.ECPoint r4 = r4.getW()
            byte[] r2 = com.google.crypto.tink.subtle.EllipticCurves.pointEncode(r2, r3, r4)
            byte[] r3 = r5.deriveKemSharedSecret(r1, r2, r6)
            com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput r4 = new com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput
            r4.<init>(r3, r2)
            return r4
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public byte[] getKemId() throws java.security.GeneralSecurityException {
            r2 = this;
            int[] r0 = com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r1 = r2.curve
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L1b;
                case 2: goto L18;
                case 3: goto L15;
                default: goto Ld;
            }
        Ld:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Could not determine HPKE KEM ID"
            r0.<init>(r1)
            throw r0
        L15:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.P521_HKDF_SHA512_KEM_ID
            return r0
        L18:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.P384_HKDF_SHA384_KEM_ID
            return r0
        L1b:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.P256_HKDF_SHA256_KEM_ID
            return r0
    }
}
