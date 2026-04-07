package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
final class WeightTypefaceApi14 {
    private static final java.lang.String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final java.lang.String TAG = "WeightTypeface";
    private static final java.lang.reflect.Field sNativeInstance = null;
    private static final java.lang.Object sWeightCacheLock = null;
    private static final androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> sWeightTypefaceCache = null;

    static {
            java.lang.Class<android.graphics.Typeface> r0 = android.graphics.Typeface.class
            java.lang.String r1 = "native_instance"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> Ld
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> Ld
            goto L1d
        Ld:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "WeightTypeface"
            android.util.Log.e(r2, r1, r0)
            r1 = 0
            r0 = r1
        L1d:
            androidx.core.graphics.WeightTypefaceApi14.sNativeInstance = r0
            androidx.collection.LongSparseArray r0 = new androidx.collection.LongSparseArray
            r1 = 3
            r0.<init>(r1)
            androidx.core.graphics.WeightTypefaceApi14.sWeightTypefaceCache = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.graphics.WeightTypefaceApi14.sWeightCacheLock = r0
            return
    }

    private WeightTypefaceApi14() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.graphics.Typeface createWeightStyle(androidx.core.graphics.TypefaceCompatBaseImpl r7, android.content.Context r8, android.graphics.Typeface r9, int r10, boolean r11) {
            boolean r0 = isPrivateApiAvailable()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r10 << 1
            r0 = r0 | r11
            java.lang.Object r1 = androidx.core.graphics.WeightTypefaceApi14.sWeightCacheLock
            monitor-enter(r1)
            long r2 = getNativeInstance(r9)     // Catch: java.lang.Throwable -> L43
            androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> r4 = androidx.core.graphics.WeightTypefaceApi14.sWeightTypefaceCache     // Catch: java.lang.Throwable -> L43
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L43
            android.util.SparseArray r4 = (android.util.SparseArray) r4     // Catch: java.lang.Throwable -> L43
            if (r4 != 0) goto L29
            android.util.SparseArray r5 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L43
            r6 = 4
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L43
            r4 = r5
            androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> r5 = androidx.core.graphics.WeightTypefaceApi14.sWeightTypefaceCache     // Catch: java.lang.Throwable -> L43
            r5.put(r2, r4)     // Catch: java.lang.Throwable -> L43
            goto L33
        L29:
            java.lang.Object r5 = r4.get(r0)     // Catch: java.lang.Throwable -> L43
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5     // Catch: java.lang.Throwable -> L43
            if (r5 == 0) goto L33
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
            return r5
        L33:
            android.graphics.Typeface r5 = getBestFontFromFamily(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L43
            if (r5 != 0) goto L3e
            android.graphics.Typeface r6 = platformTypefaceCreate(r9, r10, r11)     // Catch: java.lang.Throwable -> L43
            r5 = r6
        L3e:
            r4.put(r0, r5)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
            return r5
        L43:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L43
            throw r2
    }

    private static android.graphics.Typeface getBestFontFromFamily(androidx.core.graphics.TypefaceCompatBaseImpl r6, android.content.Context r7, android.graphics.Typeface r8, int r9, boolean r10) {
            androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry r2 = r6.getFontFamily(r8)
            if (r2 != 0) goto L9
            r0 = 0
            return r0
        L9:
            android.content.res.Resources r3 = r7.getResources()
            r0 = r6
            r1 = r7
            r4 = r9
            r5 = r10
            android.graphics.Typeface r6 = r0.createFromFontFamilyFilesResourceEntry(r1, r2, r3, r4, r5)
            return r6
    }

    private static long getNativeInstance(android.graphics.Typeface r3) {
            java.lang.reflect.Field r0 = androidx.core.graphics.WeightTypefaceApi14.sNativeInstance     // Catch: java.lang.IllegalAccessException -> Ld
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.IllegalAccessException -> Ld
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.IllegalAccessException -> Ld
            long r1 = r0.longValue()     // Catch: java.lang.IllegalAccessException -> Ld
            return r1
        Ld:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    private static boolean isPrivateApiAvailable() {
            java.lang.reflect.Field r0 = androidx.core.graphics.WeightTypefaceApi14.sNativeInstance
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private static android.graphics.Typeface platformTypefaceCreate(android.graphics.Typeface r3, int r4, boolean r5) {
            r0 = 600(0x258, float:8.41E-43)
            if (r4 < r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            r1 = 0
            if (r0 != 0) goto Le
            if (r5 != 0) goto Le
            r1 = 0
            goto L17
        Le:
            if (r0 != 0) goto L12
            r1 = 2
            goto L17
        L12:
            if (r5 != 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 3
        L17:
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r3, r1)
            return r2
    }
}
