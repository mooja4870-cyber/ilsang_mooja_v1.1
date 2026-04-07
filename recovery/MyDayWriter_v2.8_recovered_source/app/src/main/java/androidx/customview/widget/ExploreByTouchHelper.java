package androidx.customview.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class ExploreByTouchHelper extends androidx.core.view.AccessibilityDelegateCompat {
    private static final java.lang.String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final android.graphics.Rect INVALID_PARENT_BOUNDS = null;
    private static final androidx.customview.widget.FocusStrategy.BoundsAdapter<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> NODE_ADAPTER = null;
    private static final androidx.customview.widget.FocusStrategy.CollectionAdapter<androidx.collection.SparseArrayCompat<androidx.core.view.accessibility.AccessibilityNodeInfoCompat>, androidx.core.view.accessibility.AccessibilityNodeInfoCompat> SPARSE_VALUES_ADAPTER = null;
    int mAccessibilityFocusedVirtualViewId;
    private final android.view.View mHost;
    private int mHoveredVirtualViewId;
    int mKeyboardFocusedVirtualViewId;
    private final android.view.accessibility.AccessibilityManager mManager;
    private androidx.customview.widget.ExploreByTouchHelper.MyNodeProvider mNodeProvider;
    private final int[] mTempGlobalRect;
    private final android.graphics.Rect mTempParentRect;
    private final android.graphics.Rect mTempScreenRect;
    private final android.graphics.Rect mTempVisibleRect;



    private class MyNodeProvider extends androidx.core.view.accessibility.AccessibilityNodeProviderCompat {
        final /* synthetic */ androidx.customview.widget.ExploreByTouchHelper this$0;

        MyNodeProvider(androidx.customview.widget.ExploreByTouchHelper r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public androidx.core.view.accessibility.AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int r3) {
                r2 = this;
                androidx.customview.widget.ExploreByTouchHelper r0 = r2.this$0
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = r0.obtainAccessibilityNodeInfo(r3)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r1 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain(r0)
                return r1
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public androidx.core.view.accessibility.AccessibilityNodeInfoCompat findFocus(int r3) {
                r2 = this;
                r0 = 2
                if (r3 != r0) goto L8
                androidx.customview.widget.ExploreByTouchHelper r0 = r2.this$0
                int r0 = r0.mAccessibilityFocusedVirtualViewId
                goto Lc
            L8:
                androidx.customview.widget.ExploreByTouchHelper r0 = r2.this$0
                int r0 = r0.mKeyboardFocusedVirtualViewId
            Lc:
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 != r1) goto L12
                r1 = 0
                return r1
            L12:
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r1 = r2.createAccessibilityNodeInfo(r0)
                return r1
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public boolean performAction(int r2, int r3, android.os.Bundle r4) {
                r1 = this;
                androidx.customview.widget.ExploreByTouchHelper r0 = r1.this$0
                boolean r0 = r0.performAction(r2, r3, r4)
                return r0
        }
    }

    static {
            android.graphics.Rect r0 = new android.graphics.Rect
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.<init>(r1, r1, r2, r2)
            androidx.customview.widget.ExploreByTouchHelper.INVALID_PARENT_BOUNDS = r0
            androidx.customview.widget.ExploreByTouchHelper$1 r0 = new androidx.customview.widget.ExploreByTouchHelper$1
            r0.<init>()
            androidx.customview.widget.ExploreByTouchHelper.NODE_ADAPTER = r0
            androidx.customview.widget.ExploreByTouchHelper$2 r0 = new androidx.customview.widget.ExploreByTouchHelper$2
            r0.<init>()
            androidx.customview.widget.ExploreByTouchHelper.SPARSE_VALUES_ADAPTER = r0
            return
    }

    public ExploreByTouchHelper(android.view.View r4) {
            r3 = this;
            r3.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.mTempScreenRect = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.mTempParentRect = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.mTempVisibleRect = r0
            r0 = 2
            int[] r0 = new int[r0]
            r3.mTempGlobalRect = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.mAccessibilityFocusedVirtualViewId = r0
            r3.mKeyboardFocusedVirtualViewId = r0
            r3.mHoveredVirtualViewId = r0
            if (r4 == 0) goto L45
            r3.mHost = r4
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r3.mManager = r1
            r1 = 1
            r4.setFocusable(r1)
            int r2 = androidx.core.view.ViewCompat.getImportantForAccessibility(r4)
            if (r2 != 0) goto L44
            androidx.core.view.ViewCompat.setImportantForAccessibility(r4, r1)
        L44:
            return
        L45:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "View may not be null"
            r0.<init>(r1)
            throw r0
    }

    private boolean clearAccessibilityFocus(int r2) {
            r1 = this;
            int r0 = r1.mAccessibilityFocusedVirtualViewId
            if (r0 != r2) goto L14
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.mAccessibilityFocusedVirtualViewId = r0
            android.view.View r0 = r1.mHost
            r0.invalidate()
            r0 = 65536(0x10000, float:9.1835E-41)
            r1.sendEventForVirtualView(r2, r0)
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    private boolean clickKeyboardFocusedVirtualView() {
            r3 = this;
            int r0 = r3.mKeyboardFocusedVirtualViewId
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L13
            int r0 = r3.mKeyboardFocusedVirtualViewId
            r1 = 16
            r2 = 0
            boolean r0 = r3.onPerformActionForVirtualView(r0, r1, r2)
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    private android.view.accessibility.AccessibilityEvent createEvent(int r2, int r3) {
            r1 = this;
            switch(r2) {
                case -1: goto L8;
                default: goto L3;
            }
        L3:
            android.view.accessibility.AccessibilityEvent r0 = r1.createEventForChild(r2, r3)
            return r0
        L8:
            android.view.accessibility.AccessibilityEvent r0 = r1.createEventForHost(r3)
            return r0
    }

    private android.view.accessibility.AccessibilityEvent createEventForChild(int r5, int r6) {
            r4 = this;
            android.view.accessibility.AccessibilityEvent r0 = android.view.accessibility.AccessibilityEvent.obtain(r6)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r1 = r4.obtainAccessibilityNodeInfo(r5)
            java.util.List r2 = r0.getText()
            java.lang.CharSequence r3 = r1.getText()
            r2.add(r3)
            java.lang.CharSequence r2 = r1.getContentDescription()
            r0.setContentDescription(r2)
            boolean r2 = r1.isScrollable()
            r0.setScrollable(r2)
            boolean r2 = r1.isPassword()
            r0.setPassword(r2)
            boolean r2 = r1.isEnabled()
            r0.setEnabled(r2)
            boolean r2 = r1.isChecked()
            r0.setChecked(r2)
            r4.onPopulateEventForVirtualView(r5, r0)
            java.util.List r2 = r0.getText()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L52
            java.lang.CharSequence r2 = r0.getContentDescription()
            if (r2 == 0) goto L4a
            goto L52
        L4a:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Callbacks must add text or a content description in populateEventForVirtualViewId()"
            r2.<init>(r3)
            throw r2
        L52:
            java.lang.CharSequence r2 = r1.getClassName()
            r0.setClassName(r2)
            android.view.View r2 = r4.mHost
            androidx.core.view.accessibility.AccessibilityRecordCompat.setSource(r0, r2, r5)
            android.view.View r2 = r4.mHost
            android.content.Context r2 = r2.getContext()
            java.lang.String r2 = r2.getPackageName()
            r0.setPackageName(r2)
            return r0
    }

    private android.view.accessibility.AccessibilityEvent createEventForHost(int r3) {
            r2 = this;
            android.view.accessibility.AccessibilityEvent r0 = android.view.accessibility.AccessibilityEvent.obtain(r3)
            android.view.View r1 = r2.mHost
            r1.onInitializeAccessibilityEvent(r0)
            return r0
    }

    private androidx.core.view.accessibility.AccessibilityNodeInfoCompat createNodeForChild(int r12) {
            r11 = this;
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain()
            r1 = 1
            r0.setEnabled(r1)
            r0.setFocusable(r1)
            java.lang.String r2 = "android.view.View"
            r0.setClassName(r2)
            android.graphics.Rect r2 = androidx.customview.widget.ExploreByTouchHelper.INVALID_PARENT_BOUNDS
            r0.setBoundsInParent(r2)
            android.graphics.Rect r2 = androidx.customview.widget.ExploreByTouchHelper.INVALID_PARENT_BOUNDS
            r0.setBoundsInScreen(r2)
            android.view.View r2 = r11.mHost
            r0.setParent(r2)
            r11.onPopulateNodeForVirtualView(r12, r0)
            java.lang.CharSequence r2 = r0.getText()
            if (r2 != 0) goto L37
            java.lang.CharSequence r2 = r0.getContentDescription()
            if (r2 == 0) goto L2f
            goto L37
        L2f:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Callbacks must add text or a content description in populateNodeForVirtualViewId()"
            r1.<init>(r2)
            throw r1
        L37:
            android.graphics.Rect r2 = r11.mTempParentRect
            r0.getBoundsInParent(r2)
            android.graphics.Rect r2 = r11.mTempParentRect
            android.graphics.Rect r3 = androidx.customview.widget.ExploreByTouchHelper.INVALID_PARENT_BOUNDS
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L14c
            int r2 = r0.getActions()
            r3 = r2 & 64
            if (r3 != 0) goto L144
            r3 = r2 & 128(0x80, float:1.8E-43)
            if (r3 != 0) goto L13c
            android.view.View r3 = r11.mHost
            android.content.Context r3 = r3.getContext()
            java.lang.String r3 = r3.getPackageName()
            r0.setPackageName(r3)
            android.view.View r3 = r11.mHost
            r0.setSource(r3, r12)
            int r3 = r11.mAccessibilityFocusedVirtualViewId
            r4 = 0
            if (r3 != r12) goto L72
            r0.setAccessibilityFocused(r1)
            r3 = 128(0x80, float:1.8E-43)
            r0.addAction(r3)
            goto L7a
        L72:
            r0.setAccessibilityFocused(r4)
            r3 = 64
            r0.addAction(r3)
        L7a:
            int r3 = r11.mKeyboardFocusedVirtualViewId
            if (r3 != r12) goto L80
            r3 = r1
            goto L81
        L80:
            r3 = r4
        L81:
            if (r3 == 0) goto L88
            r5 = 2
            r0.addAction(r5)
            goto L91
        L88:
            boolean r5 = r0.isFocusable()
            if (r5 == 0) goto L91
            r0.addAction(r1)
        L91:
            r0.setFocused(r3)
            android.view.View r5 = r11.mHost
            int[] r6 = r11.mTempGlobalRect
            r5.getLocationOnScreen(r6)
            android.graphics.Rect r5 = r11.mTempScreenRect
            r0.getBoundsInScreen(r5)
            android.graphics.Rect r5 = r11.mTempScreenRect
            android.graphics.Rect r6 = androidx.customview.widget.ExploreByTouchHelper.INVALID_PARENT_BOUNDS
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lfc
            android.graphics.Rect r5 = r11.mTempScreenRect
            r0.getBoundsInParent(r5)
            int r5 = r0.mParentVirtualDescendantId
            r6 = -1
            if (r5 == r6) goto Le1
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r5 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain()
            int r7 = r0.mParentVirtualDescendantId
        Lba:
            if (r7 == r6) goto Lde
            android.view.View r8 = r11.mHost
            r5.setParent(r8, r6)
            android.graphics.Rect r8 = androidx.customview.widget.ExploreByTouchHelper.INVALID_PARENT_BOUNDS
            r5.setBoundsInParent(r8)
            r11.onPopulateNodeForVirtualView(r7, r5)
            android.graphics.Rect r8 = r11.mTempParentRect
            r5.getBoundsInParent(r8)
            android.graphics.Rect r8 = r11.mTempScreenRect
            android.graphics.Rect r9 = r11.mTempParentRect
            int r9 = r9.left
            android.graphics.Rect r10 = r11.mTempParentRect
            int r10 = r10.top
            r8.offset(r9, r10)
            int r7 = r5.mParentVirtualDescendantId
            goto Lba
        Lde:
            r5.recycle()
        Le1:
            android.graphics.Rect r5 = r11.mTempScreenRect
            int[] r6 = r11.mTempGlobalRect
            r6 = r6[r4]
            android.view.View r7 = r11.mHost
            int r7 = r7.getScrollX()
            int r6 = r6 - r7
            int[] r7 = r11.mTempGlobalRect
            r7 = r7[r1]
            android.view.View r8 = r11.mHost
            int r8 = r8.getScrollY()
            int r7 = r7 - r8
            r5.offset(r6, r7)
        Lfc:
            android.view.View r5 = r11.mHost
            android.graphics.Rect r6 = r11.mTempVisibleRect
            boolean r5 = r5.getLocalVisibleRect(r6)
            if (r5 == 0) goto L13b
            android.graphics.Rect r5 = r11.mTempVisibleRect
            int[] r6 = r11.mTempGlobalRect
            r4 = r6[r4]
            android.view.View r6 = r11.mHost
            int r6 = r6.getScrollX()
            int r4 = r4 - r6
            int[] r6 = r11.mTempGlobalRect
            r6 = r6[r1]
            android.view.View r7 = r11.mHost
            int r7 = r7.getScrollY()
            int r6 = r6 - r7
            r5.offset(r4, r6)
            android.graphics.Rect r4 = r11.mTempScreenRect
            android.graphics.Rect r5 = r11.mTempVisibleRect
            boolean r4 = r4.intersect(r5)
            if (r4 == 0) goto L13b
            android.graphics.Rect r5 = r11.mTempScreenRect
            r0.setBoundsInScreen(r5)
            android.graphics.Rect r5 = r11.mTempScreenRect
            boolean r5 = r11.isVisibleToUser(r5)
            if (r5 == 0) goto L13b
            r0.setVisibleToUser(r1)
        L13b:
            return r0
        L13c:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r3 = "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"
            r1.<init>(r3)
            throw r1
        L144:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r3 = "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"
            r1.<init>(r3)
            throw r1
        L14c:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Callbacks must set parent bounds in populateNodeForVirtualViewId()"
            r1.<init>(r2)
            throw r1
    }

    private androidx.core.view.accessibility.AccessibilityNodeInfoCompat createNodeForHost() {
            r7 = this;
            android.view.View r0 = r7.mHost
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain(r0)
            android.view.View r1 = r7.mHost
            androidx.core.view.ViewCompat.onInitializeAccessibilityNodeInfo(r1, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7.getVisibleVirtualViews(r1)
            int r2 = r0.getChildCount()
            if (r2 <= 0) goto L28
            int r3 = r1.size()
            if (r3 > 0) goto L20
            goto L28
        L20:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Views cannot have both real and virtual children"
            r3.<init>(r4)
            throw r3
        L28:
            r3 = 0
            int r4 = r1.size()
        L2d:
            if (r3 >= r4) goto L41
            android.view.View r5 = r7.mHost
            java.lang.Object r6 = r1.get(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.addChild(r5, r6)
            int r3 = r3 + 1
            goto L2d
        L41:
            return r0
    }

    private androidx.collection.SparseArrayCompat<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> getAllNodes() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.getVisibleVirtualViews(r0)
            androidx.collection.SparseArrayCompat r1 = new androidx.collection.SparseArrayCompat
            r1.<init>()
            r2 = 0
        Le:
            int r3 = r0.size()
            if (r2 >= r3) goto L1e
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r3 = r4.createNodeForChild(r2)
            r1.put(r2, r3)
            int r2 = r2 + 1
            goto Le
        L1e:
            return r1
    }

    private void getBoundsInParent(int r2, android.graphics.Rect r3) {
            r1 = this;
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = r1.obtainAccessibilityNodeInfo(r2)
            r0.getBoundsInParent(r3)
            return
    }

    private static android.graphics.Rect guessPreviouslyFocusedRect(android.view.View r4, int r5, android.graphics.Rect r6) {
            int r0 = r4.getWidth()
            int r1 = r4.getHeight()
            r2 = -1
            r3 = 0
            switch(r5) {
                case 17: goto L21;
                case 33: goto L1d;
                case 66: goto L19;
                case 130: goto L15;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r2.<init>(r3)
            throw r2
        L15:
            r6.set(r3, r2, r0, r2)
            goto L25
        L19:
            r6.set(r2, r3, r2, r1)
            goto L25
        L1d:
            r6.set(r3, r1, r0, r1)
            goto L25
        L21:
            r6.set(r0, r3, r0, r1)
        L25:
            return r6
    }

    private boolean isVisibleToUser(android.graphics.Rect r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L3a
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto La
            goto L3a
        La:
            android.view.View r1 = r5.mHost
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L13
            return r0
        L13:
            android.view.View r1 = r5.mHost
            android.view.ViewParent r1 = r1.getParent()
        L19:
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L36
            r2 = r1
            android.view.View r2 = (android.view.View) r2
            float r3 = r2.getAlpha()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L35
            int r3 = r2.getVisibility()
            if (r3 == 0) goto L30
            goto L35
        L30:
            android.view.ViewParent r1 = r2.getParent()
            goto L19
        L35:
            return r0
        L36:
            if (r1 == 0) goto L39
            r0 = 1
        L39:
            return r0
        L3a:
            return r0
    }

    private static int keyToDirection(int r1) {
            switch(r1) {
                case 19: goto Lc;
                case 20: goto L3;
                case 21: goto L9;
                case 22: goto L6;
                default: goto L3;
            }
        L3:
            r0 = 130(0x82, float:1.82E-43)
            return r0
        L6:
            r0 = 66
            return r0
        L9:
            r0 = 17
            return r0
        Lc:
            r0 = 33
            return r0
    }

    private boolean moveFocus(int r9, android.graphics.Rect r10) {
            r8 = this;
            androidx.collection.SparseArrayCompat r0 = r8.getAllNodes()
            int r7 = r8.mKeyboardFocusedVirtualViewId
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 != r1) goto Ld
            r2 = 0
            r3 = r2
            goto L14
        Ld:
            java.lang.Object r2 = r0.get(r7)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) r2
            r3 = r2
        L14:
            switch(r9) {
                case 1: goto L49;
                case 2: goto L49;
                case 17: goto L21;
                case 33: goto L21;
                case 66: goto L21;
                case 130: goto L21;
                default: goto L18;
            }
        L18:
            r4 = r9
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r9.<init>(r1)
            throw r9
        L21:
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            int r2 = r8.mKeyboardFocusedVirtualViewId
            if (r2 == r1) goto L30
            int r1 = r8.mKeyboardFocusedVirtualViewId
            r8.getBoundsInParent(r1, r4)
            goto L3b
        L30:
            if (r10 == 0) goto L36
            r4.set(r10)
            goto L3b
        L36:
            android.view.View r1 = r8.mHost
            guessPreviouslyFocusedRect(r1, r9, r4)
        L3b:
            androidx.customview.widget.FocusStrategy$CollectionAdapter<androidx.collection.SparseArrayCompat<androidx.core.view.accessibility.AccessibilityNodeInfoCompat>, androidx.core.view.accessibility.AccessibilityNodeInfoCompat> r1 = androidx.customview.widget.ExploreByTouchHelper.SPARSE_VALUES_ADAPTER
            androidx.customview.widget.FocusStrategy$BoundsAdapter<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> r2 = androidx.customview.widget.ExploreByTouchHelper.NODE_ADAPTER
            r5 = r9
            java.lang.Object r9 = androidx.customview.widget.FocusStrategy.findNextFocusInAbsoluteDirection(r0, r1, r2, r3, r4, r5)
            r1 = r4
            r4 = r5
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r9 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) r9
            goto L62
        L49:
            r4 = r9
            android.view.View r9 = r8.mHost
            int r9 = androidx.core.view.ViewCompat.getLayoutDirection(r9)
            r1 = 1
            if (r9 != r1) goto L54
            goto L55
        L54:
            r1 = 0
        L55:
            r5 = r1
            androidx.customview.widget.FocusStrategy$CollectionAdapter<androidx.collection.SparseArrayCompat<androidx.core.view.accessibility.AccessibilityNodeInfoCompat>, androidx.core.view.accessibility.AccessibilityNodeInfoCompat> r1 = androidx.customview.widget.ExploreByTouchHelper.SPARSE_VALUES_ADAPTER
            androidx.customview.widget.FocusStrategy$BoundsAdapter<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> r2 = androidx.customview.widget.ExploreByTouchHelper.NODE_ADAPTER
            r6 = 0
            java.lang.Object r9 = androidx.customview.widget.FocusStrategy.findNextFocusInRelativeDirection(r0, r1, r2, r3, r4, r5, r6)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r9 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) r9
        L62:
            if (r9 != 0) goto L67
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L70
        L67:
            int r1 = r0.indexOfValue(r9)
            int r2 = r0.keyAt(r1)
            r1 = r2
        L70:
            boolean r2 = r8.requestKeyboardFocusForVirtualView(r1)
            return r2
    }

    private boolean performActionForChild(int r2, int r3, android.os.Bundle r4) {
            r1 = this;
            switch(r3) {
                case 1: goto L17;
                case 2: goto L12;
                case 64: goto Ld;
                case 128: goto L8;
                default: goto L3;
            }
        L3:
            boolean r0 = r1.onPerformActionForVirtualView(r2, r3, r4)
            return r0
        L8:
            boolean r0 = r1.clearAccessibilityFocus(r2)
            return r0
        Ld:
            boolean r0 = r1.requestAccessibilityFocus(r2)
            return r0
        L12:
            boolean r0 = r1.clearKeyboardFocusForVirtualView(r2)
            return r0
        L17:
            boolean r0 = r1.requestKeyboardFocusForVirtualView(r2)
            return r0
    }

    private boolean performActionForHost(int r2, android.os.Bundle r3) {
            r1 = this;
            android.view.View r0 = r1.mHost
            boolean r0 = androidx.core.view.ViewCompat.performAccessibilityAction(r0, r2, r3)
            return r0
    }

    private boolean requestAccessibilityFocus(int r3) {
            r2 = this;
            android.view.accessibility.AccessibilityManager r0 = r2.mManager
            boolean r0 = r0.isEnabled()
            r1 = 0
            if (r0 == 0) goto L31
            android.view.accessibility.AccessibilityManager r0 = r2.mManager
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 != 0) goto L12
            goto L31
        L12:
            int r0 = r2.mAccessibilityFocusedVirtualViewId
            if (r0 == r3) goto L30
            int r0 = r2.mAccessibilityFocusedVirtualViewId
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L21
            int r0 = r2.mAccessibilityFocusedVirtualViewId
            r2.clearAccessibilityFocus(r0)
        L21:
            r2.mAccessibilityFocusedVirtualViewId = r3
            android.view.View r0 = r2.mHost
            r0.invalidate()
            r0 = 32768(0x8000, float:4.5918E-41)
            r2.sendEventForVirtualView(r3, r0)
            r0 = 1
            return r0
        L30:
            return r1
        L31:
            return r1
    }

    private void updateHoveredVirtualView(int r3) {
            r2 = this;
            int r0 = r2.mHoveredVirtualViewId
            if (r0 != r3) goto L5
            return
        L5:
            int r0 = r2.mHoveredVirtualViewId
            r2.mHoveredVirtualViewId = r3
            r1 = 128(0x80, float:1.8E-43)
            r2.sendEventForVirtualView(r3, r1)
            r1 = 256(0x100, float:3.59E-43)
            r2.sendEventForVirtualView(r0, r1)
            return
    }

    public final boolean clearKeyboardFocusForVirtualView(int r3) {
            r2 = this;
            int r0 = r2.mKeyboardFocusedVirtualViewId
            r1 = 0
            if (r0 == r3) goto L6
            return r1
        L6:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.mKeyboardFocusedVirtualViewId = r0
            r2.onVirtualViewKeyboardFocusChanged(r3, r1)
            r0 = 8
            r2.sendEventForVirtualView(r3, r0)
            r0 = 1
            return r0
    }

    public final boolean dispatchHoverEvent(android.view.MotionEvent r6) {
            r5 = this;
            android.view.accessibility.AccessibilityManager r0 = r5.mManager
            boolean r0 = r0.isEnabled()
            r1 = 0
            if (r0 == 0) goto L39
            android.view.accessibility.AccessibilityManager r0 = r5.mManager
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 != 0) goto L12
            goto L39
        L12:
            int r0 = r6.getAction()
            r2 = 1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            switch(r0) {
                case 7: goto L26;
                case 8: goto L1c;
                case 9: goto L26;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            return r1
        L1d:
            int r0 = r5.mHoveredVirtualViewId
            if (r0 == r3) goto L25
            r5.updateHoveredVirtualView(r3)
            return r2
        L25:
            return r1
        L26:
            float r0 = r6.getX()
            float r4 = r6.getY()
            int r0 = r5.getVirtualViewAt(r0, r4)
            r5.updateHoveredVirtualView(r0)
            if (r0 == r3) goto L38
            r1 = r2
        L38:
            return r1
        L39:
            return r1
    }

    public final boolean dispatchKeyEvent(android.view.KeyEvent r9) {
            r8 = this;
            r0 = 0
            int r1 = r9.getAction()
            r2 = 1
            if (r1 == r2) goto L56
            int r3 = r9.getKeyCode()
            r4 = 0
            switch(r3) {
                case 19: goto L39;
                case 20: goto L39;
                case 21: goto L39;
                case 22: goto L39;
                case 23: goto L28;
                case 61: goto L11;
                case 66: goto L28;
                default: goto L10;
            }
        L10:
            goto L56
        L11:
            boolean r5 = r9.hasNoModifiers()
            if (r5 == 0) goto L1d
            r2 = 2
            boolean r0 = r8.moveFocus(r2, r4)
            goto L56
        L1d:
            boolean r5 = r9.hasModifiers(r2)
            if (r5 == 0) goto L56
            boolean r0 = r8.moveFocus(r2, r4)
            goto L56
        L28:
            boolean r2 = r9.hasNoModifiers()
            if (r2 == 0) goto L56
            int r2 = r9.getRepeatCount()
            if (r2 != 0) goto L56
            r8.clickKeyboardFocusedVirtualView()
            r0 = 1
            goto L56
        L39:
            boolean r5 = r9.hasNoModifiers()
            if (r5 == 0) goto L56
            int r5 = keyToDirection(r3)
            int r6 = r9.getRepeatCount()
            int r6 = r6 + r2
            r2 = 0
        L49:
            if (r2 >= r6) goto L55
            boolean r7 = r8.moveFocus(r5, r4)
            if (r7 == 0) goto L55
            r0 = 1
            int r2 = r2 + 1
            goto L49
        L55:
        L56:
            return r0
    }

    public final int getAccessibilityFocusedVirtualViewId() {
            r1 = this;
            int r0 = r1.mAccessibilityFocusedVirtualViewId
            return r0
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public androidx.core.view.accessibility.AccessibilityNodeProviderCompat getAccessibilityNodeProvider(android.view.View r2) {
            r1 = this;
            androidx.customview.widget.ExploreByTouchHelper$MyNodeProvider r0 = r1.mNodeProvider
            if (r0 != 0) goto Lb
            androidx.customview.widget.ExploreByTouchHelper$MyNodeProvider r0 = new androidx.customview.widget.ExploreByTouchHelper$MyNodeProvider
            r0.<init>(r1)
            r1.mNodeProvider = r0
        Lb:
            androidx.customview.widget.ExploreByTouchHelper$MyNodeProvider r0 = r1.mNodeProvider
            return r0
    }

    @java.lang.Deprecated
    public int getFocusedVirtualView() {
            r1 = this;
            int r0 = r1.getAccessibilityFocusedVirtualViewId()
            return r0
    }

    public final int getKeyboardFocusedVirtualViewId() {
            r1 = this;
            int r0 = r1.mKeyboardFocusedVirtualViewId
            return r0
    }

    protected abstract int getVirtualViewAt(float r1, float r2);

    protected abstract void getVisibleVirtualViews(java.util.List<java.lang.Integer> r1);

    public final void invalidateRoot() {
            r2 = this;
            r0 = -1
            r1 = 1
            r2.invalidateVirtualView(r0, r1)
            return
    }

    public final void invalidateVirtualView(int r2) {
            r1 = this;
            r0 = 0
            r1.invalidateVirtualView(r2, r0)
            return
    }

    public final void invalidateVirtualView(int r4, int r5) {
            r3 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L22
            android.view.accessibility.AccessibilityManager r0 = r3.mManager
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L22
            android.view.View r0 = r3.mHost
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L22
            r1 = 2048(0x800, float:2.87E-42)
            android.view.accessibility.AccessibilityEvent r1 = r3.createEvent(r4, r1)
            androidx.core.view.accessibility.AccessibilityEventCompat.setContentChangeTypes(r1, r5)
            android.view.View r2 = r3.mHost
            androidx.core.view.ViewParentCompat.requestSendAccessibilityEvent(r0, r2, r1)
        L22:
            return
    }

    androidx.core.view.accessibility.AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo(int r2) {
            r1 = this;
            r0 = -1
            if (r2 != r0) goto L8
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = r1.createNodeForHost()
            return r0
        L8:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = r1.createNodeForChild(r2)
            return r0
    }

    public final void onFocusChanged(boolean r3, int r4, android.graphics.Rect r5) {
            r2 = this;
            int r0 = r2.mKeyboardFocusedVirtualViewId
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto Lb
            int r0 = r2.mKeyboardFocusedVirtualViewId
            r2.clearKeyboardFocusForVirtualView(r0)
        Lb:
            if (r3 == 0) goto L10
            r2.moveFocus(r4, r5)
        L10:
            return
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            super.onInitializeAccessibilityEvent(r1, r2)
            r0.onPopulateEventForHost(r2)
            return
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(android.view.View r1, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1, r2)
            r0.onPopulateNodeForHost(r2)
            return
    }

    protected abstract boolean onPerformActionForVirtualView(int r1, int r2, android.os.Bundle r3);

    protected void onPopulateEventForHost(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            return
    }

    protected void onPopulateEventForVirtualView(int r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            return
    }

    protected void onPopulateNodeForHost(androidx.core.view.accessibility.AccessibilityNodeInfoCompat r1) {
            r0 = this;
            return
    }

    protected abstract void onPopulateNodeForVirtualView(int r1, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2);

    protected void onVirtualViewKeyboardFocusChanged(int r1, boolean r2) {
            r0 = this;
            return
    }

    boolean performAction(int r2, int r3, android.os.Bundle r4) {
            r1 = this;
            switch(r2) {
                case -1: goto L8;
                default: goto L3;
            }
        L3:
            boolean r0 = r1.performActionForChild(r2, r3, r4)
            return r0
        L8:
            boolean r0 = r1.performActionForHost(r3, r4)
            return r0
    }

    public final boolean requestKeyboardFocusForVirtualView(int r3) {
            r2 = this;
            android.view.View r0 = r2.mHost
            boolean r0 = r0.isFocused()
            r1 = 0
            if (r0 != 0) goto L12
            android.view.View r0 = r2.mHost
            boolean r0 = r0.requestFocus()
            if (r0 != 0) goto L12
            return r1
        L12:
            int r0 = r2.mKeyboardFocusedVirtualViewId
            if (r0 != r3) goto L17
            return r1
        L17:
            int r0 = r2.mKeyboardFocusedVirtualViewId
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L22
            int r0 = r2.mKeyboardFocusedVirtualViewId
            r2.clearKeyboardFocusForVirtualView(r0)
        L22:
            r2.mKeyboardFocusedVirtualViewId = r3
            r0 = 1
            r2.onVirtualViewKeyboardFocusChanged(r3, r0)
            r1 = 8
            r2.sendEventForVirtualView(r3, r1)
            return r0
    }

    public final boolean sendEventForVirtualView(int r4, int r5) {
            r3 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 0
            if (r4 == r0) goto L22
            android.view.accessibility.AccessibilityManager r0 = r3.mManager
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto Le
            goto L22
        Le:
            android.view.View r0 = r3.mHost
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L17
            return r1
        L17:
            android.view.accessibility.AccessibilityEvent r1 = r3.createEvent(r4, r5)
            android.view.View r2 = r3.mHost
            boolean r2 = androidx.core.view.ViewParentCompat.requestSendAccessibilityEvent(r0, r2, r1)
            return r2
        L22:
            return r1
    }
}
