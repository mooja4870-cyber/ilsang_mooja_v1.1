package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
final class WeightTypefaceApi26 {
    private static final java.lang.String NATIVE_CREATE_FROM_TYPEFACE_WITH_EXACT_STYLE_METHOD = "nativeCreateFromTypefaceWithExactStyle";
    private static final java.lang.String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final java.lang.String TAG = "WeightTypeface";
    private static final java.lang.reflect.Constructor<android.graphics.Typeface> sConstructor = null;
    private static final java.lang.reflect.Method sNativeCreateFromTypefaceWithExactStyle = null;
    private static final java.lang.reflect.Field sNativeInstance = null;
    private static final java.lang.Object sWeightCacheLock = null;
    private static final androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> sWeightTypefaceCache = null;

    static {
            r0 = 3
            java.lang.Class<android.graphics.Typeface> r1 = android.graphics.Typeface.class
            java.lang.String r2 = "native_instance"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchMethodException -> L35 java.lang.NoSuchFieldException -> L37
            java.lang.Class<android.graphics.Typeface> r2 = android.graphics.Typeface.class
            java.lang.String r3 = "nativeCreateFromTypefaceWithExactStyle"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L35 java.lang.NoSuchFieldException -> L37
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.NoSuchMethodException -> L35 java.lang.NoSuchFieldException -> L37
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.NoSuchMethodException -> L35 java.lang.NoSuchFieldException -> L37
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L35 java.lang.NoSuchFieldException -> L37
            r7 = 1
            r4[r7] = r5     // Catch: java.lang.NoSuchMethodException -> L35 java.lang.NoSuchFieldException -> L37
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L35 java.lang.NoSuchFieldException -> L37
            r8 = 2
            r4[r8] = r5     // Catch: java.lang.NoSuchMethodException -> L35 java.lang.NoSuchFieldException -> L37
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L35 java.lang.NoSuchFieldException -> L37
            r2.setAccessible(r7)     // Catch: java.lang.NoSuchMethodException -> L35 java.lang.NoSuchFieldException -> L37
            java.lang.Class<android.graphics.Typeface> r3 = android.graphics.Typeface.class
            java.lang.Class[] r4 = new java.lang.Class[r7]     // Catch: java.lang.NoSuchMethodException -> L35 java.lang.NoSuchFieldException -> L37
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.NoSuchMethodException -> L35 java.lang.NoSuchFieldException -> L37
            r4[r6] = r5     // Catch: java.lang.NoSuchMethodException -> L35 java.lang.NoSuchFieldException -> L37
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L35 java.lang.NoSuchFieldException -> L37
            r3.setAccessible(r7)     // Catch: java.lang.NoSuchMethodException -> L35 java.lang.NoSuchFieldException -> L37
            goto L4b
        L35:
            r1 = move-exception
            goto L38
        L37:
            r1 = move-exception
        L38:
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "WeightTypeface"
            android.util.Log.e(r3, r2, r1)
            r2 = 0
            r3 = 0
            r4 = 0
            r1 = r2
            r2 = r3
            r3 = r4
        L4b:
            androidx.core.graphics.WeightTypefaceApi26.sNativeInstance = r1
            androidx.core.graphics.WeightTypefaceApi26.sNativeCreateFromTypefaceWithExactStyle = r2
            androidx.core.graphics.WeightTypefaceApi26.sConstructor = r3
            androidx.collection.LongSparseArray r1 = new androidx.collection.LongSparseArray
            r1.<init>(r0)
            androidx.core.graphics.WeightTypefaceApi26.sWeightTypefaceCache = r1
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.graphics.WeightTypefaceApi26.sWeightCacheLock = r0
            return
    }

    private WeightTypefaceApi26() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.graphics.Typeface create(long r3) {
            r0 = 0
            java.lang.reflect.Constructor<android.graphics.Typeface> r1 = androidx.core.graphics.WeightTypefaceApi26.sConstructor     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.InstantiationException -> L14 java.lang.IllegalAccessException -> L16
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.InstantiationException -> L14 java.lang.IllegalAccessException -> L16
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.InstantiationException -> L14 java.lang.IllegalAccessException -> L16
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.InstantiationException -> L14 java.lang.IllegalAccessException -> L16
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.InstantiationException -> L14 java.lang.IllegalAccessException -> L16
            return r1
        L12:
            r1 = move-exception
            return r0
        L14:
            r1 = move-exception
            return r0
        L16:
            r1 = move-exception
            return r0
    }

    static android.graphics.Typeface createWeightStyle(android.graphics.Typeface r7, int r8, boolean r9) {
            boolean r0 = isPrivateApiAvailable()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r8 << 1
            r0 = r0 | r9
            java.lang.Object r1 = androidx.core.graphics.WeightTypefaceApi26.sWeightCacheLock
            monitor-enter(r1)
            long r2 = getNativeInstance(r7)     // Catch: java.lang.Throwable -> L41
            androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> r4 = androidx.core.graphics.WeightTypefaceApi26.sWeightTypefaceCache     // Catch: java.lang.Throwable -> L41
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L41
            android.util.SparseArray r4 = (android.util.SparseArray) r4     // Catch: java.lang.Throwable -> L41
            if (r4 != 0) goto L29
            android.util.SparseArray r5 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L41
            r6 = 4
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L41
            r4 = r5
            androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> r5 = androidx.core.graphics.WeightTypefaceApi26.sWeightTypefaceCache     // Catch: java.lang.Throwable -> L41
            r5.put(r2, r4)     // Catch: java.lang.Throwable -> L41
            goto L33
        L29:
            java.lang.Object r5 = r4.get(r0)     // Catch: java.lang.Throwable -> L41
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L33
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            return r5
        L33:
            long r5 = nativeCreateFromTypefaceWithExactStyle(r2, r8, r9)     // Catch: java.lang.Throwable -> L41
            android.graphics.Typeface r5 = create(r5)     // Catch: java.lang.Throwable -> L41
            r4.put(r0, r5)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            return r5
        L41:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            throw r2
    }

    private static long getNativeInstance(android.graphics.Typeface r2) {
            java.lang.reflect.Field r0 = androidx.core.graphics.WeightTypefaceApi26.sNativeInstance     // Catch: java.lang.IllegalAccessException -> L7
            long r0 = r0.getLong(r2)     // Catch: java.lang.IllegalAccessException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    private static boolean isPrivateApiAvailable() {
            java.lang.reflect.Field r0 = androidx.core.graphics.WeightTypefaceApi26.sNativeInstance
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private static long nativeCreateFromTypefaceWithExactStyle(long r4, int r6, boolean r7) {
            java.lang.reflect.Method r0 = androidx.core.graphics.WeightTypefaceApi26.sNativeCreateFromTypefaceWithExactStyle     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L25
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L25
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L25
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L25
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L25
            r2 = 0
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L25
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L25
            long r0 = r0.longValue()     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L25
            return r0
        L1e:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L25:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }
}
