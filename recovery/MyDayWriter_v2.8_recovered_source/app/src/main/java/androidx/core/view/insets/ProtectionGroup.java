package androidx.core.view.insets;

/* JADX INFO: loaded from: classes.dex */
class ProtectionGroup implements androidx.core.view.insets.SystemBarStateMonitor.Callback {
    private int mAnimationCount;
    private boolean mDisposed;
    private androidx.core.graphics.Insets mInsets;
    private androidx.core.graphics.Insets mInsetsIgnoringVisibility;
    private final androidx.core.view.insets.SystemBarStateMonitor mMonitor;
    private final java.util.ArrayList<androidx.core.view.insets.Protection> mProtections;

    ProtectionGroup(androidx.core.view.insets.SystemBarStateMonitor r2, java.util.List<androidx.core.view.insets.Protection> r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mProtections = r0
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
            r1.mInsets = r0
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
            r1.mInsetsIgnoringVisibility = r0
            r0 = 0
            r1.addProtections(r3, r0)
            r0 = 1
            r1.addProtections(r3, r0)
            r2.addCallback(r1)
            r1.mMonitor = r2
            return
    }

    private void addProtections(java.util.List<androidx.core.view.insets.Protection> r8, boolean r9) {
            r7 = this;
            int r0 = r8.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L42
            java.lang.Object r2 = r8.get(r1)
            androidx.core.view.insets.Protection r2 = (androidx.core.view.insets.Protection) r2
            boolean r3 = r2.occupiesCorners()
            if (r3 == r9) goto L14
            goto L22
        L14:
            java.lang.Object r3 = r2.getController()
            if (r3 != 0) goto L25
            r2.setController(r7)
            java.util.ArrayList<androidx.core.view.insets.Protection> r4 = r7.mProtections
            r4.add(r2)
        L22:
            int r1 = r1 + 1
            goto L5
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r6 = " is already controlled by "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L42:
            return
    }

    private void updateInsets() {
            r5 = this;
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
            java.util.ArrayList<androidx.core.view.insets.Protection> r1 = r5.mProtections
            int r1 = r1.size()
            int r1 = r1 + (-1)
        La:
            if (r1 < 0) goto L23
            java.util.ArrayList<androidx.core.view.insets.Protection> r2 = r5.mProtections
            java.lang.Object r2 = r2.get(r1)
            androidx.core.view.insets.Protection r2 = (androidx.core.view.insets.Protection) r2
            androidx.core.graphics.Insets r3 = r5.mInsets
            androidx.core.graphics.Insets r4 = r5.mInsetsIgnoringVisibility
            androidx.core.graphics.Insets r3 = r2.dispatchInsets(r3, r4, r0)
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.max(r0, r3)
            int r1 = r1 + (-1)
            goto La
        L23:
            return
    }

    void dispose() {
            r3 = this;
            boolean r0 = r3.mDisposed
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.mDisposed = r0
            androidx.core.view.insets.SystemBarStateMonitor r1 = r3.mMonitor
            r1.removeCallback(r3)
            java.util.ArrayList<androidx.core.view.insets.Protection> r1 = r3.mProtections
            int r1 = r1.size()
            int r1 = r1 - r0
        L14:
            if (r1 < 0) goto L25
            java.util.ArrayList<androidx.core.view.insets.Protection> r0 = r3.mProtections
            java.lang.Object r0 = r0.get(r1)
            androidx.core.view.insets.Protection r0 = (androidx.core.view.insets.Protection) r0
            r2 = 0
            r0.setController(r2)
            int r1 = r1 + (-1)
            goto L14
        L25:
            java.util.ArrayList<androidx.core.view.insets.Protection> r0 = r3.mProtections
            r0.clear()
            return
    }

