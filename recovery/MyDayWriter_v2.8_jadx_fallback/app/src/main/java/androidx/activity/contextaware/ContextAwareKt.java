package androidx.activity.contextaware;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u0007H\u0001¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\u0001*\u00020\u00032\u001e\b\u0004\u0010\u0004\u001a\u0018\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0002\u0012\t\u0012\u0007H\u0001¢\u0006\u0002\b\u00020\u0005H\u0086H¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"withContextAvailable", "R", "Lkotlin/jvm/JvmSuppressWildcards;", "Landroidx/activity/contextaware/ContextAware;", "onContextAvailable", "Lkotlin/Function1;", "Landroid/content/Context;", "(Landroidx/activity/contextaware/ContextAware;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ContextAwareKt {
    public static final <R> java.lang.Object withContextAvailable(androidx.activity.contextaware.ContextAware r10, kotlin.jvm.functions.Function1<android.content.Context, R> r11, kotlin.coroutines.Continuation<R> r12) {
            r0 = 0
            android.content.Context r1 = r10.peekAvailableContext()
            if (r1 == 0) goto Lc
            java.lang.Object r2 = r11.invoke(r1)
            return r2
        Lc:
            r2 = 0
            r3 = r12
            r4 = 0
            kotlinx.coroutines.CancellableContinuationImpl r5 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r3)
            r7 = 1
            r5.<init>(r6, r7)
            r5.initCancellability()
            r6 = r5
            kotlinx.coroutines.CancellableContinuation r6 = (kotlinx.coroutines.CancellableContinuation) r6
            r7 = 0
            androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1 r8 = new androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1
            r8.<init>(r6, r11)
            r9 = r8
            androidx.activity.contextaware.OnContextAvailableListener r9 = (androidx.activity.contextaware.OnContextAvailableListener) r9
            r10.addOnContextAvailableListener(r9)
            androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$1 r9 = new androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$1
            r9.<init>(r10, r8)
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r6.invokeOnCancellation(r9)
            java.lang.Object r3 = r5.getResult()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L45
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r12)
        L45:
            return r3
    }

    private static final <R> java.lang.Object withContextAvailable$$forInline(androidx.activity.contextaware.ContextAware r10, kotlin.jvm.functions.Function1<android.content.Context, R> r11, kotlin.coroutines.Continuation<R> r12) {
            r0 = 0
            android.content.Context r1 = r10.peekAvailableContext()
            if (r1 == 0) goto Lc
            java.lang.Object r2 = r11.invoke(r1)
            return r2
        Lc:
            r2 = 0
            r3 = r12
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r4 = 0
            kotlinx.coroutines.CancellableContinuationImpl r5 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r3)
            r7 = 1
            r5.<init>(r6, r7)
            r5.initCancellability()
            r6 = r5
            kotlinx.coroutines.CancellableContinuation r6 = (kotlinx.coroutines.CancellableContinuation) r6
            r7 = 0
            androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1 r8 = new androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1
            r8.<init>(r6, r11)
            r9 = r8
            androidx.activity.contextaware.OnContextAvailableListener r9 = (androidx.activity.contextaware.OnContextAvailableListener) r9
            r10.addOnContextAvailableListener(r9)
            androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$1 r9 = new androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$1
            r9.<init>(r10, r8)
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r6.invokeOnCancellation(r9)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            java.lang.Object r6 = r5.getResult()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r3) goto L4c
            r3 = r12
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r3)
        L4c:
            return r6
    }
}
