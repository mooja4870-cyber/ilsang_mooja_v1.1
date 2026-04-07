package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public final class AesGcmHkdfStreamingParams extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.AesGcmHkdfStreamingParams, com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.Builder> implements com.google.crypto.tink.proto.AesGcmHkdfStreamingParamsOrBuilder {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final com.google.crypto.tink.proto.AesGcmHkdfStreamingParams DEFAULT_INSTANCE = null;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.AesGcmHkdfStreamingParams> PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;

    /* JADX INFO: renamed from: com.google.crypto.tink.proto.AesGcmHkdfStreamingParams$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                int[] r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                int[] r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L56
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L56
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L56
                goto L57
            L56:
                r0 = move-exception
            L57:
                int[] r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L63
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

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.AesGcmHkdfStreamingParams, com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.Builder> implements com.google.crypto.tink.proto.AesGcmHkdfStreamingParamsOrBuilder {
        private Builder() {
                r1 = this;
                com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.access$000()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite build() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.build()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite buildPartial() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.buildPartial()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder clear() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = super.clear()
                return r0
        }

        public com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.Builder clearCiphertextSegmentSize() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
                com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.access$200(r0)
                return r1
        }

        public com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.Builder clearDerivedKeySize() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
                com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.access$400(r0)
                return r1
        }

        public com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.Builder clearHkdfHashType() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
                com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.access$700(r0)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder clone() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = super.clone()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder clone() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = super.clone()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ java.lang.Object mo145clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = super.clone()
                return r0
        }

        @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingParamsOrBuilder
        public int getCiphertextSegmentSize() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
                int r0 = r0.getCiphertextSegmentSize()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
                return r0
        }

        @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingParamsOrBuilder
        public int getDerivedKeySize() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
                int r0 = r0.getDerivedKeySize()
                return r0
        }

        @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingParamsOrBuilder
        public com.google.crypto.tink.proto.HashType getHkdfHashType() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
                com.google.crypto.tink.proto.HashType r0 = r0.getHkdfHashType()
                return r0
        }

        @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingParamsOrBuilder
        public int getHkdfHashTypeValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
                int r0 = r0.getHkdfHashTypeValue()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        protected /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder internalMergeFrom(com.google.crypto.tink.shaded.protobuf.AbstractMessageLite r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r1
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = super.internalMergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = super.mergeFrom(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder mergeFrom(byte[] r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = super.mergeFrom(r1, r2, r3)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder mergeFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = super.mergeFrom(r1, r2, r3, r4)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = super.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = super.mergeFrom(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = super.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = super.mergeFrom(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.MessageLite r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = super.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream r1) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = super.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = super.mergeFrom(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = super.mergeFrom(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = super.mergeFrom(r1, r2, r3)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = super.mergeFrom(r1, r2, r3, r4)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder r1 = super.mergeFrom(r1, r2)
                return r1
        }

        public com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.Builder setCiphertextSegmentSize(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
                com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.access$100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.Builder setDerivedKeySize(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
                com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.access$300(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.Builder setHkdfHashType(com.google.crypto.tink.proto.HashType r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
                com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.access$600(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.Builder setHkdfHashTypeValue(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
                com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.access$500(r0, r2)
                return r1
        }
    }

    static {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = new com.google.crypto.tink.proto.AesGcmHkdfStreamingParams
            r0.<init>()
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE = r0
            java.lang.Class<com.google.crypto.tink.proto.AesGcmHkdfStreamingParams> r1 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.class
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private AesGcmHkdfStreamingParams() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.google.crypto.tink.proto.AesGcmHkdfStreamingParams access$000() {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ void access$100(com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0, int r1) {
            r0.setCiphertextSegmentSize(r1)
            return
    }

    static /* synthetic */ void access$200(com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0) {
            r0.clearCiphertextSegmentSize()
            return
    }

    static /* synthetic */ void access$300(com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0, int r1) {
            r0.setDerivedKeySize(r1)
            return
    }

    static /* synthetic */ void access$400(com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0) {
            r0.clearDerivedKeySize()
            return
    }

    static /* synthetic */ void access$500(com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0, int r1) {
            r0.setHkdfHashTypeValue(r1)
            return
    }

    static /* synthetic */ void access$600(com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0, com.google.crypto.tink.proto.HashType r1) {
            r0.setHkdfHashType(r1)
            return
    }

    static /* synthetic */ void access$700(com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0) {
            r0.clearHkdfHashType()
            return
    }

    private void clearCiphertextSegmentSize() {
            r1 = this;
            r0 = 0
            r1.ciphertextSegmentSize_ = r0
            return
    }

    private void clearDerivedKeySize() {
            r1 = this;
            r0 = 0
            r1.derivedKeySize_ = r0
            return
    }

    private void clearHkdfHashType() {
            r1 = this;
            r0 = 0
            r1.hkdfHashType_ = r0
            return
    }

    public static com.google.crypto.tink.proto.AesGcmHkdfStreamingParams getDefaultInstance() {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE
            return r0
    }

    public static com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.Builder newBuilder() {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams$Builder r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.Builder newBuilder(com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r1) {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder(r1)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams$Builder r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.proto.AesGcmHkdfStreamingParams parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseDelimitedFrom(r0, r1)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
            return r0
    }

    public static com.google.crypto.tink.proto.AesGcmHkdfStreamingParams parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseDelimitedFrom(r0, r1, r2)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
            return r0
    }

    public static com.google.crypto.tink.proto.AesGcmHkdfStreamingParams parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
            return r0
    }

    public static com.google.crypto.tink.proto.AesGcmHkdfStreamingParams parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
            return r0
    }

    public static com.google.crypto.tink.proto.AesGcmHkdfStreamingParams parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
            return r0
    }

    public static com.google.crypto.tink.proto.AesGcmHkdfStreamingParams parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
            return r0
    }

    public static com.google.crypto.tink.proto.AesGcmHkdfStreamingParams parseFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
            return r0
    }

    public static com.google.crypto.tink.proto.AesGcmHkdfStreamingParams parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
            return r0
    }

    public static com.google.crypto.tink.proto.AesGcmHkdfStreamingParams parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
            return r0
    }

    public static com.google.crypto.tink.proto.AesGcmHkdfStreamingParams parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
            return r0
    }

    public static com.google.crypto.tink.proto.AesGcmHkdfStreamingParams parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
            return r0
    }

    public static com.google.crypto.tink.proto.AesGcmHkdfStreamingParams parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = (com.google.crypto.tink.proto.AesGcmHkdfStreamingParams) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.AesGcmHkdfStreamingParams> parser() {
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.Parser r0 = r0.getParserForType()
            return r0
    }

    private void setCiphertextSegmentSize(int r1) {
            r0 = this;
            r0.ciphertextSegmentSize_ = r1
            return
    }

    private void setDerivedKeySize(int r1) {
            r0 = this;
            r0.derivedKeySize_ = r1
            return
    }

    private void setHkdfHashType(com.google.crypto.tink.proto.HashType r2) {
            r1 = this;
            int r0 = r2.getNumber()
            r1.hkdfHashType_ = r0
            return
    }

    private void setHkdfHashTypeValue(int r1) {
            r0 = this;
            r0.hkdfHashType_ = r1
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            int[] r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
            int r1 = r5.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 1: goto L51;
                case 2: goto L4b;
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
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.AesGcmHkdfStreamingParams> r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.PARSER
            if (r0 != 0) goto L34
            java.lang.Class<com.google.crypto.tink.proto.AesGcmHkdfStreamingParams> r1 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.class
            monitor-enter(r1)
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.AesGcmHkdfStreamingParams> r2 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.PARSER     // Catch: java.lang.Throwable -> L31
            r0 = r2
            if (r0 != 0) goto L2f
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r2 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L31
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r3 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L31
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L31
            r0 = r2
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.PARSER = r0     // Catch: java.lang.Throwable -> L31
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
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE
            return r0
        L38:
            java.lang.String r0 = "ciphertextSegmentSize_"
            java.lang.String r1 = "derivedKeySize_"
            java.lang.String r2 = "hkdfHashType_"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
            java.lang.String r1 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f"
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r2 = com.google.crypto.tink.proto.AesGcmHkdfStreamingParams.DEFAULT_INSTANCE
            java.lang.Object r2 = newMessageInfo(r2, r1, r0)
            return r2
        L4b:
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams$Builder r0 = new com.google.crypto.tink.proto.AesGcmHkdfStreamingParams$Builder
            r0.<init>(r1)
            return r0
        L51:
            com.google.crypto.tink.proto.AesGcmHkdfStreamingParams r0 = new com.google.crypto.tink.proto.AesGcmHkdfStreamingParams
            r0.<init>()
            return r0
    }

    @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingParamsOrBuilder
    public int getCiphertextSegmentSize() {
            r1 = this;
            int r0 = r1.ciphertextSegmentSize_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
            return r0
    }

    @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingParamsOrBuilder
    public int getDerivedKeySize() {
            r1 = this;
            int r0 = r1.derivedKeySize_
            return r0
    }

    @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingParamsOrBuilder
    public com.google.crypto.tink.proto.HashType getHkdfHashType() {
            r2 = this;
            int r0 = r2.hkdfHashType_
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.forNumber(r0)
            if (r0 != 0) goto Lb
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.UNRECOGNIZED
            goto Lc
        Lb:
            r1 = r0
        Lc:
            return r1
    }

    @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingParamsOrBuilder
    public int getHkdfHashTypeValue() {
            r1 = this;
            int r0 = r1.hkdfHashType_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder newBuilderForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = super.newBuilderForType()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder toBuilder() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = super.toBuilder()
            return r0
    }
}
