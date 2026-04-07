package androidx.lifecycle;

/* JADX INFO: compiled from: Lifecycling.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002J\u001e\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u0014\u0010\u0015\u001a\u00020\u00042\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0001H\u0007J\u0014\u0010\u001a\u001a\u00020\u00042\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\t\u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/Lifecycling;", "", "()V", "GENERATED_CALLBACK", "", "REFLECTIVE_CALLBACK", "callbackCache", "", "Ljava/lang/Class;", "classToAdapters", "", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/GeneratedAdapter;", "createGeneratedAdapter", "constructor", "object", "generatedConstructor", "klass", "getAdapterName", "", "className", "getObserverConstructorType", "isLifecycleParent", "", "lifecycleEventObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "resolveObserverCallbackType", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;
    public static final androidx.lifecycle.Lifecycling INSTANCE = null;
    private static final int REFLECTIVE_CALLBACK = 1;
    private static final java.util.Map<java.lang.Class<?>, java.lang.Integer> callbackCache = null;
    private static final java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> classToAdapters = null;

    static {
            androidx.lifecycle.Lifecycling r0 = new androidx.lifecycle.Lifecycling
            r0.<init>()
            androidx.lifecycle.Lifecycling.INSTANCE = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            androidx.lifecycle.Lifecycling.callbackCache = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            androidx.lifecycle.Lifecycling.classToAdapters = r0
            return
    }

    private Lifecycling() {
            r0 = this;
            r0.<init>()
            return
    }

    private final androidx.lifecycle.GeneratedAdapter createGeneratedAdapter(java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter> r4, java.lang.Object r5) {
            r3 = this;
            java.lang.Object[] r0 = new java.lang.Object[]{r5}     // Catch: java.lang.reflect.InvocationTargetException -> L11 java.lang.InstantiationException -> L1b java.lang.IllegalAccessException -> L25
            java.lang.Object r0 = r4.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L11 java.lang.InstantiationException -> L1b java.lang.IllegalAccessException -> L25
            java.lang.String r1 = "{\n            constructo…tance(`object`)\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L11 java.lang.InstantiationException -> L1b java.lang.IllegalAccessException -> L25
            androidx.lifecycle.GeneratedAdapter r0 = (androidx.lifecycle.GeneratedAdapter) r0     // Catch: java.lang.reflect.InvocationTargetException -> L11 java.lang.InstantiationException -> L1b java.lang.IllegalAccessException -> L25
            return r0
        L11:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.<init>(r2)
            throw r1
        L1b:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.<init>(r2)
            throw r1
        L25:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.<init>(r2)
            throw r1
    }

    private final java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter> generatedConstructor(java.lang.Class<?> r9) {
            r8 = this;
            java.lang.Package r0 = r9.getPackage()     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            java.lang.String r1 = r9.getCanonicalName()     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            if (r0 == 0) goto L10
            java.lang.String r2 = r0.getName()     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            goto L12
        L10:
            java.lang.String r2 = ""
        L12:
            java.lang.String r3 = "fullPackage"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            int r3 = r3.length()     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L24
            r3 = r5
            goto L25
        L24:
            r3 = r4
        L25:
            if (r3 == 0) goto L29
            r3 = r1
            goto L3c
        L29:
            java.lang.String r3 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            int r3 = r2.length()     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            int r3 = r3 + r5
            java.lang.String r3 = r1.substring(r3)     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            java.lang.String r6 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
        L3c:
            java.lang.String r6 = "if (fullPackage.isEmpty(…g(fullPackage.length + 1)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            java.lang.String r3 = getAdapterName(r3)     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            r6 = r2
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            int r6 = r6.length()     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            if (r6 != 0) goto L52
            r6 = r5
            goto L53
        L52:
            r6 = r4
        L53:
            if (r6 == 0) goto L57
            r6 = r3
            goto L6e
        L57:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            r6.<init>()     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            java.lang.StringBuilder r6 = r6.append(r2)     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            r7 = 46
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            java.lang.StringBuilder r6 = r6.append(r3)     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            java.lang.String r6 = r6.toString()     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
        L6e:
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            java.lang.String r7 = "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r7)     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            r7[r4] = r9     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            java.lang.reflect.Constructor r4 = r6.getDeclaredConstructor(r7)     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            boolean r7 = r4.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
            if (r7 != 0) goto L89
            r4.setAccessible(r5)     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.ClassNotFoundException -> L95
        L89:
            goto L98
        L8b:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.<init>(r2)
            throw r1
        L95:
            r0 = move-exception
            r4 = 0
        L98:
            return r4
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getAdapterName(java.lang.String r7) {
            java.lang.String r0 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r5 = 4
            r6 = 0
            java.lang.String r2 = "."
            java.lang.String r3 = "_"
            r4 = 0
            r1 = r7
            java.lang.String r7 = kotlin.text.StringsKt.replace$default(r1, r2, r3, r4, r5, r6)
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r0 = "_LifecycleAdapter"
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            return r7
    }

    private final int getObserverConstructorType(java.lang.Class<?> r5) {
            r4 = this;
            java.util.Map<java.lang.Class<?>, java.lang.Integer> r0 = androidx.lifecycle.Lifecycling.callbackCache
            java.lang.Object r0 = r0.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lf
            int r1 = r0.intValue()
            return r1
        Lf:
            int r1 = r4.resolveObserverCallbackType(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.util.Map<java.lang.Class<?>, java.lang.Integer> r3 = androidx.lifecycle.Lifecycling.callbackCache
            r3.put(r5, r2)
            return r1
    }

    private final boolean isLifecycleParent(java.lang.Class<?> r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            java.lang.Class<androidx.lifecycle.LifecycleObserver> r0 = androidx.lifecycle.LifecycleObserver.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver(java.lang.Object r10) {
            java.lang.String r0 = "object"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            boolean r0 = r10 instanceof androidx.lifecycle.LifecycleEventObserver
            boolean r1 = r10 instanceof androidx.lifecycle.DefaultLifecycleObserver
            if (r0 == 0) goto L1b
            if (r1 == 0) goto L1b
            androidx.lifecycle.DefaultLifecycleObserverAdapter r2 = new androidx.lifecycle.DefaultLifecycleObserverAdapter
            r3 = r10
            androidx.lifecycle.DefaultLifecycleObserver r3 = (androidx.lifecycle.DefaultLifecycleObserver) r3
            r4 = r10
            androidx.lifecycle.LifecycleEventObserver r4 = (androidx.lifecycle.LifecycleEventObserver) r4
            r2.<init>(r3, r4)
            androidx.lifecycle.LifecycleEventObserver r2 = (androidx.lifecycle.LifecycleEventObserver) r2
            return r2
        L1b:
            if (r1 == 0) goto L29
            androidx.lifecycle.DefaultLifecycleObserverAdapter r2 = new androidx.lifecycle.DefaultLifecycleObserverAdapter
            r3 = r10
            androidx.lifecycle.DefaultLifecycleObserver r3 = (androidx.lifecycle.DefaultLifecycleObserver) r3
            r4 = 0
            r2.<init>(r3, r4)
            androidx.lifecycle.LifecycleEventObserver r2 = (androidx.lifecycle.LifecycleEventObserver) r2
            return r2
        L29:
            if (r0 == 0) goto L2f
            r2 = r10
            androidx.lifecycle.LifecycleEventObserver r2 = (androidx.lifecycle.LifecycleEventObserver) r2
            return r2
        L2f:
            java.lang.Class r2 = r10.getClass()
            androidx.lifecycle.Lifecycling r3 = androidx.lifecycle.Lifecycling.INSTANCE
            int r3 = r3.getObserverConstructorType(r2)
            r4 = 2
            if (r3 != r4) goto L84
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r4 = androidx.lifecycle.Lifecycling.classToAdapters
            java.lang.Object r4 = r4.get(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            java.util.List r4 = (java.util.List) r4
            int r5 = r4.size()
            r6 = 0
            r7 = 1
            if (r5 != r7) goto L63
            androidx.lifecycle.Lifecycling r5 = androidx.lifecycle.Lifecycling.INSTANCE
            java.lang.Object r6 = r4.get(r6)
            java.lang.reflect.Constructor r6 = (java.lang.reflect.Constructor) r6
            androidx.lifecycle.GeneratedAdapter r5 = r5.createGeneratedAdapter(r6, r10)
            androidx.lifecycle.SingleGeneratedAdapterObserver r6 = new androidx.lifecycle.SingleGeneratedAdapterObserver
            r6.<init>(r5)
            androidx.lifecycle.LifecycleEventObserver r6 = (androidx.lifecycle.LifecycleEventObserver) r6
            return r6
        L63:
            int r5 = r4.size()
            androidx.lifecycle.GeneratedAdapter[] r7 = new androidx.lifecycle.GeneratedAdapter[r5]
        L69:
            if (r6 >= r5) goto L7c
            androidx.lifecycle.Lifecycling r8 = androidx.lifecycle.Lifecycling.INSTANCE
            java.lang.Object r9 = r4.get(r6)
            java.lang.reflect.Constructor r9 = (java.lang.reflect.Constructor) r9
            androidx.lifecycle.GeneratedAdapter r8 = r8.createGeneratedAdapter(r9, r10)
            r7[r6] = r8
            int r6 = r6 + 1
            goto L69
        L7c:
            androidx.lifecycle.CompositeGeneratedAdaptersObserver r5 = new androidx.lifecycle.CompositeGeneratedAdaptersObserver
            r5.<init>(r7)
            androidx.lifecycle.LifecycleEventObserver r5 = (androidx.lifecycle.LifecycleEventObserver) r5
            return r5
        L84:
            androidx.lifecycle.ReflectiveGenericLifecycleObserver r4 = new androidx.lifecycle.ReflectiveGenericLifecycleObserver
            r4.<init>(r10)
            androidx.lifecycle.LifecycleEventObserver r4 = (androidx.lifecycle.LifecycleEventObserver) r4
            return r4
    }

    private final int resolveObserverCallbackType(java.lang.Class<?> r12) {
            r11 = this;
            java.lang.String r0 = r12.getCanonicalName()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.reflect.Constructor r0 = r11.generatedConstructor(r12)
            r2 = 2
            if (r0 == 0) goto L19
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r1 = androidx.lifecycle.Lifecycling.classToAdapters
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r0)
            r1.put(r12, r3)
            return r2
        L19:
            androidx.lifecycle.ClassesInfoCache r3 = androidx.lifecycle.ClassesInfoCache.sInstance
            boolean r3 = r3.hasLifecycleMethods(r12)
            if (r3 == 0) goto L22
            return r1
        L22:
            java.lang.Class r4 = r12.getSuperclass()
            r5 = 0
            boolean r6 = r11.isLifecycleParent(r4)
            if (r6 == 0) goto L4c
            java.lang.String r6 = "superclass"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
            int r6 = r11.getObserverConstructorType(r4)
            if (r6 != r1) goto L39
            return r1
        L39:
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r7 = androidx.lifecycle.Lifecycling.classToAdapters
            java.lang.Object r7 = r7.get(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            java.util.Collection r7 = (java.util.Collection) r7
            r6.<init>(r7)
            r5 = r6
            java.util.List r5 = (java.util.List) r5
        L4c:
            java.lang.Class[] r6 = r12.getInterfaces()
            java.lang.String r7 = "klass.interfaces"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            int r7 = r6.length
            r8 = 0
        L57:
            if (r8 >= r7) goto L89
            r9 = r6[r8]
            boolean r10 = r11.isLifecycleParent(r9)
            if (r10 != 0) goto L62
            goto L86
        L62:
            java.lang.String r10 = "intrface"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            int r10 = r11.getObserverConstructorType(r9)
            if (r10 != r1) goto L6e
            return r1
        L6e:
            if (r5 != 0) goto L78
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r5 = r10
            java.util.List r5 = (java.util.List) r5
        L78:
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r10 = androidx.lifecycle.Lifecycling.classToAdapters
            java.lang.Object r10 = r10.get(r9)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            java.util.Collection r10 = (java.util.Collection) r10
            r5.addAll(r10)
        L86:
            int r8 = r8 + 1
            goto L57
        L89:
            if (r5 == 0) goto L91
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r1 = androidx.lifecycle.Lifecycling.classToAdapters
            r1.put(r12, r5)
            return r2
        L91:
            return r1
    }
}
