package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatHintHelper {
    private AppCompatHintHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.InputConnection r2, android.view.inputmethod.EditorInfo r3, android.view.View r4) {
            if (r2 == 0) goto L21
            java.lang.CharSequence r0 = r3.hintText
            if (r0 != 0) goto L21
            android.view.ViewParent r0 = r4.getParent()
        La:
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L21
            boolean r1 = r0 instanceof androidx.appcompat.widget.WithHint
            if (r1 == 0) goto L1c
            r1 = r0
            androidx.appcompat.widget.WithHint r1 = (androidx.appcompat.widget.WithHint) r1
            java.lang.CharSequence r1 = r1.getHint()
            r3.hintText = r1
            goto L21
        L1c:
            android.view.ViewParent r0 = r0.getParent()
            goto La
        L21:
            return r2
    }
}
