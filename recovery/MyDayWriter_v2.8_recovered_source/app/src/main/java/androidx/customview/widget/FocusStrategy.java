package androidx.customview.widget;

/* JADX INFO: loaded from: classes.dex */
class FocusStrategy {

    public interface BoundsAdapter<T> {
        void obtainBounds(T r1, android.graphics.Rect r2);
    }

    public interface CollectionAdapter<T, V> {
        V get(T r1, int r2);

        int size(T r1);
    }

    private static class SequentialComparator<T> implements java.util.Comparator<T> {
        private final androidx.customview.widget.FocusStrategy.BoundsAdapter<T> mAdapter;
        private final boolean mIsLayoutRtl;
        private final android.graphics.Rect mTemp1;
        private final android.graphics.Rect mTemp2;

        SequentialComparator(boolean r2, androidx.customview.widget.FocusStrategy.BoundsAdapter<T> r3) {
                r1 = this;
                r1.<init>()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.mTemp1 = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.mTemp2 = r0
                r1.mIsLayoutRtl = r2
                r1.mAdapter = r3
                return
        }

        @Override // java.util.Comparator
        public int compare(T r7, T r8) {
                r6 = this;
                android.graphics.Rect r0 = r6.mTemp1
                android.graphics.Rect r1 = r6.mTemp2
                androidx.customview.widget.FocusStrategy$BoundsAdapter<T> r2 = r6.mAdapter
                r2.obtainBounds(r7, r0)
                androidx.customview.widget.FocusStrategy$BoundsAdapter<T> r2 = r6.mAdapter
                r2.obtainBounds(r8, r1)
                int r2 = r0.top
                int r3 = r1.top
                r4 = -1
                if (r2 >= r3) goto L16
                return r4
            L16:
                int r2 = r0.top
                int r3 = r1.top
                r5 = 1
                if (r2 <= r3) goto L1e
                return r5
            L1e:
                int r2 = r0.left
                int r3 = r1.left
                if (r2 >= r3) goto L2a
                boolean r2 = r6.mIsLayoutRtl
                if (r2 == 0) goto L29
                r4 = r5
            L29:
                return r4
            L2a:
                int r2 = r0.left
                int r3 = r1.left
                if (r2 <= r3) goto L37
                boolean r2 = r6.mIsLayoutRtl
                if (r2 == 0) goto L35
                goto L36
            L35:
                r4 = r5
            L36:
                return r4
            L37:
                int r2 = r0.bottom
                int r3 = r1.bottom
                if (r2 >= r3) goto L3e
                return r4
            L3e:
                int r2 = r0.bottom
                int r3 = r1.bottom
                if (r2 <= r3) goto L45
                return r5
            L45:
                int r2 = r0.right
                int r3 = r1.right
                if (r2 >= r3) goto L51
                boolean r2 = r6.mIsLayoutRtl
                if (r2 == 0) goto L50
                r4 = r5
            L50:
                return r4
            L51:
                int r2 = r0.right
                int r3 = r1.right
                if (r2 <= r3) goto L5e
                boolean r2 = r6.mIsLayoutRtl
                if (r2 == 0) goto L5c
                goto L5d
            L5c:
                r4 = r5
            L5d:
                return r4
            L5e:
                r2 = 0
                return r2
        }
    }

    private FocusStrategy() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean beamBeats(int r6, android.graphics.Rect r7, android.graphics.Rect r8, android.graphics.Rect r9) {
            boolean r0 = beamsOverlap(r6, r7, r8)
            boolean r1 = beamsOverlap(r6, r7, r9)
            r2 = 0
            if (r1 != 0) goto L2c
            if (r0 != 0) goto Le
            goto L2c
        Le:
            boolean r3 = isToDirectionOf(r6, r7, r9)
            r4 = 1
            if (r3 != 0) goto L16
            return r4
        L16:
            r3 = 17
            if (r6 == r3) goto L2b
            r3 = 66
            if (r6 != r3) goto L1f
            goto L2b
        L1f:
            int r3 = majorAxisDistance(r6, r7, r8)
            int r5 = majorAxisDistanceToFarEdge(r6, r7, r9)
            if (r3 >= r5) goto L2a
            r2 = r4
        L2a:
            return r2
        L2b:
            return r4
        L2c:
            return r2
    }

