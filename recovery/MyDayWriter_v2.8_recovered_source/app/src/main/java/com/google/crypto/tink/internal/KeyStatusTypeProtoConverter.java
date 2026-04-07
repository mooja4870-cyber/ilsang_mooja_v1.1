package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes.dex */
public final class KeyStatusTypeProtoConverter {

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.KeyStatusTypeProtoConverter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyStatusType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType = null;

        static {
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType[] r0 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType = r0
                r0 = 1
                int[] r1 = com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r2 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.ENABLED     // Catch: java.lang.NoSuchFieldError -> L15
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r1 = move-exception
            L16:
                r1 = 2
                int[] r2 = com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r3 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.DISABLED     // Catch: java.lang.NoSuchFieldError -> L22
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r2 = move-exception
            L23:
                r2 = 3
                int[] r3 = com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r4 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.DESTROYED     // Catch: java.lang.NoSuchFieldError -> L2f
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r3 = move-exception
            L30:
                com.google.crypto.tink.proto.KeyStatusType[] r3 = com.google.crypto.tink.proto.KeyStatusType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType = r3
                int[] r3 = com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType     // Catch: java.lang.NoSuchFieldError -> L44
                com.google.crypto.tink.proto.KeyStatusType r4 = com.google.crypto.tink.proto.KeyStatusType.ENABLED     // Catch: java.lang.NoSuchFieldError -> L44
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r3[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L44
                goto L45
            L44:
                r0 = move-exception
            L45:
                int[] r0 = com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType     // Catch: java.lang.NoSuchFieldError -> L50
                com.google.crypto.tink.proto.KeyStatusType r3 = com.google.crypto.tink.proto.KeyStatusType.DISABLED     // Catch: java.lang.NoSuchFieldError -> L50
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L50
                r0[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L50
                goto L51
            L50:
                r0 = move-exception
            L51:
                int[] r0 = com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType     // Catch: java.lang.NoSuchFieldError -> L5c
                com.google.crypto.tink.proto.KeyStatusType r1 = com.google.crypto.tink.proto.KeyStatusType.DESTROYED     // Catch: java.lang.NoSuchFieldError -> L5c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5c
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5c
                goto L5d
            L5c:
                r0 = move-exception
            L5d:
                return
        }
    }

    private KeyStatusTypeProtoConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType fromProto(com.google.crypto.tink.proto.KeyStatusType r2) {
            int[] r0 = com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L19;
                case 2: goto L16;
                case 3: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown key status type."
            r0.<init>(r1)
            throw r0
        L13:
            com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r0 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.DESTROYED
            return r0
        L16:
            com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r0 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.DISABLED
            return r0
        L19:
            com.google.crypto.tink.tinkkey.KeyHandle$KeyStatusType r0 = com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType.ENABLED
            return r0
    }

    public static com.google.crypto.tink.proto.KeyStatusType toProto(com.google.crypto.tink.tinkkey.KeyHandle.KeyStatusType r2) {
            int[] r0 = com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L19;
                case 2: goto L16;
                case 3: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown key status type."
            r0.<init>(r1)
            throw r0
        L13:
            com.google.crypto.tink.proto.KeyStatusType r0 = com.google.crypto.tink.proto.KeyStatusType.DESTROYED
            return r0
        L16:
            com.google.crypto.tink.proto.KeyStatusType r0 = com.google.crypto.tink.proto.KeyStatusType.DISABLED
            return r0
        L19:
            com.google.crypto.tink.proto.KeyStatusType r0 = com.google.crypto.tink.proto.KeyStatusType.ENABLED
            return r0
    }
}
