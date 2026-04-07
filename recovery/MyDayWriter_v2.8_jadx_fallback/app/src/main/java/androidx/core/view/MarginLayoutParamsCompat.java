package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class MarginLayoutParamsCompat {
    private MarginLayoutParamsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static int getLayoutDirection(android.view.ViewGroup.MarginLayoutParams r2) {
            int r0 = r2.getLayoutDirection()
            if (r0 == 0) goto La
            r1 = 1
            if (r0 == r1) goto La
            r0 = 0
        La:
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "lp.getMarginEnd()")
    @java.lang.Deprecated
    public static int getMarginEnd(android.view.ViewGroup.MarginLayoutParams r1) {
            int r0 = r1.getMarginEnd()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "lp.getMarginStart()")
    @java.lang.Deprecated
    public static int getMarginStart(android.view.ViewGroup.MarginLayoutParams r1) {
            int r0 = r1.getMarginStart()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "lp.isMarginRelative()")
    @java.lang.Deprecated
    public static boolean isMarginRelative(android.view.ViewGroup.MarginLayoutParams r1) {
            boolean r0 = r1.isMarginRelative()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "lp.resolveLayoutDirection(layoutDirection)")
    @java.lang.Deprecated
    public static void resolveLayoutDirection(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            r0.resolveLayoutDirection(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "lp.setLayoutDirection(layoutDirection)")
    @java.lang.Deprecated
    public static void setLayoutDirection(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            r0.setLayoutDirection(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "lp.setMarginEnd(marginEnd)")
    @java.lang.Deprecated
    public static void setMarginEnd(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            r0.setMarginEnd(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "lp.setMarginStart(marginStart)")
    @java.lang.Deprecated
    public static void setMarginStart(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            r0.setMarginStart(r1)
            return
    }
}
