package kotlinx.coroutines;

/* JADX INFO: compiled from: MainCoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0005R\u0012\u0010\u0003\u001a\u00020\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "immediate", "getImmediate", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "limitedParallelism", "parallelism", "", "toString", "", "toStringInternalImpl", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class MainCoroutineDispatcher extends kotlinx.coroutines.CoroutineDispatcher {
    public MainCoroutineDispatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract kotlinx.coroutines.MainCoroutineDispatcher getImmediate();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int r2) {
            r1 = this;
            kotlinx.coroutines.internal.LimitedDispatcherKt.checkParallelism(r2)
            r0 = r1
            kotlinx.coroutines.CoroutineDispatcher r0 = (kotlinx.coroutines.CoroutineDispatcher) r0
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.toStringInternalImpl()
            if (r0 != 0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 64
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L25:
            return r0
    }

    protected final java.lang.String toStringInternalImpl() {
            r3 = this;
            kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getMain()
            if (r3 != r0) goto L9
            java.lang.String r1 = "Dispatchers.Main"
            return r1
        L9:
            r1 = 0
            kotlinx.coroutines.MainCoroutineDispatcher r2 = r0.getImmediate()     // Catch: java.lang.UnsupportedOperationException -> Lf
            goto L11
        Lf:
            r2 = move-exception
            r2 = r1
        L11:
            if (r3 != r2) goto L18
            java.lang.String r1 = "Dispatchers.Main.immediate"
            return r1
        L18:
            return r1
    }
}
