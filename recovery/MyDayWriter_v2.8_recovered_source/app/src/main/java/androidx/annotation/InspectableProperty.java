package androidx.annotation;

/* JADX INFO: compiled from: InspectableProperty.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017BH\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bR\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u000fR\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0006\u001a\u0004\b\n\u0010\u0010R\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0006\u001a\u0004\b\r\u0010\u0011R\u000f\u0010\u0006\u001a\u00020\u0007¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0012R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0013R\u000f\u0010\b\u001a\u00020\t¢\u0006\u0006\u001a\u0004\b\b\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/annotation/InspectableProperty;", "", "name", "", "attributeId", "", "hasAttributeId", "", "valueType", "Landroidx/annotation/InspectableProperty$ValueType;", "enumMapping", "", "Landroidx/annotation/InspectableProperty$EnumEntry;", "flagMapping", "Landroidx/annotation/InspectableProperty$FlagEntry;", "()I", "()[Landroidx/annotation/InspectableProperty$EnumEntry;", "()[Landroidx/annotation/InspectableProperty$FlagEntry;", "()Z", "()Ljava/lang/String;", "()Landroidx/annotation/InspectableProperty$ValueType;", "EnumEntry", "FlagEntry", "ValueType", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
@kotlin.Deprecated(message = "Replaced by the androidx.resourceinpsection package.")
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
public @interface InspectableProperty {

    /* JADX INFO: compiled from: InspectableProperty.jvm.kt */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006R\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/annotation/InspectableProperty$EnumEntry;", "", "name", "", "value", "", "()Ljava/lang/String;", "()I", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.CLASS})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface EnumEntry {
        java.lang.String name();

        int value();
    }

    /* JADX INFO: compiled from: InspectableProperty.jvm.kt */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005R\u000f\u0010\u0006\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\bR\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/annotation/InspectableProperty$FlagEntry;", "", "name", "", "target", "", "mask", "()I", "()Ljava/lang/String;", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.CLASS})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface FlagEntry {
        int mask() default 0;

        java.lang.String name();

        int target();
    }

    /* JADX INFO: compiled from: InspectableProperty.jvm.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/annotation/InspectableProperty$ValueType;", "", "(Ljava/lang/String;I)V", "NONE", "INFERRED", "INT_ENUM", "INT_FLAG", "COLOR", "GRAVITY", "RESOURCE_ID", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum ValueType extends java.lang.Enum<androidx.annotation.InspectableProperty.ValueType> {
        private static final /* synthetic */ androidx.annotation.InspectableProperty.ValueType[] $VALUES = null;
        public static final androidx.annotation.InspectableProperty.ValueType COLOR = null;
        public static final androidx.annotation.InspectableProperty.ValueType GRAVITY = null;
        public static final androidx.annotation.InspectableProperty.ValueType INFERRED = null;
        public static final androidx.annotation.InspectableProperty.ValueType INT_ENUM = null;
        public static final androidx.annotation.InspectableProperty.ValueType INT_FLAG = null;
        public static final androidx.annotation.InspectableProperty.ValueType NONE = null;
        public static final androidx.annotation.InspectableProperty.ValueType RESOURCE_ID = null;

        private static final /* synthetic */ androidx.annotation.InspectableProperty.ValueType[] $values() {
                androidx.annotation.InspectableProperty$ValueType r0 = androidx.annotation.InspectableProperty.ValueType.NONE
                androidx.annotation.InspectableProperty$ValueType r1 = androidx.annotation.InspectableProperty.ValueType.INFERRED
                androidx.annotation.InspectableProperty$ValueType r2 = androidx.annotation.InspectableProperty.ValueType.INT_ENUM
                androidx.annotation.InspectableProperty$ValueType r3 = androidx.annotation.InspectableProperty.ValueType.INT_FLAG
                androidx.annotation.InspectableProperty$ValueType r4 = androidx.annotation.InspectableProperty.ValueType.COLOR
                androidx.annotation.InspectableProperty$ValueType r5 = androidx.annotation.InspectableProperty.ValueType.GRAVITY
                androidx.annotation.InspectableProperty$ValueType r6 = androidx.annotation.InspectableProperty.ValueType.RESOURCE_ID
                androidx.annotation.InspectableProperty$ValueType[] r0 = new androidx.annotation.InspectableProperty.ValueType[]{r0, r1, r2, r3, r4, r5, r6}
                return r0
        }

        static {
                androidx.annotation.InspectableProperty$ValueType r0 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.annotation.InspectableProperty.ValueType.NONE = r0
                androidx.annotation.InspectableProperty$ValueType r0 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r1 = "INFERRED"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.annotation.InspectableProperty.ValueType.INFERRED = r0
                androidx.annotation.InspectableProperty$ValueType r0 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r1 = "INT_ENUM"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.annotation.InspectableProperty.ValueType.INT_ENUM = r0
                androidx.annotation.InspectableProperty$ValueType r0 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r1 = "INT_FLAG"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.annotation.InspectableProperty.ValueType.INT_FLAG = r0
                androidx.annotation.InspectableProperty$ValueType r0 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r1 = "COLOR"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.annotation.InspectableProperty.ValueType.COLOR = r0
                androidx.annotation.InspectableProperty$ValueType r0 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r1 = "GRAVITY"
                r2 = 5
                r0.<init>(r1, r2)
                androidx.annotation.InspectableProperty.ValueType.GRAVITY = r0
                androidx.annotation.InspectableProperty$ValueType r0 = new androidx.annotation.InspectableProperty$ValueType
                java.lang.String r1 = "RESOURCE_ID"
                r2 = 6
                r0.<init>(r1, r2)
                androidx.annotation.InspectableProperty.ValueType.RESOURCE_ID = r0
                androidx.annotation.InspectableProperty$ValueType[] r0 = $values()
                androidx.annotation.InspectableProperty.ValueType.$VALUES = r0
                return
        }

        ValueType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.annotation.InspectableProperty.ValueType valueOf(java.lang.String r1) {
                java.lang.Class<androidx.annotation.InspectableProperty$ValueType> r0 = androidx.annotation.InspectableProperty.ValueType.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                androidx.annotation.InspectableProperty$ValueType r0 = (androidx.annotation.InspectableProperty.ValueType) r0
                return r0
        }

        public static androidx.annotation.InspectableProperty.ValueType[] values() {
                androidx.annotation.InspectableProperty$ValueType[] r0 = androidx.annotation.InspectableProperty.ValueType.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.annotation.InspectableProperty$ValueType[] r0 = (androidx.annotation.InspectableProperty.ValueType[]) r0
                return r0
        }
    }

    int attributeId() default 0;

    androidx.annotation.InspectableProperty.EnumEntry[] enumMapping() default {};

    androidx.annotation.InspectableProperty.FlagEntry[] flagMapping() default {};

    boolean hasAttributeId() default true;

    java.lang.String name() default "";

    androidx.annotation.InspectableProperty.ValueType valueType() default androidx.annotation.InspectableProperty.ValueType.INFERRED;
}
