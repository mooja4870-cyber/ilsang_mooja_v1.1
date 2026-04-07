package androidx.core.text;

/* JADX INFO: loaded from: classes.dex */
public final class BidiFormatter {
    private static final int DEFAULT_FLAGS = 2;
    static final androidx.core.text.BidiFormatter DEFAULT_LTR_INSTANCE = null;
    static final androidx.core.text.BidiFormatter DEFAULT_RTL_INSTANCE = null;
    static final androidx.core.text.TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC = null;
    private static final int DIR_LTR = -1;
    private static final int DIR_RTL = 1;
    private static final int DIR_UNKNOWN = 0;
    private static final java.lang.String EMPTY_STRING = "";
    private static final int FLAG_STEREO_RESET = 2;
    private static final char LRE = 8234;
    private static final char LRM = 8206;
    private static final java.lang.String LRM_STRING = null;
    private static final char PDF = 8236;
    private static final char RLE = 8235;
    private static final char RLM = 8207;
    private static final java.lang.String RLM_STRING = null;
    private final androidx.core.text.TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat;
    private final int mFlags;
    private final boolean mIsRtlContext;

    public static final class Builder {
        private int mFlags;
        private boolean mIsRtlContext;
        private androidx.core.text.TextDirectionHeuristicCompat mTextDirectionHeuristicCompat;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.Locale r0 = java.util.Locale.getDefault()
                boolean r0 = androidx.core.text.BidiFormatter.isRtlLocale(r0)
                r1.initialize(r0)
                return
        }

        public Builder(java.util.Locale r2) {
                r1 = this;
                r1.<init>()
                boolean r0 = androidx.core.text.BidiFormatter.isRtlLocale(r2)
                r1.initialize(r0)
                return
        }

        public Builder(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.initialize(r1)
                return
        }

        private static androidx.core.text.BidiFormatter getDefaultInstanceFromContext(boolean r1) {
                if (r1 == 0) goto L5
                androidx.core.text.BidiFormatter r0 = androidx.core.text.BidiFormatter.DEFAULT_RTL_INSTANCE
                goto L7
            L5:
                androidx.core.text.BidiFormatter r0 = androidx.core.text.BidiFormatter.DEFAULT_LTR_INSTANCE
            L7:
                return r0
        }

        private void initialize(boolean r2) {
                r1 = this;
                r1.mIsRtlContext = r2
                androidx.core.text.TextDirectionHeuristicCompat r0 = androidx.core.text.BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC
                r1.mTextDirectionHeuristicCompat = r0
                r0 = 2
                r1.mFlags = r0
                return
        }

        public androidx.core.text.BidiFormatter build() {
                r4 = this;
                int r0 = r4.mFlags
                r1 = 2
                if (r0 != r1) goto L12
                androidx.core.text.TextDirectionHeuristicCompat r0 = r4.mTextDirectionHeuristicCompat
                androidx.core.text.TextDirectionHeuristicCompat r1 = androidx.core.text.BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC
                if (r0 != r1) goto L12
                boolean r0 = r4.mIsRtlContext
                androidx.core.text.BidiFormatter r0 = getDefaultInstanceFromContext(r0)
                return r0
            L12:
                androidx.core.text.BidiFormatter r0 = new androidx.core.text.BidiFormatter
                boolean r1 = r4.mIsRtlContext
                int r2 = r4.mFlags
                androidx.core.text.TextDirectionHeuristicCompat r3 = r4.mTextDirectionHeuristicCompat
                r0.<init>(r1, r2, r3)
                return r0
        }

        public androidx.core.text.BidiFormatter.Builder setTextDirectionHeuristic(androidx.core.text.TextDirectionHeuristicCompat r1) {
                r0 = this;
                r0.mTextDirectionHeuristicCompat = r1
                return r0
        }

