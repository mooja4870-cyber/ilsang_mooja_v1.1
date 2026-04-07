package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: FlowExceptions.common.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0081\b\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"checkIndexOverflow", "", "index", "checkOwnership", "", "Lkotlinx/coroutines/flow/internal/AbortFlowException;", "owner", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FlowExceptions_commonKt {
    public static final int checkIndexOverflow(int r3) {
            r0 = 0
            if (r3 < 0) goto L4
            return r3
        L4:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r2 = "Index overflow has happened"
            r1.<init>(r2)
            throw r1
    }

    public static final void checkOwnership(kotlinx.coroutines.flow.internal.AbortFlowException r1, java.lang.Object r2) {
            java.lang.Object r0 = r1.owner
            if (r0 != r2) goto L5
            return
        L5:
            throw r1
    }
}
