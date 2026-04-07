package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
class MapFieldSchemaLite implements com.google.crypto.tink.shaded.protobuf.MapFieldSchema {
    MapFieldSchemaLite() {
            r0 = this;
            r0.<init>()
            return
    }

    private static <K, V> int getSerializedSizeLite(int r7, java.lang.Object r8, java.lang.Object r9) {
            r0 = r8
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = (com.google.crypto.tink.shaded.protobuf.MapFieldLite) r0
            r1 = r9
            com.google.crypto.tink.shaded.protobuf.MapEntryLite r1 = (com.google.crypto.tink.shaded.protobuf.MapEntryLite) r1
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto Le
            r2 = 0
            return r2
        Le:
            r2 = 0
            java.util.Set r3 = r0.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r6 = r4.getValue()
            int r5 = r1.computeMessageSize(r7, r5, r6)
            int r2 = r2 + r5
            goto L17
        L31:
            return r2
    }

    private static <K, V> com.google.crypto.tink.shaded.protobuf.MapFieldLite<K, V> mergeFromLite(java.lang.Object r3, java.lang.Object r4) {
            r0 = r3
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = (com.google.crypto.tink.shaded.protobuf.MapFieldLite) r0
            r1 = r4
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r1 = (com.google.crypto.tink.shaded.protobuf.MapFieldLite) r1
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L19
            boolean r2 = r0.isMutable()
            if (r2 != 0) goto L16
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = r0.mutableCopy()
        L16:
            r0.mergeFrom(r1)
        L19:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public java.util.Map<?, ?> forMapData(java.lang.Object r2) {
            r1 = this;
            r0 = r2
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = (com.google.crypto.tink.shaded.protobuf.MapFieldLite) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<?, ?> forMapMetadata(java.lang.Object r2) {
            r1 = this;
            r0 = r2
            com.google.crypto.tink.shaded.protobuf.MapEntryLite r0 = (com.google.crypto.tink.shaded.protobuf.MapEntryLite) r0
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata r0 = r0.getMetadata()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public java.util.Map<?, ?> forMutableMapData(java.lang.Object r2) {
            r1 = this;
            r0 = r2
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = (com.google.crypto.tink.shaded.protobuf.MapFieldLite) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public int getSerializedSize(int r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r0 = getSerializedSizeLite(r2, r3, r4)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public boolean isImmutable(java.lang.Object r2) {
            r1 = this;
            r0 = r2
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = (com.google.crypto.tink.shaded.protobuf.MapFieldLite) r0
            boolean r0 = r0.isMutable()
            r0 = r0 ^ 1
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public java.lang.Object mergeFrom(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = mergeFromLite(r2, r3)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public java.lang.Object newMapField(java.lang.Object r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = com.google.crypto.tink.shaded.protobuf.MapFieldLite.emptyMapField()
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = r0.mutableCopy()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MapFieldSchema
    public java.lang.Object toImmutable(java.lang.Object r2) {
            r1 = this;
            r0 = r2
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = (com.google.crypto.tink.shaded.protobuf.MapFieldLite) r0
            r0.makeImmutable()
            return r2
    }
}
