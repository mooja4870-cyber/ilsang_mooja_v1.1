package kotlin;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class UByte$$ExternalSyntheticBackport3 {
    public static /* synthetic */ long m(long r7, long r9) {
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r3 = -9223372036854775808
            if (r2 >= 0) goto L12
            long r7 = r7 ^ r3
            long r9 = r9 ^ r3
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 >= 0) goto Lf
            return r0
        Lf:
            r7 = 1
            return r7
        L12:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L18
            long r7 = r7 / r9
            return r7
        L18:
            r0 = 1
            long r1 = r7 >>> r0
            long r1 = r1 / r9
            long r1 = r1 << r0
            long r5 = r1 * r9
            long r7 = r7 - r5
            long r7 = r7 ^ r3
            long r9 = r9 ^ r3
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            long r7 = (long) r0
            long r1 = r1 + r7
            return r1
    }
}
