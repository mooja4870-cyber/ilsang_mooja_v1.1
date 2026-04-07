package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes.dex */
public final class MapTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    final boolean complexMapKeySerialization;
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;

    private final class Adapter<K, V> extends com.google.gson.TypeAdapter<java.util.Map<K, V>> {
        private final com.google.gson.internal.ObjectConstructor<? extends java.util.Map<K, V>> constructor;
        private final com.google.gson.TypeAdapter<K> keyTypeAdapter;
        final /* synthetic */ com.google.gson.internal.bind.MapTypeAdapterFactory this$0;
        private final com.google.gson.TypeAdapter<V> valueTypeAdapter;

        public Adapter(com.google.gson.internal.bind.MapTypeAdapterFactory r1, com.google.gson.Gson r2, java.lang.reflect.Type r3, com.google.gson.TypeAdapter<K> r4, java.lang.reflect.Type r5, com.google.gson.TypeAdapter<V> r6, com.google.gson.internal.ObjectConstructor<? extends java.util.Map<K, V>> r7) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper r1 = new com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper
                r1.<init>(r2, r4, r3)
                r0.keyTypeAdapter = r1
                com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper r1 = new com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper
                r1.<init>(r2, r6, r5)
                r0.valueTypeAdapter = r1
                r0.constructor = r7
                return
        }

        private java.lang.String keyToString(com.google.gson.JsonElement r3) {
                r2 = this;
                boolean r0 = r3.isJsonPrimitive()
                if (r0 == 0) goto L39
                com.google.gson.JsonPrimitive r0 = r3.getAsJsonPrimitive()
                boolean r1 = r0.isNumber()
                if (r1 == 0) goto L19
                java.lang.Number r1 = r0.getAsNumber()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                return r1
            L19:
                boolean r1 = r0.isBoolean()
                if (r1 == 0) goto L28
                boolean r1 = r0.getAsBoolean()
                java.lang.String r1 = java.lang.Boolean.toString(r1)
                return r1
            L28:
                boolean r1 = r0.isString()
                if (r1 == 0) goto L33
                java.lang.String r1 = r0.getAsString()
                return r1
            L33:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
            L39:
                boolean r0 = r3.isJsonNull()
                if (r0 == 0) goto L42
                java.lang.String r0 = "null"
                return r0
            L42:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ java.lang.Object read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
                r0 = this;
                java.util.Map r1 = r0.read(r1)
                return r1
        }

        @Override // com.google.gson.TypeAdapter
        public java.util.Map<K, V> read(com.google.gson.stream.JsonReader r9) throws java.io.IOException {
                r8 = this;
                com.google.gson.stream.JsonToken r0 = r9.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                if (r0 != r1) goto Ld
                r9.nextNull()
                r1 = 0
                return r1
            Ld:
                com.google.gson.internal.ObjectConstructor<? extends java.util.Map<K, V>> r1 = r8.constructor
                java.lang.Object r1 = r1.construct()
                java.util.Map r1 = (java.util.Map) r1
                com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.BEGIN_ARRAY
                java.lang.String r3 = "duplicate key: "
                if (r0 != r2) goto L58
                r9.beginArray()
            L1e:
                boolean r2 = r9.hasNext()
                if (r2 == 0) goto L54
                r9.beginArray()
                com.google.gson.TypeAdapter<K> r2 = r8.keyTypeAdapter
                java.lang.Object r2 = r2.read(r9)
                com.google.gson.TypeAdapter<V> r4 = r8.valueTypeAdapter
                java.lang.Object r4 = r4.read(r9)
                java.lang.Object r5 = r1.put(r2, r4)
                if (r5 != 0) goto L3d
                r9.endArray()
                goto L1e
            L3d:
                com.google.gson.JsonSyntaxException r6 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.StringBuilder r3 = r7.append(r3)
                java.lang.StringBuilder r3 = r3.append(r2)
                java.lang.String r3 = r3.toString()
                r6.<init>(r3)
                throw r6
            L54:
                r9.endArray()
                goto L93
            L58:
                r9.beginObject()
            L5b:
                boolean r2 = r9.hasNext()
                if (r2 == 0) goto L90
                com.google.gson.internal.JsonReaderInternalAccess r2 = com.google.gson.internal.JsonReaderInternalAccess.INSTANCE
                r2.promoteNameToValue(r9)
                com.google.gson.TypeAdapter<K> r2 = r8.keyTypeAdapter
                java.lang.Object r2 = r2.read(r9)
                com.google.gson.TypeAdapter<V> r4 = r8.valueTypeAdapter
                java.lang.Object r4 = r4.read(r9)
                java.lang.Object r5 = r1.put(r2, r4)
                if (r5 != 0) goto L79
                goto L5b
            L79:
                com.google.gson.JsonSyntaxException r6 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.StringBuilder r3 = r7.append(r3)
                java.lang.StringBuilder r3 = r3.append(r2)
                java.lang.String r3 = r3.toString()
                r6.<init>(r3)
                throw r6
            L90:
                r9.endObject()
            L93:
                return r1
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.write(r1, r2)
                return
        }

        public void write(com.google.gson.stream.JsonWriter r9, java.util.Map<K, V> r10) throws java.io.IOException {
                r8 = this;
                if (r10 != 0) goto L6
                r9.nullValue()
                return
            L6:
                com.google.gson.internal.bind.MapTypeAdapterFactory r0 = r8.this$0
                boolean r0 = r0.complexMapKeySerialization
                if (r0 != 0) goto L3c
                r9.beginObject()
                java.util.Set r0 = r10.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L38
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r9.name(r2)
                com.google.gson.TypeAdapter<V> r2 = r8.valueTypeAdapter
                java.lang.Object r3 = r1.getValue()
                r2.write(r9, r3)
                goto L17
            L38:
                r9.endObject()
                return
            L3c:
                r0 = 0
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r10.size()
                r1.<init>(r2)
                java.util.ArrayList r2 = new java.util.ArrayList
                int r3 = r10.size()
                r2.<init>(r3)
                java.util.Set r3 = r10.entrySet()
                java.util.Iterator r3 = r3.iterator()
            L57:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L89
                java.lang.Object r4 = r3.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                com.google.gson.TypeAdapter<K> r5 = r8.keyTypeAdapter
                java.lang.Object r6 = r4.getKey()
                com.google.gson.JsonElement r5 = r5.toJsonTree(r6)
                r1.add(r5)
                java.lang.Object r6 = r4.getValue()
                r2.add(r6)
                boolean r6 = r5.isJsonArray()
                if (r6 != 0) goto L86
                boolean r6 = r5.isJsonObject()
                if (r6 == 0) goto L84
                goto L86
            L84:
                r6 = 0
                goto L87
            L86:
                r6 = 1
            L87:
                r0 = r0 | r6
                goto L57
            L89:
                if (r0 == 0) goto Lb4
                r9.beginArray()
                r3 = 0
                int r4 = r1.size()
            L93:
                if (r3 >= r4) goto Lb0
                r9.beginArray()
                java.lang.Object r5 = r1.get(r3)
                com.google.gson.JsonElement r5 = (com.google.gson.JsonElement) r5
                com.google.gson.internal.Streams.write(r5, r9)
                com.google.gson.TypeAdapter<V> r5 = r8.valueTypeAdapter
                java.lang.Object r6 = r2.get(r3)
                r5.write(r9, r6)
                r9.endArray()
                int r3 = r3 + 1
                goto L93
            Lb0:
                r9.endArray()
                goto Lda
            Lb4:
                r9.beginObject()
                r3 = 0
                int r4 = r1.size()
            Lbc:
                if (r3 >= r4) goto Ld7
                java.lang.Object r5 = r1.get(r3)
                com.google.gson.JsonElement r5 = (com.google.gson.JsonElement) r5
                java.lang.String r6 = r8.keyToString(r5)
                r9.name(r6)
                com.google.gson.TypeAdapter<V> r6 = r8.valueTypeAdapter
                java.lang.Object r7 = r2.get(r3)
                r6.write(r9, r7)
                int r3 = r3 + 1
                goto Lbc
            Ld7:
                r9.endObject()
            Lda:
                return
        }
    }

    public MapTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.constructorConstructor = r1
            r0.complexMapKeySerialization = r2
            return
    }

    private com.google.gson.TypeAdapter<?> getKeyAdapter(com.google.gson.Gson r2, java.lang.reflect.Type r3) {
            r1 = this;
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r3 == r0) goto L12
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r3 != r0) goto L9
            goto L12
        L9:
            com.google.gson.reflect.TypeToken r0 = com.google.gson.reflect.TypeToken.get(r3)
            com.google.gson.TypeAdapter r0 = r2.getAdapter(r0)
            goto L14
        L12:
            com.google.gson.TypeAdapter<java.lang.Boolean> r0 = com.google.gson.internal.bind.TypeAdapters.BOOLEAN_AS_STRING
        L14:
            return r0
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r14, com.google.gson.reflect.TypeToken<T> r15) {
            r13 = this;
            java.lang.reflect.Type r8 = r15.getType()
            java.lang.Class r9 = r15.getRawType()
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r9)
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            java.lang.Class r10 = com.google.gson.internal.C$Gson$Types.getRawType(r8)
            java.lang.reflect.Type[] r11 = com.google.gson.internal.C$Gson$Types.getMapKeyAndValueTypes(r8, r10)
            r0 = 0
            r3 = r11[r0]
            com.google.gson.TypeAdapter r4 = r13.getKeyAdapter(r14, r3)
            r3 = 1
            r5 = r11[r3]
            com.google.gson.reflect.TypeToken r5 = com.google.gson.reflect.TypeToken.get(r5)
            com.google.gson.TypeAdapter r6 = r14.getAdapter(r5)
            com.google.gson.internal.ConstructorConstructor r5 = r13.constructorConstructor
            r12 = r15
            com.google.gson.internal.ObjectConstructor r7 = r5.get(r15)
            r5 = r0
            com.google.gson.internal.bind.MapTypeAdapterFactory$Adapter r0 = new com.google.gson.internal.bind.MapTypeAdapterFactory$Adapter
            r5 = r11[r5]
            r3 = r11[r3]
            r1 = r5
            r5 = r3
            r3 = r1
            r1 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }
}
