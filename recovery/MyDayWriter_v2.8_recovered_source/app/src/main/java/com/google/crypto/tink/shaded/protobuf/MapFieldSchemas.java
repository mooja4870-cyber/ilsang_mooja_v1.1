package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class MapFieldSchemas {
    private static final com.google.crypto.tink.shaded.protobuf.MapFieldSchema FULL_SCHEMA = null;
    private static final com.google.crypto.tink.shaded.protobuf.MapFieldSchema LITE_SCHEMA = null;

    static {
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r0 = loadSchemaForFullRuntime()
            com.google.crypto.tink.shaded.protobuf.MapFieldSchemas.FULL_SCHEMA = r0
            com.google.crypto.tink.shaded.protobuf.MapFieldSchemaLite r0 = new com.google.crypto.tink.shaded.protobuf.MapFieldSchemaLite
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.MapFieldSchemas.LITE_SCHEMA = r0
            return
    }

    MapFieldSchemas() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.crypto.tink.shaded.protobuf.MapFieldSchema full() {
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r0 = com.google.crypto.tink.shaded.protobuf.MapFieldSchemas.FULL_SCHEMA
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.MapFieldSchema lite() {
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r0 = com.google.crypto.tink.shaded.protobuf.MapFieldSchemas.LITE_SCHEMA
            return r0
    }

    private static com.google.crypto.tink.shaded.protobuf.MapFieldSchema loadSchemaForFullRuntime() {
            java.lang.String r0 = "com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L16
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L16
            java.lang.reflect.Constructor r2 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L16
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L16
            java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.Exception -> L16
            com.google.crypto.tink.shaded.protobuf.MapFieldSchema r1 = (com.google.crypto.tink.shaded.protobuf.MapFieldSchema) r1     // Catch: java.lang.Exception -> L16
            return r1
        L16:
            r0 = move-exception
            r1 = 0
            return r1
    }
}
