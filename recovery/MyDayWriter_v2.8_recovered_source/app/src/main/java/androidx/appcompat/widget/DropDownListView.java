package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class DropDownListView extends android.widget.ListView {
    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;
    private androidx.core.view.ViewPropertyAnimatorCompat mClickAnimation;
    private boolean mDrawsInPressedState;
    private boolean mHijackFocus;
    private boolean mListSelectionHidden;
    private int mMotionPosition;
    androidx.appcompat.widget.DropDownListView.ResolveHoverRunnable mResolveHoverRunnable;
    private androidx.core.widget.ListViewAutoScrollHelper mScrollHelper;
    private int mSelectionBottomPadding;
    private int mSelectionLeftPadding;
    private int mSelectionRightPadding;
    private int mSelectionTopPadding;
    private androidx.appcompat.widget.DropDownListView.GateKeeperDrawable mSelector;
    private final android.graphics.Rect mSelectorRect;

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void drawableHotspotChanged(android.view.View r0, float r1, float r2) {
                r0.drawableHotspotChanged(r1, r2)
                return
        }
    }

    static class Api30Impl {
        private static boolean sHasMethods;
        private static java.lang.reflect.Method sPositionSelector;
        private static java.lang.reflect.Method sSetNextSelectedPositionInt;
        private static java.lang.reflect.Method sSetSelectedPositionInt;

        static {
                java.lang.Class<android.widget.AbsListView> r0 = android.widget.AbsListView.class
                java.lang.String r1 = "positionSelector"
                r2 = 5
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L58
                java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L58
                r4 = 0
                r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L58
                java.lang.Class<android.view.View> r3 = android.view.View.class
                r5 = 1
                r2[r5] = r3     // Catch: java.lang.NoSuchMethodException -> L58
                java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L58
                r6 = 2
                r2[r6] = r3     // Catch: java.lang.NoSuchMethodException -> L58
                java.lang.Class r3 = java.lang.Float.TYPE     // Catch: java.lang.NoSuchMethodException -> L58
                r6 = 3
                r2[r6] = r3     // Catch: java.lang.NoSuchMethodException -> L58
                java.lang.Class r3 = java.lang.Float.TYPE     // Catch: java.lang.NoSuchMethodException -> L58
                r6 = 4
                r2[r6] = r3     // Catch: java.lang.NoSuchMethodException -> L58
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L58
                androidx.appcompat.widget.DropDownListView.Api30Impl.sPositionSelector = r0     // Catch: java.lang.NoSuchMethodException -> L58
                java.lang.reflect.Method r0 = androidx.appcompat.widget.DropDownListView.Api30Impl.sPositionSelector     // Catch: java.lang.NoSuchMethodException -> L58
                r0.setAccessible(r5)     // Catch: java.lang.NoSuchMethodException -> L58
                java.lang.Class<android.widget.AdapterView> r0 = android.widget.AdapterView.class
                java.lang.String r1 = "setSelectedPositionInt"
                java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L58
                java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L58
                r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L58
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L58
                androidx.appcompat.widget.DropDownListView.Api30Impl.sSetSelectedPositionInt = r0     // Catch: java.lang.NoSuchMethodException -> L58
                java.lang.reflect.Method r0 = androidx.appcompat.widget.DropDownListView.Api30Impl.sSetSelectedPositionInt     // Catch: java.lang.NoSuchMethodException -> L58
                r0.setAccessible(r5)     // Catch: java.lang.NoSuchMethodException -> L58
                java.lang.Class<android.widget.AdapterView> r0 = android.widget.AdapterView.class
                java.lang.String r1 = "setNextSelectedPositionInt"
                java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L58
                java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L58
                r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L58
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L58
                androidx.appcompat.widget.DropDownListView.Api30Impl.sSetNextSelectedPositionInt = r0     // Catch: java.lang.NoSuchMethodException -> L58
                java.lang.reflect.Method r0 = androidx.appcompat.widget.DropDownListView.Api30Impl.sSetNextSelectedPositionInt     // Catch: java.lang.NoSuchMethodException -> L58
                r0.setAccessible(r5)     // Catch: java.lang.NoSuchMethodException -> L58
                androidx.appcompat.widget.DropDownListView.Api30Impl.sHasMethods = r5     // Catch: java.lang.NoSuchMethodException -> L58
                goto L5c
            L58:
                r0 = move-exception
                r0.printStackTrace()
            L5c:
                return
        }

        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean canPositionSelectorForHoveredItem() {
                boolean r0 = androidx.appcompat.widget.DropDownListView.Api30Impl.sHasMethods
                return r0
        }

        static void positionSelectorForHoveredItem(androidx.appcompat.widget.DropDownListView r5, int r6, android.view.View r7) {
                java.lang.reflect.Method r0 = androidx.appcompat.widget.DropDownListView.Api30Impl.sPositionSelector     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L3b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L3b
                r2 = 0
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L3b
                r3 = -1
                java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L3b
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L3b
                java.lang.Object[] r1 = new java.lang.Object[]{r1, r7, r2, r4, r3}     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L3b
                r0.invoke(r5, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L3b
                java.lang.reflect.Method r0 = androidx.appcompat.widget.DropDownListView.Api30Impl.sSetSelectedPositionInt     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L3b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L3b
                java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L3b
                r0.invoke(r5, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L3b
                java.lang.reflect.Method r0 = androidx.appcompat.widget.DropDownListView.Api30Impl.sSetNextSelectedPositionInt     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L3b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L3b
                java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L3b
                r0.invoke(r5, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.IllegalAccessException -> L3b
                goto L3f
            L36:
                r0 = move-exception
                r0.printStackTrace()
                goto L40
            L3b:
                r0 = move-exception
                r0.printStackTrace()
            L3f:
            L40:
                return
        }
    }

    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isSelectedChildViewEnabled(android.widget.AbsListView r1) {
                boolean r0 = r1.isSelectedChildViewEnabled()
                return r0
        }

        static void setSelectedChildViewEnabled(android.widget.AbsListView r0, boolean r1) {
                r0.setSelectedChildViewEnabled(r1)
                return
        }
    }

    private static class GateKeeperDrawable extends androidx.appcompat.graphics.drawable.DrawableWrapperCompat {
        private boolean mEnabled;

        GateKeeperDrawable(android.graphics.drawable.Drawable r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 1
                r1.mEnabled = r0
                return
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas r2) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 == 0) goto L7
                super.draw(r2)
            L7:
                return
        }

        void setEnabled(boolean r1) {
                r0 = this;
                r0.mEnabled = r1
                return
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void setHotspot(float r2, float r3) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 == 0) goto L7
                super.setHotspot(r2, r3)
            L7:
                return
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void setHotspotBounds(int r2, int r3, int r4, int r5) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 == 0) goto L7
                super.setHotspotBounds(r2, r3, r4, r5)
            L7:
                return
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public boolean setState(int[] r2) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 == 0) goto L9
                boolean r0 = super.setState(r2)
                return r0
            L9:
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public boolean setVisible(boolean r2, boolean r3) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 == 0) goto L9
                boolean r0 = super.setVisible(r2, r3)
                return r0
            L9:
                r0 = 0
                return r0
        }
    }

    static class PreApi33Impl {
        private static final java.lang.reflect.Field sIsChildViewEnabled = null;

        static {
                r0 = 0
                java.lang.Class<android.widget.AbsListView> r1 = android.widget.AbsListView.class
                java.lang.String r2 = "mIsChildViewEnabled"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> Lf
                r0 = r1
                r1 = 1
                r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> Lf
                goto L13
            Lf:
                r1 = move-exception
                r1.printStackTrace()
            L13:
                androidx.appcompat.widget.DropDownListView.PreApi33Impl.sIsChildViewEnabled = r0
                return
        }

        private PreApi33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isSelectedChildViewEnabled(android.widget.AbsListView r1) {
                java.lang.reflect.Field r0 = androidx.appcompat.widget.DropDownListView.PreApi33Impl.sIsChildViewEnabled
                if (r0 == 0) goto Lf
                java.lang.reflect.Field r0 = androidx.appcompat.widget.DropDownListView.PreApi33Impl.sIsChildViewEnabled     // Catch: java.lang.IllegalAccessException -> Lb
                boolean r0 = r0.getBoolean(r1)     // Catch: java.lang.IllegalAccessException -> Lb
                return r0
            Lb:
                r0 = move-exception
                r0.printStackTrace()
            Lf:
                r0 = 0
                return r0
        }

        static void setSelectedChildViewEnabled(android.widget.AbsListView r2, boolean r3) {
                java.lang.reflect.Field r0 = androidx.appcompat.widget.DropDownListView.PreApi33Impl.sIsChildViewEnabled
                if (r0 == 0) goto L12
                java.lang.reflect.Field r0 = androidx.appcompat.widget.DropDownListView.PreApi33Impl.sIsChildViewEnabled     // Catch: java.lang.IllegalAccessException -> Le
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.IllegalAccessException -> Le
                r0.set(r2, r1)     // Catch: java.lang.IllegalAccessException -> Le
                goto L12
            Le:
                r0 = move-exception
                r0.printStackTrace()
            L12:
                return
        }
    }

    private class ResolveHoverRunnable implements java.lang.Runnable {
        final /* synthetic */ androidx.appcompat.widget.DropDownListView this$0;

        ResolveHoverRunnable(androidx.appcompat.widget.DropDownListView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public void cancel() {
                r2 = this;
                androidx.appcompat.widget.DropDownListView r0 = r2.this$0
                r1 = 0
                r0.mResolveHoverRunnable = r1
                androidx.appcompat.widget.DropDownListView r0 = r2.this$0
                r0.removeCallbacks(r2)
                return
        }

        public void post() {
                r1 = this;
                androidx.appcompat.widget.DropDownListView r0 = r1.this$0
                r0.post(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.appcompat.widget.DropDownListView r0 = r2.this$0
                r1 = 0
                r0.mResolveHoverRunnable = r1
                androidx.appcompat.widget.DropDownListView r0 = r2.this$0
                r0.drawableStateChanged()
                return
        }
    }

    DropDownListView(android.content.Context r3, boolean r4) {
            r2 = this;
            r0 = 0
            int r1 = androidx.appcompat.R.attr.dropDownListViewStyle
            r2.<init>(r3, r0, r1)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.mSelectorRect = r0
            r0 = 0
            r2.mSelectionLeftPadding = r0
            r2.mSelectionTopPadding = r0
            r2.mSelectionRightPadding = r0
            r2.mSelectionBottomPadding = r0
            r2.mHijackFocus = r4
            r2.setCacheColorHint(r0)
            return
    }

    private void clearPressedItem() {
            r3 = this;
            r0 = 0
            r3.mDrawsInPressedState = r0
            r3.setPressed(r0)
            r3.drawableStateChanged()
            int r1 = r3.mMotionPosition
            int r2 = r3.getFirstVisiblePosition()
            int r1 = r1 - r2
            android.view.View r1 = r3.getChildAt(r1)
            if (r1 == 0) goto L19
            r1.setPressed(r0)
        L19:
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mClickAnimation
            if (r0 == 0) goto L25
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mClickAnimation
            r0.cancel()
            r0 = 0
            r3.mClickAnimation = r0
        L25:
            return
    }

    private void clickPressedItem(android.view.View r3, int r4) {
            r2 = this;
            long r0 = r2.getItemIdAtPosition(r4)
            r2.performItemClick(r3, r4, r0)
            return
    }

    private void drawSelectorCompat(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.Rect r0 = r2.mSelectorRect
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L16
            android.graphics.drawable.Drawable r0 = r2.getSelector()
            if (r0 == 0) goto L16
            android.graphics.Rect r1 = r2.mSelectorRect
            r0.setBounds(r1)
            r0.draw(r3)
        L16:
            return
    }

    private void positionSelectorCompat(int r6, android.view.View r7) {
            r5 = this;
            android.graphics.Rect r0 = r5.mSelectorRect
            int r1 = r7.getLeft()
            int r2 = r7.getTop()
            int r3 = r7.getRight()
            int r4 = r7.getBottom()
            r0.set(r1, r2, r3, r4)
            int r1 = r0.left
            int r2 = r5.mSelectionLeftPadding
            int r1 = r1 - r2
            r0.left = r1
            int r1 = r0.top
            int r2 = r5.mSelectionTopPadding
            int r1 = r1 - r2
            r0.top = r1
            int r1 = r0.right
            int r2 = r5.mSelectionRightPadding
            int r1 = r1 + r2
            r0.right = r1
            int r1 = r0.bottom
            int r2 = r5.mSelectionBottomPadding
            int r1 = r1 + r2
            r0.bottom = r1
            boolean r1 = r5.superIsSelectedChildViewEnabled()
            boolean r2 = r7.isEnabled()
            if (r2 == r1) goto L46
            r2 = r1 ^ 1
            r5.superSetSelectedChildViewEnabled(r2)
            r2 = -1
            if (r6 == r2) goto L46
            r5.refreshDrawableState()
        L46:
            return
    }

    private void positionSelectorLikeFocusCompat(int r9, android.view.View r10) {
            r8 = this;
            android.graphics.drawable.Drawable r0 = r8.getSelector()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Ld
            r3 = -1
            if (r9 == r3) goto Ld
            r3 = r1
            goto Le
        Ld:
            r3 = r2
        Le:
            if (r3 == 0) goto L13
            r0.setVisible(r2, r2)
        L13:
            r8.positionSelectorCompat(r9, r10)
            if (r3 == 0) goto L30
            android.graphics.Rect r4 = r8.mSelectorRect
            float r5 = r4.exactCenterX()
            float r6 = r4.exactCenterY()
            int r7 = r8.getVisibility()
            if (r7 != 0) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            r0.setVisible(r1, r2)
            androidx.core.graphics.drawable.DrawableCompat.setHotspot(r0, r5, r6)
        L30:
            return
    }

    private void positionSelectorLikeTouchCompat(int r3, android.view.View r4, float r5, float r6) {
            r2 = this;
            r2.positionSelectorLikeFocusCompat(r3, r4)
            android.graphics.drawable.Drawable r0 = r2.getSelector()
            if (r0 == 0) goto Lf
            r1 = -1
            if (r3 == r1) goto Lf
            androidx.core.graphics.drawable.DrawableCompat.setHotspot(r0, r5, r6)
        Lf:
            return
    }

    private void setPressedItem(android.view.View r6, int r7, float r8, float r9) {
            r5 = this;
            r0 = 1
            r5.mDrawsInPressedState = r0
            androidx.appcompat.widget.DropDownListView.Api21Impl.drawableHotspotChanged(r5, r8, r9)
            boolean r1 = r5.isPressed()
            if (r1 != 0) goto L10
            r5.setPressed(r0)
        L10:
            r5.layoutChildren()
            int r1 = r5.mMotionPosition
            r2 = -1
            r3 = 0
            if (r1 == r2) goto L31
            int r1 = r5.mMotionPosition
            int r2 = r5.getFirstVisiblePosition()
            int r1 = r1 - r2
            android.view.View r1 = r5.getChildAt(r1)
            if (r1 == 0) goto L31
            if (r1 == r6) goto L31
            boolean r2 = r1.isPressed()
            if (r2 == 0) goto L31
            r1.setPressed(r3)
        L31:
            r5.mMotionPosition = r7
            int r1 = r6.getLeft()
            float r1 = (float) r1
            float r1 = r8 - r1
            int r2 = r6.getTop()
            float r2 = (float) r2
            float r2 = r9 - r2
            androidx.appcompat.widget.DropDownListView.Api21Impl.drawableHotspotChanged(r6, r1, r2)
            boolean r4 = r6.isPressed()
            if (r4 != 0) goto L4e
            r6.setPressed(r0)
        L4e:
            r5.positionSelectorLikeTouchCompat(r7, r6, r8, r9)
            r5.setSelectorEnabled(r3)
            r5.refreshDrawableState()
            return
    }

    private void setSelectorEnabled(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.DropDownListView$GateKeeperDrawable r0 = r1.mSelector
            if (r0 == 0) goto L9
            androidx.appcompat.widget.DropDownListView$GateKeeperDrawable r0 = r1.mSelector
            r0.setEnabled(r2)
        L9:
            return
    }

    private boolean superIsSelectedChildViewEnabled() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Lb
            boolean r0 = androidx.appcompat.widget.DropDownListView.Api33Impl.isSelectedChildViewEnabled(r2)
            return r0
        Lb:
            boolean r0 = androidx.appcompat.widget.DropDownListView.PreApi33Impl.isSelectedChildViewEnabled(r2)
            return r0
    }

    private void superSetSelectedChildViewEnabled(boolean r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto La
            androidx.appcompat.widget.DropDownListView.Api33Impl.setSelectedChildViewEnabled(r2, r3)
            goto Ld
        La:
            androidx.appcompat.widget.DropDownListView.PreApi33Impl.setSelectedChildViewEnabled(r2, r3)
        Ld:
            return
    }

    private boolean touchModeDrawsInPressedStateCompat() {
            r1 = this;
            boolean r0 = r1.mDrawsInPressedState
            return r0
    }

    private void updateSelectorStateCompat() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.getSelector()
            if (r0 == 0) goto L19
            boolean r1 = r2.touchModeDrawsInPressedStateCompat()
            if (r1 == 0) goto L19
            boolean r1 = r2.isPressed()
            if (r1 == 0) goto L19
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L19:
            return
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r2) {
            r1 = this;
            r0 = 0
            r1.drawSelectorCompat(r2)
            super.dispatchDraw(r2)
            return
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            androidx.appcompat.widget.DropDownListView$ResolveHoverRunnable r0 = r1.mResolveHoverRunnable
            if (r0 == 0) goto L5
            return
        L5:
            super.drawableStateChanged()
            r0 = 1
            r1.setSelectorEnabled(r0)
            r1.updateSelectorStateCompat()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
            r1 = this;
            boolean r0 = r1.mHijackFocus
            if (r0 != 0) goto Ld
            boolean r0 = super.hasFocus()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
            r1 = this;
            boolean r0 = r1.mHijackFocus
            if (r0 != 0) goto Ld
            boolean r0 = super.hasWindowFocus()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Override // android.view.View
    public boolean isFocused() {
            r1 = this;
            boolean r0 = r1.mHijackFocus
            if (r0 != 0) goto Ld
            boolean r0 = super.isFocused()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
            r1 = this;
            boolean r0 = r1.mHijackFocus
            if (r0 == 0) goto L8
            boolean r0 = r1.mListSelectionHidden
            if (r0 != 0) goto Le
        L8:
            boolean r0 = super.isInTouchMode()
            if (r0 == 0) goto L10
        Le:
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public int lookForSelectablePosition(int r5, boolean r6) {
            r4 = this;
            android.widget.ListAdapter r0 = r4.getAdapter()
            r1 = -1
            if (r0 == 0) goto L4d
            boolean r2 = r4.isInTouchMode()
            if (r2 == 0) goto Le
            goto L4d
        Le:
            int r2 = r0.getCount()
            android.widget.ListAdapter r3 = r4.getAdapter()
            boolean r3 = r3.areAllItemsEnabled()
            if (r3 != 0) goto L46
            if (r6 == 0) goto L2e
            r3 = 0
            int r5 = java.lang.Math.max(r3, r5)
        L23:
            if (r5 >= r2) goto L3f
            boolean r3 = r0.isEnabled(r5)
            if (r3 != 0) goto L3f
            int r5 = r5 + 1
            goto L23
        L2e:
            int r3 = r2 + (-1)
            int r5 = java.lang.Math.min(r5, r3)
        L34:
            if (r5 < 0) goto L3f
            boolean r3 = r0.isEnabled(r5)
            if (r3 != 0) goto L3f
            int r5 = r5 + (-1)
            goto L34
        L3f:
            if (r5 < 0) goto L45
            if (r5 < r2) goto L44
            goto L45
        L44:
            return r5
        L45:
            return r1
        L46:
            if (r5 < 0) goto L4c
            if (r5 < r2) goto L4b
            goto L4c
        L4b:
            return r5
        L4c:
            return r1
        L4d:
            return r1
    }

    public int measureHeightOfChildrenCompat(int r22, int r23, int r24, int r25, int r26) {
            r21 = this;
            r0 = r25
            r1 = r26
            int r2 = r21.getListPaddingTop()
            int r3 = r21.getListPaddingBottom()
            int r4 = r21.getDividerHeight()
            android.graphics.drawable.Drawable r5 = r21.getDivider()
            android.widget.ListAdapter r6 = r21.getAdapter()
            if (r6 != 0) goto L1d
            int r7 = r2 + r3
            return r7
        L1d:
            int r7 = r2 + r3
            if (r4 <= 0) goto L25
            if (r5 == 0) goto L25
            r9 = r4
            goto L26
        L25:
            r9 = 0
        L26:
            r10 = 0
            r11 = 0
            r12 = 0
            int r13 = r6.getCount()
            r14 = 0
        L2e:
            if (r14 >= r13) goto L99
            int r15 = r6.getItemViewType(r14)
            if (r15 == r12) goto L38
            r11 = 0
            r12 = r15
        L38:
            r8 = r21
            android.view.View r11 = r6.getView(r14, r11, r8)
            android.view.ViewGroup$LayoutParams r17 = r11.getLayoutParams()
            if (r17 != 0) goto L4e
            r18 = r2
            android.view.ViewGroup$LayoutParams r2 = r8.generateDefaultLayoutParams()
            r11.setLayoutParams(r2)
            goto L52
        L4e:
            r18 = r2
            r2 = r17
        L52:
            r17 = r3
            int r3 = r2.height
            if (r3 <= 0) goto L65
            int r3 = r2.height
            r19 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r3 = r2
            r2 = 0
            goto L6c
        L65:
            r19 = r2
            r2 = 0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
        L6c:
            r2 = r22
            r11.measure(r2, r3)
            r11.forceLayout()
            if (r14 <= 0) goto L77
            int r7 = r7 + r9
        L77:
            int r20 = r11.getMeasuredHeight()
            int r7 = r7 + r20
            if (r7 < r0) goto L8d
            if (r1 < 0) goto L8a
            if (r14 <= r1) goto L8a
            if (r10 <= 0) goto L8a
            if (r7 == r0) goto L8a
            r16 = r10
            goto L8c
        L8a:
            r16 = r0
        L8c:
            return r16
        L8d:
            if (r1 < 0) goto L92
            if (r14 < r1) goto L92
            r10 = r7
        L92:
            int r14 = r14 + 1
            r3 = r17
            r2 = r18
            goto L2e
        L99:
            return r7
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            r0 = 0
            r1.mResolveHoverRunnable = r0
            super.onDetachedFromWindow()
            return
    }

    public boolean onForwardedEvent(android.view.MotionEvent r12, int r13) {
            r11 = this;
            r0 = 1
            r1 = 0
            int r2 = r12.getActionMasked()
            r3 = 1
            switch(r2) {
                case 1: goto Ld;
                case 2: goto Le;
                case 3: goto Lb;
                default: goto La;
            }
        La:
            goto L3e
        Lb:
            r0 = 0
            goto L3e
        Ld:
            r0 = 0
        Le:
            int r4 = r12.findPointerIndex(r13)
            if (r4 >= 0) goto L16
            r0 = 0
            goto L3e
        L16:
            float r5 = r12.getX(r4)
            int r5 = (int) r5
            float r6 = r12.getY(r4)
            int r6 = (int) r6
            int r7 = r11.pointToPosition(r5, r6)
            r8 = -1
            if (r7 != r8) goto L29
            r1 = 1
            goto L3e
        L29:
            int r8 = r11.getFirstVisiblePosition()
            int r8 = r7 - r8
            android.view.View r8 = r11.getChildAt(r8)
            float r9 = (float) r5
            float r10 = (float) r6
            r11.setPressedItem(r8, r7, r9, r10)
            r0 = 1
            if (r2 != r3) goto L3e
            r11.clickPressedItem(r8, r7)
        L3e:
            if (r0 == 0) goto L42
            if (r1 == 0) goto L45
        L42:
            r11.clearPressedItem()
        L45:
            if (r0 == 0) goto L5d
            androidx.core.widget.ListViewAutoScrollHelper r4 = r11.mScrollHelper
            if (r4 != 0) goto L52
            androidx.core.widget.ListViewAutoScrollHelper r4 = new androidx.core.widget.ListViewAutoScrollHelper
            r4.<init>(r11)
            r11.mScrollHelper = r4
        L52:
            androidx.core.widget.ListViewAutoScrollHelper r4 = r11.mScrollHelper
            r4.setEnabled(r3)
            androidx.core.widget.ListViewAutoScrollHelper r3 = r11.mScrollHelper
            r3.onTouch(r11, r12)
            goto L67
        L5d:
            androidx.core.widget.ListViewAutoScrollHelper r3 = r11.mScrollHelper
            if (r3 == 0) goto L67
            androidx.core.widget.ListViewAutoScrollHelper r3 = r11.mScrollHelper
            r4 = 0
            r3.setEnabled(r4)
        L67:
            return r0
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto Lb
            boolean r0 = super.onHoverEvent(r7)
            return r0
        Lb:
            int r0 = r7.getActionMasked()
            r1 = 10
            if (r0 != r1) goto L23
            androidx.appcompat.widget.DropDownListView$ResolveHoverRunnable r1 = r6.mResolveHoverRunnable
            if (r1 != 0) goto L23
            androidx.appcompat.widget.DropDownListView$ResolveHoverRunnable r1 = new androidx.appcompat.widget.DropDownListView$ResolveHoverRunnable
            r1.<init>(r6)
            r6.mResolveHoverRunnable = r1
            androidx.appcompat.widget.DropDownListView$ResolveHoverRunnable r1 = r6.mResolveHoverRunnable
            r1.post()
        L23:
            boolean r1 = super.onHoverEvent(r7)
            r2 = 9
            r3 = -1
            if (r0 == r2) goto L34
            r2 = 7
            if (r0 != r2) goto L30
            goto L34
        L30:
            r6.setSelection(r3)
            goto L7d
        L34:
            float r2 = r7.getX()
            int r2 = (int) r2
            float r4 = r7.getY()
            int r4 = (int) r4
            int r2 = r6.pointToPosition(r2, r4)
            if (r2 == r3) goto L7c
            int r3 = r6.getSelectedItemPosition()
            if (r2 == r3) goto L7c
            int r3 = r6.getFirstVisiblePosition()
            int r3 = r2 - r3
            android.view.View r3 = r6.getChildAt(r3)
            boolean r4 = r3.isEnabled()
            if (r4 == 0) goto L79
            r6.requestFocus()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r4 < r5) goto L6d
            boolean r4 = androidx.appcompat.widget.DropDownListView.Api30Impl.canPositionSelectorForHoveredItem()
            if (r4 == 0) goto L6d
            androidx.appcompat.widget.DropDownListView.Api30Impl.positionSelectorForHoveredItem(r6, r2, r3)
            goto L79
        L6d:
            int r4 = r3.getTop()
            int r5 = r6.getTop()
            int r4 = r4 - r5
            r6.setSelectionFromTop(r2, r4)
        L79:
            r6.updateSelectorStateCompat()
        L7c:
        L7d:
            return r1
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            int r0 = r3.getAction()
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L18
        L8:
            float r0 = r3.getX()
            int r0 = (int) r0
            float r1 = r3.getY()
            int r1 = (int) r1
            int r0 = r2.pointToPosition(r0, r1)
            r2.mMotionPosition = r0
        L18:
            androidx.appcompat.widget.DropDownListView$ResolveHoverRunnable r0 = r2.mResolveHoverRunnable
            if (r0 == 0) goto L21
            androidx.appcompat.widget.DropDownListView$ResolveHoverRunnable r0 = r2.mResolveHoverRunnable
            r0.cancel()
        L21:
            boolean r0 = super.onTouchEvent(r3)
            return r0
    }

    void setListSelectionHidden(boolean r1) {
            r0 = this;
            r0.mListSelectionHidden = r1
            return
    }

    @Override // android.widget.AbsListView
    public void setSelector(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 == 0) goto L8
            androidx.appcompat.widget.DropDownListView$GateKeeperDrawable r0 = new androidx.appcompat.widget.DropDownListView$GateKeeperDrawable
            r0.<init>(r3)
            goto L9
        L8:
            r0 = 0
        L9:
            r2.mSelector = r0
            androidx.appcompat.widget.DropDownListView$GateKeeperDrawable r0 = r2.mSelector
            super.setSelector(r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            if (r3 == 0) goto L1a
            r3.getPadding(r0)
        L1a:
            int r1 = r0.left
            r2.mSelectionLeftPadding = r1
            int r1 = r0.top
            r2.mSelectionTopPadding = r1
            int r1 = r0.right
            r2.mSelectionRightPadding = r1
            int r1 = r0.bottom
            r2.mSelectionBottomPadding = r1
            return
    }
}
