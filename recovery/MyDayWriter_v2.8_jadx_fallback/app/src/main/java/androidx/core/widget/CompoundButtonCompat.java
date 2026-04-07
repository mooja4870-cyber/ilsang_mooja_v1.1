package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class CompoundButtonCompat {
    private static final java.lang.String TAG = "CompoundButtonCompat";
    private static java.lang.reflect.Field sButtonDrawableField;
    private static boolean sButtonDrawableFieldFetched;

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.content.res.ColorStateList getButtonTintList(android.widget.CompoundButton r1) {
                android.content.res.ColorStateList r0 = r1.getButtonTintList()
                return r0
        }

        static android.graphics.PorterDuff.Mode getButtonTintMode(android.widget.CompoundButton r1) {
                android.graphics.PorterDuff$Mode r0 = r1.getButtonTintMode()
                return r0
        }

        static void setButtonTintList(android.widget.CompoundButton r0, android.content.res.ColorStateList r1) {
                r0.setButtonTintList(r1)
                return
        }

        static void setButtonTintMode(android.widget.CompoundButton r0, android.graphics.PorterDuff.Mode r1) {
                r0.setButtonTintMode(r1)
                return
        }
    }

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.drawable.Drawable getButtonDrawable(android.widget.CompoundButton r1) {
                android.graphics.drawable.Drawable r0 = r1.getButtonDrawable()
                return r0
        }
    }

    private CompoundButtonCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.drawable.Drawable getButtonDrawable(android.widget.CompoundButton r1) {
            android.graphics.drawable.Drawable r0 = androidx.core.widget.CompoundButtonCompat.Api23Impl.getButtonDrawable(r1)
            return r0
    }

    public static android.content.res.ColorStateList getButtonTintList(android.widget.CompoundButton r1) {
            android.content.res.ColorStateList r0 = androidx.core.widget.CompoundButtonCompat.Api21Impl.getButtonTintList(r1)
            return r0
    }

    public static android.graphics.PorterDuff.Mode getButtonTintMode(android.widget.CompoundButton r1) {
            android.graphics.PorterDuff$Mode r0 = androidx.core.widget.CompoundButtonCompat.Api21Impl.getButtonTintMode(r1)
            return r0
    }

    public static void setButtonTintList(android.widget.CompoundButton r0, android.content.res.ColorStateList r1) {
            androidx.core.widget.CompoundButtonCompat.Api21Impl.setButtonTintList(r0, r1)
            return
    }

    public static void setButtonTintMode(android.widget.CompoundButton r0, android.graphics.PorterDuff.Mode r1) {
            androidx.core.widget.CompoundButtonCompat.Api21Impl.setButtonTintMode(r0, r1)
            return
    }
}
