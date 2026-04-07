package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public class PropertyReference2Impl extends kotlin.jvm.internal.PropertyReference2 {
    public PropertyReference2Impl(java.lang.Class r1, java.lang.String r2, java.lang.String r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public PropertyReference2Impl(kotlin.reflect.KDeclarationContainer r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            r0 = r3
            kotlin.jvm.internal.ClassBasedDeclarationContainer r0 = (kotlin.jvm.internal.ClassBasedDeclarationContainer) r0
            java.lang.Class r0 = r0.getJClass()
            boolean r1 = r3 instanceof kotlin.reflect.KClass
            r1 = r1 ^ 1
            r2.<init>(r0, r4, r5, r1)
            return
    }

    @Override // kotlin.reflect.KProperty2
    public java.lang.Object get(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            kotlin.reflect.KProperty2$Getter r0 = r2.getGetter()
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4}
            java.lang.Object r0 = r0.call(r1)
            return r0
    }
}
