package androidx.core.view.insets;

/* JADX INFO: loaded from: classes.dex */
public class GradientProtection extends androidx.core.view.insets.Protection {
    private static final float[] ALPHAS = null;
    private int mColor;
    private final int[] mColors;
    private final android.graphics.drawable.GradientDrawable mDrawable;
    private boolean mHasColor;
    private float mScale;

    static {
            r0 = 100
            float[] r0 = new float[r0]
            androidx.core.view.insets.GradientProtection.ALPHAS = r0
            android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
            r1 = 1058306785(0x3f147ae1, float:0.58)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1054280253(0x3ed70a3d, float:0.42)
            r4 = 0
            r0.<init>(r3, r4, r1, r2)
            float[] r1 = androidx.core.view.insets.GradientProtection.ALPHAS
            int r1 = r1.length
            int r1 = r1 + (-1)
            r2 = r1
        L1a:
            if (r2 < 0) goto L2c
            float[] r3 = androidx.core.view.insets.GradientProtection.ALPHAS
            int r4 = r1 - r2
            float r4 = (float) r4
            float r5 = (float) r1
            float r4 = r4 / r5
            float r4 = r0.getInterpolation(r4)
            r3[r2] = r4
            int r2 = r2 + (-1)
            goto L1a
        L2c:
            return
    }

    public GradientProtection(int r3) {
            r2 = this;
            r2.<init>(r3)
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r2.mDrawable = r0
            float[] r0 = androidx.core.view.insets.GradientProtection.ALPHAS
            int r0 = r0.length
            int[] r0 = new int[r0]
            r2.mColors = r0
            r0 = 0
            r2.mColor = r0
            r0 = 1067030938(0x3f99999a, float:1.2)
            r2.mScale = r0
            switch(r3) {
                case 1: goto L35;
                case 2: goto L2d;
                case 4: goto L25;
                case 8: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L3d
        L1d:
            android.graphics.drawable.GradientDrawable r0 = r2.mDrawable
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP
            r0.setOrientation(r1)
            goto L3d
        L25:
            android.graphics.drawable.GradientDrawable r0 = r2.mDrawable
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT
            r0.setOrientation(r1)
            goto L3d
        L2d:
            android.graphics.drawable.GradientDrawable r0 = r2.mDrawable
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r0.setOrientation(r1)
            goto L3d
        L35:
            android.graphics.drawable.GradientDrawable r0 = r2.mDrawable
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            r0.setOrientation(r1)
        L3d:
            return
    }

    public GradientProtection(int r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.setColor(r2)
            return
    }

    private void setColorInner(int r3) {
            r2 = this;
            int r0 = r2.mColor
            if (r0 == r3) goto L19
            r2.mColor = r3
            int r0 = r2.mColor
            int[] r1 = r2.mColors
            toColors(r0, r1)
            android.graphics.drawable.GradientDrawable r0 = r2.mDrawable
            int[] r1 = r2.mColors
            r0.setColors(r1)
            android.graphics.drawable.GradientDrawable r0 = r2.mDrawable
            r2.setDrawable(r0)
        L19:
            return
    }

    private static void toColors(int r5, int[] r6) {
            int r0 = r6.length
            int r0 = r0 + (-1)
        L3:
            if (r0 < 0) goto L25
            float[] r1 = androidx.core.view.insets.GradientProtection.ALPHAS
            r1 = r1[r0]
            int r2 = android.graphics.Color.alpha(r5)
            float r2 = (float) r2
            float r1 = r1 * r2
            int r1 = (int) r1
            int r2 = android.graphics.Color.red(r5)
            int r3 = android.graphics.Color.green(r5)
            int r4 = android.graphics.Color.blue(r5)
            int r1 = android.graphics.Color.argb(r1, r2, r3, r4)
            r6[r0] = r1
            int r0 = r0 + (-1)
            goto L3
        L25:
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

    public float getScale() {
            r1 = this;
            float r0 = r1.mScale
            return r0
    }

    @Override // androidx.core.view.insets.Protection
    int getThickness(int r3) {
            r2 = this;
            float r0 = r2.mScale
            float r1 = (float) r3
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
    }

    public void setColor(int r2) {
            r1 = this;
            r0 = 1
            r1.mHasColor = r0
            r1.setColorInner(r2)
            return
    }

    public void setScale(float r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto Lb
            r2.mScale = r3
            r2.updateLayout()
            return
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Scale must not be negative."
            r0.<init>(r1)
            throw r0
    }
}
