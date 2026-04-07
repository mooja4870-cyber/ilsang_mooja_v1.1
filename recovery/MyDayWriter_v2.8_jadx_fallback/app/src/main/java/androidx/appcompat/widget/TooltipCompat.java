package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class TooltipCompat {

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setTooltipText(android.view.View r0, java.lang.CharSequence r1) {
                r0.setTooltipText(r1)
                return
        }
    }

    private TooltipCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void setTooltipText(android.view.View r2, java.lang.CharSequence r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto La
            androidx.appcompat.widget.TooltipCompat.Api26Impl.setTooltipText(r2, r3)
            goto Ld
        La:
            androidx.appcompat.widget.TooltipCompatHandler.setTooltipText(r2, r3)
        Ld:
            return
    }
}
