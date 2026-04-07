package androidx.fragment.app;

/* JADX INFO: compiled from: FragmentLifecycleCallbacksDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ \u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ \u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001e\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u001b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ(\u0010\u001c\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u001f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000fJ\u000e\u0010$\u001a\u00020\t2\u0006\u0010!\u001a\u00020\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Landroidx/fragment/app/FragmentLifecycleCallbacksDispatcher;", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Landroidx/fragment/app/FragmentManager;)V", "lifecycleCallbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/fragment/app/FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder;", "dispatchOnFragmentActivityCreated", "", "f", "Landroidx/fragment/app/Fragment;", "savedInstanceState", "Landroid/os/Bundle;", "onlyRecursive", "", "dispatchOnFragmentAttached", "dispatchOnFragmentCreated", "dispatchOnFragmentDestroyed", "dispatchOnFragmentDetached", "dispatchOnFragmentPaused", "dispatchOnFragmentPreAttached", "dispatchOnFragmentPreCreated", "dispatchOnFragmentResumed", "dispatchOnFragmentSaveInstanceState", "outState", "dispatchOnFragmentStarted", "dispatchOnFragmentStopped", "dispatchOnFragmentViewCreated", "v", "Landroid/view/View;", "dispatchOnFragmentViewDestroyed", "registerFragmentLifecycleCallbacks", "cb", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "recursive", "unregisterFragmentLifecycleCallbacks", "FragmentLifecycleCallbacksHolder", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FragmentLifecycleCallbacksDispatcher {
    private final androidx.fragment.app.FragmentManager fragmentManager;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder> lifecycleCallbacks;

    /* JADX INFO: compiled from: FragmentLifecycleCallbacksDispatcher.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder;", "", "callback", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "recursive", "", "(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;Z)V", "getCallback", "()Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "getRecursive", "()Z", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class FragmentLifecycleCallbacksHolder {
        private final androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks callback;
        private final boolean recursive;

        public FragmentLifecycleCallbacksHolder(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r2, boolean r3) {
                r1 = this;
                java.lang.String r0 = "callback"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.callback = r2
                r1.recursive = r3
                return
        }

        public final androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks getCallback() {
                r1 = this;
                androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r0 = r1.callback
                return r0
        }

        public final boolean getRecursive() {
                r1 = this;
                boolean r0 = r1.recursive
                return r0
        }
    }

    public FragmentLifecycleCallbacksDispatcher(androidx.fragment.app.FragmentManager r2) {
            r1 = this;
            java.lang.String r0 = "fragmentManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.fragmentManager = r2
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.lifecycleCallbacks = r0
            return
    }

    public final void dispatchOnFragmentActivityCreated(androidx.fragment.app.Fragment r6, android.os.Bundle r7, boolean r8) {
            r5 = this;
            java.lang.String r0 = "f"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.fragment.app.FragmentManager r0 = r5.fragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L1e
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            java.lang.String r2 = "parent.getParentFragmentManager()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentActivityCreated(r6, r7, r3)
        L1e:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.lifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r8 == 0) goto L38
            boolean r3 = r2.getRecursive()
            if (r3 == 0) goto L24
        L38:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.getCallback()
            androidx.fragment.app.FragmentManager r4 = r5.fragmentManager
            r3.onFragmentActivityCreated(r4, r6, r7)
            goto L24
        L42:
            return
    }

    public final void dispatchOnFragmentAttached(androidx.fragment.app.Fragment r7, boolean r8) {
            r6 = this;
            java.lang.String r0 = "f"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            androidx.fragment.app.FragmentManager r0 = r6.fragmentManager
            androidx.fragment.app.FragmentHostCallback r0 = r0.getHost()
            android.content.Context r0 = r0.getContext()
            androidx.fragment.app.FragmentManager r1 = r6.fragmentManager
            androidx.fragment.app.Fragment r1 = r1.getParent()
            if (r1 == 0) goto L28
            androidx.fragment.app.FragmentManager r2 = r1.getParentFragmentManager()
            java.lang.String r3 = "parent.getParentFragmentManager()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r3 = r2.getLifecycleCallbacksDispatcher()
            r4 = 1
            r3.dispatchOnFragmentAttached(r7, r4)
        L28:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r2 = r6.lifecycleCallbacks
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r3 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r3
            if (r8 == 0) goto L42
            boolean r4 = r3.getRecursive()
            if (r4 == 0) goto L2e
        L42:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r4 = r3.getCallback()
            androidx.fragment.app.FragmentManager r5 = r6.fragmentManager
            r4.onFragmentAttached(r5, r7, r0)
            goto L2e
        L4c:
            return
    }

    public final void dispatchOnFragmentCreated(androidx.fragment.app.Fragment r6, android.os.Bundle r7, boolean r8) {
            r5 = this;
            java.lang.String r0 = "f"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.fragment.app.FragmentManager r0 = r5.fragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L1e
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            java.lang.String r2 = "parent.getParentFragmentManager()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentCreated(r6, r7, r3)
        L1e:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.lifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r8 == 0) goto L38
            boolean r3 = r2.getRecursive()
            if (r3 == 0) goto L24
        L38:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.getCallback()
            androidx.fragment.app.FragmentManager r4 = r5.fragmentManager
            r3.onFragmentCreated(r4, r6, r7)
            goto L24
        L42:
            return
    }

    public final void dispatchOnFragmentDestroyed(androidx.fragment.app.Fragment r6, boolean r7) {
            r5 = this;
            java.lang.String r0 = "f"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.fragment.app.FragmentManager r0 = r5.fragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L1e
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            java.lang.String r2 = "parent.getParentFragmentManager()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentDestroyed(r6, r3)
        L1e:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.lifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r7 == 0) goto L38
            boolean r3 = r2.getRecursive()
            if (r3 == 0) goto L24
        L38:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.getCallback()
            androidx.fragment.app.FragmentManager r4 = r5.fragmentManager
            r3.onFragmentDestroyed(r4, r6)
            goto L24
        L42:
            return
    }

    public final void dispatchOnFragmentDetached(androidx.fragment.app.Fragment r6, boolean r7) {
            r5 = this;
            java.lang.String r0 = "f"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.fragment.app.FragmentManager r0 = r5.fragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L1e
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            java.lang.String r2 = "parent.getParentFragmentManager()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentDetached(r6, r3)
        L1e:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.lifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r7 == 0) goto L38
            boolean r3 = r2.getRecursive()
            if (r3 == 0) goto L24
        L38:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.getCallback()
            androidx.fragment.app.FragmentManager r4 = r5.fragmentManager
            r3.onFragmentDetached(r4, r6)
            goto L24
        L42:
            return
    }

    public final void dispatchOnFragmentPaused(androidx.fragment.app.Fragment r6, boolean r7) {
            r5 = this;
            java.lang.String r0 = "f"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.fragment.app.FragmentManager r0 = r5.fragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L1e
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            java.lang.String r2 = "parent.getParentFragmentManager()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentPaused(r6, r3)
        L1e:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.lifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r7 == 0) goto L38
            boolean r3 = r2.getRecursive()
            if (r3 == 0) goto L24
        L38:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.getCallback()
            androidx.fragment.app.FragmentManager r4 = r5.fragmentManager
            r3.onFragmentPaused(r4, r6)
            goto L24
        L42:
            return
    }

    public final void dispatchOnFragmentPreAttached(androidx.fragment.app.Fragment r7, boolean r8) {
            r6 = this;
            java.lang.String r0 = "f"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            androidx.fragment.app.FragmentManager r0 = r6.fragmentManager
            androidx.fragment.app.FragmentHostCallback r0 = r0.getHost()
            android.content.Context r0 = r0.getContext()
            androidx.fragment.app.FragmentManager r1 = r6.fragmentManager
            androidx.fragment.app.Fragment r1 = r1.getParent()
            if (r1 == 0) goto L28
            androidx.fragment.app.FragmentManager r2 = r1.getParentFragmentManager()
            java.lang.String r3 = "parent.getParentFragmentManager()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r3 = r2.getLifecycleCallbacksDispatcher()
            r4 = 1
            r3.dispatchOnFragmentPreAttached(r7, r4)
        L28:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r2 = r6.lifecycleCallbacks
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r3 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r3
            if (r8 == 0) goto L42
            boolean r4 = r3.getRecursive()
            if (r4 == 0) goto L2e
        L42:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r4 = r3.getCallback()
            androidx.fragment.app.FragmentManager r5 = r6.fragmentManager
            r4.onFragmentPreAttached(r5, r7, r0)
            goto L2e
        L4c:
            return
    }

    public final void dispatchOnFragmentPreCreated(androidx.fragment.app.Fragment r6, android.os.Bundle r7, boolean r8) {
            r5 = this;
            java.lang.String r0 = "f"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.fragment.app.FragmentManager r0 = r5.fragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L1e
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            java.lang.String r2 = "parent.getParentFragmentManager()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentPreCreated(r6, r7, r3)
        L1e:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.lifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r8 == 0) goto L38
            boolean r3 = r2.getRecursive()
            if (r3 == 0) goto L24
        L38:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.getCallback()
            androidx.fragment.app.FragmentManager r4 = r5.fragmentManager
            r3.onFragmentPreCreated(r4, r6, r7)
            goto L24
        L42:
            return
    }

    public final void dispatchOnFragmentResumed(androidx.fragment.app.Fragment r6, boolean r7) {
            r5 = this;
            java.lang.String r0 = "f"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.fragment.app.FragmentManager r0 = r5.fragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L1e
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            java.lang.String r2 = "parent.getParentFragmentManager()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentResumed(r6, r3)
        L1e:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.lifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r7 == 0) goto L38
            boolean r3 = r2.getRecursive()
            if (r3 == 0) goto L24
        L38:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.getCallback()
            androidx.fragment.app.FragmentManager r4 = r5.fragmentManager
            r3.onFragmentResumed(r4, r6)
            goto L24
        L42:
            return
    }

    public final void dispatchOnFragmentSaveInstanceState(androidx.fragment.app.Fragment r6, android.os.Bundle r7, boolean r8) {
            r5 = this;
            java.lang.String r0 = "f"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "outState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            androidx.fragment.app.FragmentManager r0 = r5.fragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L23
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            java.lang.String r2 = "parent.getParentFragmentManager()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentSaveInstanceState(r6, r7, r3)
        L23:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.lifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L29:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r8 == 0) goto L3d
            boolean r3 = r2.getRecursive()
            if (r3 == 0) goto L29
        L3d:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.getCallback()
            androidx.fragment.app.FragmentManager r4 = r5.fragmentManager
            r3.onFragmentSaveInstanceState(r4, r6, r7)
            goto L29
        L47:
            return
    }

    public final void dispatchOnFragmentStarted(androidx.fragment.app.Fragment r6, boolean r7) {
            r5 = this;
            java.lang.String r0 = "f"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.fragment.app.FragmentManager r0 = r5.fragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L1e
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            java.lang.String r2 = "parent.getParentFragmentManager()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentStarted(r6, r3)
        L1e:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.lifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r7 == 0) goto L38
            boolean r3 = r2.getRecursive()
            if (r3 == 0) goto L24
        L38:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.getCallback()
            androidx.fragment.app.FragmentManager r4 = r5.fragmentManager
            r3.onFragmentStarted(r4, r6)
            goto L24
        L42:
            return
    }

    public final void dispatchOnFragmentStopped(androidx.fragment.app.Fragment r6, boolean r7) {
            r5 = this;
            java.lang.String r0 = "f"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.fragment.app.FragmentManager r0 = r5.fragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L1e
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            java.lang.String r2 = "parent.getParentFragmentManager()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentStopped(r6, r3)
        L1e:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.lifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r7 == 0) goto L38
            boolean r3 = r2.getRecursive()
            if (r3 == 0) goto L24
        L38:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.getCallback()
            androidx.fragment.app.FragmentManager r4 = r5.fragmentManager
            r3.onFragmentStopped(r4, r6)
            goto L24
        L42:
            return
    }

    public final void dispatchOnFragmentViewCreated(androidx.fragment.app.Fragment r6, android.view.View r7, android.os.Bundle r8, boolean r9) {
            r5 = this;
            java.lang.String r0 = "f"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "v"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            androidx.fragment.app.FragmentManager r0 = r5.fragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L23
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            java.lang.String r2 = "parent.getParentFragmentManager()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentViewCreated(r6, r7, r8, r3)
        L23:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.lifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L29:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r9 == 0) goto L3d
            boolean r3 = r2.getRecursive()
            if (r3 == 0) goto L29
        L3d:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.getCallback()
            androidx.fragment.app.FragmentManager r4 = r5.fragmentManager
            r3.onFragmentViewCreated(r4, r6, r7, r8)
            goto L29
        L47:
            return
    }

    public final void dispatchOnFragmentViewDestroyed(androidx.fragment.app.Fragment r6, boolean r7) {
            r5 = this;
            java.lang.String r0 = "f"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.fragment.app.FragmentManager r0 = r5.fragmentManager
            androidx.fragment.app.Fragment r0 = r0.getParent()
            if (r0 == 0) goto L1e
            androidx.fragment.app.FragmentManager r1 = r0.getParentFragmentManager()
            java.lang.String r2 = "parent.getParentFragmentManager()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r1.getLifecycleCallbacksDispatcher()
            r3 = 1
            r2.dispatchOnFragmentViewDestroyed(r6, r3)
        L1e:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r1 = r5.lifecycleCallbacks
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r2 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r2
            if (r7 == 0) goto L38
            boolean r3 = r2.getRecursive()
            if (r3 == 0) goto L24
        L38:
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r3 = r2.getCallback()
            androidx.fragment.app.FragmentManager r4 = r5.fragmentManager
            r3.onFragmentViewDestroyed(r4, r6)
            goto L24
        L42:
            return
    }

    public final void registerFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "cb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r0 = r2.lifecycleCallbacks
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r1 = new androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder
            r1.<init>(r3, r4)
            r0.add(r1)
            return
    }

    public final void unregisterFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r6) {
            r5 = this;
            java.lang.String r0 = "cb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r0 = r5.lifecycleCallbacks
            monitor-enter(r0)
            r1 = 0
            r2 = 0
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r3 = r5.lifecycleCallbacks     // Catch: java.lang.Throwable -> L2e
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L2e
        L10:
            if (r2 >= r3) goto L29
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r4 = r5.lifecycleCallbacks     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L2e
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder r4 = (androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder) r4     // Catch: java.lang.Throwable -> L2e
            androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks r4 = r4.getCallback()     // Catch: java.lang.Throwable -> L2e
            if (r4 != r6) goto L26
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder> r4 = r5.lifecycleCallbacks     // Catch: java.lang.Throwable -> L2e
            r4.remove(r2)     // Catch: java.lang.Throwable -> L2e
            goto L29
        L26:
            int r2 = r2 + 1
            goto L10
        L29:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)
            return
        L2e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
