package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class PopupMenu {
    private final android.view.View mAnchor;
    private final android.content.Context mContext;
    private android.view.View.OnTouchListener mDragListener;
    private final androidx.appcompat.view.menu.MenuBuilder mMenu;
    androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener mMenuItemClickListener;
    androidx.appcompat.widget.PopupMenu.OnDismissListener mOnDismissListener;
    final androidx.appcompat.view.menu.MenuPopupHelper mPopup;




    public interface OnDismissListener {
        void onDismiss(androidx.appcompat.widget.PopupMenu r1);
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(android.view.MenuItem r1);
    }

    public PopupMenu(android.content.Context r2, android.view.View r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public PopupMenu(android.content.Context r7, android.view.View r8, int r9) {
            r6 = this;
            int r4 = androidx.appcompat.R.attr.popupMenuStyle
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public PopupMenu(android.content.Context r10, android.view.View r11, int r12, int r13, int r14) {
            r9 = this;
            r9.<init>()
            r9.mContext = r10
            r9.mAnchor = r11
            androidx.appcompat.view.menu.MenuBuilder r0 = new androidx.appcompat.view.menu.MenuBuilder
            r0.<init>(r10)
            r9.mMenu = r0
            androidx.appcompat.view.menu.MenuBuilder r0 = r9.mMenu
            androidx.appcompat.widget.PopupMenu$1 r1 = new androidx.appcompat.widget.PopupMenu$1
            r1.<init>(r9)
            r0.setCallback(r1)
            androidx.appcompat.view.menu.MenuPopupHelper r2 = new androidx.appcompat.view.menu.MenuPopupHelper
            androidx.appcompat.view.menu.MenuBuilder r4 = r9.mMenu
            r6 = 0
            r3 = r10
            r5 = r11
            r7 = r13
            r8 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.mPopup = r2
            androidx.appcompat.view.menu.MenuPopupHelper r10 = r9.mPopup
            r10.setGravity(r12)
            androidx.appcompat.view.menu.MenuPopupHelper r10 = r9.mPopup
            androidx.appcompat.widget.PopupMenu$2 r11 = new androidx.appcompat.widget.PopupMenu$2
            r11.<init>(r9)
            r10.setOnDismissListener(r11)
            return
    }

    public void dismiss() {
            r1 = this;
            androidx.appcompat.view.menu.MenuPopupHelper r0 = r1.mPopup
            r0.dismiss()
            return
    }

    public android.view.View.OnTouchListener getDragToOpenListener() {
            r2 = this;
            android.view.View$OnTouchListener r0 = r2.mDragListener
            if (r0 != 0) goto Ld
            androidx.appcompat.widget.PopupMenu$3 r0 = new androidx.appcompat.widget.PopupMenu$3
            android.view.View r1 = r2.mAnchor
            r0.<init>(r2, r1)
            r2.mDragListener = r0
        Ld:
            android.view.View$OnTouchListener r0 = r2.mDragListener
            return r0
    }

    public int getGravity() {
            r1 = this;
            androidx.appcompat.view.menu.MenuPopupHelper r0 = r1.mPopup
            int r0 = r0.getGravity()
            return r0
    }

    public android.view.Menu getMenu() {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            return r0
    }

    public android.view.MenuInflater getMenuInflater() {
            r2 = this;
            androidx.appcompat.view.SupportMenuInflater r0 = new androidx.appcompat.view.SupportMenuInflater
            android.content.Context r1 = r2.mContext
            r0.<init>(r1)
            return r0
    }

    android.widget.ListView getMenuListView() {
            r1 = this;
            androidx.appcompat.view.menu.MenuPopupHelper r0 = r1.mPopup
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            androidx.appcompat.view.menu.MenuPopupHelper r0 = r1.mPopup
            android.widget.ListView r0 = r0.getListView()
            return r0
    }

    public void inflate(int r3) {
            r2 = this;
            android.view.MenuInflater r0 = r2.getMenuInflater()
            androidx.appcompat.view.menu.MenuBuilder r1 = r2.mMenu
            r0.inflate(r3, r1)
            return
    }

    public void setForceShowIcon(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.MenuPopupHelper r0 = r1.mPopup
            r0.setForceShowIcon(r2)
            return
    }

    public void setGravity(int r2) {
            r1 = this;
            androidx.appcompat.view.menu.MenuPopupHelper r0 = r1.mPopup
            r0.setGravity(r2)
            return
    }

    public void setOnDismissListener(androidx.appcompat.widget.PopupMenu.OnDismissListener r1) {
            r0 = this;
            r0.mOnDismissListener = r1
            return
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener r1) {
            r0 = this;
            r0.mMenuItemClickListener = r1
            return
    }

    public void show() {
            r1 = this;
            androidx.appcompat.view.menu.MenuPopupHelper r0 = r1.mPopup
            r0.show()
            return
    }
}
