package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public final class UserAgentMetadata {
    public static final int BITNESS_DEFAULT = 0;
    private final java.lang.String mArchitecture;
    private int mBitness;
    private final java.util.List<androidx.webkit.UserAgentMetadata.BrandVersion> mBrandVersionList;
    private final java.lang.String mFullVersion;
    private boolean mMobile;
    private final java.lang.String mModel;
    private final java.lang.String mPlatform;
    private final java.lang.String mPlatformVersion;
    private boolean mWow64;

    /* JADX INFO: renamed from: androidx.webkit.UserAgentMetadata$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class BrandVersion {
        private final java.lang.String mBrand;
        private final java.lang.String mFullVersion;
        private final java.lang.String mMajorVersion;

        public static final class Builder {
            private java.lang.String mBrand;
            private java.lang.String mFullVersion;
            private java.lang.String mMajorVersion;

            public Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public Builder(androidx.webkit.UserAgentMetadata.BrandVersion r2) {
                    r1 = this;
                    r1.<init>()
                    java.lang.String r0 = r2.getBrand()
                    r1.mBrand = r0
                    java.lang.String r0 = r2.getMajorVersion()
                    r1.mMajorVersion = r0
                    java.lang.String r0 = r2.getFullVersion()
                    r1.mFullVersion = r0
                    return
            }

            public androidx.webkit.UserAgentMetadata.BrandVersion build() {
                    r5 = this;
                    java.lang.String r0 = r5.mBrand
                    if (r0 == 0) goto L3d
                    java.lang.String r0 = r5.mBrand
                    java.lang.String r0 = r0.trim()
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto L3d
                    java.lang.String r0 = r5.mMajorVersion
                    if (r0 == 0) goto L3d
                    java.lang.String r0 = r5.mMajorVersion
                    java.lang.String r0 = r0.trim()
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto L3d
                    java.lang.String r0 = r5.mFullVersion
                    if (r0 == 0) goto L3d
                    java.lang.String r0 = r5.mFullVersion
                    java.lang.String r0 = r0.trim()
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto L3d
                    androidx.webkit.UserAgentMetadata$BrandVersion r0 = new androidx.webkit.UserAgentMetadata$BrandVersion
                    java.lang.String r1 = r5.mBrand
                    java.lang.String r2 = r5.mMajorVersion
                    java.lang.String r3 = r5.mFullVersion
                    r4 = 0
                    r0.<init>(r1, r2, r3, r4)
                    return r0
                L3d:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Brand name, major version and full version should not be null or blank."
                    r0.<init>(r1)
                    throw r0
            }

            public androidx.webkit.UserAgentMetadata.BrandVersion.Builder setBrand(java.lang.String r3) {
                    r2 = this;
                    java.lang.String r0 = r3.trim()
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto Ld
                    r2.mBrand = r3
                    return r2
                Ld:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "Brand should not be blank."
                    r0.<init>(r1)
                    throw r0
            }

            public androidx.webkit.UserAgentMetadata.BrandVersion.Builder setFullVersion(java.lang.String r3) {
                    r2 = this;
                    java.lang.String r0 = r3.trim()
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto Ld
                    r2.mFullVersion = r3
                    return r2
                Ld:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "FullVersion should not be blank."
                    r0.<init>(r1)
                    throw r0
            }

            public androidx.webkit.UserAgentMetadata.BrandVersion.Builder setMajorVersion(java.lang.String r3) {
                    r2 = this;
                    java.lang.String r0 = r3.trim()
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto Ld
                    r2.mMajorVersion = r3
                    return r2
                Ld:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "MajorVersion should not be blank."
                    r0.<init>(r1)
                    throw r0
            }
        }

        private BrandVersion(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.mBrand = r1
                r0.mMajorVersion = r2
                r0.mFullVersion = r3
                return
        }

        /* synthetic */ BrandVersion(java.lang.String r1, java.lang.String r2, java.lang.String r3, androidx.webkit.UserAgentMetadata.AnonymousClass1 r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof androidx.webkit.UserAgentMetadata.BrandVersion
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                r1 = r6
                androidx.webkit.UserAgentMetadata$BrandVersion r1 = (androidx.webkit.UserAgentMetadata.BrandVersion) r1
                java.lang.String r3 = r5.mBrand
                java.lang.String r4 = r1.mBrand
                boolean r3 = java.util.Objects.equals(r3, r4)
                if (r3 == 0) goto L2c
                java.lang.String r3 = r5.mMajorVersion
                java.lang.String r4 = r1.mMajorVersion
                boolean r3 = java.util.Objects.equals(r3, r4)
                if (r3 == 0) goto L2c
                java.lang.String r3 = r5.mFullVersion
                java.lang.String r4 = r1.mFullVersion
                boolean r3 = java.util.Objects.equals(r3, r4)
                if (r3 == 0) goto L2c
                goto L2d
            L2c:
                r0 = r2
            L2d:
                return r0
        }

        public java.lang.String getBrand() {
                r1 = this;
                java.lang.String r0 = r1.mBrand
                return r0
        }

        public java.lang.String getFullVersion() {
                r1 = this;
                java.lang.String r0 = r1.mFullVersion
                return r0
        }

        public java.lang.String getMajorVersion() {
                r1 = this;
                java.lang.String r0 = r1.mMajorVersion
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.mBrand
                java.lang.String r1 = r3.mMajorVersion
                java.lang.String r2 = r3.mFullVersion
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
                int r0 = java.util.Objects.hash(r0)
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r3.mBrand
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ","
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r2 = r3.mMajorVersion
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r3.mFullVersion
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static final class Builder {
        private java.lang.String mArchitecture;
        private int mBitness;
        private java.util.List<androidx.webkit.UserAgentMetadata.BrandVersion> mBrandVersionList;
        private java.lang.String mFullVersion;
        private boolean mMobile;
        private java.lang.String mModel;
        private java.lang.String mPlatform;
        private java.lang.String mPlatformVersion;
        private boolean mWow64;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mBrandVersionList = r0
                r0 = 1
                r1.mMobile = r0
                r0 = 0
                r1.mBitness = r0
                r1.mWow64 = r0
                return
        }

        public Builder(androidx.webkit.UserAgentMetadata r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mBrandVersionList = r0
                r0 = 1
                r1.mMobile = r0
                r0 = 0
                r1.mBitness = r0
                r1.mWow64 = r0
                java.util.List r0 = r2.getBrandVersionList()
                r1.mBrandVersionList = r0
                java.lang.String r0 = r2.getFullVersion()
                r1.mFullVersion = r0
                java.lang.String r0 = r2.getPlatform()
                r1.mPlatform = r0
                java.lang.String r0 = r2.getPlatformVersion()
                r1.mPlatformVersion = r0
                java.lang.String r0 = r2.getArchitecture()
                r1.mArchitecture = r0
                java.lang.String r0 = r2.getModel()
                r1.mModel = r0
                boolean r0 = r2.isMobile()
                r1.mMobile = r0
                int r0 = r2.getBitness()
                r1.mBitness = r0
                boolean r0 = r2.isWow64()
                r1.mWow64 = r0
                return
        }

        public androidx.webkit.UserAgentMetadata build() {
                r11 = this;
                androidx.webkit.UserAgentMetadata r0 = new androidx.webkit.UserAgentMetadata
                java.util.List<androidx.webkit.UserAgentMetadata$BrandVersion> r1 = r11.mBrandVersionList
                java.lang.String r2 = r11.mFullVersion
                java.lang.String r3 = r11.mPlatform
                java.lang.String r4 = r11.mPlatformVersion
                java.lang.String r5 = r11.mArchitecture
                java.lang.String r6 = r11.mModel
                boolean r7 = r11.mMobile
                int r8 = r11.mBitness
                boolean r9 = r11.mWow64
                r10 = 0
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r0
        }

        public androidx.webkit.UserAgentMetadata.Builder setArchitecture(java.lang.String r1) {
                r0 = this;
                r0.mArchitecture = r1
                return r0
        }

        public androidx.webkit.UserAgentMetadata.Builder setBitness(int r1) {
                r0 = this;
                r0.mBitness = r1
                return r0
        }

        public androidx.webkit.UserAgentMetadata.Builder setBrandVersionList(java.util.List<androidx.webkit.UserAgentMetadata.BrandVersion> r1) {
                r0 = this;
                r0.mBrandVersionList = r1
                return r0
        }

        public androidx.webkit.UserAgentMetadata.Builder setFullVersion(java.lang.String r3) {
                r2 = this;
                if (r3 != 0) goto L6
                r0 = 0
                r2.mFullVersion = r0
                return r2
            L6:
                java.lang.String r0 = r3.trim()
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L13
                r2.mFullVersion = r3
                return r2
            L13:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Full version should not be blank."
                r0.<init>(r1)
                throw r0
        }

        public androidx.webkit.UserAgentMetadata.Builder setMobile(boolean r1) {
                r0 = this;
                r0.mMobile = r1
                return r0
        }

        public androidx.webkit.UserAgentMetadata.Builder setModel(java.lang.String r1) {
                r0 = this;
                r0.mModel = r1
                return r0
        }

        public androidx.webkit.UserAgentMetadata.Builder setPlatform(java.lang.String r3) {
                r2 = this;
                if (r3 != 0) goto L6
                r0 = 0
                r2.mPlatform = r0
                return r2
            L6:
                java.lang.String r0 = r3.trim()
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L13
                r2.mPlatform = r3
                return r2
            L13:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Platform should not be blank."
                r0.<init>(r1)
                throw r0
        }

        public androidx.webkit.UserAgentMetadata.Builder setPlatformVersion(java.lang.String r1) {
                r0 = this;
                r0.mPlatformVersion = r1
                return r0
        }

        public androidx.webkit.UserAgentMetadata.Builder setWow64(boolean r1) {
                r0 = this;
                r0.mWow64 = r1
                return r0
        }
    }

    private UserAgentMetadata(java.util.List<androidx.webkit.UserAgentMetadata.BrandVersion> r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, int r9, boolean r10) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mMobile = r0
            r0 = 0
            r1.mBitness = r0
            r1.mWow64 = r0
            r1.mBrandVersionList = r2
            r1.mFullVersion = r3
            r1.mPlatform = r4
            r1.mPlatformVersion = r5
            r1.mArchitecture = r6
            r1.mModel = r7
            r1.mMobile = r8
            r1.mBitness = r9
            r1.mWow64 = r10
            return
    }

    /* synthetic */ UserAgentMetadata(java.util.List r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7, int r8, boolean r9, androidx.webkit.UserAgentMetadata.AnonymousClass1 r10) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof androidx.webkit.UserAgentMetadata
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            androidx.webkit.UserAgentMetadata r1 = (androidx.webkit.UserAgentMetadata) r1
            boolean r3 = r5.mMobile
            boolean r4 = r1.mMobile
            if (r3 != r4) goto L5c
            int r3 = r5.mBitness
            int r4 = r1.mBitness
            if (r3 != r4) goto L5c
            boolean r3 = r5.mWow64
            boolean r4 = r1.mWow64
            if (r3 != r4) goto L5c
            java.util.List<androidx.webkit.UserAgentMetadata$BrandVersion> r3 = r5.mBrandVersionList
            java.util.List<androidx.webkit.UserAgentMetadata$BrandVersion> r4 = r1.mBrandVersionList
            boolean r3 = java.util.Objects.equals(r3, r4)
            if (r3 == 0) goto L5c
            java.lang.String r3 = r5.mFullVersion
            java.lang.String r4 = r1.mFullVersion
            boolean r3 = java.util.Objects.equals(r3, r4)
            if (r3 == 0) goto L5c
            java.lang.String r3 = r5.mPlatform
            java.lang.String r4 = r1.mPlatform
            boolean r3 = java.util.Objects.equals(r3, r4)
            if (r3 == 0) goto L5c
            java.lang.String r3 = r5.mPlatformVersion
            java.lang.String r4 = r1.mPlatformVersion
            boolean r3 = java.util.Objects.equals(r3, r4)
            if (r3 == 0) goto L5c
            java.lang.String r3 = r5.mArchitecture
            java.lang.String r4 = r1.mArchitecture
            boolean r3 = java.util.Objects.equals(r3, r4)
            if (r3 == 0) goto L5c
            java.lang.String r3 = r5.mModel
            java.lang.String r4 = r1.mModel
            boolean r3 = java.util.Objects.equals(r3, r4)
            if (r3 == 0) goto L5c
            goto L5d
        L5c:
            r0 = r2
        L5d:
            return r0
    }

    public java.lang.String getArchitecture() {
            r1 = this;
            java.lang.String r0 = r1.mArchitecture
            return r0
    }

    public int getBitness() {
            r1 = this;
            int r0 = r1.mBitness
            return r0
    }

    public java.util.List<androidx.webkit.UserAgentMetadata.BrandVersion> getBrandVersionList() {
            r1 = this;
            java.util.List<androidx.webkit.UserAgentMetadata$BrandVersion> r0 = r1.mBrandVersionList
            return r0
    }

    public java.lang.String getFullVersion() {
            r1 = this;
            java.lang.String r0 = r1.mFullVersion
            return r0
    }

    public java.lang.String getModel() {
            r1 = this;
            java.lang.String r0 = r1.mModel
            return r0
    }

    public java.lang.String getPlatform() {
            r1 = this;
            java.lang.String r0 = r1.mPlatform
            return r0
    }

    public java.lang.String getPlatformVersion() {
            r1 = this;
            java.lang.String r0 = r1.mPlatformVersion
            return r0
    }

    public int hashCode() {
            r9 = this;
            java.util.List<androidx.webkit.UserAgentMetadata$BrandVersion> r0 = r9.mBrandVersionList
            java.lang.String r1 = r9.mFullVersion
            java.lang.String r2 = r9.mPlatform
            java.lang.String r3 = r9.mPlatformVersion
            java.lang.String r4 = r9.mArchitecture
            java.lang.String r5 = r9.mModel
            boolean r6 = r9.mMobile
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            int r7 = r9.mBitness
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r8 = r9.mWow64
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public boolean isMobile() {
            r1 = this;
            boolean r0 = r1.mMobile
            return r0
    }

    public boolean isWow64() {
            r1 = this;
            boolean r0 = r1.mWow64
            return r0
    }
}
