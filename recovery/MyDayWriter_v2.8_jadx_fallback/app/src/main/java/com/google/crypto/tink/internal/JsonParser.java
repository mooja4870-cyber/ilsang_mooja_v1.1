package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes.dex */
public final class JsonParser {
    private static final com.google.crypto.tink.internal.JsonParser.JsonElementTypeAdapter JSON_ELEMENT = null;

    /* JADX INFO: renamed from: com.google.crypto.tink.internal.JsonParser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken = null;

        static {
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.internal.JsonParser.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken = r0
                int[] r0 = com.google.crypto.tink.internal.JsonParser.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.internal.JsonParser.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.internal.JsonParser.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.internal.JsonParser.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.google.crypto.tink.internal.JsonParser.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                int[] r0 = com.google.crypto.tink.internal.JsonParser.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L56
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch: java.lang.NoSuchFieldError -> L56
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L56
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L56
                goto L57
            L56:
                r0 = move-exception
            L57:
                return
        }
    }

    private static final class JsonElementTypeAdapter extends com.google.gson.TypeAdapter<com.google.gson.JsonElement> {
        private static final int RECURSION_LIMIT = 100;

        private JsonElementTypeAdapter() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ JsonElementTypeAdapter(com.google.crypto.tink.internal.JsonParser.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private com.google.gson.JsonElement readTerminal(com.google.gson.stream.JsonReader r4, com.google.gson.stream.JsonToken r5) throws java.io.IOException {
                r3 = this;
                int[] r0 = com.google.crypto.tink.internal.JsonParser.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken
                int r1 = r5.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 3: goto L47;
                    case 4: goto L38;
                    case 5: goto L2a;
                    case 6: goto L24;
                    default: goto Lb;
                }
            Lb:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected token: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r5)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L24:
                r4.nextNull()
                com.google.gson.JsonNull r0 = com.google.gson.JsonNull.INSTANCE
                return r0
            L2a:
                com.google.gson.JsonPrimitive r0 = new com.google.gson.JsonPrimitive
                boolean r1 = r4.nextBoolean()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.<init>(r1)
                return r0
            L38:
                java.lang.String r0 = r4.nextString()
                com.google.gson.JsonPrimitive r1 = new com.google.gson.JsonPrimitive
                com.google.crypto.tink.internal.JsonParser$LazilyParsedNumber r2 = new com.google.crypto.tink.internal.JsonParser$LazilyParsedNumber
                r2.<init>(r0)
                r1.<init>(r2)
                return r1
            L47:
                java.lang.String r0 = r4.nextString()
                boolean r1 = com.google.crypto.tink.internal.JsonParser.isValidString(r0)
                if (r1 == 0) goto L57
                com.google.gson.JsonPrimitive r1 = new com.google.gson.JsonPrimitive
                r1.<init>(r0)
                return r1
            L57:
                java.io.IOException r1 = new java.io.IOException
                java.lang.String r2 = "illegal characters in string"
                r1.<init>(r2)
                throw r1
        }

        @javax.annotation.Nullable
        private com.google.gson.JsonElement tryBeginNesting(com.google.gson.stream.JsonReader r3, com.google.gson.stream.JsonToken r4) throws java.io.IOException {
                r2 = this;
                int[] r0 = com.google.crypto.tink.internal.JsonParser.AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken
                int r1 = r4.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L16;
                    case 2: goto Ld;
                    default: goto Lb;
                }
            Lb:
                r0 = 0
                return r0
            Ld:
                r3.beginObject()
                com.google.gson.JsonObject r0 = new com.google.gson.JsonObject
                r0.<init>()
                return r0
            L16:
                r3.beginArray()
                com.google.gson.JsonArray r0 = new com.google.gson.JsonArray
                r0.<init>()
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public com.google.gson.JsonElement read(com.google.gson.stream.JsonReader r10) throws java.io.IOException {
                r9 = this;
                com.google.gson.stream.JsonToken r0 = r10.peek()
                com.google.gson.JsonElement r1 = r9.tryBeginNesting(r10, r0)
                if (r1 != 0) goto Lf
                com.google.gson.JsonElement r2 = r9.readTerminal(r10, r0)
                return r2
            Lf:
                java.util.ArrayDeque r2 = new java.util.ArrayDeque
                r2.<init>()
            L14:
                boolean r3 = r10.hasNext()
                if (r3 == 0) goto L90
                r3 = 0
                boolean r4 = r1 instanceof com.google.gson.JsonObject
                if (r4 == 0) goto L32
                java.lang.String r3 = r10.nextName()
                boolean r4 = com.google.crypto.tink.internal.JsonParser.isValidString(r3)
                if (r4 == 0) goto L2a
                goto L32
            L2a:
                java.io.IOException r4 = new java.io.IOException
                java.lang.String r5 = "illegal characters in string"
                r4.<init>(r5)
                throw r4
            L32:
                com.google.gson.stream.JsonToken r0 = r10.peek()
                com.google.gson.JsonElement r4 = r9.tryBeginNesting(r10, r0)
                if (r4 == 0) goto L3e
                r5 = 1
                goto L3f
            L3e:
                r5 = 0
            L3f:
                if (r4 != 0) goto L45
                com.google.gson.JsonElement r4 = r9.readTerminal(r10, r0)
            L45:
                boolean r6 = r1 instanceof com.google.gson.JsonArray
                if (r6 == 0) goto L50
                r6 = r1
                com.google.gson.JsonArray r6 = (com.google.gson.JsonArray) r6
                r6.add(r4)
                goto L5f
            L50:
                r6 = r1
                com.google.gson.JsonObject r6 = (com.google.gson.JsonObject) r6
                boolean r6 = r6.has(r3)
                if (r6 != 0) goto L77
                r6 = r1
                com.google.gson.JsonObject r6 = (com.google.gson.JsonObject) r6
                r6.add(r3, r4)
            L5f:
                if (r5 == 0) goto L76
                r2.addLast(r1)
                int r6 = r2.size()
                r7 = 100
                if (r6 > r7) goto L6e
                r1 = r4
                goto L76
            L6e:
                java.io.IOException r6 = new java.io.IOException
                java.lang.String r7 = "too many recursions"
                r6.<init>(r7)
                throw r6
            L76:
                goto L14
            L77:
                java.io.IOException r6 = new java.io.IOException
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "duplicate key: "
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.StringBuilder r7 = r7.append(r3)
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            L90:
                boolean r3 = r1 instanceof com.google.gson.JsonArray
                if (r3 == 0) goto L98
                r10.endArray()
                goto L9b
            L98:
                r10.endObject()
            L9b:
                boolean r3 = r2.isEmpty()
                if (r3 == 0) goto La2
                return r1
            La2:
                java.lang.Object r3 = r2.removeLast()
                r1 = r3
                com.google.gson.JsonElement r1 = (com.google.gson.JsonElement) r1
                goto L14
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ com.google.gson.JsonElement read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
                r0 = this;
                com.google.gson.JsonElement r1 = r0.read(r1)
                return r1
        }

        /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
        public void write2(com.google.gson.stream.JsonWriter r3, com.google.gson.JsonElement r4) {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "write is not supported"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, com.google.gson.JsonElement r2) throws java.io.IOException {
                r0 = this;
                com.google.gson.JsonElement r2 = (com.google.gson.JsonElement) r2
                r0.write2(r1, r2)
                return
        }
    }

    private static final class LazilyParsedNumber extends java.lang.Number {
        private final java.lang.String value;

        public LazilyParsedNumber(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        private void readObject(java.io.ObjectInputStream r3) throws java.io.NotSerializableException {
                r2 = this;
                java.io.NotSerializableException r0 = new java.io.NotSerializableException
                java.lang.String r1 = "serialization is not supported"
                r0.<init>(r1)
                throw r0
        }

        private java.lang.Object writeReplace() throws java.io.NotSerializableException {
                r2 = this;
                java.io.NotSerializableException r0 = new java.io.NotSerializableException
                java.lang.String r1 = "serialization is not supported"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.lang.Number
        public double doubleValue() {
                r2 = this;
                java.lang.String r0 = r2.value
                double r0 = java.lang.Double.parseDouble(r0)
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                if (r3 != r4) goto L4
                r0 = 1
                return r0
            L4:
                boolean r0 = r4 instanceof com.google.crypto.tink.internal.JsonParser.LazilyParsedNumber
                if (r0 == 0) goto L14
                r0 = r4
                com.google.crypto.tink.internal.JsonParser$LazilyParsedNumber r0 = (com.google.crypto.tink.internal.JsonParser.LazilyParsedNumber) r0
                java.lang.String r1 = r3.value
                java.lang.String r2 = r0.value
                boolean r1 = r1.equals(r2)
                return r1
            L14:
                r0 = 0
                return r0
        }

        @Override // java.lang.Number
        public float floatValue() {
                r1 = this;
                java.lang.String r0 = r1.value
                float r0 = java.lang.Float.parseFloat(r0)
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.value
                int r0 = r0.hashCode()
                return r0
        }

        @Override // java.lang.Number
        public int intValue() {
                r4 = this;
                java.lang.String r0 = r4.value     // Catch: java.lang.NumberFormatException -> L7
                int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L7
                return r0
            L7:
                r0 = move-exception
                java.lang.String r1 = r4.value     // Catch: java.lang.NumberFormatException -> L10
                long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L10
                int r1 = (int) r1
                return r1
            L10:
                r1 = move-exception
                java.math.BigDecimal r2 = new java.math.BigDecimal
                java.lang.String r3 = r4.value
                r2.<init>(r3)
                int r2 = r2.intValue()
                return r2
        }

        @Override // java.lang.Number
        public long longValue() {
                r3 = this;
                java.lang.String r0 = r3.value     // Catch: java.lang.NumberFormatException -> L7
                long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L7
                return r0
            L7:
                r0 = move-exception
                java.math.BigDecimal r1 = new java.math.BigDecimal
                java.lang.String r2 = r3.value
                r1.<init>(r2)
                long r1 = r1.longValue()
                return r1
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }
    }

    static {
            com.google.crypto.tink.internal.JsonParser$JsonElementTypeAdapter r0 = new com.google.crypto.tink.internal.JsonParser$JsonElementTypeAdapter
            r1 = 0
            r0.<init>(r1)
            com.google.crypto.tink.internal.JsonParser.JSON_ELEMENT = r0
            return
    }

    private JsonParser() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long getParsedNumberAsLongOrThrow(com.google.gson.JsonElement r3) {
            java.lang.Number r0 = r3.getAsNumber()
            boolean r1 = r0 instanceof com.google.crypto.tink.internal.JsonParser.LazilyParsedNumber
            if (r1 == 0) goto L15
            java.lang.Number r1 = r3.getAsNumber()
            java.lang.String r1 = r1.toString()
            long r1 = java.lang.Long.parseLong(r1)
            return r1
        L15:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "does not contain a parsed number."
            r1.<init>(r2)
            throw r1
    }

    public static boolean isValidString(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 != r0) goto L9
            r2 = 1
            return r2
        L9:
            char r2 = r4.charAt(r1)
            int r1 = r1 + 1
            boolean r3 = java.lang.Character.isSurrogate(r2)
            if (r3 == 0) goto L5
            boolean r3 = java.lang.Character.isLowSurrogate(r2)
            if (r3 != 0) goto L2c
            if (r1 == r0) goto L2c
            char r3 = r4.charAt(r1)
            boolean r3 = java.lang.Character.isLowSurrogate(r3)
            if (r3 != 0) goto L28
            goto L2c
        L28:
            int r1 = r1 + 1
            goto L5
        L2c:
            r3 = 0
            return r3
    }

    public static com.google.gson.JsonElement parse(java.lang.String r2) throws java.io.IOException {
            com.google.gson.stream.JsonReader r0 = new com.google.gson.stream.JsonReader     // Catch: java.lang.NumberFormatException -> L15
            java.io.StringReader r1 = new java.io.StringReader     // Catch: java.lang.NumberFormatException -> L15
            r1.<init>(r2)     // Catch: java.lang.NumberFormatException -> L15
            r0.<init>(r1)     // Catch: java.lang.NumberFormatException -> L15
            r1 = 0
            r0.setLenient(r1)     // Catch: java.lang.NumberFormatException -> L15
            com.google.crypto.tink.internal.JsonParser$JsonElementTypeAdapter r1 = com.google.crypto.tink.internal.JsonParser.JSON_ELEMENT     // Catch: java.lang.NumberFormatException -> L15
            com.google.gson.JsonElement r1 = r1.read(r0)     // Catch: java.lang.NumberFormatException -> L15
            return r1
        L15:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
    }
}
