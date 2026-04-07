package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
final class ClassesInfoCache {
    private static final int CALL_TYPE_NO_ARG = 0;
    private static final int CALL_TYPE_PROVIDER = 1;
    private static final int CALL_TYPE_PROVIDER_WITH_EVENT = 2;
    static androidx.lifecycle.ClassesInfoCache sInstance;
    private final java.util.Map<java.lang.Class<?>, androidx.lifecycle.ClassesInfoCache.CallbackInfo> mCallbackMap;
    private final java.util.Map<java.lang.Class<?>, java.lang.Boolean> mHasLifecycleMethods;

    @java.lang.Deprecated
    static class CallbackInfo {
        final java.util.Map<androidx.lifecycle.Lifecycle.Event, java.util.List<androidx.lifecycle.ClassesInfoCache.MethodReference>> mEventToHandlers;
        final java.util.Map<androidx.lifecycle.ClassesInfoCache.MethodReference, androidx.lifecycle.Lifecycle.Event> mHandlerToEvent;

        CallbackInfo(java.util.Map<androidx.lifecycle.ClassesInfoCache.MethodReference, androidx.lifecycle.Lifecycle.Event> r6) {
                r5 = this;
                r5.<init>()
                r5.mHandlerToEvent = r6
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r5.mEventToHandlers = r0
                java.util.Set r0 = r6.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L14:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L45
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getValue()
                androidx.lifecycle.Lifecycle$Event r2 = (androidx.lifecycle.Lifecycle.Event) r2
                java.util.Map<androidx.lifecycle.Lifecycle$Event, java.util.List<androidx.lifecycle.ClassesInfoCache$MethodReference>> r3 = r5.mEventToHandlers
                java.lang.Object r3 = r3.get(r2)
                java.util.List r3 = (java.util.List) r3
                if (r3 != 0) goto L3b
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r3 = r4
                java.util.Map<androidx.lifecycle.Lifecycle$Event, java.util.List<androidx.lifecycle.ClassesInfoCache$MethodReference>> r4 = r5.mEventToHandlers
                r4.put(r2, r3)
            L3b:
                java.lang.Object r4 = r1.getKey()
                androidx.lifecycle.ClassesInfoCache$MethodReference r4 = (androidx.lifecycle.ClassesInfoCache.MethodReference) r4
                r3.add(r4)
                goto L14
            L45:
                return
        }

        private static void invokeMethodsForEvent(java.util.List<androidx.lifecycle.ClassesInfoCache.MethodReference> r2, androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4, java.lang.Object r5) {
                if (r2 == 0) goto L16
                int r0 = r2.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L16
                java.lang.Object r1 = r2.get(r0)
                androidx.lifecycle.ClassesInfoCache$MethodReference r1 = (androidx.lifecycle.ClassesInfoCache.MethodReference) r1
                r1.invokeCallback(r3, r4, r5)
                int r0 = r0 + (-1)
                goto L8
            L16:
                return
        }

        void invokeCallbacks(androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4, java.lang.Object r5) {
                r2 = this;
                java.util.Map<androidx.lifecycle.Lifecycle$Event, java.util.List<androidx.lifecycle.ClassesInfoCache$MethodReference>> r0 = r2.mEventToHandlers
                java.lang.Object r0 = r0.get(r4)
                java.util.List r0 = (java.util.List) r0
                invokeMethodsForEvent(r0, r3, r4, r5)
                java.util.Map<androidx.lifecycle.Lifecycle$Event, java.util.List<androidx.lifecycle.ClassesInfoCache$MethodReference>> r0 = r2.mEventToHandlers
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_ANY
                java.lang.Object r0 = r0.get(r1)
                java.util.List r0 = (java.util.List) r0
                invokeMethodsForEvent(r0, r3, r4, r5)
                return
        }
    }

    @java.lang.Deprecated
    static final class MethodReference {
        final int mCallType;
        final java.lang.reflect.Method mMethod;

        MethodReference(int r3, java.lang.reflect.Method r4) {
                r2 = this;
                r2.<init>()
                r2.mCallType = r3
                r2.mMethod = r4
                java.lang.reflect.Method r0 = r2.mMethod
                r1 = 1
                r0.setAccessible(r1)
                return
        }

