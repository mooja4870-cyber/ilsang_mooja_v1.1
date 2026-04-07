package kotlin;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/DeprecationLevel;", "", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "HIDDEN", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum DeprecationLevel extends java.lang.Enum<kotlin.DeprecationLevel> {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES = null;
    private static final /* synthetic */ kotlin.DeprecationLevel[] $VALUES = null;
    public static final kotlin.DeprecationLevel ERROR = null;
    public static final kotlin.DeprecationLevel HIDDEN = null;
    public static final kotlin.DeprecationLevel WARNING = null;

    private static final /* synthetic */ kotlin.DeprecationLevel[] $values() {
            kotlin.DeprecationLevel r0 = kotlin.DeprecationLevel.WARNING
            kotlin.DeprecationLevel r1 = kotlin.DeprecationLevel.ERROR
            kotlin.DeprecationLevel r2 = kotlin.DeprecationLevel.HIDDEN
            kotlin.DeprecationLevel[] r0 = new kotlin.DeprecationLevel[]{r0, r1, r2}
            return r0
    }

    static {
            kotlin.DeprecationLevel r0 = new kotlin.DeprecationLevel
            java.lang.String r1 = "WARNING"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.DeprecationLevel.WARNING = r0
            kotlin.DeprecationLevel r0 = new kotlin.DeprecationLevel
            java.lang.String r1 = "ERROR"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.DeprecationLevel.ERROR = r0
            kotlin.DeprecationLevel r0 = new kotlin.DeprecationLevel
            java.lang.String r1 = "HIDDEN"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.DeprecationLevel.HIDDEN = r0
            kotlin.DeprecationLevel[] r0 = $values()
            kotlin.DeprecationLevel.$VALUES = r0
            kotlin.DeprecationLevel[] r0 = kotlin.DeprecationLevel.$VALUES
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            kotlin.enums.EnumEntries r0 = kotlin.enums.EnumEntriesKt.enumEntries(r0)
            kotlin.DeprecationLevel.$ENTRIES = r0
            return
    }

    DeprecationLevel(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.enums.EnumEntries<kotlin.DeprecationLevel> getEntries() {
            kotlin.enums.EnumEntries r0 = kotlin.DeprecationLevel.$ENTRIES
            return r0
    }

    public static kotlin.DeprecationLevel valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.DeprecationLevel> r0 = kotlin.DeprecationLevel.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            kotlin.DeprecationLevel r0 = (kotlin.DeprecationLevel) r0
            return r0
    }

    public static kotlin.DeprecationLevel[] values() {
            kotlin.DeprecationLevel[] r0 = kotlin.DeprecationLevel.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.DeprecationLevel[] r0 = (kotlin.DeprecationLevel[]) r0
            return r0
    }
}
