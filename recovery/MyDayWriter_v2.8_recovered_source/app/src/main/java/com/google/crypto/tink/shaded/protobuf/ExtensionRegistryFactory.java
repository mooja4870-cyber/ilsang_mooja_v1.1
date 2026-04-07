package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class ExtensionRegistryFactory {
    static final java.lang.Class<?> EXTENSION_REGISTRY_CLASS = null;
    static final java.lang.String FULL_REGISTRY_CLASS_NAME = "com.google.crypto.tink.shaded.protobuf.ExtensionRegistry";

    static {
            java.lang.Class r0 = reflectExtensionRegistry()
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryFactory.EXTENSION_REGISTRY_CLASS = r0
            return
    }

    ExtensionRegistryFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite create() {
            java.lang.String r0 = "newInstance"
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = invokeSubclassFactory(r0)
            if (r0 == 0) goto La
            r1 = r0
            goto Lf
        La:
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = new com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite
            r1.<init>()
        Lf:
            return r1
    }

    public static com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite createEmpty() {
            java.lang.String r0 = "getEmptyRegistry"
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = invokeSubclassFactory(r0)
            if (r0 == 0) goto La
            r1 = r0
            goto Lc
        La:
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.EMPTY_REGISTRY_LITE
        Lc:
            return r1
    }

    private static final com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite invokeSubclassFactory(java.lang.String r4) {
            java.lang.Class<?> r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryFactory.EXTENSION_REGISTRY_CLASS
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Class<?> r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryFactory.EXTENSION_REGISTRY_CLASS     // Catch: java.lang.Exception -> L18
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L18
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r3)     // Catch: java.lang.Exception -> L18
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L18
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L18
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = (com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite) r0     // Catch: java.lang.Exception -> L18
            return r0
        L18:
            r0 = move-exception
            return r1
    }

    static boolean isFullRegistry(com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r2) {
            java.lang.Class<?> r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryFactory.EXTENSION_REGISTRY_CLASS
            if (r0 == 0) goto L12
            java.lang.Class<?> r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryFactory.EXTENSION_REGISTRY_CLASS
            java.lang.Class r1 = r2.getClass()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    static java.lang.Class<?> reflectExtensionRegistry() {
            java.lang.String r0 = "com.google.crypto.tink.shaded.protobuf.ExtensionRegistry"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L7
            return r0
        L7:
            r0 = move-exception
            r1 = 0
            return r1
    }
}
