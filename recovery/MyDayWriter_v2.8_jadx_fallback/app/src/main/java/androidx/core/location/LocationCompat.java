package androidx.core.location;

/* JADX INFO: loaded from: classes.dex */
public final class LocationCompat {
    public static final java.lang.String EXTRA_BEARING_ACCURACY = "bearingAccuracy";
    public static final java.lang.String EXTRA_IS_MOCK = "mockLocation";
    public static final java.lang.String EXTRA_MSL_ALTITUDE = "androidx.core.location.extra.MSL_ALTITUDE";
    public static final java.lang.String EXTRA_MSL_ALTITUDE_ACCURACY = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";
    public static final java.lang.String EXTRA_SPEED_ACCURACY = "speedAccuracy";
    public static final java.lang.String EXTRA_VERTICAL_ACCURACY = "verticalAccuracy";
    private static java.lang.reflect.Field sFieldsMaskField;
    private static java.lang.Integer sHasBearingAccuracyMask;
    private static java.lang.Integer sHasSpeedAccuracyMask;
    private static java.lang.Integer sHasVerticalAccuracyMask;
    private static java.lang.reflect.Method sSetIsFromMockProviderMethod;

    private static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static float getBearingAccuracyDegrees(android.location.Location r1) {
                float r0 = r1.getBearingAccuracyDegrees()
                return r0
        }

        static float getSpeedAccuracyMetersPerSecond(android.location.Location r1) {
                float r0 = r1.getSpeedAccuracyMetersPerSecond()
                return r0
        }

        static float getVerticalAccuracyMeters(android.location.Location r1) {
                float r0 = r1.getVerticalAccuracyMeters()
                return r0
        }

        static boolean hasBearingAccuracy(android.location.Location r1) {
                boolean r0 = r1.hasBearingAccuracy()
                return r0
        }

        static boolean hasSpeedAccuracy(android.location.Location r1) {
                boolean r0 = r1.hasSpeedAccuracy()
                return r0
        }

        static boolean hasVerticalAccuracy(android.location.Location r1) {
                boolean r0 = r1.hasVerticalAccuracy()
                return r0
        }

        static void removeBearingAccuracy(android.location.Location r2) {
                java.lang.reflect.Field r0 = androidx.core.location.LocationCompat.getFieldsMaskField()     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L22
                byte r0 = r0.getByte(r2)     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L22
                int r1 = androidx.core.location.LocationCompat.getHasBearingAccuracyMask()     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L22
                int r1 = ~r1     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L22
                r1 = r1 & r0
                byte r0 = (byte) r1     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L22
                java.lang.reflect.Field r1 = androidx.core.location.LocationCompat.getFieldsMaskField()     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L22
                r1.setByte(r2, r0)     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L22
                return
            L18:
                r0 = move-exception
                java.lang.IllegalAccessError r1 = new java.lang.IllegalAccessError
                r1.<init>()
                r1.initCause(r0)
                throw r1
            L22:
                r0 = move-exception
                java.lang.NoSuchFieldError r1 = new java.lang.NoSuchFieldError
                r1.<init>()
                r1.initCause(r0)
                throw r1
        }

        static void removeSpeedAccuracy(android.location.Location r2) {
                java.lang.reflect.Field r0 = androidx.core.location.LocationCompat.getFieldsMaskField()     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L22
                byte r0 = r0.getByte(r2)     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L22
                int r1 = androidx.core.location.LocationCompat.getHasSpeedAccuracyMask()     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L22
                int r1 = ~r1     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L22
                r1 = r1 & r0
                byte r0 = (byte) r1     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L22
                java.lang.reflect.Field r1 = androidx.core.location.LocationCompat.getFieldsMaskField()     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L22
                r1.setByte(r2, r0)     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L22
                return
            L18:
                r0 = move-exception
                java.lang.IllegalAccessError r1 = new java.lang.IllegalAccessError
                r1.<init>()
                r1.initCause(r0)
                throw r1
            L22:
                r0 = move-exception
                java.lang.NoSuchFieldError r1 = new java.lang.NoSuchFieldError
                r1.<init>()
                r1.initCause(r0)
                throw r1
        }

