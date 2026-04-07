package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatRatingBar extends android.widget.RatingBar {
    private final androidx.appcompat.widget.AppCompatProgressBarHelper mAppCompatProgressBarHelper;

    public AppCompatRatingBar(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatRatingBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.ratingBarStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatRatingBar(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            android.content.Context r0 = r1.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r1, r0)
            androidx.appcompat.widget.AppCompatProgressBarHelper r0 = new androidx.appcompat.widget.AppCompatProgressBarHelper
            r0.<init>(r1)
            r1.mAppCompatProgressBarHelper = r0
            androidx.appcompat.widget.AppCompatProgressBarHelper r0 = r1.mAppCompatProgressBarHelper
            r0.loadFromAttributes(r3, r4)
            return
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int r5, int r6) {
            r4 = this;
            monitor-enter(r4)
            super.onMeasure(r5, r6)     // Catch: java.lang.Throwable -> L23
            androidx.appcompat.widget.AppCompatProgressBarHelper r0 = r4.mAppCompatProgressBarHelper     // Catch: java.lang.Throwable -> L23
            android.graphics.Bitmap r0 = r0.getSampleTile()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L21
            int r1 = r0.getWidth()     // Catch: java.lang.Throwable -> L23
            int r2 = r4.getNumStars()     // Catch: java.lang.Throwable -> L23
            int r1 = r1 * r2
            r2 = 0
            int r2 = android.view.View.resolveSizeAndState(r1, r5, r2)     // Catch: java.lang.Throwable -> L23
            int r3 = r4.getMeasuredHeight()     // Catch: java.lang.Throwable -> L23
            r4.setMeasuredDimension(r2, r3)     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r4)
            return
        L23:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L23
            throw r5
    }
}
