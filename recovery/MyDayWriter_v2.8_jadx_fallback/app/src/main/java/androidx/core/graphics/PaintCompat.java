package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public final class PaintCompat {
    private static final java.lang.String EM_STRING = "m";
    private static final java.lang.String TOFU_STRING = "\udfffd";
    private static final java.lang.ThreadLocal<androidx.core.util.Pair<android.graphics.Rect, android.graphics.Rect>> sRectThreadLocal = null;

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean hasGlyph(android.graphics.Paint r1, java.lang.String r2) {
                boolean r0 = r1.hasGlyph(r2)
                return r0
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setBlendMode(android.graphics.Paint r1, java.lang.Object r2) {
                r0 = r2
                android.graphics.BlendMode r0 = (android.graphics.BlendMode) r0
                r1.setBlendMode(r0)
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.core.graphics.PaintCompat.sRectThreadLocal = r0
            return
    }

    private PaintCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean hasGlyph(android.graphics.Paint r1, java.lang.String r2) {
            boolean r0 = androidx.core.graphics.PaintCompat.Api23Impl.hasGlyph(r1, r2)
            return r0
    }

    private static androidx.core.util.Pair<android.graphics.Rect, android.graphics.Rect> obtainEmptyRects() {
            java.lang.ThreadLocal<androidx.core.util.Pair<android.graphics.Rect, android.graphics.Rect>> r0 = androidx.core.graphics.PaintCompat.sRectThreadLocal
            java.lang.Object r0 = r0.get()
            androidx.core.util.Pair r0 = (androidx.core.util.Pair) r0
            if (r0 != 0) goto L20
            androidx.core.util.Pair r1 = new androidx.core.util.Pair
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.<init>(r2, r3)
            r0 = r1
            java.lang.ThreadLocal<androidx.core.util.Pair<android.graphics.Rect, android.graphics.Rect>> r1 = androidx.core.graphics.PaintCompat.sRectThreadLocal
            r1.set(r0)
            goto L2e
        L20:
            F r1 = r0.first
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            r1.setEmpty()
            S r1 = r0.second
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            r1.setEmpty()
        L2e:
            return r0
    }

    public static boolean setBlendMode(android.graphics.Paint r4, androidx.core.graphics.BlendModeCompat r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L14
            if (r5 == 0) goto Lf
            java.lang.Object r3 = androidx.core.graphics.BlendModeUtils.Api29Impl.obtainBlendModeFromCompat(r5)
            goto L10
        Lf:
        L10:
            androidx.core.graphics.PaintCompat.Api29Impl.setBlendMode(r4, r3)
            return r2
        L14:
            if (r5 == 0) goto L29
            android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.BlendModeUtils.obtainPorterDuffFromCompat(r5)
            if (r0 == 0) goto L21
            android.graphics.PorterDuffXfermode r3 = new android.graphics.PorterDuffXfermode
            r3.<init>(r0)
        L21:
            r4.setXfermode(r3)
            if (r0 == 0) goto L27
            goto L28
        L27:
            r2 = 0
        L28:
            return r2
        L29:
            r4.setXfermode(r3)
            return r2
    }
}
