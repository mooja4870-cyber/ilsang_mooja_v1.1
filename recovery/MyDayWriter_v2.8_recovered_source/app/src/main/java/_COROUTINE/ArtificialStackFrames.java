package _COROUTINE;

/* JADX INFO: compiled from: CoroutineDebugging.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"L_COROUTINE/ArtificialStackFrames;", "", "()V", "coroutineBoundary", "Ljava/lang/StackTraceElement;", "coroutineCreation", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ArtificialStackFrames {
    public ArtificialStackFrames() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.lang.StackTraceElement coroutineBoundary() {
            r2 = this;
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Class<_COROUTINE._BOUNDARY> r1 = _COROUTINE._BOUNDARY.class
            java.lang.String r1 = r1.getSimpleName()
            java.lang.StackTraceElement r0 = _COROUTINE.CoroutineDebuggingKt.access$artificialFrame(r0, r1)
            return r0
    }

    public final java.lang.StackTraceElement coroutineCreation() {
            r2 = this;
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Class<_COROUTINE._CREATION> r1 = _COROUTINE._CREATION.class
            java.lang.String r1 = r1.getSimpleName()
            java.lang.StackTraceElement r0 = _COROUTINE.CoroutineDebuggingKt.access$artificialFrame(r0, r1)
            return r0
    }
}
