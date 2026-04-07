package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
class UnknownFieldSetLiteSchema extends com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite, com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite> {
    UnknownFieldSetLiteSchema() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: addFixed32, reason: avoid collision after fix types in other method */
    void addFixed322(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3, int r4, int r5) {
            r2 = this;
            r0 = 5
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r4, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r3.storeField(r0, r1)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ void addFixed32(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1, int r2, int r3) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r1
            r0.addFixed322(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: addFixed64, reason: avoid collision after fix types in other method */
    void addFixed642(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3, int r4, long r5) {
            r2 = this;
            r0 = 1
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r4, r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r3.storeField(r0, r1)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ void addFixed64(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1, int r2, long r3) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r1
            r0.addFixed642(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: addGroup, reason: avoid collision after fix types in other method */
    void addGroup2(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r2, int r3, com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r4) {
            r1 = this;
            r0 = 3
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r3, r0)
            r2.storeField(r0, r4)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ void addGroup(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1, int r2, com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r1
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r3
            r0.addGroup2(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: addLengthDelimited, reason: avoid collision after fix types in other method */
    void addLengthDelimited2(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r2, int r3, com.google.crypto.tink.shaded.protobuf.ByteString r4) {
            r1 = this;
            r0 = 2
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r3, r0)
            r2.storeField(r0, r4)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ void addLengthDelimited(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1, int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r1
            r0.addLengthDelimited2(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: addVarint, reason: avoid collision after fix types in other method */
    void addVarint2(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3, int r4, long r5) {
            r2 = this;
            r0 = 0
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r4, r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r3.storeField(r0, r1)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ void addVarint(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1, int r2, long r3) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r1
            r0.addVarint2(r1, r2, r3)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite getBuilderFromMessage(java.lang.Object r3) {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = r2.getFromMessage(r3)
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.getDefaultInstance()
            if (r0 != r1) goto L11
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.newInstance()
            r2.setToMessage2(r3, r0)
        L11:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite getBuilderFromMessage(java.lang.Object r1) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = r0.getBuilderFromMessage(r1)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite getFromMessage(java.lang.Object r2) {
            r1 = this;
            r0 = r2
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = r0.unknownFields
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite getFromMessage(java.lang.Object r1) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = r0.getFromMessage(r1)
            return r1
    }

    /* JADX INFO: renamed from: getSerializedSize, reason: avoid collision after fix types in other method */
    int getSerializedSize2(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r2) {
            r1 = this;
            int r0 = r2.getSerializedSize()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ int getSerializedSize(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r1
            int r1 = r0.getSerializedSize2(r1)
            return r1
    }

    /* JADX INFO: renamed from: getSerializedSizeAsMessageSet, reason: avoid collision after fix types in other method */
    int getSerializedSizeAsMessageSet2(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r2) {
            r1 = this;
            int r0 = r2.getSerializedSizeAsMessageSet()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ int getSerializedSizeAsMessageSet(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r1
            int r1 = r0.getSerializedSizeAsMessageSet2(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    void makeImmutable(java.lang.Object r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = r1.getFromMessage(r2)
            r0.makeImmutable()
            return
    }

    /* JADX INFO: renamed from: merge, reason: avoid collision after fix types in other method */
    com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite merge2(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r2, com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.getDefaultInstance()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Lb
            return r2
        Lb:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.getDefaultInstance()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1a
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.mutableCopyOf(r2, r3)
            return r0
        L1a:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = r2.mergeFrom(r3)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite merge(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1, com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r2) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r1
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r2 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r2
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = r0.merge2(r1, r2)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite newBuilder() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.newInstance()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite newBuilder() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = r1.newBuilder()
            return r0
    }

    /* JADX INFO: renamed from: setBuilderToMessage, reason: avoid collision after fix types in other method */
    void setBuilderToMessage2(java.lang.Object r1, com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r2) {
            r0 = this;
            r0.setToMessage2(r1, r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ void setBuilderToMessage(java.lang.Object r1, com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r2) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r2 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r2
            r0.setBuilderToMessage2(r1, r2)
            return
    }

    /* JADX INFO: renamed from: setToMessage, reason: avoid collision after fix types in other method */
    void setToMessage2(java.lang.Object r2, com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3) {
            r1 = this;
            r0 = r2
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            r0.unknownFields = r3
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ void setToMessage(java.lang.Object r1, com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r2) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r2 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r2
            r0.setToMessage2(r1, r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    boolean shouldDiscardUnknownFields(com.google.crypto.tink.shaded.protobuf.Reader r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: toImmutable, reason: avoid collision after fix types in other method */
    com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite toImmutable2(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1) {
            r0 = this;
            r1.makeImmutable()
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite toImmutable(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r1
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = r0.toImmutable2(r1)
            return r1
    }

    /* JADX INFO: renamed from: writeAsMessageSetTo, reason: avoid collision after fix types in other method */
    void writeAsMessageSetTo2(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException {
            r0 = this;
            r1.writeAsMessageSetTo(r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ void writeAsMessageSetTo(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r1
            r0.writeAsMessageSetTo2(r1, r2)
            return
    }

    /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
    void writeTo2(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException {
            r0 = this;
            r1.writeTo(r2)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema
    /* bridge */ /* synthetic */ void writeTo(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1, com.google.crypto.tink.shaded.protobuf.Writer r2) throws java.io.IOException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r1
            r0.writeTo2(r1, r2)
            return
    }
}
