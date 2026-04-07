package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends android.widget.LinearLayout {
    private static final int PEEK_BUTTON_DP = 16;
    private boolean mAllowStacking;
    private int mLastWidthSize;
    private boolean mStacked;

    public ButtonBarLayout(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            r8.<init>(r9, r10)
            r0 = -1
            r8.mLastWidthSize = r0
            int[] r0 = androidx.appcompat.R.styleable.ButtonBarLayout
            android.content.res.TypedArray r5 = r9.obtainStyledAttributes(r10, r0)
            int[] r3 = androidx.appcompat.R.styleable.ButtonBarLayout
            r6 = 0
            r7 = 0
            r1 = r8
            r2 = r9
            r4 = r10
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6, r7)
            int r9 = androidx.appcompat.R.styleable.ButtonBarLayout_allowStacking
            r10 = 1
            boolean r9 = r5.getBoolean(r9, r10)
            r1.mAllowStacking = r9
            r5.recycle()
            int r9 = r8.getOrientation()
            if (r9 != r10) goto L2d
            boolean r9 = r1.mAllowStacking
            r8.setStacked(r9)
        L2d:
            return
    }

    private int getNextVisibleChildIndex(int r4) {
            r3 = this;
            r0 = r4
            int r1 = r3.getChildCount()
        L5:
            if (r0 >= r1) goto L15
            android.view.View r2 = r3.getChildAt(r0)
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L12
            return r0
        L12:
            int r0 = r0 + 1
            goto L5
        L15:
            r0 = -1
            return r0
    }

    private boolean isStacked() {
            r1 = this;
            boolean r0 = r1.mStacked
            return r0
    }

    private void setStacked(boolean r5) {
            r4 = this;
            boolean r0 = r4.mStacked
            if (r0 == r5) goto L3d
            if (r5 == 0) goto La
            boolean r0 = r4.mAllowStacking
            if (r0 == 0) goto L3d
        La:
            r4.mStacked = r5
            r4.setOrientation(r5)
            if (r5 == 0) goto L15
            r0 = 8388613(0x800005, float:1.175495E-38)
            goto L17
        L15:
            r0 = 80
        L17:
            r4.setGravity(r0)
            int r0 = androidx.appcompat.R.id.spacer
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto L2b
            if (r5 == 0) goto L27
            r1 = 8
            goto L28
        L27:
            r1 = 4
        L28:
            r0.setVisibility(r1)
        L2b:
            int r1 = r4.getChildCount()
            int r2 = r1 + (-2)
        L31:
            if (r2 < 0) goto L3d
            android.view.View r3 = r4.getChildAt(r2)
            r4.bringChildToFront(r3)
            int r2 = r2 + (-1)
            goto L31
        L3d:
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r12, int r13) {
            r11 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r12)
            boolean r1 = r11.mAllowStacking
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = r11.mLastWidthSize
            if (r0 <= r1) goto L16
            boolean r1 = r11.isStacked()
            if (r1 == 0) goto L16
            r11.setStacked(r2)
        L16:
            r11.mLastWidthSize = r0
        L18:
            r1 = 0
            boolean r3 = r11.isStacked()
            if (r3 != 0) goto L2f
            int r3 = android.view.View.MeasureSpec.getMode(r12)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 != r4) goto L2f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r1 = 1
            goto L30
        L2f:
            r3 = r12
        L30:
            super.onMeasure(r3, r13)
            boolean r4 = r11.mAllowStacking
            if (r4 == 0) goto L52
            boolean r4 = r11.isStacked()
            if (r4 != 0) goto L52
            int r4 = r11.getMeasuredWidthAndState()
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = r5 & r4
            r6 = 16777216(0x1000000, float:2.3509887E-38)
            r7 = 1
            if (r5 != r6) goto L4b
            r6 = r7
            goto L4c
        L4b:
            r6 = r2
        L4c:
            if (r6 == 0) goto L52
            r11.setStacked(r7)
            r1 = 1
        L52:
            if (r1 == 0) goto L57
            super.onMeasure(r12, r13)
        L57:
            r4 = 0
            int r2 = r11.getNextVisibleChildIndex(r2)
            if (r2 < 0) goto La4
            android.view.View r5 = r11.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r6 = (android.widget.LinearLayout.LayoutParams) r6
            int r7 = r11.getPaddingTop()
            int r8 = r5.getMeasuredHeight()
            int r7 = r7 + r8
            int r8 = r6.topMargin
            int r7 = r7 + r8
            int r8 = r6.bottomMargin
            int r7 = r7 + r8
            int r4 = r4 + r7
            boolean r7 = r11.isStacked()
            if (r7 == 0) goto L9f
            int r7 = r2 + 1
            int r7 = r11.getNextVisibleChildIndex(r7)
            if (r7 < 0) goto L9e
            android.view.View r8 = r11.getChildAt(r7)
            int r8 = r8.getPaddingTop()
            android.content.res.Resources r9 = r11.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            r10 = 1098907648(0x41800000, float:16.0)
            float r9 = r9 * r10
            int r9 = (int) r9
            int r8 = r8 + r9
            int r4 = r4 + r8
        L9e:
            goto La4
        L9f:
            int r7 = r11.getPaddingBottom()
            int r4 = r4 + r7
        La4:
            int r5 = androidx.core.view.ViewCompat.getMinimumHeight(r11)
            if (r5 == r4) goto Lb2
            r11.setMinimumHeight(r4)
            if (r13 != 0) goto Lb2
            super.onMeasure(r12, r13)
        Lb2:
            return
    }

    public void setAllowStacking(boolean r2) {
            r1 = this;
            boolean r0 = r1.mAllowStacking
            if (r0 == r2) goto L17
            r1.mAllowStacking = r2
            boolean r0 = r1.mAllowStacking
            if (r0 != 0) goto L14
            boolean r0 = r1.isStacked()
            if (r0 == 0) goto L14
            r0 = 0
            r1.setStacked(r0)
        L14:
            r1.requestLayout()
        L17:
            return
    }
}
