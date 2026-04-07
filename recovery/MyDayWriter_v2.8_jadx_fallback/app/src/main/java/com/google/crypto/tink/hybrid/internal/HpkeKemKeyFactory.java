package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes.dex */
final class HpkeKemKeyFactory {

    /* JADX INFO: renamed from: com.google.crypto.tink.hybrid.internal.HpkeKemKeyFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HpkeKem = null;

        static {
                com.google.crypto.tink.proto.HpkeKem[] r0 = com.google.crypto.tink.proto.HpkeKem.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.hybrid.internal.HpkeKemKeyFactory.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem = r0
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeKemKeyFactory.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_X25519_HKDF_SHA256     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeKemKeyFactory.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P256_HKDF_SHA256     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeKemKeyFactory.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P384_HKDF_SHA384     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeKemKeyFactory.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P521_HKDF_SHA512     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                return
        }
    }

    private HpkeKemKeyFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey createPrivate(com.google.crypto.tink.proto.HpkePrivateKey r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeKemKeyFactory.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem
            com.google.crypto.tink.proto.HpkePublicKey r1 = r3.getPublicKey()
            com.google.crypto.tink.proto.HpkeParams r1 = r1.getParams()
            com.google.crypto.tink.proto.HpkeKem r1 = r1.getKem()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L49;
                case 2: goto L1f;
                case 3: goto L1f;
                case 4: goto L1f;
                default: goto L17;
            }
        L17:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Unrecognized HPKE KEM identifier"
            r0.<init>(r1)
            throw r0
        L1f:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.getPrivateKey()
            byte[] r0 = r0.toByteArray()
            com.google.crypto.tink.proto.HpkePublicKey r1 = r3.getPublicKey()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r1.getPublicKey()
            byte[] r1 = r1.toByteArray()
            com.google.crypto.tink.proto.HpkePublicKey r2 = r3.getPublicKey()
            com.google.crypto.tink.proto.HpkeParams r2 = r2.getParams()
            com.google.crypto.tink.proto.HpkeKem r2 = r2.getKem()
            com.google.crypto.tink.subtle.EllipticCurves$CurveType r2 = com.google.crypto.tink.hybrid.internal.HpkeUtil.nistHpkeKemToCurve(r2)
            com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKemPrivateKey r0 = com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKemPrivateKey.fromBytes(r0, r1, r2)
            return r0
        L49:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.getPrivateKey()
            byte[] r0 = r0.toByteArray()
            com.google.crypto.tink.hybrid.internal.X25519HpkeKemPrivateKey r0 = com.google.crypto.tink.hybrid.internal.X25519HpkeKemPrivateKey.fromBytes(r0)
            return r0
    }
}
