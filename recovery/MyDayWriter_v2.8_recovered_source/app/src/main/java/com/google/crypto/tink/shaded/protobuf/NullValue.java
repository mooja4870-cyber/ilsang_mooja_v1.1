package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum NullValue extends java.lang.Enum<com.google.crypto.tink.shaded.protobuf.NullValue> implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    private static final /* synthetic */ com.google.crypto.tink.shaded.protobuf.NullValue[] $VALUES = null;
    public static final com.google.crypto.tink.shaded.protobuf.NullValue NULL_VALUE = null;
    public static final int NULL_VALUE_VALUE = 0;
    public static final com.google.crypto.tink.shaded.protobuf.NullValue UNRECOGNIZED = null;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.shaded.protobuf.NullValue> internalValueMap = null;
    private final int value;


    private static final class NullValueVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = null;

        static {
                com.google.crypto.tink.shaded.protobuf.NullValue$NullValueVerifier r0 = new com.google.crypto.tink.shaded.protobuf.NullValue$NullValueVerifier
                r0.<init>()
                com.google.crypto.tink.shaded.protobuf.NullValue.NullValueVerifier.INSTANCE = r0
                return
        }

        private NullValueVerifier() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r2) {
                r1 = this;
                com.google.crypto.tink.shaded.protobuf.NullValue r0 = com.google.crypto.tink.shaded.protobuf.NullValue.forNumber(r2)
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }
    }

    static {
            com.google.crypto.tink.shaded.protobuf.NullValue r0 = new com.google.crypto.tink.shaded.protobuf.NullValue
            java.lang.String r1 = "NULL_VALUE"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.shaded.protobuf.NullValue.NULL_VALUE = r0
            com.google.crypto.tink.shaded.protobuf.NullValue r0 = new com.google.crypto.tink.shaded.protobuf.NullValue
            r1 = 1
            r2 = -1
            java.lang.String r3 = "UNRECOGNIZED"
            r0.<init>(r3, r1, r2)
            com.google.crypto.tink.shaded.protobuf.NullValue.UNRECOGNIZED = r0
            com.google.crypto.tink.shaded.protobuf.NullValue r0 = com.google.crypto.tink.shaded.protobuf.NullValue.NULL_VALUE
            com.google.crypto.tink.shaded.protobuf.NullValue r1 = com.google.crypto.tink.shaded.protobuf.NullValue.UNRECOGNIZED
            com.google.crypto.tink.shaded.protobuf.NullValue[] r0 = new com.google.crypto.tink.shaded.protobuf.NullValue[]{r0, r1}
            com.google.crypto.tink.shaded.protobuf.NullValue.$VALUES = r0
            com.google.crypto.tink.shaded.protobuf.NullValue$1 r0 = new com.google.crypto.tink.shaded.protobuf.NullValue$1
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.NullValue.internalValueMap = r0
            return
    }

    NullValue(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.NullValue forNumber(int r1) {
            switch(r1) {
                case 0: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            com.google.crypto.tink.shaded.protobuf.NullValue r0 = com.google.crypto.tink.shaded.protobuf.NullValue.NULL_VALUE
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.shaded.protobuf.NullValue> internalGetValueMap() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<com.google.crypto.tink.shaded.protobuf.NullValue> r0 = com.google.crypto.tink.shaded.protobuf.NullValue.internalValueMap
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = com.google.crypto.tink.shaded.protobuf.NullValue.NullValueVerifier.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.shaded.protobuf.NullValue valueOf(int r1) {
            com.google.crypto.tink.shaded.protobuf.NullValue r0 = forNumber(r1)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.NullValue valueOf(java.lang.String r1) {
            java.lang.Class<com.google.crypto.tink.shaded.protobuf.NullValue> r0 = com.google.crypto.tink.shaded.protobuf.NullValue.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.google.crypto.tink.shaded.protobuf.NullValue r0 = (com.google.crypto.tink.shaded.protobuf.NullValue) r0
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.NullValue[] values() {
            com.google.crypto.tink.shaded.protobuf.NullValue[] r0 = com.google.crypto.tink.shaded.protobuf.NullValue.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.crypto.tink.shaded.protobuf.NullValue[] r0 = (com.google.crypto.tink.shaded.protobuf.NullValue[]) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.NullValue r0 = com.google.crypto.tink.shaded.protobuf.NullValue.UNRECOGNIZED
            if (r2 == r0) goto L7
            int r0 = r2.value
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can't get the number of an unknown enum value."
            r0.<init>(r1)
            throw r0
    }
}
