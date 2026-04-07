package com.google.crypto.tink.hybrid;

/* JADX INFO: loaded from: classes.dex */
public class HybridDecryptWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.HybridDecrypt, com.google.crypto.tink.HybridDecrypt> {
    private static final com.google.crypto.tink.hybrid.HybridDecryptWrapper WRAPPER = null;
    private static final java.util.logging.Logger logger = null;

    private static class WrappedHybridDecrypt implements com.google.crypto.tink.HybridDecrypt {
        private final com.google.crypto.tink.monitoring.MonitoringClient.Logger decLogger;
        private final com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.HybridDecrypt> primitives;

        public WrappedHybridDecrypt(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.HybridDecrypt> r5) {
                r4 = this;
                r4.<init>()
                r4.primitives = r5
                boolean r0 = r5.hasAnnotations()
                if (r0 == 0) goto L22
                com.google.crypto.tink.internal.MutableMonitoringRegistry r0 = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance()
                com.google.crypto.tink.monitoring.MonitoringClient r0 = r0.getMonitoringClient()
                com.google.crypto.tink.monitoring.MonitoringKeysetInfo r1 = com.google.crypto.tink.internal.MonitoringUtil.getMonitoringKeysetInfo(r5)
                java.lang.String r2 = "hybrid_decrypt"
                java.lang.String r3 = "decrypt"
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r2 = r0.createLogger(r1, r2, r3)
                r4.decLogger = r2
                goto L26
            L22:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r0 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER
                r4.decLogger = r0
            L26:
                return
        }

        @Override // com.google.crypto.tink.HybridDecrypt
        public byte[] decrypt(byte[] r11, byte[] r12) throws java.security.GeneralSecurityException {
                r10 = this;
                int r0 = r11.length
                r1 = 5
                if (r0 <= r1) goto L5a
                r0 = 0
                byte[] r0 = java.util.Arrays.copyOfRange(r11, r0, r1)
                int r2 = r11.length
                byte[] r1 = java.util.Arrays.copyOfRange(r11, r1, r2)
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.HybridDecrypt> r2 = r10.primitives
                java.util.List r2 = r2.getPrimitive(r0)
                java.util.Iterator r3 = r2.iterator()
            L18:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L5a
                java.lang.Object r4 = r3.next()
                com.google.crypto.tink.PrimitiveSet$Entry r4 = (com.google.crypto.tink.PrimitiveSet.Entry) r4
                java.lang.Object r5 = r4.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L3a
                com.google.crypto.tink.HybridDecrypt r5 = (com.google.crypto.tink.HybridDecrypt) r5     // Catch: java.security.GeneralSecurityException -> L3a
                byte[] r5 = r5.decrypt(r1, r12)     // Catch: java.security.GeneralSecurityException -> L3a
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r6 = r10.decLogger     // Catch: java.security.GeneralSecurityException -> L3a
                int r7 = r4.getKeyId()     // Catch: java.security.GeneralSecurityException -> L3a
                int r8 = r1.length     // Catch: java.security.GeneralSecurityException -> L3a
                long r8 = (long) r8     // Catch: java.security.GeneralSecurityException -> L3a
                r6.log(r7, r8)     // Catch: java.security.GeneralSecurityException -> L3a
                return r5
            L3a:
                r5 = move-exception
                java.util.logging.Logger r6 = com.google.crypto.tink.hybrid.HybridDecryptWrapper.access$000()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "ciphertext prefix matches a key, but cannot decrypt: "
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.String r8 = r5.toString()
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.String r7 = r7.toString()
                r6.info(r7)
                goto L18
            L5a:
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.HybridDecrypt> r0 = r10.primitives
                java.util.List r0 = r0.getRawPrimitives()
                java.util.Iterator r1 = r0.iterator()
            L64:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L88
                java.lang.Object r2 = r1.next()
                com.google.crypto.tink.PrimitiveSet$Entry r2 = (com.google.crypto.tink.PrimitiveSet.Entry) r2
                java.lang.Object r3 = r2.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L86
                com.google.crypto.tink.HybridDecrypt r3 = (com.google.crypto.tink.HybridDecrypt) r3     // Catch: java.security.GeneralSecurityException -> L86
                byte[] r3 = r3.decrypt(r11, r12)     // Catch: java.security.GeneralSecurityException -> L86
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r4 = r10.decLogger     // Catch: java.security.GeneralSecurityException -> L86
                int r5 = r2.getKeyId()     // Catch: java.security.GeneralSecurityException -> L86
                int r6 = r11.length     // Catch: java.security.GeneralSecurityException -> L86
                long r6 = (long) r6     // Catch: java.security.GeneralSecurityException -> L86
                r4.log(r5, r6)     // Catch: java.security.GeneralSecurityException -> L86
                return r3
            L86:
                r3 = move-exception
                goto L64
            L88:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r1 = r10.decLogger
                r1.logFailure()
                java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
                java.lang.String r2 = "decryption failed"
                r1.<init>(r2)
                throw r1
        }
    }

    static {
            java.lang.Class<com.google.crypto.tink.hybrid.HybridDecryptWrapper> r0 = com.google.crypto.tink.hybrid.HybridDecryptWrapper.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.crypto.tink.hybrid.HybridDecryptWrapper.logger = r0
            com.google.crypto.tink.hybrid.HybridDecryptWrapper r0 = new com.google.crypto.tink.hybrid.HybridDecryptWrapper
            r0.<init>()
            com.google.crypto.tink.hybrid.HybridDecryptWrapper.WRAPPER = r0
            return
    }

    HybridDecryptWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.util.logging.Logger access$000() {
            java.util.logging.Logger r0 = com.google.crypto.tink.hybrid.HybridDecryptWrapper.logger
            return r0
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.hybrid.HybridDecryptWrapper r0 = com.google.crypto.tink.hybrid.HybridDecryptWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.HybridDecrypt> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.HybridDecrypt> r0 = com.google.crypto.tink.HybridDecrypt.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.HybridDecrypt> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.HybridDecrypt> r0 = com.google.crypto.tink.HybridDecrypt.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.HybridDecrypt wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.HybridDecrypt> r2) {
            r1 = this;
            com.google.crypto.tink.hybrid.HybridDecryptWrapper$WrappedHybridDecrypt r0 = new com.google.crypto.tink.hybrid.HybridDecryptWrapper$WrappedHybridDecrypt
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.HybridDecrypt wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.HybridDecrypt> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.HybridDecrypt r1 = r0.wrap(r1)
            return r1
    }
}
