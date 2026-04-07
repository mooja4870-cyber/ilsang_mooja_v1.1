package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes.dex */
public final class MonitoringUtil {
    public static final com.google.crypto.tink.monitoring.MonitoringClient.Logger DO_NOTHING_LOGGER = null;
    private static final java.lang.String TYPE_URL_PREFIX = "type.googleapis.com/google.crypto.";

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.MonitoringUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyStatusType = null;

        static {
                com.google.crypto.tink.proto.KeyStatusType[] r0 = com.google.crypto.tink.proto.KeyStatusType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.internal.MonitoringUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType = r0
                int[] r0 = com.google.crypto.tink.internal.MonitoringUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.ENABLED     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.internal.MonitoringUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.DISABLED     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.internal.MonitoringUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.DESTROYED     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                return
        }
    }

    private static class DoNothingLogger implements com.google.crypto.tink.monitoring.MonitoringClient.Logger {
        private DoNothingLogger() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ DoNothingLogger(com.google.crypto.tink.internal.MonitoringUtil.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.monitoring.MonitoringClient.Logger
        public void log(int r1, long r2) {
                r0 = this;
                return
        }

        @Override // com.google.crypto.tink.monitoring.MonitoringClient.Logger
        public void logFailure() {
                r0 = this;
                return
        }
    }

    static {
            com.google.crypto.tink.internal.MonitoringUtil$DoNothingLogger r0 = new com.google.crypto.tink.internal.MonitoringUtil$DoNothingLogger
            r1 = 0
            r0.<init>(r1)
            com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER = r0
            return
    }

    private MonitoringUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <P> com.google.crypto.tink.monitoring.MonitoringKeysetInfo getMonitoringKeysetInfo(com.google.crypto.tink.PrimitiveSet<P> r9) {
            com.google.crypto.tink.monitoring.MonitoringKeysetInfo$Builder r0 = com.google.crypto.tink.monitoring.MonitoringKeysetInfo.newBuilder()
            com.google.crypto.tink.monitoring.MonitoringAnnotations r1 = r9.getAnnotations()
            r0.setAnnotations(r1)
            java.util.Collection r1 = r9.getAll()
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L51
            java.lang.Object r2 = r1.next()
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r3 = r2.iterator()
        L23:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L50
            java.lang.Object r4 = r3.next()
            com.google.crypto.tink.PrimitiveSet$Entry r4 = (com.google.crypto.tink.PrimitiveSet.Entry) r4
            com.google.crypto.tink.proto.KeyStatusType r5 = r4.getStatus()
            com.google.crypto.tink.KeyStatus r5 = parseStatus(r5)
            int r6 = r4.getKeyId()
            java.lang.String r7 = r4.getKeyType()
            java.lang.String r7 = parseKeyTypeUrl(r7)
            com.google.crypto.tink.proto.OutputPrefixType r8 = r4.getOutputPrefixType()
            java.lang.String r8 = r8.name()
            r0.addEntry(r5, r6, r7, r8)
            goto L23
        L50:
            goto L13
        L51:
            com.google.crypto.tink.PrimitiveSet$Entry r1 = r9.getPrimary()
            if (r1 == 0) goto L62
            com.google.crypto.tink.PrimitiveSet$Entry r2 = r9.getPrimary()
            int r2 = r2.getKeyId()
            r0.setPrimaryKeyId(r2)
        L62:
            com.google.crypto.tink.monitoring.MonitoringKeysetInfo r2 = r0.build()     // Catch: java.security.GeneralSecurityException -> L67
            return r2
        L67:
            r2 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r2)
            throw r3
    }

    private static java.lang.String parseKeyTypeUrl(java.lang.String r2) {
            java.lang.String r0 = "type.googleapis.com/google.crypto."
            boolean r1 = r2.startsWith(r0)
            if (r1 != 0) goto L9
            return r2
        L9:
            int r0 = r0.length()
            java.lang.String r0 = r2.substring(r0)
            return r0
    }

    private static com.google.crypto.tink.KeyStatus parseStatus(com.google.crypto.tink.proto.KeyStatusType r2) {
            int[] r0 = com.google.crypto.tink.internal.MonitoringUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L19;
                case 2: goto L16;
                case 3: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown key status"
            r0.<init>(r1)
            throw r0
        L13:
            com.google.crypto.tink.KeyStatus r0 = com.google.crypto.tink.KeyStatus.DESTROYED
            return r0
        L16:
            com.google.crypto.tink.KeyStatus r0 = com.google.crypto.tink.KeyStatus.DISABLED
            return r0
        L19:
            com.google.crypto.tink.KeyStatus r0 = com.google.crypto.tink.KeyStatus.ENABLED
            return r0
    }
}
