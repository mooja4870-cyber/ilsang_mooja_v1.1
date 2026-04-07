package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public interface KmsEnvelopeAeadKeyFormatOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    com.google.crypto.tink.proto.KeyTemplate getDekTemplate();

    java.lang.String getKekUri();

    com.google.crypto.tink.shaded.protobuf.ByteString getKekUriBytes();

    boolean hasDekTemplate();
}
