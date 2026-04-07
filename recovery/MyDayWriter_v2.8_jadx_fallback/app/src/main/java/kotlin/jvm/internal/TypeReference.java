package kotlin.jvm.internal;

/* JADX INFO: compiled from: TypeReference.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\bH\u0002J\u0013\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020\fH\u0016J\b\u0010(\u001a\u00020\u001eH\u0016J\f\u0010\"\u001a\u00020\u001e*\u00020\u0006H\u0002R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u000b\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0019R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u00020\u001e*\u0006\u0012\u0002\b\u00030\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006*"}, d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "classifier", "Lkotlin/reflect/KClassifier;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "isMarkedNullable", "", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "platformTypeUpperBound", "flags", "", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Lkotlin/reflect/KType;I)V", "annotations", "", "getAnnotations", "()Ljava/util/List;", "getArguments", "getClassifier", "()Lkotlin/reflect/KClassifier;", "getFlags$kotlin_stdlib$annotations", "()V", "getFlags$kotlin_stdlib", "()I", "()Z", "getPlatformTypeUpperBound$kotlin_stdlib$annotations", "getPlatformTypeUpperBound$kotlin_stdlib", "()Lkotlin/reflect/KType;", "arrayClassName", "", "Ljava/lang/Class;", "getArrayClassName", "(Ljava/lang/Class;)Ljava/lang/String;", "asString", "convertPrimitiveToWrapper", "equals", "other", "", "hashCode", "toString", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TypeReference implements kotlin.reflect.KType {
    public static final kotlin.jvm.internal.TypeReference.Companion Companion = null;
    public static final int IS_MARKED_NULLABLE = 1;
    public static final int IS_MUTABLE_COLLECTION_TYPE = 2;
    public static final int IS_NOTHING_TYPE = 4;
    private final java.util.List<kotlin.reflect.KTypeProjection> arguments;
    private final kotlin.reflect.KClassifier classifier;
    private final int flags;
    private final kotlin.reflect.KType platformTypeUpperBound;

    /* JADX INFO: compiled from: TypeReference.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/jvm/internal/TypeReference$Companion;", "", "()V", "IS_MARKED_NULLABLE", "", "IS_MUTABLE_COLLECTION_TYPE", "IS_NOTHING_TYPE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: TypeReference.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlin.reflect.KVariance[] r0 = kotlin.reflect.KVariance.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.INVARIANT     // Catch: java.lang.NoSuchFieldError -> L11
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L11
                goto L12
            L11:
                r1 = move-exception
            L12:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.IN     // Catch: java.lang.NoSuchFieldError -> L1c
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
                kotlin.jvm.internal.TypeReference.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    static {
            kotlin.jvm.internal.TypeReference$Companion r0 = new kotlin.jvm.internal.TypeReference$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.jvm.internal.TypeReference.Companion = r0
            return
    }

    public TypeReference(kotlin.reflect.KClassifier r2, java.util.List<kotlin.reflect.KTypeProjection> r3, kotlin.reflect.KType r4, int r5) {
            r1 = this;
            java.lang.String r0 = "classifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "arguments"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.classifier = r2
            r1.arguments = r3
            r1.platformTypeUpperBound = r4
            r1.flags = r5
            return
    }

    public TypeReference(kotlin.reflect.KClassifier r2, java.util.List<kotlin.reflect.KTypeProjection> r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "classifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "arguments"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public static final /* synthetic */ java.lang.String access$asString(kotlin.jvm.internal.TypeReference r1, kotlin.reflect.KTypeProjection r2) {
            java.lang.String r0 = r1.asString(r2)
            return r0
    }

    private final java.lang.String asString(kotlin.reflect.KTypeProjection r4) {
            r3 = this;
            kotlin.reflect.KVariance r0 = r4.getVariance()
            if (r0 != 0) goto L9
            java.lang.String r0 = "*"
            return r0
        L9:
            kotlin.reflect.KType r0 = r4.getType()
            boolean r1 = r0 instanceof kotlin.jvm.internal.TypeReference
            if (r1 == 0) goto L14
            kotlin.jvm.internal.TypeReference r0 = (kotlin.jvm.internal.TypeReference) r0
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1e
            r1 = 1
            java.lang.String r0 = r0.asString(r1)
            if (r0 != 0) goto L26
        L1e:
            kotlin.reflect.KType r0 = r4.getType()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L26:
            kotlin.reflect.KVariance r1 = r4.getVariance()
            int[] r2 = kotlin.jvm.internal.TypeReference.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            switch(r1) {
                case 1: goto L63;
                case 2: goto L4f;
                case 3: goto L3b;
                default: goto L35;
            }
        L35:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L3b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "out "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            goto L64
        L4f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "in "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            goto L64
        L63:
            r1 = r0
        L64:
            return r1
    }

    private final java.lang.String asString(boolean r14) {
            r13 = this;
            kotlin.reflect.KClassifier r0 = r13.getClassifier()
            boolean r1 = r0 instanceof kotlin.reflect.KClass
            r2 = 0
            if (r1 == 0) goto Lc
            kotlin.reflect.KClass r0 = (kotlin.reflect.KClass) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L13
            java.lang.Class r2 = kotlin.jvm.JvmClassMappingKt.getJavaClass(r0)
        L13:
            if (r2 != 0) goto L1f
            kotlin.reflect.KClassifier r0 = r13.getClassifier()
            java.lang.String r0 = r0.toString()
            goto L53
        L1f:
            int r0 = r13.flags
            r0 = r0 & 4
            if (r0 == 0) goto L28
            java.lang.String r0 = "kotlin.Nothing"
            goto L53
        L28:
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L33
            java.lang.String r0 = r13.getArrayClassName(r2)
            goto L53
        L33:
            if (r14 == 0) goto L4f
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto L4f
            kotlin.reflect.KClassifier r0 = r13.getClassifier()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.reflect.KClass<*>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            kotlin.reflect.KClass r0 = (kotlin.reflect.KClass) r0
            java.lang.Class r0 = kotlin.jvm.JvmClassMappingKt.getJavaObjectType(r0)
            java.lang.String r0 = r0.getName()
            goto L53
        L4f:
            java.lang.String r0 = r2.getName()
        L53:
            java.util.List r1 = r13.getArguments()
            boolean r1 = r1.isEmpty()
            java.lang.String r3 = ""
            if (r1 == 0) goto L62
            r1 = r3
            goto L89
        L62:
            java.util.List r1 = r13.getArguments()
            r4 = r1
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.String r1 = ", "
            r5 = r1
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r1 = "<"
            r6 = r1
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r1 = ">"
            r7 = r1
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            kotlin.jvm.internal.TypeReference$asString$args$1 r1 = new kotlin.jvm.internal.TypeReference$asString$args$1
            r1.<init>(r13)
            r10 = r1
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r11 = 24
            r12 = 0
            r8 = 0
            r9 = 0
            java.lang.String r1 = kotlin.collections.CollectionsKt.joinToString$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L89:
            boolean r4 = r13.isMarkedNullable()
            if (r4 == 0) goto L93
            java.lang.String r3 = "?"
        L93:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r4 = r4.toString()
            kotlin.reflect.KType r5 = r13.platformTypeUpperBound
            boolean r6 = r5 instanceof kotlin.jvm.internal.TypeReference
            if (r6 == 0) goto L10e
            r6 = r5
            kotlin.jvm.internal.TypeReference r6 = (kotlin.jvm.internal.TypeReference) r6
            r7 = 1
            java.lang.String r6 = r6.asString(r7)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r4)
            if (r7 == 0) goto Lbd
            goto L10f
        Lbd:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r7 = r7.append(r4)
            r8 = 63
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r7 == 0) goto Lea
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r7 = r7.append(r4)
            r8 = 33
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L110
        Lea:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = 40
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r4)
            java.lang.String r8 = ".."
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r6)
            r8 = 41
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L110
        L10e:
        L10f:
            r7 = r4
        L110:
            return r7
    }

    private final java.lang.String getArrayClassName(java.lang.Class<?> r2) {
            r1 = this;
            java.lang.Class<boolean[]> r0 = boolean[].class
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto Lc
            java.lang.String r0 = "kotlin.BooleanArray"
            goto L5b
        Lc:
            java.lang.Class<char[]> r0 = char[].class
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L17
            java.lang.String r0 = "kotlin.CharArray"
            goto L5b
        L17:
            java.lang.Class<byte[]> r0 = byte[].class
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L22
            java.lang.String r0 = "kotlin.ByteArray"
            goto L5b
        L22:
            java.lang.Class<short[]> r0 = short[].class
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L2d
            java.lang.String r0 = "kotlin.ShortArray"
            goto L5b
        L2d:
            java.lang.Class<int[]> r0 = int[].class
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L38
            java.lang.String r0 = "kotlin.IntArray"
            goto L5b
        L38:
            java.lang.Class<float[]> r0 = float[].class
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L43
            java.lang.String r0 = "kotlin.FloatArray"
            goto L5b
        L43:
            java.lang.Class<long[]> r0 = long[].class
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L4e
            java.lang.String r0 = "kotlin.LongArray"
            goto L5b
        L4e:
            java.lang.Class<double[]> r0 = double[].class
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L59
            java.lang.String r0 = "kotlin.DoubleArray"
            goto L5b
        L59:
            java.lang.String r0 = "kotlin.Array"
        L5b:
            return r0
    }

    public static /* synthetic */ void getFlags$kotlin_stdlib$annotations() {
            return
    }

    public static /* synthetic */ void getPlatformTypeUpperBound$kotlin_stdlib$annotations() {
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.jvm.internal.TypeReference
            if (r0 == 0) goto L3e
            kotlin.reflect.KClassifier r0 = r2.getClassifier()
            r1 = r3
            kotlin.jvm.internal.TypeReference r1 = (kotlin.jvm.internal.TypeReference) r1
            kotlin.reflect.KClassifier r1 = r1.getClassifier()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L3e
            java.util.List r0 = r2.getArguments()
            r1 = r3
            kotlin.jvm.internal.TypeReference r1 = (kotlin.jvm.internal.TypeReference) r1
            java.util.List r1 = r1.getArguments()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L3e
            kotlin.reflect.KType r0 = r2.platformTypeUpperBound
            r1 = r3
            kotlin.jvm.internal.TypeReference r1 = (kotlin.jvm.internal.TypeReference) r1
            kotlin.reflect.KType r1 = r1.platformTypeUpperBound
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L3e
            int r0 = r2.flags
            r1 = r3
            kotlin.jvm.internal.TypeReference r1 = (kotlin.jvm.internal.TypeReference) r1
            int r1 = r1.flags
            if (r0 != r1) goto L3e
            r0 = 1
            goto L3f
        L3e:
            r0 = 0
        L3f:
            return r0
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
            r1 = this;
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
    }

    @Override // kotlin.reflect.KType
    public java.util.List<kotlin.reflect.KTypeProjection> getArguments() {
            r1 = this;
            java.util.List<kotlin.reflect.KTypeProjection> r0 = r1.arguments
            return r0
    }

    @Override // kotlin.reflect.KType
    public kotlin.reflect.KClassifier getClassifier() {
            r1 = this;
            kotlin.reflect.KClassifier r0 = r1.classifier
            return r0
    }

    public final int getFlags$kotlin_stdlib() {
            r1 = this;
            int r0 = r1.flags
            return r0
    }

    public final kotlin.reflect.KType getPlatformTypeUpperBound$kotlin_stdlib() {
            r1 = this;
            kotlin.reflect.KType r0 = r1.platformTypeUpperBound
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.KClassifier r0 = r2.getClassifier()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List r1 = r2.getArguments()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.flags
            int r1 = java.lang.Integer.hashCode(r1)
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
            r2 = this;
            int r0 = r2.flags
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L7
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.lang.String r1 = r2.asString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
