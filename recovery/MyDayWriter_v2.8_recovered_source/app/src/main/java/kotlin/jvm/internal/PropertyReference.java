package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class PropertyReference extends kotlin.jvm.internal.CallableReference implements kotlin.reflect.KProperty {
    private final boolean syntheticJavaProperty;

    public PropertyReference() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.syntheticJavaProperty = r0
            return
    }

    public PropertyReference(java.lang.Object r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.syntheticJavaProperty = r0
            return
    }

    public PropertyReference(java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
            r9 = this;
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L8
            r8 = r2
            goto L9
        L8:
            r8 = r1
        L9:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r10 = r14 & 2
            r11 = 2
            if (r10 != r11) goto L17
            r1 = r2
        L17:
            r3.syntheticJavaProperty = r1
            return
    }

    @Override // kotlin.jvm.internal.CallableReference
    public kotlin.reflect.KCallable compute() {
            r1 = this;
            boolean r0 = r1.syntheticJavaProperty
            if (r0 == 0) goto L6
            r0 = r1
            goto La
        L6:
            kotlin.reflect.KCallable r0 = super.compute()
        La:
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof kotlin.jvm.internal.PropertyReference
            r2 = 0
            if (r1 == 0) goto L47
            r1 = r6
            kotlin.jvm.internal.PropertyReference r1 = (kotlin.jvm.internal.PropertyReference) r1
            kotlin.reflect.KDeclarationContainer r3 = r5.getOwner()
            kotlin.reflect.KDeclarationContainer r4 = r1.getOwner()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L45
            java.lang.String r3 = r5.getName()
            java.lang.String r4 = r1.getName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L45
            java.lang.String r3 = r5.getSignature()
            java.lang.String r4 = r1.getSignature()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L45
            java.lang.Object r3 = r5.getBoundReceiver()
            java.lang.Object r4 = r1.getBoundReceiver()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L45
            goto L46
        L45:
            r0 = r2
        L46:
            return r0
        L47:
            boolean r0 = r6 instanceof kotlin.reflect.KProperty
            if (r0 == 0) goto L54
            kotlin.reflect.KCallable r0 = r5.compute()
            boolean r0 = r6.equals(r0)
            return r0
        L54:
            return r2
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected /* bridge */ /* synthetic */ kotlin.reflect.KCallable getReflected() {
            r1 = this;
            kotlin.reflect.KProperty r0 = r1.getReflected()
            return r0
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.KProperty getReflected() {
            r2 = this;
            boolean r0 = r2.syntheticJavaProperty
            if (r0 != 0) goto Lb
            kotlin.reflect.KCallable r0 = super.getReflected()
            kotlin.reflect.KProperty r0 = (kotlin.reflect.KProperty) r0
            return r0
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980"
            r0.<init>(r1)
            throw r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.KDeclarationContainer r0 = r2.getOwner()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.getName()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.getSignature()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.reflect.KProperty
    public boolean isConst() {
            r1 = this;
            kotlin.reflect.KProperty r0 = r1.getReflected()
            boolean r0 = r0.isConst()
            return r0
    }

    @Override // kotlin.reflect.KProperty
    public boolean isLateinit() {
            r1 = this;
            kotlin.reflect.KProperty r0 = r1.getReflected()
            boolean r0 = r0.isLateinit()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            kotlin.reflect.KCallable r0 = r3.compute()
            if (r0 == r3) goto Lb
            java.lang.String r1 = r0.toString()
            return r1
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "property "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " (Kotlin reflection is not available)"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }
}
