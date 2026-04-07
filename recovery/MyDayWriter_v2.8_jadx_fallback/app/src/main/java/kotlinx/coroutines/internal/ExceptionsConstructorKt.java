package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ExceptionsConstructor.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a2\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u0007\"\b\b\u0000\u0010\b*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0002\u001a.\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a!\u0010\r\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\u00062\u0006\u0010\u000e\u001a\u0002H\bH\u0000¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0003H\u0082\u0010\u001a\u0018\u0010\u0012\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0013\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000*(\b\u0002\u0010\u0014\"\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¨\u0006\u0015"}, d2 = {"ctorCache", "Lkotlinx/coroutines/internal/CtorCache;", "throwableFields", "", "createConstructor", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/Ctor;", "E", "clz", "Ljava/lang/Class;", "safeCtor", "block", "tryCopyException", "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "fieldsCount", "accumulator", "fieldsCountOrDefault", "defaultValue", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ExceptionsConstructorKt {
    private static final kotlinx.coroutines.internal.CtorCache ctorCache = null;
    private static final int throwableFields = 0;


    static {
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r1 = -1
            int r0 = fieldsCountOrDefault(r0, r1)
            kotlinx.coroutines.internal.ExceptionsConstructorKt.throwableFields = r0
            boolean r0 = kotlinx.coroutines.internal.FastServiceLoaderKt.getANDROID_DETECTED()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L15
            kotlinx.coroutines.internal.WeakMapCtorCache r0 = kotlinx.coroutines.internal.WeakMapCtorCache.INSTANCE     // Catch: java.lang.Throwable -> L1a
            kotlinx.coroutines.internal.CtorCache r0 = (kotlinx.coroutines.internal.CtorCache) r0     // Catch: java.lang.Throwable -> L1a
            goto L19
        L15:
            kotlinx.coroutines.internal.ClassValueCtorCache r0 = kotlinx.coroutines.internal.ClassValueCtorCache.INSTANCE     // Catch: java.lang.Throwable -> L1a
            kotlinx.coroutines.internal.CtorCache r0 = (kotlinx.coroutines.internal.CtorCache) r0     // Catch: java.lang.Throwable -> L1a
        L19:
            goto L20
        L1a:
            r0 = move-exception
            kotlinx.coroutines.internal.WeakMapCtorCache r1 = kotlinx.coroutines.internal.WeakMapCtorCache.INSTANCE
            kotlinx.coroutines.internal.CtorCache r1 = (kotlinx.coroutines.internal.CtorCache) r1
            r0 = r1
        L20:
            kotlinx.coroutines.internal.ExceptionsConstructorKt.ctorCache = r0
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$createConstructor(java.lang.Class r1) {
            kotlin.jvm.functions.Function1 r0 = createConstructor(r1)
            return r0
    }

    private static final <E extends java.lang.Throwable> kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> createConstructor(java.lang.Class<E> r19) {
            kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1 r0 = kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            int r1 = kotlinx.coroutines.internal.ExceptionsConstructorKt.throwableFields
            r2 = 0
            r3 = r19
            int r4 = fieldsCountOrDefault(r3, r2)
            if (r1 == r4) goto L10
            return r0
        L10:
            java.lang.reflect.Constructor[] r1 = r3.getConstructors()
            r4 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r1.length
            r5.<init>(r6)
            java.util.Collection r5 = (java.util.Collection) r5
            r6 = r1
            r7 = 0
            int r8 = r6.length
            r9 = r2
        L21:
            r10 = 0
            if (r9 >= r8) goto Lda
            r11 = r6[r9]
            r12 = r11
            r13 = 0
            java.lang.Class[] r14 = r12.getParameterTypes()
            int r15 = r14.length
            r16 = 1
            r17 = -1
            switch(r15) {
                case 0: goto Lbb;
                case 1: goto L75;
                case 2: goto L40;
                default: goto L34;
            }
        L34:
            r18 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            kotlin.Pair r2 = kotlin.TuplesKt.to(r10, r2)
            goto Ld0
        L40:
            r15 = r14[r2]
            r18 = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r2)
            if (r2 == 0) goto L6c
            r2 = r14[r16]
            java.lang.Class<java.lang.Throwable> r15 = java.lang.Throwable.class
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r15)
            if (r2 == 0) goto L6c
            kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$1 r2 = new kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$1
            r2.<init>(r12)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.jvm.functions.Function1 r2 = safeCtor(r2)
            r10 = 3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r10)
            goto Ld0
        L6c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            kotlin.Pair r2 = kotlin.TuplesKt.to(r10, r2)
            goto Ld0
        L75:
            r18 = r2
            r2 = r14[r18]
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r15)
            if (r15 == 0) goto L96
            kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$2 r2 = new kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$2
            r2.<init>(r12)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.jvm.functions.Function1 r2 = safeCtor(r2)
            r10 = 2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r10)
            goto Ld0
        L96:
            java.lang.Class<java.lang.Throwable> r15 = java.lang.Throwable.class
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r15)
            if (r2 == 0) goto Lb2
            kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$3 r2 = new kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$3
            r2.<init>(r12)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.jvm.functions.Function1 r2 = safeCtor(r2)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r10)
            goto Ld0
        Lb2:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            kotlin.Pair r2 = kotlin.TuplesKt.to(r10, r2)
            goto Ld0
        Lbb:
            r18 = r2
            kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$4 r2 = new kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$4
            r2.<init>(r12)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.jvm.functions.Function1 r2 = safeCtor(r2)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r18)
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r10)
        Ld0:
            r5.add(r2)
            int r9 = r9 + 1
            r2 = r18
            goto L21
        Lda:
            r2 = r5
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r1 = 0
            java.util.Iterator r4 = r2.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto Lee
            goto L127
        Lee:
            java.lang.Object r10 = r4.next()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto Lf9
            goto L127
        Lf9:
            r5 = r10
            kotlin.Pair r5 = (kotlin.Pair) r5
            r6 = 0
            java.lang.Object r7 = r5.getSecond()
            java.lang.Number r7 = (java.lang.Number) r7
            int r5 = r7.intValue()
        L108:
            java.lang.Object r6 = r4.next()
            r7 = r6
            kotlin.Pair r7 = (kotlin.Pair) r7
            r8 = 0
            java.lang.Object r9 = r7.getSecond()
            java.lang.Number r9 = (java.lang.Number) r9
            int r7 = r9.intValue()
            if (r5 >= r7) goto L120
            r8 = r6
            r5 = r7
            r10 = r8
        L120:
            boolean r6 = r4.hasNext()
            if (r6 != 0) goto L108
        L127:
            kotlin.Pair r10 = (kotlin.Pair) r10
            if (r10 == 0) goto L133
            java.lang.Object r1 = r10.getFirst()
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            if (r1 != 0) goto L134
        L133:
            r1 = r0
        L134:
            return r1
    }

    private static final int fieldsCount(java.lang.Class<?> r9, int r10) {
        L1:
            java.lang.reflect.Field[] r0 = r9.getDeclaredFields()
            r1 = 0
            r2 = 0
            int r3 = r0.length
            r4 = 0
        L9:
            if (r4 >= r3) goto L1e
            r5 = r0[r4]
            r6 = r5
            r7 = 0
            int r8 = r6.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 != 0) goto L1b
            int r2 = r2 + 1
        L1b:
            int r4 = r4 + 1
            goto L9
        L1e:
            int r0 = r10 + r2
            java.lang.Class r1 = r9.getSuperclass()
            if (r1 != 0) goto L29
            return r0
        L29:
            r9 = r1
            r10 = r0
            goto L1
    }

    static /* synthetic */ int fieldsCount$default(java.lang.Class r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            int r0 = fieldsCount(r0, r1)
            return r0
    }

    private static final int fieldsCountOrDefault(java.lang.Class<?> r5, int r6) {
            kotlin.reflect.KClass r0 = kotlin.jvm.JvmClassMappingKt.getKotlinClass(r5)
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L17
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 0
            int r2 = fieldsCount$default(r5, r4, r2, r3)     // Catch: java.lang.Throwable -> L17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r0)     // Catch: java.lang.Throwable -> L17
            goto L22
        L17:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r0)
        L22:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r2 = kotlin.Result.m159isFailureimpl(r0)
            if (r2 == 0) goto L2d
            r0 = r1
        L2d:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
    }

    private static final kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> safeCtor(kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable> r1) {
            kotlinx.coroutines.internal.ExceptionsConstructorKt$safeCtor$1 r0 = new kotlinx.coroutines.internal.ExceptionsConstructorKt$safeCtor$1
            r0.<init>(r1)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            return r0
    }

    public static final <E extends java.lang.Throwable> E tryCopyException(E r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.CopyableThrowable
            if (r0 == 0) goto L28
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L13
            r0 = 0
            r1 = r2
            kotlinx.coroutines.CopyableThrowable r1 = (kotlinx.coroutines.CopyableThrowable) r1     // Catch: java.lang.Throwable -> L13
            java.lang.Throwable r1 = r1.createCopy()     // Catch: java.lang.Throwable -> L13
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r1)     // Catch: java.lang.Throwable -> L13
            goto L1e
        L13:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r0)
        L1e:
            boolean r1 = kotlin.Result.m159isFailureimpl(r0)
            if (r1 == 0) goto L25
            r0 = 0
        L25:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
        L28:
            kotlinx.coroutines.internal.CtorCache r0 = kotlinx.coroutines.internal.ExceptionsConstructorKt.ctorCache
            java.lang.Class r1 = r2.getClass()
            kotlin.jvm.functions.Function1 r0 = r0.get(r1)
            java.lang.Object r0 = r0.invoke(r2)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
    }
}
