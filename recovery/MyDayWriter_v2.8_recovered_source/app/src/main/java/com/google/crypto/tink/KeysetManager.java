package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public final class KeysetManager {
    private final com.google.crypto.tink.proto.Keyset.Builder keysetBuilder;

    private KeysetManager(com.google.crypto.tink.proto.Keyset.Builder r1) {
            r0 = this;
            r0.<init>()
            r0.keysetBuilder = r1
            return
    }

    private synchronized com.google.crypto.tink.proto.Keyset.Key createKeysetKey(com.google.crypto.tink.proto.KeyData r4, com.google.crypto.tink.proto.OutputPrefixType r5) throws java.security.GeneralSecurityException {
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.newKeyId()     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.UNKNOWN_PREFIX     // Catch: java.lang.Throwable -> L2f
            if (r5 == r1) goto L27
            com.google.crypto.tink.proto.Keyset$Key$Builder r1 = com.google.crypto.tink.proto.Keyset.Key.newBuilder()     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.Keyset$Key$Builder r1 = r1.setKeyData(r4)     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.Keyset$Key$Builder r1 = r1.setKeyId(r0)     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.KeyStatusType r2 = com.google.crypto.tink.proto.KeyStatusType.ENABLED     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.Keyset$Key$Builder r1 = r1.setStatus(r2)     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.Keyset$Key$Builder r1 = r1.setOutputPrefixType(r5)     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()     // Catch: java.lang.Throwable -> L2f
            com.google.crypto.tink.proto.Keyset$Key r1 = (com.google.crypto.tink.proto.Keyset.Key) r1     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r3)
            return r1
        L27:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "unknown output prefix type"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            throw r1     // Catch: java.lang.Throwable -> L2f
        L2f:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            throw r4
    }

    private synchronized boolean keyIdExists(int r4) {
            r3 = this;
            monitor-enter(r3)
            com.google.crypto.tink.proto.Keyset$Builder r0 = r3.keysetBuilder     // Catch: java.lang.Throwable -> L24
            java.util.List r0 = r0.getKeyList()     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L24
        Lb:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L24
            com.google.crypto.tink.proto.Keyset$Key r1 = (com.google.crypto.tink.proto.Keyset.Key) r1     // Catch: java.lang.Throwable -> L24
            int r2 = r1.getKeyId()     // Catch: java.lang.Throwable -> L24
            if (r2 != r4) goto L20
            monitor-exit(r3)
            r0 = 1
            return r0
        L20:
            goto Lb
        L21:
            monitor-exit(r3)
            r0 = 0
            return r0
        L24:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r4
    }

    private synchronized com.google.crypto.tink.proto.Keyset.Key newKey(com.google.crypto.tink.proto.KeyTemplate r3) throws java.security.GeneralSecurityException {
            r2 = this;
            monitor-enter(r2)
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.Registry.newKeyData(r3)     // Catch: java.lang.Throwable -> Lf
            com.google.crypto.tink.proto.OutputPrefixType r1 = r3.getOutputPrefixType()     // Catch: java.lang.Throwable -> Lf
            com.google.crypto.tink.proto.Keyset$Key r0 = r2.createKeysetKey(r0, r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r0
        Lf:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    private synchronized int newKeyId() {
            r2 = this;
            monitor-enter(r2)
            int r0 = com.google.crypto.tink.internal.Util.randKeyId()     // Catch: java.lang.Throwable -> L13
        L5:
            boolean r1 = r2.keyIdExists(r0)     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L11
            int r1 = com.google.crypto.tink.internal.Util.randKeyId()     // Catch: java.lang.Throwable -> L13
            r0 = r1
            goto L5
        L11:
            monitor-exit(r2)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r0
    }

    public static com.google.crypto.tink.KeysetManager withEmptyKeyset() {
            com.google.crypto.tink.KeysetManager r0 = new com.google.crypto.tink.KeysetManager
            com.google.crypto.tink.proto.Keyset$Builder r1 = com.google.crypto.tink.proto.Keyset.newBuilder()
            r0.<init>(r1)
            return r0
    }

    public static com.google.crypto.tink.KeysetManager withKeysetHandle(com.google.crypto.tink.KeysetHandle r2) {
            com.google.crypto.tink.KeysetManager r0 = new com.google.crypto.tink.KeysetManager
            com.google.crypto.tink.proto.Keyset r1 = r2.getKeyset()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r1 = r1.toBuilder()
            com.google.crypto.tink.proto.Keyset$Builder r1 = (com.google.crypto.tink.proto.Keyset.Builder) r1
            r0.<init>(r1)
            return r0
    }

    public synchronized com.google.crypto.tink.KeysetManager add(com.google.crypto.tink.KeyTemplate r3) throws java.security.GeneralSecurityException {
            r2 = this;
            monitor-enter(r2)
            com.google.crypto.tink.proto.KeyTemplate r0 = r3.getProto()     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            r2.addNewKey(r0, r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return r2
        Lb:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r3
    }

    @java.lang.Deprecated
    public synchronized com.google.crypto.tink.KeysetManager add(com.google.crypto.tink.proto.KeyTemplate r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.addNewKey(r2, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return r1
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    public synchronized com.google.crypto.tink.KeysetManager add(com.google.crypto.tink.tinkkey.KeyHandle r5) throws java.security.GeneralSecurityException {
            r4 = this;
            monitor-enter(r4)
            com.google.crypto.tink.tinkkey.KeyAccess r0 = com.google.crypto.tink.tinkkey.SecretKeyAccess.insecureSecretAccess()     // Catch: java.lang.Throwable -> L57 java.lang.ClassCastException -> L59
            com.google.crypto.tink.tinkkey.TinkKey r0 = r5.getKey(r0)     // Catch: java.lang.Throwable -> L57 java.lang.ClassCastException -> L59
            com.google.crypto.tink.tinkkey.internal.ProtoKey r0 = (com.google.crypto.tink.tinkkey.internal.ProtoKey) r0     // Catch: java.lang.Throwable -> L57 java.lang.ClassCastException -> L59
            int r1 = r5.getId()     // Catch: java.lang.Throwable -> L57
            boolean r1 = r4.keyIdExists(r1)     // Catch: java.lang.Throwable -> L57
            if (r1 != 0) goto L4f
            com.google.crypto.tink.proto.Keyset$Builder r1 = r4.keysetBuilder     // Catch: java.lang.Throwable -> L57
            com.google.crypto.tink.proto.Keyset$Key$Builder r2 = com.google.crypto.tink.proto.Keyset.Key.newBuilder()     // Catch: java.lang.Throwable -> L57
            com.google.crypto.tink.proto.KeyData r3 = r0.getProtoKey()     // Catch: java.lang.Throwable -> L57
            com.google.crypto.tink.proto.Keyset$Key$Builder r2 = r2.setKeyData(r3)     // Catch: java.lang.Throwable -> L57
            int r3 = r5.getId()     // Catch: java.lang.Throwable -> L57
            com.google.crypto.tink.proto.Keyset$Key$Builder r2 = r2.setKeyId(r3)     // Catch: java.lang.Throwable -> L57
            com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r3 = r5.getStatus()     // Catch: java.lang.Throwable -> L57
            com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.toProto(r3)     // Catch: java.lang.Throwable -> L57
            com.google.crypto.tink.proto.Keyset$Key$Builder r2 = r2.setStatus(r3)     // Catch: java.lang.Throwable -> L57
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = r0.getOutputPrefixType()     // Catch: java.lang.Throwable -> L57
            com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.KeyTemplate.toProto(r3)     // Catch: java.lang.Throwable -> L57
            com.google.crypto.tink.proto.Keyset$Key$Builder r2 = r2.setOutputPrefixType(r3)     // Catch: java.lang.Throwable -> L57
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()     // Catch: java.lang.Throwable -> L57
            com.google.crypto.tink.proto.Keyset$Key r2 = (com.google.crypto.tink.proto.Keyset.Key) r2     // Catch: java.lang.Throwable -> L57
            r1.addKey(r2)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r4)
            return r4
        L4f:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "Trying to add a key with an ID already contained in the keyset."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L57
            throw r1     // Catch: java.lang.Throwable -> L57
        L57:
            r5 = move-exception
            goto L62
        L59:
            r0 = move-exception
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "KeyHandles which contain TinkKeys that are not ProtoKeys are not yet supported."
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L57
            throw r1     // Catch: java.lang.Throwable -> L57
        L62:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L57
            throw r5
    }

    public synchronized com.google.crypto.tink.KeysetManager add(com.google.crypto.tink.tinkkey.KeyHandle r2, com.google.crypto.tink.tinkkey.KeyAccess r3) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.KeysetManager r0 = r1.add(r2)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return r0
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @java.lang.Deprecated
    public synchronized int addNewKey(com.google.crypto.tink.proto.KeyTemplate r4, boolean r5) throws java.security.GeneralSecurityException {
            r3 = this;
            monitor-enter(r3)
            com.google.crypto.tink.proto.Keyset$Key r0 = r3.newKey(r4)     // Catch: java.lang.Throwable -> L1b
            com.google.crypto.tink.proto.Keyset$Builder r1 = r3.keysetBuilder     // Catch: java.lang.Throwable -> L1b
            r1.addKey(r0)     // Catch: java.lang.Throwable -> L1b
            if (r5 == 0) goto L15
            com.google.crypto.tink.proto.Keyset$Builder r1 = r3.keysetBuilder     // Catch: java.lang.Throwable -> L1b
            int r2 = r0.getKeyId()     // Catch: java.lang.Throwable -> L1b
            r1.setPrimaryKeyId(r2)     // Catch: java.lang.Throwable -> L1b
        L15:
            int r1 = r0.getKeyId()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r3)
            return r1
        L1b:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            throw r4
    }

    public synchronized com.google.crypto.tink.KeysetManager delete(int r4) throws java.security.GeneralSecurityException {
            r3 = this;
            monitor-enter(r3)
            com.google.crypto.tink.proto.Keyset$Builder r0 = r3.keysetBuilder     // Catch: java.lang.Throwable -> L49
            int r0 = r0.getPrimaryKeyId()     // Catch: java.lang.Throwable -> L49
            if (r4 == r0) goto L41
            r0 = 0
        La:
            com.google.crypto.tink.proto.Keyset$Builder r1 = r3.keysetBuilder     // Catch: java.lang.Throwable -> L49
            int r1 = r1.getKeyCount()     // Catch: java.lang.Throwable -> L49
            if (r0 >= r1) goto L28
            com.google.crypto.tink.proto.Keyset$Builder r1 = r3.keysetBuilder     // Catch: java.lang.Throwable -> L49
            com.google.crypto.tink.proto.Keyset$Key r1 = r1.getKey(r0)     // Catch: java.lang.Throwable -> L49
            int r2 = r1.getKeyId()     // Catch: java.lang.Throwable -> L49
            if (r2 != r4) goto L25
            com.google.crypto.tink.proto.Keyset$Builder r2 = r3.keysetBuilder     // Catch: java.lang.Throwable -> L49
            r2.removeKey(r0)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r3)
            return r3
        L25:
            int r0 = r0 + 1
            goto La
        L28:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r1.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "key not found: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L49
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L49
            throw r0     // Catch: java.lang.Throwable -> L49
        L41:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L49
            java.lang.String r1 = "cannot delete the primary key"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L49
            throw r0     // Catch: java.lang.Throwable -> L49
        L49:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L49
            throw r4
    }

    public synchronized com.google.crypto.tink.KeysetManager destroy(int r6) throws java.security.GeneralSecurityException {
            r5 = this;
            monitor-enter(r5)
            com.google.crypto.tink.proto.Keyset$Builder r0 = r5.keysetBuilder     // Catch: java.lang.Throwable -> L91
            int r0 = r0.getPrimaryKeyId()     // Catch: java.lang.Throwable -> L91
            if (r6 == r0) goto L89
            r0 = 0
        La:
            com.google.crypto.tink.proto.Keyset$Builder r1 = r5.keysetBuilder     // Catch: java.lang.Throwable -> L91
            int r1 = r1.getKeyCount()     // Catch: java.lang.Throwable -> L91
            if (r0 >= r1) goto L70
            com.google.crypto.tink.proto.Keyset$Builder r1 = r5.keysetBuilder     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.proto.Keyset$Key r1 = r1.getKey(r0)     // Catch: java.lang.Throwable -> L91
            int r2 = r1.getKeyId()     // Catch: java.lang.Throwable -> L91
            if (r2 != r6) goto L6d
            com.google.crypto.tink.proto.KeyStatusType r2 = r1.getStatus()     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.proto.KeyStatusType.ENABLED     // Catch: java.lang.Throwable -> L91
            if (r2 == r3) goto L50
            com.google.crypto.tink.proto.KeyStatusType r2 = r1.getStatus()     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.proto.KeyStatusType.DISABLED     // Catch: java.lang.Throwable -> L91
            if (r2 == r3) goto L50
            com.google.crypto.tink.proto.KeyStatusType r2 = r1.getStatus()     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.proto.KeyStatusType.DESTROYED     // Catch: java.lang.Throwable -> L91
            if (r2 != r3) goto L37
            goto L50
        L37:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L91
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L91
            r3.<init>()     // Catch: java.lang.Throwable -> L91
            java.lang.String r4 = "cannot destroy key with id "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L91
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch: java.lang.Throwable -> L91
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L91
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L91
            throw r2     // Catch: java.lang.Throwable -> L91
        L50:
            com.google.crypto.tink.proto.Keyset$Builder r2 = r5.keysetBuilder     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r3 = r1.toBuilder()     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.proto.Keyset$Key$Builder r3 = (com.google.crypto.tink.proto.Keyset.Key.Builder) r3     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.proto.KeyStatusType r4 = com.google.crypto.tink.proto.KeyStatusType.DESTROYED     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.proto.Keyset$Key$Builder r3 = r3.setStatus(r4)     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.proto.Keyset$Key$Builder r3 = r3.clearKeyData()     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()     // Catch: java.lang.Throwable -> L91
            com.google.crypto.tink.proto.Keyset$Key r3 = (com.google.crypto.tink.proto.Keyset.Key) r3     // Catch: java.lang.Throwable -> L91
            r2.setKey(r0, r3)     // Catch: java.lang.Throwable -> L91
            monitor-exit(r5)
            return r5
        L6d:
            int r0 = r0 + 1
            goto La
        L70:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L91
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L91
            r1.<init>()     // Catch: java.lang.Throwable -> L91
            java.lang.String r2 = "key not found: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L91
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch: java.lang.Throwable -> L91
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L91
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L91
            throw r0     // Catch: java.lang.Throwable -> L91
        L89:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L91
            java.lang.String r1 = "cannot destroy the primary key"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L91
            throw r0     // Catch: java.lang.Throwable -> L91
        L91:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L91
            throw r6
    }

    public synchronized com.google.crypto.tink.KeysetManager disable(int r6) throws java.security.GeneralSecurityException {
            r5 = this;
            monitor-enter(r5)
            com.google.crypto.tink.proto.Keyset$Builder r0 = r5.keysetBuilder     // Catch: java.lang.Throwable -> L85
            int r0 = r0.getPrimaryKeyId()     // Catch: java.lang.Throwable -> L85
            if (r6 == r0) goto L7d
            r0 = 0
        La:
            com.google.crypto.tink.proto.Keyset$Builder r1 = r5.keysetBuilder     // Catch: java.lang.Throwable -> L85
            int r1 = r1.getKeyCount()     // Catch: java.lang.Throwable -> L85
            if (r0 >= r1) goto L64
            com.google.crypto.tink.proto.Keyset$Builder r1 = r5.keysetBuilder     // Catch: java.lang.Throwable -> L85
            com.google.crypto.tink.proto.Keyset$Key r1 = r1.getKey(r0)     // Catch: java.lang.Throwable -> L85
            int r2 = r1.getKeyId()     // Catch: java.lang.Throwable -> L85
            if (r2 != r6) goto L61
            com.google.crypto.tink.proto.KeyStatusType r2 = r1.getStatus()     // Catch: java.lang.Throwable -> L85
            com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.proto.KeyStatusType.ENABLED     // Catch: java.lang.Throwable -> L85
            if (r2 == r3) goto L48
            com.google.crypto.tink.proto.KeyStatusType r2 = r1.getStatus()     // Catch: java.lang.Throwable -> L85
            com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.proto.KeyStatusType.DISABLED     // Catch: java.lang.Throwable -> L85
            if (r2 != r3) goto L2f
            goto L48
        L2f:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r3.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r4 = "cannot disable key with id "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L85
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L85
            throw r2     // Catch: java.lang.Throwable -> L85
        L48:
            com.google.crypto.tink.proto.Keyset$Builder r2 = r5.keysetBuilder     // Catch: java.lang.Throwable -> L85
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r3 = r1.toBuilder()     // Catch: java.lang.Throwable -> L85
            com.google.crypto.tink.proto.Keyset$Key$Builder r3 = (com.google.crypto.tink.proto.Keyset.Key.Builder) r3     // Catch: java.lang.Throwable -> L85
            com.google.crypto.tink.proto.KeyStatusType r4 = com.google.crypto.tink.proto.KeyStatusType.DISABLED     // Catch: java.lang.Throwable -> L85
            com.google.crypto.tink.proto.Keyset$Key$Builder r3 = r3.setStatus(r4)     // Catch: java.lang.Throwable -> L85
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()     // Catch: java.lang.Throwable -> L85
            com.google.crypto.tink.proto.Keyset$Key r3 = (com.google.crypto.tink.proto.Keyset.Key) r3     // Catch: java.lang.Throwable -> L85
            r2.setKey(r0, r3)     // Catch: java.lang.Throwable -> L85
            monitor-exit(r5)
            return r5
        L61:
            int r0 = r0 + 1
            goto La
        L64:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r1.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = "key not found: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L85
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L85
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L85
            throw r0     // Catch: java.lang.Throwable -> L85
        L7d:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = "cannot disable the primary key"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L85
            throw r0     // Catch: java.lang.Throwable -> L85
        L85:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L85
            throw r6
    }

    public synchronized com.google.crypto.tink.KeysetManager enable(int r6) throws java.security.GeneralSecurityException {
            r5 = this;
            monitor-enter(r5)
            r0 = 0
        L2:
            com.google.crypto.tink.proto.Keyset$Builder r1 = r5.keysetBuilder     // Catch: java.lang.Throwable -> L75
            int r1 = r1.getKeyCount()     // Catch: java.lang.Throwable -> L75
            if (r0 >= r1) goto L5c
            com.google.crypto.tink.proto.Keyset$Builder r1 = r5.keysetBuilder     // Catch: java.lang.Throwable -> L75
            com.google.crypto.tink.proto.Keyset$Key r1 = r1.getKey(r0)     // Catch: java.lang.Throwable -> L75
            int r2 = r1.getKeyId()     // Catch: java.lang.Throwable -> L75
            if (r2 != r6) goto L59
            com.google.crypto.tink.proto.KeyStatusType r2 = r1.getStatus()     // Catch: java.lang.Throwable -> L75
            com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.proto.KeyStatusType.ENABLED     // Catch: java.lang.Throwable -> L75
            if (r2 == r3) goto L40
            com.google.crypto.tink.proto.KeyStatusType r2 = r1.getStatus()     // Catch: java.lang.Throwable -> L75
            com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.proto.KeyStatusType.DISABLED     // Catch: java.lang.Throwable -> L75
            if (r2 != r3) goto L27
            goto L40
        L27:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r3.<init>()     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "cannot enable key with id "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch: java.lang.Throwable -> L75
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L75
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L75
            throw r2     // Catch: java.lang.Throwable -> L75
        L40:
            com.google.crypto.tink.proto.Keyset$Builder r2 = r5.keysetBuilder     // Catch: java.lang.Throwable -> L75
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$Builder r3 = r1.toBuilder()     // Catch: java.lang.Throwable -> L75
            com.google.crypto.tink.proto.Keyset$Key$Builder r3 = (com.google.crypto.tink.proto.Keyset.Key.Builder) r3     // Catch: java.lang.Throwable -> L75
            com.google.crypto.tink.proto.KeyStatusType r4 = com.google.crypto.tink.proto.KeyStatusType.ENABLED     // Catch: java.lang.Throwable -> L75
            com.google.crypto.tink.proto.Keyset$Key$Builder r3 = r3.setStatus(r4)     // Catch: java.lang.Throwable -> L75
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = r3.build()     // Catch: java.lang.Throwable -> L75
            com.google.crypto.tink.proto.Keyset$Key r3 = (com.google.crypto.tink.proto.Keyset.Key) r3     // Catch: java.lang.Throwable -> L75
            r2.setKey(r0, r3)     // Catch: java.lang.Throwable -> L75
            monitor-exit(r5)
            return r5
        L59:
            int r0 = r0 + 1
            goto L2
        L5c:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r1.<init>()     // Catch: java.lang.Throwable -> L75
            java.lang.String r2 = "key not found: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L75
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L75
            throw r0     // Catch: java.lang.Throwable -> L75
        L75:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L75
            throw r6
    }

    public synchronized com.google.crypto.tink.KeysetHandle getKeysetHandle() throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.proto.Keyset$Builder r0 = r1.keysetBuilder     // Catch: java.lang.Throwable -> Lf
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()     // Catch: java.lang.Throwable -> Lf
            com.google.crypto.tink.proto.Keyset r0 = (com.google.crypto.tink.proto.Keyset) r0     // Catch: java.lang.Throwable -> Lf
            com.google.crypto.tink.KeysetHandle r0 = com.google.crypto.tink.KeysetHandle.fromKeyset(r0)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    @java.lang.Deprecated
    public synchronized com.google.crypto.tink.KeysetManager promote(int r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.KeysetManager r0 = r1.setPrimary(r2)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return r0
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @java.lang.Deprecated
    public synchronized com.google.crypto.tink.KeysetManager rotate(com.google.crypto.tink.proto.KeyTemplate r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.addNewKey(r2, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return r1
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    public synchronized com.google.crypto.tink.KeysetManager setPrimary(int r6) throws java.security.GeneralSecurityException {
            r5 = this;
            monitor-enter(r5)
            r0 = 0
        L2:
            com.google.crypto.tink.proto.Keyset$Builder r1 = r5.keysetBuilder     // Catch: java.lang.Throwable -> L5e
            int r1 = r1.getKeyCount()     // Catch: java.lang.Throwable -> L5e
            if (r0 >= r1) goto L45
            com.google.crypto.tink.proto.Keyset$Builder r1 = r5.keysetBuilder     // Catch: java.lang.Throwable -> L5e
            com.google.crypto.tink.proto.Keyset$Key r1 = r1.getKey(r0)     // Catch: java.lang.Throwable -> L5e
            int r2 = r1.getKeyId()     // Catch: java.lang.Throwable -> L5e
            if (r2 != r6) goto L42
            com.google.crypto.tink.proto.KeyStatusType r2 = r1.getStatus()     // Catch: java.lang.Throwable -> L5e
            com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.proto.KeyStatusType.ENABLED     // Catch: java.lang.Throwable -> L5e
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L29
            com.google.crypto.tink.proto.Keyset$Builder r2 = r5.keysetBuilder     // Catch: java.lang.Throwable -> L5e
            r2.setPrimaryKeyId(r6)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r5)
            return r5
        L29:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r3.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "cannot set key as primary because it's not enabled: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L5e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L5e
            throw r2     // Catch: java.lang.Throwable -> L5e
        L42:
            int r0 = r0 + 1
            goto L2
        L45:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r1.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = "key not found: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5e
            throw r0     // Catch: java.lang.Throwable -> L5e
        L5e:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5e
            throw r6
    }
}
