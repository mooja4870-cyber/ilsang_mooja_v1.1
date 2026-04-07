package com.google.crypto.tink.hybrid;

/* JADX INFO: loaded from: classes.dex */
public class HybridEncryptWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.HybridEncrypt, com.google.crypto.tink.HybridEncrypt> {
    private static final com.google.crypto.tink.hybrid.HybridEncryptWrapper WRAPPER = null;

    private static class WrappedHybridEncrypt implements com.google.crypto.tink.HybridEncrypt {
        private final com.google.crypto.tink.monitoring.MonitoringClient.Logger encLogger;
        final com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.HybridEncrypt> primitives;

        public WrappedHybridEncrypt(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.HybridEncrypt> r5) {
                r4 = this;
                r4.<init>()
                r4.primitives = r5
                boolean r0 = r5.hasAnnotations()
                if (r0 == 0) goto L22
                com.google.crypto.tink.internal.MutableMonitoringRegistry r0 = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance()
                com.google.crypto.tink.monitoring.MonitoringClient r0 = r0.getMonitoringClient()
                com.google.crypto.tink.monitoring.MonitoringKeysetInfo r1 = com.google.crypto.tink.internal.MonitoringUtil.getMonitoringKeysetInfo(r5)
                java.lang.String r2 = "hybrid_encrypt"
                java.lang.String r3 = "encrypt"
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r2 = r0.createLogger(r1, r2, r3)
                r4.encLogger = r2
                goto L26
            L22:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r0 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER
                r4.encLogger = r0
            L26:
                return
        }

        @Override // com.google.crypto.tink.HybridEncrypt
        public byte[] encrypt(byte[] r6, byte[] r7) throws java.security.GeneralSecurityException {
                r5 = this;
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.HybridEncrypt> r0 = r5.primitives
                com.google.crypto.tink.PrimitiveSet$Entry r0 = r0.getPrimary()
                if (r0 == 0) goto L43
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.HybridEncrypt> r0 = r5.primitives     // Catch: java.security.GeneralSecurityException -> L3c
                com.google.crypto.tink.PrimitiveSet$Entry r0 = r0.getPrimary()     // Catch: java.security.GeneralSecurityException -> L3c
                byte[] r0 = r0.getIdentifier()     // Catch: java.security.GeneralSecurityException -> L3c
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.HybridEncrypt> r1 = r5.primitives     // Catch: java.security.GeneralSecurityException -> L3c
                com.google.crypto.tink.PrimitiveSet$Entry r1 = r1.getPrimary()     // Catch: java.security.GeneralSecurityException -> L3c
                java.lang.Object r1 = r1.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L3c
                com.google.crypto.tink.HybridEncrypt r1 = (com.google.crypto.tink.HybridEncrypt) r1     // Catch: java.security.GeneralSecurityException -> L3c
                byte[] r1 = r1.encrypt(r6, r7)     // Catch: java.security.GeneralSecurityException -> L3c
                byte[][] r0 = new byte[][]{r0, r1}     // Catch: java.security.GeneralSecurityException -> L3c
                byte[] r0 = com.google.crypto.tink.subtle.Bytes.concat(r0)     // Catch: java.security.GeneralSecurityException -> L3c
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r1 = r5.encLogger     // Catch: java.security.GeneralSecurityException -> L3c
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.HybridEncrypt> r2 = r5.primitives     // Catch: java.security.GeneralSecurityException -> L3c
                com.google.crypto.tink.PrimitiveSet$Entry r2 = r2.getPrimary()     // Catch: java.security.GeneralSecurityException -> L3c
                int r2 = r2.getKeyId()     // Catch: java.security.GeneralSecurityException -> L3c
                int r3 = r6.length     // Catch: java.security.GeneralSecurityException -> L3c
                long r3 = (long) r3     // Catch: java.security.GeneralSecurityException -> L3c
                r1.log(r2, r3)     // Catch: java.security.GeneralSecurityException -> L3c
                return r0
            L3c:
                r0 = move-exception
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r1 = r5.encLogger
                r1.logFailure()
                throw r0
            L43:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r0 = r5.encLogger
                r0.logFailure()
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "keyset without primary key"
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            com.google.crypto.tink.hybrid.HybridEncryptWrapper r0 = new com.google.crypto.tink.hybrid.HybridEncryptWrapper
            r0.<init>()
            com.google.crypto.tink.hybrid.HybridEncryptWrapper.WRAPPER = r0
            return
    }

    HybridEncryptWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.hybrid.HybridEncryptWrapper r0 = com.google.crypto.tink.hybrid.HybridEncryptWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.HybridEncrypt> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.HybridEncrypt> r0 = com.google.crypto.tink.HybridEncrypt.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.HybridEncrypt> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.HybridEncrypt> r0 = com.google.crypto.tink.HybridEncrypt.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.HybridEncrypt wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.HybridEncrypt> r2) {
            r1 = this;
            com.google.crypto.tink.hybrid.HybridEncryptWrapper$WrappedHybridEncrypt r0 = new com.google.crypto.tink.hybrid.HybridEncryptWrapper$WrappedHybridEncrypt
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.HybridEncrypt wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.HybridEncrypt> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.HybridEncrypt r1 = r0.wrap(r1)
            return r1
    }
}
