package androidx.core.view.insets;

/* JADX INFO: loaded from: classes.dex */
public abstract class Protection {
    private static final long DEFAULT_DURATION_IN = 333;
    private static final long DEFAULT_DURATION_OUT = 166;
    private static final android.view.animation.Interpolator DEFAULT_INTERPOLATOR_FADE_IN = null;
    private static final android.view.animation.Interpolator DEFAULT_INTERPOLATOR_FADE_OUT = null;
    private static final android.view.animation.Interpolator DEFAULT_INTERPOLATOR_MOVE_IN = null;
    private static final android.view.animation.Interpolator DEFAULT_INTERPOLATOR_MOVE_OUT = null;
    private final androidx.core.view.insets.Protection.Attributes mAttributes;
    private java.lang.Object mController;
    private androidx.core.graphics.Insets mInsets;
    private androidx.core.graphics.Insets mInsetsIgnoringVisibility;
    private final int mSide;
    private float mSystemAlpha;
    private float mSystemInsetAmount;
    private float mUserAlpha;
    private android.animation.ValueAnimator mUserAlphaAnimator;
    private float mUserInsetAmount;
    private android.animation.ValueAnimator mUserInsetAmountAnimator;

    static class Attributes {
        private static final int UNSPECIFIED = -1;
        private float mAlpha;
        private androidx.core.view.insets.Protection.Attributes.Callback mCallback;
        private android.graphics.drawable.Drawable mDrawable;
        private int mHeight;
        private androidx.core.graphics.Insets mMargin;
        private float mTranslationX;
        private float mTranslationY;
        private boolean mVisible;
        private int mWidth;

        interface Callback {
            default void onAlphaChanged(float r1) {
                    r0 = this;
                    return
            }

            default void onDrawableChanged(android.graphics.drawable.Drawable r1) {
                    r0 = this;
                    return
            }

            default void onHeightChanged(int r1) {
                    r0 = this;
                    return
            }

            default void onMarginChanged(androidx.core.graphics.Insets r1) {
                    r0 = this;
                    return
            }

            default void onTranslationXChanged(float r1) {
                    r0 = this;
                    return
            }

            default void onTranslationYChanged(float r1) {
                    r0 = this;
                    return
            }

            default void onVisibilityChanged(boolean r1) {
                    r0 = this;
                    return
            }

            default void onWidthChanged(int r1) {
                    r0 = this;
                    return
            }
        }

        Attributes() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.mWidth = r0
                r1.mHeight = r0
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
                r1.mMargin = r0
                r0 = 0
                r1.mVisible = r0
                r0 = 0
                r1.mDrawable = r0
                r0 = 0
                r1.mTranslationX = r0
                r1.mTranslationY = r0
                r0 = 1065353216(0x3f800000, float:1.0)
                r1.mAlpha = r0
                return
        }

        static /* synthetic */ void access$000(androidx.core.view.insets.Protection.Attributes r0, androidx.core.graphics.Insets r1) {
                r0.setMargin(r1)
                return
        }

        static /* synthetic */ void access$100(androidx.core.view.insets.Protection.Attributes r0, int r1) {
                r0.setWidth(r1)
                return
        }

        static /* synthetic */ void access$200(androidx.core.view.insets.Protection.Attributes r0, int r1) {
                r0.setHeight(r1)
                return
        }

        static /* synthetic */ void access$300(androidx.core.view.insets.Protection.Attributes r0, boolean r1) {
                r0.setVisible(r1)
                return
        }

        static /* synthetic */ void access$400(androidx.core.view.insets.Protection.Attributes r0, float r1) {
                r0.setAlpha(r1)
                return
        }

        static /* synthetic */ int access$500(androidx.core.view.insets.Protection.Attributes r1) {
                int r0 = r1.mWidth
                return r0
        }

        static /* synthetic */ void access$600(androidx.core.view.insets.Protection.Attributes r0, float r1) {
                r0.setTranslationX(r1)
                return
        }

        static /* synthetic */ int access$700(androidx.core.view.insets.Protection.Attributes r1) {
                int r0 = r1.mHeight
                return r0
        }

