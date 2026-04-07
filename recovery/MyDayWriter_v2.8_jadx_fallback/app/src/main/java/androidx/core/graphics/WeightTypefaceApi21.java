package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
final class WeightTypefaceApi21 {
    private static final java.lang.String NATIVE_CREATE_FROM_TYPEFACE_METHOD = "nativeCreateFromTypeface";
    private static final java.lang.String NATIVE_CREATE_WEIGHT_ALIAS_METHOD = "nativeCreateWeightAlias";
    private static final java.lang.String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final java.lang.String TAG = "WeightTypeface";
    private static final java.lang.reflect.Constructor<android.graphics.Typeface> sConstructor = null;
    private static final java.lang.reflect.Method sNativeCreateFromTypeface = null;
    private static final java.lang.reflect.Method sNativeCreateWeightAlias = null;
    private static final java.lang.reflect.Field sNativeInstance = null;
    private static final java.lang.Object sWeightCacheLock = null;
    private static final androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> sWeightTypefaceCache = null;

    static {
            java.lang.Class<android.graphics.Typeface> r0 = android.graphics.Typeface.class
            java.lang.String r1 = "native_instance"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L45
            java.lang.Class<android.graphics.Typeface> r1 = android.graphics.Typeface.class
            java.lang.String r2 = "nativeCreateFromTypeface"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L45
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L45
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L45
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L45
            r7 = 1
            r4[r7] = r5     // Catch: java.lang.Throwable -> L45
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.Throwable -> L45
            r1.setAccessible(r7)     // Catch: java.lang.Throwable -> L45
            java.lang.Class<android.graphics.Typeface> r2 = android.graphics.Typeface.class
            java.lang.String r4 = "nativeCreateWeightAlias"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L45
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L45
            r3[r6] = r5     // Catch: java.lang.Throwable -> L45
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L45
            r3[r7] = r5     // Catch: java.lang.Throwable -> L45
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r3)     // Catch: java.lang.Throwable -> L45
            r2.setAccessible(r7)     // Catch: java.lang.Throwable -> L45
            java.lang.Class<android.graphics.Typeface> r3 = android.graphics.Typeface.class
            java.lang.Class[] r4 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L45
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L45
            r4[r6] = r5     // Catch: java.lang.Throwable -> L45
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r4)     // Catch: java.lang.Throwable -> L45
            r3.setAccessible(r7)     // Catch: java.lang.Throwable -> L45
            goto L5b
        L45:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "WeightTypeface"
            android.util.Log.e(r2, r1, r0)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
        L5b:
            androidx.core.graphics.WeightTypefaceApi21.sNativeInstance = r0
            androidx.core.graphics.WeightTypefaceApi21.sNativeCreateFromTypeface = r1
            androidx.core.graphics.WeightTypefaceApi21.sNativeCreateWeightAlias = r2
            androidx.core.graphics.WeightTypefaceApi21.sConstructor = r3
            androidx.collection.LongSparseArray r0 = new androidx.collection.LongSparseArray
            r1 = 3
            r0.<init>(r1)
            androidx.core.graphics.WeightTypefaceApi21.sWeightTypefaceCache = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.graphics.WeightTypefaceApi21.sWeightCacheLock = r0
            return
    }

    private WeightTypefaceApi21() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.graphics.Typeface create(long r3) {
            r0 = 0
            java.lang.reflect.Constructor<android.graphics.Typeface> r1 = androidx.core.graphics.WeightTypefaceApi21.sConstructor     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.InstantiationException -> L14 java.lang.IllegalAccessException -> L16
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
            java.lang.Object r1 = androidx.core.graphics.WeightTypefaceApi21.sWeightCacheLock
            monitor-enter(r1)
            long r2 = getNativeInstance(r7)     // Catch: java.lang.Throwable -> L51
            androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> r4 = androidx.core.graphics.WeightTypefaceApi21.sWeightTypefaceCache     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L51
            android.util.SparseArray r4 = (android.util.SparseArray) r4     // Catch: java.lang.Throwable -> L51
            if (r4 != 0) goto L29
            android.util.SparseArray r5 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L51
            r6 = 4
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L51
            r4 = r5
            androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> r5 = androidx.core.graphics.WeightTypefaceApi21.sWeightTypefaceCache     // Catch: java.lang.Throwable -> L51
            r5.put(r2, r4)     // Catch: java.lang.Throwable -> L51
            goto L33
        L29:
            java.lang.Object r5 = r4.get(r0)     // Catch: java.lang.Throwable -> L51
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L33
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            return r5
        L33:
            boolean r5 = r7.isItalic()     // Catch: java.lang.Throwable -> L51
            if (r9 != r5) goto L43
        L3a:
            long r5 = nativeCreateWeightAlias(r2, r8)     // Catch: java.lang.Throwable -> L51
            android.graphics.Typeface r5 = create(r5)     // Catch: java.lang.Throwable -> L51
            goto L4c
        L43:
            long r5 = nativeCreateFromTypefaceWithExactStyle(r2, r8, r9)     // Catch: java.lang.Throwable -> L51
            android.graphics.Typeface r5 = create(r5)     // Catch: java.lang.Throwable -> L51
        L4c:
            r4.put(r0, r5)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            return r5
        L51:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            throw r2
    }

    private static long getNativeInstance(android.graphics.Typeface r2) {
            java.lang.reflect.Field r0 = androidx.core.graphics.WeightTypefaceApi21.sNativeInstance     // Catch: java.lang.IllegalAccessException -> L7
            long r0 = r0.getLong(r2)     // Catch: java.lang.IllegalAccessException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    private static boolean isPrivateApiAvailable() {
            java.lang.reflect.Field r0 = androidx.core.graphics.WeightTypefaceApi21.sNativeInstance
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private static long nativeCreateFromTypefaceWithExactStyle(long r5, int r7, boolean r8) {
            if (r8 == 0) goto L4
            r0 = 2
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.reflect.Method r1 = androidx.core.graphics.WeightTypefaceApi21.sNativeCreateFromTypeface     // Catch: java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3f
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3f
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3f
            r3 = 0
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3f
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3f
            long r1 = r1.longValue()     // Catch: java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3f
            r5 = r1
            java.lang.reflect.Method r1 = androidx.core.graphics.WeightTypefaceApi21.sNativeCreateWeightAlias     // Catch: java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3f
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3f
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r4}     // Catch: java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3f
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3f
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3f
            long r1 = r1.longValue()     // Catch: java.lang.reflect.InvocationTargetException -> L38 java.lang.IllegalAccessException -> L3f
            return r1
        L38:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L3f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    private static long nativeCreateWeightAlias(long r3, int r5) {
            java.lang.reflect.Method r0 = androidx.core.graphics.WeightTypefaceApi21.sNativeCreateWeightAlias     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            r2 = 0
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            long r0 = r0.longValue()     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            return r0
        L1a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L21:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }
}
