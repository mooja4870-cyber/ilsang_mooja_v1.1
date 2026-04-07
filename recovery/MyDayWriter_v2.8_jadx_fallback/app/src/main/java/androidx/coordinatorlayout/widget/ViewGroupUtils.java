package androidx.coordinatorlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class ViewGroupUtils {
    private static final java.lang.ThreadLocal<android.graphics.Matrix> sMatrix = null;
    private static final java.lang.ThreadLocal<android.graphics.RectF> sRectF = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.coordinatorlayout.widget.ViewGroupUtils.sMatrix = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.coordinatorlayout.widget.ViewGroupUtils.sRectF = r0
            return
    }

    private ViewGroupUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void getDescendantRect(android.view.ViewGroup r3, android.view.View r4, android.graphics.Rect r5) {
            int r0 = r4.getWidth()
            int r1 = r4.getHeight()
            r2 = 0
            r5.set(r2, r2, r0, r1)
            offsetDescendantRect(r3, r4, r5)
            return
    }

    private static void offsetDescendantMatrix(android.view.ViewParent r4, android.view.View r5, android.graphics.Matrix r6) {
            android.view.ViewParent r0 = r5.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L1f
            if (r0 == r4) goto L1f
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            offsetDescendantMatrix(r4, r1, r6)
            int r2 = r1.getScrollX()
            int r2 = -r2
            float r2 = (float) r2
            int r3 = r1.getScrollY()
            int r3 = -r3
            float r3 = (float) r3
            r6.preTranslate(r2, r3)
        L1f:
            int r1 = r5.getLeft()
            float r1 = (float) r1
            int r2 = r5.getTop()
            float r2 = (float) r2
            r6.preTranslate(r1, r2)
            android.graphics.Matrix r1 = r5.getMatrix()
            boolean r1 = r1.isIdentity()
            if (r1 != 0) goto L3d
            android.graphics.Matrix r1 = r5.getMatrix()
            r6.preConcat(r1)
        L3d:
            return
    }

    static void offsetDescendantRect(android.view.ViewGroup r7, android.view.View r8, android.graphics.Rect r9) {
            java.lang.ThreadLocal<android.graphics.Matrix> r0 = androidx.coordinatorlayout.widget.ViewGroupUtils.sMatrix
            java.lang.Object r0 = r0.get()
            android.graphics.Matrix r0 = (android.graphics.Matrix) r0
            if (r0 != 0) goto L16
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0 = r1
            java.lang.ThreadLocal<android.graphics.Matrix> r1 = androidx.coordinatorlayout.widget.ViewGroupUtils.sMatrix
            r1.set(r0)
            goto L19
        L16:
            r0.reset()
        L19:
            offsetDescendantMatrix(r7, r8, r0)
            java.lang.ThreadLocal<android.graphics.RectF> r1 = androidx.coordinatorlayout.widget.ViewGroupUtils.sRectF
            java.lang.Object r1 = r1.get()
            android.graphics.RectF r1 = (android.graphics.RectF) r1
            if (r1 != 0) goto L31
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r1 = r2
            java.lang.ThreadLocal<android.graphics.RectF> r2 = androidx.coordinatorlayout.widget.ViewGroupUtils.sRectF
            r2.set(r1)
        L31:
            r1.set(r9)
            r0.mapRect(r1)
            float r2 = r1.left
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            float r4 = r1.top
            float r4 = r4 + r3
            int r4 = (int) r4
            float r5 = r1.right
            float r5 = r5 + r3
            int r5 = (int) r5
            float r6 = r1.bottom
            float r6 = r6 + r3
            int r3 = (int) r6
            r9.set(r2, r4, r5, r3)
            return
    }
}
