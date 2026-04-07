package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class ViewParentCompat {
    private static final java.lang.String TAG = "ViewParentCompat";
    private static int[] sTempNestedScrollConsumed;

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean onNestedFling(android.view.ViewParent r1, android.view.View r2, float r3, float r4, boolean r5) {
                boolean r0 = r1.onNestedFling(r2, r3, r4, r5)
                return r0
        }

        static boolean onNestedPreFling(android.view.ViewParent r1, android.view.View r2, float r3, float r4) {
                boolean r0 = r1.onNestedPreFling(r2, r3, r4)
                return r0
        }

        static void onNestedPreScroll(android.view.ViewParent r0, android.view.View r1, int r2, int r3, int[] r4) {
                r0.onNestedPreScroll(r1, r2, r3, r4)
                return
        }

        static void onNestedScroll(android.view.ViewParent r0, android.view.View r1, int r2, int r3, int r4, int r5) {
                r0.onNestedScroll(r1, r2, r3, r4, r5)
                return
        }

        static void onNestedScrollAccepted(android.view.ViewParent r0, android.view.View r1, android.view.View r2, int r3) {
                r0.onNestedScrollAccepted(r1, r2, r3)
                return
        }

        static boolean onStartNestedScroll(android.view.ViewParent r1, android.view.View r2, android.view.View r3, int r4) {
                boolean r0 = r1.onStartNestedScroll(r2, r3, r4)
                return r0
        }

        static void onStopNestedScroll(android.view.ViewParent r0, android.view.View r1) {
                r0.onStopNestedScroll(r1)
                return
        }
    }

    private ViewParentCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int[] getTempNestedScrollConsumed() {
            int[] r0 = androidx.core.view.ViewParentCompat.sTempNestedScrollConsumed
            if (r0 != 0) goto La
            r0 = 2
            int[] r0 = new int[r0]
            androidx.core.view.ViewParentCompat.sTempNestedScrollConsumed = r0
            goto L14
        La:
            int[] r0 = androidx.core.view.ViewParentCompat.sTempNestedScrollConsumed
            r1 = 0
            r0[r1] = r1
            int[] r0 = androidx.core.view.ViewParentCompat.sTempNestedScrollConsumed
            r2 = 1
            r0[r2] = r1
        L14:
            int[] r0 = androidx.core.view.ViewParentCompat.sTempNestedScrollConsumed
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "parent.notifySubtreeAccessibilityStateChanged(child, source, changeType)")
    @java.lang.Deprecated
    public static void notifySubtreeAccessibilityStateChanged(android.view.ViewParent r0, android.view.View r1, android.view.View r2, int r3) {
            r0.notifySubtreeAccessibilityStateChanged(r1, r2, r3)
            return
    }

    public static boolean onNestedFling(android.view.ViewParent r3, android.view.View r4, float r5, float r6, boolean r7) {
            boolean r0 = androidx.core.view.ViewParentCompat.Api21Impl.onNestedFling(r3, r4, r5, r6, r7)     // Catch: java.lang.AbstractMethodError -> L6
            return r0
        L6:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ViewParent "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " does not implement interface method onNestedFling"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ViewParentCompat"
            android.util.Log.e(r2, r1, r0)
            r0 = 0
            return r0
    }

    public static boolean onNestedPreFling(android.view.ViewParent r3, android.view.View r4, float r5, float r6) {
            boolean r0 = androidx.core.view.ViewParentCompat.Api21Impl.onNestedPreFling(r3, r4, r5, r6)     // Catch: java.lang.AbstractMethodError -> L6
            return r0
        L6:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ViewParent "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " does not implement interface method onNestedPreFling"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ViewParentCompat"
            android.util.Log.e(r2, r1, r0)
            r0 = 0
            return r0
    }

    public static void onNestedPreScroll(android.view.ViewParent r6, android.view.View r7, int r8, int r9, int[] r10) {
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            onNestedPreScroll(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void onNestedPreScroll(android.view.ViewParent r7, android.view.View r8, int r9, int r10, int[] r11, int r12) {
            boolean r0 = r7 instanceof androidx.core.view.NestedScrollingParent2
            if (r0 == 0) goto L10
            r1 = r7
            androidx.core.view.NestedScrollingParent2 r1 = (androidx.core.view.NestedScrollingParent2) r1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.onNestedPreScroll(r2, r3, r4, r5, r6)
            goto L3d
        L10:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            if (r6 != 0) goto L3d
        L18:
            androidx.core.view.ViewParentCompat.Api21Impl.onNestedPreScroll(r7, r2, r3, r4, r5)     // Catch: java.lang.AbstractMethodError -> L1c
        L1b:
            goto L3d
        L1c:
            r0 = move-exception
            r8 = r0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "ViewParent "
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r7)
            java.lang.String r10 = " does not implement interface method onNestedPreScroll"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "ViewParentCompat"
            android.util.Log.e(r10, r9, r8)
            goto L1b
        L3d:
            return
    }

    public static void onNestedScroll(android.view.ViewParent r8, android.view.View r9, int r10, int r11, int r12, int r13) {
            int[] r7 = getTempNestedScrollConsumed()
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            onNestedScroll(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void onNestedScroll(android.view.ViewParent r8, android.view.View r9, int r10, int r11, int r12, int r13, int r14) {
            int[] r7 = getTempNestedScrollConsumed()
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            onNestedScroll(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void onNestedScroll(android.view.ViewParent r9, android.view.View r10, int r11, int r12, int r13, int r14, int r15, int[] r16) {
            boolean r0 = r9 instanceof androidx.core.view.NestedScrollingParent3
            if (r0 == 0) goto L13
            r1 = r9
            androidx.core.view.NestedScrollingParent3 r1 = (androidx.core.view.NestedScrollingParent3) r1
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r1.onNestedScroll(r2, r3, r4, r5, r6, r7, r8)
            goto L57
        L13:
            r0 = 0
            r1 = r16[r0]
            int r1 = r1 + r13
            r16[r0] = r1
            r0 = 1
            r1 = r16[r0]
            int r1 = r1 + r14
            r16[r0] = r1
            boolean r0 = r9 instanceof androidx.core.view.NestedScrollingParent2
            if (r0 == 0) goto L30
            r2 = r9
            androidx.core.view.NestedScrollingParent2 r2 = (androidx.core.view.NestedScrollingParent2) r2
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r2.onNestedScroll(r3, r4, r5, r6, r7, r8)
            goto L57
        L30:
            if (r15 != 0) goto L57
        L33:
            androidx.core.view.ViewParentCompat.Api21Impl.onNestedScroll(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.AbstractMethodError -> L37
        L36:
            goto L57
        L37:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ViewParent "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.String r2 = " does not implement interface method onNestedScroll"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ViewParentCompat"
            android.util.Log.e(r2, r1, r0)
            goto L36
        L57:
            return
    }

    public static void onNestedScrollAccepted(android.view.ViewParent r1, android.view.View r2, android.view.View r3, int r4) {
            r0 = 0
            onNestedScrollAccepted(r1, r2, r3, r4, r0)
            return
    }

    public static void onNestedScrollAccepted(android.view.ViewParent r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            boolean r0 = r3 instanceof androidx.core.view.NestedScrollingParent2
            if (r0 == 0) goto Lb
            r0 = r3
            androidx.core.view.NestedScrollingParent2 r0 = (androidx.core.view.NestedScrollingParent2) r0
            r0.onNestedScrollAccepted(r4, r5, r6, r7)
            goto L32
        Lb:
            if (r7 != 0) goto L32
        Le:
            androidx.core.view.ViewParentCompat.Api21Impl.onNestedScrollAccepted(r3, r4, r5, r6)     // Catch: java.lang.AbstractMethodError -> L12
        L11:
            goto L32
        L12:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ViewParent "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " does not implement interface method onNestedScrollAccepted"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ViewParentCompat"
            android.util.Log.e(r2, r1, r0)
            goto L11
        L32:
            return
    }

    public static boolean onStartNestedScroll(android.view.ViewParent r1, android.view.View r2, android.view.View r3, int r4) {
            r0 = 0
            boolean r0 = onStartNestedScroll(r1, r2, r3, r4, r0)
            return r0
    }

    public static boolean onStartNestedScroll(android.view.ViewParent r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            boolean r0 = r3 instanceof androidx.core.view.NestedScrollingParent2
            if (r0 == 0) goto Lc
            r0 = r3
            androidx.core.view.NestedScrollingParent2 r0 = (androidx.core.view.NestedScrollingParent2) r0
            boolean r0 = r0.onStartNestedScroll(r4, r5, r6, r7)
            return r0
        Lc:
            if (r7 != 0) goto L34
        Lf:
            boolean r0 = androidx.core.view.ViewParentCompat.Api21Impl.onStartNestedScroll(r3, r4, r5, r6)     // Catch: java.lang.AbstractMethodError -> L14
            return r0
        L14:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ViewParent "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " does not implement interface method onStartNestedScroll"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ViewParentCompat"
            android.util.Log.e(r2, r1, r0)
        L34:
            r0 = 0
            return r0
    }

    public static void onStopNestedScroll(android.view.ViewParent r1, android.view.View r2) {
            r0 = 0
            onStopNestedScroll(r1, r2, r0)
            return
    }

    public static void onStopNestedScroll(android.view.ViewParent r3, android.view.View r4, int r5) {
            boolean r0 = r3 instanceof androidx.core.view.NestedScrollingParent2
            if (r0 == 0) goto Lb
            r0 = r3
            androidx.core.view.NestedScrollingParent2 r0 = (androidx.core.view.NestedScrollingParent2) r0
            r0.onStopNestedScroll(r4, r5)
            goto L32
        Lb:
            if (r5 != 0) goto L32
        Le:
            androidx.core.view.ViewParentCompat.Api21Impl.onStopNestedScroll(r3, r4)     // Catch: java.lang.AbstractMethodError -> L12
        L11:
            goto L32
        L12:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ViewParent "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " does not implement interface method onStopNestedScroll"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ViewParentCompat"
            android.util.Log.e(r2, r1, r0)
            goto L11
        L32:
            return
    }

    @androidx.annotation.ReplaceWith(expression = "parent.requestSendAccessibilityEvent(child, event)")
    @java.lang.Deprecated
    public static boolean requestSendAccessibilityEvent(android.view.ViewParent r1, android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            boolean r0 = r1.requestSendAccessibilityEvent(r2, r3)
            return r0
    }
}
