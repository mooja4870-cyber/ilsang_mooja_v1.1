package _COROUTINE;

/* JADX INFO: compiled from: CoroutineDebugging.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"ARTIFICIAL_FRAME_PACKAGE_NAME", "", "getARTIFICIAL_FRAME_PACKAGE_NAME", "()Ljava/lang/String;", "artificialFrame", "Ljava/lang/StackTraceElement;", "", "name", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CoroutineDebuggingKt {
    private static final java.lang.String ARTIFICIAL_FRAME_PACKAGE_NAME = null;

    static {
            java.lang.String r0 = "_COROUTINE"
            _COROUTINE.CoroutineDebuggingKt.ARTIFICIAL_FRAME_PACKAGE_NAME = r0
            return
    }

    public static final /* synthetic */ java.lang.StackTraceElement access$artificialFrame(java.lang.Throwable r1, java.lang.String r2) {
            java.lang.StackTraceElement r0 = artificialFrame(r1, r2)
            return r0
    }

    private static final java.lang.StackTraceElement artificialFrame(java.lang.Throwable r7, java.lang.String r8) {
            java.lang.StackTraceElement[] r0 = r7.getStackTrace()
            r1 = 0
            r0 = r0[r1]
            r1 = 0
            java.lang.StackTraceElement r2 = new java.lang.StackTraceElement
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = _COROUTINE.CoroutineDebuggingKt.ARTIFICIAL_FRAME_PACKAGE_NAME
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = 46
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r0.getFileName()
            int r5 = r0.getLineNumber()
            java.lang.String r6 = "_"
            r2.<init>(r3, r6, r4, r5)
            return r2
    }

    public static final java.lang.String getARTIFICIAL_FRAME_PACKAGE_NAME() {
            java.lang.String r0 = _COROUTINE.CoroutineDebuggingKt.ARTIFICIAL_FRAME_PACKAGE_NAME
            return r0
    }
}
