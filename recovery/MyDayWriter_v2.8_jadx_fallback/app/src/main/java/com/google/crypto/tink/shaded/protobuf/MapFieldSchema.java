package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
interface MapFieldSchema {
    java.util.Map<?, ?> forMapData(java.lang.Object r1);

    com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<?, ?> forMapMetadata(java.lang.Object r1);

    java.util.Map<?, ?> forMutableMapData(java.lang.Object r1);

    int getSerializedSize(int r1, java.lang.Object r2, java.lang.Object r3);

    boolean isImmutable(java.lang.Object r1);

    java.lang.Object mergeFrom(java.lang.Object r1, java.lang.Object r2);

    java.lang.Object newMapField(java.lang.Object r1);

    java.lang.Object toImmutable(java.lang.Object r1);
}
