package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
final class AppCompatTextClassifierHelper {
    private android.view.textclassifier.TextClassifier mTextClassifier;
    private android.widget.TextView mTextView;

    private static final class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.textclassifier.TextClassifier getTextClassifier(android.widget.TextView r2) {
                android.content.Context r0 = r2.getContext()
                java.lang.Class<android.view.textclassifier.TextClassificationManager> r1 = android.view.textclassifier.TextClassificationManager.class
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.textclassifier.TextClassificationManager r0 = (android.view.textclassifier.TextClassificationManager) r0
                if (r0 == 0) goto L14
                android.view.textclassifier.TextClassifier r1 = r0.getTextClassifier()
                return r1
            L14:
                android.view.textclassifier.TextClassifier r1 = android.view.textclassifier.TextClassifier.NO_OP
                return r1
        }
    }

    AppCompatTextClassifierHelper(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.mTextView = r0
            return
    }

    public android.view.textclassifier.TextClassifier getTextClassifier() {
            r1 = this;
            android.view.textclassifier.TextClassifier r0 = r1.mTextClassifier
            if (r0 != 0) goto Lb
            android.widget.TextView r0 = r1.mTextView
            android.view.textclassifier.TextClassifier r0 = androidx.appcompat.widget.AppCompatTextClassifierHelper.Api26Impl.getTextClassifier(r0)
            return r0
        Lb:
            android.view.textclassifier.TextClassifier r0 = r1.mTextClassifier
            return r0
    }

    public void setTextClassifier(android.view.textclassifier.TextClassifier r1) {
            r0 = this;
            r0.mTextClassifier = r1
            return
    }
}
