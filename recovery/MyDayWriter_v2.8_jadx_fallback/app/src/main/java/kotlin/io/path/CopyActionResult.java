package kotlin.io.path;

/* JADX INFO: compiled from: CopyActionResult.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/path/CopyActionResult;", "", "(Ljava/lang/String;I)V", "CONTINUE", "SKIP_SUBTREE", "TERMINATE", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum CopyActionResult extends java.lang.Enum<kotlin.io.path.CopyActionResult> {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES = null;
    private static final /* synthetic */ kotlin.io.path.CopyActionResult[] $VALUES = null;
    public static final kotlin.io.path.CopyActionResult CONTINUE = null;
    public static final kotlin.io.path.CopyActionResult SKIP_SUBTREE = null;
    public static final kotlin.io.path.CopyActionResult TERMINATE = null;

    private static final /* synthetic */ kotlin.io.path.CopyActionResult[] $values() {
            kotlin.io.path.CopyActionResult r0 = kotlin.io.path.CopyActionResult.CONTINUE
            kotlin.io.path.CopyActionResult r1 = kotlin.io.path.CopyActionResult.SKIP_SUBTREE
            kotlin.io.path.CopyActionResult r2 = kotlin.io.path.CopyActionResult.TERMINATE
            kotlin.io.path.CopyActionResult[] r0 = new kotlin.io.path.CopyActionResult[]{r0, r1, r2}
            return r0
    }

    static {
            kotlin.io.path.CopyActionResult r0 = new kotlin.io.path.CopyActionResult
            java.lang.String r1 = "CONTINUE"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.io.path.CopyActionResult.CONTINUE = r0
            kotlin.io.path.CopyActionResult r0 = new kotlin.io.path.CopyActionResult
            java.lang.String r1 = "SKIP_SUBTREE"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.io.path.CopyActionResult.SKIP_SUBTREE = r0
            kotlin.io.path.CopyActionResult r0 = new kotlin.io.path.CopyActionResult
            java.lang.String r1 = "TERMINATE"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.io.path.CopyActionResult.TERMINATE = r0
            kotlin.io.path.CopyActionResult[] r0 = $values()
            kotlin.io.path.CopyActionResult.$VALUES = r0
            kotlin.io.path.CopyActionResult[] r0 = kotlin.io.path.CopyActionResult.$VALUES
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            kotlin.enums.EnumEntries r0 = kotlin.enums.EnumEntriesKt.enumEntries(r0)
            kotlin.io.path.CopyActionResult.$ENTRIES = r0
            return
    }

    CopyActionResult(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.enums.EnumEntries<kotlin.io.path.CopyActionResult> getEntries() {
            kotlin.enums.EnumEntries r0 = kotlin.io.path.CopyActionResult.$ENTRIES
            return r0
    }

    public static kotlin.io.path.CopyActionResult valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.io.path.CopyActionResult> r0 = kotlin.io.path.CopyActionResult.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            kotlin.io.path.CopyActionResult r0 = (kotlin.io.path.CopyActionResult) r0
            return r0
    }

    public static kotlin.io.path.CopyActionResult[] values() {
            kotlin.io.path.CopyActionResult[] r0 = kotlin.io.path.CopyActionResult.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.io.path.CopyActionResult[] r0 = (kotlin.io.path.CopyActionResult[]) r0
            return r0
    }
}
