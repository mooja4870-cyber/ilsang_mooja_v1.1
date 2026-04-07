package androidx.lifecycle;

/* JADX INFO: compiled from: CompositeGeneratedAdaptersObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\r"}, d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "generatedAdapters", "", "Landroidx/lifecycle/GeneratedAdapter;", "([Landroidx/lifecycle/GeneratedAdapter;)V", "[Landroidx/lifecycle/GeneratedAdapter;", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CompositeGeneratedAdaptersObserver implements androidx.lifecycle.LifecycleEventObserver {
    private final androidx.lifecycle.GeneratedAdapter[] generatedAdapters;

    public CompositeGeneratedAdaptersObserver(androidx.lifecycle.GeneratedAdapter[] r2) {
            r1 = this;
            java.lang.String r0 = "generatedAdapters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.generatedAdapters = r2
            return
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner r7, androidx.lifecycle.Lifecycle.Event r8) {
            r6 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            androidx.lifecycle.MethodCallsLogger r0 = new androidx.lifecycle.MethodCallsLogger
            r0.<init>()
            androidx.lifecycle.GeneratedAdapter[] r1 = r6.generatedAdapters
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L14:
            if (r4 >= r2) goto L1e
            r5 = r1[r4]
            r5.callMethods(r7, r8, r3, r0)
            int r4 = r4 + 1
            goto L14
        L1e:
            androidx.lifecycle.GeneratedAdapter[] r1 = r6.generatedAdapters
            int r2 = r1.length
        L21:
            if (r3 >= r2) goto L2c
            r4 = r1[r3]
            r5 = 1
            r4.callMethods(r7, r8, r5, r0)
            int r3 = r3 + 1
            goto L21
        L2c:
            return
    }
}
