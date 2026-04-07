package com.google.gson;

/* JADX INFO: loaded from: classes.dex */
public enum ToNumberPolicy extends java.lang.Enum<com.google.gson.ToNumberPolicy> implements com.google.gson.ToNumberStrategy {
    private static final /* synthetic */ com.google.gson.ToNumberPolicy[] $VALUES = null;
    public static final com.google.gson.ToNumberPolicy BIG_DECIMAL = null;
    public static final com.google.gson.ToNumberPolicy DOUBLE = null;
    public static final com.google.gson.ToNumberPolicy LAZILY_PARSED_NUMBER = null;
    public static final com.google.gson.ToNumberPolicy LONG_OR_DOUBLE = null;





    static {
            com.google.gson.ToNumberPolicy$1 r0 = new com.google.gson.ToNumberPolicy$1
            java.lang.String r1 = "DOUBLE"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.gson.ToNumberPolicy.DOUBLE = r0
            com.google.gson.ToNumberPolicy$2 r0 = new com.google.gson.ToNumberPolicy$2
            java.lang.String r1 = "LAZILY_PARSED_NUMBER"
            r2 = 1
            r0.<init>(r1, r2)
            com.google.gson.ToNumberPolicy.LAZILY_PARSED_NUMBER = r0
            com.google.gson.ToNumberPolicy$3 r0 = new com.google.gson.ToNumberPolicy$3
            java.lang.String r1 = "LONG_OR_DOUBLE"
            r2 = 2
            r0.<init>(r1, r2)
            com.google.gson.ToNumberPolicy.LONG_OR_DOUBLE = r0
            com.google.gson.ToNumberPolicy$4 r0 = new com.google.gson.ToNumberPolicy$4
            java.lang.String r1 = "BIG_DECIMAL"
            r2 = 3
            r0.<init>(r1, r2)
            com.google.gson.ToNumberPolicy.BIG_DECIMAL = r0
            com.google.gson.ToNumberPolicy r0 = com.google.gson.ToNumberPolicy.DOUBLE
            com.google.gson.ToNumberPolicy r1 = com.google.gson.ToNumberPolicy.LAZILY_PARSED_NUMBER
            com.google.gson.ToNumberPolicy r2 = com.google.gson.ToNumberPolicy.LONG_OR_DOUBLE
            com.google.gson.ToNumberPolicy r3 = com.google.gson.ToNumberPolicy.BIG_DECIMAL
            com.google.gson.ToNumberPolicy[] r0 = new com.google.gson.ToNumberPolicy[]{r0, r1, r2, r3}
            com.google.gson.ToNumberPolicy.$VALUES = r0
            return
    }

    ToNumberPolicy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* synthetic */ ToNumberPolicy(java.lang.String r1, int r2, com.google.gson.ToNumberPolicy.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.gson.ToNumberPolicy valueOf(java.lang.String r1) {
            java.lang.Class<com.google.gson.ToNumberPolicy> r0 = com.google.gson.ToNumberPolicy.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.google.gson.ToNumberPolicy r0 = (com.google.gson.ToNumberPolicy) r0
            return r0
    }

    public static com.google.gson.ToNumberPolicy[] values() {
            com.google.gson.ToNumberPolicy[] r0 = com.google.gson.ToNumberPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.gson.ToNumberPolicy[] r0 = (com.google.gson.ToNumberPolicy[]) r0
            return r0
    }
}
