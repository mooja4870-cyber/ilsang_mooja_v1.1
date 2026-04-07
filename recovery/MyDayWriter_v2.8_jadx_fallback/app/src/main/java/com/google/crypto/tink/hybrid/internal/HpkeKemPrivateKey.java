package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
interface HpkeKemPrivateKey {
    com.google.crypto.tink.util.Bytes getSerializedPrivate();

    com.google.crypto.tink.util.Bytes getSerializedPublic();
}
