package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes.dex */
final class HpkeKemEncapOutput {
    private final byte[] encapsulatedKey;
    private final byte[] sharedSecret;

    HpkeKemEncapOutput(byte[] r1, byte[] r2) {
            r0 = this;
            r0.<init>()
            r0.sharedSecret = r1
            r0.encapsulatedKey = r2
            return
    }

    byte[] getEncapsulatedKey() {
            r1 = this;
            byte[] r0 = r1.encapsulatedKey
            return r0
    }

    byte[] getSharedSecret() {
            r1 = this;
            byte[] r0 = r1.sharedSecret
            return r0
    }
}
