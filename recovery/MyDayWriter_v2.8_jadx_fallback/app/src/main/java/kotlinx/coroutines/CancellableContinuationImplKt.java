package kotlinx.coroutines;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0019\u0010\u000e\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0005\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0019\u0010\t\u001a\u00020\u0001*\u00020\u00018Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0019\u0010\f\u001a\u00020\u0001*\u00020\u00018Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"DECISION_SHIFT", "", "INDEX_MASK", "NO_INDEX", "RESUMED", "RESUME_TOKEN", "Lkotlinx/coroutines/internal/Symbol;", "SUSPENDED", "UNDECIDED", "decision", "getDecision", "(I)I", "index", "getIndex", "decisionAndIndex", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CancellableContinuationImplKt {
    private static final int DECISION_SHIFT = 29;
    private static final int INDEX_MASK = 536870911;
    private static final int NO_INDEX = 536870911;
    private static final int RESUMED = 2;
    public static final kotlinx.coroutines.internal.Symbol RESUME_TOKEN = null;
    private static final int SUSPENDED = 1;
    private static final int UNDECIDED = 0;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "RESUME_TOKEN"
            r0.<init>(r1)
            kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN = r0
            return
    }

    private static final int decisionAndIndex(int r2, int r3) {
            r0 = 0
            int r1 = r2 << 29
            int r1 = r1 + r3
            return r1
    }

    private static final int getDecision(int r2) {
            r0 = 0
            int r1 = r2 >> 29
            return r1
    }

    private static final int getIndex(int r2) {
            r0 = 0
            r1 = 536870911(0x1fffffff, float:1.0842021E-19)
            r1 = r1 & r2
            return r1
    }
}
