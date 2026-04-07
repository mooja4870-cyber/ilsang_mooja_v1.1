package androidx.core.view.insets;

/* JADX INFO: loaded from: classes.dex */
public class ColorProtection extends androidx.core.view.insets.Protection {
    private int mColor;
    private final android.graphics.drawable.ColorDrawable mDrawable;
    private boolean mHasColor;

    public ColorProtection(int r2) {
            r1 = this;
            r1.<init>(r2)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>()
            r1.mDrawable = r0
            r0 = 0
            r1.mColor = r0
            return
    }

    public ColorProtection(int r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.setColor(r2)
            return
    }

    private void setColorInner(int r2) {
            r1 = this;
            int r0 = r1.mColor
            if (r0 == r2) goto L10
            r1.mColor = r2
            android.graphics.drawable.ColorDrawable r0 = r1.mDrawable
            r0.setColor(r2)
            android.graphics.drawable.ColorDrawable r0 = r1.mDrawable
            r1.setDrawable(r0)
        L10:
            return
    }

    @Override // androidx.core.view.insets.Protection
    void dispatchColorHint(int r2) {
            r1 = this;
            boolean r0 = r1.mHasColor
            if (r0 != 0) goto L7
            r1.setColorInner(r2)
        L7:
            return
    }

    public int getColor() {
            r1 = this;
            int r0 = r1.mColor
            return r0
    }

    @Override // androidx.core.view.insets.Protection
    boolean occupiesCorners() {
            r1 = this;
            r0 = 1
            return r0
    }

    public void setColor(int r2) {
            r1 = this;
            r0 = 1
            r1.mHasColor = r0
            r1.setColorInner(r2)
            return
    }
}
