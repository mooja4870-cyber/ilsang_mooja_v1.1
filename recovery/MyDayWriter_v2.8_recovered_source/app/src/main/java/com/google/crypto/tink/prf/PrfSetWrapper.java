package com.google.crypto.tink.prf;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public class PrfSetWrapper implements com.google.crypto.tink.PrimitiveWrapper<com.google.crypto.tink.prf.Prf, com.google.crypto.tink.prf.PrfSet> {
    private static final com.google.crypto.tink.prf.PrfSetWrapper WRAPPER = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.prf.PrfSetWrapper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class WrappedPrfSet extends com.google.crypto.tink.prf.PrfSet {
        private final java.util.Map<java.lang.Integer, com.google.crypto.tink.prf.Prf> keyIdToPrfMap;
        private final int primaryKeyId;

        @com.google.errorprone.annotations.Immutable
        private static class PrfWithMonitoring implements com.google.crypto.tink.prf.Prf {
            private final int keyId;
            private final com.google.crypto.tink.monitoring.MonitoringClient.Logger logger;
            private final com.google.crypto.tink.prf.Prf prf;

            public PrfWithMonitoring(com.google.crypto.tink.prf.Prf r1, int r2, com.google.crypto.tink.monitoring.MonitoringClient.Logger r3) {
                    r0 = this;
                    r0.<init>()
                    r0.prf = r1
                    r0.keyId = r2
                    r0.logger = r3
                    return
            }

            @Override // com.google.crypto.tink.prf.Prf
            public byte[] compute(byte[] r6, int r7) throws java.security.GeneralSecurityException {
                    r5 = this;
                    com.google.crypto.tink.prf.Prf r0 = r5.prf     // Catch: java.security.GeneralSecurityException -> L10
                    byte[] r0 = r0.compute(r6, r7)     // Catch: java.security.GeneralSecurityException -> L10
                    com.google.crypto.tink.monitoring.MonitoringClient$Logger r1 = r5.logger     // Catch: java.security.GeneralSecurityException -> L10
                    int r2 = r5.keyId     // Catch: java.security.GeneralSecurityException -> L10
                    int r3 = r6.length     // Catch: java.security.GeneralSecurityException -> L10
                    long r3 = (long) r3     // Catch: java.security.GeneralSecurityException -> L10
                    r1.log(r2, r3)     // Catch: java.security.GeneralSecurityException -> L10
                    return r0
                L10:
                    r0 = move-exception
                    com.google.crypto.tink.monitoring.MonitoringClient$Logger r1 = r5.logger
                    r1.logFailure()
                    throw r0
            }
        }

        private WrappedPrfSet(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.prf.Prf> r10) throws java.security.GeneralSecurityException {
                r9 = this;
                r9.<init>()
                java.util.List r0 = r10.getRawPrimitives()
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto Lad
                com.google.crypto.tink.PrimitiveSet$Entry r0 = r10.getPrimary()
                if (r0 == 0) goto La5
                boolean r0 = r10.hasAnnotations()
                if (r0 == 0) goto L2e
                com.google.crypto.tink.internal.MutableMonitoringRegistry r0 = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance()
                com.google.crypto.tink.monitoring.MonitoringClient r0 = r0.getMonitoringClient()
                com.google.crypto.tink.monitoring.MonitoringKeysetInfo r1 = com.google.crypto.tink.internal.MonitoringUtil.getMonitoringKeysetInfo(r10)
                java.lang.String r2 = "prf"
                java.lang.String r3 = "compute"
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r0 = r0.createLogger(r1, r2, r3)
                goto L30
            L2e:
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r0 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER
            L30:
                com.google.crypto.tink.PrimitiveSet$Entry r1 = r10.getPrimary()
                int r1 = r1.getKeyId()
                r9.primaryKeyId = r1
                java.util.List r1 = r10.getRawPrimitives()
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                java.util.Iterator r3 = r1.iterator()
            L47:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L9e
                java.lang.Object r4 = r3.next()
                com.google.crypto.tink.PrimitiveSet$Entry r4 = (com.google.crypto.tink.PrimitiveSet.Entry) r4
                com.google.crypto.tink.proto.OutputPrefixType r5 = r4.getOutputPrefixType()
                com.google.crypto.tink.proto.OutputPrefixType r6 = com.google.crypto.tink.proto.OutputPrefixType.RAW
                boolean r5 = r5.equals(r6)
                if (r5 == 0) goto L7b
            L60:
                int r5 = r4.getKeyId()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                com.google.crypto.tink.prf.PrfSetWrapper$WrappedPrfSet$PrfWithMonitoring r6 = new com.google.crypto.tink.prf.PrfSetWrapper$WrappedPrfSet$PrfWithMonitoring
                java.lang.Object r7 = r4.getPrimitive()
                com.google.crypto.tink.prf.Prf r7 = (com.google.crypto.tink.prf.Prf) r7
                int r8 = r4.getKeyId()
                r6.<init>(r7, r8, r0)
                r2.put(r5, r6)
                goto L47
            L7b:
                java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Key "
                java.lang.StringBuilder r5 = r5.append(r6)
                int r6 = r4.getKeyId()
                java.lang.StringBuilder r5 = r5.append(r6)
                java.lang.String r6 = " has non raw prefix type"
                java.lang.StringBuilder r5 = r5.append(r6)
                java.lang.String r5 = r5.toString()
                r3.<init>(r5)
                throw r3
            L9e:
                java.util.Map r3 = java.util.Collections.unmodifiableMap(r2)
                r9.keyIdToPrfMap = r3
                return
            La5:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "Primary key not set."
                r0.<init>(r1)
                throw r0
            Lad:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "No primitives provided."
                r0.<init>(r1)
                throw r0
        }

        /* synthetic */ WrappedPrfSet(com.google.crypto.tink.PrimitiveSet r1, com.google.crypto.tink.prf.PrfSetWrapper.AnonymousClass1 r2) throws java.security.GeneralSecurityException {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.crypto.tink.prf.PrfSet
        public java.util.Map<java.lang.Integer, com.google.crypto.tink.prf.Prf> getPrfs() throws java.security.GeneralSecurityException {
                r1 = this;
                java.util.Map<java.lang.Integer, com.google.crypto.tink.prf.Prf> r0 = r1.keyIdToPrfMap
                return r0
        }

        @Override // com.google.crypto.tink.prf.PrfSet
        public int getPrimaryId() {
                r1 = this;
                int r0 = r1.primaryKeyId
                return r0
        }
    }

    static {
            com.google.crypto.tink.prf.PrfSetWrapper r0 = new com.google.crypto.tink.prf.PrfSetWrapper
            r0.<init>()
            com.google.crypto.tink.prf.PrfSetWrapper.WRAPPER = r0
            return
    }

    public PrfSetWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void register() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.prf.PrfSetWrapper r0 = com.google.crypto.tink.prf.PrfSetWrapper.WRAPPER
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r0)
            return
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.prf.Prf> getInputPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.prf.Prf> r0 = com.google.crypto.tink.prf.Prf.class
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.prf.PrfSet> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<com.google.crypto.tink.prf.PrfSet> r0 = com.google.crypto.tink.prf.PrfSet.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public com.google.crypto.tink.prf.PrfSet wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.prf.Prf> r3) throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.prf.PrfSetWrapper$WrappedPrfSet r0 = new com.google.crypto.tink.prf.PrfSetWrapper$WrappedPrfSet
            r1 = 0
            r0.<init>(r3, r1)
            return r0
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public /* bridge */ /* synthetic */ com.google.crypto.tink.prf.PrfSet wrap(com.google.crypto.tink.PrimitiveSet<com.google.crypto.tink.prf.Prf> r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.prf.PrfSet r1 = r0.wrap(r1)
            return r1
    }
}
