package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends android.widget.ImageView implements androidx.core.view.TintableBackgroundView, androidx.core.widget.TintableImageSourceView {
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;
    private boolean mHasLevel;
    private final androidx.appcompat.widget.AppCompatImageHelper mImageHelper;

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.AppCompatImageView> {
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private boolean mPropertiesMapped;
        private int mTintId;
        private int mTintModeId;

        public InspectionCompanion() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mPropertiesMapped = r0
                return
        }

        @Override // android.view.inspector.InspectionCompanion
        public void mapProperties(android.view.inspector.PropertyMapper r3) {
                r2 = this;
                java.lang.String r0 = "backgroundTint"
                int r1 = androidx.appcompat.R.attr.backgroundTint
                int r0 = r3.mapObject(r0, r1)
                r2.mBackgroundTintId = r0
                java.lang.String r0 = "backgroundTintMode"
                int r1 = androidx.appcompat.R.attr.backgroundTintMode
                int r0 = r3.mapObject(r0, r1)
                r2.mBackgroundTintModeId = r0
                java.lang.String r0 = "tint"
                int r1 = androidx.appcompat.R.attr.tint
                int r0 = r3.mapObject(r0, r1)
                r2.mTintId = r0
                java.lang.String r0 = "tintMode"
                int r1 = androidx.appcompat.R.attr.tintMode
                int r0 = r3.mapObject(r0, r1)
                r2.mTintModeId = r0
                r0 = 1
                r2.mPropertiesMapped = r0
                return
        }

        /* JADX INFO: renamed from: readProperties, reason: avoid collision after fix types in other method */
        public void readProperties2(androidx.appcompat.widget.AppCompatImageView r3, android.view.inspector.PropertyReader r4) {
                r2 = this;
                boolean r0 = r2.mPropertiesMapped
                if (r0 == 0) goto L29
                int r0 = r2.mBackgroundTintId
                android.content.res.ColorStateList r1 = r3.getBackgroundTintList()
                r4.readObject(r0, r1)
                int r0 = r2.mBackgroundTintModeId
                android.graphics.PorterDuff$Mode r1 = r3.getBackgroundTintMode()
                r4.readObject(r0, r1)
                int r0 = r2.mTintId
                android.content.res.ColorStateList r1 = r3.getImageTintList()
                r4.readObject(r0, r1)
                int r0 = r2.mTintModeId
                android.graphics.PorterDuff$Mode r1 = r3.getImageTintMode()
                r4.readObject(r0, r1)
                return
            L29:
                android.view.inspector.InspectionCompanion$UninitializedPropertyMapException r0 = new android.view.inspector.InspectionCompanion$UninitializedPropertyMapException
                r0.<init>()
                throw r0
        }

        @Override // android.view.inspector.InspectionCompanion
        public /* bridge */ /* synthetic */ void readProperties(androidx.appcompat.widget.AppCompatImageView r1, android.view.inspector.PropertyReader r2) {
                r0 = this;
                androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
                r0.readProperties2(r1, r2)
                return
        }
    }

    public AppCompatImageView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatImageView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatImageView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            android.content.Context r0 = androidx.appcompat.widget.TintContextWrapper.wrap(r2)
            r1.<init>(r0, r3, r4)
            r0 = 0
            r1.mHasLevel = r0
            android.content.Context r0 = r1.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r1, r0)
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = new androidx.appcompat.widget.AppCompatBackgroundHelper
            r0.<init>(r1)
            r1.mBackgroundTintHelper = r0
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            r0.loadFromAttributes(r3, r4)
            androidx.appcompat.widget.AppCompatImageHelper r0 = new androidx.appcompat.widget.AppCompatImageHelper
            r0.<init>(r1)
            r1.mImageHelper = r0
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            r0.loadFromAttributes(r3, r4)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            r0.applySupportBackgroundTint()
        Lc:
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            if (r0 == 0) goto L15
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            r0.applySupportImageTint()
        L15:
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            android.content.res.ColorStateList r0 = r0.getSupportBackgroundTintList()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            android.graphics.PorterDuff$Mode r0 = r0.getSupportBackgroundTintMode()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public android.content.res.ColorStateList getSupportImageTintList() {
            r1 = this;
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            android.content.res.ColorStateList r0 = r0.getSupportImageTintList()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
            r1 = this;
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            android.graphics.PorterDuff$Mode r0 = r0.getSupportImageTintMode()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
            r1 = this;
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            boolean r0 = r0.hasOverlappingRendering()
            if (r0 == 0) goto L10
            boolean r0 = super.hasOverlappingRendering()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setBackgroundDrawable(r2)
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            r0.onSetBackgroundDrawable(r2)
        Lc:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            r0.onSetBackgroundResource(r2)
        Lc:
            return
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap r2) {
            r1 = this;
            super.setImageBitmap(r2)
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            r0.applySupportImageTint()
        Lc:
            return
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            if (r0 == 0) goto Lf
            if (r2 == 0) goto Lf
            boolean r0 = r1.mHasLevel
            if (r0 != 0) goto Lf
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            r0.obtainLevelFromDrawable(r2)
        Lf:
            super.setImageDrawable(r2)
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            if (r0 == 0) goto L24
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            r0.applySupportImageTint()
            boolean r0 = r1.mHasLevel
            if (r0 != 0) goto L24
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            r0.applyImageLevel()
        L24:
            return
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int r2) {
            r1 = this;
            super.setImageLevel(r2)
            r0 = 1
            r1.mHasLevel = r0
            return
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            if (r0 == 0) goto L9
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            r0.setImageResource(r2)
        L9:
            return
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri r2) {
            r1 = this;
            super.setImageURI(r2)
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            r0.applySupportImageTint()
        Lc:
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L9
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            r0.setSupportBackgroundTintList(r2)
        L9:
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L9
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            r0.setSupportBackgroundTintMode(r2)
        L9:
            return
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            if (r0 == 0) goto L9
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            r0.setSupportImageTintList(r2)
        L9:
            return
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            if (r0 == 0) goto L9
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.mImageHelper
            r0.setSupportImageTintMode(r2)
        L9:
            return
    }
}
