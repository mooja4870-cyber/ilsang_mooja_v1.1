package kotlin.random;

/* JADX INFO: compiled from: XorWowRandom.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00122\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0012B\u0017\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B7\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "seed1", "", "seed2", "(II)V", "x", "y", "z", "w", "v", "addend", "(IIIIII)V", "nextBits", "bitCount", "nextInt", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class XorWowRandom extends kotlin.random.Random implements java.io.Serializable {
    private static final kotlin.random.XorWowRandom.Companion Companion = null;
    private static final long serialVersionUID = 0;
    private int addend;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* JADX INFO: compiled from: XorWowRandom.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/random/XorWowRandom$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.random.XorWowRandom$Companion r0 = new kotlin.random.XorWowRandom$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.random.XorWowRandom.Companion = r0
            return
    }

    public XorWowRandom(int r8, int r9) {
            r7 = this;
            int r5 = ~r8
            int r0 = r8 << 10
            int r1 = r9 >>> 4
            r6 = r0 ^ r1
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public XorWowRandom(int r4, int r5, int r6, int r7, int r8, int r9) {
            r3 = this;
            r3.<init>()
            r3.x = r4
            r3.y = r5
            r3.z = r6
            r3.w = r7
            r3.v = r8
            r3.addend = r9
            int r0 = r3.x
            int r1 = r3.y
            r0 = r0 | r1
            int r1 = r3.z
            r0 = r0 | r1
            int r1 = r3.w
            r0 = r0 | r1
            int r1 = r3.v
            r0 = r0 | r1
            r1 = 0
            if (r0 == 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = r1
        L24:
            if (r0 == 0) goto L35
        L27:
            r0 = 64
            if (r1 >= r0) goto L33
            r0 = r1
            r2 = 0
            r3.nextInt()
            int r1 = r1 + 1
            goto L27
        L33:
            return
        L35:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Initial state must have at least one non-zero element."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.random.Random
    public int nextBits(int r2) {
            r1 = this;
            int r0 = r1.nextInt()
            int r0 = kotlin.random.RandomKt.takeUpperBits(r0, r2)
            return r0
    }

    @Override // kotlin.random.Random
    public int nextInt() {
            r4 = this;
            int r0 = r4.x
            int r1 = r0 >>> 2
            r0 = r0 ^ r1
            int r1 = r4.y
            r4.x = r1
            int r1 = r4.z
            r4.y = r1
            int r1 = r4.w
            r4.z = r1
            int r1 = r4.v
            r4.w = r1
            int r2 = r0 << 1
            r2 = r2 ^ r0
            r2 = r2 ^ r1
            int r3 = r1 << 4
            r0 = r2 ^ r3
            r4.v = r0
            int r2 = r4.addend
            r3 = 362437(0x587c5, float:5.07882E-40)
            int r2 = r2 + r3
            r4.addend = r2
            int r2 = r4.addend
            int r2 = r2 + r0
            return r2
    }
}
