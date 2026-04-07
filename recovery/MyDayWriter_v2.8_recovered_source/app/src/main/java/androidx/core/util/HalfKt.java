package androidx.core.util;

/* JADX INFO: compiled from: Half.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0010\u0007\n\u0002\u0010\u0006\n\u0002\u0010\u000e\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0004H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0005H\u0087\b¨\u0006\u0006"}, d2 = {"toHalf", "Landroid/util/Half;", "", "", "", "", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HalfKt {
    public static final android.util.Half toHalf(double r3) {
            r0 = 0
            float r1 = (float) r3
            r2 = 0
            android.util.Half r1 = android.util.Half.valueOf(r1)
            return r1
    }

    public static final android.util.Half toHalf(float r2) {
            r0 = 0
            android.util.Half r1 = android.util.Half.valueOf(r2)
            return r1
    }

    public static final android.util.Half toHalf(java.lang.String r2) {
            r0 = 0
            android.util.Half r1 = android.util.Half.valueOf(r2)
            return r1
    }

    public static final android.util.Half toHalf(short r2) {
            r0 = 0
            android.util.Half r1 = android.util.Half.valueOf(r2)
            return r1
    }
}
