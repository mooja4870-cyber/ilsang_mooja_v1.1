package androidx.lifecycle;

/* JADX INFO: compiled from: LifecycleRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 42\u00020\u0001:\u000245B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001cH\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u001cH\u0002J\u0010\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H\u0003J\u0010\u0010)\u001a\u00020\"2\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J\u0010\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\u000bH\u0017J\u0010\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u000bH\u0002J\b\u00100\u001a\u00020\"H\u0002J\u0010\u00101\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u00102\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001cH\u0016J\b\u00103\u001a\u00020\"H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u001fj\b\u0012\u0004\u0012\u00020\u000b` X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/lifecycle/Lifecycle;", "provider", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;)V", "enforceMainThread", "", "(Landroidx/lifecycle/LifecycleOwner;Z)V", "addingObserverCounter", "", "state", "Landroidx/lifecycle/Lifecycle$State;", "currentState", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "setCurrentState", "(Landroidx/lifecycle/Lifecycle$State;)V", "handlingEvent", "isSynced", "()Z", "lifecycleOwner", "Ljava/lang/ref/WeakReference;", "newEventOccurred", "observerCount", "getObserverCount", "()I", "observerMap", "Landroidx/arch/core/internal/FastSafeIterableMap;", "Landroidx/lifecycle/LifecycleObserver;", "Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "parentStates", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "addObserver", "", "observer", "backwardPass", "calculateTargetState", "enforceMainThreadIfNeeded", "methodName", "", "forwardPass", "handleLifecycleEvent", "event", "Landroidx/lifecycle/Lifecycle$Event;", "markState", "moveToState", "next", "popParentState", "pushParentState", "removeObserver", "sync", "Companion", "ObserverWithState", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class LifecycleRegistry extends androidx.lifecycle.Lifecycle {
    public static final androidx.lifecycle.LifecycleRegistry.Companion Companion = null;
    private int addingObserverCounter;
    private final boolean enforceMainThread;
    private boolean handlingEvent;
    private final java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> lifecycleOwner;
    private boolean newEventOccurred;
    private androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState> observerMap;
    private java.util.ArrayList<androidx.lifecycle.Lifecycle.State> parentStates;
    private androidx.lifecycle.Lifecycle.State state;

    /* JADX INFO: compiled from: LifecycleRegistry.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$Companion;", "", "()V", "createUnsafe", "Landroidx/lifecycle/LifecycleRegistry;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "min", "Landroidx/lifecycle/Lifecycle$State;", "state1", "state2", "min$lifecycle_runtime_release", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
        public final androidx.lifecycle.LifecycleRegistry createUnsafe(androidx.lifecycle.LifecycleOwner r4) {
                r3 = this;
                java.lang.String r0 = "owner"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
                r1 = 0
                r2 = 0
                r0.<init>(r4, r1, r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final androidx.lifecycle.Lifecycle.State min$lifecycle_runtime_release(androidx.lifecycle.Lifecycle.State r2, androidx.lifecycle.Lifecycle.State r3) {
                r1 = this;
                java.lang.String r0 = "state1"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                if (r3 == 0) goto L12
                r0 = r2
                java.lang.Enum r0 = (java.lang.Enum) r0
                int r0 = r3.compareTo(r0)
                if (r0 >= 0) goto L12
                r0 = r3
                goto L13
            L12:
                r0 = r2
            L13:
                return r0
        }
    }

    /* JADX INFO: compiled from: LifecycleRegistry.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "", "observer", "Landroidx/lifecycle/LifecycleObserver;", "initialState", "Landroidx/lifecycle/Lifecycle$State;", "(Landroidx/lifecycle/LifecycleObserver;Landroidx/lifecycle/Lifecycle$State;)V", "lifecycleObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "getLifecycleObserver", "()Landroidx/lifecycle/LifecycleEventObserver;", "setLifecycleObserver", "(Landroidx/lifecycle/LifecycleEventObserver;)V", "state", "getState", "()Landroidx/lifecycle/Lifecycle$State;", "setState", "(Landroidx/lifecycle/Lifecycle$State;)V", "dispatchEvent", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ObserverWithState {
        private androidx.lifecycle.LifecycleEventObserver lifecycleObserver;
        private androidx.lifecycle.Lifecycle.State state;

        public ObserverWithState(androidx.lifecycle.LifecycleObserver r2, androidx.lifecycle.Lifecycle.State r3) {
                r1 = this;
                java.lang.String r0 = "initialState"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.<init>()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                androidx.lifecycle.LifecycleEventObserver r0 = androidx.lifecycle.Lifecycling.lifecycleEventObserver(r2)
                r1.lifecycleObserver = r0
                r1.state = r3
                return
        }

        public final void dispatchEvent(androidx.lifecycle.LifecycleOwner r4, androidx.lifecycle.Lifecycle.Event r5) {
                r3 = this;
                java.lang.String r0 = "event"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                androidx.lifecycle.Lifecycle$State r0 = r5.getTargetState()
                androidx.lifecycle.LifecycleRegistry$Companion r1 = androidx.lifecycle.LifecycleRegistry.Companion
                androidx.lifecycle.Lifecycle$State r2 = r3.state
                androidx.lifecycle.Lifecycle$State r1 = r1.min$lifecycle_runtime_release(r2, r0)
                r3.state = r1
                androidx.lifecycle.LifecycleEventObserver r1 = r3.lifecycleObserver
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
                r1.onStateChanged(r4, r5)
                r3.state = r0
                return
        }

        public final androidx.lifecycle.LifecycleEventObserver getLifecycleObserver() {
                r1 = this;
                androidx.lifecycle.LifecycleEventObserver r0 = r1.lifecycleObserver
                return r0
        }

        public final androidx.lifecycle.Lifecycle.State getState() {
                r1 = this;
                androidx.lifecycle.Lifecycle$State r0 = r1.state
                return r0
        }

        public final void setLifecycleObserver(androidx.lifecycle.LifecycleEventObserver r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.lifecycleObserver = r2
                return
        }

        public final void setState(androidx.lifecycle.Lifecycle.State r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.state = r2
                return
        }
    }

    static {
            androidx.lifecycle.LifecycleRegistry$Companion r0 = new androidx.lifecycle.LifecycleRegistry$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.LifecycleRegistry.Companion = r0
            return
    }

    public LifecycleRegistry(androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            java.lang.String r0 = "provider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    private LifecycleRegistry(androidx.lifecycle.LifecycleOwner r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r1.enforceMainThread = r3
            androidx.arch.core.internal.FastSafeIterableMap r0 = new androidx.arch.core.internal.FastSafeIterableMap
            r0.<init>()
            r1.observerMap = r0
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            r1.state = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.parentStates = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.lifecycleOwner = r0
            return
    }

    public /* synthetic */ LifecycleRegistry(androidx.lifecycle.LifecycleOwner r1, boolean r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private final void backwardPass(androidx.lifecycle.LifecycleOwner r7) {
            r6 = this;
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r6.observerMap
            java.util.Iterator r0 = r0.descendingIterator()
            java.lang.String r1 = "observerMap.descendingIterator()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7d
            boolean r1 = r6.newEventOccurred
            if (r1 != 0) goto L7d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r2 = "next()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.Object r2 = r1.getKey()
            androidx.lifecycle.LifecycleObserver r2 = (androidx.lifecycle.LifecycleObserver) r2
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r1 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r1
        L2c:
            androidx.lifecycle.Lifecycle$State r3 = r1.getState()
            androidx.lifecycle.Lifecycle$State r4 = r6.state
            java.lang.Enum r4 = (java.lang.Enum) r4
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto Lb
            boolean r3 = r6.newEventOccurred
            if (r3 != 0) goto Lb
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r3 = r6.observerMap
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto Lb
            androidx.lifecycle.Lifecycle$Event$Companion r3 = androidx.lifecycle.Lifecycle.Event.Companion
            androidx.lifecycle.Lifecycle$State r4 = r1.getState()
            androidx.lifecycle.Lifecycle$Event r3 = r3.downFrom(r4)
            if (r3 == 0) goto L60
            androidx.lifecycle.Lifecycle$State r4 = r3.getTargetState()
            r6.pushParentState(r4)
            r1.dispatchEvent(r7, r3)
            r6.popParentState()
            goto L2c
        L60:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "no event down from "
            java.lang.StringBuilder r4 = r4.append(r5)
            androidx.lifecycle.Lifecycle$State r5 = r1.getState()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L7d:
            return
    }

    private final androidx.lifecycle.Lifecycle.State calculateTargetState(androidx.lifecycle.LifecycleObserver r7) {
            r6 = this;
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r6.observerMap
            java.util.Map$Entry r0 = r0.ceil(r7)
            r1 = 0
            if (r0 == 0) goto L16
            java.lang.Object r2 = r0.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r2 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r2
            if (r2 == 0) goto L16
            androidx.lifecycle.Lifecycle$State r2 = r2.getState()
            goto L17
        L16:
            r2 = r1
        L17:
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r3 = r6.parentStates
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L31
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r1 = r6.parentStates
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r3 = r6.parentStates
            int r3 = r3.size()
            int r3 = r3 + (-1)
            java.lang.Object r1 = r1.get(r3)
            androidx.lifecycle.Lifecycle$State r1 = (androidx.lifecycle.Lifecycle.State) r1
        L31:
            androidx.lifecycle.LifecycleRegistry$Companion r3 = androidx.lifecycle.LifecycleRegistry.Companion
            androidx.lifecycle.LifecycleRegistry$Companion r4 = androidx.lifecycle.LifecycleRegistry.Companion
            androidx.lifecycle.Lifecycle$State r5 = r6.state
            androidx.lifecycle.Lifecycle$State r4 = r4.min$lifecycle_runtime_release(r5, r2)
            androidx.lifecycle.Lifecycle$State r3 = r3.min$lifecycle_runtime_release(r4, r1)
            return r3
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.lifecycle.LifecycleRegistry createUnsafe(androidx.lifecycle.LifecycleOwner r1) {
            androidx.lifecycle.LifecycleRegistry$Companion r0 = androidx.lifecycle.LifecycleRegistry.Companion
            androidx.lifecycle.LifecycleRegistry r0 = r0.createUnsafe(r1)
            return r0
    }

    private final void enforceMainThreadIfNeeded(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.enforceMainThread
            if (r0 == 0) goto L33
            androidx.arch.core.executor.ArchTaskExecutor r0 = androidx.arch.core.executor.ArchTaskExecutor.getInstance()
            boolean r0 = r0.isMainThread()
            if (r0 == 0) goto Lf
            goto L33
        Lf:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Method "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " must be called on the main thread"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L33:
            return
    }

    private final void forwardPass(androidx.lifecycle.LifecycleOwner r7) {
            r6 = this;
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r6.observerMap
            androidx.arch.core.internal.SafeIterableMap$IteratorWithAdditions r0 = r0.iteratorWithAdditions()
            java.lang.String r1 = "observerMap.iteratorWithAdditions()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.Iterator r0 = (java.util.Iterator) r0
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7b
            boolean r1 = r6.newEventOccurred
            if (r1 != 0) goto L7b
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            androidx.lifecycle.LifecycleObserver r2 = (androidx.lifecycle.LifecycleObserver) r2
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r1 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r1
        L2a:
            androidx.lifecycle.Lifecycle$State r3 = r1.getState()
            androidx.lifecycle.Lifecycle$State r4 = r6.state
            java.lang.Enum r4 = (java.lang.Enum) r4
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto Le
            boolean r3 = r6.newEventOccurred
            if (r3 != 0) goto Le
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r3 = r6.observerMap
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto Le
            androidx.lifecycle.Lifecycle$State r3 = r1.getState()
            r6.pushParentState(r3)
            androidx.lifecycle.Lifecycle$Event$Companion r3 = androidx.lifecycle.Lifecycle.Event.Companion
            androidx.lifecycle.Lifecycle$State r4 = r1.getState()
            androidx.lifecycle.Lifecycle$Event r3 = r3.upFrom(r4)
            if (r3 == 0) goto L5e
            r1.dispatchEvent(r7, r3)
            r6.popParentState()
            goto L2a
        L5e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "no event up from "
            java.lang.StringBuilder r4 = r4.append(r5)
            androidx.lifecycle.Lifecycle$State r5 = r1.getState()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L7b:
            return
    }

    private final boolean isSynced() {
            r4 = this;
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r4.observerMap
            int r0 = r0.size()
            r1 = 1
            if (r0 != 0) goto La
            return r1
        La:
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r4.observerMap
            java.util.Map$Entry r0 = r0.eldest()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r0 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r0
            androidx.lifecycle.Lifecycle$State r0 = r0.getState()
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r2 = r4.observerMap
            java.util.Map$Entry r2 = r2.newest()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Object r2 = r2.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r2 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r2
            androidx.lifecycle.Lifecycle$State r2 = r2.getState()
            if (r0 != r2) goto L37
            androidx.lifecycle.Lifecycle$State r3 = r4.state
            if (r3 != r2) goto L37
            goto L38
        L37:
            r1 = 0
        L38:
            return r1
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.lifecycle.Lifecycle.State min$lifecycle_runtime_release(androidx.lifecycle.Lifecycle.State r1, androidx.lifecycle.Lifecycle.State r2) {
            androidx.lifecycle.LifecycleRegistry$Companion r0 = androidx.lifecycle.LifecycleRegistry.Companion
            androidx.lifecycle.Lifecycle$State r0 = r0.min$lifecycle_runtime_release(r1, r2)
            return r0
    }

    private final void moveToState(androidx.lifecycle.Lifecycle.State r5) {
            r4 = this;
            androidx.lifecycle.Lifecycle$State r0 = r4.state
            if (r0 != r5) goto L5
            return
        L5:
            androidx.lifecycle.Lifecycle$State r0 = r4.state
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L14
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r5 == r0) goto L12
            goto L14
        L12:
            r0 = r2
            goto L15
        L14:
            r0 = r3
        L15:
            if (r0 == 0) goto L3a
            r4.state = r5
            boolean r0 = r4.handlingEvent
            if (r0 != 0) goto L37
            int r0 = r4.addingObserverCounter
            if (r0 == 0) goto L22
            goto L37
        L22:
            r4.handlingEvent = r3
            r4.sync()
            r4.handlingEvent = r2
            androidx.lifecycle.Lifecycle$State r0 = r4.state
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r1) goto L36
            androidx.arch.core.internal.FastSafeIterableMap r0 = new androidx.arch.core.internal.FastSafeIterableMap
            r0.<init>()
            r4.observerMap = r0
        L36:
            return
        L37:
            r4.newEventOccurred = r3
            return
        L3a:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no event down from "
            java.lang.StringBuilder r1 = r1.append(r2)
            androidx.lifecycle.Lifecycle$State r2 = r4.state
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " in component "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> r2 = r4.lifecycleOwner
            java.lang.Object r2 = r2.get()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    private final void popParentState() {
            r2 = this;
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r0 = r2.parentStates
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r1 = r2.parentStates
            int r1 = r1.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
            return
    }

    private final void pushParentState(androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r0 = r1.parentStates
            r0.add(r2)
            return
    }

    private final void sync() {
            r4 = this;
            java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> r0 = r4.lifecycleOwner
            java.lang.Object r0 = r0.get()
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            if (r0 == 0) goto L5a
        La:
            boolean r1 = r4.isSynced()
            r2 = 0
            if (r1 != 0) goto L57
            r4.newEventOccurred = r2
            androidx.lifecycle.Lifecycle$State r1 = r4.state
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r2 = r4.observerMap
            java.util.Map$Entry r2 = r2.eldest()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Object r2 = r2.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r2 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r2
            androidx.lifecycle.Lifecycle$State r2 = r2.getState()
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r1 = r1.compareTo(r2)
            if (r1 >= 0) goto L33
            r4.backwardPass(r0)
        L33:
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r1 = r4.observerMap
            java.util.Map$Entry r1 = r1.newest()
            boolean r2 = r4.newEventOccurred
            if (r2 != 0) goto La
            if (r1 == 0) goto La
            androidx.lifecycle.Lifecycle$State r2 = r4.state
            java.lang.Object r3 = r1.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r3 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r3
            androidx.lifecycle.Lifecycle$State r3 = r3.getState()
            java.lang.Enum r3 = (java.lang.Enum) r3
            int r2 = r2.compareTo(r3)
            if (r2 <= 0) goto La
            r4.forwardPass(r0)
            goto La
        L57:
            r4.newEventOccurred = r2
            return
        L5a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(androidx.lifecycle.LifecycleObserver r10) {
            r9 = this;
            java.lang.String r0 = "observer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "addObserver"
            r9.enforceMainThreadIfNeeded(r0)
            androidx.lifecycle.Lifecycle$State r0 = r9.state
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r1) goto L13
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            goto L15
        L13:
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.INITIALIZED
        L15:
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r1 = new androidx.lifecycle.LifecycleRegistry$ObserverWithState
            r1.<init>(r10, r0)
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r2 = r9.observerMap
            java.lang.Object r2 = r2.putIfAbsent(r10, r1)
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r2 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r2
            if (r2 == 0) goto L25
            return
        L25:
            java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> r3 = r9.lifecycleOwner
            java.lang.Object r3 = r3.get()
            androidx.lifecycle.LifecycleOwner r3 = (androidx.lifecycle.LifecycleOwner) r3
            if (r3 != 0) goto L30
            return
        L30:
            int r4 = r9.addingObserverCounter
            r5 = 1
            if (r4 != 0) goto L3c
            boolean r4 = r9.handlingEvent
            if (r4 == 0) goto L3a
            goto L3c
        L3a:
            r4 = 0
            goto L3d
        L3c:
            r4 = r5
        L3d:
            androidx.lifecycle.Lifecycle$State r6 = r9.calculateTargetState(r10)
            int r7 = r9.addingObserverCounter
            int r7 = r7 + r5
            r9.addingObserverCounter = r7
        L46:
            androidx.lifecycle.Lifecycle$State r5 = r1.getState()
            r7 = r6
            java.lang.Enum r7 = (java.lang.Enum) r7
            int r5 = r5.compareTo(r7)
            if (r5 >= 0) goto L96
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r5 = r9.observerMap
            boolean r5 = r5.contains(r10)
            if (r5 == 0) goto L96
            androidx.lifecycle.Lifecycle$State r5 = r1.getState()
            r9.pushParentState(r5)
            androidx.lifecycle.Lifecycle$Event$Companion r5 = androidx.lifecycle.Lifecycle.Event.Companion
            androidx.lifecycle.Lifecycle$State r7 = r1.getState()
            androidx.lifecycle.Lifecycle$Event r5 = r5.upFrom(r7)
            if (r5 == 0) goto L79
            r1.dispatchEvent(r3, r5)
            r9.popParentState()
            androidx.lifecycle.Lifecycle$State r6 = r9.calculateTargetState(r10)
            goto L46
        L79:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "no event up from "
            java.lang.StringBuilder r7 = r7.append(r8)
            androidx.lifecycle.Lifecycle$State r8 = r1.getState()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r5.<init>(r7)
            throw r5
        L96:
            if (r4 != 0) goto L9b
            r9.sync()
        L9b:
            int r5 = r9.addingObserverCounter
            int r5 = r5 + (-1)
            r9.addingObserverCounter = r5
            return
    }

    @Override // androidx.lifecycle.Lifecycle
    public androidx.lifecycle.Lifecycle.State getCurrentState() {
            r1 = this;
            androidx.lifecycle.Lifecycle$State r0 = r1.state
            return r0
    }

    public int getObserverCount() {
            r1 = this;
            java.lang.String r0 = "getObserverCount"
            r1.enforceMainThreadIfNeeded(r0)
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r1.observerMap
            int r0 = r0.size()
            return r0
    }

    public void handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event r2) {
            r1 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "handleLifecycleEvent"
            r1.enforceMainThreadIfNeeded(r0)
            androidx.lifecycle.Lifecycle$State r0 = r2.getTargetState()
            r1.moveToState(r0)
            return
    }

    @kotlin.Deprecated(message = "Override [currentState].")
    public void markState(androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "markState"
            r1.enforceMainThreadIfNeeded(r0)
            r1.setCurrentState(r2)
            return
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(androidx.lifecycle.LifecycleObserver r2) {
            r1 = this;
            java.lang.String r0 = "observer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "removeObserver"
            r1.enforceMainThreadIfNeeded(r0)
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r1.observerMap
            r0.remove(r2)
            return
    }

    public void setCurrentState(androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "setCurrentState"
            r1.enforceMainThreadIfNeeded(r0)
            r1.moveToState(r2)
            return
    }
}
