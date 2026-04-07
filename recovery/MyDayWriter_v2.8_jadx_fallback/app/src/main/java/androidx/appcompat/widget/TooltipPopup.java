package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class TooltipPopup {
    private static final java.lang.String TAG = "TooltipPopup";
    private final android.view.View mContentView;
    private final android.content.Context mContext;
    private final android.view.WindowManager.LayoutParams mLayoutParams;
    private final android.widget.TextView mMessageView;
    private final int[] mTmpAnchorPos;
    private final int[] mTmpAppPos;
    private final android.graphics.Rect mTmpDisplayFrame;

    TooltipPopup(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r3.mLayoutParams = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.mTmpDisplayFrame = r0
            r0 = 2
            int[] r1 = new int[r0]
            r3.mTmpAnchorPos = r1
            int[] r0 = new int[r0]
            r3.mTmpAppPos = r0
            r3.mContext = r4
            android.content.Context r0 = r3.mContext
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = androidx.appcompat.R.layout.abc_tooltip
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            r3.mContentView = r0
            android.view.View r0 = r3.mContentView
            int r1 = androidx.appcompat.R.id.message
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.mMessageView = r0
            android.view.WindowManager$LayoutParams r0 = r3.mLayoutParams
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.setTitle(r1)
            android.view.WindowManager$LayoutParams r0 = r3.mLayoutParams
            android.content.Context r1 = r3.mContext
            java.lang.String r1 = r1.getPackageName()
            r0.packageName = r1
            android.view.WindowManager$LayoutParams r0 = r3.mLayoutParams
            r1 = 1002(0x3ea, float:1.404E-42)
            r0.type = r1
            android.view.WindowManager$LayoutParams r0 = r3.mLayoutParams
            r1 = -2
            r0.width = r1
            android.view.WindowManager$LayoutParams r0 = r3.mLayoutParams
            r0.height = r1
            android.view.WindowManager$LayoutParams r0 = r3.mLayoutParams
            r1 = -3
            r0.format = r1
            android.view.WindowManager$LayoutParams r0 = r3.mLayoutParams
            int r1 = androidx.appcompat.R.style.Animation_AppCompat_Tooltip
            r0.windowAnimations = r1
            android.view.WindowManager$LayoutParams r0 = r3.mLayoutParams
            r1 = 24
            r0.flags = r1
            return
    }

    private void computePosition(android.view.View r17, int r18, int r19, boolean r20, android.view.WindowManager.LayoutParams r21) {
            r16 = this;
            r0 = r16
            r1 = r21
            android.os.IBinder r2 = r17.getApplicationWindowToken()
            r1.token = r2
            android.content.Context r2 = r0.mContext
            android.content.res.Resources r2 = r2.getResources()
            int r3 = androidx.appcompat.R.dimen.tooltip_precise_anchor_threshold
            int r2 = r2.getDimensionPixelOffset(r3)
            int r3 = r17.getWidth()
            if (r3 < r2) goto L1f
            r3 = r18
            goto L25
        L1f:
            int r3 = r17.getWidth()
            int r3 = r3 / 2
        L25:
            int r4 = r17.getHeight()
            if (r4 < r2) goto L3c
            android.content.Context r4 = r0.mContext
            android.content.res.Resources r4 = r4.getResources()
            int r5 = androidx.appcompat.R.dimen.tooltip_precise_anchor_extra_offset
            int r4 = r4.getDimensionPixelOffset(r5)
            int r5 = r19 + r4
            int r4 = r19 - r4
            goto L41
        L3c:
            int r5 = r17.getHeight()
            r4 = 0
        L41:
            r6 = 49
            r1.gravity = r6
            android.content.Context r6 = r0.mContext
            android.content.res.Resources r6 = r6.getResources()
            if (r20 == 0) goto L50
            int r7 = androidx.appcompat.R.dimen.tooltip_y_offset_touch
            goto L52
        L50:
            int r7 = androidx.appcompat.R.dimen.tooltip_y_offset_non_touch
        L52:
            int r6 = r6.getDimensionPixelOffset(r7)
            android.view.View r7 = getAppRootView(r17)
            if (r7 != 0) goto L64
            java.lang.String r8 = "TooltipPopup"
            java.lang.String r9 = "Cannot find app view"
            android.util.Log.e(r8, r9)
            return
        L64:
            android.graphics.Rect r8 = r0.mTmpDisplayFrame
            r7.getWindowVisibleDisplayFrame(r8)
            android.graphics.Rect r8 = r0.mTmpDisplayFrame
            int r8 = r8.left
            r9 = 0
            if (r8 >= 0) goto L9b
            android.graphics.Rect r8 = r0.mTmpDisplayFrame
            int r8 = r8.top
            if (r8 >= 0) goto L9b
            android.content.Context r8 = r0.mContext
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r10 = "dimen"
            java.lang.String r11 = "android"
            java.lang.String r12 = "status_bar_height"
            int r10 = r8.getIdentifier(r12, r10, r11)
            if (r10 == 0) goto L8d
            int r11 = r8.getDimensionPixelSize(r10)
            goto L8e
        L8d:
            r11 = 0
        L8e:
            android.util.DisplayMetrics r12 = r8.getDisplayMetrics()
            android.graphics.Rect r13 = r0.mTmpDisplayFrame
            int r14 = r12.widthPixels
            int r15 = r12.heightPixels
            r13.set(r9, r11, r14, r15)
        L9b:
            int[] r8 = r0.mTmpAppPos
            r7.getLocationOnScreen(r8)
            int[] r8 = r0.mTmpAnchorPos
            r10 = r17
            r10.getLocationOnScreen(r8)
            int[] r8 = r0.mTmpAnchorPos
            r11 = r8[r9]
            int[] r12 = r0.mTmpAppPos
            r12 = r12[r9]
            int r11 = r11 - r12
            r8[r9] = r11
            int[] r8 = r0.mTmpAnchorPos
            r11 = 1
            r12 = r8[r11]
            int[] r13 = r0.mTmpAppPos
            r13 = r13[r11]
            int r12 = r12 - r13
            r8[r11] = r12
            int[] r8 = r0.mTmpAnchorPos
            r8 = r8[r9]
            int r8 = r8 + r3
            int r12 = r7.getWidth()
            int r12 = r12 / 2
            int r8 = r8 - r12
            r1.x = r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r9)
            android.view.View r9 = r0.mContentView
            r9.measure(r8, r8)
            android.view.View r9 = r0.mContentView
            int r9 = r9.getMeasuredHeight()
            int[] r12 = r0.mTmpAnchorPos
            r12 = r12[r11]
            int r12 = r12 + r4
            int r12 = r12 - r6
            int r12 = r12 - r9
            int[] r13 = r0.mTmpAnchorPos
            r11 = r13[r11]
            int r11 = r11 + r5
            int r11 = r11 + r6
            if (r20 == 0) goto Lf2
            if (r12 < 0) goto Lef
            r1.y = r12
            goto L101
        Lef:
            r1.y = r11
            goto L101
        Lf2:
            int r13 = r11 + r9
            android.graphics.Rect r14 = r0.mTmpDisplayFrame
            int r14 = r14.height()
            if (r13 > r14) goto Lff
            r1.y = r11
            goto L101
        Lff:
            r1.y = r12
        L101:
            return
    }

    private static android.view.View getAppRootView(android.view.View r4) {
            android.view.View r0 = r4.getRootView()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r2 = r1 instanceof android.view.WindowManager.LayoutParams
            if (r2 == 0) goto L15
            r2 = r1
            android.view.WindowManager$LayoutParams r2 = (android.view.WindowManager.LayoutParams) r2
            int r2 = r2.type
            r3 = 2
            if (r2 != r3) goto L15
            return r0
        L15:
            android.content.Context r2 = r4.getContext()
        L19:
            boolean r3 = r2 instanceof android.content.ContextWrapper
            if (r3 == 0) goto L35
            boolean r3 = r2 instanceof android.app.Activity
            if (r3 == 0) goto L2d
            r3 = r2
            android.app.Activity r3 = (android.app.Activity) r3
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            return r3
        L2d:
            r3 = r2
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r2 = r3.getBaseContext()
            goto L19
        L35:
            return r0
    }

    void hide() {
            r2 = this;
            boolean r0 = r2.isShowing()
            if (r0 != 0) goto L7
            return
        L7:
            android.content.Context r0 = r2.mContext
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.View r1 = r2.mContentView
            r0.removeView(r1)
            return
    }

    boolean isShowing() {
            r1 = this;
            android.view.View r0 = r1.mContentView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    void show(android.view.View r8, int r9, int r10, boolean r11, java.lang.CharSequence r12) {
            r7 = this;
            boolean r0 = r7.isShowing()
            if (r0 == 0) goto L9
            r7.hide()
        L9:
            android.widget.TextView r0 = r7.mMessageView
            r0.setText(r12)
            android.view.WindowManager$LayoutParams r6 = r7.mLayoutParams
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.computePosition(r2, r3, r4, r5, r6)
            android.content.Context r8 = r1.mContext
            java.lang.String r9 = "window"
            java.lang.Object r8 = r8.getSystemService(r9)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            android.view.View r9 = r1.mContentView
            android.view.WindowManager$LayoutParams r10 = r1.mLayoutParams
            r8.addView(r9, r10)
            return
    }
}
