package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class FieldInfo implements java.lang.Comparable<com.google.crypto.tink.shaded.protobuf.FieldInfo> {
    private final java.lang.reflect.Field cachedSizeField;
    private final boolean enforceUtf8;
    private final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier enumVerifier;
    private final java.lang.reflect.Field field;
    private final int fieldNumber;
    private final java.lang.Object mapDefaultEntry;
    private final java.lang.Class<?> messageClass;
    private final com.google.crypto.tink.shaded.protobuf.OneofInfo oneof;
    private final java.lang.Class<?> oneofStoredType;
    private final java.lang.reflect.Field presenceField;
    private final int presenceMask;
    private final boolean required;
    private final com.google.crypto.tink.shaded.protobuf.FieldType type;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.FieldInfo$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType = null;

        static {
                com.google.crypto.tink.shaded.protobuf.FieldType[] r0 = com.google.crypto.tink.shaded.protobuf.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.FieldInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType = r0
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.shaded.protobuf.FieldType r1 = com.google.crypto.tink.shaded.protobuf.FieldType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.shaded.protobuf.FieldType r1 = com.google.crypto.tink.shaded.protobuf.FieldType.GROUP     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.shaded.protobuf.FieldType r1 = com.google.crypto.tink.shaded.protobuf.FieldType.MESSAGE_LIST     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.shaded.protobuf.FieldType r1 = com.google.crypto.tink.shaded.protobuf.FieldType.GROUP_LIST     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                return
        }
    }

    public static final class Builder {
        private java.lang.reflect.Field cachedSizeField;
        private boolean enforceUtf8;
        private com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier enumVerifier;
        private java.lang.reflect.Field field;
        private int fieldNumber;
        private java.lang.Object mapDefaultEntry;
        private com.google.crypto.tink.shaded.protobuf.OneofInfo oneof;
        private java.lang.Class<?> oneofStoredType;
        private java.lang.reflect.Field presenceField;
        private int presenceMask;
        private boolean required;
        private com.google.crypto.tink.shaded.protobuf.FieldType type;

        private Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.FieldInfo.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo build() {
                r8 = this;
                com.google.crypto.tink.shaded.protobuf.OneofInfo r0 = r8.oneof
                if (r0 == 0) goto L15
                int r1 = r8.fieldNumber
                com.google.crypto.tink.shaded.protobuf.FieldType r2 = r8.type
                com.google.crypto.tink.shaded.protobuf.OneofInfo r3 = r8.oneof
                java.lang.Class<?> r4 = r8.oneofStoredType
                boolean r5 = r8.enforceUtf8
                com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r6 = r8.enumVerifier
                com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.forOneofMemberField(r1, r2, r3, r4, r5, r6)
                return r0
            L15:
                java.lang.Object r0 = r8.mapDefaultEntry
                if (r0 == 0) goto L26
                java.lang.reflect.Field r0 = r8.field
                int r1 = r8.fieldNumber
                java.lang.Object r2 = r8.mapDefaultEntry
                com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r3 = r8.enumVerifier
                com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.forMapField(r0, r1, r2, r3)
                return r0
            L26:
                java.lang.reflect.Field r0 = r8.presenceField
                if (r0 == 0) goto L54
                boolean r0 = r8.required
                if (r0 == 0) goto L41
                java.lang.reflect.Field r1 = r8.field
                int r2 = r8.fieldNumber
                com.google.crypto.tink.shaded.protobuf.FieldType r3 = r8.type
                java.lang.reflect.Field r4 = r8.presenceField
                int r5 = r8.presenceMask
                boolean r6 = r8.enforceUtf8
                com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r7 = r8.enumVerifier
                com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.forProto2RequiredField(r1, r2, r3, r4, r5, r6, r7)
                return r0
            L41:
                java.lang.reflect.Field r1 = r8.field
                int r2 = r8.fieldNumber
                com.google.crypto.tink.shaded.protobuf.FieldType r3 = r8.type
                java.lang.reflect.Field r4 = r8.presenceField
                int r5 = r8.presenceMask
                boolean r6 = r8.enforceUtf8
                com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r7 = r8.enumVerifier
                com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.forProto2OptionalField(r1, r2, r3, r4, r5, r6, r7)
                return r0
            L54:
                com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = r8.enumVerifier
                if (r0 == 0) goto L78
                java.lang.reflect.Field r0 = r8.cachedSizeField
                if (r0 != 0) goto L69
                java.lang.reflect.Field r0 = r8.field
                int r1 = r8.fieldNumber
                com.google.crypto.tink.shaded.protobuf.FieldType r2 = r8.type
                com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r3 = r8.enumVerifier
                com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.forFieldWithEnumVerifier(r0, r1, r2, r3)
                return r0
            L69:
                java.lang.reflect.Field r0 = r8.field
                int r1 = r8.fieldNumber
                com.google.crypto.tink.shaded.protobuf.FieldType r2 = r8.type
                com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r3 = r8.enumVerifier
                java.lang.reflect.Field r4 = r8.cachedSizeField
                com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.forPackedFieldWithEnumVerifier(r0, r1, r2, r3, r4)
                return r0
            L78:
                java.lang.reflect.Field r0 = r8.cachedSizeField
                if (r0 != 0) goto L89
                java.lang.reflect.Field r0 = r8.field
                int r1 = r8.fieldNumber
                com.google.crypto.tink.shaded.protobuf.FieldType r2 = r8.type
                boolean r3 = r8.enforceUtf8
                com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.forField(r0, r1, r2, r3)
                return r0
            L89:
                java.lang.reflect.Field r0 = r8.field
                int r1 = r8.fieldNumber
                com.google.crypto.tink.shaded.protobuf.FieldType r2 = r8.type
                java.lang.reflect.Field r3 = r8.cachedSizeField
                com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.forPackedField(r0, r1, r2, r3)
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder withCachedSizeField(java.lang.reflect.Field r1) {
                r0 = this;
                r0.cachedSizeField = r1
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder withEnforceUtf8(boolean r1) {
                r0 = this;
                r0.enforceUtf8 = r1
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder withEnumVerifier(com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier r1) {
                r0 = this;
                r0.enumVerifier = r1
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder withField(java.lang.reflect.Field r3) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.OneofInfo r0 = r2.oneof
                if (r0 != 0) goto L7
                r2.field = r3
                return r2
            L7:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Cannot set field when building a oneof."
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder withFieldNumber(int r1) {
                r0 = this;
                r0.fieldNumber = r1
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder withMapDefaultEntry(java.lang.Object r1) {
                r0 = this;
                r0.mapDefaultEntry = r1
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder withOneof(com.google.crypto.tink.shaded.protobuf.OneofInfo r3, java.lang.Class<?> r4) {
                r2 = this;
                java.lang.reflect.Field r0 = r2.field
                if (r0 != 0) goto Ld
                java.lang.reflect.Field r0 = r2.presenceField
                if (r0 != 0) goto Ld
                r2.oneof = r3
                r2.oneofStoredType = r4
                return r2
            Ld:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Cannot set oneof when field or presenceField have been provided"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder withPresence(java.lang.reflect.Field r2, int r3) {
                r1 = this;
                java.lang.String r0 = "presenceField"
                java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r2, r0)
                java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
                r1.presenceField = r0
                r1.presenceMask = r3
                return r1
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder withRequired(boolean r1) {
                r0 = this;
                r0.required = r1
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder withType(com.google.crypto.tink.shaded.protobuf.FieldType r1) {
                r0 = this;
                r0.type = r1
                return r0
        }
    }

    private FieldInfo(java.lang.reflect.Field r1, int r2, com.google.crypto.tink.shaded.protobuf.FieldType r3, java.lang.Class<?> r4, java.lang.reflect.Field r5, int r6, boolean r7, boolean r8, com.google.crypto.tink.shaded.protobuf.OneofInfo r9, java.lang.Class<?> r10, java.lang.Object r11, com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier r12, java.lang.reflect.Field r13) {
            r0 = this;
            r0.<init>()
            r0.field = r1
            r0.type = r3
            r0.messageClass = r4
            r0.fieldNumber = r2
            r0.presenceField = r5
            r0.presenceMask = r6
            r0.required = r7
            r0.enforceUtf8 = r8
            r0.oneof = r9
            r0.oneofStoredType = r10
            r0.mapDefaultEntry = r11
            r0.enumVerifier = r12
            r0.cachedSizeField = r13
            return
    }

    private static void checkFieldNumber(int r3) {
            if (r3 <= 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "fieldNumber must be positive: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldInfo forField(java.lang.reflect.Field r14, int r15, com.google.crypto.tink.shaded.protobuf.FieldType r16, boolean r17) {
            r3 = r16
            checkFieldNumber(r15)
            java.lang.String r0 = "field"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r14, r0)
            java.lang.String r0 = "fieldType"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r3, r0)
            com.google.crypto.tink.shaded.protobuf.FieldType r0 = com.google.crypto.tink.shaded.protobuf.FieldType.MESSAGE_LIST
            if (r3 == r0) goto L2a
            com.google.crypto.tink.shaded.protobuf.FieldType r0 = com.google.crypto.tink.shaded.protobuf.FieldType.GROUP_LIST
            if (r3 == r0) goto L2a
            com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = new com.google.crypto.tink.shaded.protobuf.FieldInfo
            r12 = 0
            r13 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r1 = r14
            r2 = r15
            r8 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Shouldn't be called for repeated message fields."
            r0.<init>(r1)
            throw r0
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldInfo forFieldWithEnumVerifier(java.lang.reflect.Field r15, int r16, com.google.crypto.tink.shaded.protobuf.FieldType r17, com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier r18) {
            checkFieldNumber(r16)
            java.lang.String r0 = "field"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r15, r0)
            com.google.crypto.tink.shaded.protobuf.FieldInfo r1 = new com.google.crypto.tink.shaded.protobuf.FieldInfo
            r12 = 0
            r14 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r2 = r15
            r3 = r16
            r4 = r17
            r13 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldInfo forMapField(java.lang.reflect.Field r15, int r16, java.lang.Object r17, com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier r18) {
            java.lang.String r0 = "mapDefaultEntry"
            r12 = r17
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r12, r0)
            checkFieldNumber(r16)
            java.lang.String r0 = "field"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r15, r0)
            com.google.crypto.tink.shaded.protobuf.FieldInfo r1 = new com.google.crypto.tink.shaded.protobuf.FieldInfo
            com.google.crypto.tink.shaded.protobuf.FieldType r4 = com.google.crypto.tink.shaded.protobuf.FieldType.MAP
            r11 = 0
            r14 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 1
            r10 = 0
            r2 = r15
            r3 = r16
            r13 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldInfo forOneofMemberField(int r14, com.google.crypto.tink.shaded.protobuf.FieldType r15, com.google.crypto.tink.shaded.protobuf.OneofInfo r16, java.lang.Class<?> r17, boolean r18, com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier r19) {
            checkFieldNumber(r14)
            java.lang.String r0 = "fieldType"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r15, r0)
            java.lang.String r0 = "oneof"
            r9 = r16
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r9, r0)
            java.lang.String r0 = "oneofStoredType"
            r10 = r17
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r10, r0)
            boolean r0 = r15.isScalar()
            if (r0 == 0) goto L2f
            com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = new com.google.crypto.tink.shaded.protobuf.FieldInfo
            r11 = 0
            r13 = 0
            r1 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r14
            r3 = r15
            r8 = r18
            r12 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L2f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Oneof is only supported for scalar fields. Field "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r14)
            java.lang.String r4 = " is of type "
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r1 = r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldInfo forPackedField(java.lang.reflect.Field r14, int r15, com.google.crypto.tink.shaded.protobuf.FieldType r16, java.lang.reflect.Field r17) {
            r3 = r16
            checkFieldNumber(r15)
            java.lang.String r0 = "field"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r14, r0)
            java.lang.String r0 = "fieldType"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r3, r0)
            com.google.crypto.tink.shaded.protobuf.FieldType r0 = com.google.crypto.tink.shaded.protobuf.FieldType.MESSAGE_LIST
            if (r3 == r0) goto L2a
            com.google.crypto.tink.shaded.protobuf.FieldType r0 = com.google.crypto.tink.shaded.protobuf.FieldType.GROUP_LIST
            if (r3 == r0) goto L2a
            com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = new com.google.crypto.tink.shaded.protobuf.FieldInfo
            r11 = 0
            r12 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r1 = r14
            r2 = r15
            r13 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Shouldn't be called for repeated message fields."
            r0.<init>(r1)
            throw r0
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldInfo forPackedFieldWithEnumVerifier(java.lang.reflect.Field r15, int r16, com.google.crypto.tink.shaded.protobuf.FieldType r17, com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier r18, java.lang.reflect.Field r19) {
            checkFieldNumber(r16)
            java.lang.String r0 = "field"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r15, r0)
            com.google.crypto.tink.shaded.protobuf.FieldInfo r1 = new com.google.crypto.tink.shaded.protobuf.FieldInfo
            r11 = 0
            r12 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r2 = r15
            r3 = r16
            r4 = r17
            r13 = r18
            r14 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldInfo forProto2OptionalField(java.lang.reflect.Field r14, int r15, com.google.crypto.tink.shaded.protobuf.FieldType r16, java.lang.reflect.Field r17, int r18, boolean r19, com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier r20) {
            r5 = r17
            checkFieldNumber(r15)
            java.lang.String r0 = "field"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r14, r0)
            java.lang.String r0 = "fieldType"
            r3 = r16
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r3, r0)
            java.lang.String r0 = "presenceField"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r5, r0)
            if (r5 == 0) goto L3c
            boolean r0 = isExactlyOneBitSet(r18)
            if (r0 == 0) goto L21
            r6 = r18
            goto L3e
        L21:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "presenceMask must have exactly one bit set: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r6 = r18
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3c:
            r6 = r18
        L3e:
            com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = new com.google.crypto.tink.shaded.protobuf.FieldInfo
            r11 = 0
            r13 = 0
            r4 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r1 = r14
            r2 = r15
            r8 = r19
            r12 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldInfo forProto2RequiredField(java.lang.reflect.Field r14, int r15, com.google.crypto.tink.shaded.protobuf.FieldType r16, java.lang.reflect.Field r17, int r18, boolean r19, com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier r20) {
            r5 = r17
            checkFieldNumber(r15)
            java.lang.String r0 = "field"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r14, r0)
            java.lang.String r0 = "fieldType"
            r3 = r16
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r3, r0)
            java.lang.String r0 = "presenceField"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r5, r0)
            if (r5 == 0) goto L3c
            boolean r0 = isExactlyOneBitSet(r18)
            if (r0 == 0) goto L21
            r6 = r18
            goto L3e
        L21:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "presenceMask must have exactly one bit set: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r6 = r18
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3c:
            r6 = r18
        L3e:
            com.google.crypto.tink.shaded.protobuf.FieldInfo r0 = new com.google.crypto.tink.shaded.protobuf.FieldInfo
            r11 = 0
            r13 = 0
            r4 = 0
            r7 = 1
            r9 = 0
            r10 = 0
            r1 = r14
            r2 = r15
            r8 = r19
            r12 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldInfo forRepeatedMessageField(java.lang.reflect.Field r15, int r16, com.google.crypto.tink.shaded.protobuf.FieldType r17, java.lang.Class<?> r18) {
            checkFieldNumber(r16)
            java.lang.String r0 = "field"
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r15, r0)
            java.lang.String r0 = "fieldType"
            r4 = r17
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r4, r0)
            java.lang.String r0 = "messageClass"
            r5 = r18
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r5, r0)
            com.google.crypto.tink.shaded.protobuf.FieldInfo r1 = new com.google.crypto.tink.shaded.protobuf.FieldInfo
            r13 = 0
            r14 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r15
            r3 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
    }

    private static boolean isExactlyOneBitSet(int r1) {
            if (r1 == 0) goto L9
            int r0 = r1 + (-1)
            r0 = r0 & r1
            if (r0 != 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.FieldInfo.Builder newBuilder() {
            com.google.crypto.tink.shaded.protobuf.FieldInfo$Builder r0 = new com.google.crypto.tink.shaded.protobuf.FieldInfo$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.google.crypto.tink.shaded.protobuf.FieldInfo r3) {
            r2 = this;
            int r0 = r2.fieldNumber
            int r1 = r3.fieldNumber
            int r0 = r0 - r1
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.google.crypto.tink.shaded.protobuf.FieldInfo r1) {
            r0 = this;
            com.google.crypto.tink.shaded.protobuf.FieldInfo r1 = (com.google.crypto.tink.shaded.protobuf.FieldInfo) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public java.lang.reflect.Field getCachedSizeField() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.cachedSizeField
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier getEnumVerifier() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = r1.enumVerifier
            return r0
    }

    public java.lang.reflect.Field getField() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            return r0
    }

    public int getFieldNumber() {
            r1 = this;
            int r0 = r1.fieldNumber
            return r0
    }

    public java.lang.Class<?> getListElementType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.messageClass
            return r0
    }

    public java.lang.Object getMapDefaultEntry() {
            r1 = this;
            java.lang.Object r0 = r1.mapDefaultEntry
            return r0
    }

    public java.lang.Class<?> getMessageFieldClass() {
            r2 = this;
            int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType
            com.google.crypto.tink.shaded.protobuf.FieldType r1 = r2.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L12;
                case 2: goto L12;
                case 3: goto Lf;
                case 4: goto Lf;
                default: goto Ld;
            }
        Ld:
            r0 = 0
            return r0
        Lf:
            java.lang.Class<?> r0 = r2.messageClass
            return r0
        L12:
            java.lang.reflect.Field r0 = r2.field
            if (r0 == 0) goto L1d
            java.lang.reflect.Field r0 = r2.field
            java.lang.Class r0 = r0.getType()
            goto L1f
        L1d:
            java.lang.Class<?> r0 = r2.oneofStoredType
        L1f:
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.OneofInfo getOneof() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.OneofInfo r0 = r1.oneof
            return r0
    }

    public java.lang.Class<?> getOneofStoredType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.oneofStoredType
            return r0
    }

    public java.lang.reflect.Field getPresenceField() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.presenceField
            return r0
    }

    public int getPresenceMask() {
            r1 = this;
            int r0 = r1.presenceMask
            return r0
    }

    public com.google.crypto.tink.shaded.protobuf.FieldType getType() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.FieldType r0 = r1.type
            return r0
    }

    public boolean isEnforceUtf8() {
            r1 = this;
            boolean r0 = r1.enforceUtf8
            return r0
    }

    public boolean isRequired() {
            r1 = this;
            boolean r0 = r1.required
            return r0
    }
}
