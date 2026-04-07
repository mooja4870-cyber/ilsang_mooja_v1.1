package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public class FunInterfaceConstructorReference extends kotlin.jvm.internal.FunctionReference implements java.io.Serializable {
    private final java.lang.Class funInterface;

    public FunInterfaceConstructorReference(java.lang.Class r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r1.funInterface = r2
            return
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r0 = 1
            return r0
        L4:
            boolean r0 = r4 instanceof kotlin.jvm.internal.FunInterfaceConstructorReference
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            r0 = r4
            kotlin.jvm.internal.FunInterfaceConstructorReference r0 = (kotlin.jvm.internal.FunInterfaceConstructorReference) r0
            java.lang.Class r1 = r3.funInterface
            java.lang.Class r2 = r0.funInterface
            boolean r1 = r1.equals(r2)
            return r1
    }

    @Override // kotlin.jvm.internal.FunctionReference, kotlin.jvm.internal.CallableReference
    protected /* bridge */ /* synthetic */ kotlin.reflect.KCallable getReflected() {
            r1 = this;
            kotlin.reflect.KFunction r0 = r1.getReflected()
            return r0
    }

    @Override // kotlin.jvm.internal.FunctionReference, kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.KFunction getReflected() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Functional interface constructor does not support reflection"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public int hashCode() {
            r1 = this;
            java.lang.Class r0 = r1.funInterface
            int r0 = r0.hashCode()
            return r0
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "fun interface "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Class r1 = r2.funInterface
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
