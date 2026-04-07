package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class MenuPopupHelper implements androidx.appcompat.view.menu.MenuHelper {
    private static final int TOUCH_EPICENTER_SIZE_DP = 48;
    private android.view.View mAnchorView;
    private final android.content.Context mContext;
    private int mDropDownGravity;
    private boolean mForceShowIcon;
    private final android.widget.PopupWindow.OnDismissListener mInternalOnDismissListener;
    private final androidx.appcompat.view.menu.MenuBuilder mMenu;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    private androidx.appcompat.view.menu.MenuPopup mPopup;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private androidx.appcompat.view.menu.MenuPresenter.Callback mPresenterCallback;


    public MenuPopupHelper(android.content.Context r8, androidx.appcompat.view.menu.MenuBuilder r9) {
            r7 = this;
            int r5 = androidx.appcompat.R.attr.popupMenuStyle
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public MenuPopupHelper(android.content.Context r8, androidx.appcompat.view.menu.MenuBuilder r9, android.view.View r10) {
            r7 = this;
            int r5 = androidx.appcompat.R.attr.popupMenuStyle
            r6 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public MenuPopupHelper(android.content.Context r8, androidx.appcompat.view.menu.MenuBuilder r9, android.view.View r10, boolean r11, int r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public MenuPopupHelper(android.content.Context r2, androidx.appcompat.view.menu.MenuBuilder r3, android.view.View r4, boolean r5, int r6, int r7) {
            r1 = this;
            r1.<init>()
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1.mDropDownGravity = r0
            androidx.appcompat.view.menu.MenuPopupHelper$1 r0 = new androidx.appcompat.view.menu.MenuPopupHelper$1
            r0.<init>(r1)
            r1.mInternalOnDismissListener = r0
            r1.mContext = r2
            r1.mMenu = r3
            r1.mAnchorView = r4
            r1.mOverflowOnly = r5
            r1.mPopupStyleAttr = r6
            r1.mPopupStyleRes = r7
            return
    }

    private androidx.appcompat.view.menu.MenuPopup createPopup() {
            r14 = this;
            android.content.Context r0 = r14.mContext
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r1 = r0.getDefaultDisplay()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r1.getRealSize(r2)
            int r3 = r2.x
            int r4 = r2.y
            int r3 = java.lang.Math.min(r3, r4)
            android.content.Context r4 = r14.mContext
            android.content.res.Resources r4 = r4.getResources()
            int r5 = androidx.appcompat.R.dimen.abc_cascading_menus_min_smallest_width
            int r4 = r4.getDimensionPixelSize(r5)
            if (r3 < r4) goto L2e
            r5 = 1
            goto L2f
        L2e:
            r5 = 0
        L2f:
            if (r5 == 0) goto L41
            androidx.appcompat.view.menu.CascadingMenuPopup r6 = new androidx.appcompat.view.menu.CascadingMenuPopup
            android.content.Context r7 = r14.mContext
            android.view.View r8 = r14.mAnchorView
            int r9 = r14.mPopupStyleAttr
            int r10 = r14.mPopupStyleRes
            boolean r11 = r14.mOverflowOnly
            r6.<init>(r7, r8, r9, r10, r11)
            goto L53
        L41:
            androidx.appcompat.view.menu.StandardMenuPopup r7 = new androidx.appcompat.view.menu.StandardMenuPopup
            android.content.Context r8 = r14.mContext
            androidx.appcompat.view.menu.MenuBuilder r9 = r14.mMenu
            android.view.View r10 = r14.mAnchorView
            int r11 = r14.mPopupStyleAttr
            int r12 = r14.mPopupStyleRes
            boolean r13 = r14.mOverflowOnly
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r6 = r7
        L53:
            androidx.appcompat.view.menu.MenuBuilder r7 = r14.mMenu
            r6.addMenu(r7)
            android.widget.PopupWindow$OnDismissListener r7 = r14.mInternalOnDismissListener
            r6.setOnDismissListener(r7)
            android.view.View r7 = r14.mAnchorView
            r6.setAnchorView(r7)
            androidx.appcompat.view.menu.MenuPresenter$Callback r7 = r14.mPresenterCallback
            r6.setCallback(r7)
            boolean r7 = r14.mForceShowIcon
            r6.setForceShowIcon(r7)
            int r7 = r14.mDropDownGravity
            r6.setGravity(r7)
            return r6
    }

    private void showPopup(int r10, int r11, boolean r12, boolean r13) {
            r9 = this;
            androidx.appcompat.view.menu.MenuPopup r0 = r9.getPopup()
            r0.setShowTitle(r13)
            if (r12 == 0) goto L4a
            int r1 = r9.mDropDownGravity
            android.view.View r2 = r9.mAnchorView
            int r2 = r2.getLayoutDirection()
            int r1 = androidx.core.view.GravityCompat.getAbsoluteGravity(r1, r2)
            r1 = r1 & 7
            r2 = 5
            if (r1 != r2) goto L21
            android.view.View r2 = r9.mAnchorView
            int r2 = r2.getWidth()
            int r10 = r10 - r2
        L21:
            r0.setHorizontalOffset(r10)
            r0.setVerticalOffset(r11)
            android.content.Context r2 = r9.mContext
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1111490560(0x42400000, float:48.0)
            float r3 = r3 * r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            int r3 = (int) r3
            android.graphics.Rect r4 = new android.graphics.Rect
            int r5 = r10 - r3
            int r6 = r11 - r3
            int r7 = r10 + r3
            int r8 = r11 + r3
            r4.<init>(r5, r6, r7, r8)
            r0.setEpicenterBounds(r4)
        L4a:
            r0.show()
            return
    }

    @Override // androidx.appcompat.view.menu.MenuHelper
    public void dismiss() {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto Lb
            androidx.appcompat.view.menu.MenuPopup r0 = r1.mPopup
            r0.dismiss()
        Lb:
            return
    }

    public int getGravity() {
            r1 = this;
            int r0 = r1.mDropDownGravity
            return r0
    }

    public android.widget.ListView getListView() {
            r1 = this;
            androidx.appcompat.view.menu.MenuPopup r0 = r1.getPopup()
            android.widget.ListView r0 = r0.getListView()
            return r0
    }

    public androidx.appcompat.view.menu.MenuPopup getPopup() {
            r1 = this;
            androidx.appcompat.view.menu.MenuPopup r0 = r1.mPopup
            if (r0 != 0) goto La
            androidx.appcompat.view.menu.MenuPopup r0 = r1.createPopup()
            r1.mPopup = r0
        La:
            androidx.appcompat.view.menu.MenuPopup r0 = r1.mPopup
            return r0
    }

    public boolean isShowing() {
            r1 = this;
            androidx.appcompat.view.menu.MenuPopup r0 = r1.mPopup
            if (r0 == 0) goto Le
            androidx.appcompat.view.menu.MenuPopup r0 = r1.mPopup
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    protected void onDismiss() {
            r1 = this;
            r0 = 0
            r1.mPopup = r0
            android.widget.PopupWindow$OnDismissListener r0 = r1.mOnDismissListener
            if (r0 == 0) goto Lc
            android.widget.PopupWindow$OnDismissListener r0 = r1.mOnDismissListener
            r0.onDismiss()
        Lc:
            return
    }

    public void setAnchorView(android.view.View r1) {
            r0 = this;
            r0.mAnchorView = r1
            return
    }

    public void setForceShowIcon(boolean r2) {
            r1 = this;
            r1.mForceShowIcon = r2
            androidx.appcompat.view.menu.MenuPopup r0 = r1.mPopup
            if (r0 == 0) goto Lb
            androidx.appcompat.view.menu.MenuPopup r0 = r1.mPopup
            r0.setForceShowIcon(r2)
        Lb:
            return
    }

    public void setGravity(int r1) {
            r0 = this;
            r0.mDropDownGravity = r1
            return
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.mOnDismissListener = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuHelper
    public void setPresenterCallback(androidx.appcompat.view.menu.MenuPresenter.Callback r2) {
            r1 = this;
            r1.mPresenterCallback = r2
            androidx.appcompat.view.menu.MenuPopup r0 = r1.mPopup
            if (r0 == 0) goto Lb
            androidx.appcompat.view.menu.MenuPopup r0 = r1.mPopup
            r0.setCallback(r2)
        Lb:
            return
    }

    public void show() {
            r2 = this;
            boolean r0 = r2.tryShow()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "MenuPopupHelper cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
    }

    public void show(int r3, int r4) {
            r2 = this;
            boolean r0 = r2.tryShow(r3, r4)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "MenuPopupHelper cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
    }

    public boolean tryShow() {
            r3 = this;
            boolean r0 = r3.isShowing()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            android.view.View r0 = r3.mAnchorView
            r2 = 0
            if (r0 != 0) goto Le
            return r2
        Le:
            r3.showPopup(r2, r2, r2, r2)
            return r1
    }

    public boolean tryShow(int r3, int r4) {
            r2 = this;
            boolean r0 = r2.isShowing()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            android.view.View r0 = r2.mAnchorView
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r2.showPopup(r3, r4, r1, r1)
            return r1
    }
}