    private static boolean beamsOverlap(int r4, android.graphics.Rect r5, android.graphics.Rect r6) {
            r0 = 1
            r1 = 0
            switch(r4) {
                case 17: goto L1c;
                case 33: goto Ld;
                case 66: goto L1c;
                case 130: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r0.<init>(r1)
            throw r0
        Ld:
            int r2 = r6.right
            int r3 = r5.left
            if (r2 < r3) goto L1a
            int r2 = r6.left
            int r3 = r5.right
            if (r2 > r3) goto L1a
            goto L1b
        L1a:
            r0 = r1
        L1b:
            return r0
        L1c:
            int r2 = r6.bottom
            int r3 = r5.top
            if (r2 < r3) goto L29
            int r2 = r6.top
            int r3 = r5.bottom
            if (r2 > r3) goto L29
            goto L2a
        L29:
            r0 = r1
        L2a:
            return r0
    }

    public static <L, T> T findNextFocusInAbsoluteDirection(L r7, androidx.customview.widget.FocusStrategy.CollectionAdapter<L, T> r8, androidx.customview.widget.FocusStrategy.BoundsAdapter<T> r9, T r10, android.graphics.Rect r11, int r12) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r11)
            r1 = 0
            switch(r12) {
                case 17: goto L31;
                case 33: goto L27;
                case 66: goto L1c;
                case 130: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L11:
            int r2 = r11.height()
            int r2 = r2 + 1
            int r2 = -r2
            r0.offset(r1, r2)
            goto L3b
        L1c:
            int r2 = r11.width()
            int r2 = r2 + 1
            int r2 = -r2
            r0.offset(r2, r1)
            goto L3b
        L27:
            int r2 = r11.height()
            int r2 = r2 + 1
            r0.offset(r1, r2)
            goto L3b
        L31:
            int r2 = r11.width()
            int r2 = r2 + 1
            r0.offset(r2, r1)
        L3b:
            r1 = 0
            int r2 = r8.size(r7)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r4 = 0
        L46:
            if (r4 >= r2) goto L5f
            java.lang.Object r5 = r8.get(r7, r4)
            if (r5 != r10) goto L4f
            goto L5c
        L4f:
            r9.obtainBounds(r5, r3)
            boolean r6 = isBetterCandidate(r12, r11, r3, r0)
            if (r6 == 0) goto L5c
            r0.set(r3)
            r1 = r5
        L5c:
            int r4 = r4 + 1
            goto L46
        L5f:
            return r1
    }

    public static <L, T> T findNextFocusInRelativeDirection(L r5, androidx.customview.widget.FocusStrategy.CollectionAdapter<L, T> r6, androidx.customview.widget.FocusStrategy.BoundsAdapter<T> r7, T r8, int r9, boolean r10, boolean r11) {
            int r0 = r6.size(r5)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L16
            java.lang.Object r3 = r6.get(r5, r2)
            r1.add(r3)
            int r2 = r2 + 1
            goto La
        L16:
            androidx.customview.widget.FocusStrategy$SequentialComparator r2 = new androidx.customview.widget.FocusStrategy$SequentialComparator
            r2.<init>(r10, r7)
            java.util.Collections.sort(r1, r2)
            switch(r9) {
                case 1: goto L2e;
                case 2: goto L29;
                default: goto L21;
            }
        L21:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r3.<init>(r4)
            throw r3
        L29:
            java.lang.Object r3 = getNextFocusable(r8, r1, r11)
            return r3
        L2e:
            java.lang.Object r3 = getPreviousFocusable(r8, r1, r11)
            return r3
    }

