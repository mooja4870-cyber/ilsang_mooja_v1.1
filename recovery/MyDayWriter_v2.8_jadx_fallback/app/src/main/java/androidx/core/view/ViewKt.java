package androidx.core.view;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a2\u0010\b\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a2\u0010\t\u001a\u00020\n*\u00020\u00022#\b\u0004\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a2\u0010\u000b\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a2\u0010\f\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a5\u0010\r\u001a\u00020\u0001*\u00020\u00022\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u000fH\u0086\b\u001a5\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\b\b\u0003\u0010\u0014\u001a\u00020\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0015\u001a\u00020\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u000fH\u0086\b\u001a\u0017\u0010\u0016\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u000fH\u0086\b\u001a%\u0010\u0018\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u000e\b\u0004\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u001cH\u0086\b\u001a \u0010\u001d\u001a\u00020\u0019*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c\u001a\u0014\u0010\u001e\u001a\u00020\u001f*\u00020\u00022\b\b\u0002\u0010 \u001a\u00020!\u001a&\u0010,\u001a\u00020\u0001*\u00020\u00022\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b/H\u0086\b\u001a7\u0010,\u001a\u00020\u0001\"\n\b\u0000\u00100\u0018\u0001*\u00020.*\u00020\u00022\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u0002H0\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b/H\u0087\b¢\u0006\u0002\b1\"*\u0010$\u001a\u00020#*\u00020\u00022\u0006\u0010\"\u001a\u00020#8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\"*\u0010(\u001a\u00020#*\u00020\u00022\u0006\u0010\"\u001a\u00020#8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'\"*\u0010*\u001a\u00020#*\u00020\u00022\u0006\u0010\"\u001a\u00020#8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'\"\u0016\u00102\u001a\u00020\u000f*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b3\u00104\"\u0016\u00105\u001a\u00020\u000f*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b6\u00104\"\u0016\u00107\u001a\u00020\u000f*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b8\u00104\"\u0016\u00109\u001a\u00020\u000f*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b:\u00104\"\u0016\u0010;\u001a\u00020\u000f*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b<\u00104\"\u0016\u0010=\u001a\u00020\u000f*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b>\u00104\"\u001b\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bB\u0010C\"\u001b\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00020@*\u00020\u00028F¢\u0006\u0006\u001a\u0004\bE\u0010C¨\u0006F"}, d2 = {"doOnNextLayout", "", "Landroid/view/View;", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "view", "doOnLayout", "doOnPreDraw", "Landroidx/core/view/OneShotPreDrawListener;", "doOnAttach", "doOnDetach", "updatePaddingRelative", "start", "", "top", "end", "bottom", "updatePadding", "left", "right", "setPadding", "size", "postDelayed", "Ljava/lang/Runnable;", "delayInMillis", "", "Lkotlin/Function0;", "postOnAnimationDelayed", "drawToBitmap", "Landroid/graphics/Bitmap;", "config", "Landroid/graphics/Bitmap$Config;", "value", "", "isVisible", "(Landroid/view/View;)Z", "setVisible", "(Landroid/view/View;Z)V", "isInvisible", "setInvisible", "isGone", "setGone", "updateLayoutParams", "block", "Landroid/view/ViewGroup$LayoutParams;", "Lkotlin/ExtensionFunctionType;", "T", "updateLayoutParamsTyped", "marginLeft", "getMarginLeft", "(Landroid/view/View;)I", "marginTop", "getMarginTop", "marginRight", "getMarginRight", "marginBottom", "getMarginBottom", "marginStart", "getMarginStart", "marginEnd", "getMarginEnd", "ancestors", "Lkotlin/sequences/Sequence;", "Landroid/view/ViewParent;", "getAncestors", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "allViews", "getAllViews", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ViewKt {





    /* JADX INFO: renamed from: $r8$lambda$dpsg06okbB847jib5cr-d0X1meI, reason: not valid java name */
    public static /* synthetic */ void m69$r8$lambda$dpsg06okbB847jib5crd0X1meI(kotlin.jvm.functions.Function0 r0) {
            postOnAnimationDelayed$lambda$1(r0)
            return
    }

    public static final void doOnAttach(android.view.View r2, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r3) {
            r0 = 0
            boolean r1 = r2.isAttachedToWindow()
            if (r1 == 0) goto Lb
            r3.invoke(r2)
            goto L16
        Lb:
            androidx.core.view.ViewKt$doOnAttach$1 r1 = new androidx.core.view.ViewKt$doOnAttach$1
            r1.<init>(r2, r3)
            android.view.View$OnAttachStateChangeListener r1 = (android.view.View.OnAttachStateChangeListener) r1
            r2.addOnAttachStateChangeListener(r1)
        L16:
            return
    }

    public static final void doOnDetach(android.view.View r2, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r3) {
            r0 = 0
            boolean r1 = r2.isAttachedToWindow()
            if (r1 != 0) goto Lb
            r3.invoke(r2)
            goto L16
        Lb:
            androidx.core.view.ViewKt$doOnDetach$1 r1 = new androidx.core.view.ViewKt$doOnDetach$1
            r1.<init>(r2, r3)
            android.view.View$OnAttachStateChangeListener r1 = (android.view.View.OnAttachStateChangeListener) r1
            r2.addOnAttachStateChangeListener(r1)
        L16:
            return
    }

    public static final void doOnLayout(android.view.View r4, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r5) {
            r0 = 0
            boolean r1 = r4.isLaidOut()
            if (r1 == 0) goto L11
            boolean r1 = r4.isLayoutRequested()
            if (r1 != 0) goto L11
            r5.invoke(r4)
            goto L1f
        L11:
            r1 = r4
            r2 = 0
            androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1 r3 = new androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1
            r3.<init>(r5)
            android.view.View$OnLayoutChangeListener r3 = (android.view.View.OnLayoutChangeListener) r3
            r1.addOnLayoutChangeListener(r3)
        L1f:
            return
    }

    public static final void doOnNextLayout(android.view.View r2, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r3) {
            r0 = 0
            androidx.core.view.ViewKt$doOnNextLayout$1 r1 = new androidx.core.view.ViewKt$doOnNextLayout$1
            r1.<init>(r3)
            android.view.View$OnLayoutChangeListener r1 = (android.view.View.OnLayoutChangeListener) r1
            r2.addOnLayoutChangeListener(r1)
            return
    }

    public static final androidx.core.view.OneShotPreDrawListener doOnPreDraw(android.view.View r2, kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r3) {
            r0 = 0
            androidx.core.view.ViewKt$doOnPreDraw$1 r1 = new androidx.core.view.ViewKt$doOnPreDraw$1
            r1.<init>(r3, r2)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            androidx.core.view.OneShotPreDrawListener r1 = androidx.core.view.OneShotPreDrawListener.add(r2, r1)
            return r1
    }

    public static final android.graphics.Bitmap drawToBitmap(android.view.View r7, android.graphics.Bitmap.Config r8) {
            boolean r0 = r7.isLaidOut()
            if (r0 == 0) goto L30
            int r0 = r7.getWidth()
            int r1 = r7.getHeight()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r8)
            r1 = 0
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r3 = r2
            r4 = 0
            int r5 = r7.getScrollX()
            float r5 = (float) r5
            float r5 = -r5
            int r6 = r7.getScrollY()
            float r6 = (float) r6
            float r6 = -r6
            r3.translate(r5, r6)
            r7.draw(r3)
            return r0
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View needs to be laid out before calling drawToBitmap()"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ android.graphics.Bitmap drawToBitmap$default(android.view.View r0, android.graphics.Bitmap.Config r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
        L6:
            android.graphics.Bitmap r0 = drawToBitmap(r0, r1)
            return r0
    }

    public static final kotlin.sequences.Sequence<android.view.View> getAllViews(android.view.View r2) {
            androidx.core.view.ViewKt$allViews$1 r0 = new androidx.core.view.ViewKt$allViews$1
            r1 = 0
            r0.<init>(r2, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.sequence(r0)
            return r0
    }

    public static final kotlin.sequences.Sequence<android.view.ViewParent> getAncestors(android.view.View r2) {
            android.view.ViewParent r0 = r2.getParent()
            androidx.core.view.ViewKt$ancestors$1 r1 = androidx.core.view.ViewKt$ancestors$1.INSTANCE
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.generateSequence(r0, r1)
            return r0
    }

    public static final int getMarginBottom(android.view.View r3) {
            r0 = 0
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto Lc
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L12
            int r1 = r1.bottomMargin
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    public static final int getMarginEnd(android.view.View r3) {
            r0 = 0
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L11
            r2 = r1
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r2 = r2.getMarginEnd()
            goto L12
        L11:
            r2 = 0
        L12:
            return r2
    }

    public static final int getMarginLeft(android.view.View r3) {
            r0 = 0
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto Lc
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L12
            int r1 = r1.leftMargin
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    public static final int getMarginRight(android.view.View r3) {
            r0 = 0
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto Lc
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L12
            int r1 = r1.rightMargin
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    public static final int getMarginStart(android.view.View r3) {
            r0 = 0
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L11
            r2 = r1
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r2 = r2.getMarginStart()
            goto L12
        L11:
            r2 = 0
        L12:
            return r2
    }

    public static final int getMarginTop(android.view.View r3) {
            r0 = 0
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto Lc
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L12
            int r1 = r1.topMargin
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    public static final boolean isGone(android.view.View r3) {
            r0 = 0
            int r1 = r3.getVisibility()
            r2 = 8
            if (r1 != r2) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
    }

    public static final boolean isInvisible(android.view.View r3) {
            r0 = 0
            int r1 = r3.getVisibility()
            r2 = 4
            if (r1 != r2) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public static final boolean isVisible(android.view.View r2) {
            r0 = 0
            int r1 = r2.getVisibility()
            if (r1 != 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public static final java.lang.Runnable postDelayed(android.view.View r2, long r3, kotlin.jvm.functions.Function0<kotlin.Unit> r5) {
            r0 = 0
            androidx.core.view.ViewKt$postDelayed$runnable$1 r1 = new androidx.core.view.ViewKt$postDelayed$runnable$1
            r1.<init>(r5)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2.postDelayed(r1, r3)
            return r1
    }

    public static final java.lang.Runnable postOnAnimationDelayed(android.view.View r1, long r2, kotlin.jvm.functions.Function0<kotlin.Unit> r4) {
            androidx.core.view.ViewKt$$ExternalSyntheticLambda0 r0 = new androidx.core.view.ViewKt$$ExternalSyntheticLambda0
            r0.<init>(r4)
            r1.postOnAnimationDelayed(r0, r2)
            return r0
    }

    private static final void postOnAnimationDelayed$lambda$1(kotlin.jvm.functions.Function0 r0) {
            r0.invoke()
            return
    }

    public static final void setGone(android.view.View r2, boolean r3) {
            r0 = 0
            if (r3 == 0) goto L6
            r1 = 8
            goto L7
        L6:
            r1 = 0
        L7:
            r2.setVisibility(r1)
            return
    }

    public static final void setInvisible(android.view.View r2, boolean r3) {
            r0 = 0
            if (r3 == 0) goto L5
            r1 = 4
            goto L6
        L5:
            r1 = 0
        L6:
            r2.setVisibility(r1)
            return
    }

    public static final void setPadding(android.view.View r1, int r2) {
            r0 = 0
            r1.setPadding(r2, r2, r2, r2)
            return
    }

    public static final void setVisible(android.view.View r2, boolean r3) {
            r0 = 0
            if (r3 == 0) goto L5
            r1 = 0
            goto L7
        L5:
            r1 = 8
        L7:
            r2.setVisibility(r1)
            return
    }

    public static final void updateLayoutParams(android.view.View r5, kotlin.jvm.functions.Function1<? super android.view.ViewGroup.LayoutParams, kotlin.Unit> r6) {
            r0 = 0
            r1 = r5
            r2 = 0
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            if (r3 == 0) goto L11
            r6.invoke(r3)
            r1.setLayoutParams(r3)
            return
        L11:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            r3.<init>(r4)
            throw r3
    }

    public static final /* synthetic */ <T extends android.view.ViewGroup.LayoutParams> void updateLayoutParamsTyped(android.view.View r4, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r5) {
            r0 = 0
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r2 = 1
            java.lang.String r3 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r2, r3)
            android.view.ViewGroup$LayoutParams r1 = (android.view.ViewGroup.LayoutParams) r1
            r5.invoke(r1)
            r4.setLayoutParams(r1)
            return
    }

    public static final void updatePadding(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = 0
            r1.setPadding(r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void updatePadding$default(android.view.View r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L8
            int r1 = r0.getPaddingLeft()
        L8:
            r6 = r5 & 2
            if (r6 == 0) goto L10
            int r2 = r0.getPaddingTop()
        L10:
            r6 = r5 & 4
            if (r6 == 0) goto L18
            int r3 = r0.getPaddingRight()
        L18:
            r5 = r5 & 8
            if (r5 == 0) goto L20
            int r4 = r0.getPaddingBottom()
        L20:
            r5 = 0
            r0.setPadding(r1, r2, r3, r4)
            return
    }

    public static final void updatePaddingRelative(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = 0
            r1.setPaddingRelative(r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void updatePaddingRelative$default(android.view.View r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L8
            int r1 = r0.getPaddingStart()
        L8:
            r6 = r5 & 2
            if (r6 == 0) goto L10
            int r2 = r0.getPaddingTop()
        L10:
            r6 = r5 & 4
            if (r6 == 0) goto L18
            int r3 = r0.getPaddingEnd()
        L18:
            r5 = r5 & 8
            if (r5 == 0) goto L20
            int r4 = r0.getPaddingBottom()
        L20:
            r5 = 0
            r0.setPaddingRelative(r1, r2, r3, r4)
            return
    }
}
