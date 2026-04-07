package androidx.activity;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¨\u0006\u0010"}, d2 = {"Landroidx/activity/EdgeToEdgeApi26;", "Landroidx/activity/EdgeToEdgeBase;", "<init>", "()V", "setUp", "", "statusBarStyle", "Landroidx/activity/SystemBarStyle;", "navigationBarStyle", "window", "Landroid/view/Window;", "view", "Landroid/view/View;", "statusBarIsDark", "", "navigationBarIsDark", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
class EdgeToEdgeApi26 extends androidx.activity.EdgeToEdgeBase {
    public EdgeToEdgeApi26() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.activity.EdgeToEdgeBase, androidx.activity.EdgeToEdgeImpl
    public void setUp(androidx.activity.SystemBarStyle r4, androidx.activity.SystemBarStyle r5, android.view.Window r6, android.view.View r7, boolean r8, boolean r9) {
            r3 = this;
            java.lang.String r0 = "statusBarStyle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "navigationBarStyle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "window"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            androidx.core.view.WindowCompat.setDecorFitsSystemWindows(r6, r0)
            int r0 = r4.getScrim$activity_release(r8)
            r6.setStatusBarColor(r0)
            int r0 = r5.getScrim$activity_release(r9)
            r6.setNavigationBarColor(r0)
            androidx.core.view.WindowInsetsControllerCompat r0 = new androidx.core.view.WindowInsetsControllerCompat
            r0.<init>(r6, r7)
            r1 = 0
            r2 = r8 ^ 1
            r0.setAppearanceLightStatusBars(r2)
            r2 = r9 ^ 1
            r0.setAppearanceLightNavigationBars(r2)
            return
    }
}