    private static <T> T getNextFocusable(T r3, java.util.ArrayList<T> r4, boolean r5) {
            int r0 = r4.size()
            if (r3 != 0) goto L8
            r1 = -1
            goto Lc
        L8:
            int r1 = r4.lastIndexOf(r3)
        Lc:
            int r1 = r1 + 1
            if (r1 >= r0) goto L15
            java.lang.Object r2 = r4.get(r1)
            return r2
        L15:
            if (r5 == 0) goto L1f
            if (r0 <= 0) goto L1f
            r2 = 0
            java.lang.Object r2 = r4.get(r2)
            return r2
        L1f:
            r2 = 0
            return r2
    }

    private static <T> T getPreviousFocusable(T r3, java.util.ArrayList<T> r4, boolean r5) {
            int r0 = r4.size()
            if (r3 != 0) goto L8
            r1 = r0
            goto Lc
        L8:
            int r1 = r4.indexOf(r3)
        Lc:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L15
            java.lang.Object r2 = r4.get(r1)
            return r2
        L15:
            if (r5 == 0) goto L20
            if (r0 <= 0) goto L20
            int r2 = r0 + (-1)
            java.lang.Object r2 = r4.get(r2)
            return r2
        L20:
            r2 = 0
            return r2
    }

    private static int getWeightedDistanceFor(int r2, int r3) {
            int r0 = r2 * 13
            int r0 = r0 * r2
            int r1 = r3 * r3
            int r0 = r0 + r1
            return r0
    }