        static void removeVerticalAccuracy(android.location.Location r2) {
                java.lang.reflect.Field r0 = androidx.core.location.LocationCompat.getFieldsMaskField()     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L1a
                byte r0 = r0.getByte(r2)     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L1a
                int r1 = androidx.core.location.LocationCompat.getHasVerticalAccuracyMask()     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L1a
                int r1 = ~r1     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L1a
                r1 = r1 & r0
                byte r0 = (byte) r1     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L1a
                java.lang.reflect.Field r1 = androidx.core.location.LocationCompat.getFieldsMaskField()     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L1a
                r1.setByte(r2, r0)     // Catch: java.lang.IllegalAccessException -> L18 java.lang.NoSuchFieldException -> L1a
                return
            L18:
                r0 = move-exception
                goto L1b
            L1a:
                r0 = move-exception
            L1b:
                java.lang.IllegalAccessError r1 = new java.lang.IllegalAccessError
                r1.<init>()
                r1.initCause(r0)
                throw r1
        }

        static void setBearingAccuracyDegrees(android.location.Location r0, float r1) {
                r0.setBearingAccuracyDegrees(r1)
                return
        }

        static void setSpeedAccuracyMetersPerSecond(android.location.Location r0, float r1) {
                r0.setSpeedAccuracyMetersPerSecond(r1)
                return
        }

