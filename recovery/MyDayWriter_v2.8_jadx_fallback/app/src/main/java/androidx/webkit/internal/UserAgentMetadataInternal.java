package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class UserAgentMetadataInternal {
    private static final java.lang.String ARCHITECTURE = "ARCHITECTURE";
    private static final java.lang.String BITNESS = "BITNESS";
    private static final int BRAND_VERSION_LENGTH = 3;
    private static final java.lang.String BRAND_VERSION_LIST = "BRAND_VERSION_LIST";
    private static final java.lang.String FULL_VERSION = "FULL_VERSION";
    private static final java.lang.String MOBILE = "MOBILE";
    private static final java.lang.String MODEL = "MODEL";
    private static final java.lang.String PLATFORM = "PLATFORM";
    private static final java.lang.String PLATFORM_VERSION = "PLATFORM_VERSION";
    private static final java.lang.String WOW64 = "WOW64";

    public UserAgentMetadataInternal() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.util.Map<java.lang.String, java.lang.Object> convertUserAgentMetadataToMap(androidx.webkit.UserAgentMetadata r3) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.List r1 = r3.getBrandVersionList()
            java.lang.String[][] r1 = getBrandVersionArray(r1)
            java.lang.String r2 = "BRAND_VERSION_LIST"
            r0.put(r2, r1)
            java.lang.String r1 = "FULL_VERSION"
            java.lang.String r2 = r3.getFullVersion()
            r0.put(r1, r2)
            java.lang.String r1 = "PLATFORM"
            java.lang.String r2 = r3.getPlatform()
            r0.put(r1, r2)
            java.lang.String r1 = "PLATFORM_VERSION"
            java.lang.String r2 = r3.getPlatformVersion()
            r0.put(r1, r2)
            java.lang.String r1 = "ARCHITECTURE"
            java.lang.String r2 = r3.getArchitecture()
            r0.put(r1, r2)
            java.lang.String r1 = "MODEL"
            java.lang.String r2 = r3.getModel()
            r0.put(r1, r2)
            boolean r1 = r3.isMobile()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "MOBILE"
            r0.put(r2, r1)
            int r1 = r3.getBitness()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "BITNESS"
            r0.put(r2, r1)
            boolean r1 = r3.isWow64()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "WOW64"
            r0.put(r2, r1)
            return r0
    }

    private static java.lang.String[][] getBrandVersionArray(java.util.List<androidx.webkit.UserAgentMetadata.BrandVersion> r7) {
            if (r7 == 0) goto L54
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L9
            goto L54
        L9:
            int r0 = r7.size()
            r1 = 2
            int[] r2 = new int[r1]
            r3 = 1
            r4 = 3
            r2[r3] = r4
            r4 = 0
            r2[r4] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r2)
            java.lang.String[][] r0 = (java.lang.String[][]) r0
            r2 = 0
        L20:
            int r5 = r7.size()
            if (r2 >= r5) goto L53
            r5 = r0[r2]
            java.lang.Object r6 = r7.get(r2)
            androidx.webkit.UserAgentMetadata$BrandVersion r6 = (androidx.webkit.UserAgentMetadata.BrandVersion) r6
            java.lang.String r6 = r6.getBrand()
            r5[r4] = r6
            r5 = r0[r2]
            java.lang.Object r6 = r7.get(r2)
            androidx.webkit.UserAgentMetadata$BrandVersion r6 = (androidx.webkit.UserAgentMetadata.BrandVersion) r6
            java.lang.String r6 = r6.getMajorVersion()
            r5[r3] = r6
            r5 = r0[r2]
            java.lang.Object r6 = r7.get(r2)
            androidx.webkit.UserAgentMetadata$BrandVersion r6 = (androidx.webkit.UserAgentMetadata.BrandVersion) r6
            java.lang.String r6 = r6.getFullVersion()
            r5[r1] = r6
            int r2 = r2 + 1
            goto L20
        L53:
            return r0
        L54:
            r0 = 0
            return r0
    }

    static androidx.webkit.UserAgentMetadata getUserAgentMetadataFromMap(java.util.Map<java.lang.String, java.lang.Object> r11) {
            androidx.webkit.UserAgentMetadata$Builder r0 = new androidx.webkit.UserAgentMetadata$Builder
            r0.<init>()
            java.lang.String r1 = "BRAND_VERSION_LIST"
            java.lang.Object r1 = r11.get(r1)
            if (r1 == 0) goto L42
            r2 = r1
            java.lang.String[][] r2 = (java.lang.String[][]) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.length
            r5 = 0
            r6 = r5
        L18:
            if (r6 >= r4) goto L3f
            r7 = r2[r6]
            androidx.webkit.UserAgentMetadata$BrandVersion$Builder r8 = new androidx.webkit.UserAgentMetadata$BrandVersion$Builder
            r8.<init>()
            r9 = r7[r5]
            androidx.webkit.UserAgentMetadata$BrandVersion$Builder r8 = r8.setBrand(r9)
            r9 = 1
            r9 = r7[r9]
            androidx.webkit.UserAgentMetadata$BrandVersion$Builder r8 = r8.setMajorVersion(r9)
            r9 = 2
            r9 = r7[r9]
            androidx.webkit.UserAgentMetadata$BrandVersion$Builder r8 = r8.setFullVersion(r9)
            androidx.webkit.UserAgentMetadata$BrandVersion r8 = r8.build()
            r3.add(r8)
            int r6 = r6 + 1
            goto L18
        L3f:
            r0.setBrandVersionList(r3)
        L42:
            java.lang.String r2 = "FULL_VERSION"
            java.lang.Object r2 = r11.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L4f
            r0.setFullVersion(r2)
        L4f:
            java.lang.String r3 = "PLATFORM"
            java.lang.Object r3 = r11.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L5c
            r0.setPlatform(r3)
        L5c:
            java.lang.String r4 = "PLATFORM_VERSION"
            java.lang.Object r4 = r11.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L69
            r0.setPlatformVersion(r4)
        L69:
            java.lang.String r5 = "ARCHITECTURE"
            java.lang.Object r5 = r11.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L76
            r0.setArchitecture(r5)
        L76:
            java.lang.String r6 = "MODEL"
            java.lang.Object r6 = r11.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L83
            r0.setModel(r6)
        L83:
            java.lang.String r7 = "MOBILE"
            java.lang.Object r7 = r11.get(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L94
            boolean r8 = r7.booleanValue()
            r0.setMobile(r8)
        L94:
            java.lang.String r8 = "BITNESS"
            java.lang.Object r8 = r11.get(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto La5
            int r9 = r8.intValue()
            r0.setBitness(r9)
        La5:
            java.lang.String r9 = "WOW64"
            java.lang.Object r9 = r11.get(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto Lb6
            boolean r10 = r9.booleanValue()
            r0.setWow64(r10)
        Lb6:
            androidx.webkit.UserAgentMetadata r10 = r0.build()
            return r10
    }
}
