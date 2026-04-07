package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends androidx.appcompat.widget.LinearLayoutCompat {
    public AlertDialogLayout(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public AlertDialogLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void forceUniformWidth(int r10, int r11) {
            r9 = this;
            int r0 = r9.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
        Lc:
            if (r0 >= r10) goto L3e
            android.view.View r3 = r9.getChildAt(r0)
            int r1 = r3.getVisibility()
            r2 = 8
            if (r1 == r2) goto L39
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r1
            int r2 = r1.width
            r5 = -1
            if (r2 != r5) goto L37
            int r8 = r1.height
            int r2 = r3.getMeasuredHeight()
            r1.height = r2
            r5 = 0
            r7 = 0
            r2 = r9
            r6 = r11
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r1.height = r8
            goto L3a
        L37:
            r6 = r11
            goto L3a
        L39:
            r6 = r11
        L3a:
            int r0 = r0 + 1
            r11 = r6
            goto Lc
        L3e:
            return
    }

    private static int resolveMinimumHeight(android.view.View r5) {
            int r0 = androidx.core.view.ViewCompat.getMinimumHeight(r5)
            if (r0 <= 0) goto L7
            return r0
        L7:
            boolean r1 = r5 instanceof android.view.ViewGroup
            r2 = 0
            if (r1 == 0) goto L1f
            r1 = r5
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r3 = r1.getChildCount()
            r4 = 1
            if (r3 != r4) goto L1f
            android.view.View r2 = r1.getChildAt(r2)
            int r2 = resolveMinimumHeight(r2)
            return r2
        L1f:
            return r2
    }

    private void setChildFrame(android.view.View r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            int r0 = r4 + r6
            int r1 = r5 + r7
            r3.layout(r4, r5, r0, r1)
            return
    }

    private boolean tryOnMeasure(int r25, int r26) {
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = 0
            r4 = 0
            r5 = 0
            int r6 = r0.getChildCount()
            r7 = 0
        Le:
            r8 = 8
            r9 = 0
            if (r7 >= r6) goto L3f
            android.view.View r10 = r0.getChildAt(r7)
            int r11 = r10.getVisibility()
            if (r11 != r8) goto L1e
            goto L3c
        L1e:
            int r8 = r10.getId()
            int r11 = androidx.appcompat.R.id.topPanel
            if (r8 != r11) goto L28
            r3 = r10
            goto L3c
        L28:
            int r11 = androidx.appcompat.R.id.buttonPanel
            if (r8 != r11) goto L2e
            r4 = r10
            goto L3c
        L2e:
            int r11 = androidx.appcompat.R.id.contentPanel
            if (r8 == r11) goto L38
            int r11 = androidx.appcompat.R.id.customPanel
            if (r8 != r11) goto L37
            goto L38
        L37:
            return r9
        L38:
            if (r5 == 0) goto L3b
            return r9
        L3b:
            r5 = r10
        L3c:
            int r7 = r7 + 1
            goto Le
        L3f:
            int r7 = android.view.View.MeasureSpec.getMode(r2)
            int r10 = android.view.View.MeasureSpec.getSize(r2)
            int r11 = android.view.View.MeasureSpec.getMode(r1)
            r12 = 0
            int r13 = r0.getPaddingTop()
            int r14 = r0.getPaddingBottom()
            int r13 = r13 + r14
            if (r3 == 0) goto L67
            r3.measure(r1, r9)
            int r14 = r3.getMeasuredHeight()
            int r13 = r13 + r14
            int r14 = r3.getMeasuredState()
            int r12 = android.view.View.combineMeasuredStates(r12, r14)
        L67:
            r14 = 0
            r15 = 0
            if (r4 == 0) goto L81
            r4.measure(r1, r9)
            int r14 = resolveMinimumHeight(r4)
            int r16 = r4.getMeasuredHeight()
            int r15 = r16 - r14
            int r13 = r13 + r14
            int r8 = r4.getMeasuredState()
            int r12 = android.view.View.combineMeasuredStates(r12, r8)
        L81:
            r8 = 0
            if (r5 == 0) goto Lac
            if (r7 != 0) goto L8f
            r17 = 0
            r23 = r17
            r17 = r3
            r3 = r23
            goto L9b
        L8f:
            r17 = r3
            int r3 = r10 - r13
            int r3 = java.lang.Math.max(r9, r3)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r7)
        L9b:
            r5.measure(r1, r3)
            int r8 = r5.getMeasuredHeight()
            int r13 = r13 + r8
            int r9 = r5.getMeasuredState()
            int r12 = android.view.View.combineMeasuredStates(r12, r9)
            goto Lae
        Lac:
            r17 = r3
        Lae:
            int r3 = r10 - r13
            r9 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto Ld8
            int r13 = r13 - r14
            int r18 = java.lang.Math.min(r3, r15)
            if (r18 <= 0) goto Lbf
            int r3 = r3 - r18
            int r14 = r14 + r18
        Lbf:
            r19 = r3
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r9)
            r4.measure(r1, r3)
            int r20 = r4.getMeasuredHeight()
            int r13 = r13 + r20
            int r9 = r4.getMeasuredState()
            int r12 = android.view.View.combineMeasuredStates(r12, r9)
            r3 = r19
        Ld8:
            if (r5 == 0) goto Lfb
            if (r3 <= 0) goto Lfb
            int r13 = r13 - r8
            r9 = r3
            int r3 = r3 - r9
            int r8 = r8 + r9
            r18 = r3
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r7)
            r5.measure(r1, r3)
            int r19 = r5.getMeasuredHeight()
            int r13 = r13 + r19
            r19 = r3
            int r3 = r5.getMeasuredState()
            int r12 = android.view.View.combineMeasuredStates(r12, r3)
            r3 = r18
        Lfb:
            r9 = 0
            r18 = 0
            r23 = r18
            r18 = r3
            r3 = r23
        L104:
            if (r3 >= r6) goto L124
            android.view.View r19 = r0.getChildAt(r3)
            r21 = r3
            int r3 = r19.getVisibility()
            r22 = r4
            r4 = 8
            if (r3 == r4) goto L11f
            int r3 = r19.getMeasuredWidth()
            int r3 = java.lang.Math.max(r9, r3)
            r9 = r3
        L11f:
            int r3 = r21 + 1
            r4 = r22
            goto L104
        L124:
            r21 = r3
            r22 = r4
            int r3 = r0.getPaddingLeft()
            int r4 = r0.getPaddingRight()
            int r3 = r3 + r4
            int r9 = r9 + r3
            int r3 = android.view.View.resolveSizeAndState(r9, r1, r12)
            r4 = 0
            int r4 = android.view.View.resolveSizeAndState(r13, r2, r4)
            r0.setMeasuredDimension(r3, r4)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L145
            r0.forceUniformWidth(r6, r2)
        L145:
            r1 = 1
            return r1
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
            r23 = this;
            r0 = r23
            int r6 = r0.getPaddingLeft()
            int r7 = r27 - r25
            int r1 = r0.getPaddingRight()
            int r8 = r7 - r1
            int r1 = r7 - r6
            int r2 = r0.getPaddingRight()
            int r9 = r1 - r2
            int r10 = r0.getMeasuredHeight()
            int r11 = r0.getChildCount()
            int r12 = r0.getGravity()
            r13 = r12 & 112(0x70, float:1.57E-43)
            r1 = 8388615(0x800007, float:1.1754953E-38)
            r14 = r12 & r1
            switch(r13) {
                case 16: goto L3b;
                case 80: goto L31;
                default: goto L2c;
            }
        L2c:
            int r1 = r0.getPaddingTop()
            goto L46
        L31:
            int r1 = r0.getPaddingTop()
            int r1 = r1 + r28
            int r1 = r1 - r26
            int r1 = r1 - r10
            goto L46
        L3b:
            int r1 = r0.getPaddingTop()
            int r2 = r28 - r26
            int r2 = r2 - r10
            int r2 = r2 / 2
            int r1 = r1 + r2
        L46:
            android.graphics.drawable.Drawable r15 = r0.getDividerDrawable()
            if (r15 != 0) goto L4e
            r2 = 0
            goto L52
        L4e:
            int r2 = r15.getIntrinsicHeight()
        L52:
            r16 = r2
            r2 = 0
        L55:
            if (r2 >= r11) goto Le1
            r3 = r1
            android.view.View r1 = r0.getChildAt(r2)
            if (r1 == 0) goto Ld0
            int r4 = r1.getVisibility()
            r5 = 8
            if (r4 == r5) goto Ld0
            int r4 = r1.getMeasuredWidth()
            int r5 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r17 = r1.getLayoutParams()
            r18 = r6
            r6 = r17
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r6 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r6
            r17 = r1
            int r1 = r6.gravity
            if (r1 >= 0) goto L80
            r1 = r14
        L80:
            r19 = r7
            int r7 = r0.getLayoutDirection()
            int r20 = androidx.core.view.GravityCompat.getAbsoluteGravity(r1, r7)
            r21 = r20 & 7
            switch(r21) {
                case 1: goto L9f;
                case 5: goto L96;
                default: goto L8f;
            }
        L8f:
            r22 = r1
            int r1 = r6.leftMargin
            int r21 = r18 + r1
            goto Lb4
        L96:
            int r21 = r8 - r4
            r22 = r1
            int r1 = r6.rightMargin
            int r21 = r21 - r1
            goto Lb4
        L9f:
            r22 = r1
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r18 + r1
            r21 = r1
            int r1 = r6.leftMargin
            int r1 = r21 + r1
            r21 = r1
            int r1 = r6.rightMargin
            int r21 = r21 - r1
        Lb4:
            boolean r1 = r0.hasDividerBeforeChildAt(r2)
            if (r1 == 0) goto Lbd
            int r1 = r3 + r16
            goto Lbe
        Lbd:
            r1 = r3
        Lbe:
            int r3 = r6.topMargin
            int r3 = r3 + r1
            r1 = r17
            r17 = r2
            r2 = r21
            r0.setChildFrame(r1, r2, r3, r4, r5)
            int r0 = r6.bottomMargin
            int r0 = r0 + r5
            int r3 = r3 + r0
            r1 = r3
            goto Ld7
        Ld0:
            r17 = r2
            r18 = r6
            r19 = r7
            r1 = r3
        Ld7:
            int r2 = r17 + 1
            r0 = r23
            r6 = r18
            r7 = r19
            goto L55
        Le1:
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.tryOnMeasure(r2, r3)
            if (r0 != 0) goto L9
            super.onMeasure(r2, r3)
        L9:
            return
    }
}
