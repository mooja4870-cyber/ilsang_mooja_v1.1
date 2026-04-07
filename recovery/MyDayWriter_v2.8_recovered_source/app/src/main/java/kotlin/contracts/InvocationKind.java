package kotlin.contracts;

/* JADX INFO: compiled from: ContractBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/contracts/InvocationKind;", "", "(Ljava/lang/String;I)V", "AT_MOST_ONCE", "AT_LEAST_ONCE", "EXACTLY_ONCE", "UNKNOWN", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum InvocationKind extends java.lang.Enum<kotlin.contracts.InvocationKind> {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES = null;
    private static final /* synthetic */ kotlin.contracts.InvocationKind[] $VALUES = null;
    public static final kotlin.contracts.InvocationKind AT_LEAST_ONCE = null;
    public static final kotlin.contracts.InvocationKind AT_MOST_ONCE = null;
    public static final kotlin.contracts.InvocationKind EXACTLY_ONCE = null;
    public static final kotlin.contracts.InvocationKind UNKNOWN = null;

    private static final /* synthetic */ kotlin.contracts.InvocationKind[] $values() {
            kotlin.contracts.InvocationKind r0 = kotlin.contracts.InvocationKind.AT_MOST_ONCE
            kotlin.contracts.InvocationKind r1 = kotlin.contracts.InvocationKind.AT_LEAST_ONCE
            kotlin.contracts.InvocationKind r2 = kotlin.contracts.InvocationKind.EXACTLY_ONCE
            kotlin.contracts.InvocationKind r3 = kotlin.contracts.InvocationKind.UNKNOWN
            kotlin.contracts.InvocationKind[] r0 = new kotlin.contracts.InvocationKind[]{r0, r1, r2, r3}
            return r0
    }

    static {
            kotlin.contracts.InvocationKind r0 = new kotlin.contracts.InvocationKind
            java.lang.String r1 = "AT_MOST_ONCE"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.contracts.InvocationKind.AT_MOST_ONCE = r0
            kotlin.contracts.InvocationKind r0 = new kotlin.contracts.InvocationKind
            java.lang.String r1 = "AT_LEAST_ONCE"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.contracts.InvocationKind.AT_LEAST_ONCE = r0
            kotlin.contracts.InvocationKind r0 = new kotlin.contracts.InvocationKind
            java.lang.String r1 = "EXACTLY_ONCE"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.contracts.InvocationKind.EXACTLY_ONCE = r0
            kotlin.contracts.InvocationKind r0 = new kotlin.contracts.InvocationKind
            java.lang.String r1 = "UNKNOWN"
            r2 = 3
            r0.<init>(r1, r2)
            kotlin.contracts.InvocationKind.UNKNOWN = r0
            kotlin.contracts.InvocationKind[] r0 = $values()
            kotlin.contracts.InvocationKind.$VALUES = r0
            kotlin.contracts.InvocationKind[] r0 = kotlin.contracts.InvocationKind.$VALUES
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            kotlin.enums.EnumEntries r0 = kotlin.enums.EnumEntriesKt.enumEntries(r0)
            kotlin.contracts.InvocationKind.$ENTRIES = r0
            return
    }

    InvocationKind(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.enums.EnumEntries<kotlin.contracts.InvocationKind> getEntries() {
            kotlin.enums.EnumEntries r0 = kotlin.contracts.InvocationKind.$ENTRIES
            return r0
    }

    public static kotlin.contracts.InvocationKind valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.contracts.InvocationKind> r0 = kotlin.contracts.InvocationKind.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            kotlin.contracts.InvocationKind r0 = (kotlin.contracts.InvocationKind) r0
            return r0
    }

    public static kotlin.contracts.InvocationKind[] values() {
            kotlin.contracts.InvocationKind[] r0 = kotlin.contracts.InvocationKind.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.contracts.InvocationKind[] r0 = (kotlin.contracts.InvocationKind[]) r0
            return r0
    }
}
