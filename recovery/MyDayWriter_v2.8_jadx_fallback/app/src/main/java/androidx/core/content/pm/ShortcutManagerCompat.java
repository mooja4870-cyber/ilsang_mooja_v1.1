package androidx.core.content.pm;

/* JADX INFO: loaded from: classes.dex */
public class ShortcutManagerCompat {
    static final java.lang.String ACTION_INSTALL_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";
    private static final int DEFAULT_MAX_ICON_DIMENSION_DP = 96;
    private static final int DEFAULT_MAX_ICON_DIMENSION_LOWRAM_DP = 48;
    public static final java.lang.String EXTRA_SHORTCUT_ID = "android.intent.extra.shortcut.ID";
    public static final int FLAG_MATCH_CACHED = 8;
    public static final int FLAG_MATCH_DYNAMIC = 2;
    public static final int FLAG_MATCH_MANIFEST = 1;
    public static final int FLAG_MATCH_PINNED = 4;
    static final java.lang.String INSTALL_SHORTCUT_PERMISSION = "com.android.launcher.permission.INSTALL_SHORTCUT";
    private static final java.lang.String SHORTCUT_LISTENER_INTENT_FILTER_ACTION = "androidx.core.content.pm.SHORTCUT_LISTENER";
    private static final java.lang.String SHORTCUT_LISTENER_META_DATA_KEY = "androidx.core.content.pm.shortcut_listener_impl";
    private static volatile java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> sShortcutInfoChangeListeners;
    private static volatile androidx.core.content.pm.ShortcutInfoCompatSaver<?> sShortcutInfoCompatSaver;


    private static class Api25Impl {
        private Api25Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String getShortcutInfoWithLowestRank(java.util.List<android.content.pm.ShortcutInfo> r5) {
                r0 = -1
                r1 = 0
                java.util.Iterator r2 = r5.iterator()
            L6:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L21
                java.lang.Object r3 = r2.next()
                android.content.pm.ShortcutInfo r3 = (android.content.pm.ShortcutInfo) r3
                int r4 = r3.getRank()
                if (r4 <= r0) goto L20
                java.lang.String r1 = r3.getId()
                int r0 = r3.getRank()
            L20:
                goto L6
            L21:
                return r1
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ShortcutMatchFlags {
    }

    static {
            r0 = 0
            androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver = r0
            androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners = r0
            return
    }

    private ShortcutManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean addDynamicShortcuts(android.content.Context r6, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r7) {
            r0 = 1
            java.util.List r1 = removeShortcutsExcludedFromSurface(r7, r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 > r3) goto Le
            convertUriIconsToBitmapIcons(r6, r1)
        Le:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 25
            if (r2 < r3) goto L41
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r1.iterator()
        L1d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r3.next()
            androidx.core.content.pm.ShortcutInfoCompat r4 = (androidx.core.content.pm.ShortcutInfoCompat) r4
            android.content.pm.ShortcutInfo r5 = r4.toShortcutInfo()
            r2.add(r5)
            goto L1d
        L31:
            java.lang.Class<android.content.pm.ShortcutManager> r3 = android.content.pm.ShortcutManager.class
            java.lang.Object r3 = r6.getSystemService(r3)
            android.content.pm.ShortcutManager r3 = (android.content.pm.ShortcutManager) r3
            boolean r3 = r3.addDynamicShortcuts(r2)
            if (r3 != 0) goto L41
            r0 = 0
            return r0
        L41:
            androidx.core.content.pm.ShortcutInfoCompatSaver r2 = getShortcutInfoSaverInstance(r6)
            r2.addShortcuts(r1)
            java.util.List r2 = getShortcutInfoListeners(r6)
            java.util.Iterator r2 = r2.iterator()
        L50:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L60
            java.lang.Object r3 = r2.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r3 = (androidx.core.content.pm.ShortcutInfoChangeListener) r3
            r3.onShortcutAdded(r7)
            goto L50
        L60:
            return r0
    }

    static boolean convertUriIconToBitmapIcon(android.content.Context r6, androidx.core.content.pm.ShortcutInfoCompat r7) {
            androidx.core.graphics.drawable.IconCompat r0 = r7.mIcon
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.core.graphics.drawable.IconCompat r0 = r7.mIcon
            int r0 = r0.mType
            r2 = 1
            r3 = 6
            if (r0 == r3) goto L12
            r4 = 4
            if (r0 == r4) goto L12
            return r2
        L12:
            androidx.core.graphics.drawable.IconCompat r4 = r7.mIcon
            java.io.InputStream r4 = r4.getUriInputStream(r6)
            if (r4 != 0) goto L1b
            return r1
        L1b:
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r4)
            if (r5 != 0) goto L22
            return r1
        L22:
            if (r0 != r3) goto L29
            androidx.core.graphics.drawable.IconCompat r1 = androidx.core.graphics.drawable.IconCompat.createWithAdaptiveBitmap(r5)
            goto L2d
        L29:
            androidx.core.graphics.drawable.IconCompat r1 = androidx.core.graphics.drawable.IconCompat.createWithBitmap(r5)
        L2d:
            r7.mIcon = r1
            return r2
    }

