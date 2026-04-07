package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class ApiHelperForTiramisu {
    private ApiHelperForTiramisu() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.content.pm.ServiceInfo getServiceInfo(android.content.pm.PackageManager r1, android.content.ComponentName r2, android.content.pm.PackageManager.ComponentInfoFlags r3) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.pm.ServiceInfo r0 = r1.getServiceInfo(r2, r3)
            return r0
    }

    static android.content.pm.PackageManager.ComponentInfoFlags of(long r1) {
            android.content.pm.PackageManager$ComponentInfoFlags r0 = android.content.pm.PackageManager.ComponentInfoFlags.of(r1)
            return r0
    }
}
