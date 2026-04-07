package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Struct extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.shaded.protobuf.Struct, com.google.crypto.tink.shaded.protobuf.Struct.Builder> implements com.google.crypto.tink.shaded.protobuf.StructOrBuilder {
    private static final com.google.crypto.tink.shaded.protobuf.Struct DEFAULT_INSTANCE = null;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Struct> PARSER;
    private com.google.crypto.tink.shaded.protobuf.MapFieldLite<java.lang.String, com.google.crypto.tink.shaded.protobuf.Value> fields_;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.Struct$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.Struct.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Struct.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Struct.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Struct.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Struct.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Struct.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Struct.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L56
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L56
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L56
                goto L57
            L56:
                r0 = move-exception
            L57:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Struct.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L63
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L63
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L63
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L63
                goto L64
            L63:
                r0 = move-exception
            L64:
                return
        }
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.shaded.protobuf.Struct, com.google.crypto.tink.shaded.protobuf.Struct.Builder> implements com.google.crypto.tink.shaded.protobuf.StructOrBuilder {
        private Builder() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.Struct r0 = com.google.crypto.tink.shaded.protobuf.Struct.access$000()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.Struct.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.crypto.tink.shaded.protobuf.Struct.Builder clearFields() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Struct r0 = (com.google.crypto.tink.shaded.protobuf.Struct) r0
                java.util.Map r0 = com.google.crypto.tink.shaded.protobuf.Struct.access$100(r0)
                r0.clear()
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.StructOrBuilder
        public boolean containsFields(java.lang.String r3) {
                r2 = this;
                java.lang.Class r0 = r3.getClass()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r1 = r2.instance
                com.google.crypto.tink.shaded.protobuf.Struct r1 = (com.google.crypto.tink.shaded.protobuf.Struct) r1
                java.util.Map r1 = r1.getFieldsMap()
                boolean r1 = r1.containsKey(r3)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.StructOrBuilder
        @java.lang.Deprecated
        public java.util.Map<java.lang.String, com.google.crypto.tink.shaded.protobuf.Value> getFields() {
                r1 = this;
                java.util.Map r0 = r1.getFieldsMap()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.StructOrBuilder
        public int getFieldsCount() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Struct r0 = (com.google.crypto.tink.shaded.protobuf.Struct) r0
                java.util.Map r0 = r0.getFieldsMap()
                int r0 = r0.size()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.StructOrBuilder
        public java.util.Map<java.lang.String, com.google.crypto.tink.shaded.protobuf.Value> getFieldsMap() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Struct r0 = (com.google.crypto.tink.shaded.protobuf.Struct) r0
                java.util.Map r0 = r0.getFieldsMap()
                java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.StructOrBuilder
        public com.google.crypto.tink.shaded.protobuf.Value getFieldsOrDefault(java.lang.String r4, com.google.crypto.tink.shaded.protobuf.Value r5) {
                r3 = this;
                java.lang.Class r0 = r4.getClass()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r1 = r3.instance
                com.google.crypto.tink.shaded.protobuf.Struct r1 = (com.google.crypto.tink.shaded.protobuf.Struct) r1
                java.util.Map r1 = r1.getFieldsMap()
                boolean r2 = r1.containsKey(r4)
                if (r2 == 0) goto L19
                java.lang.Object r2 = r1.get(r4)
                com.google.crypto.tink.shaded.protobuf.Value r2 = (com.google.crypto.tink.shaded.protobuf.Value) r2
                goto L1a
            L19:
                r2 = r5
            L1a:
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.StructOrBuilder
        public com.google.crypto.tink.shaded.protobuf.Value getFieldsOrThrow(java.lang.String r4) {
                r3 = this;
                java.lang.Class r0 = r4.getClass()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r1 = r3.instance
                com.google.crypto.tink.shaded.protobuf.Struct r1 = (com.google.crypto.tink.shaded.protobuf.Struct) r1
                java.util.Map r1 = r1.getFieldsMap()
                boolean r2 = r1.containsKey(r4)
                if (r2 == 0) goto L19
                java.lang.Object r2 = r1.get(r4)
                com.google.crypto.tink.shaded.protobuf.Value r2 = (com.google.crypto.tink.shaded.protobuf.Value) r2
                return r2
            L19:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                r2.<init>()
                throw r2
        }

        public com.google.crypto.tink.shaded.protobuf.Struct.Builder putAllFields(java.util.Map<java.lang.String, com.google.crypto.tink.shaded.protobuf.Value> r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Struct r0 = (com.google.crypto.tink.shaded.protobuf.Struct) r0
                java.util.Map r0 = com.google.crypto.tink.shaded.protobuf.Struct.access$100(r0)
                r0.putAll(r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Struct.Builder putFields(java.lang.String r4, com.google.crypto.tink.shaded.protobuf.Value r5) {
                r3 = this;
                java.lang.Class r0 = r4.getClass()
                java.lang.Class r1 = r5.getClass()
                r3.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r2 = r3.instance
                com.google.crypto.tink.shaded.protobuf.Struct r2 = (com.google.crypto.tink.shaded.protobuf.Struct) r2
                java.util.Map r2 = com.google.crypto.tink.shaded.protobuf.Struct.access$100(r2)
                r2.put(r4, r5)
                return r3
        }

        public com.google.crypto.tink.shaded.protobuf.Struct.Builder removeFields(java.lang.String r3) {
                r2 = this;
                java.lang.Class r0 = r3.getClass()
                r2.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r1 = r2.instance
                com.google.crypto.tink.shaded.protobuf.Struct r1 = (com.google.crypto.tink.shaded.protobuf.Struct) r1
                java.util.Map r1 = com.google.crypto.tink.shaded.protobuf.Struct.access$100(r1)
                r1.remove(r3)
                return r2
        }
    }

    private static final class FieldsDefaultEntryHolder {
        static final com.google.crypto.tink.shaded.protobuf.MapEntryLite<java.lang.String, com.google.crypto.tink.shaded.protobuf.Value> defaultEntry = null;

        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE
                com.google.crypto.tink.shaded.protobuf.Value r2 = com.google.crypto.tink.shaded.protobuf.Value.getDefaultInstance()
                java.lang.String r3 = ""
                com.google.crypto.tink.shaded.protobuf.MapEntryLite r0 = com.google.crypto.tink.shaded.protobuf.MapEntryLite.newDefaultInstance(r0, r3, r1, r2)
                com.google.crypto.tink.shaded.protobuf.Struct.FieldsDefaultEntryHolder.defaultEntry = r0
                return
        }

        private FieldsDefaultEntryHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            com.google.crypto.tink.shaded.protobuf.Struct r0 = new com.google.crypto.tink.shaded.protobuf.Struct
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE = r0
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Struct> r1 = com.google.crypto.tink.shaded.protobuf.Struct.class
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private Struct() {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = com.google.crypto.tink.shaded.protobuf.MapFieldLite.emptyMapField()
            r1.fields_ = r0
            return
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.Struct access$000() {
            com.google.crypto.tink.shaded.protobuf.Struct r0 = com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ java.util.Map access$100(com.google.crypto.tink.shaded.protobuf.Struct r1) {
            java.util.Map r0 = r1.getMutableFieldsMap()
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Struct getDefaultInstance() {
            com.google.crypto.tink.shaded.protobuf.Struct r0 = com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE
            return r0
    }

    private java.util.Map<java.lang.String, com.google.crypto.tink.shaded.protobuf.Value> getMutableFieldsMap() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = r1.internalGetMutableFields()
            return r0
    }

    private com.google.crypto.tink.shaded.protobuf.MapFieldLite<java.lang.String, com.google.crypto.tink.shaded.protobuf.Value> internalGetFields() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MapFieldLite<java.lang.String, com.google.crypto.tink.shaded.protobuf.Value> r0 = r1.fields_
            return r0
    }

    private com.google.crypto.tink.shaded.protobuf.MapFieldLite<java.lang.String, com.google.crypto.tink.shaded.protobuf.Value> internalGetMutableFields() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MapFieldLite<java.lang.String, com.google.crypto.tink.shaded.protobuf.Value> r0 = r1.fields_
            boolean r0 = r0.isMutable()
            if (r0 != 0) goto L10
            com.google.crypto.tink.shaded.protobuf.MapFieldLite<java.lang.String, com.google.crypto.tink.shaded.protobuf.Value> r0 = r1.fields_
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = r0.mutableCopy()
            r1.fields_ = r0
        L10:
            com.google.crypto.tink.shaded.protobuf.MapFieldLite<java.lang.String, com.google.crypto.tink.shaded.protobuf.Value> r0 = r1.fields_
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Struct.Builder newBuilder() {
            com.google.crypto.tink.shaded.protobuf.Struct r0 = com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            com.google.crypto.tink.shaded.protobuf.Struct$Builder r0 = (com.google.crypto.tink.shaded.protobuf.Struct.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Struct.Builder newBuilder(com.google.crypto.tink.shaded.protobuf.Struct r1) {
            com.google.crypto.tink.shaded.protobuf.Struct r0 = com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder(r1)
            com.google.crypto.tink.shaded.protobuf.Struct$Builder r0 = (com.google.crypto.tink.shaded.protobuf.Struct.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Struct parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Struct r0 = com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseDelimitedFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Struct r0 = (com.google.crypto.tink.shaded.protobuf.Struct) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Struct parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Struct r0 = com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseDelimitedFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Struct r0 = (com.google.crypto.tink.shaded.protobuf.Struct) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Struct parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Struct r0 = com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Struct r0 = (com.google.crypto.tink.shaded.protobuf.Struct) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Struct parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Struct r0 = com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Struct r0 = (com.google.crypto.tink.shaded.protobuf.Struct) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Struct parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Struct r0 = com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Struct r0 = (com.google.crypto.tink.shaded.protobuf.Struct) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Struct parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Struct r0 = com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Struct r0 = (com.google.crypto.tink.shaded.protobuf.Struct) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Struct parseFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Struct r0 = com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Struct r0 = (com.google.crypto.tink.shaded.protobuf.Struct) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Struct parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Struct r0 = com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Struct r0 = (com.google.crypto.tink.shaded.protobuf.Struct) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Struct parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Struct r0 = com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Struct r0 = (com.google.crypto.tink.shaded.protobuf.Struct) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Struct parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Struct r0 = com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Struct r0 = (com.google.crypto.tink.shaded.protobuf.Struct) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Struct parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Struct r0 = com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Struct r0 = (com.google.crypto.tink.shaded.protobuf.Struct) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Struct parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Struct r0 = com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Struct r0 = (com.google.crypto.tink.shaded.protobuf.Struct) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Struct> parser() {
            com.google.crypto.tink.shaded.protobuf.Struct r0 = com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.Parser r0 = r0.getParserForType()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.StructOrBuilder
    public boolean containsFields(java.lang.String r3) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r1 = r2.internalGetFields()
            boolean r1 = r1.containsKey(r3)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            int[] r0 = com.google.crypto.tink.shaded.protobuf.Struct.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
            int r1 = r5.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 1: goto L4f;
                case 2: goto L49;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L19;
                case 6: goto L13;
                case 7: goto L12;
                default: goto Lc;
            }
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L12:
            return r1
        L13:
            r0 = 1
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
        L19:
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Struct> r0 = com.google.crypto.tink.shaded.protobuf.Struct.PARSER
            if (r0 != 0) goto L34
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Struct> r1 = com.google.crypto.tink.shaded.protobuf.Struct.class
            monitor-enter(r1)
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Struct> r2 = com.google.crypto.tink.shaded.protobuf.Struct.PARSER     // Catch: java.lang.Throwable -> L31
            r0 = r2
            if (r0 != 0) goto L2f
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r2 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L31
            com.google.crypto.tink.shaded.protobuf.Struct r3 = com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L31
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L31
            r0 = r2
            com.google.crypto.tink.shaded.protobuf.Struct.PARSER = r0     // Catch: java.lang.Throwable -> L31
        L2f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            goto L34
        L31:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            throw r2
        L34:
            return r0
        L35:
            com.google.crypto.tink.shaded.protobuf.Struct r0 = com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE
            return r0
        L38:
            java.lang.String r0 = "fields_"
            com.google.crypto.tink.shaded.protobuf.MapEntryLite<java.lang.String, com.google.crypto.tink.shaded.protobuf.Value> r1 = com.google.crypto.tink.shaded.protobuf.Struct.FieldsDefaultEntryHolder.defaultEntry
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012"
            com.google.crypto.tink.shaded.protobuf.Struct r2 = com.google.crypto.tink.shaded.protobuf.Struct.DEFAULT_INSTANCE
            java.lang.Object r2 = newMessageInfo(r2, r1, r0)
            return r2
        L49:
            com.google.crypto.tink.shaded.protobuf.Struct$Builder r0 = new com.google.crypto.tink.shaded.protobuf.Struct$Builder
            r0.<init>(r1)
            return r0
        L4f:
            com.google.crypto.tink.shaded.protobuf.Struct r0 = new com.google.crypto.tink.shaded.protobuf.Struct
            r0.<init>()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.StructOrBuilder
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.crypto.tink.shaded.protobuf.Value> getFields() {
            r1 = this;
            java.util.Map r0 = r1.getFieldsMap()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.StructOrBuilder
    public int getFieldsCount() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = r1.internalGetFields()
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.StructOrBuilder
    public java.util.Map<java.lang.String, com.google.crypto.tink.shaded.protobuf.Value> getFieldsMap() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r0 = r1.internalGetFields()
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.StructOrBuilder
    public com.google.crypto.tink.shaded.protobuf.Value getFieldsOrDefault(java.lang.String r4, com.google.crypto.tink.shaded.protobuf.Value r5) {
            r3 = this;
            java.lang.Class r0 = r4.getClass()
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r1 = r3.internalGetFields()
            boolean r2 = r1.containsKey(r4)
            if (r2 == 0) goto L16
            java.lang.Object r2 = r1.get(r4)
            com.google.crypto.tink.shaded.protobuf.Value r2 = (com.google.crypto.tink.shaded.protobuf.Value) r2
            goto L17
        L16:
            r2 = r5
        L17:
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.StructOrBuilder
    public com.google.crypto.tink.shaded.protobuf.Value getFieldsOrThrow(java.lang.String r4) {
            r3 = this;
            java.lang.Class r0 = r4.getClass()
            com.google.crypto.tink.shaded.protobuf.MapFieldLite r1 = r3.internalGetFields()
            boolean r2 = r1.containsKey(r4)
            if (r2 == 0) goto L16
            java.lang.Object r2 = r1.get(r4)
            com.google.crypto.tink.shaded.protobuf.Value r2 = (com.google.crypto.tink.shaded.protobuf.Value) r2
            return r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }
}
