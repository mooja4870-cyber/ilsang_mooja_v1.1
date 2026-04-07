package androidx.core.splashscreen;

/* JADX INFO: compiled from: SplashScreen.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/core/splashscreen/SplashScreen;", "", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "impl", "Landroidx/core/splashscreen/SplashScreen$Impl;", "setKeepOnScreenCondition", "", "condition", "Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "setOnExitAnimationListener", "listener", "Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "install", "Companion", "OnExitAnimationListener", "KeepOnScreenCondition", "Impl", "Impl31", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SplashScreen {
    public static final androidx.core.splashscreen.SplashScreen.Companion Companion = null;
    private static final float MASK_FACTOR = 0.6666667f;
    private final androidx.core.splashscreen.SplashScreen.Impl impl;

    /* JADX INFO: compiled from: SplashScreen.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$Companion;", "", "<init>", "()V", "MASK_FACTOR", "", "installSplashScreen", "Landroidx/core/splashscreen/SplashScreen;", "Landroid/app/Activity;", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        public final androidx.core.splashscreen.SplashScreen installSplashScreen(android.app.Activity r3) {
                r2 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                androidx.core.splashscreen.SplashScreen r0 = new androidx.core.splashscreen.SplashScreen
                r1 = 0
                r0.<init>(r3, r1)
                androidx.core.splashscreen.SplashScreen.access$install(r0)
                return r0
        }
    }

    /* JADX INFO: compiled from: SplashScreen.kt */
    @kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010-\u001a\u00020.H\u0016J\u001c\u0010/\u001a\u00020.2\n\u00100\u001a\u000601R\u0002022\u0006\u00103\u001a\u000204H\u0004J\u0010\u00105\u001a\u00020.2\u0006\u00106\u001a\u00020$H\u0016J\u0010\u00107\u001a\u00020.2\u0006\u00108\u001a\u00020*H\u0016J\u0018\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020;2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010<\u001a\u00020.2\u0006\u0010=\u001a\u00020,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$Impl;", "", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "finalThemeId", "", "getFinalThemeId", "()I", "setFinalThemeId", "(I)V", "backgroundResId", "getBackgroundResId", "()Ljava/lang/Integer;", "setBackgroundResId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "backgroundColor", "getBackgroundColor", "setBackgroundColor", "icon", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "hasBackground", "", "getHasBackground", "()Z", "setHasBackground", "(Z)V", "splashScreenWaitPredicate", "Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "getSplashScreenWaitPredicate", "()Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "setSplashScreenWaitPredicate", "(Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;)V", "animationListener", "Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "mSplashScreenViewProvider", "Landroidx/core/splashscreen/SplashScreenViewProvider;", "install", "", "setPostSplashScreenTheme", "currentTheme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "typedValue", "Landroid/util/TypedValue;", "setKeepOnScreenCondition", "keepOnScreenCondition", "setOnExitAnimationListener", "exitAnimationListener", "displaySplashScreenIcon", "splashScreenView", "Landroid/view/View;", "dispatchOnExitAnimation", "splashScreenViewProvider", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static class Impl {
        private final android.app.Activity activity;
        private androidx.core.splashscreen.SplashScreen.OnExitAnimationListener animationListener;
        private java.lang.Integer backgroundColor;
        private java.lang.Integer backgroundResId;
        private int finalThemeId;
        private boolean hasBackground;
        private android.graphics.drawable.Drawable icon;
        private androidx.core.splashscreen.SplashScreenViewProvider mSplashScreenViewProvider;
        private androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition splashScreenWaitPredicate;

        public static /* synthetic */ void $r8$lambda$QxrFMsKW6RjwPtT2TpUYFo1m0HA(androidx.core.splashscreen.SplashScreenViewProvider r0, androidx.core.splashscreen.SplashScreen.OnExitAnimationListener r1) {
                dispatchOnExitAnimation$lambda$3(r0, r1)
                return
        }

        public static /* synthetic */ boolean $r8$lambda$_GEmHzIfsOIitKo3capcUTeFMtU() {
                boolean r0 = splashScreenWaitPredicate$lambda$0()
                return r0
        }

        public Impl(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.activity = r2
                androidx.core.splashscreen.SplashScreen$Impl$$ExternalSyntheticLambda0 r0 = new androidx.core.splashscreen.SplashScreen$Impl$$ExternalSyntheticLambda0
                r0.<init>()
                r1.splashScreenWaitPredicate = r0
                return
        }

        public static final /* synthetic */ androidx.core.splashscreen.SplashScreenViewProvider access$getMSplashScreenViewProvider$p(androidx.core.splashscreen.SplashScreen.Impl r1) {
                androidx.core.splashscreen.SplashScreenViewProvider r0 = r1.mSplashScreenViewProvider
                return r0
        }

        public static final /* synthetic */ void access$setMSplashScreenViewProvider$p(androidx.core.splashscreen.SplashScreen.Impl r0, androidx.core.splashscreen.SplashScreenViewProvider r1) {
                r0.mSplashScreenViewProvider = r1
                return
        }

        private static final void dispatchOnExitAnimation$lambda$3(androidx.core.splashscreen.SplashScreenViewProvider r1, androidx.core.splashscreen.SplashScreen.OnExitAnimationListener r2) {
                android.view.View r0 = r1.getView()
                r0.bringToFront()
                r2.onSplashScreenExit(r1)
                return
        }

        private final void displaySplashScreenIcon(android.view.View r9, android.graphics.drawable.Drawable r10) {
                r8 = this;
                int r0 = androidx.core.splashscreen.R.id.splashscreen_icon_view
                android.view.View r0 = r9.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                r1 = r0
                r2 = 0
                r3 = 0
                boolean r4 = r8.hasBackground
                r5 = 1059760811(0x3f2aaaab, float:0.6666667)
                if (r4 == 0) goto L36
                android.content.Context r4 = r1.getContext()
                int r6 = androidx.core.splashscreen.R.drawable.icon_background
                android.graphics.drawable.Drawable r4 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r4, r6)
                android.content.res.Resources r6 = r1.getResources()
                int r7 = androidx.core.splashscreen.R.dimen.splashscreen_icon_size_with_background
                float r6 = r6.getDimension(r7)
                float r5 = r5 * r6
                if (r4 == 0) goto L42
                androidx.core.splashscreen.MaskedDrawable r3 = new androidx.core.splashscreen.MaskedDrawable
                r3.<init>(r4, r5)
                android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
                r1.setBackground(r3)
                goto L42
            L36:
                android.content.res.Resources r4 = r1.getResources()
                int r6 = androidx.core.splashscreen.R.dimen.splashscreen_icon_size_no_background
                float r4 = r4.getDimension(r6)
                float r5 = r5 * r4
            L42:
                androidx.core.splashscreen.MaskedDrawable r3 = new androidx.core.splashscreen.MaskedDrawable
                r3.<init>(r10, r5)
                android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
                r1.setImageDrawable(r3)
                return
        }

        private static final boolean splashScreenWaitPredicate$lambda$0() {
                r0 = 0
                return r0
        }

        public final void dispatchOnExitAnimation(androidx.core.splashscreen.SplashScreenViewProvider r4) {
                r3 = this;
                java.lang.String r0 = "splashScreenViewProvider"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                androidx.core.splashscreen.SplashScreen$OnExitAnimationListener r0 = r3.animationListener
                if (r0 != 0) goto La
                return
            La:
                r1 = 0
                r3.animationListener = r1
                android.view.View r1 = r4.getView()
                androidx.core.splashscreen.SplashScreen$Impl$$ExternalSyntheticLambda1 r2 = new androidx.core.splashscreen.SplashScreen$Impl$$ExternalSyntheticLambda1
                r2.<init>(r4, r0)
                r1.postOnAnimation(r2)
                return
        }

        public final android.app.Activity getActivity() {
                r1 = this;
                android.app.Activity r0 = r1.activity
                return r0
        }

        public final java.lang.Integer getBackgroundColor() {
                r1 = this;
                java.lang.Integer r0 = r1.backgroundColor
                return r0
        }

        public final java.lang.Integer getBackgroundResId() {
                r1 = this;
                java.lang.Integer r0 = r1.backgroundResId
                return r0
        }

        public final int getFinalThemeId() {
                r1 = this;
                int r0 = r1.finalThemeId
                return r0
        }

        public final boolean getHasBackground() {
                r1 = this;
                boolean r0 = r1.hasBackground
                return r0
        }

        public final android.graphics.drawable.Drawable getIcon() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.icon
                return r0
        }

        public final androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition getSplashScreenWaitPredicate() {
                r1 = this;
                androidx.core.splashscreen.SplashScreen$KeepOnScreenCondition r0 = r1.splashScreenWaitPredicate
                return r0
        }

        public void install() {
                r5 = this;
                android.util.TypedValue r0 = new android.util.TypedValue
                r0.<init>()
                android.app.Activity r1 = r5.activity
                android.content.res.Resources$Theme r1 = r1.getTheme()
                int r2 = androidx.core.splashscreen.R.attr.windowSplashScreenBackground
                r3 = 1
                boolean r2 = r1.resolveAttribute(r2, r0, r3)
                if (r2 == 0) goto L25
                int r2 = r0.resourceId
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r5.backgroundResId = r2
                int r2 = r0.data
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r5.backgroundColor = r2
            L25:
                int r2 = androidx.core.splashscreen.R.attr.windowSplashScreenAnimatedIcon
                boolean r2 = r1.resolveAttribute(r2, r0, r3)
                if (r2 == 0) goto L3d
                android.app.Activity r2 = r5.activity
                android.content.Context r2 = (android.content.Context) r2
                int r4 = r0.resourceId
                android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r2, r4)
                r5.icon = r2
            L3d:
                int r2 = androidx.core.splashscreen.R.attr.splashScreenIconSize
                boolean r2 = r1.resolveAttribute(r2, r0, r3)
                if (r2 == 0) goto L50
            L46:
                int r2 = r0.resourceId
                int r4 = androidx.core.splashscreen.R.dimen.splashscreen_icon_size_with_background
                if (r2 != r4) goto L4d
                goto L4e
            L4d:
                r3 = 0
            L4e:
                r5.hasBackground = r3
            L50:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                r5.setPostSplashScreenTheme(r1, r0)
                return
        }

        public final void setBackgroundColor(java.lang.Integer r1) {
                r0 = this;
                r0.backgroundColor = r1
                return
        }

        public final void setBackgroundResId(java.lang.Integer r1) {
                r0 = this;
                r0.backgroundResId = r1
                return
        }

        public final void setFinalThemeId(int r1) {
                r0 = this;
                r0.finalThemeId = r1
                return
        }

        public final void setHasBackground(boolean r1) {
                r0 = this;
                r0.hasBackground = r1
                return
        }

        public final void setIcon(android.graphics.drawable.Drawable r1) {
                r0 = this;
                r0.icon = r1
                return
        }

        public void setKeepOnScreenCondition(androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition r4) {
                r3 = this;
                java.lang.String r0 = "keepOnScreenCondition"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r3.splashScreenWaitPredicate = r4
                android.app.Activity r0 = r3.activity
                r1 = 16908290(0x1020002, float:2.3877235E-38)
                android.view.View r0 = r0.findViewById(r1)
                android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
                androidx.core.splashscreen.SplashScreen$Impl$setKeepOnScreenCondition$1 r2 = new androidx.core.splashscreen.SplashScreen$Impl$setKeepOnScreenCondition$1
                r2.<init>(r3, r0)
                android.view.ViewTreeObserver$OnPreDrawListener r2 = (android.view.ViewTreeObserver.OnPreDrawListener) r2
                r1.addOnPreDrawListener(r2)
                return
        }

        public void setOnExitAnimationListener(androidx.core.splashscreen.SplashScreen.OnExitAnimationListener r7) {
                r6 = this;
                java.lang.String r0 = "exitAnimationListener"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                r6.animationListener = r7
                androidx.core.splashscreen.SplashScreenViewProvider r0 = new androidx.core.splashscreen.SplashScreenViewProvider
                android.app.Activity r1 = r6.activity
                r0.<init>(r1)
                java.lang.Integer r1 = r6.backgroundResId
                java.lang.Integer r2 = r6.backgroundColor
                android.view.View r3 = r0.getView()
                if (r1 == 0) goto L26
                int r4 = r1.intValue()
                if (r4 == 0) goto L26
                int r4 = r1.intValue()
                r3.setBackgroundResource(r4)
                goto L41
            L26:
                if (r2 == 0) goto L30
                int r4 = r2.intValue()
                r3.setBackgroundColor(r4)
                goto L41
            L30:
                android.app.Activity r4 = r6.activity
                android.view.Window r4 = r4.getWindow()
                android.view.View r4 = r4.getDecorView()
                android.graphics.drawable.Drawable r4 = r4.getBackground()
                r3.setBackground(r4)
            L41:
                android.graphics.drawable.Drawable r4 = r6.icon
                if (r4 == 0) goto L49
                r5 = 0
                r6.displaySplashScreenIcon(r3, r4)
            L49:
                androidx.core.splashscreen.SplashScreen$Impl$setOnExitAnimationListener$2 r4 = new androidx.core.splashscreen.SplashScreen$Impl$setOnExitAnimationListener$2
                r4.<init>(r6, r0)
                android.view.View$OnLayoutChangeListener r4 = (android.view.View.OnLayoutChangeListener) r4
                r3.addOnLayoutChangeListener(r4)
                return
        }

        protected final void setPostSplashScreenTheme(android.content.res.Resources.Theme r3, android.util.TypedValue r4) {
                r2 = this;
                java.lang.String r0 = "currentTheme"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "typedValue"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                int r0 = androidx.core.splashscreen.R.attr.postSplashScreenTheme
                r1 = 1
                boolean r0 = r3.resolveAttribute(r0, r4, r1)
                if (r0 == 0) goto L22
                int r0 = r4.resourceId
                r2.finalThemeId = r0
                int r0 = r2.finalThemeId
                if (r0 == 0) goto L22
                android.app.Activity r0 = r2.activity
                int r1 = r2.finalThemeId
                r0.setTheme(r1)
            L22:
                return
        }

        public final void setSplashScreenWaitPredicate(androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.splashScreenWaitPredicate = r2
                return
        }
    }

    /* JADX INFO: compiled from: SplashScreen.kt */
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001aH\u0002R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Landroidx/core/splashscreen/SplashScreen$Impl31;", "Landroidx/core/splashscreen/SplashScreen$Impl;", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "preDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "getPreDrawListener", "()Landroid/view/ViewTreeObserver$OnPreDrawListener;", "setPreDrawListener", "(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "mDecorFitWindowInsets", "", "getMDecorFitWindowInsets", "()Z", "setMDecorFitWindowInsets", "(Z)V", "hierarchyListener", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "getHierarchyListener", "()Landroid/view/ViewGroup$OnHierarchyChangeListener;", "computeDecorFitsWindow", "child", "Landroid/window/SplashScreenView;", "install", "", "setKeepOnScreenCondition", "keepOnScreenCondition", "Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "setOnExitAnimationListener", "exitAnimationListener", "Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "applyAppSystemUiTheme", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Impl31 extends androidx.core.splashscreen.SplashScreen.Impl {
        private final android.view.ViewGroup.OnHierarchyChangeListener hierarchyListener;
        private boolean mDecorFitWindowInsets;
        private android.view.ViewTreeObserver.OnPreDrawListener preDrawListener;

        public static /* synthetic */ void $r8$lambda$DZFrDuM4AtvN6nNqEUUJzQTdeNI(androidx.core.splashscreen.SplashScreen.Impl31 r0, androidx.core.splashscreen.SplashScreen.OnExitAnimationListener r1, android.window.SplashScreenView r2) {
                setOnExitAnimationListener$lambda$0(r0, r1, r2)
                return
        }

        public Impl31(android.app.Activity r2) {
                r1 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>(r2)
                r0 = 1
                r1.mDecorFitWindowInsets = r0
                androidx.core.splashscreen.SplashScreen$Impl31$hierarchyListener$1 r0 = new androidx.core.splashscreen.SplashScreen$Impl31$hierarchyListener$1
                r0.<init>(r1, r2)
                android.view.ViewGroup$OnHierarchyChangeListener r0 = (android.view.ViewGroup.OnHierarchyChangeListener) r0
                r1.hierarchyListener = r0
                return
        }

        private final void applyAppSystemUiTheme() {
                r5 = this;
                android.util.TypedValue r0 = new android.util.TypedValue
                r0.<init>()
                android.app.Activity r1 = r5.getActivity()
                android.content.res.Resources$Theme r1 = r1.getTheme()
                android.app.Activity r2 = r5.getActivity()
                android.view.Window r2 = r2.getWindow()
                r3 = 16843857(0x1010451, float:2.3696655E-38)
                r4 = 1
                boolean r3 = r1.resolveAttribute(r3, r0, r4)
                if (r3 == 0) goto L24
                int r3 = r0.data
                r2.setStatusBarColor(r3)
            L24:
                r3 = 16843858(0x1010452, float:2.3696658E-38)
                boolean r3 = r1.resolveAttribute(r3, r0, r4)
                if (r3 == 0) goto L32
                int r3 = r0.data
                r2.setNavigationBarColor(r3)
            L32:
                r3 = 16843856(0x1010450, float:2.3696652E-38)
                boolean r3 = r1.resolveAttribute(r3, r0, r4)
                if (r3 == 0) goto L48
                int r3 = r0.data
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r3 == 0) goto L45
                r2.addFlags(r4)
                goto L48
            L45:
                r2.clearFlags(r4)
            L48:
                android.view.View r3 = r2.getDecorView()
                java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                r4 = r3
                android.view.View r4 = (android.view.View) r4
                androidx.core.splashscreen.ThemeUtils.Api31.applyThemesSystemBarAppearance(r1, r4, r0)
                r4 = 0
                r3.setOnHierarchyChangeListener(r4)
                boolean r4 = r5.mDecorFitWindowInsets
                r2.setDecorFitsSystemWindows(r4)
                return
        }

        private static final void setOnExitAnimationListener$lambda$0(androidx.core.splashscreen.SplashScreen.Impl31 r2, androidx.core.splashscreen.SplashScreen.OnExitAnimationListener r3, android.window.SplashScreenView r4) {
                java.lang.String r0 = "splashScreenView"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 33
                if (r0 >= r1) goto Le
                r2.applyAppSystemUiTheme()
            Le:
                androidx.core.splashscreen.SplashScreenViewProvider r0 = new androidx.core.splashscreen.SplashScreenViewProvider
                android.app.Activity r1 = r2.getActivity()
                r0.<init>(r4, r1)
                r3.onSplashScreenExit(r0)
                return
        }

        public final boolean computeDecorFitsWindow(android.window.SplashScreenView r5) {
                r4 = this;
                java.lang.String r0 = "child"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                r0.<init>()
                android.view.WindowInsets r0 = r0.build()
                java.lang.String r1 = "build(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                android.graphics.Rect r1 = new android.graphics.Rect
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 2147483647(0x7fffffff, float:NaN)
                r1.<init>(r2, r2, r3, r3)
                android.view.View r2 = r5.getRootView()
                android.view.WindowInsets r2 = r2.computeSystemWindowInsets(r0, r1)
                if (r0 != r2) goto L31
                boolean r2 = r1.isEmpty()
                if (r2 != 0) goto L2f
                goto L31
            L2f:
                r2 = 0
                goto L32
            L31:
                r2 = 1
            L32:
                return r2
        }

        public final android.view.ViewGroup.OnHierarchyChangeListener getHierarchyListener() {
                r1 = this;
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r1.hierarchyListener
                return r0
        }

        public final boolean getMDecorFitWindowInsets() {
                r1 = this;
                boolean r0 = r1.mDecorFitWindowInsets
                return r0
        }

        public final android.view.ViewTreeObserver.OnPreDrawListener getPreDrawListener() {
                r1 = this;
                android.view.ViewTreeObserver$OnPreDrawListener r0 = r1.preDrawListener
                return r0
        }

        @Override // androidx.core.splashscreen.SplashScreen.Impl
        public void install() {
                r2 = this;
                android.app.Activity r0 = r2.getActivity()
                android.content.res.Resources$Theme r0 = r0.getTheme()
                java.lang.String r1 = "getTheme(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                android.util.TypedValue r1 = new android.util.TypedValue
                r1.<init>()
                r2.setPostSplashScreenTheme(r0, r1)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 33
                if (r0 >= r1) goto L33
                android.app.Activity r0 = r2.getActivity()
                android.view.Window r0 = r0.getWindow()
                android.view.View r0 = r0.getDecorView()
                java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                android.view.ViewGroup$OnHierarchyChangeListener r1 = r2.hierarchyListener
                r0.setOnHierarchyChangeListener(r1)
            L33:
                return
        }

        @Override // androidx.core.splashscreen.SplashScreen.Impl
        public void setKeepOnScreenCondition(androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition r4) {
                r3 = this;
                java.lang.String r0 = "keepOnScreenCondition"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r3.setSplashScreenWaitPredicate(r4)
                android.app.Activity r0 = r3.getActivity()
                r1 = 16908290(0x1020002, float:2.3877235E-38)
                android.view.View r0 = r0.findViewById(r1)
                android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
                android.view.ViewTreeObserver$OnPreDrawListener r2 = r3.preDrawListener
                if (r2 == 0) goto L26
                boolean r2 = r1.isAlive()
                if (r2 == 0) goto L26
                android.view.ViewTreeObserver$OnPreDrawListener r2 = r3.preDrawListener
                r1.removeOnPreDrawListener(r2)
            L26:
                androidx.core.splashscreen.SplashScreen$Impl31$setKeepOnScreenCondition$1 r2 = new androidx.core.splashscreen.SplashScreen$Impl31$setKeepOnScreenCondition$1
                r2.<init>(r3, r0)
                android.view.ViewTreeObserver$OnPreDrawListener r2 = (android.view.ViewTreeObserver.OnPreDrawListener) r2
                r3.preDrawListener = r2
                android.view.ViewTreeObserver$OnPreDrawListener r2 = r3.preDrawListener
                r1.addOnPreDrawListener(r2)
                return
        }

        public final void setMDecorFitWindowInsets(boolean r1) {
                r0 = this;
                r0.mDecorFitWindowInsets = r1
                return
        }

        @Override // androidx.core.splashscreen.SplashScreen.Impl
        public void setOnExitAnimationListener(androidx.core.splashscreen.SplashScreen.OnExitAnimationListener r3) {
                r2 = this;
                java.lang.String r0 = "exitAnimationListener"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                android.app.Activity r0 = r2.getActivity()
                android.window.SplashScreen r0 = r0.getSplashScreen()
                androidx.core.splashscreen.SplashScreen$Impl31$$ExternalSyntheticLambda0 r1 = new androidx.core.splashscreen.SplashScreen$Impl31$$ExternalSyntheticLambda0
                r1.<init>(r2, r3)
                r0.setOnExitAnimationListener(r1)
                return
        }

        public final void setPreDrawListener(android.view.ViewTreeObserver.OnPreDrawListener r1) {
                r0 = this;
                r0.preDrawListener = r1
                return
        }
    }

    /* JADX INFO: compiled from: SplashScreen.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$KeepOnScreenCondition;", "", "shouldKeepOnScreen", "", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface KeepOnScreenCondition {
        boolean shouldKeepOnScreen();
    }

    /* JADX INFO: compiled from: SplashScreen.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/core/splashscreen/SplashScreen$OnExitAnimationListener;", "", "onSplashScreenExit", "", "splashScreenViewProvider", "Landroidx/core/splashscreen/SplashScreenViewProvider;", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnExitAnimationListener {
        void onSplashScreenExit(androidx.core.splashscreen.SplashScreenViewProvider r1);
    }

    static {
            androidx.core.splashscreen.SplashScreen$Companion r0 = new androidx.core.splashscreen.SplashScreen$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.core.splashscreen.SplashScreen.Companion = r0
            return
    }

    private SplashScreen(android.app.Activity r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L12
            androidx.core.splashscreen.SplashScreen$Impl31 r0 = new androidx.core.splashscreen.SplashScreen$Impl31
            r0.<init>(r3)
            androidx.core.splashscreen.SplashScreen$Impl r0 = (androidx.core.splashscreen.SplashScreen.Impl) r0
            goto L17
        L12:
            androidx.core.splashscreen.SplashScreen$Impl r0 = new androidx.core.splashscreen.SplashScreen$Impl
            r0.<init>(r3)
        L17:
            r2.impl = r0
            return
    }

    public /* synthetic */ SplashScreen(android.app.Activity r1, kotlin.jvm.internal.DefaultConstructorMarker r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static final /* synthetic */ void access$install(androidx.core.splashscreen.SplashScreen r0) {
            r0.install()
            return
    }

    private final void install() {
            r1 = this;
            androidx.core.splashscreen.SplashScreen$Impl r0 = r1.impl
            r0.install()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.core.splashscreen.SplashScreen installSplashScreen(android.app.Activity r1) {
            androidx.core.splashscreen.SplashScreen$Companion r0 = androidx.core.splashscreen.SplashScreen.Companion
            androidx.core.splashscreen.SplashScreen r0 = r0.installSplashScreen(r1)
            return r0
    }

    public final void setKeepOnScreenCondition(androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition r2) {
            r1 = this;
            java.lang.String r0 = "condition"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.core.splashscreen.SplashScreen$Impl r0 = r1.impl
            r0.setKeepOnScreenCondition(r2)
            return
    }

    public final void setOnExitAnimationListener(androidx.core.splashscreen.SplashScreen.OnExitAnimationListener r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.core.splashscreen.SplashScreen$Impl r0 = r1.impl
            r0.setOnExitAnimationListener(r2)
            return
    }
}
