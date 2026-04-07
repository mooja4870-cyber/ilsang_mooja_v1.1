package androidx.core.text;

/* JADX INFO: compiled from: SpannableString.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0001H\u0086\b\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0086\n\u001a\u001d\u0010\u0005\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0086\n¨\u0006\r"}, d2 = {"toSpannable", "Landroid/text/Spannable;", "", "clearSpans", "", "set", "start", "", "end", "span", "", "range", "Lkotlin/ranges/IntRange;", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SpannableStringKt {
    public static final void clearSpans(android.text.Spannable r8) {
            r0 = 0
            r1 = r8
            android.text.Spanned r1 = (android.text.Spanned) r1
            r2 = 0
            int r3 = r1.length()
            r4 = 0
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            java.lang.Object[] r1 = r1.getSpans(r2, r3, r5)
            r2 = 0
            int r3 = r1.length
            r4 = 0
        L16:
            if (r4 >= r3) goto L23
            r5 = r1[r4]
            r6 = r5
            r7 = 0
            r8.removeSpan(r6)
            int r4 = r4 + 1
            goto L16
        L23:
            return
    }

    public static final void set(android.text.Spannable r2, int r3, int r4, java.lang.Object r5) {
            r0 = 0
            r1 = 17
            r2.setSpan(r5, r3, r4, r1)
            return
    }

    public static final void set(android.text.Spannable r4, kotlin.ranges.IntRange r5, java.lang.Object r6) {
            r0 = 0
            java.lang.Integer r1 = r5.getStart()
            int r1 = r1.intValue()
            java.lang.Integer r2 = r5.getEndInclusive()
            int r2 = r2.intValue()
            r3 = 17
            r4.setSpan(r6, r1, r2, r3)
            return
    }

    public static final android.text.Spannable toSpannable(java.lang.CharSequence r2) {
            r0 = 0
            android.text.SpannableString r1 = android.text.SpannableString.valueOf(r2)
            android.text.Spannable r1 = (android.text.Spannable) r1
            return r1
    }
}
