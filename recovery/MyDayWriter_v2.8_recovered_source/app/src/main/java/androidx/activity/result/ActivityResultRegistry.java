package androidx.activity.result;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000 92\u00020\u0001:\u0003789B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u00182\u0006\u0010\u0019\u001a\u0002H\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH'¢\u0006\u0002\u0010\u001cJJ\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00140\u001e\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u00152\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020!2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u00182\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00150#JB\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00140\u001e\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u00152\u0006\u0010\u001f\u001a\u00020\u00072\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u00182\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00150#J\u0015\u0010$\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0007H\u0001¢\u0006\u0002\b%J\u000e\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0011J\u0010\u0010(\u001a\u00020\u00132\b\u0010)\u001a\u0004\u0018\u00010\u0011J\"\u0010*\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010.H\u0007J#\u0010*\u001a\u00020+\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010/\u001a\u0002H\u0015H\u0007¢\u0006\u0002\u00100J8\u00101\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010.2\u000e\u00102\u001a\n\u0012\u0004\u0012\u0002H\u0015\u0018\u00010\u000eH\u0002J\u0010\u00103\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\b\u00104\u001a\u00020\u0006H\u0002J\u0018\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0007H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry;", "", "<init>", "()V", "rcToKey", "", "", "", "keyToRc", "keyToLifecycleContainers", "Landroidx/activity/result/ActivityResultRegistry$LifecycleContainer;", "launchedKeys", "", "keyToCallback", "Landroidx/activity/result/ActivityResultRegistry$CallbackAndContract;", "parsedPendingResults", "pendingResults", "Landroid/os/Bundle;", "onLaunch", "", "I", "O", "requestCode", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "input", "options", "Landroidx/core/app/ActivityOptionsCompat;", "(ILandroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "register", "Landroidx/activity/result/ActivityResultLauncher;", "key", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "callback", "Landroidx/activity/result/ActivityResultCallback;", "unregister", "unregister$activity_release", "onSaveInstanceState", "outState", "onRestoreInstanceState", "savedInstanceState", "dispatchResult", "", "resultCode", "data", "Landroid/content/Intent;", "result", "(ILjava/lang/Object;)Z", "doDispatch", "callbackAndContract", "registerKey", "generateRandomNumber", "bindRcKey", "rc", "CallbackAndContract", "LifecycleContainer", "Companion", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ActivityResultRegistry {
    private static final androidx.activity.result.ActivityResultRegistry.Companion Companion = null;
    private static final int INITIAL_REQUEST_CODE_VALUE = 65536;
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_PENDING_RESULTS = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_REGISTERED_RCS = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";
    private static final java.lang.String LOG_TAG = "ActivityResultRegistry";
    private final transient java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry.CallbackAndContract<?>> keyToCallback;
    private final java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry.LifecycleContainer> keyToLifecycleContainers;
    private final java.util.Map<java.lang.String, java.lang.Integer> keyToRc;
    private final java.util.List<java.lang.String> launchedKeys;
    private final java.util.Map<java.lang.String, java.lang.Object> parsedPendingResults;
    private final android.os.Bundle pendingResults;
    private final java.util.Map<java.lang.Integer, java.lang.String> rcToKey;

    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$CallbackAndContract;", "O", "", "callback", "Landroidx/activity/result/ActivityResultCallback;", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "<init>", "(Landroidx/activity/result/ActivityResultCallback;Landroidx/activity/result/contract/ActivityResultContract;)V", "getCallback", "()Landroidx/activity/result/ActivityResultCallback;", "getContract", "()Landroidx/activity/result/contract/ActivityResultContract;", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class CallbackAndContract<O> {
        private final androidx.activity.result.ActivityResultCallback<O> callback;
        private final androidx.activity.result.contract.ActivityResultContract<?, O> contract;

        public CallbackAndContract(androidx.activity.result.ActivityResultCallback<O> r2, androidx.activity.result.contract.ActivityResultContract<?, O> r3) {
                r1 = this;
                java.lang.String r0 = "callback"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "contract"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.<init>()
                r1.callback = r2
                r1.contract = r3
                return
        }

        public final androidx.activity.result.ActivityResultCallback<O> getCallback() {
                r1 = this;
                androidx.activity.result.ActivityResultCallback<O> r0 = r1.callback
                return r0
        }

        public final androidx.activity.result.contract.ActivityResultContract<?, O> getContract() {
                r1 = this;
                androidx.activity.result.contract.ActivityResultContract<?, O> r0 = r1.contract
                return r0
        }
    }

    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$Companion;", "", "<init>", "()V", "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", "", "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", "KEY_COMPONENT_ACTIVITY_PENDING_RESULTS", "LOG_TAG", "INITIAL_REQUEST_CODE_VALUE", "", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$LifecycleContainer;", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "observers", "", "Landroidx/lifecycle/LifecycleEventObserver;", "addObserver", "", "observer", "clearObservers", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class LifecycleContainer {
        private final androidx.lifecycle.Lifecycle lifecycle;
        private final java.util.List<androidx.lifecycle.LifecycleEventObserver> observers;

        public LifecycleContainer(androidx.lifecycle.Lifecycle r2) {
                r1 = this;
                java.lang.String r0 = "lifecycle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.lifecycle = r2
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r0 = (java.util.List) r0
                r1.observers = r0
                return
        }

        public final void addObserver(androidx.lifecycle.LifecycleEventObserver r3) {
                r2 = this;
                java.lang.String r0 = "observer"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                androidx.lifecycle.Lifecycle r0 = r2.lifecycle
                r1 = r3
                androidx.lifecycle.LifecycleObserver r1 = (androidx.lifecycle.LifecycleObserver) r1
                r0.addObserver(r1)
                java.util.List<androidx.lifecycle.LifecycleEventObserver> r0 = r2.observers
                r0.add(r3)
                return
        }

        public final void clearObservers() {
                r8 = this;
                java.util.List<androidx.lifecycle.LifecycleEventObserver> r0 = r8.observers
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                r1 = 0
                java.util.Iterator r2 = r0.iterator()
            L9:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L21
                java.lang.Object r3 = r2.next()
                r4 = r3
                androidx.lifecycle.LifecycleEventObserver r4 = (androidx.lifecycle.LifecycleEventObserver) r4
                r5 = 0
                androidx.lifecycle.Lifecycle r6 = r8.lifecycle
                r7 = r4
                androidx.lifecycle.LifecycleObserver r7 = (androidx.lifecycle.LifecycleObserver) r7
                r6.removeObserver(r7)
                goto L9
            L21:
                java.util.List<androidx.lifecycle.LifecycleEventObserver> r0 = r8.observers
                r0.clear()
                return
        }

        public final androidx.lifecycle.Lifecycle getLifecycle() {
                r1 = this;
                androidx.lifecycle.Lifecycle r0 = r1.lifecycle
                return r0
        }
    }



    /* JADX INFO: renamed from: $r8$lambda$MitdGS-fS3GXj4JdUxXz0gMQbyE, reason: not valid java name */
    public static /* synthetic */ java.lang.Integer m14$r8$lambda$MitdGSfS3GXj4JdUxXz0gMQbyE() {
            java.lang.Integer r0 = generateRandomNumber$lambda$2()
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$TWvtyPFk-iHdx0R-btWVLevVLT0, reason: not valid java name */
    public static /* synthetic */ void m15$r8$lambda$TWvtyPFkiHdx0RbtWVLevVLT0(androidx.activity.result.ActivityResultRegistry r0, java.lang.String r1, androidx.activity.result.ActivityResultCallback r2, androidx.activity.result.contract.ActivityResultContract r3, androidx.lifecycle.LifecycleOwner r4, androidx.lifecycle.Lifecycle.Event r5) {
            register$lambda$1(r0, r1, r2, r3, r4, r5)
            return
    }

    static {
            androidx.activity.result.ActivityResultRegistry$Companion r0 = new androidx.activity.result.ActivityResultRegistry$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.activity.result.ActivityResultRegistry.Companion = r0
            return
    }

    public ActivityResultRegistry() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1.rcToKey = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1.keyToRc = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1.keyToLifecycleContainers = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1.launchedKeys = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1.keyToCallback = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1.parsedPendingResults = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.pendingResults = r0
            return
    }

    public static final /* synthetic */ java.util.Map access$getKeyToRc$p(androidx.activity.result.ActivityResultRegistry r1) {
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.keyToRc
            return r0
    }

    public static final /* synthetic */ java.util.List access$getLaunchedKeys$p(androidx.activity.result.ActivityResultRegistry r1) {
            java.util.List<java.lang.String> r0 = r1.launchedKeys
            return r0
    }

    private final void bindRcKey(int r3, java.lang.String r4) {
            r2 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.Map<java.lang.Integer, java.lang.String> r1 = r2.rcToKey
            r1.put(r0, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.keyToRc
            r1.put(r4, r0)
            return
    }

    private final <O> void doDispatch(java.lang.String r4, int r5, android.content.Intent r6, androidx.activity.result.ActivityResultRegistry.CallbackAndContract<O> r7) {
            r3 = this;
            if (r7 == 0) goto L7
            androidx.activity.result.ActivityResultCallback r0 = r7.getCallback()
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 == 0) goto L27
            java.util.List<java.lang.String> r0 = r3.launchedKeys
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L27
            androidx.activity.result.ActivityResultCallback r0 = r7.getCallback()
            androidx.activity.result.contract.ActivityResultContract r1 = r7.getContract()
            java.lang.Object r2 = r1.parseResult(r5, r6)
            r0.onActivityResult(r2)
            java.util.List<java.lang.String> r2 = r3.launchedKeys
            r2.remove(r4)
            goto L38
        L27:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.parsedPendingResults
            r0.remove(r4)
            android.os.Bundle r0 = r3.pendingResults
            androidx.activity.result.ActivityResult r1 = new androidx.activity.result.ActivityResult
            r1.<init>(r5, r6)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            r0.putParcelable(r4, r1)
        L38:
            return
    }

    private final int generateRandomNumber() {
            r8 = this;
            androidx.activity.result.ActivityResultRegistry$$ExternalSyntheticLambda1 r0 = new androidx.activity.result.ActivityResultRegistry$$ExternalSyntheticLambda1
            r0.<init>()
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.generateSequence(r0)
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        Lf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L35
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = 0
            java.util.Map<java.lang.Integer, java.lang.String> r6 = r8.rcToKey
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            boolean r6 = r6.containsKey(r7)
            if (r6 != 0) goto Lf
            r0 = r3
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L35:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r3 = "Sequence contains no element matching the predicate."
            r2.<init>(r3)
            throw r2
    }

    private static final java.lang.Integer generateRandomNumber$lambda$2() {
            kotlin.random.Random$Default r0 = kotlin.random.Random.Default
            r1 = 2147418112(0x7fff0000, float:NaN)
            int r0 = r0.nextInt(r1)
            r1 = 65536(0x10000, float:9.1835E-41)
            int r0 = r0 + r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    private static final void register$lambda$1(androidx.activity.result.ActivityResultRegistry r2, java.lang.String r3, androidx.activity.result.ActivityResultCallback r4, androidx.activity.result.contract.ActivityResultContract r5, androidx.lifecycle.LifecycleOwner r6, androidx.lifecycle.Lifecycle.Event r7) {
            java.lang.String r0 = "<unused var>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r6 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r6)
            androidx.lifecycle.Lifecycle$Event r6 = androidx.lifecycle.Lifecycle.Event.ON_START
            if (r6 != r7) goto L52
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$CallbackAndContract<?>> r6 = r2.keyToCallback
            androidx.activity.result.ActivityResultRegistry$CallbackAndContract r0 = new androidx.activity.result.ActivityResultRegistry$CallbackAndContract
            r0.<init>(r4, r5)
            r6.put(r3, r0)
            java.util.Map<java.lang.String, java.lang.Object> r6 = r2.parsedPendingResults
            boolean r6 = r6.containsKey(r3)
            if (r6 == 0) goto L2f
            java.util.Map<java.lang.String, java.lang.Object> r6 = r2.parsedPendingResults
            java.lang.Object r6 = r6.get(r3)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.parsedPendingResults
            r0.remove(r3)
            r4.onActivityResult(r6)
        L2f:
            android.os.Bundle r6 = r2.pendingResults
            java.lang.Class<androidx.activity.result.ActivityResult> r0 = androidx.activity.result.ActivityResult.class
            java.lang.Object r6 = androidx.core.os.BundleCompat.getParcelable(r6, r3, r0)
            androidx.activity.result.ActivityResult r6 = (androidx.activity.result.ActivityResult) r6
            if (r6 == 0) goto L63
            android.os.Bundle r0 = r2.pendingResults
            r0.remove(r3)
            int r0 = r6.getResultCode()
            android.content.Intent r1 = r6.getData()
            java.lang.Object r0 = r5.parseResult(r0, r1)
            r4.onActivityResult(r0)
            goto L63
        L52:
            androidx.lifecycle.Lifecycle$Event r6 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            if (r6 != r7) goto L5c
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$CallbackAndContract<?>> r6 = r2.keyToCallback
            r6.remove(r3)
            goto L63
        L5c:
            androidx.lifecycle.Lifecycle$Event r6 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r6 != r7) goto L63
            r2.unregister$activity_release(r3)
        L63:
            return
    }

    private final void registerKey(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.keyToRc
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lb
            return
        Lb:
            int r1 = r2.generateRandomNumber()
            r2.bindRcKey(r1, r3)
            return
    }

    public final boolean dispatchResult(int r3, int r4, android.content.Intent r5) {
            r2 = this;
            java.util.Map<java.lang.Integer, java.lang.String> r0 = r2.rcToKey
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$CallbackAndContract<?>> r1 = r2.keyToCallback
            java.lang.Object r1 = r1.get(r0)
            androidx.activity.result.ActivityResultRegistry$CallbackAndContract r1 = (androidx.activity.result.ActivityResultRegistry.CallbackAndContract) r1
            r2.doDispatch(r0, r4, r5, r1)
            r1 = 1
            return r1
    }

    public final <O> boolean dispatchResult(int r5, O r6) {
            r4 = this;
            java.util.Map<java.lang.Integer, java.lang.String> r0 = r4.rcToKey
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$CallbackAndContract<?>> r1 = r4.keyToCallback
            java.lang.Object r1 = r1.get(r0)
            androidx.activity.result.ActivityResultRegistry$CallbackAndContract r1 = (androidx.activity.result.ActivityResultRegistry.CallbackAndContract) r1
            if (r1 == 0) goto L1f
            androidx.activity.result.ActivityResultCallback r2 = r1.getCallback()
            goto L20
        L1f:
            r2 = 0
        L20:
            if (r2 != 0) goto L2d
            android.os.Bundle r2 = r4.pendingResults
            r2.remove(r0)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r4.parsedPendingResults
            r2.put(r0, r6)
            goto L42
        L2d:
            androidx.activity.result.ActivityResultCallback r2 = r1.getCallback()
            java.lang.String r3 = "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
            java.util.List<java.lang.String> r3 = r4.launchedKeys
            boolean r3 = r3.remove(r0)
            if (r3 == 0) goto L42
            r2.onActivityResult(r6)
        L42:
            r2 = 1
            return r2
    }

    public abstract <I, O> void onLaunch(int r1, androidx.activity.result.contract.ActivityResultContract<I, O> r2, I r3, androidx.core.app.ActivityOptionsCompat r4);

    public final void onRestoreInstanceState(android.os.Bundle r11) {
            r10 = this;
            if (r11 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"
            java.util.ArrayList r0 = r11.getIntegerArrayList(r0)
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"
            java.util.ArrayList r1 = r11.getStringArrayList(r1)
            if (r1 == 0) goto L83
            if (r0 != 0) goto L14
            goto L83
        L14:
            java.lang.String r2 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"
            java.util.ArrayList r2 = r11.getStringArrayList(r2)
            if (r2 == 0) goto L25
            java.util.List<java.lang.String> r3 = r10.launchedKeys
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            r3.addAll(r4)
        L25:
            java.lang.String r3 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"
            android.os.Bundle r3 = r11.getBundle(r3)
            if (r3 == 0) goto L33
            android.os.Bundle r4 = r10.pendingResults
            r4.putAll(r3)
        L33:
            r4 = 0
            r5 = r1
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
        L3b:
            if (r4 >= r5) goto L82
            java.lang.Object r6 = r1.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            java.util.Map<java.lang.String, java.lang.Integer> r7 = r10.keyToRc
            boolean r7 = r7.containsKey(r6)
            if (r7 == 0) goto L64
            java.util.Map<java.lang.String, java.lang.Integer> r7 = r10.keyToRc
            java.lang.Object r7 = r7.remove(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            android.os.Bundle r8 = r10.pendingResults
            boolean r8 = r8.containsKey(r6)
            if (r8 != 0) goto L64
            java.util.Map<java.lang.Integer, java.lang.String> r8 = r10.rcToKey
            java.util.Map r8 = kotlin.jvm.internal.TypeIntrinsics.asMutableMap(r8)
            r8.remove(r7)
        L64:
            java.lang.Object r7 = r0.get(r4)
            java.lang.String r8 = "get(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.Object r9 = r1.get(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)
            java.lang.String r9 = (java.lang.String) r9
            r10.bindRcKey(r7, r9)
            int r4 = r4 + 1
            goto L3b
        L82:
            return
        L83:
            return
    }

    public final void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "outState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.keyToRc
            java.util.Collection r1 = r1.values()
            r0.<init>(r1)
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"
            r3.putIntegerArrayList(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.keyToRc
            java.util.Set r1 = r1.keySet()
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"
            r3.putStringArrayList(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<java.lang.String> r1 = r2.launchedKeys
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"
            r3.putStringArrayList(r1, r0)
            android.os.Bundle r0 = new android.os.Bundle
            android.os.Bundle r1 = r2.pendingResults
            r0.<init>(r1)
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"
            r3.putBundle(r1, r0)
            return
    }

    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> register(java.lang.String r4, androidx.activity.result.contract.ActivityResultContract<I, O> r5, androidx.activity.result.ActivityResultCallback<O> r6) {
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "contract"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r3.registerKey(r4)
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$CallbackAndContract<?>> r0 = r3.keyToCallback
            androidx.activity.result.ActivityResultRegistry$CallbackAndContract r1 = new androidx.activity.result.ActivityResultRegistry$CallbackAndContract
            r1.<init>(r6, r5)
            r0.put(r4, r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.parsedPendingResults
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L32
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.parsedPendingResults
            java.lang.Object r0 = r0.get(r4)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.parsedPendingResults
            r1.remove(r4)
            r6.onActivityResult(r0)
        L32:
            android.os.Bundle r0 = r3.pendingResults
            java.lang.Class<androidx.activity.result.ActivityResult> r1 = androidx.activity.result.ActivityResult.class
            java.lang.Object r0 = androidx.core.os.BundleCompat.getParcelable(r0, r4, r1)
            androidx.activity.result.ActivityResult r0 = (androidx.activity.result.ActivityResult) r0
            if (r0 == 0) goto L54
            android.os.Bundle r1 = r3.pendingResults
            r1.remove(r4)
            int r1 = r0.getResultCode()
            android.content.Intent r2 = r0.getData()
            java.lang.Object r1 = r5.parseResult(r1, r2)
            r6.onActivityResult(r1)
        L54:
            androidx.activity.result.ActivityResultRegistry$register$3 r1 = new androidx.activity.result.ActivityResultRegistry$register$3
            r1.<init>(r3, r4, r5)
            androidx.activity.result.ActivityResultLauncher r1 = (androidx.activity.result.ActivityResultLauncher) r1
            return r1
    }

    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> register(java.lang.String r5, androidx.lifecycle.LifecycleOwner r6, androidx.activity.result.contract.ActivityResultContract<I, O> r7, androidx.activity.result.ActivityResultCallback<O> r8) {
            r4 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "lifecycleOwner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "contract"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            androidx.lifecycle.Lifecycle r0 = r6.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r1 = r1.isAtLeast(r2)
            if (r1 != 0) goto L4b
            r4.registerKey(r5)
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$LifecycleContainer> r1 = r4.keyToLifecycleContainers
            java.lang.Object r1 = r1.get(r5)
            androidx.activity.result.ActivityResultRegistry$LifecycleContainer r1 = (androidx.activity.result.ActivityResultRegistry.LifecycleContainer) r1
            if (r1 != 0) goto L36
            androidx.activity.result.ActivityResultRegistry$LifecycleContainer r1 = new androidx.activity.result.ActivityResultRegistry$LifecycleContainer
            r1.<init>(r0)
        L36:
            androidx.activity.result.ActivityResultRegistry$$ExternalSyntheticLambda0 r2 = new androidx.activity.result.ActivityResultRegistry$$ExternalSyntheticLambda0
            r2.<init>(r4, r5, r8, r7)
            r1.addObserver(r2)
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$LifecycleContainer> r3 = r4.keyToLifecycleContainers
            r3.put(r5, r1)
            androidx.activity.result.ActivityResultRegistry$register$2 r3 = new androidx.activity.result.ActivityResultRegistry$register$2
            r3.<init>(r4, r5, r7)
            androidx.activity.result.ActivityResultLauncher r3 = (androidx.activity.result.ActivityResultLauncher) r3
            return r3
        L4b:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "LifecycleOwner "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r3 = " is attempting to register while current state is "
            java.lang.StringBuilder r2 = r2.append(r3)
            androidx.lifecycle.Lifecycle$State r3 = r0.getCurrentState()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ". LifecycleOwners must call register before they are STARTED."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public final void unregister$activity_release(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.List<java.lang.String> r0 = r5.launchedKeys
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L1c
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r5.keyToRc
            java.lang.Object r0 = r0.remove(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L1c
            java.util.Map<java.lang.Integer, java.lang.String> r1 = r5.rcToKey
            r1.remove(r0)
        L1c:
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$CallbackAndContract<?>> r0 = r5.keyToCallback
            r0.remove(r6)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.parsedPendingResults
            boolean r0 = r0.containsKey(r6)
            java.lang.String r1 = ": "
            java.lang.String r2 = "Dropping pending result for request "
            java.lang.String r3 = "ActivityResultRegistry"
            if (r0 == 0) goto L56
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r5.parsedPendingResults
            java.lang.Object r4 = r4.get(r6)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.parsedPendingResults
            r0.remove(r6)
        L56:
            android.os.Bundle r0 = r5.pendingResults
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L8a
            android.os.Bundle r0 = r5.pendingResults
            java.lang.Class<androidx.activity.result.ActivityResult> r4 = androidx.activity.result.ActivityResult.class
            java.lang.Object r0 = androidx.core.os.BundleCompat.getParcelable(r0, r6, r4)
            androidx.activity.result.ActivityResult r0 = (androidx.activity.result.ActivityResult) r0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r3, r1)
            android.os.Bundle r1 = r5.pendingResults
            r1.remove(r6)
        L8a:
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$LifecycleContainer> r0 = r5.keyToLifecycleContainers
            java.lang.Object r0 = r0.get(r6)
            androidx.activity.result.ActivityResultRegistry$LifecycleContainer r0 = (androidx.activity.result.ActivityResultRegistry.LifecycleContainer) r0
            if (r0 == 0) goto L9c
            r0.clearObservers()
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$LifecycleContainer> r1 = r5.keyToLifecycleContainers
            r1.remove(r6)
        L9c:
            return
    }
}
