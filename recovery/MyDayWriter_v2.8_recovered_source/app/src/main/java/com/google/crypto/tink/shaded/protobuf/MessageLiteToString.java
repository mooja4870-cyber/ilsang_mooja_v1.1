package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class MessageLiteToString {
    private static final java.lang.String BUILDER_LIST_SUFFIX = "OrBuilderList";
    private static final java.lang.String BYTES_SUFFIX = "Bytes";
    private static final char[] INDENT_BUFFER = null;
    private static final java.lang.String LIST_SUFFIX = "List";
    private static final java.lang.String MAP_SUFFIX = "Map";

    static {
            r0 = 80
            char[] r0 = new char[r0]
            com.google.crypto.tink.shaded.protobuf.MessageLiteToString.INDENT_BUFFER = r0
            char[] r0 = com.google.crypto.tink.shaded.protobuf.MessageLiteToString.INDENT_BUFFER
            r1 = 32
            java.util.Arrays.fill(r0, r1)
            return
    }

    private MessageLiteToString() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void indent(int r3, java.lang.StringBuilder r4) {
        L1:
            if (r3 <= 0) goto L14
            r0 = r3
            char[] r1 = com.google.crypto.tink.shaded.protobuf.MessageLiteToString.INDENT_BUFFER
            int r1 = r1.length
            if (r0 <= r1) goto Lc
            char[] r1 = com.google.crypto.tink.shaded.protobuf.MessageLiteToString.INDENT_BUFFER
            int r0 = r1.length
        Lc:
            char[] r1 = com.google.crypto.tink.shaded.protobuf.MessageLiteToString.INDENT_BUFFER
            r2 = 0
            r4.append(r1, r2, r0)
            int r3 = r3 - r0
            goto L1
        L14:
            return
    }

    private static boolean isDefaultValue(java.lang.Object r7) {
            boolean r0 = r7 instanceof java.lang.Boolean
            r1 = 1
            if (r0 == 0) goto Le
            r0 = r7
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r0 = r0 ^ r1
            return r0
        Le:
            boolean r0 = r7 instanceof java.lang.Integer
            r2 = 0
            if (r0 == 0) goto L1f
            r0 = r7
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L1d
            goto L1e
        L1d:
            r1 = r2
        L1e:
            return r1
        L1f:
            boolean r0 = r7 instanceof java.lang.Float
            if (r0 == 0) goto L33
            r0 = r7
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            if (r0 != 0) goto L31
            goto L32
        L31:
            r1 = r2
        L32:
            return r1
        L33:
            boolean r0 = r7 instanceof java.lang.Double
            if (r0 == 0) goto L4b
            r0 = r7
            java.lang.Double r0 = (java.lang.Double) r0
            double r3 = r0.doubleValue()
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L49
            goto L4a
        L49:
            r1 = r2
        L4a:
            return r1
        L4b:
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L56
            java.lang.String r0 = ""
            boolean r0 = r7.equals(r0)
            return r0
        L56:
            boolean r0 = r7 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r0 == 0) goto L61
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY
            boolean r0 = r7.equals(r0)
            return r0
        L61:
            boolean r0 = r7 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite
            if (r0 == 0) goto L71
            r0 = r7
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r0.getDefaultInstanceForType()
            if (r7 != r0) goto L6f
            goto L70
        L6f:
            r1 = r2
        L70:
            return r1
        L71:
            boolean r0 = r7 instanceof java.lang.Enum
            if (r0 == 0) goto L81
            r0 = r7
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r0 = r0.ordinal()
            if (r0 != 0) goto L7f
            goto L80
        L7f:
            r1 = r2
        L80:
            return r1
        L81:
            return r2
    }

    private static java.lang.String pascalCaseToSnakeCase(java.lang.String r4) {
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L7
            return r4
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            char r1 = r4.charAt(r1)
            char r1 = java.lang.Character.toLowerCase(r1)
            r0.append(r1)
            r1 = 1
        L19:
            int r2 = r4.length()
            if (r1 >= r2) goto L38
            char r2 = r4.charAt(r1)
            boolean r3 = java.lang.Character.isUpperCase(r2)
            if (r3 == 0) goto L2e
            java.lang.String r3 = "_"
            r0.append(r3)
        L2e:
            char r3 = java.lang.Character.toLowerCase(r2)
            r0.append(r3)
            int r1 = r1 + 1
            goto L19
        L38:
            java.lang.String r1 = r0.toString()
            return r1
    }

    static void printField(java.lang.StringBuilder r6, int r7, java.lang.String r8, java.lang.Object r9) {
            boolean r0 = r9 instanceof java.util.List
            if (r0 == 0) goto L1a
            r0 = r9
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r1 = r0.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r1.next()
            printField(r6, r7, r8, r2)
            goto Lb
        L19:
            return
        L1a:
            boolean r0 = r9 instanceof java.util.Map
            if (r0 == 0) goto L3a
            r0 = r9
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r1 = r0.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L29:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            printField(r6, r7, r8, r2)
            goto L29
        L39:
            return
        L3a:
            r0 = 10
            r6.append(r0)
            indent(r7, r6)
            java.lang.String r0 = pascalCaseToSnakeCase(r8)
            r6.append(r0)
            boolean r0 = r9 instanceof java.lang.String
            r1 = 34
            java.lang.String r2 = ": \""
            if (r0 == 0) goto L64
            java.lang.StringBuilder r0 = r6.append(r2)
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.google.crypto.tink.shaded.protobuf.TextFormatEscaper.escapeText(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            r0.append(r1)
            goto Lcd
        L64:
            boolean r0 = r9 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r0 == 0) goto L7b
            java.lang.StringBuilder r0 = r6.append(r2)
            r2 = r9
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = (com.google.crypto.tink.shaded.protobuf.ByteString) r2
            java.lang.String r2 = com.google.crypto.tink.shaded.protobuf.TextFormatEscaper.escapeBytes(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            r0.append(r1)
            goto Lcd
        L7b:
            boolean r0 = r9 instanceof com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
            java.lang.String r1 = "}"
            java.lang.String r2 = "\n"
            java.lang.String r3 = " {"
            if (r0 == 0) goto L9a
            r6.append(r3)
            r0 = r9
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r0
            int r3 = r7 + 2
            reflectivePrintWithIndent(r0, r6, r3)
            r6.append(r2)
            indent(r7, r6)
            r6.append(r1)
            goto Lcd
        L9a:
            boolean r0 = r9 instanceof java.util.Map.Entry
            if (r0 == 0) goto Lc4
            r6.append(r3)
            r0 = r9
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            int r3 = r7 + 2
            java.lang.String r4 = "key"
            java.lang.Object r5 = r0.getKey()
            printField(r6, r3, r4, r5)
            int r3 = r7 + 2
            java.lang.String r4 = "value"
            java.lang.Object r5 = r0.getValue()
            printField(r6, r3, r4, r5)
            r6.append(r2)
            indent(r7, r6)
            r6.append(r1)
            goto Lcd
        Lc4:
            java.lang.String r0 = ": "
            java.lang.StringBuilder r0 = r6.append(r0)
            r0.append(r9)
        Lcd:
            return
    }

    private static void reflectivePrintWithIndent(com.google.crypto.tink.shaded.protobuf.MessageLite r17, java.lang.StringBuilder r18, int r19) {
            r0 = r17
            r1 = r18
            r2 = r19
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.TreeMap r5 = new java.util.TreeMap
            r5.<init>()
            java.lang.Class r6 = r0.getClass()
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            int r7 = r6.length
            r9 = 0
        L1f:
            java.lang.String r10 = "get"
            java.lang.String r11 = "has"
            java.lang.String r12 = "set"
            r13 = 3
            if (r9 >= r7) goto L8b
            r14 = r6[r9]
            int r15 = r14.getModifiers()
            boolean r15 = java.lang.reflect.Modifier.isStatic(r15)
            if (r15 == 0) goto L35
            goto L88
        L35:
            java.lang.String r15 = r14.getName()
            int r15 = r15.length()
            if (r15 >= r13) goto L40
            goto L88
        L40:
            java.lang.String r13 = r14.getName()
            boolean r12 = r13.startsWith(r12)
            if (r12 == 0) goto L52
            java.lang.String r10 = r14.getName()
            r3.add(r10)
            goto L88
        L52:
            int r12 = r14.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isPublic(r12)
            if (r12 != 0) goto L5d
            goto L88
        L5d:
            java.lang.Class[] r12 = r14.getParameterTypes()
            int r12 = r12.length
            if (r12 == 0) goto L65
            goto L88
        L65:
            java.lang.String r12 = r14.getName()
            boolean r11 = r12.startsWith(r11)
            if (r11 == 0) goto L77
            java.lang.String r10 = r14.getName()
            r4.put(r10, r14)
            goto L88
        L77:
            java.lang.String r11 = r14.getName()
            boolean r10 = r11.startsWith(r10)
            if (r10 == 0) goto L88
            java.lang.String r10 = r14.getName()
            r5.put(r10, r14)
        L88:
            int r9 = r9 + 1
            goto L1f
        L8b:
            java.util.Set r6 = r5.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L93:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L1e3
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r9 = r7.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.substring(r13)
            java.lang.String r14 = "List"
            boolean r15 = r9.endsWith(r14)
            if (r15 == 0) goto Led
            java.lang.String r15 = "OrBuilderList"
            boolean r15 = r9.endsWith(r15)
            if (r15 != 0) goto Led
            boolean r15 = r9.equals(r14)
            if (r15 != 0) goto Led
            java.lang.Object r15 = r7.getValue()
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            if (r15 == 0) goto Led
            java.lang.Class r13 = r15.getReturnType()
            java.lang.Class<java.util.List> r8 = java.util.List.class
            boolean r8 = r13.equals(r8)
            if (r8 == 0) goto Led
        Ld4:
            int r8 = r9.length()
            int r13 = r14.length()
            int r8 = r8 - r13
            r13 = 0
            java.lang.String r8 = r9.substring(r13, r8)
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.lang.Object r13 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.invokeOrDie(r15, r0, r14)
            printField(r1, r2, r8, r13)
            r13 = 3
            goto L93
        Led:
            java.lang.String r8 = "Map"
            boolean r13 = r9.endsWith(r8)
            if (r13 == 0) goto L13c
            boolean r13 = r9.equals(r8)
            if (r13 != 0) goto L13c
            java.lang.Object r13 = r7.getValue()
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r13 == 0) goto L13c
            java.lang.Class r14 = r13.getReturnType()
            java.lang.Class<java.util.Map> r15 = java.util.Map.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L13c
            java.lang.Class<java.lang.Deprecated> r14 = java.lang.Deprecated.class
            boolean r14 = r13.isAnnotationPresent(r14)
            if (r14 != 0) goto L13c
            int r14 = r13.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isPublic(r14)
            if (r14 == 0) goto L13c
        L122:
            int r14 = r9.length()
            int r8 = r8.length()
            int r14 = r14 - r8
            r8 = 0
            java.lang.String r14 = r9.substring(r8, r14)
            java.lang.Object[] r15 = new java.lang.Object[r8]
            java.lang.Object r8 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.invokeOrDie(r13, r0, r15)
            printField(r1, r2, r14, r8)
            r13 = 3
            goto L93
        L13c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r8 = r8.append(r12)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            boolean r8 = r3.contains(r8)
            if (r8 != 0) goto L156
            r13 = 3
            goto L93
        L156:
            java.lang.String r8 = "Bytes"
            boolean r13 = r9.endsWith(r8)
            if (r13 == 0) goto L186
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.StringBuilder r13 = r13.append(r10)
            int r14 = r9.length()
            int r8 = r8.length()
            int r14 = r14 - r8
            r8 = 0
            java.lang.String r14 = r9.substring(r8, r14)
            java.lang.StringBuilder r8 = r13.append(r14)
            java.lang.String r8 = r8.toString()
            boolean r8 = r5.containsKey(r8)
            if (r8 == 0) goto L186
            r13 = 3
            goto L93
        L186:
            java.lang.Object r8 = r7.getValue()
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.StringBuilder r13 = r13.append(r11)
            java.lang.StringBuilder r13 = r13.append(r9)
            java.lang.String r13 = r13.toString()
            java.lang.Object r13 = r4.get(r13)
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r8 == 0) goto L1dd
            r14 = 0
            java.lang.Object[] r15 = new java.lang.Object[r14]
            java.lang.Object r14 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.invokeOrDie(r8, r0, r15)
            if (r13 != 0) goto L1be
            boolean r15 = isDefaultValue(r14)
            if (r15 != 0) goto L1b9
            r15 = 1
            r16 = r3
            r3 = r15
            goto L1bc
        L1b9:
            r16 = r3
            r3 = 0
        L1bc:
            r15 = 0
            goto L1cd
        L1be:
            r16 = r3
            r15 = 0
            java.lang.Object[] r3 = new java.lang.Object[r15]
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.invokeOrDie(r13, r0, r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
        L1cd:
            if (r3 == 0) goto L1d8
            printField(r1, r2, r9, r14)
            r3 = r16
            r13 = 3
            goto L93
        L1d8:
            r3 = r16
            r13 = 3
            goto L93
        L1dd:
            r16 = r3
            r15 = 0
            r13 = 3
            goto L93
        L1e3:
            r16 = r3
            boolean r3 = r0 instanceof com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage
            if (r3 == 0) goto L229
            r3 = r0
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtendableMessage r3 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessage) r3
            com.google.crypto.tink.shaded.protobuf.FieldSet<com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor> r3 = r3.extensions
            java.util.Iterator r3 = r3.iterator()
        L1f2:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L229
            java.lang.Object r6 = r3.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "["
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.Object r8 = r6.getKey()
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$ExtensionDescriptor r8 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtensionDescriptor) r8
            int r8 = r8.getNumber()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = "]"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.Object r8 = r6.getValue()
            printField(r1, r2, r7, r8)
            goto L1f2
        L229:
            r3 = r0
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r3
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3 = r3.unknownFields
            if (r3 == 0) goto L238
            r3 = r0
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r3 = (com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite) r3
            com.google.crypto.tink.shaded.protobuf.UnknownFieldSetLite r3 = r3.unknownFields
            r3.printWithIndent(r1, r2)
        L238:
            return
    }

    static java.lang.String toString(com.google.crypto.tink.shaded.protobuf.MessageLite r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "# "
            java.lang.StringBuilder r1 = r0.append(r1)
            r1.append(r3)
            r1 = 0
            reflectivePrintWithIndent(r2, r0, r1)
            java.lang.String r1 = r0.toString()
            return r1
    }
}
