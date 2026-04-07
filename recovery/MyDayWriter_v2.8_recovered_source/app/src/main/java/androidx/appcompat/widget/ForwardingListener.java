package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class ForwardingListener implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {
    private int mActivePointerId;
    private java.lang.Runnable mDisallowIntercept;
    private boolean mForwarding;
    private final int mLongPressTimeout;
    private final float mScaledTouchSlop;
    final android.view.View mSrc;
    private final int mTapTimeout;
    private final int[] mTmpLocation;
    private java.lang.Runnable mTriggerLongPress;

    private class DisallowIntercept implements java.lang.Runnable {
        final /* synthetic */ androidx.appcompat.widget.ForwardingListener this$0;

        DisallowIntercept(androidx.appcompat.widget.ForwardingListener r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.appcompat.widget.ForwardingListener r0 = r2.this$0
                android.view.View r0 = r0.mSrc
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto Le
                r1 = 1
                r0.requestDisallowInterceptTouchEvent(r1)
            Le:
                return
        }
    }

    private class TriggerLongPress implements java.lang.Runnable {
        final /* synthetic */ androidx.appcompat.widget.ForwardingListener this$0;

        TriggerLongPress(androidx.appcompat.widget.ForwardingListener r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.appcompat.widget.ForwardingListener r0 = r1.this$0
                r0.onLongPress()
                return
        }
    }

    public ForwardingListener(android.view.View r4) {
            r3 = this;
            r3.<init>()
            r0 = 2
            int[] r1 = new int[r0]
            r3.mTmpLocation = r1
            r3.mSrc = r4
            r1 = 1
            r4.setLongClickable(r1)
            r4.addOnAttachStateChangeListener(r3)
            android.content.Context r1 = r4.getContext()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            int r1 = r1.getScaledTouchSlop()
            float r1 = (float) r1
            r3.mScaledTouchSlop = r1
            int r1 = android.view.ViewConfiguration.getTapTimeout()
            r3.mTapTimeout = r1
            int r1 = r3.mTapTimeout
            int r2 = android.view.ViewConfiguration.getLongPressTimeout()
            int r1 = r1 + r2
            int r1 = r1 / r0
            r3.mLongPressTimeout = r1
            return
    }

    private void clearCallbacks() {
            r2 = this;
            java.lang.Runnable r0 = r2.mTriggerLongPress
            if (r0 == 0) goto Lb
            android.view.View r0 = r2.mSrc
            java.lang.Runnable r1 = r2.mTriggerLongPress
            r0.removeCallbacks(r1)
        Lb:
            java.lang.Runnable r0 = r2.mDisallowIntercept
            if (r0 == 0) goto L16
            android.view.View r0 = r2.mSrc
            java.lang.Runnable r1 = r2.mDisallowIntercept
            r0.removeCallbacks(r1)
        L16:
            return
    }

    private boolean onTouchForwarded(android.view.MotionEvent r10) {
            r9 = this;
            android.view.View r0 = r9.mSrc
            androidx.appcompat.view.menu.ShowableListMenu r1 = r9.getPopup()
            r2 = 0
            if (r1 == 0) goto L46
            boolean r3 = r1.isShowing()
            if (r3 != 0) goto L10
            goto L46
        L10:
            android.widget.ListView r3 = r1.getListView()
            androidx.appcompat.widget.DropDownListView r3 = (androidx.appcompat.widget.DropDownListView) r3
            if (r3 == 0) goto L45
            boolean r4 = r3.isShown()
            if (r4 != 0) goto L1f
            goto L45
        L1f:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtainNoHistory(r10)
            r9.toGlobalMotionEvent(r0, r4)
            r9.toLocalMotionEvent(r3, r4)
            int r5 = r9.mActivePointerId
            boolean r5 = r3.onForwardedEvent(r4, r5)
            r4.recycle()
            int r6 = r10.getActionMasked()
            r7 = 1
            if (r6 == r7) goto L3e
            r8 = 3
            if (r6 == r8) goto L3e
            r8 = r7
            goto L3f
        L3e:
            r8 = r2
        L3f:
            if (r5 == 0) goto L44
            if (r8 == 0) goto L44
            r2 = r7
        L44:
            return r2
        L45:
            return r2
        L46:
            return r2
    }

    private boolean onTouchObserved(android.view.MotionEvent r8) {
            r7 = this;
            android.view.View r0 = r7.mSrc
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r8.getActionMasked()
            switch(r1) {
                case 0: goto L3b;
                case 1: goto L37;
                case 2: goto L12;
                case 3: goto L37;
                default: goto L11;
            }
        L11:
            goto L68
        L12:
            int r3 = r7.mActivePointerId
            int r3 = r8.findPointerIndex(r3)
            if (r3 < 0) goto L68
            float r4 = r8.getX(r3)
            float r5 = r8.getY(r3)
            float r6 = r7.mScaledTouchSlop
            boolean r6 = pointInView(r0, r4, r5, r6)
            if (r6 != 0) goto L36
            r7.clearCallbacks()
            android.view.ViewParent r2 = r0.getParent()
            r6 = 1
            r2.requestDisallowInterceptTouchEvent(r6)
            return r6
        L36:
            goto L68
        L37:
            r7.clearCallbacks()
            goto L68
        L3b:
            int r3 = r8.getPointerId(r2)
            r7.mActivePointerId = r3
            java.lang.Runnable r3 = r7.mDisallowIntercept
            if (r3 != 0) goto L4c
            androidx.appcompat.widget.ForwardingListener$DisallowIntercept r3 = new androidx.appcompat.widget.ForwardingListener$DisallowIntercept
            r3.<init>(r7)
            r7.mDisallowIntercept = r3
        L4c:
            java.lang.Runnable r3 = r7.mDisallowIntercept
            int r4 = r7.mTapTimeout
            long r4 = (long) r4
            r0.postDelayed(r3, r4)
            java.lang.Runnable r3 = r7.mTriggerLongPress
            if (r3 != 0) goto L5f
            androidx.appcompat.widget.ForwardingListener$TriggerLongPress r3 = new androidx.appcompat.widget.ForwardingListener$TriggerLongPress
            r3.<init>(r7)
            r7.mTriggerLongPress = r3
        L5f:
            java.lang.Runnable r3 = r7.mTriggerLongPress
            int r4 = r7.mLongPressTimeout
            long r4 = (long) r4
            r0.postDelayed(r3, r4)
        L68:
            return r2
    }

    private static boolean pointInView(android.view.View r2, float r3, float r4, float r5) {
            float r0 = -r5
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L2a
            float r0 = -r5
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L2a
            int r0 = r2.getRight()
            int r1 = r2.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            float r0 = r0 + r5
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L2a
            int r0 = r2.getBottom()
            int r1 = r2.getTop()
            int r0 = r0 - r1
            float r0 = (float) r0
            float r0 = r0 + r5
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L2a
            r0 = 1
            goto L2b
        L2a:
            r0 = 0
        L2b:
            return r0
    }

    private boolean toGlobalMotionEvent(android.view.View r5, android.view.MotionEvent r6) {
            r4 = this;
            int[] r0 = r4.mTmpLocation
            r5.getLocationOnScreen(r0)
            r1 = 0
            r1 = r0[r1]
            float r1 = (float) r1
            r2 = 1
            r3 = r0[r2]
            float r3 = (float) r3
            r6.offsetLocation(r1, r3)
            return r2
    }

    private boolean toLocalMotionEvent(android.view.View r5, android.view.MotionEvent r6) {
            r4 = this;
            int[] r0 = r4.mTmpLocation
            r5.getLocationOnScreen(r0)
            r1 = 0
            r1 = r0[r1]
            int r1 = -r1
            float r1 = (float) r1
            r2 = 1
            r3 = r0[r2]
            int r3 = -r3
            float r3 = (float) r3
            r6.offsetLocation(r1, r3)
            return r2
    }

    public abstract androidx.appcompat.view.menu.ShowableListMenu getPopup();

    protected boolean onForwardingStarted() {
            r2 = this;
            androidx.appcompat.view.menu.ShowableListMenu r0 = r2.getPopup()
            if (r0 == 0) goto Lf
            boolean r1 = r0.isShowing()
            if (r1 != 0) goto Lf
            r0.show()
        Lf:
            r1 = 1
            return r1
    }

    protected boolean onForwardingStopped() {
            r2 = this;
            androidx.appcompat.view.menu.ShowableListMenu r0 = r2.getPopup()
            if (r0 == 0) goto Lf
            boolean r1 = r0.isShowing()
            if (r1 == 0) goto Lf
            r0.dismiss()
        Lf:
            r1 = 1
            return r1
    }

    void onLongPress() {
            r11 = this;
            r11.clearCallbacks()
            android.view.View r0 = r11.mSrc
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L37
            boolean r1 = r0.isLongClickable()
            if (r1 == 0) goto L12
            goto L37
        L12:
            boolean r1 = r11.onForwardingStarted()
            if (r1 != 0) goto L19
            return
        L19:
            android.view.ViewParent r1 = r0.getParent()
            r2 = 1
            r1.requestDisallowInterceptTouchEvent(r2)
            long r3 = android.os.SystemClock.uptimeMillis()
            r9 = 0
            r10 = 0
            r7 = 3
            r8 = 0
            r5 = r3
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            r0.onTouchEvent(r1)
            r1.recycle()
            r11.mForwarding = r2
            return
        L37:
            return
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
            r12 = this;
            boolean r0 = r12.mForwarding
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L17
            boolean r3 = r12.onTouchForwarded(r14)
            if (r3 != 0) goto L15
            boolean r3 = r12.onForwardingStopped()
            if (r3 != 0) goto L13
            goto L15
        L13:
            r3 = r2
            goto L16
        L15:
            r3 = r1
        L16:
            goto L3d
        L17:
            boolean r3 = r12.onTouchObserved(r14)
            if (r3 == 0) goto L25
            boolean r3 = r12.onForwardingStarted()
            if (r3 == 0) goto L25
            r3 = r1
            goto L26
        L25:
            r3 = r2
        L26:
            if (r3 == 0) goto L3d
            long r4 = android.os.SystemClock.uptimeMillis()
            r10 = 0
            r11 = 0
            r8 = 3
            r9 = 0
            r6 = r4
            android.view.MotionEvent r6 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            android.view.View r7 = r12.mSrc
            r7.onTouchEvent(r6)
            r6.recycle()
        L3d:
            r12.mForwarding = r3
            if (r3 != 0) goto L45
            if (r0 == 0) goto L44
            goto L45
        L44:
            r1 = r2
        L45:
            return r1
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View r3) {
            r2 = this;
            r0 = 0
            r2.mForwarding = r0
            r0 = -1
            r2.mActivePointerId = r0
            java.lang.Runnable r0 = r2.mDisallowIntercept
            if (r0 == 0) goto L11
            android.view.View r0 = r2.mSrc
            java.lang.Runnable r1 = r2.mDisallowIntercept
            r0.removeCallbacks(r1)
        L11:
            return
    }
}
