package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
abstract class VectorDrawableCommon extends android.graphics.drawable.Drawable implements androidx.core.graphics.drawable.TintAwareDrawable {
    android.graphics.drawable.Drawable mDelegateDrawable;

    VectorDrawableCommon() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.applyTheme(r0, r2)
            return
        La:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.clearColorFilter()
            return
        La:
            super.clearColorFilter()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            android.graphics.drawable.Drawable r0 = r0.getCurrent()
            return r0
        Lb:
            android.graphics.drawable.Drawable r0 = super.getCurrent()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            int r0 = r0.getMinimumHeight()
            return r0
        Lb:
            int r0 = super.getMinimumHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            int r0 = r0.getMinimumWidth()
            return r0
        Lb:
            int r0 = super.getMinimumWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            boolean r0 = r0.getPadding(r2)
            return r0
        Lb:
            boolean r0 = super.getPadding(r2)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            int[] r0 = r0.getState()
            return r0
        Lb:
            int[] r0 = super.getState()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Region getTransparentRegion() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            android.graphics.Region r0 = r0.getTransparentRegion()
            return r0
        Lb:
            android.graphics.Region r0 = super.getTransparentRegion()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.jumpToCurrentState(r0)
            return
        La:
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.setBounds(r2)
            return
        La:
            super.onBoundsChange(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            boolean r0 = r0.setLevel(r2)
            return r0
        Lb:
            boolean r0 = super.onLevelChange(r2)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.setChangingConfigurations(r2)
            return
        La:
            super.setChangingConfigurations(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int r2, android.graphics.PorterDuff.Mode r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.setColorFilter(r2, r3)
            return
        La:
            super.setColorFilter(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.setFilterBitmap(r2)
            return
        La:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float r2, float r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.setHotspot(r0, r2, r3)
        L9:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(r0, r2, r3, r4, r5)
            return
        La:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            boolean r0 = r0.setState(r2)
            return r0
        Lb:
            boolean r0 = super.setState(r2)
            return r0
    }
}
