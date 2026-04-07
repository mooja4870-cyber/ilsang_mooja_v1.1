package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final class TypefaceEmojiSpan extends androidx.emoji2.text.EmojiSpan {
    private static android.graphics.Paint sDebugPaint;
    private android.text.TextPaint mWorkingPaint;

    public TypefaceEmojiSpan(androidx.emoji2.text.TypefaceEmojiRasterizer r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private android.text.TextPaint applyCharacterSpanStyles(java.lang.CharSequence r6, int r7, int r8, android.graphics.Paint r9) {
            r5 = this;
            boolean r0 = r6 instanceof android.text.Spanned
            r1 = 0
            if (r0 == 0) goto L42
            r0 = r6
            android.text.Spanned r0 = (android.text.Spanned) r0
            java.lang.Class<android.text.style.CharacterStyle> r2 = android.text.style.CharacterStyle.class
            java.lang.Object[] r2 = r0.getSpans(r7, r8, r2)
            android.text.style.CharacterStyle[] r2 = (android.text.style.CharacterStyle[]) r2
            int r3 = r2.length
            if (r3 == 0) goto L39
            int r3 = r2.length
            r4 = 1
            if (r3 != r4) goto L1d
            r3 = 0
            r3 = r2[r3]
            if (r3 != r5) goto L1d
            goto L39
        L1d:
            android.text.TextPaint r1 = r5.mWorkingPaint
            if (r1 != 0) goto L29
            android.text.TextPaint r3 = new android.text.TextPaint
            r3.<init>()
            r1 = r3
            r5.mWorkingPaint = r1
        L29:
            r1.set(r9)
            r3 = 0
        L2d:
            int r4 = r2.length
            if (r3 >= r4) goto L38
            r4 = r2[r3]
            r4.updateDrawState(r1)
            int r3 = r3 + 1
            goto L2d
        L38:
            return r1
        L39:
            boolean r3 = r9 instanceof android.text.TextPaint
            if (r3 == 0) goto L41
            r1 = r9
            android.text.TextPaint r1 = (android.text.TextPaint) r1
            return r1
        L41:
            return r1
        L42:
            boolean r0 = r9 instanceof android.text.TextPaint
            if (r0 == 0) goto L4a
            r0 = r9
            android.text.TextPaint r0 = (android.text.TextPaint) r0
            return r0
        L4a:
            return r1
    }

    private static android.graphics.Paint getDebugPaint() {
            android.graphics.Paint r0 = androidx.emoji2.text.TypefaceEmojiSpan.sDebugPaint
            if (r0 != 0) goto L1f
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>()
            androidx.emoji2.text.TypefaceEmojiSpan.sDebugPaint = r0
            android.graphics.Paint r0 = androidx.emoji2.text.TypefaceEmojiSpan.sDebugPaint
            androidx.emoji2.text.EmojiCompat r1 = androidx.emoji2.text.EmojiCompat.get()
            int r1 = r1.getEmojiSpanIndicatorColor()
            r0.setColor(r1)
            android.graphics.Paint r0 = androidx.emoji2.text.TypefaceEmojiSpan.sDebugPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
        L1f:
            android.graphics.Paint r0 = androidx.emoji2.text.TypefaceEmojiSpan.sDebugPaint
            return r0
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas r11, java.lang.CharSequence r12, int r13, int r14, float r15, int r16, int r17, int r18, android.graphics.Paint r19) {
            r10 = this;
            r7 = r16
            r8 = r18
            r9 = r19
            android.text.TextPaint r2 = r10.applyCharacterSpanStyles(r12, r13, r14, r9)
            if (r2 == 0) goto L21
            int r0 = r2.bgColor
            if (r0 == 0) goto L21
            int r0 = r10.getWidth()
            float r0 = (float) r0
            float r4 = r15 + r0
            float r5 = (float) r7
            float r6 = (float) r8
            r0 = r10
            r1 = r11
            r3 = r15
            r0.drawBackground(r1, r2, r3, r4, r5, r6)
            r6 = r2
            goto L22
        L21:
            r6 = r2
        L22:
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.get()
            boolean r0 = r0.isEmojiSpanIndicatorEnabled()
            if (r0 == 0) goto L3f
            float r2 = (float) r7
            int r0 = r10.getWidth()
            float r0 = (float) r0
            float r3 = r15 + r0
            float r4 = (float) r8
            android.graphics.Paint r5 = getDebugPaint()
            r0 = r11
            r1 = r15
            r0.drawRect(r1, r2, r3, r4, r5)
            goto L40
        L3f:
            r1 = r15
        L40:
            androidx.emoji2.text.TypefaceEmojiRasterizer r2 = r10.getTypefaceRasterizer()
            r3 = r17
            float r4 = (float) r3
            if (r6 == 0) goto L4b
            r5 = r6
            goto L4c
        L4b:
            r5 = r9
        L4c:
            r2.draw(r11, r15, r4, r5)
            return
    }

    void drawBackground(android.graphics.Canvas r5, android.text.TextPaint r6, float r7, float r8, float r9, float r10) {
            r4 = this;
            int r0 = r6.getColor()
            android.graphics.Paint$Style r1 = r6.getStyle()
            int r2 = r6.bgColor
            r6.setColor(r2)
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r6.setStyle(r2)
            r3 = r10
            r10 = r6
            r6 = r7
            r7 = r9
            r9 = r3
            r5.drawRect(r6, r7, r8, r9, r10)
            r10.setStyle(r1)
            r10.setColor(r0)
            return
    }
}
