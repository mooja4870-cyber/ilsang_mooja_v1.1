package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public class Reflection {
    private static final kotlin.reflect.KClass[] EMPTY_K_CLASS_ARRAY = null;
    static final java.lang.String REFLECTION_NOT_AVAILABLE = " (Kotlin reflection is not available)";
    private static final kotlin.jvm.internal.ReflectionFactory factory = null;

    static {
            java.lang.String r0 = "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.IllegalAccessException -> Ld java.lang.InstantiationException -> L10 java.lang.ClassNotFoundException -> L13 java.lang.ClassCastException -> L16
            java.lang.Object r1 = r0.newInstance()     // Catch: java.lang.IllegalAccessException -> Ld java.lang.InstantiationException -> L10 java.lang.ClassNotFoundException -> L13 java.lang.ClassCastException -> L16
            kotlin.jvm.internal.ReflectionFactory r1 = (kotlin.jvm.internal.ReflectionFactory) r1     // Catch: java.lang.IllegalAccessException -> Ld java.lang.InstantiationException -> L10 java.lang.ClassNotFoundException -> L13 java.lang.ClassCastException -> L16
            goto L18
        Ld:
            r0 = move-exception
            r1 = 0
            goto L19
        L10:
            r0 = move-exception
            r1 = 0
            goto L18
        L13:
            r0 = move-exception
            r1 = 0
            goto L18
        L16:
            r0 = move-exception
            r1 = 0
        L18:
        L19:
            if (r1 == 0) goto L1d
            r0 = r1
            goto L22
        L1d:
            kotlin.jvm.internal.ReflectionFactory r0 = new kotlin.jvm.internal.ReflectionFactory
            r0.<init>()
        L22:
            kotlin.jvm.internal.Reflection.factory = r0
            r0 = 0
            kotlin.reflect.KClass[] r0 = new kotlin.reflect.KClass[r0]
            kotlin.jvm.internal.Reflection.EMPTY_K_CLASS_ARRAY = r0
            return
    }

    public Reflection() {
            r0 = this;
            r0.<init>()
            return
    }

    public static kotlin.reflect.KClass createKotlinClass(java.lang.Class r1) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KClass r0 = r0.createKotlinClass(r1)
            return r0
    }

    public static kotlin.reflect.KClass createKotlinClass(java.lang.Class r1, java.lang.String r2) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KClass r0 = r0.createKotlinClass(r1, r2)
            return r0
    }

    public static kotlin.reflect.KFunction function(kotlin.jvm.internal.FunctionReference r1) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KFunction r0 = r0.function(r1)
            return r0
    }

    public static kotlin.reflect.KClass getOrCreateKotlinClass(java.lang.Class r1) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KClass r0 = r0.getOrCreateKotlinClass(r1)
            return r0
    }

    public static kotlin.reflect.KClass getOrCreateKotlinClass(java.lang.Class r1, java.lang.String r2) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KClass r0 = r0.getOrCreateKotlinClass(r1, r2)
            return r0
    }

    public static kotlin.reflect.KClass[] getOrCreateKotlinClasses(java.lang.Class[] r4) {
            int r0 = r4.length
            if (r0 != 0) goto L6
            kotlin.reflect.KClass[] r1 = kotlin.jvm.internal.Reflection.EMPTY_K_CLASS_ARRAY
            return r1
        L6:
            kotlin.reflect.KClass[] r1 = new kotlin.reflect.KClass[r0]
            r2 = 0
        L9:
            if (r2 >= r0) goto L16
            r3 = r4[r2]
            kotlin.reflect.KClass r3 = getOrCreateKotlinClass(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L16:
            return r1
    }

    public static kotlin.reflect.KDeclarationContainer getOrCreateKotlinPackage(java.lang.Class r2) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            java.lang.String r1 = ""
            kotlin.reflect.KDeclarationContainer r0 = r0.getOrCreateKotlinPackage(r2, r1)
            return r0
    }

    public static kotlin.reflect.KDeclarationContainer getOrCreateKotlinPackage(java.lang.Class r1, java.lang.String r2) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KDeclarationContainer r0 = r0.getOrCreateKotlinPackage(r1, r2)
            return r0
    }

    public static kotlin.reflect.KType mutableCollectionType(kotlin.reflect.KType r1) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KType r0 = r0.mutableCollectionType(r1)
            return r0
    }

    public static kotlin.reflect.KMutableProperty0 mutableProperty0(kotlin.jvm.internal.MutablePropertyReference0 r1) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KMutableProperty0 r0 = r0.mutableProperty0(r1)
            return r0
    }

    public static kotlin.reflect.KMutableProperty1 mutableProperty1(kotlin.jvm.internal.MutablePropertyReference1 r1) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KMutableProperty1 r0 = r0.mutableProperty1(r1)
            return r0
    }

    public static kotlin.reflect.KMutableProperty2 mutableProperty2(kotlin.jvm.internal.MutablePropertyReference2 r1) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KMutableProperty2 r0 = r0.mutableProperty2(r1)
            return r0
    }

    public static kotlin.reflect.KType nothingType(kotlin.reflect.KType r1) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KType r0 = r0.nothingType(r1)
            return r0
    }

    public static kotlin.reflect.KType nullableTypeOf(java.lang.Class r4) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KClass r1 = getOrCreateKotlinClass(r4)
            java.util.List r2 = java.util.Collections.emptyList()
            r3 = 1
            kotlin.reflect.KType r0 = r0.typeOf(r1, r2, r3)
            return r0
    }

    public static kotlin.reflect.KType nullableTypeOf(java.lang.Class r4, kotlin.reflect.KTypeProjection r5) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KClass r1 = getOrCreateKotlinClass(r4)
            java.util.List r2 = java.util.Collections.singletonList(r5)
            r3 = 1
            kotlin.reflect.KType r0 = r0.typeOf(r1, r2, r3)
            return r0
    }

    public static kotlin.reflect.KType nullableTypeOf(java.lang.Class r4, kotlin.reflect.KTypeProjection r5, kotlin.reflect.KTypeProjection r6) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KClass r1 = getOrCreateKotlinClass(r4)
            r2 = 2
            kotlin.reflect.KTypeProjection[] r2 = new kotlin.reflect.KTypeProjection[r2]
            r3 = 0
            r2[r3] = r5
            r3 = 1
            r2[r3] = r6
            java.util.List r2 = java.util.Arrays.asList(r2)
            kotlin.reflect.KType r0 = r0.typeOf(r1, r2, r3)
            return r0
    }

    public static kotlin.reflect.KType nullableTypeOf(java.lang.Class r4, kotlin.reflect.KTypeProjection... r5) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KClass r1 = getOrCreateKotlinClass(r4)
            java.util.List r2 = kotlin.collections.ArraysKt.toList(r5)
            r3 = 1
            kotlin.reflect.KType r0 = r0.typeOf(r1, r2, r3)
            return r0
    }

    public static kotlin.reflect.KType nullableTypeOf(kotlin.reflect.KClassifier r3) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            java.util.List r1 = java.util.Collections.emptyList()
            r2 = 1
            kotlin.reflect.KType r0 = r0.typeOf(r3, r1, r2)
            return r0
    }

    public static kotlin.reflect.KType platformType(kotlin.reflect.KType r1, kotlin.reflect.KType r2) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KType r0 = r0.platformType(r1, r2)
            return r0
    }

    public static kotlin.reflect.KProperty0 property0(kotlin.jvm.internal.PropertyReference0 r1) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KProperty0 r0 = r0.property0(r1)
            return r0
    }

    public static kotlin.reflect.KProperty1 property1(kotlin.jvm.internal.PropertyReference1 r1) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KProperty1 r0 = r0.property1(r1)
            return r0
    }

    public static kotlin.reflect.KProperty2 property2(kotlin.jvm.internal.PropertyReference2 r1) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KProperty2 r0 = r0.property2(r1)
            return r0
    }

    public static java.lang.String renderLambdaToString(kotlin.jvm.internal.FunctionBase r1) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            java.lang.String r0 = r0.renderLambdaToString(r1)
            return r0
    }

    public static java.lang.String renderLambdaToString(kotlin.jvm.internal.Lambda r1) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            java.lang.String r0 = r0.renderLambdaToString(r1)
            return r0
    }

    public static void setUpperBounds(kotlin.reflect.KTypeParameter r2, kotlin.reflect.KType r3) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            java.util.List r1 = java.util.Collections.singletonList(r3)
            r0.setUpperBounds(r2, r1)
            return
    }

    public static void setUpperBounds(kotlin.reflect.KTypeParameter r2, kotlin.reflect.KType... r3) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            java.util.List r1 = kotlin.collections.ArraysKt.toList(r3)
            r0.setUpperBounds(r2, r1)
            return
    }

    public static kotlin.reflect.KType typeOf(java.lang.Class r4) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KClass r1 = getOrCreateKotlinClass(r4)
            java.util.List r2 = java.util.Collections.emptyList()
            r3 = 0
            kotlin.reflect.KType r0 = r0.typeOf(r1, r2, r3)
            return r0
    }

    public static kotlin.reflect.KType typeOf(java.lang.Class r4, kotlin.reflect.KTypeProjection r5) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KClass r1 = getOrCreateKotlinClass(r4)
            java.util.List r2 = java.util.Collections.singletonList(r5)
            r3 = 0
            kotlin.reflect.KType r0 = r0.typeOf(r1, r2, r3)
            return r0
    }

    public static kotlin.reflect.KType typeOf(java.lang.Class r5, kotlin.reflect.KTypeProjection r6, kotlin.reflect.KTypeProjection r7) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KClass r1 = getOrCreateKotlinClass(r5)
            r2 = 2
            kotlin.reflect.KTypeProjection[] r2 = new kotlin.reflect.KTypeProjection[r2]
            r3 = 0
            r2[r3] = r6
            r4 = 1
            r2[r4] = r7
            java.util.List r2 = java.util.Arrays.asList(r2)
            kotlin.reflect.KType r0 = r0.typeOf(r1, r2, r3)
            return r0
    }

    public static kotlin.reflect.KType typeOf(java.lang.Class r4, kotlin.reflect.KTypeProjection... r5) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KClass r1 = getOrCreateKotlinClass(r4)
            java.util.List r2 = kotlin.collections.ArraysKt.toList(r5)
            r3 = 0
            kotlin.reflect.KType r0 = r0.typeOf(r1, r2, r3)
            return r0
    }

    public static kotlin.reflect.KType typeOf(kotlin.reflect.KClassifier r3) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            java.util.List r1 = java.util.Collections.emptyList()
            r2 = 0
            kotlin.reflect.KType r0 = r0.typeOf(r3, r1, r2)
            return r0
    }

    public static kotlin.reflect.KTypeParameter typeParameter(java.lang.Object r1, java.lang.String r2, kotlin.reflect.KVariance r3, boolean r4) {
            kotlin.jvm.internal.ReflectionFactory r0 = kotlin.jvm.internal.Reflection.factory
            kotlin.reflect.KTypeParameter r0 = r0.typeParameter(r1, r2, r3, r4)
            return r0
    }
}
