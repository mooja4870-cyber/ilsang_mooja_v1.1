package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public final class JsonKeysetWriter implements com.google.crypto.tink.KeysetWriter {
    private static final java.nio.charset.Charset UTF_8 = null;
    private final java.io.OutputStream outputStream;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.crypto.tink.JsonKeysetWriter.UTF_8 = r0
            return
    }

    private JsonKeysetWriter(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>()
            r0.outputStream = r1
            return
    }

    private com.google.gson.JsonObject toJson(com.google.crypto.tink.proto.EncryptedKeyset r4) {
            r3 = this;
            com.google.gson.JsonObject r0 = new com.google.gson.JsonObject
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r4.getEncryptedKeyset()
            byte[] r1 = r1.toByteArray()
            java.lang.String r1 = com.google.crypto.tink.subtle.Base64.encode(r1)
            java.lang.String r2 = "encryptedKeyset"
            r0.addProperty(r2, r1)
            com.google.crypto.tink.proto.KeysetInfo r1 = r4.getKeysetInfo()
            com.google.gson.JsonObject r1 = r3.toJson(r1)
            java.lang.String r2 = "keysetInfo"
            r0.add(r2, r1)
            return r0
    }

    private com.google.gson.JsonObject toJson(com.google.crypto.tink.proto.KeyData r4) {
            r3 = this;
            com.google.gson.JsonObject r0 = new com.google.gson.JsonObject
            r0.<init>()
            java.lang.String r1 = "typeUrl"
            java.lang.String r2 = r4.getTypeUrl()
            r0.addProperty(r1, r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r1 = r4.getValue()
            byte[] r1 = r1.toByteArray()
            java.lang.String r1 = com.google.crypto.tink.subtle.Base64.encode(r1)
            java.lang.String r2 = "value"
            r0.addProperty(r2, r1)
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r1 = r4.getKeyMaterialType()
            java.lang.String r1 = r1.name()
            java.lang.String r2 = "keyMaterialType"
            r0.addProperty(r2, r1)
            return r0
    }

    private com.google.gson.JsonObject toJson(com.google.crypto.tink.proto.Keyset.Key r4) {
            r3 = this;
            com.google.gson.JsonObject r0 = new com.google.gson.JsonObject
            r0.<init>()
            com.google.crypto.tink.proto.KeyData r1 = r4.getKeyData()
            com.google.gson.JsonObject r1 = r3.toJson(r1)
            java.lang.String r2 = "keyData"
            r0.add(r2, r1)
            com.google.crypto.tink.proto.KeyStatusType r1 = r4.getStatus()
            java.lang.String r1 = r1.name()
            java.lang.String r2 = "status"
            r0.addProperty(r2, r1)
            int r1 = r4.getKeyId()
            long r1 = r3.toUnsignedLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "keyId"
            r0.addProperty(r2, r1)
            com.google.crypto.tink.proto.OutputPrefixType r1 = r4.getOutputPrefixType()
            java.lang.String r1 = r1.name()
            java.lang.String r2 = "outputPrefixType"
            r0.addProperty(r2, r1)
            return r0
    }

    private com.google.gson.JsonObject toJson(com.google.crypto.tink.proto.Keyset r6) {
            r5 = this;
            com.google.gson.JsonObject r0 = new com.google.gson.JsonObject
            r0.<init>()
            int r1 = r6.getPrimaryKeyId()
            long r1 = r5.toUnsignedLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "primaryKeyId"
            r0.addProperty(r2, r1)
            com.google.gson.JsonArray r1 = new com.google.gson.JsonArray
            r1.<init>()
            java.util.List r2 = r6.getKeyList()
            java.util.Iterator r2 = r2.iterator()
        L23:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L37
            java.lang.Object r3 = r2.next()
            com.google.crypto.tink.proto.Keyset$Key r3 = (com.google.crypto.tink.proto.Keyset.Key) r3
            com.google.gson.JsonObject r4 = r5.toJson(r3)
            r1.add(r4)
            goto L23
        L37:
            java.lang.String r2 = "key"
            r0.add(r2, r1)
            return r0
    }

    private com.google.gson.JsonObject toJson(com.google.crypto.tink.proto.KeysetInfo.KeyInfo r4) {
            r3 = this;
            com.google.gson.JsonObject r0 = new com.google.gson.JsonObject
            r0.<init>()
            java.lang.String r1 = "typeUrl"
            java.lang.String r2 = r4.getTypeUrl()
            r0.addProperty(r1, r2)
            com.google.crypto.tink.proto.KeyStatusType r1 = r4.getStatus()
            java.lang.String r1 = r1.name()
            java.lang.String r2 = "status"
            r0.addProperty(r2, r1)
            int r1 = r4.getKeyId()
            long r1 = r3.toUnsignedLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "keyId"
            r0.addProperty(r2, r1)
            com.google.crypto.tink.proto.OutputPrefixType r1 = r4.getOutputPrefixType()
            java.lang.String r1 = r1.name()
            java.lang.String r2 = "outputPrefixType"
            r0.addProperty(r2, r1)
            return r0
    }

    private com.google.gson.JsonObject toJson(com.google.crypto.tink.proto.KeysetInfo r6) {
            r5 = this;
            com.google.gson.JsonObject r0 = new com.google.gson.JsonObject
            r0.<init>()
            int r1 = r6.getPrimaryKeyId()
            long r1 = r5.toUnsignedLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "primaryKeyId"
            r0.addProperty(r2, r1)
            com.google.gson.JsonArray r1 = new com.google.gson.JsonArray
            r1.<init>()
            java.util.List r2 = r6.getKeyInfoList()
            java.util.Iterator r2 = r2.iterator()
        L23:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L37
            java.lang.Object r3 = r2.next()
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo r3 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r3
            com.google.gson.JsonObject r4 = r5.toJson(r3)
            r1.add(r4)
            goto L23
        L37:
            java.lang.String r2 = "keyInfo"
            r0.add(r2, r1)
            return r0
    }

    private long toUnsignedLong(int r5) {
            r4 = this;
            long r0 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.KeysetWriter withFile(java.io.File r1) throws java.io.IOException {
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            com.google.crypto.tink.KeysetWriter r0 = withOutputStream(r0)
            return r0
    }

    public static com.google.crypto.tink.KeysetWriter withOutputStream(java.io.OutputStream r1) {
            com.google.crypto.tink.JsonKeysetWriter r0 = new com.google.crypto.tink.JsonKeysetWriter
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.KeysetWriter withPath(java.lang.String r2) throws java.io.IOException {
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            r0.<init>(r1)
            com.google.crypto.tink.KeysetWriter r0 = withOutputStream(r0)
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.KeysetWriter withPath(java.nio.file.Path r2) throws java.io.IOException {
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            java.io.File r1 = r2.toFile()
            r0.<init>(r1)
            com.google.crypto.tink.KeysetWriter r0 = withOutputStream(r0)
            return r0
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(com.google.crypto.tink.proto.EncryptedKeyset r4) throws java.io.IOException {
            r3 = this;
            java.io.OutputStream r0 = r3.outputStream
            com.google.gson.JsonObject r1 = r3.toJson(r4)
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r2 = com.google.crypto.tink.JsonKeysetWriter.UTF_8
            byte[] r1 = r1.getBytes(r2)
            r0.write(r1)
            java.io.OutputStream r0 = r3.outputStream
            java.lang.String r1 = java.lang.System.lineSeparator()
            java.nio.charset.Charset r2 = com.google.crypto.tink.JsonKeysetWriter.UTF_8
            byte[] r1 = r1.getBytes(r2)
            r0.write(r1)
            java.io.OutputStream r0 = r3.outputStream
            r0.close()
            return
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(com.google.crypto.tink.proto.Keyset r4) throws java.io.IOException {
            r3 = this;
            java.io.OutputStream r0 = r3.outputStream     // Catch: java.lang.Throwable -> L29 com.google.gson.JsonParseException -> L2b
            com.google.gson.JsonObject r1 = r3.toJson(r4)     // Catch: java.lang.Throwable -> L29 com.google.gson.JsonParseException -> L2b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L29 com.google.gson.JsonParseException -> L2b
            java.nio.charset.Charset r2 = com.google.crypto.tink.JsonKeysetWriter.UTF_8     // Catch: java.lang.Throwable -> L29 com.google.gson.JsonParseException -> L2b
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L29 com.google.gson.JsonParseException -> L2b
            r0.write(r1)     // Catch: java.lang.Throwable -> L29 com.google.gson.JsonParseException -> L2b
            java.io.OutputStream r0 = r3.outputStream     // Catch: java.lang.Throwable -> L29 com.google.gson.JsonParseException -> L2b
            java.lang.String r1 = java.lang.System.lineSeparator()     // Catch: java.lang.Throwable -> L29 com.google.gson.JsonParseException -> L2b
            java.nio.charset.Charset r2 = com.google.crypto.tink.JsonKeysetWriter.UTF_8     // Catch: java.lang.Throwable -> L29 com.google.gson.JsonParseException -> L2b
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L29 com.google.gson.JsonParseException -> L2b
            r0.write(r1)     // Catch: java.lang.Throwable -> L29 com.google.gson.JsonParseException -> L2b
            java.io.OutputStream r0 = r3.outputStream
            r0.close()
            return
        L29:
            r0 = move-exception
            goto L32
        L2b:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L29
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L29
            throw r1     // Catch: java.lang.Throwable -> L29
        L32:
            java.io.OutputStream r1 = r3.outputStream
            r1.close()
            throw r0
    }
}
