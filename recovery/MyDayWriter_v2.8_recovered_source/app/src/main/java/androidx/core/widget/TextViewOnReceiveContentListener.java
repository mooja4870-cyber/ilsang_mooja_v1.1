package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class TextViewOnReceiveContentListener implements androidx.core.view.OnReceiveContentListener {
    private static final java.lang.String LOG_TAG = "ReceiveContent";

    public TextViewOnReceiveContentListener() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.CharSequence coerceToText(android.content.Context r2, android.content.ClipData.Item r3, int r4) {
            r0 = r4 & 1
            if (r0 == 0) goto L13
            java.lang.CharSequence r0 = r3.coerceToText(r2)
            boolean r1 = r0 instanceof android.text.Spanned
            if (r1 == 0) goto L11
            java.lang.String r1 = r0.toString()
            goto L12
        L11:
            r1 = r0
        L12:
            return r1
        L13:
            java.lang.CharSequence r0 = r3.coerceToStyledText(r2)
            return r0
    }

    private static void replaceSelection(android.text.Editable r5, java.lang.CharSequence r6) {
            int r0 = android.text.Selection.getSelectionStart(r5)
            int r1 = android.text.Selection.getSelectionEnd(r5)
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            int r4 = java.lang.Math.max(r0, r1)
            int r3 = java.lang.Math.max(r3, r4)
            android.text.Selection.setSelection(r5, r3)
            r5.replace(r2, r3, r6)
            return
    }

    @Override // androidx.core.view.OnReceiveContentListener
    public androidx.core.view.ContentInfoCompat onReceiveContent(android.view.View r12, androidx.core.view.ContentInfoCompat r13) {
            r11 = this;
            r0 = 3
            java.lang.String r1 = "ReceiveContent"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "onReceive: "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r13)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1f:
            int r0 = r13.getSource()
            r1 = 2
            if (r0 != r1) goto L27
            return r13
        L27:
            android.content.ClipData r1 = r13.getClip()
            int r2 = r13.getFlags()
            r3 = r12
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.CharSequence r4 = r3.getText()
            android.text.Editable r4 = (android.text.Editable) r4
            android.content.Context r5 = r3.getContext()
            r6 = 0
            r7 = 0
        L3e:
            int r8 = r1.getItemCount()
            if (r7 >= r8) goto L68
            android.content.ClipData$Item r8 = r1.getItemAt(r7)
            java.lang.CharSequence r8 = coerceToText(r5, r8, r2)
            if (r8 == 0) goto L65
            if (r6 != 0) goto L55
            replaceSelection(r4, r8)
            r6 = 1
            goto L65
        L55:
            int r9 = android.text.Selection.getSelectionEnd(r4)
            java.lang.String r10 = "\n"
            r4.insert(r9, r10)
            int r9 = android.text.Selection.getSelectionEnd(r4)
            r4.insert(r9, r8)
        L65:
            int r7 = r7 + 1
            goto L3e
        L68:
            r7 = 0
            return r7
    }
}
