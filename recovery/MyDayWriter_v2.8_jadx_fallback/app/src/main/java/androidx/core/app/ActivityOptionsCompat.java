package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class ActivityOptionsCompat {
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final java.lang.String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";

    private static class ActivityOptionsCompatImpl extends androidx.core.app.ActivityOptionsCompat {
        private final android.app.ActivityOptions mActivityOptions;

        ActivityOptionsCompatImpl(android.app.ActivityOptions r1) {
                r0 = this;
                r0.<init>()
                r0.mActivityOptions = r1
                return
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public android.graphics.Rect getLaunchBounds() {
                r1 = this;
                android.app.ActivityOptions r0 = r1.mActivityOptions
                android.graphics.Rect r0 = r0.getLaunchBounds()
                return r0
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public int getLaunchDisplayId() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r0 < r1) goto Ld
                android.app.ActivityOptions r0 = r2.mActivityOptions
                int r0 = r0.getLaunchDisplayId()
                return r0
            Ld:
                r0 = -1
                return r0
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void requestUsageTimeReport(android.app.PendingIntent r2) {
                r1 = this;
                android.app.ActivityOptions r0 = r1.mActivityOptions
                r0.requestUsageTimeReport(r2)
                return
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public androidx.core.app.ActivityOptionsCompat setLaunchBounds(android.graphics.Rect r3) {
                r2 = this;
                androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
                android.app.ActivityOptions r1 = r2.mActivityOptions
                android.app.ActivityOptions r1 = r1.setLaunchBounds(r3)
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public androidx.core.app.ActivityOptionsCompat setLaunchDisplayId(int r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r0 < r1) goto Lb
                android.app.ActivityOptions r0 = r2.mActivityOptions
                r0.setLaunchDisplayId(r3)
            Lb:
                return r2
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public androidx.core.app.ActivityOptionsCompat setPendingIntentBackgroundActivityStartMode(int r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 34
                if (r0 < r1) goto Lc
                android.app.ActivityOptions r0 = r2.mActivityOptions
                r0.setPendingIntentBackgroundActivityStartMode(r3)
                goto L1d
            Lc:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 33
                if (r0 < r1) goto L1d
                r0 = 2
                if (r3 == r0) goto L17
                r0 = 1
                goto L18
            L17:
                r0 = 0
            L18:
                android.app.ActivityOptions r1 = r2.mActivityOptions
                r1.setPendingIntentBackgroundActivityLaunchAllowed(r0)
            L1d:
                return r2
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public androidx.core.app.ActivityOptionsCompat setShareIdentityEnabled(boolean r3) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 34
                if (r0 >= r1) goto L7
                return r2
            L7:
                androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
                android.app.ActivityOptions r1 = r2.mActivityOptions
                android.app.ActivityOptions r1 = r1.setShareIdentityEnabled(r3)
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public android.os.Bundle toBundle() {
                r1 = this;
                android.app.ActivityOptions r0 = r1.mActivityOptions
                android.os.Bundle r0 = r0.toBundle()
                return r0
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void update(androidx.core.app.ActivityOptionsCompat r4) {
                r3 = this;
                boolean r0 = r4 instanceof androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl
                if (r0 == 0) goto Le
                r0 = r4
                androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = (androidx.core.app.ActivityOptionsCompat.ActivityOptionsCompatImpl) r0
                android.app.ActivityOptions r1 = r3.mActivityOptions
                android.app.ActivityOptions r2 = r0.mActivityOptions
                r1.update(r2)
            Le:
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BackgroundActivityStartMode {
    }

    protected ActivityOptionsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.app.ActivityOptionsCompat makeBasic() {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeBasic()
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.app.ActivityOptionsCompat makeClipRevealAnimation(android.view.View r2, int r3, int r4, int r5, int r6) {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeClipRevealAnimation(r2, r3, r4, r5, r6)
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.app.ActivityOptionsCompat makeCustomAnimation(android.content.Context r2, int r3, int r4) {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeCustomAnimation(r2, r3, r4)
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.app.ActivityOptionsCompat makeScaleUpAnimation(android.view.View r2, int r3, int r4, int r5, int r6) {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeScaleUpAnimation(r2, r3, r4, r5, r6)
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.app.ActivityOptionsCompat makeSceneTransitionAnimation(android.app.Activity r2, android.view.View r3, java.lang.String r4) {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeSceneTransitionAnimation(r2, r3, r4)
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.app.ActivityOptionsCompat makeSceneTransitionAnimation(android.app.Activity r4, androidx.core.util.Pair<android.view.View, java.lang.String>... r5) {
            r0 = 0
            if (r5 == 0) goto L1f
            int r1 = r5.length
            android.util.Pair[] r0 = new android.util.Pair[r1]
            r1 = 0
        L7:
            int r2 = r5.length
            if (r1 >= r2) goto L1f
            r2 = r5[r1]
            F r2 = r2.first
            android.view.View r2 = (android.view.View) r2
            r3 = r5[r1]
            S r3 = r3.second
            java.lang.String r3 = (java.lang.String) r3
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L7
        L1f:
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r1 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r2 = android.app.ActivityOptions.makeSceneTransitionAnimation(r4, r0)
            r1.<init>(r2)
            return r1
    }

    public static androidx.core.app.ActivityOptionsCompat makeTaskLaunchBehind() {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeTaskLaunchBehind()
            r0.<init>(r1)
            return r0
    }

    public static androidx.core.app.ActivityOptionsCompat makeThumbnailScaleUpAnimation(android.view.View r2, android.graphics.Bitmap r3, int r4, int r5) {
            androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl r0 = new androidx.core.app.ActivityOptionsCompat$ActivityOptionsCompatImpl
            android.app.ActivityOptions r1 = android.app.ActivityOptions.makeThumbnailScaleUpAnimation(r2, r3, r4, r5)
            r0.<init>(r1)
            return r0
    }

    public android.graphics.Rect getLaunchBounds() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int getLaunchDisplayId() {
            r1 = this;
            r0 = -1
            return r0
    }

    public void requestUsageTimeReport(android.app.PendingIntent r1) {
            r0 = this;
            return
    }

    public androidx.core.app.ActivityOptionsCompat setLaunchBounds(android.graphics.Rect r1) {
            r0 = this;
            return r0
    }

    public androidx.core.app.ActivityOptionsCompat setLaunchDisplayId(int r1) {
            r0 = this;
            return r0
    }

    public androidx.core.app.ActivityOptionsCompat setPendingIntentBackgroundActivityStartMode(int r1) {
            r0 = this;
            return r0
    }

    public androidx.core.app.ActivityOptionsCompat setShareIdentityEnabled(boolean r1) {
            r0 = this;
            return r0
    }

    public android.os.Bundle toBundle() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void update(androidx.core.app.ActivityOptionsCompat r1) {
            r0 = this;
            return
    }
}
