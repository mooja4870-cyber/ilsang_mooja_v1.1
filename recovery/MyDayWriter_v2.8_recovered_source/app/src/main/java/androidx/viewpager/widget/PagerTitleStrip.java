package androidx.viewpager.widget;

/* JADX INFO: loaded from: classes.dex */
@androidx.viewpager.widget.ViewPager.DecorView
public class PagerTitleStrip extends android.view.ViewGroup {
    private static final int[] ATTRS = null;
    private static final float SIDE_ALPHA = 0.6f;
    private static final int[] TEXT_ATTRS = null;
    private static final int TEXT_SPACING = 16;
    android.widget.TextView mCurrText;
    private int mGravity;
    private int mLastKnownCurrentPage;
    float mLastKnownPositionOffset;
    android.widget.TextView mNextText;
    private int mNonPrimaryAlpha;
    private final androidx.viewpager.widget.PagerTitleStrip.PageListener mPageListener;
    androidx.viewpager.widget.ViewPager mPager;
    android.widget.TextView mPrevText;
    private int mScaledTextSpacing;
    int mTextColor;
    private boolean mUpdatingPositions;
    private boolean mUpdatingText;
    private java.lang.ref.WeakReference<androidx.viewpager.widget.PagerAdapter> mWatchingAdapter;

    private class PageListener extends android.database.DataSetObserver implements androidx.viewpager.widget.ViewPager.OnPageChangeListener, androidx.viewpager.widget.ViewPager.OnAdapterChangeListener {
        private int mScrollState;
        final /* synthetic */ androidx.viewpager.widget.PagerTitleStrip this$0;

