package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
final class HkdfHpkeKdf implements com.google.crypto.tink.hybrid.internal.HpkeKdf {
    private final java.lang.String macAlgorithm;

    HkdfHpkeKdf(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.macAlgorithm = r1
            return
    }

    private byte[] expand(byte[] r8, byte[] r9, int r10) throws java.security.GeneralSecurityException {
            r7 = this;
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMac, javax.crypto.Mac> r0 = com.google.crypto.tink.subtle.EngineFactory.MAC
            java.lang.String r1 = r7.macAlgorithm
            java.lang.Object r0 = r0.getInstance(r1)
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0
            int r1 = r0.getMacLength()
            int r1 = r1 * 255
            if (r10 > r1) goto L45
            byte[] r1 = new byte[r10]
            r2 = 1
            r3 = 0
            javax.crypto.spec.SecretKeySpec r4 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r5 = r7.macAlgorithm
            r4.<init>(r8, r5)
            r0.init(r4)
            r4 = 0
            byte[] r5 = new byte[r4]
        L23:
            r0.update(r5)
            r0.update(r9)
            byte r6 = (byte) r2
            r0.update(r6)
            byte[] r5 = r0.doFinal()
            int r6 = r5.length
            int r6 = r6 + r3
            if (r6 >= r10) goto L3e
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r4, r1, r3, r6)
            int r6 = r5.length
            int r3 = r3 + r6
            int r2 = r2 + 1
            goto L23
        L3e:
            int r6 = r10 - r3
            java.lang.System.arraycopy(r5, r4, r1, r3, r6)
            return r1
        L45:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "size too large"
            r1.<init>(r2)
            throw r1
    }

    private byte[] extract(byte[] r5, byte[] r6) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMac, javax.crypto.Mac> r0 = com.google.crypto.tink.subtle.EngineFactory.MAC
            java.lang.String r1 = r4.macAlgorithm
            java.lang.Object r0 = r0.getInstance(r1)
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0
            if (r6 == 0) goto L1b
            int r1 = r6.length
            if (r1 != 0) goto L10
            goto L1b
        L10:
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r2 = r4.macAlgorithm
            r1.<init>(r6, r2)
            r0.init(r1)
            goto L2b
        L1b:
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            int r2 = r0.getMacLength()
            byte[] r2 = new byte[r2]
            java.lang.String r3 = r4.macAlgorithm
            r1.<init>(r2, r3)
            r0.init(r1)
        L2b:
            byte[] r1 = r0.doFinal(r5)
            return r1
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKdf
    public byte[] extractAndExpand(byte[] r3, byte[] r4, java.lang.String r5, byte[] r6, java.lang.String r7, byte[] r8, int r9) throws java.security.GeneralSecurityException {
            r2 = this;
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.labelIkm(r5, r4, r8)
            byte[] r0 = r2.extract(r0, r3)
            byte[] r1 = com.google.crypto.tink.hybrid.internal.HpkeUtil.labelInfo(r7, r6, r8, r9)
            byte[] r1 = r2.expand(r0, r1, r9)
            return r1
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKdf
    public byte[] getKdfId() throws java.security.GeneralSecurityException {
            r2 = this;
            java.lang.String r0 = r2.macAlgorithm
            int r1 = r0.hashCode()
            switch(r1) {
                case 984523022: goto L1e;
                case 984524074: goto L14;
                case 984525777: goto La;
                default: goto L9;
            }
        L9:
            goto L28
        La:
            java.lang.String r1 = "HmacSha512"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L9
            r0 = 2
            goto L29
        L14:
            java.lang.String r1 = "HmacSha384"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L9
            r0 = 1
            goto L29
        L1e:
            java.lang.String r1 = "HmacSha256"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L9
            r0 = 0
            goto L29
        L28:
            r0 = -1
        L29:
            switch(r0) {
                case 0: goto L3a;
                case 1: goto L37;
                case 2: goto L34;
                default: goto L2c;
            }
        L2c:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Could not determine HPKE KDF ID"
            r0.<init>(r1)
            throw r0
        L34:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA512_KDF_ID
            return r0
        L37:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA384_KDF_ID
            return r0
        L3a:
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA256_KDF_ID
            return r0
    }

    int getMacLength() throws java.security.GeneralSecurityException {
            r1 = this;
            java.lang.String r0 = r1.macAlgorithm
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r0)
            int r0 = r0.getMacLength()
            return r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKdf
    public byte[] labeledExpand(byte[] r2, byte[] r3, java.lang.String r4, byte[] r5, int r6) throws java.security.GeneralSecurityException {
            r1 = this;
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.labelInfo(r4, r3, r5, r6)
            byte[] r0 = r1.expand(r2, r0, r6)
            return r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKdf
    public byte[] labeledExtract(byte[] r2, byte[] r3, java.lang.String r4, byte[] r5) throws java.security.GeneralSecurityException {
            r1 = this;
            byte[] r0 = com.google.crypto.tink.hybrid.internal.HpkeUtil.labelIkm(r4, r3, r5)
            byte[] r0 = r1.extract(r0, r2)
            return r0
    }
}
