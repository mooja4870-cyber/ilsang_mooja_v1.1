package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class Ed25519Sign implements com.google.crypto.tink.PublicKeySign {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    public static final int SECRET_KEY_LEN = 32;
    private final byte[] hashedPrivateKey;
    private final byte[] publicKey;

    public static final class KeyPair {
        private final byte[] privateKey;
        private final byte[] publicKey;

        private KeyPair(byte[] r1, byte[] r2) {
                r0 = this;
                r0.<init>()
                r0.publicKey = r1
                r0.privateKey = r2
                return
        }

        public static com.google.crypto.tink.subtle.Ed25519Sign.KeyPair newKeyPair() throws java.security.GeneralSecurityException {
                r0 = 32
                byte[] r0 = com.google.crypto.tink.subtle.Random.randBytes(r0)
                com.google.crypto.tink.subtle.Ed25519Sign$KeyPair r0 = newKeyPairFromSeed(r0)
                return r0
        }

        public static com.google.crypto.tink.subtle.Ed25519Sign.KeyPair newKeyPairFromSeed(byte[] r3) throws java.security.GeneralSecurityException {
                int r0 = r3.length
                r1 = 32
                if (r0 != r1) goto L14
                r0 = r3
                byte[] r1 = com.google.crypto.tink.subtle.Ed25519.getHashedScalar(r0)
                byte[] r1 = com.google.crypto.tink.subtle.Ed25519.scalarMultWithBaseToBytes(r1)
                com.google.crypto.tink.subtle.Ed25519Sign$KeyPair r2 = new com.google.crypto.tink.subtle.Ed25519Sign$KeyPair
                r2.<init>(r1, r0)
                return r2
            L14:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r2 = "Given secret seed length is not %s"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1)
                throw r0
        }

        public byte[] getPrivateKey() {
                r2 = this;
                byte[] r0 = r2.privateKey
                byte[] r1 = r2.privateKey
                int r1 = r1.length
                byte[] r0 = java.util.Arrays.copyOf(r0, r1)
                return r0
        }

        public byte[] getPublicKey() {
                r2 = this;
                byte[] r0 = r2.publicKey
                byte[] r1 = r2.publicKey
                int r1 = r1.length
                byte[] r0 = java.util.Arrays.copyOf(r0, r1)
                return r0
        }
    }

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS
            com.google.crypto.tink.subtle.Ed25519Sign.FIPS = r0
            return
    }

    public Ed25519Sign(byte[] r4) throws java.security.GeneralSecurityException {
            r3 = this;
            r3.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.Ed25519Sign.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L33
            int r0 = r4.length
            r1 = 32
            if (r0 != r1) goto L1f
            byte[] r0 = com.google.crypto.tink.subtle.Ed25519.getHashedScalar(r4)
            r3.hashedPrivateKey = r0
            byte[] r0 = r3.hashedPrivateKey
            byte[] r0 = com.google.crypto.tink.subtle.Ed25519.scalarMultWithBaseToBytes(r0)
            r3.publicKey = r0
            return
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "Given private key's length is not %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L33:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Can not use Ed25519 in FIPS-mode."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public byte[] sign(byte[] r3) throws java.security.GeneralSecurityException {
            r2 = this;
            byte[] r0 = r2.publicKey
            byte[] r1 = r2.hashedPrivateKey
            byte[] r0 = com.google.crypto.tink.subtle.Ed25519.sign(r3, r0, r1)
            return r0
    }
}
