package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class ResourcesFlusher {
    private static final java.lang.String TAG = "ResourcesFlusher";
    private static java.lang.reflect.Field sDrawableCacheField;
    private static boolean sDrawableCacheFieldFetched;
    private static java.lang.reflect.Field sResourcesImplField;
    private static boolean sResourcesImplFieldFetched;
    private static java.lang.Class<?> sThemedResourceCacheClazz;
    private static boolean sThemedResourceCacheClazzFetched;
    private static java.lang.reflect.Field sThemedResourceCache_mUnthemedEntriesField;
    private static boolean sThemedResourceCache_mUnthemedEntriesFieldFetched;

    private ResourcesFlusher() {
            r0 = this;
            r0.<init>()
            return
    }

    static void flush(android.content.res.Resources r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L7
            return
        L7:
            flushNougats(r2)
            return
    }

    private static void flushLollipops(android.content.res.Resources r4) {
            boolean r0 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheFieldFetched
            java.lang.String r1 = "ResourcesFlusher"
            if (r0 != 0) goto L1f
            r0 = 1
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L17
            androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField = r2     // Catch: java.lang.NoSuchFieldException -> L17
            java.lang.reflect.Field r2 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField     // Catch: java.lang.NoSuchFieldException -> L17
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L17
            goto L1d
        L17:
            r2 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r1, r3, r2)
        L1d:
            androidx.appcompat.app.ResourcesFlusher.sDrawableCacheFieldFetched = r0
        L1f:
            java.lang.reflect.Field r0 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField
            if (r0 == 0) goto L39
            r0 = 0
            java.lang.reflect.Field r2 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField     // Catch: java.lang.IllegalAccessException -> L2e
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.IllegalAccessException -> L2e
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.IllegalAccessException -> L2e
            r0 = r2
            goto L34
        L2e:
            r2 = move-exception
            java.lang.String r3 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r1, r3, r2)
        L34:
            if (r0 == 0) goto L39
            r0.clear()
        L39:
            return
    }

    private static void flushMarshmallows(android.content.res.Resources r4) {
            boolean r0 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheFieldFetched
            java.lang.String r1 = "ResourcesFlusher"
            if (r0 != 0) goto L1f
            r0 = 1
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L17
            androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField = r2     // Catch: java.lang.NoSuchFieldException -> L17
            java.lang.reflect.Field r2 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField     // Catch: java.lang.NoSuchFieldException -> L17
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L17
            goto L1d
        L17:
            r2 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r1, r3, r2)
        L1d:
            androidx.appcompat.app.ResourcesFlusher.sDrawableCacheFieldFetched = r0
        L1f:
            r0 = 0
            java.lang.reflect.Field r2 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField
            if (r2 == 0) goto L32
            java.lang.reflect.Field r2 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField     // Catch: java.lang.IllegalAccessException -> L2c
            java.lang.Object r1 = r2.get(r4)     // Catch: java.lang.IllegalAccessException -> L2c
            r0 = r1
            goto L32
        L2c:
            r2 = move-exception
            java.lang.String r3 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r1, r3, r2)
        L32:
            if (r0 != 0) goto L35
            return
        L35:
            flushThemedResourcesCache(r0)
            return
    }

    private static void flushNougats(android.content.res.Resources r5) {
            boolean r0 = androidx.appcompat.app.ResourcesFlusher.sResourcesImplFieldFetched
            r1 = 1
            java.lang.String r2 = "ResourcesFlusher"
            if (r0 != 0) goto L1f
            java.lang.Class<android.content.res.Resources> r0 = android.content.res.Resources.class
            java.lang.String r3 = "mResourcesImpl"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L17
            androidx.appcompat.app.ResourcesFlusher.sResourcesImplField = r0     // Catch: java.lang.NoSuchFieldException -> L17
            java.lang.reflect.Field r0 = androidx.appcompat.app.ResourcesFlusher.sResourcesImplField     // Catch: java.lang.NoSuchFieldException -> L17
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L17
            goto L1d
        L17:
            r0 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r2, r3, r0)
        L1d:
            androidx.appcompat.app.ResourcesFlusher.sResourcesImplFieldFetched = r1
        L1f:
            java.lang.reflect.Field r0 = androidx.appcompat.app.ResourcesFlusher.sResourcesImplField
            if (r0 != 0) goto L24
            return
        L24:
            r0 = 0
            java.lang.reflect.Field r3 = androidx.appcompat.app.ResourcesFlusher.sResourcesImplField     // Catch: java.lang.IllegalAccessException -> L2d
            java.lang.Object r3 = r3.get(r5)     // Catch: java.lang.IllegalAccessException -> L2d
            r0 = r3
            goto L33
        L2d:
            r3 = move-exception
            java.lang.String r4 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r2, r4, r3)
        L33:
            if (r0 != 0) goto L36
            return
        L36:
            boolean r3 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheFieldFetched
            if (r3 != 0) goto L54
            java.lang.Class r3 = r0.getClass()     // Catch: java.lang.NoSuchFieldException -> L4c
            java.lang.String r4 = "mDrawableCache"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L4c
            androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField = r3     // Catch: java.lang.NoSuchFieldException -> L4c
            java.lang.reflect.Field r3 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField     // Catch: java.lang.NoSuchFieldException -> L4c
            r3.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L4c
            goto L52
        L4c:
            r3 = move-exception
            java.lang.String r4 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r2, r4, r3)
        L52:
            androidx.appcompat.app.ResourcesFlusher.sDrawableCacheFieldFetched = r1
        L54:
            r1 = 0
            java.lang.reflect.Field r3 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField
            if (r3 == 0) goto L67
            java.lang.reflect.Field r3 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField     // Catch: java.lang.IllegalAccessException -> L61
            java.lang.Object r2 = r3.get(r0)     // Catch: java.lang.IllegalAccessException -> L61
            r1 = r2
            goto L67
        L61:
            r3 = move-exception
            java.lang.String r4 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r2, r4, r3)
        L67:
            if (r1 == 0) goto L6c
            flushThemedResourcesCache(r1)
        L6c:
            return
    }

    private static void flushThemedResourcesCache(java.lang.Object r4) {
            boolean r0 = androidx.appcompat.app.ResourcesFlusher.sThemedResourceCacheClazzFetched
            r1 = 1
            java.lang.String r2 = "ResourcesFlusher"
            if (r0 != 0) goto L18
            java.lang.String r0 = "android.content.res.ThemedResourceCache"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L10
            androidx.appcompat.app.ResourcesFlusher.sThemedResourceCacheClazz = r0     // Catch: java.lang.ClassNotFoundException -> L10
            goto L16
        L10:
            r0 = move-exception
            java.lang.String r3 = "Could not find ThemedResourceCache class"
            android.util.Log.e(r2, r3, r0)
        L16:
            androidx.appcompat.app.ResourcesFlusher.sThemedResourceCacheClazzFetched = r1
        L18:
            java.lang.Class<?> r0 = androidx.appcompat.app.ResourcesFlusher.sThemedResourceCacheClazz
            if (r0 != 0) goto L1d
            return
        L1d:
            boolean r0 = androidx.appcompat.app.ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesFieldFetched
            if (r0 != 0) goto L39
            java.lang.Class<?> r0 = androidx.appcompat.app.ResourcesFlusher.sThemedResourceCacheClazz     // Catch: java.lang.NoSuchFieldException -> L31
            java.lang.String r3 = "mUnthemedEntries"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L31
            androidx.appcompat.app.ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesField = r0     // Catch: java.lang.NoSuchFieldException -> L31
            java.lang.reflect.Field r0 = androidx.appcompat.app.ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesField     // Catch: java.lang.NoSuchFieldException -> L31
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L31
            goto L37
        L31:
            r0 = move-exception
            java.lang.String r3 = "Could not retrieve ThemedResourceCache#mUnthemedEntries field"
            android.util.Log.e(r2, r3, r0)
        L37:
            androidx.appcompat.app.ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesFieldFetched = r1
        L39:
            java.lang.reflect.Field r0 = androidx.appcompat.app.ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesField
            if (r0 != 0) goto L3e
            return
        L3e:
            r0 = 0
            java.lang.reflect.Field r1 = androidx.appcompat.app.ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesField     // Catch: java.lang.IllegalAccessException -> L49
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.IllegalAccessException -> L49
            android.util.LongSparseArray r1 = (android.util.LongSparseArray) r1     // Catch: java.lang.IllegalAccessException -> L49
            r0 = r1
            goto L4f
        L49:
            r1 = move-exception
            java.lang.String r3 = "Could not retrieve value from ThemedResourceCache#mUnthemedEntries"
            android.util.Log.e(r2, r3, r1)
        L4f:
            if (r0 == 0) goto L54
            r0.clear()
        L54:
            return
    }
}
