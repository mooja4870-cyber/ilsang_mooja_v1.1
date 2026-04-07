package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public final class JsonKeysetReader implements com.google.crypto.tink.KeysetReader {
    private static final long MAX_KEY_ID = 4294967295L;
    private static final long MIN_KEY_ID = -2147483648L;
    private static final java.nio.charset.Charset UTF_8 = null;
    private final java.io.InputStream inputStream;
    private boolean urlSafeBase64;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.crypto.tink.JsonKeysetReader.UTF_8 = r0
            return
    }

    private JsonKeysetReader(java.io.InputStream r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.urlSafeBase64 = r0
            r1.inputStream = r2
            return
    }

    private com.google.crypto.tink.proto.EncryptedKeyset encryptedKeysetFromJson(com.google.gson.JsonObject r5) throws java.io.IOException {
            r4 = this;
            validateEncryptedKeyset(r5)
            boolean r0 = r4.urlSafeBase64
            java.lang.String r1 = "encryptedKeyset"
            if (r0 == 0) goto L16
            com.google.gson.JsonElement r0 = r5.get(r1)
            java.lang.String r0 = r0.getAsString()
            byte[] r0 = com.google.crypto.tink.subtle.Base64.urlSafeDecode(r0)
            goto L22
        L16:
            com.google.gson.JsonElement r0 = r5.get(r1)
            java.lang.String r0 = r0.getAsString()
            byte[] r0 = com.google.crypto.tink.subtle.Base64.decode(r0)
        L22:
            java.lang.String r1 = "keysetInfo"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L49
            com.google.crypto.tink.proto.EncryptedKeyset$Builder r2 = com.google.crypto.tink.proto.EncryptedKeyset.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r0)
            com.google.crypto.tink.proto.EncryptedKeyset$Builder r2 = r2.setEncryptedKeyset(r3)
            com.google.gson.JsonObject r1 = r5.getAsJsonObject(r1)
            com.google.crypto.tink.proto.KeysetInfo r1 = keysetInfoFromJson(r1)
            com.google.crypto.tink.proto.EncryptedKeyset$Builder r1 = r2.setKeysetInfo(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.EncryptedKeyset r1 = (com.google.crypto.tink.proto.EncryptedKeyset) r1
            return r1
        L49:
            com.google.crypto.tink.proto.EncryptedKeyset$Builder r1 = com.google.crypto.tink.proto.EncryptedKeyset.newBuilder()
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r0)
            com.google.crypto.tink.proto.EncryptedKeyset$Builder r1 = r1.setEncryptedKeyset(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.EncryptedKeyset r1 = (com.google.crypto.tink.proto.EncryptedKeyset) r1
            return r1
    }

    private static int getKeyId(com.google.gson.JsonElement r4) throws java.io.IOException {
            long r0 = com.google.crypto.tink.internal.JsonParser.getParsedNumberAsLongOrThrow(r4)     // Catch: java.lang.NumberFormatException -> L23
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L1b
            r2 = -2147483648(0xffffffff80000000, double:NaN)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L1b
            long r2 = r4.getAsLong()
            int r2 = (int) r2
            return r2
        L1b:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "invalid key id"
            r2.<init>(r3)
            throw r2
        L23:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
    }

    private static com.google.crypto.tink.proto.KeyData.KeyMaterialType getKeyMaterialType(java.lang.String r3) {
            int r0 = r3.hashCode()
            switch(r0) {
                case -1881281466: goto L26;
                case -1609477353: goto L1c;
                case 249237018: goto L12;
                case 1534613202: goto L8;
                default: goto L7;
            }
        L7:
            goto L30
        L8:
            java.lang.String r0 = "ASYMMETRIC_PUBLIC"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 2
            goto L31
        L12:
            java.lang.String r0 = "ASYMMETRIC_PRIVATE"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 1
            goto L31
        L1c:
            java.lang.String r0 = "SYMMETRIC"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 0
            goto L31
        L26:
            java.lang.String r0 = "REMOTE"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 3
            goto L31
        L30:
            r0 = -1
        L31:
            switch(r0) {
                case 0: goto L56;
                case 1: goto L53;
                case 2: goto L50;
                case 3: goto L4d;
                default: goto L34;
            }
        L34:
            com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown key material type: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4d:
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.REMOTE
            return r0
        L50:
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            return r0
        L53:
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE
            return r0
        L56:
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            return r0
    }

    private static com.google.crypto.tink.proto.OutputPrefixType getOutputPrefixType(java.lang.String r3) {
            int r0 = r3.hashCode()
            switch(r0) {
                case -2053249079: goto L26;
                case 80904: goto L1c;
                case 2575090: goto L12;
                case 1761684556: goto L8;
                default: goto L7;
            }
        L7:
            goto L30
        L8:
            java.lang.String r0 = "CRUNCHY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 3
            goto L31
        L12:
            java.lang.String r0 = "TINK"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 0
            goto L31
        L1c:
            java.lang.String r0 = "RAW"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 1
            goto L31
        L26:
            java.lang.String r0 = "LEGACY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 2
            goto L31
        L30:
            r0 = -1
        L31:
            switch(r0) {
                case 0: goto L56;
                case 1: goto L53;
                case 2: goto L50;
                case 3: goto L4d;
                default: goto L34;
            }
        L34:
            com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown output prefix type: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4d:
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY
            return r0
        L50:
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY
            return r0
        L53:
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            return r0
        L56:
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            return r0
    }

    private static com.google.crypto.tink.proto.KeyStatusType getStatus(java.lang.String r3) {
            int r0 = r3.hashCode()
            switch(r0) {
                case -891611359: goto L1c;
                case 478389753: goto L12;
                case 1053567612: goto L8;
                default: goto L7;
            }
        L7:
            goto L26
        L8:
            java.lang.String r0 = "DISABLED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 1
            goto L27
        L12:
            java.lang.String r0 = "DESTROYED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 2
            goto L27
        L1c:
            java.lang.String r0 = "ENABLED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 0
            goto L27
        L26:
            r0 = -1
        L27:
            switch(r0) {
                case 0: goto L49;
                case 1: goto L46;
                case 2: goto L43;
                default: goto L2a;
            }
        L2a:
            com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown status: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L43:
            com.google.crypto.tink.proto.KeyStatusType r0 = com.google.crypto.tink.proto.KeyStatusType.DESTROYED
            return r0
        L46:
            com.google.crypto.tink.proto.KeyStatusType r0 = com.google.crypto.tink.proto.KeyStatusType.DISABLED
            return r0
        L49:
            com.google.crypto.tink.proto.KeyStatusType r0 = com.google.crypto.tink.proto.KeyStatusType.ENABLED
            return r0
    }

    private com.google.crypto.tink.proto.KeyData keyDataFromJson(com.google.gson.JsonObject r4) {
            r3 = this;
            validateKeyData(r4)
            boolean r0 = r3.urlSafeBase64
            java.lang.String r1 = "value"
            if (r0 == 0) goto L16
            com.google.gson.JsonElement r0 = r4.get(r1)
            java.lang.String r0 = r0.getAsString()
            byte[] r0 = com.google.crypto.tink.subtle.Base64.urlSafeDecode(r0)
            goto L22
        L16:
            com.google.gson.JsonElement r0 = r4.get(r1)
            java.lang.String r0 = r0.getAsString()
            byte[] r0 = com.google.crypto.tink.subtle.Base64.decode(r0)
        L22:
            com.google.crypto.tink.proto.KeyData$Builder r1 = com.google.crypto.tink.proto.KeyData.newBuilder()
            java.lang.String r2 = "typeUrl"
            com.google.gson.JsonElement r2 = r4.get(r2)
            java.lang.String r2 = r2.getAsString()
            com.google.crypto.tink.proto.KeyData$Builder r1 = r1.setTypeUrl(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r0)
            com.google.crypto.tink.proto.KeyData$Builder r1 = r1.setValue(r2)
            java.lang.String r2 = "keyMaterialType"
            com.google.gson.JsonElement r2 = r4.get(r2)
            java.lang.String r2 = r2.getAsString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = getKeyMaterialType(r2)
            com.google.crypto.tink.proto.KeyData$Builder r1 = r1.setKeyMaterialType(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()
            com.google.crypto.tink.proto.KeyData r1 = (com.google.crypto.tink.proto.KeyData) r1
            return r1
    }

    private com.google.crypto.tink.proto.Keyset.Key keyFromJson(com.google.gson.JsonObject r3) throws java.io.IOException {
            r2 = this;
            validateKey(r3)
            com.google.crypto.tink.proto.Keyset$Key$Builder r0 = com.google.crypto.tink.proto.Keyset.Key.newBuilder()
            java.lang.String r1 = "status"
            com.google.gson.JsonElement r1 = r3.get(r1)
            java.lang.String r1 = r1.getAsString()
            com.google.crypto.tink.proto.KeyStatusType r1 = getStatus(r1)
            com.google.crypto.tink.proto.Keyset$Key$Builder r0 = r0.setStatus(r1)
            java.lang.String r1 = "keyId"
            com.google.gson.JsonElement r1 = r3.get(r1)
            int r1 = getKeyId(r1)
            com.google.crypto.tink.proto.Keyset$Key$Builder r0 = r0.setKeyId(r1)
            java.lang.String r1 = "outputPrefixType"
            com.google.gson.JsonElement r1 = r3.get(r1)
            java.lang.String r1 = r1.getAsString()
            com.google.crypto.tink.proto.OutputPrefixType r1 = getOutputPrefixType(r1)
            com.google.crypto.tink.proto.Keyset$Key$Builder r0 = r0.setOutputPrefixType(r1)
            java.lang.String r1 = "keyData"
            com.google.gson.JsonObject r1 = r3.getAsJsonObject(r1)
            com.google.crypto.tink.proto.KeyData r1 = r2.keyDataFromJson(r1)
            com.google.crypto.tink.proto.Keyset$Key$Builder r0 = r0.setKeyData(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.Keyset$Key r0 = (com.google.crypto.tink.proto.Keyset.Key) r0
            return r0
    }

    private static com.google.crypto.tink.proto.KeysetInfo.KeyInfo keyInfoFromJson(com.google.gson.JsonObject r2) throws java.io.IOException {
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo$Builder r0 = com.google.crypto.tink.proto.KeysetInfo.KeyInfo.newBuilder()
            java.lang.String r1 = "status"
            com.google.gson.JsonElement r1 = r2.get(r1)
            java.lang.String r1 = r1.getAsString()
            com.google.crypto.tink.proto.KeyStatusType r1 = getStatus(r1)
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo$Builder r0 = r0.setStatus(r1)
            java.lang.String r1 = "keyId"
            com.google.gson.JsonElement r1 = r2.get(r1)
            int r1 = getKeyId(r1)
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo$Builder r0 = r0.setKeyId(r1)
            java.lang.String r1 = "outputPrefixType"
            com.google.gson.JsonElement r1 = r2.get(r1)
            java.lang.String r1 = r1.getAsString()
            com.google.crypto.tink.proto.OutputPrefixType r1 = getOutputPrefixType(r1)
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo$Builder r0 = r0.setOutputPrefixType(r1)
            java.lang.String r1 = "typeUrl"
            com.google.gson.JsonElement r1 = r2.get(r1)
            java.lang.String r1 = r1.getAsString()
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo r0 = (com.google.crypto.tink.proto.KeysetInfo.KeyInfo) r0
            return r0
    }

    private com.google.crypto.tink.proto.Keyset keysetFromJson(com.google.gson.JsonObject r5) throws java.io.IOException {
            r4 = this;
            validateKeyset(r5)
            com.google.crypto.tink.proto.Keyset$Builder r0 = com.google.crypto.tink.proto.Keyset.newBuilder()
            java.lang.String r1 = "primaryKeyId"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L1a
            com.google.gson.JsonElement r1 = r5.get(r1)
            int r1 = getKeyId(r1)
            r0.setPrimaryKeyId(r1)
        L1a:
            java.lang.String r1 = "key"
            com.google.gson.JsonArray r1 = r5.getAsJsonArray(r1)
            r2 = 0
        L21:
            int r3 = r1.size()
            if (r2 >= r3) goto L39
            com.google.gson.JsonElement r3 = r1.get(r2)
            com.google.gson.JsonObject r3 = r3.getAsJsonObject()
            com.google.crypto.tink.proto.Keyset$Key r3 = r4.keyFromJson(r3)
            r0.addKey(r3)
            int r2 = r2 + 1
            goto L21
        L39:
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r0.build()
            com.google.crypto.tink.proto.Keyset r2 = (com.google.crypto.tink.proto.Keyset) r2
            return r2
    }

    private static com.google.crypto.tink.proto.KeysetInfo keysetInfoFromJson(com.google.gson.JsonObject r4) throws java.io.IOException {
            com.google.crypto.tink.proto.KeysetInfo$Builder r0 = com.google.crypto.tink.proto.KeysetInfo.newBuilder()
            java.lang.String r1 = "primaryKeyId"
            boolean r2 = r4.has(r1)
            if (r2 == 0) goto L17
            com.google.gson.JsonElement r1 = r4.get(r1)
            int r1 = getKeyId(r1)
            r0.setPrimaryKeyId(r1)
        L17:
            java.lang.String r1 = "keyInfo"
            boolean r2 = r4.has(r1)
            if (r2 == 0) goto L3c
            com.google.gson.JsonArray r1 = r4.getAsJsonArray(r1)
            r2 = 0
        L24:
            int r3 = r1.size()
            if (r2 >= r3) goto L3c
            com.google.gson.JsonElement r3 = r1.get(r2)
            com.google.gson.JsonObject r3 = r3.getAsJsonObject()
            com.google.crypto.tink.proto.KeysetInfo$KeyInfo r3 = keyInfoFromJson(r3)
            r0.addKeyInfo(r3)
            int r2 = r2 + 1
            goto L24
        L3c:
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r0.build()
            com.google.crypto.tink.proto.KeysetInfo r1 = (com.google.crypto.tink.proto.KeysetInfo) r1
            return r1
    }

    private static void validateEncryptedKeyset(com.google.gson.JsonObject r2) {
            java.lang.String r0 = "encryptedKeyset"
            boolean r0 = r2.has(r0)
            if (r0 == 0) goto L9
            return
        L9:
            com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException
            java.lang.String r1 = "invalid encrypted keyset"
            r0.<init>(r1)
            throw r0
    }

    private static void validateKey(com.google.gson.JsonObject r2) {
            java.lang.String r0 = "keyData"
            boolean r0 = r2.has(r0)
            if (r0 == 0) goto L21
            java.lang.String r0 = "status"
            boolean r0 = r2.has(r0)
            if (r0 == 0) goto L21
            java.lang.String r0 = "keyId"
            boolean r0 = r2.has(r0)
            if (r0 == 0) goto L21
            java.lang.String r0 = "outputPrefixType"
            boolean r0 = r2.has(r0)
            if (r0 == 0) goto L21
            return
        L21:
            com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException
            java.lang.String r1 = "invalid key"
            r0.<init>(r1)
            throw r0
    }

    private static void validateKeyData(com.google.gson.JsonObject r2) {
            java.lang.String r0 = "typeUrl"
            boolean r0 = r2.has(r0)
            if (r0 == 0) goto L19
            java.lang.String r0 = "value"
            boolean r0 = r2.has(r0)
            if (r0 == 0) goto L19
            java.lang.String r0 = "keyMaterialType"
            boolean r0 = r2.has(r0)
            if (r0 == 0) goto L19
            return
        L19:
            com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException
            java.lang.String r1 = "invalid keyData"
            r0.<init>(r1)
            throw r0
    }

    private static void validateKeyset(com.google.gson.JsonObject r2) {
            java.lang.String r0 = "key"
            boolean r1 = r2.has(r0)
            if (r1 == 0) goto L13
            com.google.gson.JsonArray r0 = r2.getAsJsonArray(r0)
            int r0 = r0.size()
            if (r0 == 0) goto L13
            return
        L13:
            com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException
            java.lang.String r1 = "invalid keyset"
            r0.<init>(r1)
            throw r0
    }

    public static com.google.crypto.tink.JsonKeysetReader withBytes(byte[] r2) {
            com.google.crypto.tink.JsonKeysetReader r0 = new com.google.crypto.tink.JsonKeysetReader
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.JsonKeysetReader withFile(java.io.File r1) throws java.io.IOException {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            com.google.crypto.tink.JsonKeysetReader r0 = withInputStream(r0)
            return r0
    }

    public static com.google.crypto.tink.JsonKeysetReader withInputStream(java.io.InputStream r1) throws java.io.IOException {
            com.google.crypto.tink.JsonKeysetReader r0 = new com.google.crypto.tink.JsonKeysetReader
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.JsonKeysetReader withJsonObject(java.lang.Object r1) {
            java.lang.String r0 = r1.toString()
            com.google.crypto.tink.JsonKeysetReader r0 = withString(r0)
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.JsonKeysetReader withPath(java.lang.String r2) throws java.io.IOException {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            r0.<init>(r1)
            com.google.crypto.tink.JsonKeysetReader r0 = withInputStream(r0)
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.JsonKeysetReader withPath(java.nio.file.Path r2) throws java.io.IOException {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = r2.toFile()
            r0.<init>(r1)
            com.google.crypto.tink.JsonKeysetReader r0 = withInputStream(r0)
            return r0
    }

    public static com.google.crypto.tink.JsonKeysetReader withString(java.lang.String r3) {
            com.google.crypto.tink.JsonKeysetReader r0 = new com.google.crypto.tink.JsonKeysetReader
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            java.nio.charset.Charset r2 = com.google.crypto.tink.JsonKeysetReader.UTF_8
            byte[] r2 = r3.getBytes(r2)
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.KeysetReader
    public com.google.crypto.tink.proto.Keyset read() throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L23 java.lang.IllegalStateException -> L25 com.google.gson.JsonParseException -> L27
            java.io.InputStream r1 = r3.inputStream     // Catch: java.lang.Throwable -> L23 java.lang.IllegalStateException -> L25 com.google.gson.JsonParseException -> L27
            byte[] r1 = com.google.crypto.tink.Util.readAll(r1)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalStateException -> L25 com.google.gson.JsonParseException -> L27
            java.nio.charset.Charset r2 = com.google.crypto.tink.JsonKeysetReader.UTF_8     // Catch: java.lang.Throwable -> L23 java.lang.IllegalStateException -> L25 com.google.gson.JsonParseException -> L27
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalStateException -> L25 com.google.gson.JsonParseException -> L27
            com.google.gson.JsonElement r0 = com.google.crypto.tink.internal.JsonParser.parse(r0)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalStateException -> L25 com.google.gson.JsonParseException -> L27
            com.google.gson.JsonObject r0 = r0.getAsJsonObject()     // Catch: java.lang.Throwable -> L23 java.lang.IllegalStateException -> L25 com.google.gson.JsonParseException -> L27
            com.google.crypto.tink.proto.Keyset r0 = r3.keysetFromJson(r0)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalStateException -> L25 com.google.gson.JsonParseException -> L27
            java.io.InputStream r1 = r3.inputStream
            if (r1 == 0) goto L22
            java.io.InputStream r1 = r3.inputStream
            r1.close()
        L22:
            return r0
        L23:
            r0 = move-exception
            goto L2e
        L25:
            r0 = move-exception
            goto L28
        L27:
            r0 = move-exception
        L28:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L2e:
            java.io.InputStream r1 = r3.inputStream
            if (r1 == 0) goto L37
            java.io.InputStream r1 = r3.inputStream
            r1.close()
        L37:
            throw r0
    }

    @Override // com.google.crypto.tink.KeysetReader
    public com.google.crypto.tink.proto.EncryptedKeyset readEncrypted() throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L23 java.lang.IllegalStateException -> L25 com.google.gson.JsonParseException -> L27
            java.io.InputStream r1 = r3.inputStream     // Catch: java.lang.Throwable -> L23 java.lang.IllegalStateException -> L25 com.google.gson.JsonParseException -> L27
            byte[] r1 = com.google.crypto.tink.Util.readAll(r1)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalStateException -> L25 com.google.gson.JsonParseException -> L27
            java.nio.charset.Charset r2 = com.google.crypto.tink.JsonKeysetReader.UTF_8     // Catch: java.lang.Throwable -> L23 java.lang.IllegalStateException -> L25 com.google.gson.JsonParseException -> L27
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalStateException -> L25 com.google.gson.JsonParseException -> L27
            com.google.gson.JsonElement r0 = com.google.crypto.tink.internal.JsonParser.parse(r0)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalStateException -> L25 com.google.gson.JsonParseException -> L27
            com.google.gson.JsonObject r0 = r0.getAsJsonObject()     // Catch: java.lang.Throwable -> L23 java.lang.IllegalStateException -> L25 com.google.gson.JsonParseException -> L27
            com.google.crypto.tink.proto.EncryptedKeyset r0 = r3.encryptedKeysetFromJson(r0)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalStateException -> L25 com.google.gson.JsonParseException -> L27
            java.io.InputStream r1 = r3.inputStream
            if (r1 == 0) goto L22
            java.io.InputStream r1 = r3.inputStream
            r1.close()
        L22:
            return r0
        L23:
            r0 = move-exception
            goto L2e
        L25:
            r0 = move-exception
            goto L28
        L27:
            r0 = move-exception
        L28:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L2e:
            java.io.InputStream r1 = r3.inputStream
            if (r1 == 0) goto L37
            java.io.InputStream r1 = r3.inputStream
            r1.close()
        L37:
            throw r0
    }

    public com.google.crypto.tink.JsonKeysetReader withUrlSafeBase64() {
            r1 = this;
            r0 = 1
            r1.urlSafeBase64 = r0
            return r1
    }
}
