package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatEmojiEditTextHelper {
    private final androidx.emoji2.viewsintegration.EmojiEditTextHelper mEmojiEditTextHelper;
    private final android.widget.EditText mView;

    AppCompatEmojiEditTextHelper(android.widget.EditText r3) {
            r2 = this;
            r2.<init>()
            r2.mView = r3
            androidx.emoji2.viewsintegration.EmojiEditTextHelper r0 = new androidx.emoji2.viewsintegration.EmojiEditTextHelper
            r1 = 0
            r0.<init>(r3, r1)
            r2.mEmojiEditTextHelper = r0
            return
    }

    android.text.method.KeyListener getKeyListener(android.text.method.KeyListener r2) {
            r1 = this;
            boolean r0 = r1.isEmojiCapableKeyListener(r2)
            if (r0 == 0) goto Ld
            androidx.emoji2.viewsintegration.EmojiEditTextHelper r0 = r1.mEmojiEditTextHelper
            android.text.method.KeyListener r0 = r0.getKeyListener(r2)
            return r0
        Ld:
            return r2
    }

    boolean isEmojiCapableKeyListener(android.text.method.KeyListener r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.text.method.NumberKeyListener
            r0 = r0 ^ 1
            return r0
    }

    boolean isEnabled() {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiEditTextHelper r0 = r1.mEmojiEditTextHelper
            boolean r0 = r0.isEnabled()
            return r0
    }

    void loadFromAttributes(android.util.AttributeSet r6, int r7) {
            r5 = this;
            android.widget.EditText r0 = r5.mView
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.R.styleable.AppCompatTextView
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r6, r1, r7, r2)
            r2 = 1
            int r3 = androidx.appcompat.R.styleable.AppCompatTextView_emojiCompatEnabled     // Catch: java.lang.Throwable -> L26
            boolean r3 = r1.hasValue(r3)     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L1e
            int r3 = androidx.appcompat.R.styleable.AppCompatTextView_emojiCompatEnabled     // Catch: java.lang.Throwable -> L26
            r4 = 1
            boolean r3 = r1.getBoolean(r3, r4)     // Catch: java.lang.Throwable -> L26
            r2 = r3
        L1e:
            r1.recycle()
            r5.setEnabled(r2)
            return
        L26:
            r3 = move-exception
            r1.recycle()
            throw r3
    }

    android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.InputConnection r2, android.view.inputmethod.EditorInfo r3) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiEditTextHelper r0 = r1.mEmojiEditTextHelper
            android.view.inputmethod.InputConnection r0 = r0.onCreateInputConnection(r2, r3)
            return r0
    }

    void setEnabled(boolean r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiEditTextHelper r0 = r1.mEmojiEditTextHelper
            r0.setEnabled(r2)
            return
    }
}
