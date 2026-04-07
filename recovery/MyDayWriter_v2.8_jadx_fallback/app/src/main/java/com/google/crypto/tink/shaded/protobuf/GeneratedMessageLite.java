package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder;

/* JADX INFO: loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.AbstractMessageLite<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static java.util.Map<java.lang.Object, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<?, ?>> defaultInstanceMap;
    private int memoizedSerializedSize;
    protected com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite unknownFields;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType = null;

        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType = r0
                int[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                return
        }
    }

    public static abstract class Builder<MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        protected MessageType instance;

        protected Builder(MessageType r3) {
                r2 = this;
                r2.<init>()
                r2.defaultInstance = r3
                boolean r0 = r3.isMutable()
                if (r0 != 0) goto L12
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r2.newMutableInstance()
                r2.instance = r0
                return
            L12:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Default instance must be immutable."
                r0.<init>(r1)
                throw r0
        }

        private static <MessageType> void mergeFromInstance(MessageType r1, MessageType r2) {
                com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
                com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r1)
                r0.mergeFrom(r1, r2)
                return
        }

        private MessageType newMutableInstance() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.defaultInstance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.newMutableInstance()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final MessageType build() {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r2.buildPartial()
                boolean r1 = r0.isInitialized()
                if (r1 == 0) goto Lb
                return r0
            Lb:
                com.google.crypto.tink.shaded.protobuf.UninitializedMessageException r1 = newUninitializedMessageException(r0)
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite build() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r1.build()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public MessageType buildPartial() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                boolean r0 = r0.isMutable()
                if (r0 != 0) goto Lb
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                return r0
            Lb:
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                r0.makeImmutable()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite buildPartial() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r1.buildPartial()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final BuilderType clear() {
                r2 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.defaultInstance
                boolean r0 = r0.isMutable()
                if (r0 != 0) goto Lf
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r2.newMutableInstance()
                r2.instance = r0
                return r2
            Lf:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Default instance must be immutable."
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder clear() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r1.clear()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder clone() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r1.clone()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType clone() {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r2.getDefaultInstanceForType()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.newBuilderForType()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r2.buildPartial()
                r0.instance = r1
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder clone() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r1.clone()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ java.lang.Object mo145clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r1.clone()
                return r0
        }

        protected final void copyOnWrite() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                boolean r0 = r0.isMutable()
                if (r0 != 0) goto Lb
                r1.copyOnWriteInternal()
            Lb:
                return
        }

        protected void copyOnWriteInternal() {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r2.newMutableInstance()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r1 = r2.instance
                mergeFromInstance(r0, r1)
                r2.instance = r0
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public MessageType getDefaultInstanceForType() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.defaultInstance
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r1.getDefaultInstanceForType()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        protected /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder internalMergeFrom(com.google.crypto.tink.shaded.protobuf.AbstractMessageLite r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r1
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.internalMergeFrom(r1)
                return r1
        }

        protected BuilderType internalMergeFrom(MessageType r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r1.mergeFrom(r2)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
                r2 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                r1 = 0
                boolean r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.isInitialized(r0, r1)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.mergeFrom(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder mergeFrom(byte[] r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.mergeFrom(r1, r2, r3)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder mergeFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.mergeFrom(r1, r2, r3, r4)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5) throws java.io.IOException {
                r3 = this;
                r3.copyOnWrite()
                com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()     // Catch: java.lang.RuntimeException -> L18
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r1 = r3.instance     // Catch: java.lang.RuntimeException -> L18
                com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r1)     // Catch: java.lang.RuntimeException -> L18
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r1 = r3.instance     // Catch: java.lang.RuntimeException -> L18
                com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader r2 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.forCodedInput(r4)     // Catch: java.lang.RuntimeException -> L18
                r0.mergeFrom(r1, r2, r5)     // Catch: java.lang.RuntimeException -> L18
                return r3
            L18:
                r0 = move-exception
                java.lang.Throwable r1 = r0.getCause()
                boolean r1 = r1 instanceof java.io.IOException
                if (r1 == 0) goto L28
                java.lang.Throwable r1 = r0.getCause()
                java.io.IOException r1 = (java.io.IOException) r1
                throw r1
            L28:
                throw r0
        }

        public BuilderType mergeFrom(MessageType r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r1.getDefaultInstanceForType()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto Lb
                return r1
            Lb:
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                mergeFromInstance(r0, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] r2, int r3, int r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r1.mergeFrom(r2, r3, r4, r0)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] r9, int r10, int r11, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r12) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r8 = this;
                r8.copyOnWrite()
                com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()     // Catch: java.io.IOException -> L26 java.lang.IndexOutOfBoundsException -> L32 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3b
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r1 = r8.instance     // Catch: java.io.IOException -> L26 java.lang.IndexOutOfBoundsException -> L32 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3b
                com.google.crypto.tink.shaded.protobuf.Schema r2 = r0.schemaFor(r1)     // Catch: java.io.IOException -> L26 java.lang.IndexOutOfBoundsException -> L32 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3b
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r3 = r8.instance     // Catch: java.io.IOException -> L26 java.lang.IndexOutOfBoundsException -> L32 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3b
                int r6 = r10 + r11
                com.google.crypto.tink.shaded.protobuf.ArrayDecoders$Registers r7 = new com.google.crypto.tink.shaded.protobuf.ArrayDecoders$Registers     // Catch: java.io.IOException -> L26 java.lang.IndexOutOfBoundsException -> L32 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3b
                r7.<init>(r12)     // Catch: java.io.IOException -> L26 java.lang.IndexOutOfBoundsException -> L32 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3b
                r4 = r9
                r5 = r10
                r2.mergeFrom(r3, r4, r5, r6, r7)     // Catch: java.io.IOException -> L1d java.lang.IndexOutOfBoundsException -> L20 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L23
                return r8
            L1d:
                r0 = move-exception
                r9 = r0
                goto L2a
            L20:
                r0 = move-exception
                r9 = r0
                goto L36
            L23:
                r0 = move-exception
                r9 = r0
                goto L3f
            L26:
                r0 = move-exception
                r4 = r9
                r5 = r10
                r9 = r0
            L2a:
                java.lang.RuntimeException r10 = new java.lang.RuntimeException
                java.lang.String r0 = "Reading from byte array should not throw IOException."
                r10.<init>(r0, r9)
                throw r10
            L32:
                r0 = move-exception
                r4 = r9
                r5 = r10
                r9 = r0
            L36:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r10 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r10
            L3b:
                r0 = move-exception
                r4 = r9
                r5 = r10
                r9 = r0
            L3f:
                throw r9
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws java.io.IOException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.mergeFrom(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.mergeFrom(r1, r2, r3)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder mergeFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.mergeFrom(r1, r2, r3, r4)
                return r1
        }
    }

    protected static class DefaultInstanceBasedParser<T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> extends com.google.crypto.tink.shaded.protobuf.AbstractParser<T> {
        private final T defaultInstance;

        public DefaultInstanceBasedParser(T r1) {
                r0 = this;
                r0.<init>()
                r0.defaultInstance = r1
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Parser
        public T parsePartialFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?> r0 = r1.defaultInstance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parsePartialFrom(r0, r2, r3)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractParser, com.google.crypto.tink.shaded.protobuf.Parser
        public T parsePartialFrom(byte[] r2, int r3, int r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?> r0 = r1.defaultInstance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.access$200(r0, r2, r3, r4, r5)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractParser, com.google.crypto.tink.shaded.protobuf.Parser
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parsePartialFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r0.parsePartialFrom(r1, r2, r3, r4)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Parser
        public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r0.parsePartialFrom(r1, r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractParser, com.google.crypto.tink.shaded.protobuf.Parser
        public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r0.parsePartialFrom(r1, r2, r3, r4)
                return r1
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType> implements com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected ExtendableBuilder(MessageType r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor> ensureExtensionsAreMutable() {
                r2 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r0.extensions
                boolean r1 = r0.isImmutable()
                if (r1 == 0) goto L16
                com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r0.clone()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r1 = r2.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r1
                r1.extensions = r0
            L16:
                return r0
        }

        private void verifyExtensionContainingType(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> r3) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r3.getContainingTypeDefaultInstance()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r2.getDefaultInstanceForType()
                if (r0 != r1) goto Lb
                return
            Lb:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings."
                r0.<init>(r1)
                throw r0
        }

        public final <Type> BuilderType addExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> r5, Type r6) {
                r4 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.access$000(r5)
                r4.verifyExtensionContainingType(r0)
                r4.copyOnWrite()
                com.google.crypto.tink.shaded.protobuf.FieldSet r1 = r4.ensureExtensionsAreMutable()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r2 = r0.descriptor
                java.lang.Object r3 = r0.singularToFieldSetType(r6)
                r1.addRepeatedField(r2, r3)
                return r4
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final MessageType buildPartial() {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                boolean r0 = r0.isMutable()
                if (r0 != 0) goto Lf
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                return r0
            Lf:
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r0.extensions
                r0.makeImmutable()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.buildPartial()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite buildPartial() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = r1.buildPartial()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite buildPartial() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = r1.buildPartial()
                return r0
        }

        public final BuilderType clearExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, ?> r4) {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.access$000(r4)
                r3.verifyExtensionContainingType(r0)
                r3.copyOnWrite()
                com.google.crypto.tink.shaded.protobuf.FieldSet r1 = r3.ensureExtensionsAreMutable()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r2 = r0.descriptor
                r1.clearField(r2)
                return r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder
        protected void copyOnWriteInternal() {
                r2 = this;
                super.copyOnWriteInternal()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r0.extensions
                com.google.crypto.tink.shaded.protobuf.FieldSet r1 = com.google.crypto.tink.shaded.protobuf.FieldSet.emptySet()
                if (r0 == r1) goto L1f
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r1 = r2.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r1
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r1 = r1.extensions
                com.google.crypto.tink.shaded.protobuf.FieldSet r1 = r1.clone()
                r0.extensions = r1
            L1f:
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> r2) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                java.lang.Object r0 = r0.getExtension(r2)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> r2, int r3) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                java.lang.Object r0 = r0.getExtension(r2, r3)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> r2) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                int r0 = r0.getExtensionCount(r2)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> r2) {
                r1 = this;
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                boolean r0 = r0.hasExtension(r2)
                return r0
        }

        void internalSetExtensionSet(com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor> r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r0
                r0.extensions = r2
                return
        }

        public final <Type> BuilderType setExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> r5, int r6, Type r7) {
                r4 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.access$000(r5)
                r4.verifyExtensionContainingType(r0)
                r4.copyOnWrite()
                com.google.crypto.tink.shaded.protobuf.FieldSet r1 = r4.ensureExtensionsAreMutable()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r2 = r0.descriptor
                java.lang.Object r3 = r0.singularToFieldSetType(r7)
                r1.setRepeatedField(r2, r6, r3)
                return r4
        }

        public final <Type> BuilderType setExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> r5, Type r6) {
                r4 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.access$000(r5)
                r4.verifyExtensionContainingType(r0)
                r4.copyOnWrite()
                com.google.crypto.tink.shaded.protobuf.FieldSet r1 = r4.ensureExtensionsAreMutable()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r2 = r0.descriptor
                java.lang.Object r3 = r0.toFieldSetType(r6)
                r1.setField(r2, r3)
                return r4
        }
    }

    public static abstract class ExtendableMessage<MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType> implements com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor> extensions;

        protected class ExtensionWriter {
            private final java.util.Iterator<java.util.Map.Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object>> iter;
            private final boolean messageSetWireFormat;
            private java.util.Map.Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor, java.lang.Object> next;
            final /* synthetic */ com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage this$0;

            private ExtensionWriter(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage r2, boolean r3) {
                    r1 = this;
                    r1.this$0 = r2
                    r1.<init>()
                    com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r0 = r1.this$0
                    com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r0.extensions
                    java.util.Iterator r0 = r0.iterator()
                    r1.iter = r0
                    java.util.Iterator<java.util.Map$Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor, java.lang.Object>> r0 = r1.iter
                    boolean r0 = r0.hasNext()
                    if (r0 == 0) goto L21
                    java.util.Iterator<java.util.Map$Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor, java.lang.Object>> r0 = r1.iter
                    java.lang.Object r0 = r0.next()
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                    r1.next = r0
                L21:
                    r1.messageSetWireFormat = r3
                    return
            }

            /* synthetic */ ExtensionWriter(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage r1, boolean r2, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.AnonymousClass1 r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public void writeUntil(int r4, com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5) throws java.io.IOException {
                    r3 = this;
                L1:
                    java.util.Map$Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor, java.lang.Object> r0 = r3.next
                    if (r0 == 0) goto L5d
                    java.util.Map$Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor, java.lang.Object> r0 = r3.next
                    java.lang.Object r0 = r0.getKey()
                    com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor) r0
                    int r0 = r0.getNumber()
                    if (r0 >= r4) goto L5d
                    java.util.Map$Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor, java.lang.Object> r0 = r3.next
                    java.lang.Object r0 = r0.getKey()
                    com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor) r0
                    boolean r1 = r3.messageSetWireFormat
                    if (r1 == 0) goto L3d
                    com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = r0.getLiteJavaType()
                    com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
                    if (r1 != r2) goto L3d
                    boolean r1 = r0.isRepeated()
                    if (r1 != 0) goto L3d
                    int r1 = r0.getNumber()
                    java.util.Map$Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor, java.lang.Object> r2 = r3.next
                    java.lang.Object r2 = r2.getValue()
                    com.google.crypto.tink.shaded.protobuf.MessageLite r2 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r2
                    r5.writeMessageSetExtension(r1, r2)
                    goto L46
                L3d:
                    java.util.Map$Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor, java.lang.Object> r1 = r3.next
                    java.lang.Object r1 = r1.getValue()
                    com.google.crypto.tink.shaded.protobuf.FieldSet.writeField(r0, r1, r5)
                L46:
                    java.util.Iterator<java.util.Map$Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor, java.lang.Object>> r1 = r3.iter
                    boolean r1 = r1.hasNext()
                    if (r1 == 0) goto L59
                    java.util.Iterator<java.util.Map$Entry<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor, java.lang.Object>> r1 = r3.iter
                    java.lang.Object r1 = r1.next()
                    java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                    r3.next = r1
                    goto L5c
                L59:
                    r1 = 0
                    r3.next = r1
                L5c:
                    goto L1
                L5d:
                    return
            }
        }

        public ExtendableMessage() {
                r1 = this;
                r1.<init>()
                com.google.crypto.tink.shaded.protobuf.FieldSet r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.emptySet()
                r1.extensions = r0
                return
        }

        private void eagerlyMergeMessageSetExtension(com.google.crypto.tink.shaded.protobuf.CodedInputStream r7, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> r8, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r9, int r10) throws java.io.IOException {
                r6 = this;
                r5 = r10
                r0 = 2
                int r4 = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(r10, r0)
                r0 = r6
                r1 = r7
                r3 = r8
                r2 = r9
                boolean r7 = r0.parseExtension(r1, r2, r3, r4, r5)
                return
        }

        private void mergeMessageSetExtensionFromBytes(com.google.crypto.tink.shaded.protobuf.ByteString r7, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r8, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> r9) throws java.io.IOException {
                r6 = this;
                r0 = 0
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r1 = r6.extensions
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r2 = r9.descriptor
                java.lang.Object r1 = r1.getField(r2)
                com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1
                if (r1 == 0) goto L11
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r1.toBuilder()
            L11:
                if (r0 != 0) goto L1b
                com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r9.getMessageDefaultInstance()
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r2.newBuilderForType()
            L1b:
                r0.mergeFrom(r7, r8)
                com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r0.build()
                com.google.crypto.tink.shaded.protobuf.FieldSet r3 = r6.ensureExtensionsAreMutable()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r4 = r9.descriptor
                java.lang.Object r5 = r9.singularToFieldSetType(r2)
                r3.setField(r4, r5)
                return
        }

        private <MessageType extends com.google.crypto.tink.shaded.protobuf.MessageLite> void mergeMessageSetExtensionFromCodedStream(MessageType r6, com.google.crypto.tink.shaded.protobuf.CodedInputStream r7, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r8) throws java.io.IOException {
                r5 = this;
                r0 = 0
                r1 = 0
                r2 = 0
            L3:
                int r3 = r7.readTag()
                if (r3 != 0) goto La
                goto L32
            La:
                int r4 = com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_TYPE_ID_TAG
                if (r3 != r4) goto L19
                int r0 = r7.readUInt32()
                if (r0 == 0) goto L47
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r2 = r8.findLiteExtensionByNumber(r6, r0)
                goto L47
            L19:
                int r4 = com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_MESSAGE_TAG
                if (r3 != r4) goto L2b
                if (r0 == 0) goto L26
                if (r2 == 0) goto L26
                r5.eagerlyMergeMessageSetExtension(r7, r2, r8, r0)
                r1 = 0
                goto L3
            L26:
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = r7.readBytes()
                goto L47
            L2b:
                boolean r4 = r7.skipField(r3)
                if (r4 != 0) goto L47
            L32:
                int r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG
                r7.checkLastTagWas(r3)
                if (r1 == 0) goto L46
                if (r0 == 0) goto L46
                if (r2 == 0) goto L41
                r5.mergeMessageSetExtensionFromBytes(r1, r8, r2)
                goto L46
            L41:
                if (r1 == 0) goto L46
                r5.mergeLengthDelimitedField(r0, r1)
            L46:
                return
            L47:
                goto L3
        }

        private boolean parseExtension(com.google.crypto.tink.shaded.protobuf.CodedInputStream r18, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r19, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> r20, int r21, int r22) throws java.io.IOException {
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                r3 = r20
                int r4 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r21)
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 1
                if (r3 != 0) goto L14
                r5 = 1
                goto L41
            L14:
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r3.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r9 = r9.getLiteType()
                int r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.getWireFormatForFieldType(r9, r7)
                if (r4 != r9) goto L22
                r6 = 0
                goto L41
            L22:
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r3.descriptor
                boolean r9 = r9.isRepeated
                if (r9 == 0) goto L40
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r3.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r9 = r9.type
                boolean r9 = r9.isPackable()
                if (r9 == 0) goto L40
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r9 = r3.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r9 = r9.getLiteType()
                int r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.getWireFormatForFieldType(r9, r8)
                if (r4 != r9) goto L40
                r6 = 1
                goto L41
            L40:
                r5 = 1
            L41:
                if (r5 == 0) goto L4a
                r9 = r21
                boolean r7 = r0.parseUnknownField(r9, r1)
                return r7
            L4a:
                r9 = r21
                com.google.crypto.tink.shaded.protobuf.FieldSet r10 = r0.ensureExtensionsAreMutable()
                if (r6 == 0) goto Laf
                int r11 = r1.readRawVarint32()
                int r12 = r1.pushLimit(r11)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r13 = r3.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r13 = r13.getLiteType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r14 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM
                if (r13 != r14) goto L8e
            L64:
                int r7 = r1.getBytesUntilLimit()
                if (r7 <= 0) goto L8b
                int r7 = r1.readEnum()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r13 = r3.descriptor
                com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap r13 = r13.getEnumType()
                com.google.crypto.tink.shaded.protobuf.Internal$EnumLite r13 = r13.findValueByNumber(r7)
                if (r13 != 0) goto L7b
                return r8
            L7b:
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r14 = r0.extensions
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r15 = r3.descriptor
                r16 = r8
                java.lang.Object r8 = r3.singularToFieldSetType(r13)
                r14.addRepeatedField(r15, r8)
                r8 = r16
                goto L64
            L8b:
                r16 = r8
                goto La8
            L8e:
                r16 = r8
            L90:
                int r8 = r1.getBytesUntilLimit()
                if (r8 <= 0) goto La8
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r8 = r3.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r8 = r8.getLiteType()
                java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.FieldSet.readPrimitiveField(r1, r8, r7)
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r13 = r0.extensions
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r14 = r3.descriptor
                r13.addRepeatedField(r14, r8)
                goto L90
            La8:
                r1.popLimit(r12)
                r11 = r22
                goto L146
            Laf:
                r16 = r8
                int[] r8 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r11 = r3.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r11 = r11.getLiteJavaType()
                int r11 = r11.ordinal()
                r8 = r8[r11]
                switch(r8) {
                    case 1: goto Le8;
                    case 2: goto Lcf;
                    default: goto Lc2;
                }
            Lc2:
                r11 = r22
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r8 = r3.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r8 = r8.getLiteType()
                java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.FieldSet.readPrimitiveField(r1, r8, r7)
                goto L127
            Lcf:
                int r7 = r1.readEnum()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r8 = r3.descriptor
                com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap r8 = r8.getEnumType()
                com.google.crypto.tink.shaded.protobuf.Internal$EnumLite r8 = r8.findValueByNumber(r7)
                if (r8 != 0) goto Le5
                r11 = r22
                r0.mergeVarintField(r11, r7)
                return r16
            Le5:
                r11 = r22
                goto L127
            Le8:
                r11 = r22
                r7 = 0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r8 = r3.descriptor
                boolean r8 = r8.isRepeated()
                if (r8 != 0) goto L103
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r8 = r0.extensions
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r12 = r3.descriptor
                java.lang.Object r8 = r8.getField(r12)
                com.google.crypto.tink.shaded.protobuf.MessageLite r8 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r8
                if (r8 == 0) goto L103
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r7 = r8.toBuilder()
            L103:
                if (r7 != 0) goto L10d
                com.google.crypto.tink.shaded.protobuf.MessageLite r8 = r3.getMessageDefaultInstance()
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r7 = r8.newBuilderForType()
            L10d:
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r8 = r3.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r8 = r8.getLiteType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r12 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP
                if (r8 != r12) goto L11f
                int r8 = r3.getNumber()
                r1.readGroup(r8, r7, r2)
                goto L122
            L11f:
                r1.readMessage(r7, r2)
            L122:
                com.google.crypto.tink.shaded.protobuf.MessageLite r8 = r7.build()
            L127:
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r7 = r3.descriptor
                boolean r7 = r7.isRepeated()
                if (r7 == 0) goto L13b
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r7 = r0.extensions
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r12 = r3.descriptor
                java.lang.Object r13 = r3.singularToFieldSetType(r8)
                r7.addRepeatedField(r12, r13)
                goto L146
            L13b:
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r7 = r0.extensions
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r12 = r3.descriptor
                java.lang.Object r13 = r3.singularToFieldSetType(r8)
                r7.setField(r12, r13)
            L146:
                return r16
        }

        private void verifyExtensionContainingType(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, ?> r3) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r3.getContainingTypeDefaultInstance()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r2.getDefaultInstanceForType()
                if (r0 != r1) goto Lb
                return
            Lb:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings."
                r0.<init>(r1)
                throw r0
        }

        com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor> ensureExtensionsAreMutable() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r1.extensions
                boolean r0 = r0.isImmutable()
                if (r0 == 0) goto L10
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r1.extensions
                com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r0.clone()
                r1.extensions = r0
            L10:
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r1.extensions
                return r0
        }

        protected boolean extensionsAreInitialized() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r1.extensions
                boolean r0 = r0.isInitialized()
                return r0
        }

        protected int extensionsSerializedSize() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r1.extensions
                int r0 = r0.getSerializedSize()
                return r0
        }

        protected int extensionsSerializedSizeAsMessageSet() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r1.extensions
                int r0 = r0.getMessageSetSerializedSize()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> r4) {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.access$000(r4)
                r3.verifyExtensionContainingType(r0)
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r1 = r3.extensions
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r2 = r0.descriptor
                java.lang.Object r1 = r1.getField(r2)
                if (r1 != 0) goto L14
                Type r2 = r0.defaultValue
                return r2
            L14:
                java.lang.Object r2 = r0.fromFieldSetType(r1)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> r4, int r5) {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.access$000(r4)
                r3.verifyExtensionContainingType(r0)
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r1 = r3.extensions
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r2 = r0.descriptor
                java.lang.Object r1 = r1.getRepeatedField(r2, r5)
                java.lang.Object r1 = r0.singularFromFieldSetType(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> r4) {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.access$000(r4)
                r3.verifyExtensionContainingType(r0)
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r1 = r3.extensions
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r2 = r0.descriptor
                int r1 = r1.getRepeatedFieldCount(r2)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> r4) {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.access$000(r4)
                r3.verifyExtensionContainingType(r0)
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r1 = r3.extensions
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r2 = r0.descriptor
                boolean r1 = r1.hasField(r2)
                return r1
        }

        protected final void mergeExtensionFields(MessageType r3) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r2.extensions
                boolean r0 = r0.isImmutable()
                if (r0 == 0) goto L10
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r2.extensions
                com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r0.clone()
                r2.extensions = r0
            L10:
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r2.extensions
                com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r1 = r3.extensions
                r0.mergeFrom(r1)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder newBuilderForType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = super.newBuilderForType()
                return r0
        }

        protected com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newExtensionWriter() {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage$ExtensionWriter r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage$ExtensionWriter
                r1 = 0
                r2 = 0
                r0.<init>(r3, r1, r2)
                return r0
        }

        protected com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newMessageSetExtensionWriter() {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage$ExtensionWriter r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage$ExtensionWriter
                r1 = 1
                r2 = 0
                r0.<init>(r3, r1, r2)
                return r0
        }

        protected <MessageType extends com.google.crypto.tink.shaded.protobuf.MessageLite> boolean parseUnknownField(MessageType r7, com.google.crypto.tink.shaded.protobuf.CodedInputStream r8, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r9, int r10) throws java.io.IOException {
                r6 = this;
                int r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(r10)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r3 = r9.findLiteExtensionByNumber(r7, r5)
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r10
                boolean r8 = r0.parseExtension(r1, r2, r3, r4, r5)
                return r8
        }

        protected <MessageType extends com.google.crypto.tink.shaded.protobuf.MessageLite> boolean parseUnknownFieldAsMessageSet(MessageType r3, com.google.crypto.tink.shaded.protobuf.CodedInputStream r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5, int r6) throws java.io.IOException {
                r2 = this;
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG
                if (r6 != r0) goto L9
                r2.mergeMessageSetExtensionFromCodedStream(r3, r4, r5)
                r0 = 1
                return r0
            L9:
                int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r6)
                r1 = 2
                if (r0 != r1) goto L15
                boolean r1 = r2.parseUnknownField(r3, r4, r5, r6)
                return r1
            L15:
                boolean r1 = r4.skipField(r6)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
        public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder toBuilder() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = super.toBuilder()
                return r0
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder {
        <Type> Type getExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> r1);

        <Type> Type getExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> r1, int r2);

        <Type> int getExtensionCount(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, java.util.List<Type>> r1);

        <Type> boolean hasExtension(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, Type> r1);
    }

    static final class ExtensionDescriptor implements com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor> {
        final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<?> enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType type;

        ExtensionDescriptor(com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<?> r1, int r2, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r3, boolean r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.enumTypeMap = r1
                r0.number = r2
                r0.type = r3
                r0.isRepeated = r4
                r0.isPacked = r5
                return
        }

        public int compareTo(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor r3) {
                r2 = this;
                int r0 = r2.number
                int r1 = r3.number
                int r0 = r0 - r1
                return r0
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
                r0 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor) r1
                int r1 = r0.compareTo(r1)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<?> getEnumType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<?> r0 = r1.enumTypeMap
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType getLiteJavaType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r1.type
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = r0.getJavaType()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType getLiteType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r1.type
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public int getNumber() {
                r1 = this;
                int r0 = r1.number
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public com.google.crypto.tink.shaded.protobuf.MessageLite.Builder internalMergeFrom(com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r3, com.google.crypto.tink.shaded.protobuf.MessageLite r4) {
                r2 = this;
                r0 = r3
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder) r0
                r1 = r4
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r1
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.mergeFrom(r1)
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public boolean isPacked() {
                r1 = this;
                boolean r0 = r1.isPacked
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public boolean isRepeated() {
                r1 = this;
                boolean r0 = r1.isRepeated
                return r0
        }
    }

    public static class GeneratedExtension<ContainingType extends com.google.crypto.tink.shaded.protobuf.MessageLite, Type> extends com.google.crypto.tink.shaded.protobuf.ExtensionLite<ContainingType, Type> {
        final ContainingType containingTypeDefaultInstance;
        final Type defaultValue;
        final com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor descriptor;
        final com.google.crypto.tink.shaded.protobuf.MessageLite messageDefaultInstance;

        GeneratedExtension(ContainingType r3, Type r4, com.google.crypto.tink.shaded.protobuf.MessageLite r5, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor r6, java.lang.Class r7) {
                r2 = this;
                r2.<init>()
                if (r3 == 0) goto L21
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r6.getLiteType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE
                if (r0 != r1) goto L18
                if (r5 == 0) goto L10
                goto L18
            L10:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Null messageDefaultInstance"
                r0.<init>(r1)
                throw r0
            L18:
                r2.containingTypeDefaultInstance = r3
                r2.defaultValue = r4
                r2.messageDefaultInstance = r5
                r2.descriptor = r6
                return
            L21:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Null containingTypeDefaultInstance"
                r0.<init>(r1)
                throw r0
        }

        java.lang.Object fromFieldSetType(java.lang.Object r5) {
                r4 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r4.descriptor
                boolean r0 = r0.isRepeated()
                if (r0 == 0) goto L32
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r4.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = r0.getLiteJavaType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM
                if (r0 != r1) goto L31
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r5
                java.util.List r1 = (java.util.List) r1
                java.util.Iterator r1 = r1.iterator()
            L1e:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L30
                java.lang.Object r2 = r1.next()
                java.lang.Object r3 = r4.singularFromFieldSetType(r2)
                r0.add(r3)
                goto L1e
            L30:
                return r0
            L31:
                return r5
            L32:
                java.lang.Object r0 = r4.singularFromFieldSetType(r5)
                return r0
        }

        public ContainingType getContainingTypeDefaultInstance() {
                r1 = this;
                ContainingType extends com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.containingTypeDefaultInstance
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ExtensionLite
        public Type getDefaultValue() {
                r1 = this;
                Type r0 = r1.defaultValue
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ExtensionLite
        public com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType getLiteType() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r1.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r0.getLiteType()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ExtensionLite
        public com.google.crypto.tink.shaded.protobuf.MessageLite getMessageDefaultInstance() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.messageDefaultInstance
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ExtensionLite
        public int getNumber() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r1.descriptor
                int r0 = r0.getNumber()
                return r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ExtensionLite
        public boolean isRepeated() {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r1.descriptor
                boolean r0 = r0.isRepeated
                return r0
        }

        java.lang.Object singularFromFieldSetType(java.lang.Object r3) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r2.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = r0.getLiteJavaType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM
                if (r0 != r1) goto L1a
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r2.descriptor
                com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<?> r0 = r0.enumTypeMap
                r1 = r3
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                com.google.crypto.tink.shaded.protobuf.Internal$EnumLite r0 = r0.findValueByNumber(r1)
                return r0
            L1a:
                return r3
        }

        java.lang.Object singularToFieldSetType(java.lang.Object r3) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r2.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = r0.getLiteJavaType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM
                if (r0 != r1) goto L16
                r0 = r3
                com.google.crypto.tink.shaded.protobuf.Internal$EnumLite r0 = (com.google.crypto.tink.shaded.protobuf.Internal.EnumLite) r0
                int r0 = r0.getNumber()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                return r0
            L16:
                return r3
        }

        java.lang.Object toFieldSetType(java.lang.Object r5) {
                r4 = this;
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r4.descriptor
                boolean r0 = r0.isRepeated()
                if (r0 == 0) goto L32
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r4.descriptor
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = r0.getLiteJavaType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM
                if (r0 != r1) goto L31
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r5
                java.util.List r1 = (java.util.List) r1
                java.util.Iterator r1 = r1.iterator()
            L1e:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L30
                java.lang.Object r2 = r1.next()
                java.lang.Object r3 = r4.singularToFieldSetType(r2)
                r0.add(r3)
                goto L1e
            L30:
                return r0
            L31:
                return r5
            L32:
                java.lang.Object r0 = r4.singularToFieldSetType(r5)
                return r0
        }
    }

    public enum MethodToInvoke extends java.lang.Enum<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke> {
        private static final /* synthetic */ com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke[] $VALUES = null;
        public static final com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke BUILD_MESSAGE_INFO = null;
        public static final com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke GET_DEFAULT_INSTANCE = null;
        public static final com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke GET_MEMOIZED_IS_INITIALIZED = null;
        public static final com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke GET_PARSER = null;
        public static final com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke NEW_BUILDER = null;
        public static final com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke NEW_MUTABLE_INSTANCE = null;
        public static final com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke SET_MEMOIZED_IS_INITIALIZED = null;

        static {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r1 = "GET_MEMOIZED_IS_INITIALIZED"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r1 = "SET_MEMOIZED_IS_INITIALIZED"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r1 = "BUILD_MESSAGE_INFO"
                r2 = 2
                r0.<init>(r1, r2)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r1 = "NEW_MUTABLE_INSTANCE"
                r2 = 3
                r0.<init>(r1, r2)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r1 = "NEW_BUILDER"
                r2 = 4
                r0.<init>(r1, r2)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r1 = "GET_DEFAULT_INSTANCE"
                r2 = 5
                r0.<init>(r1, r2)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r1 = "GET_PARSER"
                r2 = 6
                r0.<init>(r1, r2)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r3 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r4 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r5 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r6 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r7 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r8 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r9 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke[]{r3, r4, r5, r6, r7, r8, r9}
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.$VALUES = r0
                return
        }

        MethodToInvoke(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke> r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke) r0
                return r0
        }

        public static com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke[] values() {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke[]) r0
                return r0
        }
    }

    protected static final class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final java.lang.Class<?> messageClass;
        private final java.lang.String messageClassName;

        SerializedForm(com.google.crypto.tink.shaded.protobuf.MessageLite r2) {
                r1 = this;
                r1.<init>()
                java.lang.Class r0 = r2.getClass()
                r1.messageClass = r0
                java.lang.Class<?> r0 = r1.messageClass
                java.lang.String r0 = r0.getName()
                r1.messageClassName = r0
                byte[] r0 = r2.toByteArray()
                r1.asBytes = r0
                return
        }

        public static com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.SerializedForm of(com.google.crypto.tink.shaded.protobuf.MessageLite r1) {
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$SerializedForm r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$SerializedForm
                r0.<init>(r1)
                return r0
        }

        @java.lang.Deprecated
        private java.lang.Object readResolveFallback() throws java.io.ObjectStreamException {
                r5 = this;
                java.lang.Class r0 = r5.resolveMessageClass()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L52 java.lang.ClassNotFoundException -> L6e
                java.lang.String r1 = "defaultInstance"
                java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L52 java.lang.ClassNotFoundException -> L6e
                r2 = 1
                r1.setAccessible(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L52 java.lang.ClassNotFoundException -> L6e
                r2 = 0
                java.lang.Object r2 = r1.get(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L52 java.lang.ClassNotFoundException -> L6e
                com.google.crypto.tink.shaded.protobuf.MessageLite r2 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r2     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L52 java.lang.ClassNotFoundException -> L6e
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r3 = r2.newBuilderForType()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L52 java.lang.ClassNotFoundException -> L6e
                byte[] r4 = r5.asBytes     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L52 java.lang.ClassNotFoundException -> L6e
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r3 = r3.mergeFrom(r4)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L52 java.lang.ClassNotFoundException -> L6e
                com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r3.buildPartial()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L52 java.lang.ClassNotFoundException -> L6e
                return r3
            L24:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Unable to understand proto buffer"
                r1.<init>(r2, r0)
                throw r1
            L2d:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Unable to call parsePartialFrom"
                r1.<init>(r2, r0)
                throw r1
            L36:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unable to call defaultInstance in "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = r5.messageClassName
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                throw r1
            L52:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unable to find defaultInstance in "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = r5.messageClassName
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                throw r1
            L6e:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unable to find proto buffer class: "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = r5.messageClassName
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                throw r1
        }

        private java.lang.Class<?> resolveMessageClass() throws java.lang.ClassNotFoundException {
                r1 = this;
                java.lang.Class<?> r0 = r1.messageClass
                if (r0 == 0) goto L7
                java.lang.Class<?> r0 = r1.messageClass
                goto Ld
            L7:
                java.lang.String r0 = r1.messageClassName
                java.lang.Class r0 = java.lang.Class.forName(r0)
            Ld:
                return r0
        }

        protected java.lang.Object readResolve() throws java.io.ObjectStreamException {
                r5 = this;
                java.lang.Class r0 = r5.resolveMessageClass()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L52 java.lang.ClassNotFoundException -> L58
                java.lang.String r1 = "DEFAULT_INSTANCE"
                java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L52 java.lang.ClassNotFoundException -> L58
                r2 = 1
                r1.setAccessible(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L52 java.lang.ClassNotFoundException -> L58
                r2 = 0
                java.lang.Object r2 = r1.get(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L52 java.lang.ClassNotFoundException -> L58
                com.google.crypto.tink.shaded.protobuf.MessageLite r2 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r2     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L52 java.lang.ClassNotFoundException -> L58
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r3 = r2.newBuilderForType()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L52 java.lang.ClassNotFoundException -> L58
                byte[] r4 = r5.asBytes     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L52 java.lang.ClassNotFoundException -> L58
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r3 = r3.mergeFrom(r4)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L52 java.lang.ClassNotFoundException -> L58
                com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r3.buildPartial()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L24 java.lang.IllegalAccessException -> L2d java.lang.SecurityException -> L36 java.lang.NoSuchFieldException -> L52 java.lang.ClassNotFoundException -> L58
                return r3
            L24:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Unable to understand proto buffer"
                r1.<init>(r2, r0)
                throw r1
            L2d:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Unable to call parsePartialFrom"
                r1.<init>(r2, r0)
                throw r1
            L36:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unable to call DEFAULT_INSTANCE in "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = r5.messageClassName
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                throw r1
            L52:
                r0 = move-exception
                java.lang.Object r1 = r5.readResolveFallback()
                return r1
            L58:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unable to find proto buffer class: "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = r5.messageClassName
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                throw r1
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.defaultInstanceMap = r0
            return
    }

    public GeneratedMessageLite() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.memoizedSerializedSize = r0
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.getDefaultInstance()
            r1.unknownFields = r0
            return
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension access$000(com.google.crypto.tink.shaded.protobuf.ExtensionLite r1) {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r0 = checkIsLite(r1)
            return r0
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite access$200(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1, byte[] r2, int r3, int r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parsePartialFrom(r1, r2, r3, r4, r5)
            return r0
    }

    private static <MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableBuilder<MessageType, BuilderType>, T> com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<MessageType, T> checkIsLite(com.google.crypto.tink.shaded.protobuf.ExtensionLite<MessageType, T> r2) {
            boolean r0 = r2.isLite()
            if (r0 == 0) goto La
            r0 = r2
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension) r0
            return r0
        La:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Expected a lite extension."
            r0.<init>(r1)
            throw r0
    }

    private static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T checkMessageInitialized(T r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            if (r1 == 0) goto L17
            boolean r0 = r1.isInitialized()
            if (r0 == 0) goto L9
            goto L17
        L9:
            com.google.crypto.tink.shaded.protobuf.UninitializedMessageException r0 = r1.newUninitializedMessageException()
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = r0.asInvalidProtocolBufferException()
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = r0.setUnfinishedMessage(r1)
            throw r0
        L17:
            return r1
    }

    private int computeSerializedSize(com.google.crypto.tink.shaded.protobuf.Schema<?> r2) {
            r1 = this;
            if (r2 != 0) goto Lf
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r1)
            int r0 = r0.getSerializedSize(r1)
            return r0
        Lf:
            int r0 = r2.getSerializedSize(r1)
            return r0
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.BooleanList emptyBooleanList() {
            com.google.crypto.tink.shaded.protobuf.BooleanArrayList r0 = com.google.crypto.tink.shaded.protobuf.BooleanArrayList.emptyList()
            return r0
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.DoubleList emptyDoubleList() {
            com.google.crypto.tink.shaded.protobuf.DoubleArrayList r0 = com.google.crypto.tink.shaded.protobuf.DoubleArrayList.emptyList()
            return r0
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.FloatList emptyFloatList() {
            com.google.crypto.tink.shaded.protobuf.FloatArrayList r0 = com.google.crypto.tink.shaded.protobuf.FloatArrayList.emptyList()
            return r0
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.IntList emptyIntList() {
            com.google.crypto.tink.shaded.protobuf.IntArrayList r0 = com.google.crypto.tink.shaded.protobuf.IntArrayList.emptyList()
            return r0
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.LongList emptyLongList() {
            com.google.crypto.tink.shaded.protobuf.LongArrayList r0 = com.google.crypto.tink.shaded.protobuf.LongArrayList.emptyList()
            return r0
    }

    protected static <E> com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<E> emptyProtobufList() {
            com.google.crypto.tink.shaded.protobuf.ProtobufArrayList r0 = com.google.crypto.tink.shaded.protobuf.ProtobufArrayList.emptyList()
            return r0
    }

    private final void ensureUnknownFieldsInitialized() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = r2.unknownFields
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.getDefaultInstance()
            if (r0 != r1) goto Le
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.newInstance()
            r2.unknownFields = r0
        Le:
            return
    }

    static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<?, ?>> T getDefaultInstance(java.lang.Class<T> r4) {
            java.util.Map<java.lang.Object, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<?, ?>> r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.defaultInstanceMap
            java.lang.Object r0 = r0.get(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            if (r0 != 0) goto L2a
            java.lang.String r1 = r4.getName()     // Catch: java.lang.ClassNotFoundException -> L21
            java.lang.ClassLoader r2 = r4.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L21
            r3 = 1
            java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.ClassNotFoundException -> L21
            java.util.Map<java.lang.Object, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<?, ?>> r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.defaultInstanceMap
            java.lang.Object r1 = r1.get(r4)
            r0 = r1
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            goto L2a
        L21:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Class initialization cannot fail."
            r2.<init>(r3, r1)
            throw r2
        L2a:
            if (r0 != 0) goto L44
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.allocateInstance(r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r1
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r1.getDefaultInstanceForType()
            if (r0 == 0) goto L3e
            java.util.Map<java.lang.Object, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<?, ?>> r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.defaultInstanceMap
            r1.put(r4, r0)
            goto L44
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L44:
            return r0
    }

    static java.lang.reflect.Method getMethodOrDie(java.lang.Class r4, java.lang.String r5, java.lang.Class... r6) {
            java.lang.reflect.Method r0 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Generated message class \""
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r4.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "\" missing method \""
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = "\"."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
    }

    static java.lang.Object invokeOrDie(java.lang.reflect.Method r4, java.lang.Object r5, java.lang.Object... r6) {
            java.lang.Object r0 = r4.invoke(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L5 java.lang.IllegalAccessException -> L22
            return r0
        L5:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r2 = r1 instanceof java.lang.RuntimeException
            if (r2 != 0) goto L1e
            boolean r2 = r1 instanceof java.lang.Error
            if (r2 == 0) goto L16
            r2 = r1
            java.lang.Error r2 = (java.lang.Error) r2
            throw r2
        L16:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Unexpected exception thrown by generated accessor method."
            r2.<init>(r3, r1)
            throw r2
        L1e:
            r2 = r1
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2
            throw r2
        L22:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't use Java reflection to implement protocol message reflection."
            r1.<init>(r2, r0)
            throw r1
    }

    protected static final <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> boolean isInitialized(T r4, boolean r5) {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED
            java.lang.Object r0 = r4.dynamicMethod(r0)
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            r1 = 1
            if (r0 != r1) goto L10
            return r1
        L10:
            if (r0 != 0) goto L14
            r1 = 0
            return r1
        L14:
            com.google.crypto.tink.shaded.protobuf.Protobuf r1 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.Schema r1 = r1.schemaFor(r4)
            boolean r1 = r1.isInitialized(r4)
            if (r5 == 0) goto L2c
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r2 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED
            if (r1 == 0) goto L28
            r3 = r4
            goto L29
        L28:
            r3 = 0
        L29:
            r4.dynamicMethod(r2, r3)
        L2c:
            return r1
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.BooleanList mutableCopy(com.google.crypto.tink.shaded.protobuf.Internal.BooleanList r2) {
            int r0 = r2.size()
            if (r0 != 0) goto La
            r1 = 10
            goto Lc
        La:
            int r1 = r0 * 2
        Lc:
            com.google.crypto.tink.shaded.protobuf.Internal$BooleanList r1 = r2.mutableCopyWithCapacity(r1)
            return r1
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.DoubleList mutableCopy(com.google.crypto.tink.shaded.protobuf.Internal.DoubleList r2) {
            int r0 = r2.size()
            if (r0 != 0) goto La
            r1 = 10
            goto Lc
        La:
            int r1 = r0 * 2
        Lc:
            com.google.crypto.tink.shaded.protobuf.Internal$DoubleList r1 = r2.mutableCopyWithCapacity(r1)
            return r1
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.FloatList mutableCopy(com.google.crypto.tink.shaded.protobuf.Internal.FloatList r2) {
            int r0 = r2.size()
            if (r0 != 0) goto La
            r1 = 10
            goto Lc
        La:
            int r1 = r0 * 2
        Lc:
            com.google.crypto.tink.shaded.protobuf.Internal$FloatList r1 = r2.mutableCopyWithCapacity(r1)
            return r1
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.IntList mutableCopy(com.google.crypto.tink.shaded.protobuf.Internal.IntList r2) {
            int r0 = r2.size()
            if (r0 != 0) goto La
            r1 = 10
            goto Lc
        La:
            int r1 = r0 * 2
        Lc:
            com.google.crypto.tink.shaded.protobuf.Internal$IntList r1 = r2.mutableCopyWithCapacity(r1)
            return r1
    }

    protected static com.google.crypto.tink.shaded.protobuf.Internal.LongList mutableCopy(com.google.crypto.tink.shaded.protobuf.Internal.LongList r2) {
            int r0 = r2.size()
            if (r0 != 0) goto La
            r1 = 10
            goto Lc
        La:
            int r1 = r0 * 2
        Lc:
            com.google.crypto.tink.shaded.protobuf.Internal$LongList r1 = r2.mutableCopyWithCapacity(r1)
            return r1
    }

    protected static <E> com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<E> mutableCopy(com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList<E> r2) {
            int r0 = r2.size()
            if (r0 != 0) goto La
            r1 = 10
            goto Lc
        La:
            int r1 = r0 * 2
        Lc:
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r1 = r2.mutableCopyWithCapacity(r1)
            return r1
    }

    protected static java.lang.Object newMessageInfo(com.google.crypto.tink.shaded.protobuf.MessageLite r1, java.lang.String r2, java.lang.Object[] r3) {
            com.google.crypto.tink.shaded.protobuf.RawMessageInfo r0 = new com.google.crypto.tink.shaded.protobuf.RawMessageInfo
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static <ContainingType extends com.google.crypto.tink.shaded.protobuf.MessageLite, Type> com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType r6, com.google.crypto.tink.shaded.protobuf.MessageLite r7, com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<?> r8, int r9, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r10, boolean r11, java.lang.Class r12) {
            r1 = r8
            java.util.List r8 = java.util.Collections.emptyList()
            r2 = r9
            r9 = r7
            r7 = r6
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r6 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor
            r4 = 1
            r3 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r11 = r12
            r10 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
    }

    public static <ContainingType extends com.google.crypto.tink.shaded.protobuf.MessageLite, Type> com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType r6, Type r7, com.google.crypto.tink.shaded.protobuf.MessageLite r8, com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<?> r9, int r10, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r11, java.lang.Class r12) {
            r1 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension r6 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$GeneratedExtension
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor
            r4 = 0
            r5 = 0
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r11 = r12
            r10 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T r1, java.io.InputStream r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parsePartialDelimitedFrom(r1, r2, r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = checkMessageInitialized(r0)
            return r0
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T r1, java.io.InputStream r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parsePartialDelimitedFrom(r1, r2, r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = checkMessageInitialized(r0)
            return r0
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r1, com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseFrom(r1, r2, r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = checkMessageInitialized(r0)
            return r0
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r1, com.google.crypto.tink.shaded.protobuf.ByteString r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parsePartialFrom(r1, r2, r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = checkMessageInitialized(r0)
            return r0
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r1, com.google.crypto.tink.shaded.protobuf.CodedInputStream r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseFrom(r1, r2, r0)
            return r0
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r1, com.google.crypto.tink.shaded.protobuf.CodedInputStream r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parsePartialFrom(r1, r2, r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = checkMessageInitialized(r0)
            return r0
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r2, java.io.InputStream r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r3)
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parsePartialFrom(r2, r0, r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = checkMessageInitialized(r0)
            return r0
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r1, java.io.InputStream r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parsePartialFrom(r1, r0, r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = checkMessageInitialized(r0)
            return r0
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r1, java.nio.ByteBuffer r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseFrom(r1, r2, r0)
            return r0
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r1, java.nio.ByteBuffer r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parseFrom(r1, r0, r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = checkMessageInitialized(r0)
            return r0
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r3, byte[] r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            int r0 = r4.length
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            r2 = 0
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parsePartialFrom(r3, r4, r2, r0, r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = checkMessageInitialized(r0)
            return r0
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r2, byte[] r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            int r0 = r3.length
            r1 = 0
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parsePartialFrom(r2, r3, r1, r0, r4)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = checkMessageInitialized(r0)
            return r0
    }

    private static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T r6, java.io.InputStream r7, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r8) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            int r0 = r7.read()     // Catch: java.io.IOException -> L27 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2e
            r1 = -1
            if (r0 != r1) goto L9
            r1 = 0
            return r1
        L9:
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.readRawVarint32(r0, r7)     // Catch: java.io.IOException -> L27 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2e
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder$LimitedInputStream r0 = new com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder$LimitedInputStream
            r0.<init>(r7, r1)
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r2 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = parsePartialFrom(r6, r2, r8)
            r4 = 0
            r2.checkLastTagWas(r4)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L21
            return r3
        L21:
            r4 = move-exception
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = r4.setUnfinishedMessage(r3)
            throw r5
        L27:
            r0 = move-exception
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            r1.<init>(r0)
            throw r1
        L2e:
            r0 = move-exception
            boolean r1 = r0.getThrownFromInputStream()
            if (r1 == 0) goto L3b
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            r1.<init>(r0)
            r0 = r1
        L3b:
            throw r0
    }

    private static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T r4, com.google.crypto.tink.shaded.protobuf.ByteString r5, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r6) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.newCodedInput()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = parsePartialFrom(r4, r0, r6)
            r2 = 0
            r0.checkLastTagWas(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Le
            return r1
        Le:
            r2 = move-exception
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = r2.setUnfinishedMessage(r1)
            throw r3
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T r1, com.google.crypto.tink.shaded.protobuf.CodedInputStream r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = parsePartialFrom(r1, r2, r0)
            return r0
    }

    static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T r3, com.google.crypto.tink.shaded.protobuf.CodedInputStream r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r3.newMutableInstance()
            com.google.crypto.tink.shaded.protobuf.Protobuf r1 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()     // Catch: java.lang.RuntimeException -> L18 java.io.IOException -> L29 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L43 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4d
            com.google.crypto.tink.shaded.protobuf.Schema r1 = r1.schemaFor(r0)     // Catch: java.lang.RuntimeException -> L18 java.io.IOException -> L29 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L43 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4d
            com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader r2 = com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.forCodedInput(r4)     // Catch: java.lang.RuntimeException -> L18 java.io.IOException -> L29 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L43 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4d
            r1.mergeFrom(r0, r2, r5)     // Catch: java.lang.RuntimeException -> L18 java.io.IOException -> L29 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L43 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4d
            r1.makeImmutable(r0)     // Catch: java.lang.RuntimeException -> L18 java.io.IOException -> L29 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L43 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L4d
            return r0
        L18:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getCause()
            boolean r2 = r2 instanceof com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            if (r2 == 0) goto L28
            java.lang.Throwable r2 = r1.getCause()
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException) r2
            throw r2
        L28:
            throw r1
        L29:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getCause()
            boolean r2 = r2 instanceof com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            if (r2 == 0) goto L39
            java.lang.Throwable r2 = r1.getCause()
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException) r2
            throw r2
        L39:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            r2.<init>(r1)
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = r2.setUnfinishedMessage(r0)
            throw r2
        L43:
            r1 = move-exception
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = r1.asInvalidProtocolBufferException()
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = r2.setUnfinishedMessage(r0)
            throw r2
        L4d:
            r1 = move-exception
            boolean r2 = r1.getThrownFromInputStream()
            if (r2 == 0) goto L5a
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            r2.<init>(r1)
            r1 = r2
        L5a:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = r1.setUnfinishedMessage(r0)
            throw r2
    }

    private static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T r6, byte[] r7, int r8, int r9, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r10) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r6.newMutableInstance()
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()     // Catch: java.lang.IndexOutOfBoundsException -> L29 java.io.IOException -> L36 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L53 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L60
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L29 java.io.IOException -> L36 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L53 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L60
            int r4 = r8 + r9
            com.google.crypto.tink.shaded.protobuf.ArrayDecoders$Registers r5 = new com.google.crypto.tink.shaded.protobuf.ArrayDecoders$Registers     // Catch: java.lang.IndexOutOfBoundsException -> L29 java.io.IOException -> L36 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L53 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L60
            r5.<init>(r10)     // Catch: java.lang.IndexOutOfBoundsException -> L29 java.io.IOException -> L36 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L53 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L60
            r2 = r7
            r3 = r8
            r0.mergeFrom(r1, r2, r3, r4, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L1d java.io.IOException -> L20 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L23 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L26
            r0.makeImmutable(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L1d java.io.IOException -> L20 com.google.crypto.tink.shaded.protobuf.UninitializedMessageException -> L23 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L26
            return r1
        L1d:
            r0 = move-exception
            r7 = r0
            goto L2d
        L20:
            r0 = move-exception
            r7 = r0
            goto L3a
        L23:
            r0 = move-exception
            r7 = r0
            goto L57
        L26:
            r0 = move-exception
            r7 = r0
            goto L64
        L29:
            r0 = move-exception
            r2 = r7
            r3 = r8
            r7 = r0
        L2d:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = r8.setUnfinishedMessage(r1)
            throw r8
        L36:
            r0 = move-exception
            r2 = r7
            r3 = r8
            r7 = r0
        L3a:
            java.lang.Throwable r8 = r7.getCause()
            boolean r8 = r8 instanceof com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            if (r8 == 0) goto L49
            java.lang.Throwable r8 = r7.getCause()
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException) r8
            throw r8
        L49:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            r8.<init>(r7)
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = r8.setUnfinishedMessage(r1)
            throw r8
        L53:
            r0 = move-exception
            r2 = r7
            r3 = r8
            r7 = r0
        L57:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = r7.asInvalidProtocolBufferException()
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = r8.setUnfinishedMessage(r1)
            throw r8
        L60:
            r0 = move-exception
            r2 = r7
            r3 = r8
            r7 = r0
        L64:
            boolean r8 = r7.getThrownFromInputStream()
            if (r8 == 0) goto L70
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            r8.<init>(r7)
            r7 = r8
        L70:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = r7.setUnfinishedMessage(r1)
            throw r8
    }

    protected static <T extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<?, ?>> void registerDefaultInstance(java.lang.Class<T> r1, T r2) {
            r2.markImmutable()
            java.util.Map<java.lang.Object, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<?, ?>> r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.defaultInstanceMap
            r0.put(r1, r2)
            return
    }

    java.lang.Object buildMessageInfo() throws java.lang.Exception {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO
            java.lang.Object r0 = r1.dynamicMethod(r0)
            return r0
    }

    void clearMemoizedHashCode() {
            r1 = this;
            r0 = 0
            r1.memoizedHashCode = r0
            return
    }

    void clearMemoizedSerializedSize() {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.setMemoizedSerializedSize(r0)
            return
    }

    int computeHashCode() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r1)
            int r0 = r0.hashCode(r1)
            return r0
    }

    protected final <MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> BuilderType createBuilder() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER
            java.lang.Object r0 = r1.dynamicMethod(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder) r0
            return r0
    }

    protected final <MessageType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> BuilderType createBuilder(MessageType r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r1.createBuilder()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r0.mergeFrom(r2)
            return r0
    }

    protected java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r0 = r1.dynamicMethod(r2, r0, r0)
            return r0
    }

    protected java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r2, java.lang.Object r3) {
            r1 = this;
            r0 = 0
            java.lang.Object r0 = r1.dynamicMethod(r2, r3, r0)
            return r0
    }

    protected abstract java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke r1, java.lang.Object r2, java.lang.Object r3);

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r0 = 1
            return r0
        L4:
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L13
            return r0
        L13:
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r3)
            r1 = r4
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r1
            boolean r0 = r0.equals(r3, r1)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public final MessageType getDefaultInstanceForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE
            java.lang.Object r0 = r1.dynamicMethod(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite getDefaultInstanceForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r1.getDefaultInstanceForType()
            return r0
    }

    int getMemoizedHashCode() {
            r1 = this;
            int r0 = r1.memoizedHashCode
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite
    int getMemoizedSerializedSize() {
            r2 = this;
            int r0 = r2.memoizedSerializedSize
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public final com.google.crypto.tink.shaded.protobuf.Parser<MessageType> getParserForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER
            java.lang.Object r0 = r1.dynamicMethod(r0)
            com.google.crypto.tink.shaded.protobuf.Parser r0 = (com.google.crypto.tink.shaded.protobuf.Parser) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public int getSerializedSize() {
            r1 = this;
            r0 = 0
            int r0 = r1.getSerializedSize(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite
    int getSerializedSize(com.google.crypto.tink.shaded.protobuf.Schema r5) {
            r4 = this;
            boolean r0 = r4.isMutable()
            if (r0 == 0) goto L26
            int r0 = r4.computeSerializedSize(r5)
            if (r0 < 0) goto Ld
            return r0
        Ld:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "serialized size must be non-negative, was "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L26:
            int r0 = r4.getMemoizedSerializedSize()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L34
            int r0 = r4.getMemoizedSerializedSize()
            return r0
        L34:
            int r0 = r4.computeSerializedSize(r5)
            r4.setMemoizedSerializedSize(r0)
            return r0
    }

    public int hashCode() {
            r1 = this;
            boolean r0 = r1.isMutable()
            if (r0 == 0) goto Lb
            int r0 = r1.computeHashCode()
            return r0
        Lb:
            boolean r0 = r1.hashCodeIsNotMemoized()
            if (r0 == 0) goto L18
            int r0 = r1.computeHashCode()
            r1.setMemoizedHashCode(r0)
        L18:
            int r0 = r1.getMemoizedHashCode()
            return r0
    }

    boolean hashCodeIsNotMemoized() {
            r1 = this;
            int r0 = r1.getMemoizedHashCode()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
            r1 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.booleanValue()
            boolean r0 = isInitialized(r1, r0)
            return r0
    }

    boolean isMutable() {
            r2 = this;
            int r0 = r2.memoizedSerializedSize
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    protected void makeImmutable() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r1)
            r0.makeImmutable(r1)
            r1.markImmutable()
            return
    }

    void markImmutable() {
            r2 = this;
            int r0 = r2.memoizedSerializedSize
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            r2.memoizedSerializedSize = r0
            return
    }

    protected void mergeLengthDelimitedField(int r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) {
            r1 = this;
            r1.ensureUnknownFieldsInitialized()
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = r1.unknownFields
            r0.mergeLengthDelimitedField(r2, r3)
            return
    }

    protected final void mergeUnknownFields(com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = r1.unknownFields
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.mutableCopyOf(r0, r2)
            r1.unknownFields = r0
            return
    }

    protected void mergeVarintField(int r2, int r3) {
            r1 = this;
            r1.ensureUnknownFieldsInitialized()
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = r1.unknownFields
            r0.mergeVarintField(r2, r3)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public final BuilderType newBuilderForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER
            java.lang.Object r0 = r1.dynamicMethod(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder newBuilderForType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r1.newBuilderForType()
            return r0
    }

    MessageType newMutableInstance() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE
            java.lang.Object r0 = r1.dynamicMethod(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            return r0
    }

    protected boolean parseUnknownField(int r3, com.google.crypto.tink.shaded.protobuf.CodedInputStream r4) throws java.io.IOException {
            r2 = this;
            int r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(r3)
            r1 = 4
            if (r0 != r1) goto L9
            r0 = 0
            return r0
        L9:
            r2.ensureUnknownFieldsInitialized()
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = r2.unknownFields
            boolean r0 = r0.mergeFieldFrom(r3, r4)
            return r0
    }

    void setMemoizedHashCode(int r1) {
            r0 = this;
            r0.memoizedHashCode = r1
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite
    void setMemoizedSerializedSize(int r4) {
            r3 = this;
            if (r4 < 0) goto Lf
            int r0 = r3.memoizedSerializedSize
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r4
            r0 = r0 | r1
            r3.memoizedSerializedSize = r0
            return
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "serialized size must be non-negative, was "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public final BuilderType toBuilder() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER
            java.lang.Object r0 = r2.dynamicMethod(r0)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder) r0
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r0.mergeFrom(r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite.Builder toBuilder() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r0 = r1.toBuilder()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            java.lang.String r0 = com.google.crypto.tink.shaded.protobuf.MessageLiteToString.toString(r1, r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public void writeTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3) throws java.io.IOException {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r2)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter r1 = com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter.forCodedOutput(r3)
            r0.writeTo(r2, r1)
            return
    }
}
