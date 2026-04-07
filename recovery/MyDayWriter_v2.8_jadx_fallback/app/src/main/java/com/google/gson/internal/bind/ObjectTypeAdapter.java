package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes.dex */
public final class ObjectTypeAdapter extends com.google.gson.TypeAdapter<java.lang.Object> {
    private static final com.google.gson.TypeAdapterFactory DOUBLE_FACTORY = null;
    private final com.google.gson.Gson gson;
    private final com.google.gson.ToNumberStrategy toNumberStrategy;


    /* JADX INFO: renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken = null;

        static {
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken = r0
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L56
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

    static {
            com.google.gson.ToNumberPolicy r0 = com.google.gson.ToNumberPolicy.DOUBLE
            com.google.gson.TypeAdapterFactory r0 = newFactory(r0)
            com.google.gson.internal.bind.ObjectTypeAdapter.DOUBLE_FACTORY = r0
            return
    }

    private ObjectTypeAdapter(com.google.gson.Gson r1, com.google.gson.ToNumberStrategy r2) {
            r0 = this;
            r0.<init>()
            r0.gson = r1
            r0.toNumberStrategy = r2
            return
    }

    /* synthetic */ ObjectTypeAdapter(com.google.gson.Gson r1, com.google.gson.ToNumberStrategy r2, com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.gson.TypeAdapterFactory getFactory(com.google.gson.ToNumberStrategy r1) {
            com.google.gson.ToNumberPolicy r0 = com.google.gson.ToNumberPolicy.DOUBLE
            if (r1 != r0) goto L7
            com.google.gson.TypeAdapterFactory r0 = com.google.gson.internal.bind.ObjectTypeAdapter.DOUBLE_FACTORY
            return r0
        L7:
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1)
            return r0
    }

    private static com.google.gson.TypeAdapterFactory newFactory(com.google.gson.ToNumberStrategy r1) {
            com.google.gson.internal.bind.ObjectTypeAdapter$1 r0 = new com.google.gson.internal.bind.ObjectTypeAdapter$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.gson.TypeAdapter
    public java.lang.Object read(com.google.gson.stream.JsonReader r5) throws java.io.IOException {
            r4 = this;
            com.google.gson.stream.JsonToken r0 = r5.peek()
            int[] r1 = com.google.gson.internal.bind.ObjectTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken
            int r2 = r0.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 1: goto L4d;
                case 2: goto L2f;
                case 3: goto L2a;
                case 4: goto L23;
                case 5: goto L1a;
                case 6: goto L15;
                default: goto Lf;
            }
        Lf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L15:
            r5.nextNull()
            r1 = 0
            return r1
        L1a:
            boolean r1 = r5.nextBoolean()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L23:
            com.google.gson.ToNumberStrategy r1 = r4.toNumberStrategy
            java.lang.Number r1 = r1.readNumber(r5)
            return r1
        L2a:
            java.lang.String r1 = r5.nextString()
            return r1
        L2f:
            com.google.gson.internal.LinkedTreeMap r1 = new com.google.gson.internal.LinkedTreeMap
            r1.<init>()
            r5.beginObject()
        L37:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L49
            java.lang.String r2 = r5.nextName()
            java.lang.Object r3 = r4.read(r5)
            r1.put(r2, r3)
            goto L37
        L49:
            r5.endObject()
            return r1
        L4d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.beginArray()
        L55:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L63
            java.lang.Object r2 = r4.read(r5)
            r1.add(r2)
            goto L55
        L63:
            r5.endArray()
            return r1
    }

    @Override // com.google.gson.TypeAdapter
    public void write(com.google.gson.stream.JsonWriter r3, java.lang.Object r4) throws java.io.IOException {
            r2 = this;
            if (r4 != 0) goto L6
            r3.nullValue()
            return
        L6:
            com.google.gson.Gson r0 = r2.gson
            java.lang.Class r1 = r4.getClass()
            com.google.gson.TypeAdapter r0 = r0.getAdapter(r1)
            boolean r1 = r0 instanceof com.google.gson.internal.bind.ObjectTypeAdapter
            if (r1 == 0) goto L1b
            r3.beginObject()
            r3.endObject()
            return
        L1b:
            r0.write(r3, r4)
            return
    }
}
