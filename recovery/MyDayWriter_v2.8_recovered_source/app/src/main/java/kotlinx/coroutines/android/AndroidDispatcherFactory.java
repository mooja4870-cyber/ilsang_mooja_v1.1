package kotlinx.coroutines.android;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/android/AndroidDispatcherFactory;", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "()V", "loadPriority", "", "getLoadPriority", "()I", "createDispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "allFactories", "", "hintOnError", "", "kotlinx-coroutines-android"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidDispatcherFactory implements kotlinx.coroutines.internal.MainDispatcherFactory {
    public AndroidDispatcherFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public kotlinx.coroutines.MainCoroutineDispatcher createDispatcher(java.util.List<? extends kotlinx.coroutines.internal.MainDispatcherFactory> r6) {
            r5 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r0 == 0) goto L15
            kotlinx.coroutines.android.HandlerContext r1 = new kotlinx.coroutines.android.HandlerContext
            r2 = 1
            android.os.Handler r2 = kotlinx.coroutines.android.HandlerDispatcherKt.asHandler(r0, r2)
            r3 = 2
            r4 = 0
            r1.<init>(r2, r4, r3, r4)
            kotlinx.coroutines.MainCoroutineDispatcher r1 = (kotlinx.coroutines.MainCoroutineDispatcher) r1
            return r1
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The main looper is not available"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public int getLoadPriority() {
            r1 = this;
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            return r0
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public java.lang.String hintOnError() {
            r1 = this;
            java.lang.String r0 = "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used"
            return r0
    }
}
