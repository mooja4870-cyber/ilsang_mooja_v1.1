package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    private final com.google.gson.internal.reflect.ReflectionAccessor accessor;
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;
    private final com.google.gson.internal.Excluder excluder;
    private final com.google.gson.FieldNamingStrategy fieldNamingPolicy;
    private final com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;


    public static final class Adapter<T> extends com.google.gson.TypeAdapter<T> {
        private final java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> boundFields;
        private final com.google.gson.internal.ObjectConstructor<T> constructor;

        Adapter(com.google.gson.internal.ObjectConstructor<T> r1, java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> r2) {
                r0 = this;
                r0.<init>()
                r0.constructor = r1
                r0.boundFields = r2
                return
        }

        @Override // com.google.gson.TypeAdapter
        public T read(com.google.gson.stream.JsonReader r5) throws java.io.IOException {
                r4 = this;
                com.google.gson.stream.JsonToken r0 = r5.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                if (r0 != r1) goto Ld
                r5.nextNull()
                r0 = 0
                return r0
            Ld:
                com.google.gson.internal.ObjectConstructor<T> r0 = r4.constructor
                java.lang.Object r0 = r0.construct()
                r5.beginObject()     // Catch: java.lang.IllegalAccessException -> L3c java.lang.IllegalStateException -> L43
            L16:
                boolean r1 = r5.hasNext()     // Catch: java.lang.IllegalAccessException -> L3c java.lang.IllegalStateException -> L43
                if (r1 == 0) goto L37
                java.lang.String r1 = r5.nextName()     // Catch: java.lang.IllegalAccessException -> L3c java.lang.IllegalStateException -> L43
                java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField> r2 = r4.boundFields     // Catch: java.lang.IllegalAccessException -> L3c java.lang.IllegalStateException -> L43
                java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.IllegalAccessException -> L3c java.lang.IllegalStateException -> L43
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r2 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r2     // Catch: java.lang.IllegalAccessException -> L3c java.lang.IllegalStateException -> L43
                if (r2 == 0) goto L33
                boolean r3 = r2.deserialized     // Catch: java.lang.IllegalAccessException -> L3c java.lang.IllegalStateException -> L43
                if (r3 != 0) goto L2f
                goto L33
            L2f:
                r2.read(r5, r0)     // Catch: java.lang.IllegalAccessException -> L3c java.lang.IllegalStateException -> L43
                goto L36
            L33:
                r5.skipValue()     // Catch: java.lang.IllegalAccessException -> L3c java.lang.IllegalStateException -> L43
            L36:
                goto L16
            L37:
                r5.endObject()
                return r0
            L3c:
                r1 = move-exception
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>(r1)
                throw r2
            L43:
                r1 = move-exception
                com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException
                r2.<init>(r1)
                throw r2
        }

        @Override // com.google.gson.TypeAdapter
        public void write(com.google.gson.stream.JsonWriter r4, T r5) throws java.io.IOException {
                r3 = this;
                if (r5 != 0) goto L6
                r4.nullValue()
                return
            L6:
                r4.beginObject()
                java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField> r0 = r3.boundFields     // Catch: java.lang.IllegalAccessException -> L33
                java.util.Collection r0 = r0.values()     // Catch: java.lang.IllegalAccessException -> L33
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.IllegalAccessException -> L33
            L13:
                boolean r1 = r0.hasNext()     // Catch: java.lang.IllegalAccessException -> L33
                if (r1 == 0) goto L2e
                java.lang.Object r1 = r0.next()     // Catch: java.lang.IllegalAccessException -> L33
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r1 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r1     // Catch: java.lang.IllegalAccessException -> L33
                boolean r2 = r1.writeField(r5)     // Catch: java.lang.IllegalAccessException -> L33
                if (r2 == 0) goto L2d
                java.lang.String r2 = r1.name     // Catch: java.lang.IllegalAccessException -> L33
                r4.name(r2)     // Catch: java.lang.IllegalAccessException -> L33
                r1.write(r4, r5)     // Catch: java.lang.IllegalAccessException -> L33
            L2d:
                goto L13
            L2e:
                r4.endObject()
                return
            L33:
                r0 = move-exception
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>(r0)
                throw r1
        }
    }

    static abstract class BoundField {
        final boolean deserialized;
        final java.lang.String name;
        final boolean serialized;

        protected BoundField(java.lang.String r1, boolean r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.serialized = r2
                r0.deserialized = r3
                return
        }

        abstract void read(com.google.gson.stream.JsonReader r1, java.lang.Object r2) throws java.io.IOException, java.lang.IllegalAccessException;

        abstract void write(com.google.gson.stream.JsonWriter r1, java.lang.Object r2) throws java.io.IOException, java.lang.IllegalAccessException;

        abstract boolean writeField(java.lang.Object r1) throws java.io.IOException, java.lang.IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor r2, com.google.gson.FieldNamingStrategy r3, com.google.gson.internal.Excluder r4, com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r5) {
            r1 = this;
            r1.<init>()
            com.google.gson.internal.reflect.ReflectionAccessor r0 = com.google.gson.internal.reflect.ReflectionAccessor.getInstance()
            r1.accessor = r0
            r1.constructorConstructor = r2
            r1.fieldNamingPolicy = r3
            r1.excluder = r4
            r1.jsonAdapterFactory = r5
            return
    }

    private com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField createBoundField(com.google.gson.Gson r14, java.lang.reflect.Field r15, java.lang.String r16, com.google.gson.reflect.TypeToken<?> r17, boolean r18, boolean r19) {
            r13 = this;
            r9 = r17
            java.lang.Class r0 = r9.getRawType()
            boolean r10 = com.google.gson.internal.Primitives.isPrimitive(r0)
            java.lang.Class<com.google.gson.annotations.JsonAdapter> r0 = com.google.gson.annotations.JsonAdapter.class
            java.lang.annotation.Annotation r0 = r15.getAnnotation(r0)
            r11 = r0
            com.google.gson.annotations.JsonAdapter r11 = (com.google.gson.annotations.JsonAdapter) r11
            r0 = 0
            if (r11 == 0) goto L1e
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r1 = r13.jsonAdapterFactory
            com.google.gson.internal.ConstructorConstructor r2 = r13.constructorConstructor
            com.google.gson.TypeAdapter r0 = r1.getTypeAdapter(r2, r14, r9, r11)
        L1e:
            if (r0 == 0) goto L22
            r1 = 1
            goto L23
        L22:
            r1 = 0
        L23:
            r6 = r1
            if (r0 != 0) goto L2a
            com.google.gson.TypeAdapter r0 = r14.getAdapter(r9)
        L2a:
            r12 = r0
            r7 = r12
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1 r0 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1
            r1 = r13
            r8 = r14
            r5 = r15
            r2 = r16
            r3 = r18
            r4 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    static boolean excludeField(java.lang.reflect.Field r1, boolean r2, com.google.gson.internal.Excluder r3) {
            java.lang.Class r0 = r1.getType()
            boolean r0 = r3.excludeClass(r0, r2)
            if (r0 != 0) goto L12
            boolean r0 = r3.excludeField(r1, r2)
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    private java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> getBoundFields(com.google.gson.Gson r19, com.google.gson.reflect.TypeToken<?> r20, java.lang.Class<?> r21) {
            r18 = this;
            r0 = r18
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r7 = r1
            boolean r1 = r21.isInterface()
            if (r1 == 0) goto Lf
            return r7
        Lf:
            java.lang.reflect.Type r8 = r20.getType()
            r9 = r20
            r10 = r21
        L17:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r10 == r1) goto Ld8
            java.lang.reflect.Field[] r11 = r10.getDeclaredFields()
            int r12 = r11.length
            r13 = 0
            r14 = r13
        L22:
            if (r14 >= r12) goto Lbe
            r2 = r11[r14]
            r1 = 1
            boolean r1 = r0.excludeField(r2, r1)
            boolean r6 = r0.excludeField(r2, r13)
            if (r1 != 0) goto L37
            if (r6 != 0) goto L37
            r21 = r9
            goto L97
        L37:
            com.google.gson.internal.reflect.ReflectionAccessor r3 = r0.accessor
            r3.makeAccessible(r2)
            java.lang.reflect.Type r3 = r9.getType()
            java.lang.reflect.Type r4 = r2.getGenericType()
            java.lang.reflect.Type r15 = com.google.gson.internal.C$Gson$Types.resolve(r3, r10, r4)
            java.util.List r3 = r0.getFieldNames(r2)
            r4 = 0
            r5 = 0
            int r13 = r3.size()
        L52:
            if (r5 >= r13) goto L8e
            java.lang.Object r16 = r3.get(r5)
            java.lang.String r16 = (java.lang.String) r16
            if (r5 == 0) goto L5d
            r1 = 0
        L5d:
            r17 = r4
            com.google.gson.reflect.TypeToken r4 = com.google.gson.reflect.TypeToken.get(r15)
            r21 = r16
            r16 = r3
            r3 = r21
            r21 = r9
            r9 = r17
            r17 = r5
            r5 = r1
            r1 = r19
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r4 = r0.createBoundField(r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = r7.put(r3, r4)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r0 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r0
            if (r9 != 0) goto L82
            r1 = r0
            r4 = r1
            goto L83
        L82:
            r4 = r9
        L83:
            int r0 = r17 + 1
            r9 = r21
            r1 = r5
            r3 = r16
            r5 = r0
            r0 = r18
            goto L52
        L8e:
            r16 = r3
            r17 = r5
            r21 = r9
            r9 = r4
            if (r9 != 0) goto L9f
        L97:
            int r14 = r14 + 1
            r13 = 0
            r0 = r18
            r9 = r21
            goto L22
        L9f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r4 = " declares multiple JSON fields named "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r9.name
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        Lbe:
            r21 = r9
            java.lang.reflect.Type r0 = r21.getType()
            java.lang.reflect.Type r1 = r10.getGenericSuperclass()
            java.lang.reflect.Type r0 = com.google.gson.internal.C$Gson$Types.resolve(r0, r10, r1)
            com.google.gson.reflect.TypeToken r9 = com.google.gson.reflect.TypeToken.get(r0)
            java.lang.Class r10 = r9.getRawType()
            r0 = r18
            goto L17
        Ld8:
            return r7
    }

    private java.util.List<java.lang.String> getFieldNames(java.lang.reflect.Field r8) {
            r7 = this;
            java.lang.Class<com.google.gson.annotations.SerializedName> r0 = com.google.gson.annotations.SerializedName.class
            java.lang.annotation.Annotation r0 = r8.getAnnotation(r0)
            com.google.gson.annotations.SerializedName r0 = (com.google.gson.annotations.SerializedName) r0
            if (r0 != 0) goto L15
            com.google.gson.FieldNamingStrategy r1 = r7.fieldNamingPolicy
            java.lang.String r1 = r1.translateName(r8)
            java.util.List r2 = java.util.Collections.singletonList(r1)
            return r2
        L15:
            java.lang.String r1 = r0.value()
            java.lang.String[] r2 = r0.alternate()
            int r3 = r2.length
            if (r3 != 0) goto L25
            java.util.List r3 = java.util.Collections.singletonList(r1)
            return r3
        L25:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.length
            int r4 = r4 + 1
            r3.<init>(r4)
            r3.add(r1)
            int r4 = r2.length
            r5 = 0
        L32:
            if (r5 >= r4) goto L3c
            r6 = r2[r5]
            r3.add(r6)
            int r5 = r5 + 1
            goto L32
        L3c:
            return r3
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r5, com.google.gson.reflect.TypeToken<T> r6) {
            r4 = this;
            java.lang.Class r0 = r6.getRawType()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 != 0) goto Le
            r1 = 0
            return r1
        Le:
            com.google.gson.internal.ConstructorConstructor r1 = r4.constructorConstructor
            com.google.gson.internal.ObjectConstructor r1 = r1.get(r6)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter r2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
            java.util.Map r3 = r4.getBoundFields(r5, r6, r0)
            r2.<init>(r1, r3)
            return r2
    }

    public boolean excludeField(java.lang.reflect.Field r2, boolean r3) {
            r1 = this;
            com.google.gson.internal.Excluder r0 = r1.excluder
            boolean r0 = excludeField(r2, r3, r0)
            return r0
    }
}
