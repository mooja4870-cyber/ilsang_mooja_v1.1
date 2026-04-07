package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class ScaleGestureDetectorCompat {
    private ScaleGestureDetectorCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.ReplaceWith(expression = "scaleGestureDetector.isQuickScaleEnabled()")
    @java.lang.Deprecated
    public static boolean isQuickScaleEnabled(android.view.ScaleGestureDetector r1) {
            boolean r0 = r1.isQuickScaleEnabled()
            return r0
    }

    @java.lang.Deprecated
    public static boolean isQuickScaleEnabled(java.lang.Object r1) {
            r0 = r1
            android.view.ScaleGestureDetector r0 = (android.view.ScaleGestureDetector) r0
            boolean r0 = isQuickScaleEnabled(r0)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "scaleGestureDetector.setQuickScaleEnabled(enabled)")
    @java.lang.Deprecated
    public static void setQuickScaleEnabled(android.view.ScaleGestureDetector r0, boolean r1) {
            r0.setQuickScaleEnabled(r1)
            return
    }

    @java.lang.Deprecated
    public static void setQuickScaleEnabled(java.lang.Object r1, boolean r2) {
            r0 = r1
            android.view.ScaleGestureDetector r0 = (android.view.ScaleGestureDetector) r0
            setQuickScaleEnabled(r0, r2)
            return
    }
}
