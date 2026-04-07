package androidx.core.text;

/* JADX INFO: loaded from: classes.dex */
public class PrecomputedTextCompat implements android.text.Spannable {
    private static final char LINE_FEED = '\n';
    private static java.util.concurrent.Executor sExecutor;
    private static final java.lang.Object sLock = null;
    private final int[] mParagraphEnds;
    private final androidx.core.text.PrecomputedTextCompat.Params mParams;
    private final android.text.Spannable mText;
    private final android.text.PrecomputedText mWrapped;

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.text.Spannable castToSpannable(android.text.PrecomputedText r0) {
                return r0
        }
    }

    public static final class Params {
        private final int mBreakStrategy;
        private final int mHyphenationFrequency;
        private final android.text.TextPaint mPaint;
        private final android.text.TextDirectionHeuristic mTextDir;
        final android.text.PrecomputedText.Params mWrapped;

        public static class Builder {
            private int mBreakStrategy;
            private int mHyphenationFrequency;
            private final android.text.TextPaint mPaint;
            private android.text.TextDirectionHeuristic mTextDir;

            public Builder(android.text.TextPaint r2) {
                    r1 = this;
                    r1.<init>()
                    r1.mPaint = r2
                    r0 = 1
                    r1.mBreakStrategy = r0
                    r1.mHyphenationFrequency = r0
                    android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
                    r1.mTextDir = r0
                    return
            }

            public androidx.core.text.PrecomputedTextCompat.Params build() {
                    r5 = this;
                    androidx.core.text.PrecomputedTextCompat$Params r0 = new androidx.core.text.PrecomputedTextCompat$Params
                    android.text.TextPaint r1 = r5.mPaint
                    android.text.TextDirectionHeuristic r2 = r5.mTextDir
                    int r3 = r5.mBreakStrategy
                    int r4 = r5.mHyphenationFrequency
                    r0.<init>(r1, r2, r3, r4)
                    return r0
            }

            public androidx.core.text.PrecomputedTextCompat.Params.Builder setBreakStrategy(int r1) {
                    r0 = this;
                    r0.mBreakStrategy = r1
                    return r0
            }

            public androidx.core.text.PrecomputedTextCompat.Params.Builder setHyphenationFrequency(int r1) {
                    r0 = this;
                    r0.mHyphenationFrequency = r1
                    return r0
            }

            public androidx.core.text.PrecomputedTextCompat.Params.Builder setTextDirection(android.text.TextDirectionHeuristic r1) {
                    r0 = this;
                    r0.mTextDir = r1
                    return r0
            }
        }

        public Params(android.text.PrecomputedText.Params r3) {
                r2 = this;
                r2.<init>()
                android.text.TextPaint r0 = r3.getTextPaint()
                r2.mPaint = r0
                android.text.TextDirectionHeuristic r0 = r3.getTextDirection()
                r2.mTextDir = r0
                int r0 = r3.getBreakStrategy()
                r2.mBreakStrategy = r0
                int r0 = r3.getHyphenationFrequency()
                r2.mHyphenationFrequency = r0
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L23
                r0 = r3
                goto L24
            L23:
                r0 = 0
            L24:
                r2.mWrapped = r0
                return
        }

        Params(android.text.TextPaint r3, android.text.TextDirectionHeuristic r4, int r5, int r6) {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L21
                android.text.PrecomputedText$Params$Builder r0 = new android.text.PrecomputedText$Params$Builder
                r0.<init>(r3)
                android.text.PrecomputedText$Params$Builder r0 = r0.setBreakStrategy(r5)
                android.text.PrecomputedText$Params$Builder r0 = r0.setHyphenationFrequency(r6)
                android.text.PrecomputedText$Params$Builder r0 = r0.setTextDirection(r4)
                android.text.PrecomputedText$Params r0 = r0.build()
                r2.mWrapped = r0
                goto L24
            L21:
                r0 = 0
                r2.mWrapped = r0
            L24:
                r2.mPaint = r3
                r2.mTextDir = r4
                r2.mBreakStrategy = r5
                r2.mHyphenationFrequency = r6
                return
        }

        public boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r6 != r5) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof androidx.core.text.PrecomputedTextCompat.Params
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                r1 = r6
                androidx.core.text.PrecomputedTextCompat$Params r1 = (androidx.core.text.PrecomputedTextCompat.Params) r1
                boolean r3 = r5.equalsWithoutTextDirection(r1)
                if (r3 != 0) goto L14
                return r2
            L14:
                android.text.TextDirectionHeuristic r3 = r5.mTextDir
                android.text.TextDirectionHeuristic r4 = r1.getTextDirection()
                if (r3 != r4) goto L1d
                goto L1e
            L1d:
                r0 = r2
            L1e:
                return r0
        }

        public boolean equalsWithoutTextDirection(androidx.core.text.PrecomputedTextCompat.Params r4) {
                r3 = this;
                int r0 = r3.mBreakStrategy
                int r1 = r4.getBreakStrategy()
                r2 = 0
                if (r0 == r1) goto Lb
                return r2
            Lb:
                int r0 = r3.mHyphenationFrequency
                int r1 = r4.getHyphenationFrequency()
                if (r0 == r1) goto L14
                return r2
            L14:
                android.text.TextPaint r0 = r3.mPaint
                float r0 = r0.getTextSize()
                android.text.TextPaint r1 = r4.getTextPaint()
                float r1 = r1.getTextSize()
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L27
                return r2
            L27:
                android.text.TextPaint r0 = r3.mPaint
                float r0 = r0.getTextScaleX()
                android.text.TextPaint r1 = r4.getTextPaint()
                float r1 = r1.getTextScaleX()
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L3a
                return r2
            L3a:
                android.text.TextPaint r0 = r3.mPaint
                float r0 = r0.getTextSkewX()
                android.text.TextPaint r1 = r4.getTextPaint()
                float r1 = r1.getTextSkewX()
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L4d
                return r2
            L4d:
                android.text.TextPaint r0 = r3.mPaint
                float r0 = r0.getLetterSpacing()
                android.text.TextPaint r1 = r4.getTextPaint()
                float r1 = r1.getLetterSpacing()
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L61
                return r2
            L61:
                android.text.TextPaint r0 = r3.mPaint
                java.lang.String r0 = r0.getFontFeatureSettings()
                android.text.TextPaint r1 = r4.getTextPaint()
                java.lang.String r1 = r1.getFontFeatureSettings()
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                if (r0 != 0) goto L76
                return r2
            L76:
                android.text.TextPaint r0 = r3.mPaint
                int r0 = r0.getFlags()
                android.text.TextPaint r1 = r4.getTextPaint()
                int r1 = r1.getFlags()
                if (r0 == r1) goto L87
                return r2
            L87:
                android.text.TextPaint r0 = r3.mPaint
                android.os.LocaleList r0 = r0.getTextLocales()
                android.text.TextPaint r1 = r4.getTextPaint()
                android.os.LocaleList r1 = r1.getTextLocales()
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L9d
                return r2
            L9d:
                android.text.TextPaint r0 = r3.mPaint
                android.graphics.Typeface r0 = r0.getTypeface()
                if (r0 != 0) goto Lb0
                android.text.TextPaint r0 = r4.getTextPaint()
                android.graphics.Typeface r0 = r0.getTypeface()
                if (r0 == 0) goto Lc5
                return r2
            Lb0:
                android.text.TextPaint r0 = r3.mPaint
                android.graphics.Typeface r0 = r0.getTypeface()
                android.text.TextPaint r1 = r4.getTextPaint()
                android.graphics.Typeface r1 = r1.getTypeface()
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto Lc5
                return r2
            Lc5:
                r0 = 1
                return r0
        }

        public int getBreakStrategy() {
                r1 = this;
                int r0 = r1.mBreakStrategy
                return r0
        }

        public int getHyphenationFrequency() {
                r1 = this;
                int r0 = r1.mHyphenationFrequency
                return r0
        }

        public android.text.TextDirectionHeuristic getTextDirection() {
                r1 = this;
                android.text.TextDirectionHeuristic r0 = r1.mTextDir
                return r0
        }

        public android.text.TextPaint getTextPaint() {
                r1 = this;
                android.text.TextPaint r0 = r1.mPaint
                return r0
        }

        public int hashCode() {
                r12 = this;
                android.text.TextPaint r0 = r12.mPaint
                float r0 = r0.getTextSize()
                java.lang.Float r1 = java.lang.Float.valueOf(r0)
                android.text.TextPaint r0 = r12.mPaint
                float r0 = r0.getTextScaleX()
                java.lang.Float r2 = java.lang.Float.valueOf(r0)
                android.text.TextPaint r0 = r12.mPaint
                float r0 = r0.getTextSkewX()
                java.lang.Float r3 = java.lang.Float.valueOf(r0)
                android.text.TextPaint r0 = r12.mPaint
                float r0 = r0.getLetterSpacing()
                java.lang.Float r4 = java.lang.Float.valueOf(r0)
                android.text.TextPaint r0 = r12.mPaint
                int r0 = r0.getFlags()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                android.text.TextPaint r0 = r12.mPaint
                android.os.LocaleList r6 = r0.getTextLocales()
                android.text.TextPaint r0 = r12.mPaint
                android.graphics.Typeface r7 = r0.getTypeface()
                android.text.TextPaint r0 = r12.mPaint
                boolean r0 = r0.isElegantTextHeight()
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
                android.text.TextDirectionHeuristic r9 = r12.mTextDir
                int r0 = r12.mBreakStrategy
                java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
                int r0 = r12.mHyphenationFrequency
                java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
                java.lang.Object[] r0 = new java.lang.Object[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
                int r0 = androidx.core.util.ObjectsCompat.hash(r0)
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "{"
                r0.<init>(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "textSize="
                java.lang.StringBuilder r1 = r1.append(r2)
                android.text.TextPaint r2 = r3.mPaint
                float r2 = r2.getTextSize()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textScaleX="
                java.lang.StringBuilder r1 = r1.append(r2)
                android.text.TextPaint r2 = r3.mPaint
                float r2 = r2.getTextScaleX()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textSkewX="
                java.lang.StringBuilder r1 = r1.append(r2)
                android.text.TextPaint r2 = r3.mPaint
                float r2 = r2.getTextSkewX()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", letterSpacing="
                java.lang.StringBuilder r1 = r1.append(r2)
                android.text.TextPaint r2 = r3.mPaint
                float r2 = r2.getLetterSpacing()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", elegantTextHeight="
                java.lang.StringBuilder r1 = r1.append(r2)
                android.text.TextPaint r2 = r3.mPaint
                boolean r2 = r2.isElegantTextHeight()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textLocale="
                java.lang.StringBuilder r1 = r1.append(r2)
                android.text.TextPaint r2 = r3.mPaint
                android.os.LocaleList r2 = r2.getTextLocales()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", typeface="
                java.lang.StringBuilder r1 = r1.append(r2)
                android.text.TextPaint r2 = r3.mPaint
                android.graphics.Typeface r2 = r2.getTypeface()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 26
                if (r1 < r2) goto Lef
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", variationSettings="
                java.lang.StringBuilder r1 = r1.append(r2)
                android.text.TextPaint r2 = r3.mPaint
                java.lang.String r2 = r2.getFontVariationSettings()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            Lef:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textDir="
                java.lang.StringBuilder r1 = r1.append(r2)
                android.text.TextDirectionHeuristic r2 = r3.mTextDir
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", breakStrategy="
                java.lang.StringBuilder r1 = r1.append(r2)
                int r2 = r3.mBreakStrategy
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", hyphenationFrequency="
                java.lang.StringBuilder r1 = r1.append(r2)
                int r2 = r3.mHyphenationFrequency
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
                return r1
        }
    }

    private static class PrecomputedTextFutureTask extends java.util.concurrent.FutureTask<androidx.core.text.PrecomputedTextCompat> {

        private static class PrecomputedTextCallback implements java.util.concurrent.Callable<androidx.core.text.PrecomputedTextCompat> {
            private androidx.core.text.PrecomputedTextCompat.Params mParams;
            private java.lang.CharSequence mText;

            PrecomputedTextCallback(androidx.core.text.PrecomputedTextCompat.Params r1, java.lang.CharSequence r2) {
                    r0 = this;
                    r0.<init>()
                    r0.mParams = r1
                    r0.mText = r2
                    return
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public androidx.core.text.PrecomputedTextCompat call() throws java.lang.Exception {
                    r2 = this;
                    java.lang.CharSequence r0 = r2.mText
                    androidx.core.text.PrecomputedTextCompat$Params r1 = r2.mParams
                    androidx.core.text.PrecomputedTextCompat r0 = androidx.core.text.PrecomputedTextCompat.create(r0, r1)
                    return r0
            }

            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ androidx.core.text.PrecomputedTextCompat call() throws java.lang.Exception {
                    r1 = this;
                    androidx.core.text.PrecomputedTextCompat r0 = r1.call()
                    return r0
            }
        }

        PrecomputedTextFutureTask(androidx.core.text.PrecomputedTextCompat.Params r2, java.lang.CharSequence r3) {
                r1 = this;
                androidx.core.text.PrecomputedTextCompat$PrecomputedTextFutureTask$PrecomputedTextCallback r0 = new androidx.core.text.PrecomputedTextCompat$PrecomputedTextFutureTask$PrecomputedTextCallback
                r0.<init>(r2, r3)
                r1.<init>(r0)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.text.PrecomputedTextCompat.sLock = r0
            r0 = 0
            androidx.core.text.PrecomputedTextCompat.sExecutor = r0
            return
    }

    private PrecomputedTextCompat(android.text.PrecomputedText r4, androidx.core.text.PrecomputedTextCompat.Params r5) {
            r3 = this;
            r3.<init>()
            android.text.Spannable r0 = androidx.core.text.PrecomputedTextCompat.Api28Impl.castToSpannable(r4)
            r3.mText = r0
            r3.mParams = r5
            r0 = 0
            r3.mParagraphEnds = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L15
            r0 = r4
        L15:
            r3.mWrapped = r0
            return
    }

    private PrecomputedTextCompat(java.lang.CharSequence r2, androidx.core.text.PrecomputedTextCompat.Params r3, int[] r4) {
            r1 = this;
            r1.<init>()
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r2)
            r1.mText = r0
            r1.mParams = r3
            r1.mParagraphEnds = r4
            r0 = 0
            r1.mWrapped = r0
            return
    }

    public static androidx.core.text.PrecomputedTextCompat create(java.lang.CharSequence r8, androidx.core.text.PrecomputedTextCompat.Params r9) {
            androidx.core.util.Preconditions.checkNotNull(r8)
            androidx.core.util.Preconditions.checkNotNull(r9)
            java.lang.String r0 = "PrecomputedText"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L98
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L98
            r1 = 29
            if (r0 < r1) goto L24
            android.text.PrecomputedText$Params r0 = r9.mWrapped     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L24
            androidx.core.text.PrecomputedTextCompat r0 = new androidx.core.text.PrecomputedTextCompat     // Catch: java.lang.Throwable -> L98
            android.text.PrecomputedText$Params r1 = r9.mWrapped     // Catch: java.lang.Throwable -> L98
            android.text.PrecomputedText r1 = android.text.PrecomputedText.create(r8, r1)     // Catch: java.lang.Throwable -> L98
            r0.<init>(r1, r9)     // Catch: java.lang.Throwable -> L98
            android.os.Trace.endSection()
            return r0
        L24:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L98
            r0.<init>()     // Catch: java.lang.Throwable -> L98
            r1 = 0
            int r2 = r8.length()     // Catch: java.lang.Throwable -> L98
            r3 = 0
        L2f:
            if (r3 >= r2) goto L47
            r4 = 10
            int r4 = android.text.TextUtils.indexOf(r8, r4, r3, r2)     // Catch: java.lang.Throwable -> L98
            if (r4 >= 0) goto L3b
            r1 = r2
            goto L3e
        L3b:
            int r4 = r4 + 1
            r1 = r4
        L3e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L98
            r0.add(r4)     // Catch: java.lang.Throwable -> L98
            r3 = r1
            goto L2f
        L47:
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L98
            int[] r3 = new int[r3]     // Catch: java.lang.Throwable -> L98
            r4 = 0
        L4e:
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L98
            if (r4 >= r5) goto L63
            java.lang.Object r5 = r0.get(r4)     // Catch: java.lang.Throwable -> L98
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L98
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L98
            r3[r4] = r5     // Catch: java.lang.Throwable -> L98
            int r4 = r4 + 1
            goto L4e
        L63:
            int r4 = r8.length()     // Catch: java.lang.Throwable -> L98
            android.text.TextPaint r5 = r9.getTextPaint()     // Catch: java.lang.Throwable -> L98
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 0
            android.text.StaticLayout$Builder r4 = android.text.StaticLayout.Builder.obtain(r8, r7, r4, r5, r6)     // Catch: java.lang.Throwable -> L98
            int r5 = r9.getBreakStrategy()     // Catch: java.lang.Throwable -> L98
            android.text.StaticLayout$Builder r4 = r4.setBreakStrategy(r5)     // Catch: java.lang.Throwable -> L98
            int r5 = r9.getHyphenationFrequency()     // Catch: java.lang.Throwable -> L98
            android.text.StaticLayout$Builder r4 = r4.setHyphenationFrequency(r5)     // Catch: java.lang.Throwable -> L98
            android.text.TextDirectionHeuristic r5 = r9.getTextDirection()     // Catch: java.lang.Throwable -> L98
            android.text.StaticLayout$Builder r4 = r4.setTextDirection(r5)     // Catch: java.lang.Throwable -> L98
            r4.build()     // Catch: java.lang.Throwable -> L98
            androidx.core.text.PrecomputedTextCompat r4 = new androidx.core.text.PrecomputedTextCompat     // Catch: java.lang.Throwable -> L98
            r4.<init>(r8, r9, r3)     // Catch: java.lang.Throwable -> L98
            android.os.Trace.endSection()
            return r4
        L98:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
    }

    public static java.util.concurrent.Future<androidx.core.text.PrecomputedTextCompat> getTextFuture(java.lang.CharSequence r3, androidx.core.text.PrecomputedTextCompat.Params r4, java.util.concurrent.Executor r5) {
            androidx.core.text.PrecomputedTextCompat$PrecomputedTextFutureTask r0 = new androidx.core.text.PrecomputedTextCompat$PrecomputedTextFutureTask
            r0.<init>(r4, r3)
            if (r5 != 0) goto L1d
            java.lang.Object r1 = androidx.core.text.PrecomputedTextCompat.sLock
            monitor-enter(r1)
            java.util.concurrent.Executor r2 = androidx.core.text.PrecomputedTextCompat.sExecutor     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L15
            r2 = 1
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newFixedThreadPool(r2)     // Catch: java.lang.Throwable -> L1a
            androidx.core.text.PrecomputedTextCompat.sExecutor = r2     // Catch: java.lang.Throwable -> L1a
        L15:
            java.util.concurrent.Executor r2 = androidx.core.text.PrecomputedTextCompat.sExecutor     // Catch: java.lang.Throwable -> L1a
            r5 = r2
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            goto L1d
        L1a:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r2
        L1d:
            r5.execute(r0)
            return r0
    }

    @Override // java.lang.CharSequence
    public char charAt(int r2) {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            char r0 = r0.charAt(r2)
            return r0
    }

    public int getParagraphCount() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Ld
            android.text.PrecomputedText r0 = r2.mWrapped
            int r0 = r0.getParagraphCount()
            return r0
        Ld:
            int[] r0 = r2.mParagraphEnds
            int r0 = r0.length
            return r0
    }

    public int getParagraphEnd(int r4) {
            r3 = this;
            int r0 = r3.getParagraphCount()
            java.lang.String r1 = "paraIndex"
            r2 = 0
            androidx.core.util.Preconditions.checkArgumentInRange(r4, r2, r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L17
            android.text.PrecomputedText r0 = r3.mWrapped
            int r0 = r0.getParagraphEnd(r4)
            return r0
        L17:
            int[] r0 = r3.mParagraphEnds
            r0 = r0[r4]
            return r0
    }

    public int getParagraphStart(int r4) {
            r3 = this;
            int r0 = r3.getParagraphCount()
            java.lang.String r1 = "paraIndex"
            r2 = 0
            androidx.core.util.Preconditions.checkArgumentInRange(r4, r2, r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L17
            android.text.PrecomputedText r0 = r3.mWrapped
            int r0 = r0.getParagraphStart(r4)
            return r0
        L17:
            if (r4 != 0) goto L1a
            goto L20
        L1a:
            int[] r0 = r3.mParagraphEnds
            int r1 = r4 + (-1)
            r2 = r0[r1]
        L20:
            return r2
    }

    public androidx.core.text.PrecomputedTextCompat.Params getParams() {
            r1 = this;
            androidx.core.text.PrecomputedTextCompat$Params r0 = r1.mParams
            return r0
    }

    public android.text.PrecomputedText getPrecomputedText() {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            boolean r0 = r0 instanceof android.text.PrecomputedText
            if (r0 == 0) goto Lb
            android.text.Spannable r0 = r1.mText
            android.text.PrecomputedText r0 = (android.text.PrecomputedText) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // android.text.Spanned
    public int getSpanEnd(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            int r0 = r0.getSpanEnd(r2)
            return r0
    }

    @Override // android.text.Spanned
    public int getSpanFlags(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            int r0 = r0.getSpanFlags(r2)
            return r0
    }

    @Override // android.text.Spanned
    public int getSpanStart(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            int r0 = r0.getSpanStart(r2)
            return r0
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int r3, int r4, java.lang.Class<T> r5) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Ld
            android.text.PrecomputedText r0 = r2.mWrapped
            java.lang.Object[] r0 = r0.getSpans(r3, r4, r5)
            return r0
        Ld:
            android.text.Spannable r0 = r2.mText
            java.lang.Object[] r0 = r0.getSpans(r3, r4, r5)
            return r0
    }

    @Override // java.lang.CharSequence
    public int length() {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            int r0 = r0.length()
            return r0
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            int r0 = r0.nextSpanTransition(r2, r3, r4)
            return r0
    }

    @Override // android.text.Spannable
    public void removeSpan(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof android.text.style.MetricAffectingSpan
            if (r0 != 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L10
            android.text.PrecomputedText r0 = r2.mWrapped
            r0.removeSpan(r3)
            goto L15
        L10:
            android.text.Spannable r0 = r2.mText
            r0.removeSpan(r3)
        L15:
            return
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "MetricAffectingSpan can not be removed from PrecomputedText."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.text.Spannable
    public void setSpan(java.lang.Object r3, int r4, int r5, int r6) {
            r2 = this;
            boolean r0 = r3 instanceof android.text.style.MetricAffectingSpan
            if (r0 != 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L10
            android.text.PrecomputedText r0 = r2.mWrapped
            r0.setSpan(r3, r4, r5, r6)
            goto L15
        L10:
            android.text.Spannable r0 = r2.mText
            r0.setSpan(r3, r4, r5, r6)
        L15:
            return
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "MetricAffectingSpan can not be set to PrecomputedText."
            r0.<init>(r1)
            throw r0
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int r2, int r3) {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            java.lang.CharSequence r0 = r0.subSequence(r2, r3)
            return r0
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            java.lang.String r0 = r0.toString()
            return r0
    }
}
