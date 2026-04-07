package androidx.core.view.insets;

/* JADX INFO: loaded from: classes.dex */
public class ProtectionLayout extends android.widget.FrameLayout {
    private static final java.lang.Object PROTECTION_VIEW = null;
    private androidx.core.view.insets.ProtectionGroup mGroup;
    private final java.util.List<androidx.core.view.insets.Protection> mProtections;


    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.view.insets.ProtectionLayout.PROTECTION_VIEW = r0
            return
    }

    public ProtectionLayout(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mProtections = r0
            return
    }

    public ProtectionLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ProtectionLayout(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public ProtectionLayout(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mProtections = r0
            return
    }

    public ProtectionLayout(android.content.Context r2, java.util.List<androidx.core.view.insets.Protection> r3) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mProtections = r0
            r1.setProtections(r3)
            return
    }

    private void addProtectionView(android.content.Context r9, int r10, androidx.core.view.insets.Protection r11) {
            r8 = this;
            androidx.core.view.insets.Protection$Attributes r0 = r11.getAttributes()
            int r1 = r11.getSide()
            switch(r1) {
                case 1: goto L3f;
                case 2: goto L37;
                case 4: goto L30;
                case 8: goto L28;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected side: "
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r11.getSide()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L28:
            r1 = -1
            int r2 = r0.getHeight()
            r3 = 80
            goto L46
        L30:
            int r1 = r0.getWidth()
            r2 = -1
            r3 = 5
            goto L46
        L37:
            r1 = -1
            int r2 = r0.getHeight()
            r3 = 48
            goto L46
        L3f:
            int r1 = r0.getWidth()
            r2 = -1
            r3 = 3
        L46:
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r1, r2, r3)
            androidx.core.graphics.Insets r5 = r0.getMargin()
            int r6 = r5.left
            r4.leftMargin = r6
            int r6 = r5.top
            r4.topMargin = r6
            int r6 = r5.right
            r4.rightMargin = r6
            int r6 = r5.bottom
            r4.bottomMargin = r6
            android.view.View r6 = new android.view.View
            r6.<init>(r9)
            java.lang.Object r7 = androidx.core.view.insets.ProtectionLayout.PROTECTION_VIEW
            r6.setTag(r7)
            float r7 = r0.getTranslationX()
            r6.setTranslationX(r7)
            float r7 = r0.getTranslationY()
            r6.setTranslationY(r7)
            float r7 = r0.getAlpha()
            r6.setAlpha(r7)
            boolean r7 = r0.isVisible()
            if (r7 == 0) goto L86
            r7 = 0
            goto L87
        L86:
            r7 = 4
        L87:
            r6.setVisibility(r7)
            android.graphics.drawable.Drawable r7 = r0.getDrawable()
            r6.setBackground(r7)
            androidx.core.view.insets.ProtectionLayout$1 r7 = new androidx.core.view.insets.ProtectionLayout$1
            r7.<init>(r8, r4, r6)
            r0.setCallback(r7)
            r8.addView(r6, r10, r4)
            return
    }

    private void addProtectionViews() {
            r7 = this;
            java.util.List<androidx.core.view.insets.Protection> r0 = r7.mProtections
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            androidx.core.view.insets.SystemBarStateMonitor r0 = r7.getOrInstallSystemBarStateMonitor()
            androidx.core.view.insets.ProtectionGroup r1 = new androidx.core.view.insets.ProtectionGroup
            java.util.List<androidx.core.view.insets.Protection> r2 = r7.mProtections
            r1.<init>(r0, r2)
            r7.mGroup = r1
            int r1 = r7.getChildCount()
            r2 = 0
            androidx.core.view.insets.ProtectionGroup r3 = r7.mGroup
            int r3 = r3.size()
        L21:
            if (r2 >= r3) goto L35
            androidx.core.view.insets.ProtectionGroup r4 = r7.mGroup
            androidx.core.view.insets.Protection r4 = r4.getProtection(r2)
            android.content.Context r5 = r7.getContext()
            int r6 = r2 + r1
            r7.addProtectionView(r5, r6, r4)
            int r2 = r2 + 1
            goto L21
        L35:
            return
    }

    private androidx.core.view.insets.SystemBarStateMonitor getOrInstallSystemBarStateMonitor() {
            r4 = this;
            android.view.View r0 = r4.getRootView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = androidx.core.R.id.tag_system_bar_state_monitor
            java.lang.Object r1 = r0.getTag(r1)
            boolean r2 = r1 instanceof androidx.core.view.insets.SystemBarStateMonitor
            if (r2 == 0) goto L14
            r2 = r1
            androidx.core.view.insets.SystemBarStateMonitor r2 = (androidx.core.view.insets.SystemBarStateMonitor) r2
            return r2
        L14:
            androidx.core.view.insets.SystemBarStateMonitor r2 = new androidx.core.view.insets.SystemBarStateMonitor
            r2.<init>(r0)
            int r3 = androidx.core.R.id.tag_system_bar_state_monitor
            r0.setTag(r3, r2)
            return r2
    }

    private void maybeUninstallSystemBarStateMonitor() {
            r5 = this;
            android.view.View r0 = r5.getRootView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = androidx.core.R.id.tag_system_bar_state_monitor
            java.lang.Object r1 = r0.getTag(r1)
            boolean r2 = r1 instanceof androidx.core.view.insets.SystemBarStateMonitor
            if (r2 != 0) goto L11
            return
        L11:
            r2 = r1
            androidx.core.view.insets.SystemBarStateMonitor r2 = (androidx.core.view.insets.SystemBarStateMonitor) r2
            boolean r3 = r2.hasCallback()
            if (r3 == 0) goto L1b
            return
        L1b:
            r2.detachFromWindow()
            int r3 = androidx.core.R.id.tag_system_bar_state_monitor
            r4 = 0
            r0.setTag(r3, r4)
            return
    }

    private void removeProtectionViews() {
            r4 = this;
            androidx.core.view.insets.ProtectionGroup r0 = r4.mGroup
            if (r0 == 0) goto L39
            int r0 = r4.getChildCount()
            androidx.core.view.insets.ProtectionGroup r1 = r4.mGroup
            int r1 = r1.size()
            int r0 = r0 - r1
            androidx.core.view.insets.ProtectionGroup r1 = r4.mGroup
            int r1 = r1.size()
            r4.removeViews(r0, r1)
            r0 = 0
            androidx.core.view.insets.ProtectionGroup r1 = r4.mGroup
            int r1 = r1.size()
        L1f:
            r2 = 0
            if (r0 >= r1) goto L32
            androidx.core.view.insets.ProtectionGroup r3 = r4.mGroup
            androidx.core.view.insets.Protection r3 = r3.getProtection(r0)
            androidx.core.view.insets.Protection$Attributes r3 = r3.getAttributes()
            r3.setCallback(r2)
            int r0 = r0 + 1
            goto L1f
        L32:
            androidx.core.view.insets.ProtectionGroup r0 = r4.mGroup
            r0.dispose()
            r4.mGroup = r2
        L39:
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5) {
            r2 = this;
            if (r3 == 0) goto L20
            java.lang.Object r0 = r3.getTag()
            java.lang.Object r1 = androidx.core.view.insets.ProtectionLayout.PROTECTION_VIEW
            if (r0 == r1) goto L20
            androidx.core.view.insets.ProtectionGroup r0 = r2.mGroup
            if (r0 == 0) goto L15
            androidx.core.view.insets.ProtectionGroup r0 = r2.mGroup
            int r0 = r0.size()
            goto L16
        L15:
            r0 = 0
        L16:
            int r1 = r2.getChildCount()
            int r1 = r1 - r0
            if (r4 > r1) goto L1f
            if (r4 >= 0) goto L20
        L1f:
            r4 = r1
        L20:
            super.addView(r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            androidx.core.view.insets.ProtectionGroup r0 = r1.mGroup
            if (r0 == 0) goto La
            r1.removeProtectionViews()
        La:
            r1.addProtectionViews()
            r1.requestApplyInsets()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.removeProtectionViews()
            r0.maybeUninstallSystemBarStateMonitor()
            return
    }

    public void setProtections(java.util.List<androidx.core.view.insets.Protection> r2) {
            r1 = this;
            java.util.List<androidx.core.view.insets.Protection> r0 = r1.mProtections
            r0.clear()
            java.util.List<androidx.core.view.insets.Protection> r0 = r1.mProtections
            r0.addAll(r2)
            boolean r0 = r1.isAttachedToWindow()
            if (r0 == 0) goto L19
            r1.removeProtectionViews()
            r1.addProtectionViews()
            r1.requestApplyInsets()
        L19:
            return
    }
}
