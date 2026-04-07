package androidx.core.location;

/* JADX INFO: loaded from: classes.dex */
public final class LocationManagerCompat {
    private static final long GET_CURRENT_LOCATION_TIMEOUT_MS = 30000;
    private static final long MAX_CURRENT_LOCATION_AGE_MS = 10000;
    private static final long PRE_N_LOOPER_TIMEOUT_S = 5;
    private static java.lang.reflect.Field sContextField;
    private static java.lang.reflect.Method sGnssRequestBuilderBuildMethod;
    private static java.lang.Class<?> sGnssRequestBuilderClass;
    static final java.util.WeakHashMap<androidx.core.location.LocationManagerCompat.LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat.LocationListenerTransport>> sLocationListeners = null;
    private static java.lang.reflect.Method sRegisterGnssMeasurementsCallbackMethod;

    static class Api19Impl {
        private static java.lang.Class<?> sLocationRequestClass;
        private static java.lang.reflect.Method sRequestLocationUpdatesLooperMethod;

        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean tryRequestLocationUpdates(android.location.LocationManager r7, java.lang.String r8, androidx.core.location.LocationRequestCompat r9, androidx.core.location.LocationListenerCompat r10, android.os.Looper r11) {
                r0 = 0
                java.lang.Class<?> r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.UnsupportedOperationException -> L42 java.lang.ClassNotFoundException -> L44 java.lang.IllegalAccessException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a
                if (r1 != 0) goto Ld
                java.lang.String r1 = "android.location.LocationRequest"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.UnsupportedOperationException -> L42 java.lang.ClassNotFoundException -> L44 java.lang.IllegalAccessException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a
                androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass = r1     // Catch: java.lang.UnsupportedOperationException -> L42 java.lang.ClassNotFoundException -> L44 java.lang.IllegalAccessException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a
            Ld:
                java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod     // Catch: java.lang.UnsupportedOperationException -> L42 java.lang.ClassNotFoundException -> L44 java.lang.IllegalAccessException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a
                r2 = 1
                if (r1 != 0) goto L31
                java.lang.Class<android.location.LocationManager> r1 = android.location.LocationManager.class
                java.lang.String r3 = "requestLocationUpdates"
                r4 = 3
                java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.UnsupportedOperationException -> L42 java.lang.ClassNotFoundException -> L44 java.lang.IllegalAccessException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a
                java.lang.Class<?> r5 = androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.UnsupportedOperationException -> L42 java.lang.ClassNotFoundException -> L44 java.lang.IllegalAccessException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a
                r4[r0] = r5     // Catch: java.lang.UnsupportedOperationException -> L42 java.lang.ClassNotFoundException -> L44 java.lang.IllegalAccessException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a
                java.lang.Class<android.location.LocationListener> r5 = android.location.LocationListener.class
                r4[r2] = r5     // Catch: java.lang.UnsupportedOperationException -> L42 java.lang.ClassNotFoundException -> L44 java.lang.IllegalAccessException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a
                java.lang.Class<android.os.Looper> r5 = android.os.Looper.class
                r6 = 2
                r4[r6] = r5     // Catch: java.lang.UnsupportedOperationException -> L42 java.lang.ClassNotFoundException -> L44 java.lang.IllegalAccessException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.UnsupportedOperationException -> L42 java.lang.ClassNotFoundException -> L44 java.lang.IllegalAccessException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a
                androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod = r1     // Catch: java.lang.UnsupportedOperationException -> L42 java.lang.ClassNotFoundException -> L44 java.lang.IllegalAccessException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a
                java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod     // Catch: java.lang.UnsupportedOperationException -> L42 java.lang.ClassNotFoundException -> L44 java.lang.IllegalAccessException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a
                r1.setAccessible(r2)     // Catch: java.lang.UnsupportedOperationException -> L42 java.lang.ClassNotFoundException -> L44 java.lang.IllegalAccessException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a
            L31:
                android.location.LocationRequest r1 = r9.toLocationRequest(r8)     // Catch: java.lang.UnsupportedOperationException -> L42 java.lang.ClassNotFoundException -> L44 java.lang.IllegalAccessException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a
                if (r1 == 0) goto L41
                java.lang.reflect.Method r3 = androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod     // Catch: java.lang.UnsupportedOperationException -> L42 java.lang.ClassNotFoundException -> L44 java.lang.IllegalAccessException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a
                java.lang.Object[] r4 = new java.lang.Object[]{r1, r10, r11}     // Catch: java.lang.UnsupportedOperationException -> L42 java.lang.ClassNotFoundException -> L44 java.lang.IllegalAccessException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a
                r3.invoke(r7, r4)     // Catch: java.lang.UnsupportedOperationException -> L42 java.lang.ClassNotFoundException -> L44 java.lang.IllegalAccessException -> L46 java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a
                return r2
            L41:
                goto L4b
            L42:
                r1 = move-exception
                goto L4b
            L44:
                r1 = move-exception
                goto L4b
            L46:
                r1 = move-exception
                goto L4b
            L48:
                r1 = move-exception
                goto L4b
            L4a:
                r1 = move-exception
            L4b:
                return r0
        }

