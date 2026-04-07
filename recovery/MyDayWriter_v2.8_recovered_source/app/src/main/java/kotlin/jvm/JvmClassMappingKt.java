package kotlin.jvm;

/* JADX INFO: compiled from: JvmClassMapping.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u001f\u0010\u001f\u001a\u00020 \"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0014*\u0006\u0012\u0002\b\u00030!¢\u0006\u0002\u0010\"\"'\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\";\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t*\b\u0012\u0004\u0012\u0002H\b0\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"-\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00018G¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"&\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u0014*\u0002H\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0015\";\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0007\"\b\b\u0000\u0010\u0002*\u00020\u0014*\b\u0012\u0004\u0012\u0002H\u00020\u00018Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"+\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u0014*\b\u0012\u0004\u0012\u0002H\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012\"-\u0010\u001a\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0007\"\b\b\u0000\u0010\u0002*\u00020\u0014*\b\u0012\u0004\u0012\u0002H\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0012\"+\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0014*\b\u0012\u0004\u0012\u0002H\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"annotationClass", "Lkotlin/reflect/KClass;", "T", "", "getAnnotationClass", "(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;", "declaringJavaClass", "Ljava/lang/Class;", "E", "", "getDeclaringJavaClass$annotations", "(Ljava/lang/Enum;)V", "getDeclaringJavaClass", "(Ljava/lang/Enum;)Ljava/lang/Class;", "java", "getJavaClass$annotations", "(Lkotlin/reflect/KClass;)V", "getJavaClass", "(Lkotlin/reflect/KClass;)Ljava/lang/Class;", "javaClass", "", "(Ljava/lang/Object;)Ljava/lang/Class;", "getRuntimeClassOfKClassInstance$annotations", "getRuntimeClassOfKClassInstance", "javaObjectType", "getJavaObjectType", "javaPrimitiveType", "getJavaPrimitiveType", "kotlin", "getKotlinClass", "(Ljava/lang/Class;)Lkotlin/reflect/KClass;", "isArrayOf", "", "", "([Ljava/lang/Object;)Z", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class JvmClassMappingKt {
    public static final <T extends java.lang.annotation.Annotation> kotlin.reflect.KClass<? extends T> getAnnotationClass(T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Class r0 = r2.annotationType()
            java.lang.String r1 = "annotationType(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.reflect.KClass r0 = getKotlinClass(r0)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            return r0
    }

    private static final <E extends java.lang.Enum<E>> java.lang.Class<E> getDeclaringJavaClass(java.lang.Enum<E> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Class r0 = r2.getDeclaringClass()
            java.lang.String r1 = "getDeclaringClass(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static /* synthetic */ void getDeclaringJavaClass$annotations(java.lang.Enum r0) {
            return
    }

    public static final <T> java.lang.Class<T> getJavaClass(T r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            java.lang.Class r1 = r3.getClass()
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            return r1
    }

    public static final <T> java.lang.Class<T> getJavaClass(kotlin.reflect.KClass<T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = r2
            kotlin.jvm.internal.ClassBasedDeclarationContainer r0 = (kotlin.jvm.internal.ClassBasedDeclarationContainer) r0
            java.lang.Class r0 = r0.getJClass()
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            return r0
    }

    public static /* synthetic */ void getJavaClass$annotations(kotlin.reflect.KClass r0) {
            return
    }

    public static final <T> java.lang.Class<T> getJavaObjectType(kotlin.reflect.KClass<T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r4
            kotlin.jvm.internal.ClassBasedDeclarationContainer r0 = (kotlin.jvm.internal.ClassBasedDeclarationContainer) r0
            java.lang.Class r0 = r0.getJClass()
            boolean r1 = r0.isPrimitive()
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>"
            if (r1 != 0) goto L18
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r2)
            return r0
        L18:
            java.lang.String r1 = r0.getName()
            if (r1 == 0) goto L95
            int r3 = r1.hashCode()
            switch(r3) {
                case -1325958191: goto L89;
                case 104431: goto L7d;
                case 3039496: goto L71;
                case 3052374: goto L65;
                case 3327612: goto L59;
                case 3625364: goto L4d;
                case 64711720: goto L41;
                case 97526364: goto L35;
                case 109413500: goto L27;
                default: goto L25;
            }
        L25:
            goto L95
        L27:
            java.lang.String r3 = "short"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L31
            goto L95
        L31:
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            goto L96
        L35:
            java.lang.String r3 = "float"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3e
            goto L95
        L3e:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            goto L96
        L41:
            java.lang.String r3 = "boolean"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L4a
            goto L95
        L4a:
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            goto L96
        L4d:
            java.lang.String r3 = "void"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L56
            goto L95
        L56:
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            goto L96
        L59:
            java.lang.String r3 = "long"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L62
            goto L95
        L62:
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            goto L96
        L65:
            java.lang.String r3 = "char"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L6e
            goto L95
        L6e:
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            goto L96
        L71:
            java.lang.String r3 = "byte"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L7a
            goto L95
        L7a:
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            goto L96
        L7d:
            java.lang.String r3 = "int"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L86
            goto L95
        L86:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            goto L96
        L89:
            java.lang.String r3 = "double"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L92
            goto L95
        L92:
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            goto L96
        L95:
            r1 = r0
        L96:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            return r1
    }

    public static final <T> java.lang.Class<T> getJavaPrimitiveType(kotlin.reflect.KClass<T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = r3
            kotlin.jvm.internal.ClassBasedDeclarationContainer r0 = (kotlin.jvm.internal.ClassBasedDeclarationContainer) r0
            java.lang.Class r0 = r0.getJClass()
            boolean r1 = r0.isPrimitive()
            if (r1 == 0) goto L18
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            return r0
        L18:
            java.lang.String r1 = r0.getName()
            if (r1 == 0) goto L95
            int r2 = r1.hashCode()
            switch(r2) {
                case -2056817302: goto L89;
                case -527879800: goto L7d;
                case -515992664: goto L71;
                case 155276373: goto L65;
                case 344809556: goto L59;
                case 398507100: goto L4d;
                case 398795216: goto L41;
                case 399092968: goto L35;
                case 761287205: goto L27;
                default: goto L25;
            }
        L25:
            goto L95
        L27:
            java.lang.String r2 = "java.lang.Double"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L31
            goto L95
        L31:
            java.lang.Class r1 = java.lang.Double.TYPE
            goto L96
        L35:
            java.lang.String r2 = "java.lang.Void"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3e
            goto L95
        L3e:
            java.lang.Class r1 = java.lang.Void.TYPE
            goto L96
        L41:
            java.lang.String r2 = "java.lang.Long"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L4a
            goto L95
        L4a:
            java.lang.Class r1 = java.lang.Long.TYPE
            goto L96
        L4d:
            java.lang.String r2 = "java.lang.Byte"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L56
            goto L95
        L56:
            java.lang.Class r1 = java.lang.Byte.TYPE
            goto L96
        L59:
            java.lang.String r2 = "java.lang.Boolean"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L62
            goto L95
        L62:
            java.lang.Class r1 = java.lang.Boolean.TYPE
            goto L96
        L65:
            java.lang.String r2 = "java.lang.Character"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L6e
            goto L95
        L6e:
            java.lang.Class r1 = java.lang.Character.TYPE
            goto L96
        L71:
            java.lang.String r2 = "java.lang.Short"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L7a
            goto L95
        L7a:
            java.lang.Class r1 = java.lang.Short.TYPE
            goto L96
        L7d:
            java.lang.String r2 = "java.lang.Float"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L86
            goto L95
        L86:
            java.lang.Class r1 = java.lang.Float.TYPE
            goto L96
        L89:
            java.lang.String r2 = "java.lang.Integer"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L92
            goto L95
        L92:
            java.lang.Class r1 = java.lang.Integer.TYPE
            goto L96
        L95:
            r1 = 0
        L96:
            return r1
    }

    public static final <T> kotlin.reflect.KClass<T> getKotlinClass(java.lang.Class<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
            return r0
    }

    public static final <T> java.lang.Class<kotlin.reflect.KClass<T>> getRuntimeClassOfKClassInstance(kotlin.reflect.KClass<T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = r3
            java.lang.Object r1 = (java.lang.Object) r1
            java.lang.Class r1 = r1.getClass()
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @kotlin.ReplaceWith(expression = "(this as Any).javaClass", imports = {}))
    public static /* synthetic */ void getRuntimeClassOfKClassInstance$annotations(kotlin.reflect.KClass r0) {
            return
    }

    public static final /* synthetic */ boolean isArrayOf(java.lang.Object[] r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 4
            java.lang.String r1 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r0, r1)
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Class r1 = r3.getClass()
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Class r1 = r1.getComponentType()
            boolean r0 = r0.isAssignableFrom(r1)
            return r0
    }
}