    androidx.core.view.insets.Protection getProtection(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.core.view.insets.Protection> r0 = r1.mProtections
            java.lang.Object r0 = r0.get(r2)
            androidx.core.view.insets.Protection r0 = (androidx.core.view.insets.Protection) r0
            return r0
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void onAnimationEnd() {
            r3 = this;
            int r0 = r3.mAnimationCount
            r1 = 1
            if (r0 <= 0) goto L7
            r0 = r1
            goto L8
        L7:
            r0 = 0
        L8:
            int r2 = r3.mAnimationCount
            int r2 = r2 - r1
            r3.mAnimationCount = r2
            if (r0 == 0) goto L16
            int r1 = r3.mAnimationCount
            if (r1 != 0) goto L16
            r3.updateInsets()
        L16:
            return
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void onAnimationProgress(int r8, androidx.core.graphics.Insets r9, android.graphics.RectF r10) {
            r7 = this;
            androidx.core.graphics.Insets r0 = r7.mInsetsIgnoringVisibility
            java.util.ArrayList<androidx.core.view.insets.Protection> r1 = r7.mProtections
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
        La:
            if (r1 < 0) goto L77
            java.util.ArrayList<androidx.core.view.insets.Protection> r3 = r7.mProtections
            java.lang.Object r3 = r3.get(r1)
            androidx.core.view.insets.Protection r3 = (androidx.core.view.insets.Protection) r3
            int r4 = r3.getSide()
            r5 = r4 & r8
            if (r5 != 0) goto L1d
            goto L74
        L1d:
            r3.setSystemVisible(r2)
            switch(r4) {
                case 1: goto L60;
                case 2: goto L4c;
                case 4: goto L38;
                case 8: goto L24;
                default: goto L23;
            }
        L23:
            goto L74
        L24:
            int r5 = r0.bottom
            if (r5 <= 0) goto L32
            int r5 = r9.bottom
            float r5 = (float) r5
            int r6 = r0.bottom
            float r6 = (float) r6
            float r5 = r5 / r6
            r3.setSystemInsetAmount(r5)
        L32:
            float r5 = r10.bottom
            r3.setSystemAlpha(r5)
            goto L74
        L38:
            int r5 = r0.right
            if (r5 <= 0) goto L46
            int r5 = r9.right
            float r5 = (float) r5
            int r6 = r0.right
            float r6 = (float) r6
            float r5 = r5 / r6
            r3.setSystemInsetAmount(r5)
        L46:
            float r5 = r10.right
            r3.setSystemAlpha(r5)
            goto L74
        L4c:
            int r5 = r0.top
            if (r5 <= 0) goto L5a
            int r5 = r9.top
            float r5 = (float) r5
            int r6 = r0.top
            float r6 = (float) r6
            float r5 = r5 / r6
            r3.setSystemInsetAmount(r5)
        L5a:
            float r5 = r10.top
            r3.setSystemAlpha(r5)
            goto L74
        L60:
            int r5 = r0.left
            if (r5 <= 0) goto L6e
            int r5 = r9.left
            float r5 = (float) r5
            int r6 = r0.left
            float r6 = (float) r6
            float r5 = r5 / r6
            r3.setSystemInsetAmount(r5)
        L6e:
            float r5 = r10.left
            r3.setSystemAlpha(r5)
        L74:
            int r1 = r1 + (-1)
            goto La
        L77:
            return
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void onAnimationStart() {
            r1 = this;
            int r0 = r1.mAnimationCount
            int r0 = r0 + 1
            r1.mAnimationCount = r0
            return
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void onColorHintChanged(int r3) {
            r2 = this;
            java.util.ArrayList<androidx.core.view.insets.Protection> r0 = r2.mProtections
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L18
            java.util.ArrayList<androidx.core.view.insets.Protection> r1 = r2.mProtections
            java.lang.Object r1 = r1.get(r0)
            androidx.core.view.insets.Protection r1 = (androidx.core.view.insets.Protection) r1
            r1.dispatchColorHint(r3)
            int r0 = r0 + (-1)
            goto L8
        L18:
            return
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public void onInsetsChanged(androidx.core.graphics.Insets r1, androidx.core.graphics.Insets r2) {
            r0 = this;
            r0.mInsets = r1
            r0.mInsetsIgnoringVisibility = r2
            r0.updateInsets()
            return
    }

    int size() {
            r1 = this;
            java.util.ArrayList<androidx.core.view.insets.Protection> r0 = r1.mProtections
            int r0 = r0.size()
            return r0
    }
}
