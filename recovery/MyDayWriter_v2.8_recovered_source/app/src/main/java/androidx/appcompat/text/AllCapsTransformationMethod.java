package androidx.appcompat.text;

/* JADX INFO: loaded from: classes.dex */
public class AllCapsTransformationMethod implements android.text.method.TransformationMethod {
    private java.util.Locale mLocale;

    public AllCapsTransformationMethod(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            r1.mLocale = r0
            return
    }

    @Override // android.text.method.TransformationMethod
    public java.lang.CharSequence getTransformation(java.lang.CharSequence r3, android.view.View r4) {
            r2 = this;
            if (r3 == 0) goto Ld
            java.lang.String r0 = r3.toString()
            java.util.Locale r1 = r2.mLocale
            java.lang.String r0 = r0.toUpperCase(r1)
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(android.view.View r1, java.lang.CharSequence r2, boolean r3, int r4, android.graphics.Rect r5) {
            r0 = this;
            return
    }
}
