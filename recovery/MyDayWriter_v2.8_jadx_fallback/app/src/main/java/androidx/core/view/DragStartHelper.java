package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class DragStartHelper {
    private boolean mDragging;
    private int mLastTouchX;
    private int mLastTouchY;
    private final androidx.core.view.DragStartHelper.OnDragStartListener mListener;
    private final android.view.View.OnLongClickListener mLongClickListener;
    private final android.view.View.OnTouchListener mTouchListener;
    private final android.view.View mView;

    public interface OnDragStartListener {
        boolean onDragStart(android.view.View r1, androidx.core.view.DragStartHelper r2);
    }

    public DragStartHelper(android.view.View r2, androidx.core.view.DragStartHelper.OnDragStartListener r3) {
            r1 = this;
            r1.<init>()
            androidx.core.view.DragStartHelper$$ExternalSyntheticLambda0 r0 = new androidx.core.view.DragStartHelper$$ExternalSyntheticLambda0
            r0.<init>(r1)
            r1.mLongClickListener = r0
            androidx.core.view.DragStartHelper$$ExternalSyntheticLambda1 r0 = new androidx.core.view.DragStartHelper$$ExternalSyntheticLambda1
            r0.<init>(r1)
            r1.mTouchListener = r0
            r1.mView = r2
            r1.mListener = r3
            return
    }

    public void attach() {
            r2 = this;
            android.view.View r0 = r2.mView
            android.view.View$OnLongClickListener r1 = r2.mLongClickListener
            r0.setOnLongClickListener(r1)
            android.view.View r0 = r2.mView
            android.view.View$OnTouchListener r1 = r2.mTouchListener
            r0.setOnTouchListener(r1)
            return
    }

    public void detach() {
            r2 = this;
            android.view.View r0 = r2.mView
            r1 = 0
            r0.setOnLongClickListener(r1)
            android.view.View r0 = r2.mView
            r0.setOnTouchListener(r1)
            return
    }

    public void getTouchPosition(android.graphics.Point r3) {
            r2 = this;
            int r0 = r2.mLastTouchX
            int r1 = r2.mLastTouchY
            r3.set(r0, r1)
            return
    }

    public boolean onLongClick(android.view.View r2) {
            r1 = this;
            boolean r0 = r1.mDragging
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            androidx.core.view.DragStartHelper$OnDragStartListener r0 = r1.mListener
            boolean r0 = r0.onDragStart(r2, r1)
            r1.mDragging = r0
            boolean r0 = r1.mDragging
            return r0
    }

    public boolean onTouch(android.view.View r5, android.view.MotionEvent r6) {
            r4 = this;
            float r0 = r6.getX()
            int r0 = (int) r0
            float r1 = r6.getY()
            int r1 = (int) r1
            int r2 = r6.getAction()
            r3 = 0
            switch(r2) {
                case 0: goto L44;
                case 1: goto L41;
                case 2: goto L13;
                case 3: goto L41;
                default: goto L12;
            }
        L12:
            goto L49
        L13:
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = androidx.core.view.MotionEventCompat.isFromSource(r6, r2)
            if (r2 == 0) goto L49
            int r2 = r6.getButtonState()
            r2 = r2 & 1
            if (r2 != 0) goto L24
            goto L49
        L24:
            boolean r2 = r4.mDragging
            if (r2 == 0) goto L29
            goto L49
        L29:
            int r2 = r4.mLastTouchX
            if (r2 != r0) goto L32
            int r2 = r4.mLastTouchY
            if (r2 != r1) goto L32
            goto L49
        L32:
            r4.mLastTouchX = r0
            r4.mLastTouchY = r1
            androidx.core.view.DragStartHelper$OnDragStartListener r2 = r4.mListener
            boolean r2 = r2.onDragStart(r5, r4)
            r4.mDragging = r2
            boolean r2 = r4.mDragging
            return r2
        L41:
            r4.mDragging = r3
            goto L49
        L44:
            r4.mLastTouchX = r0
            r4.mLastTouchY = r1
        L49:
            return r3
    }
}