    static void convertUriIconsToBitmapIcons(android.content.Context r4, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            java.util.Iterator r1 = r0.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()
            androidx.core.content.pm.ShortcutInfoCompat r2 = (androidx.core.content.pm.ShortcutInfoCompat) r2
            boolean r3 = convertUriIconToBitmapIcon(r4, r2)
            if (r3 != 0) goto L1e
            r5.remove(r2)
        L1e:
            goto L9
        L1f:
            return
    }

    public static android.content.Intent createShortcutResultIntent(android.content.Context r3, androidx.core.content.pm.ShortcutInfoCompat r4) {
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L17
            java.lang.Class<android.content.pm.ShortcutManager> r1 = android.content.pm.ShortcutManager.class
            java.lang.Object r1 = r3.getSystemService(r1)
            android.content.pm.ShortcutManager r1 = (android.content.pm.ShortcutManager) r1
            android.content.pm.ShortcutInfo r2 = r4.toShortcutInfo()
            android.content.Intent r0 = r1.createShortcutResultIntent(r2)
        L17:
            if (r0 != 0) goto L1f
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r0 = r1
        L1f:
            android.content.Intent r1 = r4.addToIntent(r0)
            return r1
    }

    public static void disableShortcuts(android.content.Context r2, java.util.List<java.lang.String> r3, java.lang.CharSequence r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L11
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.disableShortcuts(r3, r4)
        L11:
            androidx.core.content.pm.ShortcutInfoCompatSaver r0 = getShortcutInfoSaverInstance(r2)
            r0.removeShortcuts(r3)
            java.util.List r0 = getShortcutInfoListeners(r2)
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r1 = (androidx.core.content.pm.ShortcutInfoChangeListener) r1
            r1.onShortcutRemoved(r3)
            goto L20
        L30:
            return
    }

