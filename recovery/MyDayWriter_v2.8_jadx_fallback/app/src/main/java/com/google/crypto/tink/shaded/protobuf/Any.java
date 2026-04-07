package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Any extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.shaded.protobuf.Any, com.google.crypto.tink.shaded.protobuf.Any.Builder> implements com.google.crypto.tink.shaded.protobuf.AnyOrBuilder {
    private static final com.google.crypto.tink.shaded.protobuf.Any DEFAULT_INSTANCE = null;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Any> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private java.lang.String typeUrl_;
    private com.google.crypto.tink.shaded.protobuf.ByteString value_;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.Any$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.Any.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Any.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Any.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Any.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Any.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Any.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Any.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L56
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L56
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L56
                goto L57
            L56:
                r0 = move-exception
            L57:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Any.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L63
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

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.shaded.protobuf.Any, com.google.crypto.tink.shaded.protobuf.Any.Builder> implements com.google.crypto.tink.shaded.protobuf.AnyOrBuilder {
        private Builder() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.Any r0 = com.google.crypto.tink.shaded.protobuf.Any.access$000()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.Any.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.crypto.tink.shaded.protobuf.Any.Builder clearTypeUrl() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Any r0 = (com.google.crypto.tink.shaded.protobuf.Any) r0
                com.google.crypto.tink.shaded.protobuf.Any.access$200(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Any.Builder clearValue() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Any r0 = (com.google.crypto.tink.shaded.protobuf.Any) r0
                com.google.crypto.tink.shaded.protobuf.Any.access$500(r0)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AnyOrBuilder
        public java.lang.String getTypeUrl() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Any r0 = (com.google.crypto.tink.shaded.protobuf.Any) r0
                java.lang.String r0 = r0.getTypeUrl()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AnyOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getTypeUrlBytes() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Any r0 = (com.google.crypto.tink.shaded.protobuf.Any) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getTypeUrlBytes()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AnyOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Any r0 = (com.google.crypto.tink.shaded.protobuf.Any) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValue()
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.Any.Builder setTypeUrl(java.lang.String r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Any r0 = (com.google.crypto.tink.shaded.protobuf.Any) r0
                com.google.crypto.tink.shaded.protobuf.Any.access$100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Any.Builder setTypeUrlBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Any r0 = (com.google.crypto.tink.shaded.protobuf.Any) r0
                com.google.crypto.tink.shaded.protobuf.Any.access$300(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Any.Builder setValue(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Any r0 = (com.google.crypto.tink.shaded.protobuf.Any) r0
                com.google.crypto.tink.shaded.protobuf.Any.access$400(r0, r2)
                return r1
        }
    }

    static {
            com.google.crypto.tink.shaded.protobuf.Any r0 = new com.google.crypto.tink.shaded.protobuf.Any
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE = r0
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Any> r1 = com.google.crypto.tink.shaded.protobuf.Any.class
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private Any() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.typeUrl_ = r0
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            r1.value_ = r0
            return
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.Any access$000() {
            com.google.crypto.tink.shaded.protobuf.Any r0 = com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ void access$100(com.google.crypto.tink.shaded.protobuf.Any r0, java.lang.String r1) {
            r0.setTypeUrl(r1)
            return
    }

    static /* synthetic */ void access$200(com.google.crypto.tink.shaded.protobuf.Any r0) {
            r0.clearTypeUrl()
            return
    }

    static /* synthetic */ void access$300(com.google.crypto.tink.shaded.protobuf.Any r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setTypeUrlBytes(r1)
            return
    }

    static /* synthetic */ void access$400(com.google.crypto.tink.shaded.protobuf.Any r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setValue(r1)
            return
    }

    static /* synthetic */ void access$500(com.google.crypto.tink.shaded.protobuf.Any r0) {
            r0.clearValue()
            return
    }

    private void clearTypeUrl() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Any r0 = getDefaultInstance()
            java.lang.String r0 = r0.getTypeUrl()
            r1.typeUrl_ = r0
            return
    }

    private void clearValue() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Any r0 = getDefaultInstance()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getValue()
            r1.value_ = r0
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.Any getDefaultInstance() {
            com.google.crypto.tink.shaded.protobuf.Any r0 = com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Any.Builder newBuilder() {
            com.google.crypto.tink.shaded.protobuf.Any r0 = com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            com.google.crypto.tink.shaded.protobuf.Any$Builder r0 = (com.google.crypto.tink.shaded.protobuf.Any.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Any.Builder newBuilder(com.google.crypto.tink.shaded.protobuf.Any r1) {
            com.google.crypto.tink.shaded.protobuf.Any r0 = com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder(r1)
            com.google.crypto.tink.shaded.protobuf.Any$Builder r0 = (com.google.crypto.tink.shaded.protobuf.Any.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Any parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Any r0 = com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseDelimitedFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Any r0 = (com.google.crypto.tink.shaded.protobuf.Any) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Any parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Any r0 = com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseDelimitedFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Any r0 = (com.google.crypto.tink.shaded.protobuf.Any) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Any parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Any r0 = com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Any r0 = (com.google.crypto.tink.shaded.protobuf.Any) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Any parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Any r0 = com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Any r0 = (com.google.crypto.tink.shaded.protobuf.Any) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Any parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Any r0 = com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Any r0 = (com.google.crypto.tink.shaded.protobuf.Any) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Any parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Any r0 = com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Any r0 = (com.google.crypto.tink.shaded.protobuf.Any) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Any parseFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Any r0 = com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Any r0 = (com.google.crypto.tink.shaded.protobuf.Any) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Any parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Any r0 = com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Any r0 = (com.google.crypto.tink.shaded.protobuf.Any) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Any parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Any r0 = com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Any r0 = (com.google.crypto.tink.shaded.protobuf.Any) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Any parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Any r0 = com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Any r0 = (com.google.crypto.tink.shaded.protobuf.Any) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Any parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Any r0 = com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Any r0 = (com.google.crypto.tink.shaded.protobuf.Any) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Any parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Any r0 = com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Any r0 = (com.google.crypto.tink.shaded.protobuf.Any) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Any> parser() {
            com.google.crypto.tink.shaded.protobuf.Any r0 = com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.Parser r0 = r0.getParserForType()
            return r0
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

    private void setValue(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            r1 = this;
            java.lang.Class r0 = r2.getClass()
            r1.value_ = r2
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            int[] r0 = com.google.crypto.tink.shaded.protobuf.Any.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
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
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Any> r0 = com.google.crypto.tink.shaded.protobuf.Any.PARSER
            if (r0 != 0) goto L34
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Any> r1 = com.google.crypto.tink.shaded.protobuf.Any.class
            monitor-enter(r1)
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Any> r2 = com.google.crypto.tink.shaded.protobuf.Any.PARSER     // Catch: java.lang.Throwable -> L31
            r0 = r2
            if (r0 != 0) goto L2f
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r2 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L31
            com.google.crypto.tink.shaded.protobuf.Any r3 = com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L31
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L31
            r0 = r2
            com.google.crypto.tink.shaded.protobuf.Any.PARSER = r0     // Catch: java.lang.Throwable -> L31
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
            com.google.crypto.tink.shaded.protobuf.Any r0 = com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE
            return r0
        L38:
            java.lang.String r0 = "typeUrl_"
            java.lang.String r1 = "value_"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n"
            com.google.crypto.tink.shaded.protobuf.Any r2 = com.google.crypto.tink.shaded.protobuf.Any.DEFAULT_INSTANCE
            java.lang.Object r2 = newMessageInfo(r2, r1, r0)
            return r2
        L49:
            com.google.crypto.tink.shaded.protobuf.Any$Builder r0 = new com.google.crypto.tink.shaded.protobuf.Any$Builder
            r0.<init>(r1)
            return r0
        L4f:
            com.google.crypto.tink.shaded.protobuf.Any r0 = new com.google.crypto.tink.shaded.protobuf.Any
            r0.<init>()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AnyOrBuilder
    public java.lang.String getTypeUrl() {
            r1 = this;
            java.lang.String r0 = r1.typeUrl_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AnyOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getTypeUrlBytes() {
            r1 = this;
            java.lang.String r0 = r1.typeUrl_
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AnyOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getValue() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.value_
            return r0
    }
}
