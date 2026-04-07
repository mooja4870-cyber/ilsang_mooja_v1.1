package androidx.lifecycle;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"coroutineScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroidx/lifecycle/Lifecycle;", "getCoroutineScope", "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LifecycleCoroutineScope;", "lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LifecycleKt {
    public static final androidx.lifecycle.LifecycleCoroutineScope getCoroutineScope(androidx.lifecycle.Lifecycle r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
        L5:
            java.util.concurrent.atomic.AtomicReference r0 = r5.getInternalScopeRef()
            java.lang.Object r0 = r0.get()
            androidx.lifecycle.LifecycleCoroutineScopeImpl r0 = (androidx.lifecycle.LifecycleCoroutineScopeImpl) r0
            if (r0 == 0) goto L16
            r1 = r0
            androidx.lifecycle.LifecycleCoroutineScope r1 = (androidx.lifecycle.LifecycleCoroutineScope) r1
            return r1
        L16:
            androidx.lifecycle.LifecycleCoroutineScopeImpl r1 = new androidx.lifecycle.LifecycleCoroutineScopeImpl
            r2 = 1
            r3 = 0
            kotlinx.coroutines.CompletableJob r2 = kotlinx.coroutines.SupervisorKt.SupervisorJob$default(r3, r2, r3)
            kotlinx.coroutines.MainCoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getMain()
            kotlinx.coroutines.MainCoroutineDispatcher r4 = r4.getImmediate()
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            kotlin.coroutines.CoroutineContext r2 = r2.plus(r4)
            r1.<init>(r5, r2)
            java.util.concurrent.atomic.AtomicReference r2 = r5.getInternalScopeRef()
            boolean r2 = androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(r2, r3, r1)
            if (r2 == 0) goto L5
            r1.register()
            r2 = r1
            androidx.lifecycle.LifecycleCoroutineScope r2 = (androidx.lifecycle.LifecycleCoroutineScope) r2
            return r2
    }
}
