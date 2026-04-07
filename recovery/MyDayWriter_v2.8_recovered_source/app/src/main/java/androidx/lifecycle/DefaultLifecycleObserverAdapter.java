package androidx.lifecycle;

/* JADX INFO: compiled from: DefaultLifecycleObserverAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/LifecycleEventObserver;", "defaultLifecycleObserver", "Landroidx/lifecycle/DefaultLifecycleObserver;", "lifecycleEventObserver", "(Landroidx/lifecycle/DefaultLifecycleObserver;Landroidx/lifecycle/LifecycleEventObserver;)V", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultLifecycleObserverAdapter implements androidx.lifecycle.LifecycleEventObserver {
    private final androidx.lifecycle.DefaultLifecycleObserver defaultLifecycleObserver;
    private final androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver;

    /* JADX INFO: compiled from: DefaultLifecycleObserverAdapter.kt */
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
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START     // Catch: java.lang.NoSuchFieldError -> L1c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
                goto L1d
            L1c:
                r1 = move-exception
            L1d:
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME     // Catch: java.lang.NoSuchFieldError -> L27
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
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP     // Catch: java.lang.NoSuchFieldError -> L3d
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
                androidx.lifecycle.DefaultLifecycleObserverAdapter.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public DefaultLifecycleObserverAdapter(androidx.lifecycle.DefaultLifecycleObserver r2, androidx.lifecycle.LifecycleEventObserver r3) {
            r1 = this;
            java.lang.String r0 = "defaultLifecycleObserver"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.defaultLifecycleObserver = r2
            r1.lifecycleEventObserver = r3
            return
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int[] r0 = androidx.lifecycle.DefaultLifecycleObserverAdapter.WhenMappings.$EnumSwitchMapping$0
            int r1 = r4.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L3c;
                case 2: goto L36;
                case 3: goto L30;
                case 4: goto L2a;
                case 5: goto L24;
                case 6: goto L1e;
                case 7: goto L16;
                default: goto L15;
            }
        L15:
            goto L41
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "ON_ANY must not been send by anybody"
            r0.<init>(r1)
            throw r0
        L1e:
            androidx.lifecycle.DefaultLifecycleObserver r0 = r2.defaultLifecycleObserver
            r0.onDestroy(r3)
            goto L41
        L24:
            androidx.lifecycle.DefaultLifecycleObserver r0 = r2.defaultLifecycleObserver
            r0.onStop(r3)
            goto L41
        L2a:
            androidx.lifecycle.DefaultLifecycleObserver r0 = r2.defaultLifecycleObserver
            r0.onPause(r3)
            goto L41
        L30:
            androidx.lifecycle.DefaultLifecycleObserver r0 = r2.defaultLifecycleObserver
            r0.onResume(r3)
            goto L41
        L36:
            androidx.lifecycle.DefaultLifecycleObserver r0 = r2.defaultLifecycleObserver
            r0.onStart(r3)
            goto L41
        L3c:
            androidx.lifecycle.DefaultLifecycleObserver r0 = r2.defaultLifecycleObserver
            r0.onCreate(r3)
        L41:
            androidx.lifecycle.LifecycleEventObserver r0 = r2.lifecycleEventObserver
            if (r0 == 0) goto L48
            r0.onStateChanged(r3, r4)
        L48:
            return
    }
}
