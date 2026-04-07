package kotlin.time;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\f\u0010\nJ\b\u0010\r\u001a\u00020\u0004H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "()V", "reading", "", "overflow", "", "duration", "Lkotlin/time/Duration;", "overflow-LRDsOJo", "(J)V", "plusAssign", "plusAssign-LRDsOJo", "read", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TestTimeSource extends kotlin.time.AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
            r1 = this;
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            r1.<init>(r0)
            r1.markNow()
            return
    }

    /* JADX INFO: renamed from: overflow-LRDsOJo, reason: not valid java name */
    private final void m1614overflowLRDsOJo(long r5) {
            r4 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "TestTimeSource will overflow if its reading "
            java.lang.StringBuilder r1 = r1.append(r2)
            long r2 = r4.reading
            java.lang.StringBuilder r1 = r1.append(r2)
            kotlin.time.DurationUnit r2 = r4.getUnit()
            java.lang.String r2 = kotlin.time.DurationUnitKt.shortName(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is advanced by "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = kotlin.time.Duration.m1528toStringimpl(r5)
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 46
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m1615plusAssignLRDsOJo(long r20) {
            r19 = this;
            r1 = r19
            r2 = r20
            kotlin.time.DurationUnit r0 = r1.getUnit()
            long r4 = kotlin.time.Duration.m1525toLongimpl(r2, r0)
            r6 = r4
            r0 = 0
            r8 = 1
            long r10 = r6 - r8
            long r10 = r10 | r8
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            r11 = 1
            r14 = 0
            if (r10 != 0) goto L20
            r0 = r11
            goto L21
        L20:
            r0 = r14
        L21:
            if (r0 != 0) goto L3c
            long r6 = r1.reading
            long r6 = r6 + r4
            long r8 = r1.reading
            long r8 = r8 ^ r4
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 < 0) goto L39
            long r8 = r1.reading
            long r8 = r8 ^ r6
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 >= 0) goto L39
            r19.m1614overflowLRDsOJo(r20)
        L39:
            r1.reading = r6
            goto L6b
        L3c:
            r0 = 2
            long r6 = kotlin.time.Duration.m1482divUwyO8pc(r2, r0)
            kotlin.time.DurationUnit r0 = r1.getUnit()
            long r15 = kotlin.time.Duration.m1525toLongimpl(r6, r0)
            r0 = 0
            long r17 = r15 - r8
            long r8 = r17 | r8
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L53
            goto L54
        L53:
            r11 = r14
        L54:
            if (r11 != 0) goto L68
            long r8 = r1.reading
            r1.m1615plusAssignLRDsOJo(r6)     // Catch: java.lang.IllegalStateException -> L64
            long r10 = kotlin.time.Duration.m1514minusLRDsOJo(r2, r6)     // Catch: java.lang.IllegalStateException -> L64
            r1.m1615plusAssignLRDsOJo(r10)     // Catch: java.lang.IllegalStateException -> L64
            goto L6b
        L64:
            r0 = move-exception
            r1.reading = r8
            throw r0
        L68:
            r19.m1614overflowLRDsOJo(r20)
        L6b:
            return
    }

    @Override // kotlin.time.AbstractLongTimeSource
    protected long read() {
            r2 = this;
            long r0 = r2.reading
            return r0
    }
}
