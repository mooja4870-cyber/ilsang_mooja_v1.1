package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
interface MutabilityOracle {
    public static final com.google.crypto.tink.shaded.protobuf.MutabilityOracle IMMUTABLE = null;


    static {
            com.google.crypto.tink.shaded.protobuf.MutabilityOracle$1 r0 = new com.google.crypto.tink.shaded.protobuf.MutabilityOracle$1
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.MutabilityOracle.IMMUTABLE = r0
            return
    }

    void ensureMutable();
}
