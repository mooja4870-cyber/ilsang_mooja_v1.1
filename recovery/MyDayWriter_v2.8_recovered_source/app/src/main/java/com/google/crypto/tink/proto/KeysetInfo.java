package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public final class KeysetInfo extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.KeysetInfo, com.google.crypto.tink.proto.KeysetInfo.Builder> implements com.google.crypto.tink.proto.KeysetInfoOrBuilder {
    private static final com.google.crypto.tink.proto.KeysetInfo DEFAULT_INSTANCE = null;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeysetInfo> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<com.google.crypto.tink.proto.KeysetInfo.KeyInfo> keyInfo_;
    private int primaryKeyId_;

    /* JADX INFO: renamed from: com.google.crypto.tink.proto.KeysetInfo$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.proto.KeysetInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = r0
                int[] r0 = com.google.crypto.tink.proto.KeysetInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.proto.KeysetInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.proto.KeysetInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.proto.KeysetInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.google.crypto.tink.proto.KeysetInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                int[] r0 = com.google.crypto.tink.proto.KeysetInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L56
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L56
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L56
                goto L57
            L56:
                r0 = move-exception
            L57:
                int[] r0 = com.google.crypto.tink.proto.KeysetInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke     // Catch: java.lang.NoSuchFieldError -> L63
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

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.KeysetInfo, com.google.crypto.tink.proto.KeysetInfo.Builder> implements com.google.crypto.tink.proto.KeysetInfoOrBuilder {
        private Builder() {
                r1 = this;
                com.google.crypto.tink.proto.KeysetInfo r0 = com.google.crypto.tink.proto.KeysetInfo.access$1300()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.proto.KeysetInfo.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.crypto.tink.proto.KeysetInfo.Builder addAllKeyInfo(java.lang.Iterable<? extends com.google.crypto.tink.proto.KeysetInfo.KeyInfo> r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
                com.google.crypto.tink.proto.KeysetInfo.access$1900(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.KeysetInfo.Builder addKeyInfo(int r3, com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder r4) {
                r2 = this;
                r2.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r4.build()
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r1 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r1
                com.google.crypto.tink.proto.KeysetInfo.access$1800(r0, r3, r1)
                return r2
        }

        public com.google.crypto.tink.proto.KeysetInfo.Builder addKeyInfo(int r2, com.google.crypto.tink.proto.KeysetInfo.KeyInfo r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
                com.google.crypto.tink.proto.KeysetInfo.access$1800(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.proto.KeysetInfo.Builder addKeyInfo(com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder r3) {
                r2 = this;
                r2.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r3.build()
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r1 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r1
                com.google.crypto.tink.proto.KeysetInfo.access$1700(r0, r1)
                return r2
        }

        public com.google.crypto.tink.proto.KeysetInfo.Builder addKeyInfo(com.google.crypto.tink.proto.KeysetInfo.KeyInfo r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
                com.google.crypto.tink.proto.KeysetInfo.access$1700(r0, r2)
                return r1
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

        public com.google.crypto.tink.proto.KeysetInfo.Builder clearKeyInfo() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
                com.google.crypto.tink.proto.KeysetInfo.access$2000(r0)
                return r1
        }

        public com.google.crypto.tink.proto.KeysetInfo.Builder clearPrimaryKeyId() {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
                com.google.crypto.tink.proto.KeysetInfo.access$1500(r0)
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

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
                return r0
        }

        @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
        public com.google.crypto.tink.proto.KeysetInfo.KeyInfo getKeyInfo(int r2) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = r0.getKeyInfo(r2)
                return r0
        }

        @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
        public int getKeyInfoCount() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
                int r0 = r0.getKeyInfoCount()
                return r0
        }

        @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
        public java.util.List<com.google.crypto.tink.proto.KeysetInfo.KeyInfo> getKeyInfoList() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
                java.util.List r0 = r0.getKeyInfoList()
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                return r0
        }

        @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
        public int getPrimaryKeyId() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
                int r0 = r0.getPrimaryKeyId()
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

        public com.google.crypto.tink.proto.KeysetInfo.Builder removeKeyInfo(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
                com.google.crypto.tink.proto.KeysetInfo.access$2100(r0, r2)
                return r1
        }

        public com.google.crypto.tink.proto.KeysetInfo.Builder setKeyInfo(int r3, com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder r4) {
                r2 = this;
                r2.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r4.build()
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r1 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r1
                com.google.crypto.tink.proto.KeysetInfo.access$1600(r0, r3, r1)
                return r2
        }

        public com.google.crypto.tink.proto.KeysetInfo.Builder setKeyInfo(int r2, com.google.crypto.tink.proto.KeysetInfo.KeyInfo r3) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
                com.google.crypto.tink.proto.KeysetInfo.access$1600(r0, r2, r3)
                return r1
        }

        public com.google.crypto.tink.proto.KeysetInfo.Builder setPrimaryKeyId(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
                com.google.crypto.tink.proto.KeysetInfo.access$1400(r0, r2)
                return r1
        }
    }

    public static final class KeyInfo extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.proto.KeysetInfo.KeyInfo, com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder> implements com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder {
        private static final com.google.crypto.tink.proto.KeysetInfo.KeyInfo DEFAULT_INSTANCE = null;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeysetInfo.KeyInfo> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private java.lang.String typeUrl_;

        public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.proto.KeysetInfo.KeyInfo, com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder> implements com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder {
            private Builder() {
                    r1 = this;
                    com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.access$000()
                    r1.<init>(r0)
                    return
            }

            /* synthetic */ Builder(com.google.crypto.tink.proto.KeysetInfo.AnonymousClass1 r1) {
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

            public com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder clearKeyId() {
                    r1 = this;
                    r1.copyOnWrite()
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                    com.google.crypto.tink.proto.KeysetInfo.KeyInfo.access$800(r0)
                    return r1
            }

            public com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder clearOutputPrefixType() {
                    r1 = this;
                    r1.copyOnWrite()
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                    com.google.crypto.tink.proto.KeysetInfo.KeyInfo.access$1100(r0)
                    return r1
            }

            public com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder clearStatus() {
                    r1 = this;
                    r1.copyOnWrite()
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                    com.google.crypto.tink.proto.KeysetInfo.KeyInfo.access$600(r0)
                    return r1
            }

            public com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder clearTypeUrl() {
                    r1 = this;
                    r1.copyOnWrite()
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                    com.google.crypto.tink.proto.KeysetInfo.KeyInfo.access$200(r0)
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

            @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
            public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
                    r1 = this;
                    com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
                    return r0
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public int getKeyId() {
                    r1 = this;
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                    int r0 = r0.getKeyId()
                    return r0
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public com.google.crypto.tink.proto.OutputPrefixType getOutputPrefixType() {
                    r1 = this;
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                    com.google.crypto.tink.proto.OutputPrefixType r0 = r0.getOutputPrefixType()
                    return r0
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public int getOutputPrefixTypeValue() {
                    r1 = this;
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                    int r0 = r0.getOutputPrefixTypeValue()
                    return r0
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public com.google.crypto.tink.proto.KeyStatusType getStatus() {
                    r1 = this;
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                    com.google.crypto.tink.proto.KeyStatusType r0 = r0.getStatus()
                    return r0
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public int getStatusValue() {
                    r1 = this;
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                    int r0 = r0.getStatusValue()
                    return r0
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public java.lang.String getTypeUrl() {
                    r1 = this;
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                    java.lang.String r0 = r0.getTypeUrl()
                    return r0
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public com.google.crypto.tink.shaded.protobuf.ByteString getTypeUrlBytes() {
                    r1 = this;
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                    com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.getTypeUrlBytes()
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

            public com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder setKeyId(int r2) {
                    r1 = this;
                    r1.copyOnWrite()
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                    com.google.crypto.tink.proto.KeysetInfo.KeyInfo.access$700(r0, r2)
                    return r1
            }

            public com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType r2) {
                    r1 = this;
                    r1.copyOnWrite()
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                    com.google.crypto.tink.proto.KeysetInfo.KeyInfo.access$1000(r0, r2)
                    return r1
            }

            public com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder setOutputPrefixTypeValue(int r2) {
                    r1 = this;
                    r1.copyOnWrite()
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                    com.google.crypto.tink.proto.KeysetInfo.KeyInfo.access$900(r0, r2)
                    return r1
            }

            public com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder setStatus(com.google.crypto.tink.proto.KeyStatusType r2) {
                    r1 = this;
                    r1.copyOnWrite()
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                    com.google.crypto.tink.proto.KeysetInfo.KeyInfo.access$500(r0, r2)
                    return r1
            }

            public com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder setStatusValue(int r2) {
                    r1 = this;
                    r1.copyOnWrite()
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                    com.google.crypto.tink.proto.KeysetInfo.KeyInfo.access$400(r0, r2)
                    return r1
            }

            public com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder setTypeUrl(java.lang.String r2) {
                    r1 = this;
                    r1.copyOnWrite()
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                    com.google.crypto.tink.proto.KeysetInfo.KeyInfo.access$100(r0, r2)
                    return r1
            }

            public com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder setTypeUrlBytes(com.google.crypto.tink.shaded.protobuf.ByteString r2) {
                    r1 = this;
                    r1.copyOnWrite()
                    MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                    com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                    com.google.crypto.tink.proto.KeysetInfo.KeyInfo.access$300(r0, r2)
                    return r1
            }
        }

        static {
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = new com.google.crypto.tink.proto.KeysetInfo$KeyInfo
                r0.<init>()
                com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE = r0
                java.lang.Class<com.google.crypto.tink.proto.KeysetInfo$KeyInfo> r1 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.class
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
                return
        }

        private KeyInfo() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = ""
                r1.typeUrl_ = r0
                return
        }

        static /* synthetic */ com.google.crypto.tink.proto.KeysetInfo.KeyInfo access$000() {
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE
                return r0
        }

        static /* synthetic */ void access$100(com.google.crypto.tink.proto.KeysetInfo.KeyInfo r0, java.lang.String r1) {
                r0.setTypeUrl(r1)
                return
        }

        static /* synthetic */ void access$1000(com.google.crypto.tink.proto.KeysetInfo.KeyInfo r0, com.google.crypto.tink.proto.OutputPrefixType r1) {
                r0.setOutputPrefixType(r1)
                return
        }

        static /* synthetic */ void access$1100(com.google.crypto.tink.proto.KeysetInfo.KeyInfo r0) {
                r0.clearOutputPrefixType()
                return
        }

        static /* synthetic */ void access$200(com.google.crypto.tink.proto.KeysetInfo.KeyInfo r0) {
                r0.clearTypeUrl()
                return
        }

        static /* synthetic */ void access$300(com.google.crypto.tink.proto.KeysetInfo.KeyInfo r0, com.google.crypto.tink.shaded.protobuf.ByteString r1) {
                r0.setTypeUrlBytes(r1)
                return
        }

        static /* synthetic */ void access$400(com.google.crypto.tink.proto.KeysetInfo.KeyInfo r0, int r1) {
                r0.setStatusValue(r1)
                return
        }

        static /* synthetic */ void access$500(com.google.crypto.tink.proto.KeysetInfo.KeyInfo r0, com.google.crypto.tink.proto.KeyStatusType r1) {
                r0.setStatus(r1)
                return
        }

        static /* synthetic */ void access$600(com.google.crypto.tink.proto.KeysetInfo.KeyInfo r0) {
                r0.clearStatus()
                return
        }

        static /* synthetic */ void access$700(com.google.crypto.tink.proto.KeysetInfo.KeyInfo r0, int r1) {
                r0.setKeyId(r1)
                return
        }

        static /* synthetic */ void access$800(com.google.crypto.tink.proto.KeysetInfo.KeyInfo r0) {
                r0.clearKeyId()
                return
        }

        static /* synthetic */ void access$900(com.google.crypto.tink.proto.KeysetInfo.KeyInfo r0, int r1) {
                r0.setOutputPrefixTypeValue(r1)
                return
        }

        private void clearKeyId() {
                r1 = this;
                r0 = 0
                r1.keyId_ = r0
                return
        }

        private void clearOutputPrefixType() {
                r1 = this;
                r0 = 0
                r1.outputPrefixType_ = r0
                return
        }

        private void clearStatus() {
                r1 = this;
                r0 = 0
                r1.status_ = r0
                return
        }

        private void clearTypeUrl() {
                r1 = this;
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = getDefaultInstance()
                java.lang.String r0 = r0.getTypeUrl()
                r1.typeUrl_ = r0
                return
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo getDefaultInstance() {
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE
                return r0
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder newBuilder() {
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo$Builder r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder) r0
                return r0
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder newBuilder(com.google.crypto.tink.proto.KeysetInfo.KeyInfo r1) {
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder(r1)
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo$Builder r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo.Builder) r0
                return r0
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseDelimitedFrom(r0, r1)
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                return r0
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseDelimitedFrom(r0, r1, r2)
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                return r0
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                return r0
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                return r0
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                return r0
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                return r0
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseFrom(java.io.InputStream r1) throws java.io.IOException {
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                return r0
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                return r0
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                return r0
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                return r0
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                return r0
        }

        public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
                return r0
        }

        public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeysetInfo.KeyInfo> parser() {
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.Parser r0 = r0.getParserForType()
                return r0
        }

        private void setKeyId(int r1) {
                r0 = this;
                r0.keyId_ = r1
                return
        }

        private void setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType r2) {
                r1 = this;
                int r0 = r2.getNumber()
                r1.outputPrefixType_ = r0
                return
        }

        private void setOutputPrefixTypeValue(int r1) {
                r0 = this;
                r0.outputPrefixType_ = r1
                return
        }

        private void setStatus(com.google.crypto.tink.proto.KeyStatusType r2) {
                r1 = this;
                int r0 = r2.getNumber()
                r1.status_ = r0
                return
        }

        private void setStatusValue(int r1) {
                r0 = this;
                r0.status_ = r1
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
        protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r5, java.lang.Object r6, java.lang.Object r7) {
                r4 = this;
                int[] r0 = com.google.crypto.tink.proto.KeysetInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
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
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeysetInfo$KeyInfo> r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.PARSER
                if (r0 != 0) goto L34
                java.lang.Class<com.google.crypto.tink.proto.KeysetInfo$KeyInfo> r1 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.class
                monitor-enter(r1)
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeysetInfo$KeyInfo> r2 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.PARSER     // Catch: java.lang.Throwable -> L31
                r0 = r2
                if (r0 != 0) goto L2f
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r2 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L31
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r3 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L31
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L31
                r0 = r2
                com.google.crypto.tink.proto.KeysetInfo.KeyInfo.PARSER = r0     // Catch: java.lang.Throwable -> L31
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
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE
                return r0
            L38:
                java.lang.String r0 = "typeUrl_"
                java.lang.String r1 = "status_"
                java.lang.String r2 = "keyId_"
                java.lang.String r3 = "outputPrefixType_"
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
                java.lang.String r1 = "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f"
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r2 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.DEFAULT_INSTANCE
                java.lang.Object r2 = newMessageInfo(r2, r1, r0)
                return r2
            L4d:
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo$Builder r0 = new com.google.crypto.tink.proto.KeysetInfo$KeyInfo$Builder
                r0.<init>(r1)
                return r0
            L53:
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = new com.google.crypto.tink.proto.KeysetInfo$KeyInfo
                r0.<init>()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
                return r0
        }

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
        public int getKeyId() {
                r1 = this;
                int r0 = r1.keyId_
                return r0
        }

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
        public com.google.crypto.tink.proto.OutputPrefixType getOutputPrefixType() {
                r2 = this;
                int r0 = r2.outputPrefixType_
                com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.forNumber(r0)
                if (r0 != 0) goto Lb
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.UNRECOGNIZED
                goto Lc
            Lb:
                r1 = r0
            Lc:
                return r1
        }

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
        public int getOutputPrefixTypeValue() {
                r1 = this;
                int r0 = r1.outputPrefixType_
                return r0
        }

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
        public com.google.crypto.tink.proto.KeyStatusType getStatus() {
                r2 = this;
                int r0 = r2.status_
                com.google.crypto.tink.proto.KeyStatusType r0 = com.google.crypto.tink.proto.KeyStatusType.forNumber(r0)
                if (r0 != 0) goto Lb
                com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.UNRECOGNIZED
                goto Lc
            Lb:
                r1 = r0
            Lc:
                return r1
        }

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
        public int getStatusValue() {
                r1 = this;
                int r0 = r1.status_
                return r0
        }

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
        public java.lang.String getTypeUrl() {
                r1 = this;
                java.lang.String r0 = r1.typeUrl_
                return r0
        }

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
        public com.google.crypto.tink.shaded.protobuf.ByteString getTypeUrlBytes() {
                r1 = this;
                java.lang.String r0 = r1.typeUrl_
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r0)
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

    public interface KeyInfoOrBuilder extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
        int getKeyId();

        com.google.crypto.tink.proto.OutputPrefixType getOutputPrefixType();

        int getOutputPrefixTypeValue();

        com.google.crypto.tink.proto.KeyStatusType getStatus();

        int getStatusValue();

        java.lang.String getTypeUrl();

        com.google.crypto.tink.shaded.protobuf.ByteString getTypeUrlBytes();
    }

    static {
            com.google.crypto.tink.proto.KeysetInfo r0 = new com.google.crypto.tink.proto.KeysetInfo
            r0.<init>()
            com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE = r0
            java.lang.Class<com.google.crypto.tink.proto.KeysetInfo> r1 = com.google.crypto.tink.proto.KeysetInfo.class
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private KeysetInfo() {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = emptyProtobufList()
            r1.keyInfo_ = r0
            return
    }

    static /* synthetic */ com.google.crypto.tink.proto.KeysetInfo access$1300() {
            com.google.crypto.tink.proto.KeysetInfo r0 = com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ void access$1400(com.google.crypto.tink.proto.KeysetInfo r0, int r1) {
            r0.setPrimaryKeyId(r1)
            return
    }

    static /* synthetic */ void access$1500(com.google.crypto.tink.proto.KeysetInfo r0) {
            r0.clearPrimaryKeyId()
            return
    }

    static /* synthetic */ void access$1600(com.google.crypto.tink.proto.KeysetInfo r0, int r1, com.google.crypto.tink.proto.KeysetInfo.KeyInfo r2) {
            r0.setKeyInfo(r1, r2)
            return
    }

    static /* synthetic */ void access$1700(com.google.crypto.tink.proto.KeysetInfo r0, com.google.crypto.tink.proto.KeysetInfo.KeyInfo r1) {
            r0.addKeyInfo(r1)
            return
    }

    static /* synthetic */ void access$1800(com.google.crypto.tink.proto.KeysetInfo r0, int r1, com.google.crypto.tink.proto.KeysetInfo.KeyInfo r2) {
            r0.addKeyInfo(r1, r2)
            return
    }

    static /* synthetic */ void access$1900(com.google.crypto.tink.proto.KeysetInfo r0, java.lang.Iterable r1) {
            r0.addAllKeyInfo(r1)
            return
    }

    static /* synthetic */ void access$2000(com.google.crypto.tink.proto.KeysetInfo r0) {
            r0.clearKeyInfo()
            return
    }

    static /* synthetic */ void access$2100(com.google.crypto.tink.proto.KeysetInfo r0, int r1) {
            r0.removeKeyInfo(r1)
            return
    }

    private void addAllKeyInfo(java.lang.Iterable<? extends com.google.crypto.tink.proto.KeysetInfo.KeyInfo> r2) {
            r1 = this;
            r1.ensureKeyInfoIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeysetInfo$KeyInfo> r0 = r1.keyInfo_
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.addAll(r2, r0)
            return
    }

    private void addKeyInfo(int r2, com.google.crypto.tink.proto.KeysetInfo.KeyInfo r3) {
            r1 = this;
            r3.getClass()
            r1.ensureKeyInfoIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeysetInfo$KeyInfo> r0 = r1.keyInfo_
            r0.add(r2, r3)
            return
    }

    private void addKeyInfo(com.google.crypto.tink.proto.KeysetInfo.KeyInfo r2) {
            r1 = this;
            r2.getClass()
            r1.ensureKeyInfoIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeysetInfo$KeyInfo> r0 = r1.keyInfo_
            r0.add(r2)
            return
    }

    private void clearKeyInfo() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r0 = emptyProtobufList()
            r1.keyInfo_ = r0
            return
    }

    private void clearPrimaryKeyId() {
            r1 = this;
            r0 = 0
            r1.primaryKeyId_ = r0
            return
    }

    private void ensureKeyInfoIsMutable() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeysetInfo$KeyInfo> r0 = r2.keyInfo_
            boolean r1 = r0.isModifiable()
            if (r1 != 0) goto Lf
        L9:
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.mutableCopy(r0)
            r2.keyInfo_ = r1
        Lf:
            return
    }

    public static com.google.crypto.tink.proto.KeysetInfo getDefaultInstance() {
            com.google.crypto.tink.proto.KeysetInfo r0 = com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE
            return r0
    }

    public static com.google.crypto.tink.proto.KeysetInfo.Builder newBuilder() {
            com.google.crypto.tink.proto.KeysetInfo r0 = com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            com.google.crypto.tink.proto.KeysetInfo$Builder r0 = (com.google.crypto.tink.proto.KeysetInfo.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.proto.KeysetInfo.Builder newBuilder(com.google.crypto.tink.proto.KeysetInfo r1) {
            com.google.crypto.tink.proto.KeysetInfo r0 = com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder(r1)
            com.google.crypto.tink.proto.KeysetInfo$Builder r0 = (com.google.crypto.tink.proto.KeysetInfo.Builder) r0
            return r0
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseDelimitedFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.KeysetInfo r0 = com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseDelimitedFrom(r0, r1)
            com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
            return r0
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.KeysetInfo r0 = com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseDelimitedFrom(r0, r1, r2)
            com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
            return r0
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.KeysetInfo r0 = com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
            return r0
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.KeysetInfo r0 = com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
            return r0
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.KeysetInfo r0 = com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
            return r0
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.KeysetInfo r0 = com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
            return r0
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseFrom(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.proto.KeysetInfo r0 = com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
            return r0
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
            com.google.crypto.tink.proto.KeysetInfo r0 = com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
            return r0
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.KeysetInfo r0 = com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
            return r0
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.KeysetInfo r0 = com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
            return r0
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.KeysetInfo r0 = com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
            return r0
    }

    public static com.google.crypto.tink.proto.KeysetInfo parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.proto.KeysetInfo r0 = com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(r0, r1, r2)
            com.google.crypto.tink.proto.KeysetInfo r0 = (com.google.crypto.tink.proto.KeysetInfo) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeysetInfo> parser() {
            com.google.crypto.tink.proto.KeysetInfo r0 = com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE
            com.google.crypto.tink.shaded.protobuf.Parser r0 = r0.getParserForType()
            return r0
    }

    private void removeKeyInfo(int r2) {
            r1 = this;
            r1.ensureKeyInfoIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeysetInfo$KeyInfo> r0 = r1.keyInfo_
            r0.remove(r2)
            return
    }

    private void setKeyInfo(int r2, com.google.crypto.tink.proto.KeysetInfo.KeyInfo r3) {
            r1 = this;
            r3.getClass()
            r1.ensureKeyInfoIsMutable()
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeysetInfo$KeyInfo> r0 = r1.keyInfo_
            r0.set(r2, r3)
            return
    }

    private void setPrimaryKeyId(int r1) {
            r0 = this;
            r0.primaryKeyId_ = r1
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            int[] r0 = com.google.crypto.tink.proto.KeysetInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
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
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeysetInfo> r0 = com.google.crypto.tink.proto.KeysetInfo.PARSER
            if (r0 != 0) goto L34
            java.lang.Class<com.google.crypto.tink.proto.KeysetInfo> r1 = com.google.crypto.tink.proto.KeysetInfo.class
            monitor-enter(r1)
            com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.proto.KeysetInfo> r2 = com.google.crypto.tink.proto.KeysetInfo.PARSER     // Catch: java.lang.Throwable -> L31
            r0 = r2
            if (r0 != 0) goto L2f
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r2 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L31
            com.google.crypto.tink.proto.KeysetInfo r3 = com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L31
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L31
            r0 = r2
            com.google.crypto.tink.proto.KeysetInfo.PARSER = r0     // Catch: java.lang.Throwable -> L31
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
            com.google.crypto.tink.proto.KeysetInfo r0 = com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE
            return r0
        L38:
            java.lang.String r0 = "primaryKeyId_"
            java.lang.String r1 = "keyInfo_"
            java.lang.Class<com.google.crypto.tink.proto.KeysetInfo$KeyInfo> r2 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.class
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
            java.lang.String r1 = "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b"
            com.google.crypto.tink.proto.KeysetInfo r2 = com.google.crypto.tink.proto.KeysetInfo.DEFAULT_INSTANCE
            java.lang.Object r2 = newMessageInfo(r2, r1, r0)
            return r2
        L4b:
            com.google.crypto.tink.proto.KeysetInfo$Builder r0 = new com.google.crypto.tink.proto.KeysetInfo$Builder
            r0.<init>(r1)
            return r0
        L51:
            com.google.crypto.tink.proto.KeysetInfo r0 = new com.google.crypto.tink.proto.KeysetInfo
            r0.<init>()
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
            return r0
    }

    @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
    public com.google.crypto.tink.proto.KeysetInfo.KeyInfo getKeyInfo(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeysetInfo$KeyInfo> r0 = r1.keyInfo_
            java.lang.Object r0 = r0.get(r2)
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
            return r0
    }

    @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
    public int getKeyInfoCount() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeysetInfo$KeyInfo> r0 = r1.keyInfo_
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
    public java.util.List<com.google.crypto.tink.proto.KeysetInfo.KeyInfo> getKeyInfoList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeysetInfo$KeyInfo> r0 = r1.keyInfo_
            return r0
    }

    public com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder getKeyInfoOrBuilder(int r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeysetInfo$KeyInfo> r0 = r1.keyInfo_
            java.lang.Object r0 = r0.get(r2)
            com.google.crypto.tink.proto.KeysetInfo$KeyInfoOrBuilder r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder) r0
            return r0
    }

    public java.util.List<? extends com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder> getKeyInfoOrBuilderList() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList<com.google.crypto.tink.proto.KeysetInfo$KeyInfo> r0 = r1.keyInfo_
            return r0
    }

    @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
    public int getPrimaryKeyId() {
            r1 = this;
            int r0 = r1.primaryKeyId_
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
