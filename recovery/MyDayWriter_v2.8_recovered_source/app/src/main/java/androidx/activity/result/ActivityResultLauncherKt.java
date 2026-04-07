package androidx.activity.result;

/* JADX INFO: compiled from: ActivityResultLauncher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u001a#\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"launch", "", "Landroidx/activity/result/ActivityResultLauncher;", "Ljava/lang/Void;", "options", "Landroidx/core/app/ActivityOptionsCompat;", "launchUnit", "activity_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ActivityResultLauncherKt {
    public static final void launch(androidx.activity.result.ActivityResultLauncher<java.lang.Void> r1, androidx.core.app.ActivityOptionsCompat r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 0
            r1.launch(r0, r2)
            return
    }

    public static /* synthetic */ void launch$default(androidx.activity.result.ActivityResultLauncher r0, androidx.core.app.ActivityOptionsCompat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            launch(r0, r1)
            return
    }

    public static final void launchUnit(androidx.activity.result.ActivityResultLauncher<kotlin.Unit> r1, androidx.core.app.ActivityOptionsCompat r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r1.launch(r0, r2)
            return
    }

    public static /* synthetic */ void launchUnit$default(androidx.activity.result.ActivityResultLauncher r0, androidx.core.app.ActivityOptionsCompat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            launchUnit(r0, r1)
            return
    }
}