        static boolean tryRequestLocationUpdates(android.location.LocationManager r7, java.lang.String r8, androidx.core.location.LocationRequestCompat r9, androidx.core.location.LocationManagerCompat.LocationListenerTransport r10) {
                r0 = 0
                java.lang.Class<?> r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.UnsupportedOperationException -> L50 java.lang.ClassNotFoundException -> L52 java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L56 java.lang.NoSuchMethodException -> L58
                if (r1 != 0) goto Ld
                java.lang.String r1 = "android.location.LocationRequest"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.UnsupportedOperationException -> L50 java.lang.ClassNotFoundException -> L52 java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L56 java.lang.NoSuchMethodException -> L58
                androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass = r1     // Catch: java.lang.UnsupportedOperationException -> L50 java.lang.ClassNotFoundException -> L52 java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L56 java.lang.NoSuchMethodException -> L58
            Ld:
                java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod     // Catch: java.lang.UnsupportedOperationException -> L50 java.lang.ClassNotFoundException -> L52 java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L56 java.lang.NoSuchMethodException -> L58
                r2 = 1
                if (r1 != 0) goto L31
                java.lang.Class<android.location.LocationManager> r1 = android.location.LocationManager.class
                java.lang.String r3 = "requestLocationUpdates"
                r4 = 3
                java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.UnsupportedOperationException -> L50 java.lang.ClassNotFoundException -> L52 java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L56 java.lang.NoSuchMethodException -> L58
                java.lang.Class<?> r5 = androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.UnsupportedOperationException -> L50 java.lang.ClassNotFoundException -> L52 java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L56 java.lang.NoSuchMethodException -> L58
                r4[r0] = r5     // Catch: java.lang.UnsupportedOperationException -> L50 java.lang.ClassNotFoundException -> L52 java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L56 java.lang.NoSuchMethodException -> L58
                java.lang.Class<android.location.LocationListener> r5 = android.location.LocationListener.class
                r4[r2] = r5     // Catch: java.lang.UnsupportedOperationException -> L50 java.lang.ClassNotFoundException -> L52 java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L56 java.lang.NoSuchMethodException -> L58
                java.lang.Class<android.os.Looper> r5 = android.os.Looper.class
                r6 = 2
                r4[r6] = r5     // Catch: java.lang.UnsupportedOperationException -> L50 java.lang.ClassNotFoundException -> L52 java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L56 java.lang.NoSuchMethodException -> L58
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.UnsupportedOperationException -> L50 java.lang.ClassNotFoundException -> L52 java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L56 java.lang.NoSuchMethodException -> L58
                androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod = r1     // Catch: java.lang.UnsupportedOperationException -> L50 java.lang.ClassNotFoundException -> L52 java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L56 java.lang.NoSuchMethodException -> L58
                java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod     // Catch: java.lang.UnsupportedOperationException -> L50 java.lang.ClassNotFoundException -> L52 java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L56 java.lang.NoSuchMethodException -> L58
                r1.setAccessible(r2)     // Catch: java.lang.UnsupportedOperationException -> L50 java.lang.ClassNotFoundException -> L52 java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L56 java.lang.NoSuchMethodException -> L58
            L31:
                android.location.LocationRequest r1 = r9.toLocationRequest(r8)     // Catch: java.lang.UnsupportedOperationException -> L50 java.lang.ClassNotFoundException -> L52 java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L56 java.lang.NoSuchMethodException -> L58
                if (r1 == 0) goto L4f
                java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r3 = androidx.core.location.LocationManagerCompat.sLocationListeners     // Catch: java.lang.UnsupportedOperationException -> L50 java.lang.ClassNotFoundException -> L52 java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L56 java.lang.NoSuchMethodException -> L58
                monitor-enter(r3)     // Catch: java.lang.UnsupportedOperationException -> L50 java.lang.ClassNotFoundException -> L52 java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L56 java.lang.NoSuchMethodException -> L58
                java.lang.reflect.Method r4 = androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod     // Catch: java.lang.Throwable -> L4c
                android.os.Looper r5 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L4c
                java.lang.Object[] r5 = new java.lang.Object[]{r1, r10, r5}     // Catch: java.lang.Throwable -> L4c
                r4.invoke(r7, r5)     // Catch: java.lang.Throwable -> L4c
                androidx.core.location.LocationManagerCompat.registerLocationListenerTransport(r7, r10)     // Catch: java.lang.Throwable -> L4c
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L4c
                return r2
            L4c:
                r2 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L4c
                throw r2     // Catch: java.lang.UnsupportedOperationException -> L50 java.lang.ClassNotFoundException -> L52 java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L56 java.lang.NoSuchMethodException -> L58
            L4f:
                goto L59
            L50:
                r1 = move-exception
                goto L59
            L52:
                r1 = move-exception
                goto L59
            L54:
                r1 = move-exception
                goto L59
            L56:
                r1 = move-exception
                goto L59
            L58:
                r1 = move-exception
            L59:
                return r0
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean registerGnssMeasurementsCallback(android.location.LocationManager r1, android.location.GnssMeasurementsEvent.Callback r2) {
                boolean r0 = r1.registerGnssMeasurementsCallback(r2)
                return r0
        }

        static boolean registerGnssMeasurementsCallback(android.location.LocationManager r1, android.location.GnssMeasurementsEvent.Callback r2, android.os.Handler r3) {
                boolean r0 = r1.registerGnssMeasurementsCallback(r2, r3)
                return r0
        }

        static boolean registerGnssStatusCallback(android.location.LocationManager r5, android.os.Handler r6, java.util.concurrent.Executor r7, androidx.core.location.GnssStatusCompat.Callback r8) {
                r0 = 1
                r1 = 0
                if (r6 == 0) goto L6
                r2 = r0
                goto L7
            L6:
                r2 = r1
            L7:
                androidx.core.util.Preconditions.checkArgument(r2)
                androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r2 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners
                monitor-enter(r2)
                androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r3 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners     // Catch: java.lang.Throwable -> L33
                java.lang.Object r3 = r3.get(r8)     // Catch: java.lang.Throwable -> L33
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport r3 = (androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport) r3     // Catch: java.lang.Throwable -> L33
                if (r3 != 0) goto L1e
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport r4 = new androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport     // Catch: java.lang.Throwable -> L33
                r4.<init>(r8)     // Catch: java.lang.Throwable -> L33
                r3 = r4
                goto L21
            L1e:
                r3.unregister()     // Catch: java.lang.Throwable -> L33
            L21:
                r3.register(r7)     // Catch: java.lang.Throwable -> L33
                boolean r4 = r5.registerGnssStatusCallback(r3, r6)     // Catch: java.lang.Throwable -> L33
                if (r4 == 0) goto L31
                androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r1 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners     // Catch: java.lang.Throwable -> L33
                r1.put(r8, r3)     // Catch: java.lang.Throwable -> L33
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
                return r0
            L31:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
                return r1
            L33:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
                throw r0
        }

        static void unregisterGnssMeasurementsCallback(android.location.LocationManager r0, android.location.GnssMeasurementsEvent.Callback r1) {
                r0.unregisterGnssMeasurementsCallback(r1)
                return
        }

        static void unregisterGnssStatusCallback(android.location.LocationManager r1, java.lang.Object r2) {
                boolean r0 = r2 instanceof androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport
                if (r0 == 0) goto La
                r0 = r2
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport r0 = (androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport) r0
                r0.unregister()
            La:
                r0 = r2
                android.location.GnssStatus$Callback r0 = (android.location.GnssStatus.Callback) r0
                r1.unregisterGnssStatusCallback(r0)
                return
        }
    }

    private static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String getGnssHardwareModelName(android.location.LocationManager r1) {
                java.lang.String r0 = r1.getGnssHardwareModelName()
                return r0
        }

        static int getGnssYearOfHardware(android.location.LocationManager r1) {
                int r0 = r1.getGnssYearOfHardware()
                return r0
        }

        static boolean isLocationEnabled(android.location.LocationManager r1) {
                boolean r0 = r1.isLocationEnabled()
                return r0
        }
    }

    private static class Api30Impl {
        private static java.lang.Class<?> sLocationRequestClass;
        private static java.lang.reflect.Method sRequestLocationUpdatesExecutorMethod;

        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void getCurrentLocation(android.location.LocationManager r1, java.lang.String r2, android.os.CancellationSignal r3, java.util.concurrent.Executor r4, androidx.core.util.Consumer<android.location.Location> r5) {
                java.util.Objects.requireNonNull(r5)
                androidx.core.location.LocationManagerCompat$Api30Impl$$ExternalSyntheticLambda0 r0 = new androidx.core.location.LocationManagerCompat$Api30Impl$$ExternalSyntheticLambda0
                r0.<init>(r5)
                r1.getCurrentLocation(r2, r3, r4, r0)
                return
        }

        public static boolean registerGnssStatusCallback(android.location.LocationManager r3, android.os.Handler r4, java.util.concurrent.Executor r5, androidx.core.location.GnssStatusCompat.Callback r6) {
                androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r0 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners
                monitor-enter(r0)
                androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r1 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners     // Catch: java.lang.Throwable -> L24
                java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L24
                androidx.core.location.LocationManagerCompat$GnssStatusTransport r1 = (androidx.core.location.LocationManagerCompat.GnssStatusTransport) r1     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L13
                androidx.core.location.LocationManagerCompat$GnssStatusTransport r2 = new androidx.core.location.LocationManagerCompat$GnssStatusTransport     // Catch: java.lang.Throwable -> L24
                r2.<init>(r6)     // Catch: java.lang.Throwable -> L24
                r1 = r2
            L13:
                boolean r2 = r3.registerGnssStatusCallback(r5, r1)     // Catch: java.lang.Throwable -> L24
                if (r2 == 0) goto L21
                androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r2 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners     // Catch: java.lang.Throwable -> L24
                r2.put(r6, r1)     // Catch: java.lang.Throwable -> L24
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                r0 = 1
                return r0
            L21:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                r0 = 0
                return r0
            L24:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                throw r1
        }

