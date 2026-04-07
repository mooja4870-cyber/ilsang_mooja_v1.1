package androidx.activity;

/* JADX INFO: compiled from: BackEventCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005¨\u0006\u000f"}, d2 = {"Landroidx/activity/Api36Impl;", "", "<init>", "()V", "createOnBackEvent", "Landroid/window/BackEvent;", "touchX", "", "touchY", "progress", "swipeEdge", "", "frameTimeMillis", "", "backEvent", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Api36Impl {
    public static final androidx.activity.Api36Impl INSTANCE = null;

    static {
            androidx.activity.Api36Impl r0 = new androidx.activity.Api36Impl
            r0.<init>()
            androidx.activity.Api36Impl.INSTANCE = r0
            return
    }

    private Api36Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    public final android.window.BackEvent createOnBackEvent(float r8, float r9, float r10, int r11, long r12) {
            r7 = this;
            android.window.BackEvent r0 = new android.window.BackEvent
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final long frameTimeMillis(android.window.BackEvent r3) {
            r2 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            long r0 = r3.getFrameTimeMillis()
            return r0
    }
}
