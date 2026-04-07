package org.jetbrains.annotations;

/* JADX INFO: loaded from: classes7.dex */
public final class Debug {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface Renderer {
        java.lang.String childrenArray() default "";

        java.lang.String hasChildren() default "";

        java.lang.String text() default "";
    }

    private Debug() {
            r2 = this;
            r2.<init>()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Debug should not be instantiated"
            r0.<init>(r1)
            throw r0
    }
}
