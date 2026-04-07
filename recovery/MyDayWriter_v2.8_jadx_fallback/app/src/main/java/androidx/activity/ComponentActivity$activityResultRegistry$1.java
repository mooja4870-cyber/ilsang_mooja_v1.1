package androidx.activity;

/* JADX INFO: compiled from: ComponentActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JG\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\t2\u0006\u0010\n\u001a\u0002H\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"androidx/activity/ComponentActivity$activityResultRegistry$1", "Landroidx/activity/result/ActivityResultRegistry;", "onLaunch", "", "I", "O", "requestCode", "", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "input", "options", "Landroidx/core/app/ActivityOptionsCompat;", "(ILandroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComponentActivity$activityResultRegistry$1 extends androidx.activity.result.ActivityResultRegistry {
    final /* synthetic */ androidx.activity.ComponentActivity this$0;

    /* JADX INFO: renamed from: $r8$lambda$GPRYQhThGKvRdyPr7x-fDY1xENA, reason: not valid java name */
    public static /* synthetic */ void m8$r8$lambda$GPRYQhThGKvRdyPr7xfDY1xENA(androidx.activity.ComponentActivity$activityResultRegistry$1 r0, int r1, android.content.IntentSender.SendIntentException r2) {
            onLaunch$lambda$1(r0, r1, r2)
            return
    }

    public static /* synthetic */ void $r8$lambda$Gga0ztmPNYcZ2Poj0VEtDPu4ouA(androidx.activity.ComponentActivity$activityResultRegistry$1 r0, int r1, androidx.activity.result.contract.ActivityResultContract.SynchronousResult r2) {
            onLaunch$lambda$0(r0, r1, r2)
            return
    }

    ComponentActivity$activityResultRegistry$1(androidx.activity.ComponentActivity r1) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>()
            return
    }

    private static final void onLaunch$lambda$0(androidx.activity.ComponentActivity$activityResultRegistry$1 r1, int r2, androidx.activity.result.contract.ActivityResultContract.SynchronousResult r3) {
            java.lang.Object r0 = r3.getValue()
            r1.dispatchResult(r2, r0)
            return
    }

    private static final void onLaunch$lambda$1(androidx.activity.ComponentActivity$activityResultRegistry$1 r3, int r4, android.content.IntentSender.SendIntentException r5) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
            android.content.Intent r0 = r0.setAction(r1)
            java.lang.String r1 = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"
            r2 = r5
            java.io.Serializable r2 = (java.io.Serializable) r2
            android.content.Intent r0 = r0.putExtra(r1, r2)
            r1 = 0
            r3.dispatchResult(r4, r1, r0)
            return
    }

    @Override // androidx.activity.result.ActivityResultRegistry
    public <I, O> void onLaunch(int r17, androidx.activity.result.contract.ActivityResultContract<I, O> r18, I r19, androidx.core.app.ActivityOptionsCompat r20) {
            r16 = this;
            r1 = r16
            r4 = r17
            r10 = r18
            r11 = r19
            java.lang.String r0 = "contract"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            androidx.activity.ComponentActivity r12 = r1.this$0
            r0 = r12
            android.content.Context r0 = (android.content.Context) r0
            androidx.activity.result.contract.ActivityResultContract$SynchronousResult r13 = r10.getSynchronousResult(r0, r11)
            if (r13 == 0) goto L2a
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            androidx.activity.ComponentActivity$activityResultRegistry$1$$ExternalSyntheticLambda0 r2 = new androidx.activity.ComponentActivity$activityResultRegistry$1$$ExternalSyntheticLambda0
            r2.<init>(r1, r4, r13)
            r0.post(r2)
            return
        L2a:
            r0 = r12
            android.content.Context r0 = (android.content.Context) r0
            android.content.Intent r14 = r10.createIntent(r0, r11)
            r0 = 0
            android.os.Bundle r2 = r14.getExtras()
            if (r2 == 0) goto L4c
            android.os.Bundle r2 = r14.getExtras()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.ClassLoader r2 = r2.getClassLoader()
            if (r2 != 0) goto L4c
            java.lang.ClassLoader r2 = r12.getClassLoader()
            r14.setExtrasClassLoader(r2)
        L4c:
            java.lang.String r2 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            boolean r3 = r14.hasExtra(r2)
            if (r3 == 0) goto L5d
            android.os.Bundle r0 = r14.getBundleExtra(r2)
            r14.removeExtra(r2)
            r9 = r0
            goto L66
        L5d:
            if (r20 == 0) goto L65
            android.os.Bundle r0 = r20.toBundle()
            r9 = r0
            goto L66
        L65:
            r9 = r0
        L66:
            java.lang.String r0 = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"
            java.lang.String r2 = r14.getAction()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 == 0) goto L84
            java.lang.String r0 = "androidx.activity.result.contract.extra.PERMISSIONS"
            java.lang.String[] r0 = r14.getStringArrayExtra(r0)
            if (r0 != 0) goto L7d
            r2 = 0
            java.lang.String[] r0 = new java.lang.String[r2]
        L7d:
            r2 = r12
            android.app.Activity r2 = (android.app.Activity) r2
            androidx.core.app.ActivityCompat.requestPermissions(r2, r0, r4)
            goto Lda
        L84:
            java.lang.String r0 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
            java.lang.String r2 = r14.getAction()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 == 0) goto Ld1
            java.lang.String r0 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
            android.os.Parcelable r0 = r14.getParcelableExtra(r0)
            androidx.activity.result.IntentSenderRequest r0 = (androidx.activity.result.IntentSenderRequest) r0
            r15 = r0
            r2 = r12
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: android.content.IntentSender.SendIntentException -> Lba
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)     // Catch: android.content.IntentSender.SendIntentException -> Lba
            android.content.IntentSender r3 = r15.getIntentSender()     // Catch: android.content.IntentSender.SendIntentException -> Lba
            android.content.Intent r5 = r15.getFillInIntent()     // Catch: android.content.IntentSender.SendIntentException -> Lba
            int r6 = r15.getFlagsMask()     // Catch: android.content.IntentSender.SendIntentException -> Lba
            int r7 = r15.getFlagsValues()     // Catch: android.content.IntentSender.SendIntentException -> Lba
            r8 = 0
            androidx.core.app.ActivityCompat.startIntentSenderForResult(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: android.content.IntentSender.SendIntentException -> Lba
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: android.content.IntentSender.SendIntentException -> Lba
            goto Lda
        Lba:
            r0 = move-exception
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            androidx.activity.ComponentActivity$activityResultRegistry$1$$ExternalSyntheticLambda1 r3 = new androidx.activity.ComponentActivity$activityResultRegistry$1$$ExternalSyntheticLambda1
            r3.<init>(r1, r4, r0)
            boolean r2 = r2.post(r3)
            java.lang.Boolean.valueOf(r2)
            goto Lda
        Ld1:
            r0 = r12
            android.app.Activity r0 = (android.app.Activity) r0
            androidx.core.app.ActivityCompat.startActivityForResult(r0, r14, r4, r9)
        Lda:
            return
    }
}
