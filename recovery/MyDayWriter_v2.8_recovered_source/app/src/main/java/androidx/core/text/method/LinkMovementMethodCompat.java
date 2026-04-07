package androidx.core.text.method;

/* JADX INFO: loaded from: classes.dex */
public class LinkMovementMethodCompat extends android.text.method.LinkMovementMethod {
    private static androidx.core.text.method.LinkMovementMethodCompat sInstance;

    private LinkMovementMethodCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.text.method.LinkMovementMethodCompat getInstance() {
            androidx.core.text.method.LinkMovementMethodCompat r0 = androidx.core.text.method.LinkMovementMethodCompat.sInstance
            if (r0 != 0) goto Lb
            androidx.core.text.method.LinkMovementMethodCompat r0 = new androidx.core.text.method.LinkMovementMethodCompat
            r0.<init>()
            androidx.core.text.method.LinkMovementMethodCompat.sInstance = r0
        Lb:
            androidx.core.text.method.LinkMovementMethodCompat r0 = androidx.core.text.method.LinkMovementMethodCompat.sInstance
            return r0
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(android.widget.TextView r9, android.text.Spannable r10, android.view.MotionEvent r11) {
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 >= r1) goto L60
            int r0 = r11.getAction()
            r1 = 1
            if (r0 == r1) goto Lf
            if (r0 != 0) goto L60
        Lf:
            float r2 = r11.getX()
            int r2 = (int) r2
            float r3 = r11.getY()
            int r3 = (int) r3
            int r4 = r9.getTotalPaddingLeft()
            int r2 = r2 - r4
            int r4 = r9.getTotalPaddingTop()
            int r3 = r3 - r4
            int r4 = r9.getScrollX()
            int r2 = r2 + r4
            int r4 = r9.getScrollY()
            int r3 = r3 + r4
            android.text.Layout r4 = r9.getLayout()
            if (r3 < 0) goto L55
            int r5 = r4.getHeight()
            if (r3 <= r5) goto L3a
            goto L55
        L3a:
            int r5 = r4.getLineForVertical(r3)
            float r6 = (float) r2
            float r7 = r4.getLineLeft(r5)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L53
            float r6 = (float) r2
            float r7 = r4.getLineRight(r5)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L51
            goto L53
        L51:
            r1 = 0
            goto L54
        L53:
        L54:
            goto L56
        L55:
            r1 = 1
        L56:
            if (r1 == 0) goto L60
            android.text.Selection.removeSelection(r10)
            boolean r5 = android.text.method.Touch.onTouchEvent(r9, r10, r11)
            return r5
        L60:
            boolean r0 = super.onTouchEvent(r9, r10, r11)
            return r0
    }
}
