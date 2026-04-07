package androidx.appcompat.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class DrawableContainerCompat extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {
    private static final boolean DEBUG = false;
    private static final boolean DEFAULT_DITHER = true;
    private static final java.lang.String TAG = "DrawableContainerCompat";
    private int mAlpha;
    private java.lang.Runnable mAnimationRunnable;
    private androidx.appcompat.graphics.drawable.DrawableContainerCompat.BlockInvalidateCallback mBlockInvalidateCallback;
    private int mCurIndex;
    private android.graphics.drawable.Drawable mCurrDrawable;
    private androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState mDrawableContainerState;
    private long mEnterAnimationEnd;
    private long mExitAnimationEnd;
    private boolean mHasAlpha;
    private android.graphics.Rect mHotspotBounds;
    private android.graphics.drawable.Drawable mLastDrawable;
    private boolean mMutated;


    private static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static boolean canApplyTheme(android.graphics.drawable.Drawable.ConstantState r1) {
                boolean r0 = r1.canApplyTheme()
                return r0
        }

        public static void getOutline(android.graphics.drawable.Drawable r0, android.graphics.Outline r1) {
                r0.getOutline(r1)
                return
        }

        public static android.content.res.Resources getResources(android.content.res.Resources.Theme r1) {
                android.content.res.Resources r0 = r1.getResources()
                return r0
        }
    }

    static class BlockInvalidateCallback implements android.graphics.drawable.Drawable.Callback {
        private android.graphics.drawable.Drawable.Callback mCallback;

        BlockInvalidateCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(android.graphics.drawable.Drawable r2, java.lang.Runnable r3, long r4) {
                r1 = this;
                android.graphics.drawable.Drawable$Callback r0 = r1.mCallback
                if (r0 == 0) goto L9
                android.graphics.drawable.Drawable$Callback r0 = r1.mCallback
                r0.scheduleDrawable(r2, r3, r4)
            L9:
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(android.graphics.drawable.Drawable r2, java.lang.Runnable r3) {
                r1 = this;
                android.graphics.drawable.Drawable$Callback r0 = r1.mCallback
                if (r0 == 0) goto L9
                android.graphics.drawable.Drawable$Callback r0 = r1.mCallback
                r0.unscheduleDrawable(r2, r3)
            L9:
                return
        }

        public android.graphics.drawable.Drawable.Callback unwrap() {
                r2 = this;
                android.graphics.drawable.Drawable$Callback r0 = r2.mCallback
                r1 = 0
                r2.mCallback = r1
                return r0
        }

        public androidx.appcompat.graphics.drawable.DrawableContainerCompat.BlockInvalidateCallback wrap(android.graphics.drawable.Drawable.Callback r1) {
                r0 = this;
                r0.mCallback = r1
                return r0
        }
    }

    static abstract class DrawableContainerState extends android.graphics.drawable.Drawable.ConstantState {
        boolean mAutoMirrored;
        boolean mCanConstantState;
        int mChangingConfigurations;
        boolean mCheckedConstantSize;
        boolean mCheckedConstantState;
        boolean mCheckedOpacity;
        boolean mCheckedPadding;
        boolean mCheckedStateful;
        int mChildrenChangingConfigurations;
        android.graphics.ColorFilter mColorFilter;
        int mConstantHeight;
        int mConstantMinimumHeight;
        int mConstantMinimumWidth;
        android.graphics.Rect mConstantPadding;
        boolean mConstantSize;
        int mConstantWidth;
        int mDensity;
        boolean mDither;
        android.util.SparseArray<android.graphics.drawable.Drawable.ConstantState> mDrawableFutures;
        android.graphics.drawable.Drawable[] mDrawables;
        int mEnterFadeDuration;
        int mExitFadeDuration;
        boolean mHasColorFilter;
        boolean mHasTintList;
        boolean mHasTintMode;
        int mLayoutDirection;
        boolean mMutated;
        int mNumChildren;
        int mOpacity;
        final androidx.appcompat.graphics.drawable.DrawableContainerCompat mOwner;
        android.content.res.Resources mSourceRes;
        boolean mStateful;
        android.content.res.ColorStateList mTintList;
        android.graphics.PorterDuff.Mode mTintMode;
        boolean mVariablePadding;

        DrawableContainerState(androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState r8, androidx.appcompat.graphics.drawable.DrawableContainerCompat r9, android.content.res.Resources r10) {
                r7 = this;
                r7.<init>()
                r0 = 0
                r7.mVariablePadding = r0
                r7.mConstantSize = r0
                r1 = 1
                r7.mDither = r1
                r7.mEnterFadeDuration = r0
                r7.mExitFadeDuration = r0
                r7.mOwner = r9
                r2 = 0
                if (r10 == 0) goto L16
                r3 = r10
                goto L1c
            L16:
                if (r8 == 0) goto L1b
                android.content.res.Resources r3 = r8.mSourceRes
                goto L1c
            L1b:
                r3 = r2
            L1c:
                r7.mSourceRes = r3
                if (r8 == 0) goto L23
                int r3 = r8.mDensity
                goto L24
            L23:
                r3 = r0
            L24:
                int r3 = androidx.appcompat.graphics.drawable.DrawableContainerCompat.resolveDensity(r10, r3)
                r7.mDensity = r3
                if (r8 == 0) goto Lf5
                int r0 = r8.mChangingConfigurations
                r7.mChangingConfigurations = r0
                int r0 = r8.mChildrenChangingConfigurations
                r7.mChildrenChangingConfigurations = r0
                r7.mCheckedConstantState = r1
                r7.mCanConstantState = r1
                boolean r0 = r8.mVariablePadding
                r7.mVariablePadding = r0
                boolean r0 = r8.mConstantSize
                r7.mConstantSize = r0
                boolean r0 = r8.mDither
                r7.mDither = r0
                boolean r0 = r8.mMutated
                r7.mMutated = r0
                int r0 = r8.mLayoutDirection
                r7.mLayoutDirection = r0
                int r0 = r8.mEnterFadeDuration
                r7.mEnterFadeDuration = r0
                int r0 = r8.mExitFadeDuration
                r7.mExitFadeDuration = r0
                boolean r0 = r8.mAutoMirrored
                r7.mAutoMirrored = r0
                android.graphics.ColorFilter r0 = r8.mColorFilter
                r7.mColorFilter = r0
                boolean r0 = r8.mHasColorFilter
                r7.mHasColorFilter = r0
                android.content.res.ColorStateList r0 = r8.mTintList
                r7.mTintList = r0
                android.graphics.PorterDuff$Mode r0 = r8.mTintMode
                r7.mTintMode = r0
                boolean r0 = r8.mHasTintList
                r7.mHasTintList = r0
                boolean r0 = r8.mHasTintMode
                r7.mHasTintMode = r0
                int r0 = r8.mDensity
                int r3 = r7.mDensity
                if (r0 != r3) goto La1
                boolean r0 = r8.mCheckedPadding
                if (r0 == 0) goto L8b
                android.graphics.Rect r0 = r8.mConstantPadding
                if (r0 == 0) goto L86
                android.graphics.Rect r2 = new android.graphics.Rect
                android.graphics.Rect r0 = r8.mConstantPadding
                r2.<init>(r0)
                goto L87
            L86:
            L87:
                r7.mConstantPadding = r2
                r7.mCheckedPadding = r1
            L8b:
                boolean r0 = r8.mCheckedConstantSize
                if (r0 == 0) goto La1
                int r0 = r8.mConstantWidth
                r7.mConstantWidth = r0
                int r0 = r8.mConstantHeight
                r7.mConstantHeight = r0
                int r0 = r8.mConstantMinimumWidth
                r7.mConstantMinimumWidth = r0
                int r0 = r8.mConstantMinimumHeight
                r7.mConstantMinimumHeight = r0
                r7.mCheckedConstantSize = r1
            La1:
                boolean r0 = r8.mCheckedOpacity
                if (r0 == 0) goto Lab
                int r0 = r8.mOpacity
                r7.mOpacity = r0
                r7.mCheckedOpacity = r1
            Lab:
                boolean r0 = r8.mCheckedStateful
                if (r0 == 0) goto Lb5
                boolean r0 = r8.mStateful
                r7.mStateful = r0
                r7.mCheckedStateful = r1
            Lb5:
                android.graphics.drawable.Drawable[] r0 = r8.mDrawables
                int r1 = r0.length
                android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
                r7.mDrawables = r1
                int r1 = r8.mNumChildren
                r7.mNumChildren = r1
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r1 = r8.mDrawableFutures
                if (r1 == 0) goto Lcb
                android.util.SparseArray r2 = r1.clone()
                r7.mDrawableFutures = r2
                goto Ld4
            Lcb:
                android.util.SparseArray r2 = new android.util.SparseArray
                int r3 = r7.mNumChildren
                r2.<init>(r3)
                r7.mDrawableFutures = r2
            Ld4:
                int r2 = r7.mNumChildren
                r3 = 0
            Ld7:
                if (r3 >= r2) goto Lf4
                r4 = r0[r3]
                if (r4 == 0) goto Lf1
                r4 = r0[r3]
                android.graphics.drawable.Drawable$ConstantState r4 = r4.getConstantState()
                if (r4 == 0) goto Leb
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r5 = r7.mDrawableFutures
                r5.put(r3, r4)
                goto Lf1
            Leb:
                android.graphics.drawable.Drawable[] r5 = r7.mDrawables
                r6 = r0[r3]
                r5[r3] = r6
            Lf1:
                int r3 = r3 + 1
                goto Ld7
            Lf4:
                goto Lfd
            Lf5:
                r1 = 10
                android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
                r7.mDrawables = r1
                r7.mNumChildren = r0
            Lfd:
                return
        }

        private void createAllFutures() {
                r6 = this;
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r0 = r6.mDrawableFutures
                if (r0 == 0) goto L2f
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r0 = r6.mDrawableFutures
                int r0 = r0.size()
                r1 = 0
            Lb:
                if (r1 >= r0) goto L2c
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r2 = r6.mDrawableFutures
                int r2 = r2.keyAt(r1)
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r3 = r6.mDrawableFutures
                java.lang.Object r3 = r3.valueAt(r1)
                android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3
                android.graphics.drawable.Drawable[] r4 = r6.mDrawables
                android.content.res.Resources r5 = r6.mSourceRes
                android.graphics.drawable.Drawable r5 = r3.newDrawable(r5)
                android.graphics.drawable.Drawable r5 = r6.prepareDrawable(r5)
                r4[r2] = r5
                int r1 = r1 + 1
                goto Lb
            L2c:
                r1 = 0
                r6.mDrawableFutures = r1
            L2f:
                return
        }

        private android.graphics.drawable.Drawable prepareDrawable(android.graphics.drawable.Drawable r2) {
                r1 = this;
                int r0 = r1.mLayoutDirection
                androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r2, r0)
                android.graphics.drawable.Drawable r2 = r2.mutate()
                androidx.appcompat.graphics.drawable.DrawableContainerCompat r0 = r1.mOwner
                r2.setCallback(r0)
                return r2
        }

        public final int addChild(android.graphics.drawable.Drawable r5) {
                r4 = this;
                int r0 = r4.mNumChildren
                android.graphics.drawable.Drawable[] r1 = r4.mDrawables
                int r1 = r1.length
                if (r0 < r1) goto Lc
                int r1 = r0 + 10
                r4.growArray(r0, r1)
            Lc:
                r5.mutate()
                r1 = 0
                r2 = 1
                r5.setVisible(r1, r2)
                androidx.appcompat.graphics.drawable.DrawableContainerCompat r3 = r4.mOwner
                r5.setCallback(r3)
                android.graphics.drawable.Drawable[] r3 = r4.mDrawables
                r3[r0] = r5
                int r3 = r4.mNumChildren
                int r3 = r3 + r2
                r4.mNumChildren = r3
                int r2 = r4.mChildrenChangingConfigurations
                int r3 = r5.getChangingConfigurations()
                r2 = r2 | r3
                r4.mChildrenChangingConfigurations = r2
                r4.invalidateCache()
                r2 = 0
                r4.mConstantPadding = r2
                r4.mCheckedPadding = r1
                r4.mCheckedConstantSize = r1
                r4.mCheckedConstantState = r1
                return r0
        }

        final void applyTheme(android.content.res.Resources.Theme r6) {
                r5 = this;
                if (r6 == 0) goto L32
                r5.createAllFutures()
                int r0 = r5.mNumChildren
                android.graphics.drawable.Drawable[] r1 = r5.mDrawables
                r2 = 0
            La:
                if (r2 >= r0) goto L2b
                r3 = r1[r2]
                if (r3 == 0) goto L28
                r3 = r1[r2]
                boolean r3 = androidx.core.graphics.drawable.DrawableCompat.canApplyTheme(r3)
                if (r3 == 0) goto L28
                r3 = r1[r2]
                androidx.core.graphics.drawable.DrawableCompat.applyTheme(r3, r6)
                int r3 = r5.mChildrenChangingConfigurations
                r4 = r1[r2]
                int r4 = r4.getChangingConfigurations()
                r3 = r3 | r4
                r5.mChildrenChangingConfigurations = r3
            L28:
                int r2 = r2 + 1
                goto La
            L2b:
                android.content.res.Resources r2 = androidx.appcompat.graphics.drawable.DrawableContainerCompat.Api21Impl.getResources(r6)
                r5.updateDensity(r2)
            L32:
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
                r7 = this;
                int r0 = r7.mNumChildren
                android.graphics.drawable.Drawable[] r1 = r7.mDrawables
                r2 = 0
            L5:
                if (r2 >= r0) goto L27
                r3 = r1[r2]
                r4 = 1
                if (r3 == 0) goto L13
                boolean r5 = androidx.core.graphics.drawable.DrawableCompat.canApplyTheme(r3)
                if (r5 == 0) goto L24
                return r4
            L13:
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r5 = r7.mDrawableFutures
                java.lang.Object r5 = r5.get(r2)
                android.graphics.drawable.Drawable$ConstantState r5 = (android.graphics.drawable.Drawable.ConstantState) r5
                if (r5 == 0) goto L24
                boolean r6 = androidx.appcompat.graphics.drawable.DrawableContainerCompat.Api21Impl.canApplyTheme(r5)
                if (r6 == 0) goto L24
                return r4
            L24:
                int r2 = r2 + 1
                goto L5
            L27:
                r2 = 0
                return r2
        }

        public boolean canConstantState() {
                r5 = this;
                boolean r0 = r5.mCheckedConstantState
                if (r0 == 0) goto L7
                boolean r0 = r5.mCanConstantState
                return r0
            L7:
                r5.createAllFutures()
                r0 = 1
                r5.mCheckedConstantState = r0
                int r1 = r5.mNumChildren
                android.graphics.drawable.Drawable[] r2 = r5.mDrawables
                r3 = 0
            L12:
                if (r3 >= r1) goto L23
                r4 = r2[r3]
                android.graphics.drawable.Drawable$ConstantState r4 = r4.getConstantState()
                if (r4 != 0) goto L20
                r0 = 0
                r5.mCanConstantState = r0
                return r0
            L20:
                int r3 = r3 + 1
                goto L12
            L23:
                r5.mCanConstantState = r0
                return r0
        }

        final void clearMutated() {
                r1 = this;
                r0 = 0
                r1.mMutated = r0
                return
        }

        protected void computeConstantSize() {
                r6 = this;
                r0 = 1
                r6.mCheckedConstantSize = r0
                r6.createAllFutures()
                int r0 = r6.mNumChildren
                android.graphics.drawable.Drawable[] r1 = r6.mDrawables
                r2 = -1
                r6.mConstantHeight = r2
                r6.mConstantWidth = r2
                r2 = 0
                r6.mConstantMinimumHeight = r2
                r6.mConstantMinimumWidth = r2
                r2 = 0
            L15:
                if (r2 >= r0) goto L44
                r3 = r1[r2]
                int r4 = r3.getIntrinsicWidth()
                int r5 = r6.mConstantWidth
                if (r4 <= r5) goto L23
                r6.mConstantWidth = r4
            L23:
                int r4 = r3.getIntrinsicHeight()
                int r5 = r6.mConstantHeight
                if (r4 <= r5) goto L2d
                r6.mConstantHeight = r4
            L2d:
                int r4 = r3.getMinimumWidth()
                int r5 = r6.mConstantMinimumWidth
                if (r4 <= r5) goto L37
                r6.mConstantMinimumWidth = r4
            L37:
                int r4 = r3.getMinimumHeight()
                int r5 = r6.mConstantMinimumHeight
                if (r4 <= r5) goto L41
                r6.mConstantMinimumHeight = r4
            L41:
                int r2 = r2 + 1
                goto L15
            L44:
                return
        }

        final int getCapacity() {
                r1 = this;
                android.graphics.drawable.Drawable[] r0 = r1.mDrawables
                int r0 = r0.length
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r2 = this;
                int r0 = r2.mChangingConfigurations
                int r1 = r2.mChildrenChangingConfigurations
                r0 = r0 | r1
                return r0
        }

        public final android.graphics.drawable.Drawable getChild(int r7) {
                r6 = this;
                android.graphics.drawable.Drawable[] r0 = r6.mDrawables
                r0 = r0[r7]
                if (r0 == 0) goto L7
                return r0
            L7:
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r1 = r6.mDrawableFutures
                r2 = 0
                if (r1 == 0) goto L3a
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r1 = r6.mDrawableFutures
                int r1 = r1.indexOfKey(r7)
                if (r1 < 0) goto L3a
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r3 = r6.mDrawableFutures
                java.lang.Object r3 = r3.valueAt(r1)
                android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3
                android.content.res.Resources r4 = r6.mSourceRes
                android.graphics.drawable.Drawable r4 = r3.newDrawable(r4)
                android.graphics.drawable.Drawable r4 = r6.prepareDrawable(r4)
                android.graphics.drawable.Drawable[] r5 = r6.mDrawables
                r5[r7] = r4
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r5 = r6.mDrawableFutures
                r5.removeAt(r1)
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r5 = r6.mDrawableFutures
                int r5 = r5.size()
                if (r5 != 0) goto L39
                r6.mDrawableFutures = r2
            L39:
                return r4
            L3a:
                return r2
        }

        public final int getChildCount() {
                r1 = this;
                int r0 = r1.mNumChildren
                return r0
        }

        public final int getConstantHeight() {
                r1 = this;
                boolean r0 = r1.mCheckedConstantSize
                if (r0 != 0) goto L7
                r1.computeConstantSize()
            L7:
                int r0 = r1.mConstantHeight
                return r0
        }

        public final int getConstantMinimumHeight() {
                r1 = this;
                boolean r0 = r1.mCheckedConstantSize
                if (r0 != 0) goto L7
                r1.computeConstantSize()
            L7:
                int r0 = r1.mConstantMinimumHeight
                return r0
        }

        public final int getConstantMinimumWidth() {
                r1 = this;
                boolean r0 = r1.mCheckedConstantSize
                if (r0 != 0) goto L7
                r1.computeConstantSize()
            L7:
                int r0 = r1.mConstantMinimumWidth
                return r0
        }

        public final android.graphics.Rect getConstantPadding() {
                r7 = this;
                boolean r0 = r7.mVariablePadding
                if (r0 == 0) goto L6
                r0 = 0
                return r0
            L6:
                android.graphics.Rect r0 = r7.mConstantPadding
                if (r0 != 0) goto L61
                boolean r0 = r7.mCheckedPadding
                if (r0 == 0) goto Lf
                goto L61
            Lf:
                r7.createAllFutures()
                r0 = 0
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                int r2 = r7.mNumChildren
                android.graphics.drawable.Drawable[] r3 = r7.mDrawables
                r4 = 0
            L1d:
                if (r4 >= r2) goto L5b
                r5 = r3[r4]
                boolean r5 = r5.getPadding(r1)
                if (r5 == 0) goto L58
                if (r0 != 0) goto L30
                android.graphics.Rect r5 = new android.graphics.Rect
                r6 = 0
                r5.<init>(r6, r6, r6, r6)
                r0 = r5
            L30:
                int r5 = r1.left
                int r6 = r0.left
                if (r5 <= r6) goto L3a
                int r5 = r1.left
                r0.left = r5
            L3a:
                int r5 = r1.top
                int r6 = r0.top
                if (r5 <= r6) goto L44
                int r5 = r1.top
                r0.top = r5
            L44:
                int r5 = r1.right
                int r6 = r0.right
                if (r5 <= r6) goto L4e
                int r5 = r1.right
                r0.right = r5
            L4e:
                int r5 = r1.bottom
                int r6 = r0.bottom
                if (r5 <= r6) goto L58
                int r5 = r1.bottom
                r0.bottom = r5
            L58:
                int r4 = r4 + 1
                goto L1d
            L5b:
                r4 = 1
                r7.mCheckedPadding = r4
                r7.mConstantPadding = r0
                return r0
            L61:
                android.graphics.Rect r0 = r7.mConstantPadding
                return r0
        }

        public final int getConstantWidth() {
                r1 = this;
                boolean r0 = r1.mCheckedConstantSize
                if (r0 != 0) goto L7
                r1.computeConstantSize()
            L7:
                int r0 = r1.mConstantWidth
                return r0
        }

        public final int getEnterFadeDuration() {
                r1 = this;
                int r0 = r1.mEnterFadeDuration
                return r0
        }

        public final int getExitFadeDuration() {
                r1 = this;
                int r0 = r1.mExitFadeDuration
                return r0
        }

        public final int getOpacity() {
                r5 = this;
                boolean r0 = r5.mCheckedOpacity
                if (r0 == 0) goto L7
                int r0 = r5.mOpacity
                return r0
            L7:
                r5.createAllFutures()
                int r0 = r5.mNumChildren
                android.graphics.drawable.Drawable[] r1 = r5.mDrawables
                if (r0 <= 0) goto L18
                r2 = 0
                r2 = r1[r2]
                int r2 = r2.getOpacity()
                goto L19
            L18:
                r2 = -2
            L19:
                r3 = 1
            L1a:
                if (r3 >= r0) goto L29
                r4 = r1[r3]
                int r4 = r4.getOpacity()
                int r2 = android.graphics.drawable.Drawable.resolveOpacity(r2, r4)
                int r3 = r3 + 1
                goto L1a
            L29:
                r5.mOpacity = r2
                r3 = 1
                r5.mCheckedOpacity = r3
                return r2
        }

        public void growArray(int r4, int r5) {
                r3 = this;
                android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r5]
                android.graphics.drawable.Drawable[] r1 = r3.mDrawables
                if (r1 == 0) goto Lc
                android.graphics.drawable.Drawable[] r1 = r3.mDrawables
                r2 = 0
                java.lang.System.arraycopy(r1, r2, r0, r2, r4)
            Lc:
                r3.mDrawables = r0
                return
        }

        void invalidateCache() {
                r1 = this;
                r0 = 0
                r1.mCheckedOpacity = r0
                r1.mCheckedStateful = r0
                return
        }

        public final boolean isConstantSize() {
                r1 = this;
                boolean r0 = r1.mConstantSize
                return r0
        }

        public final boolean isStateful() {
                r5 = this;
                boolean r0 = r5.mCheckedStateful
                if (r0 == 0) goto L7
                boolean r0 = r5.mStateful
                return r0
            L7:
                r5.createAllFutures()
                int r0 = r5.mNumChildren
                android.graphics.drawable.Drawable[] r1 = r5.mDrawables
                r2 = 0
                r3 = 0
            L10:
                if (r3 >= r0) goto L1f
                r4 = r1[r3]
                boolean r4 = r4.isStateful()
                if (r4 == 0) goto L1c
                r2 = 1
                goto L1f
            L1c:
                int r3 = r3 + 1
                goto L10
            L1f:
                r5.mStateful = r2
                r3 = 1
                r5.mCheckedStateful = r3
                return r2
        }

        void mutate() {
                r4 = this;
                int r0 = r4.mNumChildren
                android.graphics.drawable.Drawable[] r1 = r4.mDrawables
                r2 = 0
            L5:
                if (r2 >= r0) goto L13
                r3 = r1[r2]
                if (r3 == 0) goto L10
                r3 = r1[r2]
                r3.mutate()
            L10:
                int r2 = r2 + 1
                goto L5
            L13:
                r2 = 1
                r4.mMutated = r2
                return
        }

        public final void setConstantSize(boolean r1) {
                r0 = this;
                r0.mConstantSize = r1
                return
        }

        public final void setEnterFadeDuration(int r1) {
                r0 = this;
                r0.mEnterFadeDuration = r1
                return
        }

        public final void setExitFadeDuration(int r1) {
                r0 = this;
                r0.mExitFadeDuration = r1
                return
        }

        final boolean setLayoutDirection(int r7, int r8) {
                r6 = this;
                r0 = 0
                int r1 = r6.mNumChildren
                android.graphics.drawable.Drawable[] r2 = r6.mDrawables
                r3 = 0
            L6:
                if (r3 >= r1) goto L1a
                r4 = r2[r3]
                if (r4 == 0) goto L17
                r4 = 0
                r5 = r2[r3]
                boolean r4 = androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r5, r7)
                if (r3 != r8) goto L17
                r0 = r4
            L17:
                int r3 = r3 + 1
                goto L6
            L1a:
                r6.mLayoutDirection = r7
                return r0
        }

        public final void setVariablePadding(boolean r1) {
                r0 = this;
                r0.mVariablePadding = r1
                return
        }

        final void updateDensity(android.content.res.Resources r4) {
                r3 = this;
                if (r4 == 0) goto L15
                r3.mSourceRes = r4
                int r0 = r3.mDensity
                int r0 = androidx.appcompat.graphics.drawable.DrawableContainerCompat.resolveDensity(r4, r0)
                int r1 = r3.mDensity
                r3.mDensity = r0
                if (r1 == r0) goto L15
                r2 = 0
                r3.mCheckedConstantSize = r2
                r3.mCheckedPadding = r2
            L15:
                return
        }
    }

    public DrawableContainerCompat() {
            r1 = this;
            r1.<init>()
            r0 = 255(0xff, float:3.57E-43)
            r1.mAlpha = r0
            r0 = -1
            r1.mCurIndex = r0
            return
    }

    private void initializeDrawableForDisplay(android.graphics.drawable.Drawable r6) {
            r5 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$BlockInvalidateCallback r0 = r5.mBlockInvalidateCallback
            if (r0 != 0) goto Lb
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$BlockInvalidateCallback r0 = new androidx.appcompat.graphics.drawable.DrawableContainerCompat$BlockInvalidateCallback
            r0.<init>()
            r5.mBlockInvalidateCallback = r0
        Lb:
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$BlockInvalidateCallback r0 = r5.mBlockInvalidateCallback
            android.graphics.drawable.Drawable$Callback r1 = r6.getCallback()
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$BlockInvalidateCallback r0 = r0.wrap(r1)
            r6.setCallback(r0)
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r5.mDrawableContainerState     // Catch: java.lang.Throwable -> L9c
            int r0 = r0.mEnterFadeDuration     // Catch: java.lang.Throwable -> L9c
            if (r0 > 0) goto L27
            boolean r0 = r5.mHasAlpha     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L27
            int r0 = r5.mAlpha     // Catch: java.lang.Throwable -> L9c
            r6.setAlpha(r0)     // Catch: java.lang.Throwable -> L9c
        L27:
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r5.mDrawableContainerState     // Catch: java.lang.Throwable -> L9c
            boolean r0 = r0.mHasColorFilter     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L35
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r5.mDrawableContainerState     // Catch: java.lang.Throwable -> L9c
            android.graphics.ColorFilter r0 = r0.mColorFilter     // Catch: java.lang.Throwable -> L9c
            r6.setColorFilter(r0)     // Catch: java.lang.Throwable -> L9c
            goto L4f
        L35:
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r5.mDrawableContainerState     // Catch: java.lang.Throwable -> L9c
            boolean r0 = r0.mHasTintList     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L42
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r5.mDrawableContainerState     // Catch: java.lang.Throwable -> L9c
            android.content.res.ColorStateList r0 = r0.mTintList     // Catch: java.lang.Throwable -> L9c
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r6, r0)     // Catch: java.lang.Throwable -> L9c
        L42:
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r5.mDrawableContainerState     // Catch: java.lang.Throwable -> L9c
            boolean r0 = r0.mHasTintMode     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L4f
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r5.mDrawableContainerState     // Catch: java.lang.Throwable -> L9c
            android.graphics.PorterDuff$Mode r0 = r0.mTintMode     // Catch: java.lang.Throwable -> L9c
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r6, r0)     // Catch: java.lang.Throwable -> L9c
        L4f:
            boolean r0 = r5.isVisible()     // Catch: java.lang.Throwable -> L9c
            r1 = 1
            r6.setVisible(r0, r1)     // Catch: java.lang.Throwable -> L9c
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r5.mDrawableContainerState     // Catch: java.lang.Throwable -> L9c
            boolean r0 = r0.mDither     // Catch: java.lang.Throwable -> L9c
            r6.setDither(r0)     // Catch: java.lang.Throwable -> L9c
            int[] r0 = r5.getState()     // Catch: java.lang.Throwable -> L9c
            r6.setState(r0)     // Catch: java.lang.Throwable -> L9c
            int r0 = r5.getLevel()     // Catch: java.lang.Throwable -> L9c
            r6.setLevel(r0)     // Catch: java.lang.Throwable -> L9c
            android.graphics.Rect r0 = r5.getBounds()     // Catch: java.lang.Throwable -> L9c
            r6.setBounds(r0)     // Catch: java.lang.Throwable -> L9c
            int r0 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r5)     // Catch: java.lang.Throwable -> L9c
            androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r6, r0)     // Catch: java.lang.Throwable -> L9c
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r5.mDrawableContainerState     // Catch: java.lang.Throwable -> L9c
            boolean r0 = r0.mAutoMirrored     // Catch: java.lang.Throwable -> L9c
            androidx.core.graphics.drawable.DrawableCompat.setAutoMirrored(r6, r0)     // Catch: java.lang.Throwable -> L9c
            android.graphics.Rect r0 = r5.mHotspotBounds     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L91
            int r1 = r0.left     // Catch: java.lang.Throwable -> L9c
            int r2 = r0.top     // Catch: java.lang.Throwable -> L9c
            int r3 = r0.right     // Catch: java.lang.Throwable -> L9c
            int r4 = r0.bottom     // Catch: java.lang.Throwable -> L9c
            androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(r6, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L9c
        L91:
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$BlockInvalidateCallback r0 = r5.mBlockInvalidateCallback
            android.graphics.drawable.Drawable$Callback r0 = r0.unwrap()
            r6.setCallback(r0)
            return
        L9c:
            r0 = move-exception
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$BlockInvalidateCallback r1 = r5.mBlockInvalidateCallback
            android.graphics.drawable.Drawable$Callback r1 = r1.unwrap()
            r6.setCallback(r1)
            throw r0
    }

    private boolean needsMirroring() {
            r2 = this;
            boolean r0 = r2.isAutoMirrored()
            if (r0 == 0) goto Le
            int r0 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r2)
            r1 = 1
            if (r0 != r1) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    static int resolveDensity(android.content.res.Resources r2, int r3) {
            if (r2 != 0) goto L4
            r0 = r3
            goto La
        L4:
            android.util.DisplayMetrics r0 = r2.getDisplayMetrics()
            int r0 = r0.densityDpi
        La:
            if (r0 != 0) goto Lf
            r1 = 160(0xa0, float:2.24E-43)
            goto L10
        Lf:
            r1 = r0
        L10:
            return r1
    }

    void animate(boolean r12) {
            r11 = this;
            r0 = 1
            r11.mHasAlpha = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 0
            android.graphics.drawable.Drawable r3 = r11.mCurrDrawable
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            if (r3 == 0) goto L3e
            long r8 = r11.mEnterAnimationEnd
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 == 0) goto L40
            long r8 = r11.mEnterAnimationEnd
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 > 0) goto L26
            android.graphics.drawable.Drawable r3 = r11.mCurrDrawable
            int r8 = r11.mAlpha
            r3.setAlpha(r8)
            r11.mEnterAnimationEnd = r6
            goto L40
        L26:
            long r8 = r11.mEnterAnimationEnd
            long r8 = r8 - r0
            long r8 = r8 * r4
            int r3 = (int) r8
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r8 = r11.mDrawableContainerState
            int r8 = r8.mEnterFadeDuration
            int r3 = r3 / r8
            android.graphics.drawable.Drawable r8 = r11.mCurrDrawable
            int r9 = 255 - r3
            int r10 = r11.mAlpha
            int r9 = r9 * r10
            int r9 = r9 / 255
            r8.setAlpha(r9)
            r2 = 1
            goto L40
        L3e:
            r11.mEnterAnimationEnd = r6
        L40:
            android.graphics.drawable.Drawable r3 = r11.mLastDrawable
            if (r3 == 0) goto L72
            long r8 = r11.mExitAnimationEnd
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 == 0) goto L74
            long r8 = r11.mExitAnimationEnd
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 > 0) goto L5c
            android.graphics.drawable.Drawable r3 = r11.mLastDrawable
            r4 = 0
            r3.setVisible(r4, r4)
            r3 = 0
            r11.mLastDrawable = r3
            r11.mExitAnimationEnd = r6
            goto L74
        L5c:
            long r6 = r11.mExitAnimationEnd
            long r6 = r6 - r0
            long r6 = r6 * r4
            int r3 = (int) r6
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r4 = r11.mDrawableContainerState
            int r4 = r4.mExitFadeDuration
            int r3 = r3 / r4
            android.graphics.drawable.Drawable r4 = r11.mLastDrawable
            int r5 = r11.mAlpha
            int r5 = r5 * r3
            int r5 = r5 / 255
            r4.setAlpha(r5)
            r2 = 1
            goto L74
        L72:
            r11.mExitAnimationEnd = r6
        L74:
            if (r12 == 0) goto L80
            if (r2 == 0) goto L80
            java.lang.Runnable r3 = r11.mAnimationRunnable
            r4 = 16
            long r4 = r4 + r0
            r11.scheduleSelf(r3, r4)
        L80:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme r2) {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            r0.applyTheme(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            boolean r0 = r0.canApplyTheme()
            return r0
    }

    void clearMutated() {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            r0.clearMutated()
            r0 = 0
            r1.mMutated = r0
            return
    }

    androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState cloneConstantState() {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            r0.draw(r2)
        L9:
            android.graphics.drawable.Drawable r0 = r1.mLastDrawable
            if (r0 == 0) goto L12
            android.graphics.drawable.Drawable r0 = r1.mLastDrawable
            r0.draw(r2)
        L12:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            int r0 = r1.mAlpha
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r2 = this;
            int r0 = super.getChangingConfigurations()
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r1 = r2.mDrawableContainerState
            int r1 = r1.getChangingConfigurations()
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            boolean r0 = r0.canConstantState()
            if (r0 == 0) goto L13
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            int r1 = r2.getChangingConfigurations()
            r0.mChangingConfigurations = r1
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            return r0
    }

    int getCurrentIndex() {
            r1 = this;
            int r0 = r1.mCurIndex
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.mHotspotBounds
            if (r0 == 0) goto La
            android.graphics.Rect r0 = r1.mHotspotBounds
            r2.set(r0)
            goto Ld
        La:
            super.getHotspotBounds(r2)
        Ld:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            boolean r0 = r0.isConstantSize()
            if (r0 == 0) goto Lf
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            int r0 = r0.getConstantHeight()
            return r0
        Lf:
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L1a
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            int r0 = r0.getIntrinsicHeight()
            goto L1b
        L1a:
            r0 = -1
        L1b:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            boolean r0 = r0.isConstantSize()
            if (r0 == 0) goto Lf
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            int r0 = r0.getConstantWidth()
            return r0
        Lf:
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L1a
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            int r0 = r0.getIntrinsicWidth()
            goto L1b
        L1a:
            r0 = -1
        L1b:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            boolean r0 = r0.isConstantSize()
            if (r0 == 0) goto Lf
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            int r0 = r0.getConstantMinimumHeight()
            return r0
        Lf:
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L1a
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            int r0 = r0.getMinimumHeight()
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            boolean r0 = r0.isConstantSize()
            if (r0 == 0) goto Lf
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            int r0 = r0.getConstantMinimumWidth()
            return r0
        Lf:
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L1a
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            int r0 = r0.getMinimumWidth()
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            boolean r0 = r0.isVisible()
            if (r0 != 0) goto Ld
            goto L14
        Ld:
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            int r0 = r0.getOpacity()
            goto L15
        L14:
            r0 = -2
        L15:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            androidx.appcompat.graphics.drawable.DrawableContainerCompat.Api21Impl.getOutline(r0, r2)
        L9:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect r5) {
            r4 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r4.mDrawableContainerState
            android.graphics.Rect r0 = r0.getConstantPadding()
            if (r0 == 0) goto L1c
            r5.set(r0)
            int r1 = r0.left
            int r2 = r0.top
            r1 = r1 | r2
            int r2 = r0.bottom
            r1 = r1 | r2
            int r2 = r0.right
            r1 = r1 | r2
            if (r1 == 0) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            goto L2b
        L1c:
            android.graphics.drawable.Drawable r1 = r4.mCurrDrawable
            if (r1 == 0) goto L27
            android.graphics.drawable.Drawable r1 = r4.mCurrDrawable
            boolean r1 = r1.getPadding(r5)
            goto L2b
        L27:
            boolean r1 = super.getPadding(r5)
        L2b:
            boolean r2 = r4.needsMirroring()
            if (r2 == 0) goto L39
            int r2 = r5.left
            int r3 = r5.right
            r5.left = r3
            r5.right = r2
        L39:
            return r1
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            if (r0 == 0) goto L9
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            r0.invalidateCache()
        L9:
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r2 != r0) goto L1a
            android.graphics.drawable.Drawable$Callback r0 = r1.getCallback()
            if (r0 == 0) goto L1a
            android.graphics.drawable.Drawable$Callback r0 = r1.getCallback()
            r0.invalidateDrawable(r1)
        L1a:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            boolean r0 = r0.mAutoMirrored
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            boolean r0 = r0.isStateful()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r5 = this;
            r0 = 0
            android.graphics.drawable.Drawable r1 = r5.mLastDrawable
            if (r1 == 0) goto Le
            android.graphics.drawable.Drawable r1 = r5.mLastDrawable
            r1.jumpToCurrentState()
            r1 = 0
            r5.mLastDrawable = r1
            r0 = 1
        Le:
            android.graphics.drawable.Drawable r1 = r5.mCurrDrawable
            if (r1 == 0) goto L22
            android.graphics.drawable.Drawable r1 = r5.mCurrDrawable
            r1.jumpToCurrentState()
            boolean r1 = r5.mHasAlpha
            if (r1 == 0) goto L22
            android.graphics.drawable.Drawable r1 = r5.mCurrDrawable
            int r2 = r5.mAlpha
            r1.setAlpha(r2)
        L22:
            long r1 = r5.mExitAnimationEnd
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L2d
            r5.mExitAnimationEnd = r3
            r0 = 1
        L2d:
            long r1 = r5.mEnterAnimationEnd
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L36
            r5.mEnterAnimationEnd = r3
            r0 = 1
        L36:
            if (r0 == 0) goto L3b
            r5.invalidateSelf()
        L3b:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r2 = this;
            boolean r0 = r2.mMutated
            if (r0 != 0) goto L17
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r2) goto L17
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.cloneConstantState()
            r0.mutate()
            r2.setConstantState(r0)
            r1 = 1
            r2.mMutated = r1
        L17:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mLastDrawable
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r1.mLastDrawable
            r0.setBounds(r2)
        L9:
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L12
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            r0.setBounds(r2)
        L12:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int r3) {
            r2 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            int r1 = r2.getCurrentIndex()
            boolean r0 = r0.setLayoutDirection(r3, r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mLastDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mLastDrawable
            boolean r0 = r0.setLevel(r2)
            return r0
        Lb:
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L16
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            boolean r0 = r0.setLevel(r2)
            return r0
        L16:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mLastDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mLastDrawable
            boolean r0 = r0.setState(r2)
            return r0
        Lb:
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L16
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            boolean r0 = r0.setState(r2)
            return r0
        L16:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable r2, java.lang.Runnable r3, long r4) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r2 != r0) goto L11
            android.graphics.drawable.Drawable$Callback r0 = r1.getCallback()
            if (r0 == 0) goto L11
            android.graphics.drawable.Drawable$Callback r0 = r1.getCallback()
            r0.scheduleDrawable(r1, r3, r4)
        L11:
            return
    }

    boolean selectDrawable(int r10) {
            r9 = this;
            int r0 = r9.mCurIndex
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r9.mDrawableContainerState
            int r0 = r0.mExitFadeDuration
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L32
            android.graphics.drawable.Drawable r0 = r9.mLastDrawable
            if (r0 == 0) goto L1c
            android.graphics.drawable.Drawable r0 = r9.mLastDrawable
            r0.setVisible(r1, r1)
        L1c:
            android.graphics.drawable.Drawable r0 = r9.mCurrDrawable
            if (r0 == 0) goto L2d
            android.graphics.drawable.Drawable r0 = r9.mCurrDrawable
            r9.mLastDrawable = r0
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r9.mDrawableContainerState
            int r0 = r0.mExitFadeDuration
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.mExitAnimationEnd = r0
            goto L3b
        L2d:
            r9.mLastDrawable = r4
            r9.mExitAnimationEnd = r5
            goto L3b
        L32:
            android.graphics.drawable.Drawable r0 = r9.mCurrDrawable
            if (r0 == 0) goto L3b
            android.graphics.drawable.Drawable r0 = r9.mCurrDrawable
            r0.setVisible(r1, r1)
        L3b:
            if (r10 < 0) goto L61
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r9.mDrawableContainerState
            int r0 = r0.mNumChildren
            if (r10 >= r0) goto L61
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r9.mDrawableContainerState
            android.graphics.drawable.Drawable r0 = r0.getChild(r10)
            r9.mCurrDrawable = r0
            r9.mCurIndex = r10
            if (r0 == 0) goto L60
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r1 = r9.mDrawableContainerState
            int r1 = r1.mEnterFadeDuration
            if (r1 <= 0) goto L5d
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r1 = r9.mDrawableContainerState
            int r1 = r1.mEnterFadeDuration
            long r7 = (long) r1
            long r7 = r7 + r2
            r9.mEnterAnimationEnd = r7
        L5d:
            r9.initializeDrawableForDisplay(r0)
        L60:
            goto L66
        L61:
            r9.mCurrDrawable = r4
            r0 = -1
            r9.mCurIndex = r0
        L66:
            long r0 = r9.mEnterAnimationEnd
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r1 = 1
            if (r0 != 0) goto L73
            long r7 = r9.mExitAnimationEnd
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 == 0) goto L87
        L73:
            java.lang.Runnable r0 = r9.mAnimationRunnable
            if (r0 != 0) goto L7f
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$1 r0 = new androidx.appcompat.graphics.drawable.DrawableContainerCompat$1
            r0.<init>(r9)
            r9.mAnimationRunnable = r0
            goto L84
        L7f:
            java.lang.Runnable r0 = r9.mAnimationRunnable
            r9.unscheduleSelf(r0)
        L84:
            r9.animate(r1)
        L87:
            r9.invalidateSelf()
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r5) {
            r4 = this;
            boolean r0 = r4.mHasAlpha
            if (r0 == 0) goto L8
            int r0 = r4.mAlpha
            if (r0 == r5) goto L23
        L8:
            r0 = 1
            r4.mHasAlpha = r0
            r4.mAlpha = r5
            android.graphics.drawable.Drawable r0 = r4.mCurrDrawable
            if (r0 == 0) goto L23
            long r0 = r4.mEnterAnimationEnd
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1f
            android.graphics.drawable.Drawable r0 = r4.mCurrDrawable
            r0.setAlpha(r5)
            goto L23
        L1f:
            r0 = 0
            r4.animate(r0)
        L23:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r3) {
            r2 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            boolean r0 = r0.mAutoMirrored
            if (r0 == r3) goto L17
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            r0.mAutoMirrored = r3
            android.graphics.drawable.Drawable r0 = r2.mCurrDrawable
            if (r0 == 0) goto L17
            android.graphics.drawable.Drawable r0 = r2.mCurrDrawable
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r1 = r2.mDrawableContainerState
            boolean r1 = r1.mAutoMirrored
            androidx.core.graphics.drawable.DrawableCompat.setAutoMirrored(r0, r1)
        L17:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r3) {
            r2 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            r1 = 1
            r0.mHasColorFilter = r1
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            android.graphics.ColorFilter r0 = r0.mColorFilter
            if (r0 == r3) goto L18
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            r0.mColorFilter = r3
            android.graphics.drawable.Drawable r0 = r2.mCurrDrawable
            if (r0 == 0) goto L18
            android.graphics.drawable.Drawable r0 = r2.mCurrDrawable
            r0.setColorFilter(r3)
        L18:
            return
    }

    void setConstantState(androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState r2) {
            r1 = this;
            r1.mDrawableContainerState = r2
            int r0 = r1.mCurIndex
            if (r0 < 0) goto L17
            int r0 = r1.mCurIndex
            android.graphics.drawable.Drawable r0 = r2.getChild(r0)
            r1.mCurrDrawable = r0
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L17
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            r1.initializeDrawableForDisplay(r0)
        L17:
            r0 = 0
            r1.mLastDrawable = r0
            return
    }

    void setCurrentIndex(int r1) {
            r0 = this;
            r0.selectDrawable(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r3) {
            r2 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            boolean r0 = r0.mDither
            if (r0 == r3) goto L17
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            r0.mDither = r3
            android.graphics.drawable.Drawable r0 = r2.mCurrDrawable
            if (r0 == 0) goto L17
            android.graphics.drawable.Drawable r0 = r2.mCurrDrawable
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r1 = r2.mDrawableContainerState
            boolean r1 = r1.mDither
            r0.setDither(r1)
        L17:
            return
    }

    public void setEnterFadeDuration(int r2) {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            r0.mEnterFadeDuration = r2
            return
    }

    public void setExitFadeDuration(int r2) {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            r0.mExitFadeDuration = r2
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float r2, float r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            androidx.core.graphics.drawable.DrawableCompat.setHotspot(r0, r2, r3)
        L9:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.Rect r0 = r1.mHotspotBounds
            if (r0 != 0) goto Lc
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r2, r3, r4, r5)
            r1.mHotspotBounds = r0
            goto L11
        Lc:
            android.graphics.Rect r0 = r1.mHotspotBounds
            r0.set(r2, r3, r4, r5)
        L11:
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r0 == 0) goto L1a
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(r0, r2, r3, r4, r5)
        L1a:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r2)
            r1.setTintList(r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            r1 = 1
            r0.mHasTintList = r1
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            android.content.res.ColorStateList r0 = r0.mTintList
            if (r0 == r3) goto L14
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            r0.mTintList = r3
            android.graphics.drawable.Drawable r0 = r2.mCurrDrawable
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r3)
        L14:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            r1 = 1
            r0.mHasTintMode = r1
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            android.graphics.PorterDuff$Mode r0 = r0.mTintMode
            if (r0 == r3) goto L14
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r2.mDrawableContainerState
            r0.mTintMode = r3
            android.graphics.drawable.Drawable r0 = r2.mCurrDrawable
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r3)
        L14:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = super.setVisible(r3, r4)
            android.graphics.drawable.Drawable r1 = r2.mLastDrawable
            if (r1 == 0) goto Ld
            android.graphics.drawable.Drawable r1 = r2.mLastDrawable
            r1.setVisible(r3, r4)
        Ld:
            android.graphics.drawable.Drawable r1 = r2.mCurrDrawable
            if (r1 == 0) goto L16
            android.graphics.drawable.Drawable r1 = r2.mCurrDrawable
            r1.setVisible(r3, r4)
        L16:
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable r2, java.lang.Runnable r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mCurrDrawable
            if (r2 != r0) goto L11
            android.graphics.drawable.Drawable$Callback r0 = r1.getCallback()
            if (r0 == 0) goto L11
            android.graphics.drawable.Drawable$Callback r0 = r1.getCallback()
            r0.unscheduleDrawable(r1, r3)
        L11:
            return
    }

    final void updateDensity(android.content.res.Resources r2) {
            r1 = this;
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$DrawableContainerState r0 = r1.mDrawableContainerState
            r0.updateDensity(r2)
            return
    }
}
