package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class ExtensionSchemas {
    private static final com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> FULL_SCHEMA = null;
    private static final com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> LITE_SCHEMA = null;

    static {
            com.google.crypto.tink.shaded.protobuf.ExtensionSchemaLite r0 = new com.google.crypto.tink.shaded.protobuf.ExtensionSchemaLite
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.ExtensionSchemas.LITE_SCHEMA = r0
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema r0 = loadSchemaForFullRuntime()
            com.google.crypto.tink.shaded.protobuf.ExtensionSchemas.FULL_SCHEMA = r0
            return
    }

    ExtensionSchemas() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> full() {
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = com.google.crypto.tink.shaded.protobuf.ExtensionSchemas.FULL_SCHEMA
            if (r0 == 0) goto L7
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = com.google.crypto.tink.shaded.protobuf.ExtensionSchemas.FULL_SCHEMA
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Protobuf runtime is not correctly loaded."
            r0.<init>(r1)
            throw r0
    }

    static com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> lite() {
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> r0 = com.google.crypto.tink.shaded.protobuf.ExtensionSchemas.LITE_SCHEMA
            return r0
    }

    private static com.google.crypto.tink.shaded.protobuf.ExtensionSchema<?> loadSchemaForFullRuntime() {
            java.lang.String r0 = "com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L16
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L16
            java.lang.reflect.Constructor r2 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L16
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L16
            java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.Exception -> L16
            com.google.crypto.tink.shaded.protobuf.ExtensionSchema r1 = (com.google.crypto.tink.shaded.protobuf.ExtensionSchema) r1     // Catch: java.lang.Exception -> L16
            return r1
        L16:
            r0 = move-exception
            r1 = 0
            return r1
    }
}
