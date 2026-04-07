package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollingChildHelper {
    private boolean mIsNestedScrollingEnabled;
    private android.view.ViewParent mNestedScrollingParentNonTouch;
    private android.view.ViewParent mNestedScrollingParentTouch;
    private int[] mTempNestedScrollConsumed;
    private final android.view.View mView;

    public NestedScrollingChildHelper(android.view.View r1) {
            r0 = this;
            r0.<init>()
            r0.mView = r1
            return
    }

    private boolean dispatchNestedScrollInternal(int r14, int r15, int r16, int r17, int[] r18, int r19, int[] r20) {
            r13 = this;
            r0 = r18
            boolean r1 = r13.isNestedScrollingEnabled()
            r2 = 0
            if (r1 == 0) goto L60
            r9 = r19
            android.view.ViewParent r3 = r13.getNestedScrollingParentForType(r9)
            if (r3 != 0) goto L12
            return r2
        L12:
            r1 = 1
            if (r14 != 0) goto L23
            if (r15 != 0) goto L23
            if (r16 != 0) goto L23
            if (r17 == 0) goto L1c
            goto L23
        L1c:
            if (r0 == 0) goto L60
            r0[r2] = r2
            r0[r1] = r2
            goto L60
        L23:
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L33
            android.view.View r6 = r13.mView
            r6.getLocationInWindow(r0)
            r4 = r0[r2]
            r5 = r0[r1]
            r11 = r4
            r12 = r5
            goto L35
        L33:
            r11 = r4
            r12 = r5
        L35:
            if (r20 != 0) goto L41
            int[] r4 = r13.getTempNestedScrollConsumed()
            r4[r2] = r2
            r4[r1] = r2
            r10 = r4
            goto L43
        L41:
            r10 = r20
        L43:
            android.view.View r4 = r13.mView
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            androidx.core.view.ViewParentCompat.onNestedScroll(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L5f
            android.view.View r4 = r13.mView
            r4.getLocationInWindow(r0)
            r4 = r0[r2]
            int r4 = r4 - r11
            r0[r2] = r4
            r2 = r0[r1]
            int r2 = r2 - r12
            r0[r1] = r2
        L5f:
            return r1
        L60:
            return r2
    }

    private android.view.ViewParent getNestedScrollingParentForType(int r2) {
            r1 = this;
            switch(r2) {
                case 0: goto L8;
                case 1: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            android.view.ViewParent r0 = r1.mNestedScrollingParentNonTouch
            return r0
        L8:
            android.view.ViewParent r0 = r1.mNestedScrollingParentTouch
            return r0
    }

    private int[] getTempNestedScrollConsumed() {
            r1 = this;
            int[] r0 = r1.mTempNestedScrollConsumed
            if (r0 != 0) goto L9
            r0 = 2
            int[] r0 = new int[r0]
            r1.mTempNestedScrollConsumed = r0
        L9:
            int[] r0 = r1.mTempNestedScrollConsumed
            return r0
    }

    private void setNestedScrollingParentForType(int r1, android.view.ViewParent r2) {
            r0 = this;
            switch(r1) {
                case 0: goto L7;
                case 1: goto L4;
                default: goto L3;
            }
        L3:
            goto La
        L4:
            r0.mNestedScrollingParentNonTouch = r2
            goto La
        L7:
            r0.mNestedScrollingParentTouch = r2
        La:
            return
    }

    public boolean dispatchNestedFling(float r3, float r4, boolean r5) {
            r2 = this;
            boolean r0 = r2.isNestedScrollingEnabled()
            r1 = 0
            if (r0 == 0) goto L14
            android.view.ViewParent r0 = r2.getNestedScrollingParentForType(r1)
            if (r0 == 0) goto L14
            android.view.View r1 = r2.mView
            boolean r1 = androidx.core.view.ViewParentCompat.onNestedFling(r0, r1, r3, r4, r5)
            return r1
        L14:
            return r1
    }

    public boolean dispatchNestedPreFling(float r3, float r4) {
            r2 = this;
            boolean r0 = r2.isNestedScrollingEnabled()
            r1 = 0
            if (r0 == 0) goto L14
            android.view.ViewParent r0 = r2.getNestedScrollingParentForType(r1)
            if (r0 == 0) goto L14
            android.view.View r1 = r2.mView
            boolean r1 = androidx.core.view.ViewParentCompat.onNestedPreFling(r0, r1, r3, r4)
            return r1
        L14:
            return r1
    }

    public boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r7 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            return r7
    }

    public boolean dispatchNestedPreScroll(int r11, int r12, int[] r13, int[] r14, int r15) {
            r10 = this;
            boolean r0 = r10.isNestedScrollingEnabled()
            r1 = 0
            if (r0 == 0) goto L64
            android.view.ViewParent r2 = r10.getNestedScrollingParentForType(r15)
            if (r2 != 0) goto Le
            return r1
        Le:
            r0 = 1
            if (r11 != 0) goto L22
            if (r12 == 0) goto L14
            goto L22
        L14:
            if (r14 == 0) goto L1e
            r14[r1] = r1
            r14[r0] = r1
            r4 = r11
            r5 = r12
            r7 = r15
            goto L67
        L1e:
            r4 = r11
            r5 = r12
            r7 = r15
            goto L67
        L22:
            r3 = 0
            r4 = 0
            if (r14 == 0) goto L32
            android.view.View r5 = r10.mView
            r5.getLocationInWindow(r14)
            r3 = r14[r1]
            r4 = r14[r0]
            r8 = r3
            r9 = r4
            goto L34
        L32:
            r8 = r3
            r9 = r4
        L34:
            if (r13 != 0) goto L3c
            int[] r13 = r10.getTempNestedScrollConsumed()
            r6 = r13
            goto L3d
        L3c:
            r6 = r13
        L3d:
            r6[r1] = r1
            r6[r0] = r1
            android.view.View r3 = r10.mView
            r4 = r11
            r5 = r12
            r7 = r15
            androidx.core.view.ViewParentCompat.onNestedPreScroll(r2, r3, r4, r5, r6, r7)
            if (r14 == 0) goto L5a
            android.view.View r11 = r10.mView
            r11.getLocationInWindow(r14)
            r11 = r14[r1]
            int r11 = r11 - r8
            r14[r1] = r11
            r11 = r14[r0]
            int r11 = r11 - r9
            r14[r0] = r11
        L5a:
            r11 = r6[r1]
            if (r11 != 0) goto L62
            r11 = r6[r0]
            if (r11 == 0) goto L63
        L62:
            r1 = r0
        L63:
            return r1
        L64:
            r4 = r11
            r5 = r12
            r7 = r15
        L67:
            return r1
    }

    public void dispatchNestedScroll(int r1, int r2, int r3, int r4, int[] r5, int r6, int[] r7) {
            r0 = this;
            r0.dispatchNestedScrollInternal(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
            r8 = this;
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            boolean r9 = r0.dispatchNestedScrollInternal(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    public boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13, int r14) {
            r8 = this;
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            boolean r9 = r0.dispatchNestedScrollInternal(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    public boolean hasNestedScrollingParent() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.hasNestedScrollingParent(r0)
            return r0
    }

    public boolean hasNestedScrollingParent(int r2) {
            r1 = this;
            android.view.ViewParent r0 = r1.getNestedScrollingParentForType(r2)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isNestedScrollingEnabled() {
            r1 = this;
            boolean r0 = r1.mIsNestedScrollingEnabled
            return r0
    }

    public void onDetachedFromWindow() {
            r1 = this;
            android.view.View r0 = r1.mView
            androidx.core.view.ViewCompat.stopNestedScroll(r0)
            return
    }

    public void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            androidx.core.view.ViewCompat.stopNestedScroll(r0)
            return
    }

    public void setNestedScrollingEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.mIsNestedScrollingEnabled
            if (r0 == 0) goto L9
            android.view.View r0 = r1.mView
            androidx.core.view.ViewCompat.stopNestedScroll(r0)
        L9:
            r1.mIsNestedScrollingEnabled = r2
            return
    }

    public boolean startNestedScroll(int r2) {
            r1 = this;
            r0 = 0
            boolean r0 = r1.startNestedScroll(r2, r0)
            return r0
    }

    public boolean startNestedScroll(int r5, int r6) {
            r4 = this;
            boolean r0 = r4.hasNestedScrollingParent(r6)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r4.isNestedScrollingEnabled()
            if (r0 == 0) goto L35
            android.view.View r0 = r4.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r2 = r4.mView
        L16:
            if (r0 == 0) goto L35
            android.view.View r3 = r4.mView
            boolean r3 = androidx.core.view.ViewParentCompat.onStartNestedScroll(r0, r2, r3, r5, r6)
            if (r3 == 0) goto L29
            r4.setNestedScrollingParentForType(r6, r0)
            android.view.View r3 = r4.mView
            androidx.core.view.ViewParentCompat.onNestedScrollAccepted(r0, r2, r3, r5, r6)
            return r1
        L29:
            boolean r3 = r0 instanceof android.view.View
            if (r3 == 0) goto L30
            r2 = r0
            android.view.View r2 = (android.view.View) r2
        L30:
            android.view.ViewParent r0 = r0.getParent()
            goto L16
        L35:
            r0 = 0
            return r0
    }

    public void stopNestedScroll() {
            r1 = this;
            r0 = 0
            r1.stopNestedScroll(r0)
            return
    }

    public void stopNestedScroll(int r3) {
            r2 = this;
            android.view.ViewParent r0 = r2.getNestedScrollingParentForType(r3)
            if (r0 == 0) goto Lf
            android.view.View r1 = r2.mView
            androidx.core.view.ViewParentCompat.onStopNestedScroll(r0, r1, r3)
            r1 = 0
            r2.setNestedScrollingParentForType(r3, r1)
        Lf:
            return
    }
}
