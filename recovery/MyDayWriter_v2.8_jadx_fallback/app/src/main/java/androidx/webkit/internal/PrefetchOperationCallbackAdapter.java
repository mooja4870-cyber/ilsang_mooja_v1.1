package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class PrefetchOperationCallbackAdapter {


    public PrefetchOperationCallbackAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.reflect.InvocationHandler buildInvocationHandler(androidx.webkit.OutcomeReceiverCompat<java.lang.Void, androidx.webkit.PrefetchException> r2) {
            androidx.webkit.internal.PrefetchOperationCallbackAdapter$1 r0 = new androidx.webkit.internal.PrefetchOperationCallbackAdapter$1
            r0.<init>(r2)
            java.lang.reflect.InvocationHandler r1 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(r0)
            return r1
    }
}
