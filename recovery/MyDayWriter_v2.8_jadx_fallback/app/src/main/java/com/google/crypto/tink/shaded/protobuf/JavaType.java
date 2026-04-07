package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum JavaType extends java.lang.Enum<com.google.crypto.tink.shaded.protobuf.JavaType> {
    private static final /* synthetic */ com.google.crypto.tink.shaded.protobuf.JavaType[] $VALUES = null;
    public static final com.google.crypto.tink.shaded.protobuf.JavaType BOOLEAN = null;
    public static final com.google.crypto.tink.shaded.protobuf.JavaType BYTE_STRING = null;
    public static final com.google.crypto.tink.shaded.protobuf.JavaType DOUBLE = null;
    public static final com.google.crypto.tink.shaded.protobuf.JavaType ENUM = null;
    public static final com.google.crypto.tink.shaded.protobuf.JavaType FLOAT = null;
    public static final com.google.crypto.tink.shaded.protobuf.JavaType INT = null;
    public static final com.google.crypto.tink.shaded.protobuf.JavaType LONG = null;
    public static final com.google.crypto.tink.shaded.protobuf.JavaType MESSAGE = null;
    public static final com.google.crypto.tink.shaded.protobuf.JavaType STRING = null;
    public static final com.google.crypto.tink.shaded.protobuf.JavaType VOID = null;
    private final java.lang.Class<?> boxedType;
    private final java.lang.Object defaultDefault;
    private final java.lang.Class<?> type;

    static {
            com.google.crypto.tink.shaded.protobuf.JavaType r0 = new com.google.crypto.tink.shaded.protobuf.JavaType
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            java.lang.Class<java.lang.Void> r4 = java.lang.Void.class
            r5 = 0
            java.lang.String r1 = "VOID"
            r2 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.crypto.tink.shaded.protobuf.JavaType.VOID = r0
            com.google.crypto.tink.shaded.protobuf.JavaType r1 = new com.google.crypto.tink.shaded.protobuf.JavaType
            java.lang.Class r4 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
            r0 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "INT"
            r3 = 1
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.crypto.tink.shaded.protobuf.JavaType.INT = r1
            com.google.crypto.tink.shaded.protobuf.JavaType r2 = new com.google.crypto.tink.shaded.protobuf.JavaType
            java.lang.Class r5 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            r3 = 0
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "LONG"
            r4 = 2
            r2.<init>(r3, r4, r5, r6, r7)
            com.google.crypto.tink.shaded.protobuf.JavaType.LONG = r2
            com.google.crypto.tink.shaded.protobuf.JavaType r3 = new com.google.crypto.tink.shaded.protobuf.JavaType
            java.lang.Class r6 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r7 = java.lang.Float.class
            r1 = 0
            java.lang.Float r8 = java.lang.Float.valueOf(r1)
            java.lang.String r4 = "FLOAT"
            r5 = 3
            r3.<init>(r4, r5, r6, r7, r8)
            com.google.crypto.tink.shaded.protobuf.JavaType.FLOAT = r3
            com.google.crypto.tink.shaded.protobuf.JavaType r4 = new com.google.crypto.tink.shaded.protobuf.JavaType
            java.lang.Class r7 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r8 = java.lang.Double.class
            r1 = 0
            java.lang.Double r9 = java.lang.Double.valueOf(r1)
            java.lang.String r5 = "DOUBLE"
            r6 = 4
            r4.<init>(r5, r6, r7, r8, r9)
            com.google.crypto.tink.shaded.protobuf.JavaType.DOUBLE = r4
            com.google.crypto.tink.shaded.protobuf.JavaType r5 = new com.google.crypto.tink.shaded.protobuf.JavaType
            java.lang.Class r8 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r9 = java.lang.Boolean.class
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            java.lang.String r6 = "BOOLEAN"
            r7 = 5
            r5.<init>(r6, r7, r8, r9, r10)
            com.google.crypto.tink.shaded.protobuf.JavaType.BOOLEAN = r5
            com.google.crypto.tink.shaded.protobuf.JavaType r6 = new com.google.crypto.tink.shaded.protobuf.JavaType
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.String r11 = ""
            java.lang.String r7 = "STRING"
            r8 = 6
            r6.<init>(r7, r8, r9, r10, r11)
            com.google.crypto.tink.shaded.protobuf.JavaType.STRING = r6
            com.google.crypto.tink.shaded.protobuf.JavaType r0 = new com.google.crypto.tink.shaded.protobuf.JavaType
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.ByteString> r3 = com.google.crypto.tink.shaded.protobuf.ByteString.class
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.ByteString> r4 = com.google.crypto.tink.shaded.protobuf.ByteString.class
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            java.lang.String r1 = "BYTE_STRING"
            r2 = 7
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.crypto.tink.shaded.protobuf.JavaType.BYTE_STRING = r0
            com.google.crypto.tink.shaded.protobuf.JavaType r1 = new com.google.crypto.tink.shaded.protobuf.JavaType
            java.lang.Class r4 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
            r6 = 0
            java.lang.String r2 = "ENUM"
            r3 = 8
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.crypto.tink.shaded.protobuf.JavaType.ENUM = r1
            com.google.crypto.tink.shaded.protobuf.JavaType r2 = new com.google.crypto.tink.shaded.protobuf.JavaType
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r7 = 0
            java.lang.String r3 = "MESSAGE"
            r4 = 9
            r2.<init>(r3, r4, r5, r6, r7)
            com.google.crypto.tink.shaded.protobuf.JavaType.MESSAGE = r2
            com.google.crypto.tink.shaded.protobuf.JavaType r3 = com.google.crypto.tink.shaded.protobuf.JavaType.VOID
            com.google.crypto.tink.shaded.protobuf.JavaType r4 = com.google.crypto.tink.shaded.protobuf.JavaType.INT
            com.google.crypto.tink.shaded.protobuf.JavaType r5 = com.google.crypto.tink.shaded.protobuf.JavaType.LONG
            com.google.crypto.tink.shaded.protobuf.JavaType r6 = com.google.crypto.tink.shaded.protobuf.JavaType.FLOAT
            com.google.crypto.tink.shaded.protobuf.JavaType r7 = com.google.crypto.tink.shaded.protobuf.JavaType.DOUBLE
            com.google.crypto.tink.shaded.protobuf.JavaType r8 = com.google.crypto.tink.shaded.protobuf.JavaType.BOOLEAN
            com.google.crypto.tink.shaded.protobuf.JavaType r9 = com.google.crypto.tink.shaded.protobuf.JavaType.STRING
            com.google.crypto.tink.shaded.protobuf.JavaType r10 = com.google.crypto.tink.shaded.protobuf.JavaType.BYTE_STRING
            com.google.crypto.tink.shaded.protobuf.JavaType r11 = com.google.crypto.tink.shaded.protobuf.JavaType.ENUM
            com.google.crypto.tink.shaded.protobuf.JavaType r12 = com.google.crypto.tink.shaded.protobuf.JavaType.MESSAGE
            com.google.crypto.tink.shaded.protobuf.JavaType[] r0 = new com.google.crypto.tink.shaded.protobuf.JavaType[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12}
            com.google.crypto.tink.shaded.protobuf.JavaType.$VALUES = r0
            return
    }

    JavaType(java.lang.String r1, int r2, java.lang.Class r3, java.lang.Class r4, java.lang.Object r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.type = r3
            r0.boxedType = r4
            r0.defaultDefault = r5
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.JavaType valueOf(java.lang.String r1) {
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.JavaType> r0 = com.google.crypto.tink.shaded.protobuf.JavaType.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.google.crypto.tink.shaded.protobuf.JavaType r0 = (com.google.crypto.tink.shaded.protobuf.JavaType) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.JavaType[] values() {
            com.google.crypto.tink.shaded.protobuf.JavaType[] r0 = com.google.crypto.tink.shaded.protobuf.JavaType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.crypto.tink.shaded.protobuf.JavaType[] r0 = (com.google.crypto.tink.shaded.protobuf.JavaType[]) r0
            return r0
    }

    public java.lang.Class<?> getBoxedType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.boxedType
            return r0
    }

    public java.lang.Object getDefaultDefault() {
            r1 = this;
            java.lang.Object r0 = r1.defaultDefault
            return r0
    }

    public java.lang.Class<?> getType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.type
            return r0
    }

    public boolean isValidType(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class<?> r0 = r1.type
            boolean r0 = r0.isAssignableFrom(r2)
            return r0
    }
}
