package androidx.core.text;

/* JADX INFO: loaded from: classes.dex */
public final class HtmlCompat {
    public static final int FROM_HTML_MODE_COMPACT = 63;
    public static final int FROM_HTML_MODE_LEGACY = 0;
    public static final int FROM_HTML_OPTION_USE_CSS_COLORS = 256;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_BLOCKQUOTE = 32;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_DIV = 16;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_HEADING = 2;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST = 8;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST_ITEM = 4;
    public static final int FROM_HTML_SEPARATOR_LINE_BREAK_PARAGRAPH = 1;
    public static final int TO_HTML_PARAGRAPH_LINES_CONSECUTIVE = 0;
    public static final int TO_HTML_PARAGRAPH_LINES_INDIVIDUAL = 1;

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.text.Spanned fromHtml(java.lang.String r1, int r2) {
                android.text.Spanned r0 = android.text.Html.fromHtml(r1, r2)
                return r0
        }

        static android.text.Spanned fromHtml(java.lang.String r1, int r2, android.text.Html.ImageGetter r3, android.text.Html.TagHandler r4) {
                android.text.Spanned r0 = android.text.Html.fromHtml(r1, r2, r3, r4)
                return r0
        }

        static java.lang.String toHtml(android.text.Spanned r1, int r2) {
                java.lang.String r0 = android.text.Html.toHtml(r1, r2)
                return r0
        }
    }

    private HtmlCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.text.Spanned fromHtml(java.lang.String r1, int r2) {
            android.text.Spanned r0 = androidx.core.text.HtmlCompat.Api24Impl.fromHtml(r1, r2)
            return r0
    }

    public static android.text.Spanned fromHtml(java.lang.String r1, int r2, android.text.Html.ImageGetter r3, android.text.Html.TagHandler r4) {
            android.text.Spanned r0 = androidx.core.text.HtmlCompat.Api24Impl.fromHtml(r1, r2, r3, r4)
            return r0
    }

    public static java.lang.String toHtml(android.text.Spanned r1, int r2) {
            java.lang.String r0 = androidx.core.text.HtmlCompat.Api24Impl.toHtml(r1, r2)
            return r0
    }
}
