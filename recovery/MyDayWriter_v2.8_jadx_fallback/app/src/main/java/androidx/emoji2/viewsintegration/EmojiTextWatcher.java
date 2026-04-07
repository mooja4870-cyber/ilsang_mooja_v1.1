package androidx.emoji2.viewsintegration;

/* JADX INFO: loaded from: classes.dex */
final class EmojiTextWatcher implements android.text.TextWatcher {
    private final android.widget.EditText mEditText;
    private int mEmojiReplaceStrategy;
    private boolean mEnabled;
    private final boolean mExpectInitializedEmojiCompat;
    private androidx.emoji2.text.EmojiCompat.InitCallback mInitCallback;
    private int mMaxEmojiCount;

    private static class InitCallbackImpl extends androidx.emoji2.text.EmojiCompat.InitCallback {
        private final java.lang.ref.Reference<android.widget.EditText> mViewRef;

        InitCallbackImpl(android.widget.EditText r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mViewRef = r0
                return
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onInitialized() {
                r2 = this;
                super.onInitialized()
                java.lang.ref.Reference<android.widget.EditText> r0 = r2.mViewRef
                java.lang.Object r0 = r0.get()
                android.widget.EditText r0 = (android.widget.EditText) r0
                r1 = 1
                androidx.emoji2.viewsintegration.EmojiTextWatcher.processTextOnEnablingEvent(r0, r1)
                return
        }
    }

    EmojiTextWatcher(android.widget.EditText r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.mMaxEmojiCount = r0
            r0 = 0
            r1.mEmojiReplaceStrategy = r0
            r1.mEditText = r2
            r1.mExpectInitializedEmojiCompat = r3
            r0 = 1
            r1.mEnabled = r0
            return
    }

    private androidx.emoji2.text.EmojiCompat.InitCallback getInitCallback() {
            r2 = this;
            androidx.emoji2.text.EmojiCompat$InitCallback r0 = r2.mInitCallback
            if (r0 != 0) goto Ld
            androidx.emoji2.viewsintegration.EmojiTextWatcher$InitCallbackImpl r0 = new androidx.emoji2.viewsintegration.EmojiTextWatcher$InitCallbackImpl
            android.widget.EditText r1 = r2.mEditText
            r0.<init>(r1)
            r2.mInitCallback = r0
        Ld:
            androidx.emoji2.text.EmojiCompat$InitCallback r0 = r2.mInitCallback
            return r0
    }

    static void processTextOnEnablingEvent(android.widget.EditText r4, int r5) {
            r0 = 1
            if (r5 != r0) goto L21
            if (r4 == 0) goto L21
            boolean r0 = r4.isAttachedToWindow()
            if (r0 == 0) goto L21
            android.text.Editable r0 = r4.getEditableText()
            int r1 = android.text.Selection.getSelectionStart(r0)
            int r2 = android.text.Selection.getSelectionEnd(r0)
            androidx.emoji2.text.EmojiCompat r3 = androidx.emoji2.text.EmojiCompat.get()
            r3.process(r0)
            androidx.emoji2.viewsintegration.EmojiInputFilter.updateSelection(r0, r1, r2)
        L21:
            return
    }

    private boolean shouldSkipForDisabledOrNotConfigured() {
            r1 = this;
            boolean r0 = r1.mEnabled
            if (r0 == 0) goto L11
            boolean r0 = r1.mExpectInitializedEmojiCompat
            if (r0 != 0) goto Lf
            boolean r0 = androidx.emoji2.text.EmojiCompat.isConfigured()
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable r1) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    int getEmojiReplaceStrategy() {
            r1 = this;
            int r0 = r1.mEmojiReplaceStrategy
            return r0
    }

    int getMaxEmojiCount() {
            r1 = this;
            int r0 = r1.mMaxEmojiCount
            return r0
    }

    public boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.mEnabled
            return r0
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence r8, int r9, int r10, int r11) {
            r7 = this;
            android.widget.EditText r0 = r7.mEditText
            boolean r0 = r0.isInEditMode()
            if (r0 != 0) goto L44
            boolean r0 = r7.shouldSkipForDisabledOrNotConfigured()
            if (r0 == 0) goto L10
            r3 = r9
            goto L45
        L10:
            if (r10 > r11) goto L42
            boolean r0 = r8 instanceof android.text.Spannable
            if (r0 == 0) goto L42
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.get()
            int r0 = r0.getLoadState()
            switch(r0) {
                case 0: goto L35;
                case 1: goto L23;
                case 2: goto L21;
                case 3: goto L35;
                default: goto L21;
            }
        L21:
            r3 = r9
            goto L43
        L23:
            r2 = r8
            android.text.Spannable r2 = (android.text.Spannable) r2
            androidx.emoji2.text.EmojiCompat r1 = androidx.emoji2.text.EmojiCompat.get()
            int r4 = r9 + r11
            int r5 = r7.mMaxEmojiCount
            int r6 = r7.mEmojiReplaceStrategy
            r3 = r9
            r1.process(r2, r3, r4, r5, r6)
            goto L43
        L35:
            r3 = r9
            androidx.emoji2.text.EmojiCompat r9 = androidx.emoji2.text.EmojiCompat.get()
            androidx.emoji2.text.EmojiCompat$InitCallback r0 = r7.getInitCallback()
            r9.registerInitCallback(r0)
            goto L43
        L42:
            r3 = r9
        L43:
            return
        L44:
            r3 = r9
        L45:
            return
    }

    void setEmojiReplaceStrategy(int r1) {
            r0 = this;
            r0.mEmojiReplaceStrategy = r1
            return
    }

    public void setEnabled(boolean r3) {
            r2 = this;
            boolean r0 = r2.mEnabled
            if (r0 == r3) goto L24
            androidx.emoji2.text.EmojiCompat$InitCallback r0 = r2.mInitCallback
            if (r0 == 0) goto L11
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.get()
            androidx.emoji2.text.EmojiCompat$InitCallback r1 = r2.mInitCallback
            r0.unregisterInitCallback(r1)
        L11:
            r2.mEnabled = r3
            boolean r0 = r2.mEnabled
            if (r0 == 0) goto L24
            android.widget.EditText r0 = r2.mEditText
            androidx.emoji2.text.EmojiCompat r1 = androidx.emoji2.text.EmojiCompat.get()
            int r1 = r1.getLoadState()
            processTextOnEnablingEvent(r0, r1)
        L24:
            return
    }

    void setMaxEmojiCount(int r1) {
            r0 = this;
            r0.mMaxEmojiCount = r1
            return
    }
}
