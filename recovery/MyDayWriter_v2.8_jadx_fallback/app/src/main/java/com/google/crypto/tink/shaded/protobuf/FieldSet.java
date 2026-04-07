package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite;

/* JADX INFO: loaded from: classes.dex */
final class FieldSet<T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> {
    private static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private static final com.google.crypto.tink.shaded.protobuf.FieldSet DEFAULT_INSTANCE = null;
    private final com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.FieldSet$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType = null;

        static {
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType = r0
                r0 = 1
                int[] r1 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L15
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r1 = move-exception
            L16:
                r1 = 2
                int[] r2 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L22
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r2 = move-exception
            L23:
                r2 = 3
                int[] r3 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r4 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT64     // Catch: java.lang.NoSuchFieldError -> L2f
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r3 = move-exception
            L30:
                r3 = 4
                int[] r4 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r5 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT64     // Catch: java.lang.NoSuchFieldError -> L3c
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r4 = move-exception
            L3d:
                r4 = 5
                int[] r5 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r6 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT32     // Catch: java.lang.NoSuchFieldError -> L49
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r5[r6] = r4     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r5 = move-exception
            L4a:
                r5 = 6
                int[] r6 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L56
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r7 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED64     // Catch: java.lang.NoSuchFieldError -> L56
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r6[r7] = r5     // Catch: java.lang.NoSuchFieldError -> L56
                goto L57
            L56:
                r6 = move-exception
            L57:
                r6 = 7
                int[] r7 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L63
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r8 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED32     // Catch: java.lang.NoSuchFieldError -> L63
                int r8 = r8.ordinal()     // Catch: java.lang.NoSuchFieldError -> L63
                r7[r8] = r6     // Catch: java.lang.NoSuchFieldError -> L63
                goto L64
            L63:
                r7 = move-exception
            L64:
                r7 = 8
                int[] r8 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L71
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r9 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BOOL     // Catch: java.lang.NoSuchFieldError -> L71
                int r9 = r9.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r8[r9] = r7     // Catch: java.lang.NoSuchFieldError -> L71
                goto L72
            L71:
                r8 = move-exception
            L72:
                r8 = 9
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L7f
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP     // Catch: java.lang.NoSuchFieldError -> L7f
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7f
                r9[r10] = r8     // Catch: java.lang.NoSuchFieldError -> L7f
                goto L80
            L7f:
                r9 = move-exception
            L80:
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L8d
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L8d
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8d
                r11 = 10
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> L8d
                goto L8e
            L8d:
                r9 = move-exception
            L8e:
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L9b
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING     // Catch: java.lang.NoSuchFieldError -> L9b
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9b
                r11 = 11
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> L9b
                goto L9c
            L9b:
                r9 = move-exception
            L9c:
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> La9
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BYTES     // Catch: java.lang.NoSuchFieldError -> La9
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> La9
                r11 = 12
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> La9
                goto Laa
            La9:
                r9 = move-exception
            Laa:
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lb7
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT32     // Catch: java.lang.NoSuchFieldError -> Lb7
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb7
                r11 = 13
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> Lb7
                goto Lb8
            Lb7:
                r9 = move-exception
            Lb8:
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lc5
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED32     // Catch: java.lang.NoSuchFieldError -> Lc5
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc5
                r11 = 14
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> Lc5
                goto Lc6
            Lc5:
                r9 = move-exception
            Lc6:
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Ld3
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED64     // Catch: java.lang.NoSuchFieldError -> Ld3
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld3
                r11 = 15
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> Ld3
                goto Ld4
            Ld3:
                r9 = move-exception
            Ld4:
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Le1
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT32     // Catch: java.lang.NoSuchFieldError -> Le1
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le1
                r11 = 16
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> Le1
                goto Le2
            Le1:
                r9 = move-exception
            Le2:
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lef
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT64     // Catch: java.lang.NoSuchFieldError -> Lef
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lef
                r11 = 17
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> Lef
                goto Lf0
            Lef:
                r9 = move-exception
            Lf0:
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lfd
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM     // Catch: java.lang.NoSuchFieldError -> Lfd
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lfd
                r11 = 18
                r9[r10] = r11     // Catch: java.lang.NoSuchFieldError -> Lfd
                goto Lfe
            Lfd:
                r9 = move-exception
            Lfe:
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType[] r9 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType = r9
                int[] r9 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L112
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r10 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.INT     // Catch: java.lang.NoSuchFieldError -> L112
                int r10 = r10.ordinal()     // Catch: java.lang.NoSuchFieldError -> L112
                r9[r10] = r0     // Catch: java.lang.NoSuchFieldError -> L112
                goto L113
            L112:
                r0 = move-exception
            L113:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L11e
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r9 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.LONG     // Catch: java.lang.NoSuchFieldError -> L11e
                int r9 = r9.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11e
                r0[r9] = r1     // Catch: java.lang.NoSuchFieldError -> L11e
                goto L11f
            L11e:
                r0 = move-exception
            L11f:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L12a
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L12a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12a
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12a
                goto L12b
            L12a:
                r0 = move-exception
            L12b:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L136
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L136
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L136
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L136
                goto L137
            L136:
                r0 = move-exception
            L137:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L142
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L142
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L142
                r0[r1] = r4     // Catch: java.lang.NoSuchFieldError -> L142
                goto L143
            L142:
                r0 = move-exception
            L143:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L14e
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.STRING     // Catch: java.lang.NoSuchFieldError -> L14e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L14e
                r0[r1] = r5     // Catch: java.lang.NoSuchFieldError -> L14e
                goto L14f
            L14e:
                r0 = move-exception
            L14f:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L15a
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.BYTE_STRING     // Catch: java.lang.NoSuchFieldError -> L15a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15a
                r0[r1] = r6     // Catch: java.lang.NoSuchFieldError -> L15a
                goto L15b
            L15a:
                r0 = move-exception
            L15b:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L166
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.ENUM     // Catch: java.lang.NoSuchFieldError -> L166
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L166
                r0[r1] = r7     // Catch: java.lang.NoSuchFieldError -> L166
                goto L167
            L166:
                r0 = move-exception
            L167:
                int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType     // Catch: java.lang.NoSuchFieldError -> L172
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L172
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L172
                r0[r1] = r8     // Catch: java.lang.NoSuchFieldError -> L172
                goto L173
            L172:
                r0 = move-exception
            L173:
                return
        }
    }

    static final class Builder<T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> {
        private com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> fields;
        private boolean hasLazyField;
        private boolean hasNestedBuilders;
        private boolean isMutable;

        private Builder() {
                r1 = this;
                r0 = 16
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.newFieldMap(r0)
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private Builder(com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> r2) {
                r1 = this;
                r1.<init>()
                r1.fields = r2
                r0 = 1
                r1.isMutable = r0
                return
        }

        private com.google.crypto.tink.shaded.protobuf.FieldSet<T> buildImpl(boolean r4) {
                r3 = this;
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r3.fields
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Ld
                com.google.crypto.tink.shaded.protobuf.FieldSet r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.emptySet()
                return r0
            Ld:
                r0 = 0
                r3.isMutable = r0
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
                boolean r2 = r3.hasNestedBuilders
                if (r2 == 0) goto L1f
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r3.fields
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$100(r2, r0)
                replaceBuilders(r1, r4)
            L1f:
                com.google.crypto.tink.shaded.protobuf.FieldSet r0 = new com.google.crypto.tink.shaded.protobuf.FieldSet
                r2 = 0
                r0.<init>(r1, r2)
                boolean r2 = r3.hasLazyField
                com.google.crypto.tink.shaded.protobuf.FieldSet.access$302(r0, r2)
                return r0
        }

        private void ensureIsMutable() {
                r2 = this;
                boolean r0 = r2.isMutable
                if (r0 != 0) goto Lf
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
                r1 = 1
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$100(r0, r1)
                r2.fields = r0
                r2.isMutable = r1
            Lf:
                return
        }

        public static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> com.google.crypto.tink.shaded.protobuf.FieldSet.Builder<T> fromFieldSet(com.google.crypto.tink.shaded.protobuf.FieldSet<T> r3) {
                com.google.crypto.tink.shaded.protobuf.FieldSet$Builder r0 = new com.google.crypto.tink.shaded.protobuf.FieldSet$Builder
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$400(r3)
                r2 = 1
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$100(r1, r2)
                r0.<init>(r1)
                boolean r1 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$300(r3)
                r0.hasLazyField = r1
                return r0
        }

        private void mergeFromField(java.util.Map.Entry<T, java.lang.Object> r7) {
                r6 = this;
                java.lang.Object r0 = r7.getKey()
                com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r0 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r0
                java.lang.Object r1 = r7.getValue()
                boolean r2 = r1 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
                if (r2 == 0) goto L15
                r2 = r1
                com.google.crypto.tink.shaded.protobuf.LazyField r2 = (com.google.crypto.tink.shaded.protobuf.LazyField) r2
                com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r2.getValue()
            L15:
                boolean r2 = r0.isRepeated()
                if (r2 == 0) goto L48
                java.lang.Object r2 = r6.getFieldAllowBuilders(r0)
                java.util.List r2 = (java.util.List) r2
                if (r2 != 0) goto L2e
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r2 = r3
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r3 = r6.fields
                r3.put(r0, r2)
            L2e:
                r3 = r1
                java.util.List r3 = (java.util.List) r3
                java.util.Iterator r3 = r3.iterator()
            L35:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L47
                java.lang.Object r4 = r3.next()
                java.lang.Object r5 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$700(r4)
                r2.add(r5)
                goto L35
            L47:
                goto L8f
            L48:
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = r0.getLiteJavaType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
                if (r2 != r3) goto L86
                java.lang.Object r2 = r6.getFieldAllowBuilders(r0)
                if (r2 != 0) goto L60
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r3 = r6.fields
                java.lang.Object r4 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$700(r1)
                r3.put(r0, r4)
                goto L85
            L60:
                boolean r3 = r2 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
                if (r3 == 0) goto L6e
                r3 = r2
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite.Builder) r3
                r4 = r1
                com.google.crypto.tink.shaded.protobuf.MessageLite r4 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r4
                r0.internalMergeFrom(r3, r4)
                goto L85
            L6e:
                r3 = r2
                com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r3 = r3.toBuilder()
                r4 = r1
                com.google.crypto.tink.shaded.protobuf.MessageLite r4 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r4
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r3 = r0.internalMergeFrom(r3, r4)
                com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r3.build()
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r3 = r6.fields
                r3.put(r0, r2)
            L85:
                goto L8f
            L86:
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r6.fields
                java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$700(r1)
                r2.put(r0, r3)
            L8f:
                return
        }

        private static java.lang.Object replaceBuilder(java.lang.Object r2, boolean r3) {
                boolean r0 = r2 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
                if (r0 != 0) goto L5
                return r2
            L5:
                r0 = r2
                com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite.Builder) r0
                if (r3 == 0) goto Lf
                com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.buildPartial()
                return r1
            Lf:
                com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r0.build()
                return r1
        }

        private static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> java.lang.Object replaceBuilders(T r5, java.lang.Object r6, boolean r7) {
                if (r6 != 0) goto L3
                return r6
            L3:
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = r5.getLiteJavaType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
                if (r0 != r1) goto L5a
                boolean r0 = r5.isRepeated()
                if (r0 == 0) goto L55
                boolean r0 = r6 instanceof java.util.List
                if (r0 == 0) goto L38
                r0 = r6
                java.util.List r0 = (java.util.List) r0
                r1 = 0
            L19:
                int r2 = r0.size()
                if (r1 >= r2) goto L37
                java.lang.Object r2 = r0.get(r1)
                java.lang.Object r3 = replaceBuilder(r2, r7)
                if (r3 == r2) goto L34
                if (r0 != r6) goto L31
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>(r0)
                r0 = r4
            L31:
                r0.set(r1, r3)
            L34:
                int r1 = r1 + 1
                goto L19
            L37:
                return r0
            L38:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Repeated field should contains a List but actually contains type: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.Class r2 = r6.getClass()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L55:
                java.lang.Object r0 = replaceBuilder(r6, r7)
                return r0
            L5a:
                return r6
        }

        private static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> void replaceBuilders(com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> r2, boolean r3) {
                r0 = 0
            L1:
                int r1 = r2.getNumArrayEntries()
                if (r0 >= r1) goto L11
                java.util.Map$Entry r1 = r2.getArrayEntryAt(r0)
                replaceBuilders(r1, r3)
                int r0 = r0 + 1
                goto L1
            L11:
                java.lang.Iterable r0 = r2.getOverflowEntries()
                java.util.Iterator r0 = r0.iterator()
            L19:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L29
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                replaceBuilders(r1, r3)
                goto L19
            L29:
                return
        }

        private static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> void replaceBuilders(java.util.Map.Entry<T, java.lang.Object> r2, boolean r3) {
                java.lang.Object r0 = r2.getKey()
                com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r0 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r0
                java.lang.Object r1 = r2.getValue()
                java.lang.Object r0 = replaceBuilders(r0, r1, r3)
                r2.setValue(r0)
                return
        }

        private void verifyType(T r5, java.lang.Object r6) {
                r4 = this;
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r5.getLiteType()
                boolean r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$500(r0, r6)
                if (r0 != 0) goto L43
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r5.getLiteType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r0 = r0.getJavaType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
                if (r0 != r1) goto L1b
                boolean r0 = r6 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
                if (r0 == 0) goto L1b
                return
            L1b:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                int r1 = r5.getNumber()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r2 = r5.getLiteType()
                com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = r2.getJavaType()
                java.lang.Class r3 = r6.getClass()
                java.lang.String r3 = r3.getName()
                java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
                java.lang.String r2 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1)
                throw r0
            L43:
                return
        }

        public void addRepeatedField(T r4, java.lang.Object r5) {
                r3 = this;
                r3.ensureIsMutable()
                boolean r0 = r4.isRepeated()
                if (r0 == 0) goto L32
                boolean r0 = r3.hasNestedBuilders
                if (r0 != 0) goto L14
                boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
                if (r0 == 0) goto L12
                goto L14
            L12:
                r0 = 0
                goto L15
            L14:
                r0 = 1
            L15:
                r3.hasNestedBuilders = r0
                r3.verifyType(r4, r5)
                java.lang.Object r0 = r3.getFieldAllowBuilders(r4)
                if (r0 != 0) goto L2b
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r3.fields
                r2.put(r4, r1)
                goto L2e
            L2b:
                r1 = r0
                java.util.List r1 = (java.util.List) r1
            L2e:
                r1.add(r5)
                return
            L32:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "addRepeatedField() can only be called on repeated fields."
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.shaded.protobuf.FieldSet<T> build() {
                r1 = this;
                r0 = 0
                com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r1.buildImpl(r0)
                return r0
        }

        public com.google.crypto.tink.shaded.protobuf.FieldSet<T> buildPartial() {
                r1 = this;
                r0 = 1
                com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r1.buildImpl(r0)
                return r0
        }

        public void clearField(T r2) {
                r1 = this;
                r1.ensureIsMutable()
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
                r0.remove(r2)
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L13
                r0 = 0
                r1.hasLazyField = r0
            L13:
                return
        }

        public java.util.Map<T, java.lang.Object> getAllFields() {
                r2 = this;
                boolean r0 = r2.hasLazyField
                if (r0 == 0) goto L1c
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
                r1 = 0
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$100(r0, r1)
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r2.fields
                boolean r1 = r1.isImmutable()
                if (r1 == 0) goto L17
                r0.makeImmutable()
                goto L1b
            L17:
                r1 = 1
                replaceBuilders(r0, r1)
            L1b:
                return r0
            L1c:
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
                boolean r0 = r0.isImmutable()
                if (r0 == 0) goto L27
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
                goto L2d
            L27:
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
                java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            L2d:
                return r0
        }

        public java.lang.Object getField(T r3) {
                r2 = this;
                java.lang.Object r0 = r2.getFieldAllowBuilders(r3)
                r1 = 1
                java.lang.Object r1 = replaceBuilders(r3, r0, r1)
                return r1
        }

        java.lang.Object getFieldAllowBuilders(T r3) {
                r2 = this;
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
                java.lang.Object r0 = r0.get(r3)
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
                if (r1 == 0) goto L12
                r1 = r0
                com.google.crypto.tink.shaded.protobuf.LazyField r1 = (com.google.crypto.tink.shaded.protobuf.LazyField) r1
                com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r1.getValue()
                return r1
            L12:
                return r0
        }

        public java.lang.Object getRepeatedField(T r3, int r4) {
                r2 = this;
                boolean r0 = r2.hasNestedBuilders
                if (r0 == 0) goto L7
                r2.ensureIsMutable()
            L7:
                java.lang.Object r0 = r2.getRepeatedFieldAllowBuilders(r3, r4)
                r1 = 1
                java.lang.Object r1 = replaceBuilder(r0, r1)
                return r1
        }

        java.lang.Object getRepeatedFieldAllowBuilders(T r3, int r4) {
                r2 = this;
                boolean r0 = r3.isRepeated()
                if (r0 == 0) goto L1a
                java.lang.Object r0 = r2.getFieldAllowBuilders(r3)
                if (r0 == 0) goto L14
                r1 = r0
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r1.get(r4)
                return r1
            L14:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                r1.<init>()
                throw r1
            L1a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "getRepeatedField() can only be called on repeated fields."
                r0.<init>(r1)
                throw r0
        }

        public int getRepeatedFieldCount(T r3) {
                r2 = this;
                boolean r0 = r3.isRepeated()
                if (r0 == 0) goto L16
                java.lang.Object r0 = r2.getFieldAllowBuilders(r3)
                if (r0 != 0) goto Le
                r1 = 0
                return r1
            Le:
                r1 = r0
                java.util.List r1 = (java.util.List) r1
                int r1 = r1.size()
                return r1
            L16:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "getRepeatedFieldCount() can only be called on repeated fields."
                r0.<init>(r1)
                throw r0
        }

        public boolean hasField(T r3) {
                r2 = this;
                boolean r0 = r3.isRepeated()
                if (r0 != 0) goto L12
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
                java.lang.Object r0 = r0.get(r3)
                if (r0 == 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
            L12:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "hasField() can only be called on non-repeated fields."
                r0.<init>(r1)
                throw r0
        }

        public boolean isInitialized() {
                r4 = this;
                r0 = 0
            L1:
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r4.fields
                int r1 = r1.getNumArrayEntries()
                r2 = 0
                if (r0 >= r1) goto L1a
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r4.fields
                java.util.Map$Entry r1 = r1.getArrayEntryAt(r0)
                boolean r1 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$600(r1)
                if (r1 != 0) goto L17
                return r2
            L17:
                int r0 = r0 + 1
                goto L1
            L1a:
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r4.fields
                java.lang.Iterable r0 = r0.getOverflowEntries()
                java.util.Iterator r0 = r0.iterator()
            L24:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L38
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                boolean r3 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$600(r1)
                if (r3 != 0) goto L37
                return r2
            L37:
                goto L24
            L38:
                r0 = 1
                return r0
        }

        public void mergeFrom(com.google.crypto.tink.shaded.protobuf.FieldSet<T> r3) {
                r2 = this;
                r2.ensureIsMutable()
                r0 = 0
            L4:
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$400(r3)
                int r1 = r1.getNumArrayEntries()
                if (r0 >= r1) goto L1c
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$400(r3)
                java.util.Map$Entry r1 = r1.getArrayEntryAt(r0)
                r2.mergeFromField(r1)
                int r0 = r0 + 1
                goto L4
            L1c:
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.access$400(r3)
                java.lang.Iterable r0 = r0.getOverflowEntries()
                java.util.Iterator r0 = r0.iterator()
            L28:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L38
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                r2.mergeFromField(r1)
                goto L28
            L38:
                return
        }

        public void setField(T r7, java.lang.Object r8) {
                r6 = this;
                r6.ensureIsMutable()
                boolean r0 = r7.isRepeated()
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L41
                boolean r0 = r8 instanceof java.util.List
                if (r0 == 0) goto L39
                java.util.ArrayList r0 = new java.util.ArrayList
                r3 = r8
                java.util.List r3 = (java.util.List) r3
                r0.<init>(r3)
                java.util.Iterator r3 = r0.iterator()
            L1b:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L37
                java.lang.Object r4 = r3.next()
                r6.verifyType(r7, r4)
                boolean r5 = r6.hasNestedBuilders
                if (r5 != 0) goto L33
                boolean r5 = r4 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
                if (r5 == 0) goto L31
                goto L33
            L31:
                r5 = r1
                goto L34
            L33:
                r5 = r2
            L34:
                r6.hasNestedBuilders = r5
                goto L1b
            L37:
                r8 = r0
                goto L44
            L39:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Wrong object type used with protocol message reflection."
                r0.<init>(r1)
                throw r0
            L41:
                r6.verifyType(r7, r8)
            L44:
                boolean r0 = r8 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
                if (r0 == 0) goto L4a
                r6.hasLazyField = r2
            L4a:
                boolean r0 = r6.hasNestedBuilders
                if (r0 != 0) goto L52
                boolean r0 = r8 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
                if (r0 == 0) goto L53
            L52:
                r1 = r2
            L53:
                r6.hasNestedBuilders = r1
                com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r6.fields
                r0.put(r7, r8)
                return
        }

        public void setRepeatedField(T r3, int r4, java.lang.Object r5) {
                r2 = this;
                r2.ensureIsMutable()
                boolean r0 = r3.isRepeated()
                if (r0 == 0) goto L2d
                boolean r0 = r2.hasNestedBuilders
                if (r0 != 0) goto L14
                boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
                if (r0 == 0) goto L12
                goto L14
            L12:
                r0 = 0
                goto L15
            L14:
                r0 = 1
            L15:
                r2.hasNestedBuilders = r0
                java.lang.Object r0 = r2.getFieldAllowBuilders(r3)
                if (r0 == 0) goto L27
                r2.verifyType(r3, r5)
                r1 = r0
                java.util.List r1 = (java.util.List) r1
                r1.set(r4, r5)
                return
            L27:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                r1.<init>()
                throw r1
            L2d:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "getRepeatedField() can only be called on repeated fields."
                r0.<init>(r1)
                throw r0
        }
    }

    public interface FieldDescriptorLite<T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> extends java.lang.Comparable<T> {
        com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<?> getEnumType();

        com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType getLiteJavaType();

        com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType getLiteType();

        int getNumber();

        com.google.crypto.tink.shaded.protobuf.MessageLite.Builder internalMergeFrom(com.google.crypto.tink.shaded.protobuf.MessageLite.Builder r1, com.google.crypto.tink.shaded.protobuf.MessageLite r2);

        boolean isPacked();

        boolean isRepeated();
    }

    static {
            com.google.crypto.tink.shaded.protobuf.FieldSet r0 = new com.google.crypto.tink.shaded.protobuf.FieldSet
            r1 = 1
            r0.<init>(r1)
            com.google.crypto.tink.shaded.protobuf.FieldSet.DEFAULT_INSTANCE = r0
            return
    }

    private FieldSet() {
            r1 = this;
            r1.<init>()
            r0 = 16
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.newFieldMap(r0)
            r1.fields = r0
            return
    }

    private FieldSet(com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.fields = r1
            r0.makeImmutable()
            return
    }

    /* synthetic */ FieldSet(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1, com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private FieldSet(boolean r2) {
            r1 = this;
            r0 = 0
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.newFieldMap(r0)
            r1.<init>(r0)
            r1.makeImmutable()
            return
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.SmallSortedMap access$100(com.google.crypto.tink.shaded.protobuf.SmallSortedMap r1, boolean r2) {
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = cloneAllFieldsMap(r1, r2)
            return r0
    }

    static /* synthetic */ boolean access$300(com.google.crypto.tink.shaded.protobuf.FieldSet r1) {
            boolean r0 = r1.hasLazyField
            return r0
    }

    static /* synthetic */ boolean access$302(com.google.crypto.tink.shaded.protobuf.FieldSet r0, boolean r1) {
            r0.hasLazyField = r1
            return r1
    }

    static /* synthetic */ com.google.crypto.tink.shaded.protobuf.SmallSortedMap access$400(com.google.crypto.tink.shaded.protobuf.FieldSet r1) {
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
            return r0
    }

    static /* synthetic */ boolean access$500(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r1, java.lang.Object r2) {
            boolean r0 = isValidType(r1, r2)
            return r0
    }

    static /* synthetic */ boolean access$600(java.util.Map.Entry r1) {
            boolean r0 = isInitialized(r1)
            return r0
    }

    static /* synthetic */ java.lang.Object access$700(java.lang.Object r1) {
            java.lang.Object r0 = cloneIfMutable(r1)
            return r0
    }

    private static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> cloneAllFieldsMap(com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T, java.lang.Object> r3, boolean r4) {
            r0 = 16
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = com.google.crypto.tink.shaded.protobuf.SmallSortedMap.newFieldMap(r0)
            r1 = 0
        L7:
            int r2 = r3.getNumArrayEntries()
            if (r1 >= r2) goto L17
            java.util.Map$Entry r2 = r3.getArrayEntryAt(r1)
            cloneFieldEntry(r0, r2, r4)
            int r1 = r1 + 1
            goto L7
        L17:
            java.lang.Iterable r1 = r3.getOverflowEntries()
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            cloneFieldEntry(r0, r2, r4)
            goto L1f
        L2f:
            return r0
    }

    private static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> void cloneFieldEntry(java.util.Map<T, java.lang.Object> r4, java.util.Map.Entry<T, java.lang.Object> r5, boolean r6) {
            java.lang.Object r0 = r5.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r0 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r0
            java.lang.Object r1 = r5.getValue()
            boolean r2 = r1 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r2 == 0) goto L19
            r2 = r1
            com.google.crypto.tink.shaded.protobuf.LazyField r2 = (com.google.crypto.tink.shaded.protobuf.LazyField) r2
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r2.getValue()
            r4.put(r0, r2)
            goto L2e
        L19:
            if (r6 == 0) goto L2b
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L2b
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = r1
            java.util.List r3 = (java.util.List) r3
            r2.<init>(r3)
            r4.put(r0, r2)
            goto L2e
        L2b:
            r4.put(r0, r1)
        L2e:
            return
    }

    private static java.lang.Object cloneIfMutable(java.lang.Object r4) {
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L10
            r0 = r4
            byte[] r0 = (byte[]) r0
            int r1 = r0.length
            byte[] r1 = new byte[r1]
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            return r1
        L10:
            return r4
    }

    static int computeElementSize(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r2, int r3, java.lang.Object r4) {
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r3)
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP
            if (r2 != r1) goto La
            int r0 = r0 * 2
        La:
            int r1 = computeElementSizeNoTag(r2, r4)
            int r1 = r1 + r0
            return r1
    }

    static int computeElementSizeNoTag(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r2, java.lang.Object r3) {
            int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L103;
                case 2: goto Lf7;
                case 3: goto Leb;
                case 4: goto Ldf;
                case 5: goto Ld3;
                case 6: goto Lc7;
                case 7: goto Lbb;
                case 8: goto Laf;
                case 9: goto La7;
                case 10: goto L93;
                case 11: goto L7f;
                case 12: goto L6b;
                case 13: goto L5f;
                case 14: goto L53;
                case 15: goto L47;
                case 16: goto L3b;
                case 17: goto L2f;
                case 18: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "There is no way to get here, but the compiler thinks otherwise."
            r0.<init>(r1)
            throw r0
        L13:
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
            if (r0 == 0) goto L23
            r0 = r3
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLite r0 = (com.google.crypto.tink.shaded.protobuf.Internal.EnumLite) r0
            int r0 = r0.getNumber()
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSizeNoTag(r0)
            return r0
        L23:
            r0 = r3
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeEnumSizeNoTag(r0)
            return r0
        L2f:
            r0 = r3
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt64SizeNoTag(r0)
            return r0
        L3b:
            r0 = r3
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSInt32SizeNoTag(r0)
            return r0
        L47:
            r0 = r3
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed64SizeNoTag(r0)
            return r0
        L53:
            r0 = r3
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeSFixed32SizeNoTag(r0)
            return r0
        L5f:
            r0 = r3
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r0)
            return r0
        L6b:
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r0 == 0) goto L77
            r0 = r3
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = (com.google.crypto.tink.shaded.protobuf.ByteString) r0
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSizeNoTag(r0)
            return r0
        L77:
            r0 = r3
            byte[] r0 = (byte[]) r0
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeByteArraySizeNoTag(r0)
            return r0
        L7f:
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r0 == 0) goto L8b
            r0 = r3
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = (com.google.crypto.tink.shaded.protobuf.ByteString) r0
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBytesSizeNoTag(r0)
            return r0
        L8b:
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeStringSizeNoTag(r0)
            return r0
        L93:
            boolean r0 = r3 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r0 == 0) goto L9f
            r0 = r3
            com.google.crypto.tink.shaded.protobuf.LazyField r0 = (com.google.crypto.tink.shaded.protobuf.LazyField) r0
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLazyFieldSizeNoTag(r0)
            return r0
        L9f:
            r0 = r3
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeMessageSizeNoTag(r0)
            return r0
        La7:
            r0 = r3
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeGroupSizeNoTag(r0)
            return r0
        Laf:
            r0 = r3
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeBoolSizeNoTag(r0)
            return r0
        Lbb:
            r0 = r3
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed32SizeNoTag(r0)
            return r0
        Lc7:
            r0 = r3
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFixed64SizeNoTag(r0)
            return r0
        Ld3:
            r0 = r3
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt32SizeNoTag(r0)
            return r0
        Ldf:
            r0 = r3
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt64SizeNoTag(r0)
            return r0
        Leb:
            r0 = r3
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeInt64SizeNoTag(r0)
            return r0
        Lf7:
            r0 = r3
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeFloatSizeNoTag(r0)
            return r0
        L103:
            r0 = r3
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            int r0 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeDoubleSizeNoTag(r0)
            return r0
    }

    public static int computeFieldSize(com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<?> r6, java.lang.Object r7) {
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r6.getLiteType()
            int r1 = r6.getNumber()
            boolean r2 = r6.isRepeated()
            if (r2 == 0) goto L51
            boolean r2 = r6.isPacked()
            if (r2 == 0) goto L38
            r2 = 0
            r3 = r7
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L1c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2c
            java.lang.Object r4 = r3.next()
            int r5 = computeElementSizeNoTag(r0, r4)
            int r2 = r2 + r5
            goto L1c
        L2c:
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeTagSize(r1)
            int r3 = r3 + r2
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r2)
            int r3 = r3 + r4
            return r3
        L38:
            r2 = 0
            r3 = r7
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L40:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L50
            java.lang.Object r4 = r3.next()
            int r5 = computeElementSize(r0, r1, r4)
            int r2 = r2 + r5
            goto L40
        L50:
            return r2
        L51:
            int r2 = computeElementSize(r0, r1, r7)
            return r2
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> com.google.crypto.tink.shaded.protobuf.FieldSet<T> emptySet() {
            com.google.crypto.tink.shaded.protobuf.FieldSet r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.DEFAULT_INSTANCE
            return r0
    }

    private int getMessageSetSerializedSize(java.util.Map.Entry<T, java.lang.Object> r5) {
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r0 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r0
            java.lang.Object r1 = r5.getValue()
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = r0.getLiteJavaType()
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
            if (r2 != r3) goto L48
            boolean r2 = r0.isRepeated()
            if (r2 != 0) goto L48
            boolean r2 = r0.isPacked()
            if (r2 != 0) goto L48
            boolean r2 = r1 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r2 == 0) goto L35
        L23:
            java.lang.Object r2 = r5.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r2 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r2
            int r2 = r2.getNumber()
            r3 = r1
            com.google.crypto.tink.shaded.protobuf.LazyField r3 = (com.google.crypto.tink.shaded.protobuf.LazyField) r3
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeLazyFieldMessageSetExtensionSize(r2, r3)
            return r2
        L35:
            java.lang.Object r2 = r5.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r2 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r2
            int r2 = r2.getNumber()
            r3 = r1
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            int r2 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.computeMessageSetExtensionSize(r2, r3)
            return r2
        L48:
            int r2 = computeFieldSize(r0, r1)
            return r2
    }

    static int getWireFormatForFieldType(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r1, boolean r2) {
            if (r2 == 0) goto L4
            r0 = 2
            return r0
        L4:
            int r0 = r1.getWireType()
            return r0
    }

    private static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> boolean isInitialized(java.util.Map.Entry<T, java.lang.Object> r4) {
            java.lang.Object r0 = r4.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r0 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r0
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = r0.getLiteJavaType()
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
            if (r1 != r2) goto L3b
            boolean r1 = r0.isRepeated()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r4.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            boolean r3 = isMessageFieldValueInitialized(r2)
            if (r3 != 0) goto L30
            r1 = 0
            return r1
        L30:
            goto L1e
        L31:
            goto L3b
        L32:
            java.lang.Object r1 = r4.getValue()
            boolean r1 = isMessageFieldValueInitialized(r1)
            return r1
        L3b:
            r1 = 1
            return r1
    }

    private static boolean isMessageFieldValueInitialized(java.lang.Object r2) {
            boolean r0 = r2 instanceof com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
            if (r0 == 0) goto Lc
            r0 = r2
            com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder r0 = (com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder) r0
            boolean r0 = r0.isInitialized()
            return r0
        Lc:
            boolean r0 = r2 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Wrong object type used with protocol message reflection."
            r0.<init>(r1)
            throw r0
    }

    private static boolean isValidType(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r3, java.lang.Object r4) {
            com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(r4)
            int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = r3.getJavaType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L45;
                case 2: goto L42;
                case 3: goto L3f;
                case 4: goto L3c;
                case 5: goto L39;
                case 6: goto L36;
                case 7: goto L2b;
                case 8: goto L20;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            return r2
        L15:
            boolean r0 = r4 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite
            if (r0 != 0) goto L1f
            boolean r0 = r4 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r0 == 0) goto L1e
            goto L1f
        L1e:
            r1 = r2
        L1f:
            return r1
        L20:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L2a
            boolean r0 = r4 instanceof com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
            if (r0 == 0) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            return r1
        L2b:
            boolean r0 = r4 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r0 != 0) goto L35
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L34
            goto L35
        L34:
            r1 = r2
        L35:
            return r1
        L36:
            boolean r0 = r4 instanceof java.lang.String
            return r0
        L39:
            boolean r0 = r4 instanceof java.lang.Boolean
            return r0
        L3c:
            boolean r0 = r4 instanceof java.lang.Double
            return r0
        L3f:
            boolean r0 = r4 instanceof java.lang.Float
            return r0
        L42:
            boolean r0 = r4 instanceof java.lang.Long
            return r0
        L45:
            boolean r0 = r4 instanceof java.lang.Integer
            return r0
    }

    private void mergeFromField(java.util.Map.Entry<T, java.lang.Object> r8) {
            r7 = this;
            java.lang.Object r0 = r8.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r0 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r0
            java.lang.Object r1 = r8.getValue()
            boolean r2 = r1 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r2 == 0) goto L15
            r2 = r1
            com.google.crypto.tink.shaded.protobuf.LazyField r2 = (com.google.crypto.tink.shaded.protobuf.LazyField) r2
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r2.getValue()
        L15:
            boolean r2 = r0.isRepeated()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r7.getField(r0)
            if (r2 != 0) goto L27
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2 = r3
        L27:
            r3 = r1
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L2e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r3.next()
            r5 = r2
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = cloneIfMutable(r4)
            r5.add(r6)
            goto L2e
        L43:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r3 = r7.fields
            r3.put(r0, r2)
            goto L82
        L49:
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = r0.getLiteJavaType()
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r3 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
            if (r2 != r3) goto L79
            java.lang.Object r2 = r7.getField(r0)
            if (r2 != 0) goto L61
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r3 = r7.fields
            java.lang.Object r4 = cloneIfMutable(r1)
            r3.put(r0, r4)
            goto L78
        L61:
            r3 = r2
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r3 = r3.toBuilder()
            r4 = r1
            com.google.crypto.tink.shaded.protobuf.MessageLite r4 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r4
            com.google.crypto.tink.shaded.protobuf.MessageLite$Builder r3 = r0.internalMergeFrom(r3, r4)
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r3.build()
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r3 = r7.fields
            r3.put(r0, r2)
        L78:
            goto L82
        L79:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r7.fields
            java.lang.Object r3 = cloneIfMutable(r1)
            r2.put(r0, r3)
        L82:
            return
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> com.google.crypto.tink.shaded.protobuf.FieldSet.Builder<T> newBuilder() {
            com.google.crypto.tink.shaded.protobuf.FieldSet$Builder r0 = new com.google.crypto.tink.shaded.protobuf.FieldSet$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public static <T extends com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<T>> com.google.crypto.tink.shaded.protobuf.FieldSet<T> newFieldSet() {
            com.google.crypto.tink.shaded.protobuf.FieldSet r0 = new com.google.crypto.tink.shaded.protobuf.FieldSet
            r0.<init>()
            return r0
    }

    public static java.lang.Object readPrimitiveField(com.google.crypto.tink.shaded.protobuf.CodedInputStream r1, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r2, boolean r3) throws java.io.IOException {
            if (r3 == 0) goto L9
            com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.STRICT
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.readPrimitiveField(r1, r2, r0)
            return r0
        L9:
            com.google.crypto.tink.shaded.protobuf.WireFormat$Utf8Validation r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.Utf8Validation.LOOSE
            java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.readPrimitiveField(r1, r2, r0)
            return r0
    }

    private void verifyType(T r5, java.lang.Object r6) {
            r4 = this;
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r5.getLiteType()
            boolean r0 = isValidType(r0, r6)
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r5.getNumber()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r2 = r5.getLiteType()
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = r2.getJavaType()
            java.lang.Class r3 = r6.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r2 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    static void writeElement(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r1, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r2, int r3, java.lang.Object r4) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP
            if (r2 != r0) goto Lb
            r0 = r4
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
            r1.writeGroup(r3, r0)
            goto L16
        Lb:
            r0 = 0
            int r0 = getWireFormatForFieldType(r2, r0)
            r1.writeTag(r3, r0)
            writeElementNoTag(r1, r2, r4)
        L16:
            return
    }

    static void writeElementNoTag(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r2, com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r3, java.lang.Object r4) throws java.io.IOException {
            int[] r0 = com.google.crypto.tink.shaded.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto Le7;
                case 2: goto Ldc;
                case 3: goto Ld1;
                case 4: goto Lc6;
                case 5: goto Lbb;
                case 6: goto Lb0;
                case 7: goto La5;
                case 8: goto L9a;
                case 9: goto L93;
                case 10: goto L8c;
                case 11: goto L79;
                case 12: goto L65;
                case 13: goto L59;
                case 14: goto L4d;
                case 15: goto L41;
                case 16: goto L35;
                case 17: goto L29;
                case 18: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto Lf2
        Ld:
            boolean r0 = r4 instanceof com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
            if (r0 == 0) goto L1d
            r0 = r4
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLite r0 = (com.google.crypto.tink.shaded.protobuf.Internal.EnumLite) r0
            int r0 = r0.getNumber()
            r2.writeEnumNoTag(r0)
            goto Lf2
        L1d:
            r0 = r4
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.writeEnumNoTag(r0)
            goto Lf2
        L29:
            r0 = r4
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2.writeSInt64NoTag(r0)
            goto Lf2
        L35:
            r0 = r4
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.writeSInt32NoTag(r0)
            goto Lf2
        L41:
            r0 = r4
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2.writeSFixed64NoTag(r0)
            goto Lf2
        L4d:
            r0 = r4
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.writeSFixed32NoTag(r0)
            goto Lf2
        L59:
            r0 = r4
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.writeUInt32NoTag(r0)
            goto Lf2
        L65:
            boolean r0 = r4 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r0 == 0) goto L71
            r0 = r4
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = (com.google.crypto.tink.shaded.protobuf.ByteString) r0
            r2.writeBytesNoTag(r0)
            goto Lf2
        L71:
            r0 = r4
            byte[] r0 = (byte[]) r0
            r2.writeByteArrayNoTag(r0)
            goto Lf2
        L79:
            boolean r0 = r4 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r0 == 0) goto L85
            r0 = r4
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = (com.google.crypto.tink.shaded.protobuf.ByteString) r0
            r2.writeBytesNoTag(r0)
            goto Lf2
        L85:
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0
            r2.writeStringNoTag(r0)
            goto Lf2
        L8c:
            r0 = r4
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
            r2.writeMessageNoTag(r0)
            goto Lf2
        L93:
            r0 = r4
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
            r2.writeGroupNoTag(r0)
            goto Lf2
        L9a:
            r0 = r4
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2.writeBoolNoTag(r0)
            goto Lf2
        La5:
            r0 = r4
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.writeFixed32NoTag(r0)
            goto Lf2
        Lb0:
            r0 = r4
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2.writeFixed64NoTag(r0)
            goto Lf2
        Lbb:
            r0 = r4
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.writeInt32NoTag(r0)
            goto Lf2
        Lc6:
            r0 = r4
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2.writeUInt64NoTag(r0)
            goto Lf2
        Ld1:
            r0 = r4
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r2.writeInt64NoTag(r0)
            goto Lf2
        Ldc:
            r0 = r4
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r2.writeFloatNoTag(r0)
            goto Lf2
        Le7:
            r0 = r4
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            r2.writeDoubleNoTag(r0)
        Lf2:
            return
    }

    public static void writeField(com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite<?> r7, java.lang.Object r8, com.google.crypto.tink.shaded.protobuf.CodedOutputStream r9) throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r0 = r7.getLiteType()
            int r1 = r7.getNumber()
            boolean r2 = r7.isRepeated()
            if (r2 == 0) goto L59
            r2 = r8
            java.util.List r2 = (java.util.List) r2
            boolean r3 = r7.isPacked()
            if (r3 == 0) goto L46
            r3 = 2
            r9.writeTag(r1, r3)
            r3 = 0
            java.util.Iterator r4 = r2.iterator()
        L20:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L30
            java.lang.Object r5 = r4.next()
            int r6 = computeElementSizeNoTag(r0, r5)
            int r3 = r3 + r6
            goto L20
        L30:
            r9.writeUInt32NoTag(r3)
            java.util.Iterator r4 = r2.iterator()
        L37:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L45
            java.lang.Object r5 = r4.next()
            writeElementNoTag(r9, r0, r5)
            goto L37
        L45:
            goto L58
        L46:
            java.util.Iterator r3 = r2.iterator()
        L4a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L58
            java.lang.Object r4 = r3.next()
            writeElement(r9, r0, r1, r4)
            goto L4a
        L58:
            goto L6b
        L59:
            boolean r2 = r8 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r2 == 0) goto L68
            r2 = r8
            com.google.crypto.tink.shaded.protobuf.LazyField r2 = (com.google.crypto.tink.shaded.protobuf.LazyField) r2
            com.google.crypto.tink.shaded.protobuf.MessageLite r2 = r2.getValue()
            writeElement(r9, r0, r1, r2)
            goto L6b
        L68:
            writeElement(r9, r0, r1, r8)
        L6b:
            return
    }

    private void writeMessageSetTo(java.util.Map.Entry<T, java.lang.Object> r5, com.google.crypto.tink.shaded.protobuf.CodedOutputStream r6) throws java.io.IOException {
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r0 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r0
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r1 = r0.getLiteJavaType()
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = com.google.crypto.tink.shaded.protobuf.WireFormat.JavaType.MESSAGE
            if (r1 != r2) goto L3a
            boolean r1 = r0.isRepeated()
            if (r1 != 0) goto L3a
            boolean r1 = r0.isPacked()
            if (r1 != 0) goto L3a
            java.lang.Object r1 = r5.getValue()
            boolean r2 = r1 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r2 == 0) goto L29
            r2 = r1
            com.google.crypto.tink.shaded.protobuf.LazyField r2 = (com.google.crypto.tink.shaded.protobuf.LazyField) r2
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r2.getValue()
        L29:
            java.lang.Object r2 = r5.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r2 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r2
            int r2 = r2.getNumber()
            r3 = r1
            com.google.crypto.tink.shaded.protobuf.MessageLite r3 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r3
            r6.writeMessageSetExtension(r2, r3)
            goto L41
        L3a:
            java.lang.Object r1 = r5.getValue()
            writeField(r0, r1, r6)
        L41:
            return
    }

    public void addRepeatedField(T r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r4.isRepeated()
            if (r0 == 0) goto L21
            r3.verifyType(r4, r5)
            java.lang.Object r0 = r3.getField(r4)
            if (r0 != 0) goto L1a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r3.fields
            r2.put(r4, r1)
            goto L1d
        L1a:
            r1 = r0
            java.util.List r1 = (java.util.List) r1
        L1d:
            r1.add(r5)
            return
        L21:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "addRepeatedField() can only be called on repeated fields."
            r0.<init>(r1)
            throw r0
    }

    public void clear() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
            r0.clear()
            r0 = 0
            r1.hasLazyField = r0
            return
    }

    public void clearField(T r2) {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
            r0.remove(r2)
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            r0 = 0
            r1.hasLazyField = r0
        L10:
            return
    }

    public com.google.crypto.tink.shaded.protobuf.FieldSet<T> clone() {
            r5 = this;
            com.google.crypto.tink.shaded.protobuf.FieldSet r0 = newFieldSet()
            r1 = 0
        L5:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r5.fields
            int r2 = r2.getNumArrayEntries()
            if (r1 >= r2) goto L23
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r5.fields
            java.util.Map$Entry r2 = r2.getArrayEntryAt(r1)
            java.lang.Object r3 = r2.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r3 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r3
            java.lang.Object r4 = r2.getValue()
            r0.setField(r3, r4)
            int r1 = r1 + 1
            goto L5
        L23:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r5.fields
            java.lang.Iterable r1 = r1.getOverflowEntries()
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r3 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r3
            java.lang.Object r4 = r2.getValue()
            r0.setField(r3, r4)
            goto L2d
        L47:
            boolean r1 = r5.hasLazyField
            r0.hasLazyField = r1
            return r0
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m146clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.FieldSet r0 = r1.clone()
            return r0
    }

    java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> descendingIterator() {
            r2 = this;
            boolean r0 = r2.hasLazyField
            if (r0 == 0) goto L14
            com.google.crypto.tink.shaded.protobuf.LazyField$LazyIterator r0 = new com.google.crypto.tink.shaded.protobuf.LazyField$LazyIterator
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r2.fields
            java.util.Set r1 = r1.descendingEntrySet()
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1)
            return r0
        L14:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
            java.util.Set r0 = r0.descendingEntrySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r0 = 1
            return r0
        L4:
            boolean r0 = r4 instanceof com.google.crypto.tink.shaded.protobuf.FieldSet
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            r0 = r4
            com.google.crypto.tink.shaded.protobuf.FieldSet r0 = (com.google.crypto.tink.shaded.protobuf.FieldSet) r0
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r0.fields
            boolean r1 = r1.equals(r2)
            return r1
    }

    public java.util.Map<T, java.lang.Object> getAllFields() {
            r2 = this;
            boolean r0 = r2.hasLazyField
            if (r0 == 0) goto L17
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
            r1 = 0
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap r0 = cloneAllFieldsMap(r0, r1)
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r2.fields
            boolean r1 = r1.isImmutable()
            if (r1 == 0) goto L16
            r0.makeImmutable()
        L16:
            return r0
        L17:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
            boolean r0 = r0.isImmutable()
            if (r0 == 0) goto L22
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
            goto L28
        L22:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
        L28:
            return r0
    }

    public java.lang.Object getField(T r3) {
            r2 = this;
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
            java.lang.Object r0 = r0.get(r3)
            boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r1 == 0) goto L12
            r1 = r0
            com.google.crypto.tink.shaded.protobuf.LazyField r1 = (com.google.crypto.tink.shaded.protobuf.LazyField) r1
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r1.getValue()
            return r1
        L12:
            return r0
    }

    public int getMessageSetSerializedSize() {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r4.fields
            int r2 = r2.getNumArrayEntries()
            if (r1 >= r2) goto L18
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r4.fields
            java.util.Map$Entry r2 = r2.getArrayEntryAt(r1)
            int r2 = r4.getMessageSetSerializedSize(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L18:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r4.fields
            java.lang.Iterable r1 = r1.getOverflowEntries()
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            int r3 = r4.getMessageSetSerializedSize(r2)
            int r0 = r0 + r3
            goto L22
        L34:
            return r0
    }

    public java.lang.Object getRepeatedField(T r3, int r4) {
            r2 = this;
            boolean r0 = r3.isRepeated()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r2.getField(r3)
            if (r0 == 0) goto L14
            r1 = r0
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r1.get(r4)
            return r1
        L14:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
        L1a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "getRepeatedField() can only be called on repeated fields."
            r0.<init>(r1)
            throw r0
    }

    public int getRepeatedFieldCount(T r3) {
            r2 = this;
            boolean r0 = r3.isRepeated()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.getField(r3)
            if (r0 != 0) goto Le
            r1 = 0
            return r1
        Le:
            r1 = r0
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            return r1
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "getRepeatedField() can only be called on repeated fields."
            r0.<init>(r1)
            throw r0
    }

    public int getSerializedSize() {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r5.fields
            int r2 = r2.getNumArrayEntries()
            if (r1 >= r2) goto L22
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r2 = r5.fields
            java.util.Map$Entry r2 = r2.getArrayEntryAt(r1)
            java.lang.Object r3 = r2.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r3 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r3
            java.lang.Object r4 = r2.getValue()
            int r3 = computeFieldSize(r3, r4)
            int r0 = r0 + r3
            int r1 = r1 + 1
            goto L2
        L22:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r5.fields
            java.lang.Iterable r1 = r1.getOverflowEntries()
            java.util.Iterator r1 = r1.iterator()
        L2c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r3 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r3
            java.lang.Object r4 = r2.getValue()
            int r3 = computeFieldSize(r3, r4)
            int r0 = r0 + r3
            goto L2c
        L48:
            return r0
    }

    public boolean hasField(T r3) {
            r2 = this;
            boolean r0 = r3.isRepeated()
            if (r0 != 0) goto L12
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "hasField() can only be called on non-repeated fields."
            r0.<init>(r1)
            throw r0
    }

    public int hashCode() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
            int r0 = r0.hashCode()
            return r0
    }

    boolean isEmpty() {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r1.fields
            boolean r0 = r0.isEmpty()
            return r0
    }

    public boolean isImmutable() {
            r1 = this;
            boolean r0 = r1.isImmutable
            return r0
    }

    public boolean isInitialized() {
            r4 = this;
            r0 = 0
        L1:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r4.fields
            int r1 = r1.getNumArrayEntries()
            r2 = 0
            if (r0 >= r1) goto L1a
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r4.fields
            java.util.Map$Entry r1 = r1.getArrayEntryAt(r0)
            boolean r1 = isInitialized(r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r0 = r0 + 1
            goto L1
        L1a:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r4.fields
            java.lang.Iterable r0 = r0.getOverflowEntries()
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            boolean r3 = isInitialized(r1)
            if (r3 != 0) goto L37
            return r2
        L37:
            goto L24
        L38:
            r0 = 1
            return r0
    }

    public java.util.Iterator<java.util.Map.Entry<T, java.lang.Object>> iterator() {
            r2 = this;
            boolean r0 = r2.hasLazyField
            if (r0 == 0) goto L14
            com.google.crypto.tink.shaded.protobuf.LazyField$LazyIterator r0 = new com.google.crypto.tink.shaded.protobuf.LazyField$LazyIterator
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r2.fields
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1)
            return r0
        L14:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public void makeImmutable() {
            r3 = this;
            boolean r0 = r3.isImmutable
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
        L6:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
            int r1 = r1.getNumArrayEntries()
            if (r0 >= r1) goto L28
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
            java.util.Map$Entry r1 = r1.getArrayEntryAt(r0)
            java.lang.Object r2 = r1.getValue()
            boolean r2 = r2 instanceof com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.getValue()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r2
            r2.makeImmutable()
        L25:
            int r0 = r0 + 1
            goto L6
        L28:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r3.fields
            r0.makeImmutable()
            r0 = 1
            r3.isImmutable = r0
            return
    }

    public void mergeFrom(com.google.crypto.tink.shaded.protobuf.FieldSet<T> r3) {
            r2 = this;
            r0 = 0
        L1:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
            int r1 = r1.getNumArrayEntries()
            if (r0 >= r1) goto L15
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r3.fields
            java.util.Map$Entry r1 = r1.getArrayEntryAt(r0)
            r2.mergeFromField(r1)
            int r0 = r0 + 1
            goto L1
        L15:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r3.fields
            java.lang.Iterable r0 = r0.getOverflowEntries()
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r2.mergeFromField(r1)
            goto L1f
        L2f:
            return
    }

    public void setField(T r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r4.isRepeated()
            if (r0 == 0) goto L31
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L29
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r5
            java.util.List r1 = (java.util.List) r1
            r0.addAll(r1)
            java.util.Iterator r1 = r0.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            r3.verifyType(r4, r2)
            goto L19
        L27:
            r5 = r0
            goto L34
        L29:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Wrong object type used with protocol message reflection."
            r0.<init>(r1)
            throw r0
        L31:
            r3.verifyType(r4, r5)
        L34:
            boolean r0 = r5 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r0 == 0) goto L3b
            r0 = 1
            r3.hasLazyField = r0
        L3b:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r3.fields
            r0.put(r4, r5)
            return
    }

    public void setRepeatedField(T r3, int r4, java.lang.Object r5) {
            r2 = this;
            boolean r0 = r3.isRepeated()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r2.getField(r3)
            if (r0 == 0) goto L16
            r2.verifyType(r3, r5)
            r1 = r0
            java.util.List r1 = (java.util.List) r1
            r1.set(r4, r5)
            return
        L16:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
        L1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "getRepeatedField() can only be called on repeated fields."
            r0.<init>(r1)
            throw r0
    }

    public void writeMessageSetTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
        L1:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r2.fields
            int r1 = r1.getNumArrayEntries()
            if (r0 >= r1) goto L15
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r2.fields
            java.util.Map$Entry r1 = r1.getArrayEntryAt(r0)
            r2.writeMessageSetTo(r1, r3)
            int r0 = r0 + 1
            goto L1
        L15:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r2.fields
            java.lang.Iterable r0 = r0.getOverflowEntries()
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r2.writeMessageSetTo(r1, r3)
            goto L1f
        L2f:
            return
    }

    public void writeTo(com.google.crypto.tink.shaded.protobuf.CodedOutputStream r5) throws java.io.IOException {
            r4 = this;
            r0 = 0
        L1:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r4.fields
            int r1 = r1.getNumArrayEntries()
            if (r0 >= r1) goto L1f
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r1 = r4.fields
            java.util.Map$Entry r1 = r1.getArrayEntryAt(r0)
            java.lang.Object r2 = r1.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r2 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r2
            java.lang.Object r3 = r1.getValue()
            writeField(r2, r3, r5)
            int r0 = r0 + 1
            goto L1
        L1f:
            com.google.crypto.tink.shaded.protobuf.SmallSortedMap<T extends com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite<T>, java.lang.Object> r0 = r4.fields
            java.lang.Iterable r0 = r0.getOverflowEntries()
            java.util.Iterator r0 = r0.iterator()
        L29:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.crypto.tink.shaded.protobuf.FieldSet$FieldDescriptorLite r2 = (com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite) r2
            java.lang.Object r3 = r1.getValue()
            writeField(r2, r3, r5)
            goto L29
        L43:
            return
    }
}
