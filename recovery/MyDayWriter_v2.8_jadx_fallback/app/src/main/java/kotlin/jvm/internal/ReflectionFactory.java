package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public class ReflectionFactory {
    private static final java.lang.String KOTLIN_JVM_FUNCTIONS = "kotlin.jvm.functions.";

    public ReflectionFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public kotlin.reflect.KClass createKotlinClass(java.lang.Class r2) {
            r1 = this;
            kotlin.jvm.internal.ClassReference r0 = new kotlin.jvm.internal.ClassReference
            r0.<init>(r2)
            return r0
    }

    public kotlin.reflect.KClass createKotlinClass(java.lang.Class r2, java.lang.String r3) {
            r1 = this;
            kotlin.jvm.internal.ClassReference r0 = new kotlin.jvm.internal.ClassReference
            r0.<init>(r2)
            return r0
    }

    public kotlin.reflect.KFunction function(kotlin.jvm.internal.FunctionReference r1) {
            r0 = this;
            return r1
    }

    public kotlin.reflect.KClass getOrCreateKotlinClass(java.lang.Class r2) {
            r1 = this;
            kotlin.jvm.internal.ClassReference r0 = new kotlin.jvm.internal.ClassReference
            r0.<init>(r2)
            return r0
    }

    public kotlin.reflect.KClass getOrCreateKotlinClass(java.lang.Class r2, java.lang.String r3) {
            r1 = this;
            kotlin.jvm.internal.ClassReference r0 = new kotlin.jvm.internal.ClassReference
            r0.<init>(r2)
            return r0
    }

    public kotlin.reflect.KDeclarationContainer getOrCreateKotlinPackage(java.lang.Class r2, java.lang.String r3) {
            r1 = this;
            kotlin.jvm.internal.PackageReference r0 = new kotlin.jvm.internal.PackageReference
            r0.<init>(r2, r3)
            return r0
    }

    public kotlin.reflect.KType mutableCollectionType(kotlin.reflect.KType r7) {
            r6 = this;
            r0 = r7
            kotlin.jvm.internal.TypeReference r0 = (kotlin.jvm.internal.TypeReference) r0
            kotlin.jvm.internal.TypeReference r1 = new kotlin.jvm.internal.TypeReference
            kotlin.reflect.KClassifier r2 = r7.getClassifier()
            java.util.List r3 = r7.getArguments()
            kotlin.reflect.KType r4 = r0.getPlatformTypeUpperBound$kotlin_stdlib()
            int r5 = r0.getFlags$kotlin_stdlib()
            r5 = r5 | 2
            r1.<init>(r2, r3, r4, r5)
            return r1
    }

    public kotlin.reflect.KMutableProperty0 mutableProperty0(kotlin.jvm.internal.MutablePropertyReference0 r1) {
            r0 = this;
            return r1
    }

    public kotlin.reflect.KMutableProperty1 mutableProperty1(kotlin.jvm.internal.MutablePropertyReference1 r1) {
            r0 = this;
            return r1
    }

    public kotlin.reflect.KMutableProperty2 mutableProperty2(kotlin.jvm.internal.MutablePropertyReference2 r1) {
            r0 = this;
            return r1
    }

    public kotlin.reflect.KType nothingType(kotlin.reflect.KType r7) {
            r6 = this;
            r0 = r7
            kotlin.jvm.internal.TypeReference r0 = (kotlin.jvm.internal.TypeReference) r0
            kotlin.jvm.internal.TypeReference r1 = new kotlin.jvm.internal.TypeReference
            kotlin.reflect.KClassifier r2 = r7.getClassifier()
            java.util.List r3 = r7.getArguments()
            kotlin.reflect.KType r4 = r0.getPlatformTypeUpperBound$kotlin_stdlib()
            int r5 = r0.getFlags$kotlin_stdlib()
            r5 = r5 | 4
            r1.<init>(r2, r3, r4, r5)
            return r1
    }

    public kotlin.reflect.KType platformType(kotlin.reflect.KType r5, kotlin.reflect.KType r6) {
            r4 = this;
            kotlin.jvm.internal.TypeReference r0 = new kotlin.jvm.internal.TypeReference
            kotlin.reflect.KClassifier r1 = r5.getClassifier()
            java.util.List r2 = r5.getArguments()
            r3 = r5
            kotlin.jvm.internal.TypeReference r3 = (kotlin.jvm.internal.TypeReference) r3
            int r3 = r3.getFlags$kotlin_stdlib()
            r0.<init>(r1, r2, r6, r3)
            return r0
    }

    public kotlin.reflect.KProperty0 property0(kotlin.jvm.internal.PropertyReference0 r1) {
            r0 = this;
            return r1
    }

    public kotlin.reflect.KProperty1 property1(kotlin.jvm.internal.PropertyReference1 r1) {
            r0 = this;
            return r1
    }

    public kotlin.reflect.KProperty2 property2(kotlin.jvm.internal.PropertyReference2 r1) {
            r0 = this;
            return r1
    }

    public java.lang.String renderLambdaToString(kotlin.jvm.internal.FunctionBase r4) {
            r3 = this;
            java.lang.Class r0 = r4.getClass()
            java.lang.reflect.Type[] r0 = r0.getGenericInterfaces()
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "kotlin.jvm.functions."
            boolean r2 = r0.startsWith(r1)
            if (r2 == 0) goto L20
            int r1 = r1.length()
            java.lang.String r1 = r0.substring(r1)
            goto L21
        L20:
            r1 = r0
        L21:
            return r1
    }

    public java.lang.String renderLambdaToString(kotlin.jvm.internal.Lambda r2) {
            r1 = this;
            java.lang.String r0 = r1.renderLambdaToString(r2)
            return r0
    }

    public void setUpperBounds(kotlin.reflect.KTypeParameter r2, java.util.List<kotlin.reflect.KType> r3) {
            r1 = this;
            r0 = r2
            kotlin.jvm.internal.TypeParameterReference r0 = (kotlin.jvm.internal.TypeParameterReference) r0
            r0.setUpperBounds(r3)
            return
    }

    public kotlin.reflect.KType typeOf(kotlin.reflect.KClassifier r2, java.util.List<kotlin.reflect.KTypeProjection> r3, boolean r4) {
            r1 = this;
            kotlin.jvm.internal.TypeReference r0 = new kotlin.jvm.internal.TypeReference
            r0.<init>(r2, r3, r4)
            return r0
    }

    public kotlin.reflect.KTypeParameter typeParameter(java.lang.Object r2, java.lang.String r3, kotlin.reflect.KVariance r4, boolean r5) {
            r1 = this;
            kotlin.jvm.internal.TypeParameterReference r0 = new kotlin.jvm.internal.TypeParameterReference
            r0.<init>(r2, r3, r4, r5)
            return r0
    }
}
