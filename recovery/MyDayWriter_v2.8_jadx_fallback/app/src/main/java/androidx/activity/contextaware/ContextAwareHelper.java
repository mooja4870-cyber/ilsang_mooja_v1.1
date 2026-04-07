package androidx.activity.contextaware;

/* JADX INFO: compiled from: ContextAwareHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/activity/contextaware/ContextAwareHelper;", "", "<init>", "()V", "listeners", "", "Landroidx/activity/contextaware/OnContextAvailableListener;", "context", "Landroid/content/Context;", "peekAvailableContext", "addOnContextAvailableListener", "", "listener", "removeOnContextAvailableListener", "dispatchOnContextAvailable", "clearAvailableContext", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContextAwareHelper {
    private volatile android.content.Context context;
    private final java.util.Set<androidx.activity.contextaware.OnContextAvailableListener> listeners;

    public ContextAwareHelper() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            java.util.Set r0 = (java.util.Set) r0
            r1.listeners = r0
            return
    }

    public final void addOnContextAvailableListener(androidx.activity.contextaware.OnContextAvailableListener r3) {
            r2 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.content.Context r0 = r2.context
            if (r0 == 0) goto Ld
            r1 = 0
            r3.onContextAvailable(r0)
        Ld:
            java.util.Set<androidx.activity.contextaware.OnContextAvailableListener> r0 = r2.listeners
            r0.add(r3)
            return
    }

    public final void clearAvailableContext() {
            r1 = this;
            r0 = 0
            r1.context = r0
            return
    }

    public final void dispatchOnContextAvailable(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.context = r3
            java.util.Set<androidx.activity.contextaware.OnContextAvailableListener> r0 = r2.listeners
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            androidx.activity.contextaware.OnContextAvailableListener r1 = (androidx.activity.contextaware.OnContextAvailableListener) r1
            r1.onContextAvailable(r3)
            goto Ld
        L1d:
            return
    }

    public final android.content.Context peekAvailableContext() {
            r1 = this;
            android.content.Context r0 = r1.context
            return r0
    }

    public final void removeOnContextAvailableListener(androidx.activity.contextaware.OnContextAvailableListener r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Set<androidx.activity.contextaware.OnContextAvailableListener> r0 = r1.listeners
            r0.remove(r2)
            return
    }
}
