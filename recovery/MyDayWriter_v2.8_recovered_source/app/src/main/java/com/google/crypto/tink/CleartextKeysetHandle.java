package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public final class CleartextKeysetHandle {
    private CleartextKeysetHandle() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.KeysetHandle fromKeyset(com.google.crypto.tink.proto.Keyset r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.KeysetHandle r0 = com.google.crypto.tink.KeysetHandle.fromKeyset(r1)
            return r0
    }

    public static com.google.crypto.tink.proto.Keyset getKeyset(com.google.crypto.tink.KeysetHandle r1) {
            com.google.crypto.tink.proto.Keyset r0 = r1.getKeyset()
            return r0
    }

    @java.lang.Deprecated
    public static final com.google.crypto.tink.KeysetHandle parseFrom(byte[] r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Ld
            com.google.crypto.tink.proto.Keyset r0 = com.google.crypto.tink.proto.Keyset.parseFrom(r3, r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Ld
            com.google.crypto.tink.KeysetHandle r1 = com.google.crypto.tink.KeysetHandle.fromKeyset(r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Ld
            return r1
        Ld:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "invalid keyset"
            r1.<init>(r2)
            throw r1
    }

    public static com.google.crypto.tink.KeysetHandle read(com.google.crypto.tink.KeysetReader r1) throws java.security.GeneralSecurityException, java.io.IOException {
            com.google.crypto.tink.proto.Keyset r0 = r1.read()
            com.google.crypto.tink.KeysetHandle r0 = com.google.crypto.tink.KeysetHandle.fromKeyset(r0)
            return r0
    }

    public static com.google.crypto.tink.KeysetHandle read(com.google.crypto.tink.KeysetReader r2, java.util.Map<java.lang.String, java.lang.String> r3) throws java.security.GeneralSecurityException, java.io.IOException {
            com.google.crypto.tink.proto.Keyset r0 = r2.read()
            com.google.crypto.tink.monitoring.MonitoringAnnotations$Builder r1 = com.google.crypto.tink.monitoring.MonitoringAnnotations.newBuilder()
            com.google.crypto.tink.monitoring.MonitoringAnnotations$Builder r1 = r1.addAll(r3)
            com.google.crypto.tink.monitoring.MonitoringAnnotations r1 = r1.build()
            com.google.crypto.tink.KeysetHandle r0 = com.google.crypto.tink.KeysetHandle.fromKeysetAndAnnotations(r0, r1)
            return r0
    }

    public static void write(com.google.crypto.tink.KeysetHandle r1, com.google.crypto.tink.KeysetWriter r2) throws java.io.IOException {
            com.google.crypto.tink.proto.Keyset r0 = r1.getKeyset()
            r2.write(r0)
            return
    }
}
