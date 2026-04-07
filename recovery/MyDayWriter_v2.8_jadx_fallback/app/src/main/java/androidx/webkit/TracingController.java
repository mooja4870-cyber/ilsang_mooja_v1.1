package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public abstract class TracingController {

    private static class LAZY_HOLDER {
        static final androidx.webkit.TracingController INSTANCE = null;

        static {
                androidx.webkit.internal.TracingControllerImpl r0 = new androidx.webkit.internal.TracingControllerImpl
                r0.<init>()
                androidx.webkit.TracingController.LAZY_HOLDER.INSTANCE = r0
                return
        }

        private LAZY_HOLDER() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public TracingController() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.webkit.TracingController getInstance() {
            androidx.webkit.TracingController r0 = androidx.webkit.TracingController.LAZY_HOLDER.INSTANCE
            return r0
    }

    public abstract boolean isTracing();

    public abstract void start(androidx.webkit.TracingConfig r1);

    public abstract boolean stop(java.io.OutputStream r1, java.util.concurrent.Executor r2);
}
