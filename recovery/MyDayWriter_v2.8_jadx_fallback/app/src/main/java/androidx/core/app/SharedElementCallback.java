package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class SharedElementCallback {
    private static final java.lang.String BUNDLE_SNAPSHOT_BITMAP = "sharedElement:snapshot:bitmap";
    private static final java.lang.String BUNDLE_SNAPSHOT_IMAGE_MATRIX = "sharedElement:snapshot:imageMatrix";
    private static final java.lang.String BUNDLE_SNAPSHOT_IMAGE_SCALETYPE = "sharedElement:snapshot:imageScaleType";
    private static final int MAX_IMAGE_SIZE = 1048576;
    private android.graphics.Matrix mTempMatrix;

    public interface OnSharedElementsReadyListener {
        void onSharedElementsReady();
    }

    public SharedElementCallback() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.graphics.Bitmap createDrawableBitmap(android.graphics.drawable.Drawable r13) {
            int r0 = r13.getIntrinsicWidth()
            int r1 = r13.getIntrinsicHeight()
            if (r0 <= 0) goto L51
            if (r1 > 0) goto Ld
            goto L51
        Ld:
            int r2 = r0 * r1
            float r2 = (float) r2
            r3 = 1233125376(0x49800000, float:1048576.0)
            float r3 = r3 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = java.lang.Math.min(r2, r3)
            boolean r4 = r13 instanceof android.graphics.drawable.BitmapDrawable
            if (r4 == 0) goto L29
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L29
            r2 = r13
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            android.graphics.Bitmap r2 = r2.getBitmap()
            return r2
        L29:
            float r2 = (float) r0
            float r2 = r2 * r3
            int r2 = (int) r2
            float r4 = (float) r1
            float r4 = r4 * r3
            int r4 = (int) r4
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r2, r4, r5)
            android.graphics.Canvas r6 = new android.graphics.Canvas
            r6.<init>(r5)
            android.graphics.Rect r7 = r13.getBounds()
            int r8 = r7.left
            int r9 = r7.top
            int r10 = r7.right
            int r11 = r7.bottom
            r12 = 0
            r13.setBounds(r12, r12, r2, r4)
            r13.draw(r6)
            r13.setBounds(r8, r9, r10, r11)
            return r5
        L51:
            r2 = 0
            return r2
    }

    public android.os.Parcelable onCaptureSharedElementSnapshot(android.view.View r9, android.graphics.Matrix r10, android.graphics.RectF r11) {
            r8 = this;
            boolean r0 = r9 instanceof android.widget.ImageView
            if (r0 == 0) goto L4a
            r0 = r9
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            if (r1 == 0) goto L4a
            if (r2 != 0) goto L4a
            android.graphics.Bitmap r3 = createDrawableBitmap(r1)
            if (r3 == 0) goto L4a
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = "sharedElement:snapshot:bitmap"
            r4.putParcelable(r5, r3)
            android.widget.ImageView$ScaleType r5 = r0.getScaleType()
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "sharedElement:snapshot:imageScaleType"
            r4.putString(r6, r5)
            android.widget.ImageView$ScaleType r5 = r0.getScaleType()
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.MATRIX
            if (r5 != r6) goto L49
            android.graphics.Matrix r5 = r0.getImageMatrix()
            r6 = 9
            float[] r6 = new float[r6]
            r5.getValues(r6)
            java.lang.String r7 = "sharedElement:snapshot:imageMatrix"
            r4.putFloatArray(r7, r6)
        L49:
            return r4
        L4a:
            float r0 = r11.width()
            int r0 = java.lang.Math.round(r0)
            float r1 = r11.height()
            int r1 = java.lang.Math.round(r1)
            r2 = 0
            if (r0 <= 0) goto La4
            if (r1 <= 0) goto La4
            int r3 = r0 * r1
            float r3 = (float) r3
            r4 = 1233125376(0x49800000, float:1048576.0)
            float r4 = r4 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = java.lang.Math.min(r3, r4)
            float r4 = (float) r0
            float r4 = r4 * r3
            int r0 = (int) r4
            float r4 = (float) r1
            float r4 = r4 * r3
            int r1 = (int) r4
            android.graphics.Matrix r4 = r8.mTempMatrix
            if (r4 != 0) goto L7c
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            r8.mTempMatrix = r4
        L7c:
            android.graphics.Matrix r4 = r8.mTempMatrix
            r4.set(r10)
            android.graphics.Matrix r4 = r8.mTempMatrix
            float r5 = r11.left
            float r5 = -r5
            float r6 = r11.top
            float r6 = -r6
            r4.postTranslate(r5, r6)
            android.graphics.Matrix r4 = r8.mTempMatrix
            r4.postScale(r3, r3)
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r4)
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r2)
            android.graphics.Matrix r5 = r8.mTempMatrix
            r4.concat(r5)
            r9.draw(r4)
        La4:
            return r2
    }

    public android.view.View onCreateSnapshotView(android.content.Context r7, android.os.Parcelable r8) {
            r6 = this;
            r0 = 0
            boolean r1 = r8 instanceof android.os.Bundle
            if (r1 == 0) goto L45
            r1 = r8
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.String r2 = "sharedElement:snapshot:bitmap"
            android.os.Parcelable r2 = r1.getParcelable(r2)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 != 0) goto L14
            r3 = 0
            return r3
        L14:
            android.widget.ImageView r3 = new android.widget.ImageView
            r3.<init>(r7)
            r0 = r3
            r3.setImageBitmap(r2)
            java.lang.String r4 = "sharedElement:snapshot:imageScaleType"
            java.lang.String r4 = r1.getString(r4)
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.valueOf(r4)
            r3.setScaleType(r4)
            android.widget.ImageView$ScaleType r4 = r3.getScaleType()
            android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.MATRIX
            if (r4 != r5) goto L56
            java.lang.String r4 = "sharedElement:snapshot:imageMatrix"
            float[] r4 = r1.getFloatArray(r4)
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r5.setValues(r4)
            r3.setImageMatrix(r5)
            goto L56
        L45:
            boolean r1 = r8 instanceof android.graphics.Bitmap
            if (r1 == 0) goto L56
            r1 = r8
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            android.widget.ImageView r2 = new android.widget.ImageView
            r2.<init>(r7)
            r0 = r2
            r0.setImageBitmap(r1)
            goto L57
        L56:
        L57:
            return r0
    }

    public void onMapSharedElements(java.util.List<java.lang.String> r1, java.util.Map<java.lang.String, android.view.View> r2) {
            r0 = this;
            return
    }

    public void onRejectSharedElements(java.util.List<android.view.View> r1) {
            r0 = this;
            return
    }

    public void onSharedElementEnd(java.util.List<java.lang.String> r1, java.util.List<android.view.View> r2, java.util.List<android.view.View> r3) {
            r0 = this;
            return
    }

    public void onSharedElementStart(java.util.List<java.lang.String> r1, java.util.List<android.view.View> r2, java.util.List<android.view.View> r3) {
            r0 = this;
            return
    }

    public void onSharedElementsArrived(java.util.List<java.lang.String> r1, java.util.List<android.view.View> r2, androidx.core.app.SharedElementCallback.OnSharedElementsReadyListener r3) {
            r0 = this;
            r3.onSharedElementsReady()
            return
    }
}
