package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e*\u0004\u0018\u00010\u000eH\u0000\u001a\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u0004\u0018\u00010\u000eH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"COMPLETING_ALREADY", "Lkotlinx/coroutines/internal/Symbol;", "COMPLETING_RETRY", "COMPLETING_WAITING_CHILDREN", "EMPTY_ACTIVE", "Lkotlinx/coroutines/Empty;", "EMPTY_NEW", "FALSE", "", "RETRY", "SEALED", "TOO_LATE_TO_CANCEL", "TRUE", "boxIncomplete", "", "unboxState", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class JobSupportKt {
    private static final kotlinx.coroutines.internal.Symbol COMPLETING_ALREADY = null;
    private static final kotlinx.coroutines.internal.Symbol COMPLETING_RETRY = null;
    public static final kotlinx.coroutines.internal.Symbol COMPLETING_WAITING_CHILDREN = null;
    private static final kotlinx.coroutines.Empty EMPTY_ACTIVE = null;
    private static final kotlinx.coroutines.Empty EMPTY_NEW = null;
    private static final int FALSE = 0;
    private static final int RETRY = -1;
    private static final kotlinx.coroutines.internal.Symbol SEALED = null;
    private static final kotlinx.coroutines.internal.Symbol TOO_LATE_TO_CANCEL = null;
    private static final int TRUE = 1;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "COMPLETING_ALREADY"
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "COMPLETING_WAITING_CHILDREN"
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "COMPLETING_RETRY"
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.COMPLETING_RETRY = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "TOO_LATE_TO_CANCEL"
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.TOO_LATE_TO_CANCEL = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "SEALED"
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.SEALED = r0
            kotlinx.coroutines.Empty r0 = new kotlinx.coroutines.Empty
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.EMPTY_NEW = r0
            kotlinx.coroutines.Empty r0 = new kotlinx.coroutines.Empty
            r1 = 1
            r0.<init>(r1)
            kotlinx.coroutines.JobSupportKt.EMPTY_ACTIVE = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getCOMPLETING_ALREADY$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.COMPLETING_ALREADY
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getCOMPLETING_RETRY$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.COMPLETING_RETRY
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.Empty access$getEMPTY_ACTIVE$p() {
            kotlinx.coroutines.Empty r0 = kotlinx.coroutines.JobSupportKt.EMPTY_ACTIVE
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.Empty access$getEMPTY_NEW$p() {
            kotlinx.coroutines.Empty r0 = kotlinx.coroutines.JobSupportKt.EMPTY_NEW
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getSEALED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.SEALED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getTOO_LATE_TO_CANCEL$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.TOO_LATE_TO_CANCEL
            return r0
    }

    public static final java.lang.Object boxIncomplete(java.lang.Object r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.Incomplete
            if (r0 == 0) goto Ld
            kotlinx.coroutines.IncompleteStateBox r0 = new kotlinx.coroutines.IncompleteStateBox
            r1 = r2
            kotlinx.coroutines.Incomplete r1 = (kotlinx.coroutines.Incomplete) r1
            r0.<init>(r1)
            goto Le
        Ld:
            r0 = r2
        Le:
            return r0
    }

    public static final java.lang.Object unboxState(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.IncompleteStateBox
            if (r0 == 0) goto L8
            r0 = r1
            kotlinx.coroutines.IncompleteStateBox r0 = (kotlinx.coroutines.IncompleteStateBox) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Lf
            kotlinx.coroutines.Incomplete r0 = r0.state
            if (r0 != 0) goto L10
        Lf:
            r0 = r1
        L10:
            return r0
    }
}
