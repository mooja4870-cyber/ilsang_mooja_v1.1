package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Value extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.shaded.protobuf.Value, com.google.crypto.tink.shaded.protobuf.Value.Builder> implements com.google.crypto.tink.shaded.protobuf.ValueOrBuilder {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final com.google.crypto.tink.shaded.protobuf.Value DEFAULT_INSTANCE = null;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Value> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_;
    private java.lang.Object kind_;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.Value$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.Value.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Value.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Value.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Value.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Value.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Value.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Value.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L56
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L56
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L56
                goto L57
            L56:
                r0 = move-exception
            L57:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Value.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L63
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

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.shaded.protobuf.Value, com.google.crypto.tink.shaded.protobuf.Value.Builder> implements com.google.crypto.tink.shaded.protobuf.ValueOrBuilder {
        private Builder() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.Value r0 = com.google.crypto.tink.shaded.protobuf.Value.access$000()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.Value.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.crypto.tink.shaded.protobuf.Value.Builder clearBoolValue() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.Value.access$1100(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Value.Builder clearKind() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.Value.access$100(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Value.Builder clearListValue() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.Value.access$1700(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Value.Builder clearNullValue() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.Value.access$400(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Value.Builder clearNumberValue() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.Value.access$600(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Value.Builder clearStringValue() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.Value.access$800(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Value.Builder clearStructValue() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.Value.access$1400(r0)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public boolean getBoolValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                boolean r0 = r0.getBoolValue()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public com.google.crypto.tink.shaded.protobuf.Value.KindCase getKindCase() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r0 = r0.getKindCase()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ListValue getListValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.ListValue r0 = r0.getListValue()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public com.google.crypto.tink.shaded.protobuf.NullValue getNullValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.NullValue r0 = r0.getNullValue()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public int getNullValueValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                int r0 = r0.getNullValueValue()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public double getNumberValue() {
                r2 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                double r0 = r0.getNumberValue()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public java.lang.String getStringValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                java.lang.String r0 = r0.getStringValue()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getStringValueBytes() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getStringValueBytes()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public com.google.crypto.tink.shaded.protobuf.Struct getStructValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.Struct r0 = r0.getStructValue()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public boolean hasBoolValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                boolean r0 = r0.hasBoolValue()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public boolean hasListValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                boolean r0 = r0.hasListValue()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public boolean hasNullValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                boolean r0 = r0.hasNullValue()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public boolean hasNumberValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                boolean r0 = r0.hasNumberValue()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public boolean hasStringValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                boolean r0 = r0.hasStringValue()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public boolean hasStructValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                boolean r0 = r0.hasStructValue()
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.Value.Builder mergeListValue(com.google.crypto.tink.shaded.protobuf.ListValue r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.Value.access$1600(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Value.Builder mergeStructValue(com.google.crypto.tink.shaded.protobuf.Struct r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.Value.access$1300(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Value.Builder setBoolValue(boolean r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.Value.access$1000(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Value.Builder setListValue(com.google.crypto.tink.shaded.protobuf.ListValue.Builder r3) {
                r2 = this;
                r2.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r3.build()
                com.google.crypto.tink.shaded.protobuf.ListValue r1 = (com.google.crypto.tink.shaded.protobuf.ListValue) r1
                com.google.crypto.tink.shaded.protobuf.Value.access$1500(r0, r1)
                return r2
        }

        public com.google.crypto.tink.shaded.protobuf.Value.Builder setListValue(com.google.crypto.tink.shaded.protobuf.ListValue r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.Value.access$1500(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Value.Builder setNullValue(com.google.crypto.tink.shaded.protobuf.NullValue r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.Value.access$300(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Value.Builder setNullValueValue(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.Value.access$200(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Value.Builder setNumberValue(double r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.Value.access$500(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Value.Builder setStringValue(java.lang.String r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.Value.access$700(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Value.Builder setStringValueBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.Value.access$900(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Value.Builder setStructValue(com.google.crypto.tink.shaded.protobuf.Struct.Builder r3) {
                r2 = this;
                r2.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r3.build()
                com.google.crypto.tink.shaded.protobuf.Struct r1 = (com.google.crypto.tink.shaded.protobuf.Struct) r1
                com.google.crypto.tink.shaded.protobuf.Value.access$1200(r0, r1)
                return r2
        }

        public com.google.crypto.tink.shaded.protobuf.Value.Builder setStructValue(com.google.crypto.tink.shaded.protobuf.Struct r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
                com.google.crypto.tink.shaded.protobuf.Value.access$1200(r0, r2)
                return r1
        }
    }

    public enum KindCase extends java.lang.Enum<com.google.crypto.tink.shaded.protobuf.Value.KindCase> {
        private static final /* synthetic */ com.google.crypto.tink.shaded.protobuf.Value.KindCase[] $VALUES = null;
        public static final com.google.crypto.tink.shaded.protobuf.Value.KindCase BOOL_VALUE = null;
        public static final com.google.crypto.tink.shaded.protobuf.Value.KindCase KIND_NOT_SET = null;
        public static final com.google.crypto.tink.shaded.protobuf.Value.KindCase LIST_VALUE = null;
        public static final com.google.crypto.tink.shaded.protobuf.Value.KindCase NULL_VALUE = null;
        public static final com.google.crypto.tink.shaded.protobuf.Value.KindCase NUMBER_VALUE = null;
        public static final com.google.crypto.tink.shaded.protobuf.Value.KindCase STRING_VALUE = null;
        public static final com.google.crypto.tink.shaded.protobuf.Value.KindCase STRUCT_VALUE = null;
        private final int value;

        static {
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r0 = new com.google.crypto.tink.shaded.protobuf.Value$KindCase
                java.lang.String r1 = "NULL_VALUE"
                r2 = 0
                r3 = 1
                r0.<init>(r1, r2, r3)
                com.google.crypto.tink.shaded.protobuf.Value.KindCase.NULL_VALUE = r0
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r0 = new com.google.crypto.tink.shaded.protobuf.Value$KindCase
                java.lang.String r1 = "NUMBER_VALUE"
                r4 = 2
                r0.<init>(r1, r3, r4)
                com.google.crypto.tink.shaded.protobuf.Value.KindCase.NUMBER_VALUE = r0
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r0 = new com.google.crypto.tink.shaded.protobuf.Value$KindCase
                java.lang.String r1 = "STRING_VALUE"
                r3 = 3
                r0.<init>(r1, r4, r3)
                com.google.crypto.tink.shaded.protobuf.Value.KindCase.STRING_VALUE = r0
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r0 = new com.google.crypto.tink.shaded.protobuf.Value$KindCase
                java.lang.String r1 = "BOOL_VALUE"
                r4 = 4
                r0.<init>(r1, r3, r4)
                com.google.crypto.tink.shaded.protobuf.Value.KindCase.BOOL_VALUE = r0
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r0 = new com.google.crypto.tink.shaded.protobuf.Value$KindCase
                java.lang.String r1 = "STRUCT_VALUE"
                r3 = 5
                r0.<init>(r1, r4, r3)
                com.google.crypto.tink.shaded.protobuf.Value.KindCase.STRUCT_VALUE = r0
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r0 = new com.google.crypto.tink.shaded.protobuf.Value$KindCase
                java.lang.String r1 = "LIST_VALUE"
                r4 = 6
                r0.<init>(r1, r3, r4)
                com.google.crypto.tink.shaded.protobuf.Value.KindCase.LIST_VALUE = r0
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r0 = new com.google.crypto.tink.shaded.protobuf.Value$KindCase
                java.lang.String r1 = "KIND_NOT_SET"
                r0.<init>(r1, r4, r2)
                com.google.crypto.tink.shaded.protobuf.Value.KindCase.KIND_NOT_SET = r0
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r5 = com.google.crypto.tink.shaded.protobuf.Value.KindCase.NULL_VALUE
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r6 = com.google.crypto.tink.shaded.protobuf.Value.KindCase.NUMBER_VALUE
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r7 = com.google.crypto.tink.shaded.protobuf.Value.KindCase.STRING_VALUE
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r8 = com.google.crypto.tink.shaded.protobuf.Value.KindCase.BOOL_VALUE
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r9 = com.google.crypto.tink.shaded.protobuf.Value.KindCase.STRUCT_VALUE
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r10 = com.google.crypto.tink.shaded.protobuf.Value.KindCase.LIST_VALUE
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r11 = com.google.crypto.tink.shaded.protobuf.Value.KindCase.KIND_NOT_SET
                com.google.crypto.tink.shaded.protobuf.Value$KindCase[] r0 = new com.google.crypto.tink.shaded.protobuf.Value.KindCase[]{r5, r6, r7, r8, r9, r10, r11}
                com.google.crypto.tink.shaded.protobuf.Value.KindCase.$VALUES = r0
                return
        }

        KindCase(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static com.google.crypto.tink.shaded.protobuf.Value.KindCase forNumber(int r1) {
                switch(r1) {
                    case 0: goto L17;
                    case 1: goto L14;
                    case 2: goto L11;
                    case 3: goto Le;
                    case 4: goto Lb;
                    case 5: goto L8;
                    case 6: goto L5;
                    default: goto L3;
                }
            L3:
                r0 = 0
                return r0
            L5:
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r0 = com.google.crypto.tink.shaded.protobuf.Value.KindCase.LIST_VALUE
                return r0
            L8:
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r0 = com.google.crypto.tink.shaded.protobuf.Value.KindCase.STRUCT_VALUE
                return r0
            Lb:
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r0 = com.google.crypto.tink.shaded.protobuf.Value.KindCase.BOOL_VALUE
                return r0
            Le:
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r0 = com.google.crypto.tink.shaded.protobuf.Value.KindCase.STRING_VALUE
                return r0
            L11:
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r0 = com.google.crypto.tink.shaded.protobuf.Value.KindCase.NUMBER_VALUE
                return r0
            L14:
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r0 = com.google.crypto.tink.shaded.protobuf.Value.KindCase.NULL_VALUE
                return r0
            L17:
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r0 = com.google.crypto.tink.shaded.protobuf.Value.KindCase.KIND_NOT_SET
                return r0
        }

        @java.lang.Deprecated
        public static com.google.crypto.tink.shaded.protobuf.Value.KindCase valueOf(int r1) {
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r0 = forNumber(r1)
                return r0
        }

        public static com.google.crypto.tink.shaded.protobuf.Value.KindCase valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.shaded.protobuf.Value$KindCase> r0 = com.google.crypto.tink.shaded.protobuf.Value.KindCase.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.shaded.protobuf.Value$KindCase r0 = (com.google.crypto.tink.shaded.protobuf.Value.KindCase) r0
                return r0
        }

        public static com.google.crypto.tink.shaded.protobuf.Value.KindCase[] values() {
                com.google.crypto.tink.shaded.protobuf.Value$KindCase[] r0 = com.google.crypto.tink.shaded.protobuf.Value.KindCase.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.shaded.protobuf.Value$KindCase[] r0 = (com.google.crypto.tink.shaded.protobuf.Value.KindCase[]) r0
                return r0
        }

        public int getNumber() {
                r1 = this;
                int r0 = r1.value
                return r0
        }
    }

    static {
            com.google.crypto.tink.shaded.protobuf.Value r0 = new com.google.crypto.tink.shaded.protobuf.Value
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE = r0
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Value> r1 = com.google.crypto.tink.shaded.protobuf.Value.class
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private Value() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.kindCase_ = r0
            return
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.Value access$000() {
            com.google.crypto.tink.shaded.protobuf.Value r0 = com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ void access$100(com.google.crypto.tink.shaded.protobuf.Value r0) {
            r0.clearKind()
            return
    }

    static /* synthetic */ void access$1000(com.google.crypto.tink.shaded.protobuf.Value r0, boolean r1) {
            r0.setBoolValue(r1)
            return
    }

    static /* synthetic */ void access$1100(com.google.crypto.tink.shaded.protobuf.Value r0) {
            r0.clearBoolValue()
            return
    }

    static /* synthetic */ void access$1200(com.google.crypto.tink.shaded.protobuf.Value r0, com.google.crypto.tink.shaded.protobuf.Struct r1) {
            r0.setStructValue(r1)
            return
    }

    static /* synthetic */ void access$1300(com.google.crypto.tink.shaded.protobuf.Value r0, com.google.crypto.tink.shaded.protobuf.Struct r1) {
            r0.mergeStructValue(r1)
            return
    }

    static /* synthetic */ void access$1400(com.google.crypto.tink.shaded.protobuf.Value r0) {
            r0.clearStructValue()
            return
    }

    static /* synthetic */ void access$1500(com.google.crypto.tink.shaded.protobuf.Value r0, com.google.crypto.tink.shaded.protobuf.ListValue r1) {
            r0.setListValue(r1)
            return
    }

    static /* synthetic */ void access$1600(com.google.crypto.tink.shaded.protobuf.Value r0, com.google.crypto.tink.shaded.protobuf.ListValue r1) {
            r0.mergeListValue(r1)
            return
    }

    static /* synthetic */ void access$1700(com.google.crypto.tink.shaded.protobuf.Value r0) {
            r0.clearListValue()
            return
    }

    static /* synthetic */ void access$200(com.google.crypto.tink.shaded.protobuf.Value r0, int r1) {
            r0.setNullValueValue(r1)
            return
    }

    static /* synthetic */ void access$300(com.google.crypto.tink.shaded.protobuf.Value r0, com.google.crypto.tink.shaded.protobuf.NullValue r1) {
            r0.setNullValue(r1)
            return
    }

    static /* synthetic */ void access$400(com.google.crypto.tink.shaded.protobuf.Value r0) {
            r0.clearNullValue()
            return
    }

    static /* synthetic */ void access$500(com.google.crypto.tink.shaded.protobuf.Value r0, double r1) {
            r0.setNumberValue(r1)
            return
    }

    static /* synthetic */ void access$600(com.google.crypto.tink.shaded.protobuf.Value r0) {
            r0.clearNumberValue()
            return
    }

    static /* synthetic */ void access$700(com.google.crypto.tink.shaded.protobuf.Value r0, java.lang.String r1) {
            r0.setStringValue(r1)
            return
    }

    static /* synthetic */ void access$800(com.google.crypto.tink.shaded.protobuf.Value r0) {
            r0.clearStringValue()
            return
    }

    static /* synthetic */ void access$900(com.google.crypto.tink.shaded.protobuf.Value r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setStringValueBytes(r1)
            return
    }

    private void clearBoolValue() {
            r2 = this;
            int r0 = r2.kindCase_
            r1 = 4
            if (r0 != r1) goto Lb
            r0 = 0
            r2.kindCase_ = r0
            r0 = 0
            r2.kind_ = r0
        Lb:
            return
    }

    private void clearKind() {
            r1 = this;
            r0 = 0
            r1.kindCase_ = r0
            r0 = 0
            r1.kind_ = r0
            return
    }

    private void clearListValue() {
            r2 = this;
            int r0 = r2.kindCase_
            r1 = 6
            if (r0 != r1) goto Lb
            r0 = 0
            r2.kindCase_ = r0
            r0 = 0
            r2.kind_ = r0
        Lb:
            return
    }

    private void clearNullValue() {
            r2 = this;
            int r0 = r2.kindCase_
            r1 = 1
            if (r0 != r1) goto Lb
            r0 = 0
            r2.kindCase_ = r0
            r0 = 0
            r2.kind_ = r0
        Lb:
            return
    }

    private void clearNumberValue() {
            r2 = this;
            int r0 = r2.kindCase_
            r1 = 2
            if (r0 != r1) goto Lb
            r0 = 0
            r2.kindCase_ = r0
            r0 = 0
            r2.kind_ = r0
        Lb:
            return
    }

    private void clearStringValue() {
            r2 = this;
            int r0 = r2.kindCase_
            r1 = 3
            if (r0 != r1) goto Lb
            r0 = 0
            r2.kindCase_ = r0
            r0 = 0
            r2.kind_ = r0
        Lb:
            return
    }

    private void clearStructValue() {
            r2 = this;
            int r0 = r2.kindCase_
            r1 = 5
            if (r0 != r1) goto Lb
            r0 = 0
            r2.kindCase_ = r0
            r0 = 0
            r2.kind_ = r0
        Lb:
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.Value getDefaultInstance() {
            com.google.crypto.tink.shaded.protobuf.Value r0 = com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE
            return r0
    }

    private void mergeListValue(com.google.crypto.tink.shaded.protobuf.ListValue r4) {
            r3 = this;
            r4.getClass()
            int r0 = r3.kindCase_
            r1 = 6
            if (r0 != r1) goto L25
            java.lang.Object r0 = r3.kind_
            com.google.crypto.tink.shaded.protobuf.ListValue r2 = com.google.crypto.tink.shaded.protobuf.ListValue.getDefaultInstance()
            if (r0 == r2) goto L25
            java.lang.Object r0 = r3.kind_
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = (com.google.crypto.tink.shaded.protobuf.ListValue) r0
            com.google.crypto.tink.shaded.protobuf.ListValue$Builder r0 = com.google.crypto.tink.shaded.protobuf.ListValue.newBuilder(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.mergeFrom(r4)
            com.google.crypto.tink.shaded.protobuf.ListValue$Builder r0 = (com.google.crypto.tink.shaded.protobuf.ListValue.Builder) r0
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.buildPartial()
            r3.kind_ = r0
            goto L27
        L25:
            r3.kind_ = r4
        L27:
            r3.kindCase_ = r1
            return
    }

    private void mergeStructValue(com.google.crypto.tink.shaded.protobuf.Struct r4) {
            r3 = this;
            r4.getClass()
            int r0 = r3.kindCase_
            r1 = 5
            if (r0 != r1) goto L25
            java.lang.Object r0 = r3.kind_
            com.google.crypto.tink.shaded.protobuf.Struct r2 = com.google.crypto.tink.shaded.protobuf.Struct.getDefaultInstance()
            if (r0 == r2) goto L25
            java.lang.Object r0 = r3.kind_
            com.google.crypto.tink.shaded.protobuf.Struct r0 = (com.google.crypto.tink.shaded.protobuf.Struct) r0
            com.google.crypto.tink.shaded.protobuf.Struct$Builder r0 = com.google.crypto.tink.shaded.protobuf.Struct.newBuilder(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.mergeFrom(r4)
            com.google.crypto.tink.shaded.protobuf.Struct$Builder r0 = (com.google.crypto.tink.shaded.protobuf.Struct.Builder) r0
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.buildPartial()
            r3.kind_ = r0
            goto L27
        L25:
            r3.kind_ = r4
        L27:
            r3.kindCase_ = r1
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.Value.Builder newBuilder() {
            com.google.crypto.tink.shaded.protobuf.Value r0 = com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            com.google.crypto.tink.shaded.protobuf.Value$Builder r0 = (com.google.crypto.tink.shaded.protobuf.Value.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Value.Builder newBuilder(com.google.crypto.tink.shaded.protobuf.Value r1) {
            com.google.crypto.tink.shaded.protobuf.Value r0 = com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder(r1)
            com.google.crypto.tink.shaded.protobuf.Value$Builder r0 = (com.google.crypto.tink.shaded.protobuf.Value.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Value r0 = com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseDelimitedFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Value r0 = com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseDelimitedFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Value r0 = com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Value r0 = com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Value r0 = com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Value r0 = com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Value r0 = com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Value r0 = com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Value r0 = com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Value r0 = com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Value r0 = com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Value r0 = com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Value r0 = (com.google.crypto.tink.shaded.protobuf.Value) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Value> parser() {
            com.google.crypto.tink.shaded.protobuf.Value r0 = com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.Parser r0 = r0.getParserForType()
            return r0
    }

    private void setBoolValue(boolean r2) {
            r1 = this;
            r0 = 4
            r1.kindCase_ = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.kind_ = r0
            return
    }

    private void setListValue(com.google.crypto.tink.shaded.protobuf.ListValue r2) {
            r1 = this;
            r2.getClass()
            r1.kind_ = r2
            r0 = 6
            r1.kindCase_ = r0
            return
    }

    private void setNullValue(com.google.crypto.tink.shaded.protobuf.NullValue r2) {
            r1 = this;
            int r0 = r2.getNumber()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.kind_ = r0
            r0 = 1
            r1.kindCase_ = r0
            return
    }

    private void setNullValueValue(int r2) {
            r1 = this;
            r0 = 1
            r1.kindCase_ = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.kind_ = r0
            return
    }

    private void setNumberValue(double r2) {
            r1 = this;
            r0 = 2
            r1.kindCase_ = r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r1.kind_ = r0
            return
    }

    private void setStringValue(java.lang.String r3) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()
            r1 = 3
            r2.kindCase_ = r1
            r2.kind_ = r3
            return
    }

    private void setStringValueBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            r1 = this;
            checkByteStringIsUtf8(r2)
            java.lang.String r0 = r2.toStringUtf8()
            r1.kind_ = r0
            r0 = 3
            r1.kindCase_ = r0
            return
    }

    private void setStructValue(com.google.crypto.tink.shaded.protobuf.Struct r2) {
            r1 = this;
            r2.getClass()
            r1.kind_ = r2
            r0 = 5
            r1.kindCase_ = r0
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            int[] r0 = com.google.crypto.tink.shaded.protobuf.Value.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
            int r1 = r5.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 1: goto L53;
                case 2: goto L4d;
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
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Value> r0 = com.google.crypto.tink.shaded.protobuf.Value.PARSER
            if (r0 != 0) goto L34
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Value> r1 = com.google.crypto.tink.shaded.protobuf.Value.class
            monitor-enter(r1)
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Value> r2 = com.google.crypto.tink.shaded.protobuf.Value.PARSER     // Catch: java.lang.Throwable -> L31
            r0 = r2
            if (r0 != 0) goto L2f
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r2 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L31
            com.google.crypto.tink.shaded.protobuf.Value r3 = com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L31
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L31
            r0 = r2
            com.google.crypto.tink.shaded.protobuf.Value.PARSER = r0     // Catch: java.lang.Throwable -> L31
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
            com.google.crypto.tink.shaded.protobuf.Value r0 = com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE
            return r0
        L38:
            java.lang.String r0 = "kind_"
            java.lang.String r1 = "kindCase_"
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Struct> r2 = com.google.crypto.tink.shaded.protobuf.Struct.class
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.ListValue> r3 = com.google.crypto.tink.shaded.protobuf.ListValue.class
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
            java.lang.String r1 = "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000"
            com.google.crypto.tink.shaded.protobuf.Value r2 = com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE
            java.lang.Object r2 = newMessageInfo(r2, r1, r0)
            return r2
        L4d:
            com.google.crypto.tink.shaded.protobuf.Value$Builder r0 = new com.google.crypto.tink.shaded.protobuf.Value$Builder
            r0.<init>(r1)
            return r0
        L53:
            com.google.crypto.tink.shaded.protobuf.Value r0 = new com.google.crypto.tink.shaded.protobuf.Value
            r0.<init>()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public boolean getBoolValue() {
            r2 = this;
            int r0 = r2.kindCase_
            r1 = 4
            if (r0 != r1) goto Le
            java.lang.Object r0 = r2.kind_
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public com.google.crypto.tink.shaded.protobuf.Value.KindCase getKindCase() {
            r1 = this;
            int r0 = r1.kindCase_
            com.google.crypto.tink.shaded.protobuf.Value$KindCase r0 = com.google.crypto.tink.shaded.protobuf.Value.KindCase.forNumber(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ListValue getListValue() {
            r2 = this;
            int r0 = r2.kindCase_
            r1 = 6
            if (r0 != r1) goto La
            java.lang.Object r0 = r2.kind_
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = (com.google.crypto.tink.shaded.protobuf.ListValue) r0
            return r0
        La:
            com.google.crypto.tink.shaded.protobuf.ListValue r0 = com.google.crypto.tink.shaded.protobuf.ListValue.getDefaultInstance()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public com.google.crypto.tink.shaded.protobuf.NullValue getNullValue() {
            r2 = this;
            int r0 = r2.kindCase_
            r1 = 1
            if (r0 != r1) goto L18
            java.lang.Object r0 = r2.kind_
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.google.crypto.tink.shaded.protobuf.NullValue r0 = com.google.crypto.tink.shaded.protobuf.NullValue.forNumber(r0)
            if (r0 != 0) goto L16
            com.google.crypto.tink.shaded.protobuf.NullValue r1 = com.google.crypto.tink.shaded.protobuf.NullValue.UNRECOGNIZED
            goto L17
        L16:
            r1 = r0
        L17:
            return r1
        L18:
            com.google.crypto.tink.shaded.protobuf.NullValue r0 = com.google.crypto.tink.shaded.protobuf.NullValue.NULL_VALUE
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public int getNullValueValue() {
            r2 = this;
            int r0 = r2.kindCase_
            r1 = 1
            if (r0 != r1) goto Le
            java.lang.Object r0 = r2.kind_
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public double getNumberValue() {
            r2 = this;
            int r0 = r2.kindCase_
            r1 = 2
            if (r0 != r1) goto Le
            java.lang.Object r0 = r2.kind_
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public java.lang.String getStringValue() {
            r3 = this;
            java.lang.String r0 = ""
            int r1 = r3.kindCase_
            r2 = 3
            if (r1 != r2) goto Lc
            java.lang.Object r1 = r3.kind_
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
        Lc:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getStringValueBytes() {
            r3 = this;
            java.lang.String r0 = ""
            int r1 = r3.kindCase_
            r2 = 3
            if (r1 != r2) goto Lc
            java.lang.Object r1 = r3.kind_
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
        Lc:
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public com.google.crypto.tink.shaded.protobuf.Struct getStructValue() {
            r2 = this;
            int r0 = r2.kindCase_
            r1 = 5
            if (r0 != r1) goto La
            java.lang.Object r0 = r2.kind_
            com.google.crypto.tink.shaded.protobuf.Struct r0 = (com.google.crypto.tink.shaded.protobuf.Struct) r0
            return r0
        La:
            com.google.crypto.tink.shaded.protobuf.Struct r0 = com.google.crypto.tink.shaded.protobuf.Struct.getDefaultInstance()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public boolean hasBoolValue() {
            r2 = this;
            int r0 = r2.kindCase_
            r1 = 4
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public boolean hasListValue() {
            r2 = this;
            int r0 = r2.kindCase_
            r1 = 6
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public boolean hasNullValue() {
            r2 = this;
            int r0 = r2.kindCase_
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public boolean hasNumberValue() {
            r2 = this;
            int r0 = r2.kindCase_
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public boolean hasStringValue() {
            r2 = this;
            int r0 = r2.kindCase_
            r1 = 3
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public boolean hasStructValue() {
            r2 = this;
            int r0 = r2.kindCase_
            r1 = 5
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }
}
