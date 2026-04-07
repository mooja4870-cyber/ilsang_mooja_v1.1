package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes.dex */
public final class MutablePrimitiveRegistry {
    private static com.google.crypto.tink.internal.MutablePrimitiveRegistry globalInstance;
    private final java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.PrimitiveRegistry> registry;

    static {
            com.google.crypto.tink.internal.MutablePrimitiveRegistry r0 = new com.google.crypto.tink.internal.MutablePrimitiveRegistry
            r0.<init>()
            com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance = r0
            return
    }

    MutablePrimitiveRegistry() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            com.google.crypto.tink.internal.PrimitiveRegistry$Builder r1 = new com.google.crypto.tink.internal.PrimitiveRegistry$Builder
            r1.<init>()
            com.google.crypto.tink.internal.PrimitiveRegistry r1 = r1.build()
            r0.<init>(r1)
            r2.registry = r0
            return
    }

    public static com.google.crypto.tink.internal.MutablePrimitiveRegistry globalInstance() {
            com.google.crypto.tink.internal.MutablePrimitiveRegistry r0 = com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance
            return r0
    }

    public static void resetGlobalInstanceTestOnly() {
            com.google.crypto.tink.internal.MutablePrimitiveRegistry r0 = new com.google.crypto.tink.internal.MutablePrimitiveRegistry
            r0.<init>()
            com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance = r0
            return
    }

    public <WrapperPrimitiveT> java.lang.Class<?> getInputPrimitiveClass(java.lang.Class<WrapperPrimitiveT> r2) throws java.security.GeneralSecurityException {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.PrimitiveRegistry> r0 = r1.registry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.internal.PrimitiveRegistry r0 = (com.google.crypto.tink.internal.PrimitiveRegistry) r0
            java.lang.Class r0 = r0.getInputPrimitiveClass(r2)
            return r0
    }

    public <KeyT extends com.google.crypto.tink.Key, PrimitiveT> PrimitiveT getPrimitive(KeyT r2, java.lang.Class<PrimitiveT> r3) throws java.security.GeneralSecurityException {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.PrimitiveRegistry> r0 = r1.registry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.internal.PrimitiveRegistry r0 = (com.google.crypto.tink.internal.PrimitiveRegistry) r0
            java.lang.Object r0 = r0.getPrimitive(r2, r3)
            return r0
    }

    public synchronized <KeyT extends com.google.crypto.tink.Key, PrimitiveT> void registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor<KeyT, PrimitiveT> r3) throws java.security.GeneralSecurityException {
            r2 = this;
            monitor-enter(r2)
            com.google.crypto.tink.internal.PrimitiveRegistry$Builder r0 = new com.google.crypto.tink.internal.PrimitiveRegistry$Builder     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.PrimitiveRegistry> r1 = r2.registry     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1d
            com.google.crypto.tink.internal.PrimitiveRegistry r1 = (com.google.crypto.tink.internal.PrimitiveRegistry) r1     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            com.google.crypto.tink.internal.PrimitiveRegistry$Builder r0 = r0.registerPrimitiveConstructor(r3)     // Catch: java.lang.Throwable -> L1d
            com.google.crypto.tink.internal.PrimitiveRegistry r0 = r0.build()     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.PrimitiveRegistry> r1 = r2.registry     // Catch: java.lang.Throwable -> L1d
            r1.set(r0)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return
        L1d:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    public synchronized <InputPrimitiveT, WrapperPrimitiveT> void registerPrimitiveWrapper(com.google.crypto.tink.PrimitiveWrapper<InputPrimitiveT, WrapperPrimitiveT> r3) throws java.security.GeneralSecurityException {
            r2 = this;
            monitor-enter(r2)
            com.google.crypto.tink.internal.PrimitiveRegistry$Builder r0 = new com.google.crypto.tink.internal.PrimitiveRegistry$Builder     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.PrimitiveRegistry> r1 = r2.registry     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1d
            com.google.crypto.tink.internal.PrimitiveRegistry r1 = (com.google.crypto.tink.internal.PrimitiveRegistry) r1     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            com.google.crypto.tink.internal.PrimitiveRegistry$Builder r0 = r0.registerPrimitiveWrapper(r3)     // Catch: java.lang.Throwable -> L1d
            com.google.crypto.tink.internal.PrimitiveRegistry r0 = r0.build()     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.PrimitiveRegistry> r1 = r2.registry     // Catch: java.lang.Throwable -> L1d
            r1.set(r0)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return
        L1d:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT wrap(com.google.crypto.tink.PrimitiveSet<InputPrimitiveT> r2, java.lang.Class<WrapperPrimitiveT> r3) throws java.security.GeneralSecurityException {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.PrimitiveRegistry> r0 = r1.registry
            java.lang.Object r0 = r0.get()
            com.google.crypto.tink.internal.PrimitiveRegistry r0 = (com.google.crypto.tink.internal.PrimitiveRegistry) r0
            java.lang.Object r0 = r0.wrap(r2, r3)
            return r0
    }
}
