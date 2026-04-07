package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
interface Reader {
    public static final int READ_DONE = Integer.MAX_VALUE;
    public static final int TAG_UNKNOWN = 0;

    int getFieldNumber() throws java.io.IOException;

    int getTag();

    <T> void mergeGroupField(T r1, com.google.crypto.tink.shaded.protobuf.Schema<T> r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException;

    <T> void mergeMessageField(T r1, com.google.crypto.tink.shaded.protobuf.Schema<T> r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException;

    boolean readBool() throws java.io.IOException;

    void readBoolList(java.util.List<java.lang.Boolean> r1) throws java.io.IOException;

    com.google.crypto.tink.shaded.protobuf.ByteString readBytes() throws java.io.IOException;

    void readBytesList(java.util.List<com.google.crypto.tink.shaded.protobuf.ByteString> r1) throws java.io.IOException;

    double readDouble() throws java.io.IOException;

    void readDoubleList(java.util.List<java.lang.Double> r1) throws java.io.IOException;

    int readEnum() throws java.io.IOException;

    void readEnumList(java.util.List<java.lang.Integer> r1) throws java.io.IOException;

    int readFixed32() throws java.io.IOException;

    void readFixed32List(java.util.List<java.lang.Integer> r1) throws java.io.IOException;

    long readFixed64() throws java.io.IOException;

    void readFixed64List(java.util.List<java.lang.Long> r1) throws java.io.IOException;

    float readFloat() throws java.io.IOException;

    void readFloatList(java.util.List<java.lang.Float> r1) throws java.io.IOException;

    @java.lang.Deprecated
    <T> T readGroup(java.lang.Class<T> r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException;

    @java.lang.Deprecated
    <T> T readGroupBySchemaWithCheck(com.google.crypto.tink.shaded.protobuf.Schema<T> r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException;

    @java.lang.Deprecated
    <T> void readGroupList(java.util.List<T> r1, com.google.crypto.tink.shaded.protobuf.Schema<T> r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException;

    @java.lang.Deprecated
    <T> void readGroupList(java.util.List<T> r1, java.lang.Class<T> r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException;

    int readInt32() throws java.io.IOException;

    void readInt32List(java.util.List<java.lang.Integer> r1) throws java.io.IOException;

    long readInt64() throws java.io.IOException;

    void readInt64List(java.util.List<java.lang.Long> r1) throws java.io.IOException;

    <K, V> void readMap(java.util.Map<K, V> r1, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException;

    <T> T readMessage(java.lang.Class<T> r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException;

    <T> T readMessageBySchemaWithCheck(com.google.crypto.tink.shaded.protobuf.Schema<T> r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException;

    <T> void readMessageList(java.util.List<T> r1, com.google.crypto.tink.shaded.protobuf.Schema<T> r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException;

    <T> void readMessageList(java.util.List<T> r1, java.lang.Class<T> r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws java.io.IOException;

    int readSFixed32() throws java.io.IOException;

    void readSFixed32List(java.util.List<java.lang.Integer> r1) throws java.io.IOException;

    long readSFixed64() throws java.io.IOException;

    void readSFixed64List(java.util.List<java.lang.Long> r1) throws java.io.IOException;

    int readSInt32() throws java.io.IOException;

    void readSInt32List(java.util.List<java.lang.Integer> r1) throws java.io.IOException;

    long readSInt64() throws java.io.IOException;

    void readSInt64List(java.util.List<java.lang.Long> r1) throws java.io.IOException;

    java.lang.String readString() throws java.io.IOException;

    void readStringList(java.util.List<java.lang.String> r1) throws java.io.IOException;

    void readStringListRequireUtf8(java.util.List<java.lang.String> r1) throws java.io.IOException;

    java.lang.String readStringRequireUtf8() throws java.io.IOException;

    int readUInt32() throws java.io.IOException;

    void readUInt32List(java.util.List<java.lang.Integer> r1) throws java.io.IOException;

    long readUInt64() throws java.io.IOException;

    void readUInt64List(java.util.List<java.lang.Long> r1) throws java.io.IOException;

    boolean shouldDiscardUnknownFields();

    boolean skipField() throws java.io.IOException;
}
