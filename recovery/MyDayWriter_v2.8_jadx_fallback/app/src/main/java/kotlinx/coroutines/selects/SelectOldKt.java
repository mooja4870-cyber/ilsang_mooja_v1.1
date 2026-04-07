package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: SelectOld.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u001f\b\u0004\u0010\u0002\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0081H¢\u0006\u0002\u0010\u0007\u001a5\u0010\b\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u001f\b\u0004\u0010\u0002\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0081H¢\u0006\u0002\u0010\u0007\u001a%\u0010\t\u001a\u00020\u0005\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2\u0006\u0010\f\u001a\u0002H\nH\u0002¢\u0006\u0002\u0010\r\u001a\u0018\u0010\u000e\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, d2 = {"selectOld", "R", "builder", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectUnbiasedOld", "resumeUndispatched", "T", "Lkotlinx/coroutines/CancellableContinuation;", "result", "(Lkotlinx/coroutines/CancellableContinuation;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "exception", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SelectOldKt {
    public static final /* synthetic */ void access$resumeUndispatched(kotlinx.coroutines.CancellableContinuation r0, java.lang.Object r1) {
            resumeUndispatched(r0, r1)
            return
    }

    public static final /* synthetic */ void access$resumeUndispatchedWithException(kotlinx.coroutines.CancellableContinuation r0, java.lang.Throwable r1) {
            resumeUndispatchedWithException(r0, r1)
            return
    }

    private static final <T> void resumeUndispatched(kotlinx.coroutines.CancellableContinuation<? super T> r3, T r4) {
            kotlin.coroutines.CoroutineContext r0 = r3.getContext()
            kotlinx.coroutines.CoroutineDispatcher$Key r1 = kotlinx.coroutines.CoroutineDispatcher.Key
            kotlin.coroutines.CoroutineContext$Key r1 = (kotlin.coroutines.CoroutineContext.Key) r1
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            kotlinx.coroutines.CoroutineDispatcher r0 = (kotlinx.coroutines.CoroutineDispatcher) r0
            if (r0 == 0) goto L14
            r3.resumeUndispatched(r0, r4)
            goto L20
        L14:
            r1 = r3
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.Result.m153constructorimpl(r4)
            r1.resumeWith(r2)
        L20:
            return
    }

    private static final void resumeUndispatchedWithException(kotlinx.coroutines.CancellableContinuation<?> r3, java.lang.Throwable r4) {
            kotlin.coroutines.CoroutineContext r0 = r3.getContext()
            kotlinx.coroutines.CoroutineDispatcher$Key r1 = kotlinx.coroutines.CoroutineDispatcher.Key
            kotlin.coroutines.CoroutineContext$Key r1 = (kotlin.coroutines.CoroutineContext.Key) r1
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            kotlinx.coroutines.CoroutineDispatcher r0 = (kotlinx.coroutines.CoroutineDispatcher) r0
            if (r0 == 0) goto L14
            r3.resumeUndispatchedWithException(r0, r4)
            goto L24
        L14:
            r1 = r3
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r4)
            java.lang.Object r2 = kotlin.Result.m153constructorimpl(r2)
            r1.resumeWith(r2)
        L24:
            return
    }

    public static final <R> java.lang.Object selectOld(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super R>, kotlin.Unit> r5, kotlin.coroutines.Continuation<? super R> r6) {
            r0 = 0
            r1 = r6
            r2 = 0
            kotlinx.coroutines.selects.SelectBuilderImpl r3 = new kotlinx.coroutines.selects.SelectBuilderImpl
            r3.<init>(r1)
            r5.invoke(r3)     // Catch: java.lang.Throwable -> Ld
            goto L11
        Ld:
            r4 = move-exception
            r3.handleBuilderException(r4)
        L11:
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L1e
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r6)
        L1e:
            return r1
    }

    private static final <R> java.lang.Object selectOld$$forInline(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super R>, kotlin.Unit> r5, kotlin.coroutines.Continuation<? super R> r6) {
            r0 = 0
            r1 = r6
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r2 = 0
            kotlinx.coroutines.selects.SelectBuilderImpl r3 = new kotlinx.coroutines.selects.SelectBuilderImpl
            r3.<init>(r1)
            r5.invoke(r3)     // Catch: java.lang.Throwable -> Lf
            goto L13
        Lf:
            r4 = move-exception
            r3.handleBuilderException(r4)
        L13:
            java.lang.Object r4 = r3.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r1) goto L23
            r1 = r6
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r1)
        L23:
            return r4
    }

    public static final <R> java.lang.Object selectUnbiasedOld(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super R>, kotlin.Unit> r5, kotlin.coroutines.Continuation<? super R> r6) {
            r0 = 0
            r1 = r6
            r2 = 0
            kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl r3 = new kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl
            r3.<init>(r1)
            r5.invoke(r3)     // Catch: java.lang.Throwable -> Ld
            goto L11
        Ld:
            r4 = move-exception
            r3.handleBuilderException(r4)
        L11:
            java.lang.Object r1 = r3.initSelectResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L1e
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r6)
        L1e:
            return r1
    }

    private static final <R> java.lang.Object selectUnbiasedOld$$forInline(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super R>, kotlin.Unit> r5, kotlin.coroutines.Continuation<? super R> r6) {
            r0 = 0
            r1 = r6
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r2 = 0
            kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl r3 = new kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl
            r3.<init>(r1)
            r5.invoke(r3)     // Catch: java.lang.Throwable -> Lf
            goto L13
        Lf:
            r4 = move-exception
            r3.handleBuilderException(r4)
        L13:
            java.lang.Object r4 = r3.initSelectResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r1) goto L23
            r1 = r6
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r1)
        L23:
            return r4
    }
}
