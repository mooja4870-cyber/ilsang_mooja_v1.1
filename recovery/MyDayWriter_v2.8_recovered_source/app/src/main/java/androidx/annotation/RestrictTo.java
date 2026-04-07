package androidx.annotation;

/* JADX INFO: compiled from: RestrictTo.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PACKAGE})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.CONSTRUCTOR, kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.FILE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
@kotlin.annotation.MustBeDocumented
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u0014\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004R\u0017\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/annotation/RestrictTo;", "", "value", "", "Landroidx/annotation/RestrictTo$Scope;", "()[Landroidx/annotation/RestrictTo$Scope;", "Scope", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
@java.lang.annotation.Documented
public @interface RestrictTo {

    /* JADX INFO: compiled from: RestrictTo.jvm.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/annotation/RestrictTo$Scope;", "", "(Ljava/lang/String;I)V", "LIBRARY", "LIBRARY_GROUP", "LIBRARY_GROUP_PREFIX", "GROUP_ID", "TESTS", "SUBCLASSES", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum Scope extends java.lang.Enum<androidx.annotation.RestrictTo.Scope> {
        private static final /* synthetic */ androidx.annotation.RestrictTo.Scope[] $VALUES = null;

        @kotlin.Deprecated(message = "Use LIBRARY_GROUP_PREFIX instead.")
        public static final androidx.annotation.RestrictTo.Scope GROUP_ID = null;
        public static final androidx.annotation.RestrictTo.Scope LIBRARY = null;
        public static final androidx.annotation.RestrictTo.Scope LIBRARY_GROUP = null;
        public static final androidx.annotation.RestrictTo.Scope LIBRARY_GROUP_PREFIX = null;
        public static final androidx.annotation.RestrictTo.Scope SUBCLASSES = null;
        public static final androidx.annotation.RestrictTo.Scope TESTS = null;

        private static final /* synthetic */ androidx.annotation.RestrictTo.Scope[] $values() {
                androidx.annotation.RestrictTo$Scope r0 = androidx.annotation.RestrictTo.Scope.LIBRARY
                androidx.annotation.RestrictTo$Scope r1 = androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP
                androidx.annotation.RestrictTo$Scope r2 = androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX
                androidx.annotation.RestrictTo$Scope r3 = androidx.annotation.RestrictTo.Scope.GROUP_ID
                androidx.annotation.RestrictTo$Scope r4 = androidx.annotation.RestrictTo.Scope.TESTS
                androidx.annotation.RestrictTo$Scope r5 = androidx.annotation.RestrictTo.Scope.SUBCLASSES
                androidx.annotation.RestrictTo$Scope[] r0 = new androidx.annotation.RestrictTo.Scope[]{r0, r1, r2, r3, r4, r5}
                return r0
        }

        static {
                androidx.annotation.RestrictTo$Scope r0 = new androidx.annotation.RestrictTo$Scope
                java.lang.String r1 = "LIBRARY"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.annotation.RestrictTo.Scope.LIBRARY = r0
                androidx.annotation.RestrictTo$Scope r0 = new androidx.annotation.RestrictTo$Scope
                java.lang.String r1 = "LIBRARY_GROUP"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP = r0
                androidx.annotation.RestrictTo$Scope r0 = new androidx.annotation.RestrictTo$Scope
                java.lang.String r1 = "LIBRARY_GROUP_PREFIX"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX = r0
                androidx.annotation.RestrictTo$Scope r0 = new androidx.annotation.RestrictTo$Scope
                java.lang.String r1 = "GROUP_ID"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.annotation.RestrictTo.Scope.GROUP_ID = r0
                androidx.annotation.RestrictTo$Scope r0 = new androidx.annotation.RestrictTo$Scope
                java.lang.String r1 = "TESTS"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.annotation.RestrictTo.Scope.TESTS = r0
                androidx.annotation.RestrictTo$Scope r0 = new androidx.annotation.RestrictTo$Scope
                java.lang.String r1 = "SUBCLASSES"
                r2 = 5
                r0.<init>(r1, r2)
                androidx.annotation.RestrictTo.Scope.SUBCLASSES = r0
                androidx.annotation.RestrictTo$Scope[] r0 = $values()
                androidx.annotation.RestrictTo.Scope.$VALUES = r0
                return
        }

        Scope(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.annotation.RestrictTo.Scope valueOf(java.lang.String r1) {
                java.lang.Class<androidx.annotation.RestrictTo$Scope> r0 = androidx.annotation.RestrictTo.Scope.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                androidx.annotation.RestrictTo$Scope r0 = (androidx.annotation.RestrictTo.Scope) r0
                return r0
        }

        public static androidx.annotation.RestrictTo.Scope[] values() {
                androidx.annotation.RestrictTo$Scope[] r0 = androidx.annotation.RestrictTo.Scope.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.annotation.RestrictTo$Scope[] r0 = (androidx.annotation.RestrictTo.Scope[]) r0
                return r0
        }
    }

    androidx.annotation.RestrictTo.Scope[] value();
}
