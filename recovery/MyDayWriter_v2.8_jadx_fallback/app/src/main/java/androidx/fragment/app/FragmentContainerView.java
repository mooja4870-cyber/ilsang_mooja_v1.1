package androidx.fragment.app;

/* JADX INFO: compiled from: FragmentContainerView.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001<B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u001f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011H\u0002J\"\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0017J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"H\u0014J \u0010#\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%H\u0014J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0011H\u0016J\u0017\u0010(\u001a\u0002H)\"\n\b\u0000\u0010)*\u0004\u0018\u00010*¢\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0017J\b\u0010-\u001a\u00020\u0016H\u0016J\u0010\u0010.\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0011H\u0016J\u0010\u0010/\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\bH\u0016J\u0010\u00100\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0011H\u0016J\u0018\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\bH\u0016J\u0018\u00104\u001a\u00020\u00162\u0006\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\bH\u0016J\u0010\u00105\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0001J\u0012\u00106\u001a\u00020\u00162\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0012\u00109\u001a\u00020\u00162\b\u0010:\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010;\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0011H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fm", "Landroidx/fragment/app/FragmentManager;", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/FragmentManager;)V", "applyWindowInsetsListener", "Landroid/view/View$OnApplyWindowInsetsListener;", "disappearingFragmentChildren", "", "Landroid/view/View;", "drawDisappearingViewsFirst", "", "transitioningFragmentViews", "addDisappearingFragmentView", "", "v", "addView", "child", "index", "params", "Landroid/view/ViewGroup$LayoutParams;", "dispatchApplyWindowInsets", "Landroid/view/WindowInsets;", "insets", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "drawChild", "drawingTime", "", "endViewTransition", "view", "getFragment", "F", "Landroidx/fragment/app/Fragment;", "()Landroidx/fragment/app/Fragment;", "onApplyWindowInsets", "removeAllViewsInLayout", "removeView", "removeViewAt", "removeViewInLayout", "removeViews", "start", "count", "removeViewsInLayout", "setDrawDisappearingViewsLast", "setLayoutTransition", "transition", "Landroid/animation/LayoutTransition;", "setOnApplyWindowInsetsListener", "listener", "startViewTransition", "Api20Impl", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FragmentContainerView extends android.widget.FrameLayout {
    private android.view.View.OnApplyWindowInsetsListener applyWindowInsetsListener;
    private final java.util.List<android.view.View> disappearingFragmentChildren;
    private boolean drawDisappearingViewsFirst;
    private final java.util.List<android.view.View> transitioningFragmentViews;

    /* JADX INFO: compiled from: FragmentContainerView.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Landroidx/fragment/app/FragmentContainerView$Api20Impl;", "", "()V", "onApplyWindowInsets", "Landroid/view/WindowInsets;", "onApplyWindowInsetsListener", "Landroid/view/View$OnApplyWindowInsetsListener;", "v", "Landroid/view/View;", "insets", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api20Impl {
        public static final androidx.fragment.app.FragmentContainerView.Api20Impl INSTANCE = null;

        static {
                androidx.fragment.app.FragmentContainerView$Api20Impl r0 = new androidx.fragment.app.FragmentContainerView$Api20Impl
                r0.<init>()
                androidx.fragment.app.FragmentContainerView.Api20Impl.INSTANCE = r0
                return
        }

        private Api20Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public final android.view.WindowInsets onApplyWindowInsets(android.view.View.OnApplyWindowInsetsListener r3, android.view.View r4, android.view.WindowInsets r5) {
                r2 = this;
                java.lang.String r0 = "onApplyWindowInsetsListener"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "v"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "insets"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                android.view.WindowInsets r0 = r3.onApplyWindowInsets(r4, r5)
                java.lang.String r1 = "onApplyWindowInsetsListe…lyWindowInsets(v, insets)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }
    }

    public FragmentContainerView(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1.disappearingFragmentChildren = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1.transitioningFragmentViews = r0
            r0 = 1
            r1.drawDisappearingViewsFirst = r0
            return
    }

    public FragmentContainerView(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public FragmentContainerView(android.content.Context r12, android.util.AttributeSet r13, int r14) {
            r11 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r11.<init>(r12, r13, r14)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r11.disappearingFragmentChildren = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r11.transitioningFragmentViews = r0
            r0 = 1
            r11.drawDisappearingViewsFirst = r0
            if (r13 == 0) goto L7b
            r0 = 0
            java.lang.String r0 = r13.getClassAttribute()
            r1 = 0
            java.lang.String r1 = "class"
            int[] r2 = androidx.fragment.R.styleable.FragmentContainerView
            java.lang.String r3 = "FragmentContainerView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r3 = r12
            r4 = 0
            r5 = 0
            r6 = 0
            android.content.res.TypedArray r7 = r3.obtainStyledAttributes(r13, r2, r4, r5)
            r8 = r7
            r9 = 0
            if (r0 != 0) goto L42
            int r10 = androidx.fragment.R.styleable.FragmentContainerView_android_name
            java.lang.String r0 = r8.getString(r10)
            java.lang.String r1 = "android:name"
        L42:
            r7.recycle()
            if (r0 == 0) goto L7b
            boolean r2 = r11.isInEditMode()
            if (r2 == 0) goto L50
            goto L7b
        L50:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "FragmentContainerView must be within a FragmentActivity to use "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r4 = "=\""
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            r4 = 34
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L7b:
            return
    }

    public /* synthetic */ FragmentContainerView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.<init>(r1, r2, r3)
            return
    }

    public FragmentContainerView(android.content.Context r13, android.util.AttributeSet r14, androidx.fragment.app.FragmentManager r15) {
            r12 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "attrs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "fm"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r12.<init>(r13, r14)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r12.disappearingFragmentChildren = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r12.transitioningFragmentViews = r0
            r0 = 1
            r12.drawDisappearingViewsFirst = r0
            r1 = 0
            java.lang.String r1 = r14.getClassAttribute()
            r2 = 0
            int[] r3 = androidx.fragment.R.styleable.FragmentContainerView
            java.lang.String r4 = "FragmentContainerView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r4 = r13
            r5 = 0
            r6 = 0
            r7 = 0
            android.content.res.TypedArray r8 = r4.obtainStyledAttributes(r14, r3, r5, r6)
            r9 = r8
            r10 = 0
            if (r1 != 0) goto L46
            int r11 = androidx.fragment.R.styleable.FragmentContainerView_android_name
            java.lang.String r1 = r9.getString(r11)
        L46:
            int r11 = androidx.fragment.R.styleable.FragmentContainerView_android_tag
            java.lang.String r2 = r9.getString(r11)
            r8.recycle()
            int r3 = r12.getId()
            androidx.fragment.app.Fragment r4 = r15.findFragmentById(r3)
            if (r1 == 0) goto Lcb
            if (r4 != 0) goto Lcb
            r5 = -1
            if (r3 != r5) goto L95
            if (r2 == 0) goto L76
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = " with tag "
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L78
        L76:
            java.lang.String r0 = ""
        L78:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "FragmentContainerView must have an android:id to add Fragment "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L95:
            androidx.fragment.app.FragmentFactory r5 = r15.getFragmentFactory()
            java.lang.ClassLoader r6 = r13.getClassLoader()
            androidx.fragment.app.Fragment r5 = r5.instantiate(r6, r1)
            java.lang.String r6 = "fm.fragmentFactory.insta…ontext.classLoader, name)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r5.mFragmentId = r3
            r5.mContainerId = r3
            r5.mTag = r2
            r5.mFragmentManager = r15
            androidx.fragment.app.FragmentHostCallback r6 = r15.getHost()
            r5.mHost = r6
            r6 = 0
            r5.onInflate(r13, r14, r6)
            androidx.fragment.app.FragmentTransaction r6 = r15.beginTransaction()
            androidx.fragment.app.FragmentTransaction r0 = r6.setReorderingAllowed(r0)
            r6 = r12
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            androidx.fragment.app.FragmentTransaction r0 = r0.add(r6, r5, r2)
            r0.commitNowAllowingStateLoss()
        Lcb:
            r15.onContainerAvailable(r12)
            return
    }

    private final void addDisappearingFragmentView(android.view.View r2) {
            r1 = this;
            java.util.List<android.view.View> r0 = r1.transitioningFragmentViews
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto Ld
            java.util.List<android.view.View> r0 = r1.disappearingFragmentChildren
            r0.add(r2)
        Ld:
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r4, int r5, android.view.ViewGroup.LayoutParams r6) {
            r3 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.fragment.app.Fragment r0 = androidx.fragment.app.FragmentManager.getViewFragment(r4)
            if (r0 == 0) goto Lf
            super.addView(r4, r5, r6)
            return
        Lf:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Views added to a FragmentContainerView must be associated with a Fragment. View "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " is not associated with a Fragment."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets r6) {
            r5 = this;
            java.lang.String r0 = "insets"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r6)
            java.lang.String r1 = "toWindowInsetsCompat(insets)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.view.View$OnApplyWindowInsetsListener r1 = r5.applyWindowInsetsListener
            if (r1 == 0) goto L25
            androidx.fragment.app.FragmentContainerView$Api20Impl r1 = androidx.fragment.app.FragmentContainerView.Api20Impl.INSTANCE
            android.view.View$OnApplyWindowInsetsListener r2 = r5.applyWindowInsetsListener
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r3 = r5
            android.view.View r3 = (android.view.View) r3
            android.view.WindowInsets r1 = r1.onApplyWindowInsets(r2, r3, r6)
            androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r1)
            goto L2c
        L25:
            r1 = r5
            android.view.View r1 = (android.view.View) r1
            androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.ViewCompat.onApplyWindowInsets(r1, r0)
        L2c:
            java.lang.String r2 = "if (applyWindowInsetsLis…, insetsCompat)\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            boolean r2 = r1.isConsumed()
            if (r2 != 0) goto L48
            r2 = 0
            int r3 = r5.getChildCount()
        L3c:
            if (r2 >= r3) goto L48
            android.view.View r4 = r5.getChildAt(r2)
            androidx.core.view.ViewCompat.dispatchApplyWindowInsets(r4, r1)
            int r2 = r2 + 1
            goto L3c
        L48:
            return r6
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r9) {
            r8 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r8.drawDisappearingViewsFirst
            if (r0 == 0) goto L2b
            java.util.List<android.view.View> r0 = r8.disappearingFragmentChildren
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r2.next()
            r4 = r3
            android.view.View r4 = (android.view.View) r4
            r5 = 0
            long r6 = r8.getDrawingTime()
            super.drawChild(r9, r4, r6)
            goto L12
        L2a:
        L2b:
            super.dispatchDraw(r9)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas r2, android.view.View r3, long r4) {
            r1 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r1.drawDisappearingViewsFirst
            if (r0 == 0) goto L22
            java.util.List<android.view.View> r0 = r1.disappearingFragmentChildren
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L22
            java.util.List<android.view.View> r0 = r1.disappearingFragmentChildren
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L22
            r0 = 0
            return r0
        L22:
            boolean r0 = super.drawChild(r2, r3, r4)
            return r0
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.List<android.view.View> r0 = r1.transitioningFragmentViews
            r0.remove(r2)
            java.util.List<android.view.View> r0 = r1.disappearingFragmentChildren
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L15
            r0 = 1
            r1.drawDisappearingViewsFirst = r0
        L15:
            super.endViewTransition(r2)
            return
    }

    public final <F extends androidx.fragment.app.Fragment> F getFragment() {
            r2 = this;
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            androidx.fragment.app.FragmentManager r0 = androidx.fragment.app.FragmentManager.findFragmentManager(r0)
            int r1 = r2.getId()
            androidx.fragment.app.Fragment r0 = r0.findFragmentById(r1)
            return r0
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r2) {
            r1 = this;
            java.lang.String r0 = "insets"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            return r2
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
            r3 = this;
            int r0 = r3.getChildCount()
            int r0 = r0 + (-1)
        L6:
            r1 = -1
            if (r1 >= r0) goto L18
            android.view.View r1 = r3.getChildAt(r0)
            java.lang.String r2 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r3.addDisappearingFragmentView(r1)
            int r0 = r0 + (-1)
            goto L6
        L18:
            super.removeAllViewsInLayout()
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.addDisappearingFragmentView(r2)
            super.removeView(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int r3) {
            r2 = this;
            android.view.View r0 = r2.getChildAt(r3)
            java.lang.String r1 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.addDisappearingFragmentView(r0)
            super.removeViewAt(r3)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.addDisappearingFragmentView(r2)
            super.removeViewInLayout(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViews(int r5, int r6) {
            r4 = this;
            r0 = r5
            int r1 = r5 + r6
        L3:
            if (r0 >= r1) goto L14
            android.view.View r2 = r4.getChildAt(r0)
            java.lang.String r3 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r4.addDisappearingFragmentView(r2)
            int r0 = r0 + 1
            goto L3
        L14:
            super.removeViews(r5, r6)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int r5, int r6) {
            r4 = this;
            r0 = r5
            int r1 = r5 + r6
        L3:
            if (r0 >= r1) goto L14
            android.view.View r2 = r4.getChildAt(r0)
            java.lang.String r3 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r4.addDisappearingFragmentView(r2)
            int r0 = r0 + 1
            goto L3
        L14:
            super.removeViewsInLayout(r5, r6)
            return
    }

    public final void setDrawDisappearingViewsLast(boolean r1) {
            r0 = this;
            r0.drawDisappearingViewsFirst = r1
            return
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(android.animation.LayoutTransition r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\"."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener r1) {
            r0 = this;
            r0.applyWindowInsetsListener = r1
            return
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r1) goto L10
            java.util.List<android.view.View> r0 = r1.transitioningFragmentViews
            r0.add(r2)
        L10:
            super.startViewTransition(r2)
            return
    }
}
