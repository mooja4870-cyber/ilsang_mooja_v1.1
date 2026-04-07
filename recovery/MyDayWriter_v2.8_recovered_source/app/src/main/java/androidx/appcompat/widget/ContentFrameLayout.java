package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends android.widget.FrameLayout {
    private androidx.appcompat.widget.ContentFrameLayout.OnAttachListener mAttachListener;
    private final android.graphics.Rect mDecorPadding;
    private android.util.TypedValue mFixedHeightMajor;
    private android.util.TypedValue mFixedHeightMinor;
    private android.util.TypedValue mFixedWidthMajor;
    private android.util.TypedValue mFixedWidthMinor;
    private android.util.TypedValue mMinWidthMajor;
    private android.util.TypedValue mMinWidthMinor;

    public interface OnAttachListener {
        void onAttachedFromWindow();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ContentFrameLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ContentFrameLayout(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mDecorPadding = r0
            return
    }

    public void dispatchFitSystemWindows(android.graphics.Rect r1) {
            r0 = this;
            r0.fitSystemWindows(r1)
            return
    }

    public android.util.TypedValue getFixedHeightMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.mFixedHeightMajor
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.mFixedHeightMajor = r0
        Lb:
            android.util.TypedValue r0 = r1.mFixedHeightMajor
            return r0
    }

    public android.util.TypedValue getFixedHeightMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.mFixedHeightMinor
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.mFixedHeightMinor = r0
        Lb:
            android.util.TypedValue r0 = r1.mFixedHeightMinor
            return r0
    }

    public android.util.TypedValue getFixedWidthMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.mFixedWidthMajor
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.mFixedWidthMajor = r0
        Lb:
            android.util.TypedValue r0 = r1.mFixedWidthMajor
            return r0
    }

    public android.util.TypedValue getFixedWidthMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.mFixedWidthMinor
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.mFixedWidthMinor = r0
        Lb:
            android.util.TypedValue r0 = r1.mFixedWidthMinor
            return r0
    }

    public android.util.TypedValue getMinWidthMajor() {
            r1 = this;
            android.util.TypedValue r0 = r1.mMinWidthMajor
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.mMinWidthMajor = r0
        Lb:
            android.util.TypedValue r0 = r1.mMinWidthMajor
            return r0
    }

    public android.util.TypedValue getMinWidthMinor() {
            r1 = this;
            android.util.TypedValue r0 = r1.mMinWidthMinor
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.mMinWidthMinor = r0
        Lb:
            android.util.TypedValue r0 = r1.mMinWidthMinor
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            androidx.appcompat.widget.ContentFrameLayout$OnAttachListener r0 = r1.mAttachListener
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.ContentFrameLayout$OnAttachListener r0 = r1.mAttachListener
            r0.onAttachedFromWindow()
        Lc:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.ContentFrameLayout$OnAttachListener r0 = r1.mAttachListener
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.ContentFrameLayout$OnAttachListener r0 = r1.mAttachListener
            r0.onDetachedFromWindow()
        Lc:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r14, int r15) {
            r13 = this;
            android.content.Context r0 = r13.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.widthPixels
            int r2 = r0.heightPixels
            if (r1 >= r2) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            int r2 = android.view.View.MeasureSpec.getMode(r14)
            int r3 = android.view.View.MeasureSpec.getMode(r15)
            r4 = 0
            r5 = 6
            r6 = 5
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 1073741824(0x40000000, float:2.0)
            if (r2 != r7) goto L67
            if (r1 == 0) goto L2b
            android.util.TypedValue r9 = r13.mFixedWidthMinor
            goto L2d
        L2b:
            android.util.TypedValue r9 = r13.mFixedWidthMajor
        L2d:
            if (r9 == 0) goto L67
            int r10 = r9.type
            if (r10 == 0) goto L67
            r10 = 0
            int r11 = r9.type
            if (r11 != r6) goto L3e
            float r11 = r9.getDimension(r0)
            int r10 = (int) r11
            goto L4d
        L3e:
            int r11 = r9.type
            if (r11 != r5) goto L4d
            int r11 = r0.widthPixels
            float r11 = (float) r11
            int r12 = r0.widthPixels
            float r12 = (float) r12
            float r11 = r9.getFraction(r11, r12)
            int r10 = (int) r11
        L4d:
            if (r10 <= 0) goto L67
            android.graphics.Rect r11 = r13.mDecorPadding
            int r11 = r11.left
            android.graphics.Rect r12 = r13.mDecorPadding
            int r12 = r12.right
            int r11 = r11 + r12
            int r10 = r10 - r11
            int r11 = android.view.View.MeasureSpec.getSize(r14)
            int r12 = java.lang.Math.min(r10, r11)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r8)
            r4 = 1
        L67:
            if (r3 != r7) goto La9
            if (r1 == 0) goto L6e
            android.util.TypedValue r9 = r13.mFixedHeightMajor
            goto L70
        L6e:
            android.util.TypedValue r9 = r13.mFixedHeightMinor
        L70:
            if (r9 == 0) goto La9
            int r10 = r9.type
            if (r10 == 0) goto La9
            r10 = 0
            int r11 = r9.type
            if (r11 != r6) goto L81
            float r11 = r9.getDimension(r0)
            int r10 = (int) r11
            goto L90
        L81:
            int r11 = r9.type
            if (r11 != r5) goto L90
            int r11 = r0.heightPixels
            float r11 = (float) r11
            int r12 = r0.heightPixels
            float r12 = (float) r12
            float r11 = r9.getFraction(r11, r12)
            int r10 = (int) r11
        L90:
            if (r10 <= 0) goto La9
            android.graphics.Rect r11 = r13.mDecorPadding
            int r11 = r11.top
            android.graphics.Rect r12 = r13.mDecorPadding
            int r12 = r12.bottom
            int r11 = r11 + r12
            int r10 = r10 - r11
            int r11 = android.view.View.MeasureSpec.getSize(r15)
            int r12 = java.lang.Math.min(r10, r11)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r8)
        La9:
            super.onMeasure(r14, r15)
            int r9 = r13.getMeasuredWidth()
            r10 = 0
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r8)
            if (r4 != 0) goto Lf3
            if (r2 != r7) goto Lf3
            if (r1 == 0) goto Lbe
            android.util.TypedValue r7 = r13.mMinWidthMinor
            goto Lc0
        Lbe:
            android.util.TypedValue r7 = r13.mMinWidthMajor
        Lc0:
            if (r7 == 0) goto Lf3
            int r11 = r7.type
            if (r11 == 0) goto Lf3
            r11 = 0
            int r12 = r7.type
            if (r12 != r6) goto Ld1
            float r5 = r7.getDimension(r0)
            int r11 = (int) r5
            goto Le0
        Ld1:
            int r6 = r7.type
            if (r6 != r5) goto Le0
            int r5 = r0.widthPixels
            float r5 = (float) r5
            int r6 = r0.widthPixels
            float r6 = (float) r6
            float r5 = r7.getFraction(r5, r6)
            int r11 = (int) r5
        Le0:
            if (r11 <= 0) goto Lec
            android.graphics.Rect r5 = r13.mDecorPadding
            int r5 = r5.left
            android.graphics.Rect r6 = r13.mDecorPadding
            int r6 = r6.right
            int r5 = r5 + r6
            int r11 = r11 - r5
        Lec:
            if (r9 >= r11) goto Lf3
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r8)
            r10 = 1
        Lf3:
            if (r10 == 0) goto Lf8
            super.onMeasure(r14, r15)
        Lf8:
            return
    }

    public void setAttachListener(androidx.appcompat.widget.ContentFrameLayout.OnAttachListener r1) {
            r0 = this;
            r0.mAttachListener = r1
            return
    }

    public void setDecorPadding(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.Rect r0 = r1.mDecorPadding
            r0.set(r2, r3, r4, r5)
            boolean r0 = r1.isLaidOut()
            if (r0 == 0) goto Le
            r1.requestLayout()
        Le:
            return
    }
}
