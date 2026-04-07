package androidx.core.graphics;

/* JADX INFO: compiled from: PorterDuff.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b\u001a\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\b¨\u0006\u0007"}, d2 = {"toXfermode", "Landroid/graphics/PorterDuffXfermode;", "Landroid/graphics/PorterDuff$Mode;", "toColorFilter", "Landroid/graphics/PorterDuffColorFilter;", "color", "", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PorterDuffKt {
    public static final android.graphics.PorterDuffColorFilter toColorFilter(android.graphics.PorterDuff.Mode r2, int r3) {
            r0 = 0
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            r1.<init>(r3, r2)
            return r1
    }

    public static final android.graphics.PorterDuffXfermode toXfermode(android.graphics.PorterDuff.Mode r2) {
            r0 = 0
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            r1.<init>(r2)
            return r1
    }
}
