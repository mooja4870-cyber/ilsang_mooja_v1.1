package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes.dex */
class PublicKeyVerifyWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.PublicKeyVerify, com.google.crypto.tink.PublicKeyVerify> {
    private static final byte[] FORMAT_VERSION = null;
    private static final com.google.crypto.tink.signature.PublicKeyVerifyWrapper WRAPPER = null;
    private static final java.util.logging.Logger logger = null;

    private static class WrappedPublicKeyVerify implements com.google.crypto.tink.PublicKeyVerify {
        private final com.google.crypto.tink.monitoring.MonitoringClient.Logger monitoringLogger;
        private final com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeyVerify> primitives;

        public WrappedPublicKeyVerify(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeyVerify> r5) {
                r4 = this;
                r4.<init>()
                r4.primitives = r5
                boolean r0 = r5.hasAnnotations()
                if (r0 == 0) goto L22
                com.google.crypto.tink.internal.MutableMonitoringRegistry r0 = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance()
                com.google.crypto.tink.monitoring.MonitoringClient r0 = r0.getMonitoringClient()
                com.google.crypto.tink.monitoring.MonitoringKeysetInfo r1 = com.google.crypto.tink.internal.MonitoringUtil.getMonitoringKeysetInfo(r5)
                java.lang.String r2 = "public_key_verify"
                java.lang.String r3 = "verify"
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r2 = r0.createLogger(r1, r2, r3)
                r4.monitoringLogger = r2
                goto L26
            L22:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r0 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER
                r4.monitoringLogger = r0
            L26:
                return
        }

        @Override // com.google.crypto.tink.PublicKeyVerify
        public void verify(byte[] r11, byte[] r12) throws java.security.GeneralSecurityException {
                r10 = this;
                int r0 = r11.length
                r1 = 5
                if (r0 <= r1) goto La7
                byte[] r0 = java.util.Arrays.copyOf(r11, r1)
                int r2 = r11.length
                byte[] r1 = java.util.Arrays.copyOfRange(r11, r1, r2)
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeyVerify> r2 = r10.primitives
                java.util.List r2 = r2.getPrimitive(r0)
                java.util.Iterator r3 = r2.iterator()
            L17:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L6d
                java.lang.Object r4 = r3.next()
                com.google.crypto.tink.PrimitiveSet$Entry r4 = (com.google.crypto.tink.PrimitiveSet.Entry) r4
                r5 = r12
                com.google.crypto.tink.proto.OutputPrefixType r6 = r4.getOutputPrefixType()
                com.google.crypto.tink.proto.OutputPrefixType r7 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY
                boolean r6 = r6.equals(r7)
                if (r6 == 0) goto L3c
                byte[] r6 = com.google.crypto.tink.signature.PublicKeyVerifyWrapper.access$000()
                byte[][] r6 = new byte[][]{r5, r6}
                byte[] r5 = com.google.crypto.tink.subtle.Bytes.concat(r6)
            L3c:
                java.lang.Object r6 = r4.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L51
                com.google.crypto.tink.PublicKeyVerify r6 = (com.google.crypto.tink.PublicKeyVerify) r6     // Catch: java.security.GeneralSecurityException -> L51
                r6.verify(r1, r5)     // Catch: java.security.GeneralSecurityException -> L51
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r6 = r10.monitoringLogger     // Catch: java.security.GeneralSecurityException -> L51
                int r7 = r4.getKeyId()     // Catch: java.security.GeneralSecurityException -> L51
                int r8 = r5.length     // Catch: java.security.GeneralSecurityException -> L51
                long r8 = (long) r8     // Catch: java.security.GeneralSecurityException -> L51
                r6.log(r7, r8)     // Catch: java.security.GeneralSecurityException -> L51
                return
            L51:
                r6 = move-exception
                java.util.logging.Logger r7 = com.google.crypto.tink.signature.PublicKeyVerifyWrapper.access$100()
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "signature prefix matches a key, but cannot verify: "
                java.lang.StringBuilder r8 = r8.append(r9)
                java.lang.StringBuilder r8 = r8.append(r6)
                java.lang.String r8 = r8.toString()
                r7.info(r8)
                goto L17
            L6d:
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeyVerify> r3 = r10.primitives
                java.util.List r2 = r3.getRawPrimitives()
                java.util.Iterator r3 = r2.iterator()
            L77:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L9a
                java.lang.Object r4 = r3.next()
                com.google.crypto.tink.PrimitiveSet$Entry r4 = (com.google.crypto.tink.PrimitiveSet.Entry) r4
                java.lang.Object r5 = r4.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L98
                com.google.crypto.tink.PublicKeyVerify r5 = (com.google.crypto.tink.PublicKeyVerify) r5     // Catch: java.security.GeneralSecurityException -> L98
                r5.verify(r11, r12)     // Catch: java.security.GeneralSecurityException -> L98
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r5 = r10.monitoringLogger     // Catch: java.security.GeneralSecurityException -> L98
                int r6 = r4.getKeyId()     // Catch: java.security.GeneralSecurityException -> L98
                int r7 = r12.length     // Catch: java.security.GeneralSecurityException -> L98
                long r7 = (long) r7     // Catch: java.security.GeneralSecurityException -> L98
                r5.log(r6, r7)     // Catch: java.security.GeneralSecurityException -> L98
                return
            L98:
                r5 = move-exception
                goto L77
            L9a:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r3 = r10.monitoringLogger
                r3.logFailure()
                java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
                java.lang.String r4 = "invalid signature"
                r3.<init>(r4)
                throw r3
            La7:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r0 = r10.monitoringLogger
                r0.logFailure()
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "signature too short"
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            java.lang.Class<com.google.crypto.tink.signature.PublicKeyVerifyWrapper> r0 = com.google.crypto.tink.signature.PublicKeyVerifyWrapper.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.crypto.tink.signature.PublicKeyVerifyWrapper.logger = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 0
            r0[r1] = r1
            com.google.crypto.tink.signature.PublicKeyVerifyWrapper.FORMAT_VERSION = r0
            com.google.crypto.tink.signature.PublicKeyVerifyWrapper r0 = new com.google.crypto.tink.signature.PublicKeyVerifyWrapper
            r0.<init>()
            com.google.crypto.tink.signature.PublicKeyVerifyWrapper.WRAPPER = r0
            return
    }

    PublicKeyVerifyWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ byte[] access$000() {
            byte[] r0 = com.google.crypto.tink.signature.PublicKeyVerifyWrapper.FORMAT_VERSION
            return r0
    }

    static /* synthetic */ java.util.logging.Logger access$100() {
            java.util.logging.Logger r0 = com.google.crypto.tink.signature.PublicKeyVerifyWrapper.logger
            return r0
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.PublicKeyVerifyWrapper r0 = com.google.crypto.tink.signature.PublicKeyVerifyWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.PublicKeyVerify> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.PublicKeyVerify> r0 = com.google.crypto.tink.PublicKeyVerify.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.PublicKeyVerify> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.PublicKeyVerify> r0 = com.google.crypto.tink.PublicKeyVerify.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.PublicKeyVerify wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeyVerify> r2) {
            r1 = this;
            com.google.crypto.tink.signature.PublicKeyVerifyWrapper$WrappedPublicKeyVerify r0 = new com.google.crypto.tink.signature.PublicKeyVerifyWrapper$WrappedPublicKeyVerify
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.PublicKeyVerify wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeyVerify> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.PublicKeyVerify r1 = r0.wrap(r1)
            return r1
    }
}
