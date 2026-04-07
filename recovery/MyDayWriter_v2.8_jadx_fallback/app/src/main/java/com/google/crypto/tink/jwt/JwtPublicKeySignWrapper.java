package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
class JwtPublicKeySignWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.jwt.JwtPublicKeySignInternal, com.google.crypto.tink.jwt.JwtPublicKeySign> {
    private static final com.google.crypto.tink.jwt.JwtPublicKeySignWrapper WRAPPER = null;

    @com.google.errorprone.annotations.Immutable
    private static class WrappedJwtPublicKeySign implements com.google.crypto.tink.jwt.JwtPublicKeySign {
        private final com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeySignInternal> primitives;

        public WrappedJwtPublicKeySign(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeySignInternal> r1) {
                r0 = this;
                r0.<init>()
                r0.primitives = r1
                return
        }

        @Override // com.google.crypto.tink.jwt.JwtPublicKeySign
        public java.lang.String signAndEncode(com.google.crypto.tink.jwt.RawJwt r4) throws java.security.GeneralSecurityException {
                r3 = this;
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeySignInternal> r0 = r3.primitives
                com.google.crypto.tink.PrimitiveSet$Entry r0 = r0.getPrimary()
                int r1 = r0.getKeyId()
                com.google.crypto.tink.proto.OutputPrefixType r2 = r0.getOutputPrefixType()
                java.util.Optional r1 = com.google.crypto.tink.jwt.JwtFormat.getKid(r1, r2)
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeySignInternal> r2 = r3.primitives
                com.google.crypto.tink.PrimitiveSet$Entry r2 = r2.getPrimary()
                java.lang.Object r2 = r2.getPrimitive()
                com.google.crypto.tink.jwt.JwtPublicKeySignInternal r2 = (com.google.crypto.tink.jwt.JwtPublicKeySignInternal) r2
                java.lang.String r2 = r2.signAndEncodeWithKid(r4, r1)
                return r2
        }
    }

    static {
            com.google.crypto.tink.jwt.JwtPublicKeySignWrapper r0 = new com.google.crypto.tink.jwt.JwtPublicKeySignWrapper
            r0.<init>()
            com.google.crypto.tink.jwt.JwtPublicKeySignWrapper.WRAPPER = r0
            return
    }

    JwtPublicKeySignWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.jwt.JwtPublicKeySignWrapper r0 = com.google.crypto.tink.jwt.JwtPublicKeySignWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    private static void validate(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeySignInternal> r6) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.PrimitiveSet$Entry r0 = r6.getPrimary()
            if (r0 == 0) goto L46
            java.util.Collection r0 = r6.getAll()
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r0.next()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r2 = r1.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r3 = r2.next()
            com.google.crypto.tink.PrimitiveSet$Entry r3 = (com.google.crypto.tink.PrimitiveSet.Entry) r3
            com.google.crypto.tink.proto.OutputPrefixType r4 = r3.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            if (r4 == r5) goto L43
            com.google.crypto.tink.proto.OutputPrefixType r4 = r3.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            if (r4 != r5) goto L3b
            goto L43
        L3b:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "unsupported OutputPrefixType"
            r0.<init>(r2)
            throw r0
        L43:
            goto L1e
        L44:
            goto Le
        L45:
            return
        L46:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Primitive set has no primary."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeySignInternal> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeySignInternal> r0 = com.google.crypto.tink.jwt.JwtPublicKeySignInternal.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeySign> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeySign> r0 = com.google.crypto.tink.jwt.JwtPublicKeySign.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.jwt.JwtPublicKeySign wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeySignInternal> r2) throws java.security.GeneralSecurityException {
            r1 = this;
            validate(r2)
            com.google.crypto.tink.jwt.JwtPublicKeySignWrapper$WrappedJwtPublicKeySign r0 = new com.google.crypto.tink.jwt.JwtPublicKeySignWrapper$WrappedJwtPublicKeySign
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.jwt.JwtPublicKeySign wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtPublicKeySignInternal> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.jwt.JwtPublicKeySign r1 = r0.wrap(r1)
            return r1
    }
}
