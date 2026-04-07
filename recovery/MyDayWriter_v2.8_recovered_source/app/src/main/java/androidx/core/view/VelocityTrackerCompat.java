package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class VelocityTrackerCompat {
    private static java.util.Map<android.view.VelocityTracker, androidx.core.view.VelocityTrackerFallback> sFallbackTrackers;

    private static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static float getAxisVelocity(android.view.VelocityTracker r1, int r2) {
                float r0 = r1.getAxisVelocity(r2)
                return r0
        }

        static float getAxisVelocity(android.view.VelocityTracker r1, int r2, int r3) {
                float r0 = r1.getAxisVelocity(r2, r3)
                return r0
        }

        static boolean isAxisSupported(android.view.VelocityTracker r1, int r2) {
                boolean r0 = r1.isAxisSupported(r2)
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface VelocityTrackableMotionEventAxis {
    }

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            androidx.core.view.VelocityTrackerCompat.sFallbackTrackers = r0
            return
    }

    private VelocityTrackerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addMovement(android.view.VelocityTracker r2, android.view.MotionEvent r3) {
            r2.addMovement(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            return
        La:
            int r0 = r3.getSource()
            r1 = 4194304(0x400000, float:5.877472E-39)
            if (r0 != r1) goto L2f
            java.util.Map<android.view.VelocityTracker, androidx.core.view.VelocityTrackerFallback> r0 = androidx.core.view.VelocityTrackerCompat.sFallbackTrackers
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto L24
            java.util.Map<android.view.VelocityTracker, androidx.core.view.VelocityTrackerFallback> r0 = androidx.core.view.VelocityTrackerCompat.sFallbackTrackers
            androidx.core.view.VelocityTrackerFallback r1 = new androidx.core.view.VelocityTrackerFallback
            r1.<init>()
            r0.put(r2, r1)
        L24:
            java.util.Map<android.view.VelocityTracker, androidx.core.view.VelocityTrackerFallback> r0 = androidx.core.view.VelocityTrackerCompat.sFallbackTrackers
            java.lang.Object r0 = r0.get(r2)
            androidx.core.view.VelocityTrackerFallback r0 = (androidx.core.view.VelocityTrackerFallback) r0
            r0.addMovement(r3)
        L2f:
            return
    }

    public static void clear(android.view.VelocityTracker r0) {
            r0.clear()
            removeFallbackForTracker(r0)
            return
    }

    public static void computeCurrentVelocity(android.view.VelocityTracker r1, int r2) {
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            computeCurrentVelocity(r1, r2, r0)
            return
    }

    public static void computeCurrentVelocity(android.view.VelocityTracker r1, int r2, float r3) {
            r1.computeCurrentVelocity(r2, r3)
            androidx.core.view.VelocityTrackerFallback r0 = getFallbackTrackerOrNull(r1)
            if (r0 == 0) goto Lc
            r0.computeCurrentVelocity(r2, r3)
        Lc:
            return
    }

    public static float getAxisVelocity(android.view.VelocityTracker r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            float r0 = androidx.core.view.VelocityTrackerCompat.Api34Impl.getAxisVelocity(r2, r3)
            return r0
        Lb:
            if (r3 != 0) goto L12
            float r0 = r2.getXVelocity()
            return r0
        L12:
            r0 = 1
            if (r3 != r0) goto L1a
            float r0 = r2.getYVelocity()
            return r0
        L1a:
            androidx.core.view.VelocityTrackerFallback r0 = getFallbackTrackerOrNull(r2)
            if (r0 == 0) goto L25
            float r1 = r0.getAxisVelocity(r3)
            return r1
        L25:
            r1 = 0
            return r1
    }

    public static float getAxisVelocity(android.view.VelocityTracker r2, int r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            float r0 = androidx.core.view.VelocityTrackerCompat.Api34Impl.getAxisVelocity(r2, r3, r4)
            return r0
        Lb:
            if (r3 != 0) goto L12
            float r0 = r2.getXVelocity(r4)
            return r0
        L12:
            r0 = 1
            if (r3 != r0) goto L1a
            float r0 = r2.getYVelocity(r4)
            return r0
        L1a:
            r0 = 0
            return r0
    }

    private static androidx.core.view.VelocityTrackerFallback getFallbackTrackerOrNull(android.view.VelocityTracker r1) {
            java.util.Map<android.view.VelocityTracker, androidx.core.view.VelocityTrackerFallback> r0 = androidx.core.view.VelocityTrackerCompat.sFallbackTrackers
            java.lang.Object r0 = r0.get(r1)
            androidx.core.view.VelocityTrackerFallback r0 = (androidx.core.view.VelocityTrackerFallback) r0
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "tracker.getXVelocity(pointerId)")
    @java.lang.Deprecated
    public static float getXVelocity(android.view.VelocityTracker r1, int r2) {
            float r0 = r1.getXVelocity(r2)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "tracker.getYVelocity(pointerId)")
    @java.lang.Deprecated
    public static float getYVelocity(android.view.VelocityTracker r1, int r2) {
            float r0 = r1.getYVelocity(r2)
            return r0
    }

    public static boolean isAxisSupported(android.view.VelocityTracker r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.view.VelocityTrackerCompat.Api34Impl.isAxisSupported(r2, r3)
            return r0
        Lb:
            r0 = 26
            r1 = 1
            if (r3 == r0) goto L16
            if (r3 == 0) goto L16
            if (r3 != r1) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    public static void recycle(android.view.VelocityTracker r0) {
            r0.recycle()
            removeFallbackForTracker(r0)
            return
    }

    private static void removeFallbackForTracker(android.view.VelocityTracker r1) {
            java.util.Map<android.view.VelocityTracker, androidx.core.view.VelocityTrackerFallback> r0 = androidx.core.view.VelocityTrackerCompat.sFallbackTrackers
            r0.remove(r1)
            return
    }
}
