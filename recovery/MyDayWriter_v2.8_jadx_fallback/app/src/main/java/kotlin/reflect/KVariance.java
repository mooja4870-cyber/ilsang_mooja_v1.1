package kotlin.reflect;

/* JADX INFO: compiled from: KVariance.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/KVariance;", "", "(Ljava/lang/String;I)V", "INVARIANT", "IN", "OUT", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum KVariance extends java.lang.Enum<kotlin.reflect.KVariance> {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.KVariance[] $VALUES = null;
    public static final kotlin.reflect.KVariance IN = null;
    public static final kotlin.reflect.KVariance INVARIANT = null;
    public static final kotlin.reflect.KVariance OUT = null;

    private static final /* synthetic */ kotlin.reflect.KVariance[] $values() {
            kotlin.reflect.KVariance r0 = kotlin.reflect.KVariance.INVARIANT
            kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.IN
            kotlin.reflect.KVariance r2 = kotlin.reflect.KVariance.OUT
            kotlin.reflect.KVariance[] r0 = new kotlin.reflect.KVariance[]{r0, r1, r2}
            return r0
    }

    static {
            kotlin.reflect.KVariance r0 = new kotlin.reflect.KVariance
            java.lang.String r1 = "INVARIANT"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.KVariance.INVARIANT = r0
            kotlin.reflect.KVariance r0 = new kotlin.reflect.KVariance
            java.lang.String r1 = "IN"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.KVariance.IN = r0
            kotlin.reflect.KVariance r0 = new kotlin.reflect.KVariance
            java.lang.String r1 = "OUT"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.reflect.KVariance.OUT = r0
            kotlin.reflect.KVariance[] r0 = $values()
            kotlin.reflect.KVariance.$VALUES = r0
            kotlin.reflect.KVariance[] r0 = kotlin.reflect.KVariance.$VALUES
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            kotlin.enums.EnumEntries r0 = kotlin.enums.EnumEntriesKt.enumEntries(r0)
            kotlin.reflect.KVariance.$ENTRIES = r0
            return
    }

    KVariance(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.enums.EnumEntries<kotlin.reflect.KVariance> getEntries() {
            kotlin.enums.EnumEntries r0 = kotlin.reflect.KVariance.$ENTRIES
            return r0
    }

    public static kotlin.reflect.KVariance valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.KVariance> r0 = kotlin.reflect.KVariance.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.KVariance r0 = (kotlin.reflect.KVariance) r0
            return r0
    }

    public static kotlin.reflect.KVariance[] values() {
            kotlin.reflect.KVariance[] r0 = kotlin.reflect.KVariance.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.KVariance[] r0 = (kotlin.reflect.KVariance[]) r0
            return r0
    }
}
