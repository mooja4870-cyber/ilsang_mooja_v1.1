package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public class ListViewAutoScrollHelper extends androidx.core.widget.AutoScrollHelper {
    private final android.widget.ListView mTarget;

    public ListViewAutoScrollHelper(android.widget.ListView r1) {
            r0 = this;
            r0.<init>(r1)
            r0.mTarget = r1
            return
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public boolean canTargetScrollHorizontally(int r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public boolean canTargetScrollVertically(int r10) {
            r9 = this;
            android.widget.ListView r0 = r9.mTarget
            int r1 = r0.getCount()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r3 = r0.getChildCount()
            int r4 = r0.getFirstVisiblePosition()
            int r5 = r4 + r3
            if (r10 <= 0) goto L2a
            if (r5 < r1) goto L3a
            int r6 = r3 + (-1)
            android.view.View r6 = r0.getChildAt(r6)
            int r7 = r6.getBottom()
            int r8 = r0.getHeight()
            if (r7 > r8) goto L29
            return r2
        L29:
            goto L3a
        L2a:
            if (r10 >= 0) goto L3c
            if (r4 > 0) goto L3a
            android.view.View r6 = r0.getChildAt(r2)
            int r7 = r6.getTop()
            if (r7 < 0) goto L39
            return r2
        L39:
        L3a:
            r2 = 1
            return r2
        L3c:
            return r2
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public void scrollTargetBy(int r2, int r3) {
            r1 = this;
            android.widget.ListView r0 = r1.mTarget
            r0.scrollListBy(r3)
            return
    }
}
