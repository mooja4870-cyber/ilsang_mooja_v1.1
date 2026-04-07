package androidx.startup;

/* JADX INFO: loaded from: classes.dex */
public final class AppInitializer {
    private static final java.lang.String SECTION_NAME = "Startup";
    private static volatile androidx.startup.AppInitializer sInstance;
    private static final java.lang.Object sLock = null;
    final android.content.Context mContext;
    final java.util.Set<java.lang.Class<? extends androidx.startup.Initializer<?>>> mDiscovered;
    final java.util.Map<java.lang.Class<?>, java.lang.Object> mInitialized;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.startup.AppInitializer.sLock = r0
            return
    }

    AppInitializer(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.content.Context r0 = r2.getApplicationContext()
            r1.mContext = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.mDiscovered = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mInitialized = r0
            return
    }

    private <T> T doInitialize(java.lang.Class<? extends androidx.startup.Initializer<?>> r8, java.util.Set<java.lang.Class<?>> r9) {
            r7 = this;
            boolean r0 = androidx.tracing.Trace.isEnabled()
            if (r0 == 0) goto Ld
            java.lang.String r1 = r8.getSimpleName()     // Catch: java.lang.Throwable -> L8b
            androidx.tracing.Trace.beginSection(r1)     // Catch: java.lang.Throwable -> L8b
        Ld:
            boolean r1 = r9.contains(r8)     // Catch: java.lang.Throwable -> L8b
            if (r1 != 0) goto L77
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r7.mInitialized     // Catch: java.lang.Throwable -> L8b
            boolean r1 = r1.containsKey(r8)     // Catch: java.lang.Throwable -> L8b
            if (r1 != 0) goto L6b
            r9.add(r8)     // Catch: java.lang.Throwable -> L8b
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L64
            java.lang.reflect.Constructor r2 = r8.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> L64
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L64
            java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.Throwable -> L64
            r2 = r1
            androidx.startup.Initializer r2 = (androidx.startup.Initializer) r2     // Catch: java.lang.Throwable -> L64
            java.util.List r3 = r2.dependencies()     // Catch: java.lang.Throwable -> L64
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L64
            if (r4 != 0) goto L55
            java.util.Iterator r4 = r3.iterator()     // Catch: java.lang.Throwable -> L64
        L3d:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L64
            java.lang.Class r5 = (java.lang.Class) r5     // Catch: java.lang.Throwable -> L64
            java.util.Map<java.lang.Class<?>, java.lang.Object> r6 = r7.mInitialized     // Catch: java.lang.Throwable -> L64
            boolean r6 = r6.containsKey(r5)     // Catch: java.lang.Throwable -> L64
            if (r6 != 0) goto L54
            r7.doInitialize(r5, r9)     // Catch: java.lang.Throwable -> L64
        L54:
            goto L3d
        L55:
            android.content.Context r4 = r7.mContext     // Catch: java.lang.Throwable -> L64
            java.lang.Object r4 = r2.create(r4)     // Catch: java.lang.Throwable -> L64
            r9.remove(r8)     // Catch: java.lang.Throwable -> L64
            java.util.Map<java.lang.Class<?>, java.lang.Object> r5 = r7.mInitialized     // Catch: java.lang.Throwable -> L64
            r5.put(r8, r4)     // Catch: java.lang.Throwable -> L64
            goto L72
        L64:
            r1 = move-exception
            androidx.startup.StartupException r2 = new androidx.startup.StartupException     // Catch: java.lang.Throwable -> L8b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L8b
            throw r2     // Catch: java.lang.Throwable -> L8b
        L6b:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r7.mInitialized     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L8b
            r4 = r1
        L72:
            androidx.tracing.Trace.endSection()
            return r4
        L77:
            java.lang.String r1 = "Cannot initialize %s. Cycle detected."
            java.lang.String r2 = r8.getName()     // Catch: java.lang.Throwable -> L8b
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch: java.lang.Throwable -> L8b
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L8b
            throw r2     // Catch: java.lang.Throwable -> L8b
        L8b:
            r1 = move-exception
            androidx.tracing.Trace.endSection()
            throw r1
    }

    public static androidx.startup.AppInitializer getInstance(android.content.Context r2) {
            androidx.startup.AppInitializer r0 = androidx.startup.AppInitializer.sInstance
            if (r0 != 0) goto L17
            java.lang.Object r0 = androidx.startup.AppInitializer.sLock
            monitor-enter(r0)
            androidx.startup.AppInitializer r1 = androidx.startup.AppInitializer.sInstance     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            androidx.startup.AppInitializer r1 = new androidx.startup.AppInitializer     // Catch: java.lang.Throwable -> L14
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L14
            androidx.startup.AppInitializer.sInstance = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            androidx.startup.AppInitializer r0 = androidx.startup.AppInitializer.sInstance
            return r0
    }

    static void setDelegate(androidx.startup.AppInitializer r2) {
            java.lang.Object r0 = androidx.startup.AppInitializer.sLock
            monitor-enter(r0)
            androidx.startup.AppInitializer.sInstance = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    void discoverAndInitialize() {
            r3 = this;
            java.lang.String r0 = "Startup"
            androidx.tracing.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L2c android.content.pm.PackageManager.NameNotFoundException -> L2e
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L2c android.content.pm.PackageManager.NameNotFoundException -> L2e
            android.content.Context r1 = r3.mContext     // Catch: java.lang.Throwable -> L2c android.content.pm.PackageManager.NameNotFoundException -> L2e
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L2c android.content.pm.PackageManager.NameNotFoundException -> L2e
            java.lang.Class<androidx.startup.InitializationProvider> r2 = androidx.startup.InitializationProvider.class
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L2c android.content.pm.PackageManager.NameNotFoundException -> L2e
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L2c android.content.pm.PackageManager.NameNotFoundException -> L2e
            android.content.Context r1 = r3.mContext     // Catch: java.lang.Throwable -> L2c android.content.pm.PackageManager.NameNotFoundException -> L2e
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L2c android.content.pm.PackageManager.NameNotFoundException -> L2e
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ProviderInfo r1 = r1.getProviderInfo(r0, r2)     // Catch: java.lang.Throwable -> L2c android.content.pm.PackageManager.NameNotFoundException -> L2e
            android.os.Bundle r2 = r1.metaData     // Catch: java.lang.Throwable -> L2c android.content.pm.PackageManager.NameNotFoundException -> L2e
            r3.discoverAndInitialize(r2)     // Catch: java.lang.Throwable -> L2c android.content.pm.PackageManager.NameNotFoundException -> L2e
            androidx.tracing.Trace.endSection()
            return
        L2c:
            r0 = move-exception
            goto L35
        L2e:
            r0 = move-exception
            androidx.startup.StartupException r1 = new androidx.startup.StartupException     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            throw r1     // Catch: java.lang.Throwable -> L2c
        L35:
            androidx.tracing.Trace.endSection()
            throw r0
    }

    void discoverAndInitialize(android.os.Bundle r10) {
            r9 = this;
            android.content.Context r0 = r9.mContext
            int r1 = androidx.startup.R.string.androidx_startup
            java.lang.String r0 = r0.getString(r1)
            if (r10 == 0) goto L5f
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.ClassNotFoundException -> L58
            r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L58
            java.util.Set r2 = r10.keySet()     // Catch: java.lang.ClassNotFoundException -> L58
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.ClassNotFoundException -> L58
        L17:
            boolean r4 = r3.hasNext()     // Catch: java.lang.ClassNotFoundException -> L58
            if (r4 == 0) goto L41
            java.lang.Object r4 = r3.next()     // Catch: java.lang.ClassNotFoundException -> L58
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.ClassNotFoundException -> L58
            r5 = 0
            java.lang.String r5 = r10.getString(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L58
            boolean r6 = r0.equals(r5)     // Catch: java.lang.ClassNotFoundException -> L58
            if (r6 == 0) goto L40
            java.lang.Class r6 = java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L58
            java.lang.Class<androidx.startup.Initializer> r7 = androidx.startup.Initializer.class
            boolean r7 = r7.isAssignableFrom(r6)     // Catch: java.lang.ClassNotFoundException -> L58
            if (r7 == 0) goto L40
            r7 = r6
            java.util.Set<java.lang.Class<? extends androidx.startup.Initializer<?>>> r8 = r9.mDiscovered     // Catch: java.lang.ClassNotFoundException -> L58
            r8.add(r7)     // Catch: java.lang.ClassNotFoundException -> L58
        L40:
            goto L17
        L41:
            java.util.Set<java.lang.Class<? extends androidx.startup.Initializer<?>>> r3 = r9.mDiscovered     // Catch: java.lang.ClassNotFoundException -> L58
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.ClassNotFoundException -> L58
        L47:
            boolean r4 = r3.hasNext()     // Catch: java.lang.ClassNotFoundException -> L58
            if (r4 == 0) goto L5f
            java.lang.Object r4 = r3.next()     // Catch: java.lang.ClassNotFoundException -> L58
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.ClassNotFoundException -> L58
            r9.doInitialize(r4, r1)     // Catch: java.lang.ClassNotFoundException -> L58
            goto L47
        L58:
            r1 = move-exception
            androidx.startup.StartupException r2 = new androidx.startup.StartupException
            r2.<init>(r1)
            throw r2
        L5f:
            return
    }

    <T> T doInitialize(java.lang.Class<? extends androidx.startup.Initializer<?>> r4) {
            r3 = this;
            java.lang.Object r0 = androidx.startup.AppInitializer.sLock
            monitor-enter(r0)
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r3.mInitialized     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L15
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L17
            r2.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = r3.doInitialize(r4, r2)     // Catch: java.lang.Throwable -> L17
            r1 = r2
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r1
        L17:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    public <T> T initializeComponent(java.lang.Class<? extends androidx.startup.Initializer<T>> r2) {
            r1 = this;
            java.lang.Object r0 = r1.doInitialize(r2)
            return r0
    }

    public boolean isEagerlyInitialized(java.lang.Class<? extends androidx.startup.Initializer<?>> r2) {
            r1 = this;
            java.util.Set<java.lang.Class<? extends androidx.startup.Initializer<?>>> r0 = r1.mDiscovered
            boolean r0 = r0.contains(r2)
            return r0
    }
}
