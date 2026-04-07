package kotlin.text;

/* JADX INFO: compiled from: UHexExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\b\u001a\u001c\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u000b\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u000e\u001a\u001c\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0011\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a2\u0010\u0012\u001a\u00020\u0002*\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"hexToUByte", "Lkotlin/UByte;", "", "format", "Lkotlin/text/HexFormat;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)B", "hexToUByteArray", "Lkotlin/UByteArray;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)[B", "hexToUInt", "Lkotlin/UInt;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)I", "hexToULong", "Lkotlin/ULong;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)J", "hexToUShort", "Lkotlin/UShort;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)S", "toHexString", "toHexString-ZQbaR00", "(BLkotlin/text/HexFormat;)Ljava/lang/String;", "startIndex", "", "endIndex", "toHexString-lZCiFrA", "([BIILkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString-zHuV2wU", "([BLkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString-8M7LxHw", "(ILkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString-8UJCm-I", "(JLkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString-r3ox_E0", "(SLkotlin/text/HexFormat;)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class UHexExtensionsKt {
    private static final byte hexToUByte(java.lang.String r1, kotlin.text.HexFormat r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte r0 = kotlin.text.HexExtensionsKt.hexToByte(r1, r2)
            byte r0 = kotlin.UByte.m171constructorimpl(r0)
            return r0
    }

    static /* synthetic */ byte hexToUByte$default(java.lang.String r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r2 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r2.getDefault()
        La:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            byte r2 = kotlin.text.HexExtensionsKt.hexToByte(r0, r1)
            byte r2 = kotlin.UByte.m171constructorimpl(r2)
            return r2
    }

    private static final byte[] hexToUByteArray(java.lang.String r1, kotlin.text.HexFormat r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r0 = kotlin.text.HexExtensionsKt.hexToByteArray(r1, r2)
            byte[] r0 = kotlin.UByteArray.m224constructorimpl(r0)
            return r0
    }

    static /* synthetic */ byte[] hexToUByteArray$default(java.lang.String r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r2 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r2.getDefault()
        La:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            byte[] r2 = kotlin.text.HexExtensionsKt.hexToByteArray(r0, r1)
            byte[] r2 = kotlin.UByteArray.m224constructorimpl(r2)
            return r2
    }

    private static final int hexToUInt(java.lang.String r1, kotlin.text.HexFormat r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = kotlin.text.HexExtensionsKt.hexToInt(r1, r2)
            int r0 = kotlin.UInt.m248constructorimpl(r0)
            return r0
    }

    static /* synthetic */ int hexToUInt$default(java.lang.String r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r2 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r2.getDefault()
        La:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            int r2 = kotlin.text.HexExtensionsKt.hexToInt(r0, r1)
            int r2 = kotlin.UInt.m248constructorimpl(r2)
            return r2
    }

    private static final long hexToULong(java.lang.String r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            long r0 = kotlin.text.HexExtensionsKt.hexToLong(r2, r3)
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            return r0
    }

    static /* synthetic */ long hexToULong$default(java.lang.String r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r2 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r2.getDefault()
        La:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            long r2 = kotlin.text.HexExtensionsKt.hexToLong(r0, r1)
            long r2 = kotlin.ULong.m327constructorimpl(r2)
            return r2
    }

    private static final short hexToUShort(java.lang.String r1, kotlin.text.HexFormat r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            short r0 = kotlin.text.HexExtensionsKt.hexToShort(r1, r2)
            short r0 = kotlin.UShort.m434constructorimpl(r0)
            return r0
    }

    static /* synthetic */ short hexToUShort$default(java.lang.String r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r2 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r2.getDefault()
        La:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            short r2 = kotlin.text.HexExtensionsKt.hexToShort(r0, r1)
            short r2 = kotlin.UShort.m434constructorimpl(r2)
            return r2
    }

    /* JADX INFO: renamed from: toHexString-8M7LxHw, reason: not valid java name */
    private static final java.lang.String m1453toHexString8M7LxHw(int r1, kotlin.text.HexFormat r2) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = kotlin.text.HexExtensionsKt.toHexString(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: toHexString-8M7LxHw$default, reason: not valid java name */
    static /* synthetic */ java.lang.String m1454toHexString8M7LxHw$default(int r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r2 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r2.getDefault()
        La:
            java.lang.String r2 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = kotlin.text.HexExtensionsKt.toHexString(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: toHexString-8UJCm-I, reason: not valid java name */
    private static final java.lang.String m1455toHexString8UJCmI(long r1, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = kotlin.text.HexExtensionsKt.toHexString(r1, r3)
            return r0
    }

    /* JADX INFO: renamed from: toHexString-8UJCm-I$default, reason: not valid java name */
    static /* synthetic */ java.lang.String m1456toHexString8UJCmI$default(long r0, kotlin.text.HexFormat r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlin.text.HexFormat$Companion r3 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r2 = r3.getDefault()
        La:
            java.lang.String r3 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.lang.String r3 = kotlin.text.HexExtensionsKt.toHexString(r0, r2)
            return r3
    }

    /* JADX INFO: renamed from: toHexString-ZQbaR00, reason: not valid java name */
    private static final java.lang.String m1457toHexStringZQbaR00(byte r1, kotlin.text.HexFormat r2) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = kotlin.text.HexExtensionsKt.toHexString(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: toHexString-ZQbaR00$default, reason: not valid java name */
    static /* synthetic */ java.lang.String m1458toHexStringZQbaR00$default(byte r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r2 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r2.getDefault()
        La:
            java.lang.String r2 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = kotlin.text.HexExtensionsKt.toHexString(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: toHexString-lZCiFrA, reason: not valid java name */
    private static final java.lang.String m1459toHexStringlZCiFrA(byte[] r1, int r2, int r3, kotlin.text.HexFormat r4) {
            java.lang.String r0 = "$this$toHexString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = kotlin.text.HexExtensionsKt.toHexString(r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: toHexString-lZCiFrA$default, reason: not valid java name */
    static /* synthetic */ java.lang.String m1460toHexStringlZCiFrA$default(byte[] r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = kotlin.UByteArray.m230getSizeimpl(r0)
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.HexFormat$Companion r4 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r3 = r4.getDefault()
        L17:
            java.lang.String r4 = "$this$toHexString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            java.lang.String r4 = kotlin.text.HexExtensionsKt.toHexString(r0, r1, r2, r3)
            return r4
    }

    /* JADX INFO: renamed from: toHexString-r3ox_E0, reason: not valid java name */
    private static final java.lang.String m1461toHexStringr3ox_E0(short r1, kotlin.text.HexFormat r2) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = kotlin.text.HexExtensionsKt.toHexString(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: toHexString-r3ox_E0$default, reason: not valid java name */
    static /* synthetic */ java.lang.String m1462toHexStringr3ox_E0$default(short r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r2 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r2.getDefault()
        La:
            java.lang.String r2 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = kotlin.text.HexExtensionsKt.toHexString(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: toHexString-zHuV2wU, reason: not valid java name */
    private static final java.lang.String m1463toHexStringzHuV2wU(byte[] r1, kotlin.text.HexFormat r2) {
            java.lang.String r0 = "$this$toHexString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = kotlin.text.HexExtensionsKt.toHexString(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: toHexString-zHuV2wU$default, reason: not valid java name */
    static /* synthetic */ java.lang.String m1464toHexStringzHuV2wU$default(byte[] r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r2 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r2.getDefault()
        La:
            java.lang.String r2 = "$this$toHexString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = kotlin.text.HexExtensionsKt.toHexString(r0, r1)
            return r2
    }
}
