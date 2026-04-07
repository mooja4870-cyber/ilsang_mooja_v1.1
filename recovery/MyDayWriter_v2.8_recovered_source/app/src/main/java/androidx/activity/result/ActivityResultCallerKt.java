package androidx.activity.result;

/* JADX INFO: compiled from: ActivityResultCaller.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a^\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00072\u0006\u0010\b\u001a\u0002H\u00032\u0006\u0010\t\u001a\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\t\u0012\u0007H\u0004¢\u0006\u0002\b\r\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0002\u0010\u000e\u001aV\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00072\u0006\u0010\b\u001a\u0002H\u00032\u0017\u0010\u000b\u001a\u0013\u0012\t\u0012\u0007H\u0004¢\u0006\u0002\b\r\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"registerForActivityResult", "Landroidx/activity/result/ActivityResultLauncher;", "", "I", "O", "Landroidx/activity/result/ActivityResultCaller;", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "input", "registry", "Landroidx/activity/result/ActivityResultRegistry;", "callback", "Lkotlin/Function1;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/activity/result/ActivityResultRegistry;Lkotlin/jvm/functions/Function1;)Landroidx/activity/result/ActivityResultLauncher;", "(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Landroidx/activity/result/ActivityResultLauncher;", "activity_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ActivityResultCallerKt {
    public static /* synthetic */ void $r8$lambda$ENwgic5h6novaYdTi_z5SNX1ZBE(kotlin.jvm.functions.Function1 r0, java.lang.Object r1) {
            registerForActivityResult$lambda$0(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$p6fMCAr3kK9mRhAhUUFoxiKf_xU(kotlin.jvm.functions.Function1 r0, java.lang.Object r1) {
            registerForActivityResult$lambda$1(r0, r1)
            return
    }

    public static final <I, O> androidx.activity.result.ActivityResultLauncher<kotlin.Unit> registerForActivityResult(androidx.activity.result.ActivityResultCaller r2, androidx.activity.result.contract.ActivityResultContract<I, O> r3, I r4, androidx.activity.result.ActivityResultRegistry r5, kotlin.jvm.functions.Function1<O, kotlin.Unit> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "contract"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "registry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.activity.result.ActivityResultCallerKt$$ExternalSyntheticLambda0 r0 = new androidx.activity.result.ActivityResultCallerKt$$ExternalSyntheticLambda0
            r0.<init>(r6)
            androidx.activity.result.ActivityResultLauncher r0 = r2.registerForActivityResult(r3, r5, r0)
            androidx.activity.result.ActivityResultCallerLauncher r1 = new androidx.activity.result.ActivityResultCallerLauncher
            r1.<init>(r0, r3, r4)
            androidx.activity.result.ActivityResultLauncher r1 = (androidx.activity.result.ActivityResultLauncher) r1
            return r1
    }

    public static final <I, O> androidx.activity.result.ActivityResultLauncher<kotlin.Unit> registerForActivityResult(androidx.activity.result.ActivityResultCaller r2, androidx.activity.result.contract.ActivityResultContract<I, O> r3, I r4, kotlin.jvm.functions.Function1<O, kotlin.Unit> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "contract"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.activity.result.ActivityResultCallerKt$$ExternalSyntheticLambda1 r0 = new androidx.activity.result.ActivityResultCallerKt$$ExternalSyntheticLambda1
            r0.<init>(r5)
            androidx.activity.result.ActivityResultLauncher r0 = r2.registerForActivityResult(r3, r0)
            androidx.activity.result.ActivityResultCallerLauncher r1 = new androidx.activity.result.ActivityResultCallerLauncher
            r1.<init>(r0, r3, r4)
            androidx.activity.result.ActivityResultLauncher r1 = (androidx.activity.result.ActivityResultLauncher) r1
            return r1
    }

    private static final void registerForActivityResult$lambda$0(kotlin.jvm.functions.Function1 r0, java.lang.Object r1) {
            r0.invoke(r1)
            return
    }

    private static final void registerForActivityResult$lambda$1(kotlin.jvm.functions.Function1 r0, java.lang.Object r1) {
            r0.invoke(r1)
            return
    }
}
