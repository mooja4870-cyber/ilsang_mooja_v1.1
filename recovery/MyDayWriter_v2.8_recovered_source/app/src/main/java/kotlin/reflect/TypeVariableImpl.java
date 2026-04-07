package kotlin.reflect;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J%\u0010\u000b\u001a\u0004\u0018\u0001H\f\"\b\b\u0000\u0010\f*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000f¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012H\u0016¢\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0012¢\u0006\u0002\u0010\u0013J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lkotlin/reflect/TypeVariableImpl;", "Ljava/lang/reflect/TypeVariable;", "Ljava/lang/reflect/GenericDeclaration;", "Lkotlin/reflect/TypeImpl;", "typeParameter", "Lkotlin/reflect/KTypeParameter;", "(Lkotlin/reflect/KTypeParameter;)V", "equals", "", "other", "", "getAnnotation", "T", "", "annotationClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "getAnnotations", "", "()[Ljava/lang/annotation/Annotation;", "getBounds", "Ljava/lang/reflect/Type;", "()[Ljava/lang/reflect/Type;", "getDeclaredAnnotations", "getGenericDeclaration", "getName", "", "getTypeName", "hashCode", "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class TypeVariableImpl implements java.lang.reflect.TypeVariable<java.lang.reflect.GenericDeclaration>, kotlin.reflect.TypeImpl {
    private final kotlin.reflect.KTypeParameter typeParameter;

    public TypeVariableImpl(kotlin.reflect.KTypeParameter r2) {
            r1 = this;
            java.lang.String r0 = "typeParameter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.typeParameter = r2
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L28
            java.lang.String r0 = r2.getName()
            r1 = r3
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.String r1 = r1.getName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L28
            java.lang.reflect.GenericDeclaration r0 = r2.getGenericDeclaration()
            r1 = r3
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.reflect.GenericDeclaration r1 = r1.getGenericDeclaration()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            return r0
    }

    public final <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.String r0 = "annotationClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            return r0
    }

    public final java.lang.annotation.Annotation[] getAnnotations() {
            r1 = this;
            r0 = 0
            java.lang.annotation.Annotation[] r0 = new java.lang.annotation.Annotation[r0]
            return r0
    }

    @Override // java.lang.reflect.TypeVariable
    public java.lang.reflect.Type[] getBounds() {
            r10 = this;
            kotlin.reflect.KTypeParameter r0 = r10.typeParameter
            java.util.List r0 = r0.getUpperBounds()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r3)
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = r0
            r4 = 0
            java.util.Iterator r5 = r3.iterator()
        L1c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L33
            java.lang.Object r6 = r5.next()
            r7 = r6
            kotlin.reflect.KType r7 = (kotlin.reflect.KType) r7
            r8 = 0
            r9 = 1
            java.lang.reflect.Type r7 = kotlin.reflect.TypesJVMKt.access$computeJavaType(r7, r9)
            r2.add(r7)
            goto L1c
        L33:
            java.util.List r2 = (java.util.List) r2
            java.util.Collection r2 = (java.util.Collection) r2
            r0 = 0
            r1 = r2
            r3 = 0
            java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r3]
            java.lang.Object[] r0 = r1.toArray(r3)
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            return r0
    }

    public final java.lang.annotation.Annotation[] getDeclaredAnnotations() {
            r1 = this;
            r0 = 0
            java.lang.annotation.Annotation[] r0 = new java.lang.annotation.Annotation[r0]
            return r0
    }

    @Override // java.lang.reflect.TypeVariable
    public java.lang.reflect.GenericDeclaration getGenericDeclaration() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getGenericDeclaration() is not yet supported for type variables created from KType: "
            java.lang.StringBuilder r0 = r0.append(r1)
            kotlin.reflect.KTypeParameter r1 = r4.typeParameter
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            kotlin.NotImplementedError r1 = new kotlin.NotImplementedError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "An operation is not implemented: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // java.lang.reflect.TypeVariable
    public java.lang.String getName() {
            r1 = this;
            kotlin.reflect.KTypeParameter r0 = r1.typeParameter
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.TypeImpl
    public java.lang.String getTypeName() {
            r1 = this;
            java.lang.String r0 = r1.getName()
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.getName()
            int r0 = r0.hashCode()
            java.lang.reflect.GenericDeclaration r1 = r2.getGenericDeclaration()
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.getTypeName()
            return r0
    }
}
