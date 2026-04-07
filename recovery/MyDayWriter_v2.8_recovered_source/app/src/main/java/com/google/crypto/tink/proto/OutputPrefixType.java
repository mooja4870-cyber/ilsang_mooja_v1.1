package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public enum OutputPrefixType extends java.lang.Enum<com.google.crypto.tink.proto.OutputPrefixType> implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    private static final /* synthetic */ com.google.crypto.tink.proto.OutputPrefixType[] $VALUES = null;
    public static final com.google.crypto.tink.proto.OutputPrefixType CRUNCHY = null;
    public static final int CRUNCHY_VALUE = 4;
    public static final com.google.crypto.tink.proto.OutputPrefixType LEGACY = null;
    public static final int LEGACY_VALUE = 2;
    public static final com.google.crypto.tink.proto.OutputPrefixType RAW = null;
    public static final int RAW_VALUE = 3;
    public static final com.google.crypto.tink.proto.OutputPrefixType TINK = null;
    public static final int TINK_VALUE = 1;
    public static final com.google.crypto.tink.proto.OutputPrefixType UNKNOWN_PREFIX = null;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    public static final com.google.crypto.tink.proto.OutputPrefixType UNRECOGNIZED = null;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.OutputPrefixType> internalValueMap = null;
    private final int value;


    private static final class OutputPrefixTypeVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = null;

        static {
                com.google.crypto.tink.proto.OutputPrefixType$OutputPrefixTypeVerifier r0 = new com.google.crypto.tink.proto.OutputPrefixType$OutputPrefixTypeVerifier
                r0.<init>()
                com.google.crypto.tink.proto.OutputPrefixType.OutputPrefixTypeVerifier.INSTANCE = r0
                return
        }

        private OutputPrefixTypeVerifier() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r2) {
                r1 = this;
                com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.forNumber(r2)
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
            com.google.crypto.tink.proto.OutputPrefixType r0 = new com.google.crypto.tink.proto.OutputPrefixType
            java.lang.String r1 = "UNKNOWN_PREFIX"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.OutputPrefixType.UNKNOWN_PREFIX = r0
            com.google.crypto.tink.proto.OutputPrefixType r0 = new com.google.crypto.tink.proto.OutputPrefixType
            java.lang.String r1 = "TINK"
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.OutputPrefixType.TINK = r0
            com.google.crypto.tink.proto.OutputPrefixType r0 = new com.google.crypto.tink.proto.OutputPrefixType
            java.lang.String r1 = "LEGACY"
            r2 = 2
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.OutputPrefixType.LEGACY = r0
            com.google.crypto.tink.proto.OutputPrefixType r0 = new com.google.crypto.tink.proto.OutputPrefixType
            java.lang.String r1 = "RAW"
            r2 = 3
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.OutputPrefixType.RAW = r0
            com.google.crypto.tink.proto.OutputPrefixType r0 = new com.google.crypto.tink.proto.OutputPrefixType
            java.lang.String r1 = "CRUNCHY"
            r2 = 4
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY = r0
            com.google.crypto.tink.proto.OutputPrefixType r0 = new com.google.crypto.tink.proto.OutputPrefixType
            r1 = 5
            r2 = -1
            java.lang.String r3 = "UNRECOGNIZED"
            r0.<init>(r3, r1, r2)
            com.google.crypto.tink.proto.OutputPrefixType.UNRECOGNIZED = r0
            com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.UNKNOWN_PREFIX
            com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            com.google.crypto.tink.proto.OutputPrefixType r6 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY
            com.google.crypto.tink.proto.OutputPrefixType r7 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            com.google.crypto.tink.proto.OutputPrefixType r8 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY
            com.google.crypto.tink.proto.OutputPrefixType r9 = com.google.crypto.tink.proto.OutputPrefixType.UNRECOGNIZED
            com.google.crypto.tink.proto.OutputPrefixType[] r0 = new com.google.crypto.tink.proto.OutputPrefixType[]{r4, r5, r6, r7, r8, r9}
            com.google.crypto.tink.proto.OutputPrefixType.$VALUES = r0
            com.google.crypto.tink.proto.OutputPrefixType$1 r0 = new com.google.crypto.tink.proto.OutputPrefixType$1
            r0.<init>()
            com.google.crypto.tink.proto.OutputPrefixType.internalValueMap = r0
            return
    }

    OutputPrefixType(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.google.crypto.tink.proto.OutputPrefixType forNumber(int r1) {
            switch(r1) {
                case 0: goto L11;
                case 1: goto Le;
                case 2: goto Lb;
                case 3: goto L8;
                case 4: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY
            return r0
        L8:
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            return r0
        Lb:
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY
            return r0
        Le:
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            return r0
        L11:
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.UNKNOWN_PREFIX
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.OutputPrefixType> internalGetValueMap() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<com.google.crypto.tink.proto.OutputPrefixType> r0 = com.google.crypto.tink.proto.OutputPrefixType.internalValueMap
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = com.google.crypto.tink.proto.OutputPrefixType.OutputPrefixTypeVerifier.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.OutputPrefixType valueOf(int r1) {
            com.google.crypto.tink.proto.OutputPrefixType r0 = forNumber(r1)
            return r0
    }

    public static com.google.crypto.tink.proto.OutputPrefixType valueOf(java.lang.String r1) {
            java.lang.Class<com.google.crypto.tink.proto.OutputPrefixType> r0 = com.google.crypto.tink.proto.OutputPrefixType.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.google.crypto.tink.proto.OutputPrefixType r0 = (com.google.crypto.tink.proto.OutputPrefixType) r0
            return r0
    }

    public static com.google.crypto.tink.proto.OutputPrefixType[] values() {
            com.google.crypto.tink.proto.OutputPrefixType[] r0 = com.google.crypto.tink.proto.OutputPrefixType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.crypto.tink.proto.OutputPrefixType[] r0 = (com.google.crypto.tink.proto.OutputPrefixType[]) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
            r2 = this;
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.UNRECOGNIZED
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
