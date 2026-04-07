package com.google.crypto.tink.tinkkey;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
@java.lang.Deprecated
public class KeyHandle {
    private final int id;
    private final com.google.crypto.tink.tinkkey.TinkKey key;
    private final com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType status;

    public enum KeyStatusType extends java.lang.Enum<com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType> {
        private static final /* synthetic */ com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType[] $VALUES = null;
        public static final com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType DESTROYED = null;
        public static final com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType DISABLED = null;
        public static final com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType ENABLED = null;

        static {
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r0 = new com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType
                java.lang.String r1 = "ENABLED"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.ENABLED = r0
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r0 = new com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType
                java.lang.String r1 = "DISABLED"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.DISABLED = r0
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r0 = new com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType
                java.lang.String r1 = "DESTROYED"
                r2 = 2
                r0.<init>(r1, r2)
                com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.DESTROYED = r0
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r0 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.ENABLED
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r1 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.DISABLED
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r2 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.DESTROYED
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType[] r0 = new com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType[]{r0, r1, r2}
                com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.$VALUES = r0
                return
        }

        KeyStatusType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType> r0 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r0 = (com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType) r0
                return r0
        }

        public static com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType[] values() {
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType[] r0 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType[] r0 = (com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType[]) r0
                return r0
        }
    }

    private KeyHandle(com.google.crypto.tink.tinkkey.TinkKey r2) {
            r1 = this;
            r1.<init>()
            r1.key = r2
            com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r0 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.ENABLED
            r1.status = r0
            int r0 = com.google.crypto.tink.internal.Util.randKeyId()
            r1.id = r0
            return
    }

    protected KeyHandle(com.google.crypto.tink.tinkkey.TinkKey r1, com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.key = r1
            r0.status = r2
            r0.id = r3
            return
    }

    private void checkAccess(com.google.crypto.tink.tinkkey.KeyAccess r3) throws java.security.GeneralSecurityException {
            r2 = this;
            boolean r0 = r2.hasSecret()
            if (r0 == 0) goto L15
            boolean r0 = r3.canAccessSecret()
            if (r0 == 0) goto Ld
            goto L15
        Ld:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "No access"
            r0.<init>(r1)
            throw r0
        L15:
            return
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.tinkkey.KeyHandle createFromKey(com.google.crypto.tink.proto.KeyData r2, com.google.crypto.tink.KeyTemplate.OutputPrefixType r3) {
            com.google.crypto.tink.tinkkey.KeyHandle r0 = new com.google.crypto.tink.tinkkey.KeyHandle
            com.google.crypto.tink.tinkkey.internal.ProtoKey r1 = new com.google.crypto.tink.tinkkey.internal.ProtoKey
            r1.<init>(r2, r3)
            r0.<init>(r1)
            return r0
    }

    public static com.google.crypto.tink.tinkkey.KeyHandle createFromKey(com.google.crypto.tink.tinkkey.TinkKey r1, com.google.crypto.tink.tinkkey.KeyAccess r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.tinkkey.KeyHandle r0 = new com.google.crypto.tink.tinkkey.KeyHandle
            r0.<init>(r1)
            r0.checkAccess(r2)
            return r0
    }

    public static com.google.crypto.tink.tinkkey.KeyHandle generateNew(com.google.crypto.tink.KeyTemplate r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.tinkkey.internal.ProtoKey r0 = new com.google.crypto.tink.tinkkey.internal.ProtoKey
            com.google.crypto.tink.proto.KeyData r1 = com.google.crypto.tink.Registry.newKeyData(r3)
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = r3.getOutputPrefixType()
            r0.<init>(r1, r2)
            com.google.crypto.tink.tinkkey.KeyHandle r1 = new com.google.crypto.tink.tinkkey.KeyHandle
            r1.<init>(r0)
            return r1
    }

    public int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    public com.google.crypto.tink.tinkkey.TinkKey getKey(com.google.crypto.tink.tinkkey.KeyAccess r2) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.checkAccess(r2)
            com.google.crypto.tink.tinkkey.TinkKey r0 = r1.key
            return r0
    }

    public com.google.crypto.tink.KeyTemplate getKeyTemplate() {
            r1 = this;
            com.google.crypto.tink.tinkkey.TinkKey r0 = r1.key
            com.google.crypto.tink.KeyTemplate r0 = r0.getKeyTemplate()
            return r0
    }

    public com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType getStatus() {
            r1 = this;
            com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r0 = r1.status
            return r0
    }

    public boolean hasSecret() {
            r1 = this;
            com.google.crypto.tink.tinkkey.TinkKey r0 = r1.key
            boolean r0 = r0.hasSecret()
            return r0
    }
}
