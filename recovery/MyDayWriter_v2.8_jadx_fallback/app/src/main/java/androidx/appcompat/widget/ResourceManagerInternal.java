package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class ResourceManagerInternal {
    private static final androidx.appcompat.widget.ResourceManagerInternal.ColorFilterLruCache COLOR_FILTER_CACHE = null;
    private static final boolean DEBUG = false;
    private static final android.graphics.PorterDuff.Mode DEFAULT_MODE = null;
    private static androidx.appcompat.widget.ResourceManagerInternal INSTANCE = null;
    private static final java.lang.String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final java.lang.String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final java.lang.String TAG = "ResourceManagerInternal";
    private androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate> mDelegates;
    private final java.util.WeakHashMap<android.content.Context, androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable.ConstantState>>> mDrawableCaches;
    private boolean mHasCheckedVectorDrawableSetup;
    private androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks mHooks;
    private androidx.collection.SparseArrayCompat<java.lang.String> mKnownDrawableIdTags;
    private java.util.WeakHashMap<android.content.Context, androidx.collection.SparseArrayCompat<android.content.res.ColorStateList>> mTintLists;
    private android.util.TypedValue mTypedValue;

    static class AsldcInflateDelegate implements androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate {
        AsldcInflateDelegate() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public android.graphics.drawable.Drawable createFromXmlInner(android.content.Context r4, org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, android.content.res.Resources.Theme r7) {
                r3 = this;
                android.content.res.Resources r0 = r4.getResources()     // Catch: java.lang.Exception -> La
                androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat r0 = androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.createFromXmlInner(r4, r0, r5, r6, r7)     // Catch: java.lang.Exception -> La
                return r0
            La:
                r0 = move-exception
                java.lang.String r1 = "AsldcInflateDelegate"
                java.lang.String r2 = "Exception while inflating <animated-selector>"
                android.util.Log.e(r1, r2, r0)
                r1 = 0
                return r1
        }
    }

    private static class AvdcInflateDelegate implements androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate {
        AvdcInflateDelegate() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public android.graphics.drawable.Drawable createFromXmlInner(android.content.Context r4, org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, android.content.res.Resources.Theme r7) {
                r3 = this;
                android.content.res.Resources r0 = r4.getResources()     // Catch: java.lang.Exception -> La
                androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r0 = androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.createFromXmlInner(r4, r0, r5, r6, r7)     // Catch: java.lang.Exception -> La
                return r0
            La:
                r0 = move-exception
                java.lang.String r1 = "AvdcInflateDelegate"
                java.lang.String r2 = "Exception while inflating <animated-vector>"
                android.util.Log.e(r1, r2, r0)
                r1 = 0
                return r1
        }
    }

    private static class ColorFilterLruCache extends androidx.collection.LruCache<java.lang.Integer, android.graphics.PorterDuffColorFilter> {
        public ColorFilterLruCache(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static int generateCacheKey(int r3, android.graphics.PorterDuff.Mode r4) {
                r0 = 1
                int r1 = r0 * 31
                int r1 = r1 + r3
                int r0 = r1 * 31
                int r2 = r4.hashCode()
                int r0 = r0 + r2
                return r0
        }

        android.graphics.PorterDuffColorFilter get(int r2, android.graphics.PorterDuff.Mode r3) {
                r1 = this;
                int r0 = generateCacheKey(r2, r3)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object r0 = r1.get(r0)
                android.graphics.PorterDuffColorFilter r0 = (android.graphics.PorterDuffColorFilter) r0
                return r0
        }

        android.graphics.PorterDuffColorFilter put(int r2, android.graphics.PorterDuff.Mode r3, android.graphics.PorterDuffColorFilter r4) {
                r1 = this;
                int r0 = generateCacheKey(r2, r3)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object r0 = r1.put(r0, r4)
                android.graphics.PorterDuffColorFilter r0 = (android.graphics.PorterDuffColorFilter) r0
                return r0
        }
    }

    static class DrawableDelegate implements androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate {
        DrawableDelegate() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public android.graphics.drawable.Drawable createFromXmlInner(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7, android.util.AttributeSet r8, android.content.res.Resources.Theme r9) {
                r5 = this;
                java.lang.String r0 = r8.getClassAttribute()
                r1 = 0
                if (r0 == 0) goto L38
                java.lang.Class<androidx.appcompat.widget.ResourceManagerInternal$DrawableDelegate> r2 = androidx.appcompat.widget.ResourceManagerInternal.DrawableDelegate.class
                java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Exception -> L2f
                java.lang.Class r2 = r2.loadClass(r0)     // Catch: java.lang.Exception -> L2f
                java.lang.Class<android.graphics.drawable.Drawable> r3 = android.graphics.drawable.Drawable.class
                java.lang.Class r2 = r2.asSubclass(r3)     // Catch: java.lang.Exception -> L2f
                r3 = 0
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L2f
                java.lang.reflect.Constructor r4 = r2.getDeclaredConstructor(r4)     // Catch: java.lang.Exception -> L2f
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2f
                java.lang.Object r3 = r4.newInstance(r3)     // Catch: java.lang.Exception -> L2f
                android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3     // Catch: java.lang.Exception -> L2f
                android.content.res.Resources r4 = r6.getResources()     // Catch: java.lang.Exception -> L2f
                androidx.appcompat.resources.Compatibility.Api21Impl.inflate(r3, r4, r7, r8, r9)     // Catch: java.lang.Exception -> L2f
                return r3
            L2f:
                r2 = move-exception
                java.lang.String r3 = "DrawableDelegate"
                java.lang.String r4 = "Exception while inflating <drawable>"
                android.util.Log.e(r3, r4, r2)
                return r1
            L38:
                return r1
        }
    }

    private interface InflateDelegate {
        android.graphics.drawable.Drawable createFromXmlInner(android.content.Context r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4);
    }

    public interface ResourceManagerHooks {
        android.graphics.drawable.Drawable createDrawableFor(androidx.appcompat.widget.ResourceManagerInternal r1, android.content.Context r2, int r3);

        android.content.res.ColorStateList getTintListForDrawableRes(android.content.Context r1, int r2);

        android.graphics.PorterDuff.Mode getTintModeForDrawableRes(int r1);

        boolean tintDrawable(android.content.Context r1, int r2, android.graphics.drawable.Drawable r3);

        boolean tintDrawableUsingColorFilter(android.content.Context r1, int r2, android.graphics.drawable.Drawable r3);
    }

    private static class VdcInflateDelegate implements androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate {
        VdcInflateDelegate() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
        public android.graphics.drawable.Drawable createFromXmlInner(android.content.Context r4, org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, android.content.res.Resources.Theme r7) {
                r3 = this;
                android.content.res.Resources r0 = r4.getResources()     // Catch: java.lang.Exception -> La
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.createFromXmlInner(r0, r5, r6, r7)     // Catch: java.lang.Exception -> La
                return r0
            La:
                r0 = move-exception
                java.lang.String r1 = "VdcInflateDelegate"
                java.lang.String r2 = "Exception while inflating <vector>"
                android.util.Log.e(r1, r2, r0)
                r1 = 0
                return r1
        }
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.appcompat.widget.ResourceManagerInternal.DEFAULT_MODE = r0
            androidx.appcompat.widget.ResourceManagerInternal$ColorFilterLruCache r0 = new androidx.appcompat.widget.ResourceManagerInternal$ColorFilterLruCache
            r1 = 6
            r0.<init>(r1)
            androidx.appcompat.widget.ResourceManagerInternal.COLOR_FILTER_CACHE = r0
            return
    }

    public ResourceManagerInternal() {
            r2 = this;
            r2.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            r2.mDrawableCaches = r0
            return
    }

    private void addDelegate(java.lang.String r2, androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate r3) {
            r1 = this;
            androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate> r0 = r1.mDelegates
            if (r0 != 0) goto Lb
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            r1.mDelegates = r0
        Lb:
            androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate> r0 = r1.mDelegates
            r0.put(r2, r3)
            return
    }

    private synchronized boolean addDrawableToCache(android.content.Context r4, long r5, android.graphics.drawable.Drawable r7) {
            r3 = this;
            monitor-enter(r3)
            android.graphics.drawable.Drawable$ConstantState r0 = r7.getConstantState()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L27
            java.util.WeakHashMap<android.content.Context, androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r1 = r3.mDrawableCaches     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L2a
            androidx.collection.LongSparseArray r1 = (androidx.collection.LongSparseArray) r1     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L1c
            androidx.collection.LongSparseArray r2 = new androidx.collection.LongSparseArray     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            r1 = r2
            java.util.WeakHashMap<android.content.Context, androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r2 = r3.mDrawableCaches     // Catch: java.lang.Throwable -> L2a
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L2a
        L1c:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2a
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)
            r2 = 1
            return r2
        L27:
            monitor-exit(r3)
            r1 = 0
            return r1
        L2a:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            throw r4
    }

    private void addTintListToCache(android.content.Context r3, int r4, android.content.res.ColorStateList r5) {
            r2 = this;
            java.util.WeakHashMap<android.content.Context, androidx.collection.SparseArrayCompat<android.content.res.ColorStateList>> r0 = r2.mTintLists
            if (r0 != 0) goto Lb
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.mTintLists = r0
        Lb:
            java.util.WeakHashMap<android.content.Context, androidx.collection.SparseArrayCompat<android.content.res.ColorStateList>> r0 = r2.mTintLists
            java.lang.Object r0 = r0.get(r3)
            androidx.collection.SparseArrayCompat r0 = (androidx.collection.SparseArrayCompat) r0
            if (r0 != 0) goto L20
            androidx.collection.SparseArrayCompat r1 = new androidx.collection.SparseArrayCompat
            r1.<init>()
            r0 = r1
            java.util.WeakHashMap<android.content.Context, androidx.collection.SparseArrayCompat<android.content.res.ColorStateList>> r1 = r2.mTintLists
            r1.put(r3, r0)
        L20:
            r0.append(r4, r5)
            return
    }

    private void checkVectorDrawableSetup(android.content.Context r4) {
            r3 = this;
            boolean r0 = r3.mHasCheckedVectorDrawableSetup
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.mHasCheckedVectorDrawableSetup = r0
            int r0 = androidx.appcompat.resources.R.drawable.abc_vector_test
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r4, r0)
            if (r0 == 0) goto L17
            boolean r1 = isVectorDrawable(r0)
            if (r1 == 0) goto L17
            return
        L17:
            r1 = 0
            r3.mHasCheckedVectorDrawableSetup = r1
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r1.<init>(r2)
            throw r1
    }

    private static long createCacheKey(android.util.TypedValue r4) {
            int r0 = r4.assetCookie
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            int r2 = r4.data
            long r2 = (long) r2
            long r0 = r0 | r2
            return r0
    }

    private android.graphics.drawable.Drawable createDrawableIfNeeded(android.content.Context r6, int r7) {
            r5 = this;
            android.util.TypedValue r0 = r5.mTypedValue
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r5.mTypedValue = r0
        Lb:
            android.util.TypedValue r0 = r5.mTypedValue
            android.content.res.Resources r1 = r6.getResources()
            r2 = 1
            r1.getValue(r7, r0, r2)
            long r1 = createCacheKey(r0)
            android.graphics.drawable.Drawable r3 = r5.getCachedDrawable(r6, r1)
            if (r3 == 0) goto L20
            return r3
        L20:
            androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks r4 = r5.mHooks
            if (r4 != 0) goto L26
            r4 = 0
            goto L2c
        L26:
            androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks r4 = r5.mHooks
            android.graphics.drawable.Drawable r4 = r4.createDrawableFor(r5, r6, r7)
        L2c:
            if (r4 == 0) goto L37
            int r3 = r0.changingConfigurations
            r4.setChangingConfigurations(r3)
            r5.addDrawableToCache(r6, r1, r4)
        L37:
            return r4
    }

    private static android.graphics.PorterDuffColorFilter createTintFilter(android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3, int[] r4) {
            if (r2 == 0) goto Lf
            if (r3 != 0) goto L5
            goto Lf
        L5:
            r0 = 0
            int r0 = r2.getColorForState(r4, r0)
            android.graphics.PorterDuffColorFilter r1 = getPorterDuffColorFilter(r0, r3)
            return r1
        Lf:
            r0 = 0
            return r0
    }

    public static synchronized androidx.appcompat.widget.ResourceManagerInternal get() {
            java.lang.Class<androidx.appcompat.widget.ResourceManagerInternal> r0 = androidx.appcompat.widget.ResourceManagerInternal.class
            monitor-enter(r0)
            androidx.appcompat.widget.ResourceManagerInternal r1 = androidx.appcompat.widget.ResourceManagerInternal.INSTANCE     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L13
            androidx.appcompat.widget.ResourceManagerInternal r1 = new androidx.appcompat.widget.ResourceManagerInternal     // Catch: java.lang.Throwable -> L17
            r1.<init>()     // Catch: java.lang.Throwable -> L17
            androidx.appcompat.widget.ResourceManagerInternal.INSTANCE = r1     // Catch: java.lang.Throwable -> L17
            androidx.appcompat.widget.ResourceManagerInternal r1 = androidx.appcompat.widget.ResourceManagerInternal.INSTANCE     // Catch: java.lang.Throwable -> L17
            installDefaultInflateDelegates(r1)     // Catch: java.lang.Throwable -> L17
        L13:
            androidx.appcompat.widget.ResourceManagerInternal r1 = androidx.appcompat.widget.ResourceManagerInternal.INSTANCE     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r1
        L17:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    private synchronized android.graphics.drawable.Drawable getCachedDrawable(android.content.Context r5, long r6) {
            r4 = this;
            monitor-enter(r4)
            java.util.WeakHashMap<android.content.Context, androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r4.mDrawableCaches     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L2d
            androidx.collection.LongSparseArray r0 = (androidx.collection.LongSparseArray) r0     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r0 != 0) goto Le
            monitor-exit(r4)
            return r1
        Le:
            java.lang.Object r2 = r0.get(r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2b
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L2d
            android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L28
            android.content.res.Resources r1 = r5.getResources()     // Catch: java.lang.Throwable -> L2d
            android.graphics.drawable.Drawable r1 = r3.newDrawable(r1)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r4)
            return r1
        L28:
            r0.remove(r6)     // Catch: java.lang.Throwable -> L2d
        L2b:
            monitor-exit(r4)
            return r1
        L2d:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2d
            throw r5
    }

    public static synchronized android.graphics.PorterDuffColorFilter getPorterDuffColorFilter(int r3, android.graphics.PorterDuff.Mode r4) {
            java.lang.Class<androidx.appcompat.widget.ResourceManagerInternal> r0 = androidx.appcompat.widget.ResourceManagerInternal.class
            monitor-enter(r0)
            androidx.appcompat.widget.ResourceManagerInternal$ColorFilterLruCache r1 = androidx.appcompat.widget.ResourceManagerInternal.COLOR_FILTER_CACHE     // Catch: java.lang.Throwable -> L18
            android.graphics.PorterDuffColorFilter r1 = r1.get(r3, r4)     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L16
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter     // Catch: java.lang.Throwable -> L18
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L18
            r1 = r2
            androidx.appcompat.widget.ResourceManagerInternal$ColorFilterLruCache r2 = androidx.appcompat.widget.ResourceManagerInternal.COLOR_FILTER_CACHE     // Catch: java.lang.Throwable -> L18
            r2.put(r3, r4, r1)     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r0)
            return r1
        L18:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r3
    }

    private android.content.res.ColorStateList getTintListFromCache(android.content.Context r3, int r4) {
            r2 = this;
            java.util.WeakHashMap<android.content.Context, androidx.collection.SparseArrayCompat<android.content.res.ColorStateList>> r0 = r2.mTintLists
            r1 = 0
            if (r0 == 0) goto L16
            java.util.WeakHashMap<android.content.Context, androidx.collection.SparseArrayCompat<android.content.res.ColorStateList>> r0 = r2.mTintLists
            java.lang.Object r0 = r0.get(r3)
            androidx.collection.SparseArrayCompat r0 = (androidx.collection.SparseArrayCompat) r0
            if (r0 == 0) goto L15
            java.lang.Object r1 = r0.get(r4)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
        L15:
            return r1
        L16:
            return r1
    }

    private static void installDefaultInflateDelegates(androidx.appcompat.widget.ResourceManagerInternal r0) {
            return
    }

    private static boolean isVectorDrawable(android.graphics.drawable.Drawable r2) {
            boolean r0 = r2 instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
            if (r0 != 0) goto L17
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "android.graphics.drawable.VectorDrawable"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            return r0
    }

    private android.graphics.drawable.Drawable loadDrawableFromDelegates(android.content.Context r13, int r14) {
            r12 = this;
            androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate> r0 = r12.mDelegates
            r1 = 0
            if (r0 == 0) goto Lbc
            androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate> r0 = r12.mDelegates
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lbc
            androidx.collection.SparseArrayCompat<java.lang.String> r0 = r12.mKnownDrawableIdTags
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L2e
            androidx.collection.SparseArrayCompat<java.lang.String> r0 = r12.mKnownDrawableIdTags
            java.lang.Object r0 = r0.get(r14)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L2d
            if (r0 == 0) goto L2c
            androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate> r3 = r12.mDelegates
            java.lang.Object r3 = r3.get(r0)
            if (r3 != 0) goto L2c
            goto L2d
        L2c:
            goto L35
        L2d:
            return r1
        L2e:
            androidx.collection.SparseArrayCompat r0 = new androidx.collection.SparseArrayCompat
            r0.<init>()
            r12.mKnownDrawableIdTags = r0
        L35:
            android.util.TypedValue r0 = r12.mTypedValue
            if (r0 != 0) goto L40
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r12.mTypedValue = r0
        L40:
            android.util.TypedValue r0 = r12.mTypedValue
            android.content.res.Resources r1 = r13.getResources()
            r3 = 1
            r1.getValue(r14, r0, r3)
            long r4 = createCacheKey(r0)
            android.graphics.drawable.Drawable r6 = r12.getCachedDrawable(r13, r4)
            if (r6 == 0) goto L55
            return r6
        L55:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto Lb4
            java.lang.CharSequence r7 = r0.string
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto Lb4
            android.content.res.XmlResourceParser r7 = r1.getXml(r14)     // Catch: java.lang.Exception -> Lac
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r7)     // Catch: java.lang.Exception -> Lac
        L6f:
            int r9 = r7.next()     // Catch: java.lang.Exception -> Lac
            r10 = r9
            r11 = 2
            if (r9 == r11) goto L7a
            if (r10 == r3) goto L7a
            goto L6f
        L7a:
            if (r10 != r11) goto La4
            java.lang.String r3 = r7.getName()     // Catch: java.lang.Exception -> Lac
            androidx.collection.SparseArrayCompat<java.lang.String> r9 = r12.mKnownDrawableIdTags     // Catch: java.lang.Exception -> Lac
            r9.append(r14, r3)     // Catch: java.lang.Exception -> Lac
            androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate> r9 = r12.mDelegates     // Catch: java.lang.Exception -> Lac
            java.lang.Object r9 = r9.get(r3)     // Catch: java.lang.Exception -> Lac
            androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate r9 = (androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate) r9     // Catch: java.lang.Exception -> Lac
            if (r9 == 0) goto L99
        L90:
            android.content.res.Resources$Theme r11 = r13.getTheme()     // Catch: java.lang.Exception -> Lac
            android.graphics.drawable.Drawable r11 = r9.createFromXmlInner(r13, r7, r8, r11)     // Catch: java.lang.Exception -> Lac
            r6 = r11
        L99:
            if (r6 == 0) goto La3
            int r11 = r0.changingConfigurations     // Catch: java.lang.Exception -> Lac
            r6.setChangingConfigurations(r11)     // Catch: java.lang.Exception -> Lac
            r12.addDrawableToCache(r13, r4, r6)     // Catch: java.lang.Exception -> Lac
        La3:
            goto Lb4
        La4:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Exception -> Lac
            java.lang.String r9 = "No start tag found"
            r3.<init>(r9)     // Catch: java.lang.Exception -> Lac
            throw r3     // Catch: java.lang.Exception -> Lac
        Lac:
            r3 = move-exception
            java.lang.String r7 = "ResourceManagerInternal"
            java.lang.String r8 = "Exception while inflating drawable"
            android.util.Log.e(r7, r8, r3)
        Lb4:
            if (r6 != 0) goto Lbb
            androidx.collection.SparseArrayCompat<java.lang.String> r3 = r12.mKnownDrawableIdTags
            r3.append(r14, r2)
        Lbb:
            return r6
        Lbc:
            return r1
    }

    private android.graphics.drawable.Drawable tintDrawable(android.content.Context r3, int r4, boolean r5, android.graphics.drawable.Drawable r6) {
            r2 = this;
            android.content.res.ColorStateList r0 = r2.getTintList(r3, r4)
            if (r0 == 0) goto L1b
            android.graphics.drawable.Drawable r6 = r6.mutate()
            android.graphics.drawable.Drawable r6 = androidx.core.graphics.drawable.DrawableCompat.wrap(r6)
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r6, r0)
            android.graphics.PorterDuff$Mode r1 = r2.getTintMode(r4)
            if (r1 == 0) goto L1a
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r6, r1)
        L1a:
            goto L31
        L1b:
            androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks r1 = r2.mHooks
            if (r1 == 0) goto L28
            androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks r1 = r2.mHooks
            boolean r1 = r1.tintDrawable(r3, r4, r6)
            if (r1 == 0) goto L28
            goto L1a
        L28:
            boolean r1 = r2.tintDrawableUsingColorFilter(r3, r4, r6)
            if (r1 != 0) goto L31
            if (r5 == 0) goto L31
            r6 = 0
        L31:
            return r6
    }

    static void tintDrawable(android.graphics.drawable.Drawable r4, androidx.appcompat.widget.TintInfo r5, int[] r6) {
            int[] r0 = r4.getState()
            android.graphics.drawable.Drawable r1 = r4.mutate()
            r2 = 0
            if (r1 != r4) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = r2
        Le:
            if (r1 != 0) goto L18
            java.lang.String r2 = "ResourceManagerInternal"
            java.lang.String r3 = "Mutated drawable is not the same instance as the input."
            android.util.Log.d(r2, r3)
            return
        L18:
            boolean r3 = r4 instanceof android.graphics.drawable.LayerDrawable
            if (r3 == 0) goto L2a
            boolean r3 = r4.isStateful()
            if (r3 == 0) goto L2a
            int[] r2 = new int[r2]
            r4.setState(r2)
            r4.setState(r0)
        L2a:
            boolean r2 = r5.mHasTintList
            if (r2 != 0) goto L37
            boolean r2 = r5.mHasTintMode
            if (r2 == 0) goto L33
            goto L37
        L33:
            r4.clearColorFilter()
            goto L50
        L37:
            boolean r2 = r5.mHasTintList
            if (r2 == 0) goto L3f
            android.content.res.ColorStateList r2 = r5.mTintList
            goto L40
        L3f:
            r2 = 0
        L40:
            boolean r3 = r5.mHasTintMode
            if (r3 == 0) goto L47
            android.graphics.PorterDuff$Mode r3 = r5.mTintMode
            goto L49
        L47:
            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.ResourceManagerInternal.DEFAULT_MODE
        L49:
            android.graphics.PorterDuffColorFilter r2 = createTintFilter(r2, r3, r6)
            r4.setColorFilter(r2)
        L50:
            return
    }

    public synchronized android.graphics.drawable.Drawable getDrawable(android.content.Context r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r2, r3, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r0
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    synchronized android.graphics.drawable.Drawable getDrawable(android.content.Context r3, int r4, boolean r5) {
            r2 = this;
            monitor-enter(r2)
            r2.checkVectorDrawableSetup(r3)     // Catch: java.lang.Throwable -> L24
            android.graphics.drawable.Drawable r0 = r2.loadDrawableFromDelegates(r3, r4)     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto Lf
            android.graphics.drawable.Drawable r1 = r2.createDrawableIfNeeded(r3, r4)     // Catch: java.lang.Throwable -> L24
            r0 = r1
        Lf:
            if (r0 != 0) goto L16
            android.graphics.drawable.Drawable r1 = androidx.core.content.ContextCompat.getDrawable(r3, r4)     // Catch: java.lang.Throwable -> L24
            r0 = r1
        L16:
            if (r0 == 0) goto L1d
            android.graphics.drawable.Drawable r1 = r2.tintDrawable(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> L24
            r0 = r1
        L1d:
            if (r0 == 0) goto L22
            androidx.appcompat.widget.DrawableUtils.fixDrawable(r0)     // Catch: java.lang.Throwable -> L24
        L22:
            monitor-exit(r2)
            return r0
        L24:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            throw r3
    }

    synchronized android.content.res.ColorStateList getTintList(android.content.Context r3, int r4) {
            r2 = this;
            monitor-enter(r2)
            android.content.res.ColorStateList r0 = r2.getTintListFromCache(r3, r4)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L19
            androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks r1 = r2.mHooks     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto Ld
            r1 = 0
            goto L13
        Ld:
            androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks r1 = r2.mHooks     // Catch: java.lang.Throwable -> L1b
            android.content.res.ColorStateList r1 = r1.getTintListForDrawableRes(r3, r4)     // Catch: java.lang.Throwable -> L1b
        L13:
            r0 = r1
            if (r0 == 0) goto L19
            r2.addTintListToCache(r3, r4, r0)     // Catch: java.lang.Throwable -> L1b
        L19:
            monitor-exit(r2)
            return r0
        L1b:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    android.graphics.PorterDuff.Mode getTintMode(int r2) {
            r1 = this;
            androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks r0 = r1.mHooks
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks r0 = r1.mHooks
            android.graphics.PorterDuff$Mode r0 = r0.getTintModeForDrawableRes(r2)
        Lc:
            return r0
    }

    public synchronized void onConfigurationChanged(android.content.Context r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.WeakHashMap<android.content.Context, androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r1.mDrawableCaches     // Catch: java.lang.Throwable -> L10
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L10
            androidx.collection.LongSparseArray r0 = (androidx.collection.LongSparseArray) r0     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            r0.clear()     // Catch: java.lang.Throwable -> L10
        Le:
            monitor-exit(r1)
            return
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    synchronized android.graphics.drawable.Drawable onDrawableLoadedFromResources(android.content.Context r3, androidx.appcompat.widget.VectorEnabledTintResources r4, int r5) {
            r2 = this;
            monitor-enter(r2)
            android.graphics.drawable.Drawable r0 = r2.loadDrawableFromDelegates(r3, r5)     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto Lc
            android.graphics.drawable.Drawable r1 = r4.getDrawableCanonical(r5)     // Catch: java.lang.Throwable -> L18
            r0 = r1
        Lc:
            if (r0 == 0) goto L15
            r1 = 0
            android.graphics.drawable.Drawable r1 = r2.tintDrawable(r3, r5, r1, r0)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            return r1
        L15:
            monitor-exit(r2)
            r1 = 0
            return r1
        L18:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r3
    }

    public synchronized void setHooks(androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks r1) {
            r0 = this;
            monitor-enter(r0)
            r0.mHooks = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    boolean tintDrawableUsingColorFilter(android.content.Context r2, int r3, android.graphics.drawable.Drawable r4) {
            r1 = this;
            androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks r0 = r1.mHooks
            if (r0 == 0) goto Le
            androidx.appcompat.widget.ResourceManagerInternal$ResourceManagerHooks r0 = r1.mHooks
            boolean r0 = r0.tintDrawableUsingColorFilter(r2, r3, r4)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }
}
