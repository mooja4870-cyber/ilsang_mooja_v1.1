package com.google.crypto.tink.monitoring;

/* JADX INFO: loaded from: classes.dex */
public interface MonitoringClient {

    public interface Logger {
        void log(int r1, long r2);

        void logFailure();
    }

    com.google.crypto.tink.monitoring.MonitoringClient.Logger createLogger(com.google.crypto.tink.monitoring.MonitoringKeysetInfo r1, java.lang.String r2, java.lang.String r3);
}
