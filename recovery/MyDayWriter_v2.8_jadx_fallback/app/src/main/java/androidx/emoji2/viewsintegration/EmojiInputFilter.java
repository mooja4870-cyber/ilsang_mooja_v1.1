package androidx.emoji2.viewsintegration;

/* JADX INFO: loaded from: classes.dex */
final class EmojiInputFilter implements android.text.InputFilter {
    private androidx.emoji2.text.EmojiCompat.InitCallback mInitCallback;
    private final android.widget.TextView mTextView;

    private static class InitCallbackImpl extends androidx.emoji2.text.EmojiCompat.InitCallback {
        private final java.lang.ref.Reference<androidx.emoji2.viewsintegration.EmojiInputFilter> mEmojiInputFilterReference;
        private final java.lang.ref.Reference<android.widget.TextView> mViewRef;

        InitCallbackImpl(android.widget.TextView r2, androidx.emoji2.viewsintegration.EmojiInputFilter r3) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mViewRef = r0
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r3)
                r1.mEmojiInputFilterReference = r0
                return
        }

        private boolean isInputFilterCurrentlyRegisteredOnTextView(android.widget.TextView r5, android.text.InputFilter r6) {
                r4 = this;
                r0 = 0
                if (r6 == 0) goto L1b
                if (r5 != 0) goto L6
                goto L1b
            L6:
                android.text.InputFilter[] r1 = r5.getFilters()
                if (r1 != 0) goto Ld
                return r0
            Ld:
                r2 = 0
            Le:
                int r3 = r1.length
                if (r2 >= r3) goto L1a
                r3 = r1[r2]
                if (r3 != r6) goto L17
                r0 = 1
                return r0
            L17:
                int r2 = r2 + 1
                goto Le
            L1a:
                return r0
            L1b:
                return r0
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onInitialized() {
                r7 = this;
                super.onInitialized()
                java.lang.ref.Reference<android.widget.TextView> r0 = r7.mViewRef
                java.lang.Object r0 = r0.get()
                android.widget.TextView r0 = (android.widget.TextView) r0
                java.lang.ref.Reference<androidx.emoji2.viewsintegration.EmojiInputFilter> r1 = r7.mEmojiInputFilterReference
                java.lang.Object r1 = r1.get()
                android.text.InputFilter r1 = (android.text.InputFilter) r1
                boolean r2 = r7.isInputFilterCurrentlyRegisteredOnTextView(r0, r1)
                if (r2 != 0) goto L1a
                return
            L1a:
                boolean r2 = r0.isAttachedToWindow()
                if (r2 == 0) goto L44
                java.lang.CharSequence r2 = r0.getText()
                androidx.emoji2.text.EmojiCompat r3 = androidx.emoji2.text.EmojiCompat.get()
                java.lang.CharSequence r3 = r3.process(r2)
                if (r2 != r3) goto L2f
                return
            L2f:
                int r4 = android.text.Selection.getSelectionStart(r3)
                int r5 = android.text.Selection.getSelectionEnd(r3)
                r0.setText(r3)
                boolean r6 = r3 instanceof android.text.Spannable
                if (r6 == 0) goto L44
                r6 = r3
                android.text.Spannable r6 = (android.text.Spannable) r6
                androidx.emoji2.viewsintegration.EmojiInputFilter.updateSelection(r6, r4, r5)
            L44:
                return
        }
    }

    EmojiInputFilter(android.widget.TextView r1) {
            r0 = this;
            r0.<init>()
            r0.mTextView = r1
            return
    }

    private androidx.emoji2.text.EmojiCompat.InitCallback getInitCallback() {
            r2 = this;
            androidx.emoji2.text.EmojiCompat$InitCallback r0 = r2.mInitCallback
            if (r0 != 0) goto Ld
            androidx.emoji2.viewsintegration.EmojiInputFilter$InitCallbackImpl r0 = new androidx.emoji2.viewsintegration.EmojiInputFilter$InitCallbackImpl
            android.widget.TextView r1 = r2.mTextView
            r0.<init>(r1, r2)
            r2.mInitCallback = r0
        Ld:
            androidx.emoji2.text.EmojiCompat$InitCallback r0 = r2.mInitCallback
            return r0
    }

    static void updateSelection(android.text.Spannable r0, int r1, int r2) {
            if (r1 < 0) goto L8
            if (r2 < 0) goto L8
            android.text.Selection.setSelection(r0, r1, r2)
            goto L13
        L8:
            if (r1 < 0) goto Le
            android.text.Selection.setSelection(r0, r1)
            goto L13
        Le:
            if (r2 < 0) goto L13
            android.text.Selection.setSelection(r0, r2)
        L13:
            return
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence r6, int r7, int r8, android.text.Spanned r9, int r10, int r11) {
            r5 = this;
            android.widget.TextView r0 = r5.mTextView
            boolean r0 = r0.isInEditMode()
            if (r0 == 0) goto L9
            return r6
        L9:
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.get()
            int r0 = r0.getLoadState()
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L15;
                case 2: goto L14;
                case 3: goto L4a;
                default: goto L14;
            }
        L14:
            return r6
        L15:
            r0 = 1
            if (r11 != 0) goto L29
            if (r10 != 0) goto L29
            int r1 = r9.length()
            if (r1 != 0) goto L29
            android.widget.TextView r1 = r5.mTextView
            java.lang.CharSequence r1 = r1.getText()
            if (r6 != r1) goto L29
            r0 = 0
        L29:
            if (r0 == 0) goto L49
            if (r6 == 0) goto L49
            if (r7 != 0) goto L37
            int r1 = r6.length()
            if (r8 != r1) goto L37
            r1 = r6
            goto L3b
        L37:
            java.lang.CharSequence r1 = r6.subSequence(r7, r8)
        L3b:
            androidx.emoji2.text.EmojiCompat r2 = androidx.emoji2.text.EmojiCompat.get()
            r3 = 0
            int r4 = r1.length()
            java.lang.CharSequence r2 = r2.process(r1, r3, r4)
            return r2
        L49:
            return r6
        L4a:
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.get()
            androidx.emoji2.text.EmojiCompat$InitCallback r1 = r5.getInitCallback()
            r0.registerInitCallback(r1)
            return r6
    }
}
