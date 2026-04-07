package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class CheckedTextViewCompat {

    private static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.content.res.ColorStateList getCheckMarkTintList(android.widget.CheckedTextView r1) {
                android.content.res.ColorStateList r0 = r1.getCheckMarkTintList()
                return r0
        }

        static android.graphics.PorterDuff.Mode getCheckMarkTintMode(android.widget.CheckedTextView r1) {
                android.graphics.PorterDuff$Mode r0 = r1.getCheckMarkTintMode()
                return r0
        }

        static void setCheckMarkTintList(android.widget.CheckedTextView r0, android.content.res.ColorStateList r1) {
                r0.setCheckMarkTintList(r1)
                return
        }

        static void setCheckMarkTintMode(android.widget.CheckedTextView r0, android.graphics.PorterDuff.Mode r1) {
                r0.setCheckMarkTintMode(r1)
                return
        }
    }

    private CheckedTextViewCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.ReplaceWith(expression = "textView.getCheckMarkDrawable()")
    @java.lang.Deprecated
    public static android.graphics.drawable.Drawable getCheckMarkDrawable(android.widget.CheckedTextView r1) {
            android.graphics.drawable.Drawable r0 = r1.getCheckMarkDrawable()
            return r0
    }

    public static android.content.res.ColorStateList getCheckMarkTintList(android.widget.CheckedTextView r1) {
            android.content.res.ColorStateList r0 = androidx.core.widget.CheckedTextViewCompat.Api21Impl.getCheckMarkTintList(r1)
            return r0
    }

    public static android.graphics.PorterDuff.Mode getCheckMarkTintMode(android.widget.CheckedTextView r1) {
            android.graphics.PorterDuff$Mode r0 = androidx.core.widget.CheckedTextViewCompat.Api21Impl.getCheckMarkTintMode(r1)
            return r0
    }

    public static void setCheckMarkTintList(android.widget.CheckedTextView r0, android.content.res.ColorStateList r1) {
            androidx.core.widget.CheckedTextViewCompat.Api21Impl.setCheckMarkTintList(r0, r1)
            return
    }

    public static void setCheckMarkTintMode(android.widget.CheckedTextView r0, android.graphics.PorterDuff.Mode r1) {
            androidx.core.widget.CheckedTextViewCompat.Api21Impl.setCheckMarkTintMode(r0, r1)
            return
    }
}
