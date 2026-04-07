package androidx.activity;

/* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0004*+,-B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0007J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0006H\u0003J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\fH\u0007J\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\fH\u0001¢\u0006\u0002\b\u001eJ\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\fH\u0007J\b\u0010\u0013\u001a\u00020\u0006H\u0007J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0007J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0003J\u0010\u0010%\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0007J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0003J\b\u0010'\u001a\u00020\u0015H\u0007J\b\u0010(\u001a\u00020\u0015H\u0007J\b\u0010)\u001a\u00020\u0015H\u0003R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "fallbackOnBackPressed", "Ljava/lang/Runnable;", "onHasEnabledCallbacksChanged", "Landroidx/core/util/Consumer;", "", "<init>", "(Ljava/lang/Runnable;Landroidx/core/util/Consumer;)V", "(Ljava/lang/Runnable;)V", "onBackPressedCallbacks", "Lkotlin/collections/ArrayDeque;", "Landroidx/activity/OnBackPressedCallback;", "inProgressCallback", "onBackInvokedCallback", "Landroid/window/OnBackInvokedCallback;", "invokedDispatcher", "Landroid/window/OnBackInvokedDispatcher;", "backInvokedCallbackRegistered", "hasEnabledCallbacks", "setOnBackInvokedDispatcher", "", "invoker", "updateBackInvokedCallbackState", "shouldBeRegistered", "updateEnabledCallbacks", "addCallback", "onBackPressedCallback", "addCancellableCallback", "Landroidx/activity/Cancellable;", "addCancellableCallback$activity_release", "owner", "Landroidx/lifecycle/LifecycleOwner;", "dispatchOnBackStarted", "backEvent", "Landroidx/activity/BackEventCompat;", "onBackStarted", "dispatchOnBackProgressed", "onBackProgressed", "onBackPressed", "dispatchOnBackCancelled", "onBackCancelled", "OnBackPressedCancellable", "LifecycleOnBackPressedCancellable", "Api33Impl", "Api34Impl", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OnBackPressedDispatcher {
    private boolean backInvokedCallbackRegistered;
    private final java.lang.Runnable fallbackOnBackPressed;
    private boolean hasEnabledCallbacks;
    private androidx.activity.OnBackPressedCallback inProgressCallback;
    private android.window.OnBackInvokedDispatcher invokedDispatcher;
    private android.window.OnBackInvokedCallback onBackInvokedCallback;
    private final kotlin.collections.ArrayDeque<androidx.activity.OnBackPressedCallback> onBackPressedCallbacks;
    private final androidx.core.util.Consumer<java.lang.Boolean> onHasEnabledCallbacksChanged;

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e¨\u0006\u000f"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api33Impl;", "", "<init>", "()V", "registerOnBackInvokedCallback", "", "dispatcher", "priority", "", "callback", "unregisterOnBackInvokedCallback", "createOnBackInvokedCallback", "Landroid/window/OnBackInvokedCallback;", "onBackInvoked", "Lkotlin/Function0;", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Api33Impl {
        public static final androidx.activity.OnBackPressedDispatcher.Api33Impl INSTANCE = null;

        public static /* synthetic */ void $r8$lambda$uALQStkfKNo5swuEpG7lymZRBFs(kotlin.jvm.functions.Function0 r0) {
                createOnBackInvokedCallback$lambda$0(r0)
                return
        }

        static {
                androidx.activity.OnBackPressedDispatcher$Api33Impl r0 = new androidx.activity.OnBackPressedDispatcher$Api33Impl
                r0.<init>()
                androidx.activity.OnBackPressedDispatcher.Api33Impl.INSTANCE = r0
                return
        }

        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        private static final void createOnBackInvokedCallback$lambda$0(kotlin.jvm.functions.Function0 r0) {
                r0.invoke()
                return
        }

        public final android.window.OnBackInvokedCallback createOnBackInvokedCallback(kotlin.jvm.functions.Function0<kotlin.Unit> r2) {
                r1 = this;
                java.lang.String r0 = "onBackInvoked"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                androidx.activity.OnBackPressedDispatcher$Api33Impl$$ExternalSyntheticLambda0 r0 = new androidx.activity.OnBackPressedDispatcher$Api33Impl$$ExternalSyntheticLambda0
                r0.<init>(r2)
                return r0
        }

        public final void registerOnBackInvokedCallback(java.lang.Object r3, int r4, java.lang.Object r5) {
                r2 = this;
                java.lang.String r0 = "dispatcher"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "callback"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = r3
                android.window.OnBackInvokedDispatcher r0 = (android.window.OnBackInvokedDispatcher) r0
                r1 = r5
                android.window.OnBackInvokedCallback r1 = (android.window.OnBackInvokedCallback) r1
                r0.registerOnBackInvokedCallback(r4, r1)
                return
        }

        public final void unregisterOnBackInvokedCallback(java.lang.Object r3, java.lang.Object r4) {
                r2 = this;
                java.lang.String r0 = "dispatcher"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "callback"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = r3
                android.window.OnBackInvokedDispatcher r0 = (android.window.OnBackInvokedDispatcher) r0
                r1 = r4
                android.window.OnBackInvokedCallback r1 = (android.window.OnBackInvokedCallback) r1
                r0.unregisterOnBackInvokedCallback(r1)
                return
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jh\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u00072!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f¨\u0006\u0011"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api34Impl;", "", "<init>", "()V", "createOnBackAnimationCallback", "Landroid/window/OnBackInvokedCallback;", "onBackStarted", "Lkotlin/Function1;", "Landroidx/activity/BackEventCompat;", "Lkotlin/ParameterName;", "name", "backEvent", "", "onBackProgressed", "onBackInvoked", "Lkotlin/Function0;", "onBackCancelled", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Api34Impl {
        public static final androidx.activity.OnBackPressedDispatcher.Api34Impl INSTANCE = null;

        static {
                androidx.activity.OnBackPressedDispatcher$Api34Impl r0 = new androidx.activity.OnBackPressedDispatcher$Api34Impl
                r0.<init>()
                androidx.activity.OnBackPressedDispatcher.Api34Impl.INSTANCE = r0
                return
        }

        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public final android.window.OnBackInvokedCallback createOnBackAnimationCallback(kotlin.jvm.functions.Function1<? super androidx.activity.BackEventCompat, kotlin.Unit> r2, kotlin.jvm.functions.Function1<? super androidx.activity.BackEventCompat, kotlin.Unit> r3, kotlin.jvm.functions.Function0<kotlin.Unit> r4, kotlin.jvm.functions.Function0<kotlin.Unit> r5) {
                r1 = this;
                java.lang.String r0 = "onBackStarted"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "onBackProgressed"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "onBackInvoked"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "onBackCancelled"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1 r0 = new androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1
                r0.<init>(r2, r3, r4, r5)
                android.window.OnBackInvokedCallback r0 = (android.window.OnBackInvokedCallback) r0
                return r0
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/activity/Cancellable;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/Lifecycle;Landroidx/activity/OnBackPressedCallback;)V", "currentCancellable", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "cancel", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class LifecycleOnBackPressedCancellable implements androidx.lifecycle.LifecycleEventObserver, androidx.activity.Cancellable {
        private androidx.activity.Cancellable currentCancellable;
        private final androidx.lifecycle.Lifecycle lifecycle;
        private final androidx.activity.OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ androidx.activity.OnBackPressedDispatcher this$0;

        public LifecycleOnBackPressedCancellable(androidx.activity.OnBackPressedDispatcher r3, androidx.lifecycle.Lifecycle r4, androidx.activity.OnBackPressedCallback r5) {
                r2 = this;
                java.lang.String r0 = "lifecycle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "onBackPressedCallback"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r2.this$0 = r3
                r2.<init>()
                r2.lifecycle = r4
                r2.onBackPressedCallback = r5
                androidx.lifecycle.Lifecycle r0 = r2.lifecycle
                r1 = r2
                androidx.lifecycle.LifecycleObserver r1 = (androidx.lifecycle.LifecycleObserver) r1
                r0.addObserver(r1)
                return
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
                r2 = this;
                androidx.lifecycle.Lifecycle r0 = r2.lifecycle
                r1 = r2
                androidx.lifecycle.LifecycleObserver r1 = (androidx.lifecycle.LifecycleObserver) r1
                r0.removeObserver(r1)
                androidx.activity.OnBackPressedCallback r0 = r2.onBackPressedCallback
                r1 = r2
                androidx.activity.Cancellable r1 = (androidx.activity.Cancellable) r1
                r0.removeCancellable(r1)
                androidx.activity.Cancellable r0 = r2.currentCancellable
                if (r0 == 0) goto L17
                r0.cancel()
            L17:
                r0 = 0
                r2.currentCancellable = r0
                return
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
                r2 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "event"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_START
                if (r4 != r0) goto L19
                androidx.activity.OnBackPressedDispatcher r0 = r2.this$0
                androidx.activity.OnBackPressedCallback r1 = r2.onBackPressedCallback
                androidx.activity.Cancellable r0 = r0.addCancellableCallback$activity_release(r1)
                r2.currentCancellable = r0
                goto L2c
            L19:
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                if (r4 != r0) goto L25
                androidx.activity.Cancellable r0 = r2.currentCancellable
                if (r0 == 0) goto L2c
                r0.cancel()
                goto L2c
            L25:
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                if (r4 != r0) goto L2c
                r2.cancel()
            L2c:
                return
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$OnBackPressedCancellable;", "Landroidx/activity/Cancellable;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/activity/OnBackPressedCallback;)V", "cancel", "", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class OnBackPressedCancellable implements androidx.activity.Cancellable {
        private final androidx.activity.OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ androidx.activity.OnBackPressedDispatcher this$0;

        public OnBackPressedCancellable(androidx.activity.OnBackPressedDispatcher r2, androidx.activity.OnBackPressedCallback r3) {
                r1 = this;
                java.lang.String r0 = "onBackPressedCallback"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.onBackPressedCallback = r3
                return
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
                r3 = this;
                androidx.activity.OnBackPressedDispatcher r0 = r3.this$0
                kotlin.collections.ArrayDeque r0 = androidx.activity.OnBackPressedDispatcher.access$getOnBackPressedCallbacks$p(r0)
                androidx.activity.OnBackPressedCallback r1 = r3.onBackPressedCallback
                r0.remove(r1)
                androidx.activity.OnBackPressedDispatcher r0 = r3.this$0
                androidx.activity.OnBackPressedCallback r0 = androidx.activity.OnBackPressedDispatcher.access$getInProgressCallback$p(r0)
                androidx.activity.OnBackPressedCallback r1 = r3.onBackPressedCallback
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                r1 = 0
                if (r0 == 0) goto L24
                androidx.activity.OnBackPressedCallback r0 = r3.onBackPressedCallback
                r0.handleOnBackCancelled()
                androidx.activity.OnBackPressedDispatcher r0 = r3.this$0
                androidx.activity.OnBackPressedDispatcher.access$setInProgressCallback$p(r0, r1)
            L24:
                androidx.activity.OnBackPressedCallback r0 = r3.onBackPressedCallback
                r2 = r3
                androidx.activity.Cancellable r2 = (androidx.activity.Cancellable) r2
                r0.removeCancellable(r2)
                androidx.activity.OnBackPressedCallback r0 = r3.onBackPressedCallback
                kotlin.jvm.functions.Function0 r0 = r0.getEnabledChangedCallback$activity_release()
                if (r0 == 0) goto L37
                r0.invoke()
            L37:
                androidx.activity.OnBackPressedCallback r0 = r3.onBackPressedCallback
                r0.setEnabledChangedCallback$activity_release(r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$addCallback$1, reason: invalid class name */
    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        AnonymousClass1(java.lang.Object r8) {
                r7 = this;
                java.lang.Class<androidx.activity.OnBackPressedDispatcher> r3 = androidx.activity.OnBackPressedDispatcher.class
                java.lang.String r5 = "updateEnabledCallbacks()V"
                r6 = 0
                r1 = 0
                java.lang.String r4 = "updateEnabledCallbacks"
                r0 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                r1 = this;
                r1.invoke2()
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
                r1 = this;
                java.lang.Object r0 = r1.receiver
                androidx.activity.OnBackPressedDispatcher r0 = (androidx.activity.OnBackPressedDispatcher) r0
                androidx.activity.OnBackPressedDispatcher.access$updateEnabledCallbacks(r0)
                return
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$-a6U-j2wXqffmeoWEu0mXBghmu0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10$r8$lambda$a6Uj2wXqffmeoWEu0mXBghmu0(androidx.activity.OnBackPressedDispatcher r0) {
            kotlin.Unit r0 = _init_$lambda$5(r0)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$5oLfEcBPJ_5JHyrhCT-BOguu7f8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11$r8$lambda$5oLfEcBPJ_5JHyrhCTBOguu7f8(androidx.activity.OnBackPressedDispatcher r0, androidx.activity.BackEventCompat r1) {
            kotlin.Unit r0 = _init_$lambda$1(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hNgrfsLJ06BaQmnh1lZ87URZ8FE(androidx.activity.OnBackPressedDispatcher r0, androidx.activity.BackEventCompat r1) {
            kotlin.Unit r0 = _init_$lambda$2(r0, r1)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nuiqI5Y7wl3b8dcP7SpVZzxqYqc(androidx.activity.OnBackPressedDispatcher r0) {
            kotlin.Unit r0 = _init_$lambda$3(r0)
            return r0
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$opGFpg0nJzij0zjkwsrECl08JyY(androidx.activity.OnBackPressedDispatcher r0) {
            kotlin.Unit r0 = _init_$lambda$4(r0)
            return r0
    }

    public OnBackPressedDispatcher() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public OnBackPressedDispatcher(java.lang.Runnable r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public /* synthetic */ OnBackPressedDispatcher(java.lang.Runnable r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.<init>(r1)
            return
    }

    public OnBackPressedDispatcher(java.lang.Runnable r6, androidx.core.util.Consumer<java.lang.Boolean> r7) {
            r5 = this;
            r5.<init>()
            r5.fallbackOnBackPressed = r6
            r5.onHasEnabledCallbacksChanged = r7
            kotlin.collections.ArrayDeque r0 = new kotlin.collections.ArrayDeque
            r0.<init>()
            r5.onBackPressedCallbacks = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L44
        L16:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L37
            androidx.activity.OnBackPressedDispatcher$Api34Impl r0 = androidx.activity.OnBackPressedDispatcher.Api34Impl.INSTANCE
            androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda0 r1 = new androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda0
            r1.<init>(r5)
            androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda1 r2 = new androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda1
            r2.<init>(r5)
            androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda2 r3 = new androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda2
            r3.<init>(r5)
            androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda3 r4 = new androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda3
            r4.<init>(r5)
            android.window.OnBackInvokedCallback r0 = r0.createOnBackAnimationCallback(r1, r2, r3, r4)
            goto L42
        L37:
            androidx.activity.OnBackPressedDispatcher$Api33Impl r0 = androidx.activity.OnBackPressedDispatcher.Api33Impl.INSTANCE
            androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda4 r1 = new androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticLambda4
            r1.<init>(r5)
            android.window.OnBackInvokedCallback r0 = r0.createOnBackInvokedCallback(r1)
        L42:
            r5.onBackInvokedCallback = r0
        L44:
            return
    }

    private static final kotlin.Unit _init_$lambda$1(androidx.activity.OnBackPressedDispatcher r1, androidx.activity.BackEventCompat r2) {
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.onBackStarted(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private static final kotlin.Unit _init_$lambda$2(androidx.activity.OnBackPressedDispatcher r1, androidx.activity.BackEventCompat r2) {
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.onBackProgressed(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private static final kotlin.Unit _init_$lambda$3(androidx.activity.OnBackPressedDispatcher r1) {
            r1.onBackPressed()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private static final kotlin.Unit _init_$lambda$4(androidx.activity.OnBackPressedDispatcher r1) {
            r1.onBackCancelled()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private static final kotlin.Unit _init_$lambda$5(androidx.activity.OnBackPressedDispatcher r1) {
            r1.onBackPressed()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    public static final /* synthetic */ androidx.activity.OnBackPressedCallback access$getInProgressCallback$p(androidx.activity.OnBackPressedDispatcher r1) {
            androidx.activity.OnBackPressedCallback r0 = r1.inProgressCallback
            return r0
    }

    public static final /* synthetic */ kotlin.collections.ArrayDeque access$getOnBackPressedCallbacks$p(androidx.activity.OnBackPressedDispatcher r1) {
            kotlin.collections.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r1.onBackPressedCallbacks
            return r0
    }

    public static final /* synthetic */ void access$setInProgressCallback$p(androidx.activity.OnBackPressedDispatcher r0, androidx.activity.OnBackPressedCallback r1) {
            r0.inProgressCallback = r1
            return
    }

    public static final /* synthetic */ void access$updateEnabledCallbacks(androidx.activity.OnBackPressedDispatcher r0) {
            r0.updateEnabledCallbacks()
            return
    }

    private final void onBackCancelled() {
            r7 = this;
            androidx.activity.OnBackPressedCallback r0 = r7.inProgressCallback
            r1 = 0
            if (r0 != 0) goto L2b
            kotlin.collections.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r7.onBackPressedCallbacks
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            int r3 = r0.size()
            java.util.ListIterator r3 = r0.listIterator(r3)
        L12:
            boolean r4 = r3.hasPrevious()
            if (r4 == 0) goto L27
            java.lang.Object r4 = r3.previous()
            r5 = r4
            androidx.activity.OnBackPressedCallback r5 = (androidx.activity.OnBackPressedCallback) r5
            r6 = 0
            boolean r5 = r5.isEnabled()
            if (r5 == 0) goto L12
            goto L28
        L27:
            r4 = r1
        L28:
            r0 = r4
            androidx.activity.OnBackPressedCallback r0 = (androidx.activity.OnBackPressedCallback) r0
        L2b:
            r7.inProgressCallback = r1
            if (r0 == 0) goto L34
            r0.handleOnBackCancelled()
            return
        L34:
            return
    }

    private final void onBackProgressed(androidx.activity.BackEventCompat r7) {
            r6 = this;
            androidx.activity.OnBackPressedCallback r0 = r6.inProgressCallback
            if (r0 != 0) goto L2a
            kotlin.collections.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r6.onBackPressedCallbacks
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            int r2 = r0.size()
            java.util.ListIterator r2 = r0.listIterator(r2)
        L11:
            boolean r3 = r2.hasPrevious()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.previous()
            r4 = r3
            androidx.activity.OnBackPressedCallback r4 = (androidx.activity.OnBackPressedCallback) r4
            r5 = 0
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L11
            goto L27
        L26:
            r3 = 0
        L27:
            r0 = r3
            androidx.activity.OnBackPressedCallback r0 = (androidx.activity.OnBackPressedCallback) r0
        L2a:
            if (r0 == 0) goto L31
            r0.handleOnBackProgressed(r7)
            return
        L31:
            return
    }

    private final void onBackStarted(androidx.activity.BackEventCompat r7) {
            r6 = this;
            kotlin.collections.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r6.onBackPressedCallbacks
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            int r2 = r0.size()
            java.util.ListIterator r2 = r0.listIterator(r2)
        Ld:
            boolean r3 = r2.hasPrevious()
            if (r3 == 0) goto L22
            java.lang.Object r3 = r2.previous()
            r4 = r3
            androidx.activity.OnBackPressedCallback r4 = (androidx.activity.OnBackPressedCallback) r4
            r5 = 0
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto Ld
            goto L23
        L22:
            r3 = 0
        L23:
            r0 = r3
            androidx.activity.OnBackPressedCallback r0 = (androidx.activity.OnBackPressedCallback) r0
            androidx.activity.OnBackPressedCallback r1 = r6.inProgressCallback
            if (r1 == 0) goto L2d
            r6.onBackCancelled()
        L2d:
            r6.inProgressCallback = r0
            if (r0 == 0) goto L35
            r0.handleOnBackStarted(r7)
            return
        L35:
            return
    }

    private final void updateBackInvokedCallbackState(boolean r5) {
            r4 = this;
            android.window.OnBackInvokedDispatcher r0 = r4.invokedDispatcher
            android.window.OnBackInvokedCallback r1 = r4.onBackInvokedCallback
            if (r0 == 0) goto L28
            if (r1 == 0) goto L28
            r2 = 0
            if (r5 == 0) goto L1b
            boolean r3 = r4.backInvokedCallbackRegistered
            if (r3 != 0) goto L1b
            androidx.activity.OnBackPressedDispatcher$Api33Impl r3 = androidx.activity.OnBackPressedDispatcher.Api33Impl.INSTANCE
            r3.registerOnBackInvokedCallback(r0, r2, r1)
            r2 = 1
            r4.backInvokedCallbackRegistered = r2
            goto L28
        L1b:
            if (r5 != 0) goto L28
            boolean r3 = r4.backInvokedCallbackRegistered
            if (r3 == 0) goto L28
            androidx.activity.OnBackPressedDispatcher$Api33Impl r3 = androidx.activity.OnBackPressedDispatcher.Api33Impl.INSTANCE
            r3.unregisterOnBackInvokedCallback(r0, r1)
            r4.backInvokedCallbackRegistered = r2
        L28:
            return
    }

    private final void updateEnabledCallbacks() {
            r8 = this;
            boolean r0 = r8.hasEnabledCallbacks
            kotlin.collections.ArrayDeque<androidx.activity.OnBackPressedCallback> r1 = r8.onBackPressedCallbacks
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            boolean r3 = r1 instanceof java.util.Collection
            r4 = 0
            if (r3 == 0) goto L16
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L16
            goto L31
        L16:
            java.util.Iterator r3 = r1.iterator()
        L1a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L30
            java.lang.Object r5 = r3.next()
            r6 = r5
            androidx.activity.OnBackPressedCallback r6 = (androidx.activity.OnBackPressedCallback) r6
            r7 = 0
            boolean r6 = r6.isEnabled()
            if (r6 == 0) goto L1a
            r4 = 1
            goto L31
        L30:
        L31:
            r8.hasEnabledCallbacks = r4
            if (r4 == r0) goto L4a
            androidx.core.util.Consumer<java.lang.Boolean> r1 = r8.onHasEnabledCallbacksChanged
            if (r1 == 0) goto L41
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r1.accept(r2)
        L41:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L4a
            r8.updateBackInvokedCallbackState(r4)
        L4a:
            return
    }

    public final void addCallback(androidx.activity.OnBackPressedCallback r2) {
            r1 = this;
            java.lang.String r0 = "onBackPressedCallback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.addCancellableCallback$activity_release(r2)
            return
    }

    public final void addCallback(androidx.lifecycle.LifecycleOwner r4, androidx.activity.OnBackPressedCallback r5) {
            r3 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "onBackPressedCallback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.lifecycle.Lifecycle r0 = r4.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r1 != r2) goto L17
            return
        L17:
            androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r1 = new androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            r1.<init>(r3, r0, r5)
            androidx.activity.Cancellable r1 = (androidx.activity.Cancellable) r1
            r5.addCancellable(r1)
            r3.updateEnabledCallbacks()
            androidx.activity.OnBackPressedDispatcher$addCallback$1 r1 = new androidx.activity.OnBackPressedDispatcher$addCallback$1
            r1.<init>(r3)
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r5.setEnabledChangedCallback$activity_release(r1)
            return
    }

    public final androidx.activity.Cancellable addCancellableCallback$activity_release(androidx.activity.OnBackPressedCallback r3) {
            r2 = this;
            java.lang.String r0 = "onBackPressedCallback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.collections.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r2.onBackPressedCallbacks
            r0.add(r3)
            androidx.activity.OnBackPressedDispatcher$OnBackPressedCancellable r0 = new androidx.activity.OnBackPressedDispatcher$OnBackPressedCancellable
            r0.<init>(r2, r3)
            r1 = r0
            androidx.activity.Cancellable r1 = (androidx.activity.Cancellable) r1
            r3.addCancellable(r1)
            r2.updateEnabledCallbacks()
            androidx.activity.OnBackPressedDispatcher$addCancellableCallback$1 r1 = new androidx.activity.OnBackPressedDispatcher$addCancellableCallback$1
            r1.<init>(r2)
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r3.setEnabledChangedCallback$activity_release(r1)
            r1 = r0
            androidx.activity.Cancellable r1 = (androidx.activity.Cancellable) r1
            return r1
    }

    public final void dispatchOnBackCancelled() {
            r0 = this;
            r0.onBackCancelled()
            return
    }

    public final void dispatchOnBackProgressed(androidx.activity.BackEventCompat r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.onBackProgressed(r2)
            return
    }

    public final void dispatchOnBackStarted(androidx.activity.BackEventCompat r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.onBackStarted(r2)
            return
    }

    public final boolean hasEnabledCallbacks() {
            r1 = this;
            boolean r0 = r1.hasEnabledCallbacks
            return r0
    }

    public final void onBackPressed() {
            r7 = this;
            androidx.activity.OnBackPressedCallback r0 = r7.inProgressCallback
            r1 = 0
            if (r0 != 0) goto L2b
            kotlin.collections.ArrayDeque<androidx.activity.OnBackPressedCallback> r0 = r7.onBackPressedCallbacks
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            int r3 = r0.size()
            java.util.ListIterator r3 = r0.listIterator(r3)
        L12:
            boolean r4 = r3.hasPrevious()
            if (r4 == 0) goto L27
            java.lang.Object r4 = r3.previous()
            r5 = r4
            androidx.activity.OnBackPressedCallback r5 = (androidx.activity.OnBackPressedCallback) r5
            r6 = 0
            boolean r5 = r5.isEnabled()
            if (r5 == 0) goto L12
            goto L28
        L27:
            r4 = r1
        L28:
            r0 = r4
            androidx.activity.OnBackPressedCallback r0 = (androidx.activity.OnBackPressedCallback) r0
        L2b:
            r7.inProgressCallback = r1
            if (r0 == 0) goto L34
            r0.handleOnBackPressed()
            return
        L34:
            java.lang.Runnable r1 = r7.fallbackOnBackPressed
            if (r1 == 0) goto L3b
            r1.run()
        L3b:
            return
    }

    public final void setOnBackInvokedDispatcher(android.window.OnBackInvokedDispatcher r2) {
            r1 = this;
            java.lang.String r0 = "invoker"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.invokedDispatcher = r2
            boolean r0 = r1.hasEnabledCallbacks
            r1.updateBackInvokedCallbackState(r0)
            return
    }
}
