package androidx.core.view.inputmethod;

/* JADX INFO: loaded from: classes.dex */
public final class EditorInfoCompat {
    private static final java.lang.String CONTENT_MIME_TYPES_INTEROP_KEY = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final java.lang.String CONTENT_MIME_TYPES_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final java.lang.String CONTENT_SELECTION_END_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";
    private static final java.lang.String CONTENT_SELECTION_HEAD_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";
    private static final java.lang.String CONTENT_SURROUNDING_TEXT_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";
    private static final java.lang.String[] EMPTY_STRING_ARRAY = null;
    public static final int IME_FLAG_FORCE_ASCII = Integer.MIN_VALUE;
    public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 16777216;
    static final int MAX_INITIAL_SELECTION_LENGTH = 1024;
    static final int MEMORY_EFFICIENT_TEXT_LENGTH = 2048;
    static final java.lang.String STYLUS_HANDWRITING_ENABLED_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED";

    private static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.CharSequence getInitialSelectedText(android.view.inputmethod.EditorInfo r1, int r2) {
                java.lang.CharSequence r0 = r1.getInitialSelectedText(r2)
                return r0
        }

        static java.lang.CharSequence getInitialTextAfterCursor(android.view.inputmethod.EditorInfo r1, int r2, int r3) {
                java.lang.CharSequence r0 = r1.getInitialTextAfterCursor(r2, r3)
                return r0
        }

        static java.lang.CharSequence getInitialTextBeforeCursor(android.view.inputmethod.EditorInfo r1, int r2, int r3) {
                java.lang.CharSequence r0 = r1.getInitialTextBeforeCursor(r2, r3)
                return r0
        }

