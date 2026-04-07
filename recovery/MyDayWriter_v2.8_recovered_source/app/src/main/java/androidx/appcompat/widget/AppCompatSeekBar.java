package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSeekBar extends android.widget.SeekBar {
    private final androidx.appcompat.widget.AppCompatSeekBarHelper mAppCompatSeekBarHelper;

    public AppCompatSeekBar(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatSeekBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.seekBarStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatSeekBar(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            android.content.Context r0 = r1.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r1, r0)
            androidx.appcompat.widget.AppCompatSeekBarHelper r0 = new androidx.appcompat.widget.AppCompatSeekBarHelper
            r0.<init>(r1)
            r1.mAppCompatSeekBarHelper = r0
            androidx.appcompat.widget.AppCompatSeekBarHelper r0 = r1.mAppCompatSeekBarHelper
            r0.loadFromAttributes(r3, r4)
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.AppCompatSeekBarHelper r0 = r1.mAppCompatSeekBarHelper
            r0.drawableStateChanged()
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            androidx.appcompat.widget.AppCompatSeekBarHelper r0 = r1.mAppCompatSeekBarHelper
            r0.jumpDrawablesToCurrentState()
            return
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(android.graphics.Canvas r2) {
            r1 = this;
            monitor-enter(r1)
            super.onDraw(r2)     // Catch: java.lang.Throwable -> Lb
            androidx.appcompat.widget.AppCompatSeekBarHelper r0 = r1.mAppCompatSeekBarHelper     // Catch: java.lang.Throwable -> Lb
            r0.drawTickMarks(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }
}
