package androidx.lifecycle;

/* JADX INFO: compiled from: LifecycleDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/lifecycle/LifecycleDispatcher;", "", "()V", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "init", "", "context", "Landroid/content/Context;", "DispatcherActivityCallback", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LifecycleDispatcher {
    public static final androidx.lifecycle.LifecycleDispatcher INSTANCE = null;
    private static final java.util.concurrent.atomic.AtomicBoolean initialized = null;

    /* JADX INFO: compiled from: LifecycleDispatcher.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Landroidx/lifecycle/LifecycleDispatcher$DispatcherActivityCallback;", "Landroidx/lifecycle/EmptyActivityLifecycleCallbacks;", "()V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DispatcherActivityCallback extends androidx.lifecycle.EmptyActivityLifecycleCallbacks {
        public DispatcherActivityCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r2, android.os.Bundle r3) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
                r0.injectIfNeededIn(r2)
                return
        }
    }

    static {
            androidx.lifecycle.LifecycleDispatcher r0 = new androidx.lifecycle.LifecycleDispatcher
            r0.<init>()
            androidx.lifecycle.LifecycleDispatcher.INSTANCE = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.LifecycleDispatcher.initialized = r0
            return
    }

    private LifecycleDispatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void init(android.content.Context r2) {
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = androidx.lifecycle.LifecycleDispatcher.initialized
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lf
            return
        Lf:
            android.content.Context r0 = r2.getApplicationContext()
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Application"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            android.app.Application r0 = (android.app.Application) r0
            androidx.lifecycle.LifecycleDispatcher$DispatcherActivityCallback r1 = new androidx.lifecycle.LifecycleDispatcher$DispatcherActivityCallback
            r1.<init>()
            android.app.Application$ActivityLifecycleCallbacks r1 = (android.app.Application.ActivityLifecycleCallbacks) r1
            r0.registerActivityLifecycleCallbacks(r1)
            return
    }
}
