package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class TooltipCompatHandler implements android.view.View.OnLongClickListener, android.view.View.OnHoverListener, android.view.View.OnAttachStateChangeListener {
    private static final long HOVER_HIDE_TIMEOUT_MS = 15000;
    private static final long HOVER_HIDE_TIMEOUT_SHORT_MS = 3000;
    private static final long LONG_CLICK_HIDE_TIMEOUT_MS = 2500;
    private static final java.lang.String TAG = "TooltipCompatHandler";
    private static androidx.appcompat.widget.TooltipCompatHandler sActiveHandler;
    private static androidx.appcompat.widget.TooltipCompatHandler sPendingHandler;
    private final android.view.View mAnchor;
    private int mAnchorX;
    private int mAnchorY;
    private boolean mForceNextChangeSignificant;
    private boolean mFromTouch;
    private final java.lang.Runnable mHideRunnable;
    private final int mHoverSlop;
    private androidx.appcompat.widget.TooltipPopup mPopup;
    private final java.lang.Runnable mShowRunnable;
    private final java.lang.CharSequence mTooltipText;

    private TooltipCompatHandler(android.view.View r2, java.lang.CharSequence r3) {
            r1 = this;
            r1.<init>()
            androidx.appcompat.widget.TooltipCompatHandler$$ExternalSyntheticLambda0 r0 = new androidx.appcompat.widget.TooltipCompatHandler$$ExternalSyntheticLambda0
            r0.<init>(r1)
            r1.mShowRunnable = r0
            androidx.appcompat.widget.TooltipCompatHandler$$ExternalSyntheticLambda1 r0 = new androidx.appcompat.widget.TooltipCompatHandler$$ExternalSyntheticLambda1
            r0.<init>(r1)
            r1.mHideRunnable = r0
            r1.mAnchor = r2
            r1.mTooltipText = r3
            android.view.View r0 = r1.mAnchor
            android.content.Context r0 = r0.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = androidx.core.view.ViewConfigurationCompat.getScaledHoverSlop(r0)
            r1.mHoverSlop = r0
            r1.forceNextChangeSignificant()
            android.view.View r0 = r1.mAnchor
            r0.setOnLongClickListener(r1)
            android.view.View r0 = r1.mAnchor
            r0.setOnHoverListener(r1)
            return
    }

    private void cancelPendingShow() {
            r2 = this;
            android.view.View r0 = r2.mAnchor
            java.lang.Runnable r1 = r2.mShowRunnable
            r0.removeCallbacks(r1)
            return
    }

    private void forceNextChangeSignificant() {
            r1 = this;
            r0 = 1
            r1.mForceNextChangeSignificant = r0
            return
    }

    private void scheduleShow() {
            r4 = this;
            android.view.View r0 = r4.mAnchor
            java.lang.Runnable r1 = r4.mShowRunnable
            int r2 = android.view.ViewConfiguration.getLongPressTimeout()
            long r2 = (long) r2
            r0.postDelayed(r1, r2)
            return
    }

    private static void setPendingHandler(androidx.appcompat.widget.TooltipCompatHandler r1) {
            androidx.appcompat.widget.TooltipCompatHandler r0 = androidx.appcompat.widget.TooltipCompatHandler.sPendingHandler
            if (r0 == 0) goto L9
            androidx.appcompat.widget.TooltipCompatHandler r0 = androidx.appcompat.widget.TooltipCompatHandler.sPendingHandler
            r0.cancelPendingShow()
        L9:
            androidx.appcompat.widget.TooltipCompatHandler.sPendingHandler = r1
            androidx.appcompat.widget.TooltipCompatHandler r0 = androidx.appcompat.widget.TooltipCompatHandler.sPendingHandler
            if (r0 == 0) goto L14
            androidx.appcompat.widget.TooltipCompatHandler r0 = androidx.appcompat.widget.TooltipCompatHandler.sPendingHandler
            r0.scheduleShow()
        L14:
            return
    }

    public static void setTooltipText(android.view.View r2, java.lang.CharSequence r3) {
            androidx.appcompat.widget.TooltipCompatHandler r0 = androidx.appcompat.widget.TooltipCompatHandler.sPendingHandler
            r1 = 0
            if (r0 == 0) goto Le
            androidx.appcompat.widget.TooltipCompatHandler r0 = androidx.appcompat.widget.TooltipCompatHandler.sPendingHandler
            android.view.View r0 = r0.mAnchor
            if (r0 != r2) goto Le
            setPendingHandler(r1)
        Le:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L2e
            androidx.appcompat.widget.TooltipCompatHandler r0 = androidx.appcompat.widget.TooltipCompatHandler.sActiveHandler
            if (r0 == 0) goto L23
            androidx.appcompat.widget.TooltipCompatHandler r0 = androidx.appcompat.widget.TooltipCompatHandler.sActiveHandler
            android.view.View r0 = r0.mAnchor
            if (r0 != r2) goto L23
            androidx.appcompat.widget.TooltipCompatHandler r0 = androidx.appcompat.widget.TooltipCompatHandler.sActiveHandler
            r0.hide()
        L23:
            r2.setOnLongClickListener(r1)
            r0 = 0
            r2.setLongClickable(r0)
            r2.setOnHoverListener(r1)
            goto L33
        L2e:
            androidx.appcompat.widget.TooltipCompatHandler r0 = new androidx.appcompat.widget.TooltipCompatHandler
            r0.<init>(r2, r3)
        L33:
            return
    }

    private boolean updateAnchorPos(android.view.MotionEvent r6) {
            r5 = this;
            float r0 = r6.getX()
            int r0 = (int) r0
            float r1 = r6.getY()
            int r1 = (int) r1
            boolean r2 = r5.mForceNextChangeSignificant
            r3 = 0
            if (r2 != 0) goto L29
            int r2 = r5.mAnchorX
            int r2 = r0 - r2
            int r2 = java.lang.Math.abs(r2)
            int r4 = r5.mHoverSlop
            if (r2 > r4) goto L29
            int r2 = r5.mAnchorY
            int r2 = r1 - r2
            int r2 = java.lang.Math.abs(r2)
            int r4 = r5.mHoverSlop
            if (r2 <= r4) goto L28
            goto L29
        L28:
            return r3
        L29:
            r5.mAnchorX = r0
            r5.mAnchorY = r1
            r5.mForceNextChangeSignificant = r3
            r2 = 1
            return r2
    }

    void hide() {
            r3 = this;
            androidx.appcompat.widget.TooltipCompatHandler r0 = androidx.appcompat.widget.TooltipCompatHandler.sActiveHandler
            r1 = 0
            if (r0 != r3) goto L22
            androidx.appcompat.widget.TooltipCompatHandler.sActiveHandler = r1
            androidx.appcompat.widget.TooltipPopup r0 = r3.mPopup
            if (r0 == 0) goto L1b
            androidx.appcompat.widget.TooltipPopup r0 = r3.mPopup
            r0.hide()
            r3.mPopup = r1
            r3.forceNextChangeSignificant()
            android.view.View r0 = r3.mAnchor
            r0.removeOnAttachStateChangeListener(r3)
            goto L22
        L1b:
            java.lang.String r0 = "TooltipCompatHandler"
            java.lang.String r2 = "sActiveHandler.mPopup == null"
            android.util.Log.e(r0, r2)
        L22:
            androidx.appcompat.widget.TooltipCompatHandler r0 = androidx.appcompat.widget.TooltipCompatHandler.sPendingHandler
            if (r0 != r3) goto L29
            setPendingHandler(r1)
        L29:
            android.view.View r0 = r3.mAnchor
            java.lang.Runnable r1 = r3.mHideRunnable
            r0.removeCallbacks(r1)
            return
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-appcompat-widget-TooltipCompatHandler, reason: not valid java name */
    /* synthetic */ void m17lambda$new$0$androidxappcompatwidgetTooltipCompatHandler() {
            r1 = this;
            r0 = 0
            r1.show(r0)
            return
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
            r3 = this;
            androidx.appcompat.widget.TooltipPopup r0 = r3.mPopup
            r1 = 0
            if (r0 == 0) goto La
            boolean r0 = r3.mFromTouch
            if (r0 == 0) goto La
            return r1
        La:
            android.view.View r0 = r3.mAnchor
            android.content.Context r0 = r0.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            boolean r2 = r0.isEnabled()
            if (r2 == 0) goto L25
            boolean r2 = r0.isTouchExplorationEnabled()
            if (r2 == 0) goto L25
            return r1
        L25:
            int r2 = r5.getAction()
            switch(r2) {
                case 7: goto L34;
                case 10: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L49
        L2d:
            r3.forceNextChangeSignificant()
            r3.hide()
            goto L49
        L34:
            android.view.View r2 = r3.mAnchor
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L49
            androidx.appcompat.widget.TooltipPopup r2 = r3.mPopup
            if (r2 != 0) goto L49
            boolean r2 = r3.updateAnchorPos(r5)
            if (r2 == 0) goto L49
            setPendingHandler(r3)
        L49:
            return r1
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View r2) {
            r1 = this;
            int r0 = r2.getWidth()
            int r0 = r0 / 2
            r1.mAnchorX = r0
            int r0 = r2.getHeight()
            int r0 = r0 / 2
            r1.mAnchorY = r0
            r0 = 1
            r1.show(r0)
            return r0
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            r0.hide()
            return
    }

    void show(boolean r9) {
            r8 = this;
            android.view.View r0 = r8.mAnchor
            boolean r0 = r0.isAttachedToWindow()
            if (r0 != 0) goto L9
            return
        L9:
            r0 = 0
            setPendingHandler(r0)
            androidx.appcompat.widget.TooltipCompatHandler r0 = androidx.appcompat.widget.TooltipCompatHandler.sActiveHandler
            if (r0 == 0) goto L16
            androidx.appcompat.widget.TooltipCompatHandler r0 = androidx.appcompat.widget.TooltipCompatHandler.sActiveHandler
            r0.hide()
        L16:
            androidx.appcompat.widget.TooltipCompatHandler.sActiveHandler = r8
            r8.mFromTouch = r9
            androidx.appcompat.widget.TooltipPopup r0 = new androidx.appcompat.widget.TooltipPopup
            android.view.View r1 = r8.mAnchor
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            r8.mPopup = r0
            androidx.appcompat.widget.TooltipPopup r2 = r8.mPopup
            android.view.View r3 = r8.mAnchor
            int r4 = r8.mAnchorX
            int r5 = r8.mAnchorY
            boolean r6 = r8.mFromTouch
            java.lang.CharSequence r7 = r8.mTooltipText
            r2.show(r3, r4, r5, r6, r7)
            android.view.View r0 = r8.mAnchor
            r0.addOnAttachStateChangeListener(r8)
            boolean r0 = r8.mFromTouch
            if (r0 == 0) goto L42
            r0 = 2500(0x9c4, double:1.235E-320)
            goto L5f
        L42:
            android.view.View r0 = r8.mAnchor
            int r0 = androidx.core.view.ViewCompat.getWindowSystemUiVisibility(r0)
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L56
            int r0 = android.view.ViewConfiguration.getLongPressTimeout()
            long r0 = (long) r0
            r2 = 3000(0xbb8, double:1.482E-320)
            long r0 = r2 - r0
            goto L5f
        L56:
            int r0 = android.view.ViewConfiguration.getLongPressTimeout()
            long r0 = (long) r0
            r2 = 15000(0x3a98, double:7.411E-320)
            long r0 = r2 - r0
        L5f:
            android.view.View r2 = r8.mAnchor
            java.lang.Runnable r3 = r8.mHideRunnable
            r2.removeCallbacks(r3)
            android.view.View r2 = r8.mAnchor
            java.lang.Runnable r3 = r8.mHideRunnable
            r2.postDelayed(r3, r0)
            return
    }
}
