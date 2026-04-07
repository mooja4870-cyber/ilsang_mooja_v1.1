package kotlin.reflect;

/* JADX INFO: compiled from: KVisibility.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/KVisibility;", "", "(Ljava/lang/String;I)V", "PUBLIC", "PROTECTED", "INTERNAL", "PRIVATE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum KVisibility extends java.lang.Enum<kotlin.reflect.KVisibility> {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.KVisibility[] $VALUES = null;
    public static final kotlin.reflect.KVisibility INTERNAL = null;
    public static final kotlin.reflect.KVisibility PRIVATE = null;
    public static final kotlin.reflect.KVisibility PROTECTED = null;
    public static final kotlin.reflect.KVisibility PUBLIC = null;

    private static final /* synthetic */ kotlin.reflect.KVisibility[] $values() {
            kotlin.reflect.KVisibility r0 = kotlin.reflect.KVisibility.PUBLIC
            kotlin.reflect.KVisibility r1 = kotlin.reflect.KVisibility.PROTECTED
            kotlin.reflect.KVisibility r2 = kotlin.reflect.KVisibility.INTERNAL
            kotlin.reflect.KVisibility r3 = kotlin.reflect.KVisibility.PRIVATE
            kotlin.reflect.KVisibility[] r0 = new kotlin.reflect.KVisibility[]{r0, r1, r2, r3}
            return r0
    }

    static {
            kotlin.reflect.KVisibility r0 = new kotlin.reflect.KVisibility
            java.lang.String r1 = "PUBLIC"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.KVisibility.PUBLIC = r0
            kotlin.reflect.KVisibility r0 = new kotlin.reflect.KVisibility
            java.lang.String r1 = "PROTECTED"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.KVisibility.PROTECTED = r0
            kotlin.reflect.KVisibility r0 = new kotlin.reflect.KVisibility
            java.lang.String r1 = "INTERNAL"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.reflect.KVisibility.INTERNAL = r0
            kotlin.reflect.KVisibility r0 = new kotlin.reflect.KVisibility
            java.lang.String r1 = "PRIVATE"
            r2 = 3
            r0.<init>(r1, r2)
            kotlin.reflect.KVisibility.PRIVATE = r0
            kotlin.reflect.KVisibility[] r0 = $values()
            kotlin.reflect.KVisibility.$VALUES = r0
            kotlin.reflect.KVisibility[] r0 = kotlin.reflect.KVisibility.$VALUES
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            kotlin.enums.EnumEntries r0 = kotlin.enums.EnumEntriesKt.enumEntries(r0)
            kotlin.reflect.KVisibility.$ENTRIES = r0
            return
    }

    KVisibility(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.enums.EnumEntries<kotlin.reflect.KVisibility> getEntries() {
            kotlin.enums.EnumEntries r0 = kotlin.reflect.KVisibility.$ENTRIES
            return r0
    }

    public static kotlin.reflect.KVisibility valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.KVisibility> r0 = kotlin.reflect.KVisibility.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.KVisibility r0 = (kotlin.reflect.KVisibility) r0
            return r0
    }

    public static kotlin.reflect.KVisibility[] values() {
            kotlin.reflect.KVisibility[] r0 = kotlin.reflect.KVisibility.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.KVisibility[] r0 = (kotlin.reflect.KVisibility[]) r0
            return r0
    }
}
