package androidx.emoji2.viewsintegration;

/* JADX INFO: loaded from: classes.dex */
class EmojiTransformationMethod implements android.text.method.TransformationMethod {
    private final android.text.method.TransformationMethod mTransformationMethod;

    EmojiTransformationMethod(android.text.method.TransformationMethod r1) {
            r0 = this;
            r0.<init>()
            r0.mTransformationMethod = r1
            return
    }

    public android.text.method.TransformationMethod getOriginalTransformationMethod() {
            r1 = this;
            android.text.method.TransformationMethod r0 = r1.mTransformationMethod
            return r0
    }

    @Override // android.text.method.TransformationMethod
    public java.lang.CharSequence getTransformation(java.lang.CharSequence r2, android.view.View r3) {
            r1 = this;
            boolean r0 = r3.isInEditMode()
            if (r0 == 0) goto L7
            return r2
        L7:
            android.text.method.TransformationMethod r0 = r1.mTransformationMethod
            if (r0 == 0) goto L11
            android.text.method.TransformationMethod r0 = r1.mTransformationMethod
            java.lang.CharSequence r2 = r0.getTransformation(r2, r3)
        L11:
            if (r2 == 0) goto L28
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.get()
            int r0 = r0.getLoadState()
            switch(r0) {
                case 1: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L28
        L1f:
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.get()
            java.lang.CharSequence r0 = r0.process(r2)
            return r0
        L28:
            return r2
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(android.view.View r8, java.lang.CharSequence r9, boolean r10, int r11, android.graphics.Rect r12) {
            r7 = this;
            android.text.method.TransformationMethod r0 = r7.mTransformationMethod
            if (r0 == 0) goto Lf
            android.text.method.TransformationMethod r1 = r7.mTransformationMethod
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.onFocusChanged(r2, r3, r4, r5, r6)
            goto L14
        Lf:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
        L14:
            return
    }
}
