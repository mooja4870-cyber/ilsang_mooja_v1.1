package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class VisualStateCallbackAdapter implements org.chromium.support_lib_boundary.VisualStateCallbackBoundaryInterface {
    private final androidx.webkit.WebViewCompat.VisualStateCallback mVisualStateCallback;

    public VisualStateCallbackAdapter(androidx.webkit.WebViewCompat.VisualStateCallback r1) {
            r0 = this;
            r0.<init>()
            r0.mVisualStateCallback = r1
            return
    }

    @Override // org.chromium.support_lib_boundary.VisualStateCallbackBoundaryInterface
    public void onComplete(long r2) {
            r1 = this;
            androidx.webkit.WebViewCompat$VisualStateCallback r0 = r1.mVisualStateCallback
            r0.onComplete(r2)
            return
    }
}
