package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes.dex */
public final class MutableMonitoringRegistry {
    private static final com.google.crypto.tink.internal.MutableMonitoringRegistry.DoNothingClient DO_NOTHING_CLIENT = null;
    private static final com.google.crypto.tink.internal.MutableMonitoringRegistry GLOBAL_INSTANCE = null;
    private final java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.monitoring.MonitoringClient> monitoringClient;

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.MutableMonitoringRegistry$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class DoNothingClient implements com.google.crypto.tink.monitoring.MonitoringClient {
        private DoNothingClient() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ DoNothingClient(com.google.crypto.tink.internal.MutableMonitoringRegistry.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.monitoring.MonitoringClient
        public com.google.crypto.tink.monitoring.MonitoringClient.Logger createLogger(com.google.crypto.tink.monitoring.MonitoringKeysetInfo r2, java.lang.String r3, java.lang.String r4) {
                r1 = this;
                com.google.crypto.tink.monitoring.MonitoringClient$Logger r0 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER
                return r0
        }
    }

    static {
            com.google.crypto.tink.internal.MutableMonitoringRegistry r0 = new com.google.crypto.tink.internal.MutableMonitoringRegistry
            r0.<init>()
            com.google.crypto.tink.internal.MutableMonitoringRegistry.GLOBAL_INSTANCE = r0
            com.google.crypto.tink.internal.MutableMonitoringRegistry$DoNothingClient r0 = new com.google.crypto.tink.internal.MutableMonitoringRegistry$DoNothingClient
            r1 = 0
            r0.<init>(r1)
            com.google.crypto.tink.internal.MutableMonitoringRegistry.DO_NOTHING_CLIENT = r0
            return
    }

    public MutableMonitoringRegistry() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.monitoringClient = r0
            return
    }

    public static com.google.crypto.tink.internal.MutableMonitoringRegistry globalInstance() {
            com.google.crypto.tink.internal.MutableMonitoringRegistry r0 = com.google.crypto.tink.internal.MutableMonitoringRegistry.GLOBAL_INSTANCE
            return r0
    }

    public synchronized void clear() {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.monitoring.MonitoringClient> r0 = r2.monitoringClient     // Catch: java.lang.Throwable -> L9
            r1 = 0
            r0.set(r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public com.google.crypto.tink.monitoring.MonitoringClient getMonitoringClient() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.monitoring.MonitoringClient> r0 = r2.monitoringClient
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.monitoring.MonitoringClient r0 = (com.google.crypto.tink.monitoring.MonitoringClient) r0
            if (r0 != 0) goto Ld
            com.google.crypto.tink.internal.MutableMonitoringRegistry$DoNothingClient r1 = com.google.crypto.tink.internal.MutableMonitoringRegistry.DO_NOTHING_CLIENT
            return r1
        Ld:
            return r0
    }

    public synchronized void registerMonitoringClient(com.google.crypto.tink.monitoring.MonitoringClient r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.monitoring.MonitoringClient> r0 = r2.monitoringClient     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L10
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.monitoring.MonitoringClient> r0 = r2.monitoringClient     // Catch: java.lang.Throwable -> L18
            r0.set(r3)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            return
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "a monitoring client has already been registered"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r0     // Catch: java.lang.Throwable -> L18
        L18:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r3
    }
}
