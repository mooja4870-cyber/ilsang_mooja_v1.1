package com.google.crypto.tink.mac.internal;

/* JADX INFO: loaded from: classes.dex */
final class ChunkedAesCmacVerification implements com.google.crypto.tink.mac.ChunkedMacVerification {
    private final com.google.crypto.tink.mac.internal.ChunkedAesCmacComputation aesCmacComputation;
    private final com.google.crypto.tink.util.Bytes tag;

    ChunkedAesCmacVerification(com.google.crypto.tink.mac.AesCmacKey r2, byte[] r3) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.mac.internal.ChunkedAesCmacComputation r0 = new com.google.crypto.tink.mac.internal.ChunkedAesCmacComputation
            r0.<init>(r2)
            r1.aesCmacComputation = r0
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r3)
            r1.tag = r0
            return
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacVerification
    public void update(java.nio.ByteBuffer r2) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.mac.internal.ChunkedAesCmacComputation r0 = r1.aesCmacComputation
            r0.update(r2)
            return
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacVerification
    public void verifyMac() throws java.security.GeneralSecurityException {
            r3 = this;
            com.google.crypto.tink.mac.internal.ChunkedAesCmacComputation r0 = r3.aesCmacComputation
            byte[] r0 = r0.computeMac()
            com.google.crypto.tink.util.Bytes r1 = r3.tag
            com.google.crypto.tink.util.Bytes r2 = com.google.crypto.tink.util.Bytes.copyFrom(r0)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L13
            return
        L13:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "invalid MAC"
            r1.<init>(r2)
            throw r1
    }
}
