package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class HandlerCompat {
    private static final java.lang.String TAG = "HandlerCompat";

    private static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.os.Handler createAsync(android.os.Looper r1) {
                android.os.Handler r0 = android.os.Handler.createAsync(r1)
                return r0
        }

        public static android.os.Handler createAsync(android.os.Looper r1, android.os.Handler.Callback r2) {
                android.os.Handler r0 = android.os.Handler.createAsync(r1, r2)
                return r0
        }

        public static boolean postDelayed(android.os.Handler r1, java.lang.Runnable r2, java.lang.Object r3, long r4) {
                boolean r0 = r1.postDelayed(r2, r3, r4)
                return r0
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static boolean hasCallbacks(android.os.Handler r1, java.lang.Runnable r2) {
                boolean r0 = r1.hasCallbacks(r2)
                return r0
        }
    }

    private HandlerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.os.Handler createAsync(android.os.Looper r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r0 = androidx.core.os.HandlerCompat.Api28Impl.createAsync(r5)
            return r0
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r1 = 3
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L51 java.lang.IllegalAccessException -> L54
            java.lang.Class<android.os.Looper> r2 = android.os.Looper.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L51 java.lang.IllegalAccessException -> L54
            java.lang.Class<android.os.Handler$Callback> r2 = android.os.Handler.Callback.class
            r3 = 1
            r1[r3] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L51 java.lang.IllegalAccessException -> L54
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L51 java.lang.IllegalAccessException -> L54
            r4 = 2
            r1[r4] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L51 java.lang.IllegalAccessException -> L54
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L51 java.lang.IllegalAccessException -> L54
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L51 java.lang.IllegalAccessException -> L54
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r2, r1}     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L51 java.lang.IllegalAccessException -> L54
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L51 java.lang.IllegalAccessException -> L54
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.reflect.InvocationTargetException -> L33 java.lang.NoSuchMethodException -> L4e java.lang.InstantiationException -> L51 java.lang.IllegalAccessException -> L54
            return r0
        L33:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r2 = r1 instanceof java.lang.RuntimeException
            if (r2 != 0) goto L4a
            boolean r2 = r1 instanceof java.lang.Error
            if (r2 == 0) goto L44
            r2 = r1
            java.lang.Error r2 = (java.lang.Error) r2
            throw r2
        L44:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        L4a:
            r2 = r1
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2
            throw r2
        L4e:
            r0 = move-exception
            goto L56
        L51:
            r0 = move-exception
            goto L56
        L54:
            r0 = move-exception
        L56:
            java.lang.String r1 = "HandlerCompat"
            java.lang.String r2 = "Unable to invoke Handler(Looper, Callback, boolean) constructor"
            android.util.Log.w(r1, r2, r0)
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r5)
            return r1
    }

    public static android.os.Handler createAsync(android.os.Looper r5, android.os.Handler.Callback r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r0 = androidx.core.os.HandlerCompat.Api28Impl.createAsync(r5, r6)
            return r0
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r1 = 3
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.NoSuchMethodException -> L4d java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L53
            java.lang.Class<android.os.Looper> r2 = android.os.Looper.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.NoSuchMethodException -> L4d java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L53
            java.lang.Class<android.os.Handler$Callback> r2 = android.os.Handler.Callback.class
            r3 = 1
            r1[r3] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.NoSuchMethodException -> L4d java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L53
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.NoSuchMethodException -> L4d java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L53
            r4 = 2
            r1[r4] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.NoSuchMethodException -> L4d java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L53
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.NoSuchMethodException -> L4d java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L53
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.NoSuchMethodException -> L4d java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L53
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r6, r1}     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.NoSuchMethodException -> L4d java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L53
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.NoSuchMethodException -> L4d java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L53
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.NoSuchMethodException -> L4d java.lang.InstantiationException -> L50 java.lang.IllegalAccessException -> L53
            return r0
        L32:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r2 = r1 instanceof java.lang.RuntimeException
            if (r2 != 0) goto L49
            boolean r2 = r1 instanceof java.lang.Error
            if (r2 == 0) goto L43
            r2 = r1
            java.lang.Error r2 = (java.lang.Error) r2
            throw r2
        L43:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        L49:
            r2 = r1
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2
            throw r2
        L4d:
            r0 = move-exception
            goto L55
        L50:
            r0 = move-exception
            goto L55
        L53:
            r0 = move-exception
        L55:
            java.lang.String r1 = "HandlerCompat"
            java.lang.String r2 = "Unable to invoke Handler(Looper, Callback, boolean) constructor"
            android.util.Log.w(r1, r2, r0)
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r5, r6)
            return r1
    }

    public static boolean hasCallbacks(android.os.Handler r6, java.lang.Runnable r7) {
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto Lc
            boolean r1 = androidx.core.os.HandlerCompat.Api29Impl.hasCallbacks(r6, r7)
            return r1
        Lc:
            java.lang.Class<android.os.Handler> r1 = android.os.Handler.class
            java.lang.String r2 = "hasCallbacks"
            r3 = 1
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.NullPointerException -> L2b java.lang.NoSuchMethodException -> L2e java.lang.IllegalAccessException -> L31 java.lang.reflect.InvocationTargetException -> L3c
            java.lang.Class<java.lang.Runnable> r4 = java.lang.Runnable.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.NullPointerException -> L2b java.lang.NoSuchMethodException -> L2e java.lang.IllegalAccessException -> L31 java.lang.reflect.InvocationTargetException -> L3c
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.NullPointerException -> L2b java.lang.NoSuchMethodException -> L2e java.lang.IllegalAccessException -> L31 java.lang.reflect.InvocationTargetException -> L3c
            java.lang.Object[] r2 = new java.lang.Object[]{r7}     // Catch: java.lang.NullPointerException -> L2b java.lang.NoSuchMethodException -> L2e java.lang.IllegalAccessException -> L31 java.lang.reflect.InvocationTargetException -> L3c
            java.lang.Object r2 = r1.invoke(r6, r2)     // Catch: java.lang.NullPointerException -> L2b java.lang.NoSuchMethodException -> L2e java.lang.IllegalAccessException -> L31 java.lang.reflect.InvocationTargetException -> L3c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.NullPointerException -> L2b java.lang.NoSuchMethodException -> L2e java.lang.IllegalAccessException -> L31 java.lang.reflect.InvocationTargetException -> L3c
            boolean r2 = r2.booleanValue()     // Catch: java.lang.NullPointerException -> L2b java.lang.NoSuchMethodException -> L2e java.lang.IllegalAccessException -> L31 java.lang.reflect.InvocationTargetException -> L3c
            return r2
        L2b:
            r1 = move-exception
            r0 = r1
            goto L34
        L2e:
            r1 = move-exception
            r0 = r1
            goto L33
        L31:
            r1 = move-exception
            r0 = r1
        L33:
        L34:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception."
            r1.<init>(r2, r0)
            throw r1
        L3c:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getCause()
            boolean r3 = r2 instanceof java.lang.RuntimeException
            if (r3 != 0) goto L53
            boolean r3 = r2 instanceof java.lang.Error
            if (r3 == 0) goto L4d
            r3 = r2
            java.lang.Error r3 = (java.lang.Error) r3
            throw r3
        L4d:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
        L53:
            r3 = r2
            java.lang.RuntimeException r3 = (java.lang.RuntimeException) r3
            throw r3
    }

    public static boolean postDelayed(android.os.Handler r2, java.lang.Runnable r3, java.lang.Object r4, long r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.os.HandlerCompat.Api28Impl.postDelayed(r2, r3, r4, r5)
            return r0
        Lb:
            android.os.Message r0 = android.os.Message.obtain(r2, r3)
            r0.obj = r4
            boolean r1 = r2.sendMessageDelayed(r0, r5)
            return r1
    }
}
