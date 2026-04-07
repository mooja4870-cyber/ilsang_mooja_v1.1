package kotlin;

/* JADX INFO: compiled from: UNumbers.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0005H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\bH\u0087\b¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u000bH\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a\u0014\u0010\u000e\u001a\u00020\u0001*\u00020\u0002H\u0087\b¢\u0006\u0004\b\u000f\u0010\u0004\u001a\u0014\u0010\u000e\u001a\u00020\u0001*\u00020\u0005H\u0087\b¢\u0006\u0004\b\u0010\u0010\u0007\u001a\u0014\u0010\u000e\u001a\u00020\u0001*\u00020\bH\u0087\b¢\u0006\u0004\b\u0011\u0010\n\u001a\u0014\u0010\u000e\u001a\u00020\u0001*\u00020\u000bH\u0087\b¢\u0006\u0004\b\u0012\u0010\r\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u0002H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0004\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u0005H\u0087\b¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\bH\u0087\b¢\u0006\u0004\b\u0016\u0010\n\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u000bH\u0087\b¢\u0006\u0004\b\u0017\u0010\r\u001a\u001c\u0010\u0018\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u0018\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001c\u0010\u0018\u001a\u00020\b*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010\u0018\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b \u0010!\u001a\u001c\u0010\"\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b#\u0010\u001b\u001a\u001c\u0010\"\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b$\u0010\u001d\u001a\u001c\u0010\"\u001a\u00020\b*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b%\u0010\u001f\u001a\u001c\u0010\"\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b&\u0010!\u001a\u0014\u0010'\u001a\u00020\u0002*\u00020\u0002H\u0087\b¢\u0006\u0004\b(\u0010)\u001a\u0014\u0010'\u001a\u00020\u0005*\u00020\u0005H\u0087\b¢\u0006\u0004\b*\u0010\u0007\u001a\u0014\u0010'\u001a\u00020\b*\u00020\bH\u0087\b¢\u0006\u0004\b+\u0010,\u001a\u0014\u0010'\u001a\u00020\u000b*\u00020\u000bH\u0087\b¢\u0006\u0004\b-\u0010.\u001a\u0014\u0010/\u001a\u00020\u0002*\u00020\u0002H\u0087\b¢\u0006\u0004\b0\u0010)\u001a\u0014\u0010/\u001a\u00020\u0005*\u00020\u0005H\u0087\b¢\u0006\u0004\b1\u0010\u0007\u001a\u0014\u0010/\u001a\u00020\b*\u00020\bH\u0087\b¢\u0006\u0004\b2\u0010,\u001a\u0014\u0010/\u001a\u00020\u000b*\u00020\u000bH\u0087\b¢\u0006\u0004\b3\u0010.¨\u00064"}, d2 = {"countLeadingZeroBits", "", "Lkotlin/UByte;", "countLeadingZeroBits-7apg3OU", "(B)I", "Lkotlin/UInt;", "countLeadingZeroBits-WZ4Q5Ns", "(I)I", "Lkotlin/ULong;", "countLeadingZeroBits-VKZWuLQ", "(J)I", "Lkotlin/UShort;", "countLeadingZeroBits-xj2QHRw", "(S)I", "countOneBits", "countOneBits-7apg3OU", "countOneBits-WZ4Q5Ns", "countOneBits-VKZWuLQ", "countOneBits-xj2QHRw", "countTrailingZeroBits", "countTrailingZeroBits-7apg3OU", "countTrailingZeroBits-WZ4Q5Ns", "countTrailingZeroBits-VKZWuLQ", "countTrailingZeroBits-xj2QHRw", "rotateLeft", "bitCount", "rotateLeft-LxnNnR4", "(BI)B", "rotateLeft-V7xB4Y4", "(II)I", "rotateLeft-JSWoG40", "(JI)J", "rotateLeft-olVBNx4", "(SI)S", "rotateRight", "rotateRight-LxnNnR4", "rotateRight-V7xB4Y4", "rotateRight-JSWoG40", "rotateRight-olVBNx4", "takeHighestOneBit", "takeHighestOneBit-7apg3OU", "(B)B", "takeHighestOneBit-WZ4Q5Ns", "takeHighestOneBit-VKZWuLQ", "(J)J", "takeHighestOneBit-xj2QHRw", "(S)S", "takeLowestOneBit", "takeLowestOneBit-7apg3OU", "takeLowestOneBit-WZ4Q5Ns", "takeLowestOneBit-VKZWuLQ", "takeLowestOneBit-xj2QHRw", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class UNumbersKt {
    /* JADX INFO: renamed from: countLeadingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m399countLeadingZeroBits7apg3OU(byte r1) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
            int r0 = r0 + (-24)
            return r0
    }

    /* JADX INFO: renamed from: countLeadingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m400countLeadingZeroBitsVKZWuLQ(long r1) {
            int r0 = java.lang.Long.numberOfLeadingZeros(r1)
            return r0
    }

    /* JADX INFO: renamed from: countLeadingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m401countLeadingZeroBitsWZ4Q5Ns(int r1) {
            int r0 = java.lang.Integer.numberOfLeadingZeros(r1)
            return r0
    }

    /* JADX INFO: renamed from: countLeadingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m402countLeadingZeroBitsxj2QHRw(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
            int r0 = r0 + (-16)
            return r0
    }

    /* JADX INFO: renamed from: countOneBits-7apg3OU, reason: not valid java name */
    private static final int m403countOneBits7apg3OU(byte r1) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m248constructorimpl(r0)
            int r0 = java.lang.Integer.bitCount(r0)
            return r0
    }

    /* JADX INFO: renamed from: countOneBits-VKZWuLQ, reason: not valid java name */
    private static final int m404countOneBitsVKZWuLQ(long r1) {
            int r0 = java.lang.Long.bitCount(r1)
            return r0
    }

    /* JADX INFO: renamed from: countOneBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m405countOneBitsWZ4Q5Ns(int r1) {
            int r0 = java.lang.Integer.bitCount(r1)
            return r0
    }

    /* JADX INFO: renamed from: countOneBits-xj2QHRw, reason: not valid java name */
    private static final int m406countOneBitsxj2QHRw(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            int r0 = kotlin.UInt.m248constructorimpl(r0)
            int r0 = java.lang.Integer.bitCount(r0)
            return r0
    }

    /* JADX INFO: renamed from: countTrailingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m407countTrailingZeroBits7apg3OU(byte r1) {
            r0 = r1 | 256(0x100, float:3.59E-43)
            int r0 = java.lang.Integer.numberOfTrailingZeros(r0)
            return r0
    }

    /* JADX INFO: renamed from: countTrailingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m408countTrailingZeroBitsVKZWuLQ(long r1) {
            int r0 = java.lang.Long.numberOfTrailingZeros(r1)
            return r0
    }

    /* JADX INFO: renamed from: countTrailingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m409countTrailingZeroBitsWZ4Q5Ns(int r1) {
            int r0 = java.lang.Integer.numberOfTrailingZeros(r1)
            return r0
    }

    /* JADX INFO: renamed from: countTrailingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m410countTrailingZeroBitsxj2QHRw(short r1) {
            r0 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 | r1
            int r0 = java.lang.Integer.numberOfTrailingZeros(r0)
            return r0
    }

    /* JADX INFO: renamed from: rotateLeft-JSWoG40, reason: not valid java name */
    private static final long m411rotateLeftJSWoG40(long r2, int r4) {
            long r0 = java.lang.Long.rotateLeft(r2, r4)
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: rotateLeft-LxnNnR4, reason: not valid java name */
    private static final byte m412rotateLeftLxnNnR4(byte r1, int r2) {
            byte r0 = kotlin.NumbersKt.rotateLeft(r1, r2)
            byte r0 = kotlin.UByte.m171constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: rotateLeft-V7xB4Y4, reason: not valid java name */
    private static final int m413rotateLeftV7xB4Y4(int r1, int r2) {
            int r0 = java.lang.Integer.rotateLeft(r1, r2)
            int r0 = kotlin.UInt.m248constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: rotateLeft-olVBNx4, reason: not valid java name */
    private static final short m414rotateLeftolVBNx4(short r1, int r2) {
            short r0 = kotlin.NumbersKt.rotateLeft(r1, r2)
            short r0 = kotlin.UShort.m434constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: rotateRight-JSWoG40, reason: not valid java name */
    private static final long m415rotateRightJSWoG40(long r2, int r4) {
            long r0 = java.lang.Long.rotateRight(r2, r4)
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: rotateRight-LxnNnR4, reason: not valid java name */
    private static final byte m416rotateRightLxnNnR4(byte r1, int r2) {
            byte r0 = kotlin.NumbersKt.rotateRight(r1, r2)
            byte r0 = kotlin.UByte.m171constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: rotateRight-V7xB4Y4, reason: not valid java name */
    private static final int m417rotateRightV7xB4Y4(int r1, int r2) {
            int r0 = java.lang.Integer.rotateRight(r1, r2)
            int r0 = kotlin.UInt.m248constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: rotateRight-olVBNx4, reason: not valid java name */
    private static final short m418rotateRightolVBNx4(short r1, int r2) {
            short r0 = kotlin.NumbersKt.rotateRight(r1, r2)
            short r0 = kotlin.UShort.m434constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: takeHighestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m419takeHighestOneBit7apg3OU(byte r1) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            int r0 = java.lang.Integer.highestOneBit(r0)
            byte r0 = (byte) r0
            byte r0 = kotlin.UByte.m171constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: takeHighestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m420takeHighestOneBitVKZWuLQ(long r2) {
            long r0 = java.lang.Long.highestOneBit(r2)
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: takeHighestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m421takeHighestOneBitWZ4Q5Ns(int r1) {
            int r0 = java.lang.Integer.highestOneBit(r1)
            int r0 = kotlin.UInt.m248constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: takeHighestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m422takeHighestOneBitxj2QHRw(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            int r0 = java.lang.Integer.highestOneBit(r0)
            short r0 = (short) r0
            short r0 = kotlin.UShort.m434constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: takeLowestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m423takeLowestOneBit7apg3OU(byte r1) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            int r0 = java.lang.Integer.lowestOneBit(r0)
            byte r0 = (byte) r0
            byte r0 = kotlin.UByte.m171constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: takeLowestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m424takeLowestOneBitVKZWuLQ(long r2) {
            long r0 = java.lang.Long.lowestOneBit(r2)
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: takeLowestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m425takeLowestOneBitWZ4Q5Ns(int r1) {
            int r0 = java.lang.Integer.lowestOneBit(r1)
            int r0 = kotlin.UInt.m248constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: takeLowestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m426takeLowestOneBitxj2QHRw(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            int r0 = java.lang.Integer.lowestOneBit(r0)
            short r0 = (short) r0
            short r0 = kotlin.UShort.m434constructorimpl(r0)
            return r0
    }
}
