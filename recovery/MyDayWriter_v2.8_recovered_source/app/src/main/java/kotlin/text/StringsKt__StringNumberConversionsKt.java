package kotlin.text;

/* JADX INFO: compiled from: StringNumberConversions.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000b\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\f\u001a\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0013\u001a\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"numberFormatError", "", "input", "", "toByteOrNull", "", "(Ljava/lang/String;)Ljava/lang/Byte;", "radix", "", "(Ljava/lang/String;I)Ljava/lang/Byte;", "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "(Ljava/lang/String;I)Ljava/lang/Integer;", "toLongOrNull", "", "(Ljava/lang/String;)Ljava/lang/Long;", "(Ljava/lang/String;I)Ljava/lang/Long;", "toShortOrNull", "", "(Ljava/lang/String;)Ljava/lang/Short;", "(Ljava/lang/String;I)Ljava/lang/Short;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
class StringsKt__StringNumberConversionsKt extends kotlin.text.StringsKt__StringNumberConversionsJVMKt {
    public StringsKt__StringNumberConversionsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final java.lang.Void numberFormatError(java.lang.String r3) {
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid number format: '"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            r2 = 39
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final java.lang.Byte toByteOrNull(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            java.lang.Byte r0 = kotlin.text.StringsKt.toByteOrNull(r1, r0)
            return r0
    }

    public static final java.lang.Byte toByteOrNull(java.lang.String r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Integer r0 = kotlin.text.StringsKt.toIntOrNull(r3, r4)
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.intValue()
            r2 = -128(0xffffffffffffff80, float:NaN)
            if (r0 < r2) goto L1f
            r2 = 127(0x7f, float:1.78E-43)
            if (r0 <= r2) goto L19
            goto L1f
        L19:
            byte r1 = (byte) r0
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
        L1f:
            return r1
        L20:
            return r1
    }

    public static final java.lang.Integer toIntOrNull(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            java.lang.Integer r0 = kotlin.text.StringsKt.toIntOrNull(r1, r0)
            return r0
    }

    public static final java.lang.Integer toIntOrNull(java.lang.String r12, int r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            kotlin.text.CharsKt.checkRadix(r13)
            int r0 = r12.length()
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            char r5 = r12.charAt(r5)
            r6 = 48
            int r6 = kotlin.jvm.internal.Intrinsics.compare(r5, r6)
            if (r6 >= 0) goto L32
            r6 = 1
            if (r0 != r6) goto L24
            return r1
        L24:
            r2 = 1
            switch(r5) {
                case 43: goto L2d;
                case 44: goto L28;
                case 45: goto L29;
                default: goto L28;
            }
        L28:
            return r1
        L29:
            r3 = 1
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L37
        L2d:
            r3 = 0
            r4 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            goto L37
        L32:
            r2 = 0
            r3 = 0
            r4 = -2147483647(0xffffffff80000001, float:-1.4E-45)
        L37:
            r6 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r7 = r6
            r8 = 0
            r9 = r2
        L3d:
            if (r9 >= r0) goto L5e
            char r10 = r12.charAt(r9)
            int r10 = kotlin.text.CharsKt.digitOf(r10, r13)
            if (r10 >= 0) goto L4a
            return r1
        L4a:
            if (r8 >= r7) goto L54
            if (r7 != r6) goto L53
            int r7 = r4 / r13
            if (r8 >= r7) goto L54
            return r1
        L53:
            return r1
        L54:
            int r8 = r8 * r13
            int r11 = r4 + r10
            if (r8 >= r11) goto L5a
            return r1
        L5a:
            int r8 = r8 - r10
            int r9 = r9 + 1
            goto L3d
        L5e:
            if (r3 == 0) goto L65
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            goto L6a
        L65:
            int r1 = -r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L6a:
            return r1
    }

    public static final java.lang.Long toLongOrNull(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            java.lang.Long r0 = kotlin.text.StringsKt.toLongOrNull(r1, r0)
            return r0
    }

    public static final java.lang.Long toLongOrNull(java.lang.String r19, int r20) {
            r0 = r19
            r1 = r20
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            kotlin.text.CharsKt.checkRadix(r1)
            int r2 = r0.length()
            r3 = 0
            if (r2 != 0) goto L14
            return r3
        L14:
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            char r8 = r0.charAt(r8)
            r9 = 48
            int r9 = kotlin.jvm.internal.Intrinsics.compare(r8, r9)
            if (r9 >= 0) goto L39
            r9 = 1
            if (r2 != r9) goto L29
            return r3
        L29:
            r4 = 1
            switch(r8) {
                case 43: goto L32;
                case 44: goto L2d;
                case 45: goto L2e;
                default: goto L2d;
            }
        L2d:
            return r3
        L2e:
            r5 = 1
            r6 = -9223372036854775808
            goto L40
        L32:
            r5 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L40
        L39:
            r4 = 0
            r5 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L40:
            r9 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r11 = r9
            r13 = 0
            r15 = r4
        L49:
            if (r15 >= r2) goto L87
            r16 = r3
            char r3 = r0.charAt(r15)
            int r3 = kotlin.text.CharsKt.digitOf(r3, r1)
            if (r3 >= 0) goto L58
            return r16
        L58:
            int r17 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r17 >= 0) goto L6f
            int r17 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r17 != 0) goto L6e
            r17 = r4
            r18 = r5
            long r4 = (long) r1
            long r4 = r6 / r4
            int r11 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r11 >= 0) goto L6c
            return r16
        L6c:
            r11 = r4
            goto L73
        L6e:
            return r16
        L6f:
            r17 = r4
            r18 = r5
        L73:
            long r4 = (long) r1
            long r13 = r13 * r4
            long r4 = (long) r3
            long r4 = r4 + r6
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 >= 0) goto L7c
            return r16
        L7c:
            long r4 = (long) r3
            long r13 = r13 - r4
            int r15 = r15 + 1
            r3 = r16
            r4 = r17
            r5 = r18
            goto L49
        L87:
            r17 = r4
            r18 = r5
            if (r18 == 0) goto L92
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            goto L97
        L92:
            long r3 = -r13
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L97:
            return r3
    }

    public static final java.lang.Short toShortOrNull(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            java.lang.Short r0 = kotlin.text.StringsKt.toShortOrNull(r1, r0)
            return r0
    }

    public static final java.lang.Short toShortOrNull(java.lang.String r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Integer r0 = kotlin.text.StringsKt.toIntOrNull(r3, r4)
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.intValue()
            r2 = -32768(0xffffffffffff8000, float:NaN)
            if (r0 < r2) goto L1f
            r2 = 32767(0x7fff, float:4.5916E-41)
            if (r0 <= r2) goto L19
            goto L1f
        L19:
            short r1 = (short) r0
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            return r1
        L1f:
            return r1
        L20:
            return r1
    }
}
