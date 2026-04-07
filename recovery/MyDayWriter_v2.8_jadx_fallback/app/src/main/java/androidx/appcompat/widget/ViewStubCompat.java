package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends android.view.View {
    private androidx.appcompat.widget.ViewStubCompat.OnInflateListener mInflateListener;
    private int mInflatedId;
    private java.lang.ref.WeakReference<android.view.View> mInflatedViewRef;
    private android.view.LayoutInflater mInflater;
    private int mLayoutResource;

    public interface OnInflateListener {
        void onInflate(androidx.appcompat.widget.ViewStubCompat r1, android.view.View r2);
    }

    public ViewStubCompat(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ViewStubCompat(android.content.Context r5, android.util.AttributeSet r6, int r7) {
            r4 = this;
            r4.<init>(r5, r6, r7)
            r0 = 0
            r4.mLayoutResource = r0
            int[] r1 = androidx.appcompat.R.styleable.ViewStubCompat
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r1, r7, r0)
            int r2 = androidx.appcompat.R.styleable.ViewStubCompat_android_inflatedId
            r3 = -1
            int r2 = r1.getResourceId(r2, r3)
            r4.mInflatedId = r2
            int r2 = androidx.appcompat.R.styleable.ViewStubCompat_android_layout
            int r0 = r1.getResourceId(r2, r0)
            r4.mLayoutResource = r0
            int r0 = androidx.appcompat.R.styleable.ViewStubCompat_android_id
            int r0 = r1.getResourceId(r0, r3)
            r4.setId(r0)
            r1.recycle()
            r0 = 8
            r4.setVisibility(r0)
            r0 = 1
            r4.setWillNotDraw(r0)
            return
    }

    @Override // android.view.View
    protected void dispatchDraw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    public int getInflatedId() {
            r1 = this;
            int r0 = r1.mInflatedId
            return r0
    }

    public android.view.LayoutInflater getLayoutInflater() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.mInflater
            return r0
    }

    public int getLayoutResource() {
            r1 = this;
            int r0 = r1.mLayoutResource
            return r0
    }

    public android.view.View inflate() {
            r7 = this;
            android.view.ViewParent r0 = r7.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L5c
            int r1 = r7.mLayoutResource
            if (r1 == 0) goto L54
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.LayoutInflater r2 = r7.mInflater
            if (r2 == 0) goto L16
            android.view.LayoutInflater r2 = r7.mInflater
            goto L1e
        L16:
            android.content.Context r2 = r7.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
        L1e:
            int r3 = r7.mLayoutResource
            r4 = 0
            android.view.View r3 = r2.inflate(r3, r1, r4)
            int r4 = r7.mInflatedId
            r5 = -1
            if (r4 == r5) goto L2f
            int r4 = r7.mInflatedId
            r3.setId(r4)
        L2f:
            int r4 = r1.indexOfChild(r7)
            r1.removeViewInLayout(r7)
            android.view.ViewGroup$LayoutParams r5 = r7.getLayoutParams()
            if (r5 == 0) goto L40
            r1.addView(r3, r4, r5)
            goto L43
        L40:
            r1.addView(r3, r4)
        L43:
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r3)
            r7.mInflatedViewRef = r6
            androidx.appcompat.widget.ViewStubCompat$OnInflateListener r6 = r7.mInflateListener
            if (r6 == 0) goto L53
            androidx.appcompat.widget.ViewStubCompat$OnInflateListener r6 = r7.mInflateListener
            r6.onInflate(r7, r3)
        L53:
            return r3
        L54:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "ViewStub must have a valid layoutResource"
            r1.<init>(r2)
            throw r1
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "ViewStub must have a non-null ViewGroup viewParent"
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.setMeasuredDimension(r0, r0)
            return
    }

    public void setInflatedId(int r1) {
            r0 = this;
            r0.mInflatedId = r1
            return
    }

    public void setLayoutInflater(android.view.LayoutInflater r1) {
            r0 = this;
            r0.mInflater = r1
            return
    }

    public void setLayoutResource(int r1) {
            r0 = this;
            r0.mLayoutResource = r1
            return
    }

    public void setOnInflateListener(androidx.appcompat.widget.ViewStubCompat.OnInflateListener r1) {
            r0 = this;
            r0.mInflateListener = r1
            return
    }

    @Override // android.view.View
    public void setVisibility(int r4) {
            r3 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r3.mInflatedViewRef
            if (r0 == 0) goto L1a
            java.lang.ref.WeakReference<android.view.View> r0 = r3.mInflatedViewRef
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L12
            r0.setVisibility(r4)
            goto L25
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "setVisibility called on un-referenced view"
            r1.<init>(r2)
            throw r1
        L1a:
            super.setVisibility(r4)
            if (r4 == 0) goto L22
            r0 = 4
            if (r4 != r0) goto L25
        L22:
            r3.inflate()
        L25:
            return
    }
}
