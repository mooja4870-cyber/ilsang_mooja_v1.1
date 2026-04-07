package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface EciesAeadHkdfParamsOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.EciesAeadDemParams getDemParams();

    com.google.crypto.tink.proto.EcPointFormat getEcPointFormat();

    int getEcPointFormatValue();

    com.google.crypto.tink.proto.EciesHkdfKemParams getKemParams();

    boolean hasDemParams();

    boolean hasKemParams();
}
