package androidx.core.splashscreen;

/* JADX INFO: compiled from: SplashScreenViewProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0011\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\bJ\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001b"}, d2 = {"Landroidx/core/splashscreen/SplashScreenViewProvider;", "", "ctx", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "platformView", "Landroid/window/SplashScreenView;", "(Landroid/window/SplashScreenView;Landroid/app/Activity;)V", "impl", "Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "iconView", "getIconView", "iconAnimationStartMillis", "", "getIconAnimationStartMillis", "()J", "iconAnimationDurationMillis", "getIconAnimationDurationMillis", "remove", "", "ViewImpl", "ViewImpl31", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SplashScreenViewProvider {
    private final androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl impl;

    /* JADX INFO: compiled from: SplashScreenViewProvider.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;", "", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "_splashScreenView", "Landroid/view/ViewGroup;", "get_splashScreenView", "()Landroid/view/ViewGroup;", "_splashScreenView$delegate", "Lkotlin/Lazy;", "createSplashScreenView", "", "splashScreenView", "getSplashScreenView", "iconView", "Landroid/view/View;", "getIconView", "()Landroid/view/View;", "iconAnimationStartMillis", "", "getIconAnimationStartMillis", "()J", "iconAnimationDurationMillis", "getIconAnimationDurationMillis", "remove", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static class ViewImpl {
        private final kotlin.Lazy _splashScreenView$delegate;
        private final android.app.Activity activity;

        public static /* synthetic */ android.view.ViewGroup $r8$lambda$LmTeLRWjdpalOikMV0NSvYAxD_0(androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl r0) {
                android.view.ViewGroup r0 = _splashScreenView_delegate$lambda$0(r0)
                return r0
        }

        public ViewImpl(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.activity = r2
                androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl$$ExternalSyntheticLambda0 r0 = new androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl$$ExternalSyntheticLambda0
                r0.<init>(r1)
                kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
                r1._splashScreenView$delegate = r0
                return
        }

        private static final android.view.ViewGroup _splashScreenView_delegate$lambda$0(androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl r3) {
                android.app.Activity r0 = r3.activity
                android.content.Context r0 = (android.content.Context) r0
                int r1 = androidx.core.splashscreen.R.layout.splash_screen_view
                r2 = 0
                android.view.View r0 = android.widget.FrameLayout.inflate(r0, r1, r2)
                java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                return r0
        }

        private final android.view.ViewGroup get_splashScreenView() {
                r1 = this;
                kotlin.Lazy r0 = r1._splashScreenView$delegate
                java.lang.Object r0 = r0.getValue()
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                return r0
        }

        public void createSplashScreenView() {
                r3 = this;
                android.app.Activity r0 = r3.activity
                r1 = 16908290(0x1020002, float:2.3877235E-38)
                android.view.View r0 = r0.findViewById(r1)
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                android.view.View r1 = r0.getRootView()
                boolean r2 = r1 instanceof android.view.ViewGroup
                if (r2 == 0) goto L16
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                goto L17
            L16:
                r1 = 0
            L17:
                if (r1 == 0) goto L22
                android.view.ViewGroup r2 = r3.get_splashScreenView()
                android.view.View r2 = (android.view.View) r2
                r1.addView(r2)
            L22:
                return
        }

        public final android.app.Activity getActivity() {
                r1 = this;
                android.app.Activity r0 = r1.activity
                return r0
        }

        public long getIconAnimationDurationMillis() {
                r2 = this;
                r0 = 0
                return r0
        }

        public long getIconAnimationStartMillis() {
                r2 = this;
                r0 = 0
                return r0
        }

        public android.view.View getIconView() {
                r2 = this;
                android.view.ViewGroup r0 = r2.getSplashScreenView()
                int r1 = androidx.core.splashscreen.R.id.splashscreen_icon_view
                android.view.View r0 = r0.findViewById(r1)
                java.lang.String r1 = "findViewById(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }

        public android.view.ViewGroup getSplashScreenView() {
                r1 = this;
                android.view.ViewGroup r0 = r1.get_splashScreenView()
                return r0
        }

        public void remove() {
                r2 = this;
                android.view.ViewGroup r0 = r2.getSplashScreenView()
                android.view.ViewParent r0 = r0.getParent()
                boolean r1 = r0 instanceof android.view.ViewGroup
                if (r1 == 0) goto Lf
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                goto L10
            Lf:
                r0 = 0
            L10:
                if (r0 == 0) goto L1b
                android.view.ViewGroup r1 = r2.getSplashScreenView()
                android.view.View r1 = (android.view.View) r1
                r0.removeView(r1)
            L1b:
                return
        }
    }

    /* JADX INFO: compiled from: SplashScreenViewProvider.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl31;", "Landroidx/core/splashscreen/SplashScreenViewProvider$ViewImpl;", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "platformView", "Landroid/window/SplashScreenView;", "getPlatformView", "()Landroid/window/SplashScreenView;", "setPlatformView", "(Landroid/window/SplashScreenView;)V", "createSplashScreenView", "", "splashScreenView", "getSplashScreenView", "iconView", "Landroid/view/View;", "getIconView", "()Landroid/view/View;", "iconAnimationStartMillis", "", "getIconAnimationStartMillis", "()J", "iconAnimationDurationMillis", "getIconAnimationDurationMillis", "remove", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ViewImpl31 extends androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl {
        public android.window.SplashScreenView platformView;

        public ViewImpl31(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>(r2)
                return
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public void createSplashScreenView() {
                r0 = this;
                return
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public long getIconAnimationDurationMillis() {
                r2 = this;
                android.window.SplashScreenView r0 = r2.getPlatformView()
                java.time.Duration r0 = r0.getIconAnimationDuration()
                if (r0 == 0) goto Lf
                long r0 = r0.toMillis()
                goto L11
            Lf:
                r0 = 0
            L11:
                return r0
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public long getIconAnimationStartMillis() {
                r2 = this;
                android.window.SplashScreenView r0 = r2.getPlatformView()
                java.time.Instant r0 = r0.getIconAnimationStart()
                if (r0 == 0) goto Lf
                long r0 = r0.toEpochMilli()
                goto L11
            Lf:
                r0 = 0
            L11:
                return r0
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public android.view.View getIconView() {
                r2 = this;
                android.window.SplashScreenView r0 = r2.getPlatformView()
                android.view.View r0 = r0.getIconView()
                if (r0 == 0) goto L16
                android.window.SplashScreenView r0 = r2.getPlatformView()
                android.view.View r0 = r0.getIconView()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                goto L21
            L16:
                android.view.View r0 = new android.view.View
                android.app.Activity r1 = r2.getActivity()
                android.content.Context r1 = (android.content.Context) r1
                r0.<init>(r1)
            L21:
                return r0
        }

        public final android.window.SplashScreenView getPlatformView() {
                r1 = this;
                android.window.SplashScreenView r0 = r1.platformView
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.String r0 = "platformView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                r0 = 0
                return r0
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public /* bridge */ /* synthetic */ android.view.ViewGroup getSplashScreenView() {
                r1 = this;
                android.window.SplashScreenView r0 = r1.getSplashScreenView()
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                return r0
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public android.window.SplashScreenView getSplashScreenView() {
                r1 = this;
                android.window.SplashScreenView r0 = r1.getPlatformView()
                return r0
        }

        @Override // androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl
        public void remove() {
                r4 = this;
                android.window.SplashScreenView r0 = r4.getPlatformView()
                r0.remove()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 33
                if (r0 >= r1) goto L30
                android.app.Activity r0 = r4.getActivity()
                android.content.res.Resources$Theme r0 = r0.getTheme()
                java.lang.String r1 = "getTheme(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                android.app.Activity r1 = r4.getActivity()
                android.view.Window r1 = r1.getWindow()
                android.view.View r1 = r1.getDecorView()
                java.lang.String r2 = "getDecorView(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                r2 = 4
                r3 = 0
                androidx.core.splashscreen.ThemeUtils.Api31.applyThemesSystemBarAppearance$default(r0, r1, r3, r2, r3)
            L30:
                return
        }

        public final void setPlatformView(android.window.SplashScreenView r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.platformView = r2
                return
        }
    }

    public SplashScreenViewProvider(android.app.Activity r4) {
            r3 = this;
            java.lang.String r0 = "ctx"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r3.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L18
            androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl31 r0 = new androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl31
            r0.<init>(r4)
            androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl r0 = (androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl) r0
            goto L1d
        L18:
            androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl r0 = new androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl
            r0.<init>(r4)
        L1d:
            r1 = r0
            r2 = 0
            r1.createSplashScreenView()
            r3.impl = r0
            return
    }

    public SplashScreenViewProvider(android.window.SplashScreenView r3, android.app.Activity r4) {
            r2 = this;
            java.lang.String r0 = "platformView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "ctx"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r2.<init>(r4)
            androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl r0 = r2.impl
            java.lang.String r1 = "null cannot be cast to non-null type androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl31"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl31 r0 = (androidx.core.splashscreen.SplashScreenViewProvider.ViewImpl31) r0
            r0.setPlatformView(r3)
            return
    }

    public final long getIconAnimationDurationMillis() {
            r2 = this;
            androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl r0 = r2.impl
            long r0 = r0.getIconAnimationDurationMillis()
            return r0
    }

    public final long getIconAnimationStartMillis() {
            r2 = this;
            androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl r0 = r2.impl
            long r0 = r0.getIconAnimationStartMillis()
            return r0
    }

    public final android.view.View getIconView() {
            r1 = this;
            androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl r0 = r1.impl
            android.view.View r0 = r0.getIconView()
            return r0
    }

    public final android.view.View getView() {
            r1 = this;
            androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl r0 = r1.impl
            android.view.ViewGroup r0 = r0.getSplashScreenView()
            android.view.View r0 = (android.view.View) r0
            return r0
    }

    public final void remove() {
            r1 = this;
            androidx.core.splashscreen.SplashScreenViewProvider$ViewImpl r0 = r1.impl
            r0.remove()
            return
    }
}
