package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
class JwtPublicKeyVerifyWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal, com.google.crypto.tink.jwt.JwtPublicKeyVerify> {
    private static final com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper WRAPPER = null;

    @com.google.errorprone.annotations.Immutable
    private static class WrappedJwtPublicKeyVerify implements com.google.crypto.tink.jwt.JwtPublicKeyVerify {
        private final com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal> primitives;

        public WrappedJwtPublicKeyVerify(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal> r1) {
                r0 = this;
                r0.<init>()
                r0.primitives = r1
                return
        }

        @Override // com.google.crypto.tink.jwt.JwtPublicKeyVerify
        public com.google.crypto.tink.jwt.VerifiedJwt verifyAndDecode(java.lang.String r8, com.google.crypto.tink.jwt.JwtValidator r9) throws java.security.GeneralSecurityException {
                r7 = this;
                r0 = 0
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal> r1 = r7.primitives
                java.util.Collection r1 = r1.getAll()
                java.util.Iterator r1 = r1.iterator()
            Lb:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L46
                java.lang.Object r2 = r1.next()
                java.util.List r2 = (java.util.List) r2
                java.util.Iterator r3 = r2.iterator()
            L1b:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L45
                java.lang.Object r4 = r3.next()
                com.google.crypto.tink.PrimitiveSet$Entry r4 = (com.google.crypto.tink.PrimitiveSet.Entry) r4
                int r5 = r4.getKeyId()     // Catch: java.security.GeneralSecurityException -> L3e
                com.google.crypto.tink.proto.OutputPrefixType r6 = r4.getOutputPrefixType()     // Catch: java.security.GeneralSecurityException -> L3e
                java.util.Optional r5 = com.google.crypto.tink.jwt.JwtFormat.getKid(r5, r6)     // Catch: java.security.GeneralSecurityException -> L3e
                java.lang.Object r6 = r4.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L3e
                com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal r6 = (com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal) r6     // Catch: java.security.GeneralSecurityException -> L3e
                com.google.crypto.tink.jwt.VerifiedJwt r1 = r6.verifyAndDecodeWithKid(r8, r9, r5)     // Catch: java.security.GeneralSecurityException -> L3e
                return r1
            L3e:
                r5 = move-exception
                boolean r6 = r5 instanceof com.google.crypto.tink.jwt.JwtInvalidException
                if (r6 == 0) goto L44
                r0 = r5
            L44:
                goto L1b
            L45:
                goto Lb
            L46:
                if (r0 == 0) goto L49
                throw r0
            L49:
                java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
                java.lang.String r2 = "invalid JWT"
                r1.<init>(r2)
                throw r1
        }
    }

    static {
            com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper r0 = new com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper
            r0.<init>()
            com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper.WRAPPER = r0
            return
    }

    JwtPublicKeyVerifyWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper r0 = com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    private static void validate(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal> r6) throws java.security.GeneralSecurityException {
            java.util.Collection r0 = r6.getAll()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r2 = r1.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r2.next()
            com.google.crypto.tink.PrimitiveSet$Entry r3 = (com.google.crypto.tink.PrimitiveSet.Entry) r3
            com.google.crypto.tink.proto.OutputPrefixType r4 = r3.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            if (r4 == r5) goto L3d
            com.google.crypto.tink.proto.OutputPrefixType r4 = r3.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            if (r4 != r5) goto L35
            goto L3d
        L35:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "unsupported OutputPrefixType"
            r0.<init>(r2)
            throw r0
        L3d:
            goto L18
        L3e:
            goto L8
        L3f:
            return
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal> r0 = com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeyVerify> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeyVerify> r0 = com.google.crypto.tink.jwt.JwtPublicKeyVerify.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.jwt.JwtPublicKeyVerify wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal> r2) throws java.security.GeneralSecurityException {
            r1 = this;
            validate(r2)
            com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper$WrappedJwtPublicKeyVerify r0 = new com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper$WrappedJwtPublicKeyVerify
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.jwt.JwtPublicKeyVerify wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.jwt.JwtPublicKeyVerify r1 = r0.wrap(r1)
            return r1
    }
}
