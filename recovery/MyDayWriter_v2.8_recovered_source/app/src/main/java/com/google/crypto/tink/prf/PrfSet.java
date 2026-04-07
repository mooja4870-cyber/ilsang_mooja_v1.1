package com.google.crypto.tink.prf;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public abstract class PrfSet {
    public PrfSet() {
            r0 = this;
            r0.<init>()
            return
    }

    public byte[] computePrimary(byte[] r3, int r4) throws java.security.GeneralSecurityException {
            r2 = this;
            java.util.Map r0 = r2.getPrfs()
            int r1 = r2.getPrimaryId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            com.google.crypto.tink.prf.Prf r0 = (com.google.crypto.tink.prf.Prf) r0
            byte[] r0 = r0.compute(r3, r4)
            return r0
    }

    public abstract java.util.Map<java.lang.Integer, com.google.crypto.tink.prf.Prf> getPrfs() throws java.security.GeneralSecurityException;

    public abstract int getPrimaryId();
}
