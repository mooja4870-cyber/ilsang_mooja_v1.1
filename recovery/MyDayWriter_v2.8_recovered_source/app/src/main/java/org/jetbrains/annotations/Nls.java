package org.jetbrains.annotations;

/* JADX INFO: loaded from: classes7.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.PACKAGE})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface Nls {

    public enum Capitalization extends java.lang.Enum<org.jetbrains.annotations.Nls.Capitalization> {
        private static final /* synthetic */ org.jetbrains.annotations.Nls.Capitalization[] $VALUES = null;
        public static final org.jetbrains.annotations.Nls.Capitalization NotSpecified = null;
        public static final org.jetbrains.annotations.Nls.Capitalization Sentence = null;
        public static final org.jetbrains.annotations.Nls.Capitalization Title = null;

        static {
                org.jetbrains.annotations.Nls$Capitalization r0 = new org.jetbrains.annotations.Nls$Capitalization
                java.lang.String r1 = "NotSpecified"
                r2 = 0
                r0.<init>(r1, r2)
                org.jetbrains.annotations.Nls.Capitalization.NotSpecified = r0
                org.jetbrains.annotations.Nls$Capitalization r0 = new org.jetbrains.annotations.Nls$Capitalization
                java.lang.String r1 = "Title"
                r2 = 1
                r0.<init>(r1, r2)
                org.jetbrains.annotations.Nls.Capitalization.Title = r0
                org.jetbrains.annotations.Nls$Capitalization r0 = new org.jetbrains.annotations.Nls$Capitalization
                java.lang.String r1 = "Sentence"
                r2 = 2
                r0.<init>(r1, r2)
                org.jetbrains.annotations.Nls.Capitalization.Sentence = r0
                org.jetbrains.annotations.Nls$Capitalization r0 = org.jetbrains.annotations.Nls.Capitalization.NotSpecified
                org.jetbrains.annotations.Nls$Capitalization r1 = org.jetbrains.annotations.Nls.Capitalization.Title
                org.jetbrains.annotations.Nls$Capitalization r2 = org.jetbrains.annotations.Nls.Capitalization.Sentence
                org.jetbrains.annotations.Nls$Capitalization[] r0 = new org.jetbrains.annotations.Nls.Capitalization[]{r0, r1, r2}
                org.jetbrains.annotations.Nls.Capitalization.$VALUES = r0
                return
        }

        Capitalization(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.jetbrains.annotations.Nls.Capitalization valueOf(java.lang.String r1) {
                java.lang.Class<org.jetbrains.annotations.Nls$Capitalization> r0 = org.jetbrains.annotations.Nls.Capitalization.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.jetbrains.annotations.Nls$Capitalization r0 = (org.jetbrains.annotations.Nls.Capitalization) r0
                return r0
        }

        public static org.jetbrains.annotations.Nls.Capitalization[] values() {
                org.jetbrains.annotations.Nls$Capitalization[] r0 = org.jetbrains.annotations.Nls.Capitalization.$VALUES
                java.lang.Object r0 = r0.clone()
                org.jetbrains.annotations.Nls$Capitalization[] r0 = (org.jetbrains.annotations.Nls.Capitalization[]) r0
                return r0
        }
    }

    org.jetbrains.annotations.Nls.Capitalization capitalization() default org.jetbrains.annotations.Nls.Capitalization.NotSpecified;
}
