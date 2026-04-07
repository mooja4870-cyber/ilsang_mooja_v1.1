package com.google.gson;

/* JADX INFO: loaded from: classes.dex */
public enum LongSerializationPolicy extends java.lang.Enum<com.google.gson.LongSerializationPolicy> {
    private static final /* synthetic */ com.google.gson.LongSerializationPolicy[] $VALUES = null;
    public static final com.google.gson.LongSerializationPolicy DEFAULT = null;
    public static final com.google.gson.LongSerializationPolicy STRING = null;



    static {
            com.google.gson.LongSerializationPolicy$1 r0 = new com.google.gson.LongSerializationPolicy$1
            java.lang.String r1 = "DEFAULT"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.gson.LongSerializationPolicy.DEFAULT = r0
            com.google.gson.LongSerializationPolicy$2 r0 = new com.google.gson.LongSerializationPolicy$2
            java.lang.String r1 = "STRING"
            r2 = 1
            r0.<init>(r1, r2)
            com.google.gson.LongSerializationPolicy.STRING = r0
            com.google.gson.LongSerializationPolicy r0 = com.google.gson.LongSerializationPolicy.DEFAULT
            com.google.gson.LongSerializationPolicy r1 = com.google.gson.LongSerializationPolicy.STRING
            com.google.gson.LongSerializationPolicy[] r0 = new com.google.gson.LongSerializationPolicy[]{r0, r1}
            com.google.gson.LongSerializationPolicy.$VALUES = r0
            return
    }

    LongSerializationPolicy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* synthetic */ LongSerializationPolicy(java.lang.String r1, int r2, com.google.gson.LongSerializationPolicy.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.gson.LongSerializationPolicy valueOf(java.lang.String r1) {
            java.lang.Class<com.google.gson.LongSerializationPolicy> r0 = com.google.gson.LongSerializationPolicy.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.google.gson.LongSerializationPolicy r0 = (com.google.gson.LongSerializationPolicy) r0
            return r0
    }

    public static com.google.gson.LongSerializationPolicy[] values() {
            com.google.gson.LongSerializationPolicy[] r0 = com.google.gson.LongSerializationPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.gson.LongSerializationPolicy[] r0 = (com.google.gson.LongSerializationPolicy[]) r0
            return r0
    }

    public abstract com.google.gson.JsonElement serialize(java.lang.Long r1);
}
