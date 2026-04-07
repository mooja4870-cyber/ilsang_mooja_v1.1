package kotlin.reflect;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\"\u0010\n\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0003\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0001H\u0002\u001a\u0016\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00078BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\b\u001a\u0004\b\u0005\u0010\t¨\u0006\u0015"}, d2 = {"javaType", "Ljava/lang/reflect/Type;", "Lkotlin/reflect/KType;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "Lkotlin/reflect/KTypeProjection;", "(Lkotlin/reflect/KTypeProjection;)V", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/reflect/Type;", "createPossiblyInnerType", "jClass", "Ljava/lang/Class;", "arguments", "", "typeToString", "", "type", "computeJavaType", "forceWrapper", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TypesJVMKt {

    /* JADX INFO: compiled from: TypesJVM.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlin.reflect.KVariance[] r0 = kotlin.reflect.KVariance.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.IN     // Catch: java.lang.NoSuchFieldError -> L11
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L11
                goto L12
            L11:
                r1 = move-exception
            L12:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.INVARIANT     // Catch: java.lang.NoSuchFieldError -> L1c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
                goto L1d
            L1c:
                r1 = move-exception
            L1d:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.OUT     // Catch: java.lang.NoSuchFieldError -> L27
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L27
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L27
                goto L28
            L27:
                r1 = move-exception
            L28:
                kotlin.reflect.TypesJVMKt.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public static final /* synthetic */ java.lang.reflect.Type access$computeJavaType(kotlin.reflect.KType r1, boolean r2) {
            java.lang.reflect.Type r0 = computeJavaType(r1, r2)
            return r0
    }

    public static final /* synthetic */ java.lang.String access$typeToString(java.lang.reflect.Type r1) {
            java.lang.String r0 = typeToString(r1)
            return r0
    }

    private static final java.lang.reflect.Type computeJavaType(kotlin.reflect.KType r8, boolean r9) {
            kotlin.reflect.KClassifier r0 = r8.getClassifier()
            boolean r1 = r0 instanceof kotlin.reflect.KTypeParameter
            if (r1 == 0) goto L13
            kotlin.reflect.TypeVariableImpl r1 = new kotlin.reflect.TypeVariableImpl
            r2 = r0
            kotlin.reflect.KTypeParameter r2 = (kotlin.reflect.KTypeParameter) r2
            r1.<init>(r2)
            java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
            return r1
        L13:
            boolean r1 = r0 instanceof kotlin.reflect.KClass
            if (r1 == 0) goto La8
            r1 = r0
            kotlin.reflect.KClass r1 = (kotlin.reflect.KClass) r1
            if (r9 == 0) goto L21
            java.lang.Class r1 = kotlin.jvm.JvmClassMappingKt.getJavaObjectType(r1)
            goto L25
        L21:
            java.lang.Class r1 = kotlin.jvm.JvmClassMappingKt.getJavaClass(r1)
        L25:
            java.util.List r2 = r8.getArguments()
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L33
            r3 = r1
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            return r3
        L33:
            boolean r3 = r1.isArray()
            if (r3 == 0) goto La3
            java.lang.Class r3 = r1.getComponentType()
            boolean r3 = r3.isPrimitive()
            if (r3 == 0) goto L47
            r3 = r1
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            return r3
        L47:
            java.lang.Object r3 = kotlin.collections.CollectionsKt.singleOrNull(r2)
            kotlin.reflect.KTypeProjection r3 = (kotlin.reflect.KTypeProjection) r3
            if (r3 == 0) goto L8a
            kotlin.reflect.KVariance r4 = r3.component1()
            kotlin.reflect.KType r3 = r3.component2()
            if (r4 != 0) goto L5b
            r5 = -1
            goto L63
        L5b:
            int[] r5 = kotlin.reflect.TypesJVMKt.WhenMappings.$EnumSwitchMapping$0
            int r6 = r4.ordinal()
            r5 = r5[r6]
        L63:
            switch(r5) {
                case -1: goto L86;
                case 0: goto L66;
                case 1: goto L86;
                case 2: goto L6c;
                case 3: goto L6c;
                default: goto L66;
            }
        L66:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L6c:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r5 = 1
            r6 = 0
            r7 = 0
            java.lang.reflect.Type r5 = computeJavaType$default(r3, r7, r5, r6)
            boolean r6 = r5 instanceof java.lang.Class
            if (r6 == 0) goto L7e
            r6 = r1
            java.lang.reflect.Type r6 = (java.lang.reflect.Type) r6
            goto L89
        L7e:
            kotlin.reflect.GenericArrayTypeImpl r6 = new kotlin.reflect.GenericArrayTypeImpl
            r6.<init>(r5)
            java.lang.reflect.Type r6 = (java.lang.reflect.Type) r6
            goto L89
        L86:
            r6 = r1
            java.lang.reflect.Type r6 = (java.lang.reflect.Type) r6
        L89:
            return r6
        L8a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "kotlin.Array must have exactly one type argument: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        La3:
            java.lang.reflect.Type r3 = createPossiblyInnerType(r1, r2)
            return r3
        La8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported type classifier: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    static /* synthetic */ java.lang.reflect.Type computeJavaType$default(kotlin.reflect.KType r0, boolean r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.lang.reflect.Type r0 = computeJavaType(r0, r1)
            return r0
    }

    private static final java.lang.reflect.Type createPossiblyInnerType(java.lang.Class<?> r12, java.util.List<kotlin.reflect.KTypeProjection> r13) {
            java.lang.Class r0 = r12.getDeclaringClass()
            r1 = 10
            if (r0 != 0) goto L41
            r0 = r13
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList
            int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r1)
            r3.<init>(r1)
            r1 = r3
            java.util.Collection r1 = (java.util.Collection) r1
            r3 = r0
            r4 = 0
            java.util.Iterator r5 = r3.iterator()
        L1e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L34
            java.lang.Object r6 = r5.next()
            r7 = r6
            kotlin.reflect.KTypeProjection r7 = (kotlin.reflect.KTypeProjection) r7
            r8 = 0
            java.lang.reflect.Type r7 = getJavaType(r7)
            r1.add(r7)
            goto L1e
        L34:
            java.util.List r1 = (java.util.List) r1
            kotlin.reflect.ParameterizedTypeImpl r0 = new kotlin.reflect.ParameterizedTypeImpl
            r2 = 0
            r0.<init>(r12, r2, r1)
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            return r0
        L41:
            int r2 = r12.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 == 0) goto L86
            r2 = r0
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            r3 = r13
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r4 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, r1)
            r5.<init>(r1)
            r1 = r5
            java.util.Collection r1 = (java.util.Collection) r1
            r5 = r3
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L64:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L7a
            java.lang.Object r8 = r7.next()
            r9 = r8
            kotlin.reflect.KTypeProjection r9 = (kotlin.reflect.KTypeProjection) r9
            r10 = 0
            java.lang.reflect.Type r9 = getJavaType(r9)
            r1.add(r9)
            goto L64
        L7a:
            java.util.List r1 = (java.util.List) r1
            kotlin.reflect.ParameterizedTypeImpl r3 = new kotlin.reflect.ParameterizedTypeImpl
            r3.<init>(r12, r2, r1)
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            return r3
        L86:
            java.lang.reflect.TypeVariable[] r2 = r12.getTypeParameters()
            int r2 = r2.length
            int r3 = r13.size()
            java.util.List r3 = r13.subList(r2, r3)
            java.lang.reflect.Type r3 = createPossiblyInnerType(r0, r3)
            r4 = 0
            java.util.List r4 = r13.subList(r4, r2)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r4, r1)
            r6.<init>(r1)
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            r6 = r4
            r7 = 0
            java.util.Iterator r8 = r6.iterator()
        Lb3:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lc9
            java.lang.Object r9 = r8.next()
            r10 = r9
            kotlin.reflect.KTypeProjection r10 = (kotlin.reflect.KTypeProjection) r10
            r11 = 0
            java.lang.reflect.Type r10 = getJavaType(r10)
            r1.add(r10)
            goto Lb3
        Lc9:
            java.util.List r1 = (java.util.List) r1
            kotlin.reflect.ParameterizedTypeImpl r4 = new kotlin.reflect.ParameterizedTypeImpl
            r4.<init>(r12, r3, r1)
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
            return r4
    }

    public static final java.lang.reflect.Type getJavaType(kotlin.reflect.KType r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3 instanceof kotlin.jvm.internal.KTypeBase
            if (r0 == 0) goto L14
            r0 = r3
            kotlin.jvm.internal.KTypeBase r0 = (kotlin.jvm.internal.KTypeBase) r0
            java.lang.reflect.Type r0 = r0.getJavaType()
            if (r0 == 0) goto L14
            r1 = 0
            return r0
        L14:
            r0 = 1
            r1 = 0
            r2 = 0
            java.lang.reflect.Type r0 = computeJavaType$default(r3, r2, r0, r1)
            return r0
    }

    private static final java.lang.reflect.Type getJavaType(kotlin.reflect.KTypeProjection r5) {
            kotlin.reflect.KVariance r0 = r5.getVariance()
            if (r0 != 0) goto Lf
            kotlin.reflect.WildcardTypeImpl$Companion r0 = kotlin.reflect.WildcardTypeImpl.Companion
            kotlin.reflect.WildcardTypeImpl r0 = r0.getSTAR()
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            return r0
        Lf:
            kotlin.reflect.KType r1 = r5.getType()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int[] r2 = kotlin.reflect.TypesJVMKt.WhenMappings.$EnumSwitchMapping$0
            int r3 = r0.ordinal()
            r2 = r2[r3]
            r3 = 0
            r4 = 1
            switch(r2) {
                case 1: goto L3a;
                case 2: goto L35;
                case 3: goto L29;
                default: goto L23;
            }
        L23:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        L29:
            kotlin.reflect.WildcardTypeImpl r2 = new kotlin.reflect.WildcardTypeImpl
            java.lang.reflect.Type r4 = computeJavaType(r1, r4)
            r2.<init>(r4, r3)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            goto L45
        L35:
            java.lang.reflect.Type r2 = computeJavaType(r1, r4)
            goto L45
        L3a:
            kotlin.reflect.WildcardTypeImpl r2 = new kotlin.reflect.WildcardTypeImpl
            java.lang.reflect.Type r4 = computeJavaType(r1, r4)
            r2.<init>(r3, r4)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
        L45:
            return r2
    }

    public static /* synthetic */ void getJavaType$annotations(kotlin.reflect.KType r0) {
            return
    }

    private static /* synthetic */ void getJavaType$annotations(kotlin.reflect.KTypeProjection r0) {
            return
    }

    private static final java.lang.String typeToString(java.lang.reflect.Type r4) {
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L49
            r0 = r4
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L3d
            kotlin.reflect.TypesJVMKt$typeToString$unwrap$1 r0 = kotlin.reflect.TypesJVMKt$typeToString$unwrap$1.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.generateSequence(r4, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r2 = kotlin.sequences.SequencesKt.last(r0)
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "[]"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r3 = kotlin.sequences.SequencesKt.count(r0)
            java.lang.String r2 = kotlin.text.StringsKt.repeat(r2, r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            goto L44
        L3d:
            r0 = r4
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.String r0 = r0.getName()
        L44:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            goto L4d
        L49:
            java.lang.String r0 = r4.toString()
        L4d:
            return r0
    }
}
