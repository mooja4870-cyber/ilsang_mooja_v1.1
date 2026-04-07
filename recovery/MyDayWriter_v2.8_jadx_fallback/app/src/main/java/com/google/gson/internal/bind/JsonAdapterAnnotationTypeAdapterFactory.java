package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;

    public JsonAdapterAnnotationTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor r1) {
            r0 = this;
            r0.<init>()
            r0.constructorConstructor = r1
            return
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r4, com.google.gson.reflect.TypeToken<T> r5) {
            r3 = this;
            java.lang.Class r0 = r5.getRawType()
            java.lang.Class<com.google.gson.annotations.JsonAdapter> r1 = com.google.gson.annotations.JsonAdapter.class
            java.lang.annotation.Annotation r1 = r0.getAnnotation(r1)
            com.google.gson.annotations.JsonAdapter r1 = (com.google.gson.annotations.JsonAdapter) r1
            if (r1 != 0) goto L10
            r2 = 0
            return r2
        L10:
            com.google.gson.internal.ConstructorConstructor r2 = r3.constructorConstructor
            com.google.gson.TypeAdapter r2 = r3.getTypeAdapter(r2, r4, r5, r1)
            return r2
    }

    com.google.gson.TypeAdapter<?> getTypeAdapter(com.google.gson.internal.ConstructorConstructor r10, com.google.gson.Gson r11, com.google.gson.reflect.TypeToken<?> r12, com.google.gson.annotations.JsonAdapter r13) {
            r9 = this;
            java.lang.Class r0 = r13.value()
            com.google.gson.reflect.TypeToken r0 = com.google.gson.reflect.TypeToken.get(r0)
            com.google.gson.internal.ObjectConstructor r0 = r10.get(r0)
            java.lang.Object r0 = r0.construct()
            boolean r1 = r0 instanceof com.google.gson.TypeAdapter
            if (r1 == 0) goto L1b
            r1 = r0
            com.google.gson.TypeAdapter r1 = (com.google.gson.TypeAdapter) r1
            r6 = r11
            r7 = r12
            goto L87
        L1b:
            boolean r1 = r0 instanceof com.google.gson.TypeAdapterFactory
            if (r1 == 0) goto L29
            r1 = r0
            com.google.gson.TypeAdapterFactory r1 = (com.google.gson.TypeAdapterFactory) r1
            com.google.gson.TypeAdapter r1 = r1.create(r11, r12)
            r6 = r11
            r7 = r12
            goto L87
        L29:
            boolean r1 = r0 instanceof com.google.gson.JsonSerializer
            if (r1 != 0) goto L67
            boolean r1 = r0 instanceof com.google.gson.JsonDeserializer
            if (r1 == 0) goto L32
            goto L67
        L32:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid attempt to bind an instance of "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " as a @JsonAdapter for "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r12.toString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L67:
            boolean r1 = r0 instanceof com.google.gson.JsonSerializer
            r2 = 0
            if (r1 == 0) goto L70
            r1 = r0
            com.google.gson.JsonSerializer r1 = (com.google.gson.JsonSerializer) r1
            goto L71
        L70:
            r1 = r2
        L71:
            r4 = r1
            boolean r1 = r0 instanceof com.google.gson.JsonDeserializer
            if (r1 == 0) goto L7b
            r2 = r0
            com.google.gson.JsonDeserializer r2 = (com.google.gson.JsonDeserializer) r2
            r5 = r2
            goto L7c
        L7b:
            r5 = r2
        L7c:
            com.google.gson.internal.bind.TreeTypeAdapter r3 = new com.google.gson.internal.bind.TreeTypeAdapter
            r8 = 0
            r6 = r11
            r7 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r1 = r3
        L87:
            if (r1 == 0) goto L93
            boolean r11 = r13.nullSafe()
            if (r11 == 0) goto L93
            com.google.gson.TypeAdapter r1 = r1.nullSafe()
        L93:
            return r1
    }
}
