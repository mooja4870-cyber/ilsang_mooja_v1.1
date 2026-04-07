package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: SystemProps.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a,\u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000\u001a,\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\t"}, d2 = {"systemProp", "", "propertyName", "", "defaultValue", "", "minValue", "maxValue", "", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/internal/SystemPropsKt")
final /* synthetic */ class SystemPropsKt__SystemProps_commonKt {
    public static final int systemProp(java.lang.String r7, int r8, int r9, int r10) {
            long r1 = (long) r8
            long r3 = (long) r9
            long r5 = (long) r10
            r0 = r7
            long r1 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r0, r1, r3, r5)
            int r7 = (int) r1
            return r7
    }

    public static final long systemProp(java.lang.String r7, long r8, long r10, long r12) {
            java.lang.String r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r7)
            if (r0 != 0) goto L7
            return r8
        L7:
            java.lang.Long r1 = kotlin.text.StringsKt.toLongOrNull(r0)
            r2 = 39
            java.lang.String r3 = "System property '"
            if (r1 == 0) goto L5f
            long r4 = r1.longValue()
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            r6 = 0
            if (r1 > 0) goto L1f
            int r1 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r1 > 0) goto L1f
            r6 = 1
        L1f:
            if (r6 == 0) goto L22
            return r4
        L22:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r3 = r6.append(r3)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r6 = "' should be in range "
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.StringBuilder r3 = r3.append(r10)
            java.lang.String r6 = ".."
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.StringBuilder r3 = r3.append(r12)
            java.lang.String r6 = ", but is '"
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r4 = "' has unrecognized value '"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final java.lang.String systemProp(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r1)
            if (r0 != 0) goto L7
            r0 = r2
        L7:
            return r0
    }

    public static final boolean systemProp(java.lang.String r1, boolean r2) {
            java.lang.String r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r1)
            if (r0 == 0) goto Lb
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            goto Lc
        Lb:
            r0 = r2
        Lc:
            return r0
    }

    public static /* synthetic */ int systemProp$default(java.lang.String r0, int r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 4
            if (r5 == 0) goto L5
            r2 = 1
        L5:
            r4 = r4 & 8
            if (r4 == 0) goto Lc
            r3 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ long systemProp$default(java.lang.String r7, long r8, long r10, long r12, int r14, java.lang.Object r15) {
            r15 = r14 & 4
            if (r15 == 0) goto L8
            r10 = 1
            r3 = r10
            goto L9
        L8:
            r3 = r10
        L9:
            r10 = r14 & 8
            if (r10 == 0) goto L14
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = r12
            goto L15
        L14:
            r5 = r12
        L15:
            r0 = r7
            r1 = r8
            long r7 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r0, r1, r3, r5)
            return r7
    }
}
