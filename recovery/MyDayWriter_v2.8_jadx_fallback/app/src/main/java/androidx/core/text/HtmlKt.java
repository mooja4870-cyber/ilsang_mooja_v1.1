package androidx.core.text;

/* JADX INFO: compiled from: Html.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086\b\u001a\u0017\u0010\t\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0086\b¨\u0006\u000b"}, d2 = {"parseAsHtml", "Landroid/text/Spanned;", "", "flags", "", "imageGetter", "Landroid/text/Html$ImageGetter;", "tagHandler", "Landroid/text/Html$TagHandler;", "toHtml", "option", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HtmlKt {
    public static final android.text.Spanned parseAsHtml(java.lang.String r2, int r3, android.text.Html.ImageGetter r4, android.text.Html.TagHandler r5) {
            r0 = 0
            android.text.Spanned r1 = androidx.core.text.HtmlCompat.fromHtml(r2, r3, r4, r5)
            return r1
    }

    public static /* synthetic */ android.text.Spanned parseAsHtml$default(java.lang.String r0, int r1, android.text.Html.ImageGetter r2, android.text.Html.TagHandler r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto La
            r2 = 0
        La:
            r4 = r4 & 4
            if (r4 == 0) goto Lf
            r3 = 0
        Lf:
            r4 = 0
            android.text.Spanned r5 = androidx.core.text.HtmlCompat.fromHtml(r0, r1, r2, r3)
            return r5
    }

    public static final java.lang.String toHtml(android.text.Spanned r2, int r3) {
            r0 = 0
            java.lang.String r1 = androidx.core.text.HtmlCompat.toHtml(r2, r3)
            return r1
    }

    public static /* synthetic */ java.lang.String toHtml$default(android.text.Spanned r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r2 = 0
            java.lang.String r3 = androidx.core.text.HtmlCompat.toHtml(r0, r1)
            return r3
    }
}
