package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class SpeculativeLoadingConfigAdapter implements org.chromium.support_lib_boundary.SpeculativeLoadingConfigBoundaryInterface {
    private final androidx.webkit.SpeculativeLoadingConfig mSpeculativeLoadingConfig;

    public SpeculativeLoadingConfigAdapter(androidx.webkit.SpeculativeLoadingConfig r1) {
            r0 = this;
            r0.<init>()
            r0.mSpeculativeLoadingConfig = r1
            return
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingConfigBoundaryInterface
    public int getMaxPrefetches() {
            r1 = this;
            androidx.webkit.SpeculativeLoadingConfig r0 = r1.mSpeculativeLoadingConfig
            int r0 = r0.getMaxPrefetches()
            return r0
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingConfigBoundaryInterface
    public int getMaxPrerenders() {
            r1 = this;
            androidx.webkit.SpeculativeLoadingConfig r0 = r1.mSpeculativeLoadingConfig
            int r0 = r0.getMaxPrerenders()
            return r0
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingConfigBoundaryInterface
    public int getPrefetchTTLSeconds() {
            r1 = this;
            androidx.webkit.SpeculativeLoadingConfig r0 = r1.mSpeculativeLoadingConfig
            int r0 = r0.getPrefetchTtlSeconds()
            return r0
    }
}
