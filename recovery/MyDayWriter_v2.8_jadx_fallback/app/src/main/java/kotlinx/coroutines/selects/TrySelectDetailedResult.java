package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "", "(Ljava/lang/String;I)V", "SUCCESSFUL", "REREGISTER", "CANCELLED", "ALREADY_SELECTED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum TrySelectDetailedResult extends java.lang.Enum<kotlinx.coroutines.selects.TrySelectDetailedResult> {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES = null;
    private static final /* synthetic */ kotlinx.coroutines.selects.TrySelectDetailedResult[] $VALUES = null;
    public static final kotlinx.coroutines.selects.TrySelectDetailedResult ALREADY_SELECTED = null;
    public static final kotlinx.coroutines.selects.TrySelectDetailedResult CANCELLED = null;
    public static final kotlinx.coroutines.selects.TrySelectDetailedResult REREGISTER = null;
    public static final kotlinx.coroutines.selects.TrySelectDetailedResult SUCCESSFUL = null;

    private static final /* synthetic */ kotlinx.coroutines.selects.TrySelectDetailedResult[] $values() {
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = kotlinx.coroutines.selects.TrySelectDetailedResult.SUCCESSFUL
            kotlinx.coroutines.selects.TrySelectDetailedResult r1 = kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER
            kotlinx.coroutines.selects.TrySelectDetailedResult r2 = kotlinx.coroutines.selects.TrySelectDetailedResult.CANCELLED
            kotlinx.coroutines.selects.TrySelectDetailedResult r3 = kotlinx.coroutines.selects.TrySelectDetailedResult.ALREADY_SELECTED
            kotlinx.coroutines.selects.TrySelectDetailedResult[] r0 = new kotlinx.coroutines.selects.TrySelectDetailedResult[]{r0, r1, r2, r3}
            return r0
    }

    static {
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = new kotlinx.coroutines.selects.TrySelectDetailedResult
            java.lang.String r1 = "SUCCESSFUL"
            r2 = 0
            r0.<init>(r1, r2)
            kotlinx.coroutines.selects.TrySelectDetailedResult.SUCCESSFUL = r0
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = new kotlinx.coroutines.selects.TrySelectDetailedResult
            java.lang.String r1 = "REREGISTER"
            r2 = 1
            r0.<init>(r1, r2)
            kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER = r0
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = new kotlinx.coroutines.selects.TrySelectDetailedResult
            java.lang.String r1 = "CANCELLED"
            r2 = 2
            r0.<init>(r1, r2)
            kotlinx.coroutines.selects.TrySelectDetailedResult.CANCELLED = r0
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = new kotlinx.coroutines.selects.TrySelectDetailedResult
            java.lang.String r1 = "ALREADY_SELECTED"
            r2 = 3
            r0.<init>(r1, r2)
            kotlinx.coroutines.selects.TrySelectDetailedResult.ALREADY_SELECTED = r0
            kotlinx.coroutines.selects.TrySelectDetailedResult[] r0 = $values()
            kotlinx.coroutines.selects.TrySelectDetailedResult.$VALUES = r0
            kotlinx.coroutines.selects.TrySelectDetailedResult[] r0 = kotlinx.coroutines.selects.TrySelectDetailedResult.$VALUES
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            kotlin.enums.EnumEntries r0 = kotlin.enums.EnumEntriesKt.enumEntries(r0)
            kotlinx.coroutines.selects.TrySelectDetailedResult.$ENTRIES = r0
            return
    }

    TrySelectDetailedResult(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.enums.EnumEntries<kotlinx.coroutines.selects.TrySelectDetailedResult> getEntries() {
            kotlin.enums.EnumEntries r0 = kotlinx.coroutines.selects.TrySelectDetailedResult.$ENTRIES
            return r0
    }

    public static kotlinx.coroutines.selects.TrySelectDetailedResult valueOf(java.lang.String r1) {
            java.lang.Class<kotlinx.coroutines.selects.TrySelectDetailedResult> r0 = kotlinx.coroutines.selects.TrySelectDetailedResult.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = (kotlinx.coroutines.selects.TrySelectDetailedResult) r0
            return r0
    }

    public static kotlinx.coroutines.selects.TrySelectDetailedResult[] values() {
            kotlinx.coroutines.selects.TrySelectDetailedResult[] r0 = kotlinx.coroutines.selects.TrySelectDetailedResult.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlinx.coroutines.selects.TrySelectDetailedResult[] r0 = (kotlinx.coroutines.selects.TrySelectDetailedResult[]) r0
            return r0
    }
}
