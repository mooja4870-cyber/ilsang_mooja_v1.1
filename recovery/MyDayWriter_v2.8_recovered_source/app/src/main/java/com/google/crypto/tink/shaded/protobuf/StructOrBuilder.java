package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface StructOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
    boolean containsFields(java.lang.String r1);

    @java.lang.Deprecated
    java.util.Map<java.lang.String, com.google.crypto.tink.shaded.protobuf.Value> getFields();

    int getFieldsCount();

    java.util.Map<java.lang.String, com.google.crypto.tink.shaded.protobuf.Value> getFieldsMap();

    com.google.crypto.tink.shaded.protobuf.Value getFieldsOrDefault(java.lang.String r1, com.google.crypto.tink.shaded.protobuf.Value r2);

    com.google.crypto.tink.shaded.protobuf.Value getFieldsOrThrow(java.lang.String r1);
}
