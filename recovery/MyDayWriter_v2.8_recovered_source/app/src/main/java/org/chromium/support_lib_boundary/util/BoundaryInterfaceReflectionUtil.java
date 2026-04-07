package org.chromium.support_lib_boundary.util;

/* JADX INFO: loaded from: classes7.dex */
@org.jspecify.annotations.NullMarked
public class BoundaryInterfaceReflectionUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private static class InvocationHandlerWithDelegateGetter implements java.lang.reflect.InvocationHandler {
        private final java.lang.Object mDelegate;

        public InvocationHandlerWithDelegateGetter(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                r0.mDelegate = r1
                return
        }

        public java.lang.Object getDelegate() {
                r1 = this;
                java.lang.Object r0 = r1.mDelegate
                return r0
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object r6, java.lang.reflect.Method r7, java.lang.Object[] r8) throws java.lang.Throwable {
                r5 = this;
                java.lang.Object r0 = r5.mDelegate
                java.lang.Class r0 = r0.getClass()
                java.lang.ClassLoader r0 = r0.getClassLoader()
                java.lang.reflect.Method r1 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.dupeMethod(r7, r0)     // Catch: java.lang.ReflectiveOperationException -> L15 java.lang.reflect.InvocationTargetException -> L2f
                java.lang.Object r2 = r5.mDelegate     // Catch: java.lang.ReflectiveOperationException -> L15 java.lang.reflect.InvocationTargetException -> L2f
                java.lang.Object r1 = r1.invoke(r2, r8)     // Catch: java.lang.ReflectiveOperationException -> L15 java.lang.reflect.InvocationTargetException -> L2f
                return r1
            L15:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Reflection failed for method "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r7)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3, r1)
                throw r2
            L2f:
                r1 = move-exception
                java.lang.Throwable r2 = r1.getTargetException()
                throw r2
        }
    }

    static {
            return
    }

    public BoundaryInterfaceReflectionUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> T castToSuppLibClass(java.lang.Class<T> r3, java.lang.reflect.InvocationHandler r4) {
            if (r4 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.Class<org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil> r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.Object r0 = java.lang.reflect.Proxy.newProxyInstance(r0, r1, r4)
            java.lang.Object r0 = r3.cast(r0)
            return r0
    }

    public static boolean containsFeature(java.util.Collection<java.lang.String> r2, java.lang.String r3) {
            java.lang.String r0 = ":dev"
            boolean r1 = r3.endsWith(r0)
            if (r1 != 0) goto L30
            boolean r1 = r2.contains(r3)
            if (r1 != 0) goto L2e
            boolean r1 = isDebuggable()
            if (r1 == 0) goto L2c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L2c
            goto L2e
        L2c:
            r0 = 0
            goto L2f
        L2e:
            r0 = 1
        L2f:
            return r0
        L30:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }

    public static boolean containsFeature(java.lang.String[] r1, java.lang.String r2) {
            java.util.List r0 = java.util.Arrays.asList(r1)
            boolean r0 = containsFeature(r0, r2)
            return r0
    }

    public static java.lang.reflect.InvocationHandler createInvocationHandlerFor(java.lang.Object r1) {
            if (r1 != 0) goto L4
            r0 = 0
            return r0
        L4:
            org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil$InvocationHandlerWithDelegateGetter r0 = new org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil$InvocationHandlerWithDelegateGetter
            r0.<init>(r1)
            return r0
    }

    public static java.lang.reflect.InvocationHandler[] createInvocationHandlersForArray(java.lang.Object[] r3) {
            if (r3 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r3.length
            java.lang.reflect.InvocationHandler[] r0 = new java.lang.reflect.InvocationHandler[r0]
            r1 = 0
        L8:
            int r2 = r0.length
            if (r1 >= r2) goto L16
            r2 = r3[r1]
            java.lang.reflect.InvocationHandler r2 = createInvocationHandlerFor(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L16:
            return r0
    }

    public static java.lang.reflect.Method dupeMethod(java.lang.reflect.Method r3, java.lang.ClassLoader r4) throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException {
            java.lang.Class r0 = r3.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            r1 = 1
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r4)
            java.lang.Class[] r1 = r3.getParameterTypes()
            java.lang.String r2 = r3.getName()
            java.lang.reflect.Method r2 = r0.getDeclaredMethod(r2, r1)
            return r2
    }

    public static java.lang.Object getDelegateFromInvocationHandler(java.lang.reflect.InvocationHandler r2) {
            if (r2 != 0) goto L4
            r0 = 0
            return r0
        L4:
            r0 = r2
            org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil$InvocationHandlerWithDelegateGetter r0 = (org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.InvocationHandlerWithDelegateGetter) r0
            java.lang.Object r1 = r0.getDelegate()
            return r1
    }

    public static boolean instanceOfInOwnClassLoader(java.lang.Object r3, java.lang.String r4) {
            r0 = 0
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.ClassNotFoundException -> L12
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L12
            java.lang.Class r2 = java.lang.Class.forName(r4, r0, r1)     // Catch: java.lang.ClassNotFoundException -> L12
            boolean r0 = r2.isInstance(r3)     // Catch: java.lang.ClassNotFoundException -> L12
            return r0
        L12:
            r1 = move-exception
            return r0
    }

    private static boolean isDebuggable() {
            java.lang.String r0 = "eng"
            java.lang.String r1 = android.os.Build.TYPE
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            java.lang.String r0 = "userdebug"
            java.lang.String r1 = android.os.Build.TYPE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            return r0
    }
}
