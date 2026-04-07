package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatEmojiTextHelper {
    private final androidx.emoji2.viewsintegration.EmojiTextViewHelper mEmojiTextViewHelper;
    private final android.widget.TextView mView;

    AppCompatEmojiTextHelper(android.widget.TextView r3) {
            r2 = this;
            r2.<init>()
            r2.mView = r3
            androidx.emoji2.viewsintegration.EmojiTextViewHelper r0 = new androidx.emoji2.viewsintegration.EmojiTextViewHelper
            r1 = 0
            r0.<init>(r3, r1)
            r2.mEmojiTextViewHelper = r0
            return
    }

    android.text.InputFilter[] getFilters(android.text.InputFilter[] r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper r0 = r1.mEmojiTextViewHelper
            android.text.InputFilter[] r0 = r0.getFilters(r2)
            return r0
    }

    public boolean isEnabled() {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper r0 = r1.mEmojiTextViewHelper
            boolean r0 = r0.isEnabled()
            return r0
    }

    void loadFromAttributes(android.util.AttributeSet r6, int r7) {
            r5 = this;
            android.widget.TextView r0 = r5.mView
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

    void setAllCaps(boolean r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper r0 = r1.mEmojiTextViewHelper
            r0.setAllCaps(r2)
            return
    }

    void setEnabled(boolean r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper r0 = r1.mEmojiTextViewHelper
            r0.setEnabled(r2)
            return
    }

    public android.text.method.TransformationMethod wrapTransformationMethod(android.text.method.TransformationMethod r2) {
            r1 = this;
            androidx.emoji2.viewsintegration.EmojiTextViewHelper r0 = r1.mEmojiTextViewHelper
            android.text.method.TransformationMethod r0 = r0.wrapTransformationMethod(r2)
            return r0
    }
}
