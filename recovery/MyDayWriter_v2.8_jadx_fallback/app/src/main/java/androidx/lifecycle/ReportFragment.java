package androidx.lifecycle;

/* JADX INFO: compiled from: ReportFragment.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 \u00172\u00020\u0001:\u0003\u0016\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/ReportFragment;", "Landroid/app/Fragment;", "()V", "processListener", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "dispatch", "", "event", "Landroidx/lifecycle/Lifecycle$Event;", "dispatchCreate", "listener", "dispatchResume", "dispatchStart", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onStart", "onStop", "setProcessListener", "ActivityInitializationListener", "Companion", "LifecycleCallbacks", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ReportFragment extends android.app.Fragment {
    public static final androidx.lifecycle.ReportFragment.Companion Companion = null;
    private static final java.lang.String REPORT_FRAGMENT_TAG = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
    private androidx.lifecycle.ReportFragment.ActivityInitializationListener processListener;

    /* JADX INFO: compiled from: ReportFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "", "onCreate", "", "onResume", "onStart", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ActivityInitializationListener {
        void onCreate();

        void onResume();

        void onStart();
    }

    /* JADX INFO: compiled from: ReportFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\u00078GX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/ReportFragment$Companion;", "", "()V", "REPORT_FRAGMENT_TAG", "", "reportFragment", "Landroidx/lifecycle/ReportFragment;", "Landroid/app/Activity;", "get$annotations", "(Landroid/app/Activity;)V", "get", "(Landroid/app/Activity;)Landroidx/lifecycle/ReportFragment;", "dispatch", "", "activity", "event", "Landroidx/lifecycle/Lifecycle$Event;", "dispatch$lifecycle_runtime_release", "injectIfNeededIn", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        public static /* synthetic */ void get$annotations(android.app.Activity r0) {
                return
        }

        @kotlin.jvm.JvmStatic
        public final void dispatch$lifecycle_runtime_release(android.app.Activity r3, androidx.lifecycle.Lifecycle.Event r4) {
                r2 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "event"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                boolean r0 = r3 instanceof androidx.lifecycle.LifecycleRegistryOwner
                if (r0 == 0) goto L19
                r0 = r3
                androidx.lifecycle.LifecycleRegistryOwner r0 = (androidx.lifecycle.LifecycleRegistryOwner) r0
                androidx.lifecycle.LifecycleRegistry r0 = r0.getLifecycle()
                r0.handleLifecycleEvent(r4)
                return
            L19:
                boolean r0 = r3 instanceof androidx.lifecycle.LifecycleOwner
                if (r0 == 0) goto L2e
                r0 = r3
                androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
                androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
                boolean r1 = r0 instanceof androidx.lifecycle.LifecycleRegistry
                if (r1 == 0) goto L2e
                r1 = r0
                androidx.lifecycle.LifecycleRegistry r1 = (androidx.lifecycle.LifecycleRegistry) r1
                r1.handleLifecycleEvent(r4)
            L2e:
                return
        }

        public final androidx.lifecycle.ReportFragment get(android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                android.app.FragmentManager r0 = r3.getFragmentManager()
                java.lang.String r1 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
                android.app.Fragment r0 = r0.findFragmentByTag(r1)
                java.lang.String r1 = "null cannot be cast to non-null type androidx.lifecycle.ReportFragment"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
                androidx.lifecycle.ReportFragment r0 = (androidx.lifecycle.ReportFragment) r0
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final void injectIfNeededIn(android.app.Activity r5) {
                r4 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L10
                androidx.lifecycle.ReportFragment$LifecycleCallbacks$Companion r0 = androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion
                r0.registerIn(r5)
            L10:
                android.app.FragmentManager r0 = r5.getFragmentManager()
                java.lang.String r1 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
                android.app.Fragment r2 = r0.findFragmentByTag(r1)
                if (r2 != 0) goto L31
                android.app.FragmentTransaction r2 = r0.beginTransaction()
                androidx.lifecycle.ReportFragment r3 = new androidx.lifecycle.ReportFragment
                r3.<init>()
                android.app.Fragment r3 = (android.app.Fragment) r3
                android.app.FragmentTransaction r1 = r2.add(r3, r1)
                r1.commit()
                r0.executePendingTransactions()
            L31:
                return
        }
    }

    /* JADX INFO: compiled from: ReportFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/ReportFragment$LifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "bundle", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityPostCreated", "savedInstanceState", "onActivityPostResumed", "onActivityPostStarted", "onActivityPreDestroyed", "onActivityPrePaused", "onActivityPreStopped", "onActivityResumed", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "Companion", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
        public static final androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion Companion = null;

        /* JADX INFO: compiled from: ReportFragment.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/ReportFragment$LifecycleCallbacks$Companion;", "", "()V", "registerIn", "", "activity", "Landroid/app/Activity;", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @kotlin.jvm.JvmStatic
            public final void registerIn(android.app.Activity r2) {
                    r1 = this;
                    java.lang.String r0 = "activity"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    androidx.lifecycle.ReportFragment$LifecycleCallbacks r0 = new androidx.lifecycle.ReportFragment$LifecycleCallbacks
                    r0.<init>()
                    android.app.Application$ActivityLifecycleCallbacks r0 = (android.app.Application.ActivityLifecycleCallbacks) r0
                    r2.registerActivityLifecycleCallbacks(r0)
                    return
            }
        }

        static {
                androidx.lifecycle.ReportFragment$LifecycleCallbacks$Companion r0 = new androidx.lifecycle.ReportFragment$LifecycleCallbacks$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion = r0
                return
        }

        public LifecycleCallbacks() {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        public static final void registerIn(android.app.Activity r1) {
                androidx.lifecycle.ReportFragment$LifecycleCallbacks$Companion r0 = androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion
                r0.registerIn(r1)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r2, android.os.Bundle r3) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(android.app.Activity r3, android.os.Bundle r4) {
                r2 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
                r0.dispatch$lifecycle_runtime_release(r3, r1)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
                r0.dispatch$lifecycle_runtime_release(r3, r1)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
                r0.dispatch$lifecycle_runtime_release(r3, r1)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                r0.dispatch$lifecycle_runtime_release(r3, r1)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
                r0.dispatch$lifecycle_runtime_release(r3, r1)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                r0.dispatch$lifecycle_runtime_release(r3, r1)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity r2, android.os.Bundle r3) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "bundle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                return
        }
    }

    static {
            androidx.lifecycle.ReportFragment$Companion r0 = new androidx.lifecycle.ReportFragment$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.ReportFragment.Companion = r0
            return
    }

    public ReportFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void dispatch(androidx.lifecycle.Lifecycle.Event r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L14
            androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
            android.app.Activity r1 = r3.getActivity()
            java.lang.String r2 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.dispatch$lifecycle_runtime_release(r1, r4)
        L14:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void dispatch$lifecycle_runtime_release(android.app.Activity r1, androidx.lifecycle.Lifecycle.Event r2) {
            androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
            r0.dispatch$lifecycle_runtime_release(r1, r2)
            return
    }

    private final void dispatchCreate(androidx.lifecycle.ReportFragment.ActivityInitializationListener r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.onCreate()
        L5:
            return
    }

    private final void dispatchResume(androidx.lifecycle.ReportFragment.ActivityInitializationListener r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.onResume()
        L5:
            return
    }

    private final void dispatchStart(androidx.lifecycle.ReportFragment.ActivityInitializationListener r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.onStart()
        L5:
            return
    }

    public static final androidx.lifecycle.ReportFragment get(android.app.Activity r1) {
            androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
            androidx.lifecycle.ReportFragment r0 = r0.get(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final void injectIfNeededIn(android.app.Activity r1) {
            androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
            r0.injectIfNeededIn(r1)
            return
    }

    @Override // android.app.Fragment
    public void onActivityCreated(android.os.Bundle r2) {
            r1 = this;
            super.onActivityCreated(r2)
            androidx.lifecycle.ReportFragment$ActivityInitializationListener r0 = r1.processListener
            r1.dispatchCreate(r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r1.dispatch(r0)
            return
    }

    @Override // android.app.Fragment
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r1.dispatch(r0)
            r0 = 0
            r1.processListener = r0
            return
    }

    @Override // android.app.Fragment
    public void onPause() {
            r1 = this;
            super.onPause()
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
            r1.dispatch(r0)
            return
    }

    @Override // android.app.Fragment
    public void onResume() {
            r1 = this;
            super.onResume()
            androidx.lifecycle.ReportFragment$ActivityInitializationListener r0 = r1.processListener
            r1.dispatchResume(r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r1.dispatch(r0)
            return
    }

    @Override // android.app.Fragment
    public void onStart() {
            r1 = this;
            super.onStart()
            androidx.lifecycle.ReportFragment$ActivityInitializationListener r0 = r1.processListener
            r1.dispatchStart(r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_START
            r1.dispatch(r0)
            return
    }

    @Override // android.app.Fragment
    public void onStop() {
            r1 = this;
            super.onStop()
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r1.dispatch(r0)
            return
    }

    public final void setProcessListener(androidx.lifecycle.ReportFragment.ActivityInitializationListener r1) {
            r0 = this;
            r0.processListener = r1
            return
    }
}
