package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
class JwtMacWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.jwt.JwtMacInternal, com.google.crypto.tink.jwt.JwtMac> {
    private static final com.google.crypto.tink.jwt.JwtMacWrapper WRAPPER = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.jwt.JwtMacWrapper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    @com.google.errorprone.annotations.Immutable
    private static class WrappedJwtMac implements com.google.crypto.tink.jwt.JwtMac {
        private final com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtMacInternal> primitives;

        private WrappedJwtMac(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtMacInternal> r1) {
                r0 = this;
                r0.<init>()
                r0.primitives = r1
                return
        }

        /* synthetic */ WrappedJwtMac(com.google.crypto.tink.PrimitiveSet r1, com.google.crypto.tink.jwt.JwtMacWrapper.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.crypto.tink.jwt.JwtMac
        public java.lang.String computeMacAndEncode(com.google.crypto.tink.jwt.RawJwt r4) throws java.security.GeneralSecurityException {
                r3 = this;
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtMacInternal> r0 = r3.primitives
                com.google.crypto.tink.PrimitiveSet$Entry r0 = r0.getPrimary()
                int r1 = r0.getKeyId()
                com.google.crypto.tink.proto.OutputPrefixType r2 = r0.getOutputPrefixType()
                java.util.Optional r1 = com.google.crypto.tink.jwt.JwtFormat.getKid(r1, r2)
                java.lang.Object r2 = r0.getPrimitive()
                com.google.crypto.tink.jwt.JwtMacInternal r2 = (com.google.crypto.tink.jwt.JwtMacInternal) r2
                java.lang.String r2 = r2.computeMacAndEncodeWithKid(r4, r1)
                return r2
        }

        @Override // com.google.crypto.tink.jwt.JwtMac
        public com.google.crypto.tink.jwt.VerifiedJwt verifyMacAndDecode(java.lang.String r8, com.google.crypto.tink.jwt.JwtValidator r9) throws java.security.GeneralSecurityException {
                r7 = this;
                r0 = 0
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtMacInternal> r1 = r7.primitives
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
                com.google.crypto.tink.jwt.JwtMacInternal r6 = (com.google.crypto.tink.jwt.JwtMacInternal) r6     // Catch: java.security.GeneralSecurityException -> L3e
                com.google.crypto.tink.jwt.VerifiedJwt r1 = r6.verifyMacAndDecodeWithKid(r8, r9, r5)     // Catch: java.security.GeneralSecurityException -> L3e
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
                java.lang.String r2 = "invalid MAC"
                r1.<init>(r2)
                throw r1
        }
    }

    static {
            com.google.crypto.tink.jwt.JwtMacWrapper r0 = new com.google.crypto.tink.jwt.JwtMacWrapper
            r0.<init>()
            com.google.crypto.tink.jwt.JwtMacWrapper.WRAPPER = r0
            return
    }

    JwtMacWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.jwt.JwtMacWrapper r0 = com.google.crypto.tink.jwt.JwtMacWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    private static void validate(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtMacInternal> r6) throws java.security.GeneralSecurityException {
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
    public java.lang.Class<com.google.crypto.tink.jwt.JwtMacInternal> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.jwt.JwtMacInternal> r0 = com.google.crypto.tink.jwt.JwtMacInternal.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.jwt.JwtMac> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.jwt.JwtMac> r0 = com.google.crypto.tink.jwt.JwtMac.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.jwt.JwtMac wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtMacInternal> r3) throws java.security.GeneralSecurityException {
            r2 = this;
            validate(r3)
            com.google.crypto.tink.jwt.JwtMacWrapper$WrappedJwtMac r0 = new com.google.crypto.tink.jwt.JwtMacWrapper$WrappedJwtMac
            r1 = 0
            r0.<init>(r3, r1)
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.jwt.JwtMac wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.jwt.JwtMacInternal> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.jwt.JwtMac r1 = r0.wrap(r1)
            return r1
    }
}
