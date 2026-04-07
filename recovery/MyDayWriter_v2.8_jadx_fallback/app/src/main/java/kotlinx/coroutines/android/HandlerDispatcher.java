package kotlinx.coroutines.android;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "()V", "immediate", "getImmediate", "()Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/android/HandlerContext;", "kotlinx-coroutines-android"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class HandlerDispatcher extends kotlinx.coroutines.MainCoroutineDispatcher implements kotlinx.coroutines.Delay {
    private HandlerDispatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ HandlerDispatcher(kotlin.jvm.internal.DefaultConstructorMarker r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.Delay
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public java.lang.Object delay(long r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r1 = this;
            java.lang.Object r0 = kotlinx.coroutines.Delay.DefaultImpls.delay(r1, r2, r4)
            return r0
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public abstract kotlinx.coroutines.android.HandlerDispatcher getImmediate();

    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long r2, java.lang.Runnable r4, kotlin.coroutines.CoroutineContext r5) {
            r1 = this;
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.Delay.DefaultImpls.invokeOnTimeout(r1, r2, r4, r5)
            return r0
    }
}
