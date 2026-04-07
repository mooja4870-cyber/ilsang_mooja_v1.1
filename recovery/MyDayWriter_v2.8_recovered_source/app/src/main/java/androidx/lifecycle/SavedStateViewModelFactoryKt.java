package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a6\u0010\u0004\u001a\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00022\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001H\u0000\u001aI\u0010\t\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00052\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0000¢\u0006\u0002\u0010\u000f\"\u0018\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"ANDROID_VIEWMODEL_SIGNATURE", "", "Ljava/lang/Class;", "VIEWMODEL_SIGNATURE", "findMatchingConstructor", "Ljava/lang/reflect/Constructor;", "T", "modelClass", "signature", "newInstance", "Landroidx/lifecycle/ViewModel;", "constructor", "params", "", "", "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SavedStateViewModelFactoryKt {
    private static final java.util.List<java.lang.Class<?>> ANDROID_VIEWMODEL_SIGNATURE = null;
    private static final java.util.List<java.lang.Class<?>> VIEWMODEL_SIGNATURE = null;

    static {
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<androidx.lifecycle.SavedStateHandle> r2 = androidx.lifecycle.SavedStateHandle.class
            r0[r1] = r2
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            androidx.lifecycle.SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE = r0
            java.lang.Class<androidx.lifecycle.SavedStateHandle> r0 = androidx.lifecycle.SavedStateHandle.class
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            androidx.lifecycle.SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE = r0
            return
    }

    public static final /* synthetic */ java.util.List access$getANDROID_VIEWMODEL_SIGNATURE$p() {
            java.util.List<java.lang.Class<?>> r0 = androidx.lifecycle.SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE
            return r0
    }

    public static final /* synthetic */ java.util.List access$getVIEWMODEL_SIGNATURE$p() {
            java.util.List<java.lang.Class<?>> r0 = androidx.lifecycle.SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE
            return r0
    }

    public static final <T> java.lang.reflect.Constructor<T> findMatchingConstructor(java.lang.Class<T> r7, java.util.List<? extends java.lang.Class<?>> r8) {
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "signature"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.reflect.Constructor[] r0 = r7.getConstructors()
            java.lang.String r1 = "modelClass.constructors"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = r0.length
            r2 = 0
        L15:
            if (r2 >= r1) goto L73
            r3 = r0[r2]
            java.lang.Class[] r4 = r3.getParameterTypes()
            java.lang.String r5 = "constructor.parameterTypes"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.util.List r4 = kotlin.collections.ArraysKt.toList(r4)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r4)
            if (r5 == 0) goto L34
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r0)
            return r3
        L34:
            int r5 = r8.size()
            int r6 = r4.size()
            if (r5 != r6) goto L70
            r5 = r8
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r4.containsAll(r5)
            if (r5 != 0) goto L48
            goto L70
        L48:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Class "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r7.getSimpleName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " must have parameters in the proper order: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L70:
            int r2 = r2 + 1
            goto L15
        L73:
            r0 = 0
            return r0
    }

    public static final <T extends androidx.lifecycle.ViewModel> T newInstance(java.lang.Class<T> r4, java.lang.reflect.Constructor<T> r5, java.lang.Object... r6) {
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "constructor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r6.length     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.InstantiationException -> L3a java.lang.IllegalAccessException -> L5d
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r6, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.InstantiationException -> L3a java.lang.IllegalAccessException -> L5d
            java.lang.Object r0 = r5.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.InstantiationException -> L3a java.lang.IllegalAccessException -> L5d
            androidx.lifecycle.ViewModel r0 = (androidx.lifecycle.ViewModel) r0     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.InstantiationException -> L3a java.lang.IllegalAccessException -> L5d
            return r0
        L1c:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "An exception happened in constructor of "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Throwable r3 = r0.getCause()
            r1.<init>(r2, r3)
            throw r1
        L3a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "A "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = " cannot be instantiated."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r0
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r1.<init>(r2, r3)
            throw r1
        L5d:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to access "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3 = r0
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r1.<init>(r2, r3)
            throw r1
    }
}
