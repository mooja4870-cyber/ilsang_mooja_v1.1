package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class Hkdf {
    private Hkdf() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] computeEciesHkdfSymmetricKey(byte[] r2, byte[] r3, java.lang.String r4, byte[] r5, byte[] r6, int r7) throws java.security.GeneralSecurityException {
            byte[][] r0 = new byte[][]{r2, r3}
            byte[] r0 = com.google.crypto.tink.subtle.Bytes.concat(r0)
            byte[] r1 = computeHkdf(r4, r0, r5, r6, r7)
            return r1
    }

    public static byte[] computeHkdf(java.lang.String r8, byte[] r9, byte[] r10, byte[] r11, int r12) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMac, javax.crypto.Mac> r0 = com.google.crypto.tink.subtle.EngineFactory.MAC
            java.lang.Object r0 = r0.getInstance(r8)
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0
            int r1 = r0.getMacLength()
            int r1 = r1 * 255
            if (r12 > r1) goto L62
            if (r10 == 0) goto L1f
            int r1 = r10.length
            if (r1 != 0) goto L16
            goto L1f
        L16:
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            r1.<init>(r10, r8)
            r0.init(r1)
            goto L2d
        L1f:
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            int r2 = r0.getMacLength()
            byte[] r2 = new byte[r2]
            r1.<init>(r2, r8)
            r0.init(r1)
        L2d:
            byte[] r1 = r0.doFinal(r9)
            byte[] r2 = new byte[r12]
            r3 = 1
            r4 = 0
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec
            r5.<init>(r1, r8)
            r0.init(r5)
            r5 = 0
            byte[] r6 = new byte[r5]
        L40:
            r0.update(r6)
            r0.update(r11)
            byte r7 = (byte) r3
            r0.update(r7)
            byte[] r6 = r0.doFinal()
            int r7 = r6.length
            int r7 = r7 + r4
            if (r7 >= r12) goto L5b
            int r7 = r6.length
            java.lang.System.arraycopy(r6, r5, r2, r4, r7)
            int r7 = r6.length
            int r4 = r4 + r7
            int r3 = r3 + 1
            goto L40
        L5b:
            int r7 = r12 - r4
            java.lang.System.arraycopy(r6, r5, r2, r4, r7)
            return r2
        L62:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "size too large"
            r1.<init>(r2)
            throw r1
    }
}
