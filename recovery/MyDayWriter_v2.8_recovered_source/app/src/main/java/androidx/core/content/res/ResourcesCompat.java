package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public final class ResourcesCompat {
    public static final int ID_NULL = 0;
    private static final java.lang.String TAG = "ResourcesCompat";
    private static final java.lang.Object sColorStateCacheLock = null;
    private static final java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry>> sColorStateCaches = null;
    private static final java.lang.ThreadLocal<android.util.TypedValue> sTempTypedValue = null;

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.drawable.Drawable getDrawable(android.content.res.Resources r1, int r2, android.content.res.Resources.Theme r3) {
                android.graphics.drawable.Drawable r0 = r1.getDrawable(r2, r3)
                return r0
        }

        static android.graphics.drawable.Drawable getDrawableForDensity(android.content.res.Resources r1, int r2, int r3, android.content.res.Resources.Theme r4) {
                android.graphics.drawable.Drawable r0 = r1.getDrawableForDensity(r2, r3, r4)
                return r0
        }
    }

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getColor(android.content.res.Resources r1, int r2, android.content.res.Resources.Theme r3) {
                int r0 = r1.getColor(r2, r3)
                return r0
        }

        static android.content.res.ColorStateList getColorStateList(android.content.res.Resources r1, int r2, android.content.res.Resources.Theme r3) {
                android.content.res.ColorStateList r0 = r1.getColorStateList(r2, r3)
                return r0
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static float getFloat(android.content.res.Resources r1, int r2) {
                float r0 = r1.getFloat(r2)
                return r0
        }
    }

    private static class ColorStateListCacheEntry {
        final android.content.res.Configuration mConfiguration;
        final int mThemeHash;
        final android.content.res.ColorStateList mValue;

        ColorStateListCacheEntry(android.content.res.ColorStateList r2, android.content.res.Configuration r3, android.content.res.Resources.Theme r4) {
                r1 = this;
                r1.<init>()
                r1.mValue = r2
                r1.mConfiguration = r3
                if (r4 != 0) goto Lb
                r0 = 0
                goto Lf
            Lb:
                int r0 = r4.hashCode()
            Lf:
                r1.mThemeHash = r0
                return
        }
    }

    private static final class ColorStateListCacheKey {
        final android.content.res.Resources mResources;
        final android.content.res.Resources.Theme mTheme;

        ColorStateListCacheKey(android.content.res.Resources r1, android.content.res.Resources.Theme r2) {
                r0 = this;
                r0.<init>()
                r0.mResources = r1
                r0.mTheme = r2
                return
        }

        public boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                r1 = 0
                if (r6 == 0) goto L2c
                java.lang.Class r2 = r5.getClass()
                java.lang.Class r3 = r6.getClass()
                if (r2 == r3) goto L12
                goto L2c
            L12:
                r2 = r6
                androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey r2 = (androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey) r2
                android.content.res.Resources r3 = r5.mResources
                android.content.res.Resources r4 = r2.mResources
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L2a
                android.content.res.Resources$Theme r3 = r5.mTheme
                android.content.res.Resources$Theme r4 = r2.mTheme
                boolean r3 = androidx.core.util.ObjectsCompat.equals(r3, r4)
                if (r3 == 0) goto L2a
                goto L2b
            L2a:
                r0 = r1
            L2b:
                return r0
            L2c:
                return r1
        }

        public int hashCode() {
                r2 = this;
                android.content.res.Resources r0 = r2.mResources
                android.content.res.Resources$Theme r1 = r2.mTheme
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                int r0 = androidx.core.util.ObjectsCompat.hash(r0)
                return r0
        }
    }

    public static abstract class FontCallback {
        public FontCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.os.Handler getHandler(android.os.Handler r2) {
                if (r2 != 0) goto Lc
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                goto Ld
            Lc:
                r0 = r2
            Ld:
                return r0
        }

        public final void callbackFailAsync(int r3, android.os.Handler r4) {
                r2 = this;
                android.os.Handler r0 = getHandler(r4)
                androidx.core.content.res.ResourcesCompat$FontCallback$$ExternalSyntheticLambda1 r1 = new androidx.core.content.res.ResourcesCompat$FontCallback$$ExternalSyntheticLambda1
                r1.<init>(r2, r3)
                r0.post(r1)
                return
        }

        public final void callbackSuccessAsync(android.graphics.Typeface r3, android.os.Handler r4) {
                r2 = this;
                android.os.Handler r0 = getHandler(r4)
                androidx.core.content.res.ResourcesCompat$FontCallback$$ExternalSyntheticLambda0 r1 = new androidx.core.content.res.ResourcesCompat$FontCallback$$ExternalSyntheticLambda0
                r1.<init>(r2, r3)
                r0.post(r1)
                return
        }

        /* JADX INFO: renamed from: lambda$callbackFailAsync$1$androidx-core-content-res-ResourcesCompat$FontCallback, reason: not valid java name */
        /* synthetic */ void m48xb24343b7(int r1) {
                r0 = this;
                r0.onFontRetrievalFailed(r1)
                return
        }

        /* JADX INFO: renamed from: lambda$callbackSuccessAsync$0$androidx-core-content-res-ResourcesCompat$FontCallback, reason: not valid java name */
        /* synthetic */ void m49x46c88379(android.graphics.Typeface r1) {
                r0 = this;
                r0.onFontRetrieved(r1)
                return
        }

        public abstract void onFontRetrievalFailed(int r1);

        public abstract void onFontRetrieved(android.graphics.Typeface r1);
    }

    public static final class ThemeCompat {

        static class Api23Impl {
            private static java.lang.reflect.Method sRebaseMethod;
            private static boolean sRebaseMethodFetched;
            private static final java.lang.Object sRebaseMethodLock = null;

            static {
                    java.lang.Object r0 = new java.lang.Object
                    r0.<init>()
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethodLock = r0
                    return
            }

            private Api23Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static void rebase(android.content.res.Resources.Theme r6) {
                    java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethodLock
                    monitor-enter(r0)
                    boolean r1 = androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethodFetched     // Catch: java.lang.Throwable -> L40
                    r2 = 0
                    if (r1 != 0) goto L25
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1b java.lang.Throwable -> L40
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L1b java.lang.Throwable -> L40
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethod = r3     // Catch: java.lang.NoSuchMethodException -> L1b java.lang.Throwable -> L40
                    java.lang.reflect.Method r3 = androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethod     // Catch: java.lang.NoSuchMethodException -> L1b java.lang.Throwable -> L40
                    r3.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L1b java.lang.Throwable -> L40
                    goto L23
                L1b:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L40
                L23:
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethodFetched = r1     // Catch: java.lang.Throwable -> L40
                L25:
                    java.lang.reflect.Method r1 = androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethod     // Catch: java.lang.Throwable -> L40
                    if (r1 == 0) goto L3e
                    java.lang.reflect.Method r1 = androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethod     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33 java.lang.Throwable -> L40
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33 java.lang.Throwable -> L40
                    r1.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33 java.lang.Throwable -> L40
                    goto L3e
                L31:
                    r1 = move-exception
                    goto L34
                L33:
                    r1 = move-exception
                L34:
                    java.lang.String r2 = "ResourcesCompat"
                    java.lang.String r3 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r2, r3, r1)     // Catch: java.lang.Throwable -> L40
                    r2 = 0
                    androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.sRebaseMethod = r2     // Catch: java.lang.Throwable -> L40
                L3e:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
                    return
                L40:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
                    throw r1
            }
        }

        static class Api29Impl {
            private Api29Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static void rebase(android.content.res.Resources.Theme r0) {
                    r0.rebase()
                    return
            }
        }

        private ThemeCompat() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void rebase(android.content.res.Resources.Theme r2) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto La
                androidx.core.content.res.ResourcesCompat.ThemeCompat.Api29Impl.rebase(r2)
                goto Le
            La:
                androidx.core.content.res.ResourcesCompat.ThemeCompat.Api23Impl.rebase(r2)
            Le:
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.core.content.res.ResourcesCompat.sTempTypedValue = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            androidx.core.content.res.ResourcesCompat.sColorStateCaches = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.content.res.ResourcesCompat.sColorStateCacheLock = r0
            return
    }

    private ResourcesCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addColorStateListToCache(androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey r4, int r5, android.content.res.ColorStateList r6, android.content.res.Resources.Theme r7) {
            java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.sColorStateCacheLock
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry>> r1 = androidx.core.content.res.ResourcesCompat.sColorStateCaches     // Catch: java.lang.Throwable -> L28
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L28
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L18
            android.util.SparseArray r2 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            r1 = r2
            java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry>> r2 = androidx.core.content.res.ResourcesCompat.sColorStateCaches     // Catch: java.lang.Throwable -> L28
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L28
        L18:
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry r2 = new androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry     // Catch: java.lang.Throwable -> L28
            android.content.res.Resources r3 = r4.mResources     // Catch: java.lang.Throwable -> L28
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch: java.lang.Throwable -> L28
            r2.<init>(r6, r3, r7)     // Catch: java.lang.Throwable -> L28
            r1.append(r5, r2)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            throw r1
    }

    public static void clearCachesForTheme(android.content.res.Resources.Theme r4) {
            java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.sColorStateCacheLock
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry>> r1 = androidx.core.content.res.ResourcesCompat.sColorStateCaches     // Catch: java.lang.Throwable -> L29
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L29
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L29
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey r2 = (androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey) r2     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L26
            android.content.res.Resources$Theme r3 = r2.mTheme     // Catch: java.lang.Throwable -> L29
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L26
            r1.remove()     // Catch: java.lang.Throwable -> L29
        L26:
            goto Ld
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return
        L29:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r1
    }

    private static android.content.res.ColorStateList getCachedColorStateList(androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey r5, int r6) {
            java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.sColorStateCacheLock
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry>> r1 = androidx.core.content.res.ResourcesCompat.sColorStateCaches     // Catch: java.lang.Throwable -> L49
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L49
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L46
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L49
            if (r2 <= 0) goto L46
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L49
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry r2 = (androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry) r2     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L46
            android.content.res.Configuration r3 = r2.mConfiguration     // Catch: java.lang.Throwable -> L49
            android.content.res.Resources r4 = r5.mResources     // Catch: java.lang.Throwable -> L49
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L49
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L43
            android.content.res.Resources$Theme r3 = r5.mTheme     // Catch: java.lang.Throwable -> L49
            if (r3 != 0) goto L31
            int r3 = r2.mThemeHash     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L3f
        L31:
            android.content.res.Resources$Theme r3 = r5.mTheme     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L43
            int r3 = r2.mThemeHash     // Catch: java.lang.Throwable -> L49
            android.content.res.Resources$Theme r4 = r5.mTheme     // Catch: java.lang.Throwable -> L49
            int r4 = r4.hashCode()     // Catch: java.lang.Throwable -> L49
            if (r3 != r4) goto L43
        L3f:
            android.content.res.ColorStateList r3 = r2.mValue     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            return r3
        L43:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L49
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            r0 = 0
            return r0
        L49:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            throw r1
    }

    public static android.graphics.Typeface getCachedFont(android.content.Context r9, int r10) throws android.content.res.Resources.NotFoundException {
            boolean r0 = r9.isRestricted()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r7 = 0
            r8 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r9
            r2 = r10
            android.graphics.Typeface r9 = loadFont(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public static int getColor(android.content.res.Resources r1, int r2, android.content.res.Resources.Theme r3) throws android.content.res.Resources.NotFoundException {
            int r0 = androidx.core.content.res.ResourcesCompat.Api23Impl.getColor(r1, r2, r3)
            return r0
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.res.Resources r3, int r4, android.content.res.Resources.Theme r5) throws android.content.res.Resources.NotFoundException {
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey r0 = new androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey
            r0.<init>(r3, r5)
            android.content.res.ColorStateList r1 = getCachedColorStateList(r0, r4)
            if (r1 == 0) goto Lc
            return r1
        Lc:
            android.content.res.ColorStateList r1 = inflateColorStateList(r3, r4, r5)
            if (r1 == 0) goto L16
            addColorStateListToCache(r0, r4, r1, r5)
            return r1
        L16:
            android.content.res.ColorStateList r2 = androidx.core.content.res.ResourcesCompat.Api23Impl.getColorStateList(r3, r4, r5)
            return r2
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.res.Resources r1, int r2, android.content.res.Resources.Theme r3) throws android.content.res.Resources.NotFoundException {
            android.graphics.drawable.Drawable r0 = androidx.core.content.res.ResourcesCompat.Api21Impl.getDrawable(r1, r2, r3)
            return r0
    }

    public static android.graphics.drawable.Drawable getDrawableForDensity(android.content.res.Resources r1, int r2, int r3, android.content.res.Resources.Theme r4) throws android.content.res.Resources.NotFoundException {
            android.graphics.drawable.Drawable r0 = androidx.core.content.res.ResourcesCompat.Api21Impl.getDrawableForDensity(r1, r2, r3, r4)
            return r0
    }

    public static float getFloat(android.content.res.Resources r4, int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            float r0 = androidx.core.content.res.ResourcesCompat.Api29Impl.getFloat(r4, r5)
            return r0
        Lb:
            android.util.TypedValue r0 = getTypedValue()
            r1 = 1
            r4.getValue(r5, r0, r1)
            int r1 = r0.type
            r2 = 4
            if (r1 != r2) goto L1d
            float r1 = r0.getFloat()
            return r1
        L1d:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Resource ID #0x"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r5)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " type #0x"
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r0.type
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " is not valid"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static android.graphics.Typeface getFont(android.content.Context r9, int r10) throws android.content.res.Resources.NotFoundException {
            boolean r0 = r9.isRestricted()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r7 = 0
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r9
            r2 = r10
            android.graphics.Typeface r9 = loadFont(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public static android.graphics.Typeface getFont(android.content.Context r9, int r10, android.util.TypedValue r11, int r12, androidx.core.content.res.ResourcesCompat.FontCallback r13) throws android.content.res.Resources.NotFoundException {
            boolean r0 = r9.isRestricted()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            r7 = 1
            r8 = 0
            r6 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            android.graphics.Typeface r9 = loadFont(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public static void getFont(android.content.Context r9, int r10, androidx.core.content.res.ResourcesCompat.FontCallback r11, android.os.Handler r12) throws android.content.res.Resources.NotFoundException {
            androidx.core.util.Preconditions.checkNotNull(r11)
            boolean r0 = r9.isRestricted()
            if (r0 == 0) goto Le
            r0 = -4
            r11.callbackFailAsync(r0, r12)
            return
        Le:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r7 = 0
            r8 = 0
            r4 = 0
            r1 = r9
            r2 = r10
            r5 = r11
            r6 = r12
            loadFont(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    private static android.util.TypedValue getTypedValue() {
            java.lang.ThreadLocal<android.util.TypedValue> r0 = androidx.core.content.res.ResourcesCompat.sTempTypedValue
            java.lang.Object r0 = r0.get()
            android.util.TypedValue r0 = (android.util.TypedValue) r0
            if (r0 != 0) goto L15
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0 = r1
            java.lang.ThreadLocal<android.util.TypedValue> r1 = androidx.core.content.res.ResourcesCompat.sTempTypedValue
            r1.set(r0)
        L15:
            return r0
    }

    private static android.content.res.ColorStateList inflateColorStateList(android.content.res.Resources r5, int r6, android.content.res.Resources.Theme r7) {
            boolean r0 = isColorInt(r5, r6)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.content.res.XmlResourceParser r0 = r5.getXml(r6)
            android.content.res.ColorStateList r1 = androidx.core.content.res.ColorStateListInflaterCompat.createFromXml(r5, r0, r7)     // Catch: java.lang.Exception -> L11
            return r1
        L11:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r4 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r4, r2)
            return r1
    }

    private static boolean isColorInt(android.content.res.Resources r4, int r5) {
            android.util.TypedValue r0 = getTypedValue()
            r1 = 1
            r4.getValue(r5, r0, r1)
            int r2 = r0.type
            r3 = 28
            if (r2 < r3) goto L15
            int r2 = r0.type
            r3 = 31
            if (r2 > r3) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    private static android.graphics.Typeface loadFont(android.content.Context r10, int r11, android.util.TypedValue r12, int r13, androidx.core.content.res.ResourcesCompat.FontCallback r14, android.os.Handler r15, boolean r16, boolean r17) {
            android.content.res.Resources r1 = r10.getResources()
            r0 = 1
            r1.getValue(r11, r12, r0)
            r0 = r10
            r3 = r11
            r2 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            android.graphics.Typeface r9 = loadFont(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r9 != 0) goto L40
            if (r14 != 0) goto L40
            if (r17 == 0) goto L1d
            goto L40
        L1d:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Font resource ID #0x"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r11)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " could not be retrieved."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L40:
            return r9
    }

    private static android.graphics.Typeface loadFont(android.content.Context r16, android.content.res.Resources r17, android.util.TypedValue r18, int r19, int r20, androidx.core.content.res.ResourcesCompat.FontCallback r21, android.os.Handler r22, boolean r23, boolean r24) {
            r2 = r17
            r11 = r18
            r3 = r19
            r8 = r21
            r9 = r22
            java.lang.String r12 = "ResourcesCompat"
            java.lang.CharSequence r0 = r11.string
            if (r0 == 0) goto Ld6
            java.lang.CharSequence r0 = r11.string
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r4.startsWith(r0)
            r13 = -3
            r14 = 0
            if (r0 != 0) goto L26
            if (r8 == 0) goto L25
            r8.callbackFailAsync(r13, r9)
        L25:
            return r14
        L26:
            int r0 = r11.assetCookie
            r7 = r20
            android.graphics.Typeface r15 = androidx.core.graphics.TypefaceCompat.findFromCache(r2, r3, r4, r0, r7)
            if (r15 == 0) goto L36
            if (r8 == 0) goto L35
            r8.callbackSuccessAsync(r15, r9)
        L35:
            return r15
        L36:
            if (r24 == 0) goto L39
            return r14
        L39:
            java.lang.String r0 = r4.toLowerCase()     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> Lb8
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> Lb8
            if (r0 == 0) goto L79
            android.content.res.XmlResourceParser r0 = r2.getXml(r3)     // Catch: java.io.IOException -> L94 org.xmlpull.v1.XmlPullParserException -> L9a
            androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry r1 = androidx.core.content.res.FontResourcesParserCompat.parse(r0, r2)     // Catch: java.io.IOException -> L94 org.xmlpull.v1.XmlPullParserException -> L9a
            if (r1 != 0) goto L5b
            java.lang.String r5 = "Failed to find font-family tag"
            android.util.Log.e(r12, r5)     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> Lb8
            if (r8 == 0) goto L5a
            r8.callbackFailAsync(r13, r9)     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> Lb8
        L5a:
            return r14
        L5b:
            int r6 = r11.assetCookie     // Catch: java.io.IOException -> L94 org.xmlpull.v1.XmlPullParserException -> L9a
            r10 = r23
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r16
            android.graphics.Typeface r6 = androidx.core.graphics.TypefaceCompat.createFromResourcesFamilyXml(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> L6b org.xmlpull.v1.XmlPullParserException -> L72
            r4 = r5
            return r6
        L6b:
            r0 = move-exception
            r4 = r5
            r2 = r17
            r3 = r19
            goto La1
        L72:
            r0 = move-exception
            r4 = r5
            r2 = r17
            r3 = r19
            goto Lb9
        L79:
            int r5 = r11.assetCookie     // Catch: java.io.IOException -> L94 org.xmlpull.v1.XmlPullParserException -> L9a
            r1 = r16
            r2 = r17
            r3 = r19
            r6 = r20
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(r1, r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> Lb8
            r15 = r0
            if (r8 == 0) goto L93
            if (r15 == 0) goto L90
            r8.callbackSuccessAsync(r15, r9)     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> Lb8
            goto L93
        L90:
            r8.callbackFailAsync(r13, r9)     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> Lb8
        L93:
            return r15
        L94:
            r0 = move-exception
            r2 = r17
            r3 = r19
            goto La1
        L9a:
            r0 = move-exception
            r2 = r17
            r3 = r19
            goto Lb9
        La0:
            r0 = move-exception
        La1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "Failed to read xml resource "
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r12, r1, r0)
            goto Ld0
        Lb8:
            r0 = move-exception
        Lb9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "Failed to parse xml resource "
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r12, r1, r0)
        Ld0:
            if (r8 == 0) goto Ld5
            r8.callbackFailAsync(r13, r9)
        Ld5:
            return r14
        Ld6:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Resource \""
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r4 = r2.getResourceName(r3)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r4 = "\" ("
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r4 = java.lang.Integer.toHexString(r3)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r4 = ") is not a Font: "
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
