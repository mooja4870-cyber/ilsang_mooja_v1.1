package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
final class Util {
    public static final java.nio.charset.Charset UTF_8 = null;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.crypto.tink.Util.UTF_8 = r0
            return
    }

    private Util() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.proto.KeysetInfo.KeyInfo getKeyInfo(com.google.crypto.tink.proto.Keyset.Key r2) {
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo$Builder r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.newBuilder()
            com.google.crypto.tink.proto.KeyData r1 = r2.getKeyData()
            java.lang.String r1 = r1.getTypeUrl()
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.KeyStatusType r1 = r2.getStatus()
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo$Builder r0 = r0.setStatus(r1)
            com.google.crypto.tink.proto.OutputPrefixType r1 = r2.getOutputPrefixType()
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo$Builder r0 = r0.setOutputPrefixType(r1)
            int r1 = r2.getKeyId()
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo$Builder r0 = r0.setKeyId(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
            return r0
    }

    public static com.google.crypto.tink.proto.KeysetInfo getKeysetInfo(com.google.crypto.tink.proto.Keyset r4) {
            com.google.crypto.tink.proto.KeysetInfo$Builder r0 = com.google.crypto.tink.proto.KeysetInfo.newBuilder()
            int r1 = r4.getPrimaryKeyId()
            com.google.crypto.tink.proto.KeysetInfo$Builder r0 = r0.setPrimaryKeyId(r1)
            java.util.List r1 = r4.getKeyList()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.next()
            com.google.crypto.tink.proto.Keyset$Key r2 = (com.google.crypto.tink.proto.Keyset.Key) r2
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo r3 = getKeyInfo(r2)
            r0.addKeyInfo(r3)
            goto L14
        L28:
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r0.build()
            com.google.crypto.tink.proto.KeysetInfo r1 = (com.google.crypto.tink.proto.KeysetInfo) r1
            return r1
    }

    public static byte[] readAll(java.io.InputStream r5) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]
        L9:
            int r2 = r5.read(r1)
            r3 = r2
            r4 = -1
            if (r2 == r4) goto L16
            r2 = 0
            r0.write(r1, r2, r3)
            goto L9
        L16:
            byte[] r2 = r0.toByteArray()
            return r2
    }

    public static void validateKey(com.google.crypto.tink.proto.Keyset.Key r3) throws java.security.GeneralSecurityException {
            boolean r0 = r3.hasKeyData()
            if (r0 == 0) goto L47
            com.google.crypto.tink.proto.OutputPrefixType r0 = r3.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.UNKNOWN_PREFIX
            if (r0 == r1) goto L2f
            com.google.crypto.tink.proto.KeyStatusType r0 = r3.getStatus()
            com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.UNKNOWN_STATUS
            if (r0 == r1) goto L17
            return
        L17:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            int r1 = r3.getKeyId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "key %d has unknown status"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L2f:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            int r1 = r3.getKeyId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "key %d has unknown prefix"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L47:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            int r1 = r3.getKeyId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "key %d has no key data"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    public static void validateKeyset(com.google.crypto.tink.proto.Keyset r8) throws java.security.GeneralSecurityException {
            int r0 = r8.getPrimaryKeyId()
            r1 = 0
            r2 = 1
            r3 = 0
            java.util.List r4 = r8.getKeyList()
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4a
            java.lang.Object r5 = r4.next()
            com.google.crypto.tink.proto.Keyset$Key r5 = (com.google.crypto.tink.proto.Keyset.Key) r5
            com.google.crypto.tink.proto.KeyStatusType r6 = r5.getStatus()
            com.google.crypto.tink.proto.KeyStatusType r7 = com.google.crypto.tink.proto.KeyStatusType.ENABLED
            if (r6 == r7) goto L24
            goto Lf
        L24:
            validateKey(r5)
            int r6 = r5.getKeyId()
            if (r6 != r0) goto L39
            if (r1 != 0) goto L31
            r1 = 1
            goto L39
        L31:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r6 = "keyset contains multiple primary keys"
            r4.<init>(r6)
            throw r4
        L39:
            com.google.crypto.tink.proto.KeyData r6 = r5.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r6 = r6.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r7 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            if (r6 == r7) goto L46
            r2 = 0
        L46:
            int r3 = r3 + 1
            goto Lf
        L4a:
            if (r3 == 0) goto L5a
            if (r1 != 0) goto L59
            if (r2 == 0) goto L51
            goto L59
        L51:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "keyset doesn't contain a valid primary key"
            r4.<init>(r5)
            throw r4
        L59:
            return
        L5a:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "keyset must contain at least one ENABLED key"
            r4.<init>(r5)
            throw r4
    }
}