        public static boolean tryRequestLocationUpdates(android.location.LocationManager r7, java.lang.String r8, androidx.core.location.LocationRequestCompat r9, java.util.concurrent.Executor r10, androidx.core.location.LocationListenerCompat r11) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                r2 = 0
                if (r0 < r1) goto L51
                java.lang.Class<?> r0 = androidx.core.location.LocationManagerCompat.Api30Impl.sLocationRequestClass     // Catch: java.lang.UnsupportedOperationException -> L48 java.lang.ClassNotFoundException -> L4a java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L4e java.lang.NoSuchMethodException -> L50
                if (r0 != 0) goto L13
                java.lang.String r0 = "android.location.LocationRequest"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.UnsupportedOperationException -> L48 java.lang.ClassNotFoundException -> L4a java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L4e java.lang.NoSuchMethodException -> L50
                androidx.core.location.LocationManagerCompat.Api30Impl.sLocationRequestClass = r0     // Catch: java.lang.UnsupportedOperationException -> L48 java.lang.ClassNotFoundException -> L4a java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L4e java.lang.NoSuchMethodException -> L50
            L13:
                java.lang.reflect.Method r0 = androidx.core.location.LocationManagerCompat.Api30Impl.sRequestLocationUpdatesExecutorMethod     // Catch: java.lang.UnsupportedOperationException -> L48 java.lang.ClassNotFoundException -> L4a java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L4e java.lang.NoSuchMethodException -> L50
                r1 = 1
                if (r0 != 0) goto L37
                java.lang.Class<android.location.LocationManager> r0 = android.location.LocationManager.class
                java.lang.String r3 = "requestLocationUpdates"
                r4 = 3
                java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.UnsupportedOperationException -> L48 java.lang.ClassNotFoundException -> L4a java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L4e java.lang.NoSuchMethodException -> L50
                java.lang.Class<?> r5 = androidx.core.location.LocationManagerCompat.Api30Impl.sLocationRequestClass     // Catch: java.lang.UnsupportedOperationException -> L48 java.lang.ClassNotFoundException -> L4a java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L4e java.lang.NoSuchMethodException -> L50
                r4[r2] = r5     // Catch: java.lang.UnsupportedOperationException -> L48 java.lang.ClassNotFoundException -> L4a java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L4e java.lang.NoSuchMethodException -> L50
                java.lang.Class<java.util.concurrent.Executor> r5 = java.util.concurrent.Executor.class
                r4[r1] = r5     // Catch: java.lang.UnsupportedOperationException -> L48 java.lang.ClassNotFoundException -> L4a java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L4e java.lang.NoSuchMethodException -> L50
                java.lang.Class<android.location.LocationListener> r5 = android.location.LocationListener.class
                r6 = 2
                r4[r6] = r5     // Catch: java.lang.UnsupportedOperationException -> L48 java.lang.ClassNotFoundException -> L4a java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L4e java.lang.NoSuchMethodException -> L50
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch: java.lang.UnsupportedOperationException -> L48 java.lang.ClassNotFoundException -> L4a java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L4e java.lang.NoSuchMethodException -> L50
                androidx.core.location.LocationManagerCompat.Api30Impl.sRequestLocationUpdatesExecutorMethod = r0     // Catch: java.lang.UnsupportedOperationException -> L48 java.lang.ClassNotFoundException -> L4a java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L4e java.lang.NoSuchMethodException -> L50
                java.lang.reflect.Method r0 = androidx.core.location.LocationManagerCompat.Api30Impl.sRequestLocationUpdatesExecutorMethod     // Catch: java.lang.UnsupportedOperationException -> L48 java.lang.ClassNotFoundException -> L4a java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L4e java.lang.NoSuchMethodException -> L50
                r0.setAccessible(r1)     // Catch: java.lang.UnsupportedOperationException -> L48 java.lang.ClassNotFoundException -> L4a java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L4e java.lang.NoSuchMethodException -> L50
            L37:
                android.location.LocationRequest r0 = r9.toLocationRequest(r8)     // Catch: java.lang.UnsupportedOperationException -> L48 java.lang.ClassNotFoundException -> L4a java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L4e java.lang.NoSuchMethodException -> L50
                if (r0 == 0) goto L47
                java.lang.reflect.Method r3 = androidx.core.location.LocationManagerCompat.Api30Impl.sRequestLocationUpdatesExecutorMethod     // Catch: java.lang.UnsupportedOperationException -> L48 java.lang.ClassNotFoundException -> L4a java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L4e java.lang.NoSuchMethodException -> L50
                java.lang.Object[] r4 = new java.lang.Object[]{r0, r10, r11}     // Catch: java.lang.UnsupportedOperationException -> L48 java.lang.ClassNotFoundException -> L4a java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L4e java.lang.NoSuchMethodException -> L50
                r3.invoke(r7, r4)     // Catch: java.lang.UnsupportedOperationException -> L48 java.lang.ClassNotFoundException -> L4a java.lang.IllegalAccessException -> L4c java.lang.reflect.InvocationTargetException -> L4e java.lang.NoSuchMethodException -> L50
                return r1
            L47:
                goto L51
            L48:
                r0 = move-exception
                goto L51
            L4a:
                r0 = move-exception
                goto L51
            L4c:
                r0 = move-exception
                goto L51
            L4e:
                r0 = move-exception
                goto L51
            L50:
                r0 = move-exception
            L51:
                return r2
        }
    }

    private static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean hasProvider(android.location.LocationManager r1, java.lang.String r2) {
                boolean r0 = r1.hasProvider(r2)
                return r0
        }

        static boolean registerGnssMeasurementsCallback(android.location.LocationManager r1, java.util.concurrent.Executor r2, android.location.GnssMeasurementsEvent.Callback r3) {
                boolean r0 = r1.registerGnssMeasurementsCallback(r2, r3)
                return r0
        }

        static void requestLocationUpdates(android.location.LocationManager r0, java.lang.String r1, android.location.LocationRequest r2, java.util.concurrent.Executor r3, android.location.LocationListener r4) {
                r0.requestLocationUpdates(r1, r2, r3, r4)
                return
        }
    }

    private static final class CancellableLocationListener implements android.location.LocationListener {
        private androidx.core.util.Consumer<android.location.Location> mConsumer;
        private final java.util.concurrent.Executor mExecutor;
        private final android.location.LocationManager mLocationManager;
        private final android.os.Handler mTimeoutHandler;
        java.lang.Runnable mTimeoutRunnable;
        private boolean mTriggered;

        CancellableLocationListener(android.location.LocationManager r3, java.util.concurrent.Executor r4, androidx.core.util.Consumer<android.location.Location> r5) {
                r2 = this;
                r2.<init>()
                r2.mLocationManager = r3
                r2.mExecutor = r4
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                r2.mTimeoutHandler = r0
                r2.mConsumer = r5
                return
        }

        private void cleanup() {
                r3 = this;
                r0 = 0
                r3.mConsumer = r0
                android.location.LocationManager r1 = r3.mLocationManager
                r1.removeUpdates(r3)
                java.lang.Runnable r1 = r3.mTimeoutRunnable
                if (r1 == 0) goto L15
                android.os.Handler r1 = r3.mTimeoutHandler
                java.lang.Runnable r2 = r3.mTimeoutRunnable
                r1.removeCallbacks(r2)
                r3.mTimeoutRunnable = r0
            L15:
                return
        }

        static /* synthetic */ void lambda$onLocationChanged$1(androidx.core.util.Consumer r0, android.location.Location r1) {
                r0.accept(r1)
                return
        }

        public void cancel() {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.mTriggered     // Catch: java.lang.Throwable -> Lf
                if (r0 == 0) goto L7
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
                return
            L7:
                r0 = 1
                r1.mTriggered = r0     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
                r1.cleanup()
                return
            Lf:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
                throw r0
        }

        /* JADX INFO: renamed from: lambda$startTimeout$0$androidx-core-location-LocationManagerCompat$CancellableLocationListener, reason: not valid java name */
        /* synthetic */ void m50x40ccd759() {
                r2 = this;
                r0 = 0
                r2.mTimeoutRunnable = r0
                r1 = r0
                android.location.Location r1 = (android.location.Location) r1
                r2.onLocationChanged(r0)
                return
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(android.location.Location r4) {
                r3 = this;
                monitor-enter(r3)
                boolean r0 = r3.mTriggered     // Catch: java.lang.Throwable -> L1b
                if (r0 == 0) goto L7
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
                return
            L7:
                r0 = 1
                r3.mTriggered = r0     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
                androidx.core.util.Consumer<android.location.Location> r0 = r3.mConsumer
                java.util.concurrent.Executor r1 = r3.mExecutor
                androidx.core.location.LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda1 r2 = new androidx.core.location.LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda1
                r2.<init>(r0, r4)
                r1.execute(r2)
                r3.cleanup()
                return
            L1b:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
                throw r0
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(java.lang.String r3) {
                r2 = this;
                r0 = 0
                r1 = r0
                android.location.Location r1 = (android.location.Location) r1
                r2.onLocationChanged(r0)
                return
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(java.lang.String r1, int r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void startTimeout(long r3) {
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.mTriggered     // Catch: java.lang.Throwable -> L17
                if (r0 == 0) goto L7
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
                return
            L7:
                androidx.core.location.LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda0 r0 = new androidx.core.location.LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L17
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L17
                r2.mTimeoutRunnable = r0     // Catch: java.lang.Throwable -> L17
                android.os.Handler r0 = r2.mTimeoutHandler     // Catch: java.lang.Throwable -> L17
                java.lang.Runnable r1 = r2.mTimeoutRunnable     // Catch: java.lang.Throwable -> L17
                r0.postDelayed(r1, r3)     // Catch: java.lang.Throwable -> L17
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
                return
            L17:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
                throw r0
        }
    }

    private static class GnssListenersHolder {
        static final androidx.collection.SimpleArrayMap<android.location.GnssMeasurementsEvent.Callback, android.location.GnssMeasurementsEvent.Callback> sGnssMeasurementListeners = null;
        static final androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> sGnssStatusListeners = null;

        static {
                androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
                r0.<init>()
                androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners = r0
                androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
                r0.<init>()
                androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners = r0
                return
        }

        private GnssListenersHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private static class GnssMeasurementsTransport extends android.location.GnssMeasurementsEvent.Callback {
        final android.location.GnssMeasurementsEvent.Callback mCallback;
        volatile java.util.concurrent.Executor mExecutor;

        GnssMeasurementsTransport(android.location.GnssMeasurementsEvent.Callback r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                r0.mCallback = r1
                r0.mExecutor = r2
                return
        }

        /* JADX INFO: renamed from: lambda$onGnssMeasurementsReceived$0$androidx-core-location-LocationManagerCompat$GnssMeasurementsTransport, reason: not valid java name */
        /* synthetic */ void m51xb1484c70(java.util.concurrent.Executor r2, android.location.GnssMeasurementsEvent r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                android.location.GnssMeasurementsEvent$Callback r0 = r1.mCallback
                r0.onGnssMeasurementsReceived(r3)
                return
        }

        /* JADX INFO: renamed from: lambda$onStatusChanged$1$androidx-core-location-LocationManagerCompat$GnssMeasurementsTransport, reason: not valid java name */
        /* synthetic */ void m52xdc872524(java.util.concurrent.Executor r2, int r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                android.location.GnssMeasurementsEvent$Callback r0 = r1.mCallback
                r0.onStatusChanged(r3)
                return
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onGnssMeasurementsReceived(android.location.GnssMeasurementsEvent r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport$$ExternalSyntheticLambda0 r1 = new androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport$$ExternalSyntheticLambda0
                r1.<init>(r2, r0, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onStatusChanged(int r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport$$ExternalSyntheticLambda1 r1 = new androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport$$ExternalSyntheticLambda1
                r1.<init>(r2, r0, r3)
                r0.execute(r1)
                return
        }

        public void unregister() {
                r1 = this;
                r0 = 0
                r1.mExecutor = r0
                return
        }
    }

    private static class GnssStatusTransport extends android.location.GnssStatus.Callback {
        final androidx.core.location.GnssStatusCompat.Callback mCallback;

        GnssStatusTransport(androidx.core.location.GnssStatusCompat.Callback r3) {
                r2 = this;
                r2.<init>()
                if (r3 == 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "invalid null callback"
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                r2.mCallback = r3
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int r2) {
                r1 = this;
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onFirstFix(r2)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(android.location.GnssStatus r3) {
                r2 = this;
                androidx.core.location.GnssStatusCompat$Callback r0 = r2.mCallback
                androidx.core.location.GnssStatusCompat r1 = androidx.core.location.GnssStatusCompat.wrap(r3)
                r0.onSatelliteStatusChanged(r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
                r1 = this;
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onStarted()
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
                r1 = this;
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onStopped()
                return
        }
    }

    private static class GpsStatusTransport implements android.location.GpsStatus.Listener {
        final androidx.core.location.GnssStatusCompat.Callback mCallback;
        volatile java.util.concurrent.Executor mExecutor;
        private final android.location.LocationManager mLocationManager;

        GpsStatusTransport(android.location.LocationManager r3, androidx.core.location.GnssStatusCompat.Callback r4) {
                r2 = this;
                r2.<init>()
                if (r4 == 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "invalid null callback"
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                r2.mLocationManager = r3
                r2.mCallback = r4
                return
        }

        /* JADX INFO: renamed from: lambda$onGpsStatusChanged$0$androidx-core-location-LocationManagerCompat$GpsStatusTransport, reason: not valid java name */
        /* synthetic */ void m53x75e92221(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onStarted()
                return
        }

        /* JADX INFO: renamed from: lambda$onGpsStatusChanged$1$androidx-core-location-LocationManagerCompat$GpsStatusTransport, reason: not valid java name */
        /* synthetic */ void m54xc3a89a22(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onStopped()
                return
        }

        /* JADX INFO: renamed from: lambda$onGpsStatusChanged$2$androidx-core-location-LocationManagerCompat$GpsStatusTransport, reason: not valid java name */
        /* synthetic */ void m55x11681223(java.util.concurrent.Executor r2, int r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onFirstFix(r3)
                return
        }

        /* JADX INFO: renamed from: lambda$onGpsStatusChanged$3$androidx-core-location-LocationManagerCompat$GpsStatusTransport, reason: not valid java name */
        /* synthetic */ void m56x5f278a24(java.util.concurrent.Executor r2, androidx.core.location.GnssStatusCompat r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onSatelliteStatusChanged(r3)
                return
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int r5) {
                r4 = this;
                java.util.concurrent.Executor r0 = r4.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                r1 = 0
                switch(r5) {
                    case 1: goto L3d;
                    case 2: goto L34;
                    case 3: goto L1f;
                    case 4: goto La;
                    default: goto L9;
                }
            L9:
                goto L46
            La:
                android.location.LocationManager r2 = r4.mLocationManager
                android.location.GpsStatus r1 = r2.getGpsStatus(r1)
                if (r1 == 0) goto L46
                androidx.core.location.GnssStatusCompat r2 = androidx.core.location.GnssStatusCompat.wrap(r1)
                androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda3 r3 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda3
                r3.<init>(r4, r0, r2)
                r0.execute(r3)
                goto L46
            L1f:
                android.location.LocationManager r2 = r4.mLocationManager
                android.location.GpsStatus r1 = r2.getGpsStatus(r1)
                if (r1 == 0) goto L46
                int r2 = r1.getTimeToFirstFix()
                androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2 r3 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2
                r3.<init>(r4, r0, r2)
                r0.execute(r3)
                goto L46
            L34:
                androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda1 r1 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda1
                r1.<init>(r4, r0)
                r0.execute(r1)
                goto L46
            L3d:
                androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda0 r1 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda0
                r1.<init>(r4, r0)
                r0.execute(r1)
            L46:
                return
        }

        public void register(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                androidx.core.util.Preconditions.checkState(r0)
                r1.mExecutor = r2
                return
        }

        public void unregister() {
                r1 = this;
                r0 = 0
                r1.mExecutor = r0
                return
        }
    }

    private static final class InlineHandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler;

        InlineHandlerExecutor(android.os.Handler r2) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r2)
                android.os.Handler r0 = (android.os.Handler) r0
                r1.mHandler = r0
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r4) {
                r3 = this;
                android.os.Looper r0 = android.os.Looper.myLooper()
                android.os.Handler r1 = r3.mHandler
                android.os.Looper r1 = r1.getLooper()
                if (r0 != r1) goto L10
                r4.run()
                goto L1e
            L10:
                android.os.Handler r0 = r3.mHandler
                java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r4)
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                boolean r0 = r0.post(r1)
                if (r0 == 0) goto L1f
            L1e:
                return
            L1f:
                java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                android.os.Handler r2 = r3.mHandler
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " is shutting down"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    private static class LocationListenerKey {
        final androidx.core.location.LocationListenerCompat mListener;
        final java.lang.String mProvider;

        LocationListenerKey(java.lang.String r2, androidx.core.location.LocationListenerCompat r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "invalid null provider"
                java.lang.Object r0 = androidx.core.util.ObjectsCompat.requireNonNull(r2, r0)
                java.lang.String r0 = (java.lang.String) r0
                r1.mProvider = r0
                java.lang.String r0 = "invalid null listener"
                java.lang.Object r0 = androidx.core.util.ObjectsCompat.requireNonNull(r3, r0)
                androidx.core.location.LocationListenerCompat r0 = (androidx.core.location.LocationListenerCompat) r0
                r1.mListener = r0
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof androidx.core.location.LocationManagerCompat.LocationListenerKey
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                r0 = r5
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = (androidx.core.location.LocationManagerCompat.LocationListenerKey) r0
                java.lang.String r2 = r4.mProvider
                java.lang.String r3 = r0.mProvider
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L1e
                androidx.core.location.LocationListenerCompat r2 = r4.mListener
                androidx.core.location.LocationListenerCompat r3 = r0.mListener
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L1e
                r1 = 1
            L1e:
                return r1
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.mProvider
                androidx.core.location.LocationListenerCompat r1 = r2.mListener
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                int r0 = androidx.core.util.ObjectsCompat.hash(r0)
                return r0
        }
    }

    private static class LocationListenerTransport implements android.location.LocationListener {
        final java.util.concurrent.Executor mExecutor;
        volatile androidx.core.location.LocationManagerCompat.LocationListenerKey mKey;

        LocationListenerTransport(androidx.core.location.LocationManagerCompat.LocationListenerKey r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                r0.mKey = r1
                r0.mExecutor = r2
                return
        }

        public androidx.core.location.LocationManagerCompat.LocationListenerKey getKey() {
                r1 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r1.mKey
                java.lang.Object r0 = androidx.core.util.ObjectsCompat.requireNonNull(r0)
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = (androidx.core.location.LocationManagerCompat.LocationListenerKey) r0
                return r0
        }

        /* JADX INFO: renamed from: lambda$onFlushComplete$2$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m57xf04cfe9d(int r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r1 = r0.mListener
                r1.onFlushComplete(r3)
                return
        }

        /* JADX INFO: renamed from: lambda$onLocationChanged$0$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m58xa8d50b3d(android.location.Location r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r1 = r0.mListener
                r1.onLocationChanged(r3)
                return
        }

        /* JADX INFO: renamed from: lambda$onLocationChanged$1$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m59x2b1fc01c(java.util.List r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r1 = r0.mListener
                r1.onLocationChanged(r3)
                return
        }

        /* JADX INFO: renamed from: lambda$onProviderDisabled$5$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m60x442abc92(java.lang.String r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r1 = r0.mListener
                r1.onProviderDisabled(r3)
                return
        }

        /* JADX INFO: renamed from: lambda$onProviderEnabled$4$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m61x5a2a7b08(java.lang.String r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r1 = r0.mListener
                r1.onProviderEnabled(r3)
                return
        }

        /* JADX INFO: renamed from: lambda$onStatusChanged$3$androidx-core-location-LocationManagerCompat$LocationListenerTransport, reason: not valid java name */
        /* synthetic */ void m62xdbe6a717(java.lang.String r3, int r4, android.os.Bundle r5) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r1 = r0.mListener
                r1.onStatusChanged(r3, r4, r5)
                return
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(int r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda4 r1 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda4
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(android.location.Location r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda3 r1 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda3
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(java.util.List<android.location.Location> r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda2 r1 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda2
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(java.lang.String r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda1 r1 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda1
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(java.lang.String r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda0 r1 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda0
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(java.lang.String r3, int r4, android.os.Bundle r5) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda5 r1 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda5
                r1.<init>(r2, r3, r4, r5)
                r0.execute(r1)
                return
        }

        public void unregister() {
                r1 = this;
                r0 = 0
                r1.mKey = r0
                return
        }
    }

    private static class PreRGnssStatusTransport extends android.location.GnssStatus.Callback {
        final androidx.core.location.GnssStatusCompat.Callback mCallback;
        volatile java.util.concurrent.Executor mExecutor;

        PreRGnssStatusTransport(androidx.core.location.GnssStatusCompat.Callback r3) {
                r2 = this;
                r2.<init>()
                if (r3 == 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "invalid null callback"
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                r2.mCallback = r3
                return
        }

        /* JADX INFO: renamed from: lambda$onFirstFix$2$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport, reason: not valid java name */
        /* synthetic */ void m63x4191f1e(java.util.concurrent.Executor r2, int r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onFirstFix(r3)
                return
        }

        /* JADX INFO: renamed from: lambda$onSatelliteStatusChanged$3$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport, reason: not valid java name */
        /* synthetic */ void m64xdecf6cdb(java.util.concurrent.Executor r3, android.location.GnssStatus r4) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 == r3) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r0 = r2.mCallback
                androidx.core.location.GnssStatusCompat r1 = androidx.core.location.GnssStatusCompat.wrap(r4)
                r0.onSatelliteStatusChanged(r1)
                return
        }

        /* JADX INFO: renamed from: lambda$onStarted$0$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport, reason: not valid java name */
        /* synthetic */ void m65x7ba12b9c(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onStarted()
                return
        }

        /* JADX INFO: renamed from: lambda$onStopped$1$androidx-core-location-LocationManagerCompat$PreRGnssStatusTransport, reason: not valid java name */
        /* synthetic */ void m66x80a5cd6f(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onStopped()
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda0 r1 = new androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda0
                r1.<init>(r2, r0, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(android.location.GnssStatus r3) {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda1 r1 = new androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda1
                r1.<init>(r2, r0, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda3 r1 = new androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda3
                r1.<init>(r2, r0)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
                r2 = this;
                java.util.concurrent.Executor r0 = r2.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda2 r1 = new androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda2
                r1.<init>(r2, r0)
                r0.execute(r1)
                return
        }

        public void register(java.util.concurrent.Executor r5) {
                r4 = this;
                r0 = 1
                r1 = 0
                if (r5 == 0) goto L6
                r2 = r0
                goto L7
            L6:
                r2 = r1
            L7:
                java.lang.String r3 = "invalid null executor"
                androidx.core.util.Preconditions.checkArgument(r2, r3)
                java.util.concurrent.Executor r2 = r4.mExecutor
                if (r2 != 0) goto L11
                goto L12
            L11:
                r0 = r1
            L12:
                androidx.core.util.Preconditions.checkState(r0)
                r4.mExecutor = r5
                return
        }

        public void unregister() {
                r1 = this;
                r0 = 0
                r1.mExecutor = r0
                return
        }
    }

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            androidx.core.location.LocationManagerCompat.sLocationListeners = r0
            return
    }

    private LocationManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void getCurrentLocation(android.location.LocationManager r9, java.lang.String r10, android.os.CancellationSignal r11, java.util.concurrent.Executor r12, androidx.core.util.Consumer<android.location.Location> r13) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            androidx.core.location.LocationManagerCompat.Api30Impl.getCurrentLocation(r9, r10, r11, r12, r13)
            return
        La:
            if (r11 == 0) goto Lf
            r11.throwIfCanceled()
        Lf:
            android.location.Location r0 = r9.getLastKnownLocation(r10)
            if (r0 == 0) goto L2d
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = androidx.core.location.LocationCompat.getElapsedRealtimeMillis(r0)
            long r1 = r1 - r3
            r3 = 10000(0x2710, double:4.9407E-320)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L2d
            androidx.core.location.LocationManagerCompat$$ExternalSyntheticLambda0 r3 = new androidx.core.location.LocationManagerCompat$$ExternalSyntheticLambda0
            r3.<init>(r13, r0)
            r12.execute(r3)
            return
        L2d:
            androidx.core.location.LocationManagerCompat$CancellableLocationListener r1 = new androidx.core.location.LocationManagerCompat$CancellableLocationListener
            r1.<init>(r9, r12, r13)
            r7 = r1
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            r4 = 0
            r6 = 0
            r2 = r9
            r3 = r10
            r2.requestLocationUpdates(r3, r4, r6, r7, r8)
            if (r11 == 0) goto L4d
            java.util.Objects.requireNonNull(r7)
            androidx.core.location.LocationManagerCompat$$ExternalSyntheticLambda1 r9 = new androidx.core.location.LocationManagerCompat$$ExternalSyntheticLambda1
            r9.<init>(r7)
            r11.setOnCancelListener(r9)
        L4d:
            r9 = 30000(0x7530, double:1.4822E-319)
            r7.startTimeout(r9)
            return
    }

    @java.lang.Deprecated
    public static void getCurrentLocation(android.location.LocationManager r1, java.lang.String r2, androidx.core.os.CancellationSignal r3, java.util.concurrent.Executor r4, androidx.core.util.Consumer<android.location.Location> r5) {
            if (r3 == 0) goto L9
            java.lang.Object r0 = r3.getCancellationSignalObject()
            android.os.CancellationSignal r0 = (android.os.CancellationSignal) r0
            goto La
        L9:
            r0 = 0
        La:
            getCurrentLocation(r1, r2, r0, r4, r5)
            return
    }

    public static java.lang.String getGnssHardwareModelName(android.location.LocationManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.lang.String r0 = androidx.core.location.LocationManagerCompat.Api28Impl.getGnssHardwareModelName(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static int getGnssYearOfHardware(android.location.LocationManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r0 = androidx.core.location.LocationManagerCompat.Api28Impl.getGnssYearOfHardware(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static boolean hasProvider(android.location.LocationManager r3, java.lang.String r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.location.LocationManagerCompat.Api31Impl.hasProvider(r3, r4)
            return r0
        Lb:
            java.util.List r0 = r3.getAllProviders()
            boolean r0 = r0.contains(r4)
            r1 = 1
            if (r0 == 0) goto L17
            return r1
        L17:
            r0 = 0
            android.location.LocationProvider r2 = r3.getProvider(r4)     // Catch: java.lang.SecurityException -> L21
            if (r2 == 0) goto L1f
            goto L20
        L1f:
            r1 = r0
        L20:
            return r1
        L21:
            r1 = move-exception
            return r0
    }

    public static boolean isLocationEnabled(android.location.LocationManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.location.LocationManagerCompat.Api28Impl.isLocationEnabled(r2)
            return r0
        Lb:
            java.lang.String r0 = "network"
            boolean r0 = r2.isProviderEnabled(r0)
            if (r0 != 0) goto L1f
            java.lang.String r0 = "gps"
            boolean r0 = r2.isProviderEnabled(r0)
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = 0
            goto L20
        L1f:
            r0 = 1
        L20:
            return r0
    }

    static /* synthetic */ void lambda$getCurrentLocation$0(androidx.core.util.Consumer r0, android.location.Location r1) {
            r0.accept(r1)
            return
    }

    static /* synthetic */ java.lang.Boolean lambda$registerGnssStatusCallback$1(android.location.LocationManager r1, androidx.core.location.LocationManagerCompat.GpsStatusTransport r2) throws java.lang.Exception {
            boolean r0 = r1.addGpsStatusListener(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    public static boolean registerGnssMeasurementsCallback(android.location.LocationManager r2, android.location.GnssMeasurementsEvent.Callback r3, android.os.Handler r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 <= r1) goto Lb
            boolean r0 = androidx.core.location.LocationManagerCompat.Api24Impl.registerGnssMeasurementsCallback(r2, r3, r4)
            return r0
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 != r1) goto L19
        L10:
            java.util.concurrent.Executor r0 = androidx.core.os.ExecutorCompat.create(r4)
            boolean r0 = registerGnssMeasurementsCallbackOnR(r2, r0, r3)
            return r0
        L19:
            androidx.collection.SimpleArrayMap<android.location.GnssMeasurementsEvent$Callback, android.location.GnssMeasurementsEvent$Callback> r0 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners
            monitor-enter(r0)
            unregisterGnssMeasurementsCallback(r2, r3)     // Catch: java.lang.Throwable -> L30
            boolean r1 = androidx.core.location.LocationManagerCompat.Api24Impl.registerGnssMeasurementsCallback(r2, r3, r4)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L2d
            androidx.collection.SimpleArrayMap<android.location.GnssMeasurementsEvent$Callback, android.location.GnssMeasurementsEvent$Callback> r1 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners     // Catch: java.lang.Throwable -> L30
            r1.put(r3, r3)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            r0 = 1
            return r0
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            r0 = 0
            return r0
        L30:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r1
    }

    public static boolean registerGnssMeasurementsCallback(android.location.LocationManager r3, java.util.concurrent.Executor r4, android.location.GnssMeasurementsEvent.Callback r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 <= r1) goto Lb
            boolean r0 = androidx.core.location.LocationManagerCompat.Api31Impl.registerGnssMeasurementsCallback(r3, r4, r5)
            return r0
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 != r1) goto L14
            boolean r0 = registerGnssMeasurementsCallbackOnR(r3, r4, r5)
            return r0
        L14:
            androidx.collection.SimpleArrayMap<android.location.GnssMeasurementsEvent$Callback, android.location.GnssMeasurementsEvent$Callback> r0 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners
            monitor-enter(r0)
            androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport r1 = new androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport     // Catch: java.lang.Throwable -> L30
            r1.<init>(r5, r4)     // Catch: java.lang.Throwable -> L30
            unregisterGnssMeasurementsCallback(r3, r5)     // Catch: java.lang.Throwable -> L30
            boolean r2 = androidx.core.location.LocationManagerCompat.Api24Impl.registerGnssMeasurementsCallback(r3, r1)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L2d
            androidx.collection.SimpleArrayMap<android.location.GnssMeasurementsEvent$Callback, android.location.GnssMeasurementsEvent$Callback> r2 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners     // Catch: java.lang.Throwable -> L30
            r2.put(r5, r1)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            r0 = 1
            return r0
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            r0 = 0
            return r0
        L30:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r1
    }

    private static boolean registerGnssMeasurementsCallbackOnR(android.location.LocationManager r7, java.util.concurrent.Executor r8, android.location.GnssMeasurementsEvent.Callback r9) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 != r1) goto L87
            r0 = 0
            java.lang.Class<?> r1 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderClass     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            if (r1 != 0) goto L13
            java.lang.String r1 = "android.location.GnssRequest$Builder"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            androidx.core.location.LocationManagerCompat.sGnssRequestBuilderClass = r1     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
        L13:
            java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderBuildMethod     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            r2 = 1
            if (r1 != 0) goto L29
            java.lang.Class<?> r1 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderClass     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            java.lang.String r3 = "build"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            androidx.core.location.LocationManagerCompat.sGnssRequestBuilderBuildMethod = r1     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderBuildMethod     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            r1.setAccessible(r2)     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
        L29:
            java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.sRegisterGnssMeasurementsCallbackMethod     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            if (r1 != 0) goto L50
            java.lang.Class<android.location.LocationManager> r1 = android.location.LocationManager.class
            java.lang.String r3 = "registerGnssMeasurementsCallback"
            r4 = 3
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            java.lang.String r5 = "android.location.GnssRequest"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            r4[r0] = r5     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            java.lang.Class<java.util.concurrent.Executor> r5 = java.util.concurrent.Executor.class
            r4[r2] = r5     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            java.lang.Class<android.location.GnssMeasurementsEvent$Callback> r5 = android.location.GnssMeasurementsEvent.Callback.class
            r6 = 2
            r4[r6] = r5     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            androidx.core.location.LocationManagerCompat.sRegisterGnssMeasurementsCallbackMethod = r1     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.sRegisterGnssMeasurementsCallbackMethod     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            r1.setAccessible(r2)     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
        L50:
            java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.sRegisterGnssMeasurementsCallbackMethod     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            java.lang.reflect.Method r3 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderBuildMethod     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            java.lang.Class<?> r4 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderClass     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r5)     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            java.lang.Object r4 = r4.newInstance(r5)     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r8, r9}     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            java.lang.Object r1 = r1.invoke(r7, r3)     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            if (r1 == 0) goto L7c
            r3 = r1
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            boolean r3 = r3.booleanValue()     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81 java.lang.reflect.InvocationTargetException -> L83 java.lang.ClassNotFoundException -> L85
            if (r3 == 0) goto L7c
            r0 = r2
        L7c:
            return r0
        L7d:
            r1 = move-exception
            goto L86
        L7f:
            r1 = move-exception
            goto L86
        L81:
            r1 = move-exception
            goto L86
        L83:
            r1 = move-exception
            goto L86
        L85:
            r1 = move-exception
        L86:
            return r0
        L87:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    private static boolean registerGnssStatusCallback(android.location.LocationManager r2, android.os.Handler r3, java.util.concurrent.Executor r4, androidx.core.location.GnssStatusCompat.Callback r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.location.LocationManagerCompat.Api30Impl.registerGnssStatusCallback(r2, r3, r4, r5)
            return r0
        Lb:
            boolean r0 = androidx.core.location.LocationManagerCompat.Api24Impl.registerGnssStatusCallback(r2, r3, r4, r5)
            return r0
    }

    public static boolean registerGnssStatusCallback(android.location.LocationManager r2, androidx.core.location.GnssStatusCompat.Callback r3, android.os.Handler r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lf
            java.util.concurrent.Executor r0 = androidx.core.os.ExecutorCompat.create(r4)
            boolean r0 = registerGnssStatusCallback(r2, r0, r3)
            return r0
        Lf:
            androidx.core.location.LocationManagerCompat$InlineHandlerExecutor r0 = new androidx.core.location.LocationManagerCompat$InlineHandlerExecutor
            r0.<init>(r4)
            boolean r0 = registerGnssStatusCallback(r2, r0, r3)
            return r0
    }

    public static boolean registerGnssStatusCallback(android.location.LocationManager r2, java.util.concurrent.Executor r3, androidx.core.location.GnssStatusCompat.Callback r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lc
            r0 = 0
            boolean r0 = registerGnssStatusCallback(r2, r0, r3, r4)
            return r0
        Lc:
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L16
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L16:
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            boolean r1 = registerGnssStatusCallback(r2, r1, r3, r4)
            return r1
    }

    static void registerLocationListenerTransport(android.location.LocationManager r3, androidx.core.location.LocationManagerCompat.LocationListenerTransport r4) {
            java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r0 = androidx.core.location.LocationManagerCompat.sLocationListeners
            androidx.core.location.LocationManagerCompat$LocationListenerKey r1 = r4.getKey()
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r4)
            java.lang.Object r0 = r0.put(r1, r2)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto L1a
            java.lang.Object r1 = r0.get()
            androidx.core.location.LocationManagerCompat$LocationListenerTransport r1 = (androidx.core.location.LocationManagerCompat.LocationListenerTransport) r1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            if (r1 == 0) goto L23
            r1.unregister()
            r3.removeUpdates(r1)
        L23:
            return
    }

    public static void removeUpdates(android.location.LocationManager r7, androidx.core.location.LocationListenerCompat r8) {
            java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r0 = androidx.core.location.LocationManagerCompat.sLocationListeners
            monitor-enter(r0)
            r1 = 0
            java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r2 = androidx.core.location.LocationManagerCompat.sLocationListeners     // Catch: java.lang.Throwable -> L5b
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L5b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L5b
        Le:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L5b
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> L5b
            androidx.core.location.LocationManagerCompat$LocationListenerTransport r4 = (androidx.core.location.LocationManagerCompat.LocationListenerTransport) r4     // Catch: java.lang.Throwable -> L5b
            if (r4 != 0) goto L23
            goto Le
        L23:
            androidx.core.location.LocationManagerCompat$LocationListenerKey r5 = r4.getKey()     // Catch: java.lang.Throwable -> L5b
            androidx.core.location.LocationListenerCompat r6 = r5.mListener     // Catch: java.lang.Throwable -> L5b
            if (r6 != r8) goto L3c
            if (r1 != 0) goto L33
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5b
            r6.<init>()     // Catch: java.lang.Throwable -> L5b
            r1 = r6
        L33:
            r1.add(r5)     // Catch: java.lang.Throwable -> L5b
            r4.unregister()     // Catch: java.lang.Throwable -> L5b
            r7.removeUpdates(r4)     // Catch: java.lang.Throwable -> L5b
        L3c:
            goto Le
        L3d:
            if (r1 == 0) goto L56
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L5b
        L43:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L56
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L5b
            androidx.core.location.LocationManagerCompat$LocationListenerKey r3 = (androidx.core.location.LocationManagerCompat.LocationListenerKey) r3     // Catch: java.lang.Throwable -> L5b
            java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r4 = androidx.core.location.LocationManagerCompat.sLocationListeners     // Catch: java.lang.Throwable -> L5b
            r4.remove(r3)     // Catch: java.lang.Throwable -> L5b
            goto L43
        L56:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            r7.removeUpdates(r8)
            return
        L5b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r1
    }

    public static void requestLocationUpdates(android.location.LocationManager r8, java.lang.String r9, androidx.core.location.LocationRequestCompat r10, androidx.core.location.LocationListenerCompat r11, android.os.Looper r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L18
        L7:
            android.location.LocationRequest r0 = r10.toLocationRequest()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r12)
            java.util.concurrent.Executor r1 = androidx.core.os.ExecutorCompat.create(r1)
            androidx.core.location.LocationManagerCompat.Api31Impl.requestLocationUpdates(r8, r9, r0, r1, r11)
            return
        L18:
            boolean r0 = androidx.core.location.LocationManagerCompat.Api19Impl.tryRequestLocationUpdates(r8, r9, r10, r11, r12)
            if (r0 == 0) goto L1f
            return
        L1f:
            long r3 = r10.getIntervalMillis()
            float r5 = r10.getMinUpdateDistanceMeters()
            r1 = r8
            r2 = r9
            r6 = r11
            r7 = r12
            r1.requestLocationUpdates(r2, r3, r5, r6, r7)
            return
    }

    public static void requestLocationUpdates(android.location.LocationManager r9, java.lang.String r10, androidx.core.location.LocationRequestCompat r11, java.util.concurrent.Executor r12, androidx.core.location.LocationListenerCompat r13) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lf
        L7:
            android.location.LocationRequest r0 = r11.toLocationRequest()
            androidx.core.location.LocationManagerCompat.Api31Impl.requestLocationUpdates(r9, r10, r0, r12, r13)
            return
        Lf:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1c
            boolean r0 = androidx.core.location.LocationManagerCompat.Api30Impl.tryRequestLocationUpdates(r9, r10, r11, r12, r13)
            if (r0 == 0) goto L1c
            return
        L1c:
            androidx.core.location.LocationManagerCompat$LocationListenerTransport r0 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport
            androidx.core.location.LocationManagerCompat$LocationListenerKey r1 = new androidx.core.location.LocationManagerCompat$LocationListenerKey
            r1.<init>(r10, r13)
            r0.<init>(r1, r12)
            r7 = r0
            boolean r0 = androidx.core.location.LocationManagerCompat.Api19Impl.tryRequestLocationUpdates(r9, r10, r11, r7)
            if (r0 == 0) goto L2e
            return
        L2e:
            java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r1 = androidx.core.location.LocationManagerCompat.sLocationListeners
            monitor-enter(r1)
            long r4 = r11.getIntervalMillis()     // Catch: java.lang.Throwable -> L47
            float r6 = r11.getMinUpdateDistanceMeters()     // Catch: java.lang.Throwable -> L47
            android.os.Looper r8 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L47
            r2 = r9
            r3 = r10
            r2.requestLocationUpdates(r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L4d
            registerLocationListenerTransport(r2, r7)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4d
            return
        L47:
            r0 = move-exception
            r2 = r9
            r3 = r10
            r9 = r0
        L4b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4d
            throw r9
        L4d:
            r0 = move-exception
            r9 = r0
            goto L4b
    }

    public static void unregisterGnssMeasurementsCallback(android.location.LocationManager r3, android.location.GnssMeasurementsEvent.Callback r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            androidx.core.location.LocationManagerCompat.Api24Impl.unregisterGnssMeasurementsCallback(r3, r4)
            goto L25
        La:
            androidx.collection.SimpleArrayMap<android.location.GnssMeasurementsEvent$Callback, android.location.GnssMeasurementsEvent$Callback> r0 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners
            monitor-enter(r0)
            androidx.collection.SimpleArrayMap<android.location.GnssMeasurementsEvent$Callback, android.location.GnssMeasurementsEvent$Callback> r1 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssMeasurementListeners     // Catch: java.lang.Throwable -> L26
            java.lang.Object r1 = r1.remove(r4)     // Catch: java.lang.Throwable -> L26
            android.location.GnssMeasurementsEvent$Callback r1 = (android.location.GnssMeasurementsEvent.Callback) r1     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L24
            boolean r2 = r1 instanceof androidx.core.location.LocationManagerCompat.GnssMeasurementsTransport     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L21
            r2 = r1
            androidx.core.location.LocationManagerCompat$GnssMeasurementsTransport r2 = (androidx.core.location.LocationManagerCompat.GnssMeasurementsTransport) r2     // Catch: java.lang.Throwable -> L26
            r2.unregister()     // Catch: java.lang.Throwable -> L26
        L21:
            androidx.core.location.LocationManagerCompat.Api24Impl.unregisterGnssMeasurementsCallback(r3, r1)     // Catch: java.lang.Throwable -> L26
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
        L25:
            return
        L26:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r1
    }

    public static void unregisterGnssStatusCallback(android.location.LocationManager r2, androidx.core.location.GnssStatusCompat.Callback r3) {
            androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r0 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners
            monitor-enter(r0)
            androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r1 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners     // Catch: java.lang.Throwable -> L11
            java.lang.Object r1 = r1.remove(r3)     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto Lf
            androidx.core.location.LocationManagerCompat.Api24Impl.unregisterGnssStatusCallback(r2, r1)     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }
}
