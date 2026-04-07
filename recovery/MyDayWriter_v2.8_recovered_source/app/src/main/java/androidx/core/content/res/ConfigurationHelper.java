package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public final class ConfigurationHelper {
    private ConfigurationHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getDensityDpi(android.content.res.Resources r1) {
            android.content.res.Configuration r0 = r1.getConfiguration()
            int r0 = r0.densityDpi
            return r0
    }
}
