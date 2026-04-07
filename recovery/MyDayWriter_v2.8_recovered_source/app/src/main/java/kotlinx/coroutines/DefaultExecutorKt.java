package kotlinx.coroutines;

/* JADX INFO: compiled from: DefaultExecutor.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\b\u0010\b\u001a\u00020\u0001H\u0002\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"DefaultDelay", "Lkotlinx/coroutines/Delay;", "getDefaultDelay$annotations", "()V", "getDefaultDelay", "()Lkotlinx/coroutines/Delay;", "defaultMainDelayOptIn", "", "initializeDefaultDelay", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DefaultExecutorKt {
    private static final kotlinx.coroutines.Delay DefaultDelay = null;
    private static final boolean defaultMainDelayOptIn = false;

    static {
            java.lang.String r0 = "kotlinx.coroutines.main.delay"
            r1 = 0
            boolean r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r0, r1)
            kotlinx.coroutines.DefaultExecutorKt.defaultMainDelayOptIn = r0
            kotlinx.coroutines.Delay r0 = initializeDefaultDelay()
            kotlinx.coroutines.DefaultExecutorKt.DefaultDelay = r0
            return
    }

    public static final kotlinx.coroutines.Delay getDefaultDelay() {
            kotlinx.coroutines.Delay r0 = kotlinx.coroutines.DefaultExecutorKt.DefaultDelay
            return r0
    }

    public static /* synthetic */ void getDefaultDelay$annotations() {
            return
    }

    private static final kotlinx.coroutines.Delay initializeDefaultDelay() {
            boolean r0 = kotlinx.coroutines.DefaultExecutorKt.defaultMainDelayOptIn
            if (r0 != 0) goto L9
            kotlinx.coroutines.DefaultExecutor r0 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            kotlinx.coroutines.Delay r0 = (kotlinx.coroutines.Delay) r0
            return r0
        L9:
            kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getMain()
            boolean r1 = kotlinx.coroutines.internal.MainDispatchersKt.isMissing(r0)
            if (r1 != 0) goto L1c
            boolean r1 = r0 instanceof kotlinx.coroutines.Delay
            if (r1 != 0) goto L18
            goto L1c
        L18:
            r1 = r0
            kotlinx.coroutines.Delay r1 = (kotlinx.coroutines.Delay) r1
            goto L20
        L1c:
            kotlinx.coroutines.DefaultExecutor r1 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            kotlinx.coroutines.Delay r1 = (kotlinx.coroutines.Delay) r1
        L20:
            return r1
    }
}
