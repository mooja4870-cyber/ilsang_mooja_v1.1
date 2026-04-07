package com.google.crypto.tink.mac;

/* JADX INFO: loaded from: classes.dex */
class MacWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.Mac, com.google.crypto.tink.Mac> {
    private static final byte[] FORMAT_VERSION = null;
    private static final com.google.crypto.tink.mac.MacWrapper WRAPPER = null;
    private static final java.util.logging.Logger logger = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.mac.MacWrapper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class WrappedMac implements com.google.crypto.tink.Mac {
        private final com.google.crypto.tink.monitoring.MonitoringClient.Logger computeLogger;
        private final com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> primitives;
        private final com.google.crypto.tink.monitoring.MonitoringClient.Logger verifyLogger;

        private WrappedMac(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> r5) {
                r4 = this;
                r4.<init>()
                r4.primitives = r5
                boolean r0 = r5.hasAnnotations()
                if (r0 == 0) goto L2a
                com.google.crypto.tink.internal.MutableMonitoringRegistry r0 = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance()
                com.google.crypto.tink.monitoring.MonitoringClient r0 = r0.getMonitoringClient()
                com.google.crypto.tink.monitoring.MonitoringKeysetInfo r1 = com.google.crypto.tink.internal.MonitoringUtil.getMonitoringKeysetInfo(r5)
                java.lang.String r2 = "compute"
                java.lang.String r3 = "mac"
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r2 = r0.createLogger(r1, r3, r2)
                r4.computeLogger = r2
                java.lang.String r2 = "verify"
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r2 = r0.createLogger(r1, r3, r2)
                r4.verifyLogger = r2
                goto L32
            L2a:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r0 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER
                r4.computeLogger = r0
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r0 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER
                r4.verifyLogger = r0
            L32:
                return
        }

        /* synthetic */ WrappedMac(com.google.crypto.tink.PrimitiveSet r1, com.google.crypto.tink.mac.MacWrapper.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.crypto.tink.Mac
        public byte[] computeMac(byte[] r7) throws java.security.GeneralSecurityException {
                r6 = this;
                r0 = r7
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> r1 = r6.primitives
                com.google.crypto.tink.PrimitiveSet$Entry r1 = r1.getPrimary()
                com.google.crypto.tink.proto.OutputPrefixType r1 = r1.getOutputPrefixType()
                com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L1f
                byte[] r1 = com.google.crypto.tink.mac.MacWrapper.access$000()
                byte[][] r1 = new byte[][]{r7, r1}
                byte[] r0 = com.google.crypto.tink.subtle.Bytes.concat(r1)
            L1f:
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> r1 = r6.primitives     // Catch: java.security.GeneralSecurityException -> L53
                com.google.crypto.tink.PrimitiveSet$Entry r1 = r1.getPrimary()     // Catch: java.security.GeneralSecurityException -> L53
                byte[] r1 = r1.getIdentifier()     // Catch: java.security.GeneralSecurityException -> L53
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> r2 = r6.primitives     // Catch: java.security.GeneralSecurityException -> L53
                com.google.crypto.tink.PrimitiveSet$Entry r2 = r2.getPrimary()     // Catch: java.security.GeneralSecurityException -> L53
                java.lang.Object r2 = r2.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L53
                com.google.crypto.tink.Mac r2 = (com.google.crypto.tink.Mac) r2     // Catch: java.security.GeneralSecurityException -> L53
                byte[] r2 = r2.computeMac(r0)     // Catch: java.security.GeneralSecurityException -> L53
                byte[][] r1 = new byte[][]{r1, r2}     // Catch: java.security.GeneralSecurityException -> L53
                byte[] r1 = com.google.crypto.tink.subtle.Bytes.concat(r1)     // Catch: java.security.GeneralSecurityException -> L53
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r2 = r6.computeLogger     // Catch: java.security.GeneralSecurityException -> L53
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> r3 = r6.primitives     // Catch: java.security.GeneralSecurityException -> L53
                com.google.crypto.tink.PrimitiveSet$Entry r3 = r3.getPrimary()     // Catch: java.security.GeneralSecurityException -> L53
                int r3 = r3.getKeyId()     // Catch: java.security.GeneralSecurityException -> L53
                int r4 = r0.length     // Catch: java.security.GeneralSecurityException -> L53
                long r4 = (long) r4     // Catch: java.security.GeneralSecurityException -> L53
                r2.log(r3, r4)     // Catch: java.security.GeneralSecurityException -> L53
                return r1
            L53:
                r1 = move-exception
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r2 = r6.computeLogger
                r2.logFailure()
                throw r1
        }

        @Override // com.google.crypto.tink.Mac
        public void verifyMac(byte[] r11, byte[] r12) throws java.security.GeneralSecurityException {
                r10 = this;
                int r0 = r11.length
                r1 = 5
                if (r0 <= r1) goto La7
                byte[] r0 = java.util.Arrays.copyOf(r11, r1)
                int r2 = r11.length
                byte[] r1 = java.util.Arrays.copyOfRange(r11, r1, r2)
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> r2 = r10.primitives
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
                byte[] r6 = com.google.crypto.tink.mac.MacWrapper.access$000()
                byte[][] r6 = new byte[][]{r12, r6}
                byte[] r5 = com.google.crypto.tink.subtle.Bytes.concat(r6)
            L3c:
                java.lang.Object r6 = r4.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L51
                com.google.crypto.tink.Mac r6 = (com.google.crypto.tink.Mac) r6     // Catch: java.security.GeneralSecurityException -> L51
                r6.verifyMac(r1, r5)     // Catch: java.security.GeneralSecurityException -> L51
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r6 = r10.verifyLogger     // Catch: java.security.GeneralSecurityException -> L51
                int r7 = r4.getKeyId()     // Catch: java.security.GeneralSecurityException -> L51
                int r8 = r5.length     // Catch: java.security.GeneralSecurityException -> L51
                long r8 = (long) r8     // Catch: java.security.GeneralSecurityException -> L51
                r6.log(r7, r8)     // Catch: java.security.GeneralSecurityException -> L51
                return
            L51:
                r6 = move-exception
                java.util.logging.Logger r7 = com.google.crypto.tink.mac.MacWrapper.access$100()
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "tag prefix matches a key, but cannot verify: "
                java.lang.StringBuilder r8 = r8.append(r9)
                java.lang.StringBuilder r8 = r8.append(r6)
                java.lang.String r8 = r8.toString()
                r7.info(r8)
                goto L17
            L6d:
                com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> r3 = r10.primitives
                java.util.List r2 = r3.getRawPrimitives()
                java.util.Iterator r3 = r2.iterator()
            L77:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L9a
                java.lang.Object r4 = r3.next()
                com.google.crypto.tink.PrimitiveSet$Entry r4 = (com.google.crypto.tink.PrimitiveSet.Entry) r4
                java.lang.Object r5 = r4.getPrimitive()     // Catch: java.security.GeneralSecurityException -> L98
                com.google.crypto.tink.Mac r5 = (com.google.crypto.tink.Mac) r5     // Catch: java.security.GeneralSecurityException -> L98
                r5.verifyMac(r11, r12)     // Catch: java.security.GeneralSecurityException -> L98
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r5 = r10.verifyLogger     // Catch: java.security.GeneralSecurityException -> L98
                int r6 = r4.getKeyId()     // Catch: java.security.GeneralSecurityException -> L98
                int r7 = r12.length     // Catch: java.security.GeneralSecurityException -> L98
                long r7 = (long) r7     // Catch: java.security.GeneralSecurityException -> L98
                r5.log(r6, r7)     // Catch: java.security.GeneralSecurityException -> L98
                return
            L98:
                r5 = move-exception
                goto L77
            L9a:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r3 = r10.verifyLogger
                r3.logFailure()
                java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
                java.lang.String r4 = "invalid MAC"
                r3.<init>(r4)
                throw r3
            La7:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r0 = r10.verifyLogger
                r0.logFailure()
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "tag too short"
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            java.lang.Class<com.google.crypto.tink.mac.MacWrapper> r0 = com.google.crypto.tink.mac.MacWrapper.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.crypto.tink.mac.MacWrapper.logger = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 0
            r0[r1] = r1
            com.google.crypto.tink.mac.MacWrapper.FORMAT_VERSION = r0
            com.google.crypto.tink.mac.MacWrapper r0 = new com.google.crypto.tink.mac.MacWrapper
            r0.<init>()
            com.google.crypto.tink.mac.MacWrapper.WRAPPER = r0
            return
    }

    MacWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ byte[] access$000() {
            byte[] r0 = com.google.crypto.tink.mac.MacWrapper.FORMAT_VERSION
            return r0
    }

    static /* synthetic */ java.util.logging.Logger access$100() {
            java.util.logging.Logger r0 = com.google.crypto.tink.mac.MacWrapper.logger
            return r0
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.mac.MacWrapper r0 = com.google.crypto.tink.mac.MacWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    private void validateMacKeyPrefixes(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> r8) throws java.security.GeneralSecurityException {
            r7 = this;
            java.util.Collection r0 = r8.getAll()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L82
            java.lang.Object r1 = r0.next()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r2 = r1.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L81
            java.lang.Object r3 = r2.next()
            com.google.crypto.tink.PrimitiveSet$Entry r3 = (com.google.crypto.tink.PrimitiveSet.Entry) r3
            com.google.crypto.tink.Key r4 = r3.getKey()
            boolean r4 = r4 instanceof com.google.crypto.tink.mac.MacKey
            if (r4 == 0) goto L80
            com.google.crypto.tink.Key r4 = r3.getKey()
            com.google.crypto.tink.mac.MacKey r4 = (com.google.crypto.tink.mac.MacKey) r4
            byte[] r5 = r3.getIdentifier()
            com.google.crypto.tink.util.Bytes r5 = com.google.crypto.tink.util.Bytes.copyFrom(r5)
            com.google.crypto.tink.util.Bytes r6 = r4.getOutputPrefix()
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L45
            goto L80
        L45:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Mac Key with parameters "
            java.lang.StringBuilder r2 = r2.append(r6)
            com.google.crypto.tink.mac.MacParameters r6 = r4.getParameters()
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r6 = " has wrong output prefix ("
            java.lang.StringBuilder r2 = r2.append(r6)
            com.google.crypto.tink.util.Bytes r6 = r4.getOutputPrefix()
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r6 = ") instead of ("
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r6 = ")"
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L80:
            goto L18
        L81:
            goto L8
        L82:
            return
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.Mac> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.Mac> r0 = com.google.crypto.tink.Mac.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.Mac> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.Mac> r0 = com.google.crypto.tink.Mac.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.Mac wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> r3) throws java.security.GeneralSecurityException {
            r2 = this;
            r2.validateMacKeyPrefixes(r3)
            com.google.crypto.tink.mac.MacWrapper$WrappedMac r0 = new com.google.crypto.tink.mac.MacWrapper$WrappedMac
            r1 = 0
            r0.<init>(r3, r1)
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.Mac wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.Mac> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.Mac r1 = r0.wrap(r1)
            return r1
    }
}
