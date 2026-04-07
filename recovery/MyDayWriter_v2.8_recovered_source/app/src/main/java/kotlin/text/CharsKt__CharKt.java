package kotlin.text;

/* JADX INFO: compiled from: Char.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0002*\u00020\u0001H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0007\u001a\u001c\u0010\b\u001a\u00020\t*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\n\u0010\f\u001a\u00020\t*\u00020\u0001\u001a\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000eH\u0087\n\u001a\f\u0010\u000f\u001a\u00020\u000e*\u00020\u0001H\u0007¨\u0006\u0010"}, d2 = {"digitToChar", "", "", "radix", "digitToInt", "digitToIntOrNull", "(C)Ljava/lang/Integer;", "(CI)Ljava/lang/Integer;", "equals", "", "other", "ignoreCase", "isSurrogate", "plus", "", "titlecase", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/CharsKt")
class CharsKt__CharKt extends kotlin.text.CharsKt__CharJVMKt {
    public CharsKt__CharKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final char digitToChar(int r3) {
            r0 = 0
            if (r3 < 0) goto L8
            r1 = 10
            if (r3 >= r1) goto L8
            r0 = 1
        L8:
            if (r0 == 0) goto Le
            int r0 = r3 + 48
            char r0 = (char) r0
            return r0
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Int "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " is not a decimal digit"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final char digitToChar(int r3, int r4) {
            r0 = 2
            r1 = 0
            if (r0 > r4) goto L9
            r0 = 37
            if (r4 >= r0) goto L9
            r1 = 1
        L9:
            if (r1 == 0) goto L40
            if (r3 < 0) goto L1d
            if (r3 >= r4) goto L1d
            r0 = 10
            if (r3 >= r0) goto L17
            int r0 = r3 + 48
            char r0 = (char) r0
            goto L1c
        L17:
            int r1 = r3 + 65
            char r1 = (char) r1
            int r1 = r1 - r0
            char r0 = (char) r1
        L1c:
            return r0
        L1d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Digit "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " does not represent a valid digit in radix "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L40:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid radix: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = ". Valid radix values are in range 2..36"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final int digitToInt(char r5) {
            r0 = 10
            int r0 = kotlin.text.CharsKt.digitOf(r5, r0)
            r1 = r0
            r2 = 0
            if (r1 < 0) goto Lc
        Lb:
            return r0
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Char "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r4 = " is not a decimal digit"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static final int digitToInt(char r3, int r4) {
            java.lang.Integer r0 = kotlin.text.CharsKt.digitToIntOrNull(r3, r4)
            if (r0 == 0) goto Lb
            int r0 = r0.intValue()
            return r0
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Char "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " is not a digit in the given radix="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final java.lang.Integer digitToIntOrNull(char r4) {
            r0 = 10
            int r0 = kotlin.text.CharsKt.digitOf(r4, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = r0
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = 0
            if (r1 < 0) goto L16
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            if (r3 == 0) goto L1a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    public static final java.lang.Integer digitToIntOrNull(char r4, int r5) {
            kotlin.text.CharsKt.checkRadix(r5)
            int r0 = kotlin.text.CharsKt.digitOf(r4, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = r0
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = 0
            if (r1 < 0) goto L17
            r3 = 1
            goto L18
        L17:
            r3 = 0
        L18:
            if (r3 == 0) goto L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
    }

    public static final boolean equals(char r6, char r7, boolean r8) {
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 != 0) goto L8
            return r1
        L8:
            char r2 = java.lang.Character.toUpperCase(r6)
            char r3 = java.lang.Character.toUpperCase(r7)
            if (r2 == r3) goto L1e
            char r4 = java.lang.Character.toLowerCase(r2)
            char r5 = java.lang.Character.toLowerCase(r3)
            if (r4 != r5) goto L1d
            goto L1e
        L1d:
            r0 = r1
        L1e:
            return r0
    }

    public static /* synthetic */ boolean equals$default(char r0, char r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = kotlin.text.CharsKt.equals(r0, r1, r2)
            return r0
    }

    public static final boolean isSurrogate(char r2) {
            r0 = 55296(0xd800, float:7.7486E-41)
            r1 = 0
            if (r0 > r2) goto Lc
            r0 = 57344(0xe000, float:8.0356E-41)
            if (r2 >= r0) goto Lc
            r1 = 1
        Lc:
            return r1
    }

    private static final java.lang.String plus(char r1, java.lang.String r2) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static final java.lang.String titlecase(char r1) {
            java.lang.String r0 = kotlin.text._OneToManyTitlecaseMappingsKt.titlecaseImpl(r1)
            return r0
    }
}