        public boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof androidx.lifecycle.ClassesInfoCache.MethodReference
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                r1 = r6
                androidx.lifecycle.ClassesInfoCache$MethodReference r1 = (androidx.lifecycle.ClassesInfoCache.MethodReference) r1
                int r3 = r5.mCallType
                int r4 = r1.mCallType
                if (r3 != r4) goto L26
                java.lang.reflect.Method r3 = r5.mMethod
                java.lang.String r3 = r3.getName()
                java.lang.reflect.Method r4 = r1.mMethod
                java.lang.String r4 = r4.getName()
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L26
                goto L27
            L26:
                r0 = r2
            L27:
                return r0
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.mCallType
                int r0 = r0 * 31
                java.lang.reflect.Method r1 = r2.mMethod
                java.lang.String r1 = r1.getName()
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        void invokeCallback(androidx.lifecycle.LifecycleOwner r5, androidx.lifecycle.Lifecycle.Event r6, java.lang.Object r7) {
                r4 = this;
                int r0 = r4.mCallType     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                switch(r0) {
                    case 0: goto L1a;
                    case 1: goto L10;
                    case 2: goto L6;
                    default: goto L5;
                }     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
            L5:
                goto L23
            L6:
                java.lang.reflect.Method r0 = r4.mMethod     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                java.lang.Object[] r1 = new java.lang.Object[]{r5, r6}     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                r0.invoke(r7, r1)     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                goto L23
            L10:
                java.lang.reflect.Method r0 = r4.mMethod     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                java.lang.Object[] r1 = new java.lang.Object[]{r5}     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                r0.invoke(r7, r1)     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                goto L23
            L1a:
                java.lang.reflect.Method r0 = r4.mMethod     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
                r0.invoke(r7, r1)     // Catch: java.lang.IllegalAccessException -> L25 java.lang.reflect.InvocationTargetException -> L2c
            L23:
                return
            L25:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L2c:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Failed to call observer method"
                java.lang.Throwable r3 = r0.getCause()
                r1.<init>(r2, r3)
                throw r1
        }
    }

    static {
            androidx.lifecycle.ClassesInfoCache r0 = new androidx.lifecycle.ClassesInfoCache
            r0.<init>()
            androidx.lifecycle.ClassesInfoCache.sInstance = r0
            return
    }

