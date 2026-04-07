package androidx.activity;

/* JADX INFO: compiled from: OnBackPressedCallback.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0014\u001a\u00020\u000fH\u0007J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\b\u0010\u0019\u001a\u00020\u000fH'J\b\u0010\u001a\u001a\u00020\u000fH\u0017J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\fH\u0001J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\fH\u0001R&\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00038G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "enabled", "", "<init>", "(Z)V", "value", "isEnabled", "()Z", "setEnabled", "cancellables", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/activity/Cancellable;", "enabledChangedCallback", "Lkotlin/Function0;", "", "getEnabledChangedCallback$activity_release", "()Lkotlin/jvm/functions/Function0;", "setEnabledChangedCallback$activity_release", "(Lkotlin/jvm/functions/Function0;)V", "remove", "handleOnBackStarted", "backEvent", "Landroidx/activity/BackEventCompat;", "handleOnBackProgressed", "handleOnBackPressed", "handleOnBackCancelled", "addCancellable", "cancellable", "removeCancellable", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class OnBackPressedCallback {
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> cancellables;
    private kotlin.jvm.functions.Function0<kotlin.Unit> enabledChangedCallback;
    private boolean isEnabled;

    public OnBackPressedCallback(boolean r2) {
            r1 = this;
            r1.<init>()
            r1.isEnabled = r2
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.cancellables = r0
            return
    }

    public final void addCancellable(androidx.activity.Cancellable r2) {
            r1 = this;
            java.lang.String r0 = "cancellable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> r0 = r1.cancellables
            r0.add(r2)
            return
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getEnabledChangedCallback$activity_release() {
            r1 = this;
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r1.enabledChangedCallback
            return r0
    }

    public void handleOnBackCancelled() {
            r0 = this;
            return
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(androidx.activity.BackEventCompat r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            return
    }

    public void handleOnBackStarted(androidx.activity.BackEventCompat r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            return
    }

    public final boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.isEnabled
            return r0
    }

    public final void remove() {
            r6 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> r0 = r6.cancellables
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        L9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1c
            java.lang.Object r3 = r2.next()
            r4 = r3
            androidx.activity.Cancellable r4 = (androidx.activity.Cancellable) r4
            r5 = 0
            r4.cancel()
            goto L9
        L1c:
            return
    }

    public final void removeCancellable(androidx.activity.Cancellable r2) {
            r1 = this;
            java.lang.String r0 = "cancellable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> r0 = r1.cancellables
            r0.remove(r2)
            return
    }

    public final void setEnabled(boolean r2) {
            r1 = this;
            r1.isEnabled = r2
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r1.enabledChangedCallback
            if (r0 == 0) goto L9
            r0.invoke()
        L9:
            return
    }

    public final void setEnabledChangedCallback$activity_release(kotlin.jvm.functions.Function0<kotlin.Unit> r1) {
            r0 = this;
            r0.enabledChangedCallback = r1
            return
    }
}
