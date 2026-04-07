package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public class BlendModeColorFilterCompat {

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.ColorFilter createBlendModeColorFilter(int r2, java.lang.Object r3) {
                android.graphics.BlendModeColorFilter r0 = new android.graphics.BlendModeColorFilter
                r1 = r3
                android.graphics.BlendMode r1 = (android.graphics.BlendMode) r1
                r0.<init>(r2, r1)
                return r0
        }
    }

    private BlendModeColorFilterCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.ColorFilter createBlendModeColorFilterCompat(int r3, androidx.core.graphics.BlendModeCompat r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 < r1) goto L15
        L8:
            java.lang.Object r0 = androidx.core.graphics.BlendModeUtils.Api29Impl.obtainBlendModeFromCompat(r4)
            if (r0 == 0) goto L13
            android.graphics.ColorFilter r2 = androidx.core.graphics.BlendModeColorFilterCompat.Api29Impl.createBlendModeColorFilter(r3, r0)
            goto L14
        L13:
        L14:
            return r2
        L15:
            android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.BlendModeUtils.obtainPorterDuffFromCompat(r4)
            if (r0 == 0) goto L22
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            r2.<init>(r3, r0)
            goto L23
        L22:
        L23:
            return r2
    }
}
