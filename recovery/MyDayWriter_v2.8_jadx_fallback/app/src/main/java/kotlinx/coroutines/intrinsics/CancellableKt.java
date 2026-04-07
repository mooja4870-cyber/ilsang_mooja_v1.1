package kotlinx.coroutines.intrinsics;

/* JADX INFO: compiled from: Cancellable.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a#\u0010\u0006\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0082\b\u001a\u001e\u0010\t\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0000\u001a;\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u000b*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0003H\u0007¢\u0006\u0002\u0010\u000e\u001av\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u000b*\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00102\u0006\u0010\u0011\u001a\u0002H\u000f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00032%\b\u0002\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0000¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"dispatcherFailure", "", "completion", "Lkotlin/coroutines/Continuation;", "e", "", "runSafely", "block", "Lkotlin/Function0;", "startCoroutineCancellable", "fatalCompletion", "T", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "receiver", "onCancellation", "Lkotlin/ParameterName;", "name", "cause", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CancellableKt {
    private static final void dispatcherFailure(kotlin.coroutines.Continuation<?> r1, java.lang.Throwable r2) {
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r0)
            r1.resumeWith(r0)
            throw r2
    }

    private static final void runSafely(kotlin.coroutines.Continuation<?> r2, kotlin.jvm.functions.Function0<kotlin.Unit> r3) {
            r0 = 0
            r3.invoke()     // Catch: java.lang.Throwable -> L6
            goto La
        L6:
            r1 = move-exception
            dispatcherFailure(r2, r1)
        La:
            return
    }

    public static final void startCoroutineCancellable(kotlin.coroutines.Continuation<? super kotlin.Unit> r6, kotlin.coroutines.Continuation<?> r7) {
            r0 = 0
            r1 = 0
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r6)     // Catch: java.lang.Throwable -> L16
            kotlin.Result$Companion r3 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L16
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L16
            java.lang.Object r3 = kotlin.Result.m153constructorimpl(r3)     // Catch: java.lang.Throwable -> L16
            r4 = 2
            r5 = 0
            kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith$default(r2, r3, r5, r4, r5)     // Catch: java.lang.Throwable -> L16
            goto L1a
        L16:
            r1 = move-exception
            dispatcherFailure(r7, r1)
        L1a:
            return
    }

    public static final <T> void startCoroutineCancellable(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<? super T> r7) {
            r0 = 0
            r1 = 0
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(r6, r7)     // Catch: java.lang.Throwable -> L1a
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r2)     // Catch: java.lang.Throwable -> L1a
            kotlin.Result$Companion r3 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1a
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r3 = kotlin.Result.m153constructorimpl(r3)     // Catch: java.lang.Throwable -> L1a
            r4 = 2
            r5 = 0
            kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith$default(r2, r3, r5, r4, r5)     // Catch: java.lang.Throwable -> L1a
            goto L1e
        L1a:
            r1 = move-exception
            dispatcherFailure(r7, r1)
        L1e:
            return
    }

    public static final <R, T> void startCoroutineCancellable(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r4, R r5, kotlin.coroutines.Continuation<? super T> r6, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r7) {
            r0 = 0
            r1 = 0
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(r4, r5, r6)     // Catch: java.lang.Throwable -> L18
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r2)     // Catch: java.lang.Throwable -> L18
            kotlin.Result$Companion r3 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L18
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L18
            java.lang.Object r3 = kotlin.Result.m153constructorimpl(r3)     // Catch: java.lang.Throwable -> L18
            kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith(r2, r3, r7)     // Catch: java.lang.Throwable -> L18
            goto L1c
        L18:
            r1 = move-exception
            dispatcherFailure(r6, r1)
        L1c:
            return
    }

    public static /* synthetic */ void startCoroutineCancellable$default(kotlin.jvm.functions.Function2 r0, java.lang.Object r1, kotlin.coroutines.Continuation r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            startCoroutineCancellable(r0, r1, r2, r3)
            return
    }
}
