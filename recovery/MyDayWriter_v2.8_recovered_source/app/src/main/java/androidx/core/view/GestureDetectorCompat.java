package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class GestureDetectorCompat {
    private final android.view.GestureDetector mDetector;

    public GestureDetectorCompat(android.content.Context r2, android.view.GestureDetector.OnGestureListener r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public GestureDetectorCompat(android.content.Context r2, android.view.GestureDetector.OnGestureListener r3, android.os.Handler r4) {
            r1 = this;
            r1.<init>()
            android.view.GestureDetector r0 = new android.view.GestureDetector
            r0.<init>(r2, r3, r4)
            r1.mDetector = r0
            return
    }

    public boolean isLongpressEnabled() {
            r1 = this;
            android.view.GestureDetector r0 = r1.mDetector
            boolean r0 = r0.isLongpressEnabled()
            return r0
    }

    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.GestureDetector r0 = r1.mDetector
            boolean r0 = r0.onTouchEvent(r2)
            return r0
    }

    public void setIsLongpressEnabled(boolean r2) {
            r1 = this;
            android.view.GestureDetector r0 = r1.mDetector
            r0.setIsLongpressEnabled(r2)
            return
    }

    public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener r2) {
            r1 = this;
            android.view.GestureDetector r0 = r1.mDetector
            r0.setOnDoubleTapListener(r2)
            return
    }
}
