package androidx.lifecycle;

/* JADX INFO: compiled from: MethodCallsLogger.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0006H\u0017R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/MethodCallsLogger;", "", "()V", "calledMethods", "", "", "", "approveCall", "", "name", "type", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class MethodCallsLogger {
    private final java.util.Map<java.lang.String, java.lang.Integer> calledMethods;

    public MethodCallsLogger() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1.calledMethods = r0
            return
    }

    public boolean approveCall(java.lang.String r8, int r9) {
            r7 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r7.calledMethods
            java.lang.Object r0 = r0.get(r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 0
            if (r0 == 0) goto L15
            int r2 = r0.intValue()
            goto L16
        L15:
            r2 = r1
        L16:
            r3 = r2 & r9
            r4 = 1
            if (r3 == 0) goto L1d
            r3 = r4
            goto L1e
        L1d:
            r3 = r1
        L1e:
            java.util.Map<java.lang.String, java.lang.Integer> r5 = r7.calledMethods
            r6 = r2 | r9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.put(r8, r6)
            if (r3 != 0) goto L2c
            r1 = r4
        L2c:
            return r1
    }
}
