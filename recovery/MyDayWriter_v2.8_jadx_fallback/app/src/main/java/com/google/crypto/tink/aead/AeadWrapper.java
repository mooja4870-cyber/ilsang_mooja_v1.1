package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes.dex */
public class AeadWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.Aead, com.google.crypto.tink.Aead> {
    private static final com.google.crypto.tink.aead.AeadWrapper WRAPPER = null;
    private static final java.util.logging.Logger logger = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.aead.AeadWrapper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class WrappedAead implements com.google.crypto.tink.Aead {
        private final com.google.crypto.tink.monitoring.MonitoringClient.Logger decLogger;
        private final com.google.crypto.tink.monitoring.MonitoringClient.Logger encLogger;
        private final com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Aead> pSet;

        private WrappedAead(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Aead> r5) {
                r4 = this;
                r4.<init>()
                r4.pSet = r5
                boolean r0 = r5.hasAnnotations()
                if (r0 == 0) goto L2a
                com.google.crypto.tink.internal.MutableMonitoringRegistry r0 = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance()
                com.google.crypto.tink.monitoring.MonitoringClient r0 = r0.getMonitoringClient()
                com.google.crypto.tink.monitoring.MonitoringKeysetInfo r1 = com.google.crypto.tink.internal.MonitoringUtil.getMonitoringKeysetInfo(r5)
                java.lang.String r2 = "encrypt"
                java.lang.String r3 = "aead"
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r2 = r0.createLogger(r1, r3, r2)
                r4.encLogger = r2
                java.lang.String r2 = "decrypt"
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r2 = r0.createLogger(r1, r3, r2)
                r4.decLogger = r2
                goto L32
            L2a:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r0 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER
                r4.encLogger = r0
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r0 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER
                r4.decLogger = r0
            L32:
                return
        }

        /* synthetic */ WrappedAead(com.google.crypto.tink.PrimitiveSet r1, com.google.crypto.tink.aead.AeadWrapper.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.crypto.tink.Aead
        public byte[] decrypt(byte[] r11, byte[] r12) throws java.security.GeneralSecurityException {
                r10 = this;
                int r0 = r11.length
                r1 = 5
                if (r0 <= r1) goto L55
                byte[] r0 = java.util.Arrays.copyOf(r11, r1)
                int r2 = r11.length
                byte[] r1 = java.util.Arrays.copyOfRange(r11, r1, r2)
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Aead> r2 = r10.pSet
                java.util.List r2 = r2.getPrimitive(r0)
                java.util.Iterator r3 = r2.iterator()
            L17:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L55
                java.lang.Object r4 = r3.next()
                com.google.crypto.tink.PrimitiveSet$Entry r4 = (com.google.crypto.tink.PrimitiveSet.Entry) r4
                java.lang.Object r5 = r4.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L39
                com.google.crypto.tink.Aead r5 = (com.google.crypto.tink.Aead) r5     // Catch: java.security.GeneralSecurityException -> L39
                byte[] r5 = r5.decrypt(r1, r12)     // Catch: java.security.GeneralSecurityException -> L39
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r6 = r10.decLogger     // Catch: java.security.GeneralSecurityException -> L39
                int r7 = r4.getKeyId()     // Catch: java.security.GeneralSecurityException -> L39
                int r8 = r1.length     // Catch: java.security.GeneralSecurityException -> L39
                long r8 = (long) r8     // Catch: java.security.GeneralSecurityException -> L39
                r6.log(r7, r8)     // Catch: java.security.GeneralSecurityException -> L39
                return r5
            L39:
                r5 = move-exception
                java.util.logging.Logger r6 = com.google.crypto.tink.aead.AeadWrapper.access$000()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "ciphertext prefix matches a key, but cannot decrypt: "
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.StringBuilder r7 = r7.append(r5)
                java.lang.String r7 = r7.toString()
                r6.info(r7)
                goto L17
            L55:
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Aead> r0 = r10.pSet
                java.util.List r0 = r0.getRawPrimitives()
                java.util.Iterator r1 = r0.iterator()
            L5f:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L83
                java.lang.Object r2 = r1.next()
                com.google.crypto.tink.PrimitiveSet$Entry r2 = (com.google.crypto.tink.PrimitiveSet.Entry) r2
                java.lang.Object r3 = r2.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L81
                com.google.crypto.tink.Aead r3 = (com.google.crypto.tink.Aead) r3     // Catch: java.security.GeneralSecurityException -> L81
                byte[] r3 = r3.decrypt(r11, r12)     // Catch: java.security.GeneralSecurityException -> L81
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r4 = r10.decLogger     // Catch: java.security.GeneralSecurityException -> L81
                int r5 = r2.getKeyId()     // Catch: java.security.GeneralSecurityException -> L81
                int r6 = r11.length     // Catch: java.security.GeneralSecurityException -> L81
                long r6 = (long) r6     // Catch: java.security.GeneralSecurityException -> L81
                r4.log(r5, r6)     // Catch: java.security.GeneralSecurityException -> L81
                return r3
            L81:
                r3 = move-exception
                goto L5f
            L83:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r1 = r10.decLogger
                r1.logFailure()
                java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
                java.lang.String r2 = "decryption failed"
                r1.<init>(r2)
                throw r1
        }

        @Override // com.google.crypto.tink.Aead
        public byte[] encrypt(byte[] r6, byte[] r7) throws java.security.GeneralSecurityException {
                r5 = this;
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Aead> r0 = r5.pSet     // Catch: java.security.GeneralSecurityException -> L34
                com.google.crypto.tink.PrimitiveSet$Entry r0 = r0.getPrimary()     // Catch: java.security.GeneralSecurityException -> L34
                byte[] r0 = r0.getIdentifier()     // Catch: java.security.GeneralSecurityException -> L34
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Aead> r1 = r5.pSet     // Catch: java.security.GeneralSecurityException -> L34
                com.google.crypto.tink.PrimitiveSet$Entry r1 = r1.getPrimary()     // Catch: java.security.GeneralSecurityException -> L34
                java.lang.Object r1 = r1.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L34
                com.google.crypto.tink.Aead r1 = (com.google.crypto.tink.Aead) r1     // Catch: java.security.GeneralSecurityException -> L34
                byte[] r1 = r1.encrypt(r6, r7)     // Catch: java.security.GeneralSecurityException -> L34
                byte[][] r0 = new byte[][]{r0, r1}     // Catch: java.security.GeneralSecurityException -> L34
                byte[] r0 = com.google.crypto.tink.subtle.Bytes.concat(r0)     // Catch: java.security.GeneralSecurityException -> L34
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r1 = r5.encLogger     // Catch: java.security.GeneralSecurityException -> L34
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Aead> r2 = r5.pSet     // Catch: java.security.GeneralSecurityException -> L34
                com.google.crypto.tink.PrimitiveSet$Entry r2 = r2.getPrimary()     // Catch: java.security.GeneralSecurityException -> L34
                int r2 = r2.getKeyId()     // Catch: java.security.GeneralSecurityException -> L34
                int r3 = r6.length     // Catch: java.security.GeneralSecurityException -> L34
                long r3 = (long) r3     // Catch: java.security.GeneralSecurityException -> L34
                r1.log(r2, r3)     // Catch: java.security.GeneralSecurityException -> L34
                return r0
            L34:
                r0 = move-exception
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r1 = r5.encLogger
                r1.logFailure()
                throw r0
        }
    }

    static {
            java.lang.Class<com.google.crypto.tink.aead.AeadWrapper> r0 = com.google.crypto.tink.aead.AeadWrapper.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.crypto.tink.aead.AeadWrapper.logger = r0
            com.google.crypto.tink.aead.AeadWrapper r0 = new com.google.crypto.tink.aead.AeadWrapper
            r0.<init>()
            com.google.crypto.tink.aead.AeadWrapper.WRAPPER = r0
            return
    }

    AeadWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.util.logging.Logger access$000() {
            java.util.logging.Logger r0 = com.google.crypto.tink.aead.AeadWrapper.logger
            return r0
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.aead.AeadWrapper r0 = com.google.crypto.tink.aead.AeadWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.Aead> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.Aead> r0 = com.google.crypto.tink.Aead.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.Aead> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.Aead> r0 = com.google.crypto.tink.Aead.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.Aead wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Aead> r3) throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.aead.AeadWrapper$WrappedAead r0 = new com.google.crypto.tink.aead.AeadWrapper$WrappedAead
            r1 = 0
            r0.<init>(r3, r1)
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.Aead wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Aead> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.Aead r1 = r0.wrap(r1)
            return r1
    }
}
