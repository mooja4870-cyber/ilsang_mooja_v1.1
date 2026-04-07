package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class WebStorageAdapter implements org.chromium.support_lib_boundary.WebStorageBoundaryInterface {
    final org.chromium.support_lib_boundary.WebStorageBoundaryInterface mImpl;

    public WebStorageAdapter(org.chromium.support_lib_boundary.WebStorageBoundaryInterface r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    @Override // org.chromium.support_lib_boundary.WebStorageBoundaryInterface
    public void deleteBrowsingData(java.util.concurrent.Executor r2, java.lang.Runnable r3) {
            r1 = this;
            org.chromium.support_lib_boundary.WebStorageBoundaryInterface r0 = r1.mImpl
            r0.deleteBrowsingData(r2, r3)
            return
    }

    @Override // org.chromium.support_lib_boundary.WebStorageBoundaryInterface
    public java.lang.String deleteBrowsingDataForSite(java.lang.String r2, java.util.concurrent.Executor r3, java.lang.Runnable r4) {
            r1 = this;
            org.chromium.support_lib_boundary.WebStorageBoundaryInterface r0 = r1.mImpl
            java.lang.String r0 = r0.deleteBrowsingDataForSite(r2, r3, r4)
            return r0
    }
}
