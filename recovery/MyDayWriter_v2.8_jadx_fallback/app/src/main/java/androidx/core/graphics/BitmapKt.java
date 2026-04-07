package androidx.core.graphics;

/* JADX INFO: compiled from: Bitmap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b\u001a\u001d\u0010\u0007\u001a\u00020\b*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086\n\u001a'\u0010\u000b\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\bH\u0086\n\u001a'\u0010\r\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0086\b\u001a#\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0086\b\u001a7\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0087\b\u001a\u0015\u0010\u0018\u001a\u00020\u0011*\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001aH\u0086\n\u001a\u0015\u0010\u0018\u001a\u00020\u0011*\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001bH\u0086\n¨\u0006\u001c"}, d2 = {"applyCanvas", "Landroid/graphics/Bitmap;", "block", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "", "Lkotlin/ExtensionFunctionType;", "get", "", "x", "y", "set", "color", "scale", "width", "height", "filter", "", "createBitmap", "config", "Landroid/graphics/Bitmap$Config;", "hasAlpha", "colorSpace", "Landroid/graphics/ColorSpace;", "contains", "p", "Landroid/graphics/Point;", "Landroid/graphics/PointF;", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BitmapKt {
    public static final android.graphics.Bitmap applyCanvas(android.graphics.Bitmap r2, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r3) {
            r0 = 0
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r2)
            r3.invoke(r1)
            return r2
    }

    public static final boolean contains(android.graphics.Bitmap r5, android.graphics.Point r6) {
            r0 = 0
            int r1 = r5.getWidth()
            int r2 = r6.x
            r3 = 1
            r4 = 0
            if (r2 < 0) goto Lf
            if (r2 >= r1) goto Lf
            r1 = r3
            goto L10
        Lf:
            r1 = r4
        L10:
            if (r1 == 0) goto L1f
            int r1 = r6.y
            if (r1 < 0) goto L1f
            int r1 = r6.y
            int r2 = r5.getHeight()
            if (r1 >= r2) goto L1f
            goto L20
        L1f:
            r3 = r4
        L20:
            return r3
    }

    public static final boolean contains(android.graphics.Bitmap r4, android.graphics.PointF r5) {
            r0 = 0
            float r1 = r5.x
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L26
            float r1 = r5.x
            int r3 = r4.getWidth()
            float r3 = (float) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L26
            float r1 = r5.y
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L26
            float r1 = r5.y
            int r2 = r4.getHeight()
            float r2 = (float) r2
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            return r1
    }

    public static final android.graphics.Bitmap createBitmap(int r2, int r3, android.graphics.Bitmap.Config r4) {
            r0 = 0
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r3, r4)
            return r1
    }

    public static final android.graphics.Bitmap createBitmap(int r2, int r3, android.graphics.Bitmap.Config r4, boolean r5, android.graphics.ColorSpace r6) {
            r0 = 0
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6)
            return r1
    }

    public static /* synthetic */ android.graphics.Bitmap createBitmap$default(int r0, int r1, android.graphics.Bitmap.Config r2, int r3, java.lang.Object r4) {
            r3 = r3 & 4
            if (r3 == 0) goto L6
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L6:
            r3 = 0
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            return r4
    }

    public static /* synthetic */ android.graphics.Bitmap createBitmap$default(int r0, int r1, android.graphics.Bitmap.Config r2, boolean r3, android.graphics.ColorSpace r4, int r5, java.lang.Object r6) {
            r6 = r5 & 4
            if (r6 == 0) goto L6
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L6:
            r6 = r5 & 8
            if (r6 == 0) goto Lb
            r3 = 1
        Lb:
            r5 = r5 & 16
            if (r5 == 0) goto L15
            android.graphics.ColorSpace$Named r5 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r4 = android.graphics.ColorSpace.get(r5)
        L15:
            r5 = 0
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4)
            return r6
    }

    public static final int get(android.graphics.Bitmap r2, int r3, int r4) {
            r0 = 0
            int r1 = r2.getPixel(r3, r4)
            return r1
    }

    public static final android.graphics.Bitmap scale(android.graphics.Bitmap r2, int r3, int r4, boolean r5) {
            r0 = 0
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r2, r3, r4, r5)
            return r1
    }

    public static /* synthetic */ android.graphics.Bitmap scale$default(android.graphics.Bitmap r0, int r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 1
        L5:
            r4 = 0
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createScaledBitmap(r0, r1, r2, r3)
            return r5
    }

    public static final void set(android.graphics.Bitmap r1, int r2, int r3, int r4) {
            r0 = 0
            r1.setPixel(r2, r3, r4)
            return
    }
}
