package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public class ImageViewCompat {

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.content.res.ColorStateList getImageTintList(android.widget.ImageView r1) {
                android.content.res.ColorStateList r0 = r1.getImageTintList()
                return r0
        }

        static android.graphics.PorterDuff.Mode getImageTintMode(android.widget.ImageView r1) {
                android.graphics.PorterDuff$Mode r0 = r1.getImageTintMode()
                return r0
        }

        static void setImageTintList(android.widget.ImageView r0, android.content.res.ColorStateList r1) {
                r0.setImageTintList(r1)
                return
        }

        static void setImageTintMode(android.widget.ImageView r0, android.graphics.PorterDuff.Mode r1) {
                r0.setImageTintMode(r1)
                return
        }
    }

    private ImageViewCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.res.ColorStateList getImageTintList(android.widget.ImageView r1) {
            android.content.res.ColorStateList r0 = androidx.core.widget.ImageViewCompat.Api21Impl.getImageTintList(r1)
            return r0
    }

    public static android.graphics.PorterDuff.Mode getImageTintMode(android.widget.ImageView r1) {
            android.graphics.PorterDuff$Mode r0 = androidx.core.widget.ImageViewCompat.Api21Impl.getImageTintMode(r1)
            return r0
    }

    public static void setImageTintList(android.widget.ImageView r0, android.content.res.ColorStateList r1) {
            androidx.core.widget.ImageViewCompat.Api21Impl.setImageTintList(r0, r1)
            return
    }

    public static void setImageTintMode(android.widget.ImageView r0, android.graphics.PorterDuff.Mode r1) {
            androidx.core.widget.ImageViewCompat.Api21Impl.setImageTintMode(r0, r1)
            return
    }
}
