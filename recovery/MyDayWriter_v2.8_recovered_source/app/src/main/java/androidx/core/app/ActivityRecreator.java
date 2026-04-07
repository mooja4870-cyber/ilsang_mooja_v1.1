package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
final class ActivityRecreator {
    private static final java.lang.String LOG_TAG = "ActivityRecreator";
    protected static final java.lang.Class<?> activityThreadClass = null;
    private static final android.os.Handler mainHandler = null;
    protected static final java.lang.reflect.Field mainThreadField = null;
    protected static final java.lang.reflect.Method performStopActivity2ParamsMethod = null;
    protected static final java.lang.reflect.Method performStopActivity3ParamsMethod = null;
    protected static final java.lang.reflect.Method requestRelaunchActivityMethod = null;
    protected static final java.lang.reflect.Field tokenField = null;




    private static final class LifecycleCheckCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
        java.lang.Object currentlyRecreatingToken;
        private android.app.Activity mActivity;
        private boolean mDestroyed;
        private final int mRecreatingHashCode;
        private boolean mStarted;
        private boolean mStopQueued;

        LifecycleCheckCallbacks(android.app.Activity r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mStarted = r0
                r1.mDestroyed = r0
                r1.mStopQueued = r0
                r1.mActivity = r2
                android.app.Activity r0 = r1.mActivity
                int r0 = r0.hashCode()
                r1.mRecreatingHashCode = r0
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity r2) {
                r1 = this;
                android.app.Activity r0 = r1.mActivity
                if (r0 != r2) goto La
                r0 = 0
                r1.mActivity = r0
                r0 = 1
                r1.mDestroyed = r0
            La:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity r3) {
                r2 = this;
                boolean r0 = r2.mDestroyed
                if (r0 == 0) goto L1c
                boolean r0 = r2.mStopQueued
                if (r0 != 0) goto L1c
                boolean r0 = r2.mStarted
                if (r0 != 0) goto L1c
                java.lang.Object r0 = r2.currentlyRecreatingToken
                int r1 = r2.mRecreatingHashCode
                boolean r0 = androidx.core.app.ActivityRecreator.queueOnStopIfNecessary(r0, r1, r3)
                if (r0 == 0) goto L1c
                r0 = 1
                r2.mStopQueued = r0
                r0 = 0
                r2.currentlyRecreatingToken = r0
            L1c:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity r2) {
                r1 = this;
                android.app.Activity r0 = r1.mActivity
                if (r0 != r2) goto L7
                r0 = 1
                r1.mStarted = r0
            L7:
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity r1) {
                r0 = this;
                return
        }
    }

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            androidx.core.app.ActivityRecreator.mainHandler = r0
            java.lang.Class r0 = getActivityThreadClass()
            androidx.core.app.ActivityRecreator.activityThreadClass = r0
            java.lang.reflect.Field r0 = getMainThreadField()
            androidx.core.app.ActivityRecreator.mainThreadField = r0
            java.lang.reflect.Field r0 = getTokenField()
            androidx.core.app.ActivityRecreator.tokenField = r0
            java.lang.Class<?> r0 = androidx.core.app.ActivityRecreator.activityThreadClass
            java.lang.reflect.Method r0 = getPerformStopActivity3Params(r0)
            androidx.core.app.ActivityRecreator.performStopActivity3ParamsMethod = r0
            java.lang.Class<?> r0 = androidx.core.app.ActivityRecreator.activityThreadClass
            java.lang.reflect.Method r0 = getPerformStopActivity2Params(r0)
            androidx.core.app.ActivityRecreator.performStopActivity2ParamsMethod = r0
            java.lang.Class<?> r0 = androidx.core.app.ActivityRecreator.activityThreadClass
            java.lang.reflect.Method r0 = getRequestRelaunchActivityMethod(r0)
            androidx.core.app.ActivityRecreator.requestRelaunchActivityMethod = r0
            return
    }

    private ActivityRecreator() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.Class<?> getActivityThreadClass() {
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = move-exception
            r1 = 0
            return r1
    }

    private static java.lang.reflect.Field getMainThreadField() {
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.String r1 = "mMainThread"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> Ld
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            r0 = move-exception
            r1 = 0
            return r1
    }

    private static java.lang.reflect.Method getPerformStopActivity2Params(java.lang.Class<?> r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "performStopActivity"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1b
            java.lang.Class<android.os.IBinder> r3 = android.os.IBinder.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L1b
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L1b
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.Throwable -> L1b
            java.lang.reflect.Method r1 = r5.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L1b
            r1.setAccessible(r4)     // Catch: java.lang.Throwable -> L1b
            return r1
        L1b:
            r1 = move-exception
            return r0
    }

    private static java.lang.reflect.Method getPerformStopActivity3Params(java.lang.Class<?> r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "performStopActivity"
            r2 = 3
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L20
            java.lang.Class<android.os.IBinder> r3 = android.os.IBinder.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L20
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.Throwable -> L20
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r5 = 2
            r2[r5] = r3     // Catch: java.lang.Throwable -> L20
            java.lang.reflect.Method r1 = r6.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L20
            r1.setAccessible(r4)     // Catch: java.lang.Throwable -> L20
            return r1
        L20:
            r1 = move-exception
            return r0
    }

    private static java.lang.reflect.Method getRequestRelaunchActivityMethod(java.lang.Class<?> r6) {
            boolean r0 = needsRelaunchCall()
            r1 = 0
            if (r0 == 0) goto L48
            if (r6 != 0) goto La
            goto L48
        La:
            java.lang.String r0 = "requestRelaunchActivity"
            r2 = 9
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L46
            java.lang.Class<android.os.IBinder> r3 = android.os.IBinder.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r5 = 2
            r2[r5] = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L46
            r5 = 3
            r2[r5] = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L46
            r5 = 4
            r2[r5] = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Class<android.content.res.Configuration> r3 = android.content.res.Configuration.class
            r5 = 5
            r2[r5] = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Class<android.content.res.Configuration> r3 = android.content.res.Configuration.class
            r5 = 6
            r2[r5] = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L46
            r5 = 7
            r2[r5] = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L46
            r5 = 8
            r2[r5] = r3     // Catch: java.lang.Throwable -> L46
            java.lang.reflect.Method r0 = r6.getDeclaredMethod(r0, r2)     // Catch: java.lang.Throwable -> L46
            r0.setAccessible(r4)     // Catch: java.lang.Throwable -> L46
            return r0
        L46:
            r0 = move-exception
            return r1
        L48:
            return r1
    }

    private static java.lang.reflect.Field getTokenField() {
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.String r1 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Throwable -> Ld
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            r0 = move-exception
            r1 = 0
            return r1
    }

    private static boolean needsRelaunchCall() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 == r1) goto Lf
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 != r1) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    protected static boolean queueOnStopIfNecessary(java.lang.Object r5, int r6, android.app.Activity r7) {
            r0 = 0
            java.lang.reflect.Field r1 = androidx.core.app.ActivityRecreator.tokenField     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> L23
            if (r1 != r5) goto L22
            int r2 = r7.hashCode()     // Catch: java.lang.Throwable -> L23
            if (r2 == r6) goto L10
            goto L22
        L10:
            java.lang.reflect.Field r2 = androidx.core.app.ActivityRecreator.mainThreadField     // Catch: java.lang.Throwable -> L23
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L23
            android.os.Handler r3 = androidx.core.app.ActivityRecreator.mainHandler     // Catch: java.lang.Throwable -> L23
            androidx.core.app.ActivityRecreator$3 r4 = new androidx.core.app.ActivityRecreator$3     // Catch: java.lang.Throwable -> L23
            r4.<init>(r2, r1)     // Catch: java.lang.Throwable -> L23
            r3.postAtFrontOfQueue(r4)     // Catch: java.lang.Throwable -> L23
            r0 = 1
            return r0
        L22:
            return r0
        L23:
            r1 = move-exception
            java.lang.String r2 = "ActivityRecreator"
            java.lang.String r3 = "Exception while fetching field values"
            android.util.Log.e(r2, r3, r1)
            return r0
    }

    static boolean recreate(android.app.Activity r15) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 1
            if (r0 < r1) goto Lb
            r15.recreate()
            return r2
        Lb:
            boolean r0 = needsRelaunchCall()
            r1 = 0
            if (r0 == 0) goto L17
            java.lang.reflect.Method r0 = androidx.core.app.ActivityRecreator.requestRelaunchActivityMethod
            if (r0 != 0) goto L17
            return r1
        L17:
            java.lang.reflect.Method r0 = androidx.core.app.ActivityRecreator.performStopActivity2ParamsMethod
            if (r0 != 0) goto L20
            java.lang.reflect.Method r0 = androidx.core.app.ActivityRecreator.performStopActivity3ParamsMethod
            if (r0 != 0) goto L20
            return r1
        L20:
            java.lang.reflect.Field r0 = androidx.core.app.ActivityRecreator.tokenField     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r0.get(r15)     // Catch: java.lang.Throwable -> L8c
            r3 = r0
            if (r3 != 0) goto L2a
            return r1
        L2a:
            java.lang.reflect.Field r0 = androidx.core.app.ActivityRecreator.mainThreadField     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r0.get(r15)     // Catch: java.lang.Throwable -> L8c
            r12 = r0
            if (r12 != 0) goto L34
            return r1
        L34:
            android.app.Application r0 = r15.getApplication()     // Catch: java.lang.Throwable -> L8c
            r13 = r0
            androidx.core.app.ActivityRecreator$LifecycleCheckCallbacks r0 = new androidx.core.app.ActivityRecreator$LifecycleCheckCallbacks     // Catch: java.lang.Throwable -> L8c
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L8c
            r14 = r0
            r13.registerActivityLifecycleCallbacks(r14)     // Catch: java.lang.Throwable -> L8c
            android.os.Handler r0 = androidx.core.app.ActivityRecreator.mainHandler     // Catch: java.lang.Throwable -> L8c
            androidx.core.app.ActivityRecreator$1 r4 = new androidx.core.app.ActivityRecreator$1     // Catch: java.lang.Throwable -> L8c
            r4.<init>(r14, r3)     // Catch: java.lang.Throwable -> L8c
            r0.post(r4)     // Catch: java.lang.Throwable -> L8c
            boolean r0 = needsRelaunchCall()     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L70
            java.lang.reflect.Method r0 = androidx.core.app.ActivityRecreator.requestRelaunchActivityMethod     // Catch: java.lang.Throwable -> L7f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L7f
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L7f
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L7f
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L7f
            r4 = 0
            r5 = 0
            r8 = 0
            r9 = 0
            java.lang.Object[] r4 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9, r10, r11}     // Catch: java.lang.Throwable -> L7f
            r0.invoke(r12, r4)     // Catch: java.lang.Throwable -> L7f
            goto L73
        L70:
            r15.recreate()     // Catch: java.lang.Throwable -> L7f
        L73:
            android.os.Handler r0 = androidx.core.app.ActivityRecreator.mainHandler     // Catch: java.lang.Throwable -> L8c
            androidx.core.app.ActivityRecreator$2 r4 = new androidx.core.app.ActivityRecreator$2     // Catch: java.lang.Throwable -> L8c
            r4.<init>(r13, r14)     // Catch: java.lang.Throwable -> L8c
            r0.post(r4)     // Catch: java.lang.Throwable -> L8c
            return r2
        L7f:
            r0 = move-exception
            android.os.Handler r2 = androidx.core.app.ActivityRecreator.mainHandler     // Catch: java.lang.Throwable -> L8c
            androidx.core.app.ActivityRecreator$2 r4 = new androidx.core.app.ActivityRecreator$2     // Catch: java.lang.Throwable -> L8c
            r4.<init>(r13, r14)     // Catch: java.lang.Throwable -> L8c
            r2.post(r4)     // Catch: java.lang.Throwable -> L8c
            throw r0     // Catch: java.lang.Throwable -> L8c
        L8c:
            r0 = move-exception
            return r1
    }
}
