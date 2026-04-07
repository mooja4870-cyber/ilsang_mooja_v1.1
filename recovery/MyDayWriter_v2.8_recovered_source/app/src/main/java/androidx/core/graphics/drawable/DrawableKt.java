package androidx.core.graphics.drawable;

/* JADX INFO: compiled from: Drawable.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a,\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a2\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u00042\b\b\u0003\u0010\r\u001a\u00020\u00042\b\b\u0003\u0010\u000e\u001a\u00020\u0004¨\u0006\u000f"}, d2 = {"toBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "width", "", "height", "config", "Landroid/graphics/Bitmap$Config;", "toBitmapOrNull", "updateBounds", "", "left", "top", "right", "bottom", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DrawableKt {
    public static final android.graphics.Bitmap toBitmap(android.graphics.drawable.Drawable r6, int r7, int r8, android.graphics.Bitmap.Config r9) {
            boolean r0 = r6 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L55
        L5:
            r0 = r6
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            if (r0 == 0) goto L4d
            if (r9 == 0) goto L1d
            r0 = r6
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            android.graphics.Bitmap$Config r0 = r0.getConfig()
            if (r0 != r9) goto L55
        L1d:
        L1e:
            r0 = r6
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            int r0 = r0.getWidth()
            if (r7 != r0) goto L40
            r0 = r6
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            int r0 = r0.getHeight()
            if (r8 != r0) goto L40
            r0 = r6
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            return r0
        L40:
            r0 = r6
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            r1 = 1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r7, r8, r1)
            return r0
        L4d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "bitmap is null"
            r0.<init>(r1)
            throw r0
        L55:
            android.graphics.Rect r0 = r6.getBounds()
            r1 = r0
            r2 = 0
            int r1 = r1.left
            r2 = r0
            r3 = 0
            int r2 = r2.top
            r3 = r0
            r4 = 0
            int r3 = r3.right
            r4 = 0
            int r0 = r0.bottom
            if (r9 != 0) goto L71
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            goto L72
        L71:
            r4 = r9
        L72:
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r7, r8, r4)
            r5 = 0
            r6.setBounds(r5, r5, r7, r8)
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r4)
            r6.draw(r5)
            r6.setBounds(r1, r2, r3, r0)
            return r4
    }

    public static /* synthetic */ android.graphics.Bitmap toBitmap$default(android.graphics.drawable.Drawable r0, int r1, int r2, android.graphics.Bitmap.Config r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L8
            int r1 = r0.getIntrinsicWidth()
        L8:
            r5 = r4 & 2
            if (r5 == 0) goto L10
            int r2 = r0.getIntrinsicHeight()
        L10:
            r4 = r4 & 4
            if (r4 == 0) goto L15
            r3 = 0
        L15:
            android.graphics.Bitmap r0 = toBitmap(r0, r1, r2, r3)
            return r0
    }

    public static final android.graphics.Bitmap toBitmapOrNull(android.graphics.drawable.Drawable r1, int r2, int r3, android.graphics.Bitmap.Config r4) {
            boolean r0 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto Lf
            r0 = r1
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            android.graphics.Bitmap r0 = toBitmap(r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ android.graphics.Bitmap toBitmapOrNull$default(android.graphics.drawable.Drawable r0, int r1, int r2, android.graphics.Bitmap.Config r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L8
            int r1 = r0.getIntrinsicWidth()
        L8:
            r5 = r4 & 2
            if (r5 == 0) goto L10
            int r2 = r0.getIntrinsicHeight()
        L10:
            r4 = r4 & 4
            if (r4 == 0) goto L15
            r3 = 0
        L15:
            android.graphics.Bitmap r0 = toBitmapOrNull(r0, r1, r2, r3)
            return r0
    }

    public static final void updateBounds(android.graphics.drawable.Drawable r0, int r1, int r2, int r3, int r4) {
            r0.setBounds(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void updateBounds$default(android.graphics.drawable.Drawable r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto La
            android.graphics.Rect r1 = r0.getBounds()
            int r1 = r1.left
        La:
            r6 = r5 & 2
            if (r6 == 0) goto L14
            android.graphics.Rect r2 = r0.getBounds()
            int r2 = r2.top
        L14:
            r6 = r5 & 4
            if (r6 == 0) goto L1e
            android.graphics.Rect r3 = r0.getBounds()
            int r3 = r3.right
        L1e:
            r5 = r5 & 8
            if (r5 == 0) goto L28
            android.graphics.Rect r4 = r0.getBounds()
            int r4 = r4.bottom
        L28:
            updateBounds(r0, r1, r2, r3, r4)
            return
    }
}
