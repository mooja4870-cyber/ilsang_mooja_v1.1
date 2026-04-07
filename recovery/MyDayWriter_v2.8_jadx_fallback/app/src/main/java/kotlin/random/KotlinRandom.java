package kotlin.random;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014J\b\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlin/random/KotlinRandom;", "Ljava/util/Random;", "impl", "Lkotlin/random/Random;", "(Lkotlin/random/Random;)V", "getImpl", "()Lkotlin/random/Random;", "seedInitialized", "", "next", "", "bits", "nextBoolean", "nextBytes", "", "bytes", "", "nextDouble", "", "nextFloat", "", "nextInt", "bound", "nextLong", "", "setSeed", "seed", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class KotlinRandom extends java.util.Random {
    private static final kotlin.random.KotlinRandom.Companion Companion = null;
    private static final long serialVersionUID = 0;
    private final kotlin.random.Random impl;
    private boolean seedInitialized;

    /* JADX INFO: compiled from: PlatformRandom.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/random/KotlinRandom$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            kotlin.random.KotlinRandom$Companion r0 = new kotlin.random.KotlinRandom$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.random.KotlinRandom.Companion = r0
            return
    }

    public KotlinRandom(kotlin.random.Random r2) {
            r1 = this;
            java.lang.String r0 = "impl"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.impl = r2
            return
    }

    public final kotlin.random.Random getImpl() {
            r1 = this;
            kotlin.random.Random r0 = r1.impl
            return r0
    }

    @Override // java.util.Random
    protected int next(int r2) {
            r1 = this;
            kotlin.random.Random r0 = r1.impl
            int r0 = r0.nextBits(r2)
            return r0
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
            r1 = this;
            kotlin.random.Random r0 = r1.impl
            boolean r0 = r0.nextBoolean()
            return r0
    }

    @Override // java.util.Random
    public void nextBytes(byte[] r2) {
            r1 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.random.Random r0 = r1.impl
            r0.nextBytes(r2)
            return
    }

    @Override // java.util.Random
    public double nextDouble() {
            r2 = this;
            kotlin.random.Random r0 = r2.impl
            double r0 = r0.nextDouble()
            return r0
    }

    @Override // java.util.Random
    public float nextFloat() {
            r1 = this;
            kotlin.random.Random r0 = r1.impl
            float r0 = r0.nextFloat()
            return r0
    }

    @Override // java.util.Random
    public int nextInt() {
            r1 = this;
            kotlin.random.Random r0 = r1.impl
            int r0 = r0.nextInt()
            return r0
    }

    @Override // java.util.Random
    public int nextInt(int r2) {
            r1 = this;
            kotlin.random.Random r0 = r1.impl
            int r0 = r0.nextInt(r2)
            return r0
    }

    @Override // java.util.Random
    public long nextLong() {
            r2 = this;
            kotlin.random.Random r0 = r2.impl
            long r0 = r0.nextLong()
            return r0
    }

    @Override // java.util.Random
    public void setSeed(long r3) {
            r2 = this;
            boolean r0 = r2.seedInitialized
            if (r0 != 0) goto L8
            r0 = 1
            r2.seedInitialized = r0
            return
        L8:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Setting seed is not supported."
            r0.<init>(r1)
            throw r0
    }
}
