package androidx.activity;

/* JADX INFO: compiled from: BackEventCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005¨\u0006\r"}, d2 = {"Landroidx/activity/Api34Impl;", "", "<init>", "()V", "createOnBackEvent", "Landroid/window/BackEvent;", "touchX", "", "touchY", "progress", "swipeEdge", "", "backEvent", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Api34Impl {
    public static final androidx.activity.Api34Impl INSTANCE = null;

    static {
            androidx.activity.Api34Impl r0 = new androidx.activity.Api34Impl
            r0.<init>()
            androidx.activity.Api34Impl.INSTANCE = r0
            return
    }

    private Api34Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    public final android.window.BackEvent createOnBackEvent(float r2, float r3, float r4, int r5) {
            r1 = this;
            android.window.BackEvent r0 = new android.window.BackEvent
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public final float progress(android.window.BackEvent r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            float r0 = r2.getProgress()
            return r0
    }

    public final int swipeEdge(android.window.BackEvent r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.getSwipeEdge()
            return r0
    }

    public final float touchX(android.window.BackEvent r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            float r0 = r2.getTouchX()
            return r0
    }

    public final float touchY(android.window.BackEvent r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            float r0 = r2.getTouchY()
            return r0
    }
}
