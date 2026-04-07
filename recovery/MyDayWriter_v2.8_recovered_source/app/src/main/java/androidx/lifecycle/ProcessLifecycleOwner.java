package androidx.lifecycle;

/* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 '2\u00020\u0001:\u0002&'B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017J\r\u0010\u0018\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0019J\r\u0010\u001a\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u001bJ\r\u0010\u001c\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u001dJ\u0015\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b!J\r\u0010\"\u001a\u00020\u0016H\u0000¢\u0006\u0002\b#J\r\u0010$\u001a\u00020\u0016H\u0000¢\u0006\u0002\b%R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "()V", "delayedPauseRunnable", "Ljava/lang/Runnable;", "handler", "Landroid/os/Handler;", "initializationListener", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "pauseSent", "", "registry", "Landroidx/lifecycle/LifecycleRegistry;", "resumedCounter", "", "startedCounter", "stopSent", "activityPaused", "", "activityPaused$lifecycle_process_release", "activityResumed", "activityResumed$lifecycle_process_release", "activityStarted", "activityStarted$lifecycle_process_release", "activityStopped", "activityStopped$lifecycle_process_release", "attach", "context", "Landroid/content/Context;", "attach$lifecycle_process_release", "dispatchPauseIfNeeded", "dispatchPauseIfNeeded$lifecycle_process_release", "dispatchStopIfNeeded", "dispatchStopIfNeeded$lifecycle_process_release", "Api29Impl", "Companion", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProcessLifecycleOwner implements androidx.lifecycle.LifecycleOwner {
    public static final androidx.lifecycle.ProcessLifecycleOwner.Companion Companion = null;
    public static final long TIMEOUT_MS = 700;
    private static final androidx.lifecycle.ProcessLifecycleOwner newInstance = null;
    private final java.lang.Runnable delayedPauseRunnable;
    private android.os.Handler handler;
    private final androidx.lifecycle.ReportFragment.ActivityInitializationListener initializationListener;
    private boolean pauseSent;
    private final androidx.lifecycle.LifecycleRegistry registry;
    private int resumedCounter;
    private int startedCounter;
    private boolean stopSent;

    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Api29Impl;", "", "()V", "registerActivityLifecycleCallbacks", "", "activity", "Landroid/app/Activity;", "callback", "Landroid/app/Application$ActivityLifecycleCallbacks;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api29Impl {
        public static final androidx.lifecycle.ProcessLifecycleOwner.Api29Impl INSTANCE = null;

        static {
                androidx.lifecycle.ProcessLifecycleOwner$Api29Impl r0 = new androidx.lifecycle.ProcessLifecycleOwner$Api29Impl
                r0.<init>()
                androidx.lifecycle.ProcessLifecycleOwner.Api29Impl.INSTANCE = r0
                return
        }

        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        public static final void registerActivityLifecycleCallbacks(android.app.Activity r1, android.app.Application.ActivityLifecycleCallbacks r2) {
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                java.lang.String r0 = "callback"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.registerActivityLifecycleCallbacks(r2)
                return
        }
    }

    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\b\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Companion;", "", "()V", "TIMEOUT_MS", "", "getTIMEOUT_MS$lifecycle_process_release$annotations", "newInstance", "Landroidx/lifecycle/ProcessLifecycleOwner;", "get", "Landroidx/lifecycle/LifecycleOwner;", "init", "", "context", "Landroid/content/Context;", "init$lifecycle_process_release", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

        public static /* synthetic */ void getTIMEOUT_MS$lifecycle_process_release$annotations() {
                return
        }

        @kotlin.jvm.JvmStatic
        public final androidx.lifecycle.LifecycleOwner get() {
                r1 = this;
                androidx.lifecycle.ProcessLifecycleOwner r0 = androidx.lifecycle.ProcessLifecycleOwner.access$getNewInstance$cp()
                androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final void init$lifecycle_process_release(android.content.Context r2) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                androidx.lifecycle.ProcessLifecycleOwner r0 = androidx.lifecycle.ProcessLifecycleOwner.access$getNewInstance$cp()
                r0.attach$lifecycle_process_release(r2)
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$ArPpV1aF4irVI-oizc48o3VfLys, reason: not valid java name */
    public static /* synthetic */ void m98$r8$lambda$ArPpV1aF4irVIoizc48o3VfLys(androidx.lifecycle.ProcessLifecycleOwner r0) {
            delayedPauseRunnable$lambda$0(r0)
            return
    }

    static {
            androidx.lifecycle.ProcessLifecycleOwner$Companion r0 = new androidx.lifecycle.ProcessLifecycleOwner$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.ProcessLifecycleOwner.Companion = r0
            androidx.lifecycle.ProcessLifecycleOwner r0 = new androidx.lifecycle.ProcessLifecycleOwner
            r0.<init>()
            androidx.lifecycle.ProcessLifecycleOwner.newInstance = r0
            return
    }

    private ProcessLifecycleOwner() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.pauseSent = r0
            r2.stopSent = r0
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r1 = r2
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            r0.<init>(r1)
            r2.registry = r0
            androidx.lifecycle.ProcessLifecycleOwner$$ExternalSyntheticLambda0 r0 = new androidx.lifecycle.ProcessLifecycleOwner$$ExternalSyntheticLambda0
            r0.<init>(r2)
            r2.delayedPauseRunnable = r0
            androidx.lifecycle.ProcessLifecycleOwner$initializationListener$1 r0 = new androidx.lifecycle.ProcessLifecycleOwner$initializationListener$1
            r0.<init>(r2)
            androidx.lifecycle.ReportFragment$ActivityInitializationListener r0 = (androidx.lifecycle.ReportFragment.ActivityInitializationListener) r0
            r2.initializationListener = r0
            return
    }

    public static final /* synthetic */ androidx.lifecycle.ReportFragment.ActivityInitializationListener access$getInitializationListener$p(androidx.lifecycle.ProcessLifecycleOwner r1) {
            androidx.lifecycle.ReportFragment$ActivityInitializationListener r0 = r1.initializationListener
            return r0
    }

    public static final /* synthetic */ androidx.lifecycle.ProcessLifecycleOwner access$getNewInstance$cp() {
            androidx.lifecycle.ProcessLifecycleOwner r0 = androidx.lifecycle.ProcessLifecycleOwner.newInstance
            return r0
    }

    private static final void delayedPauseRunnable$lambda$0(androidx.lifecycle.ProcessLifecycleOwner r1) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.dispatchPauseIfNeeded$lifecycle_process_release()
            r1.dispatchStopIfNeeded$lifecycle_process_release()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.lifecycle.LifecycleOwner get() {
            androidx.lifecycle.ProcessLifecycleOwner$Companion r0 = androidx.lifecycle.ProcessLifecycleOwner.Companion
            androidx.lifecycle.LifecycleOwner r0 = r0.get()
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final void init$lifecycle_process_release(android.content.Context r1) {
            androidx.lifecycle.ProcessLifecycleOwner$Companion r0 = androidx.lifecycle.ProcessLifecycleOwner.Companion
            r0.init$lifecycle_process_release(r1)
            return
    }

    public final void activityPaused$lifecycle_process_release() {
            r4 = this;
            int r0 = r4.resumedCounter
            int r0 = r0 + (-1)
            r4.resumedCounter = r0
            int r0 = r4.resumedCounter
            if (r0 != 0) goto L16
            android.os.Handler r0 = r4.handler
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.Runnable r1 = r4.delayedPauseRunnable
            r2 = 700(0x2bc, double:3.46E-321)
            r0.postDelayed(r1, r2)
        L16:
            return
    }

    public final void activityResumed$lifecycle_process_release() {
            r2 = this;
            int r0 = r2.resumedCounter
            r1 = 1
            int r0 = r0 + r1
            r2.resumedCounter = r0
            int r0 = r2.resumedCounter
            if (r0 != r1) goto L23
            boolean r0 = r2.pauseSent
            if (r0 == 0) goto L19
            androidx.lifecycle.LifecycleRegistry r0 = r2.registry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r0.handleLifecycleEvent(r1)
            r0 = 0
            r2.pauseSent = r0
            goto L23
        L19:
            android.os.Handler r0 = r2.handler
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.Runnable r1 = r2.delayedPauseRunnable
            r0.removeCallbacks(r1)
        L23:
            return
    }

    public final void activityStarted$lifecycle_process_release() {
            r2 = this;
            int r0 = r2.startedCounter
            r1 = 1
            int r0 = r0 + r1
            r2.startedCounter = r0
            int r0 = r2.startedCounter
            if (r0 != r1) goto L18
            boolean r0 = r2.stopSent
            if (r0 == 0) goto L18
            androidx.lifecycle.LifecycleRegistry r0 = r2.registry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
            r0.handleLifecycleEvent(r1)
            r0 = 0
            r2.stopSent = r0
        L18:
            return
    }

    public final void activityStopped$lifecycle_process_release() {
            r1 = this;
            int r0 = r1.startedCounter
            int r0 = r0 + (-1)
            r1.startedCounter = r0
            r1.dispatchStopIfNeeded$lifecycle_process_release()
            return
    }

    public final void attach$lifecycle_process_release(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.handler = r0
            androidx.lifecycle.LifecycleRegistry r0 = r2.registry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r0.handleLifecycleEvent(r1)
            android.content.Context r0 = r3.getApplicationContext()
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Application"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            android.app.Application r0 = (android.app.Application) r0
            androidx.lifecycle.ProcessLifecycleOwner$attach$1 r1 = new androidx.lifecycle.ProcessLifecycleOwner$attach$1
            r1.<init>(r2)
            android.app.Application$ActivityLifecycleCallbacks r1 = (android.app.Application.ActivityLifecycleCallbacks) r1
            r0.registerActivityLifecycleCallbacks(r1)
            return
    }

    public final void dispatchPauseIfNeeded$lifecycle_process_release() {
            r2 = this;
            int r0 = r2.resumedCounter
            if (r0 != 0) goto Le
            r0 = 1
            r2.pauseSent = r0
            androidx.lifecycle.LifecycleRegistry r0 = r2.registry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
            r0.handleLifecycleEvent(r1)
        Le:
            return
    }

    public final void dispatchStopIfNeeded$lifecycle_process_release() {
            r2 = this;
            int r0 = r2.startedCounter
            if (r0 != 0) goto L12
            boolean r0 = r2.pauseSent
            if (r0 == 0) goto L12
            androidx.lifecycle.LifecycleRegistry r0 = r2.registry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r0.handleLifecycleEvent(r1)
            r0 = 1
            r2.stopSent = r0
        L12:
            return
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.registry
            androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
            return r0
    }
}
