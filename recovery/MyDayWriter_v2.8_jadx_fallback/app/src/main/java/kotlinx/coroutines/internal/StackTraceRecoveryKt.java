package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: StackTraceRecovery.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a9\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u000b\u001a\u0002H\t2\u0006\u0010\f\u001a\u0002H\t2\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u000f0\u000eH\u0002¢\u0006\u0002\u0010\u0010\u001a\u001e\u0010\u0011\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u000f0\u000e2\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014H\u0002\u001a1\u0010\u0015\u001a\u00020\u00162\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u000f0\u00182\u0010\u0010\f\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u000f0\u000eH\u0002¢\u0006\u0002\u0010\u0019\u001a\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0080H¢\u0006\u0002\u0010\u001d\u001a+\u0010\u001e\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u001c\u001a\u0002H\t2\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0002\u0010\u001f\u001a\u001f\u0010 \u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u001c\u001a\u0002H\tH\u0000¢\u0006\u0002\u0010!\u001a,\u0010 \u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u001c\u001a\u0002H\t2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\"H\u0080\b¢\u0006\u0002\u0010#\u001a \u0010$\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u001c\u001a\u0002H\tH\u0081\b¢\u0006\u0002\u0010!\u001a\u001f\u0010%\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u001c\u001a\u0002H\tH\u0001¢\u0006\u0002\u0010!\u001a1\u0010&\u001a\u0018\u0012\u0004\u0012\u0002H\t\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0001j\u0002`\u000f0\u00180'\"\b\b\u0000\u0010\t*\u00020\n*\u0002H\tH\u0002¢\u0006\u0002\u0010(\u001a\u001c\u0010)\u001a\u00020**\u00060\u0001j\u0002`\u000f2\n\u0010+\u001a\u00060\u0001j\u0002`\u000fH\u0002\u001a#\u0010,\u001a\u00020-*\f\u0012\b\u0012\u00060\u0001j\u0002`\u000f0\u00182\u0006\u0010.\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010/\u001a\u0014\u00100\u001a\u00020\u0016*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001a\u0010\u00101\u001a\u00020**\u00060\u0001j\u0002`\u000fH\u0000\u001a\u001b\u00102\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n*\u0002H\tH\u0002¢\u0006\u0002\u0010!\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0004\u001a\n \u0005*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000*\f\b\u0000\u00103\"\u00020\u00132\u00020\u0013*\f\b\u0000\u00104\"\u00020\u00012\u00020\u0001¨\u00065"}, d2 = {"ARTIFICIAL_FRAME", "Ljava/lang/StackTraceElement;", "baseContinuationImplClass", "", "baseContinuationImplClassName", "kotlin.jvm.PlatformType", "stackTraceRecoveryClass", "stackTraceRecoveryClassName", "createFinalException", "E", "", "cause", "result", "resultStackTrace", "Ljava/util/ArrayDeque;", "Lkotlinx/coroutines/internal/StackTraceElement;", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "createStackTrace", "continuation", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "mergeRecoveredTraces", "", "recoveredStacktrace", "", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "recoverAndThrow", "", "exception", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recoverFromStackFrame", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;", "recoverStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "unwrap", "unwrapImpl", "causeAndStacktrace", "Lkotlin/Pair;", "(Ljava/lang/Throwable;)Lkotlin/Pair;", "elementWiseEquals", "", "e", "firstFrameIndex", "", "methodName", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "initCause", "isArtificial", "sanitizeStackTrace", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StackTraceRecoveryKt {
    private static final java.lang.StackTraceElement ARTIFICIAL_FRAME = null;
    private static final java.lang.String baseContinuationImplClass = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    private static final java.lang.String baseContinuationImplClassName = null;
    private static final java.lang.String stackTraceRecoveryClass = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    private static final java.lang.String stackTraceRecoveryClassName = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.internal.StackTraceRecoveryKt"
            java.lang.String r1 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl"
            _COROUTINE.ArtificialStackFrames r2 = new _COROUTINE.ArtificialStackFrames
            r2.<init>()
            java.lang.StackTraceElement r2 = r2.coroutineBoundary()
            kotlinx.coroutines.internal.StackTraceRecoveryKt.ARTIFICIAL_FRAME = r2
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L20
            r2 = 0
            java.lang.Class r3 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = r3.getCanonicalName()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r2 = kotlin.Result.m153constructorimpl(r3)     // Catch: java.lang.Throwable -> L20
            goto L2b
        L20:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.m153constructorimpl(r2)
        L2b:
            java.lang.Throwable r3 = kotlin.Result.m156exceptionOrNullimpl(r2)
            if (r3 != 0) goto L33
            r1 = r2
            goto L35
        L33:
            r2 = 0
        L35:
            java.lang.String r1 = (java.lang.String) r1
            kotlinx.coroutines.internal.StackTraceRecoveryKt.baseContinuationImplClassName = r1
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L4a
            r1 = 0
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r2)     // Catch: java.lang.Throwable -> L4a
            goto L55
        L4a:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)
        L55:
            java.lang.Throwable r2 = kotlin.Result.m156exceptionOrNullimpl(r1)
            if (r2 != 0) goto L5d
            r0 = r1
            goto L5f
        L5d:
            r1 = 0
        L5f:
            java.lang.String r0 = (java.lang.String) r0
            kotlinx.coroutines.internal.StackTraceRecoveryKt.stackTraceRecoveryClassName = r0
            return
    }

    public static /* synthetic */ void CoroutineStackFrame$annotations() {
            return
    }

    public static /* synthetic */ void StackTraceElement$annotations() {
            return
    }

    public static final /* synthetic */ java.lang.Throwable access$recoverFromStackFrame(java.lang.Throwable r1, kotlin.coroutines.jvm.internal.CoroutineStackFrame r2) {
            java.lang.Throwable r0 = recoverFromStackFrame(r1, r2)
            return r0
    }

    private static final <E extends java.lang.Throwable> kotlin.Pair<E, java.lang.StackTraceElement[]> causeAndStacktrace(E r10) {
            java.lang.Throwable r0 = r10.getCause()
            r1 = 0
            if (r0 == 0) goto L3e
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r3 = r10.getClass()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L3e
            java.lang.StackTraceElement[] r2 = r10.getStackTrace()
            r3 = r2
            r4 = 0
            int r5 = r3.length
            r6 = r1
        L1d:
            if (r6 >= r5) goto L2e
            r7 = r3[r6]
            r8 = r7
            r9 = 0
            boolean r8 = isArtificial(r8)
            if (r8 == 0) goto L2b
            r5 = 1
            goto L2f
        L2b:
            int r6 = r6 + 1
            goto L1d
        L2e:
            r5 = r1
        L2f:
            if (r5 == 0) goto L36
            kotlin.Pair r1 = kotlin.TuplesKt.to(r0, r2)
            goto L45
        L36:
            r3 = 0
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            kotlin.Pair r1 = kotlin.TuplesKt.to(r10, r1)
            goto L45
        L3e:
            r2 = 0
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            kotlin.Pair r1 = kotlin.TuplesKt.to(r10, r1)
        L45:
            return r1
    }

    private static final <E extends java.lang.Throwable> E createFinalException(E r8, E r9, java.util.ArrayDeque<java.lang.StackTraceElement> r10) {
            java.lang.StackTraceElement r0 = kotlinx.coroutines.internal.StackTraceRecoveryKt.ARTIFICIAL_FRAME
            r10.addFirst(r0)
            java.lang.StackTraceElement[] r0 = r8.getStackTrace()
            java.lang.String r1 = kotlinx.coroutines.internal.StackTraceRecoveryKt.baseContinuationImplClassName
            int r1 = firstFrameIndex(r0, r1)
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L24
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            r4 = 0
            r5 = r2
            java.lang.StackTraceElement[] r3 = new java.lang.StackTraceElement[r3]
            java.lang.Object[] r2 = r5.toArray(r3)
            java.lang.StackTraceElement[] r2 = (java.lang.StackTraceElement[]) r2
            r9.setStackTrace(r2)
            return r9
        L24:
            int r2 = r10.size()
            int r2 = r2 + r1
            java.lang.StackTraceElement[] r2 = new java.lang.StackTraceElement[r2]
            r4 = 0
        L2c:
            if (r4 >= r1) goto L35
            r5 = r0[r4]
            r2[r4] = r5
            int r4 = r4 + 1
            goto L2c
        L35:
            java.util.Iterator r4 = r10.iterator()
        L39:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4d
            r5 = r3
            int r3 = r3 + 1
            java.lang.Object r6 = r4.next()
            java.lang.StackTraceElement r6 = (java.lang.StackTraceElement) r6
            int r7 = r1 + r5
            r2[r7] = r6
            goto L39
        L4d:
            r9.setStackTrace(r2)
            return r9
    }

    private static final java.util.ArrayDeque<java.lang.StackTraceElement> createStackTrace(kotlin.coroutines.jvm.internal.CoroutineStackFrame r4) {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            java.lang.StackTraceElement r1 = r4.getStackTraceElement()
            if (r1 == 0) goto Lf
            r2 = 0
            r0.add(r1)
        Lf:
            r1 = r4
        L10:
            boolean r2 = r1 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r2 == 0) goto L17
            r2 = r1
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 == 0) goto L2d
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r2 = r2.getCallerFrame()
            if (r2 != 0) goto L21
            goto L2d
        L21:
            r1 = r2
            java.lang.StackTraceElement r2 = r1.getStackTraceElement()
            if (r2 == 0) goto L10
            r3 = 0
            r0.add(r2)
            goto L10
        L2d:
            return r0
    }

    private static final boolean elementWiseEquals(java.lang.StackTraceElement r2, java.lang.StackTraceElement r3) {
            int r0 = r2.getLineNumber()
            int r1 = r3.getLineNumber()
            if (r0 != r1) goto L36
            java.lang.String r0 = r2.getMethodName()
            java.lang.String r1 = r3.getMethodName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L36
            java.lang.String r0 = r2.getFileName()
            java.lang.String r1 = r3.getFileName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L36
            java.lang.String r0 = r2.getClassName()
            java.lang.String r1 = r3.getClassName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L36
            r0 = 1
            goto L37
        L36:
            r0 = 0
        L37:
            return r0
    }

    private static final int firstFrameIndex(java.lang.StackTraceElement[] r7, java.lang.String r8) {
            r0 = r7
            r1 = 0
            r2 = 0
            int r3 = r0.length
        L4:
            if (r2 >= r3) goto L17
            r4 = r0[r2]
            r5 = 0
            java.lang.String r6 = r4.getClassName()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r6)
            if (r4 == 0) goto L14
            goto L18
        L14:
            int r2 = r2 + 1
            goto L4
        L17:
            r2 = -1
        L18:
            return r2
    }

    public static final void initCause(java.lang.Throwable r0, java.lang.Throwable r1) {
            r0.initCause(r1)
            return
    }

    public static final boolean isArtificial(java.lang.StackTraceElement r5) {
            java.lang.String r0 = r5.getClassName()
            java.lang.String r1 = _COROUTINE.CoroutineDebuggingKt.getARTIFICIAL_FRAME_PACKAGE_NAME()
            r2 = 2
            r3 = 0
            r4 = 0
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r0, r1, r4, r2, r3)
            return r0
    }

    private static final void mergeRecoveredTraces(java.lang.StackTraceElement[] r6, java.util.ArrayDeque<java.lang.StackTraceElement> r7) {
            r0 = r6
            r1 = 0
            r2 = 0
            int r3 = r0.length
        L4:
            if (r2 >= r3) goto L13
            r4 = r0[r2]
            r5 = 0
            boolean r4 = isArtificial(r4)
            if (r4 == 0) goto L10
            goto L14
        L10:
            int r2 = r2 + 1
            goto L4
        L13:
            r2 = -1
        L14:
            int r2 = r2 + 1
            int r0 = r6.length
            int r0 = r0 + (-1)
            r1 = r0
            if (r2 > r1) goto L37
        L1c:
            r3 = r6[r1]
            java.lang.Object r4 = r7.getLast()
            java.lang.StackTraceElement r4 = (java.lang.StackTraceElement) r4
            boolean r4 = elementWiseEquals(r3, r4)
            if (r4 == 0) goto L2d
            r7.removeLast()
        L2d:
            r4 = r6[r1]
            r7.addFirst(r4)
            if (r1 == r2) goto L37
            int r1 = r1 + (-1)
            goto L1c
        L37:
            return
    }

    public static final java.lang.Object recoverAndThrow(java.lang.Throwable r4, kotlin.coroutines.Continuation<?> r5) {
            r0 = 0
            boolean r1 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r1 == 0) goto L16
            r1 = r5
            r2 = 0
            boolean r3 = r1 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r3 != 0) goto Le
            throw r4
        Le:
            r3 = r1
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r3 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r3
            java.lang.Throwable r3 = access$recoverFromStackFrame(r4, r3)
            throw r3
        L16:
            throw r4
    }

    private static final java.lang.Object recoverAndThrow$$forInline(java.lang.Throwable r4, kotlin.coroutines.Continuation<?> r5) {
            r0 = 0
            boolean r1 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r1 == 0) goto L18
            r1 = r5
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r2 = 0
            boolean r3 = r1 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r3 != 0) goto L10
            throw r4
        L10:
            r3 = r1
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r3 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r3
            java.lang.Throwable r3 = access$recoverFromStackFrame(r4, r3)
            throw r3
        L18:
            throw r4
    }

    private static final <E extends java.lang.Throwable> E recoverFromStackFrame(E r5, kotlin.coroutines.jvm.internal.CoroutineStackFrame r6) {
            kotlin.Pair r0 = causeAndStacktrace(r5)
            java.lang.Object r1 = r0.component1()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.component2()
            java.lang.StackTraceElement[] r0 = (java.lang.StackTraceElement[]) r0
            java.lang.Throwable r2 = kotlinx.coroutines.internal.ExceptionsConstructorKt.tryCopyException(r1)
            if (r2 != 0) goto L17
            return r5
        L17:
            java.util.ArrayDeque r3 = createStackTrace(r6)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L22
            return r5
        L22:
            if (r1 == r5) goto L27
            mergeRecoveredTraces(r0, r3)
        L27:
            java.lang.Throwable r4 = createFinalException(r1, r2, r3)
            return r4
    }

    public static final <E extends java.lang.Throwable> E recoverStackTrace(E r2) {
            boolean r0 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r0 != 0) goto L7
            return r2
        L7:
            java.lang.Throwable r0 = kotlinx.coroutines.internal.ExceptionsConstructorKt.tryCopyException(r2)
            if (r0 != 0) goto Le
            return r2
        Le:
            java.lang.Throwable r1 = sanitizeStackTrace(r0)
            return r1
    }

    public static final <E extends java.lang.Throwable> E recoverStackTrace(E r2, kotlin.coroutines.Continuation<?> r3) {
            r0 = 0
            boolean r1 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r1 == 0) goto L14
            boolean r1 = r3 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 != 0) goto Lc
            goto L14
        Lc:
            r1 = r3
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r1 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r1
            java.lang.Throwable r1 = access$recoverFromStackFrame(r2, r1)
            return r1
        L14:
            return r2
    }

    private static final <E extends java.lang.Throwable> E sanitizeStackTrace(E r11) {
            java.lang.StackTraceElement[] r0 = r11.getStackTrace()
            int r1 = r0.length
            r2 = r0
            r3 = 0
            int r4 = r2.length
            r5 = -1
            int r4 = r4 + r5
            if (r4 < 0) goto L20
        Lc:
            r6 = r4
            int r4 = r4 + r5
            r7 = r2[r6]
            r8 = 0
            java.lang.String r9 = kotlinx.coroutines.internal.StackTraceRecoveryKt.stackTraceRecoveryClassName
            java.lang.String r10 = r7.getClassName()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r7 == 0) goto L1e
            goto L21
        L1e:
            if (r4 >= 0) goto Lc
        L20:
            r6 = r5
        L21:
            int r2 = r6 + 1
            java.lang.String r3 = kotlinx.coroutines.internal.StackTraceRecoveryKt.baseContinuationImplClassName
            int r3 = firstFrameIndex(r0, r3)
            r4 = 0
            if (r3 != r5) goto L2f
            r5 = r4
            goto L31
        L2f:
            int r5 = r1 - r3
        L31:
            int r7 = r1 - r6
            int r7 = r7 - r5
            java.lang.StackTraceElement[] r8 = new java.lang.StackTraceElement[r7]
        L36:
            if (r4 >= r7) goto L48
            if (r4 != 0) goto L3d
            java.lang.StackTraceElement r9 = kotlinx.coroutines.internal.StackTraceRecoveryKt.ARTIFICIAL_FRAME
            goto L43
        L3d:
            int r9 = r2 + r4
            int r9 = r9 + (-1)
            r9 = r0[r9]
        L43:
            r8[r4] = r9
            int r4 = r4 + 1
            goto L36
        L48:
            r11.setStackTrace(r8)
            return r11
    }

    public static final <E extends java.lang.Throwable> E unwrap(E r2) {
            r0 = 0
            boolean r1 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r1 != 0) goto L9
            r1 = r2
            goto Ld
        L9:
            java.lang.Throwable r1 = unwrapImpl(r2)
        Ld:
            return r1
    }

    public static final <E extends java.lang.Throwable> E unwrapImpl(E r9) {
            java.lang.Throwable r0 = r9.getCause()
            if (r0 == 0) goto L33
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r2 = r9.getClass()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L15
            goto L33
        L15:
            java.lang.StackTraceElement[] r1 = r9.getStackTrace()
            r2 = 0
            int r3 = r1.length
            r4 = 0
            r5 = r4
        L1d:
            if (r5 >= r3) goto L2e
            r6 = r1[r5]
            r7 = r6
            r8 = 0
            boolean r7 = isArtificial(r7)
            if (r7 == 0) goto L2b
            r4 = 1
            goto L2f
        L2b:
            int r5 = r5 + 1
            goto L1d
        L2e:
        L2f:
            if (r4 == 0) goto L32
            return r0
        L32:
            return r9
        L33:
            return r9
    }
}
