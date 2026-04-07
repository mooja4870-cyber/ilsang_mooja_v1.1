package kotlin.uuid;

/* JADX INFO: compiled from: Uuid.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a\u0019\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0002\b\t\u001a)\u0010\n\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0002\b\u000f\u001a!\u0010\u0010\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0002\b\u0011\u001a\u0019\u0010\u0012\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0002\b\u0014¨\u0006\u0015"}, d2 = {"uuidFromRandomBytes", "Lkotlin/uuid/Uuid;", "randomBytes", "", "checkHyphenAt", "", "", "index", "", "checkHyphenAt$UuidKt__UuidKt", "formatBytesInto", "", "dst", "dstOffset", "count", "formatBytesInto$UuidKt__UuidKt", "toByteArray", "toByteArray$UuidKt__UuidKt", "toLong", "startIndex", "toLong$UuidKt__UuidKt", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
class UuidKt__UuidKt extends kotlin.uuid.UuidKt__UuidJVMKt {
    public UuidKt__UuidKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ void access$checkHyphenAt(java.lang.String r0, int r1) {
            checkHyphenAt$UuidKt__UuidKt(r0, r1)
            return
    }

    public static final /* synthetic */ void access$formatBytesInto(long r0, byte[] r2, int r3, int r4) {
            formatBytesInto$UuidKt__UuidKt(r0, r2, r3, r4)
            return
    }

    public static final /* synthetic */ void access$toByteArray(long r0, byte[] r2, int r3) {
            toByteArray$UuidKt__UuidKt(r0, r2, r3)
            return
    }

    public static final /* synthetic */ long access$toLong(byte[] r2, int r3) {
            long r0 = toLong$UuidKt__UuidKt(r2, r3)
            return r0
    }

    private static final void checkHyphenAt$UuidKt__UuidKt(java.lang.String r3, int r4) {
            char r0 = r3.charAt(r4)
            r1 = 45
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 == 0) goto Le
            return
        Le:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected '-' (hyphen) at index 8, but was "
            java.lang.StringBuilder r1 = r1.append(r2)
            char r2 = r3.charAt(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    private static final void formatBytesInto$UuidKt__UuidKt(long r9, byte[] r11, int r12, int r13) {
            r0 = 0
            r0 = r9
            r2 = 0
            int r3 = r13 * 2
            int r3 = r3 + r12
            r2 = 0
        L8:
            if (r2 >= r13) goto L29
            r4 = r2
            r5 = 0
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 & r0
            int r6 = (int) r6
            int[] r7 = kotlin.text.HexExtensionsKt.getBYTE_TO_LOWER_CASE_HEX_DIGITS()
            r7 = r7[r6]
            int r3 = r3 + (-1)
            byte r8 = (byte) r7
            r11[r3] = r8
            int r3 = r3 + (-1)
            int r8 = r7 >> 8
            byte r8 = (byte) r8
            r11[r3] = r8
            r8 = 8
            long r0 = r0 >> r8
            int r2 = r2 + 1
            goto L8
        L29:
            return
    }

    private static final void toByteArray$UuidKt__UuidKt(long r5, byte[] r7, int r8) {
            r0 = 0
        L1:
            r1 = 8
            if (r0 >= r1) goto L13
            int r2 = 7 - r0
            int r2 = r2 * r1
            int r1 = r8 + r0
            long r3 = r5 >>> r2
            int r3 = (int) r3
            byte r3 = (byte) r3
            r7[r1] = r3
            int r0 = r0 + 1
            goto L1
        L13:
            return
    }

    private static final long toLong$UuidKt__UuidKt(byte[] r7, int r8) {
            int r0 = r8 + 0
            r0 = r7[r0]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            r4 = 56
            long r0 = r0 << r4
            int r4 = r8 + 1
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 48
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 2
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 40
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 3
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 32
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 4
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 24
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 5
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 16
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 6
            r4 = r7[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 8
            long r4 = r4 << r6
            long r0 = r0 | r4
            int r4 = r8 + 7
            r4 = r7[r4]
            long r4 = (long) r4
            long r2 = r2 & r4
            long r0 = r0 | r2
            return r0
    }

    public static final kotlin.uuid.Uuid uuidFromRandomBytes(byte[] r2) {
            java.lang.String r0 = "randomBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 6
            r1 = r2[r0]
            r1 = r1 & 15
            byte r1 = (byte) r1
            r2[r0] = r1
            r1 = r2[r0]
            r1 = r1 | 64
            byte r1 = (byte) r1
            r2[r0] = r1
            r0 = 8
            r1 = r2[r0]
            r1 = r1 & 63
            byte r1 = (byte) r1
            r2[r0] = r1
            r1 = r2[r0]
            r1 = r1 | 128(0x80, float:1.8E-43)
            byte r1 = (byte) r1
            r2[r0] = r1
            kotlin.uuid.Uuid$Companion r0 = kotlin.uuid.Uuid.Companion
            kotlin.uuid.Uuid r0 = r0.fromByteArray(r2)
            return r0
    }
}
