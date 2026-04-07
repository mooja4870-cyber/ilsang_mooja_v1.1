package androidx.core.location;

/* JADX INFO: loaded from: classes.dex */
public final class LocationRequestCompat {
    private static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
    public static final long PASSIVE_INTERVAL = Long.MAX_VALUE;
    public static final int QUALITY_BALANCED_POWER_ACCURACY = 102;
    public static final int QUALITY_HIGH_ACCURACY = 100;
    public static final int QUALITY_LOW_POWER = 104;
    final long mDurationMillis;
    final long mIntervalMillis;
    final long mMaxUpdateDelayMillis;
    final int mMaxUpdates;
    final float mMinUpdateDistanceMeters;
    final long mMinUpdateIntervalMillis;
    final int mQuality;

    private static class Api19Impl {
        private static java.lang.reflect.Method sCreateFromDeprecatedProviderMethod;
        private static java.lang.Class<?> sLocationRequestClass;
        private static java.lang.reflect.Method sSetExpireInMethod;
        private static java.lang.reflect.Method sSetFastestIntervalMethod;
        private static java.lang.reflect.Method sSetNumUpdatesMethod;
        private static java.lang.reflect.Method sSetQualityMethod;

        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.lang.Object toLocationRequest(androidx.core.location.LocationRequestCompat r8, java.lang.String r9) {
                r0 = 0
                java.lang.Class<?> r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                if (r1 != 0) goto Ld
                java.lang.String r1 = "android.location.LocationRequest"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                androidx.core.location.LocationRequestCompat.Api19Impl.sLocationRequestClass = r1     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
            Ld:
                java.lang.reflect.Method r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sCreateFromDeprecatedProviderMethod     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L37
                java.lang.Class<?> r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.String r4 = "createFromDeprecatedProvider"
                r5 = 4
                java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                r5[r2] = r6     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Class r6 = java.lang.Long.TYPE     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                r5[r3] = r6     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Class r6 = java.lang.Float.TYPE     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                r7 = 2
                r5[r7] = r6     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                r7 = 3
                r5[r7] = r6     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                androidx.core.location.LocationRequestCompat.Api19Impl.sCreateFromDeprecatedProviderMethod = r1     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.reflect.Method r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sCreateFromDeprecatedProviderMethod     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                r1.setAccessible(r3)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
            L37:
                java.lang.reflect.Method r1 = androidx.core.location.LocationRequestCompat.Api19Impl.sCreateFromDeprecatedProviderMethod     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                long r4 = r8.getIntervalMillis()     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                float r5 = r8.getMinUpdateDistanceMeters()     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Object[] r4 = new java.lang.Object[]{r9, r4, r5, r6}     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Object r1 = r1.invoke(r0, r4)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                if (r1 != 0) goto L58
                return r0
            L58:
                java.lang.reflect.Method r4 = androidx.core.location.LocationRequestCompat.Api19Impl.sSetQualityMethod     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                if (r4 != 0) goto L71
                java.lang.Class<?> r4 = androidx.core.location.LocationRequestCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.String r5 = "setQuality"
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                r6[r2] = r7     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r6)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                androidx.core.location.LocationRequestCompat.Api19Impl.sSetQualityMethod = r4     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.reflect.Method r4 = androidx.core.location.LocationRequestCompat.Api19Impl.sSetQualityMethod     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                r4.setAccessible(r3)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
            L71:
                java.lang.reflect.Method r4 = androidx.core.location.LocationRequestCompat.Api19Impl.sSetQualityMethod     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                int r5 = r8.getQuality()     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                r4.invoke(r1, r5)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.reflect.Method r4 = androidx.core.location.LocationRequestCompat.Api19Impl.sSetFastestIntervalMethod     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                if (r4 != 0) goto L9b
                java.lang.Class<?> r4 = androidx.core.location.LocationRequestCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.String r5 = "setFastestInterval"
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                r6[r2] = r7     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r6)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                androidx.core.location.LocationRequestCompat.Api19Impl.sSetFastestIntervalMethod = r4     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.reflect.Method r4 = androidx.core.location.LocationRequestCompat.Api19Impl.sSetFastestIntervalMethod     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                r4.setAccessible(r3)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
            L9b:
                java.lang.reflect.Method r4 = androidx.core.location.LocationRequestCompat.Api19Impl.sSetFastestIntervalMethod     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                long r5 = r8.getMinUpdateIntervalMillis()     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                r4.invoke(r1, r5)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                int r4 = r8.getMaxUpdates()     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                r5 = 2147483647(0x7fffffff, float:NaN)
                if (r4 >= r5) goto Ldf
                java.lang.reflect.Method r4 = androidx.core.location.LocationRequestCompat.Api19Impl.sSetNumUpdatesMethod     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                if (r4 != 0) goto Lce
                java.lang.Class<?> r4 = androidx.core.location.LocationRequestCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.String r5 = "setNumUpdates"
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                r6[r2] = r7     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r6)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                androidx.core.location.LocationRequestCompat.Api19Impl.sSetNumUpdatesMethod = r4     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.reflect.Method r4 = androidx.core.location.LocationRequestCompat.Api19Impl.sSetNumUpdatesMethod     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                r4.setAccessible(r3)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
            Lce:
                java.lang.reflect.Method r4 = androidx.core.location.LocationRequestCompat.Api19Impl.sSetNumUpdatesMethod     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                int r5 = r8.getMaxUpdates()     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                r4.invoke(r1, r5)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
            Ldf:
                long r4 = r8.getDurationMillis()     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 >= 0) goto L116
                java.lang.reflect.Method r4 = androidx.core.location.LocationRequestCompat.Api19Impl.sSetExpireInMethod     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                if (r4 != 0) goto L105
                java.lang.Class<?> r4 = androidx.core.location.LocationRequestCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.String r5 = "setExpireIn"
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                r6[r2] = r7     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.reflect.Method r2 = r4.getDeclaredMethod(r5, r6)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                androidx.core.location.LocationRequestCompat.Api19Impl.sSetExpireInMethod = r2     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.reflect.Method r2 = androidx.core.location.LocationRequestCompat.Api19Impl.sSetExpireInMethod     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                r2.setAccessible(r3)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
            L105:
                java.lang.reflect.Method r2 = androidx.core.location.LocationRequestCompat.Api19Impl.sSetExpireInMethod     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                long r3 = r8.getDurationMillis()     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
                r2.invoke(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L117 java.lang.IllegalAccessException -> L119 java.lang.reflect.InvocationTargetException -> L11b java.lang.NoSuchMethodException -> L11d
            L116:
                return r1
            L117:
                r1 = move-exception
                goto L11e
            L119:
                r1 = move-exception
                goto L11e
            L11b:
                r1 = move-exception
                goto L11e
            L11d:
                r1 = move-exception
            L11e:
                return r0
        }
    }

    private static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.location.LocationRequest toLocationRequest(androidx.core.location.LocationRequestCompat r3) {
                android.location.LocationRequest$Builder r0 = new android.location.LocationRequest$Builder
                long r1 = r3.getIntervalMillis()
                r0.<init>(r1)
                int r1 = r3.getQuality()
                android.location.LocationRequest$Builder r0 = r0.setQuality(r1)
                long r1 = r3.getMinUpdateIntervalMillis()
                android.location.LocationRequest$Builder r0 = r0.setMinUpdateIntervalMillis(r1)
                long r1 = r3.getDurationMillis()
                android.location.LocationRequest$Builder r0 = r0.setDurationMillis(r1)
                int r1 = r3.getMaxUpdates()
                android.location.LocationRequest$Builder r0 = r0.setMaxUpdates(r1)
                float r1 = r3.getMinUpdateDistanceMeters()
                android.location.LocationRequest$Builder r0 = r0.setMinUpdateDistanceMeters(r1)
                long r1 = r3.getMaxUpdateDelayMillis()
                android.location.LocationRequest$Builder r0 = r0.setMaxUpdateDelayMillis(r1)
                android.location.LocationRequest r0 = r0.build()
                return r0
        }
    }

    public static final class Builder {
        private long mDurationMillis;
        private long mIntervalMillis;
        private long mMaxUpdateDelayMillis;
        private int mMaxUpdates;
        private float mMinUpdateDistanceMeters;
        private long mMinUpdateIntervalMillis;
        private int mQuality;

        public Builder(long r3) {
                r2 = this;
                r2.<init>()
                r2.setIntervalMillis(r3)
                r0 = 102(0x66, float:1.43E-43)
                r2.mQuality = r0
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r2.mDurationMillis = r0
                r0 = 2147483647(0x7fffffff, float:NaN)
                r2.mMaxUpdates = r0
                r0 = -1
                r2.mMinUpdateIntervalMillis = r0
                r0 = 0
                r2.mMinUpdateDistanceMeters = r0
                r0 = 0
                r2.mMaxUpdateDelayMillis = r0
                return
        }

        public Builder(androidx.core.location.LocationRequestCompat r3) {
                r2 = this;
                r2.<init>()
                long r0 = r3.mIntervalMillis
                r2.mIntervalMillis = r0
                int r0 = r3.mQuality
                r2.mQuality = r0
                long r0 = r3.mDurationMillis
                r2.mDurationMillis = r0
                int r0 = r3.mMaxUpdates
                r2.mMaxUpdates = r0
                long r0 = r3.mMinUpdateIntervalMillis
                r2.mMinUpdateIntervalMillis = r0
                float r0 = r3.mMinUpdateDistanceMeters
                r2.mMinUpdateDistanceMeters = r0
                long r0 = r3.mMaxUpdateDelayMillis
                r2.mMaxUpdateDelayMillis = r0
                return
        }

        public androidx.core.location.LocationRequestCompat build() {
                r14 = this;
                long r0 = r14.mIntervalMillis
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L16
                long r0 = r14.mMinUpdateIntervalMillis
                r2 = -1
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L14
                goto L16
            L14:
                r0 = 0
                goto L17
            L16:
                r0 = 1
            L17:
                java.lang.String r1 = "passive location requests must have an explicit minimum update interval"
                androidx.core.util.Preconditions.checkState(r0, r1)
                androidx.core.location.LocationRequestCompat r2 = new androidx.core.location.LocationRequestCompat
                long r3 = r14.mIntervalMillis
                int r5 = r14.mQuality
                long r6 = r14.mDurationMillis
                int r8 = r14.mMaxUpdates
                long r0 = r14.mMinUpdateIntervalMillis
                long r9 = r14.mIntervalMillis
                long r9 = java.lang.Math.min(r0, r9)
                float r11 = r14.mMinUpdateDistanceMeters
                long r12 = r14.mMaxUpdateDelayMillis
                r2.<init>(r3, r5, r6, r8, r9, r11, r12)
                return r2
        }

        public androidx.core.location.LocationRequestCompat.Builder clearMinUpdateIntervalMillis() {
                r2 = this;
                r0 = -1
                r2.mMinUpdateIntervalMillis = r0
                return r2
        }

        public androidx.core.location.LocationRequestCompat.Builder setDurationMillis(long r8) {
                r7 = this;
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.String r6 = "durationMillis"
                r2 = 1
                r0 = r8
                long r8 = androidx.core.util.Preconditions.checkArgumentInRange(r0, r2, r4, r6)
                r7.mDurationMillis = r8
                return r7
        }

        public androidx.core.location.LocationRequestCompat.Builder setIntervalMillis(long r8) {
                r7 = this;
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.String r6 = "intervalMillis"
                r2 = 0
                r0 = r8
                long r8 = androidx.core.util.Preconditions.checkArgumentInRange(r0, r2, r4, r6)
                r7.mIntervalMillis = r8
                return r7
        }

        public androidx.core.location.LocationRequestCompat.Builder setMaxUpdateDelayMillis(long r8) {
                r7 = this;
                r7.mMaxUpdateDelayMillis = r8
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.String r6 = "maxUpdateDelayMillis"
                r2 = 0
                r0 = r8
                long r8 = androidx.core.util.Preconditions.checkArgumentInRange(r0, r2, r4, r6)
                r7.mMaxUpdateDelayMillis = r8
                return r7
        }

        public androidx.core.location.LocationRequestCompat.Builder setMaxUpdates(int r4) {
                r3 = this;
                r0 = 2147483647(0x7fffffff, float:NaN)
                java.lang.String r1 = "maxUpdates"
                r2 = 1
                int r0 = androidx.core.util.Preconditions.checkArgumentInRange(r4, r2, r0, r1)
                r3.mMaxUpdates = r0
                return r3
        }

        public androidx.core.location.LocationRequestCompat.Builder setMinUpdateDistanceMeters(float r4) {
                r3 = this;
                r3.mMinUpdateDistanceMeters = r4
                r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
                java.lang.String r1 = "minUpdateDistanceMeters"
                r2 = 0
                float r0 = androidx.core.util.Preconditions.checkArgumentInRange(r4, r2, r0, r1)
                r3.mMinUpdateDistanceMeters = r0
                return r3
        }

        public androidx.core.location.LocationRequestCompat.Builder setMinUpdateIntervalMillis(long r8) {
                r7 = this;
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.String r6 = "minUpdateIntervalMillis"
                r2 = 0
                r0 = r8
                long r8 = androidx.core.util.Preconditions.checkArgumentInRange(r0, r2, r4, r6)
                r7.mMinUpdateIntervalMillis = r8
                return r7
        }

        public androidx.core.location.LocationRequestCompat.Builder setQuality(int r4) {
                r3 = this;
                r0 = 104(0x68, float:1.46E-43)
                if (r4 == r0) goto Lf
                r0 = 102(0x66, float:1.43E-43)
                if (r4 == r0) goto Lf
                r0 = 100
                if (r4 != r0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r2 = "quality must be a defined QUALITY constant, not %d"
                androidx.core.util.Preconditions.checkArgument(r0, r2, r1)
                r3.mQuality = r4
                return r3
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Quality {
    }

    LocationRequestCompat(long r1, int r3, long r4, int r6, long r7, float r9, long r10) {
            r0 = this;
            r0.<init>()
            r0.mIntervalMillis = r1
            r0.mQuality = r3
            r0.mMinUpdateIntervalMillis = r7
            r0.mDurationMillis = r4
            r0.mMaxUpdates = r6
            r0.mMinUpdateDistanceMeters = r9
            r0.mMaxUpdateDelayMillis = r10
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof androidx.core.location.LocationRequestCompat
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r8
            androidx.core.location.LocationRequestCompat r1 = (androidx.core.location.LocationRequestCompat) r1
            int r3 = r7.mQuality
            int r4 = r1.mQuality
            if (r3 != r4) goto L44
            long r3 = r7.mIntervalMillis
            long r5 = r1.mIntervalMillis
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L44
            long r3 = r7.mMinUpdateIntervalMillis
            long r5 = r1.mMinUpdateIntervalMillis
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L44
            long r3 = r7.mDurationMillis
            long r5 = r1.mDurationMillis
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L44
            int r3 = r7.mMaxUpdates
            int r4 = r1.mMaxUpdates
            if (r3 != r4) goto L44
            float r3 = r1.mMinUpdateDistanceMeters
            float r4 = r7.mMinUpdateDistanceMeters
            int r3 = java.lang.Float.compare(r3, r4)
            if (r3 != 0) goto L44
            long r3 = r7.mMaxUpdateDelayMillis
            long r5 = r1.mMaxUpdateDelayMillis
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L44
            goto L45
        L44:
            r0 = r2
        L45:
            return r0
    }

    public long getDurationMillis() {
            r2 = this;
            long r0 = r2.mDurationMillis
            return r0
    }

    public long getIntervalMillis() {
            r2 = this;
            long r0 = r2.mIntervalMillis
            return r0
    }

    public long getMaxUpdateDelayMillis() {
            r2 = this;
            long r0 = r2.mMaxUpdateDelayMillis
            return r0
    }

    public int getMaxUpdates() {
            r1 = this;
            int r0 = r1.mMaxUpdates
            return r0
    }

    public float getMinUpdateDistanceMeters() {
            r1 = this;
            float r0 = r1.mMinUpdateDistanceMeters
            return r0
    }

    public long getMinUpdateIntervalMillis() {
            r4 = this;
            long r0 = r4.mMinUpdateIntervalMillis
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lb
            long r0 = r4.mIntervalMillis
            return r0
        Lb:
            long r0 = r4.mMinUpdateIntervalMillis
            return r0
    }

    public int getQuality() {
            r1 = this;
            int r0 = r1.mQuality
            return r0
    }

    public int hashCode() {
            r7 = this;
            int r0 = r7.mQuality
            int r1 = r0 * 31
            long r2 = r7.mIntervalMillis
            long r4 = r7.mIntervalMillis
            r6 = 32
            long r4 = r4 >>> r6
            long r2 = r2 ^ r4
            int r2 = (int) r2
            int r1 = r1 + r2
            int r0 = r1 * 31
            long r2 = r7.mMinUpdateIntervalMillis
            long r4 = r7.mMinUpdateIntervalMillis
            long r4 = r4 >>> r6
            long r2 = r2 ^ r4
            int r2 = (int) r2
            int r0 = r0 + r2
            return r0
    }

    public android.location.LocationRequest toLocationRequest() {
            r1 = this;
            android.location.LocationRequest r0 = androidx.core.location.LocationRequestCompat.Api31Impl.toLocationRequest(r1)
            return r0
    }

    public android.location.LocationRequest toLocationRequest(java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            android.location.LocationRequest r0 = r2.toLocationRequest()
            return r0
        Lb:
            java.lang.Object r0 = androidx.core.location.LocationRequestCompat.Api19Impl.toLocationRequest(r2, r3)
            android.location.LocationRequest r0 = (android.location.LocationRequest) r0
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Request["
            r0.append(r1)
            long r1 = r5.mIntervalMillis
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L38
            java.lang.String r1 = "@"
            r0.append(r1)
            long r1 = r5.mIntervalMillis
            androidx.core.util.TimeUtils.formatDuration(r1, r0)
            int r1 = r5.mQuality
            switch(r1) {
                case 100: goto L31;
                case 101: goto L24;
                case 102: goto L2b;
                case 103: goto L24;
                case 104: goto L25;
                default: goto L24;
            }
        L24:
            goto L37
        L25:
            java.lang.String r1 = " LOW_POWER"
            r0.append(r1)
            goto L37
        L2b:
            java.lang.String r1 = " BALANCED"
            r0.append(r1)
            goto L37
        L31:
            java.lang.String r1 = " HIGH_ACCURACY"
            r0.append(r1)
        L37:
            goto L3d
        L38:
            java.lang.String r1 = "PASSIVE"
            r0.append(r1)
        L3d:
            long r1 = r5.mDurationMillis
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L4d
            java.lang.String r1 = ", duration="
            r0.append(r1)
            long r1 = r5.mDurationMillis
            androidx.core.util.TimeUtils.formatDuration(r1, r0)
        L4d:
            int r1 = r5.mMaxUpdates
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r2) goto L5f
            java.lang.String r1 = ", maxUpdates="
            java.lang.StringBuilder r1 = r0.append(r1)
            int r2 = r5.mMaxUpdates
            r1.append(r2)
        L5f:
            long r1 = r5.mMinUpdateIntervalMillis
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L79
            long r1 = r5.mMinUpdateIntervalMillis
            long r3 = r5.mIntervalMillis
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L79
            java.lang.String r1 = ", minUpdateInterval="
            r0.append(r1)
            long r1 = r5.mMinUpdateIntervalMillis
            androidx.core.util.TimeUtils.formatDuration(r1, r0)
        L79:
            float r1 = r5.mMinUpdateDistanceMeters
            double r1 = (double) r1
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L8d
            java.lang.String r1 = ", minUpdateDistance="
            java.lang.StringBuilder r1 = r0.append(r1)
            float r2 = r5.mMinUpdateDistanceMeters
            r1.append(r2)
        L8d:
            long r1 = r5.mMaxUpdateDelayMillis
            r3 = 2
            long r1 = r1 / r3
            long r3 = r5.mIntervalMillis
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto La2
            java.lang.String r1 = ", maxUpdateDelay="
            r0.append(r1)
            long r1 = r5.mMaxUpdateDelayMillis
            androidx.core.util.TimeUtils.formatDuration(r1, r0)
        La2:
            r1 = 93
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }
}
