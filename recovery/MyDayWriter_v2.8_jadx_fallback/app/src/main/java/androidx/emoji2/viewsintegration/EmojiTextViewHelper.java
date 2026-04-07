package androidx.emoji2.viewsintegration;

/* JADX INFO: loaded from: classes.dex */
public final class EmojiTextViewHelper {
    private final androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal mHelper;

    static class HelperInternal {
        HelperInternal() {
                r0 = this;
                r0.<init>()
                return
        }

        android.text.InputFilter[] getFilters(android.text.InputFilter[] r1) {
                r0 = this;
                return r1
        }

        public boolean isEnabled() {
                r1 = this;
                r0 = 0
                return r0
        }

        void setAllCaps(boolean r1) {
                r0 = this;
                return
        }

        void setEnabled(boolean r1) {
                r0 = this;
                return
        }

        void updateTransformationMethod() {
                r0 = this;
                return
        }

        android.text.method.TransformationMethod wrapTransformationMethod(android.text.method.TransformationMethod r1) {
                r0 = this;
                return r1
        }
    }

    private static class HelperInternal19 extends androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal {
        private final androidx.emoji2.viewsintegration.EmojiInputFilter mEmojiInputFilter;
        private boolean mEnabled;
        private final android.widget.TextView mTextView;

        HelperInternal19(android.widget.TextView r2) {
                r1 = this;
                r1.<init>()
                r1.mTextView = r2
                r0 = 1
                r1.mEnabled = r0
                androidx.emoji2.viewsintegration.EmojiInputFilter r0 = new androidx.emoji2.viewsintegration.EmojiInputFilter
                r0.<init>(r2)
                r1.mEmojiInputFilter = r0
                return
        }

        private android.text.InputFilter[] addEmojiInputFilterIfMissing(android.text.InputFilter[] r5) {
                r4 = this;
                int r0 = r5.length
                r1 = 0
            L2:
                if (r1 >= r0) goto Le
                r2 = r5[r1]
                androidx.emoji2.viewsintegration.EmojiInputFilter r3 = r4.mEmojiInputFilter
                if (r2 != r3) goto Lb
                return r5
            Lb:
                int r1 = r1 + 1
                goto L2
            Le:
                int r1 = r5.length
                int r1 = r1 + 1
                android.text.InputFilter[] r1 = new android.text.InputFilter[r1]
                r2 = 0
                java.lang.System.arraycopy(r5, r2, r1, r2, r0)
                androidx.emoji2.viewsintegration.EmojiInputFilter r2 = r4.mEmojiInputFilter
                r1[r0] = r2
                return r1
        }

        private android.util.SparseArray<android.text.InputFilter> getEmojiInputFilterPositionArray(android.text.InputFilter[] r4) {
                r3 = this;
                android.util.SparseArray r0 = new android.util.SparseArray
                r1 = 1
                r0.<init>(r1)
                r1 = 0
            L7:
                int r2 = r4.length
                if (r1 >= r2) goto L18
                r2 = r4[r1]
                boolean r2 = r2 instanceof androidx.emoji2.viewsintegration.EmojiInputFilter
                if (r2 == 0) goto L15
                r2 = r4[r1]
                r0.put(r1, r2)
            L15:
                int r1 = r1 + 1
                goto L7
            L18:
                return r0
        }

        private android.text.InputFilter[] removeEmojiInputFilterIfPresent(android.text.InputFilter[] r8) {
                r7 = this;
                android.util.SparseArray r0 = r7.getEmojiInputFilterPositionArray(r8)
                int r1 = r0.size()
                if (r1 != 0) goto Lb
                return r8
            Lb:
                int r1 = r8.length
                int r2 = r8.length
                int r3 = r0.size()
                int r2 = r2 - r3
                android.text.InputFilter[] r3 = new android.text.InputFilter[r2]
                r4 = 0
                r5 = 0
            L16:
                if (r5 >= r1) goto L27
                int r6 = r0.indexOfKey(r5)
                if (r6 >= 0) goto L24
                r6 = r8[r5]
                r3[r4] = r6
                int r4 = r4 + 1
            L24:
                int r5 = r5 + 1
                goto L16
            L27:
                return r3
        }

        private android.text.method.TransformationMethod unwrapForDisabled(android.text.method.TransformationMethod r3) {
                r2 = this;
                boolean r0 = r3 instanceof androidx.emoji2.viewsintegration.EmojiTransformationMethod
                if (r0 == 0) goto Lc
                r0 = r3
                androidx.emoji2.viewsintegration.EmojiTransformationMethod r0 = (androidx.emoji2.viewsintegration.EmojiTransformationMethod) r0
                android.text.method.TransformationMethod r1 = r0.getOriginalTransformationMethod()
                return r1
            Lc:
                return r3
        }

        private void updateFilters() {
                r3 = this;
                android.widget.TextView r0 = r3.mTextView
                android.text.InputFilter[] r0 = r0.getFilters()
                android.widget.TextView r1 = r3.mTextView
                android.text.InputFilter[] r2 = r3.getFilters(r0)
                r1.setFilters(r2)
                return
        }

