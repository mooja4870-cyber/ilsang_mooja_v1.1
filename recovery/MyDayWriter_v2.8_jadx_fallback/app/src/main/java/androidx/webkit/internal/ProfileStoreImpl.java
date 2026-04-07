package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class ProfileStoreImpl implements androidx.webkit.ProfileStore {
    private static androidx.webkit.ProfileStore sInstance;
    private final org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface mProfileStoreImpl;

    private ProfileStoreImpl() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mProfileStoreImpl = r0
            return
    }

    private ProfileStoreImpl(org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface r1) {
            r0 = this;
            r0.<init>()
            r0.mProfileStoreImpl = r1
            return
    }

    public static androidx.webkit.ProfileStore getInstance() {
            androidx.webkit.ProfileStore r0 = androidx.webkit.internal.ProfileStoreImpl.sInstance
            if (r0 != 0) goto L13
            androidx.webkit.internal.ProfileStoreImpl r0 = new androidx.webkit.internal.ProfileStoreImpl
            androidx.webkit.internal.WebViewProviderFactory r1 = androidx.webkit.internal.WebViewGlueCommunicator.getFactory()
            org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface r1 = r1.getProfileStore()
            r0.<init>(r1)
            androidx.webkit.internal.ProfileStoreImpl.sInstance = r0
        L13:
            androidx.webkit.ProfileStore r0 = androidx.webkit.internal.ProfileStoreImpl.sInstance
            return r0
    }

    @Override // androidx.webkit.ProfileStore
    public boolean deleteProfile(java.lang.String r3) throws java.lang.IllegalStateException {
            r2 = this;
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto Lf
            org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface r1 = r2.mProfileStoreImpl
            boolean r1 = r1.deleteProfile(r3)
            return r1
        Lf:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.ProfileStore
    public java.util.List<java.lang.String> getAllProfileNames() {
            r2 = this;
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto Lf
            org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface r1 = r2.mProfileStoreImpl
            java.util.List r1 = r1.getAllProfileNames()
            return r1
        Lf:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.ProfileStore
    public androidx.webkit.Profile getOrCreateProfile(java.lang.String r5) {
            r4 = this;
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1c
            androidx.webkit.internal.ProfileImpl r1 = new androidx.webkit.internal.ProfileImpl
            java.lang.Class<org.chromium.support_lib_boundary.ProfileBoundaryInterface> r2 = org.chromium.support_lib_boundary.ProfileBoundaryInterface.class
            org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface r3 = r4.mProfileStoreImpl
            java.lang.reflect.InvocationHandler r3 = r3.getOrCreateProfile(r5)
            java.lang.Object r2 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r2, r3)
            org.chromium.support_lib_boundary.ProfileBoundaryInterface r2 = (org.chromium.support_lib_boundary.ProfileBoundaryInterface) r2
            r1.<init>(r2)
            return r1
        L1c:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @Override // androidx.webkit.ProfileStore
    public androidx.webkit.Profile getProfile(java.lang.String r5) {
            r4 = this;
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L20
            org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface r1 = r4.mProfileStoreImpl
            java.lang.reflect.InvocationHandler r1 = r1.getProfile(r5)
            if (r1 == 0) goto L1e
            androidx.webkit.internal.ProfileImpl r2 = new androidx.webkit.internal.ProfileImpl
            java.lang.Class<org.chromium.support_lib_boundary.ProfileBoundaryInterface> r3 = org.chromium.support_lib_boundary.ProfileBoundaryInterface.class
            java.lang.Object r3 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r3, r1)
            org.chromium.support_lib_boundary.ProfileBoundaryInterface r3 = (org.chromium.support_lib_boundary.ProfileBoundaryInterface) r3
            r2.<init>(r3)
            return r2
        L1e:
            r2 = 0
            return r2
        L20:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }
}
