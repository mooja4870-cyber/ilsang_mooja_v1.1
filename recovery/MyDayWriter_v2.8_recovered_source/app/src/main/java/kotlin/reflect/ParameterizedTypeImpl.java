package kotlin.reflect;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010\tJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016¢\u0006\u0002\u0010\u0011J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0019"}, d2 = {"Lkotlin/reflect/ParameterizedTypeImpl;", "Ljava/lang/reflect/ParameterizedType;", "Lkotlin/reflect/TypeImpl;", "rawType", "Ljava/lang/Class;", "ownerType", "Ljava/lang/reflect/Type;", "typeArguments", "", "(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/List;)V", "", "[Ljava/lang/reflect/Type;", "equals", "", "other", "", "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "getOwnerType", "getRawType", "getTypeName", "", "hashCode", "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType, kotlin.reflect.TypeImpl {
    private final java.lang.reflect.Type ownerType;
    private final java.lang.Class<?> rawType;
    private final java.lang.reflect.Type[] typeArguments;

    public ParameterizedTypeImpl(java.lang.Class<?> r5, java.lang.reflect.Type r6, java.util.List<? extends java.lang.reflect.Type> r7) {
            r4 = this;
            java.lang.String r0 = "rawType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "typeArguments"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r4.<init>()
            r4.rawType = r5
            r4.ownerType = r6
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 0
            r2 = r0
            r3 = 0
            java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r3]
            java.lang.Object[] r0 = r2.toArray(r3)
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            r4.typeArguments = r0
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L35
            java.lang.Class<?> r0 = r2.rawType
            r1 = r3
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type r1 = r1.getRawType()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L35
            java.lang.reflect.Type r0 = r2.ownerType
            r1 = r3
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type r1 = r1.getOwnerType()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L35
            java.lang.reflect.Type[] r0 = r2.getActualTypeArguments()
            r1 = r3
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L35
            r0 = 1
            goto L36
        L35:
            r0 = 0
        L36:
            return r0
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type[] getActualTypeArguments() {
            r1 = this;
            java.lang.reflect.Type[] r0 = r1.typeArguments
            return r0
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getOwnerType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.ownerType
            return r0
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getRawType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.rawType
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            return r0
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.TypeImpl
    public java.lang.String getTypeName() {
            r14 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            java.lang.reflect.Type r3 = r14.ownerType
            if (r3 == 0) goto L23
            java.lang.reflect.Type r3 = r14.ownerType
            java.lang.String r3 = kotlin.reflect.TypesJVMKt.access$typeToString(r3)
            r1.append(r3)
            java.lang.String r3 = "$"
            r1.append(r3)
            java.lang.Class<?> r3 = r14.rawType
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            goto L2e
        L23:
            java.lang.Class<?> r3 = r14.rawType
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            java.lang.String r3 = kotlin.reflect.TypesJVMKt.access$typeToString(r3)
            r1.append(r3)
        L2e:
            java.lang.reflect.Type[] r3 = r14.typeArguments
            int r3 = r3.length
            if (r3 != 0) goto L35
            r3 = 1
            goto L36
        L35:
            r3 = 0
        L36:
            if (r3 != 0) goto L55
            java.lang.reflect.Type[] r4 = r14.typeArguments
            r5 = r1
            java.lang.Appendable r5 = (java.lang.Appendable) r5
            java.lang.String r3 = "<"
            r7 = r3
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.String r3 = ">"
            r8 = r3
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            kotlin.reflect.ParameterizedTypeImpl$getTypeName$1$1 r3 = kotlin.reflect.ParameterizedTypeImpl$getTypeName$1$1.INSTANCE
            r11 = r3
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r12 = 50
            r13 = 0
            r6 = 0
            r9 = 0
            r10 = 0
            kotlin.collections.ArraysKt.joinTo$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L55:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class<?> r0 = r2.rawType
            int r0 = r0.hashCode()
            java.lang.reflect.Type r1 = r2.ownerType
            if (r1 == 0) goto Lf
            int r1 = r1.hashCode()
            goto L10
        Lf:
            r1 = 0
        L10:
            r0 = r0 ^ r1
            java.lang.reflect.Type[] r1 = r2.getActualTypeArguments()
            int r1 = java.util.Arrays.hashCode(r1)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.getTypeName()
            return r0
    }
}
