package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class PropertyReference1 extends kotlin.jvm.internal.PropertyReference implements kotlin.reflect.KProperty1 {
    public PropertyReference1() {
            r0 = this;
            r0.<init>()
            return
    }

    public PropertyReference1(java.lang.Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public PropertyReference1(java.lang.Object r1, java.lang.Class r2, java.lang.String r3, java.lang.String r4, int r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.KCallable computeReflected() {
            r1 = this;
            kotlin.reflect.KProperty1 r0 = kotlin.jvm.internal.Reflection.property1(r1)
            return r0
    }

    @Override // kotlin.reflect.KProperty1
    public java.lang.Object getDelegate(java.lang.Object r2) {
            r1 = this;
            kotlin.reflect.KProperty r0 = r1.getReflected()
            kotlin.reflect.KProperty1 r0 = (kotlin.reflect.KProperty1) r0
            java.lang.Object r0 = r0.getDelegate(r2)
            return r0
    }

    @Override // kotlin.reflect.KProperty
    public /* bridge */ /* synthetic */ kotlin.reflect.KProperty.Getter getGetter() {
            r1 = this;
            kotlin.reflect.KProperty1$Getter r0 = r1.getGetter()
            return r0
    }

    @Override // kotlin.reflect.KProperty
    public kotlin.reflect.KProperty1.Getter getGetter() {
            r1 = this;
            kotlin.reflect.KProperty r0 = r1.getReflected()
            kotlin.reflect.KProperty1 r0 = (kotlin.reflect.KProperty1) r0
            kotlin.reflect.KProperty1$Getter r0 = r0.getGetter()
            return r0
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.get(r2)
            return r0
    }
}
