package kotlin.annotation;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/annotation/AnnotationTarget;", "", "(Ljava/lang/String;I)V", "CLASS", "ANNOTATION_CLASS", "TYPE_PARAMETER", "PROPERTY", "FIELD", "LOCAL_VARIABLE", "VALUE_PARAMETER", "CONSTRUCTOR", "FUNCTION", "PROPERTY_GETTER", "PROPERTY_SETTER", "TYPE", "EXPRESSION", "FILE", "TYPEALIAS", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum AnnotationTarget extends java.lang.Enum<kotlin.annotation.AnnotationTarget> {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES = null;
    private static final /* synthetic */ kotlin.annotation.AnnotationTarget[] $VALUES = null;
    public static final kotlin.annotation.AnnotationTarget ANNOTATION_CLASS = null;
    public static final kotlin.annotation.AnnotationTarget CLASS = null;
    public static final kotlin.annotation.AnnotationTarget CONSTRUCTOR = null;
    public static final kotlin.annotation.AnnotationTarget EXPRESSION = null;
    public static final kotlin.annotation.AnnotationTarget FIELD = null;
    public static final kotlin.annotation.AnnotationTarget FILE = null;
    public static final kotlin.annotation.AnnotationTarget FUNCTION = null;
    public static final kotlin.annotation.AnnotationTarget LOCAL_VARIABLE = null;
    public static final kotlin.annotation.AnnotationTarget PROPERTY = null;
    public static final kotlin.annotation.AnnotationTarget PROPERTY_GETTER = null;
    public static final kotlin.annotation.AnnotationTarget PROPERTY_SETTER = null;
    public static final kotlin.annotation.AnnotationTarget TYPE = null;
    public static final kotlin.annotation.AnnotationTarget TYPEALIAS = null;
    public static final kotlin.annotation.AnnotationTarget TYPE_PARAMETER = null;
    public static final kotlin.annotation.AnnotationTarget VALUE_PARAMETER = null;

    private static final /* synthetic */ kotlin.annotation.AnnotationTarget[] $values() {
            kotlin.annotation.AnnotationTarget r0 = kotlin.annotation.AnnotationTarget.CLASS
            kotlin.annotation.AnnotationTarget r1 = kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS
            kotlin.annotation.AnnotationTarget r2 = kotlin.annotation.AnnotationTarget.TYPE_PARAMETER
            kotlin.annotation.AnnotationTarget r3 = kotlin.annotation.AnnotationTarget.PROPERTY
            kotlin.annotation.AnnotationTarget r4 = kotlin.annotation.AnnotationTarget.FIELD
            kotlin.annotation.AnnotationTarget r5 = kotlin.annotation.AnnotationTarget.LOCAL_VARIABLE
            kotlin.annotation.AnnotationTarget r6 = kotlin.annotation.AnnotationTarget.VALUE_PARAMETER
            kotlin.annotation.AnnotationTarget r7 = kotlin.annotation.AnnotationTarget.CONSTRUCTOR
            kotlin.annotation.AnnotationTarget r8 = kotlin.annotation.AnnotationTarget.FUNCTION
            kotlin.annotation.AnnotationTarget r9 = kotlin.annotation.AnnotationTarget.PROPERTY_GETTER
            kotlin.annotation.AnnotationTarget r10 = kotlin.annotation.AnnotationTarget.PROPERTY_SETTER
            kotlin.annotation.AnnotationTarget r11 = kotlin.annotation.AnnotationTarget.TYPE
            kotlin.annotation.AnnotationTarget r12 = kotlin.annotation.AnnotationTarget.EXPRESSION
            kotlin.annotation.AnnotationTarget r13 = kotlin.annotation.AnnotationTarget.FILE
            kotlin.annotation.AnnotationTarget r14 = kotlin.annotation.AnnotationTarget.TYPEALIAS
            kotlin.annotation.AnnotationTarget[] r0 = new kotlin.annotation.AnnotationTarget[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}
            return r0
    }

    static {
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "CLASS"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.CLASS = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "ANNOTATION_CLASS"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "TYPE_PARAMETER"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.TYPE_PARAMETER = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "PROPERTY"
            r2 = 3
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.PROPERTY = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "FIELD"
            r2 = 4
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.FIELD = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "LOCAL_VARIABLE"
            r2 = 5
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.LOCAL_VARIABLE = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "VALUE_PARAMETER"
            r2 = 6
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.VALUE_PARAMETER = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "CONSTRUCTOR"
            r2 = 7
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.CONSTRUCTOR = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "FUNCTION"
            r2 = 8
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.FUNCTION = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "PROPERTY_GETTER"
            r2 = 9
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.PROPERTY_GETTER = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "PROPERTY_SETTER"
            r2 = 10
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.PROPERTY_SETTER = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "TYPE"
            r2 = 11
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.TYPE = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "EXPRESSION"
            r2 = 12
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.EXPRESSION = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "FILE"
            r2 = 13
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.FILE = r0
            kotlin.annotation.AnnotationTarget r0 = new kotlin.annotation.AnnotationTarget
            java.lang.String r1 = "TYPEALIAS"
            r2 = 14
            r0.<init>(r1, r2)
            kotlin.annotation.AnnotationTarget.TYPEALIAS = r0
            kotlin.annotation.AnnotationTarget[] r0 = $values()
            kotlin.annotation.AnnotationTarget.$VALUES = r0
            kotlin.annotation.AnnotationTarget[] r0 = kotlin.annotation.AnnotationTarget.$VALUES
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            kotlin.enums.EnumEntries r0 = kotlin.enums.EnumEntriesKt.enumEntries(r0)
            kotlin.annotation.AnnotationTarget.$ENTRIES = r0
            return
    }

    AnnotationTarget(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.enums.EnumEntries<kotlin.annotation.AnnotationTarget> getEntries() {
            kotlin.enums.EnumEntries r0 = kotlin.annotation.AnnotationTarget.$ENTRIES
            return r0
    }

    public static kotlin.annotation.AnnotationTarget valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.annotation.AnnotationTarget> r0 = kotlin.annotation.AnnotationTarget.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            kotlin.annotation.AnnotationTarget r0 = (kotlin.annotation.AnnotationTarget) r0
            return r0
    }

    public static kotlin.annotation.AnnotationTarget[] values() {
            kotlin.annotation.AnnotationTarget[] r0 = kotlin.annotation.AnnotationTarget.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.annotation.AnnotationTarget[] r0 = (kotlin.annotation.AnnotationTarget[]) r0
            return r0
    }
}
