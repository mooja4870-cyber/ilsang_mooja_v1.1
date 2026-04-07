package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
final class NewInstanceSchemas {
    private static final com.google.crypto.tink.shaded.protobuf.NewInstanceSchema FULL_SCHEMA = null;
    private static final com.google.crypto.tink.shaded.protobuf.NewInstanceSchema LITE_SCHEMA = null;

    static {
            com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r0 = loadSchemaForFullRuntime()
            com.google.crypto.tink.shaded.protobuf.NewInstanceSchemas.FULL_SCHEMA = r0
            com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaLite r0 = new com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaLite
            r0.<init>()
            com.google.crypto.tink.shaded.protobuf.NewInstanceSchemas.LITE_SCHEMA = r0
            return
    }

    NewInstanceSchemas() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.crypto.tink.shaded.protobuf.NewInstanceSchema full() {
            com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r0 = com.google.crypto.tink.shaded.protobuf.NewInstanceSchemas.FULL_SCHEMA
            return r0
    }

    static com.google.crypto.tink.shaded.protobuf.NewInstanceSchema lite() {
            com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r0 = com.google.crypto.tink.shaded.protobuf.NewInstanceSchemas.LITE_SCHEMA
            return r0
    }

    private static com.google.crypto.tink.shaded.protobuf.NewInstanceSchema loadSchemaForFullRuntime() {
            java.lang.String r0 = "com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L16
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L16
            java.lang.reflect.Constructor r2 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L16
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L16
            java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.Exception -> L16
            com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r1 = (com.google.crypto.tink.shaded.protobuf.NewInstanceSchema) r1     // Catch: java.lang.Exception -> L16
            return r1
        L16:
            r0 = move-exception
            r1 = 0
            return r1
    }
}
