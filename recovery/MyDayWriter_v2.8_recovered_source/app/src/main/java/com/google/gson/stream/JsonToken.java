package com.google.gson.stream;

/* JADX INFO: loaded from: classes.dex */
public enum JsonToken extends java.lang.Enum<com.google.gson.stream.JsonToken> {
    private static final /* synthetic */ com.google.gson.stream.JsonToken[] $VALUES = null;
    public static final com.google.gson.stream.JsonToken BEGIN_ARRAY = null;
    public static final com.google.gson.stream.JsonToken BEGIN_OBJECT = null;
    public static final com.google.gson.stream.JsonToken BOOLEAN = null;
    public static final com.google.gson.stream.JsonToken END_ARRAY = null;
    public static final com.google.gson.stream.JsonToken END_DOCUMENT = null;
    public static final com.google.gson.stream.JsonToken END_OBJECT = null;
    public static final com.google.gson.stream.JsonToken NAME = null;
    public static final com.google.gson.stream.JsonToken NULL = null;
    public static final com.google.gson.stream.JsonToken NUMBER = null;
    public static final com.google.gson.stream.JsonToken STRING = null;

    static {
            com.google.gson.stream.JsonToken r0 = new com.google.gson.stream.JsonToken
            java.lang.String r1 = "BEGIN_ARRAY"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.gson.stream.JsonToken.BEGIN_ARRAY = r0
            com.google.gson.stream.JsonToken r0 = new com.google.gson.stream.JsonToken
            java.lang.String r1 = "END_ARRAY"
            r2 = 1
            r0.<init>(r1, r2)
            com.google.gson.stream.JsonToken.END_ARRAY = r0
            com.google.gson.stream.JsonToken r0 = new com.google.gson.stream.JsonToken
            java.lang.String r1 = "BEGIN_OBJECT"
            r2 = 2
            r0.<init>(r1, r2)
            com.google.gson.stream.JsonToken.BEGIN_OBJECT = r0
            com.google.gson.stream.JsonToken r0 = new com.google.gson.stream.JsonToken
            java.lang.String r1 = "END_OBJECT"
            r2 = 3
            r0.<init>(r1, r2)
            com.google.gson.stream.JsonToken.END_OBJECT = r0
            com.google.gson.stream.JsonToken r0 = new com.google.gson.stream.JsonToken
            java.lang.String r1 = "NAME"
            r2 = 4
            r0.<init>(r1, r2)
            com.google.gson.stream.JsonToken.NAME = r0
            com.google.gson.stream.JsonToken r0 = new com.google.gson.stream.JsonToken
            java.lang.String r1 = "STRING"
            r2 = 5
            r0.<init>(r1, r2)
            com.google.gson.stream.JsonToken.STRING = r0
            com.google.gson.stream.JsonToken r0 = new com.google.gson.stream.JsonToken
            java.lang.String r1 = "NUMBER"
            r2 = 6
            r0.<init>(r1, r2)
            com.google.gson.stream.JsonToken.NUMBER = r0
            com.google.gson.stream.JsonToken r0 = new com.google.gson.stream.JsonToken
            java.lang.String r1 = "BOOLEAN"
            r2 = 7
            r0.<init>(r1, r2)
            com.google.gson.stream.JsonToken.BOOLEAN = r0
            com.google.gson.stream.JsonToken r0 = new com.google.gson.stream.JsonToken
            java.lang.String r1 = "NULL"
            r2 = 8
            r0.<init>(r1, r2)
            com.google.gson.stream.JsonToken.NULL = r0
            com.google.gson.stream.JsonToken r0 = new com.google.gson.stream.JsonToken
            java.lang.String r1 = "END_DOCUMENT"
            r2 = 9
            r0.<init>(r1, r2)
            com.google.gson.stream.JsonToken.END_DOCUMENT = r0
            com.google.gson.stream.JsonToken r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY
            com.google.gson.stream.JsonToken r4 = com.google.gson.stream.JsonToken.END_ARRAY
            com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.BEGIN_OBJECT
            com.google.gson.stream.JsonToken r6 = com.google.gson.stream.JsonToken.END_OBJECT
            com.google.gson.stream.JsonToken r7 = com.google.gson.stream.JsonToken.NAME
            com.google.gson.stream.JsonToken r8 = com.google.gson.stream.JsonToken.STRING
            com.google.gson.stream.JsonToken r9 = com.google.gson.stream.JsonToken.NUMBER
            com.google.gson.stream.JsonToken r10 = com.google.gson.stream.JsonToken.BOOLEAN
            com.google.gson.stream.JsonToken r11 = com.google.gson.stream.JsonToken.NULL
            com.google.gson.stream.JsonToken r12 = com.google.gson.stream.JsonToken.END_DOCUMENT
            com.google.gson.stream.JsonToken[] r0 = new com.google.gson.stream.JsonToken[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12}
            com.google.gson.stream.JsonToken.$VALUES = r0
            return
    }

    JsonToken(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.gson.stream.JsonToken valueOf(java.lang.String r1) {
            java.lang.Class<com.google.gson.stream.JsonToken> r0 = com.google.gson.stream.JsonToken.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.google.gson.stream.JsonToken r0 = (com.google.gson.stream.JsonToken) r0
            return r0
    }

    public static com.google.gson.stream.JsonToken[] values() {
            com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.gson.stream.JsonToken[] r0 = (com.google.gson.stream.JsonToken[]) r0
            return r0
    }
}
