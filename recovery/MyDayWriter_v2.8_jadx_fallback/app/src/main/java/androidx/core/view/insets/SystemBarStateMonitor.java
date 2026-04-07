package androidx.core.view.insets;

/* JADX INFO: loaded from: classes.dex */
class SystemBarStateMonitor {
    private final java.util.ArrayList<androidx.core.view.insets.SystemBarStateMonitor.Callback> mCallbacks;
    private int mColorHint;
    private final android.view.View mDetector;
    private androidx.core.graphics.Insets mInsets;
    private androidx.core.graphics.Insets mInsetsIgnoringVisibility;



    interface Callback {
        void onAnimationEnd();

        void onAnimationProgress(int r1, androidx.core.graphics.Insets r2, android.graphics.RectF r3);

        void onAnimationStart();

        void onColorHintChanged(int r1);

        void onInsetsChanged(androidx.core.graphics.Insets r1, androidx.core.graphics.Insets r2);
    }

    SystemBarStateMonitor(android.view.ViewGroup r5) {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.mCallbacks = r0
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
            r4.mInsets = r0
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
            r4.mInsetsIgnoringVisibility = r0
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            boolean r1 = r0 instanceof android.graphics.drawable.ColorDrawable
            r2 = 0
            if (r1 == 0) goto L23
            r1 = r0
            android.graphics.drawable.ColorDrawable r1 = (android.graphics.drawable.ColorDrawable) r1
            int r1 = r1.getColor()
            goto L24
        L23:
            r1 = r2
        L24:
            r4.mColorHint = r1
            androidx.core.view.insets.SystemBarStateMonitor$1 r1 = new androidx.core.view.insets.SystemBarStateMonitor$1
            android.content.Context r3 = r5.getContext()
            r1.<init>(r4, r3, r5)
            r4.mDetector = r1
            android.view.View r1 = r4.mDetector
            r3 = 1
            r1.setWillNotDraw(r3)
            android.view.View r1 = r4.mDetector
            androidx.core.view.insets.SystemBarStateMonitor$$ExternalSyntheticLambda0 r3 = new androidx.core.view.insets.SystemBarStateMonitor$$ExternalSyntheticLambda0
            r3.<init>(r4)
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r1, r3)
            android.view.View r1 = r4.mDetector
            androidx.core.view.insets.SystemBarStateMonitor$2 r3 = new androidx.core.view.insets.SystemBarStateMonitor$2
            r3.<init>(r4, r2)
            androidx.core.view.ViewCompat.setWindowInsetsAnimationCallback(r1, r3)
            android.view.View r1 = r4.mDetector
            r5.addView(r1, r2)
            return
    }

    static /* synthetic */ int access$000(androidx.core.view.insets.SystemBarStateMonitor r1) {
            int r0 = r1.mColorHint
            return r0
    }

    static /* synthetic */ int access$002(androidx.core.view.insets.SystemBarStateMonitor r0, int r1) {
            r0.mColorHint = r1
            return r1
    }

    static /* synthetic */ java.util.ArrayList access$100(androidx.core.view.insets.SystemBarStateMonitor r1) {
            java.util.ArrayList<androidx.core.view.insets.SystemBarStateMonitor$Callback> r0 = r1.mCallbacks
            return r0
    }

    static /* synthetic */ androidx.core.graphics.Insets access$200(androidx.core.view.insets.SystemBarStateMonitor r1, androidx.core.view.WindowInsetsCompat r2) {
            androidx.core.graphics.Insets r0 = r1.getInsets(r2)
            return r0
    }

    private androidx.core.graphics.Insets getInsets(androidx.core.view.WindowInsetsCompat r4) {
            r3 = this;
            int r0 = androidx.core.view.WindowInsetsCompat.Type.systemBars()
            androidx.core.graphics.Insets r0 = r4.getInsets(r0)
            int r1 = androidx.core.view.WindowInsetsCompat.Type.tappableElement()
            androidx.core.graphics.Insets r1 = r4.getInsets(r1)
            androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.min(r0, r1)
            return r2
    }

    private androidx.core.graphics.Insets getInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat r4) {
            r3 = this;
            int r0 = androidx.core.view.WindowInsetsCompat.Type.systemBars()
            androidx.core.graphics.Insets r0 = r4.getInsetsIgnoringVisibility(r0)
            int r1 = androidx.core.view.WindowInsetsCompat.Type.tappableElement()
            androidx.core.graphics.Insets r1 = r4.getInsetsIgnoringVisibility(r1)
            androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.min(r0, r1)
            return r2
    }

    void addCallback(androidx.core.view.insets.SystemBarStateMonitor.Callback r3) {
            r2 = this;
            java.util.ArrayList<androidx.core.view.insets.SystemBarStateMonitor$Callback> r0 = r2.mCallbacks
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L9
            return
        L9:
            java.util.ArrayList<androidx.core.view.insets.SystemBarStateMonitor$Callback> r0 = r2.mCallbacks
            r0.add(r3)
            androidx.core.graphics.Insets r0 = r2.mInsets
            androidx.core.graphics.Insets r1 = r2.mInsetsIgnoringVisibility
            r3.onInsetsChanged(r0, r1)
            int r0 = r2.mColorHint
            r3.onColorHintChanged(r0)
            return
    }

    void detachFromWindow() {
            r2 = this;
            android.view.View r0 = r2.mDetector
            androidx.core.view.insets.SystemBarStateMonitor$$ExternalSyntheticLambda1 r1 = new androidx.core.view.insets.SystemBarStateMonitor$$ExternalSyntheticLambda1
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    boolean hasCallback() {
            r1 = this;
            java.util.ArrayList<androidx.core.view.insets.SystemBarStateMonitor$Callback> r0 = r1.mCallbacks
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: lambda$detachFromWindow$1$androidx-core-view-insets-SystemBarStateMonitor, reason: not valid java name */
    /* synthetic */ void m73xf3edbe07() {
            r3 = this;
            android.view.View r0 = r3.mDetector
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L12
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r2 = r3.mDetector
            r1.removeView(r2)
        L12:
            return
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-core-view-insets-SystemBarStateMonitor, reason: not valid java name */
    /* synthetic */ androidx.core.view.WindowInsetsCompat m74lambda$new$0$androidxcoreviewinsetsSystemBarStateMonitor(android.view.View r5, androidx.core.view.WindowInsetsCompat r6) {
            r4 = this;
            androidx.core.graphics.Insets r0 = r4.getInsets(r6)
            androidx.core.graphics.Insets r1 = r4.getInsetsIgnoringVisibility(r6)
            androidx.core.graphics.Insets r2 = r4.mInsets
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L18
            androidx.core.graphics.Insets r2 = r4.mInsetsIgnoringVisibility
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L34
        L18:
            r4.mInsets = r0
            r4.mInsetsIgnoringVisibility = r1
            java.util.ArrayList<androidx.core.view.insets.SystemBarStateMonitor$Callback> r2 = r4.mCallbacks
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L24:
            if (r2 < 0) goto L34
            java.util.ArrayList<androidx.core.view.insets.SystemBarStateMonitor$Callback> r3 = r4.mCallbacks
            java.lang.Object r3 = r3.get(r2)
            androidx.core.view.insets.SystemBarStateMonitor$Callback r3 = (androidx.core.view.insets.SystemBarStateMonitor.Callback) r3
            r3.onInsetsChanged(r0, r1)
            int r2 = r2 + (-1)
            goto L24
        L34:
            return r6
    }

    void removeCallback(androidx.core.view.insets.SystemBarStateMonitor.Callback r2) {
            r1 = this;
            java.util.ArrayList<androidx.core.view.insets.SystemBarStateMonitor$Callback> r0 = r1.mCallbacks
            r0.remove(r2)
            return
    }
}
