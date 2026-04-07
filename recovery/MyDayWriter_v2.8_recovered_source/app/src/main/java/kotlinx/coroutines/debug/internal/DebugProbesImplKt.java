package kotlinx.coroutines.debug.internal;

/* JADX INFO: compiled from: DebugProbesImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002¨\u0006\u0002"}, d2 = {"repr", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DebugProbesImplKt {
    public static final /* synthetic */ java.lang.String access$repr(java.lang.String r1) {
            java.lang.String r0 = repr(r1)
            return r0
    }

    private static final java.lang.String repr(java.lang.String r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            r3 = 34
            r1.append(r3)
            int r4 = r8.length()
            r5 = 0
        L11:
            if (r5 >= r4) goto L58
            char r6 = r8.charAt(r5)
            if (r6 != r3) goto L20
            java.lang.String r7 = "\\\""
            r1.append(r7)
            goto L55
        L20:
            r7 = 92
            if (r6 != r7) goto L2a
            java.lang.String r7 = "\\\\"
            r1.append(r7)
            goto L55
        L2a:
            r7 = 8
            if (r6 != r7) goto L34
            java.lang.String r7 = "\\b"
            r1.append(r7)
            goto L55
        L34:
            r7 = 10
            if (r6 != r7) goto L3e
            java.lang.String r7 = "\\n"
            r1.append(r7)
            goto L55
        L3e:
            r7 = 13
            if (r6 != r7) goto L48
            java.lang.String r7 = "\\r"
            r1.append(r7)
            goto L55
        L48:
            r7 = 9
            if (r6 != r7) goto L52
            java.lang.String r7 = "\\t"
            r1.append(r7)
            goto L55
        L52:
            r1.append(r6)
        L55:
            int r5 = r5 + 1
            goto L11
        L58:
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
