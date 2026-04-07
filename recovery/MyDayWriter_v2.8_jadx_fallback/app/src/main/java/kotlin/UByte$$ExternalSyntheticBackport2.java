package kotlin;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class UByte$$ExternalSyntheticBackport2 {
    public static /* synthetic */ long m(long r7, long r9) {
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r3 = -9223372036854775808
            if (r2 >= 0) goto L13
            long r0 = r7 ^ r3
            long r2 = r9 ^ r3
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L11
            return r7
        L11:
            long r7 = r7 - r9
            return r7
        L13:
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L19
            long r7 = r7 % r9
            return r7
        L19:
            r2 = 1
            long r5 = r7 >>> r2
            long r5 = r5 / r9
            long r5 = r5 << r2
            long r5 = r5 * r9
            long r7 = r7 - r5
            long r5 = r7 ^ r3
            long r2 = r9 ^ r3
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 < 0) goto L29
            goto L2a
        L29:
            r9 = r0
        L2a:
            long r7 = r7 - r9
            return r7
    }
}
