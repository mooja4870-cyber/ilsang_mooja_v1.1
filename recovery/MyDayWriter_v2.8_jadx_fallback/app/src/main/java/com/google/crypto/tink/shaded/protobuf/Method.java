package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class Method extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.shaded.protobuf.Method, com.google.crypto.tink.shaded.protobuf.Method.Builder> implements com.google.crypto.tink.shaded.protobuf.MethodOrBuilder {
    private static final com.google.crypto.tink.shaded.protobuf.Method DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Method> PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private java.lang.String name_;
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> options_;
    private boolean requestStreaming_;
    private java.lang.String requestTypeUrl_;
    private boolean responseStreaming_;
    private java.lang.String responseTypeUrl_;
    private int syntax_;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.Method$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.Method.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Method.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Method.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Method.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Method.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Method.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Method.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L56
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L56
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L56
                goto L57
            L56:
                r0 = move-exception
            L57:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.Method.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L63
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

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.shaded.protobuf.Method, com.google.crypto.tink.shaded.protobuf.Method.Builder> implements com.google.crypto.tink.shaded.protobuf.MethodOrBuilder {
        private Builder() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.Method r0 = com.google.crypto.tink.shaded.protobuf.Method.access$000()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.Method.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder addAllOptions(java.lang.Iterable<? extends com.google.crypto.tink.shaded.protobuf.Option> r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$1700(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder addOptions(int r3, com.google.crypto.tink.shaded.protobuf.Option.Builder r4) {
                r2 = this;
                r2.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r4.build()
                com.google.crypto.tink.shaded.protobuf.Option r1 = (com.google.crypto.tink.shaded.protobuf.Option) r1
                com.google.crypto.tink.shaded.protobuf.Method.access$1600(r0, r3, r1)
                return r2
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder addOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$1600(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder addOptions(com.google.crypto.tink.shaded.protobuf.Option.Builder r3) {
                r2 = this;
                r2.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r3.build()
                com.google.crypto.tink.shaded.protobuf.Option r1 = (com.google.crypto.tink.shaded.protobuf.Option) r1
                com.google.crypto.tink.shaded.protobuf.Method.access$1500(r0, r1)
                return r2
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder addOptions(com.google.crypto.tink.shaded.protobuf.Option r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$1500(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder clearName() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$200(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder clearOptions() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$1800(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder clearRequestStreaming() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$800(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder clearRequestTypeUrl() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$500(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder clearResponseStreaming() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$1300(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder clearResponseTypeUrl() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$1000(r0)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder clearSyntax() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$2200(r0)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
        public java.lang.String getName() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getNameBytes()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
        public com.google.crypto.tink.shaded.protobuf.Option getOptions(int r2) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Option r0 = r0.getOptions(r2)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
        public int getOptionsCount() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                int r0 = r0.getOptionsCount()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
        public java.util.List<com.google.crypto.tink.shaded.protobuf.Option> getOptionsList() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                java.util.List r0 = r0.getOptionsList()
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
        public boolean getRequestStreaming() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                boolean r0 = r0.getRequestStreaming()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
        public java.lang.String getRequestTypeUrl() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                java.lang.String r0 = r0.getRequestTypeUrl()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getRequestTypeUrlBytes() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getRequestTypeUrlBytes()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
        public boolean getResponseStreaming() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                boolean r0 = r0.getResponseStreaming()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
        public java.lang.String getResponseTypeUrl() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                java.lang.String r0 = r0.getResponseTypeUrl()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getResponseTypeUrlBytes() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getResponseTypeUrlBytes()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
        public com.google.crypto.tink.shaded.protobuf.Syntax getSyntax() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Syntax r0 = r0.getSyntax()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
        public int getSyntaxValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                int r0 = r0.getSyntaxValue()
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder removeOptions(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$1900(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder setName(java.lang.String r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder setNameBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$300(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder setOptions(int r3, com.google.crypto.tink.shaded.protobuf.Option.Builder r4) {
                r2 = this;
                r2.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r4.build()
                com.google.crypto.tink.shaded.protobuf.Option r1 = (com.google.crypto.tink.shaded.protobuf.Option) r1
                com.google.crypto.tink.shaded.protobuf.Method.access$1400(r0, r3, r1)
                return r2
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder setOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$1400(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder setRequestStreaming(boolean r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$700(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder setRequestTypeUrl(java.lang.String r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$400(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder setRequestTypeUrlBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$600(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder setResponseStreaming(boolean r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$1200(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder setResponseTypeUrl(java.lang.String r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$900(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder setResponseTypeUrlBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$1100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder setSyntax(com.google.crypto.tink.shaded.protobuf.Syntax r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$2100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.Method.Builder setSyntaxValue(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
                com.google.crypto.tink.shaded.protobuf.Method.access$2000(r0, r2)
                return r1
        }
    }

    static {
            com.google.crypto.tink.shaded.protobuf.Method r0 = new com.google.crypto.tink.shaded.protobuf.Method
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE = r0
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Method> r1 = com.google.crypto.tink.shaded.protobuf.Method.class
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private Method() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.name_ = r0
            r1.requestTypeUrl_ = r0
            r1.responseTypeUrl_ = r0
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = emptyProtobufList()
            r1.options_ = r0
            return
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.Method access$000() {
            com.google.crypto.tink.shaded.protobuf.Method r0 = com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ void access$100(com.google.crypto.tink.shaded.protobuf.Method r0, java.lang.String r1) {
            r0.setName(r1)
            return
    }

    static /* synthetic */ void access$1000(com.google.crypto.tink.shaded.protobuf.Method r0) {
            r0.clearResponseTypeUrl()
            return
    }

    static /* synthetic */ void access$1100(com.google.crypto.tink.shaded.protobuf.Method r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setResponseTypeUrlBytes(r1)
            return
    }

    static /* synthetic */ void access$1200(com.google.crypto.tink.shaded.protobuf.Method r0, boolean r1) {
            r0.setResponseStreaming(r1)
            return
    }

    static /* synthetic */ void access$1300(com.google.crypto.tink.shaded.protobuf.Method r0) {
            r0.clearResponseStreaming()
            return
    }

    static /* synthetic */ void access$1400(com.google.crypto.tink.shaded.protobuf.Method r0, int r1, com.google.crypto.tink.shaded.protobuf.Option r2) {
            r0.setOptions(r1, r2)
            return
    }

    static /* synthetic */ void access$1500(com.google.crypto.tink.shaded.protobuf.Method r0, com.google.crypto.tink.shaded.protobuf.Option r1) {
            r0.addOptions(r1)
            return
    }

    static /* synthetic */ void access$1600(com.google.crypto.tink.shaded.protobuf.Method r0, int r1, com.google.crypto.tink.shaded.protobuf.Option r2) {
            r0.addOptions(r1, r2)
            return
    }

    static /* synthetic */ void access$1700(com.google.crypto.tink.shaded.protobuf.Method r0, java.lang.Iterable r1) {
            r0.addAllOptions(r1)
            return
    }

    static /* synthetic */ void access$1800(com.google.crypto.tink.shaded.protobuf.Method r0) {
            r0.clearOptions()
            return
    }

    static /* synthetic */ void access$1900(com.google.crypto.tink.shaded.protobuf.Method r0, int r1) {
            r0.removeOptions(r1)
            return
    }

    static /* synthetic */ void access$200(com.google.crypto.tink.shaded.protobuf.Method r0) {
            r0.clearName()
            return
    }

    static /* synthetic */ void access$2000(com.google.crypto.tink.shaded.protobuf.Method r0, int r1) {
            r0.setSyntaxValue(r1)
            return
    }

    static /* synthetic */ void access$2100(com.google.crypto.tink.shaded.protobuf.Method r0, com.google.crypto.tink.shaded.protobuf.Syntax r1) {
            r0.setSyntax(r1)
            return
    }

    static /* synthetic */ void access$2200(com.google.crypto.tink.shaded.protobuf.Method r0) {
            r0.clearSyntax()
            return
    }

    static /* synthetic */ void access$300(com.google.crypto.tink.shaded.protobuf.Method r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setNameBytes(r1)
            return
    }

    static /* synthetic */ void access$400(com.google.crypto.tink.shaded.protobuf.Method r0, java.lang.String r1) {
            r0.setRequestTypeUrl(r1)
            return
    }

    static /* synthetic */ void access$500(com.google.crypto.tink.shaded.protobuf.Method r0) {
            r0.clearRequestTypeUrl()
            return
    }

    static /* synthetic */ void access$600(com.google.crypto.tink.shaded.protobuf.Method r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setRequestTypeUrlBytes(r1)
            return
    }

    static /* synthetic */ void access$700(com.google.crypto.tink.shaded.protobuf.Method r0, boolean r1) {
            r0.setRequestStreaming(r1)
            return
    }

    static /* synthetic */ void access$800(com.google.crypto.tink.shaded.protobuf.Method r0) {
            r0.clearRequestStreaming()
            return
    }

    static /* synthetic */ void access$900(com.google.crypto.tink.shaded.protobuf.Method r0, java.lang.String r1) {
            r0.setResponseTypeUrl(r1)
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

    private void clearName() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Method r0 = getDefaultInstance()
            java.lang.String r0 = r0.getName()
            r1.name_ = r0
            return
    }

    private void clearOptions() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = emptyProtobufList()
            r1.options_ = r0
            return
    }

    private void clearRequestStreaming() {
            r1 = this;
            r0 = 0
            r1.requestStreaming_ = r0
            return
    }

    private void clearRequestTypeUrl() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Method r0 = getDefaultInstance()
            java.lang.String r0 = r0.getRequestTypeUrl()
            r1.requestTypeUrl_ = r0
            return
    }

    private void clearResponseStreaming() {
            r1 = this;
            r0 = 0
            r1.responseStreaming_ = r0
            return
    }

    private void clearResponseTypeUrl() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Method r0 = getDefaultInstance()
            java.lang.String r0 = r0.getResponseTypeUrl()
            r1.responseTypeUrl_ = r0
            return
    }

    private void clearSyntax() {
            r1 = this;
            r0 = 0
            r1.syntax_ = r0
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

    public static com.google.crypto.tink.shaded.protobuf.Method getDefaultInstance() {
            com.google.crypto.tink.shaded.protobuf.Method r0 = com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Method.Builder newBuilder() {
            com.google.crypto.tink.shaded.protobuf.Method r0 = com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            com.google.crypto.tink.shaded.protobuf.Method$Builder r0 = (com.google.crypto.tink.shaded.protobuf.Method.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Method.Builder newBuilder(com.google.crypto.tink.shaded.protobuf.Method r1) {
            com.google.crypto.tink.shaded.protobuf.Method r0 = com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder(r1)
            com.google.crypto.tink.shaded.protobuf.Method$Builder r0 = (com.google.crypto.tink.shaded.protobuf.Method.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Method parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Method r0 = com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseDelimitedFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Method parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Method r0 = com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseDelimitedFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Method parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Method r0 = com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Method parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Method r0 = com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Method parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Method r0 = com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Method parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Method r0 = com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Method parseFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Method r0 = com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Method parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.Method r0 = com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Method parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Method r0 = com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Method parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Method r0 = com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Method parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Method r0 = com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Method parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Method r0 = com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.shaded.protobuf.Method r0 = (com.google.crypto.tink.shaded.protobuf.Method) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Method> parser() {
            com.google.crypto.tink.shaded.protobuf.Method r0 = com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE
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

    private void setOptions(int r2, com.google.crypto.tink.shaded.protobuf.Option r3) {
            r1 = this;
            r3.getClass()
            r1.ensureOptionsIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            r0.set(r2, r3)
            return
    }

    private void setRequestStreaming(boolean r1) {
            r0 = this;
            r0.requestStreaming_ = r1
            return
    }

    private void setRequestTypeUrl(java.lang.String r2) {
            r1 = this;
            java.lang.Class r0 = r2.getClass()
            r1.requestTypeUrl_ = r2
            return
    }

    private void setRequestTypeUrlBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            r1 = this;
            checkByteStringIsUtf8(r2)
            java.lang.String r0 = r2.toStringUtf8()
            r1.requestTypeUrl_ = r0
            return
    }

    private void setResponseStreaming(boolean r1) {
            r0 = this;
            r0.responseStreaming_ = r1
            return
    }

    private void setResponseTypeUrl(java.lang.String r2) {
            r1 = this;
            java.lang.Class r0 = r2.getClass()
            r1.responseTypeUrl_ = r2
            return
    }

    private void setResponseTypeUrlBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            r1 = this;
            checkByteStringIsUtf8(r2)
            java.lang.String r0 = r2.toStringUtf8()
            r1.responseTypeUrl_ = r0
            return
    }

    private void setSyntax(com.google.crypto.tink.shaded.protobuf.Syntax r2) {
            r1 = this;
            int r0 = r2.getNumber()
            r1.syntax_ = r0
            return
    }

    private void setSyntaxValue(int r1) {
            r0 = this;
            r0.syntax_ = r1
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r10, java.lang.Object r11, java.lang.Object r12) {
            r9 = this;
            int[] r0 = com.google.crypto.tink.shaded.protobuf.Method.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
            int r1 = r10.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 1: goto L5b;
                case 2: goto L55;
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
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Method> r1 = com.google.crypto.tink.shaded.protobuf.Method.PARSER
            if (r1 != 0) goto L34
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Method> r2 = com.google.crypto.tink.shaded.protobuf.Method.class
            monitor-enter(r2)
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Method> r0 = com.google.crypto.tink.shaded.protobuf.Method.PARSER     // Catch: java.lang.Throwable -> L31
            r1 = r0
            if (r1 != 0) goto L2f
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L31
            com.google.crypto.tink.shaded.protobuf.Method r3 = com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L31
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L31
            r1 = r0
            com.google.crypto.tink.shaded.protobuf.Method.PARSER = r1     // Catch: java.lang.Throwable -> L31
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
            com.google.crypto.tink.shaded.protobuf.Method r0 = com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE
            return r0
        L38:
            java.lang.String r1 = "name_"
            java.lang.String r2 = "requestTypeUrl_"
            java.lang.String r3 = "requestStreaming_"
            java.lang.String r4 = "responseTypeUrl_"
            java.lang.String r5 = "responseStreaming_"
            java.lang.String r6 = "options_"
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.Option> r7 = com.google.crypto.tink.shaded.protobuf.Option.class
            java.lang.String r8 = "syntax_"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r2, r3, r4, r5, r6, r7, r8}
            java.lang.String r1 = "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f"
            com.google.crypto.tink.shaded.protobuf.Method r2 = com.google.crypto.tink.shaded.protobuf.Method.DEFAULT_INSTANCE
            java.lang.Object r2 = newMessageInfo(r2, r1, r0)
            return r2
        L55:
            com.google.crypto.tink.shaded.protobuf.Method$Builder r0 = new com.google.crypto.tink.shaded.protobuf.Method$Builder
            r0.<init>(r1)
            return r0
        L5b:
            com.google.crypto.tink.shaded.protobuf.Method r0 = new com.google.crypto.tink.shaded.protobuf.Method
            r0.<init>()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getNameBytes() {
            r1 = this;
            java.lang.String r0 = r1.name_
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
    public com.google.crypto.tink.shaded.protobuf.Option getOptions(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            java.lang.Object r0 = r0.get(r2)
            com.google.crypto.tink.shaded.protobuf.Option r0 = (com.google.crypto.tink.shaded.protobuf.Option) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
    public int getOptionsCount() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.shaded.protobuf.Option> r0 = r1.options_
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
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

    @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
    public boolean getRequestStreaming() {
            r1 = this;
            boolean r0 = r1.requestStreaming_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
    public java.lang.String getRequestTypeUrl() {
            r1 = this;
            java.lang.String r0 = r1.requestTypeUrl_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getRequestTypeUrlBytes() {
            r1 = this;
            java.lang.String r0 = r1.requestTypeUrl_
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
    public boolean getResponseStreaming() {
            r1 = this;
            boolean r0 = r1.responseStreaming_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
    public java.lang.String getResponseTypeUrl() {
            r1 = this;
            java.lang.String r0 = r1.responseTypeUrl_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getResponseTypeUrlBytes() {
            r1 = this;
            java.lang.String r0 = r1.responseTypeUrl_
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
    public com.google.crypto.tink.shaded.protobuf.Syntax getSyntax() {
            r2 = this;
            int r0 = r2.syntax_
            com.google.crypto.tink.shaded.protobuf.Syntax r0 = com.google.crypto.tink.shaded.protobuf.Syntax.forNumber(r0)
            if (r0 != 0) goto Lb
            com.google.crypto.tink.shaded.protobuf.Syntax r1 = com.google.crypto.tink.shaded.protobuf.Syntax.UNRECOGNIZED
            goto Lc
        Lb:
            r1 = r0
        Lc:
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MethodOrBuilder
    public int getSyntaxValue() {
            r1 = this;
            int r0 = r1.syntax_
            return r0
    }
}
