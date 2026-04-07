package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
class DefaultGlyphChecker implements androidx.emoji2.text.EmojiCompat.GlyphChecker {
    private static final int PAINT_TEXT_SIZE = 10;
    private static final java.lang.ThreadLocal<java.lang.StringBuilder> sStringBuilder = null;
    private final android.text.TextPaint mTextPaint;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.emoji2.text.DefaultGlyphChecker.sStringBuilder = r0
            return
    }

    DefaultGlyphChecker() {
            r2 = this;
            r2.<init>()
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            r2.mTextPaint = r0
            android.text.TextPaint r0 = r2.mTextPaint
            r1 = 1092616192(0x41200000, float:10.0)
            r0.setTextSize(r1)
            return
    }

    private static java.lang.StringBuilder getStringBuilder() {
            java.lang.ThreadLocal<java.lang.StringBuilder> r0 = androidx.emoji2.text.DefaultGlyphChecker.sStringBuilder
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L12
            java.lang.ThreadLocal<java.lang.StringBuilder> r0 = androidx.emoji2.text.DefaultGlyphChecker.sStringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0.set(r1)
        L12:
            java.lang.ThreadLocal<java.lang.StringBuilder> r0 = androidx.emoji2.text.DefaultGlyphChecker.sStringBuilder
            java.lang.Object r0 = r0.get()
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            return r0
    }

    @Override // androidx.emoji2.text.EmojiCompat.GlyphChecker
    public boolean hasGlyph(java.lang.CharSequence r4, int r5, int r6, int r7) {
            r3 = this;
            java.lang.StringBuilder r0 = getStringBuilder()
            r1 = 0
            r0.setLength(r1)
        L9:
            if (r5 >= r6) goto L15
            char r1 = r4.charAt(r5)
            r0.append(r1)
            int r5 = r5 + 1
            goto L9
        L15:
            android.text.TextPaint r1 = r3.mTextPaint
            java.lang.String r2 = r0.toString()
            boolean r1 = androidx.core.graphics.PaintCompat.hasGlyph(r1, r2)
            return r1
    }
}
