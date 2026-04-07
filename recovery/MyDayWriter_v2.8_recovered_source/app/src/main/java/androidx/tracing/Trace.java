package androidx.tracing;

/* JADX INFO: loaded from: classes.dex */
public final class Trace {
    static final int MAX_TRACE_LABEL_LENGTH = 127;
    static final java.lang.String TAG = "Trace";
    private static java.lang.reflect.Method sAsyncTraceBeginMethod;
    private static java.lang.reflect.Method sAsyncTraceEndMethod;
    private static boolean sHasAppTracingEnabled;
    private static java.lang.reflect.Method sIsTagEnabledMethod;
    private static java.lang.reflect.Method sTraceCounterMethod;
    private static long sTraceTagApp;

    private Trace() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void beginAsyncSection(java.lang.String r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            java.lang.String r0 = truncatedTraceSectionLabel(r2)
            androidx.tracing.TraceApi29Impl.beginAsyncSection(r0, r3)
            goto L15
        Le:
            java.lang.String r0 = truncatedTraceSectionLabel(r2)
            beginAsyncSectionFallback(r0, r3)
        L15:
            return
    }

    private static void beginAsyncSectionFallback(java.lang.String r5, int r6) {
            java.lang.String r0 = "asyncTraceBegin"
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sAsyncTraceBeginMethod     // Catch: java.lang.Exception -> L35
            if (r1 != 0) goto L20
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            r2 = 3
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L35
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L35
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L35
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.Exception -> L35
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L35
            r4 = 2
            r2[r4] = r3     // Catch: java.lang.Exception -> L35
            java.lang.reflect.Method r1 = r1.getMethod(r0, r2)     // Catch: java.lang.Exception -> L35
            androidx.tracing.Trace.sAsyncTraceBeginMethod = r1     // Catch: java.lang.Exception -> L35
        L20:
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sAsyncTraceBeginMethod     // Catch: java.lang.Exception -> L35
            long r2 = androidx.tracing.Trace.sTraceTagApp     // Catch: java.lang.Exception -> L35
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L35
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L35
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r5, r3}     // Catch: java.lang.Exception -> L35
            r3 = 0
            r1.invoke(r3, r2)     // Catch: java.lang.Exception -> L35
            goto L39
        L35:
            r1 = move-exception
            handleException(r0, r1)
        L39:
            return
    }

    public static void beginSection(java.lang.String r1) {
            java.lang.String r0 = truncatedTraceSectionLabel(r1)
            androidx.tracing.TraceApi18Impl.beginSection(r0)
            return
    }

    public static void endAsyncSection(java.lang.String r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            java.lang.String r0 = truncatedTraceSectionLabel(r2)
            androidx.tracing.TraceApi29Impl.endAsyncSection(r0, r3)
            goto L15
        Le:
            java.lang.String r0 = truncatedTraceSectionLabel(r2)
            endAsyncSectionFallback(r0, r3)
        L15:
            return
    }

    private static void endAsyncSectionFallback(java.lang.String r5, int r6) {
            java.lang.String r0 = "asyncTraceEnd"
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sAsyncTraceEndMethod     // Catch: java.lang.Exception -> L35
            if (r1 != 0) goto L20
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            r2 = 3
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L35
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L35
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L35
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.Exception -> L35
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L35
            r4 = 2
            r2[r4] = r3     // Catch: java.lang.Exception -> L35
            java.lang.reflect.Method r1 = r1.getMethod(r0, r2)     // Catch: java.lang.Exception -> L35
            androidx.tracing.Trace.sAsyncTraceEndMethod = r1     // Catch: java.lang.Exception -> L35
        L20:
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sAsyncTraceEndMethod     // Catch: java.lang.Exception -> L35
            long r2 = androidx.tracing.Trace.sTraceTagApp     // Catch: java.lang.Exception -> L35
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L35
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L35
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r5, r3}     // Catch: java.lang.Exception -> L35
            r3 = 0
            r1.invoke(r3, r2)     // Catch: java.lang.Exception -> L35
            goto L39
        L35:
            r1 = move-exception
            handleException(r0, r1)
        L39:
            return
    }

    public static void endSection() {
            androidx.tracing.TraceApi18Impl.endSection()
            return
    }

    public static void forceEnableAppTracing() {
            java.lang.String r0 = "setAppTracingAllowed"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 >= r2) goto L2d
            boolean r1 = androidx.tracing.Trace.sHasAppTracingEnabled     // Catch: java.lang.Exception -> L29
            if (r1 != 0) goto L28
            r1 = 1
            androidx.tracing.Trace.sHasAppTracingEnabled = r1     // Catch: java.lang.Exception -> L29
            java.lang.Class<android.os.Trace> r2 = android.os.Trace.class
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L29
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L29
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L29
            java.lang.reflect.Method r2 = r2.getMethod(r0, r3)     // Catch: java.lang.Exception -> L29
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L29
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Exception -> L29
            r3 = 0
            r2.invoke(r3, r1)     // Catch: java.lang.Exception -> L29
        L28:
            goto L2d
        L29:
            r1 = move-exception
            handleException(r0, r1)
        L2d:
            return
    }

    private static void handleException(java.lang.String r2, java.lang.Exception r3) {
            boolean r0 = r3 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto L16
            java.lang.Throwable r0 = r3.getCause()
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 == 0) goto L10
            r1 = r0
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            throw r1
        L10:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to call "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = " via reflection"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Trace"
            android.util.Log.v(r1, r0, r3)
            return
    }

    public static boolean isEnabled() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            boolean r0 = androidx.tracing.TraceApi29Impl.isEnabled()
            return r0
        Lb:
            boolean r0 = isEnabledFallback()
            return r0
    }

    private static boolean isEnabledFallback() {
            java.lang.String r0 = "isTagEnabled"
            r1 = 0
            java.lang.reflect.Method r2 = androidx.tracing.Trace.sIsTagEnabledMethod     // Catch: java.lang.Exception -> L3c
            r3 = 0
            if (r2 != 0) goto L25
            java.lang.Class<android.os.Trace> r2 = android.os.Trace.class
            java.lang.String r4 = "TRACE_TAG_APP"
            java.lang.reflect.Field r2 = r2.getField(r4)     // Catch: java.lang.Exception -> L3c
            long r4 = r2.getLong(r3)     // Catch: java.lang.Exception -> L3c
            androidx.tracing.Trace.sTraceTagApp = r4     // Catch: java.lang.Exception -> L3c
            java.lang.Class<android.os.Trace> r4 = android.os.Trace.class
            r5 = 1
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L3c
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L3c
            r5[r1] = r6     // Catch: java.lang.Exception -> L3c
            java.lang.reflect.Method r4 = r4.getMethod(r0, r5)     // Catch: java.lang.Exception -> L3c
            androidx.tracing.Trace.sIsTagEnabledMethod = r4     // Catch: java.lang.Exception -> L3c
        L25:
            java.lang.reflect.Method r2 = androidx.tracing.Trace.sIsTagEnabledMethod     // Catch: java.lang.Exception -> L3c
            long r4 = androidx.tracing.Trace.sTraceTagApp     // Catch: java.lang.Exception -> L3c
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L3c
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L3c
            java.lang.Object r2 = r2.invoke(r3, r4)     // Catch: java.lang.Exception -> L3c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L3c
            boolean r0 = r2.booleanValue()     // Catch: java.lang.Exception -> L3c
            return r0
        L3c:
            r2 = move-exception
            handleException(r0, r2)
            return r1
    }

    public static void setCounter(java.lang.String r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            java.lang.String r0 = truncatedTraceSectionLabel(r2)
            androidx.tracing.TraceApi29Impl.setCounter(r0, r3)
            goto L15
        Le:
            java.lang.String r0 = truncatedTraceSectionLabel(r2)
            setCounterFallback(r0, r3)
        L15:
            return
    }

    private static void setCounterFallback(java.lang.String r5, int r6) {
            java.lang.String r0 = "traceCounter"
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sTraceCounterMethod     // Catch: java.lang.Exception -> L35
            if (r1 != 0) goto L20
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            r2 = 3
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L35
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L35
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L35
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.Exception -> L35
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L35
            r4 = 2
            r2[r4] = r3     // Catch: java.lang.Exception -> L35
            java.lang.reflect.Method r1 = r1.getMethod(r0, r2)     // Catch: java.lang.Exception -> L35
            androidx.tracing.Trace.sTraceCounterMethod = r1     // Catch: java.lang.Exception -> L35
        L20:
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sTraceCounterMethod     // Catch: java.lang.Exception -> L35
            long r2 = androidx.tracing.Trace.sTraceTagApp     // Catch: java.lang.Exception -> L35
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L35
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L35
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r5, r3}     // Catch: java.lang.Exception -> L35
            r3 = 0
            r1.invoke(r3, r2)     // Catch: java.lang.Exception -> L35
            goto L39
        L35:
            r1 = move-exception
            handleException(r0, r1)
        L39:
            return
    }

    private static java.lang.String truncatedTraceSectionLabel(java.lang.String r2) {
            int r0 = r2.length()
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto L9
            return r2
        L9:
            r0 = 0
            java.lang.String r0 = r2.substring(r0, r1)
            return r0
    }
}
