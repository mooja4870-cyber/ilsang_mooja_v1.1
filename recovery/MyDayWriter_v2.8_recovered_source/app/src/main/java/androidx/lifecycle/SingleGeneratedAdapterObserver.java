package androidx.lifecycle;

/* JADX INFO: compiled from: SingleGeneratedAdapterObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/SingleGeneratedAdapterObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "generatedAdapter", "Landroidx/lifecycle/GeneratedAdapter;", "(Landroidx/lifecycle/GeneratedAdapter;)V", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SingleGeneratedAdapterObserver implements androidx.lifecycle.LifecycleEventObserver {
    private final androidx.lifecycle.GeneratedAdapter generatedAdapter;

    public SingleGeneratedAdapterObserver(androidx.lifecycle.GeneratedAdapter r2) {
            r1 = this;
            java.lang.String r0 = "generatedAdapter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.generatedAdapter = r2
            return
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner r4, androidx.lifecycle.Lifecycle.Event r5) {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.lifecycle.GeneratedAdapter r0 = r3.generatedAdapter
            r1 = 0
            r2 = 0
            r0.callMethods(r4, r5, r1, r2)
            androidx.lifecycle.GeneratedAdapter r0 = r3.generatedAdapter
            r1 = 1
            r0.callMethods(r4, r5, r1, r2)
            return
    }
}
