package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatPopupWindow extends android.widget.PopupWindow {
    private static final boolean COMPAT_OVERLAP_ANCHOR = false;
    private boolean mOverlapAnchor;

    static {
            r0 = 0
            androidx.appcompat.widget.AppCompatPopupWindow.COMPAT_OVERLAP_ANCHOR = r0
            return
    }

    public AppCompatPopupWindow(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            r0 = 0
            r1.init(r2, r3, r4, r0)
            return
    }

    public AppCompatPopupWindow(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.init(r1, r2, r3, r4)
            return
    }

    private void init(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
            r3 = this;
            int[] r0 = androidx.appcompat.R.styleable.PopupWindow
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r4, r5, r0, r6, r7)
            int r1 = androidx.appcompat.R.styleable.PopupWindow_overlapAnchor
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L18
            int r1 = androidx.appcompat.R.styleable.PopupWindow_overlapAnchor
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            r3.setSupportOverlapAnchor(r1)
        L18:
            int r1 = androidx.appcompat.R.styleable.PopupWindow_android_popupBackground
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
            r3.setBackgroundDrawable(r1)
            r0.recycle()
            return
    }

    private void setSupportOverlapAnchor(boolean r2) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.AppCompatPopupWindow.COMPAT_OVERLAP_ANCHOR
            if (r0 == 0) goto L7
            r1.mOverlapAnchor = r2
            goto La
        L7:
            androidx.core.widget.PopupWindowCompat.setOverlapAnchor(r1, r2)
        La:
            return
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View r2, int r3, int r4) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.AppCompatPopupWindow.COMPAT_OVERLAP_ANCHOR
            if (r0 == 0) goto Ld
            boolean r0 = r1.mOverlapAnchor
            if (r0 == 0) goto Ld
            int r0 = r2.getHeight()
            int r4 = r4 - r0
        Ld:
            super.showAsDropDown(r2, r3, r4)
            return
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.AppCompatPopupWindow.COMPAT_OVERLAP_ANCHOR
            if (r0 == 0) goto Ld
            boolean r0 = r1.mOverlapAnchor
            if (r0 == 0) goto Ld
            int r0 = r2.getHeight()
            int r4 = r4 - r0
        Ld:
            super.showAsDropDown(r2, r3, r4, r5)
            return
    }

    @Override // android.widget.PopupWindow
    public void update(android.view.View r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            boolean r0 = androidx.appcompat.widget.AppCompatPopupWindow.COMPAT_OVERLAP_ANCHOR
            if (r0 == 0) goto Lf
            boolean r0 = r6.mOverlapAnchor
            if (r0 == 0) goto Lf
            int r0 = r7.getHeight()
            int r9 = r9 - r0
            r3 = r9
            goto L10
        Lf:
            r3 = r9
        L10:
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            super.update(r1, r2, r3, r4, r5)
            return
    }
}
