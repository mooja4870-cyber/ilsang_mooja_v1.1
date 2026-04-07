package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public abstract class EmojiSpan extends android.text.style.ReplacementSpan {
    private short mHeight;
    private final androidx.emoji2.text.TypefaceEmojiRasterizer mRasterizer;
    private float mRatio;
    private final android.graphics.Paint.FontMetricsInt mTmpFontMetrics;
    private short mWidth;

    EmojiSpan(androidx.emoji2.text.TypefaceEmojiRasterizer r2) {
            r1 = this;
            r1.<init>()
            android.graphics.Paint$FontMetricsInt r0 = new android.graphics.Paint$FontMetricsInt
            r0.<init>()
            r1.mTmpFontMetrics = r0
            r0 = -1
            r1.mWidth = r0
            r1.mHeight = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.mRatio = r0
            java.lang.String r0 = "rasterizer cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r2, r0)
            r1.mRasterizer = r2
            return
    }

    public final int getHeight() {
            r1 = this;
            short r0 = r1.mHeight
            return r0
    }

    public final int getId() {
            r1 = this;
            androidx.emoji2.text.TypefaceEmojiRasterizer r0 = r1.getTypefaceRasterizer()
            int r0 = r0.getId()
            return r0
    }

    final float getRatio() {
            r1 = this;
            float r0 = r1.mRatio
            return r0
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint r4, java.lang.CharSequence r5, int r6, int r7, android.graphics.Paint.FontMetricsInt r8) {
            r3 = this;
            android.graphics.Paint$FontMetricsInt r0 = r3.mTmpFontMetrics
            r4.getFontMetricsInt(r0)
            android.graphics.Paint$FontMetricsInt r0 = r3.mTmpFontMetrics
            int r0 = r0.descent
            android.graphics.Paint$FontMetricsInt r1 = r3.mTmpFontMetrics
            int r1 = r1.ascent
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            float r1 = (float) r0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r2
            androidx.emoji2.text.TypefaceEmojiRasterizer r2 = r3.mRasterizer
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            r3.mRatio = r1
            androidx.emoji2.text.TypefaceEmojiRasterizer r1 = r3.mRasterizer
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r2 = r3.mRatio
            float r1 = r1 * r2
            int r1 = (int) r1
            short r1 = (short) r1
            r3.mHeight = r1
            androidx.emoji2.text.TypefaceEmojiRasterizer r1 = r3.mRasterizer
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r2 = r3.mRatio
            float r1 = r1 * r2
            int r1 = (int) r1
            short r1 = (short) r1
            r3.mWidth = r1
            if (r8 == 0) goto L56
            android.graphics.Paint$FontMetricsInt r1 = r3.mTmpFontMetrics
            int r1 = r1.ascent
            r8.ascent = r1
            android.graphics.Paint$FontMetricsInt r1 = r3.mTmpFontMetrics
            int r1 = r1.descent
            r8.descent = r1
            android.graphics.Paint$FontMetricsInt r1 = r3.mTmpFontMetrics
            int r1 = r1.top
            r8.top = r1
            android.graphics.Paint$FontMetricsInt r1 = r3.mTmpFontMetrics
            int r1 = r1.bottom
            r8.bottom = r1
        L56:
            short r1 = r3.mWidth
            return r1
    }

    public final androidx.emoji2.text.TypefaceEmojiRasterizer getTypefaceRasterizer() {
            r1 = this;
            androidx.emoji2.text.TypefaceEmojiRasterizer r0 = r1.mRasterizer
            return r0
    }

    final int getWidth() {
            r1 = this;
            short r0 = r1.mWidth
            return r0
    }
}
