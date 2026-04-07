package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
public final class FontRequest {
    private final java.util.List<java.util.List<byte[]>> mCertificates;
    private final int mCertificatesArray;
    private final java.lang.String mIdentifier;
    private final java.lang.String mProviderAuthority;
    private final java.lang.String mProviderPackage;
    private final java.lang.String mQuery;
    private final java.lang.String mSystemFont;
    private final java.lang.String mVariationSettings;

    public FontRequest(java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12) {
            r8 = this;
            r8.<init>()
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r9)
            java.lang.String r0 = (java.lang.String) r0
            r8.mProviderAuthority = r0
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r10)
            java.lang.String r0 = (java.lang.String) r0
            r8.mProviderPackage = r0
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r11)
            java.lang.String r0 = (java.lang.String) r0
            r8.mQuery = r0
            r0 = 0
            r8.mCertificates = r0
            if (r12 == 0) goto L22
            r1 = 1
            goto L23
        L22:
            r1 = 0
        L23:
            androidx.core.util.Preconditions.checkArgument(r1)
            r8.mCertificatesArray = r12
            r8.mSystemFont = r0
            r8.mVariationSettings = r0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.String r9 = r2.createIdentifier(r3, r4, r5, r6, r7)
            r2.mIdentifier = r9
            return
    }

    public FontRequest(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.List<java.util.List<byte[]>> r11) {
            r7 = this;
            r5 = 0
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public FontRequest(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.List<java.util.List<byte[]>> r11, java.lang.String r12, java.lang.String r13) {
            r7 = this;
            r7.<init>()
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r8)
            java.lang.String r0 = (java.lang.String) r0
            r7.mProviderAuthority = r0
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r9)
            java.lang.String r0 = (java.lang.String) r0
            r7.mProviderPackage = r0
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r10)
            java.lang.String r0 = (java.lang.String) r0
            r7.mQuery = r0
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r11)
            java.util.List r0 = (java.util.List) r0
            r7.mCertificates = r0
            r0 = 0
            r7.mCertificatesArray = r0
            r7.mSystemFont = r12
            r7.mVariationSettings = r13
            java.lang.String r6 = r7.mVariationSettings
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r12
            java.lang.String r8 = r1.createIdentifier(r2, r3, r4, r5, r6)
            r1.mIdentifier = r8
            return
    }

    private java.lang.String createIdentifier(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = "-"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.util.List<java.util.List<byte[]>> getCertificates() {
            r1 = this;
            java.util.List<java.util.List<byte[]>> r0 = r1.mCertificates
            return r0
    }

    public int getCertificatesArrayResId() {
            r1 = this;
            int r0 = r1.mCertificatesArray
            return r0
    }

    java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.mIdentifier
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String getIdentifier() {
            r1 = this;
            java.lang.String r0 = r1.mIdentifier
            return r0
    }

    public java.lang.String getProviderAuthority() {
            r1 = this;
            java.lang.String r0 = r1.mProviderAuthority
            return r0
    }

    public java.lang.String getProviderPackage() {
            r1 = this;
            java.lang.String r0 = r1.mProviderPackage
            return r0
    }

    public java.lang.String getQuery() {
            r1 = this;
            java.lang.String r0 = r1.mQuery
            return r0
    }

    public java.lang.String getSystemFont() {
            r1 = this;
            java.lang.String r0 = r1.mSystemFont
            return r0
    }

    public java.lang.String getVariationSettings() {
            r1 = this;
            java.lang.String r0 = r1.mVariationSettings
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "FontRequest {mProviderAuthority: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r6.mProviderAuthority
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", mProviderPackage: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r6.mProviderPackage
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", mQuery: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r6.mQuery
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", mSystemFont: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r6.mSystemFont
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", mVariationSettings: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r6.mVariationSettings
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", mCertificates:"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 0
        L54:
            java.util.List<java.util.List<byte[]>> r2 = r6.mCertificates
            int r2 = r2.size()
            if (r1 >= r2) goto L93
            java.lang.String r2 = " ["
            r0.append(r2)
            java.util.List<java.util.List<byte[]>> r2 = r6.mCertificates
            java.lang.Object r2 = r2.get(r1)
            java.util.List r2 = (java.util.List) r2
            r3 = 0
        L6a:
            int r4 = r2.size()
            if (r3 >= r4) goto L8b
            java.lang.String r4 = " \""
            r0.append(r4)
            java.lang.Object r4 = r2.get(r3)
            byte[] r4 = (byte[]) r4
            r5 = 0
            java.lang.String r5 = android.util.Base64.encodeToString(r4, r5)
            r0.append(r5)
            java.lang.String r5 = "\""
            r0.append(r5)
            int r3 = r3 + 1
            goto L6a
        L8b:
            java.lang.String r3 = " ]"
            r0.append(r3)
            int r1 = r1 + 1
            goto L54
        L93:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mCertificatesArray: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r6.mCertificatesArray
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }
}