        static /* synthetic */ void access$800(androidx.core.view.insets.Protection.Attributes r0, float r1) {
                r0.setTranslationY(r1)
                return
        }

        static /* synthetic */ void access$900(androidx.core.view.insets.Protection.Attributes r0, android.graphics.drawable.Drawable r1) {
                r0.setDrawable(r1)
                return
        }

        private void setAlpha(float r2) {
                r1 = this;
                float r0 = r1.mAlpha
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L11
                r1.mAlpha = r2
                androidx.core.view.insets.Protection$Attributes$Callback r0 = r1.mCallback
                if (r0 == 0) goto L11
                androidx.core.view.insets.Protection$Attributes$Callback r0 = r1.mCallback
                r0.onAlphaChanged(r2)
            L11:
                return
        }

        private void setDrawable(android.graphics.drawable.Drawable r2) {
                r1 = this;
                r1.mDrawable = r2
                androidx.core.view.insets.Protection$Attributes$Callback r0 = r1.mCallback
                if (r0 == 0) goto Lb
                androidx.core.view.insets.Protection$Attributes$Callback r0 = r1.mCallback
                r0.onDrawableChanged(r2)
            Lb:
                return
        }

        private void setHeight(int r2) {
                r1 = this;
                int r0 = r1.mHeight
                if (r0 == r2) goto Lf
                r1.mHeight = r2
                androidx.core.view.insets.Protection$Attributes$Callback r0 = r1.mCallback
                if (r0 == 0) goto Lf
                androidx.core.view.insets.Protection$Attributes$Callback r0 = r1.mCallback
                r0.onHeightChanged(r2)
            Lf:
                return
        }

        private void setMargin(androidx.core.graphics.Insets r2) {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.mMargin
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L13
                r1.mMargin = r2
                androidx.core.view.insets.Protection$Attributes$Callback r0 = r1.mCallback
                if (r0 == 0) goto L13
                androidx.core.view.insets.Protection$Attributes$Callback r0 = r1.mCallback
                r0.onMarginChanged(r2)
            L13:
                return
        }

        private void setTranslationX(float r2) {
                r1 = this;
                float r0 = r1.mTranslationX
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L11
                r1.mTranslationX = r2
                androidx.core.view.insets.Protection$Attributes$Callback r0 = r1.mCallback
                if (r0 == 0) goto L11
                androidx.core.view.insets.Protection$Attributes$Callback r0 = r1.mCallback
                r0.onTranslationXChanged(r2)
            L11:
                return
        }

        private void setTranslationY(float r2) {
                r1 = this;
                float r0 = r1.mTranslationY
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L11
                r1.mTranslationY = r2
                androidx.core.view.insets.Protection$Attributes$Callback r0 = r1.mCallback
                if (r0 == 0) goto L11
                androidx.core.view.insets.Protection$Attributes$Callback r0 = r1.mCallback
                r0.onTranslationYChanged(r2)
            L11:
                return
        }

        private void setVisible(boolean r2) {
                r1 = this;
                boolean r0 = r1.mVisible
                if (r0 == r2) goto Lf
                r1.mVisible = r2
                androidx.core.view.insets.Protection$Attributes$Callback r0 = r1.mCallback
                if (r0 == 0) goto Lf
                androidx.core.view.insets.Protection$Attributes$Callback r0 = r1.mCallback
                r0.onVisibilityChanged(r2)
            Lf:
                return
        }

        private void setWidth(int r2) {
                r1 = this;
                int r0 = r1.mWidth
                if (r0 == r2) goto Lf
                r1.mWidth = r2
                androidx.core.view.insets.Protection$Attributes$Callback r0 = r1.mCallback
                if (r0 == 0) goto Lf
                androidx.core.view.insets.Protection$Attributes$Callback r0 = r1.mCallback
                r0.onWidthChanged(r2)
            Lf:
                return
        }

        float getAlpha() {
                r1 = this;
                float r0 = r1.mAlpha
                return r0
        }

