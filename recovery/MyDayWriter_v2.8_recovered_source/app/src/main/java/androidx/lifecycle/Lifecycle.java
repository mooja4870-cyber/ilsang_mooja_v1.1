package androidx.lifecycle;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H'J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H'R\u0014\u0010\u0003\u001a\u00020\u00048gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "", "()V", "currentState", "Landroidx/lifecycle/Lifecycle$State;", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "internalScopeRef", "Ljava/util/concurrent/atomic/AtomicReference;", "getInternalScopeRef", "()Ljava/util/concurrent/atomic/AtomicReference;", "setInternalScopeRef", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "addObserver", "", "observer", "Landroidx/lifecycle/LifecycleObserver;", "removeObserver", "Event", "State", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Lifecycle {
    private java.util.concurrent.atomic.AtomicReference<java.lang.Object> internalScopeRef;

    /* JADX INFO: compiled from: Lifecycle.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "", "(Ljava/lang/String;I)V", "targetState", "Landroidx/lifecycle/Lifecycle$State;", "getTargetState", "()Landroidx/lifecycle/Lifecycle$State;", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "Companion", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Event extends java.lang.Enum<androidx.lifecycle.Lifecycle.Event> {
        private static final /* synthetic */ androidx.lifecycle.Lifecycle.Event[] $VALUES = null;
        public static final androidx.lifecycle.Lifecycle.Event.Companion Companion = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_ANY = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_CREATE = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_DESTROY = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_PAUSE = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_RESUME = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_START = null;
        public static final androidx.lifecycle.Lifecycle.Event ON_STOP = null;

        /* JADX INFO: compiled from: Lifecycle.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\n"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event$Companion;", "", "()V", "downFrom", "Landroidx/lifecycle/Lifecycle$Event;", "state", "Landroidx/lifecycle/Lifecycle$State;", "downTo", "upFrom", "upTo", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: compiled from: Lifecycle.kt */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

                static {
                        androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch: java.lang.NoSuchFieldError -> L11
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                        r2 = 1
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L11
                        goto L12
                    L11:
                        r1 = move-exception
                    L12:
                        androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch: java.lang.NoSuchFieldError -> L1c
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
                        r2 = 2
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
                        goto L1d
                    L1c:
                        r1 = move-exception
                    L1d:
                        androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch: java.lang.NoSuchFieldError -> L27
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L27
                        r2 = 3
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L27
                        goto L28
                    L27:
                        r1 = move-exception
                    L28:
                        androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED     // Catch: java.lang.NoSuchFieldError -> L32
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L32
                        r2 = 4
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L32
                        goto L33
                    L32:
                        r1 = move-exception
                    L33:
                        androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L3d
                        int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                        r2 = 5
                        r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
                        goto L3e
                    L3d:
                        r1 = move-exception
                    L3e:
                        androidx.lifecycle.Lifecycle.Event.Companion.WhenMappings.$EnumSwitchMapping$0 = r0
                        return
                }
            }

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
            public final androidx.lifecycle.Lifecycle.Event downFrom(androidx.lifecycle.Lifecycle.State r3) {
                    r2 = this;
                    java.lang.String r0 = "state"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    int[] r0 = androidx.lifecycle.Lifecycle.Event.Companion.WhenMappings.$EnumSwitchMapping$0
                    int r1 = r3.ordinal()
                    r0 = r0[r1]
                    switch(r0) {
                        case 1: goto L18;
                        case 2: goto L15;
                        case 3: goto L12;
                        default: goto L10;
                    }
                L10:
                    r0 = 0
                    goto L1a
                L12:
                    androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
                    goto L1a
                L15:
                    androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                    goto L1a
                L18:
                    androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                L1a:
                    return r0
            }

            @kotlin.jvm.JvmStatic
            public final androidx.lifecycle.Lifecycle.Event downTo(androidx.lifecycle.Lifecycle.State r3) {
                    r2 = this;
                    java.lang.String r0 = "state"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    int[] r0 = androidx.lifecycle.Lifecycle.Event.Companion.WhenMappings.$EnumSwitchMapping$0
                    int r1 = r3.ordinal()
                    r0 = r0[r1]
                    switch(r0) {
                        case 1: goto L18;
                        case 2: goto L15;
                        case 3: goto L10;
                        case 4: goto L12;
                        default: goto L10;
                    }
                L10:
                    r0 = 0
                    goto L1a
                L12:
                    androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                    goto L1a
                L15:
                    androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
                    goto L1a
                L18:
                    androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                L1a:
                    return r0
            }

            @kotlin.jvm.JvmStatic
            public final androidx.lifecycle.Lifecycle.Event upFrom(androidx.lifecycle.Lifecycle.State r3) {
                    r2 = this;
                    java.lang.String r0 = "state"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    int[] r0 = androidx.lifecycle.Lifecycle.Event.Companion.WhenMappings.$EnumSwitchMapping$0
                    int r1 = r3.ordinal()
                    r0 = r0[r1]
                    switch(r0) {
                        case 1: goto L18;
                        case 2: goto L15;
                        case 3: goto L10;
                        case 4: goto L10;
                        case 5: goto L12;
                        default: goto L10;
                    }
                L10:
                    r0 = 0
                    goto L1a
                L12:
                    androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
                    goto L1a
                L15:
                    androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
                    goto L1a
                L18:
                    androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_START
                L1a:
                    return r0
            }

            @kotlin.jvm.JvmStatic
            public final androidx.lifecycle.Lifecycle.Event upTo(androidx.lifecycle.Lifecycle.State r3) {
                    r2 = this;
                    java.lang.String r0 = "state"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    int[] r0 = androidx.lifecycle.Lifecycle.Event.Companion.WhenMappings.$EnumSwitchMapping$0
                    int r1 = r3.ordinal()
                    r0 = r0[r1]
                    switch(r0) {
                        case 1: goto L18;
                        case 2: goto L15;
                        case 3: goto L12;
                        default: goto L10;
                    }
                L10:
                    r0 = 0
                    goto L1a
                L12:
                    androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
                    goto L1a
                L15:
                    androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_START
                    goto L1a
                L18:
                    androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
                L1a:
                    return r0
            }
        }

        /* JADX INFO: compiled from: Lifecycle.kt */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                    androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE     // Catch: java.lang.NoSuchFieldError -> L11
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                    r2 = 1
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L11
                    goto L12
                L11:
                    r1 = move-exception
                L12:
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP     // Catch: java.lang.NoSuchFieldError -> L1c
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
                    r2 = 2
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
                    goto L1d
                L1c:
                    r1 = move-exception
                L1d:
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START     // Catch: java.lang.NoSuchFieldError -> L27
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L27
                    r2 = 3
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L27
                    goto L28
                L27:
                    r1 = move-exception
                L28:
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE     // Catch: java.lang.NoSuchFieldError -> L32
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L32
                    r2 = 4
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L32
                    goto L33
                L32:
                    r1 = move-exception
                L33:
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME     // Catch: java.lang.NoSuchFieldError -> L3d
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                    r2 = 5
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
                    goto L3e
                L3d:
                    r1 = move-exception
                L3e:
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY     // Catch: java.lang.NoSuchFieldError -> L48
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L48
                    r2 = 6
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L48
                    goto L49
                L48:
                    r1 = move-exception
                L49:
                    androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_ANY     // Catch: java.lang.NoSuchFieldError -> L53
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L53
                    r2 = 7
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L53
                    goto L54
                L53:
                    r1 = move-exception
                L54:
                    androidx.lifecycle.Lifecycle.Event.WhenMappings.$EnumSwitchMapping$0 = r0
                    return
            }
        }

        private static final /* synthetic */ androidx.lifecycle.Lifecycle.Event[] $values() {
                androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
                androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
                androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
                androidx.lifecycle.Lifecycle$Event r4 = androidx.lifecycle.Lifecycle.Event.ON_STOP
                androidx.lifecycle.Lifecycle$Event r5 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
                androidx.lifecycle.Lifecycle$Event r6 = androidx.lifecycle.Lifecycle.Event.ON_ANY
                androidx.lifecycle.Lifecycle$Event[] r0 = new androidx.lifecycle.Lifecycle.Event[]{r0, r1, r2, r3, r4, r5, r6}
                return r0
        }

        static {
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_CREATE"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_CREATE = r0
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_START"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_START = r0
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_RESUME"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_RESUME = r0
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_PAUSE"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_PAUSE = r0
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_STOP"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_STOP = r0
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_DESTROY"
                r2 = 5
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_DESTROY = r0
                androidx.lifecycle.Lifecycle$Event r0 = new androidx.lifecycle.Lifecycle$Event
                java.lang.String r1 = "ON_ANY"
                r2 = 6
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.Event.ON_ANY = r0
                androidx.lifecycle.Lifecycle$Event[] r0 = $values()
                androidx.lifecycle.Lifecycle.Event.$VALUES = r0
                androidx.lifecycle.Lifecycle$Event$Companion r0 = new androidx.lifecycle.Lifecycle$Event$Companion
                r1 = 0
                r0.<init>(r1)
                androidx.lifecycle.Lifecycle.Event.Companion = r0
                return
        }

        Event(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.lifecycle.Lifecycle.Event downFrom(androidx.lifecycle.Lifecycle.State r1) {
                androidx.lifecycle.Lifecycle$Event$Companion r0 = androidx.lifecycle.Lifecycle.Event.Companion
                androidx.lifecycle.Lifecycle$Event r0 = r0.downFrom(r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.lifecycle.Lifecycle.Event downTo(androidx.lifecycle.Lifecycle.State r1) {
                androidx.lifecycle.Lifecycle$Event$Companion r0 = androidx.lifecycle.Lifecycle.Event.Companion
                androidx.lifecycle.Lifecycle$Event r0 = r0.downTo(r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.lifecycle.Lifecycle.Event upFrom(androidx.lifecycle.Lifecycle.State r1) {
                androidx.lifecycle.Lifecycle$Event$Companion r0 = androidx.lifecycle.Lifecycle.Event.Companion
                androidx.lifecycle.Lifecycle$Event r0 = r0.upFrom(r1)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.lifecycle.Lifecycle.Event upTo(androidx.lifecycle.Lifecycle.State r1) {
                androidx.lifecycle.Lifecycle$Event$Companion r0 = androidx.lifecycle.Lifecycle.Event.Companion
                androidx.lifecycle.Lifecycle$Event r0 = r0.upTo(r1)
                return r0
        }

        public static androidx.lifecycle.Lifecycle.Event valueOf(java.lang.String r1) {
                java.lang.Class<androidx.lifecycle.Lifecycle$Event> r0 = androidx.lifecycle.Lifecycle.Event.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                androidx.lifecycle.Lifecycle$Event r0 = (androidx.lifecycle.Lifecycle.Event) r0
                return r0
        }

        public static androidx.lifecycle.Lifecycle.Event[] values() {
                androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.lifecycle.Lifecycle$Event[] r0 = (androidx.lifecycle.Lifecycle.Event[]) r0
                return r0
        }

        public final androidx.lifecycle.Lifecycle.State getTargetState() {
                r3 = this;
                int[] r0 = androidx.lifecycle.Lifecycle.Event.WhenMappings.$EnumSwitchMapping$0
                int r1 = r3.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L2d;
                    case 2: goto L2d;
                    case 3: goto L2a;
                    case 4: goto L2a;
                    case 5: goto L27;
                    case 6: goto L24;
                    default: goto Lb;
                }
            Lb:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r1 = r1.append(r3)
                java.lang.String r2 = " has no target state"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L24:
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
                return r0
            L27:
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
                return r0
            L2a:
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.STARTED
                return r0
            L2d:
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
                return r0
        }
    }

    /* JADX INFO: compiled from: Lifecycle.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/Lifecycle$State;", "", "(Ljava/lang/String;I)V", "isAtLeast", "", "state", "DESTROYED", "INITIALIZED", "CREATED", "STARTED", "RESUMED", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum State extends java.lang.Enum<androidx.lifecycle.Lifecycle.State> {
        private static final /* synthetic */ androidx.lifecycle.Lifecycle.State[] $VALUES = null;
        public static final androidx.lifecycle.Lifecycle.State CREATED = null;
        public static final androidx.lifecycle.Lifecycle.State DESTROYED = null;
        public static final androidx.lifecycle.Lifecycle.State INITIALIZED = null;
        public static final androidx.lifecycle.Lifecycle.State RESUMED = null;
        public static final androidx.lifecycle.Lifecycle.State STARTED = null;

        private static final /* synthetic */ androidx.lifecycle.Lifecycle.State[] $values() {
                androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
                androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.CREATED
                androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.STARTED
                androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.RESUMED
                androidx.lifecycle.Lifecycle$State[] r0 = new androidx.lifecycle.Lifecycle.State[]{r0, r1, r2, r3, r4}
                return r0
        }

        static {
                androidx.lifecycle.Lifecycle$State r0 = new androidx.lifecycle.Lifecycle$State
                java.lang.String r1 = "DESTROYED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.State.DESTROYED = r0
                androidx.lifecycle.Lifecycle$State r0 = new androidx.lifecycle.Lifecycle$State
                java.lang.String r1 = "INITIALIZED"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.State.INITIALIZED = r0
                androidx.lifecycle.Lifecycle$State r0 = new androidx.lifecycle.Lifecycle$State
                java.lang.String r1 = "CREATED"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.State.CREATED = r0
                androidx.lifecycle.Lifecycle$State r0 = new androidx.lifecycle.Lifecycle$State
                java.lang.String r1 = "STARTED"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.State.STARTED = r0
                androidx.lifecycle.Lifecycle$State r0 = new androidx.lifecycle.Lifecycle$State
                java.lang.String r1 = "RESUMED"
                r2 = 4
                r0.<init>(r1, r2)
                androidx.lifecycle.Lifecycle.State.RESUMED = r0
                androidx.lifecycle.Lifecycle$State[] r0 = $values()
                androidx.lifecycle.Lifecycle.State.$VALUES = r0
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.lifecycle.Lifecycle.State valueOf(java.lang.String r1) {
                java.lang.Class<androidx.lifecycle.Lifecycle$State> r0 = androidx.lifecycle.Lifecycle.State.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
                return r0
        }

        public static androidx.lifecycle.Lifecycle.State[] values() {
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.lifecycle.Lifecycle$State[] r0 = (androidx.lifecycle.Lifecycle.State[]) r0
                return r0
        }

        public final boolean isAtLeast(androidx.lifecycle.Lifecycle.State r2) {
                r1 = this;
                java.lang.String r0 = "state"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = r2
                java.lang.Enum r0 = (java.lang.Enum) r0
                int r0 = r1.compareTo(r0)
                if (r0 < 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }
    }

    public Lifecycle() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.internalScopeRef = r0
            return
    }

    public abstract void addObserver(androidx.lifecycle.LifecycleObserver r1);

    public abstract androidx.lifecycle.Lifecycle.State getCurrentState();

    public final java.util.concurrent.atomic.AtomicReference<java.lang.Object> getInternalScopeRef() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r1.internalScopeRef
            return r0
    }

    public abstract void removeObserver(androidx.lifecycle.LifecycleObserver r1);

    public final void setInternalScopeRef(java.util.concurrent.atomic.AtomicReference<java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.internalScopeRef = r2
            return
    }
}