        static void setInitialSurroundingSubText(android.view.inputmethod.EditorInfo r0, java.lang.CharSequence r1, int r2) {
                r0.setInitialSurroundingSubText(r1, r2)
                return
        }
    }

    private static class Api35Impl {
        private Api35Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isStylusHandwritingEnabled(android.view.inputmethod.EditorInfo r1) {
                boolean r0 = r1.isStylusHandwritingEnabled()
                return r0
        }

        static void setStylusHandwritingEnabled(android.view.inputmethod.EditorInfo r0, boolean r1) {
                r0.setStylusHandwritingEnabled(r1)
                return
        }
    }

    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            androidx.core.view.inputmethod.EditorInfoCompat.EMPTY_STRING_ARRAY = r0
            return
    }

    @java.lang.Deprecated
    public EditorInfoCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String[] getContentMimeTypes(android.view.inputmethod.EditorInfo r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto Lf
            java.lang.String[] r0 = r3.contentMimeTypes
            if (r0 == 0) goto Lc
            r1 = r0
            goto Le
        Lc:
            java.lang.String[] r1 = androidx.core.view.inputmethod.EditorInfoCompat.EMPTY_STRING_ARRAY
        Le:
            return r1
        Lf:
            android.os.Bundle r0 = r3.extras
            if (r0 != 0) goto L16
            java.lang.String[] r0 = androidx.core.view.inputmethod.EditorInfoCompat.EMPTY_STRING_ARRAY
            return r0
        L16:
            android.os.Bundle r0 = r3.extras
            java.lang.String r1 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String[] r0 = r0.getStringArray(r1)
            if (r0 != 0) goto L28
            android.os.Bundle r1 = r3.extras
            java.lang.String r2 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String[] r0 = r1.getStringArray(r2)
        L28:
            if (r0 == 0) goto L2c
            r1 = r0
            goto L2e
        L2c:
            java.lang.String[] r1 = androidx.core.view.inputmethod.EditorInfoCompat.EMPTY_STRING_ARRAY
        L2e:
            return r1
    }

    public static java.lang.CharSequence getInitialSelectedText(android.view.inputmethod.EditorInfo r8, int r9) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            java.lang.CharSequence r0 = androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl.getInitialSelectedText(r8, r9)
            return r0
        Lb:
            android.os.Bundle r0 = r8.extras
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            int r0 = r8.initialSelStart
            int r2 = r8.initialSelEnd
            int r0 = java.lang.Math.min(r0, r2)
            int r2 = r8.initialSelStart
            int r3 = r8.initialSelEnd
            int r2 = java.lang.Math.max(r2, r3)
            android.os.Bundle r3 = r8.extras
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD"
            int r3 = r3.getInt(r4)
            android.os.Bundle r4 = r8.extras
            java.lang.String r5 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END"
            int r4 = r4.getInt(r5)
            int r5 = r2 - r0
            int r6 = r8.initialSelStart
            if (r6 < 0) goto L59
            int r6 = r8.initialSelEnd
            if (r6 < 0) goto L59
            int r6 = r4 - r3
            if (r6 == r5) goto L40
            goto L59
        L40:
            android.os.Bundle r6 = r8.extras
            java.lang.String r7 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT"
            java.lang.CharSequence r6 = r6.getCharSequence(r7)
            if (r6 != 0) goto L4b
            return r1
        L4b:
            r1 = r9 & 1
            if (r1 == 0) goto L54
            java.lang.CharSequence r1 = r6.subSequence(r3, r4)
            goto L58
        L54:
            java.lang.String r1 = android.text.TextUtils.substring(r6, r3, r4)
        L58:
            return r1
        L59:
            return r1
    }

    public static java.lang.CharSequence getInitialTextAfterCursor(android.view.inputmethod.EditorInfo r4, int r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            java.lang.CharSequence r0 = androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl.getInitialTextAfterCursor(r4, r5, r6)
            return r0
        Lb:
            android.os.Bundle r0 = r4.extras
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            android.os.Bundle r0 = r4.extras
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT"
            java.lang.CharSequence r0 = r0.getCharSequence(r2)
            if (r0 != 0) goto L1c
            return r1
        L1c:
            android.os.Bundle r1 = r4.extras
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END"
            int r1 = r1.getInt(r2)
            int r2 = r0.length()
            int r2 = r2 - r1
            int r2 = java.lang.Math.min(r5, r2)
            r3 = r6 & 1
            if (r3 == 0) goto L38
            int r3 = r1 + r2
            java.lang.CharSequence r3 = r0.subSequence(r1, r3)
            goto L3e
        L38:
            int r3 = r1 + r2
            java.lang.String r3 = android.text.TextUtils.substring(r0, r1, r3)
        L3e:
            return r3
    }

    public static java.lang.CharSequence getInitialTextBeforeCursor(android.view.inputmethod.EditorInfo r4, int r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            java.lang.CharSequence r0 = androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl.getInitialTextBeforeCursor(r4, r5, r6)
            return r0
        Lb:
            android.os.Bundle r0 = r4.extras
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            android.os.Bundle r0 = r4.extras
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT"
            java.lang.CharSequence r0 = r0.getCharSequence(r2)
            if (r0 != 0) goto L1c
            return r1
        L1c:
            android.os.Bundle r1 = r4.extras
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD"
            int r1 = r1.getInt(r2)
            int r2 = java.lang.Math.min(r5, r1)
            r3 = r6 & 1
            if (r3 == 0) goto L33
            int r3 = r1 - r2
            java.lang.CharSequence r3 = r0.subSequence(r3, r1)
            goto L39
        L33:
            int r3 = r1 - r2
            java.lang.String r3 = android.text.TextUtils.substring(r0, r3, r1)
        L39:
            return r3
    }

    static int getProtocol(android.view.inputmethod.EditorInfo r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            android.os.Bundle r0 = r4.extras
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            android.os.Bundle r0 = r4.extras
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            boolean r0 = r0.containsKey(r2)
            android.os.Bundle r2 = r4.extras
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            boolean r2 = r2.containsKey(r3)
            if (r0 == 0) goto L24
            if (r2 == 0) goto L24
            r1 = 4
            return r1
        L24:
            if (r0 == 0) goto L28
            r1 = 3
            return r1
        L28:
            if (r2 == 0) goto L2c
            r1 = 2
            return r1
        L2c:
            return r1
    }

    private static boolean isCutOnSurrogate(java.lang.CharSequence r1, int r2, int r3) {
            switch(r3) {
                case 0: goto Le;
                case 1: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            char r0 = r1.charAt(r2)
            boolean r0 = java.lang.Character.isHighSurrogate(r0)
            return r0
        Le:
            char r0 = r1.charAt(r2)
            boolean r0 = java.lang.Character.isLowSurrogate(r0)
            return r0
    }

    private static boolean isPasswordInputType(int r2) {
            r0 = r2 & 4095(0xfff, float:5.738E-42)
            r1 = 129(0x81, float:1.81E-43)
            if (r0 == r1) goto L11
            r1 = 225(0xe1, float:3.15E-43)
            if (r0 == r1) goto L11
            r1 = 18
            if (r0 != r1) goto Lf
            goto L11
        Lf:
            r1 = 0
            goto L12
        L11:
            r1 = 1
        L12:
            return r1
    }

    public static boolean isStylusHandwritingEnabled(android.view.inputmethod.EditorInfo r2) {
            android.os.Bundle r0 = r2.extras
            if (r0 == 0) goto L15
            android.os.Bundle r0 = r2.extras
            java.lang.String r1 = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L15
            android.os.Bundle r0 = r2.extras
            boolean r0 = r0.getBoolean(r1)
            return r0
        L15:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 < r1) goto L20
            boolean r0 = androidx.core.view.inputmethod.EditorInfoCompat.Api35Impl.isStylusHandwritingEnabled(r2)
            return r0
        L20:
            r0 = 0
            return r0
    }

    public static void setContentMimeTypes(android.view.inputmethod.EditorInfo r2, java.lang.String[] r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L9
            r2.contentMimeTypes = r3
            goto L22
        L9:
            android.os.Bundle r0 = r2.extras
            if (r0 != 0) goto L14
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2.extras = r0
        L14:
            android.os.Bundle r0 = r2.extras
            java.lang.String r1 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r0.putStringArray(r1, r3)
            android.os.Bundle r0 = r2.extras
            java.lang.String r1 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r0.putStringArray(r1, r3)
        L22:
            return
    }

    public static void setInitialSurroundingSubText(android.view.inputmethod.EditorInfo r6, java.lang.CharSequence r7, int r8) {
            androidx.core.util.Preconditions.checkNotNull(r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Ld
            androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl.setInitialSurroundingSubText(r6, r7, r8)
            return
        Ld:
            int r0 = r6.initialSelStart
            int r1 = r6.initialSelEnd
            if (r0 <= r1) goto L17
            int r0 = r6.initialSelEnd
            int r0 = r0 - r8
            goto L1a
        L17:
            int r0 = r6.initialSelStart
            int r0 = r0 - r8
        L1a:
            int r1 = r6.initialSelStart
            int r2 = r6.initialSelEnd
            if (r1 <= r2) goto L25
            int r1 = r6.initialSelStart
            int r1 = r1 - r8
            goto L28
        L25:
            int r1 = r6.initialSelEnd
            int r1 = r1 - r8
        L28:
            int r2 = r7.length()
            r3 = 0
            r4 = 0
            if (r8 < 0) goto L4e
            if (r0 < 0) goto L4e
            if (r1 <= r2) goto L36
            goto L4e
        L36:
            int r5 = r6.inputType
            boolean r5 = isPasswordInputType(r5)
            if (r5 == 0) goto L42
            setSurroundingText(r6, r3, r4, r4)
            return
        L42:
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 > r3) goto L4a
            setSurroundingText(r6, r7, r0, r1)
            return
        L4a:
            trimLongSurroundingText(r6, r7, r0, r1)
            return
        L4e:
            setSurroundingText(r6, r3, r4, r4)
            return
    }

    public static void setInitialSurroundingText(android.view.inputmethod.EditorInfo r3, java.lang.CharSequence r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 < r1) goto Lb
            androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl.setInitialSurroundingSubText(r3, r4, r2)
            goto Le
        Lb:
            setInitialSurroundingSubText(r3, r4, r2)
        Le:
            return
    }

    public static void setStylusHandwritingEnabled(android.view.inputmethod.EditorInfo r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 < r1) goto L9
            androidx.core.view.inputmethod.EditorInfoCompat.Api35Impl.setStylusHandwritingEnabled(r2, r3)
        L9:
            android.os.Bundle r0 = r2.extras
            if (r0 != 0) goto L14
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2.extras = r0
        L14:
            android.os.Bundle r0 = r2.extras
            java.lang.String r1 = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED"
            r0.putBoolean(r1, r3)
            return
    }

    private static void setSurroundingText(android.view.inputmethod.EditorInfo r3, java.lang.CharSequence r4, int r5, int r6) {
            android.os.Bundle r0 = r3.extras
            if (r0 != 0) goto Lb
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r3.extras = r0
        Lb:
            if (r4 == 0) goto L13
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r4)
            goto L14
        L13:
            r0 = 0
        L14:
            android.os.Bundle r1 = r3.extras
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT"
            r1.putCharSequence(r2, r0)
            android.os.Bundle r1 = r3.extras
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD"
            r1.putInt(r2, r5)
            android.os.Bundle r1 = r3.extras
            java.lang.String r2 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END"
            r1.putInt(r2, r6)
            return
    }

    private static void trimLongSurroundingText(android.view.inputmethod.EditorInfo r17, java.lang.CharSequence r18, int r19, int r20) {
            r0 = r18
            r1 = r19
            r2 = r20
            int r3 = r2 - r1
            r4 = 1024(0x400, float:1.435E-42)
            r5 = 0
            if (r3 <= r4) goto Lf
            r4 = r5
            goto L10
        Lf:
            r4 = r3
        L10:
            int r6 = r0.length()
            int r6 = r6 - r2
            int r7 = 2048 - r4
            r8 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r10 = (double) r7
            double r10 = r10 * r8
            int r8 = (int) r10
            int r8 = java.lang.Math.min(r1, r8)
            int r9 = r7 - r8
            int r9 = java.lang.Math.min(r6, r9)
            int r10 = r7 - r9
            int r10 = java.lang.Math.min(r1, r10)
            int r11 = r1 - r10
            int r12 = r1 - r10
            boolean r12 = isCutOnSurrogate(r0, r12, r5)
            if (r12 == 0) goto L3d
            int r11 = r11 + 1
            int r10 = r10 + (-1)
        L3d:
            int r12 = r2 + r9
            r13 = 1
            int r12 = r12 - r13
            boolean r12 = isCutOnSurrogate(r0, r12, r13)
            if (r12 == 0) goto L49
            int r9 = r9 + (-1)
        L49:
            int r12 = r10 + r4
            int r12 = r12 + r9
            if (r4 == r3) goto L68
            int r14 = r11 + r10
            java.lang.CharSequence r14 = r0.subSequence(r11, r14)
            int r15 = r2 + r9
            java.lang.CharSequence r15 = r0.subSequence(r2, r15)
            r16 = r5
            r5 = 2
            java.lang.CharSequence[] r5 = new java.lang.CharSequence[r5]
            r5[r16] = r14
            r5[r13] = r15
            java.lang.CharSequence r5 = android.text.TextUtils.concat(r5)
            goto L6e
        L68:
            int r5 = r11 + r12
            java.lang.CharSequence r5 = r0.subSequence(r11, r5)
        L6e:
            r11 = 0
            int r13 = r11 + r10
            int r14 = r13 + r4
            r15 = r17
            setSurroundingText(r15, r5, r13, r14)
            return
    }
}
