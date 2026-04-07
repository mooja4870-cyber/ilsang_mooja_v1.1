package kotlinx.coroutines;

/* JADX INFO: compiled from: DebugStrings.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\bH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"classSimpleName", "", "", "getClassSimpleName", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "getHexAddress", "toDebugString", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DebugStringsKt {
    public static final java.lang.String getClassSimpleName(java.lang.Object r1) {
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    public static final java.lang.String getHexAddress(java.lang.Object r1) {
            int r0 = java.lang.System.identityHashCode(r1)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            return r0
    }

    public static final java.lang.String toDebugString(kotlin.coroutines.Continuation<?> r5) {
            boolean r0 = r5 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 == 0) goto La
            java.lang.String r0 = r5.toString()
            goto L66
        La:
            r0 = 64
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2e
            r1 = r5
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r3.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r3 = r3.append(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r3 = r3.append(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = getHexAddress(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r3)     // Catch: java.lang.Throwable -> L2e
            goto L39
        L2e:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)
        L39:
            java.lang.Throwable r2 = kotlin.Result.m156exceptionOrNullimpl(r1)
            if (r2 != 0) goto L40
            goto L63
        L40:
            r1 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = getHexAddress(r5)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r1 = r0
        L63:
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
        L66:
            return r0
    }
}
