package kotlin.reflect;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* synthetic */ class TypesJVMKt$typeToString$unwrap$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Class<?>, java.lang.Class<?>> {
    public static final kotlin.reflect.TypesJVMKt$typeToString$unwrap$1 INSTANCE = null;

    static {
            kotlin.reflect.TypesJVMKt$typeToString$unwrap$1 r0 = new kotlin.reflect.TypesJVMKt$typeToString$unwrap$1
            r0.<init>()
            kotlin.reflect.TypesJVMKt$typeToString$unwrap$1.INSTANCE = r0
            return
    }

    TypesJVMKt$typeToString$unwrap$1() {
            r6 = this;
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            java.lang.String r4 = "getComponentType()Ljava/lang/Class;"
            r5 = 0
            r1 = 1
            java.lang.String r3 = "getComponentType"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Class<?> invoke2(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.String r0 = "p0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Class r0 = r2.getComponentType()
            return r0
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ java.lang.Class<?> invoke(java.lang.Class<?> r2) {
            r1 = this;
            r0 = r2
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class r0 = r1.invoke2(r0)
            return r0
    }
}