        android.graphics.drawable.Drawable getDrawable() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.mDrawable
                return r0
        }

        int getHeight() {
                r1 = this;
                int r0 = r1.mHeight
                return r0
        }

        androidx.core.graphics.Insets getMargin() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.mMargin
                return r0
        }

        float getTranslationX() {
                r1 = this;
                float r0 = r1.mTranslationX
                return r0
        }

        float getTranslationY() {
                r1 = this;
                float r0 = r1.mTranslationY
                return r0
        }

        int getWidth() {
                r1 = this;
                int r0 = r1.mWidth
                return r0
        }

        boolean isVisible() {
                r1 = this;
                boolean r0 = r1.mVisible
                return r0
        }

        void setCallback(androidx.core.view.insets.Protection.Attributes.Callback r3) {
                r2 = this;
                androidx.core.view.insets.Protection$Attributes$Callback r0 = r2.mCallback
                if (r0 == 0) goto Lf
                if (r3 != 0) goto L7
                goto Lf
            L7:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?"
                r0.<init>(r1)
                throw r0
            Lf:
                r2.mCallback = r3
                return
        }
    }

    static {
            android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1, r1, r2)
            androidx.core.view.insets.Protection.DEFAULT_INTERPOLATOR_MOVE_IN = r0
            android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
            r3 = 1058642330(0x3f19999a, float:0.6)
            r0.<init>(r3, r1, r2, r2)
            androidx.core.view.insets.Protection.DEFAULT_INTERPOLATOR_MOVE_OUT = r0
            android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            r0.<init>(r1, r1, r3, r2)
            androidx.core.view.insets.Protection.DEFAULT_INTERPOLATOR_FADE_IN = r0
            android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
            r3 = 1053609165(0x3ecccccd, float:0.4)
            r0.<init>(r3, r1, r2, r2)
            androidx.core.view.insets.Protection.DEFAULT_INTERPOLATOR_FADE_OUT = r0
            return
    }

    public Protection(int r4) {
            r3 = this;
            r3.<init>()
            androidx.core.view.insets.Protection$Attributes r0 = new androidx.core.view.insets.Protection$Attributes
            r0.<init>()
            r3.mAttributes = r0
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
            r3.mInsets = r0
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
            r3.mInsetsIgnoringVisibility = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.mSystemAlpha = r0
            r3.mUserAlpha = r0
            r3.mSystemInsetAmount = r0
            r3.mUserInsetAmount = r0
            r0 = 0
            r3.mController = r0
            r3.mUserAlphaAnimator = r0
            r3.mUserInsetAmountAnimator = r0
            switch(r4) {
                case 1: goto L3f;
                case 2: goto L3f;
                case 4: goto L3f;
                case 8: goto L3f;
                default: goto L26;
            }
        L26:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected side: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3f:
            r3.mSide = r4
            return
    }

    private void cancelUserAlphaAnimation() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.mUserAlphaAnimator
            if (r0 == 0) goto Lc
            android.animation.ValueAnimator r0 = r1.mUserAlphaAnimator
            r0.cancel()
            r0 = 0
            r1.mUserAlphaAnimator = r0
        Lc:
            return
    }

    private void cancelUserInsetsAmountAnimation() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.mUserInsetAmountAnimator
            if (r0 == 0) goto Lc
            android.animation.ValueAnimator r0 = r1.mUserInsetAmountAnimator
            r0.cancel()
            r0 = 0
            r1.mUserInsetAmountAnimator = r0
        Lc:
            return
    }

    private void setAlphaInternal(float r1) {
            r0 = this;
            r0.mUserAlpha = r1
            r0.updateAlpha()
            return
    }

    private void setInsetAmountInternal(float r1) {
            r0 = this;
            r0.mUserInsetAmount = r1
            r0.updateInsetAmount()
            return
    }

    private void updateAlpha() {
            r3 = this;
            androidx.core.view.insets.Protection$Attributes r0 = r3.mAttributes
            float r1 = r3.mSystemAlpha
            float r2 = r3.mUserAlpha
            float r1 = r1 * r2
            androidx.core.view.insets.Protection.Attributes.access$400(r0, r1)
            return
    }

    private void updateInsetAmount() {
            r4 = this;
            float r0 = r4.mUserInsetAmount
            float r1 = r4.mSystemInsetAmount
            float r0 = r0 * r1
            int r1 = r4.mSide
            r2 = 1065353216(0x3f800000, float:1.0)
            switch(r1) {
                case 1: goto L3b;
                case 2: goto L2b;
                case 4: goto L1c;
                case 8: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L4b
        Ld:
            androidx.core.view.insets.Protection$Attributes r1 = r4.mAttributes
            float r2 = r2 - r0
            androidx.core.view.insets.Protection$Attributes r3 = r4.mAttributes
            int r3 = androidx.core.view.insets.Protection.Attributes.access$700(r3)
            float r3 = (float) r3
            float r2 = r2 * r3
            androidx.core.view.insets.Protection.Attributes.access$800(r1, r2)
            goto L4b
        L1c:
            androidx.core.view.insets.Protection$Attributes r1 = r4.mAttributes
            float r2 = r2 - r0
            androidx.core.view.insets.Protection$Attributes r3 = r4.mAttributes
            int r3 = androidx.core.view.insets.Protection.Attributes.access$500(r3)
            float r3 = (float) r3
            float r2 = r2 * r3
            androidx.core.view.insets.Protection.Attributes.access$600(r1, r2)
            goto L4b
        L2b:
            androidx.core.view.insets.Protection$Attributes r1 = r4.mAttributes
            float r2 = r2 - r0
            float r2 = -r2
            androidx.core.view.insets.Protection$Attributes r3 = r4.mAttributes
            int r3 = androidx.core.view.insets.Protection.Attributes.access$700(r3)
            float r3 = (float) r3
            float r2 = r2 * r3
            androidx.core.view.insets.Protection.Attributes.access$800(r1, r2)
            goto L4b
        L3b:
            androidx.core.view.insets.Protection$Attributes r1 = r4.mAttributes
            float r2 = r2 - r0
            float r2 = -r2
            androidx.core.view.insets.Protection$Attributes r3 = r4.mAttributes
            int r3 = androidx.core.view.insets.Protection.Attributes.access$500(r3)
            float r3 = (float) r3
            float r2 = r2 * r3
            androidx.core.view.insets.Protection.Attributes.access$600(r1, r2)
        L4b:
            return
    }

    public void animateAlpha(float r4) {
            r3 = this;
            r3.cancelUserAlphaAnimation()
            float r0 = r3.mUserAlpha
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto La
            return
        La:
            float r0 = r3.mUserAlpha
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r4
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r1)
            r3.mUserAlphaAnimator = r0
            float r0 = r3.mUserAlpha
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L30
            android.animation.ValueAnimator r0 = r3.mUserAlphaAnimator
            r1 = 333(0x14d, double:1.645E-321)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r3.mUserAlphaAnimator
            android.view.animation.Interpolator r1 = androidx.core.view.insets.Protection.DEFAULT_INTERPOLATOR_FADE_IN
            r0.setInterpolator(r1)
            goto L3e
        L30:
            android.animation.ValueAnimator r0 = r3.mUserAlphaAnimator
            r1 = 166(0xa6, double:8.2E-322)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r3.mUserAlphaAnimator
            android.view.animation.Interpolator r1 = androidx.core.view.insets.Protection.DEFAULT_INTERPOLATOR_FADE_OUT
            r0.setInterpolator(r1)
        L3e:
            android.animation.ValueAnimator r0 = r3.mUserAlphaAnimator
            androidx.core.view.insets.Protection$$ExternalSyntheticLambda1 r1 = new androidx.core.view.insets.Protection$$ExternalSyntheticLambda1
            r1.<init>(r3)
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r0 = r3.mUserAlphaAnimator
            r0.start()
            return
    }

    public void animateInsetsAmount(float r4) {
            r3 = this;
            r3.cancelUserInsetsAmountAnimation()
            float r0 = r3.mUserInsetAmount
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto La
            return
        La:
            float r0 = r3.mUserInsetAmount
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r4
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r1)
            r3.mUserInsetAmountAnimator = r0
            float r0 = r3.mUserInsetAmount
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L30
            android.animation.ValueAnimator r0 = r3.mUserInsetAmountAnimator
            r1 = 333(0x14d, double:1.645E-321)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r3.mUserInsetAmountAnimator
            android.view.animation.Interpolator r1 = androidx.core.view.insets.Protection.DEFAULT_INTERPOLATOR_MOVE_IN
            r0.setInterpolator(r1)
            goto L3e
        L30:
            android.animation.ValueAnimator r0 = r3.mUserInsetAmountAnimator
            r1 = 166(0xa6, double:8.2E-322)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r3.mUserInsetAmountAnimator
            android.view.animation.Interpolator r1 = androidx.core.view.insets.Protection.DEFAULT_INTERPOLATOR_MOVE_OUT
            r0.setInterpolator(r1)
        L3e:
            android.animation.ValueAnimator r0 = r3.mUserInsetAmountAnimator
            androidx.core.view.insets.Protection$$ExternalSyntheticLambda0 r1 = new androidx.core.view.insets.Protection$$ExternalSyntheticLambda0
            r1.<init>(r3)
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r0 = r3.mUserInsetAmountAnimator
            r0.start()
            return
    }

    void dispatchColorHint(int r1) {
            r0 = this;
            return
    }

    androidx.core.graphics.Insets dispatchInsets(androidx.core.graphics.Insets r2, androidx.core.graphics.Insets r3, androidx.core.graphics.Insets r4) {
            r1 = this;
            r1.mInsets = r2
            r1.mInsetsIgnoringVisibility = r3
            androidx.core.view.insets.Protection$Attributes r0 = r1.mAttributes
            androidx.core.view.insets.Protection.Attributes.access$000(r0, r4)
            androidx.core.graphics.Insets r0 = r1.updateLayout()
            return r0
    }

    public float getAlpha() {
            r1 = this;
            float r0 = r1.mUserAlpha
            return r0
    }

    androidx.core.view.insets.Protection.Attributes getAttributes() {
            r1 = this;
            androidx.core.view.insets.Protection$Attributes r0 = r1.mAttributes
            return r0
    }

    java.lang.Object getController() {
            r1 = this;
            java.lang.Object r0 = r1.mController
            return r0
    }

    public float getInsetAmount() {
            r1 = this;
            float r0 = r1.mUserInsetAmount
            return r0
    }

    public int getSide() {
            r1 = this;
            int r0 = r1.mSide
            return r0
    }

    int getThickness(int r1) {
            r0 = this;
            return r1
    }

    /* JADX INFO: renamed from: lambda$animateAlpha$0$androidx-core-view-insets-Protection, reason: not valid java name */
    /* synthetic */ void m71lambda$animateAlpha$0$androidxcoreviewinsetsProtection(android.animation.ValueAnimator r2) {
            r1 = this;
            java.lang.Object r0 = r2.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r1.setAlphaInternal(r0)
            return
    }

    /* JADX INFO: renamed from: lambda$animateInsetsAmount$1$androidx-core-view-insets-Protection, reason: not valid java name */
    /* synthetic */ void m72x124db077(android.animation.ValueAnimator r2) {
            r1 = this;
            java.lang.Object r0 = r2.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r1.setAlphaInternal(r0)
            return
    }

    boolean occupiesCorners() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void setAlpha(float r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L12
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L12
            r3.cancelUserAlphaAnimation()
            r3.setAlphaInternal(r4)
            return
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Alpha must in a range of [0, 1]. Got: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    void setController(java.lang.Object r1) {
            r0 = this;
            r0.mController = r1
            return
    }

    void setDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.core.view.insets.Protection$Attributes r0 = r1.mAttributes
            androidx.core.view.insets.Protection.Attributes.access$900(r0, r2)
            return
    }

    public void setInsetAmount(float r4) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L12
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L12
            r3.cancelUserInsetsAmountAnimation()
            r3.setInsetAmountInternal(r4)
            return
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Inset amount must in a range of [0, 1]. Got: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    void setSystemAlpha(float r1) {
            r0 = this;
            r0.mSystemAlpha = r1
            r0.updateAlpha()
            return
    }

    void setSystemInsetAmount(float r1) {
            r0 = this;
            r0.mSystemInsetAmount = r1
            r0.updateInsetAmount()
            return
    }

    void setSystemVisible(boolean r2) {
            r1 = this;
            androidx.core.view.insets.Protection$Attributes r0 = r1.mAttributes
            androidx.core.view.insets.Protection.Attributes.access$300(r0, r2)
            return
    }

    androidx.core.graphics.Insets updateLayout() {
            r5 = this;
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
            int r1 = r5.mSide
            r2 = 0
            switch(r1) {
                case 1: goto L6b;
                case 2: goto L4b;
                case 4: goto L2b;
                case 8: goto Lb;
                default: goto L8;
            }
        L8:
            r1 = 0
            goto L8a
        Lb:
            androidx.core.graphics.Insets r1 = r5.mInsets
            int r1 = r1.bottom
            androidx.core.view.insets.Protection$Attributes r3 = r5.mAttributes
            androidx.core.graphics.Insets r4 = r5.mInsetsIgnoringVisibility
            int r4 = r4.bottom
            int r4 = r5.getThickness(r4)
            androidx.core.view.insets.Protection.Attributes.access$200(r3, r4)
            boolean r3 = r5.occupiesCorners()
            if (r3 == 0) goto L8a
            int r3 = r5.getThickness(r1)
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.of(r2, r2, r2, r3)
            goto L8a
        L2b:
            androidx.core.graphics.Insets r1 = r5.mInsets
            int r1 = r1.right
            androidx.core.view.insets.Protection$Attributes r3 = r5.mAttributes
            androidx.core.graphics.Insets r4 = r5.mInsetsIgnoringVisibility
            int r4 = r4.right
            int r4 = r5.getThickness(r4)
            androidx.core.view.insets.Protection.Attributes.access$100(r3, r4)
            boolean r3 = r5.occupiesCorners()
            if (r3 == 0) goto L8a
            int r3 = r5.getThickness(r1)
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.of(r2, r2, r3, r2)
            goto L8a
        L4b:
            androidx.core.graphics.Insets r1 = r5.mInsets
            int r1 = r1.top
            androidx.core.view.insets.Protection$Attributes r3 = r5.mAttributes
            androidx.core.graphics.Insets r4 = r5.mInsetsIgnoringVisibility
            int r4 = r4.top
            int r4 = r5.getThickness(r4)
            androidx.core.view.insets.Protection.Attributes.access$200(r3, r4)
            boolean r3 = r5.occupiesCorners()
            if (r3 == 0) goto L8a
            int r3 = r5.getThickness(r1)
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.of(r2, r3, r2, r2)
            goto L8a
        L6b:
            androidx.core.graphics.Insets r1 = r5.mInsets
            int r1 = r1.left
            androidx.core.view.insets.Protection$Attributes r3 = r5.mAttributes
            androidx.core.graphics.Insets r4 = r5.mInsetsIgnoringVisibility
            int r4 = r4.left
            int r4 = r5.getThickness(r4)
            androidx.core.view.insets.Protection.Attributes.access$100(r3, r4)
            boolean r3 = r5.occupiesCorners()
            if (r3 == 0) goto L8a
            int r3 = r5.getThickness(r1)
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.of(r3, r2, r2, r2)
        L8a:
            if (r1 <= 0) goto L8d
            r2 = 1
        L8d:
            r5.setSystemVisible(r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r1 <= 0) goto L97
            r4 = r2
            goto L98
        L97:
            r4 = r3
        L98:
            r5.setSystemAlpha(r4)
            if (r1 <= 0) goto L9e
            goto L9f
        L9e:
            r2 = r3
        L9f:
            r5.setSystemInsetAmount(r2)
            return r0
    }
}
