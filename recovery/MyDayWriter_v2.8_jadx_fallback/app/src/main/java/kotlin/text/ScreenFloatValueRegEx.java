package kotlin.text;

/* JADX INFO: compiled from: StringNumberConversionsJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/text/ScreenFloatValueRegEx;", "", "()V", "value", "Lkotlin/text/Regex;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ScreenFloatValueRegEx {
    public static final kotlin.text.ScreenFloatValueRegEx INSTANCE = null;
    public static final kotlin.text.Regex value = null;

    static {
            kotlin.text.ScreenFloatValueRegEx r0 = new kotlin.text.ScreenFloatValueRegEx
            r0.<init>()
            kotlin.text.ScreenFloatValueRegEx.INSTANCE = r0
            kotlin.text.ScreenFloatValueRegEx r0 = kotlin.text.ScreenFloatValueRegEx.INSTANCE
            r1 = 0
            java.lang.String r2 = "(\\p{Digit}+)"
            java.lang.String r3 = "(\\p{XDigit}+)"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[eE][+-]?"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "(0[xX]"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.String r6 = "(\\.)?)|(0[xX]"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.String r6 = "?(\\.)"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r3)
            r6 = 41
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = 40
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.String r8 = "(\\.)?("
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.String r8 = "?)("
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r4)
            java.lang.String r8 = ")?)|(\\.("
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.String r8 = ")("
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r4)
            java.lang.String r8 = ")?)|(("
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.String r8 = ")[pP][+-]?"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[\\x00-\\x20]*[+-]?(NaN|Infinity|(("
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r6)
            java.lang.String r8 = ")[fFdD]?))[\\x00-\\x20]*"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            kotlin.text.Regex r8 = new kotlin.text.Regex
            r8.<init>(r7)
            kotlin.text.ScreenFloatValueRegEx.value = r8
            return
    }

    private ScreenFloatValueRegEx() {
            r0 = this;
            r0.<init>()
            return
    }
}
