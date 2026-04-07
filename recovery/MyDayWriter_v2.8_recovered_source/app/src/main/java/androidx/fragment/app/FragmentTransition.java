package androidx.fragment.app;

/* JADX INFO: compiled from: FragmentTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0007J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0002J\u001e\u0010\u0013\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\b\u0010\u0018\u001a\u00020\fH\u0007J\"\u0010\u0019\u001a\u0004\u0018\u00010\u000f*\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u001a\u001a\u00020\u000fH\u0007J,\u0010\u001b\u001a\u00020\u0007*\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/fragment/app/FragmentTransition;", "", "()V", "PLATFORM_IMPL", "Landroidx/fragment/app/FragmentTransitionImpl;", "SUPPORT_IMPL", "callSharedElementStartEnd", "", "inFragment", "Landroidx/fragment/app/Fragment;", "outFragment", "isPop", "", "sharedElements", "Landroidx/collection/ArrayMap;", "", "Landroid/view/View;", "isStart", "resolveSupportImpl", "setViewVisibility", "views", "", "visibility", "", "supportsTransition", "findKeyForValue", "value", "retainValues", "namedViews", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FragmentTransition {
    public static final androidx.fragment.app.FragmentTransition INSTANCE = null;
    public static final androidx.fragment.app.FragmentTransitionImpl PLATFORM_IMPL = null;
    public static final androidx.fragment.app.FragmentTransitionImpl SUPPORT_IMPL = null;

    static {
            androidx.fragment.app.FragmentTransition r0 = new androidx.fragment.app.FragmentTransition
            r0.<init>()
            androidx.fragment.app.FragmentTransition.INSTANCE = r0
            androidx.fragment.app.FragmentTransitionCompat21 r0 = new androidx.fragment.app.FragmentTransitionCompat21
            r0.<init>()
            androidx.fragment.app.FragmentTransitionImpl r0 = (androidx.fragment.app.FragmentTransitionImpl) r0
            androidx.fragment.app.FragmentTransition.PLATFORM_IMPL = r0
            androidx.fragment.app.FragmentTransition r0 = androidx.fragment.app.FragmentTransition.INSTANCE
            androidx.fragment.app.FragmentTransitionImpl r0 = r0.resolveSupportImpl()
            androidx.fragment.app.FragmentTransition.SUPPORT_IMPL = r0
            return
    }

    private FragmentTransition() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void callSharedElementStartEnd(androidx.fragment.app.Fragment r13, androidx.fragment.app.Fragment r14, boolean r15, androidx.collection.ArrayMap<java.lang.String, android.view.View> r16, boolean r17) {
            r0 = r16
            java.lang.String r1 = "inFragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            java.lang.String r1 = "outFragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            java.lang.String r1 = "sharedElements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            if (r15 == 0) goto L18
            androidx.core.app.SharedElementCallback r1 = r14.getEnterTransitionCallback()
            goto L1c
        L18:
            androidx.core.app.SharedElementCallback r1 = r13.getEnterTransitionCallback()
        L1c:
            if (r1 == 0) goto L95
            r2 = r0
            java.util.Map r2 = (java.util.Map) r2
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r2.size()
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r6 = 0
            java.util.Set r7 = r5.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L38:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L50
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            r9 = r8
            r10 = 0
            java.lang.Object r11 = r9.getValue()
            android.view.View r11 = (android.view.View) r11
            r4.add(r11)
            goto L38
        L50:
            java.util.List r4 = (java.util.List) r4
            r2 = r0
            java.util.Map r2 = (java.util.Map) r2
            r3 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r2.size()
            r5.<init>(r6)
            java.util.Collection r5 = (java.util.Collection) r5
            r6 = r2
            r7 = 0
            java.util.Set r8 = r6.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L6e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L86
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            r10 = r9
            r11 = 0
            java.lang.Object r12 = r10.getKey()
            java.lang.String r12 = (java.lang.String) r12
            r5.add(r12)
            goto L6e
        L86:
            java.util.List r5 = (java.util.List) r5
            r2 = 0
            if (r17 == 0) goto L92
            r1.onSharedElementStart(r5, r4, r2)
            goto L95
        L92:
            r1.onSharedElementEnd(r5, r4, r2)
        L95:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String findKeyForValue(androidx.collection.ArrayMap<java.lang.String, java.lang.String> r10, java.lang.String r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = r10
            java.util.Map r0 = (java.util.Map) r0
            r1 = 0
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Map r2 = (java.util.Map) r2
            r3 = r0
            r4 = 0
            java.util.Set r5 = r3.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L1f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L43
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            r7 = r6
            r8 = 0
            java.lang.Object r9 = r7.getValue()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r11)
            if (r7 == 0) goto L1f
            java.lang.Object r7 = r6.getKey()
            java.lang.Object r8 = r6.getValue()
            r2.put(r7, r8)
            goto L1f
        L43:
            r0 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r2.size()
            r1.<init>(r3)
            java.util.Collection r1 = (java.util.Collection) r1
            r3 = r2
            r4 = 0
            java.util.Set r5 = r3.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L5c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L74
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            r7 = r6
            r8 = 0
            java.lang.Object r9 = r7.getKey()
            java.lang.String r9 = (java.lang.String) r9
            r1.add(r9)
            goto L5c
        L74:
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    private final androidx.fragment.app.FragmentTransitionImpl resolveSupportImpl() {
            r3 = this;
            java.lang.String r0 = "androidx.transition.FragmentTransitionSupport"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1c
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)     // Catch: java.lang.Exception -> L1c
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L1c
            java.lang.reflect.Constructor r2 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L1c
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1c
            java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.Exception -> L1c
            androidx.fragment.app.FragmentTransitionImpl r1 = (androidx.fragment.app.FragmentTransitionImpl) r1     // Catch: java.lang.Exception -> L1c
            goto L1e
        L1c:
            r0 = move-exception
            r1 = 0
        L1e:
            return r1
    }

    @kotlin.jvm.JvmStatic
    public static final void retainValues(androidx.collection.ArrayMap<java.lang.String, java.lang.String> r3, androidx.collection.ArrayMap<java.lang.String, android.view.View> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "namedViews"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.size()
            int r0 = r0 + (-1)
        L10:
            r1 = -1
            if (r1 >= r0) goto L25
            java.lang.Object r1 = r3.valueAt(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r4.containsKey(r1)
            if (r2 != 0) goto L22
            r3.removeAt(r0)
        L22:
            int r0 = r0 + (-1)
            goto L10
        L25:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void setViewVisibility(java.util.List<? extends android.view.View> r6, int r7) {
            java.lang.String r0 = "views"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        Ld:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L21
            java.lang.Object r3 = r2.next()
            r4 = r3
            android.view.View r4 = (android.view.View) r4
            r5 = 0
            r4.setVisibility(r7)
            goto Ld
        L21:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final boolean supportsTransition() {
            androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
            if (r0 != 0) goto Lb
            androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }
}
