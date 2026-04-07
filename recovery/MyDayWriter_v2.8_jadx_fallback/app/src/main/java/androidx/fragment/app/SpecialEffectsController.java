package androidx.fragment.app;

/* JADX INFO: compiled from: SpecialEffectsController.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000 92\u00020\u0001:\u00049:;<B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0012J#\u0010\u0013\u001a\u00020\u00102\u0011\u0010\u0014\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\u00160\u00152\u0006\u0010\u0017\u001a\u00020\bH&J \u0010\u0018\u001a\u00020\u00102\u0011\u0010\u0014\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\u00160\u0015H\u0010¢\u0006\u0002\b\u0019J\u0006\u0010\u001a\u001a\u00020\u0010J \u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0016\u0010\"\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!J\u000e\u0010#\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!J\u000e\u0010$\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!J\u000e\u0010%\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!J\u0006\u0010&\u001a\u00020\u0010J\u0012\u0010'\u001a\u0004\u0018\u00010\f2\u0006\u0010(\u001a\u00020)H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010\f2\u0006\u0010(\u001a\u00020)H\u0002J\u0006\u0010+\u001a\u00020\u0010J\u0006\u0010,\u001a\u00020\u0010J\u0010\u0010-\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!J\u0016\u0010.\u001a\u00020\b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0016\u00100\u001a\u00020\b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0006\u00101\u001a\u00020\bJ\u0006\u00102\u001a\u00020\u0010J\u000e\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u000205J\u001b\u00106\u001a\u00020\u00102\u0011\u0010\u0014\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\u00160\u0015H\u0002J\b\u00107\u001a\u00020\u0010H\u0002J\u000e\u00108\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Landroidx/fragment/app/SpecialEffectsController;", "", "container", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "getContainer", "()Landroid/view/ViewGroup;", "isContainerPostponed", "", "operationDirectionIsPop", "pendingOperations", "", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "runningNonSeekableTransition", "runningOperations", "applyContainerChangesToOperation", "", "operation", "applyContainerChangesToOperation$fragment_release", "collectEffects", "operations", "", "Lkotlin/jvm/JvmSuppressWildcards;", "isPop", "commitEffects", "commitEffects$fragment_release", "completeBack", "enqueue", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "lifecycleImpact", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "fragmentStateManager", "Landroidx/fragment/app/FragmentStateManager;", "enqueueAdd", "enqueueHide", "enqueueRemove", "enqueueShow", "executePendingOperations", "findPendingOperation", "fragment", "Landroidx/fragment/app/Fragment;", "findRunningOperation", "forceCompleteAllOperations", "forcePostponedExecutePendingOperations", "getAwaitingCompletionLifecycleImpact", "isOperationSeekable", "newPendingOperations", "isOperationTransitioning", "isPendingExecute", "markPostponedState", "processProgress", "backEvent", "Landroidx/activity/BackEventCompat;", "processStart", "updateFinalState", "updateOperationDirection", "Companion", "Effect", "FragmentStateManagerOperation", "Operation", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class SpecialEffectsController {
    public static final androidx.fragment.app.SpecialEffectsController.Companion Companion = null;
    private final android.view.ViewGroup container;
    private boolean isContainerPostponed;
    private boolean operationDirectionIsPop;
    private final java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> pendingOperations;
    private boolean runningNonSeekableTransition;
    private final java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> runningOperations;

    /* JADX INFO: compiled from: SpecialEffectsController.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Companion;", "", "()V", "getOrCreateController", "Landroidx/fragment/app/SpecialEffectsController;", "container", "Landroid/view/ViewGroup;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "factory", "Landroidx/fragment/app/SpecialEffectsControllerFactory;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
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

        @kotlin.jvm.JvmStatic
        public final androidx.fragment.app.SpecialEffectsController getOrCreateController(android.view.ViewGroup r3, androidx.fragment.app.FragmentManager r4) {
                r2 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "fragmentManager"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                androidx.fragment.app.SpecialEffectsControllerFactory r0 = r4.getSpecialEffectsControllerFactory()
                java.lang.String r1 = "fragmentManager.specialEffectsControllerFactory"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                androidx.fragment.app.SpecialEffectsController r1 = r2.getOrCreateController(r3, r0)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final androidx.fragment.app.SpecialEffectsController getOrCreateController(android.view.ViewGroup r4, androidx.fragment.app.SpecialEffectsControllerFactory r5) {
                r3 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "factory"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                int r0 = androidx.fragment.R.id.special_effects_controller_view_tag
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof androidx.fragment.app.SpecialEffectsController
                if (r1 == 0) goto L18
                r1 = r0
                androidx.fragment.app.SpecialEffectsController r1 = (androidx.fragment.app.SpecialEffectsController) r1
                return r1
            L18:
                androidx.fragment.app.SpecialEffectsController r1 = r5.createController(r4)
                java.lang.String r2 = "factory.createController(container)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                int r2 = androidx.fragment.R.id.special_effects_controller_view_tag
                r4.setTag(r2, r1)
                return r1
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Effect;", "", "()V", "isCancelled", "", "isSeekingSupported", "()Z", "isStarted", "cancel", "", "container", "Landroid/view/ViewGroup;", "onCancel", "onCommit", "onProgress", "backEvent", "Landroidx/activity/BackEventCompat;", "onStart", "performStart", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Effect {
        private boolean isCancelled;
        private final boolean isSeekingSupported;
        private boolean isStarted;

        public Effect() {
                r0 = this;
                r0.<init>()
                return
        }

        public final void cancel(android.view.ViewGroup r2) {
                r1 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                boolean r0 = r1.isCancelled
                if (r0 != 0) goto Lc
                r1.onCancel(r2)
            Lc:
                r0 = 1
                r1.isCancelled = r0
                return
        }

        public boolean isSeekingSupported() {
                r1 = this;
                boolean r0 = r1.isSeekingSupported
                return r0
        }

        public void onCancel(android.view.ViewGroup r2) {
                r1 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                return
        }

        public void onCommit(android.view.ViewGroup r2) {
                r1 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                return
        }

        public void onProgress(androidx.activity.BackEventCompat r2, android.view.ViewGroup r3) {
                r1 = this;
                java.lang.String r0 = "backEvent"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                return
        }

        public void onStart(android.view.ViewGroup r2) {
                r1 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                return
        }

        public final void performStart(android.view.ViewGroup r2) {
                r1 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                boolean r0 = r1.isStarted
                if (r0 != 0) goto Lc
                r1.onStart(r2)
            Lc:
                r0 = 1
                r1.isStarted = r0
                return
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\t\u001a\u00020\nH\u0010¢\u0006\u0002\b\u000bJ\b\u0010\f\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "lifecycleImpact", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "fragmentStateManager", "Landroidx/fragment/app/FragmentStateManager;", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/FragmentStateManager;)V", "complete", "", "complete$fragment_release", "onStart", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class FragmentStateManagerOperation extends androidx.fragment.app.SpecialEffectsController.Operation {
        private final androidx.fragment.app.FragmentStateManager fragmentStateManager;

        public FragmentStateManagerOperation(androidx.fragment.app.SpecialEffectsController.Operation.State r3, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r4, androidx.fragment.app.FragmentStateManager r5) {
                r2 = this;
                java.lang.String r0 = "finalState"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                androidx.fragment.app.Fragment r0 = r5.getFragment()
                java.lang.String r1 = "fragmentStateManager.fragment"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                r2.<init>(r3, r4, r0)
                r2.fragmentStateManager = r5
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void complete$fragment_release() {
                r2 = this;
                super.complete$fragment_release()
                androidx.fragment.app.Fragment r0 = r2.getFragment()
                r1 = 0
                r0.mTransitioning = r1
                androidx.fragment.app.FragmentStateManager r0 = r2.fragmentStateManager
                r0.moveToExpectedState()
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void onStart() {
                r8 = this;
                boolean r0 = r8.isStarted()
                if (r0 == 0) goto L7
                return
            L7:
                super.onStart()
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = r8.getLifecycleImpact()
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
                java.lang.String r2 = " for Fragment "
                java.lang.String r3 = "fragmentStateManager.fragment"
                java.lang.String r4 = "FragmentManager"
                r5 = 2
                if (r0 != r1) goto L103
                androidx.fragment.app.FragmentStateManager r0 = r8.fragmentStateManager
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
                android.view.View r1 = r0.mView
                android.view.View r1 = r1.findFocus()
                if (r1 == 0) goto L52
                r0.setFocusedView(r1)
                boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r5)
                if (r3 == 0) goto L52
            L34:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r6 = "requestFocus: Saved focused view "
                java.lang.StringBuilder r3 = r3.append(r6)
                java.lang.StringBuilder r3 = r3.append(r1)
                java.lang.StringBuilder r2 = r3.append(r2)
                java.lang.StringBuilder r2 = r2.append(r0)
                java.lang.String r2 = r2.toString()
                android.util.Log.v(r4, r2)
            L52:
                androidx.fragment.app.Fragment r2 = r8.getFragment()
                android.view.View r2 = r2.requireView()
                java.lang.String r3 = "this.fragment.requireView()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                android.view.ViewParent r3 = r2.getParent()
                r6 = 0
                if (r3 != 0) goto L9b
                boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r5)
                if (r3 == 0) goto L93
            L6d:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r7 = "Adding fragment "
                java.lang.StringBuilder r3 = r3.append(r7)
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r7 = " view "
                java.lang.StringBuilder r3 = r3.append(r7)
                java.lang.StringBuilder r3 = r3.append(r2)
                java.lang.String r7 = " to container in onStart"
                java.lang.StringBuilder r3 = r3.append(r7)
                java.lang.String r3 = r3.toString()
                android.util.Log.v(r4, r3)
            L93:
                androidx.fragment.app.FragmentStateManager r3 = r8.fragmentStateManager
                r3.addViewToContainer()
                r2.setAlpha(r6)
            L9b:
                float r3 = r2.getAlpha()
                int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r3 != 0) goto La5
                r3 = 1
                goto La6
            La5:
                r3 = 0
            La6:
                if (r3 == 0) goto Ld4
                int r3 = r2.getVisibility()
                if (r3 != 0) goto Ld4
                boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r5)
                if (r3 == 0) goto Ld0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r6 = "Making view "
                java.lang.StringBuilder r3 = r3.append(r6)
                java.lang.StringBuilder r3 = r3.append(r2)
                java.lang.String r6 = " INVISIBLE in onStart"
                java.lang.StringBuilder r3 = r3.append(r6)
                java.lang.String r3 = r3.toString()
                android.util.Log.v(r4, r3)
            Ld0:
                r3 = 4
                r2.setVisibility(r3)
            Ld4:
                float r3 = r0.getPostOnViewCreatedAlpha()
                r2.setAlpha(r3)
                boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r5)
                if (r3 == 0) goto L153
            Le2:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "Setting view alpha to "
                java.lang.StringBuilder r3 = r3.append(r5)
                float r5 = r0.getPostOnViewCreatedAlpha()
                java.lang.StringBuilder r3 = r3.append(r5)
                java.lang.String r5 = " in onStart"
                java.lang.StringBuilder r3 = r3.append(r5)
                java.lang.String r3 = r3.toString()
                android.util.Log.v(r4, r3)
                goto L153
            L103:
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = r8.getLifecycleImpact()
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
                if (r0 != r1) goto L153
                androidx.fragment.app.FragmentStateManager r0 = r8.fragmentStateManager
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
                android.view.View r1 = r0.requireView()
                java.lang.String r3 = "fragment.requireView()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r5)
                if (r3 == 0) goto L150
            L124:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "Clearing focus "
                java.lang.StringBuilder r3 = r3.append(r5)
                android.view.View r5 = r1.findFocus()
                java.lang.StringBuilder r3 = r3.append(r5)
                java.lang.String r5 = " on view "
                java.lang.StringBuilder r3 = r3.append(r5)
                java.lang.StringBuilder r3 = r3.append(r1)
                java.lang.StringBuilder r2 = r3.append(r2)
                java.lang.StringBuilder r2 = r2.append(r0)
                java.lang.String r2 = r2.toString()
                android.util.Log.v(r4, r2)
            L150:
                r1.clearFocus()
            L153:
                return
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.kt */
    @kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u000267B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\rJ\u000e\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020\u000bJ\u000e\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020.J\r\u0010/\u001a\u00020(H\u0011¢\u0006\u0002\b0J\u000e\u00101\u001a\u00020(2\u0006\u0010+\u001a\u00020\u000bJ\u0016\u00102\u001a\u00020(2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005J\b\u00103\u001a\u00020(H\u0017J\b\u00104\u001a\u000205H\u0016R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u001e\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR$\u0010 \u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR\u001e\u0010\"\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00068"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation;", "", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "lifecycleImpact", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/Fragment;)V", "_effects", "", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "completionListeners", "Ljava/lang/Runnable;", "effects", "", "getEffects$fragment_release", "()Ljava/util/List;", "getFinalState", "()Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "setFinalState", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "isAwaitingContainerChanges", "", "()Z", "setAwaitingContainerChanges", "(Z)V", "<set-?>", "isCanceled", "isComplete", "isSeeking", "setSeeking$fragment_release", "isStarted", "getLifecycleImpact", "()Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "setLifecycleImpact", "(Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;)V", "addCompletionListener", "", "listener", "addEffect", "effect", "cancel", "container", "Landroid/view/ViewGroup;", "complete", "complete$fragment_release", "completeEffect", "mergeWith", "onStart", "toString", "", "LifecycleImpact", "State", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Operation {
        private final java.util.List<androidx.fragment.app.SpecialEffectsController.Effect> _effects;
        private final java.util.List<java.lang.Runnable> completionListeners;
        private final java.util.List<androidx.fragment.app.SpecialEffectsController.Effect> effects;
        private androidx.fragment.app.SpecialEffectsController.Operation.State finalState;
        private final androidx.fragment.app.Fragment fragment;
        private boolean isAwaitingContainerChanges;
        private boolean isCanceled;
        private boolean isComplete;
        private boolean isSeeking;
        private boolean isStarted;
        private androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact;

        /* JADX INFO: compiled from: SpecialEffectsController.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "", "(Ljava/lang/String;I)V", "NONE", "ADDING", "REMOVING", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum LifecycleImpact extends java.lang.Enum<androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact> {
            private static final /* synthetic */ androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[] $VALUES = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact ADDING = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact NONE = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact REMOVING = null;

            private static final /* synthetic */ androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[] $values() {
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = new androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[]{r0, r1, r2}
                    return r0
            }

            static {
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = new androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact
                    java.lang.String r1 = "NONE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = new androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact
                    java.lang.String r1 = "ADDING"
                    r2 = 1
                    r0.<init>(r1, r2)
                    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = new androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact
                    java.lang.String r1 = "REMOVING"
                    r2 = 2
                    r0.<init>(r1, r2)
                    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = $values()
                    androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.$VALUES = r0
                    return
            }

            LifecycleImpact(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact> r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.class
                    java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = (androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact) r0
                    return r0
            }

            public static androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[] values() {
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.$VALUES
                    java.lang.Object r0 = r0.clone()
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = (androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact[]) r0
                    return r0
            }
        }

        /* JADX INFO: compiled from: SpecialEffectsController.kt */
        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "", "(Ljava/lang/String;I)V", "applyState", "", "view", "Landroid/view/View;", "container", "Landroid/view/ViewGroup;", "REMOVED", "VISIBLE", "GONE", "INVISIBLE", "Companion", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum State extends java.lang.Enum<androidx.fragment.app.SpecialEffectsController.Operation.State> {
            private static final /* synthetic */ androidx.fragment.app.SpecialEffectsController.Operation.State[] $VALUES = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State.Companion Companion = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State GONE = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State INVISIBLE = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State REMOVED = null;
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State VISIBLE = null;

            /* JADX INFO: compiled from: SpecialEffectsController.kt */
            @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\n\u0010\u0007\u001a\u00020\u0004*\u00020\b¨\u0006\t"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;", "", "()V", "from", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "visibility", "", "asOperationState", "Landroid/view/View;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
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

                public final androidx.fragment.app.SpecialEffectsController.Operation.State asOperationState(android.view.View r3) {
                        r2 = this;
                        java.lang.String r0 = "<this>"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                        float r0 = r3.getAlpha()
                        r1 = 0
                        int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                        if (r0 != 0) goto L10
                        r0 = 1
                        goto L11
                    L10:
                        r0 = 0
                    L11:
                        if (r0 == 0) goto L1c
                        int r0 = r3.getVisibility()
                        if (r0 != 0) goto L1c
                        androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE
                        goto L24
                    L1c:
                        int r0 = r3.getVisibility()
                        androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r2.from(r0)
                    L24:
                        return r0
                }

                @kotlin.jvm.JvmStatic
                public final androidx.fragment.app.SpecialEffectsController.Operation.State from(int r4) {
                        r3 = this;
                        switch(r4) {
                            case 0: goto L22;
                            case 4: goto L1f;
                            case 8: goto L1c;
                            default: goto L3;
                        }
                    L3:
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Unknown visibility "
                        java.lang.StringBuilder r1 = r1.append(r2)
                        java.lang.StringBuilder r1 = r1.append(r4)
                        java.lang.String r1 = r1.toString()
                        r0.<init>(r1)
                        throw r0
                    L1c:
                        androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
                        goto L24
                    L1f:
                        androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE
                        goto L24
                    L22:
                        androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                    L24:
                        return r0
                }
            }

            /* JADX INFO: compiled from: SpecialEffectsController.kt */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

                static {
                        androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch: java.lang.NoSuchFieldError -> L11
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                        r2 = 1
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L11
                        goto L12
                    L11:
                        r1 = move-exception
                    L12:
                        androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch: java.lang.NoSuchFieldError -> L1c
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
                        r2 = 2
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
                        goto L1d
                    L1c:
                        r1 = move-exception
                    L1d:
                        androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch: java.lang.NoSuchFieldError -> L27
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L27
                        r2 = 3
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L27
                        goto L28
                    L27:
                        r1 = move-exception
                    L28:
                        androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch: java.lang.NoSuchFieldError -> L32
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L32
                        r2 = 4
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L32
                        goto L33
                    L32:
                        r1 = move-exception
                    L33:
                        androidx.fragment.app.SpecialEffectsController.Operation.State.WhenMappings.$EnumSwitchMapping$0 = r0
                        return
                }
            }

            private static final /* synthetic */ androidx.fragment.app.SpecialEffectsController.Operation.State[] $values() {
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
                    androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                    androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
                    androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE
                    androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = new androidx.fragment.app.SpecialEffectsController.Operation.State[]{r0, r1, r2, r3}
                    return r0
            }

            static {
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = new androidx.fragment.app.SpecialEffectsController$Operation$State
                    java.lang.String r1 = "REMOVED"
                    r2 = 0
                    r0.<init>(r1, r2)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = new androidx.fragment.app.SpecialEffectsController$Operation$State
                    java.lang.String r1 = "VISIBLE"
                    r2 = 1
                    r0.<init>(r1, r2)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = new androidx.fragment.app.SpecialEffectsController$Operation$State
                    java.lang.String r1 = "GONE"
                    r2 = 2
                    r0.<init>(r1, r2)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.GONE = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = new androidx.fragment.app.SpecialEffectsController$Operation$State
                    java.lang.String r1 = "INVISIBLE"
                    r2 = 3
                    r0.<init>(r1, r2)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = $values()
                    androidx.fragment.app.SpecialEffectsController.Operation.State.$VALUES = r0
                    androidx.fragment.app.SpecialEffectsController$Operation$State$Companion r0 = new androidx.fragment.app.SpecialEffectsController$Operation$State$Companion
                    r1 = 0
                    r0.<init>(r1)
                    androidx.fragment.app.SpecialEffectsController.Operation.State.Companion = r0
                    return
            }

            State(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            @kotlin.jvm.JvmStatic
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State from(int r1) {
                    androidx.fragment.app.SpecialEffectsController$Operation$State$Companion r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.Companion
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r0.from(r1)
                    return r0
            }

            public static androidx.fragment.app.SpecialEffectsController.Operation.State valueOf(java.lang.String r1) {
                    java.lang.Class<androidx.fragment.app.SpecialEffectsController$Operation$State> r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.class
                    java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                    androidx.fragment.app.SpecialEffectsController$Operation$State r0 = (androidx.fragment.app.SpecialEffectsController.Operation.State) r0
                    return r0
            }

            public static androidx.fragment.app.SpecialEffectsController.Operation.State[] values() {
                    androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.$VALUES
                    java.lang.Object r0 = r0.clone()
                    androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = (androidx.fragment.app.SpecialEffectsController.Operation.State[]) r0
                    return r0
            }

            public final void applyState(android.view.View r6, android.view.ViewGroup r7) {
                    r5 = this;
                    java.lang.String r0 = "view"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                    java.lang.String r0 = "container"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                    r0 = 2
                    boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                    java.lang.String r2 = "FragmentManager"
                    if (r1 == 0) goto L18
                    java.lang.String r1 = "SpecialEffectsController: Calling apply state"
                    android.util.Log.v(r2, r1)
                L18:
                    int[] r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.WhenMappings.$EnumSwitchMapping$0
                    int r3 = r5.ordinal()
                    r1 = r1[r3]
                    r3 = 0
                    java.lang.String r4 = "SpecialEffectsController: Setting view "
                    switch(r1) {
                        case 1: goto Ld7;
                        case 2: goto L77;
                        case 3: goto L4f;
                        case 4: goto L28;
                        default: goto L26;
                    }
                L26:
                    goto L110
                L28:
                    boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                    if (r0 == 0) goto L49
                L2f:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.StringBuilder r0 = r0.append(r4)
                    java.lang.StringBuilder r0 = r0.append(r6)
                    java.lang.String r1 = " to INVISIBLE"
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r2, r0)
                L49:
                    r0 = 4
                    r6.setVisibility(r0)
                    goto L110
                L4f:
                    boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                    if (r0 == 0) goto L70
                L56:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.StringBuilder r0 = r0.append(r4)
                    java.lang.StringBuilder r0 = r0.append(r6)
                    java.lang.String r1 = " to GONE"
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r2, r0)
                L70:
                    r0 = 8
                    r6.setVisibility(r0)
                    goto L110
                L77:
                    boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                    if (r1 == 0) goto L99
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.StringBuilder r1 = r1.append(r4)
                    java.lang.StringBuilder r1 = r1.append(r6)
                    java.lang.String r4 = " to VISIBLE"
                    java.lang.StringBuilder r1 = r1.append(r4)
                    java.lang.String r1 = r1.toString()
                    android.util.Log.v(r2, r1)
                L99:
                    android.view.ViewParent r1 = r6.getParent()
                    boolean r4 = r1 instanceof android.view.ViewGroup
                    if (r4 == 0) goto La4
                    r3 = r1
                    android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                La4:
                    if (r3 != 0) goto Ld2
                    boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                    if (r0 == 0) goto Lcf
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "SpecialEffectsController: Adding view "
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.StringBuilder r0 = r0.append(r6)
                    java.lang.String r1 = " to Container "
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.StringBuilder r0 = r0.append(r7)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r2, r0)
                Lcf:
                    r7.addView(r6)
                Ld2:
                    r0 = 0
                    r6.setVisibility(r0)
                    goto L110
                Ld7:
                    android.view.ViewParent r1 = r6.getParent()
                    boolean r4 = r1 instanceof android.view.ViewGroup
                    if (r4 == 0) goto Le2
                    r3 = r1
                    android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                Le2:
                    if (r3 == 0) goto L110
                    boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                    if (r0 == 0) goto L10d
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "SpecialEffectsController: Removing view "
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.StringBuilder r0 = r0.append(r6)
                    java.lang.String r1 = " from container "
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.StringBuilder r0 = r0.append(r3)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r2, r0)
                L10d:
                    r3.removeView(r6)
                L110:
                    return
            }
        }

        /* JADX INFO: compiled from: SpecialEffectsController.kt */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING     // Catch: java.lang.NoSuchFieldError -> L11
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                    r2 = 1
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L11
                    goto L12
                L11:
                    r1 = move-exception
                L12:
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING     // Catch: java.lang.NoSuchFieldError -> L1c
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
                    r2 = 2
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
                    goto L1d
                L1c:
                    r1 = move-exception
                L1d:
                    androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE     // Catch: java.lang.NoSuchFieldError -> L27
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L27
                    r2 = 3
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L27
                    goto L28
                L27:
                    r1 = move-exception
                L28:
                    androidx.fragment.app.SpecialEffectsController.Operation.WhenMappings.$EnumSwitchMapping$0 = r0
                    return
            }
        }

        public Operation(androidx.fragment.app.SpecialEffectsController.Operation.State r2, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r3, androidx.fragment.app.Fragment r4) {
                r1 = this;
                java.lang.String r0 = "finalState"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "lifecycleImpact"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "fragment"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r1.<init>()
                r1.finalState = r2
                r1.lifecycleImpact = r3
                r1.fragment = r4
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r0 = (java.util.List) r0
                r1.completionListeners = r0
                r0 = 1
                r1.isAwaitingContainerChanges = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r0 = (java.util.List) r0
                r1._effects = r0
                java.util.List<androidx.fragment.app.SpecialEffectsController$Effect> r0 = r1._effects
                r1.effects = r0
                return
        }

        public final void addCompletionListener(java.lang.Runnable r2) {
                r1 = this;
                java.lang.String r0 = "listener"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.util.List<java.lang.Runnable> r0 = r1.completionListeners
                r0.add(r2)
                return
        }

        public final void addEffect(androidx.fragment.app.SpecialEffectsController.Effect r2) {
                r1 = this;
                java.lang.String r0 = "effect"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.util.List<androidx.fragment.app.SpecialEffectsController$Effect> r0 = r1._effects
                r0.add(r2)
                return
        }

        public final void cancel(android.view.ViewGroup r7) {
                r6 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                r0 = 0
                r6.isStarted = r0
                boolean r0 = r6.isCanceled
                if (r0 == 0) goto Ld
                return
            Ld:
                r0 = 1
                r6.isCanceled = r0
                java.util.List<androidx.fragment.app.SpecialEffectsController$Effect> r0 = r6._effects
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L1c
                r6.complete$fragment_release()
                goto L40
            L1c:
                java.util.List<androidx.fragment.app.SpecialEffectsController$Effect> r0 = r6.effects
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.List r0 = kotlin.collections.CollectionsKt.toList(r0)
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                r1 = 0
                java.util.Iterator r2 = r0.iterator()
            L2b:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L3f
                java.lang.Object r3 = r2.next()
                r4 = r3
                androidx.fragment.app.SpecialEffectsController$Effect r4 = (androidx.fragment.app.SpecialEffectsController.Effect) r4
                r5 = 0
                r4.cancel(r7)
                goto L2b
            L3f:
            L40:
                return
        }

        public void complete$fragment_release() {
                r6 = this;
                r0 = 0
                r6.isStarted = r0
                boolean r0 = r6.isComplete
                if (r0 == 0) goto L8
                return
            L8:
                r0 = 2
                boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                if (r0 == 0) goto L2e
            L10:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "SpecialEffectsController: "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r6)
                java.lang.String r1 = " has called complete."
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "FragmentManager"
                android.util.Log.v(r1, r0)
            L2e:
                r0 = 1
                r6.isComplete = r0
                java.util.List<java.lang.Runnable> r0 = r6.completionListeners
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                r1 = 0
                java.util.Iterator r2 = r0.iterator()
            L3a:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L4e
                java.lang.Object r3 = r2.next()
                r4 = r3
                java.lang.Runnable r4 = (java.lang.Runnable) r4
                r5 = 0
                r4.run()
                goto L3a
            L4e:
                return
        }

        public final void completeEffect(androidx.fragment.app.SpecialEffectsController.Effect r2) {
                r1 = this;
                java.lang.String r0 = "effect"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.util.List<androidx.fragment.app.SpecialEffectsController$Effect> r0 = r1._effects
                boolean r0 = r0.remove(r2)
                if (r0 == 0) goto L18
                java.util.List<androidx.fragment.app.SpecialEffectsController$Effect> r0 = r1._effects
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L18
                r1.complete$fragment_release()
            L18:
                return
        }

        public final java.util.List<androidx.fragment.app.SpecialEffectsController.Effect> getEffects$fragment_release() {
                r1 = this;
                java.util.List<androidx.fragment.app.SpecialEffectsController$Effect> r0 = r1.effects
                return r0
        }

        public final androidx.fragment.app.SpecialEffectsController.Operation.State getFinalState() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r1.finalState
                return r0
        }

        public final androidx.fragment.app.Fragment getFragment() {
                r1 = this;
                androidx.fragment.app.Fragment r0 = r1.fragment
                return r0
        }

        public final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact getLifecycleImpact() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = r1.lifecycleImpact
                return r0
        }

        public final boolean isAwaitingContainerChanges() {
                r1 = this;
                boolean r0 = r1.isAwaitingContainerChanges
                return r0
        }

        public final boolean isCanceled() {
                r1 = this;
                boolean r0 = r1.isCanceled
                return r0
        }

        public final boolean isComplete() {
                r1 = this;
                boolean r0 = r1.isComplete
                return r0
        }

        public final boolean isSeeking() {
                r1 = this;
                boolean r0 = r1.isSeeking
                return r0
        }

        public final boolean isStarted() {
                r1 = this;
                boolean r0 = r1.isStarted
                return r0
        }

        public final void mergeWith(androidx.fragment.app.SpecialEffectsController.Operation.State r7, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r8) {
                r6 = this;
                java.lang.String r0 = "finalState"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.lang.String r0 = "lifecycleImpact"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                int[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.WhenMappings.$EnumSwitchMapping$0
                int r1 = r8.ordinal()
                r0 = r0[r1]
                java.lang.String r1 = " mFinalState = "
                r2 = 1
                java.lang.String r3 = "SpecialEffectsController: For fragment "
                java.lang.String r4 = "FragmentManager"
                r5 = 2
                switch(r0) {
                    case 1: goto La8;
                    case 2: goto L62;
                    case 3: goto L1f;
                    default: goto L1d;
                }
            L1d:
                goto Le8
            L1f:
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r6.finalState
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
                if (r0 == r2) goto Le8
                boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r5)
                if (r0 == 0) goto L5e
            L2c:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.StringBuilder r0 = r0.append(r3)
                androidx.fragment.app.Fragment r2 = r6.fragment
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r6.finalState
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " -> "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r7)
                r1 = 46
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.util.Log.v(r4, r0)
            L5e:
                r6.finalState = r7
                goto Le8
            L62:
                boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r5)
                if (r0 == 0) goto L9d
            L69:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.StringBuilder r0 = r0.append(r3)
                androidx.fragment.app.Fragment r3 = r6.fragment
                java.lang.StringBuilder r0 = r0.append(r3)
                java.lang.StringBuilder r0 = r0.append(r1)
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r6.finalState
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " -> REMOVED. mLifecycleImpact  = "
                java.lang.StringBuilder r0 = r0.append(r1)
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = r6.lifecycleImpact
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " to REMOVING."
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.util.Log.v(r4, r0)
            L9d:
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
                r6.finalState = r0
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
                r6.lifecycleImpact = r0
                r6.isAwaitingContainerChanges = r2
                goto Le8
            La8:
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r6.finalState
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
                if (r0 != r1) goto Le8
                boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r5)
                if (r0 == 0) goto Lde
            Lb5:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.StringBuilder r0 = r0.append(r3)
                androidx.fragment.app.Fragment r1 = r6.fragment
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = "
                java.lang.StringBuilder r0 = r0.append(r1)
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = r6.lifecycleImpact
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " to ADDING."
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                android.util.Log.v(r4, r0)
            Lde:
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                r6.finalState = r0
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
                r6.lifecycleImpact = r0
                r6.isAwaitingContainerChanges = r2
            Le8:
                return
        }

        public void onStart() {
                r1 = this;
                r0 = 1
                r1.isStarted = r0
                return
        }

        public final void setAwaitingContainerChanges(boolean r1) {
                r0 = this;
                r0.isAwaitingContainerChanges = r1
                return
        }

        public final void setFinalState(androidx.fragment.app.SpecialEffectsController.Operation.State r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.finalState = r2
                return
        }

        public final void setLifecycleImpact(androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.lifecycleImpact = r2
                return
        }

        public final void setSeeking$fragment_release(boolean r1) {
                r0 = this;
                r0.isSeeking = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                int r0 = java.lang.System.identityHashCode(r3)
                java.lang.String r0 = java.lang.Integer.toHexString(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Operation {"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r2 = "} {finalState = "
                java.lang.StringBuilder r1 = r1.append(r2)
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = r3.finalState
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " lifecycleImpact = "
                java.lang.StringBuilder r1 = r1.append(r2)
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = r3.lifecycleImpact
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " fragment = "
                java.lang.StringBuilder r1 = r1.append(r2)
                androidx.fragment.app.Fragment r2 = r3.fragment
                java.lang.StringBuilder r1 = r1.append(r2)
                r2 = 125(0x7d, float:1.75E-43)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                return r1
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE     // Catch: java.lang.NoSuchFieldError -> L11
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L11
                goto L12
            L11:
                r1 = move-exception
            L12:
                androidx.fragment.app.SpecialEffectsController.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$TeCmoVW0hctjg0BNHLP6mPbAs5U(androidx.fragment.app.SpecialEffectsController r0, androidx.fragment.app.SpecialEffectsController.FragmentStateManagerOperation r1) {
            enqueue$lambda$4$lambda$2(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$ahdwWRJghvCwX2xG1GsepYfILrY(androidx.fragment.app.SpecialEffectsController r0, androidx.fragment.app.SpecialEffectsController.FragmentStateManagerOperation r1) {
            enqueue$lambda$4$lambda$3(r0, r1)
            return
    }

    static {
            androidx.fragment.app.SpecialEffectsController$Companion r0 = new androidx.fragment.app.SpecialEffectsController$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.fragment.app.SpecialEffectsController.Companion = r0
            return
    }

    public SpecialEffectsController(android.view.ViewGroup r2) {
            r1 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.container = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1.pendingOperations = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1.runningOperations = r0
            return
    }

    private final void enqueue(androidx.fragment.app.SpecialEffectsController.Operation.State r6, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r7, androidx.fragment.app.FragmentStateManager r8) {
            r5 = this;
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r5.pendingOperations
            monitor-enter(r0)
            r1 = 0
            androidx.fragment.app.Fragment r2 = r8.getFragment()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "fragmentStateManager.fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Throwable -> L5e
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r5.findPendingOperation(r2)     // Catch: java.lang.Throwable -> L5e
            if (r2 != 0) goto L34
        L14:
            androidx.fragment.app.Fragment r2 = r8.getFragment()     // Catch: java.lang.Throwable -> L5e
            boolean r2 = r2.mTransitioning     // Catch: java.lang.Throwable -> L5e
            if (r2 != 0) goto L27
            androidx.fragment.app.Fragment r2 = r8.getFragment()     // Catch: java.lang.Throwable -> L5e
            boolean r2 = r2.mRemoving     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto L25
            goto L27
        L25:
            r2 = 0
            goto L34
        L27:
            androidx.fragment.app.Fragment r2 = r8.getFragment()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r3 = "fragmentStateManager.fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Throwable -> L5e
            androidx.fragment.app.SpecialEffectsController$Operation r2 = r5.findRunningOperation(r2)     // Catch: java.lang.Throwable -> L5e
        L34:
            if (r2 == 0) goto L3e
            r2.mergeWith(r6, r7)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r0)
            return
        L3e:
            androidx.fragment.app.SpecialEffectsController$FragmentStateManagerOperation r3 = new androidx.fragment.app.SpecialEffectsController$FragmentStateManagerOperation     // Catch: java.lang.Throwable -> L5e
            r3.<init>(r6, r7, r8)     // Catch: java.lang.Throwable -> L5e
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r4 = r5.pendingOperations     // Catch: java.lang.Throwable -> L5e
            r4.add(r3)     // Catch: java.lang.Throwable -> L5e
            androidx.fragment.app.SpecialEffectsController$$ExternalSyntheticLambda0 r4 = new androidx.fragment.app.SpecialEffectsController$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L5e
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L5e
            r3.addCompletionListener(r4)     // Catch: java.lang.Throwable -> L5e
            androidx.fragment.app.SpecialEffectsController$$ExternalSyntheticLambda1 r4 = new androidx.fragment.app.SpecialEffectsController$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L5e
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L5e
            r3.addCompletionListener(r4)     // Catch: java.lang.Throwable -> L5e
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r0)
            return
        L5e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    private static final void enqueue$lambda$4$lambda$2(androidx.fragment.app.SpecialEffectsController r3, androidx.fragment.app.SpecialEffectsController.FragmentStateManagerOperation r4) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "$operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r3.pendingOperations
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L26
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r4.getFinalState()
            androidx.fragment.app.Fragment r1 = r4.getFragment()
            android.view.View r1 = r1.mView
            java.lang.String r2 = "operation.fragment.mView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            android.view.ViewGroup r2 = r3.container
            r0.applyState(r1, r2)
        L26:
            return
    }

    private static final void enqueue$lambda$4$lambda$3(androidx.fragment.app.SpecialEffectsController r1, androidx.fragment.app.SpecialEffectsController.FragmentStateManagerOperation r2) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "$operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r1.pendingOperations
            r0.remove(r2)
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r1.runningOperations
            r0.remove(r2)
            return
    }

    private final androidx.fragment.app.SpecialEffectsController.Operation findPendingOperation(androidx.fragment.app.Fragment r8) {
            r7 = this;
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r7.pendingOperations
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        L9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()
            r4 = r3
            androidx.fragment.app.SpecialEffectsController$Operation r4 = (androidx.fragment.app.SpecialEffectsController.Operation) r4
            r5 = 0
            androidx.fragment.app.Fragment r6 = r4.getFragment()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r8)
            if (r6 == 0) goto L29
            boolean r6 = r4.isCanceled()
            if (r6 != 0) goto L29
            r6 = 1
            goto L2a
        L29:
            r6 = 0
        L2a:
            if (r6 == 0) goto L9
            goto L2e
        L2d:
            r3 = 0
        L2e:
            androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3
            return r3
    }

    private final androidx.fragment.app.SpecialEffectsController.Operation findRunningOperation(androidx.fragment.app.Fragment r8) {
            r7 = this;
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r7.runningOperations
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        L9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()
            r4 = r3
            androidx.fragment.app.SpecialEffectsController$Operation r4 = (androidx.fragment.app.SpecialEffectsController.Operation) r4
            r5 = 0
            androidx.fragment.app.Fragment r6 = r4.getFragment()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r8)
            if (r6 == 0) goto L29
            boolean r6 = r4.isCanceled()
            if (r6 != 0) goto L29
            r6 = 1
            goto L2a
        L29:
            r6 = 0
        L2a:
            if (r6 == 0) goto L9
            goto L2e
        L2d:
            r3 = 0
        L2e:
            androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3
            return r3
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.fragment.app.SpecialEffectsController getOrCreateController(android.view.ViewGroup r1, androidx.fragment.app.FragmentManager r2) {
            androidx.fragment.app.SpecialEffectsController$Companion r0 = androidx.fragment.app.SpecialEffectsController.Companion
            androidx.fragment.app.SpecialEffectsController r0 = r0.getOrCreateController(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.fragment.app.SpecialEffectsController getOrCreateController(android.view.ViewGroup r1, androidx.fragment.app.SpecialEffectsControllerFactory r2) {
            androidx.fragment.app.SpecialEffectsController$Companion r0 = androidx.fragment.app.SpecialEffectsController.Companion
            androidx.fragment.app.SpecialEffectsController r0 = r0.getOrCreateController(r1, r2)
            return r0
    }

    private final boolean isOperationSeekable(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r16) {
            r15 = this;
            r0 = 0
            r0 = 1
            r1 = r16
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            java.util.Iterator r3 = r1.iterator()
        Lb:
            boolean r4 = r3.hasNext()
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L62
            java.lang.Object r4 = r3.next()
            r7 = r4
            androidx.fragment.app.SpecialEffectsController$Operation r7 = (androidx.fragment.app.SpecialEffectsController.Operation) r7
            r8 = 0
            java.util.List r9 = r7.getEffects$fragment_release()
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L5d
            java.util.List r9 = r7.getEffects$fragment_release()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r10 = 0
            boolean r11 = r9 instanceof java.util.Collection
            if (r11 == 0) goto L3e
            r11 = r9
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L3e
            r9 = r6
            goto L59
        L3e:
            java.util.Iterator r11 = r9.iterator()
        L42:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L58
            java.lang.Object r12 = r11.next()
            r13 = r12
            androidx.fragment.app.SpecialEffectsController$Effect r13 = (androidx.fragment.app.SpecialEffectsController.Effect) r13
            r14 = 0
            boolean r13 = r13.isSeekingSupported()
            if (r13 != 0) goto L42
            r9 = r5
            goto L59
        L58:
            r9 = r6
        L59:
            if (r9 == 0) goto L5d
            r5 = r6
            goto L5e
        L5d:
        L5e:
            r0 = r5
            goto Lb
        L62:
            if (r0 == 0) goto L9c
            r1 = r16
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            r4 = r1
            r7 = 0
            java.util.Iterator r8 = r4.iterator()
        L77:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L8f
            java.lang.Object r9 = r8.next()
            r10 = r9
            androidx.fragment.app.SpecialEffectsController$Operation r10 = (androidx.fragment.app.SpecialEffectsController.Operation) r10
            r11 = 0
            java.util.List r10 = r10.getEffects$fragment_release()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            kotlin.collections.CollectionsKt.addAll(r3, r10)
            goto L77
        L8f:
            java.util.List r3 = (java.util.List) r3
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L9c
            r5 = r6
        L9c:
            return r5
    }

    private final boolean isOperationTransitioning(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r9) {
            r8 = this;
            r0 = 0
            r0 = 1
            r1 = r9
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            java.util.Iterator r3 = r1.iterator()
        La:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L24
            java.lang.Object r4 = r3.next()
            r5 = r4
            androidx.fragment.app.SpecialEffectsController$Operation r5 = (androidx.fragment.app.SpecialEffectsController.Operation) r5
            r6 = 0
            androidx.fragment.app.Fragment r7 = r5.getFragment()
            boolean r7 = r7.mTransitioning
            if (r7 != 0) goto L21
            r0 = 0
        L21:
            goto La
        L24:
            return r0
    }

    private final void processStart(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r10) {
            r9 = this;
            r0 = 0
            int r1 = r10.size()
        L5:
            if (r0 >= r1) goto L13
            java.lang.Object r2 = r10.get(r0)
            androidx.fragment.app.SpecialEffectsController$Operation r2 = (androidx.fragment.app.SpecialEffectsController.Operation) r2
            r2.onStart()
            int r0 = r0 + 1
            goto L5
        L13:
            r0 = r10
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = r0
            r4 = 0
            java.util.Iterator r5 = r3.iterator()
        L24:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L3c
            java.lang.Object r6 = r5.next()
            r7 = r6
            androidx.fragment.app.SpecialEffectsController$Operation r7 = (androidx.fragment.app.SpecialEffectsController.Operation) r7
            r8 = 0
            java.util.List r7 = r7.getEffects$fragment_release()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            kotlin.collections.CollectionsKt.addAll(r2, r7)
            goto L24
        L3c:
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Set r0 = kotlin.collections.CollectionsKt.toSet(r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r0)
            r1 = 0
            int r2 = r0.size()
        L51:
            if (r1 >= r2) goto L61
            java.lang.Object r3 = r0.get(r1)
            androidx.fragment.app.SpecialEffectsController$Effect r3 = (androidx.fragment.app.SpecialEffectsController.Effect) r3
            android.view.ViewGroup r4 = r9.container
            r3.performStart(r4)
            int r1 = r1 + 1
            goto L51
        L61:
            return
    }

    private final void updateFinalState() {
            r6 = this;
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r6.pendingOperations
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = r1.getLifecycleImpact()
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
            if (r2 != r3) goto L6
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            android.view.View r3 = r2.requireView()
            java.lang.String r4 = "fragment.requireView()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            androidx.fragment.app.SpecialEffectsController$Operation$State$Companion r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.Companion
            int r5 = r3.getVisibility()
            androidx.fragment.app.SpecialEffectsController$Operation$State r4 = r4.from(r5)
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r5 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            r1.mergeWith(r4, r5)
            goto L6
        L37:
            return
    }

    public final void applyContainerChangesToOperation$fragment_release(androidx.fragment.app.SpecialEffectsController.Operation r4) {
            r3 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r4.isAwaitingContainerChanges()
            if (r0 == 0) goto L25
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r4.getFinalState()
            androidx.fragment.app.Fragment r1 = r4.getFragment()
            android.view.View r1 = r1.requireView()
            java.lang.String r2 = "operation.fragment.requireView()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            android.view.ViewGroup r2 = r3.container
            r0.applyState(r1, r2)
            r0 = 0
            r4.setAwaitingContainerChanges(r0)
        L25:
            return
    }

    public abstract void collectEffects(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r1, boolean r2);

    public void commitEffects$fragment_release(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r10) {
            r9 = this;
            java.lang.String r0 = "operations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = r10
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = r0
            r4 = 0
            java.util.Iterator r5 = r3.iterator()
        L16:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L2e
            java.lang.Object r6 = r5.next()
            r7 = r6
            androidx.fragment.app.SpecialEffectsController$Operation r7 = (androidx.fragment.app.SpecialEffectsController.Operation) r7
            r8 = 0
            java.util.List r7 = r7.getEffects$fragment_release()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            kotlin.collections.CollectionsKt.addAll(r2, r7)
            goto L16
        L2e:
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Set r0 = kotlin.collections.CollectionsKt.toSet(r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r0)
            r1 = 0
            int r2 = r0.size()
        L43:
            if (r1 >= r2) goto L53
            java.lang.Object r3 = r0.get(r1)
            androidx.fragment.app.SpecialEffectsController$Effect r3 = (androidx.fragment.app.SpecialEffectsController.Effect) r3
            android.view.ViewGroup r4 = r9.container
            r3.onCommit(r4)
            int r1 = r1 + 1
            goto L43
        L53:
            r1 = 0
            int r2 = r10.size()
        L58:
            if (r1 >= r2) goto L66
            java.lang.Object r3 = r10.get(r1)
            androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3
            r9.applyContainerChangesToOperation$fragment_release(r3)
            int r1 = r1 + 1
            goto L58
        L66:
            r1 = r10
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = kotlin.collections.CollectionsKt.toList(r1)
            r2 = 0
            int r3 = r1.size()
        L72:
            if (r2 >= r3) goto L8a
            java.lang.Object r4 = r1.get(r2)
            androidx.fragment.app.SpecialEffectsController$Operation r4 = (androidx.fragment.app.SpecialEffectsController.Operation) r4
            java.util.List r5 = r4.getEffects$fragment_release()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L87
            r4.complete$fragment_release()
        L87:
            int r2 = r2 + 1
            goto L72
        L8a:
            return
    }

    public final void completeBack() {
            r2 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L10
        L9:
            java.lang.String r0 = "FragmentManager"
            java.lang.String r1 = "SpecialEffectsController: Completing Back "
            android.util.Log.d(r0, r1)
        L10:
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r2.runningOperations
            r2.processStart(r0)
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r2.runningOperations
            r2.commitEffects$fragment_release(r0)
            return
    }

    public final void enqueueAdd(androidx.fragment.app.SpecialEffectsController.Operation.State r3, androidx.fragment.app.FragmentStateManager r4) {
            r2 = this;
            java.lang.String r0 = "finalState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "fragmentStateManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L2e
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SpecialEffectsController: Enqueuing add operation for fragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.getFragment()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L2e:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
            r2.enqueue(r3, r0, r4)
            return
    }

    public final void enqueueHide(androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            java.lang.String r0 = "fragmentStateManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L29
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SpecialEffectsController: Enqueuing hide operation for fragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.getFragment()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L29:
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            r2.enqueue(r0, r1, r3)
            return
    }

    public final void enqueueRemove(androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            java.lang.String r0 = "fragmentStateManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L29
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SpecialEffectsController: Enqueuing remove operation for fragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.getFragment()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L29:
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
            r2.enqueue(r0, r1, r3)
            return
    }

    public final void enqueueShow(androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            java.lang.String r0 = "fragmentStateManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L29
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SpecialEffectsController: Enqueuing show operation for fragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.getFragment()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L29:
            androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            r2.enqueue(r0, r1, r3)
            return
    }

    public final void executePendingOperations() {
            r11 = this;
            boolean r0 = r11.isContainerPostponed
            if (r0 == 0) goto L5
            return
        L5:
            android.view.ViewGroup r0 = r11.container
            boolean r0 = r0.isAttachedToWindow()
            r1 = 0
            if (r0 != 0) goto L14
            r11.forceCompleteAllOperations()
            r11.operationDirectionIsPop = r1
            return
        L14:
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r11.pendingOperations
            monitor-enter(r0)
            r2 = 0
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r3 = r11.runningOperations     // Catch: java.lang.Throwable -> L163
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L163
            java.util.List r3 = kotlin.collections.CollectionsKt.toMutableList(r3)     // Catch: java.lang.Throwable -> L163
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r4 = r11.runningOperations     // Catch: java.lang.Throwable -> L163
            r4.clear()     // Catch: java.lang.Throwable -> L163
            java.util.Iterator r4 = r3.iterator()     // Catch: java.lang.Throwable -> L163
        L29:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L163
            r6 = 1
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L163
            androidx.fragment.app.SpecialEffectsController$Operation r5 = (androidx.fragment.app.SpecialEffectsController.Operation) r5     // Catch: java.lang.Throwable -> L163
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r7 = r11.pendingOperations     // Catch: java.lang.Throwable -> L163
            java.util.Collection r7 = (java.util.Collection) r7     // Catch: java.lang.Throwable -> L163
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L163
            if (r7 != 0) goto L4a
            androidx.fragment.app.Fragment r7 = r5.getFragment()     // Catch: java.lang.Throwable -> L163
            boolean r7 = r7.mTransitioning     // Catch: java.lang.Throwable -> L163
            if (r7 == 0) goto L4a
            goto L4b
        L4a:
            r6 = r1
        L4b:
            r5.setSeeking$fragment_release(r6)     // Catch: java.lang.Throwable -> L163
            goto L29
        L4f:
            java.util.Iterator r4 = r3.iterator()     // Catch: java.lang.Throwable -> L163
        L53:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L163
            r7 = 2
            if (r5 == 0) goto Lb8
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L163
            androidx.fragment.app.SpecialEffectsController$Operation r5 = (androidx.fragment.app.SpecialEffectsController.Operation) r5     // Catch: java.lang.Throwable -> L163
            boolean r8 = r11.runningNonSeekableTransition     // Catch: java.lang.Throwable -> L163
            if (r8 == 0) goto L87
            boolean r7 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r7)     // Catch: java.lang.Throwable -> L163
            if (r7 == 0) goto L83
            java.lang.String r7 = "FragmentManager"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L163
            r8.<init>()     // Catch: java.lang.Throwable -> L163
            java.lang.String r9 = "SpecialEffectsController: Completing non-seekable operation "
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L163
            java.lang.StringBuilder r8 = r8.append(r5)     // Catch: java.lang.Throwable -> L163
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L163
            android.util.Log.v(r7, r8)     // Catch: java.lang.Throwable -> L163
        L83:
            r5.complete$fragment_release()     // Catch: java.lang.Throwable -> L163
            goto Laa
        L87:
            boolean r7 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r7)     // Catch: java.lang.Throwable -> L163
            if (r7 == 0) goto La5
            java.lang.String r7 = "FragmentManager"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L163
            r8.<init>()     // Catch: java.lang.Throwable -> L163
            java.lang.String r9 = "SpecialEffectsController: Cancelling operation "
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L163
            java.lang.StringBuilder r8 = r8.append(r5)     // Catch: java.lang.Throwable -> L163
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L163
            android.util.Log.v(r7, r8)     // Catch: java.lang.Throwable -> L163
        La5:
            android.view.ViewGroup r7 = r11.container     // Catch: java.lang.Throwable -> L163
            r5.cancel(r7)     // Catch: java.lang.Throwable -> L163
        Laa:
            r11.runningNonSeekableTransition = r1     // Catch: java.lang.Throwable -> L163
            boolean r7 = r5.isComplete()     // Catch: java.lang.Throwable -> L163
            if (r7 != 0) goto L53
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r7 = r11.runningOperations     // Catch: java.lang.Throwable -> L163
            r7.add(r5)     // Catch: java.lang.Throwable -> L163
            goto L53
        Lb8:
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r4 = r11.pendingOperations     // Catch: java.lang.Throwable -> L163
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L163
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L163
            if (r4 != 0) goto L15e
            r11.updateFinalState()     // Catch: java.lang.Throwable -> L163
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r4 = r11.pendingOperations     // Catch: java.lang.Throwable -> L163
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L163
            java.util.List r4 = kotlin.collections.CollectionsKt.toMutableList(r4)     // Catch: java.lang.Throwable -> L163
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L163
            if (r5 == 0) goto Ld6
        Ld4:
            monitor-exit(r0)
            return
        Ld6:
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r5 = r11.pendingOperations     // Catch: java.lang.Throwable -> L163
            r5.clear()     // Catch: java.lang.Throwable -> L163
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r5 = r11.runningOperations     // Catch: java.lang.Throwable -> L163
            r8 = r4
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L163
            r5.addAll(r8)     // Catch: java.lang.Throwable -> L163
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r7)     // Catch: java.lang.Throwable -> L163
            if (r5 == 0) goto Lf0
            java.lang.String r5 = "FragmentManager"
            java.lang.String r8 = "SpecialEffectsController: Executing pending operations"
            android.util.Log.v(r5, r8)     // Catch: java.lang.Throwable -> L163
        Lf0:
            boolean r5 = r11.operationDirectionIsPop     // Catch: java.lang.Throwable -> L163
            r11.collectEffects(r4, r5)     // Catch: java.lang.Throwable -> L163
            boolean r5 = r11.isOperationSeekable(r4)     // Catch: java.lang.Throwable -> L163
            boolean r8 = r11.isOperationTransitioning(r4)     // Catch: java.lang.Throwable -> L163
            if (r8 == 0) goto L102
            if (r5 != 0) goto L102
            goto L103
        L102:
            r6 = r1
        L103:
            r11.runningNonSeekableTransition = r6     // Catch: java.lang.Throwable -> L163
            boolean r6 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r7)     // Catch: java.lang.Throwable -> L163
            if (r6 == 0) goto L12e
            java.lang.String r6 = "FragmentManager"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L163
            r9.<init>()     // Catch: java.lang.Throwable -> L163
            java.lang.String r10 = "SpecialEffectsController: Operation seekable = "
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.Throwable -> L163
            java.lang.StringBuilder r9 = r9.append(r5)     // Catch: java.lang.Throwable -> L163
            java.lang.String r10 = " \ntransition = "
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.Throwable -> L163
            java.lang.StringBuilder r9 = r9.append(r8)     // Catch: java.lang.Throwable -> L163
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L163
            android.util.Log.v(r6, r9)     // Catch: java.lang.Throwable -> L163
        L12e:
            if (r8 != 0) goto L137
            r11.processStart(r4)     // Catch: java.lang.Throwable -> L163
            r11.commitEffects$fragment_release(r4)     // Catch: java.lang.Throwable -> L163
            goto L14f
        L137:
            if (r5 == 0) goto L14f
            r11.processStart(r4)     // Catch: java.lang.Throwable -> L163
            r6 = 0
            int r9 = r4.size()     // Catch: java.lang.Throwable -> L163
        L141:
            if (r6 >= r9) goto L14f
            java.lang.Object r10 = r4.get(r6)     // Catch: java.lang.Throwable -> L163
            androidx.fragment.app.SpecialEffectsController$Operation r10 = (androidx.fragment.app.SpecialEffectsController.Operation) r10     // Catch: java.lang.Throwable -> L163
            r11.applyContainerChangesToOperation$fragment_release(r10)     // Catch: java.lang.Throwable -> L163
            int r6 = r6 + 1
            goto L141
        L14f:
            r11.operationDirectionIsPop = r1     // Catch: java.lang.Throwable -> L163
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r7)     // Catch: java.lang.Throwable -> L163
            if (r1 == 0) goto L15e
            java.lang.String r1 = "FragmentManager"
            java.lang.String r6 = "SpecialEffectsController: Finished executing pending operations"
            android.util.Log.v(r1, r6)     // Catch: java.lang.Throwable -> L163
        L15e:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L163
            monitor-exit(r0)
            return
        L163:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void forceCompleteAllOperations() {
            r12 = this;
            r0 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r1 == 0) goto Le
            java.lang.String r1 = "FragmentManager"
            java.lang.String r2 = "SpecialEffectsController: Forcing all operations to complete"
            android.util.Log.v(r1, r2)
        Le:
            android.view.ViewGroup r1 = r12.container
            boolean r1 = r1.isAttachedToWindow()
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r2 = r12.pendingOperations
            monitor-enter(r2)
            r3 = 0
            r12.updateFinalState()     // Catch: java.lang.Throwable -> L11e
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r4 = r12.pendingOperations     // Catch: java.lang.Throwable -> L11e
            r12.processStart(r4)     // Catch: java.lang.Throwable -> L11e
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r4 = r12.runningOperations     // Catch: java.lang.Throwable -> L11e
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L11e
            java.util.List r4 = kotlin.collections.CollectionsKt.toMutableList(r4)     // Catch: java.lang.Throwable -> L11e
            java.util.Iterator r5 = r4.iterator()     // Catch: java.lang.Throwable -> L11e
        L2c:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L11e
            r7 = 0
            if (r6 == 0) goto L3d
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L11e
            androidx.fragment.app.SpecialEffectsController$Operation r6 = (androidx.fragment.app.SpecialEffectsController.Operation) r6     // Catch: java.lang.Throwable -> L11e
            r6.setSeeking$fragment_release(r7)     // Catch: java.lang.Throwable -> L11e
            goto L2c
        L3d:
            java.util.Iterator r5 = r4.iterator()     // Catch: java.lang.Throwable -> L11e
        L41:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L11e
            if (r6 == 0) goto L9d
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L11e
            androidx.fragment.app.SpecialEffectsController$Operation r6 = (androidx.fragment.app.SpecialEffectsController.Operation) r6     // Catch: java.lang.Throwable -> L11e
            boolean r8 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)     // Catch: java.lang.Throwable -> L11e
            if (r8 == 0) goto L97
            if (r1 == 0) goto L58
            java.lang.String r8 = ""
            goto L73
        L58:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11e
            r8.<init>()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r9 = "Container "
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L11e
            android.view.ViewGroup r9 = r12.container     // Catch: java.lang.Throwable -> L11e
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r9 = " is not attached to window. "
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L11e
        L73:
            java.lang.String r9 = "FragmentManager"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11e
            r10.<init>()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r11 = "SpecialEffectsController: "
            java.lang.StringBuilder r10 = r10.append(r11)     // Catch: java.lang.Throwable -> L11e
            java.lang.StringBuilder r10 = r10.append(r8)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r11 = "Cancelling running operation "
            java.lang.StringBuilder r10 = r10.append(r11)     // Catch: java.lang.Throwable -> L11e
            java.lang.StringBuilder r10 = r10.append(r6)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L11e
            android.util.Log.v(r9, r10)     // Catch: java.lang.Throwable -> L11e
        L97:
            android.view.ViewGroup r8 = r12.container     // Catch: java.lang.Throwable -> L11e
            r6.cancel(r8)     // Catch: java.lang.Throwable -> L11e
            goto L41
        L9d:
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r5 = r12.pendingOperations     // Catch: java.lang.Throwable -> L11e
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L11e
            java.util.List r5 = kotlin.collections.CollectionsKt.toMutableList(r5)     // Catch: java.lang.Throwable -> L11e
            java.util.Iterator r6 = r5.iterator()     // Catch: java.lang.Throwable -> L11e
        La9:
            boolean r8 = r6.hasNext()     // Catch: java.lang.Throwable -> L11e
            if (r8 == 0) goto Lb9
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L11e
            androidx.fragment.app.SpecialEffectsController$Operation r8 = (androidx.fragment.app.SpecialEffectsController.Operation) r8     // Catch: java.lang.Throwable -> L11e
            r8.setSeeking$fragment_release(r7)     // Catch: java.lang.Throwable -> L11e
            goto La9
        Lb9:
            java.util.Iterator r6 = r5.iterator()     // Catch: java.lang.Throwable -> L11e
        Lbd:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L11e
            if (r7 == 0) goto L119
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L11e
            androidx.fragment.app.SpecialEffectsController$Operation r7 = (androidx.fragment.app.SpecialEffectsController.Operation) r7     // Catch: java.lang.Throwable -> L11e
            boolean r8 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)     // Catch: java.lang.Throwable -> L11e
            if (r8 == 0) goto L113
            if (r1 == 0) goto Ld4
            java.lang.String r8 = ""
            goto Lef
        Ld4:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11e
            r8.<init>()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r9 = "Container "
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L11e
            android.view.ViewGroup r9 = r12.container     // Catch: java.lang.Throwable -> L11e
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r9 = " is not attached to window. "
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L11e
        Lef:
            java.lang.String r9 = "FragmentManager"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11e
            r10.<init>()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r11 = "SpecialEffectsController: "
            java.lang.StringBuilder r10 = r10.append(r11)     // Catch: java.lang.Throwable -> L11e
            java.lang.StringBuilder r10 = r10.append(r8)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r11 = "Cancelling pending operation "
            java.lang.StringBuilder r10 = r10.append(r11)     // Catch: java.lang.Throwable -> L11e
            java.lang.StringBuilder r10 = r10.append(r7)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L11e
            android.util.Log.v(r9, r10)     // Catch: java.lang.Throwable -> L11e
        L113:
            android.view.ViewGroup r8 = r12.container     // Catch: java.lang.Throwable -> L11e
            r7.cancel(r8)     // Catch: java.lang.Throwable -> L11e
            goto Lbd
        L119:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L11e
            monitor-exit(r2)
            return
        L11e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final void forcePostponedExecutePendingOperations() {
            r2 = this;
            boolean r0 = r2.isContainerPostponed
            if (r0 == 0) goto L1a
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L14
        Ld:
            java.lang.String r0 = "FragmentManager"
            java.lang.String r1 = "SpecialEffectsController: Forcing postponed operations"
            android.util.Log.v(r0, r1)
        L14:
            r0 = 0
            r2.isContainerPostponed = r0
            r2.executePendingOperations()
        L1a:
            return
    }

    public final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact getAwaitingCompletionLifecycleImpact(androidx.fragment.app.FragmentStateManager r6) {
            r5 = this;
            java.lang.String r0 = "fragmentStateManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.fragment.app.Fragment r0 = r6.getFragment()
            java.lang.String r1 = "fragmentStateManager.fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            androidx.fragment.app.SpecialEffectsController$Operation r1 = r5.findPendingOperation(r0)
            r2 = 0
            if (r1 == 0) goto L1a
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = r1.getLifecycleImpact()
            goto L1b
        L1a:
            r1 = r2
        L1b:
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r5.findRunningOperation(r0)
            if (r3 == 0) goto L25
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = r3.getLifecycleImpact()
        L25:
            if (r1 != 0) goto L29
            r3 = -1
            goto L31
        L29:
            int[] r3 = androidx.fragment.app.SpecialEffectsController.WhenMappings.$EnumSwitchMapping$0
            int r4 = r1.ordinal()
            r3 = r3[r4]
        L31:
            switch(r3) {
                case -1: goto L37;
                case 0: goto L34;
                case 1: goto L36;
                default: goto L34;
            }
        L34:
            r3 = r1
            goto L39
        L36:
            goto L38
        L37:
        L38:
            r3 = r2
        L39:
            return r3
    }

    public final android.view.ViewGroup getContainer() {
            r1 = this;
            android.view.ViewGroup r0 = r1.container
            return r0
    }

    public final boolean isPendingExecute() {
            r1 = this;
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r1.pendingOperations
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    public final void markPostponedState() {
            r13 = this;
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r13.pendingOperations
            monitor-enter(r0)
            r1 = 0
            r13.updateFinalState()     // Catch: java.lang.Throwable -> L5f
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r2 = r13.pendingOperations     // Catch: java.lang.Throwable -> L5f
            r3 = 0
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L5f
            java.util.ListIterator r4 = r2.listIterator(r4)     // Catch: java.lang.Throwable -> L5f
        L13:
            boolean r5 = r4.hasPrevious()     // Catch: java.lang.Throwable -> L5f
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L47
            java.lang.Object r5 = r4.previous()     // Catch: java.lang.Throwable -> L5f
            r8 = r5
            androidx.fragment.app.SpecialEffectsController$Operation r8 = (androidx.fragment.app.SpecialEffectsController.Operation) r8     // Catch: java.lang.Throwable -> L5f
            r9 = 0
            androidx.fragment.app.SpecialEffectsController$Operation$State$Companion r10 = androidx.fragment.app.SpecialEffectsController.Operation.State.Companion     // Catch: java.lang.Throwable -> L5f
            androidx.fragment.app.Fragment r11 = r8.getFragment()     // Catch: java.lang.Throwable -> L5f
            android.view.View r11 = r11.mView     // Catch: java.lang.Throwable -> L5f
            java.lang.String r12 = "operation.fragment.mView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)     // Catch: java.lang.Throwable -> L5f
            androidx.fragment.app.SpecialEffectsController$Operation$State r10 = r10.asOperationState(r11)     // Catch: java.lang.Throwable -> L5f
            androidx.fragment.app.SpecialEffectsController$Operation$State r11 = r8.getFinalState()     // Catch: java.lang.Throwable -> L5f
            androidx.fragment.app.SpecialEffectsController$Operation$State r12 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch: java.lang.Throwable -> L5f
            if (r11 != r12) goto L42
            androidx.fragment.app.SpecialEffectsController$Operation$State r11 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch: java.lang.Throwable -> L5f
            if (r10 == r11) goto L42
            r11 = 1
            goto L43
        L42:
            r11 = r6
        L43:
            if (r11 == 0) goto L13
            goto L48
        L47:
            r5 = r7
        L48:
            androidx.fragment.app.SpecialEffectsController$Operation r5 = (androidx.fragment.app.SpecialEffectsController.Operation) r5     // Catch: java.lang.Throwable -> L5f
            if (r5 == 0) goto L51
        L4d:
            androidx.fragment.app.Fragment r7 = r5.getFragment()     // Catch: java.lang.Throwable -> L5f
        L51:
            if (r7 == 0) goto L58
            boolean r6 = r7.isPostponed()     // Catch: java.lang.Throwable -> L5f
        L58:
            r13.isContainerPostponed = r6     // Catch: java.lang.Throwable -> L5f
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r0)
            return
        L5f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void processProgress(androidx.activity.BackEventCompat r10) {
            r9 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L29
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SpecialEffectsController: Processing Progress "
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r10.getProgress()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L29:
            java.util.List<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r9.runningOperations
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = r0
            r4 = 0
            java.util.Iterator r5 = r3.iterator()
        L3b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L53
            java.lang.Object r6 = r5.next()
            r7 = r6
            androidx.fragment.app.SpecialEffectsController$Operation r7 = (androidx.fragment.app.SpecialEffectsController.Operation) r7
            r8 = 0
            java.util.List r7 = r7.getEffects$fragment_release()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            kotlin.collections.CollectionsKt.addAll(r2, r7)
            goto L3b
        L53:
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Set r0 = kotlin.collections.CollectionsKt.toSet(r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r0)
            r1 = 0
            int r2 = r0.size()
        L68:
            if (r1 >= r2) goto L78
            java.lang.Object r3 = r0.get(r1)
            androidx.fragment.app.SpecialEffectsController$Effect r3 = (androidx.fragment.app.SpecialEffectsController.Effect) r3
            android.view.ViewGroup r4 = r9.container
            r3.onProgress(r10, r4)
            int r1 = r1 + 1
            goto L68
        L78:
            return
    }

    public final void updateOperationDirection(boolean r1) {
            r0 = this;
            r0.operationDirectionIsPop = r1
            return
    }
}
