package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public enum KeyStatusType extends java.lang.Enum<com.google.crypto.tink.proto.KeyStatusType> implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    private static final /* synthetic */ com.google.crypto.tink.proto.KeyStatusType[] $VALUES = null;
    public static final com.google.crypto.tink.proto.KeyStatusType DESTROYED = null;
    public static final int DESTROYED_VALUE = 3;
    public static final com.google.crypto.tink.proto.KeyStatusType DISABLED = null;
    public static final int DISABLED_VALUE = 2;
    public static final com.google.crypto.tink.proto.KeyStatusType ENABLED = null;
    public static final int ENABLED_VALUE = 1;
    public static final com.google.crypto.tink.proto.KeyStatusType UNKNOWN_STATUS = null;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    public static final com.google.crypto.tink.proto.KeyStatusType UNRECOGNIZED = null;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.KeyStatusType> internalValueMap = null;
    private final int value;


    private static final class KeyStatusTypeVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = null;

        static {
                com.google.crypto.tink.proto.KeyStatusType$KeyStatusTypeVerifier r0 = new com.google.crypto.tink.proto.KeyStatusType$KeyStatusTypeVerifier
                r0.<init>()
                com.google.crypto.tink.proto.KeyStatusType.KeyStatusTypeVerifier.INSTANCE = r0
                return
        }

        private KeyStatusTypeVerifier() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r2) {
                r1 = this;
                com.google.crypto.tink.proto.KeyStatusType r0 = com.google.crypto.tink.proto.KeyStatusType.forNumber(r2)
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
            com.google.crypto.tink.proto.KeyStatusType r0 = new com.google.crypto.tink.proto.KeyStatusType
            java.lang.String r1 = "UNKNOWN_STATUS"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.KeyStatusType.UNKNOWN_STATUS = r0
            com.google.crypto.tink.proto.KeyStatusType r0 = new com.google.crypto.tink.proto.KeyStatusType
            java.lang.String r1 = "ENABLED"
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.KeyStatusType.ENABLED = r0
            com.google.crypto.tink.proto.KeyStatusType r0 = new com.google.crypto.tink.proto.KeyStatusType
            java.lang.String r1 = "DISABLED"
            r2 = 2
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.KeyStatusType.DISABLED = r0
            com.google.crypto.tink.proto.KeyStatusType r0 = new com.google.crypto.tink.proto.KeyStatusType
            java.lang.String r1 = "DESTROYED"
            r2 = 3
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.KeyStatusType.DESTROYED = r0
            com.google.crypto.tink.proto.KeyStatusType r0 = new com.google.crypto.tink.proto.KeyStatusType
            r1 = 4
            r2 = -1
            java.lang.String r3 = "UNRECOGNIZED"
            r0.<init>(r3, r1, r2)
            com.google.crypto.tink.proto.KeyStatusType.UNRECOGNIZED = r0
            com.google.crypto.tink.proto.KeyStatusType r0 = com.google.crypto.tink.proto.KeyStatusType.UNKNOWN_STATUS
            com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.ENABLED
            com.google.crypto.tink.proto.KeyStatusType r2 = com.google.crypto.tink.proto.KeyStatusType.DISABLED
            com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.proto.KeyStatusType.DESTROYED
            com.google.crypto.tink.proto.KeyStatusType r4 = com.google.crypto.tink.proto.KeyStatusType.UNRECOGNIZED
            com.google.crypto.tink.proto.KeyStatusType[] r0 = new com.google.crypto.tink.proto.KeyStatusType[]{r0, r1, r2, r3, r4}
            com.google.crypto.tink.proto.KeyStatusType.$VALUES = r0
            com.google.crypto.tink.proto.KeyStatusType$1 r0 = new com.google.crypto.tink.proto.KeyStatusType$1
            r0.<init>()
            com.google.crypto.tink.proto.KeyStatusType.internalValueMap = r0
            return
    }

    KeyStatusType(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.google.crypto.tink.proto.KeyStatusType forNumber(int r1) {
            switch(r1) {
                case 0: goto Le;
                case 1: goto Lb;
                case 2: goto L8;
                case 3: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            com.google.crypto.tink.proto.KeyStatusType r0 = com.google.crypto.tink.proto.KeyStatusType.DESTROYED
            return r0
        L8:
            com.google.crypto.tink.proto.KeyStatusType r0 = com.google.crypto.tink.proto.KeyStatusType.DISABLED
            return r0
        Lb:
            com.google.crypto.tink.proto.KeyStatusType r0 = com.google.crypto.tink.proto.KeyStatusType.ENABLED
            return r0
        Le:
            com.google.crypto.tink.proto.KeyStatusType r0 = com.google.crypto.tink.proto.KeyStatusType.UNKNOWN_STATUS
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.KeyStatusType> internalGetValueMap() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<com.google.crypto.tink.proto.KeyStatusType> r0 = com.google.crypto.tink.proto.KeyStatusType.internalValueMap
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = com.google.crypto.tink.proto.KeyStatusType.KeyStatusTypeVerifier.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.KeyStatusType valueOf(int r1) {
            com.google.crypto.tink.proto.KeyStatusType r0 = forNumber(r1)
            return r0
    }

    public static com.google.crypto.tink.proto.KeyStatusType valueOf(java.lang.String r1) {
            java.lang.Class<com.google.crypto.tink.proto.KeyStatusType> r0 = com.google.crypto.tink.proto.KeyStatusType.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.google.crypto.tink.proto.KeyStatusType r0 = (com.google.crypto.tink.proto.KeyStatusType) r0
            return r0
    }

    public static com.google.crypto.tink.proto.KeyStatusType[] values() {
            com.google.crypto.tink.proto.KeyStatusType[] r0 = com.google.crypto.tink.proto.KeyStatusType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.crypto.tink.proto.KeyStatusType[] r0 = (com.google.crypto.tink.proto.KeyStatusType[]) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
            r2 = this;
            com.google.crypto.tink.proto.KeyStatusType r0 = com.google.crypto.tink.proto.KeyStatusType.UNRECOGNIZED
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
