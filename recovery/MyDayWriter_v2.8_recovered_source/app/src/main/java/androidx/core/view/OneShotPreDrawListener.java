package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class OneShotPreDrawListener implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
    private final java.lang.Runnable mRunnable;
    private final android.view.View mView;
    private android.view.ViewTreeObserver mViewTreeObserver;

    private OneShotPreDrawListener(android.view.View r2, java.lang.Runnable r3) {
            r1 = this;
            r1.<init>()
            r1.mView = r2
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            r1.mViewTreeObserver = r0
            r1.mRunnable = r3
            return
    }

    public static androidx.core.view.OneShotPreDrawListener add(android.view.View r2, java.lang.Runnable r3) {
            if (r2 == 0) goto L1c
            if (r3 == 0) goto L14
            androidx.core.view.OneShotPreDrawListener r0 = new androidx.core.view.OneShotPreDrawListener
            r0.<init>(r2, r3)
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            r1.addOnPreDrawListener(r0)
            r2.addOnAttachStateChangeListener(r0)
            return r0
        L14:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "runnable == null"
            r0.<init>(r1)
            throw r0
        L1c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "view == null"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
            r1 = this;
            r1.removeListener()
            java.lang.Runnable r0 = r1.mRunnable
            r0.run()
            r0 = 1
            return r0
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View r2) {
            r1 = this;
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            r1.mViewTreeObserver = r0
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            r0.removeListener()
            return
    }

    public void removeListener() {
            r1 = this;
            android.view.ViewTreeObserver r0 = r1.mViewTreeObserver
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto Le
            android.view.ViewTreeObserver r0 = r1.mViewTreeObserver
            r0.removeOnPreDrawListener(r1)
            goto L17
        Le:
            android.view.View r0 = r1.mView
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnPreDrawListener(r1)
        L17:
            android.view.View r0 = r1.mView
            r0.removeOnAttachStateChangeListener(r1)
            return
    }
}
