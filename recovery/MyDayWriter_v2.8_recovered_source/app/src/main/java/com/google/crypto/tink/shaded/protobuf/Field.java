package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Field extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.shaded.protobuf.Field, com.google.crypto.tink.shaded.protobuf.Field.Builder> implements com.google.crypto.tink.shaded.protobuf.FieldOrBuilder {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final com.google.crypto.tink.shaded.protobuf.Field DEFAULT_INSTANCE = null;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Field> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private java.lang.String defaultValue_;
    private java.lang.String jsonName_;
    private int kind_;
    private java.lang.String name_;
    private int number_;
    private int oneofIndex_;
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> options_;
    private boolean packed_;
    private java.lang.String typeUrl_;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.Field$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.Field.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Field.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Field.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Field.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Field.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Field.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Field.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L56
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L56
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L56
                goto L57
            L56:
                r0 = move-exception
            L57:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Field.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L63
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

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.shaded.protobuf.Field, com.google.crypto.tink.shaded.protobuf.Field.Builder> implements com.google.crypto.tink.shaded.protobuf.FieldOrBuilder {
        private Builder() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.Field r0 = com.google.crypto.tink.shaded.protobuf.Field.access$000()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.Field.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder addAllOptions(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Option> r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$2200(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder addOptions(int r3, com.google.crypto.tink.shaded.protobuf.Option.Builder r4) {
                r2 = this;
                r2.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r4.build()
                com.google.crypto.tink.shaded.protobuf.Option r1 = (com.google.crypto.tink.shaded.protobuf.Option) r1
                com.google.crypto.tink.shaded.protobuf.Field.access$2100(r0, r3, r1)
                return r2
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder addOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$2100(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder addOptions(com.google.crypto.tink.shaded.protobuf.Option.Builder r3) {
                r2 = this;
                r2.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r3.build()
                com.google.crypto.tink.shaded.protobuf.Option r1 = (com.google.crypto.tink.shaded.protobuf.Option) r1
                com.google.crypto.tink.shaded.protobuf.Field.access$2000(r0, r1)
                return r2
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder addOptions(com.google.crypto.tink.shaded.protobuf.Option r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$2000(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder clearCardinality() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$600(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder clearDefaultValue() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$2900(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder clearJsonName() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$2600(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder clearKind() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$300(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder clearName() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$1000(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder clearNumber() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$800(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder clearOneofIndex() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$1600(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder clearOptions() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$2300(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder clearPacked() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$1800(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder clearTypeUrl() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$1300(r0)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public com.google.crypto.tink.shaded.protobuf.Field.Cardinality getCardinality() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality r0 = r0.getCardinality()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public int getCardinalityValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                int r0 = r0.getCardinalityValue()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public java.lang.String getDefaultValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                java.lang.String r0 = r0.getDefaultValue()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getDefaultValueBytes() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getDefaultValueBytes()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public java.lang.String getJsonName() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                java.lang.String r0 = r0.getJsonName()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getJsonNameBytes() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getJsonNameBytes()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public com.google.crypto.tink.shaded.protobuf.Field.Kind getKind() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = r0.getKind()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public int getKindValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                int r0 = r0.getKindValue()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public java.lang.String getName() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getNameBytes()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public int getNumber() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                int r0 = r0.getNumber()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public int getOneofIndex() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                int r0 = r0.getOneofIndex()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public com.google.crypto.tink.shaded.protobuf.Option getOptions(int r2) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Option r0 = r0.getOptions(r2)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public int getOptionsCount() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                int r0 = r0.getOptionsCount()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public java.util.List<com.google.crypto.tink.shaded.protobuf.Option> getOptionsList() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                java.util.List r0 = r0.getOptionsList()
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public boolean getPacked() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                boolean r0 = r0.getPacked()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public java.lang.String getTypeUrl() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                java.lang.String r0 = r0.getTypeUrl()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getTypeUrlBytes() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getTypeUrlBytes()
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder removeOptions(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$2400(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder setCardinality(com.google.crypto.tink.shaded.protobuf.Field.Cardinality r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$500(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder setCardinalityValue(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$400(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder setDefaultValue(java.lang.String r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$2800(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder setDefaultValueBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$3000(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder setJsonName(java.lang.String r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$2500(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder setJsonNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$2700(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder setKind(com.google.crypto.tink.shaded.protobuf.Field.Kind r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$200(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder setKindValue(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder setName(java.lang.String r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$900(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder setNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$1100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder setNumber(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$700(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder setOneofIndex(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$1500(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder setOptions(int r3, com.google.crypto.tink.shaded.protobuf.Option.Builder r4) {
                r2 = this;
                r2.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r4.build()
                com.google.crypto.tink.shaded.protobuf.Option r1 = (com.google.crypto.tink.shaded.protobuf.Option) r1
                com.google.crypto.tink.shaded.protobuf.Field.access$1900(r0, r3, r1)
                return r2
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder setOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$1900(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder setPacked(boolean r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$1700(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder setTypeUrl(java.lang.String r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$1200(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Field.Builder setTypeUrlBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
                com.google.crypto.tink.shaded.protobuf.Field.access$1400(r0, r2)
                return r1
        }
    }

    public enum Cardinality extends java.lang.Enum<com.google.crypto.tink.shaded.protobuf.Field.Cardinality> implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
        private static final /* synthetic */ com.google.crypto.tink.shaded.protobuf.Field.Cardinality[] $VALUES = null;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Cardinality CARDINALITY_OPTIONAL = null;
        public static final int CARDINALITY_OPTIONAL_VALUE = 1;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Cardinality CARDINALITY_REPEATED = null;
        public static final int CARDINALITY_REPEATED_VALUE = 3;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Cardinality CARDINALITY_REQUIRED = null;
        public static final int CARDINALITY_REQUIRED_VALUE = 2;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Cardinality CARDINALITY_UNKNOWN = null;
        public static final int CARDINALITY_UNKNOWN_VALUE = 0;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Cardinality UNRECOGNIZED = null;
        private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.shaded.protobuf.Field.Cardinality> internalValueMap = null;
        private final int value;


        private static final class CardinalityVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
            static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = null;

            static {
                    com.google.crypto.tink.shaded.protobuf.Field$Cardinality$CardinalityVerifier r0 = new com.google.crypto.tink.shaded.protobuf.Field$Cardinality$CardinalityVerifier
                    r0.<init>()
                    com.google.crypto.tink.shaded.protobuf.Field.Cardinality.CardinalityVerifier.INSTANCE = r0
                    return
            }

            private CardinalityVerifier() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
            public boolean isInRange(int r2) {
                    r1 = this;
                    com.google.crypto.tink.shaded.protobuf.Field$Cardinality r0 = com.google.crypto.tink.shaded.protobuf.Field.Cardinality.forNumber(r2)
                    if (r0 == 0) goto L8
                    r0 = 1
                    goto L9
                L8:
                    r0 = 0
                L9:
                    return r0
            }
        }

        static {
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality r0 = new com.google.crypto.tink.shaded.protobuf.Field$Cardinality
                java.lang.String r1 = "CARDINALITY_UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Cardinality.CARDINALITY_UNKNOWN = r0
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality r0 = new com.google.crypto.tink.shaded.protobuf.Field$Cardinality
                java.lang.String r1 = "CARDINALITY_OPTIONAL"
                r2 = 1
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Cardinality.CARDINALITY_OPTIONAL = r0
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality r0 = new com.google.crypto.tink.shaded.protobuf.Field$Cardinality
                java.lang.String r1 = "CARDINALITY_REQUIRED"
                r2 = 2
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Cardinality.CARDINALITY_REQUIRED = r0
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality r0 = new com.google.crypto.tink.shaded.protobuf.Field$Cardinality
                java.lang.String r1 = "CARDINALITY_REPEATED"
                r2 = 3
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Cardinality.CARDINALITY_REPEATED = r0
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality r0 = new com.google.crypto.tink.shaded.protobuf.Field$Cardinality
                r1 = 4
                r2 = -1
                java.lang.String r3 = "UNRECOGNIZED"
                r0.<init>(r3, r1, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Cardinality.UNRECOGNIZED = r0
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality r0 = com.google.crypto.tink.shaded.protobuf.Field.Cardinality.CARDINALITY_UNKNOWN
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality r1 = com.google.crypto.tink.shaded.protobuf.Field.Cardinality.CARDINALITY_OPTIONAL
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality r2 = com.google.crypto.tink.shaded.protobuf.Field.Cardinality.CARDINALITY_REQUIRED
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality r3 = com.google.crypto.tink.shaded.protobuf.Field.Cardinality.CARDINALITY_REPEATED
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality r4 = com.google.crypto.tink.shaded.protobuf.Field.Cardinality.UNRECOGNIZED
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality[] r0 = new com.google.crypto.tink.shaded.protobuf.Field.Cardinality[]{r0, r1, r2, r3, r4}
                com.google.crypto.tink.shaded.protobuf.Field.Cardinality.$VALUES = r0
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality$1 r0 = new com.google.crypto.tink.shaded.protobuf.Field$Cardinality$1
                r0.<init>()
                com.google.crypto.tink.shaded.protobuf.Field.Cardinality.internalValueMap = r0
                return
        }

        Cardinality(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static com.google.crypto.tink.shaded.protobuf.Field.Cardinality forNumber(int r1) {
                switch(r1) {
                    case 0: goto Le;
                    case 1: goto Lb;
                    case 2: goto L8;
                    case 3: goto L5;
                    default: goto L3;
                }
            L3:
                r0 = 0
                return r0
            L5:
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality r0 = com.google.crypto.tink.shaded.protobuf.Field.Cardinality.CARDINALITY_REPEATED
                return r0
            L8:
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality r0 = com.google.crypto.tink.shaded.protobuf.Field.Cardinality.CARDINALITY_REQUIRED
                return r0
            Lb:
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality r0 = com.google.crypto.tink.shaded.protobuf.Field.Cardinality.CARDINALITY_OPTIONAL
                return r0
            Le:
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality r0 = com.google.crypto.tink.shaded.protobuf.Field.Cardinality.CARDINALITY_UNKNOWN
                return r0
        }

        public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.shaded.protobuf.Field.Cardinality> internalGetValueMap() {
                com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<com.google.crypto.tink.shaded.protobuf.Field$Cardinality> r0 = com.google.crypto.tink.shaded.protobuf.Field.Cardinality.internalValueMap
                return r0
        }

        public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
                com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = com.google.crypto.tink.shaded.protobuf.Field.Cardinality.CardinalityVerifier.INSTANCE
                return r0
        }

        @java.lang.Deprecated
        public static com.google.crypto.tink.shaded.protobuf.Field.Cardinality valueOf(int r1) {
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality r0 = forNumber(r1)
                return r0
        }

        public static com.google.crypto.tink.shaded.protobuf.Field.Cardinality valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.shaded.protobuf.Field$Cardinality> r0 = com.google.crypto.tink.shaded.protobuf.Field.Cardinality.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality r0 = (com.google.crypto.tink.shaded.protobuf.Field.Cardinality) r0
                return r0
        }

        public static com.google.crypto.tink.shaded.protobuf.Field.Cardinality[] values() {
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality[] r0 = com.google.crypto.tink.shaded.protobuf.Field.Cardinality.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality[] r0 = (com.google.crypto.tink.shaded.protobuf.Field.Cardinality[]) r0
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
        public final int getNumber() {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.Field$Cardinality r0 = com.google.crypto.tink.shaded.protobuf.Field.Cardinality.UNRECOGNIZED
                if (r2 == r0) goto L7
                int r0 = r2.value
                return r0
            L7:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Can't get the number of an unknown enum value."
                r0.<init>(r1)
                throw r0
        }
    }

    public enum Kind extends java.lang.Enum<com.google.crypto.tink.shaded.protobuf.Field.Kind> implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
        private static final /* synthetic */ com.google.crypto.tink.shaded.protobuf.Field.Kind[] $VALUES = null;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Kind TYPE_BOOL = null;
        public static final int TYPE_BOOL_VALUE = 8;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Kind TYPE_BYTES = null;
        public static final int TYPE_BYTES_VALUE = 12;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Kind TYPE_DOUBLE = null;
        public static final int TYPE_DOUBLE_VALUE = 1;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Kind TYPE_ENUM = null;
        public static final int TYPE_ENUM_VALUE = 14;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Kind TYPE_FIXED32 = null;
        public static final int TYPE_FIXED32_VALUE = 7;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Kind TYPE_FIXED64 = null;
        public static final int TYPE_FIXED64_VALUE = 6;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Kind TYPE_FLOAT = null;
        public static final int TYPE_FLOAT_VALUE = 2;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Kind TYPE_GROUP = null;
        public static final int TYPE_GROUP_VALUE = 10;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Kind TYPE_INT32 = null;
        public static final int TYPE_INT32_VALUE = 5;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Kind TYPE_INT64 = null;
        public static final int TYPE_INT64_VALUE = 3;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Kind TYPE_MESSAGE = null;
        public static final int TYPE_MESSAGE_VALUE = 11;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Kind TYPE_SFIXED32 = null;
        public static final int TYPE_SFIXED32_VALUE = 15;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Kind TYPE_SFIXED64 = null;
        public static final int TYPE_SFIXED64_VALUE = 16;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Kind TYPE_SINT32 = null;
        public static final int TYPE_SINT32_VALUE = 17;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Kind TYPE_SINT64 = null;
        public static final int TYPE_SINT64_VALUE = 18;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Kind TYPE_STRING = null;
        public static final int TYPE_STRING_VALUE = 9;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Kind TYPE_UINT32 = null;
        public static final int TYPE_UINT32_VALUE = 13;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Kind TYPE_UINT64 = null;
        public static final int TYPE_UINT64_VALUE = 4;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Kind TYPE_UNKNOWN = null;
        public static final int TYPE_UNKNOWN_VALUE = 0;
        public static final com.google.crypto.tink.shaded.protobuf.Field.Kind UNRECOGNIZED = null;
        private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.shaded.protobuf.Field.Kind> internalValueMap = null;
        private final int value;


        private static final class KindVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
            static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = null;

            static {
                    com.google.crypto.tink.shaded.protobuf.Field$Kind$KindVerifier r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind$KindVerifier
                    r0.<init>()
                    com.google.crypto.tink.shaded.protobuf.Field.Kind.KindVerifier.INSTANCE = r0
                    return
            }

            private KindVerifier() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
            public boolean isInRange(int r2) {
                    r1 = this;
                    com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.forNumber(r2)
                    if (r0 == 0) goto L8
                    r0 = 1
                    goto L9
                L8:
                    r0 = 0
                L9:
                    return r0
            }
        }

        static {
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind
                java.lang.String r1 = "TYPE_UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_UNKNOWN = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind
                java.lang.String r1 = "TYPE_DOUBLE"
                r2 = 1
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_DOUBLE = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind
                java.lang.String r1 = "TYPE_FLOAT"
                r2 = 2
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_FLOAT = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind
                java.lang.String r1 = "TYPE_INT64"
                r2 = 3
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_INT64 = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind
                java.lang.String r1 = "TYPE_UINT64"
                r2 = 4
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_UINT64 = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind
                java.lang.String r1 = "TYPE_INT32"
                r2 = 5
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_INT32 = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind
                java.lang.String r1 = "TYPE_FIXED64"
                r2 = 6
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_FIXED64 = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind
                java.lang.String r1 = "TYPE_FIXED32"
                r2 = 7
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_FIXED32 = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind
                java.lang.String r1 = "TYPE_BOOL"
                r2 = 8
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_BOOL = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind
                java.lang.String r1 = "TYPE_STRING"
                r2 = 9
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_STRING = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind
                java.lang.String r1 = "TYPE_GROUP"
                r2 = 10
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_GROUP = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind
                java.lang.String r1 = "TYPE_MESSAGE"
                r2 = 11
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_MESSAGE = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind
                java.lang.String r1 = "TYPE_BYTES"
                r2 = 12
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_BYTES = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind
                java.lang.String r1 = "TYPE_UINT32"
                r2 = 13
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_UINT32 = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind
                java.lang.String r1 = "TYPE_ENUM"
                r2 = 14
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_ENUM = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind
                java.lang.String r1 = "TYPE_SFIXED32"
                r2 = 15
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_SFIXED32 = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind
                java.lang.String r1 = "TYPE_SFIXED64"
                r2 = 16
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_SFIXED64 = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind
                java.lang.String r1 = "TYPE_SINT32"
                r2 = 17
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_SINT32 = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind
                java.lang.String r1 = "TYPE_SINT64"
                r2 = 18
                r0.<init>(r1, r2, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_SINT64 = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind
                r1 = 19
                r2 = -1
                java.lang.String r3 = "UNRECOGNIZED"
                r0.<init>(r3, r1, r2)
                com.google.crypto.tink.shaded.protobuf.Field.Kind.UNRECOGNIZED = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind r4 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_UNKNOWN
                com.google.crypto.tink.shaded.protobuf.Field$Kind r5 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_DOUBLE
                com.google.crypto.tink.shaded.protobuf.Field$Kind r6 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_FLOAT
                com.google.crypto.tink.shaded.protobuf.Field$Kind r7 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_INT64
                com.google.crypto.tink.shaded.protobuf.Field$Kind r8 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_UINT64
                com.google.crypto.tink.shaded.protobuf.Field$Kind r9 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_INT32
                com.google.crypto.tink.shaded.protobuf.Field$Kind r10 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_FIXED64
                com.google.crypto.tink.shaded.protobuf.Field$Kind r11 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_FIXED32
                com.google.crypto.tink.shaded.protobuf.Field$Kind r12 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_BOOL
                com.google.crypto.tink.shaded.protobuf.Field$Kind r13 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_STRING
                com.google.crypto.tink.shaded.protobuf.Field$Kind r14 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_GROUP
                com.google.crypto.tink.shaded.protobuf.Field$Kind r15 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_MESSAGE
                com.google.crypto.tink.shaded.protobuf.Field$Kind r16 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_BYTES
                com.google.crypto.tink.shaded.protobuf.Field$Kind r17 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_UINT32
                com.google.crypto.tink.shaded.protobuf.Field$Kind r18 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_ENUM
                com.google.crypto.tink.shaded.protobuf.Field$Kind r19 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_SFIXED32
                com.google.crypto.tink.shaded.protobuf.Field$Kind r20 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_SFIXED64
                com.google.crypto.tink.shaded.protobuf.Field$Kind r21 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_SINT32
                com.google.crypto.tink.shaded.protobuf.Field$Kind r22 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_SINT64
                com.google.crypto.tink.shaded.protobuf.Field$Kind r23 = com.google.crypto.tink.shaded.protobuf.Field.Kind.UNRECOGNIZED
                com.google.crypto.tink.shaded.protobuf.Field$Kind[] r0 = new com.google.crypto.tink.shaded.protobuf.Field.Kind[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}
                com.google.crypto.tink.shaded.protobuf.Field.Kind.$VALUES = r0
                com.google.crypto.tink.shaded.protobuf.Field$Kind$1 r0 = new com.google.crypto.tink.shaded.protobuf.Field$Kind$1
                r0.<init>()
                com.google.crypto.tink.shaded.protobuf.Field.Kind.internalValueMap = r0
                return
        }

        Kind(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static com.google.crypto.tink.shaded.protobuf.Field.Kind forNumber(int r1) {
                switch(r1) {
                    case 0: goto L3b;
                    case 1: goto L38;
                    case 2: goto L35;
                    case 3: goto L32;
                    case 4: goto L2f;
                    case 5: goto L2c;
                    case 6: goto L29;
                    case 7: goto L26;
                    case 8: goto L23;
                    case 9: goto L20;
                    case 10: goto L1d;
                    case 11: goto L1a;
                    case 12: goto L17;
                    case 13: goto L14;
                    case 14: goto L11;
                    case 15: goto Le;
                    case 16: goto Lb;
                    case 17: goto L8;
                    case 18: goto L5;
                    default: goto L3;
                }
            L3:
                r0 = 0
                return r0
            L5:
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_SINT64
                return r0
            L8:
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_SINT32
                return r0
            Lb:
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_SFIXED64
                return r0
            Le:
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_SFIXED32
                return r0
            L11:
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_ENUM
                return r0
            L14:
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_UINT32
                return r0
            L17:
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_BYTES
                return r0
            L1a:
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_MESSAGE
                return r0
            L1d:
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_GROUP
                return r0
            L20:
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_STRING
                return r0
            L23:
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_BOOL
                return r0
            L26:
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_FIXED32
                return r0
            L29:
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_FIXED64
                return r0
            L2c:
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_INT32
                return r0
            L2f:
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_UINT64
                return r0
            L32:
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_INT64
                return r0
            L35:
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_FLOAT
                return r0
            L38:
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_DOUBLE
                return r0
            L3b:
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.TYPE_UNKNOWN
                return r0
        }

        public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.shaded.protobuf.Field.Kind> internalGetValueMap() {
                com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<com.google.crypto.tink.shaded.protobuf.Field$Kind> r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.internalValueMap
                return r0
        }

        public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
                com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.KindVerifier.INSTANCE
                return r0
        }

        @java.lang.Deprecated
        public static com.google.crypto.tink.shaded.protobuf.Field.Kind valueOf(int r1) {
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = forNumber(r1)
                return r0
        }

        public static com.google.crypto.tink.shaded.protobuf.Field.Kind valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.shaded.protobuf.Field$Kind> r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = (com.google.crypto.tink.shaded.protobuf.Field.Kind) r0
                return r0
        }

        public static com.google.crypto.tink.shaded.protobuf.Field.Kind[] values() {
                com.google.crypto.tink.shaded.protobuf.Field$Kind[] r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.shaded.protobuf.Field$Kind[] r0 = (com.google.crypto.tink.shaded.protobuf.Field.Kind[]) r0
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
        public final int getNumber() {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.UNRECOGNIZED
                if (r2 == r0) goto L7
                int r0 = r2.value
                return r0
            L7:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Can't get the number of an unknown enum value."
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            com.google.crypto.tink.shaded.protobuf.Field r0 = new com.google.crypto.tink.shaded.protobuf.Field
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE = r0
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Field> r1 = com.google.crypto.tink.shaded.protobuf.Field.class
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private Field() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = ""
            r2.name_ = r0
            r2.typeUrl_ = r0
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r1 = emptyProtobufList()
            r2.options_ = r1
            r2.jsonName_ = r0
            r2.defaultValue_ = r0
            return
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.Field access$000() {
            com.google.crypto.tink.shaded.protobuf.Field r0 = com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ void access$100(com.google.crypto.tink.shaded.protobuf.Field r0, int r1) {
            r0.setKindValue(r1)
            return
    }

    static /* synthetic */ void access$1000(com.google.crypto.tink.shaded.protobuf.Field r0) {
            r0.clearName()
            return
    }

    static /* synthetic */ void access$1100(com.google.crypto.tink.shaded.protobuf.Field r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setNameBytes(r1)
            return
    }

    static /* synthetic */ void access$1200(com.google.crypto.tink.shaded.protobuf.Field r0, java.lang.String r1) {
            r0.setTypeUrl(r1)
            return
    }

    static /* synthetic */ void access$1300(com.google.crypto.tink.shaded.protobuf.Field r0) {
            r0.clearTypeUrl()
            return
    }

    static /* synthetic */ void access$1400(com.google.crypto.tink.shaded.protobuf.Field r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setTypeUrlBytes(r1)
            return
    }

    static /* synthetic */ void access$1500(com.google.crypto.tink.shaded.protobuf.Field r0, int r1) {
            r0.setOneofIndex(r1)
            return
    }

    static /* synthetic */ void access$1600(com.google.crypto.tink.shaded.protobuf.Field r0) {
            r0.clearOneofIndex()
            return
    }

    static /* synthetic */ void access$1700(com.google.crypto.tink.shaded.protobuf.Field r0, boolean r1) {
            r0.setPacked(r1)
            return
    }

    static /* synthetic */ void access$1800(com.google.crypto.tink.shaded.protobuf.Field r0) {
            r0.clearPacked()
            return
    }

    static /* synthetic */ void access$1900(com.google.crypto.tink.shaded.protobuf.Field r0, int r1, com.google.crypto.tink.shaded.protobuf.Option r2) {
            r0.setOptions(r1, r2)
            return
    }

    static /* synthetic */ void access$200(com.google.crypto.tink.shaded.protobuf.Field r0, com.google.crypto.tink.shaded.protobuf.Field.Kind r1) {
            r0.setKind(r1)
            return
    }

    static /* synthetic */ void access$2000(com.google.crypto.tink.shaded.protobuf.Field r0, com.google.crypto.tink.shaded.protobuf.Option r1) {
            r0.addOptions(r1)
            return
    }

    static /* synthetic */ void access$2100(com.google.crypto.tink.shaded.protobuf.Field r0, int r1, com.google.crypto.tink.shaded.protobuf.Option r2) {
            r0.addOptions(r1, r2)
            return
    }

    static /* synthetic */ void access$2200(com.google.crypto.tink.shaded.protobuf.Field r0, java.lang.Iterable r1) {
            r0.addAllOptions(r1)
            return
    }

    static /* synthetic */ void access$2300(com.google.crypto.tink.shaded.protobuf.Field r0) {
            r0.clearOptions()
            return
    }

    static /* synthetic */ void access$2400(com.google.crypto.tink.shaded.protobuf.Field r0, int r1) {
            r0.removeOptions(r1)
            return
    }

    static /* synthetic */ void access$2500(com.google.crypto.tink.shaded.protobuf.Field r0, java.lang.String r1) {
            r0.setJsonName(r1)
            return
    }

    static /* synthetic */ void access$2600(com.google.crypto.tink.shaded.protobuf.Field r0) {
            r0.clearJsonName()
            return
    }

    static /* synthetic */ void access$2700(com.google.crypto.tink.shaded.protobuf.Field r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setJsonNameBytes(r1)
            return
    }

    static /* synthetic */ void access$2800(com.google.crypto.tink.shaded.protobuf.Field r0, java.lang.String r1) {
            r0.setDefaultValue(r1)
            return
    }

    static /* synthetic */ void access$2900(com.google.crypto.tink.shaded.protobuf.Field r0) {
            r0.clearDefaultValue()
            return
    }

    static /* synthetic */ void access$300(com.google.crypto.tink.shaded.protobuf.Field r0) {
            r0.clearKind()
            return
    }

    static /* synthetic */ void access$3000(com.google.crypto.tink.shaded.protobuf.Field r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setDefaultValueBytes(r1)
            return
    }

    static /* synthetic */ void access$400(com.google.crypto.tink.shaded.protobuf.Field r0, int r1) {
            r0.setCardinalityValue(r1)
            return
    }

    static /* synthetic */ void access$500(com.google.crypto.tink.shaded.protobuf.Field r0, com.google.crypto.tink.shaded.protobuf.Field.Cardinality r1) {
            r0.setCardinality(r1)
            return
    }

    static /* synthetic */ void access$600(com.google.crypto.tink.shaded.protobuf.Field r0) {
            r0.clearCardinality()
            return
    }

    static /* synthetic */ void access$700(com.google.crypto.tink.shaded.protobuf.Field r0, int r1) {
            r0.setNumber(r1)
            return
    }

    static /* synthetic */ void access$800(com.google.crypto.tink.shaded.protobuf.Field r0) {
            r0.clearNumber()
            return
    }

    static /* synthetic */ void access$900(com.google.crypto.tink.shaded.protobuf.Field r0, java.lang.String r1) {
            r0.setName(r1)
            return
    }

    private void addAllOptions(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Option> r2) {
            r1 = this;
            r1.ensureOptionsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.addAll(r2, r0)
            return
    }

    private void addOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option r3) {
            r1 = this;
            r3.getClass()
            r1.ensureOptionsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            r0.add(r2, r3)
            return
    }

    private void addOptions(com.google.crypto.tink.shaded.protobuf.Option r2) {
            r1 = this;
            r2.getClass()
            r1.ensureOptionsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            r0.add(r2)
            return
    }

    private void clearCardinality() {
            r1 = this;
            r0 = 0
            r1.cardinality_ = r0
            return
    }

    private void clearDefaultValue() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Field r0 = getDefaultInstance()
            java.lang.String r0 = r0.getDefaultValue()
            r1.defaultValue_ = r0
            return
    }

    private void clearJsonName() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Field r0 = getDefaultInstance()
            java.lang.String r0 = r0.getJsonName()
            r1.jsonName_ = r0
            return
    }

    private void clearKind() {
            r1 = this;
            r0 = 0
            r1.kind_ = r0
            return
    }

    private void clearName() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Field r0 = getDefaultInstance()
            java.lang.String r0 = r0.getName()
            r1.name_ = r0
            return
    }

    private void clearNumber() {
            r1 = this;
            r0 = 0
            r1.number_ = r0
            return
    }

    private void clearOneofIndex() {
            r1 = this;
            r0 = 0
            r1.oneofIndex_ = r0
            return
    }

    private void clearOptions() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = emptyProtobufList()
            r1.options_ = r0
            return
    }

    private void clearPacked() {
            r1 = this;
            r0 = 0
            r1.packed_ = r0
            return
    }

    private void clearTypeUrl() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Field r0 = getDefaultInstance()
            java.lang.String r0 = r0.getTypeUrl()
            r1.typeUrl_ = r0
            return
    }

    private void ensureOptionsIsMutable() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r2.options_
            boolean r1 = r0.isModifiable()
            if (r1 != 0) goto Lf
        L9:
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.mutableCopy(r0)
            r2.options_ = r1
        Lf:
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.Field getDefaultInstance() {
            com.google.crypto.tink.shaded.protobuf.Field r0 = com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Field.Builder newBuilder() {
            com.google.crypto.tink.shaded.protobuf.Field r0 = com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            com.google.crypto.tink.shaded.protobuf.Field$Builder r0 = (com.google.crypto.tink.shaded.protobuf.Field.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Field.Builder newBuilder(com.google.crypto.tink.shaded.protobuf.Field r1) {
            com.google.crypto.tink.shaded.protobuf.Field r0 = com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder(r1)
            com.google.crypto.tink.shaded.protobuf.Field$Builder r0 = (com.google.crypto.tink.shaded.protobuf.Field.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Field parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Field r0 = com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseDelimitedFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Field parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Field r0 = com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseDelimitedFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Field parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Field r0 = com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Field parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Field r0 = com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Field parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Field r0 = com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Field parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Field r0 = com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Field parseFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Field r0 = com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Field parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Field r0 = com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Field parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Field r0 = com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Field parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Field r0 = com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Field parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Field r0 = com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Field parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Field r0 = com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Field r0 = (com.google.crypto.tink.shaded.protobuf.Field) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Field> parser() {
            com.google.crypto.tink.shaded.protobuf.Field r0 = com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.Parser r0 = r0.getParserForType()
            return r0
    }

    private void removeOptions(int r2) {
            r1 = this;
            r1.ensureOptionsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            r0.remove(r2)
            return
    }

    private void setCardinality(com.google.crypto.tink.shaded.protobuf.Field.Cardinality r2) {
            r1 = this;
            int r0 = r2.getNumber()
            r1.cardinality_ = r0
            return
    }

    private void setCardinalityValue(int r1) {
            r0 = this;
            r0.cardinality_ = r1
            return
    }

    private void setDefaultValue(java.lang.String r2) {
            r1 = this;
            java.lang.Class r0 = r2.getClass()
            r1.defaultValue_ = r2
            return
    }

    private void setDefaultValueBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            r1 = this;
            checkByteStringIsUtf8(r2)
            java.lang.String r0 = r2.toStringUtf8()
            r1.defaultValue_ = r0
            return
    }

    private void setJsonName(java.lang.String r2) {
            r1 = this;
            java.lang.Class r0 = r2.getClass()
            r1.jsonName_ = r2
            return
    }

    private void setJsonNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            r1 = this;
            checkByteStringIsUtf8(r2)
            java.lang.String r0 = r2.toStringUtf8()
            r1.jsonName_ = r0
            return
    }

    private void setKind(com.google.crypto.tink.shaded.protobuf.Field.Kind r2) {
            r1 = this;
            int r0 = r2.getNumber()
            r1.kind_ = r0
            return
    }

    private void setKindValue(int r1) {
            r0 = this;
            r0.kind_ = r1
            return
    }

    private void setName(java.lang.String r2) {
            r1 = this;
            java.lang.Class r0 = r2.getClass()
            r1.name_ = r2
            return
    }

    private void setNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            r1 = this;
            checkByteStringIsUtf8(r2)
            java.lang.String r0 = r2.toStringUtf8()
            r1.name_ = r0
            return
    }

    private void setNumber(int r1) {
            r0 = this;
            r0.number_ = r1
            return
    }

    private void setOneofIndex(int r1) {
            r0 = this;
            r0.oneofIndex_ = r1
            return
    }

    private void setOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option r3) {
            r1 = this;
            r3.getClass()
            r1.ensureOptionsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            r0.set(r2, r3)
            return
    }

    private void setPacked(boolean r1) {
            r0 = this;
            r0.packed_ = r1
            return
    }

    private void setTypeUrl(java.lang.String r2) {
            r1 = this;
            java.lang.Class r0 = r2.getClass()
            r1.typeUrl_ = r2
            return
    }

    private void setTypeUrlBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            r1 = this;
            checkByteStringIsUtf8(r2)
            java.lang.String r0 = r2.toStringUtf8()
            r1.typeUrl_ = r0
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r13, java.lang.Object r14, java.lang.Object r15) {
            r12 = this;
            int[] r0 = com.google.crypto.tink.shaded.protobuf.Field.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
            int r1 = r13.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 1: goto L61;
                case 2: goto L5b;
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
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Field> r1 = com.google.crypto.tink.shaded.protobuf.Field.PARSER
            if (r1 != 0) goto L34
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Field> r2 = com.google.crypto.tink.shaded.protobuf.Field.class
            monitor-enter(r2)
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Field> r0 = com.google.crypto.tink.shaded.protobuf.Field.PARSER     // Catch: java.lang.Throwable -> L31
            r1 = r0
            if (r1 != 0) goto L2f
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L31
            com.google.crypto.tink.shaded.protobuf.Field r3 = com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L31
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L31
            r1 = r0
            com.google.crypto.tink.shaded.protobuf.Field.PARSER = r1     // Catch: java.lang.Throwable -> L31
        L2f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            goto L34
        L31:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            throw r0
        L34:
            return r1
        L35:
            com.google.crypto.tink.shaded.protobuf.Field r0 = com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE
            return r0
        L38:
            java.lang.String r1 = "kind_"
            java.lang.String r2 = "cardinality_"
            java.lang.String r3 = "number_"
            java.lang.String r4 = "name_"
            java.lang.String r5 = "typeUrl_"
            java.lang.String r6 = "oneofIndex_"
            java.lang.String r7 = "packed_"
            java.lang.String r8 = "options_"
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Option> r9 = com.google.crypto.tink.shaded.protobuf.Option.class
            java.lang.String r10 = "jsonName_"
            java.lang.String r11 = "defaultValue_"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            java.lang.String r1 = "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ"
            com.google.crypto.tink.shaded.protobuf.Field r2 = com.google.crypto.tink.shaded.protobuf.Field.DEFAULT_INSTANCE
            java.lang.Object r2 = newMessageInfo(r2, r1, r0)
            return r2
        L5b:
            com.google.crypto.tink.shaded.protobuf.Field$Builder r0 = new com.google.crypto.tink.shaded.protobuf.Field$Builder
            r0.<init>(r1)
            return r0
        L61:
            com.google.crypto.tink.shaded.protobuf.Field r0 = new com.google.crypto.tink.shaded.protobuf.Field
            r0.<init>()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public com.google.crypto.tink.shaded.protobuf.Field.Cardinality getCardinality() {
            r2 = this;
            int r0 = r2.cardinality_
            com.google.crypto.tink.shaded.protobuf.Field$Cardinality r0 = com.google.crypto.tink.shaded.protobuf.Field.Cardinality.forNumber(r0)
            if (r0 != 0) goto Lb
            com.google.crypto.tink.shaded.protobuf.Field$Cardinality r1 = com.google.crypto.tink.shaded.protobuf.Field.Cardinality.UNRECOGNIZED
            goto Lc
        Lb:
            r1 = r0
        Lc:
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public int getCardinalityValue() {
            r1 = this;
            int r0 = r1.cardinality_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public java.lang.String getDefaultValue() {
            r1 = this;
            java.lang.String r0 = r1.defaultValue_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getDefaultValueBytes() {
            r1 = this;
            java.lang.String r0 = r1.defaultValue_
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public java.lang.String getJsonName() {
            r1 = this;
            java.lang.String r0 = r1.jsonName_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getJsonNameBytes() {
            r1 = this;
            java.lang.String r0 = r1.jsonName_
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public com.google.crypto.tink.shaded.protobuf.Field.Kind getKind() {
            r2 = this;
            int r0 = r2.kind_
            com.google.crypto.tink.shaded.protobuf.Field$Kind r0 = com.google.crypto.tink.shaded.protobuf.Field.Kind.forNumber(r0)
            if (r0 != 0) goto Lb
            com.google.crypto.tink.shaded.protobuf.Field$Kind r1 = com.google.crypto.tink.shaded.protobuf.Field.Kind.UNRECOGNIZED
            goto Lc
        Lb:
            r1 = r0
        Lc:
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public int getKindValue() {
            r1 = this;
            int r0 = r1.kind_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes() {
            r1 = this;
            java.lang.String r0 = r1.name_
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public int getNumber() {
            r1 = this;
            int r0 = r1.number_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public int getOneofIndex() {
            r1 = this;
            int r0 = r1.oneofIndex_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public com.google.crypto.tink.shaded.protobuf.Option getOptions(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            java.lang.Object r0 = r0.get(r2)
            com.google.crypto.tink.shaded.protobuf.Option r0 = (com.google.crypto.tink.shaded.protobuf.Option) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public int getOptionsCount() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public java.util.List<com.google.crypto.tink.shaded.protobuf.Option> getOptionsList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.OptionOrBuilder getOptionsOrBuilder(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            java.lang.Object r0 = r0.get(r2)
            com.google.crypto.tink.shaded.protobuf.OptionOrBuilder r0 = (com.google.crypto.tink.shaded.protobuf.OptionOrBuilder) r0
            return r0
    }

    public java.util.List<? extends com.google.crypto.tink.shaded.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public boolean getPacked() {
            r1 = this;
            boolean r0 = r1.packed_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public java.lang.String getTypeUrl() {
            r1 = this;
            java.lang.String r0 = r1.typeUrl_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.FieldOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getTypeUrlBytes() {
            r1 = this;
            java.lang.String r0 = r1.typeUrl_
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
            return r0
    }
}
