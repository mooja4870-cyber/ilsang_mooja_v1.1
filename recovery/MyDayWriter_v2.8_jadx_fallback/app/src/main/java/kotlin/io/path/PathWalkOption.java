package kotlin.io.path;

/* JADX INFO: compiled from: PathWalkOption.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/path/PathWalkOption;", "", "(Ljava/lang/String;I)V", "INCLUDE_DIRECTORIES", "BREADTH_FIRST", "FOLLOW_LINKS", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum PathWalkOption extends java.lang.Enum<kotlin.io.path.PathWalkOption> {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES = null;
    private static final /* synthetic */ kotlin.io.path.PathWalkOption[] $VALUES = null;
    public static final kotlin.io.path.PathWalkOption BREADTH_FIRST = null;
    public static final kotlin.io.path.PathWalkOption FOLLOW_LINKS = null;
    public static final kotlin.io.path.PathWalkOption INCLUDE_DIRECTORIES = null;

    private static final /* synthetic */ kotlin.io.path.PathWalkOption[] $values() {
            kotlin.io.path.PathWalkOption r0 = kotlin.io.path.PathWalkOption.INCLUDE_DIRECTORIES
            kotlin.io.path.PathWalkOption r1 = kotlin.io.path.PathWalkOption.BREADTH_FIRST
            kotlin.io.path.PathWalkOption r2 = kotlin.io.path.PathWalkOption.FOLLOW_LINKS
            kotlin.io.path.PathWalkOption[] r0 = new kotlin.io.path.PathWalkOption[]{r0, r1, r2}
            return r0
    }

    static {
            kotlin.io.path.PathWalkOption r0 = new kotlin.io.path.PathWalkOption
            java.lang.String r1 = "INCLUDE_DIRECTORIES"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.io.path.PathWalkOption.INCLUDE_DIRECTORIES = r0
            kotlin.io.path.PathWalkOption r0 = new kotlin.io.path.PathWalkOption
            java.lang.String r1 = "BREADTH_FIRST"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.io.path.PathWalkOption.BREADTH_FIRST = r0
            kotlin.io.path.PathWalkOption r0 = new kotlin.io.path.PathWalkOption
            java.lang.String r1 = "FOLLOW_LINKS"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.io.path.PathWalkOption.FOLLOW_LINKS = r0
            kotlin.io.path.PathWalkOption[] r0 = $values()
            kotlin.io.path.PathWalkOption.$VALUES = r0
            kotlin.io.path.PathWalkOption[] r0 = kotlin.io.path.PathWalkOption.$VALUES
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            kotlin.enums.EnumEntries r0 = kotlin.enums.EnumEntriesKt.enumEntries(r0)
            kotlin.io.path.PathWalkOption.$ENTRIES = r0
            return
    }

    PathWalkOption(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.enums.EnumEntries<kotlin.io.path.PathWalkOption> getEntries() {
            kotlin.enums.EnumEntries r0 = kotlin.io.path.PathWalkOption.$ENTRIES
            return r0
    }

    public static kotlin.io.path.PathWalkOption valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.io.path.PathWalkOption> r0 = kotlin.io.path.PathWalkOption.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            kotlin.io.path.PathWalkOption r0 = (kotlin.io.path.PathWalkOption) r0
            return r0
    }

    public static kotlin.io.path.PathWalkOption[] values() {
            kotlin.io.path.PathWalkOption[] r0 = kotlin.io.path.PathWalkOption.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.io.path.PathWalkOption[] r0 = (kotlin.io.path.PathWalkOption[]) r0
            return r0
    }
}
