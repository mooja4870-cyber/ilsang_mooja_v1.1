package androidx.activity.result;

/* JADX INFO: compiled from: ActivityResultCaller.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0004H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR'\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0011\u0010\fR \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Landroidx/activity/result/ActivityResultCallerLauncher;", "I", "O", "Landroidx/activity/result/ActivityResultLauncher;", "", "launcher", "callerContract", "Landroidx/activity/result/contract/ActivityResultContract;", "callerInput", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;)V", "getCallerContract", "()Landroidx/activity/result/contract/ActivityResultContract;", "getCallerInput", "()Ljava/lang/Object;", "Ljava/lang/Object;", "resultContract", "getResultContract", "resultContract$delegate", "Lkotlin/Lazy;", "launch", "input", "options", "Landroidx/core/app/ActivityOptionsCompat;", "(Lkotlin/Unit;Landroidx/core/app/ActivityOptionsCompat;)V", "unregister", "contract", "getContract", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActivityResultCallerLauncher<I, O> extends androidx.activity.result.ActivityResultLauncher<kotlin.Unit> {
    private final androidx.activity.result.contract.ActivityResultContract<I, O> callerContract;
    private final I callerInput;
    private final androidx.activity.result.contract.ActivityResultContract<kotlin.Unit, O> contract;
    private final androidx.activity.result.ActivityResultLauncher<I> launcher;
    private final kotlin.Lazy resultContract$delegate;

    /* JADX INFO: renamed from: $r8$lambda$Ch0g-owsUD3RY0ZHQNvP1kLq24A, reason: not valid java name */
    public static /* synthetic */ androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1 m13$r8$lambda$Ch0gowsUD3RY0ZHQNvP1kLq24A(androidx.activity.result.ActivityResultCallerLauncher r0) {
            androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1 r0 = resultContract_delegate$lambda$0(r0)
            return r0
    }

    public ActivityResultCallerLauncher(androidx.activity.result.ActivityResultLauncher<I> r2, androidx.activity.result.contract.ActivityResultContract<I, O> r3, I r4) {
            r1 = this;
            java.lang.String r0 = "launcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "callerContract"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.launcher = r2
            r1.callerContract = r3
            r1.callerInput = r4
            androidx.activity.result.ActivityResultCallerLauncher$$ExternalSyntheticLambda0 r0 = new androidx.activity.result.ActivityResultCallerLauncher$$ExternalSyntheticLambda0
            r0.<init>(r1)
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r1.resultContract$delegate = r0
            androidx.activity.result.contract.ActivityResultContract r0 = r1.getResultContract()
            r1.contract = r0
            return
    }

    private final androidx.activity.result.contract.ActivityResultContract<kotlin.Unit, O> getResultContract() {
            r1 = this;
            kotlin.Lazy r0 = r1.resultContract$delegate
            java.lang.Object r0 = r0.getValue()
            androidx.activity.result.contract.ActivityResultContract r0 = (androidx.activity.result.contract.ActivityResultContract) r0
            return r0
    }

    private static final androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1 resultContract_delegate$lambda$0(androidx.activity.result.ActivityResultCallerLauncher r1) {
            androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1 r0 = new androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1
            r0.<init>(r1)
            return r0
    }

    public final androidx.activity.result.contract.ActivityResultContract<I, O> getCallerContract() {
            r1 = this;
            androidx.activity.result.contract.ActivityResultContract<I, O> r0 = r1.callerContract
            return r0
    }

    public final I getCallerInput() {
            r1 = this;
            I r0 = r1.callerInput
            return r0
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public androidx.activity.result.contract.ActivityResultContract<kotlin.Unit, ?> getContract() {
            r1 = this;
            androidx.activity.result.contract.ActivityResultContract<kotlin.Unit, O> r0 = r1.contract
            return r0
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public /* bridge */ /* synthetic */ void launch(kotlin.Unit r2, androidx.core.app.ActivityOptionsCompat r3) {
            r1 = this;
            r0 = r2
            kotlin.Unit r0 = (kotlin.Unit) r0
            r1.launch2(r0, r3)
            return
    }

    /* JADX INFO: renamed from: launch, reason: avoid collision after fix types in other method */
    public void launch2(kotlin.Unit r3, androidx.core.app.ActivityOptionsCompat r4) {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.activity.result.ActivityResultLauncher<I> r0 = r2.launcher
            I r1 = r2.callerInput
            r0.launch(r1, r4)
            return
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void unregister() {
            r1 = this;
            androidx.activity.result.ActivityResultLauncher<I> r0 = r1.launcher
            r0.unregister()
            return
    }
}