        private android.text.method.TransformationMethod wrapForEnabled(android.text.method.TransformationMethod r2) {
                r1 = this;
                boolean r0 = r2 instanceof androidx.emoji2.viewsintegration.EmojiTransformationMethod
                if (r0 == 0) goto L5
                return r2
            L5:
                boolean r0 = r2 instanceof android.text.method.PasswordTransformationMethod
                if (r0 == 0) goto La
                return r2
            La:
                androidx.emoji2.viewsintegration.EmojiTransformationMethod r0 = new androidx.emoji2.viewsintegration.EmojiTransformationMethod
                r0.<init>(r2)
                return r0
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        android.text.InputFilter[] getFilters(android.text.InputFilter[] r2) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 != 0) goto L9
                android.text.InputFilter[] r0 = r1.removeEmojiInputFilterIfPresent(r2)
                return r0
            L9:
                android.text.InputFilter[] r0 = r1.addEmojiInputFilterIfMissing(r2)
                return r0
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public boolean isEnabled() {
                r1 = this;
                boolean r0 = r1.mEnabled
                return r0
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void setAllCaps(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L5
                r0.updateTransformationMethod()
            L5:
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void setEnabled(boolean r1) {
                r0 = this;
                r0.mEnabled = r1
                r0.updateTransformationMethod()
                r0.updateFilters()
                return
        }

        void setEnabledUnsafe(boolean r1) {
                r0 = this;
                r0.mEnabled = r1
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void updateTransformationMethod() {
                r2 = this;
                android.widget.TextView r0 = r2.mTextView
                android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
                android.text.method.TransformationMethod r0 = r2.wrapTransformationMethod(r0)
                android.widget.TextView r1 = r2.mTextView
                r1.setTransformationMethod(r0)
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        android.text.method.TransformationMethod wrapTransformationMethod(android.text.method.TransformationMethod r2) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 == 0) goto L9
                android.text.method.TransformationMethod r0 = r1.wrapForEnabled(r2)
                return r0
            L9:
                android.text.method.TransformationMethod r0 = r1.unwrapForDisabled(r2)
                return r0
        }
    }

    private static class SkippingHelper19 extends androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal {
        private final androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal19 mHelperDelegate;

        SkippingHelper19(android.widget.TextView r2) {
                r1 = this;
                r1.<init>()
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = new androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19
                r0.<init>(r2)
                r1.mHelperDelegate = r0
                return
        }

        private boolean skipBecauseEmojiCompatNotInitialized() {
                r1 = this;
                boolean r0 = androidx.emoji2.text.EmojiCompat.isConfigured()
                r0 = r0 ^ 1
                return r0
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        android.text.InputFilter[] getFilters(android.text.InputFilter[] r2) {
                r1 = this;
                boolean r0 = r1.skipBecauseEmojiCompatNotInitialized()
                if (r0 == 0) goto L7
                return r2
            L7:
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                android.text.InputFilter[] r0 = r0.getFilters(r2)
                return r0
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public boolean isEnabled() {
                r1 = this;
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                boolean r0 = r0.isEnabled()
                return r0
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void setAllCaps(boolean r2) {
                r1 = this;
                boolean r0 = r1.skipBecauseEmojiCompatNotInitialized()
                if (r0 == 0) goto L7
                return
            L7:
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                r0.setAllCaps(r2)
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void setEnabled(boolean r2) {
                r1 = this;
                boolean r0 = r1.skipBecauseEmojiCompatNotInitialized()
                if (r0 == 0) goto Lc
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                r0.setEnabledUnsafe(r2)
                goto L11
            Lc:
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                r0.setEnabled(r2)
            L11:
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void updateTransformationMethod() {
                r1 = this;
                boolean r0 = r1.skipBecauseEmojiCompatNotInitialized()
                if (r0 == 0) goto L7
                return
            L7:
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                r0.updateTransformationMethod()
                return
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        android.text.method.TransformationMethod wrapTransformationMethod(android.text.method.TransformationMethod r2) {
                r1 = this;
                boolean r0 = r1.skipBecauseEmojiCompatNotInitialized()
                if (r0 == 0) goto L7
                return r2
            L7:
                androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = r1.mHelperDelegate
                android.text.method.TransformationMethod r0 = r0.wrapTransformationMethod(r2)
                return r0
        }
    }

    public EmojiTextViewHelper(android.widget.TextView r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public EmojiTextViewHelper(android.widget.TextView r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "textView cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r2, r0)
            if (r3 != 0) goto L13
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$SkippingHelper19 r0 = new androidx.emoji2.viewsintegration.EmojiTextViewHelper$SkippingHelper19
            r0.<init>(r2)
            r1.mHelper = r0
            goto L1a
        L13:
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19 r0 = new androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal19
            r0.<init>(r2)
            r1.mHelper = r0
        L1a:
            return
    }

    public android.text.InputFilter[] getFilters(android.text.InputFilter[] r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal r0 = r1.mHelper
            android.text.InputFilter[] r0 = r0.getFilters(r2)
            return r0
    }

    public boolean isEnabled() {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal r0 = r1.mHelper
            boolean r0 = r0.isEnabled()
            return r0
    }

    public void setAllCaps(boolean r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal r0 = r1.mHelper
            r0.setAllCaps(r2)
            return
    }

    public void setEnabled(boolean r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal r0 = r1.mHelper
            r0.setEnabled(r2)
            return
    }

    public void updateTransformationMethod() {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal r0 = r1.mHelper
            r0.updateTransformationMethod()
            return
    }

    public android.text.method.TransformationMethod wrapTransformationMethod(android.text.method.TransformationMethod r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal r0 = r1.mHelper
            android.text.method.TransformationMethod r0 = r0.wrapTransformationMethod(r2)
            return r0
    }
}
