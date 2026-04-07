package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatProgressBarHelper {
    private static final int[] TINT_ATTRS = null;
    private android.graphics.Bitmap mSampleTile;
    private final android.widget.ProgressBar mView;

    private static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void transferLayerProperties(android.graphics.drawable.LayerDrawable r1, android.graphics.drawable.LayerDrawable r2, int r3) {
                int r0 = r1.getLayerGravity(r3)
                r2.setLayerGravity(r3, r0)
                int r0 = r1.getLayerWidth(r3)
                r2.setLayerWidth(r3, r0)
                int r0 = r1.getLayerHeight(r3)
                r2.setLayerHeight(r3, r0)
                int r0 = r1.getLayerInsetLeft(r3)
                r2.setLayerInsetLeft(r3, r0)
                int r0 = r1.getLayerInsetRight(r3)
                r2.setLayerInsetRight(r3, r0)
                int r0 = r1.getLayerInsetTop(r3)
                r2.setLayerInsetTop(r3, r0)
                int r0 = r1.getLayerInsetBottom(r3)
                r2.setLayerInsetBottom(r3, r0)
                int r0 = r1.getLayerInsetStart(r3)
                r2.setLayerInsetStart(r3, r0)
                int r0 = r1.getLayerInsetEnd(r3)
                r2.setLayerInsetEnd(r3, r0)
                return
        }
    }

    static {
            r0 = 16843067(0x101013b, float:2.369444E-38)
            r1 = 16843068(0x101013c, float:2.3694444E-38)
            int[] r0 = new int[]{r0, r1}
            androidx.appcompat.widget.AppCompatProgressBarHelper.TINT_ATTRS = r0
            return
    }

    AppCompatProgressBarHelper(android.widget.ProgressBar r1) {
            r0 = this;
            r0.<init>()
            r0.mView = r1
            return
    }

    private android.graphics.drawable.shapes.Shape getDrawableShape() {
            r3 = this;
            r0 = 8
            float[] r0 = new float[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584} // fill-array
            android.graphics.drawable.shapes.RoundRectShape r1 = new android.graphics.drawable.shapes.RoundRectShape
            r2 = 0
            r1.<init>(r0, r2, r2)
            return r1
    }

    private android.graphics.drawable.Drawable tileifyIndeterminate(android.graphics.drawable.Drawable r8) {
            r7 = this;
            boolean r0 = r8 instanceof android.graphics.drawable.AnimationDrawable
            if (r0 == 0) goto L36
            r0 = r8
            android.graphics.drawable.AnimationDrawable r0 = (android.graphics.drawable.AnimationDrawable) r0
            int r1 = r0.getNumberOfFrames()
            android.graphics.drawable.AnimationDrawable r2 = new android.graphics.drawable.AnimationDrawable
            r2.<init>()
            boolean r3 = r0.isOneShot()
            r2.setOneShot(r3)
            r3 = 0
        L18:
            r4 = 10000(0x2710, float:1.4013E-41)
            if (r3 >= r1) goto L32
            android.graphics.drawable.Drawable r5 = r0.getFrame(r3)
            r6 = 1
            android.graphics.drawable.Drawable r5 = r7.tileify(r5, r6)
            r5.setLevel(r4)
            int r4 = r0.getDuration(r3)
            r2.addFrame(r5, r4)
            int r3 = r3 + 1
            goto L18
        L32:
            r2.setLevel(r4)
            r8 = r2
        L36:
            return r8
    }

    android.graphics.Bitmap getSampleTile() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.mSampleTile
            return r0
    }

    void loadFromAttributes(android.util.AttributeSet r6, int r7) {
            r5 = this;
            android.widget.ProgressBar r0 = r5.mView
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.widget.AppCompatProgressBarHelper.TINT_ATTRS
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r6, r1, r7, r2)
            android.graphics.drawable.Drawable r1 = r0.getDrawableIfKnown(r2)
            if (r1 == 0) goto L1c
            android.widget.ProgressBar r3 = r5.mView
            android.graphics.drawable.Drawable r4 = r5.tileifyIndeterminate(r1)
            r3.setIndeterminateDrawable(r4)
        L1c:
            r3 = 1
            android.graphics.drawable.Drawable r1 = r0.getDrawableIfKnown(r3)
            if (r1 == 0) goto L2c
            android.widget.ProgressBar r3 = r5.mView
            android.graphics.drawable.Drawable r2 = r5.tileify(r1, r2)
            r3.setProgressDrawable(r2)
        L2c:
            r0.recycle()
            return
    }

    android.graphics.drawable.Drawable tileify(android.graphics.drawable.Drawable r9, boolean r10) {
            r8 = this;
            boolean r0 = r9 instanceof androidx.core.graphics.drawable.WrappedDrawable
            if (r0 == 0) goto L19
            r0 = r9
            androidx.core.graphics.drawable.WrappedDrawable r0 = (androidx.core.graphics.drawable.WrappedDrawable) r0
            android.graphics.drawable.Drawable r0 = r0.getWrappedDrawable()
            if (r0 == 0) goto L17
            android.graphics.drawable.Drawable r0 = r8.tileify(r0, r10)
            r1 = r9
            androidx.core.graphics.drawable.WrappedDrawable r1 = (androidx.core.graphics.drawable.WrappedDrawable) r1
            r1.setWrappedDrawable(r0)
        L17:
            goto La4
        L19:
            boolean r0 = r9 instanceof android.graphics.drawable.LayerDrawable
            r1 = 1
            if (r0 == 0) goto L60
            r0 = r9
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            int r2 = r0.getNumberOfLayers()
            android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r2]
            r4 = 0
        L28:
            if (r4 >= r2) goto L49
            int r5 = r0.getId(r4)
            android.graphics.drawable.Drawable r6 = r0.getDrawable(r4)
            r7 = 16908301(0x102000d, float:2.3877265E-38)
            if (r5 == r7) goto L3f
            r7 = 16908303(0x102000f, float:2.387727E-38)
            if (r5 != r7) goto L3d
            goto L3f
        L3d:
            r7 = 0
            goto L40
        L3f:
            r7 = r1
        L40:
            android.graphics.drawable.Drawable r6 = r8.tileify(r6, r7)
            r3[r4] = r6
            int r4 = r4 + 1
            goto L28
        L49:
            android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
            r1.<init>(r3)
            r4 = 0
        L4f:
            if (r4 >= r2) goto L5f
            int r5 = r0.getId(r4)
            r1.setId(r4, r5)
            androidx.appcompat.widget.AppCompatProgressBarHelper.Api23Impl.transferLayerProperties(r0, r1, r4)
            int r4 = r4 + 1
            goto L4f
        L5f:
            return r1
        L60:
            boolean r0 = r9 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto La4
            r0 = r9
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r2 = r0.getBitmap()
            android.graphics.Bitmap r3 = r8.mSampleTile
            if (r3 != 0) goto L71
            r8.mSampleTile = r2
        L71:
            android.graphics.drawable.ShapeDrawable r3 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.Shape r4 = r8.getDrawableShape()
            r3.<init>(r4)
            android.graphics.BitmapShader r4 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r5 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.Shader$TileMode r6 = android.graphics.Shader.TileMode.CLAMP
            r4.<init>(r2, r5, r6)
            android.graphics.Paint r5 = r3.getPaint()
            r5.setShader(r4)
            android.graphics.Paint r5 = r3.getPaint()
            android.graphics.Paint r6 = r0.getPaint()
            android.graphics.ColorFilter r6 = r6.getColorFilter()
            r5.setColorFilter(r6)
            if (r10 == 0) goto La2
            android.graphics.drawable.ClipDrawable r5 = new android.graphics.drawable.ClipDrawable
            r6 = 3
            r5.<init>(r3, r6, r1)
            goto La3
        La2:
            r5 = r3
        La3:
            return r5
        La4:
            return r9
    }
}
