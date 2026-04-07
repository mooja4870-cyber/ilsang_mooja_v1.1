package androidx.appcompat.content.res;

/* JADX INFO: loaded from: classes.dex */
public final class AppCompatResources {
    private AppCompatResources() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context r1, int r2) {
            android.content.res.ColorStateList r0 = androidx.core.content.ContextCompat.getColorStateList(r1, r2)
            return r0
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context r1, int r2) {
            androidx.appcompat.widget.ResourceManagerInternal r0 = androidx.appcompat.widget.ResourceManagerInternal.get()
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1, r2)
            return r0
    }
}