        public androidx.core.text.BidiFormatter.Builder stereoReset(boolean r2) {
                r1 = this;
                if (r2 == 0) goto L9
                int r0 = r1.mFlags
                r0 = r0 | 2
                r1.mFlags = r0
                goto Lf
            L9:
                int r0 = r1.mFlags
                r0 = r0 & (-3)
                r1.mFlags = r0
            Lf:
                return r1
        }
    }

    private static class DirectionalityEstimator {
        private static final byte[] DIR_TYPE_CACHE = null;
        private static final int DIR_TYPE_CACHE_SIZE = 1792;
        private int charIndex;
        private final boolean isHtml;
        private char lastChar;
        private final int length;
        private final java.lang.CharSequence text;

        static {
                r0 = 1792(0x700, float:2.511E-42)
                byte[] r1 = new byte[r0]
                androidx.core.text.BidiFormatter.DirectionalityEstimator.DIR_TYPE_CACHE = r1
                r1 = 0
            L7:
                if (r1 >= r0) goto L14
                byte[] r2 = androidx.core.text.BidiFormatter.DirectionalityEstimator.DIR_TYPE_CACHE
                byte r3 = java.lang.Character.getDirectionality(r1)
                r2[r1] = r3
                int r1 = r1 + 1
                goto L7
            L14:
                return
        }

        DirectionalityEstimator(java.lang.CharSequence r2, boolean r3) {
                r1 = this;
                r1.<init>()
                r1.text = r2
                r1.isHtml = r3
                int r0 = r2.length()
                r1.length = r0
                return
        }

        private static byte getCachedDirectionality(char r1) {
                r0 = 1792(0x700, float:2.511E-42)
                if (r1 >= r0) goto L9
                byte[] r0 = androidx.core.text.BidiFormatter.DirectionalityEstimator.DIR_TYPE_CACHE
                r0 = r0[r1]
                goto Ld
            L9:
                byte r0 = java.lang.Character.getDirectionality(r1)
            Ld:
                return r0
        }

        private byte skipEntityBackward() {
                r4 = this;
                int r0 = r4.charIndex
            L2:
                int r1 = r4.charIndex
                r2 = 59
                if (r1 <= 0) goto L24
                java.lang.CharSequence r1 = r4.text
                int r3 = r4.charIndex
                int r3 = r3 + (-1)
                r4.charIndex = r3
                char r1 = r1.charAt(r3)
                r4.lastChar = r1
                char r1 = r4.lastChar
                r3 = 38
                if (r1 != r3) goto L1f
                r1 = 12
                return r1
            L1f:
                char r1 = r4.lastChar
                if (r1 != r2) goto L2
            L24:
                r4.charIndex = r0
                r4.lastChar = r2
                r1 = 13
                return r1
        }

        private byte skipEntityForward() {
                r3 = this;
            L0:
                int r0 = r3.charIndex
                int r1 = r3.length
                if (r0 >= r1) goto L19
                java.lang.CharSequence r0 = r3.text
                int r1 = r3.charIndex
                int r2 = r1 + 1
                r3.charIndex = r2
                char r0 = r0.charAt(r1)
                r3.lastChar = r0
                r1 = 59
                if (r0 == r1) goto L19
                goto L0
            L19:
                r0 = 12
                return r0
        }

        private byte skipTagBackward() {
                r4 = this;
                int r0 = r4.charIndex
            L2:
                int r1 = r4.charIndex
                r2 = 62
                if (r1 <= 0) goto L48
                java.lang.CharSequence r1 = r4.text
                int r3 = r4.charIndex
                int r3 = r3 + (-1)
                r4.charIndex = r3
                char r1 = r1.charAt(r3)
                r4.lastChar = r1
                char r1 = r4.lastChar
                r3 = 60
                if (r1 != r3) goto L1f
                r1 = 12
                return r1
            L1f:
                char r1 = r4.lastChar
                if (r1 != r2) goto L24
                goto L48
            L24:
                char r1 = r4.lastChar
                r2 = 34
                if (r1 == r2) goto L30
                char r1 = r4.lastChar
                r2 = 39
                if (r1 != r2) goto L2
            L30:
                char r1 = r4.lastChar
            L32:
                int r2 = r4.charIndex
                if (r2 <= 0) goto L47
                java.lang.CharSequence r2 = r4.text
                int r3 = r4.charIndex
                int r3 = r3 + (-1)
                r4.charIndex = r3
                char r2 = r2.charAt(r3)
                r4.lastChar = r2
                if (r2 == r1) goto L47
                goto L32
            L47:
                goto L2
            L48:
                r4.charIndex = r0
                r4.lastChar = r2
                r1 = 13
                return r1
        }

        private byte skipTagForward() {
                r5 = this;
                int r0 = r5.charIndex
            L2:
                int r1 = r5.charIndex
                int r2 = r5.length
                if (r1 >= r2) goto L45
                java.lang.CharSequence r1 = r5.text
                int r2 = r5.charIndex
                int r3 = r2 + 1
                r5.charIndex = r3
                char r1 = r1.charAt(r2)
                r5.lastChar = r1
                char r1 = r5.lastChar
                r2 = 62
                if (r1 != r2) goto L1f
                r1 = 12
                return r1
            L1f:
                char r1 = r5.lastChar
                r2 = 34
                if (r1 == r2) goto L2b
                char r1 = r5.lastChar
                r2 = 39
                if (r1 != r2) goto L2
            L2b:
                char r1 = r5.lastChar
            L2d:
                int r2 = r5.charIndex
                int r3 = r5.length
                if (r2 >= r3) goto L44
                java.lang.CharSequence r2 = r5.text
                int r3 = r5.charIndex
                int r4 = r3 + 1
                r5.charIndex = r4
                char r2 = r2.charAt(r3)
                r5.lastChar = r2
                if (r2 == r1) goto L44
                goto L2d
            L44:
                goto L2
            L45:
                r5.charIndex = r0
                r1 = 60
                r5.lastChar = r1
                r1 = 13
                return r1
        }

        byte dirTypeBackward() {
                r3 = this;
                java.lang.CharSequence r0 = r3.text
                int r1 = r3.charIndex
                int r1 = r1 + (-1)
                char r0 = r0.charAt(r1)
                r3.lastChar = r0
                char r0 = r3.lastChar
                boolean r0 = java.lang.Character.isLowSurrogate(r0)
                if (r0 == 0) goto L2a
                java.lang.CharSequence r0 = r3.text
                int r1 = r3.charIndex
                int r0 = java.lang.Character.codePointBefore(r0, r1)
                int r1 = r3.charIndex
                int r2 = java.lang.Character.charCount(r0)
                int r1 = r1 - r2
                r3.charIndex = r1
                byte r1 = java.lang.Character.getDirectionality(r0)
                return r1
            L2a:
                int r0 = r3.charIndex
                int r0 = r0 + (-1)
                r3.charIndex = r0
                char r0 = r3.lastChar
                byte r0 = getCachedDirectionality(r0)
                boolean r1 = r3.isHtml
                if (r1 == 0) goto L4f
                char r1 = r3.lastChar
                r2 = 62
                if (r1 != r2) goto L45
                byte r0 = r3.skipTagBackward()
                goto L4f
            L45:
                char r1 = r3.lastChar
                r2 = 59
                if (r1 != r2) goto L4f
                byte r0 = r3.skipEntityBackward()
            L4f:
                return r0
        }

        byte dirTypeForward() {
                r3 = this;
                java.lang.CharSequence r0 = r3.text
                int r1 = r3.charIndex
                char r0 = r0.charAt(r1)
                r3.lastChar = r0
                char r0 = r3.lastChar
                boolean r0 = java.lang.Character.isHighSurrogate(r0)
                if (r0 == 0) goto L28
                java.lang.CharSequence r0 = r3.text
                int r1 = r3.charIndex
                int r0 = java.lang.Character.codePointAt(r0, r1)
                int r1 = r3.charIndex
                int r2 = java.lang.Character.charCount(r0)
                int r1 = r1 + r2
                r3.charIndex = r1
                byte r1 = java.lang.Character.getDirectionality(r0)
                return r1
            L28:
                int r0 = r3.charIndex
                int r0 = r0 + 1
                r3.charIndex = r0
                char r0 = r3.lastChar
                byte r0 = getCachedDirectionality(r0)
                boolean r1 = r3.isHtml
                if (r1 == 0) goto L4d
                char r1 = r3.lastChar
                r2 = 60
                if (r1 != r2) goto L43
                byte r0 = r3.skipTagForward()
                goto L4d
            L43:
                char r1 = r3.lastChar
                r2 = 38
                if (r1 != r2) goto L4d
                byte r0 = r3.skipEntityForward()
            L4d:
                return r0
        }

        int getEntryDir() {
                r8 = this;
                r0 = 0
                r8.charIndex = r0
                r1 = 0
                r2 = 0
                r3 = 0
            L6:
                int r4 = r8.charIndex
                int r5 = r8.length
                r6 = -1
                r7 = 1
                if (r4 >= r5) goto L30
                if (r3 != 0) goto L30
                byte r4 = r8.dirTypeForward()
                switch(r4) {
                    case 0: goto L2b;
                    case 1: goto L26;
                    case 2: goto L26;
                    case 9: goto L25;
                    case 14: goto L21;
                    case 15: goto L21;
                    case 16: goto L1d;
                    case 17: goto L1d;
                    case 18: goto L19;
                    default: goto L17;
                }
            L17:
                r3 = r1
                goto L6
            L19:
                int r1 = r1 + (-1)
                r2 = 0
                goto L6
            L1d:
                int r1 = r1 + 1
                r2 = 1
                goto L6
            L21:
                int r1 = r1 + 1
                r2 = -1
                goto L6
            L25:
                goto L6
            L26:
                if (r1 != 0) goto L29
                return r7
            L29:
                r3 = r1
                goto L6
            L2b:
                if (r1 != 0) goto L2e
                return r6
            L2e:
                r3 = r1
                goto L6
            L30:
                if (r3 != 0) goto L33
                return r0
            L33:
                if (r2 == 0) goto L36
                return r2
            L36:
                int r4 = r8.charIndex
                if (r4 <= 0) goto L52
                byte r4 = r8.dirTypeBackward()
                switch(r4) {
                    case 14: goto L4b;
                    case 15: goto L4b;
                    case 16: goto L45;
                    case 17: goto L45;
                    case 18: goto L42;
                    default: goto L41;
                }
            L41:
                goto L51
            L42:
                int r1 = r1 + 1
                goto L51
            L45:
                if (r3 != r1) goto L48
                return r7
            L48:
                int r1 = r1 + (-1)
                goto L51
            L4b:
                if (r3 != r1) goto L4e
                return r6
            L4e:
                int r1 = r1 + (-1)
            L51:
                goto L36
            L52:
                return r0
        }

        int getExitDir() {
                r5 = this;
                int r0 = r5.length
                r5.charIndex = r0
                r0 = 0
                r1 = 0
            L6:
                int r2 = r5.charIndex
                if (r2 <= 0) goto L35
                byte r2 = r5.dirTypeBackward()
                r3 = 1
                r4 = -1
                switch(r2) {
                    case 0: goto L2e;
                    case 1: goto L27;
                    case 2: goto L27;
                    case 9: goto L26;
                    case 14: goto L20;
                    case 15: goto L20;
                    case 16: goto L1a;
                    case 17: goto L1a;
                    case 18: goto L17;
                    default: goto L13;
                }
            L13:
                if (r1 != 0) goto L6
                r1 = r0
                goto L6
            L17:
                int r0 = r0 + 1
                goto L6
            L1a:
                if (r1 != r0) goto L1d
                return r3
            L1d:
                int r0 = r0 + (-1)
                goto L6
            L20:
                if (r1 != r0) goto L23
                return r4
            L23:
                int r0 = r0 + (-1)
                goto L6
            L26:
                goto L6
            L27:
                if (r0 != 0) goto L2a
                return r3
            L2a:
                if (r1 != 0) goto L6
                r1 = r0
                goto L6
            L2e:
                if (r0 != 0) goto L31
                return r4
            L31:
                if (r1 != 0) goto L6
                r1 = r0
                goto L6
            L35:
                r2 = 0
                return r2
        }
    }

    static {
            androidx.core.text.TextDirectionHeuristicCompat r0 = androidx.core.text.TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR
            androidx.core.text.BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC = r0
            r0 = 8206(0x200e, float:1.1499E-41)
            java.lang.String r0 = java.lang.Character.toString(r0)
            androidx.core.text.BidiFormatter.LRM_STRING = r0
            r0 = 8207(0x200f, float:1.15E-41)
            java.lang.String r0 = java.lang.Character.toString(r0)
            androidx.core.text.BidiFormatter.RLM_STRING = r0
            androidx.core.text.BidiFormatter r0 = new androidx.core.text.BidiFormatter
            androidx.core.text.TextDirectionHeuristicCompat r1 = androidx.core.text.BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC
            r2 = 0
            r3 = 2
            r0.<init>(r2, r3, r1)
            androidx.core.text.BidiFormatter.DEFAULT_LTR_INSTANCE = r0
            androidx.core.text.BidiFormatter r0 = new androidx.core.text.BidiFormatter
            r1 = 1
            androidx.core.text.TextDirectionHeuristicCompat r2 = androidx.core.text.BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC
            r0.<init>(r1, r3, r2)
            androidx.core.text.BidiFormatter.DEFAULT_RTL_INSTANCE = r0
            return
    }

    BidiFormatter(boolean r1, int r2, androidx.core.text.TextDirectionHeuristicCompat r3) {
            r0 = this;
            r0.<init>()
            r0.mIsRtlContext = r1
            r0.mFlags = r2
            r0.mDefaultTextDirectionHeuristicCompat = r3
            return
    }

    private static int getEntryDir(java.lang.CharSequence r2) {
            androidx.core.text.BidiFormatter$DirectionalityEstimator r0 = new androidx.core.text.BidiFormatter$DirectionalityEstimator
            r1 = 0
            r0.<init>(r2, r1)
            int r0 = r0.getEntryDir()
            return r0
    }

    private static int getExitDir(java.lang.CharSequence r2) {
            androidx.core.text.BidiFormatter$DirectionalityEstimator r0 = new androidx.core.text.BidiFormatter$DirectionalityEstimator
            r1 = 0
            r0.<init>(r2, r1)
            int r0 = r0.getExitDir()
            return r0
    }

    public static androidx.core.text.BidiFormatter getInstance() {
            androidx.core.text.BidiFormatter$Builder r0 = new androidx.core.text.BidiFormatter$Builder
            r0.<init>()
            androidx.core.text.BidiFormatter r0 = r0.build()
            return r0
    }

    public static androidx.core.text.BidiFormatter getInstance(java.util.Locale r1) {
            androidx.core.text.BidiFormatter$Builder r0 = new androidx.core.text.BidiFormatter$Builder
            r0.<init>(r1)
            androidx.core.text.BidiFormatter r0 = r0.build()
            return r0
    }

    public static androidx.core.text.BidiFormatter getInstance(boolean r1) {
            androidx.core.text.BidiFormatter$Builder r0 = new androidx.core.text.BidiFormatter$Builder
            r0.<init>(r1)
            androidx.core.text.BidiFormatter r0 = r0.build()
            return r0
    }

    static boolean isRtlLocale(java.util.Locale r2) {
            int r0 = androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(r2)
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    private java.lang.String markAfter(java.lang.CharSequence r4, androidx.core.text.TextDirectionHeuristicCompat r5) {
            r3 = this;
            r0 = 0
            int r1 = r4.length()
            boolean r0 = r5.isRtl(r4, r0, r1)
            boolean r1 = r3.mIsRtlContext
            if (r1 != 0) goto L19
            if (r0 != 0) goto L16
            int r1 = getExitDir(r4)
            r2 = 1
            if (r1 != r2) goto L19
        L16:
            java.lang.String r1 = androidx.core.text.BidiFormatter.LRM_STRING
            return r1
        L19:
            boolean r1 = r3.mIsRtlContext
            if (r1 == 0) goto L29
            if (r0 == 0) goto L26
            int r1 = getExitDir(r4)
            r2 = -1
            if (r1 != r2) goto L29
        L26:
            java.lang.String r1 = androidx.core.text.BidiFormatter.RLM_STRING
            return r1
        L29:
            java.lang.String r1 = ""
            return r1
    }

    private java.lang.String markBefore(java.lang.CharSequence r4, androidx.core.text.TextDirectionHeuristicCompat r5) {
            r3 = this;
            r0 = 0
            int r1 = r4.length()
            boolean r0 = r5.isRtl(r4, r0, r1)
            boolean r1 = r3.mIsRtlContext
            if (r1 != 0) goto L19
            if (r0 != 0) goto L16
            int r1 = getEntryDir(r4)
            r2 = 1
            if (r1 != r2) goto L19
        L16:
            java.lang.String r1 = androidx.core.text.BidiFormatter.LRM_STRING
            return r1
        L19:
            boolean r1 = r3.mIsRtlContext
            if (r1 == 0) goto L29
            if (r0 == 0) goto L26
            int r1 = getEntryDir(r4)
            r2 = -1
            if (r1 != r2) goto L29
        L26:
            java.lang.String r1 = androidx.core.text.BidiFormatter.RLM_STRING
            return r1
        L29:
            java.lang.String r1 = ""
            return r1
    }

    public boolean getStereoReset() {
            r1 = this;
            int r0 = r1.mFlags
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isRtl(java.lang.CharSequence r4) {
            r3 = this;
            androidx.core.text.TextDirectionHeuristicCompat r0 = r3.mDefaultTextDirectionHeuristicCompat
            r1 = 0
            int r2 = r4.length()
            boolean r0 = r0.isRtl(r4, r1, r2)
            return r0
    }

    public boolean isRtl(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.isRtl(r2)
            return r0
    }

    public boolean isRtlContext() {
            r1 = this;
            boolean r0 = r1.mIsRtlContext
            return r0
    }

    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence r3) {
            r2 = this;
            androidx.core.text.TextDirectionHeuristicCompat r0 = r2.mDefaultTextDirectionHeuristicCompat
            r1 = 1
            java.lang.CharSequence r0 = r2.unicodeWrap(r3, r0, r1)
            return r0
    }

    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence r2, androidx.core.text.TextDirectionHeuristicCompat r3) {
            r1 = this;
            r0 = 1
            java.lang.CharSequence r0 = r1.unicodeWrap(r2, r3, r0)
            return r0
    }

    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence r4, androidx.core.text.TextDirectionHeuristicCompat r5, boolean r6) {
            r3 = this;
            if (r4 != 0) goto L4
            r0 = 0
            return r0
        L4:
            r0 = 0
            int r1 = r4.length()
            boolean r0 = r5.isRtl(r4, r0, r1)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            boolean r2 = r3.getStereoReset()
            if (r2 == 0) goto L29
            if (r6 == 0) goto L29
        L1b:
            if (r0 == 0) goto L20
            androidx.core.text.TextDirectionHeuristicCompat r2 = androidx.core.text.TextDirectionHeuristicsCompat.RTL
            goto L22
        L20:
            androidx.core.text.TextDirectionHeuristicCompat r2 = androidx.core.text.TextDirectionHeuristicsCompat.LTR
        L22:
            java.lang.String r2 = r3.markBefore(r4, r2)
            r1.append(r2)
        L29:
            boolean r2 = r3.mIsRtlContext
            if (r0 == r2) goto L40
            if (r0 == 0) goto L32
            r2 = 8235(0x202b, float:1.154E-41)
            goto L34
        L32:
            r2 = 8234(0x202a, float:1.1538E-41)
        L34:
            r1.append(r2)
            r1.append(r4)
            r2 = 8236(0x202c, float:1.1541E-41)
            r1.append(r2)
            goto L43
        L40:
            r1.append(r4)
        L43:
            if (r6 == 0) goto L54
        L46:
            if (r0 == 0) goto L4b
            androidx.core.text.TextDirectionHeuristicCompat r2 = androidx.core.text.TextDirectionHeuristicsCompat.RTL
            goto L4d
        L4b:
            androidx.core.text.TextDirectionHeuristicCompat r2 = androidx.core.text.TextDirectionHeuristicsCompat.LTR
        L4d:
            java.lang.String r2 = r3.markAfter(r4, r2)
            r1.append(r2)
        L54:
            return r1
    }

    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence r2, boolean r3) {
            r1 = this;
            androidx.core.text.TextDirectionHeuristicCompat r0 = r1.mDefaultTextDirectionHeuristicCompat
            java.lang.CharSequence r0 = r1.unicodeWrap(r2, r0, r3)
            return r0
    }

    public java.lang.String unicodeWrap(java.lang.String r3) {
            r2 = this;
            androidx.core.text.TextDirectionHeuristicCompat r0 = r2.mDefaultTextDirectionHeuristicCompat
            r1 = 1
            java.lang.String r0 = r2.unicodeWrap(r3, r0, r1)
            return r0
    }

    public java.lang.String unicodeWrap(java.lang.String r2, androidx.core.text.TextDirectionHeuristicCompat r3) {
            r1 = this;
            r0 = 1
            java.lang.String r0 = r1.unicodeWrap(r2, r3, r0)
            return r0
    }

    public java.lang.String unicodeWrap(java.lang.String r2, androidx.core.text.TextDirectionHeuristicCompat r3, boolean r4) {
            r1 = this;
            if (r2 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.CharSequence r0 = r1.unicodeWrap(r2, r3, r4)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String unicodeWrap(java.lang.String r2, boolean r3) {
            r1 = this;
            androidx.core.text.TextDirectionHeuristicCompat r0 = r1.mDefaultTextDirectionHeuristicCompat
            java.lang.String r0 = r1.unicodeWrap(r2, r0, r3)
            return r0
    }
}
