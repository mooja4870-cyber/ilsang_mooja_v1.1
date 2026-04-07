package com.google.crypto.tink.tinkkey.internal;

/* JADX INFO: loaded from: classes.dex */
public final class InternalKeyHandle extends com.google.crypto.tink.tinkkey.KeyHandle {
    public InternalKeyHandle(com.google.crypto.tink.tinkkey.TinkKey r2, com.google.crypto.tink.proto.KeyStatusType r3, int r4) {
            r1 = this;
            com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r0 = com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.fromProto(r3)
            r1.<init>(r2, r0, r4)
            return
    }
}
