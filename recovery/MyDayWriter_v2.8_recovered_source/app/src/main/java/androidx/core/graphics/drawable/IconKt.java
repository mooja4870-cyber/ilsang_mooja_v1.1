package androidx.core.graphics.drawable;

/* JADX INFO: compiled from: Icon.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0005H\u0087\b¨\u0006\u0006"}, d2 = {"toAdaptiveIcon", "Landroid/graphics/drawable/Icon;", "Landroid/graphics/Bitmap;", "toIcon", "Landroid/net/Uri;", "", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IconKt {
    public static final android.graphics.drawable.Icon toAdaptiveIcon(android.graphics.Bitmap r2) {
            r0 = 0
            android.graphics.drawable.Icon r1 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r2)
            return r1
    }

    public static final android.graphics.drawable.Icon toIcon(android.graphics.Bitmap r2) {
            r0 = 0
            android.graphics.drawable.Icon r1 = android.graphics.drawable.Icon.createWithBitmap(r2)
            return r1
    }

    public static final android.graphics.drawable.Icon toIcon(android.net.Uri r2) {
            r0 = 0
            android.graphics.drawable.Icon r1 = android.graphics.drawable.Icon.createWithContentUri(r2)
            return r1
    }

    public static final android.graphics.drawable.Icon toIcon(byte[] r3) {
            r0 = 0
            r1 = 0
            int r2 = r3.length
            android.graphics.drawable.Icon r1 = android.graphics.drawable.Icon.createWithData(r3, r1, r2)
            return r1
    }
}