    ClassesInfoCache() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mCallbackMap = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mHasLifecycleMethods = r0
            return
    }

    private androidx.lifecycle.ClassesInfoCache.CallbackInfo createInfo(java.lang.Class<?> r17, java.lang.reflect.Method[] r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.Class r2 = r1.getSuperclass()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            if (r2 == 0) goto L1a
            androidx.lifecycle.ClassesInfoCache$CallbackInfo r4 = r0.getInfo(r2)
            if (r4 == 0) goto L1a
            java.util.Map<androidx.lifecycle.ClassesInfoCache$MethodReference, androidx.lifecycle.Lifecycle$Event> r5 = r4.mHandlerToEvent
            r3.putAll(r5)
        L1a:
            java.lang.Class[] r4 = r1.getInterfaces()
            int r5 = r4.length
            r6 = 0
            r7 = r6
        L21:
            if (r7 >= r5) goto L52
            r8 = r4[r7]
            androidx.lifecycle.ClassesInfoCache$CallbackInfo r9 = r0.getInfo(r8)
            java.util.Map<androidx.lifecycle.ClassesInfoCache$MethodReference, androidx.lifecycle.Lifecycle$Event> r9 = r9.mHandlerToEvent
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L33:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L4f
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getKey()
            androidx.lifecycle.ClassesInfoCache$MethodReference r11 = (androidx.lifecycle.ClassesInfoCache.MethodReference) r11
            java.lang.Object r12 = r10.getValue()
            androidx.lifecycle.Lifecycle$Event r12 = (androidx.lifecycle.Lifecycle.Event) r12
            r0.verifyAndPutHandler(r3, r11, r12, r1)
            goto L33
        L4f:
            int r7 = r7 + 1
            goto L21
        L52:
            if (r18 == 0) goto L57
            r5 = r18
            goto L5b
        L57:
            java.lang.reflect.Method[] r5 = r16.getDeclaredMethods(r17)
        L5b:
            r7 = 0
            int r8 = r5.length
            r9 = r6
        L5e:
            if (r9 >= r8) goto Lca
            r10 = r5[r9]
            java.lang.Class<androidx.lifecycle.OnLifecycleEvent> r11 = androidx.lifecycle.OnLifecycleEvent.class
            java.lang.annotation.Annotation r11 = r10.getAnnotation(r11)
            androidx.lifecycle.OnLifecycleEvent r11 = (androidx.lifecycle.OnLifecycleEvent) r11
            if (r11 != 0) goto L6d
            goto Lbe
        L6d:
            r7 = 1
            java.lang.Class[] r12 = r10.getParameterTypes()
            r13 = 0
            int r14 = r12.length
            if (r14 <= 0) goto L8a
            r13 = 1
            java.lang.Class<androidx.lifecycle.LifecycleOwner> r14 = androidx.lifecycle.LifecycleOwner.class
            r15 = r12[r6]
            boolean r14 = r14.isAssignableFrom(r15)
            if (r14 == 0) goto L82
            goto L8a
        L82:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "invalid parameter type. Must be one and instanceof LifecycleOwner"
            r6.<init>(r8)
            throw r6
        L8a:
            androidx.lifecycle.Lifecycle$Event r14 = r11.value()
            int r15 = r12.length
            r6 = 1
            if (r15 <= r6) goto Lb2
            r13 = 2
            java.lang.Class<androidx.lifecycle.Lifecycle$Event> r15 = androidx.lifecycle.Lifecycle.Event.class
            r6 = r12[r6]
            boolean r6 = r15.isAssignableFrom(r6)
            if (r6 == 0) goto Laa
            androidx.lifecycle.Lifecycle$Event r6 = androidx.lifecycle.Lifecycle.Event.ON_ANY
            if (r14 != r6) goto La2
            goto Lb2
        La2:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Second arg is supported only for ON_ANY value"
            r6.<init>(r8)
            throw r6
        Laa:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "invalid parameter type. second arg must be an event"
            r6.<init>(r8)
            throw r6
        Lb2:
            int r6 = r12.length
            r15 = 2
            if (r6 > r15) goto Lc2
            androidx.lifecycle.ClassesInfoCache$MethodReference r6 = new androidx.lifecycle.ClassesInfoCache$MethodReference
            r6.<init>(r13, r10)
            r0.verifyAndPutHandler(r3, r6, r14, r1)
        Lbe:
            int r9 = r9 + 1
            r6 = 0
            goto L5e
        Lc2:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "cannot have more than 2 params"
            r6.<init>(r8)
            throw r6
        Lca:
            androidx.lifecycle.ClassesInfoCache$CallbackInfo r6 = new androidx.lifecycle.ClassesInfoCache$CallbackInfo
            r6.<init>(r3)
            java.util.Map<java.lang.Class<?>, androidx.lifecycle.ClassesInfoCache$CallbackInfo> r8 = r0.mCallbackMap
            r8.put(r1, r6)
            java.util.Map<java.lang.Class<?>, java.lang.Boolean> r8 = r0.mHasLifecycleMethods
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            r8.put(r1, r9)
            return r6
    }

    private java.lang.reflect.Method[] getDeclaredMethods(java.lang.Class<?> r4) {
            r3 = this;
            java.lang.reflect.Method[] r0 = r4.getDeclaredMethods()     // Catch: java.lang.NoClassDefFoundError -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor."
            r1.<init>(r2, r0)
            throw r1
    }

    private void verifyAndPutHandler(java.util.Map<androidx.lifecycle.ClassesInfoCache.MethodReference, androidx.lifecycle.Lifecycle.Event> r6, androidx.lifecycle.ClassesInfoCache.MethodReference r7, androidx.lifecycle.Lifecycle.Event r8, java.lang.Class<?> r9) {
            r5 = this;
            java.lang.Object r0 = r6.get(r7)
            androidx.lifecycle.Lifecycle$Event r0 = (androidx.lifecycle.Lifecycle.Event) r0
            if (r0 == 0) goto L4c
            if (r8 != r0) goto Lb
            goto L4c
        Lb:
            java.lang.reflect.Method r1 = r7.mMethod
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Method "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r1.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " in "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r9.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " already declared with different @OnLifecycleEvent value: previous value "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = ", new value "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L4c:
            if (r0 != 0) goto L51
            r6.put(r7, r8)
        L51:
            return
    }

    androidx.lifecycle.ClassesInfoCache.CallbackInfo getInfo(java.lang.Class<?> r3) {
            r2 = this;
            java.util.Map<java.lang.Class<?>, androidx.lifecycle.ClassesInfoCache$CallbackInfo> r0 = r2.mCallbackMap
            java.lang.Object r0 = r0.get(r3)
            androidx.lifecycle.ClassesInfoCache$CallbackInfo r0 = (androidx.lifecycle.ClassesInfoCache.CallbackInfo) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            r1 = 0
            androidx.lifecycle.ClassesInfoCache$CallbackInfo r0 = r2.createInfo(r3, r1)
            return r0
    }

    boolean hasLifecycleMethods(java.lang.Class<?> r8) {
            r7 = this;
            java.util.Map<java.lang.Class<?>, java.lang.Boolean> r0 = r7.mHasLifecycleMethods
            java.lang.Object r0 = r0.get(r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto Lf
            boolean r1 = r0.booleanValue()
            return r1
        Lf:
            java.lang.reflect.Method[] r1 = r7.getDeclaredMethods(r8)
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L16:
            if (r4 >= r2) goto L2c
            r5 = r1[r4]
            java.lang.Class<androidx.lifecycle.OnLifecycleEvent> r6 = androidx.lifecycle.OnLifecycleEvent.class
            java.lang.annotation.Annotation r6 = r5.getAnnotation(r6)
            androidx.lifecycle.OnLifecycleEvent r6 = (androidx.lifecycle.OnLifecycleEvent) r6
            if (r6 == 0) goto L29
            r7.createInfo(r8, r1)
            r2 = 1
            return r2
        L29:
            int r4 = r4 + 1
            goto L16
        L2c:
            java.util.Map<java.lang.Class<?>, java.lang.Boolean> r2 = r7.mHasLifecycleMethods
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r2.put(r8, r4)
            return r3
    }
}
