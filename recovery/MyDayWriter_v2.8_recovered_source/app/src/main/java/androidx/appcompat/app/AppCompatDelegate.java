package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppCompatDelegate {
    static final java.lang.String APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME = "androidx.appcompat.app.AppLocalesMetadataHolderService";
    static final boolean DEBUG = false;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    public static final int FEATURE_SUPPORT_ACTION_BAR = 108;
    public static final int FEATURE_SUPPORT_ACTION_BAR_OVERLAY = 109;

    @java.lang.Deprecated
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_AUTO_BATTERY = 3;

    @java.lang.Deprecated
    public static final int MODE_NIGHT_AUTO_TIME = 0;
    public static final int MODE_NIGHT_FOLLOW_SYSTEM = -1;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_UNSPECIFIED = -100;
    public static final int MODE_NIGHT_YES = 2;
    static final java.lang.String TAG = "AppCompatDelegate";
    private static final androidx.collection.ArraySet<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> sActivityDelegates = null;
    private static final java.lang.Object sActivityDelegatesLock = null;
    private static final java.lang.Object sAppLocalesStorageSyncLock = null;
    private static int sDefaultNightMode;
    private static java.lang.Boolean sIsAutoStoreLocalesOptedIn;
    private static boolean sIsFrameworkSyncChecked;
    private static androidx.core.os.LocaleListCompat sRequestedAppLocales;
    static androidx.appcompat.app.AppCompatDelegate.SerialExecutor sSerialExecutorForLocalesStorage;
    private static androidx.core.os.LocaleListCompat sStoredAppLocales;

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.os.LocaleList localeListForLanguageTags(java.lang.String r1) {
                android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r1)
                return r0
        }
    }

    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.os.LocaleList localeManagerGetApplicationLocales(java.lang.Object r2) {
                r0 = r2
                android.app.LocaleManager r0 = (android.app.LocaleManager) r0
                android.os.LocaleList r1 = r0.getApplicationLocales()
                return r1
        }

        static void localeManagerSetApplicationLocales(java.lang.Object r1, android.os.LocaleList r2) {
                r0 = r1
                android.app.LocaleManager r0 = (android.app.LocaleManager) r0
                r0.setApplicationLocales(r2)
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface NightMode {
    }

    static class SerialExecutor implements java.util.concurrent.Executor {
        java.lang.Runnable mActive;
        final java.util.concurrent.Executor mExecutor;
        private final java.lang.Object mLock;
        final java.util.Queue<java.lang.Runnable> mTasks;

        SerialExecutor(java.util.concurrent.Executor r2) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.mLock = r0
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                r0.<init>()
                r1.mTasks = r0
                r1.mExecutor = r2
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r4) {
                r3 = this;
                java.lang.Object r0 = r3.mLock
                monitor-enter(r0)
                java.util.Queue<java.lang.Runnable> r1 = r3.mTasks     // Catch: java.lang.Throwable -> L16
                androidx.appcompat.app.AppCompatDelegate$SerialExecutor$$ExternalSyntheticLambda0 r2 = new androidx.appcompat.app.AppCompatDelegate$SerialExecutor$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L16
                r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L16
                r1.add(r2)     // Catch: java.lang.Throwable -> L16
                java.lang.Runnable r1 = r3.mActive     // Catch: java.lang.Throwable -> L16
                if (r1 != 0) goto L14
                r3.scheduleNext()     // Catch: java.lang.Throwable -> L16
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                return
            L16:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                throw r1
        }

        /* JADX INFO: renamed from: lambda$execute$0$androidx-appcompat-app-AppCompatDelegate$SerialExecutor, reason: not valid java name */
        /* synthetic */ void m16x45c145d(java.lang.Runnable r2) {
                r1 = this;
                r2.run()     // Catch: java.lang.Throwable -> L8
                r1.scheduleNext()
                return
            L8:
                r0 = move-exception
                r1.scheduleNext()
                throw r0
        }

        protected void scheduleNext() {
                r3 = this;
                java.lang.Object r0 = r3.mLock
                monitor-enter(r0)
                java.util.Queue<java.lang.Runnable> r1 = r3.mTasks     // Catch: java.lang.Throwable -> L18
                java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L18
                java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L18
                r3.mActive = r1     // Catch: java.lang.Throwable -> L18
                if (r1 == 0) goto L16
                java.util.concurrent.Executor r1 = r3.mExecutor     // Catch: java.lang.Throwable -> L18
                java.lang.Runnable r2 = r3.mActive     // Catch: java.lang.Throwable -> L18
                r1.execute(r2)     // Catch: java.lang.Throwable -> L18
            L16:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                return
            L18:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
                throw r1
        }
    }

    static class ThreadPerTaskExecutor implements java.util.concurrent.Executor {
        ThreadPerTaskExecutor() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r2) {
                r1 = this;
                java.lang.Thread r0 = new java.lang.Thread
                r0.<init>(r2)
                r0.start()
                return
        }
    }

    static {
            androidx.appcompat.app.AppCompatDelegate$SerialExecutor r0 = new androidx.appcompat.app.AppCompatDelegate$SerialExecutor
            androidx.appcompat.app.AppCompatDelegate$ThreadPerTaskExecutor r1 = new androidx.appcompat.app.AppCompatDelegate$ThreadPerTaskExecutor
            r1.<init>()
            r0.<init>(r1)
            androidx.appcompat.app.AppCompatDelegate.sSerialExecutorForLocalesStorage = r0
            r0 = -100
            androidx.appcompat.app.AppCompatDelegate.sDefaultNightMode = r0
            r0 = 0
            androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales = r0
            androidx.appcompat.app.AppCompatDelegate.sStoredAppLocales = r0
            androidx.appcompat.app.AppCompatDelegate.sIsAutoStoreLocalesOptedIn = r0
            r0 = 0
            androidx.appcompat.app.AppCompatDelegate.sIsFrameworkSyncChecked = r0
            androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
            r0.<init>()
            androidx.appcompat.app.AppCompatDelegate.sActivityDelegates = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.appcompat.app.AppCompatDelegate.sActivityDelegatesLock = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.appcompat.app.AppCompatDelegate.sAppLocalesStorageSyncLock = r0
            return
    }

    AppCompatDelegate() {
            r0 = this;
            r0.<init>()
            return
    }

    static void addActiveDelegate(androidx.appcompat.app.AppCompatDelegate r3) {
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegatesLock
            monitor-enter(r0)
            removeDelegateFromActives(r3)     // Catch: java.lang.Throwable -> L12
            androidx.collection.ArraySet<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> r1 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegates     // Catch: java.lang.Throwable -> L12
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L12
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L12
            r1.add(r2)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    private static void applyDayNightToActiveDelegates() {
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegatesLock
            monitor-enter(r0)
            androidx.collection.ArraySet<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> r1 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegates     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L23
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L23
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L23
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L23
            androidx.appcompat.app.AppCompatDelegate r3 = (androidx.appcompat.app.AppCompatDelegate) r3     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto L20
            r3.applyDayNight()     // Catch: java.lang.Throwable -> L23
        L20:
            goto L9
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r1
    }

    private static void applyLocalesToActiveDelegates() {
            androidx.collection.ArraySet<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> r0 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegates
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            androidx.appcompat.app.AppCompatDelegate r2 = (androidx.appcompat.app.AppCompatDelegate) r2
            if (r2 == 0) goto L1d
            r2.applyAppLocales()
        L1d:
            goto L6
        L1e:
            return
    }

    public static androidx.appcompat.app.AppCompatDelegate create(android.app.Activity r1, androidx.appcompat.app.AppCompatCallback r2) {
            androidx.appcompat.app.AppCompatDelegateImpl r0 = new androidx.appcompat.app.AppCompatDelegateImpl
            r0.<init>(r1, r2)
            return r0
    }

    public static androidx.appcompat.app.AppCompatDelegate create(android.app.Dialog r1, androidx.appcompat.app.AppCompatCallback r2) {
            androidx.appcompat.app.AppCompatDelegateImpl r0 = new androidx.appcompat.app.AppCompatDelegateImpl
            r0.<init>(r1, r2)
            return r0
    }

    public static androidx.appcompat.app.AppCompatDelegate create(android.content.Context r1, android.app.Activity r2, androidx.appcompat.app.AppCompatCallback r3) {
            androidx.appcompat.app.AppCompatDelegateImpl r0 = new androidx.appcompat.app.AppCompatDelegateImpl
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static androidx.appcompat.app.AppCompatDelegate create(android.content.Context r1, android.view.Window r2, androidx.appcompat.app.AppCompatCallback r3) {
            androidx.appcompat.app.AppCompatDelegateImpl r0 = new androidx.appcompat.app.AppCompatDelegateImpl
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static androidx.core.os.LocaleListCompat getApplicationLocales() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L16
            java.lang.Object r0 = getLocaleManagerForApplication()
            if (r0 == 0) goto L15
            android.os.LocaleList r1 = androidx.appcompat.app.AppCompatDelegate.Api33Impl.localeManagerGetApplicationLocales(r0)
            androidx.core.os.LocaleListCompat r1 = androidx.core.os.LocaleListCompat.wrap(r1)
            return r1
        L15:
            goto L1d
        L16:
            androidx.core.os.LocaleListCompat r0 = androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales
            if (r0 == 0) goto L1d
            androidx.core.os.LocaleListCompat r0 = androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales
            return r0
        L1d:
            androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.getEmptyLocaleList()
            return r0
    }

    public static int getDefaultNightMode() {
            int r0 = androidx.appcompat.app.AppCompatDelegate.sDefaultNightMode
            return r0
    }

    static java.lang.Object getLocaleManagerForApplication() {
            androidx.collection.ArraySet<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> r0 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegates
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            androidx.appcompat.app.AppCompatDelegate r2 = (androidx.appcompat.app.AppCompatDelegate) r2
            if (r2 == 0) goto L27
            android.content.Context r3 = r2.getContextForDelegate()
            if (r3 == 0) goto L27
            java.lang.String r0 = "locale"
            java.lang.Object r0 = r3.getSystemService(r0)
            return r0
        L27:
            goto L6
        L28:
            r0 = 0
            return r0
    }

    static androidx.core.os.LocaleListCompat getRequestedAppLocales() {
            androidx.core.os.LocaleListCompat r0 = androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales
            return r0
    }

    static androidx.core.os.LocaleListCompat getStoredAppLocales() {
            androidx.core.os.LocaleListCompat r0 = androidx.appcompat.app.AppCompatDelegate.sStoredAppLocales
            return r0
    }

    static boolean isAutoStorageOptedIn(android.content.Context r3) {
            java.lang.Boolean r0 = androidx.appcompat.app.AppCompatDelegate.sIsAutoStoreLocalesOptedIn
            if (r0 != 0) goto L2a
            android.content.pm.ServiceInfo r0 = androidx.appcompat.app.AppLocalesMetadataHolderService.getServiceInfo(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            android.os.Bundle r1 = r0.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            if (r1 == 0) goto L1a
            android.os.Bundle r1 = r0.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            java.lang.String r2 = "autoStoreLocales"
            boolean r1 = r1.getBoolean(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            androidx.appcompat.app.AppCompatDelegate.sIsAutoStoreLocalesOptedIn = r1     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
        L1a:
            goto L2a
        L1b:
            r0 = move-exception
            java.lang.String r1 = "AppCompatDelegate"
            java.lang.String r2 = "Checking for metadata for AppLocalesMetadataHolderService : Service not found"
            android.util.Log.d(r1, r2)
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            androidx.appcompat.app.AppCompatDelegate.sIsAutoStoreLocalesOptedIn = r1
        L2a:
            java.lang.Boolean r0 = androidx.appcompat.app.AppCompatDelegate.sIsAutoStoreLocalesOptedIn
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
            boolean r0 = androidx.appcompat.widget.VectorEnabledTintResources.isCompatVectorFromResourcesEnabled()
            return r0
    }

    static /* synthetic */ void lambda$asyncExecuteSyncRequestedAndStoredLocales$0(android.content.Context r0) {
            syncRequestedAndStoredLocales(r0)
            return
    }

    static /* synthetic */ void lambda$syncRequestedAndStoredLocales$1(android.content.Context r1) {
            syncLocalesToFramework(r1)
            r0 = 1
            androidx.appcompat.app.AppCompatDelegate.sIsFrameworkSyncChecked = r0
            return
    }

    static void removeActivityDelegate(androidx.appcompat.app.AppCompatDelegate r2) {
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegatesLock
            monitor-enter(r0)
            removeDelegateFromActives(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    private static void removeDelegateFromActives(androidx.appcompat.app.AppCompatDelegate r3) {
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegatesLock
            monitor-enter(r0)
            androidx.collection.ArraySet<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> r1 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegates     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L25
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L25
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L25
            androidx.appcompat.app.AppCompatDelegate r2 = (androidx.appcompat.app.AppCompatDelegate) r2     // Catch: java.lang.Throwable -> L25
            if (r2 == r3) goto L1f
            if (r2 != 0) goto L22
        L1f:
            r1.remove()     // Catch: java.lang.Throwable -> L25
        L22:
            goto L9
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r1
    }

    static void resetStaticRequestedAndStoredLocales() {
            r0 = 0
            androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales = r0
            androidx.appcompat.app.AppCompatDelegate.sStoredAppLocales = r0
            return
    }

    public static void setApplicationLocales(androidx.core.os.LocaleListCompat r2) {
            java.util.Objects.requireNonNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1c
            java.lang.Object r0 = getLocaleManagerForApplication()
            if (r0 == 0) goto L1b
        L10:
            java.lang.String r1 = r2.toLanguageTags()
            android.os.LocaleList r1 = androidx.appcompat.app.AppCompatDelegate.Api24Impl.localeListForLanguageTags(r1)
            androidx.appcompat.app.AppCompatDelegate.Api33Impl.localeManagerSetApplicationLocales(r0, r1)
        L1b:
            goto L31
        L1c:
            androidx.core.os.LocaleListCompat r0 = androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L31
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegatesLock
            monitor-enter(r0)
            androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales = r2     // Catch: java.lang.Throwable -> L2e
            applyLocalesToActiveDelegates()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            goto L31
        L2e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r1
        L31:
            return
    }

    public static void setCompatVectorFromResourcesEnabled(boolean r0) {
            androidx.appcompat.widget.VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(r0)
            return
    }

    public static void setDefaultNightMode(int r2) {
            switch(r2) {
                case -1: goto Lb;
                case 0: goto Lb;
                case 1: goto Lb;
                case 2: goto Lb;
                case 3: goto Lb;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "AppCompatDelegate"
            java.lang.String r1 = "setDefaultNightMode() called with an unknown mode"
            android.util.Log.d(r0, r1)
            goto L14
        Lb:
            int r0 = androidx.appcompat.app.AppCompatDelegate.sDefaultNightMode
            if (r0 == r2) goto L14
            androidx.appcompat.app.AppCompatDelegate.sDefaultNightMode = r2
            applyDayNightToActiveDelegates()
        L14:
            return
    }

    static void setIsAutoStoreLocalesOptedIn(boolean r1) {
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            androidx.appcompat.app.AppCompatDelegate.sIsAutoStoreLocalesOptedIn = r0
            return
    }

    static void syncLocalesToFramework(android.content.Context r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L3d
            android.content.ComponentName r0 = new android.content.ComponentName
            java.lang.String r1 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r0.<init>(r5, r1)
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            int r1 = r1.getComponentEnabledSetting(r0)
            r2 = 1
            if (r1 == r2) goto L3d
            androidx.core.os.LocaleListCompat r1 = getApplicationLocales()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L36
            java.lang.String r1 = androidx.core.app.AppLocalesStorageHelper.readLocales(r5)
            java.lang.String r3 = "locale"
            java.lang.Object r3 = r5.getSystemService(r3)
            if (r3 == 0) goto L36
        L2f:
            android.os.LocaleList r4 = androidx.appcompat.app.AppCompatDelegate.Api24Impl.localeListForLanguageTags(r1)
            androidx.appcompat.app.AppCompatDelegate.Api33Impl.localeManagerSetApplicationLocales(r3, r4)
        L36:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            r1.setComponentEnabledSetting(r0, r2, r2)
        L3d:
            return
    }

    static void syncRequestedAndStoredLocales(android.content.Context r3) {
            boolean r0 = isAutoStorageOptedIn(r3)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1c
            boolean r0 = androidx.appcompat.app.AppCompatDelegate.sIsFrameworkSyncChecked
            if (r0 != 0) goto L59
            androidx.appcompat.app.AppCompatDelegate$SerialExecutor r0 = androidx.appcompat.app.AppCompatDelegate.sSerialExecutorForLocalesStorage
            androidx.appcompat.app.AppCompatDelegate$$ExternalSyntheticLambda0 r1 = new androidx.appcompat.app.AppCompatDelegate$$ExternalSyntheticLambda0
            r1.<init>(r3)
            r0.execute(r1)
            goto L59
        L1c:
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.sAppLocalesStorageSyncLock
            monitor-enter(r0)
            androidx.core.os.LocaleListCompat r1 = androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales     // Catch: java.lang.Throwable -> L5a
            if (r1 != 0) goto L41
            androidx.core.os.LocaleListCompat r1 = androidx.appcompat.app.AppCompatDelegate.sStoredAppLocales     // Catch: java.lang.Throwable -> L5a
            if (r1 != 0) goto L32
        L28:
            java.lang.String r1 = androidx.core.app.AppLocalesStorageHelper.readLocales(r3)     // Catch: java.lang.Throwable -> L5a
            androidx.core.os.LocaleListCompat r1 = androidx.core.os.LocaleListCompat.forLanguageTags(r1)     // Catch: java.lang.Throwable -> L5a
            androidx.appcompat.app.AppCompatDelegate.sStoredAppLocales = r1     // Catch: java.lang.Throwable -> L5a
        L32:
            androidx.core.os.LocaleListCompat r1 = androidx.appcompat.app.AppCompatDelegate.sStoredAppLocales     // Catch: java.lang.Throwable -> L5a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L3c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            return
        L3c:
            androidx.core.os.LocaleListCompat r1 = androidx.appcompat.app.AppCompatDelegate.sStoredAppLocales     // Catch: java.lang.Throwable -> L5a
            androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales = r1     // Catch: java.lang.Throwable -> L5a
            goto L58
        L41:
            androidx.core.os.LocaleListCompat r1 = androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales     // Catch: java.lang.Throwable -> L5a
            androidx.core.os.LocaleListCompat r2 = androidx.appcompat.app.AppCompatDelegate.sStoredAppLocales     // Catch: java.lang.Throwable -> L5a
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L5a
            if (r1 != 0) goto L58
            androidx.core.os.LocaleListCompat r1 = androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales     // Catch: java.lang.Throwable -> L5a
            androidx.appcompat.app.AppCompatDelegate.sStoredAppLocales = r1     // Catch: java.lang.Throwable -> L5a
            androidx.core.os.LocaleListCompat r1 = androidx.appcompat.app.AppCompatDelegate.sRequestedAppLocales     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = r1.toLanguageTags()     // Catch: java.lang.Throwable -> L5a
            androidx.core.app.AppLocalesStorageHelper.persistLocales(r3, r1)     // Catch: java.lang.Throwable -> L5a
        L58:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
        L59:
            return
        L5a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
            throw r1
    }

    public abstract void addContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2);

    boolean applyAppLocales() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract boolean applyDayNight();

    void asyncExecuteSyncRequestedAndStoredLocales(android.content.Context r3) {
            r2 = this;
            androidx.appcompat.app.AppCompatDelegate$SerialExecutor r0 = androidx.appcompat.app.AppCompatDelegate.sSerialExecutorForLocalesStorage
            androidx.appcompat.app.AppCompatDelegate$$ExternalSyntheticLambda1 r1 = new androidx.appcompat.app.AppCompatDelegate$$ExternalSyntheticLambda1
            r1.<init>(r3)
            r0.execute(r1)
            return
    }

    @java.lang.Deprecated
    public void attachBaseContext(android.content.Context r1) {
            r0 = this;
            return
    }

    public android.content.Context attachBaseContext2(android.content.Context r1) {
            r0 = this;
            r0.attachBaseContext(r1)
            return r1
    }

    public abstract android.view.View createView(android.view.View r1, java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4);

    public abstract <T extends android.view.View> T findViewById(int r1);

    public android.content.Context getContextForDelegate() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract androidx.appcompat.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();

    public int getLocalNightMode() {
            r1 = this;
            r0 = -100
            return r0
    }

    public abstract android.view.MenuInflater getMenuInflater();

    public abstract androidx.appcompat.app.ActionBar getSupportActionBar();

    public abstract boolean hasWindowFeature(int r1);

    public abstract void installViewFactory();

    public abstract void invalidateOptionsMenu();

    public abstract boolean isHandleNativeActionModesEnabled();

    public abstract void onConfigurationChanged(android.content.res.Configuration r1);

    public abstract void onCreate(android.os.Bundle r1);

    public abstract void onDestroy();

    public abstract void onPostCreate(android.os.Bundle r1);

    public abstract void onPostResume();

    public abstract void onSaveInstanceState(android.os.Bundle r1);

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int r1);

    public abstract void setContentView(int r1);

    public abstract void setContentView(android.view.View r1);

    public abstract void setContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2);

    public abstract void setHandleNativeActionModesEnabled(boolean r1);

    public abstract void setLocalNightMode(int r1);

    public void setOnBackInvokedDispatcher(android.window.OnBackInvokedDispatcher r1) {
            r0 = this;
            return
    }

    public abstract void setSupportActionBar(androidx.appcompat.widget.Toolbar r1);

    public void setTheme(int r1) {
            r0 = this;
            return
    }

    public abstract void setTitle(java.lang.CharSequence r1);

    public abstract androidx.appcompat.view.ActionMode startSupportActionMode(androidx.appcompat.view.ActionMode.Callback r1);
}
