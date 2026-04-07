package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public final class JwtRsaSsaPkcs1KeyFormat extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat, com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder> implements com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder {
    public static final int ALGORITHM_FIELD_NUMBER = 2;
    private static final com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat DEFAULT_INSTANCE = null;
    public static final int MODULUS_SIZE_IN_BITS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat> PARSER = null;
    public static final int PUBLIC_EXPONENT_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int algorithm_;
    private int modulusSizeInBits_;
    private com.google.crypto.tink.shaded.protobuf.ByteString publicExponent_;
    private int version_;

    /* JADX INFO: renamed from: com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                int[] r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                int[] r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L56
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L56
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L56
                goto L57
            L56:
                r0 = move-exception
            L57:
                int[] r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L63
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

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat, com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder> implements com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder {
        private Builder() {
                r1 = this;
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.access$000()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.AnonymousClass1 r1) {
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

        public com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder clearAlgorithm() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.access$500(r0)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder clearModulusSizeInBits() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.access$700(r0)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder clearPublicExponent() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.access$900(r0)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder clearVersion() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.access$200(r0)
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

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder
        public com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm getAlgorithm() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = r0.getAlgorithm()
                return r0
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder
        public int getAlgorithmValue() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
                int r0 = r0.getAlgorithmValue()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
                return r0
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder
        public int getModulusSizeInBits() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
                int r0 = r0.getModulusSizeInBits()
                return r0
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getPublicExponent() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getPublicExponent()
                return r0
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder
        public int getVersion() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
                int r0 = r0.getVersion()
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

        public com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder setAlgorithm(com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.access$400(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder setAlgorithmValue(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.access$300(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder setModulusSizeInBits(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.access$600(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder setPublicExponent(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.access$800(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder setVersion(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.access$100(r0, r2)
                return r1
        }
    }

    static {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = new com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat
            r0.<init>()
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE = r0
            java.lang.Class<com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat> r1 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.class
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private JwtRsaSsaPkcs1KeyFormat() {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            r1.publicExponent_ = r0
            return
    }

    static /* synthetic */ com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat access$000() {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ void access$100(com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0, int r1) {
            r0.setVersion(r1)
            return
    }

    static /* synthetic */ void access$200(com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0) {
            r0.clearVersion()
            return
    }

    static /* synthetic */ void access$300(com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0, int r1) {
            r0.setAlgorithmValue(r1)
            return
    }

    static /* synthetic */ void access$400(com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0, com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r1) {
            r0.setAlgorithm(r1)
            return
    }

    static /* synthetic */ void access$500(com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0) {
            r0.clearAlgorithm()
            return
    }

    static /* synthetic */ void access$600(com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0, int r1) {
            r0.setModulusSizeInBits(r1)
            return
    }

    static /* synthetic */ void access$700(com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0) {
            r0.clearModulusSizeInBits()
            return
    }

    static /* synthetic */ void access$800(com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            r0.setPublicExponent(r1)
            return
    }

    static /* synthetic */ void access$900(com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0) {
            r0.clearPublicExponent()
            return
    }

    private void clearAlgorithm() {
            r1 = this;
            r0 = 0
            r1.algorithm_ = r0
            return
    }

    private void clearModulusSizeInBits() {
            r1 = this;
            r0 = 0
            r1.modulusSizeInBits_ = r0
            return
    }

    private void clearPublicExponent() {
            r1 = this;
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = getDefaultInstance()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getPublicExponent()
            r1.publicExponent_ = r0
            return
    }

    private void clearVersion() {
            r1 = this;
            r0 = 0
            r1.version_ = r0
            return
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat getDefaultInstance() {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE
            return r0
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder newBuilder() {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat$Builder r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder newBuilder(com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r1) {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder(r1)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat$Builder r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseDelimitedFrom(r0, r1)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
            return r0
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseDelimitedFrom(r0, r1, r2)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
            return r0
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
            return r0
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
            return r0
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
            return r0
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
            return r0
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
            return r0
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
            return r0
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
            return r0
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
            return r0
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
            return r0
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat> parser() {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.Parser r0 = r0.getParserForType()
            return r0
    }

    private void setAlgorithm(com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r2) {
            r1 = this;
            int r0 = r2.getNumber()
            r1.algorithm_ = r0
            return
    }

    private void setAlgorithmValue(int r1) {
            r0 = this;
            r0.algorithm_ = r1
            return
    }

    private void setModulusSizeInBits(int r1) {
            r0 = this;
            r0.modulusSizeInBits_ = r1
            return
    }

    private void setPublicExponent(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            r1 = this;
            java.lang.Class r0 = r2.getClass()
            r1.publicExponent_ = r2
            return
    }

    private void setVersion(int r1) {
            r0 = this;
            r0.version_ = r1
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            int[] r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
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
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat> r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.PARSER
            if (r0 != 0) goto L34
            java.lang.Class<com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat> r1 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.class
            monitor-enter(r1)
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat> r2 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.PARSER     // Catch: java.lang.Throwable -> L31
            r0 = r2
            if (r0 != 0) goto L2f
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r2 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L31
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r3 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L31
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L31
            r0 = r2
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.PARSER = r0     // Catch: java.lang.Throwable -> L31
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
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE
            return r0
        L38:
            java.lang.String r0 = "version_"
            java.lang.String r1 = "algorithm_"
            java.lang.String r2 = "modulusSizeInBits_"
            java.lang.String r3 = "publicExponent_"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
            java.lang.String r1 = "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003\u000b\u0004\n"
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r2 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE
            java.lang.Object r2 = newMessageInfo(r2, r1, r0)
            return r2
        L4d:
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat$Builder r0 = new com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat$Builder
            r0.<init>(r1)
            return r0
        L53:
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat r0 = new com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormat
            r0.<init>()
            return r0
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder
    public com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm getAlgorithm() {
            r2 = this;
            int r0 = r2.algorithm_
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.forNumber(r0)
            if (r0 != 0) goto Lb
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r1 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.UNRECOGNIZED
            goto Lc
        Lb:
            r1 = r0
        Lc:
            return r1
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder
    public int getAlgorithmValue() {
            r1 = this;
            int r0 = r1.algorithm_
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
            return r0
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder
    public int getModulusSizeInBits() {
            r1 = this;
            int r0 = r1.modulusSizeInBits_
            return r0
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder
    public com.google.crypto.tink.shaded.protobuf.ByteString getPublicExponent() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.publicExponent_
            return r0
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1KeyFormatOrBuilder
    public int getVersion() {
            r1 = this;
            int r0 = r1.version_
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
