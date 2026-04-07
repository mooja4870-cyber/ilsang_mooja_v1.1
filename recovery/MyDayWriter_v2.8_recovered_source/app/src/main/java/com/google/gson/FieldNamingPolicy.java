package com.google.gson;

/* JADX INFO: loaded from: classes.dex */
public enum FieldNamingPolicy extends java.lang.Enum<com.google.gson.FieldNamingPolicy> implements com.google.gson.FieldNamingStrategy {
    private static final /* synthetic */ com.google.gson.FieldNamingPolicy[] $VALUES = null;
    public static final com.google.gson.FieldNamingPolicy IDENTITY = null;
    public static final com.google.gson.FieldNamingPolicy LOWER_CASE_WITH_DASHES = null;
    public static final com.google.gson.FieldNamingPolicy LOWER_CASE_WITH_DOTS = null;
    public static final com.google.gson.FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES = null;
    public static final com.google.gson.FieldNamingPolicy UPPER_CAMEL_CASE = null;
    public static final com.google.gson.FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES = null;







    static {
            com.google.gson.FieldNamingPolicy$1 r0 = new com.google.gson.FieldNamingPolicy$1
            java.lang.String r1 = "IDENTITY"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.gson.FieldNamingPolicy.IDENTITY = r0
            com.google.gson.FieldNamingPolicy$2 r0 = new com.google.gson.FieldNamingPolicy$2
            java.lang.String r1 = "UPPER_CAMEL_CASE"
            r2 = 1
            r0.<init>(r1, r2)
            com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE = r0
            com.google.gson.FieldNamingPolicy$3 r0 = new com.google.gson.FieldNamingPolicy$3
            java.lang.String r1 = "UPPER_CAMEL_CASE_WITH_SPACES"
            r2 = 2
            r0.<init>(r1, r2)
            com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES = r0
            com.google.gson.FieldNamingPolicy$4 r0 = new com.google.gson.FieldNamingPolicy$4
            java.lang.String r1 = "LOWER_CASE_WITH_UNDERSCORES"
            r2 = 3
            r0.<init>(r1, r2)
            com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES = r0
            com.google.gson.FieldNamingPolicy$5 r0 = new com.google.gson.FieldNamingPolicy$5
            java.lang.String r1 = "LOWER_CASE_WITH_DASHES"
            r2 = 4
            r0.<init>(r1, r2)
            com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_DASHES = r0
            com.google.gson.FieldNamingPolicy$6 r0 = new com.google.gson.FieldNamingPolicy$6
            java.lang.String r1 = "LOWER_CASE_WITH_DOTS"
            r2 = 5
            r0.<init>(r1, r2)
            com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_DOTS = r0
            com.google.gson.FieldNamingPolicy r3 = com.google.gson.FieldNamingPolicy.IDENTITY
            com.google.gson.FieldNamingPolicy r4 = com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE
            com.google.gson.FieldNamingPolicy r5 = com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES
            com.google.gson.FieldNamingPolicy r6 = com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES
            com.google.gson.FieldNamingPolicy r7 = com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_DASHES
            com.google.gson.FieldNamingPolicy r8 = com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_DOTS
            com.google.gson.FieldNamingPolicy[] r0 = new com.google.gson.FieldNamingPolicy[]{r3, r4, r5, r6, r7, r8}
            com.google.gson.FieldNamingPolicy.$VALUES = r0
            return
    }

    FieldNamingPolicy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* synthetic */ FieldNamingPolicy(java.lang.String r1, int r2, com.google.gson.FieldNamingPolicy.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static java.lang.String separateCamelCase(java.lang.String r5, java.lang.String r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            int r2 = r5.length()
        La:
            if (r1 >= r2) goto L25
            char r3 = r5.charAt(r1)
            boolean r4 = java.lang.Character.isUpperCase(r3)
            if (r4 == 0) goto L1f
            int r4 = r0.length()
            if (r4 == 0) goto L1f
            r0.append(r6)
        L1f:
            r0.append(r3)
            int r1 = r1 + 1
            goto La
        L25:
            java.lang.String r1 = r0.toString()
            return r1
    }

    static java.lang.String upperCaseFirstLetter(java.lang.String r6) {
            r0 = 0
            int r1 = r6.length()
            r2 = 1
            int r1 = r1 - r2
        L7:
            char r3 = r6.charAt(r0)
            boolean r3 = java.lang.Character.isLetter(r3)
            if (r3 != 0) goto L16
            if (r0 >= r1) goto L16
            int r0 = r0 + 1
            goto L7
        L16:
            char r3 = r6.charAt(r0)
            boolean r4 = java.lang.Character.isUpperCase(r3)
            if (r4 == 0) goto L21
            return r6
        L21:
            char r4 = java.lang.Character.toUpperCase(r3)
            if (r0 != 0) goto L3d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.String r2 = r6.substring(r2)
            java.lang.StringBuilder r2 = r5.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
        L3d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = 0
            java.lang.String r5 = r6.substring(r5, r0)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.StringBuilder r2 = r2.append(r4)
            int r5 = r0 + 1
            java.lang.String r5 = r6.substring(r5)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static com.google.gson.FieldNamingPolicy valueOf(java.lang.String r1) {
            java.lang.Class<com.google.gson.FieldNamingPolicy> r0 = com.google.gson.FieldNamingPolicy.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.google.gson.FieldNamingPolicy r0 = (com.google.gson.FieldNamingPolicy) r0
            return r0
    }

    public static com.google.gson.FieldNamingPolicy[] values() {
            com.google.gson.FieldNamingPolicy[] r0 = com.google.gson.FieldNamingPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.gson.FieldNamingPolicy[] r0 = (com.google.gson.FieldNamingPolicy[]) r0
            return r0
    }
}
