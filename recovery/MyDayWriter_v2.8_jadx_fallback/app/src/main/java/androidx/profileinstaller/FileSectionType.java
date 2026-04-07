package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
enum FileSectionType extends java.lang.Enum<androidx.profileinstaller.FileSectionType> {
    private static final /* synthetic */ androidx.profileinstaller.FileSectionType[] $VALUES = null;
    public static final androidx.profileinstaller.FileSectionType AGGREGATION_COUNT = null;
    public static final androidx.profileinstaller.FileSectionType CLASSES = null;
    public static final androidx.profileinstaller.FileSectionType DEX_FILES = null;
    public static final androidx.profileinstaller.FileSectionType EXTRA_DESCRIPTORS = null;
    public static final androidx.profileinstaller.FileSectionType METHODS = null;
    private final long mValue;

    private static /* synthetic */ androidx.profileinstaller.FileSectionType[] $values() {
            androidx.profileinstaller.FileSectionType r0 = androidx.profileinstaller.FileSectionType.DEX_FILES
            androidx.profileinstaller.FileSectionType r1 = androidx.profileinstaller.FileSectionType.EXTRA_DESCRIPTORS
            androidx.profileinstaller.FileSectionType r2 = androidx.profileinstaller.FileSectionType.CLASSES
            androidx.profileinstaller.FileSectionType r3 = androidx.profileinstaller.FileSectionType.METHODS
            androidx.profileinstaller.FileSectionType r4 = androidx.profileinstaller.FileSectionType.AGGREGATION_COUNT
            androidx.profileinstaller.FileSectionType[] r0 = new androidx.profileinstaller.FileSectionType[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            androidx.profileinstaller.FileSectionType r0 = new androidx.profileinstaller.FileSectionType
            r1 = 0
            r2 = 0
            java.lang.String r4 = "DEX_FILES"
            r0.<init>(r4, r1, r2)
            androidx.profileinstaller.FileSectionType.DEX_FILES = r0
            androidx.profileinstaller.FileSectionType r0 = new androidx.profileinstaller.FileSectionType
            r1 = 1
            r2 = 1
            java.lang.String r4 = "EXTRA_DESCRIPTORS"
            r0.<init>(r4, r1, r2)
            androidx.profileinstaller.FileSectionType.EXTRA_DESCRIPTORS = r0
            androidx.profileinstaller.FileSectionType r0 = new androidx.profileinstaller.FileSectionType
            r1 = 2
            r2 = 2
            java.lang.String r4 = "CLASSES"
            r0.<init>(r4, r1, r2)
            androidx.profileinstaller.FileSectionType.CLASSES = r0
            androidx.profileinstaller.FileSectionType r0 = new androidx.profileinstaller.FileSectionType
            r1 = 3
            r2 = 3
            java.lang.String r4 = "METHODS"
            r0.<init>(r4, r1, r2)
            androidx.profileinstaller.FileSectionType.METHODS = r0
            androidx.profileinstaller.FileSectionType r0 = new androidx.profileinstaller.FileSectionType
            r1 = 4
            r2 = 4
            java.lang.String r4 = "AGGREGATION_COUNT"
            r0.<init>(r4, r1, r2)
            androidx.profileinstaller.FileSectionType.AGGREGATION_COUNT = r0
            androidx.profileinstaller.FileSectionType[] r0 = $values()
            androidx.profileinstaller.FileSectionType.$VALUES = r0
            return
    }

    FileSectionType(java.lang.String r1, int r2, long r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mValue = r3
            return
    }

    static androidx.profileinstaller.FileSectionType fromValue(long r4) {
            androidx.profileinstaller.FileSectionType[] r0 = values()
            r1 = 0
        L5:
            int r2 = r0.length
            if (r1 >= r2) goto L18
            r2 = r0[r1]
            long r2 = r2.getValue()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L15
            r2 = r0[r1]
            return r2
        L15:
            int r1 = r1 + 1
            goto L5
        L18:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported FileSection Type "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static androidx.profileinstaller.FileSectionType valueOf(java.lang.String r1) {
            java.lang.Class<androidx.profileinstaller.FileSectionType> r0 = androidx.profileinstaller.FileSectionType.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            androidx.profileinstaller.FileSectionType r0 = (androidx.profileinstaller.FileSectionType) r0
            return r0
    }

    public static androidx.profileinstaller.FileSectionType[] values() {
            androidx.profileinstaller.FileSectionType[] r0 = androidx.profileinstaller.FileSectionType.$VALUES
            java.lang.Object r0 = r0.clone()
            androidx.profileinstaller.FileSectionType[] r0 = (androidx.profileinstaller.FileSectionType[]) r0
            return r0
    }

    public long getValue() {
            r2 = this;
            long r0 = r2.mValue
            return r0
    }
}
