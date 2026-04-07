package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class ScriptHandlerImpl implements androidx.webkit.ScriptHandler {
    private final org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface mBoundaryInterface;

    private ScriptHandlerImpl(org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface r1) {
            r0 = this;
            r0.<init>()
            r0.mBoundaryInterface = r1
            return
    }

    public static androidx.webkit.internal.ScriptHandlerImpl toScriptHandler(java.lang.reflect.InvocationHandler r2) {
            java.lang.Class<org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface> r0 = org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface.class
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r2)
            org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface r0 = (org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface) r0
            androidx.webkit.internal.ScriptHandlerImpl r1 = new androidx.webkit.internal.ScriptHandlerImpl
            r1.<init>(r0)
            return r1
    }

    @Override // androidx.webkit.ScriptHandler
    public void remove() {
            r1 = this;
            org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface r0 = r1.mBoundaryInterface
            r0.remove()
            return
    }
}
