package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class DialogTitle extends androidx.appcompat.widget.AppCompatTextView {
    public DialogTitle(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public DialogTitle(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public DialogTitle(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int r10, int r11) {
            r9 = this;
            super.onMeasure(r10, r11)
            android.text.Layout r0 = r9.getLayout()
            if (r0 == 0) goto L42
            int r1 = r0.getLineCount()
            if (r1 <= 0) goto L42
            int r2 = r1 + (-1)
            int r2 = r0.getEllipsisCount(r2)
            if (r2 <= 0) goto L42
            r3 = 0
            r9.setSingleLine(r3)
            r4 = 2
            r9.setMaxLines(r4)
            android.content.Context r4 = r9.getContext()
            int[] r5 = androidx.appcompat.R.styleable.TextAppearance
            r6 = 16842817(0x1010041, float:2.369374E-38)
            r7 = 16973892(0x1030044, float:2.406109E-38)
            r8 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r8, r5, r6, r7)
            int r5 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            int r5 = r4.getDimensionPixelSize(r5, r3)
            if (r5 == 0) goto L3c
            float r6 = (float) r5
            r9.setTextSize(r3, r6)
        L3c:
            r4.recycle()
            super.onMeasure(r10, r11)
        L42:
            return
    }
}
