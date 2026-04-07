package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class MapEntryLite<K, V> {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final K key;
    private final com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> metadata;
    private final V value;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.MapEntryLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;

        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.MapEntryLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType = r0
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MapEntryLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MapEntryLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MapEntryLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                return
        }
    }

    static class Metadata<K, V> {
        public final K defaultKey;
        public final V defaultValue;
        public final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType keyType;
        public final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType valueType;

        public Metadata(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r1, K r2, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r3, V r4) {
                r0 = this;
                r0.<init>()
                r0.keyType = r1
                r0.defaultKey = r2
                r0.valueType = r3
                r0.defaultValue = r4
                return
        }
    }

    private MapEntryLite(com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> r1, K r2, V r3) {
            r0 = this;
            r0.<init>()
            r0.metadata = r1
            r0.key = r2
            r0.value = r3
            return
    }

    private MapEntryLite(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r2, K r3, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r4, V r5) {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata r0 = new com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata
            r0.<init>(r2, r3, r4, r5)
            r1.metadata = r0
            r1.key = r3
            r1.value = r5
            return
    }

    static <K, V> int computeSerializedSize(com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> r3, K r4, V r5) {
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r3.keyType
            r1 = 1
            int r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.computeElementSize(r0, r1, r4)
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = r3.valueType
            r2 = 2
            int r1 = com.google.crypto.tink.shaded.protobuf.FieldSet.computeElementSize(r1, r2, r5)
            int r0 = r0 + r1
            return r0
    }

    public static <K, V> com.google.crypto.tink.shaded.protobuf.MapEntryLite<K, V> newDefaultInstance(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r1, K r2, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r3, V r4) {
            com.google.crypto.tink.shaded.protobuf.MapEntryLite r0 = new com.google.crypto.tink.shaded.protobuf.MapEntryLite
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    static <K, V> java.util.Map.Entry<K, V> parseEntry(com.google.crypto.tink.shaded.protobuf.CodedInputStream r5, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> r6, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r7) throws java.io.IOException {
            K r0 = r6.defaultKey
            V r1 = r6.defaultValue
        L4:
            int r2 = r5.readTag()
            if (r2 != 0) goto Lb
            goto L3a
        Lb:
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r3 = r6.keyType
            int r3 = r3.getWireType()
            r4 = 1
            int r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r4, r3)
            if (r2 != r3) goto L1f
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r3 = r6.keyType
            java.lang.Object r0 = parseField(r5, r7, r3, r0)
            goto L40
        L1f:
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r3 = r6.valueType
            int r3 = r3.getWireType()
            r4 = 2
            int r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r4, r3)
            if (r2 != r3) goto L33
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r3 = r6.valueType
            java.lang.Object r1 = parseField(r5, r7, r3, r1)
            goto L40
        L33:
            boolean r3 = r5.skipField(r2)
            if (r3 != 0) goto L40
        L3a:
            java.util.AbstractMap$SimpleImmutableEntry r2 = new java.util.AbstractMap$SimpleImmutableEntry
            r2.<init>(r0, r1)
            return r2
        L40:
            goto L4
    }

    static <T> T parseField(com.google.crypto.tink.shaded.protobuf.CodedInputStream r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r4, T r5) throws java.io.IOException {
            int[] r0 = com.google.crypto.tink.shaded.protobuf.MapEntryLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType
            int r1 = r4.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L22;
                case 2: goto L19;
                case 3: goto L11;
                default: goto Lb;
            }
        Lb:
            r0 = 1
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.readPrimitiveField(r2, r4, r0)
            return r0
        L11:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Groups are not allowed in maps."
            r0.<init>(r1)
            throw r0
        L19:
            int r0 = r2.readEnum()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L22:
            r0 = r5
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r0.toBuilder()
            r2.readMessage(r0, r3)
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.buildPartial()
            return r1
    }

    static <K, V> void writeTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> r3, K r4, V r5) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r3.keyType
            r1 = 1
            com.google.crypto.tink.shaded.protobuf.FieldSet.writeElement(r2, r0, r1, r4)
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r3.valueType
            r1 = 2
            com.google.crypto.tink.shaded.protobuf.FieldSet.writeElement(r2, r0, r1, r5)
            return
    }

    public int computeMessageSize(int r3, K r4, V r5) {
            r2 = this;
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r3)
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r1 = r2.metadata
            int r1 = computeSerializedSize(r1, r4, r5)
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r1)
            int r0 = r0 + r1
            return r0
    }

    public K getKey() {
            r1 = this;
            K r0 = r1.key
            return r0
    }

    com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> getMetadata() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r0 = r1.metadata
            return r0
    }

    public V getValue() {
            r1 = this;
            V r0 = r1.value
            return r0
    }

    public java.util.Map.Entry<K, V> parseEntry(com.google.crypto.tink.shaded.protobuf.ByteString r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r3.newCodedInput()
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r1 = r2.metadata
            java.util.Map$Entry r0 = parseEntry(r0, r1, r4)
            return r0
    }

    public void parseInto(com.google.crypto.tink.shaded.protobuf.MapFieldLite<K, V> r8, com.google.crypto.tink.shaded.protobuf.CodedInputStream r9, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r10) throws java.io.IOException {
            r7 = this;
            int r0 = r9.readRawVarint32()
            int r1 = r9.pushLimit(r0)
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r2 = r7.metadata
            K r2 = r2.defaultKey
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r3 = r7.metadata
            V r3 = r3.defaultValue
        L10:
            int r4 = r9.readTag()
            if (r4 != 0) goto L17
            goto L4e
        L17:
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r5 = r7.metadata
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r5 = r5.keyType
            int r5 = r5.getWireType()
            r6 = 1
            int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r6, r5)
            if (r4 != r5) goto L2f
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r5 = r7.metadata
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r5 = r5.keyType
            java.lang.Object r2 = parseField(r9, r10, r5, r2)
            goto L59
        L2f:
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r5 = r7.metadata
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r5 = r5.valueType
            int r5 = r5.getWireType()
            r6 = 2
            int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r6, r5)
            if (r4 != r5) goto L47
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r5 = r7.metadata
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r5 = r5.valueType
            java.lang.Object r3 = parseField(r9, r10, r5, r3)
            goto L59
        L47:
            boolean r5 = r9.skipField(r4)
            if (r5 != 0) goto L59
        L4e:
            r4 = 0
            r9.checkLastTagWas(r4)
            r9.popLimit(r1)
            r8.put(r2, r3)
            return
        L59:
            goto L10
    }

    public void serializeTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2, int r3, K r4, V r5) throws java.io.IOException {
            r1 = this;
            r0 = 2
            r2.writeTag(r3, r0)
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r0 = r1.metadata
            int r0 = computeSerializedSize(r0, r4, r5)
            r2.writeUInt32NoTag(r0)
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata<K, V> r0 = r1.metadata
            writeTo(r2, r0, r4, r5)
            return
    }
}
