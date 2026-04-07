package androidx.activity;

/* JADX INFO: compiled from: PipHintTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Landroidx/activity/Api26Impl;", "", "<init>", "()V", "setPipParamsSourceRectHint", "", "activity", "Landroid/app/Activity;", "hint", "Landroid/graphics/Rect;", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Api26Impl {
    public static final androidx.activity.Api26Impl INSTANCE = null;

    static {
            androidx.activity.Api26Impl r0 = new androidx.activity.Api26Impl
            r0.<init>()
            androidx.activity.Api26Impl.INSTANCE = r0
            return
    }

    private Api26Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void setPipParamsSourceRectHint(android.app.Activity r2, android.graphics.Rect r3) {
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "hint"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.app.PictureInPictureParams$Builder r0 = new android.app.PictureInPictureParams$Builder
            r0.<init>()
            android.app.PictureInPictureParams$Builder r0 = r0.setSourceRectHint(r3)
            android.app.PictureInPictureParams r0 = r0.build()
            r2.setPictureInPictureParams(r0)
            return
    }
}
