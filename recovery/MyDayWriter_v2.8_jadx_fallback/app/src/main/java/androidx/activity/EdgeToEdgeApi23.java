package androidx.activity;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¨\u0006\u0010"}, d2 = {"Landroidx/activity/EdgeToEdgeApi23;", "Landroidx/activity/EdgeToEdgeBase;", "<init>", "()V", "setUp", "", "statusBarStyle", "Landroidx/activity/SystemBarStyle;", "navigationBarStyle", "window", "Landroid/view/Window;", "view", "Landroid/view/View;", "statusBarIsDark", "", "navigationBarIsDark", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class EdgeToEdgeApi23 extends androidx.activity.EdgeToEdgeBase {
    public EdgeToEdgeApi23() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.activity.EdgeToEdgeBase, androidx.activity.EdgeToEdgeImpl
    public void setUp(androidx.activity.SystemBarStyle r3, androidx.activity.SystemBarStyle r4, android.view.Window r5, android.view.View r6, boolean r7, boolean r8) {
            r2 = this;
            java.lang.String r0 = "statusBarStyle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "navigationBarStyle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "window"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            androidx.core.view.WindowCompat.setDecorFitsSystemWindows(r5, r0)
            int r0 = r3.getScrim$activity_release(r7)
            r5.setStatusBarColor(r0)
            int r0 = r4.getDarkScrim$activity_release()
            r5.setNavigationBarColor(r0)
            androidx.core.view.WindowInsetsControllerCompat r0 = new androidx.core.view.WindowInsetsControllerCompat
            r0.<init>(r5, r6)
            r1 = r7 ^ 1
            r0.setAppearanceLightStatusBars(r1)
            return
    }
}
