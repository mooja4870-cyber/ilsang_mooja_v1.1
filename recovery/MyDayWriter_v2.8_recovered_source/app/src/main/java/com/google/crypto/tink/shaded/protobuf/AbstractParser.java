package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.MessageLite;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractParser<MessageType extends com.google.crypto.tink.shaded.protobuf.MessageLite> implements com.google.crypto.tink.shaded.protobuf.Parser<MessageType> {
    private static final com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite EMPTY_REGISTRY = null;

    static {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY = r0
            return
    }

    public AbstractParser() {
            r0 = this;
            r0.<init>()
            return
    }

    private MessageType checkMessageInitialized(MessageType r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            if (r2 == 0) goto L16
            boolean r0 = r2.isInitialized()
            if (r0 == 0) goto L9
            goto L16
        L9:
            com.google.crypto.tink.shaded.protobuf.UninitializedMessageException r0 = r1.newUninitializedMessageException(r2)
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = r0.asInvalidProtocolBufferException()
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = r0.setUnfinishedMessage(r2)
            throw r0
        L16:
            return r2
    }

    private com.google.crypto.tink.shaded.protobuf.UninitializedMessageException newUninitializedMessageException(MessageType r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.crypto.tink.shaded.protobuf.AbstractMessageLite
            if (r0 == 0) goto Lc
            r0 = r2
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.AbstractMessageLite) r0
            com.google.crypto.tink.shaded.protobuf.UninitializedMessageException r0 = r0.newUninitializedMessageException()
            return r0
        Lc:
            com.google.crypto.tink.shaded.protobuf.UninitializedMessageException r0 = new com.google.crypto.tink.shaded.protobuf.UninitializedMessageException
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.parseDelimitedFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseDelimitedFrom(java.io.InputStream r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.parsePartialDelimitedFrom(r2, r3)
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.checkMessageInitialized(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseDelimitedFrom(java.io.InputStream r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseDelimitedFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseDelimitedFrom(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.parsePartialFrom(r2, r3)
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.checkMessageInitialized(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            java.lang.Object r0 = r1.parsePartialFrom(r2, r3)
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.checkMessageInitialized(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(java.io.InputStream r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.parsePartialFrom(r2, r3)
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.checkMessageInitialized(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(java.nio.ByteBuffer r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(java.nio.ByteBuffer r5, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r6) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r4 = this;
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L1b
            java.lang.Object r1 = r4.parsePartialFrom(r0, r6)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L1b
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L1b
            r2 = 0
            r0.checkLastTagWas(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L15
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r4.checkMessageInitialized(r1)
            return r0
        L15:
            r2 = move-exception
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = r2.setUnfinishedMessage(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L1b
            throw r3     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L1b
        L1b:
            r0 = move-exception
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(byte[] r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(byte[] r2, int r3, int r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.parseFrom(r2, r3, r4, r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(byte[] r2, int r3, int r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.parsePartialFrom(r2, r3, r4, r5)
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.checkMessageInitialized(r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parseFrom(byte[] r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r2.parseFrom(r3, r0, r1, r4)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(java.io.InputStream r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(java.nio.ByteBuffer r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(java.nio.ByteBuffer r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(byte[] r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1, r2, r3)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1, r2, r3, r4)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parseFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parseFrom(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(java.io.InputStream r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.parsePartialDelimitedFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialDelimitedFrom(java.io.InputStream r4, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r5) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r3 = this;
            int r0 = r4.read()     // Catch: java.io.IOException -> L18
            r1 = -1
            if (r0 != r1) goto L9
            r1 = 0
            return r1
        L9:
            int r1 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.readRawVarint32(r0, r4)     // Catch: java.io.IOException -> L18
            com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder$LimitedInputStream r0 = new com.google.crypto.tink.shaded.protobuf.AbstractMessageLite$Builder$LimitedInputStream
            r0.<init>(r4, r1)
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r3.parsePartialFrom(r0, r5)
            return r2
        L18:
            r0 = move-exception
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException
            r1.<init>(r0)
            throw r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialDelimitedFrom(java.io.InputStream r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialDelimitedFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialDelimitedFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialDelimitedFrom(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.parsePartialFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(com.google.crypto.tink.shaded.protobuf.ByteString r5, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r6) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r4 = this;
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = r5.newCodedInput()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L16
            java.lang.Object r1 = r4.parsePartialFrom(r0, r6)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L16
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L16
            r2 = 0
            r0.checkLastTagWas(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L10
            return r1
        L10:
            r2 = move-exception
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = r2.setUnfinishedMessage(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L16
            throw r3     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L16
        L16:
            r0 = move-exception
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            java.lang.Object r0 = r1.parsePartialFrom(r2, r0)
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(java.io.InputStream r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.parsePartialFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(java.io.InputStream r5, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r6) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r4 = this;
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r5)
            java.lang.Object r1 = r4.parsePartialFrom(r0, r6)
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1
            r2 = 0
            r0.checkLastTagWas(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L10
            return r1
        L10:
            r2 = move-exception
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = r2.setUnfinishedMessage(r1)
            throw r3
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(byte[] r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r3 = this;
            int r0 = r4.length
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            r2 = 0
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r3.parsePartialFrom(r4, r2, r0, r1)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(byte[] r2, int r3, int r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.AbstractParser.EMPTY_REGISTRY
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.parsePartialFrom(r2, r3, r4, r0)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(byte[] r5, int r6, int r7, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r8) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r4 = this;
            com.google.crypto.tink.shaded.protobuf.CodedInputStream r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.newInstance(r5, r6, r7)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L16
            java.lang.Object r1 = r4.parsePartialFrom(r0, r8)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L16
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r1     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L16
            r2 = 0
            r0.checkLastTagWas(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L10
            return r1
        L10:
            r2 = move-exception
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = r2.setUnfinishedMessage(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L16
            throw r3     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L16
        L16:
            r0 = move-exception
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public MessageType parsePartialFrom(byte[] r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r2.parsePartialFrom(r3, r0, r1, r4)
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(com.google.crypto.tink.shaded.protobuf.ByteString r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(java.io.InputStream r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(java.io.InputStream r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(byte[] r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(byte[] r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1, r2, r3)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(byte[] r1, int r2, int r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1, r2, r3, r4)
            return r1
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Parser
    public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(byte[] r1, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.parsePartialFrom(r1, r2)
            return r1
    }
}
