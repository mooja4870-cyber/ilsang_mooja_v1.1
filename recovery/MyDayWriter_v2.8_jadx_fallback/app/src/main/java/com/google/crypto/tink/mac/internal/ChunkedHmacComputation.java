package com.google.crypto.tink.mac.internal;

/* JADX INFO: loaded from: classes.dex */
final class ChunkedHmacComputation implements com.google.crypto.tink.mac.ChunkedMacComputation {
    private static final byte[] FORMAT_VERSION = null;
    private boolean finalized;
    private final com.google.crypto.tink.mac.HmacKey key;
    private final javax.crypto.Mac mac;

    static {
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 0
            r0[r1] = r1
            com.google.crypto.tink.mac.internal.ChunkedHmacComputation.FORMAT_VERSION = r0
            return
    }

    ChunkedHmacComputation(com.google.crypto.tink.mac.HmacKey r5) throws java.security.GeneralSecurityException {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.finalized = r0
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMac, javax.crypto.Mac> r0 = com.google.crypto.tink.subtle.EngineFactory.MAC
            java.lang.String r1 = composeAlgorithmName(r5)
            java.lang.Object r0 = r0.getInstance(r1)
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0
            r4.mac = r0
            javax.crypto.Mac r0 = r4.mac
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            com.google.crypto.tink.util.SecretBytes r2 = r5.getKeyBytes()
            com.google.crypto.tink.SecretKeyAccess r3 = com.google.crypto.tink.InsecureSecretKeyAccess.get()
            byte[] r2 = r2.toByteArray(r3)
            java.lang.String r3 = "HMAC"
            r1.<init>(r2, r3)
            r0.init(r1)
            r4.key = r5
            return
    }

    private static java.lang.String composeAlgorithmName(com.google.crypto.tink.mac.HmacKey r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HMAC"
            java.lang.StringBuilder r0 = r0.append(r1)
            com.google.crypto.tink.mac.HmacParameters r1 = r2.getParameters()
            com.google.crypto.tink.mac.HmacParameters$HashType r1 = r1.getHashType()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacComputation
    public byte[] computeMac() throws java.security.GeneralSecurityException {
            r3 = this;
            boolean r0 = r3.finalized
            if (r0 != 0) goto L45
            com.google.crypto.tink.mac.HmacKey r0 = r3.key
            com.google.crypto.tink.mac.HmacParameters r0 = r0.getParameters()
            com.google.crypto.tink.mac.HmacParameters$Variant r0 = r0.getVariant()
            com.google.crypto.tink.mac.HmacParameters$Variant r1 = com.google.crypto.tink.mac.HmacParameters.Variant.LEGACY
            if (r0 != r1) goto L1b
            byte[] r0 = com.google.crypto.tink.mac.internal.ChunkedHmacComputation.FORMAT_VERSION
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r3.update(r0)
        L1b:
            r0 = 1
            r3.finalized = r0
            com.google.crypto.tink.mac.HmacKey r0 = r3.key
            com.google.crypto.tink.util.Bytes r0 = r0.getOutputPrefix()
            byte[] r0 = r0.toByteArray()
            javax.crypto.Mac r1 = r3.mac
            byte[] r1 = r1.doFinal()
            com.google.crypto.tink.mac.HmacKey r2 = r3.key
            com.google.crypto.tink.mac.HmacParameters r2 = r2.getParameters()
            int r2 = r2.getCryptographicTagSizeBytes()
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            byte[][] r0 = new byte[][]{r0, r1}
            byte[] r0 = com.google.crypto.tink.subtle.Bytes.concat(r0)
            return r0
        L45:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot compute after already computing the MAC tag. Please create a new object."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacComputation
    public void update(java.nio.ByteBuffer r3) {
            r2 = this;
            boolean r0 = r2.finalized
            if (r0 != 0) goto La
            javax.crypto.Mac r0 = r2.mac
            r0.update(r3)
            return
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot update after computing the MAC tag. Please create a new object."
            r0.<init>(r1)
            throw r0
    }
}