        PageListener(androidx.viewpager.widget.PagerTitleStrip r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(androidx.viewpager.widget.ViewPager r2, androidx.viewpager.widget.PagerAdapter r3, androidx.viewpager.widget.PagerAdapter r4) {
                r1 = this;
                androidx.viewpager.widget.PagerTitleStrip r0 = r1.this$0
                r0.updateAdapter(r3, r4)
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r4 = this;
                androidx.viewpager.widget.PagerTitleStrip r0 = r4.this$0
                androidx.viewpager.widget.PagerTitleStrip r1 = r4.this$0
                androidx.viewpager.widget.ViewPager r1 = r1.mPager
                int r1 = r1.getCurrentItem()
                androidx.viewpager.widget.PagerTitleStrip r2 = r4.this$0
                androidx.viewpager.widget.ViewPager r2 = r2.mPager
                androidx.viewpager.widget.PagerAdapter r2 = r2.getAdapter()
                r0.updateText(r1, r2)
                androidx.viewpager.widget.PagerTitleStrip r0 = r4.this$0
                float r0 = r0.mLastKnownPositionOffset
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L22
                androidx.viewpager.widget.PagerTitleStrip r0 = r4.this$0
                float r1 = r0.mLastKnownPositionOffset
            L22:
                androidx.viewpager.widget.PagerTitleStrip r0 = r4.this$0
                androidx.viewpager.widget.PagerTitleStrip r2 = r4.this$0
                androidx.viewpager.widget.ViewPager r2 = r2.mPager
                int r2 = r2.getCurrentItem()
                r3 = 1
                r0.updateTextPositions(r2, r1, r3)
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int r1) {
                r0 = this;
                r0.mScrollState = r1
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int r3, float r4, int r5) {
                r2 = this;
                r0 = 1056964608(0x3f000000, float:0.5)
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 <= 0) goto L8
                int r3 = r3 + 1
            L8:
                androidx.viewpager.widget.PagerTitleStrip r0 = r2.this$0
                r1 = 0
                r0.updateTextPositions(r3, r4, r1)
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int r5) {
                r4 = this;
                int r0 = r4.mScrollState
                if (r0 != 0) goto L34
                androidx.viewpager.widget.PagerTitleStrip r0 = r4.this$0
                androidx.viewpager.widget.PagerTitleStrip r1 = r4.this$0
                androidx.viewpager.widget.ViewPager r1 = r1.mPager
                int r1 = r1.getCurrentItem()
                androidx.viewpager.widget.PagerTitleStrip r2 = r4.this$0
                androidx.viewpager.widget.ViewPager r2 = r2.mPager
                androidx.viewpager.widget.PagerAdapter r2 = r2.getAdapter()
                r0.updateText(r1, r2)
                androidx.viewpager.widget.PagerTitleStrip r0 = r4.this$0
                float r0 = r0.mLastKnownPositionOffset
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 < 0) goto L26
                androidx.viewpager.widget.PagerTitleStrip r0 = r4.this$0
                float r1 = r0.mLastKnownPositionOffset
            L26:
                androidx.viewpager.widget.PagerTitleStrip r0 = r4.this$0
                androidx.viewpager.widget.PagerTitleStrip r2 = r4.this$0
                androidx.viewpager.widget.ViewPager r2 = r2.mPager
                int r2 = r2.getCurrentItem()
                r3 = 1
                r0.updateTextPositions(r2, r1, r3)
            L34:
                return
        }
    }

    private static class SingleLineAllCapsTransform extends android.text.method.SingleLineTransformationMethod {
        private java.util.Locale mLocale;

        SingleLineAllCapsTransform(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                android.content.res.Resources r0 = r2.getResources()
                android.content.res.Configuration r0 = r0.getConfiguration()
                java.util.Locale r0 = r0.locale
                r1.mLocale = r0
                return
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public java.lang.CharSequence getTransformation(java.lang.CharSequence r3, android.view.View r4) {
                r2 = this;
                java.lang.CharSequence r3 = super.getTransformation(r3, r4)
                if (r3 == 0) goto L11
                java.lang.String r0 = r3.toString()
                java.util.Locale r1 = r2.mLocale
                java.lang.String r0 = r0.toUpperCase(r1)
                goto L12
            L11:
                r0 = 0
            L12:
                return r0
        }
    }

    static {
            r0 = 16842904(0x1010098, float:2.3693984E-38)
            r1 = 16842927(0x10100af, float:2.3694048E-38)
            r2 = 16842804(0x1010034, float:2.3693704E-38)
            r3 = 16842901(0x1010095, float:2.3693976E-38)
            int[] r0 = new int[]{r2, r3, r0, r1}
            androidx.viewpager.widget.PagerTitleStrip.ATTRS = r0
            r0 = 16843660(0x101038c, float:2.3696103E-38)
            int[] r0 = new int[]{r0}
            androidx.viewpager.widget.PagerTitleStrip.TEXT_ATTRS = r0
            return
    }

    public PagerTitleStrip(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public PagerTitleStrip(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            r6.<init>(r7, r8)
            r0 = -1
            r6.mLastKnownCurrentPage = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.mLastKnownPositionOffset = r0
            androidx.viewpager.widget.PagerTitleStrip$PageListener r0 = new androidx.viewpager.widget.PagerTitleStrip$PageListener
            r0.<init>(r6)
            r6.mPageListener = r0
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r7)
            r6.mPrevText = r0
            r6.addView(r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r7)
            r6.mCurrText = r0
            r6.addView(r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r7)
            r6.mNextText = r0
            r6.addView(r0)
            int[] r0 = androidx.viewpager.widget.PagerTitleStrip.ATTRS
            android.content.res.TypedArray r0 = r7.obtainStyledAttributes(r8, r0)
            r1 = 0
            int r2 = r0.getResourceId(r1, r1)
            if (r2 == 0) goto L4b
            android.widget.TextView r3 = r6.mPrevText
            androidx.core.widget.TextViewCompat.setTextAppearance(r3, r2)
            android.widget.TextView r3 = r6.mCurrText
            androidx.core.widget.TextViewCompat.setTextAppearance(r3, r2)
            android.widget.TextView r3 = r6.mNextText
            androidx.core.widget.TextViewCompat.setTextAppearance(r3, r2)
        L4b:
            r3 = 1
            int r3 = r0.getDimensionPixelSize(r3, r1)
            if (r3 == 0) goto L56
            float r4 = (float) r3
            r6.setTextSize(r1, r4)
        L56:
            r4 = 2
            boolean r5 = r0.hasValue(r4)
            if (r5 == 0) goto L70
            int r4 = r0.getColor(r4, r1)
            android.widget.TextView r5 = r6.mPrevText
            r5.setTextColor(r4)
            android.widget.TextView r5 = r6.mCurrText
            r5.setTextColor(r4)
            android.widget.TextView r5 = r6.mNextText
            r5.setTextColor(r4)
        L70:
            r4 = 3
            r5 = 80
            int r4 = r0.getInteger(r4, r5)
            r6.mGravity = r4
            r0.recycle()
            android.widget.TextView r4 = r6.mCurrText
            android.content.res.ColorStateList r4 = r4.getTextColors()
            int r4 = r4.getDefaultColor()
            r6.mTextColor = r4
            r4 = 1058642330(0x3f19999a, float:0.6)
            r6.setNonPrimaryAlpha(r4)
            android.widget.TextView r4 = r6.mPrevText
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            r4.setEllipsize(r5)
            android.widget.TextView r4 = r6.mCurrText
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            r4.setEllipsize(r5)
            android.widget.TextView r4 = r6.mNextText
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            r4.setEllipsize(r5)
            r4 = 0
            if (r2 == 0) goto Lb3
            int[] r5 = androidx.viewpager.widget.PagerTitleStrip.TEXT_ATTRS
            android.content.res.TypedArray r5 = r7.obtainStyledAttributes(r2, r5)
            boolean r4 = r5.getBoolean(r1, r1)
            r5.recycle()
        Lb3:
            if (r4 == 0) goto Lc5
            android.widget.TextView r1 = r6.mPrevText
            setSingleLineAllCaps(r1)
            android.widget.TextView r1 = r6.mCurrText
            setSingleLineAllCaps(r1)
            android.widget.TextView r1 = r6.mNextText
            setSingleLineAllCaps(r1)
            goto Ld4
        Lc5:
            android.widget.TextView r1 = r6.mPrevText
            r1.setSingleLine()
            android.widget.TextView r1 = r6.mCurrText
            r1.setSingleLine()
            android.widget.TextView r1 = r6.mNextText
            r1.setSingleLine()
        Ld4:
            android.content.res.Resources r1 = r7.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r5 = 1098907648(0x41800000, float:16.0)
            float r5 = r5 * r1
            int r5 = (int) r5
            r6.mScaledTextSpacing = r5
            return
    }

    private static void setSingleLineAllCaps(android.widget.TextView r2) {
            androidx.viewpager.widget.PagerTitleStrip$SingleLineAllCapsTransform r0 = new androidx.viewpager.widget.PagerTitleStrip$SingleLineAllCapsTransform
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.setTransformationMethod(r0)
            return
    }

    int getMinHeight() {
            r2 = this;
            r0 = 0
            android.graphics.drawable.Drawable r1 = r2.getBackground()
            if (r1 == 0) goto Lb
            int r0 = r1.getIntrinsicHeight()
        Lb:
            return r0
    }

    public int getTextSpacing() {
            r1 = this;
            int r0 = r1.mScaledTextSpacing
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r4 = this;
            super.onAttachedToWindow()
            android.view.ViewParent r0 = r4.getParent()
            boolean r1 = r0 instanceof androidx.viewpager.widget.ViewPager
            if (r1 == 0) goto L30
            r1 = r0
            androidx.viewpager.widget.ViewPager r1 = (androidx.viewpager.widget.ViewPager) r1
            androidx.viewpager.widget.PagerAdapter r2 = r1.getAdapter()
            androidx.viewpager.widget.PagerTitleStrip$PageListener r3 = r4.mPageListener
            r1.setInternalPageChangeListener(r3)
            androidx.viewpager.widget.PagerTitleStrip$PageListener r3 = r4.mPageListener
            r1.addOnAdapterChangeListener(r3)
            r4.mPager = r1
            java.lang.ref.WeakReference<androidx.viewpager.widget.PagerAdapter> r3 = r4.mWatchingAdapter
            if (r3 == 0) goto L2b
            java.lang.ref.WeakReference<androidx.viewpager.widget.PagerAdapter> r3 = r4.mWatchingAdapter
            java.lang.Object r3 = r3.get()
            androidx.viewpager.widget.PagerAdapter r3 = (androidx.viewpager.widget.PagerAdapter) r3
            goto L2c
        L2b:
            r3 = 0
        L2c:
            r4.updateAdapter(r3, r2)
            return
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "PagerTitleStrip must be a direct child of a ViewPager."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r3 = this;
            super.onDetachedFromWindow()
            androidx.viewpager.widget.ViewPager r0 = r3.mPager
            if (r0 == 0) goto L1f
            androidx.viewpager.widget.ViewPager r0 = r3.mPager
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            r1 = 0
            r3.updateAdapter(r0, r1)
            androidx.viewpager.widget.ViewPager r0 = r3.mPager
            r0.setInternalPageChangeListener(r1)
            androidx.viewpager.widget.ViewPager r0 = r3.mPager
            androidx.viewpager.widget.PagerTitleStrip$PageListener r2 = r3.mPageListener
            r0.removeOnAdapterChangeListener(r2)
            r3.mPager = r1
        L1f:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            androidx.viewpager.widget.ViewPager r0 = r3.mPager
            if (r0 == 0) goto L13
            float r0 = r3.mLastKnownPositionOffset
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto Ld
            float r1 = r3.mLastKnownPositionOffset
        Ld:
            int r0 = r3.mLastKnownCurrentPage
            r2 = 1
            r3.updateTextPositions(r0, r1, r2)
        L13:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r11, int r12) {
            r10 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L5f
            int r2 = r10.getPaddingTop()
            int r3 = r10.getPaddingBottom()
            int r2 = r2 + r3
            r3 = -2
            int r4 = getChildMeasureSpec(r12, r2, r3)
            int r5 = android.view.View.MeasureSpec.getSize(r11)
            float r6 = (float) r5
            r7 = 1045220557(0x3e4ccccd, float:0.2)
            float r6 = r6 * r7
            int r6 = (int) r6
            int r3 = getChildMeasureSpec(r11, r6, r3)
            android.widget.TextView r7 = r10.mPrevText
            r7.measure(r3, r4)
            android.widget.TextView r7 = r10.mCurrText
            r7.measure(r3, r4)
            android.widget.TextView r7 = r10.mNextText
            r7.measure(r3, r4)
            int r7 = android.view.View.MeasureSpec.getMode(r12)
            if (r7 != r1) goto L3e
            int r1 = android.view.View.MeasureSpec.getSize(r12)
            goto L4f
        L3e:
            android.widget.TextView r1 = r10.mCurrText
            int r1 = r1.getMeasuredHeight()
            int r8 = r10.getMinHeight()
            int r9 = r1 + r2
            int r9 = java.lang.Math.max(r8, r9)
            r1 = r9
        L4f:
            android.widget.TextView r8 = r10.mCurrText
            int r8 = r8.getMeasuredState()
            int r9 = r8 << 16
            int r9 = android.view.View.resolveSizeAndState(r1, r12, r9)
            r10.setMeasuredDimension(r5, r9)
            return
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Must measure with an exact width"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r1 = this;
            boolean r0 = r1.mUpdatingText
            if (r0 != 0) goto L7
            super.requestLayout()
        L7:
            return
    }

    public void setGravity(int r1) {
            r0 = this;
            r0.mGravity = r1
            r0.requestLayout()
            return
    }

    public void setNonPrimaryAlpha(float r4) {
            r3 = this;
            r0 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r4
            int r0 = (int) r0
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3.mNonPrimaryAlpha = r0
            int r0 = r3.mNonPrimaryAlpha
            int r0 = r0 << 24
            int r1 = r3.mTextColor
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r2
            r0 = r0 | r1
            android.widget.TextView r1 = r3.mPrevText
            r1.setTextColor(r0)
            android.widget.TextView r1 = r3.mNextText
            r1.setTextColor(r0)
            return
    }

    public void setTextColor(int r4) {
            r3 = this;
            r3.mTextColor = r4
            android.widget.TextView r0 = r3.mCurrText
            r0.setTextColor(r4)
            int r0 = r3.mNonPrimaryAlpha
            int r0 = r0 << 24
            int r1 = r3.mTextColor
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r2
            r0 = r0 | r1
            android.widget.TextView r1 = r3.mPrevText
            r1.setTextColor(r0)
            android.widget.TextView r1 = r3.mNextText
            r1.setTextColor(r0)
            return
    }

    public void setTextSize(int r2, float r3) {
            r1 = this;
            android.widget.TextView r0 = r1.mPrevText
            r0.setTextSize(r2, r3)
            android.widget.TextView r0 = r1.mCurrText
            r0.setTextSize(r2, r3)
            android.widget.TextView r0 = r1.mNextText
            r0.setTextSize(r2, r3)
            return
    }

    public void setTextSpacing(int r1) {
            r0 = this;
            r0.mScaledTextSpacing = r1
            r0.requestLayout()
            return
    }

    void updateAdapter(androidx.viewpager.widget.PagerAdapter r2, androidx.viewpager.widget.PagerAdapter r3) {
            r1 = this;
            if (r2 == 0) goto La
            androidx.viewpager.widget.PagerTitleStrip$PageListener r0 = r1.mPageListener
            r2.unregisterDataSetObserver(r0)
            r0 = 0
            r1.mWatchingAdapter = r0
        La:
            if (r3 == 0) goto L18
            androidx.viewpager.widget.PagerTitleStrip$PageListener r0 = r1.mPageListener
            r3.registerDataSetObserver(r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r1.mWatchingAdapter = r0
        L18:
            androidx.viewpager.widget.ViewPager r0 = r1.mPager
            if (r0 == 0) goto L2f
            r0 = -1
            r1.mLastKnownCurrentPage = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.mLastKnownPositionOffset = r0
            androidx.viewpager.widget.ViewPager r0 = r1.mPager
            int r0 = r0.getCurrentItem()
            r1.updateText(r0, r3)
            r1.requestLayout()
        L2f:
            return
    }

    void updateText(int r11, androidx.viewpager.widget.PagerAdapter r12) {
            r10 = this;
            r0 = 0
            if (r12 == 0) goto L8
            int r1 = r12.getCount()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = 1
            r10.mUpdatingText = r2
            r3 = 0
            if (r11 < r2) goto L17
            if (r12 == 0) goto L17
            int r2 = r11 + (-1)
            java.lang.CharSequence r3 = r12.getPageTitle(r2)
        L17:
            android.widget.TextView r2 = r10.mPrevText
            r2.setText(r3)
            android.widget.TextView r2 = r10.mCurrText
            if (r12 == 0) goto L27
            if (r11 >= r1) goto L27
            java.lang.CharSequence r4 = r12.getPageTitle(r11)
            goto L28
        L27:
            r4 = 0
        L28:
            r2.setText(r4)
            r2 = 0
            int r3 = r11 + 1
            if (r3 >= r1) goto L38
            if (r12 == 0) goto L38
            int r3 = r11 + 1
            java.lang.CharSequence r2 = r12.getPageTitle(r3)
        L38:
            android.widget.TextView r3 = r10.mNextText
            r3.setText(r2)
            int r3 = r10.getWidth()
            int r4 = r10.getPaddingLeft()
            int r3 = r3 - r4
            int r4 = r10.getPaddingRight()
            int r3 = r3 - r4
            float r4 = (float) r3
            r5 = 1061997773(0x3f4ccccd, float:0.8)
            float r4 = r4 * r5
            int r4 = (int) r4
            int r4 = java.lang.Math.max(r0, r4)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            int r7 = r10.getHeight()
            int r8 = r10.getPaddingTop()
            int r7 = r7 - r8
            int r8 = r10.getPaddingBottom()
            int r7 = r7 - r8
            int r8 = java.lang.Math.max(r0, r7)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r5)
            android.widget.TextView r9 = r10.mPrevText
            r9.measure(r6, r5)
            android.widget.TextView r9 = r10.mCurrText
            r9.measure(r6, r5)
            android.widget.TextView r9 = r10.mNextText
            r9.measure(r6, r5)
            r10.mLastKnownCurrentPage = r11
            boolean r9 = r10.mUpdatingPositions
            if (r9 != 0) goto L8b
            float r9 = r10.mLastKnownPositionOffset
            r10.updateTextPositions(r11, r9, r0)
        L8b:
            r10.mUpdatingText = r0
            return
    }

    void updateTextPositions(int r18, float r19, boolean r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r0.mLastKnownCurrentPage
            if (r1 == r3) goto L14
            androidx.viewpager.widget.ViewPager r3 = r0.mPager
            androidx.viewpager.widget.PagerAdapter r3 = r3.getAdapter()
            r0.updateText(r1, r3)
            goto L1d
        L14:
            if (r20 != 0) goto L1d
            float r1 = r0.mLastKnownPositionOffset
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L1d
            return
        L1d:
            r1 = 1
            r0.mUpdatingPositions = r1
            android.widget.TextView r1 = r0.mPrevText
            int r1 = r1.getMeasuredWidth()
            android.widget.TextView r3 = r0.mCurrText
            int r3 = r3.getMeasuredWidth()
            android.widget.TextView r4 = r0.mNextText
            int r4 = r4.getMeasuredWidth()
            int r5 = r3 / 2
            int r6 = r0.getWidth()
            int r7 = r0.getHeight()
            int r8 = r0.getPaddingLeft()
            int r9 = r0.getPaddingRight()
            int r10 = r0.getPaddingTop()
            int r11 = r0.getPaddingBottom()
            int r12 = r8 + r5
            int r13 = r9 + r5
            int r12 = r6 - r12
            int r12 = r12 - r13
            r14 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14 + r2
            r15 = 1065353216(0x3f800000, float:1.0)
            int r16 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r16 <= 0) goto L5d
            float r14 = r14 - r15
        L5d:
            int r13 = r6 - r13
            float r12 = (float) r12
            float r12 = r12 * r14
            int r12 = (int) r12
            int r13 = r13 - r12
            int r13 = r13 - r5
            int r3 = r3 + r13
            android.widget.TextView r5 = r0.mPrevText
            int r5 = r5.getBaseline()
            android.widget.TextView r12 = r0.mCurrText
            int r12 = r12.getBaseline()
            android.widget.TextView r14 = r0.mNextText
            int r14 = r14.getBaseline()
            int r15 = java.lang.Math.max(r5, r12)
            int r15 = java.lang.Math.max(r15, r14)
            int r5 = r15 - r5
            int r12 = r15 - r12
            int r15 = r15 - r14
            android.widget.TextView r14 = r0.mPrevText
            int r14 = r14.getMeasuredHeight()
            int r14 = r14 + r5
            r18 = r1
            android.widget.TextView r1 = r0.mCurrText
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r12
            r20 = r4
            android.widget.TextView r4 = r0.mNextText
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r1 = java.lang.Math.max(r14, r1)
            int r1 = java.lang.Math.max(r1, r4)
            int r4 = r0.mGravity
            r4 = r4 & 112(0x70, float:1.57E-43)
            switch(r4) {
                case 16: goto Lb7;
                case 80: goto Lb1;
                default: goto Lac;
            }
        Lac:
            int r5 = r5 + r10
            int r12 = r12 + r10
            int r7 = r10 + r15
            goto Lc0
        Lb1:
            int r7 = r7 - r11
            int r7 = r7 - r1
            int r5 = r5 + r7
            int r12 = r12 + r7
            int r7 = r7 + r15
            goto Lc0
        Lb7:
            int r7 = r7 - r10
            int r7 = r7 - r11
            int r7 = r7 - r1
            int r7 = r7 / 2
            int r5 = r5 + r7
            int r12 = r12 + r7
            int r7 = r7 + r15
        Lc0:
            android.widget.TextView r1 = r0.mCurrText
            android.widget.TextView r4 = r0.mCurrText
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r12
            r1.layout(r13, r12, r3, r4)
            int r1 = r0.mScaledTextSpacing
            int r13 = r13 - r1
            int r13 = r13 - r18
            int r1 = java.lang.Math.min(r8, r13)
            android.widget.TextView r4 = r0.mPrevText
            int r8 = r1 + r18
            android.widget.TextView r10 = r0.mPrevText
            int r10 = r10.getMeasuredHeight()
            int r10 = r10 + r5
            r4.layout(r1, r5, r8, r10)
            int r6 = r6 - r9
            int r6 = r6 - r20
            int r1 = r0.mScaledTextSpacing
            int r3 = r3 + r1
            int r1 = java.lang.Math.max(r6, r3)
            android.widget.TextView r3 = r0.mNextText
            int r4 = r1 + r20
            android.widget.TextView r5 = r0.mNextText
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r7
            r3.layout(r1, r7, r4, r5)
            r0.mLastKnownPositionOffset = r2
            r1 = 0
            r0.mUpdatingPositions = r1
            return
    }
}
