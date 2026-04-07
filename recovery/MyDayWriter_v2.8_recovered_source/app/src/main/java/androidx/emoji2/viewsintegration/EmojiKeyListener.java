package androidx.emoji2.viewsintegration;

/* JADX INFO: loaded from: classes.dex */
final class EmojiKeyListener implements android.text.method.KeyListener {
    private final androidx.emoji2.viewsintegration.EmojiKeyListener.EmojiCompatHandleKeyDownHelper mEmojiCompatHandleKeyDownHelper;
    private final android.text.method.KeyListener mKeyListener;

    public static class EmojiCompatHandleKeyDownHelper {
        public EmojiCompatHandleKeyDownHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean handleKeyDown(android.text.Editable r2, int r3, android.view.KeyEvent r4) {
                r1 = this;
                boolean r0 = androidx.emoji2.text.EmojiCompat.handleOnKeyDown(r2, r3, r4)
                return r0
        }
    }

    EmojiKeyListener(android.text.method.KeyListener r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiKeyListener$EmojiCompatHandleKeyDownHelper r0 = new androidx.emoji2.viewsintegration.EmojiKeyListener$EmojiCompatHandleKeyDownHelper
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    EmojiKeyListener(android.text.method.KeyListener r1, androidx.emoji2.viewsintegration.EmojiKeyListener.EmojiCompatHandleKeyDownHelper r2) {
            r0 = this;
            r0.<init>()
            r0.mKeyListener = r1
            r0.mEmojiCompatHandleKeyDownHelper = r2
            return
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(android.view.View r2, android.text.Editable r3, int r4) {
            r1 = this;
            android.text.method.KeyListener r0 = r1.mKeyListener
            r0.clearMetaKeyState(r2, r3, r4)
            return
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
            r1 = this;
            android.text.method.KeyListener r0 = r1.mKeyListener
            int r0 = r0.getInputType()
            return r0
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(android.view.View r3, android.text.Editable r4, int r5, android.view.KeyEvent r6) {
            r2 = this;
            androidx.emoji2.viewsintegration.EmojiKeyListener$EmojiCompatHandleKeyDownHelper r0 = r2.mEmojiCompatHandleKeyDownHelper
            boolean r0 = r0.handleKeyDown(r4, r5, r6)
            if (r0 != 0) goto L13
            android.text.method.KeyListener r1 = r2.mKeyListener
            boolean r1 = r1.onKeyDown(r3, r4, r5, r6)
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            return r1
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(android.view.View r2, android.text.Editable r3, android.view.KeyEvent r4) {
            r1 = this;
            android.text.method.KeyListener r0 = r1.mKeyListener
            boolean r0 = r0.onKeyOther(r2, r3, r4)
            return r0
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(android.view.View r2, android.text.Editable r3, int r4, android.view.KeyEvent r5) {
            r1 = this;
            android.text.method.KeyListener r0 = r1.mKeyListener
            boolean r0 = r0.onKeyUp(r2, r3, r4, r5)
            return r0
    }
}