    private static boolean isBetterCandidate(int r5, android.graphics.Rect r6, android.graphics.Rect r7, android.graphics.Rect r8) {
            boolean r0 = isCandidate(r6, r7, r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = isCandidate(r6, r8, r5)
            r2 = 1
            if (r0 != 0) goto L10
            return r2
        L10:
            boolean r0 = beamBeats(r5, r6, r7, r8)
            if (r0 == 0) goto L17
            return r2
        L17:
            boolean r0 = beamBeats(r5, r6, r8, r7)
            if (r0 == 0) goto L1e
            return r1
        L1e:
            int r0 = majorAxisDistance(r5, r6, r7)
            int r3 = minorAxisDistance(r5, r6, r7)
            int r0 = getWeightedDistanceFor(r0, r3)
            int r3 = majorAxisDistance(r5, r6, r8)
            int r4 = minorAxisDistance(r5, r6, r8)
            int r3 = getWeightedDistanceFor(r3, r4)
            if (r0 >= r3) goto L3b
            r1 = r2
        L3b:
            return r1
    }

    private static boolean isCandidate(android.graphics.Rect r4, android.graphics.Rect r5, int r6) {
            r0 = 1
            r1 = 0
            switch(r6) {
                case 17: goto L4c;
                case 33: goto L37;
                case 66: goto L22;
                case 130: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r0.<init>(r1)
            throw r0
        Ld:
            int r2 = r4.top
            int r3 = r5.top
            if (r2 < r3) goto L19
            int r2 = r4.bottom
            int r3 = r5.top
            if (r2 > r3) goto L20
        L19:
            int r2 = r4.bottom
            int r3 = r5.bottom
            if (r2 >= r3) goto L20
            goto L21
        L20:
            r0 = r1
        L21:
            return r0
        L22:
            int r2 = r4.left
            int r3 = r5.left
            if (r2 < r3) goto L2e
            int r2 = r4.right
            int r3 = r5.left
            if (r2 > r3) goto L35
        L2e:
            int r2 = r4.right
            int r3 = r5.right
            if (r2 >= r3) goto L35
            goto L36
        L35:
            r0 = r1
        L36:
            return r0
        L37:
            int r2 = r4.bottom
            int r3 = r5.bottom
            if (r2 > r3) goto L43
            int r2 = r4.top
            int r3 = r5.bottom
            if (r2 < r3) goto L4a
        L43:
            int r2 = r4.top
            int r3 = r5.top
            if (r2 <= r3) goto L4a
            goto L4b
        L4a:
            r0 = r1
        L4b:
            return r0
        L4c:
            int r2 = r4.right
            int r3 = r5.right
            if (r2 > r3) goto L58
            int r2 = r4.left
            int r3 = r5.right
            if (r2 < r3) goto L5f
        L58:
            int r2 = r4.left
            int r3 = r5.left
            if (r2 <= r3) goto L5f
            goto L60
        L5f:
            r0 = r1
        L60:
            return r0
    }

    private static boolean isToDirectionOf(int r4, android.graphics.Rect r5, android.graphics.Rect r6) {
            r0 = 1
            r1 = 0
            switch(r4) {
                case 17: goto L28;
                case 33: goto L1f;
                case 66: goto L16;
                case 130: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r0.<init>(r1)
            throw r0
        Ld:
            int r2 = r5.bottom
            int r3 = r6.top
            if (r2 > r3) goto L14
            goto L15
        L14:
            r0 = r1
        L15:
            return r0
        L16:
            int r2 = r5.right
            int r3 = r6.left
            if (r2 > r3) goto L1d
            goto L1e
        L1d:
            r0 = r1
        L1e:
            return r0
        L1f:
            int r2 = r5.top
            int r3 = r6.bottom
            if (r2 < r3) goto L26
            goto L27
        L26:
            r0 = r1
        L27:
            return r0
        L28:
            int r2 = r5.left
            int r3 = r6.right
            if (r2 < r3) goto L2f
            goto L30
        L2f:
            r0 = r1
        L30:
            return r0
    }

    private static int majorAxisDistance(int r2, android.graphics.Rect r3, android.graphics.Rect r4) {
            r0 = 0
            int r1 = majorAxisDistanceRaw(r2, r3, r4)
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    private static int majorAxisDistanceRaw(int r2, android.graphics.Rect r3, android.graphics.Rect r4) {
            switch(r2) {
                case 17: goto L1d;
                case 33: goto L17;
                case 66: goto L11;
                case 130: goto Lb;
                default: goto L3;
            }
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r0.<init>(r1)
            throw r0
        Lb:
            int r0 = r4.top
            int r1 = r3.bottom
            int r0 = r0 - r1
            return r0
        L11:
            int r0 = r4.left
            int r1 = r3.right
            int r0 = r0 - r1
            return r0
        L17:
            int r0 = r3.top
            int r1 = r4.bottom
            int r0 = r0 - r1
            return r0
        L1d:
            int r0 = r3.left
            int r1 = r4.right
            int r0 = r0 - r1
            return r0
    }

    private static int majorAxisDistanceToFarEdge(int r2, android.graphics.Rect r3, android.graphics.Rect r4) {
            r0 = 1
            int r1 = majorAxisDistanceToFarEdgeRaw(r2, r3, r4)
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    private static int majorAxisDistanceToFarEdgeRaw(int r2, android.graphics.Rect r3, android.graphics.Rect r4) {
            switch(r2) {
                case 17: goto L1d;
                case 33: goto L17;
                case 66: goto L11;
                case 130: goto Lb;
                default: goto L3;
            }
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r0.<init>(r1)
            throw r0
        Lb:
            int r0 = r4.bottom
            int r1 = r3.bottom
            int r0 = r0 - r1
            return r0
        L11:
            int r0 = r4.right
            int r1 = r3.right
            int r0 = r0 - r1
            return r0
        L17:
            int r0 = r3.top
            int r1 = r4.top
            int r0 = r0 - r1
            return r0
        L1d:
            int r0 = r3.left
            int r1 = r4.left
            int r0 = r0 - r1
            return r0
    }

    private static int minorAxisDistance(int r3, android.graphics.Rect r4, android.graphics.Rect r5) {
            switch(r3) {
                case 17: goto L23;
                case 33: goto Lb;
                case 66: goto L23;
                case 130: goto Lb;
                default: goto L3;
            }
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r0.<init>(r1)
            throw r0
        Lb:
            int r0 = r4.left
            int r1 = r4.width()
            int r1 = r1 / 2
            int r0 = r0 + r1
            int r1 = r5.left
            int r2 = r5.width()
            int r2 = r2 / 2
            int r1 = r1 + r2
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            return r0
        L23:
            int r0 = r4.top
            int r1 = r4.height()
            int r1 = r1 / 2
            int r0 = r0 + r1
            int r1 = r5.top
            int r2 = r5.height()
            int r2 = r2 / 2
            int r1 = r1 + r2
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            return r0
    }
}
