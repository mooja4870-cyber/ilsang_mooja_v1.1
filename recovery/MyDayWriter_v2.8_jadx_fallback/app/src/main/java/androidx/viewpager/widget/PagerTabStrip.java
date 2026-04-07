package androidx.viewpager.widget;

/* JADX INFO: loaded from: classes.dex */
public class PagerTabStrip extends androidx.viewpager.widget.PagerTitleStrip {
    private static final int FULL_UNDERLINE_HEIGHT = 1;
    private static final int INDICATOR_HEIGHT = 3;
    private static final int MIN_PADDING_BOTTOM = 6;
    private static final int MIN_STRIP_HEIGHT = 32;
    private static final int MIN_TEXT_SPACING = 64;
    private static final int TAB_PADDING = 16;
    private static final int TAB_SPACING = 32;
    private static final java.lang.String TAG = "PagerTabStrip";
    private boolean mDrawFullUnderline;
    private boolean mDrawFullUnderlineSet;
    private int mFullUnderlineHeight;
    private boolean mIgnoreTap;
    private int mIndicatorColor;
    private int mIndicatorHeight;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private int mMinPaddingBottom;
    private int mMinStripHeight;
    private int mMinTextSpacing;
    private int mTabAlpha;
    private int mTabPadding;
    private final android.graphics.Paint mTabPaint;
    private final android.graphics.Rect mTempRect;
    private int mTouchSlop;



    public PagerTabStrip(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public PagerTabStrip(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            r6.<init>(r7, r8)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r6.mTabPaint = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.mTempRect = r0
            r0 = 255(0xff, float:3.57E-43)
            r6.mTabAlpha = r0
            r0 = 0
            r6.mDrawFullUnderline = r0
            r6.mDrawFullUnderlineSet = r0
            int r1 = r6.mTextColor
            r6.mIndicatorColor = r1
            android.graphics.Paint r1 = r6.mTabPaint
            int r2 = r6.mIndicatorColor
            r1.setColor(r2)
            android.content.res.Resources r1 = r7.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 1077936128(0x40400000, float:3.0)
            float r2 = r2 * r1
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            r6.mIndicatorHeight = r2
            r2 = 1086324736(0x40c00000, float:6.0)
            float r2 = r2 * r1
            float r2 = r2 + r3
            int r2 = (int) r2
            r6.mMinPaddingBottom = r2
            r2 = 1115684864(0x42800000, float:64.0)
            float r2 = r2 * r1
            int r2 = (int) r2
            r6.mMinTextSpacing = r2
            r2 = 1098907648(0x41800000, float:16.0)
            float r2 = r2 * r1
            float r2 = r2 + r3
            int r2 = (int) r2
            r6.mTabPadding = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r1
            float r2 = r2 + r3
            int r2 = (int) r2
            r6.mFullUnderlineHeight = r2
            r2 = 1107296256(0x42000000, float:32.0)
            float r2 = r2 * r1
            float r2 = r2 + r3
            int r2 = (int) r2
            r6.mMinStripHeight = r2
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r7)
            int r2 = r2.getScaledTouchSlop()
            r6.mTouchSlop = r2
            int r2 = r6.getPaddingLeft()
            int r3 = r6.getPaddingTop()
            int r4 = r6.getPaddingRight()
            int r5 = r6.getPaddingBottom()
            r6.setPadding(r2, r3, r4, r5)
            int r2 = r6.getTextSpacing()
            r6.setTextSpacing(r2)
            r6.setWillNotDraw(r0)
            android.widget.TextView r0 = r6.mPrevText
            r2 = 1
            r0.setFocusable(r2)
            android.widget.TextView r0 = r6.mPrevText
            androidx.viewpager.widget.PagerTabStrip$1 r3 = new androidx.viewpager.widget.PagerTabStrip$1
            r3.<init>(r6)
            r0.setOnClickListener(r3)
            android.widget.TextView r0 = r6.mNextText
            r0.setFocusable(r2)
            android.widget.TextView r0 = r6.mNextText
            androidx.viewpager.widget.PagerTabStrip$2 r3 = new androidx.viewpager.widget.PagerTabStrip$2
            r3.<init>(r6)
            r0.setOnClickListener(r3)
            android.graphics.drawable.Drawable r0 = r6.getBackground()
            if (r0 != 0) goto La8
            r6.mDrawFullUnderline = r2
        La8:
            return
    }

