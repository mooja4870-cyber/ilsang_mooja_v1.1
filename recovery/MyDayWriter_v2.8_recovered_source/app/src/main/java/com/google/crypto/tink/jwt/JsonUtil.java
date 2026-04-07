package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
final class JsonUtil {
    private JsonUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean isValidString(java.lang.String r1) {
            boolean r0 = com.google.crypto.tink.internal.JsonParser.isValidString(r1)
            return r0
    }

    static com.google.gson.JsonObject parseJson(java.lang.String r4) throws com.google.crypto.tink.jwt.JwtInvalidException {
            com.google.gson.JsonElement r0 = com.google.crypto.tink.internal.JsonParser.parse(r4)     // Catch: java.io.IOException -> L9 com.google.gson.JsonParseException -> Lb java.lang.IllegalStateException -> Ld
            com.google.gson.JsonObject r0 = r0.getAsJsonObject()     // Catch: java.io.IOException -> L9 com.google.gson.JsonParseException -> Lb java.lang.IllegalStateException -> Ld
            return r0
        L9:
            r0 = move-exception
            goto Le
        Lb:
            r0 = move-exception
            goto Le
        Ld:
            r0 = move-exception
        Le:
            com.google.crypto.tink.jwt.JwtInvalidException r1 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "invalid JSON: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    static com.google.gson.JsonArray parseJsonArray(java.lang.String r4) throws com.google.crypto.tink.jwt.JwtInvalidException {
            com.google.gson.JsonElement r0 = com.google.crypto.tink.internal.JsonParser.parse(r4)     // Catch: java.io.IOException -> L9 com.google.gson.JsonParseException -> Lb java.lang.IllegalStateException -> Ld
            com.google.gson.JsonArray r0 = r0.getAsJsonArray()     // Catch: java.io.IOException -> L9 com.google.gson.JsonParseException -> Lb java.lang.IllegalStateException -> Ld
            return r0
        L9:
            r0 = move-exception
            goto Le
        Lb:
            r0 = move-exception
            goto Le
        Ld:
            r0 = move-exception
        Le:
            com.google.crypto.tink.jwt.JwtInvalidException r1 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "invalid JSON: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }
}
