package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class LazyFieldLite {
    private static final com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite EMPTY_REGISTRY = null;
    private com.google.crypto.tink.shaded.protobuf.ByteString delayedBytes;
    private com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistry;
    private volatile com.google.crypto.tink.shaded.protobuf.ByteString memoizedBytes;
    protected volatile com.google.crypto.tink.shaded.protobuf.MessageLite value;

    static {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.shaded.protobuf.LazyFieldLite.EMPTY_REGISTRY = r0
            return
    }

    public LazyFieldLite() {
            r0 = this;
            r0.<init>()
            return
    }

    public LazyFieldLite(com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1, com.google.crypto.tink.shaded.protobuf.ByteString r2) {
            r0 = this;
            r0.<init>()
            checkArguments(r1, r2)
            r0.extensionRegistry = r1
            r0.delayedBytes = r2
            return
    }

    private static void checkArguments(com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2, com.google.crypto.tink.shaded.protobuf.ByteString r3) {
            if (r2 == 0) goto Ld
            if (r3 == 0) goto L5
            return
        L5:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "found null ByteString"
            r0.<init>(r1)
            throw r0
        Ld:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "found null ExtensionRegistry"
            r0.<init>(r1)
            throw r0
    }

    public static com.google.crypto.tink.shaded.protobuf.LazyFieldLite fromValue(com.google.crypto.tink.shaded.protobuf.MessageLite r1) {
            com.google.crypto.tink.shaded.protobuf.LazyFieldLite r0 = new com.google.crypto.tink.shaded.protobuf.LazyFieldLite
            r0.<init>()
            r0.setValue(r1)
            return r0
    }

    private static com.google.crypto.tink.shaded.protobuf.MessageLite mergeValueAndBytes(com.google.crypto.tink.shaded.protobuf.MessageLite r1, com.google.crypto.tink.shaded.protobuf.ByteString r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) {
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r1.toBuilder()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Ld
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r0.mergeFrom(r2, r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Ld
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r0.build()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Ld
            return r0
        Ld:
            r0 = move-exception
            return r1
    }

    public void clear() {
            r1 = this;
            r0 = 0
            r1.delayedBytes = r0
            r1.value = r0
            r1.memoizedBytes = r0
            return
    }

    public boolean containsDefaultInstance() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.memoizedBytes
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            if (r0 == r1) goto L17
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r2.value
            if (r0 != 0) goto L15
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.delayedBytes
            if (r0 == 0) goto L17
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.delayedBytes
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            if (r0 != r1) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            return r0
    }

    protected void ensureInitialized(com.google.crypto.tink.shaded.protobuf.MessageLite r4) {
            r3 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r3.value
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r3)
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r3.value     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto Lc
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            return
        Lc:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.delayedBytes     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d java.lang.Throwable -> L36
            if (r0 == 0) goto L26
        L11:
            com.google.crypto.tink.shaded.protobuf.Parser r0 = r4.getParserForType()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d java.lang.Throwable -> L36
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r3.delayedBytes     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d java.lang.Throwable -> L36
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2 = r3.extensionRegistry     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d java.lang.Throwable -> L36
            java.lang.Object r0 = r0.parseFrom(r1, r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d java.lang.Throwable -> L36
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d java.lang.Throwable -> L36
            r3.value = r0     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d java.lang.Throwable -> L36
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r3.delayedBytes     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d java.lang.Throwable -> L36
            r3.memoizedBytes = r1     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d java.lang.Throwable -> L36
            goto L2c
        L26:
            r3.value = r4     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d java.lang.Throwable -> L36
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d java.lang.Throwable -> L36
            r3.memoizedBytes = r0     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d java.lang.Throwable -> L36
        L2c:
            goto L34
        L2d:
            r0 = move-exception
            r3.value = r4     // Catch: java.lang.Throwable -> L36
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY     // Catch: java.lang.Throwable -> L36
            r3.memoizedBytes = r1     // Catch: java.lang.Throwable -> L36
        L34:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            return
        L36:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            throw r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            if (r5 != r6) goto L4
            r0 = 1
            return r0
        L4:
            boolean r0 = r6 instanceof com.google.crypto.tink.shaded.protobuf.LazyFieldLite
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            r0 = r6
            com.google.crypto.tink.shaded.protobuf.LazyFieldLite r0 = (com.google.crypto.tink.shaded.protobuf.LazyFieldLite) r0
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r5.value
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r0.value
            if (r1 != 0) goto L22
            if (r2 != 0) goto L22
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r5.toByteString()
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r0.toByteString()
            boolean r3 = r3.equals(r4)
            return r3
        L22:
            if (r1 == 0) goto L2b
            if (r2 == 0) goto L2b
            boolean r3 = r1.equals(r2)
            return r3
        L2b:
            if (r1 == 0) goto L3a
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r1.getDefaultInstanceForType()
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r0.getValue(r3)
            boolean r3 = r1.equals(r3)
            return r3
        L3a:
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r2.getDefaultInstanceForType()
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = r5.getValue(r3)
            boolean r3 = r3.equals(r2)
            return r3
    }

    public int getSerializedSize() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.memoizedBytes
            if (r0 == 0) goto Lb
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.memoizedBytes
            int r0 = r0.size()
            return r0
        Lb:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.delayedBytes
            if (r0 == 0) goto L16
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.delayedBytes
            int r0 = r0.size()
            return r0
        L16:
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.value
            if (r0 == 0) goto L21
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.value
            int r0 = r0.getSerializedSize()
            return r0
        L21:
            r0 = 0
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.MessageLite getValue(com.google.crypto.tink.shaded.protobuf.MessageLite r2) {
            r1 = this;
            r1.ensureInitialized(r2)
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.value
            return r0
    }

    public int hashCode() {
            r1 = this;
            r0 = 1
            return r0
    }

    public void merge(com.google.crypto.tink.shaded.protobuf.LazyFieldLite r4) {
            r3 = this;
            boolean r0 = r4.containsDefaultInstance()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r3.containsDefaultInstance()
            if (r0 == 0) goto L11
            r3.set(r4)
            return
        L11:
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = r3.extensionRegistry
            if (r0 != 0) goto L19
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = r4.extensionRegistry
            r3.extensionRegistry = r0
        L19:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.delayedBytes
            if (r0 == 0) goto L2c
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r4.delayedBytes
            if (r0 == 0) goto L2c
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.delayedBytes
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r4.delayedBytes
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.concat(r1)
            r3.delayedBytes = r0
            return
        L2c:
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r3.value
            if (r0 != 0) goto L42
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r4.value
            if (r0 == 0) goto L42
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r4.value
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r3.delayedBytes
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2 = r3.extensionRegistry
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = mergeValueAndBytes(r0, r1, r2)
            r3.setValue(r0)
            return
        L42:
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r3.value
            if (r0 == 0) goto L58
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r4.value
            if (r0 != 0) goto L58
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r3.value
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r4.delayedBytes
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2 = r4.extensionRegistry
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = mergeValueAndBytes(r0, r1, r2)
            r3.setValue(r0)
            return
        L58:
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r3.value
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r0.toBuilder()
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r4.value
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r0.mergeFrom(r1)
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r0.build()
            r3.setValue(r0)
            return
    }

    public void mergeFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream r3, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.containsDefaultInstance()
            if (r0 == 0) goto Le
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.readBytes()
            r2.setByteString(r0, r4)
            return
        Le:
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = r2.extensionRegistry
            if (r0 != 0) goto L14
            r2.extensionRegistry = r4
        L14:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.delayedBytes
            if (r0 == 0) goto L28
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.delayedBytes
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r3.readBytes()
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.concat(r1)
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = r2.extensionRegistry
            r2.setByteString(r0, r1)
            return
        L28:
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r2.value     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3a
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r0.toBuilder()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3a
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = r0.mergeFrom(r3, r4)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3a
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r0.build()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3a
            r2.setValue(r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3a
            goto L3b
        L3a:
            r0 = move-exception
        L3b:
            return
    }

    public void set(com.google.crypto.tink.shaded.protobuf.LazyFieldLite r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.delayedBytes
            r1.delayedBytes = r0
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r2.value
            r1.value = r0
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r2.memoizedBytes
            r1.memoizedBytes = r0
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = r2.extensionRegistry
            if (r0 == 0) goto L14
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = r2.extensionRegistry
            r1.extensionRegistry = r0
        L14:
            return
    }

    public void setByteString(com.google.crypto.tink.shaded.protobuf.ByteString r2, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r3) {
            r1 = this;
            checkArguments(r3, r2)
            r1.delayedBytes = r2
            r1.extensionRegistry = r3
            r0 = 0
            r1.value = r0
            r1.memoizedBytes = r0
            return
    }

    public com.google.crypto.tink.shaded.protobuf.MessageLite setValue(com.google.crypto.tink.shaded.protobuf.MessageLite r3) {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r2.value
            r1 = 0
            r2.delayedBytes = r1
            r2.memoizedBytes = r1
            r2.value = r3
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.ByteString toByteString() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.memoizedBytes
            if (r0 == 0) goto L7
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.memoizedBytes
            return r0
        L7:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.delayedBytes
            if (r0 == 0) goto Le
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.delayedBytes
            return r0
        Le:
            monitor-enter(r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.memoizedBytes     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L17
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.memoizedBytes     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
            return r0
        L17:
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.value     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L20
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY     // Catch: java.lang.Throwable -> L2c
            r1.memoizedBytes = r0     // Catch: java.lang.Throwable -> L2c
            goto L28
        L20:
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.value     // Catch: java.lang.Throwable -> L2c
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r0.toByteString()     // Catch: java.lang.Throwable -> L2c
            r1.memoizedBytes = r0     // Catch: java.lang.Throwable -> L2c
        L28:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.memoizedBytes     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
            return r0
        L2c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2c
            throw r0
    }

    void writeTo(com.google.crypto.tink.shaded.protobuf.Writer r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.memoizedBytes
            if (r0 == 0) goto La
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.memoizedBytes
            r2.writeBytes(r3, r0)
            goto L23
        La:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.delayedBytes
            if (r0 == 0) goto L14
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r1.delayedBytes
            r2.writeBytes(r3, r0)
            goto L23
        L14:
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.value
            if (r0 == 0) goto L1e
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.value
            r2.writeMessage(r3, r0)
            goto L23
        L1e:
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            r2.writeBytes(r3, r0)
        L23:
            return
    }
}
