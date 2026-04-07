package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class TintContextWrapper extends android.content.ContextWrapper {
    private static final java.lang.Object CACHE_LOCK = null;
    private static java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> sCache;
    private final android.content.res.Resources mResources;
    private final android.content.res.Resources.Theme mTheme;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.appcompat.widget.TintContextWrapper.CACHE_LOCK = r0
            return
    }

    private TintContextWrapper(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            boolean r0 = androidx.appcompat.widget.VectorEnabledTintResources.shouldBeUsed()
            if (r0 == 0) goto L26
            androidx.appcompat.widget.VectorEnabledTintResources r0 = new androidx.appcompat.widget.VectorEnabledTintResources
            android.content.res.Resources r1 = r3.getResources()
            r0.<init>(r2, r1)
            r2.mResources = r0
            android.content.res.Resources r0 = r2.mResources
            android.content.res.Resources$Theme r0 = r0.newTheme()
            r2.mTheme = r0
            android.content.res.Resources$Theme r0 = r2.mTheme
            android.content.res.Resources$Theme r1 = r3.getTheme()
            r0.setTo(r1)
            goto L34
        L26:
            androidx.appcompat.widget.TintResources r0 = new androidx.appcompat.widget.TintResources
            android.content.res.Resources r1 = r3.getResources()
            r0.<init>(r2, r1)
            r2.mResources = r0
            r0 = 0
            r2.mTheme = r0
        L34:
            return
    }

    private static boolean shouldWrap(android.content.Context r2) {
            boolean r0 = r2 instanceof androidx.appcompat.widget.TintContextWrapper
            r1 = 0
            if (r0 != 0) goto L1e
            android.content.res.Resources r0 = r2.getResources()
            boolean r0 = r0 instanceof androidx.appcompat.widget.TintResources
            if (r0 != 0) goto L1e
            android.content.res.Resources r0 = r2.getResources()
            boolean r0 = r0 instanceof androidx.appcompat.widget.VectorEnabledTintResources
            if (r0 == 0) goto L16
            goto L1e
        L16:
            boolean r0 = androidx.appcompat.widget.VectorEnabledTintResources.shouldBeUsed()
            if (r0 == 0) goto L1d
            r1 = 1
        L1d:
            return r1
        L1e:
            return r1
    }

    public static android.content.Context wrap(android.content.Context r5) {
            boolean r0 = shouldWrap(r5)
            if (r0 == 0) goto L74
            java.lang.Object r0 = androidx.appcompat.widget.TintContextWrapper.CACHE_LOCK
            monitor-enter(r0)
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> r1 = androidx.appcompat.widget.TintContextWrapper.sCache     // Catch: java.lang.Throwable -> L71
            if (r1 != 0) goto L15
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L71
            r1.<init>()     // Catch: java.lang.Throwable -> L71
            androidx.appcompat.widget.TintContextWrapper.sCache = r1     // Catch: java.lang.Throwable -> L71
            goto L60
        L15:
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> r1 = androidx.appcompat.widget.TintContextWrapper.sCache     // Catch: java.lang.Throwable -> L71
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L71
            int r1 = r1 + (-1)
        L1d:
            if (r1 < 0) goto L37
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> r2 = androidx.appcompat.widget.TintContextWrapper.sCache     // Catch: java.lang.Throwable -> L71
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L2f
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L71
            if (r3 != 0) goto L34
        L2f:
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> r3 = androidx.appcompat.widget.TintContextWrapper.sCache     // Catch: java.lang.Throwable -> L71
            r3.remove(r1)     // Catch: java.lang.Throwable -> L71
        L34:
            int r1 = r1 + (-1)
            goto L1d
        L37:
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> r1 = androidx.appcompat.widget.TintContextWrapper.sCache     // Catch: java.lang.Throwable -> L71
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L71
            int r1 = r1 + (-1)
        L3f:
            if (r1 < 0) goto L60
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> r2 = androidx.appcompat.widget.TintContextWrapper.sCache     // Catch: java.lang.Throwable -> L71
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L52
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L71
            androidx.appcompat.widget.TintContextWrapper r3 = (androidx.appcompat.widget.TintContextWrapper) r3     // Catch: java.lang.Throwable -> L71
            goto L53
        L52:
            r3 = 0
        L53:
            if (r3 == 0) goto L5d
            android.content.Context r4 = r3.getBaseContext()     // Catch: java.lang.Throwable -> L71
            if (r4 != r5) goto L5d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            return r3
        L5d:
            int r1 = r1 + (-1)
            goto L3f
        L60:
            androidx.appcompat.widget.TintContextWrapper r1 = new androidx.appcompat.widget.TintContextWrapper     // Catch: java.lang.Throwable -> L71
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L71
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> r2 = androidx.appcompat.widget.TintContextWrapper.sCache     // Catch: java.lang.Throwable -> L71
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L71
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L71
            r2.add(r3)     // Catch: java.lang.Throwable -> L71
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            return r1
        L71:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            throw r1
        L74:
            return r5
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
            r1 = this;
            android.content.res.Resources r0 = r1.mResources
            android.content.res.AssetManager r0 = r0.getAssets()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
            r1 = this;
            android.content.res.Resources r0 = r1.mResources
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
            r1 = this;
            android.content.res.Resources$Theme r0 = r1.mTheme
            if (r0 != 0) goto L9
            android.content.res.Resources$Theme r0 = super.getTheme()
            goto Lb
        L9:
            android.content.res.Resources$Theme r0 = r1.mTheme
        Lb:
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int r3) {
            r2 = this;
            android.content.res.Resources$Theme r0 = r2.mTheme
            if (r0 != 0) goto L8
            super.setTheme(r3)
            goto Le
        L8:
            android.content.res.Resources$Theme r0 = r2.mTheme
            r1 = 1
            r0.applyStyle(r3, r1)
        Le:
            return
    }
}
