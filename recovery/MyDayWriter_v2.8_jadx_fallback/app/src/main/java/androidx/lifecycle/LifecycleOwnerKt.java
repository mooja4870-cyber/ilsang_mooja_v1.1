package androidx.lifecycle;

/* JADX INFO: compiled from: LifecycleOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleScope", "(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;", "lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LifecycleOwnerKt {
    public static final androidx.lifecycle.LifecycleCoroutineScope getLifecycleScope(androidx.lifecycle.LifecycleOwner r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.lifecycle.Lifecycle r0 = r1.getLifecycle()
            androidx.lifecycle.LifecycleCoroutineScope r0 = androidx.lifecycle.LifecycleKt.getCoroutineScope(r0)
            return r0
    }
}
