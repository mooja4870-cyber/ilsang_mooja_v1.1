package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes.dex */
public final class NumberTypeAdapter extends com.google.gson.TypeAdapter<java.lang.Number> {
    private static final com.google.gson.TypeAdapterFactory LAZILY_PARSED_NUMBER_FACTORY = null;
    private final com.google.gson.ToNumberStrategy toNumberStrategy;


    /* JADX INFO: renamed from: com.google.gson.internal.bind.NumberTypeAdapter$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken = null;

        static {
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.gson.internal.bind.NumberTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken = r0
                int[] r0 = com.google.gson.internal.bind.NumberTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.gson.internal.bind.NumberTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.gson.internal.bind.NumberTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                return
        }
    }

    static {
            com.google.gson.ToNumberPolicy r0 = com.google.gson.ToNumberPolicy.LAZILY_PARSED_NUMBER
            com.google.gson.TypeAdapterFactory r0 = newFactory(r0)
            com.google.gson.internal.bind.NumberTypeAdapter.LAZILY_PARSED_NUMBER_FACTORY = r0
            return
    }

    private NumberTypeAdapter(com.google.gson.ToNumberStrategy r1) {
            r0 = this;
            r0.<init>()
            r0.toNumberStrategy = r1
            return
    }

    public static com.google.gson.TypeAdapterFactory getFactory(com.google.gson.ToNumberStrategy r1) {
            com.google.gson.ToNumberPolicy r0 = com.google.gson.ToNumberPolicy.LAZILY_PARSED_NUMBER
            if (r1 != r0) goto L7
            com.google.gson.TypeAdapterFactory r0 = com.google.gson.internal.bind.NumberTypeAdapter.LAZILY_PARSED_NUMBER_FACTORY
            return r0
        L7:
            com.google.gson.TypeAdapterFactory r0 = newFactory(r1)
            return r0
    }

    private static com.google.gson.TypeAdapterFactory newFactory(com.google.gson.ToNumberStrategy r2) {
            com.google.gson.internal.bind.NumberTypeAdapter r0 = new com.google.gson.internal.bind.NumberTypeAdapter
            r0.<init>(r2)
            com.google.gson.internal.bind.NumberTypeAdapter$1 r1 = new com.google.gson.internal.bind.NumberTypeAdapter$1
            r1.<init>(r0)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public java.lang.Number read(com.google.gson.stream.JsonReader r5) throws java.io.IOException {
            r4 = this;
            com.google.gson.stream.JsonToken r0 = r5.peek()
            int[] r1 = com.google.gson.internal.bind.NumberTypeAdapter.AnonymousClass2.$SwitchMap$com$google$gson$stream$JsonToken
            int r2 = r0.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 1: goto L2f;
                case 2: goto L28;
                case 3: goto L28;
                default: goto Lf;
            }
        Lf:
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expecting number, got: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L28:
            com.google.gson.ToNumberStrategy r1 = r4.toNumberStrategy
            java.lang.Number r1 = r1.readNumber(r5)
            return r1
        L2f:
            r5.nextNull()
            r1 = 0
            return r1
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ java.lang.Number read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
            r0 = this;
            java.lang.Number r1 = r0.read(r1)
            return r1
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public void write2(com.google.gson.stream.JsonWriter r1, java.lang.Number r2) throws java.io.IOException {
            r0 = this;
            r1.value(r2)
            return
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.lang.Number r2) throws java.io.IOException {
            r0 = this;
            java.lang.Number r2 = (java.lang.Number) r2
            r0.write2(r1, r2)
            return
    }
}
