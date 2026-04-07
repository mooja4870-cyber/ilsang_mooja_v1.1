package kotlin.random;

/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b'\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016¨\u0006\u0018"}, d2 = {"Lkotlin/random/Random;", "", "()V", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "Default", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Random {
    public static final kotlin.random.Random.Default Default = null;
    private static final kotlin.random.Random defaultRandom = null;

    /* JADX INFO: compiled from: Random.kt */
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "defaultRandom", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "writeReplace", "", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Default extends kotlin.random.Random implements java.io.Serializable {

        /* JADX INFO: compiled from: Random.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "serialVersionUID", "", "readResolve", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class Serialized implements java.io.Serializable {
            public static final kotlin.random.Random.Default.Serialized INSTANCE = null;
            private static final long serialVersionUID = 0;

            static {
                    kotlin.random.Random$Default$Serialized r0 = new kotlin.random.Random$Default$Serialized
                    r0.<init>()
                    kotlin.random.Random.Default.Serialized.INSTANCE = r0
                    return
            }

            private Serialized() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            private final java.lang.Object readResolve() {
                    r1 = this;
                    kotlin.random.Random$Default r0 = kotlin.random.Random.Default
                    return r0
            }
        }

        private Default() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Default(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private final java.lang.Object writeReplace() {
                r1 = this;
                kotlin.random.Random$Default$Serialized r0 = kotlin.random.Random.Default.Serialized.INSTANCE
                return r0
        }

        @Override // kotlin.random.Random
        public int nextBits(int r2) {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                int r0 = r0.nextBits(r2)
                return r0
        }

        @Override // kotlin.random.Random
        public boolean nextBoolean() {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                boolean r0 = r0.nextBoolean()
                return r0
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(int r2) {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                byte[] r0 = r0.nextBytes(r2)
                return r0
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(byte[] r2) {
                r1 = this;
                java.lang.String r0 = "array"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                byte[] r0 = r0.nextBytes(r2)
                return r0
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(byte[] r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "array"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                byte[] r0 = r0.nextBytes(r2, r3, r4)
                return r0
        }

        @Override // kotlin.random.Random
        public double nextDouble() {
                r2 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                double r0 = r0.nextDouble()
                return r0
        }

        @Override // kotlin.random.Random
        public double nextDouble(double r3) {
                r2 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                double r0 = r0.nextDouble(r3)
                return r0
        }

        @Override // kotlin.random.Random
        public double nextDouble(double r3, double r5) {
                r2 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                double r0 = r0.nextDouble(r3, r5)
                return r0
        }

        @Override // kotlin.random.Random
        public float nextFloat() {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                float r0 = r0.nextFloat()
                return r0
        }

        @Override // kotlin.random.Random
        public int nextInt() {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                int r0 = r0.nextInt()
                return r0
        }

        @Override // kotlin.random.Random
        public int nextInt(int r2) {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                int r0 = r0.nextInt(r2)
                return r0
        }

        @Override // kotlin.random.Random
        public int nextInt(int r2, int r3) {
                r1 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                int r0 = r0.nextInt(r2, r3)
                return r0
        }

        @Override // kotlin.random.Random
        public long nextLong() {
                r2 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                long r0 = r0.nextLong()
                return r0
        }

        @Override // kotlin.random.Random
        public long nextLong(long r3) {
                r2 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                long r0 = r0.nextLong(r3)
                return r0
        }

        @Override // kotlin.random.Random
        public long nextLong(long r3, long r5) {
                r2 = this;
                kotlin.random.Random r0 = kotlin.random.Random.access$getDefaultRandom$cp()
                long r0 = r0.nextLong(r3, r5)
                return r0
        }
    }

    static {
            kotlin.random.Random$Default r0 = new kotlin.random.Random$Default
            r1 = 0
            r0.<init>(r1)
            kotlin.random.Random.Default = r0
            kotlin.internal.PlatformImplementations r0 = kotlin.internal.PlatformImplementationsKt.IMPLEMENTATIONS
            kotlin.random.Random r0 = r0.defaultPlatformRandom()
            kotlin.random.Random.defaultRandom = r0
            return
    }

    public Random() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ kotlin.random.Random access$getDefaultRandom$cp() {
            kotlin.random.Random r0 = kotlin.random.Random.defaultRandom
            return r0
    }

    public static /* synthetic */ byte[] nextBytes$default(kotlin.random.Random r0, byte[] r1, int r2, int r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L11
            r5 = r4 & 2
            if (r5 == 0) goto L7
            r2 = 0
        L7:
            r4 = r4 & 4
            if (r4 == 0) goto Lc
            int r3 = r1.length
        Lc:
            byte[] r0 = r0.nextBytes(r1, r2, r3)
            return r0
        L11:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: nextBytes"
            r0.<init>(r1)
            throw r0
    }

    public abstract int nextBits(int r1);

    public boolean nextBoolean() {
            r2 = this;
            r0 = 1
            int r1 = r2.nextBits(r0)
            if (r1 == 0) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public byte[] nextBytes(int r2) {
            r1 = this;
            byte[] r0 = new byte[r2]
            byte[] r0 = r1.nextBytes(r0)
            return r0
    }

    public byte[] nextBytes(byte[] r3) {
            r2 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r3.length
            byte[] r0 = r2.nextBytes(r3, r0, r1)
            return r0
    }

    public byte[] nextBytes(byte[] r9, int r10, int r11) {
            r8 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 1
            r1 = 0
            if (r10 < 0) goto Le
            int r2 = r9.length
            if (r10 > r2) goto Le
            r2 = r0
            goto Lf
        Le:
            r2 = r1
        Lf:
            if (r2 == 0) goto L1d
            if (r11 < 0) goto L18
            int r2 = r9.length
            if (r11 > r2) goto L18
            r2 = r0
            goto L19
        L18:
            r2 = r1
        L19:
            if (r2 == 0) goto L1d
            r2 = r0
            goto L1e
        L1d:
            r2 = r1
        L1e:
            java.lang.String r3 = "fromIndex ("
            if (r2 == 0) goto L99
            if (r10 > r11) goto L25
            goto L26
        L25:
            r0 = r1
        L26:
            if (r0 == 0) goto L6d
            int r0 = r11 - r10
            int r0 = r0 / 4
            r2 = 0
            r2 = r10
        L2f:
            if (r1 >= r0) goto L55
            r3 = r1
            r4 = 0
            int r5 = r8.nextInt()
            byte r6 = (byte) r5
            r9[r2] = r6
            int r6 = r2 + 1
            int r7 = r5 >>> 8
            byte r7 = (byte) r7
            r9[r6] = r7
            int r6 = r2 + 2
            int r7 = r5 >>> 16
            byte r7 = (byte) r7
            r9[r6] = r7
            int r6 = r2 + 3
            int r7 = r5 >>> 24
            byte r7 = (byte) r7
            r9[r6] = r7
            int r2 = r2 + 4
            int r1 = r1 + 1
            goto L2f
        L55:
            int r1 = r11 - r2
            int r3 = r1 * 8
            int r3 = r8.nextBits(r3)
            r4 = 0
        L5e:
            if (r4 >= r1) goto L6c
            int r5 = r2 + r4
            int r6 = r4 * 8
            int r6 = r3 >>> r6
            byte r6 = (byte) r6
            r9[r5] = r6
            int r4 = r4 + 1
            goto L5e
        L6c:
            return r9
        L6d:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r2 = ") must be not greater than toIndex ("
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = ")."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L99:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r2 = ") or toIndex ("
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = ") are out of range: 0.."
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r9.length
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 46
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public double nextDouble() {
            r2 = this;
            r0 = 26
            int r0 = r2.nextBits(r0)
            r1 = 27
            int r1 = r2.nextBits(r1)
            double r0 = kotlin.random.PlatformRandomKt.doubleFromParts(r0, r1)
            return r0
    }

    public double nextDouble(double r3) {
            r2 = this;
            r0 = 0
            double r0 = r2.nextDouble(r0, r3)
            return r0
    }

    public double nextDouble(double r9, double r11) {
            r8 = this;
            kotlin.random.RandomKt.checkRangeBounds(r9, r11)
            double r0 = r11 - r9
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L3e
            boolean r2 = java.lang.Double.isInfinite(r9)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1b
            boolean r2 = java.lang.Double.isNaN(r9)
            if (r2 != 0) goto L1b
            r2 = r3
            goto L1c
        L1b:
            r2 = r4
        L1c:
            if (r2 == 0) goto L3e
            boolean r2 = java.lang.Double.isInfinite(r11)
            if (r2 != 0) goto L2b
            boolean r2 = java.lang.Double.isNaN(r11)
            if (r2 != 0) goto L2b
            goto L2c
        L2b:
            r3 = r4
        L2c:
            if (r3 == 0) goto L3e
            double r2 = r8.nextDouble()
            r4 = 2
            double r4 = (double) r4
            double r6 = r11 / r4
            double r4 = r9 / r4
            double r6 = r6 - r4
            double r2 = r2 * r6
            double r4 = r9 + r2
            double r4 = r4 + r2
            goto L45
        L3e:
            double r2 = r8.nextDouble()
            double r2 = r2 * r0
            double r4 = r9 + r2
        L45:
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 < 0) goto L51
            r2 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r2 = java.lang.Math.nextAfter(r11, r2)
            goto L52
        L51:
            r2 = r4
        L52:
            return r2
    }

    public float nextFloat() {
            r2 = this;
            r0 = 24
            int r0 = r2.nextBits(r0)
            float r0 = (float) r0
            r1 = 1266679808(0x4b800000, float:1.6777216E7)
            float r0 = r0 / r1
            return r0
    }

    public int nextInt() {
            r1 = this;
            r0 = 32
            int r0 = r1.nextBits(r0)
            return r0
    }

    public int nextInt(int r2) {
            r1 = this;
            r0 = 0
            int r0 = r1.nextInt(r0, r2)
            return r0
    }

    public int nextInt(int r7, int r8) {
            r6 = this;
            kotlin.random.RandomKt.checkRangeBounds(r7, r8)
            int r0 = r8 - r7
            r1 = 1
            if (r0 > 0) goto L1b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto Ld
            goto L1b
        Ld:
            int r2 = r6.nextInt()
            r3 = 0
            if (r7 > r2) goto L18
            if (r2 >= r8) goto L18
            r3 = r1
        L18:
            if (r3 == 0) goto Ld
            return r2
        L1b:
            int r2 = -r0
            r2 = r2 & r0
            if (r2 != r0) goto L28
            int r1 = kotlin.random.RandomKt.fastLog2(r0)
            int r1 = r6.nextBits(r1)
            goto L38
        L28:
            r2 = 0
        L29:
            int r3 = r6.nextInt()
            int r3 = r3 >>> r1
            int r2 = r3 % r0
            int r4 = r3 - r2
            int r5 = r0 + (-1)
            int r4 = r4 + r5
            if (r4 < 0) goto L29
            r1 = r2
        L38:
            int r2 = r7 + r1
            return r2
    }

    public long nextLong() {
            r4 = this;
            int r0 = r4.nextInt()
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            int r2 = r4.nextInt()
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    public long nextLong(long r3) {
            r2 = this;
            r0 = 0
            long r0 = r2.nextLong(r0, r3)
            return r0
    }

    public long nextLong(long r18, long r20) {
            r17 = this;
            r0 = r17
            kotlin.random.RandomKt.checkRangeBounds(r18, r20)
            long r1 = r20 - r18
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 1
            if (r5 <= 0) goto L63
            r7 = 0
            long r9 = -r1
            long r9 = r9 & r1
            int r5 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r5 != 0) goto L4b
            int r3 = (int) r1
            r4 = 32
            long r9 = r1 >>> r4
            int r5 = (int) r9
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r3 == 0) goto L2f
            int r4 = kotlin.random.RandomKt.fastLog2(r3)
            int r6 = r0.nextBits(r4)
            long r11 = (long) r6
            long r9 = r9 & r11
            goto L49
        L2f:
            if (r5 != r6) goto L38
            int r4 = r0.nextInt()
            long r11 = (long) r4
            long r9 = r9 & r11
            goto L49
        L38:
            int r6 = kotlin.random.RandomKt.fastLog2(r5)
            int r11 = r0.nextBits(r6)
            long r11 = (long) r11
            long r11 = r11 << r4
            int r4 = r0.nextInt()
            long r13 = (long) r4
            long r9 = r9 & r13
            long r9 = r9 + r11
        L49:
            goto L60
        L4b:
            r9 = 0
        L4d:
            long r11 = r0.nextLong()
            long r11 = r11 >>> r6
            long r9 = r11 % r1
            long r13 = r11 - r9
            r15 = 1
            long r15 = r1 - r15
            long r13 = r13 + r15
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 < 0) goto L4d
            r3 = r9
        L60:
            long r3 = r18 + r9
            return r3
        L63:
            long r3 = r0.nextLong()
            int r5 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            r7 = 0
            if (r5 > 0) goto L72
            int r5 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r5 >= 0) goto L72
            r7 = r6
        L72:
            if (r7 == 0) goto L63
            return r3
    }
}