    public static void enableShortcuts(android.content.Context r5, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r6) {
            r0 = 1
            java.util.List r0 = removeShortcutsExcludedFromSurface(r6, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 25
            if (r1 < r2) goto L35
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r6.size()
            r1.<init>(r2)
            java.util.Iterator r2 = r0.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r2.next()
            androidx.core.content.pm.ShortcutInfoCompat r3 = (androidx.core.content.pm.ShortcutInfoCompat) r3
            java.lang.String r4 = r3.mId
            r1.add(r4)
            goto L18
        L2a:
            java.lang.Class<android.content.pm.ShortcutManager> r2 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r5.getSystemService(r2)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            r2.enableShortcuts(r1)
        L35:
            androidx.core.content.pm.ShortcutInfoCompatSaver r1 = getShortcutInfoSaverInstance(r5)
            r1.addShortcuts(r0)
            java.util.List r1 = getShortcutInfoListeners(r5)
            java.util.Iterator r1 = r1.iterator()
        L44:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r1.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r2 = (androidx.core.content.pm.ShortcutInfoChangeListener) r2
            r2.onShortcutAdded(r6)
            goto L44
        L54:
            return
    }

    public static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> getDynamicShortcuts(android.content.Context r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L39
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r5.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            java.util.List r0 = r0.getDynamicShortcuts()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r2 = r0.iterator()
        L1f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r3 = r2.next()
            android.content.pm.ShortcutInfo r3 = (android.content.pm.ShortcutInfo) r3
            androidx.core.content.pm.ShortcutInfoCompat$Builder r4 = new androidx.core.content.pm.ShortcutInfoCompat$Builder
            r4.<init>(r5, r3)
            androidx.core.content.pm.ShortcutInfoCompat r4 = r4.build()
            r1.add(r4)
            goto L1f
        L38:
            return r1
        L39:
            androidx.core.content.pm.ShortcutInfoCompatSaver r0 = getShortcutInfoSaverInstance(r5)     // Catch: java.lang.Exception -> L42
            java.util.List r0 = r0.getShortcuts()     // Catch: java.lang.Exception -> L42
            return r0
        L42:
            r0 = move-exception
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    private static int getIconDimensionInternal(android.content.Context r6, boolean r7) {
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r1 = 1
            if (r0 == 0) goto L15
            boolean r2 = r0.isLowRamDevice()
            if (r2 == 0) goto L13
            goto L15
        L13:
            r2 = 0
            goto L16
        L15:
            r2 = r1
        L16:
            if (r2 == 0) goto L1b
            r3 = 48
            goto L1d
        L1b:
            r3 = 96
        L1d:
            int r1 = java.lang.Math.max(r1, r3)
            android.content.res.Resources r3 = r6.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            if (r7 == 0) goto L2e
            float r4 = r3.xdpi
            goto L30
        L2e:
            float r4 = r3.ydpi
        L30:
            r5 = 1126170624(0x43200000, float:160.0)
            float r4 = r4 / r5
            float r5 = (float) r1
            float r5 = r5 * r4
            int r5 = (int) r5
            return r5
    }

    public static int getIconMaxHeight(android.content.Context r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L16
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            int r0 = r0.getIconMaxHeight()
            return r0
        L16:
            r0 = 0
            int r0 = getIconDimensionInternal(r2, r0)
            return r0
    }

    public static int getIconMaxWidth(android.content.Context r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L16
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            int r0 = r0.getIconMaxWidth()
            return r0
        L16:
            r0 = 1
            int r0 = getIconDimensionInternal(r2, r0)
            return r0
    }

    public static int getMaxShortcutCountPerActivity(android.content.Context r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L16
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            int r0 = r0.getMaxShortcutCountPerActivity()
            return r0
        L16:
            r0 = 5
            return r0
    }

    static java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> getShortcutInfoChangeListeners() {
            java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> r0 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners
            return r0
    }

    private static java.lang.String getShortcutInfoCompatWithLowestRank(java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r5) {
            r0 = -1
            r1 = 0
            java.util.Iterator r2 = r5.iterator()
        L6:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L21
            java.lang.Object r3 = r2.next()
            androidx.core.content.pm.ShortcutInfoCompat r3 = (androidx.core.content.pm.ShortcutInfoCompat) r3
            int r4 = r3.getRank()
            if (r4 <= r0) goto L20
            java.lang.String r1 = r3.getId()
            int r0 = r3.getRank()
        L20:
            goto L6
        L21:
            return r1
    }

    private static java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> getShortcutInfoListeners(android.content.Context r15) {
            java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> r0 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners
            if (r0 != 0) goto L76
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.pm.PackageManager r1 = r15.getPackageManager()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.core.content.pm.SHORTCUT_LISTENER"
            r2.<init>(r3)
            java.lang.String r3 = r15.getPackageName()
            r2.setPackage(r3)
            r3 = 128(0x80, float:1.8E-43)
            java.util.List r3 = r1.queryIntentActivities(r2, r3)
            java.util.Iterator r4 = r3.iterator()
        L26:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L70
            java.lang.Object r5 = r4.next()
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            android.content.pm.ActivityInfo r6 = r5.activityInfo
            if (r6 != 0) goto L37
            goto L26
        L37:
            android.os.Bundle r7 = r6.metaData
            if (r7 != 0) goto L3c
            goto L26
        L3c:
            java.lang.String r8 = "androidx.core.content.pm.shortcut_listener_impl"
            java.lang.String r8 = r7.getString(r8)
            if (r8 != 0) goto L46
            goto L26
        L46:
            java.lang.Class<androidx.core.content.pm.ShortcutManagerCompat> r9 = androidx.core.content.pm.ShortcutManagerCompat.class
            java.lang.ClassLoader r9 = r9.getClassLoader()     // Catch: java.lang.Exception -> L6e
            r10 = 0
            java.lang.Class r11 = java.lang.Class.forName(r8, r10, r9)     // Catch: java.lang.Exception -> L6e
            java.lang.String r12 = "getInstance"
            r13 = 1
            java.lang.Class[] r13 = new java.lang.Class[r13]     // Catch: java.lang.Exception -> L6e
            java.lang.Class<android.content.Context> r14 = android.content.Context.class
            r13[r10] = r14     // Catch: java.lang.Exception -> L6e
            java.lang.reflect.Method r10 = r11.getMethod(r12, r13)     // Catch: java.lang.Exception -> L6e
            java.lang.Object[] r12 = new java.lang.Object[]{r15}     // Catch: java.lang.Exception -> L6e
            r13 = 0
            java.lang.Object r12 = r10.invoke(r13, r12)     // Catch: java.lang.Exception -> L6e
            androidx.core.content.pm.ShortcutInfoChangeListener r12 = (androidx.core.content.pm.ShortcutInfoChangeListener) r12     // Catch: java.lang.Exception -> L6e
            r0.add(r12)     // Catch: java.lang.Exception -> L6e
            goto L6f
        L6e:
            r9 = move-exception
        L6f:
            goto L26
        L70:
            java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> r1 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners
            if (r1 != 0) goto L76
            androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners = r0
        L76:
            java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> r0 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners
            return r0
    }

    private static androidx.core.content.pm.ShortcutInfoCompatSaver<?> getShortcutInfoSaverInstance(android.content.Context r6) {
            androidx.core.content.pm.ShortcutInfoCompatSaver<?> r0 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver
            if (r0 != 0) goto L3a
        L5:
            java.lang.Class<androidx.core.content.pm.ShortcutManagerCompat> r0 = androidx.core.content.pm.ShortcutManagerCompat.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = "androidx.sharetarget.ShortcutInfoCompatSaverImpl"
            r2 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r2, r0)     // Catch: java.lang.Exception -> L2d
            java.lang.String r3 = "getInstance"
            r4 = 1
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L2d
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r4[r2] = r5     // Catch: java.lang.Exception -> L2d
            java.lang.reflect.Method r2 = r1.getMethod(r3, r4)     // Catch: java.lang.Exception -> L2d
            java.lang.Object[] r3 = new java.lang.Object[]{r6}     // Catch: java.lang.Exception -> L2d
            r4 = 0
            java.lang.Object r3 = r2.invoke(r4, r3)     // Catch: java.lang.Exception -> L2d
            androidx.core.content.pm.ShortcutInfoCompatSaver r3 = (androidx.core.content.pm.ShortcutInfoCompatSaver) r3     // Catch: java.lang.Exception -> L2d
            androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver = r3     // Catch: java.lang.Exception -> L2d
            goto L2e
        L2d:
            r0 = move-exception
        L2e:
            androidx.core.content.pm.ShortcutInfoCompatSaver<?> r0 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver
            if (r0 != 0) goto L3a
            androidx.core.content.pm.ShortcutInfoCompatSaver$NoopImpl r0 = new androidx.core.content.pm.ShortcutInfoCompatSaver$NoopImpl
            r0.<init>()
            androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver = r0
        L3a:
            androidx.core.content.pm.ShortcutInfoCompatSaver<?> r0 = androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver
            return r0
    }

    public static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> getShortcuts(android.content.Context r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L17
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r3.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            java.util.List r0 = r0.getShortcuts(r4)
            java.util.List r1 = androidx.core.content.pm.ShortcutInfoCompat.fromShortcuts(r3, r0)
            return r1
        L17:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L50
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r3.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r4 & 1
            if (r2 == 0) goto L35
            java.util.List r2 = r0.getManifestShortcuts()
            r1.addAll(r2)
        L35:
            r2 = r4 & 2
            if (r2 == 0) goto L40
            java.util.List r2 = r0.getDynamicShortcuts()
            r1.addAll(r2)
        L40:
            r2 = r4 & 4
            if (r2 == 0) goto L4b
            java.util.List r2 = r0.getPinnedShortcuts()
            r1.addAll(r2)
        L4b:
            java.util.List r2 = androidx.core.content.pm.ShortcutInfoCompat.fromShortcuts(r3, r1)
            return r2
        L50:
            r0 = r4 & 2
            if (r0 == 0) goto L5e
            androidx.core.content.pm.ShortcutInfoCompatSaver r0 = getShortcutInfoSaverInstance(r3)     // Catch: java.lang.Exception -> L5d
            java.util.List r0 = r0.getShortcuts()     // Catch: java.lang.Exception -> L5d
            return r0
        L5d:
            r0 = move-exception
        L5e:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    public static boolean isRateLimitingActive(android.content.Context r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L16
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            boolean r0 = r0.isRateLimitingActive()
            return r0
        L16:
            r0 = 3
            java.util.List r0 = getShortcuts(r2, r0)
            int r0 = r0.size()
            int r1 = getMaxShortcutCountPerActivity(r2)
            if (r0 != r1) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
    }

    public static boolean isRequestPinShortcutSupported(android.content.Context r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L13
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r6.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            boolean r0 = r0.isRequestPinShortcutSupported()
            return r0
        L13:
            java.lang.String r0 = "com.android.launcher.permission.INSTALL_SHORTCUT"
            int r1 = androidx.core.content.ContextCompat.checkSelfPermission(r6, r0)
            r2 = 0
            if (r1 == 0) goto L1d
            return r2
        L1d:
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "com.android.launcher.action.INSTALL_SHORTCUT"
            r3.<init>(r4)
            java.util.List r1 = r1.queryBroadcastReceivers(r3, r2)
            java.util.Iterator r1 = r1.iterator()
        L30:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L50
            java.lang.Object r3 = r1.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ActivityInfo r4 = r3.activityInfo
            java.lang.String r4 = r4.permission
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L4e
            boolean r5 = r0.equals(r4)
            if (r5 == 0) goto L4d
            goto L4e
        L4d:
            goto L30
        L4e:
            r0 = 1
            return r0
        L50:
            return r2
    }

    public static boolean pushDynamicShortcut(android.content.Context r7, androidx.core.content.pm.ShortcutInfoCompat r8) {
            androidx.core.util.Preconditions.checkNotNull(r7)
            androidx.core.util.Preconditions.checkNotNull(r8)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            r2 = 1
            if (r0 > r1) goto L30
            boolean r0 = r8.isExcludedFromSurfaces(r2)
            if (r0 == 0) goto L30
            java.util.List r0 = getShortcutInfoListeners(r7)
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r1 = (androidx.core.content.pm.ShortcutInfoChangeListener) r1
            java.util.List r3 = java.util.Collections.singletonList(r8)
            r1.onShortcutAdded(r3)
            goto L1b
        L2f:
            return r2
        L30:
            int r0 = getMaxShortcutCountPerActivity(r7)
            r1 = 0
            if (r0 != 0) goto L38
            return r1
        L38:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 > r4) goto L41
            convertUriIconToBitmapIcon(r7, r8)
        L41:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            if (r3 < r4) goto L57
            java.lang.Class<android.content.pm.ShortcutManager> r3 = android.content.pm.ShortcutManager.class
            java.lang.Object r3 = r7.getSystemService(r3)
            android.content.pm.ShortcutManager r3 = (android.content.pm.ShortcutManager) r3
            android.content.pm.ShortcutInfo r4 = r8.toShortcutInfo()
            r3.pushDynamicShortcut(r4)
            goto L94
        L57:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 25
            if (r3 < r4) goto L94
            java.lang.Class<android.content.pm.ShortcutManager> r3 = android.content.pm.ShortcutManager.class
            java.lang.Object r3 = r7.getSystemService(r3)
            android.content.pm.ShortcutManager r3 = (android.content.pm.ShortcutManager) r3
            boolean r4 = r3.isRateLimitingActive()
            if (r4 == 0) goto L6c
            return r1
        L6c:
            java.util.List r4 = r3.getDynamicShortcuts()
            int r5 = r4.size()
            if (r5 < r0) goto L85
            java.lang.String[] r5 = new java.lang.String[r2]
            java.lang.String r6 = androidx.core.content.pm.ShortcutManagerCompat.Api25Impl.getShortcutInfoWithLowestRank(r4)
            r5[r1] = r6
            java.util.List r5 = java.util.Arrays.asList(r5)
            r3.removeDynamicShortcuts(r5)
        L85:
            android.content.pm.ShortcutInfo[] r5 = new android.content.pm.ShortcutInfo[r2]
            android.content.pm.ShortcutInfo r6 = r8.toShortcutInfo()
            r5[r1] = r6
            java.util.List r5 = java.util.Arrays.asList(r5)
            r3.addDynamicShortcuts(r5)
        L94:
            androidx.core.content.pm.ShortcutInfoCompatSaver r3 = getShortcutInfoSaverInstance(r7)
            java.util.List r4 = r3.getShortcuts()     // Catch: java.lang.Throwable -> Le1 java.lang.Exception -> L106
            int r5 = r4.size()     // Catch: java.lang.Throwable -> Le1 java.lang.Exception -> L106
            if (r5 < r0) goto Lb1
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Le1 java.lang.Exception -> L106
            java.lang.String r6 = getShortcutInfoCompatWithLowestRank(r4)     // Catch: java.lang.Throwable -> Le1 java.lang.Exception -> L106
            r5[r1] = r6     // Catch: java.lang.Throwable -> Le1 java.lang.Exception -> L106
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> Le1 java.lang.Exception -> L106
            r3.removeShortcuts(r5)     // Catch: java.lang.Throwable -> Le1 java.lang.Exception -> L106
        Lb1:
            androidx.core.content.pm.ShortcutInfoCompat[] r5 = new androidx.core.content.pm.ShortcutInfoCompat[r2]     // Catch: java.lang.Throwable -> Le1 java.lang.Exception -> L106
            r5[r1] = r8     // Catch: java.lang.Throwable -> Le1 java.lang.Exception -> L106
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> Le1 java.lang.Exception -> L106
            r3.addShortcuts(r5)     // Catch: java.lang.Throwable -> Le1 java.lang.Exception -> L106
            java.util.List r1 = getShortcutInfoListeners(r7)
            java.util.Iterator r1 = r1.iterator()
        Lc5:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Ld9
            java.lang.Object r5 = r1.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r5 = (androidx.core.content.pm.ShortcutInfoChangeListener) r5
            java.util.List r6 = java.util.Collections.singletonList(r8)
            r5.onShortcutAdded(r6)
            goto Lc5
        Ld9:
            java.lang.String r1 = r8.getId()
            reportShortcutUsed(r7, r1)
            return r2
        Le1:
            r1 = move-exception
            java.util.List r2 = getShortcutInfoListeners(r7)
            java.util.Iterator r2 = r2.iterator()
        Lea:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lfe
            java.lang.Object r4 = r2.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r4 = (androidx.core.content.pm.ShortcutInfoChangeListener) r4
            java.util.List r5 = java.util.Collections.singletonList(r8)
            r4.onShortcutAdded(r5)
            goto Lea
        Lfe:
            java.lang.String r2 = r8.getId()
            reportShortcutUsed(r7, r2)
            throw r1
        L106:
            r2 = move-exception
            java.util.List r2 = getShortcutInfoListeners(r7)
            java.util.Iterator r2 = r2.iterator()
        L10f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L123
            java.lang.Object r4 = r2.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r4 = (androidx.core.content.pm.ShortcutInfoChangeListener) r4
            java.util.List r5 = java.util.Collections.singletonList(r8)
            r4.onShortcutAdded(r5)
            goto L10f
        L123:
            java.lang.String r2 = r8.getId()
            reportShortcutUsed(r7, r2)
            return r1
    }

    public static void removeAllDynamicShortcuts(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L11
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.removeAllDynamicShortcuts()
        L11:
            androidx.core.content.pm.ShortcutInfoCompatSaver r0 = getShortcutInfoSaverInstance(r2)
            r0.removeAllShortcuts()
            java.util.List r0 = getShortcutInfoListeners(r2)
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r1 = (androidx.core.content.pm.ShortcutInfoChangeListener) r1
            r1.onAllShortcutsRemoved()
            goto L20
        L30:
            return
    }

    public static void removeDynamicShortcuts(android.content.Context r2, java.util.List<java.lang.String> r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L11
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.removeDynamicShortcuts(r3)
        L11:
            androidx.core.content.pm.ShortcutInfoCompatSaver r0 = getShortcutInfoSaverInstance(r2)
            r0.removeShortcuts(r3)
            java.util.List r0 = getShortcutInfoListeners(r2)
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r1 = (androidx.core.content.pm.ShortcutInfoChangeListener) r1
            r1.onShortcutRemoved(r3)
            goto L20
        L30:
            return
    }

    public static void removeLongLivedShortcuts(android.content.Context r2, java.util.List<java.lang.String> r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto La
            removeDynamicShortcuts(r2, r3)
            return
        La:
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.removeLongLivedShortcuts(r3)
            androidx.core.content.pm.ShortcutInfoCompatSaver r0 = getShortcutInfoSaverInstance(r2)
            r0.removeShortcuts(r3)
            java.util.List r0 = getShortcutInfoListeners(r2)
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r1 = (androidx.core.content.pm.ShortcutInfoChangeListener) r1
            r1.onShortcutRemoved(r3)
            goto L24
        L34:
            return
    }

    private static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> removeShortcutsExcludedFromSurface(java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r4, int r5) {
            java.util.Objects.requireNonNull(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            if (r0 <= r1) goto La
            return r4
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            java.util.Iterator r1 = r4.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            androidx.core.content.pm.ShortcutInfoCompat r2 = (androidx.core.content.pm.ShortcutInfoCompat) r2
            boolean r3 = r2.isExcludedFromSurfaces(r5)
            if (r3 == 0) goto L28
            r0.remove(r2)
        L28:
            goto L13
        L29:
            return r0
    }

    public static void reportShortcutUsed(android.content.Context r3, java.lang.String r4) {
            androidx.core.util.Preconditions.checkNotNull(r3)
            androidx.core.util.Preconditions.checkNotNull(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L17
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r3.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.reportShortcutUsed(r4)
        L17:
            java.util.List r0 = getShortcutInfoListeners(r3)
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r1 = (androidx.core.content.pm.ShortcutInfoChangeListener) r1
            java.util.List r2 = java.util.Collections.singletonList(r4)
            r1.onShortcutUsageReported(r2)
            goto L1f
        L33:
            return
    }

    public static boolean requestPinShortcut(android.content.Context r12, androidx.core.content.pm.ShortcutInfoCompat r13, android.content.IntentSender r14) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            r2 = 0
            r3 = 1
            if (r0 > r1) goto Lf
            boolean r0 = r13.isExcludedFromSurfaces(r3)
            if (r0 == 0) goto Lf
            return r2
        Lf:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L26
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r12.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            android.content.pm.ShortcutInfo r1 = r13.toShortcutInfo()
            boolean r0 = r0.requestPinShortcut(r1, r14)
            return r0
        L26:
            boolean r0 = isRequestPinShortcutSupported(r12)
            if (r0 != 0) goto L2d
            return r2
        L2d:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.android.launcher.action.INSTALL_SHORTCUT"
            r0.<init>(r1)
            android.content.Intent r5 = r13.addToIntent(r0)
            if (r14 != 0) goto L3e
            r12.sendBroadcast(r5)
            return r3
        L3e:
            androidx.core.content.pm.ShortcutManagerCompat$1 r7 = new androidx.core.content.pm.ShortcutManagerCompat$1
            r7.<init>(r14)
            r10 = 0
            r11 = 0
            r6 = 0
            r8 = 0
            r9 = -1
            r4 = r12
            r4.sendOrderedBroadcast(r5, r6, r7, r8, r9, r10, r11)
            return r3
    }

    public static boolean setDynamicShortcuts(android.content.Context r6, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r7) {
            androidx.core.util.Preconditions.checkNotNull(r6)
            androidx.core.util.Preconditions.checkNotNull(r7)
            r0 = 1
            java.util.List r1 = removeShortcutsExcludedFromSurface(r7, r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 25
            if (r2 < r3) goto L42
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r3 = r1.iterator()
        L1e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L32
            java.lang.Object r4 = r3.next()
            androidx.core.content.pm.ShortcutInfoCompat r4 = (androidx.core.content.pm.ShortcutInfoCompat) r4
            android.content.pm.ShortcutInfo r5 = r4.toShortcutInfo()
            r2.add(r5)
            goto L1e
        L32:
            java.lang.Class<android.content.pm.ShortcutManager> r3 = android.content.pm.ShortcutManager.class
            java.lang.Object r3 = r6.getSystemService(r3)
            android.content.pm.ShortcutManager r3 = (android.content.pm.ShortcutManager) r3
            boolean r3 = r3.setDynamicShortcuts(r2)
            if (r3 != 0) goto L42
            r0 = 0
            return r0
        L42:
            androidx.core.content.pm.ShortcutInfoCompatSaver r2 = getShortcutInfoSaverInstance(r6)
            r2.removeAllShortcuts()
            androidx.core.content.pm.ShortcutInfoCompatSaver r2 = getShortcutInfoSaverInstance(r6)
            r2.addShortcuts(r1)
            java.util.List r2 = getShortcutInfoListeners(r6)
            java.util.Iterator r2 = r2.iterator()
        L58:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r2.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r3 = (androidx.core.content.pm.ShortcutInfoChangeListener) r3
            r3.onAllShortcutsRemoved()
            r3.onShortcutAdded(r7)
            goto L58
        L6b:
            return r0
    }

    static void setShortcutInfoChangeListeners(java.util.List<androidx.core.content.pm.ShortcutInfoChangeListener> r0) {
            androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoChangeListeners = r0
            return
    }

    static void setShortcutInfoCompatSaver(androidx.core.content.pm.ShortcutInfoCompatSaver<java.lang.Void> r0) {
            androidx.core.content.pm.ShortcutManagerCompat.sShortcutInfoCompatSaver = r0
            return
    }

    public static boolean updateShortcuts(android.content.Context r6, java.util.List<androidx.core.content.pm.ShortcutInfoCompat> r7) {
            r0 = 1
            java.util.List r1 = removeShortcutsExcludedFromSurface(r7, r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 > r3) goto Le
            convertUriIconsToBitmapIcons(r6, r1)
        Le:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 25
            if (r2 < r3) goto L41
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r1.iterator()
        L1d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r3.next()
            androidx.core.content.pm.ShortcutInfoCompat r4 = (androidx.core.content.pm.ShortcutInfoCompat) r4
            android.content.pm.ShortcutInfo r5 = r4.toShortcutInfo()
            r2.add(r5)
            goto L1d
        L31:
            java.lang.Class<android.content.pm.ShortcutManager> r3 = android.content.pm.ShortcutManager.class
            java.lang.Object r3 = r6.getSystemService(r3)
            android.content.pm.ShortcutManager r3 = (android.content.pm.ShortcutManager) r3
            boolean r3 = r3.updateShortcuts(r2)
            if (r3 != 0) goto L41
            r0 = 0
            return r0
        L41:
            androidx.core.content.pm.ShortcutInfoCompatSaver r2 = getShortcutInfoSaverInstance(r6)
            r2.addShortcuts(r1)
            java.util.List r2 = getShortcutInfoListeners(r6)
            java.util.Iterator r2 = r2.iterator()
        L50:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L60
            java.lang.Object r3 = r2.next()
            androidx.core.content.pm.ShortcutInfoChangeListener r3 = (androidx.core.content.pm.ShortcutInfoChangeListener) r3
            r3.onShortcutUpdated(r7)
            goto L50
        L60:
            return r0
    }
}
