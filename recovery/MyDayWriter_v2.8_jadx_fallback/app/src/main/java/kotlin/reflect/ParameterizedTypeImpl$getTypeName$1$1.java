package kotlin.reflect;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.reflect.Type, java.lang.String> {
    public static final kotlin.reflect.ParameterizedTypeImpl$getTypeName$1$1 INSTANCE = null;

    static {
            kotlin.reflect.ParameterizedTypeImpl$getTypeName$1$1 r0 = new kotlin.reflect.ParameterizedTypeImpl$getTypeName$1$1
            r0.<init>()
            kotlin.reflect.ParameterizedTypeImpl$getTypeName$1$1.INSTANCE = r0
            return
    }

    ParameterizedTypeImpl$getTypeName$1$1() {
            r6 = this;
            java.lang.Class<kotlin.reflect.TypesJVMKt> r2 = kotlin.reflect.TypesJVMKt.class
            java.lang.String r4 = "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;"
            r5 = 1
            r1 = 1
            java.lang.String r3 = "typeToString"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ java.lang.String invoke(java.lang.reflect.Type r2) {
            r1 = this;
            r0 = r2
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            java.lang.String r0 = r1.invoke2(r0)
            return r0
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.String invoke2(java.lang.reflect.Type r2) {
            r1 = this;
            java.lang.String r0 = "p0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = kotlin.reflect.TypesJVMKt.access$typeToString(r2)
            return r0
    }
}
