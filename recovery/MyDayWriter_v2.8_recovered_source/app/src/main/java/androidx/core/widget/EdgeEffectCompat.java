package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class EdgeEffectCompat {
    private final android.widget.EdgeEffect mEdgeEffect;

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void onPull(android.widget.EdgeEffect r0, float r1, float r2) {
                r0.onPull(r1, r2)
                return
        }
    }

    private static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.widget.EdgeEffect create(android.content.Context r2, android.util.AttributeSet r3) {
                android.widget.EdgeEffect r0 = new android.widget.EdgeEffect     // Catch: java.lang.Throwable -> L6
                r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L6
                return r0
            L6:
                r0 = move-exception
                android.widget.EdgeEffect r1 = new android.widget.EdgeEffect
                r1.<init>(r2)
                return r1
        }

        public static float getDistance(android.widget.EdgeEffect r2) {
                float r0 = r2.getDistance()     // Catch: java.lang.Throwable -> L5
                return r0
            L5:
                r0 = move-exception
                r1 = 0
                return r1
        }

        public static float onPullDistance(android.widget.EdgeEffect r2, float r3, float r4) {
                float r0 = r2.onPullDistance(r3, r4)     // Catch: java.lang.Throwable -> L5
                return r0
            L5:
                r0 = move-exception
                r2.onPull(r3, r4)
                r1 = 0
                return r1
        }
    }

    @java.lang.Deprecated
    public EdgeEffectCompat(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect
            r0.<init>(r2)
            r1.mEdgeEffect = r0
            return
    }

    public static android.widget.EdgeEffect create(android.content.Context r2, android.util.AttributeSet r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            android.widget.EdgeEffect r0 = androidx.core.widget.EdgeEffectCompat.Api31Impl.create(r2, r3)
            return r0
        Lb:
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect
            r0.<init>(r2)
            return r0
    }

    public static float getDistance(android.widget.EdgeEffect r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            float r0 = androidx.core.widget.EdgeEffectCompat.Api31Impl.getDistance(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static void onPull(android.widget.EdgeEffect r0, float r1, float r2) {
            androidx.core.widget.EdgeEffectCompat.Api21Impl.onPull(r0, r1, r2)
            return
    }

    public static float onPullDistance(android.widget.EdgeEffect r2, float r3, float r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            float r0 = androidx.core.widget.EdgeEffectCompat.Api31Impl.onPullDistance(r2, r3, r4)
            return r0
        Lb:
            onPull(r2, r3, r4)
            return r3
    }

    @java.lang.Deprecated
    public boolean draw(android.graphics.Canvas r2) {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.mEdgeEffect
            boolean r0 = r0.draw(r2)
            return r0
    }

    @java.lang.Deprecated
    public void finish() {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.mEdgeEffect
            r0.finish()
            return
    }

    @java.lang.Deprecated
    public boolean isFinished() {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.mEdgeEffect
            boolean r0 = r0.isFinished()
            return r0
    }

    @java.lang.Deprecated
    public boolean onAbsorb(int r2) {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.mEdgeEffect
            r0.onAbsorb(r2)
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public boolean onPull(float r2) {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.mEdgeEffect
            r0.onPull(r2)
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public boolean onPull(float r2, float r3) {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.mEdgeEffect
            onPull(r0, r2, r3)
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public boolean onRelease() {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.mEdgeEffect
            r0.onRelease()
            android.widget.EdgeEffect r0 = r1.mEdgeEffect
            boolean r0 = r0.isFinished()
            return r0
    }

    @java.lang.Deprecated
    public void setSize(int r2, int r3) {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.mEdgeEffect
            r0.setSize(r2, r3)
            return
    }
}
