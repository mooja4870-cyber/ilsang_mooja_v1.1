package androidx.activity;

/* JADX INFO: compiled from: ImmLeaksCleaner.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0004\f\r\u000e\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/activity/ImmLeaksCleaner;", "Landroidx/lifecycle/LifecycleEventObserver;", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "Cleaner", "FailedInitialization", "ValidCleaner", "Companion", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImmLeaksCleaner implements androidx.lifecycle.LifecycleEventObserver {
    public static final androidx.activity.ImmLeaksCleaner.Companion Companion = null;
    private static final kotlin.Lazy<androidx.activity.ImmLeaksCleaner.Cleaner> cleaner$delegate = null;
    private final android.app.Activity activity;

    /* JADX INFO: compiled from: ImmLeaksCleaner.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\f\u001a\u00020\r*\u00020\u0005H&R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$Cleaner;", "", "<init>", "()V", "lock", "Landroid/view/inputmethod/InputMethodManager;", "getLock", "(Landroid/view/inputmethod/InputMethodManager;)Ljava/lang/Object;", "servedView", "Landroid/view/View;", "getServedView", "(Landroid/view/inputmethod/InputMethodManager;)Landroid/view/View;", "clearNextServedView", "", "Landroidx/activity/ImmLeaksCleaner$FailedInitialization;", "Landroidx/activity/ImmLeaksCleaner$ValidCleaner;", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Cleaner {
        private Cleaner() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Cleaner(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract boolean clearNextServedView(android.view.inputmethod.InputMethodManager r1);

        public abstract java.lang.Object getLock(android.view.inputmethod.InputMethodManager r1);

        public abstract android.view.View getServedView(android.view.inputmethod.InputMethodManager r1);
    }

    /* JADX INFO: compiled from: ImmLeaksCleaner.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$Companion;", "", "<init>", "()V", "cleaner", "Landroidx/activity/ImmLeaksCleaner$Cleaner;", "getCleaner", "()Landroidx/activity/ImmLeaksCleaner$Cleaner;", "cleaner$delegate", "Lkotlin/Lazy;", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        public final androidx.activity.ImmLeaksCleaner.Cleaner getCleaner() {
                r1 = this;
                kotlin.Lazy r0 = androidx.activity.ImmLeaksCleaner.access$getCleaner$delegate$cp()
                java.lang.Object r0 = r0.getValue()
                androidx.activity.ImmLeaksCleaner$Cleaner r0 = (androidx.activity.ImmLeaksCleaner.Cleaner) r0
                return r0
        }
    }

    /* JADX INFO: compiled from: ImmLeaksCleaner.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\r\u001a\u00020\u000e*\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$FailedInitialization;", "Landroidx/activity/ImmLeaksCleaner$Cleaner;", "<init>", "()V", "lock", "", "Landroid/view/inputmethod/InputMethodManager;", "getLock", "(Landroid/view/inputmethod/InputMethodManager;)Ljava/lang/Object;", "servedView", "Landroid/view/View;", "getServedView", "(Landroid/view/inputmethod/InputMethodManager;)Landroid/view/View;", "clearNextServedView", "", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FailedInitialization extends androidx.activity.ImmLeaksCleaner.Cleaner {
        public static final androidx.activity.ImmLeaksCleaner.FailedInitialization INSTANCE = null;

        static {
                androidx.activity.ImmLeaksCleaner$FailedInitialization r0 = new androidx.activity.ImmLeaksCleaner$FailedInitialization
                r0.<init>()
                androidx.activity.ImmLeaksCleaner.FailedInitialization.INSTANCE = r0
                return
        }

        private FailedInitialization() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public boolean clearNextServedView(android.view.inputmethod.InputMethodManager r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 0
                return r0
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public java.lang.Object getLock(android.view.inputmethod.InputMethodManager r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 0
                return r0
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public android.view.View getServedView(android.view.inputmethod.InputMethodManager r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: compiled from: ImmLeaksCleaner.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u0011\u001a\u00020\u0012*\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$ValidCleaner;", "Landroidx/activity/ImmLeaksCleaner$Cleaner;", "hField", "Ljava/lang/reflect/Field;", "servedViewField", "nextServedViewField", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V", "lock", "", "Landroid/view/inputmethod/InputMethodManager;", "getLock", "(Landroid/view/inputmethod/InputMethodManager;)Ljava/lang/Object;", "servedView", "Landroid/view/View;", "getServedView", "(Landroid/view/inputmethod/InputMethodManager;)Landroid/view/View;", "clearNextServedView", "", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ValidCleaner extends androidx.activity.ImmLeaksCleaner.Cleaner {
        private final java.lang.reflect.Field hField;
        private final java.lang.reflect.Field nextServedViewField;
        private final java.lang.reflect.Field servedViewField;

        public ValidCleaner(java.lang.reflect.Field r2, java.lang.reflect.Field r3, java.lang.reflect.Field r4) {
                r1 = this;
                java.lang.String r0 = "hField"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "servedViewField"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "nextServedViewField"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = 0
                r1.<init>(r0)
                r1.hField = r2
                r1.servedViewField = r3
                r1.nextServedViewField = r4
                return
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public boolean clearNextServedView(android.view.inputmethod.InputMethodManager r3) {
                r2 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.reflect.Field r0 = r2.nextServedViewField     // Catch: java.lang.IllegalAccessException -> Le
                r1 = 0
                r0.set(r3, r1)     // Catch: java.lang.IllegalAccessException -> Le
                r0 = 1
                goto L11
            Le:
                r0 = move-exception
                r1 = 0
                r0 = r1
            L11:
                return r0
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public java.lang.Object getLock(android.view.inputmethod.InputMethodManager r3) {
                r2 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.reflect.Field r0 = r2.hField     // Catch: java.lang.IllegalAccessException -> Ld
                java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.IllegalAccessException -> Ld
                goto L10
            Ld:
                r0 = move-exception
                r1 = 0
                r0 = r1
            L10:
                return r0
        }

        @Override // androidx.activity.ImmLeaksCleaner.Cleaner
        public android.view.View getServedView(android.view.inputmethod.InputMethodManager r3) {
                r2 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 0
                java.lang.reflect.Field r1 = r2.servedViewField     // Catch: java.lang.ClassCastException -> L11 java.lang.IllegalAccessException -> L13
                java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.ClassCastException -> L11 java.lang.IllegalAccessException -> L13
                android.view.View r1 = (android.view.View) r1     // Catch: java.lang.ClassCastException -> L11 java.lang.IllegalAccessException -> L13
                r0 = r1
                goto L15
            L11:
                r1 = move-exception
                goto L15
            L13:
                r1 = move-exception
            L15:
                return r0
        }
    }

    public static /* synthetic */ androidx.activity.ImmLeaksCleaner.Cleaner $r8$lambda$NrP0j7RyqmDRYz6E9ElyHt45S8A() {
            androidx.activity.ImmLeaksCleaner$Cleaner r0 = cleaner_delegate$lambda$5()
            return r0
    }

    static {
            androidx.activity.ImmLeaksCleaner$Companion r0 = new androidx.activity.ImmLeaksCleaner$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.activity.ImmLeaksCleaner.Companion = r0
            androidx.activity.ImmLeaksCleaner$$ExternalSyntheticLambda0 r0 = new androidx.activity.ImmLeaksCleaner$$ExternalSyntheticLambda0
            r0.<init>()
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            androidx.activity.ImmLeaksCleaner.cleaner$delegate = r0
            return
    }

    public ImmLeaksCleaner(android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.activity = r2
            return
    }

    public static final /* synthetic */ kotlin.Lazy access$getCleaner$delegate$cp() {
            kotlin.Lazy<androidx.activity.ImmLeaksCleaner$Cleaner> r0 = androidx.activity.ImmLeaksCleaner.cleaner$delegate
            return r0
    }

    private static final androidx.activity.ImmLeaksCleaner.Cleaner cleaner_delegate$lambda$5() {
            java.lang.Class<android.view.inputmethod.InputMethodManager> r0 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r1 = "mServedView"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L38
            r2 = r1
            r3 = 0
            r4 = 1
            r2.setAccessible(r4)     // Catch: java.lang.NoSuchFieldException -> L38
            java.lang.String r2 = "mNextServedView"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L38
            r3 = r2
            r5 = 0
            r3.setAccessible(r4)     // Catch: java.lang.NoSuchFieldException -> L38
            java.lang.String r3 = "mH"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L38
            r5 = r3
            r6 = 0
            r5.setAccessible(r4)     // Catch: java.lang.NoSuchFieldException -> L38
            androidx.activity.ImmLeaksCleaner$ValidCleaner r4 = new androidx.activity.ImmLeaksCleaner$ValidCleaner     // Catch: java.lang.NoSuchFieldException -> L38
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.NoSuchFieldException -> L38
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.NoSuchFieldException -> L38
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.NoSuchFieldException -> L38
            r4.<init>(r3, r1, r2)     // Catch: java.lang.NoSuchFieldException -> L38
            androidx.activity.ImmLeaksCleaner$Cleaner r4 = (androidx.activity.ImmLeaksCleaner.Cleaner) r4     // Catch: java.lang.NoSuchFieldException -> L38
            goto L3e
        L38:
            r0 = move-exception
            androidx.activity.ImmLeaksCleaner$FailedInitialization r1 = androidx.activity.ImmLeaksCleaner.FailedInitialization.INSTANCE
            r4 = r1
            androidx.activity.ImmLeaksCleaner$Cleaner r4 = (androidx.activity.ImmLeaksCleaner.Cleaner) r4
        L3e:
            return r4
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner r8, androidx.lifecycle.Lifecycle.Event r9) {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r9 == r0) goto Lf
            return
        Lf:
            android.app.Activity r0 = r7.activity
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            androidx.activity.ImmLeaksCleaner$Companion r1 = androidx.activity.ImmLeaksCleaner.Companion
            androidx.activity.ImmLeaksCleaner$Cleaner r1 = r1.getCleaner()
            r2 = 0
            java.lang.Object r3 = r1.getLock(r0)
            if (r3 != 0) goto L2d
            return
        L2d:
            monitor-enter(r3)
            r4 = 0
            android.view.View r5 = r1.getServedView(r0)     // Catch: java.lang.Throwable -> L4e
            if (r5 != 0) goto L37
            monitor-exit(r3)
            return
        L37:
            boolean r6 = r5.isAttachedToWindow()     // Catch: java.lang.Throwable -> L4e
            if (r6 == 0) goto L40
        L3e:
            monitor-exit(r3)
            return
        L40:
            boolean r6 = r1.clearNextServedView(r0)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r3)
            if (r6 == 0) goto L4b
            r0.isActive()
        L4b:
            return
        L4e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }
}