        static void setVerticalAccuracyMeters(android.location.Location r0, float r1) {
                r0.setVerticalAccuracyMeters(r1)
                return
        }
    }

    private static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void removeBearingAccuracy(android.location.Location r25) {
                r0 = r25
                boolean r1 = r0.hasBearingAccuracy()
                if (r1 != 0) goto L9
                return
            L9:
                java.lang.String r1 = r0.getProvider()
                long r2 = r0.getTime()
                long r4 = r0.getElapsedRealtimeNanos()
                double r6 = r0.getLatitude()
                double r8 = r0.getLongitude()
                boolean r10 = r0.hasAltitude()
                double r11 = r0.getAltitude()
                boolean r13 = r0.hasSpeed()
                float r14 = r0.getSpeed()
                boolean r15 = r0.hasBearing()
                r16 = r10
                float r10 = r0.getBearing()
                boolean r17 = r0.hasAccuracy()
                r18 = r13
                float r13 = r0.getAccuracy()
                boolean r19 = r0.hasVerticalAccuracy()
                r20 = r15
                float r15 = r0.getVerticalAccuracyMeters()
                boolean r21 = r0.hasSpeedAccuracy()
                r22 = r15
                float r15 = r0.getSpeedAccuracyMetersPerSecond()
                r23 = r15
                android.os.Bundle r15 = r0.getExtras()
                r0.reset()
                r0.setProvider(r1)
                r0.setTime(r2)
                r0.setElapsedRealtimeNanos(r4)
                r0.setLatitude(r6)
                r0.setLongitude(r8)
                if (r16 == 0) goto L72
                r0.setAltitude(r11)
            L72:
                if (r18 == 0) goto L77
                r0.setSpeed(r14)
            L77:
                if (r20 == 0) goto L7c
                r0.setBearing(r10)
            L7c:
                if (r17 == 0) goto L81
                r0.setAccuracy(r13)
            L81:
                if (r19 == 0) goto L8b
                r24 = r1
                r1 = r22
                r0.setVerticalAccuracyMeters(r1)
                goto L8f
            L8b:
                r24 = r1
                r1 = r22
            L8f:
                if (r21 == 0) goto L99
                r22 = r1
                r1 = r23
                r0.setBearingAccuracyDegrees(r1)
                goto L9d
            L99:
                r22 = r1
                r1 = r23
            L9d:
                if (r15 == 0) goto La2
                r0.setExtras(r15)
            La2:
                return
        }

        static void removeSpeedAccuracy(android.location.Location r25) {
                r0 = r25
                boolean r1 = r0.hasSpeedAccuracy()
                if (r1 != 0) goto L9
                return
            L9:
                java.lang.String r1 = r0.getProvider()
                long r2 = r0.getTime()
                long r4 = r0.getElapsedRealtimeNanos()
                double r6 = r0.getLatitude()
                double r8 = r0.getLongitude()
                boolean r10 = r0.hasAltitude()
                double r11 = r0.getAltitude()
                boolean r13 = r0.hasSpeed()
                float r14 = r0.getSpeed()
                boolean r15 = r0.hasBearing()
                r16 = r10
                float r10 = r0.getBearing()
                boolean r17 = r0.hasAccuracy()
                r18 = r13
                float r13 = r0.getAccuracy()
                boolean r19 = r0.hasVerticalAccuracy()
                r20 = r15
                float r15 = r0.getVerticalAccuracyMeters()
                boolean r21 = r0.hasBearingAccuracy()
                r22 = r15
                float r15 = r0.getBearingAccuracyDegrees()
                r23 = r15
                android.os.Bundle r15 = r0.getExtras()
                r0.reset()
                r0.setProvider(r1)
                r0.setTime(r2)
                r0.setElapsedRealtimeNanos(r4)
                r0.setLatitude(r6)
                r0.setLongitude(r8)
                if (r16 == 0) goto L72
                r0.setAltitude(r11)
            L72:
                if (r18 == 0) goto L77
                r0.setSpeed(r14)
            L77:
                if (r20 == 0) goto L7c
                r0.setBearing(r10)
            L7c:
                if (r17 == 0) goto L81
                r0.setAccuracy(r13)
            L81:
                if (r19 == 0) goto L8b
                r24 = r1
                r1 = r22
                r0.setVerticalAccuracyMeters(r1)
                goto L8f
            L8b:
                r24 = r1
                r1 = r22
            L8f:
                if (r21 == 0) goto L99
                r22 = r1
                r1 = r23
                r0.setBearingAccuracyDegrees(r1)
                goto L9d
            L99:
                r22 = r1
                r1 = r23
            L9d:
                if (r15 == 0) goto La2
                r0.setExtras(r15)
            La2:
                return
        }

        static void removeVerticalAccuracy(android.location.Location r25) {
                r0 = r25
                boolean r1 = r0.hasVerticalAccuracy()
                if (r1 != 0) goto L9
                return
            L9:
                java.lang.String r1 = r0.getProvider()
                long r2 = r0.getTime()
                long r4 = r0.getElapsedRealtimeNanos()
                double r6 = r0.getLatitude()
                double r8 = r0.getLongitude()
                boolean r10 = r0.hasAltitude()
                double r11 = r0.getAltitude()
                boolean r13 = r0.hasSpeed()
                float r14 = r0.getSpeed()
                boolean r15 = r0.hasBearing()
                r16 = r10
                float r10 = r0.getBearing()
                boolean r17 = r0.hasAccuracy()
                r18 = r13
                float r13 = r0.getAccuracy()
                boolean r19 = r0.hasSpeedAccuracy()
                r20 = r15
                float r15 = r0.getSpeedAccuracyMetersPerSecond()
                boolean r21 = r0.hasBearingAccuracy()
                r22 = r15
                float r15 = r0.getBearingAccuracyDegrees()
                r23 = r15
                android.os.Bundle r15 = r0.getExtras()
                r0.reset()
                r0.setProvider(r1)
                r0.setTime(r2)
                r0.setElapsedRealtimeNanos(r4)
                r0.setLatitude(r6)
                r0.setLongitude(r8)
                if (r16 == 0) goto L72
                r0.setAltitude(r11)
            L72:
                if (r18 == 0) goto L77
                r0.setSpeed(r14)
            L77:
                if (r20 == 0) goto L7c
                r0.setBearing(r10)
            L7c:
                if (r17 == 0) goto L81
                r0.setAccuracy(r13)
            L81:
                if (r19 == 0) goto L8b
                r24 = r1
                r1 = r22
                r0.setSpeedAccuracyMetersPerSecond(r1)
                goto L8f
            L8b:
                r24 = r1
                r1 = r22
            L8f:
                if (r21 == 0) goto L99
                r22 = r1
                r1 = r23
                r0.setBearingAccuracyDegrees(r1)
                goto L9d
            L99:
                r22 = r1
                r1 = r23
            L9d:
                if (r15 == 0) goto La2
                r0.setExtras(r15)
            La2:
                return
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void removeBearingAccuracy(android.location.Location r2) {
                boolean r0 = r2.hasBearingAccuracy()
                if (r0 != 0) goto L7
                return
            L7:
                double r0 = r2.getElapsedRealtimeUncertaintyNanos()
                androidx.core.location.LocationCompat.Api28Impl.removeBearingAccuracy(r2)
                r2.setElapsedRealtimeUncertaintyNanos(r0)
                return
        }

        static void removeSpeedAccuracy(android.location.Location r2) {
                boolean r0 = r2.hasSpeedAccuracy()
                if (r0 != 0) goto L7
                return
            L7:
                double r0 = r2.getElapsedRealtimeUncertaintyNanos()
                androidx.core.location.LocationCompat.Api28Impl.removeSpeedAccuracy(r2)
                r2.setElapsedRealtimeUncertaintyNanos(r0)
                return
        }

        static void removeVerticalAccuracy(android.location.Location r2) {
                boolean r0 = r2.hasVerticalAccuracy()
                if (r0 != 0) goto L7
                return
            L7:
                double r0 = r2.getElapsedRealtimeUncertaintyNanos()
                androidx.core.location.LocationCompat.Api28Impl.removeVerticalAccuracy(r2)
                r2.setElapsedRealtimeUncertaintyNanos(r0)
                return
        }
    }

    static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isMock(android.location.Location r1) {
                boolean r0 = r1.isMock()
                return r0
        }
    }

    private static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void removeBearingAccuracy(android.location.Location r0) {
                r0.removeBearingAccuracy()
                return
        }

        static void removeSpeedAccuracy(android.location.Location r0) {
                r0.removeSpeedAccuracy()
                return
        }

        static void removeVerticalAccuracy(android.location.Location r0) {
                r0.removeVerticalAccuracy()
                return
        }
    }

    private static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static float getMslAltitudeAccuracyMeters(android.location.Location r1) {
                float r0 = r1.getMslAltitudeAccuracyMeters()
                return r0
        }

        static double getMslAltitudeMeters(android.location.Location r2) {
                double r0 = r2.getMslAltitudeMeters()
                return r0
        }

        static boolean hasMslAltitude(android.location.Location r1) {
                boolean r0 = r1.hasMslAltitude()
                return r0
        }

        static boolean hasMslAltitudeAccuracy(android.location.Location r1) {
                boolean r0 = r1.hasMslAltitudeAccuracy()
                return r0
        }

        static void removeMslAltitude(android.location.Location r0) {
                r0.removeMslAltitude()
                return
        }

        static void removeMslAltitudeAccuracy(android.location.Location r0) {
                r0.removeMslAltitudeAccuracy()
                return
        }

        static void setMslAltitudeAccuracyMeters(android.location.Location r0, float r1) {
                r0.setMslAltitudeAccuracyMeters(r1)
                return
        }

        static void setMslAltitudeMeters(android.location.Location r0, double r1) {
                r0.setMslAltitudeMeters(r1)
                return
        }
    }

    private LocationCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean containsExtra(android.location.Location r2, java.lang.String r3) {
            android.os.Bundle r0 = r2.getExtras()
            if (r0 == 0) goto Le
            boolean r1 = r0.containsKey(r3)
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public static float getBearingAccuracyDegrees(android.location.Location r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            float r0 = androidx.core.location.LocationCompat.Api26Impl.getBearingAccuracyDegrees(r3)
            return r0
        Lb:
            android.os.Bundle r0 = r3.getExtras()
            r1 = 0
            if (r0 != 0) goto L13
            return r1
        L13:
            java.lang.String r2 = "bearingAccuracy"
            float r1 = r0.getFloat(r2, r1)
            return r1
    }

    public static long getElapsedRealtimeMillis(android.location.Location r3) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = r3.getElapsedRealtimeNanos()
            long r0 = r0.toMillis(r1)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "location.getElapsedRealtimeNanos()")
    @java.lang.Deprecated
    public static long getElapsedRealtimeNanos(android.location.Location r2) {
            long r0 = r2.getElapsedRealtimeNanos()
            return r0
    }

    static java.lang.reflect.Field getFieldsMaskField() throws java.lang.NoSuchFieldException {
            java.lang.reflect.Field r0 = androidx.core.location.LocationCompat.sFieldsMaskField
            if (r0 != 0) goto L14
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            java.lang.String r1 = "mFieldsMask"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            androidx.core.location.LocationCompat.sFieldsMaskField = r0
            java.lang.reflect.Field r0 = androidx.core.location.LocationCompat.sFieldsMaskField
            r1 = 1
            r0.setAccessible(r1)
        L14:
            java.lang.reflect.Field r0 = androidx.core.location.LocationCompat.sFieldsMaskField
            return r0
    }

    static int getHasBearingAccuracyMask() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
            java.lang.Integer r0 = androidx.core.location.LocationCompat.sHasBearingAccuracyMask
            if (r0 != 0) goto L1b
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            java.lang.String r1 = "HAS_BEARING_ACCURACY_MASK"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r1 = 1
            r0.setAccessible(r1)
            r1 = 0
            int r1 = r0.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            androidx.core.location.LocationCompat.sHasBearingAccuracyMask = r1
        L1b:
            java.lang.Integer r0 = androidx.core.location.LocationCompat.sHasBearingAccuracyMask
            int r0 = r0.intValue()
            return r0
    }

    static int getHasSpeedAccuracyMask() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
            java.lang.Integer r0 = androidx.core.location.LocationCompat.sHasSpeedAccuracyMask
            if (r0 != 0) goto L1b
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            java.lang.String r1 = "HAS_SPEED_ACCURACY_MASK"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r1 = 1
            r0.setAccessible(r1)
            r1 = 0
            int r1 = r0.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            androidx.core.location.LocationCompat.sHasSpeedAccuracyMask = r1
        L1b:
            java.lang.Integer r0 = androidx.core.location.LocationCompat.sHasSpeedAccuracyMask
            int r0 = r0.intValue()
            return r0
    }

    static int getHasVerticalAccuracyMask() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
            java.lang.Integer r0 = androidx.core.location.LocationCompat.sHasVerticalAccuracyMask
            if (r0 != 0) goto L1b
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            java.lang.String r1 = "HAS_VERTICAL_ACCURACY_MASK"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r1 = 1
            r0.setAccessible(r1)
            r1 = 0
            int r1 = r0.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            androidx.core.location.LocationCompat.sHasVerticalAccuracyMask = r1
        L1b:
            java.lang.Integer r0 = androidx.core.location.LocationCompat.sHasVerticalAccuracyMask
            int r0 = r0.intValue()
            return r0
    }

    public static float getMslAltitudeAccuracyMeters(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            float r0 = androidx.core.location.LocationCompat.Api34Impl.getMslAltitudeAccuracyMeters(r2)
            return r0
        Lb:
            android.os.Bundle r0 = getOrCreateExtras(r2)
            java.lang.String r1 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"
            float r0 = r0.getFloat(r1)
            return r0
    }

    public static double getMslAltitudeMeters(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            double r0 = androidx.core.location.LocationCompat.Api34Impl.getMslAltitudeMeters(r2)
            return r0
        Lb:
            android.os.Bundle r0 = getOrCreateExtras(r2)
            java.lang.String r1 = "androidx.core.location.extra.MSL_ALTITUDE"
            double r0 = r0.getDouble(r1)
            return r0
    }

    private static android.os.Bundle getOrCreateExtras(android.location.Location r2) {
            android.os.Bundle r0 = r2.getExtras()
            if (r0 != 0) goto L12
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r2.setExtras(r1)
            android.os.Bundle r0 = r2.getExtras()
        L12:
            return r0
    }

    private static java.lang.reflect.Method getSetIsFromMockProviderMethod() throws java.lang.NoSuchMethodException {
            java.lang.reflect.Method r0 = androidx.core.location.LocationCompat.sSetIsFromMockProviderMethod
            if (r0 != 0) goto L1b
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]
            r3 = 0
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r2[r3] = r4
            java.lang.String r3 = "setIsFromMockProvider"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r2)
            androidx.core.location.LocationCompat.sSetIsFromMockProviderMethod = r0
            java.lang.reflect.Method r0 = androidx.core.location.LocationCompat.sSetIsFromMockProviderMethod
            r0.setAccessible(r1)
        L1b:
            java.lang.reflect.Method r0 = androidx.core.location.LocationCompat.sSetIsFromMockProviderMethod
            return r0
    }

    public static float getSpeedAccuracyMetersPerSecond(android.location.Location r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            float r0 = androidx.core.location.LocationCompat.Api26Impl.getSpeedAccuracyMetersPerSecond(r3)
            return r0
        Lb:
            android.os.Bundle r0 = r3.getExtras()
            r1 = 0
            if (r0 != 0) goto L13
            return r1
        L13:
            java.lang.String r2 = "speedAccuracy"
            float r1 = r0.getFloat(r2, r1)
            return r1
    }

    public static float getVerticalAccuracyMeters(android.location.Location r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            float r0 = androidx.core.location.LocationCompat.Api26Impl.getVerticalAccuracyMeters(r3)
            return r0
        Lb:
            android.os.Bundle r0 = r3.getExtras()
            r1 = 0
            if (r0 != 0) goto L13
            return r1
        L13:
            java.lang.String r2 = "verticalAccuracy"
            float r1 = r0.getFloat(r2, r1)
            return r1
    }

    public static boolean hasBearingAccuracy(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.location.LocationCompat.Api26Impl.hasBearingAccuracy(r2)
            return r0
        Lb:
            java.lang.String r0 = "bearingAccuracy"
            boolean r0 = containsExtra(r2, r0)
            return r0
    }

    public static boolean hasMslAltitude(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.location.LocationCompat.Api34Impl.hasMslAltitude(r2)
            return r0
        Lb:
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE"
            boolean r0 = containsExtra(r2, r0)
            return r0
    }

    public static boolean hasMslAltitudeAccuracy(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.location.LocationCompat.Api34Impl.hasMslAltitudeAccuracy(r2)
            return r0
        Lb:
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"
            boolean r0 = containsExtra(r2, r0)
            return r0
    }

    public static boolean hasSpeedAccuracy(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.location.LocationCompat.Api26Impl.hasSpeedAccuracy(r2)
            return r0
        Lb:
            java.lang.String r0 = "speedAccuracy"
            boolean r0 = containsExtra(r2, r0)
            return r0
    }

    public static boolean hasVerticalAccuracy(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.location.LocationCompat.Api26Impl.hasVerticalAccuracy(r2)
            return r0
        Lb:
            java.lang.String r0 = "verticalAccuracy"
            boolean r0 = containsExtra(r2, r0)
            return r0
    }

    public static boolean isMock(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.location.LocationCompat.Api31Impl.isMock(r2)
            return r0
        Lb:
            boolean r0 = r2.isFromMockProvider()
            return r0
    }

    public static void removeBearingAccuracy(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api33Impl.removeBearingAccuracy(r2)
            goto L2d
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L14
            androidx.core.location.LocationCompat.Api29Impl.removeBearingAccuracy(r2)
            goto L2d
        L14:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L1e
            androidx.core.location.LocationCompat.Api28Impl.removeBearingAccuracy(r2)
            goto L2d
        L1e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L28
            androidx.core.location.LocationCompat.Api26Impl.removeBearingAccuracy(r2)
            goto L2d
        L28:
            java.lang.String r0 = "bearingAccuracy"
            removeExtra(r2, r0)
        L2d:
            return
    }

    private static void removeExtra(android.location.Location r2, java.lang.String r3) {
            android.os.Bundle r0 = r2.getExtras()
            if (r0 == 0) goto L13
            r0.remove(r3)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L13
            r1 = 0
            r2.setExtras(r1)
        L13:
            return
    }

    public static void removeMslAltitude(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api34Impl.removeMslAltitude(r2)
            goto Lf
        La:
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE"
            removeExtra(r2, r0)
        Lf:
            return
    }

    public static void removeMslAltitudeAccuracy(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api34Impl.removeMslAltitudeAccuracy(r2)
            goto Lf
        La:
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"
            removeExtra(r2, r0)
        Lf:
            return
    }

    public static void removeSpeedAccuracy(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api33Impl.removeSpeedAccuracy(r2)
            goto L2d
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L14
            androidx.core.location.LocationCompat.Api29Impl.removeSpeedAccuracy(r2)
            goto L2d
        L14:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L1e
            androidx.core.location.LocationCompat.Api28Impl.removeSpeedAccuracy(r2)
            goto L2d
        L1e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L28
            androidx.core.location.LocationCompat.Api26Impl.removeSpeedAccuracy(r2)
            goto L2d
        L28:
            java.lang.String r0 = "speedAccuracy"
            removeExtra(r2, r0)
        L2d:
            return
    }

    public static void removeVerticalAccuracy(android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api33Impl.removeVerticalAccuracy(r2)
            goto L2d
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L14
            androidx.core.location.LocationCompat.Api29Impl.removeVerticalAccuracy(r2)
            goto L2d
        L14:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L1e
            androidx.core.location.LocationCompat.Api28Impl.removeVerticalAccuracy(r2)
            goto L2d
        L1e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L28
            androidx.core.location.LocationCompat.Api26Impl.removeVerticalAccuracy(r2)
            goto L2d
        L28:
            java.lang.String r0 = "verticalAccuracy"
            removeExtra(r2, r0)
        L2d:
            return
    }

    public static void setBearingAccuracyDegrees(android.location.Location r2, float r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api26Impl.setBearingAccuracyDegrees(r2, r3)
            goto L13
        La:
            android.os.Bundle r0 = getOrCreateExtras(r2)
            java.lang.String r1 = "bearingAccuracy"
            r0.putFloat(r1, r3)
        L13:
            return
    }

    public static void setMock(android.location.Location r2, boolean r3) {
            java.lang.reflect.Method r0 = getSetIsFromMockProviderMethod()     // Catch: java.lang.reflect.InvocationTargetException -> L11 java.lang.IllegalAccessException -> L18 java.lang.NoSuchMethodException -> L22
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L11 java.lang.IllegalAccessException -> L18 java.lang.NoSuchMethodException -> L22
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.reflect.InvocationTargetException -> L11 java.lang.IllegalAccessException -> L18 java.lang.NoSuchMethodException -> L22
            r0.invoke(r2, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L11 java.lang.IllegalAccessException -> L18 java.lang.NoSuchMethodException -> L22
            return
        L11:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L18:
            r0 = move-exception
            java.lang.IllegalAccessError r1 = new java.lang.IllegalAccessError
            r1.<init>()
            r1.initCause(r0)
            throw r1
        L22:
            r0 = move-exception
            java.lang.NoSuchMethodError r1 = new java.lang.NoSuchMethodError
            r1.<init>()
            r1.initCause(r0)
            throw r1
    }

    public static void setMslAltitudeAccuracyMeters(android.location.Location r2, float r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api34Impl.setMslAltitudeAccuracyMeters(r2, r3)
            goto L13
        La:
            android.os.Bundle r0 = getOrCreateExtras(r2)
            java.lang.String r1 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"
            r0.putFloat(r1, r3)
        L13:
            return
    }

    public static void setMslAltitudeMeters(android.location.Location r2, double r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api34Impl.setMslAltitudeMeters(r2, r3)
            goto L13
        La:
            android.os.Bundle r0 = getOrCreateExtras(r2)
            java.lang.String r1 = "androidx.core.location.extra.MSL_ALTITUDE"
            r0.putDouble(r1, r3)
        L13:
            return
    }

    public static void setSpeedAccuracyMetersPerSecond(android.location.Location r2, float r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api26Impl.setSpeedAccuracyMetersPerSecond(r2, r3)
            goto L13
        La:
            android.os.Bundle r0 = getOrCreateExtras(r2)
            java.lang.String r1 = "speedAccuracy"
            r0.putFloat(r1, r3)
        L13:
            return
    }

    public static void setVerticalAccuracyMeters(android.location.Location r2, float r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api26Impl.setVerticalAccuracyMeters(r2, r3)
            goto L13
        La:
            android.os.Bundle r0 = getOrCreateExtras(r2)
            java.lang.String r1 = "verticalAccuracy"
            r0.putFloat(r1, r3)
        L13:
            return
    }
}
