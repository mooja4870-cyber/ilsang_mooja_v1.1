package androidx.emoji2.viewsintegration;

/* JADX INFO: loaded from: classes.dex */
final class EmojiInputConnection extends android.view.inputmethod.InputConnectionWrapper {
    private final androidx.emoji2.viewsintegration.EmojiInputConnection.EmojiCompatDeleteHelper mEmojiCompatDeleteHelper;
    private final android.widget.TextView mTextView;

    public static class EmojiCompatDeleteHelper {
        public EmojiCompatDeleteHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean handleDeleteSurroundingText(android.view.inputmethod.InputConnection r2, android.text.Editable r3, int r4, int r5, boolean r6) {
                r1 = this;
                boolean r0 = androidx.emoji2.text.EmojiCompat.handleDeleteSurroundingText(r2, r3, r4, r5, r6)
                return r0
        }

        public void updateEditorInfoAttrs(android.view.inputmethod.EditorInfo r2) {
                r1 = this;
                boolean r0 = androidx.emoji2.text.EmojiCompat.isConfigured()
                if (r0 == 0) goto Ld
                androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.get()
                r0.updateEditorInfo(r2)
            Ld:
                return
        }
    }

    EmojiInputConnection(android.widget.TextView r2, android.view.inputmethod.InputConnection r3, android.view.inputmethod.EditorInfo r4) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiInputConnection$EmojiCompatDeleteHelper r0 = new androidx.emoji2.viewsintegration.EmojiInputConnection$EmojiCompatDeleteHelper
            r0.<init>()
            r1.<init>(r2, r3, r4, r0)
            return
    }

    EmojiInputConnection(android.widget.TextView r2, android.view.inputmethod.InputConnection r3, android.view.inputmethod.EditorInfo r4, androidx.emoji2.viewsintegration.EmojiInputConnection.EmojiCompatDeleteHelper r5) {
            r1 = this;
            r0 = 0
            r1.<init>(r3, r0)
            r1.mTextView = r2
            r1.mEmojiCompatDeleteHelper = r5
            androidx.emoji2.viewsintegration.EmojiInputConnection$EmojiCompatDeleteHelper r0 = r1.mEmojiCompatDeleteHelper
            r0.updateEditorInfoAttrs(r4)
            return
    }

    private android.text.Editable getEditable() {
            r1 = this;
            android.widget.TextView r0 = r1.mTextView
            android.text.Editable r0 = r0.getEditableText()
            return r0
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int r7, int r8) {
            r6 = this;
            androidx.emoji2.viewsintegration.EmojiInputConnection$EmojiCompatDeleteHelper r0 = r6.mEmojiCompatDeleteHelper
            android.text.Editable r2 = r6.getEditable()
            r5 = 0
            r1 = r6
            r3 = r7
            r4 = r8
            boolean r7 = r0.handleDeleteSurroundingText(r1, r2, r3, r4, r5)
            if (r7 != 0) goto L19
            boolean r8 = super.deleteSurroundingText(r3, r4)
            if (r8 == 0) goto L17
            goto L19
        L17:
            r8 = 0
            goto L1a
        L19:
            r8 = 1
        L1a:
            return r8
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int r7, int r8) {
            r6 = this;
            androidx.emoji2.viewsintegration.EmojiInputConnection$EmojiCompatDeleteHelper r0 = r6.mEmojiCompatDeleteHelper
            android.text.Editable r2 = r6.getEditable()
            r5 = 1
            r1 = r6
            r3 = r7
            r4 = r8
            boolean r7 = r0.handleDeleteSurroundingText(r1, r2, r3, r4, r5)
            if (r7 != 0) goto L19
            boolean r8 = super.deleteSurroundingTextInCodePoints(r3, r4)
            if (r8 == 0) goto L17
            goto L19
        L17:
            r8 = 0
            goto L1a
        L19:
            r8 = 1
        L1a:
            return r8
    }
}
