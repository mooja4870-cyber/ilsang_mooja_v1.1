package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class TraceCompat {
    private static final java.lang.String TAG = "TraceCompat";
    private static java.lang.reflect.Method sAsyncTraceBeginMethod;
    private static java.lang.reflect.Method sAsyncTraceEndMethod;
    private static java.lang.reflect.Method sIsTagEnabledMethod;
    private static java.lang.reflect.Method sTraceCounterMethod;
    private static long sTraceTagApp;

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void beginAsyncSection(java.lang.String r0, int r1) {
                android.os.Trace.beginAsyncSection(r0, r1)
                return
        }

        static void endAsyncSection(java.lang.String r0, int r1) {
                android.os.Trace.endAsyncSection(r0, r1)
                return
        }

        static boolean isEnabled() {
                boolean r0 = android.os.Trace.isEnabled()
                return r0
        }

        static void setCounter(java.lang.String r0, long r1) {
                android.os.Trace.setCounter(r0, r1)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L7a
            java.lang.Class<android.os.Trace> r0 = android.os.Trace.class
            java.lang.String r1 = "TRACE_TAG_APP"
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.Exception -> L72
            r1 = 0
            long r1 = r0.getLong(r1)     // Catch: java.lang.Exception -> L72
            androidx.core.os.TraceCompat.sTraceTagApp = r1     // Catch: java.lang.Exception -> L72
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.String r2 = "isTagEnabled"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L72
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L72
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Exception -> L72
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L72
            androidx.core.os.TraceCompat.sIsTagEnabledMethod = r1     // Catch: java.lang.Exception -> L72
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.String r2 = "asyncTraceBegin"
            r4 = 3
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L72
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L72
            r5[r6] = r7     // Catch: java.lang.Exception -> L72
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r5[r3] = r7     // Catch: java.lang.Exception -> L72
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L72
            r8 = 2
            r5[r8] = r7     // Catch: java.lang.Exception -> L72
            java.lang.reflect.Method r1 = r1.getMethod(r2, r5)     // Catch: java.lang.Exception -> L72
            androidx.core.os.TraceCompat.sAsyncTraceBeginMethod = r1     // Catch: java.lang.Exception -> L72
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.String r2 = "asyncTraceEnd"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L72
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L72
            r5[r6] = r7     // Catch: java.lang.Exception -> L72
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r5[r3] = r7     // Catch: java.lang.Exception -> L72
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L72
            r5[r8] = r7     // Catch: java.lang.Exception -> L72
            java.lang.reflect.Method r1 = r1.getMethod(r2, r5)     // Catch: java.lang.Exception -> L72
            androidx.core.os.TraceCompat.sAsyncTraceEndMethod = r1     // Catch: java.lang.Exception -> L72
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.String r2 = "traceCounter"
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L72
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L72
            r4[r6] = r5     // Catch: java.lang.Exception -> L72
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r3] = r5     // Catch: java.lang.Exception -> L72
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L72
            r4[r8] = r3     // Catch: java.lang.Exception -> L72
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L72
            androidx.core.os.TraceCompat.sTraceCounterMethod = r1     // Catch: java.lang.Exception -> L72
            goto L7a
        L72:
            r0 = move-exception
            java.lang.String r1 = "TraceCompat"
            java.lang.String r2 = "Unable to initialize via reflection."
            android.util.Log.i(r1, r2, r0)
        L7a:
            return
    }

    private TraceCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void beginAsyncSection(java.lang.String r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            androidx.core.os.TraceCompat.Api29Impl.beginAsyncSection(r3, r4)
            goto L27
        La:
            java.lang.reflect.Method r0 = androidx.core.os.TraceCompat.sAsyncTraceBeginMethod     // Catch: java.lang.Exception -> L1f
            long r1 = androidx.core.os.TraceCompat.sTraceTagApp     // Catch: java.lang.Exception -> L1f
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L1f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L1f
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3, r2}     // Catch: java.lang.Exception -> L1f
            r2 = 0
            r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L1f
            goto L27
        L1f:
            r0 = move-exception
            java.lang.String r1 = "TraceCompat"
            java.lang.String r2 = "Unable to invoke asyncTraceBegin() via reflection."
            android.util.Log.v(r1, r2)
        L27:
            return
    }

    public static void beginSection(java.lang.String r0) {
            android.os.Trace.beginSection(r0)
            return
    }

    public static void endAsyncSection(java.lang.String r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            androidx.core.os.TraceCompat.Api29Impl.endAsyncSection(r3, r4)
            goto L27
        La:
            java.lang.reflect.Method r0 = androidx.core.os.TraceCompat.sAsyncTraceEndMethod     // Catch: java.lang.Exception -> L1f
            long r1 = androidx.core.os.TraceCompat.sTraceTagApp     // Catch: java.lang.Exception -> L1f
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L1f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L1f
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3, r2}     // Catch: java.lang.Exception -> L1f
            r2 = 0
            r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L1f
            goto L27
        L1f:
            r0 = move-exception
            java.lang.String r1 = "TraceCompat"
            java.lang.String r2 = "Unable to invoke endAsyncSection() via reflection."
            android.util.Log.v(r1, r2)
        L27:
            return
    }

    public static void endSection() {
            android.os.Trace.endSection()
            return
    }

    public static boolean isEnabled() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.os.TraceCompat.Api29Impl.isEnabled()
            return r0
        Lb:
            java.lang.reflect.Method r0 = androidx.core.os.TraceCompat.sIsTagEnabledMethod     // Catch: java.lang.Exception -> L23
            long r1 = androidx.core.os.TraceCompat.sTraceTagApp     // Catch: java.lang.Exception -> L23
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L23
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Exception -> L23
            r2 = 0
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L23
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L23
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L23
            return r0
        L23:
            r0 = move-exception
            java.lang.String r1 = "TraceCompat"
            java.lang.String r2 = "Unable to invoke isTagEnabled() via reflection."
            android.util.Log.v(r1, r2)
            r0 = 0
            return r0
    }

    public static void setCounter(java.lang.String r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            long r0 = (long) r4
            androidx.core.os.TraceCompat.Api29Impl.setCounter(r3, r0)
            goto L28
        Lb:
            java.lang.reflect.Method r0 = androidx.core.os.TraceCompat.sTraceCounterMethod     // Catch: java.lang.Exception -> L20
            long r1 = androidx.core.os.TraceCompat.sTraceTagApp     // Catch: java.lang.Exception -> L20
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L20
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3, r2}     // Catch: java.lang.Exception -> L20
            r2 = 0
            r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L20
            goto L28
        L20:
            r0 = move-exception
            java.lang.String r1 = "TraceCompat"
            java.lang.String r2 = "Unable to invoke traceCounter() via reflection."
            android.util.Log.v(r1, r2)
        L28:
            return
    }
}