    public boolean getDrawFullUnderline() {
            r1 = this;
            boolean r0 = r1.mDrawFullUnderline
            return r0
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    int getMinHeight() {
            r2 = this;
            int r0 = super.getMinHeight()
            int r1 = r2.mMinStripHeight
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    public int getTabIndicatorColor() {
            r1 = this;
            int r0 = r1.mIndicatorColor
            return r0
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r23) {
            r22 = this;
            r0 = r22
            super.onDraw(r23)
            int r1 = r0.getHeight()
            r2 = r1
            android.widget.TextView r3 = r0.mCurrText
            int r3 = r3.getLeft()
            int r4 = r0.mTabPadding
            int r3 = r3 - r4
            android.widget.TextView r4 = r0.mCurrText
            int r4 = r4.getRight()
            int r5 = r0.mTabPadding
            int r4 = r4 + r5
            int r5 = r0.mIndicatorHeight
            int r5 = r2 - r5
            android.graphics.Paint r6 = r0.mTabPaint
            int r7 = r0.mTabAlpha
            int r7 = r7 << 24
            int r8 = r0.mIndicatorColor
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r8 = r8 & r9
            r7 = r7 | r8
            r6.setColor(r7)
            float r11 = (float) r3
            float r12 = (float) r5
            float r13 = (float) r4
            float r14 = (float) r2
            android.graphics.Paint r15 = r0.mTabPaint
            r10 = r23
            r10.drawRect(r11, r12, r13, r14, r15)
            boolean r6 = r0.mDrawFullUnderline
            if (r6 == 0) goto L70
            android.graphics.Paint r6 = r0.mTabPaint
            int r7 = r0.mIndicatorColor
            r7 = r7 & r9
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r7 = r7 | r8
            r6.setColor(r7)
            int r6 = r0.getPaddingLeft()
            float r6 = (float) r6
            int r7 = r0.mFullUnderlineHeight
            int r7 = r1 - r7
            float r7 = (float) r7
            int r8 = r0.getWidth()
            int r9 = r0.getPaddingRight()
            int r8 = r8 - r9
            float r8 = (float) r8
            float r9 = (float) r1
            android.graphics.Paint r10 = r0.mTabPaint
            r16 = r23
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r16.drawRect(r17, r18, r19, r20, r21)
        L70:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getAction()
            r1 = 0
            if (r0 == 0) goto Lc
            boolean r2 = r6.mIgnoreTap
            if (r2 == 0) goto Lc
            return r1
        Lc:
            float r2 = r7.getX()
            float r3 = r7.getY()
            r4 = 1
            switch(r0) {
                case 0: goto L70;
                case 1: goto L3a;
                case 2: goto L19;
                default: goto L18;
            }
        L18:
            goto L77
        L19:
            float r1 = r6.mInitialMotionX
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r5 = r6.mTouchSlop
            float r5 = (float) r5
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L37
            float r1 = r6.mInitialMotionY
            float r1 = r3 - r1
            float r1 = java.lang.Math.abs(r1)
            int r5 = r6.mTouchSlop
            float r5 = (float) r5
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L77
        L37:
            r6.mIgnoreTap = r4
            goto L77
        L3a:
            android.widget.TextView r1 = r6.mCurrText
            int r1 = r1.getLeft()
            int r5 = r6.mTabPadding
            int r1 = r1 - r5
            float r1 = (float) r1
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 >= 0) goto L55
            androidx.viewpager.widget.ViewPager r1 = r6.mPager
            androidx.viewpager.widget.ViewPager r5 = r6.mPager
            int r5 = r5.getCurrentItem()
            int r5 = r5 - r4
            r1.setCurrentItem(r5)
            goto L77
        L55:
            android.widget.TextView r1 = r6.mCurrText
            int r1 = r1.getRight()
            int r5 = r6.mTabPadding
            int r1 = r1 + r5
            float r1 = (float) r1
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L77
            androidx.viewpager.widget.ViewPager r1 = r6.mPager
            androidx.viewpager.widget.ViewPager r5 = r6.mPager
            int r5 = r5.getCurrentItem()
            int r5 = r5 + r4
            r1.setCurrentItem(r5)
            goto L77
        L70:
            r6.mInitialMotionX = r2
            r6.mInitialMotionY = r3
            r6.mIgnoreTap = r1
        L77:
            return r4
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            super.setBackgroundColor(r2)
            boolean r0 = r1.mDrawFullUnderlineSet
            if (r0 != 0) goto L11
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r2
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            r1.mDrawFullUnderline = r0
        L11:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setBackgroundDrawable(r2)
            boolean r0 = r1.mDrawFullUnderlineSet
            if (r0 != 0) goto Le
            if (r2 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1.mDrawFullUnderline = r0
        Le:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            boolean r0 = r1.mDrawFullUnderlineSet
            if (r0 != 0) goto Le
            if (r2 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1.mDrawFullUnderline = r0
        Le:
            return
    }

    public void setDrawFullUnderline(boolean r2) {
            r1 = this;
            r1.mDrawFullUnderline = r2
            r0 = 1
            r1.mDrawFullUnderlineSet = r0
            r1.invalidate()
            return
    }

    @Override // android.view.View
    public void setPadding(int r2, int r3, int r4, int r5) {
            r1 = this;
            int r0 = r1.mMinPaddingBottom
            if (r5 >= r0) goto L6
            int r5 = r1.mMinPaddingBottom
        L6:
            super.setPadding(r2, r3, r4, r5)
            return
    }

    public void setTabIndicatorColor(int r3) {
            r2 = this;
            r2.mIndicatorColor = r3
            android.graphics.Paint r0 = r2.mTabPaint
            int r1 = r2.mIndicatorColor
            r0.setColor(r1)
            r2.invalidate()
            return
    }

    public void setTabIndicatorColorResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r2)
            r1.setTabIndicatorColor(r0)
            return
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int r2) {
            r1 = this;
            int r0 = r1.mMinTextSpacing
            if (r2 >= r0) goto L6
            int r2 = r1.mMinTextSpacing
        L6:
            super.setTextSpacing(r2)
            return
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    void updateTextPositions(int r8, float r9, boolean r10) {
            r7 = this;
            android.graphics.Rect r0 = r7.mTempRect
            int r1 = r7.getHeight()
            android.widget.TextView r2 = r7.mCurrText
            int r2 = r2.getLeft()
            int r3 = r7.mTabPadding
            int r2 = r2 - r3
            android.widget.TextView r3 = r7.mCurrText
            int r3 = r3.getRight()
            int r4 = r7.mTabPadding
            int r3 = r3 + r4
            int r4 = r7.mIndicatorHeight
            int r4 = r1 - r4
            r0.set(r2, r4, r3, r1)
            super.updateTextPositions(r8, r9, r10)
            r5 = 1056964608(0x3f000000, float:0.5)
            float r5 = r9 - r5
            float r5 = java.lang.Math.abs(r5)
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r6
            r6 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 * r6
            int r5 = (int) r5
            r7.mTabAlpha = r5
            android.widget.TextView r5 = r7.mCurrText
            int r5 = r5.getLeft()
            int r6 = r7.mTabPadding
            int r5 = r5 - r6
            android.widget.TextView r2 = r7.mCurrText
            int r2 = r2.getRight()
            int r6 = r7.mTabPadding
            int r2 = r2 + r6
            r0.union(r5, r4, r2, r1)
            r7.invalidate(r0)
            return
    }
}
