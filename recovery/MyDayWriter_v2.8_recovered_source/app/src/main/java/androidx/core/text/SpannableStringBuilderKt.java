package androidx.core.text;

/* JADX INFO: compiled from: SpannableStringBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b\u001a?\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b¢\u0006\u0002\u0010\u000b\u001a.\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b\u001a&\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b\u001a&\u0010\u000e\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b\u001a&\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b\u001a0\u0010\u0010\u001a\u00020\u0004*\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00112\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b\u001a0\u0010\u0012\u001a\u00020\u0004*\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00112\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b\u001a&\u0010\u0013\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b\u001a.\u0010\u0014\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b\u001a&\u0010\u0017\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b\u001a&\u0010\u0018\u001a\u00020\u0004*\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b¨\u0006\u0019"}, d2 = {"buildSpannedString", "Landroid/text/SpannedString;", "builderAction", "Lkotlin/Function1;", "Landroid/text/SpannableStringBuilder;", "", "Lkotlin/ExtensionFunctionType;", "inSpans", "spans", "", "", "(Landroid/text/SpannableStringBuilder;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Landroid/text/SpannableStringBuilder;", "span", "bold", "italic", "underline", "color", "", "backgroundColor", "strikeThrough", "scale", "proportion", "", "superscript", "subscript", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SpannableStringBuilderKt {
    public static final android.text.SpannableStringBuilder backgroundColor(android.text.SpannableStringBuilder r7, int r8, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r9) {
            r0 = 0
            android.text.style.BackgroundColorSpan r1 = new android.text.style.BackgroundColorSpan
            r1.<init>(r8)
            r2 = r7
            r3 = 0
            int r4 = r2.length()
            r9.invoke(r2)
            int r5 = r2.length()
            r6 = 17
            r2.setSpan(r1, r4, r5, r6)
            return r2
    }

    public static final android.text.SpannableStringBuilder bold(android.text.SpannableStringBuilder r7, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r8) {
            r0 = 0
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r2 = 1
            r1.<init>(r2)
            r2 = r7
            r3 = 0
            int r4 = r2.length()
            r8.invoke(r2)
            int r5 = r2.length()
            r6 = 17
            r2.setSpan(r1, r4, r5, r6)
            return r2
    }

    public static final android.text.SpannedString buildSpannedString(kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r4) {
            r0 = 0
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            r4.invoke(r1)
            android.text.SpannedString r2 = new android.text.SpannedString
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.<init>(r3)
            return r2
    }

    public static final android.text.SpannableStringBuilder color(android.text.SpannableStringBuilder r7, int r8, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r9) {
            r0 = 0
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r8)
            r2 = r7
            r3 = 0
            int r4 = r2.length()
            r9.invoke(r2)
            int r5 = r2.length()
            r6 = 17
            r2.setSpan(r1, r4, r5, r6)
            return r2
    }

    public static final android.text.SpannableStringBuilder inSpans(android.text.SpannableStringBuilder r4, java.lang.Object r5, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r6) {
            r0 = 0
            int r1 = r4.length()
            r6.invoke(r4)
            int r2 = r4.length()
            r3 = 17
            r4.setSpan(r5, r1, r2, r3)
            return r4
    }

    public static final android.text.SpannableStringBuilder inSpans(android.text.SpannableStringBuilder r7, java.lang.Object[] r8, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r9) {
            r0 = 0
            int r1 = r7.length()
            r9.invoke(r7)
            int r2 = r8.length
            r3 = 0
        La:
            if (r3 >= r2) goto L1a
            r4 = r8[r3]
            int r5 = r7.length()
            r6 = 17
            r7.setSpan(r4, r1, r5, r6)
            int r3 = r3 + 1
            goto La
        L1a:
            return r7
    }

    public static final android.text.SpannableStringBuilder italic(android.text.SpannableStringBuilder r7, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r8) {
            r0 = 0
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r2 = 2
            r1.<init>(r2)
            r2 = r7
            r3 = 0
            int r4 = r2.length()
            r8.invoke(r2)
            int r5 = r2.length()
            r6 = 17
            r2.setSpan(r1, r4, r5, r6)
            return r2
    }

    public static final android.text.SpannableStringBuilder scale(android.text.SpannableStringBuilder r7, float r8, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r9) {
            r0 = 0
            android.text.style.RelativeSizeSpan r1 = new android.text.style.RelativeSizeSpan
            r1.<init>(r8)
            r2 = r7
            r3 = 0
            int r4 = r2.length()
            r9.invoke(r2)
            int r5 = r2.length()
            r6 = 17
            r2.setSpan(r1, r4, r5, r6)
            return r2
    }

    public static final android.text.SpannableStringBuilder strikeThrough(android.text.SpannableStringBuilder r7, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r8) {
            r0 = 0
            android.text.style.StrikethroughSpan r1 = new android.text.style.StrikethroughSpan
            r1.<init>()
            r2 = r7
            r3 = 0
            int r4 = r2.length()
            r8.invoke(r2)
            int r5 = r2.length()
            r6 = 17
            r2.setSpan(r1, r4, r5, r6)
            return r2
    }

    public static final android.text.SpannableStringBuilder subscript(android.text.SpannableStringBuilder r7, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r8) {
            r0 = 0
            android.text.style.SubscriptSpan r1 = new android.text.style.SubscriptSpan
            r1.<init>()
            r2 = r7
            r3 = 0
            int r4 = r2.length()
            r8.invoke(r2)
            int r5 = r2.length()
            r6 = 17
            r2.setSpan(r1, r4, r5, r6)
            return r2
    }

    public static final android.text.SpannableStringBuilder superscript(android.text.SpannableStringBuilder r7, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r8) {
            r0 = 0
            android.text.style.SuperscriptSpan r1 = new android.text.style.SuperscriptSpan
            r1.<init>()
            r2 = r7
            r3 = 0
            int r4 = r2.length()
            r8.invoke(r2)
            int r5 = r2.length()
            r6 = 17
            r2.setSpan(r1, r4, r5, r6)
            return r2
    }

    public static final android.text.SpannableStringBuilder underline(android.text.SpannableStringBuilder r7, kotlin.jvm.functions.Function1<? super android.text.SpannableStringBuilder, kotlin.Unit> r8) {
            r0 = 0
            android.text.style.UnderlineSpan r1 = new android.text.style.UnderlineSpan
            r1.<init>()
            r2 = r7
            r3 = 0
            int r4 = r2.length()
            r8.invoke(r2)
            int r5 = r2.length()
            r6 = 17
            r2.setSpan(r1, r4, r5, r6)
            return r2
    }
}
