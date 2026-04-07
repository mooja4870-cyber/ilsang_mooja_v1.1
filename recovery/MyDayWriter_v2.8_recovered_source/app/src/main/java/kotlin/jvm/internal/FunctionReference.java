package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public class FunctionReference extends kotlin.jvm.internal.CallableReference implements kotlin.jvm.internal.FunctionBase, kotlin.reflect.KFunction {
    private final int arity;
    private final int flags;

    public FunctionReference(int r8) {
            r7 = this;
            java.lang.Object r2 = kotlin.jvm.internal.FunctionReference.NO_RECEIVER
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public FunctionReference(int r8, java.lang.Object r9) {
            r7 = this;
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public FunctionReference(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
            r8 = this;
            r0 = r14 & 1
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            r7 = r1
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r2.arity = r9
            int r10 = r14 >> 1
            r2.flags = r10
            return
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.KCallable computeReflected() {
            r1 = this;
            kotlin.reflect.KFunction r0 = kotlin.jvm.internal.Reflection.function(r1)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof kotlin.jvm.internal.FunctionReference
            r2 = 0
            if (r1 == 0) goto L53
            r1 = r6
            kotlin.jvm.internal.FunctionReference r1 = (kotlin.jvm.internal.FunctionReference) r1
            java.lang.String r3 = r5.getName()
            java.lang.String r4 = r1.getName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L51
            java.lang.String r3 = r5.getSignature()
            java.lang.String r4 = r1.getSignature()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L51
            int r3 = r5.flags
            int r4 = r1.flags
            if (r3 != r4) goto L51
            int r3 = r5.arity
            int r4 = r1.arity
            if (r3 != r4) goto L51
            java.lang.Object r3 = r5.getBoundReceiver()
            java.lang.Object r4 = r1.getBoundReceiver()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L51
            kotlin.reflect.KDeclarationContainer r3 = r5.getOwner()
            kotlin.reflect.KDeclarationContainer r4 = r1.getOwner()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L51
            goto L52
        L51:
            r0 = r2
        L52:
            return r0
        L53:
            boolean r0 = r6 instanceof kotlin.reflect.KFunction
            if (r0 == 0) goto L60
            kotlin.reflect.KCallable r0 = r5.compute()
            boolean r0 = r6.equals(r0)
            return r0
        L60:
            return r2
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
            r1 = this;
            int r0 = r1.arity
            return r0
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected /* bridge */ /* synthetic */ kotlin.reflect.KCallable getReflected() {
            r1 = this;
            kotlin.reflect.KFunction r0 = r1.getReflected()
            return r0
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.KFunction getReflected() {
            r1 = this;
            kotlin.reflect.KCallable r0 = super.getReflected()
            kotlin.reflect.KFunction r0 = (kotlin.reflect.KFunction) r0
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.KDeclarationContainer r0 = r2.getOwner()
            if (r0 != 0) goto L8
            r0 = 0
            goto L12
        L8:
            kotlin.reflect.KDeclarationContainer r0 = r2.getOwner()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
        L12:
            java.lang.String r1 = r2.getName()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.getSignature()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.reflect.KFunction
    public boolean isExternal() {
            r1 = this;
            kotlin.reflect.KFunction r0 = r1.getReflected()
            boolean r0 = r0.isExternal()
            return r0
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInfix() {
            r1 = this;
            kotlin.reflect.KFunction r0 = r1.getReflected()
            boolean r0 = r0.isInfix()
            return r0
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInline() {
            r1 = this;
            kotlin.reflect.KFunction r0 = r1.getReflected()
            boolean r0 = r0.isInline()
            return r0
    }

    @Override // kotlin.reflect.KFunction
    public boolean isOperator() {
            r1 = this;
            kotlin.reflect.KFunction r0 = r1.getReflected()
            boolean r0 = r0.isOperator()
            return r0
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public boolean isSuspend() {
            r1 = this;
            kotlin.reflect.KFunction r0 = r1.getReflected()
            boolean r0 = r0.isSuspend()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            kotlin.reflect.KCallable r0 = r3.compute()
            if (r0 == r3) goto Lb
            java.lang.String r1 = r0.toString()
            return r1
        Lb:
            java.lang.String r1 = "<init>"
            java.lang.String r2 = r3.getName()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1a
            java.lang.String r1 = "constructor (Kotlin reflection is not available)"
            goto L37
        L1a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "function "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " (Kotlin reflection is not available)"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
        L37:
            return r1
    }
}
