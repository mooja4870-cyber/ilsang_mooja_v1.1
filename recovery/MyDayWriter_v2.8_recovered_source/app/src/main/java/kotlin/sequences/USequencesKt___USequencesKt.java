package kotlin.sequences;

/* JADX INFO: compiled from: _USequences.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\u0005¨\u0006\f"}, d2 = {"sum", "Lkotlin/UInt;", "Lkotlin/sequences/Sequence;", "Lkotlin/UByte;", "sumOfUByte", "(Lkotlin/sequences/Sequence;)I", "sumOfUInt", "Lkotlin/ULong;", "sumOfULong", "(Lkotlin/sequences/Sequence;)J", "Lkotlin/UShort;", "sumOfUShort", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/sequences/USequencesKt")
class USequencesKt___USequencesKt {
    public USequencesKt___USequencesKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final int sumOfUByte(kotlin.sequences.Sequence<kotlin.UByte> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            java.util.Iterator r1 = r4.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()
            kotlin.UByte r2 = (kotlin.UByte) r2
            byte r2 = r2.m221unboximpl()
            r3 = r2 & 255(0xff, float:3.57E-43)
            int r3 = kotlin.UInt.m248constructorimpl(r3)
            int r3 = r3 + r0
            int r0 = kotlin.UInt.m248constructorimpl(r3)
            goto La
        L26:
            return r0
    }

    public static final int sumOfUInt(kotlin.sequences.Sequence<kotlin.UInt> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            java.util.Iterator r1 = r4.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            kotlin.UInt r2 = (kotlin.UInt) r2
            int r2 = r2.m300unboximpl()
            int r3 = r0 + r2
            int r0 = kotlin.UInt.m248constructorimpl(r3)
            goto La
        L21:
            return r0
    }

    public static final long sumOfULong(kotlin.sequences.Sequence<kotlin.ULong> r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            java.util.Iterator r2 = r7.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L22
            java.lang.Object r3 = r2.next()
            kotlin.ULong r3 = (kotlin.ULong) r3
            long r3 = r3.m379unboximpl()
            long r5 = r0 + r3
            long r0 = kotlin.ULong.m327constructorimpl(r5)
            goto Lb
        L22:
            return r0
    }

    public static final int sumOfUShort(kotlin.sequences.Sequence<kotlin.UShort> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            java.util.Iterator r1 = r4.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.next()
            kotlin.UShort r2 = (kotlin.UShort) r2
            short r2 = r2.m484unboximpl()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            int r3 = kotlin.UInt.m248constructorimpl(r3)
            int r3 = r3 + r0
            int r0 = kotlin.UInt.m248constructorimpl(r3)
            goto La
        L28:
            return r0
    }
}
