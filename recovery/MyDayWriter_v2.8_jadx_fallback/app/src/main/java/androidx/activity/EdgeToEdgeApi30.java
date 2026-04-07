package androidx.activity;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, d2 = {"Landroidx/activity/EdgeToEdgeApi30;", "Landroidx/activity/EdgeToEdgeApi29;", "<init>", "()V", "adjustLayoutInDisplayCutoutMode", "", "window", "Landroid/view/Window;", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class EdgeToEdgeApi30 extends androidx.activity.EdgeToEdgeApi29 {
    public EdgeToEdgeApi30() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.activity.EdgeToEdgeApi28, androidx.activity.EdgeToEdgeBase, androidx.activity.EdgeToEdgeImpl
    public void adjustLayoutInDisplayCutoutMode(android.view.Window r3) {
            r2 = this;
            java.lang.String r0 = "window"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.view.WindowManager$LayoutParams r0 = r3.getAttributes()
            r1 = 3
            r0.layoutInDisplayCutoutMode = r1
            return
    }
}
