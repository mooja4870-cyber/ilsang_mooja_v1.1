package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes.dex */
public class PublicKeySignWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.PublicKeySign, com.google.crypto.tink.PublicKeySign> {
    private static final byte[] FORMAT_VERSION = null;
    private static final com.google.crypto.tink.signature.PublicKeySignWrapper WRAPPER = null;

    private static class WrappedPublicKeySign implements com.google.crypto.tink.PublicKeySign {
        private final com.google.crypto.tink.monitoring.MonitoringClient.Logger logger;
        private final com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeySign> primitives;

        public WrappedPublicKeySign(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeySign> r5) {
                r4 = this;
                r4.<init>()
                r4.primitives = r5
                boolean r0 = r5.hasAnnotations()
                if (r0 == 0) goto L22
                com.google.crypto.tink.internal.MutableMonitoringRegistry r0 = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance()
                com.google.crypto.tink.monitoring.MonitoringClient r0 = r0.getMonitoringClient()
                com.google.crypto.tink.monitoring.MonitoringKeysetInfo r1 = com.google.crypto.tink.internal.MonitoringUtil.getMonitoringKeysetInfo(r5)
                java.lang.String r2 = "public_key_sign"
                java.lang.String r3 = "sign"
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r2 = r0.createLogger(r1, r2, r3)
                r4.logger = r2
                goto L26
            L22:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r0 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER
                r4.logger = r0
            L26:
                return
        }

        @Override // com.google.crypto.tink.PublicKeySign
        public byte[] sign(byte[] r7) throws java.security.GeneralSecurityException {
                r6 = this;
                r0 = r7
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeySign> r1 = r6.primitives
                com.google.crypto.tink.PrimitiveSet$Entry r1 = r1.getPrimary()
                com.google.crypto.tink.proto.OutputPrefixType r1 = r1.getOutputPrefixType()
                com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L1f
                byte[] r1 = com.google.crypto.tink.signature.PublicKeySignWrapper.access$000()
                byte[][] r1 = new byte[][]{r7, r1}
                byte[] r0 = com.google.crypto.tink.subtle.Bytes.concat(r1)
            L1f:
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeySign> r1 = r6.primitives     // Catch: java.security.GeneralSecurityException -> L53
                com.google.crypto.tink.PrimitiveSet$Entry r1 = r1.getPrimary()     // Catch: java.security.GeneralSecurityException -> L53
                byte[] r1 = r1.getIdentifier()     // Catch: java.security.GeneralSecurityException -> L53
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeySign> r2 = r6.primitives     // Catch: java.security.GeneralSecurityException -> L53
                com.google.crypto.tink.PrimitiveSet$Entry r2 = r2.getPrimary()     // Catch: java.security.GeneralSecurityException -> L53
                java.lang.Object r2 = r2.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L53
                com.google.crypto.tink.PublicKeySign r2 = (com.google.crypto.tink.PublicKeySign) r2     // Catch: java.security.GeneralSecurityException -> L53
                byte[] r2 = r2.sign(r0)     // Catch: java.security.GeneralSecurityException -> L53
                byte[][] r1 = new byte[][]{r1, r2}     // Catch: java.security.GeneralSecurityException -> L53
                byte[] r1 = com.google.crypto.tink.subtle.Bytes.concat(r1)     // Catch: java.security.GeneralSecurityException -> L53
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r2 = r6.logger     // Catch: java.security.GeneralSecurityException -> L53
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeySign> r3 = r6.primitives     // Catch: java.security.GeneralSecurityException -> L53
                com.google.crypto.tink.PrimitiveSet$Entry r3 = r3.getPrimary()     // Catch: java.security.GeneralSecurityException -> L53
                int r3 = r3.getKeyId()     // Catch: java.security.GeneralSecurityException -> L53
                int r4 = r0.length     // Catch: java.security.GeneralSecurityException -> L53
                long r4 = (long) r4     // Catch: java.security.GeneralSecurityException -> L53
                r2.log(r3, r4)     // Catch: java.security.GeneralSecurityException -> L53
                return r1
            L53:
                r1 = move-exception
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r2 = r6.logger
                r2.logFailure()
                throw r1
        }
    }

    static {
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 0
            r0[r1] = r1
            com.google.crypto.tink.signature.PublicKeySignWrapper.FORMAT_VERSION = r0
            com.google.crypto.tink.signature.PublicKeySignWrapper r0 = new com.google.crypto.tink.signature.PublicKeySignWrapper
            r0.<init>()
            com.google.crypto.tink.signature.PublicKeySignWrapper.WRAPPER = r0
            return
    }

    PublicKeySignWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ byte[] access$000() {
            byte[] r0 = com.google.crypto.tink.signature.PublicKeySignWrapper.FORMAT_VERSION
            return r0
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.PublicKeySignWrapper r0 = com.google.crypto.tink.signature.PublicKeySignWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.PublicKeySign> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.PublicKeySign> r0 = com.google.crypto.tink.PublicKeySign.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.PublicKeySign> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.PublicKeySign> r0 = com.google.crypto.tink.PublicKeySign.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.PublicKeySign wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeySign> r2) {
            r1 = this;
            com.google.crypto.tink.signature.PublicKeySignWrapper$WrappedPublicKeySign r0 = new com.google.crypto.tink.signature.PublicKeySignWrapper$WrappedPublicKeySign
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.PublicKeySign wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.PublicKeySign> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.PublicKeySign r1 = r0.wrap(r1)
            return r1
    }
}
