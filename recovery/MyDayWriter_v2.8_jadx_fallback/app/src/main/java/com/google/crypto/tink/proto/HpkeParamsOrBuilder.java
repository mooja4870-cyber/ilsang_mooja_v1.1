package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface HpkeParamsOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.HpkeAead getAead();

    int getAeadValue();

    com.google.crypto.tink.proto.HpkeKdf getKdf();

    int getKdfValue();

    com.google.crypto.tink.proto.HpkeKem getKem();

    int getKemValue();
}
