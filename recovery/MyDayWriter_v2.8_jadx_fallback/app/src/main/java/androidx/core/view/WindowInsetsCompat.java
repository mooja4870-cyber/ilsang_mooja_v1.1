package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class WindowInsetsCompat {
    public static final androidx.core.view.WindowInsetsCompat CONSUMED = null;
    private static final java.lang.String TAG = "WindowInsetsCompat";
    private final androidx.core.view.WindowInsetsCompat.Impl mImpl;

    static class Api21ReflectionHolder {
        private static java.lang.reflect.Field sContentInsets;
        private static boolean sReflectionSucceeded;
        private static java.lang.reflect.Field sStableInsets;
        private static java.lang.reflect.Field sViewAttachInfoField;

        static {
                java.lang.Class<android.view.View> r0 = android.view.View.class
                java.lang.String r1 = "mAttachInfo"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.ReflectiveOperationException -> L33
                androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sViewAttachInfoField = r0     // Catch: java.lang.ReflectiveOperationException -> L33
                java.lang.reflect.Field r0 = androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sViewAttachInfoField     // Catch: java.lang.ReflectiveOperationException -> L33
                r1 = 1
                r0.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L33
                java.lang.String r0 = "android.view.View$AttachInfo"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ReflectiveOperationException -> L33
                java.lang.String r2 = "mStableInsets"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L33
                androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sStableInsets = r2     // Catch: java.lang.ReflectiveOperationException -> L33
                java.lang.reflect.Field r2 = androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sStableInsets     // Catch: java.lang.ReflectiveOperationException -> L33
                r2.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L33
                java.lang.String r2 = "mContentInsets"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L33
                androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sContentInsets = r2     // Catch: java.lang.ReflectiveOperationException -> L33
                java.lang.reflect.Field r2 = androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sContentInsets     // Catch: java.lang.ReflectiveOperationException -> L33
                r2.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L33
                androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sReflectionSucceeded = r1     // Catch: java.lang.ReflectiveOperationException -> L33
                goto L50
            L33:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to get visible insets from AttachInfo "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = r0.getMessage()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "WindowInsetsCompat"
                android.util.Log.w(r2, r1, r0)
            L50:
                return
        }

        private Api21ReflectionHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(android.view.View r7) {
                boolean r0 = androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sReflectionSucceeded
                r1 = 0
                if (r0 == 0) goto L6f
                boolean r0 = r7.isAttachedToWindow()
                if (r0 != 0) goto Lc
                goto L6f
            Lc:
                android.view.View r0 = r7.getRootView()
                java.lang.reflect.Field r2 = androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sViewAttachInfoField     // Catch: java.lang.IllegalAccessException -> L51
                java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.IllegalAccessException -> L51
                if (r2 == 0) goto L50
                java.lang.reflect.Field r3 = androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sStableInsets     // Catch: java.lang.IllegalAccessException -> L51
                java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.IllegalAccessException -> L51
                android.graphics.Rect r3 = (android.graphics.Rect) r3     // Catch: java.lang.IllegalAccessException -> L51
                java.lang.reflect.Field r4 = androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.sContentInsets     // Catch: java.lang.IllegalAccessException -> L51
                java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.IllegalAccessException -> L51
                android.graphics.Rect r4 = (android.graphics.Rect) r4     // Catch: java.lang.IllegalAccessException -> L51
                if (r3 == 0) goto L50
                if (r4 == 0) goto L50
                androidx.core.view.WindowInsetsCompat$Builder r5 = new androidx.core.view.WindowInsetsCompat$Builder     // Catch: java.lang.IllegalAccessException -> L51
                r5.<init>()     // Catch: java.lang.IllegalAccessException -> L51
                androidx.core.graphics.Insets r6 = androidx.core.graphics.Insets.of(r3)     // Catch: java.lang.IllegalAccessException -> L51
                androidx.core.view.WindowInsetsCompat$Builder r5 = r5.setStableInsets(r6)     // Catch: java.lang.IllegalAccessException -> L51
                androidx.core.graphics.Insets r6 = androidx.core.graphics.Insets.of(r4)     // Catch: java.lang.IllegalAccessException -> L51
                androidx.core.view.WindowInsetsCompat$Builder r5 = r5.setSystemWindowInsets(r6)     // Catch: java.lang.IllegalAccessException -> L51
                androidx.core.view.WindowInsetsCompat r5 = r5.build()     // Catch: java.lang.IllegalAccessException -> L51
                r5.setRootWindowInsets(r5)     // Catch: java.lang.IllegalAccessException -> L51
                android.view.View r6 = r7.getRootView()     // Catch: java.lang.IllegalAccessException -> L51
                r5.copyRootViewBounds(r6)     // Catch: java.lang.IllegalAccessException -> L51
                return r5
            L50:
                goto L6e
            L51:
                r2 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Failed to get insets from AttachInfo. "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = r2.getMessage()
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "WindowInsetsCompat"
                android.util.Log.w(r4, r3, r2)
            L6e:
                return r1
            L6f:
                return r1
        }
    }

    public static final class Builder {
        private final androidx.core.view.WindowInsetsCompat.BuilderImpl mImpl;

        public Builder() {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 34
                if (r0 < r1) goto L11
                androidx.core.view.WindowInsetsCompat$BuilderImpl34 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl34
                r0.<init>()
                r2.mImpl = r0
                goto L43
            L11:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 31
                if (r0 < r1) goto L1f
                androidx.core.view.WindowInsetsCompat$BuilderImpl31 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl31
                r0.<init>()
                r2.mImpl = r0
                goto L43
            L1f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 < r1) goto L2d
                androidx.core.view.WindowInsetsCompat$BuilderImpl30 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl30
                r0.<init>()
                r2.mImpl = r0
                goto L43
            L2d:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L3b
                androidx.core.view.WindowInsetsCompat$BuilderImpl29 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl29
                r0.<init>()
                r2.mImpl = r0
                goto L43
            L3b:
                androidx.core.view.WindowInsetsCompat$BuilderImpl20 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl20
                r0.<init>()
                r2.mImpl = r0
            L43:
                return
        }

        public Builder(androidx.core.view.WindowInsetsCompat r3) {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 34
                if (r0 < r1) goto L11
                androidx.core.view.WindowInsetsCompat$BuilderImpl34 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl34
                r0.<init>(r3)
                r2.mImpl = r0
                goto L43
            L11:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 31
                if (r0 < r1) goto L1f
                androidx.core.view.WindowInsetsCompat$BuilderImpl31 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl31
                r0.<init>(r3)
                r2.mImpl = r0
                goto L43
            L1f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 < r1) goto L2d
                androidx.core.view.WindowInsetsCompat$BuilderImpl30 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl30
                r0.<init>(r3)
                r2.mImpl = r0
                goto L43
            L2d:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L3b
                androidx.core.view.WindowInsetsCompat$BuilderImpl29 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl29
                r0.<init>(r3)
                r2.mImpl = r0
                goto L43
            L3b:
                androidx.core.view.WindowInsetsCompat$BuilderImpl20 r0 = new androidx.core.view.WindowInsetsCompat$BuilderImpl20
                r0.<init>(r3)
                r2.mImpl = r0
            L43:
                return
        }

        public androidx.core.view.WindowInsetsCompat build() {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                androidx.core.view.WindowInsetsCompat r0 = r0.build()
                return r0
        }

        public androidx.core.view.WindowInsetsCompat.Builder setDisplayCutout(androidx.core.view.DisplayCutoutCompat r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setDisplayCutout(r2)
                return r1
        }

        public androidx.core.view.WindowInsetsCompat.Builder setInsets(int r2, androidx.core.graphics.Insets r3) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setInsets(r2, r3)
                return r1
        }

        public androidx.core.view.WindowInsetsCompat.Builder setInsetsIgnoringVisibility(int r2, androidx.core.graphics.Insets r3) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setInsetsIgnoringVisibility(r2, r3)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.view.WindowInsetsCompat.Builder setMandatorySystemGestureInsets(androidx.core.graphics.Insets r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setMandatorySystemGestureInsets(r2)
                return r1
        }

        public androidx.core.view.WindowInsetsCompat.Builder setPrivacyIndicatorBounds(android.graphics.Rect r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setPrivacyIndicatorBounds(r2)
                return r1
        }

        public androidx.core.view.WindowInsetsCompat.Builder setRoundedCorner(int r2, androidx.core.view.RoundedCornerCompat r3) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setRoundedCorner(r2, r3)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.view.WindowInsetsCompat.Builder setStableInsets(androidx.core.graphics.Insets r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setStableInsets(r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.view.WindowInsetsCompat.Builder setSystemGestureInsets(androidx.core.graphics.Insets r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setSystemGestureInsets(r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.view.WindowInsetsCompat.Builder setSystemWindowInsets(androidx.core.graphics.Insets r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setSystemWindowInsets(r2)
                return r1
        }

        @java.lang.Deprecated
        public androidx.core.view.WindowInsetsCompat.Builder setTappableElementInsets(androidx.core.graphics.Insets r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setTappableElementInsets(r2)
                return r1
        }

        public androidx.core.view.WindowInsetsCompat.Builder setVisible(int r2, boolean r3) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat$BuilderImpl r0 = r1.mImpl
                r0.setVisible(r2, r3)
                return r1
        }
    }

    private static class BuilderImpl {
        private final androidx.core.view.WindowInsetsCompat mInsets;
        androidx.core.graphics.Insets[] mInsetsTypeMask;

        BuilderImpl() {
                r3 = this;
                androidx.core.view.WindowInsetsCompat r0 = new androidx.core.view.WindowInsetsCompat
                r1 = 0
                r2 = r1
                androidx.core.view.WindowInsetsCompat r2 = (androidx.core.view.WindowInsetsCompat) r2
                r0.<init>(r1)
                r3.<init>(r0)
                return
        }

        BuilderImpl(androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                r0.<init>()
                r0.mInsets = r1
                return
        }

        protected final void applyInsetTypes() {
                r5 = this;
                androidx.core.graphics.Insets[] r0 = r5.mInsetsTypeMask
                if (r0 == 0) goto L5a
                androidx.core.graphics.Insets[] r0 = r5.mInsetsTypeMask
                r1 = 1
                int r2 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r1)
                r0 = r0[r2]
                androidx.core.graphics.Insets[] r2 = r5.mInsetsTypeMask
                r3 = 2
                int r4 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r3)
                r2 = r2[r4]
                if (r2 != 0) goto L1e
                androidx.core.view.WindowInsetsCompat r4 = r5.mInsets
                androidx.core.graphics.Insets r2 = r4.getInsets(r3)
            L1e:
                if (r0 != 0) goto L26
                androidx.core.view.WindowInsetsCompat r3 = r5.mInsets
                androidx.core.graphics.Insets r0 = r3.getInsets(r1)
            L26:
                androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.max(r0, r2)
                r5.setSystemWindowInsets(r1)
                androidx.core.graphics.Insets[] r1 = r5.mInsetsTypeMask
                r3 = 16
                int r3 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r3)
                r1 = r1[r3]
                if (r1 == 0) goto L3c
                r5.setSystemGestureInsets(r1)
            L3c:
                androidx.core.graphics.Insets[] r3 = r5.mInsetsTypeMask
                r4 = 32
                int r4 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r4)
                r1 = r3[r4]
                if (r1 == 0) goto L4b
                r5.setMandatorySystemGestureInsets(r1)
            L4b:
                androidx.core.graphics.Insets[] r3 = r5.mInsetsTypeMask
                r4 = 64
                int r4 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r4)
                r1 = r3[r4]
                if (r1 == 0) goto L5a
                r5.setTappableElementInsets(r1)
            L5a:
                return
        }

        androidx.core.view.WindowInsetsCompat build() {
                r1 = this;
                r1.applyInsetTypes()
                androidx.core.view.WindowInsetsCompat r0 = r1.mInsets
                return r0
        }

        void setDisplayCutout(androidx.core.view.DisplayCutoutCompat r1) {
                r0 = this;
                return
        }

        void setInsets(int r4, androidx.core.graphics.Insets r5) {
                r3 = this;
                androidx.core.graphics.Insets[] r0 = r3.mInsetsTypeMask
                if (r0 != 0) goto La
                r0 = 10
                androidx.core.graphics.Insets[] r0 = new androidx.core.graphics.Insets[r0]
                r3.mInsetsTypeMask = r0
            La:
                r0 = 1
            Lb:
                r1 = 512(0x200, float:7.17E-43)
                if (r0 > r1) goto L1f
                r1 = r4 & r0
                if (r1 != 0) goto L14
                goto L1c
            L14:
                androidx.core.graphics.Insets[] r1 = r3.mInsetsTypeMask
                int r2 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r0)
                r1[r2] = r5
            L1c:
                int r0 = r0 << 1
                goto Lb
            L1f:
                return
        }

        void setInsetsIgnoringVisibility(int r3, androidx.core.graphics.Insets r4) {
                r2 = this;
                r0 = 8
                if (r3 == r0) goto L5
                return
            L5:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Ignoring visibility inset not available for IME"
                r0.<init>(r1)
                throw r0
        }

        void setMandatorySystemGestureInsets(androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }

        void setPrivacyIndicatorBounds(android.graphics.Rect r1) {
                r0 = this;
                return
        }

        void setRoundedCorner(int r1, androidx.core.view.RoundedCornerCompat r2) {
                r0 = this;
                return
        }

        void setStableInsets(androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }

        void setSystemGestureInsets(androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }

        void setSystemWindowInsets(androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }

        void setTappableElementInsets(androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }

        void setVisible(int r1, boolean r2) {
                r0 = this;
                return
        }
    }

    private static class BuilderImpl20 extends androidx.core.view.WindowInsetsCompat.BuilderImpl {
        private static java.lang.reflect.Constructor<android.view.WindowInsets> sConstructor;
        private static boolean sConstructorFetched;
        private static java.lang.reflect.Field sConsumedField;
        private static boolean sConsumedFieldFetched;
        private android.view.WindowInsets mPlatformInsets;
        private androidx.core.graphics.Insets mStableInsets;

        static {
                r0 = 0
                androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConsumedFieldFetched = r0
                androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConstructorFetched = r0
                return
        }

        BuilderImpl20() {
                r1 = this;
                r1.<init>()
                android.view.WindowInsets r0 = createWindowInsetsInstance()
                r1.mPlatformInsets = r0
                return
        }

        BuilderImpl20(androidx.core.view.WindowInsetsCompat r2) {
                r1 = this;
                r1.<init>(r2)
                android.view.WindowInsets r0 = r2.toWindowInsets()
                r1.mPlatformInsets = r0
                return
        }

        private static android.view.WindowInsets createWindowInsetsInstance() {
                boolean r0 = androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConsumedFieldFetched
                r1 = 1
                java.lang.String r2 = "WindowInsetsCompat"
                if (r0 != 0) goto L1a
                java.lang.Class<android.view.WindowInsets> r0 = android.view.WindowInsets.class
                java.lang.String r3 = "CONSUMED"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.ReflectiveOperationException -> L12
                androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConsumedField = r0     // Catch: java.lang.ReflectiveOperationException -> L12
                goto L18
            L12:
                r0 = move-exception
                java.lang.String r3 = "Could not retrieve WindowInsets.CONSUMED field"
                android.util.Log.i(r2, r3, r0)
            L18:
                androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConsumedFieldFetched = r1
            L1a:
                java.lang.reflect.Field r0 = androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConsumedField
                r3 = 0
                if (r0 == 0) goto L36
                java.lang.reflect.Field r0 = androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConsumedField     // Catch: java.lang.ReflectiveOperationException -> L30
                java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.ReflectiveOperationException -> L30
                android.view.WindowInsets r0 = (android.view.WindowInsets) r0     // Catch: java.lang.ReflectiveOperationException -> L30
                if (r0 == 0) goto L2f
                android.view.WindowInsets r4 = new android.view.WindowInsets     // Catch: java.lang.ReflectiveOperationException -> L30
                r4.<init>(r0)     // Catch: java.lang.ReflectiveOperationException -> L30
                return r4
            L2f:
                goto L36
            L30:
                r0 = move-exception
                java.lang.String r4 = "Could not get value from WindowInsets.CONSUMED field"
                android.util.Log.i(r2, r4, r0)
            L36:
                boolean r0 = androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConstructorFetched
                if (r0 != 0) goto L52
                java.lang.Class<android.view.WindowInsets> r0 = android.view.WindowInsets.class
                java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.ReflectiveOperationException -> L4a
                java.lang.Class<android.graphics.Rect> r5 = android.graphics.Rect.class
                r6 = 0
                r4[r6] = r5     // Catch: java.lang.ReflectiveOperationException -> L4a
                java.lang.reflect.Constructor r0 = r0.getConstructor(r4)     // Catch: java.lang.ReflectiveOperationException -> L4a
                androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConstructor = r0     // Catch: java.lang.ReflectiveOperationException -> L4a
                goto L50
            L4a:
                r0 = move-exception
                java.lang.String r4 = "Could not retrieve WindowInsets(Rect) constructor"
                android.util.Log.i(r2, r4, r0)
            L50:
                androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConstructorFetched = r1
            L52:
                java.lang.reflect.Constructor<android.view.WindowInsets> r0 = androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConstructor
                if (r0 == 0) goto L6e
                java.lang.reflect.Constructor<android.view.WindowInsets> r0 = androidx.core.view.WindowInsetsCompat.BuilderImpl20.sConstructor     // Catch: java.lang.ReflectiveOperationException -> L68
                android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.ReflectiveOperationException -> L68
                r1.<init>()     // Catch: java.lang.ReflectiveOperationException -> L68
                java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.ReflectiveOperationException -> L68
                java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.ReflectiveOperationException -> L68
                android.view.WindowInsets r0 = (android.view.WindowInsets) r0     // Catch: java.lang.ReflectiveOperationException -> L68
                return r0
            L68:
                r0 = move-exception
                java.lang.String r1 = "Could not invoke WindowInsets(Rect) constructor"
                android.util.Log.i(r2, r1, r0)
            L6e:
                return r3
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        androidx.core.view.WindowInsetsCompat build() {
                r2 = this;
                r2.applyInsetTypes()
                android.view.WindowInsets r0 = r2.mPlatformInsets
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                androidx.core.graphics.Insets[] r1 = r2.mInsetsTypeMask
                r0.setOverriddenInsets(r1)
                androidx.core.graphics.Insets r1 = r2.mStableInsets
                r0.setStableInsets(r1)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setStableInsets(androidx.core.graphics.Insets r1) {
                r0 = this;
                r0.mStableInsets = r1
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setSystemWindowInsets(androidx.core.graphics.Insets r6) {
                r5 = this;
                android.view.WindowInsets r0 = r5.mPlatformInsets
                if (r0 == 0) goto L14
                android.view.WindowInsets r0 = r5.mPlatformInsets
                int r1 = r6.left
                int r2 = r6.top
                int r3 = r6.right
                int r4 = r6.bottom
                android.view.WindowInsets r0 = r0.replaceSystemWindowInsets(r1, r2, r3, r4)
                r5.mPlatformInsets = r0
            L14:
                return
        }
    }

    private static class BuilderImpl29 extends androidx.core.view.WindowInsetsCompat.BuilderImpl {
        final android.view.WindowInsets.Builder mPlatBuilder;

        BuilderImpl29() {
                r1 = this;
                r1.<init>()
                android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                r0.<init>()
                r1.mPlatBuilder = r0
                return
        }

        BuilderImpl29(androidx.core.view.WindowInsetsCompat r3) {
                r2 = this;
                r2.<init>(r3)
                android.view.WindowInsets r0 = r3.toWindowInsets()
                if (r0 == 0) goto Lf
                android.view.WindowInsets$Builder r1 = new android.view.WindowInsets$Builder
                r1.<init>(r0)
                goto L14
            Lf:
                android.view.WindowInsets$Builder r1 = new android.view.WindowInsets$Builder
                r1.<init>()
            L14:
                r2.mPlatBuilder = r1
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        androidx.core.view.WindowInsetsCompat build() {
                r2 = this;
                r2.applyInsetTypes()
                android.view.WindowInsets$Builder r0 = r2.mPlatBuilder
                android.view.WindowInsets r0 = r0.build()
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                androidx.core.graphics.Insets[] r1 = r2.mInsetsTypeMask
                r0.setOverriddenInsets(r1)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setDisplayCutout(androidx.core.view.DisplayCutoutCompat r3) {
                r2 = this;
                android.view.WindowInsets$Builder r0 = r2.mPlatBuilder
                if (r3 == 0) goto L9
                android.view.DisplayCutout r1 = r3.unwrap()
                goto La
            L9:
                r1 = 0
            La:
                r0.setDisplayCutout(r1)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setMandatorySystemGestureInsets(androidx.core.graphics.Insets r3) {
                r2 = this;
                android.view.WindowInsets$Builder r0 = r2.mPlatBuilder
                android.graphics.Insets r1 = r3.toPlatformInsets()
                r0.setMandatorySystemGestureInsets(r1)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setStableInsets(androidx.core.graphics.Insets r3) {
                r2 = this;
                android.view.WindowInsets$Builder r0 = r2.mPlatBuilder
                android.graphics.Insets r1 = r3.toPlatformInsets()
                r0.setStableInsets(r1)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setSystemGestureInsets(androidx.core.graphics.Insets r3) {
                r2 = this;
                android.view.WindowInsets$Builder r0 = r2.mPlatBuilder
                android.graphics.Insets r1 = r3.toPlatformInsets()
                r0.setSystemGestureInsets(r1)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setSystemWindowInsets(androidx.core.graphics.Insets r3) {
                r2 = this;
                android.view.WindowInsets$Builder r0 = r2.mPlatBuilder
                android.graphics.Insets r1 = r3.toPlatformInsets()
                r0.setSystemWindowInsets(r1)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setTappableElementInsets(androidx.core.graphics.Insets r3) {
                r2 = this;
                android.view.WindowInsets$Builder r0 = r2.mPlatBuilder
                android.graphics.Insets r1 = r3.toPlatformInsets()
                r0.setTappableElementInsets(r1)
                return
        }
    }

    private static class BuilderImpl30 extends androidx.core.view.WindowInsetsCompat.BuilderImpl29 {
        BuilderImpl30() {
                r0 = this;
                r0.<init>()
                return
        }

        BuilderImpl30(androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setInsets(int r4, androidx.core.graphics.Insets r5) {
                r3 = this;
                android.view.WindowInsets$Builder r0 = r3.mPlatBuilder
                int r1 = androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(r4)
                android.graphics.Insets r2 = r5.toPlatformInsets()
                r0.setInsets(r1, r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setInsetsIgnoringVisibility(int r4, androidx.core.graphics.Insets r5) {
                r3 = this;
                android.view.WindowInsets$Builder r0 = r3.mPlatBuilder
                int r1 = androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(r4)
                android.graphics.Insets r2 = r5.toPlatformInsets()
                r0.setInsetsIgnoringVisibility(r1, r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setVisible(int r3, boolean r4) {
                r2 = this;
                android.view.WindowInsets$Builder r0 = r2.mPlatBuilder
                int r1 = androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(r3)
                r0.setVisible(r1, r4)
                return
        }
    }

    private static class BuilderImpl31 extends androidx.core.view.WindowInsetsCompat.BuilderImpl30 {
        BuilderImpl31() {
                r0 = this;
                r0.<init>()
                return
        }

        BuilderImpl31(androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setPrivacyIndicatorBounds(android.graphics.Rect r3) {
                r2 = this;
                android.view.WindowInsets$Builder r0 = r2.mPlatBuilder
                if (r3 == 0) goto La
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>(r3)
                goto Lb
            La:
                r1 = 0
            Lb:
                r0.setPrivacyIndicatorBounds(r1)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setRoundedCorner(int r4, androidx.core.view.RoundedCornerCompat r5) {
                r3 = this;
                android.view.WindowInsets$Builder r0 = r3.mPlatBuilder
                int r1 = androidx.core.view.RoundedCornerCompat.toPlatformPosition(r4)
                android.view.RoundedCorner r2 = androidx.core.view.RoundedCornerCompat.toPlatformRoundedCorner(r5)
                r0.setRoundedCorner(r1, r2)
                return
        }
    }

    private static class BuilderImpl34 extends androidx.core.view.WindowInsetsCompat.BuilderImpl31 {
        BuilderImpl34() {
                r0 = this;
                r0.<init>()
                return
        }

        BuilderImpl34(androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl30, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setInsets(int r4, androidx.core.graphics.Insets r5) {
                r3 = this;
                android.view.WindowInsets$Builder r0 = r3.mPlatBuilder
                int r1 = androidx.core.view.WindowInsetsCompat.TypeImpl34.toPlatformType(r4)
                android.graphics.Insets r2 = r5.toPlatformInsets()
                r0.setInsets(r1, r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl30, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setInsetsIgnoringVisibility(int r4, androidx.core.graphics.Insets r5) {
                r3 = this;
                android.view.WindowInsets$Builder r0 = r3.mPlatBuilder
                int r1 = androidx.core.view.WindowInsetsCompat.TypeImpl34.toPlatformType(r4)
                android.graphics.Insets r2 = r5.toPlatformInsets()
                r0.setInsetsIgnoringVisibility(r1, r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl30, androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setVisible(int r3, boolean r4) {
                r2 = this;
                android.view.WindowInsets$Builder r0 = r2.mPlatBuilder
                int r1 = androidx.core.view.WindowInsetsCompat.TypeImpl34.toPlatformType(r3)
                r0.setVisible(r1, r4)
                return
        }
    }

    private static class Impl {
        static final androidx.core.view.WindowInsetsCompat CONSUMED = null;
        final androidx.core.view.WindowInsetsCompat mHost;

        static {
                androidx.core.view.WindowInsetsCompat$Builder r0 = new androidx.core.view.WindowInsetsCompat$Builder
                r0.<init>()
                androidx.core.view.WindowInsetsCompat r0 = r0.build()
                androidx.core.view.WindowInsetsCompat r0 = r0.consumeDisplayCutout()
                androidx.core.view.WindowInsetsCompat r0 = r0.consumeStableInsets()
                androidx.core.view.WindowInsetsCompat r0 = r0.consumeSystemWindowInsets()
                androidx.core.view.WindowInsetsCompat.Impl.CONSUMED = r0
                return
        }

        Impl(androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                r0.<init>()
                r0.mHost = r1
                return
        }

        androidx.core.view.WindowInsetsCompat consumeDisplayCutout() {
                r1 = this;
                androidx.core.view.WindowInsetsCompat r0 = r1.mHost
                return r0
        }

        androidx.core.view.WindowInsetsCompat consumeStableInsets() {
                r1 = this;
                androidx.core.view.WindowInsetsCompat r0 = r1.mHost
                return r0
        }

        androidx.core.view.WindowInsetsCompat consumeSystemWindowInsets() {
                r1 = this;
                androidx.core.view.WindowInsetsCompat r0 = r1.mHost
                return r0
        }

        void copyRootViewBounds(android.view.View r1) {
                r0 = this;
                return
        }

        void copyWindowDataInto(androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                return
        }

        public boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof androidx.core.view.WindowInsetsCompat.Impl
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                r1 = r6
                androidx.core.view.WindowInsetsCompat$Impl r1 = (androidx.core.view.WindowInsetsCompat.Impl) r1
                boolean r3 = r5.isRound()
                boolean r4 = r1.isRound()
                if (r3 != r4) goto L4c
                boolean r3 = r5.isConsumed()
                boolean r4 = r1.isConsumed()
                if (r3 != r4) goto L4c
                androidx.core.graphics.Insets r3 = r5.getSystemWindowInsets()
                androidx.core.graphics.Insets r4 = r1.getSystemWindowInsets()
                boolean r3 = androidx.core.util.ObjectsCompat.equals(r3, r4)
                if (r3 == 0) goto L4c
                androidx.core.graphics.Insets r3 = r5.getStableInsets()
                androidx.core.graphics.Insets r4 = r1.getStableInsets()
                boolean r3 = androidx.core.util.ObjectsCompat.equals(r3, r4)
                if (r3 == 0) goto L4c
                androidx.core.view.DisplayCutoutCompat r3 = r5.getDisplayCutout()
                androidx.core.view.DisplayCutoutCompat r4 = r1.getDisplayCutout()
                boolean r3 = androidx.core.util.ObjectsCompat.equals(r3, r4)
                if (r3 == 0) goto L4c
                goto L4d
            L4c:
                r0 = r2
            L4d:
                return r0
        }

        androidx.core.view.DisplayCutoutCompat getDisplayCutout() {
                r1 = this;
                r0 = 0
                return r0
        }

        androidx.core.graphics.Insets getInsets(int r2) {
                r1 = this;
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                return r0
        }

        androidx.core.graphics.Insets getInsetsIgnoringVisibility(int r3) {
                r2 = this;
                r0 = r3 & 8
                if (r0 != 0) goto L7
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                return r0
            L7:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Unable to query the maximum insets for IME"
                r0.<init>(r1)
                throw r0
        }

        androidx.core.graphics.Insets getMandatorySystemGestureInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.getSystemWindowInsets()
                return r0
        }

        android.graphics.Rect getPrivacyIndicatorBounds() {
                r1 = this;
                r0 = 0
                return r0
        }

        androidx.core.view.RoundedCornerCompat getRoundedCorner(int r2) {
                r1 = this;
                r0 = 0
                return r0
        }

        androidx.core.graphics.Insets getStableInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                return r0
        }

        androidx.core.graphics.Insets getSystemGestureInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.getSystemWindowInsets()
                return r0
        }

        androidx.core.graphics.Insets getSystemWindowInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                return r0
        }

        androidx.core.graphics.Insets getTappableElementInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.getSystemWindowInsets()
                return r0
        }

        public int hashCode() {
                r5 = this;
                boolean r0 = r5.isRound()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                boolean r1 = r5.isConsumed()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                androidx.core.graphics.Insets r2 = r5.getSystemWindowInsets()
                androidx.core.graphics.Insets r3 = r5.getStableInsets()
                androidx.core.view.DisplayCutoutCompat r4 = r5.getDisplayCutout()
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3, r4}
                int r0 = androidx.core.util.ObjectsCompat.hash(r0)
                return r0
        }

        androidx.core.view.WindowInsetsCompat inset(int r2, int r3, int r4, int r5) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.Impl.CONSUMED
                return r0
        }

        boolean isConsumed() {
                r1 = this;
                r0 = 0
                return r0
        }

        boolean isRound() {
                r1 = this;
                r0 = 0
                return r0
        }

        boolean isVisible(int r2) {
                r1 = this;
                r0 = 1
                return r0
        }

        public void setOverriddenInsets(androidx.core.graphics.Insets[] r1) {
                r0 = this;
                return
        }

        void setRootViewData(androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }

        void setRootWindowInsets(androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                return
        }

        public void setStableInsets(androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }

        void setSystemUiVisibility(int r1) {
                r0 = this;
                return
        }
    }

    private static class Impl20 extends androidx.core.view.WindowInsetsCompat.Impl {
        private static final int SYSTEM_BAR_VISIBILITY_MASK = 6;
        private static java.lang.Class<?> sAttachInfoClass;
        private static java.lang.reflect.Field sAttachInfoField;
        private static java.lang.reflect.Method sGetViewRootImplMethod;
        private static java.lang.reflect.Field sVisibleInsetsField;
        private static boolean sVisibleRectReflectionFetched;
        private androidx.core.graphics.Insets[] mOverriddenInsets;
        final android.view.WindowInsets mPlatformInsets;
        androidx.core.graphics.Insets mRootViewVisibleInsets;
        private androidx.core.view.WindowInsetsCompat mRootWindowInsets;
        int mSystemUiVisibility;
        private androidx.core.graphics.Insets mSystemWindowInsets;

        static {
                r0 = 0
                androidx.core.view.WindowInsetsCompat.Impl20.sVisibleRectReflectionFetched = r0
                return
        }

        Impl20(androidx.core.view.WindowInsetsCompat r2, android.view.WindowInsets r3) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.mSystemWindowInsets = r0
                r1.mPlatformInsets = r3
                return
        }

        Impl20(androidx.core.view.WindowInsetsCompat r3, androidx.core.view.WindowInsetsCompat.Impl20 r4) {
                r2 = this;
                android.view.WindowInsets r0 = new android.view.WindowInsets
                android.view.WindowInsets r1 = r4.mPlatformInsets
                r0.<init>(r1)
                r2.<init>(r3, r0)
                return
        }

        private androidx.core.graphics.Insets getInsets(int r4, boolean r5) {
                r3 = this;
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                r1 = 1
            L3:
                r2 = 512(0x200, float:7.17E-43)
                if (r1 > r2) goto L17
                r2 = r4 & r1
                if (r2 != 0) goto Lc
                goto L14
            Lc:
                androidx.core.graphics.Insets r2 = r3.getInsetsForType(r1, r5)
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.max(r0, r2)
            L14:
                int r1 = r1 << 1
                goto L3
            L17:
                return r0
        }

        private androidx.core.graphics.Insets getRootStableInsets() {
                r1 = this;
                androidx.core.view.WindowInsetsCompat r0 = r1.mRootWindowInsets
                if (r0 == 0) goto Lb
                androidx.core.view.WindowInsetsCompat r0 = r1.mRootWindowInsets
                androidx.core.graphics.Insets r0 = r0.getStableInsets()
                return r0
            Lb:
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                return r0
        }

        private androidx.core.graphics.Insets getVisibleInsets(android.view.View r6) {
                r5 = this;
                java.lang.String r0 = "WindowInsetsCompat"
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 30
                if (r1 >= r2) goto L65
                boolean r1 = androidx.core.view.WindowInsetsCompat.Impl20.sVisibleRectReflectionFetched
                if (r1 != 0) goto Lf
                loadReflectionField()
            Lf:
                java.lang.reflect.Method r1 = androidx.core.view.WindowInsetsCompat.Impl20.sGetViewRootImplMethod
                r2 = 0
                if (r1 == 0) goto L64
                java.lang.Class<?> r1 = androidx.core.view.WindowInsetsCompat.Impl20.sAttachInfoClass
                if (r1 == 0) goto L64
                java.lang.reflect.Field r1 = androidx.core.view.WindowInsetsCompat.Impl20.sVisibleInsetsField
                if (r1 != 0) goto L1d
                goto L64
            L1d:
                java.lang.reflect.Method r1 = androidx.core.view.WindowInsetsCompat.Impl20.sGetViewRootImplMethod     // Catch: java.lang.ReflectiveOperationException -> L48
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.ReflectiveOperationException -> L48
                java.lang.Object r1 = r1.invoke(r6, r3)     // Catch: java.lang.ReflectiveOperationException -> L48
                if (r1 != 0) goto L33
                java.lang.String r3 = "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden"
                java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch: java.lang.ReflectiveOperationException -> L48
                r4.<init>()     // Catch: java.lang.ReflectiveOperationException -> L48
                android.util.Log.w(r0, r3, r4)     // Catch: java.lang.ReflectiveOperationException -> L48
                return r2
            L33:
                java.lang.reflect.Field r3 = androidx.core.view.WindowInsetsCompat.Impl20.sAttachInfoField     // Catch: java.lang.ReflectiveOperationException -> L48
                java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.ReflectiveOperationException -> L48
                java.lang.reflect.Field r4 = androidx.core.view.WindowInsetsCompat.Impl20.sVisibleInsetsField     // Catch: java.lang.ReflectiveOperationException -> L48
                java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.ReflectiveOperationException -> L48
                android.graphics.Rect r4 = (android.graphics.Rect) r4     // Catch: java.lang.ReflectiveOperationException -> L48
                if (r4 == 0) goto L47
                androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.of(r4)     // Catch: java.lang.ReflectiveOperationException -> L48
            L47:
                return r2
            L48:
                r1 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Failed to get visible insets. (Reflection error). "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = r1.getMessage()
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                android.util.Log.e(r0, r3, r1)
                return r2
            L64:
                return r2
            L65:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead."
                r0.<init>(r1)
                throw r0
        }

        private static void loadReflectionField() {
                r0 = 1
                java.lang.Class<android.view.View> r1 = android.view.View.class
                java.lang.String r2 = "getViewRootImpl"
                r3 = 0
                java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.ReflectiveOperationException -> L39
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.ReflectiveOperationException -> L39
                androidx.core.view.WindowInsetsCompat.Impl20.sGetViewRootImplMethod = r1     // Catch: java.lang.ReflectiveOperationException -> L39
                java.lang.String r1 = "android.view.View$AttachInfo"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ReflectiveOperationException -> L39
                androidx.core.view.WindowInsetsCompat.Impl20.sAttachInfoClass = r1     // Catch: java.lang.ReflectiveOperationException -> L39
                java.lang.Class<?> r1 = androidx.core.view.WindowInsetsCompat.Impl20.sAttachInfoClass     // Catch: java.lang.ReflectiveOperationException -> L39
                java.lang.String r2 = "mVisibleInsets"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L39
                androidx.core.view.WindowInsetsCompat.Impl20.sVisibleInsetsField = r1     // Catch: java.lang.ReflectiveOperationException -> L39
                java.lang.String r1 = "android.view.ViewRootImpl"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ReflectiveOperationException -> L39
                java.lang.String r2 = "mAttachInfo"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L39
                androidx.core.view.WindowInsetsCompat.Impl20.sAttachInfoField = r2     // Catch: java.lang.ReflectiveOperationException -> L39
                java.lang.reflect.Field r2 = androidx.core.view.WindowInsetsCompat.Impl20.sVisibleInsetsField     // Catch: java.lang.ReflectiveOperationException -> L39
                r2.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L39
                java.lang.reflect.Field r2 = androidx.core.view.WindowInsetsCompat.Impl20.sAttachInfoField     // Catch: java.lang.ReflectiveOperationException -> L39
                r2.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L39
                goto L56
            L39:
                r1 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to get visible insets. (Reflection error). "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = r1.getMessage()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "WindowInsetsCompat"
                android.util.Log.e(r3, r2, r1)
            L56:
                androidx.core.view.WindowInsetsCompat.Impl20.sVisibleRectReflectionFetched = r0
                return
        }

        static boolean systemBarVisibilityEquals(int r2, int r3) {
                r0 = r2 & 6
                r1 = r3 & 6
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void copyRootViewBounds(android.view.View r2) {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.getVisibleInsets(r2)
                if (r0 != 0) goto L8
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
            L8:
                r1.setRootViewData(r0)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void copyWindowDataInto(androidx.core.view.WindowInsetsCompat r2) {
                r1 = this;
                androidx.core.view.WindowInsetsCompat r0 = r1.mRootWindowInsets
                r2.setRootWindowInsets(r0)
                androidx.core.graphics.Insets r0 = r1.mRootViewVisibleInsets
                r2.setRootViewData(r0)
                int r0 = r1.mSystemUiVisibility
                r2.setSystemUiVisibility(r0)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                boolean r0 = super.equals(r5)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                r0 = r5
                androidx.core.view.WindowInsetsCompat$Impl20 r0 = (androidx.core.view.WindowInsetsCompat.Impl20) r0
                androidx.core.graphics.Insets r2 = r4.mRootViewVisibleInsets
                androidx.core.graphics.Insets r3 = r0.mRootViewVisibleInsets
                boolean r2 = java.util.Objects.equals(r2, r3)
                if (r2 == 0) goto L21
                int r2 = r4.mSystemUiVisibility
                int r3 = r0.mSystemUiVisibility
                boolean r2 = systemBarVisibilityEquals(r2, r3)
                if (r2 == 0) goto L21
                r1 = 1
                goto L22
            L21:
            L22:
                return r1
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public androidx.core.graphics.Insets getInsets(int r2) {
                r1 = this;
                r0 = 0
                androidx.core.graphics.Insets r0 = r1.getInsets(r2, r0)
                return r0
        }

        protected androidx.core.graphics.Insets getInsetsForType(int r8, boolean r9) {
                r7 = this;
                r0 = 0
                r1 = 0
                switch(r8) {
                    case 1: goto Ldf;
                    case 2: goto L8b;
                    case 8: goto L41;
                    case 16: goto L3c;
                    case 32: goto L37;
                    case 64: goto L32;
                    case 128: goto L8;
                    default: goto L5;
                }
            L5:
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                return r0
            L8:
                androidx.core.view.WindowInsetsCompat r0 = r7.mRootWindowInsets
                if (r0 == 0) goto L13
                androidx.core.view.WindowInsetsCompat r0 = r7.mRootWindowInsets
                androidx.core.view.DisplayCutoutCompat r0 = r0.getDisplayCutout()
                goto L17
            L13:
                androidx.core.view.DisplayCutoutCompat r0 = r7.getDisplayCutout()
            L17:
                if (r0 == 0) goto L2f
                int r1 = r0.getSafeInsetLeft()
                int r2 = r0.getSafeInsetTop()
                int r3 = r0.getSafeInsetRight()
                int r4 = r0.getSafeInsetBottom()
                androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.of(r1, r2, r3, r4)
                return r1
            L2f:
                androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.NONE
                return r1
            L32:
                androidx.core.graphics.Insets r0 = r7.getTappableElementInsets()
                return r0
            L37:
                androidx.core.graphics.Insets r0 = r7.getMandatorySystemGestureInsets()
                return r0
            L3c:
                androidx.core.graphics.Insets r0 = r7.getSystemGestureInsets()
                return r0
            L41:
                androidx.core.graphics.Insets[] r2 = r7.mOverriddenInsets
                if (r2 == 0) goto L50
                androidx.core.graphics.Insets[] r0 = r7.mOverriddenInsets
                r2 = 8
                int r2 = androidx.core.view.WindowInsetsCompat.Type.indexOf(r2)
                r0 = r0[r2]
                goto L51
            L50:
            L51:
                if (r0 == 0) goto L54
                return r0
            L54:
                androidx.core.graphics.Insets r2 = r7.getSystemWindowInsets()
                androidx.core.graphics.Insets r3 = r7.getRootStableInsets()
                int r4 = r2.bottom
                int r5 = r3.bottom
                if (r4 <= r5) goto L69
                int r4 = r2.bottom
                androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.of(r1, r1, r1, r4)
                return r1
            L69:
                androidx.core.graphics.Insets r4 = r7.mRootViewVisibleInsets
                if (r4 == 0) goto L88
                androidx.core.graphics.Insets r4 = r7.mRootViewVisibleInsets
                androidx.core.graphics.Insets r5 = androidx.core.graphics.Insets.NONE
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L88
                androidx.core.graphics.Insets r4 = r7.mRootViewVisibleInsets
                int r4 = r4.bottom
                int r5 = r3.bottom
                if (r4 <= r5) goto L88
                androidx.core.graphics.Insets r4 = r7.mRootViewVisibleInsets
                int r4 = r4.bottom
                androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.of(r1, r1, r1, r4)
                return r1
            L88:
                androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.NONE
                return r1
            L8b:
                if (r9 == 0) goto Lb2
                androidx.core.graphics.Insets r0 = r7.getRootStableInsets()
                androidx.core.graphics.Insets r2 = r7.getStableInsets()
                int r3 = r0.left
                int r4 = r2.left
                int r3 = java.lang.Math.max(r3, r4)
                int r4 = r0.right
                int r5 = r2.right
                int r4 = java.lang.Math.max(r4, r5)
                int r5 = r0.bottom
                int r6 = r2.bottom
                int r5 = java.lang.Math.max(r5, r6)
                androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.of(r3, r1, r4, r5)
                return r1
            Lb2:
                int r2 = r7.mSystemUiVisibility
                r2 = r2 & 2
                if (r2 == 0) goto Lbb
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                return r0
            Lbb:
                androidx.core.graphics.Insets r2 = r7.getSystemWindowInsets()
                androidx.core.view.WindowInsetsCompat r3 = r7.mRootWindowInsets
                if (r3 == 0) goto Lca
                androidx.core.view.WindowInsetsCompat r0 = r7.mRootWindowInsets
                androidx.core.graphics.Insets r0 = r0.getStableInsets()
                goto Lcb
            Lca:
            Lcb:
                int r3 = r2.bottom
                if (r0 == 0) goto Ld6
                int r4 = r0.bottom
                int r3 = java.lang.Math.min(r3, r4)
            Ld6:
                int r4 = r2.left
                int r5 = r2.right
                androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.of(r4, r1, r5, r3)
                return r1
            Ldf:
                if (r9 == 0) goto Lf6
                androidx.core.graphics.Insets r0 = r7.getRootStableInsets()
                int r2 = r0.top
                androidx.core.graphics.Insets r3 = r7.getSystemWindowInsets()
                int r3 = r3.top
                int r2 = java.lang.Math.max(r2, r3)
                androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.of(r1, r2, r1, r1)
                return r1
            Lf6:
                int r0 = r7.mSystemUiVisibility
                r0 = r0 & 4
                if (r0 == 0) goto Lff
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                return r0
            Lff:
                androidx.core.graphics.Insets r0 = r7.getSystemWindowInsets()
                int r0 = r0.top
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.of(r1, r0, r1, r1)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public androidx.core.graphics.Insets getInsetsIgnoringVisibility(int r2) {
                r1 = this;
                r0 = 1
                androidx.core.graphics.Insets r0 = r1.getInsets(r2, r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        final androidx.core.graphics.Insets getSystemWindowInsets() {
                r4 = this;
                androidx.core.graphics.Insets r0 = r4.mSystemWindowInsets
                if (r0 != 0) goto L22
                android.view.WindowInsets r0 = r4.mPlatformInsets
                int r0 = r0.getSystemWindowInsetLeft()
                android.view.WindowInsets r1 = r4.mPlatformInsets
                int r1 = r1.getSystemWindowInsetTop()
                android.view.WindowInsets r2 = r4.mPlatformInsets
                int r2 = r2.getSystemWindowInsetRight()
                android.view.WindowInsets r3 = r4.mPlatformInsets
                int r3 = r3.getSystemWindowInsetBottom()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.of(r0, r1, r2, r3)
                r4.mSystemWindowInsets = r0
            L22:
                androidx.core.graphics.Insets r0 = r4.mSystemWindowInsets
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.WindowInsetsCompat inset(int r3, int r4, int r5, int r6) {
                r2 = this;
                androidx.core.view.WindowInsetsCompat$Builder r0 = new androidx.core.view.WindowInsetsCompat$Builder
                android.view.WindowInsets r1 = r2.mPlatformInsets
                androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r1)
                r0.<init>(r1)
                androidx.core.graphics.Insets r1 = r2.getSystemWindowInsets()
                androidx.core.graphics.Insets r1 = androidx.core.view.WindowInsetsCompat.insetInsets(r1, r3, r4, r5, r6)
                r0.setSystemWindowInsets(r1)
                androidx.core.graphics.Insets r1 = r2.getStableInsets()
                androidx.core.graphics.Insets r1 = androidx.core.view.WindowInsetsCompat.insetInsets(r1, r3, r4, r5, r6)
                r0.setStableInsets(r1)
                androidx.core.view.WindowInsetsCompat r1 = r0.build()
                return r1
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isRound() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                boolean r0 = r0.isRound()
                return r0
        }

        protected boolean isTypeVisible(int r4) {
                r3 = this;
                r0 = 1
                r1 = 0
                switch(r4) {
                    case 1: goto L7;
                    case 2: goto L7;
                    case 4: goto L6;
                    case 8: goto L7;
                    case 128: goto L7;
                    default: goto L5;
                }
            L5:
                return r0
            L6:
                return r1
            L7:
                androidx.core.graphics.Insets r1 = r3.getInsetsForType(r4, r1)
                androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.NONE
                boolean r1 = r1.equals(r2)
                r0 = r0 ^ r1
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isVisible(int r3) {
                r2 = this;
                r0 = 1
            L1:
                r1 = 512(0x200, float:7.17E-43)
                if (r0 > r1) goto L15
                r1 = r3 & r0
                if (r1 != 0) goto La
                goto L12
            La:
                boolean r1 = r2.isTypeVisible(r0)
                if (r1 != 0) goto L12
                r1 = 0
                return r1
            L12:
                int r0 = r0 << 1
                goto L1
            L15:
                r0 = 1
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setOverriddenInsets(androidx.core.graphics.Insets[] r1) {
                r0 = this;
                r0.mOverriddenInsets = r1
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setRootViewData(androidx.core.graphics.Insets r1) {
                r0 = this;
                r0.mRootViewVisibleInsets = r1
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setRootWindowInsets(androidx.core.view.WindowInsetsCompat r1) {
                r0 = this;
                r0.mRootWindowInsets = r1
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setSystemUiVisibility(int r1) {
                r0 = this;
                r0.mSystemUiVisibility = r1
                return
        }
    }

    private static class Impl21 extends androidx.core.view.WindowInsetsCompat.Impl20 {
        private androidx.core.graphics.Insets mStableInsets;

        Impl21(androidx.core.view.WindowInsetsCompat r2, android.view.WindowInsets r3) {
                r1 = this;
                r1.<init>(r2, r3)
                r0 = 0
                r1.mStableInsets = r0
                return
        }

        Impl21(androidx.core.view.WindowInsetsCompat r2, androidx.core.view.WindowInsetsCompat.Impl21 r3) {
                r1 = this;
                r1.<init>(r2, r3)
                r0 = 0
                r1.mStableInsets = r0
                androidx.core.graphics.Insets r0 = r3.mStableInsets
                r1.mStableInsets = r0
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.WindowInsetsCompat consumeStableInsets() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.view.WindowInsets r0 = r0.consumeStableInsets()
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.WindowInsetsCompat consumeSystemWindowInsets() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.view.WindowInsets r0 = r0.consumeSystemWindowInsets()
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        final androidx.core.graphics.Insets getStableInsets() {
                r4 = this;
                androidx.core.graphics.Insets r0 = r4.mStableInsets
                if (r0 != 0) goto L22
                android.view.WindowInsets r0 = r4.mPlatformInsets
                int r0 = r0.getStableInsetLeft()
                android.view.WindowInsets r1 = r4.mPlatformInsets
                int r1 = r1.getStableInsetTop()
                android.view.WindowInsets r2 = r4.mPlatformInsets
                int r2 = r2.getStableInsetRight()
                android.view.WindowInsets r3 = r4.mPlatformInsets
                int r3 = r3.getStableInsetBottom()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.of(r0, r1, r2, r3)
                r4.mStableInsets = r0
            L22:
                androidx.core.graphics.Insets r0 = r4.mStableInsets
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isConsumed() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                boolean r0 = r0.isConsumed()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(androidx.core.graphics.Insets r1) {
                r0 = this;
                r0.mStableInsets = r1
                return
        }
    }

    private static class Impl28 extends androidx.core.view.WindowInsetsCompat.Impl21 {
        Impl28(androidx.core.view.WindowInsetsCompat r1, android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        Impl28(androidx.core.view.WindowInsetsCompat r1, androidx.core.view.WindowInsetsCompat.Impl28 r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.WindowInsetsCompat consumeDisplayCutout() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.view.WindowInsets r0 = r0.consumeDisplayCutout()
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof androidx.core.view.WindowInsetsCompat.Impl28
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                r1 = r6
                androidx.core.view.WindowInsetsCompat$Impl28 r1 = (androidx.core.view.WindowInsetsCompat.Impl28) r1
                android.view.WindowInsets r3 = r5.mPlatformInsets
                android.view.WindowInsets r4 = r1.mPlatformInsets
                boolean r3 = java.util.Objects.equals(r3, r4)
                if (r3 == 0) goto L2c
                androidx.core.graphics.Insets r3 = r5.mRootViewVisibleInsets
                androidx.core.graphics.Insets r4 = r1.mRootViewVisibleInsets
                boolean r3 = java.util.Objects.equals(r3, r4)
                if (r3 == 0) goto L2c
                int r3 = r5.mSystemUiVisibility
                int r4 = r1.mSystemUiVisibility
                boolean r3 = systemBarVisibilityEquals(r3, r4)
                if (r3 == 0) goto L2c
                goto L2d
            L2c:
                r0 = r2
            L2d:
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.DisplayCutoutCompat getDisplayCutout() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.view.DisplayCutout r0 = r0.getDisplayCutout()
                androidx.core.view.DisplayCutoutCompat r0 = androidx.core.view.DisplayCutoutCompat.wrap(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public int hashCode() {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                int r0 = r0.hashCode()
                return r0
        }
    }

    private static class Impl29 extends androidx.core.view.WindowInsetsCompat.Impl28 {
        private androidx.core.graphics.Insets mMandatorySystemGestureInsets;
        private androidx.core.graphics.Insets mSystemGestureInsets;
        private androidx.core.graphics.Insets mTappableElementInsets;

        Impl29(androidx.core.view.WindowInsetsCompat r2, android.view.WindowInsets r3) {
                r1 = this;
                r1.<init>(r2, r3)
                r0 = 0
                r1.mSystemGestureInsets = r0
                r1.mMandatorySystemGestureInsets = r0
                r1.mTappableElementInsets = r0
                return
        }

        Impl29(androidx.core.view.WindowInsetsCompat r2, androidx.core.view.WindowInsetsCompat.Impl29 r3) {
                r1 = this;
                r1.<init>(r2, r3)
                r0 = 0
                r1.mSystemGestureInsets = r0
                r1.mMandatorySystemGestureInsets = r0
                r1.mTappableElementInsets = r0
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.graphics.Insets getMandatorySystemGestureInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.mMandatorySystemGestureInsets
                if (r0 != 0) goto L10
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.graphics.Insets r0 = r0.getMandatorySystemGestureInsets()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                r1.mMandatorySystemGestureInsets = r0
            L10:
                androidx.core.graphics.Insets r0 = r1.mMandatorySystemGestureInsets
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.graphics.Insets getSystemGestureInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.mSystemGestureInsets
                if (r0 != 0) goto L10
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.graphics.Insets r0 = r0.getSystemGestureInsets()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                r1.mSystemGestureInsets = r0
            L10:
                androidx.core.graphics.Insets r0 = r1.mSystemGestureInsets
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.graphics.Insets getTappableElementInsets() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.mTappableElementInsets
                if (r0 != 0) goto L10
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.graphics.Insets r0 = r0.getTappableElementInsets()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                r1.mTappableElementInsets = r0
            L10:
                androidx.core.graphics.Insets r0 = r1.mTappableElementInsets
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.WindowInsetsCompat inset(int r2, int r3, int r4, int r5) {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.view.WindowInsets r0 = r0.inset(r2, r3, r4, r5)
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl21, androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(androidx.core.graphics.Insets r1) {
                r0 = this;
                return
        }
    }

    private static class Impl30 extends androidx.core.view.WindowInsetsCompat.Impl29 {
        static final androidx.core.view.WindowInsetsCompat CONSUMED = null;

        static {
                android.view.WindowInsets r0 = android.view.WindowInsets.CONSUMED
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                androidx.core.view.WindowInsetsCompat.Impl30.CONSUMED = r0
                return
        }

        Impl30(androidx.core.view.WindowInsetsCompat r1, android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        Impl30(androidx.core.view.WindowInsetsCompat r1, androidx.core.view.WindowInsetsCompat.Impl30 r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        final void copyRootViewBounds(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public androidx.core.graphics.Insets getInsets(int r3) {
                r2 = this;
                android.view.WindowInsets r0 = r2.mPlatformInsets
                int r1 = androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(r3)
                android.graphics.Insets r0 = r0.getInsets(r1)
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public androidx.core.graphics.Insets getInsetsIgnoringVisibility(int r3) {
                r2 = this;
                android.view.WindowInsets r0 = r2.mPlatformInsets
                int r1 = androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(r3)
                android.graphics.Insets r0 = r0.getInsetsIgnoringVisibility(r1)
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int r3) {
                r2 = this;
                android.view.WindowInsets r0 = r2.mPlatformInsets
                int r1 = androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(r3)
                boolean r0 = r0.isVisible(r1)
                return r0
        }
    }

    private static class Impl31 extends androidx.core.view.WindowInsetsCompat.Impl30 {
        Impl31(androidx.core.view.WindowInsetsCompat r1, android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        Impl31(androidx.core.view.WindowInsetsCompat r1, androidx.core.view.WindowInsetsCompat.Impl31 r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        android.graphics.Rect getPrivacyIndicatorBounds() {
                r2 = this;
                android.view.WindowInsets r0 = r2.mPlatformInsets
                android.graphics.Rect r0 = r0.getPrivacyIndicatorBounds()
                if (r0 == 0) goto Le
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>(r0)
                goto Lf
            Le:
                r1 = 0
            Lf:
                return r1
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.RoundedCornerCompat getRoundedCorner(int r2) {
                r1 = this;
                android.view.WindowInsets r0 = r1.mPlatformInsets
                android.view.RoundedCorner r0 = r0.getRoundedCorner(r2)
                androidx.core.view.RoundedCornerCompat r0 = androidx.core.view.RoundedCornerCompat.toRoundedCornerCompat(r0)
                return r0
        }
    }

    private static class Impl34 extends androidx.core.view.WindowInsetsCompat.Impl31 {
        static final androidx.core.view.WindowInsetsCompat CONSUMED = null;

        static {
                android.view.WindowInsets r0 = android.view.WindowInsets.CONSUMED
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                androidx.core.view.WindowInsetsCompat.Impl34.CONSUMED = r0
                return
        }

        Impl34(androidx.core.view.WindowInsetsCompat r1, android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        Impl34(androidx.core.view.WindowInsetsCompat r1, androidx.core.view.WindowInsetsCompat.Impl34 r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public androidx.core.graphics.Insets getInsets(int r3) {
                r2 = this;
                android.view.WindowInsets r0 = r2.mPlatformInsets
                int r1 = androidx.core.view.WindowInsetsCompat.TypeImpl34.toPlatformType(r3)
                android.graphics.Insets r0 = r0.getInsets(r1)
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public androidx.core.graphics.Insets getInsetsIgnoringVisibility(int r3) {
                r2 = this;
                android.view.WindowInsets r0 = r2.mPlatformInsets
                int r1 = androidx.core.view.WindowInsetsCompat.TypeImpl34.toPlatformType(r3)
                android.graphics.Insets r0 = r0.getInsetsIgnoringVisibility(r1)
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                return r0
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int r3) {
                r2 = this;
                android.view.WindowInsets r0 = r2.mPlatformInsets
                int r1 = androidx.core.view.WindowInsetsCompat.TypeImpl34.toPlatformType(r3)
                boolean r0 = r0.isVisible(r1)
                return r0
        }
    }

    public static final class Side {
        public static final int BOTTOM = 8;
        public static final int LEFT = 1;
        public static final int RIGHT = 4;
        public static final int TOP = 2;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface InsetsSide {
        }

        private Side() {
                r0 = this;
                r0.<init>()
                return
        }

        public static int all() {
                r0 = 15
                return r0
        }
    }

    public static final class Type {
        static final int CAPTION_BAR = 4;
        static final int DISPLAY_CUTOUT = 128;
        static final int FIRST = 1;
        static final int IME = 8;
        static final int LAST = 512;
        static final int MANDATORY_SYSTEM_GESTURES = 32;
        static final int NAVIGATION_BARS = 2;
        static final int SIZE = 10;
        static final int STATUS_BARS = 1;
        static final int SYSTEM_GESTURES = 16;
        static final int SYSTEM_OVERLAYS = 512;
        static final int TAPPABLE_ELEMENT = 64;
        static final int WINDOW_DECOR = 256;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface InsetsType {
        }

        private Type() {
                r0 = this;
                r0.<init>()
                return
        }

        static int all() {
                r0 = -1
                return r0
        }

        public static int captionBar() {
                r0 = 4
                return r0
        }

        public static int displayCutout() {
                r0 = 128(0x80, float:1.8E-43)
                return r0
        }

        public static int ime() {
                r0 = 8
                return r0
        }

        static int indexOf(int r3) {
                switch(r3) {
                    case 1: goto L30;
                    case 2: goto L2e;
                    case 4: goto L2c;
                    case 8: goto L2a;
                    case 16: goto L28;
                    case 32: goto L26;
                    case 64: goto L24;
                    case 128: goto L22;
                    case 256: goto L1f;
                    case 512: goto L1c;
                    default: goto L3;
                }
            L3:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "type needs to be >= FIRST and <= LAST, type="
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L1c:
                r0 = 9
                return r0
            L1f:
                r0 = 8
                return r0
            L22:
                r0 = 7
                return r0
            L24:
                r0 = 6
                return r0
            L26:
                r0 = 5
                return r0
            L28:
                r0 = 4
                return r0
            L2a:
                r0 = 3
                return r0
            L2c:
                r0 = 2
                return r0
            L2e:
                r0 = 1
                return r0
            L30:
                r0 = 0
                return r0
        }

        public static int mandatorySystemGestures() {
                r0 = 32
                return r0
        }

        public static int navigationBars() {
                r0 = 2
                return r0
        }

        public static int statusBars() {
                r0 = 1
                return r0
        }

        public static int systemBars() {
                r0 = 519(0x207, float:7.27E-43)
                return r0
        }

        public static int systemGestures() {
                r0 = 16
                return r0
        }

        public static int systemOverlays() {
                r0 = 512(0x200, float:7.17E-43)
                return r0
        }

        public static int tappableElement() {
                r0 = 64
                return r0
        }
    }

    private static final class TypeImpl30 {
        private TypeImpl30() {
                r0 = this;
                r0.<init>()
                return
        }

        static int toPlatformType(int r3) {
                r0 = 0
                r1 = 1
            L2:
                r2 = 512(0x200, float:7.17E-43)
                if (r1 > r2) goto L41
                r2 = r3 & r1
                if (r2 == 0) goto L3e
                switch(r1) {
                    case 1: goto L38;
                    case 2: goto L32;
                    case 4: goto L2c;
                    case 8: goto L26;
                    case 16: goto L20;
                    case 32: goto L1a;
                    case 64: goto L14;
                    case 128: goto Le;
                    default: goto Ld;
                }
            Ld:
                goto L3e
            Le:
                int r2 = android.view.WindowInsets.Type.displayCutout()
                r0 = r0 | r2
                goto L3e
            L14:
                int r2 = android.view.WindowInsets.Type.tappableElement()
                r0 = r0 | r2
                goto L3e
            L1a:
                int r2 = android.view.WindowInsets.Type.mandatorySystemGestures()
                r0 = r0 | r2
                goto L3e
            L20:
                int r2 = android.view.WindowInsets.Type.systemGestures()
                r0 = r0 | r2
                goto L3e
            L26:
                int r2 = android.view.WindowInsets.Type.ime()
                r0 = r0 | r2
                goto L3e
            L2c:
                int r2 = android.view.WindowInsets.Type.captionBar()
                r0 = r0 | r2
                goto L3e
            L32:
                int r2 = android.view.WindowInsets.Type.navigationBars()
                r0 = r0 | r2
                goto L3e
            L38:
                int r2 = android.view.WindowInsets.Type.statusBars()
                r0 = r0 | r2
            L3e:
                int r1 = r1 << 1
                goto L2
            L41:
                return r0
        }
    }

    private static final class TypeImpl34 {
        private TypeImpl34() {
                r0 = this;
                r0.<init>()
                return
        }

        static int toPlatformType(int r3) {
                r0 = 0
                r1 = 1
            L2:
                r2 = 512(0x200, float:7.17E-43)
                if (r1 > r2) goto L47
                r2 = r3 & r1
                if (r2 == 0) goto L44
                switch(r1) {
                    case 1: goto L3e;
                    case 2: goto L38;
                    case 4: goto L32;
                    case 8: goto L2c;
                    case 16: goto L26;
                    case 32: goto L20;
                    case 64: goto L1a;
                    case 128: goto L14;
                    case 512: goto Le;
                    default: goto Ld;
                }
            Ld:
                goto L44
            Le:
                int r2 = android.view.WindowInsets.Type.systemOverlays()
                r0 = r0 | r2
                goto L44
            L14:
                int r2 = android.view.WindowInsets.Type.displayCutout()
                r0 = r0 | r2
                goto L44
            L1a:
                int r2 = android.view.WindowInsets.Type.tappableElement()
                r0 = r0 | r2
                goto L44
            L20:
                int r2 = android.view.WindowInsets.Type.mandatorySystemGestures()
                r0 = r0 | r2
                goto L44
            L26:
                int r2 = android.view.WindowInsets.Type.systemGestures()
                r0 = r0 | r2
                goto L44
            L2c:
                int r2 = android.view.WindowInsets.Type.ime()
                r0 = r0 | r2
                goto L44
            L32:
                int r2 = android.view.WindowInsets.Type.captionBar()
                r0 = r0 | r2
                goto L44
            L38:
                int r2 = android.view.WindowInsets.Type.navigationBars()
                r0 = r0 | r2
                goto L44
            L3e:
                int r2 = android.view.WindowInsets.Type.statusBars()
                r0 = r0 | r2
            L44:
                int r1 = r1 << 1
                goto L2
            L47:
                return r0
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.Impl34.CONSUMED
            androidx.core.view.WindowInsetsCompat.CONSUMED = r0
            goto L1a
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L16
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.Impl30.CONSUMED
            androidx.core.view.WindowInsetsCompat.CONSUMED = r0
            goto L1a
        L16:
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.Impl.CONSUMED
            androidx.core.view.WindowInsetsCompat.CONSUMED = r0
        L1a:
            return
    }

    private WindowInsetsCompat(android.view.WindowInsets r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L11
            androidx.core.view.WindowInsetsCompat$Impl34 r0 = new androidx.core.view.WindowInsetsCompat$Impl34
            r0.<init>(r2, r3)
            r2.mImpl = r0
            goto L51
        L11:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L1f
            androidx.core.view.WindowInsetsCompat$Impl31 r0 = new androidx.core.view.WindowInsetsCompat$Impl31
            r0.<init>(r2, r3)
            r2.mImpl = r0
            goto L51
        L1f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L2d
            androidx.core.view.WindowInsetsCompat$Impl30 r0 = new androidx.core.view.WindowInsetsCompat$Impl30
            r0.<init>(r2, r3)
            r2.mImpl = r0
            goto L51
        L2d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L3b
            androidx.core.view.WindowInsetsCompat$Impl29 r0 = new androidx.core.view.WindowInsetsCompat$Impl29
            r0.<init>(r2, r3)
            r2.mImpl = r0
            goto L51
        L3b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L49
            androidx.core.view.WindowInsetsCompat$Impl28 r0 = new androidx.core.view.WindowInsetsCompat$Impl28
            r0.<init>(r2, r3)
            r2.mImpl = r0
            goto L51
        L49:
            androidx.core.view.WindowInsetsCompat$Impl21 r0 = new androidx.core.view.WindowInsetsCompat$Impl21
            r0.<init>(r2, r3)
            r2.mImpl = r0
        L51:
            return
    }

    public WindowInsetsCompat(androidx.core.view.WindowInsetsCompat r4) {
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L9a
            androidx.core.view.WindowInsetsCompat$Impl r0 = r4.mImpl
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r1 < r2) goto L1d
            boolean r1 = r0 instanceof androidx.core.view.WindowInsetsCompat.Impl34
            if (r1 == 0) goto L1d
            androidx.core.view.WindowInsetsCompat$Impl34 r1 = new androidx.core.view.WindowInsetsCompat$Impl34
            r2 = r0
            androidx.core.view.WindowInsetsCompat$Impl34 r2 = (androidx.core.view.WindowInsetsCompat.Impl34) r2
            r1.<init>(r3, r2)
            r3.mImpl = r1
            goto L96
        L1d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 < r2) goto L32
            boolean r1 = r0 instanceof androidx.core.view.WindowInsetsCompat.Impl31
            if (r1 == 0) goto L32
            androidx.core.view.WindowInsetsCompat$Impl31 r1 = new androidx.core.view.WindowInsetsCompat$Impl31
            r2 = r0
            androidx.core.view.WindowInsetsCompat$Impl31 r2 = (androidx.core.view.WindowInsetsCompat.Impl31) r2
            r1.<init>(r3, r2)
            r3.mImpl = r1
            goto L96
        L32:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L47
            boolean r1 = r0 instanceof androidx.core.view.WindowInsetsCompat.Impl30
            if (r1 == 0) goto L47
            androidx.core.view.WindowInsetsCompat$Impl30 r1 = new androidx.core.view.WindowInsetsCompat$Impl30
            r2 = r0
            androidx.core.view.WindowInsetsCompat$Impl30 r2 = (androidx.core.view.WindowInsetsCompat.Impl30) r2
            r1.<init>(r3, r2)
            r3.mImpl = r1
            goto L96
        L47:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L5c
            boolean r1 = r0 instanceof androidx.core.view.WindowInsetsCompat.Impl29
            if (r1 == 0) goto L5c
            androidx.core.view.WindowInsetsCompat$Impl29 r1 = new androidx.core.view.WindowInsetsCompat$Impl29
            r2 = r0
            androidx.core.view.WindowInsetsCompat$Impl29 r2 = (androidx.core.view.WindowInsetsCompat.Impl29) r2
            r1.<init>(r3, r2)
            r3.mImpl = r1
            goto L96
        L5c:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L71
            boolean r1 = r0 instanceof androidx.core.view.WindowInsetsCompat.Impl28
            if (r1 == 0) goto L71
            androidx.core.view.WindowInsetsCompat$Impl28 r1 = new androidx.core.view.WindowInsetsCompat$Impl28
            r2 = r0
            androidx.core.view.WindowInsetsCompat$Impl28 r2 = (androidx.core.view.WindowInsetsCompat.Impl28) r2
            r1.<init>(r3, r2)
            r3.mImpl = r1
            goto L96
        L71:
            boolean r1 = r0 instanceof androidx.core.view.WindowInsetsCompat.Impl21
            if (r1 == 0) goto L80
            androidx.core.view.WindowInsetsCompat$Impl21 r1 = new androidx.core.view.WindowInsetsCompat$Impl21
            r2 = r0
            androidx.core.view.WindowInsetsCompat$Impl21 r2 = (androidx.core.view.WindowInsetsCompat.Impl21) r2
            r1.<init>(r3, r2)
            r3.mImpl = r1
            goto L96
        L80:
            boolean r1 = r0 instanceof androidx.core.view.WindowInsetsCompat.Impl20
            if (r1 == 0) goto L8f
            androidx.core.view.WindowInsetsCompat$Impl20 r1 = new androidx.core.view.WindowInsetsCompat$Impl20
            r2 = r0
            androidx.core.view.WindowInsetsCompat$Impl20 r2 = (androidx.core.view.WindowInsetsCompat.Impl20) r2
            r1.<init>(r3, r2)
            r3.mImpl = r1
            goto L96
        L8f:
            androidx.core.view.WindowInsetsCompat$Impl r1 = new androidx.core.view.WindowInsetsCompat$Impl
            r1.<init>(r3)
            r3.mImpl = r1
        L96:
            r0.copyWindowDataInto(r3)
            goto La1
        L9a:
            androidx.core.view.WindowInsetsCompat$Impl r0 = new androidx.core.view.WindowInsetsCompat$Impl
            r0.<init>(r3)
            r3.mImpl = r0
        La1:
            return
    }

    static androidx.core.graphics.Insets insetInsets(androidx.core.graphics.Insets r5, int r6, int r7, int r8, int r9) {
            int r0 = r5.left
            int r0 = r0 - r6
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r5.top
            int r2 = r2 - r7
            int r2 = java.lang.Math.max(r1, r2)
            int r3 = r5.right
            int r3 = r3 - r8
            int r3 = java.lang.Math.max(r1, r3)
            int r4 = r5.bottom
            int r4 = r4 - r9
            int r1 = java.lang.Math.max(r1, r4)
            if (r0 != r6) goto L26
            if (r2 != r7) goto L26
            if (r3 != r8) goto L26
            if (r1 != r9) goto L26
            return r5
        L26:
            androidx.core.graphics.Insets r4 = androidx.core.graphics.Insets.of(r0, r2, r3, r1)
            return r4
    }

    public static androidx.core.view.WindowInsetsCompat toWindowInsetsCompat(android.view.WindowInsets r1) {
            r0 = 0
            androidx.core.view.WindowInsetsCompat r0 = toWindowInsetsCompat(r1, r0)
            return r0
    }

    public static androidx.core.view.WindowInsetsCompat toWindowInsetsCompat(android.view.WindowInsets r2, android.view.View r3) {
            androidx.core.view.WindowInsetsCompat r0 = new androidx.core.view.WindowInsetsCompat
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r2)
            android.view.WindowInsets r1 = (android.view.WindowInsets) r1
            r0.<init>(r1)
            if (r3 == 0) goto L28
            boolean r1 = r3.isAttachedToWindow()
            if (r1 == 0) goto L28
            androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.ViewCompat.getRootWindowInsets(r3)
            r0.setRootWindowInsets(r1)
            android.view.View r1 = r3.getRootView()
            r0.copyRootViewBounds(r1)
            int r1 = r3.getWindowSystemUiVisibility()
            r0.setSystemUiVisibility(r1)
        L28:
            return r0
    }

    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat consumeDisplayCutout() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.view.WindowInsetsCompat r0 = r0.consumeDisplayCutout()
            return r0
    }

    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat consumeStableInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.view.WindowInsetsCompat r0 = r0.consumeStableInsets()
            return r0
    }

    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat consumeSystemWindowInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.view.WindowInsetsCompat r0 = r0.consumeSystemWindowInsets()
            return r0
    }

    void copyRootViewBounds(android.view.View r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            r0.copyRootViewBounds(r2)
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r0 = 1
            return r0
        L4:
            boolean r0 = r4 instanceof androidx.core.view.WindowInsetsCompat
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            r0 = r4
            androidx.core.view.WindowInsetsCompat r0 = (androidx.core.view.WindowInsetsCompat) r0
            androidx.core.view.WindowInsetsCompat$Impl r1 = r3.mImpl
            androidx.core.view.WindowInsetsCompat$Impl r2 = r0.mImpl
            boolean r1 = androidx.core.util.ObjectsCompat.equals(r1, r2)
            return r1
    }

    public androidx.core.view.DisplayCutoutCompat getDisplayCutout() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.view.DisplayCutoutCompat r0 = r0.getDisplayCutout()
            return r0
    }

    public androidx.core.graphics.Insets getInsets(int r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getInsets(r2)
            return r0
    }

    public androidx.core.graphics.Insets getInsetsIgnoringVisibility(int r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getInsetsIgnoringVisibility(r2)
            return r0
    }

    @java.lang.Deprecated
    public androidx.core.graphics.Insets getMandatorySystemGestureInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getMandatorySystemGestureInsets()
            return r0
    }

    public android.graphics.Rect getPrivacyIndicatorBounds() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            android.graphics.Rect r0 = r0.getPrivacyIndicatorBounds()
            return r0
    }

    public androidx.core.view.RoundedCornerCompat getRoundedCorner(int r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.view.RoundedCornerCompat r0 = r0.getRoundedCorner(r2)
            return r0
    }

    @java.lang.Deprecated
    public int getStableInsetBottom() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getStableInsets()
            int r0 = r0.bottom
            return r0
    }

    @java.lang.Deprecated
    public int getStableInsetLeft() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getStableInsets()
            int r0 = r0.left
            return r0
    }

    @java.lang.Deprecated
    public int getStableInsetRight() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getStableInsets()
            int r0 = r0.right
            return r0
    }

    @java.lang.Deprecated
    public int getStableInsetTop() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getStableInsets()
            int r0 = r0.top
            return r0
    }

    @java.lang.Deprecated
    public androidx.core.graphics.Insets getStableInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getStableInsets()
            return r0
    }

    @java.lang.Deprecated
    public androidx.core.graphics.Insets getSystemGestureInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemGestureInsets()
            return r0
    }

    @java.lang.Deprecated
    public int getSystemWindowInsetBottom() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemWindowInsets()
            int r0 = r0.bottom
            return r0
    }

    @java.lang.Deprecated
    public int getSystemWindowInsetLeft() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemWindowInsets()
            int r0 = r0.left
            return r0
    }

    @java.lang.Deprecated
    public int getSystemWindowInsetRight() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemWindowInsets()
            int r0 = r0.right
            return r0
    }

    @java.lang.Deprecated
    public int getSystemWindowInsetTop() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemWindowInsets()
            int r0 = r0.top
            return r0
    }

    @java.lang.Deprecated
    public androidx.core.graphics.Insets getSystemWindowInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemWindowInsets()
            return r0
    }

    @java.lang.Deprecated
    public androidx.core.graphics.Insets getTappableElementInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.graphics.Insets r0 = r0.getTappableElementInsets()
            return r0
    }

    public boolean hasInsets() {
            r2 = this;
            int r0 = androidx.core.view.WindowInsetsCompat.Type.all()
            androidx.core.graphics.Insets r0 = r2.getInsets(r0)
            androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.NONE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
            int r0 = androidx.core.view.WindowInsetsCompat.Type.all()
            int r1 = androidx.core.view.WindowInsetsCompat.Type.ime()
            r0 = r0 ^ r1
            androidx.core.graphics.Insets r0 = r2.getInsetsIgnoringVisibility(r0)
            androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.NONE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2e
            androidx.core.view.DisplayCutoutCompat r0 = r2.getDisplayCutout()
            if (r0 == 0) goto L2c
            goto L2e
        L2c:
            r0 = 0
            goto L2f
        L2e:
            r0 = 1
        L2f:
            return r0
    }

    @java.lang.Deprecated
    public boolean hasStableInsets() {
            r2 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r2.mImpl
            androidx.core.graphics.Insets r0 = r0.getStableInsets()
            androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.NONE
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            return r0
    }

    @java.lang.Deprecated
    public boolean hasSystemWindowInsets() {
            r2 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r2.mImpl
            androidx.core.graphics.Insets r0 = r0.getSystemWindowInsets()
            androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.NONE
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            return r0
    }

    public int hashCode() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            int r0 = r0.hashCode()
        Lc:
            return r0
    }

    public androidx.core.view.WindowInsetsCompat inset(int r2, int r3, int r4, int r5) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.view.WindowInsetsCompat r0 = r0.inset(r2, r3, r4, r5)
            return r0
    }

    public androidx.core.view.WindowInsetsCompat inset(androidx.core.graphics.Insets r5) {
            r4 = this;
            int r0 = r5.left
            int r1 = r5.top
            int r2 = r5.right
            int r3 = r5.bottom
            androidx.core.view.WindowInsetsCompat r0 = r4.inset(r0, r1, r2, r3)
            return r0
    }

    public boolean isConsumed() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            boolean r0 = r0.isConsumed()
            return r0
    }

    public boolean isRound() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            boolean r0 = r0.isRound()
            return r0
    }

    public boolean isVisible(int r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            boolean r0 = r0.isVisible(r2)
            return r0
    }

    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat replaceSystemWindowInsets(int r3, int r4, int r5, int r6) {
            r2 = this;
            androidx.core.view.WindowInsetsCompat$Builder r0 = new androidx.core.view.WindowInsetsCompat$Builder
            r0.<init>(r2)
            androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.of(r3, r4, r5, r6)
            androidx.core.view.WindowInsetsCompat$Builder r0 = r0.setSystemWindowInsets(r1)
            androidx.core.view.WindowInsetsCompat r0 = r0.build()
            return r0
    }

    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat replaceSystemWindowInsets(android.graphics.Rect r3) {
            r2 = this;
            androidx.core.view.WindowInsetsCompat$Builder r0 = new androidx.core.view.WindowInsetsCompat$Builder
            r0.<init>(r2)
            androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.of(r3)
            androidx.core.view.WindowInsetsCompat$Builder r0 = r0.setSystemWindowInsets(r1)
            androidx.core.view.WindowInsetsCompat r0 = r0.build()
            return r0
    }

    void setOverriddenInsets(androidx.core.graphics.Insets[] r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            r0.setOverriddenInsets(r2)
            return
    }

    void setRootViewData(androidx.core.graphics.Insets r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            r0.setRootViewData(r2)
            return
    }

    void setRootWindowInsets(androidx.core.view.WindowInsetsCompat r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            r0.setRootWindowInsets(r2)
            return
    }

    void setStableInsets(androidx.core.graphics.Insets r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            r0.setStableInsets(r2)
            return
    }

    void setSystemUiVisibility(int r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            r0.setSystemUiVisibility(r2)
            return
    }

    public android.view.WindowInsets toWindowInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            boolean r0 = r0 instanceof androidx.core.view.WindowInsetsCompat.Impl20
            if (r0 == 0) goto Ld
            androidx.core.view.WindowInsetsCompat$Impl r0 = r1.mImpl
            androidx.core.view.WindowInsetsCompat$Impl20 r0 = (androidx.core.view.WindowInsetsCompat.Impl20) r0
            android.view.WindowInsets r0 = r0.mPlatformInsets
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }
}
