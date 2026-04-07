package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class MessageSchema<T> implements com.google.crypto.tink.shaded.protobuf.Schema<T> {
    private static final int[] EMPTY_INT_ARRAY = null;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int INTS_PER_FIELD = 3;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_MASK = 268435456;
    private static final sun.misc.Unsafe UNSAFE = null;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final com.google.crypto.tink.shaded.protobuf.MessageLite defaultInstance;
    private final com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final com.google.crypto.tink.shaded.protobuf.ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final com.google.crypto.tink.shaded.protobuf.MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final com.google.crypto.tink.shaded.protobuf.NewInstanceSchema newInstanceSchema;
    private final java.lang.Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.MessageSchema$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;

        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType = r0
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BOOL     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BYTES     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED32     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED32     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L56
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED64     // Catch: java.lang.NoSuchFieldError -> L56
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L56
                goto L57
            L56:
                r0 = move-exception
            L57:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L63
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED64     // Catch: java.lang.NoSuchFieldError -> L63
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L63
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L63
                goto L64
            L63:
                r0 = move-exception
            L64:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L71
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L71
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L71
                goto L72
            L71:
                r0 = move-exception
            L72:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L7f
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM     // Catch: java.lang.NoSuchFieldError -> L7f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7f
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7f
                goto L80
            L7f:
                r0 = move-exception
            L80:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L8d
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT32     // Catch: java.lang.NoSuchFieldError -> L8d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8d
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8d
                goto L8e
            L8d:
                r0 = move-exception
            L8e:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L9b
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT32     // Catch: java.lang.NoSuchFieldError -> L9b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9b
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9b
                goto L9c
            L9b:
                r0 = move-exception
            L9c:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> La9
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT64     // Catch: java.lang.NoSuchFieldError -> La9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La9
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La9
                goto Laa
            La9:
                r0 = move-exception
            Laa:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lb7
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT64     // Catch: java.lang.NoSuchFieldError -> Lb7
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb7
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb7
                goto Lb8
            Lb7:
                r0 = move-exception
            Lb8:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lc5
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> Lc5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc5
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc5
                goto Lc6
            Lc5:
                r0 = move-exception
            Lc6:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Ld3
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT32     // Catch: java.lang.NoSuchFieldError -> Ld3
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld3
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ld3
                goto Ld4
            Ld3:
                r0 = move-exception
            Ld4:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Le1
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT64     // Catch: java.lang.NoSuchFieldError -> Le1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le1
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Le1
                goto Le2
            Le1:
                r0 = move-exception
            Le2:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lef
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING     // Catch: java.lang.NoSuchFieldError -> Lef
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lef
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lef
                goto Lf0
            Lef:
                r0 = move-exception
            Lf0:
                return
        }
    }

    static {
            r0 = 0
            int[] r0 = new int[r0]
            com.google.crypto.tink.shaded.protobuf.MessageSchema.EMPTY_INT_ARRAY = r0
            sun.misc.Unsafe r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getUnsafe()
            com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE = r0
            return
    }

    private MessageSchema(int[] r17, java.lang.Object[] r18, int r19, int r20, com.google.crypto.tink.shaded.protobuf.MessageLite r21, boolean r22, boolean r23, int[] r24, int r25, int r26, com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r27, com.google.crypto.tink.shaded.protobuf.ListFieldSchema r28, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r29, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r30, com.google.crypto.tink.shaded.protobuf.MapFieldSchema r31) {
            r16 = this;
            r0 = r16
            r1 = r21
            r2 = r30
            r0.<init>()
            r3 = r17
            r0.buffer = r3
            r4 = r18
            r0.objects = r4
            r5 = r19
            r0.minFieldNumber = r5
            r6 = r20
            r0.maxFieldNumber = r6
            boolean r7 = r1 instanceof com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
            r0.lite = r7
            r7 = r22
            r0.proto3 = r7
            if (r2 == 0) goto L2b
            boolean r8 = r2.hasExtensions(r1)
            if (r8 == 0) goto L2b
            r8 = 1
            goto L2c
        L2b:
            r8 = 0
        L2c:
            r0.hasExtensions = r8
            r8 = r23
            r0.useCachedSizeField = r8
            r9 = r24
            r0.intArray = r9
            r10 = r25
            r0.checkInitializedCount = r10
            r11 = r26
            r0.repeatedFieldOffsetStart = r11
            r12 = r27
            r0.newInstanceSchema = r12
            r13 = r28
            r0.listFieldSchema = r13
            r14 = r29
            r0.unknownFieldSchema = r14
            r0.extensionSchema = r2
            r0.defaultInstance = r1
            r15 = r31
            r0.mapFieldSchema = r15
            return
    }

    private boolean arePresentForEquals(T r3, T r4, int r5) {
            r2 = this;
            boolean r0 = r2.isFieldPresent(r3, r5)
            boolean r1 = r2.isFieldPresent(r4, r5)
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private static <T> boolean booleanAt(T r1, long r2) {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getBoolean(r1, r2)
            return r0
    }

    private static void checkMutable(java.lang.Object r3) {
            boolean r0 = isMutable(r3)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Mutating immutable message: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private <K, V> int decodeMapEntry(byte[] r16, int r17, int r18, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> r19, java.util.Map<K, V> r20, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r21) throws java.io.IOException {
            r15 = this;
            r1 = r16
            r7 = r19
            r6 = r21
            r0 = r17
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r1, r0, r6)
            int r8 = r6.int1
            if (r8 < 0) goto L8b
            int r2 = r18 - r0
            if (r8 > r2) goto L8b
            int r9 = r0 + r8
            K r2 = r7.defaultKey
            V r3 = r7.defaultValue
            r10 = r2
            r11 = r3
        L1c:
            if (r0 >= r9) goto L7a
            int r2 = r0 + 1
            r0 = r1[r0]
            if (r0 >= 0) goto L2c
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r0, r1, r2, r6)
            int r0 = r6.int1
            r12 = r0
            goto L2d
        L2c:
            r12 = r0
        L2d:
            int r13 = r12 >>> 3
            r14 = r12 & 7
            switch(r13) {
                case 1: goto L59;
                case 2: goto L37;
                default: goto L34;
            }
        L34:
            r3 = r18
            goto L75
        L37:
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r7.valueType
            int r0 = r0.getWireType()
            if (r14 != r0) goto L54
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r4 = r7.valueType
            V r0 = r7.defaultValue
            java.lang.Class r5 = r0.getClass()
            r0 = r15
            r3 = r18
            int r2 = r0.decodeMapEntryValue(r1, r2, r3, r4, r5, r6)
            java.lang.Object r11 = r6.object1
            r1 = r16
            r0 = r2
            goto L1c
        L54:
            r1 = r16
            r3 = r18
            goto L75
        L59:
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r7.keyType
            int r0 = r0.getWireType()
            if (r14 != r0) goto L71
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r4 = r7.keyType
            r5 = 0
            r0 = r15
            r1 = r16
            r3 = r18
            int r2 = r0.decodeMapEntryValue(r1, r2, r3, r4, r5, r6)
            java.lang.Object r10 = r6.object1
            r0 = r2
            goto L1c
        L71:
            r1 = r16
            r3 = r18
        L75:
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.skipField(r12, r1, r2, r3, r6)
            goto L1c
        L7a:
            r3 = r18
            if (r0 != r9) goto L84
            r2 = r20
            r2.put(r10, r11)
            return r9
        L84:
            r2 = r20
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r4 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r4
        L8b:
            r3 = r18
            r2 = r20
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r4 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r4
    }

    private int decodeMapEntryValue(byte[] r5, int r6, int r7, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r8, java.lang.Class<?> r9, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r10) throws java.io.IOException {
            r4 = this;
            int[] r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType
            int r1 = r8.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L9d;
                case 2: goto L98;
                case 3: goto L8b;
                case 4: goto L7e;
                case 5: goto L7e;
                case 6: goto L71;
                case 7: goto L71;
                case 8: goto L64;
                case 9: goto L57;
                case 10: goto L57;
                case 11: goto L57;
                case 12: goto L4a;
                case 13: goto L4a;
                case 14: goto L3d;
                case 15: goto L2b;
                case 16: goto L19;
                case 17: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "unsupported field type."
            r0.<init>(r1)
            throw r0
        L13:
            int r6 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeStringRequireUtf8(r5, r6, r10)
            goto Lb3
        L19:
            int r6 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r5, r6, r10)
            long r0 = r10.long1
            long r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag64(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.object1 = r0
            goto Lb3
        L2b:
            int r6 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r5, r6, r10)
            int r0 = r10.int1
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag32(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.object1 = r0
            goto Lb3
        L3d:
            com.google.crypto.tink.shaded.protobuf.Protobuf r0 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r0.schemaFor(r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeMessageField(r0, r5, r6, r7, r10)
            goto Lb3
        L4a:
            int r6 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r5, r6, r10)
            long r0 = r10.long1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.object1 = r0
            goto Lb3
        L57:
            int r6 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r5, r6, r10)
            int r0 = r10.int1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.object1 = r0
            goto Lb3
        L64:
            float r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFloat(r5, r6)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r10.object1 = r0
            int r6 = r6 + 4
            goto Lb3
        L71:
            long r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFixed64(r5, r6)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.object1 = r0
            int r6 = r6 + 8
            goto Lb3
        L7e:
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFixed32(r5, r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.object1 = r0
            int r6 = r6 + 4
            goto Lb3
        L8b:
            double r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeDouble(r5, r6)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r10.object1 = r0
            int r6 = r6 + 8
            goto Lb3
        L98:
            int r6 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeBytes(r5, r6, r10)
            goto Lb3
        L9d:
            int r6 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r5, r6, r10)
            long r0 = r10.long1
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lab
            r0 = 1
            goto Lac
        Lab:
            r0 = 0
        Lac:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.object1 = r0
        Lb3:
            return r6
    }

    private static <T> double doubleAt(T r2, long r3) {
            double r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getDouble(r2, r3)
            return r0
    }

    private boolean equals(T r11, T r12, int r13) {
            r10 = this;
            int r0 = r10.typeAndOffsetAt(r13)
            long r1 = offset(r0)
            int r3 = type(r0)
            r4 = 0
            r5 = 1
            switch(r3) {
                case 0: goto L1bc;
                case 1: goto L1a0;
                case 2: goto L18a;
                case 3: goto L174;
                case 4: goto L160;
                case 5: goto L14a;
                case 6: goto L136;
                case 7: goto L122;
                case 8: goto L10a;
                case 9: goto Lf2;
                case 10: goto Lda;
                case 11: goto Lc6;
                case 12: goto Lb2;
                case 13: goto L9e;
                case 14: goto L88;
                case 15: goto L74;
                case 16: goto L5e;
                case 17: goto L46;
                case 18: goto L38;
                case 19: goto L38;
                case 20: goto L38;
                case 21: goto L38;
                case 22: goto L38;
                case 23: goto L38;
                case 24: goto L38;
                case 25: goto L38;
                case 26: goto L38;
                case 27: goto L38;
                case 28: goto L38;
                case 29: goto L38;
                case 30: goto L38;
                case 31: goto L38;
                case 32: goto L38;
                case 33: goto L38;
                case 34: goto L38;
                case 35: goto L38;
                case 36: goto L38;
                case 37: goto L38;
                case 38: goto L38;
                case 39: goto L38;
                case 40: goto L38;
                case 41: goto L38;
                case 42: goto L38;
                case 43: goto L38;
                case 44: goto L38;
                case 45: goto L38;
                case 46: goto L38;
                case 47: goto L38;
                case 48: goto L38;
                case 49: goto L38;
                case 50: goto L2a;
                case 51: goto L12;
                case 52: goto L12;
                case 53: goto L12;
                case 54: goto L12;
                case 55: goto L12;
                case 56: goto L12;
                case 57: goto L12;
                case 58: goto L12;
                case 59: goto L12;
                case 60: goto L12;
                case 61: goto L12;
                case 62: goto L12;
                case 63: goto L12;
                case 64: goto L12;
                case 65: goto L12;
                case 66: goto L12;
                case 67: goto L12;
                case 68: goto L12;
                default: goto L11;
            }
        L11:
            return r5
        L12:
            boolean r3 = r10.isOneofCaseEqual(r11, r12, r13)
            if (r3 == 0) goto L28
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r1)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r1)
            boolean r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.safeEquals(r3, r6)
            if (r3 == 0) goto L28
            r4 = r5
            goto L29
        L28:
        L29:
            return r4
        L2a:
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r1)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r1)
            boolean r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.safeEquals(r3, r4)
            return r3
        L38:
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r1)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r1)
            boolean r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.safeEquals(r3, r4)
            return r3
        L46:
            boolean r3 = r10.arePresentForEquals(r11, r12, r13)
            if (r3 == 0) goto L5c
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r1)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r1)
            boolean r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.safeEquals(r3, r6)
            if (r3 == 0) goto L5c
            r4 = r5
            goto L5d
        L5c:
        L5d:
            return r4
        L5e:
            boolean r3 = r10.arePresentForEquals(r11, r12, r13)
            if (r3 == 0) goto L72
            long r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r11, r1)
            long r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r12, r1)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L72
            r4 = r5
            goto L73
        L72:
        L73:
            return r4
        L74:
            boolean r3 = r10.arePresentForEquals(r11, r12, r13)
            if (r3 == 0) goto L86
            int r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r11, r1)
            int r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r12, r1)
            if (r3 != r6) goto L86
            r4 = r5
            goto L87
        L86:
        L87:
            return r4
        L88:
            boolean r3 = r10.arePresentForEquals(r11, r12, r13)
            if (r3 == 0) goto L9c
            long r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r11, r1)
            long r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r12, r1)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L9c
            r4 = r5
            goto L9d
        L9c:
        L9d:
            return r4
        L9e:
            boolean r3 = r10.arePresentForEquals(r11, r12, r13)
            if (r3 == 0) goto Lb0
            int r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r11, r1)
            int r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r12, r1)
            if (r3 != r6) goto Lb0
            r4 = r5
            goto Lb1
        Lb0:
        Lb1:
            return r4
        Lb2:
            boolean r3 = r10.arePresentForEquals(r11, r12, r13)
            if (r3 == 0) goto Lc4
            int r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r11, r1)
            int r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r12, r1)
            if (r3 != r6) goto Lc4
            r4 = r5
            goto Lc5
        Lc4:
        Lc5:
            return r4
        Lc6:
            boolean r3 = r10.arePresentForEquals(r11, r12, r13)
            if (r3 == 0) goto Ld8
            int r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r11, r1)
            int r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r12, r1)
            if (r3 != r6) goto Ld8
            r4 = r5
            goto Ld9
        Ld8:
        Ld9:
            return r4
        Lda:
            boolean r3 = r10.arePresentForEquals(r11, r12, r13)
            if (r3 == 0) goto Lf0
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r1)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r1)
            boolean r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.safeEquals(r3, r6)
            if (r3 == 0) goto Lf0
            r4 = r5
            goto Lf1
        Lf0:
        Lf1:
            return r4
        Lf2:
            boolean r3 = r10.arePresentForEquals(r11, r12, r13)
            if (r3 == 0) goto L108
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r1)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r1)
            boolean r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.safeEquals(r3, r6)
            if (r3 == 0) goto L108
            r4 = r5
            goto L109
        L108:
        L109:
            return r4
        L10a:
            boolean r3 = r10.arePresentForEquals(r11, r12, r13)
            if (r3 == 0) goto L120
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r1)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r1)
            boolean r3 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.safeEquals(r3, r6)
            if (r3 == 0) goto L120
            r4 = r5
            goto L121
        L120:
        L121:
            return r4
        L122:
            boolean r3 = r10.arePresentForEquals(r11, r12, r13)
            if (r3 == 0) goto L134
            boolean r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getBoolean(r11, r1)
            boolean r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getBoolean(r12, r1)
            if (r3 != r6) goto L134
            r4 = r5
            goto L135
        L134:
        L135:
            return r4
        L136:
            boolean r3 = r10.arePresentForEquals(r11, r12, r13)
            if (r3 == 0) goto L148
            int r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r11, r1)
            int r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r12, r1)
            if (r3 != r6) goto L148
            r4 = r5
            goto L149
        L148:
        L149:
            return r4
        L14a:
            boolean r3 = r10.arePresentForEquals(r11, r12, r13)
            if (r3 == 0) goto L15e
            long r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r11, r1)
            long r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r12, r1)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L15e
            r4 = r5
            goto L15f
        L15e:
        L15f:
            return r4
        L160:
            boolean r3 = r10.arePresentForEquals(r11, r12, r13)
            if (r3 == 0) goto L172
            int r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r11, r1)
            int r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r12, r1)
            if (r3 != r6) goto L172
            r4 = r5
            goto L173
        L172:
        L173:
            return r4
        L174:
            boolean r3 = r10.arePresentForEquals(r11, r12, r13)
            if (r3 == 0) goto L188
            long r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r11, r1)
            long r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r12, r1)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L188
            r4 = r5
            goto L189
        L188:
        L189:
            return r4
        L18a:
            boolean r3 = r10.arePresentForEquals(r11, r12, r13)
            if (r3 == 0) goto L19e
            long r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r11, r1)
            long r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r12, r1)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L19e
            r4 = r5
            goto L19f
        L19e:
        L19f:
            return r4
        L1a0:
            boolean r3 = r10.arePresentForEquals(r11, r12, r13)
            if (r3 == 0) goto L1ba
            float r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getFloat(r11, r1)
            int r3 = java.lang.Float.floatToIntBits(r3)
            float r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getFloat(r12, r1)
            int r6 = java.lang.Float.floatToIntBits(r6)
            if (r3 != r6) goto L1ba
            r4 = r5
            goto L1bb
        L1ba:
        L1bb:
            return r4
        L1bc:
            boolean r3 = r10.arePresentForEquals(r11, r12, r13)
            if (r3 == 0) goto L1d8
            double r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getDouble(r11, r1)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            double r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getDouble(r12, r1)
            long r8 = java.lang.Double.doubleToLongBits(r8)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L1d8
            r4 = r5
            goto L1d9
        L1d8:
        L1d9:
            return r4
    }

    private <UT, UB> UB filterMapUnknownEnumValues(java.lang.Object r12, int r13, UB r14, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r15, java.lang.Object r16) {
            r11 = this;
            int r2 = r11.numberAt(r13)
            int r0 = r11.typeAndOffsetAt(r13)
            long r8 = offset(r0)
            java.lang.Object r10 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r8)
            if (r10 != 0) goto L13
            return r14
        L13:
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r4 = r11.getEnumFieldVerifier(r13)
            if (r4 != 0) goto L1a
            return r14
        L1a:
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r0 = r11.mapFieldSchema
            java.util.Map r3 = r0.forMutableMapData(r10)
            r0 = r11
            r1 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            java.lang.Object r14 = r0.filterUnknownEnumMap(r1, r2, r3, r4, r5, r6, r7)
            return r14
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int r9, int r10, java.util.Map<K, V> r11, com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier r12, UB r13, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r14, java.lang.Object r15) {
            r8 = this;
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r0 = r8.mapFieldSchema
            java.lang.Object r1 = r8.getMapFieldDefaultEntry(r9)
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata r0 = r0.forMapMetadata(r1)
            java.util.Set r1 = r11.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            boolean r3 = r12.isInRange(r3)
            if (r3 != 0) goto L67
            if (r13 != 0) goto L34
            java.lang.Object r13 = r14.getBuilderFromMessage(r15)
        L34:
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r4 = r2.getValue()
            int r3 = com.google.crypto.tink.shaded.protobuf.MapEntryLite.computeSerializedSize(r0, r3, r4)
            com.google.crypto.tink.shaded.protobuf.ByteString$CodedBuilder r4 = com.google.crypto.tink.shaded.protobuf.ByteString.newCodedBuilder(r3)
            com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5 = r4.getCodedOutput()
            java.lang.Object r6 = r2.getKey()     // Catch: java.io.IOException -> L60
            java.lang.Object r7 = r2.getValue()     // Catch: java.io.IOException -> L60
            com.google.crypto.tink.shaded.protobuf.MapEntryLite.writeTo(r5, r0, r6, r7)     // Catch: java.io.IOException -> L60
            com.google.crypto.tink.shaded.protobuf.ByteString r6 = r4.build()
            r14.addLengthDelimited(r13, r10, r6)
            r1.remove()
            goto L67
        L60:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r7.<init>(r6)
            throw r7
        L67:
            goto L12
        L68:
            return r13
    }

    private static <T> float floatAt(T r1, long r2) {
            float r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getFloat(r1, r2)
            return r0
    }

    private com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier getEnumFieldVerifier(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.objects
            int r1 = r3 / 3
            int r1 = r1 * 2
            int r1 = r1 + 1
            r0 = r0[r1]
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = (com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier) r0
            return r0
    }

    private java.lang.Object getMapFieldDefaultEntry(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.objects
            int r1 = r3 / 3
            int r1 = r1 * 2
            r0 = r0[r1]
            return r0
    }

    private com.google.crypto.tink.shaded.protobuf.Schema getMessageFieldSchema(int r6) {
            r5 = this;
            int r0 = r6 / 3
            int r0 = r0 * 2
            java.lang.Object[] r1 = r5.objects
            r1 = r1[r0]
            com.google.crypto.tink.shaded.protobuf.Schema r1 = (com.google.crypto.tink.shaded.protobuf.Schema) r1
            if (r1 == 0) goto Ld
            return r1
        Ld:
            com.google.crypto.tink.shaded.protobuf.Protobuf r2 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            java.lang.Object[] r3 = r5.objects
            int r4 = r0 + 1
            r3 = r3[r4]
            java.lang.Class r3 = (java.lang.Class) r3
            com.google.crypto.tink.shaded.protobuf.Schema r1 = r2.schemaFor(r3)
            java.lang.Object[] r2 = r5.objects
            r2[r0] = r1
            return r1
    }

    static com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite getMutableUnknownFields(java.lang.Object r2) {
            r0 = r2
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = r0.unknownFields
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r1 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.getDefaultInstance()
            if (r0 != r1) goto L14
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r0 = com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite.newInstance()
            r1 = r2
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r1
            r1.unknownFields = r0
        L14:
            return r0
    }

    private int getSerializedSizeProto2(T r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            sun.misc.Unsafe r3 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r6 = 0
        Lc:
            int[] r7 = r0.buffer
            int r7 = r7.length
            if (r6 >= r7) goto L686
            int r7 = r0.typeAndOffsetAt(r6)
            int r8 = r0.numberAt(r6)
            int r9 = type(r7)
            r10 = 0
            r11 = 0
            r12 = 17
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r14 = 1
            if (r9 > r12) goto L3c
            int[] r12 = r0.buffer
            int r15 = r6 + 2
            r10 = r12[r15]
            r12 = r10 & r13
            int r13 = r10 >>> 20
            int r11 = r14 << r13
            if (r12 == r4) goto L3b
            r4 = r12
            long r14 = (long) r12
            int r5 = r3.getInt(r1, r14)
        L3b:
            goto L58
        L3c:
            boolean r12 = r0.useCachedSizeField
            if (r12 == 0) goto L3b
            com.google.crypto.tink.shaded.protobuf.FieldType r12 = com.google.crypto.tink.shaded.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r12 = r12.id()
            if (r9 < r12) goto L58
            com.google.crypto.tink.shaded.protobuf.FieldType r12 = com.google.crypto.tink.shaded.protobuf.FieldType.SINT64_LIST_PACKED
            int r12 = r12.id()
            if (r9 > r12) goto L58
            int[] r12 = r0.buffer
            int r14 = r6 + 2
            r12 = r12[r14]
            r10 = r12 & r13
        L58:
            long r12 = offset(r7)
            r14 = 0
            switch(r9) {
                case 0: goto L671;
                case 1: goto L663;
                case 2: goto L652;
                case 3: goto L641;
                case 4: goto L630;
                case 5: goto L621;
                case 6: goto L614;
                case 7: goto L605;
                case 8: goto L5e1;
                case 9: goto L5cb;
                case 10: goto L5b7;
                case 11: goto L5a5;
                case 12: goto L593;
                case 13: goto L585;
                case 14: goto L575;
                case 15: goto L563;
                case 16: goto L551;
                case 17: goto L538;
                case 18: goto L528;
                case 19: goto L518;
                case 20: goto L508;
                case 21: goto L4f8;
                case 22: goto L4e8;
                case 23: goto L4d8;
                case 24: goto L4c8;
                case 25: goto L4b8;
                case 26: goto L4a8;
                case 27: goto L494;
                case 28: goto L484;
                case 29: goto L474;
                case 30: goto L464;
                case 31: goto L454;
                case 32: goto L444;
                case 33: goto L434;
                case 34: goto L424;
                case 35: goto L3fe;
                case 36: goto L3d8;
                case 37: goto L3b2;
                case 38: goto L38c;
                case 39: goto L366;
                case 40: goto L340;
                case 41: goto L31a;
                case 42: goto L2f4;
                case 43: goto L2ce;
                case 44: goto L2a8;
                case 45: goto L282;
                case 46: goto L25c;
                case 47: goto L236;
                case 48: goto L210;
                case 49: goto L1fc;
                case 50: goto L1e8;
                case 51: goto L1d5;
                case 52: goto L1c3;
                case 53: goto L1ae;
                case 54: goto L199;
                case 55: goto L184;
                case 56: goto L171;
                case 57: goto L160;
                case 58: goto L14e;
                case 59: goto L129;
                case 60: goto L110;
                case 61: goto Lf8;
                case 62: goto Le3;
                case 63: goto Lce;
                case 64: goto Lbd;
                case 65: goto Laa;
                case 66: goto L95;
                case 67: goto L80;
                case 68: goto L64;
                default: goto L60;
            }
        L60:
            r16 = r2
            goto L680
        L64:
            boolean r14 = r0.isOneofPresent(r1, r8, r6)
            if (r14 == 0) goto L7c
        L6b:
            java.lang.Object r14 = r3.getObject(r1, r12)
            com.google.crypto.tink.shaded.protobuf.MessageLite r14 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r14
            com.google.crypto.tink.shaded.protobuf.Schema r15 = r0.getMessageFieldSchema(r6)
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeGroupSize(r8, r14, r15)
            int r2 = r2 + r14
            goto L682
        L7c:
            r16 = r2
            goto L680
        L80:
            boolean r14 = r0.isOneofPresent(r1, r8, r6)
            if (r14 == 0) goto L91
            long r14 = oneofLongAt(r1, r12)
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt64Size(r8, r14)
            int r2 = r2 + r14
            goto L682
        L91:
            r16 = r2
            goto L680
        L95:
            boolean r14 = r0.isOneofPresent(r1, r8, r6)
            if (r14 == 0) goto La6
            int r14 = oneofIntAt(r1, r12)
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt32Size(r8, r14)
            int r2 = r2 + r14
            goto L682
        La6:
            r16 = r2
            goto L680
        Laa:
            boolean r14 = r0.isOneofPresent(r1, r8, r6)
            if (r14 == 0) goto Lb9
            r14 = 0
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed64Size(r8, r14)
            int r2 = r2 + r14
            goto L682
        Lb9:
            r16 = r2
            goto L680
        Lbd:
            boolean r15 = r0.isOneofPresent(r1, r8, r6)
            if (r15 == 0) goto Lca
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed32Size(r8, r14)
            int r2 = r2 + r14
            goto L682
        Lca:
            r16 = r2
            goto L680
        Lce:
            boolean r14 = r0.isOneofPresent(r1, r8, r6)
            if (r14 == 0) goto Ldf
            int r14 = oneofIntAt(r1, r12)
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSize(r8, r14)
            int r2 = r2 + r14
            goto L682
        Ldf:
            r16 = r2
            goto L680
        Le3:
            boolean r14 = r0.isOneofPresent(r1, r8, r6)
            if (r14 == 0) goto Lf4
            int r14 = oneofIntAt(r1, r12)
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32Size(r8, r14)
            int r2 = r2 + r14
            goto L682
        Lf4:
            r16 = r2
            goto L680
        Lf8:
            boolean r14 = r0.isOneofPresent(r1, r8, r6)
            if (r14 == 0) goto L10c
        Lff:
            java.lang.Object r14 = r3.getObject(r1, r12)
            com.google.crypto.tink.shaded.protobuf.ByteString r14 = (com.google.crypto.tink.shaded.protobuf.ByteString) r14
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSize(r8, r14)
            int r2 = r2 + r14
            goto L682
        L10c:
            r16 = r2
            goto L680
        L110:
            boolean r14 = r0.isOneofPresent(r1, r8, r6)
            if (r14 == 0) goto L125
            java.lang.Object r14 = r3.getObject(r1, r12)
            com.google.crypto.tink.shaded.protobuf.Schema r15 = r0.getMessageFieldSchema(r6)
            int r15 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeMessage(r8, r14, r15)
            int r2 = r2 + r15
            goto L682
        L125:
            r16 = r2
            goto L680
        L129:
            boolean r14 = r0.isOneofPresent(r1, r8, r6)
            if (r14 == 0) goto L14a
            java.lang.Object r14 = r3.getObject(r1, r12)
            boolean r15 = r14 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r15 == 0) goto L140
            r15 = r14
            com.google.crypto.tink.shaded.protobuf.ByteString r15 = (com.google.crypto.tink.shaded.protobuf.ByteString) r15
            int r15 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSize(r8, r15)
            int r2 = r2 + r15
            goto L148
        L140:
            r15 = r14
            java.lang.String r15 = (java.lang.String) r15
            int r15 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeStringSize(r8, r15)
            int r2 = r2 + r15
        L148:
            goto L682
        L14a:
            r16 = r2
            goto L680
        L14e:
            boolean r14 = r0.isOneofPresent(r1, r8, r6)
            if (r14 == 0) goto L15c
            r14 = 1
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBoolSize(r8, r14)
            int r2 = r2 + r14
            goto L682
        L15c:
            r16 = r2
            goto L680
        L160:
            boolean r15 = r0.isOneofPresent(r1, r8, r6)
            if (r15 == 0) goto L16d
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed32Size(r8, r14)
            int r2 = r2 + r14
            goto L682
        L16d:
            r16 = r2
            goto L680
        L171:
            boolean r14 = r0.isOneofPresent(r1, r8, r6)
            if (r14 == 0) goto L180
            r14 = 0
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed64Size(r8, r14)
            int r2 = r2 + r14
            goto L682
        L180:
            r16 = r2
            goto L680
        L184:
            boolean r14 = r0.isOneofPresent(r1, r8, r6)
            if (r14 == 0) goto L195
            int r14 = oneofIntAt(r1, r12)
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt32Size(r8, r14)
            int r2 = r2 + r14
            goto L682
        L195:
            r16 = r2
            goto L680
        L199:
            boolean r14 = r0.isOneofPresent(r1, r8, r6)
            if (r14 == 0) goto L1aa
            long r14 = oneofLongAt(r1, r12)
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64Size(r8, r14)
            int r2 = r2 + r14
            goto L682
        L1aa:
            r16 = r2
            goto L680
        L1ae:
            boolean r14 = r0.isOneofPresent(r1, r8, r6)
            if (r14 == 0) goto L1bf
            long r14 = oneofLongAt(r1, r12)
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt64Size(r8, r14)
            int r2 = r2 + r14
            goto L682
        L1bf:
            r16 = r2
            goto L680
        L1c3:
            boolean r14 = r0.isOneofPresent(r1, r8, r6)
            if (r14 == 0) goto L1d1
            r14 = 0
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFloatSize(r8, r14)
            int r2 = r2 + r14
            goto L682
        L1d1:
            r16 = r2
            goto L680
        L1d5:
            boolean r14 = r0.isOneofPresent(r1, r8, r6)
            if (r14 == 0) goto L1e4
            r14 = 0
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeDoubleSize(r8, r14)
            int r2 = r2 + r14
            goto L682
        L1e4:
            r16 = r2
            goto L680
        L1e8:
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r14 = r0.mapFieldSchema
            java.lang.Object r15 = r3.getObject(r1, r12)
            r16 = r2
            java.lang.Object r2 = r0.getMapFieldDefaultEntry(r6)
            int r2 = r14.getSerializedSize(r8, r15, r2)
            int r2 = r16 + r2
            goto L682
        L1fc:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            com.google.crypto.tink.shaded.protobuf.Schema r14 = r0.getMessageFieldSchema(r6)
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeGroupList(r8, r2, r14)
            int r2 = r16 + r2
            goto L682
        L210:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeSInt64ListNoTag(r2)
            if (r2 <= 0) goto L680
            boolean r14 = r0.useCachedSizeField
            if (r14 == 0) goto L226
            long r14 = (long) r10
            r3.putInt(r1, r14, r2)
        L226:
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r15 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r2)
            int r14 = r14 + r15
            int r14 = r14 + r2
            int r14 = r16 + r14
            r2 = r14
            goto L682
        L236:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeSInt32ListNoTag(r2)
            if (r2 <= 0) goto L680
            boolean r14 = r0.useCachedSizeField
            if (r14 == 0) goto L24c
            long r14 = (long) r10
            r3.putInt(r1, r14, r2)
        L24c:
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r15 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r2)
            int r14 = r14 + r15
            int r14 = r14 + r2
            int r14 = r16 + r14
            r2 = r14
            goto L682
        L25c:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r2)
            if (r2 <= 0) goto L680
            boolean r14 = r0.useCachedSizeField
            if (r14 == 0) goto L272
            long r14 = (long) r10
            r3.putInt(r1, r14, r2)
        L272:
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r15 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r2)
            int r14 = r14 + r15
            int r14 = r14 + r2
            int r14 = r16 + r14
            r2 = r14
            goto L682
        L282:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r2)
            if (r2 <= 0) goto L680
            boolean r14 = r0.useCachedSizeField
            if (r14 == 0) goto L298
            long r14 = (long) r10
            r3.putInt(r1, r14, r2)
        L298:
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r15 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r2)
            int r14 = r14 + r15
            int r14 = r14 + r2
            int r14 = r16 + r14
            r2 = r14
            goto L682
        L2a8:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeEnumListNoTag(r2)
            if (r2 <= 0) goto L680
            boolean r14 = r0.useCachedSizeField
            if (r14 == 0) goto L2be
            long r14 = (long) r10
            r3.putInt(r1, r14, r2)
        L2be:
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r15 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r2)
            int r14 = r14 + r15
            int r14 = r14 + r2
            int r14 = r16 + r14
            r2 = r14
            goto L682
        L2ce:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeUInt32ListNoTag(r2)
            if (r2 <= 0) goto L680
            boolean r14 = r0.useCachedSizeField
            if (r14 == 0) goto L2e4
            long r14 = (long) r10
            r3.putInt(r1, r14, r2)
        L2e4:
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r15 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r2)
            int r14 = r14 + r15
            int r14 = r14 + r2
            int r14 = r16 + r14
            r2 = r14
            goto L682
        L2f4:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeBoolListNoTag(r2)
            if (r2 <= 0) goto L680
            boolean r14 = r0.useCachedSizeField
            if (r14 == 0) goto L30a
            long r14 = (long) r10
            r3.putInt(r1, r14, r2)
        L30a:
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r15 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r2)
            int r14 = r14 + r15
            int r14 = r14 + r2
            int r14 = r16 + r14
            r2 = r14
            goto L682
        L31a:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r2)
            if (r2 <= 0) goto L680
            boolean r14 = r0.useCachedSizeField
            if (r14 == 0) goto L330
            long r14 = (long) r10
            r3.putInt(r1, r14, r2)
        L330:
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r15 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r2)
            int r14 = r14 + r15
            int r14 = r14 + r2
            int r14 = r16 + r14
            r2 = r14
            goto L682
        L340:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r2)
            if (r2 <= 0) goto L680
            boolean r14 = r0.useCachedSizeField
            if (r14 == 0) goto L356
            long r14 = (long) r10
            r3.putInt(r1, r14, r2)
        L356:
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r15 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r2)
            int r14 = r14 + r15
            int r14 = r14 + r2
            int r14 = r16 + r14
            r2 = r14
            goto L682
        L366:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeInt32ListNoTag(r2)
            if (r2 <= 0) goto L680
            boolean r14 = r0.useCachedSizeField
            if (r14 == 0) goto L37c
            long r14 = (long) r10
            r3.putInt(r1, r14, r2)
        L37c:
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r15 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r2)
            int r14 = r14 + r15
            int r14 = r14 + r2
            int r14 = r16 + r14
            r2 = r14
            goto L682
        L38c:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeUInt64ListNoTag(r2)
            if (r2 <= 0) goto L680
            boolean r14 = r0.useCachedSizeField
            if (r14 == 0) goto L3a2
            long r14 = (long) r10
            r3.putInt(r1, r14, r2)
        L3a2:
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r15 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r2)
            int r14 = r14 + r15
            int r14 = r14 + r2
            int r14 = r16 + r14
            r2 = r14
            goto L682
        L3b2:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeInt64ListNoTag(r2)
            if (r2 <= 0) goto L680
            boolean r14 = r0.useCachedSizeField
            if (r14 == 0) goto L3c8
            long r14 = (long) r10
            r3.putInt(r1, r14, r2)
        L3c8:
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r15 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r2)
            int r14 = r14 + r15
            int r14 = r14 + r2
            int r14 = r16 + r14
            r2 = r14
            goto L682
        L3d8:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r2)
            if (r2 <= 0) goto L680
            boolean r14 = r0.useCachedSizeField
            if (r14 == 0) goto L3ee
            long r14 = (long) r10
            r3.putInt(r1, r14, r2)
        L3ee:
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r15 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r2)
            int r14 = r14 + r15
            int r14 = r14 + r2
            int r14 = r16 + r14
            r2 = r14
            goto L682
        L3fe:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r2)
            if (r2 <= 0) goto L680
            boolean r14 = r0.useCachedSizeField
            if (r14 == 0) goto L414
            long r14 = (long) r10
            r3.putInt(r1, r14, r2)
        L414:
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r8)
            int r15 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r2)
            int r14 = r14 + r15
            int r14 = r14 + r2
            int r14 = r16 + r14
            r2 = r14
            goto L682
        L424:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeSInt64List(r8, r2, r14)
            int r2 = r16 + r2
            goto L682
        L434:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeSInt32List(r8, r2, r14)
            int r2 = r16 + r2
            goto L682
        L444:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64List(r8, r2, r14)
            int r2 = r16 + r2
            goto L682
        L454:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32List(r8, r2, r14)
            int r2 = r16 + r2
            goto L682
        L464:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeEnumList(r8, r2, r14)
            int r2 = r16 + r2
            goto L682
        L474:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeUInt32List(r8, r2, r14)
            int r2 = r16 + r2
            goto L682
        L484:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeByteStringList(r8, r2)
            int r2 = r16 + r2
            goto L682
        L494:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            com.google.crypto.tink.shaded.protobuf.Schema r14 = r0.getMessageFieldSchema(r6)
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeMessageList(r8, r2, r14)
            int r2 = r16 + r2
            goto L682
        L4a8:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeStringList(r8, r2)
            int r2 = r16 + r2
            goto L682
        L4b8:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeBoolList(r8, r2, r14)
            int r2 = r16 + r2
            goto L682
        L4c8:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32List(r8, r2, r14)
            int r2 = r16 + r2
            goto L682
        L4d8:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64List(r8, r2, r14)
            int r2 = r16 + r2
            goto L682
        L4e8:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeInt32List(r8, r2, r14)
            int r2 = r16 + r2
            goto L682
        L4f8:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeUInt64List(r8, r2, r14)
            int r2 = r16 + r2
            goto L682
        L508:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeInt64List(r8, r2, r14)
            int r2 = r16 + r2
            goto L682
        L518:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32List(r8, r2, r14)
            int r2 = r16 + r2
            goto L682
        L528:
            r16 = r2
            java.lang.Object r2 = r3.getObject(r1, r12)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64List(r8, r2, r14)
            int r2 = r16 + r2
            goto L682
        L538:
            r16 = r2
            r2 = r5 & r11
            if (r2 == 0) goto L680
        L53f:
            java.lang.Object r2 = r3.getObject(r1, r12)
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r2
            com.google.crypto.tink.shaded.protobuf.Schema r14 = r0.getMessageFieldSchema(r6)
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeGroupSize(r8, r2, r14)
            int r2 = r16 + r2
            goto L682
        L551:
            r16 = r2
            r2 = r5 & r11
            if (r2 == 0) goto L680
            long r14 = r3.getLong(r1, r12)
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt64Size(r8, r14)
            int r2 = r16 + r2
            goto L682
        L563:
            r16 = r2
            r2 = r5 & r11
            if (r2 == 0) goto L680
            int r2 = r3.getInt(r1, r12)
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt32Size(r8, r2)
            int r2 = r16 + r2
            goto L682
        L575:
            r16 = r2
            r2 = r5 & r11
            if (r2 == 0) goto L680
            r14 = 0
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed64Size(r8, r14)
            int r2 = r16 + r2
            goto L682
        L585:
            r16 = r2
            r2 = r5 & r11
            if (r2 == 0) goto L680
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed32Size(r8, r14)
            int r2 = r16 + r2
            goto L682
        L593:
            r16 = r2
            r2 = r5 & r11
            if (r2 == 0) goto L680
            int r2 = r3.getInt(r1, r12)
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSize(r8, r2)
            int r2 = r16 + r2
            goto L682
        L5a5:
            r16 = r2
            r2 = r5 & r11
            if (r2 == 0) goto L680
            int r2 = r3.getInt(r1, r12)
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32Size(r8, r2)
            int r2 = r16 + r2
            goto L682
        L5b7:
            r16 = r2
            r2 = r5 & r11
            if (r2 == 0) goto L680
            java.lang.Object r2 = r3.getObject(r1, r12)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSize(r8, r2)
            int r2 = r16 + r14
            goto L682
        L5cb:
            r16 = r2
            r2 = r5 & r11
            if (r2 == 0) goto L680
            java.lang.Object r2 = r3.getObject(r1, r12)
            com.google.crypto.tink.shaded.protobuf.Schema r14 = r0.getMessageFieldSchema(r6)
            int r14 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeMessage(r8, r2, r14)
            int r2 = r16 + r14
            goto L682
        L5e1:
            r16 = r2
            r2 = r5 & r11
            if (r2 == 0) goto L680
            java.lang.Object r2 = r3.getObject(r1, r12)
            boolean r14 = r2 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r14 == 0) goto L5f9
            r14 = r2
            com.google.crypto.tink.shaded.protobuf.ByteString r14 = (com.google.crypto.tink.shaded.protobuf.ByteString) r14
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSize(r8, r14)
            int r14 = r16 + r14
            goto L602
        L5f9:
            r14 = r2
            java.lang.String r14 = (java.lang.String) r14
            int r14 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeStringSize(r8, r14)
            int r14 = r16 + r14
        L602:
            r2 = r14
            goto L682
        L605:
            r16 = r2
            r2 = r5 & r11
            if (r2 == 0) goto L680
            r14 = 1
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBoolSize(r8, r14)
            int r2 = r16 + r2
            goto L682
        L614:
            r16 = r2
            r2 = r5 & r11
            if (r2 == 0) goto L680
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed32Size(r8, r14)
            int r2 = r16 + r2
            goto L682
        L621:
            r16 = r2
            r2 = r5 & r11
            if (r2 == 0) goto L680
            r14 = 0
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed64Size(r8, r14)
            int r2 = r16 + r2
            goto L682
        L630:
            r16 = r2
            r2 = r5 & r11
            if (r2 == 0) goto L680
            int r2 = r3.getInt(r1, r12)
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt32Size(r8, r2)
            int r2 = r16 + r2
            goto L682
        L641:
            r16 = r2
            r2 = r5 & r11
            if (r2 == 0) goto L680
            long r14 = r3.getLong(r1, r12)
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64Size(r8, r14)
            int r2 = r16 + r2
            goto L682
        L652:
            r16 = r2
            r2 = r5 & r11
            if (r2 == 0) goto L680
            long r14 = r3.getLong(r1, r12)
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt64Size(r8, r14)
            int r2 = r16 + r2
            goto L682
        L663:
            r16 = r2
            r2 = r5 & r11
            if (r2 == 0) goto L680
            r14 = 0
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFloatSize(r8, r14)
            int r2 = r16 + r2
            goto L682
        L671:
            r16 = r2
            r2 = r5 & r11
            if (r2 == 0) goto L680
            r14 = 0
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeDoubleSize(r8, r14)
            int r2 = r16 + r2
            goto L682
        L680:
            r2 = r16
        L682:
            int r6 = r6 + 3
            goto Lc
        L686:
            r16 = r2
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r2 = r0.unknownFieldSchema
            int r2 = r0.getUnknownFieldsSerializedSize(r2, r1)
            int r2 = r16 + r2
            boolean r6 = r0.hasExtensions
            if (r6 == 0) goto L69f
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r6 = r0.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r6 = r6.getExtensions(r1)
            int r6 = r6.getSerializedSize()
            int r2 = r2 + r6
        L69f:
            return r2
    }

    private int getSerializedSizeProto3(T r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            r3 = 0
            r4 = 0
        L8:
            int[] r5 = r0.buffer
            int r5 = r5.length
            if (r4 >= r5) goto L57f
            int r5 = r0.typeAndOffsetAt(r4)
            int r6 = type(r5)
            int r7 = r0.numberAt(r4)
            long r8 = offset(r5)
            com.google.crypto.tink.shaded.protobuf.FieldType r10 = com.google.crypto.tink.shaded.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r10 = r10.id()
            r11 = 0
            if (r6 < r10) goto L39
            com.google.crypto.tink.shaded.protobuf.FieldType r10 = com.google.crypto.tink.shaded.protobuf.FieldType.SINT64_LIST_PACKED
            int r10 = r10.id()
            if (r6 > r10) goto L39
            int[] r10 = r0.buffer
            int r12 = r4 + 2
            r10 = r10[r12]
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r12
            goto L3a
        L39:
            r10 = r11
        L3a:
            r12 = 1
            r13 = 0
            r14 = 0
            switch(r6) {
                case 0: goto L56e;
                case 1: goto L562;
                case 2: goto L552;
                case 3: goto L541;
                case 4: goto L531;
                case 5: goto L525;
                case 6: goto L519;
                case 7: goto L50d;
                case 8: goto L4ec;
                case 9: goto L4d7;
                case 10: goto L4c4;
                case 11: goto L4b3;
                case 12: goto L4a2;
                case 13: goto L495;
                case 14: goto L488;
                case 15: goto L477;
                case 16: goto L465;
                case 17: goto L44d;
                case 18: goto L442;
                case 19: goto L437;
                case 20: goto L42b;
                case 21: goto L41f;
                case 22: goto L413;
                case 23: goto L408;
                case 24: goto L3fd;
                case 25: goto L3f2;
                case 26: goto L3e7;
                case 27: goto L3d7;
                case 28: goto L3cb;
                case 29: goto L3bf;
                case 30: goto L3b3;
                case 31: goto L3a8;
                case 32: goto L39d;
                case 33: goto L391;
                case 34: goto L385;
                case 35: goto L362;
                case 36: goto L33f;
                case 37: goto L31c;
                case 38: goto L2f9;
                case 39: goto L2d6;
                case 40: goto L2b3;
                case 41: goto L290;
                case 42: goto L26d;
                case 43: goto L24a;
                case 44: goto L227;
                case 45: goto L204;
                case 46: goto L1e1;
                case 47: goto L1be;
                case 48: goto L19b;
                case 49: goto L18b;
                case 50: goto L17a;
                case 51: goto L16b;
                case 52: goto L15e;
                case 53: goto L14d;
                case 54: goto L13c;
                case 55: goto L12b;
                case 56: goto L11e;
                case 57: goto L111;
                case 58: goto L104;
                case 59: goto Le3;
                case 60: goto Lce;
                case 61: goto Lba;
                case 62: goto La9;
                case 63: goto L98;
                case 64: goto L8b;
                case 65: goto L7e;
                case 66: goto L6d;
                case 67: goto L5c;
                case 68: goto L44;
                default: goto L42;
            }
        L42:
            goto L57b
        L44:
            boolean r11 = r0.isOneofPresent(r1, r7, r4)
            if (r11 == 0) goto L57b
        L4b:
            java.lang.Object r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.MessageLite r11 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r11
            com.google.crypto.tink.shaded.protobuf.Schema r12 = r0.getMessageFieldSchema(r4)
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeGroupSize(r7, r11, r12)
            int r3 = r3 + r11
            goto L57b
        L5c:
            boolean r11 = r0.isOneofPresent(r1, r7, r4)
            if (r11 == 0) goto L57b
            long r11 = oneofLongAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt64Size(r7, r11)
            int r3 = r3 + r11
            goto L57b
        L6d:
            boolean r11 = r0.isOneofPresent(r1, r7, r4)
            if (r11 == 0) goto L57b
            int r11 = oneofIntAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt32Size(r7, r11)
            int r3 = r3 + r11
            goto L57b
        L7e:
            boolean r11 = r0.isOneofPresent(r1, r7, r4)
            if (r11 == 0) goto L57b
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed64Size(r7, r14)
            int r3 = r3 + r11
            goto L57b
        L8b:
            boolean r12 = r0.isOneofPresent(r1, r7, r4)
            if (r12 == 0) goto L57b
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed32Size(r7, r11)
            int r3 = r3 + r11
            goto L57b
        L98:
            boolean r11 = r0.isOneofPresent(r1, r7, r4)
            if (r11 == 0) goto L57b
            int r11 = oneofIntAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSize(r7, r11)
            int r3 = r3 + r11
            goto L57b
        La9:
            boolean r11 = r0.isOneofPresent(r1, r7, r4)
            if (r11 == 0) goto L57b
            int r11 = oneofIntAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32Size(r7, r11)
            int r3 = r3 + r11
            goto L57b
        Lba:
            boolean r11 = r0.isOneofPresent(r1, r7, r4)
            if (r11 == 0) goto L57b
        Lc1:
            java.lang.Object r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.ByteString r11 = (com.google.crypto.tink.shaded.protobuf.ByteString) r11
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSize(r7, r11)
            int r3 = r3 + r11
            goto L57b
        Lce:
            boolean r11 = r0.isOneofPresent(r1, r7, r4)
            if (r11 == 0) goto L57b
            java.lang.Object r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.Schema r12 = r0.getMessageFieldSchema(r4)
            int r12 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeMessage(r7, r11, r12)
            int r3 = r3 + r12
            goto L57b
        Le3:
            boolean r11 = r0.isOneofPresent(r1, r7, r4)
            if (r11 == 0) goto L57b
            java.lang.Object r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r8)
            boolean r12 = r11 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r12 == 0) goto Lfa
            r12 = r11
            com.google.crypto.tink.shaded.protobuf.ByteString r12 = (com.google.crypto.tink.shaded.protobuf.ByteString) r12
            int r12 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSize(r7, r12)
            int r3 = r3 + r12
            goto L102
        Lfa:
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            int r12 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeStringSize(r7, r12)
            int r3 = r3 + r12
        L102:
            goto L57b
        L104:
            boolean r11 = r0.isOneofPresent(r1, r7, r4)
            if (r11 == 0) goto L57b
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBoolSize(r7, r12)
            int r3 = r3 + r11
            goto L57b
        L111:
            boolean r12 = r0.isOneofPresent(r1, r7, r4)
            if (r12 == 0) goto L57b
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed32Size(r7, r11)
            int r3 = r3 + r11
            goto L57b
        L11e:
            boolean r11 = r0.isOneofPresent(r1, r7, r4)
            if (r11 == 0) goto L57b
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed64Size(r7, r14)
            int r3 = r3 + r11
            goto L57b
        L12b:
            boolean r11 = r0.isOneofPresent(r1, r7, r4)
            if (r11 == 0) goto L57b
            int r11 = oneofIntAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt32Size(r7, r11)
            int r3 = r3 + r11
            goto L57b
        L13c:
            boolean r11 = r0.isOneofPresent(r1, r7, r4)
            if (r11 == 0) goto L57b
            long r11 = oneofLongAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64Size(r7, r11)
            int r3 = r3 + r11
            goto L57b
        L14d:
            boolean r11 = r0.isOneofPresent(r1, r7, r4)
            if (r11 == 0) goto L57b
            long r11 = oneofLongAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt64Size(r7, r11)
            int r3 = r3 + r11
            goto L57b
        L15e:
            boolean r11 = r0.isOneofPresent(r1, r7, r4)
            if (r11 == 0) goto L57b
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFloatSize(r7, r13)
            int r3 = r3 + r11
            goto L57b
        L16b:
            boolean r11 = r0.isOneofPresent(r1, r7, r4)
            if (r11 == 0) goto L57b
            r11 = 0
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeDoubleSize(r7, r11)
            int r3 = r3 + r11
            goto L57b
        L17a:
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r11 = r0.mapFieldSchema
            java.lang.Object r12 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r8)
            java.lang.Object r13 = r0.getMapFieldDefaultEntry(r4)
            int r11 = r11.getSerializedSize(r7, r12, r13)
            int r3 = r3 + r11
            goto L57b
        L18b:
            java.util.List r11 = listAt(r1, r8)
            com.google.crypto.tink.shaded.protobuf.Schema r12 = r0.getMessageFieldSchema(r4)
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeGroupList(r7, r11, r12)
            int r3 = r3 + r11
            goto L57b
        L19b:
            java.lang.Object r11 = r2.getObject(r1, r8)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeSInt64ListNoTag(r11)
            if (r11 <= 0) goto L57b
            boolean r12 = r0.useCachedSizeField
            if (r12 == 0) goto L1b0
            long r12 = (long) r10
            r2.putInt(r1, r12, r11)
        L1b0:
            int r12 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r7)
            int r13 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r11)
            int r12 = r12 + r13
            int r12 = r12 + r11
            int r3 = r3 + r12
            goto L57b
        L1be:
            java.lang.Object r11 = r2.getObject(r1, r8)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeSInt32ListNoTag(r11)
            if (r11 <= 0) goto L57b
            boolean r12 = r0.useCachedSizeField
            if (r12 == 0) goto L1d3
            long r12 = (long) r10
            r2.putInt(r1, r12, r11)
        L1d3:
            int r12 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r7)
            int r13 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r11)
            int r12 = r12 + r13
            int r12 = r12 + r11
            int r3 = r3 + r12
            goto L57b
        L1e1:
            java.lang.Object r11 = r2.getObject(r1, r8)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r11)
            if (r11 <= 0) goto L57b
            boolean r12 = r0.useCachedSizeField
            if (r12 == 0) goto L1f6
            long r12 = (long) r10
            r2.putInt(r1, r12, r11)
        L1f6:
            int r12 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r7)
            int r13 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r11)
            int r12 = r12 + r13
            int r12 = r12 + r11
            int r3 = r3 + r12
            goto L57b
        L204:
            java.lang.Object r11 = r2.getObject(r1, r8)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r11)
            if (r11 <= 0) goto L57b
            boolean r12 = r0.useCachedSizeField
            if (r12 == 0) goto L219
            long r12 = (long) r10
            r2.putInt(r1, r12, r11)
        L219:
            int r12 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r7)
            int r13 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r11)
            int r12 = r12 + r13
            int r12 = r12 + r11
            int r3 = r3 + r12
            goto L57b
        L227:
            java.lang.Object r11 = r2.getObject(r1, r8)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeEnumListNoTag(r11)
            if (r11 <= 0) goto L57b
            boolean r12 = r0.useCachedSizeField
            if (r12 == 0) goto L23c
            long r12 = (long) r10
            r2.putInt(r1, r12, r11)
        L23c:
            int r12 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r7)
            int r13 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r11)
            int r12 = r12 + r13
            int r12 = r12 + r11
            int r3 = r3 + r12
            goto L57b
        L24a:
            java.lang.Object r11 = r2.getObject(r1, r8)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeUInt32ListNoTag(r11)
            if (r11 <= 0) goto L57b
            boolean r12 = r0.useCachedSizeField
            if (r12 == 0) goto L25f
            long r12 = (long) r10
            r2.putInt(r1, r12, r11)
        L25f:
            int r12 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r7)
            int r13 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r11)
            int r12 = r12 + r13
            int r12 = r12 + r11
            int r3 = r3 + r12
            goto L57b
        L26d:
            java.lang.Object r11 = r2.getObject(r1, r8)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeBoolListNoTag(r11)
            if (r11 <= 0) goto L57b
            boolean r12 = r0.useCachedSizeField
            if (r12 == 0) goto L282
            long r12 = (long) r10
            r2.putInt(r1, r12, r11)
        L282:
            int r12 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r7)
            int r13 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r11)
            int r12 = r12 + r13
            int r12 = r12 + r11
            int r3 = r3 + r12
            goto L57b
        L290:
            java.lang.Object r11 = r2.getObject(r1, r8)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r11)
            if (r11 <= 0) goto L57b
            boolean r12 = r0.useCachedSizeField
            if (r12 == 0) goto L2a5
            long r12 = (long) r10
            r2.putInt(r1, r12, r11)
        L2a5:
            int r12 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r7)
            int r13 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r11)
            int r12 = r12 + r13
            int r12 = r12 + r11
            int r3 = r3 + r12
            goto L57b
        L2b3:
            java.lang.Object r11 = r2.getObject(r1, r8)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r11)
            if (r11 <= 0) goto L57b
            boolean r12 = r0.useCachedSizeField
            if (r12 == 0) goto L2c8
            long r12 = (long) r10
            r2.putInt(r1, r12, r11)
        L2c8:
            int r12 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r7)
            int r13 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r11)
            int r12 = r12 + r13
            int r12 = r12 + r11
            int r3 = r3 + r12
            goto L57b
        L2d6:
            java.lang.Object r11 = r2.getObject(r1, r8)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeInt32ListNoTag(r11)
            if (r11 <= 0) goto L57b
            boolean r12 = r0.useCachedSizeField
            if (r12 == 0) goto L2eb
            long r12 = (long) r10
            r2.putInt(r1, r12, r11)
        L2eb:
            int r12 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r7)
            int r13 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r11)
            int r12 = r12 + r13
            int r12 = r12 + r11
            int r3 = r3 + r12
            goto L57b
        L2f9:
            java.lang.Object r11 = r2.getObject(r1, r8)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeUInt64ListNoTag(r11)
            if (r11 <= 0) goto L57b
            boolean r12 = r0.useCachedSizeField
            if (r12 == 0) goto L30e
            long r12 = (long) r10
            r2.putInt(r1, r12, r11)
        L30e:
            int r12 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r7)
            int r13 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r11)
            int r12 = r12 + r13
            int r12 = r12 + r11
            int r3 = r3 + r12
            goto L57b
        L31c:
            java.lang.Object r11 = r2.getObject(r1, r8)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeInt64ListNoTag(r11)
            if (r11 <= 0) goto L57b
            boolean r12 = r0.useCachedSizeField
            if (r12 == 0) goto L331
            long r12 = (long) r10
            r2.putInt(r1, r12, r11)
        L331:
            int r12 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r7)
            int r13 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r11)
            int r12 = r12 + r13
            int r12 = r12 + r11
            int r3 = r3 + r12
            goto L57b
        L33f:
            java.lang.Object r11 = r2.getObject(r1, r8)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r11)
            if (r11 <= 0) goto L57b
            boolean r12 = r0.useCachedSizeField
            if (r12 == 0) goto L354
            long r12 = (long) r10
            r2.putInt(r1, r12, r11)
        L354:
            int r12 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r7)
            int r13 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r11)
            int r12 = r12 + r13
            int r12 = r12 + r11
            int r3 = r3 + r12
            goto L57b
        L362:
            java.lang.Object r11 = r2.getObject(r1, r8)
            java.util.List r11 = (java.util.List) r11
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r11)
            if (r11 <= 0) goto L57b
            boolean r12 = r0.useCachedSizeField
            if (r12 == 0) goto L377
            long r12 = (long) r10
            r2.putInt(r1, r12, r11)
        L377:
            int r12 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r7)
            int r13 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r11)
            int r12 = r12 + r13
            int r12 = r12 + r11
            int r3 = r3 + r12
            goto L57b
        L385:
            java.util.List r12 = listAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeSInt64List(r7, r12, r11)
            int r3 = r3 + r11
            goto L57b
        L391:
            java.util.List r12 = listAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeSInt32List(r7, r12, r11)
            int r3 = r3 + r11
            goto L57b
        L39d:
            java.util.List r12 = listAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64List(r7, r12, r11)
            int r3 = r3 + r11
            goto L57b
        L3a8:
            java.util.List r12 = listAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32List(r7, r12, r11)
            int r3 = r3 + r11
            goto L57b
        L3b3:
            java.util.List r12 = listAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeEnumList(r7, r12, r11)
            int r3 = r3 + r11
            goto L57b
        L3bf:
            java.util.List r12 = listAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeUInt32List(r7, r12, r11)
            int r3 = r3 + r11
            goto L57b
        L3cb:
            java.util.List r11 = listAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeByteStringList(r7, r11)
            int r3 = r3 + r11
            goto L57b
        L3d7:
            java.util.List r11 = listAt(r1, r8)
            com.google.crypto.tink.shaded.protobuf.Schema r12 = r0.getMessageFieldSchema(r4)
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeMessageList(r7, r11, r12)
            int r3 = r3 + r11
            goto L57b
        L3e7:
            java.util.List r11 = listAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeStringList(r7, r11)
            int r3 = r3 + r11
            goto L57b
        L3f2:
            java.util.List r12 = listAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeBoolList(r7, r12, r11)
            int r3 = r3 + r11
            goto L57b
        L3fd:
            java.util.List r12 = listAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32List(r7, r12, r11)
            int r3 = r3 + r11
            goto L57b
        L408:
            java.util.List r12 = listAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64List(r7, r12, r11)
            int r3 = r3 + r11
            goto L57b
        L413:
            java.util.List r12 = listAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeInt32List(r7, r12, r11)
            int r3 = r3 + r11
            goto L57b
        L41f:
            java.util.List r12 = listAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeUInt64List(r7, r12, r11)
            int r3 = r3 + r11
            goto L57b
        L42b:
            java.util.List r12 = listAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeInt64List(r7, r12, r11)
            int r3 = r3 + r11
            goto L57b
        L437:
            java.util.List r12 = listAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed32List(r7, r12, r11)
            int r3 = r3 + r11
            goto L57b
        L442:
            java.util.List r12 = listAt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeFixed64List(r7, r12, r11)
            int r3 = r3 + r11
            goto L57b
        L44d:
            boolean r11 = r0.isFieldPresent(r1, r4)
            if (r11 == 0) goto L57b
        L454:
            java.lang.Object r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.MessageLite r11 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r11
            com.google.crypto.tink.shaded.protobuf.Schema r12 = r0.getMessageFieldSchema(r4)
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeGroupSize(r7, r11, r12)
            int r3 = r3 + r11
            goto L57b
        L465:
            boolean r11 = r0.isFieldPresent(r1, r4)
            if (r11 == 0) goto L57b
        L46c:
            long r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt64Size(r7, r11)
            int r3 = r3 + r11
            goto L57b
        L477:
            boolean r11 = r0.isFieldPresent(r1, r4)
            if (r11 == 0) goto L57b
            int r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt32Size(r7, r11)
            int r3 = r3 + r11
            goto L57b
        L488:
            boolean r11 = r0.isFieldPresent(r1, r4)
            if (r11 == 0) goto L57b
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed64Size(r7, r14)
            int r3 = r3 + r11
            goto L57b
        L495:
            boolean r12 = r0.isFieldPresent(r1, r4)
            if (r12 == 0) goto L57b
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed32Size(r7, r11)
            int r3 = r3 + r11
            goto L57b
        L4a2:
            boolean r11 = r0.isFieldPresent(r1, r4)
            if (r11 == 0) goto L57b
            int r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSize(r7, r11)
            int r3 = r3 + r11
            goto L57b
        L4b3:
            boolean r11 = r0.isFieldPresent(r1, r4)
            if (r11 == 0) goto L57b
            int r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32Size(r7, r11)
            int r3 = r3 + r11
            goto L57b
        L4c4:
            boolean r11 = r0.isFieldPresent(r1, r4)
            if (r11 == 0) goto L57b
            java.lang.Object r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.ByteString r11 = (com.google.crypto.tink.shaded.protobuf.ByteString) r11
            int r12 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSize(r7, r11)
            int r3 = r3 + r12
            goto L57b
        L4d7:
            boolean r11 = r0.isFieldPresent(r1, r4)
            if (r11 == 0) goto L57b
            java.lang.Object r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.Schema r12 = r0.getMessageFieldSchema(r4)
            int r12 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.computeSizeMessage(r7, r11, r12)
            int r3 = r3 + r12
            goto L57b
        L4ec:
            boolean r11 = r0.isFieldPresent(r1, r4)
            if (r11 == 0) goto L57b
            java.lang.Object r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r8)
            boolean r12 = r11 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r12 == 0) goto L503
            r12 = r11
            com.google.crypto.tink.shaded.protobuf.ByteString r12 = (com.google.crypto.tink.shaded.protobuf.ByteString) r12
            int r12 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSize(r7, r12)
            int r3 = r3 + r12
            goto L50b
        L503:
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            int r12 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeStringSize(r7, r12)
            int r3 = r3 + r12
        L50b:
            goto L57b
        L50d:
            boolean r11 = r0.isFieldPresent(r1, r4)
            if (r11 == 0) goto L57b
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBoolSize(r7, r12)
            int r3 = r3 + r11
            goto L57b
        L519:
            boolean r12 = r0.isFieldPresent(r1, r4)
            if (r12 == 0) goto L57b
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed32Size(r7, r11)
            int r3 = r3 + r11
            goto L57b
        L525:
            boolean r11 = r0.isFieldPresent(r1, r4)
            if (r11 == 0) goto L57b
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed64Size(r7, r14)
            int r3 = r3 + r11
            goto L57b
        L531:
            boolean r11 = r0.isFieldPresent(r1, r4)
            if (r11 == 0) goto L57b
            int r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt32Size(r7, r11)
            int r3 = r3 + r11
            goto L57b
        L541:
            boolean r11 = r0.isFieldPresent(r1, r4)
            if (r11 == 0) goto L57b
        L548:
            long r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64Size(r7, r11)
            int r3 = r3 + r11
            goto L57b
        L552:
            boolean r11 = r0.isFieldPresent(r1, r4)
            if (r11 == 0) goto L57b
            long r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r1, r8)
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt64Size(r7, r11)
            int r3 = r3 + r11
            goto L57b
        L562:
            boolean r11 = r0.isFieldPresent(r1, r4)
            if (r11 == 0) goto L57b
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFloatSize(r7, r13)
            int r3 = r3 + r11
            goto L57b
        L56e:
            boolean r11 = r0.isFieldPresent(r1, r4)
            if (r11 == 0) goto L57b
            r11 = 0
            int r11 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeDoubleSize(r7, r11)
            int r3 = r3 + r11
        L57b:
            int r4 = r4 + 3
            goto L8
        L57f:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r4 = r0.unknownFieldSchema
            int r4 = r0.getUnknownFieldsSerializedSize(r4, r1)
            int r3 = r3 + r4
            return r3
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r3, T r4) {
            r2 = this;
            java.lang.Object r0 = r3.getFromMessage(r4)
            int r1 = r3.getSerializedSize(r0)
            return r1
    }

    private static <T> int intAt(T r1, long r2) {
            int r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r1, r2)
            return r0
    }

    private static boolean isEnforceUtf8(int r1) {
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 == 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    private boolean isFieldPresent(T r14, int r15) {
            r13 = this;
            int r0 = r13.presenceMaskAndOffsetAt(r15)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r0 & r1
            long r2 = (long) r2
            r4 = 1048575(0xfffff, double:5.18065E-318)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 != 0) goto Lea
            int r1 = r13.typeAndOffsetAt(r15)
            long r7 = offset(r1)
            int r4 = type(r1)
            r9 = 0
            switch(r4) {
                case 0: goto Ldc;
                case 1: goto Ld0;
                case 2: goto Lc6;
                case 3: goto Lbc;
                case 4: goto Lb4;
                case 5: goto Laa;
                case 6: goto La2;
                case 7: goto L9d;
                case 8: goto L7a;
                case 9: goto L72;
                case 10: goto L66;
                case 11: goto L5e;
                case 12: goto L56;
                case 13: goto L4e;
                case 14: goto L44;
                case 15: goto L3c;
                case 16: goto L32;
                case 17: goto L2a;
                default: goto L24;
            }
        L24:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L2a:
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r14, r7)
            if (r4 == 0) goto L31
            r5 = r6
        L31:
            return r5
        L32:
            long r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r14, r7)
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 == 0) goto L3b
            r5 = r6
        L3b:
            return r5
        L3c:
            int r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r14, r7)
            if (r4 == 0) goto L43
            r5 = r6
        L43:
            return r5
        L44:
            long r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r14, r7)
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 == 0) goto L4d
            r5 = r6
        L4d:
            return r5
        L4e:
            int r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r14, r7)
            if (r4 == 0) goto L55
            r5 = r6
        L55:
            return r5
        L56:
            int r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r14, r7)
            if (r4 == 0) goto L5d
            r5 = r6
        L5d:
            return r5
        L5e:
            int r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r14, r7)
            if (r4 == 0) goto L65
            r5 = r6
        L65:
            return r5
        L66:
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r14, r7)
            boolean r4 = r4.equals(r5)
            r4 = r4 ^ r6
            return r4
        L72:
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r14, r7)
            if (r4 == 0) goto L79
            r5 = r6
        L79:
            return r5
        L7a:
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r14, r7)
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L8b
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r6
            return r5
        L8b:
            boolean r5 = r4 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r5 == 0) goto L97
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            boolean r5 = r5.equals(r4)
            r5 = r5 ^ r6
            return r5
        L97:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        L9d:
            boolean r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getBoolean(r14, r7)
            return r4
        La2:
            int r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r14, r7)
            if (r4 == 0) goto La9
            r5 = r6
        La9:
            return r5
        Laa:
            long r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r14, r7)
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 == 0) goto Lb3
            r5 = r6
        Lb3:
            return r5
        Lb4:
            int r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r14, r7)
            if (r4 == 0) goto Lbb
            r5 = r6
        Lbb:
            return r5
        Lbc:
            long r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r14, r7)
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 == 0) goto Lc5
            r5 = r6
        Lc5:
            return r5
        Lc6:
            long r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r14, r7)
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 == 0) goto Lcf
            r5 = r6
        Lcf:
            return r5
        Ld0:
            float r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getFloat(r14, r7)
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            if (r4 == 0) goto Ldb
            r5 = r6
        Ldb:
            return r5
        Ldc:
            double r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getDouble(r14, r7)
            long r11 = java.lang.Double.doubleToRawLongBits(r11)
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 == 0) goto Le9
            r5 = r6
        Le9:
            return r5
        Lea:
            int r4 = r0 >>> 20
            int r4 = r6 << r4
            r1 = r1 & r0
            long r7 = (long) r1
            int r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r14, r7)
            r1 = r1 & r4
            if (r1 == 0) goto Lf8
            r5 = r6
        Lf8:
            return r5
    }

    private boolean isFieldPresent(T r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != r0) goto La
            boolean r0 = r1.isFieldPresent(r2, r3)
            return r0
        La:
            r0 = r5 & r6
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    private static boolean isInitialized(java.lang.Object r2, int r3, com.google.crypto.tink.shaded.protobuf.Schema r4) {
            long r0 = offset(r3)
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r2, r0)
            boolean r1 = r4.isInitialized(r0)
            return r1
    }

    private <N> boolean isListInitialized(java.lang.Object r7, int r8, int r9) {
            r6 = this;
            long r0 = offset(r8)
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r7, r0)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            r2 = 1
            if (r1 == 0) goto L12
            return r2
        L12:
            com.google.crypto.tink.shaded.protobuf.Schema r1 = r6.getMessageFieldSchema(r9)
            r3 = 0
        L17:
            int r4 = r0.size()
            if (r3 >= r4) goto L2c
            java.lang.Object r4 = r0.get(r3)
            boolean r5 = r1.isInitialized(r4)
            if (r5 != 0) goto L29
            r2 = 0
            return r2
        L29:
            int r3 = r3 + 1
            goto L17
        L2c:
            return r2
    }

    private boolean isMapInitialized(T r10, int r11, int r12) {
            r9 = this;
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r0 = r9.mapFieldSchema
            long r1 = offset(r11)
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r10, r1)
            java.util.Map r0 = r0.forMapData(r1)
            boolean r1 = r0.isEmpty()
            r2 = 1
            if (r1 == 0) goto L16
            return r2
        L16:
            java.lang.Object r1 = r9.getMapFieldDefaultEntry(r12)
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r3 = r9.mapFieldSchema
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata r3 = r3.forMapMetadata(r1)
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r4 = r3.valueType
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r4 = r4.getJavaType()
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
            if (r4 == r5) goto L2b
            return r2
        L2b:
            r4 = 0
            java.util.Collection r5 = r0.values()
            java.util.Iterator r5 = r5.iterator()
        L34:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L55
            java.lang.Object r6 = r5.next()
            if (r4 != 0) goto L4c
            com.google.crypto.tink.shaded.protobuf.Protobuf r7 = com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance()
            java.lang.Class r8 = r6.getClass()
            com.google.crypto.tink.shaded.protobuf.Schema r4 = r7.schemaFor(r8)
        L4c:
            boolean r7 = r4.isInitialized(r6)
            if (r7 != 0) goto L54
            r2 = 0
            return r2
        L54:
            goto L34
        L55:
            return r2
    }

    private static boolean isMutable(java.lang.Object r1) {
            if (r1 != 0) goto L4
            r0 = 0
            return r0
        L4:
            boolean r0 = r1 instanceof com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
            if (r0 == 0) goto L10
            r0 = r1
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            boolean r0 = r0.isMutable()
            return r0
        L10:
            r0 = 1
            return r0
    }

    private boolean isOneofCaseEqual(T r6, T r7, int r8) {
            r5 = this;
            int r0 = r5.presenceMaskAndOffsetAt(r8)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r0 & r1
            long r2 = (long) r2
            int r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r6, r2)
            r1 = r1 & r0
            long r3 = (long) r1
            int r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r7, r3)
            if (r2 != r1) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            return r1
    }

    private boolean isOneofPresent(T r4, int r5, int r6) {
            r3 = this;
            int r0 = r3.presenceMaskAndOffsetAt(r6)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r1 = (long) r1
            int r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r4, r1)
            if (r1 != r5) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    private static boolean isRequired(int r1) {
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r0 = r0 & r1
            if (r0 == 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    private static java.util.List<?> listAt(java.lang.Object r1, long r2) {
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r2)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    private static <T> long longAt(T r2, long r3) {
            long r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r2, r3)
            return r0
    }

    private <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r17, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<ET> r18, T r19, com.google.crypto.tink.shaded.protobuf.Reader r20, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r21) throws java.io.IOException {
            r16 = this;
            r1 = r16
            r7 = r21
            r0 = 0
            r2 = 0
            r5 = r0
            r8 = r2
        L8:
            int r2 = r20.getFieldNumber()     // Catch: java.lang.Throwable -> L88a
            r9 = r2
            int r3 = r1.positionForFieldNumber(r9)     // Catch: java.lang.Throwable -> L88a
            r10 = r3
            if (r10 >= 0) goto Led
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r9 != r0) goto L3e
            int r0 = r1.checkInitializedCount
            r4 = r5
        L1c:
            int r2 = r1.repeatedFieldOffsetStart
            if (r0 >= r2) goto L33
            int[] r2 = r1.intArray
            r3 = r2[r0]
            r6 = r19
            r5 = r17
            r2 = r19
            java.lang.Object r4 = r1.filterMapUnknownEnumValues(r2, r3, r4, r5, r6)
            r11 = r1
            r6 = r5
            int r0 = r0 + 1
            goto L1c
        L33:
            r6 = r17
            r2 = r19
            r11 = r1
            if (r4 == 0) goto L3d
            r6.setBuilderToMessage(r2, r4)
        L3d:
            return
        L3e:
            r6 = r17
            r2 = r19
            r11 = r1
            boolean r0 = r11.hasExtensions     // Catch: java.lang.Throwable -> Le0
            if (r0 != 0) goto L4c
            r0 = 0
            r1 = r18
            r4 = r0
            goto L55
        L4c:
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r11.defaultInstance     // Catch: java.lang.Throwable -> Le0
            r1 = r18
            java.lang.Object r0 = r1.findExtensionByNumber(r7, r0, r9)     // Catch: java.lang.Throwable -> Le0
            r4 = r0
        L55:
            if (r4 == 0) goto L8b
            if (r8 != 0) goto L66
            com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r18.getMutableExtensions(r19)     // Catch: java.lang.Throwable -> L60
            r8 = r0
            goto L66
        L60:
            r0 = move-exception
            r13 = r20
            r1 = r11
            goto L892
        L66:
            r3 = r7
            r7 = r5
            r5 = r3
            r3 = r8
            r8 = r6
            r6 = r3
            r3 = r20
            java.lang.Object r0 = r1.parseExtension(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L7d
            r14 = r4
            r13 = r5
            r12 = r7
            r5 = r8
            r7 = r3
            r5 = r0
            r8 = r6
            r1 = r11
            r7 = r13
            goto L8
        L7d:
            r0 = move-exception
            r13 = r5
            r12 = r7
            r5 = r8
            r7 = r3
            r1 = r13
            r13 = r7
            r7 = r1
            r8 = r6
            r1 = r11
            r6 = r5
            r5 = r12
            goto L892
        L8b:
            r14 = r4
            r12 = r5
            r5 = r6
            r13 = r7
            r7 = r20
            boolean r0 = r5.shouldDiscardUnknownFields(r7)     // Catch: java.lang.Throwable -> Ldb
            if (r0 == 0) goto Laa
            boolean r0 = r7.skipField()     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto Lbc
            r1 = r11
            r5 = r12
            r7 = r13
            goto L8
        La2:
            r0 = move-exception
            r1 = r13
            r13 = r7
            r7 = r1
            r6 = r5
            r1 = r11
            goto L888
        Laa:
            if (r12 != 0) goto Lb1
            java.lang.Object r0 = r5.getBuilderFromMessage(r2)     // Catch: java.lang.Throwable -> La2
            r12 = r0
        Lb1:
            boolean r0 = r5.mergeOneFieldFrom(r12, r7)     // Catch: java.lang.Throwable -> Ldb
            if (r0 == 0) goto Lbc
            r1 = r11
            r5 = r12
            r7 = r13
            goto L8
        Lbc:
            int r0 = r11.checkInitializedCount
            r4 = r12
        Lbf:
            int r1 = r11.repeatedFieldOffsetStart
            if (r0 >= r1) goto Ld3
            int[] r1 = r11.intArray
            r3 = r1[r0]
            r6 = r19
            r1 = r11
            java.lang.Object r4 = r1.filterMapUnknownEnumValues(r2, r3, r4, r5, r6)
            r11 = r5
            int r0 = r0 + 1
            r11 = r1
            goto Lbf
        Ld3:
            r1 = r11
            r11 = r5
            if (r4 == 0) goto Lda
            r11.setBuilderToMessage(r2, r4)
        Lda:
            return
        Ldb:
            r0 = move-exception
            r1 = r11
            r11 = r5
            goto L2c1
        Le0:
            r0 = move-exception
            r12 = r5
            r13 = r7
            r1 = r11
            r7 = r20
            r11 = r6
            r5 = r13
            r13 = r7
            r7 = r5
            r5 = r12
            goto L892
        Led:
            r11 = r17
            r2 = r19
            r12 = r5
            r13 = r7
            r7 = r20
            int r3 = r1.typeAndOffsetAt(r10)     // Catch: java.lang.Throwable -> L883
            r14 = r3
            int r0 = type(r14)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L824 java.lang.Throwable -> L883
            switch(r0) {
                case 0: goto L7d9;
                case 1: goto L7c7;
                case 2: goto L7b5;
                case 3: goto L7a3;
                case 4: goto L791;
                case 5: goto L77e;
                case 6: goto L76b;
                case 7: goto L758;
                case 8: goto L74d;
                case 9: goto L737;
                case 10: goto L724;
                case 11: goto L711;
                case 12: goto L6e8;
                case 13: goto L6d5;
                case 14: goto L6c2;
                case 15: goto L6af;
                case 16: goto L69c;
                case 17: goto L686;
                case 18: goto L674;
                case 19: goto L662;
                case 20: goto L650;
                case 21: goto L63e;
                case 22: goto L62c;
                case 23: goto L61a;
                case 24: goto L608;
                case 25: goto L5f6;
                case 26: goto L5ee;
                case 27: goto L5c5;
                case 28: goto L5a1;
                case 29: goto L58d;
                case 30: goto L53e;
                case 31: goto L513;
                case 32: goto L4f9;
                case 33: goto L4df;
                case 34: goto L4c5;
                case 35: goto L4ab;
                case 36: goto L491;
                case 37: goto L477;
                case 38: goto L45d;
                case 39: goto L443;
                case 40: goto L429;
                case 41: goto L40f;
                case 42: goto L3f5;
                case 43: goto L3db;
                case 44: goto L38b;
                case 45: goto L377;
                case 46: goto L363;
                case 47: goto L34f;
                case 48: goto L33b;
                case 49: goto L2f8;
                case 50: goto L2cc;
                case 51: goto L2a8;
                case 52: goto L290;
                case 53: goto L278;
                case 54: goto L260;
                case 55: goto L248;
                case 56: goto L230;
                case 57: goto L218;
                case 58: goto L200;
                case 59: goto L1f5;
                case 60: goto L1de;
                case 61: goto L1cb;
                case 62: goto L1b3;
                case 63: goto L183;
                case 64: goto L16b;
                case 65: goto L153;
                case 66: goto L13b;
                case 67: goto L123;
                case 68: goto L10c;
                default: goto L101;
            }
        L101:
            r15 = r13
            r13 = r7
            r7 = r15
            if (r12 != 0) goto L7f5
            java.lang.Object r0 = r11.getBuilderFromMessage(r2)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7f3
        L10c:
            java.lang.Object r0 = r1.mutableOneofMessageFieldForMerge(r2, r9, r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.Schema r3 = r1.getMessageFieldSchema(r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r7.mergeGroupField(r0, r3, r13)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r1.storeOneofMessageField(r2, r9, r10, r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r15 = r13
            r13 = r7
            r7 = r15
            goto L7eb
        L123:
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            long r5 = r7.readSInt64()     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r2, r3, r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r1.setOneofPresent(r2, r9, r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r15 = r13
            r13 = r7
            r7 = r15
            goto L7eb
        L13b:
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            int r0 = r7.readSInt32()     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r2, r3, r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r1.setOneofPresent(r2, r9, r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r15 = r13
            r13 = r7
            r7 = r15
            goto L7eb
        L153:
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            long r5 = r7.readSFixed64()     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r2, r3, r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r1.setOneofPresent(r2, r9, r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r15 = r13
            r13 = r7
            r7 = r15
            goto L7eb
        L16b:
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            int r0 = r7.readSFixed32()     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r2, r3, r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r1.setOneofPresent(r2, r9, r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r15 = r13
            r13 = r7
            r7 = r15
            goto L7eb
        L183:
            int r0 = r7.readEnum()     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r3 = r1.getEnumFieldVerifier(r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            if (r3 == 0) goto L1a0
            boolean r4 = r3.isInRange(r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            if (r4 == 0) goto L194
            goto L1a0
        L194:
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.storeUnknownEnum(r2, r9, r0, r12, r11)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r5 = r4
            r6 = r13
            r13 = r7
            r7 = r6
            r6 = r11
            goto L81b
        L1a0:
            long r4 = offset(r14)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r2, r4, r6)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r1.setOneofPresent(r2, r9, r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r15 = r13
            r13 = r7
            r7 = r15
            goto L7eb
        L1b3:
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            int r0 = r7.readUInt32()     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r2, r3, r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r1.setOneofPresent(r2, r9, r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r15 = r13
            r13 = r7
            r7 = r15
            goto L7eb
        L1cb:
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r7.readBytes()     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r2, r3, r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r1.setOneofPresent(r2, r9, r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r15 = r13
            r13 = r7
            r7 = r15
            goto L7eb
        L1de:
            java.lang.Object r0 = r1.mutableOneofMessageFieldForMerge(r2, r9, r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.Schema r3 = r1.getMessageFieldSchema(r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r7.mergeMessageField(r0, r3, r13)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r1.storeOneofMessageField(r2, r9, r10, r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r15 = r13
            r13 = r7
            r7 = r15
            goto L7eb
        L1f5:
            r1.readString(r2, r14, r7)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r1.setOneofPresent(r2, r9, r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r15 = r13
            r13 = r7
            r7 = r15
            goto L7eb
        L200:
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            boolean r0 = r7.readBool()     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r2, r3, r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r1.setOneofPresent(r2, r9, r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r15 = r13
            r13 = r7
            r7 = r15
            goto L7eb
        L218:
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            int r0 = r7.readFixed32()     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r2, r3, r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r1.setOneofPresent(r2, r9, r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r15 = r13
            r13 = r7
            r7 = r15
            goto L7eb
        L230:
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            long r5 = r7.readFixed64()     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r2, r3, r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r1.setOneofPresent(r2, r9, r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r15 = r13
            r13 = r7
            r7 = r15
            goto L7eb
        L248:
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            int r0 = r7.readInt32()     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r2, r3, r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r1.setOneofPresent(r2, r9, r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r15 = r13
            r13 = r7
            r7 = r15
            goto L7eb
        L260:
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            long r5 = r7.readUInt64()     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r2, r3, r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r1.setOneofPresent(r2, r9, r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r15 = r13
            r13 = r7
            r7 = r15
            goto L7eb
        L278:
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            long r5 = r7.readInt64()     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r2, r3, r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r1.setOneofPresent(r2, r9, r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r15 = r13
            r13 = r7
            r7 = r15
            goto L7eb
        L290:
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            float r0 = r7.readFloat()     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r2, r3, r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r1.setOneofPresent(r2, r9, r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r15 = r13
            r13 = r7
            r7 = r15
            goto L7eb
        L2a8:
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            double r5 = r7.readDouble()     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            java.lang.Double r0 = java.lang.Double.valueOf(r5)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r2, r3, r0)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r1.setOneofPresent(r2, r9, r10)     // Catch: java.lang.Throwable -> L2c0 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2c6
            r15 = r13
            r13 = r7
            r7 = r15
            goto L7eb
        L2c0:
            r0 = move-exception
        L2c1:
            r5 = r13
            r13 = r7
            r7 = r5
            goto L887
        L2c6:
            r0 = move-exception
            r5 = r13
            r13 = r7
            r7 = r5
            goto L828
        L2cc:
            java.lang.Object r4 = r1.getMapFieldDefaultEntry(r10)     // Catch: java.lang.Throwable -> L2ea com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2f1
            r6 = r7
            r3 = r10
            r5 = r13
            r1.mergeMap(r2, r3, r4, r5, r6)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L2de java.lang.Throwable -> L2ea
            r2 = r19
            r13 = r20
            r7 = r21
            goto L7eb
        L2de:
            r0 = move-exception
            r10 = r3
            r2 = r19
            r13 = r20
            r7 = r21
            r6 = r11
            r5 = r12
            goto L82a
        L2ea:
            r0 = move-exception
            r2 = r19
            r13 = r20
            goto L5e4
        L2f1:
            r0 = move-exception
            r2 = r19
            r13 = r20
            goto L5ea
        L2f8:
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L323 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L32f
            com.google.crypto.tink.shaded.protobuf.Schema r6 = r1.getMessageFieldSchema(r10)     // Catch: java.lang.Throwable -> L323 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L32f
            r2 = r19
            r5 = r20
            r7 = r21
            r1.readGroupList(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L311 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L31a
            r7 = r1
            r13 = r5
            r1 = r7
            r7 = r21
            goto L7eb
        L311:
            r0 = move-exception
            r7 = r1
            r13 = r5
            r6 = r11
            r5 = r12
            r7 = r21
            goto L892
        L31a:
            r0 = move-exception
            r7 = r1
            r13 = r5
            r6 = r11
            r5 = r12
            r7 = r21
            goto L82a
        L323:
            r0 = move-exception
            r2 = r19
            r13 = r20
            r7 = r1
            r6 = r11
            r5 = r12
            r7 = r21
            goto L892
        L32f:
            r0 = move-exception
            r2 = r19
            r13 = r20
            r7 = r1
            r6 = r11
            r5 = r12
            r7 = r21
            goto L82a
        L33b:
            r13 = r7
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            r13.readSInt64List(r0)     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            r1 = r7
            r7 = r21
            goto L7eb
        L34f:
            r13 = r7
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            r13.readSInt32List(r0)     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            r1 = r7
            r7 = r21
            goto L7eb
        L363:
            r13 = r7
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            r13.readSFixed64List(r0)     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            r1 = r7
            r7 = r21
            goto L7eb
        L377:
            r13 = r7
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            r13.readSFixed32List(r0)     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            r1 = r7
            r7 = r21
            goto L7eb
        L38b:
            r13 = r7
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L3c8 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L3d1
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L3c8 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L3d1
            java.util.List r3 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L3c8 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L3d1
            r13.readEnumList(r3)     // Catch: java.lang.Throwable -> L3c8 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L3d1
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r4 = r7.getEnumFieldVerifier(r10)     // Catch: java.lang.Throwable -> L3c8 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L3d1
            r1 = r2
            r2 = r9
            r6 = r11
            r5 = r12
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.filterUnknownEnumList(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3b3 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L3bc
            r15 = r2
            r2 = r1
            r1 = r15
            r5 = r0
            r6 = r17
            r9 = r1
            r1 = r7
            r7 = r21
            goto L81b
        L3b3:
            r0 = move-exception
            r2 = r1
            r6 = r17
            r1 = r7
            r7 = r21
            goto L892
        L3bc:
            r0 = move-exception
            r15 = r2
            r2 = r1
            r1 = r15
            r6 = r17
            r9 = r1
            r1 = r7
            r7 = r21
            goto L82a
        L3c8:
            r0 = move-exception
            r5 = r12
            r6 = r17
            r1 = r7
            r7 = r21
            goto L892
        L3d1:
            r0 = move-exception
            r1 = r9
            r5 = r12
            r6 = r17
            r1 = r7
            r7 = r21
            goto L82a
        L3db:
            r13 = r7
            r5 = r12
            r7 = r1
            r1 = r9
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r13.readUInt32List(r0)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r11 = r17
            r9 = r1
            r12 = r5
            r1 = r7
            r7 = r21
            goto L7eb
        L3f5:
            r13 = r7
            r5 = r12
            r7 = r1
            r1 = r9
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r13.readBoolList(r0)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r11 = r17
            r9 = r1
            r12 = r5
            r1 = r7
            r7 = r21
            goto L7eb
        L40f:
            r13 = r7
            r5 = r12
            r7 = r1
            r1 = r9
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r13.readFixed32List(r0)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r11 = r17
            r9 = r1
            r12 = r5
            r1 = r7
            r7 = r21
            goto L7eb
        L429:
            r13 = r7
            r5 = r12
            r7 = r1
            r1 = r9
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r13.readFixed64List(r0)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r11 = r17
            r9 = r1
            r12 = r5
            r1 = r7
            r7 = r21
            goto L7eb
        L443:
            r13 = r7
            r5 = r12
            r7 = r1
            r1 = r9
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r13.readInt32List(r0)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r11 = r17
            r9 = r1
            r12 = r5
            r1 = r7
            r7 = r21
            goto L7eb
        L45d:
            r13 = r7
            r5 = r12
            r7 = r1
            r1 = r9
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r13.readUInt64List(r0)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r11 = r17
            r9 = r1
            r12 = r5
            r1 = r7
            r7 = r21
            goto L7eb
        L477:
            r13 = r7
            r5 = r12
            r7 = r1
            r1 = r9
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r13.readInt64List(r0)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r11 = r17
            r9 = r1
            r12 = r5
            r1 = r7
            r7 = r21
            goto L7eb
        L491:
            r13 = r7
            r5 = r12
            r7 = r1
            r1 = r9
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r13.readFloatList(r0)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r11 = r17
            r9 = r1
            r12 = r5
            r1 = r7
            r7 = r21
            goto L7eb
        L4ab:
            r13 = r7
            r5 = r12
            r7 = r1
            r1 = r9
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r13.readDoubleList(r0)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r11 = r17
            r9 = r1
            r12 = r5
            r1 = r7
            r7 = r21
            goto L7eb
        L4c5:
            r13 = r7
            r5 = r12
            r7 = r1
            r1 = r9
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r13.readSInt64List(r0)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r11 = r17
            r9 = r1
            r12 = r5
            r1 = r7
            r7 = r21
            goto L7eb
        L4df:
            r13 = r7
            r5 = r12
            r7 = r1
            r1 = r9
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r13.readSInt32List(r0)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r11 = r17
            r9 = r1
            r12 = r5
            r1 = r7
            r7 = r21
            goto L7eb
        L4f9:
            r13 = r7
            r5 = r12
            r7 = r1
            r1 = r9
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r13.readSFixed64List(r0)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r11 = r17
            r9 = r1
            r12 = r5
            r1 = r7
            r7 = r21
            goto L7eb
        L513:
            r13 = r7
            r5 = r12
            r7 = r1
            r1 = r9
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r13.readSFixed32List(r0)     // Catch: java.lang.Throwable -> L52d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L535
            r11 = r17
            r9 = r1
            r12 = r5
            r1 = r7
            r7 = r21
            goto L7eb
        L52d:
            r0 = move-exception
            r6 = r17
            r1 = r7
            r7 = r21
            goto L892
        L535:
            r0 = move-exception
            r6 = r17
            r9 = r1
            r1 = r7
            r7 = r21
            goto L82a
        L53e:
            r13 = r7
            r5 = r12
            r7 = r1
            r1 = r9
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L578 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L582
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L578 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L582
            java.util.List r3 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L578 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L582
            r13.readEnumList(r3)     // Catch: java.lang.Throwable -> L578 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L582
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r4 = r7.getEnumFieldVerifier(r10)     // Catch: java.lang.Throwable -> L578 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L582
            r6 = r2
            r2 = r1
            r1 = r6
            r6 = r17
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.filterUnknownEnumList(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L568 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L56e
            r9 = r2
            r12 = r5
            r11 = r6
            r2 = r1
            r5 = r0
            r1 = r7
            r6 = r11
            r7 = r21
            goto L81b
        L568:
            r0 = move-exception
            r2 = r1
            r12 = r5
            r11 = r6
            r1 = r7
            goto L57e
        L56e:
            r0 = move-exception
            r9 = r2
            r12 = r5
            r11 = r6
            r2 = r1
            r1 = r7
            r7 = r21
            goto L82a
        L578:
            r0 = move-exception
            r11 = r17
            r12 = r5
            r1 = r7
            r6 = r11
        L57e:
            r7 = r21
            goto L892
        L582:
            r0 = move-exception
            r11 = r17
            r9 = r1
            r12 = r5
            r1 = r7
            r6 = r11
            r7 = r21
            goto L82a
        L58d:
            r13 = r7
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            r13.readUInt32List(r0)     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            r1 = r7
            r7 = r21
            goto L7eb
        L5a1:
            r13 = r7
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r7.listFieldSchema     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            r13.readBytesList(r0)     // Catch: java.lang.Throwable -> L5b5 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5bd
            r1 = r7
            r7 = r21
            goto L7eb
        L5b5:
            r0 = move-exception
            r1 = r7
            r6 = r11
            r5 = r12
            r7 = r21
            goto L892
        L5bd:
            r0 = move-exception
            r1 = r7
            r6 = r11
            r5 = r12
            r7 = r21
            goto L82a
        L5c5:
            r13 = r7
            r7 = r1
            com.google.crypto.tink.shaded.protobuf.Schema r5 = r7.getMessageFieldSchema(r10)     // Catch: java.lang.Throwable -> L5e2 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5e8
            r6 = r21
            r1 = r7
            r4 = r13
            r3 = r14
            r1.readMessageList(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L5d6 com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5da
            r7 = r6
            goto L7eb
        L5d6:
            r0 = move-exception
            r13 = r4
            goto L886
        L5da:
            r0 = move-exception
            r14 = r3
            r13 = r4
            r7 = r6
            r6 = r11
            r5 = r12
            goto L82a
        L5e2:
            r0 = move-exception
            r1 = r7
        L5e4:
            r7 = r21
            goto L887
        L5e8:
            r0 = move-exception
            r1 = r7
        L5ea:
            r7 = r21
            goto L828
        L5ee:
            r15 = r13
            r13 = r7
            r7 = r15
            r1.readStringList(r2, r14, r13)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L5f6:
            r15 = r13
            r13 = r7
            r7 = r15
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r1.listFieldSchema     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r13.readBoolList(r0)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L608:
            r15 = r13
            r13 = r7
            r7 = r15
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r1.listFieldSchema     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r13.readFixed32List(r0)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L61a:
            r15 = r13
            r13 = r7
            r7 = r15
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r1.listFieldSchema     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r13.readFixed64List(r0)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L62c:
            r15 = r13
            r13 = r7
            r7 = r15
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r1.listFieldSchema     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r13.readInt32List(r0)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L63e:
            r15 = r13
            r13 = r7
            r7 = r15
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r1.listFieldSchema     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r13.readUInt64List(r0)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L650:
            r15 = r13
            r13 = r7
            r7 = r15
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r1.listFieldSchema     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r13.readInt64List(r0)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L662:
            r15 = r13
            r13 = r7
            r7 = r15
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r1.listFieldSchema     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r13.readFloatList(r0)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L674:
            r15 = r13
            r13 = r7
            r7 = r15
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r1.listFieldSchema     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            java.util.List r0 = r0.mutableListAt(r2, r3)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r13.readDoubleList(r0)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L686:
            r15 = r13
            r13 = r7
            r7 = r15
            java.lang.Object r0 = r1.mutableMessageFieldForMerge(r2, r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.Schema r3 = r1.getMessageFieldSchema(r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r13.mergeGroupField(r0, r3, r7)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r1.storeMessageField(r2, r10, r0)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L69c:
            r15 = r13
            r13 = r7
            r7 = r15
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            long r5 = r13.readSInt64()     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putLong(r2, r3, r5)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r1.setFieldPresent(r2, r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L6af:
            r15 = r13
            r13 = r7
            r7 = r15
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            int r0 = r13.readSInt32()     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r2, r3, r0)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r1.setFieldPresent(r2, r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L6c2:
            r15 = r13
            r13 = r7
            r7 = r15
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            long r5 = r13.readSFixed64()     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putLong(r2, r3, r5)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r1.setFieldPresent(r2, r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L6d5:
            r15 = r13
            r13 = r7
            r7 = r15
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            int r0 = r13.readSFixed32()     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r2, r3, r0)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r1.setFieldPresent(r2, r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L6e8:
            r15 = r13
            r13 = r7
            r7 = r15
            int r0 = r13.readEnum()     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r3 = r1.getEnumFieldVerifier(r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            if (r3 == 0) goto L705
            boolean r4 = r3.isInRange(r0)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            if (r4 == 0) goto L6fc
            goto L705
        L6fc:
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.SchemaUtil.storeUnknownEnum(r2, r9, r0, r12, r11)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r5 = r4
            r6 = r11
            goto L81b
        L705:
            long r4 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r2, r4, r0)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r1.setFieldPresent(r2, r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L711:
            r15 = r13
            r13 = r7
            r7 = r15
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            int r0 = r13.readUInt32()     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r2, r3, r0)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r1.setFieldPresent(r2, r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L724:
            r15 = r13
            r13 = r7
            r7 = r15
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r13.readBytes()     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r2, r3, r0)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r1.setFieldPresent(r2, r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L737:
            r15 = r13
            r13 = r7
            r7 = r15
            java.lang.Object r0 = r1.mutableMessageFieldForMerge(r2, r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.Schema r3 = r1.getMessageFieldSchema(r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r13.mergeMessageField(r0, r3, r7)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r1.storeMessageField(r2, r10, r0)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L74d:
            r15 = r13
            r13 = r7
            r7 = r15
            r1.readString(r2, r14, r13)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r1.setFieldPresent(r2, r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L758:
            r15 = r13
            r13 = r7
            r7 = r15
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            boolean r0 = r13.readBool()     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putBoolean(r2, r3, r0)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r1.setFieldPresent(r2, r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L76b:
            r15 = r13
            r13 = r7
            r7 = r15
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            int r0 = r13.readFixed32()     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r2, r3, r0)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r1.setFieldPresent(r2, r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L77e:
            r15 = r13
            r13 = r7
            r7 = r15
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            long r5 = r13.readFixed64()     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putLong(r2, r3, r5)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r1.setFieldPresent(r2, r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L791:
            r15 = r13
            r13 = r7
            r7 = r15
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            int r0 = r13.readInt32()     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r2, r3, r0)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r1.setFieldPresent(r2, r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L7a3:
            r15 = r13
            r13 = r7
            r7 = r15
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            long r5 = r13.readUInt64()     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putLong(r2, r3, r5)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r1.setFieldPresent(r2, r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L7b5:
            r15 = r13
            r13 = r7
            r7 = r15
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            long r5 = r13.readInt64()     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putLong(r2, r3, r5)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r1.setFieldPresent(r2, r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L7c7:
            r15 = r13
            r13 = r7
            r7 = r15
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            float r0 = r13.readFloat()     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putFloat(r2, r3, r0)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r1.setFieldPresent(r2, r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            goto L7eb
        L7d9:
            r15 = r13
            r13 = r7
            r7 = r15
            long r3 = offset(r14)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            double r5 = r13.readDouble()     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putDouble(r2, r3, r5)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
            r1.setFieldPresent(r2, r10)     // Catch: java.lang.Throwable -> L7ee com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L7f1
        L7eb:
            r6 = r11
            r5 = r12
            goto L81b
        L7ee:
            r0 = move-exception
            goto L887
        L7f1:
            r0 = move-exception
            goto L828
        L7f3:
            r5 = r0
            goto L7f6
        L7f5:
            r5 = r12
        L7f6:
            boolean r0 = r11.mergeOneFieldFrom(r5, r13)     // Catch: java.lang.Throwable -> L81d com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L821
            if (r0 != 0) goto L81a
            int r0 = r1.checkInitializedCount
            r4 = r5
        L7ff:
            int r3 = r1.repeatedFieldOffsetStart
            if (r0 >= r3) goto L813
            int[] r3 = r1.intArray
            r3 = r3[r0]
            r6 = r19
            r5 = r11
            java.lang.Object r4 = r1.filterMapUnknownEnumValues(r2, r3, r4, r5, r6)
            r6 = r5
            int r0 = r0 + 1
            r11 = r6
            goto L7ff
        L813:
            r6 = r11
            if (r4 == 0) goto L819
            r6.setBuilderToMessage(r2, r4)
        L819:
            return
        L81a:
            r6 = r11
        L81b:
            goto L87f
        L81d:
            r0 = move-exception
            r6 = r11
            goto L892
        L821:
            r0 = move-exception
            r6 = r11
            goto L82a
        L824:
            r0 = move-exception
            r6 = r13
            r13 = r7
            r7 = r6
        L828:
            r6 = r11
            r5 = r12
        L82a:
            boolean r3 = r6.shouldDiscardUnknownFields(r13)     // Catch: java.lang.Throwable -> L881
            if (r3 == 0) goto L854
            boolean r3 = r13.skipField()     // Catch: java.lang.Throwable -> L881
            if (r3 != 0) goto L87f
            int r3 = r1.checkInitializedCount
            r11 = r3
            r4 = r5
        L83a:
            int r3 = r1.repeatedFieldOffsetStart
            if (r11 >= r3) goto L84e
            int[] r3 = r1.intArray
            r3 = r3[r11]
            r6 = r19
            r5 = r17
            java.lang.Object r4 = r1.filterMapUnknownEnumValues(r2, r3, r4, r5, r6)
            r6 = r5
            int r11 = r11 + 1
            goto L83a
        L84e:
            if (r4 == 0) goto L853
            r6.setBuilderToMessage(r2, r4)
        L853:
            return
        L854:
            if (r5 != 0) goto L85b
            java.lang.Object r3 = r6.getBuilderFromMessage(r2)     // Catch: java.lang.Throwable -> L881
            r5 = r3
        L85b:
            boolean r3 = r6.mergeOneFieldFrom(r5, r13)     // Catch: java.lang.Throwable -> L881
            if (r3 != 0) goto L87f
            int r3 = r1.checkInitializedCount
            r11 = r3
            r4 = r5
        L865:
            int r3 = r1.repeatedFieldOffsetStart
            if (r11 >= r3) goto L879
            int[] r3 = r1.intArray
            r3 = r3[r11]
            r6 = r19
            r5 = r17
            java.lang.Object r4 = r1.filterMapUnknownEnumValues(r2, r3, r4, r5, r6)
            r6 = r5
            int r11 = r11 + 1
            goto L865
        L879:
            if (r4 == 0) goto L87e
            r6.setBuilderToMessage(r2, r4)
        L87e:
            return
        L87f:
            goto L8
        L881:
            r0 = move-exception
            goto L892
        L883:
            r0 = move-exception
            r6 = r13
            r13 = r7
        L886:
            r7 = r6
        L887:
            r6 = r11
        L888:
            r5 = r12
            goto L892
        L88a:
            r0 = move-exception
            r6 = r17
            r2 = r19
            r13 = r20
            r12 = r5
        L892:
            int r3 = r1.checkInitializedCount
            r9 = r3
            r4 = r5
        L896:
            int r3 = r1.repeatedFieldOffsetStart
            if (r9 >= r3) goto L8ac
            int[] r3 = r1.intArray
            r3 = r3[r9]
            r6 = r19
            r5 = r17
            java.lang.Object r4 = r1.filterMapUnknownEnumValues(r2, r3, r4, r5, r6)
            int r9 = r9 + 1
            r1 = r16
            r6 = r5
            goto L896
        L8ac:
            r5 = r6
            if (r4 == 0) goto L8b2
            r5.setBuilderToMessage(r2, r4)
        L8b2:
            throw r0
    }

    private final <K, V> void mergeMap(java.lang.Object r6, int r7, java.lang.Object r8, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r9, com.google.crypto.tink.shaded.protobuf.Reader r10) throws java.io.IOException {
            r5 = this;
            int r0 = r5.typeAndOffsetAt(r7)
            long r0 = offset(r0)
            java.lang.Object r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r6, r0)
            if (r2 != 0) goto L18
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r3 = r5.mapFieldSchema
            java.lang.Object r2 = r3.newMapField(r8)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r6, r0, r2)
            goto L2f
        L18:
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r3 = r5.mapFieldSchema
            boolean r3 = r3.isImmutable(r2)
            if (r3 == 0) goto L2f
            r3 = r2
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r4 = r5.mapFieldSchema
            java.lang.Object r2 = r4.newMapField(r8)
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r4 = r5.mapFieldSchema
            r4.mergeFrom(r2, r3)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r6, r0, r2)
        L2f:
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r3 = r5.mapFieldSchema
            java.util.Map r3 = r3.forMutableMapData(r2)
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r4 = r5.mapFieldSchema
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata r4 = r4.forMapMetadata(r8)
            r10.readMap(r3, r4, r9)
            return
    }

    private void mergeMessage(T r9, T r10, int r11) {
            r8 = this;
            boolean r0 = r8.isFieldPresent(r10, r11)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r8.typeAndOffsetAt(r11)
            long r1 = offset(r0)
            sun.misc.Unsafe r3 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            java.lang.Object r3 = r3.getObject(r10, r1)
            if (r3 == 0) goto L5a
            com.google.crypto.tink.shaded.protobuf.Schema r4 = r8.getMessageFieldSchema(r11)
            boolean r5 = r8.isFieldPresent(r9, r11)
            if (r5 != 0) goto L3d
            boolean r5 = isMutable(r3)
            if (r5 != 0) goto L2d
            sun.misc.Unsafe r5 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            r5.putObject(r9, r1, r3)
            goto L39
        L2d:
            java.lang.Object r5 = r4.newInstance()
            r4.mergeFrom(r5, r3)
            sun.misc.Unsafe r6 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            r6.putObject(r9, r1, r5)
        L39:
            r8.setFieldPresent(r9, r11)
            return
        L3d:
            sun.misc.Unsafe r5 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            java.lang.Object r5 = r5.getObject(r9, r1)
            boolean r6 = isMutable(r5)
            if (r6 != 0) goto L56
            java.lang.Object r6 = r4.newInstance()
            r4.mergeFrom(r6, r5)
            sun.misc.Unsafe r7 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            r7.putObject(r9, r1, r6)
            r5 = r6
        L56:
            r4.mergeFrom(r5, r3)
            return
        L5a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Source subfield "
            java.lang.StringBuilder r5 = r5.append(r6)
            int r6 = r8.numberAt(r11)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " is present but null: "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r10)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    private void mergeOneofMessage(T r9, T r10, int r11) {
            r8 = this;
            int r0 = r8.numberAt(r11)
            boolean r1 = r8.isOneofPresent(r10, r0, r11)
            if (r1 != 0) goto Lb
            return
        Lb:
            int r1 = r8.typeAndOffsetAt(r11)
            long r1 = offset(r1)
            sun.misc.Unsafe r3 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            java.lang.Object r3 = r3.getObject(r10, r1)
            if (r3 == 0) goto L5e
            com.google.crypto.tink.shaded.protobuf.Schema r4 = r8.getMessageFieldSchema(r11)
            boolean r5 = r8.isOneofPresent(r9, r0, r11)
            if (r5 != 0) goto L41
            boolean r5 = isMutable(r3)
            if (r5 != 0) goto L31
            sun.misc.Unsafe r5 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            r5.putObject(r9, r1, r3)
            goto L3d
        L31:
            java.lang.Object r5 = r4.newInstance()
            r4.mergeFrom(r5, r3)
            sun.misc.Unsafe r6 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            r6.putObject(r9, r1, r5)
        L3d:
            r8.setOneofPresent(r9, r0, r11)
            return
        L41:
            sun.misc.Unsafe r5 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            java.lang.Object r5 = r5.getObject(r9, r1)
            boolean r6 = isMutable(r5)
            if (r6 != 0) goto L5a
            java.lang.Object r6 = r4.newInstance()
            r4.mergeFrom(r6, r5)
            sun.misc.Unsafe r7 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            r7.putObject(r9, r1, r6)
            r5 = r6
        L5a:
            r4.mergeFrom(r5, r3)
            return
        L5e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Source subfield "
            java.lang.StringBuilder r5 = r5.append(r6)
            int r6 = r8.numberAt(r11)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " is present but null: "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r10)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    private void mergeSingleField(T r7, T r8, int r9) {
            r6 = this;
            int r0 = r6.typeAndOffsetAt(r9)
            long r1 = offset(r0)
            int r3 = r6.numberAt(r9)
            int r4 = type(r0)
            switch(r4) {
                case 0: goto L163;
                case 1: goto L152;
                case 2: goto L141;
                case 3: goto L130;
                case 4: goto L11f;
                case 5: goto L10e;
                case 6: goto Lfd;
                case 7: goto Leb;
                case 8: goto Ld9;
                case 9: goto Ld4;
                case 10: goto Lc2;
                case 11: goto Lb0;
                case 12: goto L9e;
                case 13: goto L8c;
                case 14: goto L7a;
                case 15: goto L68;
                case 16: goto L56;
                case 17: goto L51;
                case 18: goto L4a;
                case 19: goto L4a;
                case 20: goto L4a;
                case 21: goto L4a;
                case 22: goto L4a;
                case 23: goto L4a;
                case 24: goto L4a;
                case 25: goto L4a;
                case 26: goto L4a;
                case 27: goto L4a;
                case 28: goto L4a;
                case 29: goto L4a;
                case 30: goto L4a;
                case 31: goto L4a;
                case 32: goto L4a;
                case 33: goto L4a;
                case 34: goto L4a;
                case 35: goto L4a;
                case 36: goto L4a;
                case 37: goto L4a;
                case 38: goto L4a;
                case 39: goto L4a;
                case 40: goto L4a;
                case 41: goto L4a;
                case 42: goto L4a;
                case 43: goto L4a;
                case 44: goto L4a;
                case 45: goto L4a;
                case 46: goto L4a;
                case 47: goto L4a;
                case 48: goto L4a;
                case 49: goto L4a;
                case 50: goto L43;
                case 51: goto L31;
                case 52: goto L31;
                case 53: goto L31;
                case 54: goto L31;
                case 55: goto L31;
                case 56: goto L31;
                case 57: goto L31;
                case 58: goto L31;
                case 59: goto L31;
                case 60: goto L2c;
                case 61: goto L1a;
                case 62: goto L1a;
                case 63: goto L1a;
                case 64: goto L1a;
                case 65: goto L1a;
                case 66: goto L1a;
                case 67: goto L1a;
                case 68: goto L15;
                default: goto L13;
            }
        L13:
            goto L173
        L15:
            r6.mergeOneofMessage(r7, r8, r9)
            goto L173
        L1a:
            boolean r4 = r6.isOneofPresent(r8, r3, r9)
            if (r4 == 0) goto L173
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r8, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r7, r1, r4)
            r6.setOneofPresent(r7, r3, r9)
            goto L173
        L2c:
            r6.mergeOneofMessage(r7, r8, r9)
            goto L173
        L31:
            boolean r4 = r6.isOneofPresent(r8, r3, r9)
            if (r4 == 0) goto L173
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r8, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r7, r1, r4)
            r6.setOneofPresent(r7, r3, r9)
            goto L173
        L43:
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r4 = r6.mapFieldSchema
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.mergeMap(r4, r7, r8, r1)
            goto L173
        L4a:
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r4 = r6.listFieldSchema
            r4.mergeListsAt(r7, r8, r1)
            goto L173
        L51:
            r6.mergeMessage(r7, r8, r9)
            goto L173
        L56:
            boolean r4 = r6.isFieldPresent(r8, r9)
            if (r4 == 0) goto L173
            long r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r8, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putLong(r7, r1, r4)
            r6.setFieldPresent(r7, r9)
            goto L173
        L68:
            boolean r4 = r6.isFieldPresent(r8, r9)
            if (r4 == 0) goto L173
            int r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r8, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r7, r1, r4)
            r6.setFieldPresent(r7, r9)
            goto L173
        L7a:
            boolean r4 = r6.isFieldPresent(r8, r9)
            if (r4 == 0) goto L173
            long r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r8, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putLong(r7, r1, r4)
            r6.setFieldPresent(r7, r9)
            goto L173
        L8c:
            boolean r4 = r6.isFieldPresent(r8, r9)
            if (r4 == 0) goto L173
            int r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r8, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r7, r1, r4)
            r6.setFieldPresent(r7, r9)
            goto L173
        L9e:
            boolean r4 = r6.isFieldPresent(r8, r9)
            if (r4 == 0) goto L173
            int r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r8, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r7, r1, r4)
            r6.setFieldPresent(r7, r9)
            goto L173
        Lb0:
            boolean r4 = r6.isFieldPresent(r8, r9)
            if (r4 == 0) goto L173
            int r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r8, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r7, r1, r4)
            r6.setFieldPresent(r7, r9)
            goto L173
        Lc2:
            boolean r4 = r6.isFieldPresent(r8, r9)
            if (r4 == 0) goto L173
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r8, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r7, r1, r4)
            r6.setFieldPresent(r7, r9)
            goto L173
        Ld4:
            r6.mergeMessage(r7, r8, r9)
            goto L173
        Ld9:
            boolean r4 = r6.isFieldPresent(r8, r9)
            if (r4 == 0) goto L173
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r8, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r7, r1, r4)
            r6.setFieldPresent(r7, r9)
            goto L173
        Leb:
            boolean r4 = r6.isFieldPresent(r8, r9)
            if (r4 == 0) goto L173
            boolean r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getBoolean(r8, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putBoolean(r7, r1, r4)
            r6.setFieldPresent(r7, r9)
            goto L173
        Lfd:
            boolean r4 = r6.isFieldPresent(r8, r9)
            if (r4 == 0) goto L173
            int r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r8, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r7, r1, r4)
            r6.setFieldPresent(r7, r9)
            goto L173
        L10e:
            boolean r4 = r6.isFieldPresent(r8, r9)
            if (r4 == 0) goto L173
            long r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r8, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putLong(r7, r1, r4)
            r6.setFieldPresent(r7, r9)
            goto L173
        L11f:
            boolean r4 = r6.isFieldPresent(r8, r9)
            if (r4 == 0) goto L173
            int r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r8, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r7, r1, r4)
            r6.setFieldPresent(r7, r9)
            goto L173
        L130:
            boolean r4 = r6.isFieldPresent(r8, r9)
            if (r4 == 0) goto L173
            long r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r8, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putLong(r7, r1, r4)
            r6.setFieldPresent(r7, r9)
            goto L173
        L141:
            boolean r4 = r6.isFieldPresent(r8, r9)
            if (r4 == 0) goto L173
            long r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r8, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putLong(r7, r1, r4)
            r6.setFieldPresent(r7, r9)
            goto L173
        L152:
            boolean r4 = r6.isFieldPresent(r8, r9)
            if (r4 == 0) goto L173
            float r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getFloat(r8, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putFloat(r7, r1, r4)
            r6.setFieldPresent(r7, r9)
            goto L173
        L163:
            boolean r4 = r6.isFieldPresent(r8, r9)
            if (r4 == 0) goto L173
            double r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getDouble(r8, r1)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putDouble(r7, r1, r4)
            r6.setFieldPresent(r7, r9)
        L173:
            return
    }

    private java.lang.Object mutableMessageFieldForMerge(T r6, int r7) {
            r5 = this;
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r5.getMessageFieldSchema(r7)
            int r1 = r5.typeAndOffsetAt(r7)
            long r1 = offset(r1)
            boolean r3 = r5.isFieldPresent(r6, r7)
            if (r3 != 0) goto L17
            java.lang.Object r3 = r0.newInstance()
            return r3
        L17:
            sun.misc.Unsafe r3 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            java.lang.Object r3 = r3.getObject(r6, r1)
            boolean r4 = isMutable(r3)
            if (r4 == 0) goto L24
            return r3
        L24:
            java.lang.Object r4 = r0.newInstance()
            if (r3 == 0) goto L2d
            r0.mergeFrom(r4, r3)
        L2d:
            return r4
    }

    private java.lang.Object mutableOneofMessageFieldForMerge(T r5, int r6, int r7) {
            r4 = this;
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r4.getMessageFieldSchema(r7)
            boolean r1 = r4.isOneofPresent(r5, r6, r7)
            if (r1 != 0) goto Lf
            java.lang.Object r1 = r0.newInstance()
            return r1
        Lf:
            sun.misc.Unsafe r1 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            int r2 = r4.typeAndOffsetAt(r7)
            long r2 = offset(r2)
            java.lang.Object r1 = r1.getObject(r5, r2)
            boolean r2 = isMutable(r1)
            if (r2 == 0) goto L24
            return r1
        L24:
            java.lang.Object r2 = r0.newInstance()
            if (r1 == 0) goto L2d
            r0.mergeFrom(r2, r1)
        L2d:
            return r2
    }

    static <T> com.google.crypto.tink.shaded.protobuf.MessageSchema<T> newSchema(java.lang.Class<T> r7, com.google.crypto.tink.shaded.protobuf.MessageInfo r8, com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r9, com.google.crypto.tink.shaded.protobuf.ListFieldSchema r10, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r11, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r12, com.google.crypto.tink.shaded.protobuf.MapFieldSchema r13) {
            boolean r0 = r8 instanceof com.google.crypto.tink.shaded.protobuf.RawMessageInfo
            if (r0 == 0) goto L16
            r1 = r8
            com.google.crypto.tink.shaded.protobuf.RawMessageInfo r1 = (com.google.crypto.tink.shaded.protobuf.RawMessageInfo) r1
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            com.google.crypto.tink.shaded.protobuf.MessageSchema r9 = newSchemaForRawMessageInfo(r1, r2, r3, r4, r5, r6)
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            return r9
        L16:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0 = r8
            com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo r0 = (com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo) r0
            com.google.crypto.tink.shaded.protobuf.MessageSchema r9 = newSchemaForMessageInfo(r0, r1, r2, r3, r4, r5)
            return r9
    }

    static <T> com.google.crypto.tink.shaded.protobuf.MessageSchema<T> newSchemaForMessageInfo(com.google.crypto.tink.shaded.protobuf.StructuralMessageInfo r25, com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r26, com.google.crypto.tink.shaded.protobuf.ListFieldSchema r27, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r28, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r29, com.google.crypto.tink.shaded.protobuf.MapFieldSchema r30) {
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r0 = r25.getSyntax()
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r1 = com.google.crypto.tink.shaded.protobuf.ProtoSyntax.PROTO3
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Lc
            r0 = r3
            goto Ld
        Lc:
            r0 = r2
        Ld:
            r10 = r0
            com.google.crypto.tink.shaded.protobuf.FieldInfo[] r0 = r25.getFields()
            int r1 = r0.length
            if (r1 != 0) goto L1a
            r1 = 0
            r3 = 0
            r7 = r1
            r8 = r3
            goto L2a
        L1a:
            r1 = r0[r2]
            int r1 = r1.getFieldNumber()
            int r4 = r0.length
            int r4 = r4 - r3
            r3 = r0[r4]
            int r3 = r3.getFieldNumber()
            r7 = r1
            r8 = r3
        L2a:
            int r1 = r0.length
            int r3 = r1 * 3
            int[] r5 = new int[r3]
            int r3 = r1 * 2
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r3 = 0
            r4 = 0
            int r9 = r0.length
            r11 = r2
        L37:
            r12 = 49
            r13 = 18
            if (r11 >= r9) goto L64
            r14 = r0[r11]
            com.google.crypto.tink.shaded.protobuf.FieldType r15 = r14.getType()
            com.google.crypto.tink.shaded.protobuf.FieldType r2 = com.google.crypto.tink.shaded.protobuf.FieldType.MAP
            if (r15 != r2) goto L4a
            int r3 = r3 + 1
            goto L60
        L4a:
            com.google.crypto.tink.shaded.protobuf.FieldType r2 = r14.getType()
            int r2 = r2.id()
            if (r2 < r13) goto L60
            com.google.crypto.tink.shaded.protobuf.FieldType r2 = r14.getType()
            int r2 = r2.id()
            if (r2 > r12) goto L60
            int r4 = r4 + 1
        L60:
            int r11 = r11 + 1
            r2 = 0
            goto L37
        L64:
            r2 = 0
            if (r3 <= 0) goto L6a
            int[] r9 = new int[r3]
            goto L6b
        L6a:
            r9 = r2
        L6b:
            if (r4 <= 0) goto L6f
            int[] r2 = new int[r4]
        L6f:
            r3 = 0
            r4 = 0
            int[] r11 = r25.getCheckInitialized()
            if (r11 != 0) goto L79
            int[] r11 = com.google.crypto.tink.shaded.protobuf.MessageSchema.EMPTY_INT_ARRAY
        L79:
            r14 = 0
            r15 = 0
            r17 = 0
            r20 = r4
            r4 = r14
            r14 = r15
            r15 = r17
        L83:
            int r12 = r0.length
            if (r14 >= r12) goto Leb
            r12 = r0[r14]
            int r13 = r12.getFieldNumber()
            storeFieldData(r12, r5, r15, r6)
            r21 = r0
            int r0 = r11.length
            if (r4 >= r0) goto L9d
            r0 = r11[r4]
            if (r0 != r13) goto L9d
            int r0 = r4 + 1
            r11[r4] = r15
            r4 = r0
        L9d:
            com.google.crypto.tink.shaded.protobuf.FieldType r0 = r12.getType()
            r22 = r1
            com.google.crypto.tink.shaded.protobuf.FieldType r1 = com.google.crypto.tink.shaded.protobuf.FieldType.MAP
            if (r0 != r1) goto Laf
            int r0 = r3 + 1
            r9[r3] = r15
            r3 = r0
            r19 = r2
            goto Ldb
        Laf:
            com.google.crypto.tink.shaded.protobuf.FieldType r0 = r12.getType()
            int r0 = r0.id()
            r1 = 18
            if (r0 < r1) goto Ld9
            com.google.crypto.tink.shaded.protobuf.FieldType r0 = r12.getType()
            int r0 = r0.id()
            r1 = 49
            if (r0 > r1) goto Ld9
            int r0 = r20 + 1
            java.lang.reflect.Field r17 = r12.getField()
            r19 = r2
            long r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r17)
            int r1 = (int) r1
            r19[r20] = r1
            r20 = r0
            goto Ldb
        Ld9:
            r19 = r2
        Ldb:
            int r14 = r14 + 1
            int r15 = r15 + 3
            r2 = r19
            r0 = r21
            r1 = r22
            r12 = 49
            r13 = 18
            goto L83
        Leb:
            r21 = r0
            r22 = r1
            r19 = r2
            if (r9 != 0) goto Lf7
            int[] r9 = com.google.crypto.tink.shaded.protobuf.MessageSchema.EMPTY_INT_ARRAY
            r0 = r9
            goto Lf8
        Lf7:
            r0 = r9
        Lf8:
            if (r19 != 0) goto Lfd
            int[] r2 = com.google.crypto.tink.shaded.protobuf.MessageSchema.EMPTY_INT_ARRAY
            goto Lff
        Lfd:
            r2 = r19
        Lff:
            int r1 = r11.length
            int r9 = r0.length
            int r1 = r1 + r9
            int r9 = r2.length
            int r1 = r1 + r9
            int[] r12 = new int[r1]
            int r1 = r11.length
            r9 = 0
            java.lang.System.arraycopy(r11, r9, r12, r9, r1)
            int r1 = r11.length
            int r13 = r0.length
            java.lang.System.arraycopy(r0, r9, r12, r1, r13)
            int r1 = r11.length
            int r13 = r0.length
            int r1 = r1 + r13
            int r13 = r2.length
            java.lang.System.arraycopy(r2, r9, r12, r1, r13)
            r1 = r4
            com.google.crypto.tink.shaded.protobuf.MessageSchema r4 = new com.google.crypto.tink.shaded.protobuf.MessageSchema
            com.google.crypto.tink.shaded.protobuf.MessageLite r9 = r25.getDefaultInstance()
            int r13 = r11.length
            int r15 = r11.length
            r16 = r1
            int r1 = r0.length
            int r15 = r15 + r1
            r1 = r11
            r11 = 1
            r17 = r28
            r18 = r29
            r19 = r30
            r24 = r1
            r1 = r14
            r14 = r15
            r23 = r16
            r15 = r26
            r16 = r27
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r4
    }

    static <T> com.google.crypto.tink.shaded.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(com.google.crypto.tink.shaded.protobuf.RawMessageInfo r42, com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r43, com.google.crypto.tink.shaded.protobuf.ListFieldSchema r44, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r45, com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r46, com.google.crypto.tink.shaded.protobuf.MapFieldSchema r47) {
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r0 = r42.getSyntax()
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r1 = com.google.crypto.tink.shaded.protobuf.ProtoSyntax.PROTO3
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            r10 = r0
            java.lang.String r0 = r42.getStringInfo()
            int r1 = r0.length()
            r4 = 0
            int r5 = r4 + 1
            char r4 = r0.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r6) goto L3a
            r7 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L24:
            int r9 = r5 + 1
            char r5 = r0.charAt(r5)
            r4 = r5
            if (r5 < r6) goto L35
            r5 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r8
            r7 = r7 | r5
            int r8 = r8 + 13
            r5 = r9
            goto L24
        L35:
            int r5 = r4 << r8
            r4 = r7 | r5
            r5 = r9
        L3a:
            r20 = r4
            int r7 = r5 + 1
            char r4 = r0.charAt(r5)
            if (r4 < r6) goto L5e
            r5 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L48:
            int r9 = r7 + 1
            char r7 = r0.charAt(r7)
            r4 = r7
            if (r7 < r6) goto L59
            r7 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r8
            r5 = r5 | r7
            int r8 = r8 + 13
            r7 = r9
            goto L48
        L59:
            int r7 = r4 << r8
            r4 = r5 | r7
            r7 = r9
        L5e:
            r21 = r4
            if (r21 != 0) goto L7f
            r5 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            int[] r16 = com.google.crypto.tink.shaded.protobuf.MessageSchema.EMPTY_INT_ARRAY
            r17 = 0
            r2 = r5
            r22 = r8
            r8 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            r13 = r15
            r12 = r16
            r16 = r17
            goto L1b7
        L7f:
            int r5 = r7 + 1
            char r4 = r0.charAt(r7)
            if (r4 < r6) goto La1
            r7 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L8b:
            int r9 = r5 + 1
            char r5 = r0.charAt(r5)
            r4 = r5
            if (r5 < r6) goto L9c
            r5 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r8
            r7 = r7 | r5
            int r8 = r8 + 13
            r5 = r9
            goto L8b
        L9c:
            int r5 = r4 << r8
            r4 = r7 | r5
            r5 = r9
        La1:
            r7 = r4
            int r8 = r5 + 1
            char r4 = r0.charAt(r5)
            if (r4 < r6) goto Lc4
            r5 = r4 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        Lae:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            r4 = r8
            if (r8 < r6) goto Lbf
            r8 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r5 = r5 | r8
            int r9 = r9 + 13
            r8 = r11
            goto Lae
        Lbf:
            int r8 = r4 << r9
            r4 = r5 | r8
            r8 = r11
        Lc4:
            r5 = r4
            int r9 = r8 + 1
            char r4 = r0.charAt(r8)
            if (r4 < r6) goto Le7
            r8 = r4 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        Ld1:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            r4 = r9
            if (r9 < r6) goto Le2
            r9 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto Ld1
        Le2:
            int r9 = r4 << r11
            r4 = r8 | r9
            r9 = r12
        Le7:
            r8 = r4
            int r11 = r9 + 1
            char r4 = r0.charAt(r9)
            if (r4 < r6) goto L10a
            r9 = r4 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        Lf4:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            r4 = r11
            if (r11 < r6) goto L105
            r11 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto Lf4
        L105:
            int r11 = r4 << r12
            r4 = r9 | r11
            r11 = r13
        L10a:
            r9 = r4
            int r12 = r11 + 1
            char r4 = r0.charAt(r11)
            if (r4 < r6) goto L12d
            r11 = r4 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L117:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            r4 = r12
            if (r12 < r6) goto L128
            r12 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L117
        L128:
            int r12 = r4 << r13
            r4 = r11 | r12
            r12 = r14
        L12d:
            r11 = r4
            int r13 = r12 + 1
            char r4 = r0.charAt(r12)
            if (r4 < r6) goto L150
            r12 = r4 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L13a:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            r4 = r13
            if (r13 < r6) goto L14b
            r13 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L13a
        L14b:
            int r13 = r4 << r14
            r4 = r12 | r13
            r13 = r15
        L150:
            r12 = r4
            int r14 = r13 + 1
            char r4 = r0.charAt(r13)
            if (r4 < r6) goto L175
            r13 = r4 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L15d:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            r4 = r14
            if (r14 < r6) goto L16f
            r14 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L15d
        L16f:
            int r14 = r4 << r15
            r4 = r13 | r14
            r14 = r16
        L175:
            r13 = r4
            int r15 = r14 + 1
            char r4 = r0.charAt(r14)
            if (r4 < r6) goto L19b
            r14 = r4 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L182:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            r4 = r15
            if (r15 < r6) goto L195
            r15 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L182
        L195:
            int r15 = r4 << r16
            r4 = r14 | r15
            r15 = r17
        L19b:
            r14 = r4
            int r16 = r14 + r12
            int r2 = r16 + r13
            int[] r2 = new int[r2]
            int r16 = r7 * 2
            int r16 = r16 + r5
            r22 = r9
            r9 = r8
            r8 = r22
            r22 = r5
            r23 = r11
            r24 = r12
            r25 = r13
            r13 = r14
            r12 = r2
            r2 = r7
            r7 = r15
        L1b7:
            sun.misc.Unsafe r5 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            java.lang.Object[] r26 = r42.getObjects()
            r11 = 0
            com.google.crypto.tink.shaded.protobuf.MessageLite r14 = r42.getDefaultInstance()
            java.lang.Class r14 = r14.getClass()
            int r15 = r23 * 3
            int[] r15 = new int[r15]
            r18 = 1
            int r3 = r23 * 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r19 = r13
            int r27 = r13 + r24
            r28 = 0
            r29 = r16
            r30 = r19
            r31 = r27
            r32 = r28
            r27 = r4
            r4 = r7
            r28 = r11
        L1e3:
            if (r4 >= r1) goto L46c
            int r7 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r6) goto L20a
            r11 = r4 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L1f1:
            int r19 = r7 + 1
            char r7 = r0.charAt(r7)
            r4 = r7
            if (r7 < r6) goto L204
            r7 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r16
            r11 = r11 | r7
            int r16 = r16 + 13
            r7 = r19
            goto L1f1
        L204:
            int r7 = r4 << r16
            r4 = r11 | r7
            r7 = r19
        L20a:
            r11 = r4
            int r16 = r7 + 1
            char r4 = r0.charAt(r7)
            if (r4 < r6) goto L23c
            r7 = r4 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
            r6 = r16
            r16 = r19
        L21b:
            int r27 = r6 + 1
            char r6 = r0.charAt(r6)
            r4 = r6
            r33 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r1) goto L235
            r1 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r16
            r7 = r7 | r1
            int r16 = r16 + 13
            r6 = r27
            r1 = r33
            goto L21b
        L235:
            int r1 = r4 << r16
            r4 = r7 | r1
            r1 = r27
            goto L240
        L23c:
            r33 = r1
            r1 = r16
        L240:
            r6 = r4
            r7 = r6 & 255(0xff, float:3.57E-43)
            r34 = r2
            r2 = r6 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L24f
            int r2 = r28 + 1
            r12[r28] = r32
            r28 = r2
        L24f:
            r2 = 51
            r35 = r3
            if (r7 < r2) goto L304
            int r2 = r1 + 1
            char r1 = r0.charAt(r1)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r4) goto L280
            r4 = r1 & 8191(0x1fff, float:1.1478E-41)
            r36 = 13
        L264:
            int r37 = r2 + 1
            char r2 = r0.charAt(r2)
            r1 = r2
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r3) goto L27a
            r2 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r36
            r4 = r4 | r2
            int r36 = r36 + 13
            r2 = r37
            goto L264
        L27a:
            int r2 = r1 << r36
            r1 = r4 | r2
            r2 = r37
        L280:
            r3 = r1
            int r4 = r7 + (-51)
            r36 = r1
            r1 = 9
            if (r4 == r1) goto L2a3
            r1 = 17
            if (r4 != r1) goto L28e
            goto L2a3
        L28e:
            r1 = 12
            if (r4 != r1) goto L2b1
            if (r10 != 0) goto L2b1
            int r1 = r32 / 3
            int r1 = r1 * 2
            int r1 = r1 + 1
            int r16 = r29 + 1
            r27 = r26[r29]
            r35[r1] = r27
            r29 = r16
            goto L2b1
        L2a3:
            int r1 = r32 / 3
            int r1 = r1 * 2
            int r1 = r1 + 1
            int r16 = r29 + 1
            r27 = r26[r29]
            r35[r1] = r27
            r29 = r16
        L2b1:
            int r1 = r3 * 2
            r16 = r1
            r1 = r26[r16]
            r27 = r2
            boolean r2 = r1 instanceof java.lang.reflect.Field
            if (r2 == 0) goto L2c1
            r2 = r1
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            goto L2ca
        L2c1:
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r2 = reflectField(r14, r2)
            r26[r16] = r2
        L2ca:
            r37 = r3
            r38 = r4
            long r3 = r5.objectFieldOffset(r2)
            int r3 = (int) r3
            int r4 = r16 + 1
            r1 = r26[r4]
            r16 = r2
            boolean r2 = r1 instanceof java.lang.reflect.Field
            if (r2 == 0) goto L2e1
            r2 = r1
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            goto L2ea
        L2e1:
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r2 = reflectField(r14, r2)
            r26[r4] = r2
        L2ea:
            r39 = r3
            r40 = r4
            long r3 = r5.objectFieldOffset(r2)
            int r3 = (int) r3
            r1 = 0
            r4 = r39
            r39 = r0
            r0 = r3
            r3 = r4
            r16 = r9
            r4 = r27
            r27 = r36
            r36 = r8
            goto L434
        L304:
            int r2 = r29 + 1
            r3 = r26[r29]
            java.lang.String r3 = (java.lang.String) r3
            java.lang.reflect.Field r3 = reflectField(r14, r3)
            r36 = r2
            r2 = 9
            if (r7 == r2) goto L37e
            r2 = 17
            if (r7 != r2) goto L31a
            goto L37e
        L31a:
            r2 = 27
            if (r7 == r2) goto L36f
            r2 = 49
            if (r7 != r2) goto L323
            goto L36f
        L323:
            r2 = 12
            if (r7 == r2) goto L35e
            r2 = 30
            if (r7 == r2) goto L35e
            r2 = 44
            if (r7 != r2) goto L330
            goto L35e
        L330:
            r2 = 50
            if (r7 != r2) goto L38a
            int r2 = r30 + 1
            r12[r30] = r32
            int r16 = r32 / 3
            int r16 = r16 * 2
            int r27 = r36 + 1
            r30 = r26[r36]
            r35[r16] = r30
            r16 = r2
            r2 = r6 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L359
            int r2 = r32 / 3
            int r2 = r2 * 2
            int r2 = r2 + 1
            int r30 = r27 + 1
            r27 = r26[r27]
            r35[r2] = r27
            r2 = r30
            r30 = r16
            goto L38c
        L359:
            r30 = r16
            r2 = r27
            goto L38c
        L35e:
            if (r10 != 0) goto L38a
            int r2 = r32 / 3
            int r2 = r2 * 2
            int r2 = r2 + 1
            int r16 = r36 + 1
            r27 = r26[r36]
            r35[r2] = r27
            r2 = r16
            goto L38c
        L36f:
            int r2 = r32 / 3
            int r2 = r2 * 2
            int r2 = r2 + 1
            int r16 = r36 + 1
            r27 = r26[r36]
            r35[r2] = r27
            r2 = r16
            goto L38c
        L37e:
            int r2 = r32 / 3
            int r2 = r2 * 2
            int r2 = r2 + 1
            java.lang.Class r16 = r3.getType()
            r35[r2] = r16
        L38a:
            r2 = r36
        L38c:
            r36 = r8
            r16 = r9
            long r8 = r5.objectFieldOffset(r3)
            int r8 = (int) r8
            r9 = r6 & 4096(0x1000, float:5.74E-42)
            r27 = r2
            r2 = 4096(0x1000, float:5.74E-42)
            if (r9 != r2) goto L3a0
            r2 = r18
            goto L3a1
        L3a0:
            r2 = 0
        L3a1:
            if (r2 == 0) goto L407
            r9 = 17
            if (r7 > r9) goto L407
            int r9 = r1 + 1
            char r1 = r0.charAt(r1)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r4) goto L3d8
            r4 = r1 & 8191(0x1fff, float:1.1478E-41)
            r37 = 13
        L3b6:
            int r38 = r9 + 1
            char r9 = r0.charAt(r9)
            r1 = r9
            r39 = r0
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r9 < r0) goto L3d0
            r9 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r37
            r4 = r4 | r9
            int r37 = r37 + 13
            r9 = r38
            r0 = r39
            goto L3b6
        L3d0:
            int r9 = r1 << r37
            r1 = r4 | r9
            r4 = r1
            r1 = r38
            goto L3dd
        L3d8:
            r39 = r0
            r0 = r4
            r4 = r1
            r1 = r9
        L3dd:
            r9 = r4
            int r19 = r34 * 2
            int r37 = r9 / 32
            int r19 = r19 + r37
            r0 = r26[r19]
            r38 = r1
            boolean r1 = r0 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L3f0
            r1 = r0
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            goto L3f9
        L3f0:
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = reflectField(r14, r1)
            r26[r19] = r1
        L3f9:
            r41 = r2
            r40 = r3
            long r2 = r5.objectFieldOffset(r1)
            int r2 = (int) r2
            int r9 = r9 % 32
            r3 = r2
            r1 = r9
            goto L415
        L407:
            r39 = r0
            r41 = r2
            r40 = r3
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = r0
            r38 = r1
            r1 = r2
        L415:
            r0 = 18
            if (r7 < r0) goto L42c
            r2 = 49
            if (r7 > r2) goto L42c
            int r0 = r31 + 1
            r12[r31] = r8
            r31 = r0
            r0 = r3
            r3 = r8
            r29 = r27
            r27 = r4
            r4 = r38
            goto L434
        L42c:
            r0 = r3
            r3 = r8
            r29 = r27
            r27 = r4
            r4 = r38
        L434:
            int r2 = r32 + 1
            r15[r32] = r11
            int r8 = r2 + 1
            r9 = r6 & 512(0x200, float:7.17E-43)
            if (r9 == 0) goto L441
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L442
        L441:
            r9 = 0
        L442:
            r19 = r0
            r0 = r6 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L44b
            r0 = 268435456(0x10000000, float:2.524355E-29)
            goto L44c
        L44b:
            r0 = 0
        L44c:
            r0 = r0 | r9
            int r9 = r7 << 20
            r0 = r0 | r9
            r0 = r0 | r3
            r15[r2] = r0
            int r32 = r8 + 1
            int r0 = r1 << 20
            r0 = r0 | r19
            r15[r8] = r0
            r9 = r16
            r1 = r33
            r2 = r34
            r3 = r35
            r8 = r36
            r0 = r39
            r6 = 55296(0xd800, float:7.7486E-41)
            goto L1e3
        L46c:
            r39 = r0
            r33 = r1
            r34 = r2
            r35 = r3
            r16 = r9
            r7 = r4
            com.google.crypto.tink.shaded.protobuf.MessageSchema r4 = new com.google.crypto.tink.shaded.protobuf.MessageSchema
            com.google.crypto.tink.shaded.protobuf.MessageLite r9 = r42.getDefaultInstance()
            r11 = 0
            r0 = r14
            int r14 = r13 + r24
            r17 = r45
            r18 = r46
            r19 = r47
            r1 = r0
            r0 = r5
            r2 = r7
            r5 = r15
            r7 = r16
            r6 = r35
            r15 = r43
            r16 = r44
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r16 = r7
            return r4
    }

    private int numberAt(int r2) {
            r1 = this;
            int[] r0 = r1.buffer
            r0 = r0[r2]
            return r0
    }

    private static long offset(int r2) {
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r2
            long r0 = (long) r0
            return r0
    }

    private static <T> boolean oneofBooleanAt(T r1, long r2) {
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    private static <T> double oneofDoubleAt(T r2, long r3) {
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r2, r3)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            return r0
    }

    private static <T> float oneofFloatAt(T r1, long r2) {
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r2)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
    }

    private static <T> int oneofIntAt(T r1, long r2) {
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r1, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    private static <T> long oneofLongAt(T r2, long r3) {
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r2, r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    private <K, V> int parseMapField(T r14, byte[] r15, int r16, int r17, int r18, long r19, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r21) throws java.io.IOException {
            r13 = this;
            r7 = r19
            sun.misc.Unsafe r9 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            r10 = r18
            java.lang.Object r11 = r13.getMapFieldDefaultEntry(r10)
            java.lang.Object r1 = r9.getObject(r14, r7)
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r2 = r13.mapFieldSchema
            boolean r2 = r2.isImmutable(r1)
            if (r2 == 0) goto L27
            r2 = r1
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r3 = r13.mapFieldSchema
            java.lang.Object r1 = r3.newMapField(r11)
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r3 = r13.mapFieldSchema
            r3.mergeFrom(r1, r2)
            r9.putObject(r14, r7, r1)
            r12 = r1
            goto L28
        L27:
            r12 = r1
        L28:
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r1 = r13.mapFieldSchema
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata r4 = r1.forMapMetadata(r11)
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r1 = r13.mapFieldSchema
            java.util.Map r5 = r1.forMutableMapData(r12)
            r0 = r13
            r1 = r15
            r2 = r16
            r3 = r17
            r6 = r21
            int r4 = r0.decodeMapEntry(r1, r2, r3, r4, r5, r6)
            return r4
    }

    private int parseOneofField(T r21, byte[] r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, long r30, int r32, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r33) throws java.io.IOException {
            r20 = this;
            r0 = r20
            r1 = r21
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r30
            r14 = r32
            sun.misc.Unsafe r15 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            int[] r2 = r0.buffer
            int r3 = r14 + 2
            r2 = r2[r3]
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r3
            long r2 = (long) r2
            r4 = 5
            r6 = 2
            switch(r29) {
                case 51: goto L22e;
                case 52: goto L214;
                case 53: goto L1fa;
                case 54: goto L1fa;
                case 55: goto L1e0;
                case 56: goto L1c4;
                case 57: goto L1a9;
                case 58: goto L185;
                case 59: goto L14a;
                case 60: goto L120;
                case 61: goto L100;
                case 62: goto L1e0;
                case 63: goto Lb3;
                case 64: goto L1a9;
                case 65: goto L1c4;
                case 66: goto L8d;
                case 67: goto L61;
                case 68: goto L29;
                default: goto L20;
            }
        L20:
            r7 = r33
            r8 = r2
            r2 = r22
            r3 = r23
            goto L248
        L29:
            r4 = 3
            if (r11 != r4) goto L53
            r3 = r2
            java.lang.Object r2 = r0.mutableOneofMessageFieldForMerge(r1, r10, r14)
            r5 = r9 & (-8)
            r7 = r5 | 4
            r4 = r3
            com.google.crypto.tink.shaded.protobuf.Schema r3 = r0.getMessageFieldSchema(r14)
            r6 = r24
            r8 = r33
            r16 = r4
            r4 = r22
            r5 = r23
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.mergeGroupField(r2, r3, r4, r5, r6, r7, r8)
            r5 = r7
            r7 = r8
            r0.storeOneofMessageField(r1, r10, r14, r2)
            r2 = r4
            r8 = r16
            goto L248
        L53:
            r4 = r22
            r5 = r23
            r7 = r33
            r16 = r2
            r2 = r4
            r3 = r5
            r8 = r16
            goto L248
        L61:
            r4 = r22
            r5 = r23
            r7 = r33
            r16 = r2
            if (r11 != 0) goto L86
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r4, r5, r7)
            long r5 = r7.long1
            long r5 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag64(r5)
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r15.putObject(r1, r12, r3)
            r5 = r16
            r15.putInt(r1, r5, r10)
            r3 = r2
            r2 = r4
            r8 = r5
            goto L248
        L86:
            r2 = r16
            r8 = r2
            r2 = r4
            r3 = r5
            goto L248
        L8d:
            r4 = r22
            r5 = r23
            r7 = r33
            if (r11 != 0) goto Lae
            int r5 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r4, r5, r7)
            int r6 = r7.int1
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag32(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r15.putObject(r1, r12, r6)
            r15.putInt(r1, r2, r10)
            r8 = r2
            r2 = r4
            r3 = r5
            goto L248
        Lae:
            r8 = r2
            r2 = r4
            r3 = r5
            goto L248
        Lb3:
            r4 = r22
            r5 = r23
            r7 = r33
            if (r11 != 0) goto Lf9
            int r5 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r4, r5, r7)
            int r6 = r7.int1
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r8 = r0.getEnumFieldVerifier(r14)
            if (r8 == 0) goto Le3
            boolean r16 = r8.isInRange(r6)
            if (r16 == 0) goto Ld2
            r23 = r5
            r16 = r8
            goto Le7
        Ld2:
            r23 = r5
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r5 = getMutableUnknownFields(r1)
            r16 = r8
            long r7 = (long) r6
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5.storeField(r9, r7)
            goto Lf1
        Le3:
            r23 = r5
            r16 = r8
        Le7:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r15.putObject(r1, r12, r5)
            r15.putInt(r1, r2, r10)
        Lf1:
            r7 = r33
            r8 = r2
            r2 = r4
            r3 = r23
            goto L248
        Lf9:
            r7 = r33
            r8 = r2
            r2 = r4
            r3 = r5
            goto L248
        L100:
            r4 = r22
            r5 = r23
            if (r11 != r6) goto L119
            r7 = r33
            int r5 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeBytes(r4, r5, r7)
            java.lang.Object r6 = r7.object1
            r15.putObject(r1, r12, r6)
            r15.putInt(r1, r2, r10)
            r8 = r2
            r2 = r4
            r3 = r5
            goto L248
        L119:
            r7 = r33
            r8 = r2
            r2 = r4
            r3 = r5
            goto L248
        L120:
            r4 = r22
            r5 = r23
            r7 = r33
            if (r11 != r6) goto L145
            r16 = r2
            java.lang.Object r2 = r0.mutableOneofMessageFieldForMerge(r1, r10, r14)
            com.google.crypto.tink.shaded.protobuf.Schema r3 = r0.getMessageFieldSchema(r14)
            r6 = r24
            r8 = r16
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.mergeMessageField(r2, r3, r4, r5, r6, r7)
            r19 = r4
            r4 = r2
            r2 = r19
            r0.storeOneofMessageField(r1, r10, r14, r4)
            goto L248
        L145:
            r8 = r2
            r2 = r4
            r3 = r5
            goto L248
        L14a:
            r7 = r33
            r8 = r2
            r2 = r22
            r3 = r23
            if (r11 != r6) goto L248
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r2, r3, r7)
            int r4 = r7.int1
            if (r4 != 0) goto L161
            java.lang.String r5 = ""
            r15.putObject(r1, r12, r5)
            goto L180
        L161:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r28 & r5
            if (r5 == 0) goto L175
            int r5 = r3 + r4
            boolean r5 = com.google.crypto.tink.shaded.protobuf.Utf8.isValidUtf8(r2, r3, r5)
            if (r5 == 0) goto L170
            goto L175
        L170:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r5 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
            throw r5
        L175:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
            r5.<init>(r2, r3, r4, r6)
            r15.putObject(r1, r12, r5)
            int r3 = r3 + r4
        L180:
            r15.putInt(r1, r8, r10)
            goto L248
        L185:
            r7 = r33
            r8 = r2
            r2 = r22
            r3 = r23
            if (r11 != 0) goto L248
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r2, r3, r7)
            long r5 = r7.long1
            r17 = 0
            int r4 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r4 == 0) goto L19c
            r5 = 1
            goto L19d
        L19c:
            r5 = 0
        L19d:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            r15.putObject(r1, r12, r4)
            r15.putInt(r1, r8, r10)
            goto L248
        L1a9:
            r7 = r33
            r8 = r2
            r2 = r22
            r3 = r23
            if (r11 != r4) goto L248
            int r4 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFixed32(r22, r23)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r15.putObject(r1, r12, r4)
            int r3 = r3 + 4
            r15.putInt(r1, r8, r10)
            goto L248
        L1c4:
            r7 = r33
            r8 = r2
            r2 = r22
            r3 = r23
            r4 = 1
            if (r11 != r4) goto L248
            long r4 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFixed64(r22, r23)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r15.putObject(r1, r12, r4)
            int r3 = r3 + 8
            r15.putInt(r1, r8, r10)
            goto L248
        L1e0:
            r7 = r33
            r8 = r2
            r2 = r22
            r3 = r23
            if (r11 != 0) goto L248
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r2, r3, r7)
            int r4 = r7.int1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r15.putObject(r1, r12, r4)
            r15.putInt(r1, r8, r10)
            goto L248
        L1fa:
            r7 = r33
            r8 = r2
            r2 = r22
            r3 = r23
            if (r11 != 0) goto L248
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r2, r3, r7)
            long r4 = r7.long1
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r15.putObject(r1, r12, r4)
            r15.putInt(r1, r8, r10)
            goto L248
        L214:
            r7 = r33
            r8 = r2
            r2 = r22
            r3 = r23
            if (r11 != r4) goto L248
            float r4 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFloat(r22, r23)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r15.putObject(r1, r12, r4)
            int r3 = r3 + 4
            r15.putInt(r1, r8, r10)
            goto L248
        L22e:
            r7 = r33
            r8 = r2
            r2 = r22
            r3 = r23
            r4 = 1
            if (r11 != r4) goto L248
            double r4 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeDouble(r22, r23)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r15.putObject(r1, r12, r4)
            int r3 = r3 + 8
            r15.putInt(r1, r8, r10)
        L248:
            return r3
    }

    private int parseProto3Message(T r30, byte[] r31, int r32, int r33, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r34) throws java.io.IOException {
            r29 = this;
            r0 = r29
            r1 = r30
            r7 = r31
            r8 = r33
            r13 = r34
            checkMutable(r1)
            sun.misc.Unsafe r2 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = 0
            r5 = 0
            r6 = -1
            r9 = 0
            r15 = r9
            r9 = r4
            r4 = r15
            r15 = r3
            r3 = r32
        L1c:
            if (r3 >= r8) goto L4d8
            int r11 = r3 + 1
            r3 = r7[r3]
            if (r3 >= 0) goto L30
            int r11 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r3, r7, r11, r13)
            int r3 = r13.int1
            r26 = r11
            r11 = r3
            r3 = r26
            goto L35
        L30:
            r26 = r11
            r11 = r3
            r3 = r26
        L35:
            int r12 = r11 >>> 3
            r14 = r11 & 7
            if (r12 <= r6) goto L42
            int r5 = r4 / 3
            int r4 = r0.positionForFieldNumber(r12, r5)
            goto L46
        L42:
            int r4 = r0.positionForFieldNumber(r12)
        L46:
            r16 = r12
            r5 = -1
            if (r4 != r5) goto L56
            r4 = 0
            r25 = r2
            r2 = r3
            r5 = r11
            r6 = r12
            r7 = r14
            r12 = r1
            r11 = r4
            goto L4b7
        L56:
            int[] r5 = r0.buffer
            int r6 = r4 + 1
            r5 = r5[r6]
            r17 = r11
            int r11 = type(r5)
            long r18 = offset(r5)
            r6 = 17
            r32 = 1048575(0xfffff, float:1.469367E-39)
            if (r11 > r6) goto L35b
            int[] r6 = r0.buffer
            int r20 = r4 + 2
            r20 = r6[r20]
            int r6 = r20 >>> 20
            r10 = 1
            int r21 = r10 << r6
            r6 = r20 & r32
            if (r6 == r15) goto L96
            r10 = r32
            if (r15 == r10) goto L87
            r32 = r11
            long r10 = (long) r15
            r2.putInt(r1, r10, r9)
            goto L89
        L87:
            r32 = r11
        L89:
            r10 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r10) goto L93
            long r10 = (long) r6
            int r9 = r2.getInt(r1, r10)
        L93:
            r10 = r6
            r15 = r10
            goto L98
        L96:
            r32 = r11
        L98:
            r10 = 5
            switch(r32) {
                case 0: goto L32a;
                case 1: goto L303;
                case 2: goto L2d5;
                case 3: goto L2d5;
                case 4: goto L2b0;
                case 5: goto L269;
                case 6: goto L22e;
                case 7: goto L1eb;
                case 8: goto L1a6;
                case 9: goto L152;
                case 10: goto L12f;
                case 11: goto L2b0;
                case 12: goto L10d;
                case 13: goto L22e;
                case 14: goto L269;
                case 15: goto Le7;
                case 16: goto Lab;
                default: goto L9c;
            }
        L9c:
            r8 = r3
            r11 = r4
            r10 = r5
            r26 = r12
            r12 = r1
            r1 = r2
            r2 = r18
            r19 = r6
            r18 = r26
            goto L351
        Lab:
            if (r14 != 0) goto Ld9
            int r10 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r7, r3, r13)
            r11 = r2
            long r1 = r13.long1
            long r1 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag64(r1)
            r26 = r1
            r2 = r30
            r1 = r11
            r11 = r4
            r3 = r18
            r19 = r6
            r18 = r10
            r10 = r5
            r5 = r26
            r1.putLong(r2, r3, r5)
            r5 = r2
            r2 = r1
            r1 = r5
            r4 = r3
            r9 = r9 | r21
            r4 = r11
            r6 = r16
            r5 = r17
            r3 = r18
            goto L1c
        Ld9:
            r11 = r4
            r10 = r5
            r4 = r18
            r19 = r6
            r8 = r3
            r18 = r12
            r12 = r1
            r1 = r2
            r2 = r4
            goto L351
        Le7:
            r11 = r4
            r10 = r5
            r4 = r18
            r19 = r6
            if (r14 != 0) goto L105
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r7, r3, r13)
            int r6 = r13.int1
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag32(r6)
            r2.putInt(r1, r4, r6)
            r9 = r9 | r21
            r4 = r11
            r6 = r16
            r5 = r17
            goto L1c
        L105:
            r8 = r3
            r18 = r12
            r12 = r1
            r1 = r2
            r2 = r4
            goto L351
        L10d:
            r11 = r4
            r10 = r5
            r4 = r18
            r19 = r6
            if (r14 != 0) goto L127
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r7, r3, r13)
            int r6 = r13.int1
            r2.putInt(r1, r4, r6)
            r9 = r9 | r21
            r4 = r11
            r6 = r16
            r5 = r17
            goto L1c
        L127:
            r8 = r3
            r18 = r12
            r12 = r1
            r1 = r2
            r2 = r4
            goto L351
        L12f:
            r11 = r4
            r10 = r5
            r4 = r18
            r19 = r6
            r6 = 2
            if (r14 != r6) goto L14a
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeBytes(r7, r3, r13)
            java.lang.Object r6 = r13.object1
            r2.putObject(r1, r4, r6)
            r9 = r9 | r21
            r4 = r11
            r6 = r16
            r5 = r17
            goto L1c
        L14a:
            r8 = r3
            r18 = r12
            r12 = r1
            r1 = r2
            r2 = r4
            goto L351
        L152:
            r11 = r4
            r10 = r5
            r4 = r18
            r19 = r6
            r6 = 2
            if (r14 != r6) goto L18f
            r6 = r1
            java.lang.Object r1 = r0.mutableMessageFieldForMerge(r6, r11)
            r18 = r2
            com.google.crypto.tink.shaded.protobuf.Schema r2 = r0.getMessageFieldSchema(r11)
            r26 = r4
            r4 = r3
            r3 = r7
            r5 = r8
            r8 = r18
            r7 = r6
            r18 = r12
            r6 = r13
            r12 = r26
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.mergeMessageField(r1, r2, r3, r4, r5, r6)
            r4 = r1
            r1 = r3
            r3 = r6
            r0.storeMessageField(r7, r11, r4)
            r9 = r9 | r21
            r4 = r7
            r7 = r1
            r1 = r4
            r13 = r3
            r4 = r11
            r6 = r16
            r5 = r17
            r3 = r2
            r2 = r8
            r8 = r33
            goto L1c
        L18f:
            r8 = r7
            r7 = r1
            r1 = r8
            r8 = r2
            r2 = r3
            r18 = r12
            r3 = r13
            r12 = r4
            r26 = r7
            r7 = r1
            r1 = r8
            r8 = r2
            r27 = r12
            r13 = r3
            r12 = r26
            r2 = r27
            goto L351
        L1a6:
            r8 = r7
            r7 = r1
            r1 = r8
            r8 = r2
            r2 = r3
            r11 = r4
            r10 = r5
            r3 = r13
            r26 = r18
            r19 = r6
            r18 = r12
            r12 = r26
            r6 = 2
            if (r14 != r6) goto L1dd
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r4 = r4 & r10
            if (r4 != 0) goto L1c3
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeString(r1, r2, r3)
            goto L1c7
        L1c3:
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeStringRequireUtf8(r1, r2, r3)
        L1c7:
            java.lang.Object r4 = r3.object1
            r8.putObject(r7, r12, r4)
            r9 = r9 | r21
            r4 = r7
            r7 = r1
            r1 = r4
            r13 = r3
            r4 = r11
            r6 = r16
            r5 = r17
            r3 = r2
            r2 = r8
            r8 = r33
            goto L1c
        L1dd:
            r26 = r7
            r7 = r1
            r1 = r8
            r8 = r2
            r27 = r12
            r13 = r3
            r12 = r26
            r2 = r27
            goto L351
        L1eb:
            r8 = r7
            r7 = r1
            r1 = r8
            r8 = r2
            r2 = r3
            r11 = r4
            r10 = r5
            r3 = r13
            r26 = r18
            r19 = r6
            r18 = r12
            r12 = r26
            if (r14 != 0) goto L220
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r1, r2, r3)
            long r4 = r3.long1
            r22 = 0
            int r4 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
            if (r4 == 0) goto L20b
            r4 = 1
            goto L20c
        L20b:
            r4 = 0
        L20c:
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putBoolean(r7, r12, r4)
            r9 = r9 | r21
            r4 = r7
            r7 = r1
            r1 = r4
            r13 = r3
            r4 = r11
            r6 = r16
            r5 = r17
            r3 = r2
            r2 = r8
            r8 = r33
            goto L1c
        L220:
            r26 = r7
            r7 = r1
            r1 = r8
            r8 = r2
            r27 = r12
            r13 = r3
            r12 = r26
            r2 = r27
            goto L351
        L22e:
            r8 = r7
            r7 = r1
            r1 = r8
            r8 = r2
            r2 = r3
            r11 = r4
            r4 = r10
            r3 = r13
            r10 = r5
            r26 = r18
            r19 = r6
            r18 = r12
            r12 = r26
            if (r14 != r4) goto L25b
            int r4 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFixed32(r1, r2)
            r8.putInt(r7, r12, r4)
            int r2 = r2 + 4
            r9 = r9 | r21
            r4 = r7
            r7 = r1
            r1 = r4
            r13 = r3
            r4 = r11
            r6 = r16
            r5 = r17
            r3 = r2
            r2 = r8
            r8 = r33
            goto L1c
        L25b:
            r26 = r7
            r7 = r1
            r1 = r8
            r8 = r2
            r27 = r12
            r13 = r3
            r12 = r26
            r2 = r27
            goto L351
        L269:
            r8 = r7
            r7 = r1
            r1 = r8
            r8 = r2
            r2 = r3
            r11 = r4
            r10 = r5
            r3 = r13
            r26 = r18
            r19 = r6
            r18 = r12
            r12 = r26
            r4 = 1
            if (r14 != r4) goto L2a0
            long r5 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFixed64(r1, r2)
            r4 = r7
            r7 = r1
            r1 = r8
            r8 = r2
            r2 = r4
            r26 = r12
            r13 = r3
            r3 = r26
            r1.putLong(r2, r3, r5)
            r26 = r2
            r2 = r1
            r1 = r26
            int r5 = r8 + 8
            r9 = r9 | r21
            r8 = r33
            r3 = r5
            r4 = r11
            r6 = r16
            r5 = r17
            goto L1c
        L2a0:
            r4 = r7
            r7 = r1
            r1 = r4
            r4 = r8
            r8 = r2
            r2 = r4
            r26 = r12
            r13 = r3
            r3 = r26
            r12 = r1
            r1 = r2
            r2 = r3
            goto L351
        L2b0:
            r8 = r3
            r11 = r4
            r10 = r5
            r3 = r18
            r19 = r6
            r18 = r12
            if (r14 != 0) goto L2d0
            int r5 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r7, r8, r13)
            int r6 = r13.int1
            r2.putInt(r1, r3, r6)
            r9 = r9 | r21
            r8 = r33
            r3 = r5
            r4 = r11
            r6 = r16
            r5 = r17
            goto L1c
        L2d0:
            r12 = r1
            r1 = r2
            r2 = r3
            goto L351
        L2d5:
            r8 = r3
            r11 = r4
            r10 = r5
            r3 = r18
            r19 = r6
            r18 = r12
            if (r14 != 0) goto L2fe
            int r8 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r7, r8, r13)
            long r5 = r13.long1
            r26 = r2
            r2 = r1
            r1 = r26
            r1.putLong(r2, r3, r5)
            r12 = r2
            r2 = r3
            r9 = r9 | r21
            r2 = r1
            r3 = r8
            r4 = r11
            r1 = r12
            r6 = r16
            r5 = r17
            r8 = r33
            goto L1c
        L2fe:
            r12 = r1
            r1 = r2
            r2 = r3
            goto L351
        L303:
            r8 = r3
            r11 = r4
            r4 = r10
            r10 = r5
            r26 = r12
            r12 = r1
            r1 = r2
            r2 = r18
            r19 = r6
            r18 = r26
            if (r14 != r4) goto L351
            float r4 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFloat(r7, r8)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putFloat(r12, r2, r4)
            int r4 = r8 + 4
            r9 = r9 | r21
            r8 = r33
            r2 = r1
            r3 = r4
            r4 = r11
            r1 = r12
            r6 = r16
            r5 = r17
            goto L1c
        L32a:
            r8 = r3
            r11 = r4
            r10 = r5
            r26 = r12
            r12 = r1
            r1 = r2
            r2 = r18
            r19 = r6
            r18 = r26
            r4 = 1
            if (r14 != r4) goto L351
            double r4 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeDouble(r7, r8)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putDouble(r12, r2, r4)
            int r4 = r8 + 8
            r9 = r9 | r21
            r8 = r33
            r2 = r1
            r3 = r4
            r4 = r11
            r1 = r12
            r6 = r16
            r5 = r17
            goto L1c
        L351:
            r25 = r1
            r2 = r8
            r7 = r14
            r5 = r17
            r6 = r18
            goto L4b7
        L35b:
            r8 = r3
            r10 = r5
            r32 = r11
            r11 = r4
            r26 = r12
            r12 = r1
            r1 = r2
            r2 = r18
            r18 = r26
            r4 = 27
            r5 = r32
            if (r5 != r4) goto L3d5
            r6 = 2
            if (r14 != r6) goto L3c0
            java.lang.Object r4 = r1.getObject(r12, r2)
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r4 = (com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList) r4
            boolean r6 = r4.isModifiable()
            if (r6 != 0) goto L396
            int r6 = r4.size()
            if (r6 != 0) goto L387
            r19 = 10
            goto L389
        L387:
            int r19 = r6 * 2
        L389:
            r32 = r5
            r5 = r19
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r4 = r4.mutableCopyWithCapacity(r5)
            r1.putObject(r12, r2, r4)
            r6 = r4
            goto L399
        L396:
            r32 = r5
            r6 = r4
        L399:
            r4 = r1
            com.google.crypto.tink.shaded.protobuf.Schema r1 = r0.getMessageFieldSchema(r11)
            r5 = r8
            r8 = r4
            r4 = r5
            r5 = r33
            r19 = r2
            r3 = r7
            r7 = r13
            r2 = r17
            r13 = r11
            r11 = r32
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeMessageList(r1, r2, r3, r4, r5, r6, r7)
            r5 = r2
            r7 = r31
            r3 = r1
            r2 = r8
            r1 = r12
            r4 = r13
            r6 = r16
            r8 = r33
            r13 = r34
            goto L1c
        L3c0:
            r19 = r2
            r3 = r8
            r13 = r11
            r8 = r1
            r11 = r5
            r5 = r17
            r25 = r8
            r24 = r9
            r11 = r13
            r12 = r14
            r10 = r18
            r9 = r5
            r18 = r15
            goto L474
        L3d5:
            r19 = r2
            r3 = r8
            r13 = r11
            r8 = r1
            r11 = r5
            r5 = r17
            r1 = 49
            if (r11 > r1) goto L428
            r1 = r3
            r4 = r9
            r2 = r10
            long r9 = (long) r2
            r17 = r2
            r24 = r4
            r25 = r8
            r8 = r13
            r7 = r14
            r6 = r18
            r2 = r31
            r4 = r33
            r14 = r34
            r18 = r15
            r15 = r1
            r1 = r12
            r12 = r19
            int r3 = r0.parseRepeatedField(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r9 = r5
            r10 = r6
            r12 = r7
            r13 = r11
            r11 = r8
            if (r3 == r15) goto L41c
            r0 = r29
            r1 = r30
            r7 = r31
            r8 = r33
            r13 = r34
            r5 = r9
            r4 = r11
            r6 = r16
            r15 = r18
            r9 = r24
            r2 = r25
            goto L1c
        L41c:
            r2 = r3
            r5 = r9
            r6 = r10
            r7 = r12
            r15 = r18
            r9 = r24
            r12 = r30
            goto L4b7
        L428:
            r12 = r13
            r13 = r11
            r11 = r12
            r25 = r8
            r24 = r9
            r17 = r10
            r12 = r14
            r10 = r18
            r9 = r5
            r18 = r15
            r0 = 50
            if (r13 != r0) goto L47f
            r6 = 2
            if (r12 != r6) goto L474
            r14 = r3
            r0 = r29
            r1 = r30
            r2 = r31
            r4 = r33
            r8 = r34
            r5 = r11
            r6 = r19
            int r3 = r0.parseMapField(r1, r2, r3, r4, r5, r6, r8)
            if (r3 == r14) goto L468
            r0 = r29
            r1 = r30
            r7 = r31
            r8 = r33
            r13 = r34
            r5 = r9
            r4 = r11
            r6 = r16
            r15 = r18
            r9 = r24
            r2 = r25
            goto L1c
        L468:
            r2 = r3
            r5 = r9
            r6 = r10
            r7 = r12
            r15 = r18
            r9 = r24
            r12 = r30
            goto L4b7
        L474:
            r2 = r3
            r5 = r9
            r6 = r10
            r7 = r12
            r15 = r18
            r9 = r24
            r12 = r30
            goto L4b7
        L47f:
            r14 = r3
            r0 = r29
            r1 = r30
            r2 = r31
            r4 = r33
            r5 = r9
            r6 = r10
            r7 = r12
            r9 = r13
            r8 = r17
            r13 = r34
            r12 = r11
            r10 = r19
            int r3 = r0.parseOneofField(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            r13 = r9
            r11 = r12
            r12 = r1
            r10 = r8
            if (r3 == r14) goto L4b2
            r0 = r29
            r7 = r31
            r8 = r33
            r13 = r34
            r4 = r11
            r1 = r12
            r6 = r16
            r15 = r18
            r9 = r24
            r2 = r25
            goto L1c
        L4b2:
            r2 = r3
            r15 = r18
            r9 = r24
        L4b7:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r4 = getMutableUnknownFields(r12)
            r1 = r31
            r3 = r33
            r0 = r5
            r5 = r34
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeUnknownField(r0, r1, r2, r3, r4, r5)
            r5 = r0
            r8 = r3
            r0 = r29
            r7 = r31
            r13 = r34
            r3 = r2
            r4 = r11
            r1 = r12
            r6 = r16
            r2 = r25
            goto L1c
        L4d8:
            r12 = r1
            r25 = r2
            r24 = r9
            r18 = r15
            r10 = 1048575(0xfffff, float:1.469367E-39)
            if (r15 == r10) goto L4ed
            long r0 = (long) r15
            r9 = r24
            r2 = r25
            r2.putInt(r12, r0, r9)
            goto L4f1
        L4ed:
            r9 = r24
            r2 = r25
        L4f1:
            if (r3 != r8) goto L4f4
            return r3
        L4f4:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
    }

    private int parseRepeatedField(T r14, byte[] r15, int r16, int r17, int r18, int r19, int r20, int r21, long r22, int r24, long r25, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r27) throws java.io.IOException {
            r13 = this;
            r8 = r20
            r9 = r21
            r10 = r25
            sun.misc.Unsafe r1 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            java.lang.Object r1 = r1.getObject(r14, r10)
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r1 = (com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList) r1
            boolean r2 = r1.isModifiable()
            if (r2 != 0) goto L2b
            int r2 = r1.size()
            if (r2 != 0) goto L1e
            r3 = 10
            goto L20
        L1e:
            int r3 = r2 * 2
        L20:
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r1 = r1.mutableCopyWithCapacity(r3)
            sun.misc.Unsafe r3 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            r3.putObject(r14, r10, r1)
            r4 = r1
            goto L2c
        L2b:
            r4 = r1
        L2c:
            r1 = 5
            r2 = 1
            r3 = 2
            switch(r24) {
                case 18: goto L1d6;
                case 19: goto L1ba;
                case 20: goto L19f;
                case 21: goto L19f;
                case 22: goto L185;
                case 23: goto L167;
                case 24: goto L148;
                case 25: goto L12a;
                case 26: goto Lf8;
                case 27: goto Ldf;
                case 28: goto Lce;
                case 29: goto L185;
                case 30: goto L9e;
                case 31: goto L148;
                case 32: goto L167;
                case 33: goto L7d;
                case 34: goto L57;
                case 35: goto L1d6;
                case 36: goto L1ba;
                case 37: goto L19f;
                case 38: goto L19f;
                case 39: goto L185;
                case 40: goto L167;
                case 41: goto L148;
                case 42: goto L12a;
                case 43: goto L185;
                case 44: goto L9e;
                case 45: goto L148;
                case 46: goto L167;
                case 47: goto L7d;
                case 48: goto L57;
                case 49: goto L34;
                default: goto L32;
            }
        L32:
            goto L1ef
        L34:
            r1 = 3
            if (r8 != r1) goto L50
        L38:
            com.google.crypto.tink.shaded.protobuf.Schema r1 = r13.getMessageFieldSchema(r9)
            r3 = r15
            r5 = r17
            r2 = r18
            r7 = r27
            r6 = r4
            r4 = r16
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeGroupList(r1, r2, r3, r4, r5, r6, r7)
            r2 = r3
            r5 = r7
            r2 = r1
            r4 = r6
            goto L1f1
        L50:
            r2 = r15
            r1 = r16
            r5 = r27
            goto L1ef
        L57:
            r2 = r15
            r1 = r16
            r5 = r27
            if (r8 != r3) goto L65
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodePackedSInt64List(r15, r1, r4, r5)
            r2 = r1
            goto L1f1
        L65:
            if (r8 != 0) goto L78
            r3 = r1
            r6 = r5
            r1 = r18
            r5 = r4
            r4 = r17
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeSInt64List(r1, r2, r3, r4, r5, r6)
            r1 = r2
            r4 = r5
            r5 = r6
            r2 = r3
            goto L1f1
        L78:
            r12 = r2
            r2 = r1
            r1 = r12
            goto L1ef
        L7d:
            r1 = r15
            r2 = r16
            r5 = r27
            if (r8 != r3) goto L8a
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodePackedSInt32List(r15, r2, r4, r5)
            goto L1f1
        L8a:
            if (r8 != 0) goto L1ef
            r3 = r2
            r6 = r5
            r2 = r1
            r5 = r4
            r4 = r17
            r1 = r18
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeSInt32List(r1, r2, r3, r4, r5, r6)
            r1 = r2
            r4 = r5
            r5 = r6
            r2 = r3
            goto L1f1
        L9e:
            r1 = r15
            r2 = r16
            r5 = r27
            if (r8 != r3) goto Lab
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodePackedVarint32List(r15, r2, r4, r5)
            r6 = r2
            goto Lbb
        Lab:
            if (r8 != 0) goto L1ef
            r3 = r2
            r6 = r5
            r2 = r1
            r5 = r4
            r4 = r17
            r1 = r18
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32List(r1, r2, r3, r4, r5, r6)
            r4 = r5
            r6 = r3
        Lbb:
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r3 = r13.getEnumFieldVerifier(r9)
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r5 = r13.unknownFieldSchema
            r2 = r4
            r4 = 0
            r0 = r14
            r1 = r19
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.filterUnknownEnumList(r0, r1, r2, r3, r4, r5)
            r4 = r2
            r2 = r6
            goto L1f1
        Lce:
            if (r8 != r3) goto L1ef
            r1 = r15
            r2 = r16
            r3 = r17
            r0 = r18
            r5 = r27
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeBytesList(r0, r1, r2, r3, r4, r5)
            goto L1f1
        Ldf:
            if (r8 != r3) goto L1ef
        Le2:
            com.google.crypto.tink.shaded.protobuf.Schema r0 = r13.getMessageFieldSchema(r9)
            r2 = r15
            r3 = r16
            r1 = r18
            r6 = r27
            r5 = r4
            r4 = r17
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeMessageList(r0, r1, r2, r3, r4, r5, r6)
            r2 = r0
            r4 = r5
            goto L1f1
        Lf8:
            if (r8 != r3) goto L123
            r0 = 536870912(0x20000000, double:2.65249474E-315)
            long r0 = r22 & r0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L114
            r1 = r15
            r2 = r16
            r3 = r17
            r0 = r18
            r5 = r27
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeStringList(r0, r1, r2, r3, r4, r5)
            goto L1f1
        L114:
            r1 = r15
            r2 = r16
            r3 = r17
            r0 = r18
            r5 = r27
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeStringListRequireUtf8(r0, r1, r2, r3, r4, r5)
            goto L1f1
        L123:
            r1 = r15
            r2 = r16
            r5 = r27
            goto L1ef
        L12a:
            r1 = r15
            r2 = r16
            r5 = r27
            if (r8 != r3) goto L138
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodePackedBoolList(r15, r2, r4, r5)
            r2 = r0
            goto L1f1
        L138:
            if (r8 != 0) goto L145
            r3 = r17
            r0 = r18
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeBoolList(r0, r1, r2, r3, r4, r5)
            r0 = r1
            goto L1f1
        L145:
            r0 = r1
            goto L1ef
        L148:
            r0 = r15
            r2 = r16
            r5 = r27
            if (r8 != r3) goto L156
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodePackedFixed32List(r15, r2, r4, r5)
            r2 = r1
            goto L1f1
        L156:
            if (r8 != r1) goto L163
            r3 = r17
            r1 = r0
            r0 = r18
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFixed32List(r0, r1, r2, r3, r4, r5)
            goto L1f1
        L163:
            r1 = r0
            r0 = r2
            goto L1ef
        L167:
            r1 = r15
            r0 = r16
            r5 = r27
            if (r8 != r3) goto L175
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodePackedFixed64List(r15, r0, r4, r5)
            r2 = r0
            goto L1f1
        L175:
            if (r8 != r2) goto L182
            r3 = r17
            r2 = r0
            r0 = r18
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFixed64List(r0, r1, r2, r3, r4, r5)
            goto L1f1
        L182:
            r2 = r0
            goto L1ef
        L185:
            r1 = r15
            r2 = r16
            r5 = r27
            if (r8 != r3) goto L193
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodePackedVarint32List(r15, r2, r4, r5)
            r2 = r0
            goto L1f1
        L193:
            if (r8 != 0) goto L1ef
            r3 = r17
            r0 = r18
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32List(r0, r1, r2, r3, r4, r5)
            goto L1f1
        L19f:
            r1 = r15
            r2 = r16
            r5 = r27
            if (r8 != r3) goto L1ac
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodePackedVarint64List(r15, r2, r4, r5)
            r2 = r0
            goto L1f1
        L1ac:
            if (r8 != 0) goto L1b8
            r3 = r17
            r0 = r18
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64List(r0, r1, r2, r3, r4, r5)
            r0 = r1
            goto L1f1
        L1b8:
            r0 = r1
            goto L1ef
        L1ba:
            r0 = r15
            r2 = r16
            r5 = r27
            if (r8 != r3) goto L1c7
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodePackedFloatList(r15, r2, r4, r5)
            r2 = r1
            goto L1f1
        L1c7:
            if (r8 != r1) goto L1d3
            r3 = r17
            r1 = r0
            r0 = r18
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFloatList(r0, r1, r2, r3, r4, r5)
            goto L1f1
        L1d3:
            r1 = r0
            r0 = r2
            goto L1ef
        L1d6:
            r1 = r15
            r0 = r16
            r5 = r27
            if (r8 != r3) goto L1e3
            int r0 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodePackedDoubleList(r15, r0, r4, r5)
            r2 = r0
            goto L1f1
        L1e3:
            if (r8 != r2) goto L1ef
            r3 = r17
            r2 = r0
            r0 = r18
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeDoubleList(r0, r1, r2, r3, r4, r5)
            goto L1f1
        L1ef:
            r2 = r16
        L1f1:
            return r2
    }

    private int positionForFieldNumber(int r2) {
            r1 = this;
            int r0 = r1.minFieldNumber
            if (r2 < r0) goto Le
            int r0 = r1.maxFieldNumber
            if (r2 > r0) goto Le
            r0 = 0
            int r0 = r1.slowPositionForFieldNumber(r2, r0)
            return r0
        Le:
            r0 = -1
            return r0
    }

    private int positionForFieldNumber(int r2, int r3) {
            r1 = this;
            int r0 = r1.minFieldNumber
            if (r2 < r0) goto Ld
            int r0 = r1.maxFieldNumber
            if (r2 > r0) goto Ld
            int r0 = r1.slowPositionForFieldNumber(r2, r3)
            return r0
        Ld:
            r0 = -1
            return r0
    }

    private int presenceMaskAndOffsetAt(int r3) {
            r2 = this;
            int[] r0 = r2.buffer
            int r1 = r3 + 2
            r0 = r0[r1]
            return r0
    }

    private <E> void readGroupList(java.lang.Object r2, long r3, com.google.crypto.tink.shaded.protobuf.Reader r5, com.google.crypto.tink.shaded.protobuf.Schema<E> r6, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r7) throws java.io.IOException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r1.listFieldSchema
            java.util.List r0 = r0.mutableListAt(r2, r3)
            r5.readGroupList(r0, r6, r7)
            return
    }

    private <E> void readMessageList(java.lang.Object r4, int r5, com.google.crypto.tink.shaded.protobuf.Reader r6, com.google.crypto.tink.shaded.protobuf.Schema<E> r7, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r8) throws java.io.IOException {
            r3 = this;
            long r0 = offset(r5)
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r2 = r3.listFieldSchema
            java.util.List r2 = r2.mutableListAt(r4, r0)
            r6.readMessageList(r2, r7, r8)
            return
    }

    private void readString(java.lang.Object r4, int r5, com.google.crypto.tink.shaded.protobuf.Reader r6) throws java.io.IOException {
            r3 = this;
            boolean r0 = isEnforceUtf8(r5)
            if (r0 == 0) goto L12
            long r0 = offset(r5)
            java.lang.String r2 = r6.readStringRequireUtf8()
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r4, r0, r2)
            goto L2d
        L12:
            boolean r0 = r3.lite
            if (r0 == 0) goto L22
            long r0 = offset(r5)
            java.lang.String r2 = r6.readString()
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r4, r0, r2)
            goto L2d
        L22:
            long r0 = offset(r5)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r6.readBytes()
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putObject(r4, r0, r2)
        L2d:
            return
    }

    private void readStringList(java.lang.Object r4, int r5, com.google.crypto.tink.shaded.protobuf.Reader r6) throws java.io.IOException {
            r3 = this;
            boolean r0 = isEnforceUtf8(r5)
            if (r0 == 0) goto L14
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r3.listFieldSchema
            long r1 = offset(r5)
            java.util.List r0 = r0.mutableListAt(r4, r1)
            r6.readStringListRequireUtf8(r0)
            goto L21
        L14:
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r0 = r3.listFieldSchema
            long r1 = offset(r5)
            java.util.List r0 = r0.mutableListAt(r4, r1)
            r6.readStringList(r0)
        L21:
            return
    }

    private static java.lang.reflect.Field reflectField(java.lang.Class<?> r6, java.lang.String r7) {
            java.lang.reflect.Field r0 = r6.getDeclaredField(r7)     // Catch: java.lang.NoSuchFieldException -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.reflect.Field[] r1 = r6.getDeclaredFields()
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L1e
            r4 = r1[r3]
            java.lang.String r5 = r4.getName()
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L1b
            return r4
        L1b:
            int r3 = r3 + 1
            goto Lc
        L1e:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Field "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r4 = " for "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r6.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " not found. Known fields are "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = java.util.Arrays.toString(r1)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    private void setFieldPresent(T r6, int r7) {
            r5 = this;
            int r0 = r5.presenceMaskAndOffsetAt(r7)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r1 = (long) r1
            r3 = 1048575(0xfffff, double:5.18065E-318)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L11
            return
        L11:
            int r3 = r0 >>> 20
            r4 = 1
            int r3 = r4 << r3
            int r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r6, r1)
            r4 = r4 | r3
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r6, r1, r4)
            return
    }

    private void setOneofPresent(T r4, int r5, int r6) {
            r3 = this;
            int r0 = r3.presenceMaskAndOffsetAt(r6)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r1 = (long) r1
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putInt(r4, r1, r5)
            return
    }

    private int slowPositionForFieldNumber(int r5, int r6) {
            r4 = this;
            int[] r0 = r4.buffer
            int r0 = r0.length
            int r0 = r0 / 3
            int r0 = r0 + (-1)
        L7:
            if (r6 > r0) goto L1e
            int r1 = r0 + r6
            int r1 = r1 >>> 1
            int r2 = r1 * 3
            int r3 = r4.numberAt(r2)
            if (r5 != r3) goto L16
            return r2
        L16:
            if (r5 >= r3) goto L1b
            int r0 = r1 + (-1)
            goto L1d
        L1b:
            int r6 = r1 + 1
        L1d:
            goto L7
        L1e:
            r1 = -1
            return r1
    }

    private static void storeFieldData(com.google.crypto.tink.shaded.protobuf.FieldInfo r9, int[] r10, int r11, java.lang.Object[] r12) {
            com.google.crypto.tink.shaded.protobuf.OneofInfo r0 = r9.getOneof()
            if (r0 == 0) goto L24
            com.google.crypto.tink.shaded.protobuf.FieldType r1 = r9.getType()
            int r1 = r1.id()
            int r1 = r1 + 51
            java.lang.reflect.Field r2 = r0.getValueField()
            long r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r2)
            int r2 = (int) r2
            java.lang.reflect.Field r3 = r0.getCaseField()
            long r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r3)
            int r3 = (int) r3
            r4 = 0
            goto L74
        L24:
            com.google.crypto.tink.shaded.protobuf.FieldType r1 = r9.getType()
            java.lang.reflect.Field r2 = r9.getField()
            long r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r2)
            int r2 = (int) r2
            int r3 = r1.id()
            boolean r4 = r1.isList()
            if (r4 != 0) goto L5b
            boolean r4 = r1.isMap()
            if (r4 != 0) goto L5b
            java.lang.reflect.Field r4 = r9.getPresenceField()
            if (r4 != 0) goto L4b
            r5 = 1048575(0xfffff, float:1.469367E-39)
            goto L50
        L4b:
            long r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r4)
            int r5 = (int) r5
        L50:
            int r6 = r9.getPresenceMask()
            int r4 = java.lang.Integer.numberOfTrailingZeros(r6)
            r1 = r3
            r3 = r5
            goto L74
        L5b:
            java.lang.reflect.Field r4 = r9.getCachedSizeField()
            if (r4 != 0) goto L67
            r4 = 0
            r5 = 0
            r1 = r3
            r3 = r4
            r4 = r5
            goto L74
        L67:
            java.lang.reflect.Field r4 = r9.getCachedSizeField()
            long r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.objectFieldOffset(r4)
            int r4 = (int) r4
            r5 = 0
            r1 = r3
            r3 = r4
            r4 = r5
        L74:
            int r5 = r9.getFieldNumber()
            r10[r11] = r5
            int r5 = r11 + 1
            boolean r6 = r9.isEnforceUtf8()
            r7 = 0
            if (r6 == 0) goto L86
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L87
        L86:
            r6 = r7
        L87:
            boolean r8 = r9.isRequired()
            if (r8 == 0) goto L8f
            r7 = 268435456(0x10000000, float:2.524355E-29)
        L8f:
            r6 = r6 | r7
            int r7 = r1 << 20
            r6 = r6 | r7
            r6 = r6 | r2
            r10[r5] = r6
            int r5 = r11 + 2
            int r6 = r4 << 20
            r6 = r6 | r3
            r10[r5] = r6
            java.lang.Class r5 = r9.getMessageFieldClass()
            java.lang.Object r6 = r9.getMapDefaultEntry()
            if (r6 == 0) goto Lcf
            int r6 = r11 / 3
            int r6 = r6 * 2
            java.lang.Object r7 = r9.getMapDefaultEntry()
            r12[r6] = r7
            if (r5 == 0) goto Lbc
            int r6 = r11 / 3
            int r6 = r6 * 2
            int r6 = r6 + 1
            r12[r6] = r5
            goto Lec
        Lbc:
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r6 = r9.getEnumVerifier()
            if (r6 == 0) goto Lec
            int r6 = r11 / 3
            int r6 = r6 * 2
            int r6 = r6 + 1
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r7 = r9.getEnumVerifier()
            r12[r6] = r7
            goto Lec
        Lcf:
            if (r5 == 0) goto Lda
            int r6 = r11 / 3
            int r6 = r6 * 2
            int r6 = r6 + 1
            r12[r6] = r5
            goto Lec
        Lda:
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r6 = r9.getEnumVerifier()
            if (r6 == 0) goto Lec
            int r6 = r11 / 3
            int r6 = r6 * 2
            int r6 = r6 + 1
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r7 = r9.getEnumVerifier()
            r12[r6] = r7
        Lec:
            return
    }

    private void storeMessageField(T r4, int r5, java.lang.Object r6) {
            r3 = this;
            sun.misc.Unsafe r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            int r1 = r3.typeAndOffsetAt(r5)
            long r1 = offset(r1)
            r0.putObject(r4, r1, r6)
            r3.setFieldPresent(r4, r5)
            return
    }

    private void storeOneofMessageField(T r4, int r5, int r6, java.lang.Object r7) {
            r3 = this;
            sun.misc.Unsafe r0 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            int r1 = r3.typeAndOffsetAt(r6)
            long r1 = offset(r1)
            r0.putObject(r4, r1, r7)
            r3.setOneofPresent(r4, r5, r6)
            return
    }

    private static int type(int r1) {
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r1
            int r0 = r0 >>> 20
            return r0
    }

    private int typeAndOffsetAt(int r3) {
            r2 = this;
            int[] r0 = r2.buffer
            int r1 = r3 + 1
            r0 = r0[r1]
            return r0
    }

    private void writeFieldsInAscendingOrderProto2(T r22, com.google.crypto.tink.shaded.protobuf.Writer r23) throws java.io.IOException {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 0
            r4 = 0
            boolean r5 = r0.hasExtensions
            if (r5 == 0) goto L23
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r5 = r0.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r5 = r5.getExtensions(r1)
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L23
            java.util.Iterator r3 = r5.iterator()
            java.lang.Object r6 = r3.next()
            r4 = r6
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
        L23:
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = 0
            int[] r7 = r0.buffer
            int r7 = r7.length
            sun.misc.Unsafe r8 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            r9 = 0
        L2d:
            if (r9 >= r7) goto L617
            int r11 = r0.typeAndOffsetAt(r9)
            int r12 = r0.numberAt(r9)
            int r13 = type(r11)
            r14 = 0
            r15 = 0
            r10 = 17
            r16 = r3
            if (r13 > r10) goto L65
            int[] r10 = r0.buffer
            int r17 = r9 + 2
            r14 = r10[r17]
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r14
            if (r10 == r5) goto L5a
            r5 = r10
            r17 = r4
            r18 = 1
            long r3 = (long) r10
            int r6 = r8.getInt(r1, r3)
            goto L5e
        L5a:
            r17 = r4
            r18 = 1
        L5e:
            int r3 = r14 >>> 20
            int r15 = r18 << r3
            r4 = r17
            goto L69
        L65:
            r17 = r4
            r18 = 1
        L69:
            if (r4 == 0) goto L88
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r3 = r0.extensionSchema
            int r3 = r3.extensionNumber(r4)
            if (r3 > r12) goto L88
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r3 = r0.extensionSchema
            r3.serializeExtension(r2, r4)
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L85
            java.lang.Object r3 = r16.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            goto L86
        L85:
            r3 = 0
        L86:
            r4 = r3
            goto L69
        L88:
            r10 = r4
            long r3 = offset(r11)
            r17 = r5
            r5 = 0
            switch(r13) {
                case 0: goto L5fb;
                case 1: goto L5eb;
                case 2: goto L5db;
                case 3: goto L5cb;
                case 4: goto L5bb;
                case 5: goto L5ab;
                case 6: goto L59b;
                case 7: goto L58a;
                case 8: goto L579;
                case 9: goto L564;
                case 10: goto L551;
                case 11: goto L540;
                case 12: goto L52f;
                case 13: goto L51e;
                case 14: goto L50d;
                case 15: goto L4fc;
                case 16: goto L4eb;
                case 17: goto L4d5;
                case 18: goto L4c2;
                case 19: goto L4af;
                case 20: goto L49c;
                case 21: goto L489;
                case 22: goto L476;
                case 23: goto L463;
                case 24: goto L450;
                case 25: goto L43d;
                case 26: goto L42a;
                case 27: goto L413;
                case 28: goto L400;
                case 29: goto L3ed;
                case 30: goto L3da;
                case 31: goto L3c7;
                case 32: goto L3b4;
                case 33: goto L3a1;
                case 34: goto L38e;
                case 35: goto L379;
                case 36: goto L364;
                case 37: goto L34f;
                case 38: goto L33a;
                case 39: goto L325;
                case 40: goto L310;
                case 41: goto L2fb;
                case 42: goto L2e6;
                case 43: goto L2d1;
                case 44: goto L2bc;
                case 45: goto L2a7;
                case 46: goto L292;
                case 47: goto L27d;
                case 48: goto L268;
                case 49: goto L251;
                case 50: goto L244;
                case 51: goto L22d;
                case 52: goto L216;
                case 53: goto L1ff;
                case 54: goto L1e8;
                case 55: goto L1d1;
                case 56: goto L1ba;
                case 57: goto L1a3;
                case 58: goto L18c;
                case 59: goto L175;
                case 60: goto L15a;
                case 61: goto L141;
                case 62: goto L12a;
                case 63: goto L113;
                case 64: goto Lfc;
                case 65: goto Le5;
                case 66: goto Lce;
                case 67: goto Lb7;
                case 68: goto L99;
                default: goto L93;
            }
        L93:
            r19 = r6
            r20 = r7
            goto L60a
        L99:
            boolean r5 = r0.isOneofPresent(r1, r12, r9)
            if (r5 == 0) goto Lb1
        La0:
            java.lang.Object r5 = r8.getObject(r1, r3)
            r19 = r6
            com.google.crypto.tink.shaded.protobuf.Schema r6 = r0.getMessageFieldSchema(r9)
            r2.writeGroup(r12, r5, r6)
            r20 = r7
            goto L60a
        Lb1:
            r19 = r6
            r20 = r7
            goto L60a
        Lb7:
            r19 = r6
            boolean r5 = r0.isOneofPresent(r1, r12, r9)
            if (r5 == 0) goto Lca
            long r5 = oneofLongAt(r1, r3)
            r2.writeSInt64(r12, r5)
            r20 = r7
            goto L60a
        Lca:
            r20 = r7
            goto L60a
        Lce:
            r19 = r6
            boolean r5 = r0.isOneofPresent(r1, r12, r9)
            if (r5 == 0) goto Le1
            int r5 = oneofIntAt(r1, r3)
            r2.writeSInt32(r12, r5)
            r20 = r7
            goto L60a
        Le1:
            r20 = r7
            goto L60a
        Le5:
            r19 = r6
            boolean r5 = r0.isOneofPresent(r1, r12, r9)
            if (r5 == 0) goto Lf8
            long r5 = oneofLongAt(r1, r3)
            r2.writeSFixed64(r12, r5)
            r20 = r7
            goto L60a
        Lf8:
            r20 = r7
            goto L60a
        Lfc:
            r19 = r6
            boolean r5 = r0.isOneofPresent(r1, r12, r9)
            if (r5 == 0) goto L10f
            int r5 = oneofIntAt(r1, r3)
            r2.writeSFixed32(r12, r5)
            r20 = r7
            goto L60a
        L10f:
            r20 = r7
            goto L60a
        L113:
            r19 = r6
            boolean r5 = r0.isOneofPresent(r1, r12, r9)
            if (r5 == 0) goto L126
            int r5 = oneofIntAt(r1, r3)
            r2.writeEnum(r12, r5)
            r20 = r7
            goto L60a
        L126:
            r20 = r7
            goto L60a
        L12a:
            r19 = r6
            boolean r5 = r0.isOneofPresent(r1, r12, r9)
            if (r5 == 0) goto L13d
            int r5 = oneofIntAt(r1, r3)
            r2.writeUInt32(r12, r5)
            r20 = r7
            goto L60a
        L13d:
            r20 = r7
            goto L60a
        L141:
            r19 = r6
            boolean r5 = r0.isOneofPresent(r1, r12, r9)
            if (r5 == 0) goto L156
            java.lang.Object r5 = r8.getObject(r1, r3)
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = (com.google.crypto.tink.shaded.protobuf.ByteString) r5
            r2.writeBytes(r12, r5)
            r20 = r7
            goto L60a
        L156:
            r20 = r7
            goto L60a
        L15a:
            r19 = r6
            boolean r5 = r0.isOneofPresent(r1, r12, r9)
            if (r5 == 0) goto L171
            java.lang.Object r5 = r8.getObject(r1, r3)
            com.google.crypto.tink.shaded.protobuf.Schema r6 = r0.getMessageFieldSchema(r9)
            r2.writeMessage(r12, r5, r6)
            r20 = r7
            goto L60a
        L171:
            r20 = r7
            goto L60a
        L175:
            r19 = r6
            boolean r5 = r0.isOneofPresent(r1, r12, r9)
            if (r5 == 0) goto L188
            java.lang.Object r5 = r8.getObject(r1, r3)
            r0.writeString(r12, r5, r2)
            r20 = r7
            goto L60a
        L188:
            r20 = r7
            goto L60a
        L18c:
            r19 = r6
            boolean r5 = r0.isOneofPresent(r1, r12, r9)
            if (r5 == 0) goto L19f
            boolean r5 = oneofBooleanAt(r1, r3)
            r2.writeBool(r12, r5)
            r20 = r7
            goto L60a
        L19f:
            r20 = r7
            goto L60a
        L1a3:
            r19 = r6
            boolean r5 = r0.isOneofPresent(r1, r12, r9)
            if (r5 == 0) goto L1b6
            int r5 = oneofIntAt(r1, r3)
            r2.writeFixed32(r12, r5)
            r20 = r7
            goto L60a
        L1b6:
            r20 = r7
            goto L60a
        L1ba:
            r19 = r6
            boolean r5 = r0.isOneofPresent(r1, r12, r9)
            if (r5 == 0) goto L1cd
            long r5 = oneofLongAt(r1, r3)
            r2.writeFixed64(r12, r5)
            r20 = r7
            goto L60a
        L1cd:
            r20 = r7
            goto L60a
        L1d1:
            r19 = r6
            boolean r5 = r0.isOneofPresent(r1, r12, r9)
            if (r5 == 0) goto L1e4
            int r5 = oneofIntAt(r1, r3)
            r2.writeInt32(r12, r5)
            r20 = r7
            goto L60a
        L1e4:
            r20 = r7
            goto L60a
        L1e8:
            r19 = r6
            boolean r5 = r0.isOneofPresent(r1, r12, r9)
            if (r5 == 0) goto L1fb
            long r5 = oneofLongAt(r1, r3)
            r2.writeUInt64(r12, r5)
            r20 = r7
            goto L60a
        L1fb:
            r20 = r7
            goto L60a
        L1ff:
            r19 = r6
            boolean r5 = r0.isOneofPresent(r1, r12, r9)
            if (r5 == 0) goto L212
            long r5 = oneofLongAt(r1, r3)
            r2.writeInt64(r12, r5)
            r20 = r7
            goto L60a
        L212:
            r20 = r7
            goto L60a
        L216:
            r19 = r6
            boolean r5 = r0.isOneofPresent(r1, r12, r9)
            if (r5 == 0) goto L229
            float r5 = oneofFloatAt(r1, r3)
            r2.writeFloat(r12, r5)
            r20 = r7
            goto L60a
        L229:
            r20 = r7
            goto L60a
        L22d:
            r19 = r6
            boolean r5 = r0.isOneofPresent(r1, r12, r9)
            if (r5 == 0) goto L240
            double r5 = oneofDoubleAt(r1, r3)
            r2.writeDouble(r12, r5)
            r20 = r7
            goto L60a
        L240:
            r20 = r7
            goto L60a
        L244:
            r19 = r6
            java.lang.Object r5 = r8.getObject(r1, r3)
            r0.writeMapHelper(r2, r12, r5, r9)
            r20 = r7
            goto L60a
        L251:
            r19 = r6
            int r5 = r0.numberAt(r9)
            java.lang.Object r6 = r8.getObject(r1, r3)
            java.util.List r6 = (java.util.List) r6
            r20 = r7
            com.google.crypto.tink.shaded.protobuf.Schema r7 = r0.getMessageFieldSchema(r9)
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeGroupList(r5, r6, r2, r7)
            goto L60a
        L268:
            r19 = r6
            r20 = r7
            int r5 = r0.numberAt(r9)
            java.lang.Object r6 = r8.getObject(r1, r3)
            java.util.List r6 = (java.util.List) r6
            r7 = r18
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt64List(r5, r6, r2, r7)
            goto L60a
        L27d:
            r19 = r6
            r20 = r7
            r7 = r18
            int r5 = r0.numberAt(r9)
            java.lang.Object r6 = r8.getObject(r1, r3)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt32List(r5, r6, r2, r7)
            goto L60a
        L292:
            r19 = r6
            r20 = r7
            r7 = r18
            int r5 = r0.numberAt(r9)
            java.lang.Object r6 = r8.getObject(r1, r3)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed64List(r5, r6, r2, r7)
            goto L60a
        L2a7:
            r19 = r6
            r20 = r7
            r7 = r18
            int r5 = r0.numberAt(r9)
            java.lang.Object r6 = r8.getObject(r1, r3)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed32List(r5, r6, r2, r7)
            goto L60a
        L2bc:
            r19 = r6
            r20 = r7
            r7 = r18
            int r5 = r0.numberAt(r9)
            java.lang.Object r6 = r8.getObject(r1, r3)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeEnumList(r5, r6, r2, r7)
            goto L60a
        L2d1:
            r19 = r6
            r20 = r7
            r7 = r18
            int r5 = r0.numberAt(r9)
            java.lang.Object r6 = r8.getObject(r1, r3)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt32List(r5, r6, r2, r7)
            goto L60a
        L2e6:
            r19 = r6
            r20 = r7
            r7 = r18
            int r5 = r0.numberAt(r9)
            java.lang.Object r6 = r8.getObject(r1, r3)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeBoolList(r5, r6, r2, r7)
            goto L60a
        L2fb:
            r19 = r6
            r20 = r7
            r7 = r18
            int r5 = r0.numberAt(r9)
            java.lang.Object r6 = r8.getObject(r1, r3)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed32List(r5, r6, r2, r7)
            goto L60a
        L310:
            r19 = r6
            r20 = r7
            r7 = r18
            int r5 = r0.numberAt(r9)
            java.lang.Object r6 = r8.getObject(r1, r3)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed64List(r5, r6, r2, r7)
            goto L60a
        L325:
            r19 = r6
            r20 = r7
            r7 = r18
            int r5 = r0.numberAt(r9)
            java.lang.Object r6 = r8.getObject(r1, r3)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt32List(r5, r6, r2, r7)
            goto L60a
        L33a:
            r19 = r6
            r20 = r7
            r7 = r18
            int r5 = r0.numberAt(r9)
            java.lang.Object r6 = r8.getObject(r1, r3)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt64List(r5, r6, r2, r7)
            goto L60a
        L34f:
            r19 = r6
            r20 = r7
            r7 = r18
            int r5 = r0.numberAt(r9)
            java.lang.Object r6 = r8.getObject(r1, r3)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt64List(r5, r6, r2, r7)
            goto L60a
        L364:
            r19 = r6
            r20 = r7
            r7 = r18
            int r5 = r0.numberAt(r9)
            java.lang.Object r6 = r8.getObject(r1, r3)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFloatList(r5, r6, r2, r7)
            goto L60a
        L379:
            r19 = r6
            r20 = r7
            r7 = r18
            int r5 = r0.numberAt(r9)
            java.lang.Object r6 = r8.getObject(r1, r3)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeDoubleList(r5, r6, r2, r7)
            goto L60a
        L38e:
            r19 = r6
            r20 = r7
            int r6 = r0.numberAt(r9)
            java.lang.Object r7 = r8.getObject(r1, r3)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt64List(r6, r7, r2, r5)
            goto L60a
        L3a1:
            r19 = r6
            r20 = r7
            int r6 = r0.numberAt(r9)
            java.lang.Object r7 = r8.getObject(r1, r3)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt32List(r6, r7, r2, r5)
            goto L60a
        L3b4:
            r19 = r6
            r20 = r7
            int r6 = r0.numberAt(r9)
            java.lang.Object r7 = r8.getObject(r1, r3)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed64List(r6, r7, r2, r5)
            goto L60a
        L3c7:
            r19 = r6
            r20 = r7
            int r6 = r0.numberAt(r9)
            java.lang.Object r7 = r8.getObject(r1, r3)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed32List(r6, r7, r2, r5)
            goto L60a
        L3da:
            r19 = r6
            r20 = r7
            int r6 = r0.numberAt(r9)
            java.lang.Object r7 = r8.getObject(r1, r3)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeEnumList(r6, r7, r2, r5)
            goto L60a
        L3ed:
            r19 = r6
            r20 = r7
            int r6 = r0.numberAt(r9)
            java.lang.Object r7 = r8.getObject(r1, r3)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt32List(r6, r7, r2, r5)
            goto L60a
        L400:
            r19 = r6
            r20 = r7
            int r5 = r0.numberAt(r9)
            java.lang.Object r6 = r8.getObject(r1, r3)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeBytesList(r5, r6, r2)
            goto L60a
        L413:
            r19 = r6
            r20 = r7
            int r5 = r0.numberAt(r9)
            java.lang.Object r6 = r8.getObject(r1, r3)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.Schema r7 = r0.getMessageFieldSchema(r9)
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeMessageList(r5, r6, r2, r7)
            goto L60a
        L42a:
            r19 = r6
            r20 = r7
            int r5 = r0.numberAt(r9)
            java.lang.Object r6 = r8.getObject(r1, r3)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeStringList(r5, r6, r2)
            goto L60a
        L43d:
            r19 = r6
            r20 = r7
            int r6 = r0.numberAt(r9)
            java.lang.Object r7 = r8.getObject(r1, r3)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeBoolList(r6, r7, r2, r5)
            goto L60a
        L450:
            r19 = r6
            r20 = r7
            int r6 = r0.numberAt(r9)
            java.lang.Object r7 = r8.getObject(r1, r3)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed32List(r6, r7, r2, r5)
            goto L60a
        L463:
            r19 = r6
            r20 = r7
            int r6 = r0.numberAt(r9)
            java.lang.Object r7 = r8.getObject(r1, r3)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed64List(r6, r7, r2, r5)
            goto L60a
        L476:
            r19 = r6
            r20 = r7
            int r6 = r0.numberAt(r9)
            java.lang.Object r7 = r8.getObject(r1, r3)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt32List(r6, r7, r2, r5)
            goto L60a
        L489:
            r19 = r6
            r20 = r7
            int r6 = r0.numberAt(r9)
            java.lang.Object r7 = r8.getObject(r1, r3)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt64List(r6, r7, r2, r5)
            goto L60a
        L49c:
            r19 = r6
            r20 = r7
            int r6 = r0.numberAt(r9)
            java.lang.Object r7 = r8.getObject(r1, r3)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt64List(r6, r7, r2, r5)
            goto L60a
        L4af:
            r19 = r6
            r20 = r7
            int r6 = r0.numberAt(r9)
            java.lang.Object r7 = r8.getObject(r1, r3)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFloatList(r6, r7, r2, r5)
            goto L60a
        L4c2:
            r19 = r6
            r20 = r7
            int r6 = r0.numberAt(r9)
            java.lang.Object r7 = r8.getObject(r1, r3)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeDoubleList(r6, r7, r2, r5)
            goto L60a
        L4d5:
            r19 = r6
            r20 = r7
            r5 = r19 & r15
            if (r5 == 0) goto L60a
        L4de:
            java.lang.Object r5 = r8.getObject(r1, r3)
            com.google.crypto.tink.shaded.protobuf.Schema r6 = r0.getMessageFieldSchema(r9)
            r2.writeGroup(r12, r5, r6)
            goto L60a
        L4eb:
            r19 = r6
            r20 = r7
            r5 = r19 & r15
            if (r5 == 0) goto L60a
            long r5 = r8.getLong(r1, r3)
            r2.writeSInt64(r12, r5)
            goto L60a
        L4fc:
            r19 = r6
            r20 = r7
            r5 = r19 & r15
            if (r5 == 0) goto L60a
            int r5 = r8.getInt(r1, r3)
            r2.writeSInt32(r12, r5)
            goto L60a
        L50d:
            r19 = r6
            r20 = r7
            r5 = r19 & r15
            if (r5 == 0) goto L60a
            long r5 = r8.getLong(r1, r3)
            r2.writeSFixed64(r12, r5)
            goto L60a
        L51e:
            r19 = r6
            r20 = r7
            r5 = r19 & r15
            if (r5 == 0) goto L60a
            int r5 = r8.getInt(r1, r3)
            r2.writeSFixed32(r12, r5)
            goto L60a
        L52f:
            r19 = r6
            r20 = r7
            r5 = r19 & r15
            if (r5 == 0) goto L60a
            int r5 = r8.getInt(r1, r3)
            r2.writeEnum(r12, r5)
            goto L60a
        L540:
            r19 = r6
            r20 = r7
            r5 = r19 & r15
            if (r5 == 0) goto L60a
            int r5 = r8.getInt(r1, r3)
            r2.writeUInt32(r12, r5)
            goto L60a
        L551:
            r19 = r6
            r20 = r7
            r5 = r19 & r15
            if (r5 == 0) goto L60a
            java.lang.Object r5 = r8.getObject(r1, r3)
            com.google.crypto.tink.shaded.protobuf.ByteString r5 = (com.google.crypto.tink.shaded.protobuf.ByteString) r5
            r2.writeBytes(r12, r5)
            goto L60a
        L564:
            r19 = r6
            r20 = r7
            r5 = r19 & r15
            if (r5 == 0) goto L60a
            java.lang.Object r5 = r8.getObject(r1, r3)
            com.google.crypto.tink.shaded.protobuf.Schema r6 = r0.getMessageFieldSchema(r9)
            r2.writeMessage(r12, r5, r6)
            goto L60a
        L579:
            r19 = r6
            r20 = r7
            r5 = r19 & r15
            if (r5 == 0) goto L60a
            java.lang.Object r5 = r8.getObject(r1, r3)
            r0.writeString(r12, r5, r2)
            goto L60a
        L58a:
            r19 = r6
            r20 = r7
            r5 = r19 & r15
            if (r5 == 0) goto L60a
            boolean r5 = booleanAt(r1, r3)
            r2.writeBool(r12, r5)
            goto L60a
        L59b:
            r19 = r6
            r20 = r7
            r5 = r19 & r15
            if (r5 == 0) goto L60a
            int r5 = r8.getInt(r1, r3)
            r2.writeFixed32(r12, r5)
            goto L60a
        L5ab:
            r19 = r6
            r20 = r7
            r5 = r19 & r15
            if (r5 == 0) goto L60a
            long r5 = r8.getLong(r1, r3)
            r2.writeFixed64(r12, r5)
            goto L60a
        L5bb:
            r19 = r6
            r20 = r7
            r5 = r19 & r15
            if (r5 == 0) goto L60a
            int r5 = r8.getInt(r1, r3)
            r2.writeInt32(r12, r5)
            goto L60a
        L5cb:
            r19 = r6
            r20 = r7
            r5 = r19 & r15
            if (r5 == 0) goto L60a
            long r5 = r8.getLong(r1, r3)
            r2.writeUInt64(r12, r5)
            goto L60a
        L5db:
            r19 = r6
            r20 = r7
            r5 = r19 & r15
            if (r5 == 0) goto L60a
            long r5 = r8.getLong(r1, r3)
            r2.writeInt64(r12, r5)
            goto L60a
        L5eb:
            r19 = r6
            r20 = r7
            r5 = r19 & r15
            if (r5 == 0) goto L60a
            float r5 = floatAt(r1, r3)
            r2.writeFloat(r12, r5)
            goto L60a
        L5fb:
            r19 = r6
            r20 = r7
            r5 = r19 & r15
            if (r5 == 0) goto L60a
            double r5 = doubleAt(r1, r3)
            r2.writeDouble(r12, r5)
        L60a:
            int r9 = r9 + 3
            r4 = r10
            r3 = r16
            r5 = r17
            r6 = r19
            r7 = r20
            goto L2d
        L617:
            r16 = r3
            r17 = r4
            r20 = r7
        L61d:
            if (r4 == 0) goto L634
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r3 = r0.extensionSchema
            r3.serializeExtension(r2, r4)
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L631
            java.lang.Object r3 = r16.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            goto L632
        L631:
            r3 = 0
        L632:
            r4 = r3
            goto L61d
        L634:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r3 = r0.unknownFieldSchema
            r0.writeUnknownInMessageTo(r3, r1, r2)
            return
    }

    private void writeFieldsInAscendingOrderProto3(T r12, com.google.crypto.tink.shaded.protobuf.Writer r13) throws java.io.IOException {
            r11 = this;
            r0 = 0
            r1 = 0
            boolean r2 = r11.hasExtensions
            if (r2 == 0) goto L1d
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r2 = r11.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r2 = r2.getExtensions(r12)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L1d
            java.util.Iterator r0 = r2.iterator()
            java.lang.Object r3 = r0.next()
            r1 = r3
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
        L1d:
            int[] r2 = r11.buffer
            int r2 = r2.length
            r3 = 0
        L21:
            r4 = 0
            if (r3 >= r2) goto L5ab
            int r5 = r11.typeAndOffsetAt(r3)
            int r6 = r11.numberAt(r3)
        L2c:
            if (r1 == 0) goto L4b
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r7 = r11.extensionSchema
            int r7 = r7.extensionNumber(r1)
            if (r7 > r6) goto L4b
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r7 = r11.extensionSchema
            r7.serializeExtension(r13, r1)
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L48
            java.lang.Object r7 = r0.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            goto L49
        L48:
            r7 = r4
        L49:
            r1 = r7
            goto L2c
        L4b:
            int r4 = type(r5)
            r7 = 1
            r8 = 0
            switch(r4) {
                case 0: goto L596;
                case 1: goto L584;
                case 2: goto L572;
                case 3: goto L560;
                case 4: goto L54e;
                case 5: goto L53c;
                case 6: goto L52a;
                case 7: goto L517;
                case 8: goto L504;
                case 9: goto L4ed;
                case 10: goto L4d7;
                case 11: goto L4c4;
                case 12: goto L4b1;
                case 13: goto L49e;
                case 14: goto L48b;
                case 15: goto L478;
                case 16: goto L465;
                case 17: goto L44d;
                case 18: goto L439;
                case 19: goto L425;
                case 20: goto L411;
                case 21: goto L3fd;
                case 22: goto L3e9;
                case 23: goto L3d5;
                case 24: goto L3c1;
                case 25: goto L3ad;
                case 26: goto L399;
                case 27: goto L381;
                case 28: goto L36d;
                case 29: goto L359;
                case 30: goto L345;
                case 31: goto L331;
                case 32: goto L31d;
                case 33: goto L309;
                case 34: goto L2f5;
                case 35: goto L2e1;
                case 36: goto L2cd;
                case 37: goto L2b9;
                case 38: goto L2a5;
                case 39: goto L291;
                case 40: goto L27d;
                case 41: goto L269;
                case 42: goto L255;
                case 43: goto L241;
                case 44: goto L22d;
                case 45: goto L219;
                case 46: goto L205;
                case 47: goto L1f1;
                case 48: goto L1dd;
                case 49: goto L1c5;
                case 50: goto L1b8;
                case 51: goto L1a5;
                case 52: goto L192;
                case 53: goto L17f;
                case 54: goto L16c;
                case 55: goto L159;
                case 56: goto L146;
                case 57: goto L133;
                case 58: goto L120;
                case 59: goto L10d;
                case 60: goto Lf6;
                case 61: goto Le0;
                case 62: goto Lcd;
                case 63: goto Lba;
                case 64: goto La7;
                case 65: goto L94;
                case 66: goto L81;
                case 67: goto L6e;
                case 68: goto L56;
                default: goto L54;
            }
        L54:
            goto L5a7
        L56:
            boolean r4 = r11.isOneofPresent(r12, r6, r3)
            if (r4 == 0) goto L5a7
        L5d:
            long r7 = offset(r5)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r7)
            com.google.crypto.tink.shaded.protobuf.Schema r7 = r11.getMessageFieldSchema(r3)
            r13.writeGroup(r6, r4, r7)
            goto L5a7
        L6e:
            boolean r4 = r11.isOneofPresent(r12, r6, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            long r7 = oneofLongAt(r12, r7)
            r13.writeSInt64(r6, r7)
            goto L5a7
        L81:
            boolean r4 = r11.isOneofPresent(r12, r6, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            int r4 = oneofIntAt(r12, r7)
            r13.writeSInt32(r6, r4)
            goto L5a7
        L94:
            boolean r4 = r11.isOneofPresent(r12, r6, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            long r7 = oneofLongAt(r12, r7)
            r13.writeSFixed64(r6, r7)
            goto L5a7
        La7:
            boolean r4 = r11.isOneofPresent(r12, r6, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            int r4 = oneofIntAt(r12, r7)
            r13.writeSFixed32(r6, r4)
            goto L5a7
        Lba:
            boolean r4 = r11.isOneofPresent(r12, r6, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            int r4 = oneofIntAt(r12, r7)
            r13.writeEnum(r6, r4)
            goto L5a7
        Lcd:
            boolean r4 = r11.isOneofPresent(r12, r6, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            int r4 = oneofIntAt(r12, r7)
            r13.writeUInt32(r6, r4)
            goto L5a7
        Le0:
            boolean r4 = r11.isOneofPresent(r12, r6, r3)
            if (r4 == 0) goto L5a7
        Le7:
            long r7 = offset(r5)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r7)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
            r13.writeBytes(r6, r4)
            goto L5a7
        Lf6:
            boolean r4 = r11.isOneofPresent(r12, r6, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r7)
            com.google.crypto.tink.shaded.protobuf.Schema r7 = r11.getMessageFieldSchema(r3)
            r13.writeMessage(r6, r4, r7)
            goto L5a7
        L10d:
            boolean r4 = r11.isOneofPresent(r12, r6, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r7)
            r11.writeString(r6, r4, r13)
            goto L5a7
        L120:
            boolean r4 = r11.isOneofPresent(r12, r6, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            boolean r4 = oneofBooleanAt(r12, r7)
            r13.writeBool(r6, r4)
            goto L5a7
        L133:
            boolean r4 = r11.isOneofPresent(r12, r6, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            int r4 = oneofIntAt(r12, r7)
            r13.writeFixed32(r6, r4)
            goto L5a7
        L146:
            boolean r4 = r11.isOneofPresent(r12, r6, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            long r7 = oneofLongAt(r12, r7)
            r13.writeFixed64(r6, r7)
            goto L5a7
        L159:
            boolean r4 = r11.isOneofPresent(r12, r6, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            int r4 = oneofIntAt(r12, r7)
            r13.writeInt32(r6, r4)
            goto L5a7
        L16c:
            boolean r4 = r11.isOneofPresent(r12, r6, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            long r7 = oneofLongAt(r12, r7)
            r13.writeUInt64(r6, r7)
            goto L5a7
        L17f:
            boolean r4 = r11.isOneofPresent(r12, r6, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            long r7 = oneofLongAt(r12, r7)
            r13.writeInt64(r6, r7)
            goto L5a7
        L192:
            boolean r4 = r11.isOneofPresent(r12, r6, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            float r4 = oneofFloatAt(r12, r7)
            r13.writeFloat(r6, r4)
            goto L5a7
        L1a5:
            boolean r4 = r11.isOneofPresent(r12, r6, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            double r7 = oneofDoubleAt(r12, r7)
            r13.writeDouble(r6, r7)
            goto L5a7
        L1b8:
            long r7 = offset(r5)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r7)
            r11.writeMapHelper(r13, r6, r4, r3)
            goto L5a7
        L1c5:
            int r4 = r11.numberAt(r3)
            long r7 = offset(r5)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r7)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.Schema r8 = r11.getMessageFieldSchema(r3)
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeGroupList(r4, r7, r13, r8)
            goto L5a7
        L1dd:
            int r4 = r11.numberAt(r3)
            long r8 = offset(r5)
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt64List(r4, r8, r13, r7)
            goto L5a7
        L1f1:
            int r4 = r11.numberAt(r3)
            long r8 = offset(r5)
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt32List(r4, r8, r13, r7)
            goto L5a7
        L205:
            int r4 = r11.numberAt(r3)
            long r8 = offset(r5)
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed64List(r4, r8, r13, r7)
            goto L5a7
        L219:
            int r4 = r11.numberAt(r3)
            long r8 = offset(r5)
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed32List(r4, r8, r13, r7)
            goto L5a7
        L22d:
            int r4 = r11.numberAt(r3)
            long r8 = offset(r5)
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeEnumList(r4, r8, r13, r7)
            goto L5a7
        L241:
            int r4 = r11.numberAt(r3)
            long r8 = offset(r5)
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt32List(r4, r8, r13, r7)
            goto L5a7
        L255:
            int r4 = r11.numberAt(r3)
            long r8 = offset(r5)
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeBoolList(r4, r8, r13, r7)
            goto L5a7
        L269:
            int r4 = r11.numberAt(r3)
            long r8 = offset(r5)
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed32List(r4, r8, r13, r7)
            goto L5a7
        L27d:
            int r4 = r11.numberAt(r3)
            long r8 = offset(r5)
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed64List(r4, r8, r13, r7)
            goto L5a7
        L291:
            int r4 = r11.numberAt(r3)
            long r8 = offset(r5)
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt32List(r4, r8, r13, r7)
            goto L5a7
        L2a5:
            int r4 = r11.numberAt(r3)
            long r8 = offset(r5)
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt64List(r4, r8, r13, r7)
            goto L5a7
        L2b9:
            int r4 = r11.numberAt(r3)
            long r8 = offset(r5)
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt64List(r4, r8, r13, r7)
            goto L5a7
        L2cd:
            int r4 = r11.numberAt(r3)
            long r8 = offset(r5)
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFloatList(r4, r8, r13, r7)
            goto L5a7
        L2e1:
            int r4 = r11.numberAt(r3)
            long r8 = offset(r5)
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeDoubleList(r4, r8, r13, r7)
            goto L5a7
        L2f5:
            int r4 = r11.numberAt(r3)
            long r9 = offset(r5)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt64List(r4, r7, r13, r8)
            goto L5a7
        L309:
            int r4 = r11.numberAt(r3)
            long r9 = offset(r5)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt32List(r4, r7, r13, r8)
            goto L5a7
        L31d:
            int r4 = r11.numberAt(r3)
            long r9 = offset(r5)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed64List(r4, r7, r13, r8)
            goto L5a7
        L331:
            int r4 = r11.numberAt(r3)
            long r9 = offset(r5)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed32List(r4, r7, r13, r8)
            goto L5a7
        L345:
            int r4 = r11.numberAt(r3)
            long r9 = offset(r5)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeEnumList(r4, r7, r13, r8)
            goto L5a7
        L359:
            int r4 = r11.numberAt(r3)
            long r9 = offset(r5)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt32List(r4, r7, r13, r8)
            goto L5a7
        L36d:
            int r4 = r11.numberAt(r3)
            long r7 = offset(r5)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r7)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeBytesList(r4, r7, r13)
            goto L5a7
        L381:
            int r4 = r11.numberAt(r3)
            long r7 = offset(r5)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r7)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.Schema r8 = r11.getMessageFieldSchema(r3)
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeMessageList(r4, r7, r13, r8)
            goto L5a7
        L399:
            int r4 = r11.numberAt(r3)
            long r7 = offset(r5)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r7)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeStringList(r4, r7, r13)
            goto L5a7
        L3ad:
            int r4 = r11.numberAt(r3)
            long r9 = offset(r5)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeBoolList(r4, r7, r13, r8)
            goto L5a7
        L3c1:
            int r4 = r11.numberAt(r3)
            long r9 = offset(r5)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed32List(r4, r7, r13, r8)
            goto L5a7
        L3d5:
            int r4 = r11.numberAt(r3)
            long r9 = offset(r5)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed64List(r4, r7, r13, r8)
            goto L5a7
        L3e9:
            int r4 = r11.numberAt(r3)
            long r9 = offset(r5)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt32List(r4, r7, r13, r8)
            goto L5a7
        L3fd:
            int r4 = r11.numberAt(r3)
            long r9 = offset(r5)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt64List(r4, r7, r13, r8)
            goto L5a7
        L411:
            int r4 = r11.numberAt(r3)
            long r9 = offset(r5)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt64List(r4, r7, r13, r8)
            goto L5a7
        L425:
            int r4 = r11.numberAt(r3)
            long r9 = offset(r5)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFloatList(r4, r7, r13, r8)
            goto L5a7
        L439:
            int r4 = r11.numberAt(r3)
            long r9 = offset(r5)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeDoubleList(r4, r7, r13, r8)
            goto L5a7
        L44d:
            boolean r4 = r11.isFieldPresent(r12, r3)
            if (r4 == 0) goto L5a7
        L454:
            long r7 = offset(r5)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r7)
            com.google.crypto.tink.shaded.protobuf.Schema r7 = r11.getMessageFieldSchema(r3)
            r13.writeGroup(r6, r4, r7)
            goto L5a7
        L465:
            boolean r4 = r11.isFieldPresent(r12, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            long r7 = longAt(r12, r7)
            r13.writeSInt64(r6, r7)
            goto L5a7
        L478:
            boolean r4 = r11.isFieldPresent(r12, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            int r4 = intAt(r12, r7)
            r13.writeSInt32(r6, r4)
            goto L5a7
        L48b:
            boolean r4 = r11.isFieldPresent(r12, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            long r7 = longAt(r12, r7)
            r13.writeSFixed64(r6, r7)
            goto L5a7
        L49e:
            boolean r4 = r11.isFieldPresent(r12, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            int r4 = intAt(r12, r7)
            r13.writeSFixed32(r6, r4)
            goto L5a7
        L4b1:
            boolean r4 = r11.isFieldPresent(r12, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            int r4 = intAt(r12, r7)
            r13.writeEnum(r6, r4)
            goto L5a7
        L4c4:
            boolean r4 = r11.isFieldPresent(r12, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            int r4 = intAt(r12, r7)
            r13.writeUInt32(r6, r4)
            goto L5a7
        L4d7:
            boolean r4 = r11.isFieldPresent(r12, r3)
            if (r4 == 0) goto L5a7
        L4de:
            long r7 = offset(r5)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r7)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
            r13.writeBytes(r6, r4)
            goto L5a7
        L4ed:
            boolean r4 = r11.isFieldPresent(r12, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r7)
            com.google.crypto.tink.shaded.protobuf.Schema r7 = r11.getMessageFieldSchema(r3)
            r13.writeMessage(r6, r4, r7)
            goto L5a7
        L504:
            boolean r4 = r11.isFieldPresent(r12, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r12, r7)
            r11.writeString(r6, r4, r13)
            goto L5a7
        L517:
            boolean r4 = r11.isFieldPresent(r12, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            boolean r4 = booleanAt(r12, r7)
            r13.writeBool(r6, r4)
            goto L5a7
        L52a:
            boolean r4 = r11.isFieldPresent(r12, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            int r4 = intAt(r12, r7)
            r13.writeFixed32(r6, r4)
            goto L5a7
        L53c:
            boolean r4 = r11.isFieldPresent(r12, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            long r7 = longAt(r12, r7)
            r13.writeFixed64(r6, r7)
            goto L5a7
        L54e:
            boolean r4 = r11.isFieldPresent(r12, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            int r4 = intAt(r12, r7)
            r13.writeInt32(r6, r4)
            goto L5a7
        L560:
            boolean r4 = r11.isFieldPresent(r12, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            long r7 = longAt(r12, r7)
            r13.writeUInt64(r6, r7)
            goto L5a7
        L572:
            boolean r4 = r11.isFieldPresent(r12, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            long r7 = longAt(r12, r7)
            r13.writeInt64(r6, r7)
            goto L5a7
        L584:
            boolean r4 = r11.isFieldPresent(r12, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            float r4 = floatAt(r12, r7)
            r13.writeFloat(r6, r4)
            goto L5a7
        L596:
            boolean r4 = r11.isFieldPresent(r12, r3)
            if (r4 == 0) goto L5a7
            long r7 = offset(r5)
            double r7 = doubleAt(r12, r7)
            r13.writeDouble(r6, r7)
        L5a7:
            int r3 = r3 + 3
            goto L21
        L5ab:
            if (r1 == 0) goto L5c2
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r3 = r11.extensionSchema
            r3.serializeExtension(r13, r1)
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L5bf
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            goto L5c0
        L5bf:
            r3 = r4
        L5c0:
            r1 = r3
            goto L5ab
        L5c2:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r3 = r11.unknownFieldSchema
            r11.writeUnknownInMessageTo(r3, r12, r13)
            return
    }

    private void writeFieldsInDescendingOrder(T r11, com.google.crypto.tink.shaded.protobuf.Writer r12) throws java.io.IOException {
            r10 = this;
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = r10.unknownFieldSchema
            r10.writeUnknownInMessageTo(r0, r11, r12)
            r0 = 0
            r1 = 0
            boolean r2 = r10.hasExtensions
            if (r2 == 0) goto L22
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r2 = r10.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r2 = r2.getExtensions(r11)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L22
            java.util.Iterator r0 = r2.descendingIterator()
            java.lang.Object r3 = r0.next()
            r1 = r3
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
        L22:
            int[] r2 = r10.buffer
            int r2 = r2.length
            int r2 = r2 + (-3)
        L27:
            r3 = 0
            if (r2 < 0) goto L5b1
            int r4 = r10.typeAndOffsetAt(r2)
            int r5 = r10.numberAt(r2)
        L32:
            if (r1 == 0) goto L51
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r6 = r10.extensionSchema
            int r6 = r6.extensionNumber(r1)
            if (r6 <= r5) goto L51
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r6 = r10.extensionSchema
            r6.serializeExtension(r12, r1)
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L4e
            java.lang.Object r6 = r0.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L4f
        L4e:
            r6 = r3
        L4f:
            r1 = r6
            goto L32
        L51:
            int r3 = type(r4)
            r6 = 1
            r7 = 0
            switch(r3) {
                case 0: goto L59c;
                case 1: goto L58a;
                case 2: goto L578;
                case 3: goto L566;
                case 4: goto L554;
                case 5: goto L542;
                case 6: goto L530;
                case 7: goto L51d;
                case 8: goto L50a;
                case 9: goto L4f3;
                case 10: goto L4dd;
                case 11: goto L4ca;
                case 12: goto L4b7;
                case 13: goto L4a4;
                case 14: goto L491;
                case 15: goto L47e;
                case 16: goto L46b;
                case 17: goto L453;
                case 18: goto L43f;
                case 19: goto L42b;
                case 20: goto L417;
                case 21: goto L403;
                case 22: goto L3ef;
                case 23: goto L3db;
                case 24: goto L3c7;
                case 25: goto L3b3;
                case 26: goto L39f;
                case 27: goto L387;
                case 28: goto L373;
                case 29: goto L35f;
                case 30: goto L34b;
                case 31: goto L337;
                case 32: goto L323;
                case 33: goto L30f;
                case 34: goto L2fb;
                case 35: goto L2e7;
                case 36: goto L2d3;
                case 37: goto L2bf;
                case 38: goto L2ab;
                case 39: goto L297;
                case 40: goto L283;
                case 41: goto L26f;
                case 42: goto L25b;
                case 43: goto L247;
                case 44: goto L233;
                case 45: goto L21f;
                case 46: goto L20b;
                case 47: goto L1f7;
                case 48: goto L1e3;
                case 49: goto L1cb;
                case 50: goto L1be;
                case 51: goto L1ab;
                case 52: goto L198;
                case 53: goto L185;
                case 54: goto L172;
                case 55: goto L15f;
                case 56: goto L14c;
                case 57: goto L139;
                case 58: goto L126;
                case 59: goto L113;
                case 60: goto Lfc;
                case 61: goto Le6;
                case 62: goto Ld3;
                case 63: goto Lc0;
                case 64: goto Lad;
                case 65: goto L9a;
                case 66: goto L87;
                case 67: goto L74;
                case 68: goto L5c;
                default: goto L5a;
            }
        L5a:
            goto L5ad
        L5c:
            boolean r3 = r10.isOneofPresent(r11, r5, r2)
            if (r3 == 0) goto L5ad
        L63:
            long r6 = offset(r4)
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            com.google.crypto.tink.shaded.protobuf.Schema r6 = r10.getMessageFieldSchema(r2)
            r12.writeGroup(r5, r3, r6)
            goto L5ad
        L74:
            boolean r3 = r10.isOneofPresent(r11, r5, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            long r6 = oneofLongAt(r11, r6)
            r12.writeSInt64(r5, r6)
            goto L5ad
        L87:
            boolean r3 = r10.isOneofPresent(r11, r5, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            int r3 = oneofIntAt(r11, r6)
            r12.writeSInt32(r5, r3)
            goto L5ad
        L9a:
            boolean r3 = r10.isOneofPresent(r11, r5, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            long r6 = oneofLongAt(r11, r6)
            r12.writeSFixed64(r5, r6)
            goto L5ad
        Lad:
            boolean r3 = r10.isOneofPresent(r11, r5, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            int r3 = oneofIntAt(r11, r6)
            r12.writeSFixed32(r5, r3)
            goto L5ad
        Lc0:
            boolean r3 = r10.isOneofPresent(r11, r5, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            int r3 = oneofIntAt(r11, r6)
            r12.writeEnum(r5, r3)
            goto L5ad
        Ld3:
            boolean r3 = r10.isOneofPresent(r11, r5, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            int r3 = oneofIntAt(r11, r6)
            r12.writeUInt32(r5, r3)
            goto L5ad
        Le6:
            boolean r3 = r10.isOneofPresent(r11, r5, r2)
            if (r3 == 0) goto L5ad
        Led:
            long r6 = offset(r4)
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            r12.writeBytes(r5, r3)
            goto L5ad
        Lfc:
            boolean r3 = r10.isOneofPresent(r11, r5, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            com.google.crypto.tink.shaded.protobuf.Schema r6 = r10.getMessageFieldSchema(r2)
            r12.writeMessage(r5, r3, r6)
            goto L5ad
        L113:
            boolean r3 = r10.isOneofPresent(r11, r5, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            r10.writeString(r5, r3, r12)
            goto L5ad
        L126:
            boolean r3 = r10.isOneofPresent(r11, r5, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            boolean r3 = oneofBooleanAt(r11, r6)
            r12.writeBool(r5, r3)
            goto L5ad
        L139:
            boolean r3 = r10.isOneofPresent(r11, r5, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            int r3 = oneofIntAt(r11, r6)
            r12.writeFixed32(r5, r3)
            goto L5ad
        L14c:
            boolean r3 = r10.isOneofPresent(r11, r5, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            long r6 = oneofLongAt(r11, r6)
            r12.writeFixed64(r5, r6)
            goto L5ad
        L15f:
            boolean r3 = r10.isOneofPresent(r11, r5, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            int r3 = oneofIntAt(r11, r6)
            r12.writeInt32(r5, r3)
            goto L5ad
        L172:
            boolean r3 = r10.isOneofPresent(r11, r5, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            long r6 = oneofLongAt(r11, r6)
            r12.writeUInt64(r5, r6)
            goto L5ad
        L185:
            boolean r3 = r10.isOneofPresent(r11, r5, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            long r6 = oneofLongAt(r11, r6)
            r12.writeInt64(r5, r6)
            goto L5ad
        L198:
            boolean r3 = r10.isOneofPresent(r11, r5, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            float r3 = oneofFloatAt(r11, r6)
            r12.writeFloat(r5, r3)
            goto L5ad
        L1ab:
            boolean r3 = r10.isOneofPresent(r11, r5, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            double r6 = oneofDoubleAt(r11, r6)
            r12.writeDouble(r5, r6)
            goto L5ad
        L1be:
            long r6 = offset(r4)
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            r10.writeMapHelper(r12, r5, r3, r2)
            goto L5ad
        L1cb:
            int r3 = r10.numberAt(r2)
            long r6 = offset(r4)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.Schema r7 = r10.getMessageFieldSchema(r2)
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeGroupList(r3, r6, r12, r7)
            goto L5ad
        L1e3:
            int r3 = r10.numberAt(r2)
            long r7 = offset(r4)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r7)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt64List(r3, r7, r12, r6)
            goto L5ad
        L1f7:
            int r3 = r10.numberAt(r2)
            long r7 = offset(r4)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r7)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt32List(r3, r7, r12, r6)
            goto L5ad
        L20b:
            int r3 = r10.numberAt(r2)
            long r7 = offset(r4)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r7)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed64List(r3, r7, r12, r6)
            goto L5ad
        L21f:
            int r3 = r10.numberAt(r2)
            long r7 = offset(r4)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r7)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed32List(r3, r7, r12, r6)
            goto L5ad
        L233:
            int r3 = r10.numberAt(r2)
            long r7 = offset(r4)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r7)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeEnumList(r3, r7, r12, r6)
            goto L5ad
        L247:
            int r3 = r10.numberAt(r2)
            long r7 = offset(r4)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r7)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt32List(r3, r7, r12, r6)
            goto L5ad
        L25b:
            int r3 = r10.numberAt(r2)
            long r7 = offset(r4)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r7)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeBoolList(r3, r7, r12, r6)
            goto L5ad
        L26f:
            int r3 = r10.numberAt(r2)
            long r7 = offset(r4)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r7)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed32List(r3, r7, r12, r6)
            goto L5ad
        L283:
            int r3 = r10.numberAt(r2)
            long r7 = offset(r4)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r7)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed64List(r3, r7, r12, r6)
            goto L5ad
        L297:
            int r3 = r10.numberAt(r2)
            long r7 = offset(r4)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r7)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt32List(r3, r7, r12, r6)
            goto L5ad
        L2ab:
            int r3 = r10.numberAt(r2)
            long r7 = offset(r4)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r7)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt64List(r3, r7, r12, r6)
            goto L5ad
        L2bf:
            int r3 = r10.numberAt(r2)
            long r7 = offset(r4)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r7)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt64List(r3, r7, r12, r6)
            goto L5ad
        L2d3:
            int r3 = r10.numberAt(r2)
            long r7 = offset(r4)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r7)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFloatList(r3, r7, r12, r6)
            goto L5ad
        L2e7:
            int r3 = r10.numberAt(r2)
            long r7 = offset(r4)
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r7)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeDoubleList(r3, r7, r12, r6)
            goto L5ad
        L2fb:
            int r3 = r10.numberAt(r2)
            long r8 = offset(r4)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt64List(r3, r6, r12, r7)
            goto L5ad
        L30f:
            int r3 = r10.numberAt(r2)
            long r8 = offset(r4)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSInt32List(r3, r6, r12, r7)
            goto L5ad
        L323:
            int r3 = r10.numberAt(r2)
            long r8 = offset(r4)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed64List(r3, r6, r12, r7)
            goto L5ad
        L337:
            int r3 = r10.numberAt(r2)
            long r8 = offset(r4)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeSFixed32List(r3, r6, r12, r7)
            goto L5ad
        L34b:
            int r3 = r10.numberAt(r2)
            long r8 = offset(r4)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeEnumList(r3, r6, r12, r7)
            goto L5ad
        L35f:
            int r3 = r10.numberAt(r2)
            long r8 = offset(r4)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt32List(r3, r6, r12, r7)
            goto L5ad
        L373:
            int r3 = r10.numberAt(r2)
            long r6 = offset(r4)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeBytesList(r3, r6, r12)
            goto L5ad
        L387:
            int r3 = r10.numberAt(r2)
            long r6 = offset(r4)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.Schema r7 = r10.getMessageFieldSchema(r2)
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeMessageList(r3, r6, r12, r7)
            goto L5ad
        L39f:
            int r3 = r10.numberAt(r2)
            long r6 = offset(r4)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeStringList(r3, r6, r12)
            goto L5ad
        L3b3:
            int r3 = r10.numberAt(r2)
            long r8 = offset(r4)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeBoolList(r3, r6, r12, r7)
            goto L5ad
        L3c7:
            int r3 = r10.numberAt(r2)
            long r8 = offset(r4)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed32List(r3, r6, r12, r7)
            goto L5ad
        L3db:
            int r3 = r10.numberAt(r2)
            long r8 = offset(r4)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFixed64List(r3, r6, r12, r7)
            goto L5ad
        L3ef:
            int r3 = r10.numberAt(r2)
            long r8 = offset(r4)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt32List(r3, r6, r12, r7)
            goto L5ad
        L403:
            int r3 = r10.numberAt(r2)
            long r8 = offset(r4)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeUInt64List(r3, r6, r12, r7)
            goto L5ad
        L417:
            int r3 = r10.numberAt(r2)
            long r8 = offset(r4)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeInt64List(r3, r6, r12, r7)
            goto L5ad
        L42b:
            int r3 = r10.numberAt(r2)
            long r8 = offset(r4)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeFloatList(r3, r6, r12, r7)
            goto L5ad
        L43f:
            int r3 = r10.numberAt(r2)
            long r8 = offset(r4)
            java.lang.Object r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.writeDoubleList(r3, r6, r12, r7)
            goto L5ad
        L453:
            boolean r3 = r10.isFieldPresent(r11, r2)
            if (r3 == 0) goto L5ad
        L45a:
            long r6 = offset(r4)
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            com.google.crypto.tink.shaded.protobuf.Schema r6 = r10.getMessageFieldSchema(r2)
            r12.writeGroup(r5, r3, r6)
            goto L5ad
        L46b:
            boolean r3 = r10.isFieldPresent(r11, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            long r6 = longAt(r11, r6)
            r12.writeSInt64(r5, r6)
            goto L5ad
        L47e:
            boolean r3 = r10.isFieldPresent(r11, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            int r3 = intAt(r11, r6)
            r12.writeSInt32(r5, r3)
            goto L5ad
        L491:
            boolean r3 = r10.isFieldPresent(r11, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            long r6 = longAt(r11, r6)
            r12.writeSFixed64(r5, r6)
            goto L5ad
        L4a4:
            boolean r3 = r10.isFieldPresent(r11, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            int r3 = intAt(r11, r6)
            r12.writeSFixed32(r5, r3)
            goto L5ad
        L4b7:
            boolean r3 = r10.isFieldPresent(r11, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            int r3 = intAt(r11, r6)
            r12.writeEnum(r5, r3)
            goto L5ad
        L4ca:
            boolean r3 = r10.isFieldPresent(r11, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            int r3 = intAt(r11, r6)
            r12.writeUInt32(r5, r3)
            goto L5ad
        L4dd:
            boolean r3 = r10.isFieldPresent(r11, r2)
            if (r3 == 0) goto L5ad
        L4e4:
            long r6 = offset(r4)
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            r12.writeBytes(r5, r3)
            goto L5ad
        L4f3:
            boolean r3 = r10.isFieldPresent(r11, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            com.google.crypto.tink.shaded.protobuf.Schema r6 = r10.getMessageFieldSchema(r2)
            r12.writeMessage(r5, r3, r6)
            goto L5ad
        L50a:
            boolean r3 = r10.isFieldPresent(r11, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r6)
            r10.writeString(r5, r3, r12)
            goto L5ad
        L51d:
            boolean r3 = r10.isFieldPresent(r11, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            boolean r3 = booleanAt(r11, r6)
            r12.writeBool(r5, r3)
            goto L5ad
        L530:
            boolean r3 = r10.isFieldPresent(r11, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            int r3 = intAt(r11, r6)
            r12.writeFixed32(r5, r3)
            goto L5ad
        L542:
            boolean r3 = r10.isFieldPresent(r11, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            long r6 = longAt(r11, r6)
            r12.writeFixed64(r5, r6)
            goto L5ad
        L554:
            boolean r3 = r10.isFieldPresent(r11, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            int r3 = intAt(r11, r6)
            r12.writeInt32(r5, r3)
            goto L5ad
        L566:
            boolean r3 = r10.isFieldPresent(r11, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            long r6 = longAt(r11, r6)
            r12.writeUInt64(r5, r6)
            goto L5ad
        L578:
            boolean r3 = r10.isFieldPresent(r11, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            long r6 = longAt(r11, r6)
            r12.writeInt64(r5, r6)
            goto L5ad
        L58a:
            boolean r3 = r10.isFieldPresent(r11, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            float r3 = floatAt(r11, r6)
            r12.writeFloat(r5, r3)
            goto L5ad
        L59c:
            boolean r3 = r10.isFieldPresent(r11, r2)
            if (r3 == 0) goto L5ad
            long r6 = offset(r4)
            double r6 = doubleAt(r11, r6)
            r12.writeDouble(r5, r6)
        L5ad:
            int r2 = r2 + (-3)
            goto L27
        L5b1:
            if (r1 == 0) goto L5c8
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r2 = r10.extensionSchema
            r2.serializeExtension(r12, r1)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5c5
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L5c6
        L5c5:
            r2 = r3
        L5c6:
            r1 = r2
            goto L5b1
        L5c8:
            return
    }

    private <K, V> void writeMapHelper(com.google.crypto.tink.shaded.protobuf.Writer r3, int r4, java.lang.Object r5, int r6) throws java.io.IOException {
            r2 = this;
            if (r5 == 0) goto L15
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r0 = r2.mapFieldSchema
            java.lang.Object r1 = r2.getMapFieldDefaultEntry(r6)
            com.google.crypto.tink.shaded.protobuf.MapEntryLite$Metadata r0 = r0.forMapMetadata(r1)
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r1 = r2.mapFieldSchema
            java.util.Map r1 = r1.forMapData(r5)
            r3.writeMap(r4, r0, r1)
        L15:
            return
    }

    private void writeString(int r2, java.lang.Object r3, com.google.crypto.tink.shaded.protobuf.Writer r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto Lb
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0
            r4.writeString(r2, r0)
            goto L11
        Lb:
            r0 = r3
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = (com.google.crypto.tink.shaded.protobuf.ByteString) r0
            r4.writeBytes(r2, r0)
        L11:
            return
    }

    private <UT, UB> void writeUnknownInMessageTo(com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<UT, UB> r2, T r3, com.google.crypto.tink.shaded.protobuf.Writer r4) throws java.io.IOException {
            r1 = this;
            java.lang.Object r0 = r2.getFromMessage(r3)
            r2.writeTo(r0, r4)
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public boolean equals(T r7, T r8) {
            r6 = this;
            int[] r0 = r6.buffer
            int r0 = r0.length
            r1 = 0
        L4:
            r2 = 0
            if (r1 >= r0) goto L11
            boolean r3 = r6.equals(r7, r8, r1)
            if (r3 != 0) goto Le
            return r2
        Le:
            int r1 = r1 + 3
            goto L4
        L11:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r1 = r6.unknownFieldSchema
            java.lang.Object r1 = r1.getFromMessage(r7)
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r3 = r6.unknownFieldSchema
            java.lang.Object r3 = r3.getFromMessage(r8)
            boolean r4 = r1.equals(r3)
            if (r4 != 0) goto L24
            return r2
        L24:
            boolean r2 = r6.hasExtensions
            if (r2 == 0) goto L39
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r2 = r6.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r2 = r2.getExtensions(r7)
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r4 = r6.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r4 = r4.getExtensions(r8)
            boolean r5 = r2.equals(r4)
            return r5
        L39:
            r2 = 1
            return r2
    }

    int getSchemaSize() {
            r1 = this;
            int[] r0 = r1.buffer
            int r0 = r0.length
            int r0 = r0 * 3
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public int getSerializedSize(T r2) {
            r1 = this;
            boolean r0 = r1.proto3
            if (r0 == 0) goto L9
            int r0 = r1.getSerializedSizeProto3(r2)
            goto Ld
        L9:
            int r0 = r1.getSerializedSizeProto2(r2)
        Ld:
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public int hashCode(T r11) {
            r10 = this;
            r0 = 0
            int[] r1 = r10.buffer
            int r1 = r1.length
            r2 = 0
        L5:
            if (r2 >= r1) goto L27b
            int r3 = r10.typeAndOffsetAt(r2)
            int r4 = r10.numberAt(r2)
            long r5 = offset(r3)
            int r7 = type(r3)
            switch(r7) {
                case 0: goto L267;
                case 1: goto L25a;
                case 2: goto L24d;
                case 3: goto L240;
                case 4: goto L237;
                case 5: goto L22a;
                case 6: goto L221;
                case 7: goto L214;
                case 8: goto L204;
                case 9: goto L1f2;
                case 10: goto L1e4;
                case 11: goto L1da;
                case 12: goto L1d0;
                case 13: goto L1c6;
                case 14: goto L1b8;
                case 15: goto L1ae;
                case 16: goto L1a0;
                case 17: goto L18e;
                case 18: goto L180;
                case 19: goto L180;
                case 20: goto L180;
                case 21: goto L180;
                case 22: goto L180;
                case 23: goto L180;
                case 24: goto L180;
                case 25: goto L180;
                case 26: goto L180;
                case 27: goto L180;
                case 28: goto L180;
                case 29: goto L180;
                case 30: goto L180;
                case 31: goto L180;
                case 32: goto L180;
                case 33: goto L180;
                case 34: goto L180;
                case 35: goto L180;
                case 36: goto L180;
                case 37: goto L180;
                case 38: goto L180;
                case 39: goto L180;
                case 40: goto L180;
                case 41: goto L180;
                case 42: goto L180;
                case 43: goto L180;
                case 44: goto L180;
                case 45: goto L180;
                case 46: goto L180;
                case 47: goto L180;
                case 48: goto L180;
                case 49: goto L180;
                case 50: goto L172;
                case 51: goto L15a;
                case 52: goto L146;
                case 53: goto L132;
                case 54: goto L11e;
                case 55: goto L10e;
                case 56: goto Lfa;
                case 57: goto Lea;
                case 58: goto Ld6;
                case 59: goto Lc0;
                case 60: goto Lac;
                case 61: goto L98;
                case 62: goto L88;
                case 63: goto L78;
                case 64: goto L68;
                case 65: goto L54;
                case 66: goto L44;
                case 67: goto L30;
                case 68: goto L1c;
                default: goto L1a;
            }
        L1a:
            goto L277
        L1c:
            boolean r7 = r10.isOneofPresent(r11, r4, r2)
            if (r7 == 0) goto L277
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r5)
            int r8 = r0 * 53
            int r9 = r7.hashCode()
            int r8 = r8 + r9
            r0 = r8
            goto L277
        L30:
            boolean r7 = r10.isOneofPresent(r11, r4, r2)
            if (r7 == 0) goto L277
            int r7 = r0 * 53
            long r8 = oneofLongAt(r11, r5)
            int r8 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r8)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L44:
            boolean r7 = r10.isOneofPresent(r11, r4, r2)
            if (r7 == 0) goto L277
            int r7 = r0 * 53
            int r8 = oneofIntAt(r11, r5)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L54:
            boolean r7 = r10.isOneofPresent(r11, r4, r2)
            if (r7 == 0) goto L277
            int r7 = r0 * 53
            long r8 = oneofLongAt(r11, r5)
            int r8 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r8)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L68:
            boolean r7 = r10.isOneofPresent(r11, r4, r2)
            if (r7 == 0) goto L277
            int r7 = r0 * 53
            int r8 = oneofIntAt(r11, r5)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L78:
            boolean r7 = r10.isOneofPresent(r11, r4, r2)
            if (r7 == 0) goto L277
            int r7 = r0 * 53
            int r8 = oneofIntAt(r11, r5)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L88:
            boolean r7 = r10.isOneofPresent(r11, r4, r2)
            if (r7 == 0) goto L277
            int r7 = r0 * 53
            int r8 = oneofIntAt(r11, r5)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L98:
            boolean r7 = r10.isOneofPresent(r11, r4, r2)
            if (r7 == 0) goto L277
            int r7 = r0 * 53
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r5)
            int r8 = r8.hashCode()
            int r7 = r7 + r8
            r0 = r7
            goto L277
        Lac:
            boolean r7 = r10.isOneofPresent(r11, r4, r2)
            if (r7 == 0) goto L277
            java.lang.Object r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r5)
            int r8 = r0 * 53
            int r9 = r7.hashCode()
            int r8 = r8 + r9
            r0 = r8
            goto L277
        Lc0:
            boolean r7 = r10.isOneofPresent(r11, r4, r2)
            if (r7 == 0) goto L277
            int r7 = r0 * 53
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r5)
            java.lang.String r8 = (java.lang.String) r8
            int r8 = r8.hashCode()
            int r7 = r7 + r8
            r0 = r7
            goto L277
        Ld6:
            boolean r7 = r10.isOneofPresent(r11, r4, r2)
            if (r7 == 0) goto L277
            int r7 = r0 * 53
            boolean r8 = oneofBooleanAt(r11, r5)
            int r8 = com.google.crypto.tink.shaded.protobuf.Internal.hashBoolean(r8)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        Lea:
            boolean r7 = r10.isOneofPresent(r11, r4, r2)
            if (r7 == 0) goto L277
            int r7 = r0 * 53
            int r8 = oneofIntAt(r11, r5)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        Lfa:
            boolean r7 = r10.isOneofPresent(r11, r4, r2)
            if (r7 == 0) goto L277
            int r7 = r0 * 53
            long r8 = oneofLongAt(r11, r5)
            int r8 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r8)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L10e:
            boolean r7 = r10.isOneofPresent(r11, r4, r2)
            if (r7 == 0) goto L277
            int r7 = r0 * 53
            int r8 = oneofIntAt(r11, r5)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L11e:
            boolean r7 = r10.isOneofPresent(r11, r4, r2)
            if (r7 == 0) goto L277
            int r7 = r0 * 53
            long r8 = oneofLongAt(r11, r5)
            int r8 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r8)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L132:
            boolean r7 = r10.isOneofPresent(r11, r4, r2)
            if (r7 == 0) goto L277
            int r7 = r0 * 53
            long r8 = oneofLongAt(r11, r5)
            int r8 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r8)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L146:
            boolean r7 = r10.isOneofPresent(r11, r4, r2)
            if (r7 == 0) goto L277
            int r7 = r0 * 53
            float r8 = oneofFloatAt(r11, r5)
            int r8 = java.lang.Float.floatToIntBits(r8)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L15a:
            boolean r7 = r10.isOneofPresent(r11, r4, r2)
            if (r7 == 0) goto L277
            int r7 = r0 * 53
            double r8 = oneofDoubleAt(r11, r5)
            long r8 = java.lang.Double.doubleToLongBits(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r8)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L172:
            int r7 = r0 * 53
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r5)
            int r8 = r8.hashCode()
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L180:
            int r7 = r0 * 53
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r5)
            int r8 = r8.hashCode()
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L18e:
            r7 = 37
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r5)
            if (r8 == 0) goto L19a
            int r7 = r8.hashCode()
        L19a:
            int r9 = r0 * 53
            int r9 = r9 + r7
            r0 = r9
            goto L277
        L1a0:
            int r7 = r0 * 53
            long r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r11, r5)
            int r8 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r8)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L1ae:
            int r7 = r0 * 53
            int r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r11, r5)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L1b8:
            int r7 = r0 * 53
            long r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r11, r5)
            int r8 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r8)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L1c6:
            int r7 = r0 * 53
            int r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r11, r5)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L1d0:
            int r7 = r0 * 53
            int r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r11, r5)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L1da:
            int r7 = r0 * 53
            int r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r11, r5)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L1e4:
            int r7 = r0 * 53
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r5)
            int r8 = r8.hashCode()
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L1f2:
            r7 = 37
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r5)
            if (r8 == 0) goto L1fe
            int r7 = r8.hashCode()
        L1fe:
            int r9 = r0 * 53
            int r9 = r9 + r7
            r0 = r9
            goto L277
        L204:
            int r7 = r0 * 53
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getObject(r11, r5)
            java.lang.String r8 = (java.lang.String) r8
            int r8 = r8.hashCode()
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L214:
            int r7 = r0 * 53
            boolean r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getBoolean(r11, r5)
            int r8 = com.google.crypto.tink.shaded.protobuf.Internal.hashBoolean(r8)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L221:
            int r7 = r0 * 53
            int r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r11, r5)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L22a:
            int r7 = r0 * 53
            long r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r11, r5)
            int r8 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r8)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L237:
            int r7 = r0 * 53
            int r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getInt(r11, r5)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L240:
            int r7 = r0 * 53
            long r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r11, r5)
            int r8 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r8)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L24d:
            int r7 = r0 * 53
            long r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r11, r5)
            int r8 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r8)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L25a:
            int r7 = r0 * 53
            float r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getFloat(r11, r5)
            int r8 = java.lang.Float.floatToIntBits(r8)
            int r7 = r7 + r8
            r0 = r7
            goto L277
        L267:
            int r7 = r0 * 53
            double r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getDouble(r11, r5)
            long r8 = java.lang.Double.doubleToLongBits(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.Internal.hashLong(r8)
            int r7 = r7 + r8
            r0 = r7
        L277:
            int r2 = r2 + 3
            goto L5
        L27b:
            int r2 = r0 * 53
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r3 = r10.unknownFieldSchema
            java.lang.Object r3 = r3.getFromMessage(r11)
            int r3 = r3.hashCode()
            int r2 = r2 + r3
            boolean r0 = r10.hasExtensions
            if (r0 == 0) goto L29a
            int r0 = r2 * 53
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r3 = r10.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r3 = r3.getExtensions(r11)
            int r3 = r3.hashCode()
            int r2 = r0 + r3
        L29a:
            return r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final boolean isInitialized(T r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
            r4 = 0
            r6 = r4
        La:
            int r4 = r0.checkInitializedCount
            r5 = 1
            r7 = 0
            if (r6 >= r4) goto L8f
            int[] r4 = r0.intArray
            r4 = r4[r6]
            int r8 = r0.numberAt(r4)
            int r9 = r0.typeAndOffsetAt(r4)
            int[] r10 = r0.buffer
            int r11 = r4 + 2
            r10 = r10[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r10 & r11
            int r13 = r10 >>> 20
            int r5 = r5 << r13
            if (r12 == r2) goto L40
            r2 = r12
            if (r2 == r11) goto L3b
            sun.misc.Unsafe r11 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            long r13 = (long) r12
            int r3 = r11.getInt(r1, r13)
            r15 = r3
            r3 = r2
            r2 = r4
            r4 = r15
            goto L44
        L3b:
            r15 = r3
            r3 = r2
            r2 = r4
            r4 = r15
            goto L44
        L40:
            r15 = r3
            r3 = r2
            r2 = r4
            r4 = r15
        L44:
            boolean r11 = isRequired(r9)
            if (r11 == 0) goto L51
            boolean r11 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r11 != 0) goto L51
            return r7
        L51:
            int r11 = type(r9)
            switch(r11) {
                case 9: goto L78;
                case 17: goto L78;
                case 27: goto L71;
                case 49: goto L71;
                case 50: goto L6a;
                case 60: goto L59;
                case 68: goto L59;
                default: goto L58;
            }
        L58:
            goto L89
        L59:
            boolean r11 = r0.isOneofPresent(r1, r8, r2)
            if (r11 == 0) goto L89
            com.google.crypto.tink.shaded.protobuf.Schema r11 = r0.getMessageFieldSchema(r2)
            boolean r11 = isInitialized(r1, r9, r11)
            if (r11 != 0) goto L89
            return r7
        L6a:
            boolean r11 = r0.isMapInitialized(r1, r9, r2)
            if (r11 != 0) goto L89
            return r7
        L71:
            boolean r11 = r0.isListInitialized(r1, r9, r2)
            if (r11 != 0) goto L89
            return r7
        L78:
            boolean r11 = r0.isFieldPresent(r1, r2, r3, r4, r5)
            if (r11 == 0) goto L89
            com.google.crypto.tink.shaded.protobuf.Schema r11 = r0.getMessageFieldSchema(r2)
            boolean r11 = isInitialized(r1, r9, r11)
            if (r11 != 0) goto L89
            return r7
        L89:
            int r6 = r6 + 1
            r2 = r3
            r3 = r4
            goto La
        L8f:
            boolean r4 = r0.hasExtensions
            if (r4 == 0) goto La0
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r4 = r0.extensionSchema
            com.google.crypto.tink.shaded.protobuf.FieldSet r4 = r4.getExtensions(r1)
            boolean r4 = r4.isInitialized()
            if (r4 != 0) goto La0
            return r7
        La0:
            return r5
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void makeImmutable(T r9) {
            r8 = this;
            boolean r0 = isMutable(r9)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r9 instanceof com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
            if (r0 == 0) goto L17
            r0 = r9
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            r0.clearMemoizedSerializedSize()
            r0.clearMemoizedHashCode()
            r0.markImmutable()
        L17:
            int[] r0 = r8.buffer
            int r0 = r0.length
            r1 = 0
        L1b:
            if (r1 >= r0) goto L5d
            int r2 = r8.typeAndOffsetAt(r1)
            long r3 = offset(r2)
            int r5 = type(r2)
            switch(r5) {
                case 9: goto L47;
                case 10: goto L2c;
                case 11: goto L2c;
                case 12: goto L2c;
                case 13: goto L2c;
                case 14: goto L2c;
                case 15: goto L2c;
                case 16: goto L2c;
                case 17: goto L47;
                case 18: goto L41;
                case 19: goto L41;
                case 20: goto L41;
                case 21: goto L41;
                case 22: goto L41;
                case 23: goto L41;
                case 24: goto L41;
                case 25: goto L41;
                case 26: goto L41;
                case 27: goto L41;
                case 28: goto L41;
                case 29: goto L41;
                case 30: goto L41;
                case 31: goto L41;
                case 32: goto L41;
                case 33: goto L41;
                case 34: goto L41;
                case 35: goto L41;
                case 36: goto L41;
                case 37: goto L41;
                case 38: goto L41;
                case 39: goto L41;
                case 40: goto L41;
                case 41: goto L41;
                case 42: goto L41;
                case 43: goto L41;
                case 44: goto L41;
                case 45: goto L41;
                case 46: goto L41;
                case 47: goto L41;
                case 48: goto L41;
                case 49: goto L41;
                case 50: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L5a
        L2d:
            sun.misc.Unsafe r5 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            java.lang.Object r5 = r5.getObject(r9, r3)
            if (r5 == 0) goto L5a
            sun.misc.Unsafe r6 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r7 = r8.mapFieldSchema
            java.lang.Object r7 = r7.toImmutable(r5)
            r6.putObject(r9, r3, r7)
            goto L5a
        L41:
            com.google.crypto.tink.shaded.protobuf.ListFieldSchema r5 = r8.listFieldSchema
            r5.makeImmutableListAt(r9, r3)
            goto L5a
        L47:
            boolean r5 = r8.isFieldPresent(r9, r1)
            if (r5 == 0) goto L5a
            com.google.crypto.tink.shaded.protobuf.Schema r5 = r8.getMessageFieldSchema(r1)
            sun.misc.Unsafe r6 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            java.lang.Object r6 = r6.getObject(r9, r3)
            r5.makeImmutable(r6)
        L5a:
            int r1 = r1 + 3
            goto L1b
        L5d:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r1 = r8.unknownFieldSchema
            r1.makeImmutable(r9)
            boolean r1 = r8.hasExtensions
            if (r1 == 0) goto L6b
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r1 = r8.extensionSchema
            r1.makeImmutable(r9)
        L6b:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T r7, com.google.crypto.tink.shaded.protobuf.Reader r8, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r9) throws java.io.IOException {
            r6 = this;
            if (r9 == 0) goto L11
            checkMutable(r7)
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r1 = r6.unknownFieldSchema
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r2 = r6.extensionSchema
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.mergeFromHelper(r1, r2, r3, r4, r5)
            return
        L11:
            r3 = r7
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>()
            throw r7
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T r3, T r4) {
            r2 = this;
            checkMutable(r3)
            if (r4 == 0) goto L20
            r0 = 0
        L6:
            int[] r1 = r2.buffer
            int r1 = r1.length
            if (r0 >= r1) goto L11
            r2.mergeSingleField(r3, r4, r0)
            int r0 = r0 + 3
            goto L6
        L11:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r0 = r2.unknownFieldSchema
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.mergeUnknownFields(r0, r3, r4)
            boolean r0 = r2.hasExtensions
            if (r0 == 0) goto L1f
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = r2.extensionSchema
            com.google.crypto.tink.shaded.protobuf.SchemaUtil.mergeExtensions(r0, r3, r4)
        L1f:
            return
        L20:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void mergeFrom(T r9, byte[] r10, int r11, int r12, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r13) throws java.io.IOException {
            r8 = this;
            boolean r0 = r8.proto3
            if (r0 == 0) goto L8
            r8.parseProto3Message(r9, r10, r11, r12, r13)
            goto L12
        L8:
            r6 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r13
            r1.parseProto2Message(r2, r3, r4, r5, r6, r7)
        L12:
            return
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public T newInstance() {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r0 = r2.newInstanceSchema
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r2.defaultInstance
            java.lang.Object r0 = r0.newInstance(r1)
            return r0
    }

    int parseProto2Message(T r32, byte[] r33, int r34, int r35, int r36, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r37) throws java.io.IOException {
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            r4 = r35
            r7 = r37
            checkMutable(r1)
            sun.misc.Unsafe r9 = com.google.crypto.tink.shaded.protobuf.MessageSchema.UNSAFE
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r6 = 0
            r8 = -1
            r10 = 0
            r11 = r10
            r10 = r5
            r5 = r8
            r8 = r3
            r3 = r34
        L1c:
            if (r3 >= r4) goto L5de
            int r13 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L30
            int r13 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r3, r2, r13, r7)
            int r3 = r7.int1
            r28 = r13
            r13 = r3
            r3 = r28
            goto L35
        L30:
            r28 = r13
            r13 = r3
            r3 = r28
        L35:
            int r14 = r13 >>> 3
            r6 = r13 & 7
            if (r14 <= r5) goto L46
            r34 = 1048575(0xfffff, float:1.469367E-39)
            int r12 = r11 / 3
            int r11 = r0.positionForFieldNumber(r14, r12)
            r12 = r11
            goto L4e
        L46:
            r34 = 1048575(0xfffff, float:1.469367E-39)
            int r11 = r0.positionForFieldNumber(r14)
            r12 = r11
        L4e:
            r16 = r14
            r5 = -1
            if (r12 != r5) goto L61
            r5 = 0
            r2 = r3
            r11 = r5
            r24 = r9
            r23 = r10
            r5 = r13
            r18 = r14
            r9 = r0
            r10 = r6
            goto L583
        L61:
            int[] r5 = r0.buffer
            int r11 = r12 + 1
            r11 = r5[r11]
            int r5 = type(r11)
            long r17 = offset(r11)
            r2 = 17
            r19 = r3
            if (r5 > r2) goto L447
            int[] r2 = r0.buffer
            int r20 = r12 + 2
            r20 = r2[r20]
            int r2 = r20 >>> 20
            r3 = 1
            int r22 = r3 << r2
            r2 = r20 & r34
            if (r2 == r8) goto L97
            r3 = r34
            if (r8 == r3) goto L8c
            long r3 = (long) r8
            r9.putInt(r1, r3, r10)
        L8c:
            r3 = r2
            r8 = r3
            long r3 = (long) r2
            int r3 = r9.getInt(r1, r3)
            r23 = r3
            r10 = r8
            goto L9a
        L97:
            r23 = r10
            r10 = r8
        L9a:
            r3 = 5
            switch(r5) {
                case 0: goto L409;
                case 1: goto L3dc;
                case 2: goto L3a3;
                case 3: goto L3a3;
                case 4: goto L373;
                case 5: goto L327;
                case 6: goto L2ef;
                case 7: goto L2ae;
                case 8: goto L269;
                case 9: goto L214;
                case 10: goto L1e4;
                case 11: goto L373;
                case 12: goto L17b;
                case 13: goto L2ef;
                case 14: goto L327;
                case 15: goto L148;
                case 16: goto L107;
                case 17: goto Lb0;
                default: goto L9e;
            }
        L9e:
            r7 = r33
            r25 = r2
            r2 = r9
            r3 = r13
            r15 = r19
            r9 = r6
            r19 = r10
            r10 = r5
            r4 = r17
            r18 = r14
            goto L43a
        Lb0:
            r3 = 3
            if (r6 != r3) goto Lf0
            r8 = r2
            java.lang.Object r2 = r0.mutableMessageFieldForMerge(r1, r12)
            int r3 = r14 << 3
            r3 = r3 | 4
            r7 = r3
            com.google.crypto.tink.shaded.protobuf.Schema r3 = r0.getMessageFieldSchema(r12)
            r4 = r10
            r10 = r5
            r5 = r19
            r19 = r4
            r4 = r33
            r25 = r8
            r24 = r9
            r8 = r37
            r9 = r6
            r6 = r35
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.mergeGroupField(r2, r3, r4, r5, r6, r7, r8)
            r28 = r7
            r7 = r4
            r4 = r28
            r0.storeMessageField(r1, r12, r2)
            r5 = r23 | r22
            r4 = r35
            r10 = r5
            r2 = r7
            r7 = r8
            r11 = r12
            r6 = r13
            r5 = r16
            r8 = r19
            r9 = r24
            goto L1c
        Lf0:
            r25 = r2
            r8 = r7
            r24 = r9
            r3 = r19
            r7 = r33
            r9 = r6
            r19 = r10
            r10 = r5
            r15 = r3
            r3 = r13
            r4 = r17
            r2 = r24
            r18 = r14
            goto L43a
        L107:
            r25 = r2
            r8 = r7
            r24 = r9
            r3 = r19
            r7 = r33
            r9 = r6
            r19 = r10
            r10 = r5
            if (r9 != 0) goto L13e
            int r21 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r7, r3, r8)
            long r2 = r8.long1
            long r5 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag64(r2)
            r2 = r1
            r3 = r17
            r1 = r24
            r1.putLong(r2, r3, r5)
            r5 = r2
            r2 = r1
            r1 = r5
            r4 = r3
            r3 = r23 | r22
            r4 = r35
            r9 = r2
            r10 = r3
            r2 = r7
            r7 = r8
            r11 = r12
            r6 = r13
            r5 = r16
            r8 = r19
            r3 = r21
            goto L1c
        L13e:
            r4 = r17
            r2 = r24
            r15 = r3
            r3 = r13
            r18 = r14
            goto L43a
        L148:
            r25 = r2
            r8 = r7
            r2 = r9
            r3 = r19
            r7 = r33
            r9 = r6
            r19 = r10
            r10 = r5
            r4 = r17
            if (r9 != 0) goto L175
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r7, r3, r8)
            int r6 = r8.int1
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag32(r6)
            r2.putInt(r1, r4, r6)
            r6 = r23 | r22
            r4 = r35
            r9 = r2
            r10 = r6
            r2 = r7
            r7 = r8
            r11 = r12
            r6 = r13
            r5 = r16
            r8 = r19
            goto L1c
        L175:
            r15 = r3
            r3 = r13
            r18 = r14
            goto L43a
        L17b:
            r25 = r2
            r8 = r7
            r2 = r9
            r3 = r19
            r7 = r33
            r9 = r6
            r19 = r10
            r10 = r5
            r4 = r17
            if (r9 != 0) goto L1de
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r7, r3, r8)
            int r6 = r8.int1
            r34 = r3
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r3 = r0.getEnumFieldVerifier(r12)
            if (r3 == 0) goto L1c5
            boolean r17 = r3.isInRange(r6)
            if (r17 == 0) goto L1a4
            r17 = r3
            r18 = r14
            goto L1c9
        L1a4:
            r17 = r3
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3 = getMutableUnknownFields(r1)
            r18 = r14
            long r14 = (long) r6
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r3.storeField(r13, r14)
            r3 = r34
            r4 = r35
            r9 = r2
            r2 = r7
            r7 = r8
            r11 = r12
            r6 = r13
            r5 = r16
            r8 = r19
            r10 = r23
            goto L1c
        L1c5:
            r17 = r3
            r18 = r14
        L1c9:
            r2.putInt(r1, r4, r6)
            r3 = r23 | r22
            r4 = r35
            r9 = r2
            r10 = r3
            r2 = r7
            r7 = r8
            r11 = r12
            r6 = r13
            r5 = r16
            r8 = r19
            r3 = r34
            goto L1c
        L1de:
            r18 = r14
            r15 = r3
            r3 = r13
            goto L43a
        L1e4:
            r25 = r2
            r8 = r7
            r2 = r9
            r3 = r19
            r7 = r33
            r9 = r6
            r19 = r10
            r10 = r5
            r4 = r17
            r18 = r14
            r6 = 2
            if (r9 != r6) goto L210
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeBytes(r7, r3, r8)
            java.lang.Object r6 = r8.object1
            r2.putObject(r1, r4, r6)
            r6 = r23 | r22
            r4 = r35
            r9 = r2
            r10 = r6
            r2 = r7
            r7 = r8
            r11 = r12
            r6 = r13
            r5 = r16
            r8 = r19
            goto L1c
        L210:
            r15 = r3
            r3 = r13
            goto L43a
        L214:
            r25 = r2
            r8 = r7
            r2 = r9
            r3 = r19
            r7 = r33
            r9 = r6
            r19 = r10
            r10 = r5
            r4 = r17
            r18 = r14
            r6 = 2
            if (r9 != r6) goto L259
            r6 = r1
            java.lang.Object r1 = r0.mutableMessageFieldForMerge(r6, r12)
            r24 = r2
            com.google.crypto.tink.shaded.protobuf.Schema r2 = r0.getMessageFieldSchema(r12)
            r14 = r4
            r5 = r35
            r4 = r3
            r3 = r7
            r7 = r6
            r6 = r8
            r8 = r24
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.mergeMessageField(r1, r2, r3, r4, r5, r6)
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r6
            r0.storeMessageField(r7, r12, r3)
            r5 = r23 | r22
            r3 = r2
            r10 = r5
            r9 = r8
            r11 = r12
            r6 = r13
            r5 = r16
            r8 = r19
            r2 = r1
            r1 = r7
            r7 = r4
            r4 = r35
            goto L1c
        L259:
            r14 = r7
            r7 = r1
            r1 = r14
            r14 = r4
            r4 = r8
            r8 = r2
            r2 = r3
            r3 = r7
            r7 = r1
            r1 = r3
            r3 = r13
            r4 = r14
            r15 = r2
            r2 = r8
            goto L43a
        L269:
            r28 = r17
            r18 = r14
            r14 = r28
            r25 = r2
            r4 = r7
            r8 = r9
            r2 = r19
            r7 = r1
            r9 = r6
            r19 = r10
            r1 = r33
            r10 = r5
            r6 = 2
            if (r9 != r6) goto L2a5
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r3 & r11
            if (r3 != 0) goto L28a
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeString(r1, r2, r4)
            r3 = r2
            goto L28f
        L28a:
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeStringRequireUtf8(r1, r2, r4)
            r3 = r2
        L28f:
            java.lang.Object r2 = r4.object1
            r8.putObject(r7, r14, r2)
            r2 = r23 | r22
            r10 = r2
            r9 = r8
            r11 = r12
            r6 = r13
            r5 = r16
            r8 = r19
            r2 = r1
            r1 = r7
            r7 = r4
            r4 = r35
            goto L1c
        L2a5:
            r3 = r7
            r7 = r1
            r1 = r3
            r3 = r13
            r4 = r14
            r15 = r2
            r2 = r8
            goto L43a
        L2ae:
            r28 = r17
            r18 = r14
            r14 = r28
            r25 = r2
            r4 = r7
            r8 = r9
            r2 = r19
            r7 = r1
            r9 = r6
            r19 = r10
            r1 = r33
            r10 = r5
            if (r9 != 0) goto L2e6
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r1, r2, r4)
            long r5 = r4.long1
            r26 = 0
            int r2 = (r5 > r26 ? 1 : (r5 == r26 ? 0 : -1))
            if (r2 == 0) goto L2d1
            r2 = 1
            goto L2d2
        L2d1:
            r2 = 0
        L2d2:
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putBoolean(r7, r14, r2)
            r2 = r23 | r22
            r10 = r2
            r9 = r8
            r11 = r12
            r6 = r13
            r5 = r16
            r8 = r19
            r2 = r1
            r1 = r7
            r7 = r4
            r4 = r35
            goto L1c
        L2e6:
            r3 = r7
            r7 = r1
            r1 = r3
            r3 = r13
            r4 = r14
            r15 = r2
            r2 = r8
            goto L43a
        L2ef:
            r28 = r17
            r18 = r14
            r14 = r28
            r25 = r2
            r4 = r7
            r8 = r9
            r2 = r19
            r7 = r1
            r9 = r6
            r19 = r10
            r1 = r33
            r10 = r5
            if (r9 != r3) goto L31e
            int r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFixed32(r1, r2)
            r8.putInt(r7, r14, r3)
            int r3 = r2 + 4
            r2 = r23 | r22
            r10 = r2
            r9 = r8
            r11 = r12
            r6 = r13
            r5 = r16
            r8 = r19
            r2 = r1
            r1 = r7
            r7 = r4
            r4 = r35
            goto L1c
        L31e:
            r3 = r7
            r7 = r1
            r1 = r3
            r3 = r13
            r4 = r14
            r15 = r2
            r2 = r8
            goto L43a
        L327:
            r28 = r17
            r18 = r14
            r14 = r28
            r25 = r2
            r4 = r7
            r8 = r9
            r2 = r19
            r7 = r1
            r9 = r6
            r19 = r10
            r1 = r33
            r10 = r5
            r3 = 1
            if (r9 != r3) goto L365
            long r5 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFixed64(r1, r2)
            r28 = r14
            r14 = r4
            r3 = r28
            r15 = r2
            r2 = r7
            r7 = r1
            r1 = r8
            r1.putLong(r2, r3, r5)
            r28 = r2
            r2 = r1
            r1 = r28
            int r5 = r15 + 8
            r6 = r23 | r22
            r4 = r35
            r9 = r2
            r3 = r5
            r10 = r6
            r2 = r7
            r11 = r12
            r6 = r13
            r7 = r14
            r5 = r16
            r8 = r19
            goto L1c
        L365:
            r3 = r7
            r7 = r1
            r1 = r3
            r28 = r14
            r14 = r4
            r3 = r28
            r15 = r2
            r2 = r8
            r4 = r3
            r3 = r13
            goto L43a
        L373:
            r25 = r2
            r2 = r9
            r3 = r17
            r15 = r19
            r9 = r6
            r19 = r10
            r18 = r14
            r10 = r5
            r14 = r7
            r7 = r33
            if (r9 != 0) goto L39f
            int r5 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint32(r7, r15, r14)
            int r6 = r14.int1
            r2.putInt(r1, r3, r6)
            r6 = r23 | r22
            r4 = r35
            r9 = r2
            r3 = r5
            r10 = r6
            r2 = r7
            r11 = r12
            r6 = r13
            r7 = r14
            r5 = r16
            r8 = r19
            goto L1c
        L39f:
            r4 = r3
            r3 = r13
            goto L43a
        L3a3:
            r25 = r2
            r2 = r9
            r3 = r17
            r15 = r19
            r9 = r6
            r19 = r10
            r18 = r14
            r10 = r5
            r14 = r7
            r7 = r33
            if (r9 != 0) goto L3d8
            int r8 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeVarint64(r7, r15, r14)
            long r5 = r14.long1
            r28 = r2
            r2 = r1
            r1 = r28
            r1.putLong(r2, r3, r5)
            r5 = r2
            r2 = r1
            r1 = r5
            r4 = r3
            r3 = r23 | r22
            r4 = r35
            r9 = r2
            r10 = r3
            r2 = r7
            r3 = r8
            r11 = r12
            r6 = r13
            r7 = r14
            r5 = r16
            r8 = r19
            goto L1c
        L3d8:
            r4 = r3
            r3 = r13
            goto L43a
        L3dc:
            r25 = r2
            r2 = r9
            r15 = r19
            r9 = r6
            r19 = r10
            r10 = r5
            r4 = r17
            r18 = r14
            r14 = r7
            r7 = r33
            if (r9 != r3) goto L407
            float r3 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeFloat(r7, r15)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putFloat(r1, r4, r3)
            int r3 = r15 + 4
            r6 = r23 | r22
            r4 = r35
            r9 = r2
            r10 = r6
            r2 = r7
            r11 = r12
            r6 = r13
            r7 = r14
            r5 = r16
            r8 = r19
            goto L1c
        L407:
            r3 = r13
            goto L43a
        L409:
            r25 = r2
            r2 = r9
            r15 = r19
            r9 = r6
            r19 = r10
            r10 = r5
            r4 = r17
            r18 = r14
            r14 = r7
            r7 = r33
            r3 = 1
            if (r9 != r3) goto L439
            r3 = r13
            double r13 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeDouble(r7, r15)
            com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putDouble(r1, r4, r13)
            int r6 = r15 + 8
            r8 = r23 | r22
            r4 = r6
            r6 = r3
            r3 = r4
            r4 = r35
            r9 = r2
            r2 = r7
            r10 = r8
            r11 = r12
            r5 = r16
            r8 = r19
            r7 = r37
            goto L1c
        L439:
            r3 = r13
        L43a:
            r7 = r37
            r24 = r2
            r5 = r3
            r10 = r9
            r11 = r12
            r2 = r15
            r8 = r19
            r9 = r0
            goto L583
        L447:
            r7 = r33
            r2 = r9
            r23 = r10
            r3 = r13
            r15 = r19
            r10 = r5
            r9 = r6
            r4 = r17
            r18 = r14
            r6 = 27
            if (r10 != r6) goto L4b0
            r6 = 2
            if (r9 != r6) goto L4a3
            java.lang.Object r6 = r2.getObject(r1, r4)
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r6 = (com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList) r6
            boolean r13 = r6.isModifiable()
            if (r13 != 0) goto L47b
            int r13 = r6.size()
            if (r13 != 0) goto L472
            r14 = 10
            goto L474
        L472:
            int r14 = r13 * 2
        L474:
            com.google.crypto.tink.shaded.protobuf.Internal$ProtobufList r6 = r6.mutableCopyWithCapacity(r14)
            r2.putObject(r1, r4, r6)
        L47b:
            com.google.crypto.tink.shaded.protobuf.Schema r1 = r0.getMessageFieldSchema(r12)
            r19 = r8
            r8 = r12
            r12 = r4
            r4 = r15
            r5 = r35
            r15 = r2
            r2 = r3
            r3 = r7
            r7 = r37
            int r1 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeMessageList(r1, r2, r3, r4, r5, r6, r7)
            r5 = r2
            r2 = r33
            r4 = r35
            r3 = r1
            r6 = r5
            r11 = r8
            r9 = r15
            r5 = r16
            r8 = r19
            r10 = r23
            r1 = r32
            goto L1c
        L4a3:
            r19 = r8
            r8 = r12
            r12 = r4
            r5 = r3
            r3 = r15
            r15 = r2
            r10 = r9
            r24 = r15
            r9 = r5
            goto L53b
        L4b0:
            r19 = r8
            r8 = r12
            r12 = r4
            r5 = r3
            r3 = r15
            r15 = r2
            r1 = 49
            if (r10 > r1) goto L4f8
            r1 = r3
            r7 = r9
            r2 = r10
            long r9 = (long) r11
            r4 = r35
            r14 = r37
            r17 = r11
            r24 = r15
            r6 = r18
            r15 = r1
            r11 = r2
            r1 = r32
            r2 = r33
            int r3 = r0.parseRepeatedField(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r9 = r5
            r10 = r7
            if (r3 == r15) goto L4ed
            r0 = r31
            r1 = r32
            r2 = r33
            r4 = r35
            r7 = r37
            r11 = r8
            r6 = r9
            r5 = r16
            r8 = r19
            r10 = r23
            r9 = r24
            goto L1c
        L4ed:
            r7 = r37
            r2 = r3
            r11 = r8
            r5 = r9
            r8 = r19
            r9 = r31
            goto L583
        L4f8:
            r17 = r11
            r24 = r15
            r11 = r10
            r10 = r9
            r9 = r5
            r0 = 50
            if (r11 != r0) goto L545
            r6 = 2
            if (r10 != r6) goto L53b
            r14 = r3
            r0 = r31
            r1 = r32
            r2 = r33
            r4 = r35
            r5 = r8
            r6 = r12
            r8 = r37
            int r3 = r0.parseMapField(r1, r2, r3, r4, r5, r6, r8)
            r8 = r5
            if (r3 == r14) goto L530
            r0 = r31
            r1 = r32
            r2 = r33
            r4 = r35
            r7 = r37
            r11 = r8
            r6 = r9
            r5 = r16
            r8 = r19
            r10 = r23
            r9 = r24
            goto L1c
        L530:
            r7 = r37
            r2 = r3
            r11 = r8
            r5 = r9
            r8 = r19
            r9 = r31
            goto L583
        L53b:
            r7 = r37
            r2 = r3
            r11 = r8
            r5 = r9
            r8 = r19
            r9 = r31
            goto L583
        L545:
            r14 = r3
            r0 = r31
            r1 = r32
            r2 = r33
            r4 = r35
            r5 = r9
            r7 = r10
            r9 = r11
            r10 = r12
            r6 = r18
            r13 = r37
            r12 = r8
            r8 = r17
            int r3 = r0.parseOneofField(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            r8 = r12
            r28 = r9
            r9 = r0
            r29 = r10
            r10 = r7
            r11 = r28
            r7 = r13
            r12 = r29
            if (r3 == r14) goto L57f
            r1 = r32
            r2 = r33
            r4 = r35
            r6 = r5
            r11 = r8
            r0 = r9
            r5 = r16
            r8 = r19
            r10 = r23
            r9 = r24
            goto L1c
        L57f:
            r2 = r3
            r11 = r8
            r8 = r19
        L583:
            r15 = r36
            if (r5 != r15) goto L595
            if (r15 == 0) goto L595
            r7 = r32
            r12 = r35
            r6 = r2
            r10 = r8
            r8 = r5
            r13 = r11
            r11 = r23
            goto L5f2
        L595:
            boolean r0 = r9.hasExtensions
            if (r0 == 0) goto L5b9
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = r7.extensionRegistry
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            if (r0 == r1) goto L5b6
            r0 = r5
            com.google.crypto.tink.shaded.protobuf.MessageLite r5 = r9.defaultInstance
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r6 = r9.unknownFieldSchema
            r4 = r32
            r1 = r33
            r3 = r35
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeExtensionOrUnknownField(r0, r1, r2, r3, r4, r5, r6, r7)
            r7 = r4
            r12 = r35
            r5 = r0
            r3 = r2
            goto L5ce
        L5b6:
            r7 = r32
            goto L5bb
        L5b9:
            r7 = r32
        L5bb:
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r4 = getMutableUnknownFields(r7)
            r1 = r33
            r3 = r35
            r0 = r5
            r5 = r37
            int r2 = com.google.crypto.tink.shaded.protobuf.ArrayDecoders.decodeUnknownField(r0, r1, r2, r3, r4, r5)
            r12 = r3
            r5 = r0
            r3 = r2
        L5ce:
            r2 = r33
            r6 = r5
            r1 = r7
            r0 = r9
            r4 = r12
            r5 = r16
            r10 = r23
            r9 = r24
            r7 = r37
            goto L1c
        L5de:
            r15 = r36
            r7 = r1
            r12 = r4
            r19 = r8
            r24 = r9
            r23 = r10
            r9 = r0
            r16 = r5
            r8 = r6
            r10 = r19
            r6 = r3
            r13 = r11
            r11 = r23
        L5f2:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            if (r10 == r3) goto L5fe
            long r0 = (long) r10
            r14 = r24
            r14.putInt(r7, r0, r11)
            goto L600
        L5fe:
            r14 = r24
        L600:
            r0 = 0
            int r1 = r9.checkInitializedCount
            r3 = r0
            r0 = r1
        L605:
            int r1 = r9.repeatedFieldOffsetStart
            if (r0 >= r1) goto L620
            int[] r1 = r9.intArray
            r2 = r1[r0]
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r4 = r9.unknownFieldSchema
            r5 = r32
            r1 = r7
            r7 = r0
            r0 = r9
            java.lang.Object r2 = r0.filterMapUnknownEnumValues(r1, r2, r3, r4, r5)
            r3 = r2
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3 = (com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite) r3
            int r2 = r7 + 1
            r7 = r1
            r0 = r2
            goto L605
        L620:
            r1 = r7
            r7 = r0
            r0 = r9
            if (r3 == 0) goto L62a
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema<?, ?> r2 = r0.unknownFieldSchema
            r2.setBuilderToMessage(r1, r3)
        L62a:
            if (r15 != 0) goto L634
            if (r6 != r12) goto L62f
            goto L638
        L62f:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r2
        L634:
            if (r6 > r12) goto L639
            if (r8 != r15) goto L639
        L638:
            return r6
        L639:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r2
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public void writeTo(T r3, com.google.crypto.tink.shaded.protobuf.Writer r4) throws java.io.IOException {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r0 = r4.fieldOrder()
            com.google.crypto.tink.shaded.protobuf.Writer$FieldOrder r1 = com.google.crypto.tink.shaded.protobuf.Writer.FieldOrder.DESCENDING
            if (r0 != r1) goto Lc
            r2.writeFieldsInDescendingOrder(r3, r4)
            goto L17
        Lc:
            boolean r0 = r2.proto3
            if (r0 == 0) goto L14
            r2.writeFieldsInAscendingOrderProto3(r3, r4)
            goto L17
        L14:
            r2.writeFieldsInAscendingOrderProto2(r3, r4)
        L17:
            return
    }
}
